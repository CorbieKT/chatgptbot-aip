package com.chatgptbot.api;

import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;

public class ApiTest {

    @Test
    public void query_unanswered_questions() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        HttpGet get = new HttpGet("https://api.zsxq.com/v2/groups/88885411284222/topics?scope=unanswered_questions&count=20");
//        HttpGet get = new HttpGet("https://www.acfun.cn/rest/pc-direct/comment/list?sourceId=3654050&sourceType=4&page=1&limit=20&pivotCommentId=0&newPivotCommentId=&t=1693555433625&supportZtEmot=true");
//        get.addHeader("Cookie","csrfToken=vNcVziFa1PYoOQQ-ssbh9VoW; _did=web_780532081BDED8C9; webp_supported=%7B%22lossy%22%3Atrue%2C%22lossless%22%3Atrue%2C%22alpha%22%3Atrue%2C%22animation%22%3Atrue%7D; _did=web_780532081BDED8C9; Hm_lvt_2af69bc2b378fb58ae04ed2a04257ed1=1693555142; lsv_js_player_v2_main=e4d400; stochastic=YnFibzRpaHdwbTg%3D; acPasstoken=ChVpbmZyYS5hY2Z1bi5wYXNzdG9rZW4ScHo_AmrTVx0vQckMGyqaCTiSZhoOiIM_Jr8po8gJPBti4YdUgNtq878a2bXBSWjSJn-1LpvCeIaYc4OZE-DdjnO83O2LpsoHo_TesONsyYdw9Lc8PqNp01FJb2hcrFcZ8s2P-YA6WfTehOBiLuAVwDIaEpKwM4kzPw4j0kKfbi78eidLwiIghAC5RxE1tYsXyAWq4stfM1wnXWOEbqu8lfdl-wfxM5ooBTAB; auth_key=1582839; ac_username=%E4%B8%8D%E5%90%89%E6%B3%A2%E6%99%AE%E5%BC%80%E5%90%89%E6%99%AE; acPostHint=3e6c9555d237fb7e90cc6e631e199772d977; ac_userimg=https%3A%2F%2Fimgs.aixifan.com%2FnewUpload%2F1582839_4833dcfd6acf49958c93fa05a50c5d28.png; Hm_lpvt_2af69bc2b378fb58ae04ed2a04257ed1=1693555150; cur_req_id=479130046BA805F8_self_927259131cb3c24238219838df7e5a39; cur_group_id=479130046BA805F8_self_927259131cb3c24238219838df7e5a39_0");
//        get.addHeader("Content-Type:\n","application/json;charset=UTF-8");

        get.addHeader("Cookei","zsxqsessionid=d70ab4d620ddf217ac330982fce995be; abtest_env=product; sensorsdata2015jssdkcross=%7B%22distinct_id%22%3A%22585222881412254%22%2C%22first_id%22%3A%2218a45ef5e33de4-0606f3fd78bb1a-26031f51-2073600-18a45ef5e346a8%22%2C%22props%22%3A%7B%7D%2C%22identities%22%3A%22eyIkaWRlbnRpdHlfY29va2llX2lkIjoiMThhNDVlZjVlMzNkZTQtMDYwNmYzZmQ3OGJiMWEtMjYwMzFmNTEtMjA3MzYwMC0xOGE0NWVmNWUzNDZhOCIsIiRpZGVudGl0eV9sb2dpbl9pZCI6IjU4NTIyMjg4MTQxMjI1NCJ9%22%2C%22history_login_id%22%3A%7B%22name%22%3A%22%24identity_login_id%22%2C%22value%22%3A%22585222881412254%22%7D%2C%22%24device_id%22%3A%2218a45ef5e33de4-0606f3fd78bb1a-26031f51-2073600-18a45ef5e346a8%22%7D; zsxq_access_token=033AD627-6FB5-C4BC-0F16-82E42B2B8028_C57B0753667721F9");

        get.addHeader("Content-Type","application/json;charset=UTF-8");

//        get.addHeader("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.0.0 Safari/537.36");
//
//        get.addHeader("Accept","application/json, text/plain, */*");
//
//        get.addHeader("X-Timestamp","1693554402");

        CloseableHttpResponse response = httpClient.execute(get);

        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        } else {
            System.out.println(response.getStatusLine().getStatusCode());
        }
    }

    @Test
    public void answer () throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        HttpPost post = new HttpPost("https://api.zsxq.com/v2/topics/211842454212481/answer");

        post.addHeader("Cookei","zsxqsessionid=d70ab4d620ddf217ac330982fce995be; abtest_env=product; sensorsdata2015jssdkcross=%7B%22distinct_id%22%3A%22585222881412254%22%2C%22first_id%22%3A%2218a45ef5e33de4-0606f3fd78bb1a-26031f51-2073600-18a45ef5e346a8%22%2C%22props%22%3A%7B%7D%2C%22identities%22%3A%22eyIkaWRlbnRpdHlfY29va2llX2lkIjoiMThhNDVlZjVlMzNkZTQtMDYwNmYzZmQ3OGJiMWEtMjYwMzFmNTEtMjA3MzYwMC0xOGE0NWVmNWUzNDZhOCIsIiRpZGVudGl0eV9sb2dpbl9pZCI6IjU4NTIyMjg4MTQxMjI1NCJ9%22%2C%22history_login_id%22%3A%7B%22name%22%3A%22%24identity_login_id%22%2C%22value%22%3A%22585222881412254%22%7D%2C%22%24device_id%22%3A%2218a45ef5e33de4-0606f3fd78bb1a-26031f51-2073600-18a45ef5e346a8%22%7D; zsxq_access_token=033AD627-6FB5-C4BC-0F16-82E42B2B8028_C57B0753667721F9");

        post.addHeader("Content-Type","application/json;charset=UTF-8");

        String paramJson = "{\"req_data\":{\"text\":\"123\\n\",\"image_ids\":[]}}";

        StringEntity stringEntity = new StringEntity(paramJson, ContentType.create("text/json","UTF-8"));

        post.setEntity(stringEntity);

        CloseableHttpResponse response = httpClient.execute(post);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        } else {
            System.out.println(response.getStatusLine().getStatusCode());
        }



    }
}
