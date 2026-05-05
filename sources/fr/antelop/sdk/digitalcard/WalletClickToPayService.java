package fr.antelop.sdk.digitalcard;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import fr.antelop.sdk.AntelopError;
import fr.antelop.sdk.exception.WalletValidationException;
import fr.antelop.sdk.util.OperationCallback;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.a.f;
import o.d.d;
import o.ea.m;
import o.en.b;
import o.er.aa;
import o.er.k;
import o.er.n;
import o.er.o;

/* JADX INFO: loaded from: classes5.dex */
public class WalletClickToPayService {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static char[] f19326a = null;

    /* JADX INFO: renamed from: b */
    private static int f19327b = 0;

    /* JADX INFO: renamed from: c */
    private static boolean f19328c = false;

    /* JADX INFO: renamed from: d */
    private static boolean f19329d = false;

    /* JADX INFO: renamed from: e */
    private static char[] f19330e = null;

    /* JADX INFO: renamed from: f */
    private static int f19331f = 0;

    /* JADX INFO: renamed from: g */
    private static int f19332g = 0;

    /* JADX INFO: renamed from: h */
    private static long f19333h = 0;

    /* JADX INFO: renamed from: i */
    private static int f19334i = 0;

    /* JADX INFO: renamed from: j */
    private static int f19335j = 0;

    /* JADX INFO: renamed from: k */
    public static int f19336k = 0;
    private final aa innerService;

    /* JADX INFO: renamed from: fr.antelop.sdk.digitalcard.WalletClickToPayService$1 */
    class AnonymousClass1 implements OperationCallback<k> {
        final /* synthetic */ OperationCallback val$callback;

        AnonymousClass1(OperationCallback operationCallback) {
            operationCallback = operationCallback;
        }

        @Override // fr.antelop.sdk.util.OperationCallback
        public void onError(AntelopError antelopError) {
            operationCallback.onError(antelopError);
        }

        @Override // fr.antelop.sdk.util.OperationCallback
        public void onSuccess(k kVar) {
            operationCallback.onSuccess(new ClickToPayCustomerProfile(kVar));
        }
    }

    /* JADX INFO: renamed from: fr.antelop.sdk.digitalcard.WalletClickToPayService$2 */
    class AnonymousClass2 implements OperationCallback<List<o>> {
        final /* synthetic */ OperationCallback val$callback;

        AnonymousClass2(OperationCallback operationCallback) {
            operationCallback = operationCallback;
        }

        @Override // fr.antelop.sdk.util.OperationCallback
        public void onError(AntelopError antelopError) {
            operationCallback.onError(antelopError);
        }

        @Override // fr.antelop.sdk.util.OperationCallback
        public void onSuccess(List<o> list) {
            operationCallback.onSuccess(m.b(list));
        }
    }

    /* JADX INFO: renamed from: fr.antelop.sdk.digitalcard.WalletClickToPayService$3 */
    class AnonymousClass3 implements OperationCallback<List<o.er.m>> {
        final /* synthetic */ OperationCallback val$callback;

        AnonymousClass3(OperationCallback operationCallback) {
            operationCallback = operationCallback;
        }

        @Override // fr.antelop.sdk.util.OperationCallback
        public void onError(AntelopError antelopError) {
            operationCallback.onError(antelopError);
        }

