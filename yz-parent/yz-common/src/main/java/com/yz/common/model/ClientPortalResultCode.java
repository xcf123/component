package com.yz.common.model;

public enum ClientPortalResultCode
{
    
    SUCCESS("0", "成功"),
    //
    OTHER_ERROR("99999", "其它错误"),
    //
    USER_NOT_LOGIN("20000", "用户未登陆"),
    /**
     * "10000", "请求参数不能为空！"
     */
    PARAMETER_IS_NULL("10000", "请求参数不能为空！"),
    /**
     * "10001", "账号不存在！"
     */
    ACCOUNT_NOT_EXISTS("10001", "账号不存在！"),
    /**
     * "10002", "学生账号不存在！"
     */
    STUDENT_NOT_EXISTS("10002", "账号不存在！"),
    /**
     * "10003", "教师信息不存在！"
     */
    TEACHERINFO_NOT_EXISTS("10003", "教师信息不存在！"),
    /**
     * "10004", "密码不正确！"
     */
    PASSWORD_NOT_EQUALS("10004", "密码不正确！"),
    /**
     * "10005", "原始密码不正确！"
     */
    ORIGINAL_PASSWORD_ERROR("10005", "原始密码不正确！"),
    /**
     * 10006 "验证码不正确！"
     */
    VERIFYCODE_ERROR("10006", "验证码不正确！"),
    /**
     * "10007", "增加验证码失败！"
     */
    ADD_VERIFYCODE_FAIL("10007", "增加验证码失败！"),
    /**
     * "10008", "短信验证码下发失败！"
     */
    SEND_VERIFYCODE_SMS_FAIL("10008", "短信验证码下发失败！"),
    /**
     * "10009", "教师ID不能为空！"
     */
    TEACHERID_CANNOT_NULL("10009", "教师ID不能为空！"),
    /**
     * "10010", "此号码已绑定到其它老师！"
     */
    THIS_MSISDN_HAS_BIND_TO_OTHER_TEACHER("10010", "此号码已绑定到其它老师！"),
    /**
     * "10011", "未获取到班级信息！"
     */
    CANNOT_GET_CLASSINFO("10011", "未获取到班级信息！"),
    /**
     * "10012", "密码字符限制6-12位，只支持数字、英文字母、-"
     */
    PASSWD_FORMAT_ERROR("10012", "密码字符限制6-12位，只支持数字、英文字母、-"),
    /**
     * "10013", "家长和学生已经关联"
     */
    PARENT_STUDENT_R_HAS_EXIST("10013", "家长和学生已经关联"),
    /**
     * "10014", "家长与学生关系不存在"
     */
    PARENT_STUDENT_R_NOT_EXIST("10014", "家长与学生关系不存在"),
    /**
     * "10015", "截止时间到学生未提交作业，家长检查"
     */
    CHECK_HOMEWORK_UN_POST("10015", "截止时间到学生未提交作业，家长检查"),
    /**
     * "10016", "截止时间未到，学生未提交作业，家长检查"
     */
    CHECK_HOMEWORK_BEFORE_POST("10016", "截止时间未到，学生未提交作业，家长检查"),
    /**
     * "10017", "验证码已过期，请重新发送"
     */
    VERIFYCODE_OUETIME("10017", "验证码已过期，请重新获取"),
    /**
     * "10018", "已经添加了订正，不能再添加"
     */
    WRONG_QUESTION_DIALOG_HAS_POSTED("10018", "已经添加了订正，不能再添加"),
    /**
     * 用户使用协议状态修改失败
     */
    USER_ACCOUNT_ACCEPT_MANUAL_FAIL("11000", "用户使用协议状态修改失败"),
    /**
     * "20001", "ClientHash校验失败"
     */
    CHECK_CLINET_HASH_IS_FAIL("20001", "ClientHash校验失败"),
    //
    PEREMETER_ILLEGA("20002", "参数不合法"),
    /**
     * 30001
     */
    PARENTS_IS_EXIST("30001", "家长已存在"),
    //
    DOWNLOAD_IS_EXIST("30002", "下载已提交过了"),
    /**"30003", "学生信息不存在"*/
    STUDENT_ISNOT_EXIST("30003", "学生信息不存在"),
    //
    PASSWORD_WRONG("30004", "帐号或者密码错误"),
    //
    CACHE_ERROR("30005", "缓存异常"),
    /** "30006", "该学生无此课程的信息" */
    STUDENT_LESSON_ISNOT_EXIST("30006", "该学生无此课程的信息"),
    //
    HOMEWORK_ISNOT_CORRECT("30007", "老师还未批改该环节的作业"),
    //
    HOMEWORK_DONT_RESUBMIT("30008", "请勿重复提交作业"),
    //
    HOMEWORK_SUBMIT_AFTERDEADLINE("30009", "已过最后提交时间"),
    //
    QUESTION_NOT_EXISTS("30010", "题目不存在！"),
    //
    SCHOOLID_IS_EMPTY("30011", "学校不能为空"),
    //
    HOMEWORK_UNSUBMIT_DEADLINE("30013", "没有提交，可以提交"),
    //
    HOMEWORK_CAN_NOT_FINISH("50001", "环节不能关闭"),
    
