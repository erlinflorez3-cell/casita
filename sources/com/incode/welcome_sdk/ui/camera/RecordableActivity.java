package com.incode.welcome_sdk.ui.camera;

import android.content.Intent;
import androidx.core.app.ActivityCompat;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.exceptions.PermissionDeniedException;
import com.incode.welcome_sdk.commons.utils.ag;
import com.incode.welcome_sdk.modules.g;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryDialog;
import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yg.CX;

/* JADX INFO: loaded from: classes5.dex */
public abstract class RecordableActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f11542b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f11543c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f11544d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f11545e = 0;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onRequestPermissionsResult(int r4, java.lang.String[] r5, int[] r6) {
        /*
            r3 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.ui.camera.RecordableActivity.f11543c
            int r1 = r0 + 103
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.RecordableActivity.f11542b = r0
            int r1 = r1 % r2
            java.lang.String r0 = ""
            if (r1 == 0) goto L27
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            super.onRequestPermissionsResult(r4, r5, r6)
            r0 = 8025(0x1f59, float:1.1245E-41)
            if (r4 != r0) goto L38
        L1d:
            boolean r0 = r3.isAudioPermissionGranted()
            if (r0 == 0) goto L35
            r3.b()
            return
        L27:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            super.onRequestPermissionsResult(r4, r5, r6)
            r0 = 1014(0x3f6, float:1.421E-42)
            if (r4 != r0) goto L38
            goto L1d
        L35:
            r3.showAudioPermissionsMandatory()
        L38:
            int r0 = com.incode.welcome_sdk.ui.camera.RecordableActivity.f11543c
            int r1 = r0 + 111
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.RecordableActivity.f11542b = r0
            int r1 = r1 % r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.RecordableActivity.onRequestPermissionsResult(int, java.lang.String[], int[]):void");
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @Deprecated(message = "Deprecated in Java")
    protected void onActivityResult(int i2, int i3, Intent intent) {
        int i4 = 2 % 2;
        int i5 = f11543c + 15;
        f11542b = i5 % 128;
        int i6 = i5 % 2;
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1005) {
            if (i3 == -1) {
                int i7 = f11542b + 53;
                f11543c = i7 % 128;
                Object obj = null;
                if (i7 % 2 == 0) {
                    throw null;
                }
                if (intent != null) {
                    IncodeWelcome.Companion companion = IncodeWelcome.Companion;
                    IncodeWelcome.recordingPermissionData = new IncodeWelcome.RecordingPermissionData(intent, i3);
                    if (IncodeWelcome.Companion.getInstance().getInternalConfig().isRecordSession()) {
                        IncodeWelcome.Companion.getInstance().startScreenRecording(true);
                        int i8 = f11542b + 75;
                        f11543c = i8 % 128;
                        if (i8 % 2 != 0) {
                            return;
                        }
                        obj.hashCode();
                        throw null;
                    }
                    return;
                }
            }
            if (IncodeWelcome.Companion.getInstance().getInternalConfig().isRecordSessionMandatory()) {
                IncodeWelcome.Companion.getInstance().onError(new PermissionDeniedException());
                finish();
                int i9 = f11543c + 123;
                f11542b = i9 % 128;
                int i10 = i9 % 2;
            }
        }
    }

    public final void startSessionScreenRecording() {
        int i2 = 2 % 2;
        int i3 = f11542b + 19;
        f11543c = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            IncodeWelcome.Companion.getInstance().getCurrentRecordModule();
            obj.hashCode();
            throw null;
        }
        if (IncodeWelcome.Companion.getInstance().getCurrentRecordModule() == null || IncodeWelcome.Companion.getInstance().isRecording() || !c()) {
            return;
        }
        int i4 = f11542b + 121;
        f11543c = i4 % 128;
        if (i4 % 2 != 0) {
            b();
        } else {
            b();
            obj.hashCode();
            throw null;
        }
    }

    private final void b() throws Exception {
        int i2 = 2 % 2;
        int i3 = f11543c + 5;
        f11542b = i3 % 128;
        if (i3 % 2 == 0) {
            if (isAudioPermissionGranted()) {
                int i4 = f11542b + 39;
                f11543c = i4 % 128;
                if (i4 % 2 != 0) {
                    ag agVar = ag.f6381d;
                    if (ag.b()) {
                        IncodeWelcome.Companion.getInstance().startScreenRecording(true);
                        return;
                    }
                } else {
                    ag agVar2 = ag.f6381d;
                    ag.b();
                    throw null;
                }
            }
            if (!isAudioPermissionGranted()) {
                d();
                return;
            } else {
                e();
                return;
            }
        }
        isAudioPermissionGranted();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (androidx.core.content.ContextCompat.checkSelfPermission(r5, "android.permission.RECORD_AUDIO") == 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        r1 = com.incode.welcome_sdk.ui.camera.RecordableActivity.f11543c + 13;
        com.incode.welcome_sdk.ui.camera.RecordableActivity.f11542b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        if (androidx.core.content.ContextCompat.checkSelfPermission(r5, "android.permission.RECORD_AUDIO") == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final boolean isAudioPermissionGranted() {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.ui.camera.RecordableActivity.f11543c
            int r3 = r0 + 9
            int r0 = r3 % 128
            com.incode.welcome_sdk.ui.camera.RecordableActivity.f11542b = r0
            int r3 = r3 % r4
            r2 = 0
            java.lang.String r1 = "android.permission.RECORD_AUDIO"
            if (r3 == 0) goto L28
            r0 = r5
            android.content.Context r0 = (android.content.Context) r0
            int r1 = androidx.core.content.ContextCompat.checkSelfPermission(r0, r1)
            r0 = 85
            int r0 = r0 / r2
            if (r1 != 0) goto L32
        L1d:
            int r0 = com.incode.welcome_sdk.ui.camera.RecordableActivity.f11543c
            int r1 = r0 + 13
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.RecordableActivity.f11542b = r0
            int r1 = r1 % r4
            r0 = 1
            return r0
        L28:
            r0 = r5
            android.content.Context r0 = (android.content.Context) r0
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r0, r1)
            if (r0 != 0) goto L32
            goto L1d
        L32:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.RecordableActivity.isAudioPermissionGranted():boolean");
    }

    private final void e() throws Exception {
        int i2 = 2 % 2;
        int i3 = f11543c + 65;
        f11542b = i3 % 128;
        int i4 = i3 % 2;
        Intent intentD = ag.d(this);
        if (intentD != null) {
            CX.ud();
            startActivityForResult(intentD, 1005);
            int i5 = f11543c + 55;
            f11542b = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private final void d() {
        int i2 = 2 % 2;
        int i3 = f11543c + 109;
        f11542b = i3 % 128;
        if (i3 % 2 != 0) {
            String[] strArr = new String[0];
            strArr[1] = "android.permission.RECORD_AUDIO";
            ActivityCompat.requestPermissions(this, strArr, 21658);
        } else {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.RECORD_AUDIO"}, 1014);
        }
        int i4 = f11542b + 109;
        f11543c = i4 % 128;
        int i5 = i4 % 2;
    }

    private static boolean c() {
        g currentRecordModule;
        int i2 = 2 % 2;
        int i3 = f11542b + 15;
        f11543c = i3 % 128;
        if (i3 % 2 == 0) {
            currentRecordModule = IncodeWelcome.Companion.getInstance().getCurrentRecordModule();
            int i4 = 31 / 0;
            if (currentRecordModule == g.f10684d) {
                return true;
            }
        } else {
            currentRecordModule = IncodeWelcome.Companion.getInstance().getCurrentRecordModule();
            if (currentRecordModule == g.f10684d) {
                return true;
            }
        }
        if (currentRecordModule == g.f10682b) {
            return true;
        }
        int i5 = f11543c + 13;
        f11542b = i5 % 128;
        int i6 = i5 % 2;
        return currentRecordModule == g.f10685e;
    }

    protected final void showAudioPermissionsMandatory() {
        int i2 = 2 % 2;
        int i3 = f11543c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f11542b = i3 % 128;
        int i4 = i3 % 2;
        PermissionsMandatoryDialog.newInstance(R.drawable.onboard_sdk_microphone_permission_image, R.string.onboard_sdk_dialog_microphone_permissions_mandatory_title, R.string.onboard_sdk_dialog_microphone_permissions_mandatory_subtitle, "android.permission.RECORD_AUDIO", getModule(), getRepo()).show(getSupportFragmentManager(), PermissionsMandatoryDialog.TAG);
        int i5 = f11543c + 53;
        f11542b = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        new Companion(defaultConstructorMarker);
        int i2 = f11544d + 123;
        f11545e = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }
}
