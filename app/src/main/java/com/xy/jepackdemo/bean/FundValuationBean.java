package com.xy.jepackdemo.bean;

import com.xy.baselib.utils.DateUtil;

import java.util.List;

public class FundValuationBean {

    /**
     * data : {"items":[{"trading_id":"fc0cbd2b442042728eec6f4d1633bc29","plan_code":"CSI666","trade_date":1589817600000,"buy_amount":11325,"remark":"执行本周定投计划。另外，易方达中概互联，每日限购500元。组合里把500额度用上，后续会跟随基金公司额度调整。","created_at":1589864030608,"updated_at":1589864708616,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"fc0cbd2b442042728eec6f4d1633bc29","action":"022","fd_code":"164906","fd_name":"交银中证海外中国互联网指数","portion":0.1031,"money":1166,"last_portion":0,"volume":0,"percent":"10.31%","last_percent":"0.0%"},{"trading_id":"fc0cbd2b442042728eec6f4d1633bc29","action":"022","fd_code":"006327","fd_name":"易方达中概互联50ETF联接人民币A","portion":0.0441,"money":500,"last_portion":0,"volume":0,"percent":"4.41%","last_percent":"0.0%"},{"trading_id":"fc0cbd2b442042728eec6f4d1633bc29","action":"022","fd_code":"008975","fd_name":"富国中证消费50ETF联接A","portion":0.1471,"money":1666,"last_portion":0,"volume":0,"percent":"14.71%","last_percent":"0.0%"},{"trading_id":"fc0cbd2b442042728eec6f4d1633bc29","action":"022","fd_code":"519671","fd_name":"银河沪深300价值指数","portion":0.1832,"money":2075,"last_portion":0,"volume":0,"percent":"18.32%","last_percent":"0.0%"},{"trading_id":"fc0cbd2b442042728eec6f4d1633bc29","action":"022","fd_code":"001594","fd_name":"天弘中证银行指数A","portion":0.1696,"money":1921,"last_portion":0,"volume":0,"percent":"16.96%","last_percent":"0.0%"},{"trading_id":"fc0cbd2b442042728eec6f4d1633bc29","action":"022","fd_code":"090010","fd_name":"大成中证红利指数A","portion":0.1697,"money":1922,"last_portion":0,"volume":0,"percent":"16.97%","last_percent":"0.0%"},{"trading_id":"fc0cbd2b442042728eec6f4d1633bc29","action":"022","fd_code":"110003","fd_name":"易方达上证50指数A","portion":0.1832,"money":2075,"last_portion":0,"volume":0,"percent":"18.32%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"632699a9045f43479359e178aea98af3","plan_code":"CSI666","trade_date":1589212800000,"buy_amount":11213,"remark":"执行本周定投计划。另外，易方达中概互联，每日限购500元。组合里把500额度用上，后续会跟随基金公司额度调整。","created_at":1589254702610,"updated_at":1589254965506,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"632699a9045f43479359e178aea98af3","action":"022","fd_code":"164906","fd_name":"交银中证海外中国互联网指数","portion":0.1134,"money":1271,"last_portion":0,"volume":0,"percent":"11.34%","last_percent":"0.0%"},{"trading_id":"632699a9045f43479359e178aea98af3","action":"022","fd_code":"006327","fd_name":"易方达中概互联50ETF联接人民币A","portion":0.0445,"money":500,"last_portion":0,"volume":0,"percent":"4.45%","last_percent":"0.0%"},{"trading_id":"632699a9045f43479359e178aea98af3","action":"022","fd_code":"008975","fd_name":"富国中证消费50ETF联接A","portion":0.1486,"money":1666,"last_portion":0,"volume":0,"percent":"14.86%","last_percent":"0.0%"},{"trading_id":"632699a9045f43479359e178aea98af3","action":"022","fd_code":"519671","fd_name":"银河沪深300价值指数","portion":0.1792,"money":2009,"last_portion":0,"volume":0,"percent":"17.92%","last_percent":"0.0%"},{"trading_id":"632699a9045f43479359e178aea98af3","action":"022","fd_code":"001594","fd_name":"天弘中证银行指数A","portion":0.1682,"money":1886,"last_portion":0,"volume":0,"percent":"16.82%","last_percent":"0.0%"},{"trading_id":"632699a9045f43479359e178aea98af3","action":"022","fd_code":"090010","fd_name":"大成中证红利指数A","portion":0.1659,"money":1860,"last_portion":0,"volume":0,"percent":"16.59%","last_percent":"0.0%"},{"trading_id":"632699a9045f43479359e178aea98af3","action":"022","fd_code":"110003","fd_name":"易方达上证50指数A","portion":0.1802,"money":2021,"last_portion":0,"volume":0,"percent":"18.02%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"b74d48bfec214c948b1d9a0a63218071","plan_code":"CSI666","trade_date":1588694400000,"buy_amount":11327,"remark":"执行本周定投计划。另外，易方达中概互联，每日限购500元。组合里把500额度用上，后续会跟随基金公司额度调整。","created_at":1588737981682,"updated_at":1588738069586,"source":1,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"b74d48bfec214c948b1d9a0a63218071","action":"022","fd_code":"164906","fd_name":"交银中证海外中国互联网指数","portion":0.1188,"money":1346,"last_portion":0,"volume":0,"percent":"11.88%","last_percent":"0.0%"},{"trading_id":"b74d48bfec214c948b1d9a0a63218071","action":"022","fd_code":"006327","fd_name":"易方达中概互联50ETF联接人民币A","portion":0.0441,"money":500,"last_portion":0,"volume":0,"percent":"4.41%","last_percent":"0.0%"},{"trading_id":"b74d48bfec214c948b1d9a0a63218071","action":"022","fd_code":"519671","fd_name":"银河沪深300价值指数","portion":0.1794,"money":2031,"last_portion":0,"volume":0,"percent":"17.94%","last_percent":"0.0%"},{"trading_id":"b74d48bfec214c948b1d9a0a63218071","action":"022","fd_code":"001594","fd_name":"天弘中证银行指数A","portion":0.1648,"money":1867,"last_portion":0,"volume":0,"percent":"16.48%","last_percent":"0.0%"},{"trading_id":"b74d48bfec214c948b1d9a0a63218071","action":"022","fd_code":"110003","fd_name":"易方达上证50指数A","portion":0.1788,"money":2025,"last_portion":0,"volume":0,"percent":"17.88%","last_percent":"0.0%"},{"trading_id":"b74d48bfec214c948b1d9a0a63218071","action":"022","fd_code":"090010","fd_name":"大成中证红利指数A","portion":0.167,"money":1892,"last_portion":0,"volume":0,"percent":"16.7%","last_percent":"0.0%"},{"trading_id":"b74d48bfec214c948b1d9a0a63218071","action":"022","fd_code":"008975","fd_name":"富国中证消费50ETF联接A","portion":0.1471,"money":1666,"last_portion":0,"volume":0,"percent":"14.71%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":false,"published":true},{"trading_id":"ed1c26c1e26443ca9b956767f20a78a2","plan_code":"CSI666","trade_date":1587398400000,"buy_amount":11543,"remark":"执行本周定投计划。市场整体处于4.5星级，每周会有至少一次定投。后面遇到大跌日也会临时定投。另外，易方达中概互联，每日限购500元。组合里把500额度用上，后续会跟随基金公司额度调整。","created_at":1587447258827,"updated_at":1587874713621,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"ed1c26c1e26443ca9b956767f20a78a2","action":"022","fd_code":"164906","fd_name":"交银中证海外中国互联网指数","portion":0.1045,"money":1207,"last_portion":0,"volume":0,"percent":"10.45%","last_percent":"0.0%"},{"trading_id":"ed1c26c1e26443ca9b956767f20a78a2","action":"022","fd_code":"006327","fd_name":"易方达中概互联50ETF联接人民币A","portion":0.0433,"money":500,"last_portion":0,"volume":0,"percent":"4.33%","last_percent":"0.0%"},{"trading_id":"ed1c26c1e26443ca9b956767f20a78a2","action":"022","fd_code":"008975","fd_name":"富国中证消费50ETF联接A","portion":0.1461,"money":1686,"last_portion":0,"volume":0,"percent":"14.61%","last_percent":"0.0%"},{"trading_id":"ed1c26c1e26443ca9b956767f20a78a2","action":"022","fd_code":"519671","fd_name":"银河沪深300价值指数","portion":0.1833,"money":2116,"last_portion":0,"volume":0,"percent":"18.33%","last_percent":"0.0%"},{"trading_id":"ed1c26c1e26443ca9b956767f20a78a2","action":"022","fd_code":"001594","fd_name":"天弘中证银行指数A","portion":0.1733,"money":2000,"last_portion":0,"volume":0,"percent":"17.33%","last_percent":"0.0%"},{"trading_id":"ed1c26c1e26443ca9b956767f20a78a2","action":"022","fd_code":"090010","fd_name":"大成中证红利指数A","portion":0.1673,"money":1931,"last_portion":0,"volume":0,"percent":"16.73%","last_percent":"0.0%"},{"trading_id":"ed1c26c1e26443ca9b956767f20a78a2","action":"022","fd_code":"110003","fd_name":"易方达上证50指数A","portion":0.1822,"money":2103,"last_portion":0,"volume":0,"percent":"18.22%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"6c27f627150c4dbda7766f06673e0230","plan_code":"CSI666","trade_date":1586707200000,"buy_amount":10705,"remark":"执行本周定投计划。市场整体处于4.5星级，每周会有至少一次定投。后面遇到大跌日也会临时定投。另外，易方达标普科技和中概互联，恢复申购，但每日限购500元。组合里增加了这两只，把500额度用上，后续会跟随基金公司额度调整。","created_at":1586756874176,"updated_at":1587874712163,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"6c27f627150c4dbda7766f06673e0230","action":"022","fd_code":"164906","fd_name":"交银中证海外中国互联网指数","portion":0.1213,"money":1298,"last_portion":0,"volume":0,"percent":"12.13%","last_percent":"0.0%"},{"trading_id":"6c27f627150c4dbda7766f06673e0230","action":"022","fd_code":"006327","fd_name":"易方达中概互联50ETF联接人民币A","portion":0.0467,"money":500,"last_portion":0,"volume":0,"percent":"4.67%","last_percent":"0.0%"},{"trading_id":"6c27f627150c4dbda7766f06673e0230","action":"022","fd_code":"161128","fd_name":"易方达标普信息科技","portion":0.0467,"money":500,"last_portion":0,"volume":0,"percent":"4.67%","last_percent":"0.0%"},{"trading_id":"6c27f627150c4dbda7766f06673e0230","action":"022","fd_code":"519671","fd_name":"银河沪深300价值指数","portion":0.2035,"money":2178,"last_portion":0,"volume":0,"percent":"20.35%","last_percent":"0.0%"},{"trading_id":"6c27f627150c4dbda7766f06673e0230","action":"022","fd_code":"001594","fd_name":"天弘中证银行指数A","portion":0.191,"money":2045,"last_portion":0,"volume":0,"percent":"19.1%","last_percent":"0.0%"},{"trading_id":"6c27f627150c4dbda7766f06673e0230","action":"022","fd_code":"090010","fd_name":"大成中证红利指数A","portion":0.1852,"money":1983,"last_portion":0,"volume":0,"percent":"18.52%","last_percent":"0.0%"},{"trading_id":"6c27f627150c4dbda7766f06673e0230","action":"022","fd_code":"110003","fd_name":"易方达上证50指数A","portion":0.2056,"money":2201,"last_portion":0,"volume":0,"percent":"20.56%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"d363801fb3c24b23a901aa0cc7b1560c","plan_code":"CSI666","trade_date":1586275200000,"buy_amount":10274,"remark":"执行本周定投计划。市场整体处于4.5星级，每周会有至少一次定投。后面遇到大跌日也会临时定投。另外，易方达标普科技和中概互联，恢复申购，但每日限购500元。组合里增加了这两只，把500额度用上，后续会跟随基金公司额度调整。","created_at":1586324488583,"updated_at":1587874711235,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"d363801fb3c24b23a901aa0cc7b1560c","action":"022","fd_code":"164906","fd_name":"交银中证海外中国互联网指数","portion":0.1231,"money":1264,"last_portion":0,"volume":0,"percent":"12.31%","last_percent":"0.0%"},{"trading_id":"d363801fb3c24b23a901aa0cc7b1560c","action":"022","fd_code":"006327","fd_name":"易方达中概互联50ETF联接人民币A","portion":0.0486,"money":500,"last_portion":0,"volume":0,"percent":"4.86%","last_percent":"0.0%"},{"trading_id":"d363801fb3c24b23a901aa0cc7b1560c","action":"022","fd_code":"161128","fd_name":"易方达标普信息科技","portion":0.0486,"money":500,"last_portion":0,"volume":0,"percent":"4.86%","last_percent":"0.0%"},{"trading_id":"d363801fb3c24b23a901aa0cc7b1560c","action":"022","fd_code":"519671","fd_name":"银河沪深300价值指数","portion":0.2094,"money":2151,"last_portion":0,"volume":0,"percent":"20.94%","last_percent":"0.0%"},{"trading_id":"d363801fb3c24b23a901aa0cc7b1560c","action":"022","fd_code":"001594","fd_name":"天弘中证银行指数A","portion":0.1953,"money":2007,"last_portion":0,"volume":0,"percent":"19.53%","last_percent":"0.0%"},{"trading_id":"d363801fb3c24b23a901aa0cc7b1560c","action":"022","fd_code":"501021","fd_name":"华宝香港中小","portion":0.1622,"money":1666,"last_portion":0,"volume":0,"percent":"16.22%","last_percent":"0.0%"},{"trading_id":"d363801fb3c24b23a901aa0cc7b1560c","action":"022","fd_code":"110003","fd_name":"易方达上证50指数A","portion":0.2128,"money":2186,"last_portion":0,"volume":0,"percent":"21.28%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"beb6bdca39614abb96b3b12e33a88239","plan_code":"CSI666","trade_date":1585497600000,"buy_amount":9882,"remark":"执行本周定投计划。市场整体处于4.5星级，每周会有至少一次定投。后面遇到大跌日也会临时定投。\n周二周三定投的朋友参考周一方案即可。另外，易方达标普科技和中概互联，恢复申购，但每日限购500元。组合里增加了这两只，把500额度用上，后续会跟随基金公司额度调整。","created_at":1585547392563,"updated_at":1587874709692,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"beb6bdca39614abb96b3b12e33a88239","action":"022","fd_code":"161725","fd_name":"招商中证白酒指数","portion":0.1686,"money":1666,"last_portion":0,"volume":0,"percent":"16.86%","last_percent":"0.0%"},{"trading_id":"beb6bdca39614abb96b3b12e33a88239","action":"022","fd_code":"519671","fd_name":"银河沪深300价值指数","portion":0.2192,"money":2166,"last_portion":0,"volume":0,"percent":"21.92%","last_percent":"0.0%"},{"trading_id":"beb6bdca39614abb96b3b12e33a88239","action":"022","fd_code":"001594","fd_name":"天弘中证银行指数A","portion":0.1982,"money":1959,"last_portion":0,"volume":0,"percent":"19.82%","last_percent":"0.0%"},{"trading_id":"beb6bdca39614abb96b3b12e33a88239","action":"022","fd_code":"530015","fd_name":"建信深证基本面60ETF联接A","portion":0.1723,"money":1702,"last_portion":0,"volume":0,"percent":"17.23%","last_percent":"0.0%"},{"trading_id":"beb6bdca39614abb96b3b12e33a88239","action":"022","fd_code":"164906","fd_name":"交银中证海外中国互联网指数","portion":0.1407,"money":1389,"last_portion":0,"volume":0,"percent":"14.07%","last_percent":"0.0%"},{"trading_id":"beb6bdca39614abb96b3b12e33a88239","action":"022","fd_code":"006327","fd_name":"易方达中概互联50ETF联接人民币A","portion":0.0505,"money":500,"last_portion":0,"volume":0,"percent":"5.05%","last_percent":"0.0%"},{"trading_id":"beb6bdca39614abb96b3b12e33a88239","action":"022","fd_code":"161128","fd_name":"易方达标普信息科技","portion":0.0505,"money":500,"last_portion":0,"volume":0,"percent":"5.05%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"c70acbc7de5944a8a7f651c173a3cf73","plan_code":"CSI666","trade_date":1584892800000,"buy_amount":13618,"remark":"今天A股港股、美股期货白天下跌比较多。临时发车一次。因为周一和周二定投相邻比较近，周二如果没有特殊情况就不发车了。周二周三定投的朋友可以参考周一的方案来即可。\n另外，易方达标普科技和中概互联，恢复申购，但每日限购500元。组合里增加了这两只，把500额度用上。后续会跟随基金公司额度来调整。","created_at":1584943599542,"updated_at":1587874708366,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"c70acbc7de5944a8a7f651c173a3cf73","action":"022","fd_code":"161725","fd_name":"招商中证白酒指数","portion":0.1223,"money":1666,"last_portion":0,"volume":0,"percent":"12.23%","last_percent":"0.0%"},{"trading_id":"c70acbc7de5944a8a7f651c173a3cf73","action":"022","fd_code":"519671","fd_name":"银河沪深300价值指数","portion":0.175,"money":2384,"last_portion":0,"volume":0,"percent":"17.5%","last_percent":"0.0%"},{"trading_id":"c70acbc7de5944a8a7f651c173a3cf73","action":"022","fd_code":"001594","fd_name":"天弘中证银行指数A","portion":0.1588,"money":2162,"last_portion":0,"volume":0,"percent":"15.88%","last_percent":"0.0%"},{"trading_id":"c70acbc7de5944a8a7f651c173a3cf73","action":"022","fd_code":"501021","fd_name":"华宝香港中小","portion":0.1645,"money":2240,"last_portion":0,"volume":0,"percent":"16.45%","last_percent":"0.0%"},{"trading_id":"c70acbc7de5944a8a7f651c173a3cf73","action":"022","fd_code":"164906","fd_name":"交银中证海外中国互联网指数","portion":0.1353,"money":1842,"last_portion":0,"volume":0,"percent":"13.53%","last_percent":"0.0%"},{"trading_id":"c70acbc7de5944a8a7f651c173a3cf73","action":"022","fd_code":"006327","fd_name":"易方达中概互联50ETF联接人民币A","portion":0.0367,"money":500,"last_portion":0,"volume":0,"percent":"3.67%","last_percent":"0.0%"},{"trading_id":"c70acbc7de5944a8a7f651c173a3cf73","action":"022","fd_code":"040046","fd_name":"华安纳斯达克100指数","portion":0.1707,"money":2324,"last_portion":0,"volume":0,"percent":"17.07%","last_percent":"0.0%"},{"trading_id":"c70acbc7de5944a8a7f651c173a3cf73","action":"022","fd_code":"161128","fd_name":"易方达标普信息科技","portion":0.0367,"money":500,"last_portion":0,"volume":0,"percent":"3.67%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"e9bbca17eddd4cd79a0a49656ffb9e15","plan_code":"CSI666","trade_date":1584547200000,"buy_amount":184164,"remark":"周四白天，美股股指期货盘中下跌超过4%。临时发车一次。之后遇到低估品种单日下跌超过3%，会考虑临时发车。1.可以按照之前定投比例跟投组合。2.如果资金有限，可以每周只跟一次临时发车。3.市场波动大，错过临时发车日，第二天如果上涨了，就不要再加仓。最近不缺少机会的。另外中概互联，估值达到历史最底部附近，额外加仓10%，螺丝钉自己会买入18万。为了方便大家本次按比例跟投，防止误操作，今天买入方案里先设置为2441元，后期会修正。","created_at":1585051565034,"updated_at":1587874707770,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"e9bbca17eddd4cd79a0a49656ffb9e15","action":"022","fd_code":"161725","fd_name":"招商中证白酒指数","portion":0.009,"money":1666,"last_portion":0,"volume":0,"percent":"0.9%","last_percent":"0.0%"},{"trading_id":"e9bbca17eddd4cd79a0a49656ffb9e15","action":"022","fd_code":"164906","fd_name":"交银中证海外中国互联网指数","portion":0.9774,"money":180000,"last_portion":0,"volume":0,"percent":"97.74%","last_percent":"0.0%"},{"trading_id":"e9bbca17eddd4cd79a0a49656ffb9e15","action":"022","fd_code":"040046","fd_name":"华安纳斯达克100指数","portion":0.0136,"money":2498,"last_portion":0,"volume":0,"percent":"1.36%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"8d17e1ac1e2d45469fe3fb2fa1b818f1","plan_code":"CSI666","trade_date":1584460800000,"buy_amount":4701,"remark":"周三白天，美股股指期货盘中下跌超过4%。临时发车一次。之后遇到低估品种单日下跌超过3%，会考虑临时发车。1.可以按照之前定投比例跟投组合。2.如果资金有限，可以每周只跟一次临时发车。3.市场波动大，错过临时发车日，第二天如果上涨了，就不要再加仓。最近不缺少机会的。\n中概互联停售，用交银的中国海外互联网代替。标普科技停售，用纳斯达克100代替。","created_at":1584510782679,"updated_at":1587874707513,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"8d17e1ac1e2d45469fe3fb2fa1b818f1","action":"022","fd_code":"164906","fd_name":"交银中证海外中国互联网指数","portion":0.4686,"money":2203,"last_portion":0,"volume":0,"percent":"46.86%","last_percent":"0.0%"},{"trading_id":"8d17e1ac1e2d45469fe3fb2fa1b818f1","action":"022","fd_code":"040046","fd_name":"华安纳斯达克100指数","portion":0.5314,"money":2498,"last_portion":0,"volume":0,"percent":"53.14%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"6b57838bbc324b9d9d14726e30ec4da2","plan_code":"CSI666","trade_date":1584288000000,"buy_amount":12175,"remark":"今天港股中概股下跌超过3%，美股股指期货下跌也比较多。临时发车一次。因为周一和周二定投相邻比较近，周二如果没有特殊情况就不发车了。周二周三定投的朋友可以参考周一的方案来即可。","created_at":1584337688011,"updated_at":1587874707047,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"6b57838bbc324b9d9d14726e30ec4da2","action":"022","fd_code":"519671","fd_name":"银河沪深300价值指数","portion":0.1743,"money":2122,"last_portion":0,"volume":0,"percent":"17.43%","last_percent":"0.0%"},{"trading_id":"6b57838bbc324b9d9d14726e30ec4da2","action":"022","fd_code":"090010","fd_name":"大成中证红利指数A","portion":0.1627,"money":1981,"last_portion":0,"volume":0,"percent":"16.27%","last_percent":"0.0%"},{"trading_id":"6b57838bbc324b9d9d14726e30ec4da2","action":"022","fd_code":"001594","fd_name":"天弘中证银行指数A","portion":0.1648,"money":2007,"last_portion":0,"volume":0,"percent":"16.48%","last_percent":"0.0%"},{"trading_id":"6b57838bbc324b9d9d14726e30ec4da2","action":"022","fd_code":"501021","fd_name":"华宝香港中小","portion":0.1544,"money":1879,"last_portion":0,"volume":0,"percent":"15.44%","last_percent":"0.0%"},{"trading_id":"6b57838bbc324b9d9d14726e30ec4da2","action":"022","fd_code":"164906","fd_name":"交银中证海外中国互联网指数","portion":0.1706,"money":2077,"last_portion":0,"volume":0,"percent":"17.06%","last_percent":"0.0%"},{"trading_id":"6b57838bbc324b9d9d14726e30ec4da2","action":"022","fd_code":"040046","fd_name":"华安纳斯达克100指数","portion":0.1732,"money":2109,"last_portion":0,"volume":0,"percent":"17.32%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"3af298e4e68645769d4c055455b5edb3","plan_code":"CSI666","trade_date":1583942400000,"buy_amount":5929,"remark":"【组合临时发车】港股美股下跌超过3%，组合临时发车一次。之后遇到低估品种单日下跌超过3%，会考虑临时发车。可以按照之前定投比例跟投组合，错过发车日，第二天如果上涨了，就不要再加仓。中概互联停售，用交银的中国海外互联网代替。标普科技停售，用纳斯达克100代替。","created_at":1583992184550,"updated_at":1587874706388,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"3af298e4e68645769d4c055455b5edb3","action":"022","fd_code":"501021","fd_name":"华宝香港中小","portion":0.2823,"money":1674,"last_portion":0,"volume":0,"percent":"28.23%","last_percent":"0.0%"},{"trading_id":"3af298e4e68645769d4c055455b5edb3","action":"022","fd_code":"164906","fd_name":"交银中证海外中国互联网指数","portion":0.3436,"money":2037,"last_portion":0,"volume":0,"percent":"34.36%","last_percent":"0.0%"},{"trading_id":"3af298e4e68645769d4c055455b5edb3","action":"022","fd_code":"040046","fd_name":"华安纳斯达克100指数","portion":0.3741,"money":2218,"last_portion":0,"volume":0,"percent":"37.41%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"181e27c6453a48a88c97f18e26104184","plan_code":"CSI666","trade_date":1583769600000,"buy_amount":9673,"remark":"这段时间全球市场波动巨大，海外市场普遍大跌。继续做好定投计划，积累优质资产。【温馨提醒】本周方案中的006327、161128两只基金从3月11日（周三）起暂停申购，3月10日15:00前的申购不受影响。","created_at":1583767193873,"updated_at":1587874705925,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"181e27c6453a48a88c97f18e26104184","action":"022","fd_code":"519671","fd_name":"银河沪深300价值指数","portion":0.2073,"money":2005,"last_portion":0,"volume":0,"percent":"20.73%","last_percent":"0.0%"},{"trading_id":"181e27c6453a48a88c97f18e26104184","action":"022","fd_code":"090010","fd_name":"大成中证红利指数A","portion":0.197,"money":1906,"last_portion":0,"volume":0,"percent":"19.7%","last_percent":"0.0%"},{"trading_id":"181e27c6453a48a88c97f18e26104184","action":"022","fd_code":"006327","fd_name":"易方达中概互联50ETF联接人民币A","portion":0.1953,"money":1889,"last_portion":0,"volume":0,"percent":"19.53%","last_percent":"0.0%"},{"trading_id":"181e27c6453a48a88c97f18e26104184","action":"022","fd_code":"001594","fd_name":"天弘中证银行指数A","portion":0.1979,"money":1914,"last_portion":0,"volume":0,"percent":"19.79%","last_percent":"0.0%"},{"trading_id":"181e27c6453a48a88c97f18e26104184","action":"022","fd_code":"161128","fd_name":"易方达标普信息科技","portion":0.2025,"money":1959,"last_portion":0,"volume":0,"percent":"20.25%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"57433e2212d54e7cb8c8abb8e7e462fd","plan_code":"CSI666","trade_date":1583164800000,"buy_amount":187437,"remark":"美股市场上周出现金融危机之后最大单周跌幅，加入标普科技的定投。 这周会单独买入一笔标普科技，大约占目前螺丝钉指数基金组合总仓位的10%（我的操作是18万元）。 为了方便大家本次按比例跟投，今天方案里先不体现这部分金额，后期会修正。 有资金的朋友可以单独加仓，加仓金额是目前持有组合总市值的10%（如持有10万螺丝钉组合，可以买1万）。 如果没有资金，可以赎回50%的基本面120，赎回款到账后手动买入即可。 美股短期里还会有可能出现20%级别的波动，后期下跌会通过定投摊低成本。","created_at":1583844132549,"updated_at":1587874704749,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"57433e2212d54e7cb8c8abb8e7e462fd","action":"022","fd_code":"519671","fd_name":"银河沪深300价值指数","portion":0.0104,"money":1958,"last_portion":0,"volume":0,"percent":"1.04%","last_percent":"0.0%"},{"trading_id":"57433e2212d54e7cb8c8abb8e7e462fd","action":"022","fd_code":"090010","fd_name":"大成中证红利指数A","portion":0.0098,"money":1846,"last_portion":0,"volume":0,"percent":"0.98%","last_percent":"0.0%"},{"trading_id":"57433e2212d54e7cb8c8abb8e7e462fd","action":"022","fd_code":"006327","fd_name":"易方达中概互联50ETF联接人民币A","portion":0.0094,"money":1756,"last_portion":0,"volume":0,"percent":"0.94%","last_percent":"0.0%"},{"trading_id":"57433e2212d54e7cb8c8abb8e7e462fd","action":"022","fd_code":"001594","fd_name":"天弘中证银行指数A","portion":0.01,"money":1877,"last_portion":0,"volume":0,"percent":"1.0%","last_percent":"0.0%"},{"trading_id":"57433e2212d54e7cb8c8abb8e7e462fd","action":"022","fd_code":"161128","fd_name":"易方达标普信息科技","portion":0.9604,"money":180000,"last_portion":0,"volume":0,"percent":"96.04%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"530d9b83677a4d15841d70fefe92cece","plan_code":"CSI666","trade_date":1582560000000,"buy_amount":7525,"remark":"最近海外市场波动明显增大，中概股恢复定投。500低波动回到正常估值，暂停定投继续持有。","created_at":1582593608124,"updated_at":1587874703498,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"530d9b83677a4d15841d70fefe92cece","action":"022","fd_code":"519671","fd_name":"银河沪深300价值指数","portion":0.27,"money":2004,"last_portion":0,"volume":0,"percent":"27.0%","last_percent":"0.0%"},{"trading_id":"530d9b83677a4d15841d70fefe92cece","action":"022","fd_code":"090010","fd_name":"大成中证红利指数A","portion":0.25,"money":1860,"last_portion":0,"volume":0,"percent":"25.0%","last_percent":"0.0%"},{"trading_id":"530d9b83677a4d15841d70fefe92cece","action":"022","fd_code":"001594","fd_name":"天弘中证银行指数A","portion":0.26,"money":1936,"last_portion":0,"volume":0,"percent":"26.0%","last_percent":"0.0%"},{"trading_id":"530d9b83677a4d15841d70fefe92cece","action":"022","fd_code":"006327","fd_name":"易方达中概互联50ETF联接人民币A","portion":0.22,"money":1725,"last_portion":0,"volume":0,"percent":"22.0%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"e7c07633cfa047b29e47abc4c042d762","plan_code":"CSI666","trade_date":1581955200000,"buy_amount":7473,"remark":"随着A股进一步上涨，低估品种和定投金额继续减少。\n今年上市公司基本面已经受到了影响，后面也不缺少投资机会的。\n但追涨往往带来不好的结果。耐心是投资者最好的美德～","created_at":1581986313098,"updated_at":1587874702392,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"e7c07633cfa047b29e47abc4c042d762","action":"022","fd_code":"519671","fd_name":"银河沪深300价值指数","portion":0.2666,"money":1992,"last_portion":0,"volume":0,"percent":"26.66%","last_percent":"0.0%"},{"trading_id":"e7c07633cfa047b29e47abc4c042d762","action":"022","fd_code":"090010","fd_name":"大成中证红利指数A","portion":0.2551,"money":1906,"last_portion":0,"volume":0,"percent":"25.51%","last_percent":"0.0%"},{"trading_id":"e7c07633cfa047b29e47abc4c042d762","action":"022","fd_code":"003318","fd_name":"景顺长城中证500低波动","portion":0.2232,"money":1668,"last_portion":0,"volume":0,"percent":"22.32%","last_percent":"0.0%"},{"trading_id":"e7c07633cfa047b29e47abc4c042d762","action":"022","fd_code":"001594","fd_name":"天弘中证银行指数A","portion":0.2551,"money":1907,"last_portion":0,"volume":0,"percent":"25.51%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"cd829a8eab004aba97ef30d0bdc9a180","plan_code":"CSI666","trade_date":1581609600000,"buy_amount":9379,"remark":"周二赎回医药100的资金到账，重新投入组合。\n【特别提醒】本次买入方案为2月11日赎回金额的再投入，不是常规发车计划！若你本周没有同步进行赎回操作，请不要跟投本次方案。\n本次买入金额为赎回到账金额，请根据你的实际赎回金额自行调整买入金额。为了防止误操作，本次买入金额先设为9379元，大家根据自己金额投资，后期方案将修正为主理人真实投入金额（11778.35元）。","created_at":1581602904573,"updated_at":1587874701943,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"cd829a8eab004aba97ef30d0bdc9a180","action":"022","fd_code":"519671","fd_name":"银河沪深300价值指数","portion":0.2241,"money":2102,"last_portion":0,"volume":0,"percent":"22.41%","last_percent":"0.0%"},{"trading_id":"cd829a8eab004aba97ef30d0bdc9a180","action":"022","fd_code":"090010","fd_name":"大成中证红利指数A","portion":0.2145,"money":2012,"last_portion":0,"volume":0,"percent":"21.45%","last_percent":"0.0%"},{"trading_id":"cd829a8eab004aba97ef30d0bdc9a180","action":"022","fd_code":"003318","fd_name":"景顺长城中证500低波动","portion":0.1826,"money":1713,"last_portion":0,"volume":0,"percent":"18.26%","last_percent":"0.0%"},{"trading_id":"cd829a8eab004aba97ef30d0bdc9a180","action":"022","fd_code":"001594","fd_name":"天弘中证银行指数A","portion":0.2161,"money":2027,"last_portion":0,"volume":0,"percent":"21.61%","last_percent":"0.0%"},{"trading_id":"cd829a8eab004aba97ef30d0bdc9a180","action":"022","fd_code":"006327","fd_name":"易方达中概互联50ETF联接人民币A","portion":0.1627,"money":1525,"last_portion":0,"volume":0,"percent":"16.27%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"5aaa272dedb94f5e880758b016307462","plan_code":"CSI666","trade_date":1581350400000,"buy_amount":9569,"remark":"本周继续坚持定投。A股有所回暖，定投金额开始减少。\n【特别提醒】本次的赎回方案为基金调仓，赎回款到账后，将再次投入组合。本周二15:00前赎回至现金宝，赎回资金将在本周五可用，届时再次买入本期方案即可。请注意：选择赎回到\u201c现金宝\u201d，到账时间比银行卡提前1天，建议大家选择赎回到现金宝。","created_at":1581344706284,"updated_at":1587874701164,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"5aaa272dedb94f5e880758b016307462","action":"022","fd_code":"519671","fd_name":"银河沪深300价值指数","portion":0.223,"money":2134,"last_portion":0,"volume":0,"percent":"22.3%","last_percent":"0.0%"},{"trading_id":"5aaa272dedb94f5e880758b016307462","action":"022","fd_code":"090010","fd_name":"大成中证红利指数A","portion":0.2135,"money":2043,"last_portion":0,"volume":0,"percent":"21.35%","last_percent":"0.0%"},{"trading_id":"5aaa272dedb94f5e880758b016307462","action":"022","fd_code":"003318","fd_name":"景顺长城中证500低波动","portion":0.1803,"money":1725,"last_portion":0,"volume":0,"percent":"18.03%","last_percent":"0.0%"},{"trading_id":"5aaa272dedb94f5e880758b016307462","action":"022","fd_code":"001594","fd_name":"天弘中证银行指数A","portion":0.2175,"money":2081,"last_portion":0,"volume":0,"percent":"21.75%","last_percent":"0.0%"},{"trading_id":"5aaa272dedb94f5e880758b016307462","action":"022","fd_code":"006327","fd_name":"易方达中概互联50ETF联接人民币A","portion":0.1657,"money":1586,"last_portion":0,"volume":0,"percent":"16.57%","last_percent":"0.0%"},{"trading_id":"5aaa272dedb94f5e880758b016307462","action":"024","fd_code":"001550","fd_name":"天弘中证医药100A","portion":1,"money":0,"last_portion":0,"volume":13343.55,"percent":"100.0%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"690db9218d8d4dfe82532e97a12d2a2b","plan_code":"CSI666","trade_date":1581004800000,"buy_amount":157548.36,"remark":"周二赎回红利基金的资金到账，一次性投入中概互联。 【特别提醒】本次买入方案为2月4日赎回金额的再投入，非常规发车！买入金额为赎回到账金额，请根据你的实际赎回金额自行调整买入金额。若你本周没有同步进行赎回操作，请不要跟投本次方案。每周常规定投方案将在下周二（2月11日）照常发布，届时可以继续跟投。为了防止误操作，本次买入金额先设为20000元，大家根据自己金额投资；后期将修正为主理人真实投入金额（157548.36元）。","created_at":1581343083156,"updated_at":1587874700805,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"690db9218d8d4dfe82532e97a12d2a2b","action":"022","fd_code":"006327","fd_name":"易方达中概互联50ETF联接人民币A","portion":1,"money":157548.36,"last_portion":0,"volume":0,"percent":"100.0%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"2d78a0db88ff4c2fabf9e9a9bc31d3e5","plan_code":"CSI666","trade_date":1580745600000,"buy_amount":12622,"remark":"A股短期大幅下跌，低估品种数量增加，定投金额也开始提高。本周新增两个低估品种的定投，基本面60和中概互联。 【特别提醒】本次的赎回方案为基金调仓，赎回款到账后，将再次投入组合。本周二15:00前赎回至现金宝，赎回资金将在本周五可用，届时我将发布再投入方案。请注意：选择赎回到\u201c现金宝\u201d，到账时间比银行卡提前1天，建议大家选择赎回到现金宝。","created_at":1581343012200,"updated_at":1587874700101,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"2d78a0db88ff4c2fabf9e9a9bc31d3e5","action":"022","fd_code":"519671","fd_name":"银河沪深300价值指数","portion":0.1866,"money":2355.27,"last_portion":0,"volume":0,"percent":"18.66%","last_percent":"0.0%"},{"trading_id":"2d78a0db88ff4c2fabf9e9a9bc31d3e5","action":"022","fd_code":"090010","fd_name":"大成中证红利指数A","portion":0.1836,"money":2317.4,"last_portion":0,"volume":0,"percent":"18.36%","last_percent":"0.0%"},{"trading_id":"2d78a0db88ff4c2fabf9e9a9bc31d3e5","action":"022","fd_code":"003318","fd_name":"景顺长城中证500低波动","portion":0.1624,"money":2049.81,"last_portion":0,"volume":0,"percent":"16.24%","last_percent":"0.0%"},{"trading_id":"2d78a0db88ff4c2fabf9e9a9bc31d3e5","action":"022","fd_code":"001594","fd_name":"天弘中证银行指数A","portion":0.1737,"money":2192.44,"last_portion":0,"volume":0,"percent":"17.37%","last_percent":"0.0%"},{"trading_id":"2d78a0db88ff4c2fabf9e9a9bc31d3e5","action":"022","fd_code":"530015","fd_name":"建信深证基本面60ETF联接A","portion":0.1478,"money":1865.53,"last_portion":0,"volume":0,"percent":"14.78%","last_percent":"0.0%"},{"trading_id":"2d78a0db88ff4c2fabf9e9a9bc31d3e5","action":"022","fd_code":"006327","fd_name":"易方达中概互联50ETF联接人民币A","portion":0.1459,"money":1841.55,"last_portion":0,"volume":0,"percent":"14.59%","last_percent":"0.0%"},{"trading_id":"2d78a0db88ff4c2fabf9e9a9bc31d3e5","action":"024","fd_code":"501029","fd_name":"华宝红利基金","portion":1,"money":0,"last_portion":0,"volume":171583.92,"percent":"100.0%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true}],"current_page":1,"size":20,"total_items":20,"total_pages":1}
     * result_code : 0
     */

