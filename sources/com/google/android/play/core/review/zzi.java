package com.google.android.play.core.review;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.review.internal.zzt;
import com.google.android.play.core.review.internal.zzw;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.EO;
import yg.Ig;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes9.dex */
public final class zzi {
    private static final com.google.android.play.core.review.internal.zzi zzb = new com.google.android.play.core.review.internal.zzi("ReviewService");
    zzt zza;
    private final String zzc;

    /* JADX WARN: Type inference failed for: r9v1, types: [com.google.android.play.core.review.zze] */
    public zzi(Context context) throws Throwable {
        Class<?> cls = Class.forName(ZO.xd("x\u007f\u0003$b_e\ngCx/@\u000eH)\u001dC'&oHL", (short) (ZN.Xd() ^ 18004), (short) (ZN.Xd() ^ 31186)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1499aX.Xd() ^ (-26107));
        short sXd2 = (short) (C1499aX.Xd() ^ (-1899));
        int[] iArr = new int["\n}EC[f\u0014\u0015{/=sU\u0011".length()];
        QB qb = new QB("\n}EC[f\u0014\u0015{/=sU\u0011");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            this.zzc = (String) method.invoke(context, objArr);
            if (zzw.zza(context)) {
                Intent intent = new Intent(Ig.wd("\u0016\\\tevQ)a\u0017\u0005O`\u001e\u001a8 @Y[g+lCS&RI\u001bu^Q$|l$}ZA_=FP\u0002*s{&\u000e$2\u001cY", (short) (C1580rY.Xd() ^ (-6280)))).setPackage(EO.Od("eI\u000b*(\n\u0012:yF9f}pW6\u0010\u00058", (short) (C1580rY.Xd() ^ (-15234))));
                this.zza = new zzt(context, zzb, C1561oA.Qd("hsp0honeia)[g\\ie^X!XZ^bYf\u001aTXJXWXJZLGXSDPSE>?\u0007!E\u0017ED%7G94E 1=@2+,", (short) (C1580rY.Xd() ^ (-1197))), intent, new Object() { // from class: com.google.android.play.core.review.zze
                }, null);
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final Task zza() {
        String str = this.zzc;
        com.google.android.play.core.review.internal.zzi zziVar = zzb;
        zziVar.zzc("requestInAppReview (%s)", str);
        if (this.zza == null) {
            zziVar.zza("Play Store app is either not installed or not the official version", new Object[0]);
            return Tasks.forException(new ReviewException(-1));
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zza.zzs(new zzf(this, taskCompletionSource, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
