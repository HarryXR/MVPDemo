/*
 * Copyright (C) 20015 MaiNaEr All rights reserved
 */
package com.harry.mvpdemo.api;

import com.harry.mvpdemo.mvp.model.BaseResponse;
import com.harry.mvpdemo.mvp.model.MovieResponse;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * 类/接口描述
 *
 * @author Harry
 */
public interface MovieService {
    @GET("in_theaters")
    Observable<BaseResponse<List<MovieResponse>>> getMovie(@Query("start") int start);

}
