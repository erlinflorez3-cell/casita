package cz.msebera.android.httpclient.extras;

/* JADX INFO: loaded from: classes5.dex */
public class HttpClientAndroidLog {
    private String logTag;
    private boolean debugEnabled = false;
    private boolean errorEnabled = false;
    private boolean traceEnabled = false;
    private boolean warnEnabled = false;
    private boolean infoEnabled = false;

    public HttpClientAndroidLog(Object obj) {
        this.logTag = obj.toString();
    }

    public void debug(Object obj) {
        if (isDebugEnabled()) {
            String str = this.logTag;
            obj.toString();
        }
    }

    public void debug(Object obj, Throwable th) {
        if (isDebugEnabled()) {
            String str = this.logTag;
            obj.toString();
        }
    }

    public void enableDebug(boolean z2) {
        this.debugEnabled = z2;
    }

    public void enableError(boolean z2) {
        this.errorEnabled = z2;
    }

    public void enableInfo(boolean z2) {
        this.infoEnabled = z2;
    }

    public void enableTrace(boolean z2) {
        this.traceEnabled = z2;
    }

    public void enableWarn(boolean z2) {
        this.warnEnabled = z2;
    }

    public void error(Object obj) {
        if (isErrorEnabled()) {
            String str = this.logTag;
            obj.toString();
        }
    }

    public void error(Object obj, Throwable th) {
        if (isErrorEnabled()) {
            String str = this.logTag;
            obj.toString();
        }
    }

    public void info(Object obj) {
        if (isInfoEnabled()) {
            String str = this.logTag;
            obj.toString();
        }
    }

    public void info(Object obj, Throwable th) {
        if (isInfoEnabled()) {
            String str = this.logTag;
            obj.toString();
        }
    }

    public boolean isDebugEnabled() {
        return this.debugEnabled;
    }

    public boolean isErrorEnabled() {
        return this.errorEnabled;
    }

    public boolean isInfoEnabled() {
        return this.infoEnabled;
    }

    public boolean isTraceEnabled() {
        return this.traceEnabled;
    }

    public boolean isWarnEnabled() {
        return this.warnEnabled;
    }

    public void trace(Object obj) {
        if (isTraceEnabled()) {
            String str = this.logTag;
            obj.toString();
        }
    }

    public void trace(Object obj, Throwable th) {
        if (isTraceEnabled()) {
            String str = this.logTag;
            obj.toString();
        }
    }

    public void warn(Object obj) {
        if (isWarnEnabled()) {
            String str = this.logTag;
            obj.toString();
        }
    }

    public void warn(Object obj, Throwable th) {
        if (isWarnEnabled()) {
            String str = this.logTag;
            obj.toString();
        }
    }
}
