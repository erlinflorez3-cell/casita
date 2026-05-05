package o.dg;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import fr.antelop.sdk.AntelopError;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethod;
import fr.antelop.sdk.transaction.TransactionDecision;
import fr.antelop.sdk.transaction.hce.HceTransaction;
import fr.antelop.sdk.transaction.hce.HceTransactionDeclineReason;
import fr.antelop.sdk.transaction.hce.HceTransactionStatus;
import fr.antelop.sdk.transaction.hce.HceTransactionStep;
import fr.antelop.sdk.transaction.hce.HceTransactionUnknownReason;
import fr.antelop.sdk.transaction.hce.WalletHceTransactionCallback;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import o.a.g;
import o.ea.f;
import o.ea.m;
import okio.Utf8;

/* JADX INFO: loaded from: classes6.dex */
abstract class c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char f22971b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f22972c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char f22973d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f22974e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f22975f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f22976g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f22977h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f22978j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WalletHceTransactionCallback f22979a;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0017). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r7, int r8, short r9) {
        /*
            int r2 = r8 * 3
            int r1 = 1 - r2
            int r0 = r7 * 3
            int r8 = 72 - r0
            int r0 = r9 * 3
            int r7 = 3 - r0
            byte[] r6 = o.dg.c.$$a
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r6 != 0) goto L2d
            r1 = r7
            r2 = r4
        L17:
            int r8 = r8 + r7
            r7 = r1
        L19:
            byte r0 = (byte) r8
            r5[r2] = r0
            if (r2 != r3) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L24:
            int r2 = r2 + 1
            int r1 = r7 + 1
            r0 = r6[r1]
            r7 = r8
            r8 = r0
            goto L17
        L2d:
            r2 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dg.c.$$c(int, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22976g = 0;
        f22978j = 1;
        f22975f = 0;
        f22977h = 1;
        c();
        TypedValue.complexToFloat(0);
        ExpandableListView.getPackedPositionForChild(0, 0);
        int i2 = f22978j + 123;
        f22976g = i2 % 128;
        int i3 = i2 % 2;
    }

    c(Context context) {
        this.f22979a = d(context);
    }

    private WalletHceTransactionCallback a() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f22975f;
        int i4 = i3 + 55;
        f22977h = i4 % 128;
        int i5 = i4 % 2;
        WalletHceTransactionCallback walletHceTransactionCallback = this.f22979a;
        if (walletHceTransactionCallback == null) {
            Object[] objArr = new Object[1];
            i("郷輌\udcf3\u17eb䠋薶㿔☦粱多༣ᢞ\uf0b0믟璦㒚\ue2d2舀\uec30癲濱\u2073噹徝急줮\u0e7d뱔䮮쌲뙒\ue6e6缉\ue095궇킸奬ؗ玠荵\u0f70\uea1d颊我柲戬Ⱕ幹춊컵", 49 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
            throw new RuntimeException(((String) objArr[0]).intern());
        }
        int i6 = i3 + 101;
        f22977h = i6 % 128;
        if (i6 % 2 != 0) {
            return walletHceTransactionCallback;
        }
        throw null;
    }

    static void c() {
        f22971b = (char) 26097;
        f22974e = (char) 13379;
        f22972c = (char) 34062;
        f22973d = (char) 62874;
    }

    private WalletHceTransactionCallback d(Context context) throws Throwable {
        int i2 = 2 % 2;
        try {
            Object[] objArr = new Object[1];
            i("㎟튜噺欅焆読ኣ貅㟖㌄⭐㲯⚖圹䠋薶㿔☦粱多༣ᢞ\uf0b0믟ꑙ팟处䫔\ud9f4ௐ⚖圹", 32 - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
            String strD = m.d(context, ((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            i("㎟튜噺欅焆読ኣ貅㟖㌄⭐㲯⚖圹䠋薶㿔☦粱多༣ᢞ\uf0b0믟ꑙ팟处䫔\ud9f4ௐ⚖圹", Drawable.resolveOpacity(0, 0) + 32, objArr2);
            WalletHceTransactionCallback walletHceTransactionCallback = (WalletHceTransactionCallback) m.d(WalletHceTransactionCallback.class, strD, ((String) objArr2[0]).intern());
            int i3 = f22975f + 71;
            f22977h = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 83 / 0;
            }
            return walletHceTransactionCallback;
        } catch (PackageManager.NameNotFoundException | RuntimeException e2) {
            if (f.a()) {
                Object[] objArr3 = new Object[1];
                i("訫ヌᵔ푙㨩\ueb42⚖圹䠋薶㿔☦粱多༣ᢞ\uf0b0믟˚᯳㕃䫐猉擘ᖘᩦ䅽❧꿼嶗", 30 - (ViewConfiguration.getScrollBarSize() >> 8), objArr3);
                f.d(((String) objArr3[0]).intern(), e2.getMessage());
            }
            WalletHceTransactionCallback walletHceTransactionCallback2 = new WalletHceTransactionCallback() { // from class: o.dg.c.3

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static int f22980a = 1849937545;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static int f22981b = -628990480;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static int f22982c = -838326993;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public static int f22983d = 1971673050;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public static int f22984e = 186949553;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private static int f22985g = 0;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static int f22986j = 1;

                public static /* synthetic */ Object a(int i5, int i6, int i7, Object[] objArr4, int i8, int i9, int i10) {
                    int i11 = ~i7;
                    int i12 = ~((-1) - (((-1) - i11) & ((-1) - i8)));
                    int i13 = ~i6;
                    int i14 = ~i8;
                    int i15 = ~((-1) - (((-1) - ((-1) - (((-1) - i13) & ((-1) - i14)))) & ((-1) - i7)));
                    int i16 = (i12 + i15) - (i12 & i15);
                    int i17 = ~((i14 + i11) - (i14 & i11));
                    int i18 = i13 | i7;
                    int i19 = (~((i8 + i18) - (i8 & i18))) | i17;
                    int i20 = ~((-1) - (((-1) - i11) & ((-1) - i13)));
                    int i21 = i6 + i7 + i9 + (563899752 * i5) + (667302295 * i10);
                    int i22 = i21 * i21;
                    int i23 = ((i6 * 1426164010) - 416808960) + (1426164010 * i7) + (i16 * 480671447) + (i19 * 480671447) + (480671447 * i20) + (1906835456 * i9) + ((-1270874112) * i5) + (1914175488 * i10) + ((-1995833344) * i22);
                    int i24 = (i6 * (-901935710)) + 144807674 + (i7 * (-901935710)) + (i16 * 171) + (i19 * 171) + (i20 * 171) + (i9 * (-901935539)) + (i5 * 42244168) + (i10 * (-913566613)) + (i22 * (-1006501888));
                    int i25 = i23 + (i24 * i24 * (-1006239744));
                    if (i25 != 1) {
                        return i25 != 2 ? c(objArr4) : e(objArr4);
                    }
                    int i26 = 2 % 2;
                    int i27 = f22986j;
                    int i28 = (i27 ^ 29) + ((i27 & 29) << 1);
                    f22985g = i28 % 128;
                    int i29 = i28 % 2;
                    return null;
                }

