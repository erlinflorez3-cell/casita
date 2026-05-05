package o.o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.FragmentActivity;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.concurrent.Executor;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import o.a.n;
import o.a.q;
import o.ea.e;
import o.ea.f;
import o.ea.m;
import o.g.a;
import o.l.a;
import o.l.d;
import o.m.j;
import o.t.b;
import org.msgpack.core.MessagePack;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends o.l.c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f26656k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f26657l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f26658n;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f26659s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f26660t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static int f26661u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static int f26662v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static int f26663w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static long f26664x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static int f26665y = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final j f26666m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f26667p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f26668q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f26669r;

    /* JADX INFO: renamed from: o.o.c$2, reason: invalid class name */
    final class AnonymousClass2 extends BiometricPrompt.AuthenticationCallback {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f26670a = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f26671g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f26672h = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ a f26673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ HandlerThread f26674c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Handler f26675d;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(int r6, byte r7, short r8) {
            /*
                int r0 = r8 * 4
                int r8 = 1 - r0
                int r0 = r7 * 2
                int r7 = 115 - r0
                int r6 = r6 + 4
                byte[] r5 = o.o.c.AnonymousClass2.$$a
                byte[] r4 = new byte[r8]
                r3 = 0
                if (r5 != 0) goto L29
                r2 = r3
                r0 = r6
            L13:
                int r6 = r6 + r7
                r1 = r2
                r7 = r6
                r6 = r0
            L17:
                byte r0 = (byte) r7
                int r2 = r1 + 1
                r4[r1] = r0
                int r0 = r6 + 1
                if (r2 != r8) goto L26
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L26:
                r6 = r5[r0]
                goto L13
            L29:
                r1 = r3
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: o.o.c.AnonymousClass2.$$c(int, byte, short):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f26672h = 0;
            f26671g = 1;
            f26670a = -1270219473;
        }

        AnonymousClass2(Handler handler, a aVar, HandlerThread handlerThread) {
            this.f26675d = handler;
            this.f26673b = aVar;
            this.f26674c = handlerThread;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(a aVar) {
            int i2 = 2 % 2;
            int i3 = f26672h + 77;
            f26671g = i3 % 128;
            if (i3 % 2 == 0) {
                aVar.c(d.f26360i, c.this);
                int i4 = 95 / 0;
            } else {
                aVar.c(d.f26360i, c.this);
            }
            int i5 = f26671g + 35;
            f26672h = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(a aVar, d dVar) {
            int i2 = 2 % 2;
            int i3 = f26671g + 65;
            f26672h = i3 % 128;
            int i4 = i3 % 2;
            aVar.c(dVar, c.this);
            if (i4 != 0) {
                int i5 = 24 / 0;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(a aVar) {
            int i2 = 2 % 2;
            int i3 = f26672h + 55;
            f26671g = i3 % 128;
            int i4 = i3 % 2;
            aVar.c(c.this);
            int i5 = f26671g + 9;
            f26672h = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(a aVar, byte[] bArr) {
            int i2 = 2 % 2;
            aVar.b(new o.g.c(a.b.f26175c, new Date(), new o.g.d(bArr), null), c.this);
            int i3 = f26671g + 21;
            f26672h = i3 % 128;
            int i4 = i3 % 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(o.l.a aVar) {
            int i2 = 2 % 2;
            int i3 = f26671g + 105;
            f26672h = i3 % 128;
            if (i3 % 2 != 0) {
                aVar.c(d.f26360i, c.this);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            aVar.c(d.f26360i, c.this);
            int i4 = f26672h + 85;
            f26671g = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 66 / 0;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(o.l.a aVar) {
            int i2 = 2 % 2;
            int i3 = f26671g + 5;
            f26672h = i3 % 128;
            int i4 = i3 % 2;
            aVar.c(d.f26360i, c.this);
            int i5 = f26672h + 7;
            f26671g = i5 % 128;
            int i6 = i5 % 2;
        }

        private static void f(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
            Object charArray;
            String str2 = str;
            int i5 = 2 % 2;
            Object obj = null;
            if (str2 != null) {
                int i6 = $10 + 7;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    str2.toCharArray();
                    obj.hashCode();
                    throw null;
                }
                charArray = str2.toCharArray();
            } else {
                charArray = str2;
            }
            char[] cArr = (char[]) charArray;
            n nVar = new n();
            char[] cArr2 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                int i7 = $11 + 57;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                nVar.f19946e = cArr[nVar.f19944a];
                cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
                int i9 = nVar.f19944a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i9]), Integer.valueOf(f26670a)};
                    Object objA = o.d.d.a(1376241034);
                    if (objA == null) {
                        byte b2 = (byte) (-1);
                        byte b3 = (byte) (b2 + 1);
                        objA = o.d.d.a((ViewConfiguration.getJumpTapTimeout() >> 16) + 270, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getLongPressTimeout() >> 16) + 11, -2071844881, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {nVar, nVar};
                    Object objA2 = o.d.d.a(-202660535);
                    if (objA2 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (-b4);
                        objA2 = o.d.d.a((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 522, (char) ((-1) - Process.getGidForName("")), Color.red(0) + 12, 627984172, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
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
                int i10 = $10 + 29;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                nVar.f19945b = i4;
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
                System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
                int i12 = $11 + 19;
                $10 = i12 % 128;
                int i13 = i12 % 2;
            }
            if (z2) {
                char[] cArr4 = new char[i2];
                nVar.f19944a = 0;
                while (nVar.f19944a < i2) {
                    int i14 = $11 + 21;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                    Object[] objArr4 = {nVar, nVar};
                    Object objA3 = o.d.d.a(-202660535);
                    if (objA3 == null) {
                        byte b6 = (byte) (-1);
                        byte b7 = (byte) (-b6);
                        objA3 = o.d.d.a(522 - (ViewConfiguration.getEdgeSlop() >> 16), (char) KeyEvent.getDeadChar(0, 0), 11 - ImageFormat.getBitsPerPixel(0), 627984172, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                }
                int i16 = $10 + 31;
                $11 = i16 % 128;
                int i17 = i16 % 2;
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        static void init$0() {
            $$a = new byte[]{38, Ascii.CAN, 67, -113};
            $$b = 20;
        }

        @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
        public final void onAuthenticationError(int i2, CharSequence charSequence) throws Throwable {
            final d dVar;
            int i3 = 2 % 2;
            int i4 = f26672h + 55;
            f26671g = i4 % 128;
            int i5 = i4 % 2;
            if (f.a()) {
                Object[] objArr = new Object[1];
                f(((byte) KeyEvent.getModifierMetaStateMask()) + 49, Jg.Wd("C}燏u紗}(b哣K\u007f:⾩㇙|(\\\u000fኚ\bQ\u0006J\u000b\uf1a7i\u0016ད\u001c튜퓧Yjꩣ꾏놞i$`袉I}1ꀯ牉\u0002.u", (short) (C1633zX.Xd() ^ (-1602)), (short) (C1633zX.Xd() ^ (-25063))), false, TextUtils.indexOf((CharSequence) "", '0', 0) + 156, 24 - Color.red(0), objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                f((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43, ZO.xd("\r<7\uf52bGq>N臲\uef96\ud7a84k\u001da(i*⇷0潃\u000b`rv\u0019$\n뻾靧\uef84\u0019/ﾷ1bw\u001b#\u0010!iTe", (short) (ZN.Xd() ^ 17787), (short) (ZN.Xd() ^ 26274)), false, (Process.myTid() >> 22) + 148, 11 - Color.red(0), objArr2);
                f.d(strIntern, sb.append(((String) objArr2[0]).intern()).append(i2).toString());
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 5:
                case 8:
                case 12:
                    dVar = d.f26354c;
                    break;
                case 3:
                    dVar = d.f26352a;
                    break;
                case 6:
                default:
                    dVar = d.f26360i;
                    break;
                case 7:
                case 9:
                    dVar = d.f26355d;
                    break;
                case 10:
                    dVar = d.f26353b;
                    break;
                case 11:
                case 14:
                    dVar = d.f26360i;
                    break;
                case 13:
                    Object[] objArr3 = {c.this};
                    int i6 = o.l.c.f26343i * 1393535565;
                    o.l.c.f26343i = i6;
                    int iMyUid = Process.myUid();
                    int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                    int i7 = 1493295148 * o.l.c.f26342h;
                    o.l.c.f26342h = i7;
                    if (((o.l.c) o.l.c.b(iFreeMemory, i7, iMyUid, 1058468260, objArr3, -1058468258, i6)) == null) {
                        dVar = d.f26353b;
                        int i8 = f26671g + 17;
                        f26672h = i8 % 128;
                        int i9 = i8 % 2;
                    } else {
                        Handler handler = this.f26675d;
                        final o.l.a aVar = this.f26673b;
                        Runnable runnable = new Runnable() { // from class: o.o.c$2$$ExternalSyntheticLambda4
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f$0.c(aVar);
                            }
                        };
                        short sXd = (short) (C1499aX.Xd() ^ (-25916));
                        short sXd2 = (short) (C1499aX.Xd() ^ (-2162));
                        int[] iArr = new int["\t%-U\tfEpSc\u001c\u00148\u0007\u000e7p\u0014".length()];
                        QB qb = new QB("\t%-U\tfEpSc\u001c\u00148\u0007\u000e7p\u0014");
                        int i10 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i10] = xuXd.fK((C1561oA.Xd[i10 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i10 * sXd2))) + xuXd.CK(iKK));
                            i10++;
                        }
                        Object[] objArr4 = {runnable};
                        Method method = Class.forName(new String(iArr, 0, i10)).getMethod(EO.Od("\u0002+a\n", (short) (C1607wl.Xd() ^ 8459)), Class.forName(Ig.wd("%LM\u001a3Enl\u001a\r3x\"(3V\u000b\u0012", (short) (OY.Xd() ^ 22418))));
                        try {
                            method.setAccessible(true);
                            method.invoke(handler, objArr4);
                            dVar = null;
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                    break;
            }
            if (dVar != null) {
                int i11 = f26671g + 45;
                f26672h = i11 % 128;
                int i12 = i11 % 2;
                Handler handler2 = this.f26675d;
                final o.l.a aVar2 = this.f26673b;
                Object[] objArr5 = {new Runnable() { // from class: o.o.c$2$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(aVar2, dVar);
                    }
                }};
                Method method2 = Class.forName(C1561oA.Qd("\u0006\u0012\u0007\u0014\u0010\t\u0003K\f\u000fHay\u0006z\u0002y\u0006", (short) (ZN.Xd() ^ 32156))).getMethod(C1561oA.od("a_bb", (short) (FB.Xd() ^ 8602)), Class.forName(C1593ug.zd("QI_K\u0019XN\\V\u001eCgabVXc]", (short) (C1633zX.Xd() ^ (-301)), (short) (C1633zX.Xd() ^ (-30315)))));
                try {
                    method2.setAccessible(true);
                    method2.invoke(handler2, objArr5);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            this.f26674c.quitSafely();
        }

        @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
        public final void onAuthenticationFailed() {
            int i2 = 2 % 2;
            int i3 = f26672h + 63;
            f26671g = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }

        @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
        public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f26672h + 51;
            f26671g = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 48 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int scrollBarFadeDuration = 155 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int fadingEdgeLength = 24 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            Object[] objArr = new Object[1];
            short sXd = (short) (C1633zX.Xd() ^ (-19878));
            int[] iArr = new int["QP嬢W嬀\\\\Q嬨Y`V嬪嬩dZaa嬝gedhm嬜ij嬻p嬜嬾wk嬿孂嬠ovu孇~}u孉嬪\u0005\u0004\u0006".length()];
            QB qb = new QB("QP嬢W嬀\\\\Q嬨Y`V嬪嬩dZaa嬝gedhm嬜ij嬻p嬜嬾wk嬿孂嬠ovu孇~}u孉嬪\u0005\u0004\u0006");
            int i6 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i6] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i6));
                i6++;
            }
            f(i5, new String(iArr, 0, i6), false, scrollBarFadeDuration, fadingEdgeLength, objArr);
            String strIntern = ((String) objArr[0]).intern();
            try {
                if (f.a()) {
                    Object[] objArr2 = new Object[1];
                    f(TextUtils.getTrimmedLength("") + 45, Wg.Zd("H\u0603觿B\u0006$z湒\\ٽˋxHO'D\u0012o\u0002Z\u0017⫪B椾\u0014ꜞּfi@9\u0011&違睫휻6?\uecd3\u0017(vw\\C", (short) (C1580rY.Xd() ^ (-24508)), (short) (C1580rY.Xd() ^ (-2868))), false, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 151, 16 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr2);
                    f.c(strIntern, ((String) objArr2[0]).intern());
                    int i7 = f26671g + 89;
                    f26672h = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 2 % 3;
                    }
                }
                BiometricPrompt.CryptoObject cryptoObject = authenticationResult.getCryptoObject();
                if (cryptoObject == null) {
                    if (f.a()) {
                        Object[] objArr3 = new Object[1];
                        f(74 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), C1561oA.Xd("F:ILDM>DOMJ攅Y擵P擩GYO]Q]c擐擞擒]]擶ff[Ycj`[攟ndkk攖tcdghhjj擬擺擮x\u0001xy擳攵\u0006\u0006zx\u0003\n\u007fz放\u000e\u0004\u000b\u000b攂", (short) (C1633zX.Xd() ^ (-14544))), false, KeyEvent.normalizeMetaState(0) + 150, 6 - Color.red(0), objArr3);
                        f.d(strIntern, ((String) objArr3[0]).intern());
                    }
                    Handler handler = this.f26675d;
                    final o.l.a aVar = this.f26673b;
                    Runnable runnable = new Runnable() { // from class: o.o.c$2$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.d(aVar);
                        }
                    };
                    Class<?> cls = Class.forName(Wg.vd("\u001b' -%\u001e\u001cd!$az\u000f\u001b\u0014\u001b/;", (short) (FB.Xd() ^ 1601)));
                    Class<?>[] clsArr = new Class[1];
                    clsArr[0] = Class.forName(Qg.kd("\u0003x\rvB\u007fs\u007fw=`\u0003zykktl", (short) (ZN.Xd() ^ 15478), (short) (ZN.Xd() ^ 24850)));
                    Object[] objArr4 = {runnable};
                    short sXd2 = (short) (C1499aX.Xd() ^ (-21502));
                    short sXd3 = (short) (C1499aX.Xd() ^ (-20580));
                    int[] iArr2 = new int["8699".length()];
                    QB qb2 = new QB("8699");
                    int i9 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i9] = xuXd2.fK(sXd2 + i9 + xuXd2.CK(iKK2) + sXd3);
                        i9++;
                    }
                    Method method = cls.getMethod(new String(iArr2, 0, i9), clsArr);
                    try {
                        method.setAccessible(true);
                        method.invoke(handler, objArr4);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } else {
                    Cipher cipher = cryptoObject.getCipher();
                    try {
                        if (cipher == null) {
                            if (f.a()) {
                                int packedPositionGroup = 59 - ExpandableListView.getPackedPositionGroup(0L);
                                short sXd4 = (short) (FB.Xd() ^ 26806);
                                int[] iArr3 = new int["t}yth\u007f\uf864r\uf854euiugqu\uf82b\uf837\uf829ge\uf847jh[W_dXQN`TYW\uf84b\\IHIHFFD\uf80f\uf81b\uf80dJPFE\uf808:?E<8D5".length()];
                                QB qb3 = new QB("t}yth\u007f\uf864r\uf854euiugqu\uf82b\uf837\uf829ge\uf847jh[W_dXQN`TYW\uf84b\\IHIHFFD\uf80f\uf81b\uf80dJPFE\uf808:?E<8D5");
                                int i10 = 0;
                                while (qb3.YK()) {
                                    int iKK3 = qb3.KK();
                                    Xu xuXd3 = Xu.Xd(iKK3);
                                    iArr3[i10] = xuXd3.fK(sXd4 + i10 + xuXd3.CK(iKK3));
                                    i10++;
                                }
                                Object[] objArr5 = new Object[1];
                                f(packedPositionGroup, new String(iArr3, 0, i10), false, 148 - TextUtils.indexOf("", "", 0, 0), 58 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr5);
                                f.d(strIntern, ((String) objArr5[0]).intern());
                            }
                            Handler handler2 = this.f26675d;
                            final o.l.a aVar2 = this.f26673b;
                            Runnable runnable2 = new Runnable() { // from class: o.o.c$2$$ExternalSyntheticLambda1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f$0.a(aVar2);
                                }
                            };
                            short sXd5 = (short) (C1499aX.Xd() ^ (-5330));
                            int[] iArr4 = new int["\r\u001b\u000e\u001d\u001f\u001a\u0012\\#(_z\u0019'\u001a#!/".length()];
                            QB qb4 = new QB("\r\u001b\u000e\u001d\u001f\u001a\u0012\\#(_z\u0019'\u001a#!/");
                            int i11 = 0;
                            while (qb4.YK()) {
                                int iKK4 = qb4.KK();
                                Xu xuXd4 = Xu.Xd(iKK4);
                                iArr4[i11] = xuXd4.fK(xuXd4.CK(iKK4) - (sXd5 ^ i11));
                                i11++;
                            }
                            Class<?> cls2 = Class.forName(new String(iArr4, 0, i11));
                            Class<?>[] clsArr2 = new Class[1];
                            short sXd6 = (short) (C1580rY.Xd() ^ (-26008));
                            int[] iArr5 = new int["4,B.{;1?9\u0001&JDE9;F@".length()];
                            QB qb5 = new QB("4,B.{;1?9\u0001&JDE9;F@");
                            int i12 = 0;
                            while (qb5.YK()) {
                                int iKK5 = qb5.KK();
                                Xu xuXd5 = Xu.Xd(iKK5);
                                iArr5[i12] = xuXd5.fK(xuXd5.CK(iKK5) - (((sXd6 + sXd6) + sXd6) + i12));
                                i12++;
                            }
                            clsArr2[0] = Class.forName(new String(iArr5, 0, i12));
                            Object[] objArr6 = {runnable2};
                            Method method2 = cls2.getMethod(Xg.qd("FFKM", (short) (C1580rY.Xd() ^ (-19104)), (short) (C1580rY.Xd() ^ (-21754))), clsArr2);
                            try {
                                method2.setAccessible(true);
                                method2.invoke(handler2, objArr6);
                            } catch (InvocationTargetException e3) {
                                throw e3.getCause();
                            }
                        } else {
                            final byte[] bArrC = c.this.f26666m.l().c(cipher);
                            if (f.a()) {
                                Object[] objArr7 = new Object[1];
                                f(Color.alpha(0) + 66, Jg.Wd(";Y\u0006uGfd묭`=\u0007E䘭_\u0019\u0014\u0019of}n㽇ZG軴ꥋ퇘 .\u0003{\u0002=G꺩\u0016퐫k⍡\"QX}$Cf\b\u0012\u0005v\u0001犂^[DCO3\u001c!\u000el넰뮗\ue464_", (short) (C1580rY.Xd() ^ (-7481)), (short) (C1580rY.Xd() ^ (-3721))), true, (ViewConfiguration.getFadingEdgeLength() >> 16) + 150, TextUtils.indexOf((CharSequence) "", '0', 0) + 45, objArr7);
                                f.c(strIntern, ((String) objArr7[0]).intern());
                            }
                            Handler handler3 = this.f26675d;
                            final o.l.a aVar3 = this.f26673b;
                            Runnable runnable3 = new Runnable() { // from class: o.o.c$2$$ExternalSyntheticLambda2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f$0.c(aVar3, bArrC);
                                }
                            };
                            Class<?> cls3 = Class.forName(ZO.xd("Pn<\fC+1k\u001c\u00180\u000b\u0018 O{JN", (short) (C1607wl.Xd() ^ 26591), (short) (C1607wl.Xd() ^ 19317)));
                            Class<?>[] clsArr3 = new Class[1];
                            short sXd7 = (short) (C1499aX.Xd() ^ (-267));
                            short sXd8 = (short) (C1499aX.Xd() ^ (-30207));
                            int[] iArr6 = new int["\u001dY)Sz\u0007Jv0t\bU\n\u001e=#x/".length()];
                            QB qb6 = new QB("\u001dY)Sz\u0007Jv0t\bU\n\u001e=#x/");
                            int i13 = 0;
                            while (qb6.YK()) {
                                int iKK6 = qb6.KK();
                                Xu xuXd6 = Xu.Xd(iKK6);
                                iArr6[i13] = xuXd6.fK((C1561oA.Xd[i13 % C1561oA.Xd.length] ^ ((sXd7 + sXd7) + (i13 * sXd8))) + xuXd6.CK(iKK6));
                                i13++;
                            }
                            clsArr3[0] = Class.forName(new String(iArr6, 0, i13));
                            Object[] objArr8 = {runnable3};
                            Method method3 = cls3.getMethod(Ig.wd("4\f\u001e;", (short) (ZN.Xd() ^ 8826)), clsArr3);
                            try {
                                method3.setAccessible(true);
                                method3.invoke(handler3, objArr8);
                            } catch (InvocationTargetException e4) {
                                throw e4.getCause();
                            }
                        }
                    } catch (IllegalArgumentException | BadPaddingException | IllegalBlockSizeException | o.t.d e5) {
                        if (f.a()) {
                            Object[] objArr9 = new Object[1];
                            f(37 - View.resolveSizeAndState(0, 0, 0), EO.Od("|7\u001f\u000b罔\u0007)d\u0005pu[\u0007矫\ne!0Rew5EV柬杤朐插q!<W\u007f\u001cc0ᴆ", (short) (C1580rY.Xd() ^ (-31737))), true, 150 - ExpandableListView.getPackedPositionType(0L), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 16, objArr9);
                            f.e(strIntern, ((String) objArr9[0]).intern(), e5);
                        }
                        Handler handler4 = this.f26675d;
                        final o.l.a aVar4 = this.f26673b;
                        Runnable runnable4 = new Runnable() { // from class: o.o.c$2$$ExternalSyntheticLambda3
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f$0.e(aVar4);
                            }
                        };
                        Class<?> cls4 = Class.forName(C1561oA.Qd("6B7D@93{<?x\u0012*6+2*6", (short) (FB.Xd() ^ 28371)));
                        Class<?>[] clsArr4 = new Class[1];
                        clsArr4[0] = Class.forName(C1593ug.zd("bZp\\*i_mg/Txrsgitn", (short) (C1607wl.Xd() ^ 17519), (short) (C1607wl.Xd() ^ 17854)));
                        Object[] objArr10 = {runnable4};
                        short sXd9 = (short) (C1499aX.Xd() ^ (-1320));
                        int[] iArr7 = new int["|z}}".length()];
                        QB qb7 = new QB("|z}}");
                        int i14 = 0;
                        while (qb7.YK()) {
                            int iKK7 = qb7.KK();
                            Xu xuXd7 = Xu.Xd(iKK7);
                            iArr7[i14] = xuXd7.fK(sXd9 + sXd9 + i14 + xuXd7.CK(iKK7));
                            i14++;
                        }
                        Method method4 = cls4.getMethod(new String(iArr7, 0, i14), clsArr4);
                        try {
                            method4.setAccessible(true);
                            method4.invoke(handler4, objArr10);
                        } catch (InvocationTargetException e6) {
                            throw e6.getCause();
                        }
                    }
                }
            } finally {
                this.f26674c.quitSafely();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r8, short r9, short r10) {
        /*
            int r0 = r9 * 2
            int r7 = 3 - r0
            int r0 = r10 * 7
            int r6 = 78 - r0
            int r1 = r8 * 4
            int r0 = 1 - r1
            byte[] r5 = o.o.c.$$a
            byte[] r4 = new byte[r0]
            r3 = 0
            int r2 = 0 - r1
            if (r5 != 0) goto L2b
            r0 = r6
            r1 = r3
            r6 = r2
        L18:
            int r6 = r6 + r0
        L19:
            int r7 = r7 + 1
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r1 != r2) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L26:
            int r1 = r1 + 1
            r0 = r5[r7]
            goto L18
        L2b:
            r1 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.o.c.$$c(byte, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26661u = 0;
        f26665y = 1;
        f26663w = 0;
        f26662v = 1;
        g();
        ViewConfiguration.getMaximumDrawingCacheSize();
        f26658n = R.string.antelopDeviceBiometricPromptName;
        f26656k = R.string.antelopDeviceBiometricPromptDefaultTitle;
        f26657l = R.string.antelopDeviceBiometricPromptDefaultSubtitle;
        f26659s = R.string.antelopDeviceBiometricPromptCancelButtonLabel;
        f26660t = R.drawable.antelopDeviceBiometricPromptIcon;
        int i2 = f26661u + 75;
        f26665y = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public c(Context context, String str, String str2, j jVar) {
        super(c(context), f26660t);
        if (str == null || c$$ExternalSyntheticBackport0.m(str)) {
            Object[] objArr = {b(context)};
            int i2 = m.f23563d * 691068131;
            m.f23563d = i2;
            int i3 = m.f23561b * (-1916120846);
            m.f23561b = i3;
            this.f26669r = (String) m.c(objArr, (int) SystemClock.uptimeMillis(), i3, -327535505, i2, 327535505, Process.myUid());
        } else {
            int i4 = m.f23563d * 691068131;
            m.f23563d = i4;
            int i5 = m.f23561b * (-1916120846);
            m.f23561b = i5;
            this.f26669r = (String) m.c(new Object[]{str}, (int) SystemClock.uptimeMillis(), i5, -327535505, i4, 327535505, Process.myUid());
        }
        if (str2 == null) {
            Object[] objArr2 = {d(context)};
            int i6 = m.f23563d * 691068131;
            m.f23563d = i6;
            int i7 = m.f23561b * (-1916120846);
            m.f23561b = i7;
            this.f26668q = (String) m.c(objArr2, (int) SystemClock.uptimeMillis(), i7, -327535505, i6, 327535505, Process.myUid());
        } else {
            int i8 = m.f23563d * 691068131;
            m.f23563d = i8;
            int i9 = m.f23561b * (-1916120846);
            m.f23561b = i9;
            this.f26668q = (String) m.c(new Object[]{str2}, (int) SystemClock.uptimeMillis(), i9, -327535505, i8, 327535505, Process.myUid());
        }
        this.f26667p = e(context);
        this.f26666m = jVar;
    }

    private static String b(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26663w + 35;
        f26662v = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Kd("y\b~\u000e\f\u0007\u0003M\u0004\u0011\u0011\u0018\n\u0014\u001bUk\u0019\u0019 \u0012&#", (short) (C1580rY.Xd() ^ (-13525)))).getMethod(Wg.Zd("[\f\u0005\f\u0007G-\\AdPF", (short) (C1633zX.Xd() ^ (-28760)), (short) (C1633zX.Xd() ^ (-15384))), new Class[0]);
        try {
            method.setAccessible(true);
            String string = ((Resources) method.invoke(context, objArr)).getString(f26656k);
            if (i4 == 0) {
                int i5 = 12 / 0;
            }
            return string;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static String c(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26663w + 81;
        f26662v = i3 % 128;
        int i4 = i3 % 2;
        Class<?> cls = Class.forName(C1561oA.Xd("\u0003\u0011\b\u0017\u0015\u0010\fV\r\u001a\u001a!\u0013\u001d$^t\"\")\u001b/,", (short) (FB.Xd() ^ 1400)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (ZN.Xd() ^ 24053);
        int[] iArr = new int["\u001b\u001a&\u0005\u001d,%,\u001e\u0010\u000f\u001e".length()];
        QB qb = new QB("\u001b\u001a&\u0005\u001d,%,\u001e\u0010\u000f\u001e");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK((sXd ^ i5) + xuXd.CK(iKK));
            i5++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i5), clsArr);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            if (i4 == 0) {
                resources.getString(f26658n);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String string = resources.getString(f26658n);
            int i6 = f26662v + 115;
            f26663w = i6 % 128;
            int i7 = i6 % 2;
            return string;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(HandlerThread handlerThread, Runnable runnable) throws Throwable {
        int i2 = 2 % 2;
        e eVar = new e(handlerThread.getLooper());
        Class<?> cls = Class.forName(Qg.kd("MYN[WPJ\u0013SV\u0010)AMBIAM", (short) (C1499aX.Xd() ^ (-27796)), (short) (C1499aX.Xd() ^ (-19004))));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (Od.Xd() ^ (-24849));
        short sXd2 = (short) (Od.Xd() ^ (-3485));
        int[] iArr = new int["\u0017\r!\u000bV\u0014\b\u0014\fQt\u0017\u000f\u000e\u007f\u007f\t\u0001".length()];
        QB qb = new QB("\u0017\r!\u000bV\u0014\b\u0014\fQt\u0017\u000f\u000e\u007f\u007f\t\u0001");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(sXd + i3 + xuXd.CK(iKK) + sXd2);
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i3));
        Object[] objArr = {runnable};
        Method method = cls.getMethod(C1561oA.ud("\f\n\r\r", (short) (Od.Xd() ^ (-9081))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(eVar, objArr);
            int i4 = f26662v + 83;
            f26663w = i4 % 128;
            int i5 = i4 % 2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(BiometricPrompt biometricPrompt, FragmentActivity fragmentActivity) {
        int i2 = 2 % 2;
        int i3 = f26663w + 31;
        f26662v = i3 % 128;
        if (i3 % 2 != 0) {
            biometricPrompt.cancelAuthentication();
            fragmentActivity.finish();
        } else {
            biometricPrompt.cancelAuthentication();
            fragmentActivity.finish();
            throw null;
        }
    }

    private static String d(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26662v + 71;
        f26663w = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.yd("5C6E?:2|/<8?-7:t'TPWEYR", (short) (C1580rY.Xd() ^ (-22097)))).getMethod(C1561oA.Yd("zy\nh|\f\t\u0010\u000e\u007f\u0003\u0012", (short) (C1633zX.Xd() ^ (-13827))), new Class[0]);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            int i5 = f26657l;
            if (i4 == 0) {
                return resources.getString(i5);
            }
            resources.getString(i5);
            throw null;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static String e(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26663w + 83;
        f26662v = i3 % 128;
        int i4 = i3 % 2;
        Class<?> cls = Class.forName(Xg.qd("\u0002\u0010\u0007\u0016\u0014\u000f\u000bU\f\u0019\u0019 \u0012\u001c#]s!!(\u001a.+", (short) (C1633zX.Xd() ^ (-114)), (short) (C1633zX.Xd() ^ (-11632))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (Od.Xd() ^ (-18147));
        short sXd2 = (short) (Od.Xd() ^ (-30716));
        int[] iArr = new int["\u000ba\u000b\u0003+\u0015)OU\u001f9_".length()];
        QB qb = new QB("\u000ba\u000b\u0003+\u0015)OU\u001f9_");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK(xuXd.CK(iKK) - ((i5 * sXd2) ^ sXd));
            i5++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i5), clsArr);
        try {
            method.setAccessible(true);
            String string = ((Resources) method.invoke(context, objArr)).getString(f26659s);
            int i6 = f26663w + 41;
            f26662v = i6 % 128;
            int i7 = i6 % 2;
            return string;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static void g() {
        f26664x = -3305836090433408411L;
    }

    private String h() {
        int i2 = 2 % 2;
        int i3 = f26663w;
        int i4 = i3 + 13;
        f26662v = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f26667p;
        int i6 = i3 + 71;
        f26662v = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void init$0() {
        $$a = new byte[]{34, 36, MessagePack.Code.EXT32, -5};
        $$b = PanasonicMakernoteDirectory.TAG_BURST_SPEED;
    }

    private static void z(String str, int i2, Object[] objArr) throws Throwable {
        Object obj;
        String str2 = str;
        int i3 = 2 % 2;
        if (str2 != null) {
            char[] charArray = str2.toCharArray();
            int i4 = $10 + 1;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            obj = charArray;
        } else {
            obj = str2;
        }
        char[] cArr = (char[]) obj;
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i6 = $10 + 93;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = qVar.f19948a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA = o.d.d.a(-1011865131);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(731 - KeyEvent.keyCodeFromString(""), (char) (Color.green(0) + 7933), 11 - TextUtils.getTrimmedLength(""), 355847088, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i8] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f26664x ^ 4743694005979712847L);
                Object[] objArr3 = {qVar, qVar};
                Object objA2 = o.d.d.a(1452497747);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(836 - View.MeasureSpec.getMode(0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27278), 10 - ImageFormat.getBitsPerPixel(0), -2145994442, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
            Object[] objArr4 = {qVar, qVar};
            Object objA3 = o.d.d.a(1452497747);
            if (objA3 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objA3 = o.d.d.a(836 - (Process.myTid() >> 22), (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 27279), 11 - (Process.myTid() >> 22), -2145994442, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        String str3 = new String(cArr2);
        int i9 = $10 + 101;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        objArr[0] = str3;
    }

    @Override // o.l.c
    public final boolean a() {
        int i2 = 2 % 2;
        int i3 = f26662v + 77;
        f26663w = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    @Override // o.l.c
    public final void e(final FragmentActivity fragmentActivity, int i2, CancellationSignal cancellationSignal, o.l.a aVar) throws Throwable {
        String strH;
        int i3 = 2 % 2;
        if (f.a()) {
            int i4 = f26662v + 35;
            f26663w = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            z("｣肩\u009e肈ì胏Á耧+耜\r聇_职Ʊ膬Ǝ臥ǩ臞ǭ脮ć脕Ž腢ŝ芧ʇ芆ʘ英˯苉Ȥ舤ȝ舊ɰ艘ɍ莱Θ莗Ϲ菮ό菝", 32750 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            z("ｎᄊ⏋㖁䙢堦櫥粚贌鿺놓쉽퐯\ue6e9\uf8bdङᯃ", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 61001, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i6 = f26662v + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f26663w = i6 % 128;
            int i7 = i6 % 2;
        }
        try {
            this.f26666m.l();
            Cipher cipherC = b.c();
            e eVar = new e(Looper.myLooper());
            Object[] objArr3 = new Object[1];
            z("ｋ囏걈Ϯ奪냲ؘ巉댶બ怲랺\u0dcd捀뫲ၦ柵뵼ᒉ樏솄ᜤ溻쐔ᩗ燊은Ử瑳쯰ℒ碾츿▵笴텎⣈繉헡⭤苳\ud81d⾍蔜\udca0㈕覢\udfc0㕗賁\ue278", Gravity.getAbsoluteGravity(0, 0) + 43403, objArr3);
            final HandlerThread handlerThread = new HandlerThread(((String) objArr3[0]).intern());
            handlerThread.start();
            Executor executor = new Executor() { // from class: o.o.c$$ExternalSyntheticLambda1
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) throws Throwable {
                    c.c(handlerThread, runnable);
                }
            };
            if (c() != null) {
                int i8 = f26663w + 81;
                f26662v = i8 % 128;
                if (i8 % 2 == 0) {
                    c().d();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                strH = c().d();
                int i9 = f26663w + 47;
                f26662v = i9 % 128;
                int i10 = i9 % 2;
            } else {
                strH = h();
            }
            BiometricPrompt.PromptInfo.Builder negativeButtonText = new BiometricPrompt.PromptInfo.Builder().setTitle(this.f26669r).setSubtitle(this.f26668q).setAllowedAuthenticators(15).setNegativeButtonText(strH);
            final BiometricPrompt biometricPrompt = new BiometricPrompt(fragmentActivity, executor, new AnonymousClass2(eVar, aVar, handlerThread));
            cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: o.o.c$$ExternalSyntheticLambda2
                @Override // android.os.CancellationSignal.OnCancelListener
                public final void onCancel() {
                    c.c(biometricPrompt, fragmentActivity);
                }
            });
            biometricPrompt.authenticate(negativeButtonText.build(), new BiometricPrompt.CryptoObject(cipherC));
        } catch (o.t.d unused) {
            aVar.c(d.f26360i, this);
        }
    }
}
