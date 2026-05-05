package com.incode.welcome_sdk.ui.permissions;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryContract;

/* JADX INFO: loaded from: classes5.dex */
public class PermissionsMandatoryDialog extends DialogFragment {
    public static final String TAG = "PermissionsMandatory";

    /* JADX INFO: renamed from: b */
    private static int f16881b = 0;

    /* JADX INFO: renamed from: d */
    private static int f16882d = 1;
    private PermissionsMandatoryContract.View mListener;
    private Modules module;
    private String permission;
    private int permissionDrawableResource;
    private int permissionSubtitleResource;
    private int permissionTitleResource;
    IncodeWelcomeRepository repository;
    private boolean result;

    /* JADX INFO: renamed from: instrumented$0$onCreateView$-Landroid-view-LayoutInflater-Landroid-view-ViewGroup-Landroid-os-Bundle--Landroid-view-View- */
    public static /* synthetic */ void m8525xd0e31f79(PermissionsMandatoryDialog permissionsMandatoryDialog, View view) {
        Callback.onClick_enter(view);
        try {
            permissionsMandatoryDialog.lambda$onCreateView$0(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    public static PermissionsMandatoryDialog newInstance(int i2, int i3, int i4, String str, Modules modules, IncodeWelcomeRepository incodeWelcomeRepository) {
        int i5 = 2 % 2;
        PermissionsMandatoryDialog permissionsMandatoryDialog = new PermissionsMandatoryDialog();
        permissionsMandatoryDialog.setPermissionDrawableResource(i2);
        permissionsMandatoryDialog.setPermissionTitleResource(i3);
        permissionsMandatoryDialog.setPermissionSubtitleResource(i4);
        permissionsMandatoryDialog.setPermission(str);
        permissionsMandatoryDialog.setModule(modules);
        permissionsMandatoryDialog.setRepository(incodeWelcomeRepository);
        int i6 = f16882d + 99;
        f16881b = i6 % 128;
        if (i6 % 2 == 0) {
            return permissionsMandatoryDialog;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setPermissionDrawableResource(int i2) {
        int i3 = 2 % 2;
        int i4 = f16882d + 1;
        int i5 = i4 % 128;
        f16881b = i5;
        int i6 = i4 % 2;
        this.permissionDrawableResource = i2;
        int i7 = i5 + 13;
        f16882d = i7 % 128;
        int i8 = i7 % 2;
    }

    public void setPermissionTitleResource(int i2) {
        int i3 = 2 % 2;
        int i4 = f16881b + 87;
        f16882d = i4 % 128;
        if (i4 % 2 != 0) {
            this.permissionTitleResource = i2;
            return;
        }
        this.permissionTitleResource = i2;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setPermissionSubtitleResource(int i2) {
        int i3 = 2 % 2;
        int i4 = f16881b + 39;
        int i5 = i4 % 128;
        f16882d = i5;
        if (i4 % 2 != 0) {
            this.permissionSubtitleResource = i2;
            int i6 = i5 + 121;
            f16881b = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 9 / 0;
                return;
            }
            return;
        }
        this.permissionSubtitleResource = i2;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setPermission(String str) {
        int i2 = 2 % 2;
        int i3 = f16881b + 13;
        int i4 = i3 % 128;
        f16882d = i4;
        int i5 = i3 % 2;
        this.permission = str;
        int i6 = i4 + 25;
        f16881b = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setModule(Modules modules) {
        int i2 = 2 % 2;
        int i3 = f16882d;
        int i4 = i3 + 95;
        f16881b = i4 % 128;
        if (i4 % 2 != 0) {
            this.module = modules;
            int i5 = 15 / 0;
        } else {
            this.module = modules;
        }
        int i6 = i3 + 91;
        f16881b = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public void setRepository(IncodeWelcomeRepository incodeWelcomeRepository) {
        int i2 = 2 % 2;
        int i3 = f16882d + 13;
        int i4 = i3 % 128;
        f16881b = i4;
        if (i3 % 2 == 0) {
            this.repository = incodeWelcomeRepository;
            int i5 = i4 + 117;
            f16882d = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 12 / 0;
                return;
            }
            return;
        }
        this.repository = incodeWelcomeRepository;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        int i2 = 2 % 2;
        int i3 = f16882d + 63;
        f16881b = i3 % 128;
        if (i3 % 2 == 0) {
            super.onAttach(context);
            this.mListener = (PermissionsMandatoryContract.View) context;
            int i4 = f16882d + 15;
            f16881b = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        super.onAttach(context);
        this.mListener = (PermissionsMandatoryContract.View) context;
        throw null;
    }

    private /* synthetic */ void lambda$onCreateView$0(View view) {
        int i2 = 2 % 2;
        int i3 = f16882d + 73;
        f16881b = i3 % 128;
        this.result = i3 % 2 == 0;
        this.mListener.onBtnOpenSettingsClicked();
        dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f16882d + 99;
        f16881b = i3 % 128;
        int i4 = i3 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_dialog_permissions_mandatory, viewGroup, false);
        ((ImageView) viewInflate.findViewById(R.id.imgPermissionDesc)).setImageResource(this.permissionDrawableResource);
        ((TextView) viewInflate.findViewById(R.id.txtDialogTitle)).setText(this.permissionTitleResource);
        ((TextView) viewInflate.findViewById(R.id.txtDialogSubtitle)).setText(this.permissionSubtitleResource);
        viewInflate.findViewById(R.id.btnOpenSettings).setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PermissionsMandatoryDialog.m8525xd0e31f79(this.f$0, view);
            }
        });
        sendScreenOpenedEvent();
        int i5 = f16882d + 107;
        f16881b = i5 % 128;
        int i6 = i5 % 2;
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        int i2 = 2 % 2;
        int i3 = f16882d + 23;
        f16881b = i3 % 128;
        int i4 = i3 % 2;
        super.onPause();
        this.result = true;
        dismissAllowingStateLoss();
        int i5 = f16881b + 33;
        f16882d = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f16882d + 1;
        f16881b = i3 % 128;
        int i4 = i3 % 2;
        super.onDismiss(dialogInterface);
        if (!this.result) {
            sendScreenClosedEvent();
            this.mListener.onPermissionMandatoryDialogClosed(getPermissionException());
            int i5 = f16881b + 23;
            f16882d = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = f16882d + 101;
        f16881b = i7 % 128;
        int i8 = i7 % 2;
    }

    private void sendScreenOpenedEvent() {
        int i2 = 2 % 2;
        int i3 = f16882d + 13;
        f16881b = i3 % 128;
        int i4 = i3 % 2;
        ScreenName screenName = getScreenName();
        if (screenName != null) {
            EventUtils.sendScreenOpened(this.repository, screenName, this.module);
            int i5 = f16882d + 21;
            f16881b = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private void sendScreenClosedEvent() {
        int i2 = 2 % 2;
        int i3 = f16882d + 65;
        f16881b = i3 % 128;
        int i4 = i3 % 2;
        ScreenName screenName = getScreenName();
        if (screenName != null) {
            int i5 = f16881b + 27;
            f16882d = i5 % 128;
            if (i5 % 2 == 0) {
                EventUtils.sendScreenClosed(this.repository, screenName, this.module);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            EventUtils.sendScreenClosed(this.repository, screenName, this.module);
        }
        int i6 = f16882d + 35;
        f16881b = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.incode.welcome_sdk.ScreenName getScreenName() {
        /*
            r6 = this;
            r5 = 2
            int r0 = r5 % r5
            int r1 = com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryDialog.f16882d
            r4 = 1
            int r1 = r1 + r4
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryDialog.f16881b = r0
            int r1 = r1 % r5
            java.lang.String r1 = r6.permission
            int r0 = r1.hashCode()
            r3 = 4
            r2 = 3
            switch(r0) {
                case -1888586689: goto L30;
                case -1324895669: goto L43;
                case -63024214: goto L4d;
                case 463403621: goto L66;
                case 1831139720: goto L70;
                default: goto L17;
            }
        L17:
            r0 = -1
        L18:
            if (r0 == 0) goto L2d
            if (r0 == r4) goto L2a
            if (r0 == r5) goto L27
            if (r0 == r2) goto L27
            if (r0 == r3) goto L24
            r0 = 0
        L23:
            return r0
        L24:
            com.incode.welcome_sdk.ScreenName r0 = com.incode.welcome_sdk.ScreenName.NFC_PERMISSION_MANDATORY_DIALOG
            goto L23
        L27:
            com.incode.welcome_sdk.ScreenName r0 = com.incode.welcome_sdk.ScreenName.GEOLOCATION_PERMISSION_MANDATORY_DIALOG
            goto L23
        L2a:
            com.incode.welcome_sdk.ScreenName r0 = com.incode.welcome_sdk.ScreenName.MICROPHONE_PERMISSION_MANDATORY_DIALOG
            goto L23
        L2d:
            com.incode.welcome_sdk.ScreenName r0 = com.incode.welcome_sdk.ScreenName.CAMERA_PERMISSION_MANDATORY_DIALOG
            goto L23
        L30:
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L17
            int r0 = com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryDialog.f16882d
            int r1 = r0 + 123
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryDialog.f16881b = r0
            int r1 = r1 % r5
            r0 = r2
            goto L18
        L43:
            java.lang.String r0 = "android.permission.NFC"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L17
            r0 = r3
            goto L18
        L4d:
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L17
            int r1 = com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryDialog.f16882d
            int r1 = r1 + r4
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryDialog.f16881b = r0
            int r1 = r1 % r5
            int r1 = r0 + 37
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryDialog.f16882d = r0
            int r1 = r1 % r5
            r0 = r5
            goto L18
        L66:
            java.lang.String r0 = "android.permission.CAMERA"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L17
            r0 = 0
            goto L18
        L70:
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L17
            r0 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryDialog.getScreenName():com.incode.welcome_sdk.ScreenName");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Exception getPermissionException() {
        /*
            r6 = this;
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryDialog.f16881b
            int r1 = r0 + 93
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryDialog.f16882d = r0
            int r1 = r1 % r5
            java.lang.String r4 = r6.permission
            int r1 = r4.hashCode()
            r0 = 463403621(0x1b9efa65, float:2.630072E-22)
            r3 = 0
            r2 = 1
            if (r1 == r0) goto L3f
            r0 = 1831139720(0x6d24f988, float:3.1910754E27)
            if (r1 == r0) goto L29
        L1e:
            r3 = -1
        L1f:
            if (r3 == 0) goto L61
            if (r3 == r2) goto L52
            com.incode.welcome_sdk.commons.exceptions.PermissionDeniedException r0 = new com.incode.welcome_sdk.commons.exceptions.PermissionDeniedException
            r0.<init>()
            return r0
        L29:
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1e
            int r0 = com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryDialog.f16882d
            int r1 = r0 + 37
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryDialog.f16881b = r0
            int r1 = r1 % r5
            if (r1 == 0) goto L3d
            goto L1f
        L3d:
            r3 = r2
            goto L1f
        L3f:
            java.lang.String r0 = "android.permission.CAMERA"
            boolean r0 = r4.equals(r0)
            r0 = r0 ^ r2
            if (r0 == r2) goto L1e
            int r0 = com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryDialog.f16881b
            int r1 = r0 + 9
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryDialog.f16882d = r0
            int r1 = r1 % r5
            goto L1f
        L52:
            com.incode.welcome_sdk.commons.exceptions.video_selfie.MicrophonePermissionDeniedException r2 = new com.incode.welcome_sdk.commons.exceptions.video_selfie.MicrophonePermissionDeniedException
            r2.<init>()
            int r0 = com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryDialog.f16881b
            int r1 = r0 + 75
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryDialog.f16882d = r0
            int r1 = r1 % r5
            return r2
        L61:
            com.incode.welcome_sdk.commons.exceptions.video_selfie.CameraPermissionDeniedException r0 = new com.incode.welcome_sdk.commons.exceptions.video_selfie.CameraPermissionDeniedException
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryDialog.getPermissionException():java.lang.Exception");
    }
}