                private static /* synthetic */ Object c(Object[] objArr4) {
                    int i5 = 2 % 2;
                    int i6 = f22986j;
                    int i7 = (((i6 + 11) - (11 & i6)) << 1) - (i6 ^ 11);
                    f22985g = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 67 / 0;
                    }
                    return null;
                }

                private static /* synthetic */ Object e(Object[] objArr4) {
                    int i5 = 2 % 2;
                    int i6 = f22986j + 29;
                    f22985g = i6 % 128;
                    if (i6 % 2 == 0) {
                        return null;
                    }
                    int i7 = 56 / 0;
                    return null;
                }

                @Override // fr.antelop.sdk.transaction.hce.WalletHceTransactionCallback
                public final void onCustomerCredentialsRequired(Context context2, List<CustomerAuthenticationMethod> list, HceTransaction hceTransaction) {
                    int i5 = 2 % 2;
                    int i6 = f22986j;
                    int i7 = (i6 ^ 9) + (((-1) - (((-1) - i6) | ((-1) - 9))) << 1);
                    f22985g = i7 % 128;
                    if (i7 % 2 == 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                @Override // fr.antelop.sdk.transaction.hce.WalletHceTransactionCallback
                public final void onDecline(Context context2, HceTransactionDeclineReason hceTransactionDeclineReason, AntelopError antelopError, HceTransaction hceTransaction) {
                    int i5 = 2 % 2;
                    int i6 = f22986j;
                    int i7 = (i6 ^ 41) + (((-1) - (((-1) - i6) | ((-1) - 41))) << 1);
                    f22985g = i7 % 128;
                    int i8 = i7 % 2;
                }

                @Override // fr.antelop.sdk.transaction.hce.WalletHceTransactionCallback
                public final TransactionDecision onFinalization(Context context2, CustomerAuthenticationMethod customerAuthenticationMethod, Date date, HceTransaction hceTransaction) {
                    int i5 = f22981b * (-2109369361);
                    f22981b = i5;
                    int i6 = (int) Runtime.getRuntime().totalMemory();
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int i7 = f22984e * 254815720;
                    f22984e = i7;
                    return (TransactionDecision) a(elapsedCpuTime, 1182216915, -1182216913, new Object[]{this, context2, customerAuthenticationMethod, date, hceTransaction}, i5, i6, i7);
                }

                @Override // fr.antelop.sdk.transaction.hce.WalletHceTransactionCallback
                public final void onPending(Context context2, HceTransaction hceTransaction) {
                    int i5 = 2 % 2;
                    int i6 = f22985g;
                    int i7 = (((i6 + 1) - (1 & i6)) << 1) - (i6 ^ 1);
                    f22986j = i7 % 128;
                    int i8 = i7 % 2;
                }

                @Override // fr.antelop.sdk.transaction.hce.WalletHceTransactionCallback
                public final void onProgress(Context context2, HceTransactionStep hceTransactionStep) {
                    int i5 = f22982c * (-698977128);
                    f22982c = i5;
                    int iMyTid = Process.myTid();
                    int iUptimeMillis = (int) SystemClock.uptimeMillis();
                    int i6 = f22983d * (-1615441139);
                    f22983d = i6;
                    a(iUptimeMillis, -398431975, 398431976, new Object[]{this, context2, hceTransactionStep}, i5, iMyTid, i6);
                }

                @Override // fr.antelop.sdk.transaction.hce.WalletHceTransactionCallback
                public final void onSuccess(Context context2, HceTransactionStatus hceTransactionStatus, HceTransaction hceTransaction) {
                    int i5 = 2 % 2;
                    int i6 = f22985g;
                    int i7 = (((-1) - (((-1) - i6) & ((-1) - 71))) << 1) - (i6 ^ 71);
                    f22986j = i7 % 128;
                    int i8 = i7 % 2;
                }

                @Override // fr.antelop.sdk.transaction.hce.WalletHceTransactionCallback
                public final void onUnknownResult(Context context2, HceTransactionUnknownReason hceTransactionUnknownReason, HceTransaction hceTransaction) {
                    int iMyPid = Process.myPid();
                    int i5 = f22980a * (-1982622475);
                    f22980a = i5;
                    a((int) Runtime.getRuntime().maxMemory(), -2106824680, 2106824680, new Object[]{this, context2, hceTransactionUnknownReason, hceTransaction}, iMyPid, i5, (int) Process.getElapsedCpuTime());
                }
            };
            int i5 = f22975f + 27;
            f22977h = i5 % 128;
            int i6 = i5 % 2;
            return walletHceTransactionCallback2;
        }
    }

    private static void i(String str, int i2, Object[] objArr) throws Throwable {
        Object obj;
        String str2 = str;
        int i3 = 2 % 2;
        if (str2 != null) {
            char[] charArray = str2.toCharArray();
            int i4 = $10 + 19;
            $11 = i4 % 128;
            obj = charArray;
            if (i4 % 2 == 0) {
                int i5 = 2 % 4;
                obj = charArray;
            }
        } else {
            obj = str2;
        }
        char[] cArr = (char[]) obj;
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        int i6 = 0;
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            cArr3[i6] = cArr[gVar.f19924d];
            int i7 = 1;
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i8 = $11 + 95;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 3 / 4;
            }
            int i10 = 58224;
            int i11 = i6;
            while (i11 < 16) {
                int i12 = $10 + 85;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                char c2 = cArr3[i7];
                char c3 = cArr3[i6];
                int i14 = (c3 + i10) ^ ((c3 << 4) + ((char) (((long) f22972c) ^ (-7511683281764982996L))));
                int i15 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f22973d);
                    objArr2[2] = Integer.valueOf(i15);
                    objArr2[i7] = Integer.valueOf(i14);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        int iNormalizeMetaState = 270 - KeyEvent.normalizeMetaState(0);
                        char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + i7);
                        int iIndexOf = 10 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        byte b2 = (byte) i7;
                        byte b3 = (byte) (b2 - 1);
                        String str$$c = $$c(b2, b3, b3);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[i7] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objA = o.d.d.a(iNormalizeMetaState, bitsPerPixel, iIndexOf, -1995022631, false, str$$c, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[i7] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i10) ^ ((cCharValue << 4) + ((char) (((long) f22971b) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f22974e)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 1;
                        byte b5 = (byte) (b4 - 1);
                        objA2 = o.d.d.a(270 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (ViewConfiguration.getEdgeSlop() >> 16) + 11, -1995022631, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i10 -= 40503;
                    i11++;
                    i6 = 0;
                    i7 = 1;
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
                byte b6 = (byte) 0;
                byte b7 = b6;
                objA3 = o.d.d.a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 269, (char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10, -2074123590, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            i6 = 0;
        }
        String str3 = new String(cArr2, 0, i2);
        int i16 = $11 + 89;
        $10 = i16 % 128;
        int i17 = i16 % 2;
        objArr[0] = str3;
    }

    static void init$0() {
        $$a = new byte[]{75, Utf8.REPLACEMENT_BYTE, 5, -84};
        $$b = Mp4VideoDirectory.TAG_COMPRESSION_TYPE;
    }

    protected final Object clone() throws CloneNotSupportedException {
        int i2 = 2 % 2;
        throw new CloneNotSupportedException();
    }

    public void e(Context context, List<o.dq.c> list) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f22975f + 95;
        f22977h = i3 % 128;
        int i4 = i3 % 2;
        WalletHceTransactionCallback walletHceTransactionCallbackA = a();
        if (walletHceTransactionCallbackA instanceof d) {
            HashMap map = new HashMap();
            for (o.dq.c cVar : list) {
                int i5 = f22975f + 93;
                f22977h = i5 % 128;
                int i6 = i5 % 2;
                int iMyTid = Process.myTid();
                int i7 = o.dq.c.L * (-2097288704);
                o.dq.c.L = i7;
                int i8 = 302093969 * o.dq.c.S;
                o.dq.c.S = i8;
                map.put(cVar.y(), (HceTransaction) o.dq.c.e(i8, (int) Runtime.getRuntime().freeMemory(), new Object[]{cVar}, 1323051983, iMyTid, -1323051962, i7));
            }
            ((d) walletHceTransactionCallbackA).onTransactionsUpdated(context, map);
            int i9 = f22977h + 19;
            f22975f = i9 % 128;
            int i10 = i9 % 2;
        }
    }
}
