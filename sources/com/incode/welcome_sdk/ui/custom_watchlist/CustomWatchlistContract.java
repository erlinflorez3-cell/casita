package com.incode.welcome_sdk.ui.custom_watchlist;

import com.incode.welcome_sdk.results.CustomWatchlistResult;
import com.incode.welcome_sdk.ui.BasePresenter;
import com.incode.welcome_sdk.ui.BaseView;

/* JADX INFO: loaded from: classes5.dex */
public interface CustomWatchlistContract {

    public interface Presenter extends BasePresenter {
        void processCustomWatchlist();

        void publishResult(CustomWatchlistResult customWatchlistResult);
    }

    public interface View extends BaseView {
        void onCustomWatchlistProcessed(CustomWatchlistResult customWatchlistResult);
    }
}
