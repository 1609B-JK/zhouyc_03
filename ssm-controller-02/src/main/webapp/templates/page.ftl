<center>
    共${total.totalCount}条|共${total.totalPage}页|
    <input type="hidden" id="totalPage" value="${total.totalPage}"/>
    当前<input type="text" id="pageIndex" value="${total.pageIndex}" style="width:30px"/>页|
    每页<input type="text" id="pageSize" value="${total.pageSize}" style="width:30px"/>条
    <a href="javascript:toPage(1)">首页</a>
    <a href="javascript:toPage(2)">上一页</a>
    <a href="javascript:toPage(3)">下一页</a>
    <a href="javascript:toPage(4)">尾页</a>
    <a href="javascript:toPage(5)">跳转</a>
</center>
<script>

    function toPage(page){
        var pageIndex = $("#pageIndex").val();
        var totalPage = $("#totalPage").val();
        var pageSize = $("#pageSize").val();
        if(page == 1){
            if(pageIndex == 1){
                alert("当前已经是首页");
            }else{
                pageIndex = 1
            }
        }
        if(page == 2){
            if(pageIndex == 1){
                alert("当前没有上一页");
            }else{
                pageIndex = pageIndex - 1;
            }
        }        if(page == 3){
            if(pageIndex == totalPage){
                alert("当前没有下一页");
            }else{
                pageIndex = ++pageIndex;
            }
        }
        if(page == 4){
            if(pageIndex == totalPage){
                alert("当前已经是尾页");
            }else{
                pageIndex = totalPage
            }
        }
            var userAccount = $("#userAccount").val();
            $("#userAccount").val(userAccount);
            location.href="test1.jhtml?pageIndex="+pageIndex+"&pageSize="+pageSize+"&userAccount="+userAccount

    }
    </script>