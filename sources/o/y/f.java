package o.y;

import android.app.Activity;
import android.content.Context;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import fr.antelop.sdk.AntelopErrorCode;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import o.ap.h;
import o.ep.i;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends d<h.e, h.b, o.ap.h<o.es.b>, o.es.b> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static int A = 0;
    private static int B = 0;
    private static int C = 0;

    /* JADX INFO: renamed from: q */
    public static int f27150q = 0;

    /* JADX INFO: renamed from: t */
    public static int f27151t = 0;

    /* JADX INFO: renamed from: v */
    private static char f27152v = 0;

    /* JADX INFO: renamed from: w */
    private static char[] f27153w = null;

    /* JADX INFO: renamed from: y */
    public static int f27154y = 0;

    /* JADX INFO: renamed from: z */
    private static int f27155z = 0;

    /* JADX INFO: renamed from: u */
    private Activity f27156u;

    /* JADX INFO: renamed from: x */
    private final boolean f27157x;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x001f -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(int r7, byte r8, short r9) {
        /*
            int r0 = r7 * 3
            int r7 = 3 - r0
            int r6 = r8 * 3
            int r0 = r6 + 1
            int r5 = r9 + 102
            byte[] r4 = o.y.f.$$d
            byte[] r3 = new byte[r0]
            r2 = 0
            if (r4 != 0) goto L26
            r0 = r6
            r1 = r2
        L13:
            int r5 = r5 + r0
        L14:
            byte r0 = (byte) r5
            r3[r1] = r0
            if (r1 != r6) goto L1f
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L1f:
            int r7 = r7 + 1
            r0 = r4[r7]
            int r1 = r1 + 1
            goto L13
        L26:
            r1 = r2
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.y.f.$$j(int, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f27154y = 268533940;
        f27150q = 733631058;
        f27151t = 1150488924;
        f27155z = 0;
        A = 1;
        C = 0;
        B = 1;
        r();
        ViewConfiguration.getMinimumFlingVelocity();
        View.getDefaultSize(0, 0);
        int i2 = f27155z + 71;
        A = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public f(String str, o.ep.d dVar, boolean z2, boolean z3) {
        super(str, dVar, z2);
        this.f27157x = z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void F(int r28, java.lang.String r29, byte r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 974
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.y.f.F(int, java.lang.String, byte, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = B + 103;
        C = i3 % 128;
        int i4 = i3 % 2;
        AntelopErrorCode antelopErrorCode = AntelopErrorCode.SamsungPayWalletNotAvailable;
        int i5 = C + 71;
        B = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 31 / 0;
        }
        return antelopErrorCode;
    }

    private static o.ap.h<o.es.b> a(o.es.b bVar) {
        int i2 = f27150q * (-1058112374);
        f27150q = i2;
        int i3 = (-456530084) * f27154y;
        f27154y = i3;
        return (o.ap.h) e(i3, (int) Process.getElapsedCpuTime(), new Object[]{bVar}, 97625018, i2, Thread.activeCount(), -97625017);
    }

    public static /* synthetic */ Object e(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
        int i8 = ~i4;
        int i9 = ~i7;
        int i10 = ~i5;
        int i11 = (~(((-1) - (((-1) - i8) & ((-1) - i9))) | i10)) | (~((-1) - (((-1) - i4) & ((-1) - i7))));
        int i12 = ~(i5 | i7);
        int i13 = i11 | i12;
        int i14 = ~(i8 | i7);
        int i15 = i12 | ((-1) - (((-1) - i8) & ((-1) - (~((-1) - (((-1) - i9) & ((-1) - i10)))))));
        int i16 = i4 + i7 + i2 + (1349231875 * i3) + (1735201104 * i6);
        int i17 = i16 * i16;
        int i18 = ((-413510627) * i4) + 1558183936 + (237349861 * i7) + (i13 * 325430244) + (325430244 * i14) + ((-325430244) * i15) + ((-88080384) * i2) + ((-1337982976) * i3) + (469762048 * i6) + (1272971264 * i17);
        int i19 = ((i4 * 236314795) - 374860141) + (i7 * 236313123) + (i13 * (-836)) + (i14 * (-836)) + (i15 * 836) + (i2 * 236313959) + (i3 * (-66979019)) + (i6 * (-1872492752)) + (i17 * (-417333248));
        return i18 + ((i19 * i19) * 639631360) != 1 ? a(objArr) : e(objArr);
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        int i2 = 2 % 2;
        o.ap.h hVar = new o.ap.h((o.es.b) objArr[0]);
        int i3 = B + 73;
        C = i3 % 128;
        if (i3 % 2 == 0) {
            return hVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private o.es.b e(Context context) {
        o.es.b bVarP;
        int i2 = 2 % 2;
        int i3 = C + 83;
        int i4 = i3 % 128;
        B = i4;
        int i5 = i3 % 2;
        if (!(!this.f27157x)) {
            int i6 = i4 + 89;
            C = i6 % 128;
            int i7 = i6 % 2;
            o.ea.b.a();
            bVarP = o.ea.b.q(context);
        } else {
            o.ea.b.a();
            bVarP = o.ea.b.p(context);
        }
        int i8 = C + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        B = i8 % 128;
        if (i8 % 2 != 0) {
            return bVarP;
        }
        throw null;
    }

    static void init$0() {
        $$d = new byte[]{120, -15, 89, -97};
        $$e = 140;
    }

    static void r() {
        f27153w = new char[]{64584, 64580, 65468, 64517, 64582, 64592, 64583, 65469, 64609, 64598, 64579, 64593, 65471, 65470, 64581, 64589, 64614, 64578, 64585, 64577, 65466, 64630, 64587, 65465, 64620, 64586, 64597, 64594, 64588, 64595, 64625, 64629, 65467, 64576, 64604, 64599};
        f27152v = (char) 51641;
    }

    @Override // o.y.d
    final /* synthetic */ o.es.c a(Context context) {
        int i2 = 2 % 2;
        int i3 = C + 61;
        B = i3 % 128;
        int i4 = i3 % 2;
        o.es.b bVarE = e(context);
        int i5 = C + 35;
        B = i5 % 128;
        int i6 = i5 % 2;
        return bVarE;
    }

    @Override // o.y.c
    final void a_() throws Throwable {
        int i2 = 2 % 2;
        int i3 = C + 35;
        B = i3 % 128;
        int i4 = i3 % 2;
        if (!((d) this).f27099l) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr = new Object[1];
            F(17 - TextUtils.getTrimmedLength(""), "\u0013\u0003\u0003\u0006\u0004\u0017\r#\u0004\u001f\u001b\u0003\u0005#\"\n㙉", (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 75), objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            F(17 - TextUtils.indexOf((CharSequence) "", '0'), "!\f\u0003\t\n\u001a\u0010\u001d\u0007\u0005\u0015\u0000\r\u0004\u001f\u0017\u0002\u000f", (byte) (4 - (KeyEvent.getMaxKeyCode() >> 16)), objArr2);
            StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern()).append(((c) this).f27088r.b());
            Object[] objArr3 = new Object[1];
            F(37 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "\u000f\u0002\u0019\u001f\u0003\u000f\u0004\u0015\u001d\u0007\t\u000f\u0002\u001d\u001b\u001a\u0005\u0011\u0002\u001b\u0003\u000b\u0015\t\u0007\u001d\t\u001b\u0002\u0001\u000b\u0003\u0017\u0010\u0001\u0007㘺", (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 86), objArr3);
            throw new WalletValidationException(walletValidationErrorCode, strIntern, sbAppend.append(((String) objArr3[0]).intern()).toString());
        }
        if (((c) this).f27088r.s() != null) {
            Object[] objArr4 = {((c) this).f27088r.s()};
            int i5 = 574268897 * o.ep.c.f24438e;
            o.ep.c.f24438e = i5;
            int id = (int) Thread.currentThread().getId();
            int i6 = o.ep.c.f24436c * 1169734117;
            o.ep.c.f24436c = i6;
            int i7 = (-2104816085) * o.ep.c.f24434a;
            o.ep.c.f24434a = i7;
            if (((String) o.ep.c.c(i5, id, i7, 1241915024, objArr4, -1241915024, i6)) == null) {
                WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.WrongState;
                Object[] objArr5 = new Object[1];
                F(18 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "\u0013\u0003\u0003\u0006\u0004\u0017\r#\u0004\u001f\u001b\u0003\u0005#\"\n㙉", (byte) (74 - (Process.myTid() >> 22)), objArr5);
                String strIntern2 = ((String) objArr5[0]).intern();
                Object[] objArr6 = new Object[1];
                F((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 52, "\r\u0004㙢㙢\u001d\u0007\u0002\u001b\u0003\u000b\u0015\t\u0007\u001d\t\u000f\u0002\u0001\u000b\u0003\u0017\u0010\u0002\u001b\u0004\u001f\u0004\u0002\u0004\u0005\u0005\u001f\u0015\u0001\u001c\u001d\t\u0011\u001d\u0001\t\u0005\u0013\u0000\n\u0006\u0001\u0015\u001d\u0010\u001d\n㙗", (byte) (((Process.getThreadPriority(0) + 20) >> 6) + 110), objArr6);
                throw new WalletValidationException(walletValidationErrorCode2, strIntern2, ((String) objArr6[0]).intern());
            }
        }
        int i8 = C + 73;
        B = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // o.y.d
    final /* synthetic */ o.ap.b b(o.es.c cVar, o.ea.h hVar) {
        int i2 = 2 % 2;
        int i3 = B + 51;
        C = i3 % 128;
        int i4 = i3 % 2;
        int i5 = f27150q * (-1058112374);
        f27150q = i5;
        int i6 = (-456530084) * f27154y;
        f27154y = i6;
        o.ap.h hVar2 = (o.ap.h) e(i6, (int) Process.getElapsedCpuTime(), new Object[]{(o.es.b) cVar}, 97625018, i5, Thread.activeCount(), -97625017);
        int i7 = C + 25;
        B = i7 % 128;
        int i8 = i7 % 2;
        return hVar2;
    }

    @Override // o.x.i
    public final String c() throws Throwable {
        int i2 = 2 % 2;
        int i3 = C + 29;
        B = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        F(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 27, "\u001b\u0003\u0005\u0000\u001e\"\r\u0004\u001f\u0017#\u0001\u000f\u0015\u001f\u0018\u0013\u0003\u0003\u0006\u0004\u0017\r#\u0004\u001f", (byte) (TextUtils.getOffsetBefore("", 0) + 32), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = B + 87;
        C = i5 % 128;
        int i6 = i5 % 2;
        return strIntern;
    }

    public final void c(Activity activity, o.x.f fVar) throws WalletValidationException {
        int i2 = 2 % 2;
        int i3 = C + 21;
        B = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            int i5 = B + 79;
            C = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            F(44 - TextUtils.lastIndexOf("", '0', 0, 0), "\u001c\u0012\u0015\"!\u0017\"\u0003\u000b\u0005 \t\u001d\u0010\u001d\n\u0000\u0013\r\u0004\u001f\u0017#\u0001\u000f\u0015\u001f\u0018\u0013\u0003\u0003\u0006\u0004\u0017\r#\u0004\u001f \u001e\u001c\u0001\u0003\u000f㘽", (byte) (83 - TextUtils.lastIndexOf("", '0', 0, 0)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            F(11 - TextUtils.lastIndexOf("", '0'), "\u0013\u0000\u0004\u0017\u0003\u0010#\u0001\f\u0018\"\n", (byte) (18 - KeyEvent.normalizeMetaState(0)), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        this.f27156u = activity;
        b(activity, fVar);
    }

    @Override // o.y.d
    final String k() throws Throwable {
        int i2 = 2 % 2;
        int i3 = C + 35;
        B = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        F(10 - TextUtils.lastIndexOf("", '0'), "\u0013\u0003\u0003\u0006\u0004\u0017\u000f\u0005\u0001\u0007㗿", (byte) (27 - ImageFormat.getBitsPerPixel(0)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = B + 45;
        C = i5 % 128;
        if (i5 % 2 == 0) {
            return strIntern;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.y.d
    final Activity l() {
        int i2 = 2 % 2;
        int i3 = C;
        int i4 = i3 + 109;
        B = i4 % 128;
        int i5 = i4 % 2;
        Activity activity = this.f27156u;
        int i6 = i3 + 113;
        B = i6 % 128;
        int i7 = i6 % 2;
        return activity;
    }

    @Override // o.y.d
    final i.c m() {
        int i2 = 2 % 2;
        int i3 = B + 101;
        C = i3 % 128;
        int i4 = i3 % 2;
        i.c cVar = i.c.f24666c;
        int i5 = B + 41;
        C = i5 % 128;
        int i6 = i5 % 2;
        return cVar;
    }

    @Override // o.y.d
    final String n() throws Throwable {
        int i2 = 2 % 2;
        int i3 = B + 95;
        C = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        F(44 - Process.getGidForName(""), "\u001c\u0012\u0015\"!\u0017\"\u0003\u000b\u0005 \t\u001d\u0010\u001d\n\u0000\u0013\r\u0004\u001f\u0017#\u0001\u000f\u0015\u001f\u0018\u0013\u0003\u0003\u0006\u0004\u0017\r#\u0004\u001f \u001e\u001c\u0001\u0003\u000f㘽", (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 84), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = C + 55;
        B = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 96 / 0;
        }
        return strIntern;
    }

    @Override // o.y.d
    final AntelopErrorCode o() {
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i2 = f27151t * 348195617;
        f27151t = i2;
        return (AntelopErrorCode) e(iFreeMemory, i2, new Object[]{this}, -371021387, iUptimeMillis, Process.myUid(), 371021387);
    }

    @Override // o.y.d
    final o.ea.j t() {
        int i2 = 2 % 2;
        int i3 = B + 85;
        int i4 = i3 % 128;
        C = i4;
        if (i3 % 2 != 0) {
            int i5 = 25 / 0;
        }
        int i6 = i4 + 11;
        B = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        throw null;
    }
}
