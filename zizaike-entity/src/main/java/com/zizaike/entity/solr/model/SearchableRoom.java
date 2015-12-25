/**  
 * Project Name:zizaike-entity  
 * File Name:SearchableRoom.java  
 * Package Name:com.zizaike.entity.solr.model  
 * Date:2015年10月27日下午6:43:31  
 * Copyright (c) 2015, zizaike.com All Rights Reserved.  
 *  
 */

package com.zizaike.entity.solr.model;

/**
 * ClassName:SearchableRoom <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015年10月27日 下午6:43:31 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 * @see
 */
public class SearchableRoom {
    public static final String ID_FIELD = "id";
    public static final String VERSION_FIELD = "_version_";
    public static final String TEXT_FIELD = "text";
    public static final String CREATED_FIELD = "created";
    public static final String CHANGED_FIELD = "changed";
    public static final String UID_FIELD = "uid";
    public static final String USERNAME_FIELD = "username";
    public static final String TITLE_FIELD = "title";
    public static final String CONTENT_FIELD = "content";
    public static final String STATUS_FIELD = "status";
    public static final String VERIFIED_BY_ZZK_FIELD = "verified_by_zzk";
    public static final String ROOM_PRICE_FIELD = "room_price";
    public static final String INT_PRICE_FIELD = "int_price";
    public static final String INT_PRICE_TW_FIELD = "int_price_tw";
    public static final String ZZK_RANK_FIELD = "zzk_rank";
    public static final String INT_PRICE_TW_LIST_FIELD = "int_price_tw_list";
    public static final String INT_PRICE_CN_LIST_FIELD = "int_price_cn_list";
    public static final String DATE_LIST_FIELD = "date_list";
    public static final String DEST_ID_FIELD = "dest_id";
    public static final String BREAKFAST_FIELD = "breakfast";
    public static final String BREAKFASTREMARK_FIELD = "breakfastremark";
    public static final String ROOM_MODEL_FIELD = "room_model";
    public static final String ORDER_SUCC_FIELD = "order_succ";
    public static final String SPEED_ROOM_FIELD = "speed_room";
    public static final String COMMENT_NUM_FIELD = "comment_num";
    public static final String LOC_TYPEID_FIELD = "loc_typeid";
    public static final String LOC_TYPECODE_FIELD = "loc_typecode";
    public static final String LOC_TYPENAME_FIELD = "loc_typename";
    public static final String USERPOI_ID_FIELD = "userpoi_id";
    public static final String USER_ADDRESS_FIELD = "user_address";
    public static final String USER_TELNUM_FIELD = "user_telnum";
    public static final String USER_MAIL_FIELD = "user_mail";
    public static final String IMG_ID_FIELD = "img_id";
    public static final String USER_PHOTO_ID_FIELD = "user_photo_id";
    public static final String ROOM_THUM_IMG_FILE_FIELD = "room_thum_img_file";
    public static final String USER_PHOTO_FILE_FIELD = "user_photo_file";
    public static final String SHESHI_FIELD = "sheshi";
    public static final String ROOMSETTING_FIELD = "roomsetting";
    public static final String CHUANGSHU_FIELD = "chuangshu";
    public static final String CHUANGXING_FIELD = "chuangxing";
    public static final String WEISHENGJIAN_FIELD = "weishengjian";
    public static final String FANGJIASHUOMING_FIELD = "fangjiashuoming";
    public static final String MIANJI_FIELD = "mianji";
    public static final String ADD_BED_CHECK_FIELD = "add_bed_check";
    public static final String ADD_BED_NUM_FIELD = "add_bed_num";
    public static final String ADD_BED_PRICE_FIELD = "add_bed_price";
    public static final String SLAT_FIELD = "slat";
    public static final String SLNG_FIELD = "slng";
    public static final String USERPOI_TITLE_FIELD = "userpoi_title";
    public static final String USERPOI_ADDRESS_FIELD = "userpoi_address";
    public static final String USERPOI_PHONE_FIELD = "userpoi_phone";
    public static final String USERPOI_USER_NAME_FIELD = "userpoi_user_name";
    public static final String HAS_STORY_I_FIELD = "has_story_i";
    public static final String LATEST_SUCCESS_TIME_S_FIELD = "latest_success_time_s";
    public static final String ROOM_THUM_IMG_VERSION_I_FIELD = "room_thum_img_version_i";
    public static final String SOLDOUT_ROOM_DATES_SS_FIELD = "soldout_room_dates_ss";
    public static final String HOMESTAY_DEFAULT_IMAGE_S_FIELD = "homestay_default_image_s";
    public static final String HOMESTAY_IMG_VERSION_I_FIELD = "homestay_img_version_i";
    public static final String LATLNG_P_0_D_FIELD = "latlng_p_0_d";
    public static final String LATLNG_P_1_D_FIELD = "latlng_p_1_d";
    public static final String USER_STATUS_I_FIELD = "user_status_i";
    public static final String MINIMUM_STAY_I_FIELD = "minimum_stay_i";
    public static final String ROOM_PRICE_COUNT_CHECK_I_FIELD = "room_price_count_check_i";
    public static final String FOLLOW_LANGUAGE_S_FIELD = "follow_language_s";
    public static final String WIFI_I_FIELD = "wifi_i";
    public static final String PM_USERS_I_FIELD = "pm_users_i";
    public static final String PM_REPLY_I_FIELD = "pm_reply_i";
    public static final String PM_REPLY_RATE_I_FIELD = "pm_reply_rate_i";
    public static final String ALL_ORDER_I_FIELD = "all_order_i";
    public static final String ORDER_SELF_I_FIELD = "order_self_i";
    public static final String ORDER_SELF_RATE_I_FIELD = "order_self_rate_i";
    public static final String ORDER_HT_RATE_I_FIELD = "order_ht_rate_i";
    public static final String ROOM_NIGHTS_I_FIELD = "room_nights_i";
    public static final String PM_HT_RATE_I_FIELD = "pm_ht_rate_i";
    public static final String CAL_LAST_UPDATE_I_FIELD = "cal_last_update_i";
    public static final String HS_RATING_AVG_I_FIELD = "hs_rating_avg_i";
    public static final String HS_COMMENTS_NUM_I_FIELD = "hs_comments_num_i";
    public static final String ROOM_RATING_AVG_I_FIELD = "room_rating_avg_i";
    public static final String ROOM_COMMENTS_NUM_I_FIELD = "room_comments_num_i";
    public static final String JIESONG_SERVICE_I_FIELD = "jiesong_service_i";
    public static final String BAOCHE_SERVICE_I_FIELD = "baoche_service_i";
    public static final String OTHER_SERVICE_I_FIELD = "other_service_i";
    public static final String OTHER_SERVICE_TCN_FIELD = "other_service_tcn";
    public static final String CATEGORY_TAGS_SS_FIELD = "category_tags_ss";
    public static final String CATEGORY_TAGS_S_FIELD = "category_tags_s";
    public static final String SCORE_F_FIELD = "score_f";
    public static final String DISTANCE_FIELD = "distance";
    public static final String HS_SPEED_ROOM_I_FIELD = "hs_speed_room_i";
    public static final String DISCOUNT_ROOM_DATES_SS_FIELD = "discount_room_dates_ss";
    public static final String IS_BNB_CUXIAO_I_FIELD = "is_bnb_cuxiao_i";
    public static final String IS_BNB_FIRST_ORDER_I_FIELD = "is_bnb_first_order_i";


}
