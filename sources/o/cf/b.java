package o.cf;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import o.a.k;
import o.ea.f;
import o.m.i;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f22207a = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f22208f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f22209g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f22210h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f22211i = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f22212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o.en.b f22213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    d f22214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f22215e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r7, byte r8, byte r9) {
        /*
            int r7 = r7 * 2
            int r1 = r7 + 1
            int r0 = r8 * 7
            int r6 = r0 + 107
            int r5 = r9 + 4
            byte[] r4 = o.cf.b.$$a
            byte[] r3 = new byte[r1]
            r2 = 0
            if (r4 != 0) goto L28
            r1 = r6
            r0 = r2
            r6 = r7
        L14:
            int r6 = r6 + r1
            r1 = r0
        L16:
            byte r0 = (byte) r6
            r3[r1] = r0
            int r0 = r1 + 1
            if (r1 != r7) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L23:
            int r5 = r5 + 1
            r1 = r4[r5]
            goto L14
        L28:
            r1 = r2
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cf.b.$$c(int, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22208f = 0;
        f22211i = 1;
        f22209g = 0;
        f22210h = 1;
        c();
        KeyEvent.normalizeMetaState(0);
        int i2 = f22211i + 31;
        f22208f = i2 % 128;
        int i3 = i2 % 2;
    }

    public b(Context context, d dVar, o.en.b bVar) {
        this.f22212b = context;
        this.f22214d = dVar;
        this.f22213c = bVar;
    }

    static void c() {
        f22207a = -6792676513263207435L;
    }

    static void init$0() {
        $$a = new byte[]{96, -118, -108, -83};
        $$b = 78;
    }

    private static void j(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        Object obj = null;
        if (str2 != null) {
            int i4 = $11 + 17;
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
        k kVar = new k();
        char[] cArrC = k.c(f22207a ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            int i5 = $11 + 97;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            kVar.f19938a = kVar.f19939c - 4;
            int i7 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f22207a)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(229 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 51004), Color.green(0) + 9, 1749983833, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    objA2 = o.d.d.a(Process.getGidForName("") + 676, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 12 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 522683165, false, $$c(b4, b5, (byte) (-b5)), new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrC, 4, cArrC.length - 4);
    }

    public final void c(i iVar, final boolean z2, o.i.d dVar) throws WalletValidationException {
        int i2 = 2 % 2;
        int i3 = f22209g + 95;
        f22210h = i3 % 128;
        int i4 = i3 % 2;
        if (!this.f22213c.s()) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr = new Object[1];
            j("晅헟쥖䭠昒ﰱ騤㞡쀜᩠", 1 - View.resolveSizeAndState(0, 0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            j("順\ue77e㻦䂜顑캐涔㱝㹟⣁잜戜퐍酙ꄞ觖櫆יִ筆⾈\u0098╯튁啯ꝍ迩게ﬦ紁\ue9e7؎⋬Ꮑ刹\ue04d䢢ꦈ백멪\uee74䁫\ue6a0ᖵᐧ\ue63b䃽", -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr2);
            throw new WalletValidationException(walletValidationErrorCode, strIntern, ((String) objArr2[0]).intern());
        }
        e eVar = new e(this.f22212b, new c() { // from class: o.cf.b.2
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f22216a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static long f22217b = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f22218d = 0;

            private static String $$c(short s2, byte b2, byte b3) {
                int i5 = b3 * 2;
                int i6 = (s2 * 3) + 4;
                int i7 = 114 - (b2 * 7);
                byte[] bArr = $$a;
                byte[] bArr2 = new byte[i5 + 1];
                int i8 = -1;
                if (bArr == null) {
                    i6++;
                    i7 += i5;
                }
                while (true) {
                    i8++;
                    bArr2[i8] = (byte) i7;
                    if (i8 == i5) {
                        return new String(bArr2, 0);
                    }
                    byte b4 = bArr[i6];
                    i6++;
                    i7 += b4;
                }
            }

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                f22218d = 0;
                f22216a = 1;
                f22217b = 2125950131571207292L;
            }

            private static void f(String str, int i5, Object[] objArr3) throws Throwable {
                Object charArray;
                String str2 = str;
                int i6 = 2 % 2;
                if (str2 != null) {
                    int i7 = $11 + 61;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        str2.toCharArray();
                        throw null;
                    }
                    charArray = str2.toCharArray();
                } else {
                    charArray = str2;
                }
                k kVar = new k();
                char[] cArrC = k.c(f22217b ^ (-5882309809461882246L), (char[]) charArray, i5);
                kVar.f19939c = 4;
                while (kVar.f19939c < cArrC.length) {
                    int i8 = $10 + 11;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    kVar.f19938a = kVar.f19939c - 4;
                    int i10 = kVar.f19939c;
                    try {
                        Object[] objArr4 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f22217b)};
                        Object objA = o.d.d.a(-1093976004);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 + 1);
                            objA = o.d.d.a((ViewConfiguration.getPressedStateDuration() >> 16) + 229, (char) (51003 - ImageFormat.getBitsPerPixel(0)), 9 - TextUtils.getCapsMode("", 0, 0), 1749983833, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrC[i10] = ((Character) ((Method) objA).invoke(null, objArr4)).charValue();
                        Object[] objArr5 = {kVar, kVar};
                        Object objA2 = o.d.d.a(-912105096);
                        if (objA2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objA2 = o.d.d.a(Color.blue(0) + 675, (char) Color.blue(0), 12 - (ViewConfiguration.getPressedStateDuration() >> 16), 522683165, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA2).invoke(null, objArr5);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                objArr3[0] = new String(cArrC, 4, cArrC.length - 4);
            }

            static void init$0() {
                $$a = new byte[]{69, -20, MessagePack.Code.INT64, -20};
                $$b = 198;
            }

            @Override // o.cf.c
            public final void c(o.bg.c cVar) throws Throwable {
                int i5 = 2 % 2;
                int i6 = f22218d + 19;
                f22216a = i6 % 128;
                int i7 = i6 % 2;
                if (f.a()) {
                    Object[] objArr3 = new Object[1];
                    f("蜦蝳\uf100佶小檑\u2067僢罊懶⡸壞睢\ue134ず䂽漉\ue94b㠖䢪木텱\u0004炆弬", View.MeasureSpec.getMode(0), objArr3);
                    String strIntern2 = ((String) objArr3[0]).intern();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr4 = new Object[1];
                    f("腖脹趐㏸穨率ر쌃礪薇ุ쬮焵鶫ᘠ퍗楷闘ṛ\udb48慹귮♡\ue361奏ꗲ⺅\ueb84冨봨㚕\uf3aa䦒딣㺮﮾䆶䴄䚄", '0' - AndroidCharacter.getMirror('0'), objArr4);
                    f.c(strIntern2, sb.append(((String) objArr4[0]).intern()).append(cVar.c()).toString());
                }
                if (b.this.f22214d != null) {
                    int i8 = f22218d + 93;
                    f22216a = i8 % 128;
                    if (i8 % 2 != 0) {
                        b.this.f22214d.b(cVar, z2);
                    } else {
                        b.this.f22214d.b(cVar, z2);
                        throw null;
                    }
                }
            }

            @Override // o.cf.c
            public final void d() throws Throwable {
                int i5 = 2 % 2;
                int i6 = f22218d + 31;
                f22216a = i6 % 128;
                if (i6 % 2 == 0) {
                    f.a();
                    throw null;
                }
                if (f.a()) {
                    Object[] objArr3 = new Object[1];
                    f("蜦蝳\uf100佶小檑\u2067僢罊懶⡸壞睢\ue134ず䂽漉\ue94b㠖䢪木텱\u0004炆弬", ExpandableListView.getPackedPositionGroup(0L), objArr3);
                    String strIntern2 = ((String) objArr3[0]).intern();
                    Object[] objArr4 = new Object[1];
                    f("駼馓\uf648䠠뮚…쟃ᩄ憀﹟쿊ቩ榟\ue673ퟒਐ燝\uee00\udfa9ȏ秓혶\ue793㨦䇥\ude2a\uef77㋃䤂웥\uf773⫧儷컫｝⋯", Color.argb(0, 0, 0, 0), objArr4);
                    f.c(strIntern2, ((String) objArr4[0]).intern());
                }
                if (b.this.f22214d != null) {
                    int i7 = f22218d + 11;
                    f22216a = i7 % 128;
                    if (i7 % 2 != 0) {
                        b.this.f22214d.c(z2);
                    } else {
                        b.this.f22214d.c(z2);
                        int i8 = 21 / 0;
                    }
                }
            }
        }, this.f22213c, z2, iVar);
        this.f22215e = eVar;
        eVar.e(dVar);
        int i5 = f22210h + 69;
        f22209g = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void e() {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        if (f.a()) {
            int i3 = f22209g + 123;
            f22210h = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = new Object[1];
                j("梤⢮㼵\udf4d棱ő汏ꎁ컬\ue700옼ﷁ⒨廝ꃊᘆ驷㒞窪끍\uf03a\ueab0퍜쪵基", KeyEvent.getMaxKeyCode() + 15, objArr);
                strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                j("썯嗚駦\uef4a쌋簼쪋鎄攼驿惒췆轴⎩", 0 / (ViewConfiguration.getMaximumDrawingCacheSize() - 100), objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                j("梤⢮㼵\udf4d棱ő汏ꎁ컬\ue700옼ﷁ⒨廝ꃊᘆ驷㒞窪끍\uf03a\ueab0퍜쪵基", 1 - (KeyEvent.getMaxKeyCode() >> 16), objArr3);
                strIntern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                j("썯嗚駦\uef4a쌋簼쪋鎄攼驿惒췆轴⎩", 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr4);
                obj = objArr4[0];
            }
            f.c(strIntern, ((String) obj).intern());
            int i4 = f22209g + 5;
            f22210h = i4 % 128;
            int i5 = i4 % 2;
        }
        if (this.f22215e != null) {
            int i6 = f22210h + 25;
            f22209g = i6 % 128;
            int i7 = i6 % 2;
        }
        this.f22214d = null;
    }
}