        @Override // fr.antelop.sdk.util.OperationCallback
        public void onSuccess(List<o.er.m> list) {
            operationCallback.onSuccess(m.b(list));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(short r8, byte r9, short r10) {
        /*
            int r0 = r8 * 4
            int r8 = r0 + 1
            byte[] r7 = fr.antelop.sdk.digitalcard.WalletClickToPayService.$$c
            int r0 = r9 * 3
            int r6 = 4 - r0
            int r5 = r10 + 67
            byte[] r4 = new byte[r8]
            r3 = 0
            if (r7 != 0) goto L2c
            r5 = r8
            r1 = r6
            r2 = r3
        L14:
            int r6 = r6 + r5
            int r0 = r1 + 1
            r1 = r2
            r5 = r6
            r6 = r0
        L1a:
            int r2 = r1 + 1
            byte r0 = (byte) r5
            r4[r1] = r0
            if (r2 != r8) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L27:
            r0 = r7[r6]
            r1 = r6
            r6 = r0
            goto L14
        L2c:
            r1 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.WalletClickToPayService.$$e(short, byte, short):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        f19336k = 1014692146;
        init$0();
        f19335j = 0;
        f19331f = 1;
        f19334i = 0;
        f19332g = 1;
        e();
        f19330e = new char[]{2344};
        f19327b = 2040400219;
        f19329d = true;
        f19328c = true;
        int i2 = f19331f + 103;
        f19335j = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 45 / 0;
        }
    }

    public WalletClickToPayService(b bVar) {
        this.innerService = new aa(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] b(android.content.Context r23, int r24, int r25, int r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1593
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.WalletClickToPayService.b(android.content.Context, int, int, int):java.lang.Object[]");
    }

    static void e() {
        f19326a = new char[]{38035, 8991, 64400, 45577, 19089, 276, 55684, 36937, 10377, 59142, 49026, 30247, 3763, 50491, 40364, 21617, 60545, 47918, 29610, 2623, 49835, 39221, 20932, 38037, 8980, 64384, 45626, 19086, 269, 55692, 36878, 10377, 59144, 49048, 30266, 3769, 50491, 40337, 21553, 60580, 47918, 38035, 8991, 64400, 45577, 19089, 276, 55684, 36937, 10377, 59142, 49026, 30247, 3763, 50491, 40364, 21617, 60594, 47916, 29674, 2570, 49854, 39229, 20956, 59486, 41177, 32600, 14280, 52810, 34505, 23883, 5601, 44097, 25844, 13182, 38036, 8989, 64405, 45596, 19085, 4589, 42532, 32432, 14120, 53217, 33828, 23742, 5438, 44462, 25206, 15024, 62223, 35725, 16385, 6341, 53515, 27031, 15891, 63105, 36636, 18329, 7196, 54498, 28011, 9711, 64039, 45822, 19312, 11478, 39752, 17292, 2633, 62157, 47433, 25027, 10326, 37083, 24414, 2008, 52841, 46821};
        f19333h = 6273834507259028337L;
    }

    static void init$0() {
        $$a = new byte[]{108, -100, -109, 80};
        $$b = 206;
    }

    static void init$1() {
        $$c = new byte[]{88, 0, 126, -69};
        $$d = 23;
    }

    private static void l(int i2, char c2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o.a.o oVar = new o.a.o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f19326a[i2 + i5])};
                Object objA = d.a(-214519724);
                if (objA == null) {
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 743;
                    char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                    int iIndexOf2 = 11 - TextUtils.indexOf((CharSequence) "", '0');
                    byte b2 = $$c[1];
                    byte b3 = b2;
                    objA = d.a(iIndexOf, offsetBefore, iIndexOf2, 632508977, false, $$e(b2, b3, (byte) ((-1) - (((-1) - b3) & ((-1) - 32)))), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(f19333h), Integer.valueOf(c2)};
                Object objA2 = d.a(-1567654649);
                if (objA2 == null) {
                    int i6 = 767 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 12470);
                    int iIndexOf3 = 12 - TextUtils.indexOf("", "", 0, 0);
                    byte b4 = $$c[1];
                    byte b5 = b4;
                    objA2 = d.a(i6, touchSlop, iIndexOf3, 1946853218, false, $$e(b4, b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 33)))), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = d.a(-723636472);
                if (objA3 == null) {
                    int iLastIndexOf = 386 - TextUtils.lastIndexOf("", '0', 0);
                    char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                    int absoluteGravity = 18 - Gravity.getAbsoluteGravity(0, 0);
                    byte b6 = $$c[1];
                    byte b7 = b6;
                    objA3 = d.a(iLastIndexOf, pressedStateDuration, absoluteGravity, 39570797, false, $$e(b6, b7, (byte) ((b7 + 38) - (38 & b7))), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                int i7 = $10 + 51;
                $11 = i7 % 128;
                int i8 = i7 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i9 = $11 + 53;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr5 = {oVar, oVar};
                Object objA4 = d.a(-723636472);
                if (objA4 == null) {
                    int capsMode = 387 - TextUtils.getCapsMode("", 0, 0);
                    char cArgb = (char) Color.argb(0, 0, 0, 0);
                    int scrollBarFadeDuration = 18 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    byte b8 = $$c[1];
                    byte b9 = b8;
                    objA4 = d.a(capsMode, cArgb, scrollBarFadeDuration, 39570797, false, $$e(b8, b9, (byte) (38 | b9)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
                throw null;
            }
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr6 = {oVar, oVar};
            Object objA5 = d.a(-723636472);
            if (objA5 == null) {
                int iLastIndexOf2 = 386 - TextUtils.lastIndexOf("", '0', 0, 0);
                char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0') + 19;
                byte b10 = $$c[1];
                byte b11 = b10;
                objA5 = d.a(iLastIndexOf2, packedPositionType, iIndexOf4, 39570797, false, $$e(b10, b11, (byte) (38 | b11)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
        }
        String str = new String(cArr);
        int i10 = $11 + 69;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str;
    }

    private static void m(byte b2, byte b3, byte b4, Object[] objArr) {
        int i2 = (b3 * 3) + 4;
        int i3 = b4 * 3;
        int i4 = b2 + 97;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2++;
            i4 = (-i4) + i2;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i4;
            if (i5 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2++;
                i4 = (-bArr[i2]) + i4;
            }
        }
    }

    private static void n(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        String str3 = str;
        String str4 = str2;
        int i3 = 2;
        int i4 = 2 % 2;
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
        char[] cArr2 = f19330e;
        int i5 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 115;
                $10 = i7 % 128;
                int i8 = i7 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objA = d.a(1618406102);
                    if (objA == null) {
                        int iResolveSizeAndState = 593 - View.resolveSizeAndState(i5, i5, i5);
                        char capsMode = (char) (TextUtils.getCapsMode("", i5, i5) + 13181);
                        int tapTimeout = 11 - (ViewConfiguration.getTapTimeout() >> 16);
                        byte b2 = $$c[1];
                        byte b3 = b2;
                        objA = d.a(iResolveSizeAndState, capsMode, tapTimeout, -1225586509, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i6++;
                    i3 = 2;
                    i5 = 0;
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
        Object[] objArr3 = {Integer.valueOf(f19327b)};
        Object objA2 = d.a(-1503702982);
        if (objA2 == null) {
            objA2 = d.a(KeyEvent.keyCodeFromString("") + 32, (char) (ViewConfiguration.getEdgeSlop() >> 16), 11 - (Process.myPid() >> 22), 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        long j2 = 0;
        if (f19328c) {
            int i9 = $11 + 51;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            fVar.f19923e = bArr.length;
            char[] cArr4 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                int i11 = $11 + 89;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] * iIntValue);
                    Object[] objArr4 = {fVar, fVar};
                    Object objA3 = d.a(1540807955);
                    if (objA3 == null) {
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 458;
                        char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(j2));
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 11;
                        byte b4 = $$c[1];
                        byte b5 = b4;
                        objA3 = d.a(keyRepeatTimeout, packedPositionChild, iCombineMeasuredStates, -1923924106, false, $$e(b4, b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 6)))), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } else {
                    cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                    Object[] objArr5 = {fVar, fVar};
                    Object objA4 = d.a(1540807955);
                    if (objA4 == null) {
                        int trimmedLength = 458 - TextUtils.getTrimmedLength("");
                        char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 12;
                        byte b6 = $$c[1];
                        byte b7 = b6;
                        objA4 = d.a(trimmedLength, scrollDefaultDelay, iLastIndexOf, -1923924106, false, $$e(b6, b7, (byte) ((-1) - (((-1) - b7) & ((-1) - 6)))), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
                j2 = 0;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (f19329d) {
            int i12 = $10 + 85;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            fVar.f19923e = cArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                int i14 = $10 + 51;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    cArr5[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e >>> 1) * fVar.f19922a] % i2] * iIntValue);
                    Object[] objArr6 = {fVar, fVar};
                    Object objA5 = d.a(1540807955);
                    if (objA5 == null) {
                        int scrollDefaultDelay2 = 458 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        char c2 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 12;
                        byte b8 = $$c[1];
                        byte b9 = b8;
                        objA5 = d.a(scrollDefaultDelay2, c2, iLastIndexOf2, -1923924106, false, $$e(b8, b9, (byte) (6 | b9)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA5).invoke(null, objArr6);
                } else {
                    cArr5[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                    Object[] objArr7 = {fVar, fVar};
                    Object objA6 = d.a(1540807955);
                    if (objA6 == null) {
                        int iIndexOf = 458 - TextUtils.indexOf("", "", 0, 0);
                        char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 12;
                        byte b10 = $$c[1];
                        byte b11 = b10;
                        objA6 = d.a(iIndexOf, longPressTimeout, bitsPerPixel, -1923924106, false, $$e(b10, b11, (byte) (6 | b11)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA6).invoke(null, objArr7);
                }
            }
            String str5 = new String(cArr5);
            int i15 = $10 + 55;
            $11 = i15 % 128;
            if (i15 % 2 != 0) {
                objArr[0] = str5;
                return;
            } else {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i16 = 0;
        fVar.f19923e = iArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        while (true) {
            fVar.f19922a = i16;
            if (fVar.f19922a >= fVar.f19923e) {
                objArr[0] = new String(cArr6);
                return;
            } else {
                cArr6[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                i16 = fVar.f19922a + 1;
            }
        }
    }

    public void deleteCustomerAndCards(OperationCallback<Void> operationCallback) throws WalletValidationException {
        int i2 = 2 % 2;
        int i3 = f19334i + 63;
        f19332g = i3 % 128;
        int i4 = i3 % 2;
        this.innerService.a(operationCallback);
        int i5 = f19334i + 69;
        f19332g = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void getCards(OperationCallback<List<ClickToPayCardProfile>> operationCallback) throws WalletValidationException {
        int i2 = 2 % 2;
        this.innerService.e(new OperationCallback<List<o>>() { // from class: fr.antelop.sdk.digitalcard.WalletClickToPayService.2
            final /* synthetic */ OperationCallback val$callback;

            AnonymousClass2(OperationCallback operationCallback2) {
                operationCallback = operationCallback2;
            }

            @Override // fr.antelop.sdk.util.OperationCallback
            public void onError(AntelopError antelopError) {
                operationCallback.onError(antelopError);
            }

            @Override // fr.antelop.sdk.util.OperationCallback
            public void onSuccess(List<o> list) {
                operationCallback.onSuccess(m.b(list));
            }
        });
        int i3 = f19334i + 77;
        f19332g = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void getCustomerProfile(OperationCallback<ClickToPayCustomerProfile> operationCallback) throws WalletValidationException {
        int i2 = 2 % 2;
        this.innerService.d(new OperationCallback<k>() { // from class: fr.antelop.sdk.digitalcard.WalletClickToPayService.1
            final /* synthetic */ OperationCallback val$callback;

            AnonymousClass1(OperationCallback operationCallback2) {
                operationCallback = operationCallback2;
            }

            @Override // fr.antelop.sdk.util.OperationCallback
            public void onError(AntelopError antelopError) {
                operationCallback.onError(antelopError);
            }

            @Override // fr.antelop.sdk.util.OperationCallback
            public void onSuccess(k kVar) {
                operationCallback.onSuccess(new ClickToPayCustomerProfile(kVar));
            }
        });
        int i3 = f19334i + 117;
        f19332g = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public boolean hasCustomerProfile() {
        int i2 = 2 % 2;
        int i3 = f19332g + 5;
        f19334i = i3 % 128;
        int i4 = i3 % 2;
        aa aaVar = this.innerService;
        if (i4 == 0) {
            return aaVar.a();
        }
        aaVar.a();
        throw null;
    }

    public void pushCustomerAndCards(ClickToPayCustomerProfile clickToPayCustomerProfile, List<ClickToPayCardProfile> list, ClickToPayComplianceSettings clickToPayComplianceSettings, OperationCallback<List<ClickToPayPushCardNotProcessed>> operationCallback) throws WalletValidationException {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ClickToPayCardProfile> it = list.iterator();
        while (it.hasNext()) {
            int i3 = f19334i + 105;
            f19332g = i3 % 128;
            int i4 = i3 % 2;
            arrayList.add(it.next().getInnerCardProfile());
        }
        this.innerService.c(clickToPayCustomerProfile.getInnerCustomerProfile(), arrayList, clickToPayComplianceSettings == null ? null : clickToPayComplianceSettings.getInnerClickToPayComplianceSettings(), new OperationCallback<List<o.er.m>>() { // from class: fr.antelop.sdk.digitalcard.WalletClickToPayService.3
            final /* synthetic */ OperationCallback val$callback;

            AnonymousClass3(OperationCallback operationCallback2) {
                operationCallback = operationCallback2;
            }

            @Override // fr.antelop.sdk.util.OperationCallback
            public void onError(AntelopError antelopError) {
                operationCallback.onError(antelopError);
            }

            @Override // fr.antelop.sdk.util.OperationCallback
            public void onSuccess(List<o.er.m> list2) {
                operationCallback.onSuccess(m.b(list2));
            }
        });
        int i5 = f19332g + 77;
        f19334i = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 40 / 0;
        }
    }

    public void updateCustomerProfile(ClickToPayCustomerProfile clickToPayCustomerProfile, ClickToPayComplianceSettings clickToPayComplianceSettings, OperationCallback<Void> operationCallback) throws WalletValidationException {
        n innerClickToPayComplianceSettings;
        int i2 = 2 % 2;
        int i3 = f19334i + 43;
        f19332g = i3 % 128;
        int i4 = i3 % 2;
        aa aaVar = this.innerService;
        k innerCustomerProfile = clickToPayCustomerProfile.getInnerCustomerProfile();
        if (clickToPayComplianceSettings == null) {
            int i5 = f19334i + 115;
            f19332g = i5 % 128;
            int i6 = i5 % 2;
            innerClickToPayComplianceSettings = null;
        } else {
            innerClickToPayComplianceSettings = clickToPayComplianceSettings.getInnerClickToPayComplianceSettings();
        }
        aaVar.b(innerCustomerProfile, innerClickToPayComplianceSettings, operationCallback);
    }
}
