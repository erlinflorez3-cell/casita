package com.incode.welcome_sdk.ui.global_watchlist;

import com.incode.welcome_sdk.results.GlobalWatchlistResult;
import com.incode.welcome_sdk.ui.BasePresenter;
import com.incode.welcome_sdk.ui.BaseView;

/* JADX INFO: loaded from: classes5.dex */
public interface GlobalWatchlistContract {

    public interface Presenter extends BasePresenter {
        void publishResult(GlobalWatchlistResult globalWatchlistResult);

        void submitWatchlist(GlobalWatchlistModel globalWatchlistModel);
    }

    public interface View extends BaseView {
        void hideForm();

        void hideProcessing();

        void hideResult();

        void showProcessing();

        void showResult(boolean z2);
    }
}
