package com.qf.jxfinance.service.impl;

import com.qf.jxfinance.common.util.StrKit;
import com.qf.jxfinance.dao.ContentMapper;
import com.qf.jxfinance.pojo.po.Content;
import com.qf.jxfinance.pojo.po.ContentExample;
import com.qf.jxfinance.service.ContentService;
import com.qf.jxfinance.common.jedis.JedisClient;
import com.qf.jxfinance.common.util.JsonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * User: DHC
 * Date: 2017/12/4
 * Time: 13:58
 * Version:V1.0
 */
@Service
public class ContentServiceImpl implements ContentService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ContentMapper contentDao;
    @Autowired
    private JedisClient jedisClient;

    @Override
    public List<Content> listContentsByCid(Long cid) {
        List<Content> contentList = null;
        //1 判断缓存，如果缓存中有数据直接返回
      try {
            String json = jedisClient.hget("CONTENT_LIST", cid + "");
            if (StrKit.notBlank(json)) {

                contentList = JsonUtils.jsonToList(json, Content.class);
                return contentList;
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage(), e);
        }

        /*//2 主业务：去数据库查询(如果没有的话，去数据库查询)
        //创建查询模板
        ContentExample example = new ContentExample();
        ContentExample.Criteria criteria = example.createCriteria();
        criteria.andCategoryIdEqualTo(cid);
        contentList = contentDao.selectByExampleWithBLOBs(example);*/
        //2 主业务：去数据库查询(如果没有的话，去数据库查询)
        ContentExample example = new ContentExample();
        ContentExample.Criteria criteria = example.createCriteria();
        criteria.andTypeEqualTo(1);
        contentList= contentDao.selectByExample(example);
        //3 从数据库中查询到以后，要添加的缓存服务器中
        try {
            //存入缓存的hash中
            jedisClient.hset("CONTENT_LIST", cid + "", JsonUtils.objectToJson(contentList));
            return contentList;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage(), e);
        }
        return contentList;
    }
}
