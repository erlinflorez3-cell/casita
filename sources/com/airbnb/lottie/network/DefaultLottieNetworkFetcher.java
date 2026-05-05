package com.airbnb.lottie.network;

import com.dynatrace.android.callback.Callback;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes.dex */
public class DefaultLottieNetworkFetcher implements LottieNetworkFetcher {
    @Override // com.airbnb.lottie.network.LottieNetworkFetcher
    public LottieFetchResult fetchSync(String str) throws Exception {
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        Callback.openConnection(uRLConnectionOpenConnection);
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setRequestMethod("GET");
        Callback.connect(httpURLConnection);
        return new DefaultLottieFetchResult(httpURLConnection);
    }
}
