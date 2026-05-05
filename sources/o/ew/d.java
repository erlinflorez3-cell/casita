package o.ew;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Date;
import o.a.f;
import o.a.n;
import o.cv.c;
import o.fe.e;
import o.ff.a;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends o.eu.d<e> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: f */
    public static int f25512f = 0;

    /* JADX INFO: renamed from: g */
    public static int f25513g = 0;

    /* JADX INFO: renamed from: h */
    public static int f25514h = 0;

    /* JADX INFO: renamed from: j */
    public static int f25515j = 0;

    /* JADX INFO: renamed from: k */
    public static int f25516k = 0;

    /* JADX INFO: renamed from: l */
    public static int f25517l = 0;

    /* JADX INFO: renamed from: m */
    private static int f25518m = 0;

    /* JADX INFO: renamed from: n */
    private static char[] f25519n = null;

    /* JADX INFO: renamed from: p */
    private static boolean f25520p = false;

    /* JADX INFO: renamed from: q */
    private static int f25521q = 0;

    /* JADX INFO: renamed from: r */
    private static boolean f25522r = false;

    /* JADX INFO: renamed from: s */
    private static int f25523s = 0;

    /* JADX INFO: renamed from: t */
    private static int f25524t = 0;

    /* JADX INFO: renamed from: v */
    private static int f25525v = 0;

    /* JADX INFO: renamed from: w */
    private static int f25526w = 0;

    /* JADX INFO: renamed from: o */
    private int f25527o;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0029 -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(int r9, byte r10, short r11) {
        /*
            int r8 = r11 * 3
            int r1 = r8 + 1
            byte[] r7 = o.ew.d.$$d
            int r0 = r9 * 2
            int r6 = r0 + 67
            int r0 = r10 * 3
            int r0 = 3 - r0
            byte[] r5 = new byte[r1]
            r4 = 0
            if (r7 != 0) goto L2c
            r1 = r0
            r6 = r8
            r3 = r4
        L16:
            int r0 = -r0
            int r6 = r6 + r0
            r0 = r1
            r2 = r3
        L1a:
            int r1 = r0 + 1
            byte r0 = (byte) r6
            r5[r2] = r0
            int r3 = r2 + 1
            if (r2 != r8) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L29:
            r0 = r7[r1]
            goto L16
        L2c:
            r2 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ew.d.$$j(int, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f25516k = 904065567;
        f25517l = -1209224700;
        f25515j = 1569813067;
        f25513g = -1897816248;
        f25514h = 1675935578;
        f25512f = 1783691692;
        f25525v = 0;
        f25526w = 1;
        f25521q = 0;
        f25524t = 1;
        p();
        TextUtils.lastIndexOf("", '0', 0);
        int i2 = f25525v + 61;
        f25526w = i2 % 128;
        int i3 = i2 % 2;
    }

    public d(String str, String str2, boolean z2) {
        super(str, str2, z2);
        this.f25527o = 1;
    }

    private static /* synthetic */ Object a(Object[] objArr) throws Throwable {
        d dVar = (d) objArr[0];
        a aVar = (a) objArr[2];
        int i2 = 2 % 2;
        int i3 = f25521q + 123;
        f25524t = i3 % 128;
        int i4 = i3 % 2;
        boolean zB = dVar.b((e) aVar);
        if (i4 == 0) {
            int i5 = 15 / 0;
        }
        return Boolean.valueOf(zB);
    }

    public static /* synthetic */ Object b(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i4;
        int i9 = ~((i8 + i5) - (i8 & i5));
        int i10 = ~i5;
        int i11 = ~((i10 + i2) - (i10 & i2));
        int i12 = (-1) - (((-1) - i11) & ((-1) - i9));
        int i13 = i11 | (~((-1) - (((-1) - (~i2)) & ((-1) - i5))));
        int i14 = i5 + i2 + i7 + (762724209 * i6) + (1201824936 * i3);
        int i15 = i14 * i14;
        int i16 = ((-126223985) * i5) + 43253760 + (1339426419 * i2) + ((-1465650404) * i9) + (1465650404 * i12) + (1414658446 * i13) + ((-1540882432) * i7) + (1302855680 * i6) + (1514143744 * i3) + (1905524736 * i15);
        int i17 = ((i5 * 162561953) - 555857873) + (i2 * 162559997) + (i9 * 1956) + (i12 * (-1956)) + (i13 * 978) + (i7 * 162560975) + (i6 * 701011807) + (i3 * 237771736) + (i15 * (-223608832));
        return i16 + ((i17 * i17) * 703332352) != 1 ? a(objArr) : b(objArr);
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = f25521q + 91;
        f25524t = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean b(o.fe.e r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ew.d.b(o.fe.e):boolean");
    }

    static void init$0() {
        $$d = new byte[]{73, 44, MessagePack.Code.UINT64, -90};
        $$e = 172;
    }

    static void p() {
        f25519n = new char[]{2465, 2438, 2457, 2475, 2456, 2160, 2444, 2436, 2445, 2167, 2478, 2470, 2442, 2432, 2441, 2434, 2523, 2508, 2165, 2488, 2443, 2464, 2439, 2481, 2500, 2166, 2446, 2437, 2435, 2162, 2164, 2447, 2163, 2471, 2454, 2477, 2452, 2455, 2469};
        f25518m = 2040400379;
        f25520p = true;
        f25522r = true;
        f25523s = -1270219395;
    }

    private static b t() {
        int i2 = 2 % 2;
        b bVar = new b();
        int i3 = f25521q + 121;
        f25524t = i3 % 128;
        int i4 = i3 % 2;
        return bVar;
    }

    private static void u(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        String str3 = str;
        String str4 = str2;
        int i3 = 2 % 2;
        Object bytes = str4;
        if (str4 != null) {
            bytes = str4.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object obj = null;
        Object charArray = str3;
        if (str3 != null) {
            int i4 = $11 + 117;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                str3.toCharArray();
                obj.hashCode();
                throw null;
            }
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        f fVar = new f();
        char[] cArr2 = f25519n;
        float f2 = 0.0f;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objA = o.d.d.a(1618406102);
                    if (objA == null) {
                        int iMakeMeasureSpec = 593 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 13181);
                        int i6 = (AudioTrack.getMinVolume() > f2 ? 1 : (AudioTrack.getMinVolume() == f2 ? 0 : -1)) + 11;
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(iMakeMeasureSpec, minimumFlingVelocity, i6, -1225586509, false, $$j(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i5++;
                    f2 = 0.0f;
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
        Object[] objArr3 = {Integer.valueOf(f25518m)};
        Object objA2 = o.d.d.a(-1503702982);
        if (objA2 == null) {
            objA2 = o.d.d.a(32 - (Process.myTid() >> 22), (char) Color.red(0), View.resolveSize(0, 0) + 11, 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        if (f25522r) {
            fVar.f19923e = bArr.length;
            char[] cArr4 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr4 = {fVar, fVar};
                Object objA3 = o.d.d.a(1540807955);
                if (objA3 == null) {
                    byte b4 = (byte) 3;
                    byte b5 = (byte) (b4 - 3);
                    objA3 = o.d.d.a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 457, (char) View.resolveSizeAndState(0, 0, 0), 11 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1923924106, false, $$j(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            String str5 = new String(cArr4);
            int i7 = $11 + 43;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            objArr[0] = str5;
            return;
        }
        if (!f25520p) {
            fVar.f19923e = iArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            int i8 = $10 + 121;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            while (fVar.f19922a < fVar.f19923e) {
                cArr5[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                fVar.f19922a++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i10 = $11 + 3;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        fVar.f19923e = cArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        fVar.f19922a = 0;
        while (fVar.f19922a < fVar.f19923e) {
            cArr6[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
            Object[] objArr5 = {fVar, fVar};
            Object objA4 = o.d.d.a(1540807955);
            if (objA4 == null) {
                byte b6 = (byte) 3;
                byte b7 = (byte) (b6 - 3);
                objA4 = o.d.d.a(Color.red(0) + 458, (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 11, -1923924106, false, $$j(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    private static c v() {
        int i2 = 2 % 2;
        c cVar = new c();
        int i3 = f25524t + 83;
        f25521q = i3 % 128;
        int i4 = i3 % 2;
        return cVar;
    }

    private static void x(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i5 = 2 % 2;
        int i6 = $10 + 5;
        int i7 = i6 % 128;
        $11 = i7;
        int i8 = i6 % 2;
        if (str2 != null) {
            int i9 = i7 + 27;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = (char[]) charArray;
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i11 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i11]), Integer.valueOf(f25523s)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 270, (char) (ViewConfiguration.getLongPressTimeout() >> 16), 11 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -2071844881, false, $$j((byte) 24, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i11] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = o.d.d.a(522 - TextUtils.getOffsetBefore("", 0), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (Process.myPid() >> 22) + 12, 627984172, false, $$j((byte) 23, b3, b3), new Class[]{Object.class, Object.class});
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
            int i12 = $11 + 3;
            $10 = i12 % 128;
            int i13 = i12 % 2;
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
                    objA3 = o.d.d.a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 522, (char) KeyEvent.getDeadChar(0, 0), ExpandableListView.getPackedPositionType(0L) + 12, 627984172, false, $$j((byte) 23, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                int i14 = $10 + 47;
                $11 = i14 % 128;
                int i15 = i14 % 2;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    @Override // o.eu.d
    public final /* synthetic */ boolean a(Context context, a aVar) {
        int i2 = f25512f * 1348018671;
        f25512f = i2;
        int i3 = f25514h * 716010532;
        f25514h = i3;
        int iActiveCount = Thread.activeCount();
        int i4 = f25513g * 738046164;
        f25513g = i4;
        return ((Boolean) b(769642059, new Object[]{this, context, aVar}, i4, i2, -769642059, iActiveCount, i3)).booleanValue();
    }

    @Override // o.eu.d
    public final o.ef.a b(o.ek.e eVar) throws Throwable {
        e eVar2;
        o.ef.c cVarA;
        int i2 = 2 % 2;
        o.ef.a aVar = new o.ef.a();
        Object[] objArr = new Object[1];
        u((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 126, null, null, "\u0097\u0096\u0088 \u008e\u009c\u008d\u008f\u0084\u0097\u008f\u0085\u0082", objArr);
        aVar.a(((String) objArr[0]).intern(), (Object) a(eVar));
        Object[] objArr2 = new Object[1];
        x(1 - TextUtils.lastIndexOf("", '0', 0, 0), "\ufffe\u0003", true, 204 - ExpandableListView.getPackedPositionGroup(0L), 1 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr2);
        aVar.a(((String) objArr2[0]).intern(), (Object) c());
        if (g() != null && i() != null) {
            int i3 = f25521q + 115;
            f25524t = i3 % 128;
            if (i3 % 2 != 0 ? (eVar2 = g().get(0)) == null : (eVar2 = g().get(0)) == null) {
                cVarA = null;
            } else {
                cVarA = eVar2.a(this.f25527o);
                int i4 = f25521q + 51;
                f25524t = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 5 / 3;
                }
            }
            Object[] objArr3 = new Object[1];
            u(127 - TextUtils.getOffsetAfter("", 0), null, null, "\u009a \u0085\u008e\u008a\u0089\u0088\u0097\u0088\u008f\u0082", objArr3);
            aVar.a(((String) objArr3[0]).intern(), cVarA);
            Object[] objArr4 = new Object[1];
            x(16 - KeyEvent.normalizeMetaState(0), "\u000e\uffff￭\r\u0006\ufffb\u0003\u000e\b\uffff\ufffe\uffff\f�\ufffe￣", true, 204 - ExpandableListView.getPackedPositionType(0L), 14 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr4);
            String strIntern = ((String) objArr4[0]).intern();
            Object[] objArr5 = {i()};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            o.fn.c.f26114e = o.fn.c.f26114e * 1488666621;
            o.fn.c.f26111b = o.fn.c.f26111b * (-93354780);
            o.fn.c.f26113d = o.fn.c.f26113d * (-729426029);
            aVar.a(strIntern, o.fn.c.b(objArr5, r13, 1651825128, iUptimeMillis, r16, r17, -1651825128));
            Date dateD = i().d();
            if (dateD != null) {
                int i6 = f25524t + 45;
                f25521q = i6 % 128;
                int i7 = i6 % 2;
                Object[] objArr6 = new Object[1];
                u((ViewConfiguration.getFadingEdgeLength() >> 16) + 127, null, null, "\u0088\u008a\u0085¢\u0086\u008f\u008e\u0095¡\u0088", objArr6);
                aVar.c(((String) objArr6[0]).intern(), dateD.getTime() / 1000);
            }
        }
        if (o.ea.f.a()) {
            Object[] objArr7 = new Object[1];
            u((ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, null, null, "\u008f\u0088\u0089\u008e\u0085\u008a\u0089\u008d\u008c\u0086\u0088\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr7);
            String strIntern2 = ((String) objArr7[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr8 = new Object[1];
            u((ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, null, null, "\u0091\u0098\u0091\u008a\u009f\u0095\u008a\u009f\u008d\u0091\u0092\u0091\u009a\u009f\u008a\u0085\u008a£\u008a\u0089\u008e\u008f\u0095", objArr8);
            o.ea.f.c(strIntern2, sb.append(((String) objArr8[0]).intern()).append(aVar.e()).toString());
        }
        int i8 = f25521q + 75;
        f25524t = i8 % 128;
        if (i8 % 2 != 0) {
            return aVar;
        }
        throw null;
    }

    @Override // o.eu.d
    public final void b() {
        int i2 = f25515j * 1942903963;
        f25515j = i2;
        int i3 = f25517l * 1415033534;
        f25517l = i3;
        int i4 = f25516k * (-439473071);
        f25516k = i4;
        b(1402734027, new Object[]{this}, Thread.activeCount(), i2, -1402734026, i4, i3);
    }

    @Override // o.eu.d
    public final /* synthetic */ o.eu.a d() {
        int i2 = 2 % 2;
        int i3 = f25524t + 125;
        f25521q = i3 % 128;
        int i4 = i3 % 2;
        b bVarT = t();
        int i5 = f25524t + 117;
        f25521q = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 10 / 0;
        }
        return bVarT;
    }

    @Override // o.eu.d
    public final /* synthetic */ o.cr.d e() {
        int i2 = 2 % 2;
        int i3 = f25521q + 65;
        f25524t = i3 % 128;
        if (i3 % 2 == 0) {
            v();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        c cVarV = v();
        int i4 = f25521q + 117;
        f25524t = i4 % 128;
        int i5 = i4 % 2;
        return cVarV;
    }

    final void e(int i2) {
        int i3 = 2 % 2;
        int i4 = f25524t;
        int i5 = i4 + 11;
        f25521q = i5 % 128;
        int i6 = i5 % 2;
        this.f25527o = i2;
        int i7 = i4 + 109;
        f25521q = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // o.eu.d
    public final o.ff.e m() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25524t + 117;
        f25521q = i3 % 128;
        int i4 = i3 % 2;
        if (g() != null) {
            int i5 = f25521q + 97;
            f25524t = i5 % 128;
            int i6 = i5 % 2;
            if (g().get(0) != null) {
                if (i() == null) {
                    if (o.ea.f.a()) {
                        Object[] objArr = new Object[1];
                        u(TextUtils.lastIndexOf("", '0', 0, 0) + 128, null, null, "\u008f\u0088\u0089\u008e\u0085\u008a\u0089\u008d\u008c\u0086\u0088\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
                        String strIntern = ((String) objArr[0]).intern();
                        StringBuilder sb = new StringBuilder();
                        Object[] objArr2 = new Object[1];
                        u((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 126, null, null, "\u0091\u0098\u0091\u0089\u008d\u008e\u008a\u0085\u0082\u008e \u0095\u0095\u0085\u0091\u0092\u0091\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u008f\u008d§\u0088\u009a¥\u008d¦\u0086\u0088\u008b\u0088\u009a¥\u0088 \u0090\u0089\u008e£\u008a¡\u0088¤\u008a\u0088\u0090", objArr2);
                        StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern()).append(c());
                        Object[] objArr3 = new Object[1];
                        u(Color.rgb(0, 0, 0) + 16777343, null, null, "\u008a\u0088\u009a\u0091\u009a\u008f\u0088\u008a\u0088\u0087\u0085\u008f\u0085\u0095\u0091\u0086\u0088\u009b\u0091\u008d\u0089\u0091\u009a\u0085\u009d\u0091", objArr3);
                        o.ea.f.c(strIntern, sbAppend.append(((String) objArr3[0]).intern()).toString());
                    }
                    int i7 = f25521q + 59;
                    f25524t = i7 % 128;
                    int i8 = i7 % 2;
                    return null;
                }
                Date dateD = i().d();
                if (dateD == null || !dateD.before(new Date())) {
                    o.ff.e eVarC = g().get(0).c(this.f25527o);
                    int i9 = f25521q + 43;
                    f25524t = i9 % 128;
                    int i10 = i9 % 2;
                    return eVarC;
                }
                if (o.ea.f.a()) {
                    Object[] objArr4 = new Object[1];
                    u(127 - (ViewConfiguration.getScrollDefaultDelay() >> 16), null, null, "\u008f\u0088\u0089\u008e\u0085\u008a\u0089\u008d\u008c\u0086\u0088\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr4);
                    String strIntern2 = ((String) objArr4[0]).intern();
                    StringBuilder sb2 = new StringBuilder();
                    Object[] objArr5 = new Object[1];
                    u((ViewConfiguration.getJumpTapTimeout() >> 16) + 127, null, null, "\u0091\u0098\u0091\u0089\u008d\u008e\u008a\u0085\u0082\u008e \u0095\u0095\u0085\u0091\u0092\u0091\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u008f\u008d§\u0088\u009a¥\u008d¦\u0086\u0088\u008b\u0088\u009a¥\u0088 \u0090\u0089\u008e£\u008a¡\u0088¤\u008a\u0088\u0090", objArr5);
                    StringBuilder sbAppend2 = sb2.append(((String) objArr5[0]).intern()).append(c());
                    Object[] objArr6 = new Object[1];
                    u(TextUtils.getOffsetBefore("", 0) + 127, null, null, "\u008a\u0088\u009a\u0091\u0086\u0088\u009b\u0091\u0097\u0088\u008f\u008e\u0095¡\u0088\u0091\u0089\u0085\u0091\u009a\u0085\u009d\u0091", objArr6);
                    o.ea.f.c(strIntern2, sbAppend2.append(((String) objArr6[0]).intern()).toString());
                }
                return null;
            }
        }
        if (o.ea.f.a()) {
            Object[] objArr7 = new Object[1];
            u(MotionEvent.axisFromString("") + 128, null, null, "\u008f\u0088\u0089\u008e\u0085\u008a\u0089\u008d\u008c\u0086\u0088\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr7);
            String strIntern3 = ((String) objArr7[0]).intern();
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr8 = new Object[1];
            u(175 - AndroidCharacter.getMirror('0'), null, null, "\u0091\u0098\u0091\u0089\u008d\u008e\u008a\u0085\u0082\u008e \u0095\u0095\u0085\u0091\u0092\u0091\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u008f\u008d§\u0088\u009a¥\u008d¦\u0086\u0088\u008b\u0088\u009a¥\u0088 \u0090\u0089\u008e£\u008a¡\u0088¤\u008a\u0088\u0090", objArr8);
            StringBuilder sbAppend3 = sb3.append(((String) objArr8[0]).intern()).append(c());
            Object[] objArr9 = new Object[1];
            x(17 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), "\u0014ￅ\u000b\u0017\n\u0018\rￅ\u0010\n\u001e\u0018ￅ\r\u0006\u0018ￅ\u0013", false, 193 - View.MeasureSpec.getSize(0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 12, objArr9);
            o.ea.f.c(strIntern3, sbAppend3.append(((String) objArr9[0]).intern()).toString());
        }
        return null;
    }

    final int s() {
        int i2 = 2 % 2;
        int i3 = f25521q + 103;
        f25524t = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.f25527o;
        if (i4 == 0) {
            int i6 = 20 / 0;
        }
        return i5;
    }
}
