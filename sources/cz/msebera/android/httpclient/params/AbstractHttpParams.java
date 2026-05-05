package cz.msebera.android.httpclient.params;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public abstract class AbstractHttpParams implements HttpParams, HttpParamsNames {
    protected AbstractHttpParams() {
    }

    @Override // cz.msebera.android.httpclient.params.HttpParams
    public boolean getBooleanParameter(String str, boolean z2) {
        Object parameter = getParameter(str);
        return parameter == null ? z2 : ((Boolean) parameter).booleanValue();
    }

    @Override // cz.msebera.android.httpclient.params.HttpParams
    public double getDoubleParameter(String str, double d2) {
        Object parameter = getParameter(str);
        return parameter == null ? d2 : ((Double) parameter).doubleValue();
    }

    @Override // cz.msebera.android.httpclient.params.HttpParams
    public int getIntParameter(String str, int i2) {
        Object parameter = getParameter(str);
        return parameter == null ? i2 : ((Integer) parameter).intValue();
    }

    @Override // cz.msebera.android.httpclient.params.HttpParams
    public long getLongParameter(String str, long j2) {
        Object parameter = getParameter(str);
        return parameter == null ? j2 : ((Long) parameter).longValue();
    }

    @Override // cz.msebera.android.httpclient.params.HttpParamsNames
    public Set<String> getNames() {
        throw new UnsupportedOperationException();
    }

    @Override // cz.msebera.android.httpclient.params.HttpParams
    public boolean isParameterFalse(String str) {
        return !getBooleanParameter(str, false);
    }

    @Override // cz.msebera.android.httpclient.params.HttpParams
    public boolean isParameterTrue(String str) {
        return getBooleanParameter(str, false);
    }

    @Override // cz.msebera.android.httpclient.params.HttpParams
    public HttpParams setBooleanParameter(String str, boolean z2) {
        setParameter(str, z2 ? Boolean.TRUE : Boolean.FALSE);
        return this;
    }

    @Override // cz.msebera.android.httpclient.params.HttpParams
    public HttpParams setDoubleParameter(String str, double d2) {
        setParameter(str, Double.valueOf(d2));
        return this;
    }

    @Override // cz.msebera.android.httpclient.params.HttpParams
    public HttpParams setIntParameter(String str, int i2) {
        setParameter(str, Integer.valueOf(i2));
        return this;
    }

    @Override // cz.msebera.android.httpclient.params.HttpParams
    public HttpParams setLongParameter(String str, long j2) {
        setParameter(str, Long.valueOf(j2));
        return this;
    }
}
