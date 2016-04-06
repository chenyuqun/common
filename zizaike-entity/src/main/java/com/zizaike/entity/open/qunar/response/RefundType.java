package com.zizaike.entity.open.qunar.response;

/**
 * Project Name: code <br/>
 * Function:Qunar退款类型Type. <br/>
 * date: 2016/4/6 14:31 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
public enum RefundType {
    NO_DEDUCTION("NO_DEDUCTION", "不扣房费"),
    DEDUCT_BY_PERCENT("DEDUCT_BY_PERCENT", "扣除房费的百分比"),
    DEDUCT_BY_AMOUNT("DEDUCT_BY_AMOUNT", "扣除固定金额"),
    DEDUCT_FIRST_NIGHT("DEDUCT_FIRST_NIGHT", "扣除首晚房费");

    private final String code;
    private final String desc;

    /**
     * @param code
     * @param description
     */
    private RefundType(String code, String description)
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
        for (RefundType refundType : values())
        {
            if (refundType.getCode().equals(code))
            {
                return refundType.desc;
            }
        }
        return null;
    }
}
