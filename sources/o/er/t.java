package o.er;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends h {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f25169b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f25170c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f25171d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f25172e = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f25173j = 0;

    private static String $$c(byte b2, byte b3, byte b4) {
        byte[] bArr = $$a;
        int i2 = (b4 * 4) + 4;
        int i3 = 114 - (b3 * 7);
        int i4 = b2 * 4;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            i3 = i5 + i2;
            i2++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            int i7 = i2;
            i3 += bArr[i2];
            i2 = i7 + 1;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f25170c = 0;
        f25173j = 1;
        f25172e = 0;
        f25169b = 1;
        a();
        TextUtils.indexOf("", "");
        int i2 = f25173j + 77;
        f25170c = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public t(o.ep.d dVar, o.eq.e eVar) {
        super(dVar, eVar);
    }

    static void a() {
        f25171d = 1467184184161693367L;
    }

    private String b() throws Throwable {
        int i2 = 2 % 2;
        String strB = this.f25010g.l().b();
        if (strB == null) {
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                f("履尬侌嬗댯ꋣ蕐獒꼣뿝랰沥멘곉뭱姾薍馀衲唶郇虧鴔䘄鰄", 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                f("喞嗹袌鰩琤旇祉软ꛟ磹炏邷뎘母籂ꗥ豣庑佶ꤥ餠䅁娢먊问㐸◅콌\ue6e8㣨ゖ킳\uf3d2⮘㰏\ue5cf챐Ẁཱ\ue922\ud92fčᨳ精햶\uf43e\ue5eeདྷ⚂\uf8f5\uf096ႄ㏎\uebc4ﱓ◺\u0c5b\ude89콲⥢ᤶ셈\uda2f㨂ᗷ됧ꗡ会暰룠낞傋珊ꮬ뱔旡䱙麚輂椧夶腀騻稪喣瑱旖轍ꚿ碽炃邊뎃毩籟ꗳ豔应会ꤶ養䄁娽멡閪㐌◲콆\ue6be㢹セ킇\uf396⮱㱚\ue5d8챀", 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr2);
                o.ea.f.d(strIntern, ((String) objArr2[0]).intern());
                int i3 = f25169b + 3;
                f25172e = i3 % 128;
                int i4 = i3 % 2;
            }
            Object[] objArr3 = new Object[1];
            f("☒♼㬪ꗧ있尢ޙ\uf19f핓쭟䥁\uee67쀔\ud86b䖌\udb35\uffef\ued37皸ퟵ\ueaac", View.resolveSizeAndState(0, 0, 0) + 1, objArr3);
            strB = ((String) objArr3[0]).intern();
        }
        int i5 = f25172e + 99;
        f25169b = i5 % 128;
        int i6 = i5 % 2;
        return strB;
    }

    private static void f(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 25;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        o.a.k kVar = new o.a.k();
        char[] cArrC = o.a.k.c(f25171d ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            int i6 = $11 + 87;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            kVar.f19938a = kVar.f19939c - 4;
            int i8 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f25171d)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 1);
                    objA = o.d.d.a(229 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 51004), TextUtils.getCapsMode("", 0, 0) + 9, 1749983833, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(675 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((Process.getThreadPriority(0) + 20) >> 6), Color.rgb(0, 0, 0) + 16777228, 522683165, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                int i9 = $11 + 15;
                $10 = i9 % 128;
                int i10 = i9 % 2;
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

    static void init$0() {
        $$a = new byte[]{125, 113, 52, MessagePack.Code.FLOAT32};
        $$b = 151;
    }

    @Override // o.er.h
    public final /* bridge */ /* synthetic */ boolean c() {
        int i2 = 2 % 2;
        int i3 = f25169b + 63;
        f25172e = i3 % 128;
        if (i3 % 2 == 0) {
            return super.c();
        }
        super.c();
        throw null;
    }

    public final o.y.q d() throws WalletValidationException {
        int i2 = 2 % 2;
        o.y.q qVar = new o.y.q(b(), this.f25009a, c());
        int i3 = f25172e + 81;
        f25169b = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 61 / 0;
        }
        return qVar;
    }

    @Override // o.er.h
    public final c[] h() {
        int i2 = 2 % 2;
        int i3 = f25172e + 79;
        f25169b = i3 % 128;
        if (i3 % 2 != 0) {
            return new c[]{this.f25010g.l()};
        }
        c[] cVarArr = new c[0];
        cVarArr[0] = this.f25010g.l();
        return cVarArr;
    }
}