    private DataBean data;
    private int result_code;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getResult_code() {
        return result_code;
    }

    public void setResult_code(int result_code) {
        this.result_code = result_code;
    }

    public static class DataBean {
        /**
         * items : [{"trading_id":"fc0cbd2b442042728eec6f4d1633bc29","plan_code":"CSI666","trade_date":1589817600000,"buy_amount":11325,"remark":"执行本周定投计划。另外，易方达中概互联，每日限购500元。组合里把500额度用上，后续会跟随基金公司额度调整。","created_at":1589864030608,"updated_at":1589864708616,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"fc0cbd2b442042728eec6f4d1633bc29","action":"022","fd_code":"164906","fd_name":"交银中证海外中国互联网指数","portion":0.1031,"money":1166,"last_portion":0,"volume":0,"percent":"10.31%","last_percent":"0.0%"},{"trading_id":"fc0cbd2b442042728eec6f4d1633bc29","action":"022","fd_code":"006327","fd_name":"易方达中概互联50ETF联接人民币A","portion":0.0441,"money":500,"last_portion":0,"volume":0,"percent":"4.41%","last_percent":"0.0%"},{"trading_id":"fc0cbd2b442042728eec6f4d1633bc29","action":"022","fd_code":"008975","fd_name":"富国中证消费50ETF联接A","portion":0.1471,"money":1666,"last_portion":0,"volume":0,"percent":"14.71%","last_percent":"0.0%"},{"trading_id":"fc0cbd2b442042728eec6f4d1633bc29","action":"022","fd_code":"519671","fd_name":"银河沪深300价值指数","portion":0.1832,"money":2075,"last_portion":0,"volume":0,"percent":"18.32%","last_percent":"0.0%"},{"trading_id":"fc0cbd2b442042728eec6f4d1633bc29","action":"022","fd_code":"001594","fd_name":"天弘中证银行指数A","portion":0.1696,"money":1921,"last_portion":0,"volume":0,"percent":"16.96%","last_percent":"0.0%"},{"trading_id":"fc0cbd2b442042728eec6f4d1633bc29","action":"022","fd_code":"090010","fd_name":"大成中证红利指数A","portion":0.1697,"money":1922,"last_portion":0,"volume":0,"percent":"16.97%","last_percent":"0.0%"},{"trading_id":"fc0cbd2b442042728eec6f4d1633bc29","action":"022","fd_code":"110003","fd_name":"易方达上证50指数A","portion":0.1832,"money":2075,"last_portion":0,"volume":0,"percent":"18.32%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"632699a9045f43479359e178aea98af3","plan_code":"CSI666","trade_date":1589212800000,"buy_amount":11213,"remark":"执行本周定投计划。另外，易方达中概互联，每日限购500元。组合里把500额度用上，后续会跟随基金公司额度调整。","created_at":1589254702610,"updated_at":1589254965506,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"632699a9045f43479359e178aea98af3","action":"022","fd_code":"164906","fd_name":"交银中证海外中国互联网指数","portion":0.1134,"money":1271,"last_portion":0,"volume":0,"percent":"11.34%","last_percent":"0.0%"},{"trading_id":"632699a9045f43479359e178aea98af3","action":"022","fd_code":"006327","fd_name":"易方达中概互联50ETF联接人民币A","portion":0.0445,"money":500,"last_portion":0,"volume":0,"percent":"4.45%","last_percent":"0.0%"},{"trading_id":"632699a9045f43479359e178aea98af3","action":"022","fd_code":"008975","fd_name":"富国中证消费50ETF联接A","portion":0.1486,"money":1666,"last_portion":0,"volume":0,"percent":"14.86%","last_percent":"0.0%"},{"trading_id":"632699a9045f43479359e178aea98af3","action":"022","fd_code":"519671","fd_name":"银河沪深300价值指数","portion":0.1792,"money":2009,"last_portion":0,"volume":0,"percent":"17.92%","last_percent":"0.0%"},{"trading_id":"632699a9045f43479359e178aea98af3","action":"022","fd_code":"001594","fd_name":"天弘中证银行指数A","portion":0.1682,"money":1886,"last_portion":0,"volume":0,"percent":"16.82%","last_percent":"0.0%"},{"trading_id":"632699a9045f43479359e178aea98af3","action":"022","fd_code":"090010","fd_name":"大成中证红利指数A","portion":0.1659,"money":1860,"last_portion":0,"volume":0,"percent":"16.59%","last_percent":"0.0%"},{"trading_id":"632699a9045f43479359e178aea98af3","action":"022","fd_code":"110003","fd_name":"易方达上证50指数A","portion":0.1802,"money":2021,"last_portion":0,"volume":0,"percent":"18.02%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"b74d48bfec214c948b1d9a0a63218071","plan_code":"CSI666","trade_date":1588694400000,"buy_amount":11327,"remark":"执行本周定投计划。另外，易方达中概互联，每日限购500元。组合里把500额度用上，后续会跟随基金公司额度调整。","created_at":1588737981682,"updated_at":1588738069586,"source":1,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"b74d48bfec214c948b1d9a0a63218071","action":"022","fd_code":"164906","fd_name":"交银中证海外中国互联网指数","portion":0.1188,"money":1346,"last_portion":0,"volume":0,"percent":"11.88%","last_percent":"0.0%"},{"trading_id":"b74d48bfec214c948b1d9a0a63218071","action":"022","fd_code":"006327","fd_name":"易方达中概互联50ETF联接人民币A","portion":0.0441,"money":500,"last_portion":0,"volume":0,"percent":"4.41%","last_percent":"0.0%"},{"trading_id":"b74d48bfec214c948b1d9a0a63218071","action":"022","fd_code":"519671","fd_name":"银河沪深300价值指数","portion":0.1794,"money":2031,"last_portion":0,"volume":0,"percent":"17.94%","last_percent":"0.0%"},{"trading_id":"b74d48bfec214c948b1d9a0a63218071","action":"022","fd_code":"001594","fd_name":"天弘中证银行指数A","portion":0.1648,"money":1867,"last_portion":0,"volume":0,"percent":"16.48%","last_percent":"0.0%"},{"trading_id":"b74d48bfec214c948b1d9a0a63218071","action":"022","fd_code":"110003","fd_name":"易方达上证50指数A","portion":0.1788,"money":2025,"last_portion":0,"volume":0,"percent":"17.88%","last_percent":"0.0%"},{"trading_id":"b74d48bfec214c948b1d9a0a63218071","action":"022","fd_code":"090010","fd_name":"大成中证红利指数A","portion":0.167,"money":1892,"last_portion":0,"volume":0,"percent":"16.7%","last_percent":"0.0%"},{"trading_id":"b74d48bfec214c948b1d9a0a63218071","action":"022","fd_code":"008975","fd_name":"富国中证消费50ETF联接A","portion":0.1471,"money":1666,"last_portion":0,"volume":0,"percent":"14.71%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":false,"published":true},{"trading_id":"ed1c26c1e26443ca9b956767f20a78a2","plan_code":"CSI666","trade_date":1587398400000,"buy_amount":11543,"remark":"执行本周定投计划。市场整体处于4.5星级，每周会有至少一次定投。后面遇到大跌日也会临时定投。另外，易方达中概互联，每日限购500元。组合里把500额度用上，后续会跟随基金公司额度调整。","created_at":1587447258827,"updated_at":1587874713621,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"ed1c26c1e26443ca9b956767f20a78a2","action":"022","fd_code":"164906","fd_name":"交银中证海外中国互联网指数","portion":0.1045,"money":1207,"last_portion":0,"volume":0,"percent":"10.45%","last_percent":"0.0%"},{"trading_id":"ed1c26c1e26443ca9b956767f20a78a2","action":"022","fd_code":"006327","fd_name":"易方达中概互联50ETF联接人民币A","portion":0.0433,"money":500,"last_portion":0,"volume":0,"percent":"4.33%","last_percent":"0.0%"},{"trading_id":"ed1c26c1e26443ca9b956767f20a78a2","action":"022","fd_code":"008975","fd_name":"富国中证消费50ETF联接A","portion":0.1461,"money":1686,"last_portion":0,"volume":0,"percent":"14.61%","last_percent":"0.0%"},{"trading_id":"ed1c26c1e26443ca9b956767f20a78a2","action":"022","fd_code":"519671","fd_name":"银河沪深300价值指数","portion":0.1833,"money":2116,"last_portion":0,"volume":0,"percent":"18.33%","last_percent":"0.0%"},{"trading_id":"ed1c26c1e26443ca9b956767f20a78a2","action":"022","fd_code":"001594","fd_name":"天弘中证银行指数A","portion":0.1733,"money":2000,"last_portion":0,"volume":0,"percent":"17.33%","last_percent":"0.0%"},{"trading_id":"ed1c26c1e26443ca9b956767f20a78a2","action":"022","fd_code":"090010","fd_name":"大成中证红利指数A","portion":0.1673,"money":1931,"last_portion":0,"volume":0,"percent":"16.73%","last_percent":"0.0%"},{"trading_id":"ed1c26c1e26443ca9b956767f20a78a2","action":"022","fd_code":"110003","fd_name":"易方达上证50指数A","portion":0.1822,"money":2103,"last_portion":0,"volume":0,"percent":"18.22%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"6c27f627150c4dbda7766f06673e0230","plan_code":"CSI666","trade_date":1586707200000,"buy_amount":10705,"remark":"执行本周定投计划。市场整体处于4.5星级，每周会有至少一次定投。后面遇到大跌日也会临时定投。另外，易方达标普科技和中概互联，恢复申购，但每日限购500元。组合里增加了这两只，把500额度用上，后续会跟随基金公司额度调整。","created_at":1586756874176,"updated_at":1587874712163,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"6c27f627150c4dbda7766f06673e0230","action":"022","fd_code":"164906","fd_name":"交银中证海外中国互联网指数","portion":0.1213,"money":1298,"last_portion":0,"volume":0,"percent":"12.13%","last_percent":"0.0%"},{"trading_id":"6c27f627150c4dbda7766f06673e0230","action":"022","fd_code":"006327","fd_name":"易方达中概互联50ETF联接人民币A","portion":0.0467,"money":500,"last_portion":0,"volume":0,"percent":"4.67%","last_percent":"0.0%"},{"trading_id":"6c27f627150c4dbda7766f06673e0230","action":"022","fd_code":"161128","fd_name":"易方达标普信息科技","portion":0.0467,"money":500,"last_portion":0,"volume":0,"percent":"4.67%","last_percent":"0.0%"},{"trading_id":"6c27f627150c4dbda7766f06673e0230","action":"022","fd_code":"519671","fd_name":"银河沪深300价值指数","portion":0.2035,"money":2178,"last_portion":0,"volume":0,"percent":"20.35%","last_percent":"0.0%"},{"trading_id":"6c27f627150c4dbda7766f06673e0230","action":"022","fd_code":"001594","fd_name":"天弘中证银行指数A","portion":0.191,"money":2045,"last_portion":0,"volume":0,"percent":"19.1%","last_percent":"0.0%"},{"trading_id":"6c27f627150c4dbda7766f06673e0230","action":"022","fd_code":"090010","fd_name":"大成中证红利指数A","portion":0.1852,"money":1983,"last_portion":0,"volume":0,"percent":"18.52%","last_percent":"0.0%"},{"trading_id":"6c27f627150c4dbda7766f06673e0230","action":"022","fd_code":"110003","fd_name":"易方达上证50指数A","portion":0.2056,"money":2201,"last_portion":0,"volume":0,"percent":"20.56%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"d363801fb3c24b23a901aa0cc7b1560c","plan_code":"CSI666","trade_date":1586275200000,"buy_amount":10274,"remark":"执行本周定投计划。市场整体处于4.5星级，每周会有至少一次定投。后面遇到大跌日也会临时定投。另外，易方达标普科技和中概互联，恢复申购，但每日限购500元。组合里增加了这两只，把500额度用上，后续会跟随基金公司额度调整。","created_at":1586324488583,"updated_at":1587874711235,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"d363801fb3c24b23a901aa0cc7b1560c","action":"022","fd_code":"164906","fd_name":"交银中证海外中国互联网指数","portion":0.1231,"money":1264,"last_portion":0,"volume":0,"percent":"12.31%","last_percent":"0.0%"},{"trading_id":"d363801fb3c24b23a901aa0cc7b1560c","action":"022","fd_code":"006327","fd_name":"易方达中概互联50ETF联接人民币A","portion":0.0486,"money":500,"last_portion":0,"volume":0,"percent":"4.86%","last_percent":"0.0%"},{"trading_id":"d363801fb3c24b23a901aa0cc7b1560c","action":"022","fd_code":"161128","fd_name":"易方达标普信息科技","portion":0.0486,"money":500,"last_portion":0,"volume":0,"percent":"4.86%","last_percent":"0.0%"},{"trading_id":"d363801fb3c24b23a901aa0cc7b1560c","action":"022","fd_code":"519671","fd_name":"银河沪深300价值指数","portion":0.2094,"money":2151,"last_portion":0,"volume":0,"percent":"20.94%","last_percent":"0.0%"},{"trading_id":"d363801fb3c24b23a901aa0cc7b1560c","action":"022","fd_code":"001594","fd_name":"天弘中证银行指数A","portion":0.1953,"money":2007,"last_portion":0,"volume":0,"percent":"19.53%","last_percent":"0.0%"},{"trading_id":"d363801fb3c24b23a901aa0cc7b1560c","action":"022","fd_code":"501021","fd_name":"华宝香港中小","portion":0.1622,"money":1666,"last_portion":0,"volume":0,"percent":"16.22%","last_percent":"0.0%"},{"trading_id":"d363801fb3c24b23a901aa0cc7b1560c","action":"022","fd_code":"110003","fd_name":"易方达上证50指数A","portion":0.2128,"money":2186,"last_portion":0,"volume":0,"percent":"21.28%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"beb6bdca39614abb96b3b12e33a88239","plan_code":"CSI666","trade_date":1585497600000,"buy_amount":9882,"remark":"执行本周定投计划。市场整体处于4.5星级，每周会有至少一次定投。后面遇到大跌日也会临时定投。\n周二周三定投的朋友参考周一方案即可。另外，易方达标普科技和中概互联，恢复申购，但每日限购500元。组合里增加了这两只，把500额度用上，后续会跟随基金公司额度调整。","created_at":1585547392563,"updated_at":1587874709692,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"beb6bdca39614abb96b3b12e33a88239","action":"022","fd_code":"161725","fd_name":"招商中证白酒指数","portion":0.1686,"money":1666,"last_portion":0,"volume":0,"percent":"16.86%","last_percent":"0.0%"},{"trading_id":"beb6bdca39614abb96b3b12e33a88239","action":"022","fd_code":"519671","fd_name":"银河沪深300价值指数","portion":0.2192,"money":2166,"last_portion":0,"volume":0,"percent":"21.92%","last_percent":"0.0%"},{"trading_id":"beb6bdca39614abb96b3b12e33a88239","action":"022","fd_code":"001594","fd_name":"天弘中证银行指数A","portion":0.1982,"money":1959,"last_portion":0,"volume":0,"percent":"19.82%","last_percent":"0.0%"},{"trading_id":"beb6bdca39614abb96b3b12e33a88239","action":"022","fd_code":"530015","fd_name":"建信深证基本面60ETF联接A","portion":0.1723,"money":1702,"last_portion":0,"volume":0,"percent":"17.23%","last_percent":"0.0%"},{"trading_id":"beb6bdca39614abb96b3b12e33a88239","action":"022","fd_code":"164906","fd_name":"交银中证海外中国互联网指数","portion":0.1407,"money":1389,"last_portion":0,"volume":0,"percent":"14.07%","last_percent":"0.0%"},{"trading_id":"beb6bdca39614abb96b3b12e33a88239","action":"022","fd_code":"006327","fd_name":"易方达中概互联50ETF联接人民币A","portion":0.0505,"money":500,"last_portion":0,"volume":0,"percent":"5.05%","last_percent":"0.0%"},{"trading_id":"beb6bdca39614abb96b3b12e33a88239","action":"022","fd_code":"161128","fd_name":"易方达标普信息科技","portion":0.0505,"money":500,"last_portion":0,"volume":0,"percent":"5.05%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"c70acbc7de5944a8a7f651c173a3cf73","plan_code":"CSI666","trade_date":1584892800000,"buy_amount":13618,"remark":"今天A股港股、美股期货白天下跌比较多。临时发车一次。因为周一和周二定投相邻比较近，周二如果没有特殊情况就不发车了。周二周三定投的朋友可以参考周一的方案来即可。\n另外，易方达标普科技和中概互联，恢复申购，但每日限购500元。组合里增加了这两只，把500额度用上。后续会跟随基金公司额度来调整。","created_at":1584943599542,"updated_at":1587874708366,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"c70acbc7de5944a8a7f651c173a3cf73","action":"022","fd_code":"161725","fd_name":"招商中证白酒指数","portion":0.1223,"money":1666,"last_portion":0,"volume":0,"percent":"12.23%","last_percent":"0.0%"},{"trading_id":"c70acbc7de5944a8a7f651c173a3cf73","action":"022","fd_code":"519671","fd_name":"银河沪深300价值指数","portion":0.175,"money":2384,"last_portion":0,"volume":0,"percent":"17.5%","last_percent":"0.0%"},{"trading_id":"c70acbc7de5944a8a7f651c173a3cf73","action":"022","fd_code":"001594","fd_name":"天弘中证银行指数A","portion":0.1588,"money":2162,"last_portion":0,"volume":0,"percent":"15.88%","last_percent":"0.0%"},{"trading_id":"c70acbc7de5944a8a7f651c173a3cf73","action":"022","fd_code":"501021","fd_name":"华宝香港中小","portion":0.1645,"money":2240,"last_portion":0,"volume":0,"percent":"16.45%","last_percent":"0.0%"},{"trading_id":"c70acbc7de5944a8a7f651c173a3cf73","action":"022","fd_code":"164906","fd_name":"交银中证海外中国互联网指数","portion":0.1353,"money":1842,"last_portion":0,"volume":0,"percent":"13.53%","last_percent":"0.0%"},{"trading_id":"c70acbc7de5944a8a7f651c173a3cf73","action":"022","fd_code":"006327","fd_name":"易方达中概互联50ETF联接人民币A","portion":0.0367,"money":500,"last_portion":0,"volume":0,"percent":"3.67%","last_percent":"0.0%"},{"trading_id":"c70acbc7de5944a8a7f651c173a3cf73","action":"022","fd_code":"040046","fd_name":"华安纳斯达克100指数","portion":0.1707,"money":2324,"last_portion":0,"volume":0,"percent":"17.07%","last_percent":"0.0%"},{"trading_id":"c70acbc7de5944a8a7f651c173a3cf73","action":"022","fd_code":"161128","fd_name":"易方达标普信息科技","portion":0.0367,"money":500,"last_portion":0,"volume":0,"percent":"3.67%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"e9bbca17eddd4cd79a0a49656ffb9e15","plan_code":"CSI666","trade_date":1584547200000,"buy_amount":184164,"remark":"周四白天，美股股指期货盘中下跌超过4%。临时发车一次。之后遇到低估品种单日下跌超过3%，会考虑临时发车。1.可以按照之前定投比例跟投组合。2.如果资金有限，可以每周只跟一次临时发车。3.市场波动大，错过临时发车日，第二天如果上涨了，就不要再加仓。最近不缺少机会的。另外中概互联，估值达到历史最底部附近，额外加仓10%，螺丝钉自己会买入18万。为了方便大家本次按比例跟投，防止误操作，今天买入方案里先设置为2441元，后期会修正。","created_at":1585051565034,"updated_at":1587874707770,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"e9bbca17eddd4cd79a0a49656ffb9e15","action":"022","fd_code":"161725","fd_name":"招商中证白酒指数","portion":0.009,"money":1666,"last_portion":0,"volume":0,"percent":"0.9%","last_percent":"0.0%"},{"trading_id":"e9bbca17eddd4cd79a0a49656ffb9e15","action":"022","fd_code":"164906","fd_name":"交银中证海外中国互联网指数","portion":0.9774,"money":180000,"last_portion":0,"volume":0,"percent":"97.74%","last_percent":"0.0%"},{"trading_id":"e9bbca17eddd4cd79a0a49656ffb9e15","action":"022","fd_code":"040046","fd_name":"华安纳斯达克100指数","portion":0.0136,"money":2498,"last_portion":0,"volume":0,"percent":"1.36%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"8d17e1ac1e2d45469fe3fb2fa1b818f1","plan_code":"CSI666","trade_date":1584460800000,"buy_amount":4701,"remark":"周三白天，美股股指期货盘中下跌超过4%。临时发车一次。之后遇到低估品种单日下跌超过3%，会考虑临时发车。1.可以按照之前定投比例跟投组合。2.如果资金有限，可以每周只跟一次临时发车。3.市场波动大，错过临时发车日，第二天如果上涨了，就不要再加仓。最近不缺少机会的。\n中概互联停售，用交银的中国海外互联网代替。标普科技停售，用纳斯达克100代替。","created_at":1584510782679,"updated_at":1587874707513,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"8d17e1ac1e2d45469fe3fb2fa1b818f1","action":"022","fd_code":"164906","fd_name":"交银中证海外中国互联网指数","portion":0.4686,"money":2203,"last_portion":0,"volume":0,"percent":"46.86%","last_percent":"0.0%"},{"trading_id":"8d17e1ac1e2d45469fe3fb2fa1b818f1","action":"022","fd_code":"040046","fd_name":"华安纳斯达克100指数","portion":0.5314,"money":2498,"last_portion":0,"volume":0,"percent":"53.14%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"6b57838bbc324b9d9d14726e30ec4da2","plan_code":"CSI666","trade_date":1584288000000,"buy_amount":12175,"remark":"今天港股中概股下跌超过3%，美股股指期货下跌也比较多。临时发车一次。因为周一和周二定投相邻比较近，周二如果没有特殊情况就不发车了。周二周三定投的朋友可以参考周一的方案来即可。","created_at":1584337688011,"updated_at":1587874707047,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"6b57838bbc324b9d9d14726e30ec4da2","action":"022","fd_code":"519671","fd_name":"银河沪深300价值指数","portion":0.1743,"money":2122,"last_portion":0,"volume":0,"percent":"17.43%","last_percent":"0.0%"},{"trading_id":"6b57838bbc324b9d9d14726e30ec4da2","action":"022","fd_code":"090010","fd_name":"大成中证红利指数A","portion":0.1627,"money":1981,"last_portion":0,"volume":0,"percent":"16.27%","last_percent":"0.0%"},{"trading_id":"6b57838bbc324b9d9d14726e30ec4da2","action":"022","fd_code":"001594","fd_name":"天弘中证银行指数A","portion":0.1648,"money":2007,"last_portion":0,"volume":0,"percent":"16.48%","last_percent":"0.0%"},{"trading_id":"6b57838bbc324b9d9d14726e30ec4da2","action":"022","fd_code":"501021","fd_name":"华宝香港中小","portion":0.1544,"money":1879,"last_portion":0,"volume":0,"percent":"15.44%","last_percent":"0.0%"},{"trading_id":"6b57838bbc324b9d9d14726e30ec4da2","action":"022","fd_code":"164906","fd_name":"交银中证海外中国互联网指数","portion":0.1706,"money":2077,"last_portion":0,"volume":0,"percent":"17.06%","last_percent":"0.0%"},{"trading_id":"6b57838bbc324b9d9d14726e30ec4da2","action":"022","fd_code":"040046","fd_name":"华安纳斯达克100指数","portion":0.1732,"money":2109,"last_portion":0,"volume":0,"percent":"17.32%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"3af298e4e68645769d4c055455b5edb3","plan_code":"CSI666","trade_date":1583942400000,"buy_amount":5929,"remark":"【组合临时发车】港股美股下跌超过3%，组合临时发车一次。之后遇到低估品种单日下跌超过3%，会考虑临时发车。可以按照之前定投比例跟投组合，错过发车日，第二天如果上涨了，就不要再加仓。中概互联停售，用交银的中国海外互联网代替。标普科技停售，用纳斯达克100代替。","created_at":1583992184550,"updated_at":1587874706388,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"3af298e4e68645769d4c055455b5edb3","action":"022","fd_code":"501021","fd_name":"华宝香港中小","portion":0.2823,"money":1674,"last_portion":0,"volume":0,"percent":"28.23%","last_percent":"0.0%"},{"trading_id":"3af298e4e68645769d4c055455b5edb3","action":"022","fd_code":"164906","fd_name":"交银中证海外中国互联网指数","portion":0.3436,"money":2037,"last_portion":0,"volume":0,"percent":"34.36%","last_percent":"0.0%"},{"trading_id":"3af298e4e68645769d4c055455b5edb3","action":"022","fd_code":"040046","fd_name":"华安纳斯达克100指数","portion":0.3741,"money":2218,"last_portion":0,"volume":0,"percent":"37.41%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"181e27c6453a48a88c97f18e26104184","plan_code":"CSI666","trade_date":1583769600000,"buy_amount":9673,"remark":"这段时间全球市场波动巨大，海外市场普遍大跌。继续做好定投计划，积累优质资产。【温馨提醒】本周方案中的006327、161128两只基金从3月11日（周三）起暂停申购，3月10日15:00前的申购不受影响。","created_at":1583767193873,"updated_at":1587874705925,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"181e27c6453a48a88c97f18e26104184","action":"022","fd_code":"519671","fd_name":"银河沪深300价值指数","portion":0.2073,"money":2005,"last_portion":0,"volume":0,"percent":"20.73%","last_percent":"0.0%"},{"trading_id":"181e27c6453a48a88c97f18e26104184","action":"022","fd_code":"090010","fd_name":"大成中证红利指数A","portion":0.197,"money":1906,"last_portion":0,"volume":0,"percent":"19.7%","last_percent":"0.0%"},{"trading_id":"181e27c6453a48a88c97f18e26104184","action":"022","fd_code":"006327","fd_name":"易方达中概互联50ETF联接人民币A","portion":0.1953,"money":1889,"last_portion":0,"volume":0,"percent":"19.53%","last_percent":"0.0%"},{"trading_id":"181e27c6453a48a88c97f18e26104184","action":"022","fd_code":"001594","fd_name":"天弘中证银行指数A","portion":0.1979,"money":1914,"last_portion":0,"volume":0,"percent":"19.79%","last_percent":"0.0%"},{"trading_id":"181e27c6453a48a88c97f18e26104184","action":"022","fd_code":"161128","fd_name":"易方达标普信息科技","portion":0.2025,"money":1959,"last_portion":0,"volume":0,"percent":"20.25%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"57433e2212d54e7cb8c8abb8e7e462fd","plan_code":"CSI666","trade_date":1583164800000,"buy_amount":187437,"remark":"美股市场上周出现金融危机之后最大单周跌幅，加入标普科技的定投。 这周会单独买入一笔标普科技，大约占目前螺丝钉指数基金组合总仓位的10%（我的操作是18万元）。 为了方便大家本次按比例跟投，今天方案里先不体现这部分金额，后期会修正。 有资金的朋友可以单独加仓，加仓金额是目前持有组合总市值的10%（如持有10万螺丝钉组合，可以买1万）。 如果没有资金，可以赎回50%的基本面120，赎回款到账后手动买入即可。 美股短期里还会有可能出现20%级别的波动，后期下跌会通过定投摊低成本。","created_at":1583844132549,"updated_at":1587874704749,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"57433e2212d54e7cb8c8abb8e7e462fd","action":"022","fd_code":"519671","fd_name":"银河沪深300价值指数","portion":0.0104,"money":1958,"last_portion":0,"volume":0,"percent":"1.04%","last_percent":"0.0%"},{"trading_id":"57433e2212d54e7cb8c8abb8e7e462fd","action":"022","fd_code":"090010","fd_name":"大成中证红利指数A","portion":0.0098,"money":1846,"last_portion":0,"volume":0,"percent":"0.98%","last_percent":"0.0%"},{"trading_id":"57433e2212d54e7cb8c8abb8e7e462fd","action":"022","fd_code":"006327","fd_name":"易方达中概互联50ETF联接人民币A","portion":0.0094,"money":1756,"last_portion":0,"volume":0,"percent":"0.94%","last_percent":"0.0%"},{"trading_id":"57433e2212d54e7cb8c8abb8e7e462fd","action":"022","fd_code":"001594","fd_name":"天弘中证银行指数A","portion":0.01,"money":1877,"last_portion":0,"volume":0,"percent":"1.0%","last_percent":"0.0%"},{"trading_id":"57433e2212d54e7cb8c8abb8e7e462fd","action":"022","fd_code":"161128","fd_name":"易方达标普信息科技","portion":0.9604,"money":180000,"last_portion":0,"volume":0,"percent":"96.04%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"530d9b83677a4d15841d70fefe92cece","plan_code":"CSI666","trade_date":1582560000000,"buy_amount":7525,"remark":"最近海外市场波动明显增大，中概股恢复定投。500低波动回到正常估值，暂停定投继续持有。","created_at":1582593608124,"updated_at":1587874703498,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"530d9b83677a4d15841d70fefe92cece","action":"022","fd_code":"519671","fd_name":"银河沪深300价值指数","portion":0.27,"money":2004,"last_portion":0,"volume":0,"percent":"27.0%","last_percent":"0.0%"},{"trading_id":"530d9b83677a4d15841d70fefe92cece","action":"022","fd_code":"090010","fd_name":"大成中证红利指数A","portion":0.25,"money":1860,"last_portion":0,"volume":0,"percent":"25.0%","last_percent":"0.0%"},{"trading_id":"530d9b83677a4d15841d70fefe92cece","action":"022","fd_code":"001594","fd_name":"天弘中证银行指数A","portion":0.26,"money":1936,"last_portion":0,"volume":0,"percent":"26.0%","last_percent":"0.0%"},{"trading_id":"530d9b83677a4d15841d70fefe92cece","action":"022","fd_code":"006327","fd_name":"易方达中概互联50ETF联接人民币A","portion":0.22,"money":1725,"last_portion":0,"volume":0,"percent":"22.0%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"e7c07633cfa047b29e47abc4c042d762","plan_code":"CSI666","trade_date":1581955200000,"buy_amount":7473,"remark":"随着A股进一步上涨，低估品种和定投金额继续减少。\n今年上市公司基本面已经受到了影响，后面也不缺少投资机会的。\n但追涨往往带来不好的结果。耐心是投资者最好的美德～","created_at":1581986313098,"updated_at":1587874702392,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"e7c07633cfa047b29e47abc4c042d762","action":"022","fd_code":"519671","fd_name":"银河沪深300价值指数","portion":0.2666,"money":1992,"last_portion":0,"volume":0,"percent":"26.66%","last_percent":"0.0%"},{"trading_id":"e7c07633cfa047b29e47abc4c042d762","action":"022","fd_code":"090010","fd_name":"大成中证红利指数A","portion":0.2551,"money":1906,"last_portion":0,"volume":0,"percent":"25.51%","last_percent":"0.0%"},{"trading_id":"e7c07633cfa047b29e47abc4c042d762","action":"022","fd_code":"003318","fd_name":"景顺长城中证500低波动","portion":0.2232,"money":1668,"last_portion":0,"volume":0,"percent":"22.32%","last_percent":"0.0%"},{"trading_id":"e7c07633cfa047b29e47abc4c042d762","action":"022","fd_code":"001594","fd_name":"天弘中证银行指数A","portion":0.2551,"money":1907,"last_portion":0,"volume":0,"percent":"25.51%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"cd829a8eab004aba97ef30d0bdc9a180","plan_code":"CSI666","trade_date":1581609600000,"buy_amount":9379,"remark":"周二赎回医药100的资金到账，重新投入组合。\n【特别提醒】本次买入方案为2月11日赎回金额的再投入，不是常规发车计划！若你本周没有同步进行赎回操作，请不要跟投本次方案。\n本次买入金额为赎回到账金额，请根据你的实际赎回金额自行调整买入金额。为了防止误操作，本次买入金额先设为9379元，大家根据自己金额投资，后期方案将修正为主理人真实投入金额（11778.35元）。","created_at":1581602904573,"updated_at":1587874701943,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"cd829a8eab004aba97ef30d0bdc9a180","action":"022","fd_code":"519671","fd_name":"银河沪深300价值指数","portion":0.2241,"money":2102,"last_portion":0,"volume":0,"percent":"22.41%","last_percent":"0.0%"},{"trading_id":"cd829a8eab004aba97ef30d0bdc9a180","action":"022","fd_code":"090010","fd_name":"大成中证红利指数A","portion":0.2145,"money":2012,"last_portion":0,"volume":0,"percent":"21.45%","last_percent":"0.0%"},{"trading_id":"cd829a8eab004aba97ef30d0bdc9a180","action":"022","fd_code":"003318","fd_name":"景顺长城中证500低波动","portion":0.1826,"money":1713,"last_portion":0,"volume":0,"percent":"18.26%","last_percent":"0.0%"},{"trading_id":"cd829a8eab004aba97ef30d0bdc9a180","action":"022","fd_code":"001594","fd_name":"天弘中证银行指数A","portion":0.2161,"money":2027,"last_portion":0,"volume":0,"percent":"21.61%","last_percent":"0.0%"},{"trading_id":"cd829a8eab004aba97ef30d0bdc9a180","action":"022","fd_code":"006327","fd_name":"易方达中概互联50ETF联接人民币A","portion":0.1627,"money":1525,"last_portion":0,"volume":0,"percent":"16.27%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"5aaa272dedb94f5e880758b016307462","plan_code":"CSI666","trade_date":1581350400000,"buy_amount":9569,"remark":"本周继续坚持定投。A股有所回暖，定投金额开始减少。\n【特别提醒】本次的赎回方案为基金调仓，赎回款到账后，将再次投入组合。本周二15:00前赎回至现金宝，赎回资金将在本周五可用，届时再次买入本期方案即可。请注意：选择赎回到\u201c现金宝\u201d，到账时间比银行卡提前1天，建议大家选择赎回到现金宝。","created_at":1581344706284,"updated_at":1587874701164,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"5aaa272dedb94f5e880758b016307462","action":"022","fd_code":"519671","fd_name":"银河沪深300价值指数","portion":0.223,"money":2134,"last_portion":0,"volume":0,"percent":"22.3%","last_percent":"0.0%"},{"trading_id":"5aaa272dedb94f5e880758b016307462","action":"022","fd_code":"090010","fd_name":"大成中证红利指数A","portion":0.2135,"money":2043,"last_portion":0,"volume":0,"percent":"21.35%","last_percent":"0.0%"},{"trading_id":"5aaa272dedb94f5e880758b016307462","action":"022","fd_code":"003318","fd_name":"景顺长城中证500低波动","portion":0.1803,"money":1725,"last_portion":0,"volume":0,"percent":"18.03%","last_percent":"0.0%"},{"trading_id":"5aaa272dedb94f5e880758b016307462","action":"022","fd_code":"001594","fd_name":"天弘中证银行指数A","portion":0.2175,"money":2081,"last_portion":0,"volume":0,"percent":"21.75%","last_percent":"0.0%"},{"trading_id":"5aaa272dedb94f5e880758b016307462","action":"022","fd_code":"006327","fd_name":"易方达中概互联50ETF联接人民币A","portion":0.1657,"money":1586,"last_portion":0,"volume":0,"percent":"16.57%","last_percent":"0.0%"},{"trading_id":"5aaa272dedb94f5e880758b016307462","action":"024","fd_code":"001550","fd_name":"天弘中证医药100A","portion":1,"money":0,"last_portion":0,"volume":13343.55,"percent":"100.0%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"690db9218d8d4dfe82532e97a12d2a2b","plan_code":"CSI666","trade_date":1581004800000,"buy_amount":157548.36,"remark":"周二赎回红利基金的资金到账，一次性投入中概互联。 【特别提醒】本次买入方案为2月4日赎回金额的再投入，非常规发车！买入金额为赎回到账金额，请根据你的实际赎回金额自行调整买入金额。若你本周没有同步进行赎回操作，请不要跟投本次方案。每周常规定投方案将在下周二（2月11日）照常发布，届时可以继续跟投。为了防止误操作，本次买入金额先设为20000元，大家根据自己金额投资；后期将修正为主理人真实投入金额（157548.36元）。","created_at":1581343083156,"updated_at":1587874700805,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"690db9218d8d4dfe82532e97a12d2a2b","action":"022","fd_code":"006327","fd_name":"易方达中概互联50ETF联接人民币A","portion":1,"money":157548.36,"last_portion":0,"volume":0,"percent":"100.0%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true},{"trading_id":"2d78a0db88ff4c2fabf9e9a9bc31d3e5","plan_code":"CSI666","trade_date":1580745600000,"buy_amount":12622,"remark":"A股短期大幅下跌，低估品种数量增加，定投金额也开始提高。本周新增两个低估品种的定投，基本面60和中概互联。 【特别提醒】本次的赎回方案为基金调仓，赎回款到账后，将再次投入组合。本周二15:00前赎回至现金宝，赎回资金将在本周五可用，届时我将发布再投入方案。请注意：选择赎回到\u201c现金宝\u201d，到账时间比银行卡提前1天，建议大家选择赎回到现金宝。","created_at":1581343012200,"updated_at":1587874700101,"source":0,"status":1,"pre_send_status":1,"send_status":1,"sale_type":0,"trading_elements":[{"trading_id":"2d78a0db88ff4c2fabf9e9a9bc31d3e5","action":"022","fd_code":"519671","fd_name":"银河沪深300价值指数","portion":0.1866,"money":2355.27,"last_portion":0,"volume":0,"percent":"18.66%","last_percent":"0.0%"},{"trading_id":"2d78a0db88ff4c2fabf9e9a9bc31d3e5","action":"022","fd_code":"090010","fd_name":"大成中证红利指数A","portion":0.1836,"money":2317.4,"last_portion":0,"volume":0,"percent":"18.36%","last_percent":"0.0%"},{"trading_id":"2d78a0db88ff4c2fabf9e9a9bc31d3e5","action":"022","fd_code":"003318","fd_name":"景顺长城中证500低波动","portion":0.1624,"money":2049.81,"last_portion":0,"volume":0,"percent":"16.24%","last_percent":"0.0%"},{"trading_id":"2d78a0db88ff4c2fabf9e9a9bc31d3e5","action":"022","fd_code":"001594","fd_name":"天弘中证银行指数A","portion":0.1737,"money":2192.44,"last_portion":0,"volume":0,"percent":"17.37%","last_percent":"0.0%"},{"trading_id":"2d78a0db88ff4c2fabf9e9a9bc31d3e5","action":"022","fd_code":"530015","fd_name":"建信深证基本面60ETF联接A","portion":0.1478,"money":1865.53,"last_portion":0,"volume":0,"percent":"14.78%","last_percent":"0.0%"},{"trading_id":"2d78a0db88ff4c2fabf9e9a9bc31d3e5","action":"022","fd_code":"006327","fd_name":"易方达中概互联50ETF联接人民币A","portion":0.1459,"money":1841.55,"last_portion":0,"volume":0,"percent":"14.59%","last_percent":"0.0%"},{"trading_id":"2d78a0db88ff4c2fabf9e9a9bc31d3e5","action":"024","fd_code":"501029","fd_name":"华宝红利基金","portion":1,"money":0,"last_portion":0,"volume":171583.92,"percent":"100.0%","last_percent":"0.0%"}],"un_published":false,"un_send":false,"pre_send":true,"un_pre_send":false,"from_admin":true,"published":true}]
         * current_page : 1
         * size : 20
         * total_items : 20
         * total_pages : 1
         */

