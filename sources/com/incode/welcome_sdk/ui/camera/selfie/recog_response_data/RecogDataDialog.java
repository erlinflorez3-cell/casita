package com.incode.welcome_sdk.ui.camera.selfie.recog_response_data;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.DialogFragment;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.d.as;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class RecogDataDialog extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f12109b = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f12110g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f12111a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RecogDataDialogListener f12112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f12113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f12114e;

    public interface RecogDataDialogListener {
        void onRecogDataDialogDismissed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$onCreateView$-Landroid-view-LayoutInflater-Landroid-view-ViewGroup-Landroid-os-Bundle--Landroid-view-View-, reason: not valid java name */
    public static /* synthetic */ void m8365xd0e31f79(RecogDataDialog recogDataDialog, View view) {
        Callback.onClick_enter(view);
        try {
            recogDataDialog.a(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    public static RecogDataDialog newInstance(double d2, double d3, double d4) {
        int i2 = 2 % 2;
        RecogDataDialog recogDataDialog = new RecogDataDialog();
        Bundle bundle = new Bundle();
        bundle.putSerializable("argSpoofConfidence", Double.valueOf(d2));
        bundle.putSerializable("argBlurriness", Double.valueOf(d3));
        bundle.putSerializable("argBrightness", Double.valueOf(d4));
        recogDataDialog.setArguments(bundle);
        int i3 = f12109b + 117;
        f12110g = i3 % 128;
        int i4 = i3 % 2;
        return recogDataDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f12110g + 109;
        f12109b = i3 % 128;
        int i4 = i3 % 2;
        super.onCreate(bundle);
        if (getArguments() != null) {
            int i5 = f12109b + 93;
            f12110g = i5 % 128;
            int i6 = i5 % 2;
            this.f12114e = getArguments().getDouble("argSpoofConfidence");
            this.f12111a = getArguments().getDouble("argBlurriness");
            this.f12113d = getArguments().getDouble("argBrightness");
        }
    }

    private /* synthetic */ void a(View view) {
        int i2 = 2 % 2;
        int i3 = f12109b + 51;
        f12110g = i3 % 128;
        int i4 = i3 % 2;
        dismiss();
        if (i4 == 0) {
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f12109b + 71;
        f12110g = i3 % 128;
        int i4 = i3 % 2;
        as asVarE = as.e(layoutInflater, viewGroup);
        asVarE.f6944c.setText(b(R.string.onboard_sdk_spoof_confidence, this.f12114e));
        asVarE.f6943b.setText(b(R.string.onboard_sdk_blurriness, this.f12111a));
        asVarE.f6946e.setText(b(R.string.onboard_sdk_brightness, this.f12113d));
        asVarE.f6945d.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.selfie.recog_response_data.RecogDataDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecogDataDialog.m8365xd0e31f79(this.f$0, view);
            }
        });
        LinearLayout linearLayoutB = asVarE.b();
        int i5 = f12110g + 15;
        f12109b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 19 / 0;
        }
        return linearLayoutB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        int i2 = 2 % 2;
        int i3 = f12110g + 123;
        f12109b = i3 % 128;
        int i4 = i3 % 2;
        super.onAttach(context);
        if (!(context instanceof RecogDataDialogListener)) {
            throw new RuntimeException("Must implement RecogDataDialogListener listener");
        }
        int i5 = f12109b + 35;
        int i6 = i5 % 128;
        f12110g = i6;
        int i7 = i5 % 2;
        this.f12112c = (RecogDataDialogListener) context;
        int i8 = i6 + 75;
        f12109b = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        int i2 = 2 % 2;
        int i3 = f12110g + 27;
        f12109b = i3 % 128;
        if (i3 % 2 == 0) {
            super.onDetach();
            this.f12112c = null;
            int i4 = f12110g + 85;
            f12109b = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        super.onDetach();
        this.f12112c = null;
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) throws Throwable {
        int i2 = 2 % 2;
        super.onDismiss(dialogInterface);
        RecogDataDialogListener recogDataDialogListener = this.f12112c;
        if (recogDataDialogListener != null) {
            int i3 = f12109b + 47;
            f12110g = i3 % 128;
            int i4 = i3 % 2;
            recogDataDialogListener.onRecogDataDialogDismissed();
            int i5 = f12109b + 37;
            f12110g = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 % 2;
            }
        }
    }

    private String b(int i2, double d2) {
        int i3 = 2 % 2;
        int i4 = f12110g + 17;
        f12109b = i4 % 128;
        int i5 = i4 % 2;
        String string = getString(i2, String.format(Locale.getDefault(), "%.2f", Double.valueOf(d2)));
        int i6 = f12109b + 33;
        f12110g = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 19 / 0;
        }
        return string;
    }
}
