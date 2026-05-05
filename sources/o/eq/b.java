package o.eq;

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
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import fr.antelop.sdk.card.EmvApplicationActivationMethod;
import fr.antelop.sdk.card.EmvApplicationActivationMethodType;
import fr.antelop.sdk.card.emvapplication.EmvApplication;
import fr.antelop.sdk.card.emvapplication.EmvApplicationStatus;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import fr.antelop.sdk.util.OperationCallback;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.io.encoding.Base64;
import o.a.f;
import o.a.g;
import o.a.h;
import o.cc.c;
import o.ea.a;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b implements a<EmvApplication> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$f = 0;
    private static final byte[] $$j = null;
    private static final int $$k = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    public static int U = 0;
    public static int V = 0;
    public static int W = 0;
    public static int Y = 0;

    /* JADX INFO: renamed from: a */
    public static int f24695a = 0;

    /* JADX INFO: renamed from: b */
    public static int f24696b = 0;

    /* JADX INFO: renamed from: c */
    public static int f24697c = 0;

    /* JADX INFO: renamed from: d */
    public static int f24698d = 0;

    /* JADX INFO: renamed from: e */
    public static int f24699e = 0;

    /* JADX INFO: renamed from: k */
    private static char f24700k = 0;

    /* JADX INFO: renamed from: l */
    private static char[] f24701l = null;

    /* JADX INFO: renamed from: m */
    private static char f24702m = 0;

    /* JADX INFO: renamed from: n */
    private static char f24703n = 0;

    /* JADX INFO: renamed from: o */
    private static char f24704o = 0;

    /* JADX INFO: renamed from: q */
    private static int f24705q = 0;

    /* JADX INFO: renamed from: r */
    private static char f24706r = 0;

    /* JADX INFO: renamed from: t */
    private static int f24707t = 0;

    /* JADX INFO: renamed from: f */
    private d f24708f;

    /* JADX INFO: renamed from: g */
    private Map<String, o.cs.d> f24709g;

    /* JADX INFO: renamed from: h */
    private final String f24710h;

    /* JADX INFO: renamed from: i */
    private o.cs.d f24711i;

    /* JADX INFO: renamed from: j */
    private final o.cc.d f24712j = new o.cc.d(o.en.b.c());

    /* JADX INFO: renamed from: o.eq.b$3 */
    public class AnonymousClass3 implements c {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b */
        private static int f24713b = 0;

        /* JADX INFO: renamed from: d */
        private static char[] f24714d = null;

        /* JADX INFO: renamed from: e */
        private static boolean f24715e = false;

        /* JADX INFO: renamed from: f */
        public static int f24716f = 0;

        /* JADX INFO: renamed from: g */
        public static int f24717g = 0;

        /* JADX INFO: renamed from: h */
        private static int f24718h = 0;

        /* JADX INFO: renamed from: i */
        private static int f24719i = 0;

        /* JADX INFO: renamed from: j */
        private static boolean f24720j = false;

        /* JADX INFO: renamed from: k */
        public static int f24721k = 0;

        /* JADX INFO: renamed from: l */
        public static int f24722l = 0;

        /* JADX INFO: renamed from: m */
        public static int f24723m = 0;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ OperationCallback f24724a;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$e(byte r8, byte r9, short r10) {
            /*
                int r0 = r9 * 6
                int r7 = r0 + 67
                byte[] r6 = o.eq.b.AnonymousClass3.$$c
                int r5 = r10 * 3
                int r2 = r5 + 1
                int r0 = r8 * 3
                int r1 = 3 - r0
                byte[] r4 = new byte[r2]
                r3 = 0
                if (r6 != 0) goto L2b
                r2 = r3
                r0 = r1
            L15:
                int r1 = -r1
                int r1 = r1 + r7
                r7 = r1
                r1 = r0
            L19:
                byte r0 = (byte) r7
                r4[r2] = r0
                if (r2 != r5) goto L24
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L24:
                int r2 = r2 + 1
                int r0 = r1 + 1
                r1 = r6[r0]
                goto L15
            L2b:
                r2 = r3
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.eq.b.AnonymousClass3.$$e(byte, byte, short):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            f24723m = 2057339322;
            f24722l = -39442505;
            f24721k = 1058472131;
            f24717g = -246900254;
            f24716f = -1932528372;
            init$0();
            f24718h = 0;
            f24719i = 1;
            f24714d = new char[]{2437, 2166, 2432, 2162, 2167, 2445, 2486, 2435, 2160, 2433, 2467, 2172, 2447, 2469, 2164, 2440, 2477, 2446, 2441, 2163, 2487, 2443, 2505, 2434, 2161, 2485};
            f24713b = 2040400356;
            f24715e = true;
            f24720j = true;
        }

        AnonymousClass3(OperationCallback operationCallback) {
            operationCallback = operationCallback;
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(Unknown Source)
            	at java.base/java.util.TreeMap.lastKey(Unknown Source)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] e(android.content.Context r25, int r26, int r27, int r28) {
            /*
                Method dump skipped, instruction units count: 1958
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.eq.b.AnonymousClass3.e(android.content.Context, int, int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{67, Ascii.SI, 99, -76};
            $$b = JfifUtil.MARKER_APP1;
        }

        static void init$1() {
            $$c = new byte[]{65, 52, MessagePack.Code.UINT64, -121};
            $$d = 68;
        }

        private static void n(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
            String str3 = str;
            String str4 = str2;
            int i3 = 2;
            int i4 = 2 % 2;
            int i5 = $10 + 21;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            Object bytes = str4;
            if (str4 != null) {
                bytes = str4.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            Object charArray = str3;
            if (str3 != null) {
                int i7 = $10 + 3;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 16 / 0;
                    charArray = str3.toCharArray();
                } else {
                    charArray = str3.toCharArray();
                }
            }
            char[] cArr = (char[]) charArray;
            f fVar = new f();
            char[] cArr2 = f24714d;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i9 = 0;
                while (i9 < length) {
                    int i10 = $11 + 111;
                    $10 = i10 % 128;
                    int i11 = i10 % i3;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                        Object objA = o.d.d.a(1618406102);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objA = o.d.d.a(Gravity.getAbsoluteGravity(0, 0) + 593, (char) (13181 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (Process.myTid() >> 22) + 11, -1225586509, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr3[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        i9++;
                        i3 = 2;
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
            Object[] objArr3 = {Integer.valueOf(f24713b)};
            Object objA2 = o.d.d.a(-1503702982);
            if (objA2 == null) {
                objA2 = o.d.d.a(TextUtils.getTrimmedLength("") + 32, (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 10 - TextUtils.indexOf((CharSequence) "", '0'), 1893380703, false, "F", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
            if (f24720j) {
                fVar.f19923e = bArr.length;
                char[] cArr4 = new char[fVar.f19923e];
                fVar.f19922a = 0;
                while (fVar.f19922a < fVar.f19923e) {
                    cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                    Object[] objArr4 = {fVar, fVar};
                    Object objA3 = o.d.d.a(1540807955);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objA3 = o.d.d.a(458 - View.combineMeasuredStates(0, 0), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), TextUtils.getCapsMode("", 0, 0) + 11, -1923924106, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!f24715e) {
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
            fVar.f19923e = cArr.length;
            char[] cArr6 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                int i12 = $11 + 83;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    cArr6[fVar.f19922a] = (char) (cArr2[cArr[fVar.f19923e >>> fVar.f19922a] + i2] >>> iIntValue);
                    Object[] objArr5 = {fVar, fVar};
                    Object objA4 = o.d.d.a(1540807955);
                    if (objA4 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 + 1);
                        objA4 = o.d.d.a(458 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 11 - TextUtils.indexOf("", ""), -1923924106, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                } else {
                    cArr6[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                    Object[] objArr6 = {fVar, fVar};
                    Object objA5 = o.d.d.a(1540807955);
                    if (objA5 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = (byte) (b8 + 1);
                        objA5 = o.d.d.a(458 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) TextUtils.indexOf("", "", 0), 11 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1923924106, false, $$e(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA5).invoke(null, objArr6);
                }
            }
            objArr[0] = new String(cArr6);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x001b  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0023 -> B:17:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void o(byte r9, byte r10, byte r11, java.lang.Object[] r12) {
            /*
                int r8 = r11 * 3
                int r1 = r8 + 1
                int r0 = r10 * 3
                int r7 = r0 + 4
                byte[] r6 = o.eq.b.AnonymousClass3.$$a
                int r5 = r9 + 97
                byte[] r4 = new byte[r1]
                r3 = 0
                if (r6 != 0) goto L2a
                r2 = r7
                r0 = r3
            L13:
                int r5 = r5 + r7
                int r7 = r2 + 1
            L16:
                byte r1 = (byte) r5
                r4[r0] = r1
                if (r0 != r8) goto L23
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                r12[r3] = r0
                return
            L23:
                r1 = r6[r7]
                int r0 = r0 + 1
                r2 = r7
                r7 = r1
                goto L13
            L2a:
                r0 = r3
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: o.eq.b.AnonymousClass3.o(byte, byte, byte, java.lang.Object[]):void");
        }

        @Override // o.cc.c
        public final void a() {
            int i2 = 2 % 2;
            int i3 = f24718h + 59;
            f24719i = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 34 / 0;
                if (operationCallback == null) {
                    return;
                }
            } else if (operationCallback == null) {
                return;
            }
            operationCallback.onSuccess(null);
            int i5 = f24719i + 45;
            f24718h = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // o.cc.c
        public final void e(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f24719i;
            int i4 = i3 + 63;
            f24718h = i4 % 128;
            int i5 = i4 % 2;
            OperationCallback operationCallback = operationCallback;
            if (operationCallback != null) {
                int i6 = i3 + 45;
                f24718h = i6 % 128;
                if (i6 % 2 == 0) {
                    operationCallback.onError(o.by.c.b(cVar).a());
                } else {
                    operationCallback.onError(o.by.c.b(cVar).a());
                    throw null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.eq.b$5 */
    final class AnonymousClass5 implements c {

        /* JADX INFO: renamed from: a */
        private static int f24726a = 1;

        /* JADX INFO: renamed from: b */
        private static int f24727b = 0;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ OperationCallback f24728c;

        AnonymousClass5(OperationCallback operationCallback) {
            operationCallback = operationCallback;
        }

        @Override // o.cc.c
        public final void a() {
            int i2 = 2 % 2;
            int i3 = f24726a;
            int i4 = (((-1) - (((-1) - i3) & ((-1) - 63))) << 1) - (i3 ^ 63);
            f24727b = i4 % 128;
            int i5 = i4 % 2;
            OperationCallback operationCallback = operationCallback;
            if (operationCallback != null) {
                int i6 = (i3 ^ 53) + (((i3 + 53) - (i3 | 53)) << 1);
                f24727b = i6 % 128;
                int i7 = i6 % 2;
                operationCallback.onSuccess(null);
                int i8 = f24726a;
                int i9 = (i8 ^ 43) + ((i8 & 43) << 1);
                f24727b = i9 % 128;
                int i10 = i9 % 2;
            }
            int i11 = f24726a + 117;
            f24727b = i11 % 128;
            int i12 = i11 % 2;
        }

        @Override // o.cc.c
        public final void e(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f24726a;
            int i4 = ((i3 + 43) - (43 | i3)) + ((i3 + 43) - (43 & i3));
            f24727b = i4 % 128;
            int i5 = i4 % 2;
            OperationCallback operationCallback = operationCallback;
            if (operationCallback != null) {
                int i6 = (i3 ^ 65) + (((i3 + 65) - (i3 | 65)) << 1);
                f24727b = i6 % 128;
                int i7 = i6 % 2;
                operationCallback.onError(o.by.c.b(cVar).a());
                int i8 = f24726a;
                int i9 = ((i8 + 35) - (35 | i8)) + (i8 | 35);
                f24727b = i9 % 128;
                int i10 = i9 % 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0020 -> B:17:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(short r7, int r8, short r9) {
        /*
            int r7 = r7 + 4
            int r0 = r9 + 69
            int r6 = r8 * 2
            int r1 = r6 + 1
            byte[] r5 = o.eq.b.$$c
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r5 != 0) goto L25
            r2 = r7
            r1 = r3
        L11:
            int r0 = -r0
            int r7 = r7 + r0
        L13:
            byte r0 = (byte) r7
            r4[r1] = r0
            int r2 = r2 + 1
            if (r1 != r6) goto L20
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L20:
            int r1 = r1 + 1
            r0 = r5[r2]
            goto L11
        L25:
            r1 = r3
            r2 = r7
            r7 = r0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eq.b.$$i(short, int, short):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        Y = -898443485;
        W = -139072558;
        V = -1682240119;
        U = 1855455118;
        init$0();
        f24697c = -1235811997;
        f24699e = -212978720;
        f24698d = -1134707348;
        f24695a = -212756907;
        f24696b = -2001557304;
        f24705q = 0;
        f24707t = 1;
        f24701l = new char[]{64590, 64585, 64579, 64616, 64599, 64604, 64582, 64608, 64587, 64583, 64597, 64584, 64619, 64625, 64592, 64591, 64512, 64593, 64595, 64580, 64596, 64588, 64612, 64627, 64586, 64577, 64532, 64589, 64598, 64578, 64620, 64576, 64523, 64630, 64614, 64517};
        f24700k = (char) 51641;
        f24702m = (char) 56886;
        f24704o = (char) 11175;
        f24703n = (char) 43477;
        f24706r = (char) 3710;
    }

    public b(String str) {
        this.f24710h = str;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        b bVar = (b) objArr[0];
        int i2 = 2 % 2;
        int i3 = f24707t + 81;
        f24705q = i3 % 128;
        int i4 = i3 % 2;
        String strB = bVar.b().b();
        int i5 = f24707t + 57;
        f24705q = i5 % 128;
        if (i5 % 2 == 0) {
            return strB;
        }
        throw null;
    }

    private static boolean a(String str) {
        int i2 = 2 % 2;
        int i3 = f24707t + 11;
        f24705q = i3 % 128;
        int i4 = i3 % 2;
        if (str.length() == 0) {
            return false;
        }
        int i5 = f24707t + 33;
        f24705q = i5 % 128;
        return i5 % 2 == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ad(int r9, byte r10, short r11, java.lang.Object[] r12) {
        /*
            byte[] r8 = o.eq.b.$$a
            int r0 = r11 * 4
            int r7 = 4 - r0
            int r0 = r10 * 3
            int r6 = r0 + 1
            int r3 = 101 - r9
            byte[] r5 = new byte[r6]
            r4 = 0
            if (r8 != 0) goto L2b
            r0 = r6
            r3 = r7
            r2 = r4
        L14:
            int r0 = -r0
            int r7 = r7 + 1
            int r3 = r3 + r0
            r1 = r2
        L19:
            byte r0 = (byte) r3
            int r2 = r1 + 1
            r5[r1] = r0
            if (r2 != r6) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r12[r4] = r0
            return
        L28:
            r0 = r8[r7]
            goto L14
        L2b:
            r1 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eq.b.ad(int, byte, short, java.lang.Object[]):void");
    }

    private static void ae(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        int i4 = 2 % 2;
        Object obj = null;
        Object obj2 = str2;
        if (str2 != null) {
            int i5 = $10 + 87;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                str2.toCharArray();
                obj.hashCode();
                throw null;
            }
            char[] charArray = str2.toCharArray();
            int i6 = $10 + 25;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            obj2 = charArray;
        }
        char[] cArr = (char[]) obj2;
        h hVar = new h();
        char[] cArr2 = f24701l;
        int i8 = 421932776;
        int i9 = -1;
        int i10 = 1;
        if (cArr2 != null) {
            int i11 = $10 + 49;
            int i12 = i11 % 128;
            $11 = i12;
            int i13 = i11 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i14 = i12 + 79;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            int i16 = 0;
            while (i16 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i16])};
                    Object objA = o.d.d.a(i8);
                    if (objA == null) {
                        byte b3 = (byte) i9;
                        byte b4 = (byte) (b3 + 1);
                        objA = o.d.d.a(270 - TextUtils.indexOf("", ""), (char) KeyEvent.normalizeMetaState(0), 11 - View.combineMeasuredStates(0, 0), -811348851, false, $$i(b3, b4, (byte) (33 | b4)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i16] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i16++;
                    i8 = 421932776;
                    i9 = -1;
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
        Object[] objArr3 = {Integer.valueOf(f24700k)};
        Object objA2 = o.d.d.a(421932776);
        char c2 = '\f';
        if (objA2 == null) {
            byte b5 = (byte) (-1);
            byte b6 = (byte) (b5 + 1);
            objA2 = o.d.d.a(270 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 12 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -811348851, false, $$i(b5, b6, (byte) (33 | b6)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            int i17 = $11 + 103;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            i3 = i2 - 1;
            cArr4[i3] = (char) (cArr[i3] - b2);
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            hVar.f19926b = 0;
            while (hVar.f19926b < i3) {
                hVar.f19927c = cArr[hVar.f19926b];
                hVar.f19925a = cArr[hVar.f19926b + i10];
                if (hVar.f19927c == hVar.f19925a) {
                    cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                    cArr4[hVar.f19926b + i10] = (char) (hVar.f19925a - b2);
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[c2] = hVar;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = hVar;
                    objArr4[9] = hVar;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = hVar;
                    objArr4[6] = hVar;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = hVar;
                    objArr4[3] = hVar;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[i10] = hVar;
                    objArr4[0] = hVar;
                    Object objA3 = o.d.d.a(219124184);
                    if (objA3 == null) {
                        int iAlpha = 11 - Color.alpha(0);
                        byte b7 = (byte) (-1);
                        byte b8 = (byte) (b7 + 1);
                        String str$$i = $$i(b7, b8, (byte) (42 | b8));
                        Class[] clsArr = new Class[13];
                        clsArr[0] = Object.class;
                        clsArr[i10] = Object.class;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Object.class;
                        clsArr[4] = Object.class;
                        clsArr[5] = Integer.TYPE;
                        clsArr[6] = Object.class;
                        clsArr[7] = Object.class;
                        clsArr[8] = Integer.TYPE;
                        clsArr[9] = Object.class;
                        clsArr[10] = Object.class;
                        clsArr[11] = Integer.TYPE;
                        clsArr[12] = Object.class;
                        objA3 = o.d.d.a(825 - Color.red(0), (char) (AndroidCharacter.getMirror('0') - '0'), iAlpha, -611683395, false, str$$i, clsArr);
                    }
                    if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                        Object[] objArr5 = new Object[11];
                        objArr5[10] = hVar;
                        objArr5[9] = Integer.valueOf(cCharValue);
                        objArr5[8] = hVar;
                        objArr5[7] = Integer.valueOf(cCharValue);
                        objArr5[6] = Integer.valueOf(cCharValue);
                        objArr5[5] = hVar;
                        objArr5[4] = hVar;
                        objArr5[3] = Integer.valueOf(cCharValue);
                        objArr5[2] = Integer.valueOf(cCharValue);
                        objArr5[i10] = hVar;
                        objArr5[0] = hVar;
                        Object objA4 = o.d.d.a(-634864343);
                        if (objA4 == null) {
                            byte b9 = (byte) (-1);
                            objA4 = o.d.d.a(218 - View.MeasureSpec.getSize(0), (char) ((-1) - MotionEvent.axisFromString("")), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 11, 212688716, false, $$i(b9, (byte) (b9 + 1), (byte) $$f), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        int i19 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr2[i19];
                    } else if (hVar.f19928d == hVar.f19929e) {
                        hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                        hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                        int i20 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                        int i21 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[i20];
                        cArr4[hVar.f19926b + 1] = cArr2[i21];
                    } else {
                        int i22 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                        int i23 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                        cArr4[hVar.f19926b] = cArr2[i22];
                        i10 = 1;
                        cArr4[hVar.f19926b + 1] = cArr2[i23];
                    }
                    i10 = 1;
                }
                hVar.f19926b += 2;
                c2 = '\f';
            }
        }
        int i24 = 0;
        while (i24 < i2) {
            int i25 = $10;
            int i26 = i25 + 29;
            $11 = i26 % 128;
            int i27 = i26 % 2;
            cArr4[i24] = (char) (cArr4[i24] ^ 13722);
            i24++;
            int i28 = i25 + 99;
            $11 = i28 % 128;
            int i29 = i28 % 2;
        }
        objArr[0] = new String(cArr4);
    }

    private static void af(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 111;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 10 / 0;
            charArray = str2 != null ? str2.toCharArray() : str2;
        } else if (str2 != null) {
        }
        char[] cArr = (char[]) charArray;
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            int i6 = $10 + 81;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr3[0] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i8 = 58224;
            for (int i9 = 0; i9 < 16; i9++) {
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i8) ^ ((c3 << 4) + ((char) (((long) f24703n) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f24706r)};
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        byte b2 = (byte) (-1);
                        byte b3 = (byte) (b2 + 1);
                        objA = o.d.d.a(270 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 12 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1995022631, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) f24702m) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f24704o)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        objA2 = o.d.d.a(View.resolveSizeAndState(0, 0, 0) + 270, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (Process.myTid() >> 22) + 11, -1995022631, false, $$i(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
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
            Object[] objArr4 = {gVar, gVar};
            Object objA3 = o.d.d.a(1390051551);
            if (objA3 == null) {
                byte b6 = (byte) (-1);
                byte b7 = (byte) (b6 + 1);
                objA3 = o.d.d.a(269 - ExpandableListView.getPackedPositionChild(0L), (char) View.resolveSize(0, 0), 11 - KeyEvent.normalizeMetaState(0), -2074123590, false, $$i(b6, b7, (byte) (b7 + 3)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0029 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ag(int r9, int r10, int r11, java.lang.Object[] r12) {
        /*
            int r0 = r10 * 3
            int r7 = r0 + 101
            byte[] r8 = o.eq.b.$$j
            int r0 = r11 * 2
            int r6 = r0 + 4
            int r5 = r9 * 2
            int r0 = r5 + 1
            byte[] r4 = new byte[r0]
            r3 = 0
            if (r8 != 0) goto L2e
            r1 = r6
            r2 = r3
        L15:
            int r0 = -r6
            int r7 = r7 + r0
            int r6 = r1 + 1
            r1 = r2
        L1a:
            byte r0 = (byte) r7
            r4[r1] = r0
            int r2 = r1 + 1
            if (r1 != r5) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r12[r3] = r0
            return
        L29:
            r0 = r8[r6]
            r1 = r6
            r6 = r0
            goto L15
        L2e:
            r1 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eq.b.ag(int, int, int, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        b bVar = (b) objArr[0];
        int i2 = 2 % 2;
        int i3 = f24707t + 29;
        int i4 = i3 % 128;
        f24705q = i4;
        int i5 = i3 % 2;
        Object obj = null;
        d dVar = bVar.f24708f;
        if (i5 != 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 1;
        f24707t = i6 % 128;
        if (i6 % 2 != 0) {
            return dVar;
        }
        throw null;
    }

    private o.ep.d b() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24707t + 21;
        f24705q = i3 % 128;
        int i4 = i3 % 2;
        Iterator<o.ep.d> it = o.en.b.c().g().values().iterator();
        int i5 = f24707t + 107;
        f24705q = i5 % 128;
        int i6 = i5 % 2;
        while (!(!it.hasNext())) {
            o.ep.d next = it.next();
            if (next.c(k())) {
                return next;
            }
        }
        Object[] objArr = new Object[1];
        ae((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 46, "\u0006\u0013\u0011\u0005\u001c\u0010\u0007\u0004\u0012\t\u0017\r\u0012\u001b\u000b \u0016\"\u001f\u001d\u0019\u001e\u001d\"\u0006\u001a\u0017\u0005\u0007!\u0000\u0019\u000b\u001a\u0005\u0017\u001d\u001e\u0014\u0007\u000b\u0005\u0007\u0012\u0001\u001c", (byte) (122 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr);
        throw new IllegalStateException(String.format(((String) objArr[0]).intern(), k()));
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(Unknown Source)
        	at java.base/java.util.TreeMap.lastKey(Unknown Source)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] d(android.content.Context r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 1604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eq.b.d(android.content.Context, int, int, int):java.lang.Object[]");
    }

    public static /* synthetic */ Object e(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) throws CloneNotSupportedException {
        int i8 = ~i5;
        int i9 = ~i6;
        int i10 = (~(i8 | i9)) | (~(i8 | i7));
        int i11 = ~((-1) - (((-1) - i5) & ((-1) - i7)));
        int i12 = ~i7;
        int i13 = (-1) - (((-1) - (~((-1) - (((-1) - i6) & ((-1) - ((i8 + i12) - (i8 & i12))))))) & ((-1) - i11));
        int i14 = i8 | (~((-1) - (((-1) - i9) & ((-1) - i12))));
        int i15 = i5 + i7 + i4 + ((-1570926368) * i2) + ((-1409401439) * i3);
        int i16 = i15 * i15;
        int i17 = (((-543990125) * i5) - 657981440) + (821186744 * i7) + ((-1953193618) * i10) + ((-976596809) * i13) + (976596809 * i14) + (1797783552 * i4) + (1124073472 * i2) + ((-332922880) * i3) + ((-1182662656) * i16);
        int i18 = (i5 * 1410161459) + 847508490 + (i7 * 1410159032) + (i10 * (-1618)) + (i13 * (-809)) + (i14 * 809) + (i4 * 1410159841) + (i2 * 1126552800) + (i3 * (-1948647807)) + (i16 * (-1287520256));
        int i19 = i17 + (i18 * i18 * (-1577189376));
        if (i19 != 1) {
            if (i19 == 2) {
                return a(objArr);
            }
            if (i19 != 3) {
                return b(objArr);
            }
            int i20 = 2 % 2;
            throw new CloneNotSupportedException();
        }
        b bVar = (b) objArr[0];
        int i21 = 2 % 2;
        int i22 = f24707t + 91;
        int i23 = i22 % 128;
        f24705q = i23;
        int i24 = i22 % 2;
        if (bVar.f24711i != null) {
            return new EmvApplicationActivationMethod(bVar.f24711i);
        }
        int i25 = i23 + 25;
        f24707t = i25 % 128;
        int i26 = i25 % 2;
        return null;
    }

    static void init$0() {
        $$a = new byte[]{Base64.padSymbol, -67, -29, 104};
        $$b = 240;
    }

    static void init$1() {
        $$j = new byte[]{88, MessagePack.Code.INT64, 78, Ascii.GS};
        $$k = 196;
    }

    static void init$2() {
        $$c = new byte[]{93, 121, -117, 60};
        $$f = 40;
    }

    public final String A() {
        int i2 = 2 % 2;
        int i3 = f24705q + 101;
        f24707t = i3 % 128;
        int i4 = i3 % 2;
        for (o.ep.d dVar : o.en.b.c().g().values()) {
            int i5 = f24707t + 65;
            f24705q = i5 % 128;
            int i6 = i5 % 2;
            if (dVar.A() != null) {
                Iterator<o.ep.a> it = dVar.A().values().iterator();
                while (!(!it.hasNext())) {
                    o.ep.a next = it.next();
                    Object[] objArr = {next, k()};
                    int iActiveCount = Thread.activeCount();
                    int i7 = o.ep.a.f24398a * (-579709169);
                    o.ep.a.f24398a = i7;
                    int i8 = o.ep.a.f24402e * (-1921349572);
                    o.ep.a.f24402e = i8;
                    if (((Boolean) o.ep.a.e(1475540925, objArr, (int) SystemClock.uptimeMillis(), -1475540925, iActiveCount, i8, i7)).booleanValue()) {
                        int i9 = f24705q + 125;
                        f24707t = i9 % 128;
                        if (i9 % 2 != 0) {
                            return next.h();
                        }
                        next.h();
                        throw null;
                    }
                }
            }
        }
        return null;
    }

    public abstract o.en.e D();

    public final void a(Map<String, o.cs.d> map) {
        int i2 = 2 % 2;
        int i3 = f24705q + 27;
        f24707t = i3 % 128;
        if (i3 % 2 != 0) {
            this.f24709g = map;
        } else {
            this.f24709g = map;
            throw null;
        }
    }

    protected abstract b b(String str);

    /* JADX WARN: Removed duplicated region for block: B:31:0x001e A[PHI: r3
  0x001e: PHI (r3v2 o.eq.b) = (r3v0 o.eq.b), (r3v3 o.eq.b) binds: [B:38:0x0062, B:30:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.eq.b b(o.eq.d r7) {
        /*
            r6 = this;
            r5 = 2
            int r0 = r5 % r5
            int r0 = o.eq.b.f24707t
            int r1 = r0 + 125
            int r0 = r1 % 128
            o.eq.b.f24705q = r0
            int r1 = r1 % r5
            if (r1 == 0) goto L58
            java.lang.String r0 = r6.f24710h
            o.eq.b r3 = r6.b(r0)
            r3.f24708f = r7
            java.util.Map<java.lang.String, o.cs.d> r1 = r6.f24709g
            r0 = 44
            int r0 = r0 / 0
            if (r1 == 0) goto L8e
        L1e:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Map<java.lang.String, o.cs.d> r0 = r6.f24709g
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L2d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L83
            int r0 = o.eq.b.f24707t
            int r1 = r0 + 117
            int r0 = r1 % 128
            o.eq.b.f24705q = r0
            int r1 = r1 % r5
            if (r1 != 0) goto L65
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            o.cs.d r0 = (o.cs.d) r0
            o.cs.d r0 = r0.b()
            r4.put(r1, r0)
            goto L2d
        L58:
            java.lang.String r0 = r6.f24710h
            o.eq.b r3 = r6.b(r0)
            r3.f24708f = r7
            java.util.Map<java.lang.String, o.cs.d> r0 = r6.f24709g
            if (r0 == 0) goto L8e
            goto L1e
        L65:
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            o.cs.d r0 = (o.cs.d) r0
            o.cs.d r0 = r0.b()
            r4.put(r1, r0)
            r0 = 0
            r0.hashCode()
            throw r0
        L83:
            r3.f24709g = r4
            int r0 = o.eq.b.f24705q
            int r1 = r0 + 15
            int r0 = r1 % 128
            o.eq.b.f24707t = r0
            int r1 = r1 % r5
        L8e:
            o.cs.d r2 = r6.f24711i
            if (r2 == 0) goto La1
            int r0 = o.eq.b.f24705q
            int r1 = r0 + 61
            int r0 = r1 % 128
            o.eq.b.f24707t = r0
            int r1 = r1 % r5
            o.cs.d r0 = r2.b()
            r3.f24711i = r0
        La1:
            int r0 = o.eq.b.f24707t
            int r1 = r0 + 29
            int r0 = r1 % 128
            o.eq.b.f24705q = r0
            int r1 = r1 % r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eq.b.b(o.eq.d):o.eq.b");
    }

    public abstract o.eu.d<? extends o.ff.a> c(String str);

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0049, code lost:
    
        if (((o.eq.d) e(r8, java.lang.Thread.currentThread().getPriority(), r10, -578669383, r12, 578669383, new java.lang.Object[]{r15})) == o.eq.d.f24731b) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0051, code lost:
    
        if (r17 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0053, code lost:
    
        r1 = r15.f24709g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0055, code lost:
    
        if (r1 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0057, code lost:
    
        r4 = r1.get(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x005d, code lost:
    
        if (r4 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x005f, code lost:
    
        r13 = o.cs.d.f22592d * (-1580426530);
        o.cs.d.f22592d = r13;
        r14 = o.cs.d.f22591c * 1801994784;
        o.cs.d.f22591c = r14;
        r12 = java.lang.Thread.currentThread().getPriority();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008f, code lost:
    
        if (((fr.antelop.sdk.card.EmvApplicationActivationMethodType) o.cs.d.b(java.lang.Thread.activeCount(), -1645654662, 1645654662, new java.lang.Object[]{r4}, r12, r13, r14)).hasToSubmitActivationCode() == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0091, code lost:
    
        r6 = b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0095, code lost:
    
        if (r6 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0097, code lost:
    
        r2 = o.eq.b.f24705q + 21;
        o.eq.b.f24707t = r2 % 128;
        r2 = r2 % 2;
        r12 = o.ep.d.f24455g * 1257510192;
        o.ep.d.f24455g = r12;
        r9 = o.ep.d.f24458j * (-785443339);
        o.ep.d.f24458j = r9;
        r10 = (int) java.lang.Runtime.getRuntime().freeMemory();
        r11 = o.ep.d.f24463o * (-1273864872);
        o.ep.d.f24463o = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d3, code lost:
    
        if (((o.ep.f) o.ep.d.e(1155975806, -1155975801, new java.lang.Object[]{r6}, r9, r10, r11, r12)) != o.ep.f.f24513e) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d5, code lost:
    
        r15.f24712j.c(r16, r15, r4, new o.eq.b.AnonymousClass5(r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0114, code lost:
    
        if (((o.eq.d) e(r8, java.lang.Thread.currentThread().getPriority(), r10, -578669383, r12, 578669383, new java.lang.Object[]{r15})) == o.eq.d.f24731b) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0118, code lost:
    
        r7 = fr.antelop.sdk.exception.WalletValidationErrorCode.WrongState;
        r2 = new java.lang.Object[1];
        af("ꤳ쪾\udc78吃", (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)) + 3, r2);
        r6 = ((java.lang.String) r2[0]).intern();
        r2 = new java.lang.Object[1];
        ae(43 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), "\u0013\u0001\u0005\n\u001d\"\u0014\u0007\u001d\u001f\f\u001e\u0007\u001a\u0017\u000f\u0012\u001b\n\u001a\u001e\u0017\u0019\u0007\u0013\u001b\u0017\r\u0012\u001b\u000b \u0016\u001b\"\u0005 \u0013\u000f\u0014\u0001\"㘃", (byte) (5 - android.view.View.combineMeasuredStates(0, 0)), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0156, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(r7, r6, ((java.lang.String) r2[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0157, code lost:
    
        r7 = fr.antelop.sdk.exception.WalletValidationErrorCode.Unexpected;
        r1 = new java.lang.Object[1];
        ae(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 30, "\b\u0006\u0013\u0017㙑㙑\u0003\u0013\u0007\u0012\u000f\u0017\u001a\u0006\u0012\n\u000f\u0017\u0013\u0014\u000f\u0017\u001a\u0006\u0001!\u000f\u001d\u0019\u001a", (byte) ((android.os.Process.myTid() >> 22) + 103), r1);
        r6 = ((java.lang.String) r1[0]).intern();
        r2 = new java.lang.Object[1];
        ae(41 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), "\u000f\u0019\u0016\u001b\u001f\u0017\u000b\f\u0016\u0013\u0017\r\u0012\u001b\u000b \u0007#\u000f\u001d\u0019\u001a\u001e\u000b\u0014\u0007\u0006\u001a\u0017\u0005\u0007!\"\u001d\u0001\u0007\u001e\u0007\r#㘠", (byte) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 34), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0198, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(r7, r6, ((java.lang.String) r2[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0199, code lost:
    
        r9 = fr.antelop.sdk.exception.WalletValidationErrorCode.Unknown;
        r1 = new java.lang.Object[1];
        ae(android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0') + 31, "\b\u0006\u0013\u0017㙑㙑\u0003\u0013\u0007\u0012\u000f\u0017\u001a\u0006\u0012\n\u000f\u0017\u0013\u0014\u000f\u0017\u001a\u0006\u0001!\u000f\u001d\u0019\u001a", (byte) (104 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1))), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01c0, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(r9, ((java.lang.String) r1[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01c1, code lost:
    
        r6 = fr.antelop.sdk.exception.WalletValidationErrorCode.WrongState;
        r1 = new java.lang.Object[1];
        ae(14 - android.view.View.resolveSizeAndState(0, 0, 0), "\b\u0006\u0013\u0017㘳㘳\u0003\u0013\u0007\u0012\u000f\u0017\u001a\u0006", (byte) (android.os.Process.getGidForName("") + 74), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01e2, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(r6, ((java.lang.String) r1[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01e3, code lost:
    
        r5 = fr.antelop.sdk.exception.WalletValidationErrorCode.Mandatory;
        r1 = new java.lang.Object[1];
        ae(30 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\b\u0006\u0013\u0017㙑㙑\u0003\u0013\u0007\u0012\u000f\u0017\u001a\u0006\u0012\n\u000f\u0017\u0013\u0014\u000f\u0017\u001a\u0006\u0001!\u000f\u001d\u0019\u001a", (byte) (103 - android.text.TextUtils.getCapsMode("", 0, 0)), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0207, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(r5, ((java.lang.String) r1[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0208, code lost:
    
        r6 = fr.antelop.sdk.exception.WalletValidationErrorCode.WrongState;
        r1 = new java.lang.Object[1];
        ae((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 14, "\b\u0006\u0013\u0017㘳㘳\u0003\u0013\u0007\u0012\u000f\u0017\u001a\u0006", (byte) (73 - android.graphics.Color.green(0)), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x022b, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(r6, ((java.lang.String) r1[0]).intern());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.content.Context r16, java.lang.String r17, fr.antelop.sdk.util.OperationCallback<java.lang.Void> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eq.b.c(android.content.Context, java.lang.String, fr.antelop.sdk.util.OperationCallback):void");
    }

    public final void c(d dVar) {
        int i2 = 2 % 2;
        int i3 = f24707t;
        int i4 = i3 + 45;
        f24705q = i4 % 128;
        if (i4 % 2 != 0) {
            this.f24708f = dVar;
            throw null;
        }
        this.f24708f = dVar;
        int i5 = i3 + 81;
        f24705q = i5 % 128;
        int i6 = i5 % 2;
    }

    protected final Object clone() throws CloneNotSupportedException {
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int iActiveCount = Thread.activeCount();
        int iMyTid = Process.myTid();
        int i2 = f24697c * (-1609885845);
        f24697c = i2;
        return e(iMyTid, i2, iActiveCount, -423827824, iFreeMemory, 423827827, new Object[]{this});
    }

    public final void e(Context context, String str, OperationCallback<Void> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24705q + 55;
        f24707t = i3 % 128;
        if (i3 % 2 == 0) {
            int priority = Thread.currentThread().getPriority();
            int i4 = (int) Runtime.getRuntime().totalMemory();
            int i5 = 579433029 * f24696b;
            f24696b = i5;
            d dVar = d.f24731b;
            throw null;
        }
        int priority2 = Thread.currentThread().getPriority();
        int i6 = (int) Runtime.getRuntime().totalMemory();
        int i7 = f24696b * 579433029;
        f24696b = i7;
        if (((d) e(i7, Thread.currentThread().getPriority(), i6, -578669383, priority2, 578669383, new Object[]{this})) != d.f24731b) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr = new Object[1];
            ae((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 14, "\b\u0006\u0013\u0017㘳㘳\u0003\u0013\u0007\u0012\u000f\u0017\u001a\u0006", (byte) (72 - ImageFormat.getBitsPerPixel(0)), objArr);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr[0]).intern());
        }
        if (str == null) {
            WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.Mandatory;
            Object[] objArr2 = new Object[1];
            ae(14 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "\u0012\n\u000f\u0017\u0013\u0014\u000f\u0017\u001a\u0006\u001e\u001c\u001f\u0001", (byte) (35 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr2);
            throw new WalletValidationException(walletValidationErrorCode2, ((String) objArr2[0]).intern());
        }
        if (!a(str)) {
            WalletValidationErrorCode walletValidationErrorCode3 = WalletValidationErrorCode.InvalidFormat;
            Object[] objArr3 = new Object[1];
            ae((ViewConfiguration.getDoubleTapTimeout() >> 16) + 14, "\u0012\n\u000f\u0017\u0013\u0014\u000f\u0017\u001a\u0006\u001e\u001c\u001f\u0001", (byte) (MotionEvent.axisFromString("") + 35), objArr3);
            throw new WalletValidationException(walletValidationErrorCode3, ((String) objArr3[0]).intern());
        }
        o.cs.d dVar2 = this.f24711i;
        if (dVar2 == null) {
            WalletValidationErrorCode walletValidationErrorCode4 = WalletValidationErrorCode.Unknown;
            Object[] objArr4 = new Object[1];
            ae(ExpandableListView.getPackedPositionType(0L) + 30, "\b\u0006\u0013\u0017㙑㙑\u0003\u0013\u0007\u0012\u000f\u0017\u001a\u0006\u0012\n\u000f\u0017\u0013\u0014\u000f\u0017\u001a\u0006\u0001!\u000f\u001d\u0019\u001a", (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 103), objArr4);
            String strIntern = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            ae((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 32, "\u0012\u001e\u001f\u0017\u000b\f\u0016\u0013\u0017\r\u0012\u001b\u000b \u0007#\u000f\u001d\u0019\u001a\"\u001d\u0001\u0007\u001e\u0007\r#\u001d\u001f\u0001#㙏", (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 96), objArr5);
            throw new WalletValidationException(walletValidationErrorCode4, strIntern, ((String) objArr5[0]).intern());
        }
        Object[] objArr6 = {dVar2};
        int i8 = o.cs.d.f22592d * (-1580426530);
        o.cs.d.f22592d = i8;
        int i9 = o.cs.d.f22591c * 1801994784;
        o.cs.d.f22591c = i9;
        if (!((EmvApplicationActivationMethodType) o.cs.d.b(Thread.activeCount(), -1645654662, 1645654662, objArr6, Thread.currentThread().getPriority(), i8, i9)).hasToSubmitActivationCode()) {
            WalletValidationErrorCode walletValidationErrorCode5 = WalletValidationErrorCode.WrongState;
            Object[] objArr7 = new Object[1];
            ae(30 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\b\u0006\u0013\u0017㙑㙑\u0003\u0013\u0007\u0012\u000f\u0017\u001a\u0006\u0012\n\u000f\u0017\u0013\u0014\u000f\u0017\u001a\u0006\u0001!\u000f\u001d\u0019\u001a", (byte) (103 - (ViewConfiguration.getJumpTapTimeout() >> 16)), objArr7);
            String strIntern2 = ((String) objArr7[0]).intern();
            Object[] objArr8 = new Object[1];
            ae(TextUtils.indexOf("", "", 0, 0) + 51, "\u000f\u0019\u0016\u001b\u001f\u0017\u000b\f\u0016\u0013\u0017\r\u0012\u001b\u000b \u0007#\u000f\u001d\u0019\u001a\u001f\u001d\u0019\u001e\u001d\"\u0006\u001a\u0017\u0005\u0010\u001a \u001e\u0012\u0007\u000f\u0017\u0013\u0014\u000f\u0017\u001a\u0006\u001e\u000b\u0019\u001a㘇", (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 7), objArr8);
            throw new WalletValidationException(walletValidationErrorCode5, strIntern2, ((String) objArr8[0]).intern());
        }
        Object[] objArr9 = {b()};
        int i10 = o.ep.d.f24455g * 1257510192;
        o.ep.d.f24455g = i10;
        int i11 = o.ep.d.f24458j * (-785443339);
        o.ep.d.f24458j = i11;
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i12 = o.ep.d.f24463o * (-1273864872);
        o.ep.d.f24463o = i12;
        if (((o.ep.f) o.ep.d.e(1155975806, -1155975801, objArr9, i11, iFreeMemory, i12, i10)) == o.ep.f.f24513e) {
            this.f24712j.e(context, this, str, new c() { // from class: o.eq.b.3
                private static final byte[] $$a = null;
                private static final int $$b = 0;
                private static final byte[] $$c = null;
                private static final int $$d = 0;
                private static int $10 = 0;
                private static int $11 = 0;

                /* JADX INFO: renamed from: b */
                private static int f24713b = 0;

                /* JADX INFO: renamed from: d */
                private static char[] f24714d = null;

                /* JADX INFO: renamed from: e */
                private static boolean f24715e = false;

                /* JADX INFO: renamed from: f */
                public static int f24716f = 0;

                /* JADX INFO: renamed from: g */
                public static int f24717g = 0;

                /* JADX INFO: renamed from: h */
                private static int f24718h = 0;

                /* JADX INFO: renamed from: i */
                private static int f24719i = 0;

                /* JADX INFO: renamed from: j */
                private static boolean f24720j = false;

                /* JADX INFO: renamed from: k */
                public static int f24721k = 0;

                /* JADX INFO: renamed from: l */
                public static int f24722l = 0;

                /* JADX INFO: renamed from: m */
                public static int f24723m = 0;

                /* JADX INFO: renamed from: a */
                private /* synthetic */ OperationCallback f24724a;

                private static String $$e(byte v2, byte v3, short v4) {
                    /*
                        int r0 = r9 * 6
                        int r7 = r0 + 67
                        byte[] r6 = o.eq.b.AnonymousClass3.$$c
                        int r5 = r10 * 3
                        int r2 = r5 + 1
                        int r0 = r8 * 3
                        int r1 = 3 - r0
                        byte[] r4 = new byte[r2]
                        r3 = 0
                        if (r6 != 0) goto L2b
                        r2 = r3
                        r0 = r1
                    L15:
                        int r1 = -r1
                        int r1 = r1 + r7
                        r7 = r1
                        r1 = r0
                    L19:
                        byte r0 = (byte) r7
                        r4[r2] = r0
                        if (r2 != r5) goto L24
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r4, r3)
                        return r0
                    L24:
                        int r2 = r2 + 1
                        int r0 = r1 + 1
                        r1 = r6[r0]
                        goto L15
                    L2b:
                        r2 = r3
                        goto L19
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.eq.b.AnonymousClass3.$$e(byte, byte, short):java.lang.String");
                }

                static {
                    init$1();
                    $10 = 0;
                    $11 = 1;
                    f24723m = 2057339322;
                    f24722l = -39442505;
                    f24721k = 1058472131;
                    f24717g = -246900254;
                    f24716f = -1932528372;
                    init$0();
                    f24718h = 0;
                    f24719i = 1;
                    f24714d = new char[]{2437, 2166, 2432, 2162, 2167, 2445, 2486, 2435, 2160, 2433, 2467, 2172, 2447, 2469, 2164, 2440, 2477, 2446, 2441, 2163, 2487, 2443, 2505, 2434, 2161, 2485};
                    f24713b = 2040400356;
                    f24715e = true;
                    f24720j = true;
                }

                AnonymousClass3(OperationCallback operationCallback2) {
                    operationCallback = operationCallback2;
                }

                /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                    java.util.NoSuchElementException
                    	at java.base/java.util.TreeMap.key(Unknown Source)
                    	at java.base/java.util.TreeMap.lastKey(Unknown Source)
                    	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                    	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                    */
                public static java.lang.Object[] e(android.content.Context r25, int r26, int r27, int r28) {
                    /*
                        Method dump skipped, instruction units count: 1958
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.eq.b.AnonymousClass3.e(android.content.Context, int, int, int):java.lang.Object[]");
                }

                static void init$0() {
                    $$a = new byte[]{67, Ascii.SI, 99, -76};
                    $$b = JfifUtil.MARKER_APP1;
                }

                static void init$1() {
                    $$c = new byte[]{65, 52, MessagePack.Code.UINT64, -121};
                    $$d = 68;
                }

                private static void n(int i22, String str2, int[] iArr, String str22, Object[] objArr10) throws Throwable {
                    String str3 = str2;
                    String str4 = str22;
                    int i32 = 2;
                    int i42 = 2 % 2;
                    int i52 = $10 + 21;
                    $11 = i52 % 128;
                    int i62 = i52 % 2;
                    Object bytes = str4;
                    if (str4 != null) {
                        bytes = str4.getBytes("ISO-8859-1");
                    }
                    byte[] bArr = (byte[]) bytes;
                    Object charArray = str3;
                    if (str3 != null) {
                        int i72 = $10 + 3;
                        $11 = i72 % 128;
                        if (i72 % 2 == 0) {
                            int i82 = 16 / 0;
                            charArray = str3.toCharArray();
                        } else {
                            charArray = str3.toCharArray();
                        }
                    }
                    char[] cArr = (char[]) charArray;
                    f fVar = new f();
                    char[] cArr2 = f24714d;
                    if (cArr2 != null) {
                        int length = cArr2.length;
                        char[] cArr3 = new char[length];
                        int i92 = 0;
                        while (i92 < length) {
                            int i102 = $11 + 111;
                            $10 = i102 % 128;
                            int i112 = i102 % i32;
                            try {
                                Object[] objArr22 = {Integer.valueOf(cArr2[i92])};
                                Object objA = o.d.d.a(1618406102);
                                if (objA == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objA = o.d.d.a(Gravity.getAbsoluteGravity(0, 0) + 593, (char) (13181 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (Process.myTid() >> 22) + 11, -1225586509, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                cArr3[i92] = ((Character) ((Method) objA).invoke(null, objArr22)).charValue();
                                i92++;
                                i32 = 2;
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
                    Object[] objArr32 = {Integer.valueOf(f24713b)};
                    Object objA2 = o.d.d.a(-1503702982);
                    if (objA2 == null) {
                        objA2 = o.d.d.a(TextUtils.getTrimmedLength("") + 32, (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 10 - TextUtils.indexOf((CharSequence) "", '0'), 1893380703, false, "F", new Class[]{Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr32)).intValue();
                    if (f24720j) {
                        fVar.f19923e = bArr.length;
                        char[] cArr4 = new char[fVar.f19923e];
                        fVar.f19922a = 0;
                        while (fVar.f19922a < fVar.f19923e) {
                            cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i22] - iIntValue);
                            Object[] objArr42 = {fVar, fVar};
                            Object objA3 = o.d.d.a(1540807955);
                            if (objA3 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = (byte) (b4 + 1);
                                objA3 = o.d.d.a(458 - View.combineMeasuredStates(0, 0), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), TextUtils.getCapsMode("", 0, 0) + 11, -1923924106, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objA3).invoke(null, objArr42);
                        }
                        objArr10[0] = new String(cArr4);
                        return;
                    }
                    if (!f24715e) {
                        fVar.f19923e = iArr.length;
                        char[] cArr5 = new char[fVar.f19923e];
                        fVar.f19922a = 0;
                        while (fVar.f19922a < fVar.f19923e) {
                            cArr5[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i22] - iIntValue);
                            fVar.f19922a++;
                        }
                        objArr10[0] = new String(cArr5);
                        return;
                    }
                    fVar.f19923e = cArr.length;
                    char[] cArr6 = new char[fVar.f19923e];
                    fVar.f19922a = 0;
                    while (fVar.f19922a < fVar.f19923e) {
                        int i122 = $11 + 83;
                        $10 = i122 % 128;
                        if (i122 % 2 != 0) {
                            cArr6[fVar.f19922a] = (char) (cArr2[cArr[fVar.f19923e >>> fVar.f19922a] + i22] >>> iIntValue);
                            Object[] objArr52 = {fVar, fVar};
                            Object objA4 = o.d.d.a(1540807955);
                            if (objA4 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = (byte) (b6 + 1);
                                objA4 = o.d.d.a(458 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 11 - TextUtils.indexOf("", ""), -1923924106, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objA4).invoke(null, objArr52);
                        } else {
                            cArr6[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i22] - iIntValue);
                            Object[] objArr62 = {fVar, fVar};
                            Object objA5 = o.d.d.a(1540807955);
                            if (objA5 == null) {
                                byte b8 = (byte) 0;
                                byte b9 = (byte) (b8 + 1);
                                objA5 = o.d.d.a(458 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) TextUtils.indexOf("", "", 0), 11 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1923924106, false, $$e(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objA5).invoke(null, objArr62);
                        }
                    }
                    objArr10[0] = new String(cArr6);
                }

                private static void o(byte v2, byte v3, byte v4, Object[] v5) {
                    /*
                        int r8 = r11 * 3
                        int r1 = r8 + 1
                        int r0 = r10 * 3
                        int r7 = r0 + 4
                        byte[] r6 = o.eq.b.AnonymousClass3.$$a
                        int r5 = r9 + 97
                        byte[] r4 = new byte[r1]
                        r3 = 0
                        if (r6 != 0) goto L2a
                        r2 = r7
                        r0 = r3
                    L13:
                        int r5 = r5 + r7
                        int r7 = r2 + 1
                    L16:
                        byte r1 = (byte) r5
                        r4[r0] = r1
                        if (r0 != r8) goto L23
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r4, r3)
                        r12[r3] = r0
                        return
                    L23:
                        r1 = r6[r7]
                        int r0 = r0 + 1
                        r2 = r7
                        r7 = r1
                        goto L13
                    L2a:
                        r0 = r3
                        goto L16
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.eq.b.AnonymousClass3.o(byte, byte, byte, java.lang.Object[]):void");
                }

                @Override // o.cc.c
                public final void a() {
                    int i22 = 2 % 2;
                    int i32 = f24718h + 59;
                    f24719i = i32 % 128;
                    if (i32 % 2 == 0) {
                        int i42 = 34 / 0;
                        if (operationCallback == null) {
                            return;
                        }
                    } else if (operationCallback == null) {
                        return;
                    }
                    operationCallback.onSuccess(null);
                    int i52 = f24719i + 45;
                    f24718h = i52 % 128;
                    int i62 = i52 % 2;
                }

                @Override // o.cc.c
                public final void e(o.bg.c cVar) {
                    int i22 = 2 % 2;
                    int i32 = f24719i;
                    int i42 = i32 + 63;
                    f24718h = i42 % 128;
                    int i52 = i42 % 2;
                    OperationCallback operationCallback2 = operationCallback;
                    if (operationCallback2 != null) {
                        int i62 = i32 + 45;
                        f24718h = i62 % 128;
                        if (i62 % 2 == 0) {
                            operationCallback2.onError(o.by.c.b(cVar).a());
                        } else {
                            operationCallback2.onError(o.by.c.b(cVar).a());
                            throw null;
                        }
                    }
                }
            });
            int i13 = f24707t + 51;
            f24705q = i13 % 128;
            int i14 = i13 % 2;
            return;
        }
        WalletValidationErrorCode walletValidationErrorCode6 = WalletValidationErrorCode.WrongState;
        Object[] objArr10 = new Object[1];
        af("ꤳ쪾\udc78吃", View.getDefaultSize(0, 0) + 4, objArr10);
        String strIntern3 = ((String) objArr10[0]).intern();
        Object[] objArr11 = new Object[1];
        ae(ExpandableListView.getPackedPositionChild(0L) + 44, "\u0013\u0001\u0005\n\u001d\"\u0014\u0007\u001d\u001f\f\u001e\u0007\u001a\u0017\u000f\u0012\u001b\n\u001a\u001e\u0017\u0019\u0007\u0013\u001b\u0017\r\u0012\u001b\u000b \u0016\u001b\"\u0005 \u0013\u000f\u0014\u0001\"㘃", (byte) (6 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr11);
        throw new WalletValidationException(walletValidationErrorCode6, strIntern3, ((String) objArr11[0]).intern());
    }

    public final void e(o.cs.d dVar) {
        int i2 = 2 % 2;
        int i3 = f24705q;
        int i4 = i3 + 101;
        f24707t = i4 % 128;
        if (i4 % 2 == 0) {
            this.f24711i = dVar;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.f24711i = dVar;
        int i5 = i3 + 77;
        f24707t = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 5 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x0227  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String k() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eq.b.k():java.lang.String");
    }

    public final d p() {
        int priority = Thread.currentThread().getPriority();
        int i2 = (int) Runtime.getRuntime().totalMemory();
        int i3 = f24696b * 579433029;
        f24696b = i3;
        return (d) e(i3, Thread.currentThread().getPriority(), i2, -578669383, priority, 578669383, new Object[]{this});
    }

    public abstract String q();

    public final Map<String, o.cs.d> r() {
        Map<String, o.cs.d> map;
        int i2 = 2 % 2;
        int i3 = f24705q + 91;
        int i4 = i3 % 128;
        f24707t = i4;
        if (i3 % 2 == 0) {
            map = this.f24709g;
            int i5 = 42 / 0;
        } else {
            map = this.f24709g;
        }
        int i6 = i4 + 63;
        f24705q = i6 % 128;
        int i7 = i6 % 2;
        return map;
    }

    public abstract boolean s();

    public final EmvApplicationStatus t() {
        int i2 = 2 % 2;
        int i3 = f24705q + 39;
        f24707t = i3 % 128;
        int i4 = i3 % 2;
        EmvApplicationStatus emvApplicationStatusD = this.f24708f.d();
        int i5 = f24705q + 125;
        f24707t = i5 % 128;
        int i6 = i5 % 2;
        return emvApplicationStatusD;
    }

    public final boolean u() {
        Map<String, o.cs.d> map;
        int i2 = 2 % 2;
        if (this.f24711i != null && (map = this.f24709g) != null) {
            Iterator<o.cs.d> it = map.values().iterator();
            while (it.hasNext()) {
                int i3 = f24707t + 43;
                f24705q = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {it.next()};
                int i5 = o.cs.d.f22590b * 2033895861;
                o.cs.d.f22590b = i5;
                int i6 = o.cs.d.f22593e * 1121861622;
                o.cs.d.f22593e = i6;
                int priority = Thread.currentThread().getPriority();
                int i7 = o.cs.d.f22589a * (-121879155);
                o.cs.d.f22589a = i7;
                String str = (String) o.cs.d.b(i7, 1953396095, -1953396094, objArr, priority, i5, i6);
                Object[] objArr2 = {this.f24711i};
                int i8 = o.cs.d.f22590b * 2033895861;
                o.cs.d.f22590b = i8;
                int i9 = o.cs.d.f22593e * 1121861622;
                o.cs.d.f22593e = i9;
                int priority2 = Thread.currentThread().getPriority();
                int i10 = o.cs.d.f22589a * (-121879155);
                o.cs.d.f22589a = i10;
                if (str.equals((String) o.cs.d.b(i10, 1953396095, -1953396094, objArr2, priority2, i8, i9))) {
                    e(null);
                    return true;
                }
                int i11 = f24707t + 65;
                f24705q = i11 % 128;
                int i12 = i11 % 2;
            }
        }
        return false;
    }

    public final String v() {
        int iMyUid = Process.myUid();
        int priority = Thread.currentThread().getPriority();
        int iActiveCount = Thread.activeCount();
        int i2 = f24699e * (-280241304);
        f24699e = i2;
        return (String) e(iActiveCount, i2, priority, -688819955, iMyUid, 688819957, new Object[]{this});
    }

    public final List<EmvApplicationActivationMethod> w() {
        int i2 = 2 % 2;
        int i3 = f24707t + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f24705q = i3 % 128;
        int i4 = i3 % 2;
        if (this.f24709g == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.f24709g.size());
        Iterator<o.cs.d> it = this.f24709g.values().iterator();
        while (it.hasNext()) {
            arrayList.add(new EmvApplicationActivationMethod(it.next()));
        }
        int i5 = f24707t + 89;
        f24705q = i5 % 128;
        int i6 = i5 % 2;
        return arrayList;
    }

    public final void x() {
        int i2 = 2 % 2;
        Map<String, o.cs.d> map = this.f24709g;
        if (map == null) {
            return;
        }
        Iterator<Map.Entry<String, o.cs.d>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            int i3 = f24705q + 75;
            f24707t = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = {it.next().getValue()};
                int i4 = o.cs.d.f22592d * (-1580426530);
                o.cs.d.f22592d = i4;
                int i5 = o.cs.d.f22591c * 1801994784;
                o.cs.d.f22591c = i5;
                ((EmvApplicationActivationMethodType) o.cs.d.b(Thread.activeCount(), -1645654662, 1645654662, objArr, Thread.currentThread().getPriority(), i4, i5)).hasToSubmitActivationCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object[] objArr2 = {it.next().getValue()};
            int i6 = o.cs.d.f22592d * (-1580426530);
            o.cs.d.f22592d = i6;
            int i7 = o.cs.d.f22591c * 1801994784;
            o.cs.d.f22591c = i7;
            if (((EmvApplicationActivationMethodType) o.cs.d.b(Thread.activeCount(), -1645654662, 1645654662, objArr2, Thread.currentThread().getPriority(), i6, i7)).hasToSubmitActivationCode()) {
                int i8 = f24707t + 63;
                f24705q = i8 % 128;
                int i9 = i8 % 2;
                it.remove();
            }
        }
        int i10 = f24705q + 97;
        f24707t = i10 % 128;
        int i11 = i10 % 2;
    }

    public final EmvApplicationActivationMethod y() {
        int i2 = f24695a * 928465393;
        f24695a = i2;
        int i3 = f24698d * (-2053167728);
        f24698d = i3;
        return (EmvApplicationActivationMethod) e(Thread.activeCount(), Process.myUid(), i3, -529944753, i2, 529944754, new Object[]{this});
    }
}
