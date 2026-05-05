package o.by;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.nfc.NfcAdapter;
import android.nfc.cardemulation.CardEmulation;
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
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import fr.antelop.sdk.AntelopErrorCode;
import fr.antelop.sdk.AsyncRequestType;
import fr.antelop.sdk.Wallet;
import fr.antelop.sdk.WalletLockReason;
import fr.antelop.sdk.WalletManagerCallback;
import fr.antelop.sdk.authentication.CustomerAuthenticationCredentials;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethodType;
import fr.antelop.sdk.authentication.LocalAuthenticationErrorReason;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import fr.antelop.sdk.transaction.hce.HceTransaction;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import o.a.o;
import o.bi.a;
import o.bi.b;
import o.bj.e;
import o.bm.a;
import o.ea.m;
import o.m.i;
import okio.Utf8;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements a.d, e.d, a.c, o.c.e, o.ca.e, o.cb.c, o.cf.d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static long A = 0;
    private static int B = 0;
    private static int C = 0;
    private static int D = 0;
    public static int E = 0;
    public static int F = 0;
    public static int G = 0;
    public static int H = 0;
    public static int I = 0;
    public static int J = 0;
    public static int K = 0;
    public static int L = 0;
    public static int M = 0;
    public static int N = 0;

    /* JADX INFO: renamed from: a */
    public static int f21879a = 0;

    /* JADX INFO: renamed from: b */
    public static int f21880b = 0;

    /* JADX INFO: renamed from: c */
    public static int f21881c = 0;

    /* JADX INFO: renamed from: d */
    public static int f21882d = 0;

    /* JADX INFO: renamed from: e */
    public static int f21883e = 0;

    /* JADX INFO: renamed from: f */
    public static int f21884f = 0;

    /* JADX INFO: renamed from: g */
    public static int f21885g = 0;

    /* JADX INFO: renamed from: h */
    public static int f21886h = 0;

    /* JADX INFO: renamed from: i */
    public static int f21887i = 0;

    /* JADX INFO: renamed from: j */
    public static int f21888j = 0;

    /* JADX INFO: renamed from: k */
    public static int f21889k = 0;

    /* JADX INFO: renamed from: l */
    public static int f21890l = 0;

    /* JADX INFO: renamed from: m */
    public static int f21891m = 0;

    /* JADX INFO: renamed from: n */
    public static int f21892n = 0;

    /* JADX INFO: renamed from: o */
    public static int f21893o = 0;

    /* JADX INFO: renamed from: q */
    public static int f21894q = 0;

    /* JADX INFO: renamed from: r */
    private static final AtomicBoolean f21895r;

    /* JADX INFO: renamed from: v */
    private static char[] f21896v = null;

    /* JADX INFO: renamed from: z */
    private static int f21897z = 0;

    /* JADX INFO: renamed from: p */
    private Context f21898p;

    /* JADX INFO: renamed from: s */
    private o.c.a f21899s;

    /* JADX INFO: renamed from: t */
    private WalletManagerCallback f21900t;

    /* JADX INFO: renamed from: u */
    private boolean f21901u;

    /* JADX INFO: renamed from: w */
    private Object f21902w = new Object();

    /* JADX INFO: renamed from: x */
    private o.cb.a f21903x;

    /* JADX INFO: renamed from: y */
    private o.cf.b f21904y;

    /* JADX INFO: renamed from: o.by.h$3 */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f21905b;

        /* JADX INFO: renamed from: c */
        private static int f21906c = 1;

        /* JADX INFO: renamed from: d */
        static final /* synthetic */ int[] f21907d;

        /* JADX INFO: renamed from: e */
        private static int f21908e = 0;

        static {
            int[] iArr = new int[o.j.b.values().length];
            f21907d = iArr;
            try {
                iArr[o.j.b.f26288b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21907d[o.j.b.f26290d.ordinal()] = 2;
                int i2 = f21906c;
                int i3 = (i2 ^ 49) + (((i2 + 49) - (i2 | 49)) << 1);
                f21908e = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21907d[o.j.b.f26287a.ordinal()] = 3;
                int i5 = f21908e + 113;
                f21906c = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21907d[o.j.b.f26289c.ordinal()] = 4;
                int i8 = f21908e;
                int i9 = ((i8 + 85) - (85 | i8)) + ((-1) - (((-1) - i8) & ((-1) - 85)));
                f21906c = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 2 % 2;
                }
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[o.g.b.values().length];
            f21905b = iArr2;
            try {
                iArr2[o.g.b.f26186d.ordinal()] = 1;
                int i11 = f21906c + 69;
                f21908e = i11 % 128;
                int i12 = i11 % 2;
                int i13 = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21905b[o.g.b.f26184b.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21905b[o.g.b.f26187e.ordinal()] = 3;
                int i14 = f21908e + 21;
                f21906c = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = 4 % 2;
                } else {
                    int i16 = 2 % 2;
                }
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21905b[o.g.b.f26185c.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21905b[o.g.b.f26183a.ordinal()] = 5;
                int i17 = f21908e;
                int i18 = (((i17 + 53) - (53 & i17)) << 1) - (i17 ^ 53);
                f21906c = i18 % 128;
                int i19 = i18 % 2;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0021 -> B:17:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(short r6, int r7, short r8) {
        /*
            int r0 = r7 * 4
            int r7 = r0 + 1
            int r6 = r6 + 4
            byte[] r5 = o.by.h.$$c
            int r4 = 105 - r8
            byte[] r3 = new byte[r7]
            r2 = 0
            if (r5 != 0) goto L24
            r0 = r7
            r1 = r2
        L11:
            int r4 = r4 + r0
        L12:
            int r6 = r6 + 1
            byte r0 = (byte) r4
            r3[r1] = r0
            int r1 = r1 + 1
            if (r1 != r7) goto L21
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L21:
            r0 = r5[r6]
            goto L11
        L24:
            r1 = r2
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.by.h.$$g(short, int, short):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        N = -598498994;
        M = -1937961687;
        L = 672216884;
        K = -365281413;
        J = 179667060;
        I = 1861371973;
        H = -2141541776;
        G = 637549145;
        F = -53528032;
        E = 471450764;
        init$0();
        f21894q = -1359949284;
        f21893o = 1476714523;
        f21890l = -772673980;
        f21891m = 25692090;
        f21889k = -1614478071;
        f21892n = 2063317781;
        f21886h = 307833416;
        f21885g = 148617692;
        f21884f = 1991935979;
        f21888j = 52447204;
        f21887i = -1847781822;
        f21881c = 2055192542;
        f21883e = -1063255247;
        f21879a = 1126657481;
        f21880b = 21082621;
        f21882d = -1678613096;
        f21897z = 0;
        D = 1;
        B = 0;
        C = 1;
        t();
        TextUtils.indexOf((CharSequence) "", '0');
        KeyEvent.getModifierMetaStateMask();
        TextUtils.lastIndexOf("", '0', 0, 0);
        Color.alpha(0);
        KeyEvent.normalizeMetaState(0);
        View.MeasureSpec.getMode(0);
        Color.argb(0, 0, 0, 0);
        ViewConfiguration.getScrollDefaultDelay();
        TextUtils.indexOf((CharSequence) "", '0', 0);
        ExpandableListView.getPackedPositionGroup(0L);
        ViewConfiguration.getTouchSlop();
        ViewConfiguration.getScrollBarFadeDuration();
        ViewConfiguration.getLongPressTimeout();
        View.getDefaultSize(0, 0);
        SystemClock.elapsedRealtimeNanos();
        TextUtils.getOffsetAfter("", 0);
        TextUtils.getOffsetBefore("", 0);
        Process.getGidForName("");
        f21895r = new AtomicBoolean(false);
        int i2 = f21897z + 49;
        D = i2 % 128;
        int i3 = i2 % 2;
    }

    public h(Context context, WalletManagerCallback walletManagerCallback) throws Throwable {
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            O((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), Color.green(0), 17 - MotionEvent.axisFromString(""), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            O((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 55502), TextUtils.indexOf((CharSequence) "", '0', 0) + 19, TextUtils.getTrimmedLength("") + 11, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        if (context == null) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.Mandatory;
            Object[] objArr3 = new Object[1];
            O((char) (9170 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 29 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 7 - ((Process.getThreadPriority(0) + 20) >> 6), objArr3);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr3[0]).intern());
        }
        this.f21898p = context;
        this.f21900t = walletManagerCallback;
        if (o.ea.f.a()) {
            o.ea.f.c("Log Manager", "nothing to do");
        }
        int i2 = o.ea.f.f23511d * (-498977415);
        o.ea.f.f23511d = i2;
        int i3 = o.ea.f.f23512e * 620257954;
        o.ea.f.f23512e = i3;
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i4 = o.ea.f.f23515h * 1539730836;
        o.ea.f.f23515h = i4;
        o.ea.f.d(i2, i3, new Object[0], 1138136590, iFreeMemory, -1138136589, i4);
    }

    private static void O(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = $10 + 91;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f21896v[i2 + i7])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objA = o.d.d.a((ViewConfiguration.getJumpTapTimeout() >> 16) + 742, (char) Color.red(0), Color.red(0) + 12, 632508977, false, $$g(b2, b3, (byte) ((b3 + 6) - (6 & b3))), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(A), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 + 1);
                    objA2 = o.d.d.a(766 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (12471 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 13, 1946853218, false, $$g(b4, b5, (byte) (b5 + 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    objA3 = o.d.d.a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 387, (char) TextUtils.getTrimmedLength(""), 18 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 39570797, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                int i8 = $10 + 71;
                $11 = i8 % 128;
                int i9 = i8 % 2;
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
            int i10 = $11 + 81;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b8 = (byte) (-1);
                byte b9 = (byte) (b8 + 1);
                objA4 = o.d.d.a(387 - View.MeasureSpec.getMode(0), (char) KeyEvent.normalizeMetaState(0), 18 - (ViewConfiguration.getFadingEdgeLength() >> 16), 39570797, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void P(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = r7 * 4
            int r0 = 4 - r0
            int r8 = 106 - r8
            int r1 = r6 * 2
            int r7 = 1 - r1
            byte[] r6 = o.by.h.$$a
            byte[] r5 = new byte[r7]
            r4 = 0
            if (r6 != 0) goto L2d
            r3 = r4
            r2 = r0
        L13:
            int r1 = -r0
            int r1 = r1 + r8
            int r0 = r2 + 1
            r2 = r3
            r8 = r1
        L19:
            int r3 = r2 + 1
            byte r1 = (byte) r8
            r5[r2] = r1
            if (r3 != r7) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r9[r4] = r0
            return
        L28:
            r1 = r6[r0]
            r2 = r0
            r0 = r1
            goto L13
        L2d:
            r2 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.by.h.P(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x000f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void Q(int r8, short r9, byte r10, java.lang.Object[] r11) {
        /*
            int r8 = r8 + 4
            int r0 = r10 + 97
            int r7 = r9 + 1
            byte[] r6 = o.by.h.$$d
            byte[] r5 = new byte[r7]
            r4 = 0
            if (r6 != 0) goto L28
            r3 = r8
            r2 = r4
        Lf:
            int r0 = -r0
            int r8 = r8 + r0
            int r8 = r8 + (-5)
            r1 = r2
        L14:
            int r2 = r1 + 1
            byte r0 = (byte) r8
            int r3 = r3 + 1
            r5[r1] = r0
            if (r2 != r7) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r11[r4] = r0
            return
        L25:
            r0 = r6[r3]
            goto Lf
        L28:
            r1 = r4
            r3 = r8
            r8 = r0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.by.h.Q(int, short, byte, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object a(Object[] objArr) throws Throwable {
        h hVar = (h) objArr[0];
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            Object[] objArr2 = new Object[1];
            O((char) (ViewConfiguration.getTouchSlop() >> 8), 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 18, objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            O((char) (48376 - TextUtils.getOffsetAfter("", 0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 978, 14 - View.resolveSizeAndState(0, 0, 0), objArr3);
            o.ea.f.c(strIntern, ((String) objArr3[0]).intern());
            int i3 = C + 121;
            B = i3 % 128;
            int i4 = i3 % 2;
        }
        hVar.i();
        WalletManagerCallback walletManagerCallback = hVar.f21900t;
        if (walletManagerCallback != null) {
            int i5 = C + 15;
            B = i5 % 128;
            if (i5 % 2 != 0) {
                walletManagerCallback.onAsyncRequestSuccess(AsyncRequestType.Logout);
                throw null;
            }
            walletManagerCallback.onAsyncRequestSuccess(AsyncRequestType.Logout);
        }
        int i6 = C + 47;
        B = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    public static LiveData<List<HceTransaction>> b(Application application, int i2, int i3) {
        int i4 = 2 % 2;
        MutableLiveData<List<HceTransaction>> mutableLiveDataC = new o.bn.a(application, o.en.b.c(), i2, i3).c();
        int i5 = C + 23;
        B = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveDataC;
    }

    public static /* synthetic */ Object b(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) throws Throwable {
        int i8 = ~i4;
        int i9 = (~i5) | i8;
        int i10 = ~((i9 + i3) - (i9 & i3));
        int i11 = (~i3) | i8;
        int i12 = ((-1) - (((-1) - i10) & ((-1) - (~(i11 | i5))))) | (~((-1) - (((-1) - ((-1) - (((-1) - i4) & ((-1) - i5)))) & ((-1) - i3))));
        int i13 = ~i11;
        int i14 = (i5 + i13) - (i5 & i13);
        int i15 = ~((i3 + i4) - (i3 & i4));
        int i16 = (i15 + i14) - (i15 & i14);
        int i17 = ~(i8 | i5);
        int i18 = (i17 + i13) - (i17 & i13);
        int i19 = i4 + i5 + i6 + (933655473 * i7) + ((-1037598838) * i2);
        int i20 = i19 * i19;
        int i21 = ((i4 * (-727610197)) - 1081761860) + (i5 * (-727608285)) + (i12 * 956) + (i16 * (-956)) + (i18 * 956) + (i6 * (-727609241)) + (i7 * 1532828727) + (i2 * (-747900794)) + (i20 * 556466176);
        switch ((((-1556109539) * i4) - 925892608) + (470833381 * i5) + (i12 * (-1134012188)) + (1134012188 * i16) + ((-1134012188) * i18) + (1604845568 * i6) + ((-1691877376) * i7) + ((-393216000) * i2) + ((-1633878016) * i20) + (i21 * i21 * (-1911357440))) {
            case 1:
                h hVar = (h) objArr[0];
                CustomerAuthenticationCredentials customerAuthenticationCredentials = (CustomerAuthenticationCredentials) objArr[1];
                int i22 = 2 % 2;
                int i23 = C + 43;
                B = i23 % 128;
                int i24 = i23 % 2;
                if (hVar.f21898p == null) {
                    WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
                    Object[] objArr2 = new Object[1];
                    O((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 9170), 30 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 8 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr2);
                    throw new WalletValidationException(walletValidationErrorCode, ((String) objArr2[0]).intern());
                }
                if (hVar.f21903x == null) {
                    WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.WrongState;
                    Object[] objArr3 = new Object[1];
                    O((char) (8685 - Color.green(0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 559, 13 - KeyEvent.normalizeMetaState(0), objArr3);
                    String strIntern = ((String) objArr3[0]).intern();
                    Object[] objArr4 = new Object[1];
                    O((char) View.MeasureSpec.getMode(0), 572 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "", 0) + 31, objArr4);
                    throw new WalletValidationException(walletValidationErrorCode2, strIntern, ((String) objArr4[0]).intern());
                }
                if (customerAuthenticationCredentials == null) {
                    WalletValidationErrorCode walletValidationErrorCode3 = WalletValidationErrorCode.Mandatory;
                    Object[] objArr5 = new Object[1];
                    O((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), TextUtils.lastIndexOf("", '0', 0) + 604, 33 - (Process.myPid() >> 22), objArr5);
                    throw new WalletValidationException(walletValidationErrorCode3, ((String) objArr5[0]).intern());
                }
                o.i.d dVar = new o.i.d();
                o.ad.b bVar = new o.ad.b();
                new o.bz.b();
                bVar.a(hVar.f21898p, dVar, o.bz.b.d(customerAuthenticationCredentials), null);
                hVar.f21903x.b(dVar);
                int i25 = C + 109;
                B = i25 % 128;
                int i26 = i25 % 2;
                return null;
            case 2:
                return d(objArr);
            case 3:
                return b(objArr);
            case 4:
                h hVar2 = (h) objArr[0];
                int i27 = 2 % 2;
                if (hVar2.f21898p == null) {
                    WalletValidationErrorCode walletValidationErrorCode4 = WalletValidationErrorCode.WrongState;
                    Object[] objArr6 = new Object[1];
                    O((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 9170), 'M' - AndroidCharacter.getMirror('0'), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 7, objArr6);
                    throw new WalletValidationException(walletValidationErrorCode4, ((String) objArr6[0]).intern());
                }
                if (hVar2.f21899s == null) {
                    WalletValidationErrorCode walletValidationErrorCode5 = WalletValidationErrorCode.WrongState;
                    Object[] objArr7 = new Object[1];
                    O((char) (Color.green(0) + 8685), 559 - (ViewConfiguration.getScrollBarSize() >> 8), KeyEvent.normalizeMetaState(0) + 13, objArr7);
                    String strIntern2 = ((String) objArr7[0]).intern();
                    Object[] objArr8 = new Object[1];
                    O((char) ExpandableListView.getPackedPositionType(0L), 572 - View.MeasureSpec.makeMeasureSpec(0, 0), 32 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr8);
                    throw new WalletValidationException(walletValidationErrorCode5, strIntern2, ((String) objArr8[0]).intern());
                }
                if (o.ea.f.a()) {
                    int i28 = B + 25;
                    C = i28 % 128;
                    int i29 = i28 % 2;
                    Object[] objArr9 = new Object[1];
                    O((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 17 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr9);
                    String strIntern3 = ((String) objArr9[0]).intern();
                    Object[] objArr10 = new Object[1];
                    O((char) (19784 - (Process.myPid() >> 22)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + IptcDirectory.TAG_AUDIO_SAMPLING_RESOLUTION, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 13, objArr10);
                    o.ea.f.c(strIntern3, ((String) objArr10[0]).intern());
                    int i30 = C + 111;
                    B = i30 % 128;
                    int i31 = i30 % 2;
                }
                if (hVar2.f21901u) {
                    hVar2.f21899s.a(hVar2.f21898p, hVar2);
                    return null;
                }
                WalletValidationErrorCode walletValidationErrorCode6 = WalletValidationErrorCode.WrongState;
                Object[] objArr11 = new Object[1];
                O((char) ((ViewConfiguration.getTouchSlop() >> 8) + 8685), (ViewConfiguration.getJumpTapTimeout() >> 16) + 559, (Process.myPid() >> 22) + 13, objArr11);
                String strIntern4 = ((String) objArr11[0]).intern();
                Object[] objArr12 = new Object[1];
                O((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + IptcDirectory.TAG_TIME_CREATED, 30 - TextUtils.lastIndexOf("", '0'), objArr12);
                throw new WalletValidationException(walletValidationErrorCode6, strIntern4, ((String) objArr12[0]).intern());
            case 5:
                return e(objArr);
            case 6:
                return a(objArr);
            case 7:
                return c(objArr);
            default:
                h hVar3 = (h) objArr[0];
                o.bg.c cVar = (o.bg.c) objArr[1];
                int i32 = 2 % 2;
                if (o.ea.f.a()) {
                    int i33 = C + 39;
                    B = i33 % 128;
                    int i34 = i33 % 2;
                    Object[] objArr13 = new Object[1];
                    O((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18, objArr13);
                    String strIntern5 = ((String) objArr13[0]).intern();
                    Object[] objArr14 = new Object[1];
                    O((char) View.resolveSizeAndState(0, 0, 0), 1635 - (ViewConfiguration.getFadingEdgeLength() >> 16), 23 - View.MeasureSpec.getSize(0), objArr14);
                    o.ea.f.c(strIntern5, ((String) objArr14[0]).intern());
                }
                if (o.dc.d.c(cVar)) {
                    int i35 = C + 89;
                    B = i35 % 128;
                    int i36 = i35 % 2;
                    hVar3.i();
                    int i37 = B + 11;
                    C = i37 % 128;
                    int i38 = i37 % 2;
                }
                WalletManagerCallback walletManagerCallback = hVar3.f21900t;
                if (walletManagerCallback == null) {
                    return null;
                }
                walletManagerCallback.onAsyncRequestError(AsyncRequestType.CheckCredentials, c.b(cVar).a());
                return null;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) throws Throwable {
        h hVar = (h) objArr[0];
        CustomerAuthenticationMethodType customerAuthenticationMethodType = (CustomerAuthenticationMethodType) objArr[1];
        CustomerAuthenticationCredentials customerAuthenticationCredentials = (CustomerAuthenticationCredentials) objArr[2];
        int i2 = 2 % 2;
        int i3 = B + 31;
        C = i3 % 128;
        int i4 = i3 % 2;
        if (hVar.f21898p == null) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr2 = new Object[1];
            O((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 9170), MotionEvent.axisFromString("") + 30, 7 - Color.argb(0, 0, 0, 0), objArr2);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr2[0]).intern());
        }
        if (hVar.f21903x == null) {
            WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.WrongState;
            Object[] objArr3 = new Object[1];
            O((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8685), ((Process.getThreadPriority(0) + 20) >> 6) + 559, TextUtils.indexOf("", "") + 13, objArr3);
            String strIntern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            O((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), Gravity.getAbsoluteGravity(0, 0) + IptcDirectory.TAG_TIME_CREATED, 31 - View.getDefaultSize(0, 0), objArr4);
            throw new WalletValidationException(walletValidationErrorCode2, strIntern, ((String) objArr4[0]).intern());
        }
        if (customerAuthenticationMethodType == null) {
            WalletValidationErrorCode walletValidationErrorCode3 = WalletValidationErrorCode.Mandatory;
            Object[] objArr5 = new Object[1];
            O((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 636 - (ViewConfiguration.getJumpTapTimeout() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 27, objArr5);
            throw new WalletValidationException(walletValidationErrorCode3, ((String) objArr5[0]).intern());
        }
        if (customerAuthenticationCredentials == null) {
            WalletValidationErrorCode walletValidationErrorCode4 = WalletValidationErrorCode.Mandatory;
            Object[] objArr6 = new Object[1];
            O((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 636 - (ViewConfiguration.getFadingEdgeLength() >> 16), 29 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr6);
            throw new WalletValidationException(walletValidationErrorCode4, ((String) objArr6[0]).intern());
        }
        new o.bz.b();
        o.g.a aVarD = o.bz.b.d(customerAuthenticationCredentials);
        o.ad.b bVar = new o.ad.b();
        o.i.d dVar = new o.i.d();
        bVar.a(hVar.f21898p, dVar, aVarD, null);
        hVar.f21903x.a(dVar);
        int i5 = B + 81;
        C = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 97 / 0;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r7v13, types: [int] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.content.Context] */
    private static void b(Context context) throws Throwable {
        ?? MaxMemory;
        boolean z2;
        ?? r7;
        String strIntern;
        int i2 = 2 % 2;
        int i3 = C + 109;
        B = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        O((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), ExpandableListView.getPackedPositionChild(0L) + 1, 18 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
        String strIntern2 = ((String) objArr[0]).intern();
        Object obj = null;
        if (o.en.b.c().s()) {
            Object[] objArr2 = {o.en.b.c()};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int priority = Thread.currentThread().getPriority();
            int i5 = o.en.b.f24088c * (-1721916949);
            o.en.b.f24088c = i5;
            Object[] objArr3 = {((o.fm.g) o.en.b.a(-568976488, elapsedCpuTime, objArr2, iUptimeMillis, 568976490, priority, i5)).e(), o.en.e.f24190c};
            MaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i6 = o.fm.h.f26083c * (-966280673);
            o.fm.h.f26083c = i6;
            int i7 = o.fm.h.f26084d * 1253296810;
            o.fm.h.f26084d = i7;
            if (!((Boolean) o.fm.h.c(-1003639645, objArr3, Process.myTid(), 1003639646, MaxMemory, i7, i6)).booleanValue()) {
                int i8 = C + 101;
                B = i8 % 128;
                if (i8 % 2 != 0) {
                    o.ea.f.a();
                    throw null;
                }
                if (o.ea.f.a()) {
                    Object[] objArr4 = new Object[1];
                    O((char) TextUtils.getOffsetAfter("", 0), ((Process.getThreadPriority(0) + 20) >> 6) + 2379, TextUtils.indexOf("", "", 0, 0) + 75, objArr4);
                    o.ea.f.c(strIntern2, ((String) objArr4[0]).intern());
                    return;
                }
                return;
            }
        }
        try {
            MaxMemory = context;
            Object[] objArr5 = new Object[1];
            O((char) KeyEvent.getDeadChar(0, 0), 1847 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 39, objArr5);
            z2 = Boolean.parseBoolean(m.d((Context) MaxMemory, ((String) objArr5[0]).intern()));
            r7 = MaxMemory;
        } catch (PackageManager.NameNotFoundException unused) {
            if (o.ea.f.a()) {
                Object[] objArr6 = new Object[1];
                O((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2454, 80 - (Process.myPid() >> 22), objArr6);
                o.ea.f.c(strIntern2, ((String) objArr6[0]).intern());
                int i9 = C + 63;
                B = i9 % 128;
                int i10 = i9 % 2;
            }
            z2 = true;
            r7 = MaxMemory;
        }
        if (z2) {
            try {
                if (r7 instanceof Activity) {
                    Activity activity = (Activity) r7;
                    o.ea.c.a();
                    NfcAdapter nfcAdapterE = o.ea.b.e(r7);
                    if (nfcAdapterE == null) {
                        int i11 = C + 29;
                        B = i11 % 128;
                        int i12 = i11 % 2;
                        if (o.ea.f.a()) {
                            Object[] objArr7 = new Object[1];
                            O((char) (ViewConfiguration.getEdgeSlop() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 2534, 78 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr7);
                            o.ea.f.c(strIntern2, ((String) objArr7[0]).intern());
                        }
                        int i13 = B + 99;
                        C = i13 % 128;
                        if (i13 % 2 != 0) {
                            return;
                        }
                        obj.hashCode();
                        throw null;
                    }
                    CardEmulation cardEmulation = CardEmulation.getInstance(nfcAdapterE);
                    if (cardEmulation == null) {
                        if (o.ea.f.a()) {
                            Object[] objArr8 = new Object[1];
                            O((char) (53111 - TextUtils.getOffsetBefore("", 0)), 2612 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 68 - (ViewConfiguration.getScrollBarSize() >> 8), objArr8);
                            o.ea.f.d(strIntern2, ((String) objArr8[0]).intern());
                            return;
                        }
                        return;
                    }
                    if (!cardEmulation.unsetPreferredService(activity)) {
                        if (o.ea.f.a()) {
                            Object[] objArr9 = new Object[1];
                            O((char) (KeyEvent.getMaxKeyCode() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 2734, (ViewConfiguration.getJumpTapTimeout() >> 16) + 64, objArr9);
                            o.ea.f.c(strIntern2, ((String) objArr9[0]).intern());
                            return;
                        }
                        return;
                    }
                    int i14 = C + 111;
                    B = i14 % 128;
                    int i15 = i14 % 2;
                    if (o.ea.f.a()) {
                        Object[] objArr10 = new Object[1];
                        O((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 2680 - (ViewConfiguration.getTouchSlop() >> 8), 52 - Process.getGidForName(""), objArr10);
                        o.ea.f.c(strIntern2, ((String) objArr10[0]).intern());
                        return;
                    }
                    return;
                }
            } catch (IllegalArgumentException | IllegalStateException e2) {
                if (o.ea.f.a()) {
                    Object[] objArr11 = new Object[1];
                    O((char) TextUtils.indexOf("", "", 0), 2854 - View.MeasureSpec.makeMeasureSpec(0, 0), 48 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr11);
                    o.ea.f.c(strIntern2, String.format(((String) objArr11[0]).intern(), e2.getMessage()));
                    return;
                }
                return;
            }
        }
        if (o.ea.f.a()) {
            int i16 = B + 53;
            C = i16 % 128;
            if (i16 % 2 == 0) {
                Object[] objArr12 = new Object[1];
                O((char) (29164 - Color.argb(0, 1, 0, 1)), 785 >> (ViewConfiguration.getScrollFriction() > 2.0f ? 1 : (ViewConfiguration.getScrollFriction() == 2.0f ? 0 : -1)), 36 >> View.getDefaultSize(1, 1), objArr12);
                strIntern = ((String) objArr12[0]).intern();
            } else {
                Object[] objArr13 = new Object[1];
                O((char) (3601 - Color.argb(0, 0, 0, 0)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2796, View.getDefaultSize(0, 0) + 57, objArr13);
                strIntern = ((String) objArr13[0]).intern();
            }
            o.ea.f.c(strIntern2, strIntern);
        }
    }

    private void b(o.en.b bVar) throws Throwable {
        int i2 = f21893o * (-1451382028);
        f21893o = i2;
        int i3 = f21894q * 617464644;
        f21894q = i3;
        int iMyTid = Process.myTid();
        b((int) SystemClock.uptimeMillis(), i2, new Object[]{this, bVar}, -1797244309, 1797244316, i3, iMyTid);
    }

    private static /* synthetic */ Object c(Object[] objArr) throws Throwable {
        h hVar = (h) objArr[0];
        o.en.b bVar = (o.en.b) objArr[1];
        if (o.ea.f.a()) {
            Object[] objArr2 = new Object[1];
            O((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (Process.getThreadPriority(0) + 20) >> 6, 18 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            O((char) (6093 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 344 - TextUtils.indexOf("", ""), TextUtils.lastIndexOf("", '0', 0) + 14, objArr3);
            o.ea.f.c(strIntern, ((String) objArr3[0]).intern());
        }
        synchronized (hVar.f21902w) {
            if (o.ea.f.a()) {
                Object[] objArr4 = new Object[1];
                O((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), Process.myTid() >> 22, 19 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr4);
                String strIntern2 = ((String) objArr4[0]).intern();
                Object[] objArr5 = new Object[1];
                O((char) (34983 - View.getDefaultSize(0, 0)), 357 - View.MeasureSpec.getMode(0), 23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr5);
                o.ea.f.c(strIntern2, ((String) objArr5[0]).intern());
            }
            if (hVar.f21898p == null) {
                if (o.ea.f.a()) {
                    Object[] objArr6 = new Object[1];
                    O((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "", 0) + 18, objArr6);
                    String strIntern3 = ((String) objArr6[0]).intern();
                    Object[] objArr7 = new Object[1];
                    O((char) (54040 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 380 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 61 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr7);
                    o.ea.f.c(strIntern3, ((String) objArr7[0]).intern());
                }
                return null;
            }
            if (hVar.f21903x == null) {
                hVar.f21903x = new o.cb.a(hVar.f21898p, hVar, bVar);
            }
            if (hVar.f21904y == null) {
                hVar.f21904y = new o.cf.b(hVar.f21898p, hVar, bVar);
            }
            if (!f21895r.get()) {
                Object[] objArr8 = {hVar, hVar.f21898p};
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int iMyPid = Process.myPid();
                int i2 = f21887i * 1259342723;
                f21887i = i2;
                b(Thread.currentThread().getPriority(), iElapsedRealtime, objArr8, -2014243530, 2014243532, iMyPid, i2);
            }
            new f(hVar.f21898p, bVar).start();
            WalletManagerCallback walletManagerCallback = hVar.f21900t;
            if (walletManagerCallback != null) {
                walletManagerCallback.onConnectionSuccess(new Wallet(bVar));
            }
            return null;
        }
    }

    private void c(Context context) throws Throwable {
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int iMyPid = Process.myPid();
        int i2 = f21887i * 1259342723;
        f21887i = i2;
        b(Thread.currentThread().getPriority(), iElapsedRealtime, new Object[]{this, context}, -2014243530, 2014243532, iMyPid, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x016b, code lost:
    
        if ((r2.f21898p instanceof android.app.Activity) != true) goto L132;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object d(java.lang.Object[] r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 950
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.by.h.d(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:318:0x0ba2, code lost:
    
        if ((r10 + 2001) >= ((java.lang.Long) java.lang.Class.forName(r13).getDeclaredMethod(r4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) goto L294;
     */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0c30 A[Catch: all -> 0x17d3, TryCatch #2 {all -> 0x17d3, blocks: (B:322:0x0c11, B:324:0x0c30, B:325:0x0c79), top: B:466:0x0c11 }] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0c8b  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0ced  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x12fd  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x1306  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object e(java.lang.Object[] r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6151
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.by.h.e(java.lang.Object[]):java.lang.Object");
    }

    static void init$0() {
        $$a = new byte[]{8, -110, 120, 122};
        $$b = 98;
    }

    static void init$1() {
        $$d = new byte[]{120, -15, 89, -97, 60, MessagePack.Code.EXT16, -5, 46, MessagePack.Code.EXT8, 57, -18, 60, MessagePack.Code.BIN8, -18, Utf8.REPLACEMENT_BYTE, -79, 79, -21, 60, MessagePack.Code.BIN8, -18, Utf8.REPLACEMENT_BYTE, MessagePack.Code.BIN16, 59, -19, 60, MessagePack.Code.BIN32, -22, 65, MessagePack.Code.EXT8, 57, -68, 60, MessagePack.Code.BIN32, -9, 52, MessagePack.Code.EXT16, 60, MessagePack.Code.BIN32, -22, 65, MessagePack.Code.EXT8, 57, -66};
        $$e = 126;
    }

    static void init$2() {
        $$c = new byte[]{Utf8.REPLACEMENT_BYTE, -81, -107, -8};
        $$f = 118;
    }

    public /* synthetic */ void q() {
        int i2 = 2 % 2;
        WalletManagerCallback walletManagerCallback = this.f21900t;
        if (walletManagerCallback != null) {
            walletManagerCallback.onAsyncRequestSuccess(AsyncRequestType.Delete);
            int i3 = B + 117;
            C = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = C + 107;
        B = i5 % 128;
        int i6 = i5 % 2;
    }

    static void t() {
        char[] cArr = new char[3152];
        ByteBuffer.wrap("\u0094»\u009b\u001f\u008b\u009aº\u001eª\u008cÙ*É\u0081ø\u000bè\u0086\u001f\f\u000f\u0098>\u001e.·];M¹|8l§\u00933L_CÐSTbÆrD\u0001Á\u0011[ Ê0PÇÈ×P·c¸Ì¨H\u0099Ý\u0089Iú×êF~\u0012q\u009ea\u0011P\u0088@\u00103\u0095#\u0005\u0012È\u0002\u0004õ\u009båCÔ\u0081Ä.·§§-\u0096»\u0086.y\u0083i)X¥H,;§\u0094\u0097\u009b\u001d\u008b\u0095º\u000bª\u008dÙ\u0018É\u0084ø5è\u008f\u001f\b\u000f\u0080>'.¿]8M½\u0094\u0098\u009b\u0010\u008b\u0082º\u001aªÐÙ\u0011É\u0081ø\tè\u008d\u001fG\u000f¿>*.¥]!M½|2TÈ[FKÂzFjÙ\u0019G\tÇ8M(ñß[ÏÌþhîÆ\u009di\u008dï¼i\u0094\u0093\u009b\u001f\u008b\u0090º\tª\u0091Ù\u0014É\u0084øIè\u008b\u001f\u0019\u000f\u009c>}.\u0097]6M¬|6l´\u0093(\u0083°²2¢\u009aÑ%ÁÂðRàÛ\u0017]\u0094\u0091\u009b\u0004\u008b\u0086º\tª\u009bÙ\u0013É\u0094ø&è\u009a\u001f\u0019\u000f\u0080>:.µ]4M¬|6l\u00ad\u0093/Rã]lMè|glé\u001fl\u000fæ>=.±Ù;É³ø\u0001èó\u009bF\u008bÆºAªÕUGEàtXdÐ\u0017V\u0007¦6$&¼Ñ\"Á¡ð?à\u0091\u0093/\u0083¹²8¢\u0090\u00ad\u0017]\u008fL\u0006|\u0082oO\u001fß\u000eU>¼)\u0014Ù\u0093Éàømèé\u009b*\u008b·º0ªÐUyE÷thdú\u0017Z\u0007ÑE\u0086J\u0011ZÈk\b{\u0082\b\u001b\u0018\u0097)\u00199\u0097Î\u000bÞÐï2ÿ \u008c,\u009cä\u00ad%½½B Røc\u0018s²\u0000+\u0010Ç!I1ÇÆ[Öæç\\÷Ç\u0084z\u0094ß¥NµóºbJá[lkÙx{\bû\u0019y\u0094\u0094\u009b\u0003\u008bÚº\u001aª\u0090Ù\tÉ\u0085ø\u000bè\u0085\u001f\u0019\u000fÂ> .²]>Mö|;l«\u0093&\u0083\u00ad²?¢¯Ñ!ÁÓðVàÈ\u0017]\u0007\u00926p&ÃUFEÝt]d÷kG\u009bý\u008aiºê©hÙáÈkøÉïh\u001fþ\u000f\u0097>8.\u0080]\u0015M\u009d|\u0007l\u0093\u0093 \u0083\u0082²\u001d¢\u009dÑ<Á¶ð#\u0094Ã\u009bG\u008b\u00887e8þ(e\u0019é\tqçãèløèÉgÙéªlºæ\u008b5\u009bìlt|¾M`]Ê.S>Ï\u000fA\u001fßàCð\u0096ÁqÑÿ¢z²â\u0083(\u0093©d%t¯E6U±&%6ú\u0007s\u0017Î\u0018M\u0083O\u008cÓ\u009cJ\u00adÂ½pÎßÞCïÄÿB\bÇ\u0018U)¶92\u001c%\u0013¹\u0003 2¨\"\u001aQµA)p®`(\u0097\u00ad\u0087?¶Ü¦XÕÒÅRôØä\f\u001b\u0088\u000bC:\u009f*\fY\u0087G\u009aH\u0006X\u009fi\u0017y¥\n\n\u001a\u0096+\u0011;\u0097Ì\u0012Ü\u0080ícýç\u008em\u009eí¯g¿\u008d@8P°a?q³\u0002!\u0012þ#N3ÎÄHÔÀåZõÊ\u0086T\u0096ß§Y·Ï¸qHïYfiözq\nñ\u001bp+ü<1Ì¹ÜËí*ý\u0082\u008e\r\u009e\u0086¯\u0013¿\u0097@\\PÉaVq¶\u0002'\u0012¡#63¤Ä<Ô¯\u0094·\u009b\u001f\u008b\u0080º\u001eª\u008cÙ]É\u0084ø\u000eè\u0099\u001f\n\u000f\u0083>=.¸]0M»|+lê\u0093h\u0083ä²q¢îÑ\u0004ÁÞðDàÎ\u0017X\u0007Ò6@&ÃU\u0005E\u0092t\u000f\u0094Ò\u009b2\u008b\u0095º\u0017ª\u0092Ù\u001fÉ\u0081ø\u0004è\u0081\u001fI\u0094\u0096\u009b\u0018\u008b\u0087º\u0018ª\u0091Ù\u0013É\u008eø\u0002è\u0089\u001f\u001d\u000fÌ>5.¤]:Mµ|\u007fl\u0083\u0093/\u0083°².¢¢Ñ\"ÁÀð\u0017àí\u0017X\u0007Ð6O&ÃUQE\u0088tBdók\u007f\u009bõ\u008a|ºû©oÙ È)ø¤ï'\u0094·\u009b\t\u008b\u009dº\u000fªÞÙ\u0019É\u0089ø\u0014è\u0089\u001f\u0006\u000f\u0082>=.³]6M¬|wlë\u0094\u0091\u009b\u001d\u008b\u0091º\u001aª\u0090\u0094\u0091\u009b\u001d\u008b\u0091º\u001aª\u0090Ù]ÉÍøGè\u0083\u001f\u0007\u000fÌ> .³]8µHºýªu\u009bú\u008bvøäè@ÙëÉi>å.f\u001fÛ\u000fI\u0094¥\u009b\u0010\u008b\u0098º\u0017ª\u009bÙ\tÉÀø*è\u008b\u001f\u0007\u000f\u008d>4.³]'Mø|6l±\u0093a\u0083ª²$¢ºÑmÁÓðXàÔ\u0017W\u0007Ù6@&ÒU@EÌ\u0094±\u009b\u0004\u008b\u0087º\u000fª\u0091Ù\u0010É\u0085ø\u0015è«\u001f\u001c\u000f\u0098>;.³];M¬|6l¡\u0093 \u0083°²\"¢¡Ñ#ÁóðEàß\u0017]\u0007Ù6M&ÒULEÉtCdá\u0094±\u009b\u0004\u008b\u0087º\u000fª\u0091Ù\u0010É\u0085ø\u0015è«\u001f\u001c\u000f\u0098>;.³];M¬|6l¡\u0093 \u0083°²\"¢¡Ñ#ÁýðRàÎ\u0017Q\u0007Ó6GÙÿÖWÆÈ÷VçÄ\u0094\u0015\u0084Äµ@¥ÅRNBÑsoc¶\u00104\u0094\u0081\u009b\u0014\u008b\u0080º8ª\u008bÙ\u000eÉ\u0094ø\bè\u0087\u001f\f\u000f\u009e>\u0010.¤]0M¼|:l¬\u00935\u0083\u00ad²*¢¢Ñ>ÁöðXàÈ\u0017m\u0007Î6B&ÈUVEÉtLdækx\u009bû\u008auº¶©4Ù È*øªïz\u001fé\u000f\u0087>\u0002.\u009c]\u0016M\u0098|\u0011lÁ\u0093\u0007\u0083\u0099²\u000b¢\u0089Ñ5Á¹ð.à°\u0017=\u0007¯65\u0094\u0091\u009b\u0010\u008b\u009aº\u0018ª\u009bÙ\u0011É¯ø\tè\u008d\u001f\u0006\u000f\u0085>=.±]\u0001Mª|>l¬\u00932\u0083¥²(¢ºÑ$ÁßðYà\u0092\u0017\u0010\u0094¥\u009b\u0010\u008b\u0098º\u0017ª\u009bÙ\tÉ¬ø\bè\u0089\u001f\u0002\u000f¾>6.·]&M·|1BaMã]olé|}\u000fï\u001f?.¹>=É³Ù;èóø@\u008bÎ\u009bCªÍºAEàURdÐtP\u0007Þ\u0017&&´6$Á¡Ñ%à\u0091ð)\u0083±\u0093:¢¨²\u0011½\u008fM\f\\\u0082lI\u007fÇ\u000fW\u001e´.\u00129\u0093É\u001aÙmèïø\"\u008bµ\u009b(ªÖºyEýUhdütb\u0007Ó\u0094\u0096\u009b\u0014\u008b\u0098º\u001eª\u008aÙ\u0018ÉÈøNèÊ\u001fD\u000fÌ>2.¸]!M½|3l\u00ad\u00931\u0083\u0093²*¢¢Ñ!ÁÕðCà÷\u0017X\u0007Ò6B&ÁU@EÚt\u000fdûkb\u009b´\u008auºë©qÙìÈ'ø§ï7\u001f¬\u000f¿>\u0019.\u0096]\u0019M\u0093|Bl®\u0093\n\u0083\u0087²\u0017\u000ba\u0004ã\u0014o%é5}FïV?g¹w=\u0080³\u0090;¡Å±OÂÖÒJãÄóZ\fÆ\u001cd-Ý=UNÖ^\"o´\u007f\u0000\u0088¯\u0098%©µ¹6Ê·Ú-ëøû\u000bô\u0089\u0004\u0017\u0015Ì%\u00076\u009fF\u001bW\u009cg]pÓ\u0080E\u0090$¡Â±cÂãÒdãµót\fò\u001c\u007f-ò=\u007fNÉ^D\u0094¾\u009b\u001e\u008b\u0093º\u0014ª\u008bÙ\tÉÀø!è«\u001f \u000f >\u0006.\u0084]\u0010ØÄ×IÇÌöCæÈ\u0095\u001c\u0085\u009f´\u0005¤\u0094S_C\u009fr7b²\u0011,\u0001¼0t \u008fQ¾^1\u0094¯(F'æ7k\u0006ì\u0016señu8DÌTG£Ò³W\u0082î\u0092}áþÝ!Ò\u008eÂ\nó\u0085ã\u000b\u0090\u008e\u0080\u0004±\u009e¡\u0015V\u0097F\\w·g)\u0014å\u0004\t5¡%&Ú´Ê8û´ë.\u0098ý\u0088h¹ä©o^\u0089NA\u007fÒoX\u001cÔ\f_=Ú-p\"¡ÒWÃÞóMàÎ\u0090U\u0081Ä±I\u0094³\u009b\u001f\u008b\u0080º\u001eª\u0092Ù\u0012É\u0090øGè¢\u001f*\u000f©>s.»]4M¶|>l¥\u0093$\u0083¶²k¢\u00adÑ\"ÁÞðYàß\u0017Z\u0007È6J&ÉUKE\u0088tidÓkX\u009bØ\u008aNºÌ©XÙ Èpøãï}\u001fä\u000fÓ>\u0004.\u0090]\u0019M\u008c|\rl\u008f\u0093Y\u0083°\u0094Ò\u009b_\u008bÚºUªÞÙ\u001cÉ\u008eø\u0003èÊ\u001f\f\u000f\u009e>!.¹]'Må|\u0004\u0094³\u009b\u001f\u008b\u0080º\u001eª\u0092Ù\u0012É\u0090øGè¢\u001f*\u000f©>s.»]4M¶|>l¥\u0093$\u0083¶²k¢\u00adÑ\"ÁÞðYàß\u0017Z\u0007È6J&ÉUKE\u0088tidÓkX\u009bØ\u008aNºÌ©XÙ¬È'øéï{\u001fé\u000f\u0097>\u0013.\u009b]\fM\u0096|\u0003l\u008d\u0093\u0017\u0083Ë²<¢\u0088Ñ!Á¢ð3à«\u00179\u0007§\u0094\u0091\u009b\u0003\u008b\u0091º\u001fª\u009bÙ\u0013É\u0094ø\u000eè\u008b\u001f\u0005\u000f\u009f>s.¿];M®|>l®\u0093(\u0083 ²\"¢ºÑ4Á\u0090ðRàÈ\u0017K\u0007Ó6Q&\u0086UQEÇt\u000fdðkt\u009b´\u008arºð©yÙéÈdøëï}\u001fé\u000f\u0097\u0094¦\u009b\u0019\u008b\u0091º[ª\u008eÙ\u000fÉ\u008fø\u0011è\u0083\u001f\r\u000f\u0089>7.ö] M«|:l°\u0093a\u0083¥²>¢ºÑ%ÁÕðYàÎ\u0017P\u0007ß6B&ÒULEÇtAd²kr\u009bæ\u008a~ºú©xÙîÈsøãïh\u001fà\u000f\u0080>V.\u0091]\u0017Mß|\fl\u008e\u0093\u0010\u0083Ë²\u0003¢\u008cÑ$Á´ð2àù\u0017+\u0007ª62&\u00adUhE»tZdÔk\u0014\u009bÔ\u008aPºØ©SÙ\u0087ÈIøÜï^\u001fá\u000es>û-l]óL{|¡cw\u0093î\u0082z\u0094\u0086\u009b\u0019\u008b\u0091º[ª\u008eÙ\u000fÉ\u008fø\u0011è\u0083\u001f\r\u000f\u0089>7.ö] M«|:l°\u0093a\u0083¥²>¢ºÑ%ÁÕðYàÎ\u0017P\u0007ß6B&ÒULEÇtAd²kr\u009bæ\u008a~ºú©xÙîÈsøãïh\u001fà\u000f\u0080>V.\u009d]\u0019M\u0089|\u0007lÁ\u0093\u0005\u0083\u0085²N¢\u0084Ñ>Á¡ð;àµ\u00175\u0007§6f&£U'E½t_dÐk@\u0094\u009d\u009b\u001f\u008bµº\u0015ª\u008aÙ\u0018É\u008cø\bè\u009a\u001f>\u000f\u008d>?.º]0M¬|\u0012l£\u0093/\u0083¥²,¢«Ñ?ÁÿðYàÖ\u0017P\u0007Ò6F&çUFEÜtFdäkp\u009bà\u008arºñ©sÙÏÈiøÍïf\u001få\u000f\u009d>\u0011t%{§k\rZ\u00adJ29 )4\u0018°\b\"ÿ\u0086ï5Þ\u0087Î\u0002½\u0088\u00ad\u0014\u009cª\u008c\u001bs\u0097c\u001dR\u0094B\u00131\u0087!G\u0010é\u0000d÷íçmÖõÆ{µÜ¥s\u0094ã\u0084C\u008bß{Mj×ZOIÊ9V(ð\u0018\\\u000föÿ[ï\"Þ Î*\u0094¾\u009b\u001e\u008b\u0097º\u0010ªÞÙ.Éµø$è©\u001f,\u000f¿>\u0000\u0094\u0085\u009b\u0010\u008b\u0098º\u0017ª\u009bÙ\tÉÀø\u000bè\u0085\u001f\n\u000f\u0087>:.¸]2Mø|7l£\u00932\u0083ä²-¢¯Ñ$ÁÜðRàÞ\u0094\u009d\u009b\u001f\u008b°º\u001eª\u0092Ù\u0018É\u0094ø\u0002è½\u001f\b\u000f\u0080>?.³]!M\u009b|0l¯\u00931\u0083¨².¢ºÑ(ÁÔð\u001fà\u0093ÊîÅlÕÄä`ôè\u0087m\u0097ø¦W¶ëA\u007fQû`EpË\u0003R\u0013Â\"M2ÝÍAÝäìMüÞ\u008f]\u009f¦®7¾º\u0094\u009d\u009b\u001f\u008b·º\u0013ª\u009bÙ\u001eÉ\u008bø$è\u0098\u001f\f\u000f\u0088>6.¸]!M±|>l®\u00932\u0083\u0082²*¢§Ñ!ÁÕðSà\u009a\u0017\u0003\u0007\u009c6T&ÔUJEÆtHd²kr\u009bæ\u008a~ºú©xÙîÈsøãïh\u001fà\u000f\u0080>V.\u009d]\u0019M\u0089|\u0007lÁ\u0093\u0006\u0083\u008e²\u000b¢\u0083ÑpÁ§ð(à¶\u0017*\u0007ª6\"& U,\u0094\u0085\u009b\u0003\u008b\u009bº\u0015ª\u0099Ù]É\u0083ø\u0015è\u008f\u001f\r\u000f\u0089>=.¢]<M¹|3l±\u0093a\u0083¬²*¢¸Ñ(Á\u0090ðUàß\u0017\\\u0007Ò6\u0003&ÖUWEÇtYdûku\u009bñ\u008a\u007f\u0094\u009d\u009b\u001f\u008b·º\u0013ª\u009bÙ\u001eÉ\u008bø$è\u0098\u001f\f\u000f\u0088>6.¸]!M±|>l®\u00932\u0083\u0081²9¢¼Ñ\"ÁÂ\u0094\u009d\u009b\u001f\u008b·º\u0013ª\u009fÙ\u0013É\u0087ø\u0002è©\u001f\u001b\u000f\u0089>7.³];M¬|6l£\u0093-\u0083·²\u0018¢»Ñ.ÁÓðRàÉ\u0017J\u0006\t\t\u008b\u0019#(\u00878\u000bK\u0087[\u0013j\u0096z=\u008d\u008f\u009d\u001d¬£¼'Ï¯ß8î¢þ7\u0001¹\u0011# \u009a0(C«SKbÑ\u0094\u009d\u009b\u001f\u008b§º\u0002ª\u0090Ù\u001eÉ\u0088ø\u0015è\u0085\u001f\u0007\u000f\u0085>).³]\u0016M®|2l\u0081\u00933\u0083¡²/¢«Ñ#ÁÄð^àÛ\u0017U\u0007Ï6p&ÓUFEËtJdákb\u0012\u009c\u001d\u001e\r¦<\u0003,\u0091_\u001fO\u0089~\u0014n\u0084\u0099\u0006\u0089\u0084¸(¨²Û\u0017Ë¯ú3ê\u0080\u00152\u0005 4.$ªW\"GÅv_fÚ\u0091T\u0081Î°g ÕÓVÃÆò\\ë0ä¤ô#Å¢Õ=¦¹¶5\u0087¥\u0097\u001c`¶p.A³Q\u0014\"\u00802\u000e\u0003\u008a\u0013\u0000ì\u0083ü\u0011Í\u009fÝ-®\u0098¾r\u008fñ\u009fchêxiI³Y;*µ:L\u000b÷\u001bG\u0014\u0081älõèÅkÖ\u008d¦`·Å\u0087U\u0090Ý`Ip A²Qe\"¡2<\u0003ò\u0013?ì»ü/ÍþÝ.®\u0095¾\u0017\u008f\u009a\u009f\u0006h\u009ex\u0007I\u0093Y\u0011*Ø:\u001d\u000bû\u001b!\u0014ðäcõëÅ-ÖÃ¦S·Ñ\u0094\u0094\u009b\u0003\u008bÚº\u001aª\u0090Ù\tÉ\u0085ø\u000bè\u0085\u001f\u0019\u000fÂ>#.¤]0M¾|:l°\u00933\u0083¡²/¢\u009dÑ(ÁÂðAàÓ\u0017Z\u0007Ù6l&ÈUcEÇt]d÷kv\u009bæ\u008atºë©sÙäª!¥µµ2\u0084³\u0094,ç¨÷$Æ´Ö\r!§1?\u0000¢\u0010\u0005c\u0091s\u001fB\u009bR\u0011\u00ad\u0092½\u0000\u008c\u008e\u009c<ï\u0089ÿcÎàÞr)û9x\b¢\u0018*k¤{dJïZ]UÙ¥S´ß\u0084L\u0097Èç\u0001öÂÆJÑÜ!L1r\u0000¹\u0010;c\u00ads~B°R%\u00ad±½f\u008cï\u009c/ï\u009eÿ\u0018Î\u0088Þ\u0011)\u00999\u0007\b\u0095\u0018\rk\u0087{\tJ³ZyUá¥:´ö\u0084o\u0097¡çcöåÆiÑï!^0Ò\u0000P\u0094\u0080\u009b\u0014\u008b\u0093º\u0012ª\u008dÙ\tÉ\u0085ø\u0015è¬\u001f\u0006\u000f\u009e>\u0003.¤]0M¾|:l°\u00933\u0083¡²/¢\u009dÑ(ÁÂðAàÓ\u0017Z\u0007Ù6\u0003&\u008bU\u0005EÆt@d²kc\u009bñ\u008a|º÷©nÙôÈuøëï}\u001få\u000f\u009c>\u0018.Õ]\bM\u0090|\u0011l\u0092\u0093\r\u0083\u0089²\u0002¢\u0088Ñ|Á÷ð4à¿\u0017?\u0007\u00826\"&¤U8E»tWdÃk\u0014\u009bÒ\u008aMº\u009d©NÙÒÈFøÅSÛ\\OLÈ}ImÖ\u001eR\u000eÞ?N/÷Ø]ÈÅùXéÿ\u009ak\u008aå»a«ëThDúuteÆ\u0016s\u0006\u00997\u001a'\u0088Ð\u0001À\u0082ñXáÐ\u0092^\u0082¦³\u001a£¨¬(\\£M%}ån2\u001e´\u000f|?¶(7Ø£È\u0088ùnéÏ\u009aQ\u008aÀ»|«×TJDÜuTeÂ\u0016b\u0006ã7o'¢ÐnÀöñnáê\u0092r\u0082ú³\n£\u008f\u0086J\u0089Ø\u0099E¨Þ¸SËÛÛ\\?00¤ #\u0011¢\u0001=r¹b5S¥C\u001c´¶¤.\u0095³\u0085\u0014ö\u0080æ\u000e×\u008aÇ\u00008\u0083(\u0011\u0019\u009f\t-z\u0098jr[ñKc¼ê¬i\u009d³\u008d;þµîyßüÏVÀÈ0R!Â\u0011Z\u0002Ôr\u0010cÅS_DÞ´U¤0\u0095²\u0085 öºæ*×¶)\u009a&\u000e6\u0089\u0007\b\u0017\u0097d\u0013t\u009fE\u000fU¶¢\u001c²\u0084\u0083\u0019\u0093¾à*ð¤Á Ñª.)>»\u000f5\u001f\u0087l2|ØM[]Éª@ºÃ\u008b\u0019\u009b\u0091è\u001føÓÉVÙüÖb&ø7h\u0007ð\u0014~dºu~EñR}¢ø²\u0086\u0083\u0018\u0093Ïà\u0005ð\u0080Á\fÑÛ.\f>\u0094\u000f\u0013\u001f\u009el9|¹M%]±ª#º½À\u0018Ï\u008cß\u000bî\u008aþ\u0015\u008d\u0091\u009d\u001d¬\u008d¼4K\u009e[\u0006j\u009bz<\t¨\u0019&(¢8(Ç«×9æ·ö\u0005\u0085°\u0095Z¤Ù´KCÂSAb\u009br\u0013\u0001\u009d\u0011Q Ô0~?àÏzÞêîrýü\u008d8\u009cö¬a»±Kz[\u0004j\u009azM\t\u0081\u0019\u000b(\u00968\u0016Ç\u008b×\u0016æ\u0092öU\u0085¼\u0095 ¤â´3C¡S<b·r.\u0001¤\u00112 Øî\u009aá\u000eñ\u0089À\bÐ\u0097£\u0013³\u009f\u0082\u000f\u0092¶e\u001cu\u0084D\u0019T¾'*7¤\u0006 \u0016ªé)ù»È5Ø\u0087«2»Ø\u008a[\u009aÉm@}ÃL\u0019\\\u0091/\u001f?Ü\u000eZ\u001e¨\u0011yáëðfÀíÓt£î²o\u0082ñ\u0095geÿu\u0086D\u0002TÏ'\u00127\u008a\u0006\u000b\u0016\u0088é\u0017ù\u0093È\u0018Ø\u0092bÍmY}ÞL_\\À/D?È\u000eX\u001eáéKùÓÈNØé«}»ó\u008aw\u009aýe~uìDbTÐ'e7\u008f\u0006\f\u0016\u009eá\u0017ñ\u0094ÀNÐÆ£H³Å\u0082\u0007\u0092§\u009d?m¼|&L§_9/¢>$\u0094\u0087\u009b\u001f\u008b\u0086º\u001eª\u0099Ù\u0014É\u0093ø\u0013è\u008f\u001f\u001b\u000fª><.¤]\u0005Mª|:l¤\u0093$\u0083¶²9¢«Ñ)ÁãðRàÈ\u0017O\u0007Õ6@&ÃU\u0005E\u0085t\u000fdÆky\u009bñ\u008a;ºÖ©^ÙÅÈ'øÚï{\u001fã\u000f\u0097>\u0003.\u0096]\fMß|\u000bl\u0092\u0093D\u0083\u0085²\u0001¢\u0099ÑpÁ¤ð/à©\u0017,\u0007¬64&±U-E«t\u0012dÓkM\u009b\u009b\u008aJºÕ©EÙ\u0087Èyøíïg\u0094\u0087\u009b\u001f\u008b\u0086º\u001eª\u0099Ù\u0014É\u0093ø\u0013è\u008f\u001f\u001b\u000fª><.¤]\u0005Mª|:l¤\u0093$\u0083¶²9¢«Ñ)ÁãðRàÈ\u0017O\u0007Õ6@&ÃU\u0005E\u0085t\u000fdÿkp\u009bú\u008arºø©xÙóÈsøªïm\u001fí\u000f\u0087>\u0017.Õ]\u0016M\u0090|\u0016lÁ\u0093\u0017\u0083\u008e²\u001a¢ÁÑpÁ´ð5à·\u0017/\u0007ª6\"& U:E¦t\\dÖk\u0014\u009bÒ\u008aJº\u009d©IÙÔÈ\nøÌïB\u001fò\u000et>ù-}]û\u0094\u0087\u009b\u001f\u008b\u0086º\u001eª\u0099Ù\u0014É\u0093ø\u0013è\u008f\u001f\u001b\u000fª><.¤]\u0005Mª|:l¤\u0093$\u0083¶²9¢«Ñ)ÁãðRàÈ\u0017O\u0007Õ6@&ÃU\u0005E\u0085t\u000fdük~\u009b´\u008anºð©oÙåÈ`øãïz\u001fø\u000f\u0081>\u0017.\u0081]\u0011M\u0090|\flÁ\u0093\u0014\u0083\u0084²\u001d¢\u009eÑ9Áµð6à¼\u0017p\u0007ã6(&£U+E\u008etVdÐkD\u009bÏ\u008a[ºÏ©\u0000ÙÎÈYø\u0089ïB\u001fæ\u000ez>ù[ðThDñuieî\u0016c\u0006ä7d'øÐlÀÝñKáÓ\u0092r\u0082Ý³M£Ó\\SLÁ}NmÜ\u001e^\u000e\u0094?%/¿Ø8È¢ù7é´\u009ar\u008aò»x«°¤\bT\u0082E\u000eu\u0085f\u000f\u0016×\u0007\u00047\u0092 ^Ð\u009cÀáñuá¢\u0092L\u0082é³g£ò\\VLñ}lmö\u001eF\u000eÔ?D/ÁØEÈ\u0094ùXéÜ\u009aL\u008aÌ»$«¨¤ T©\u0094\u0087\u009b\u001f\u008b\u0086º\u001eª\u0099Ù\u0014É\u0093ø\u0013è\u008f\u001f\u001b\u000fª><.¤]\u0005Mª|:l¤\u0093$\u0083¶²9¢«Ñ)ÁãðRàÈ\u0017O\u0007Õ6@&ÃU\u0005E\u0085t\u000fdókr\u009bà\u008arºè©tÙôÈ~øªï|\u001fâ\u000f\u0081>\u0013.\u0092]\u0011M\u008c|\u0016l\u0084\u0093\u0016\u0083\u008e²\n\u0094\u0087\u009b\u001f\u008b\u0086º\u001eª\u0099Ù\u0014É\u0093ø\u0013è\u008f\u001f\u001b\u000fª><.¤]\u0005Mª|:l¤\u0093$\u0083¶²9¢«Ñ)ÁãðRàÈ\u0017O\u0007Õ6@&ÃU\u0005E\u0085t\u000fdókr\u009bà\u008arºè©tÙôÈ~øªïj\u001fí\u000f\u009d>\u0018.\u009a]\fMß|\u0005l\u0084\u0093\u0010\u0083Ë²\u001b¢\u0083Ñ\"Á²ð=à°\u0017/\u0007·6#&·U-E«\u009a\u0096\u0095\u000e\u0085\u0097´\u000f¤\u0088×\u0005Ç\u0082ö\u0002æ\u009e\u0011\n\u0001»0- µS\u0014C»r+bµ\u009d5\u008d§¼?¬»ß\u000fÏÄþTîÝ\u0019A\tÎ8W(\u0097[\u0019K\u0099zPjìe \u0095ð\u0084d´ý§i×öÆ\u007föèál\u0011ï\u0001\u00830\u0013 \u008dS\u0006C\u0080rSb\u0080\u009d\u001a\u008d\u0089¼\f¬\u0095ß#Ïªþ.\u0094\u0087\u009b\u001f\u008b\u0086º\u001eª\u0099Ù\u0014É\u0093ø\u0013è\u008f\u001f\u001b\u000fª><.¤]\u0005Mª|:l¤\u0093$\u0083¶².¢ªÑ\u001eÁÕðEàÌ\u0017P\u0007ß6F&\u0086U\bE\u0088t\u000fd÷ki\u009b÷\u008a~ºî©iÙéÈhøäï)\u001f¶\u000fÓ>S.\u0086]X\u0094\u009d\u009b\u001f\u008b¡º\u000bª\u009aÙ\u001cÉ\u0094ø\u0002è¹\u001f\f\u000f\u0098>'.¿];M¿|,l\u0091\u00934\u0083§²(¢«Ñ>ÁÃ\u0094\u009d\u009b\u001f\u008b¡º\u000bª\u009aÙ\u001cÉ\u0094ø\u0002è¹\u001f\f\u000f\u0098>'.¿];M¿|,l\u0087\u00933\u0083¶²$¢¼ÑaÁ\u0090ðRàÈ\u0017K\u0007Ó6Q&\u0086U\u001fE\u00886À9W)\u008e\u0018N\bÄ{]kÑZ_JÑ½M\u00ad\u0096\u009ct\u008cæÿjï¢ÞjÎã1a!ø\u0010z\u0000ôsmc\u008dR\u0000B\u008fµ\u0019¥\u0081\u0094\u0018\u0084\u009c÷_ç\u008cÖ\tÆ©É(9°(;\u0018ä\u000b\n{¡j ZªM2½µ\u00adÂ\u009cP\u008câÿCïÅÞEÎÐ1^!Ë\u0010j\u0000ËskcîR~BùµJ¥â\u0094{\u0084ý÷xçþÖ\u0014_ªP(@\u008fq#aª\u0012+\u0002»3\u0011#¨Ô*Ä³õ\u0001å\u008f\u0096\u0016\u0086\u0086·\u000b§\u0094X\u0002H\u009ay\u0013i\u0097\u001a)\nò;c+îÜkÌøýgí±\u009e(\u008e¿\u0094\u009d\u009b\u001f\u008b¸º\u0014ª\u009dÙ\u001cÉ\u008cø&è\u009f\u001f\u001d\u000f\u0084>6.¸]!M±|<l£\u00935\u0083\u00ad²$¢ Ñ\u000bÁÑð^àÖ\u0017L\u0007Î6F&\u0086U\u001fE\u0088t\ndák1\u009b¹\u008a;ºì©xÙáÈtøåïg\u001f¬\u000fÖ>\u0005.Õ]UMß|\u000fl\u0084\u0093\u0017\u0083\u0098²\u000f¢\u008aÑ5Á÷ð\u007fàª\u0003Ú\fe\u001cí-'=ÊNB^Ùo;\u007fÆ\u0088g\u0098ÿ©K¹ßÊJÚÐë\u0003û×\u0004N\u0014\u0098%Y5ÝFEVìg8w³\u00805\u0090°¡0±¨Â-Ò±ã7óÎü\u000f\f\u0091\u001dG-\u0096>\tN\u0099_[o¥x1\u0088»".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 3152);
        f21896v = cArr;
        A = 5603114403045743473L;
    }

    @Override // o.bm.a.c
    public final void a() throws Throwable {
        int i2 = 2 % 2;
        int i3 = C + 7;
        B = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            O((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), Color.blue(0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 18, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            O((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), Gravity.getAbsoluteGravity(0, 0) + 1449, 12 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = B + 59;
            C = i5 % 128;
            int i6 = i5 % 2;
        }
        i();
        WalletManagerCallback walletManagerCallback = this.f21900t;
        if (walletManagerCallback != null) {
            int i7 = C + 43;
            B = i7 % 128;
            if (i7 % 2 == 0) {
                walletManagerCallback.onAsyncRequestSuccess(AsyncRequestType.Lock);
                return;
            }
            walletManagerCallback.onAsyncRequestSuccess(AsyncRequestType.Lock);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0017, code lost:
    
        if (r11.f21898p != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0019, code lost:
    
        o.en.b.c().z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0022, code lost:
    
        if (r11.f21904y == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0024, code lost:
    
        if (r12 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0026, code lost:
    
        new o.bz.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x002c, code lost:
    
        if (r13 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x002e, code lost:
    
        r3 = new o.ad.b();
        r2 = new o.i.d();
        r3.a(r11.f21898p, r2, o.bz.b.d(r13), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0041, code lost:
    
        r11.f21904y.c(o.m.i.b(r12), true, r2);
        r1 = o.by.h.C + 31;
        o.by.h.B = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0053, code lost:
    
        if ((r1 % 2) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0055, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0056, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x005a, code lost:
    
        if (r11.f21898p != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x005d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x005e, code lost:
    
        r4 = fr.antelop.sdk.exception.WalletValidationErrorCode.Mandatory;
        r0 = new java.lang.Object[1];
        O((char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.view.View.MeasureSpec.getMode(0) + 636, 27 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0'), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(r4, ((java.lang.String) r0[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0088, code lost:
    
        r5 = fr.antelop.sdk.exception.WalletValidationErrorCode.WrongState;
        r0 = new java.lang.Object[1];
        O((char) (8685 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1))), 559 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 12 - android.view.MotionEvent.axisFromString(""), r0);
        r4 = ((java.lang.String) r0[0]).intern();
        r0 = new java.lang.Object[1];
        O((char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + com.drew.metadata.iptc.IptcDirectory.TAG_TIME_CREATED, 31 - android.view.KeyEvent.getDeadChar(0, 0), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d8, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(r5, r4, ((java.lang.String) r0[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d9, code lost:
    
        r4 = fr.antelop.sdk.exception.WalletValidationErrorCode.WrongState;
        r0 = new java.lang.Object[1];
        O((char) (android.view.KeyEvent.normalizeMetaState(0) + 9170), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.RS, android.text.TextUtils.indexOf("", "") + 7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0101, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(r4, ((java.lang.String) r0[0]).intern());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(fr.antelop.sdk.authentication.CustomerAuthenticationMethodType r12, fr.antelop.sdk.authentication.CustomerAuthenticationCredentials r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.by.h.a(fr.antelop.sdk.authentication.CustomerAuthenticationMethodType, fr.antelop.sdk.authentication.CustomerAuthenticationCredentials):void");
    }

    @Override // o.bm.a.c
    public final void a(o.bg.c cVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = B + 9;
        C = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            int i5 = B + 43;
            C = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            O((char) View.getDefaultSize(0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 17, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            O((char) (ViewConfiguration.getScrollBarSize() >> 8), Drawable.resolveOpacity(0, 0) + 1461, View.getDefaultSize(0, 0) + 25, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        if (o.dc.d.c(cVar)) {
            i();
        }
        WalletManagerCallback walletManagerCallback = this.f21900t;
        if (walletManagerCallback != null) {
            walletManagerCallback.onAsyncRequestError(AsyncRequestType.Lock, c.b(cVar).a());
        }
    }

    @Override // o.c.e
    public final void a(o.en.b bVar, o.bg.c cVar, g gVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = C + 37;
        B = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            int i5 = B + 11;
            C = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            O((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 17, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            O((char) (18832 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 992 - ExpandableListView.getPackedPositionChild(0L), 41 - TextUtils.indexOf("", "", 0, 0), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i7 = C + 7;
            B = i7 % 128;
            int i8 = i7 % 2;
        }
        this.f21901u = true;
        int i9 = f21893o * (-1451382028);
        f21893o = i9;
        int i10 = f21894q * 617464644;
        f21894q = i10;
        int iMyTid = Process.myTid();
        b((int) SystemClock.uptimeMillis(), i9, new Object[]{this, bVar}, -1797244309, 1797244316, i10, iMyTid);
    }

    @Override // o.c.e
    public final void b() throws Throwable {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = C + 67;
            B = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            O((char) (Process.getGidForName("") + 1), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1, 18 - Color.argb(0, 0, 0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            O((char) (57528 - Color.red(0)), 1403 - View.combineMeasuredStates(0, 0), 46 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        int i5 = B + 69;
        C = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final void b(CustomerAuthenticationCredentials customerAuthenticationCredentials) throws Throwable {
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i2 = f21883e * 1504880926;
        f21883e = i2;
        int i3 = f21881c * (-803734112);
        f21881c = i3;
        b(Thread.activeCount(), iFreeMemory, new Object[]{this, customerAuthenticationCredentials}, 1439178664, -1439178663, i2, i3);
    }

    @Override // o.cb.c
    public final void b(o.bg.c cVar) throws Throwable {
        int i2 = f21882d * 2114051737;
        f21882d = i2;
        int iActiveCount = Thread.activeCount();
        int i3 = f21880b * 1558309492;
        f21880b = i3;
        int i4 = (-175593371) * f21879a;
        f21879a = i4;
        b(i4, i2, new Object[]{this, cVar}, -371983598, 371983598, iActiveCount, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04be  */
    @Override // o.cf.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(o.bg.c r22, boolean r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1891
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.by.h.b(o.bg.c, boolean):void");
    }

    @Override // o.ca.e
    public final void b(i iVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = C + 41;
        B = i3 % 128;
        if (i3 % 2 != 0) {
            o.ea.f.a();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            O((char) TextUtils.getTrimmedLength(""), ExpandableListView.getPackedPositionType(0L), Drawable.resolveOpacity(0, 0) + 18, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            O((char) (52023 - Color.blue(0)), 3020 - View.MeasureSpec.getSize(0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 31, objArr2);
            o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(iVar).toString());
            int i4 = C + 59;
            B = i4 % 128;
            int i5 = i4 % 2;
        }
        WalletManagerCallback walletManagerCallback = this.f21900t;
        if (walletManagerCallback != null) {
            walletManagerCallback.onLocalAuthenticationSuccess(iVar.d());
        }
    }

    @Override // o.bi.a.d
    public final void c() throws Throwable {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = C + 21;
            B = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            O((char) (Process.myTid() >> 22), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 18, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            O((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 1486 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 25 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = B + 5;
            C = i5 % 128;
            int i6 = i5 % 2;
        }
        i();
        WalletManagerCallback walletManagerCallback = this.f21900t;
        if (walletManagerCallback != null) {
            walletManagerCallback.onAsyncRequestSuccess(AsyncRequestType.Delete);
            int i7 = B + 43;
            C = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0017, code lost:
    
        if (r12.f21898p != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x001f, code lost:
    
        if (r12.f21903x == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0021, code lost:
    
        if (r13 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0023, code lost:
    
        if (r14 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0025, code lost:
    
        new o.bz.b();
        r5 = o.bz.b.d(r14);
        r4 = o.bz.b.d(r13);
        r1 = new o.ad.b();
        r3 = new o.i.d();
        r2 = null;
        r1.a(r12.f21898p, r3, r4, null);
        r12.f21903x.d(r3, new o.h.d(r5));
        r1 = o.by.h.B + 15;
        o.by.h.C = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0055, code lost:
    
        if ((r1 % 2) == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0057, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005a, code lost:
    
        if (r12.f21898p != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x005d, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0060, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0061, code lost:
    
        r4 = fr.antelop.sdk.exception.WalletValidationErrorCode.Mandatory;
        r0 = new java.lang.Object[1];
        O((char) ((-1) - android.text.TextUtils.lastIndexOf("", '0', 0, 0)), android.widget.ExpandableListView.getPackedPositionChild(0) + 604, 33 - android.text.TextUtils.getOffsetAfter("", 0), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0088, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(r4, ((java.lang.String) r0[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0089, code lost:
    
        r4 = fr.antelop.sdk.exception.WalletValidationErrorCode.Mandatory;
        r0 = new java.lang.Object[1];
        O((char) ((android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)) - 1), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_EASING, android.text.TextUtils.indexOf("", "", 0, 0) + 33, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b4, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(r4, ((java.lang.String) r0[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b5, code lost:
    
        r5 = fr.antelop.sdk.exception.WalletValidationErrorCode.WrongState;
        r0 = new java.lang.Object[1];
        O((char) (android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0) + 8686), 559 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 13 - android.view.Gravity.getAbsoluteGravity(0, 0), r0);
        r4 = ((java.lang.String) r0[0]).intern();
        r0 = new java.lang.Object[1];
        O((char) (android.view.ViewConfiguration.getTouchSlop() >> 8), android.widget.ExpandableListView.getPackedPositionGroup(0) + com.drew.metadata.iptc.IptcDirectory.TAG_TIME_CREATED, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 30, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0100, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(r5, r4, ((java.lang.String) r0[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0101, code lost:
    
        r4 = fr.antelop.sdk.exception.WalletValidationErrorCode.WrongState;
        r0 = new java.lang.Object[1];
        O((char) (9170 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 29 - android.view.View.resolveSizeAndState(0, 0, 0), android.text.TextUtils.getTrimmedLength("") + 7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012a, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(r4, ((java.lang.String) r0[0]).intern());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(fr.antelop.sdk.authentication.CustomerAuthenticationCredentials r13, fr.antelop.sdk.authentication.CustomerAuthenticationCredentials r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.by.h.c(fr.antelop.sdk.authentication.CustomerAuthenticationCredentials, fr.antelop.sdk.authentication.CustomerAuthenticationCredentials):void");
    }

    @Override // o.bj.e.d
    public final void c(o.bg.c cVar) throws Throwable {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            O((char) TextUtils.indexOf("", "", 0), ViewConfiguration.getTapTimeout() >> 16, 18 - View.MeasureSpec.getMode(0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            O((char) TextUtils.getTrimmedLength(""), 944 - TextUtils.indexOf((CharSequence) "", '0', 0), 14 - TextUtils.getOffsetAfter("", 0), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            O((char) ((-1) - MotionEvent.axisFromString("")), ExpandableListView.getPackedPositionChild(0L) + 1, 18 - Color.argb(0, 0, 0, 0), objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr4 = new Object[1];
            O((char) (19478 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 959 - (ViewConfiguration.getFadingEdgeLength() >> 16), ExpandableListView.getPackedPositionType(0L) + 17, objArr4);
            StringBuilder sbAppend = sb.append(((String) objArr4[0]).intern()).append(cVar.c());
            Object[] objArr5 = new Object[1];
            O((char) (KeyEvent.keyCodeFromString("") + 50528), 976 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 2 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr5);
            StringBuilder sbAppend2 = sbAppend.append(((String) objArr5[0]).intern()).append(cVar.a());
            Object[] objArr6 = new Object[1];
            O((char) ((-1) - TextUtils.lastIndexOf("", '0')), 978 - View.resolveSize(0, 0), -Process.getGidForName(""), objArr6);
            o.ea.f.c(strIntern2, sbAppend2.append(((String) objArr6[0]).intern()).toString());
        }
        if (o.dc.d.c(cVar)) {
            int i3 = B + 85;
            C = i3 % 128;
            if (i3 % 2 == 0) {
                i();
                int i4 = 47 / 0;
            } else {
                i();
            }
        }
        WalletManagerCallback walletManagerCallback = this.f21900t;
        if (walletManagerCallback != null) {
            walletManagerCallback.onAsyncRequestError(AsyncRequestType.Logout, c.b(cVar).a());
            int i5 = B + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            C = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    @Override // o.cf.d
    public final void c(boolean z2) throws Throwable {
        AsyncRequestType asyncRequestType;
        int i2 = 2 % 2;
        int i3 = B + 73;
        C = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            O((char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, 18 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            O((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 2901 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 23, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = C + 89;
            B = i5 % 128;
            int i6 = i5 % 2;
        }
        WalletManagerCallback walletManagerCallback = this.f21900t;
        if (walletManagerCallback != null) {
            if (z2) {
                int i7 = B + 17;
                C = i7 % 128;
                if (i7 % 2 == 0) {
                    AsyncRequestType asyncRequestType2 = AsyncRequestType.ActivateAuthenticationMethod;
                    throw null;
                }
                asyncRequestType = AsyncRequestType.ActivateAuthenticationMethod;
            } else {
                asyncRequestType = AsyncRequestType.DeactivateAuthenticationMethod;
                int i8 = B + 59;
                C = i8 % 128;
                int i9 = i8 % 2;
            }
            walletManagerCallback.onAsyncRequestSuccess(asyncRequestType);
        }
    }

    public final boolean c(CustomerAuthenticationCredentials customerAuthenticationCredentials) throws Throwable {
        int i2 = 2 % 2;
        int i3 = C + 37;
        B = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = true;
        if (this.f21898p == null) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr = new Object[1];
            O((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 9170), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6, objArr);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr[0]).intern());
        }
        if (!this.f21901u) {
            WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.WrongState;
            Object[] objArr2 = new Object[1];
            O((char) (8685 - (KeyEvent.getMaxKeyCode() >> 16)), 558 - ImageFormat.getBitsPerPixel(0), 13 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            O((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 572 - View.MeasureSpec.getSize(0), 31 - Drawable.resolveOpacity(0, 0), objArr3);
            throw new WalletValidationException(walletValidationErrorCode2, strIntern, ((String) objArr3[0]).intern());
        }
        if (o.ea.f.a()) {
            Object[] objArr4 = new Object[1];
            O((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), MotionEvent.axisFromString("") + 19, objArr4);
            String strIntern2 = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            O((char) (Process.myTid() >> 22), 678 - (ViewConfiguration.getTapTimeout() >> 16), KeyEvent.keyCodeFromString("") + 61, objArr5);
            o.ea.f.c(strIntern2, ((String) objArr5[0]).intern());
        }
        new o.bz.b();
        o.g.a aVarD = o.bz.b.d(customerAuthenticationCredentials);
        int i5 = AnonymousClass3.f21905b[new o.dt.d().a(this.f21898p, o.dt.d.b(), aVarD, this).ordinal()];
        if (i5 != 1) {
            if (i5 != 2 && i5 != 3) {
                if (i5 == 4) {
                    WalletValidationErrorCode walletValidationErrorCode3 = WalletValidationErrorCode.Unexpected;
                    Object[] objArr6 = new Object[1];
                    O((char) KeyEvent.normalizeMetaState(0), 636 - Color.argb(0, 0, 0, 0), 28 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr6);
                    throw new WalletValidationException(walletValidationErrorCode3, ((String) objArr6[0]).intern());
                }
                if (i5 != 5) {
                    WalletValidationErrorCode walletValidationErrorCode4 = WalletValidationErrorCode.WrongState;
                    Object[] objArr7 = new Object[1];
                    O((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 636 - View.combineMeasuredStates(0, 0), 28 - Color.red(0), objArr7);
                    throw new WalletValidationException(walletValidationErrorCode4, ((String) objArr7[0]).intern());
                }
                WalletValidationErrorCode walletValidationErrorCode5 = WalletValidationErrorCode.Unknown;
                Object[] objArr8 = new Object[1];
                O((char) Color.green(0), 637 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 28 - Color.blue(0), objArr8);
                throw new WalletValidationException(walletValidationErrorCode5, ((String) objArr8[0]).intern());
            }
            WalletManagerCallback walletManagerCallback = this.f21900t;
            if (walletManagerCallback != null) {
                int i6 = C + 61;
                B = i6 % 128;
                int i7 = i6 % 2;
                walletManagerCallback.onLocalAuthenticationError(aVarD.b().d(), LocalAuthenticationErrorReason.Forbidden, null);
            }
            z2 = false;
        }
        o.dg.b.e().c();
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0018  */
    @Override // o.c.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() throws java.lang.Throwable {
        /*
            r11 = this;
            r10 = 2
            int r0 = r10 % r10
            int r0 = o.by.h.B
            int r1 = r0 + 73
            int r0 = r1 % 128
            o.by.h.C = r0
            int r1 = r1 % r10
            r4 = 0
            if (r1 != 0) goto L83
            boolean r1 = o.ea.f.a()
            r0 = 75
            int r0 = r0 / r4
            if (r1 == 0) goto L74
        L18:
            int r0 = o.by.h.C
            int r1 = r0 + 123
            int r0 = r1 % 128
            o.by.h.B = r0
            int r1 = r1 % r10
            int r0 = android.view.ViewConfiguration.getMaximumDrawingCacheSize()
            int r0 = r0 >> 24
            char r3 = (char) r0
            int r0 = android.view.ViewConfiguration.getMinimumFlingVelocity()
            int r2 = r0 >> 16
            r0 = 48
            java.lang.String r9 = ""
            int r0 = android.text.TextUtils.indexOf(r9, r0)
            int r1 = 17 - r0
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            O(r3, r2, r1, r0)
            r0 = r0[r4]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r7 = r0.intern()
            double r5 = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(r4)
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            char r3 = (char) r0
            int r0 = android.text.TextUtils.indexOf(r9, r9, r4)
            int r2 = 1358 - r0
            int r0 = android.graphics.Color.red(r4)
            int r1 = r0 + 45
            java.lang.Object[] r0 = new java.lang.Object[r8]
            O(r3, r2, r1, r0)
            r0 = r0[r4]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            o.ea.f.c(r7, r0)
            int r0 = o.by.h.C
            int r1 = r0 + 117
            int r0 = r1 % 128
            o.by.h.B = r0
            int r1 = r1 % r10
        L74:
            int r0 = o.by.h.C
            int r1 = r0 + 75
            int r0 = r1 % 128
            o.by.h.B = r0
            int r1 = r1 % r10
            if (r1 == 0) goto L82
            r0 = 70
            int r0 = r0 / r4
        L82:
            return
        L83:
            boolean r0 = o.ea.f.a()
            if (r0 == 0) goto L74
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.by.h.d():void");
    }

    public final void d(WalletLockReason walletLockReason) throws Throwable {
        int i2 = 2 % 2;
        if (this.f21898p == null) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr = new Object[1];
            O((char) (9171 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getEdgeSlop() >> 16) + 29, View.resolveSize(0, 0) + 7, objArr);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr[0]).intern());
        }
        if (walletLockReason == null) {
            WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.Mandatory;
            Object[] objArr2 = new Object[1];
            O((char) (ViewConfiguration.getTapTimeout() >> 16), Drawable.resolveOpacity(0, 0) + 765, 16 - View.resolveSizeAndState(0, 0, 0), objArr2);
            throw new WalletValidationException(walletValidationErrorCode2, ((String) objArr2[0]).intern());
        }
        if (this.f21899s == null) {
            WalletValidationErrorCode walletValidationErrorCode3 = WalletValidationErrorCode.WrongState;
            Object[] objArr3 = new Object[1];
            O((char) (TextUtils.lastIndexOf("", '0', 0) + 8686), ExpandableListView.getPackedPositionChild(0L) + 560, View.MeasureSpec.getSize(0) + 13, objArr3);
            String strIntern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            O((char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + IptcDirectory.TAG_TIME_CREATED, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 31, objArr4);
            throw new WalletValidationException(walletValidationErrorCode3, strIntern, ((String) objArr4[0]).intern());
        }
        if (walletLockReason != WalletLockReason.FraudulentUseSuspected) {
            int i3 = B + 19;
            C = i3 % 128;
            int i4 = i3 % 2;
            if (walletLockReason != WalletLockReason.StopService) {
                WalletValidationErrorCode walletValidationErrorCode4 = WalletValidationErrorCode.InvalidFormat;
                Object[] objArr5 = new Object[1];
                O((char) (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 764, TextUtils.getTrimmedLength("") + 16, objArr5);
                throw new WalletValidationException(walletValidationErrorCode4, ((String) objArr5[0]).intern());
            }
        }
        this.f21899s.b(this.f21898p, this, walletLockReason);
        int i5 = B + 85;
        C = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void d(CustomerAuthenticationCredentials customerAuthenticationCredentials, CustomerAuthenticationCredentials customerAuthenticationCredentials2) throws Throwable {
        int i2 = f21889k * (-1238973549);
        f21889k = i2;
        int i3 = f21891m * 914587477;
        f21891m = i3;
        int iMyPid = Process.myPid();
        b(Process.myUid(), i2, new Object[]{this, customerAuthenticationCredentials, customerAuthenticationCredentials2}, 1825671495, -1825671490, i3, iMyPid);
    }

    public final void d(CustomerAuthenticationMethodType customerAuthenticationMethodType, CustomerAuthenticationCredentials customerAuthenticationCredentials) throws Throwable {
        int i2 = 2 % 2;
        int i3 = B + 123;
        C = i3 % 128;
        int i4 = i3 % 2;
        if (this.f21898p == null) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr = new Object[1];
            O((char) (Color.blue(0) + 9170), AndroidCharacter.getMirror('0') - 19, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 8, objArr);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr[0]).intern());
        }
        o.en.b.c().z();
        if (this.f21904y == null) {
            WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.WrongState;
            Object[] objArr2 = new Object[1];
            O((char) (8685 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 559 - Color.alpha(0), Color.red(0) + 13, objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            O((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 573, 30 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr3);
            throw new WalletValidationException(walletValidationErrorCode2, strIntern, ((String) objArr3[0]).intern());
        }
        if (customerAuthenticationMethodType == null) {
            WalletValidationErrorCode walletValidationErrorCode3 = WalletValidationErrorCode.Mandatory;
            Object[] objArr4 = new Object[1];
            O((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 635, 28 - (Process.myTid() >> 22), objArr4);
            throw new WalletValidationException(walletValidationErrorCode3, ((String) objArr4[0]).intern());
        }
        new o.bz.b();
        o.i.d dVar = null;
        if (customerAuthenticationCredentials != null) {
            o.g.a aVarD = o.bz.b.d(customerAuthenticationCredentials);
            o.ad.b bVar = new o.ad.b();
            o.i.d dVar2 = new o.i.d();
            bVar.a(this.f21898p, dVar2, aVarD, null);
            int i5 = C + 85;
            B = i5 % 128;
            int i6 = i5 % 2;
            dVar = dVar2;
        }
        this.f21904y.c(i.b(customerAuthenticationMethodType), false, dVar);
    }

    @Override // o.cb.c
    public final void d(o.bg.c cVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = C + 115;
        B = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            o.ea.f.a();
            throw null;
        }
        if (o.ea.f.a()) {
            int i4 = B + 99;
            C = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            O((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), TextUtils.getOffsetAfter("", 0), 18 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            O((char) (37524 - KeyEvent.normalizeMetaState(0)), 1684 - (Process.myTid() >> 22), 24 - TextUtils.getOffsetBefore("", 0), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        if (!(!o.dc.d.c(cVar))) {
            i();
        }
        WalletManagerCallback walletManagerCallback = this.f21900t;
        if (walletManagerCallback != null) {
            int i6 = C + 123;
            B = i6 % 128;
            if (i6 % 2 == 0) {
                walletManagerCallback.onAsyncRequestError(AsyncRequestType.ChangeCredentials, c.b(cVar).a());
            } else {
                walletManagerCallback.onAsyncRequestError(AsyncRequestType.ChangeCredentials, c.b(cVar).a());
                obj.hashCode();
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dd  */
    @Override // o.c.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(o.bx.d r15, o.j.b r16, o.bg.c r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.by.h.d(o.bx.d, o.j.b, o.bg.c):void");
    }

    @Override // o.ca.e
    public final void d(i iVar, o.j.b bVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = B + 69;
        C = i3 % 128;
        if (i3 % 2 == 0) {
            o.ea.f.a();
            throw null;
        }
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            O((char) (TextUtils.lastIndexOf("", '0') + 1), (-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 18 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Locale localeD = o.ea.g.d();
            Object[] objArr2 = new Object[1];
            O((char) KeyEvent.normalizeMetaState(0), 3051 - ((Process.getThreadPriority(0) + 20) >> 6), View.MeasureSpec.getSize(0) + 58, objArr2);
            o.ea.f.c(strIntern, String.format(localeD, ((String) objArr2[0]).intern(), iVar, bVar, null));
            int i4 = C + 11;
            B = i4 % 128;
            int i5 = i4 % 2;
        }
        WalletManagerCallback walletManagerCallback = this.f21900t;
        if (walletManagerCallback != null) {
            int i6 = B + 45;
            C = i6 % 128;
            int i7 = i6 % 2;
            walletManagerCallback.onLocalAuthenticationError(iVar.d(), bVar.a(), null);
        }
    }

    @Override // o.bj.e.d
    public final void e() throws Throwable {
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int iNextInt = new Random().nextInt();
        int i2 = f21890l * 1049150924;
        f21890l = i2;
        b((int) Thread.currentThread().getId(), iUptimeMillis, new Object[]{this}, 786847468, -786847462, iNextInt, i2);
    }

    public final void e(CustomerAuthenticationMethodType customerAuthenticationMethodType, CustomerAuthenticationCredentials customerAuthenticationCredentials) throws Throwable {
        int iMyTid = Process.myTid();
        int i2 = f21888j * 1093664850;
        f21888j = i2;
        int i3 = f21884f * (-1094765284);
        f21884f = i3;
        int i4 = f21885g * 1692211606;
        f21885g = i4;
        b(i4, iMyTid, new Object[]{this, customerAuthenticationMethodType, customerAuthenticationCredentials}, 1814670375, -1814670372, i2, i3);
    }

    @Override // o.c.e
    public final void e(o.bg.c cVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = B + 25;
        C = i3 % 128;
        if (i3 % 2 == 0) {
            o.ea.f.a();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            O((char) TextUtils.getCapsMode("", 0, 0), Color.blue(0), ((byte) KeyEvent.getModifierMetaStateMask()) + 19, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            O((char) TextUtils.getCapsMode("", 0, 0), 1033 - MotionEvent.axisFromString(""), 52 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr2);
            StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern()).append(cVar.c());
            Object[] objArr3 = new Object[1];
            O((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 977 - ((byte) KeyEvent.getModifierMetaStateMask()), -ImageFormat.getBitsPerPixel(0), objArr3);
            o.ea.f.c(strIntern, sbAppend.append(((String) objArr3[0]).intern()).toString());
        }
        if (o.ea.f.a()) {
            Object[] objArr4 = new Object[1];
            O((char) TextUtils.indexOf("", "", 0), ViewConfiguration.getTapTimeout() >> 16, Color.alpha(0) + 18, objArr4);
            String strIntern2 = ((String) objArr4[0]).intern();
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr5 = new Object[1];
            O((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + PhotoshopDirectory.TAG_WIN_DEVMODE, 16 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr5);
            StringBuilder sbAppend2 = sb2.append(((String) objArr5[0]).intern()).append(cVar.c());
            Object[] objArr6 = new Object[1];
            O((char) (Color.alpha(0) + 50528), 975 - ((byte) KeyEvent.getModifierMetaStateMask()), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2, objArr6);
            StringBuilder sbAppend3 = sbAppend2.append(((String) objArr6[0]).intern()).append(cVar.a());
            Object[] objArr7 = new Object[1];
            O((char) (Process.myTid() >> 22), 978 - View.combineMeasuredStates(0, 0), 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr7);
            o.ea.f.c(strIntern2, sbAppend3.append(((String) objArr7[0]).intern()).toString());
        }
        i();
        if (cVar.c() != o.bg.a.aa) {
            WalletManagerCallback walletManagerCallback = this.f21900t;
            if (walletManagerCallback != null) {
                walletManagerCallback.onConnectionError(c.b(cVar).a());
                return;
            }
            return;
        }
        WalletManagerCallback walletManagerCallback2 = this.f21900t;
        if (walletManagerCallback2 != null) {
            int i4 = C + 37;
            B = i4 % 128;
            int i5 = i4 % 2;
            walletManagerCallback2.onProvisioningRequired();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.by.h.f():void");
    }

    public final void g() throws Throwable {
        int i2 = 91661242 * f21886h;
        f21886h = i2;
        int iNextInt = new Random().nextInt();
        int iActiveCount = Thread.activeCount();
        int i3 = f21892n * 821554727;
        f21892n = i3;
        b(i3, i2, new Object[]{this}, -819918458, 819918462, iNextInt, iActiveCount);
    }

    @Override // o.cb.c
    public final void g(o.bg.c cVar) throws Throwable {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            O((char) Color.argb(0, 0, 0, 0), TextUtils.indexOf("", "", 0), 18 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            O((char) (34305 - (Process.myTid() >> 22)), 1742 - Color.red(0), AndroidCharacter.getMirror('0') - 16, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        if (o.dc.d.c(cVar)) {
            i();
        }
        WalletManagerCallback walletManagerCallback = this.f21900t;
        if (walletManagerCallback != null) {
            int i3 = B + 75;
            C = i3 % 128;
            int i4 = i3 % 2;
            walletManagerCallback.onAsyncRequestError(AsyncRequestType.SynchronizeAuthenticationMethod, c.b(cVar).a());
        }
        int i5 = B + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        C = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void h() throws Throwable {
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            O((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0), 17 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            O((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 540, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 5, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        synchronized (this.f21902w) {
            if (o.ea.f.a()) {
                Object[] objArr3 = new Object[1];
                O((char) ((Process.getThreadPriority(0) + 20) >> 6), ViewConfiguration.getMinimumFlingVelocity() >> 16, 18 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                O((char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 545, 14 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
                o.ea.f.c(strIntern2, ((String) objArr4[0]).intern());
            }
            i();
            this.f21898p = null;
            this.f21900t = null;
        }
    }

    public final void i() throws Throwable {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            O((char) TextUtils.getTrimmedLength(""), ViewConfiguration.getPressedStateDuration() >> 16, 18 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            O((char) (ViewConfiguration.getScrollBarSize() >> 8), 439 - TextUtils.indexOf("", "", 0), View.combineMeasuredStates(0, 0) + 32, objArr2);
            StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern()).append(this);
            Object[] objArr3 = new Object[1];
            O((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 472, 10 - ((Process.getThreadPriority(0) + 20) >> 6), objArr3);
            o.ea.f.c(strIntern, sbAppend.append(((String) objArr3[0]).intern()).append(this.f21900t).toString());
        }
        if (this.f21898p == null) {
            if (o.ea.f.a()) {
                Object[] objArr4 = new Object[1];
                O((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.getOffsetAfter("", 0) + 18, objArr4);
                String strIntern2 = ((String) objArr4[0]).intern();
                Object[] objArr5 = new Object[1];
                O((char) (50803 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), Color.argb(0, 0, 0, 0) + 149, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 56, objArr5);
                o.ea.f.c(strIntern2, ((String) objArr5[0]).intern());
                return;
            }
            return;
        }
        Object obj = null;
        if (this.f21901u) {
            int i3 = C + 67;
            B = i3 % 128;
            int i4 = i3 % 2;
            this.f21901u = false;
            if (o.ea.f.a()) {
                int i5 = C + 7;
                B = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr6 = new Object[1];
                O((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, (ViewConfiguration.getScrollBarSize() >> 8) + 18, objArr6);
                String strIntern3 = ((String) objArr6[0]).intern();
                Object[] objArr7 = new Object[1];
                O((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 481 - (ViewConfiguration.getTapTimeout() >> 16), TextUtils.lastIndexOf("", '0') + 43, objArr7);
                o.ea.f.c(strIntern3, ((String) objArr7[0]).intern());
            }
            if (!f21895r.get()) {
                int i7 = B + 43;
                C = i7 % 128;
                if (i7 % 2 == 0) {
                    b(this.f21898p);
                    obj.hashCode();
                    throw null;
                }
                b(this.f21898p);
                int i8 = B + 89;
                C = i8 % 128;
                int i9 = i8 % 2;
            }
            if (o.en.b.c().s()) {
                Object[] objArr8 = {o.en.b.c()};
                int i10 = o.en.b.f24090e * (-1580596594);
                o.en.b.f24090e = i10;
                int i11 = o.en.b.f24087b * (-2071415875);
                o.en.b.f24087b = i11;
                o.fr.e eVar = (o.fr.e) o.en.b.a(342371170, i10, objArr8, i11, -342371167, Process.myUid(), new Random().nextInt(460146032));
                if (eVar.e()) {
                    eVar.c(this.f21898p);
                }
            }
        }
        o.c.a aVar = this.f21899s;
        if (aVar != null) {
            aVar.a(this.f21898p);
        }
        this.f21899s = null;
        o.cb.a aVar2 = this.f21903x;
        if (aVar2 != null) {
            int i12 = C + 23;
            B = i12 % 128;
            int i13 = i12 % 2;
            aVar2.c();
        }
        this.f21903x = null;
        o.cf.b bVar = this.f21904y;
        if (bVar != null) {
            bVar.e();
        }
        this.f21904y = null;
        if (o.ea.f.a()) {
            int i14 = C + 21;
            B = i14 % 128;
            int i15 = i14 % 2;
            Object[] objArr9 = new Object[1];
            O((char) (TextUtils.lastIndexOf("", '0') + 1), Color.red(0), 18 - Color.red(0), objArr9);
            String strIntern4 = ((String) objArr9[0]).intern();
            Object[] objArr10 = new Object[1];
            O((char) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 523, (ViewConfiguration.getTapTimeout() >> 16) + 17, objArr10);
            o.ea.f.c(strIntern4, ((String) objArr10[0]).intern());
        }
        int i16 = C + 53;
        B = i16 % 128;
        int i17 = i16 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:302:0x0b67  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5125
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.by.h.j():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0019  */
    @Override // o.cb.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() throws java.lang.Throwable {
        /*
            r11 = this;
            r10 = 2
            int r0 = r10 % r10
            int r0 = o.by.h.B
            int r1 = r0 + 45
            int r0 = r1 % 128
            o.by.h.C = r0
            int r1 = r1 % r10
            r8 = 1
            r9 = 0
            if (r1 != 0) goto L76
            boolean r1 = o.ea.f.a()
            r0 = 78
            int r0 = r0 / r9
            if (r1 == 0) goto L63
        L19:
            java.lang.String r0 = ""
            int r0 = android.text.TextUtils.getTrimmedLength(r0)
            char r3 = (char) r0
            int r2 = android.view.View.MeasureSpec.getMode(r9)
            int r0 = android.view.ViewConfiguration.getWindowTouchSlop()
            int r0 = r0 >> 8
            int r1 = r0 + 18
            java.lang.Object[] r0 = new java.lang.Object[r8]
            O(r3, r2, r1, r0)
            r0 = r0[r9]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r7 = r0.intern()
            float r1 = android.view.ViewConfiguration.getScrollFriction()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            int r0 = 1 - r0
            char r6 = (char) r0
            int r0 = android.graphics.Color.blue(r9)
            int r5 = r0 + 1708
            long r3 = android.widget.ExpandableListView.getPackedPositionForGroup(r9)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            int r1 = 34 - r0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            O(r6, r5, r1, r0)
            r0 = r0[r9]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            o.ea.f.c(r7, r0)
        L63:
            fr.antelop.sdk.WalletManagerCallback r1 = r11.f21900t
            if (r1 == 0) goto L75
            fr.antelop.sdk.AsyncRequestType r0 = fr.antelop.sdk.AsyncRequestType.SynchronizeAuthenticationMethod
            r1.onAsyncRequestSuccess(r0)
            int r0 = o.by.h.C
            int r1 = r0 + 49
            int r0 = r1 % 128
            o.by.h.B = r0
            int r1 = r1 % r10
        L75:
            return
        L76:
            boolean r0 = o.ea.f.a()
            if (r0 == r8) goto L19
            goto L63
        */
        throw new UnsupportedOperationException("Method not decompiled: o.by.h.k():void");
    }

    @Override // o.cb.c
    public final void l() throws Throwable {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = C + 81;
            B = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            O((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), ViewConfiguration.getWindowTouchSlop() >> 8, 18 - KeyEvent.normalizeMetaState(0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            O((char) TextUtils.getCapsMode("", 0, 0), Gravity.getAbsoluteGravity(0, 0) + 1658, 25 - TextUtils.lastIndexOf("", '0', 0), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = C + 103;
            B = i5 % 128;
            int i6 = i5 % 2;
        }
        WalletManagerCallback walletManagerCallback = this.f21900t;
        if (walletManagerCallback != null) {
            int i7 = C + 117;
            B = i7 % 128;
            if (i7 % 2 == 0) {
                walletManagerCallback.onAsyncRequestSuccess(AsyncRequestType.ChangeCredentials);
            } else {
                walletManagerCallback.onAsyncRequestSuccess(AsyncRequestType.ChangeCredentials);
                throw null;
            }
        }
    }

    @Override // o.cb.c
    public final void m() throws Throwable {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = B + 107;
            C = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            O((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 18, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            O((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), KeyEvent.keyCodeFromString("") + 1536, Color.red(0) + 63, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        WalletManagerCallback walletManagerCallback = this.f21900t;
        if (walletManagerCallback != null) {
            AsyncRequestType asyncRequestType = AsyncRequestType.CheckCredentials;
            AntelopErrorCode antelopErrorCode = AntelopErrorCode.CustomerCredentialsInvalid;
            Object[] objArr3 = new Object[1];
            O((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 1599 - View.MeasureSpec.getMode(0), Process.getGidForName("") + 37, objArr3);
            walletManagerCallback.onAsyncRequestError(asyncRequestType, new c(antelopErrorCode, ((String) objArr3[0]).intern()).a());
            int i5 = C + 39;
            B = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 / 3;
            }
        }
    }

    public final void n() throws Throwable {
        int i2 = 2 % 2;
        if (this.f21898p == null) {
            if (o.ea.f.a()) {
                int i3 = C + 29;
                B = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = new Object[1];
                O((char) TextUtils.indexOf("", "", 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 17 - MotionEvent.axisFromString(""), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                O((char) (View.MeasureSpec.getMode(0) + 55031), 780 - ((byte) KeyEvent.getModifierMetaStateMask()), 54 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr2);
                o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
                return;
            }
            return;
        }
        if (this.f21899s == null) {
            if (o.ea.f.a()) {
                Object[] objArr3 = new Object[1];
                O((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 18 - Color.red(0), objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                O((char) Color.argb(0, 0, 0, 0), 835 - TextUtils.lastIndexOf("", '0', 0), 53 - KeyEvent.normalizeMetaState(0), objArr4);
                o.ea.f.c(strIntern2, ((String) objArr4[0]).intern());
            }
            new o.bi.b(this.f21898p, new b.e() { // from class: o.by.h$$ExternalSyntheticLambda0
                @Override // o.bi.b.e
                public final void onDeleteWalletCompleted() {
                    this.f$0.q();
                }
            }).d(o.bi.d.f21256d);
            return;
        }
        if (o.ea.f.a()) {
            Object[] objArr5 = new Object[1];
            O((char) (AndroidCharacter.getMirror('0') - '0'), ViewConfiguration.getScrollBarSize() >> 8, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 18, objArr5);
            String strIntern3 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            O((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 40951), TextUtils.lastIndexOf("", '0', 0) + 890, Color.blue(0) + 56, objArr6);
            o.ea.f.c(strIntern3, ((String) objArr6[0]).intern());
        }
        this.f21899s.e(this.f21898p, this);
        int i5 = C + 27;
        B = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.cb.c
    public final void o() throws Throwable {
        int i2 = 2 % 2;
        int i3 = B + 81;
        C = i3 % 128;
        if (i3 % 2 == 0) {
            o.ea.f.a();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (o.ea.f.a()) {
            int i4 = C + 125;
            B = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            O((char) View.combineMeasuredStates(0, 0), 1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 18 - View.combineMeasuredStates(0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            O((char) (24179 - Color.blue(0)), 1511 - ((Process.getThreadPriority(0) + 20) >> 6), 25 - TextUtils.indexOf("", "", 0), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        WalletManagerCallback walletManagerCallback = this.f21900t;
        if (walletManagerCallback != null) {
            walletManagerCallback.onAsyncRequestSuccess(AsyncRequestType.CheckCredentials);
        }
    }
}
