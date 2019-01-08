<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
<div class="con" style="margin-top:15px">
    <div class="touSu">
        <div class="chooseIn_top chairFix">
            <div><img src="images/H_edit.png" alt=""></div>
            <h5>报修统计</h5>
        </div>
        <div class="chooseIn_con chairFix">
            <div class="container1"></div>
            <div class="container2"></div>
        </div>
        <div class="chooseIn_foot">
            <div class="chooseIn_fo" style="width: 100%; height: 400px; margin: 0px auto;"></div>
            <p class="chooseDate">
                <label for="">选择日期</label>
                <input type="number" value="2017" id="theDate">
            </p>
        </div>
    </div>
</div>
<script src="js/Highcharts111.js"></script>
<script src="js/Reporting_baoXiu.js"></script>
<script>
    /*左侧效果*/
    $(".li_a").bind("click", function() {
        $(this).next(".left_slide").slideToggle().siblings(".left_slide").slideUp();
    });
    /*头部右侧效果*/
    $(document).click(function(ev){
        var e=ev||window.event;
        var target=e.target||e.srcElement;
        if(target.parentNode.className!="hr_div1"){
            $(".header_list").hide()
        }
    })
    $('.hr_div1').click(function(){
        var i=$('.hr_div1').index(this);
        if($(".header_list").eq(i).get(0).style.display=="block"){
            $(".header_list").eq(i).hide()
        }else{
            $(".header_list").hide()
            $(".header_list").eq(i).show()
        }
    })
    $('.hdl_select').click(function () {
        var a=$(this).html();
        $('.hr_show').html(a);
    });
    /*投诉概况双线图*/
    $(document).ready(function() {
        var title = {
            text: '报修概况'
        };
        var xAxis = {
            categories: ["2017/1","2017/2","2017/3","2017/4","2017/5","2017/6","2017/7","2017/8","2017/9","2017/10","2017/11","2017/12"]
        };
        var yAxis = {
            title: {
                text: ''
            },
            plotLines: [{
                value: 0,
                width: 1,
                color: '#808080'
            }]
        };
        var tooltip = {
            valueSuffix: ''
        }
        var legend = {
            layout: 'vertical',
            align: 'right',
            verticalAlign: 'middle',
            borderWidth: 1
        };
        var series =  [
            {
                name: '报修数量',
                data: [1,5,7,11,3,1,0,5,8,9,3,8]
            },
            {
                name: '已报修数量',
                data: [1,4,6,9,2,1,0,5,8,6,2,7]
            }
        ];
        var json = {};
        json.title = title;
        json.xAxis = xAxis;
        json.yAxis = yAxis;
        json.tooltip = tooltip;
        json.legend = legend;
        json.series = series;
        $('.chooseIn_fo').highcharts(json);

        $("#theDate").click(function(){
            Dat=$("#theDate").get(0).value;
            var title = {
                text: '报修概况'
            };
            var xAxis = {
                categories: [Dat+"/1",Dat+"/2",Dat+"/3",Dat+"/4",Dat+"/5",Dat+"/6",Dat+"/7",Dat+"/8",Dat+"/9",Dat+"/10",Dat+"/11",Dat+"/12"]
            };
            var yAxis = {
                title: {
                    text: ''
                },
                plotLines: [{
                    value: 0,
                    width: 1,
                    color: '#808080'
                }]
            };
            var tooltip = {
                valueSuffix: ''
            }
            var legend = {
                layout: 'vertical',
                align: 'right',
                verticalAlign: 'middle',
                borderWidth: 1
            };
            var series =  [
                {
                    name: '报修数量',
                    data: [1,5,7,11,3,1,0,5,8,9,3,8]
                },
                {
                    name: '已报修数量',
                    data: [1,4,6,9,2,1,0,5,8,6,2,7]
                }
            ];
            var json = {};
            json.title = title;
            json.xAxis = xAxis;
            json.yAxis = yAxis;
            json.tooltip = tooltip;
            json.legend = legend;
            json.series = series;
            $('.chooseIn_fo').highcharts(json);
        })
    });
</script>
--%>
<html>
<head>
    <%@include file="/common/head.jsp"%>
    <link href="assets/css/bootstrap.min.css" rel="stylesheet">

    <link href="css/bootstrap-tab.css" rel="stylesheet">

    <!-- End core plugin -->
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>

    <script src="assets/js/bootstrap-table.js"></script>
    <link href="assets/css/bootstrap-table.css" rel="stylesheet" />
    <script src="assets/js/bootstrap-table-zh-CN.js"></script>

    <script src="js/dome/propertyChange.js"></script>
</head>
<body>

<div class="panel-body" style="padding-bottom:0px;">
    <div class="panel panel-default">
        <div class="panel-heading">查询条件</div>
        <div class="panel-body">
            <form id="formSearch" class="form-horizontal">
                <div class="form-group" style="margin-top:15px">
                    <label class="control-label col-sm-1" for="txt_search_departmentname">部门名称</label>
                    <div class="col-sm-3">
                        <input type="text" class="form-control" id="txt_search_departmentname">
                    </div>
                    <label class="control-label col-sm-1" for="txt_search_statu">状态</label>
                    <div class="col-sm-3">
                        <input type="text" class="form-control" id="txt_search_statu">
                    </div>
                    <div class="col-sm-4" style="text-align:left;">
                        <button type="button" style="margin-left:50px" id="btn_query" class="btn btn-primary">查询</button>
                    </div>
                </div>
            </form>
        </div>
    </div>

    <div id="toolbar" class="btn-group">
        <button id="btn_add" type="button" class="btn btn-default">
            <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
        </button>
        <button id="btn_edit" type="button" class="btn btn-default">
            <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
        </button>
        <button id="btn_delete" type="button" class="btn btn-default">
            <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
        </button>
    </div>
    <table id="tb_departments"></table>
</div>
</body>
</html>