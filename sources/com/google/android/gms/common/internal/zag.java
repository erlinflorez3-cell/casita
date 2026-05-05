package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zag implements DialogInterface.OnClickListener {
    public static zag zab(Activity activity, Intent intent, int i2) {
        return new zad(intent, activity, i2);
    }

    public static zag zac(Fragment fragment, Intent intent, int i2) {
        return new zae(intent, fragment, i2);
    }

    public static zag zad(LifecycleFragment lifecycleFragment, Intent intent, int i2) {
        return new zaf(intent, lifecycleFragment, 2);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        try {
            try {
                zaa();
            } catch (ActivityNotFoundException e2) {
                Build.FINGERPRINT.contains("generic");
            }
        } finally {
            dialogInterface.dismiss();
        }
    }

    protected abstract void zaa();
}
