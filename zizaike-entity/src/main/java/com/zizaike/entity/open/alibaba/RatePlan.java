/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:RatePlan.java  <br/>
 * Package Name:com.zizaike.entity.open.alibaba  <br/>
 * Date:2016年1月19日上午10:45:10  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
 */

package com.zizaike.entity.open.alibaba;

import java.util.Date;

/**
 * ClassName:RatePlan <br/>
 * Function: 价格计划. <br/>
 * Date: 2016年1月19日 上午10:45:10 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 * @see
 */
public class RatePlan {
    /**
     * 动作
     */
    Action action;
    /**
     * 卖家自己系统的Code，简称RateCode
     */
    private String rateplanCode;
    /**
     * 在淘宝搜索页面展示的房价名称
     */
    private String name;
    /**
     * 支付类型，只支持：1：预付5：现付6: 信用住7:在线预约。其中5,6,7三种类型需要申请权限
     */
    private Long paymentType;
    /**
     * 0：不含早1：含单早2：含双早N：含N早（1-99可选）
     */
    private Long breakfastCount;

    /**
     * 最小入住天数（1-90）。默认1
     */
    private Long minDays;

    /**
     * 最大入住天数（1-90）。默认90
     */
    private Long maxDays;
    /**
     * 首日入住房间数（1-99）。默认1。不推荐使用
     */
    private Long minAmount;
    /**
     * 最小提前预定小时数，从入住当天的24点往前计算。例如如果这个字段设置了48，代表必须至少提前两天预定，那么如果想预定24号入住，,必须在23号零点前下单。
     */
    private Long minAdvHours;
    /**
     * 最大提前预定小时数，从入住当天的24点往前计算。例如如果这个字段设置了48，代表最多提前两天预定，那么如果想预定24号入住，,必须在23号零点以后下单。
     */
    private Long maxAdvHours;
    /**
     * 产品每日开始销售时间
     */
    private String startTime;
    /**
     * 产品每日结束销售时间
     */
    private String endTime;
    /**
     * 退订政策字段，是个json串，参考示例值设置改字段的值。允许变更/取消：在XX年XX月XX日XX时前取消收取Y%的手续费，100>Y>=0允许变更/取消：在入住前X小时前取消收取Y%的手续费，100>Y>=0（不超过10条）。
     * 1.
     * 表示任意退{"cancelPolicyType":1};2.表示不能退{"cancelPolicyType":2};4.从入住当天24点往前推X小时前取消收取Y%手续费，否则不可取消{"cancelPolicyType":4
     * ,"policyInfo":{"48":10,"24":20}}表示，从入住日24点往前推提前至少48小时取消，收取10%的手续费，从入住日24点往前推提前至少24小时取消，收取20%的手续费;5.从24点往前推多少小时可退{
     * "cancelPolicyType"
     * :5,"policyInfo":{"timeBefore":6}}表示从入住日24点往前推至少6个小时即入住日18点前可免费取消;6.从入住日24点往前推，至少提前小时数扣取首晚房费{"cancelPolicyType"
     * :6,"policyInfo":{"14":1}}表示入住日24点往前推14小时，即入住日10点前取消收取首晚房费。
     * 注意：支付类型为预付，那么可以使用所有的退订类型；支付类型为面付或者信任住并且是无担保，那么只能使用1类型的退订
     * ；支付类型为面付或者信任住并且为担保，那么只能使用2,5类型的退订；支付类型为在线预约，那么只能使用1,2,5类型的退改。如果支付类型是面付或者信任住并且为担保，那么如果传了4或者6的退订，那么会强制转成类型5。
     */
    private String cancelPolicy;
    /**
     * 个性化定制扩展信息的JSON。注：此字段的值需要ISV在接入前与淘宝沟通，且确认能解析
     */
    private String extend;
    /**
     * 1：开启（默认）2：关闭。如果没传值那么默认默认值为1
     */
    private Long status;
    /**
     * RP的英文名称
     */
    private String englishName;
    /**
     * 担保类型，只支持： 0 无担保 1 峰时首晚担保 2峰时全额担保 3全天首晚担保 4全天全额担保
     */
    private Long guaranteeType;
    /**
     * 分时担保每日开始担保时间 （设置了峰时担保必须有值）
     */
    private String guaranteeStartTime;
    /**
     * 会员等级。如需开通，需要申请权限，取值为：1,2,3,4,5none。
     */
    private String memberLevel;
    /**
     * 销售渠道。如需开通，需要申请权限。如果有多个用","分。目前制定四种渠道：A-集团协议B-双11促销价C-普通促销价M-无线专享价
     */
    private String channel;
    /**
     * 系统商，一般不填写，使用须申请
     */
    private String vendor;
    /**
     * 需申请会员权限。是否是新用户首住优惠rp。1-代表是。其他值或者不填写代表否
     */
    private Long firstStay;
    /**
     * 需申请协议价权限。是否是协议价rp。1-代表是，不清楚的请不要填写该字段
     */
    private Long agreement;
    /**
     * 在添加rateplan时，同时新增早餐日历。date：说明这条记录的早餐政策breakfast_count：这一天早餐的数量。>=0,<=99。如果date为空，那么会去读取startDate和endDate（格式都为
     * "yyyy-MM-dd"），即早餐正常属于一个时间段。
     */
    private String breakfastCal;
    /**
     * 在新增rateplan的同时新增取消政策日历。 json格式。 date：日历的某一天，格式为"yyyy-MM-dd" cancel_policy：日历某一天的价格政策。格式和限制同cancel_policy。
     * 如果date为空，那么会读取startDate和endDate（格式都为"yyyy-MM-dd"），即取消政策属于某一个时间段。
     * 注意：支付类型为预付，那么可以使用所有的退订类型；支付类型为面付或者信任住并且是无担保，那么只能使用1类型的退订
     * ；支付类型为面付或者信任住并且为担保，那么只能使用2,5类型的退订；支付类型为在线预约，那么只能使用1,2,5类型的退改。如果支付类型是面付或者信任住并且为担保，那么如果传了4或者6的退订，那么会强制转成类型5。
     */
    private String cancelPolicyCal;
    /**
     * 在新增rateplan的同时，新增担保日历。date：担保日历的某一天。guarantee:担保政策。其中有两个属性：guaranteeType,guaranteeStartTime。
     * guaranteeType的可选值同guaranteeType字段
     * ，详见guaranteeType字段。guaranteeStartTime格式为"HH:mm"。如果date为空，那么会读取startDate和endDate（格式都为"yyyy-MM-dd"），即担保政策属于某一个时间段。
     */
    private String guaranteeCal;
    /**
     * 生效开始时间，用来控制此rateplan生效的开始时间，配合字段deadline_time一起限定rp的有效期
     */
    private Date effectiveTime;
    /**
     * 生效截止时间，用来控制此rateplan生效的截止时间，配合字段effective_time一起限定rp的有效期
     */
    private Date deadlineTime;
    /**
     * rp类型，1为小时房。目前只支持小时房。如果不是小时房rateplan,则不要填写。如果想要清空该字段可以传入none
     */
    private String rpType;

