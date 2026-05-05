package cz.msebera.android.httpclient.protocol;

import cz.msebera.android.httpclient.HttpResponseInterceptor;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public interface HttpResponseInterceptorList {
    void addResponseInterceptor(HttpResponseInterceptor httpResponseInterceptor);

    void addResponseInterceptor(HttpResponseInterceptor httpResponseInterceptor, int i2);

    void clearResponseInterceptors();

    HttpResponseInterceptor getResponseInterceptor(int i2);

    int getResponseInterceptorCount();

    void removeResponseInterceptorByClass(Class<? extends HttpResponseInterceptor> cls);

    void setInterceptors(List<?> list);
}
