package com.incode.welcome_sdk.ui.id_capture;

import com.incode.welcome_sdk.data.remote.beans.c;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class IdCaptureUploadError extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f14874a = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f14875d = 0;

    private IdCaptureUploadError() {
    }

    public static final class Glare extends IdCaptureUploadError {
        public Glare() {
            super(null);
        }
    }

    public static final class Blur extends IdCaptureUploadError {
        public Blur() {
            super(null);
        }
    }

    public static final class WrongSide extends IdCaptureUploadError {
        public WrongSide() {
            super(null);
        }
    }

    public static final class NoDocumentDetected extends IdCaptureUploadError {
        public NoDocumentDetected() {
            super(null);
        }
    }

    public static final class UnacceptableId extends IdCaptureUploadError {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f14876d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f14877e = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f14878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<c> f14879b;

        /* JADX WARN: Multi-variable type inference failed */
        public UnacceptableId(String str, List<? extends c> list) {
            super(null);
            this.f14878a = str;
            this.f14879b = list;
        }

        public final List<c> getAcceptedDocuments() {
            int i2 = 2 % 2;
            int i3 = f14877e;
            int i4 = i3 + 63;
            f14876d = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            List<c> list = this.f14879b;
            int i5 = i3 + 71;
            f14876d = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        public final String getCountryCode() {
            int i2 = 2 % 2;
            int i3 = f14877e + 57;
            f14876d = i3 % 128;
            int i4 = i3 % 2;
            String str = this.f14878a;
            if (i4 != 0) {
                int i5 = 83 / 0;
            }
            return str;
        }
    }

    public static final class Shadow extends IdCaptureUploadError {
        public Shadow() {
            super(null);
        }
    }

    public static final class Readability extends IdCaptureUploadError {
        public Readability() {
            super(null);
        }
    }

    public static final class RetryCountLimit extends IdCaptureUploadError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RetryCountLimit(Throwable th) {
            super(null);
            Intrinsics.checkNotNullParameter(th, "");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if ((r6 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.Blur) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r1 = r3 + 13;
        com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.f14875d = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if ((r1 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        return 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        return 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        if ((r6 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.NoDocumentDetected) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        r2 = r4 + 29;
        com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.f14874a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        if ((r2 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        r0 = 62 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
    
        if ((r6 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.Readability) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        return 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        if ((r6 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.Shadow) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
    
        r1 = r4 + 75;
        com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.f14874a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        return 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
    
        if ((r6 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.UnacceptableId) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
    
        return 11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005a, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if ((r6 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.Glare) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        return 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if ((r6 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.Glare) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int scanStatus() {
        /*
            r6 = this;
            r5 = 2
            int r0 = r5 % r5
            int r4 = com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.f14875d
            int r0 = r4 + 91
            int r3 = r0 % 128
            com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.f14874a = r3
            int r0 = r0 % r5
            r2 = 3
            if (r0 != 0) goto L17
            boolean r1 = r6 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.Glare
            r0 = 3
            int r0 = r0 / 0
            if (r1 == 0) goto L1c
        L16:
            return r2
        L17:
            boolean r0 = r6 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.Glare
            if (r0 == 0) goto L1c
            goto L16
        L1c:
            boolean r0 = r6 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.Blur
            if (r0 == 0) goto L2c
            int r1 = r3 + 13
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.f14875d = r0
            int r1 = r1 % r5
            if (r1 == 0) goto L2a
            return r2
        L2a:
            r0 = 4
            return r0
        L2c:
            boolean r0 = r6 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.NoDocumentDetected
            if (r0 == 0) goto L3f
            int r2 = r4 + 29
            int r0 = r2 % 128
            com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.f14874a = r0
            int r2 = r2 % r5
            r1 = 1
            if (r2 != 0) goto L3e
            r0 = 62
            int r0 = r0 / 0
        L3e:
            return r1
        L3f:
            boolean r0 = r6 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.Readability
            if (r0 == 0) goto L46
            r0 = 8
            return r0
        L46:
            boolean r0 = r6 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.Shadow
            if (r0 == 0) goto L53
            int r1 = r4 + 75
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.f14874a = r0
            int r1 = r1 % r5
            r0 = 5
            return r0
        L53:
            boolean r0 = r6 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.UnacceptableId
            if (r0 == 0) goto L5a
            r0 = 11
            return r0
        L5a:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.scanStatus():int");
    }

    public /* synthetic */ IdCaptureUploadError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
