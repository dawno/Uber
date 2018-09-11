package com.example.dellpc.uber.Common;

import com.example.dellpc.uber.Remote.IGoogleAPI;
import com.example.dellpc.uber.Remote.RetrofitClient;

import retrofit2.Retrofit;

import static com.example.dellpc.uber.Remote.RetrofitClient.retrofit;

public class Common {
    public static final String baseUrl = "https://maps.googleapis.com";
    public static IGoogleAPI getGoogleAPI(){
        return RetrofitClient.getClient(baseUrl).create(IGoogleAPI.class);
    }
}
