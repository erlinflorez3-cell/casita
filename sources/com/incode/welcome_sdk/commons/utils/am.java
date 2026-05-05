package com.incode.welcome_sdk.commons.utils;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.incode.core_light.R;
import com.incode.welcome_sdk.FlowConfig;
import com.incode.welcome_sdk.commons.exceptions.InsufficientDiskSpaceException;
import com.incode.welcome_sdk.modules.Modules;
import java.io.File;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class am {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6422a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f6423b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static am f6424c = new am();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f6425d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f6426e = 0;

    private am() {
    }

    private static long b(Context context) {
        int i2 = 2 % 2;
        int i3 = f6425d + 73;
        f6423b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            return 0L;
        }
        int i5 = f6425d + 111;
        f6423b = i5 % 128;
        if (i5 % 2 != 0) {
            long jB = b(filesDir);
            Timber.Forest.d("Available internal MB : " + jB, new Object[0]);
            return jB;
        }
        long jB2 = b(filesDir);
        Timber.Forest.d("Available internal MB : " + jB2, new Object[0]);
        return jB2;
    }

    private static long a() {
        int i2 = 2 % 2;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCountLong = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 1048576;
        int i3 = f6425d + 25;
        f6423b = i3 % 128;
        if (i3 % 2 == 0) {
            return blockCountLong;
        }
        throw null;
    }

    @JvmStatic
    public static final void d(Context context, FlowConfig flowConfig, boolean z2, boolean z3) throws InsufficientDiskSpaceException {
        int i2 = 2 % 2;
        int i3 = f6425d + 31;
        f6423b = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(flowConfig, "");
            a(flowConfig);
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(flowConfig, "");
        double dA = 10.0d;
        if (a(flowConfig)) {
            l lVar = l.f6529e;
            dA = 10.0d + l.a(context, R.raw.id_segmentation_v3_1_0_f16);
        }
        if (b(flowConfig)) {
            l lVar2 = l.f6529e;
            double dA2 = dA + l.a(context, R.raw.bf_attrib_31b8f9d92fb345c2b4bbdd222792562c_0);
            l lVar3 = l.f6529e;
            dA = dA2 + l.a(context, R.raw.selfie_facedetector);
            if (z2) {
                l lVar4 = l.f6529e;
                dA += l.a(context, com.incode.model_liveness_detection.R.raw.pad_model_fused_070521_optimized);
                int i4 = f6425d + 39;
                f6423b = i4 % 128;
                int i5 = i4 % 2;
            }
            if (z3) {
                int i6 = f6425d + 31;
                f6423b = i6 % 128;
                int i7 = i6 % 2;
                l lVar5 = l.f6529e;
                dA += l.a(context, com.incode.model_face_recognition.R.raw.incode_fr_v2);
            }
        }
        double dB = b(context);
        double dA3 = a();
        Timber.Forest.d("Available disk space in MB = " + dB + "; needed space in MB = " + dA + "; total disk space in MB = " + dA3, new Object[0]);
        if (dA > dB) {
            throw new InsufficientDiskSpaceException(dB, dA, dA3);
        }
    }

    private static long b(File file) {
        int i2 = 2 % 2;
        StatFs statFs = new StatFs(file.getPath());
        long blockSizeLong = (statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / 1048576;
        int i3 = f6423b + 107;
        f6425d = i3 % 128;
        int i4 = i3 % 2;
        return blockSizeLong;
    }

    private static boolean a(FlowConfig flowConfig) {
        int i2 = 2 % 2;
        int i3 = f6425d + 117;
        f6423b = i3 % 128;
        if (i3 % 2 != 0) {
            flowConfig.contains(Modules.ID);
            throw null;
        }
        if (flowConfig.contains(Modules.ID)) {
            return true;
        }
        int i4 = f6425d + 39;
        f6423b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
            if (flowConfig.contains(Modules.DOCUMENT_CAPTURE)) {
                return true;
            }
        } else if (flowConfig.contains(Modules.DOCUMENT_CAPTURE)) {
            return true;
        }
        return flowConfig.contains(Modules.VIDEO_ONBOARDING);
    }

    private static boolean b(FlowConfig flowConfig) {
        int i2 = 2 % 2;
        if (!flowConfig.contains(Modules.SELFIE)) {
            int i3 = f6425d + 95;
            f6423b = i3 % 128;
            int i4 = i3 % 2;
            if (!flowConfig.contains(Modules.VIDEO_ONBOARDING)) {
                return false;
            }
        }
        int i5 = f6423b + 23;
        f6425d = i5 % 128;
        if (i5 % 2 != 0) {
            return true;
        }
        throw null;
    }

    static {
        int i2 = f6426e + 87;
        f6422a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 17 / 0;
        }
    }
}
