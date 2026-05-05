package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import yg.C1580rY;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes9.dex */
final class bn {

    /* JADX INFO: renamed from: a */
    final com.google.android.play.integrity.internal.ae f3406a;

    /* JADX INFO: renamed from: b */
    private final com.google.android.play.integrity.internal.s f3407b;

    /* JADX INFO: renamed from: c */
    private final String f3408c;

    /* JADX INFO: renamed from: d */
    private final TaskCompletionSource f3409d;

    /* JADX INFO: renamed from: e */
    private final at f3410e;

    /* JADX INFO: renamed from: f */
    private final k f3411f;

    bn(Context context, com.google.android.play.integrity.internal.s sVar, at atVar, k kVar) throws Throwable {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f3409d = taskCompletionSource;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Qg.kd("[g\\ie^X!U`^cS[`\u0019-XV[K]X", (short) (ZN.Xd() ^ 11923), (short) (ZN.Xd() ^ 32650))).getMethod(hg.Vd("\u0019\u0016$~\u000f\u0010\u0017\f\u0011\u000eu\b\u0013\n", (short) (ZN.Xd() ^ 29297), (short) (ZN.Xd() ^ 16192)), new Class[0]);
        try {
            method.setAccessible(true);
            this.f3408c = (String) method.invoke(context, objArr);
            this.f3407b = sVar;
            this.f3410e = atVar;
            this.f3411f = kVar;
            Intent intent = bo.f3412a;
            bd bdVar = new com.google.android.play.integrity.internal.z() { // from class: com.google.android.play.core.integrity.bd
                @Override // com.google.android.play.integrity.internal.z
                public final Object a(IBinder iBinder) {
                    return com.google.android.play.integrity.internal.h.b(iBinder);
                }
            };
            short sXd = (short) (C1580rY.Xd() ^ (-12696));
            int[] iArr = new int["p#\u001a\u001b\r\u001a\u0019m\u0012\u0017\u0007\b\u0012\b\u0012\u0016n\u007f\f\u000f\u0001yz".length()];
            QB qb = new QB("p#\u001a\u001b\r\u001a\u0019m\u0012\u0017\u0007\b\u0012\b\u0012\u0016n\u007f\f\u000f\u0001yz");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            com.google.android.play.integrity.internal.ae aeVar = new com.google.android.play.integrity.internal.ae(context, sVar, new String(iArr, 0, i2), intent, bdVar, null);
            this.f3406a = aeVar;
            be beVar = new be(this, taskCompletionSource, context);
            Handler handlerC = aeVar.c();
            short sXd2 = (short) (OY.Xd() ^ 6351);
            int[] iArr2 = new int[")5*73,&n?B{\u0015-9.5=I".length()];
            QB qb2 = new QB(")5*73,&n?B{\u0015-9.5=I");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i3));
                i3++;
            }
            Class<?> cls = Class.forName(new String(iArr2, 0, i3));
            Class<?>[] clsArr = new Class[1];
            short sXd3 = (short) (Od.Xd() ^ (-18099));
            int[] iArr3 = new int["C;Q=\u000bJ@NH\u00105YSTHJUO".length()];
            QB qb3 = new QB("C;Q=\u000bJ@NH\u00105YSTHJUO");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (((sXd3 + sXd3) + sXd3) + i4));
                i4++;
            }
            clsArr[0] = Class.forName(new String(iArr3, 0, i4));
            Object[] objArr2 = {beVar};
            Method method2 = cls.getMethod(Xg.qd("\u0018\u0018\u001d\u001f", (short) (ZN.Xd() ^ 3492), (short) (ZN.Xd() ^ 5811)), clsArr);
            try {
                method2.setAccessible(true);
                method2.invoke(handlerC, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    static /* bridge */ /* synthetic */ Bundle a(bn bnVar, String str, long j2, long j3, int i2) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f3408c);
        bundle.putLong("cloud.prj", j2);
        bundle.putString("nonce", str);
        bundle.putLong("warm.up.sid", j3);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        com.google.android.play.integrity.internal.d.b(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(com.google.android.play.integrity.internal.d.a(arrayList)));
        return bundle;
    }

    static /* bridge */ /* synthetic */ Bundle b(bn bnVar, long j2, int i2) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f3408c);
        bundle.putLong("cloud.prj", j2);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        com.google.android.play.integrity.internal.d.b(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(com.google.android.play.integrity.internal.d.a(arrayList)));
        return bundle;
    }

    static /* bridge */ /* synthetic */ boolean k(bn bnVar) {
        return bnVar.f3409d.getTask().isSuccessful() && ((Integer) bnVar.f3409d.getTask().getResult()).intValue() == 0;
    }

    final Task c(Activity activity, Bundle bundle) throws Throwable {
        int i2 = bundle.getInt("dialog.intent.type");
        this.f3407b.d("requestAndShowDialog(%s)", Integer.valueOf(i2));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f3406a.t(new bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i2), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task d(String str, long j2, long j3, int i2) throws Throwable {
        this.f3407b.d("requestExpressIntegrityToken(%s)", Long.valueOf(j3));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f3406a.t(new bg(this, taskCompletionSource, 0, str, j2, j3, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task e(long j2, int i2) throws Throwable {
        this.f3407b.d("warmUpIntegrityToken(%s)", Long.valueOf(j2));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f3406a.t(new bf(this, taskCompletionSource, 0, j2, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
