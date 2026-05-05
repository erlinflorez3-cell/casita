package com.incode.welcome_sdk.commons.ui;

import android.content.Context;
import com.incode.welcome_sdk.ui.BaseFragment;

/* JADX INFO: loaded from: classes5.dex */
public abstract class FragmentWithListener<T> extends BaseFragment {

    /* JADX INFO: renamed from: a */
    private static int f5827a = 1;

    /* JADX INFO: renamed from: c */
    private static int f5828c = 0;

    /* JADX INFO: renamed from: e */
    private T f5829e;

    public T getListener() {
        T t2;
        int i2 = 2 % 2;
        int i3 = f5827a + 115;
        int i4 = i3 % 128;
        f5828c = i4;
        if (i3 % 2 != 0) {
            t2 = this.f5829e;
            int i5 = 87 / 0;
        } else {
            t2 = this.f5829e;
        }
        int i6 = i4 + 93;
        f5827a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 53 / 0;
        }
        return t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        int i2 = 2 % 2;
        int i3 = f5827a + 45;
        f5828c = i3 % 128;
        int i4 = i3 % 2;
        super.onAttach(context);
        this.f5829e = context;
        int i5 = f5828c + 101;
        f5827a = i5 % 128;
        int i6 = i5 % 2;
    }
}
