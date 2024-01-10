package cn.bugstack.chatbot.api.test;

import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;

public class ApiTest {

    @Test
    public void query_unanswered_questions() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        HttpGet get = new HttpGet("https://api.bilibili.com/x/v2/reply/wbi/main?oid=368537015&type=1&mode=3&pagination_str=%7B%22offset%22:%22%7B%5C%22type%5C%22:1,%5C%22direction%5C%22:1,%5C%22session_id%5C%22:%5C%221745814126026414%5C%22,%5C%22data%5C%22:%7B%7D%7D%22%7D&plat=1&web_location=1315875&w_rid=115fc03d56dae93bbd502348802bc6c2&wts=1704896689");

        get.addHeader("cookie","buvid3=90AA94DE-3102-4564-8F9B-FE44016AAA63148829infoc; i-wanna-go-back=-1; LIVE_BUVID=AUTO8616414744430301; buvid4=B4808D27-D235-3B53-DD84-239DD2627EAD36118-022012619-SrFCYInyf3CErpgvgHiKnQ%3D%3D; CURRENT_BLACKGAP=0; is-2022-channel=1; buvid_fp_plain=undefined; b_timer=%7B%22ffp%22%3A%7B%22333.337.fp.risk_90AA94DE%22%3A%221829B11B762%22%2C%22333.788.fp.risk_90AA94DE%22%3A%22182CACDE223%22%2C%22333.1007.fp.risk_90AA94DE%22%3A%22182CFD934D4%22%2C%22888.70774.fp.risk_90AA94DE%22%3A%221825A1CD966%22%2C%22666.25.fp.risk_90AA94DE%22%3A%221828D213374%22%2C%22666.9.fp.risk_90AA94DE%22%3A%2218295736334%22%2C%22666.22.fp.risk_90AA94DE%22%3A%22182957C3A76%22%2C%22333.967.fp.risk_90AA94DE%22%3A%22182957BC10E%22%2C%22444.8.fp.risk_90AA94DE%22%3A%22182957BCE9F%22%2C%22333.42.fp.risk_90AA94DE%22%3A%22182CACDECBE%22%7D%7D; DedeUserID=3796073; DedeUserID__ckMd5=c2155048fd3b6d68; share_source_origin=WEIXIN; bsource_origin=baidu_aladdin; home_feed_column=5; theme_style=light; CURRENT_PID=324bef20-cef5-11ed-8234-614a043d3ff3; FEED_LIVE_VERSION=V8; nostalgia_conf=-1; hit-new-style-dyn=1; b_nut=100; enable_web_push=DISABLE; header_theme_version=CLOSE; _uuid=E43810EFF-546C-BEB1-FD54-DEEF4352C75108209infoc; fingerprint=a305a479cbeda7f5d65e82893dac0f50; rpdid=|(JY)Jkul)RY0J'u~|Jl||mYm; bsource=search_baidu; CURRENT_FNVAL=4048; hit-dyn-v2=1; SESSDATA=703c812c%2C1720272266%2C3d109%2A12CjCytw7KF44cVKKfDtlJ66LI8IoU2MEavrmOGXSwqq_a-azfM5LiDhBG_Qu_ScnnhWMSVk9SN3ZzRTNjWjdndXpaR3U5VENacFhDRHpqMTY4X0VPUEw3LUlYLWxaZ1JvR0JoWGZpcWhQa1FfZ0RPZmE3d21BVHY0UklQQWtzVDlLV0ptaVo0d09nIIEC; bili_jct=8700682f1488ebbdedac38f657456de2; sid=6yrklpo9; bili_ticket=eyJhbGciOiJIUzI1NiIsImtpZCI6InMwMyIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDQ5Nzk1MzksImlhdCI6MTcwNDcyMDI3OSwicGx0IjotMX0.tubodF_DrWj3yfk9b1Stmco3V_peWeBUFpECqrKLDPA; bili_ticket_expires=1704979479; bp_video_offset_3796073=884649686866067473; CURRENT_QUALITY=80; PVID=6; b_lsid=C1F3F328_18CF378F225; browser_resolution=1920-612; buvid_fp=90AA94DE-3102-4564-8F9B-FE44016AAA63148829infoc");
        get.addHeader("Content-Type","application/json; charset=utf-8");

        CloseableHttpResponse response = httpClient.execute(get);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        } else {
            System.out.println(response.getStatusLine().getStatusCode());
        }
    }

    @Test
    public void answer(){
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        HttpPost post = new HttpPost("http");

    }
}
