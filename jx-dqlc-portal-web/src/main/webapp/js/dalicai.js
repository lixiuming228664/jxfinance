$(function() {
    var t = n = 0, count;
    var loadUrl = "/getPromotion?temp="+new Date().getTime();
    var loadUrlNew = "/getXblcList?temp="+new Date().getTime();
    $.ajax({
        url:loadUrl,
        type:"POST",
        dataType:"json",
        scriptCharset:"utf-8",
        success: function(result) {
            var top_banner = "";
            var banner_li="";
            $.each(result.recommendHomePageBannerVoList, function(index, obj) {
                var temp = index + 1;
                if(temp==1){
                    banner_li+="<li class='on'>1</li>";

                }else{
                    banner_li+="<li >"+temp+"</li>";
                }

                top_banner += "<a href='"+ obj.imageUrl + "' target='_blank' clstag='jr|keycount|zhdq|"+temp+"' psa='banner" + temp + "'><img src='" + obj.imageSrc +"' /></a>"
            });
            $('#banner_li').html(banner_li);
            $('#banner_list').html(top_banner);

            count = $("#banner_list a").length;
            $("#banner_list a:not(:first-child)").hide();
            $("#banner-lun li").click(function() {
                var i = $(this).text() - 1;
                n = i;
                if (i >= count) return;
                $("#banner_list a").filter(":visible").fadeOut(500).parent().children().eq(i).fadeIn(1000);
                document.getElementById("banner-lun").style.background = "";
                $(this).toggleClass("on");
                $(this).siblings().removeAttr("class");
            });
            t = setInterval(function() {
                n = n >= (count - 1) ? 0 : ++n;
                $("#banner-lun li").eq(n).trigger('click');
            }, 4000);
            $("#banner-lun").hover(function() {
                    clearInterval(t)
                },
                function() {
                    t = setInterval(function() {
                        n = n >= (count - 1) ? 0 : ++n;
                        $("#banner-lun li").eq(n).trigger('click');
                    }, 4000);
                });

            var banner_bo="";
            var sebox="";
            var jing="";
/*
            $.each(result.recommendHomePageSkuVoList, function(index, obj) {
                var temp = index + 1;
                if(temp==1){
                    banner_bo+="<p class='bo-title'>爆款推荐</p>"+
                    "<p class='bo-shuo'>"+obj.skuName+"</p>"+
                    "<p class='lv-qun'><span class='big-lv'>"+obj.financeRate+"</span><span class='big-fu'>%</span> </p>"+
                    "<p class='yu-shou'>历史年化投资回报率</p> <br/>"+
                    "<a href='"+obj.skuUrl+"' class='now-qiang' target='_blank' clstag='jr|keycount|zhdq|bkbuy' psa='bktj'>立即抢购</a>";

                }else if(temp==2){
                    sebox+="<div class='san-box'>"+
                    "<a href='"+obj.skuUrl+"' target='_blank' class='qi-title'>理财优选-期限"+obj.financeDate+"天</a>"+
                    "<div class='qi-xia'>"+
                    "<div class='qi-zuo'>"+
                    "<p class='bai-lv'>"+
                    "<span class='da-lv'>"+obj.financeRate+"</span>"+
                    "<span class='xiao-lv'>%</span>"+
                    "</p>"+
                    "<p class='yu-lv'>历史年化投资回报率</p>"+
                    "</div>"+
                    "<div class='qi-you'>"+
                    "<a href='"+obj.skuUrl+"' class='li-buy' target='_blank' clstag='jr|keycount|zhdq|dqgm' psa='dqyx'>立即抢购</a>"+
                        //"<a href='javascript:' node-type='termNo' data-value='1' class='more-cai' psa='gddq'>更多短期理财 ></a>"+
                    "</div></div></div>";
                }else if(temp==3){
                    sebox+="<div class='zhon-box'>"+
                    "<a href='"+obj.skuUrl+"' target='_blank' class='qi-title'>理财优选-期限"+obj.financeDate+"天</a>"+
                    "<div class='qi-xia'>"+
                    "<div class='qi-zuo'>"+
                    "<p class='bai-lv'>"+
                    "<span class='da-lv'>"+obj.financeRate+"</span>"+
                    "<span class='xiao-lv'>%</span>"+
                    "</p>"+
                    "<p class='yu-lv'>历史年化投资回报率</p>"+
                    "</div>"+
                    "<div class='qi-you'>"+
                    "<a href='"+obj.skuUrl+"' class='li-buy' target='_blank' clstag='jr|keycount|zhdq|zqgm' psa='zqyx'>立即抢购</a>"+
                        //"<a href='javascript:' node-type='termNo' data-value='2' class='more-cai' psa='gdzq'>更多中期理财 ></a>"+
                    "</div></div></div>";
                }else{
                    sebox+="<div class='san-box'>"+
                    "<a href='"+obj.skuUrl+"' target='_blank' class='qi-title'>理财优选-期限"+obj.financeDate+"天</a>"+
                    "<div class='qi-xia'>"+
                    "<div class='qi-zuo'>"+
                    "<p class='bai-lv'>"+
                    "<span class='da-lv'>"+obj.financeRate+"</span>"+
                    "<span class='xiao-lv'>%</span>"+
                    "</p>"+
                    "<p class='yu-lv'>历史年化投资回报率</p>"+
                    "</div>"+
                    "<div class='qi-you'>"+
                    "<a href='"+obj.skuUrl+"' class='li-buy' target='_blank' clstag='jr|keycount|zhdq|cqgm' psa='cqyx'>立即抢购</a>"+
                        //"<a href='javascript:' node-type='termNo' data-value='3' class='more-cai' psa='gdcq'>更多长期理财 ></a>"+
                    "</div></div> </div>";
                }
            });
*/
            $.each(result.recommendHomePageImageVoList, function(index, obj) {
                var temp = index + 1;
                if(temp<4){
                    jing+= "<a href='"+obj.imageUrl+"' target='_blank' class='si-one'>"+
                    "      <img src='" + obj.imageSrc+"' alt='' class='img-it'>"+
                    "      <div class='jian-gai'>"+
                    "          <p class='biao-ti'> "+
                    "              <span class='bai-xian'></span>  "+
                    "              <span class='zhon-zi'>"+obj.bizName+"</span>"+
                    "              <span class='bai-xian'></span>"+
                    "          </p>"+
                    "          <p class='da-zi'>"+obj.itemName+"</p>"+
                    "          <p class='er-zi'>"+obj.itemTip+"</p>"+
                    "          <p class='now-na' clstag='jr|keycount|zhdq|lcfw"+temp+"' psa='lcfw"+temp+"'>"+obj.imageButtonWord+"</p>"+
                    "      </div>"+
                    " </a>";
                }else {
                    jing+= "<a href='"+obj.imageUrl+"' target='_blank' class='si-ones' >"+
                    "      <img src='" + obj.imageSrc+"' alt='' class='img-it'>"+
                    "      <div class='jian-gai'>"+
                    "          <p class='biao-ti'> "+
                    "              <span class='bai-xian'></span>  "+
                    "              <span class='zhon-zi'>"+obj.bizName+"</span>"+
                    "              <span class='bai-xian'></span>"+
                    "          </p>"+
                    "          <p class='da-zi'>"+obj.itemName+"</p>"+
                    "          <p class='er-zi'>"+obj.itemTip+"</p>"+
                    "          <p class='now-na' clstag='jr|keycount|zhdq|lcfw4' psa='lcfw4'>"+obj.imageButtonWord+"</p>"+
                    "      </div>"+
                    " </a>";
                }
            });

            $('.banner-bo').html(banner_bo);
            $('.second-line').html(sebox);
            $('.si-zon').html(jing);
        }
    });


    $.ajax({
        url:loadUrlNew,
        type:"POST",
        dataType:"json",
        scriptCharset:"utf-8",
        success: function(result) {

            var banner_bo="";
            var sebox="";
            $.each(result, function(index, obj) {
                var temp = index + 1;
                if(temp==1){
                    banner_bo+="<p class='bo-title'>爆款推荐</p>"+
                        "<p class='bo-shuo'>"+obj.skuName+"</p>"+
                        "<p class='lv-qun'><span class='big-lv'>"+obj.itemYield+"</span><span class='big-fu'>%</span> </p>"+
                        "<p class='yu-shou'>"+obj.rateDesc+"</p> <br/>"+
                        "<a href='"+obj.url+"' class='now-qiang' target='_blank' clstag='jr|keycount|zhdq|bkbuy' psa='bktj'>立即抢购</a>";

                }else if(temp==2){
                    sebox+="<div class='san-box'>"+
                        "<a href='"+obj.url+"' target='_blank' class='qi-title'>理财优选-期限"+obj.productTerm+"天</a>"+
                        "<div class='qi-xia'>"+
                        "<div class='qi-zuo'>"+
                        "<p class='bai-lv'>"+
                        "<span class='da-lv'>"+obj.itemYield+"</span>"+
                        "<span class='xiao-lv'>%</span>"+
                        "</p>"+
                        "<p class='yu-lv'>"+obj.rateDesc+"</p>"+
                        "</div>"+
                        "<div class='qi-you'>"+
                        "<a href='"+obj.url+"' class='li-buy' target='_blank' clstag='jr|keycount|zhdq|dqgm' psa='dqyx'>立即抢购</a>"+
                            //"<a href='javascript:' node-type='termNo' data-value='1' class='more-cai' psa='gddq'>更多短期理财 ></a>"+
                        "</div></div></div>";
                }else if(temp==3){
                    sebox+="<div class='zhon-box'>"+
                        "<a href='"+obj.url+"' target='_blank' class='qi-title'>理财优选-期限"+obj.productTerm+"天</a>"+
                        "<div class='qi-xia'>"+
                        "<div class='qi-zuo'>"+
                        "<p class='bai-lv'>"+
                        "<span class='da-lv'>"+obj.itemYield+"</span>"+
                        "<span class='xiao-lv'>%</span>"+
                        "</p>"+
                        "<p class='yu-lv'>"+obj.rateDesc+"</p>"+
                        "</div>"+
                        "<div class='qi-you'>"+
                        "<a href='"+obj.url+"' class='li-buy' target='_blank' clstag='jr|keycount|zhdq|zqgm' psa='zqyx'>立即抢购</a>"+
                            //"<a href='javascript:' node-type='termNo' data-value='2' class='more-cai' psa='gdzq'>更多中期理财 ></a>"+
                        "</div></div></div>";
                }else{
                    sebox+="<div class='san-box'>"+
                        "<a href='"+obj.url+"' target='_blank' class='qi-title'>理财优选-期限"+obj.productTerm+"天</a>"+
                        "<div class='qi-xia'>"+
                        "<div class='qi-zuo'>"+
                        "<p class='bai-lv'>"+
                        "<span class='da-lv'>"+obj.itemYield+"</span>"+
                        "<span class='xiao-lv'>%</span>"+
                        "</p>"+
                        "<p class='yu-lv'>"+obj.rateDesc+"</p>"+
                        "</div>"+
                        "<div class='qi-you'>"+
                        "<a href='"+obj.url+"' class='li-buy' target='_blank' clstag='jr|keycount|zhdq|cqgm' psa='cqyx'>立即抢购</a>"+
                            //"<a href='javascript:' node-type='termNo' data-value='3' class='more-cai' psa='gdcq'>更多长期理财 ></a>"+
                        "</div></div> </div>";
                }
            });
            $('.banner-bo').html(banner_bo);
            $('.second-line').html(sebox);
        }
    });

});