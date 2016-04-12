package com.example.test.testexampleapplication.utils;

/**
 * Desc:
 * Author:zhjm
 * Date:2015/11/30.
 */
public class Constants {

    public static final String PREFERENCE_FILE_NAME = "cetao";
    //    public static final String API_BASE_URL = "http://192.168.0.105/YGShop/thirdapi/";
    //阿里云
    public static final String API_BASE_URL = "http://120.55.163.66/thirdapi/";

    /**
     * md5加密
     */
    public static final String SECRET_KEY = "ygshop_app2015_en";
    /**
     * 图片前缀
     */
    public static final String URIIMG = "http://app.weixindev.net/res/";
//     public static final String URIIMG = "http://192.168.0.105/res/";
    /**
     * 注册
     */
    public static final String REGISTER = "member/register";

    /**
     * 登录
     */
    public static final String LOGIN = "member/login";
    /**
     * 首页
     */
    public static final String HOMEFIST = "index/index";
    /**
     * 商品列表
     */
    public static final String ADVGOODS = "index/advgoods";
    /**
     * 商品列表
     */
    public static final String BRANDGOODS = "index/brandgoods";

    /**
     * 图文详情
     */
    public static final String INTRO = "goods/intro";
    /**
     * 加入购物车
     */
    public static final String ADDCART = "cart/add";

    /**
     * 商品评论列表
     */
    public static final String COMMENTLIST = "goods/commentlist";
    /**
     * 活动
     */
    public static final String ATYLIST = "index/actlist";
    /**
     * 分类
     */
    public static final String CATEGORY = "index/cat";
    /**
     * 商品详情
     */
    public static final String GOODS = "goods/detail";
    /**
     * 添加收藏
     */
    public static final String COLLECTIONADD = "favourite/add";
    /**
     * 删除收藏
     */
    public static final String DELETECOLL = "favourite/delete";
    /**
     * 订单列表
     */
    public static final String ORDER = "order/queryByStatus";
    /**
     * 订单详情
     */
    public static final String ORDERDETAIL = "order/detail";
    /**猜你喜欢*/
    public static final String GUESSLIKE= "goods/guessLike";

    /**
     * 添加地址
     */
    public static final String ADDRESSAdd = "address/addressAdd";
    /**
     * 添加地址列表
     */
    public static final String addressList = "address/addressList";
    /**
     * 修改地址
     */
    public static final String addressEdit = "address/addressEdit";
    /**
     * delete地址
     */
    public static final String addressDel = "address/addressDel";
    /**
     * 购物车列表
     */
    public static final String careList = "cart/list";
    /**
     * 购物车商品删除
     */
    public static final String careDelete = "cart/delete";
    /**
     * 购物车修改
     */
    public static final String careUpdateNum = "cart/updateNum";
    /**
     * 去搜索
     */
    public static final String toSearch = "search/toSearch";
    /**
     * 商品列表
     */
    public static final String goodsList = "search/goodsList";
    /**
     * 收藏
     */
    public static final String favouriteList = "favourite/list";
    /**
     * 删除收藏
     */
    public static final String favouriteDelete = "favourite/delete";
    /**
     * 优惠券列表
     */
    public static final String memberCouponList = "coupon/list";
    /**
     * 退出
     */
    public static final String loginout = "member/loginout";

    /**
     * 取消订单
     */
    public static final String CANCELORDER = "order/cancelOrder";
    /**
     * 删除订单
     */
    public static final String DELETEORDER = "order/delete";
    /**
     * 确认收货
     */
    public static final String CONFIRORDER = "order/confGoods";
    /**
     * 售后
     */
    public static final String CUSTOMER = "aftersale/canApplylist";
    /**
     * 可售后列表
     */
    public static final String CANCUSTOMER = "aftersale/returnlist";
    /**
     * 钱款去向
     */
    public static final String RETURNMONEY = "aftersale/returnmoney";
    /**
     * 售后 确认提交
     */
    public static final String TOSURE = "aftersale/tosure";

