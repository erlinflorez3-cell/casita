package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Xg;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zap extends LifecycleCallback implements DialogInterface.OnCancelListener {
    protected volatile boolean zaa;
    protected final AtomicReference zab;
    protected final GoogleApiAvailability zac;
    private final Handler zad;

    zap(LifecycleFragment lifecycleFragment, GoogleApiAvailability googleApiAvailability) throws Throwable {
        super(lifecycleFragment);
        this.zab = new AtomicReference(null);
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Xg.qd(" .%42-)s6;v\u0016:;=3A", (short) (FB.Xd() ^ 6003), (short) (FB.Xd() ^ 21583))).getDeclaredMethod(Jg.Wd("m~0*Pz!!Vv\u001a1S", (short) (C1633zX.Xd() ^ (-1930)), (short) (C1633zX.Xd() ^ (-28365))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.zad = new com.google.android.gms.internal.base.zau((Looper) declaredMethod.invoke(null, objArr));
            this.zac = googleApiAvailability;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void zaa(ConnectionResult connectionResult, int i2) {
        this.zab.set(null);
        zab(connectionResult, i2);
    }

    public final void zad() {
        this.zab.set(null);
        zac();
    }

    private static final int zae(zam zamVar) {
        if (zamVar == null) {
            return -1;
        }
        return zamVar.zaa();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onActivityResult(int i2, int i3, Intent intent) {
        zam zamVar = (zam) this.zab.get();
        if (i2 != 1) {
            if (i2 == 2) {
                int iIsGooglePlayServicesAvailable = this.zac.isGooglePlayServicesAvailable(getActivity());
                if (iIsGooglePlayServicesAvailable == 0) {
                    zad();
                    return;
                } else {
                    if (zamVar == null) {
                        return;
                    }
                    if (zamVar.zab().getErrorCode() == 18 && iIsGooglePlayServicesAvailable == 18) {
                        return;
                    }
                }
            }
        } else if (i3 == -1) {
            zad();
            return;
        } else if (i3 == 0) {
            if (zamVar != null) {
                zaa(new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, zamVar.zab().toString()), zae(zamVar));
                return;
            }
            return;
        }
        if (zamVar != null) {
            zaa(zamVar.zab(), zamVar.zaa());
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        zaa(new ConnectionResult(13, null), zae((zam) this.zab.get()));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.zab.set(bundle.getBoolean("resolving_error", false) ? new zam(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        zam zamVar = (zam) this.zab.get();
        if (zamVar == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", zamVar.zaa());
        bundle.putInt("failed_status", zamVar.zab().getErrorCode());
        bundle.putParcelable("failed_resolution", zamVar.zab().getResolution());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStart() {
        super.onStart();
        this.zaa = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStop() {
        super.onStop();
        this.zaa = false;
    }

    protected abstract void zab(ConnectionResult connectionResult, int i2);

    protected abstract void zac();

    public final void zah(ConnectionResult connectionResult, int i2) {
        AtomicReference atomicReference;
        zam zamVar = new zam(connectionResult, i2);
        do {
            atomicReference = this.zab;
            if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, null, zamVar)) {
                Handler handler = this.zad;
                Object[] objArr = {new zao(this, zamVar)};
                Method method = Class.forName(ZO.xd("\u001bjWeT%\u001aH},sXJ/:[&5", (short) (C1607wl.Xd() ^ 11037), (short) (C1607wl.Xd() ^ 1944))).getMethod(Ig.wd("U\u001fpb", (short) (OY.Xd() ^ 5965)), Class.forName(C1626yg.Ud("&`|t\\IKEq{\u001ej\nG=\u001b2:", (short) (OY.Xd() ^ 18633), (short) (OY.Xd() ^ 13434))));
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr);
                    return;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        } while (atomicReference.get() == null);
    }
}
