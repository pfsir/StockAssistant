package com.xy.jepackdemo.http;


/**
 * @author oyangpengfei
 * @date 2019/8/13.
 * description
 */
public class ApiUrl {
    /**
     * 集思录
     */
    public static final String JSL_BASE_URL = "https://www.jisilu.cn/";

    /**
     * 雪球
     */
    public static final String XQ_BASE_URL = "";
    /**
     * 理性人
     */
    public static final String LXR_BASE_URL = "https://open.lixinger.com/";

    /**
     * 蛋卷基金
     */
    public static final String DJ_BASE_URL = "https://danjuanfunds.com/";

    /**
     * BTC
     */
    public static final String BTC_BASE_URL = "https://history.btc126.com/";

    /**
     * 当前新债
     */
    public static final String GET_JSL_RECENT_BOND = "data/cbnew/pre_list/";

    /**
     * 当前可转债中位数等价格
     */
    public static final String GET_JSL_BOND_PRICE = "webapi/cb/index_quote/";

    /**
     * 按条件筛选的
     */
    public static final String GET_JSL_FILTER_BOND = "data/cbnew/cb_list/";

    /**
     * lof基金套利
     */
    public static final String GET_JSL_LOF_FUND = "data/lof/stock_lof_list/";
    /**
     * 港股打新
     */
    public static final String GET_JSL_HK_IPO = "data/new_stock/hkipo/";


    /**
     * 获取基金相关信息
     */
    public static final String GET_LXR_FUND_INFO = "api/a/index/fundamental";

    /**
     * 获取股票基本面数据
     */
    public static final String GET_LXR_STOCK_INFO = "api/a/company/fundamental/non_financial";

    /**
     * 获取保险行业股票基本面数据
     */
    public static final String GET_LXR_INSURANCE_STOCK_INFO = "api/a/company/fundamental/insurance";

    /**
     * 获取螺丝钉定投历史数据
     */
    public static final String GET_DJ_FUND_INFO = "djapi/plan/CSI666/trade_history";

    /**
     * 详情
     */
    public static final String GET_DJ_FUND_DETAIL = "djapi/plan/position/detail";


    /**
     * btc价格
     */
    public static final String GET_BTC_PRICE = "api.php";


    /**
     * fgi指数
     */
    public static final String GET_BTC_FGI = "zhishu/api.php";


}

