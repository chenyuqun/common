/**
 * 
 */
package com.zizaike.entity.solr.model;

import org.springframework.data.solr.core.query.Field;

/**
 * 
 * ClassName: SolrSearchableUserFields <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason: TODO ADD REASON(可选). <br/>  
 * date: 2015年10月28日 下午3:17:38 <br/>  
 *  
 * @author alex 
 * @version   
 * @since JDK 1.7
 */
public enum SolrSearchableUserFields implements Field{
    
    ID(SearchableUser.ID_FIELD),
    VERSION(SearchableUser.VERSION_FIELD),
    TEXT(SearchableUser.TEXT_FIELD),
    CREATED(SearchableUser.CREATED_FIELD),
    CHANGED(SearchableUser.CHANGED_FIELD),
    UID(SearchableUser.UID_FIELD),
    USERNAME(SearchableUser.USERNAME_FIELD),
    NICKNAME(SearchableUser.NICKNAME_FIELD),
    USERMAIL(SearchableUser.USERMAIL_FIELD),
    ADDRESS(SearchableUser.ADDRESS_FIELD),
    PHONE(SearchableUser.PHONE_FIELD),
    USER_PHOTO_ID(SearchableUser.USER_PHOTO_ID_FIELD),
    USER_PHOTO_FILE(SearchableUser.USER_PHOTO_FILE_FIELD),
    HOMESTAY_PHOTO_FILE(SearchableUser.HOMESTAY_PHOTO_FILE_FIELD),
    BLANK_ACCOUNT(SearchableUser.BLANK_ACCOUNT_FIELD),
    ABOUTME(SearchableUser.ABOUTME_FIELD),
    ADDITIONAL_SERVICES(SearchableUser.ADDITIONAL_SERVICES_FIELD),
    DINGFANGSHUOMING(SearchableUser.DINGFANGSHUOMING_FIELD),
    ZHUYISHIXIANG(SearchableUser.ZHUYISHIXIANG_FIELD),
    JIAOTONGZIXUN(SearchableUser.JIAOTONGZIXUN_FIELD),
    HUODONG(SearchableUser.HUODONG_FIELD),
    ROOM_NUM(SearchableUser.ROOM_NUM_FIELD),
    ORDER_SUCC(SearchableUser.ORDER_SUCC_FIELD),
    PMSG_REPLY(SearchableUser.PMSG_REPLY_FIELD),
    SEND_SMS(SearchableUser.SEND_SMS_FIELD),
    SEND_SMS_TELNUM(SearchableUser.SEND_SMS_TELNUM_FIELD),
    FOLLOW_LANGUAGE(SearchableUser.FOLLOW_LANGUAGE_FIELD),
    COMMENT_NUM(SearchableUser.COMMENT_NUM_FIELD),
    INT_ROOM_NID(SearchableUser.INT_ROOM_NID_FIELD),
    INT_ROOM_PRICE(SearchableUser.INT_ROOM_PRICE_FIELD),
    INT_ROOM_PRICE_TW(SearchableUser.INT_ROOM_PRICE_TW_FIELD),
    LOC_TYPEID(SearchableUser.LOC_TYPEID_FIELD),
    LOC_TYPECODE(SearchableUser.LOC_TYPECODE_FIELD),
    LOC_TYPENAME(SearchableUser.LOC_TYPENAME_FIELD),
    PID(SearchableUser.PID_FIELD),
    POI_TITLE(SearchableUser.POI_TITLE_FIELD),
    POI_PHONE(SearchableUser.POI_PHONE_FIELD),
    POI_EMAIL(SearchableUser.POI_EMAIL_FIELD),
    POI_MASTER(SearchableUser.POI_MASTER_FIELD),
    POI_ADDRESS(SearchableUser.POI_ADDRESS_FIELD),
    POI_IMAGES(SearchableUser.POI_IMAGES_FIELD),
    STATUS(SearchableUser.STATUS_FIELD),
    VERIFIED_BY_ZZK(SearchableUser.VERIFIED_BY_ZZK_FIELD),
    ZZK_WEIGHTS(SearchableUser.ZZK_WEIGHTS_FIELD),
    REV_PERCENT(SearchableUser.REV_PERCENT_FIELD),
    PRICE_PERCENT(SearchableUser.PRICE_PERCENT_FIELD),
    REBATE_NUM(SearchableUser.REBATE_NUM_FIELD),
    REBATE_REMARK(SearchableUser.REBATE_REMARK_FIELD),
    BLANK_ACCOUNT_POI(SearchableUser.BLANK_ACCOUNT_POI_FIELD),
    BLANK_NAME(SearchableUser.BLANK_NAME_FIELD),
    BLANK_NAME_SUB(SearchableUser.BLANK_NAME_SUB_FIELD),
    BLANK_USERNAME(SearchableUser.BLANK_USERNAME_FIELD),
    BLANK_DAIHAO(SearchableUser.BLANK_DAIHAO_FIELD),
    BLANK_DAIHAO_SUB(SearchableUser.BLANK_DAIHAO_SUB_FIELD),
    ALIPAY_ACCOUNT(SearchableUser.ALIPAY_ACCOUNT_FIELD),
    PAYPAL_ACCOUNT(SearchableUser.PAYPAL_ACCOUNT_FIELD),
    DEST_ID(SearchableUser.DEST_ID_FIELD),
    CN_BLANK_ACCOUNT(SearchableUser.CN_BLANK_ACCOUNT_FIELD),
    CN_BLANK_NAME(SearchableUser.CN_BLANK_NAME_FIELD),
    CN_BLANK_NAME_SUB(SearchableUser.CN_BLANK_NAME_SUB_FIELD),
    CN_BLANK_USERNAME(SearchableUser.CN_BLANK_USERNAME_FIELD),
    SLAT(SearchableUser.SLAT_FIELD),
    SLNG(SearchableUser.SLNG_FIELD),
    DEFAULT_IMAGE_S(SearchableUser.DEFAULT_IMAGE_S_FIELD),
    LATEST_SUCCESS_TIME_S(SearchableUser.LATEST_SUCCESS_TIME_S_FIELD),
    BREAKFAST_I(SearchableUser.BREAKFAST_I_FIELD),
    LATLNG_P_0_D(SearchableUser.LATLNG_P_0_D_FIELD),
    LATLNG_P_1_D(SearchableUser.LATLNG_P_1_D_FIELD),
    LATLNG_P(SearchableUser.LATLNG_P_FIELD),
    USER_PHOTO_VERSION_I(SearchableUser.USER_PHOTO_VERSION_I_FIELD),
    PM_USERS_I(SearchableUser.PM_USERS_I_FIELD),
    HS_SPEED_ROOM_I(SearchableUser.HS_SPEED_ROOM_I_FIELD),
    LOCATION_TYPEID(SearchableUser.LOCATION_TYPEID_FIELD),
    LOCATION_TYPECODE(SearchableUser.LOCATION_TYPECODE_FIELD),
    LOCATION_TYPENAME(SearchableUser.LOCATION_TYPENAME_FIELD),
    ;
    /**
     * fileName
     */
    private  String fieldName;
    /**
     * 
     * Creates a new instance of SolrSearchableUserFields.  
     *  
     * @param fieldName
     */
    private  SolrSearchableUserFields(String filed) {
        this.fieldName = filed; 
    }
    
    @Override
    public String getName() {
        return fieldName;
    }
}
