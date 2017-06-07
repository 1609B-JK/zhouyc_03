<html>
<head>
    <title>freemarker页面</title>
</head>
<script src="/js/jquery.min.js"></script>
<body>
    <form id="addForm">
        账号:<input name="userAccount"/><br>
        密码:<input name="userPwd"/><br>
        <input type="button" value="增加" onclick="insertUser()"/>
    </form>

<script>
    function insertUser(){
        $.post(
                'insertUser.jhtml',
                $("#addForm").serialize(),
                function(data){
                    location.href="test1.jhtml";
                },
                'json'
        )
    }
</script>
</body>
</html>