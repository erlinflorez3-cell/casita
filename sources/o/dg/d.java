package o.dg;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.biocatch.android.commonsdk.configuration.ConfigurationDefaultValue;
import com.drew.metadata.exif.ExifDirectoryBase;
import com.google.common.base.Ascii;
import fr.antelop.sdk.AntelopError;
import fr.antelop.sdk.AntelopErrorCode;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethod;
import fr.antelop.sdk.transaction.TransactionDecision;
import fr.antelop.sdk.transaction.hce.HceTransaction;
import fr.antelop.sdk.transaction.hce.HceTransactionDeclineReason;
import fr.antelop.sdk.transaction.hce.HceTransactionStatus;
import fr.antelop.sdk.transaction.hce.HceTransactionStep;
import fr.antelop.sdk.transaction.hce.HceTransactionUnknownReason;
import fr.antelop.sdk.transaction.hce.WalletHceTransactionCallback;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;
import java.util.Map;
import o.a.g;
import o.a.i;
import o.a.l;
import o.ea.f;
import o.ea.m;
import org.msgpack.core.MessagePack;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d implements WalletHceTransactionCallback {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    static final Object LOCK;
    private static final String TAG;

    /* JADX INFO: renamed from: a */
    private static int f22988a = 0;

    /* JADX INFO: renamed from: b */
    private static char f22989b = 0;

    /* JADX INFO: renamed from: c */
    private static int[] f22990c = null;

    /* JADX INFO: renamed from: d */
    private static long f22991d = 0;

    /* JADX INFO: renamed from: e */
    private static int f22992e = 0;

    /* JADX INFO: renamed from: g */
    private static int f22993g = 0;

    /* JADX INFO: renamed from: h */
    private static int f22994h = 0;

    /* JADX INFO: renamed from: i */
    private static int f22995i = 0;
    private final e delayedEventDispatcher = new e();
    final b transactionFlowLock = b.e();
    private boolean isPreviousTransactionProperlyFinished = false;

    final class e {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: e */
        private static char f22996e = 0;

        /* JADX INFO: renamed from: f */
        private static char f22997f = 0;

        /* JADX INFO: renamed from: g */
        private static char f22998g = 0;

        /* JADX INFO: renamed from: h */
        private static int f22999h = 0;

        /* JADX INFO: renamed from: i */
        private static int f23000i = 0;

        /* JADX INFO: renamed from: j */
        private static char f23001j = 0;

        /* JADX INFO: renamed from: a */
        private Runnable f23002a;

        /* JADX INFO: renamed from: b */
        private final Handler f23003b;

        /* JADX INFO: renamed from: c */
        private Runnable f23004c;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(short r7, short r8, int r9) {
            /*
                int r0 = r8 * 2
                int r8 = r0 + 1
                int r0 = r7 * 3
                int r0 = 72 - r0
                int r1 = r9 * 2
                int r7 = 4 - r1
                byte[] r6 = o.dg.d.e.$$a
                byte[] r5 = new byte[r8]
                r4 = 0
                if (r6 != 0) goto L2c
                r2 = r7
                r3 = r4
            L15:
                int r0 = -r0
                int r7 = r7 + 1
                int r0 = r0 + r2
                r2 = r3
            L1a:
                int r3 = r2 + 1
                byte r1 = (byte) r0
                r5[r2] = r1
                if (r3 != r8) goto L27
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L27:
                r1 = r6[r7]
                r2 = r0
                r0 = r1
                goto L15
            L2c:
                r2 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: o.dg.d.e.$$c(short, short, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f23000i = 0;
            f22999h = 1;
            f22996e = (char) 54577;
            f23001j = (char) 53199;
            f22997f = (char) 12215;
            f22998g = (char) 1934;
        }

        e() throws Throwable {
            Object[] objArr = new Object[1];
            k("ꉽꚸᴯ햞Ɡ\uf3b7Ɏ吽澫餭您\u2fe4坒菂厢鸫ꩫ疝ꉽꚸꧏﱫﶇ鄫Ṟ锐䮤ὢ补꥓ᴯ햞您\u2fe4奒ࢠ", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 35, objArr);
            HandlerThread handlerThread = new HandlerThread(((String) objArr[0]).intern());
            handlerThread.start();
            this.f23003b = new o.ea.e(handlerThread.getLooper());
        }

        public /* synthetic */ void d() {
            synchronized (d.LOCK) {
                if (f.a()) {
                    Object[] objArr = new Object[1];
                    k("澫餭您\u2fe4坒菂厢鸫ꩫ疝ꉽꚸꧏﱫﶇ鄫Ṟ锐䮤ὢ补꥓ᴯ햞您\u2fe4奒ࢠ", 28 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    k("ᴙं䦯\ueac2\ueed6\ue4cb俇硽㒖\udd91䣁뉻뜸䏖쮚ᵦ\u0b00鹩㱶⺎롙衈垲잠䀇Ԝ밿蛦鑪㩝눗㜯䨬쫹婮벻␣藔朢ౙⵜ霦朢ౙﯨ\uea15쎋ꀂ䛣ᘽ눣쑯ឣ꧕㢮庎郁㻲﯁欣쎋ꀂ痊ꨜ綞Ꞧ쎋ꀂ푊祍쩗ᙯ鋎ꖲᝑ蕋", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 75, objArr2);
                    f.c(strIntern, ((String) objArr2[0]).intern());
                }
                d.this.transactionFlowLock.b(false);
            }
        }

        public /* synthetic */ void e(Context context) {
            synchronized (d.LOCK) {
                if (f.a()) {
                    Object[] objArr = new Object[1];
                    k("澫餭您\u2fe4坒菂厢鸫ꩫ疝ꉽꚸꧏﱫﶇ鄫Ṟ锐䮤ὢ补꥓ᴯ햞您\u2fe4奒ࢠ", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 27, objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    k("ᴙं䦯\ueac2\ueed6\ue4cb俇硽㒖\udd91䣁뉻뜸䏖쮚ᵦ\u0b00鹩㱶⺎롙衈垲잠䀇Ԝ밿蛦鑪㩝눗㜯斒䦇㏳邬징짲ṗẾﯨ\uea15您\u2fe4ﶇ鄫Ṟ锐烃轐텭芻\ue335䀏\udfd6餈姛퍺", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 58, objArr2);
                    f.c(strIntern, ((String) objArr2[0]).intern());
                }
                this.f23002a = null;
                d.this.onTransactionError(context, new o.by.c(AntelopErrorCode.NfcDisconnection).a());
            }
        }

        static void init$0() {
            $$a = new byte[]{111, -103, -70, 103};
            $$b = 116;
        }

        private static void k(String str, int i2, Object[] objArr) throws Throwable {
            Object charArray;
            String str2 = str;
            int i3 = 2 % 2;
            Object obj = null;
            if (str2 != null) {
                int i4 = $11 + 75;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    str2.toCharArray();
                    obj.hashCode();
                    throw null;
                }
                charArray = str2.toCharArray();
            } else {
                charArray = str2;
            }
            char[] cArr = (char[]) charArray;
            g gVar = new g();
            char[] cArr2 = new char[cArr.length];
            int i5 = 0;
            gVar.f19924d = 0;
            char[] cArr3 = new char[2];
            while (gVar.f19924d < cArr.length) {
                cArr3[i5] = cArr[gVar.f19924d];
                cArr3[1] = cArr[gVar.f19924d + 1];
                int i6 = 58224;
                int i7 = i5;
                while (i7 < 16) {
                    int i8 = $11 + 95;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    char c2 = cArr3[1];
                    char c3 = cArr3[i5];
                    int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (((long) f22997f) ^ (-7511683281764982996L))));
                    int i11 = c3 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(f22998g);
                        objArr2[2] = Integer.valueOf(i11);
                        objArr2[1] = Integer.valueOf(i10);
                        objArr2[i5] = Integer.valueOf(c2);
                        Object objA = o.d.d.a(1603517628);
                        if (objA == null) {
                            int trimmedLength = TextUtils.getTrimmedLength("") + 270;
                            char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int keyRepeatTimeout = 11 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            byte b2 = (byte) 1;
                            byte b3 = (byte) (b2 - 1);
                            String str$$c = $$c(b2, b3, b3);
                            Class[] clsArr = new Class[4];
                            clsArr[i5] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objA = o.d.d.a(trimmedLength, scrollBarFadeDuration, keyRepeatTimeout, -1995022631, false, str$$c, clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) f22996e) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f23001j)};
                        Object objA2 = o.d.d.a(1603517628);
                        if (objA2 == null) {
                            byte b4 = (byte) 1;
                            byte b5 = (byte) (b4 - 1);
                            objA2 = o.d.d.a(270 - (ViewConfiguration.getTapTimeout() >> 16), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 11, -1995022631, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                        i7++;
                        i5 = 0;
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
                    objA3 = o.d.d.a(270 - (KeyEvent.getMaxKeyCode() >> 16), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), TextUtils.indexOf((CharSequence) "", '0') + 12, -2074123590, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                i5 = 0;
            }
            objArr[0] = new String(cArr2, 0, i2);
        }

        final boolean b() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f22999h + 59;
            f23000i = i3 % 128;
            int i4 = i3 % 2;
            if (f.a()) {
                Object[] objArr = new Object[1];
                k("澫餭您\u2fe4坒菂厢鸫ꩫ疝ꉽꚸꧏﱫﶇ鄫Ṟ锐䮤ὢ补꥓ᴯ햞您\u2fe4奒ࢠ", 27 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                k("ᴙं䦯\ueac2\ueed6\ue4cb俇硽㒖\udd91䣁뉻뜸䏖쮚ᵦ\u0b00鹩㱶⺎롙衈垲잠䄌䑜姛퍺ꉽꚸ鑪㩝눗㜯ꉽꚸ咓㝼ឣ꧕ᮄ㋮ꢓ쒵롙衈醃ა쎋ꀂ푊祍쩗ᙯ鋎ꖲᝑ蕋", 57 - Color.green(0), objArr2);
                f.c(strIntern, ((String) objArr2[0]).intern());
            }
            Runnable runnable = this.f23004c;
            Object obj = null;
            if (runnable != null) {
                int i5 = f22999h + 79;
                f23000i = i5 % 128;
                if (i5 % 2 != 0) {
                    this.f23003b.removeCallbacks(runnable);
                    this.f23004c = null;
                    obj.hashCode();
                    throw null;
                }
                this.f23003b.removeCallbacks(runnable);
                this.f23004c = null;
            }
            Runnable runnable2 = this.f23002a;
            if (runnable2 == null) {
                return true;
            }
            this.f23003b.removeCallbacks(runnable2);
            this.f23002a = null;
            return false;
        }

        final void d(final Context context) throws Throwable {
            int i2 = 2 % 2;
            Runnable runnable = new Runnable() { // from class: o.dg.d$e$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.e(context);
                }
            };
            Handler handler = this.f23003b;
            Object[] objArr = {runnable, 300L};
            Method method = Class.forName(C1626yg.Ud("#A\u0006rQCV5\fd`\\F\u0018>qI)", (short) (FB.Xd() ^ 29138), (short) (FB.Xd() ^ 4238))).getMethod(EO.Od("\f4j\u000fgV-\u001a]xu", (short) (C1499aX.Xd() ^ (-18759))), Class.forName(Ig.wd("a&MTqzO%vMo5\u0003|Kr?6", (short) (OY.Xd() ^ 31844))), Long.TYPE);
            try {
                method.setAccessible(true);
                if (!((Boolean) method.invoke(handler, objArr)).booleanValue()) {
                    return;
                }
                int i3 = f22999h + 21;
                int i4 = i3 % 128;
                f23000i = i4;
                if (i3 % 2 != 0) {
                    this.f23002a = runnable;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                this.f23002a = runnable;
                int i5 = i4 + 13;
                f22999h = i5 % 128;
                int i6 = i5 % 2;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        final void e() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f23000i + 1;
            f22999h = i3 % 128;
            int i4 = i3 % 2;
            Runnable runnable = new Runnable() { // from class: o.dg.d$e$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.d();
                }
            };
            Handler handler = this.f23003b;
            Class<?> cls = Class.forName(C1561oA.Qd("u\u0002v\u0004\u007fxr;{~8Qiujqiu", (short) (OY.Xd() ^ ExifDirectoryBase.TAG_SAMPLE_FORMAT)));
            Class<?>[] clsArr = new Class[2];
            short sXd = (short) (C1607wl.Xd() ^ 12817);
            short sXd2 = (short) (C1607wl.Xd() ^ 30688);
            int[] iArr = new int["}u\fwE\u0005z\t\u0003Jo\u0014\u000e\u000f\u0003\u0005\u0010\n".length()];
            QB qb = new QB("}u\fwE\u0005z\t\u0003Jo\u0014\u000e\u000f\u0003\u0005\u0010\n");
            int i5 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i5] = xuXd.fK((xuXd.CK(iKK) - (sXd + i5)) - sXd2);
                i5++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i5));
            clsArr[1] = Long.TYPE;
            Object[] objArr = {runnable, Long.valueOf(ConfigurationDefaultValue.MotionPaddingAroundTouchMSec)};
            try {
                cls.getMethod(C1561oA.od("\u0012\u0010\u0013\u0013a\u0002\b{\u0013}{", (short) (C1633zX.Xd() ^ (-20333))), clsArr).setAccessible(true);
                if (!(!((Boolean) r1.invoke(handler, objArr)).booleanValue())) {
                    int i6 = f23000i;
                    int i7 = i6 + 25;
                    f22999h = i7 % 128;
                    int i8 = i7 % 2;
                    this.f23004c = runnable;
                    int i9 = i6 + 55;
                    f22999h = i9 % 128;
                    int i10 = i9 % 2;
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r7, byte r8, short r9) {
        /*
            int r0 = r8 * 4
            int r8 = 4 - r0
            int r0 = r9 + 65
            int r2 = r7 * 2
            int r1 = 1 - r2
            byte[] r7 = o.dg.d.$$a
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r7 != 0) goto L2c
            r2 = r4
            r3 = r5
        L15:
            int r0 = -r0
            int r8 = r8 + 1
            int r0 = r0 + r2
            r2 = r3
        L1a:
            byte r1 = (byte) r0
            r6[r2] = r1
            int r3 = r2 + 1
            if (r2 != r4) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L27:
            r1 = r7[r8]
            r2 = r0
            r0 = r1
            goto L15
        L2c:
            r2 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dg.d.$$c(int, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22993g = 0;
        f22994h = 1;
        f22992e = 0;
        f22995i = 1;
        b();
        Object[] objArr = new Object[1];
        f((char) ((KeyEvent.getMaxKeyCode() >> 16) + 18062), "㘞\ue3c1큜텕\ue171\ue265\uf7ee勦螀腘零꼕颳錊ᰵ꣱9档\uea18诈䐥蕺頣\udf25腫㱤哸", "\u0000\u0000\u0000\u0000", "\ud91d瀌踏ᵆ", 242224345 - Color.rgb(0, 0, 0), objArr);
        TAG = ((String) objArr[0]).intern();
        LOCK = new Object();
        int i2 = f22994h + 83;
        f22993g = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 33 / 0;
        }
    }

    static void b() {
        f22991d = 740602047300126166L;
        f22988a = 1564493270;
        f22989b = (char) 49740;
        f22990c = new int[]{-719034801, -1094251693, -298299415, 1842582659, 386758461, 223653162, -2074331386, 417642567, -1229289985, 26762967, 99588290, 1060785524, -2017038211, -33860105, 334731684, 1779477138, 1770525226, 1046840955};
    }

    private static void f(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2 % 2;
        int i4 = $11 + 45;
        $10 = i4 % 128;
        Object obj = null;
        Object charArray = str6;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (str6 != null) {
            charArray = str6.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str5;
        if (str5 != null) {
            int i5 = $11 + 117;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 44 / 0;
                charArray2 = str5.toCharArray();
            } else {
                charArray2 = str5.toCharArray();
            }
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str4;
        if (str4 != null) {
            charArray3 = str4.toCharArray();
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
        int i7 = $10 + 73;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        while (iVar.f19932b < length3) {
            try {
                Object[] objArr2 = {iVar};
                Object objA = o.d.d.a(540069882);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(105 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (ExpandableListView.getPackedPositionChild(0L) + 1), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 11, -155898465, false, $$c(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(obj, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = o.d.d.a(2068572);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(847 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (6488 - (Process.myPid() >> 22)), 12 - (ViewConfiguration.getLongPressTimeout() >> 16), -694521287, false, $$c(b4, b5, (byte) (b5 + 3)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(obj, objArr3)).intValue();
                Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA3 = o.d.d.a(-1122996612);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(458 - ExpandableListView.getPackedPositionGroup(0L), (char) ((Process.getThreadPriority(0) + 20) >> 6), 11 - TextUtils.getTrimmedLength(""), 1804962841, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = o.d.d.a(-1223178239);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objA4 = o.d.d.a((ViewConfiguration.getLongPressTimeout() >> 16) + 639, (char) (Color.argb(0, 0, 0, 0) + 65100), 12 - ((Process.getThreadPriority(0) + 20) >> 6), 1636969060, false, $$c(b8, b9, (byte) ((-1) - (((-1) - b9) & ((-1) - 57)))), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r8[iVar.f19932b])) ^ (f22991d ^ 740602047300126166L)) ^ ((long) ((int) (((long) f22988a) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f22989b) ^ 740602047300126166L))));
                iVar.f19932b++;
                obj = null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr5);
    }

    static void init$0() {
        $$a = new byte[]{Ascii.ESC, -10, MessagePack.Code.FIXEXT8, 7};
        $$b = 125;
    }

    private static void j(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f22990c;
        int i4 = 989264422;
        long j2 = 0;
        int i5 = 0;
        if (iArr2 != null) {
            int i6 = $11 + 5;
            int i7 = i6 % 128;
            $10 = i7;
            int i8 = i6 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i9 = i7 + 45;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 0;
            while (i11 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i11])};
                    Object objA = o.d.d.a(i4);
                    if (objA == null) {
                        byte b2 = (byte) i5;
                        byte b3 = b2;
                        objA = o.d.d.a(674 - TextUtils.lastIndexOf("", '0'), (char) ((-1) - TextUtils.lastIndexOf("", '0', i5)), 13 - (SystemClock.elapsedRealtime() > j2 ? 1 : (SystemClock.elapsedRealtime() == j2 ? 0 : -1)), -328001469, false, $$c(b2, b3, (byte) ((b3 + 56) - (b3 & 56))), new Class[]{Integer.TYPE});
                    }
                    iArr3[i11] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i11++;
                    i4 = 989264422;
                    j2 = 0;
                    i5 = 0;
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
        int[] iArr5 = f22990c;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i12 = 0; i12 < length3; i12++) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i12])};
                Object objA2 = o.d.d.a(989264422);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(View.MeasureSpec.makeMeasureSpec(0, 0) + 675, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), MotionEvent.axisFromString("") + 13, -328001469, false, $$c(b4, b5, (byte) (56 | b5)), new Class[]{Integer.TYPE});
                }
                iArr6[i12] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        lVar.f19941d = 0;
        while (lVar.f19941d < iArr.length) {
            int i13 = $10 + 25;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            for (int i15 = 0; i15 < 16; i15++) {
                int i16 = $11 + 21;
                $10 = i16 % 128;
                int i17 = i16 % 2;
                lVar.f19942e ^= iArr4[i15];
                Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA3 = o.d.d.a(2098218801);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(301 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 52697), MotionEvent.axisFromString("") + 12, -1416256172, false, $$c(b6, b7, (byte) ((-1) - (((-1) - b7) & ((-1) - 54)))), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
            }
            int i18 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i18;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i19 = lVar.f19942e;
            int i20 = lVar.f19940a;
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
                byte b8 = (byte) 0;
                byte b9 = b8;
                objA4 = o.d.d.a(230 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (51004 - ExpandableListView.getPackedPositionGroup(0L)), 9 - View.MeasureSpec.getSize(0), -330018025, false, $$c(b8, b9, (byte) (52 | b9)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            int i21 = $10 + 21;
            $11 = i21 % 128;
            int i22 = i21 % 2;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    public abstract void onCredentialsRequired(Context context, List<CustomerAuthenticationMethod> list, HceTransaction hceTransaction);

    @Override // fr.antelop.sdk.transaction.hce.WalletHceTransactionCallback
    public final void onCustomerCredentialsRequired(Context context, List<CustomerAuthenticationMethod> list, HceTransaction hceTransaction) {
        synchronized (LOCK) {
            if (f.a()) {
                Object[] objArr = new Object[1];
                f((char) (Gravity.getAbsoluteGravity(0, 0) + 18062), "㘞\ue3c1큜텕\ue171\ue265\uf7ee勦螀腘零꼕颳錊ᰵ꣱9档\uea18诈䐥蕺頣\udf25腫㱤哸", "\u0000\u0000\u0000\u0000", "\ud91d瀌踏ᵆ", 259001562 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                j(new int[]{1319198982, 1366234186, 2028869514, -1063461853, 1607655260, -1945942387, -117146227, 1831767352, -454172670, -1044822358, 378829387, 88224404, -1151638743, 846424551, -777933187, 29646094, -1754417056, -1630439505, -1164177505, -1223176753, 458917828, 188276058, 1765063624, 1152153891}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 45, objArr2);
                StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern()).append(hceTransaction);
                Object[] objArr3 = new Object[1];
                f((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), "虰鶯ከ䴛㓛\uaa3a\ud94a\u206cස迾\ua959\uf090삖㡆\uf515䊩ꮙ\uec03낛ꖸ菦\ud869醺培龘딼狉헗袑◥㒫蜭啵崡곃", "\u0000\u0000\u0000\u0000", "婪䙽粛益", (-1689879207) - TextUtils.lastIndexOf("", '0', 0, 0), objArr3);
                StringBuilder sbAppend2 = sbAppend.append(((String) objArr3[0]).intern());
                Object[] objArr4 = new Object[1];
                f((char) (54979 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), "鬷ఓن", "\u0000\u0000\u0000\u0000", "뷟瑒싺Ꮦ", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 93039940, objArr4);
                StringBuilder sbAppend3 = sbAppend2.append(m.e(((String) objArr4[0]).intern(), list.iterator()));
                Object[] objArr5 = new Object[1];
                f((char) ((ViewConfiguration.getTapTimeout() >> 16) + 36602), "侀", "\u0000\u0000\u0000\u0000", "姁仦磌掎", (-1420892583) - ((Process.getThreadPriority(0) + 20) >> 6), objArr5);
                f.c(strIntern, sbAppend3.append(((String) objArr5[0]).intern()).toString());
            }
            this.isPreviousTransactionProperlyFinished = true;
            this.transactionFlowLock.b(true);
            this.delayedEventDispatcher.e();
            onCredentialsRequired(context, list, hceTransaction);
        }
    }

    @Override // fr.antelop.sdk.transaction.hce.WalletHceTransactionCallback
    public final void onDecline(Context context, HceTransactionDeclineReason hceTransactionDeclineReason, AntelopError antelopError, HceTransaction hceTransaction) {
        synchronized (LOCK) {
            if (f.a()) {
                Object[] objArr = new Object[1];
                f((char) (18062 - TextUtils.getOffsetBefore("", 0)), "㘞\ue3c1큜텕\ue171\ue265\uf7ee勦螀腘零꼕颳錊ᰵ꣱9档\uea18诈䐥蕺頣\udf25腫㱤哸", "\u0000\u0000\u0000\u0000", "\ud91d瀌踏ᵆ", 259001562 + MotionEvent.axisFromString(""), objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                j(new int[]{-1112925628, 1369945554, 785602462, -1941908711, -2024503710, -1286397068, 574728039, -1887727806, 785602462, -1941908711, 1820367077, -501912280, 929109456, 669813647, 1765063624, 1152153891}, KeyEvent.keyCodeFromString("") + 29, objArr2);
                StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern()).append(hceTransactionDeclineReason.name());
                Object[] objArr3 = new Object[1];
                j(new int[]{1879848988, 1795472597, -32696023, 338992409, 1044369957, -64958228}, 11 - Gravity.getAbsoluteGravity(0, 0), objArr3);
                StringBuilder sbAppend2 = sbAppend.append(((String) objArr3[0]).intern()).append(antelopError.toString());
                Object[] objArr4 = new Object[1];
                j(new int[]{1879848988, 1795472597, -1754417056, -1630439505, -1164177505, -1223176753, 458917828, 188276058, 1765063624, 1152153891}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 17, objArr4);
                f.c(strIntern, sbAppend2.append(((String) objArr4[0]).intern()).append(hceTransaction).toString());
            }
            if (antelopError.getCode() == AntelopErrorCode.NfcDisconnection) {
                this.isPreviousTransactionProperlyFinished = false;
            } else {
                this.isPreviousTransactionProperlyFinished = true;
                onTransactionError(context, antelopError);
            }
        }
    }

    @Override // fr.antelop.sdk.transaction.hce.WalletHceTransactionCallback
    public final TransactionDecision onFinalization(Context context, CustomerAuthenticationMethod customerAuthenticationMethod, Date date, HceTransaction hceTransaction) {
        int i2 = 2 % 2;
        int i3 = f22995i + 39;
        f22992e = i3 % 128;
        int i4 = i3 % 2;
        TransactionDecision transactionDecisionOnTransactionFinalization = onTransactionFinalization(context, customerAuthenticationMethod, date, hceTransaction);
        if (i4 != 0) {
            int i5 = 5 / 0;
        }
        int i6 = f22992e + 115;
        f22995i = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 10 / 0;
        }
        return transactionDecisionOnTransactionFinalization;
    }

    @Override // fr.antelop.sdk.transaction.hce.WalletHceTransactionCallback
    public final void onPending(Context context, HceTransaction hceTransaction) {
        synchronized (LOCK) {
            if (f.a()) {
                Object[] objArr = new Object[1];
                f((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 18063), "㘞\ue3c1큜텕\ue171\ue265\uf7ee勦螀腘零꼕颳錊ᰵ꣱9档\uea18诈䐥蕺頣\udf25腫㱤哸", "\u0000\u0000\u0000\u0000", "\ud91d瀌踏ᵆ", 259001560 - Process.getGidForName(""), objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                j(new int[]{952754740, 153619318, -1607317371, 369921767, -1089873051, -753271872, 1601753048, 703016557, -2011733309, -2121835936, 1583589185, 979899939, 2046400424, -1851740847}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 27, objArr2);
                f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(hceTransaction).toString());
            }
            this.isPreviousTransactionProperlyFinished = true;
            onTransactionDone(context, hceTransaction);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x0168  */
    @Override // fr.antelop.sdk.transaction.hce.WalletHceTransactionCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onProgress(android.content.Context r17, fr.antelop.sdk.transaction.hce.HceTransactionStep r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dg.d.onProgress(android.content.Context, fr.antelop.sdk.transaction.hce.HceTransactionStep):void");
    }

    @Override // fr.antelop.sdk.transaction.hce.WalletHceTransactionCallback
    public final void onSuccess(Context context, HceTransactionStatus hceTransactionStatus, HceTransaction hceTransaction) {
        int i2 = 2 % 2;
        int i3 = f22995i + 109;
        f22992e = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 64 / 0;
        }
    }

    public abstract void onTransactionDone(Context context, HceTransaction hceTransaction);

    public abstract void onTransactionError(Context context, AntelopError antelopError);

    public TransactionDecision onTransactionFinalization(Context context, CustomerAuthenticationMethod customerAuthenticationMethod, Date date, HceTransaction hceTransaction) {
        int i2 = 2 % 2;
        int i3 = f22992e + 23;
        int i4 = i3 % 128;
        f22995i = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i5 = i4 + 43;
        f22992e = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public void onTransactionProgress(Context context, HceTransactionStep hceTransactionStep) {
        int i2 = 2 % 2;
        int i3 = f22992e + 23;
        f22995i = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public abstract void onTransactionStart(Context context);

    public void onTransactionsUpdated(Context context, Map<String, HceTransaction> map) {
        int i2 = 2 % 2;
        int i3 = f22992e + 61;
        f22995i = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 39 / 0;
        }
    }

    @Override // fr.antelop.sdk.transaction.hce.WalletHceTransactionCallback
    public final void onUnknownResult(Context context, HceTransactionUnknownReason hceTransactionUnknownReason, HceTransaction hceTransaction) {
        int i2 = 2 % 2;
        int i3 = f22992e + 11;
        f22995i = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 45 / 0;
        }
    }
}
