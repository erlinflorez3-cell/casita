package fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.samsung.android.sdk.samsungpay.v2.WatchManager;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import o.a.k;
import o.ap.h;
import o.ea.f;
import o.ea.j;
import o.es.c;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends b {
    private static final byte[] $$h = null;
    private static final int $$i = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final d f18631i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f18632k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static long f18633l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f18634m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f18635n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f18636o = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(byte r9, byte r10, byte r11) {
        /*
            byte[] r8 = fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.d.$$h
            int r0 = r11 * 7
            int r7 = r0 + 107
            int r6 = r9 + 4
            int r1 = r10 * 2
            int r0 = 1 - r1
            byte[] r5 = new byte[r0]
            r4 = 0
            int r3 = 0 - r1
            if (r8 != 0) goto L2c
            r0 = r6
            r7 = r3
            r2 = r4
        L16:
            int r6 = r6 + r7
            r1 = r2
            r7 = r6
            r6 = r0
        L1a:
            byte r0 = (byte) r7
            r5[r1] = r0
            int r2 = r1 + 1
            if (r1 != r3) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L27:
            int r0 = r6 + 1
            r6 = r8[r0]
            goto L16
        L2c:
            r1 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.d.$$j(byte, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f18636o = 0;
        f18634m = 1;
        f18632k = 0;
        f18635n = 1;
        a();
        Process.myPid();
        f18631i = new d();
        int i2 = f18634m + 17;
        f18636o = i2 % 128;
        int i3 = i2 % 2;
    }

    static void a() {
        f18633l = 5637169034707357701L;
    }

    private void c(Activity activity, c.InterfaceC0350c interfaceC0350c, o.ep.d dVar, h.e eVar) throws Throwable {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        if (f.a()) {
            int i3 = f18635n + 37;
            f18632k = i3 % 128;
            if (i3 % 2 != 0) {
                Object[] objArr = new Object[1];
                v("\u0df6\uecae珩\ue131ඥ⺰\uf77a\ua63fѿ₻ﵴ뀟ṯ㪭\ueb7c먬ၒ಼텢萗⩧ڭ\udf6b踹㱮", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
                strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                v("⬻þ藮❀⭋싴ţ恕⊄쳤୦癝㣫횠", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                v("\u0df6\uecae珩\ue131ඥ⺰\uf77a\ua63fѿ₻ﵴ뀟ṯ㪭\ueb7c먬ၒ಼텢萗⩧ڭ\udf6b踹㱮", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr3);
                strIntern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                v("⬻þ藮❀⭋싴ţ恕⊄쳤୦癝㣫횠", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr4);
                obj = objArr4[0];
            }
            f.c(strIntern, ((String) obj).intern());
        }
        f18606e.addCard(a(eVar), new SamsungPayAddCardListener(activity, this, dVar.s().d(), interfaceC0350c));
        int i4 = f18632k + 45;
        f18635n = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static d e(Context context) {
        int i2 = 2 % 2;
        int i3 = f18632k + 97;
        f18635n = i3 % 128;
        if (i3 % 2 == 0) {
            WatchManager watchManager = f18606e;
            throw null;
        }
        if (f18606e == null) {
            f18631i.b(context);
            int i4 = f18632k + 9;
            f18635n = i4 % 128;
            int i5 = i4 % 2;
        }
        return f18631i;
    }

    static void init$0() {
        $$h = new byte[]{82, 42, -87, -21};
        $$i = 78;
    }

    private static void v(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10;
        int i5 = i4 + 117;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        if (str2 != null) {
            int i7 = i4 + 81;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        k kVar = new k();
        char[] cArrC = k.c(f18633l ^ (-5882309809461882246L), (char[]) charArray, i2);
        int i9 = 4;
        kVar.f19939c = 4;
        int i10 = $10 + 39;
        $11 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 2 / 3;
        }
        while (kVar.f19939c < cArrC.length) {
            kVar.f19938a = kVar.f19939c - i9;
            int i12 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % i9]), Long.valueOf(kVar.f19938a), Long.valueOf(f18633l)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objA = o.d.d.a(228 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (View.resolveSize(0, 0) + 51004), 9 - TextUtils.getTrimmedLength(""), 1749983833, false, $$j(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i12] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 + 1);
                    objA2 = o.d.d.a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 675, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 12 - TextUtils.indexOf("", "", 0, 0), 522683165, false, $$j(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                i9 = 4;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str3 = new String(cArrC, 4, cArrC.length - 4);
        int i13 = $10 + 113;
        $11 = i13 % 128;
        int i14 = i13 % 2;
        objArr[0] = str3;
    }

    @Override // fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.b
    public final void a(c.a<String> aVar, Boolean bool, String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18635n + 85;
        f18632k = i3 % 128;
        if (i3 % 2 != 0) {
            f.a();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (f.a()) {
            String strB = b();
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            v("뮽Ͱ⩤\ue08a믚셪껮Ꞡ눠콧ꓲ놖꠱핎닼뮙꘦\ue323袻藛鰺\ue97e蛦辋訴\uf76f鲮駙聵", (Process.myPid() >> 22) + 1, objArr);
            StringBuilder sbAppend = sb.append(((String) objArr[0]).intern()).append(bool);
            Object[] objArr2 = new Object[1];
            v("片ᔁ≔뤻牧흑Ꚋ︭篞\ud903겎\ue878憟", 1 - TextUtils.getTrimmedLength(""), objArr2);
            f.c(strB, sbAppend.append(((String) objArr2[0]).intern()).append(str).toString());
            int i4 = f18635n + 27;
            f18632k = i4 % 128;
            int i5 = i4 % 2;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        f18606e.getWalletInfo(arrayList, new SamsungPayInfoListener(this, aVar, bool, str));
    }

    @Override // fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.b
    final String b() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f18632k + 47;
        f18635n = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = new Object[1];
            v("\u0df6\uecae珩\ue131ඥ⺰\uf77a\ua63fѿ₻ﵴ뀟ṯ㪭\ueb7c먬ၒ಼텢萗⩧ڭ\udf6b踹㱮", 0 / (ViewConfiguration.getJumpTapTimeout() - 60), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            v("\u0df6\uecae珩\ue131ඥ⺰\uf77a\ua63fѿ₻ﵴ뀟ṯ㪭\ueb7c먬ၒ಼텢萗⩧ڭ\udf6b踹㱮", (ViewConfiguration.getJumpTapTimeout() >> 16) + 1, objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    @Override // fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.b
    protected final void b(Context context) throws Throwable {
        int i2 = 2 % 2;
        super.b(context);
        f18606e = new WatchManager(context, this.f18615a);
        int i3 = f18632k + 45;
        f18635n = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.es.c
    public final void c(c.a<List<o.es.e>> aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18632k + 89;
        f18635n = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            Object[] objArr = new Object[1];
            v("\u0df6\uecae珩\ue131ඥ⺰\uf77a\ua63fѿ₻ﵴ뀟ṯ㪭\ueb7c먬ၒ಼텢萗⩧ڭ\udf6b踹㱮", -TextUtils.indexOf((CharSequence) "", '0'), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            v("ༀ壛犰\u05fdཧ髁\uf63a䋅ڒ铒ﰥ哨Ე軉\uea22廜ኛ룃퀧惢⢃", -TextUtils.lastIndexOf("", '0'), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        f18606e.getAllCards(new Bundle(), new SamsungPayGetCardListener(this, aVar));
        int i5 = f18635n + 43;
        f18632k = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    @Override // o.es.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(o.es.c.a<o.es.c.e> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.d.f18635n
            int r1 = r0 + 3
            int r0 = r1 % 128
            fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.d.f18632k = r0
            int r1 = r1 % r2
            r5 = 1
            r4 = 0
            if (r1 == 0) goto L42
            boolean r1 = o.ea.f.a()
            r0 = 84
            int r0 = r0 / r4
            if (r1 == 0) goto L37
        L19:
            java.lang.String r3 = r6.b()
            java.lang.String r0 = ""
            int r2 = android.text.TextUtils.getOffsetAfter(r0, r4)
            int r2 = r2 + r5
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = "\u31ec轊힛뼧ㆋ䵐匑\uf81e㡵䍇夈\uee3d≱奭伌\ue42bⱏ潘甅\uda3aᙹ救符퀾a筕愄옽"
            v(r0, r2, r1)
            r0 = r1[r4]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            o.ea.f.c(r3, r0)
        L37:
            com.samsung.android.sdk.samsungpay.v2.WatchManager r1 = fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.d.f18606e
            fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.SamsungPayStatusListener r0 = new fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.SamsungPayStatusListener
            r0.<init>(r7)
            r1.getSamsungPayStatus(r0)
            return
        L42:
            boolean r0 = o.ea.f.a()
            if (r0 == r5) goto L19
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.d.d(o.es.c$a):void");
    }

    @Override // fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.b
    final String e() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f18632k + 107;
        f18635n = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = new Object[1];
            v("貾Ꭾ븅绍賭톐㪶㧣蔗\udf9bジ\u2feb鼖얘⚪◧鄅\uf393Შᯫ\uab0f秊ከᇨ봍\ue791ࢠ߯뜓\ued87纰", 1 / KeyEvent.normalizeMetaState(0), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            v("貾Ꭾ븅绍賭톐㪶㧣蔗\udf9bジ\u2feb鼖얘⚪◧鄅\uf393Შᯫ\uab0f秊ከᇨ봍\ue791ࢠ߯뜓\ued87纰", 1 - KeyEvent.normalizeMetaState(0), objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    @Override // o.es.c
    public final /* synthetic */ void e(Activity activity, c.InterfaceC0350c interfaceC0350c, j jVar, o.ep.d dVar, o.es.e eVar, h.e eVar2, o.ea.h hVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18635n + 83;
        f18632k = i3 % 128;
        int i4 = i3 % 2;
        c(activity, interfaceC0350c, dVar, eVar2);
        int i5 = f18635n + 45;
        f18632k = i5 % 128;
        int i6 = i5 % 2;
    }
}
