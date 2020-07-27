/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thinhtpt.controller;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import thinhtpt.data.ResultJSON;

/**
 *
 * @author ThinhTPT
 */
public class HandleAPI {

    public static ResultJSON getJsonData(String city) {
        OkHttpClient client = new OkHttpClient();
        Gson gson = new Gson();
        ResultJSON data = null;
        // Tạo một request đến API 
        Request res = new Request.Builder().url("http://api.openweathermap.org/data/2.5/forecast?q=" + city + "&APPID=bffca17bcb552b8c8e4f3b82f64cccd2&units=metric").build();
        try {
            // Gửi Request đến API và nhận về Response  
            Response response = client.newCall(res).execute();
            //Một Response sẽ có Header và Body, ở đây mình chỉ lấy Body
            ResponseBody body = response.body();
            // Chuyển đổi Body - thực chất là chuỗi Json thành Object
            data = gson.fromJson(body.string(), ResultJSON.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}
