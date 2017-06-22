package com.nice.wlg.nicereo.api;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Administrator on 2017/6/22.
 */

public interface InfoService {

    @GET("profile/{user}")
    Call<ResponseBody> getInitText(@Path("user") String user);
}