    /**
     * h5 webView
     */
    public static final String WEBVIEWH = "http://cetao.weixindev.net/wap/goods/graphic/";

    /**
     * 购物车去结算
     */
    public static final String toAccount = "order/toAccount";
    /**
     * 结算页的查询优惠券
     */
    public static final String queryCoupon = "order/queryCoupon";
    //提交订单
    public static final String addOrder = "order/addOrder";
    //去支付
    public static final String toPay = "order/toPay";

    //商品详情立即购买
    public static final String toBuy = "order/toBuy";
    //支付宝支付
    public static final String aliPay = "order/aliPay";
    //微信支付
    public static final String wxPay = "order/wxPay";

    //zfb回调
    public static final String ali_notify_url = "order/ali_notify_url";
    //wx回调
    public static final String wx_notify_url = "order/wx_notify_url";


    /**
     * 发送验证码  注册
     */
    public static final String REGISTERSENDCODE = "sendCode/register";

    /**
     * 查看个人信息
     */
    public static final String USERINFO = "member/queryInfo";
    /**
     * 修改手机号码
     */
    public static final String CHANGEMOBILE = "member/changeMobile";
    /**
     * 已有账号 发送验证码
     */
    public static final String FINDCODE = "sendCode/findPwd";
    /**
     * 修改邮箱
     */
    public static final String CHANGEMAIL = "member/changeEmail";
    /**
     * 修改会员信息
     */
    public static final String CHANGEINFO = "member/updateInfo";

    /**
     * 后台审核通过后确认提交
     */
    public static final String SUREAPPLY = "aftersale/sureapply";
    /**
     * 忘记密码
     */
    public static final String FORGETPWD = "member/forgetPwd";
    /**
     * 找回密码
     */
    public static final String FINDPWD = "member/findPwd";
    /**
     * 修改密码
     */
    public static final String CHANGEPWD = "member/changePwd";

    /**
     * 第三方登录
     */
    public static final String THIRDLOGIN = "member/thirdLogin";

    /**
     * 物流
     */
    public static final String QUERYLOGIC = "order/queryLogic";
    /**
     * 商品评价
     */
    public static final String TOCOMMENT = "comment/tocomment";
    /**
     * 评价
     */
    public static final String ASSESSORDER = "comment/add";
    /**申请售后提交*/
    public static final String APPLYACT="aftersale/apply";

    /**
     * 当前 DEMO 应用的 APP_KEY，第三方应用应该使用自己的 APP_KEY 替换该 APP_KEY
     */
    public static final String APP_KEY = "3620956497";
    /**
     * 当前 DEMO 应用的回调页，第三方应用可以使用自己的回调页。
     * 建议使用默认回调页：https://api.weibo.com/oauth2/default.html
     */
    public static final String REDIRECT_URL = "http://www.coco-sh.com";
    /**
     * Scope 是 OAuth2.0 授权机制中 authorize 接口的一个参数。通过 Scope，平台将开放更多的微博
     * 核心功能给开发者，同时也加强用户隐私保护，提升了用户体验，用户在新 OAuth2.0 授权页中有权利
     * 选择赋予应用的功能。
     * <p/>
     * 我们通过新浪微博开放平台-->管理中心-->我的应用-->接口管理处，能看到我们目前已有哪些接口的
     * 使用权限，高级权限需要进行申请。
     * <p/>
     * 目前 Scope 支持传入多个 Scope 权限，用逗号分隔。
     * <p/>
     * 有关哪些 OpenAPI 需要权限申请，请查看：http://open.weibo.com/wiki/%E5%BE%AE%E5%8D%9AAPI
     * 关于 Scope 概念及注意事项，请查看：http://open.weibo.com/wiki/Scope
     */
    public static final String SCOPE =
            "email,direct_messages_read,direct_messages_write,"
                    + "friendships_groups_read,friendships_groups_write,statuses_to_me_read,"
                    + "follow_app_official_microblog," + "invitation_write";


    public static class Config {
        /**
         * 开发者模式
         */
        public static final boolean DEVELOPER_MODE = true;
    }


}
