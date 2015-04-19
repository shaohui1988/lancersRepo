/**
 * Created by lancer on 2015/4/19 0019.
 */

/** 数据请求 */
dataService = function () {
    function formatUrl(url) {
        if (url.indexOf("/") === 0) {
            return url;
        }
        return "/testMavenWeb/" + url;
    }
    var get = function (url, params) {
        url = formatUrl(url);
        if (!params) {
            params = {};
        }
        return $.ajax({
            type: "get",
            url: url,
            data: params,
            dataType: "json"
        });
    };
    var post = function (url, params) {
        url = formatUrl(url);
        if (!params) {
            params = {};
        }
        return $.ajax({
            type: "post",
            url: url,
            data: params,
            dataType: "json"
        });
    };
    return {
        get: get,
        post: post
    }
}();