package com.facetec.sdk;

import android.app.Fragment;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
abstract class av implements Runnable {
    private final WeakReference<Fragment> Z;

    av(Fragment fragment) {
        this.Z = new WeakReference<>(fragment);
    }

    abstract void B();

    @Override // java.lang.Runnable
    public void run() {
        Fragment fragment = this.Z.get();
        if (fragment == null || !fragment.isAdded() || fragment.getActivity() == null || fragment.getActivity().isFinishing()) {
            return;
        }
        B();
    }
}
