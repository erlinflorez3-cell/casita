package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.SentryLevel;

/* JADX INFO: loaded from: classes6.dex */
public final class AndroidLogger implements ILogger {
    private final String tag;

    /* JADX INFO: renamed from: io.sentry.android.core.AndroidLogger$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$sentry$SentryLevel;

        static {
            int[] iArr = new int[SentryLevel.values().length];
            $SwitchMap$io$sentry$SentryLevel = iArr;
            try {
                iArr[SentryLevel.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$sentry$SentryLevel[SentryLevel.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$sentry$SentryLevel[SentryLevel.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$sentry$SentryLevel[SentryLevel.FATAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$sentry$SentryLevel[SentryLevel.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public AndroidLogger() {
        this("Sentry");
    }

    public AndroidLogger(String str) {
        this.tag = str;
    }

    private int toLogcatLevel(SentryLevel sentryLevel) {
        int i2 = AnonymousClass1.$SwitchMap$io$sentry$SentryLevel[sentryLevel.ordinal()];
        if (i2 == 1) {
            return 4;
        }
        if (i2 != 2) {
            return i2 != 4 ? 3 : 7;
        }
        return 5;
    }

    @Override // io.sentry.ILogger
    public boolean isEnabled(SentryLevel sentryLevel) {
        return true;
    }

    @Override // io.sentry.ILogger
    public void log(SentryLevel sentryLevel, String str, Throwable th) {
        int i2 = AnonymousClass1.$SwitchMap$io$sentry$SentryLevel[sentryLevel.ordinal()];
        if (i2 == 1) {
            String str2 = this.tag;
            return;
        }
        if (i2 == 2) {
            String str3 = this.tag;
            return;
        }
        if (i2 == 3) {
            String str4 = this.tag;
        } else if (i2 != 4) {
            String str5 = this.tag;
        } else {
            String str6 = this.tag;
        }
    }

    @Override // io.sentry.ILogger
    public void log(SentryLevel sentryLevel, String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            toLogcatLevel(sentryLevel);
            String str2 = this.tag;
        } else {
            toLogcatLevel(sentryLevel);
            String str3 = this.tag;
            String.format(str, objArr);
        }
    }

    @Override // io.sentry.ILogger
    public void log(SentryLevel sentryLevel, Throwable th, String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            log(sentryLevel, str, th);
        } else {
            log(sentryLevel, String.format(str, objArr), th);
        }
    }
}
