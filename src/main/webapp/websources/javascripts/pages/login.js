/**
 * Created by lancer on 2015/4/19 0019.
 */
$(function () {

    /**
     * ��¼
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
            console.log("finalPassword:" + finalPassword);
            var loginResponse = dataService.post("user/login", {
                userName: userName,
                password: finalPassword
            });
            loginResponse.success(function (data) {
                console.log(data);
            });
        });

    }
    $("#login").on("click", function () {
        login();
    });

});