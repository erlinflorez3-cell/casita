package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes9.dex */
final class aj {

    /* JADX INFO: renamed from: a */
    final com.google.android.play.integrity.internal.ae f3343a;

    /* JADX INFO: renamed from: b */
    private final com.google.android.play.integrity.internal.s f3344b;

    /* JADX INFO: renamed from: c */
    private final String f3345c;

    /* JADX INFO: renamed from: d */
    private final at f3346d;

    /* JADX INFO: renamed from: e */
    private final k f3347e;

    aj(Context context, com.google.android.play.integrity.internal.s sVar, at atVar, k kVar) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(ZO.xd("\u000f0>N\rfI\u001aU\u0011u}AR{Ph-vBM\u00187", (short) (OY.Xd() ^ 5639), (short) (OY.Xd() ^ 29062))).getMethod(C1626yg.Ud("e?\u0015S\u0006H\u0015}+9'a<%", (short) (ZN.Xd() ^ 19816), (short) (ZN.Xd() ^ 22876)), new Class[0]);
        try {
            method.setAccessible(true);
            this.f3345c = (String) method.invoke(context, objArr);
            this.f3344b = sVar;
            this.f3346d = atVar;
            this.f3347e = kVar;
            if (com.google.android.play.integrity.internal.ai.b(context)) {
                this.f3343a = new com.google.android.play.integrity.internal.ae(context, sVar, EO.Od("c@(u\u0010O^\"I$,#UJ4\u001d", (short) (C1499aX.Xd() ^ (-8821))), ak.f3348a, new com.google.android.play.integrity.internal.z() { // from class: com.google.android.play.core.integrity.ae
                    @Override // com.google.android.play.integrity.internal.z
                    public final Object a(IBinder iBinder) {
                        return com.google.android.play.integrity.internal.m.b(iBinder);
                    }
                }, null);
            } else {
                sVar.b(Ig.wd("0\u001d0X=\u0017tHH\u0013\u0015m\u000e\u000b\u001adufA<b\u0013\u0003q^&", (short) (OY.Xd() ^ 421)), new Object[0]);
                this.f3343a = null;
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static /* bridge */ /* synthetic */ Bundle a(aj ajVar, byte[] bArr, Long l2, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ajVar.f3345c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l2 != null) {
            bundle.putLong("cloud.prj", l2.longValue());
        }
        ArrayList arrayList = new ArrayList();
        com.google.android.play.integrity.internal.d.b(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(com.google.android.play.integrity.internal.d.a(arrayList)));
        return bundle;
    }

    final Task b(Activity activity, Bundle bundle) throws Throwable {
        if (this.f3343a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i2 = bundle.getInt("dialog.intent.type");
        this.f3344b.d("requestAndShowDialog(%s, %s)", this.f3345c, Integer.valueOf(i2));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f3343a.t(new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i2), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) throws Throwable {
        if (this.f3343a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            String strNonce = integrityTokenRequest.nonce();
            Class<?> cls = Class.forName(C1561oA.Qd("JVKXTMG\u0010VTHJ\u000b\u001e<M>\u000e\u000b", (short) (FB.Xd() ^ 18157)));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(C1593ug.zd("iawc1pftn6\\~}u{u", (short) (ZN.Xd() ^ 6085), (short) (ZN.Xd() ^ 23902)));
            clsArr[1] = Integer.TYPE;
            Object[] objArr = {strNonce, 10};
            short sXd = (short) (FB.Xd() ^ 27322);
            int[] iArr = new int["<<9D88".length()];
            QB qb = new QB("<<9D88");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
            try {
                declaredMethod.setAccessible(true);
                byte[] bArr = (byte[]) declaredMethod.invoke(null, objArr);
                Long lCloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
                if (integrityTokenRequest instanceof ao) {
                }
                com.google.android.play.integrity.internal.s sVar = this.f3344b;
                Object[] objArr2 = {integrityTokenRequest};
                short sXd2 = (short) (C1607wl.Xd() ^ 24669);
                int[] iArr2 = new int["RFSXIXZ0V]OR^VbhD`]Xb\u001d\u001bj!".length()];
                QB qb2 = new QB("RFSXIXZ0V]OR^VbhD`]Xb\u001d\u001bj!");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
                    i3++;
                }
                sVar.d(new String(iArr2, 0, i3), objArr2);
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                this.f3343a.t(new af(this, taskCompletionSource, bArr, lCloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
                return taskCompletionSource.getTask();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (IllegalArgumentException e3) {
            return Tasks.forException(new IntegrityServiceException(-13, e3));
        }
    }
}
