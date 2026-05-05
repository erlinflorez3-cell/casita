package cz.msebera.android.httpclient.concurrent;

/* JADX INFO: loaded from: classes5.dex */
public interface FutureCallback<T> {
    void cancelled();

    void completed(T t2);

    void failed(Exception exc);
}
