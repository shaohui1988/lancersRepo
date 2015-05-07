package com.shaohui.commonenum;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;


/**
 * 
 * 十二星座
 * 
 * @version 1.0
 * @since JDK1.7
 * @author shaohui
 * @company 上海朝阳永续信息技术有限公司
 * @copyright (c) 2015 SunTime Co'Ltd Inc. All rights reserved.
 * @date 2015年5月7日 下午6:57:53
 */
public enum ConstellationEnum {
    
    /**
     * 白羊座
     */
    ARIES("白羊座"),
    
    /**
     * 金牛座
     */
    TAURUS("金牛座"),
    
    /**
     * 双子座
     */
    GEMINI("双子座"),
    
    /**
     * 巨蟹座
     */
    CANCER("巨蟹座"),
    
    /**
     * 狮子座
     */
    LEO("狮子座"),
    
    /**
     * 处女座
     */
    VIRGO("处女座"),
    
    /**
     * 天秤座
     */
    LIBRA("天秤座"),
    
    /**
     * 天蝎座
     */
    SCORPIO("天蝎座"),
    
    /**
     * 射手座
     */
    SAGITTARIUS("射手座"),
    
    /**
     * 摩羯座
     */
    CAPRICORN("摩羯座"),
    
    /**
     * 水瓶座
     */
    AQUARIUS("水瓶座"),
    
    /**
     * 双鱼座
     */
    PISCES("双鱼座");
    
    /**
     * 中文名
     */
    private String chineseName;
    
    private static final Map<String, ConstellationEnum> CE = new HashMap<String, ConstellationEnum>(){{
        put("白羊座", ARIES);
        put("金牛座", TAURUS);
        put("双子座", GEMINI);
        put("巨蟹座", CANCER);
        put("狮子座", LEO);
        put("处女座", VIRGO);
        put("天秤座", LIBRA);
        put("天蝎座", SCORPIO);
        put("射手座", SAGITTARIUS);
        put("摩羯座", CAPRICORN);
        put("水瓶座", AQUARIUS);
        put("双鱼座", PISCES);
    }};
    
    private ConstellationEnum(String chineseName) {
        this.chineseName = chineseName;
    }
    
    /**
     * 
     * 获取中文名称
     *
     * @return
     * 
     * @author shaohui
     * @date 2015年5月7日 下午7:09:52
     */
    public String getChineseName() {
        return this.chineseName;
    }
    
    /**
     * 
     * 根据中文名获取星座
     *
     * @param chineseName
     * @return
     * 
     * @author shaohui
     * @date 2015年5月7日 下午7:29:46
     */
    public static ConstellationEnum getConstellationFromChinese(String chineseName) {
        if (StringUtils.isBlank(chineseName)) {
            return null;
        }
        int length = chineseName.length();
        if (length <= 2 || length >=3) {
            return null;
        }
        return length == 2 ? CE.get(chineseName + "座") : CE.get(chineseName);
    }
}
