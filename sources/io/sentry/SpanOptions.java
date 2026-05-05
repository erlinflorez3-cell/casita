package io.sentry;

/* JADX INFO: loaded from: classes6.dex */
public class SpanOptions {
    private boolean trimStart = false;
    private boolean trimEnd = false;
    private boolean isIdle = false;

    public boolean isIdle() {
        return this.isIdle;
    }

    public boolean isTrimEnd() {
        return this.trimEnd;
    }

    public boolean isTrimStart() {
        return this.trimStart;
    }

    public void setIdle(boolean z2) {
        this.isIdle = z2;
    }

    public void setTrimEnd(boolean z2) {
        this.trimEnd = z2;
    }

    public void setTrimStart(boolean z2) {
        this.trimStart = z2;
    }
}
