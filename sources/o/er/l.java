package o.er;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import fr.antelop.sdk.AntelopError;
import fr.antelop.sdk.card.CardStatus;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import fr.antelop.sdk.util.OperationCallback;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o.er.o;
import okio.Utf8;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends h {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f25032b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f25033c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f25034e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o.aa.b f25035d;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r7, int r8, short r9) {
        /*
            int r2 = r8 + 4
            int r0 = r7 * 2
            int r0 = r0 + 113
            byte[] r8 = o.er.l.$$a
            int r7 = r9 * 4
            int r1 = r7 + 1
            byte[] r6 = new byte[r1]
            r5 = 0
            if (r8 != 0) goto L29
            r4 = r7
            r3 = r5
        L13:
            int r0 = -r0
            int r0 = r0 + r4
        L15:
            byte r1 = (byte) r0
            r6[r3] = r1
            if (r3 != r7) goto L20
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L20:
            int r3 = r3 + 1
            int r2 = r2 + 1
            r1 = r8[r2]
            r4 = r0
            r0 = r1
            goto L13
        L29:
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.er.l.$$c(short, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f25034e = 0;
        f25033c = 1;
        f25032b = -1270219474;
    }

    public l(o.ep.d dVar, o.eq.e eVar) {
        super(dVar, eVar);
        Object[] objArr = {o.en.b.c()};
        int i2 = o.en.b.f24086a * (-1339268403);
        o.en.b.f24086a = i2;
        this.f25035d = o.aa.b.c((Context) o.en.b.a(-1657581939, i2, objArr, (int) Runtime.getRuntime().totalMemory(), 1657581940, (int) Thread.currentThread().getId(), Process.myPid()));
    }

    private static void f(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i5 = 2 % 2;
        if (str2 != null) {
            int i6 = $11 + 79;
            $10 = i6 % 128;
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
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(f25032b)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    int offsetAfter = 270 - TextUtils.getOffsetAfter("", 0);
                    char c2 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 11;
                    byte b2 = (byte) ((-1) - (((-1) - $$b) | ((-1) - 5)));
                    byte b3 = (byte) (-b2);
                    objA = o.d.d.a(offsetAfter, c2, maxKeyCode, -2071844881, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objA2 = o.d.d.a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 521, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 12 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 627984172, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
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
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = o.d.d.a(-202660535);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    objA3 = o.d.d.a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 522, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13, 627984172, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                int i9 = $11 + 71;
                $10 = i9 % 128;
                int i10 = i9 % 2;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void init$0() {
        $$a = new byte[]{68, -108, -67, 58};
        $$b = 179;
    }

    public final void a(final OperationCallback<Boolean> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25034e + 23;
        f25033c = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {this.f25009a};
            int i4 = o.ep.d.f24461m * (-222457364);
            o.ep.d.f24461m = i4;
            int i5 = o.ep.d.f24462n * 325900588;
            o.ep.d.f24462n = i5;
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i6 = o.ep.d.f24460l * 323941697;
            o.ep.d.f24460l = i6;
            CardStatus cardStatus = CardStatus.Active;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {this.f25009a};
        int i7 = o.ep.d.f24461m * (-222457364);
        o.ep.d.f24461m = i7;
        int i8 = o.ep.d.f24462n * 325900588;
        o.ep.d.f24462n = i8;
        int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
        int i9 = o.ep.d.f24460l * 323941697;
        o.ep.d.f24460l = i9;
        if (((CardStatus) o.ep.d.e(1555433584, -1555433578, objArr2, i8, iElapsedRealtime2, i9, i7)) != CardStatus.Active) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr3 = new Object[1];
            f(4 - (ViewConfiguration.getFadingEdgeLength() >> 16), "\u0006￥\u0003\u0014", false, 148 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr3);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr3[0]).intern());
        }
        if (c()) {
            this.f25035d.a(new OperationCallback<List<o>>() { // from class: o.er.l.2
                private static final byte[] $$a = null;
                private static final int $$b = 0;
                private static final byte[] $$c = null;
                private static final int $$d = 0;
                private static int $10 = 0;
                private static int $11 = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static int f25036a = 0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f25037b = 0;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static int f25038c = 0;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public static int f25039f = 0;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public static int f25040g = 0;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public static int f25041h = 0;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public static int f25042i = 0;

                /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0016). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static java.lang.String $$e(int r9, int r10, byte r11) {
                    /*
                        int r0 = r11 * 2
                        int r8 = 1 - r0
                        byte[] r7 = o.er.l.AnonymousClass2.$$c
                        int r0 = r10 * 3
                        int r6 = r0 + 4
                        int r0 = r9 * 2
                        int r5 = 115 - r0
                        byte[] r4 = new byte[r8]
                        r3 = 0
                        if (r7 != 0) goto L2a
                        r0 = r5
                        r5 = r8
                        r2 = r3
                    L16:
                        int r6 = r6 + 1
                        int r5 = r5 + r0
                        r1 = r2
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
                        goto L16
                    L2a:
                        r1 = r3
                        goto L1a
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.er.l.AnonymousClass2.$$e(int, int, byte):java.lang.String");
                }

                static {
                    init$1();
                    $10 = 0;
                    $11 = 1;
                    f25042i = -1561714117;
                    f25041h = -953417195;
                    f25040g = -658269618;
                    f25039f = -749526868;
                    init$0();
                    f25037b = 0;
                    f25036a = 1;
                    f25038c = -1270219466;
                }

                /* JADX WARN: Code restructure failed: missing block: B:61:0x0584, code lost:
                
                    if ((r0 != null) != true) goto L62;
                 */
                /* JADX WARN: Not initialized variable reg: 10, insn: 0x0166: ARITH (r7 I:??[int, boolean]) = (r10 I:??[int, boolean, short, byte, char]) ^ (2 ??[int, float, short, byte, char]), block:B:11:0x0166 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public static java.lang.Object[] a(int r27, int r28) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 1759
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.er.l.AnonymousClass2.a(int, int):java.lang.Object[]");
                }

                private void b(List<o> list) {
                    int i10 = 2 % 2;
                    int i11 = f25037b + 11;
                    f25036a = i11 % 128;
                    int i12 = i11 % 2;
                    Iterator<o> it = list.iterator();
                    while (it.hasNext()) {
                        int i13 = f25037b + 89;
                        f25036a = i13 % 128;
                        if (i13 % 2 == 0) {
                            it.next().c().equals(l.this.f25009a.b());
                            throw null;
                        }
                        if (it.next().c().equals(l.this.f25009a.b())) {
                            operationCallback.onSuccess(Boolean.TRUE);
                            return;
                        }
                    }
                    operationCallback.onSuccess(Boolean.FALSE);
                }

                static void init$0() {
                    $$a = new byte[]{111, MessagePack.Code.MAP16, MessagePack.Code.TRUE, Ascii.DC4};
                    $$b = 251;
                }

                static void init$1() {
                    $$c = new byte[]{Utf8.REPLACEMENT_BYTE, -81, -107, -8};
                    $$d = 199;
                }

                private static void j(int i10, String str, boolean z2, int i11, int i12, Object[] objArr4) throws Throwable {
                    String str2 = str;
                    int i13 = 2 % 2;
                    Object charArray = str2;
                    if (str2 != null) {
                        charArray = str2.toCharArray();
                    }
                    char[] cArr = (char[]) charArray;
                    o.a.n nVar = new o.a.n();
                    char[] cArr2 = new char[i10];
                    nVar.f19944a = 0;
                    while (nVar.f19944a < i10) {
                        nVar.f19946e = cArr[nVar.f19944a];
                        cArr2[nVar.f19944a] = (char) (i11 + nVar.f19946e);
                        int i14 = nVar.f19944a;
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr2[i14]), Integer.valueOf(f25038c)};
                            Object objA = o.d.d.a(1376241034);
                            if (objA == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objA = o.d.d.a(270 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (ViewConfiguration.getPressedStateDuration() >> 16), 11 - View.combineMeasuredStates(0, 0), -2071844881, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr2[i14] = ((Character) ((Method) objA).invoke(null, objArr5)).charValue();
                            Object[] objArr6 = {nVar, nVar};
                            Object objA2 = o.d.d.a(-202660535);
                            if (objA2 == null) {
                                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 522;
                                char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 12;
                                byte b4 = (byte) ($$d & 1);
                                byte b5 = (byte) (b4 - 1);
                                objA2 = o.d.d.a(packedPositionType, deadChar, touchSlop, 627984172, false, $$e(b4, b5, b5), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objA2).invoke(null, objArr6);
                            int i15 = $10 + 3;
                            $11 = i15 % 128;
                            int i16 = i15 % 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    if (i12 > 0) {
                        nVar.f19945b = i12;
                        char[] cArr3 = new char[i10];
                        System.arraycopy(cArr2, 0, cArr3, 0, i10);
                        System.arraycopy(cArr3, 0, cArr2, i10 - nVar.f19945b, nVar.f19945b);
                        System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i10 - nVar.f19945b);
                    }
                    if (z2) {
                        char[] cArr4 = new char[i10];
                        nVar.f19944a = 0;
                        while (nVar.f19944a < i10) {
                            cArr4[nVar.f19944a] = cArr2[(i10 - nVar.f19944a) - 1];
                            Object[] objArr7 = {nVar, nVar};
                            Object objA3 = o.d.d.a(-202660535);
                            if (objA3 == null) {
                                int longPressTimeout = 522 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 12;
                                byte b6 = (byte) ((-1) - (((-1) - $$d) | ((-1) - 1)));
                                byte b7 = (byte) (b6 - 1);
                                objA3 = o.d.d.a(longPressTimeout, cLastIndexOf, iKeyCodeFromString, 627984172, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objA3).invoke(null, objArr7);
                        }
                        cArr2 = cArr4;
                    }
                    String str3 = new String(cArr2);
                    int i17 = $10 + 23;
                    $11 = i17 % 128;
                    int i18 = i17 % 2;
                    objArr4[0] = str3;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:5:0x0016). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static void k(int r9, byte r10, byte r11, java.lang.Object[] r12) {
                    /*
                        int r0 = r11 * 2
                        int r8 = r0 + 1
                        int r0 = r9 * 4
                        int r0 = r0 + 100
                        byte[] r7 = o.er.l.AnonymousClass2.$$a
                        int r1 = r10 * 4
                        int r6 = r1 + 4
                        byte[] r5 = new byte[r8]
                        r4 = 0
                        if (r7 != 0) goto L31
                        r1 = r6
                        r2 = r8
                        r3 = r4
                    L16:
                        int r0 = -r2
                        int r6 = r6 + r0
                        int r1 = r1 + 1
                        r2 = r3
                        r0 = r6
                        r6 = r1
                    L1d:
                        int r3 = r2 + 1
                        byte r1 = (byte) r0
                        r5[r2] = r1
                        if (r3 != r8) goto L2c
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r5, r4)
                        r12[r4] = r0
                        return
                    L2c:
                        r2 = r7[r6]
                        r1 = r6
                        r6 = r0
                        goto L16
                    L31:
                        r2 = r4
                        goto L1d
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.er.l.AnonymousClass2.k(int, byte, byte, java.lang.Object[]):void");
                }

                @Override // fr.antelop.sdk.util.OperationCallback
                public void onError(AntelopError antelopError) {
                    int i10 = 2 % 2;
                    int i11 = f25036a + 75;
                    f25037b = i11 % 128;
                    if (i11 % 2 != 0) {
                        operationCallback.onError(antelopError);
                        int i12 = 98 / 0;
                    } else {
                        operationCallback.onError(antelopError);
                    }
                    int i13 = f25036a + 33;
                    f25037b = i13 % 128;
                    int i14 = i13 % 2;
                }

                @Override // fr.antelop.sdk.util.OperationCallback
                public /* synthetic */ void onSuccess(List<o> list) {
                    int i10 = 2 % 2;
                    int i11 = f25036a + 59;
                    f25037b = i11 % 128;
                    int i12 = i11 % 2;
                    b(list);
                    int i13 = f25037b + 15;
                    f25036a = i13 % 128;
                    if (i13 % 2 != 0) {
                        return;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            });
            int i10 = f25033c + 107;
            f25034e = i10 % 128;
            int i11 = i10 % 2;
            return;
        }
        WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.WrongState;
        Object[] objArr4 = new Object[1];
        f(16 - TextUtils.lastIndexOf("", '0'), "\uffdf\b\u0005\uffff\u0007\ufff0\u000b￬�\u0015\uffef\u0001\u000e\u0012\u0005\uffff\u0001", false, 154 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 16, objArr4);
        throw new WalletValidationException(walletValidationErrorCode2, ((String) objArr4[0]).intern());
    }

    public final void b(OperationCallback<Void> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25033c + 93;
        f25034e = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f25009a};
        int i5 = o.ep.d.f24461m * (-222457364);
        o.ep.d.f24461m = i5;
        int i6 = o.ep.d.f24462n * 325900588;
        o.ep.d.f24462n = i6;
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i7 = o.ep.d.f24460l * 323941697;
        o.ep.d.f24460l = i7;
        if (((CardStatus) o.ep.d.e(1555433584, -1555433578, objArr, i6, iElapsedRealtime, i7, i5)) != CardStatus.Active) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr2 = new Object[1];
            f((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4, "\u0006￥\u0003\u0014", false, 146 - ImageFormat.getBitsPerPixel(0), View.MeasureSpec.getSize(0) + 1, objArr2);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr2[0]).intern());
        }
        if (!c()) {
            WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.WrongState;
            Object[] objArr3 = new Object[1];
            f((KeyEvent.getMaxKeyCode() >> 16) + 17, "\uffdf\b\u0005\uffff\u0007\ufff0\u000b￬�\u0015\uffef\u0001\u000e\u0012\u0005\uffff\u0001", false, TextUtils.indexOf("", "") + 153, (ViewConfiguration.getWindowTouchSlop() >> 8) + 17, objArr3);
            throw new WalletValidationException(walletValidationErrorCode2, ((String) objArr3[0]).intern());
        }
        Object[] objArr4 = {this.f25035d, this.f25009a.b(), operationCallback};
        int i8 = (int) Runtime.getRuntime().totalMemory();
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int id = (int) Thread.currentThread().getId();
        int i9 = o.aa.b.f19961l * 1270056971;
        o.aa.b.f19961l = i9;
        o.aa.b.a(objArr4, i8, 2108498235, id, elapsedCpuTime, -2108498234, i9);
        int i10 = f25034e + 1;
        f25033c = i10 % 128;
        int i11 = i10 % 2;
    }

    public final void b(k kVar, o oVar, n nVar, final OperationCallback<m> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        this.f25035d.c(kVar, Collections.singletonList(oVar), nVar, new OperationCallback<List<m>>() { // from class: o.er.l.4

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f25053b = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f25054c = 0;

            private void e(List<m> list) {
                int i3 = 2 % 2;
                int i4 = f25054c;
                int i5 = ((i4 + 53) - (53 | i4)) + ((-1) - (((-1) - i4) & ((-1) - 53)));
                f25053b = i5 % 128;
                int i6 = i5 % 2;
                if (!list.isEmpty()) {
                    operationCallback.onSuccess(list.get(0));
                    int i7 = f25054c;
                    int i8 = (i7 ^ 23) + ((i7 & 23) << 1);
                    f25053b = i8 % 128;
                    int i9 = i8 % 2;
                    return;
                }
                int i10 = f25054c;
                int i11 = (i10 ^ 15) + ((i10 & 15) << 1);
                f25053b = i11 % 128;
                int i12 = i11 % 2;
                operationCallback.onSuccess(null);
                int i13 = f25054c;
                int i14 = (i13 ^ 83) + (((-1) - (((-1) - i13) | ((-1) - 83))) << 1);
                f25053b = i14 % 128;
                int i15 = i14 % 2;
            }

            @Override // fr.antelop.sdk.util.OperationCallback
            public final void onError(AntelopError antelopError) {
                int i3 = 2 % 2;
                int i4 = f25054c + 17;
                f25053b = i4 % 128;
                int i5 = i4 % 2;
                operationCallback.onError(antelopError);
                int i6 = f25053b;
                int i7 = (i6 ^ 19) + ((i6 & 19) << 1);
                f25054c = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 3 / 0;
                }
            }

            @Override // fr.antelop.sdk.util.OperationCallback
            public final /* synthetic */ void onSuccess(List<m> list) {
                int i3 = 2 % 2;
                int i4 = f25053b;
                int i5 = ((i4 + 41) - (41 | i4)) + ((-1) - (((-1) - i4) & ((-1) - 41)));
                f25054c = i5 % 128;
                int i6 = i5 % 2;
                e(list);
                if (i6 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i3 = f25034e + 85;
        f25033c = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // o.er.h
    public final /* bridge */ /* synthetic */ boolean c() {
        int i2 = 2 % 2;
        int i3 = f25033c + 67;
        f25034e = i3 % 128;
        int i4 = i3 % 2;
        boolean zC = super.c();
        if (i4 != 0) {
            int i5 = 55 / 0;
        }
        return zC;
    }

    public final o e(String str, o.e eVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25033c + 47;
        f25034e = i3 % 128;
        if (i3 % 2 != 0) {
            c();
            throw null;
        }
        if (!c()) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr = new Object[1];
            f(16 - MotionEvent.axisFromString(""), "\uffdf\b\u0005\uffff\u0007\ufff0\u000b￬�\u0015\uffef\u0001\u000e\u0012\u0005\uffff\u0001", false, Color.blue(0) + 153, 18 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr[0]).intern());
        }
        Object[] objArr2 = {this.f25009a};
        int i4 = o.ep.d.f24461m * (-222457364);
        o.ep.d.f24461m = i4;
        int i5 = o.ep.d.f24462n * 325900588;
        o.ep.d.f24462n = i5;
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i6 = o.ep.d.f24460l * 323941697;
        o.ep.d.f24460l = i6;
        if (((CardStatus) o.ep.d.e(1555433584, -1555433578, objArr2, i5, iElapsedRealtime, i6, i4)) != CardStatus.Active) {
            WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.WrongState;
            Object[] objArr3 = new Object[1];
            f(Process.getGidForName("") + 5, "\u0006￥\u0003\u0014", false, 147 - (ViewConfiguration.getPressedStateDuration() >> 16), 1 - KeyEvent.normalizeMetaState(0), objArr3);
            throw new WalletValidationException(walletValidationErrorCode2, ((String) objArr3[0]).intern());
        }
        o oVar = new o(this.f25009a.b(), str, eVar);
        int i7 = f25033c + 59;
        f25034e = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 68 / 0;
        }
        return oVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0069, code lost:
    
        if (c() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006c, code lost:
    
        r2 = fr.antelop.sdk.exception.WalletValidationErrorCode.WrongState;
        r11 = new java.lang.Object[1];
        f(android.view.View.combineMeasuredStates(0, 0) + 4, "\u0006￥\u0003\u0014", false, android.text.TextUtils.getOffsetAfter("", 0) + 147, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 1, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0097, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(r2, ((java.lang.String) r11[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0098, code lost:
    
        r2 = fr.antelop.sdk.exception.WalletValidationErrorCode.WrongState;
        r14 = new java.lang.Object[1];
        f((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 17, "\uffdf\b\u0005\uffff\u0007\ufff0\u000b￬�\u0015\uffef\u0001\u000e\u0012\u0005\uffff\u0001", false, android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0) + 154, (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 16, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ca, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(r2, ((java.lang.String) r14[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (c() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        r9 = new java.lang.Object[]{r15.f25009a};
        r13 = o.ep.d.f24461m * (-222457364);
        o.ep.d.f24461m = r13;
        r10 = o.ep.d.f24462n * 325900588;
        o.ep.d.f24462n = r10;
        r11 = (int) android.os.SystemClock.elapsedRealtime();
        r12 = o.ep.d.f24460l * 323941697;
        o.ep.d.f24460l = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004d, code lost:
    
        if (((fr.antelop.sdk.card.CardStatus) o.ep.d.e(1555433584, -1555433578, r9, r10, r11, r12, r13)) != fr.antelop.sdk.card.CardStatus.Active) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004f, code lost:
    
        r15.f25035d.a(new o.er.l.AnonymousClass3(r15));
        r1 = o.er.l.f25033c + 109;
        o.er.l.f25034e = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0064, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(final fr.antelop.sdk.util.OperationCallback<o.er.o> r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.er.l.e(fr.antelop.sdk.util.OperationCallback):void");
    }

    @Override // o.er.h
    public final c[] h() {
        c[] cVarArr;
        int i2 = 2 % 2;
        int i3 = f25034e + 39;
        f25033c = i3 % 128;
        if (i3 % 2 == 0) {
            cVarArr = new c[0];
            cVarArr[0] = this.f25010g.o();
        } else {
            cVarArr = new c[]{this.f25010g.o()};
        }
        int i4 = f25034e + 89;
        f25033c = i4 % 128;
        int i5 = i4 % 2;
        return cVarArr;
    }
}