    /**
     * 小时房入住时间跨度。小时房特有字段。比如4小时的小时房，那么值为4
     */
    private String hourage;

    /**
     * 最早可选入住时间，小时房特有字段。格式为HH:mm
     */
    private String canCheckinEnd;

    /**
     * 最晚可选入住时间，小时房特有字段。格式为HH:mm
     */
    private String canCheckinStart;

    public void setAgreement(Long agreement) {
        this.agreement = agreement;
    }

    public Long getAgreement() {
        return this.agreement;
    }

    public void setBreakfastCal(String breakfastCal) {
        this.breakfastCal = breakfastCal;
    }

    public String getBreakfastCal() {
        return this.breakfastCal;
    }

    public void setBreakfastCount(Long breakfastCount) {
        this.breakfastCount = breakfastCount;
    }

    public Long getBreakfastCount() {
        return this.breakfastCount;
    }

    public void setCanCheckinEnd(String canCheckinEnd) {
        this.canCheckinEnd = canCheckinEnd;
    }

    public String getCanCheckinEnd() {
        return this.canCheckinEnd;
    }

    public void setCanCheckinStart(String canCheckinStart) {
        this.canCheckinStart = canCheckinStart;
    }

    public String getCanCheckinStart() {
        return this.canCheckinStart;
    }

    public void setCancelPolicy(String cancelPolicy) {
        this.cancelPolicy = cancelPolicy;
    }

    public String getCancelPolicy() {
        return this.cancelPolicy;
    }

