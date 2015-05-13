package com.shaohui.commonenum;

/**
 * 
 * 性别枚举类
 * 
 * @version 1.0
 * @since JDK1.7
 * @author shaohui
 * @company 上海朝阳永续信息技术有限公司
 * @copyright (c) 2015 SunTime Co'Ltd Inc. All rights reserved.
 * @date 2015年5月7日 下午6:48:28
 */
public enum GenderEnum {
    
    /**
     * 男性
     */
    MALE(1), 
    
    /**
     * 女性
     */
    FEMALE(0),
    
    /**
     * 其他（保密）
     */
    OTHER(2);
 
    /**
     * 序号
     */
    private int index;
    
    private GenderEnum(int index) {
        this.index = index;
    }
    
    /**
     * 获取序号
     * @return
     */
    public int getIndex() {
        return this.index;
    }
    
    /**
     * 根据序号获取性别
     * @param index 序号
     * @return 性别
     */
    public static GenderEnum getByIndex(int index) {
        if (index == 0) {
            return FEMALE;
        } else if (index == 1) {
            return MALE;
        } else {
            return OTHER;
        }
    }
}
