/*
 * Copyright (C) 20015 MaiNaEr All rights reserved
 */
package com.harry.mvpdemo.mvp.model;

import android.content.Context;

import com.harry.mvpdemo.mvp.presenter.TopPresenterImpl;

import java.util.List;

import rx.Observable;

/**
 * 类/接口描述
 *
 * @author Harry
 */
public class TopController extends HttpManager {

    public TopController(Context context) {
        super(context);
    }

    public void load(MovieRequest request, TopPresenterImpl presenter) {
        LoadTask task = new LoadTask();
        task.load(request,presenter);
    }

    private class LoadTask extends BaseTask<MovieRequest,List<MovieResponse>> {

        @Override
        public Observable<BaseResponse<List<MovieResponse>>> getObservable() {
            return service.getMovie(input.start);
        }
    }
}