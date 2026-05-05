package com.incode.welcome_sdk.commons;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.f;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes5.dex */
public final class o {

    /* JADX INFO: renamed from: e */
    private static int f5319e = 0;

    /* JADX INFO: renamed from: h */
    private static int f5320h = 1;

    /* JADX INFO: renamed from: a */
    private final IncodeWelcome f5321a;

    /* JADX INFO: renamed from: b */
    private final MutableStateFlow<c> f5322b;

    /* JADX INFO: renamed from: c */
    private final ActivityResultLauncher<Intent> f5323c;

    /* JADX INFO: renamed from: d */
    private final ComponentActivity f5324d;

    public o(ComponentActivity componentActivity, IncodeWelcome incodeWelcome) {
        Intrinsics.checkNotNullParameter(componentActivity, "");
        Intrinsics.checkNotNullParameter(incodeWelcome, "");
        this.f5324d = componentActivity;
        this.f5321a = incodeWelcome;
        this.f5322b = StateFlowKt.MutableStateFlow(c.f5325a);
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = componentActivity.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.incode.welcome_sdk.commons.o$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                o.e(this.f$0, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.f5323c = activityResultLauncherRegisterForActivityResult;
    }

    public static final class c extends Enum<c> {

        /* JADX INFO: renamed from: b */
        private static final /* synthetic */ c[] f5326b;

        /* JADX INFO: renamed from: c */
        private static int f5327c = 0;

        /* JADX INFO: renamed from: f */
        private static int f5330f = 0;

        /* JADX INFO: renamed from: i */
        private static int f5331i = 1;

        /* JADX INFO: renamed from: j */
        private static int f5332j = 1;

        /* JADX INFO: renamed from: a */
        public static final c f5325a = new c("NOT_REQUESTED", 0);

        /* JADX INFO: renamed from: d */
        public static final c f5328d = new c("RECORDING_MANDATORY_PERMISSION_DENIED", 1);

        /* JADX INFO: renamed from: e */
        public static final c f5329e = new c("CONTINUE", 2);

        private c(String str, int i2) {
            super(str, i2);
        }

        static {
            c[] cVarArrD = d();
            f5326b = cVarArrD;
            EnumEntriesKt.enumEntries(cVarArrD);
            int i2 = f5330f + 85;
            f5332j = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final /* synthetic */ c[] d() {
            c[] cVarArr;
            int i2 = 2 % 2;
            int i3 = f5327c + 37;
            int i4 = i3 % 128;
            f5331i = i4;
            if (i3 % 2 == 0) {
                cVarArr = new c[2];
                cVarArr[0] = f5325a;
                cVarArr[0] = f5328d;
                cVarArr[4] = f5329e;
            } else {
                cVarArr = new c[]{f5325a, f5328d, f5329e};
            }
            int i5 = i4 + 45;
            f5327c = i5 % 128;
            int i6 = i5 % 2;
            return cVarArr;
        }

        public static c valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f5327c + 107;
            f5331i = i3 % 128;
            int i4 = i3 % 2;
            c cVar = (c) Enum.valueOf(c.class, str);
            int i5 = f5327c + 109;
            f5331i = i5 % 128;
            int i6 = i5 % 2;
            return cVar;
        }

        public static c[] values() {
            int i2 = 2 % 2;
            int i3 = f5327c + 9;
            f5331i = i3 % 128;
            int i4 = i3 % 2;
            c[] cVarArr = f5326b;
            if (i4 != 0) {
                return (c[]) cVarArr.clone();
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(com.incode.welcome_sdk.commons.o r3, androidx.activity.result.ActivityResult r4) {
        /*
            r2 = 2
            int r0 = r2 % r2
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r1 = r4.getResultCode()
            r0 = -1
            if (r1 != r0) goto L40
            int r0 = com.incode.welcome_sdk.commons.o.f5319e
            int r1 = r0 + 51
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.o.f5320h = r0
            int r1 = r1 % r2
            android.content.Intent r0 = r4.getData()
            if (r0 == 0) goto L40
            com.incode.welcome_sdk.IncodeWelcome$Companion r0 = com.incode.welcome_sdk.IncodeWelcome.Companion
            com.incode.welcome_sdk.IncodeWelcome$RecordingPermissionData r2 = new com.incode.welcome_sdk.IncodeWelcome$RecordingPermissionData
            android.content.Intent r1 = r4.getData()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r0 = r4.getResultCode()
            r2.<init>(r1, r0)
            com.incode.welcome_sdk.IncodeWelcome.recordingPermissionData = r2
            com.incode.welcome_sdk.IncodeWelcome r1 = r3.f5321a
            r0 = 0
            r1.startScreenRecording(r0)
        L38:
            kotlinx.coroutines.flow.MutableStateFlow<com.incode.welcome_sdk.commons.o$c> r1 = r3.f5322b
            com.incode.welcome_sdk.commons.o$c r0 = com.incode.welcome_sdk.commons.o.c.f5329e
            r1.tryEmit(r0)
            return
        L40:
            com.incode.welcome_sdk.IncodeWelcome r0 = r3.f5321a
            com.incode.welcome_sdk.IncodeWelcome$InternalConfig r0 = r0.getInternalConfig()
            boolean r0 = r0.isRecordSessionMandatory()
            if (r0 == 0) goto L38
            int r0 = com.incode.welcome_sdk.commons.o.f5319e
            int r1 = r0 + 91
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.o.f5320h = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L5f
            kotlinx.coroutines.flow.MutableStateFlow<com.incode.welcome_sdk.commons.o$c> r1 = r3.f5322b
            com.incode.welcome_sdk.commons.o$c r0 = com.incode.welcome_sdk.commons.o.c.f5328d
            r1.tryEmit(r0)
            goto L38
        L5f:
            kotlinx.coroutines.flow.MutableStateFlow<com.incode.welcome_sdk.commons.o$c> r1 = r3.f5322b
            com.incode.welcome_sdk.commons.o$c r0 = com.incode.welcome_sdk.commons.o.c.f5328d
            r1.tryEmit(r0)
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.o.e(com.incode.welcome_sdk.commons.o, androidx.activity.result.ActivityResult):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlinx.coroutines.flow.StateFlow<com.incode.welcome_sdk.commons.o.c> e(boolean r5) {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            kotlinx.coroutines.flow.MutableStateFlow<com.incode.welcome_sdk.commons.o$c> r1 = r4.f5322b
            com.incode.welcome_sdk.commons.o$c r0 = com.incode.welcome_sdk.commons.o.c.f5325a
            r1.tryEmit(r0)
            boolean r0 = r4.d()
            if (r0 == 0) goto L23
            int r0 = com.incode.welcome_sdk.commons.o.f5320h
            int r1 = r0 + 23
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.o.f5319e = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L64
            com.incode.welcome_sdk.IncodeWelcome r0 = r4.f5321a
            boolean r0 = r0.isRecording()
            if (r0 == 0) goto L38
        L23:
            kotlinx.coroutines.flow.MutableStateFlow<com.incode.welcome_sdk.commons.o$c> r1 = r4.f5322b
            com.incode.welcome_sdk.commons.o$c r0 = com.incode.welcome_sdk.commons.o.c.f5329e
            r1.tryEmit(r0)
        L2a:
            kotlinx.coroutines.flow.MutableStateFlow<com.incode.welcome_sdk.commons.o$c> r2 = r4.f5322b
            kotlinx.coroutines.flow.StateFlow r2 = (kotlinx.coroutines.flow.StateFlow) r2
            int r0 = com.incode.welcome_sdk.commons.o.f5319e
            int r1 = r0 + 65
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.o.f5320h = r0
            int r1 = r1 % r3
            return r2
        L38:
            int r0 = com.incode.welcome_sdk.commons.o.f5319e
            int r1 = r0 + 105
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.o.f5320h = r0
            int r1 = r1 % r3
            com.incode.welcome_sdk.commons.utils.ag r0 = com.incode.welcome_sdk.commons.utils.ag.f6381d
            boolean r0 = com.incode.welcome_sdk.commons.utils.ag.b()
            if (r0 != 0) goto L57
            androidx.activity.ComponentActivity r0 = r4.f5324d
            android.content.Context r0 = (android.content.Context) r0
            android.content.Intent r1 = com.incode.welcome_sdk.commons.utils.ag.d(r0)
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r0 = r4.f5323c
            r0.launch(r1)
            goto L2a
        L57:
            com.incode.welcome_sdk.IncodeWelcome r0 = r4.f5321a
            r0.startScreenRecording(r5)
            kotlinx.coroutines.flow.MutableStateFlow<com.incode.welcome_sdk.commons.o$c> r1 = r4.f5322b
            com.incode.welcome_sdk.commons.o$c r0 = com.incode.welcome_sdk.commons.o.c.f5329e
            r1.tryEmit(r0)
            goto L2a
        L64:
            com.incode.welcome_sdk.IncodeWelcome r0 = r4.f5321a
            r0.isRecording()
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.o.e(boolean):kotlinx.coroutines.flow.StateFlow");
    }

    public final boolean d() {
        int i2;
        int i3 = 2 % 2;
        if (!this.f5321a.getInternalConfig().isRecordSession()) {
            int i4 = f5319e + 83;
            f5320h = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        f.c cVar = com.incode.welcome_sdk.f.f10224c;
        Object obj = null;
        if (!f.c.a()) {
            int i6 = f5320h + 97;
            f5319e = i6 % 128;
            int i7 = i6 % 2;
            if (this.f5321a.getCurrentRecordModule() == com.incode.welcome_sdk.modules.g.f10682b && IncodeWelcome.recordingPermissionData == null) {
                int i8 = f5320h + 11;
                f5319e = i8 % 128;
                if (i8 % 2 == 0) {
                    return false;
                }
                throw null;
            }
        }
        com.incode.welcome_sdk.modules.g currentRecordModule = this.f5321a.getCurrentRecordModule();
        if (currentRecordModule == null) {
            int i9 = f5319e + 85;
            f5320h = i9 % 128;
            if (i9 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            i2 = -1;
        } else {
            i2 = e.f5334d[currentRecordModule.ordinal()];
        }
        return i2 == 1 || i2 == 2 || i2 == 3;
    }

    public /* synthetic */ class e {

        /* JADX INFO: renamed from: b */
        private static int f5333b = 1;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f5334d;

        /* JADX INFO: renamed from: e */
        private static int f5335e = 0;

        static {
            int[] iArr = new int[com.incode.welcome_sdk.modules.g.values().length];
            try {
                iArr[com.incode.welcome_sdk.modules.g.f10684d.ordinal()] = 1;
                int i2 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.incode.welcome_sdk.modules.g.f10682b.ordinal()] = 2;
                int i3 = f5335e + 33;
                f5333b = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.incode.welcome_sdk.modules.g.f10685e.ordinal()] = 3;
                int i5 = f5335e + 87;
                f5333b = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            f5334d = iArr;
        }
    }
}
