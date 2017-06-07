<html>
    <head>
        <title>freemarker页面</title>
    </head>
    <script src="/js/jquery.min.js"></script>
    <body>
       <#-- <#list listt as user>
            ${user.userID}
            ${user.userAccount}
        </#list>-->
       <center>
           条件查询:<input id="userAccount"/>
           <input type="button" value="查询" onclick="toPage(6)"/>
           <input type="button" value="重置" onclick="toPage(7)"/>

           <button onclick="toInsertPage()">增加信息</button></center>

            <table border="1px" align="center" width="600px" cellspacing="0" cellpadding="0">
                <tr align="center">
                    <td>id</td>
                    <td>账号</td>
                    <td>密码</td>
                    <td>操作</td>
                </tr>
                <#list listt as user>
                <tr align="center">
                    <td>${user.userID}</td>
                    <td>${user.userAccount}</td>
                    <td>${user.userPwd}</td>
                    <td>
                        <input type="button" value="删除" onclick="deleteUserByUserID(${user.userID})"/>|
                        <input type="button" value="修改" onclick="toUpdatePage(${user.userID})"/>
                    </td>
                </tr>
                </#list>
            </table>
            <#include "page.ftl" >

    <script>
        //删除
        function deleteUserByUserID(userID){
            var user = {
                "userID":userID
            }
            $.post(
                    'deleteUserByUserID.jhtml',
                    user,
                    function(data){
                        location.href="test1.jhtml";
                    },
                    'json'
            )
        }
        //修改页面
        function toUpdatePage(userID){
            location.href="selectUserByUserID.jhtml?userID="+userID
        }
        //添加页面
        function toInsertPage(){
            location.href="toInsertPage.jhtml";
        }
    </script>
    </body>
</html>