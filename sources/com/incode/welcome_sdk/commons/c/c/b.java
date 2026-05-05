package com.incode.welcome_sdk.commons.c.c;

import android.graphics.Bitmap;
import com.incode.recogkitandroid.Face;
import com.incode.recogkitandroid.RecogKitInvalidInputException;
import com.incode.recogkitandroid.RecogKitProcessException;
import com.incode.recogkitandroid.SelfieFaceDetectorKit;
import com.incode.welcome_sdk.commons.RecogManager;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4661a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f4662b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f4663c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f4664e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SelfieFaceDetectorKit f4665d;

    @Inject
    public b(RecogManager recogManager) {
        Intrinsics.checkNotNullParameter(recogManager, "");
        Timber.Forest.d("Creating IncodeSelfieFaceDetector", new Object[0]);
        this.f4665d = recogManager.getSelfieFaceDetectorKit();
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        r1 = r4 + 77;
        com.incode.welcome_sdk.commons.c.c.b.f4663c = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r6.f4665d != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        r1 = r3 + 109;
        com.incode.welcome_sdk.commons.c.c.b.f4661a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r6.f4665d != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d() {
        /*
            r6 = this;
            r5 = 2
            int r0 = r5 % r5
            int r4 = com.incode.welcome_sdk.commons.c.c.b.f4661a
            int r0 = r4 + 27
            int r3 = r0 % 128
            com.incode.welcome_sdk.commons.c.c.b.f4663c = r3
            int r0 = r0 % r5
            r2 = 0
            if (r0 != 0) goto L1f
            com.incode.recogkitandroid.SelfieFaceDetectorKit r1 = r6.f4665d
            r0 = 96
            int r0 = r0 / r2
            if (r1 == 0) goto L24
        L16:
            int r1 = r3 + 109
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.c.c.b.f4661a = r0
            int r1 = r1 % r5
            r0 = 1
            return r0
        L1f:
            com.incode.recogkitandroid.SelfieFaceDetectorKit r0 = r6.f4665d
            if (r0 == 0) goto L24
            goto L16
        L24:
            int r1 = r4 + 77
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.c.c.b.f4663c = r0
            int r1 = r1 % r5
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.c.c.b.d():boolean");
    }

    public final ArrayList<Face> e(Bitmap bitmap) {
        int i2 = 2 % 2;
        int i3 = f4663c + 53;
        f4661a = i3 % 128;
        int i4 = i3 % 2;
        if (this.f4665d == null) {
            Timber.Forest.w("SelfieFaceDetectorKit is null, cannot perform face detection", new Object[0]);
            return new ArrayList<>();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList<Face> arrayList = new ArrayList<>();
        try {
            ArrayList<Face> arrayListDetect = this.f4665d.detect(bitmap, 0.95f);
            Intrinsics.checkNotNull(arrayListDetect, "");
            arrayList = arrayListDetect;
        } catch (RecogKitInvalidInputException e2) {
            Timber.Forest.e(e2);
        } catch (RecogKitProcessException e3) {
            Timber.Forest.e(e3);
        }
        Timber.Forest.d("Incode face detection took:%s Found faces:%s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), Integer.valueOf(arrayList.size()));
        if (arrayList.size() > 0) {
            int i5 = f4663c + 89;
            f4661a = i5 % 128;
            int i6 = i5 % 2;
            Timber.Forest.d("Incode face:%s", arrayList.get(0));
        }
        return arrayList;
    }

    static {
        new c((byte) 0);
        int i2 = f4662b + 115;
        f4664e = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }
}