    public void setCancelPolicyCal(String cancelPolicyCal) {
        this.cancelPolicyCal = cancelPolicyCal;
    }

    public String getCancelPolicyCal() {
        return this.cancelPolicyCal;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setDeadlineTime(Date deadlineTime) {
        this.deadlineTime = deadlineTime;
    }

    public Date getDeadlineTime() {
        return this.deadlineTime;
    }

    public void setEffectiveTime(Date effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public Date getEffectiveTime() {
        return this.effectiveTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getEnglishName() {
        return this.englishName;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public String getExtend() {
        return this.extend;
    }

    public void setFirstStay(Long firstStay) {
        this.firstStay = firstStay;
    }

    public Long getFirstStay() {
        return this.firstStay;
    }

    public void setGuaranteeCal(String guaranteeCal) {
        this.guaranteeCal = guaranteeCal;
    }

    public String getGuaranteeCal() {
        return this.guaranteeCal;
    }

    public void setGuaranteeStartTime(String guaranteeStartTime) {
        this.guaranteeStartTime = guaranteeStartTime;
    }

    public String getGuaranteeStartTime() {
        return this.guaranteeStartTime;
    }

    public void setGuaranteeType(Long guaranteeType) {
        this.guaranteeType = guaranteeType;
    }

    public Long getGuaranteeType() {
        return this.guaranteeType;
    }

    public void setHourage(String hourage) {
        this.hourage = hourage;
    }

    public String getHourage() {
        return this.hourage;
    }

    public void setMaxAdvHours(Long maxAdvHours) {
        this.maxAdvHours = maxAdvHours;
    }

    public Long getMaxAdvHours() {
        return this.maxAdvHours;
    }

    public void setMaxDays(Long maxDays) {
        this.maxDays = maxDays;
    }

    public Long getMaxDays() {
        return this.maxDays;
    }

    public void setMemberLevel(String memberLevel) {
        this.memberLevel = memberLevel;
    }

    public String getMemberLevel() {
        return this.memberLevel;
    }

    public void setMinAdvHours(Long minAdvHours) {
        this.minAdvHours = minAdvHours;
    }

    public Long getMinAdvHours() {
        return this.minAdvHours;
    }

    public void setMinAmount(Long minAmount) {
        this.minAmount = minAmount;
    }

    public Long getMinAmount() {
        return this.minAmount;
    }

    public void setMinDays(Long minDays) {
        this.minDays = minDays;
    }

    public Long getMinDays() {
        return this.minDays;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPaymentType(Long paymentType) {
        this.paymentType = paymentType;
    }

    public Long getPaymentType() {
        return this.paymentType;
    }

    public void setRateplanCode(String rateplanCode) {
        this.rateplanCode = rateplanCode;
    }

    public String getRateplanCode() {
        return this.rateplanCode;
    }

    public void setRpType(String rpType) {
        this.rpType = rpType;
    }

    public String getRpType() {
        return this.rpType;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getVendor() {
        return this.vendor;
    }

    public String getApiMethodName() {
        return "taobao.xhotel.rateplan.add";
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "RatePlan [action=" + action + ", rateplanCode=" + rateplanCode + ", name=" + name + ", paymentType="
                + paymentType + ", breakfastCount=" + breakfastCount + ", minDays=" + minDays + ", maxDays=" + maxDays
                + ", minAmount=" + minAmount + ", minAdvHours=" + minAdvHours + ", maxAdvHours=" + maxAdvHours
                + ", startTime=" + startTime + ", endTime=" + endTime + ", cancelPolicy=" + cancelPolicy + ", extend="
                + extend + ", status=" + status + ", englishName=" + englishName + ", guaranteeType=" + guaranteeType
                + ", guaranteeStartTime=" + guaranteeStartTime + ", memberLevel=" + memberLevel + ", channel="
                + channel + ", vendor=" + vendor + ", firstStay=" + firstStay + ", agreement=" + agreement
                + ", breakfastCal=" + breakfastCal + ", cancelPolicyCal=" + cancelPolicyCal + ", guaranteeCal="
                + guaranteeCal + ", effectiveTime=" + effectiveTime + ", deadlineTime=" + deadlineTime + ", rpType="
                + rpType + ", hourage=" + hourage + ", canCheckinEnd=" + canCheckinEnd + ", canCheckinStart="
                + canCheckinStart + "]";
    }
    
    
}
