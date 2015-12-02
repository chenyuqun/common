/**  
 * Project Name:zizaike-entity  
 * File Name:Room.java  
 * Package Name:com.zizaike.entity.solr  
 * Date:2015年10月27日下午6:42:22  
 * Copyright (c) 2015, zizaike.com All Rights Reserved.  
 *  
 */

package com.zizaike.entity.solr;

import java.util.List;

import org.apache.solr.client.solrj.beans.Field;

import com.alibaba.fastjson.annotation.JSONType;
import com.zizaike.entity.solr.model.SearchableRoom;

/**
 * ClassName:Room <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 房间信息 <br/>
 * Date: 2015年10月27日 下午6:41:20 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.6
 * @see
 */
@JSONType(ignores={"title"})
public class Room extends SearchableRoom implements java.io.Serializable{
    private static final long serialVersionUID = -1880464345310885435L;
    /**
     * 房间id
     */
    @Field(ID_FIELD)
    private int id;
    @Field(VERSION_FIELD)
    private long version;
    @Field(TEXT_FIELD)
    private String text;
    /**
     * 房间创建时间
     */
    @Field(CREATED_FIELD)
    private int created;
    /**
     * 房间更新时间
     */
    @Field(CHANGED_FIELD)
    private int changed;
    /**
     * 关联民宿主键id
     */
    @Field(UID_FIELD)
    private int uid;
    /**
     * 民宿名字
     */
    @Field(USERNAME_FIELD)
    private String username;
    /**
     * 房间名字
     */
    @Field(TITLE_FIELD)
    private String title;
    /**
     * 房间简介
     */
    @Field(CONTENT_FIELD)
    private String content;
    /**
     * 房间是否发布 不发布的房间应该不会再推上去了，所以应该都为1
     */
    @Field(STATUS_FIELD)
    private int status;
    /**
     * 是否认证 drupal_users.pid是否大于0 一般认证的民才需要加到solr
     */
    @Field(VERIFIED_BY_ZZK_FIELD)
    private int verified;
    /**
     * 之前房间编辑可以填写最低价,现在都是根据日历计算，所以都是tbd Tbd 待讨论
     */
    @Field(ROOM_PRICE_FIELD)
    private String roomPrice;
    /**
     * 最低价，人民币 通过 t_room_status_tracs t_rpconfig_v2计算
     */
    @Field(INT_PRICE_FIELD)
    private int intPrice;
    /**
     * 最低价，原价（台币、日币、美元等） 通过 t_room_status_tracs t_rpconfig_v2计算
     */
    @Field(INT_PRICE_TW_FIELD)
    private int intPriceTW;
    /**
     * Drupal_node.nsort 具体什么计算规则我也不清楚
     */
    @Field(ZZK_RANK_FIELD)
    private int zzkRank;
    /**
     * 现在应该不用了
     */
    @Field(INT_PRICE_TW_LIST_FIELD)
    private String intPriceTwList;
    /**
     * 现在应该不用了
     */
    @Field(INT_PRICE_CN_LIST_FIELD)
    private String intPriceCnList;
    /**
     * 现在应该不用了
     */
    @Field(DATE_LIST_FIELD)
    private String dateList;
    /**
     * 目的地id Drupal_node.dest_id
     */
    @Field(DEST_ID_FIELD)
    private int destId;

    /**
     * 民宿是否有早餐 用民宿uid关联
     */
    @Field(BREAKFAST_FIELD)
    private int breakfast;
    /**
     * 早餐备注
     */
    @Field(BREAKFASTREMARK_FIELD)
    private String breakfastRemark;
    /**
     * 房型、可以入住几人 drupal_field_data_field_room_beds Entity_id对应drupal_node.nid field_room_beds_tid 表中的值对应的人数 '320'=>0,
     * '309'=>1, '310'=>2, '315'=>3, '313'=>4, '321'=>5, '312'=>6, '322'=>7, '311'=>8, '323'=>9, '314'=>10,
     */
    @Field(ROOM_MODEL_FIELD)
    private String roomModel;

