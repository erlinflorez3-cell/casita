package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    static /* synthetic */ void lambda$onReceive$0() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws Throwable {
        String queryParameter = intent.getData().getQueryParameter(Jg.Wd("\u0002_<bv\u00033\u001c\nX\u000b", (short) (C1633zX.Xd() ^ (-4892)), (short) (C1633zX.Xd() ^ (-30911))));
        String queryParameter2 = intent.getData().getQueryParameter(ZO.xd("\u0014_&IKz", (short) (FB.Xd() ^ 11030), (short) (FB.Xd() ^ 18313)));
        Uri data = intent.getData();
        short sXd = (short) (OY.Xd() ^ 14865);
        short sXd2 = (short) (OY.Xd() ^ 5);
        int[] iArr = new int["1\u0010R+d\u0017\\k".length()];
        QB qb = new QB("1\u0010R+d\u0017\\k");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        int iIntValue = Integer.valueOf(data.getQueryParameter(new String(iArr, 0, i2))).intValue();
        int i3 = intent.getExtras().getInt(Ig.wd("1\u0015#7_\u0006iC\u0010G>_\u001e", (short) (C1607wl.Xd() ^ 5400)));
        TransportRuntime.initialize(context);
        TransportContext.Builder priority = TransportContext.builder().setBackendName(queryParameter).setPriority(PriorityMapping.valueOf(iIntValue));
        if (queryParameter2 != null) {
            Class<?> cls = Class.forName(EO.Od("4\u0018\u0012:`/\u007f$.;(Sc{\u0019S\u001aV\u000f", (short) (C1580rY.Xd() ^ (-18226))));
            Class<?>[] clsArr = new Class[2];
            short sXd3 = (short) (OY.Xd() ^ 18635);
            int[] iArr2 = new int["}s\bq=znzr8\\|yosk".length()];
            QB qb2 = new QB("}s\bq=znzr8\\|yosk");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK(sXd3 + sXd3 + sXd3 + i4 + xuXd2.CK(iKK2));
                i4++;
            }
            clsArr[0] = Class.forName(new String(iArr2, 0, i4));
            clsArr[1] = Integer.TYPE;
            Object[] objArr = {queryParameter2, 0};
            Method declaredMethod = cls.getDeclaredMethod(C1593ug.zd("ikjwmo", (short) (OY.Xd() ^ 32530), (short) (OY.Xd() ^ 11686)), clsArr);
            try {
                declaredMethod.setAccessible(true);
                priority.setExtras((byte[]) declaredMethod.invoke(null, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        TransportRuntime.getInstance().getUploader().upload(priority.build(), i3, new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AlarmManagerSchedulerBroadcastReceiver.lambda$onReceive$0();
            }
        });
    }
}
