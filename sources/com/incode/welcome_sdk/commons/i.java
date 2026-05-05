package com.incode.welcome_sdk.commons;

import android.app.Application;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.iptc.IptcDirectory;
import com.incode.recogkitandroid.FaceAttributesDetectorKitAndroid;
import com.incode.recogkitandroid.FacePadKitAndroid;
import com.incode.recogkitandroid.IdFaceDetectorKit;
import com.incode.recogkitandroid.RecogKitAndroid;
import com.incode.recogkitandroid.SelfieFaceDetectorKit;
import com.incode.recogkitandroid.SelfieFaceQualityKitAndroid;
import com.incode.welcome_sdk.commons.exceptions.IncodeGenericError;
import com.incode.welcome_sdk.commons.utils.l;
import com.incode.welcome_sdk.ui.dynamic_forms.view.FormsSelectInputScreenKt;
import java.io.File;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class i {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: l */
    private static int f5259l = 0;

    /* JADX INFO: renamed from: m */
    private static int f5260m = 0;

    /* JADX INFO: renamed from: n */
    private static int f5261n = 0;

    /* JADX INFO: renamed from: o */
    private static long f5262o = 0;

    /* JADX INFO: renamed from: q */
    private static int f5263q = 0;

    /* JADX INFO: renamed from: a */
    private final com.incode.welcome_sdk.commons.d.a f5264a;

    /* JADX INFO: renamed from: b */
    private final Application f5265b;

    /* JADX INFO: renamed from: c */
    private final com.incode.welcome_sdk.commons.d.b f5266c;

    /* JADX INFO: renamed from: d */
    private final SharedPreferences f5267d;

    /* JADX INFO: renamed from: e */
    private final com.incode.welcome_sdk.commons.d.g f5268e;

    /* JADX INFO: renamed from: f */
    private final com.incode.welcome_sdk.commons.d.i f5269f;

    /* JADX INFO: renamed from: g */
    private final com.incode.welcome_sdk.commons.d.e f5270g;

    /* JADX INFO: renamed from: h */
    private final File f5271h;

    /* JADX INFO: renamed from: i */
    private final int f5272i;

    /* JADX INFO: renamed from: j */
    private final com.incode.welcome_sdk.commons.d.f f5273j;

    /* JADX INFO: renamed from: k */
    private final File f5274k;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002a -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r10, byte r11, byte r12) {
        /*
            int r0 = r11 * 4
            int r9 = r0 + 1
            byte[] r8 = com.incode.welcome_sdk.commons.i.$$a
            int r0 = r10 * 3
            int r0 = r0 + 112
            int r1 = r12 * 2
            int r7 = 3 - r1
            byte[] r6 = new byte[r9]
            r5 = 0
            if (r8 != 0) goto L2e
            r1 = r9
            r2 = r7
            r4 = r5
        L16:
            int r0 = -r1
            int r7 = r7 + r0
            r3 = r4
            r0 = r7
            r7 = r2
        L1b:
            int r2 = r7 + 1
            byte r1 = (byte) r0
            int r4 = r3 + 1
            r6[r3] = r1
            if (r4 != r9) goto L2a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L2a:
            r1 = r8[r2]
            r7 = r0
            goto L16
        L2e:
            r3 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.i.$$c(byte, byte, byte):java.lang.String");
    }

    public static /* synthetic */ Object d(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
        int i8 = ~((~i4) | i7);
        int i9 = (~((~i7) | (~i6))) | i8;
        int i10 = i7 | i6;
        int i11 = i7 + i6 + i3 + ((-39394691) * i5) + ((-2104995841) * i2);
        int i12 = i11 * i11;
        int i13 = (i7 * (-1880913482)) + 198443008 + ((-1880913482) * i6) + ((-1126725195) * i8) + (i9 * 1126725195) + (1126725195 * i10) + ((-754188288) * i3) + ((-1529085952) * i5) + ((-319553536) * i2) + ((-289079296) * i12);
        int i14 = ((i7 * 1773844906) - 1404835566) + (i6 * 1773844906) + (i8 * (-613)) + (i9 * IptcDirectory.TAG_COUNTRY_OR_PRIMARY_LOCATION_NAME) + (i10 * IptcDirectory.TAG_COUNTRY_OR_PRIMARY_LOCATION_NAME) + (i3 * 1773845519) + (i5 * 1055723859) + (i2 * 1996616689) + (i12 * (-1450508288));
        return i13 + ((i14 * i14) * (-778371072)) != 1 ? a(objArr) : b(objArr);
    }

    static void init$0() {
        $$a = new byte[]{38, -81, -30, 49};
        $$b = 31;
    }

    private i(Application application, SharedPreferences sharedPreferences, com.incode.welcome_sdk.commons.d.g gVar, com.incode.welcome_sdk.commons.d.a aVar, com.incode.welcome_sdk.commons.d.b bVar, com.incode.welcome_sdk.commons.d.e eVar, com.incode.welcome_sdk.commons.d.f fVar, com.incode.welcome_sdk.commons.d.i iVar, File file) {
        File filesDir;
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(sharedPreferences, "");
        Intrinsics.checkNotNullParameter(gVar, "");
        Intrinsics.checkNotNullParameter(aVar, "");
        Intrinsics.checkNotNullParameter(bVar, "");
        Intrinsics.checkNotNullParameter(eVar, "");
        Intrinsics.checkNotNullParameter(fVar, "");
        Intrinsics.checkNotNullParameter(iVar, "");
        this.f5265b = application;
        this.f5267d = sharedPreferences;
        this.f5268e = gVar;
        this.f5264a = aVar;
        this.f5266c = bVar;
        this.f5270g = eVar;
        this.f5273j = fVar;
        this.f5269f = iVar;
        this.f5271h = null;
        this.f5272i = (int) Math.max(Runtime.getRuntime().availableProcessors() - 4, 2.0d);
        if (l.b()) {
            filesDir = application.getExternalFilesDir(null);
        } else {
            filesDir = application.getFilesDir();
        }
        Intrinsics.checkNotNull(filesDir);
        this.f5274k = filesDir;
    }

    public /* synthetic */ i(Application application, SharedPreferences sharedPreferences) {
        this(application, sharedPreferences, new com.incode.welcome_sdk.commons.d.h(), new com.incode.welcome_sdk.commons.d.d(), new com.incode.welcome_sdk.commons.d.c(), new com.incode.welcome_sdk.commons.d.j(), new com.incode.welcome_sdk.commons.d.k(), new com.incode.welcome_sdk.commons.d.n(), null);
    }

    public final RecogManager b() {
        int i2 = 2 % 2;
        Timber.Forest.d("Num of threads: %s", Integer.valueOf(this.f5272i));
        int iA = com.incode.welcome_sdk.modules.d.a();
        int iA2 = com.incode.welcome_sdk.modules.d.a();
        int iA3 = com.incode.welcome_sdk.modules.d.a();
        RecogManager recogManager = new RecogManager((RecogKitAndroid) d(com.incode.welcome_sdk.modules.d.a(), iA2, new Object[]{this}, iA, iA3, -2129244455, 2129244456), a(), e(), i(), g(), h());
        int i3 = f5260m + 53;
        f5259l = i3 % 128;
        if (i3 % 2 == 0) {
            return recogManager;
        }
        throw null;
    }

    private static void p(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 53;
        $11 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
            charArray = str2 != null ? str2.toCharArray() : str2;
        } else {
            if (str2 != null) {
            }
        }
        char[] cArr = (char[]) charArray;
        com.c.a.m mVar = new com.c.a.m();
        mVar.f2778b = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        mVar.f2779e = 0;
        int i6 = $11 + 23;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (mVar.f2779e < cArr.length) {
            int i8 = $10 + 85;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = mVar.f2779e;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[mVar.f2779e]), mVar, mVar};
                Object objC = com.c.a.e.e.c(-1726804722);
                if (objC == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objC = com.c.a.e.e.e((char) (ViewConfiguration.getPressedStateDuration() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 18, 885 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1719070857, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i10] = ((Long) ((Method) objC).invoke(null, objArr2)).longValue() ^ (f5262o ^ (-7382027491817826291L));
                Object[] objArr3 = {mVar, mVar};
                Object objC2 = com.c.a.e.e.c(1025650959);
                if (objC2 == null) {
                    char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int iAlpha = 20 - Color.alpha(0);
                    int i11 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 988;
                    byte b4 = (byte) ($$b & 1);
                    byte b5 = (byte) (b4 - 1);
                    objC2 = com.c.a.e.e.e(maximumDrawingCacheSize, iAlpha, i11, 1035481974, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objC2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        mVar.f2779e = 0;
        while (mVar.f2779e < cArr.length) {
            cArr2[mVar.f2779e] = (char) jArr[mVar.f2779e];
            Object[] objArr4 = {mVar, mVar};
            Object objC3 = com.c.a.e.e.c(1025650959);
            if (objC3 == null) {
                char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                int iBlue = 20 - Color.blue(0);
                int windowTouchSlop = 988 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                byte b6 = (byte) ($$b & 1);
                byte b7 = (byte) (b6 - 1);
                objC3 = com.c.a.e.e.e(packedPositionType, iBlue, windowTouchSlop, 1035481974, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objC3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    private static /* synthetic */ Object b(Object[] objArr) throws Throwable {
        i iVar = (i) objArr[0];
        int i2 = 2 % 2;
        int i3 = f5259l + 27;
        f5260m = i3 % 128;
        int i4 = i3 % 2;
        RecogKitAndroid recogKitAndroidA = null;
        try {
            File file = (File) l.a(FormsSelectInputScreenKt.h.b(), new Object[]{iVar.f5265b, iVar.f5274k, iVar.f5268e.e(), iVar.f5268e.c(), Integer.valueOf(iVar.f5268e.d())}, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), -1252974840, 1252974842, FormsSelectInputScreenKt.h.b());
            if (!file.exists()) {
                file = null;
            }
            if (file == null) {
                return null;
            }
            int i5 = f5260m + 109;
            f5259l = i5 % 128;
            int i6 = i5 % 2;
            com.incode.welcome_sdk.commons.d.g gVar = iVar.f5268e;
            String path = file.getPath();
            Intrinsics.checkNotNullExpressionValue(path, "");
            com.incode.welcome_sdk.commons.d.g gVarE = gVar.e(path);
            Object[] objArr2 = new Object[1];
            p("❏佉\uf77cὡ蜞⼆圲＾柜迋㟹", 26641 - KeyEvent.getDeadChar(0, 0), objArr2);
            com.incode.welcome_sdk.commons.d.g gVarC = gVarE.c(((String) objArr2[0]).intern(), 50000);
            Object[] objArr3 = new Object[1];
            p("❞ၭ䤱苲ﮤ㍪氦ꗰ麬홥༥", 14143 - (ViewConfiguration.getEdgeSlop() >> 16), objArr3);
            com.incode.welcome_sdk.commons.d.g gVarC2 = gVarC.c(((String) objArr3[0]).intern(), 5000);
            Object[] objArr4 = new Object[1];
            p("❟砦馼㤻媊拓ᮞ묏\udcf1", 24439 - Color.argb(0, 0, 0, 0), objArr4);
            com.incode.welcome_sdk.commons.d.g gVarC3 = gVarC2.c(((String) objArr4[0]).intern(), 5000).c(iVar.f5272i);
            iVar.k();
            recogKitAndroidA = gVarC3.a();
            return recogKitAndroidA;
        } catch (NoClassDefFoundError unused) {
            Timber.Forest.d("Local face recognition model not found. Skipping RecogKitAndroid initialization.", new Object[0]);
            return recogKitAndroidA;
        }
    }

    private final FacePadKitAndroid a() {
        int i2 = 2 % 2;
        Object obj = null;
        try {
            File file = (File) l.a(FormsSelectInputScreenKt.h.b(), new Object[]{this.f5265b, this.f5274k, this.f5264a.a(), this.f5264a.c(), Integer.valueOf(this.f5264a.d())}, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), -1252974840, 1252974842, FormsSelectInputScreenKt.h.b());
            if (file.exists()) {
                int i3 = f5259l + 69;
                f5260m = i3 % 128;
                int i4 = i3 % 2;
            } else {
                file = null;
            }
            if (file == null) {
                return null;
            }
            int i5 = f5259l + 73;
            f5260m = i5 % 128;
            if (i5 % 2 != 0) {
                com.incode.welcome_sdk.commons.d.a aVar = this.f5264a;
                String path = file.getPath();
                Intrinsics.checkNotNullExpressionValue(path, "");
                com.incode.welcome_sdk.commons.d.a aVarC = aVar.c(path).c(this.f5272i);
                l();
                return aVarC.e();
            }
            com.incode.welcome_sdk.commons.d.a aVar2 = this.f5264a;
            String path2 = file.getPath();
            Intrinsics.checkNotNullExpressionValue(path2, "");
            com.incode.welcome_sdk.commons.d.a aVarC2 = aVar2.c(path2).c(this.f5272i);
            l();
            aVarC2.e();
            obj.hashCode();
            throw null;
        } catch (NoClassDefFoundError unused) {
            Timber.Forest.d("Local liveness model not found. Skipping FacePadKitAndroid initialization.", new Object[0]);
            return null;
        }
    }

    private final FaceAttributesDetectorKitAndroid e() {
        FaceAttributesDetectorKitAndroid faceAttributesDetectorKitAndroidD;
        int i2 = 2 % 2;
        try {
            File file = (File) l.a(FormsSelectInputScreenKt.h.b(), new Object[]{this.f5265b, this.f5274k, this.f5266c.e(), this.f5266c.b(), Integer.valueOf(this.f5266c.a())}, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), -1252974840, 1252974842, FormsSelectInputScreenKt.h.b());
            if (file.exists()) {
                int i3 = f5260m + 125;
                f5259l = i3 % 128;
                int i4 = i3 % 2;
            } else {
                file = null;
            }
            if (file == null) {
                return null;
            }
            int i5 = f5260m + 105;
            f5259l = i5 % 128;
            if (i5 % 2 != 0) {
                com.incode.welcome_sdk.commons.d.b bVar = this.f5266c;
                String path = file.getPath();
                Intrinsics.checkNotNullExpressionValue(path, "");
                com.incode.welcome_sdk.commons.d.b bVarC = bVar.c(path).c(this.f5272i);
                int iA = com.incode.welcome_sdk.modules.d.a();
                d(com.incode.welcome_sdk.modules.d.a(), com.incode.welcome_sdk.modules.d.a(), new Object[]{this}, iA, com.incode.welcome_sdk.modules.d.a(), -664598889, 664598889);
                faceAttributesDetectorKitAndroidD = bVarC.d();
                int i6 = 58 / 0;
            } else {
                com.incode.welcome_sdk.commons.d.b bVar2 = this.f5266c;
                String path2 = file.getPath();
                Intrinsics.checkNotNullExpressionValue(path2, "");
                com.incode.welcome_sdk.commons.d.b bVarC2 = bVar2.c(path2).c(this.f5272i);
                int iA2 = com.incode.welcome_sdk.modules.d.a();
                d(com.incode.welcome_sdk.modules.d.a(), com.incode.welcome_sdk.modules.d.a(), new Object[]{this}, iA2, com.incode.welcome_sdk.modules.d.a(), -664598889, 664598889);
                faceAttributesDetectorKitAndroidD = bVarC2.d();
            }
            return faceAttributesDetectorKitAndroidD;
        } catch (NoClassDefFoundError unused) {
            Timber.Forest.d("Local face attributes model not found. Skipping FaceAttributesDetectorKitAndroid initialization.", new Object[0]);
            return null;
        }
    }

    private final IdFaceDetectorKit i() {
        int i2 = 2 % 2;
        Object obj = null;
        try {
            File file = (File) l.a(FormsSelectInputScreenKt.h.b(), new Object[]{this.f5265b, this.f5274k, this.f5270g.b(), this.f5270g.a(), Integer.valueOf(this.f5270g.e())}, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), -1252974840, 1252974842, FormsSelectInputScreenKt.h.b());
            if (file.exists()) {
                int i3 = f5260m + 69;
                f5259l = i3 % 128;
                int i4 = i3 % 2;
            } else {
                file = null;
            }
            if (file == null) {
                return null;
            }
            int i5 = f5260m + 25;
            f5259l = i5 % 128;
            if (i5 % 2 == 0) {
                com.incode.welcome_sdk.commons.d.e eVar = this.f5270g;
                String path = file.getPath();
                Intrinsics.checkNotNullExpressionValue(path, "");
                com.incode.welcome_sdk.commons.d.e eVarE = eVar.d(path).e(this.f5272i);
                f();
                return eVarE.c();
            }
            com.incode.welcome_sdk.commons.d.e eVar2 = this.f5270g;
            String path2 = file.getPath();
            Intrinsics.checkNotNullExpressionValue(path2, "");
            com.incode.welcome_sdk.commons.d.e eVarE2 = eVar2.d(path2).e(this.f5272i);
            f();
            eVarE2.c();
            obj.hashCode();
            throw null;
        } catch (NoClassDefFoundError unused) {
            Timber.Forest.d("Local ID face detection model not found. Skipping IdFaceDetectorKit initialization.", new Object[0]);
            return null;
        }
    }

    private final SelfieFaceDetectorKit g() {
        SelfieFaceDetectorKit selfieFaceDetectorKitC;
        File file;
        int i2 = 2 % 2;
        Object obj = null;
        try {
            file = (File) l.a(FormsSelectInputScreenKt.h.b(), new Object[]{this.f5265b, this.f5274k, this.f5273j.b(), this.f5273j.d(), Integer.valueOf(this.f5273j.e())}, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), -1252974840, 1252974842, FormsSelectInputScreenKt.h.b());
            if (file.exists()) {
                int i3 = f5260m + 83;
                f5259l = i3 % 128;
                int i4 = i3 % 2;
            } else {
                file = null;
            }
        } catch (IncodeGenericError e2) {
            Timber.Forest.w(e2, "Selfie face detection model could not be loaded. We will try to fall back to manual capture where possible.", new Object[0]);
        } catch (NoClassDefFoundError e3) {
            Timber.Forest.w(e3, "Selfie face detection model not found. We will try to fall back to manual capture where possible.", new Object[0]);
        }
        if (file != null) {
            com.incode.welcome_sdk.commons.d.f fVar = this.f5273j;
            String path = file.getPath();
            Intrinsics.checkNotNullExpressionValue(path, "");
            com.incode.welcome_sdk.commons.d.f fVarD = fVar.b(path).d(this.f5272i);
            j();
            selfieFaceDetectorKitC = fVarD.c();
        } else {
            selfieFaceDetectorKitC = null;
        }
        int i5 = f5259l + 85;
        f5260m = i5 % 128;
        if (i5 % 2 != 0) {
            return selfieFaceDetectorKitC;
        }
        obj.hashCode();
        throw null;
    }

    private final SelfieFaceQualityKitAndroid h() {
        int i2 = 2 % 2;
        int i3 = f5260m + 57;
        f5259l = i3 % 128;
        SelfieFaceQualityKitAndroid selfieFaceQualityKitAndroidC = null;
        try {
        } catch (IncodeGenericError e2) {
            Timber.Forest.w(e2, "Selfie face quality model could not be loaded. We will try to fall back to manual capture where possible.", new Object[0]);
        } catch (NoClassDefFoundError e3) {
            Timber.Forest.w(e3, "Selfie face quality model not found. We will try to fall back to manual capture where possible.", new Object[0]);
        }
        if (i3 % 2 != 0) {
            ((File) l.a(FormsSelectInputScreenKt.h.b(), new Object[]{this.f5265b, this.f5274k, this.f5269f.e(), this.f5269f.a(), Integer.valueOf(this.f5269f.d())}, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), -1252974840, 1252974842, FormsSelectInputScreenKt.h.b())).exists();
            selfieFaceQualityKitAndroidC.hashCode();
            throw null;
        }
        File file = (File) l.a(FormsSelectInputScreenKt.h.b(), new Object[]{this.f5265b, this.f5274k, this.f5269f.e(), this.f5269f.a(), Integer.valueOf(this.f5269f.d())}, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), -1252974840, 1252974842, FormsSelectInputScreenKt.h.b());
        if (!file.exists()) {
            file = null;
        }
        if (file != null) {
            com.incode.welcome_sdk.commons.d.i iVar = this.f5269f;
            String path = file.getPath();
            Intrinsics.checkNotNullExpressionValue(path, "");
            com.incode.welcome_sdk.commons.d.i iVarC = iVar.a(path).c(this.f5272i);
            m();
            selfieFaceQualityKitAndroidC = iVarC.c();
        }
        int i4 = f5259l + 67;
        f5260m = i4 % 128;
        int i5 = i4 % 2;
        return selfieFaceQualityKitAndroidC;
    }

    private final void j() {
        int i2 = 2 % 2;
        int i3 = f5260m + 73;
        f5259l = i3 % 128;
        int i4 = i3 % 2;
        this.f5267d.edit().remove("prefsFdModelVersion").apply();
        Object[] objArr = {this.f5274k, "selfie_facedetector_bf_3x3.encnnmodelv2"};
        int iB = FormsSelectInputScreenKt.h.b();
        ((Boolean) l.a(FormsSelectInputScreenKt.h.b(), objArr, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), 1081484302, -1081484302, iB)).booleanValue();
        Object[] objArr2 = {this.f5274k, "selfie_facedetector_bf_3x3_angles.encnnmodelv2"};
        int iB2 = FormsSelectInputScreenKt.h.b();
        ((Boolean) l.a(FormsSelectInputScreenKt.h.b(), objArr2, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), 1081484302, -1081484302, iB2)).booleanValue();
        int i5 = f5260m + 65;
        f5259l = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private final void f() {
        int i2 = 2 % 2;
        int i3 = f5260m + 61;
        f5259l = i3 % 128;
        if (i3 % 2 == 0) {
            this.f5267d.edit().remove("prefsIdFdModelVersion").apply();
            Object[] objArr = {this.f5274k, "facedetector_mobilenet_0_25_out64_160.encnnmodelv2"};
            int iB = FormsSelectInputScreenKt.h.b();
            ((Boolean) l.a(FormsSelectInputScreenKt.h.b(), objArr, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), 1081484302, -1081484302, iB)).booleanValue();
            Object[] objArr2 = {this.f5274k, "scrfd_face_det_id.encnnmodelv2"};
            int iB2 = FormsSelectInputScreenKt.h.b();
            ((Boolean) l.a(FormsSelectInputScreenKt.h.b(), objArr2, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), 1081484302, -1081484302, iB2)).booleanValue();
            int i4 = f5260m + 63;
            f5259l = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        this.f5267d.edit().remove("prefsIdFdModelVersion").apply();
        Object[] objArr3 = {this.f5274k, "facedetector_mobilenet_0_25_out64_160.encnnmodelv2"};
        int iB3 = FormsSelectInputScreenKt.h.b();
        ((Boolean) l.a(FormsSelectInputScreenKt.h.b(), objArr3, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), 1081484302, -1081484302, iB3)).booleanValue();
        Object[] objArr4 = {this.f5274k, "scrfd_face_det_id.encnnmodelv2"};
        int iB4 = FormsSelectInputScreenKt.h.b();
        ((Boolean) l.a(FormsSelectInputScreenKt.h.b(), objArr4, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), 1081484302, -1081484302, iB4)).booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void l() {
        int i2 = 2 % 2;
        int i3 = f5260m + 53;
        f5259l = i3 % 128;
        int i4 = i3 % 2;
        this.f5267d.edit().remove("prefsSdModelVersion").apply();
        Object[] objArr = {this.f5274k, "pad_model_fused_200220_optimized.encnnmodel"};
        int iB = FormsSelectInputScreenKt.h.b();
        ((Boolean) l.a(FormsSelectInputScreenKt.h.b(), objArr, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), 1081484302, -1081484302, iB)).booleanValue();
        int i5 = f5260m + 17;
        f5259l = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void k() {
        int i2 = 2 % 2;
        int i3 = f5260m + 93;
        f5259l = i3 % 128;
        if (i3 % 2 == 0) {
            this.f5267d.edit().remove("prefsFrModelVersion").apply();
            Object[] objArr = {this.f5274k, "incode_resnet15_elu.encnnmodel"};
            int iB = FormsSelectInputScreenKt.h.b();
            ((Boolean) l.a(FormsSelectInputScreenKt.h.b(), objArr, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), 1081484302, -1081484302, iB)).booleanValue();
            Object[] objArr2 = {this.f5274k, "incode_resnet15_elu_v2.encnnmodelv2"};
            int iB2 = FormsSelectInputScreenKt.h.b();
            ((Boolean) l.a(FormsSelectInputScreenKt.h.b(), objArr2, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), 1081484302, -1081484302, iB2)).booleanValue();
            int i4 = f5260m + 21;
            f5259l = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        this.f5267d.edit().remove("prefsFrModelVersion").apply();
        Object[] objArr3 = {this.f5274k, "incode_resnet15_elu.encnnmodel"};
        int iB3 = FormsSelectInputScreenKt.h.b();
        ((Boolean) l.a(FormsSelectInputScreenKt.h.b(), objArr3, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), 1081484302, -1081484302, iB3)).booleanValue();
        Object[] objArr4 = {this.f5274k, "incode_resnet15_elu_v2.encnnmodelv2"};
        int iB4 = FormsSelectInputScreenKt.h.b();
        ((Boolean) l.a(FormsSelectInputScreenKt.h.b(), objArr4, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), 1081484302, -1081484302, iB4)).booleanValue();
        throw null;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        i iVar = (i) objArr[0];
        int i2 = 2 % 2;
        int i3 = f5260m + 39;
        f5259l = i3 % 128;
        if (i3 % 2 != 0) {
            iVar.f5267d.edit().remove("prefsFaModelVersion").apply();
            Object[] objArr2 = {iVar.f5274k, "mask_model_020420_q.encnnmodelv2"};
            int iB = FormsSelectInputScreenKt.h.b();
            ((Boolean) l.a(FormsSelectInputScreenKt.h.b(), objArr2, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), 1081484302, -1081484302, iB)).booleanValue();
            int i4 = 15 / 0;
            return null;
        }
        iVar.f5267d.edit().remove("prefsFaModelVersion").apply();
        Object[] objArr3 = {iVar.f5274k, "mask_model_020420_q.encnnmodelv2"};
        int iB2 = FormsSelectInputScreenKt.h.b();
        ((Boolean) l.a(FormsSelectInputScreenKt.h.b(), objArr3, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), 1081484302, -1081484302, iB2)).booleanValue();
        return null;
    }

    private final void m() {
        int i2 = 2 % 2;
        int i3 = f5260m + 41;
        f5259l = i3 % 128;
        int i4 = i3 % 2;
        this.f5267d.edit().remove("prefsSfqModelVersion").apply();
        Object[] objArr = {this.f5274k, "mls_regressor_4773007c657b4f05a460321456740d0f_v1_0_fp16.encnnmodelv2"};
        int iB = FormsSelectInputScreenKt.h.b();
        ((Boolean) l.a(FormsSelectInputScreenKt.h.b(), objArr, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), 1081484302, -1081484302, iB)).booleanValue();
        int i5 = f5260m + 123;
        f5259l = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    static void c() {
        f5262o = 2712747152186474256L;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f5261n = 0;
        f5263q = 1;
        f5259l = 0;
        f5260m = 1;
        c();
        int i2 = f5261n + 35;
        f5263q = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void n() {
        int iA = com.incode.welcome_sdk.modules.d.a();
        int iA2 = com.incode.welcome_sdk.modules.d.a();
        int iA3 = com.incode.welcome_sdk.modules.d.a();
        d(com.incode.welcome_sdk.modules.d.a(), iA2, new Object[]{this}, iA, iA3, -664598889, 664598889);
    }

    private final RecogKitAndroid d() {
        int iA = com.incode.welcome_sdk.modules.d.a();
        int iA2 = com.incode.welcome_sdk.modules.d.a();
        int iA3 = com.incode.welcome_sdk.modules.d.a();
        return (RecogKitAndroid) d(com.incode.welcome_sdk.modules.d.a(), iA2, new Object[]{this}, iA, iA3, -2129244455, 2129244456);
    }
}
