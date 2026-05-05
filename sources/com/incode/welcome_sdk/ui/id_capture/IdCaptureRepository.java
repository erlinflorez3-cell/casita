package com.incode.welcome_sdk.ui.id_capture;

import android.graphics.Bitmap;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.IdCategory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.commons.IncodeUXConfig;
import com.incode.welcome_sdk.commons.utils.BitmapUtils;
import com.incode.welcome_sdk.commons.utils.ak;
import com.incode.welcome_sdk.commons.utils.k;
import com.incode.welcome_sdk.commons.utils.l;
import com.incode.welcome_sdk.data.ImageType;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.data.remote.beans.bc;
import com.incode.welcome_sdk.data.remote.beans.bt;
import com.incode.welcome_sdk.data.remote.beans.cb;
import com.incode.welcome_sdk.data.remote.beans.s;
import com.incode.welcome_sdk.listeners.CommonBaseListener;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.results.BackIdScanResult;
import com.incode.welcome_sdk.results.BaseResult;
import com.incode.welcome_sdk.results.FrontIdScanResult;
import com.incode.welcome_sdk.results.IdScanCompleted;
import com.incode.welcome_sdk.results.IdScanResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError;
import io.reactivex.Observable;
import java.io.File;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;

/* JADX INFO: loaded from: classes5.dex */
public final class IdCaptureRepository {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: l */
    private static long f14794l = 0;

    /* JADX INFO: renamed from: n */
    private static int f14795n = 0;

    /* JADX INFO: renamed from: p */
    private static int f14796p = 0;

    /* JADX INFO: renamed from: s */
    private static int f14797s = 0;

    /* JADX INFO: renamed from: t */
    private static int f14798t = 0;

    /* JADX INFO: renamed from: a */
    private final com.incode.welcome_sdk.c f14799a;

    /* JADX INFO: renamed from: b */
    private final IdScan f14800b;

    /* JADX INFO: renamed from: c */
    private final IncodeWelcome f14801c;

    /* JADX INFO: renamed from: d */
    private final ak f14802d;

    /* JADX INFO: renamed from: e */
    private final com.incode.welcome_sdk.data.local.a.e f14803e;

    /* JADX INFO: renamed from: f */
    private final com.incode.welcome_sdk.commons.utils.d f14804f;

    /* JADX INFO: renamed from: g */
    private final k f14805g;

    /* JADX INFO: renamed from: h */
    private final IncodeWelcomeRepository f14806h;

    /* JADX INFO: renamed from: i */
    private final long f14807i;

    /* JADX INFO: renamed from: j */
    private final CoroutineScope f14808j;

    /* JADX INFO: renamed from: k */
    private final long f14809k;

    /* JADX INFO: renamed from: m */
    private final Lazy f14810m;

