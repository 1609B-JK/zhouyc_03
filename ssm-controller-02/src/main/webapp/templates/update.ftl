<html>
    <head>
        <title>freemarker页面</title>
    </head>
    <script src="/js/jquery.min.js"></script>
    <body>
    <form id="updateForm">
       <input type="hidden" name="userID" value="${userID}">
        账号:<input name="userAccount"value="${userAccount}"/><br>
        密码:<input name="userPwd" value="${userPwd}"/><br>
        <input type="button" value="修改" onclick="updateUser()"/>
    </form>

    <script>
        function updateUser(){
            $.post(
                    'updateUserByUserID.jhtml',
                    $("#updateForm").serialize(),
                    function(data){
                        location.href="test1.jhtml";
                    },
                    'json'
            )
        }
    </script>
    </body>
</html>