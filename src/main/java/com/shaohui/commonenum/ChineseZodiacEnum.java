package com.shaohui.commonenum;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

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

    MOUSE("鼠", 1),

    COW("牛", 2),

    TIGER("虎", 3),

    RABBIT("兔", 4),

    DRAGON("龙", 5),

    SNAKE("蛇", 6),

    HORSE("马", 7),

    SHEEP("羊", 8),

    MONKEY("猴", 9),

    CHICKEN("鸡", 10),

    DOG("狗", 11),

    PIG("猪", 12);

    /**
     * 中文名称
     */
    private String chineseName;

    /**
     * 序号
     */
    private Integer index;

    /**
     * 生肖的中-英对照
     */
    private static final Map<String, ChineseZodiacEnum> CE = new HashMap<String, ChineseZodiacEnum>() {
        {
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
        }
    };

    private ChineseZodiacEnum(String chineseName, Integer index) {
        this.chineseName = chineseName;
        this.index = index;
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
    public static ChineseZodiacEnum getByChinese(String chineseName) {
        if (StringUtils.isBlank(chineseName) || chineseName.length() != 1) {
            return null;
        }
        return CE.get(chineseName);
    }

    /**
     * 根据索引获取生肖
     * 
     * @param index
     *            索引
     * @return
     */
    public static ChineseZodiacEnum getByIndex(Integer index) {
        ChineseZodiacEnum zodia = null;
        switch (index) {
        case 1:
            zodia = MOUSE;
            break;
        case 2:
            zodia = COW;
            break;
        case 3:
            zodia = TIGER;
            break;
        case 4:
            zodia = RABBIT;
            break;
        case 5:
            zodia = DRAGON;
            break;
        case 6:
            zodia = SNAKE;
            break;
        case 7:
            zodia = HORSE;
            break;
        case 8:
            zodia = SHEEP;
            break;
        case 9:
            zodia = MONKEY;
            break;
        case 10:
            zodia = CHICKEN;
            break;
        case 11:
            zodia = DOG;
            break;
        case 12:
            zodia = PIG;
            break;
        }
        return zodia;
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

        // 公元-1年是猴年，公元1年是鸡，公元4年是鼠，以此计算生肖
        return getByIndex(Math.abs(year - 4) % 12 + 1);
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
     * 获取序号
     * 
     * @return
     */
    public Integer getIndex() {
        return this.index;
    }
    
    @Override
    public String toString() {
        return this.chineseName;
    }
    
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2015);
        System.out.println(ChineseZodiacEnum.getFromDate(calendar.getTime()));
    }
}
