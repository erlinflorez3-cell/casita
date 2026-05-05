package com.incode.welcome_sdk.commons.extensions;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.hbisoft.hbrecorder.HBRecorder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5132d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5133e = 0;

    public static final String b(HBRecorder hBRecorder) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(hBRecorder, "");
        MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
        Intrinsics.checkNotNullExpressionValue(codecInfos, "");
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            int i3 = f5132d + 121;
            f5133e = i3 % 128;
            int i4 = i3 % 2;
            String name = mediaCodecInfo.getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            if (StringsKt.contains((CharSequence) name, (CharSequence) ".h264.encoder", true)) {
                int i5 = f5133e + 113;
                int i6 = i5 % 128;
                f5132d = i6;
                int i7 = i5 % 2;
                int i8 = i6 + 79;
                f5133e = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 16 / 0;
                }
                return "H264";
            }
        }
        return "DEFAULT";
    }
}
