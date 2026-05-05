package o.cg;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.k;
import org.msgpack.core.MessagePack;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static int A = 0;
    private static int B = 0;
    private static long C = 0;
    private static int D = 0;
    private static int E = 0;
    private static int G = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f22248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f22249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f22250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f22251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f22252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f22253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f22254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f22255h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f22256i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f22257j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f22258k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f22259l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c f22260m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f22261n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f22262o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final c f22263p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final c f22264q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final c f22265r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final c f22266s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final c f22267t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final c f22268u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ c[] f22269v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final c f22270w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final c f22271x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static long f22272y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static char f22273z = 0;

    /* JADX INFO: renamed from: o.cg.c$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22274a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f22275c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f22276d = 0;

        static {
            int[] iArr = new int[c.values().length];
            f22274a = iArr;
            try {
                iArr[c.f22252e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22274a[c.f22251d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22274a[c.f22250c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22274a[c.f22248a.ordinal()] = 4;
                int i2 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22274a[c.f22249b.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22274a[c.f22253f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22274a[c.f22256i.ordinal()] = 7;
                int i3 = f22275c;
                int i4 = (i3 ^ 85) + ((i3 & 85) << 1);
                f22276d = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22274a[c.f22255h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22274a[c.f22257j.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22274a[c.f22254g.ordinal()] = 10;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22274a[c.f22259l.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22274a[c.f22258k.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f22274a[c.f22260m.ordinal()] = 13;
                int i8 = f22275c;
                int i9 = (i8 ^ 123) + (((-1) - (((-1) - i8) | ((-1) - 123))) << 1);
                f22276d = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 2 % 2;
                }
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f22274a[c.f22261n.ordinal()] = 14;
                int i11 = f22276d;
                int i12 = (((-1) - (((-1) - i11) & ((-1) - 115))) << 1) - (i11 ^ 115);
                f22275c = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 5 / 2;
                } else {
                    int i14 = 2 % 2;
                }
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f22274a[c.f22262o.ordinal()] = 15;
                int i15 = f22276d + 39;
                f22275c = i15 % 128;
                int i16 = i15 % 2;
                int i17 = 2 % 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f22274a[c.f22266s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f22274a[c.f22267t.ordinal()] = 17;
                int i18 = f22275c;
                int i19 = (i18 & 61) + ((-1) - (((-1) - i18) & ((-1) - 61)));
                f22276d = i19 % 128;
                if (i19 % 2 == 0) {
                    int i20 = 2 % 2;
                }
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f22274a[c.f22265r.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f22274a[c.f22264q.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f22274a[c.f22263p.ordinal()] = 20;
                int i21 = 2 % 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f22274a[c.f22271x.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f22274a[c.f22268u.ordinal()] = 22;
                int i22 = f22275c;
                int i23 = (((i22 + 51) - (51 & i22)) << 1) - (i22 ^ 51);
                f22276d = i23 % 128;
                int i24 = i23 % 2;
                int i25 = 2 % 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f22274a[c.f22270w.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r6, int r7, short r8) {
        /*
            int r2 = r7 * 4
            int r1 = 1 - r2
            int r0 = r6 * 3
            int r7 = 3 - r0
            byte[] r6 = o.cg.c.$$a
            int r5 = 122 - r8
            byte[] r4 = new byte[r1]
            r3 = 0
            int r2 = 0 - r2
            if (r6 != 0) goto L2a
            r1 = r5
            r0 = r3
            r5 = r2
        L16:
            int r5 = r5 + r1
            r1 = r0
        L18:
            int r7 = r7 + 1
            byte r0 = (byte) r5
            r4[r1] = r0
            int r0 = r1 + 1
            if (r1 != r2) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L27:
            r1 = r6[r7]
            goto L16
        L2a:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cg.c.$$c(int, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        G = 0;
        E = 1;
        A = 0;
        D = 1;
        a();
        Object[] objArr = new Object[1];
        H((char) (View.getDefaultSize(0, 0) + 59762), "彑墏ꈥⳕ✽곿代\ue27a턁\u1ae5룧욪跸\u2d98ᶊ晉笥偒煮", "\u0000\u0000\u0000\u0000", "칃邎爅\ue1e9", View.combineMeasuredStates(0, 0) + 93359822, objArr);
        f22252e = new c(((String) objArr[0]).intern(), 0);
        Object[] objArr2 = new Object[1];
        F("ⶏꚛⷁ댍負ꅡꜲ\ue0cf稬쭖ཹ㢔艶换垿偽⪎뮸뾏\ue82e狱폗߂,鬖樒渫姚⌢艄뙇\uf1ae䭖\uda7dẴ॥鎉犭暕ꄬ", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
        f22251d = new c(((String) objArr2[0]).intern(), 1);
        Object[] objArr3 = new Object[1];
        F("ڭ輏ۿ骙搻쏰侬艜億\ue2c3\ue7fd娖\ua95a䫪뼶㋵ƻ鈭園誹姴暑\uef43抿뀰䎉蚵㭐ࠗꯑ", -ExpandableListView.getPackedPositionChild(0L), objArr3);
        f22250c = new c(((String) objArr3[0]).intern(), 2);
        Object[] objArr4 = new Object[1];
        H((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), "턕醺㘑蕧≧躍愃ꊌኡᡀ送\udfb5\uecef夙\ue455쮟\uf86b셁᜵\ude28鈹豩梁㧌", "\u0000\u0000\u0000\u0000", "굻ퟒ넰\udefc", TextUtils.indexOf("", "", 0), objArr4);
        f22248a = new c(((String) objArr4[0]).intern(), 3);
        Object[] objArr5 = new Object[1];
        F("\ud897ꎖ\ud8c5똀爵頇턉\ud9ab輾칚祘Ǥ睦晳ↁ椚\udf9a뺻즵텎蟎훚燦㥈渊漐᠐悧혭蝈", 1 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr5);
        f22249b = new c(((String) objArr5[0]).intern(), 4);
        Object[] objArr6 = new Object[1];
        F("⛯L⚼ᗚ断씔丨蒸煑涖\ue65c峞褙얩뺶㐆⇿ᵲ嚈豇禜甀\ueed5摩遶쳛蜻㶒⡂⒃彶闅䀽粪\uf7be洕飺푭辎", 1 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr6);
        f22253f = new c(((String) objArr6[0]).intern(), 5);
        Object[] objArr7 = new Object[1];
        F("䣻巇䢳䡀눲\uf248馠돡ὥ〝ㇳ殝\ue70c頢椿͜俚䃢脊묚ឹ", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr7);
        f22256i = new c(((String) objArr7[0]).intern(), 6);
        Object[] objArr8 = new Object[1];
        H((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), "⌻鹄鳷쁕ꩧຬ䅿ꤩ뢩抽䉿", "\u0000\u0000\u0000\u0000", "纹將톒໓", Color.green(0) - 1839462530, objArr8);
        f22255h = new c(((String) objArr8[0]).intern(), 7);
        Object[] objArr9 = new Object[1];
        F("咗㝼哒⋢\uef93ꇦ쐅\ue04b̢媑汄㠰ﭿ\uf298㒃僤厖", 1 - Drawable.resolveOpacity(0, 0), objArr9);
        f22257j = new c(((String) objArr9[0]).intern(), 8);
        Object[] objArr10 = new Object[1];
        F("࿗\ue75eྞ\uf2c3\udd3e뜅\uf6ae\uf6bd塷誈廨⻲ꀪ⊦ذ䘛ࣝ喙\uee11ﹲ傔鈒噆ᙊ륄⯃㾱侱ū", 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr10);
        f22254g = new c(((String) objArr10[0]).intern(), 9);
        Object[] objArr11 = new Object[1];
        F("\u0bdf่\u0b96ᯕ䢹\ude5b挩鿣屿掞쭯䞿ꐲ쮷鎯⽏ೕ፫箚霅咎笟쏆缽뵍싳ꨴ⛥ղ⪝", 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr11);
        f22259l = new c(((String) objArr11[0]).intern(), 10);
        Object[] objArr12 = new Object[1];
        H((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), "碞畂\ue358Ꝁ띠郗燫⚿镈\udcc8撎噲\ue209颍뱽╶഻脚謃倄τ", "\u0000\u0000\u0000\u0000", "졛\u009a洱\udda7", 822123209 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr12);
        f22258k = new c(((String) objArr12[0]).intern(), 11);
        Object[] objArr13 = new Object[1];
        F("ꔙ澞ꕜ稀\uf23d뾴\ud9ab︙\uf2acɱ燮♨૭ꩺ⤢亡ꈻ犻섘\uf6e4嗢\u1ad8祘ọᎊꌟႬ䜄", (-16777215) - Color.rgb(0, 0, 0), objArr13);
        f22260m = new c(((String) objArr13[0]).intern(), 12);
        Object[] objArr14 = new Object[1];
        H((char) (TextUtils.lastIndexOf("", '0') + 1), "쏴ࡿ嬈嚛᠐킛毂\uea36狵嚉ﰶ\ue18cǅ㳤溷䔽夤⋚䒡ꩾ\ue7ea劦郐븶ḷ渽趴\uf21cയҾ쬥\ud934갭", "\u0000\u0000\u0000\u0000", "嗖ｿⳚ⨑", KeyEvent.getDeadChar(0, 0) - 620789931, objArr14);
        f22261n = new c(((String) objArr14[0]).intern(), 13);
        Object[] objArr15 = new Object[1];
        F("望ꮗ難븁努笚礯㪫괱왁텻\ue2de啧湞覵計ﶜ뚥憎㉃ꗦ\udec6\ud9ce\uda7c䰝", View.combineMeasuredStates(0, 0) + 1, objArr15);
        f22262o = new c(((String) objArr15[0]).intern(), 14);
        Object[] objArr16 = new Object[1];
        F("\uf7b5镜\uf7f7胎뎩䥀頬ࣲꀜ\uf88dみ킬塃傴梾롕\uf0b4补肗", KeyEvent.getDeadChar(0, 0) + 1, objArr16);
        f22266s = new c(((String) objArr16[0]).intern(), 15);
        Object[] objArr17 = new Object[1];
        F("槳鸆榲讅⫞ﾕň븅㹑\uf3cd꤉晗옙寤\uf1d4ຝ滔茹᧱뛋㚨\ueb63ꆩ廵\udf63劌졘", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, objArr17);
        f22267t = new c(((String) objArr17[0]).intern(), 16);
        Object[] objArr18 = new Object[1];
        F("अ庨ी䬷踚贻ꖕ첅庠㍵ශᓲ꛴魗唝簆ฎ䎌봤", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, objArr18);
        f22265r = new c(((String) objArr18[0]).intern(), 17);
        Object[] objArr19 = new Object[1];
        F("卟嚰匈䌢낾驝鬴\udbe8Ӷ㭻㍀Ηﲤ鍐殥歈呺䮉莐팥ః⏺㯏㬽\ue5c1騶到拡巣牲詜쪓㖸⩃", -ImageFormat.getBitsPerPixel(0), objArr19);
        f22264q = new c(((String) objArr19[0]).intern(), 18);
        Object[] objArr20 = new Object[1];
        H((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), "⍟祮稃꽣ꅮꖼﴄ┾\uda2fﲃ茜꒢\uda59戴폂רּ並ｽꎴ袙Ѯ榜툜Ꮶ벮衈跻䗗峓\ue67e韾絇\ue8f2", "\u0000\u0000\u0000\u0000", "뤛뵑\uedd4\uf096", (ViewConfiguration.getPressedStateDuration() >> 16) - 725790279, objArr20);
        f22263p = new c(((String) objArr20[0]).intern(), 19);
        Object[] objArr21 = new Object[1];
        H((char) (ViewConfiguration.getPressedStateDuration() >> 16), "㘛Ꝼ䈥숪蝏⑰庉铗밌媬靺ꁮ怐黤\uf822䈣⺺毼瀼沟떙廭⊍潸\ue8ec욣\ue64f\ue82f騇Ꜣ铉\ueab0蕜", "\u0000\u0000\u0000\u0000", "\ue068捷\ue123紓", TextUtils.indexOf((CharSequence) "", '0', 0) + 593721313, objArr21);
        f22271x = new c(((String) objArr21[0]).intern(), 20);
        Object[] objArr22 = new Object[1];
        F("\uecb0綆\uece0标\uf7e8択\udc61⌱묕၊琳ﭔ䍆롤\u2cf8鎈\ueb98悾쓁⯈돥ࣁ粿쏴娸넀ᕼ騪\ue20c奔촩㉑詧Ů时쪖", (ViewConfiguration.getLongPressTimeout() >> 16) + 1, objArr22);
        f22268u = new c(((String) objArr22[0]).intern(), 21);
        Object[] objArr23 = new Object[1];
        F("\uf283湧\uf2d3篦뎝ﬁ頔몮ꔦΫう拋嵵ꮅ梍ਗ\uf5a6獜肥뉙귒ᬠ㣲婝䐌ꋭ儛Εﰨ䪨襚ꯖ鑶ኔ\u218e匃䲍멷妴ﭜ\ue4ca", (Process.myTid() >> 22) + 1, objArr23);
        f22270w = new c(((String) objArr23[0]).intern(), 22);
        f22269v = b();
        int i2 = G + 33;
        E = i2 % 128;
        int i3 = i2 % 2;
    }

    private c(String str, int i2) {
    }

    private static void F(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        if (str2 != null) {
            int i4 = $11 + 47;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        k kVar = new k();
        char[] cArrC = k.c(f22272y ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            int i6 = $10 + 37;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            kVar.f19938a = kVar.f19939c - 4;
            int i8 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f22272y)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(View.MeasureSpec.makeMeasureSpec(0, 0) + 229, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 51005), 8 - TextUtils.lastIndexOf("", '0'), 1749983833, false, $$c(b2, b3, (byte) ((-1) - (((-1) - b3) & ((-1) - 15)))), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(675 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 12 - View.MeasureSpec.getMode(0), 522683165, false, $$c(b4, b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 8)))), new Class[]{Object.class, Object.class});
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

    private static void H(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2;
        int i4 = 2 % 2;
        Object charArray = str6;
        if (str6 != null) {
            charArray = str6.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str5;
        if (str5 != null) {
            int i5 = $10 + 107;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 66 / 0;
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
        o.a.i iVar = new o.a.i();
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
        int i7 = $11 + 33;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        while (iVar.f19932b < length3) {
            int i9 = $10 + 51;
            $11 = i9 % 128;
            int i10 = i9 % i3;
            try {
                Object[] objArr2 = {iVar};
                Object objA = o.d.d.a(540069882);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(ExpandableListView.getPackedPositionGroup(0L) + 106, (char) (Process.getGidForName("") + 1), 10 - TextUtils.lastIndexOf("", '0'), -155898465, false, $$c(b2, b3, (byte) ((b3 + 57) - (57 & b3))), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = o.d.d.a(2068572);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a((Process.myTid() >> 22) + 847, (char) (Drawable.resolveOpacity(0, 0) + 6488), 13 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -694521287, false, $$c(b4, b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 54)))), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA3 = o.d.d.a(-1122996612);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(459 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) TextUtils.indexOf("", "", 0, 0), 11 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1804962841, false, $$c(b6, b7, (byte) ((-1) - (((-1) - b7) & ((-1) - 56)))), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = o.d.d.a(-1223178239);
                if (objA4 == null) {
                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 639;
                    char c3 = (char) (65099 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    int iMyTid = 12 - (Process.myTid() >> 22);
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    String str$$c = $$c(b8, b9, b9);
                    i3 = 2;
                    objA4 = o.d.d.a(iCombineMeasuredStates, c3, iMyTid, 1636969060, false, str$$c, new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i3 = 2;
                }
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r9[iVar.f19932b])) ^ (C ^ 740602047300126166L)) ^ ((long) ((int) (((long) B) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f22273z) ^ 740602047300126166L))));
                iVar.f19932b++;
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

    static void a() {
        f22272y = 558376951519610761L;
        C = 740602047300126166L;
        B = -1088528380;
        f22273z = (char) 17878;
    }

    private static /* synthetic */ c[] b() {
        int i2 = 2 % 2;
        int i3 = A + 51;
        int i4 = i3 % 128;
        D = i4;
        int i5 = i3 % 2;
        c[] cVarArr = {f22252e, f22251d, f22250c, f22248a, f22249b, f22253f, f22256i, f22255h, f22257j, f22254g, f22259l, f22258k, f22260m, f22261n, f22262o, f22266s, f22267t, f22265r, f22264q, f22263p, f22271x, f22268u, f22270w};
        int i6 = i4 + 75;
        A = i6 % 128;
        if (i6 % 2 == 0) {
            return cVarArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void init$0() {
        $$a = new byte[]{Ascii.FF, 10, -28, MessagePack.Code.NEGFIXINT_PREFIX};
        $$b = 11;
    }

    public static c valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = A + 15;
        D = i3 % 128;
        int i4 = i3 % 2;
        c cVar = (c) Enum.valueOf(c.class, str);
        if (i4 == 0) {
            throw null;
        }
        int i5 = D + 125;
        A = i5 % 128;
        int i6 = i5 % 2;
        return cVar;
    }

    public static c[] values() {
        int i2 = 2 % 2;
        int i3 = D + 73;
        A = i3 % 128;
        int i4 = i3 % 2;
        c[] cVarArr = (c[]) f22269v.clone();
        int i5 = D + 57;
        A = i5 % 128;
        int i6 = i5 % 2;
        return cVarArr;
    }

    public final o.bg.a c() throws Throwable {
        int i2 = 2 % 2;
        switch (AnonymousClass1.f22274a[ordinal()]) {
            case 1:
                return o.bg.a.f21038g;
            case 2:
            case 3:
            case 4:
            case 5:
                return o.bg.a.f21032a;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                o.bg.a aVar = o.bg.a.f21033b;
                int i3 = D + 105;
                A = i3 % 128;
                int i4 = i3 % 2;
                return aVar;
            case 11:
                return o.bg.a.am;
            case 12:
            case 13:
            case 14:
                return o.bg.a.f21036e;
            case 15:
            case 16:
                return o.bg.a.f21040i;
            case 17:
                return o.bg.a.f21035d;
            case 18:
                return o.bg.a.f21041j;
            case 19:
                return o.bg.a.f21043l;
            case 20:
                return o.bg.a.U;
            case 21:
                o.bg.a aVar2 = o.bg.a.ab;
                int i5 = A + 51;
                D = i5 % 128;
                int i6 = i5 % 2;
                return aVar2;
            case 22:
                return o.bg.a.Z;
            case 23:
                return o.bg.a.Y;
            default:
                StringBuilder sb = new StringBuilder();
                Object[] objArr = new Object[1];
                F("㲪귄㳿롙ꙝ웋跞蝪欖쀞▌弚鍗栫紃㟬㮯냿镢输掠\ud8c7", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
                throw new UnsupportedOperationException(sb.append(((String) objArr[0]).intern()).append(name()).toString());
        }
    }
}
