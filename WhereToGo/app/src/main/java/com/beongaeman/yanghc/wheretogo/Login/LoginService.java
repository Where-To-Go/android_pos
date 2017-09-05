package com.beongaeman.yanghc.wheretogo.Login;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;


/**
 * Created by 조연희 on 2017-09-05.
 */

public interface LoginService {
    @POST("/wheretogo/api/{version}/pos/signin")
    Call<Login> repoLogin(
            @Path("version") int version,
            @Body Login login
    );

    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://13.59.184.129:8080")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
