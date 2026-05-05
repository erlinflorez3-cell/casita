package o.cd;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import cz.msebera.android.httpclient.HttpStatus;
import fr.antelop.sdk.DefaultWalletEventListener;
import fr.antelop.sdk.WalletEventListener;
import fr.antelop.sdk.WalletLockReason;
import fr.antelop.sdk.WalletNotificationServiceCallback;
import fr.antelop.sdk.card.EmvApplicationActivationMethod;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import o.a.j;
import o.ea.e;
import o.ea.f;
import o.ea.m;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static int f22140a = 0;

    /* JADX INFO: renamed from: b */
    private static int f22141b = 0;

    /* JADX INFO: renamed from: c */
    private static int f22142c = 0;

    /* JADX INFO: renamed from: d */
    private static int f22143d = 0;

    /* JADX INFO: renamed from: e */
    static C0347d f22144e = null;

    /* JADX INFO: renamed from: g */
    private static int f22145g = 0;

    /* JADX INFO: renamed from: o.cd.d$d */
    public static final class C0347d {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        public static int f22146a = 0;

        /* JADX INFO: renamed from: b */
        public static int f22147b = 0;

        /* JADX INFO: renamed from: c */
        public static int f22148c = 0;

        /* JADX INFO: renamed from: d */
        public static int f22149d = 0;

        /* JADX INFO: renamed from: e */
        public static int f22150e = 0;

        /* JADX INFO: renamed from: f */
        public static int f22151f = 0;

        /* JADX INFO: renamed from: g */
        public static int f22152g = 0;

        /* JADX INFO: renamed from: h */
        public static int f22153h = 0;

        /* JADX INFO: renamed from: i */
        public static int f22154i = 0;

        /* JADX INFO: renamed from: j */
        public static int f22155j = 0;

        /* JADX INFO: renamed from: l */
        private static boolean f22156l = false;

        /* JADX INFO: renamed from: m */
        public static int f22157m = 0;

        /* JADX INFO: renamed from: p */
        private static final List<Runnable> f22158p;

        /* JADX INFO: renamed from: q */
        private static int f22159q = 0;

        /* JADX INFO: renamed from: r */
        private static int f22160r = 0;

        /* JADX INFO: renamed from: s */
        private static byte[] f22161s = null;

        /* JADX INFO: renamed from: t */
        private static int f22162t = 0;

        /* JADX INFO: renamed from: u */
        private static int f22163u = 0;

        /* JADX INFO: renamed from: v */
        private static int f22164v = 0;

        /* JADX INFO: renamed from: w */
        private static int f22165w = 0;

        /* JADX INFO: renamed from: x */
        private static int f22166x = 0;

        /* JADX INFO: renamed from: y */
        private static short[] f22167y = null;

        /* JADX INFO: renamed from: k */
        private final Handler f22168k;

        /* JADX INFO: renamed from: n */
        private final WalletEventListener f22169n;

        /* JADX INFO: renamed from: o */
        private final WalletNotificationServiceCallback f22170o;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0014). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(short r9, int r10, byte r11) {
            /*
                byte[] r8 = o.cd.d.C0347d.$$a
                int r7 = r11 + 103
                int r0 = r9 * 3
                int r6 = 3 - r0
                int r5 = r10 * 4
                int r0 = r5 + 1
                byte[] r4 = new byte[r0]
                r3 = 0
                if (r8 != 0) goto L2b
                r0 = r7
                r2 = r3
                r1 = r6
            L14:
                int r0 = -r0
                int r6 = r6 + r0
                r7 = r6
                r6 = r1
            L18:
                byte r0 = (byte) r7
                int r1 = r6 + 1
                r4[r2] = r0
                if (r2 != r5) goto L25
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L25:
                int r2 = r2 + 1
                r0 = r8[r1]
                r6 = r7
                goto L14
            L2b:
                r2 = r3
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.cd.d.C0347d.$$c(short, int, byte):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f22157m = -271701755;
            f22153h = 1108820465;
            f22152g = 880826314;
            f22151f = -370325563;
            f22155j = 797624611;
            f22154i = 1623078106;
            f22147b = 828252999;
            f22148c = -1589950690;
            f22146a = -324067312;
            f22149d = 794884451;
            f22150e = 1074498674;
            f22165w = 0;
            f22163u = 1;
            f22164v = 0;
            f22166x = 1;
            c();
            ViewConfiguration.getJumpTapTimeout();
            KeyEvent.getModifierMetaStateMask();
            ViewConfiguration.getScrollDefaultDelay();
            Drawable.resolveOpacity(0, 0);
            ViewConfiguration.getScrollDefaultDelay();
            f22156l = false;
            f22158p = new ArrayList();
            int i2 = f22163u + 91;
            f22165w = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        C0347d(Handler handler, WalletNotificationServiceCallback walletNotificationServiceCallback, WalletEventListener walletEventListener) {
            this.f22168k = handler;
            this.f22170o = walletNotificationServiceCallback;
            this.f22169n = walletEventListener;
        }

        private static /* synthetic */ Object a(Object[] objArr) {
            C0347d c0347d = (C0347d) objArr[0];
            Context context = (Context) objArr[1];
            int i2 = 2 % 2;
            int i3 = f22164v + 53;
            f22166x = i3 % 128;
            int i4 = i3 % 2;
            c0347d.f22170o.onCustomerCredentialsReset(context);
            c0347d.f22169n.onCustomerCredentialsReset(context);
            int i5 = f22164v + 45;
            f22166x = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 46 / 0;
            }
            return null;
        }

        public /* synthetic */ void a(Context context, WalletLockReason walletLockReason) {
            int i2 = 2 % 2;
            int i3 = f22166x + 77;
            f22164v = i3 % 128;
            int i4 = i3 % 2;
            this.f22170o.onWalletLocked(context, walletLockReason);
            this.f22169n.onWalletLocked(context, walletLockReason);
            int i5 = f22164v + 57;
            f22166x = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        public /* synthetic */ void b(Context context, String str, List list) {
            int i2 = 2 % 2;
            int i3 = f22164v + 25;
            f22166x = i3 % 128;
            int i4 = i3 % 2;
            this.f22170o.onEmvApplicationActivationRequired(context, str, list);
            if (i4 == 0) {
                throw null;
            }
        }

        public static /* synthetic */ Object c(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
            int i8 = ~i3;
            int i9 = ~i2;
            int i10 = ~(i8 | i9);
            int i11 = ~(i9 | i5);
            int i12 = (i10 + i11) - (i10 & i11);
            int i13 = ~((-1) - (((-1) - ((~i5) | i3)) & ((-1) - i2)));
            int i14 = (i12 + i13) - (i12 & i13);
            int i15 = (-1) - (((-1) - (~(i5 | ((i9 + i3) - (i9 & i3))))) & ((-1) - i13));
            int i16 = i3 | i2;
            int i17 = i3 + i2 + i4 + ((-1865910757) * i6) + ((-1665280692) * i7);
            int i18 = i17 * i17;
            int i19 = ((i3 * (-906343980)) - 215482368) + ((-906343980) * i2) + (i14 * (-2063747539)) + (2063747539 * i15) + ((-2063747539) * i16) + (1324875776 * i4) + ((-1540882432) * i6) + ((-912261120) * i7) + (1566179328 * i18);
            int i20 = (i3 * (-52584228)) + 761582770 + (i2 * (-52584228)) + (i14 * HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE) + (i15 * (-415)) + (i16 * HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE) + (i4 * (-52583813)) + (i6 * (-195242759)) + (i7 * 1657508740) + (i18 * (-834797568));
            int i21 = i19 + (i20 * i20 * 1251344384);
            if (i21 == 1) {
                return d(objArr);
            }
            if (i21 == 2) {
                return e(objArr);
            }
            if (i21 == 3) {
                final C0347d c0347d = (C0347d) objArr[0];
                final Context context = (Context) objArr[1];
                final WalletLockReason walletLockReason = (WalletLockReason) objArr[2];
                int i22 = 2 % 2;
                int i23 = f22166x + 97;
                f22164v = i23 % 128;
                int i24 = i23 % 2;
                c0347d.d(new Runnable() { // from class: o.cd.d$d$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(context, walletLockReason);
                    }
                }, false);
                int i25 = f22164v + 47;
                f22166x = i25 % 128;
                int i26 = i25 % 2;
                return null;
            }
            if (i21 != 4) {
                return a(objArr);
            }
            final C0347d c0347d2 = (C0347d) objArr[0];
            final Context context2 = (Context) objArr[1];
            int i27 = 2 % 2;
            int i28 = f22164v + 93;
            f22166x = i28 % 128;
            int i29 = i28 % 2;
            c0347d2.d(new Runnable() { // from class: o.cd.d$d$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.n(context2);
                }
            }, false);
            int i30 = f22164v + 29;
            f22166x = i30 % 128;
            int i31 = i30 % 2;
            return null;
        }

        static void c() {
            f22159q = 808353883;
            f22162t = 1150422451;
            f22160r = 1878856115;
            f22161s = new byte[]{50, 34, 58, 44, 72, 46, 34, 49, 90, Ascii.SI, 53, 54, 44, 110, Ascii.US, Ascii.DC4, 4, Ascii.RS, 44, 40, -1, 47, 1, Ascii.RS, 19, 16, -15, 17, 5, Ascii.EM, MessagePack.Code.TRUE, MessagePack.Code.FIXEXT16, MessagePack.Code.EXT16, MessagePack.Code.FALSE, MessagePack.Code.INT8, -20, -93, MessagePack.Code.INT64, MessagePack.Code.BIN16, MessagePack.Code.FALSE, MessagePack.Code.FIXEXT8, MessagePack.Code.FIXEXT1, MessagePack.Code.UINT8, MessagePack.Code.UINT8, MessagePack.Code.MAP16, MessagePack.Code.MAP32, MessagePack.Code.FIXEXT2, -68, -71, -105, -79, -3, 105, -87, -67, -81, -75, -111, -95, -72, MessagePack.Code.FIXSTR_PREFIX, MessagePack.Code.FIXSTR_PREFIX, -109, -16, -109, -75, 80, -71, -83, -95, -9, 80, -89, -68, -84, -90, -76, MessagePack.Code.FIXARRAY_PREFIX, -13, 90, -73, -87, -90, -69, -104, Ascii.SI, 81, -95, -12, 90, -89, -77, MessagePack.Code.NEGFIXINT_PREFIX, 80, -89, -68, -84, -90, -76, MessagePack.Code.FIXARRAY_PREFIX, -13, 90, -73, -87, -90, -69, -104, Ascii.SI, 85, -76, -109, -71, -110, -94, -70, -109, -16, 90, -68, -71, -105, -79, -3, -109, -75, 90, -68, -71, -105, MessagePack.Code.INT16, 113, MessagePack.Code.FIXSTR_PREFIX, -93, -89, -69, -109, -128, -99, 123, -107, MessagePack.Code.NEVER_USED, 77, -115, -127, -123, -127, 123, -105, 117, -119, -100, -127, MessagePack.Code.BIN32, 119, -103, 62, -128, -99, 123, -75, 85, -124, -121, -117, -97, 119, -115, -115, -115, -115, -115};
        }

        public /* synthetic */ void c(Context context, Date date) {
            int i2 = 2 % 2;
            int i3 = f22164v + 73;
            f22166x = i3 % 128;
            int i4 = i3 % 2;
            this.f22170o.onSunsetScheduled(context, date);
            this.f22169n.onAppSunsetScheduled(context, date);
            int i5 = f22166x + 11;
            f22164v = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        private static /* synthetic */ Object d(Object[] objArr) {
            C0347d c0347d = (C0347d) objArr[0];
            Context context = (Context) objArr[1];
            int i2 = 2 % 2;
            int i3 = f22166x + 5;
            f22164v = i3 % 128;
            int i4 = i3 % 2;
            c0347d.f22170o.onSettingsUpdated(context);
            c0347d.f22169n.onWalletSettingUpdated(context);
            int i5 = f22166x + 9;
            f22164v = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:64:0x00b5 A[Catch: all -> 0x017f, TryCatch #2 {, blocks: (B:45:0x0004, B:47:0x0015, B:49:0x0020, B:51:0x0024, B:53:0x0031, B:54:0x00a1, B:61:0x00ae, B:62:0x00af, B:64:0x00b5, B:65:0x0123, B:66:0x0170, B:70:0x017a, B:71:0x017e, B:58:0x00a9, B:59:0x00ac), top: B:79:0x0004, inners: #0, #1 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private synchronized void d(java.lang.Runnable r22, boolean r23) {
            /*
                Method dump skipped, instruction units count: 386
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.cd.d.C0347d.d(java.lang.Runnable, boolean):void");
        }

        private static /* synthetic */ Object e(Object[] objArr) {
            C0347d c0347d = (C0347d) objArr[0];
            Context context = (Context) objArr[1];
            int i2 = 2 % 2;
            int i3 = f22166x + 87;
            f22164v = i3 % 128;
            int i4 = i3 % 2;
            c0347d.f22170o.onWalletUnlocked(context);
            c0347d.f22169n.onWalletUnlocked(context);
            int i5 = f22166x + 93;
            f22164v = i5 % 128;
            if (i5 % 2 == 0) {
                return null;
            }
            throw null;
        }

        static void init$0() {
            $$a = new byte[]{120, 46, 101, 90};
            $$b = 234;
        }

        public /* synthetic */ void k(Context context) {
            int i2 = 2 % 2;
            int i3 = f22164v + 17;
            f22166x = i3 % 128;
            if (i3 % 2 == 0) {
                this.f22170o.onLogout(context);
                this.f22169n.onWalletLogout(context);
                throw null;
            }
            this.f22170o.onLogout(context);
            this.f22169n.onWalletLogout(context);
            int i4 = f22164v + 77;
            f22166x = i4 % 128;
            int i5 = i4 % 2;
        }

        public /* synthetic */ void l(Context context) {
            int i2 = 2 % 2;
            int i3 = f22166x + 31;
            f22164v = i3 % 128;
            int i4 = i3 % 2;
            this.f22170o.onLostEligibility(context);
            this.f22169n.onDeviceEligibilityLost(context);
            int i5 = f22164v + 91;
            f22166x = i5 % 128;
            int i6 = i5 % 2;
        }

        public /* synthetic */ void m(Context context) {
            int i2 = f22150e * (-1010133021);
            f22150e = i2;
            int i3 = (int) Runtime.getRuntime().totalMemory();
            int i4 = f22149d * 1927781976;
            f22149d = i4;
            c(-914421542, 914421542, i3, i2, new Object[]{this, context}, i4, (int) Thread.currentThread().getId());
        }

        public /* synthetic */ void n(Context context) {
            int i2 = 2 % 2;
            int i3 = f22164v + 9;
            f22166x = i3 % 128;
            int i4 = i3 % 2;
            this.f22170o.onWalletDeleted(context);
            this.f22169n.onWalletDeleted(context);
            int i5 = f22166x + 69;
            f22164v = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ void p(Context context) {
            int i2 = 2 % 2;
            int i3 = f22164v + 67;
            f22166x = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                this.f22170o.onCardsUpdated(context);
                obj.hashCode();
                throw null;
            }
            this.f22170o.onCardsUpdated(context);
            int i4 = f22166x + 93;
            f22164v = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        public /* synthetic */ void q(Context context) {
            int i2 = 2 % 2;
            int i3 = f22164v + 3;
            f22166x = i3 % 128;
            int i4 = i3 % 2;
            this.f22169n.onWalletProductsUpdated(context);
            int i5 = f22164v + 27;
            f22166x = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 57 / 0;
            }
        }

        public /* synthetic */ void r(Context context) {
            int i2 = 2 % 2;
            int i3 = f22166x + 47;
            f22164v = i3 % 128;
            int i4 = i3 % 2;
            this.f22170o.onEmvApplicationCredentialsUpdated(context);
            int i5 = f22166x + 115;
            f22164v = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        public /* synthetic */ void s(Context context) {
            int i2 = f22147b * 1313151356;
            f22147b = i2;
            int i3 = f22154i * (-2055086108);
            f22154i = i3;
            c(2135693579, -2135693577, i3, i2, new Object[]{this, context}, (int) SystemClock.uptimeMillis(), (int) Runtime.getRuntime().maxMemory());
        }

        public /* synthetic */ void t(Context context) {
            int i2 = 2 % 2;
            int i3 = f22166x + 91;
            f22164v = i3 % 128;
            if (i3 % 2 != 0) {
                this.f22170o.onCountersUpdated(context);
                this.f22169n.onWalletCountersUpdated(context);
                int i4 = 17 / 0;
            } else {
                this.f22170o.onCountersUpdated(context);
                this.f22169n.onWalletCountersUpdated(context);
            }
            int i5 = f22164v + 75;
            f22166x = i5 % 128;
            int i6 = i5 % 2;
        }

        public /* synthetic */ void u(Context context) {
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int iMyUid = Process.myUid();
            int i2 = f22146a * 269021986;
            f22146a = i2;
            int i3 = f22148c * (-1210539377);
            f22148c = i3;
            c(1297082912, -1297082911, iMyUid, iElapsedRealtime, new Object[]{this, context}, i2, i3);
        }

        public /* synthetic */ void v(Context context) {
            int i2 = 2 % 2;
            int i3 = f22166x + 95;
            f22164v = i3 % 128;
            int i4 = i3 % 2;
            this.f22170o.onWalletLoaded(context);
            this.f22169n.onWalletLoaded(context);
            int i5 = f22166x + 99;
            f22164v = i5 % 128;
            int i6 = i5 % 2;
        }

        private static void z(short s2, int i2, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
            int i5;
            long j2;
            int i6 = 2;
            int i7 = 2 % 2;
            j jVar = new j();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f22162t)};
                Object objA = o.d.d.a(-727631768);
                if (objA == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objA = o.d.d.a(((byte) KeyEvent.getModifierMetaStateMask()) + 239, (char) (44530 - TextUtils.lastIndexOf("", '0', 0, 0)), 11 - ExpandableListView.getPackedPositionGroup(0L), 35969549, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    int i8 = $10 + 113;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                if (i5 == 0) {
                    j2 = -7649639543924978291L;
                } else {
                    byte[] bArr = f22161s;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i10 = 0;
                        while (i10 < length) {
                            int i11 = $11 + 103;
                            $10 = i11 % 128;
                            int i12 = i11 % i6;
                            Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                            Object objA2 = o.d.d.a(-1239398195);
                            if (objA2 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objA2 = o.d.d.a(628 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 28649), 11 - KeyEvent.getDeadChar(0, 0), 1621469864, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
                            }
                            bArr2[i10] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                            i10++;
                            i6 = 2;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        int i13 = $10 + 49;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        byte[] bArr3 = f22161s;
                        Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(f22159q)};
                        Object objA3 = o.d.d.a(-727631768);
                        if (objA3 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = b7;
                            objA3 = o.d.d.a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 237, (char) (TextUtils.getOffsetAfter("", 0) + 44531), 10 - TextUtils.indexOf((CharSequence) "", '0', 0), 35969549, false, $$c(b7, b8, (byte) (b8 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f22162t) ^ (-7649639543924978291L))));
                        j2 = -7649639543924978291L;
                    } else {
                        j2 = -7649639543924978291L;
                        iIntValue = (short) (((short) (((long) f22167y[i2 + ((int) (((long) f22159q) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f22162t) ^ (-7649639543924978291L))));
                    }
                }
                if (iIntValue > 0) {
                    jVar.f19936d = ((i2 + iIntValue) - 2) + ((int) (((long) f22159q) ^ j2)) + i5;
                    Object[] objArr5 = {jVar, Integer.valueOf(i3), Integer.valueOf(f22160r), sb};
                    Object objA4 = o.d.d.a(1819197256);
                    if (objA4 == null) {
                        objA4 = o.d.d.a(ViewConfiguration.getJumpTapTimeout() >> 16, (char) (Gravity.getAbsoluteGravity(0, 0) + 5358), 12 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objA4).invoke(null, objArr5)).append(jVar.f19937e);
                    jVar.f19935c = jVar.f19937e;
                    byte[] bArr4 = f22161s;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i15 = 0; i15 < length2; i15++) {
                            bArr5[i15] = (byte) (((long) bArr4[i15]) ^ (-7649639543924978291L));
                        }
                        bArr4 = bArr5;
                    }
                    boolean z2 = bArr4 != null;
                    jVar.f19934b = 1;
                    while (jVar.f19934b < iIntValue) {
                        int i16 = $10 + 69;
                        $11 = i16 % 128;
                        if (i16 % 2 == 0) {
                            throw null;
                        }
                        if (z2) {
                            byte[] bArr6 = f22161s;
                            jVar.f19936d = jVar.f19936d - 1;
                            jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr6[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                        } else {
                            short[] sArr = f22167y;
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

        public final void a(final Context context) {
            int i2 = 2 % 2;
            int i3 = f22164v + 33;
            f22166x = i3 % 128;
            int i4 = i3 % 2;
            d(new Runnable() { // from class: o.cd.d$d$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.v(context);
                }
            }, true);
            int i5 = f22164v + 117;
            f22166x = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 21 / 0;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x00a0 A[DONT_GENERATE] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final synchronized void b() {
            /*
                r12 = this;
                monitor-enter(r12)
                r5 = 2
                int r0 = r5 % r5
                boolean r0 = o.cd.d.C0347d.f22156l     // Catch: java.lang.Throwable -> Lb1
                r2 = 1
                r4 = 0
                if (r0 == r2) goto L15
            La:
                int r0 = o.cd.d.C0347d.f22164v     // Catch: java.lang.Throwable -> Lb1
                int r1 = r0 + 41
                int r0 = r1 % 128
                o.cd.d.C0347d.f22166x = r0     // Catch: java.lang.Throwable -> Lb1
                int r1 = r1 % r5
                goto L9e
            L15:
                int r0 = o.cd.d.C0347d.f22164v     // Catch: java.lang.Throwable -> Lb1
                int r1 = r0 + 51
                int r0 = r1 % 128
                o.cd.d.C0347d.f22166x = r0     // Catch: java.lang.Throwable -> Lb1
                int r1 = r1 % r5
                if (r1 == 0) goto La8
                boolean r0 = o.ea.f.a()     // Catch: java.lang.Throwable -> Lb1
                r1 = 0
                if (r0 != 0) goto L2a
            L27:
                o.cd.d.C0347d.f22156l = r1     // Catch: java.lang.Throwable -> Lb1
                goto La
            L2a:
                int r0 = o.cd.d.C0347d.f22166x     // Catch: java.lang.Throwable -> Lb1
                int r3 = r0 + 21
                int r0 = r3 % 128
                o.cd.d.C0347d.f22164v = r0     // Catch: java.lang.Throwable -> Lb1
                int r3 = r3 % r5
                r3 = 0
                float r0 = android.graphics.PointF.length(r3, r3)     // Catch: java.lang.Throwable -> Lb1
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                int r0 = r0 + 78
                short r6 = (short) r0     // Catch: java.lang.Throwable -> Lb1
                int r0 = android.graphics.Color.green(r1)     // Catch: java.lang.Throwable -> Lb1
                r7 = -1958514134(0xffffffff8b43722a, float:-3.764152E-32)
                int r7 = r7 - r0
                int r0 = android.view.ViewConfiguration.getMaximumDrawingCacheSize()     // Catch: java.lang.Throwable -> Lb1
                int r0 = r0 >> 24
                r8 = -728701945(0xffffffffd490e407, float:-4.9784076E12)
                int r8 = r8 - r0
                int r0 = android.graphics.Color.argb(r1, r1, r1, r1)     // Catch: java.lang.Throwable -> Lb1
                int r9 = (-47) - r0
                r3 = 48
                char r0 = android.text.AndroidCharacter.getMirror(r3)     // Catch: java.lang.Throwable -> Lb1
                int r3 = r3 - r0
                byte r10 = (byte) r3     // Catch: java.lang.Throwable -> Lb1
                java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lb1
                z(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lb1
                r0 = r11[r1]     // Catch: java.lang.Throwable -> Lb1
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> Lb1
                java.lang.String r3 = r0.intern()     // Catch: java.lang.Throwable -> Lb1
                int r0 = android.view.View.MeasureSpec.getMode(r1)     // Catch: java.lang.Throwable -> Lb1
                int r0 = (-79) - r0
                short r6 = (short) r0     // Catch: java.lang.Throwable -> Lb1
                int r0 = android.graphics.Color.rgb(r1, r1, r1)     // Catch: java.lang.Throwable -> Lb1
                r7 = -1941736888(0xffffffff8c437248, float:-1.5056644E-31)
                int r7 = r7 + r0
                int r0 = android.graphics.Color.green(r1)     // Catch: java.lang.Throwable -> Lb1
                r8 = -728701915(0xffffffffd490e425, float:-4.9784234E12)
                int r8 = r8 + r0
                int r0 = android.view.KeyEvent.getModifierMetaStateMask()     // Catch: java.lang.Throwable -> Lb1
                byte r0 = (byte) r0     // Catch: java.lang.Throwable -> Lb1
                int r9 = r0 + (-43)
                int r0 = android.view.KeyEvent.getDeadChar(r1, r1)     // Catch: java.lang.Throwable -> Lb1
                byte r10 = (byte) r0     // Catch: java.lang.Throwable -> Lb1
                java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lb1
                z(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lb1
                r0 = r11[r1]     // Catch: java.lang.Throwable -> Lb1
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> Lb1
                java.lang.String r0 = r0.intern()     // Catch: java.lang.Throwable -> Lb1
                o.ea.f.c(r3, r0)     // Catch: java.lang.Throwable -> Lb1
                goto L27
            L9e:
                if (r1 == 0) goto La2
                monitor-exit(r12)
                return
            La2:
                r4.hashCode()     // Catch: java.lang.Throwable -> La6
                throw r4     // Catch: java.lang.Throwable -> La6
            La6:
                r0 = move-exception
                throw r0     // Catch: java.lang.Throwable -> Lb1
            La8:
                o.ea.f.a()     // Catch: java.lang.Throwable -> Lb1
                r4.hashCode()     // Catch: java.lang.Throwable -> Laf
                throw r4     // Catch: java.lang.Throwable -> Laf
            Laf:
                r0 = move-exception
                throw r0     // Catch: java.lang.Throwable -> Lb1
            Lb1:
                r0 = move-exception
                monitor-exit(r12)     // Catch: java.lang.Throwable -> Lb1
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.cd.d.C0347d.b():void");
        }

        public final void b(final Context context) {
            int i2 = 2 % 2;
            int i3 = f22164v + 111;
            f22166x = i3 % 128;
            int i4 = i3 % 2;
            d(new Runnable() { // from class: o.cd.d$d$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.u(context);
                }
            }, true);
            int i5 = f22164v + 85;
            f22166x = i5 % 128;
            int i6 = i5 % 2;
        }

        public final void c(final Context context) {
            int i2 = 2 % 2;
            int i3 = f22166x + 35;
            f22164v = i3 % 128;
            int i4 = i3 % 2;
            d(new Runnable() { // from class: o.cd.d$d$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.p(context);
                }
            }, true);
            int i5 = f22166x + 57;
            f22164v = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void c(final Context context, final String str, final List<EmvApplicationActivationMethod> list) {
            int i2 = 2 % 2;
            int i3 = f22166x + 89;
            f22164v = i3 % 128;
            int i4 = i3 % 2;
            d(new Runnable() { // from class: o.cd.d$d$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b(context, str, list);
                }
            }, true);
            int i5 = f22166x + 89;
            f22164v = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        public final void d(final Context context) {
            int i2 = 2 % 2;
            int i3 = f22166x + 69;
            f22164v = i3 % 128;
            int i4 = i3 % 2;
            d(new Runnable() { // from class: o.cd.d$d$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.q(context);
                }
            }, true);
            int i5 = f22166x + 13;
            f22164v = i5 % 128;
            int i6 = i5 % 2;
        }

        public final void d(final Context context, final Date date) {
            int i2 = 2 % 2;
            int i3 = f22164v + 43;
            f22166x = i3 % 128;
            d(i3 % 2 == 0 ? new Runnable() { // from class: o.cd.d$d$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.c(context, date);
                }
            } : new Runnable() { // from class: o.cd.d$d$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.c(context, date);
                }
            }, false);
            int i4 = f22166x + 31;
            f22164v = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX WARN: Removed duplicated region for block: B:81:0x0156  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x015d A[DONT_GENERATE] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final synchronized void e() {
            /*
                Method dump skipped, instruction units count: 354
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.cd.d.C0347d.e():void");
        }

        public final void e(final Context context) {
            Runnable runnable;
            boolean z2;
            int i2 = 2 % 2;
            int i3 = f22166x + 101;
            f22164v = i3 % 128;
            if (i3 % 2 != 0) {
                runnable = new Runnable() { // from class: o.cd.d$d$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.t(context);
                    }
                };
                z2 = true;
            } else {
                runnable = new Runnable() { // from class: o.cd.d$d$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.t(context);
                    }
                };
                z2 = false;
            }
            d(runnable, z2);
        }

        public final void e(Context context, WalletLockReason walletLockReason) {
            int iActiveCount = Thread.activeCount();
            int i2 = f22155j * 343183305;
            f22155j = i2;
            int i3 = f22151f * (-1428325798);
            f22151f = i3;
            c(-924701700, 924701703, i2, iActiveCount, new Object[]{this, context, walletLockReason}, i3, Thread.currentThread().getPriority());
        }

        public final void f(final Context context) {
            int i2 = 2 % 2;
            int i3 = f22164v + 107;
            f22166x = i3 % 128;
            int i4 = i3 % 2;
            d(new Runnable() { // from class: o.cd.d$d$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.r(context);
                }
            }, true);
            int i5 = f22166x + 117;
            f22164v = i5 % 128;
            int i6 = i5 % 2;
        }

        public final void g(final Context context) {
            int i2 = 2 % 2;
            int i3 = f22166x + 23;
            f22164v = i3 % 128;
            int i4 = i3 % 2;
            d(new Runnable() { // from class: o.cd.d$d$$ExternalSyntheticLambda12
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m(context);
                }
            }, false);
            int i5 = f22164v + 87;
            f22166x = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 42 / 0;
            }
        }

        public final void h(Context context) {
            int priority = Thread.currentThread().getPriority();
            int i2 = f22152g * (-1069714959);
            f22152g = i2;
            int i3 = f22153h * (-903482439);
            f22153h = i3;
            int i4 = f22157m * (-1820516114);
            f22157m = i4;
            c(-696648096, 696648100, i2, priority, new Object[]{this, context}, i3, i4);
        }

        public final void i(final Context context) {
            int i2 = 2 % 2;
            int i3 = f22164v + 111;
            f22166x = i3 % 128;
            d(i3 % 2 == 0 ? new Runnable() { // from class: o.cd.d$d$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.k(context);
                }
            } : new Runnable() { // from class: o.cd.d$d$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.k(context);
                }
            }, false);
            int i4 = f22164v + 63;
            f22166x = i4 % 128;
            int i5 = i4 % 2;
        }

        public final void j(final Context context) {
            int i2 = 2 % 2;
            int i3 = f22164v + 61;
            f22166x = i3 % 128;
            d(i3 % 2 == 0 ? new Runnable() { // from class: o.cd.d$d$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.s(context);
                }
            } : new Runnable() { // from class: o.cd.d$d$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.s(context);
                }
            }, false);
        }

        public final void o(final Context context) {
            int i2 = 2 % 2;
            int i3 = f22164v + 103;
            f22166x = i3 % 128;
            int i4 = i3 % 2;
            d(new Runnable() { // from class: o.cd.d$d$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.l(context);
                }
            }, false);
            int i5 = f22164v + 21;
            f22166x = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r9, short r10, byte r11) {
        /*
            byte[] r8 = o.cd.d.$$a
            int r0 = r11 * 2
            int r1 = r0 + 113
            int r2 = r9 + 4
            int r3 = r10 * 3
            int r0 = 1 - r3
            byte[] r7 = new byte[r0]
            r6 = 0
            int r5 = 0 - r3
            if (r8 != 0) goto L2d
            r0 = r2
            r3 = r5
            r4 = r6
        L16:
            int r1 = -r2
            int r1 = r1 + r3
            r3 = r4
            r2 = r0
        L1a:
            byte r0 = (byte) r1
            r7[r3] = r0
            int r4 = r3 + 1
            if (r3 != r5) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r7, r6)
            return r0
        L27:
            int r0 = r2 + 1
            r2 = r8[r0]
            r3 = r1
            goto L16
        L2d:
            r3 = r6
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cd.d.$$c(short, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22143d = 0;
        f22145g = 1;
        f22140a = 0;
        f22142c = 1;
        a();
        TextUtils.getTrimmedLength("");
        CdmaCellLocation.convertQuartSecToDecDegrees(0);
        SystemClock.elapsedRealtimeNanos();
        ViewConfiguration.getTapTimeout();
        SystemClock.currentThreadTimeMillis();
        KeyEvent.getMaxKeyCode();
        Color.rgb(0, 0, 0);
        KeyEvent.keyCodeFromString("");
        Process.myPid();
        int i2 = f22145g + 83;
        f22143d = i2 % 128;
        int i3 = i2 % 2;
    }

    private static WalletEventListener a(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f22142c + 65;
        f22140a = i3 % 128;
        int i4 = i3 % 2;
        try {
            Object[] objArr = new Object[1];
            f(30 - Color.alpha(0), "\ufffb\b\u000e\uffff\u0006\t\n\uffc8\u0011\ufffb\u0006\u0006\uffff\u000e\uffdf\u0010\uffff\b\u000e￦\u0003\r\u000e\uffff\b\uffff\f\u0000\f\uffc8", false, 259 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 27, objArr);
            String strD = m.d(context, ((String) objArr[0]).intern());
            try {
                Object[] objArr2 = new Object[1];
                f(29 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), "\ufffb\b\u000e\uffff\u0006\t\n\uffc8\u0011\ufffb\u0006\u0006\uffff\u000e\uffdf\u0010\uffff\b\u000e￦\u0003\r\u000e\uffff\b\uffff\f\u0000\f\uffc8", false, 259 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 26, objArr2);
                return (WalletEventListener) m.d(WalletEventListener.class, strD, ((String) objArr2[0]).intern());
            } catch (Exception unused) {
                Object[] objArr3 = new Object[1];
                f((-16777186) - Color.rgb(0, 0, 0), "\ufffb\b\u000e\uffff\u0006\t\n\uffc8\u0011\ufffb\u0006\u0006\uffff\u000e\uffdf\u0010\uffff\b\u000e￦\u0003\r\u000e\uffff\b\uffff\f\u0000\f\uffc8", false, Color.green(0) + 259, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 27, objArr3);
                return (WalletEventListener) m.d(DefaultWalletEventListener.class, strD, ((String) objArr3[0]).intern());
            }
        } catch (Exception unused2) {
            if (f.a()) {
                Object[] objArr4 = new Object[1];
                f(33 - View.combineMeasuredStates(0, 0), "\uffdd\u000e�\u0006\f￤\u0001\u000b\f�\u0006�\n\uffef\n\ufff9\b\b�\n\uffde\ufff9\ufffb\f\u0007\n\u0011\uffef\ufff9\u0004\u0004�\f", false, 260 - TextUtils.indexOf((CharSequence) "", '0'), 28 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr4);
                String strIntern = ((String) objArr4[0]).intern();
                Object[] objArr5 = new Object[1];
                f(52 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "\u0002\u0004\n\u0007\n\u0015\u0010\u000f\uffc1\u0011\u0010\r\u0006\u0015\u000f￢\uffc1\u0010\uffef\u0015\r\u0016\u0002\u0007\u0006\u0005\uffc1\u0006\f\u0002\u0015\uffc1ￍ\u0005\u000f\u0016\u0010\u0007\uffc1\u0006\u0004\n\u0017\u0013\u0006\u0014\uffc1\u000f\u0010\n\u0015", true, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 251, 19 - (Process.myTid() >> 22), objArr5);
                f.c(strIntern, ((String) objArr5[0]).intern());
                int i5 = f22140a + 5;
                f22142c = i5 % 128;
                int i6 = i5 % 2;
            }
            return new DefaultWalletEventListener();
        }
    }

    static void a() {
        f22141b = -1270219386;
    }

    public static C0347d b(Context context) {
        int i2 = 2 % 2;
        if (f22144e == null) {
            int i3 = f22140a + 87;
            f22142c = i3 % 128;
            if (i3 % 2 == 0) {
                c(context);
                int i4 = 51 / 0;
            } else {
                c(context);
            }
        }
        C0347d c0347d = f22144e;
        int i5 = f22140a + 27;
        f22142c = i5 % 128;
        int i6 = i5 % 2;
        return c0347d;
    }

    private static void c(Context context) throws Throwable {
        int i2 = 2 % 2;
        WalletNotificationServiceCallback walletNotificationServiceCallbackD = d(context);
        WalletEventListener walletEventListenerA = a(context);
        Object[] objArr = new Object[1];
        f(41 - (ViewConfiguration.getEdgeSlop() >> 16), "\u0005\ufffe\r\u0007\ufffa\u0012\u000b\b\r￼\ufffa\uffdf\u000b\ufffe\t\t\ufffa\u000b\ufff0\u000b\ufffe\u0007\ufffe\r\f\u0002￥\r\u0007\ufffe\u000f\uffde\r\ufffe\u0005\u0005\ufffa\ufff0ￇ\t\b", true, (ViewConfiguration.getJumpTapTimeout() >> 16) + 260, MotionEvent.axisFromString("") + 6, objArr);
        HandlerThread handlerThread = new HandlerThread(((String) objArr[0]).intern());
        handlerThread.start();
        f22144e = new C0347d(new e(handlerThread.getLooper()), walletNotificationServiceCallbackD, walletEventListenerA);
        int i3 = f22140a + 71;
        f22142c = i3 % 128;
        int i4 = i3 % 2;
    }

    private static WalletNotificationServiceCallback d(Context context) throws Throwable {
        int i2 = 2 % 2;
        try {
            Object[] objArr = new Object[1];
            f(Color.red(0) + 30, "\u0010\u0003�\uffff\u0000\f\uffc8\ufffb\b\u000e\uffff\u0006\t\n\uffc8\b\t\u000e\u0003\u0000\u0003�\ufffb\u000e\u0003\t\b￭\uffff\f", false, TextUtils.getTrimmedLength("") + 259, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4, objArr);
            String strD = m.d(context, ((String) objArr[0]).intern());
            int i3 = f22140a + 55;
            f22142c = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr2 = new Object[1];
            f(30 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0010\u0003�\uffff\u0000\f\uffc8\ufffb\b\u000e\uffff\u0006\t\n\uffc8\b\t\u000e\u0003\u0000\u0003�\ufffb\u000e\u0003\t\b￭\uffff\f", false, 258 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 4, objArr2);
            return (WalletNotificationServiceCallback) m.d(WalletNotificationServiceCallback.class, strD, ((String) objArr2[0]).intern());
        } catch (Exception unused) {
            if (f.a()) {
                Object[] objArr3 = new Object[1];
                f(33 - ExpandableListView.getPackedPositionGroup(0L), "\uffdd\u000e�\u0006\f￤\u0001\u000b\f�\u0006�\n\uffef\n\ufff9\b\b�\n\uffde\ufff9\ufffb\f\u0007\n\u0011\uffef\ufff9\u0004\u0004�\f", false, 261 - View.MeasureSpec.getMode(0), 27 - TextUtils.getOffsetBefore("", 0), objArr3);
                String strIntern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                f(52 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "\u0002\u0004\n\u0007\n\u0015\u0010\u000f\uffc1\u0011\u0010\r\u0006\u0015\u000f￢\uffc1\u0010\uffef\u0015\r\u0016\u0002\u0007\u0006\u0005\uffc1\u0006\f\u0002\u0015\uffc1ￍ\u0005\u000f\u0016\u0010\u0007\uffc1\u0006\u0004\n\u0017\u0013\u0006\u0014\uffc1\u000f\u0010\n\u0015", true, 253 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 18 - Process.getGidForName(""), objArr4);
                f.c(strIntern, ((String) objArr4[0]).intern());
                int i5 = f22140a + 109;
                f22142c = i5 % 128;
                int i6 = i5 % 2;
            }
            return new c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(int r19, java.lang.String r20, boolean r21, int r22, int r23, java.lang.Object[] r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cd.d.f(int, java.lang.String, boolean, int, int, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{119, -27, 45, 98};
        $$b = 111;
    }
}
