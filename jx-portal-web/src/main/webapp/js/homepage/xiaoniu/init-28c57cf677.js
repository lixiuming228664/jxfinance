define("portal/index2016/js/init",["./operating","../../../plugIn/easy-ticker/jquery.easy-ticker.min","../../../plugIn/poshytip-1.2/src/jquery.poshytip","../../../module/common/countdown","../../../module/common/slide","../../../module/eSignature/js/init"],function(t,i,e){function s(t){new h("#streamerModel .banner","#streamerModel .banner>li",{slideWidth:t,slideHeight:442,slideDirection:0,slideSeries:1,slides_auto_span:5e3,slideButs_bindsj:"mouseover",slideButs:"#streamerModel .slider .but",slides_to_l:"#streamerModel .slider .s-l",slides_to_r:"#streamerModel .slider .s-r",slides_fun:h.definedfun})}function n(){var t=$(window).width(),i=y.html();_.bannerTemplate=i;var e=y.find("li");e.width(t),s(t)}function o(){var t=$("#noticeModel"),i=t.find(".ticker"),e=i.find("ul").find("li");e.length>1&&i.easyTicker({direction:"up",speed:"slow",interval:5e3,height:"50px",visible:1,mousePause:0,controls:{up:".control-up",down:".control-down"}}).data("easyTicker")}function a(){$.ajax({type:"get",url:"/common/query/position/ad/"+_.onlineAdvertisingKeys,success:function(t){for(var i=t||[],e=0,s=i.length;e<s;e++){var o=i[e]||{},a=o.adPositionDTO||{},l=o.positionItemDTOList||[],p=a.width,d=a.height,u=a.showType,h=a.hotKey,c=b.find("div.img-box[data-key="+h+"]").find("ul");"SYdb01"==h?c=w.find("div.top-box[data-key="+h+"]").find("ul"):"SYbanner01"==h&&(c=v.find("#banner"));for(var g=0,f=l.length;g<f;g++){var m=l[g]||{};"SYdb01"==h?m.imagePath&&(w.slideDown(),c.append('<li><a target="_blank" href="'+m.href+'22" style="background:url('+_.staticPath+m.imagePath+') center center no-repeat" > </a></li>')):"SYbanner01"==h?m.imagePath&&c.append('<li style="background:url('+_.staticPath+m.imagePath+') center center no-repeat;background-size: cover;"><a href="'+m.href+'" target="_blank"></a></li>'):m.imagePath&&c.append('<li><a target="_blank" href="'+m.href+'"><img width="'+p+'px" height="'+d+'px" src="'+(_.staticPath+m.imagePath)+'" /></a></li>')}2==u&&("SYbanner01"==h?n():r(c,p,d))}},error:function(t){console.log(t)}})}function r(t,i,e){new h(t,t.find("li"),{slideWidth:i,slideHeight:e,slideDirection:1,slides_auto_span:2e3})}function l(){var t=[296,388,480,573,666,759,852,945,1039];$(window).resize(function(){var t=$(window).width();y.html(_.bannerTemplate).find("li").width(t),s(t)}),v.on("mouseenter",function(){$(this).find(".sarr").fadeIn()}).on("mouseleave",function(){$(this).find(".sarr").fadeOut()}),f.on("mouseenter","li",function(i){var e=$(this),s=e.index(),n=e.data("type");f.find(".sliding").stop(!0,!0).animate({left:t[s]+"px"},150,function(){e.addClass("active").siblings().removeClass("active"),f.find(".items").filter("[data-type="+n+"]").removeClass("g-dn").siblings(".items").addClass("g-dn")})}),g.on("mouseenter","li",function(i){var e=$(this),s=e.index(),n=e.data("type");g.find(".sliding").stop(!0,!0).animate({left:t[s]+"px"},150,function(){e.addClass("active").siblings().removeClass("active"),g.find(".items").filter("[data-type="+n+"]").removeClass("g-dn").siblings(".items").addClass("g-dn"),2==n?g.find(".content").removeClass("border"):g.find(".content").addClass("border")})}),$(".text-tag,.tips").poshytip({alignTo:"target",alignX:"inner-left",alignY:"top",offsetX:0,offsetY:8})}function p(){m.find(".item").find("span.time").add(g.find(".item,.item-new").find("span.time")).add(f.find(".item").find("span.time")).each(function(){var t=$(this),i=1e3*(null==t.attr("data-conutdown")||"null"==t.attr("data-conutdown")?0:t.attr("data-conutdown"))+2e3,e=setInterval(function(){if(i-=1e3,i>0)t.text(u.time(i));else{var s=t.attr("data-target");t.next(".time-label").remove(),t.after(s),t.parent().removeClass("relativeLeft"),t.remove(),clearInterval(e)}},1e3)})}function d(){for(var t=$('.tag:has(".text-tag")'),i=0;i<t.length;i++)for(var e=$(".text-tag",t[i]),s=5;s<e.length;s++)$(e[s]).remove()}t("./operating"),t("../../../plugIn/easy-ticker/jquery.easy-ticker.min"),t("../../../plugIn/poshytip-1.2/src/jquery.poshytip");var u=t("../../../module/common/countdown"),h=t("../../../module/common/slide"),c=t("../../../module/eSignature/js/init"),g=$("#fixedModel"),f=$("#flexibleModel"),m=$("#noviceModel"),v=$("#streamerModel"),b=$("#onlineModel"),w=$("#headerTop"),y=$("#streamerModel").find(".slider"),_=($("#onlineserviceModel"),"true"==$("#isLogin").val()?1:0,{staticPath:"//image.xiaoniu88.com",bannerTemplate:"",onlineAdvertisingKeys:"SYbanner01|SYxn01|SYxn02|SYxn03|SYdb01"});!function(){c.checkSignature(),o(),a(),p(),l(),d()}()}),define("portal/index2016/js/operating",["../../../plugIn/count/init"],function(t,i,e){function s(){r.find("dt.count").each(function(){var t=$(this),i=t.attr("data-value"),e=t.attr("data-time");t.find("label").each(function(){var t=$(this),s=t.attr("data-multiple"),n=t.attr("data-radix");t.attr("data-to",Math.floor(s?i%s/n:i/n)).countTo({speed:e,refreshInterval:60})})}),setTimeout(function(){r.find("div.mask").fadeOut(function(){$(this).remove()})},1e3)}function n(){$.ajax({type:"get",url:"/common/query/position/ad/"+a.guideAdvertisingKeys,success:function(t){for(var i=t||[],e=0,s=i.length;e<s;e++){for(var n=i[e]||{},a=n.adPositionDTO||{},r=n.positionItemDTOList||{},p=a.width,d=a.height,u=a.showType,h=a.hotKey,c=l.find("div.box[data-key="+h+"]").find("ul"),g=0,f=r.length;g<f;g++){var m=r[g]||{};c.append('<li><a target="_blank" href="'+m.href+'"><img width="'+p+'px" height="'+d+'px" src="//image.xiaoniu88.com/'+m.imagePath+'" /><div class="mask"></div></a></li>')}2==u&&o(c,p,d)}},error:function(t){console.log(t)}})}function o(t,i,e){new slide(t,t.find("li"),{slideWidth:i,slideHeight:e,slideDirection:1,slides_auto_span:2e3})}t("../../../plugIn/count/init");var a={guideAdvertisingKeys:"SYad06|SYad07"},r=$("#statisticalModel"),l=$("#microModel");!function(){s(),n()}()}),define("plugIn/count/init",[],function(t,i,e){function s(t,i){return t.toFixed(i.decimals)}function n(t){var i=$(this);t=$.extend({},t||{},i.data("countToOptions")||{}),i.countTo(t)}$.fn.countTo=function(t){return t=t||{},$(this).each(function(){function i(){p+=r,l++,e(p),"function"==typeof o.onUpdate&&o.onUpdate.call(s,p),l>=a&&(n.removeData("countTo"),clearInterval(d.interval),p=o.to,"function"==typeof o.onComplete&&o.onComplete.call(s,p))}function e(t){var i=o.formatter.call(s,t,o);n.html(i)}var s=this,n=$(this),o=$.extend({},$.fn.countTo.defaults,{from:Number(n.attr("data-from")),to:Number(n.attr("data-to")),speed:Number(n.attr("data-speed")),refreshInterval:Number(n.attr("data-refresh-interval")),decimals:Number(n.attr("data-decimals"))},t),a=Math.ceil(o.speed/o.refreshInterval),r=(o.to-o.from)/a,l=0,p=o.from,d=n.data("countTo")||{};n.data("countTo",d),d.interval&&clearInterval(d.interval),d.interval=setInterval(i,o.refreshInterval),e(p)})},$.fn.countTo.defaults={from:0,to:0,speed:1e3,refreshInterval:100,decimals:0,formatter:s,onUpdate:null,onComplete:null},$("#count-number").data("countToOptions",{formatter:function(t,i){return t.toFixed(i.decimals).replace(/\B(?=(?:\d{3})+(?!\d))/g,",")}}),$(".timer").each(n)}),define("plugIn/easy-ticker/jquery.easy-ticker.min",[],function(t,i,e){!function(t,i,e,s){function n(s,n){function o(){g.elem.children().css("margin",0).children().css("margin",0),g.elem.css({position:"relative",height:g.opts.height,overflow:"hidden"}),g.targ.css({position:"absolute",margin:0}),setInterval(function(){c()},100)}function r(){g.timer=setInterval(function(){1==g.winFocus&&p(g.opts.direction)},g.opts.interval),t(g.opts.controls.toggle).addClass("et-run").html(g.opts.controls.stopText)}function l(){clearInterval(g.timer),g.timer=0,t(g.opts.controls.toggle).removeClass("et-run").html(g.opts.controls.playText)}function p(t){var i,e,s;if(g.elem.is(":visible")){"up"==t?(i=":first-child",e="-=",s="appendTo"):(i=":last-child",e="+=",s="prependTo");var n=g.targ.children(i),o=n.outerHeight();g.targ.stop(!0,!0).animate({top:e+o+"px"},g.opts.speed,g.opts.easing,function(){n.hide()[s](g.targ).fadeIn(),g.targ.css("top",0),c()})}}function d(t){l(),p("up"==t?"up":"down")}function u(){var i=0,e=g.elem.css("display");g.elem.css("display","block"),g.targ.children().each(function(){i+=t(this).outerHeight()}),g.elem.css({display:e,height:i})}function h(i){var e=0;g.targ.children(":lt("+g.opts.visible+")").each(function(){e+=t(this).outerHeight()}),1==i?g.elem.stop(!0,!0).animate({height:e},g.opts.speed):g.elem.css("height",e)}function c(){"auto"==g.opts.height&&0!=g.opts.visible?(anim="init"==arguments.callee.caller.name?0:1,h(anim)):"auto"==g.opts.height&&u()}var g=this;return g.opts=t.extend({},a,n),g.elem=t(s),g.targ=t(s).children(":first-child"),g.timer=0,g.mHover=0,g.winFocus=1,o(),r(),t([i,e]).off("focus.jqet").on("focus.jqet",function(){g.winFocus=1}).off("blur.jqet").on("blur.jqet",function(){g.winFocus=0}),1==g.opts.mousePause&&g.elem.mouseenter(function(){g.timerTemp=g.timer,l()}).mouseleave(function(){0!==g.timerTemp&&r()}),t(g.opts.controls.up).on("click",function(t){t.preventDefault(),d("up")}),t(g.opts.controls.down).on("click",function(t){t.preventDefault(),d("down")}),t(g.opts.controls.toggle).on("click",function(t){t.preventDefault(),0==g.timer?r():l()}),{up:function(){d("up")},down:function(){d("down")},start:r,stop:l,options:g.opts}}var o="easyTicker",a={direction:"up",easing:"swing",speed:"slow",interval:2e3,height:"auto",visible:0,mousePause:1,controls:{up:"",down:"",toggle:"",playText:"Play",stopText:"Stop"}};t.fn[o]=function(i){return this.each(function(){t.data(this,o)||t.data(this,o,new n(this,i))})}}(jQuery,window,document)}),define("plugIn/poshytip-1.2/src/jquery.poshytip",[],function(t,i,e){!function(t){function i(){t.each(e,function(){this.refresh(!0)})}var e=[],s=/^url\(["']?([^"'\)]*)["']?\);?$/i,n=/\.png$/i,o=!!window.createPopup&&"undefined"==document.documentElement.currentStyle.minWidth;t(window).resize(i),t.Poshytip=function(i,e){this.$elm=t(i),this.opts=t.extend({},t.fn.poshytip.defaults,e),this.$tip=t(['<div class="',this.opts.className,'">','<div class="tip-inner tip-bg-image"></div>','<div class="tip-arrow tip-arrow-top tip-arrow-right tip-arrow-bottom tip-arrow-left"></div>',"</div>"].join("")).appendTo(document.body),this.$arrow=this.$tip.find("div.tip-arrow"),this.$inner=this.$tip.find("div.tip-inner"),this.disabled=!1,this.content=null,this.init()},t.Poshytip.prototype={init:function(){e.push(this);var i=this.$elm.attr("title");if(this.$elm.data("title.poshytip",void 0!==i?i:null).data("poshytip",this),"none"!=this.opts.showOn)switch(this.$elm.bind({"mouseenter.poshytip":t.proxy(this.mouseenter,this),"mouseleave.poshytip":t.proxy(this.mouseleave,this)}),this.opts.showOn){case"hover":"cursor"==this.opts.alignTo&&this.$elm.bind("mousemove.poshytip",t.proxy(this.mousemove,this)),this.opts.allowTipHover&&this.$tip.hover(t.proxy(this.clearTimeouts,this),t.proxy(this.mouseleave,this));break;case"focus":this.$elm.bind({"focus.poshytip":t.proxy(this.showDelayed,this),"blur.poshytip":t.proxy(this.hideDelayed,this)})}},mouseenter:function(t){return!!this.disabled||(this.$elm.attr("title",""),"focus"==this.opts.showOn||void this.showDelayed())},mouseleave:function(t){if(this.disabled||this.asyncAnimating&&(this.$tip[0]===t.relatedTarget||jQuery.contains(this.$tip[0],t.relatedTarget)))return!0;if(!this.$tip.data("active")){var i=this.$elm.data("title.poshytip");null!==i&&this.$elm.attr("title",i)}return"focus"==this.opts.showOn||void this.hideDelayed()},mousemove:function(t){return!!this.disabled||(this.eventX=t.pageX,this.eventY=t.pageY,void(this.opts.followCursor&&this.$tip.data("active")&&(this.calcPos(),this.$tip.css({left:this.pos.l,top:this.pos.t}),this.pos.arrow&&(this.$arrow[0].className="tip-arrow tip-arrow-"+this.pos.arrow))))},show:function(){this.disabled||this.$tip.data("active")||(this.reset(),this.update(),this.content&&(this.display(),this.opts.timeOnScreen&&this.hideDelayed(this.opts.timeOnScreen)))},showDelayed:function(i){this.clearTimeouts(),this.showTimeout=setTimeout(t.proxy(this.show,this),"number"==typeof i?i:this.opts.showTimeout)},hide:function(){!this.disabled&&this.$tip.data("active")&&this.display(!0)},hideDelayed:function(i){this.clearTimeouts(),this.hideTimeout=setTimeout(t.proxy(this.hide,this),"number"==typeof i?i:this.opts.hideTimeout)},reset:function(){this.$tip.queue([]).detach().css("visibility","hidden").data("active",!1),this.$inner.find("*").poshytip("hide"),this.opts.fade&&this.$tip.css("opacity",this.opacity),this.$arrow[0].className="tip-arrow tip-arrow-top tip-arrow-right tip-arrow-bottom tip-arrow-left",this.asyncAnimating=!1},update:function(t,i){if(!this.disabled){var e=void 0!==t;if(e){if(i||(this.opts.content=t),!this.$tip.data("active"))return}else t=this.opts.content;var s=this,n="function"==typeof t?t.call(this.$elm[0],function(t){s.update(t)}):"[title]"==t?this.$elm.data("title.poshytip"):t;this.content!==n&&(this.$inner.empty().append(n),this.content=n),this.refresh(e)}},refresh:function(i){if(!this.disabled){if(i){if(!this.$tip.data("active"))return;var e={left:this.$tip.css("left"),top:this.$tip.css("top")}}this.$tip.css({left:0,top:0}).appendTo(document.body),void 0===this.opacity&&(this.opacity=this.$tip.css("opacity"));var a=this.$tip.css("background-image").match(s),r=this.$arrow.css("background-image").match(s);if(a){var l=n.test(a[1]);o&&l?(this.$tip.css("background-image","none"),this.$inner.css({margin:0,border:0,padding:0}),a=l=!1):this.$tip.prepend('<table class="tip-table" border="0" cellpadding="0" cellspacing="0"><tr><td class="tip-top tip-bg-image" colspan="2"><span></span></td><td class="tip-right tip-bg-image" rowspan="2"><span></span></td></tr><tr><td class="tip-left tip-bg-image" rowspan="2"><span></span></td><td></td></tr><tr><td class="tip-bottom tip-bg-image" colspan="2"><span></span></td></tr></table>').css({border:0,padding:0,"background-image":"none","background-color":"transparent"}).find(".tip-bg-image").css("background-image",'url("'+a[1]+'")').end().find("td").eq(3).append(this.$inner),l&&!t.support.opacity&&(this.opts.fade=!1)}r&&!t.support.opacity&&(o&&n.test(r[1])&&(r=!1,this.$arrow.css("background-image","none")),this.opts.fade=!1);var p=this.$tip.find("> table.tip-table");if(o){this.$tip[0].style.width="",p.width("auto").find("td").eq(3).width("auto");var d=this.$tip.width(),u=parseInt(this.$tip.css("min-width")),h=parseInt(this.$tip.css("max-width"));!isNaN(u)&&d<u?d=u:!isNaN(h)&&d>h&&(d=h),this.$tip.add(p).width(d).eq(0).find("td").eq(3).width("100%")}else p[0]&&p.width("auto").find("td").eq(3).width("auto").end().end().width(document.defaultView&&document.defaultView.getComputedStyle&&parseFloat(document.defaultView.getComputedStyle(this.$tip[0],null).width)||this.$tip.width()).find("td").eq(3).width("100%");if(this.tipOuterW=this.$tip.outerWidth(),this.tipOuterH=this.$tip.outerHeight(),this.calcPos(),r&&this.pos.arrow&&(this.$arrow[0].className="tip-arrow tip-arrow-"+this.pos.arrow,this.$arrow.css("visibility","inherit")),i&&this.opts.refreshAniDuration){this.asyncAnimating=!0;var c=this;this.$tip.css(e).animate({left:this.pos.l,top:this.pos.t},this.opts.refreshAniDuration,function(){c.asyncAnimating=!1})}else this.$tip.css({left:this.pos.l,top:this.pos.t})}},display:function(i){var e=this.$tip.data("active");if(!(e&&!i||!e&&i)){if(this.$tip.stop(),(this.opts.slide&&this.pos.arrow||this.opts.fade)&&(i&&this.opts.hideAniDuration||!i&&this.opts.showAniDuration)){var s={},n={};if(this.opts.slide&&this.pos.arrow){var o,a;"bottom"==this.pos.arrow||"top"==this.pos.arrow?(o="top",a="bottom"):(o="left",a="right");var r=parseInt(this.$tip.css(o));s[o]=r+(i?0:this.pos.arrow==a?-this.opts.slideOffset:this.opts.slideOffset),n[o]=r+(i?this.pos.arrow==a?this.opts.slideOffset:-this.opts.slideOffset:0)+"px"}this.opts.fade&&(s.opacity=i?this.$tip.css("opacity"):0,n.opacity=i?0:this.opacity),this.$tip.css(s).animate(n,this.opts[i?"hideAniDuration":"showAniDuration"])}if(i?this.$tip.queue(t.proxy(this.reset,this)):this.$tip.css("visibility","inherit"),e){var l=this.$elm.data("title.poshytip");null!==l&&this.$elm.attr("title",l)}this.$tip.data("active",!e)}},disable:function(){this.reset(),this.disabled=!0},enable:function(){this.disabled=!1},destroy:function(){this.reset(),this.$tip.remove(),delete this.$tip,this.content=null,this.$elm.unbind(".poshytip").removeData("title.poshytip").removeData("poshytip"),e.splice(t.inArray(this,e),1)},clearTimeouts:function(){this.showTimeout&&(clearTimeout(this.showTimeout),this.showTimeout=0),this.hideTimeout&&(clearTimeout(this.hideTimeout),this.hideTimeout=0)},calcPos:function(){var i,e,s,n,o,a,r={l:0,t:0,arrow:""},l=t(window),p={l:l.scrollLeft(),t:l.scrollTop(),w:l.width(),h:l.height()};if("cursor"==this.opts.alignTo)i=e=s=this.eventX,n=o=a=this.eventY;else{var d=this.$elm.offset(),u={l:d.left,t:d.top,w:this.$elm.outerWidth(),h:this.$elm.outerHeight()};i=u.l+("inner-right"!=this.opts.alignX?0:u.w),e=i+Math.floor(u.w/2),s=i+("inner-left"!=this.opts.alignX?u.w:0),n=u.t+("inner-bottom"!=this.opts.alignY?0:u.h),o=n+Math.floor(u.h/2),a=n+("inner-top"!=this.opts.alignY?u.h:0)}switch(this.opts.alignX){case"right":case"inner-left":r.l=s+this.opts.offsetX,this.opts.keepInViewport&&r.l+this.tipOuterW>p.l+p.w&&(r.l=p.l+p.w-this.tipOuterW),"right"!=this.opts.alignX&&"center"!=this.opts.alignY||(r.arrow="left");break;case"center":r.l=e-Math.floor(this.tipOuterW/2),this.opts.keepInViewport&&(r.l+this.tipOuterW>p.l+p.w?r.l=p.l+p.w-this.tipOuterW:r.l<p.l&&(r.l=p.l));break;default:r.l=i-this.tipOuterW-this.opts.offsetX,this.opts.keepInViewport&&r.l<p.l&&(r.l=p.l),"left"!=this.opts.alignX&&"center"!=this.opts.alignY||(r.arrow="right")}switch(this.opts.alignY){case"bottom":case"inner-top":r.t=a+this.opts.offsetY,r.arrow&&"cursor"!=this.opts.alignTo||(r.arrow="top"),this.opts.keepInViewport&&r.t+this.tipOuterH>p.t+p.h&&(r.t=n-this.tipOuterH-this.opts.offsetY,"top"==r.arrow&&(r.arrow="bottom"));break;case"center":r.t=o-Math.floor(this.tipOuterH/2),this.opts.keepInViewport&&(r.t+this.tipOuterH>p.t+p.h?r.t=p.t+p.h-this.tipOuterH:r.t<p.t&&(r.t=p.t));break;default:r.t=n-this.tipOuterH-this.opts.offsetY,r.arrow&&"cursor"!=this.opts.alignTo||(r.arrow="bottom"),this.opts.keepInViewport&&r.t<p.t&&(r.t=a+this.opts.offsetY,"bottom"==r.arrow&&(r.arrow="top"))}this.pos=r}},t.fn.poshytip=function(i){if("string"==typeof i){var e=arguments,s=i;return Array.prototype.shift.call(e),"destroy"==s&&(this.die?this.die("mouseenter.poshytip").die("focus.poshytip"):t(document).undelegate(this.selector,"mouseenter.poshytip").undelegate(this.selector,"focus.poshytip")),this.each(function(){var i=t(this).data("poshytip");i&&i[s]&&i[s].apply(i,e)})}var n=t.extend({},t.fn.poshytip.defaults,i);if(t("#poshytip-css-"+n.className)[0]||t(['<style id="poshytip-css-',n.className,'" type="text/css">',"div.",n.className,"{visibility:hidden;position:absolute;top:0;left:0;}","div.",n.className," table.tip-table, div.",n.className," table.tip-table td{margin:0;font-family:inherit;font-size:inherit;font-weight:inherit;font-style:inherit;font-variant:inherit;vertical-align:middle;}","div.",n.className," td.tip-bg-image span{display:block;font:1px/1px sans-serif;height:",n.bgImageFrameSize,"px;width:",n.bgImageFrameSize,"px;overflow:hidden;}","div.",n.className," td.tip-right{background-position:100% 0;}","div.",n.className," td.tip-bottom{background-position:100% 100%;}","div.",n.className," td.tip-left{background-position:0 100%;}","div.",n.className," div.tip-inner{background-position:-",n.bgImageFrameSize,"px -",n.bgImageFrameSize,"px;}","div.",n.className," div.tip-arrow{visibility:hidden;position:absolute;overflow:hidden;font:1px/1px sans-serif;}","</style>"].join("")).appendTo("head"),n.liveEvents&&"none"!=n.showOn){var o,a=t.extend({},n,{liveEvents:!1});switch(n.showOn){case"hover":o=function(){var i=t(this);i.data("poshytip")||i.poshytip(a).poshytip("mouseenter")},this.live?this.live("mouseenter.poshytip",o):t(document).delegate(this.selector,"mouseenter.poshytip",o);break;case"focus":o=function(){var i=t(this);i.data("poshytip")||i.poshytip(a).poshytip("showDelayed")},this.live?this.live("focus.poshytip",o):t(document).delegate(this.selector,"focus.poshytip",o)}return this}return this.each(function(){new t.Poshytip(this,n)})},t.fn.poshytip.defaults={content:"[title]",className:"tip-yellow",bgImageFrameSize:10,showTimeout:500,hideTimeout:100,timeOnScreen:0,showOn:"hover",liveEvents:!1,alignTo:"cursor",alignX:"right",alignY:"top",offsetX:-22,offsetY:18,keepInViewport:!0,allowTipHover:!0,followCursor:!1,fade:!0,slide:!0,slideOffset:8,showAniDuration:300,hideAniDuration:300,refreshAniDuration:200}}(jQuery)}),define("module/common/countdown",[],function(t,i,e){function s(t,i){return(Array(i).join(0)+t).slice(-i)}i.countdown=function(t,i,e){var s=function(t){var t=parseInt(t),i=86400,e=i/24,s=e/60,n="";if(t>0){var o=parseInt(t/i);n+=o>0?o+"天":"";var a=parseInt((t-o*i)/e);n+=a>0?a+"时":o>0?"0时":"";var r=parseInt((t-o*i-e*a)/s);n+=r>0?r+"分":o>0||a>0?"0分":"";var l=t-o*i-e*a-r*s;n+=l+"秒"}return n},n=function(){$(t).each(function(){var t=$(this).attr("data-conutdown");if(t>=0){var n=s(t)+i;0==t?e():($(this).html(n),$(this).attr("data-conutdown",t-1))}})};return n(),window.setInterval(function(){n()},1e3),this},i.time=function(t){var i=parseInt(t/1e3/60/60),e=parseInt(t/1e3/60%60),n=parseInt(t/1e3%60);return i<100&&(i=s(i,2)),i+":"+s(e,2)+":"+s(n,2)}}),define("module/common/slide",[],function(t,i,e){e.exports=function(t,i,e){this.slideButs_arr=[],this.slideInner=$(t),this.slides=$(i),this.slidesItem=this.slides.length,this.setOptions(e),this.numberOfSlides=-1,this.slides_xc=null,this.zantin=!1,this.info()},e.exports.prototype={setOptions:function(t){this.options={currentPosition:0,slideWidth:180,slideHeight:180,slideDirection:0,slideSeries:0,slideButs:null,slideButs_html:null,slideButs_bindsj:"click",slideButs_selectclass:"s",slides_xssm:1,slides_auto_span:5e3,slides_span:"normal",slides_to_l:null,slides_to_r:null,slides_fun:function(t){},slides_end:function(t){},slides_zindex:2};for(var i in t)this.options[i]=t[i];for(var e in this.options)this[e]=this.options[e]},shenchen_buts:function(){if(!(this.slides.length/2<=1)){var t=this;if(this.slideButs){this.slideButs=$(this.slideButs);for(var i=0;i<this.numberOfSlides;i++){var e;e=this.slideButs_html?"function"==typeof this.slideButs_html?$(this.slideButs_html(i)):$(this.slideButs_html):$('<a href="javascript:;" onfocus="this.blur()">'+(i+1)+"</a>"),+function(){var s=i;e.bind(t.slideButs_bindsj,function(i){return t.toItem(s),!1})}(),this.slideButs_arr.push(e),this.slideButs.append(e)}}}},bind_but:function(){var t=this;this.slides_to_l&&(this.slides_to_l=$(this.slides_to_l),this.slides_to_l.bind("click",function(){return t.toLast(),!1})),this.slides_to_r&&(this.slides_to_r=$(this.slides_to_r),this.slides_to_r.bind("click",function(){return t.toNext(),!1}))},toLast:function(){this.toItem(this.currentPosition-1)},toNext:function(){this.toItem(this.currentPosition+1)},toItem:function(t,i){var e=this;if(this.slides_xc&&clearTimeout(this.slides_xc),this.zantin)return void(this.slides_xc=setTimeout(function(){e.toItem(t)},1e3));switch(t<0||t>this.numberOfSlides-1?this.slidesItem>1?this.slideSeries?(1!=Math.abs(this.currentPosition-t)&&(t=t<0?this.currentPosition-1:this.currentPosition+1),t>=this.numberOfSlides?this.currentPosition=t-this.numberOfSlides:t<0?this.currentPosition=t+this.numberOfSlides:this.currentPosition=t):this.currentPosition=t=t<0?this.numberOfSlides-1:t>this.numberOfSlides-1?0:t:this.currentPosition=t=0:this.currentPosition=t,this.slides_fun.call(e,this.currentPosition),this.slideDirection){case 0:!function(){var i=t;i<0&&(e.slideInner.stop().css("left",-e.numberOfSlides*e.slideWidth),i=e.currentPosition),e.slideInner.stop().animate({left:e.slideWidth*-i},e.slides_span,function(){i<0&&e.slideInner.css("left",-(e.numberOfSlides+i)*e.slideWidth),i>e.numberOfSlides-1&&e.slideInner.css("left",-(i-e.numberOfSlides)*e.slideWidth),e.slides_end.call(e,e.currentPosition)})}();break;case 1:!function(){var i=t;i<0&&(e.slideInner.stop().css("top",-e.numberOfSlides*e.slideHeight),i=e.currentPosition),e.slideInner.stop().animate({top:e.slideHeight*-i},e.slides_span,function(){i<0&&e.slideInner.css("top",-(e.numberOfSlides+i)*e.slideHeight),i>e.numberOfSlides-1&&e.slideInner.css("top",-(i-e.numberOfSlides)*e.slideHeight),e.slides_end.call(e,e.currentPosition)})}();break;case 2:this.slides.not(this.slides[this.currentPosition]).css({"z-index":3}).fadeOut(this.slides_span),$(this.slides[this.currentPosition]).css({"z-index":2,display:""}).fadeIn(this.slides_span,function(){e.slides_end.call(e,e.currentPosition)})}this.slides_auto_span&&(this.slides_xc&&clearTimeout(this.slides_xc),this.slides_xc=setTimeout(function(){e.toNext()},e.slides_auto_span))},infoSeries:function(){if(this.slideSeries){this.numberOfSlides=1==this.slides_xssm?this.numberOfSlides:this.slidesItem;var t=this.slides.clone();this.slides.last().after(t),this.slides=this.slides.add(t)}},info:function(){var t=this;switch(this.numberOfSlides=this.slidesItem-this.slides_xssm+1,this.slideDirection){case 0:this.infoSeries(),this.slideInner.css({width:this.slideWidth*this.slidesItem*(this.slideSeries?2:1),position:"absolute"}),this.slides.css({"float":"left"});break;case 1:this.infoSeries(),this.slideInner.css({height:this.slideHeight*this.slidesItem*(this.slideSeries?2:1),position:"absolute"}),this.slides.css({clear:"both"});break;case 2:this.slideInner.css({position:"relative",zoom:1}),this.slides.css({position:"absolute",left:0,top:0,zoom:1})}this.slideInner.bind("mouseenter",function(){t.zantin=!0}).bind("mouseleave",function(){t.zantin=!1}),this.shenchen_buts(),this.bind_but(),this.toItem(this.currentPosition)}},e.exports.definedfun=function(t){var i=this.slideButs_arr,e=this.slideButs_selectclass;this.slideButs_selectclass&&($.each(i,function(t,i){i.removeClass(e)}),$(i[t]).addClass(e))}}),define("module/eSignature/js/init",["../../../plugIn/zebradialog/js/zebra-dialog-min"],function(t,i,e){function s(){$(document).on("click",".e-signature #check-protocol",function(){return u.close(),$.Zebra_Dialog({title:"电子签章授权委托书",buttons:!1,custom_class:"ZebraDialogIframe eSignature",source:{iframe:{src:"//image.xiaoniu88.com/static/WebXn/dist/module/eSignature/protocol/querytips.html",height:300}},width:800,onClose:function(){o()}}),!1}),$(document).on("click",".e-signature #confirm-authorization",function(){$.ajax({type:"post",url:"/user/allowElectronicSign",success:function(t){if(u.close(),1==t.status)r(1);else{if(0==t.errorCode)return void(window.location.href="/user/login");r(0)}},error:function(t,i,e){r(0)}})})}function n(){s(),o()}function o(){u=$.Zebra_Dialog(l,{title:"提示",buttons:!1,custom_class:"ZebraDialogIframe eSignature",width:480,overlay_close:!1,show_close_button:!1,keyboard:!1})}function a(t,i){t?c=setTimeout(function(){a(--t,i)},1e3):(i.close(),clearTimeout(c))}function r(t){var e="",s=0;1==t?(e=p,s=3):(e=d,s=5),h=$.Zebra_Dialog(e,{title:"提示",buttons:!1,custom_class:"ZebraDialogIframe eSignature",width:300,overlay_close:!1,show_close_button:!0,onClose:function(){clearTimeout(c),0==t?o():i.confirmAuthorize.onsuccess&&i.confirmAuthorize.onsuccess()}}),a(s,h)}t("../../../plugIn/zebradialog/js/zebra-dialog-min");var l="<div class='e-signature'><p>小牛在线电子签章功能已经上线，为了您的交易安全，请授权小牛在线使用您的电子签章。</p><p>详情可查看附件。</p><div class='protocol'>查看<a href='javascript:' id='check-protocol'>《电子签章授权委托书》</a></div><a href='javascript:' class='submit' id='confirm-authorization'>确认授权</a></div>",p="<div class='e-signature result'><p>授权成功</p></div>",d="<div class='e-signature result'><p>授权失败，请重试</p></div>",u=null,h=null,c=null;i.checkSignature=function(){$.ajax({type:"post",url:"/user/existElectronicSign",success:function(t){1==t.status&&(t.data||n())},error:function(t,i,e){}})},i.confirmAuthorize=function(){n()}}),define("plugIn/zebradialog/js/zebra-dialog-min",[],function(require,exports,module){!function($){"use strict";$.Zebra_Dialog=function(){var defaults={animation_speed_hide:0,animation_speed_show:300,auto_close:!1,buttons:!0,center_buttons:!1,custom_class:!1,keyboard:!0,max_height:0,message:"",modal:!0,overlay_close:!0,overlay_opacity:".9",position:"center",reposition_speed:500,show_close_button:!0,source:!1,title:"",type:!1,vcenter_short_message:!0,width:0,onClose:null},plugin=this,options={},timeout;plugin.settings={},"string"==typeof arguments[0]&&(options.message=arguments[0]),("object"==typeof arguments[0]||"object"==typeof arguments[1])&&(options=$.extend(options,"object"==typeof arguments[0]?arguments[0]:arguments[1])),plugin.init=function(){var t;plugin.settings=$.extend({},defaults,options),plugin.isIE6="explorer"==browser.name&&6==browser.version||!1,plugin.settings.modal&&(plugin.overlay=$("<div>",{"class":"ZebraDialogOverlay"}).css({position:plugin.isIE6?"absolute":"fixed",left:0,top:0,opacity:plugin.settings.overlay_opacity}),plugin.settings.overlay_close&&plugin.overlay.bind("click",function(){plugin.close()}),plugin.overlay.appendTo("body")),plugin.dialog=$("<div>",{"class":"ZebraDialog"+(plugin.settings.custom_class?" "+plugin.settings.custom_class:"")}).css({position:plugin.isIE6?"absolute":"fixed",left:0,top:0,visibility:"hidden"}),!plugin.settings.buttons&&plugin.settings.auto_close&&plugin.dialog.attr("id","ZebraDialog_"+Math.floor(9999999*Math.random()));var i=parseInt(plugin.settings.width,10);!isNaN(i)&&i==plugin.settings.width&&i.toString()==plugin.settings.width.toString()&&i>0&&plugin.dialog.css({width:plugin.settings.width}),plugin.settings.title&&(t=$("<h3>",{"class":"ZebraDialog_Title"}).html(plugin.settings.title).appendTo(plugin.dialog));var e=get_buttons(),s=$("<div>",{"class":"ZebraDialog_BodyOuter"+(plugin.settings.title?"":" ZebraDialog_NoTitle")+(e?"":" ZebraDialog_NoButtons")}).appendTo(plugin.dialog);if(plugin.message=$("<div>",{"class":"ZebraDialog_Body"+(get_type()!==!1?" ZebraDialog_Icon ZebraDialog_"+get_type():"")}),plugin.settings.max_height>0&&(plugin.message.css("max-height",plugin.settings.max_height),plugin.isIE6&&plugin.message.attr("style","height: expression(this.scrollHeight > "+plugin.settings.max_height+' ? "'+plugin.settings.max_height+'px" : "85px")')),plugin.settings.vcenter_short_message?$("<div>").html(plugin.settings.message).appendTo(plugin.message):plugin.message.html(plugin.settings.message),plugin.settings.source&&"object"==typeof plugin.settings.source){var n=plugin.settings.vcenter_short_message?$("div:first",plugin.message):plugin.message;for(var o in plugin.settings.source)switch(o){case"ajax":var a="string"==typeof plugin.settings.source[o]?{url:plugin.settings.source[o]}:plugin.settings.source[o],r=$("<div>").attr("class","ZebraDialog_Preloader").appendTo(n);a.success=function(t){r.remove(),n.append(t),draw(!1)},$.ajax(a);break;case"iframe":var l={width:"100%",height:"100%",marginheight:"0",marginwidth:"0",frameborder:"0"},p=$.extend(l,"string"==typeof plugin.settings.source[o]?{src:plugin.settings.source[o]}:plugin.settings.source[o]);n.append($("<iframe>").attr(p));break;case"inline":n.append(plugin.settings.source[o])}}if(plugin.message.appendTo(s),e){e.reverse();var d=$("<div>",{"class":"ZebraDialog_Buttons"}).appendTo(plugin.dialog);$.each(e,function(t,i){var e=$("<a>",{href:"javascript:void(0)","class":"ZebraDialog_Button_"+t});$.isPlainObject(i)?e.html(i.caption):e.html(i),e.bind("click",function(){var t=!0;void 0!==i.callback&&(t=i.callback(plugin.dialog)),t!==!1&&plugin.close(void 0!==i.caption?i.caption:i)}),e.appendTo(d)}),d.wrap($("<div>").addClass("ZebraDialog_ButtonsOuter"+(plugin.settings.center_buttons?" ZebraDialog_Buttons_Centered":"")))}if(plugin.dialog.appendTo("body"),plugin.settings.show_close_button){var u=$('<a href="javascript:void(0)" class="ZebraDialog_Close">&times;</a>').bind("click",function(t){t.preventDefault(),plugin.close()}).appendTo(t?t:plugin.message);t&&u.css({right:parseInt(t.css("paddingRight"),10),top:(parseInt(t.css("height"),10)+parseInt(t.css("paddingTop"),10)+parseInt(t.css("paddingBottom"),10)-u.height())/2})}return $(window).bind("resize.Zebra_Dialog",function(){
clearTimeout(timeout),timeout=setTimeout(function(){draw()},100)}),plugin.settings.keyboard&&$(document).bind("keyup.Zebra_Dialog",function(t){return 27==t.which&&plugin.close(),!0}),plugin.isIE6&&$(window).bind("scroll.Zebra_Dialog",function(){emulate_fixed_position()}),plugin.settings.auto_close!==!1&&(plugin.dialog.bind("click",function(){clearTimeout(plugin.timeout),plugin.close()}),plugin.timeout=setTimeout(plugin.close,plugin.settings.auto_close)),draw(!1),plugin},plugin.close=function(t){$(document).unbind(".Zebra_Dialog"),$(window).unbind(".Zebra_Dialog"),plugin.overlay&&plugin.overlay.animate({opacity:0},plugin.settings.animation_speed_hide,function(){plugin.overlay.remove()}),plugin.dialog.animate({top:0,opacity:0},plugin.settings.animation_speed_hide,function(){plugin.dialog.remove(),plugin.settings.onClose&&"function"==typeof plugin.settings.onClose&&plugin.settings.onClose(void 0!==t?t:"")})};var draw=function(){var viewport_width=$(window).width(),viewport_height=$(window).height(),dialog_width=plugin.dialog.width(),dialog_height=plugin.dialog.height(),values={left:0,top:0,right:viewport_width-dialog_width,bottom:viewport_height-dialog_height,center:(viewport_width-dialog_width)/2,middle:(viewport_height-dialog_height)/2};if(plugin.dialog_left=void 0,plugin.dialog_top=void 0,$.isArray(plugin.settings.position)&&2==plugin.settings.position.length&&"string"==typeof plugin.settings.position[0]&&plugin.settings.position[0].match(/^(left|right|center)[\s0-9\+\-]*$/)&&"string"==typeof plugin.settings.position[1]&&plugin.settings.position[1].match(/^(top|bottom|middle)[\s0-9\+\-]*$/)&&(plugin.settings.position[0]=plugin.settings.position[0].toLowerCase(),plugin.settings.position[1]=plugin.settings.position[1].toLowerCase(),$.each(values,function(index,value){for(var i=0;2>i;i++){var tmp=plugin.settings.position[i].replace(index,value);tmp!=plugin.settings.position[i]&&(0===i?plugin.dialog_left=eval(tmp):plugin.dialog_top=eval(tmp))}})),(void 0===plugin.dialog_left||void 0===plugin.dialog_top)&&(plugin.dialog_left=values.center,plugin.dialog_top=values.middle),plugin.settings.vcenter_short_message){var message=plugin.message.find("div:first"),message_height=message.height(),container_height=plugin.message.height();container_height>message_height&&message.css({"padding-top":(container_height-message_height)/2})}"boolean"==typeof arguments[0]&&arguments[0]===!1||0===plugin.settings.reposition_speed?plugin.dialog.css({left:plugin.dialog_left,top:plugin.dialog_top,visibility:"visible",opacity:0}).animate({opacity:1},plugin.settings.animation_speed_show):(plugin.dialog.stop(!0),plugin.dialog.css("visibility","visible").animate({left:plugin.dialog_left,top:plugin.dialog_top},plugin.settings.reposition_speed)),plugin.dialog.find("a[class^=ZebraDialog_Button]:first").focus(),plugin.isIE6&&setTimeout(emulate_fixed_position,500)},emulate_fixed_position=function(){var t=$(window).scrollTop(),i=$(window).scrollLeft();plugin.settings.modal&&plugin.overlay.css({top:t,left:i}),plugin.dialog.css({left:plugin.dialog_left+i,top:plugin.dialog_top+t})},get_buttons=function(){if(plugin.settings.buttons!==!0&&!$.isArray(plugin.settings.buttons))return!1;if(plugin.settings.buttons===!0)switch(plugin.settings.type){case"question":plugin.settings.buttons=["Yes","No"];break;default:plugin.settings.buttons=["Ok"]}return plugin.settings.buttons},get_type=function(){switch(plugin.settings.type){case"confirmation":case"error":case"information":case"question":case"warning":return plugin.settings.type.charAt(0).toUpperCase()+plugin.settings.type.slice(1).toLowerCase();default:return!1}},browser={init:function(){this.name=this.searchString(this.dataBrowser)||"",this.version=this.searchVersion(navigator.userAgent)||this.searchVersion(navigator.appVersion)||""},searchString:function(t){for(var i=0;i<t.length;i++){var e=t[i].string,s=t[i].prop;if(this.versionSearchString=t[i].versionSearch||t[i].identity,e){if(-1!=e.indexOf(t[i].subString))return t[i].identity}else if(s)return t[i].identity}},searchVersion:function(t){var i=t.indexOf(this.versionSearchString);if(-1!=i)return parseFloat(t.substring(i+this.versionSearchString.length+1))},dataBrowser:[{string:navigator.userAgent,subString:"MSIE",identity:"explorer",versionSearch:"MSIE"}]};return browser.init(),plugin.init()}}(jQuery)});