var rootPath;
var idd=0;
/*用来帮助隐藏左侧菜单*/
var idLi=null;
$(function(){
    rootPath = $('#absolutePath').val();
});

$(document).ready(function(){
    $.ajax({
        type: "get",
        url:rootPath+'book/toIndex',
        success: function(result){
            var res=eval(result);
            console.log(res)
            var showMenu=$("#menu");
            showSideMenu(res,showMenu)
        }
    })
});
function showSideMenu(menuList, parent) {
    for(var menu in menuList) {
        idd+=1;
        //如果有子节点，则遍历该子节点



        var iid='id_'+idd;
        if(typeof(menuList[menu].children) != 'undefined') {
            //创建一个子节点li
            var li = $("<li name='li_name' id='"+iid+"' class='menu-list' onclick=getaction('"+iid+"')></li>");
            //将li的文本设置好，并马上添加一个空白的ul子节点，并且将这个li添加到父亲节点中
            $(li).append("<a href='#'><i class='icon-layers'></i> <span class='menu-text'>" + menuList[menu].text + "</span></a>").appendTo(parent);
            $(li).append("<ul class='sub-menu-list' ></ul>");

            //将空白的ul作为下一个递归遍历的父亲节点传入
            showSideMenu(menuList[menu].children, $(li).children().last());
        }else {
        //如果该节点没有子节点，则直接将该节点li以及文本创建好直接添加到父亲节点中
            $("<li id='"+iid+"' class='menu-list' onclick=getactionLi('"+iid+"')></li>").append("<a href='#' onclick=getUrl('" + menuList[menu].text+"','"+menuList[menu].id+"','"+menuList[menu].url+"')> <span class='menu-text'>" + menuList[menu].text + "</span></a>").appendTo(parent);
        }
    }
}

function getaction(id){
        var main = document.getElementById(id);
        if (main.className == 'menu-list nav-active' ) {
            if(idLi==null) {
                main.className = 'menu-list';
            }
            idLi=null;
        } else {
            var mi=document.getElementsByName("li_name");
            for(var m in mi){
                mi[m].className='menu-list';
            }
            main.className = 'menu-list nav-active';
        }
}

function getactionLi(id){
    var main = document.getElementById(id);
    idLi=main;
}
function getUrl(text,id,url) {
  /*  $("#tabContainer").tabs({
        data: [{
            id: 'home',
            text: ' 首 页 ',//标题
            url:rootPath+"/bookList.jsp",// 内容路径
            closeable: false//是否显示单个tab关闭按钮
         }],
            showIndex: 1,
            loadAll: false
    });*/
    var main = document.getElementById(id);
    if(main==null){
         $("#tabContainer").data("tabs").addTab({id: id, text:text, closeable: true, url:rootPath+"input/"+ url});
    }
}



