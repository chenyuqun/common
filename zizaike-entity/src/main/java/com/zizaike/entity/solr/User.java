package com.zizaike.entity.solr;

import org.apache.solr.client.solrj.beans.Field;

import com.zizaike.entity.solr.model.SearchableUser;

/**
 * 
 * ClassName: User <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 用户信息. <br/>
 * date: 2015年10月28日 下午3:13:44 <br/>
 * 
 * @author alex
 * @version
 * @since JDK 1.7
 */
public class User extends SearchableUser implements java.io.Serializable {
    private static final long serialVersionUID = 5761478175568282601L;
    /**
     * 民宿uid drupal_users.uid
     */
    @Field(ID_FIELD)
    private Integer id;
    @Field(VERSION_FIELD)
    private Long version;
    @Field(TEXT_FIELD)
    private String text;

    /**
     * 创建时间 drupal_users.created
     */
    @Field(CREATED_FIELD)
    private Integer created;
    /**
     * 登陆时间 drupal_users.login
     */
    @Field(CHANGED_FIELD)
    private Integer changed;

    @Field(UID_FIELD)
    private Integer uid;
    /**
     * 民宿名字
     */
    @Field(USERNAME_FIELD)
    private String username;
    /**
     * 昵称 drupal_field_data_field_nickname
     */
    @Field(NICKNAME_FIELD)
    private String nickname;
    /**
     * 邮箱 drupal_users.usermail
     */
    @Field(USERMAIL_FIELD)
    private String usermail;
    /**
     * 地址 drupal_users.address
     */
    @Field(ADDRESS_FIELD)
    private String address;
    /**
     * 民宿电话 drupal_users.tel_num
     */
    @Field(PHONE_FIELD)
    private String phone;
    /**
     * 民宿头像id drupa_users.picture
     */
    @Field(USER_PHOTO_ID_FIELD)
    private Integer userPhotoId;
    /**
     * 民宿头像文件名 同房间user_photo查询
     */
    @Field(USER_PHOTO_FILE_FIELD)
    private String userPhotoFile;
    /**
     * 民宿第一张图片文件 同房间homestay_default_image_s
     */
    @Field(HOMESTAY_PHOTO_FILE_FIELD)
    private String homestayPhotoFile;
    /**
     * 银行账号 drupal_field_data_field_blank_account 现在不用
     */
    @Field(BLANK_ACCOUNT_FIELD)
    private String blankAccount;
    /**
     * 民宿简介 drupal_field_data_field_aboutme 分词
     */
    @Field(ABOUTME_FIELD)
    private String aboutme;
    /**
     * 主人推荐 drupal_users.additional_services 分词
     */
    @Field(ADDITIONAL_SERVICES_FIELD)
    private String additionalServices;
    /**
     * 订房说明（退订政策）drupal_uesrs. drupal_field_data_field__dingfangshuoming 分词
     */
    @Field(DINGFANGSHUOMING_FIELD)
    private String dingfangshuoming;
    /**
     * 注意事项 drupal_field_data_field_zhuyishixiang 分词
     */
    @Field(ZHUYISHIXIANG_FIELD)
    private String zhuyishixiang;
    /**
     * 交通咨询 drupal_field_data_field__jiaotongzixun 分词
     */
    @Field(JIAOTONGZIXUN_FIELD)
    private String jiaotongzixun;
    /**
     * 民宿活动 drupal_field_data_field__huodong 分词
     */
    @Field(HUODONG_FIELD)
    private String huodong;
    /**
     * 房间数 drupal_users. room_num
     */
    @Field(ROOM_NUM_FIELD)
    private Integer roomNum;
    @Field(ORDER_SUCC_FIELD)
    private Integer orderSucc;
    @Field(PMSG_REPLY_FIELD)
    private Integer pmsgReply;
    @Field(SEND_SMS_FIELD)
    private Integer sendSms;
    @Field(SEND_SMS_TELNUM_FIELD)
    private String sendSmsTelnum;
    @Field(FOLLOW_LANGUAGE_FIELD)
    private String followLanguage;
    @Field(COMMENT_NUM_FIELD)
    private Integer commentNum;
    /**
     * 价格最低的房间号 通过solr/room查询
     */
    @Field(INT_ROOM_NID_FIELD)
    private Integer intRoomNid;
    /**
     * 价格最低的房间价格（人民币）查询方法同上
     */
    @Field(INT_ROOM_PRICE_FIELD)
    private Integer intRoomPrice;
    /**
     * 价格最低的房间价格 （台币、美元、日元等等）
     */
    @Field(INT_ROOM_PRICE_TW_FIELD)
    private Integer intRoomPriceTw;
    /**
     * 区县id同房间查询 t_weibo_poi_tw. loc_typecode t_weibo_poi_tw.uid 和drupal_users.uid关联
     */
    @Field(LOC_TYPEID_FIELD)
    private Integer locTypeid;
    /**
     * 区县id 查询同上
     */
    @Field(LOC_TYPECODE_FIELD)
    private String locTypecode;
    /**
     * 民宿所在区县名称 t_loc_type.type_name 通过上面的loc_typeid与t_loc_type.locid关联
     */
    @Field(LOC_TYPENAME_FIELD)
    private String locTypename;
    /**
     * 认证id drupal_users.poi_id
     */
    @Field(PID_FIELD)
    private Integer pid;
    /**
     * 认证名称 t_weibo_poi_tw.title 分词 现在不用了
     */
    @Field(POI_TITLE_FIELD)
    private String poiTitle;
    /**
     * 认证电话 t_weibo_poi_tw.phone 现在不用了
     */
    @Field(POI_PHONE_FIELD)
    private String poiPhone;
    /**
     * 认证邮箱 t_weibo_poi_tw.email 现在不用了
     */
    @Field(POI_EMAIL_FIELD)
    private String poiEmail;
    /**
     * 民宿主人姓名 t_weibo_poi_tw.user_name
     */
    @Field(POI_MASTER_FIELD)
    private String poiMaster;
    /**
     * 认证地址 t_weibo_poi_tw.address 分词 现在不用了
     */
    @Field(POI_ADDRESS_FIELD)
    private String poiAddress;