    /* JADX INFO: renamed from: o */
    private final s.b f14811o;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r8, short r9, short r10) {
        /*
            int r0 = r8 * 2
            int r0 = r0 + 117
            int r1 = r10 * 4
            int r8 = 3 - r1
            byte[] r7 = com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository.$$a
            int r1 = r9 * 4
            int r6 = r1 + 1
            byte[] r5 = new byte[r6]
            r4 = 0
            if (r7 != 0) goto L2c
            r3 = r6
            r1 = r8
            r2 = r4
        L16:
            int r8 = r8 + r3
            r0 = r8
            r8 = r1
        L19:
            byte r1 = (byte) r0
            r5[r2] = r1
            int r2 = r2 + 1
            int r1 = r8 + 1
            if (r2 != r6) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L28:
            r3 = r7[r1]
            r8 = r0
            goto L16
        L2c:
            r2 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository.$$c(byte, short, short):java.lang.String");
    }

    static void init$0() {
        $$a = new byte[]{73, -128, -106, 120};
        $$b = 222;
    }

    public IdCaptureRepository(IdScan idScan, IncodeWelcome incodeWelcome, ak akVar, com.incode.welcome_sdk.c cVar, com.incode.welcome_sdk.data.local.a.e eVar, IncodeWelcomeRepository incodeWelcomeRepository, k kVar, com.incode.welcome_sdk.commons.utils.d dVar, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(idScan, "");
        Intrinsics.checkNotNullParameter(incodeWelcome, "");
        Intrinsics.checkNotNullParameter(akVar, "");
        Intrinsics.checkNotNullParameter(cVar, "");
        Intrinsics.checkNotNullParameter(eVar, "");
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(kVar, "");
        Intrinsics.checkNotNullParameter(dVar, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.f14800b = idScan;
        this.f14801c = incodeWelcome;
        this.f14802d = akVar;
        this.f14799a = cVar;
        this.f14803e = eVar;
        this.f14806h = incodeWelcomeRepository;
        this.f14805g = kVar;
        this.f14804f = dVar;
        this.f14808j = coroutineScope;
        this.f14807i = 750L;
        this.f14809k = 1000L;
        this.f14810m = LazyKt.lazy(new a());
        this.f14811o = new s.b((byte) 0);
    }

    public static final /* synthetic */ String access$extractFaceCropIfNeeded(IdCaptureRepository idCaptureRepository, IdCategory idCategory) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f14795n + 11;
        f14796p = i3 % 128;
        if (i3 % 2 != 0) {
            return idCaptureRepository.d(idCategory);
        }
        idCaptureRepository.d(idCategory);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ IdScan access$getIdScan$p(IdCaptureRepository idCaptureRepository) {
        int i2 = 2 % 2;
        int i3 = f14796p + 97;
        int i4 = i3 % 128;
        f14795n = i4;
        int i5 = i3 % 2;
        IdScan idScan = idCaptureRepository.f14800b;
        int i6 = i4 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f14796p = i6 % 128;
        if (i6 % 2 != 0) {
            return idScan;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ IncodeWelcomeRepository access$getIncodeWelcomeRepository$p(IdCaptureRepository idCaptureRepository) {
        int i2 = 2 % 2;
        int i3 = f14795n + 51;
        int i4 = i3 % 128;
        f14796p = i4;
        int i5 = i3 % 2;
        IncodeWelcomeRepository incodeWelcomeRepository = idCaptureRepository.f14806h;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i4 + 17;
        f14795n = i6 % 128;
        if (i6 % 2 == 0) {
            return incodeWelcomeRepository;
        }
        throw null;
    }

    public static final /* synthetic */ boolean access$isCaptureOnlyMode(IdCaptureRepository idCaptureRepository) {
        int i2 = 2 % 2;
        int i3 = f14795n + 79;
        f14796p = i3 % 128;
        if (i3 % 2 != 0) {
            return idCaptureRepository.a();
        }
        idCaptureRepository.a();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ boolean access$isDelayedMode(IdCaptureRepository idCaptureRepository) {
        int i2 = 2 % 2;
        int i3 = f14795n + 27;
        f14796p = i3 % 128;
        int i4 = i3 % 2;
        boolean zB = idCaptureRepository.b();
        int i5 = f14796p + 111;
        f14795n = i5 % 128;
        if (i5 % 2 == 0) {
            return zB;
        }
        throw null;
    }

    public static final /* synthetic */ Object access$processAndReturnResult(IdCaptureRepository idCaptureRepository, Bitmap bitmap, IdScan.IdType idType, com.incode.welcome_sdk.data.remote.beans.f fVar, DocumentType documentType, Function2 function2, Function1 function1, Function2 function22, int i2, Continuation continuation) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f14796p + 23;
        f14795n = i4 % 128;
        int i5 = i4 % 2;
        Object objC = idCaptureRepository.c(bitmap, idType, fVar, documentType, function2, function1, function22, i2, continuation);
        int i6 = f14795n + 63;
        f14796p = i6 % 128;
        int i7 = i6 % 2;
        return objC;
    }

    public static final /* synthetic */ void access$storeInDelayMode(IdCaptureRepository idCaptureRepository, IdScanResult idScanResult, DocumentType documentType) {
        int i2 = 2 % 2;
        int i3 = f14795n + 37;
        f14796p = i3 % 128;
        int i4 = i3 % 2;
        idCaptureRepository.b(idScanResult, documentType);
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean b() {
        int i2 = 2 % 2;
        int i3 = f14796p + 63;
        f14795n = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcome incodeWelcome = this.f14801c;
        if (i4 == 0) {
            return incodeWelcome.isDelayedMode();
        }
        incodeWelcome.isDelayedMode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean a() {
        int i2 = 2 % 2;
        int i3 = f14796p + 27;
        f14795n = i3 % 128;
        int i4 = i3 % 2;
        boolean zIsCaptureOnlyMode = this.f14801c.isCaptureOnlyMode();
        if (i4 != 0) {
            int i5 = 15 / 0;
        }
        return zIsCaptureOnlyMode;
    }

    public final long getZoomOperationDelayMs() {
        int i2 = 2 % 2;
        int i3 = f14795n;
        int i4 = i3 + 19;
        f14796p = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.f14807i;
        int i6 = i3 + 39;
        f14796p = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 6 / 0;
        }
        return j2;
    }

    public final long getExposureOperationDelayMs() {
        int i2 = 2 % 2;
        int i3 = f14795n;
        int i4 = i3 + 67;
        f14796p = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.f14809k;
        int i6 = i3 + 39;
        f14796p = i6 % 128;
        if (i6 % 2 != 0) {
            return j2;
        }
        throw null;
    }

    static final class a extends Lambda implements Function0<RetryCounter> {

        /* JADX INFO: renamed from: a */
        private static int f14822a = 0;

        /* JADX INFO: renamed from: d */
        private static int f14823d = 1;

        private RetryCounter a() {
            int i2 = 2 % 2;
            RetryCounter retryCounter = new RetryCounter(IdCaptureRepository.access$getIncodeWelcomeRepository$p(IdCaptureRepository.this), IdCaptureRepository.access$getIdScan$p(IdCaptureRepository.this).getCaptureAttempts());
            int i3 = f14823d + 113;
            f14822a = i3 % 128;
            if (i3 % 2 == 0) {
                return retryCounter;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ RetryCounter invoke() {
            int i2 = 2 % 2;
            int i3 = f14822a + 31;
            f14823d = i3 % 128;
            if (i3 % 2 != 0) {
                return a();
            }
            a();
            throw null;
        }

        a() {
            super(0);
        }
    }

    private final RetryCounter d() {
        int i2 = 2 % 2;
        int i3 = f14795n + 41;
        f14796p = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        RetryCounter retryCounter = (RetryCounter) this.f14810m.getValue();
        int i4 = f14795n + 65;
        f14796p = i4 % 128;
        int i5 = i4 % 2;
        return retryCounter;
    }

    private static void q(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 37;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        com.c.a.k kVar = new com.c.a.k();
        char[] cArrE = com.c.a.k.e(f14794l ^ (-3501477462694648052L), (char[]) charArray, i2);
        kVar.f2772b = 4;
        while (kVar.f2772b < cArrE.length) {
            int i6 = $10 + 53;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            kVar.f2773d = kVar.f2772b - 4;
            int i8 = kVar.f2772b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrE[kVar.f2772b] ^ cArrE[kVar.f2772b % 4]), Long.valueOf(kVar.f2773d), Long.valueOf(f14794l)};
                Object objC = com.c.a.e.e.c(1215460496);
                if (objC == null) {
                    byte b2 = (byte) 1;
                    byte b3 = (byte) (b2 - 1);
                    objC = com.c.a.e.e.e((char) (92 - TextUtils.getOffsetAfter("", 0)), 20 - (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.getCapsMode("", 0, 0) + 1107, 1223194345, false, $$c(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrE[i8] = ((Character) ((Method) objC).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objC2 = com.c.a.e.e.c(-727400358);
                if (objC2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objC2 = com.c.a.e.e.e((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 20, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1282, -734084573, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objC2).invoke(null, objArr3);
                int i9 = $10 + 113;
                $11 = i9 % 128;
                int i10 = i9 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrE, 4, cArrE.length - 4);
    }

    public final s.b getMetadataBuilder() {
        int i2 = 2 % 2;
        int i3 = f14796p + 87;
        f14795n = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f14811o;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016d A[Catch: all -> 0x01d4, TryCatch #0 {all -> 0x01d4, blocks: (B:115:0x0156, B:118:0x0165, B:125:0x01a6, B:121:0x0175, B:123:0x0184, B:124:0x0190, B:120:0x016d), top: B:154:0x0156 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0184 A[Catch: all -> 0x01d4, TryCatch #0 {all -> 0x01d4, blocks: (B:115:0x0156, B:118:0x0165, B:125:0x01a6, B:121:0x0175, B:123:0x0184, B:124:0x0190, B:120:0x016d), top: B:154:0x0156 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0223 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object c(android.graphics.Bitmap r24, com.incode.welcome_sdk.modules.IdScan.IdType r25, com.incode.welcome_sdk.data.remote.beans.f r26, com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r27, kotlin.jvm.functions.Function2<? super com.incode.welcome_sdk.data.IncodeWelcomeRepository, ? super com.incode.welcome_sdk.data.remote.beans.bt, com.incode.welcome_sdk.data.remote.beans.bc> r28, kotlin.jvm.functions.Function1<? super com.incode.welcome_sdk.results.IdScanResult, ? extends com.incode.welcome_sdk.results.BaseResult> r29, kotlin.jvm.functions.Function2<? super com.incode.welcome_sdk.data.IncodeWelcomeRepository, ? super com.incode.welcome_sdk.results.IdScanResult, kotlin.Unit> r30, int r31, kotlin.coroutines.Continuation<? super com.incode.welcome_sdk.results.IdScanResult> r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository.c(android.graphics.Bitmap, com.incode.welcome_sdk.modules.IdScan$IdType, com.incode.welcome_sdk.data.remote.beans.f, com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final String d(IdCategory idCategory) throws Throwable {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f14796p + 69;
        f14795n = i3 % 128;
        int i4 = i3 % 2;
        if (!this.f14801c.getInternalConfig().isDownloadImagesEnabled()) {
            return null;
        }
        ImageType imageType = ImageType.croppedIDFace;
        if (idCategory == IdCategory.SECOND) {
            int i5 = f14796p + 3;
            f14795n = i5 % 128;
            int i6 = i5 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        String strSaveFaceCrop = this.f14806h.saveFaceCrop(this.f14806h.getImages(new ImageType[]{imageType}, z2).blockingFirst().getImage(imageType), z2);
        int i7 = f14796p + 107;
        f14795n = i7 % 128;
        int i8 = i7 % 2;
        return strSaveFaceCrop;
    }

    private final File c(DocumentType documentType, Bitmap bitmap) {
        int i2 = 2 % 2;
        int i3 = f14796p + 95;
        f14795n = i3 % 128;
        int i4 = i3 % 2;
        File fileSaveBitmapToFile = BitmapUtils.saveBitmapToFile(bitmap, b(documentType));
        Intrinsics.checkNotNullExpressionValue(fileSaveBitmapToFile, "");
        int i5 = f14795n + 3;
        f14796p = i5 % 128;
        int i6 = i5 % 2;
        return fileSaveBitmapToFile;
    }

    private final boolean d(DocumentType documentType) {
        int i2 = 2 % 2;
        int i3 = f14795n + 121;
        f14796p = i3 % 128;
        int i4 = i3 % 2;
        boolean zDelete = b(documentType).delete();
        int i5 = f14796p + 95;
        f14795n = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 82 / 0;
        }
        return zDelete;
    }

    private final File b(DocumentType documentType) {
        int i2 = 2 % 2;
        int i3 = f14796p + 61;
        f14795n = i3 % 128;
        if (i3 % 2 == 0) {
            if (b()) {
                com.incode.welcome_sdk.data.local.a.e eVar = this.f14803e;
                String imageFilename = documentType.getImageFilename();
                Intrinsics.checkNotNullExpressionValue(imageFilename, "");
                File fileA = eVar.a(imageFilename);
                int i4 = f14796p + 123;
                f14795n = i4 % 128;
                int i5 = i4 % 2;
                return fileA;
            }
            File imagesDirectory = this.f14806h.getImagesDirectory();
            Intrinsics.checkNotNullExpressionValue(imagesDirectory, "");
            String imageFilename2 = documentType.getImageFilename();
            Intrinsics.checkNotNullExpressionValue(imageFilename2, "");
            return l.b(imagesDirectory, imageFilename2);
        }
        b();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0024, code lost:
    
        if (r2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0026, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0031, code lost:
    
        if (r2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0036, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object checkDeviceSafetyInCaptureOnlyMode(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            boolean r1 = r4.a()
            r0 = 1
            r1 = r1 ^ r0
            if (r1 == r0) goto L37
            int r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository.f14796p
            int r1 = r0 + 63
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository.f14795n = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L27
            com.incode.welcome_sdk.commons.utils.k r0 = r4.f14805g
            java.lang.Object r2 = r0.e(r5)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r0 = 32
            int r0 = r0 / 0
            if (r2 != r1) goto L34
        L26:
            return r2
        L27:
            com.incode.welcome_sdk.commons.utils.k r0 = r4.f14805g
            java.lang.Object r2 = r0.e(r5)
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r0) goto L34
            goto L26
        L34:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L37:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            int r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository.f14796p
            int r1 = r0 + 43
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository.f14795n = r0
            int r1 = r1 % r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository.checkDeviceSafetyInCaptureOnlyMode(kotlin.coroutines.Continuation):java.lang.Object");
    }

    static final class d extends Lambda implements Function1<IdScanResult, BaseResult> {

        /* JADX INFO: renamed from: a */
        public static final d f14846a = new d();

        /* JADX INFO: renamed from: b */
        private static int f14847b = 0;

        /* JADX INFO: renamed from: c */
        private static int f14848c = 1;

        /* JADX INFO: renamed from: d */
        private static int f14849d = 0;

        /* JADX INFO: renamed from: e */
        private static int f14850e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ BaseResult invoke(IdScanResult idScanResult) {
            int i2 = 2 % 2;
            int i3 = f14850e + 61;
            f14849d = i3 % 128;
            int i4 = i3 % 2;
            BaseResult baseResultA = a(idScanResult);
            if (i4 != 0) {
                int i5 = 20 / 0;
            }
            int i6 = f14850e + 49;
            f14849d = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 83 / 0;
            }
            return baseResultA;
        }

        private static BaseResult a(IdScanResult idScanResult) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(idScanResult, "");
            BackIdScanResult backIdScanResult = new BackIdScanResult(idScanResult);
            int i3 = f14849d + 11;
            f14850e = i3 % 128;
            if (i3 % 2 != 0) {
                return backIdScanResult;
            }
            throw null;
        }

        static {
            int i2 = f14848c + 41;
            f14847b = i2 % 128;
            int i3 = i2 % 2;
        }

        d() {
            super(1);
        }
    }

    static final class e extends Lambda implements Function2<IncodeWelcomeRepository, bt, bc> {

        /* JADX INFO: renamed from: a */
        public static final e f14851a = new e();

        /* JADX INFO: renamed from: b */
        private static int f14852b = 1;

        /* JADX INFO: renamed from: c */
        private static int f14853c = 1;

        /* JADX INFO: renamed from: d */
        private static int f14854d = 0;

        /* JADX INFO: renamed from: e */
        private static int f14855e = 0;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ bc invoke(IncodeWelcomeRepository incodeWelcomeRepository, bt btVar) {
            int i2 = 2 % 2;
            int i3 = f14854d + 39;
            f14852b = i3 % 128;
            int i4 = i3 % 2;
            bc bcVarD = d(incodeWelcomeRepository, btVar);
            int i5 = f14854d + 79;
            f14852b = i5 % 128;
            if (i5 % 2 != 0) {
                return bcVarD;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static bc d(IncodeWelcomeRepository incodeWelcomeRepository, bt btVar) {
            int i2 = 2 % 2;
            int i3 = f14852b + 51;
            f14854d = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
                Intrinsics.checkNotNullParameter(btVar, "");
                bc bcVarBlockingFirst = incodeWelcomeRepository.sendBackIdScan(btVar).blockingFirst();
                Intrinsics.checkNotNullExpressionValue(bcVarBlockingFirst, "");
                return bcVarBlockingFirst;
            }
            Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
            Intrinsics.checkNotNullParameter(btVar, "");
            Intrinsics.checkNotNullExpressionValue(incodeWelcomeRepository.sendBackIdScan(btVar).blockingFirst(), "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i2 = f14855e + 69;
            f14853c = i2 % 128;
            int i3 = i2 % 2;
        }

        e() {
            super(2);
        }
    }

    static final class h extends Lambda implements Function2<IncodeWelcomeRepository, IdScanResult, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f14861a = 0;

        /* JADX INFO: renamed from: c */
        private static int f14862c = 1;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ DocumentType f14864e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(IncodeWelcomeRepository incodeWelcomeRepository, IdScanResult idScanResult) {
            int i2 = 2 % 2;
            int i3 = f14862c + 33;
            f14861a = i3 % 128;
            int i4 = i3 % 2;
            e(incodeWelcomeRepository, idScanResult);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                int i5 = 6 / 0;
            }
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void e(com.incode.welcome_sdk.data.IncodeWelcomeRepository r4, com.incode.welcome_sdk.results.IdScanResult r5) {
            /*
                r3 = this;
                r2 = 2
                int r0 = r2 % r2
                int r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository.h.f14862c
                int r1 = r0 + 55
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository.h.f14861a = r0
                int r1 = r1 % r2
                java.lang.String r0 = ""
                if (r1 == 0) goto L36
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository.this
                boolean r1 = com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository.access$isDelayedMode(r0)
                r0 = 47
                int r0 = r0 / 0
                if (r1 == 0) goto L29
            L22:
                com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository r1 = com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository.this
                com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r0 = r3.f14864e
                com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository.access$storeInDelayMode(r1, r5, r0)
            L29:
                r4.persistIdBackResult(r5)
                int r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository.h.f14861a
                int r1 = r0 + 113
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository.h.f14862c = r0
                int r1 = r1 % r2
                return
            L36:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository.this
                boolean r1 = com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository.access$isDelayedMode(r0)
                r0 = 1
                r1 = r1 ^ r0
                if (r1 == r0) goto L29
                goto L22
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository.h.e(com.incode.welcome_sdk.data.IncodeWelcomeRepository, com.incode.welcome_sdk.results.IdScanResult):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(DocumentType documentType) {
            super(2);
            this.f14864e = documentType;
        }
    }

    static final class f extends Lambda implements Function2<IncodeWelcomeRepository, bt, bc> {

        /* JADX INFO: renamed from: a */
        private static int f14856a = 0;

        /* JADX INFO: renamed from: b */
        private static int f14857b = 0;

        /* JADX INFO: renamed from: c */
        private static int f14858c = 1;

        /* JADX INFO: renamed from: d */
        public static final f f14859d = new f();

        /* JADX INFO: renamed from: e */
        private static int f14860e = 1;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ bc invoke(IncodeWelcomeRepository incodeWelcomeRepository, bt btVar) {
            int i2 = 2 % 2;
            int i3 = f14857b + 103;
            f14858c = i3 % 128;
            int i4 = i3 % 2;
            bc bcVarD = d(incodeWelcomeRepository, btVar);
            int i5 = f14857b + 99;
            f14858c = i5 % 128;
            if (i5 % 2 != 0) {
                return bcVarD;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static bc d(IncodeWelcomeRepository incodeWelcomeRepository, bt btVar) {
            int i2 = 2 % 2;
            int i3 = f14858c + 101;
            f14857b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
            Intrinsics.checkNotNullParameter(btVar, "");
            bc bcVarBlockingFirst = incodeWelcomeRepository.sendFrontIdScan(btVar).blockingFirst();
            Intrinsics.checkNotNullExpressionValue(bcVarBlockingFirst, "");
            bc bcVar = bcVarBlockingFirst;
            int i5 = f14858c + 69;
            f14857b = i5 % 128;
            if (i5 % 2 == 0) {
                return bcVar;
            }
            throw null;
        }

        static {
            int i2 = f14860e + 125;
            f14856a = i2 % 128;
            int i3 = i2 % 2;
        }

        f() {
            super(2);
        }
    }

    static final class i extends Lambda implements Function2<IncodeWelcomeRepository, IdScanResult, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f14865a = 0;

        /* JADX INFO: renamed from: d */
        private static int f14866d = 1;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ DocumentType f14868e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(IncodeWelcomeRepository incodeWelcomeRepository, IdScanResult idScanResult) {
            int i2 = 2 % 2;
            int i3 = f14866d + 115;
            f14865a = i3 % 128;
            int i4 = i3 % 2;
            e(incodeWelcomeRepository, idScanResult);
            Unit unit = Unit.INSTANCE;
            int i5 = f14866d + 89;
            f14865a = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void e(IncodeWelcomeRepository incodeWelcomeRepository, IdScanResult idScanResult) {
            int i2 = 2 % 2;
            int i3 = f14866d + 29;
            f14865a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
            Intrinsics.checkNotNullParameter(idScanResult, "");
            IdCaptureRepository idCaptureRepository = IdCaptureRepository.this;
            DocumentType documentType = this.f14868e;
            IdCaptureRepository.access$getIncodeWelcomeRepository$p(idCaptureRepository).persistIdType(idScanResult.getActualIdType(), idScanResult.idCategory);
            if (IdCaptureRepository.access$isDelayedMode(idCaptureRepository)) {
                IdCaptureRepository.access$storeInDelayMode(idCaptureRepository, idScanResult, documentType);
                return;
            }
            if (!IdCaptureRepository.access$isCaptureOnlyMode(idCaptureRepository)) {
                IdCategory idCategory = idScanResult.idCategory;
                Intrinsics.checkNotNull(idCategory);
                idScanResult.croppedFacePath = IdCaptureRepository.access$extractFaceCropIfNeeded(idCaptureRepository, idCategory);
            }
            incodeWelcomeRepository.persistIdFrontResult(idScanResult);
            int i5 = f14865a + 35;
            f14866d = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(DocumentType documentType) {
            super(2);
            this.f14868e = documentType;
        }
    }

    static final class j extends Lambda implements Function1<IdScanResult, BaseResult> {

        /* JADX INFO: renamed from: a */
        private static int f14869a = 1;

        /* JADX INFO: renamed from: b */
        public static final j f14870b = new j();

        /* JADX INFO: renamed from: c */
        private static int f14871c = 0;

        /* JADX INFO: renamed from: d */
        private static int f14872d = 0;

        /* JADX INFO: renamed from: e */
        private static int f14873e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ BaseResult invoke(IdScanResult idScanResult) {
            int i2 = 2 % 2;
            int i3 = f14872d + 3;
            f14869a = i3 % 128;
            int i4 = i3 % 2;
            BaseResult baseResultC = c(idScanResult);
            int i5 = f14872d + 101;
            f14869a = i5 % 128;
            if (i5 % 2 != 0) {
                return baseResultC;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static BaseResult c(IdScanResult idScanResult) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(idScanResult, "");
            FrontIdScanResult frontIdScanResult = new FrontIdScanResult(idScanResult);
            int i3 = f14872d + 69;
            f14869a = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 35 / 0;
            }
            return frontIdScanResult;
        }

        static {
            int i2 = f14871c + 87;
            f14873e = i2 % 128;
            int i3 = i2 % 2;
        }

        j() {
            super(1);
        }
    }

    public final Object storeAndUpload(IdScan.IdType idType, DocumentType documentType, com.incode.welcome_sdk.data.remote.beans.f fVar, Bitmap bitmap, int i2, Continuation<? super IdScanResult> continuation) {
        int i3 = 2 % 2;
        int i4 = f14796p + 37;
        f14795n = i4 % 128;
        int i5 = i4 % 2;
        if (documentType == DocumentType.BACK_ID) {
            Object objC = c(bitmap, idType, fVar, documentType, e.f14851a, d.f14846a, new h(documentType), i2, continuation);
            int i6 = f14796p + 23;
            f14795n = i6 % 128;
            if (i6 % 2 == 0) {
                return objC;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        return c(bitmap, idType, fVar, documentType, f.f14859d, j.f14870b, new i(documentType), i2, continuation);
    }

    private final void b(IdScanResult idScanResult, DocumentType documentType) {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f14796p + 5;
        f14795n = i3 % 128;
        if (i3 % 2 == 0) {
            com.incode.welcome_sdk.c cVar = this.f14799a;
            String str = idScanResult.idImagePath;
            String strName = idScanResult.getActualIdType().name();
            if (idScanResult.idCategory == IdCategory.SECOND) {
                int i4 = f14796p + 29;
                f14795n = i4 % 128;
                int i5 = i4 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            cVar.d(str, strName, z2, DocumentTypeExtensionsKt.toValidationPhase(documentType));
            return;
        }
        String str2 = idScanResult.idImagePath;
        idScanResult.getActualIdType().name();
        IdCategory idCategory = idScanResult.idCategory;
        IdCategory idCategory2 = IdCategory.SECOND;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean shouldPublishDummyResultInTestMode() {
        int i2 = 2 % 2;
        int i3 = f14795n + 59;
        f14796p = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcome incodeWelcome = this.f14801c;
        if (i4 != 0) {
            return incodeWelcome.isTestMode();
        }
        incodeWelcome.isTestMode();
        throw null;
    }

    public final void publishDummyResult() {
        int i2 = 2 % 2;
        com.incode.welcome_sdk.b.publish(new IdScanCompleted(ResultCode.EMULATOR_DETECTED, null, 2, null));
        int i3 = f14795n + 103;
        f14796p = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void reportTerminalError(Throwable th) {
        int i2 = 2 % 2;
        com.incode.welcome_sdk.b.publish(new IdScanCompleted(ResultCode.ERROR, th));
        int i3 = f14795n + 109;
        f14796p = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void completeIdCapture() {
        int i2 = 2 % 2;
        com.incode.welcome_sdk.b.publish(new IdScanCompleted(ResultCode.SUCCESS, null, 2, null));
        int i3 = f14795n + 19;
        f14796p = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 28 / 0;
        }
    }

    public final int getAutoCaptureTimeoutSinceFirstClassificationInSeconds() {
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = f14796p + 81;
        f14795n = i4 % 128;
        if (i4 % 2 != 0) {
            this.f14800b.getAutoCaptureTimeout();
            this.f14802d.d();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int autoCaptureTimeout = this.f14800b.getAutoCaptureTimeout();
        if (this.f14802d.d()) {
            int i5 = f14795n + 21;
            f14796p = i5 % 128;
            int i6 = i5 % 2;
        } else {
            i2 = 1;
        }
        return autoCaptureTimeout * i2;
    }

    public final boolean isAgeAssuranceUXEnabled() {
        int i2 = 2 % 2;
        int i3 = f14796p + 111;
        f14795n = i3 % 128;
        int i4 = i3 % 2;
        boolean zIsAgeAssuranceUXEnabled = this.f14801c.getInternalConfig().isAgeAssuranceUXEnabled();
        int i5 = f14796p + 45;
        f14795n = i5 % 128;
        int i6 = i5 % 2;
        return zIsAgeAssuranceUXEnabled;
    }

    public final IncodeUXConfig getUXConfig() {
        int i2 = 2 % 2;
        int i3 = f14796p + 93;
        f14795n = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcome.InternalConfig internalConfig = this.f14801c.getInternalConfig();
        if (i4 == 0) {
            return internalConfig.getUxConfig();
        }
        internalConfig.getUxConfig();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean showCloseButton() {
        int i2 = 2 % 2;
        int i3 = f14795n + 113;
        f14796p = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.f14801c.getInternalConfig().isShowCloseButton();
            obj.hashCode();
            throw null;
        }
        boolean zIsShowCloseButton = this.f14801c.getInternalConfig().isShowCloseButton();
        int i4 = f14795n + 81;
        f14796p = i4 % 128;
        if (i4 % 2 != 0) {
            return zIsShowCloseButton;
        }
        obj.hashCode();
        throw null;
    }

    public static final class RetryCounter {

        /* JADX INFO: renamed from: d */
        private static int f14812d = 0;

        /* JADX INFO: renamed from: e */
        private static int f14813e = 1;

        /* JADX INFO: renamed from: a */
        private int f14814a;

        /* JADX INFO: renamed from: b */
        private final int f14815b;

        /* JADX INFO: renamed from: c */
        private final IncodeWelcomeRepository f14816c;

        public RetryCounter(IncodeWelcomeRepository incodeWelcomeRepository, int i2) {
            Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
            this.f14816c = incodeWelcomeRepository;
            this.f14815b = i2;
        }

        public final void increaseAttemptCount() {
            int i2 = 2 % 2;
            int i3 = f14812d + 93;
            int i4 = i3 % 128;
            f14813e = i4;
            int i5 = i3 % 2;
            this.f14814a++;
            int i6 = i4 + 5;
            f14812d = i6 % 128;
            int i7 = i6 % 2;
        }

        public final void resetCounter() {
            int i2 = 2 % 2;
            int i3 = f14812d + 85;
            int i4 = i3 % 128;
            f14813e = i4;
            int i5 = i3 % 2;
            this.f14814a = 0;
            int i6 = i4 + 43;
            f14812d = i6 % 128;
            int i7 = i6 % 2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:52:0x006b, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.first(r0, r6) == r5) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x006d, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0083, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.first(r0, r6) == r5) goto L53;
         */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0086  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object checkCounterAndSendSignalForManualIdCheckIfNeeded(kotlin.coroutines.Continuation<? super java.lang.Boolean> r9) {
            /*
                r8 = this;
                r7 = 2
                int r0 = r7 % r7
                int r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository.RetryCounter.f14813e
                int r1 = r0 + 111
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository.RetryCounter.f14812d = r0
                int r1 = r1 % r7
                if (r1 != 0) goto L99
                boolean r0 = r9 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository.RetryCounter.e
                if (r0 == 0) goto L86
                r6 = r9
                com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository$RetryCounter$e r6 = (com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository.RetryCounter.e) r6
                int r0 = r6.f14821e
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L86
                int r0 = r6.f14821e
                int r0 = r0 - r1
                r6.f14821e = r0
                int r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository.RetryCounter.f14812d
                int r1 = r0 + 35
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository.RetryCounter.f14813e = r0
                int r1 = r1 % r7
            L2a:
                java.lang.Object r1 = r6.f14819b
                java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r6.f14821e
                r4 = 1
                if (r0 == 0) goto L3f
                if (r0 != r4) goto L8c
                kotlin.ResultKt.throwOnFailure(r1)
            L3a:
                java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
                return r0
            L3f:
                kotlin.ResultKt.throwOnFailure(r1)
                int r1 = r8.f14814a
                int r0 = r8.f14815b
                r3 = 0
                if (r1 < r0) goto L94
                int r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository.RetryCounter.f14812d
                int r2 = r0 + 55
                int r0 = r2 % 128
                com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository.RetryCounter.f14813e = r0
                int r2 = r2 % r7
                java.lang.String r1 = ""
                if (r2 != 0) goto L6e
                com.incode.welcome_sdk.data.IncodeWelcomeRepository r0 = r8.f14816c
                io.reactivex.Observable r0 = r0.setManualIdCheckNeeded(r4)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                io.reactivex.ObservableSource r0 = (io.reactivex.ObservableSource) r0
                kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.rx2.RxConvertKt.asFlow(r0)
                r6.f14821e = r3
                java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.first(r0, r6)
                if (r0 != r5) goto L3a
            L6d:
                return r5
            L6e:
                com.incode.welcome_sdk.data.IncodeWelcomeRepository r0 = r8.f14816c
                io.reactivex.Observable r0 = r0.setManualIdCheckNeeded(r4)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                io.reactivex.ObservableSource r0 = (io.reactivex.ObservableSource) r0
                kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.rx2.RxConvertKt.asFlow(r0)
                r6.f14821e = r4
                java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.first(r0, r6)
                if (r0 != r5) goto L3a
                goto L6d
            L86:
                com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository$RetryCounter$e r6 = new com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository$RetryCounter$e
                r6.<init>(r9)
                goto L2a
            L8c:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            L94:
                java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
                return r0
            L99:
                boolean r0 = r9 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository.RetryCounter.e
                r0 = 0
                r0.hashCode()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository.RetryCounter.checkCounterAndSendSignalForManualIdCheckIfNeeded(kotlin.coroutines.Continuation):java.lang.Object");
        }

        static final class e extends ContinuationImpl {

            /* JADX INFO: renamed from: a */
            private static int f14817a = 0;

            /* JADX INFO: renamed from: c */
            private static int f14818c = 1;

            /* JADX INFO: renamed from: b */
            /* synthetic */ Object f14819b;

            /* JADX INFO: renamed from: e */
            int f14821e;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objCheckCounterAndSendSignalForManualIdCheckIfNeeded;
                int i2 = 2 % 2;
                int i3 = f14818c + 11;
                f14817a = i3 % 128;
                int i4 = i3 % 2;
                this.f14819b = obj;
                this.f14821e |= Integer.MIN_VALUE;
                RetryCounter retryCounter = RetryCounter.this;
                if (i4 != 0) {
                    objCheckCounterAndSendSignalForManualIdCheckIfNeeded = retryCounter.checkCounterAndSendSignalForManualIdCheckIfNeeded(this);
                    int i5 = 15 / 0;
                } else {
                    objCheckCounterAndSendSignalForManualIdCheckIfNeeded = retryCounter.checkCounterAndSendSignalForManualIdCheckIfNeeded(this);
                }
                int i6 = f14817a + 87;
                f14818c = i6 % 128;
                if (i6 % 2 != 0) {
                    return objCheckCounterAndSendSignalForManualIdCheckIfNeeded;
                }
                throw null;
            }

            e(Continuation<? super e> continuation) {
                super(continuation);
            }
        }
    }

    static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: a */
        private static int f14825a = 0;

        /* JADX INFO: renamed from: j */
        private static int f14826j = 1;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Bitmap f14827b;

        /* JADX INFO: renamed from: c */
        private int f14828c;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ cb f14829d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f14826j + 49;
            f14825a = i3 % 128;
            if (i3 % 2 != 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.f14828c;
            try {
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Observable<ResponseSuccess> observableSendZoomedFrame = IdCaptureRepository.access$getIncodeWelcomeRepository$p(IdCaptureRepository.this).sendZoomedFrame(this.f14829d.name(), com.incode.camera.commons.utils.BitmapUtils.INSTANCE.toBase64(this.f14827b));
                    Intrinsics.checkNotNullExpressionValue(observableSendZoomedFrame, "");
                    this.f14828c = 1;
                    if (RxAwaitKt.awaitFirst(observableSendZoomedFrame, this) == coroutine_suspended) {
                        int i5 = f14826j + 31;
                        int i6 = i5 % 128;
                        f14825a = i6;
                        int i7 = i5 % 2;
                        int i8 = i6 + 23;
                        f14826j = i8 % 128;
                        int i9 = i8 % 2;
                        return coroutine_suspended;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                int i10 = f14825a + 19;
                f14826j = i10 % 128;
                int i11 = i10 % 2;
            } catch (Exception unused) {
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f14826j + 25;
            f14825a = i3 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i3 % 2 == 0) {
                return c(coroutineScope2, continuation2);
            }
            c(coroutineScope2, continuation2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private Object c(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f14826j + 65;
            f14825a = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f14826j + 55;
            f14825a = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            b bVar = IdCaptureRepository.this.new b(this.f14829d, this.f14827b, continuation);
            int i3 = f14825a + 27;
            f14826j = i3 % 128;
            int i4 = i3 % 2;
            return bVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(cb cbVar, Bitmap bitmap, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f14829d = cbVar;
            this.f14827b = bitmap;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void sendZoomedFrameIfNeeded$onboard_release(com.incode.welcome_sdk.data.remote.beans.cb r12, android.graphics.Bitmap r13) {
        /*
            r11 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository.f14795n
            int r2 = r0 + 119
            int r0 = r2 % 128
            com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository.f14796p = r0
            int r2 = r2 % r3
            r0 = 0
            java.lang.String r1 = ""
            if (r2 != 0) goto L5d
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
            java.lang.Object[] r5 = new java.lang.Object[]{r11}
            int r4 = com.incode.welcome_sdk.listeners.CommonBaseListener.e()
            int r6 = com.incode.welcome_sdk.listeners.CommonBaseListener.e()
            int r9 = com.incode.welcome_sdk.listeners.CommonBaseListener.e()
            int r8 = com.incode.welcome_sdk.listeners.CommonBaseListener.e()
            r10 = -403655048(0xffffffffe7f0b678, float:-2.2734678E24)
            r7 = 403655048(0x180f4988, float:1.851944E-24)
            java.lang.Object r1 = a(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r2 = r1.booleanValue()
            r1 = 92
            int r1 = r1 / 0
            if (r2 == 0) goto L51
        L41:
            kotlinx.coroutines.CoroutineScope r4 = r11.f14808j
            com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository$b r7 = new com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository$b
            r7.<init>(r12, r13, r0)
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            r8 = 3
            r9 = 0
            r5 = 0
            r6 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r4, r5, r6, r7, r8, r9)
        L51:
            int r1 = com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository.f14796p
            int r2 = r1 + 17
            int r1 = r2 % 128
            com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository.f14795n = r1
            int r2 = r2 % r3
            if (r2 != 0) goto L8a
            return
        L5d:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
            java.lang.Object[] r5 = new java.lang.Object[]{r11}
            int r4 = com.incode.welcome_sdk.listeners.CommonBaseListener.e()
            int r6 = com.incode.welcome_sdk.listeners.CommonBaseListener.e()
            int r9 = com.incode.welcome_sdk.listeners.CommonBaseListener.e()
            int r8 = com.incode.welcome_sdk.listeners.CommonBaseListener.e()
            r10 = -403655048(0xffffffffe7f0b678, float:-2.2734678E24)
            r7 = 403655048(0x180f4988, float:1.851944E-24)
            java.lang.Object r1 = a(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L51
            goto L41
        L8a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository.sendZoomedFrameIfNeeded$onboard_release(com.incode.welcome_sdk.data.remote.beans.cb, android.graphics.Bitmap):void");
    }

    public final boolean isIdealEnvironmentTestEnabled() {
        int i2 = 2 % 2;
        int i3 = f14796p + 93;
        f14795n = i3 % 128;
        return i3 % 2 == 0;
    }

    public final boolean isRecordingMandatory() {
        int i2 = 2 % 2;
        int i3 = f14795n + 91;
        f14796p = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcome.InternalConfig internalConfig = this.f14801c.getInternalConfig();
        if (i4 != 0) {
            return internalConfig.isRecordSessionMandatory();
        }
        internalConfig.isRecordSessionMandatory();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object a(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) throws Throwable {
        int i8 = ~i4;
        int i9 = ~i7;
        int i10 = ~i2;
        int i11 = (~(i9 | i10)) | i8;
        int i12 = ~(i7 | i4);
        int i13 = i2 | i12;
        int i14 = (~(i2 | i4)) | (~(i8 | i9 | i10)) | i12 | (~(i7 | i2));
        int i15 = i7 + i4 + i3 + (1272450877 * i6) + ((-51365948) * i5);
        int i16 = i15 * i15;
        int i17 = ((-261444822) * i7) + 922746880 + ((-1437248296) * i4) + ((-1175803474) * i11) + (i13 * 587901737) + (587901737 * i14) + ((-849346560) * i3) + ((-1881145344) * i6) + ((-578813952) * i5) + ((-124846080) * i16);
        int i18 = (i7 * 1187242746) + 1002376400 + (i4 * 1187242392) + (i11 * (-354)) + (i13 * 177) + (i14 * 177) + (i3 * 1187242569) + (i6 * (-1484311963)) + (i5 * 1141305060) + (i16 * 516358144);
        if (i17 + (i18 * i18 * (-861863936)) != 1) {
            IdCaptureRepository idCaptureRepository = (IdCaptureRepository) objArr[0];
            int i19 = 2 % 2;
            if (!idCaptureRepository.b()) {
                int i20 = f14796p + 61;
                f14795n = i20 % 128;
                int i21 = i20 % 2;
                if (!idCaptureRepository.a()) {
                    int i22 = f14796p + 97;
                    f14795n = i22 % 128;
                    int i23 = i22 % 2;
                    return true;
                }
            }
            int i24 = f14795n + 57;
            f14796p = i24 % 128;
            int i25 = i24 % 2;
            return false;
        }
        IdCaptureRepository idCaptureRepository2 = (IdCaptureRepository) objArr[0];
        bc bcVar = (bc) objArr[1];
        if (idCaptureRepository2.f14804f.d()) {
            idCaptureRepository2.d().increaseAttemptCount();
        }
        if (bcVar.d()) {
            if (bcVar.b() < 20) {
                throw new IdCaptureUploadError.Glare();
            }
            if (bcVar.a() < 20) {
                throw new IdCaptureUploadError.Blur();
            }
            if (bcVar.f9401e > 1.0d) {
                throw new IdCaptureUploadError.Shadow();
            }
            if (!bcVar.e()) {
                throw new IdCaptureUploadError.Readability();
            }
            com.incode.welcome_sdk.data.remote.beans.d dVarI = bcVar.i();
            String strD = dVarI.d();
            if (dVarI.b()) {
                idCaptureRepository2.f14801c.setBiometricConsentContent(idCaptureRepository2.f14806h.fetchBiometricConsent(strD).blockingFirst());
            }
            return null;
        }
        String strG = bcVar.g();
        String str = "";
        if (strG != null) {
            String upperCase = strG.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            if (upperCase != null) {
                str = upperCase;
            }
        }
        Object[] objArr2 = new Object[1];
        q("㶟㷈俻嫠\udc6f렳\uf6b2棼螦ヒ襀\u1316鞔\ue524∥淀슽丁\udf13뢲楆㍽觕", -ImageFormat.getBitsPerPixel(0), objArr2);
        if (Intrinsics.areEqual(str, ((String) objArr2[0]).intern())) {
            throw new IdCaptureUploadError.WrongSide();
        }
        Object[] objArr3 = new Object[1];
        q("勰効슎힃ᆤ獝㭩ލ䳒붾䒚\ud872\uf8ed桜\ueff2ꚲ귟썳\u12c7珁ء븘䐇\ud8fc", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr3);
        if (!Intrinsics.areEqual(str, ((String) objArr3[0]).intern())) {
            throw new IdCaptureUploadError.NoDocumentDetected();
        }
        String strH = bcVar.h();
        List<com.incode.welcome_sdk.data.remote.beans.c> listN = bcVar.n();
        if (listN == null) {
            listN = CollectionsKt.emptyList();
        }
        throw new IdCaptureUploadError.UnacceptableId(strH, listN);
    }

    static void e() {
        f14794l = -3221633879970106811L;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f14797s = 0;
        f14798t = 1;
        f14795n = 0;
        f14796p = 1;
        e();
        int i2 = f14798t + 11;
        f14797s = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: k */
        private static int f14831k = 0;

        /* JADX INFO: renamed from: m */
        private static int f14832m = 1;

        /* JADX INFO: renamed from: a */
        Object f14833a;

        /* JADX INFO: renamed from: b */
        Object f14834b;

        /* JADX INFO: renamed from: c */
        Object f14835c;

        /* JADX INFO: renamed from: d */
        Object f14836d;

        /* JADX INFO: renamed from: e */
        Object f14837e;

        /* JADX INFO: renamed from: f */
        int f14838f;

        /* JADX INFO: renamed from: g */
        Object f14839g;

        /* JADX INFO: renamed from: h */
        Object f14840h;

        /* JADX INFO: renamed from: i */
        Object f14841i;

        /* JADX INFO: renamed from: j */
        Object f14842j;

        /* JADX INFO: renamed from: l */
        /* synthetic */ Object f14843l;

        /* JADX INFO: renamed from: o */
        int f14845o;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f14831k + 69;
            f14832m = i3 % 128;
            int i4 = i3 % 2;
            this.f14843l = obj;
            this.f14845o |= Integer.MIN_VALUE;
            Object objAccess$processAndReturnResult = IdCaptureRepository.access$processAndReturnResult(IdCaptureRepository.this, null, null, null, null, null, null, null, 0, this);
            int i5 = f14831k + 57;
            f14832m = i5 % 128;
            int i6 = i5 % 2;
            return objAccess$processAndReturnResult;
        }

        c(Continuation<? super c> continuation) {
            super(continuation);
        }
    }

    private final boolean c() {
        return ((Boolean) a(CommonBaseListener.e(), new Object[]{this}, CommonBaseListener.e(), 403655048, CommonBaseListener.e(), CommonBaseListener.e(), -403655048)).booleanValue();
    }

    private final void d(bc bcVar) throws Throwable {
        a(CommonBaseListener.e(), new Object[]{this, bcVar}, CommonBaseListener.e(), 1842837981, CommonBaseListener.e(), CommonBaseListener.e(), -1842837980);
    }

    public static /* synthetic */ void getMetadataBuilder$annotations() {
        int i2 = 2 % 2;
        int i3 = f14795n + 45;
        f14796p = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
