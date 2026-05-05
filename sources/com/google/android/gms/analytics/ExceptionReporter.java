package com.google.android.gms.analytics;

import android.content.Context;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.internal.gtm.zzfc;
import java.lang.Thread;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes8.dex */
public class ExceptionReporter implements Thread.UncaughtExceptionHandler {
    private final Thread.UncaughtExceptionHandler zza;
    private final Tracker zzb;
    private final Context zzc;
    private ExceptionParser zzd;
    private GoogleAnalytics zze;

    public ExceptionReporter(Tracker tracker, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Context context) throws Throwable {
        if (tracker == null) {
            short sXd = (short) (C1633zX.Xd() ^ (-23932));
            int[] iArr = new int["21!$-(6d)(679?k/\u0013N\u001e&\u001e\u001f".length()];
            QB qb = new QB("21!$-(6d)(679?k/\u0013N\u001e&\u001e\u001f");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                i2++;
            }
            throw new NullPointerException(new String(iArr, 0, i2));
        }
        if (context == null) {
            throw new NullPointerException(C1561oA.Xd("6CCJ<PMy>=KLNT\u0001DH\u0004S[ST", (short) (C1607wl.Xd() ^ 8631)));
        }
        this.zza = uncaughtExceptionHandler;
        this.zzb = tracker;
        this.zzd = new StandardExceptionParser(context, new ArrayList());
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1593ug.zd("SaXge`\\']jjqcmt/Erryk\u007f|", (short) (C1633zX.Xd() ^ (-13707)), (short) (C1633zX.Xd() ^ (-1535)))).getMethod(C1561oA.od("fcq=kjeaZWi]b`4_]bRd_", (short) (C1499aX.Xd() ^ (-5833))), new Class[0]);
        try {
            method.setAccessible(true);
            this.zzc = (Context) method.invoke(context, objArr);
            zzfc.zzd(Wg.Zd("p3T<tn\n\u00064\u001e'_D}e\u0006\t<-2K=\u007fV\f`:@)OCk^f\u0018A9\u0018[?l{nK\u000b;U", (short) (Od.Xd() ^ (-27131)), (short) (Od.Xd() ^ (-10949))).concat(String.valueOf(uncaughtExceptionHandler == null ? C1561oA.Kd("6>67", (short) (C1499aX.Xd() ^ (-4838))) : uncaughtExceptionHandler.getClass().getName())));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public ExceptionParser getExceptionParser() {
        return this.zzd;
    }

    public void setExceptionParser(ExceptionParser exceptionParser) {
        this.zzd = exceptionParser;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) throws Throwable {
        String description;
        if (this.zzd != null) {
            description = this.zzd.getDescription(thread != null ? thread.getName() : null, th);
        } else {
            description = "UncaughtException";
        }
        zzfc.zzd("Reporting uncaught exception: ".concat(String.valueOf(description)));
        Tracker tracker = this.zzb;
        HitBuilders.ExceptionBuilder exceptionBuilder = new HitBuilders.ExceptionBuilder();
        exceptionBuilder.setDescription(description);
        exceptionBuilder.setFatal(true);
        tracker.send(exceptionBuilder.build());
        if (this.zze == null) {
            this.zze = GoogleAnalytics.getInstance(this.zzc);
        }
        GoogleAnalytics googleAnalytics = this.zze;
        googleAnalytics.dispatchLocalHits();
        googleAnalytics.zzb().zzf().zzn();
        if (this.zza != null) {
            zzfc.zzd("Passing exception to the original handler");
            this.zza.uncaughtException(thread, th);
        }
    }

    final Thread.UncaughtExceptionHandler zza() {
        return this.zza;
    }
}
