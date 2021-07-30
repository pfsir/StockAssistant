package com.xy.jepackdemo.http;

import com.xy.jepackdemo.bean.BtcPriceBean;
import com.xy.jepackdemo.bean.DoubleLowBondBean;
import com.xy.jepackdemo.bean.FgiBean;
import com.xy.jepackdemo.bean.FilterBondBean;
import com.xy.jepackdemo.bean.FundDetailBean;
import com.xy.jepackdemo.bean.FundLofBean;
import com.xy.jepackdemo.bean.FundValuationBean;
import com.xy.jepackdemo.bean.HkIpoBean;
import com.xy.jepackdemo.bean.RecentBondBean;
import com.xy.jepackdemo.bean.StockBean;

import java.util.List;

import io.reactivex.Flowable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * @author oyangpengfei
 * @date 2019/8/15.
 * description
 */
public interface HttpClient {

    class Builder {
        public static HttpClient getJslService() {
            return Api.getRetrofitApi(ApiUrl.JSL_BASE_URL, HttpClient.class);
        }

        public static HttpClient getXqService() {
            return Api.getRetrofitApi(ApiUrl.XQ_BASE_URL, HttpClient.class);
        }

        public static HttpClient getLxrService() {
            return Api.getRetrofitApi(ApiUrl.LXR_BASE_URL, HttpClient.class);
        }

        public static HttpClient getDJService() {
            return Api.getRetrofitApi(ApiUrl.DJ_BASE_URL, HttpClient.class);
        }

        public static HttpClient getBtcService() {
            return Api.getRetrofitApi(ApiUrl.BTC_BASE_URL, HttpClient.class);
        }
    }

    /**
     * 获取新债
     *
     * @return
     * @time 当前时间的毫秒值
     */
    @GET(ApiUrl.GET_JSL_RECENT_BOND)
    Flowable<RecentBondBean> getJslRecentBond(@Query("___jsl=LST___t") long time);


    /**
     * 获取港股
     *
     * @return
     * @time 当前时间的毫秒值
     */
    @GET(ApiUrl.GET_JSL_HK_IPO)
    Flowable<HkIpoBean> getJslHkIpo(@Query("___jsl=LST___t") long time);

    /**
     * 筛选新债
     * fprice: 0
     * tprice: 110
     * volume:
     * svolume:
     * premium_rt: 20
     * ytm_rt:
     * rating_cd:
     * is_search: Y
     * btype: C
     * listed: Y
     * industry:
     * bond_ids:
     * rp: 50
     *
     * @return
     * @time 当前时间的毫秒值
     */
    @FormUrlEncoded
    @POST(ApiUrl.GET_JSL_FILTER_BOND)
    Flowable<FilterBondBean> getJslFilterBond(@Query("___jsl=LST___t") long time,
                                              @Field("fprice") int fprice,
                                              @Field("tprice") int tprice,
                                              @Field("volume") String volume,
                                              @Field("svolume") String svolume,
                                              @Field("premium_rt") String premium_rt,
                                              @Field("ytm_rt") String ytm_rt,
                                              @Field("rating_cd") String rating_cd,
                                              @Field("is_search") String is_search,
                                              @Field("btype") String btype,
                                              @Field("listed") String listed,
                                              @Field("industry") String industry,
                                              @Field("bond_ids") String bond_ids,
                                              @Field("rp") int rp);


    @FormUrlEncoded
    @POST(ApiUrl.GET_JSL_FILTER_BOND)
    Flowable<DoubleLowBondBean> getJslAllBond(@Query("___jsl=LST___t") long time,
                                              @Field("is_search") String is_search,
                                              @Field("fprice") int fprice,
                                              @Field("tprice") int tprice,
                                              @Field("btype") String btype,
                                              @Field("listed") String listed,
                                              @Field("qflag") String qflag,
                                              @Field("rp") int rp);


    /**
     * 获取新债
     *
     * @return
     * @time 当前时间的毫秒值
     */
    @POST(ApiUrl.GET_LXR_STOCK_INFO)
    Flowable<StockBean> getLxrStockInfo(@Body RequestBody route);

    /**
     * 获取新债
     *
     * @return
     * @time 当前时间的毫秒值
     */
    @POST(ApiUrl.GET_LXR_INSURANCE_STOCK_INFO)
    Flowable<StockBean> getLxrInsuranceStockInfo(@Body RequestBody route);

       /**
     * 获取指数基金估值
     *
     * @return
     * @source lsd
     */
    @GET(ApiUrl.GET_DJ_FUND_INFO)
    Flowable<FundValuationBean> getDjFundInfo(@Query("size") String size,@Query("page") String page);

    /**
     * 基金详情
     *
     * @return
     * @source lsd
     */
    @GET(ApiUrl.GET_DJ_FUND_DETAIL)
    Flowable<FundDetailBean> getDjFundDetail(@Query("plan_code") String plan_code);

    /**
     * 获取Lof基金溢价率
     *
     * @return
     * @___jsl=LST___t  时间
     * @rp  25
     * @page 1
     */
    @GET(ApiUrl.GET_JSL_LOF_FUND)
    Flowable<FundLofBean> getJslLofFund(@Query("___jsl=LST___t") long time,
                                        @Query("rp") int rp,
                                        @Query("page") int page);

    @GET(ApiUrl.GET_BTC_PRICE)
    Flowable<BtcPriceBean> getBtcData(@Query("symbol") String symbol,
                                      @Query("start") String startTime,
                                      @Query("end") String endTime);

    @GET(ApiUrl.GET_BTC_FGI)
    Flowable<FgiBean> getFgiData();
}

