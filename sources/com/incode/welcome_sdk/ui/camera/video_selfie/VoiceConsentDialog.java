package com.incode.welcome_sdk.ui.camera.video_selfie;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.d.aq;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class VoiceConsentDialog extends DialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f12209a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f12210c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Companion f12211d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f12212g = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f12213j = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private aq f12214b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private VoiceConsentDialogListener f12215e;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$onCreateView$-Landroid-view-LayoutInflater-Landroid-view-ViewGroup-Landroid-os-Bundle--Landroid-view-View-, reason: not valid java name */
    public static /* synthetic */ void m8369xd0e31f79(VoiceConsentDialog voiceConsentDialog, View view) {
        Callback.onClick_enter(view);
        try {
            a(voiceConsentDialog, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$1$onCreateView$-Landroid-view-LayoutInflater-Landroid-view-ViewGroup-Landroid-os-Bundle--Landroid-view-View-, reason: not valid java name */
    public static /* synthetic */ void m8370x961510d8(VoiceConsentDialog voiceConsentDialog, View view) {
        Callback.onClick_enter(view);
        try {
            e(voiceConsentDialog, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    public static final class Companion {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f12216c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f12217e = 0;

        private Companion() {
        }

        public final VoiceConsentDialog newInstance(String str) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            VoiceConsentDialog voiceConsentDialog = new VoiceConsentDialog();
            Bundle bundle = new Bundle();
            bundle.putString("extraVoiceConsentText", str);
            voiceConsentDialog.setArguments(bundle);
            int i3 = f12216c + 11;
            f12217e = i3 % 128;
            if (i3 % 2 == 0) {
                return voiceConsentDialog;
            }
            throw null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final VoiceConsentDialogListener getVoiceConsentDialogListener() {
        int i2 = 2 % 2;
        int i3 = f12209a + 35;
        int i4 = i3 % 128;
        f12210c = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        VoiceConsentDialogListener voiceConsentDialogListener = this.f12215e;
        int i5 = i4 + 67;
        f12209a = i5 % 128;
        int i6 = i5 % 2;
        return voiceConsentDialogListener;
    }

    public final void setVoiceConsentDialogListener(VoiceConsentDialogListener voiceConsentDialogListener) {
        int i2 = 2 % 2;
        int i3 = f12210c + 19;
        int i4 = i3 % 128;
        f12209a = i4;
        int i5 = i3 % 2;
        this.f12215e = voiceConsentDialogListener;
        int i6 = i4 + 105;
        f12210c = i6 % 128;
        int i7 = i6 % 2;
    }

    private static final void a(VoiceConsentDialog voiceConsentDialog, View view) {
        int i2 = 2 % 2;
        int i3 = f12210c + 99;
        f12209a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(voiceConsentDialog, "");
        VoiceConsentDialogListener voiceConsentDialogListener = voiceConsentDialog.f12215e;
        if (voiceConsentDialogListener != null) {
            int i5 = f12210c + 63;
            f12209a = i5 % 128;
            if (i5 % 2 != 0) {
                voiceConsentDialogListener.onVoiceConsentDialogTryAgainButtonClick();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            voiceConsentDialogListener.onVoiceConsentDialogTryAgainButtonClick();
        }
        voiceConsentDialog.dismiss();
    }

    private static final void e(VoiceConsentDialog voiceConsentDialog, View view) {
        int i2 = 2 % 2;
        int i3 = f12210c + 89;
        f12209a = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(voiceConsentDialog, "");
            VoiceConsentDialogListener voiceConsentDialogListener = voiceConsentDialog.f12215e;
            throw null;
        }
        Intrinsics.checkNotNullParameter(voiceConsentDialog, "");
        VoiceConsentDialogListener voiceConsentDialogListener2 = voiceConsentDialog.f12215e;
        if (voiceConsentDialogListener2 != null) {
            voiceConsentDialogListener2.onVoiceConsentDialogDoneButtonClick();
            int i4 = f12210c + 117;
            f12209a = i4 % 128;
            int i5 = i4 % 2;
        }
        voiceConsentDialog.dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        aq aqVarC = aq.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(aqVarC, "");
        this.f12214b = aqVarC;
        Bundle arguments = getArguments();
        aq aqVar = null;
        String string = arguments != null ? arguments.getString("extraVoiceConsentText", "") : null;
        aq aqVar2 = this.f12214b;
        if (aqVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = f12209a + 103;
            f12210c = i3 % 128;
            int i4 = i3 % 2;
            aqVar2 = null;
        }
        aqVar2.f6931c.setMaxLines(Integer.MAX_VALUE);
        aqVar2.f6931c.setText(requireContext().getResources().getString(R.string.onboard_sdk_video_selfie_voice_consent_dialog_description, string));
        SpannableString spannableString = new SpannableString(requireContext().getResources().getString(R.string.onboard_sdk_voice_consent_dialog_button_try_again));
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        aqVar2.f6929a.setText(spannableString);
        aqVar2.f6929a.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.VoiceConsentDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceConsentDialog.m8369xd0e31f79(this.f$0, view);
            }
        });
        aqVar2.f6930b.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.VoiceConsentDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceConsentDialog.m8370x961510d8(this.f$0, view);
            }
        });
        aq aqVar3 = this.f12214b;
        if (aqVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            aqVar = aqVar3;
        }
        ConstraintLayout constraintLayoutE = aqVar.e();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutE, "");
        ConstraintLayout constraintLayout = constraintLayoutE;
        int i5 = f12210c + 13;
        f12209a = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        int i2 = 2 % 2;
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.setCanceledOnTouchOutside(false);
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            int i3 = f12209a + 87;
            f12210c = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 4 / 2;
            }
        }
        Intrinsics.checkNotNullExpressionValue(dialogOnCreateDialog, "");
        int i5 = f12210c + 1;
        f12209a = i5 % 128;
        int i6 = i5 % 2;
        return dialogOnCreateDialog;
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        f12211d = new Companion(defaultConstructorMarker);
        int i2 = f12212g + 51;
        f12213j = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }
}
