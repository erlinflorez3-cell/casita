package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.FB;
import yg.Od;
import yg.Wg;

/* JADX INFO: loaded from: classes9.dex */
final class as extends com.google.android.play.integrity.internal.q {

    /* JADX INFO: renamed from: a */
    final TaskCompletionSource f3361a;

    /* JADX INFO: renamed from: b */
    final com.google.android.play.integrity.internal.ae f3362b;

    /* JADX INFO: renamed from: c */
    private final com.google.android.play.integrity.internal.s f3363c = new com.google.android.play.integrity.internal.s(Wg.Zd("\u0014<Q[Tcp5_q\u0002\u000e\u000ej'3<JNYg:gns", (short) (Od.Xd() ^ (-4333)), (short) (Od.Xd() ^ (-15166))));

    /* JADX INFO: renamed from: d */
    private final String f3364d;

    /* JADX INFO: renamed from: e */
    private final k f3365e;

    /* JADX INFO: renamed from: f */
    private final Activity f3366f;

    as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, com.google.android.play.integrity.internal.ae aeVar) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Xd("jxo~|ws>t\u0002\u0002\tz\u0005\fF\\\n\n\u0011\u0003\u0017\u0014", (short) (FB.Xd() ^ 5670))).getMethod(Wg.vd("\u001f\u001c*\u0005\u001d\u001e%\u001a\u0017\u0014{\u000e!\u0018", (short) (C1580rY.Xd() ^ (-1595))), new Class[0]);
        try {
            method.setAccessible(true);
            this.f3364d = (String) method.invoke(context, objArr);
            this.f3365e = kVar;
            this.f3361a = taskCompletionSource;
            this.f3366f = activity;
            this.f3362b = aeVar;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.google.android.play.integrity.internal.r
    public final void b(Bundle bundle) {
        this.f3362b.v(this.f3361a);
        this.f3363c.d("onRequestDialog(%s)", this.f3364d);
        ApiException apiExceptionA = this.f3365e.a(bundle);
        if (apiExceptionA != null) {
            this.f3361a.trySetException(apiExceptionA);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            this.f3363c.b("onRequestDialog(%s): got null dialog intent", this.f3364d);
            this.f3361a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f3366f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new ar(this, this.f3362b.c()));
        this.f3363c.a("Starting dialog intent...", new Object[0]);
        this.f3366f.startActivityForResult(intent, 0);
    }
}
