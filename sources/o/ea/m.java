package o.ea;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.common.base.Ascii;
import defpackage.Architecture;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import okio.Utf8;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.msgpack.core.MessagePack;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.EO;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class m {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static int f23560a = 0;

    /* JADX INFO: renamed from: b */
    public static int f23561b = 0;

    /* JADX INFO: renamed from: c */
    public static int f23562c = 0;

    /* JADX INFO: renamed from: d */
    public static int f23563d = 0;

    /* JADX INFO: renamed from: e */
    public static int f23564e = 0;

    /* JADX INFO: renamed from: f */
    public static int f23565f = 0;

    /* JADX INFO: renamed from: g */
    public static int f23566g = 0;

    /* JADX INFO: renamed from: h */
    public static int f23567h = 0;

    /* JADX INFO: renamed from: i */
    private static int f23568i = 0;

    /* JADX INFO: renamed from: j */
    private static long f23569j = 0;

    /* JADX INFO: renamed from: k */
    private static short[] f23570k = null;

    /* JADX INFO: renamed from: l */
    private static int f23571l = 0;

    /* JADX INFO: renamed from: m */
    private static byte[] f23572m = null;

    /* JADX INFO: renamed from: n */
    private static int f23573n = 0;

    /* JADX INFO: renamed from: o */
    private static int f23574o = 0;

    /* JADX INFO: renamed from: p */
    private static int f23575p = 0;

    /* JADX INFO: renamed from: r */
    private static int f23576r = 0;

    /* JADX INFO: renamed from: s */
    private static int f23577s = 0;

    public static final class c {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        private static int f23578a = 0;

        /* JADX INFO: renamed from: b */
        private static int f23579b = 0;

        /* JADX INFO: renamed from: d */
        private static int f23580d = 0;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0026 -> B:17:0x0017). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(int r8, byte r9, short r10) {
            /*
                byte[] r7 = o.ea.m.c.$$a
                int r2 = r10 * 3
                int r1 = 1 - r2
                int r0 = r8 * 2
                int r6 = r0 + 4
                int r0 = r9 * 2
                int r5 = r0 + 113
                byte[] r4 = new byte[r1]
                r3 = 0
                int r2 = 0 - r2
                if (r7 != 0) goto L2b
                r0 = r2
                r1 = r3
            L17:
                int r6 = r6 + 1
                int r0 = -r0
                int r5 = r5 + r0
            L1b:
                byte r0 = (byte) r5
                r4[r1] = r0
                if (r1 != r2) goto L26
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L26:
                int r1 = r1 + 1
                r0 = r7[r6]
                goto L17
            L2b:
                r1 = r3
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ea.m.c.$$c(int, byte, short):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f23578a = 0;
            f23580d = 1;
            f23579b = -1270219499;
        }

        public static boolean a(String str, String... strArr) {
            int i2 = 2 % 2;
            int length = strArr.length;
            int i3 = f23578a + 69;
            f23580d = i3 % 128;
            int i4 = i3 % 2;
            for (int i5 = 0; i5 < length; i5++) {
                int i6 = f23578a + 73;
                f23580d = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 76 / 0;
                    if (strArr[i5].equalsIgnoreCase(str)) {
                        return true;
                    }
                } else if (strArr[i5].equalsIgnoreCase(str)) {
                    return true;
                }
            }
            return false;
        }

        public static boolean b(int i2, int i3, int i4) {
            int i5 = 2 % 2;
            int i6 = f23578a;
            int i7 = i6 + 65;
            f23580d = i7 % 128;
            int i8 = i7 % 2;
            if (i2 >= i3) {
                int i9 = i6 + 37;
                f23580d = i9 % 128;
                int i10 = i9 % 2;
                if (i2 <= i4) {
                    int i11 = i6 + 101;
                    f23580d = i11 % 128;
                    return i11 % 2 != 0;
                }
            }
            int i12 = f23580d + 17;
            f23578a = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }

        public static boolean b(byte[] bArr, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = f23580d + 57;
            f23578a = i5 % 128;
            return b(bArr.length, i5 % 2 != 0 ? 1 : 0, i3);
        }

        public static boolean c(String str, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = f23578a + 65;
            f23580d = i5 % 128;
            int i6 = i5 % 2;
            Object obj = null;
            int length = str.length();
            if (i6 == 0) {
                b(length, i2, i3);
                throw null;
            }
            boolean zB = b(length, i2, i3);
            int i7 = f23580d + 65;
            f23578a = i7 % 128;
            if (i7 % 2 == 0) {
                return zB;
            }
            obj.hashCode();
            throw null;
        }

        public static boolean d(int i2, int... iArr) {
            int i3 = 2 % 2;
            int i4 = f23578a + 21;
            f23580d = i4 % 128;
            int i5 = i4 % 2;
            int length = iArr.length;
            for (int i6 = 0; i6 < 5; i6++) {
                int i7 = f23580d + 5;
                int i8 = i7 % 128;
                f23578a = i8;
                int i9 = i7 % 2;
                if (iArr[i6] == i2) {
                    int i10 = i8 + 95;
                    f23580d = i10 % 128;
                    int i11 = i10 % 2;
                    return true;
                }
            }
            return false;
        }

        public static boolean d(String str) throws Throwable {
            int i2 = 2 % 2;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            f((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6, "\u0011￭￡￤\u000f/", true, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 90, Drawable.resolveOpacity(0, 0) + 5, objArr);
            StringBuilder sbAppend = sb.append(((String) objArr[0]).intern()).append(4);
            Object[] objArr2 = new Object[1];
            f((ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, true, (ViewConfiguration.getScrollBarSize() >> 8) + 139, 1 - TextUtils.getCapsMode("", 0, 0), objArr2);
            if (!str.matches(sbAppend.append(((String) objArr2[0]).intern()).toString())) {
                return false;
            }
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr3 = new Object[1];
            f((ViewConfiguration.getScrollDefaultDelay() >> 16) + 2, "\uffff\u0001", false, 62 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.getTrimmedLength("") + 1, objArr3);
            int iIntValue = Integer.valueOf(sb2.append(((String) objArr3[0]).intern()).append(str.substring(0, 2)).toString()).intValue();
            int iIntValue2 = Integer.valueOf(str.substring(2, 4)).intValue();
            if (iIntValue2 > 0) {
                int i3 = f23580d + 107;
                f23578a = i3 % 128;
                int i4 = i3 % 2;
                if (12 >= iIntValue2) {
                    Calendar calendar = Calendar.getInstance();
                    int i5 = calendar.get(1);
                    int i6 = calendar.get(2) + 1;
                    if (iIntValue < i5) {
                        int i7 = f23580d + 27;
                        f23578a = i7 % 128;
                        if (i7 % 2 != 0) {
                            int i8 = 73 / 0;
                        }
                        return false;
                    }
                    if (iIntValue != i5 || iIntValue2 >= i6) {
                        return true;
                    }
                    int i9 = f23580d + 43;
                    f23578a = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 58 / 0;
                    }
                    return false;
                }
            }
            int i11 = f23578a + 117;
            f23580d = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }

        @SafeVarargs
        public static <T> boolean e(T t2, T... tArr) {
            int i2 = 2 % 2;
            for (T t3 : tArr) {
                if (t3.equals(t2)) {
                    int i3 = f23578a + 11;
                    f23580d = i3 % 128;
                    int i4 = i3 % 2;
                    return true;
                }
            }
            int i5 = f23580d + 43;
            f23578a = i5 % 128;
            if (i5 % 2 == 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void f(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
            Object charArray;
            String str2 = str;
            int i5 = 2 % 2;
            if (str2 != null) {
                int i6 = $10 + 23;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                charArray = str2.toCharArray();
            } else {
                charArray = str2;
            }
            char[] cArr = (char[]) charArray;
            o.a.n nVar = new o.a.n();
            char[] cArr2 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                nVar.f19946e = cArr[nVar.f19944a];
                cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
                int i8 = nVar.f19944a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(f23579b)};
                    Object objA = o.d.d.a(1376241034);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 1);
                        objA = o.d.d.a(269 - ImageFormat.getBitsPerPixel(0), (char) TextUtils.getOffsetBefore("", 0), ';' - AndroidCharacter.getMirror('0'), -2071844881, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {nVar, nVar};
                    Object objA2 = o.d.d.a(-202660535);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(Drawable.resolveOpacity(0, 0) + 522, (char) KeyEvent.normalizeMetaState(0), 12 - TextUtils.indexOf("", ""), 627984172, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
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
                nVar.f19945b = i4;
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
                System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
            }
            if (z2) {
                int i9 = $10 + 53;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                char[] cArr4 = new char[i2];
                nVar.f19944a = 0;
                int i11 = $10 + 117;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                while (nVar.f19944a < i2) {
                    cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                    Object[] objArr4 = {nVar, nVar};
                    Object objA3 = o.d.d.a(-202660535);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a(523 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 13 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 627984172, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        static void init$0() {
            $$a = new byte[]{82, 42, -87, -21};
            $$b = 168;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0026 -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r7, byte r8, short r9) {
        /*
            int r2 = r7 * 3
            int r1 = 1 - r2
            int r7 = 114 - r9
            byte[] r6 = o.ea.m.$$a
            int r0 = r8 * 2
            int r5 = 3 - r0
            byte[] r4 = new byte[r1]
            r3 = 0
            int r2 = 0 - r2
            if (r6 != 0) goto L2b
            r7 = r2
            r0 = r5
            r1 = r3
        L16:
            int r5 = r5 + r7
            r7 = r5
            r5 = r0
        L19:
            byte r0 = (byte) r7
            r4[r1] = r0
            int r0 = r5 + 1
            if (r1 != r2) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L26:
            int r1 = r1 + 1
            r5 = r6[r0]
            goto L16
        L2b:
            r1 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ea.m.$$c(int, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23566g = 1956596423;
        f23567h = -47530139;
        f23565f = 1414115501;
        f23560a = 1195707348;
        f23562c = -2128474345;
        f23564e = -90544429;
        f23561b = -966802280;
        f23563d = -503831978;
        f23577s = 0;
        f23575p = 1;
        f23571l = 0;
        f23576r = 1;
        c();
        KeyEvent.getDeadChar(0, 0);
        int i2 = f23575p + 53;
        f23577s = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 8 / 0;
        }
    }

    public static int a(int[] iArr) {
        int i2 = 2 % 2;
        int[] iArr2 = {0, 2, 4, 6, 8, 1, 3, 5, 7, 9};
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            if (i5 % 2 == 0) {
                int i6 = f23576r + 97;
                f23571l = i6 % 128;
                int i7 = i6 % 2;
                i3 += iArr[i5];
            } else {
                i4 += iArr2[iArr[i5]];
            }
        }
        int i8 = (i3 + i4) % 10;
        if (i8 > 0) {
            i8 = 10 - i8;
            int i9 = f23576r + 79;
            f23571l = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = f23571l + 75;
        f23576r = i11 % 128;
        int i12 = i11 % 2;
        return i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Enum a(Class cls, String str) {
        int i2 = 2 % 2;
        int i3 = f23576r + 9;
        f23571l = i3 % 128;
        int i4 = i3 % 2;
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        if (enumArr == 0) {
            return null;
        }
        int i5 = f23571l + 39;
        f23576r = i5 % 128;
        int i6 = i5 % 2;
        for (Architecture architecture : enumArr) {
            if (((o.en.a) architecture).a().equals(str)) {
                int i7 = f23571l + 61;
                f23576r = i7 % 128;
                int i8 = i7 % 2;
                return architecture;
            }
        }
        return null;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        Class cls = (Class) objArr[0];
        a[] aVarArr = (a[]) objArr[1];
        int i2 = 2 % 2;
        int i3 = f23576r;
        int i4 = i3 + 49;
        f23571l = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (aVarArr != null) {
            return c(cls, aVarArr);
        }
        int i5 = i3 + 3;
        f23571l = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static <T1 extends a<O1>, O1> Map<String, O1> a(Map<String, T1> map) {
        int i2 = 2 % 2;
        HashMap map2 = new HashMap();
        Iterator<Map.Entry<String, T1>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            int i3 = f23576r + 15;
            f23571l = i3 % 128;
            if (i3 % 2 != 0) {
                Map.Entry<String, T1> next = it.next();
                map2.put(next.getKey(), next.getValue().e());
                int i4 = 32 / 0;
            } else {
                Map.Entry<String, T1> next2 = it.next();
                map2.put(next2.getKey(), next2.getValue().e());
            }
        }
        return map2;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x002b A[PHI: r1
  0x002b: PHI (r1v6 char) = (r1v5 char), (r1v7 char) binds: [B:50:0x003f, B:40:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.lang.String r7) {
        /*
            r6 = 2
            int r0 = r6 % r6
            int r0 = o.ea.m.f23571l
            int r1 = r0 + 79
            int r0 = r1 % 128
            o.ea.m.f23576r = r0
            int r1 = r1 % r6
            r5 = 0
            r4 = 1
            if (r1 != 0) goto L42
            r3 = r4
        L11:
            int r0 = r7.length()
            if (r3 >= r0) goto L44
            int r1 = o.ea.m.f23571l
            r2 = 65
            int r1 = r1 + r2
            int r0 = r1 % 128
            o.ea.m.f23576r = r0
            int r1 = r1 % r6
            if (r1 != 0) goto L3b
            char r1 = r7.charAt(r3)
            r0 = 72
            if (r1 < r0) goto L37
        L2b:
            r0 = 90
            if (r1 <= r0) goto L33
            r0 = 97
            if (r1 < r0) goto L37
        L33:
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 <= r0) goto L38
        L37:
            return r5
        L38:
            int r3 = r3 + 1
            goto L11
        L3b:
            char r1 = r7.charAt(r3)
            if (r1 < r2) goto L37
            goto L2b
        L42:
            r3 = r5
            goto L11
        L44:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ea.m.a(java.lang.String):boolean");
    }

    @SafeVarargs
    public static <T extends a<O>, O> O[] a(Class<O> cls, T... tArr) {
        Object[] objArr = {cls, tArr};
        int i2 = f23565f * (-1519886034);
        f23565f = i2;
        return (O[]) ((Object[]) c(objArr, (int) SystemClock.elapsedRealtime(), (int) Runtime.getRuntime().maxMemory(), -1364214447, i2, 1364214450, (int) Process.getElapsedCpuTime()));
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        CharSequence charSequence = (CharSequence) objArr[0];
        int i2 = 2 % 2;
        int i3 = f23576r + 41;
        f23571l = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (charSequence == null) {
            return null;
        }
        String strNormalize = Normalizer.normalize(charSequence, Normalizer.Form.NFKC);
        int i4 = f23571l + 101;
        f23576r = i4 % 128;
        int i5 = i4 % 2;
        return strNormalize;
    }

    public static <T extends a<O>, O> List<O> b(Collection<T> collection) {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<T> it = collection.iterator();
        int i3 = f23571l + 79;
        f23576r = i3 % 128;
        int i4 = i3 % 2;
        while (it.hasNext()) {
            int i5 = f23571l + 33;
            f23576r = i5 % 128;
            if (i5 % 2 == 0) {
                arrayList.add(it.next().e());
                int i6 = 22 / 0;
            } else {
                arrayList.add(it.next().e());
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static o.ef.c b(Enum[] enumArr) {
        int i2 = 2 % 2;
        o.ef.c cVar = new o.ef.c();
        int length = enumArr.length;
        int i3 = 0;
        while (i3 < length) {
            int i4 = f23576r + 55;
            f23571l = i4 % 128;
            int i5 = i4 % 2;
            cVar.a(((o.en.a) enumArr[i3]).a());
            i3++;
            int i6 = f23571l + 107;
            f23576r = i6 % 128;
            int i7 = i6 % 2;
        }
        return cVar;
    }

    public static boolean b(CharSequence charSequence) {
        int i2 = 2 % 2;
        int i3 = f23571l + 41;
        f23576r = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (charSequence != null && charSequence.length() != 0) {
            return false;
        }
        int i4 = f23571l + 83;
        f23576r = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x002a A[PHI: r1
  0x002a: PHI (r1v7 char) = (r1v4 char), (r1v8 char) binds: [B:43:0x0041, B:36:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(java.lang.String r6) {
        /*
            r5 = 2
            int r0 = r5 % r5
            int r0 = o.ea.m.f23571l
            int r1 = r0 + 25
            int r0 = r1 % 128
            o.ea.m.f23576r = r0
            int r1 = r1 % r5
            r4 = 0
            r3 = 1
            if (r1 != 0) goto L44
            r2 = r3
        L11:
            int r0 = r6.length()
            if (r2 >= r0) goto L46
            int r0 = o.ea.m.f23571l
            int r1 = r0 + 75
            int r0 = r1 % 128
            o.ea.m.f23576r = r0
            int r1 = r1 % r5
            if (r1 != 0) goto L3b
            char r1 = r6.charAt(r2)
            r0 = 53
            if (r1 < r0) goto L2e
        L2a:
            r0 = 57
            if (r1 <= r0) goto L38
        L2e:
            int r0 = o.ea.m.f23571l
            int r1 = r0 + 105
            int r0 = r1 % 128
            o.ea.m.f23576r = r0
            int r1 = r1 % r5
            return r4
        L38:
            int r2 = r2 + 1
            goto L11
        L3b:
            char r1 = r6.charAt(r2)
            r0 = 48
            if (r1 < r0) goto L2e
            goto L2a
        L44:
            r2 = r4
            goto L11
        L46:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ea.m.b(java.lang.String):boolean");
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        String str = (String) objArr[0];
        int i2 = 2 % 2;
        int i3 = f23576r + 3;
        int i4 = i3 % 128;
        f23571l = i4;
        int i5 = i3 % 2;
        if (str != null) {
            int i6 = i4 + 103;
            f23576r = i6 % 128;
            if (i6 % 2 == 0) {
                str.isEmpty();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!str.isEmpty()) {
                return Boolean.valueOf(str.equals(str.toUpperCase()));
            }
        }
        return false;
    }

    public static /* synthetic */ Object c(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) throws Throwable {
        float f2;
        int i8 = ~(((i6 + i4) - (i6 & i4)) | i5);
        int i9 = ~i4;
        int i10 = (~((i9 + i5) - (i9 & i5))) | (~((~i5) | i6));
        int i11 = ~((-1) - (((-1) - i5) & ((-1) - (~i6))));
        int i12 = (i11 + i9) - (i11 & i9);
        int i13 = i6 + i4 + i3 + ((-2044576983) * i7) + (1743660113 * i2);
        int i14 = i13 * i13;
        int i15 = ((1047202342 * i6) - 713031680) + (164951516 * i4) + (i8 * 441125413) + (441125413 * i10) + ((-441125413) * i12) + (606076928 * i3) + (689963008 * i7) + ((-299892736) * i2) + ((-1081737216) * i14);
        int i16 = ((i6 * 2048727874) - 782056376) + (i4 * 2048728756) + (i8 * (-441)) + (i10 * (-441)) + (i12 * 441) + (i3 * 2048728315) + (i7 * 2142076211) + (i2 * (-1448904853)) + (i14 * 1885470720);
        int i17 = i15 + (i16 * i16 * (-1618345984));
        if (i17 != 1) {
            return i17 != 2 ? i17 != 3 ? i17 != 4 ? b(objArr) : c(objArr) : a(objArr) : d(objArr);
        }
        Context context = (Context) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i18 = 2 % 2;
        int i19 = f23571l + 27;
        f23576r = i19 % 128;
        if (i19 % 2 == 0) {
            Object[] objArr2 = new Object[0];
            Method method = Class.forName(EO.Od("7qK?^\u000e\u001b&~|s]}\u000b\u000f0z/Gs(\t\u0019", (short) (Od.Xd() ^ (-11566)))).getMethod(C1561oA.Qd("vs\u0002^p}x}yijw", (short) (FB.Xd() ^ 40)), new Class[0]);
            try {
                method.setAccessible(true);
                f2 = fFloatValue + ((Resources) method.invoke(context, objArr2)).getDisplayMetrics().density;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else {
            Object[] objArr3 = new Object[0];
            Method method2 = Class.forName(C1593ug.zd("$2)861-w.;;B4>E\u007f\u0016CCJ<PM", (short) (C1499aX.Xd() ^ (-8260)), (short) (C1499aX.Xd() ^ (-8189)))).getMethod(C1561oA.od("\"\u001f-\n\u001c)$)%\u0015\u0016#", (short) (C1580rY.Xd() ^ (-20405))), new Class[0]);
            try {
                method2.setAccessible(true);
                f2 = fFloatValue * ((Resources) method2.invoke(context, objArr3)).getDisplayMetrics().density;
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        return Integer.valueOf((int) f2);
    }

    public static String c(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        int i2 = f23563d * 691068131;
        f23563d = i2;
        int i3 = f23561b * (-1916120846);
        f23561b = i3;
        return (String) c(objArr, (int) SystemClock.uptimeMillis(), i3, -327535505, i2, 327535505, Process.myUid());
    }

    public static String c(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23576r + 3;
        f23571l = i3 % 128;
        int i4 = i3 % 2;
        String strD = d(str.getBytes(g.c()));
        int i5 = f23571l + 37;
        f23576r = i5 % 128;
        if (i5 % 2 != 0) {
            return strD;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void c() {
        f23569j = -2554189326713422745L;
        f23568i = -122837845;
        f23573n = 1150422438;
        f23574o = 911178299;
        f23572m = new byte[]{125, MessagePack.Code.FALSE, 45, 47, 43, Ascii.GS, 40, 65, 77, MessagePack.Code.FIXEXT8, Ascii.GS, Utf8.REPLACEMENT_BYTE, Ascii.SUB, Ascii.EM, 40, 33, 1, 45, 41, 41, 101, MessagePack.Code.BIN32, 41, 45, Ascii.DC2, 33, 48, 90, MessagePack.Code.EXT16, 91, 127, -3, -3, -15, -29, -8, Ascii.NAK, 39, -82, -5, -15, -12, 17, 45, -25, 9, -29, -11, MessagePack.Code.FIXSTR_PREFIX, 5, -3, 17, MessagePack.Code.FLOAT64, -11, 4, 1, MessagePack.Code.FALSE, Ascii.VT, -8};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SafeVarargs
    public static <T extends a<O>, O> O[] c(Class<O> cls, T... tArr) {
        int i2 = 2 % 2;
        int i3 = f23576r + 25;
        f23571l = i3 % 128;
        int i4 = i3 % 2;
        int length = tArr.length;
        O[] oArr = (O[]) ((Object[]) Array.newInstance((Class<?>) cls, length));
        int i5 = 0;
        while (i5 < length) {
            int i6 = f23571l + 77;
            f23576r = i6 % 128;
            if (i6 % 2 == 0) {
                oArr[i5] = tArr[i5].e();
                i5 += 58;
            } else {
                oArr[i5] = tArr[i5].e();
                i5++;
            }
        }
        int i7 = f23571l + 63;
        f23576r = i7 % 128;
        if (i7 % 2 != 0) {
            return oArr;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0155: INVOKE (r5 I:java.lang.StringBuilder) = (r2v11 ?? I:java.lang.StringBuilder), (r4 I:java.lang.String) VIRTUAL call: java.lang.StringBuilder.append(java.lang.String):java.lang.StringBuilder A[MD:(java.lang.String):java.lang.StringBuilder (c)], block:B:42:0x0115 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0196: INVOKE (r5 I:java.lang.StringBuilder) = (r2v24 ?? I:java.lang.StringBuilder), (r8 I:java.lang.String) VIRTUAL call: java.lang.StringBuilder.append(java.lang.String):java.lang.StringBuilder A[MD:(java.lang.String):java.lang.StringBuilder (c)], block:B:42:0x0115 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    public static <T> T d(Class<T> cls, String str, String str2) throws Throwable {
        ?? r4;
        ?? r8;
        int i2 = 2 % 2;
        int i3 = f23576r + 27;
        f23571l = i3 % 128;
        int i4 = i3 % 2;
        try {
            Class<?> cls2 = Class.forName(str);
            if (cls.isAssignableFrom(cls2)) {
                int i5 = f23571l + 97;
                f23576r = i5 % 128;
                if (i5 % 2 != 0) {
                    return (T) cls2.newInstance();
                }
                cls2.newInstance();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            t((short) (ImageFormat.getBitsPerPixel(0) + 98), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1136678618, Color.red(0) - 1927116659, KeyEvent.keyCodeFromString("") - 44, (byte) ((-1) - ImageFormat.getBitsPerPixel(0)), objArr);
            StringBuilder sbAppend = sb.append(((String) objArr[0]).intern()).append(str2);
            Object[] objArr2 = new Object[1];
            t((short) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) - 10), 1136678645 - (ViewConfiguration.getDoubleTapTimeout() >> 16), KeyEvent.keyCodeFromString("") - 1927116694, (-44) - (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), objArr2);
            StringBuilder sbAppend2 = sbAppend.append(((String) objArr2[0]).intern()).append(str);
            Object[] objArr3 = new Object[1];
            t((short) (Process.getGidForName("") + 3), 1136678647 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (-1927116634) - TextUtils.lastIndexOf("", '0'), (-45) - ExpandableListView.getPackedPositionChild(0L), (byte) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr3);
            throw new RuntimeException(sbAppend2.append(((String) objArr3[0]).intern()).toString());
        } catch (Exception e2) {
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr4 = new Object[1];
            t((short) (97 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 1136678618 - TextUtils.indexOf("", "", 0), (-1927116659) - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) - 44, (byte) ExpandableListView.getPackedPositionType(0L), objArr4);
            StringBuilder sbAppend3 = sb2.append(((String) objArr4[0]).intern()).append((String) r4);
            Object[] objArr5 = new Object[1];
            t((short) ((Process.myTid() >> 22) - 10), 1136678645 - View.MeasureSpec.getSize(0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1927116695, View.resolveSizeAndState(0, 0, 0) - 44, (byte) (ImageFormat.getBitsPerPixel(0) + 1), objArr5);
            StringBuilder sbAppend4 = sbAppend3.append(((String) objArr5[0]).intern()).append((String) r8);
            Object[] objArr6 = new Object[1];
            t((short) (View.combineMeasuredStates(0, 0) + 2), 1136678647 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1927116634, (-44) - (ViewConfiguration.getTapTimeout() >> 16), (byte) (ViewConfiguration.getPressedStateDuration() >> 16), objArr6);
            String string = sbAppend4.append(((String) objArr6[0]).intern()).toString();
            if (f.a()) {
                Object[] objArr7 = new Object[1];
                q("翻羮륬壽\ud9d9휅蒮鏢쟼", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr7);
                f.e(((String) objArr7[0]).intern(), string, e2);
            }
            throw new RuntimeException(string);
        }
    }

    public static <T> T d(T t2, T t3) {
        int i2 = 2 % 2;
        int i3 = f23576r + 85;
        int i4 = i3 % 128;
        f23571l = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (t2 != null) {
            return t2;
        }
        int i5 = i4 + 95;
        f23576r = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 32 / 0;
        }
        return t3;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        Collection collection = (Collection) objArr[0];
        int i2 = 2 % 2;
        int i3 = f23576r + 77;
        f23571l = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 6 / 0;
            if (collection == null) {
                return null;
            }
        } else if (collection == null) {
            return null;
        }
        List listB = b(collection);
        int i5 = f23576r + 61;
        f23571l = i5 % 128;
        int i6 = i5 % 2;
        return listB;
    }

    public static String d(Context context, String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23576r + 41;
        f23571l = i3 % 128;
        if (i3 % 2 != 0) {
            o.ea.c.a();
            b.b(context, str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        o.ea.c.a();
        String strB = b.b(context, str);
        if (strB == null) {
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            q("\u0dff\u0db2᪶ꬁೣ瓂睈䛇뗢㱉㿈จ絚엖\ue657랽ⓧ趮껣缱\uec0f唲ᕥ⃤韏\u12bf\udd1a\ue858弪\uda02薝醅ڵ掚䰔夔칿⬱㓻", (ViewConfiguration.getLongPressTimeout() >> 16) + 1, objArr);
            throw new PackageManager.NameNotFoundException(sb.append(((String) objArr[0]).intern()).append(str).toString());
        }
        if (f.a()) {
            Object[] objArr2 = new Object[1];
            q("翻羮륬壽\ud9d9휅蒮鏢쟼", 1 - (Process.myPid() >> 22), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr3 = new Object[1];
            q("龬鿋⊋쿊놌䳳ᎄﮖ➽Ѯ嬅댣\uef25ﷺ芉ૠ뚄떀쨵쉑縛洠熲鷄օ⪧맕啹쵽\ue238\ue15d⳰铴寪⢅\ue42f尡\u1316偽밞\ue3cc죛韀瞆ꭐ聏\udf41켽猤禲ۆ蛿", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr3);
            f.c(strIntern, sb2.append(((String) objArr3[0]).intern()).append(strB).toString());
        }
        int i4 = f23571l + 125;
        f23576r = i4 % 128;
        int i5 = i4 % 2;
        return strB;
    }

    public static String d(String str) {
        int i2 = 2 % 2;
        int length = str.length() - 1;
        char upperCase = Character.toUpperCase('f');
        int i3 = length;
        int i4 = i3;
        while (i3 > 0 && Character.toUpperCase(str.charAt(i3)) == upperCase) {
            int i5 = f23571l + 117;
            f23576r = i5 % 128;
            if (i5 % 2 == 0) {
                i4 += 5;
                i3 += 103;
            } else {
                i4--;
                i3--;
            }
        }
        if (i4 != 0) {
            return i4 == length ? str : str.substring(0, i4 + 1);
        }
        int i6 = f23576r + 33;
        f23571l = i6 % 128;
        int i7 = i6 % 2;
        return "";
    }

    public static <T> String d(String str, T[] tArr) {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        int length = tArr.length;
        int i3 = 0;
        while (i3 < length) {
            sb.append(tArr[i3].toString());
            i3++;
            if (i3 < length) {
                int i4 = f23576r + 101;
                f23571l = i4 % 128;
                int i5 = i4 % 2;
                sb.append(str);
            }
            int i6 = f23576r + 35;
            f23571l = i6 % 128;
            int i7 = i6 % 2;
        }
        return sb.toString();
    }

    private static String d(byte[] bArr) throws Throwable {
        int i2 = 2 % 2;
        byte[] bArrC = o.eh.e.c(bArr);
        Class<?> cls = Class.forName(C1561oA.Kd("4B9HFA=\bPPFJ\r\"BUH\u001a\u0019", (short) (C1499aX.Xd() ^ (-27165))));
        Class<?>[] clsArr = {byte[].class, Integer.TYPE};
        Object[] objArr = {bArrC, 10};
        short sXd = (short) (OY.Xd() ^ 18525);
        short sXd2 = (short) (OY.Xd() ^ 10575);
        int[] iArr = new int[".\u0019`f,\u001a".length()];
        QB qb = new QB(".\u0019`f,\u001a");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(((i3 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i3++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i3), clsArr);
        try {
            declaredMethod.setAccessible(true);
            String str = new String((byte[]) declaredMethod.invoke(null, objArr), g.c());
            int i4 = f23571l + 51;
            f23576r = i4 % 128;
            if (i4 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static <T extends a<O>, O> List<O> d(Collection<T> collection) {
        Object[] objArr = {collection};
        int i2 = f23562c * (-1965719327);
        f23562c = i2;
        int iMyPid = Process.myPid();
        int iNextInt = new Random().nextInt();
        int i3 = 1927323341 * f23560a;
        f23560a = i3;
        return (List) c(objArr, i3, iMyPid, -1045353435, i2, 1045353437, iNextInt);
    }

    @SafeVarargs
    public static <K, V> List<V> d(Map<K, V> map, K... kArr) {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList(kArr.length);
        int length = kArr.length;
        int i3 = 0;
        while (i3 < length) {
            K k2 = kArr[i3];
            if (map.get(k2) != null) {
                arrayList.add(map.get(k2));
                int i4 = f23576r + 105;
                f23571l = i4 % 128;
                int i5 = i4 % 2;
            }
            i3++;
            int i6 = f23576r + 55;
            f23571l = i6 % 128;
            int i7 = i6 % 2;
        }
        return arrayList;
    }

    public static o.ef.c d(List<?> list) {
        int i2 = 2 % 2;
        o.ef.c cVar = new o.ef.c();
        Iterator<?> it = list.iterator();
        int i3 = f23576r + 123;
        f23571l = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 3 % 5;
        }
        while (it.hasNext()) {
            int i5 = f23571l + 13;
            f23576r = i5 % 128;
            int i6 = i5 % 2;
            cVar.a(it.next());
            int i7 = f23571l + 27;
            f23576r = i7 % 128;
            int i8 = i7 % 2;
        }
        return cVar;
    }

    public static boolean d(o.ef.a aVar, String str) {
        int i2 = 2 % 2;
        if (aVar.d(str)) {
            int i3 = f23571l + 125;
            f23576r = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = {aVar, str};
            int i5 = o.ef.a.f23783q * 704632834;
            o.ef.a.f23783q = i5;
            int i6 = (int) Runtime.getRuntime().totalMemory();
            int i7 = o.ef.a.f23787u * (-1582463295);
            o.ef.a.f23787u = i7;
            int i8 = o.ef.a.f23788v * 1024294213;
            o.ef.a.f23788v = i8;
            if (!((Boolean) o.ef.a.a(322886991, objArr, i7, i8, -322886980, i5, i6)).booleanValue()) {
                int i9 = f23576r + 27;
                f23571l = i9 % 128;
                return i9 % 2 == 0;
            }
        }
        return false;
    }

    public static int e(Context context, float f2) {
        Object[] objArr = {context, Float.valueOf(f2)};
        int priority = Thread.currentThread().getPriority();
        int priority2 = Thread.currentThread().getPriority();
        int i2 = f23564e * 1516253574;
        f23564e = i2;
        return ((Integer) c(objArr, new Random().nextInt(565634034), priority2, 499039219, priority, -499039218, i2)).intValue();
    }

    public static long e(byte[] bArr) {
        int i2 = 2 % 2;
        int i3 = f23571l + 39;
        f23576r = i3 % 128;
        int i4 = i3 % 2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.put(bArr, 0, bArr.length);
        byteBufferAllocate.flip();
        long j2 = byteBufferAllocate.getLong();
        int i5 = f23571l + 103;
        f23576r = i5 % 128;
        if (i5 % 2 != 0) {
            return j2;
        }
        throw null;
    }

    public static String e(String str) throws Throwable {
        int length;
        int i2 = 2 % 2;
        int i3 = f23576r + 17;
        f23571l = i3 % 128;
        if (i3 % 2 == 0 ? (length = str.length()) == 4 : (length = str.length()) == 2) {
            int i4 = f23571l + 107;
            f23576r = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }
        if (length > 4) {
            return str.substring(length - 4);
        }
        if (f.a()) {
            Object[] objArr = new Object[1];
            q("翻羮륬壽\ud9d9휅蒮鏢쟼", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            t((short) ((-119) - TextUtils.indexOf("", "", 0)), ImageFormat.getBitsPerPixel(0) + 1136678649, (-1927116623) + (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (-44) - (ViewConfiguration.getWindowTouchSlop() >> 8), (byte) TextUtils.indexOf("", "", 0), objArr2);
            StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern()).append(str);
            Object[] objArr3 = new Object[1];
            q("뽰뼐켘\u1774ⶱꄥ쬧枕ܤ\ue9e5莵⼍쿽ၯ婶雺附堀ኌ帢", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr3);
            StringBuilder sbAppend2 = sbAppend.append(((String) objArr3[0]).intern()).append(4);
            Object[] objArr4 = new Object[1];
            q("艞艾థ\uee2bᦣ扛㉹厕㩘", -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr4);
            f.c(strIntern, sbAppend2.append(((String) objArr4[0]).intern()).toString());
        }
        return "";
    }

    public static <T> String e(String str, Iterator<T> it) {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            int i3 = f23571l + 19;
            f23576r = i3 % 128;
            if (i3 % 2 == 0) {
                sb.append(it.next().toString());
                it.hasNext();
                throw null;
            }
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(str);
                int i4 = f23576r + 55;
                f23571l = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        return sb.toString();
    }

    public static Date e(long j2) {
        int i2 = 2 % 2;
        if (j2 != -1) {
            return new Date(j2);
        }
        int i3 = f23576r + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        int i4 = i3 % 128;
        f23571l = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 97;
        f23576r = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static boolean e(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23576r + 125;
        f23571l = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        q(C1561oA.Xd("➾➞蝂蜒艆洷뭁䱲蟗ꖻ\uf3cf蓫콜방䩇┓", (short) (OY.Xd() ^ 14608)), TextUtils.getCapsMode("", 0, 0) + 1, objArr);
        Object[] objArr2 = {((String) objArr[0]).intern()};
        Method method = Class.forName(Wg.vd("\u000f\u001d\u0010\u001f!\u001c\u0014^\u0019&\")\u001f),f\u0001.*1';4", (short) (C1499aX.Xd() ^ (-11567)))).getMethod(hg.Vd("KHV4YRRBI.?KN@9:", (short) (ZN.Xd() ^ 13650), (short) (ZN.Xd() ^ 20725)), Class.forName(Qg.kd("A7K5\u0001>2>6{ @=37/", (short) (FB.Xd() ^ 25028), (short) (FB.Xd() ^ 20696))));
        try {
            method.setAccessible(true);
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) method.invoke(context, objArr2)).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int i5 = f23576r + 101;
                f23571l = i5 % 128;
                if (i5 % 2 != 0) {
                    activeNetworkInfo.isConnected();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (activeNetworkInfo.isConnected()) {
                    int i6 = f23576r + 73;
                    f23571l = i6 % 128;
                    int i7 = i6 % 2;
                    return true;
                }
            }
            return false;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static boolean f(String str) {
        Object[] objArr = {str};
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i2 = f23567h * 947030722;
        f23567h = i2;
        int iNextInt = new Random().nextInt();
        int i3 = (-336382192) * f23566g;
        f23566g = i3;
        return ((Boolean) c(objArr, i3, i2, 1261928450, iMaxMemory, -1261928446, iNextInt)).booleanValue();
    }

    static void init$0() {
        $$a = new byte[]{98, -110, MessagePack.Code.BIN16, -94};
        $$b = 110;
    }

    private static void q(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 79;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        Object charArray = str2 != null ? str2.toCharArray() : str2;
        o.a.k kVar = new o.a.k();
        char[] cArrC = o.a.k.c(f23569j ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        int i6 = $11 + 87;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (kVar.f19939c < cArrC.length) {
            int i8 = $11 + 85;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            kVar.f19938a = kVar.f19939c - 4;
            int i10 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f23569j)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(229 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (51004 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 9 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1749983833, false, $$c(b2, b3, (byte) (7 | b3)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(675 - (ViewConfiguration.getTouchSlop() >> 8), (char) View.resolveSize(0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 11, 522683165, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrC, 4, cArrC.length - 4);
    }

    private static void t(short s2, int i2, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
        boolean z2;
        int i5 = 2;
        int i6 = 2 % 2;
        o.a.j jVar = new o.a.j();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f23573n)};
            Object objA = o.d.d.a(-727631768);
            if (objA == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objA = o.d.d.a(238 - View.combineMeasuredStates(0, 0), (char) (MotionEvent.axisFromString("") + 44532), 11 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 35969549, false, $$c(b3, b4, (byte) ((b4 + 10) - (10 & b4))), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
            boolean z3 = iIntValue == -1;
            if (!(!z3)) {
                int i7 = $11 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    throw null;
                }
                byte[] bArr = f23572m;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = $10 + 83;
                        $11 = i9 % 128;
                        if (i9 % i5 == 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                            Object objA2 = o.d.d.a(-1239398195);
                            if (objA2 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objA2 = o.d.d.a(628 - View.resolveSizeAndState(0, 0, 0), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 28649), 11 - (ViewConfiguration.getLongPressTimeout() >> 16), 1621469864, false, $$c(b5, b6, (byte) ((-1) - (((-1) - b6) & ((-1) - 11)))), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                            i8 %= 0;
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i8])};
                            Object objA3 = o.d.d.a(-1239398195);
                            if (objA3 == null) {
                                byte b7 = (byte) 0;
                                byte b8 = b7;
                                objA3 = o.d.d.a(ExpandableListView.getPackedPositionType(0L) + IptcDirectory.TAG_COPYRIGHT_NOTICE, (char) (28649 - View.MeasureSpec.getMode(0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 11, 1621469864, false, $$c(b7, b8, (byte) (11 | b8)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objA3).invoke(null, objArr4)).byteValue();
                            i8++;
                        }
                        i5 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = f23572m;
                    Object[] objArr5 = {Integer.valueOf(i2), Integer.valueOf(f23568i)};
                    Object objA4 = o.d.d.a(-727631768);
                    if (objA4 == null) {
                        byte b9 = (byte) 0;
                        byte b10 = b9;
                        objA4 = o.d.d.a(239 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 44531), 10 - TextUtils.lastIndexOf("", '0'), 35969549, false, $$c(b9, b10, (byte) ((-1) - (((-1) - b10) & ((-1) - 10)))), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objA4).invoke(null, objArr5)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f23573n) ^ (-7649639543924978291L))));
                } else {
                    iIntValue = (short) (((short) (((long) f23570k[i2 + ((int) (((long) f23568i) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f23573n) ^ (-7649639543924978291L))));
                }
            }
            if (iIntValue > 0) {
                jVar.f19936d = ((i2 + iIntValue) - 2) + ((int) (((long) f23568i) ^ (-7649639543924978291L))) + (!(z3 ^ true) ? 1 : 0);
                Object[] objArr6 = {jVar, Integer.valueOf(i3), Integer.valueOf(f23574o), sb};
                Object objA5 = o.d.d.a(1819197256);
                if (objA5 == null) {
                    objA5 = o.d.d.a(ViewConfiguration.getMaximumFlingVelocity() >> 16, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 5358), (-16777205) - Color.rgb(0, 0, 0), -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objA5).invoke(null, objArr6)).append(jVar.f19937e);
                jVar.f19935c = jVar.f19937e;
                byte[] bArr4 = f23572m;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i10 = 0;
                    while (i10 < length2) {
                        int i11 = $10 + 33;
                        $11 = i11 % 128;
                        if (i11 % 2 == 0) {
                            bArr5[i10] = (byte) (((long) bArr4[i10]) % (-7649639543924978291L));
                        } else {
                            bArr5[i10] = (byte) (((long) bArr4[i10]) ^ (-7649639543924978291L));
                            i10++;
                        }
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i12 = $10 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                jVar.f19934b = 1;
                while (jVar.f19934b < iIntValue) {
                    if (z2) {
                        int i14 = $10 + 35;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                        byte[] bArr6 = f23572m;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr6[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    } else {
                        short[] sArr = f23570k;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    }
                    sb.append(jVar.f19937e);
                    jVar.f19935c = jVar.f19937e;
                    jVar.f19934b++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
