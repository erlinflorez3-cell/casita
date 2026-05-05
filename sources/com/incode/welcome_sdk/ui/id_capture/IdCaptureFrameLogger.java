package com.incode.welcome_sdk.ui.id_capture;

import android.graphics.Color;
import android.graphics.Point;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.camera.analysis.document.CaptureInfo;
import com.incode.camera.analysis.document.DocumentAnalysisEvent;
import com.incode.camera.analysis.document.DocumentAnalyzer;
import com.incode.camera.commons.utils.Side;
import com.incode.recogkitandroid.IdCaptureKitAndroid;
import com.incode.welcome_sdk.commons.extensions.e;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.commons.utils.IdCaptureKitUtils;
import com.incode.welcome_sdk.data.EventValues;
import com.incode.welcome_sdk.data.IdScanFrameLogs;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class IdCaptureFrameLogger {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: j */
    private static int[] f14760j = null;

    /* JADX INFO: renamed from: k */
    private static int f14761k = 0;

    /* JADX INFO: renamed from: m */
    private static int f14762m = 0;

    /* JADX INFO: renamed from: n */
    private static int f14763n = 0;

    /* JADX INFO: renamed from: o */
    private static int f14764o = 0;

    /* JADX INFO: renamed from: a */
    private final IncodeWelcomeRepository f14765a;

    /* JADX INFO: renamed from: b */
    private DocumentType f14766b;

    /* JADX INFO: renamed from: c */
    private final DocumentAnalyzer.Config f14767c;

    /* JADX INFO: renamed from: d */
    private final IdCaptureKitAndroid f14768d;

    /* JADX INFO: renamed from: e */
    private final IdScan f14769e;

    /* JADX INFO: renamed from: f */
    private long f14770f;

    /* JADX INFO: renamed from: g */
    private boolean f14771g;

    /* JADX INFO: renamed from: h */
    private final List<IdScanFrameLogs.e> f14772h;

    /* JADX INFO: renamed from: i */
    private int f14773i;

    private static String $$c(int i2, byte b2, int i3) {
        int i4 = 99 - i2;
        byte[] bArr = $$a;
        int i5 = (i3 * 2) + 4;
        int i6 = b2 * 2;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        int i8 = -1;
        if (bArr == null) {
            i5++;
            i4 = (-i4) + i5;
        }
        while (true) {
            i8++;
            bArr2[i8] = (byte) i4;
            if (i8 == i7) {
                return new String(bArr2, 0);
            }
            byte b3 = bArr[i5];
            i5++;
            i4 = (-b3) + i4;
        }
    }

    static void init$0() {
        $$a = new byte[]{71, -70, 54, 33};
        $$b = 133;
    }

    public IdCaptureFrameLogger(IncodeWelcomeRepository incodeWelcomeRepository, IdScan idScan, DocumentAnalyzer.Config config, IdCaptureKitAndroid idCaptureKitAndroid) {
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(idScan, "");
        Intrinsics.checkNotNullParameter(config, "");
        Intrinsics.checkNotNullParameter(idCaptureKitAndroid, "");
        this.f14765a = incodeWelcomeRepository;
        this.f14769e = idScan;
        this.f14767c = config;
        this.f14768d = idCaptureKitAndroid;
        this.f14772h = new ArrayList();
    }

    public final void reset() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f14763n + 81;
        f14762m = i3 % 128;
        if (i3 % 2 != 0) {
            this.f14770f = c();
            z2 = true;
        } else {
            this.f14770f = c();
            z2 = false;
        }
        this.f14771g = z2;
        this.f14772h.clear();
        int i4 = f14763n + 51;
        f14762m = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void addFrameLogAndSendConditionally(DocumentType documentType, CaptureInfo captureInfo, DocumentAnalysisEvent documentAnalysisEvent, boolean z2) {
        Intrinsics.checkNotNullParameter(documentType, "");
        Intrinsics.checkNotNullParameter(captureInfo, "");
        Intrinsics.checkNotNullParameter(documentAnalysisEvent, "");
        if (documentType != this.f14766b) {
            this.f14766b = documentType;
            reset();
        }
        Long lValueOf = Long.valueOf(c());
        String strName = documentType.name();
        Float brightness = captureInfo.getBrightness();
        Float cls = captureInfo.getCls();
        List<Point> quad = captureInfo.getQuad();
        Float blur = captureInfo.getBlur();
        Float glare = captureInfo.getGlare();
        Side side = captureInfo.getSide();
        String strName2 = side != null ? side.name() : null;
        Float score = captureInfo.getScore();
        Integer detectionWidth = captureInfo.getDetectionWidth();
        Integer minDetectionWidth = captureInfo.getMinDetectionWidth();
        Integer maxDetectionWidth = captureInfo.getMaxDetectionWidth();
        String strE = e(documentAnalysisEvent);
        Boolean boolValueOf = Boolean.valueOf(z2);
        Boolean boolIsVertical = captureInfo.isVertical();
        d(new IdScanFrameLogs.e(lValueOf, strName, brightness, cls, quad, blur, glare, strName2, score, detectionWidth, minDetectionWidth, maxDetectionWidth, strE, boolValueOf, boolIsVertical != null ? Boolean.valueOf(e.b(boolIsVertical)) : null, captureInfo.getFrontScore(), captureInfo.getBackScore(), captureInfo.getIdScore(), captureInfo.getPassportScore(), captureInfo.getIdType()));
        if (documentAnalysisEvent instanceof DocumentAnalysisEvent.CaptureCandidateGenerated) {
            Float score2 = ((DocumentAnalysisEvent.CaptureCandidateGenerated) documentAnalysisEvent).getCaptureInfo().getScore();
            Intrinsics.checkNotNull(score2);
            c(score2.floatValue(), documentType);
        }
    }

    private static String e(DocumentAnalysisEvent documentAnalysisEvent) {
        int i2 = 2 % 2;
        int i3 = f14763n + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        int i4 = i3 % 128;
        f14762m = i4;
        int i5 = i3 % 2;
        if (documentAnalysisEvent instanceof DocumentAnalysisEvent.AnalysisAbortEvent) {
            int i6 = i4 + 87;
            f14763n = i6 % 128;
            int i7 = i6 % 2;
            return ((DocumentAnalysisEvent.AnalysisAbortEvent) documentAnalysisEvent).getDescription();
        }
        if (documentAnalysisEvent instanceof DocumentAnalysisEvent.CaptureCandidateGenerated) {
            return "completed";
        }
        int i8 = i4 + 53;
        f14763n = i8 % 128;
        int i9 = i8 % 2;
        return null;
    }

    private final void c(float f2, DocumentType documentType) throws Throwable {
        String strIntern;
        int i2 = 2 % 2;
        int i3 = WhenMappings.f14774c[documentType.ordinal()];
        if (i3 == 1 || i3 == 2) {
            Object[] objArr = new Object[1];
            l(new int[]{944479026, 323621552, 1349791785, 929147004}, 5 - View.combineMeasuredStates(0, 0), objArr);
            strIntern = ((String) objArr[0]).intern();
            int i4 = f14762m + 23;
            f14763n = i4 % 128;
            int i5 = i4 % 2;
        } else if (i3 != 3) {
            int i6 = f14762m + 39;
            f14763n = i6 % 128;
            int i7 = i6 % 2;
            strIntern = null;
        } else {
            Object[] objArr2 = new Object[1];
            l(new int[]{1848647292, -1539360503}, 4 - ((Process.getThreadPriority(0) + 20) >> 6), objArr2);
            strIntern = ((String) objArr2[0]).intern();
        }
        EventUtils.supportSendEvent(this.f14765a, "CAPTURE_ATTEMPT_FINISHED", Modules.ID, MapsKt.hashMapOf(TuplesKt.to(EventValues.LOGS.getValue(), new IdScanFrameLogs(IdCaptureKitUtils.getModelVersion(this.f14768d), this.f14770f, c(), Boolean.valueOf(this.f14769e.isEnabledBackShownAsFrontCheck()), Boolean.valueOf(this.f14769e.isEnabledBackShownAsFrontCheck()), Float.valueOf(f2), Boolean.valueOf(this.f14771g), Boolean.valueOf(e(documentType)), null, new IdScanFrameLogs.d(strIntern, Float.valueOf(this.f14767c.getLightMinThreshold()), this.f14767c.getBlurThreshold(), Float.valueOf(this.f14767c.getClassificationThreshold()), this.f14767c.getGlareThreshold(), this.f14767c.getSideThreshold(), this.f14767c.getIouThreshold()), this.f14772h, 256, null).toJson())));
    }

    private final boolean e(DocumentType documentType) {
        int i2 = 2 % 2;
        int i3 = f14762m + 93;
        f14763n = i3 % 128;
        int i4 = i3 % 2;
        if (documentType != DocumentType.BACK_ID) {
            return false;
        }
        int i5 = f14762m + 23;
        f14763n = i5 % 128;
        if (i5 % 2 != 0) {
            return this.f14765a.isSkipGlareBackId();
        }
        this.f14765a.isSkipGlareBackId();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static long c() {
        int i2 = 2 % 2;
        long time = new Date().getTime();
        int i3 = f14763n + 19;
        f14762m = i3 % 128;
        if (i3 % 2 == 0) {
            return time;
        }
        throw null;
    }

    private static void l(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        com.c.a.e eVar = new com.c.a.e();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f14760j;
        int i4 = 1605946101;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = $10 + 35;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                    Object objC = com.c.a.e.e.c(i4);
                    if (objC == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objC = com.c.a.e.e.e((char) View.MeasureSpec.getSize(0), 19 - View.MeasureSpec.getMode(0), 554 - (ViewConfiguration.getPressedStateDuration() >> 16), 1596115084, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objC).invoke(null, objArr2)).intValue();
                    i8++;
                    i4 = 1605946101;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f14760j;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i9])};
                Object objC2 = com.c.a.e.e.c(1605946101);
                if (objC2 == null) {
                    byte b4 = (byte) i5;
                    byte b5 = b4;
                    objC2 = com.c.a.e.e.e((char) ((Process.getThreadPriority(i5) + 20) >> 6), 19 - Color.argb(i5, i5, i5, i5), 554 - (ViewConfiguration.getScrollBarSize() >> 8), 1596115084, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                }
                iArr6[i9] = ((Integer) ((Method) objC2).invoke(null, objArr3)).intValue();
                i9++;
                i5 = 0;
            }
            int i10 = $11 + 43;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            iArr5 = iArr6;
            i5 = 0;
        }
        System.arraycopy(iArr5, i5, iArr4, i5, length2);
        eVar.f2735a = i5;
        while (eVar.f2735a < iArr.length) {
            cArr[i5] = (char) (iArr[eVar.f2735a] >> 16);
            cArr[1] = (char) iArr[eVar.f2735a];
            cArr[2] = (char) (iArr[eVar.f2735a + 1] >> 16);
            cArr[3] = (char) iArr[eVar.f2735a + 1];
            eVar.f2736c = (cArr[0] << 16) + cArr[1];
            eVar.f2737d = (cArr[2] << 16) + cArr[3];
            com.c.a.e.b(iArr4);
            int i12 = 0;
            for (int i13 = 16; i12 < i13; i13 = 16) {
                eVar.f2736c ^= iArr4[i12];
                Object[] objArr4 = {eVar, Integer.valueOf(com.c.a.e.c(eVar.f2736c)), eVar, eVar};
                Object objC3 = com.c.a.e.e.c(-190252621);
                if (objC3 == null) {
                    char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                    int iIndexOf = 18 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    int iNormalizeMetaState = 167 - KeyEvent.normalizeMetaState(0);
                    byte b6 = (byte) ($$b & 3);
                    byte b7 = (byte) (b6 - 1);
                    objC3 = com.c.a.e.e.e(longPressTimeout, iIndexOf, iNormalizeMetaState, -197985334, false, $$c(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objC3).invoke(null, objArr4)).intValue();
                eVar.f2736c = eVar.f2737d;
                eVar.f2737d = iIntValue;
                i12++;
            }
            int i14 = eVar.f2736c;
            eVar.f2736c = eVar.f2737d;
            eVar.f2737d = i14;
            eVar.f2737d ^= iArr4[16];
            eVar.f2736c ^= iArr4[17];
            int i15 = eVar.f2736c;
            int i16 = eVar.f2737d;
            cArr[0] = (char) (eVar.f2736c >>> 16);
            cArr[1] = (char) eVar.f2736c;
            cArr[2] = (char) (eVar.f2737d >>> 16);
            cArr[3] = (char) eVar.f2737d;
            com.c.a.e.b(iArr4);
            cArr2[eVar.f2735a * 2] = cArr[0];
            cArr2[(eVar.f2735a * 2) + 1] = cArr[1];
            cArr2[(eVar.f2735a * 2) + 2] = cArr[2];
            cArr2[(eVar.f2735a * 2) + 3] = cArr[3];
            Object[] objArr5 = {eVar, eVar};
            Object objC4 = com.c.a.e.e.c(-1176571471);
            if (objC4 == null) {
                objC4 = com.c.a.e.e.e((char) (Color.red(0) + 42780), Color.red(0) + 16, 134 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1186663480, false, "a", new Class[]{Object.class, Object.class});
            }
            ((Method) objC4).invoke(null, objArr5);
            i5 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private final void d(IdScanFrameLogs.e eVar) {
        int i2 = 2 % 2;
        int i3 = f14762m + 63;
        f14763n = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            byte[] bytes = eVar.toString().getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            int length = bytes.length;
            if (this.f14773i < length) {
                this.f14773i = length;
            }
            if (this.f14772h.size() * this.f14773i >= 51200) {
                int i4 = f14763n + 107;
                f14762m = i4 % 128;
                if (i4 % 2 != 0) {
                    CollectionsKt.removeFirst(this.f14772h);
                    this.f14771g = false;
                } else {
                    CollectionsKt.removeFirst(this.f14772h);
                    this.f14771g = true;
                }
            }
            Timber.Forest.d(StringsKt.trimMargin$default("\n            | frameLogsData count: " + this.f14772h.size() + ",\n            | approx size: " + (this.f14772h.size() * this.f14773i) + "\n            | isFrameLogsOutputTruncated = " + this.f14771g + "\n            | \n            | ", null, 1, null), new Object[0]);
            this.f14772h.add(eVar);
            return;
        }
        byte[] bytes2 = eVar.toString().getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes2, "");
        int length2 = bytes2.length;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f14774c;

        /* JADX INFO: renamed from: d */
        private static int f14775d = 1;

        /* JADX INFO: renamed from: e */
        private static int f14776e = 0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.FRONT_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.PASSPORT.ordinal()] = 2;
                int i2 = f14775d + 75;
                f14776e = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentType.BACK_ID.ordinal()] = 3;
                int i4 = f14775d + 43;
                f14776e = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            f14774c = iArr;
        }
    }

    static void d() {
        f14760j = new int[]{1659784800, -572637103, 1776534325, 1028550722, 1833115655, 1200669304, 1459729651, -1890997719, -1301123973, -479631486, 1535223162, -1010634793, 1372506969, -1233968007, 116618875, -329448246, -749014038, -146644128};
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f14761k = 0;
        f14764o = 1;
        f14762m = 0;
        f14763n = 1;
        d();
        int i2 = f14761k + 23;
        f14764o = i2 % 128;
        int i3 = i2 % 2;
    }
}