    /**
     * 成交数 drupal_node.order_succ
     */
    @Field(ORDER_SUCC_FIELD)
    private int orderSucc;
    /**
     * 是否是速订民宿 drupal_node.speed_room
     */
    @Field(SPEED_ROOM_FIELD)
    private int speedRoom;
    /**
     * 点评数量 不用了
     */
    @Field(COMMENT_NUM_FIELD)
    private int commentNum;
    /**
     * 民宿所在区县id t_weibo_poi_tw. loc_typecode t_weibo_poi_tw.uid 和drupal_node.uid关联 格式化了一下 把之前的1,8,553,去掉了
     */
    @Field(LOC_TYPEID_FIELD)
    private int locTypeId;
    /**
     * 民宿所在区县id t_weibo_poi_tw. loc_typecode t_weibo_poi_tw.uid 和drupal_node.uid关联 格式化了一下 把之前的1,8,553,去掉了
     */
    @Field(LOC_TYPECODE_FIELD)
    private String locTypeCode;
    /**
     * 民宿所在区县名称 t_loc_type.type_name 通过上面的loc_typeid与t_loc_type.locid关联
     */
    @Field(LOC_TYPENAME_FIELD)
    private String locTypeName;
    /**
     * 民宿所在区县名称 t_loc_type.type_name 通过上面的loc_typeid与t_loc_type.locid关联
     */
    @Field(USERPOI_ID_FIELD)
    private int userpoiId;
    /**
     * 地址
     */
    @Field(USER_ADDRESS_FIELD)
    private String userAddress;
    /**
     * 电话
     */
    @Field(USER_TELNUM_FIELD)
    private String userTelnum;
    /**
     * 邮件
     */
    @Field(USER_MAIL_FIELD)
    private String userMail;
    /**
     * 房间第一张图片id
     * 通过drupal_field_data_field_image.entity_id与drupal_node.nid关联，drupal_field_data_field_image.bundle=’article’
     * entity_type = ‘node’获得图片id
     */
    @Field(IMG_ID_FIELD)
    private int imgId;
    /**
     * 民宿头像id drupal_users.picture
     */
    @Field(USER_PHOTO_ID_FIELD)
    private int userPhotoId;
    /**
     * 房间第一张图片文件名 用上面的img_id 如果id>200000，t_img_managed .uri where fid = img_id 否则drupal_file_managed.uri where fid =
     * img_id
     */
    @Field(ROOM_THUM_IMG_FILE_FIELD)
    private String roomThumImgFile;
    /**
     * 同上 用user_photo_id去查
     */
    @Field(USER_PHOTO_FILE_FIELD)
    private String userPhotoFile;
    /**
     * 设施 drupal_field_data_field__sheshi
     */
    @Field(SHESHI_FIELD)
    private String sheshi;
    /**
     * 设施 drupal_node.roomsetting 里面是个json，解析出来 key对应的是下面的key，1表示有，0表示无 1=>"电视机", 2=>"电冰箱", 3=>"空调", 4=>"热水壶", 5=>"吹风机",
     * 7=>"洗衣机", 8=>"音响", 9=>"独立卫浴", 10=>"24小时热水", 11=>"淋浴", 12=>"热水浴缸", 13=>"毛巾", 14=>"拖鞋", 15=>"一次性盥洗用品", 16=>"无线网络",
     * 17=>"有线网络", //18=>"免费早餐", 19=>"免费下午茶", 20=>"免费接送", 21=>"免费脚踏车", 22=>"代订门票", 23=>"代订包车", 24=>"行李寄存",
     */
    @Field(ROOMSETTING_FIELD)
    private String roomSetting;
    /**
     * 床数 drupal_field_data_field__chuangshu 得到的值去 drupal_taxonomy_term_data 上去查
     */
    @Field(CHUANGSHU_FIELD)
    private String chuangshu;
    /**
     * 床型 drupal_field_data_field__chuangxing
     */
    @Field(CHUANGXING_FIELD)
    private String chuangxing;
    /**
     * 卫生间 drupal_field_data_field_weishengjian
     */
    @Field(WEISHENGJIAN_FIELD)
    private String weishengjian;
    /**
     * 房价说明 drupal_field_data_field__fangjiashuoming 分词 ,现在后台已经不能编辑维护了，但前台还用不用不知道。
     */
    @Field(FANGJIASHUOMING_FIELD)
    private String fangjiashuoming;
    /**
     * 面积 drupal_field_data_field_mianji
     */
    @Field(MIANJI_FIELD)
    private String mianji;
    /**
     * 是否可以加人 drupal_node. add_bed_check
     */
    @Field(ADD_BED_CHECK_FIELD)
    private String addBedCheck;
    /**
     * 可加人数 drupal_node. add_bed_num
     */
    @Field(ADD_BED_NUM_FIELD)
    private String addBedNum;
    /**
     * 每加一人多少钱 drupal_node. add_bed_price
     */
    @Field(ADD_BED_PRICE_FIELD)
    private String addBedPrice;
    /**
     * 民宿纬度 t_weibo_poi_tw .lat
     */
    @Field(SLAT_FIELD)
    private Double slat;
    /**
     * 民宿经度 t_weibo_poi_tw.lon
     */
    @Field(SLNG_FIELD)
    private Double slng;
    /**
     * 民宿认证名 t_weibo_poi_tw.title 已经不用了 用username
     */
    @Field(USERPOI_TITLE_FIELD)
    private String userpoiTitle;
    /**
     * 民宿认证地址 t_weibo_poi_tw.address 已经不用了 用user_address
     */
    @Field(USERPOI_ADDRESS_FIELD)
    private String userpoiAddress;
    /**
     * 民宿认证电话 t_weibo_poi_tw.phone 已经不用，用user_telnum
     */
    @Field(USERPOI_PHONE_FIELD)
    private String userpoiPhone;
    /**
     * 民宿主人名字 t_webo_poi_tw. user_name
     */
    @Field(USERPOI_USER_NAME_FIELD)
    private String userpoiUserName;
    /**
     * 是否有故事 给你个sql代码，见下
     */
    @Field(HAS_STORY_I_FIELD)
    private int hasStoryI;
    /**
     * 最后成交时间 通过订单表和日志表关联获得最终成交 select count(distinct a.nid) from LKYou.t_homestay_booking a,
     * LKYou.log_homestay_booking_trac b where a.id = b.bid and b.status = 2 and from_unixtime(b.create_date) > ?;
     */
    @Field(LATEST_SUCCESS_TIME_S_FIELD)
    private String latestSuccessTimeS;
    /**
     * 房间第一个图片的版本 通过上面的img_id 如果大于20万就是1 否则就是0
     */
    @Field(ROOM_THUM_IMG_VERSION_I_FIELD)
    private int roomThumImgVersionI;
    /**
     * 没有空房的日期 t_room_status_tracs的room_num和beds_num 通过drupal_node. room_price_count_check判断。如果是2就用beds_num否则就用room_num
     */
    @Field(SOLDOUT_ROOM_DATES_SS_FIELD)
    private List<String> soldoutRoomDatesSs;
    /**
     * 民宿的第一张图片
     * drupal_field_data_field_image.entity_id与drupal_node.nid关联，且drupal_field_data_field_image.bundle=’article’
     * entity_type = ‘user获得图片id 若id大于20万，则通过t_img_managed 否则通过drupal_file_mamaged
     */
    @Field(HOMESTAY_DEFAULT_IMAGE_S_FIELD)
    private String homestayDefaultImageS;
    /**
     * 民宿第一张图片版本 同上，如果id大于20万，为1，否则为0
     */
    @Field(HOMESTAY_IMG_VERSION_I_FIELD)
    private int homestayImgVersionI;
    /**
     * 纬度 同上slat
     */
    @Field(LATLNG_P_0_D_FIELD)
    private Double latlngP0D;
    /**
     * 经度 同上slng
     */
    @Field(LATLNG_P_1_D_FIELD)
    private Double latlngP1D;
    /**
     * 民宿状态 drupal_users.status 区别于上面的房间status 但同样status=0没上架应该不需要记到solr里
     */
    @Field(USER_STATUS_I_FIELD)
    private int userStatusI;
    /**
     * 最小入住天数 drupal_node. room_price_count_check 1是按间卖、2是按人卖
     */
    @Field(MINIMUM_STAY_I_FIELD)
    private int minimumStayI;
    /**
     * 按人卖还是按间卖 drupal_node. minimum_stay
     */
    @Field(ROOM_PRICE_COUNT_CHECK_I_FIELD)
    private int roomPriceCountCheckI;
    /**
     * 语言 也是json，和上面的设施类似 下面提供个配置数组
     */
    @Field(FOLLOW_LANGUAGE_S_FIELD)
    private String followLanguageS;
    /**
     * wifi drupal_node.wifi
     */
    @Field(WIFI_I_FIELD)
    private int wifiI;
    /**
     * 私信客人数 drupal_users. pm_users
     */
    @Field(PM_USERS_I_FIELD)
    private int pmUsersI;
    /**
     * 私信回复数 drupal_users. pm_reply
     */
    @Field(PM_REPLY_I_FIELD)
    private int pmReplyI;
    /**
     * 私信回复比例 drupal_users. pm_reply_rate_i
     */
    @Field(PM_REPLY_RATE_I_FIELD)
    private int pmReplyRateI;
    /**
     * 订单数 drupal_users. all_order
     */
    @Field(ALL_ORDER_I_FIELD)
    private int allOrderI;
    /**
     * 自助处理订单数 drupal_users. order_self_i
     */
    @Field(ORDER_SELF_I_FIELD)
    private int orderSelfI;
    /**
     * 自助成交比例 drupal_users. order_self_rate
     */
    @Field(ORDER_SELF_RATE_I_FIELD)
    private int orderSelfRateI;
    /**
     * xx小时内处理订单数量 drupal_users. order_ht_rate
     */
    @Field(ORDER_HT_RATE_I_FIELD)
    private int orderHtRateI;
    /**
     * 间夜数 drupal_users. room_nights
     */
    @Field(ROOM_NIGHTS_I_FIELD)
    private int roomNightsI;
    /**
     * xx时间内回复私信数量 drupal_users. pm_ht_rate
     */
    @Field(PM_HT_RATE_I_FIELD)
    private int pmHtRateI;
    /**
     * drupal_users. cal_last_update
     */
    @Field(CAL_LAST_UPDATE_I_FIELD)
    private int calLastUpdateI;
    /**
     * 民宿点评平均分drupal_users. hs_rating_avg
     */
    @Field(HS_RATING_AVG_I_FIELD)
    private int hsRatingAvgI;
    /**
     * xx时间内回复私信数量 drupal_users. pm_ht_rate
     */
    @Field(HS_COMMENTS_NUM_I_FIELD)
    private int hsCommentsNumI;
    /**
     * 房间点评平均分drupal_users. room_rating_avg
     */
    @Field(ROOM_RATING_AVG_I_FIELD)
    private int roomRatingAvgI;
    /**
     * 房间点评数量drupal_users. room_comments
     */
    @Field(ROOM_COMMENTS_NUM_I_FIELD)
    private int roomCommentsNumI;
    /**
     * 接送服务 drupal_users. jiesong_service
     */
    @Field(JIESONG_SERVICE_I_FIELD)
    private int jiesongServiceI;
    /**
     * 包车服务 drupal_users. baoche_service
     */
    @Field(BAOCHE_SERVICE_I_FIELD)
    private int baocheServiceI;
    /**
     * 其他服务 drupal_users. other_service
     */
    @Field(OTHER_SERVICE_I_FIELD)
    private int otherServiceI;
    /**
     * 其他服务描述drupal_users. pm_ht_rate
     */
    @Field(OTHER_SERVICE_TCN_FIELD)
    private String otherServiceTcn;
    /**
     * 民宿分类标签，见国内民宿 drupal_users. category_tags
     */
    @Field(CATEGORY_TAGS_SS_FIELD)
    private List<String> categoryTagsSs;
    /**
     * 由上面的替换
     */
    @Field(CATEGORY_TAGS_S_FIELD)
    private String categoryTagsS;
    /**
     * 自定义评分 t_homestay_score.score
     */
    @Field(SCORE_F_FIELD)
    private float scoreF;
    @Field(DISTANCE_FIELD)
    private Double distance;
    @Field(HS_SPEED_ROOM_I_FIELD)
    private int hsSpeedRoomI;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public long getVersion() {
        return version;
    }
    public void setVersion(long version) {
        this.version = version;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public int getCreated() {
        return created;
    }
    public void setCreated(int created) {
        this.created = created;
    }
    public int getChanged() {
        return changed;
    }
    public void setChanged(int changed) {
        this.changed = changed;
    }
    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public int getVerified() {
        return verified;
    }
    public void setVerified(int verified) {
        this.verified = verified;
    }
    public String getRoomPrice() {
        return roomPrice;
    }
    public void setRoomPrice(String roomPrice) {
        this.roomPrice = roomPrice;
    }
    public int getIntPrice() {
        return intPrice;
    }
    public void setIntPrice(int intPrice) {
        this.intPrice = intPrice;
    }
    public int getIntPriceTW() {
        return intPriceTW;
    }
    public void setIntPriceTW(int intPriceTW) {
        this.intPriceTW = intPriceTW;
    }
    public int getZzkRank() {
        return zzkRank;
    }
    public void setZzkRank(int zzkRank) {
        this.zzkRank = zzkRank;
    }
    public String getIntPriceTwList() {
        return intPriceTwList;
    }
    public void setIntPriceTwList(String intPriceTwList) {
        this.intPriceTwList = intPriceTwList;
    }
    public String getIntPriceCnList() {
        return intPriceCnList;
    }
    public void setIntPriceCnList(String intPriceCnList) {
        this.intPriceCnList = intPriceCnList;
    }
    public String getDateList() {
        return dateList;
    }
    public void setDateList(String dateList) {
        this.dateList = dateList;
    }
    public int getDestId() {
        return destId;
    }
    public void setDestId(int destId) {
        this.destId = destId;
    }
    public int getBreakfast() {
        return breakfast;
    }
    public void setBreakfast(int breakfast) {
        this.breakfast = breakfast;
    }
    public String getBreakfastRemark() {
        return breakfastRemark;
    }
    public void setBreakfastRemark(String breakfastRemark) {
        this.breakfastRemark = breakfastRemark;
    }
    public String getRoomModel() {
        return roomModel;
    }
    public void setRoomModel(String roomModel) {
        this.roomModel = roomModel;
    }
    public int getOrderSucc() {
        return orderSucc;
    }
    public void setOrderSucc(int orderSucc) {
        this.orderSucc = orderSucc;
    }
    public int getSpeedRoom() {
        return speedRoom;
    }
    public void setSpeedRoom(int speedRoom) {
        this.speedRoom = speedRoom;
    }
    public int getCommentNum() {
        return commentNum;
    }
    public void setCommentNum(int commentNum) {
        this.commentNum = commentNum;
    }
    public int getLocTypeId() {
        return locTypeId;
    }
    public void setLocTypeId(int locTypeId) {
        this.locTypeId = locTypeId;
    }
    public String getLocTypeCode() {
        return locTypeCode;
    }
    public void setLocTypeCode(String locTypeCode) {
        this.locTypeCode = locTypeCode;
    }
    public String getLocTypeName() {
        return locTypeName;
    }
    public void setLocTypeName(String locTypeName) {
        this.locTypeName = locTypeName;
    }
    public int getUserpoiId() {
        return userpoiId;
    }
    public void setUserpoiId(int userpoiId) {
        this.userpoiId = userpoiId;
    }
    public String getUserAddress() {
        return userAddress;
    }
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
    public String getUserTelnum() {
        return userTelnum;
    }
    public void setUserTelnum(String userTelnum) {
        this.userTelnum = userTelnum;
    }
    public String getUserMail() {
        return userMail;
    }
    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }
    public int getImgId() {
        return imgId;
    }
    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
    public int getUserPhotoId() {
        return userPhotoId;
    }
    public void setUserPhotoId(int userPhotoId) {
        this.userPhotoId = userPhotoId;
    }
    public String getRoomThumImgFile() {
        return roomThumImgFile;
    }
    public void setRoomThumImgFile(String roomThumImgFile) {
        this.roomThumImgFile = roomThumImgFile;
    }
    public String getUserPhotoFile() {
        return userPhotoFile;
    }
    public void setUserPhotoFile(String userPhotoFile) {
        this.userPhotoFile = userPhotoFile;
    }
    public String getSheshi() {
        return sheshi;
    }
    public void setSheshi(String sheshi) {
        this.sheshi = sheshi;
    }
    public String getRoomSetting() {
        return roomSetting;
    }
    public void setRoomSetting(String roomSetting) {
        this.roomSetting = roomSetting;
    }
    public String getChuangshu() {
        return chuangshu;
    }
    public void setChuangshu(String chuangshu) {
        this.chuangshu = chuangshu;
    }
    public String getChuangxing() {
        return chuangxing;
    }
    public void setChuangxing(String chuangxing) {
        this.chuangxing = chuangxing;
    }
    public String getWeishengjian() {
        return weishengjian;
    }
    public void setWeishengjian(String weishengjian) {
        this.weishengjian = weishengjian;
    }
    public String getFangjiashuoming() {
        return fangjiashuoming;
    }
    public void setFangjiashuoming(String fangjiashuoming) {
        this.fangjiashuoming = fangjiashuoming;
    }
    public String getMianji() {
        return mianji;
    }
    public void setMianji(String mianji) {
        this.mianji = mianji;
    }
    public String getAddBedCheck() {
        return addBedCheck;
    }
    public void setAddBedCheck(String addBedCheck) {
        this.addBedCheck = addBedCheck;
    }
    public String getAddBedNum() {
        return addBedNum;
    }
    public void setAddBedNum(String addBedNum) {
        this.addBedNum = addBedNum;
    }
    public String getAddBedPrice() {
        return addBedPrice;
    }
    public void setAddBedPrice(String addBedPrice) {
        this.addBedPrice = addBedPrice;
    }
    public Double getSlat() {
        return slat;
    }
    public void setSlat(Double slat) {
        this.slat = slat;
    }
    public Double getSlng() {
        return slng;
    }
    public void setSlng(Double slng) {
        this.slng = slng;
    }
    public String getUserpoiTitle() {
        return userpoiTitle;
    }
    public void setUserpoiTitle(String userpoiTitle) {
        this.userpoiTitle = userpoiTitle;
    }
    public String getUserpoiAddress() {
        return userpoiAddress;
    }
    public void setUserpoiAddress(String userpoiAddress) {
        this.userpoiAddress = userpoiAddress;
    }
    public String getUserpoiPhone() {
        return userpoiPhone;
    }
    public void setUserpoiPhone(String userpoiPhone) {
        this.userpoiPhone = userpoiPhone;
    }
    public String getUserpoiUserName() {
        return userpoiUserName;
    }
    public void setUserpoiUserName(String userpoiUserName) {
        this.userpoiUserName = userpoiUserName;
    }
    public int getHasStoryI() {
        return hasStoryI;
    }
    public void setHasStoryI(int hasStoryI) {
        this.hasStoryI = hasStoryI;
    }
    public String getLatestSuccessTimeS() {
        return latestSuccessTimeS;
    }
    public void setLatestSuccessTimeS(String latestSuccessTimeS) {
        this.latestSuccessTimeS = latestSuccessTimeS;
    }
    public int getRoomThumImgVersionI() {
        return roomThumImgVersionI;
    }
    public void setRoomThumImgVersionI(int roomThumImgVersionI) {
        this.roomThumImgVersionI = roomThumImgVersionI;
    }
    public List<String> getSoldoutRoomDatesSs() {
        return soldoutRoomDatesSs;
    }
    public void setSoldoutRoomDatesSs(List<String> soldoutRoomDatesSs) {
        this.soldoutRoomDatesSs = soldoutRoomDatesSs;
    }
    public String getHomestayDefaultImageS() {
        return homestayDefaultImageS;
    }
    public void setHomestayDefaultImageS(String homestayDefaultImageS) {
        this.homestayDefaultImageS = homestayDefaultImageS;
    }
    public int getHomestayImgVersionI() {
        return homestayImgVersionI;
    }
    public void setHomestayImgVersionI(int homestayImgVersionI) {
        this.homestayImgVersionI = homestayImgVersionI;
    }
    public Double getLatlngP0D() {
        return latlngP0D;
    }
    public void setLatlngP0D(Double latlngP0D) {
        this.latlngP0D = latlngP0D;
    }
    public Double getLatlngP1D() {
        return latlngP1D;
    }
    public void setLatlngP1D(Double latlngP1D) {
        this.latlngP1D = latlngP1D;
    }
    public int getUserStatusI() {
        return userStatusI;
    }
    public void setUserStatusI(int userStatusI) {
        this.userStatusI = userStatusI;
    }
    public int getMinimumStayI() {
        return minimumStayI;
    }
    public void setMinimumStayI(int minimumStayI) {
        this.minimumStayI = minimumStayI;
    }
    public int getRoomPriceCountCheckI() {
        return roomPriceCountCheckI;
    }
    public void setRoomPriceCountCheckI(int roomPriceCountCheckI) {
        this.roomPriceCountCheckI = roomPriceCountCheckI;
    }
    public String getFollowLanguageS() {
        return followLanguageS;
    }
    public void setFollowLanguageS(String followLanguageS) {
        this.followLanguageS = followLanguageS;
    }
    public int getWifiI() {
        return wifiI;
    }
    public void setWifiI(int wifiI) {
        this.wifiI = wifiI;
    }
    public int getPmUsersI() {
        return pmUsersI;
    }
    public void setPmUsersI(int pmUsersI) {
        this.pmUsersI = pmUsersI;
    }
    public int getPmReplyI() {
        return pmReplyI;
    }
    public void setPmReplyI(int pmReplyI) {
        this.pmReplyI = pmReplyI;
    }
    public int getPmReplyRateI() {
        return pmReplyRateI;
    }
    public void setPmReplyRateI(int pmReplyRateI) {
        this.pmReplyRateI = pmReplyRateI;
    }
    public int getAllOrderI() {
        return allOrderI;
    }
    public void setAllOrderI(int allOrderI) {
        this.allOrderI = allOrderI;
    }
    public int getOrderSelfI() {
        return orderSelfI;
    }
    public void setOrderSelfI(int orderSelfI) {
        this.orderSelfI = orderSelfI;
    }
    public int getOrderSelfRateI() {
        return orderSelfRateI;
    }
    public void setOrderSelfRateI(int orderSelfRateI) {
        this.orderSelfRateI = orderSelfRateI;
    }
    public int getOrderHtRateI() {
        return orderHtRateI;
    }
    public void setOrderHtRateI(int orderHtRateI) {
        this.orderHtRateI = orderHtRateI;
    }
    public int getRoomNightsI() {
        return roomNightsI;
    }
    public void setRoomNightsI(int roomNightsI) {
        this.roomNightsI = roomNightsI;
    }
    public int getPmHtRateI() {
        return pmHtRateI;
    }
    public void setPmHtRateI(int pmHtRateI) {
        this.pmHtRateI = pmHtRateI;
    }
    public int getCalLastUpdateI() {
        return calLastUpdateI;
    }
    public void setCalLastUpdateI(int calLastUpdateI) {
        this.calLastUpdateI = calLastUpdateI;
    }
    public int getHsRatingAvgI() {
        return hsRatingAvgI;
    }
    public void setHsRatingAvgI(int hsRatingAvgI) {
        this.hsRatingAvgI = hsRatingAvgI;
    }
    public int getHsCommentsNumI() {
        return hsCommentsNumI;
    }
    public void setHsCommentsNumI(int hsCommentsNumI) {
        this.hsCommentsNumI = hsCommentsNumI;
    }
    public int getRoomRatingAvgI() {
        return roomRatingAvgI;
    }
    public void setRoomRatingAvgI(int roomRatingAvgI) {
        this.roomRatingAvgI = roomRatingAvgI;
    }
    public int getRoomCommentsNumI() {
        return roomCommentsNumI;
    }
    public void setRoomCommentsNumI(int roomCommentsNumI) {
        this.roomCommentsNumI = roomCommentsNumI;
    }
    public int getJiesongServiceI() {
        return jiesongServiceI;
    }
    public void setJiesongServiceI(int jiesongServiceI) {
        this.jiesongServiceI = jiesongServiceI;
    }
    public int getBaocheServiceI() {
        return baocheServiceI;
    }
    public void setBaocheServiceI(int baocheServiceI) {
        this.baocheServiceI = baocheServiceI;
    }
    public int getOtherServiceI() {
        return otherServiceI;
    }
    public void setOtherServiceI(int otherServiceI) {
        this.otherServiceI = otherServiceI;
    }
    public String getOtherServiceTcn() {
        return otherServiceTcn;
    }
    public void setOtherServiceTcn(String otherServiceTcn) {
        this.otherServiceTcn = otherServiceTcn;
    }
   
    public List<String> getCategoryTagsSs() {
        return categoryTagsSs;
    }
    public void setCategoryTagsSs(List<String> categoryTagsSs) {
        this.categoryTagsSs = categoryTagsSs;
    }
    public String getCategoryTagsS() {
        return categoryTagsS;
    }
    public void setCategoryTagsS(String categoryTagsS) {
        this.categoryTagsS = categoryTagsS;
    }
    public float getScoreF() {
        return scoreF;
    }
    public void setScoreF(float scoreF) {
        this.scoreF = scoreF;
    }
    public Double getDistance() {
        return distance;
    }
    public void setDistance(Double distance) {
        this.distance = distance;
    }
    public int getHsSpeedRoomI() {
        return hsSpeedRoomI;
    }
    public void setHsSpeedRoomI(int hsSpeedRoomI) {
        this.hsSpeedRoomI = hsSpeedRoomI;
    }
 
    

}
