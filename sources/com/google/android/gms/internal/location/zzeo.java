package com.google.android.gms.internal.location;

import androidx.compose.material3.internal.CalendarModelKt;
import com.braze.Constants;
import com.dynatrace.android.agent.Global;
import com.statsig.androidsdk.StatsigLoggerKt;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public final class zzeo {
    private static final SimpleDateFormat zza = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.ROOT);
    private static final SimpleDateFormat zzb = new SimpleDateFormat("MM-dd HH:mm:ss", Locale.ROOT);
    private static final StringBuilder zzc = new StringBuilder(33);

    public static String zza(long j2) {
        return j2 >= 0 ? zza.format(new Date(j2)) : Long.toString(j2);
    }

    public static String zzb(long j2) {
        String string;
        StringBuilder sb = zzc;
        synchronized (sb) {
            sb.setLength(0);
            zzc(j2, sb);
            string = sb.toString();
        }
        return string;
    }

    public static StringBuilder zzc(long j2, StringBuilder sb) {
        if (j2 == 0) {
            sb.append("0s");
            return sb;
        }
        sb.ensureCapacity(sb.length() + 27);
        boolean z2 = false;
        if (j2 < 0) {
            sb.append(Global.HYPHEN);
            if (j2 != Long.MIN_VALUE) {
                j2 = -j2;
            } else {
                j2 = Long.MAX_VALUE;
                z2 = true;
            }
        }
        if (j2 >= CalendarModelKt.MillisecondsIn24Hours) {
            sb.append(j2 / CalendarModelKt.MillisecondsIn24Hours);
            sb.append("d");
            j2 %= CalendarModelKt.MillisecondsIn24Hours;
        }
        if (true == z2) {
            j2 = 25975808;
        }
        if (j2 >= 3600000) {
            sb.append(j2 / 3600000);
            sb.append("h");
            j2 %= 3600000;
        }
        if (j2 >= StatsigLoggerKt.FLUSH_TIMER_MS) {
            sb.append(j2 / StatsigLoggerKt.FLUSH_TIMER_MS);
            sb.append("m");
            j2 %= StatsigLoggerKt.FLUSH_TIMER_MS;
        }
        if (j2 >= 1000) {
            sb.append(j2 / 1000);
            sb.append(Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY);
            j2 %= 1000;
        }
        if (j2 > 0) {
            sb.append(j2);
            sb.append("ms");
        }
        return sb;
    }
}
