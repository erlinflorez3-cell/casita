package com.biocatch.client.android.sdk.contract.http;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public interface ICustomHttpClient {
    IHttpResponse request(IHttpRequest iHttpRequest) throws IOException;
}
