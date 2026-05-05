package com.incode.welcome_sdk.commons.c.c;

import com.incode.recogkitandroid.IdFaceDetectorKit;
import com.incode.welcome_sdk.commons.RecogManager;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f4666b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f4667d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final IdFaceDetectorKit f4668e;

    @Inject
    public d(RecogManager recogManager) {
        Intrinsics.checkNotNullParameter(recogManager, "");
        Timber.Forest.d("Creating IncodeIdFaceDetector", new Object[0]);
        this.f4668e = recogManager.getIdFaceDetectorKit();
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    static {
        new c((byte) 0);
        int i2 = f4667d + 9;
        f4666b = i2 % 128;
        int i3 = i2 % 2;
    }
}