    @Field(POI_IMAGES_FIELD)
    private String poiImages;
    /**
     * 民宿状态drupal_users.status 应该只有1（上架）的情况
     */
    @Field(STATUS_FIELD)
    private Integer status;
    /**
     * 认证情况 drupal_usesr.poi_id是否大于0
     */
    @Field(VERIFIED_BY_ZZK_FIELD)
    private Integer verifiedByZzk;
    /**
     * t_weibo_poi_tw. zzk_weights
     */
    @Field(ZZK_WEIGHTS_FIELD)
    private Integer zzkWeights;
    /**
     * 收款比例 t_weibo_poi_tw. rev_percent
     */
    @Field(REV_PERCENT_FIELD)
    private Integer revPercent;
    /**
     * 提高房价 有些民宿不抽佣,但是允许自在客提高价格，如提价比例:10% 现在很少有这种民宿了 t_weibo_poi_tw. price_percent
     */
    @Field(PRICE_PERCENT_FIELD)
    private Integer pricePercent;
    /**
     * 抽佣比例 t_weibo_poi_tw.rebate_num
     */
    @Field(REBATE_NUM_FIELD)
    private Integer rebateNum;
    /**
     * 抽佣说明 t_weibo_poi.tw.rebate_num
     */
    @Field(REBATE_REMARK_FIELD)
    private String rebateRemark;
    /**
     * 总行名称 t_weibo_poi_tw.blank_account
     */
    @Field(BLANK_ACCOUNT_POI_FIELD)
    private String blankAccountPoi;
    /**
     * 银行户名 t_weibo_poi_tw.blank_name
     */
    @Field(BLANK_NAME_FIELD)
    private String blankName;
    /**
     * 开户行 t_weibo_poi_tw. blank_name_sub
     */
    @Field(BLANK_NAME_SUB_FIELD)
    private String blankNameSub;
    /**
     * 开户名 t_weibo_poi_tw.blank_username
     */
    @Field(BLANK_USERNAME_FIELD)
    private String blankUsername;
    /**
     * 总行代号 t_weibo_poi_tw. blank_daihao
     */
    @Field(BLANK_DAIHAO_FIELD)
    private String blankDaihao;
    /**
     * 分行代号 t_weibo_poi_tw. blank_daihao_sub
     */
    @Field(BLANK_DAIHAO_SUB_FIELD)
    private String blankDaihaoSub;
    /**
     * 支付宝账号 t_weibo_poi_tw
     */
    @Field(ALIPAY_ACCOUNT_FIELD)
    private String alipayAccount;
    /**
     * Paypal账号 t_weibo_poi_tw
     */
    @Field(PAYPAL_ACCOUNT_FIELD)
    private String paypalAccount;
    /**
     * 目的地 drupal_users.dest_id
     */
    @Field(DEST_ID_FIELD)
    private Integer destId;
    /**
     * 大陆银行账号 t_weibo_poi_tw
     */
    @Field(CN_BLANK_ACCOUNT_FIELD)
    private String cnBlankAccount;
    /**
     * 大陆开户行 t_weibo_poi_tw
     */
    @Field(CN_BLANK_NAME_FIELD)
    private String cnBlankName;
    /**
     * 大陆分行名 t_weibo_poi_tw
     */
    @Field(CN_BLANK_NAME_SUB_FIELD)
    private String cnBlankNameSub;
    /**
     * 大陆用户名 t_weibo_poi_tw
     */
    @Field(CN_BLANK_USERNAME_FIELD)
    private String cnBlankUsername;
    /**
     * 纬度 t_weibo_poi_tw.lat
     */
    @Field(SLAT_FIELD)
    private Double slat;
    /**
     * 经度 t_weibo_poi_tw.lon
     */
    @Field(SLNG_FIELD)
    private Double slng;
    /**
     * 第一张民宿图片文件名 同房间homestay_default_image_s查询
     */
    @Field(DEFAULT_IMAGE_S_FIELD)
    private String defaultImageS;
    /**
     * 最后成交时间 同房间查询
     */
    @Field(LATEST_SUCCESS_TIME_S_FIELD)
    private String latestSuccessTimeS;
    /**
     * 早餐 同房间
     */
    @Field(BREAKFAST_I_FIELD)
    private Integer breakfastI;
    /**
     * 经度 同上lat
     */
    @Field(LATLNG_P_0_D_FIELD)
    private double latlngP0D;
    /**
     * 纬度 同上lon
     */
    @Field(LATLNG_P_1_D_FIELD)
    private double latlngP1D;
    /**
     * 收经纬度 同房间
     */
    @Field(LATLNG_P_FIELD)
    private String latlngP;
    /**
     * 民宿头像版本 同房间
     */
    @Field(USER_PHOTO_VERSION_I_FIELD)
    private Integer userPhotoVersionI;
    /**
     * 私信用户 同房间
     */
    @Field(PM_USERS_I_FIELD)
    private Integer pmUsersI;
    /**
     * 评论数
     */
    @Field(HS_COMMENTS_NUM_I_FIELD)
    private Integer hsCommentsNumI;
    /**
     * 是否速订
     */
    @Field(HS_SPEED_ROOM_I_FIELD)
    private Integer hsSpeedRoomI;
    /**
     * 户外服务
     */
    @Field(HUWAI_SERVICE_I_FIELD)
    private Integer huwaiServiceI;
    /**
     * 餐饮美食
     */
    @Field(ZAOCAN_SERVICE_I_FIELD)
    private Integer zaocanServiceI;
    /**
     * 代订服务
     */
    @Field(DAIDING_SERVICE_I_FIELD)
    private Integer daidingServiceI;
    /**
     * 接送服务
     */
    @Field(JIESONG_SERVICE_I_FIELD)
    private Integer jiesongServiceI;
    /**
     * 包车服务
     */
    @Field(BAOCHE_SERVICE_I_FIELD)
    private Integer baocheServiceI;
    /**
     * 其他服务
     */
    @Field(OTHER_SERVICE_I_FIELD)
    private Integer otherServiceI;
    /**
     * 所有的服务  json格式
     */
    @Field(ALL_SERVICE_LIST_S_FIELD)
    private String allServiceListS;
    