        private int current_page;
        private int size;
        private int total_items;
        private int total_pages;
        private List<ItemsBean> items;

        public int getCurrent_page() {
            return current_page;
        }

        public void setCurrent_page(int current_page) {
            this.current_page = current_page;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getTotal_items() {
            return total_items;
        }

        public void setTotal_items(int total_items) {
            this.total_items = total_items;
        }

        public int getTotal_pages() {
            return total_pages;
        }

        public void setTotal_pages(int total_pages) {
            this.total_pages = total_pages;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public static class ItemsBean {
            /**
             * trading_id : fc0cbd2b442042728eec6f4d1633bc29
             * plan_code : CSI666
             * trade_date : 1589817600000
             * buy_amount : 11325
             * remark : 执行本周定投计划。另外，易方达中概互联，每日限购500元。组合里把500额度用上，后续会跟随基金公司额度调整。
             * created_at : 1589864030608
             * updated_at : 1589864708616
             * source : 0
             * status : 1
             * pre_send_status : 1
             * send_status : 1
             * sale_type : 0
             * trading_elements : [{"trading_id":"fc0cbd2b442042728eec6f4d1633bc29","action":"022","fd_code":"164906","fd_name":"交银中证海外中国互联网指数","portion":0.1031,"money":1166,"last_portion":0,"volume":0,"percent":"10.31%","last_percent":"0.0%"},{"trading_id":"fc0cbd2b442042728eec6f4d1633bc29","action":"022","fd_code":"006327","fd_name":"易方达中概互联50ETF联接人民币A","portion":0.0441,"money":500,"last_portion":0,"volume":0,"percent":"4.41%","last_percent":"0.0%"},{"trading_id":"fc0cbd2b442042728eec6f4d1633bc29","action":"022","fd_code":"008975","fd_name":"富国中证消费50ETF联接A","portion":0.1471,"money":1666,"last_portion":0,"volume":0,"percent":"14.71%","last_percent":"0.0%"},{"trading_id":"fc0cbd2b442042728eec6f4d1633bc29","action":"022","fd_code":"519671","fd_name":"银河沪深300价值指数","portion":0.1832,"money":2075,"last_portion":0,"volume":0,"percent":"18.32%","last_percent":"0.0%"},{"trading_id":"fc0cbd2b442042728eec6f4d1633bc29","action":"022","fd_code":"001594","fd_name":"天弘中证银行指数A","portion":0.1696,"money":1921,"last_portion":0,"volume":0,"percent":"16.96%","last_percent":"0.0%"},{"trading_id":"fc0cbd2b442042728eec6f4d1633bc29","action":"022","fd_code":"090010","fd_name":"大成中证红利指数A","portion":0.1697,"money":1922,"last_portion":0,"volume":0,"percent":"16.97%","last_percent":"0.0%"},{"trading_id":"fc0cbd2b442042728eec6f4d1633bc29","action":"022","fd_code":"110003","fd_name":"易方达上证50指数A","portion":0.1832,"money":2075,"last_portion":0,"volume":0,"percent":"18.32%","last_percent":"0.0%"}]
             * un_published : false
             * un_send : false
             * pre_send : true
             * un_pre_send : false
             * from_admin : true
             * published : true
             */

            private String trading_id;
            private String plan_code;
            private long trade_date;
            private int buy_amount;
            private String remark;
            private long created_at;
            private long updated_at;
            private int source;
            private int status;
            private int pre_send_status;
            private int send_status;
            private int sale_type;
            private boolean un_published;
            private boolean un_send;
            private boolean pre_send;
            private boolean un_pre_send;
            private boolean from_admin;
            private boolean published;
            private List<TradingElementsBean> trading_elements;

            public String getTrading_id() {
                return trading_id;
            }

            public void setTrading_id(String trading_id) {
                this.trading_id = trading_id;
            }

            public String getPlan_code() {
                return plan_code;
            }

            public void setPlan_code(String plan_code) {
                this.plan_code = plan_code;
            }

            public long getTrade_date() {
                return trade_date;
            }

            public void setTrade_date(long trade_date) {
                this.trade_date = trade_date;
            }

            public int getBuy_amount() {
                return buy_amount;
            }

            public void setBuy_amount(int buy_amount) {
                this.buy_amount = buy_amount;
            }

            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public long getCreated_at() {
                return created_at;
            }

            public void setCreated_at(long created_at) {
                this.created_at = created_at;
            }

            public long getUpdated_at() {
                return updated_at;
            }

            public void setUpdated_at(long updated_at) {
                this.updated_at = updated_at;
            }

            public int getSource() {
                return source;
            }

            public void setSource(int source) {
                this.source = source;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public int getPre_send_status() {
                return pre_send_status;
            }

            public void setPre_send_status(int pre_send_status) {
                this.pre_send_status = pre_send_status;
            }

            public int getSend_status() {
                return send_status;
            }

            public void setSend_status(int send_status) {
                this.send_status = send_status;
            }

            public int getSale_type() {
                return sale_type;
            }

            public void setSale_type(int sale_type) {
                this.sale_type = sale_type;
            }

            public boolean isUn_published() {
                return un_published;
            }

            public void setUn_published(boolean un_published) {
                this.un_published = un_published;
            }

            public boolean isUn_send() {
                return un_send;
            }

            public void setUn_send(boolean un_send) {
                this.un_send = un_send;
            }

            public boolean isPre_send() {
                return pre_send;
            }

            public void setPre_send(boolean pre_send) {
                this.pre_send = pre_send;
            }

            public boolean isUn_pre_send() {
                return un_pre_send;
            }

            public void setUn_pre_send(boolean un_pre_send) {
                this.un_pre_send = un_pre_send;
            }

            public boolean isFrom_admin() {
                return from_admin;
            }

            public void setFrom_admin(boolean from_admin) {
                this.from_admin = from_admin;
            }

            public boolean isPublished() {
                return published;
            }

            public void setPublished(boolean published) {
                this.published = published;
            }

            public List<TradingElementsBean> getTrading_elements() {
                return trading_elements;
            }

            public void setTrading_elements(List<TradingElementsBean> trading_elements) {
                this.trading_elements = trading_elements;
            }

            public static class TradingElementsBean {
                /**
                 * trading_id : fc0cbd2b442042728eec6f4d1633bc29
                 * action : 022
                 * fd_code : 164906
                 * fd_name : 交银中证海外中国互联网指数
                 * portion : 0.1031
                 * money : 1166
                 * last_portion : 0
                 * volume : 0
                 * percent : 10.31%
                 * last_percent : 0.0%
                 */

                private String trading_id;
                private String action;
                private String fd_code;
                private String fd_name;
                private double portion;
                private int money;
                private int last_portion;
                private int volume;
                private String percent;
                private String last_percent;

                public String getTrading_id() {
                    return trading_id;
                }

                public void setTrading_id(String trading_id) {
                    this.trading_id = trading_id;
                }

                public String getAction() {
                    return action;
                }

                public void setAction(String action) {
                    this.action = action;
                }

                public String getFd_code() {
                    return fd_code;
                }

                public void setFd_code(String fd_code) {
                    this.fd_code = fd_code;
                }

                public String getFd_name() {
                    return fd_name;
                }

                public void setFd_name(String fd_name) {
                    this.fd_name = fd_name;
                }

                public double getPortion() {
                    return portion;
                }

                public void setPortion(double portion) {
                    this.portion = portion;
                }

                public String getMoney() {
                    return money + "";
                }

                public void setMoney(int money) {
                    this.money = money;
                }

                public int getLast_portion() {
                    return last_portion;
                }

                public void setLast_portion(int last_portion) {
                    this.last_portion = last_portion;
                }

                public int getVolume() {
                    return volume;
                }

                public void setVolume(int volume) {
                    this.volume = volume;
                }

                public String getPercent() {
                    return percent;
                }

                public void setPercent(String percent) {
                    this.percent = percent;
                }

                public String getLast_percent() {
                    return last_percent;
                }

                public void setLast_percent(String last_percent) {
                    this.last_percent = last_percent;
                }
            }
        }
    }
}
