package com.shaohui.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.shaohui.modal.UserVO;

/**
 * 
 * 注册
 * 
 * @version 1.0
 * @since JDK1.7
 * @author shaohui
 * @company 上海朝阳永续信息技术有限公司
 * @copyright (c) 2015 SunTime Co'Ltd Inc. All rights reserved.
 * @date 2015年5月7日 下午5:21:53
 */
public class RegisterAction extends ActionSupport implements ModelDriven<UserVO> {
    
    private UserVO user;
    
    public String register() {
        return "";
    }

    @Override
    public UserVO getModel() {
        if(user == null){
            user = new UserVO();
        }
        return user;
    }
}
