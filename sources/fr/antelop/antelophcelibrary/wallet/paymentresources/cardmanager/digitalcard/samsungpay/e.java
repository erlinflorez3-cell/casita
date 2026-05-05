package fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.AntelopError;
import fr.antelop.sdk.AntelopErrorCode;
import fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcess;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethod;
import fr.antelop.sdk.authentication.LocalAuthenticationErrorReason;
import fr.antelop.sdk.digitalcard.SecureCardPushToSamsungPay;
import fr.antelop.sdk.util.Address;
import fr.antelop.sdk.util.OperationCallback;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;
import o.a.g;
import o.a.o;
import o.ea.f;
import o.ep.i;
import o.es.c;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends o.er.d<o.es.b> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static char f18637h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static char f18638i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f18639j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f18640k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f18641l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static char f18642m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f18643n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static char f18644o = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f18645q = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f18646f;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$f(short r9, int r10, short r11) {
        /*
            int r8 = r10 + 4
            byte[] r7 = fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.e.$$d
            int r0 = r9 * 3
            int r0 = 72 - r0
            int r2 = r11 * 4
            int r1 = 1 - r2
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r7 != 0) goto L2e
            r2 = r8
            r3 = r4
            r1 = r5
        L16:
            int r0 = -r3
            int r8 = r8 + r0
            r3 = r1
            r0 = r8
            r8 = r2
        L1b:
            int r2 = r8 + 1
            byte r1 = (byte) r0
            r6[r3] = r1
            int r1 = r3 + 1
            if (r3 != r4) goto L2a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L2a:
            r3 = r7[r2]
            r8 = r0
            goto L16
        L2e:
            r3 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.e.$$f(short, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f18639j = -1665159696;
        f18643n = 0;
        f18645q = 1;
        f18640k = 0;
        f18641l = 1;
        g();
        TextUtils.indexOf("", "", 0);
        int i2 = f18645q + 15;
        f18643n = i2 % 128;
        int i3 = i2 % 2;
    }

    public e(o.ep.d dVar, o.eq.e eVar, boolean z2) {
        super(dVar, eVar);
        this.f18646f = z2;
    }

    public static /* synthetic */ Object c(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) {
        int i8 = ~i4;
        int i9 = ~i2;
        int i10 = ~i6;
        int i11 = (-1) - (((-1) - (~(i9 | i10))) & ((-1) - i8));
        int i12 = ~((-1) - (((-1) - i6) & ((-1) - i2)));
        int i13 = (i11 + i12) - (i11 & i12);
        int i14 = ~(i8 | i10);
        int i15 = ~((-1) - (((-1) - i8) & ((-1) - i2)));
        int i16 = (-1) - (((-1) - ((i15 + i14) - (i15 & i14))) & ((-1) - (~((-1) - (((-1) - i10) & ((-1) - i2))))));
        int i17 = i2 + i4 + i5 + (669352129 * i7) + (266941808 * i3);
        int i18 = i17 * i17;
        int i19 = (720661947 * i2) + 1572077568 + ((-1243901369) * i4) + (1165201990 * i13) + (i12 * (-1165201990)) + ((-1165201990) * i16) + (1885863936 * i5) + ((-1100480512) * i7) + ((-1249902592) * i3) + ((-491520000) * i18);
        int i20 = (i2 * 1617402437) + 56426783 + (i4 * 1617401273) + (i13 * (-582)) + (i12 * IptcDirectory.TAG_PROGRAM_VERSION) + (i16 * IptcDirectory.TAG_PROGRAM_VERSION) + (i5 * 1617401855) + (i7 * 1244927807) + (i3 * (-404665712)) + (i18 * (-45350912));
        if (i19 + (i20 * i20 * 1565261824) == 1) {
            return d(objArr);
        }
        e eVar = (e) objArr[0];
        Context context = (Context) objArr[1];
        int i21 = 2 % 2;
        int i22 = f18641l + 51;
        f18640k = i22 % 128;
        int i23 = i22 % 2;
        o.es.b bVarE = eVar.e(context);
        int i24 = f18641l + 69;
        f18640k = i24 % 128;
        int i25 = i24 % 2;
        return bVarE;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        e eVar = (e) objArr[0];
        int i2 = 2 % 2;
        int i3 = f18641l + 77;
        f18640k = i3 % 128;
        int i4 = i3 % 2;
        o.er.c[] cVarArr = {eVar.f25010g.n()};
        int i5 = f18640k + 111;
        f18641l = i5 % 128;
        if (i5 % 2 != 0) {
            return cVarArr;
        }
        throw null;
    }

    static /* synthetic */ o.ep.d d(e eVar) {
        int i2 = 2 % 2;
        int i3 = f18641l + 105;
        f18640k = i3 % 128;
        int i4 = i3 % 2;
        o.ep.d dVar = eVar.f25009a;
        if (i4 == 0) {
            return dVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ o.ep.d e(e eVar) {
        int i2 = 2 % 2;
        int i3 = f18640k + 103;
        f18641l = i3 % 128;
        int i4 = i3 % 2;
        o.ep.d dVar = eVar.f25009a;
        int i5 = f18640k + 91;
        f18641l = i5 % 128;
        int i6 = i5 % 2;
        return dVar;
    }

    static void g() {
        f18638i = (char) 61196;
        f18637h = (char) 30130;
        f18644o = (char) 53376;
        f18642m = (char) 55962;
    }

    static void init$0() {
        $$d = new byte[]{54, -126, MessagePack.Code.INT32, 96};
        $$e = 116;
    }

    private String j() throws Throwable {
        int i2 = 2 % 2;
        String strB = this.f25010g.n().b();
        if (strB != null) {
            return strB;
        }
        if (f.a()) {
            int i3 = f18641l + 61;
            f18640k = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            p("踝\u0e8b鶚\ue680㊨誼㎲\uab10\uf154䈺\udea2톎㺧閗䅐啍衘닦\ue7cc\uec24擉皁", 22 - View.resolveSize(0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            p("\uf8a2䣫⥨\ue999妈Ⲃ⡺盇鬖㠦ꄝᣱ妈Ⲃ╥假⼿㉾ᢓ걉믰氆洹ⵍ凄ชᇸ䋱\ud863駩蹩\ue642\ue89e\u16fe\ud863駩嵔푑宒굠㉗\uebe5俭긦છ涜훥䜸滩庻╥假梛ወ躍裹倞퓙㎲\uab10\uf154䈺\udea2톎㺧閗㱒藌꼪乺웄ꅺ衘닦샳\ud7fdછ涜⼿㉾㲃䩍ᙞ\u2d2c\ueea1軂꺶ຆ嵔푑쀣\uf53f㑸⦦䈽\u2efd滩庻㎀袣滩庻ޓ怩\ue1f9ᚼ⚃볬こὦ觓\u242e㲃䩍믰氆ᕛफ़꼪乺웄ꅺ衘닦⽅栰", 125 - Color.argb(0, 0, 0, 0), objArr2);
            f.d(strIntern, ((String) objArr2[0]).intern());
            int i5 = f18640k + 65;
            f18641l = i5 % 128;
            int i6 = i5 % 2;
        }
        Object[] objArr3 = new Object[1];
        p("觓\u242e蘑欌믰氆洹ⵍ凄ชᇸ䋱\ud863駩蹩\ue642⽅栰", 17 - (ViewConfiguration.getScrollBarSize() >> 8), objArr3);
        return ((String) objArr3[0]).intern();
    }

    private static void p(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 115;
        int i5 = i4 % 128;
        $11 = i5;
        int i6 = i4 % 2;
        Object obj = null;
        if (str2 != null) {
            int i7 = i5 + 25;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
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
        int i8 = 0;
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            cArr3[i8] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i9 = $11 + 107;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 58224;
            int i12 = i8;
            while (i12 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[i8];
                int i13 = (c3 + i11) ^ ((c3 << 4) + ((char) (((long) f18644o) ^ (-7511683281764982996L))));
                int i14 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f18642m);
                    objArr2[2] = Integer.valueOf(i14);
                    objArr2[1] = Integer.valueOf(i13);
                    objArr2[i8] = Integer.valueOf(c2);
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        int iResolveOpacity = 270 - Drawable.resolveOpacity(i8, i8);
                        char threadPriority = (char) ((Process.getThreadPriority(i8) + 20) >> 6);
                        int iIndexOf = 10 - TextUtils.indexOf((CharSequence) "", '0', i8);
                        byte b2 = (byte) 1;
                        byte b3 = (byte) (-b2);
                        String str$$f = $$f(b2, b3, (byte) (b3 + 1));
                        Class[] clsArr = new Class[4];
                        clsArr[i8] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objA = o.d.d.a(iResolveOpacity, threadPriority, iIndexOf, -1995022631, false, str$$f, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i8]), Integer.valueOf((cCharValue + i11) ^ ((cCharValue << 4) + ((char) (((long) f18638i) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f18637h)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 1;
                        byte b5 = (byte) (-b4);
                        objA2 = o.d.d.a(270 - View.MeasureSpec.getMode(0), (char) (Process.myTid() >> 22), 11 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -1995022631, false, $$f(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i11 -= 40503;
                    i12++;
                    i8 = 0;
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
                byte b7 = (byte) (b6 - 1);
                objA3 = o.d.d.a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 270, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 11, -2074123590, false, $$f(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            i8 = 0;
        }
        String str3 = new String(cArr2, 0, i2);
        int i15 = $10 + 55;
        $11 = i15 % 128;
        if (i15 % 2 == 0) {
            throw null;
        }
        objArr[0] = str3;
    }

    @Override // o.er.d
    public final String a() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f18641l + 87;
        f18640k = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = new Object[1];
            p("踝\u0e8b鶚\ue680㊨誼㎲\uab10\uf154䈺\udea2톎㺧閗䅐啍衘닦\ue7cc\uec24擉皁", 118 / (ViewConfiguration.getScrollDefaultDelay() - 17), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            p("踝\u0e8b鶚\ue680㊨誼㎲\uab10\uf154䈺\udea2톎㺧閗䅐啍衘닦\ue7cc\uec24擉皁", 22 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.app.Activity r7, final fr.antelop.sdk.util.OperationCallback<java.lang.Void> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.e.f18641l
            int r1 = r0 + 61
            int r0 = r1 % 128
            fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.e.f18640k = r0
            int r1 = r1 % r2
            r5 = 0
            if (r1 == 0) goto L68
            boolean r1 = o.ea.f.a()
            r0 = 53
            int r0 = r0 / r5
            if (r1 == 0) goto L46
        L18:
            int r0 = fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.e.f18641l
            int r1 = r0 + 117
            int r0 = r1 % 128
            fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.e.f18640k = r0
            int r1 = r1 % r2
            r4 = 1
            java.lang.String r3 = "\udc0e찌틐玡\uf82f㳔\ue34d칕"
            if (r1 == 0) goto L53
            java.lang.String r2 = r6.a()
            float r1 = android.media.AudioTrack.getMaxVolume()
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r1 = 114(0x72, float:1.6E-43)
            int r1 = r1 >> r0
            java.lang.Object[] r0 = new java.lang.Object[r4]
            p(r3, r1, r0)
            r0 = r0[r5]
        L3d:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            o.ea.f.c(r2, r0)
        L46:
            fr.antelop.sdk.digitalcard.SecureCardPushToSamsungPay r1 = r6.f()
            fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.e$2 r0 = new fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.e$2
            r0.<init>()
            r1.launch(r7, r0)
            return
        L53:
            java.lang.String r2 = r6.a()
            float r1 = android.media.AudioTrack.getMaxVolume()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            int r1 = 9 - r0
            java.lang.Object[] r0 = new java.lang.Object[r4]
            p(r3, r1, r0)
            r0 = r0[r5]
            goto L3d
        L68:
            boolean r0 = o.ea.f.a()
            if (r0 != 0) goto L18
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.e.a(android.app.Activity, fr.antelop.sdk.util.OperationCallback):void");
    }

    @Override // o.er.d
    public final String b() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f18640k + 21;
        f18641l = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = new Object[1];
            p("覥Ꙟ嶎\ue368瓡⭖톿㌝砵㊏\ud90d럐\ufade\uf8e3ᇸ䋱唽푨", PanasonicMakernoteDirectory.TAG_BURST_SPEED / View.MeasureSpec.getMode(1), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            p("覥Ꙟ嶎\ue368瓡⭖톿㌝砵㊏\ud90d럐\ufade\uf8e3ᇸ䋱唽푨", View.MeasureSpec.getMode(0) + 17, objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        int i4 = f18641l + 41;
        f18640k = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    @Override // o.er.d
    public final /* synthetic */ o.es.c b(Context context) {
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int iActiveCount = Thread.activeCount();
        int i2 = f18639j * (-1026129619);
        f18639j = i2;
        return (o.es.c) c(505941135, (int) Process.getElapsedCpuTime(), -505941135, iActiveCount, iElapsedRealtime, new Object[]{this, context}, i2);
    }

    public final void c(final Activity activity) {
        int i2 = 2 % 2;
        e(activity).c(new c.a<List<o.es.e>>() { // from class: fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.e.1
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f18647a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static char[] f18648b = null;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static long f18649e = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static int f18650g = 0;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0012). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$c(int r8, int r9, short r10) {
                /*
                    int r7 = r10 + 4
                    int r0 = r8 * 3
                    int r6 = 1 - r0
                    int r5 = 105 - r9
                    byte[] r4 = fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.e.AnonymousClass1.$$a
                    byte[] r3 = new byte[r6]
                    r2 = 0
                    if (r4 != 0) goto L25
                    r0 = r5
                    r1 = r2
                    r5 = r6
                L12:
                    int r5 = r5 + r0
                L13:
                    int r7 = r7 + 1
                    byte r0 = (byte) r5
                    r3[r1] = r0
                    int r1 = r1 + 1
                    if (r1 != r6) goto L22
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r3, r2)
                    return r0
                L22:
                    r0 = r4[r7]
                    goto L12
                L25:
                    r1 = r2
                    goto L13
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.e.AnonymousClass1.$$c(int, int, short):java.lang.String");
            }

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                f18647a = 0;
                f18650g = 1;
                f18648b = new char[]{38017, 19284, 11009, 3055, 60297, 52117, 43604, 35380, 27298, 19169, 10974, 2406, 59701, 51620, 43477, 35201, 26720, 18488, 10414, 2265, 59545, 53095, 44841, 36627, 28619, 20365, 11882, 3629, 60958, 52868, 44735, 36206, 27922, 19759, 11727, 3509, 60537, 52289, 44040, 36087, 27874, 17244, 9055, 785, 58298, 50067, 41879, 33356, 25150, 17145, 8890, 38017, 19284, 11009, 3055, 60297, 52117, 43604, 35380, 27298, 19169, 10974, 2383, 59711, 51696, 43507, 35214, 26720, 18483, 10466, 2260, 59535, 53104, 44818, 36639, 28617, 20361, 11888, 3688, 60959, 52950, 44708, 36207, 27968, 19804, 11668, 3576};
                f18649e = 1413943139920137020L;
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x0097, code lost:
            
                if (o.ea.f.a() != false) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0099, code lost:
            
                r4 = r17.f18652d.a();
                r0 = new java.lang.Object[1];
                f((char) ((android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)) - 1), android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 52, r0);
                o.ea.f.c(r4, ((java.lang.String) r0[0]).intern());
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x00c8, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x00cd, code lost:
            
                if (o.ea.f.a() != false) goto L18;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private void d(java.util.List<o.es.e> r18) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 241
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.e.AnonymousClass1.d(java.util.List):void");
            }

            private static void f(char c2, int i3, int i4, Object[] objArr) throws Throwable {
                int i5 = 2;
                int i6 = 2 % 2;
                o oVar = new o();
                long[] jArr = new long[i4];
                oVar.f19947b = 0;
                while (oVar.f19947b < i4) {
                    int i7 = $11 + 53;
                    $10 = i7 % 128;
                    int i8 = i7 % i5;
                    int i9 = oVar.f19947b;
                    try {
                        Object[] objArr2 = {Integer.valueOf(f18648b[i3 + i9])};
                        Object objA = o.d.d.a(-214519724);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            objA = o.d.d.a(742 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) View.resolveSizeAndState(0, 0, 0), (Process.myPid() >> 22) + 12, 632508977, false, $$c(b2, (byte) ((-1) - (((-1) - b2) & ((-1) - 6))), (byte) (-1)), new Class[]{Integer.TYPE});
                        }
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i9), Long.valueOf(f18649e), Integer.valueOf(c2)};
                        Object objA2 = o.d.d.a(-1567654649);
                        if (objA2 == null) {
                            byte b3 = (byte) 0;
                            objA2 = o.d.d.a(766 - Color.red(0), (char) (12470 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), TextUtils.indexOf("", "", 0) + 12, 1946853218, false, $$c(b3, (byte) (b3 + 5), (byte) (-1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i9] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {oVar, oVar};
                        Object objA3 = o.d.d.a(-723636472);
                        if (objA3 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objA3 = o.d.d.a(View.MeasureSpec.getMode(0) + 387, (char) View.MeasureSpec.getSize(0), 18 - (ViewConfiguration.getPressedStateDuration() >> 16), 39570797, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA3).invoke(null, objArr4);
                        i5 = 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr = new char[i4];
                oVar.f19947b = 0;
                while (oVar.f19947b < i4) {
                    cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                    Object[] objArr5 = {oVar, oVar};
                    Object objA4 = o.d.d.a(-723636472);
                    if (objA4 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA4 = o.d.d.a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 387, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 18 - View.MeasureSpec.makeMeasureSpec(0, 0), 39570797, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                    int i10 = $10 + 117;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                }
                String str = new String(cArr);
                int i12 = $11 + 95;
                $10 = i12 % 128;
                if (i12 % 2 == 0) {
                    objArr[0] = str;
                } else {
                    int i13 = 76 / 0;
                    objArr[0] = str;
                }
            }

            static void init$0() {
                $$a = new byte[]{38, Ascii.CAN, 67, -113};
                $$b = 9;
            }

            @Override // o.es.c.a
            public final /* synthetic */ void a(List<o.es.e> list) throws Throwable {
                int i3 = 2 % 2;
                int i4 = f18650g + 31;
                f18647a = i4 % 128;
                int i5 = i4 % 2;
                Object obj = null;
                d(list);
                if (i5 != 0) {
                    throw null;
                }
                int i6 = f18650g + 19;
                f18647a = i6 % 128;
                if (i6 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }

            @Override // o.es.c.a
            public final void d(o.by.c cVar) throws Throwable {
                int i3 = 2 % 2;
                int i4 = f18647a + 107;
                f18650g = i4 % 128;
                if (i4 % 2 == 0) {
                    f.a();
                    throw null;
                }
                if (f.a()) {
                    String strA = e.this.a();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr = new Object[1];
                    f((char) View.resolveSizeAndState(0, 0, 0), TextUtils.getOffsetAfter("", 0) + 51, 36 - TextUtils.getOffsetAfter("", 0), objArr);
                    f.c(strA, sb.append(((String) objArr[0]).intern()).append(cVar).toString());
                }
                int i5 = f18650g + 19;
                f18647a = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        });
        int i3 = f18641l + 23;
        f18640k = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void c(Activity activity, final OperationCallback<Void> operationCallback, Address address) throws Throwable {
        int i2 = 2 % 2;
        if (f.a()) {
            int i3 = f18640k + 47;
            f18641l = i3 % 128;
            int i4 = i3 % 2;
            String strA = a();
            Object[] objArr = new Object[1];
            p("\udc0e찌틐玡\uf82f㳔\ue34d칕", 8 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
            f.c(strA, ((String) objArr[0]).intern());
        }
        SecureCardPushToSamsungPay secureCardPushToSamsungPayF = f();
        if (address != null) {
            int i5 = f18640k + 55;
            f18641l = i5 % 128;
            if (i5 % 2 == 0) {
                secureCardPushToSamsungPayF.setUserAddress(address);
                throw null;
            }
            secureCardPushToSamsungPayF.setUserAddress(address);
        }
        secureCardPushToSamsungPayF.launch(activity, new CustomCustomerAuthenticatedProcessCallback() { // from class: fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.e.3

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static int f18665a = -432716153;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static int f18666b = 1728142169;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static int f18667c = 1005524132;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static int f18668d = 1990948437;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static int f18669e = -31970474;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static int f18670f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static int f18671g = 1;

            private static /* synthetic */ Object a(Object[] objArr2) {
                int i6 = 2 % 2;
                int i7 = f18670f;
                int i8 = ((i7 + 65) - (65 | i7)) + (i7 | 65);
                f18671g = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 17 / 0;
                }
                return null;
            }

            public static /* synthetic */ Object e(int i6, int i7, int i8, Object[] objArr2, int i9, int i10, int i11) {
                int i12 = ~(i8 | i9);
                int i13 = ~((i9 + i10) - (i9 & i10));
                int i14 = (i12 + i13) - (i12 & i13);
                int i15 = ~i8;
                int i16 = ~i9;
                int i17 = (-1) - (((-1) - ((-1) - (((-1) - (~(i15 | i10))) & ((-1) - (~((-1) - (((-1) - i15) & ((-1) - i16)))))))) & ((-1) - (~(i16 | i10))));
                int i18 = ~i10;
                int i19 = ~(((i18 + i8) - (i18 & i8)) | i9);
                int i20 = (i17 + i19) - (i17 & i19);
                int i21 = ~((i18 + i16) - (i18 & i16));
                int i22 = ((i21 + i8) - (i21 & i8)) | i13;
                int i23 = i8 + i9 + i11 + (1962400304 * i6) + (1167700406 * i7);
                int i24 = i23 * i23;
                int i25 = ((i8 * (-1019457937)) - 559939584) + ((-1019457937) * i9) + (2001489518 * i14) + (i20 * (-2001489518)) + ((-2001489518) * i22) + (1274019840 * i11) + ((-1660944384) * i6) + ((-325058560) * i7) + (867827712 * i24);
                int i26 = ((i8 * (-1629562239)) - 1134582380) + (i9 * (-1629562239)) + (i14 * (-910)) + (i20 * 910) + (i22 * 910) + (i11 * (-1629561329)) + (i6 * (-1621399344)) + (i7 * (-873382486)) + (i24 * 1407582208);
                int i27 = i25 + (i26 * i26 * (-1895432192));
                if (i27 == 1) {
                    return a(objArr2);
                }
                if (i27 != 2) {
                    return e(objArr2);
                }
                int i28 = 2 % 2;
                int i29 = f18671g + 109;
                f18670f = i29 % 128;
                int i30 = i29 % 2;
                return null;
            }

            private static /* synthetic */ Object e(Object[] objArr2) {
                AnonymousClass3 anonymousClass3 = (AnonymousClass3) objArr2[0];
                int i6 = 2 % 2;
                int i7 = f18670f;
                int i8 = ((-1) - (((-1) - i7) | ((-1) - 63))) + (i7 | 63);
                f18671g = i8 % 128;
                if (i8 % 2 == 0) {
                    operationCallback.onSuccess(null);
                    int i9 = 15 / 0;
                } else {
                    operationCallback.onSuccess(null);
                }
                int i10 = f18670f;
                int i11 = (i10 ^ 25) + ((i10 & 25) << 1);
                f18671g = i11 % 128;
                int i12 = i11 % 2;
                return null;
            }

            @Override // fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback
            public final void onAuthenticationDeclined(CustomerAuthenticatedProcess customerAuthenticatedProcess) {
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i6 = f18668d * (-1957684334);
                f18668d = i6;
                int i7 = 1092698358 * f18665a;
                f18665a = i7;
                e(i7, Process.myUid(), 393681038, new Object[]{this, customerAuthenticatedProcess}, -393681037, iUptimeMillis, i6);
            }

            @Override // fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback
            public final void onCustomerCredentialsInvalid(LocalAuthenticationErrorReason localAuthenticationErrorReason, CustomerAuthenticatedProcess customerAuthenticatedProcess) {
                int i6 = 2 % 2;
                int i7 = f18671g;
                int i8 = (i7 ^ 15) + (((-1) - (((-1) - i7) | ((-1) - 15))) << 1);
                f18670f = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 17 / 0;
                }
            }

            @Override // fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback
            public final void onCustomerCredentialsRequired(List<CustomerAuthenticationMethod> list, CustomerAuthenticatedProcess customerAuthenticatedProcess) {
                int i6 = 2 % 2;
                operationCallback.onError(new o.by.c(AntelopErrorCode.CustomerAuthenticationImpossible).a());
                int i7 = f18670f;
                int i8 = (((-1) - (((-1) - i7) & ((-1) - 79))) << 1) - (i7 ^ 79);
                f18671g = i8 % 128;
                if (i8 % 2 == 0) {
                    throw null;
                }
            }

            @Override // fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback
            public final void onError(AntelopError antelopError, CustomerAuthenticatedProcess customerAuthenticatedProcess) {
                int i6 = 2 % 2;
                int i7 = f18670f;
                int i8 = (((i7 + 3) - (3 & i7)) << 1) - (i7 ^ 3);
                f18671g = i8 % 128;
                int i9 = i8 % 2;
                operationCallback.onError(antelopError);
                int i10 = f18670f + 45;
                f18671g = i10 % 128;
                int i11 = i10 % 2;
            }

            @Override // fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback
            public final void onProcessStart(CustomerAuthenticatedProcess customerAuthenticatedProcess) {
                int i6 = f18669e * (-181007971);
                f18669e = i6;
                int iNextInt = new Random().nextInt(1027380734);
                int iMyUid = Process.myUid();
                int i7 = 1599817401 * f18667c;
                f18667c = i7;
                e(iMyUid, i7, 1442973242, new Object[]{this, customerAuthenticatedProcess}, -1442973240, i6, iNextInt);
            }

            @Override // fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback
            public final void onProcessSuccess(CustomerAuthenticatedProcess customerAuthenticatedProcess) {
                int iNextInt = new Random().nextInt();
                int i6 = f18666b * (-932080043);
                f18666b = i6;
                e((int) SystemClock.uptimeMillis(), (int) Runtime.getRuntime().maxMemory(), -691811937, new Object[]{this, customerAuthenticatedProcess}, 691811937, iNextInt, i6);
            }
        });
    }

    @Override // o.er.d
    public final i.c d() {
        i.c cVar;
        int i2 = 2 % 2;
        int i3 = f18640k + 67;
        f18641l = i3 % 128;
        if (i3 % 2 == 0) {
            cVar = i.c.f24666c;
            int i4 = 61 / 0;
        } else {
            cVar = i.c.f24666c;
        }
        int i5 = f18641l + 77;
        f18640k = i5 % 128;
        int i6 = i5 % 2;
        return cVar;
    }

    @Override // o.er.d
    public final AntelopErrorCode e() {
        AntelopErrorCode antelopErrorCode;
        int i2 = 2 % 2;
        int i3 = f18640k + 75;
        f18641l = i3 % 128;
        if (i3 % 2 == 0) {
            antelopErrorCode = AntelopErrorCode.SamsungPayWalletNotAvailable;
            int i4 = 91 / 0;
        } else {
            antelopErrorCode = AntelopErrorCode.SamsungPayWalletNotAvailable;
        }
        int i5 = f18640k + 79;
        f18641l = i5 % 128;
        if (i5 % 2 != 0) {
            return antelopErrorCode;
        }
        throw null;
    }

    public final o.es.b e(Context context) {
        int i2 = 2 % 2;
        int i3 = f18640k;
        int i4 = i3 + 23;
        f18641l = i4 % 128;
        int i5 = i4 % 2;
        if (!this.f18646f) {
            o.ea.b.a();
            o.es.b bVarP = o.ea.b.p(context);
            int i6 = f18640k + 67;
            f18641l = i6 % 128;
            int i7 = i6 % 2;
            return bVarP;
        }
        int i8 = i3 + 115;
        f18641l = i8 % 128;
        if (i8 % 2 != 0) {
            o.ea.b.a();
            return o.ea.b.q(context);
        }
        o.ea.b.a();
        int i9 = 99 / 0;
        return o.ea.b.q(context);
    }

    public final SecureCardPushToSamsungPay f() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18641l + 109;
        f18640k = i3 % 128;
        if (i3 % 2 != 0) {
            f.a();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (f.a()) {
            int i4 = f18641l + 107;
            f18640k = i4 % 128;
            int i5 = i4 % 2;
            String strA = a();
            Object[] objArr = new Object[1];
            p("\uf8a2䣫洩飵ꂉ䟶犰\uefb3ࣿ妸鬖㠦㴴茔妈Ⲃ䙁摗", Drawable.resolveOpacity(0, 0) + 17, objArr);
            f.c(strA, ((String) objArr[0]).intern());
        }
        SecureCardPushToSamsungPay secureCardPushToSamsungPay = new SecureCardPushToSamsungPay(new o.y.f(j(), this.f25009a, c(), this.f18646f));
        int i6 = f18640k + 113;
        f18641l = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 49 / 0;
        }
        return secureCardPushToSamsungPay;
    }

    @Override // o.er.h
    public final o.er.c[] h() {
        int i2 = (int) Runtime.getRuntime().totalMemory();
        int i3 = (int) Runtime.getRuntime().totalMemory();
        int iActiveCount = Thread.activeCount();
        return (o.er.c[]) c(-895585215, Process.myPid(), 895585216, i3, i2, new Object[]{this}, iActiveCount);
    }
}