    CORRECT_EXPERIED("50002", "批改已过期"),

    USER_WALLET_INFO_IS_NULL("60001", "用户资金账户信息为空"),

    USER_BALANCE_IS_NOT_ENOUGH("60002", "用户余额不足"),

    THIS_ORDER_CANNOT_APPLY_SERVICE("70001", "当前订单不能申请老师服务"),
    /**
     * "90001", "TOKEN不存在"
     * */
    TOKEN_ISNOT_EXIST("90001", "TOKEN不存在"),
    //
    TOKEN_IS_EXPIRE("90002", "TOKEN过期"),
    //
    UPDATE_DB_FAIL("90003", "更新数据库失败"),
    //
    LESSON_ISPUBLISHED_CANNODE_DELETE("90004", "课程已关联班级，不能删除"),
    //
    CANNOT_MODIFY_PUBLISHED_LESSON("90004", "已发布课程不能修改"),
    
    FILE_UPLOAD_FAILED("90005", "文件上传失败"),

    ENIK_REGCODE_NOT_EXIST("E10001", "请输入正确的激活码"),

    ENIK_REGCODE_IS_USED("E10002", "该激活码已被使用"),

    ENIK_STUDENT_ACCOUNT_IS_EXISTS("E00003", "用户名已存在"),

    EINK_USER_NOT_LOGIN("E20000", "用户未登录"),

    EINK_TEACHING_PKG_NOT_EXISTED("E30000", "套题不存在"),

    EINK_COLLECT_EXISTED("E30001", "收藏关系已经存在"),

    EINK_COLLECT_NOT_EXISTED("E30002", "收藏关系不存在"),

    EINK_PURECH_ERROR_PARAM_NULL("E40000", "订购的商品ID和内容ID不能都为空"),

    EINK_PURECH_ERROR_USER_HAS_PURCHED("E40001", "用户已订购"),
    
    EINK_PURECH_ERROR_GOODS_NOT_EXISTS("E40002", "商品信息不存在"),
    
    EINK_PURECH_ERROR_CONTENT_TYPE_NOT_SUPPORT("E40003", "不支持订购的内容类型"),

    EINK_PURECH_ERROR_GOODS_STATUS_ERROR("E40004", "商品状态异常"),

    EINK_PURECH_ERROR_ADD_ORDER_FAILD("E40005", "添加订单失败"),
    
    EINK_PURECH_ERROR_ACCOUNT_BALANCE_NOT_ENOUGH("E40006", "账户余额不足"),

    EINK_PURECH_ERROR_PKGID_OR_QUESTIONid_PARAM_ISNULL("E40100", "套题ID或试题ID参数不能为空"),

    EINK_PURECH_ERROR_HAS_APPLY_CORRECT("E40101", "已申请批改"),

    EINK_PURECH_ERROR_PKG_INFO_NOT_EXISTS("E40102", "套题信息不存在"),

    EINK_PURECH_ERROR_PKG_QUEYSTION_REL_NOT_EXISTS("E40103", "套题与试题关系不存在"),
    
    EINK_PURECH_ERROR_HAS_APPLY_EXPLAIN("E40104", "已申请解答"),
    
    EINK_PURECH_ERROR_USER_CAN_NOT_READ("E40200", "用户未订购该图书，无权阅读"),
    
    EINK_PURECH_ERROR_QUERY_TYPE_NOT_NULL("E40300", "查询参数type不能为空"),
    
    H5_PURECH_ERROR_CREATE_WECHAT_PAMENT_ERROR("E50001", "创建微信支付订单失败"),
    
    H5_PURECH_ERROR_WECHAT_PREPAY_ERROR("E50002", "创建微信预支付订单失败"),

    APP_LIST_CONFIG_NOT_EXISTED("8000", "应用列表配置信息不存在"),
    
    CASH_OUT_MOBILE_NOT_EXISTED("40000", "该手机号码不是绑定的手机号码"),
    
    CASH_OUT_NOT_ENOUGH("40001", "可提金额不足"),

    TRAINING_ERROR_AUTH_FAILD("10000", "鉴权码校验不通过"),
    TRAINING_ERROR_STUDENT_ERROR("10001", "学生不存在"),
    TRAINING_ERROR_SCHOOLE_ERROR("10002", "学校不存在"),
    ;

    //,STUDENT_IS_ONLINE("10101", "你的账号已登录其他终端，如需登录，"请退出其他终端后重试);
    
    private String code;
    
    private String message;
    
    ClientPortalResultCode(String code, String message)
    {
        this.code = code;
        this.message = message;
    }
    
    public String getCode()
    {
        return code;
    }
    
    public String getMessage()
    {
        return message;
    }
}
