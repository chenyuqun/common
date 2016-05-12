package com.zizaike.entity.open.qunar.response;

/**
 * Project Name: code <br/>
 * Function:FeeMode. <br/>
 * date: 2016/4/13 15:43 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
public enum FeeMode {
    FREE("FREE", "免费"),
    CHARGE("CHARGE", "收费"),
    NONE("NONE", "无"),
    UNKNOWN("UNKNOWN","未知"),
    PART_CHARGE("PART_CHARGE","部分收费"),
    PART_SUPPORT_AND_FREE("PART_SUPPORT_AND_FREE","部分支持且免费"),
    PART_SUPPORT_AND_CHARGE("PART_SUPPORT_AND_CHARGE","部分支持且收费"),
    PART_SUPPORT_AND_PART_CHARGE("PART_SUPPORT_AND_PART_CHARGE","部分支持且部分收费");

    private final String code;
    private final String desc;

    /**
     * @param code
     * @param description
     */
    private FeeMode(String code, String description)
    {
        this.code = code;
        this.desc = description;
    }

    /**
     * @return
     * @desc 返回code
     */
    public String getCode()
    {
        return code;
    }

    /**
     * @return
     * @desc 返回desc
     */
    public String getDesc()
    {
        return desc;
    }

    /**
     * 通过code获取desc
     * @param code
     */
    public static String FeeMode(String code)
    {
        for (FeeMode feeMode : values())
        {
            if (feeMode.getCode().equals(code))
            {
                return feeMode.desc;
            }
        }
        return null;
    }

}
