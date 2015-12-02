  
package com.zizaike.entity.solr.model;  

import org.springframework.data.solr.core.query.Field;


/**  
 * ClassName:SolrSearchableRoomFields <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2015年10月27日 下午6:46:56 <br/>  
 * @author   snow.zhang  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */
public enum SolrSearchableRoomFields implements Field{
    ID(SearchableRoom.ID_FIELD),
    VERSION(SearchableRoom.VERSION_FIELD),
    TEXT(SearchableRoom.TEXT_FIELD),
    CREATED(SearchableRoom.CREATED_FIELD),
    CHANGED(SearchableRoom.CHANGED_FIELD),
    UID(SearchableRoom.UID_FIELD),
    USERNAME(SearchableRoom.USERNAME_FIELD),
    TITLE(SearchableRoom.TITLE_FIELD),
    CONTENT(SearchableRoom.CONTENT_FIELD),
    STATUS(SearchableRoom.STATUS_FIELD),
    VERIFIED_BY_ZZK(SearchableRoom.VERIFIED_BY_ZZK_FIELD),
    ROOM_PRICE(SearchableRoom.ROOM_PRICE_FIELD),
    INT_PRICE(SearchableRoom.INT_PRICE_FIELD),
    INT_PRICE_TW(SearchableRoom.INT_PRICE_TW_FIELD),
    ZZK_RANK(SearchableRoom.ZZK_RANK_FIELD),
    INT_PRICE_TW_LIST(SearchableRoom.INT_PRICE_TW_LIST_FIELD),
    INT_PRICE_CN_LIST(SearchableRoom.INT_PRICE_CN_LIST_FIELD),
    DATE_LIST(SearchableRoom.DATE_LIST_FIELD),
    DEST_ID(SearchableRoom.DEST_ID_FIELD),
    BREAKFAST(SearchableRoom.BREAKFAST_FIELD),
    BREAKFASTREMARK(SearchableRoom.BREAKFASTREMARK_FIELD),
    ROOM_MODEL(SearchableRoom.ROOM_MODEL_FIELD),
    ORDER_SUCC(SearchableRoom.ORDER_SUCC_FIELD),
    SPEED_ROOM(SearchableRoom.SPEED_ROOM_FIELD),
    COMMENT_NUM(SearchableRoom.COMMENT_NUM_FIELD),
    LOC_TYPEID(SearchableRoom.LOC_TYPEID_FIELD),
    LOC_TYPECODE(SearchableRoom.LOC_TYPECODE_FIELD),
    LOC_TYPENAME(SearchableRoom.LOC_TYPENAME_FIELD),
    USERPOI_ID(SearchableRoom.USERPOI_ID_FIELD),
    USER_ADDRESS(SearchableRoom.USER_ADDRESS_FIELD),
    USER_TELNUM(SearchableRoom.USER_TELNUM_FIELD),
    USER_MAIL(SearchableRoom.USER_MAIL_FIELD),
    IMG_ID(SearchableRoom.IMG_ID_FIELD),
    USER_PHOTO_ID(SearchableRoom.USER_PHOTO_ID_FIELD),
    ROOM_THUM_IMG_FILE(SearchableRoom.ROOM_THUM_IMG_FILE_FIELD),
    USER_PHOTO_FILE(SearchableRoom.USER_PHOTO_FILE_FIELD),
    SHESHI(SearchableRoom.SHESHI_FIELD),
    ROOMSETTING(SearchableRoom.ROOMSETTING_FIELD),
    CHUANGSHU(SearchableRoom.CHUANGSHU_FIELD),
    CHUANGXING(SearchableRoom.CHUANGXING_FIELD),
    WEISHENGJIAN(SearchableRoom.WEISHENGJIAN_FIELD),
    FANGJIASHUOMING(SearchableRoom.FANGJIASHUOMING_FIELD),
    ADD_BED_CHECK(SearchableRoom.ADD_BED_CHECK_FIELD),
    ADD_BED_NUM(SearchableRoom.ADD_BED_NUM_FIELD),
    ADD_BED_PRICE(SearchableRoom.ADD_BED_PRICE_FIELD),
    SLAT(SearchableRoom.SLAT_FIELD),
    SLNG(SearchableRoom.SLNG_FIELD),
    USERPOI_TITLE(SearchableRoom.USERPOI_TITLE_FIELD),
    USERPOI_ADDRESS(SearchableRoom.USERPOI_ADDRESS_FIELD),
    USERPOI_PHONE(SearchableRoom.USERPOI_PHONE_FIELD),
    USERPOI_USER_NAME(SearchableRoom.USERPOI_USER_NAME_FIELD),
    HAS_STORY_I(SearchableRoom.HAS_STORY_I_FIELD),
    LATEST_SUCCESS_TIME_S(SearchableRoom.LATEST_SUCCESS_TIME_S_FIELD),
    ROOM_THUM_IMG_VERSION_I(SearchableRoom.ROOM_THUM_IMG_VERSION_I_FIELD),
    SOLDOUT_ROOM_DATES_SS(SearchableRoom.SOLDOUT_ROOM_DATES_SS_FIELD),
    HOMESTAY_DEFAULT_IMAGE_S(SearchableRoom.HOMESTAY_DEFAULT_IMAGE_S_FIELD),
    HOMESTAY_IMG_VERSION_I(SearchableRoom.HOMESTAY_IMG_VERSION_I_FIELD),
    LATLNG_P_0_D(SearchableRoom.LATLNG_P_0_D_FIELD),
    LATLNG_P_1_D(SearchableRoom.LATLNG_P_1_D_FIELD),
    USER_STATUS_I(SearchableRoom.USER_STATUS_I_FIELD),
    MINIMUM_STAY_I(SearchableRoom.MINIMUM_STAY_I_FIELD),
    ROOM_PRICE_COUNT_CHECK_I(SearchableRoom.ROOM_PRICE_COUNT_CHECK_I_FIELD),
    FOLLOW_LANGUAGE_S(SearchableRoom.FOLLOW_LANGUAGE_S_FIELD),
    WIFI_I(SearchableRoom.WIFI_I_FIELD),
    PM_USERS_I(SearchableRoom.PM_USERS_I_FIELD),
    PM_REPLY_I(SearchableRoom.PM_REPLY_I_FIELD),
    PM_REPLY_RATE_I(SearchableRoom.PM_REPLY_RATE_I_FIELD),
    ALL_ORDER_I(SearchableRoom.ALL_ORDER_I_FIELD),
    ORDER_SELF_I(SearchableRoom.ORDER_SELF_I_FIELD),
    ORDER_SELF_RATE_I(SearchableRoom.ORDER_SELF_RATE_I_FIELD),
    ORDER_HT_RATE_I(SearchableRoom.ORDER_HT_RATE_I_FIELD),
    ROOM_NIGHTS_I(SearchableRoom.ROOM_NIGHTS_I_FIELD),
    PM_HT_RATE_I(SearchableRoom.PM_HT_RATE_I_FIELD),
    CAL_LAST_UPDATE_I(SearchableRoom.CAL_LAST_UPDATE_I_FIELD),
    HS_RATING_AVG_I(SearchableRoom.HS_RATING_AVG_I_FIELD),
    HS_COMMENTS_NUM_I(SearchableRoom.HS_COMMENTS_NUM_I_FIELD),
    ROOM_COMMENTS_NUM_I(SearchableRoom.ROOM_COMMENTS_NUM_I_FIELD),
    JIESONG_SERVICE_I(SearchableRoom.JIESONG_SERVICE_I_FIELD),
    BAOCHE_SERVICE_I(SearchableRoom.BAOCHE_SERVICE_I_FIELD),
    OTHER_SERVICE_I(SearchableRoom.OTHER_SERVICE_I_FIELD),
    OTHER_SERVICE_TCN(SearchableRoom.OTHER_SERVICE_TCN_FIELD),
    CATEGORY_TAGS_SS(SearchableRoom.CATEGORY_TAGS_SS_FIELD),
    CATEGORY_TAGS_S(SearchableRoom.CATEGORY_TAGS_S_FIELD),
    SCORE_F(SearchableRoom.SCORE_F_FIELD),
    DISTANCE(SearchableRoom.DISTANCE_FIELD),
    HS_SPEED_ROOM_I_FIELD(SearchableRoom.HS_SPEED_ROOM_I_FIELD),
    ;
    private  String fieldName;
    
    private  SolrSearchableRoomFields(String fieldName) {
        this.fieldName = fieldName; 
    }
    
    @Override
    public String getName() {
        return fieldName;
    }

}
  
