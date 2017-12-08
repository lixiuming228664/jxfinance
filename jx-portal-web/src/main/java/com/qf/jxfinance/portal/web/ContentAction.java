package com.qf.jxfinance.portal.web;

import org.springframework.stereotype.Controller;
/**
 * User: Lenovo
 * Date: 2017/12/4
 * Time: 19:59
 * Version:V1.0
 */
@Controller
public class ContentAction {
  /*  private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ContentService contentService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String listContentsByCid(Model model){
        try {
            //1 查询出结果
            Long cid = PropKit.use("ftp.properties").getLong("ftp.lunboId");
            //2 放入到model中
            List<TbContent> ad1List = contentService.listContentsByCid(cid);
            model.addAttribute("ad1List", ad1List);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage(), e);
        }
        //3 返回
        return "index";
    }*/

}