    public Integer getHsCommentsNumI() {
        return hsCommentsNumI;
    }
    public void setHsCommentsNumI(Integer hsCommentsNumI) {
        this.hsCommentsNumI = hsCommentsNumI;
    }
    public Integer getHuwaiServiceI() {
        return huwaiServiceI;
    }
    public void setHuwaiServiceI(Integer huwaiServiceI) {
        this.huwaiServiceI = huwaiServiceI;
    }
    public Integer getZaocanServiceI() {
        return zaocanServiceI;
    }
    public void setZaocanServiceI(Integer zaocanServiceI) {
        this.zaocanServiceI = zaocanServiceI;
    }
    public Integer getDaidingServiceI() {
        return daidingServiceI;
    }
    public void setDaidingServiceI(Integer daidingServiceI) {
        this.daidingServiceI = daidingServiceI;
    }
    public Integer getJiesongServiceI() {
        return jiesongServiceI;
    }
    public void setJiesongServiceI(Integer jiesongServiceI) {
        this.jiesongServiceI = jiesongServiceI;
    }
    public Integer getBaocheServiceI() {
        return baocheServiceI;
    }
    public void setBaocheServiceI(Integer baocheServiceI) {
        this.baocheServiceI = baocheServiceI;
    }
    public Integer getOtherServiceI() {
        return otherServiceI;
    }
    public void setOtherServiceI(Integer otherServiceI) {
        this.otherServiceI = otherServiceI;
    }
    public String getAllServiceListS() {
        return allServiceListS;
    }
    public void setAllServiceListS(String allServiceListS) {
        this.allServiceListS = allServiceListS;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Long getVersion() {
        return version;
    }
    public void setVersion(Long version) {
        this.version = version;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public Integer getCreated() {
        return created;
    }
    public void setCreated(Integer created) {
        this.created = created;
    }
    public Integer getChanged() {
        return changed;
    }
    public void setChanged(Integer changed) {
        this.changed = changed;
    }
    public Integer getUid() {
        return uid;
    }
    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getUsermail() {
        return usermail;
    }
    public void setUsermail(String usermail) {
        this.usermail = usermail;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Integer getUserPhotoId() {
        return userPhotoId;
    }
    public void setUserPhotoId(Integer userPhotoId) {
        this.userPhotoId = userPhotoId;
    }
    public String getUserPhotoFile() {
        return userPhotoFile;
    }
    public void setUserPhotoFile(String userPhotoFile) {
        this.userPhotoFile = userPhotoFile;
    }
    public String getHomestayPhotoFile() {
        return homestayPhotoFile;
    }
    public void setHomestayPhotoFile(String homestayPhotoFile) {
        this.homestayPhotoFile = homestayPhotoFile;
    }
    public String getBlankAccount() {
        return blankAccount;
    }
    public void setBlankAccount(String blankAccount) {
        this.blankAccount = blankAccount;
    }
    public String getAboutme() {
        return aboutme;
    }
    public void setAboutme(String aboutme) {
        this.aboutme = aboutme;
    }
    public String getAdditionalServices() {
        return additionalServices;
    }
    public void setAdditionalServices(String additionalServices) {
        this.additionalServices = additionalServices;
    }
    public String getDingfangshuoming() {
        return dingfangshuoming;
    }
    public void setDingfangshuoming(String dingfangshuoming) {
        this.dingfangshuoming = dingfangshuoming;
    }
    public String getZhuyishixiang() {
        return zhuyishixiang;
    }
    public void setZhuyishixiang(String zhuyishixiang) {
        this.zhuyishixiang = zhuyishixiang;
    }
    public String getJiaotongzixun() {
        return jiaotongzixun;
    }
    public void setJiaotongzixun(String jiaotongzixun) {
        this.jiaotongzixun = jiaotongzixun;
    }
    public String getHuodong() {
        return huodong;
    }
    public void setHuodong(String huodong) {
        this.huodong = huodong;
    }
    public Integer getRoomNum() {
        return roomNum;
    }
    public void setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
    }
    public Integer getOrderSucc() {
        return orderSucc;
    }
    public void setOrderSucc(Integer orderSucc) {
        this.orderSucc = orderSucc;
    }
    public Integer getPmsgReply() {
        return pmsgReply;
    }
    public void setPmsgReply(Integer pmsgReply) {
        this.pmsgReply = pmsgReply;
    }
    public Integer getSendSms() {
        return sendSms;
    }
    public void setSendSms(Integer sendSms) {
        this.sendSms = sendSms;
    }
    public String getSendSmsTelnum() {
        return sendSmsTelnum;
    }
    public void setSendSmsTelnum(String sendSmsTelnum) {
        this.sendSmsTelnum = sendSmsTelnum;
    }
    public String getFollowLanguage() {
        return followLanguage;
    }
    public void setFollowLanguage(String followLanguage) {
        this.followLanguage = followLanguage;
    }
    public Integer getCommentNum() {
        return commentNum;
    }
    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }
    public Integer getIntRoomNid() {
        return intRoomNid;
    }
    public void setIntRoomNid(Integer intRoomNid) {
        this.intRoomNid = intRoomNid;
    }
    public Integer getIntRoomPrice() {
        return intRoomPrice;
    }
    public void setIntRoomPrice(Integer intRoomPrice) {
        this.intRoomPrice = intRoomPrice;
    }
    public Integer getIntRoomPriceTw() {
        return intRoomPriceTw;
    }
    public void setIntRoomPriceTw(Integer intRoomPriceTw) {
        this.intRoomPriceTw = intRoomPriceTw;
    }
    public Integer getLocTypeid() {
        return locTypeid;
    }
    public void setLocTypeid(Integer locTypeid) {
        this.locTypeid = locTypeid;
    }
    public String getLocTypecode() {
        return locTypecode;
    }
    public void setLocTypecode(String locTypecode) {
        this.locTypecode = locTypecode;
    }
    public String getLocTypename() {
        return locTypename;
    }
    public void setLocTypename(String locTypename) {
        this.locTypename = locTypename;
    }
    public Integer getPid() {
        return pid;
    }
    public void setPid(Integer pid) {
        this.pid = pid;
    }
    public String getPoiTitle() {
        return poiTitle;
    }
    public void setPoiTitle(String poiTitle) {
        this.poiTitle = poiTitle;
    }
    public String getPoiPhone() {
        return poiPhone;
    }
    public void setPoiPhone(String poiPhone) {
        this.poiPhone = poiPhone;
    }
    public String getPoiEmail() {
        return poiEmail;
    }
    public void setPoiEmail(String poiEmail) {
        this.poiEmail = poiEmail;
    }
    public String getPoiMaster() {
        return poiMaster;
    }
    public void setPoiMaster(String poiMaster) {
        this.poiMaster = poiMaster;
    }
    public String getPoiAddress() {
        return poiAddress;
    }
    public void setPoiAddress(String poiAddress) {
        this.poiAddress = poiAddress;
    }
    public String getPoiImages() {
        return poiImages;
    }
    public void setPoiImages(String poiImages) {
        this.poiImages = poiImages;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Integer getVerifiedByZzk() {
        return verifiedByZzk;
    }
    public void setVerifiedByZzk(Integer verifiedByZzk) {
        this.verifiedByZzk = verifiedByZzk;
    }
    public Integer getZzkWeights() {
        return zzkWeights;
    }
    public void setZzkWeights(Integer zzkWeights) {
        this.zzkWeights = zzkWeights;
    }
    public Integer getRevPercent() {
        return revPercent;
    }
    public void setRevPercent(Integer revPercent) {
        this.revPercent = revPercent;
    }
    public Integer getPricePercent() {
        return pricePercent;
    }
    public void setPricePercent(Integer pricePercent) {
        this.pricePercent = pricePercent;
    }
    public Integer getRebateNum() {
        return rebateNum;
    }
    public void setRebateNum(Integer rebateNum) {
        this.rebateNum = rebateNum;
    }
    public String getRebateRemark() {
        return rebateRemark;
    }
    public void setRebateRemark(String rebateRemark) {
        this.rebateRemark = rebateRemark;
    }
    public String getBlankAccountPoi() {
        return blankAccountPoi;
    }
    public void setBlankAccountPoi(String blankAccountPoi) {
        this.blankAccountPoi = blankAccountPoi;
    }
    public String getBlankName() {
        return blankName;
    }
    public void setBlankName(String blankName) {
        this.blankName = blankName;
    }
    public String getBlankNameSub() {
        return blankNameSub;
    }
    public void setBlankNameSub(String blankNameSub) {
        this.blankNameSub = blankNameSub;
    }
    public String getBlankUsername() {
        return blankUsername;
    }
    public void setBlankUsername(String blankUsername) {
        this.blankUsername = blankUsername;
    }
    public String getBlankDaihao() {
        return blankDaihao;
    }
    public void setBlankDaihao(String blankDaihao) {
        this.blankDaihao = blankDaihao;
    }
    public String getBlankDaihaoSub() {
        return blankDaihaoSub;
    }
    public void setBlankDaihaoSub(String blankDaihaoSub) {
        this.blankDaihaoSub = blankDaihaoSub;
    }
    public String getAlipayAccount() {
        return alipayAccount;
    }
    public void setAlipayAccount(String alipayAccount) {
        this.alipayAccount = alipayAccount;
    }
    public String getPaypalAccount() {
        return paypalAccount;
    }
    public void setPaypalAccount(String paypalAccount) {
        this.paypalAccount = paypalAccount;
    }
    public Integer getDestId() {
        return destId;
    }
    public void setDestId(Integer destId) {
        this.destId = destId;
    }
    public String getCnBlankAccount() {
        return cnBlankAccount;
    }
    public void setCnBlankAccount(String cnBlankAccount) {
        this.cnBlankAccount = cnBlankAccount;
    }
    public String getCnBlankName() {
        return cnBlankName;
    }
    public void setCnBlankName(String cnBlankName) {
        this.cnBlankName = cnBlankName;
    }
    public String getCnBlankNameSub() {
        return cnBlankNameSub;
    }
    public void setCnBlankNameSub(String cnBlankNameSub) {
        this.cnBlankNameSub = cnBlankNameSub;
    }
    public String getCnBlankUsername() {
        return cnBlankUsername;
    }
    public void setCnBlankUsername(String cnBlankUsername) {
        this.cnBlankUsername = cnBlankUsername;
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
    public String getDefaultImageS() {
        return defaultImageS;
    }
    public void setDefaultImageS(String defaultImageS) {
        this.defaultImageS = defaultImageS;
    }
    public String getLatestSuccessTimeS() {
        return latestSuccessTimeS;
    }
    public void setLatestSuccessTimeS(String latestSuccessTimeS) {
        this.latestSuccessTimeS = latestSuccessTimeS;
    }
    public Integer getBreakfastI() {
        return breakfastI;
    }
    public void setBreakfastI(Integer breakfastI) {
        this.breakfastI = breakfastI;
    }
    public double getLatlngP0D() {
        return latlngP0D;
    }
    public void setLatlngP0D(double latlngP0D) {
        this.latlngP0D = latlngP0D;
    }
    public double getLatlngP1D() {
        return latlngP1D;
    }
    public void setLatlngP1D(double latlngP1D) {
        this.latlngP1D = latlngP1D;
    }
    public String getLatlngP() {
        return latlngP;
    }
    public void setLatlngP(String latlngP) {
        this.latlngP = latlngP;
    }
    public Integer getUserPhotoVersionI() {
        return userPhotoVersionI;
    }
    public void setUserPhotoVersionI(Integer userPhotoVersionI) {
        this.userPhotoVersionI = userPhotoVersionI;
    }
    public Integer getPmUsersI() {
        return pmUsersI;
    }
    public void setPmUsersI(Integer pmUsersI) {
        this.pmUsersI = pmUsersI;
    }
    public Integer getHsSpeedRoomI() {
        return hsSpeedRoomI;
    }
    public void setHsSpeedRoomI(Integer hsSpeedRoomI) {
        this.hsSpeedRoomI = hsSpeedRoomI;
    }
    
    
    
}
