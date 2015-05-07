/**
 * Created by lancer on 2015/4/19 0019.
 */
$(function () {

    /**
     * 登录
     */
    function login() {
        var dataResponse = dataService.post("user/getRandomStr");
        dataResponse.success(function(data) {
            console.log(data);
            var randomStr = data.randomStr;
            var userName = $("#inputEmail").val();
            var password = $("#inputPassword").val();
            var encodedPassword = hex_sha1(password);
            var finalPassword = hex_sha1(encodedPassword + randomStr);
            var loginResponse = dataService.post("user/login", {
                userName: userName,
                password: finalPassword
            });
            loginResponse.success(function (data) {
                var loginStatus = data.result;
                if (loginStatus) {
                	alert("登录成功");
                } else {
                	alert("登录失败");
                }
            });
        });

    }
    $("#login").on("click", function () {
        login();
    });

});