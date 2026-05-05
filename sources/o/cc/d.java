package o.cc;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.ExifDirectoryBase;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import o.a.g;
import o.a.h;
import o.a.i;
import o.a.k;
import o.a.m;
import o.a.n;
import o.a.o;
import o.a.q;
import o.ac.a;
import o.aw.b;
import o.ay.a;
import o.ba.c;
import o.ea.f;
import o.en.b;
import o.en.e;
import o.z.a;
import okio.Utf8;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f22072a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f22073b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f22074d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f22075e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f22076f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f22077g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f22078h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f22079j = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final b f22080c;

    private static String $$c(byte b2, byte b3, short s2) {
        byte[] bArr = $$a;
        int i2 = (s2 * 4) + 4;
        int i3 = b2 * 2;
        int i4 = 122 - b3;
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4 += -i3;
            i2++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i4;
            if (i5 == i3) {
                return new String(bArr2, 0);
            }
            i4 += -bArr[i2];
            i2++;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22078h = 0;
        f22076f = 1;
        f22079j = 0;
        f22077g = 1;
        b();
        ViewConfiguration.getScrollBarSize();
        TextUtils.getCapsMode("", 0, 0);
        int i2 = f22078h + 17;
        f22076f = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public d(b bVar) {
        this.f22080c = bVar;
    }

    static void b() {
        f22073b = 740602047300126166L;
        f22074d = 1564493270;
        f22072a = (char) 12882;
        f22075e = -1270219390;
    }

    private static void i(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        String str4 = str2;
        String str5 = str;
        String str6 = str3;
        int i3 = 2 % 2;
        Object charArray = str6;
        if (str6 != null) {
            int i4 = $10 + 59;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 99 / 0;
                charArray = str6.toCharArray();
            } else {
                charArray = str6.toCharArray();
            }
        }
        char[] cArr = (char[]) charArray;
        Object obj = str4;
        if (str4 != null) {
            char[] charArray2 = str4.toCharArray();
            int i6 = $10 + 125;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            obj = charArray2;
        }
        char[] cArr2 = (char[]) obj;
        Object charArray3 = str5;
        if (str5 != null) {
            charArray3 = str5.toCharArray();
        }
        i iVar = new i();
        int length = cArr.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(cArr, 0, cArr3, 0, length);
        System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c2);
        cArr4[2] = (char) (cArr4[2] + ((char) i2));
        int length3 = ((char[]) charArray3).length;
        char[] cArr5 = new char[length3];
        iVar.f19932b = 0;
        while (iVar.f19932b < length3) {
            try {
                Object[] objArr2 = {iVar};
                Object objA = o.d.d.a(540069882);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a(ExpandableListView.getPackedPositionChild(0L) + 107, (char) TextUtils.getTrimmedLength(""), 11 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -155898465, false, $$c(b2, (byte) (57 | b2), b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = o.d.d.a(2068572);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = o.d.d.a(847 - Drawable.resolveOpacity(0, 0), (char) (ImageFormat.getBitsPerPixel(0) + 6489), View.MeasureSpec.getSize(0) + 12, -694521287, false, $$c(b3, (byte) ((-1) - (((-1) - b3) & ((-1) - 54))), b3), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA3 = o.d.d.a(-1122996612);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = o.d.d.a(458 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 11, 1804962841, false, $$c(b4, (byte) ((-1) - (((-1) - b4) & ((-1) - 56))), b4), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = o.d.d.a(-1223178239);
                if (objA4 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objA4 = o.d.d.a(639 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (65100 - Gravity.getAbsoluteGravity(0, 0)), 12 - View.MeasureSpec.getMode(0), 1636969060, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r9[iVar.f19932b])) ^ (f22073b ^ 740602047300126166L)) ^ ((long) ((int) (((long) f22074d) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f22072a) ^ 740602047300126166L))));
                iVar.f19932b++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str7 = new String(cArr5);
        int i8 = $11 + 103;
        $10 = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
        objArr[0] = str7;
    }

    static void init$0() {
        $$a = new byte[]{117, -6, 58, MessagePack.Code.MAP32};
        $$b = 153;
    }

    private static void k(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            int i6 = $11 + 17;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i8 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(f22075e)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a(270 - TextUtils.getTrimmedLength(""), (char) (ViewConfiguration.getTouchSlop() >> 8), TextUtils.getCapsMode("", 0, 0) + 11, -2071844881, false, $$c(b2, (byte) ((-1) - (((-1) - b2) & ((-1) - 7))), b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = o.d.d.a(Color.rgb(0, 0, 0) + 16777738, (char) TextUtils.getTrimmedLength(""), 12 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 627984172, false, $$c(b3, (byte) (9 | b3), b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i4 > 0) {
            int i9 = $11 + 47;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            nVar.f19945b = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
        }
        if (z2) {
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = o.d.d.a(-202660535);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = o.d.d.a(View.MeasureSpec.getMode(0) + 522, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 12 - Drawable.resolveOpacity(0, 0), 627984172, false, $$c(b4, (byte) ((-1) - (((-1) - b4) & ((-1) - 9))), b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public final void b(Context context, o.ep.d dVar, boolean z2, final c cVar) throws WalletValidationException {
        int i2 = 2 % 2;
        int i3 = f22079j + 95;
        f22077g = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            Object[] objArr = new Object[1];
            i((char) (29827 - TextUtils.getCapsMode("", 0, 0)), "㜆\ue18a朠⢜\udc9aꤛꍭả\ue3b9쯶揦䨆−锈醕ᵯ쨓", "\u0000\u0000\u0000\u0000", "岡쨃菱䱴", (ViewConfiguration.getLongPressTimeout() >> 16) - 238419108, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            i((char) (Process.myTid() >> 22), "㤕⯗邺惵낂ᩔ䴇ፖꀯ矿넨ᔟ잴ય韴당ྚ珧洇툀清ﾜ᭺｣ܕ", "\u0000\u0000\u0000\u0000", "頧딺ゔ칋", (-1800062313) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        if (context == null) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.Mandatory;
            Object[] objArr3 = new Object[1];
            i((char) (ViewConfiguration.getFadingEdgeLength() >> 16), "뿆⳻ﶮ撣툝큥蜕", "\u0000\u0000\u0000\u0000", "\uef35羈荿߬", 2139064559 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr3);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr3[0]).intern());
        }
        if (this.f22080c.s()) {
            new o.ba.c(context, new c.d() { // from class: o.cc.d.2
                private static final byte[] $$a = null;
                private static final int $$b = 0;
                private static final byte[] $$c = null;
                private static final int $$d = 0;
                private static int $10 = 0;
                private static int $11 = 0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static char[] f22086b = null;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static char f22087c = 0;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static long f22088e = 0;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private static int f22089f = 0;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public static int f22090g = 0;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private static int f22091h = 0;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public static int f22092i = 0;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public static int f22093j = 0;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public static int f22094k = 0;

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0011). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static java.lang.String $$e(int r6, byte r7, int r8) {
                    /*
                        int r0 = r8 * 4
                        int r8 = 1 - r0
                        int r2 = r7 + 4
                        int r0 = r6 + 71
                        byte[] r7 = o.cc.d.AnonymousClass2.$$c
                        byte[] r6 = new byte[r8]
                        r5 = 0
                        if (r7 != 0) goto L28
                        r3 = r8
                        r4 = r5
                    L11:
                        int r0 = -r0
                        int r0 = r0 + r3
                        r3 = r4
                    L14:
                        int r2 = r2 + 1
                        byte r1 = (byte) r0
                        int r4 = r3 + 1
                        r6[r3] = r1
                        if (r4 != r8) goto L23
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r6, r5)
                        return r0
                    L23:
                        r1 = r7[r2]
                        r3 = r0
                        r0 = r1
                        goto L11
                    L28:
                        r3 = r5
                        goto L14
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.cc.d.AnonymousClass2.$$e(int, byte, int):java.lang.String");
                }

                static {
                    init$1();
                    $10 = 0;
                    $11 = 1;
                    f22094k = -1674735129;
                    f22093j = 2042707067;
                    f22092i = 1210190001;
                    f22090g = -762568322;
                    init$0();
                    f22089f = 0;
                    f22091h = 1;
                    f22088e = 6942009706545908169L;
                    f22086b = new char[]{64590, 64584, 64588, 64599, 64614, 64597, 64580, 64592, 64587, 64578, 64627, 64611, 64582, 64585, 64577, 64598, 64634, 64594, 64604, 64576, 64586, 64609, 64583, 64522, 64593};
                    f22087c = (char) 51642;
                }

                public static Object[] a(int i5, int i6) throws Throwable {
                    Object[] objArr4;
                    Object[] objArr5;
                    char c2;
                    String line;
                    boolean zEquals;
                    boolean zEquals2;
                    File file;
                    FileReader fileReader;
                    BufferedReader bufferedReader;
                    File file2;
                    File file3;
                    int i7 = 2 % 2;
                    Object obj = null;
                    try {
                        Object[] objArr6 = new Object[1];
                        m((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 19, "\u0000\u0011\u0018\u0010\u0002\f㘔㘔\u0012\u0004\u0000\u0018㘋㘋\u0011\u000e\u0004\u0018㘕", (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24), objArr6);
                        Object[] objArr7 = new Object[1];
                        m(18 - Color.alpha(0), "\u0010\u0007\u0004\u0016\u0003\u0007\u0006\u000e\u0017\u0000\u0018\u0010\u0002\f㘉㘉\u0012\u0004", (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 11), objArr7);
                        String[] strArr = {((String) objArr6[0]).intern(), ((String) objArr7[0]).intern()};
                        int i8 = 0;
                        while (true) {
                            if (i8 >= 2) {
                                objArr4 = new Object[]{new int[]{i ^ (i << 5)}, new int[]{i5}, null, new int[]{i5}};
                                int i9 = f22090g * (-179340432);
                                f22090g = i9;
                                int i10 = ~((-802889) | i9);
                                int i11 = ~((677345133 + i9) - (677345133 & i9));
                                int i12 = (-969598748) + (((i10 + i11) - (i10 & i11)) * 69);
                                int i13 = ~(((-140396109) + i9) - ((-140396109) & i9));
                                int i14 = i6 + ((i12 + (((~((i9 + 537751913) - (i9 & 537751913))) | ((i13 + 139593220) - (i13 & 139593220))) * (-69))) - 1605222939);
                                int i15 = i14 ^ (i14 << 13);
                                int i16 = i15 ^ (i15 >>> 17);
                                break;
                            }
                            String str = strArr[i8];
                            Object[] objArr8 = new Object[1];
                            l("蓧锫Ꝥ놽쏥\udc20\uee70\uf8fd૱ᬮ㔶䞣凇戃籙躌", 4547 - Color.argb(0, 0, 0, 0), objArr8);
                            Class<?> cls = Class.forName(((String) objArr8[0]).intern());
                            if (((Boolean) cls.getMethod(str, new Class[0]).invoke(cls, null)).booleanValue()) {
                                objArr4 = new Object[]{new int[1], new int[]{i5}, null, new int[]{i5 ^ 1}};
                                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                                int i17 = ~iFreeMemory;
                                int i18 = 1356832976 + (((~((163141890 + i17) - (163141890 & i17))) | 841289912) * 226);
                                int i19 = (~(((-841289913) + iFreeMemory) - ((-841289913) & iFreeMemory))) | 2166784;
                                int i20 = ~((i17 + 1002265018) - (i17 & 1002265018));
                                int i21 = i6 + i18 + (((i20 + i19) - (i20 & i19)) * (-113)) + ((~(iFreeMemory | 163141890)) * 113) + 16;
                                int i22 = i21 ^ (i21 << 13);
                                int i23 = i22 ^ (i22 >>> 17);
                                ((int[]) objArr4[0])[0] = i23 ^ (i23 << 5);
                                break;
                            }
                            i8++;
                        }
                    } catch (Exception unused) {
                        objArr4 = new Object[]{new int[]{i ^ (i << 5)}, new int[]{i5}, null, new int[]{i5 ^ 2}};
                        int i24 = f22092i * (-1417930749);
                        f22092i = i24;
                        int i25 = ~((~i24) | 223240704);
                        int i26 = i6 + (((71442944 + i25) - (71442944 & i25)) * (-970)) + 43387829 + (((-1) - (((-1) - i25) & ((-1) - 151797760))) * 970) + 16;
                        int i27 = i26 ^ (i26 << 13);
                        int i28 = i27 ^ (i27 >>> 17);
                    }
                    if (i5 != ((int[]) objArr4[3])[0]) {
                        int i29 = f22089f + 55;
                        f22091h = i29 % 128;
                        if (i29 % 2 != 0) {
                            return objArr4;
                        }
                        obj.hashCode();
                        throw null;
                    }
                    try {
                        Object objA = o.d.d.a(26976634);
                        if (objA == null) {
                            int offsetAfter = TextUtils.getOffsetAfter("", 0) + ExifDirectoryBase.TAG_TILE_LENGTH;
                            char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            int iResolveOpacity = 11 - Drawable.resolveOpacity(0, 0);
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            Object[] objArr9 = new Object[1];
                            n(b2, b3, b3, objArr9);
                            objA = o.d.d.a(offsetAfter, keyRepeatTimeout, iResolveOpacity, -685882593, false, (String) objArr9[0], new Class[0]);
                        }
                        long jLongValue = ((Long) ((Method) objA).invoke(null, null)).longValue();
                        long j2 = 880253535;
                        long j3 = (((long) (-589)) * j2) + (((long) 591) * jLongValue);
                        long j4 = 590;
                        long j5 = -1;
                        long j6 = jLongValue ^ j5;
                        long j7 = i5;
                        long j8 = j7 ^ j5;
                        long j9 = ((j6 + j8) - (j6 & j8)) ^ j5;
                        long j10 = (j6 | j2) ^ j5;
                        long j11 = (-1) - (((-1) - ((j9 + j10) - (j9 & j10))) & ((-1) - ((j8 | j2) ^ j5)));
                        long j12 = j2 ^ j5;
                        long j13 = j3 + (((-1) - (((-1) - j11) & ((-1) - (((-1) - (((-1) - ((j12 + jLongValue) - (j12 & jLongValue))) & ((-1) - j7))) ^ j5)))) * j4) + (((long) (-1180)) * j11) + (j4 * ((-1) - (((-1) - (j5 ^ (j8 | jLongValue))) & ((-1) - (((-1) - (((-1) - j12) & ((-1) - j8))) ^ j5))))) + ((long) (-1418534693));
                        int iMyTid = Process.myTid();
                        int i30 = ~iMyTid;
                        int i31 = ~((-1363907545) | i30);
                        int i32 = ~(((-73318867) + iMyTid) - ((-73318867) & iMyTid));
                        int i33 = (-1) - (((-1) - ((int) (j13 >> 32))) | ((-1) - ((((-2055567968) + (((i31 + 73318866) - (i31 & 73318866)) * 226)) + (((~((-1) - (((-1) - i30) & ((-1) - (-1359024649))))) | ((i32 + 68435970) - (i32 & 68435970))) * (-113))) + ((~(iMyTid | (-1363907545))) * 113))));
                        int i34 = ~i5;
                        if ((-1) - (((-1) - i33) & ((-1) - (((int) j13) & ((((((-1) - (((-1) - (~((-1) - (((-1) - (-1920877287)) & ((-1) - i34))))) & ((-1) - 1076363392))) | (~((936863599 + i34) - (936863599 & i34)))) * (-397)) + 554646368) + ((1168713097 | i5) * 397))))) == 1) {
                            int i35 = f22089f + 77;
                            f22091h = i35 % 128;
                            int i36 = i35 % 2;
                            objArr5 = new Object[]{new int[]{i ^ (i << 5)}, new int[]{i5}, null, new int[]{i5 ^ 10}};
                            int i37 = f22093j * (-283910208);
                            f22093j = i37;
                            int i38 = ~i37;
                            int i39 = 1935305857 + ((~((-1) - (((-1) - 475723515) & ((-1) - i38)))) * 52);
                            int i40 = ~((-1) - (((-1) - (-475055355)) & ((-1) - i38)));
                            int i41 = i6 + i39 + (((-1) - (((-1) - (~((203092667 + i38) - (203092667 & i38)))) & ((-1) - ((i40 + 272630848) - (i40 & 272630848))))) * (-52)) + (((~(i38 | (-203092668))) | 668161) * 52) + 16;
                            int i42 = i41 ^ (i41 << 13);
                            int i43 = i42 ^ (i42 >>> 17);
                            c2 = 0;
                        } else {
                            objArr5 = new Object[]{new int[]{i ^ (i << 5)}, new int[]{i5}, null, new int[]{i5}};
                            int i44 = f22094k * 1712690109;
                            f22094k = i44;
                            int i45 = ~(1014791914 | i44);
                            int i46 = i6 + (((i45 + 67118752) - (i45 & 67118752)) * 449) + 910087328 + (((-1) - (((-1) - (~((~i44) | 1014791914))) & ((-1) - 67118752))) * 449);
                            int i47 = i46 ^ (i46 << 13);
                            int i48 = i47 ^ (i47 >>> 17);
                            c2 = 0;
                        }
                        if (i5 != ((int[]) objArr5[3])[c2]) {
                            int i49 = f22089f + 95;
                            f22091h = i49 % 128;
                            if (i49 % 2 != 0) {
                                return objArr5;
                            }
                            throw null;
                        }
                        try {
                            Object[] objArr10 = new Object[1];
                            l("蒩\ue566䟙ꁌ˥挲춑⿱衰\ueac8䭔뗸ᘆ炔틮㍮鷑﹪墤뤝ᮛ藪\ue64d䃝ꄩϲ氋칲⣠襓\uebd9吥뚒ᜪ煴폭㱋黚Ｑ妑", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 24979, objArr10);
                            file3 = new File(((String) objArr10[0]).intern());
                        } catch (Exception unused2) {
                        }
                        if ((!file3.canRead() ? 'R' : '$') != '$') {
                            line = null;
                        } else {
                            fileReader = new FileReader(file3);
                            bufferedReader = new BufferedReader(fileReader);
                            try {
                                line = bufferedReader.readLine();
                                Object[] objArr11 = new Object[1];
                                m(3 - (ViewConfiguration.getLongPressTimeout() >> 16), "\u0005\u0017㘾", (byte) (84 - TextUtils.indexOf("", "", 0, 0)), objArr11);
                                if (line.equals(((String) objArr11[0]).intern())) {
                                    fileReader.close();
                                    bufferedReader.close();
                                    line = null;
                                } else {
                                    int i50 = f22091h + 95;
                                    f22089f = i50 % 128;
                                    if ((i50 % 2 != 0 ? (char) 7 : 'G') == 7) {
                                        fileReader.close();
                                        bufferedReader.close();
                                        throw null;
                                    }
                                    fileReader.close();
                                    bufferedReader.close();
                                }
                            } finally {
                            }
                        }
                        try {
                            Object[] objArr12 = new Object[1];
                            l("蒩屢美\ufdde爑\uf018皛\uf4d4椝\uef0c涏\ue3fc怨\ue671撵\udaf9役\udd6d厸퇳嘣푤䫝켢䵛쎝䇕옋䑆몊㣄", TextUtils.getTrimmedLength("") + 32189, objArr12);
                            file2 = new File(((String) objArr12[0]).intern());
                        } catch (Exception unused3) {
                            zEquals = false;
                        }
                        if (file2.canRead()) {
                            fileReader = new FileReader(file2);
                            bufferedReader = new BufferedReader(fileReader);
                            try {
                                String line2 = bufferedReader.readLine();
                                Object[] objArr13 = new Object[1];
                                l("蒷", Process.getGidForName("") + 7868, objArr13);
                                zEquals = line2.equals(((String) objArr13[0]).intern());
                                fileReader.close();
                                bufferedReader.close();
                            } finally {
                            }
                        } else {
                            zEquals = false;
                        }
                        if (zEquals) {
                            try {
                                Object[] objArr14 = new Object[1];
                                m(36 - KeyEvent.normalizeMetaState(0), "\u0014\u0012\u0013\u0010\u0014\u0003\u0012\u0004\t\u0012\u0012\u0003\u0013\u0018\u0002\f\b\u0018\u0017\u0004\u0007\u000b\u0003\u0007\b\u0018\u0017\u0004\u0007\u000b\u0003\u0007\u0006\u0013\u0017\u0005", (byte) (TextUtils.lastIndexOf("", '0') + 43), objArr14);
                                file = new File(((String) objArr14[0]).intern());
                            } catch (Exception unused4) {
                                zEquals2 = false;
                            }
                            if (file.canRead()) {
                                fileReader = new FileReader(file);
                                bufferedReader = new BufferedReader(fileReader);
                                try {
                                    String line3 = bufferedReader.readLine();
                                    Object[] objArr15 = new Object[1];
                                    l("蒷", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 7867, objArr15);
                                    zEquals2 = line3.equals(((String) objArr15[0]).intern());
                                    fileReader.close();
                                    bufferedReader.close();
                                } finally {
                                }
                            } else {
                                zEquals2 = false;
                            }
                            if (zEquals2) {
                                int i51 = f22089f;
                                int i52 = i51 + 55;
                                f22091h = i52 % 128;
                                if (i52 % 2 == 0) {
                                    Object obj2 = null;
                                    obj2.hashCode();
                                    throw null;
                                }
                                if (line != null) {
                                    int i53 = i51 + 49;
                                    f22091h = i53 % 128;
                                    int i54 = i53 % 2;
                                    Object[] objArr16 = {new int[]{i ^ (i << 5)}, new int[]{i5}, line, new int[]{i5 ^ 20}};
                                    int i55 = i6 + (((21045285 | r2) * (-196)) - 1727975959) + (((~((-1) - (((-1) - 163932205) & ((-1) - i5)))) | 142886920) * 196) + 16;
                                    int i56 = i55 ^ (i55 << 13);
                                    int i57 = i56 ^ (i56 >>> 17);
                                    return objArr16;
                                }
                            }
                        }
                        Object[] objArr17 = {new int[]{i ^ (i << 5)}, new int[]{i5}, null, new int[]{i5}};
                        int i58 = i6 + ((((~((-299732223) | i34)) | (~((-1) - (((-1) - i5) & ((-1) - 378415799))))) * 959) - 1173712005) + (((~(i5 | (-299732223))) | (~((i34 + 378415799) - (i34 & 378415799)))) * 959);
                        int i59 = i58 ^ (i58 << 13);
                        int i60 = i59 ^ (i59 >>> 17);
                        return objArr17;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }

                static void init$0() {
                    $$a = new byte[]{Ascii.VT, -11, 98, 72};
                    $$b = 153;
                }

                static void init$1() {
                    $$c = new byte[]{120, 46, 101, 90};
                    $$d = 71;
                }

                private static void l(String str, int i5, Object[] objArr4) throws Throwable {
                    Object charArray;
                    String str2 = str;
                    int i6 = 2 % 2;
                    if (str2 != null) {
                        int i7 = $11 + 21;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                        charArray = str2.toCharArray();
                    } else {
                        charArray = str2;
                    }
                    char[] cArr = (char[]) charArray;
                    q qVar = new q();
                    qVar.f19949d = i5;
                    int length = cArr.length;
                    long[] jArr = new long[length];
                    qVar.f19948a = 0;
                    while (qVar.f19948a < cArr.length) {
                        int i9 = qVar.f19948a;
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                            Object objA = o.d.d.a(-1011865131);
                            if (objA == null) {
                                byte b2 = (byte) 0;
                                byte b3 = (byte) (b2 - 1);
                                objA = o.d.d.a((Process.myTid() >> 22) + 731, (char) (7933 - Color.red(0)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 11, 355847088, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                            }
                            jArr[i9] = ((Long) ((Method) objA).invoke(null, objArr5)).longValue() ^ (f22088e ^ 4743694005979712847L);
                            Object[] objArr6 = {qVar, qVar};
                            Object objA2 = o.d.d.a(1452497747);
                            if (objA2 == null) {
                                byte b4 = (byte) (-1);
                                objA2 = o.d.d.a(836 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (TextUtils.indexOf("", "") + 27279), 11 - (ViewConfiguration.getPressedStateDuration() >> 16), -2145994442, false, $$e((byte) ($$d & 31), b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objA2).invoke(null, objArr6);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    char[] cArr2 = new char[length];
                    qVar.f19948a = 0;
                    while (qVar.f19948a < cArr.length) {
                        cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                        Object[] objArr7 = {qVar, qVar};
                        Object objA3 = o.d.d.a(1452497747);
                        if (objA3 == null) {
                            int maxKeyCode = 836 - (KeyEvent.getMaxKeyCode() >> 16);
                            char cIndexOf = (char) (27278 - TextUtils.indexOf((CharSequence) "", '0'));
                            int maximumFlingVelocity = 11 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int i10 = $$d;
                            byte b5 = (byte) (-1);
                            objA3 = o.d.d.a(maxKeyCode, cIndexOf, maximumFlingVelocity, -2145994442, false, $$e((byte) ((i10 + 31) - (i10 | 31)), b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA3).invoke(null, objArr7);
                    }
                    String str3 = new String(cArr2);
                    int i11 = $11 + 33;
                    $10 = i11 % 128;
                    if (i11 % 2 == 0) {
                        objArr4[0] = str3;
                    } else {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }

                private static void m(int i5, String str, byte b2, Object[] objArr4) throws Throwable {
                    int i6;
                    String str2 = str;
                    int i7 = 2 % 2;
                    Object charArray = str2;
                    if (str2 != null) {
                        int i8 = $10 + 95;
                        $11 = i8 % 128;
                        if (i8 % 2 == 0) {
                            str2.toCharArray();
                            throw null;
                        }
                        charArray = str2.toCharArray();
                    }
                    char[] cArr = (char[]) charArray;
                    h hVar = new h();
                    char[] cArr2 = f22086b;
                    int i9 = 421932776;
                    long j2 = 0;
                    int i10 = 1;
                    if (cArr2 != null) {
                        int i11 = $11 + 23;
                        $10 = i11 % 128;
                        int i12 = i11 % 2;
                        int length = cArr2.length;
                        char[] cArr3 = new char[length];
                        int i13 = 0;
                        while (i13 < length) {
                            try {
                                Object[] objArr5 = {Integer.valueOf(cArr2[i13])};
                                Object objA = o.d.d.a(i9);
                                if (objA == null) {
                                    byte b3 = (byte) (-1);
                                    objA = o.d.d.a(271 - (ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1)), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > j2 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j2 ? 0 : -1)) + 1), (ExpandableListView.getPackedPositionForChild(0, 0) > j2 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j2 ? 0 : -1)) + 12, -811348851, false, $$e((byte) 31, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                                }
                                cArr3[i13] = ((Character) ((Method) objA).invoke(null, objArr5)).charValue();
                                i13++;
                                i9 = 421932776;
                                j2 = 0;
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
                    Object[] objArr6 = {Integer.valueOf(f22087c)};
                    Object objA2 = o.d.d.a(421932776);
                    char c2 = '\n';
                    if (objA2 == null) {
                        byte b4 = (byte) (-1);
                        objA2 = o.d.d.a(270 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) Color.alpha(0), 10 - MotionEvent.axisFromString(""), -811348851, false, $$e((byte) 31, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA2).invoke(null, objArr6)).charValue();
                    char[] cArr4 = new char[i5];
                    char c3 = 7;
                    if (i5 % 2 != 0) {
                        int i14 = $10 + 7;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                        i6 = i5 - 1;
                        cArr4[i6] = (char) (cArr[i6] - b2);
                    } else {
                        i6 = i5;
                    }
                    if (i6 > 1) {
                        int i16 = $10 + 35;
                        $11 = i16 % 128;
                        int i17 = i16 % 2;
                        hVar.f19926b = 0;
                        while (hVar.f19926b < i6) {
                            hVar.f19927c = cArr[hVar.f19926b];
                            hVar.f19925a = cArr[hVar.f19926b + i10];
                            if (hVar.f19927c == hVar.f19925a) {
                                cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                                cArr4[hVar.f19926b + i10] = (char) (hVar.f19925a - b2);
                                int i18 = $10 + 17;
                                $11 = i18 % 128;
                                int i19 = i18 % 2;
                            } else {
                                Object[] objArr7 = new Object[13];
                                objArr7[12] = hVar;
                                objArr7[11] = Integer.valueOf(cCharValue);
                                objArr7[c2] = hVar;
                                objArr7[9] = hVar;
                                objArr7[8] = Integer.valueOf(cCharValue);
                                objArr7[c3] = hVar;
                                objArr7[6] = hVar;
                                objArr7[5] = Integer.valueOf(cCharValue);
                                objArr7[4] = hVar;
                                objArr7[3] = hVar;
                                objArr7[2] = Integer.valueOf(cCharValue);
                                objArr7[i10] = hVar;
                                objArr7[0] = hVar;
                                Object objA3 = o.d.d.a(219124184);
                                if (objA3 == null) {
                                    byte b5 = (byte) (-1);
                                    objA3 = o.d.d.a(825 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 11 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -611683395, false, $$e((byte) 40, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objA3).invoke(null, objArr7)).intValue() == hVar.f19930g) {
                                    int i20 = $10 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                                    $11 = i20 % 128;
                                    int i21 = i20 % 2;
                                    Object[] objArr8 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                                    Object objA4 = o.d.d.a(-634864343);
                                    if (objA4 == null) {
                                        byte b6 = (byte) (-1);
                                        c3 = 7;
                                        c2 = '\n';
                                        objA4 = o.d.d.a(218 - TextUtils.getCapsMode("", 0, 0), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), Gravity.getAbsoluteGravity(0, 0) + 11, 212688716, false, $$e((byte) 38, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    } else {
                                        c3 = 7;
                                        c2 = '\n';
                                    }
                                    int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr8)).intValue();
                                    int i22 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                                    cArr4[hVar.f19926b] = cArr2[iIntValue];
                                    cArr4[hVar.f19926b + 1] = cArr2[i22];
                                } else {
                                    c3 = 7;
                                    c2 = '\n';
                                    if (hVar.f19928d == hVar.f19929e) {
                                        int i23 = $10 + 83;
                                        $11 = i23 % 128;
                                        int i24 = i23 % 2;
                                        hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                                        hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                                        int i25 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                                        int i26 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                                        cArr4[hVar.f19926b] = cArr2[i25];
                                        cArr4[hVar.f19926b + 1] = cArr2[i26];
                                    } else {
                                        int i27 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                                        int i28 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                                        cArr4[hVar.f19926b] = cArr2[i27];
                                        i10 = 1;
                                        cArr4[hVar.f19926b + 1] = cArr2[i28];
                                    }
                                }
                                i10 = 1;
                            }
                            hVar.f19926b += 2;
                        }
                    }
                    for (int i29 = 0; i29 < i5; i29++) {
                        cArr4[i29] = (char) (cArr4[i29] ^ 13722);
                    }
                    objArr4[0] = new String(cArr4);
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0015). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static void n(byte r8, int r9, int r10, java.lang.Object[] r11) {
                    /*
                        int r0 = r8 * 4
                        int r8 = 100 - r0
                        byte[] r7 = o.cc.d.AnonymousClass2.$$a
                        int r0 = r9 * 2
                        int r6 = 4 - r0
                        int r5 = r10 * 4
                        int r0 = r5 + 1
                        byte[] r4 = new byte[r0]
                        r3 = 0
                        if (r7 != 0) goto L2d
                        r1 = r6
                        r2 = r3
                    L15:
                        int r8 = r8 + r6
                        int r6 = r1 + 1
                        r1 = r2
                    L19:
                        byte r0 = (byte) r8
                        r4[r1] = r0
                        int r2 = r1 + 1
                        if (r1 != r5) goto L28
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r4, r3)
                        r11[r3] = r0
                        return
                    L28:
                        r0 = r7[r6]
                        r1 = r6
                        r6 = r0
                        goto L15
                    L2d:
                        r1 = r3
                        goto L19
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.cc.d.AnonymousClass2.n(byte, int, int, java.lang.Object[]):void");
                }

                @Override // o.ba.c.d
                public final void b(o.bg.c cVar2) throws Throwable {
                    int i5 = 2 % 2;
                    if (f.a()) {
                        int i6 = f22089f + 121;
                        f22091h = i6 % 128;
                        int i7 = i6 % 2;
                        Object[] objArr4 = new Object[1];
                        l("蓅ꍺ쯎\uf235ᪧ䋧楌醬렚\ue066ࣩ㝘徴蘞깷훐ﴤ", TextUtils.indexOf((CharSequence) "", '0', 0) + 10142, objArr4);
                        String strIntern2 = ((String) objArr4[0]).intern();
                        Object[] objArr5 = new Object[1];
                        m(17 - View.MeasureSpec.getSize(0), "\u0017\u0005\u000b\u0005\f\u0003\u000b\t\u0004\u0018\u0010\u000b\u0003\f\b\u0002㙹", (byte) (121 - Process.getGidForName("")), objArr5);
                        f.c(strIntern2, ((String) objArr5[0]).intern());
                    }
                    c cVar3 = cVar;
                    if (cVar3 != null) {
                        int i8 = f22089f + 77;
                        f22091h = i8 % 128;
                        int i9 = i8 % 2;
                        cVar3.e(cVar2);
                    }
                }

                @Override // o.ba.c.d
                public final void d() throws Throwable {
                    String strIntern2;
                    Object obj;
                    int i5 = 2 % 2;
                    if (f.a()) {
                        int i6 = f22091h + 33;
                        f22089f = i6 % 128;
                        if (i6 % 2 != 0) {
                            Object[] objArr4 = new Object[1];
                            l("蓅ꍺ쯎\uf235ᪧ䋧楌醬렚\ue066ࣩ㝘徴蘞깷훐ﴤ", (ViewConfiguration.getPressedStateDuration() + 5) * 6507, objArr4);
                            strIntern2 = ((String) objArr4[0]).intern();
                            Object[] objArr5 = new Object[1];
                            m(43 >>> View.resolveSizeAndState(1, 0, 1), "\u0017\u0005\u000b\u0005\f\u0003\u000b\t\u0004\u0018\u0000\u0018\u0000\u0006\u000e\u0012\u0004\u0018㘧", (byte) (107 - TextUtils.lastIndexOf("", (char) 14)), objArr5);
                            obj = objArr5[0];
                        } else {
                            Object[] objArr6 = new Object[1];
                            l("蓅ꍺ쯎\uf235ᪧ䋧楌醬렚\ue066ࣩ㝘徴蘞깷훐ﴤ", (ViewConfiguration.getPressedStateDuration() >> 16) + 10141, objArr6);
                            strIntern2 = ((String) objArr6[0]).intern();
                            Object[] objArr7 = new Object[1];
                            m(19 - View.resolveSizeAndState(0, 0, 0), "\u0017\u0005\u000b\u0005\f\u0003\u000b\t\u0004\u0018\u0000\u0018\u0000\u0006\u000e\u0012\u0004\u0018㘧", (byte) (TextUtils.lastIndexOf("", '0') + 42), objArr7);
                            obj = objArr7[0];
                        }
                        f.c(strIntern2, ((String) obj).intern());
                        int i7 = f22089f + 49;
                        f22091h = i7 % 128;
                        int i8 = i7 % 2;
                    }
                    c cVar2 = cVar;
                    if (cVar2 != null) {
                        cVar2.a();
                        int i9 = f22091h + 51;
                        f22089f = i9 % 128;
                        int i10 = i9 % 2;
                    }
                }
            }, this.f22080c).d(dVar, z2);
            int i5 = f22079j + 95;
            f22077g = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.WrongState;
        Object[] objArr4 = new Object[1];
        k(6 - (ViewConfiguration.getTouchSlop() >> 8), "\ufff1\u000e\uffff\u0006\u0006\ufffb", true, 255 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -MotionEvent.axisFromString(""), objArr4);
        String strIntern2 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        k(Color.blue(0) + 42, "\u000e\u0013\uffbf\u0011\u0014\r\r\b\r\u0006ￋ\uffbf\u0002\u000e\r\r\u0004\u0002\u0013\b\u000e\r\uffbf\u0011\u0004\u0010\u0014\b\u0011\u0004\u0003\ufff6\u0000\u000b\u000b\u0004\u0013\uffbf\b\u0012\uffbf\r", false, 249 - TextUtils.indexOf((CharSequence) "", '0', 0), Color.green(0) + 31, objArr5);
        throw new WalletValidationException(walletValidationErrorCode2, strIntern2, ((String) objArr5[0]).intern());
    }

    public final void b(final Context context, final o.z.d dVar, final c cVar, final e eVar) throws WalletValidationException {
        int i2 = 2 % 2;
        if (f.a()) {
            int i3 = f22079j + 17;
            f22077g = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            i((char) (29827 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), "㜆\ue18a朠⢜\udc9aꤛꍭả\ue3b9쯶揦䨆−锈醕ᵯ쨓", "\u0000\u0000\u0000\u0000", "岡쨃菱䱴", Color.rgb(0, 0, 0) - 221641892, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            k(11 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "\u0001\u000e\uffff\u0000\u000e�\uffdf\u0001\u0010�", true, 253 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 3 - TextUtils.indexOf("", "", 0, 0), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = f22077g + 123;
            f22079j = i5 % 128;
            int i6 = i5 % 2;
        }
        if (context == null) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.Mandatory;
            Object[] objArr3 = new Object[1];
            i((char) TextUtils.indexOf("", ""), "뿆⳻ﶮ撣툝큥蜕", "\u0000\u0000\u0000\u0000", "\uef35羈荿߬", 2139064559 - Drawable.resolveOpacity(0, 0), objArr3);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr3[0]).intern());
        }
        if (!this.f22080c.s()) {
            WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.WrongState;
            Object[] objArr4 = new Object[1];
            k(7 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\ufff1\u000e\uffff\u0006\u0006\ufffb", true, 254 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1 - View.getDefaultSize(0, 0), objArr4);
            String strIntern2 = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            k((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 42, "\u000e\u0013\uffbf\u0011\u0014\r\r\b\r\u0006ￋ\uffbf\u0002\u000e\r\r\u0004\u0002\u0013\b\u000e\r\uffbf\u0011\u0004\u0010\u0014\b\u0011\u0004\u0003\ufff6\u0000\u000b\u000b\u0004\u0013\uffbf\b\u0012\uffbf\r", false, (ViewConfiguration.getScrollBarSize() >> 8) + 250, 32 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr5);
            throw new WalletValidationException(walletValidationErrorCode2, strIntern2, ((String) objArr5[0]).intern());
        }
        final AtomicReference atomicReference = new AtomicReference(Boolean.FALSE);
        try {
            new a(context, new a.d() { // from class: o.cc.d.4
                private static final byte[] $$a = null;
                private static final int $$b = 0;
                private static int $10 = 0;
                private static int $11 = 0;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private static int f22110f = 0;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private static char[] f22111g = null;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static int f22112i = 0;

                /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:5:0x0017). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static java.lang.String $$c(byte r6, byte r7, int r8) {
                    /*
                        int r0 = r6 * 4
                        int r0 = r0 + 116
                        int r4 = r8 * 4
                        int r3 = 1 - r4
                        int r1 = r7 * 4
                        int r2 = 3 - r1
                        byte[] r8 = o.cc.d.AnonymousClass4.$$a
                        byte[] r7 = new byte[r3]
                        r6 = 0
                        int r5 = 0 - r4
                        if (r8 != 0) goto L2e
                        r3 = r5
                        r4 = r6
                    L17:
                        int r0 = -r0
                        int r0 = r0 + r3
                        r3 = r4
                    L1a:
                        byte r1 = (byte) r0
                        int r2 = r2 + 1
                        r7[r3] = r1
                        int r4 = r3 + 1
                        if (r3 != r5) goto L29
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r7, r6)
                        return r0
                    L29:
                        r1 = r8[r2]
                        r3 = r0
                        r0 = r1
                        goto L17
                    L2e:
                        r3 = r6
                        goto L1a
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.cc.d.AnonymousClass4.$$c(byte, byte, int):java.lang.String");
                }

                static {
                    init$0();
                    $10 = 0;
                    $11 = 1;
                    f22110f = 0;
                    f22112i = 1;
                    f22111g = new char[]{56481, 56530, 56553, 56555, 56540, 56546, 56554, 56546, 56554, 56556, 56537, 56535, 56551, 56551, 56548, 56550, 56555, 56558, 56411, 56389, 56391, 56408, 56400, 56407, 56409, 56385, 56383, 56406, 56408, 56392, 56401, 56409, 56400, 56401, 56409, 56416, 56500, 56554, 56560, 56563, 56555, 56554, 56558, 56536, 56538, 56555, 56547, 56554, 56556, 56532, 56530, 56553, 56555, 56533, 56531, 56561, 56418, 56396, 56398, 56415, 56407, 56414, 56416, 56392, 56390, 56413, 56415, 56393, 56391, 56409, 56414, 56420, 56423, 56415, 56374, 56346, 56346, 56382, 56418, 56415, 56413, 56416, 56423, 56414, 56411, 56418, 56380, 56379, 56418, 56421, 56382, 56381, 56426, 56423, 56412, 56409, 56417, 56420, 56418, 56415, 56421, 56419, 56408, 56374, 56346, 56346, 56382, 56423, 56425, 56421, 56415, 56414, 56375, 56372, 56372, 56379, 56413, 56418, 56383, 56373, 56414, 56415, 56407, 56414, 56416, 56392, 56390, 56413, 56415, 56374, 56373, 56413, 56418, 56417, 56411, 56411, 56413, 56542, 56385, 56383, 56383, 56389, 56390, 56385, 56345, 56346, 56387, 56385, 56362, 56364, 56388, 56386, 56379, 56387, 56386, 56345, 56355, 56390, 56385, 56351, 56348, 56381, 56384, 56393, 56387, 56382, 56350, 56354, 56393, 56390, 56390, 56383, 56378, 56345, 56574, 56574, 56346, 56387, 56395, 56392, 56386, 56381, 56363, 56365, 56387, 56385, 56362, 56364, 56388, 56386, 56379, 56387, 56370, 56368, 56390};
                }

                private static void h(String str, int[] iArr, boolean z2, Object[] objArr6) throws Throwable {
                    int i7;
                    String str2 = str;
                    int i8 = 2;
                    int i9 = 2 % 2;
                    Object bytes = str2;
                    if (str2 != null) {
                        int i10 = $10 + 117;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        bytes = str2.getBytes("ISO-8859-1");
                    }
                    byte[] bArr = (byte[]) bytes;
                    m mVar = new m();
                    int i12 = 0;
                    int i13 = iArr[0];
                    int i14 = iArr[1];
                    int i15 = iArr[2];
                    int i16 = iArr[3];
                    char[] cArr = f22111g;
                    if (cArr != null) {
                        int length = cArr.length;
                        char[] cArr2 = new char[length];
                        int i17 = 0;
                        while (i17 < length) {
                            int i18 = $11 + 3;
                            $10 = i18 % 128;
                            int i19 = i18 % i8;
                            try {
                                Object[] objArr7 = {Integer.valueOf(cArr[i17])};
                                Object objA = o.d.d.a(-2071388435);
                                if (objA == null) {
                                    byte b2 = (byte) i12;
                                    byte b3 = b2;
                                    objA = o.d.d.a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 249, (char) Color.green(i12), 11 - TextUtils.indexOf("", "", i12), 1376582792, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                cArr2[i17] = ((Character) ((Method) objA).invoke(null, objArr7)).charValue();
                                i17++;
                                int i20 = $11 + 7;
                                $10 = i20 % 128;
                                if (i20 % 2 != 0) {
                                    int i21 = 4 % 3;
                                }
                                i8 = 2;
                                i12 = 0;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        cArr = cArr2;
                    }
                    char[] cArr3 = new char[i14];
                    System.arraycopy(cArr, i13, cArr3, 0, i14);
                    if (bArr != null) {
                        char[] cArr4 = new char[i14];
                        mVar.f19943d = 0;
                        char c2 = 0;
                        while (mVar.f19943d < i14) {
                            if (bArr[mVar.f19943d] == 1) {
                                int i22 = mVar.f19943d;
                                Object[] objArr8 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                                Object objA2 = o.d.d.a(120026474);
                                if (objA2 == null) {
                                    objA2 = o.d.d.a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 11, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 10 - (ViewConfiguration.getScrollBarSize() >> 8), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr4[i22] = ((Character) ((Method) objA2).invoke(null, objArr8)).charValue();
                            } else {
                                int i23 = mVar.f19943d;
                                Object[] objArr9 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                                Object objA3 = o.d.d.a(1632715197);
                                if (objA3 == null) {
                                    int defaultSize = View.getDefaultSize(0, 0) + 836;
                                    char cIndexOf = (char) (27278 - TextUtils.indexOf((CharSequence) "", '0', 0));
                                    int iIndexOf = 10 - TextUtils.indexOf((CharSequence) "", '0');
                                    byte b4 = (byte) ((-1) - (((-1) - $$b) | ((-1) - 5)));
                                    byte b5 = (byte) (b4 - 1);
                                    objA3 = o.d.d.a(defaultSize, cIndexOf, iIndexOf, -1210801192, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr4[i23] = ((Character) ((Method) objA3).invoke(null, objArr9)).charValue();
                            }
                            c2 = cArr4[mVar.f19943d];
                            Object[] objArr10 = {mVar, mVar};
                            Object objA4 = o.d.d.a(-1041906996);
                            if (objA4 == null) {
                                objA4 = o.d.d.a(21 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 35715), 10 - MotionEvent.axisFromString(""), 392175785, false, "v", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objA4).invoke(null, objArr10);
                        }
                        cArr3 = cArr4;
                    }
                    if (i16 > 0) {
                        char[] cArr5 = new char[i14];
                        i7 = 0;
                        System.arraycopy(cArr3, 0, cArr5, 0, i14);
                        int i24 = i14 - i16;
                        System.arraycopy(cArr5, 0, cArr3, i24, i16);
                        System.arraycopy(cArr5, i16, cArr3, 0, i24);
                    } else {
                        i7 = 0;
                    }
                    if (z2) {
                        char[] cArr6 = new char[i14];
                        while (true) {
                            mVar.f19943d = i7;
                            if (mVar.f19943d >= i14) {
                                break;
                            }
                            cArr6[mVar.f19943d] = cArr3[(i14 - mVar.f19943d) - 1];
                            i7 = mVar.f19943d + 1;
                        }
                        cArr3 = cArr6;
                    }
                    if (i15 > 0) {
                        int i25 = $10 + 111;
                        $11 = i25 % 128;
                        int i26 = i25 % 2;
                        mVar.f19943d = 0;
                        int i27 = $11 + 9;
                        $10 = i27 % 128;
                        int i28 = i27 % 2;
                        while (mVar.f19943d < i14) {
                            int i29 = $11 + 95;
                            $10 = i29 % 128;
                            int i30 = i29 % 2;
                            cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                            mVar.f19943d++;
                        }
                    }
                    objArr6[0] = new String(cArr3);
                }

                static void init$0() {
                    $$a = new byte[]{64, -84, MessagePack.Code.MAP32, -5};
                    $$b = 243;
                }

                /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
                @Override // o.z.a.d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void a() throws java.lang.Throwable {
                    /*
                        r9 = this;
                        r8 = 2
                        int r0 = r8 % r8
                        int r0 = o.cc.d.AnonymousClass4.f22112i
                        int r1 = r0 + 41
                        int r0 = r1 % 128
                        o.cc.d.AnonymousClass4.f22110f = r0
                        int r1 = r1 % r8
                        r4 = 19
                        r3 = 0
                        if (r1 == 0) goto L65
                        boolean r1 = o.ea.f.a()
                        r0 = 68
                        int r0 = r0 / r3
                        if (r1 == 0) goto L48
                    L1a:
                        r7 = 17
                        int[] r2 = new int[]{r3, r7, r3, r3}
                        r6 = 1
                        java.lang.Object[] r1 = new java.lang.Object[r6]
                        java.lang.String r0 = "\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001"
                        h(r0, r2, r3, r1)
                        r0 = r1[r3]
                        java.lang.String r0 = (java.lang.String) r0
                        java.lang.String r5 = r0.intern()
                        r0 = 109(0x6d, float:1.53E-43)
                        int[] r2 = new int[]{r7, r4, r0, r3}
                        java.lang.Object[] r1 = new java.lang.Object[r6]
                        java.lang.String r0 = "\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000"
                        h(r0, r2, r3, r1)
                        r0 = r1[r3]
                        java.lang.String r0 = (java.lang.String) r0
                        java.lang.String r0 = r0.intern()
                        o.ea.f.c(r5, r0)
                    L48:
                        o.cc.c r2 = r2
                        if (r2 == 0) goto L58
                        int r0 = o.cc.d.AnonymousClass4.f22112i
                        int r1 = r0 + 91
                        int r0 = r1 % 128
                        o.cc.d.AnonymousClass4.f22110f = r0
                        int r1 = r1 % r8
                        r2.a()
                    L58:
                        int r0 = o.cc.d.AnonymousClass4.f22110f
                        int r1 = r0 + 97
                        int r0 = r1 % 128
                        o.cc.d.AnonymousClass4.f22112i = r0
                        int r1 = r1 % r8
                        if (r1 != 0) goto L64
                        int r4 = r4 / r3
                    L64:
                        return
                    L65:
                        boolean r0 = o.ea.f.a()
                        if (r0 == 0) goto L48
                        goto L1a
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.cc.d.AnonymousClass4.a():void");
                }

                @Override // o.z.a.d
                public final void b(o.bg.c cVar2) throws Throwable {
                    int i7 = 2 % 2;
                    int i8 = f22112i + 19;
                    f22110f = i8 % 128;
                    if (i8 % 2 != 0) {
                        f.a();
                        throw null;
                    }
                    if (f.a()) {
                        Object[] objArr6 = new Object[1];
                        h("\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001", new int[]{0, 17, 0, 0}, false, objArr6);
                        String strIntern3 = ((String) objArr6[0]).intern();
                        Object[] objArr7 = new Object[1];
                        h("\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001", new int[]{36, 19, 0, 5}, false, objArr7);
                        f.c(strIntern3, ((String) objArr7[0]).intern());
                    }
                    if (cVar2.c() != o.bg.a.at || ((Boolean) atomicReference.get()).booleanValue()) {
                        c cVar3 = cVar;
                        if (cVar3 != null) {
                            cVar3.e(cVar2);
                            int i9 = f22112i + 89;
                            f22110f = i9 % 128;
                            int i10 = i9 % 2;
                            return;
                        }
                        return;
                    }
                    int i11 = f22110f + 117;
                    f22112i = i11 % 128;
                    int i12 = i11 % 2;
                    if (f.a()) {
                        Object[] objArr8 = new Object[1];
                        h("\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001", new int[]{0, 17, 0, 0}, false, objArr8);
                        String strIntern4 = ((String) objArr8[0]).intern();
                        Object[] objArr9 = new Object[1];
                        h("\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000", new int[]{55, 82, 116, 0}, false, objArr9);
                        f.c(strIntern4, ((String) objArr9[0]).intern());
                    }
                    atomicReference.set(Boolean.TRUE);
                    try {
                        new a(context, this, d.this.f22080c).b(dVar, eVar);
                    } catch (o.ab.d unused) {
                        if (f.a()) {
                            Object[] objArr10 = new Object[1];
                            h("\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001", new int[]{0, 17, 0, 0}, false, objArr10);
                            String strIntern5 = ((String) objArr10[0]).intern();
                            Object[] objArr11 = new Object[1];
                            h("\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{137, 58, 88, 0}, true, objArr11);
                            f.d(strIntern5, ((String) objArr11[0]).intern());
                        }
                        int i13 = f22112i + 63;
                        f22110f = i13 % 128;
                        int i14 = i13 % 2;
                    }
                }
            }, this.f22080c).b(dVar, eVar);
            int i7 = f22077g + 65;
            f22079j = i7 % 128;
            if (i7 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (o.ab.d e2) {
            WalletValidationErrorCode walletValidationErrorCode3 = WalletValidationErrorCode.InvalidFormat;
            Object[] objArr6 = new Object[1];
            k(24 - TextUtils.getOffsetAfter("", 0), "\uffde\u0000\u000f￼\u0000\r\uffde\r\u0000\uffff\u0007\u0004\u0010\uffdd\u000f\u000e\u0000\u0010\f\u0000￭\uffff\r￼", true, TextUtils.lastIndexOf("", '0', 0) + 255, (ViewConfiguration.getTouchSlop() >> 8) + 7, objArr6);
            throw new WalletValidationException(walletValidationErrorCode3, ((String) objArr6[0]).intern(), e2);
        }
    }

    public final void c(Context context, o.eq.b bVar, o.cs.d dVar, final c cVar) throws WalletValidationException {
        int i2 = 2 % 2;
        int i3 = f22077g + 55;
        f22079j = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            int i5 = f22077g + 27;
            f22079j = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            i((char) (29827 - KeyEvent.getDeadChar(0, 0)), "㜆\ue18a朠⢜\udc9aꤛꍭả\ue3b9쯶揦䨆−锈醕ᵯ쨓", "\u0000\u0000\u0000\u0000", "岡쨃菱䱴", KeyEvent.normalizeMetaState(0) - 238419108, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            k(19 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\ufffe\u0005\ufffe￼\r￬\r\ufffe\t￮\t￦\ufffe\r\u0001\b�\f", false, View.MeasureSpec.getMode(0) + 256, 17 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i7 = f22077g + 43;
            f22079j = i7 % 128;
            int i8 = i7 % 2;
        }
        if (context == null) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.Mandatory;
            Object[] objArr3 = new Object[1];
            i((char) View.resolveSizeAndState(0, 0, 0), "뿆⳻ﶮ撣툝큥蜕", "\u0000\u0000\u0000\u0000", "\uef35羈荿߬", 2139064559 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr3);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr3[0]).intern(), "");
        }
        if (this.f22080c.s()) {
            new o.ay.a(context, new a.d() { // from class: o.cc.d.1
                private static final byte[] $$a = null;
                private static final int $$b = 0;
                private static int $10 = 0;
                private static int $11 = 0;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static long f22081c = 0;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static int f22082d = 0;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static int f22083e = 0;

                /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0015). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static java.lang.String $$c(byte r9, int r10, byte r11) {
                    /*
                        int r0 = r10 * 2
                        int r8 = r0 + 4
                        int r0 = r11 * 2
                        int r7 = r0 + 1
                        byte[] r6 = o.cc.d.AnonymousClass1.$$a
                        int r0 = r9 * 7
                        int r0 = r0 + 107
                        byte[] r5 = new byte[r7]
                        r4 = 0
                        if (r6 != 0) goto L2b
                        r3 = r7
                        r2 = r4
                    L15:
                        int r0 = -r0
                        int r0 = r0 + r3
                        int r8 = r8 + 1
                    L19:
                        byte r1 = (byte) r0
                        r5[r2] = r1
                        int r2 = r2 + 1
                        if (r2 != r7) goto L26
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r5, r4)
                        return r0
                    L26:
                        r1 = r6[r8]
                        r3 = r0
                        r0 = r1
                        goto L15
                    L2b:
                        r2 = r4
                        goto L19
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.cc.d.AnonymousClass1.$$c(byte, int, byte):java.lang.String");
                }

                static {
                    init$0();
                    $10 = 0;
                    $11 = 1;
                    f22082d = 0;
                    f22083e = 1;
                    f22081c = -301950874639673347L;
                }

                private static void f(String str, int i9, Object[] objArr4) throws Throwable {
                    Object obj;
                    String str2 = str;
                    int i10 = 2 % 2;
                    int i11 = $10 + 105;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    if (str2 != null) {
                        char[] charArray = str2.toCharArray();
                        int i13 = $10 + 49;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        obj = charArray;
                    } else {
                        obj = str2;
                    }
                    k kVar = new k();
                    char[] cArrC = k.c(f22081c ^ (-5882309809461882246L), (char[]) obj, i9);
                    kVar.f19939c = 4;
                    int i15 = $10 + 75;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    while (kVar.f19939c < cArrC.length) {
                        kVar.f19938a = kVar.f19939c - 4;
                        int i17 = kVar.f19939c;
                        try {
                            Object[] objArr5 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f22081c)};
                            Object objA = o.d.d.a(-1093976004);
                            if (objA == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objA = o.d.d.a((ViewConfiguration.getJumpTapTimeout() >> 16) + 229, (char) ((-16726212) - Color.rgb(0, 0, 0)), 9 - TextUtils.getOffsetBefore("", 0), 1749983833, false, $$c(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                            }
                            cArrC[i17] = ((Character) ((Method) objA).invoke(null, objArr5)).charValue();
                            Object[] objArr6 = {kVar, kVar};
                            Object objA2 = o.d.d.a(-912105096);
                            if (objA2 == null) {
                                byte b4 = (byte) 1;
                                byte b5 = (byte) (b4 - 1);
                                objA2 = o.d.d.a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 674, (char) KeyEvent.normalizeMetaState(0), Color.argb(0, 0, 0, 0) + 12, 522683165, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objA2).invoke(null, objArr6);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    objArr4[0] = new String(cArrC, 4, cArrC.length - 4);
                }

                static void init$0() {
                    $$a = new byte[]{108, -115, 75, MessagePack.Code.EXT32};
                    $$b = 172;
                }

                @Override // o.ay.a.d
                public final void a(o.bg.c cVar2) throws Throwable {
                    int i9 = 2 % 2;
                    int i10 = f22083e + 125;
                    f22082d = i10 % 128;
                    int i11 = i10 % 2;
                    if (f.a()) {
                        Object[] objArr4 = new Object[1];
                        f("ﵽ鳏뱛﴾\ud929㜧俗鼦\ueb34윜ᴕ秶턱\ued15\u0b50掊뽇᭵煞趪ꕿ", 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr4);
                        String strIntern2 = ((String) objArr4[0]).intern();
                        Object[] objArr5 = new Object[1];
                        f("\ud8b1\uf054㈌\ud8c2떶륮왤ᚔ컎ꮃ鍵\uf051\uf4ec膛蔟\uea29骨矪：Е肮淇텒㾼똝䐡쯷⧜屵㨎㷈䏌", View.MeasureSpec.getMode(0) + 1, objArr5);
                        f.c(strIntern2, ((String) objArr5[0]).intern());
                        int i12 = f22083e + 121;
                        f22082d = i12 % 128;
                        int i13 = i12 % 2;
                    }
                    c cVar3 = cVar;
                    if (cVar3 != null) {
                        cVar3.e(cVar2);
                        int i14 = f22083e + 5;
                        f22082d = i14 % 128;
                        int i15 = i14 % 2;
                    }
                }

                @Override // o.ay.a.d
                public final void e() throws Throwable {
                    int i9 = 2 % 2;
                    int i10 = f22083e + 125;
                    f22082d = i10 % 128;
                    if (i10 % 2 != 0) {
                        f.a();
                        throw null;
                    }
                    if (f.a()) {
                        Object[] objArr4 = new Object[1];
                        f("ﵽ鳏뱛﴾\ud929㜧俗鼦\ueb34윜ᴕ秶턱\ued15\u0b50掊뽇᭵煞趪ꕿ", Drawable.resolveOpacity(0, 0) + 1, objArr4);
                        String strIntern2 = ((String) objArr4[0]).intern();
                        Object[] objArr5 = new Object[1];
                        f("螫ﭨ谖蟘뺊ݴ淶봆釔ꂿⵯ寃꯶誧㬅䆻얲糖䄀꾇\udfb4曻潈鐮\ue907伈痹艄͠ㄢ菓\ue848", Color.blue(0) + 1, objArr5);
                        f.c(strIntern2, ((String) objArr5[0]).intern());
                    }
                    c cVar2 = cVar;
                    if (cVar2 != null) {
                        cVar2.a();
                        int i11 = f22082d + 7;
                        f22083e = i11 % 128;
                        int i12 = i11 % 2;
                    }
                }
            }, this.f22080c).c(bVar, dVar);
            return;
        }
        WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.WrongState;
        Object[] objArr4 = new Object[1];
        k((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 5, "\ufff1\u000e\uffff\u0006\u0006\ufffb", true, 255 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1 - TextUtils.indexOf("", ""), objArr4);
        String strIntern2 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        k(TextUtils.indexOf((CharSequence) "", '0') + 43, "\u000e\u0013\uffbf\u0011\u0014\r\r\b\r\u0006ￋ\uffbf\u0002\u000e\r\r\u0004\u0002\u0013\b\u000e\r\uffbf\u0011\u0004\u0010\u0014\b\u0011\u0004\u0003\ufff6\u0000\u000b\u000b\u0004\u0013\uffbf\b\u0012\uffbf\r", false, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 250, 32 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr5);
        throw new WalletValidationException(walletValidationErrorCode2, strIntern2, ((String) objArr5[0]).intern());
    }

    public final void e(Context context, String str, final c cVar) throws WalletValidationException {
        int i2 = 2 % 2;
        int i3 = f22077g + 1;
        f22079j = i3 % 128;
        if (i3 % 2 != 0) {
            f.a();
            throw null;
        }
        if (f.a()) {
            int i4 = f22079j + 11;
            f22077g = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            i((char) (29827 - Color.alpha(0)), "㜆\ue18a朠⢜\udc9aꤛꍭả\ue3b9쯶揦䨆−锈醕ᵯ쨓", "\u0000\u0000\u0000\u0000", "岡쨃菱䱴", Color.alpha(0) - 238419108, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            i((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), "棕Ʒౝ\ud959㫾퐝֙ₛ혖绕", "\u0000\u0000\u0000\u0000", "㌖漧嶱\ue948", TextUtils.indexOf((CharSequence) "", '0') + 1, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        if (context == null) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.Mandatory;
            Object[] objArr3 = new Object[1];
            i((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), "뿆⳻ﶮ撣툝큥蜕", "\u0000\u0000\u0000\u0000", "\uef35羈荿߬", 2139064559 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr3);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr3[0]).intern(), "");
        }
        if (str == null) {
            WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.Mandatory;
            Object[] objArr4 = new Object[1];
            k(Process.getGidForName("") + 5, "\u0006￥\u0003\u0014", false, TextUtils.indexOf("", "", 0) + 247, 1 - (ViewConfiguration.getTapTimeout() >> 16), objArr4);
            throw new WalletValidationException(walletValidationErrorCode2, ((String) objArr4[0]).intern());
        }
        if (!this.f22080c.s()) {
            WalletValidationErrorCode walletValidationErrorCode3 = WalletValidationErrorCode.WrongState;
            Object[] objArr5 = new Object[1];
            k((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6, "\ufff1\u000e\uffff\u0006\u0006\ufffb", true, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 255, 1 - ExpandableListView.getPackedPositionGroup(0L), objArr5);
            String strIntern2 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            k(41 - TextUtils.indexOf((CharSequence) "", '0'), "\u000e\u0013\uffbf\u0011\u0014\r\r\b\r\u0006ￋ\uffbf\u0002\u000e\r\r\u0004\u0002\u0013\b\u000e\r\uffbf\u0011\u0004\u0010\u0014\b\u0011\u0004\u0003\ufff6\u0000\u000b\u000b\u0004\u0013\uffbf\b\u0012\uffbf\r", false, 250 - Color.argb(0, 0, 0, 0), 32 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr6);
            throw new WalletValidationException(walletValidationErrorCode3, strIntern2, ((String) objArr6[0]).intern());
        }
        if (!this.f22080c.e().g().containsKey(str)) {
            WalletValidationErrorCode walletValidationErrorCode4 = WalletValidationErrorCode.Unknown;
            Object[] objArr7 = new Object[1];
            k(AndroidCharacter.getMirror('0') - ',', "\u0006￥\u0003\u0014", false, 247 - ExpandableListView.getPackedPositionGroup(0L), 1 - TextUtils.indexOf("", "", 0), objArr7);
            throw new WalletValidationException(walletValidationErrorCode4, ((String) objArr7[0]).intern());
        }
        new o.ac.a(context, new a.b() { // from class: o.cc.d.3
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final int $$d = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static char[] f22097a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static char f22098b = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static char f22099d = 0;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static int f22100f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static int f22101g = 0;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static char f22102h = 0;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static char f22103i = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static int f22104j = 0;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public static int f22105k = 0;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public static int f22106l = 0;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static int f22107m = 0;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0013). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$e(byte r8, short r9, byte r10) {
                /*
                    int r8 = 120 - r8
                    int r0 = r9 * 4
                    int r7 = r0 + 1
                    byte[] r6 = o.cc.d.AnonymousClass3.$$c
                    int r0 = r10 * 2
                    int r5 = r0 + 4
                    byte[] r4 = new byte[r7]
                    r3 = 0
                    if (r6 != 0) goto L29
                    r1 = r5
                    r2 = r3
                L13:
                    int r8 = r8 + r5
                    int r5 = r1 + 1
                    r1 = r2
                L17:
                    int r2 = r1 + 1
                    byte r0 = (byte) r8
                    r4[r1] = r0
                    if (r2 != r7) goto L24
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r4, r3)
                    return r0
                L24:
                    r0 = r6[r5]
                    r1 = r5
                    r5 = r0
                    goto L13
                L29:
                    r1 = r3
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: o.cc.d.AnonymousClass3.$$e(byte, short, byte):java.lang.String");
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                f22107m = -671371960;
                f22106l = 1011842193;
                f22105k = -1246507460;
                f22104j = -1765766592;
                init$0();
                f22100f = 0;
                f22101g = 1;
                f22097a = new char[]{56496, 56554, 56556, 56537, 56535, 56551, 56551, 56548, 56550, 56555, 56538, 56530, 56553, 56555, 56540, 56546, 56554, 56505, 56563, 56556, 56548, 56547, 56556, 56548, 56539, 56555, 56553, 56530, 56532, 56556, 56556, 56552, 56552, 56532, 56537, 56558, 56499, 56550, 56556, 56538, 56536, 56560, 56558, 56554, 56550, 56546, 56554, 56558, 56556, 56558, 56539, 56539, 56554, 56554, 56498, 56520, 56520, 56548, 56547, 56555, 56558, 56551, 56548, 56545, 56551, 56552, 56521, 56528, 56554, 56521, 56522, 56556, 56555, 56521, 56524, 56555, 56555, 56558, 56529, 56525, 56556, 56555, 56505, 56560, 56526, 56521, 56548, 56547, 56555, 56558, 56551, 56548, 56545, 56551, 56552};
                f22099d = (char) 62101;
                f22098b = (char) 26941;
                f22102h = (char) 21884;
                f22103i = (char) 48510;
            }

            /* JADX WARN: Removed duplicated region for block: B:32:0x02de  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x039e A[Catch: all -> 0x044a, TryCatch #2 {all -> 0x044a, blocks: (B:47:0x0391, B:49:0x039e, B:50:0x03d5), top: B:93:0x0391, outer: #4 }] */
            /* JADX WARN: Removed duplicated region for block: B:60:0x0476 A[Catch: all -> 0x04d8, TryCatch #1 {all -> 0x04d8, blocks: (B:58:0x0469, B:60:0x0476, B:61:0x04b3), top: B:91:0x0469, outer: #4 }] */
            /* JADX WARN: Removed duplicated region for block: B:71:0x055d  */
            /* JADX WARN: Removed duplicated region for block: B:76:0x05ce  */
            /* JADX WARN: Removed duplicated region for block: B:77:0x05d0  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static java.lang.Object[] a(android.content.Context r23, int r24, int r25, int r26) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1622
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.cc.d.AnonymousClass3.a(android.content.Context, int, int, int):java.lang.Object[]");
            }

            static void init$0() {
                $$a = new byte[]{Utf8.REPLACEMENT_BYTE, -81, -107, -8};
                $$b = 190;
            }

            static void init$1() {
                $$c = new byte[]{60, -17, 3, Ascii.NAK};
                $$d = 59;
            }

            private static void n(String str2, int[] iArr, boolean z2, Object[] objArr8) throws Throwable {
                int i6;
                String str3 = str2;
                int i7 = 2;
                int i8 = 2 % 2;
                int i9 = $11 + 61;
                int i10 = i9 % 128;
                $10 = i10;
                int i11 = i9 % 2;
                Object bytes = str3;
                if (str3 != null) {
                    int i12 = i10 + 85;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    bytes = str3.getBytes("ISO-8859-1");
                }
                byte[] bArr = (byte[]) bytes;
                m mVar = new m();
                int i14 = 0;
                int i15 = iArr[0];
                int i16 = iArr[1];
                int i17 = iArr[2];
                int i18 = iArr[3];
                char[] cArr = f22097a;
                float f2 = 0.0f;
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    int i19 = 0;
                    while (i19 < length) {
                        int i20 = $11 + 51;
                        $10 = i20 % 128;
                        int i21 = i20 % i7;
                        try {
                            Object[] objArr9 = {Integer.valueOf(cArr[i19])};
                            Object objA = o.d.d.a(-2071388435);
                            if (objA == null) {
                                int i22 = (ViewConfiguration.getScrollFriction() > f2 ? 1 : (ViewConfiguration.getScrollFriction() == f2 ? 0 : -1)) + 248;
                                char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                int deadChar = 11 - KeyEvent.getDeadChar(i14, i14);
                                byte length2 = (byte) $$c.length;
                                byte b2 = (byte) (length2 - 4);
                                objA = o.d.d.a(i22, keyRepeatDelay, deadChar, 1376582792, false, $$e(length2, b2, b2), new Class[]{Integer.TYPE});
                            }
                            cArr2[i19] = ((Character) ((Method) objA).invoke(null, objArr9)).charValue();
                            i19++;
                            i7 = 2;
                            i14 = 0;
                            f2 = 0.0f;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr = cArr2;
                }
                char[] cArr3 = new char[i16];
                System.arraycopy(cArr, i15, cArr3, 0, i16);
                if (bArr != null) {
                    int i23 = $10 + 57;
                    $11 = i23 % 128;
                    int i24 = i23 % 2;
                    char[] cArr4 = new char[i16];
                    mVar.f19943d = 0;
                    char c2 = 0;
                    while (mVar.f19943d < i16) {
                        if (bArr[mVar.f19943d] == 1) {
                            int i25 = $11 + 107;
                            $10 = i25 % 128;
                            if (i25 % 2 != 0) {
                                int i26 = mVar.f19943d;
                                Object[] objArr10 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                                Object objA2 = o.d.d.a(120026474);
                                if (objA2 == null) {
                                    objA2 = o.d.d.a(10 - TextUtils.indexOf((CharSequence) "", '0'), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 10 - TextUtils.getCapsMode("", 0, 0), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                Object obj = null;
                                cArr4[i26] = ((Character) ((Method) objA2).invoke(null, objArr10)).charValue();
                                obj.hashCode();
                                throw null;
                            }
                            int i27 = mVar.f19943d;
                            Object[] objArr11 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                            Object objA3 = o.d.d.a(120026474);
                            if (objA3 == null) {
                                objA3 = o.d.d.a(TextUtils.indexOf("", "", 0, 0) + 11, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 10, -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i27] = ((Character) ((Method) objA3).invoke(null, objArr11)).charValue();
                        } else {
                            int i28 = mVar.f19943d;
                            Object[] objArr12 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                            Object objA4 = o.d.d.a(1632715197);
                            if (objA4 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objA4 = o.d.d.a(TextUtils.lastIndexOf("", '0', 0, 0) + 837, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 27279), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10, -1210801192, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i28] = ((Character) ((Method) objA4).invoke(null, objArr12)).charValue();
                        }
                        c2 = cArr4[mVar.f19943d];
                        Object[] objArr13 = {mVar, mVar};
                        Object objA5 = o.d.d.a(-1041906996);
                        if (objA5 == null) {
                            objA5 = o.d.d.a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 21, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 35715), 11 - Color.blue(0), 392175785, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA5).invoke(null, objArr13);
                        int i29 = $10 + 63;
                        $11 = i29 % 128;
                        int i30 = i29 % 2;
                    }
                    cArr3 = cArr4;
                }
                if (i18 > 0) {
                    int i31 = $10 + 9;
                    $11 = i31 % 128;
                    int i32 = i31 % 2;
                    char[] cArr5 = new char[i16];
                    i6 = 0;
                    System.arraycopy(cArr3, 0, cArr5, 0, i16);
                    int i33 = i16 - i18;
                    System.arraycopy(cArr5, 0, cArr3, i33, i18);
                    System.arraycopy(cArr5, i18, cArr3, 0, i33);
                } else {
                    i6 = 0;
                }
                if (z2) {
                    char[] cArr6 = new char[i16];
                    while (true) {
                        mVar.f19943d = i6;
                        if (mVar.f19943d >= i16) {
                            break;
                        }
                        cArr6[mVar.f19943d] = cArr3[(i16 - mVar.f19943d) - 1];
                        i6 = mVar.f19943d + 1;
                    }
                    cArr3 = cArr6;
                }
                if (i17 > 0) {
                    int i34 = 0;
                    while (true) {
                        mVar.f19943d = i34;
                        if (mVar.f19943d >= i16) {
                            break;
                        }
                        cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                        i34 = mVar.f19943d + 1;
                    }
                }
                objArr8[0] = new String(cArr3);
            }

            private static void o(String str2, int i6, Object[] objArr8) throws Throwable {
                Object charArray;
                String str3 = str2;
                int i7 = 2 % 2;
                if (str3 != null) {
                    int i8 = $11 + 67;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        str3.toCharArray();
                        throw null;
                    }
                    charArray = str3.toCharArray();
                } else {
                    charArray = str3;
                }
                char[] cArr = (char[]) charArray;
                g gVar = new g();
                char[] cArr2 = new char[cArr.length];
                gVar.f19924d = 0;
                char[] cArr3 = new char[2];
                while (gVar.f19924d < cArr.length) {
                    int i9 = $10 + 105;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    cArr3[0] = cArr[gVar.f19924d];
                    cArr3[1] = cArr[gVar.f19924d + 1];
                    int i11 = 58224;
                    for (int i12 = 0; i12 < 16; i12++) {
                        int i13 = $11 + 103;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                        char c2 = cArr3[1];
                        char c3 = cArr3[0];
                        try {
                            Object[] objArr9 = {Integer.valueOf(c2), Integer.valueOf((c3 + i11) ^ ((c3 << 4) + ((char) (((long) f22102h) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f22103i)};
                            Object objA = o.d.d.a(1603517628);
                            if (objA == null) {
                                int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 270;
                                char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                                int maximumFlingVelocity = 11 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                int i15 = $$d;
                                byte b2 = (byte) 0;
                                objA = o.d.d.a(iIndexOf, cNormalizeMetaState, maximumFlingVelocity, -1995022631, false, $$e((byte) ((i15 + 247) - (i15 | 247)), b2, b2), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            char cCharValue = ((Character) ((Method) objA).invoke(null, objArr9)).charValue();
                            cArr3[1] = cCharValue;
                            Object[] objArr10 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i11) ^ ((cCharValue << 4) + ((char) (((long) f22099d) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f22098b)};
                            Object objA2 = o.d.d.a(1603517628);
                            if (objA2 == null) {
                                byte b3 = (byte) 0;
                                objA2 = o.d.d.a(AndroidCharacter.getMirror('0') + 222, (char) ((-1) - Process.getGidForName("")), 11 - View.resolveSize(0, 0), -1995022631, false, $$e((byte) ((-1) - (((-1) - $$d) | ((-1) - 247))), b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr10)).charValue();
                            i11 -= 40503;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2[gVar.f19924d] = cArr3[0];
                    cArr2[gVar.f19924d + 1] = cArr3[1];
                    Object[] objArr11 = {gVar, gVar};
                    Object objA3 = o.d.d.a(1390051551);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        objA3 = o.d.d.a(Color.blue(0) + 270, (char) View.MeasureSpec.getMode(0), KeyEvent.getDeadChar(0, 0) + 11, -2074123590, false, $$e((byte) ((-1) - (((-1) - $$d) | ((-1) - 244))), b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr11);
                }
                String str4 = new String(cArr2, 0, i6);
                int i16 = $11 + 59;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    throw null;
                }
                objArr8[0] = str4;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0011). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void p(int r8, short r9, int r10, java.lang.Object[] r11) {
                /*
                    byte[] r7 = o.cc.d.AnonymousClass3.$$a
                    int r6 = 101 - r9
                    int r0 = r8 * 4
                    int r5 = r0 + 1
                    int r0 = r10 + 4
                    byte[] r4 = new byte[r5]
                    r3 = 0
                    if (r7 != 0) goto L28
                    r2 = r0
                    r1 = r3
                L11:
                    int r0 = -r0
                    int r6 = r6 + r0
                    r0 = r2
                L14:
                    int r2 = r0 + 1
                    byte r0 = (byte) r6
                    r4[r1] = r0
                    int r1 = r1 + 1
                    if (r1 != r5) goto L25
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r4, r3)
                    r11[r3] = r0
                    return
                L25:
                    r0 = r7[r2]
                    goto L11
                L28:
                    r1 = r3
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: o.cc.d.AnonymousClass3.p(int, short, int, java.lang.Object[]):void");
            }

            @Override // o.ac.a.b
            public final void b(o.bg.c cVar2) throws Throwable {
                String strIntern3;
                Object obj;
                int i6 = 2 % 2;
                int i7 = f22101g + 39;
                f22100f = i7 % 128;
                int i8 = i7 % 2;
                if (f.a()) {
                    int i9 = f22100f + 59;
                    f22101g = i9 % 128;
                    if (i9 % 2 == 0) {
                        Object[] objArr8 = new Object[1];
                        n("\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000", new int[]{0, 17, 0, 10}, false, objArr8);
                        strIntern3 = ((String) objArr8[0]).intern();
                        Object[] objArr9 = new Object[1];
                        o("쑡ᘶⒷꥲ놵槳\udb9bᨌ궢갟ᝊㄻ㯆䌚ꈤ肨\ude81ᐧ䃲힇", 1 << (AudioTrack.getMaxVolume() > 1.0f ? 1 : (AudioTrack.getMaxVolume() == 1.0f ? 0 : -1)), objArr9);
                        obj = objArr9[0];
                    } else {
                        Object[] objArr10 = new Object[1];
                        n("\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000", new int[]{0, 17, 0, 10}, false, objArr10);
                        strIntern3 = ((String) objArr10[0]).intern();
                        Object[] objArr11 = new Object[1];
                        o("쑡ᘶⒷꥲ놵槳\udb9bᨌ궢갟ᝊㄻ㯆䌚ꈤ肨\ude81ᐧ䃲힇", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 18, objArr11);
                        obj = objArr11[0];
                    }
                    f.c(strIntern3, ((String) obj).intern());
                }
                c cVar3 = cVar;
                if (cVar3 != null) {
                    int i10 = f22101g + 7;
                    f22100f = i10 % 128;
                    int i11 = i10 % 2;
                    cVar3.e(cVar2);
                }
            }

            @Override // o.ac.a.b
            public final void e() throws Throwable {
                int i6 = 2 % 2;
                int i7 = f22101g + 87;
                f22100f = i7 % 128;
                int i8 = i7 % 2;
                if (f.a()) {
                    Object[] objArr8 = new Object[1];
                    n("\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000", new int[]{0, 17, 0, 10}, false, objArr8);
                    String strIntern3 = ((String) objArr8[0]).intern();
                    Object[] objArr9 = new Object[1];
                    n("\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001", new int[]{17, 19, 0, 0}, true, objArr9);
                    f.c(strIntern3, ((String) objArr9[0]).intern());
                }
                c cVar2 = cVar;
                if (cVar2 != null) {
                    int i9 = f22100f + 43;
                    f22101g = i9 % 128;
                    int i10 = i9 % 2;
                    cVar2.a();
                }
            }
        }, this.f22080c).a(str);
        int i6 = f22079j + 107;
        f22077g = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void e(Context context, o.eq.b bVar, String str, final c cVar) throws WalletValidationException {
        int i2 = 2 % 2;
        int i3 = f22077g + 33;
        f22079j = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            int i5 = f22079j + 13;
            f22077g = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            i((char) (29827 - (ViewConfiguration.getPressedStateDuration() >> 16)), "㜆\ue18a朠⢜\udc9aꤛꍭả\ue3b9쯶揦䨆−锈醕ᵯ쨓", "\u0000\u0000\u0000\u0000", "岡쨃菱䱴", TextUtils.getOffsetBefore("", 0) - 238419108, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            k(20 - View.MeasureSpec.getSize(0), "\ufffb\uffd9\f\u0001\u0005\ufffa\r\u000b�￼\u0007ￛ\u0006\u0007\u0001\f\ufff9\u000e\u0001\f", true, 257 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 7, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        if (context == null) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.Mandatory;
            Object[] objArr3 = new Object[1];
            i((char) TextUtils.getTrimmedLength(""), "뿆⳻ﶮ撣툝큥蜕", "\u0000\u0000\u0000\u0000", "\uef35羈荿߬", 2139064559 - TextUtils.indexOf("", ""), objArr3);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr3[0]).intern(), "");
        }
        if (!this.f22080c.s()) {
            WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.WrongState;
            Object[] objArr4 = new Object[1];
            k((ViewConfiguration.getDoubleTapTimeout() >> 16) + 6, "\ufff1\u000e\uffff\u0006\u0006\ufffb", true, 254 - MotionEvent.axisFromString(""), 1 - (KeyEvent.getMaxKeyCode() >> 16), objArr4);
            String strIntern2 = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            k(42 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u000e\u0013\uffbf\u0011\u0014\r\r\b\r\u0006ￋ\uffbf\u0002\u000e\r\r\u0004\u0002\u0013\b\u000e\r\uffbf\u0011\u0004\u0010\u0014\b\u0011\u0004\u0003\ufff6\u0000\u000b\u000b\u0004\u0013\uffbf\b\u0012\uffbf\r", false, 250 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 31 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr5);
            throw new WalletValidationException(walletValidationErrorCode2, strIntern2, ((String) objArr5[0]).intern());
        }
        o.aw.b bVar2 = new o.aw.b(context, new b.InterfaceC0336b() { // from class: o.cc.d.5
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static char[] f22119a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static long f22120b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f22121c = 0;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static int f22122h = 0;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0014). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$c(short r9, short r10, short r11) {
                /*
                    int r8 = 105 - r11
                    byte[] r7 = o.cc.d.AnonymousClass5.$$a
                    int r0 = r10 * 3
                    int r6 = 1 - r0
                    int r0 = r9 * 4
                    int r5 = 4 - r0
                    byte[] r4 = new byte[r6]
                    r3 = 0
                    if (r7 != 0) goto L28
                    r0 = r5
                    r8 = r6
                    r2 = r3
                L14:
                    int r5 = r5 + 1
                    int r8 = r8 + r0
                    r1 = r2
                L18:
                    int r2 = r1 + 1
                    byte r0 = (byte) r8
                    r4[r1] = r0
                    if (r2 != r6) goto L25
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r4, r3)
                    return r0
                L25:
                    r0 = r7[r5]
                    goto L14
                L28:
                    r1 = r3
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: o.cc.d.AnonymousClass5.$$c(short, short, short):java.lang.String");
            }

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                f22121c = 0;
                f22122h = 1;
                f22119a = new char[]{46240, 26251, 4227, 49820, 64658, 44734, 22705, 2749, 9439, 54999, 33012, 45793, 27873, 7927, 51450, 64001, 37889, 62458, 8693, 22521, 34303, 48068, 59856, 8190, 19925, 25525, 37297, 51109, 62859, 11153, 22933, 36760, 48480, 54106, 383, 14159, 25927, 39709, 51481, 65391, 11573, 17188, 28939, 42752, 54559, 2822, 14591, 38017, 18062, 12418, 57988, 56511, 36523, 30853, 10926, 1230, 63178, 41182, 37616, 19690, 16110, 59619, 55835, 46113, 26116, 20532, 572, 64614, 44642, 38932, 19035, 9291, 5754, 49268, 45684, 27772, 24466};
                f22120b = -3247020877952760069L;
            }

            private static void f(char c2, int i7, int i8, Object[] objArr6) throws Throwable {
                int i9 = 2 % 2;
                o oVar = new o();
                long[] jArr = new long[i8];
                oVar.f19947b = 0;
                while (oVar.f19947b < i8) {
                    int i10 = $11 + 85;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = oVar.f19947b;
                        try {
                            Object[] objArr7 = {Integer.valueOf(f22119a[i7 >>> i11])};
                            Object objA = o.d.d.a(-214519724);
                            if (objA == null) {
                                byte b2 = (byte) 0;
                                objA = o.d.d.a(742 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 12, 632508977, false, $$c(b2, b2, (byte) (-$$a[1])), new Class[]{Integer.TYPE});
                            }
                            Object[] objArr8 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr7)).longValue()), Long.valueOf(i11), Long.valueOf(f22120b), Integer.valueOf(c2)};
                            Object objA2 = o.d.d.a(-1567654649);
                            if (objA2 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objA2 = o.d.d.a(766 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (AndroidCharacter.getMirror('0') + 12422), (ViewConfiguration.getEdgeSlop() >> 16) + 12, 1946853218, false, $$c(b3, b4, (byte) (b4 + 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                            }
                            jArr[i11] = ((Long) ((Method) objA2).invoke(null, objArr8)).longValue();
                            Object[] objArr9 = {oVar, oVar};
                            Object objA3 = o.d.d.a(-723636472);
                            if (objA3 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objA3 = o.d.d.a(View.MeasureSpec.getMode(0) + 387, (char) View.MeasureSpec.makeMeasureSpec(0, 0), 18 - KeyEvent.getDeadChar(0, 0), 39570797, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objA3).invoke(null, objArr9);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        int i12 = oVar.f19947b;
                        Object[] objArr10 = {Integer.valueOf(f22119a[i7 + i12])};
                        Object objA4 = o.d.d.a(-214519724);
                        if (objA4 == null) {
                            byte b7 = (byte) 0;
                            objA4 = o.d.d.a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 742, (char) View.resolveSize(0, 0), 12 - ExpandableListView.getPackedPositionGroup(0L), 632508977, false, $$c(b7, b7, (byte) (-$$a[1])), new Class[]{Integer.TYPE});
                        }
                        Object[] objArr11 = {Long.valueOf(((Long) ((Method) objA4).invoke(null, objArr10)).longValue()), Long.valueOf(i12), Long.valueOf(f22120b), Integer.valueOf(c2)};
                        Object objA5 = o.d.d.a(-1567654649);
                        if (objA5 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objA5 = o.d.d.a(TextUtils.getOffsetBefore("", 0) + 766, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12469), 11 - ((byte) KeyEvent.getModifierMetaStateMask()), 1946853218, false, $$c(b8, b9, (byte) (b9 + 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i12] = ((Long) ((Method) objA5).invoke(null, objArr11)).longValue();
                        Object[] objArr12 = {oVar, oVar};
                        Object objA6 = o.d.d.a(-723636472);
                        if (objA6 == null) {
                            byte b10 = (byte) 0;
                            byte b11 = b10;
                            objA6 = o.d.d.a(387 - (KeyEvent.getMaxKeyCode() >> 16), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 19 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 39570797, false, $$c(b10, b11, b11), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA6).invoke(null, objArr12);
                    }
                }
                char[] cArr = new char[i8];
                oVar.f19947b = 0;
                while (oVar.f19947b < i8) {
                    int i13 = $11 + 3;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                        Object[] objArr13 = {oVar, oVar};
                        Object objA7 = o.d.d.a(-723636472);
                        if (objA7 == null) {
                            byte b12 = (byte) 0;
                            byte b13 = b12;
                            objA7 = o.d.d.a(KeyEvent.normalizeMetaState(0) + 387, (char) View.getDefaultSize(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 18, 39570797, false, $$c(b12, b13, b13), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA7).invoke(null, objArr13);
                        int i14 = 77 / 0;
                    } else {
                        cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                        Object[] objArr14 = {oVar, oVar};
                        Object objA8 = o.d.d.a(-723636472);
                        if (objA8 == null) {
                            byte b14 = (byte) 0;
                            byte b15 = b14;
                            objA8 = o.d.d.a(View.combineMeasuredStates(0, 0) + 387, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 17, 39570797, false, $$c(b14, b15, b15), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA8).invoke(null, objArr14);
                    }
                }
                objArr6[0] = new String(cArr);
            }

            static void init$0() {
                $$a = new byte[]{49, -6, 40, 32};
                $$b = 141;
            }

            @Override // o.aw.b.InterfaceC0336b
            public final void c() throws Throwable {
                int i7 = 2 % 2;
                int i8 = f22121c + 39;
                f22122h = i8 % 128;
                if (i8 % 2 == 0) {
                    f.a();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (f.a()) {
                    Object[] objArr6 = new Object[1];
                    f((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 8209), (-1) - Process.getGidForName(""), TextUtils.indexOf("", "", 0, 0) + 17, objArr6);
                    String strIntern3 = ((String) objArr6[0]).intern();
                    Object[] objArr7 = new Object[1];
                    f((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 26491), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 16, (ViewConfiguration.getTouchSlop() >> 8) + 30, objArr7);
                    f.c(strIntern3, ((String) objArr7[0]).intern());
                }
                c cVar2 = cVar;
                if (cVar2 != null) {
                    cVar2.a();
                }
                int i9 = f22121c + 61;
                f22122h = i9 % 128;
                int i10 = i9 % 2;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
            @Override // o.aw.b.InterfaceC0336b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void c(o.bg.c r12) throws java.lang.Throwable {
                /*
                    r11 = this;
                    r10 = 2
                    int r0 = r10 % r10
                    int r0 = o.cc.d.AnonymousClass5.f22122h
                    int r1 = r0 + 71
                    int r0 = r1 % 128
                    o.cc.d.AnonymousClass5.f22121c = r0
                    int r1 = r1 % r10
                    r6 = 1
                    r4 = 0
                    if (r1 == 0) goto L7e
                    boolean r1 = o.ea.f.a()
                    r0 = 86
                    int r0 = r0 / r4
                    r1 = r1 ^ r6
                    if (r1 == r6) goto L64
                L1a:
                    int r0 = android.view.ViewConfiguration.getPressedStateDuration()
                    int r0 = r0 >> 16
                    int r0 = r0 + 8209
                    char r5 = (char) r0
                    r0 = 48
                    java.lang.String r9 = ""
                    int r3 = android.text.TextUtils.indexOf(r9, r0, r4, r4)
                    int r3 = r3 + r6
                    long r1 = android.os.Process.getElapsedCpuTime()
                    r7 = 0
                    int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
                    int r1 = 18 - r0
                    java.lang.Object[] r0 = new java.lang.Object[r6]
                    f(r5, r3, r1, r0)
                    r0 = r0[r4]
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.String r5 = r0.intern()
                    int r0 = android.view.KeyEvent.normalizeMetaState(r4)
                    char r3 = (char) r0
                    int r0 = android.widget.ExpandableListView.getPackedPositionType(r7)
                    int r2 = 47 - r0
                    int r0 = android.text.TextUtils.getOffsetBefore(r9, r4)
                    int r1 = r0 + 30
                    java.lang.Object[] r0 = new java.lang.Object[r6]
                    f(r3, r2, r1, r0)
                    r0 = r0[r4]
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.String r0 = r0.intern()
                    o.ea.f.c(r5, r0)
                L64:
                    o.cc.c r2 = r2
                    if (r2 == 0) goto L79
                    int r0 = o.cc.d.AnonymousClass5.f22121c
                    int r1 = r0 + 77
                    int r0 = r1 % 128
                    o.cc.d.AnonymousClass5.f22122h = r0
                    int r1 = r1 % r10
                    if (r1 != 0) goto L7a
                    r2.e(r12)
                    r0 = 98
                    int r0 = r0 / r4
                L79:
                    return
                L7a:
                    r2.e(r12)
                    goto L79
                L7e:
                    boolean r0 = o.ea.f.a()
                    if (r0 == r6) goto L1a
                    goto L64
                */
                throw new UnsupportedOperationException("Method not decompiled: o.cc.d.AnonymousClass5.c(o.bg.c):void");
            }
        }, this.f22080c);
        LinkedHashMap<String, o.ep.d> linkedHashMapG = this.f22080c.e().g();
        int iMyUid = Process.myUid();
        int priority = Thread.currentThread().getPriority();
        int iActiveCount = Thread.activeCount();
        int i7 = o.eq.b.f24699e * (-280241304);
        o.eq.b.f24699e = i7;
        o.ep.d dVar = linkedHashMapG.get((String) o.eq.b.e(iActiveCount, i7, priority, -688819955, iMyUid, 688819957, new Object[]{bVar}));
        bVar2.a(dVar.b(), dVar.n(), bVar, str);
        int i8 = f22077g + 101;
        f22079j = i8 % 128;
        int i9 = i8 % 2;
    }
}
