package com.google.android.play.core.review;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1607wl;
import yg.Jg;
import yg.Xg;
import yg.ZN;

/* JADX INFO: loaded from: classes9.dex */
public final class zzd implements ReviewManager {
    private final zzi zza;
    private final Handler zzb;

    zzd(zzi zziVar) throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Xg.qd("CQHWUPL\u0017Y^\u001a9]^`Vd", (short) (ZN.Xd() ^ 12771), (short) (ZN.Xd() ^ 31930))).getDeclaredMethod(Jg.Wd("sKV\u0013\u0015\u0015yWfB?\u0016\u0013", (short) (C1607wl.Xd() ^ 22360), (short) (C1607wl.Xd() ^ 16073)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.zzb = new Handler((Looper) declaredMethod.invoke(null, objArr));
            this.zza = zziVar;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.google.android.play.core.review.ReviewManager
    public final Task<Void> launchReviewFlow(Activity activity, ReviewInfo reviewInfo) {
        if (reviewInfo.zzb()) {
            return Tasks.forResult(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.zza());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        intent.putExtra("result_receiver", new zzc(this, this.zzb, taskCompletionSource));
        activity.startActivity(intent);
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.play.core.review.ReviewManager
    public final Task<ReviewInfo> requestReviewFlow() {
        return this.zza.zza();
    }
}
