package com.zizaike.entity.open.qunar.response;

/**
 * Project Name: code <br/>
 * Function:去哪儿床型Code. <br/>
 * date: 2016/4/5 15:58 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
public enum BedTypeCode {
    SINGLE("SINGLE", "单人床"),
    DOUBLE("DOUBLE", "大床"),
    BUNK("BUNK", "上下铺"),
    OTHER("OTHERS", "其他");

    private final String code;
    private final String desc;

    /**
     * @param code
     * @param description
     */
    private BedTypeCode(String code, String description)
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
    public static String getByCode(String code)
    {
        for (BedTypeCode bedTypeCode : values())
        {
            if (bedTypeCode.getCode().equals(code))
            {
                return bedTypeCode.desc;
            }
        }
        return null;
    }


}
