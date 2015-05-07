package com.shaohui.commonenum;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;


/**
 * 
 * 生肖
 * 
 * @version 1.0
 * @since JDK1.7
 * @author shaohui
 * @company 上海朝阳永续信息技术有限公司
 * @copyright (c) 2015 SunTime Co'Ltd Inc. All rights reserved.
 * @date 2015年5月7日 下午7:41:19
 */
public enum ChineseZodiacEnum {
    
    MOUSE("鼠"),
    
    COW("牛"),
    
    TIGER("虎"),
    
    RABBIT("兔"),
    
    DRAGON("龙"),
    
    SNAKE("蛇"),
    
    HORSE("马"),
    
    SHEEP("羊"),
    
    MONKEY("猴"),
    
    CHICKEN("鸡"),
    
    DOG("狗"),
    
    PIG("猪");
    
    /**
     * 中文名称
     */
    private String chineseName;
    
    /**
     * 生肖的中-英对照
     */
    private static final Map<String, ChineseZodiacEnum> CE = new HashMap<String, ChineseZodiacEnum>(){{
        put("鼠", MOUSE);
        put("牛", COW);
        put("虎", TIGER);
        put("兔", RABBIT);
        put("龙", DRAGON);
        put("蛇", SNAKE);
        put("马", HORSE);
        put("羊", SHEEP);
        put("猴", MONKEY);
        put("鸡", CHICKEN);
        put("狗", DOG);
        put("猪", PIG);
    }};
    
    private ChineseZodiacEnum(String chineseName) {
        this.chineseName = chineseName;
    }
    
    /**
     * 
     * 获取中文名称
     *
     * @return 中文名称
     * 
     * @author shaohui
     * @date 2015年5月7日 下午7:48:56
     */
    public String getChineseName() {
        return this.chineseName;
    }
    
    /**
     * 
     * 根据中文名获取生肖
     *
     * @param chineseName
     * @return
     * 
     * @author shaohui
     * @date 2015年5月7日 下午7:57:48
     */
    public static ChineseZodiacEnum getFromChinese(String chineseName) {
        if (StringUtils.isBlank(chineseName) || chineseName.length() != 1) {
            return null;
        }
        return CE.get(chineseName);
    }
    
    /**
     * 
     * 根据日期返回生肖
     *
     * @param date
     * @return
     * 
     * @author shaohui
     * @date 2015年5月7日 下午8:00:55
     */
    public static ChineseZodiacEnum getFromDate(Date date) {
        if (date == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
        
        //公元1年是鸡
        
        return null;
    }
    
}
