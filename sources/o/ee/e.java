package o.ee;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import fr.antelop.sdk.R;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcessActivityCallback;
import fr.antelop.sdk.digitalcard.SecurePinInput;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import o.a.f;
import o.a.h;
import o.a.q;
import o.eb.j;
import org.msgpack.core.MessagePack;
import yg.C1499aX;
import yg.FB;
import yg.QB;
import yg.Qg;
import yg.Xu;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends j {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: f */
    private static char[] f23724f = null;

    /* JADX INFO: renamed from: h */
    private static /* synthetic */ boolean f23725h = false;

    /* JADX INFO: renamed from: j */
    private static int f23726j = 0;

    /* JADX INFO: renamed from: k */
    private static int f23727k = 0;

    /* JADX INFO: renamed from: l */
    private static int f23728l = 0;

    /* JADX INFO: renamed from: m */
    private static int f23729m = 0;

    /* JADX INFO: renamed from: n */
    private static boolean f23730n = false;

    /* JADX INFO: renamed from: o */
    private static boolean f23731o = false;

    /* JADX INFO: renamed from: p */
    private static int f23732p = 0;

    /* JADX INFO: renamed from: a */
    private final b f23733a;

    /* JADX INFO: renamed from: b */
    private final d f23734b;

    /* JADX INFO: renamed from: c */
    private c f23735c;

    /* JADX INFO: renamed from: d */
    private final CustomerAuthenticatedProcessActivityCallback f23736d;

    /* JADX INFO: renamed from: e */
    private final a f23737e;

    /* JADX INFO: renamed from: g */
    private byte[] f23738g;

    /* JADX INFO: renamed from: i */
    private byte[] f23739i;

    /* JADX INFO: renamed from: o.ee.e$2 */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a */
        private static int f23740a = 0;

        /* JADX INFO: renamed from: d */
        private static int f23741d = 1;

        /* JADX INFO: renamed from: e */
        static final /* synthetic */ int[] f23742e;

        static {
            int[] iArr = new int[c.values().length];
            f23742e = iArr;
            try {
                iArr[c.f23751c.ordinal()] = 1;
                int i2 = f23740a + 79;
                f23741d = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23742e[c.f23752d.ordinal()] = 2;
                int i4 = f23741d + 125;
                f23740a = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23742e[c.f23753e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23742e[c.f23750b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface a {
        void b();

        void c(byte[] bArr, byte[] bArr2);
    }

    public static class b {

        /* JADX INFO: renamed from: a */
        protected final String f23743a;

        /* JADX INFO: renamed from: b */
        protected final String f23744b;

        /* JADX INFO: renamed from: c */
        protected final String f23745c;

        /* JADX INFO: renamed from: d */
        protected final boolean f23746d;

        /* JADX INFO: renamed from: e */
        protected final String f23747e;

        /* JADX INFO: renamed from: i */
        protected final String f23748i;

        public b(Context context, SecurePinInput.NewPinInputProperties newPinInputProperties) throws Throwable {
            String title = newPinInputProperties.getTitle();
            String subtitle = newPinInputProperties.getSubtitle();
            boolean requestConfirmation = newPinInputProperties.getRequestConfirmation();
            String confirmationTitle = newPinInputProperties.getConfirmationTitle();
            String confirmationSubtitle = newPinInputProperties.getConfirmationSubtitle();
            int i2 = R.string.antelopSecurePinInputPinsNotMatchingErrorDescription;
            short sXd = (short) (FB.Xd() ^ 2090);
            int[] iArr = new int["x\u0007y\t\u0003}u@\u0003\u0010\f\u0013\u0001\u000b\u000eHj\u0018\u0014\u001b\t\u001d\u0016".length()];
            QB qb = new QB("x\u0007y\t\u0003}u@\u0003\u0010\f\u0013\u0001\u000b\u000eHj\u0018\u0014\u001b\t\u001d\u0016");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK((sXd ^ i3) + xuXd.CK(iKK));
                i3++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i3));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(i2)};
            Method method = cls.getMethod(Qg.kd("{x\u0007d\u0005\u0002w{s", (short) (C1499aX.Xd() ^ (-1908)), (short) (C1499aX.Xd() ^ (-28470))), clsArr);
            try {
                method.setAccessible(true);
                this(title, subtitle, requestConfirmation, confirmationTitle, confirmationSubtitle, (String) method.invoke(context, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        private b(String str, String str2, boolean z2, String str3, String str4, String str5) {
            this.f23747e = str;
            this.f23743a = str2;
            this.f23746d = z2;
            this.f23744b = str3;
            this.f23745c = str4;
            this.f23748i = str5;
        }
    }

    static final class c extends Enum<c> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        private static final /* synthetic */ c[] f23749a;

        /* JADX INFO: renamed from: b */
        public static final c f23750b;

        /* JADX INFO: renamed from: c */
        public static final c f23751c;

        /* JADX INFO: renamed from: d */
        public static final c f23752d;

        /* JADX INFO: renamed from: e */
        public static final c f23753e;

        /* JADX INFO: renamed from: f */
        private static int f23754f = 0;

        /* JADX INFO: renamed from: g */
        private static char f23755g = 0;

        /* JADX INFO: renamed from: h */
        private static char[] f23756h = null;

        /* JADX INFO: renamed from: i */
        private static int f23757i = 0;

        /* JADX INFO: renamed from: j */
        private static int f23758j = 0;

        /* JADX INFO: renamed from: n */
        private static int f23759n = 0;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0011). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(int r10, short r11, byte r12) {
            /*
                int r0 = r11 * 4
                int r9 = r0 + 1
                byte[] r8 = o.ee.e.c.$$a
                int r7 = r12 + 4
                int r0 = r10 + 102
                byte[] r6 = new byte[r9]
                r5 = 0
                if (r8 != 0) goto L29
                r2 = r7
                r4 = r5
            L11:
                int r0 = -r0
                int r0 = r0 + r7
                r7 = r2
                r3 = r4
            L15:
                int r2 = r7 + 1
                int r4 = r3 + 1
                byte r1 = (byte) r0
                r6[r3] = r1
                if (r4 != r9) goto L24
                java.lang.String r0 = new java.lang.String
                r0.<init>(r6, r5)
                return r0
            L24:
                r1 = r8[r2]
                r7 = r0
                r0 = r1
                goto L11
            L29:
                r3 = r5
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ee.e.c.$$c(int, short, byte):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f23757i = 0;
            f23759n = 1;
            f23754f = 0;
            f23758j = 1;
            d();
            Object[] objArr = new Object[1];
            k(17 - (ViewConfiguration.getScrollBarSize() >> 8), "\u0004\u000f\u0011\n\u0012\u0018\u0000\r\u0011\u0007\u0004\u0011\b\u0000\u000e\u0015㙲", (byte) (126 - Color.red(0)), objArr);
            f23751c = new c(((String) objArr[0]).intern(), 0);
            Object[] objArr2 = new Object[1];
            k(12 - TextUtils.lastIndexOf("", '0'), "\u0004\u000f\u0011\n\u0012\u0018\u0002\u0012\u0010\t\u000e\u0015㘁", (byte) (13 - TextUtils.indexOf("", "", 0, 0)), objArr2);
            f23752d = new c(((String) objArr2[0]).intern(), 1);
            Object[] objArr3 = new Object[1];
            k(19 - ImageFormat.getBitsPerPixel(0), "\u0004\u000f\u0011\n\u0012\u0018\u0002\u0012\u0010\t\u000e\u0015\n\u000f\u0000\u0006\u0015\u0014\u0003\u0007", (byte) (MotionEvent.axisFromString("") + 115), objArr3);
            f23750b = new c(((String) objArr3[0]).intern(), 2);
            Object[] objArr4 = new Object[1];
            k((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23, "\u0004\u000f\u0011\n\u0012\u0018\u0002\u0012\u0010\t\u000e\u0015\u0007\u0014\u0017\u0000\u0011\u0004\u0016\u0001\u0003\u0002㗺", (byte) (View.resolveSize(0, 0) + 18), objArr4);
            f23753e = new c(((String) objArr4[0]).intern(), 3);
            f23749a = e();
            int i2 = f23759n + 89;
            f23757i = i2 % 128;
            int i3 = i2 % 2;
        }

        private c(String str, int i2) {
            super(str, i2);
        }

        static void d() {
            f23756h = new char[]{64631, 64586, 64599, 64593, 64627, 64587, 64594, 64630, 64584, 64623, 64614, 64629, 64592, 64626, 64625, 64596, 64624, 64619, 64628, 64576, 64579, 64608, 64612, 64598, 64588};
            f23755g = (char) 51642;
        }

        private static /* synthetic */ c[] e() {
            c[] cVarArr;
            int i2 = 2 % 2;
            int i3 = f23758j;
            int i4 = i3 + 17;
            f23754f = i4 % 128;
            if (i4 % 2 != 0) {
                cVarArr = new c[2];
                cVarArr[0] = f23751c;
                cVarArr[1] = f23752d;
                cVarArr[4] = f23750b;
                cVarArr[2] = f23753e;
            } else {
                cVarArr = new c[]{f23751c, f23752d, f23750b, f23753e};
            }
            int i5 = i3 + 115;
            f23754f = i5 % 128;
            if (i5 % 2 == 0) {
                return cVarArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static void init$0() {
            $$a = new byte[]{117, -6, 58, MessagePack.Code.MAP32};
            $$b = 231;
        }

        private static void k(int i2, String str, byte b2, Object[] objArr) throws Throwable {
            int i3;
            String str2 = str;
            int i4 = 2 % 2;
            Object charArray = str2;
            if (str2 != null) {
                int i5 = $11 + 9;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    str2.toCharArray();
                    throw null;
                }
                charArray = str2.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            h hVar = new h();
            char[] cArr2 = f23756h;
            long j2 = 0;
            int i6 = 421932776;
            char c2 = '0';
            int i7 = 1;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i8 = 0;
                while (i8 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                        Object objA = o.d.d.a(i6);
                        if (objA == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objA = o.d.d.a(269 - TextUtils.lastIndexOf("", c2, 0), (char) View.combineMeasuredStates(0, 0), (SystemClock.elapsedRealtimeNanos() > j2 ? 1 : (SystemClock.elapsedRealtimeNanos() == j2 ? 0 : -1)) + 10, -811348851, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        i8++;
                        j2 = 0;
                        i6 = 421932776;
                        c2 = '0';
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
            Object[] objArr3 = {Integer.valueOf(f23755g)};
            Object objA2 = o.d.d.a(421932776);
            if (objA2 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objA2 = o.d.d.a(269 - TextUtils.lastIndexOf("", '0'), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 10, -811348851, false, $$c(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i2];
            char c3 = 3;
            if (i2 % 2 != 0) {
                int i9 = $11 + 29;
                int i10 = i9 % 128;
                $10 = i10;
                int i11 = i9 % 2;
                i3 = i2 - 1;
                cArr4[i3] = (char) (cArr[i3] - b2);
                int i12 = i10 + 71;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 2 % 3;
                }
            } else {
                i3 = i2;
            }
            if (i3 > 1) {
                hVar.f19926b = 0;
                while (hVar.f19926b < i3) {
                    hVar.f19927c = cArr[hVar.f19926b];
                    hVar.f19925a = cArr[hVar.f19926b + i7];
                    if (hVar.f19927c == hVar.f19925a) {
                        cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                        cArr4[hVar.f19926b + i7] = (char) (hVar.f19925a - b2);
                    } else {
                        Object[] objArr4 = new Object[13];
                        objArr4[12] = hVar;
                        objArr4[11] = Integer.valueOf(cCharValue);
                        objArr4[10] = hVar;
                        objArr4[9] = hVar;
                        objArr4[8] = Integer.valueOf(cCharValue);
                        objArr4[7] = hVar;
                        objArr4[6] = hVar;
                        objArr4[5] = Integer.valueOf(cCharValue);
                        objArr4[4] = hVar;
                        objArr4[c3] = hVar;
                        objArr4[2] = Integer.valueOf(cCharValue);
                        objArr4[i7] = hVar;
                        objArr4[0] = hVar;
                        Object objA3 = o.d.d.a(219124184);
                        if (objA3 == null) {
                            byte b7 = (byte) 0;
                            objA3 = o.d.d.a(825 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) KeyEvent.getDeadChar(0, 0), 12 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -611683395, false, $$c((byte) 9, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                            Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                            Object objA4 = o.d.d.a(-634864343);
                            if (objA4 == null) {
                                byte b8 = (byte) 0;
                                c3 = 3;
                                objA4 = o.d.d.a((ViewConfiguration.getTouchSlop() >> 8) + JfifUtil.MARKER_SOS, (char) Gravity.getAbsoluteGravity(0, 0), 10 - TextUtils.lastIndexOf("", '0', 0, 0), 212688716, false, $$c((byte) ($$b & 31), b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            } else {
                                c3 = 3;
                            }
                            int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                            int i14 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr2[iIntValue];
                            cArr4[hVar.f19926b + 1] = cArr2[i14];
                            int i15 = $10 + 27;
                            $11 = i15 % 128;
                            int i16 = i15 % 2;
                        } else {
                            c3 = 3;
                            if (hVar.f19928d == hVar.f19929e) {
                                int i17 = $10 + 51;
                                $11 = i17 % 128;
                                int i18 = i17 % 2;
                                hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                                hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                                int i19 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                                int i20 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                                cArr4[hVar.f19926b] = cArr2[i19];
                                cArr4[hVar.f19926b + 1] = cArr2[i20];
                            } else {
                                int i21 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                                int i22 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                                cArr4[hVar.f19926b] = cArr2[i21];
                                i7 = 1;
                                cArr4[hVar.f19926b + 1] = cArr2[i22];
                            }
                        }
                        i7 = 1;
                    }
                    hVar.f19926b += 2;
                }
            }
            for (int i23 = 0; i23 < i2; i23++) {
                cArr4[i23] = (char) (cArr4[i23] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        public static c valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f23754f + 117;
            f23758j = i3 % 128;
            int i4 = i3 % 2;
            c cVar = (c) Enum.valueOf(c.class, str);
            if (i4 == 0) {
                int i5 = 41 / 0;
            }
            int i6 = f23758j + 105;
            f23754f = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 53 / 0;
            }
            return cVar;
        }

        public static c[] values() {
            int i2 = 2 % 2;
            int i3 = f23758j + 57;
            f23754f = i3 % 128;
            int i4 = i3 % 2;
            c[] cVarArr = f23749a;
            if (i4 == 0) {
                return (c[]) cVarArr.clone();
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static class d {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        private static long f23760a = 0;

        /* JADX INFO: renamed from: c */
        private static int f23761c = 0;

        /* JADX INFO: renamed from: d */
        private static char[] f23762d = null;

        /* JADX INFO: renamed from: g */
        private static boolean f23763g = false;

        /* JADX INFO: renamed from: i */
        private static boolean f23764i = false;

        /* JADX INFO: renamed from: b */
        final String f23765b;

        /* JADX INFO: renamed from: e */
        final String f23766e;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0022 -> B:17:0x0014). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(byte r8, int r9, int r10) {
            /*
                int r0 = r9 * 3
                int r7 = r0 + 4
                byte[] r6 = o.ee.e.d.$$a
                int r5 = r8 * 2
                int r0 = r5 + 1
                int r4 = 78 - r10
                byte[] r3 = new byte[r0]
                r2 = 0
                if (r6 != 0) goto L27
                r4 = r5
                r0 = r7
                r1 = r2
            L14:
                int r7 = r7 + 1
                int r4 = r4 + r0
            L17:
                byte r0 = (byte) r4
                r3[r1] = r0
                if (r1 != r5) goto L22
                java.lang.String r0 = new java.lang.String
                r0.<init>(r3, r2)
                return r0
            L22:
                int r1 = r1 + 1
                r0 = r6[r7]
                goto L14
            L27:
                r1 = r2
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ee.e.d.$$c(byte, int, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f23760a = 3222378022831404850L;
            f23762d = new char[]{2124, 2099, 2114, 2126, 2067, 2093, 2079, 2064, 2070, 2145, 2125, 2090, 2095, 2074, 2088, 2133, 2096, 2106, 2108, 2094, 2131, 2092, 2077, 2073, 2076, 2105, 2138, 2129, 2118, 2102, 2065, 2066, 2071, 2075, 2054, 2091};
            f23761c = 2040400257;
            f23763g = true;
            f23764i = true;
        }

        public d(SecurePinInput.CurrentPinInputProperties currentPinInputProperties) {
            this.f23765b = currentPinInputProperties.getTitle();
            this.f23766e = currentPinInputProperties.getSubtitle();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v2, types: [int[], java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r3v5 */
        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(Unknown Source)
            	at java.base/java.util.TreeMap.lastKey(Unknown Source)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] e(android.content.Context r17, int r18, int r19) {
            /*
                Method dump skipped, instruction units count: 1115
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ee.e.d.e(android.content.Context, int, int):java.lang.Object[]");
        }

        private static void f(String str, int i2, Object[] objArr) throws Throwable {
            String str2 = str;
            int i3 = 2 % 2;
            int i4 = $10 + 69;
            $11 = i4 % 128;
            Object charArray = str2;
            if (i4 % 2 == 0) {
                throw null;
            }
            if (str2 != null) {
                charArray = str2.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            q qVar = new q();
            qVar.f19949d = i2;
            int length = cArr.length;
            long[] jArr = new long[length];
            qVar.f19948a = 0;
            while (qVar.f19948a < cArr.length) {
                int i5 = qVar.f19948a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                    Object objA = o.d.d.a(-1011865131);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(TextUtils.indexOf("", "") + 731, (char) (View.MeasureSpec.getSize(0) + 7933), (Process.myPid() >> 22) + 11, 355847088, false, $$c(b2, b3, (byte) ((-1) - (((-1) - b3) & ((-1) - 7)))), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f23760a ^ 4743694005979712847L);
                    Object[] objArr3 = {qVar, qVar};
                    Object objA2 = o.d.d.a(1452497747);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 836, (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 27279), 11 - (Process.myTid() >> 22), -2145994442, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA2).invoke(null, objArr3);
                    int i6 = $10 + 125;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
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
                Object[] objArr4 = {qVar, qVar};
                Object objA3 = o.d.d.a(1452497747);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(836 - TextUtils.indexOf("", "", 0), (char) (27279 - TextUtils.getCapsMode("", 0, 0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 11, -2145994442, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                int i8 = $11 + 21;
                $10 = i8 % 128;
                int i9 = i8 % 2;
            }
            objArr[0] = new String(cArr2);
        }

        private static void h(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
            String str3 = str;
            String str4 = str2;
            int i3 = 2 % 2;
            int i4 = $10;
            int i5 = i4 + 43;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            Object bytes = str4;
            if (str4 != null) {
                int i7 = i4 + 59;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                bytes = str4.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            Object charArray = str3;
            if (str3 != null) {
                charArray = str3.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            f fVar = new f();
            char[] cArr2 = f23762d;
            if (cArr2 != null) {
                int i9 = $11 + 11;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i11 = 0; i11 < length; i11++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i11])};
                        Object objA = o.d.d.a(1618406102);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objA = o.d.d.a(((byte) KeyEvent.getModifierMetaStateMask()) + 594, (char) (Color.red(0) + 13181), 12 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1225586509, false, $$c(b2, b3, (byte) ((b3 + Ascii.VT) - (11 & b3))), new Class[]{Integer.TYPE});
                        }
                        cArr3[i11] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i12 = $11 + 11;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(f23761c)};
            Object objA2 = o.d.d.a(-1503702982);
            char c2 = '0';
            if (objA2 == null) {
                objA2 = o.d.d.a(Color.blue(0) + 32, (char) (ViewConfiguration.getTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12, 1893380703, false, "F", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
            int i14 = 1540807955;
            if (f23764i) {
                fVar.f19923e = bArr.length;
                char[] cArr4 = new char[fVar.f19923e];
                fVar.f19922a = 0;
                int i15 = $10 + 65;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                while (fVar.f19922a < fVar.f19923e) {
                    cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                    Object[] objArr4 = {fVar, fVar};
                    Object objA3 = o.d.d.a(i14);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        objA3 = o.d.d.a(458 - TextUtils.indexOf("", "", 0), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 11 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1923924106, false, $$c(b4, b4, (byte) (-$$a[3])), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                    i14 = 1540807955;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!f23763g) {
                fVar.f19923e = iArr.length;
                char[] cArr5 = new char[fVar.f19923e];
                fVar.f19922a = 0;
                while (fVar.f19922a < fVar.f19923e) {
                    int i17 = $10 + 91;
                    $11 = i17 % 128;
                    int i18 = i17 % 2;
                    cArr5[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                    fVar.f19922a++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i19 = $11 + 11;
            $10 = i19 % 128;
            int i20 = i19 % 2;
            fVar.f19923e = cArr.length;
            char[] cArr6 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr6[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                Object[] objArr5 = {fVar, fVar};
                Object objA4 = o.d.d.a(1540807955);
                if (objA4 == null) {
                    byte b5 = (byte) 0;
                    objA4 = o.d.d.a(ExpandableListView.getPackedPositionChild(0L) + 459, (char) (Process.myTid() >> 22), AndroidCharacter.getMirror(c2) - '%', -1923924106, false, $$c(b5, b5, (byte) (-$$a[3])), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
                c2 = '0';
            }
            objArr[0] = new String(cArr6);
        }

        static void init$0() {
            $$a = new byte[]{34, 36, MessagePack.Code.EXT32, -5};
            $$b = 41;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r9, short r10, byte r11) {
        /*
            byte[] r8 = o.ee.e.$$a
            int r0 = r9 * 3
            int r7 = r0 + 1
            int r0 = r10 * 2
            int r6 = 4 - r0
            int r0 = r11 * 6
            int r0 = 73 - r0
            byte[] r5 = new byte[r7]
            r4 = 0
            if (r8 != 0) goto L2a
            r3 = r4
            r2 = r6
        L15:
            int r0 = -r0
            int r6 = r6 + r0
            int r2 = r2 + 1
            r1 = r3
        L1a:
            int r3 = r1 + 1
            byte r0 = (byte) r6
            r5[r1] = r0
            if (r3 != r7) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L27:
            r0 = r8[r2]
            goto L15
        L2a:
            r1 = r4
            r2 = r6
            r6 = r0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ee.e.$$c(int, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23729m = 0;
        f23732p = 1;
        f23727k = 0;
        f23728l = 1;
        e();
        SystemClock.elapsedRealtime();
        int i2 = f23729m + 107;
        int i3 = i2 % 128;
        f23732p = i3;
        int i4 = i2 % 2;
        int i5 = 2 % 2;
        f23725h = true;
        int i6 = i3 + 69;
        f23729m = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public e(a aVar, d dVar, b bVar, CustomerAuthenticatedProcessActivityCallback customerAuthenticatedProcessActivityCallback) throws Throwable {
        this.f23737e = aVar;
        this.f23734b = dVar;
        this.f23733a = bVar;
        if (dVar != null) {
            this.f23735c = c.f23751c;
        } else {
            if (bVar == null) {
                Object[] objArr = new Object[1];
                q(View.combineMeasuredStates(0, 0) + 127, null, null, "\u0088\u0083\u0087\u0086\u0083\u0085\u0084\u0083\u0082\u0081", objArr);
                throw new RuntimeException(((String) objArr[0]).intern());
            }
            this.f23735c = c.f23752d;
        }
        this.f23736d = customerAuthenticatedProcessActivityCallback;
    }

    private o.ee.d c() throws Throwable {
        int i2 = 2 % 2;
        int i3 = AnonymousClass2.f23742e[this.f23735c.ordinal()];
        if (i3 == 1) {
            if (!f23725h) {
                int i4 = f23728l + 123;
                f23727k = i4 % 128;
                int i5 = i4 % 2;
                if (this.f23734b == null) {
                    throw new AssertionError();
                }
            }
            return new o.ee.d(this.f23734b.f23765b, this.f23734b.f23766e, null, false, this.f23736d);
        }
        if (i3 == 2) {
            if (!f23725h) {
                int i6 = f23727k + 17;
                f23728l = i6 % 128;
                int i7 = i6 % 2;
                if (this.f23733a == null) {
                    throw new AssertionError();
                }
            }
            return new o.ee.d(this.f23733a.f23747e, this.f23733a.f23743a, null, false, this.f23736d);
        }
        if (i3 == 3) {
            if (f23725h || this.f23733a != null) {
                return new o.ee.d(this.f23733a.f23747e, this.f23733a.f23743a, this.f23733a.f23748i, true, this.f23736d);
            }
            throw new AssertionError();
        }
        if (i3 != 4) {
            Object[] objArr = new Object[1];
            q(View.combineMeasuredStates(0, 0) + 127, null, null, "\u0083\u0087\u0097\u0087\u0096\u0095\u0088\u0083\u0087\u008b\u008c\u0085\u0085\u0094\u0092\u0082\u0081", objArr);
            throw new RuntimeException(((String) objArr[0]).intern());
        }
        if ((!f23725h) && this.f23733a == null) {
            throw new AssertionError();
        }
        return new o.ee.d(this.f23733a.f23744b, this.f23733a.f23745c, null, false, this.f23736d);
    }

    private boolean d(byte[] bArr, o.ee.a aVar) throws Throwable {
        int i2 = 2 % 2;
        Object obj = null;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            q(Color.green(0) + 127, null, null, "\u0091\u0083\u0088\u008c\u0090\u008f\u0083\u008a\u008e\u0087\u0085\u008d\u008c\u008b\u0089\u0082\u008a\u0089", objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            q((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, null, null, "\u0082\u008a\u0089\u0088\u0083\u008b\u0083\u0087\u0082\u0093\u0092\u0092\u0083\u0086\u008c\u008b\u0085", objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i3 = f23727k + 37;
            f23728l = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = AnonymousClass2.f23742e[this.f23735c.ordinal()];
        if (i5 != 1) {
            if (i5 == 2 || i5 == 3) {
                if (!f23725h && this.f23733a == null) {
                    throw new AssertionError();
                }
                this.f23739i = bArr;
                if (this.f23733a.f23746d) {
                    this.f23735c = c.f23750b;
                    aVar.b(c());
                    return false;
                }
            } else {
                if (i5 != 4) {
                    return false;
                }
                if (!Arrays.equals(bArr, this.f23739i)) {
                    this.f23735c = c.f23753e;
                    aVar.b(c());
                    return false;
                }
            }
        } else {
            if (!f23725h && this.f23734b == null) {
                throw new AssertionError();
            }
            this.f23738g = bArr;
            if (this.f23733a != null) {
                int i6 = f23727k + 105;
                f23728l = i6 % 128;
                if (i6 % 2 != 0) {
                    this.f23735c = c.f23752d;
                    aVar.b(c());
                    return false;
                }
                this.f23735c = c.f23752d;
                aVar.b(c());
                obj.hashCode();
                throw null;
            }
        }
        return true;
    }

    static void e() {
        f23724f = new char[]{2478, 2439, 2462, 2445, 2437, 2448, 2433, 2449, 2469, 2458, 2435, 2436, 2438, 2479, 2444, 2470, 2457, 2432, 2494, 2446, 2517, 2464, 2450};
        f23726j = 2040400373;
        f23731o = true;
        f23730n = true;
    }

    static void init$0() {
        $$a = new byte[]{120, 46, 101, 90};
        $$b = 176;
    }

    private static void q(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        String str3 = str;
        String str4 = str2;
        int i3 = 2 % 2;
        Object bytes = str4;
        if (str4 != null) {
            bytes = str4.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        f fVar = new f();
        char[] cArr2 = f23724f;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objA = o.d.d.a(1618406102);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(593 - (Process.myTid() >> 22), (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 13181), KeyEvent.getDeadChar(0, 0) + 11, -1225586509, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(f23726j)};
        Object objA2 = o.d.d.a(-1503702982);
        long j2 = 0;
        if (objA2 == null) {
            objA2 = o.d.d.a(View.combineMeasuredStates(0, 0) + 32, (char) TextUtils.getOffsetBefore("", 0), 11 - ExpandableListView.getPackedPositionGroup(0L), 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        if (f23730n) {
            int i5 = $11 + 29;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            fVar.f19923e = bArr.length;
            char[] cArr4 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                int i7 = $11 + 49;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr4 = {fVar, fVar};
                Object objA3 = o.d.d.a(1540807955);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA3 = o.d.d.a(Color.green(0) + 458, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ExpandableListView.getPackedPositionForChild(0, 0) > j2 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j2 ? 0 : -1)) + 12, -1923924106, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                j2 = 0;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!f23731o) {
            fVar.f19923e = iArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr5[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                fVar.f19922a++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i9 = $11 + 75;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        fVar.f19923e = cArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        fVar.f19922a = 0;
        int i11 = $10 + 31;
        $11 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 2 / 4;
        }
        while (fVar.f19922a < fVar.f19923e) {
            int i13 = $11 + 91;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                cArr6[fVar.f19922a] = (char) (cArr2[cArr[fVar.f19923e * fVar.f19922a] % i2] / iIntValue);
                Object[] objArr5 = {fVar, fVar};
                Object objA4 = o.d.d.a(1540807955);
                if (objA4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA4 = o.d.d.a(ExpandableListView.getPackedPositionGroup(0L) + 458, (char) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10, -1923924106, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            } else {
                cArr6[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                Object[] objArr6 = {fVar, fVar};
                Object objA5 = o.d.d.a(1540807955);
                if (objA5 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objA5 = o.d.d.a(458 - (ViewConfiguration.getTouchSlop() >> 8), (char) (Process.myPid() >> 22), MotionEvent.axisFromString("") + 12, -1923924106, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
        }
        objArr[0] = new String(cArr6);
    }

    public final void b(Context context) {
        int i2 = 2 % 2;
        int i3 = f23728l + 77;
        f23727k = i3 % 128;
        if (i3 % 2 == 0) {
            o.ee.a.a(context, this, c());
        } else {
            o.ee.a.a(context, this, c());
            int i4 = 25 / 0;
        }
    }

    public final boolean c(byte[] bArr, o.ee.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23728l + 43;
        f23727k = i3 % 128;
        int i4 = i3 % 2;
        boolean zD = d(bArr, aVar);
        int i5 = f23728l + 3;
        f23727k = i5 % 128;
        if (i5 % 2 == 0) {
            return zD;
        }
        throw null;
    }

    @Override // o.eb.j
    public final void onDisplayCancelled() {
        int i2 = 2 % 2;
        int i3 = f23727k + 57;
        f23728l = i3 % 128;
        int i4 = i3 % 2;
        this.f23737e.b();
        int i5 = f23728l + 43;
        f23727k = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.eb.j
    public final void onDisplayImpossible(o.by.c cVar) {
        int i2 = 2 % 2;
        int i3 = f23727k + 33;
        f23728l = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 39 / 0;
        }
    }

    @Override // o.eb.j
    public final void onDisplaySuccess() {
        int i2 = 2 % 2;
        int i3 = f23727k + 115;
        f23728l = i3 % 128;
        int i4 = i3 % 2;
        this.f23737e.c(this.f23738g, this.f23739i);
        int i5 = f23727k + 91;
        f23728l = i5 % 128;
        int i6 = i5 % 2;
    }
}
