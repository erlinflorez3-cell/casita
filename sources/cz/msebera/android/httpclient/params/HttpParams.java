package cz.msebera.android.httpclient.params;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public interface HttpParams {
    HttpParams copy();

    boolean getBooleanParameter(String str, boolean z2);

    double getDoubleParameter(String str, double d2);

    int getIntParameter(String str, int i2);

    long getLongParameter(String str, long j2);

    Object getParameter(String str);

    boolean isParameterFalse(String str);

    boolean isParameterTrue(String str);

    boolean removeParameter(String str);

    HttpParams setBooleanParameter(String str, boolean z2);

    HttpParams setDoubleParameter(String str, double d2);

    HttpParams setIntParameter(String str, int i2);

    HttpParams setLongParameter(String str, long j2);

    HttpParams setParameter(String str, Object obj);
}
