package com.google.android.gms.common.logging;

import android.util.Log;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class Logger {
    private final String zza;
    private final String zzb;
    private final GmsLogger zzc;
    private final int zzd;

    public Logger(String str, String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.zzb = string;
        this.zza = str;
        this.zzc = new GmsLogger(str);
        int i2 = 2;
        while (i2 <= 7 && !Log.isLoggable(this.zza, i2)) {
            i2++;
        }
        this.zzd = i2;
    }

    public void d(String str, Object... objArr) {
        if (isLoggable(3)) {
            String str2 = this.zza;
            format(str, objArr);
        }
    }

    public void e(String str, Throwable th, Object... objArr) {
        String str2 = this.zza;
        format(str, objArr);
    }

    public void e(String str, Object... objArr) {
        String str2 = this.zza;
        format(str, objArr);
    }

    protected String format(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.zzb.concat(str);
    }

    public String getTag() {
        return this.zza;
    }

    public void i(String str, Object... objArr) {
        String str2 = this.zza;
        format(str, objArr);
    }

    public boolean isLoggable(int i2) {
        return this.zzd <= i2;
    }

    public void v(String str, Throwable th, Object... objArr) {
        if (isLoggable(2)) {
            String str2 = this.zza;
            format(str, objArr);
        }
    }

    public void v(String str, Object... objArr) {
        if (isLoggable(2)) {
            String str2 = this.zza;
            format(str, objArr);
        }
    }

    public void w(String str, Object... objArr) {
        String str2 = this.zza;
        format(str, objArr);
    }

    public void wtf(String str, Throwable th, Object... objArr) {
        String str2 = this.zza;
        format(str, objArr);
    }

    public void wtf(Throwable th) {
        String str = this.zza;
    }
}
