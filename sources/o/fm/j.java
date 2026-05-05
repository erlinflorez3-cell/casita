package o.fm;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethod;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethodType;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethodUsage;
import fr.antelop.sdk.settings.TransactionStartCondition;
import fr.antelop.sdk.settings.WalletSettingsRights;
import fr.antelop.sdk.settings.WalletSettingsValue;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import o.a.l;
import o.ea.f;
import o.ea.m;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends e<j> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b */
    public static int f26096b = 0;

    /* JADX INFO: renamed from: i */
    private static int[] f26097i = null;

    /* JADX INFO: renamed from: k */
    private static int f26098k = 0;

    /* JADX INFO: renamed from: l */
    private static int f26099l = 0;

    /* JADX INFO: renamed from: m */
    private static int f26100m = 0;

    /* JADX INFO: renamed from: n */
    private static int f26101n = 0;

    /* JADX INFO: renamed from: a */
    private boolean f26102a;

    /* JADX INFO: renamed from: c */
    private boolean f26103c;

    /* JADX INFO: renamed from: d */
    private final o.m.c f26104d;

    /* JADX INFO: renamed from: e */
    private boolean f26105e;

    /* JADX INFO: renamed from: f */
    private o.du.h f26106f;

    /* JADX INFO: renamed from: g */
    private int f26107g;

    /* JADX INFO: renamed from: h */
    private o.du.b f26108h;

    /* JADX INFO: renamed from: j */
    private boolean f26109j;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r8, short r9, int r10) {
        /*
            int r0 = r8 * 2
            int r8 = 3 - r0
            byte[] r7 = o.fm.j.$$a
            int r0 = r10 * 3
            int r6 = r0 + 1
            int r0 = r9 * 2
            int r5 = r0 + 117
            byte[] r4 = new byte[r6]
            r3 = 0
            if (r7 != 0) goto L2a
            r0 = r5
            r5 = r6
            r2 = r3
        L16:
            int r5 = r5 + r0
            r1 = r2
        L18:
            byte r0 = (byte) r5
            int r2 = r1 + 1
            r4[r1] = r0
            if (r2 != r6) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L25:
            int r8 = r8 + 1
            r0 = r7[r8]
            goto L16
        L2a:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fm.j.$$c(int, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26096b = -1438639477;
        f26099l = 0;
        f26101n = 1;
        f26098k = 0;
        f26100m = 1;
        g();
        ExpandableListView.getPackedPositionChild(0L);
        ViewConfiguration.getTapTimeout();
        ViewConfiguration.getMinimumFlingVelocity();
        int i2 = f26099l + 93;
        f26101n = i2 % 128;
        int i3 = i2 % 2;
    }

    j() {
        super(false);
        this.f26104d = o.m.c.d();
    }

    public j(boolean z2, boolean z3, boolean z4, boolean z5, o.du.h hVar, int i2) {
        super(true);
        this.f26104d = o.m.c.d();
        this.f26103c = z2;
        this.f26102a = z3;
        this.f26105e = z4;
        this.f26109j = z5;
        this.f26106f = hVar;
        this.f26108h = new o.du.b();
        o.du.b.e(hVar);
        this.f26107g = i2;
    }

    public static /* synthetic */ Object c(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) {
        int i8 = ~((-1) - (((-1) - i4) & ((-1) - i7)));
        int i9 = (-1) - (((-1) - (~i5)) & ((-1) - (~i7)));
        int i10 = (-1) - (((-1) - (~i9)) & ((-1) - i4));
        int i11 = ~((~i4) | i5);
        int i12 = ~((-1) - (((-1) - i7) & ((-1) - i5)));
        int i13 = (i12 + i11) - (i12 & i11);
        int i14 = ~(i9 | i4);
        int i15 = (i13 + i14) - (i13 & i14);
        int i16 = i5 + i4 + i2 + ((-101282902) * i6) + ((-829309908) * i3);
        int i17 = i16 * i16;
        int i18 = ((i5 * 42798203) - 224002048) + (42798203 * i4) + ((-1233194106) * i8) + (1828579084 * i10) + (1233194106 * i15) + ((-1190395904) * i2) + (1710751744 * i6) + ((-1643118592) * i3) + ((-1134166016) * i17);
        int i19 = (i5 * 1745018779) + 1790267665 + (i4 * 1745018779) + (i8 * (-58)) + (i10 * (-116)) + (i15 * 58) + (i2 * 1745018721) + (i6 * (-1587019414)) + (i3 * (-1871011668)) + (i17 * 1017511936);
        return i18 + ((i19 * i19) * (-1139146752)) != 1 ? c(objArr) : e(objArr);
    }

    private static /* synthetic */ Object c(Object[] objArr) throws Throwable {
        j jVar = (j) objArr[0];
        int i2 = 2 % 2;
        int i3 = f26098k + 13;
        f26100m = i3 % 128;
        TransactionStartCondition transactionStartConditionA = null;
        if (i3 % 2 == 0) {
            o.du.h.a(jVar.j());
            throw null;
        }
        transactionStartConditionA = o.du.h.a(jVar.j());
        int i4 = f26098k + 61;
        f26100m = i4 % 128;
        int i5 = i4 % 2;
        return new WalletSettingsValue(transactionStartConditionA, WalletSettingsRights.ReadOnly);
    }

    private static /* synthetic */ Object e(Object[] objArr) throws Throwable {
        String strIntern;
        Object obj;
        j jVar = (j) objArr[0];
        int i2 = 2 % 2;
        int i3 = f26100m + 29;
        f26098k = i3 % 128;
        if (i3 % 2 != 0) {
            f.a();
            throw null;
        }
        if (f.a()) {
            int i4 = f26098k + 73;
            f26100m = i4 % 128;
            if (i4 % 2 == 0) {
                Object[] objArr2 = new Object[1];
                o(new int[]{-270178621, -1370682739, 788403417, 449682330, 721426563, -891350000, -1523058612, 90350854}, (ViewConfiguration.getWindowTouchSlop() >>> 101) + 40, objArr2);
                strIntern = ((String) objArr2[0]).intern();
                Object[] objArr3 = new Object[1];
                o(new int[]{1071053056, 276222100, 1144156540, 2038664110, -1546625193, -579647229, 935842303, -1833139053}, 9 / TextUtils.getCapsMode("", 1, 1), objArr3);
                obj = objArr3[0];
            } else {
                Object[] objArr4 = new Object[1];
                o(new int[]{-270178621, -1370682739, 788403417, 449682330, 721426563, -891350000, -1523058612, 90350854}, 13 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr4);
                strIntern = ((String) objArr4[0]).intern();
                Object[] objArr5 = new Object[1];
                o(new int[]{1071053056, 276222100, 1144156540, 2038664110, -1546625193, -579647229, 935842303, -1833139053}, TextUtils.getCapsMode("", 0, 0) + 14, objArr5);
                obj = objArr5[0];
            }
            f.c(strIntern, ((String) obj).intern());
            int i5 = f26098k + 3;
            f26100m = i5 % 128;
            int i6 = i5 % 2;
        }
        Object[] objArr6 = {jVar.f26104d};
        int i7 = o.m.c.f26413a * (-29408498);
        o.m.c.f26413a = i7;
        int iMyPid = Process.myPid();
        int i8 = o.m.c.f26416d * 1758787202;
        o.m.c.f26416d = i8;
        o.m.c.d(Thread.activeCount(), i8, 754437089, -754437087, i7, iMyPid, objArr6);
        return null;
    }

    private Map<CustomerAuthenticationMethodType, CustomerAuthenticationMethod> f() throws Throwable {
        Object objD;
        int i2 = 2 % 2;
        int i3 = f26098k + 55;
        f26100m = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = new Object[1];
            o(new int[]{-2033686013, 1600413674, -181316888, -182023372, 381015153, 547258680, -90911904, 884207586, -2065099330, -1779631765, 1310834210, 1735187300, 1795069798, -1961881393}, ExpandableListView.getPackedPositionGroup(1L) + 24, objArr);
            c(((String) objArr[0]).intern());
            Object[] objArr2 = {this.f26104d};
            int i4 = o.m.c.f26414b * 1238623564;
            o.m.c.f26414b = i4;
            int i5 = o.m.c.f26415c * 616651361;
            o.m.c.f26415c = i5;
            int i6 = o.m.c.f26417e * 397457117;
            o.m.c.f26417e = i6;
            objD = o.m.c.d((int) Runtime.getRuntime().maxMemory(), i6, -830210895, 830210896, i4, i5, objArr2);
        } else {
            Object[] objArr3 = new Object[1];
            o(new int[]{-2033686013, 1600413674, -181316888, -182023372, 381015153, 547258680, -90911904, 884207586, -2065099330, -1779631765, 1310834210, 1735187300, 1795069798, -1961881393}, ExpandableListView.getPackedPositionGroup(0L) + 27, objArr3);
            c(((String) objArr3[0]).intern());
            Object[] objArr4 = {this.f26104d};
            int i7 = o.m.c.f26414b * 1238623564;
            o.m.c.f26414b = i7;
            int i8 = o.m.c.f26415c * 616651361;
            o.m.c.f26415c = i8;
            int i9 = o.m.c.f26417e * 397457117;
            o.m.c.f26417e = i9;
            objD = o.m.c.d((int) Runtime.getRuntime().maxMemory(), i9, -830210895, 830210896, i7, i8, objArr4);
        }
        return (Map) objD;
    }

    static void g() {
        f26097i = new int[]{132142551, -2003725128, -909088680, 1190081383, -1256703064, 1634206096, 655814366, 1546034146, 482149296, 2044097531, 293798145, 1174692504, 824331865, -1467863092, 896487691, -378292837, 1160110819, -1066258077};
    }

    private boolean h() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26098k + 31;
        f26100m = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        o(new int[]{-2033686013, 1600413674, -181316888, -182023372, 381015153, 547258680, -90911904, 884207586, -2065099330, -1779631765, 1310834210, 1735187300, 1795069798, -1961881393}, 27 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
        c(((String) objArr[0]).intern());
        boolean z2 = this.f26102a;
        int i5 = f26100m + 51;
        f26098k = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
        return z2;
    }

    static void init$0() {
        $$a = new byte[]{46, -113, 33, 42};
        $$b = 2;
    }

    private o.du.h j() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26098k + 85;
        f26100m = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        o(new int[]{-2033686013, 1600413674, -181316888, -182023372, 381015153, 547258680, -90911904, 884207586, -2065099330, -1779631765, 1310834210, 1735187300, 1795069798, -1961881393}, 26 - ExpandableListView.getPackedPositionChild(0L), objArr);
        c(((String) objArr[0]).intern());
        o.du.h hVarC = o.du.b.c();
        int i5 = f26100m + 63;
        f26098k = i5 % 128;
        int i6 = i5 % 2;
        return hVarC;
    }

    private static void o(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f26097i;
        int i5 = 989264422;
        long j2 = 0;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = $10 + 7;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + 11;
                $11 = i10 % 128;
                int i11 = i10 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i9])};
                    Object objA = o.d.d.a(i5);
                    if (objA == null) {
                        int i12 = 675 - (ExpandableListView.getPackedPositionForGroup(0) > j2 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j2 ? 0 : -1));
                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                        int packedPositionGroup = 12 - ExpandableListView.getPackedPositionGroup(j2);
                        int i13 = $$b;
                        byte b2 = (byte) i13;
                        objA = o.d.d.a(i12, cCombineMeasuredStates, packedPositionGroup, -328001469, false, $$c((byte) (i13 - 2), b2, (byte) (b2 - 2)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i9] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i9++;
                    int i14 = $11 + 121;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    i3 = 2;
                    i5 = 989264422;
                    j2 = 0;
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
        int[] iArr5 = f26097i;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i16 = 0;
            while (i16 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i16])};
                Object objA2 = o.d.d.a(989264422);
                if (objA2 == null) {
                    int offsetBefore = 675 - TextUtils.getOffsetBefore("", i6);
                    char c2 = (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                    int iArgb = Color.argb(i6, i6, i6, i6) + 12;
                    int i17 = $$b;
                    byte b3 = (byte) i17;
                    objA2 = o.d.d.a(offsetBefore, c2, iArgb, -328001469, false, $$c((byte) (i17 - 2), b3, (byte) (b3 - 2)), new Class[]{Integer.TYPE});
                }
                iArr6[i16] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                i16++;
                i6 = 0;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, i6, iArr4, i6, length2);
        lVar.f19941d = i6;
        while (lVar.f19941d < iArr.length) {
            cArr[i6] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            for (int i18 = 0; i18 < 16; i18++) {
                lVar.f19942e ^= iArr4[i18];
                Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA3 = o.d.d.a(2098218801);
                if (objA3 == null) {
                    int iArgb2 = 301 - Color.argb(0, 0, 0, 0);
                    char packedPositionType = (char) (52697 - ExpandableListView.getPackedPositionType(0L));
                    int iCombineMeasuredStates = 11 - View.combineMeasuredStates(0, 0);
                    byte b4 = (byte) ($$b - 2);
                    byte b5 = (byte) (b4 + 1);
                    objA3 = o.d.d.a(iArgb2, packedPositionType, iCombineMeasuredStates, -1416256172, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
            }
            int i19 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i19;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i20 = lVar.f19942e;
            int i21 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr4);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr5 = {lVar, lVar};
            Object objA4 = o.d.d.a(986820978);
            if (objA4 == null) {
                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 229;
                char bitsPerPixel = (char) (51003 - ImageFormat.getBitsPerPixel(0));
                int deadChar = KeyEvent.getDeadChar(0, 0) + 9;
                byte b6 = (byte) ($$b - 2);
                byte b7 = b6;
                objA4 = o.d.d.a(windowTouchSlop, bitsPerPixel, deadChar, -330018025, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            i6 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    public final WalletSettingsValue<TransactionStartCondition> a() {
        int i2 = f26096b * (-2102023267);
        f26096b = i2;
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        return (WalletSettingsValue) c(iUptimeMillis, Process.myPid(), 224860623, -224860623, iMaxMemory, new Object[]{this}, i2);
    }

    public final WalletSettingsValue<Map<CustomerAuthenticationMethodType, CustomerAuthenticationMethod>> b(CustomerAuthenticationMethodUsage... customerAuthenticationMethodUsageArr) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26100m + 37;
        f26098k = i3 % 128;
        Map<CustomerAuthenticationMethodType, CustomerAuthenticationMethod> map = null;
        if (i3 % 2 != 0) {
            f().entrySet().iterator();
            map.hashCode();
            throw null;
        }
        Map<CustomerAuthenticationMethodType, CustomerAuthenticationMethod> mapF = f();
        Iterator<Map.Entry<CustomerAuthenticationMethodType, CustomerAuthenticationMethod>> it = mapF.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<CustomerAuthenticationMethodUsage> it2 = it.next().getValue().getUsages().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    it.remove();
                    break;
                }
                if (m.c.e(it2.next(), customerAuthenticationMethodUsageArr)) {
                    int i4 = f26098k + 11;
                    f26100m = i4 % 128;
                    int i5 = i4 % 2;
                    break;
                }
                int i6 = f26098k + 31;
                f26100m = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 3 / 5;
                }
            }
        }
        map = mapF;
        return new WalletSettingsValue<>(map, WalletSettingsRights.ReadOnly);
    }

    final void c() {
        int iMyUid = Process.myUid();
        int iMyUid2 = Process.myUid();
        int iNextInt = new Random().nextInt(1449150955);
        c(iMyUid2, (int) SystemClock.elapsedRealtime(), 1186647806, -1186647805, iNextInt, new Object[]{this}, iMyUid);
    }

    public final boolean c(j jVar) {
        int i2 = 2 % 2;
        if (this.f26103c != jVar.f26103c) {
            return false;
        }
        int i3 = f26098k + 93;
        int i4 = i3 % 128;
        f26100m = i4;
        int i5 = i3 % 2;
        if (this.f26102a != jVar.f26102a) {
            return false;
        }
        int i6 = i4 + 55;
        f26098k = i6 % 128;
        if (i6 % 2 != 0) {
            boolean z2 = jVar.f26105e;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.f26105e != jVar.f26105e || this.f26109j != jVar.f26109j) {
            return false;
        }
        int i7 = i4 + 3;
        f26098k = i7 % 128;
        int i8 = i7 % 2;
        return this.f26106f == jVar.f26106f;
    }

    public final WalletSettingsValue<Map<CustomerAuthenticationMethodType, CustomerAuthenticationMethod>> d() throws Throwable {
        Map<CustomerAuthenticationMethodType, CustomerAuthenticationMethod> mapF;
        int i2 = 2 % 2;
        int i3 = f26100m + 125;
        f26098k = i3 % 128;
        int i4 = i3 % 2;
        try {
            mapF = f();
        } catch (o.en.j unused) {
            mapF = null;
        }
        WalletSettingsValue<Map<CustomerAuthenticationMethodType, CustomerAuthenticationMethod>> walletSettingsValue = new WalletSettingsValue<>(mapF, WalletSettingsRights.ReadOnly);
        int i5 = f26098k + 95;
        f26100m = i5 % 128;
        int i6 = i5 % 2;
        return walletSettingsValue;
    }

    public final WalletSettingsValue<Boolean> e() throws Throwable {
        boolean zH;
        int i2 = 2 % 2;
        int i3 = f26098k + 1;
        f26100m = i3 % 128;
        int i4 = i3 % 2;
        try {
            zH = h();
        } catch (o.en.j unused) {
            zH = false;
        }
        WalletSettingsValue<Boolean> walletSettingsValue = new WalletSettingsValue<>(Boolean.valueOf(zH), WalletSettingsRights.ReadOnly);
        int i5 = f26100m + 123;
        f26098k = i5 % 128;
        int i6 = i5 % 2;
        return walletSettingsValue;
    }

    final void e(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26098k + 39;
        f26100m = i3 % 128;
        if (i3 % 2 == 0) {
            f.a();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (f.a()) {
            int i4 = f26100m + 55;
            f26098k = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            o(new int[]{-270178621, -1370682739, 788403417, 449682330, 721426563, -891350000, -1523058612, 90350854}, 14 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            o(new int[]{1071053056, 276222100, 15390048, 1840923816, -1445963445, -2088059648, 2079710227, -1194612867}, 14 - ExpandableListView.getPackedPositionType(0L), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        this.f26104d.c(context);
    }

    final boolean e(o.ef.c cVar) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f26100m + 115;
        f26098k = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = new Object[1];
            o(new int[]{-2033686013, 1600413674, -181316888, -182023372, 381015153, 547258680, -90911904, 884207586, -2065099330, -1779631765, 1310834210, 1735187300, 1795069798, -1961881393}, TextUtils.getOffsetBefore("", 1) * 9, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            o(new int[]{-2033686013, 1600413674, -181316888, -182023372, 381015153, 547258680, -90911904, 884207586, -2065099330, -1779631765, 1310834210, 1735187300, 1795069798, -1961881393}, TextUtils.getOffsetBefore("", 0) + 27, objArr2);
            obj = objArr2[0];
        }
        c(((String) obj).intern());
        boolean zA = this.f26104d.a(cVar);
        int i4 = f26098k + 21;
        f26100m = i4 % 128;
        int i5 = i4 % 2;
        return zA;
    }
}
