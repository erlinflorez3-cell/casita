package com.incode.welcome_sdk.data.local;

import android.app.ActivityManager;
import android.app.Application;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.CommonConfig;
import com.incode.welcome_sdk.IdCategory;
import com.incode.welcome_sdk.IncodeWelcome$getWrappedDelayedOnboardingListener$1;
import com.incode.welcome_sdk.SessionConfig;
import com.incode.welcome_sdk.ThemeConfiguration;
import com.incode.welcome_sdk.commons.IncodeUXConfig;
import com.incode.welcome_sdk.commons.utils.StringUtils;
import com.incode.welcome_sdk.commons.utils.ae;
import com.incode.welcome_sdk.commons.utils.r;
import com.incode.welcome_sdk.data.DeviceFingerprint;
import com.incode.welcome_sdk.data.TemplateModel;
import com.incode.welcome_sdk.data.local.db.WelcomeDatabase;
import com.incode.welcome_sdk.data.remote.beans.bh;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.results.IdScanResult;
import com.incode.welcome_sdk.ui.dynamic_forms.view.FormsSelectInputScreenKt;
import com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public class l {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: e */
    private static char[] f8615e = null;

    /* JADX INFO: renamed from: f */
    private static int f8616f = 0;

    /* JADX INFO: renamed from: g */
    private static int f8617g = 0;

    /* JADX INFO: renamed from: h */
    private static boolean f8618h = false;

    /* JADX INFO: renamed from: i */
    private static boolean f8619i = false;

    /* JADX INFO: renamed from: j */
    private static int f8620j = 0;

    /* JADX INFO: renamed from: a */
    private final WelcomeDatabase f8621a;

    /* JADX INFO: renamed from: b */
    private final CompositeDisposable f8622b = new CompositeDisposable();

    /* JADX INFO: renamed from: c */
    private final SharedPreferences f8623c;

    /* JADX INFO: renamed from: d */
    private final Application f8624d;

    private static String $$c(int i2, short s2, byte b2) {
        int i3 = s2 * 3;
        int i4 = (b2 * 4) + 4;
        int i5 = 122 - (i2 * 50);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        int i7 = -1;
        if (bArr == null) {
            int i8 = -i4;
            i4++;
            i5 = i6 + i8;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i5;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            i4++;
            i5 += -bArr[i4];
        }
    }

    public static /* synthetic */ Object c(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) throws Throwable {
        int i8 = ~i3;
        int i9 = ~i6;
        int i10 = ~(i8 | i9);
        int i11 = (~(i8 | i7)) | i10 | (~(i9 | i7));
        int i12 = ~i7;
        int i13 = (~(i12 | i9 | i3)) | (~(i8 | i12 | i6));
        int i14 = i3 + i6 + i5 + ((-195996979) * i4) + ((-904719387) * i2);
        int i15 = i14 * i14;
        int i16 = (i3 * 1886715248) + 940376064 + (1886715248 * i6) + (i11 * (-42925423)) + (i10 * (-42925423)) + ((-42925423) * i13) + (1843789824 * i5) + ((-1389494272) * i4) + (1623064576 * i2) + (1510801408 * i15);
        int i17 = (i3 * 1590984816) + 1398186415 + (i6 * 1590984816) + (i11 * 737) + (i10 * 737) + (i13 * 737) + (i5 * 1590985553) + (i4 * (-1025631779)) + (i2 * 1121679989) + (i15 * 622657536);
        switch (i16 + (i17 * i17 * (-1928134656))) {
            case 1:
                l lVar = (l) objArr[0];
                int i18 = 2 % 2;
                int i19 = f8616f + 125;
                f8617g = i19 % 128;
                int i20 = i19 % 2;
                String str = Environment.DIRECTORY_MOVIES;
                Object[] objArr2 = new Object[1];
                as("\u008c\u008b\u0082\u008a\u0085\u0088\u0084\u0083\u0086\u0089\u0082\u0086\u0086\u0088\u0083\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, null, TextUtils.lastIndexOf("", '0', 0) + 128, objArr2);
                File fileC = lVar.c(str, ((String) objArr2[0]).intern());
                int i21 = f8617g + 109;
                f8616f = i21 % 128;
                int i22 = i21 % 2;
                return fileC;
            case 2:
                return b(objArr);
            case 3:
                return c(objArr);
            case 4:
                return a(objArr);
            case 5:
                return e(objArr);
            case 6:
                return g(objArr);
            case 7:
                return f(objArr);
            case 8:
                return i(objArr);
            case 9:
                return h(objArr);
            case 10:
                return j(objArr);
            case 11:
                return m(objArr);
            case 12:
                return o(objArr);
            case 13:
                return k(objArr);
            case 14:
                return n(objArr);
            case 15:
                return l(objArr);
            case 16:
                return p(objArr);
            case 17:
                l lVar2 = (l) objArr[0];
                String str2 = (String) objArr[1];
                int i23 = 2 % 2;
                int i24 = f8616f + 99;
                f8617g = i24 % 128;
                int i25 = i24 % 2;
                lVar2.f8623c.edit().putString("prefsFullNameSecondId", str2).apply();
                int i26 = f8617g + 109;
                f8616f = i26 % 128;
                int i27 = i26 % 2;
                return null;
            case 18:
                return t(objArr);
            case 19:
                return r(objArr);
            case 20:
                return s(objArr);
            case 21:
                l lVar3 = (l) objArr[0];
                String str3 = (String) objArr[1];
                int i28 = 2 % 2;
                int i29 = f8616f + 49;
                f8617g = i29 % 128;
                int i30 = i29 % 2;
                lVar3.f8623c.edit().putString("prefsInterviewSessionId", str3).apply();
                int i31 = f8616f + 111;
                f8617g = i31 % 128;
                int i32 = i31 % 2;
                return null;
            case 22:
                return q(objArr);
            case 23:
                return x(objArr);
            case 24:
                return v(objArr);
            case 25:
                return y(objArr);
            case 26:
                return u(objArr);
            case 27:
                return w(objArr);
            case 28:
                final l lVar4 = (l) objArr[0];
                Map map = (Map) objArr[1];
                int i33 = 2 % 2;
                int i34 = f8617g + 77;
                f8616f = i34 % 128;
                int i35 = i34 % 2;
                lVar4.f8622b.add(lVar4.f8621a.d().b().andThen(Observable.fromIterable(map.entrySet())).subscribeOn(Schedulers.io()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.data.local.l$$ExternalSyntheticLambda0
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) throws Exception {
                        this.f$0.b((Map.Entry) obj);
                    }
                }, new Consumer() { // from class: com.incode.welcome_sdk.data.local.l$$ExternalSyntheticLambda1
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) throws Exception {
                        l.d((Throwable) obj);
                    }
                }));
                int i36 = f8616f + 75;
                f8617g = i36 % 128;
                int i37 = i36 % 2;
                return null;
            case 29:
                return B(objArr);
            case 30:
                return D(objArr);
            case 31:
                return C(objArr);
            case 32:
                l lVar5 = (l) objArr[0];
                int i38 = 2 % 2;
                int i39 = f8617g + 27;
                f8616f = i39 % 128;
                int i40 = i39 % 2;
                String string = lVar5.f8623c.getString("prefsCurp", null);
                int i41 = f8617g + 77;
                f8616f = i41 % 128;
                int i42 = i41 % 2;
                return string;
            default:
                return d(objArr);
        }
    }

    static void init$0() {
        $$a = new byte[]{7, 40, -110, -80};
        $$b = 183;
    }

    @Inject
    public l(Application application, SharedPreferences sharedPreferences, WelcomeDatabase welcomeDatabase) {
        this.f8624d = application;
        this.f8623c = sharedPreferences;
        this.f8621a = welcomeDatabase;
    }

    public final File e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f8617g + 101;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        String str = Environment.DIRECTORY_PICTURES;
        Object[] objArr = new Object[1];
        as("\u0086\u0085\u0084\u0083\u0082\u0081", null, null, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, objArr);
        File fileC = c(str, ((String) objArr[0]).intern());
        int i5 = f8617g + 47;
        f8616f = i5 % 128;
        int i6 = i5 % 2;
        return fileC;
    }

    public final File b() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f8617g + 61;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        String str = Environment.DIRECTORY_MOVIES;
        Object[] objArr = new Object[1];
        as("\u008c\u008b\u0082\u008a\u0085\u0088\u0084\u0083\u0086\u0089\u0084\u0086\u0085\u008a\u008d\u0086\u0085\u0084\u0083\u0082\u0081", null, null, 127 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
        File fileC = c(str, ((String) objArr[0]).intern());
        int i5 = f8616f + 17;
        f8617g = i5 % 128;
        int i6 = i5 % 2;
        return fileC;
    }

    public final File c() throws Throwable {
        String str;
        Object obj;
        int i2 = 2 % 2;
        int i3 = f8617g + 33;
        f8616f = i3 % 128;
        if (i3 % 2 != 0) {
            str = Environment.DIRECTORY_DOWNLOADS;
            Object[] objArr = new Object[1];
            as("\u0086\u0085\u0084\u0083\u0082\u0081", null, null, 103 % Gravity.getAbsoluteGravity(1, 1), objArr);
            obj = objArr[0];
        } else {
            str = Environment.DIRECTORY_DOWNLOADS;
            Object[] objArr2 = new Object[1];
            as("\u0086\u0085\u0084\u0083\u0082\u0081", null, null, Gravity.getAbsoluteGravity(0, 0) + 127, objArr2);
            obj = objArr2[0];
        }
        File fileC = c(str, ((String) obj).intern());
        int i4 = f8616f + 55;
        f8617g = i4 % 128;
        int i5 = i4 % 2;
        return fileC;
    }

    private File c(String str, String str2) {
        int i2 = 2 % 2;
        File file = new File(this.f8624d.getExternalFilesDir(str), str2);
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        int i3 = f8617g + 7;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        Timber.e("Failed to create folder: %s", file.getAbsolutePath());
        int i5 = f8617g + 125;
        f8616f = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
    
        if (r5.mkdirs() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        r1 = com.incode.welcome_sdk.data.local.l.f8616f + 103;
        com.incode.welcome_sdk.data.local.l.f8617g = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if ((r1 % 2) != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        r1 = new java.lang.Object[0];
        r1[1] = r5.getAbsolutePath();
        timber.log.Timber.e("WelcomeDataSource failed to fully create: %s", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        timber.log.Timber.e("WelcomeDataSource failed to fully create: %s", r5.getAbsolutePath());
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        if (r5.mkdirs() == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.File a() throws java.lang.Throwable {
        /*
            r9 = this;
            r8 = 2
            int r0 = r8 % r8
            java.io.File r5 = new java.io.File
            android.app.Application r0 = r9.f8624d
            java.io.File r7 = r0.getFilesDir()
            java.lang.String r0 = ""
            int r0 = android.os.Process.getGidForName(r0)
            int r2 = 126 - r0
            r4 = 1
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "\u0086\u0085\u0084\u0083\u0082\u0081"
            r3 = 0
            as(r0, r3, r3, r2, r1)
            r6 = 0
            r0 = r1[r6]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            r5.<init>(r7, r0)
            boolean r0 = r5.exists()
            if (r0 != 0) goto L6f
            int r0 = com.incode.welcome_sdk.data.local.l.f8616f
            int r1 = r0 + 23
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.l.f8617g = r0
            int r1 = r1 % r8
            if (r1 != 0) goto L68
            boolean r1 = r5.mkdirs()
            r0 = 16
            int r0 = r0 / r6
            if (r1 != 0) goto L6f
        L43:
            int r0 = com.incode.welcome_sdk.data.local.l.f8616f
            int r1 = r0 + 103
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.l.f8617g = r0
            int r1 = r1 % r8
            java.lang.String r2 = "WelcomeDataSource failed to fully create: %s"
            if (r1 != 0) goto L5c
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = r5.getAbsolutePath()
            r1[r4] = r0
            timber.log.Timber.e(r2, r1)
        L5b:
            return r3
        L5c:
            java.lang.String r0 = r5.getAbsolutePath()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            timber.log.Timber.e(r2, r0)
            goto L5b
        L68:
            boolean r0 = r5.mkdirs()
            if (r0 != 0) goto L6f
            goto L43
        L6f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.l.a():java.io.File");
    }

    private static /* synthetic */ Object x(Object[] objArr) {
        l lVar = (l) objArr[0];
        int i2 = 2 % 2;
        int i3 = f8616f + 125;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        SharedPreferences sharedPreferences = lVar.f8623c;
        if (i4 == 0) {
            sharedPreferences.getString("prefsModelAndLibsPath", null);
            throw null;
        }
        String string = sharedPreferences.getString("prefsModelAndLibsPath", null);
        int i5 = f8617g + 59;
        f8616f = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    public final void e(String str) {
        int i2 = 2 % 2;
        int i3 = f8617g + 33;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        this.f8623c.edit().putString("prefsModelAndLibsPath", str).apply();
        int i5 = f8617g + 79;
        f8616f = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final List<TemplateModel> j() {
        int i2 = 2 % 2;
        int i3 = f8616f + 79;
        f8617g = i3 % 128;
        if (i3 % 2 == 0) {
            this.f8621a.c().c();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<TemplateModel> listC = this.f8621a.c().c();
        int i4 = f8616f + 81;
        f8617g = i4 % 128;
        int i5 = i4 % 2;
        return listC;
    }

    public final TemplateModel f() {
        int i2 = 2 % 2;
        int i3 = f8617g + 1;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        TemplateModel templateModelA = this.f8621a.c().a();
        int i5 = f8616f + 33;
        f8617g = i5 % 128;
        int i6 = i5 % 2;
        return templateModelA;
    }

    public final Completable c(FaceInfo faceInfo) {
        int i2 = 2 % 2;
        int i3 = f8617g + 33;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        Completable completableD = this.f8621a.e().d(faceInfo);
        int i5 = f8616f + 35;
        f8617g = i5 % 128;
        int i6 = i5 % 2;
        return completableD;
    }

    private static /* synthetic */ Object D(Object[] objArr) {
        l lVar = (l) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = f8617g + 121;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.local.db.c.b bVarE = lVar.f8621a.e();
        if (i4 == 0) {
            return bVarE.e(str);
        }
        bVarE.e(str);
        throw null;
    }

    public final Completable i() {
        int i2 = 2 % 2;
        int i3 = f8617g + 15;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.local.db.c.b bVarE = this.f8621a.e();
        if (i4 == 0) {
            return bVarE.d();
        }
        bVarE.d();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Completable d(List<FaceInfo> list) {
        int i2 = 2 % 2;
        int i3 = f8617g + 95;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        Completable completableAndThen = this.f8621a.e().e().andThen(this.f8621a.e().e(list));
        int i5 = f8616f + 25;
        f8617g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 27 / 0;
        }
        return completableAndThen;
    }

    public final Maybe<List<FaceInfo>> g() {
        int i2 = 2 % 2;
        int i3 = f8617g + 79;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        Maybe<List<FaceInfo>> maybeSubscribeOn = this.f8621a.e().b().subscribeOn(Schedulers.io());
        int i5 = f8617g + 19;
        f8616f = i5 % 128;
        int i6 = i5 % 2;
        return maybeSubscribeOn;
    }

    public final Maybe<List<FaceInfo>> a(String str) {
        int i2 = 2 % 2;
        int i3 = f8616f + 49;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        Maybe<List<FaceInfo>> maybeSubscribeOn = this.f8621a.e().d(str).subscribeOn(Schedulers.io());
        int i5 = f8616f + 31;
        f8617g = i5 % 128;
        int i6 = i5 % 2;
        return maybeSubscribeOn;
    }

    private static void as(String str, String str2, int[] iArr, int i2, Object[] objArr) throws Throwable {
        String str3 = str;
        String str4 = str2;
        int i3 = 2 % 2;
        int i4 = $10;
        int i5 = i4 + 33;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        Object charArray = str4;
        if (str4 != null) {
            int i7 = i4 + 103;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                str4.toCharArray();
                throw null;
            }
            charArray = str4.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object bytes = str3;
        if (str3 != null) {
            bytes = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        com.c.a.i iVar = new com.c.a.i();
        char[] cArr2 = f8615e;
        float f2 = 0.0f;
        int i8 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                    Object objC = com.c.a.e.e.c(936178174);
                    if (objC == null) {
                        char cRed = (char) Color.red(i8);
                        int iAlpha = Color.alpha(i8) + 20;
                        int i10 = (TypedValue.complexToFraction(i8, f2, f2) > f2 ? 1 : (TypedValue.complexToFraction(i8, f2, f2) == f2 ? 0 : -1)) + 846;
                        byte b2 = (byte) i8;
                        byte b3 = b2;
                        objC = com.c.a.e.e.e(cRed, iAlpha, i10, 928445319, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objC).invoke(null, objArr2)).charValue();
                    i9++;
                    f2 = 0.0f;
                    i8 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(f8620j)};
        Object objC2 = com.c.a.e.e.c(-1774242729);
        long j2 = 0;
        if (objC2 == null) {
            objC2 = com.c.a.e.e.e((char) (35038 - View.getDefaultSize(0, 0)), 16 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1362, -1767557586, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objC2).invoke(null, objArr3)).intValue();
        if (f8619i) {
            iVar.f2754b = bArr.length;
            char[] cArr4 = new char[iVar.f2754b];
            iVar.f2755c = 0;
            while (iVar.f2755c < iVar.f2754b) {
                cArr4[iVar.f2755c] = (char) (cArr2[bArr[(iVar.f2754b - 1) - iVar.f2755c] + i2] - iIntValue);
                Object[] objArr4 = {iVar, iVar};
                Object objC3 = com.c.a.e.e.c(-1471606930);
                if (objC3 == null) {
                    char c2 = (char) (49812 - (ExpandableListView.getPackedPositionForChild(0, 0) > j2 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j2 ? 0 : -1)));
                    int trimmedLength = 20 - TextUtils.getTrimmedLength("");
                    int iIndexOf = 1341 - TextUtils.indexOf((CharSequence) "", '0');
                    byte b4 = (byte) ($$b & 1);
                    byte b5 = (byte) (b4 - 1);
                    objC3 = com.c.a.e.e.e(c2, trimmedLength, iIndexOf, -1462563561, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objC3).invoke(null, objArr4);
                j2 = 0;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (f8618h) {
            int i11 = $11 + 41;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            iVar.f2754b = cArr.length;
            char[] cArr5 = new char[iVar.f2754b];
            iVar.f2755c = 0;
            while (iVar.f2755c < iVar.f2754b) {
                cArr5[iVar.f2755c] = (char) (cArr2[cArr[(iVar.f2754b - 1) - iVar.f2755c] - i2] - iIntValue);
                Object[] objArr5 = {iVar, iVar};
                Object objC4 = com.c.a.e.e.c(-1471606930);
                if (objC4 == null) {
                    char packedPositionGroup = (char) (49813 - ExpandableListView.getPackedPositionGroup(0L));
                    int iMakeMeasureSpec = 20 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 1342;
                    byte b6 = (byte) ($$b & 1);
                    byte b7 = (byte) (b6 - 1);
                    objC4 = com.c.a.e.e.e(packedPositionGroup, iMakeMeasureSpec, iNormalizeMetaState, -1462563561, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objC4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i13 = 0;
        iVar.f2754b = iArr.length;
        char[] cArr6 = new char[iVar.f2754b];
        while (true) {
            iVar.f2755c = i13;
            if (iVar.f2755c >= iVar.f2754b) {
                objArr[0] = new String(cArr6);
                return;
            }
            int i14 = $10 + 29;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            cArr6[iVar.f2755c] = (char) (cArr2[iArr[(iVar.f2754b - 1) - iVar.f2755c] - i2] - iIntValue);
            i13 = iVar.f2755c + 1;
        }
    }

    public final Maybe<String> b(String str) {
        int i2 = 2 % 2;
        int i3 = f8617g + 125;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        Maybe<String> maybeSubscribeOn = this.f8621a.e().a(str).subscribeOn(Schedulers.io());
        int i5 = f8616f + 7;
        f8617g = i5 % 128;
        if (i5 % 2 != 0) {
            return maybeSubscribeOn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Completable e(d dVar) {
        int i2 = 2 % 2;
        int i3 = f8617g + 63;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        Completable completableA = this.f8621a.b().a(dVar);
        int i5 = f8616f + 115;
        f8617g = i5 % 128;
        if (i5 % 2 != 0) {
            return completableA;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Single<List<d>> b(List<h> list) {
        int i2 = 2 % 2;
        int i3 = f8617g + 27;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        Single<List<d>> singleB = this.f8621a.b().b(list);
        int i5 = f8617g + 97;
        f8616f = i5 % 128;
        if (i5 % 2 == 0) {
            return singleB;
        }
        throw null;
    }

    public final Single<List<d>> b(List<h> list, List<Long> list2) {
        int i2 = 2 % 2;
        int i3 = f8617g + 89;
        f8616f = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.f8621a.b().e(list, list2);
            throw null;
        }
        Single<List<d>> singleE = this.f8621a.b().e(list, list2);
        int i4 = f8616f + 123;
        f8617g = i4 % 128;
        if (i4 % 2 != 0) {
            return singleE;
        }
        obj.hashCode();
        throw null;
    }

    public final Completable c(d dVar) {
        int i2 = 2 % 2;
        int i3 = f8616f + 39;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        Completable completableD = this.f8621a.b().d(dVar);
        int i5 = f8616f + 97;
        f8617g = i5 % 128;
        int i6 = i5 % 2;
        return completableD;
    }

    public final String n() {
        int i2 = 2 % 2;
        int i3 = f8617g + 59;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        String string = this.f8623c.getString("prefsInterviewId", null);
        int i5 = f8617g + 125;
        f8616f = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    public final void d(String str) {
        int i2 = 2 % 2;
        int i3 = f8616f + 77;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        this.f8623c.edit().putString("prefsInterviewId", str).apply();
        int i5 = f8617g + 49;
        f8616f = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String l() {
        int i2 = 2 % 2;
        int i3 = f8616f + 99;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        String string = this.f8623c.getString("prefsExternalId", null);
        int i5 = f8616f + 53;
        f8617g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 64 / 0;
        }
        return string;
    }

    public final void f(String str) {
        int i2 = 2 % 2;
        int i3 = f8617g + 111;
        f8616f = i3 % 128;
        if (i3 % 2 == 0) {
            this.f8623c.edit().putString("prefsExternalId", str).apply();
            return;
        }
        this.f8623c.edit().putString("prefsExternalId", str).apply();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object g(Object[] objArr) {
        l lVar = (l) objArr[0];
        int i2 = 2 % 2;
        int i3 = f8617g + 13;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        String string = lVar.f8623c.getString("prefsExternalCustomerId", null);
        if (i4 != 0) {
            int i5 = 68 / 0;
        }
        int i6 = f8616f + 27;
        f8617g = i6 % 128;
        if (i6 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public final void g(String str) {
        int i2 = 2 % 2;
        int i3 = f8616f + 67;
        f8617g = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.f8623c.edit().putString("prefsExternalCustomerId", str).apply();
            int i4 = f8617g + 61;
            f8616f = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.f8623c.edit().putString("prefsExternalCustomerId", str).apply();
        obj.hashCode();
        throw null;
    }

    public final String o() {
        int i2 = 2 % 2;
        int i3 = f8617g + 75;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        String string = this.f8623c.getString("prefsLanguage", null);
        int i5 = f8617g + 23;
        f8616f = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    public final void j(String str) {
        int i2 = 2 % 2;
        int i3 = f8616f + 25;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        if (StringUtils.isNotBlank(str)) {
            this.f8623c.edit().putString("prefsLanguage", str).apply();
            int i5 = f8617g + 41;
            f8616f = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        this.f8623c.edit().remove("prefsLanguage").apply();
    }

    public final String m() {
        int i2 = 2 % 2;
        int i3 = f8617g + 69;
        f8616f = i3 % 128;
        Object obj = null;
        try {
        } catch (Exception e2) {
            Timber.e(e2);
        }
        if (i3 % 2 == 0) {
            String string = this.f8623c.getString(ae.b("prefsToken"), null);
            if (string != null) {
                String[] strArrSplit = string.substring(1, string.length() - 1).split(", ");
                byte[] bArr = new byte[strArrSplit.length];
                int i4 = 0;
                while (i4 < strArrSplit.length) {
                    int i5 = f8616f + 53;
                    f8617g = i5 % 128;
                    if (i5 % 2 == 0) {
                        bArr[i4] = Byte.parseByte(strArrSplit[i4]);
                        i4 += 96;
                    } else {
                        bArr[i4] = Byte.parseByte(strArrSplit[i4]);
                        i4++;
                    }
                }
                return ae.d(bArr, ae.d());
            }
            int i6 = f8616f + 9;
            f8617g = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 79 / 0;
            }
            return null;
        }
        this.f8623c.getString(ae.b("prefsToken"), null);
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object l(Object[] objArr) {
        l lVar = (l) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = f8616f + 79;
        f8617g = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                TextUtils.isEmpty(str);
                throw null;
            }
            if (TextUtils.isEmpty(str)) {
                lVar.f8623c.edit().putString(ae.b("prefsToken"), str).apply();
                return null;
            }
            int i4 = f8617g + 27;
            f8616f = i4 % 128;
            if (i4 % 2 != 0) {
                Object[] objArr2 = {str, ae.d()};
                lVar.f8623c.edit().putString(ae.b("prefsToken"), Arrays.toString((byte[]) ae.b(FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), 1880353, -1880352, objArr2))).apply();
                int i5 = 61 / 0;
            } else {
                Object[] objArr3 = {str, ae.d()};
                lVar.f8623c.edit().putString(ae.b("prefsToken"), Arrays.toString((byte[]) ae.b(FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), 1880353, -1880352, objArr3))).apply();
            }
            return null;
        } catch (UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e2) {
            Timber.e(e2);
            return null;
        }
    }

    @Deprecated
    public final String r() {
        String[] strArrSplit;
        byte[] bArr;
        int i2 = 2 % 2;
        try {
            String string = this.f8623c.getString(ae.b("prefsCustomerToken"), null);
            if (string != null) {
                int i3 = f8617g + 17;
                f8616f = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 1;
                if (string.length() > 1) {
                    int i6 = f8617g + 89;
                    f8616f = i6 % 128;
                    if (i6 % 2 != 0) {
                        strArrSplit = string.substring(0, string.length() >> 1).split(", ");
                        bArr = new byte[strArrSplit.length];
                    } else {
                        strArrSplit = string.substring(1, string.length() - 1).split(", ");
                        bArr = new byte[strArrSplit.length];
                        i5 = 0;
                    }
                    int i7 = f8616f + 125;
                    f8617g = i7 % 128;
                    int i8 = i7 % 2;
                    while (i5 < strArrSplit.length) {
                        int i9 = f8616f + 33;
                        f8617g = i9 % 128;
                        if (i9 % 2 == 0) {
                            bArr[i5] = Byte.parseByte(strArrSplit[i5]);
                            i5 += 77;
                        } else {
                            bArr[i5] = Byte.parseByte(strArrSplit[i5]);
                            i5++;
                        }
                    }
                    return ae.d(bArr, ae.d());
                }
            }
        } catch (UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e2) {
            Timber.e(e2);
        }
        return null;
    }

    @Deprecated
    public final void h(String str) {
        int i2 = 2 % 2;
        int i3 = f8616f + 59;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        try {
            if (!TextUtils.isEmpty(str)) {
                Object[] objArr = {str, ae.d()};
                this.f8623c.edit().putString(ae.b("prefsCustomerToken"), Arrays.toString((byte[]) ae.b(FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), 1880353, -1880352, objArr))).apply();
                return;
            }
            this.f8623c.edit().remove(ae.b("prefsCustomerToken")).apply();
            int i5 = f8616f + 9;
            f8617g = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        } catch (UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e2) {
            Timber.e(e2);
        }
    }

    private static /* synthetic */ Object B(Object[] objArr) {
        l lVar = (l) objArr[0];
        int i2 = 2 % 2;
        int i3 = f8617g + 23;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        String string = lVar.f8623c.getString("prefsInterviewToken", null);
        int i5 = f8616f + 17;
        f8617g = i5 % 128;
        if (i5 % 2 != 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }

    public final void l(String str) {
        int i2 = 2 % 2;
        int i3 = f8617g + 115;
        f8616f = i3 % 128;
        if (i3 % 2 == 0) {
            this.f8623c.edit().putString("prefsInterviewToken", str).apply();
            return;
        }
        this.f8623c.edit().putString("prefsInterviewToken", str).apply();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String p() {
        int i2 = 2 % 2;
        int i3 = f8616f + 39;
        f8617g = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            return this.f8623c.getString("prefsInterviewSessionId", null);
        }
        this.f8623c.getString("prefsInterviewSessionId", null);
        obj.hashCode();
        throw null;
    }

    public final String q() {
        int i2 = 2 % 2;
        int i3 = f8616f + 83;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        String string = this.f8623c.getString("prefsInterviewCode", null);
        int i5 = f8617g + 27;
        f8616f = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    public final void o(String str) {
        int i2 = 2 % 2;
        int i3 = f8616f + 47;
        f8617g = i3 % 128;
        if (i3 % 2 == 0) {
            this.f8623c.edit().putString("prefsInterviewCode", str).apply();
            int i4 = 32 / 0;
        } else {
            this.f8623c.edit().putString("prefsInterviewCode", str).apply();
        }
        int i5 = f8616f + 67;
        f8617g = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String t() {
        int i2 = 2 % 2;
        int i3 = f8616f + 79;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        String string = this.f8623c.getString("prefsIdCic", null);
        int i5 = f8616f + 11;
        f8617g = i5 % 128;
        if (i5 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public final void k(String str) {
        int i2 = 2 % 2;
        int i3 = f8616f + 25;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        this.f8623c.edit().putString("prefsIdCic", str).apply();
        int i5 = f8617g + 77;
        f8616f = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void n(String str) {
        int i2 = 2 % 2;
        int i3 = f8616f + 97;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        this.f8623c.edit().putString("prefsIdCicSecondId", str).apply();
        int i5 = f8616f + 99;
        f8617g = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object q(Object[] objArr) {
        l lVar = (l) objArr[0];
        int i2 = 2 % 2;
        int i3 = f8617g + 45;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        SharedPreferences sharedPreferences = lVar.f8623c;
        if (i4 != 0) {
            sharedPreferences.getString("prefsFullName", null);
            obj.hashCode();
            throw null;
        }
        String string = sharedPreferences.getString("prefsFullName", null);
        int i5 = f8617g + 109;
        f8616f = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    public final void t(String str) {
        int i2 = 2 % 2;
        int i3 = f8616f + 21;
        f8617g = i3 % 128;
        if (i3 % 2 != 0) {
            this.f8623c.edit().putString("prefsFullName", str).apply();
            return;
        }
        this.f8623c.edit().putString("prefsFullName", str).apply();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object h(Object[] objArr) {
        l lVar = (l) objArr[0];
        int i2 = 2 % 2;
        int i3 = f8617g + 43;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        SharedPreferences sharedPreferences = lVar.f8623c;
        if (i4 != 0) {
            sharedPreferences.getString("prefsFullNameSecondId", null);
            throw null;
        }
        String string = sharedPreferences.getString("prefsFullNameSecondId", null);
        int i5 = f8616f + 99;
        f8617g = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    public final String w() {
        int i2 = 2 % 2;
        int i3 = f8616f + 15;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        String string = this.f8623c.getString("prefsFirstName", null);
        int i5 = f8617g + 35;
        f8616f = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 / 0;
        }
        return string;
    }

    public final void r(String str) {
        int i2 = 2 % 2;
        int i3 = f8617g + 89;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        this.f8623c.edit().putString("prefsFirstName", str).apply();
        int i5 = f8616f + 13;
        f8617g = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void q(String str) {
        int i2 = 2 % 2;
        int i3 = f8617g + 25;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        this.f8623c.edit().putString("prefsFirstNameSecondId", str).apply();
        int i5 = f8617g + 53;
        f8616f = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 55 / 0;
        }
    }

    public final void s(String str) {
        int i2 = 2 % 2;
        int i3 = f8616f + 49;
        f8617g = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.f8623c.edit().putString("prefsPoaState", str).apply();
            int i4 = f8617g + 125;
            f8616f = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.f8623c.edit().putString("prefsPoaState", str).apply();
        throw null;
    }

    public final String y() {
        int i2 = 2 % 2;
        int i3 = f8616f + 95;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        String string = this.f8623c.getString("prefsPoaState", null);
        int i5 = f8616f + 105;
        f8617g = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    public final void w(String str) {
        int i2 = 2 % 2;
        int i3 = f8616f + 111;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        this.f8623c.edit().putString("prefsPoaCity", str).apply();
        int i5 = f8617g + 31;
        f8616f = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final String u() {
        int i2 = 2 % 2;
        int i3 = f8617g + 55;
        f8616f = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            return this.f8623c.getString("prefsPoaCity", null);
        }
        this.f8623c.getString("prefsPoaCity", null);
        obj.hashCode();
        throw null;
    }

    public final void u(String str) {
        int i2 = 2 % 2;
        int i3 = f8616f + 3;
        f8617g = i3 % 128;
        if (i3 % 2 == 0) {
            this.f8623c.edit().putString("prefsPoaPostalCode", str).apply();
            int i4 = 60 / 0;
        } else {
            this.f8623c.edit().putString("prefsPoaPostalCode", str).apply();
        }
    }

    public final String C() {
        String string;
        int i2 = 2 % 2;
        int i3 = f8616f + 55;
        f8617g = i3 % 128;
        if (i3 % 2 == 0) {
            string = this.f8623c.getString("prefsPoaPostalCode", null);
            int i4 = 5 / 0;
        } else {
            string = this.f8623c.getString("prefsPoaPostalCode", null);
        }
        int i5 = f8616f + 85;
        f8617g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 14 / 0;
        }
        return string;
    }

    public final void x(String str) {
        int i2 = 2 % 2;
        int i3 = f8616f + 71;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        this.f8623c.edit().putString("prefsPoaStreet", str).apply();
        int i5 = f8617g + 27;
        f8616f = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
    }

    public final String A() {
        int i2 = 2 % 2;
        int i3 = f8616f + 87;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        String string = this.f8623c.getString("prefsPoaStreet", null);
        int i5 = f8616f + 19;
        f8617g = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    public final String D() {
        int i2 = 2 % 2;
        int i3 = f8617g + 77;
        f8616f = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            return this.f8623c.getString("prefsGivenNameMrz", null);
        }
        this.f8623c.getString("prefsGivenNameMrz", null);
        obj.hashCode();
        throw null;
    }

    public final void y(String str) {
        int i2 = 2 % 2;
        int i3 = f8616f + 97;
        f8617g = i3 % 128;
        if (i3 % 2 == 0) {
            this.f8623c.edit().putString("prefsGivenNameMrz", str).apply();
            int i4 = 30 / 0;
        } else {
            this.f8623c.edit().putString("prefsGivenNameMrz", str).apply();
        }
        int i5 = f8616f + 73;
        f8617g = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void v(String str) {
        int i2 = 2 % 2;
        int i3 = f8617g + 25;
        f8616f = i3 % 128;
        if (i3 % 2 == 0) {
            this.f8623c.edit().putString("prefsGivenNameMrzSecondId", str).apply();
            return;
        }
        this.f8623c.edit().putString("prefsGivenNameMrzSecondId", str).apply();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String B() {
        int i2 = 2 % 2;
        int i3 = f8617g + 7;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        String string = this.f8623c.getString("prefsLastNameMrz", null);
        int i5 = f8616f + 53;
        f8617g = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    public final void z(String str) {
        int i2 = 2 % 2;
        int i3 = f8617g + 27;
        f8616f = i3 % 128;
        if (i3 % 2 != 0) {
            this.f8623c.edit().putString("prefsLastNameMrz", str).apply();
            int i4 = 72 / 0;
        } else {
            this.f8623c.edit().putString("prefsLastNameMrz", str).apply();
        }
    }

    public final void D(String str) {
        int i2 = 2 % 2;
        int i3 = f8616f + 97;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        this.f8623c.edit().putString("prefsLastNameMrzSecondId", str).apply();
        int i5 = f8616f + 69;
        f8617g = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String z() {
        int i2 = 2 % 2;
        int i3 = f8617g + 53;
        f8616f = i3 % 128;
        if (i3 % 2 != 0) {
            this.f8623c.getString("prefsMiddleName", null);
            throw null;
        }
        String string = this.f8623c.getString("prefsMiddleName", null);
        int i4 = f8616f + 15;
        f8617g = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
        return string;
    }

    public final void C(String str) {
        int i2 = 2 % 2;
        int i3 = f8616f + 59;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        this.f8623c.edit().putString("prefsMiddleName", str).apply();
        int i5 = f8616f + 87;
        f8617g = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void B(String str) {
        int i2 = 2 % 2;
        int i3 = f8616f + 1;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        this.f8623c.edit().putString("prefsMiddleNameSecondId", str).apply();
        int i5 = f8616f + 105;
        f8617g = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final String E() {
        int i2 = 2 % 2;
        int i3 = f8617g + 53;
        f8616f = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f8623c.getString("prefsLastName", null);
        }
        int i4 = 5 / 0;
        return this.f8623c.getString("prefsLastName", null);
    }

    private static /* synthetic */ Object v(Object[] objArr) {
        l lVar = (l) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = f8617g + 111;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        lVar.f8623c.edit().putString("prefsLastName", str).apply();
        int i5 = f8617g + 91;
        f8616f = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final void G(String str) {
        int i2 = 2 % 2;
        int i3 = f8617g + 57;
        f8616f = i3 % 128;
        if (i3 % 2 != 0) {
            this.f8623c.edit().putString("prefsLastNameSecondId", str).apply();
            int i4 = 17 / 0;
        } else {
            this.f8623c.edit().putString("prefsLastNameSecondId", str).apply();
        }
    }

    public final String H() {
        String string;
        int i2 = 2 % 2;
        int i3 = f8617g + 117;
        f8616f = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            string = this.f8623c.getString("prefsGender", null);
            int i4 = 11 / 0;
        } else {
            string = this.f8623c.getString("prefsGender", null);
        }
        int i5 = f8616f + 105;
        f8617g = i5 % 128;
        if (i5 % 2 != 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }

    public final void F(String str) {
        int i2 = 2 % 2;
        int i3 = f8617g + 49;
        f8616f = i3 % 128;
        if (i3 % 2 == 0) {
            this.f8623c.edit().putString("prefsGender", str).apply();
            int i4 = f8617g + 99;
            f8616f = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        this.f8623c.edit().putString("prefsGender", str).apply();
        throw null;
    }

    public final void E(String str) {
        int i2 = 2 % 2;
        int i3 = f8616f + 3;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        this.f8623c.edit().putString("prefsGenderSecondId", str).apply();
        int i5 = f8616f + 73;
        f8617g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 21 / 0;
        }
    }

    private static /* synthetic */ Object u(Object[] objArr) {
        l lVar = (l) objArr[0];
        int i2 = 2 % 2;
        int i3 = f8617g + 59;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        SharedPreferences sharedPreferences = lVar.f8623c;
        if (i4 != 0) {
            sharedPreferences.getString("prefsIssuingCountry", null);
            obj.hashCode();
            throw null;
        }
        String string = sharedPreferences.getString("prefsIssuingCountry", null);
        int i5 = f8616f + 125;
        f8617g = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    private static /* synthetic */ Object r(Object[] objArr) {
        l lVar = (l) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = f8617g + 37;
        f8616f = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            lVar.f8623c.edit().putString("prefsIssuingCountry", str).apply();
            return null;
        }
        lVar.f8623c.edit().putString("prefsIssuingCountry", str).apply();
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object n(Object[] objArr) {
        l lVar = (l) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = f8616f + 15;
        f8617g = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            lVar.f8623c.edit().putString("prefsIssuingCountrySecondId", str).apply();
            return null;
        }
        lVar.f8623c.edit().putString("prefsIssuingCountrySecondId", str).apply();
        obj.hashCode();
        throw null;
    }

    public final void N(String str) {
        int i2 = 2 % 2;
        int i3 = f8616f + 59;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        this.f8623c.edit().putString("prefsCurp", str).apply();
        int i5 = f8616f + 23;
        f8617g = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void M(String str) {
        int i2 = 2 % 2;
        int i3 = f8616f + 59;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        this.f8623c.edit().putString("prefsCurpSecondId", str).apply();
        int i5 = f8617g + 57;
        f8616f = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String G() {
        int i2 = 2 % 2;
        int i3 = f8617g + 19;
        f8616f = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            return this.f8623c.getString("prefsAddress", null);
        }
        this.f8623c.getString("prefsAddress", null);
        obj.hashCode();
        throw null;
    }

    public final void L(String str) {
        int i2 = 2 % 2;
        int i3 = f8616f + 5;
        f8617g = i3 % 128;
        if (i3 % 2 == 0) {
            this.f8623c.edit().putString("prefsAddress", str).apply();
            int i4 = 57 / 0;
        } else {
            this.f8623c.edit().putString("prefsAddress", str).apply();
        }
        int i5 = f8616f + 73;
        f8617g = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object j(Object[] objArr) {
        l lVar = (l) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = f8616f + 99;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        lVar.f8623c.edit().putString("prefsAddressSecondId", str).apply();
        int i5 = f8616f + 7;
        f8617g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 71 / 0;
        }
        return null;
    }

    public final String N() {
        int i2 = 2 % 2;
        int i3 = f8617g + 53;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        String string = this.f8623c.getString("prefsState", null);
        int i5 = f8617g + 7;
        f8616f = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    public final void K(String str) {
        int i2 = 2 % 2;
        int i3 = f8617g + 121;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        this.f8623c.edit().putString("prefsState", str).apply();
        int i5 = f8617g + 21;
        f8616f = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void S(String str) {
        int i2 = 2 % 2;
        int i3 = f8616f + 111;
        f8617g = i3 % 128;
        if (i3 % 2 != 0) {
            this.f8623c.edit().putString("prefsStateSecondId", str).apply();
            return;
        }
        this.f8623c.edit().putString("prefsStateSecondId", str).apply();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String L() {
        int i2 = 2 % 2;
        int i3 = f8617g + 25;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        String string = this.f8623c.getString("prefsCity", null);
        int i5 = f8616f + 9;
        f8617g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 20 / 0;
        }
        return string;
    }

    public final void Q(String str) {
        int i2 = 2 % 2;
        int i3 = f8616f + 51;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        this.f8623c.edit().putString("prefsCity", str).apply();
        int i5 = f8617g + 65;
        f8616f = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        l lVar = (l) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = f8616f + 21;
        f8617g = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            lVar.f8623c.edit().putString("prefsCitySecondId", str).apply();
            return null;
        }
        lVar.f8623c.edit().putString("prefsCitySecondId", str).apply();
        obj.hashCode();
        throw null;
    }

    public final String J() {
        int i2 = 2 % 2;
        int i3 = f8617g + 115;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        String string = this.f8623c.getString("prefsPostalCode", null);
        int i5 = f8617g + 3;
        f8616f = i5 % 128;
        if (i5 % 2 == 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }

    public final void P(String str) {
        int i2 = 2 % 2;
        int i3 = f8616f + 61;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        this.f8623c.edit().putString("prefsPostalCode", str).apply();
        int i5 = f8617g + 55;
        f8616f = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 77 / 0;
        }
    }

    public final void R(String str) {
        int i2 = 2 % 2;
        int i3 = f8617g + 53;
        f8616f = i3 % 128;
        if (i3 % 2 == 0) {
            this.f8623c.edit().putString("prefsPostalCodeSecondId", str).apply();
            int i4 = f8617g + 21;
            f8616f = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        this.f8623c.edit().putString("prefsPostalCodeSecondId", str).apply();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String K() {
        int i2 = 2 % 2;
        int i3 = f8616f + 27;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        String string = this.f8623c.getString("prefsStreet", null);
        int i5 = f8616f + 39;
        f8617g = i5 % 128;
        if (i5 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public final void W(String str) {
        int i2 = 2 % 2;
        int i3 = f8617g + 35;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        this.f8623c.edit().putString("prefsStreet", str).apply();
        int i5 = f8616f + 75;
        f8617g = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object s(Object[] objArr) {
        l lVar = (l) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = f8617g + 7;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        lVar.f8623c.edit().putString("prefsStreetSecondId", str).apply();
        int i5 = f8616f + 43;
        f8617g = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final String M() {
        int i2 = 2 % 2;
        int i3 = f8616f + 17;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        String string = this.f8623c.getString("prefsHouseNumber", null);
        int i5 = f8616f + 97;
        f8617g = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    private static /* synthetic */ Object w(Object[] objArr) {
        l lVar = (l) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = f8616f + 99;
        f8617g = i3 % 128;
        if (i3 % 2 == 0) {
            lVar.f8623c.edit().putString("prefsHouseNumber", str).apply();
            int i4 = 36 / 0;
        } else {
            lVar.f8623c.edit().putString("prefsHouseNumber", str).apply();
        }
        int i5 = f8617g + 41;
        f8616f = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public final String Q() {
        String string;
        int i2 = 2 % 2;
        int i3 = f8617g + 75;
        f8616f = i3 % 128;
        if (i3 % 2 != 0) {
            string = this.f8623c.getString("prefsBirthDate", null);
            int i4 = 66 / 0;
        } else {
            string = this.f8623c.getString("prefsBirthDate", null);
        }
        int i5 = f8616f + 113;
        f8617g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 39 / 0;
        }
        return string;
    }

    public final void X(String str) {
        int i2 = 2 % 2;
        int i3 = f8617g + 65;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        this.f8623c.edit().putString("prefsBirthDate", str).apply();
        int i5 = f8616f + 113;
        f8617g = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String S() {
        int i2 = 2 % 2;
        int i3 = f8617g + 111;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        String string = this.f8623c.getString("prefsBirthDateSecondId", null);
        int i5 = f8616f + 59;
        f8617g = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    public final void T(String str) {
        int i2 = 2 % 2;
        int i3 = f8616f + 41;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        this.f8623c.edit().putString("prefsBirthDateSecondId", str).apply();
        int i5 = f8616f + 89;
        f8617g = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String R() {
        int i2 = 2 % 2;
        int i3 = f8616f + 41;
        f8617g = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f8623c.getString("prefsDocumentNumber", null);
        }
        int i4 = 33 / 0;
        return this.f8623c.getString("prefsDocumentNumber", null);
    }

    private static /* synthetic */ Object i(Object[] objArr) {
        l lVar = (l) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = f8616f + 75;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        lVar.f8623c.edit().putString("prefsDocumentNumber", str).apply();
        int i5 = f8616f + 71;
        f8617g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 86 / 0;
        }
        return null;
    }

    public final String P() {
        int i2 = 2 % 2;
        int i3 = f8617g + 43;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        String string = this.f8623c.getString("prefsDocumentNumberSecondId", null);
        int i5 = f8617g + 55;
        f8616f = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    public final void ab(String str) {
        int i2 = 2 % 2;
        int i3 = f8616f + 51;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        this.f8623c.edit().putString("prefsDocumentNumberSecondId", str).apply();
        int i5 = f8617g + 29;
        f8616f = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String O() {
        int i2 = 2 % 2;
        int i3 = f8616f + 35;
        f8617g = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f8623c.getString("prefsExpireAt", null);
        }
        this.f8623c.getString("prefsExpireAt", null);
        throw null;
    }

    public final void Y(String str) {
        int i2 = 2 % 2;
        int i3 = f8616f + 117;
        f8617g = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.f8623c.edit().putString("prefsExpireAt", str).apply();
            int i4 = f8617g + 93;
            f8616f = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.f8623c.edit().putString("prefsExpireAt", str).apply();
        throw null;
    }

    public final String T() {
        int i2 = 2 % 2;
        int i3 = f8616f + 41;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        String string = this.f8623c.getString("prefsExpireAtSecondId", null);
        int i5 = f8616f + 29;
        f8617g = i5 % 128;
        if (i5 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public final void Z(String str) {
        int i2 = 2 % 2;
        int i3 = f8616f + 3;
        f8617g = i3 % 128;
        if (i3 % 2 == 0) {
            this.f8623c.edit().putString("prefsExpireAtSecondId", str).apply();
            int i4 = 73 / 0;
        } else {
            this.f8623c.edit().putString("prefsExpireAtSecondId", str).apply();
        }
    }

    private static /* synthetic */ Object y(Object[] objArr) {
        l lVar = (l) objArr[0];
        int i2 = 2 % 2;
        int i3 = f8617g + 51;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        String string = lVar.f8623c.getString("prefsCurrentLocation", null);
        int i5 = f8617g + 3;
        f8616f = i5 % 128;
        if (i5 % 2 == 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }

    public final void aa(String str) {
        int i2 = 2 % 2;
        int i3 = f8616f + 83;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        this.f8623c.edit().putString("prefsCurrentLocation", str).apply();
        int i5 = f8617g + 1;
        f8616f = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void b(SessionConfig sessionConfig) {
        int i2 = 2 % 2;
        int i3 = f8617g + 99;
        int i4 = i3 % 128;
        f8616f = i4;
        int i5 = i3 % 2;
        if (sessionConfig != null) {
            this.f8623c.edit().putString("prefsConfig.InterviewId", sessionConfig.getInterviewId()).putString("prefsConfig.ConfigurationId", sessionConfig.getConfigurationId()).putString("prefsConfig.QueueName", sessionConfig.getQueueName()).putBoolean("prefsConfig.E2eEncryptionEnabled", sessionConfig.isE2eEncryptionEnabled()).putString("prefsConfig.E2eEncryptionAlgorithm", sessionConfig.getE2eEncryptionAlgorithm().name()).apply();
            return;
        }
        int i6 = i4 + 55;
        f8617g = i6 % 128;
        int i7 = i6 % 2;
        this.f8623c.edit().remove("prefsConfig.InterviewId").remove("prefsConfig.ConfigurationId").remove("prefsConfig.QueueName").remove("prefsConfig.E2eEncryptionEnabled").remove("prefsConfig.E2eEncryptionAlgorithm").apply();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x002e A[EXC_TOP_SPLITTER, PHI: r3 r4
  0x002e: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v5 java.lang.String) binds: [B:25:0x002c, B:22:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x002e: PHI (r4v1 com.incode.welcome_sdk.SessionConfig$E2eEncryptionAlgorithm) = 
  (r4v0 com.incode.welcome_sdk.SessionConfig$E2eEncryptionAlgorithm)
  (r4v5 com.incode.welcome_sdk.SessionConfig$E2eEncryptionAlgorithm)
 binds: [B:25:0x002c, B:22:0x0021] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object m(java.lang.Object[] r7) {
        /*
            r5 = 0
            r6 = r7[r5]
            com.incode.welcome_sdk.data.local.l r6 = (com.incode.welcome_sdk.data.local.l) r6
            r7 = 2
            int r0 = r7 % r7
            int r0 = com.incode.welcome_sdk.data.local.l.f8617g
            int r3 = r0 + 11
            int r0 = r3 % 128
            com.incode.welcome_sdk.data.local.l.f8616f = r0
            int r3 = r3 % r7
            r2 = 0
            java.lang.String r1 = "prefsConfig.E2eEncryptionAlgorithm"
            if (r3 == 0) goto L24
            com.incode.welcome_sdk.SessionConfig$E2eEncryptionAlgorithm r4 = com.incode.welcome_sdk.SessionConfig.E2eEncryptionAlgorithm.SHA1
            android.content.SharedPreferences r0 = r6.f8623c
            java.lang.String r3 = r0.getString(r1, r2)
            r0 = 91
            int r0 = r0 / r5
            if (r3 == 0) goto L47
            goto L2e
        L24:
            com.incode.welcome_sdk.SessionConfig$E2eEncryptionAlgorithm r4 = com.incode.welcome_sdk.SessionConfig.E2eEncryptionAlgorithm.SHA1
            android.content.SharedPreferences r0 = r6.f8623c
            java.lang.String r3 = r0.getString(r1, r2)
            if (r3 == 0) goto L47
        L2e:
            com.incode.welcome_sdk.SessionConfig$E2eEncryptionAlgorithm r4 = com.incode.welcome_sdk.SessionConfig.E2eEncryptionAlgorithm.valueOf(r3)     // Catch: java.lang.IllegalArgumentException -> L33
            goto L3e
        L33:
            r2 = move-exception
            java.lang.String r1 = "Invalid E2eEncryptionAlgorithm value: %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r3}
            timber.log.Timber.e(r2, r1, r0)
            goto L47
        L3e:
            int r0 = com.incode.welcome_sdk.data.local.l.f8616f
            int r1 = r0 + 91
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.l.f8617g = r0
            int r1 = r1 % r7
        L47:
            com.incode.welcome_sdk.SessionConfig$Builder r2 = new com.incode.welcome_sdk.SessionConfig$Builder
            r2.<init>()
            android.content.SharedPreferences r1 = r6.f8623c
            java.lang.String r0 = "prefsConfig.InterviewId"
            java.lang.String r3 = ""
            java.lang.String r0 = r1.getString(r0, r3)
            com.incode.welcome_sdk.SessionConfig$Builder r2 = r2.setInterviewId(r0)
            android.content.SharedPreferences r1 = r6.f8623c
            java.lang.String r0 = "prefsConfig.ConfigurationId"
            java.lang.String r0 = r1.getString(r0, r3)
            com.incode.welcome_sdk.SessionConfig$Builder r2 = r2.setConfigurationId(r0)
            android.content.SharedPreferences r1 = r6.f8623c
            java.lang.String r0 = "prefsConfig.QueueName"
            java.lang.String r0 = r1.getString(r0, r3)
            com.incode.welcome_sdk.SessionConfig$Builder r2 = r2.setQueueName(r0)
            android.content.SharedPreferences r1 = r6.f8623c
            java.lang.String r0 = "prefsConfig.E2eEncryptionEnabled"
            boolean r0 = r1.getBoolean(r0, r5)
            com.incode.welcome_sdk.SessionConfig$Builder r0 = r2.setE2eEncryptionEnabled(r0)
            com.incode.welcome_sdk.SessionConfig$Builder r0 = r0.setE2eEncryptionAlgorithm(r4)
            com.incode.welcome_sdk.SessionConfig r0 = r0.build()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.l.m(java.lang.Object[]):java.lang.Object");
    }

    public final void b(CommonConfig commonConfig) {
        int i2 = 2 % 2;
        int i3 = f8617g + 85;
        int i4 = i3 % 128;
        f8616f = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (commonConfig != null) {
            this.f8623c.edit().putBoolean("prefsConfig.ShowCloseButton", commonConfig.isShowCloseButton()).putBoolean("prefsConfig.ShowConfirmation", commonConfig.isShowExitConfirmation()).putFloat("prefsConfig.RecognitionThreshold", commonConfig.getRecognitionThreshold()).putFloat("prefsConfig.SpoofThreshold", commonConfig.getSpoofThreshold()).putFloat("prefsConfig.IdGlareThreshold", commonConfig.getIdGlareThreshold()).putFloat("prefsConfig.IdBlurThreshold", commonConfig.getIdBlurThreshold()).putString("prefsConfig.LocalizationLanguage", commonConfig.getLocalizationLanguage()).putString("prefsConfig.themeConfiguration", com.incode.welcome_sdk.j.d(commonConfig.getThemeConfiguration())).putString("prefsConfig.uxConfiguration", IncodeUXConfig.toJson(commonConfig.getUXConfig())).putBoolean("prefsConfig.ShowDelayedOnboardingIntroScreen", commonConfig.isShowDelayedOnboardingIntroScreen()).apply();
            return;
        }
        int i5 = i4 + 47;
        f8617g = i5 % 128;
        int i6 = i5 % 2;
        this.f8623c.edit().remove("prefsConfig.ShowCloseButton").remove("prefsConfig.ShowConfirmation").remove("prefsConfig.RecognitionThreshold").remove("prefsConfig.SpoofThreshold").remove("prefsConfig.IdGlareThreshold").remove("prefsConfig.IdBlurThreshold").remove("prefsConfig.LocalizationLanguage").remove("prefsConfig.themeConfiguration").remove("prefsConfig.uxConfiguration").remove("prefsConfig.ShowDelayedOnboardingIntroScreen").apply();
    }

    public final CommonConfig V() {
        int i2 = 2 % 2;
        CommonConfig.Builder localizationLanguage = new CommonConfig.Builder().setShowCloseButton(this.f8623c.getBoolean("prefsConfig.ShowCloseButton", false)).setShowExitConfirmation(this.f8623c.getBoolean("prefsConfig.ShowConfirmation", true)).setRecognitionThreshold(this.f8623c.getFloat("prefsConfig.RecognitionThreshold", 0.6f)).setSpoofThreshold(this.f8623c.getFloat("prefsConfig.SpoofThreshold", 0.5f)).setIdGlareThreshold(this.f8623c.getFloat("prefsConfig.IdGlareThreshold", 0.3f)).setIdBlurThreshold(this.f8623c.getFloat("prefsConfig.IdBlurThreshold", 0.3f)).setLocalizationLanguage(this.f8623c.getString("prefsConfig.LocalizationLanguage", ""));
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        CommonConfig commonConfigBuild = localizationLanguage.setThemeConfiguration((ThemeConfiguration) c(new Object[]{this}, IdCaptureScreenKt.bg.d(), 1364775758, IdCaptureScreenKt.bg.d(), iD2, -1364775727, iD)).setUXConfig(IncodeUXConfig.fromJson(this.f8623c.getString("prefsConfig.uxConfiguration", "{}"))).setShowDelayedOnboardingIntroScreen(this.f8623c.getBoolean("prefsConfig.ShowDelayedOnboardingIntroScreen", true)).build();
        int i3 = f8616f + 93;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        return commonConfigBuild;
    }

    private static /* synthetic */ Object C(Object[] objArr) {
        l lVar = (l) objArr[0];
        int i2 = 2 % 2;
        int i3 = f8617g + 5;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        SharedPreferences sharedPreferences = lVar.f8623c;
        if (i4 == 0) {
            return com.incode.welcome_sdk.j.c(sharedPreferences.getString("prefsConfig.themeConfiguration", null));
        }
        com.incode.welcome_sdk.j.c(sharedPreferences.getString("prefsConfig.themeConfiguration", null));
        obj.hashCode();
        throw null;
    }

    public final void a(IdScanResult idScanResult) {
        int i2 = 2 % 2;
        int i3 = f8617g + 81;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        e("idFrontScanResult", idScanResult);
        int i5 = f8616f + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f8617g = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void e(IdScanResult idScanResult) {
        int i2 = 2 % 2;
        int i3 = f8617g + 83;
        f8616f = i3 % 128;
        if (i3 % 2 == 0) {
            e("idBackScanResult", idScanResult);
            return;
        }
        e("idBackScanResult", idScanResult);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final IdScanResult U() {
        int i2 = 2 % 2;
        int i3 = f8616f + 51;
        f8617g = i3 % 128;
        if (i3 % 2 == 0) {
            ae("idFrontScanResult");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        IdScanResult idScanResultAe = ae("idFrontScanResult");
        int i4 = f8616f + 111;
        f8617g = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
        return idScanResultAe;
    }

    public final IdScanResult aa() {
        int i2 = 2 % 2;
        int i3 = f8616f + 11;
        f8617g = i3 % 128;
        if (i3 % 2 == 0) {
            ae("idBackScanResult");
            throw null;
        }
        IdScanResult idScanResultAe = ae("idBackScanResult");
        int i4 = f8617g + 37;
        f8616f = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
        return idScanResultAe;
    }

    private void e(String str, IdScanResult idScanResult) {
        int i2 = 2 % 2;
        int i3 = f8617g + 99;
        f8616f = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (idScanResult == null) {
            this.f8623c.edit().putString(str, null).apply();
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("idImagePath", idScanResult.idImagePath);
            jSONObject.put("idImageBase64", idScanResult.idImageBase64);
            jSONObject.put("scanStatus", idScanResult.scanStatus);
            jSONObject.put("classifiedIdType", idScanResult.classifiedIdType);
            jSONObject.put("isOnlyFront", idScanResult.isOnlyFront);
            jSONObject.put("isOnlyBack", idScanResult.isOnlyBack);
            if (idScanResult.chosenIdType != null) {
                int i4 = f8617g + 37;
                f8616f = i4 % 128;
                int i5 = i4 % 2;
                jSONObject.put("chosenIdType", idScanResult.chosenIdType.ordinal());
            }
            if (idScanResult.idCategory != null) {
                int i6 = f8617g + 123;
                f8616f = i6 % 128;
                int i7 = i6 % 2;
                jSONObject.put("idCategory", idScanResult.idCategory.ordinal());
            }
            if (idScanResult.croppedFacePath != null) {
                int i8 = f8617g + 79;
                f8616f = i8 % 128;
                int i9 = i8 % 2;
                jSONObject.put("croppedFacePath", idScanResult.croppedFacePath);
            }
            if (idScanResult.issueName != null) {
                jSONObject.put("issueName", idScanResult.issueName);
            }
            if (idScanResult.issueYear != null) {
                int i10 = f8616f + 53;
                f8617g = i10 % 128;
                if (i10 % 2 == 0) {
                    jSONObject.put("issueYear", idScanResult.issueYear);
                    throw null;
                }
                jSONObject.put("issueYear", idScanResult.issueYear);
            }
            if (idScanResult.countryCode != null) {
                int i11 = f8616f + 83;
                f8617g = i11 % 128;
                int i12 = i11 % 2;
                jSONObject.put("countryCode", idScanResult.countryCode);
            }
            if (idScanResult.failReason != null) {
                jSONObject.put("failReason", idScanResult.failReason);
                int i13 = f8616f + 33;
                f8617g = i13 % 128;
                int i14 = i13 % 2;
            }
            jSONObject.put("skipBackIdCapture", idScanResult.skipBackIdCapture);
            if (idScanResult.metadata != null) {
                int i15 = f8616f + 123;
                f8617g = i15 % 128;
                int i16 = i15 % 2;
                jSONObject.put("metadata", idScanResult.metadata);
            }
            this.f8623c.edit().putString(str, jSONObject.toString()).apply();
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    private IdScanResult ae(String str) {
        int i2 = 2 % 2;
        int i3 = f8616f + 111;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        String string = this.f8623c.getString(str, null);
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                return new IdScanResult(jSONObject.optString("idImagePath"), jSONObject.optString("idImageBase64"), jSONObject.optInt("scanStatus", -1), IdScan.IdType.values()[jSONObject.optInt("chosenIdType", 0)], jSONObject.optString("classifiedIdType"), IdCategory.values()[jSONObject.optInt("idCategory", 0)], jSONObject.optBoolean("isOnlyFront", false), jSONObject.optBoolean("isOnlyBack", false), jSONObject.optString("croppedFacePath"), jSONObject.optString("issueName"), Integer.valueOf(jSONObject.optInt("issueYear")), jSONObject.optString("countryCode"), jSONObject.optString("failReason"), jSONObject.optBoolean("skipBackIdCapture"), null, jSONObject.optString("metadata"));
            } catch (JSONException e2) {
                e2.printStackTrace();
                return null;
            }
        }
        int i5 = f8617g + 115;
        f8616f = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final IdScan.IdType e(IdCategory idCategory) {
        int i2 = 2 % 2;
        int i3 = this.f8623c.getInt(c(idCategory), -1);
        if (i3 < 0) {
            return null;
        }
        int i4 = f8617g + 121;
        f8616f = i4 % 128;
        int i5 = i4 % 2;
        IdScan.IdType idType = IdScan.IdType.values()[i3];
        int i6 = f8617g + 39;
        f8616f = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 30 / 0;
        }
        return idType;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        l lVar = (l) objArr[0];
        IdScan.IdType idType = (IdScan.IdType) objArr[1];
        IdCategory idCategory = (IdCategory) objArr[2];
        int i2 = 2 % 2;
        if (idType != null) {
            lVar.f8623c.edit().putInt(c(idCategory), idType.ordinal()).apply();
            int i3 = f8617g + 63;
            f8616f = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 38 / 0;
            }
            return null;
        }
        int i5 = f8616f + 83;
        f8617g = i5 % 128;
        if (i5 % 2 == 0) {
            lVar.f8623c.edit().remove(c(idCategory)).apply();
            int i6 = 12 / 0;
        } else {
            lVar.f8623c.edit().remove(c(idCategory)).apply();
        }
        return null;
    }

    private static String c(IdCategory idCategory) {
        int i2 = 2 % 2;
        Object obj = null;
        if (idCategory == null) {
            int i3 = f8616f + 75;
            f8617g = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        String string = TextUtils.concat("user_chosen_id_type_", idCategory.toString()).toString();
        int i4 = f8616f + 5;
        f8617g = i4 % 128;
        if (i4 % 2 != 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }

    public final void a(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f8616f + 39;
        f8617g = i3 % 128;
        if (i3 % 2 != 0) {
            this.f8623c.edit().putBoolean("prefsExternalTokenUsage", z2).apply();
            return;
        }
        this.f8623c.edit().putBoolean("prefsExternalTokenUsage", z2).apply();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean Z() {
        int i2 = 2 % 2;
        int i3 = f8617g + 105;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.f8623c.getBoolean("prefsExternalTokenUsage", false);
        int i5 = f8616f + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f8617g = i5 % 128;
        if (i5 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public final void e(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f8616f + 53;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        this.f8623c.edit().putBoolean("prefsConfig.ShowRetakeScreenForManualCapture", z2).apply();
        int i5 = f8617g + 11;
        f8616f = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        l lVar = (l) objArr[0];
        int i2 = 2 % 2;
        int i3 = f8616f + 113;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = lVar.f8623c.getBoolean("prefsConfig.ShowRetakeScreenForManualCapture", true);
        int i5 = f8616f + 19;
        f8617g = i5 % 128;
        if (i5 % 2 != 0) {
            return Boolean.valueOf(z2);
        }
        throw null;
    }

    public final void b(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f8616f + 117;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        this.f8623c.edit().putBoolean("prefsConfig.ShowRetakeScreenForAutoCapture", z2).apply();
        int i5 = f8616f + 67;
        f8617g = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final boolean ab() {
        int i2 = 2 % 2;
        int i3 = f8616f + 37;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        return this.f8623c.getBoolean("prefsConfig.ShowRetakeScreenForAutoCapture", false);
    }

    private static /* synthetic */ Object t(Object[] objArr) {
        l lVar = (l) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i2 = 2 % 2;
        int i3 = f8617g + 83;
        f8616f = i3 % 128;
        if (i3 % 2 != 0) {
            lVar.f8623c.edit().putBoolean("prefsConfig.EnableRotationOnRetakeScreen", zBooleanValue).apply();
            int i4 = 91 / 0;
            return null;
        }
        lVar.f8623c.edit().putBoolean("prefsConfig.EnableRotationOnRetakeScreen", zBooleanValue).apply();
        return null;
    }

    public final boolean ac() {
        int i2 = 2 % 2;
        int i3 = f8617g + 77;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.f8623c.getBoolean("prefsConfig.EnableRotationOnRetakeScreen", true);
        int i5 = f8616f + 89;
        f8617g = i5 % 128;
        if (i5 % 2 != 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void d(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f8617g + 19;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        this.f8623c.edit().putBoolean("prefsConfig.EnableNfcSymbolConfirmationScreen", z2).apply();
        int i5 = f8617g + 1;
        f8616f = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean ah() {
        int i2 = 2 % 2;
        int i3 = f8617g + 47;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.f8623c.getBoolean("prefsConfig.EnableNfcSymbolConfirmationScreen", true);
        int i5 = f8617g + 123;
        f8616f = i5 % 128;
        if (i5 % 2 == 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean ag() {
        int i2 = 2 % 2;
        int i3 = f8617g + 125;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        return this.f8623c.getBoolean("prefsConfig.NfcShowTutorials", true);
    }

    public final void j(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f8616f + 79;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        this.f8623c.edit().putBoolean("prefsConfig.NfcShowTutorials", z2).apply();
        int i5 = f8616f + 75;
        f8617g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 48 / 0;
        }
    }

    public final int ae() {
        int i2 = 2 % 2;
        int i3 = f8617g + 19;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.f8623c.getInt("prefsConfig.NfcMaxRetries", 5);
        int i6 = f8616f + 21;
        f8617g = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void a(int i2) {
        int i3 = 2 % 2;
        int i4 = f8616f + 107;
        f8617g = i4 % 128;
        int i5 = i4 % 2;
        this.f8623c.edit().putInt("prefsConfig.NfcMaxRetries", i2).apply();
        int i6 = f8617g + 3;
        f8616f = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void f(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f8617g + 85;
        f8616f = i3 % 128;
        if (i3 % 2 == 0) {
            this.f8623c.edit().putBoolean("prefsConfig.ProcessNfcData", z2).apply();
            int i4 = f8617g + 5;
            f8616f = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        this.f8623c.edit().putBoolean("prefsConfig.ProcessNfcData", z2).apply();
        throw null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        l lVar = (l) objArr[0];
        int i2 = 2 % 2;
        int i3 = f8617g + 51;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = lVar.f8623c.getBoolean("prefsConfig.ProcessNfcData", true);
        int i5 = f8616f + 71;
        f8617g = i5 % 128;
        if (i5 % 2 != 0) {
            return Boolean.valueOf(z2);
        }
        int i6 = 92 / 0;
        return Boolean.valueOf(z2);
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        l lVar = (l) objArr[0];
        IdScan.IdType idType = (IdScan.IdType) objArr[1];
        int i2 = 2 % 2;
        Object obj = null;
        if (idType != null) {
            lVar.f8623c.edit().putInt("prefsConfig.NfcIdType", idType.ordinal()).apply();
            int i3 = f8617g + 59;
            f8616f = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        int i5 = f8617g + 25;
        f8616f = i5 % 128;
        if (i5 % 2 == 0) {
            lVar.f8623c.edit().remove("prefsConfig.NfcIdType").apply();
            return null;
        }
        lVar.f8623c.edit().remove("prefsConfig.NfcIdType").apply();
        obj.hashCode();
        throw null;
    }

    public final IdScan.IdType ad() {
        int i2 = 2 % 2;
        int i3 = f8616f + 37;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.f8623c.getInt("prefsConfig.NfcIdType", -1);
        if (i5 < 0) {
            return null;
        }
        int i6 = f8616f + 31;
        f8617g = i6 % 128;
        if (i6 % 2 != 0) {
            return IdScan.IdType.values()[i5];
        }
        int i7 = 10 / 0;
        return IdScan.IdType.values()[i5];
    }

    public final boolean aj() {
        int i2 = 2 % 2;
        int i3 = f8617g + 117;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.f8623c.getBoolean("prefsConfig.ReturnNfcResultImmediately", false);
        int i5 = f8617g + 31;
        f8616f = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 / 0;
        }
        return z2;
    }

    public final void g(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f8617g + 67;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        this.f8623c.edit().putBoolean("prefsConfig.ReturnNfcResultImmediately", z2).apply();
        int i5 = f8616f + 105;
        f8617g = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Single<Map<String, Boolean>> ak() {
        int i2 = 2 % 2;
        int i3 = f8616f + 15;
        f8617g = i3 % 128;
        if (i3 % 2 != 0) {
            Single<Map<String, Boolean>> map = this.f8621a.d().c().flatMapObservable(new Function() { // from class: com.incode.welcome_sdk.data.local.l$$ExternalSyntheticLambda4
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return Observable.fromIterable((List) obj);
                }
            }).toMap(new Function() { // from class: com.incode.welcome_sdk.data.local.l$$ExternalSyntheticLambda5
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return l.d((i) obj);
                }
            }, new Function() { // from class: com.incode.welcome_sdk.data.local.l$$ExternalSyntheticLambda6
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return l.c((i) obj);
                }
            });
            int i4 = f8617g + 23;
            f8616f = i4 % 128;
            if (i4 % 2 == 0) {
                return map;
            }
            throw null;
        }
        this.f8621a.d().c().flatMapObservable(new Function() { // from class: com.incode.welcome_sdk.data.local.l$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return Observable.fromIterable((List) obj);
            }
        }).toMap(new Function() { // from class: com.incode.welcome_sdk.data.local.l$$ExternalSyntheticLambda5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return l.d((i) obj);
            }
        }, new Function() { // from class: com.incode.welcome_sdk.data.local.l$$ExternalSyntheticLambda6
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return l.c((i) obj);
            }
        });
        throw null;
    }

    public static /* synthetic */ Boolean c(i iVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f8617g + 85;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        Boolean boolValueOf = Boolean.valueOf(iVar.b());
        if (i4 != 0) {
            int i5 = 49 / 0;
        }
        int i6 = f8617g + 97;
        f8616f = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 30 / 0;
        }
        return boolValueOf;
    }

    private static /* synthetic */ Object k(Object[] objArr) {
        i iVar = (i) objArr[0];
        int i2 = 2 % 2;
        int i3 = f8616f + 83;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        String strD = iVar.d();
        int i5 = f8617g + 103;
        f8616f = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
        return strD;
    }

    public static /* synthetic */ void b(Long l2) throws Exception {
        int i2 = 2 % 2;
        int i3 = f8616f + 7;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ void b(Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = f8617g + 111;
        f8616f = i3 % 128;
        if (i3 % 2 != 0) {
            Timber.e(th, "Error occurred while persisting feature config.", new Object[1]);
        } else {
            Timber.e(th, "Error occurred while persisting feature config.", new Object[0]);
        }
        int i4 = f8617g + 85;
        f8616f = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ void b(Map.Entry entry) throws Exception {
        int i2 = 2 % 2;
        this.f8621a.d().a(new i(0L, (String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue())).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.data.local.l$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                l.b((Long) obj);
            }
        }, new Consumer() { // from class: com.incode.welcome_sdk.data.local.l$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                l.b((Throwable) obj);
            }
        });
        int i3 = f8616f + 33;
        f8617g = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void d(Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = f8617g + 109;
        f8616f = i3 % 128;
        if (i3 % 2 != 0) {
            Timber.e(th, "Error occurred while persisting feature config.", new Object[0]);
        } else {
            Timber.e(th, "Error occurred while persisting feature config.", new Object[0]);
        }
        int i4 = f8617g + 103;
        f8616f = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void au() throws Exception {
        int i2 = 2 % 2;
        int i3 = f8617g + 11;
        f8616f = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void e(Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = f8616f + 69;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        Timber.e(th, "Error occurred while deleting feature config.", new Object[0]);
        int i5 = f8617g + 121;
        f8616f = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void am() {
        int i2 = 2 % 2;
        int i3 = f8616f + 57;
        f8617g = i3 % 128;
        if (i3 % 2 == 0) {
            this.f8622b.add(this.f8621a.d().b().subscribeOn(Schedulers.io()).subscribe(new Action() { // from class: com.incode.welcome_sdk.data.local.l$$ExternalSyntheticLambda7
                @Override // io.reactivex.functions.Action
                public final void run() throws Exception {
                    l.au();
                }
            }, new Consumer() { // from class: com.incode.welcome_sdk.data.local.l$$ExternalSyntheticLambda8
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    l.e((Throwable) obj);
                }
            }));
            throw null;
        }
        this.f8622b.add(this.f8621a.d().b().subscribeOn(Schedulers.io()).subscribe(new Action() { // from class: com.incode.welcome_sdk.data.local.l$$ExternalSyntheticLambda7
            @Override // io.reactivex.functions.Action
            public final void run() throws Exception {
                l.au();
            }
        }, new Consumer() { // from class: com.incode.welcome_sdk.data.local.l$$ExternalSyntheticLambda8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                l.e((Throwable) obj);
            }
        }));
        int i4 = f8616f + 33;
        f8617g = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object o(Object[] objArr) {
        l lVar = (l) objArr[0];
        bh bhVar = (bh) objArr[1];
        int i2 = 2 % 2;
        int i3 = f8616f + 29;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        SharedPreferences.Editor editorEdit = lVar.f8623c.edit();
        int iC = IncodeWelcome$getWrappedDelayedOnboardingListener$1.c();
        int iC2 = IncodeWelcome$getWrappedDelayedOnboardingListener$1.c();
        int iC3 = IncodeWelcome$getWrappedDelayedOnboardingListener$1.c();
        SharedPreferences.Editor editorPutInt = editorEdit.putInt("prefsConfig.IdCaptureTimeout", ((Integer) bh.e(iC, IncodeWelcome$getWrappedDelayedOnboardingListener$1.c(), 1059690612, iC2, new Object[]{bhVar}, iC3, -1059690610)).intValue()).putInt("prefsConfig.IdDetectionTimeout", bhVar.d());
        int iC4 = IncodeWelcome$getWrappedDelayedOnboardingListener$1.c();
        int iC5 = IncodeWelcome$getWrappedDelayedOnboardingListener$1.c();
        int iC6 = IncodeWelcome$getWrappedDelayedOnboardingListener$1.c();
        SharedPreferences.Editor editorPutBoolean = editorPutInt.putInt("prefsConfig.SelfieCaptureTimeout", ((Integer) bh.e(iC4, IncodeWelcome$getWrappedDelayedOnboardingListener$1.c(), -780312722, iC5, new Object[]{bhVar}, iC6, 780312723)).intValue()).putInt("prefsConfig.IdCaptureRetries", bhVar.i()).putInt("prefsConfig.SelfieCaptureRetries", bhVar.g()).putBoolean("prefsConfig.OptInEnabled", bhVar.k());
        int iC7 = IncodeWelcome$getWrappedDelayedOnboardingListener$1.c();
        int iC8 = IncodeWelcome$getWrappedDelayedOnboardingListener$1.c();
        int iC9 = IncodeWelcome$getWrappedDelayedOnboardingListener$1.c();
        editorPutBoolean.putString("prefsConfig.OptInCompanyName", (String) bh.e(iC7, IncodeWelcome$getWrappedDelayedOnboardingListener$1.c(), 1905909278, iC8, new Object[]{bhVar}, iC9, -1905909278)).apply();
        int i5 = f8617g + 75;
        f8616f = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final bh ai() {
        int i2 = 2 % 2;
        bh bhVar = new bh(this.f8623c.getInt("prefsConfig.IdCaptureTimeout", -1), this.f8623c.getInt("prefsConfig.IdDetectionTimeout", -1), this.f8623c.getInt("prefsConfig.SelfieCaptureTimeout", -1), this.f8623c.getInt("prefsConfig.IdCaptureRetries", -1), this.f8623c.getInt("prefsConfig.SelfieCaptureRetries", -1), this.f8623c.getBoolean("prefsConfig.OptInEnabled", false), this.f8623c.getString("prefsConfig.OptInCompanyName", null));
        int i3 = f8616f + 53;
        f8617g = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 40 / 0;
        }
        return bhVar;
    }

    private static /* synthetic */ Object p(Object[] objArr) {
        l lVar = (l) objArr[0];
        int i2 = 2 % 2;
        ActivityManager activityManager = (ActivityManager) lVar.f8624d.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        JSONObject jSONObject = new JSONObject();
        int i3 = f8616f + 39;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        try {
            jSONObject.put("crossApp", true);
            jSONObject.put("totalRam", memoryInfo.totalMem);
            jSONObject.put("availableRam", memoryInfo.availMem);
            int i5 = f8617g + 109;
            f8616f = i5 % 128;
            int i6 = i5 % 2;
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return new DeviceFingerprint(jSONObject.toString(), "ANDROID", Build.MODEL, Settings.Secure.getString(lVar.f8624d.getContentResolver(), "android_id"), r.e(), Build.VERSION.SDK_INT, "5.40.3");
    }

    public final boolean ap() {
        int i2 = 2 % 2;
        int i3 = f8617g + 97;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.f8623c.getBoolean("prefsCameraPermissionRequest", false);
        int i5 = f8617g + 7;
        f8616f = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 38 / 0;
        }
        return z2;
    }

    public final void i(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f8616f + 15;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        this.f8623c.edit().putBoolean("prefsCameraPermissionRequest", z2).apply();
        int i5 = f8616f + 97;
        f8617g = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void ag(String str) {
        int i2 = 2 % 2;
        int i3 = f8616f + 31;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        if (str == null) {
            this.f8623c.edit().remove("prefsVideoRecordingId").apply();
            int i5 = f8616f + 21;
            f8617g = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 98 / 0;
                return;
            }
            return;
        }
        this.f8623c.edit().putString("prefsVideoRecordingId", str).apply();
    }

    public final String ao() {
        int i2 = 2 % 2;
        int i3 = f8617g + 45;
        f8616f = i3 % 128;
        int i4 = i3 % 2;
        String string = this.f8623c.getString("prefsVideoRecordingId", null);
        int i5 = f8616f + 123;
        f8617g = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0022, code lost:
    
        if (com.incode.welcome_sdk.commons.utils.StringUtils.isBlank(r5) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0024, code lost:
    
        r1 = com.incode.welcome_sdk.data.local.l.f8617g + 33;
        com.incode.welcome_sdk.data.local.l.f8616f = r1 % 128;
        r1 = r1 % 2;
        r6.f8623c.edit().remove("prefsPrefillPhoneNumber").apply();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003a, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
    
        if (com.incode.welcome_sdk.commons.utils.StringUtils.isBlank(r5) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0042, code lost:
    
        r6.f8623c.edit().putString("prefsPrefillPhoneNumber", r5).apply();
        r1 = com.incode.welcome_sdk.data.local.l.f8617g + 43;
        com.incode.welcome_sdk.data.local.l.f8616f = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        if ((r1 % 2) != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object f(java.lang.Object[] r8) {
        /*
            r7 = 0
            r6 = r8[r7]
            com.incode.welcome_sdk.data.local.l r6 = (com.incode.welcome_sdk.data.local.l) r6
            r0 = 1
            r5 = r8[r0]
            java.lang.String r5 = (java.lang.String) r5
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.data.local.l.f8616f
            int r1 = r0 + 47
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.l.f8617g = r0
            int r1 = r1 % r4
            java.lang.String r3 = "prefsPrefillPhoneNumber"
            r2 = 0
            if (r1 != 0) goto L3b
            boolean r1 = com.incode.welcome_sdk.commons.utils.StringUtils.isBlank(r5)
            r0 = 14
            int r0 = r0 / r7
            if (r1 == 0) goto L42
        L24:
            int r0 = com.incode.welcome_sdk.data.local.l.f8617g
            int r1 = r0 + 33
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.l.f8616f = r0
            int r1 = r1 % r4
            android.content.SharedPreferences r0 = r6.f8623c
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.remove(r3)
            r0.apply()
            return r2
        L3b:
            boolean r0 = com.incode.welcome_sdk.commons.utils.StringUtils.isBlank(r5)
            if (r0 == 0) goto L42
            goto L24
        L42:
            android.content.SharedPreferences r0 = r6.f8623c
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putString(r3, r5)
            r0.apply()
            int r0 = com.incode.welcome_sdk.data.local.l.f8617g
            int r1 = r0 + 43
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.l.f8616f = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L5b
            return r2
        L5b:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.l.f(java.lang.Object[]):java.lang.Object");
    }

    public final String an() {
        String string;
        int i2 = 2 % 2;
        int i3 = f8617g + 87;
        f8616f = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            string = this.f8623c.getString("prefsPrefillPhoneNumber", null);
            int i4 = 13 / 0;
        } else {
            string = this.f8623c.getString("prefsPrefillPhoneNumber", null);
        }
        int i5 = f8617g + 109;
        f8616f = i5 % 128;
        if (i5 % 2 == 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }

    public final String ar() {
        int i2 = 2 % 2;
        int i3 = f8616f + 83;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        String string = this.f8623c.getString("prefsFaceAuthenticationHint", "");
        int i5 = f8616f + 91;
        f8617g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 80 / 0;
        }
        return string;
    }

    public final void af(String str) {
        int i2 = 2 % 2;
        int i3 = f8616f + 111;
        f8617g = i3 % 128;
        int i4 = i3 % 2;
        this.f8623c.edit().putString("prefsFaceAuthenticationHint", str).apply();
        int i5 = f8616f + 43;
        f8617g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 65 / 0;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f8616f = 0;
        f8617g = 1;
        f8615e = new char[]{64015, 64040, 64037, 64041, 64034, 64035, 64021, 64052, 64020, 64047, 64033, 64053, 64016};
        f8620j = -1867973690;
        f8618h = true;
        f8619i = true;
    }

    public static /* synthetic */ String d(i iVar) throws Exception {
        Object[] objArr = {iVar};
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        return (String) c(objArr, IdCaptureScreenKt.bg.d(), 1386496465, IdCaptureScreenKt.bg.d(), iD2, -1386496452, iD);
    }

    public final void ad(String str) throws Throwable {
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        c(new Object[]{this, str}, IdCaptureScreenKt.bg.d(), -2140880259, IdCaptureScreenKt.bg.d(), iD2, 2140880266, iD);
    }

    public final DeviceFingerprint al() {
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        return (DeviceFingerprint) c(new Object[]{this}, IdCaptureScreenKt.bg.d(), -190501947, IdCaptureScreenKt.bg.d(), iD2, 190501963, iD);
    }

    public final void d(bh bhVar) throws Throwable {
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        c(new Object[]{this, bhVar}, IdCaptureScreenKt.bg.d(), -568122801, IdCaptureScreenKt.bg.d(), iD2, 568122813, iD);
    }

    public final void d(Map<String, Boolean> map) throws Throwable {
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        c(new Object[]{this, map}, IdCaptureScreenKt.bg.d(), 1517304500, IdCaptureScreenKt.bg.d(), iD2, -1517304472, iD);
    }

    public final void a(IdScan.IdType idType) throws Throwable {
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        c(new Object[]{this, idType}, IdCaptureScreenKt.bg.d(), -1856403293, IdCaptureScreenKt.bg.d(), iD2, 1856403298, iD);
    }

    public final boolean af() {
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        return ((Boolean) c(new Object[]{this}, IdCaptureScreenKt.bg.d(), -570893616, IdCaptureScreenKt.bg.d(), iD2, 570893618, iD)).booleanValue();
    }

    public final void c(boolean z2) throws Throwable {
        Object[] objArr = {this, Boolean.valueOf(z2)};
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        c(objArr, IdCaptureScreenKt.bg.d(), 1415169583, IdCaptureScreenKt.bg.d(), iD2, -1415169565, iD);
    }

    public final boolean Y() {
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        return ((Boolean) c(new Object[]{this}, IdCaptureScreenKt.bg.d(), -1790794432, IdCaptureScreenKt.bg.d(), iD2, 1790794435, iD)).booleanValue();
    }

    public final void e(IdScan.IdType idType, IdCategory idCategory) throws Throwable {
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        c(new Object[]{this, idType, idCategory}, IdCaptureScreenKt.bg.d(), -2010743696, IdCaptureScreenKt.bg.d(), iD2, 2010743696, iD);
    }

    private ThemeConfiguration aq() {
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        return (ThemeConfiguration) c(new Object[]{this}, IdCaptureScreenKt.bg.d(), 1364775758, IdCaptureScreenKt.bg.d(), iD2, -1364775727, iD);
    }

    public final SessionConfig X() {
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        return (SessionConfig) c(new Object[]{this}, IdCaptureScreenKt.bg.d(), -1976679355, IdCaptureScreenKt.bg.d(), iD2, 1976679366, iD);
    }

    public final String W() {
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        return (String) c(new Object[]{this}, IdCaptureScreenKt.bg.d(), 1284818193, IdCaptureScreenKt.bg.d(), iD2, -1284818168, iD);
    }

    public final void ac(String str) throws Throwable {
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        c(new Object[]{this, str}, IdCaptureScreenKt.bg.d(), 628589234, IdCaptureScreenKt.bg.d(), iD2, -628589226, iD);
    }

    public final void V(String str) throws Throwable {
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        c(new Object[]{this, str}, IdCaptureScreenKt.bg.d(), 1439940989, IdCaptureScreenKt.bg.d(), iD2, -1439940962, iD);
    }

    public final void U(String str) throws Throwable {
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        c(new Object[]{this, str}, IdCaptureScreenKt.bg.d(), 1100190799, IdCaptureScreenKt.bg.d(), iD2, -1100190779, iD);
    }

    public final void O(String str) throws Throwable {
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        c(new Object[]{this, str}, IdCaptureScreenKt.bg.d(), 1399392376, IdCaptureScreenKt.bg.d(), iD2, -1399392372, iD);
    }

    public final void J(String str) throws Throwable {
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        c(new Object[]{this, str}, IdCaptureScreenKt.bg.d(), -1186198374, IdCaptureScreenKt.bg.d(), iD2, 1186198384, iD);
    }

    public final String I() {
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        return (String) c(new Object[]{this}, IdCaptureScreenKt.bg.d(), 1655469593, IdCaptureScreenKt.bg.d(), iD2, -1655469561, iD);
    }

    public final void H(String str) throws Throwable {
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        c(new Object[]{this, str}, IdCaptureScreenKt.bg.d(), -1299927848, IdCaptureScreenKt.bg.d(), iD2, 1299927862, iD);
    }

    public final void I(String str) throws Throwable {
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        c(new Object[]{this, str}, IdCaptureScreenKt.bg.d(), -980866501, IdCaptureScreenKt.bg.d(), iD2, 980866520, iD);
    }

    public final String F() {
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        return (String) c(new Object[]{this}, IdCaptureScreenKt.bg.d(), -521630438, IdCaptureScreenKt.bg.d(), iD2, 521630464, iD);
    }

    public final void A(String str) throws Throwable {
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        c(new Object[]{this, str}, IdCaptureScreenKt.bg.d(), 1006838269, IdCaptureScreenKt.bg.d(), iD2, -1006838245, iD);
    }

    public final void p(String str) throws Throwable {
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        c(new Object[]{this, str}, IdCaptureScreenKt.bg.d(), -733612198, IdCaptureScreenKt.bg.d(), iD2, 733612215, iD);
    }

    public final String x() {
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        return (String) c(new Object[]{this}, IdCaptureScreenKt.bg.d(), -1048009840, IdCaptureScreenKt.bg.d(), iD2, 1048009849, iD);
    }

    public final String v() {
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        return (String) c(new Object[]{this}, IdCaptureScreenKt.bg.d(), -1100990969, IdCaptureScreenKt.bg.d(), iD2, 1100990991, iD);
    }

    public final void m(String str) throws Throwable {
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        c(new Object[]{this, str}, IdCaptureScreenKt.bg.d(), 1624993600, IdCaptureScreenKt.bg.d(), iD2, -1624993579, iD);
    }

    public final String s() {
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        return (String) c(new Object[]{this}, IdCaptureScreenKt.bg.d(), -227128498, IdCaptureScreenKt.bg.d(), iD2, 227128527, iD);
    }

    public final void i(String str) throws Throwable {
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        c(new Object[]{this, str}, IdCaptureScreenKt.bg.d(), 1414907619, IdCaptureScreenKt.bg.d(), iD2, -1414907604, iD);
    }

    public final String k() {
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        return (String) c(new Object[]{this}, IdCaptureScreenKt.bg.d(), -307163058, IdCaptureScreenKt.bg.d(), iD2, 307163064, iD);
    }

    public final Completable c(String str) {
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        return (Completable) c(new Object[]{this, str}, IdCaptureScreenKt.bg.d(), 446111069, IdCaptureScreenKt.bg.d(), iD2, -446111039, iD);
    }

    public final String h() {
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        return (String) c(new Object[]{this}, IdCaptureScreenKt.bg.d(), -877935218, IdCaptureScreenKt.bg.d(), iD2, 877935241, iD);
    }

    public final File d() {
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        return (File) c(new Object[]{this}, IdCaptureScreenKt.bg.d(), 1417893301, IdCaptureScreenKt.bg.d(), iD2, -1417893300, iD);
    }
}
