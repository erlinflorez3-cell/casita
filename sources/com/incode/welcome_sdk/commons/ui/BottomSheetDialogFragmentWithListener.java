package com.incode.welcome_sdk.commons.ui;

import android.content.Context;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BottomSheetDialogFragmentWithListener<T> extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5765b = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5766e = 0;
    private T mListener;

    protected T getListener() {
        int i2 = 2 % 2;
        int i3 = f5766e + 93;
        f5765b = i3 % 128;
        int i4 = i3 % 2;
        T t2 = this.mListener;
        if (i4 == 0) {
            int i5 = 79 / 0;
        }
        return t2;
    }

    public int getSoftInputMode() {
        int i2 = 2 % 2;
        int i3 = f5765b + 125;
        int i4 = i3 % 128;
        f5766e = i4;
        int i5 = i3 % 2 != 0 ? 1 : 0;
        int i6 = i4 + 89;
        f5765b = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        int i2 = 2 % 2;
        int i3 = f5765b + 87;
        f5766e = i3 % 128;
        int i4 = i3 % 2;
        super.onAttach(context);
        this.mListener = context;
        int i5 = f5766e + 117;
        f5765b = i5 % 128;
        int i6 = i5 % 2;
    }

    public boolean onBackPressed() {
        int i2 = 2 % 2;
        int i3 = f5765b + 121;
        int i4 = i3 % 128;
        f5766e = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 71;
        f5765b = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }
}
