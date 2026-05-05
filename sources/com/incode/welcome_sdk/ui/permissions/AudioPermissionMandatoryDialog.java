package com.incode.welcome_sdk.ui.permissions;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.d.an;
import com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryContract;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioPermissionMandatoryDialog extends DialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f16872a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Companion f16873c = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f16874d = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f16875i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f16876j = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private an f16877b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private PermissionsMandatoryContract.View f16878e;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$onCreateView$-Landroid-view-LayoutInflater-Landroid-view-ViewGroup-Landroid-os-Bundle--Landroid-view-View-, reason: not valid java name */
    public static /* synthetic */ void m8524xd0e31f79(AudioPermissionMandatoryDialog audioPermissionMandatoryDialog, View view) {
        Callback.onClick_enter(view);
        try {
            e(audioPermissionMandatoryDialog, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    public static final class Companion {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16879c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16880e = 1;

        private Companion() {
        }

        public final AudioPermissionMandatoryDialog newInstance() {
            int i2 = 2 % 2;
            AudioPermissionMandatoryDialog audioPermissionMandatoryDialog = new AudioPermissionMandatoryDialog();
            int i3 = f16879c + 81;
            f16880e = i3 % 128;
            int i4 = i3 % 2;
            return audioPermissionMandatoryDialog;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final PermissionsMandatoryContract.View getListener() {
        int i2 = 2 % 2;
        PermissionsMandatoryContract.View view = this.f16878e;
        Object obj = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = f16872a + 45;
            f16874d = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        int i5 = f16872a + 47;
        f16874d = i5 % 128;
        if (i5 % 2 == 0) {
            return view;
        }
        obj.hashCode();
        throw null;
    }

    public final void setListener(PermissionsMandatoryContract.View view) {
        int i2 = 2 % 2;
        int i3 = f16872a + 17;
        f16874d = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            this.f16878e = view;
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            this.f16878e = view;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final void e(AudioPermissionMandatoryDialog audioPermissionMandatoryDialog, View view) {
        int i2 = 2 % 2;
        int i3 = f16874d + 95;
        f16872a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(audioPermissionMandatoryDialog, "");
        audioPermissionMandatoryDialog.getListener().onBtnOpenSettingsClicked();
        audioPermissionMandatoryDialog.dismiss();
        int i5 = f16872a + 101;
        f16874d = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        an anVarC = an.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(anVarC, "");
        this.f16877b = anVarC;
        an anVar = null;
        if (anVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = f16874d + 21;
            f16872a = i3 % 128;
            int i4 = i3 % 2;
            anVarC = null;
        }
        anVarC.f6900d.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.permissions.AudioPermissionMandatoryDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudioPermissionMandatoryDialog.m8524xd0e31f79(this.f$0, view);
            }
        });
        an anVar2 = this.f16877b;
        if (anVar2 == null) {
            int i5 = f16872a + 13;
            f16874d = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i6 != 0) {
                int i7 = 79 / 0;
            }
        } else {
            anVar = anVar2;
        }
        return anVar.c();
    }

    @Override // androidx.fragment.app.DialogFragment
    public final int getTheme() {
        int i2 = 2 % 2;
        int i3 = f16872a + 61;
        f16874d = i3 % 128;
        int i4 = i3 % 2;
        int i5 = R.style.onboard_sdk_FullScreenDialog;
        if (i4 == 0) {
            return i5;
        }
        throw null;
    }

    static {
        int i2 = f16876j + 33;
        f16875i = i2 % 128;
        int i3 = i2 % 2;
    }
}
