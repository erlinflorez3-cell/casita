package o.fe;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.lang.reflect.Method;
import o.a.k;
import o.ea.f;
import o.ef.c;
import o.ff.a;
import o.ff.b;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f25816a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f25817b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f25818c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f25819d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f25820e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f25821g = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f25822j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f25823k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static long f25824l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f25825m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f25826n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f25827o = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f25828f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f25829h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f25830i;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r8, short r9, byte r10) {
        /*
            int r0 = r9 + 4
            byte[] r9 = o.fe.e.$$a
            int r1 = r8 * 7
            int r8 = 114 - r1
            int r1 = r10 * 4
            int r7 = r1 + 1
            byte[] r6 = new byte[r7]
            r5 = 0
            if (r9 != 0) goto L29
            r1 = r0
            r8 = r7
            r4 = r5
        L14:
            int r8 = r8 + r0
            r0 = r1
            r3 = r4
        L17:
            byte r2 = (byte) r8
            int r1 = r0 + 1
            int r4 = r3 + 1
            r6[r3] = r2
            if (r4 != r7) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L26:
            r0 = r9[r1]
            goto L14
        L29:
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fe.e.$$c(int, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f25821g = -1093105843;
        f25822j = 105917769;
        f25817b = -1627622763;
        f25818c = 812456280;
        f25820e = -1700220051;
        f25816a = 1757241360;
        f25819d = -1764836758;
        f25826n = 0;
        f25823k = 1;
        f25827o = 0;
        f25825m = 1;
        l();
        PointF.length(0.0f, 0.0f);
        int i2 = f25826n + 7;
        f25823k = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 75 / 0;
        }
    }

    public e(boolean z2, b bVar, short s2) {
        super(z2, bVar, s2);
    }

    public static /* synthetic */ Object e(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
        short s2;
        int i8 = ~((-1) - (((-1) - i7) & ((-1) - i2)));
        int i9 = i3 | i8;
        int i10 = ~i3;
        int i11 = (-1) - (((-1) - (~((i2 + i10) - (i2 & i10)))) & ((-1) - i7));
        int i12 = i7 + i3 + i5 + ((-1932811043) * i6) + (1521317780 * i4);
        int i13 = i12 * i12;
        int i14 = ((i7 * (-919556932)) - 154402816) + ((-919556932) * i3) + ((-1121407813) * i8) + (i9 * 1121407813) + (1121407813 * i11) + (201850880 * i5) + ((-2098724864) * i6) + ((-1398800384) * i4) + ((-1444151296) * i13);
        int i15 = (i7 * 1794637580) + 2133191799 + (i3 * 1794637580) + (i8 * (-161)) + (i9 * 161) + (i11 * 161) + (i5 * 1794637741) + (i6 * (-1844343719)) + (i4 * (-1188939004)) + (i13 * (-394526720));
        if (i14 + (i15 * i15 * 821297152) == 1) {
            e eVar = (e) objArr[0];
            int i16 = 2 % 2;
            int i17 = f25825m + 125;
            int i18 = i17 % 128;
            f25827o = i18;
            if (i17 % 2 == 0 ? (s2 = (short) (eVar.f25828f - eVar.f25829h)) <= 0 : (s2 = (short) (eVar.f25828f * eVar.f25829h)) <= 0) {
                return (short) 0;
            }
            int i19 = i18 + 113;
            f25825m = i19 % 128;
            int i20 = i19 % 2;
            return Short.valueOf(s2);
        }
        e eVar2 = (e) objArr[0];
        int i21 = 2 % 2;
        if (eVar2.b() != b.f25845c) {
            int i22 = f25827o + 13;
            f25825m = i22 % 128;
            int i23 = i22 % 2;
            return false;
        }
        int i24 = f25825m + 81;
        f25827o = i24 % 128;
        int i25 = i24 % 2;
        eVar2.c(b.f25844b);
        return true;
    }

    static void init$0() {
        $$a = new byte[]{124, 69, -84, MessagePack.Code.STR8};
        $$b = 76;
    }

    static void l() {
        f25824l = -3299026312137009033L;
    }

    private static void p(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 57;
        $11 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        Object charArray = str2 != null ? str2.toCharArray() : str2;
        k kVar = new k();
        char[] cArrC = k.c(f25824l ^ (-5882309809461882246L), (char[]) charArray, i2);
        int i5 = 4;
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            int i6 = $11 + 27;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            kVar.f19938a = kVar.f19939c - i5;
            int i8 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % i5]), Long.valueOf(kVar.f19938a), Long.valueOf(f25824l)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 1;
                    byte b3 = (byte) (-b2);
                    objA = o.d.d.a(229 - View.combineMeasuredStates(0, 0), (char) (View.resolveSizeAndState(0, 0, 0) + 51004), 9 - ExpandableListView.getPackedPositionGroup(0L), 1749983833, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objA2 = o.d.d.a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 674, (char) (ViewConfiguration.getEdgeSlop() >> 16), 12 - TextUtils.indexOf("", ""), 522683165, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                i5 = 4;
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

    public final c a(int i2) throws o.ef.b {
        int i3;
        int i4 = 2 % 2;
        int i5 = f25827o;
        int i6 = i5 + 9;
        f25825m = i6 % 128;
        int i7 = i6 % 2;
        if (this.f25828f == 0) {
            int i8 = i5 + 37;
            f25825m = i8 % 128;
            if (i8 % 2 != 0) {
                return null;
            }
            throw null;
        }
        c cVar = new c();
        int i9 = 0;
        while (true) {
            i3 = this.f25829h;
            if (i9 >= i3) {
                break;
            }
            o.ef.a aVar = new o.ef.a();
            Object[] objArr = new Object[1];
            p("胼肝\uf5ff粏羆棶ె", -ImageFormat.getBitsPerPixel(0), objArr);
            aVar.c(((String) objArr[0]).intern(), i2 + i9);
            Object[] objArr2 = new Object[1];
            p("어엇챠铘䘙肣穬\uedf5繒\ue43f", 1 - Drawable.resolveOpacity(0, 0), objArr2);
            aVar.a(((String) objArr2[0]).intern(), (Object) b.f25843a.a());
            cVar.a(aVar);
            i9++;
            int i10 = f25827o + 103;
            f25825m = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = f25825m + 73;
        f25827o = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 3 % 2;
        }
        while (i3 < this.f25828f) {
            o.ef.a aVar2 = new o.ef.a();
            Object[] objArr3 = new Object[1];
            p("胼肝\uf5ff粏羆棶ె", -((byte) KeyEvent.getModifierMetaStateMask()), objArr3);
            aVar2.c(((String) objArr3[0]).intern(), i2 + i3);
            Object[] objArr4 = new Object[1];
            p("어엇챠铘䘙肣穬\uedf5繒\ue43f", Color.blue(0) + 1, objArr4);
            aVar2.a(((String) objArr4[0]).intern(), (Object) b().a());
            cVar.a(aVar2);
            i3++;
        }
        return cVar;
    }

    public final void b(int i2) {
        int i3 = 2 % 2;
        int i4 = f25827o + 23;
        int i5 = i4 % 128;
        f25825m = i5;
        if (i4 % 2 == 0) {
            this.f25829h = i2;
            int i6 = 36 / 0;
        } else {
            this.f25829h = i2;
        }
        int i7 = i5 + 17;
        f25827o = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public final o.ff.e c(int i2) {
        String strIntern;
        Object obj;
        int i3 = 2 % 2;
        int i4 = f25825m + 107;
        f25827o = i4 % 128;
        int i5 = i4 % 2;
        if (!c()) {
            if (f.a()) {
                int i6 = f25825m + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f25827o = i6 % 128;
                int i7 = i6 % 2;
                Object[] objArr = new Object[1];
                p("䬅䭏Ꙋ\u0e71Ⱔᨉ鑍捐ᑲ\u0a3a㉒찄ᬃ籋檸\ue4d0㏠", -TextUtils.indexOf((CharSequence) "", '0'), objArr);
                String strIntern2 = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                p("릾맜뒄\uf651㻼\ue222㫩釮ڋ꒢쩺抁\ue9a2溢銺䩃셅뙁窂눴ᤝ鸼䋰騰烃\ue7d3⬠쏻䣖쾠\uf37a⮐ꂷន\udba3\u1311\uf833缉ꎀ笀퀓䝅诖ꌪ\u2b96ꣿ倜铹\u03a2\uf0ac㡱ﲠ宧\ud895º\u2457덶⁐", 1 - View.resolveSizeAndState(0, 0, 0), objArr2);
                f.d(strIntern2, ((String) objArr2[0]).intern());
            }
            return null;
        }
        int i8 = this.f25829h;
        if (i8 < this.f25828f) {
            int i9 = i8 + i2;
            if (i9 < 65535) {
                return new d(b.f25845c, a(), i9, this.f25830i) { // from class: o.fe.e.1

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static int f25831c = 0;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static int f25832e = 1;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private final e f25834d;

                    {
                        this.f25834d = e.this;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
                    
                        return false;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
                    
                        if (b() == o.ff.b.f25845c) goto L6;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
                    
                        c(o.ff.b.f25844b);
                        r2 = o.fe.e.AnonymousClass1.f25831c;
                        r1 = (((-1) - (((-1) - r2) & ((-1) - 57))) << 1) - (r2 ^ 57);
                        o.fe.e.AnonymousClass1.f25832e = r1 % 128;
                        r1 = r1 % 2;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
                    
                        return true;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:9:0x0046, code lost:
                    
                        if (b() == o.ff.b.f25845c) goto L6;
                     */
                    @Override // o.ff.e, o.ff.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final boolean d(java.lang.String r7, o.dk.a r8) {
                        /*
                            r6 = this;
                            r5 = 2
                            int r0 = r5 % r5
                            int r1 = o.fe.e.AnonymousClass1.f25831c
                            r2 = r1 ^ 117(0x75, float:1.64E-43)
                            r0 = 117(0x75, float:1.64E-43)
                            int r1 = (-1) - r1
                            int r0 = (-1) - r0
                            r1 = r1 | r0
                            int r0 = (-1) - r1
                            r4 = 1
                            int r0 = r0 << r4
                            int r2 = r2 + r0
                            int r0 = r2 % 128
                            o.fe.e.AnonymousClass1.f25832e = r0
                            int r2 = r2 % r5
                            r3 = 0
                            if (r2 != 0) goto L40
                            o.ff.b r2 = r6.b()
                            o.ff.b r1 = o.ff.b.f25845c
                            r0 = 70
                            int r0 = r0 / r3
                            if (r2 != r1) goto L49
                        L26:
                            o.ff.b r0 = o.ff.b.f25844b
                            r6.c(r0)
                            int r2 = o.fe.e.AnonymousClass1.f25831c
                            r0 = 57
                            int r1 = (-1) - r2
                            int r0 = (-1) - r0
                            r1 = r1 & r0
                            int r1 = (-1) - r1
                            int r1 = r1 << r4
                            r0 = r2 ^ 57
                            int r1 = r1 - r0
                            int r0 = r1 % 128
                            o.fe.e.AnonymousClass1.f25832e = r0
                            int r1 = r1 % r5
                            return r4
                        L40:
                            o.ff.b r1 = r6.b()
                            o.ff.b r0 = o.ff.b.f25845c
                            if (r1 != r0) goto L49
                            goto L26
                        L49:
                            return r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: o.fe.e.AnonymousClass1.d(java.lang.String, o.dk.a):boolean");
                    }
                };
            }
            if (f.a()) {
                Object[] objArr3 = new Object[1];
                p("䬅䭏Ꙋ\u0e71Ⱔᨉ鑍捐ᑲ\u0a3a㉒찄ᬃ籋檸\ue4d0㏠", View.getDefaultSize(0, 0) + 1, objArr3);
                String strIntern3 = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                p("\u05ee\u058c敮藋\uef16醸鎵ⶾ흡\u0dfe맠쯝嗲뽈\ue120\ue31f紕枫घ᭨ꕍ俖ㅪ㍬첓㘹墺檧\uf486Ṋ胠苌᳧왹꠹멍䑣껣퀰퉭汹隯\uf84d\u0a64鞕祛⎛㶴뾳⅄䯵嗸\ue7faळ猵贁༯\uf1ff鬘ꕔ㝎\ud9e2썔\udd74序聗\uea9b\uf4ac蛂桖ዴ", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr4);
                f.d(strIntern3, ((String) objArr4[0]).intern());
            }
            return null;
        }
        int i10 = f25825m + 51;
        f25827o = i10 % 128;
        if (i10 % 2 != 0) {
            f.a();
            throw null;
        }
        if (f.a()) {
            int i11 = f25827o + 67;
            f25825m = i11 % 128;
            if (i11 % 2 == 0) {
                Object[] objArr5 = new Object[1];
                p("䬅䭏Ꙋ\u0e71Ⱔᨉ鑍捐ᑲ\u0a3a㉒찄ᬃ籋檸\ue4d0㏠", 1 << View.resolveSize(0, 1), objArr5);
                strIntern = ((String) objArr5[0]).intern();
                Object[] objArr6 = new Object[1];
                p("⥥⤇䨆弊쁾䭹\uf093ĵ\uf809滘挡ꣻ祹造㯡耹冞䣃폙硎视悾\uebab偊\ue018ᥑ艻ঁ\ud80dㄢ娡\ue1eaぬ\ue911狸\ud96b棨膋\u0adb녺䃈맇⊌楂묞嘳讀庒錸ฬ鄴㛞쭱♛ꧩ\uee3b⎲\ude97䇙왲ᯅ\uf68aᦕ빒爄꼿ぜ鞊꩜䜦젵俑艥羧\ue0ea✶猪៑뢭ὥ", 1 / (ViewConfiguration.getMaximumDrawingCacheSize() >>> 41), objArr6);
                obj = objArr6[0];
            } else {
                Object[] objArr7 = new Object[1];
                p("䬅䭏Ꙋ\u0e71Ⱔᨉ鑍捐ᑲ\u0a3a㉒찄ᬃ籋檸\ue4d0㏠", View.resolveSize(0, 0) + 1, objArr7);
                strIntern = ((String) objArr7[0]).intern();
                Object[] objArr8 = new Object[1];
                p("⥥⤇䨆弊쁾䭹\uf093ĵ\uf809滘挡ꣻ祹造㯡耹冞䣃폙硎视悾\uebab偊\ue018ᥑ艻ঁ\ud80dㄢ娡\ue1eaぬ\ue911狸\ud96b棨膋\u0adb녺䃈맇⊌楂묞嘳讀庒錸ฬ鄴㛞쭱♛ꧩ\uee3b⎲\ude97䇙왲ᯅ\uf68aᦕ빒爄꼿ぜ鞊꩜䜦젵俑艥羧\ue0ea✶猪៑뢭ὥ", 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr8);
                obj = objArr8[0];
            }
            f.c(strIntern, ((String) obj).intern());
        }
        return null;
    }

    @Override // o.ff.a
    public final void d() {
        int i2 = 2 % 2;
        int i3 = f25825m + 27;
        f25827o = i3 % 128;
        int i4 = i3 % 2;
        c(b.f25843a);
        int i5 = f25825m + 125;
        f25827o = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void d(int i2) {
        int i3 = 2 % 2;
        int i4 = f25825m + 31;
        int i5 = i4 % 128;
        f25827o = i5;
        if (i4 % 2 != 0) {
            this.f25828f = i2;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.f25828f = i2;
        int i6 = i5 + 27;
        f25825m = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // o.ff.a
    public final boolean d(String str, o.dk.a aVar) {
        int i2 = f25819d * 966638990;
        f25819d = i2;
        int i3 = f25816a * 416058058;
        f25816a = i3;
        int i4 = f25820e * (-678313846);
        f25820e = i4;
        return ((Boolean) e(i2, 1716816586, (int) Runtime.getRuntime().totalMemory(), i3, new Object[]{this, str, aVar}, i4, -1716816586)).booleanValue();
    }

    public final void e(int i2) {
        int i3 = 2 % 2;
        int i4 = f25825m + 113;
        f25827o = i4 % 128;
        if (i4 % 2 == 0) {
            this.f25830i = i2;
            return;
        }
        this.f25830i = i2;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int g() {
        int i2 = 2 % 2;
        int i3 = f25825m + 125;
        int i4 = i3 % 128;
        f25827o = i4;
        int i5 = i3 % 2;
        int i6 = this.f25828f;
        int i7 = i4 + 83;
        f25825m = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    @Override // o.ff.a
    public final short h() {
        int i2 = f25818c * 830906072;
        f25818c = i2;
        int i3 = f25817b * (-1866213130);
        f25817b = i3;
        int i4 = f25822j * 576093987;
        f25822j = i4;
        int i5 = 1873347322 * f25821g;
        f25821g = i5;
        return ((Short) e(i2, 542990114, i5, i3, new Object[]{this}, i4, -542990113)).shortValue();
    }

    public final int i() {
        int i2 = 2 % 2;
        int i3 = f25827o;
        int i4 = i3 + 115;
        f25825m = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        int i5 = this.f25830i;
        int i6 = i3 + 47;
        f25825m = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int j() {
        int i2 = 2 % 2;
        int i3 = f25827o + 91;
        int i4 = i3 % 128;
        f25825m = i4;
        int i5 = i3 % 2;
        int i6 = this.f25829h;
        int i7 = i4 + 109;
        f25827o = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        throw null;
    }
}
