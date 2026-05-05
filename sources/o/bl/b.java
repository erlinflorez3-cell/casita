package o.bl;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.a.m;
import o.ab.j;
import o.bg.c;
import o.cg.f;
import o.ef.a;
import o.m.i;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends o.ab.e<d> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: k */
    private static int f21349k = 0;

    /* JADX INFO: renamed from: l */
    private static int f21350l = 0;

    /* JADX INFO: renamed from: m */
    private static int f21351m = 0;

    /* JADX INFO: renamed from: n */
    private static char[] f21352n = null;

    /* JADX INFO: renamed from: o */
    private static int f21353o = 0;

    /* JADX INFO: renamed from: f */
    o.ad.d f21354f;

    /* JADX INFO: renamed from: g */
    o.bl.e f21355g;

    /* JADX INFO: renamed from: j */
    o.h.d f21356j;

    public interface d {
        void d();

        void d(c cVar);
    }

    static final class e extends j<b> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b */
        private static long f21357b = 0;

        /* JADX INFO: renamed from: c */
        public static int f21358c = 0;

        /* JADX INFO: renamed from: g */
        private static char f21359g = 0;

        /* JADX INFO: renamed from: h */
        private static int f21360h = 0;

        /* JADX INFO: renamed from: i */
        private static int f21361i = 0;

        /* JADX INFO: renamed from: j */
        private static int f21362j = 0;

        /* JADX INFO: renamed from: d */
        private final List<i> f21363d;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0022 -> B:17:0x0014). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$d(short r8, short r9, int r10) {
            /*
                byte[] r7 = o.bl.b.e.$$a
                int r6 = r9 * 2
                int r1 = r6 + 1
                int r0 = r10 * 4
                int r5 = 4 - r0
                int r4 = r8 + 65
                byte[] r3 = new byte[r1]
                r2 = 0
                if (r7 != 0) goto L27
                r0 = r4
                r4 = r6
                r1 = r2
            L14:
                int r5 = r5 + 1
                int r4 = r4 + r0
            L17:
                byte r0 = (byte) r4
                r3[r1] = r0
                if (r1 != r6) goto L22
                java.lang.String r0 = new java.lang.String
                r0.<init>(r3, r2)
                return r0
            L22:
                int r1 = r1 + 1
                r0 = r7[r5]
                goto L14
            L27:
                r1 = r2
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: o.bl.b.e.$$d(short, short, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f21358c = 350813395;
            f21362j = 0;
            f21360h = 1;
            f21357b = 740602047300126166L;
            f21361i = -1218618975;
            f21359g = (char) 17878;
        }

        e(b bVar) {
            super(bVar, true);
            this.f21363d = new ArrayList();
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static /* synthetic */ Object a(Object[] objArr) {
            e eVar = (e) objArr[0];
            int i2 = 2 % 2;
            int i3 = f21360h + 57;
            f21362j = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                ((b) eVar.e()).g().d();
                return null;
            }
            ((b) eVar.e()).g().d();
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Object b(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
            int i8 = i6 | i7;
            int i9 = ~i5;
            int i10 = (i8 + i9) - (i8 & i9);
            int i11 = ~i6;
            int i12 = (~i7) | i9;
            int i13 = ~i12;
            int i14 = (i13 + i11) - (i13 & i11);
            int i15 = (~((-1) - (((-1) - i7) & ((-1) - ((i9 + i11) - (i9 & i11)))))) | (~((i12 + i6) - (i12 & i6)));
            int i16 = i5 + i6 + i3 + (2053704882 * i4) + ((-167119771) * i2);
            int i17 = i16 * i16;
            int i18 = (((-385660469) * i5) - 1543503872) + (1501345335 * i6) + (1203980746 * i10) + (i14 * (-1203980746)) + ((-1203980746) * i15) + ((-1589641216) * i3) + (511705088 * i4) + ((-1639972864) * i2) + (1278279680 * i17);
            int i19 = ((i5 * (-1228230693)) - 288632672) + (i6 * (-1228230521)) + (i10 * (-86)) + (i14 * 86) + (i15 * 86) + (i3 * (-1228230607)) + (i4 * 927583762) + (i2 * (-1784727723)) + (i17 * 1163984896);
            return i18 + ((i19 * i19) * 992935936) != 1 ? a(objArr) : c(objArr);
        }

        private static /* synthetic */ Object c(Object[] objArr) {
            int i2 = 2 % 2;
            int i3 = f21362j;
            int i4 = i3 + 43;
            f21360h = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            int i5 = i3 + 113;
            f21360h = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }

        static void init$0() {
            $$a = new byte[]{68, -108, -67, 58};
            $$b = 88;
        }

        /* JADX WARN: Removed duplicated region for block: B:61:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void v(char r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, int r25, java.lang.Object[] r26) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 593
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.bl.b.e.v(char, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final f a(Context context) throws Throwable {
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            v((char) (61246 - ExpandableListView.getPackedPositionType(0L)), "湣興❿̉鼕\ud891崪ꓸ鰌蝧뙯칎셻쒼㌣ሌ濖\ud88b㘜", "\u0000\u0000\u0000\u0000", "福戕㹢⫯", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1650595193, objArr);
            o.cg.b bVar = new o.cg.b(context, 4, ((String) objArr[0]).intern());
            bVar.d(((b) e()).f21354f);
            bVar.c(((b) e()).f21356j);
            int i3 = f21360h + 85;
            f21362j = i3 % 128;
            int i4 = i3 % 2;
            return bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void a(a aVar) throws o.ef.b {
            int i2 = 2 % 2;
            if (((b) e()).f21354f.a() != null) {
                this.f21363d.add(((b) e()).f21354f.a());
                int i3 = f21362j + 97;
                f21360h = i3 % 128;
                int i4 = i3 % 2;
            }
            if (((b) e()).f21356j != null) {
                int i5 = f21360h + 65;
                f21362j = i5 % 128;
                int i6 = i5 % 2;
                this.f21363d.add(((b) e()).f21356j.b());
            }
            int i7 = f21360h + 93;
            f21362j = i7 % 128;
            int i8 = i7 % 2;
        }

        @Override // o.ab.j
        public final o.bg.a b(int i2) throws Throwable {
            int i3 = 2 % 2;
            if (i2 != 2052) {
                return super.b(i2);
            }
            if (o.ea.f.a()) {
                int i4 = f21362j + 11;
                f21360h = i4 % 128;
                int i5 = i4 % 2;
                String strD = d();
                Object[] objArr = new Object[1];
                v((char) (36838 - TextUtils.lastIndexOf("", '0', 0)), "펔쌃ሎ덱첶ⱊḆ댾\ueb2b\ue34d⚇ꣷ欗㧇饝ཏ陜\ueae8䨍鴋횺Ȗ\ue16d\ue0d3\ueed2ﲽ❄蔔Ჴ\u1f17䫼慞⯭뇧\udb2c磵߾謃켱惠昬꛵뇲噥虬藓\ue749敟琢⦜䑔훑ﺪ㴴塚䥌沝\ue950ಿ덙Ꟗ挏ࢋ⨩归\uf804ꨘ騏掘\uf1c1驪㡗嗬\udc12\uef51鵱燧\u0bfc역╿빰ీ浙骕鰧\uf48bἄ\uf22e喞묡\uf858妻밚\ue329섁思ꞶࠆỘ뼋䀔䌏ᵁꢪ\uec3c瞱", "\u0000\u0000\u0000\u0000", "\uf564ꕕ\ue717꺏", TextUtils.indexOf("", ""), objArr);
                o.ea.f.c(strD, ((String) objArr[0]).intern());
            }
            o.bg.a aVar = o.bg.a.ai;
            int i6 = f21362j + 81;
            f21360h = i6 % 128;
            int i7 = i6 % 2;
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void b(c cVar) {
            int i2 = 2 % 2;
            int i3 = f21360h + 71;
            f21362j = i3 % 128;
            int i4 = i3 % 2;
            ((b) e()).g().d(cVar);
            int i5 = f21360h + 123;
            f21362j = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // o.ab.c
        public final void c(c cVar) {
            int iMyTid = Process.myTid();
            b(new Object[]{this, cVar}, Process.myUid(), Process.myUid(), Thread.activeCount(), 790328749, -790328749, iMyTid);
        }

        @Override // o.ab.j
        public final o.cg.j k() {
            int i2 = 2 % 2;
            int i3 = f21362j + 41;
            f21360h = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final a m() throws o.ef.b {
            Iterator it;
            int i2 = 2 % 2;
            a aVar = new a();
            a aVarE = ((b) e()).f21355g.e();
            if (aVarE != null) {
                int i3 = f21360h + 115;
                f21362j = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = a.f23769c * (-1989011043);
                    a.f23769c = i4;
                    int i5 = a.f23776j * 720337855;
                    a.f23776j = i5;
                    int i6 = a.f23775i * 253749855;
                    a.f23775i = i6;
                    int i7 = a.f23774h * 1380085454;
                    a.f23774h = i7;
                    it = (Iterator) a.a(1890943914, new Object[]{aVarE}, i6, i7, -1890943912, i4, i5);
                    int i8 = 60 / 0;
                } else {
                    int i9 = a.f23769c * (-1989011043);
                    a.f23769c = i9;
                    int i10 = a.f23776j * 720337855;
                    a.f23776j = i10;
                    int i11 = a.f23775i * 253749855;
                    a.f23775i = i11;
                    int i12 = a.f23774h * 1380085454;
                    a.f23774h = i12;
                    it = (Iterator) a.a(1890943914, new Object[]{aVarE}, i11, i12, -1890943912, i9, i10);
                }
                while (it.hasNext()) {
                    String str = (String) it.next();
                    aVar.a(str, aVarE.a(str));
                }
            }
            int i13 = f21362j + 83;
            f21360h = i13 % 128;
            int i14 = i13 % 2;
            return aVar;
        }

        @Override // o.ab.j
        public final String o() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f21362j + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f21360h = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            v((char) (ViewConfiguration.getLongPressTimeout() >> 16), "齋\ued0fꢐ禖쎾영쐵諰鯌㝉⋸됝", "\u0000\u0000\u0000\u0000", "ꪙ邧\uf650팰", ExpandableListView.getPackedPositionType(0L), objArr);
            String strIntern = ((String) objArr[0]).intern();
            int i5 = f21360h + 51;
            f21362j = i5 % 128;
            if (i5 % 2 == 0) {
                return strIntern;
            }
            throw null;
        }

        @Override // o.ab.j
        public final byte[][] p() {
            int id = (int) Thread.currentThread().getId();
            int iMyTid = Process.myTid();
            int iMyUid = Process.myUid();
            int i2 = f21358c * (-1208571989);
            f21358c = i2;
            return (byte[][]) b(new Object[]{this}, i2, iMyTid, iMyUid, 2066758218, -2066758217, id);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
        @Override // o.ab.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void q() {
            /*
                r8 = this;
                r2 = 2
                int r0 = r2 % r2
                int r0 = o.bl.b.e.f21360h
                int r1 = r0 + 75
                int r0 = r1 % 128
                o.bl.b.e.f21362j = r0
                int r1 = r1 % r2
                if (r1 == 0) goto L64
                java.util.List<o.m.i> r0 = r8.f21363d
                boolean r1 = r0.isEmpty()
                r0 = 76
                int r0 = r0 / 0
                if (r1 == 0) goto L6c
            L1a:
                o.ab.e r2 = r8.e()
                o.bl.b r2 = (o.bl.b) r2
                o.ab.e r0 = r8.e()
                o.bl.b r0 = (o.bl.b) r0
                o.bl.e r1 = r0.f21355g
                o.ab.e r0 = r8.e()
                o.bl.b r0 = (o.bl.b) r0
                o.bg.c r0 = r0.d()
                o.bg.c r0 = r1.a(r0)
                java.lang.Object[] r2 = new java.lang.Object[]{r2, r0}
                int r1 = o.ab.e.f20097e
                r0 = -1744555904(0xffffffff98043080, float:-1.7085086E-24)
                int r1 = r1 * r0
                o.ab.e.f20097e = r1
                int r4 = o.ab.e.f20093a
                r0 = -218124776(0xfffffffff2ffae18, float:-1.01285304E31)
                int r4 = r4 * r0
                o.ab.e.f20093a = r4
                int r3 = o.ab.e.f20098h
                r0 = 961571546(0x39506ada, float:1.9876231E-4)
                int r3 = r3 * r0
                o.ab.e.f20098h = r3
                int r5 = o.ab.e.f20099i
                r0 = 254319963(0xf289d5b, float:8.313345E-30)
                int r5 = r5 * r0
                o.ab.e.f20099i = r5
                r7 = 1028009024(0x3d462c40, float:0.048382044)
                r6 = -1028009023(0xffffffffc2b9d3c1, float:-92.91358)
                o.ab.e.e(r1, r2, r3, r4, r5, r6, r7)
                return
            L64:
                java.util.List<o.m.i> r0 = r8.f21363d
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L1a
            L6c:
                int r0 = o.bl.b.e.f21362j
                int r1 = r0 + 107
                int r0 = r1 % 128
                o.bl.b.e.f21360h = r0
                int r1 = r1 % r2
                o.bg.c r0 = r8.f()
                o.bg.b r1 = r0.e()
                java.util.List<o.m.i> r0 = r8.f21363d
                r1.c(r0)
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: o.bl.b.e.q():void");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:17:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(int r9, int r10, byte r11) {
        /*
            int r0 = r10 * 4
            int r8 = 120 - r0
            int r2 = r11 * 4
            int r1 = 1 - r2
            byte[] r7 = o.bl.b.$$d
            int r0 = r9 * 3
            int r6 = 4 - r0
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r7 != 0) goto L2f
            r2 = r6
            r0 = r3
            r1 = r4
        L18:
            int r6 = r6 + r0
            int r0 = r2 + 1
            r8 = r6
            r6 = r0
        L1d:
            byte r0 = (byte) r8
            r5[r1] = r0
            if (r1 != r3) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L28:
            r0 = r7[r6]
            int r1 = r1 + 1
            r2 = r6
            r6 = r8
            goto L18
        L2f:
            r1 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bl.b.$$j(int, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21353o = 0;
        f21350l = 1;
        f21349k = 0;
        f21351m = 1;
        o();
        int i2 = f21353o + 39;
        f21350l = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 19 / 0;
        }
    }

    public b(Context context, d dVar, o.en.b bVar) {
        super(context, dVar, bVar, o.bg.e.f21117o);
    }

    static void init$0() {
        $$d = new byte[]{121, -71, 80, 66};
        $$e = 24;
    }

    private e n() {
        int i2 = 2 % 2;
        e eVar = new e(this);
        int i3 = f21351m + 27;
        f21349k = i3 % 128;
        int i4 = i3 % 2;
        return eVar;
    }

    static void o() {
        f21352n = new char[]{56496, 56550, 56559, 56539, 56540, 56564, 56563, 56561, 56558, 56553, 56555, 56537, 56539, 56564, 56558, 56550, 56553, 56561, 56558, 56550, 56546, 56554, 56558, 56556, 56558, 56536, 56538, 56555, 56548, 56548, 56553, 56561, 56558, 56490, 56546, 56554, 56546, 56554, 56556, 56532, 56537, 56558, 56554, 56551, 56552, 56533, 56537, 56558, 56557, 56551, 56551, 56553, 56503, 56537, 56532, 56556, 56554, 56546, 56554, 56562, 56558, 56552, 56551, 56554};
    }

    private static void q(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        int i2;
        int length;
        char[] cArr;
        String str2 = str;
        int i3 = 2 % 2;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        m mVar = new m();
        int i4 = 0;
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr2 = f21352n;
        if (cArr2 != null) {
            int i9 = $10 + 115;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i10])};
                    Object objA = o.d.d.a(-2071388435);
                    if (objA == null) {
                        byte b2 = (byte) i4;
                        byte b3 = (byte) (b2 + 1);
                        objA = o.d.d.a(MotionEvent.axisFromString("") + 250, (char) Color.red(i4), (ViewConfiguration.getWindowTouchSlop() >> 8) + 11, 1376582792, false, $$j(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i10++;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr2, i5, cArr3, 0, i6);
        if (bArr != null) {
            char[] cArr4 = new char[i6];
            mVar.f19943d = 0;
            char c2 = 0;
            while (mVar.f19943d < i6) {
                int i11 = $11 + 123;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                if (bArr[mVar.f19943d] == 1) {
                    int i13 = mVar.f19943d;
                    Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(120026474);
                    if (objA2 == null) {
                        objA2 = o.d.d.a(12 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10, -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    int i14 = $10 + 15;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                } else {
                    int i16 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA3 = o.d.d.a(1632715197);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA3 = o.d.d.a(View.combineMeasuredStates(0, 0) + 836, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 27278), 10 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -1210801192, false, $$j(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i16] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr5 = {mVar, mVar};
                Object objA4 = o.d.d.a(-1041906996);
                if (objA4 == null) {
                    objA4 = o.d.d.a(21 - KeyEvent.keyCodeFromString(""), (char) (35715 - (ViewConfiguration.getFadingEdgeLength() >> 16)), TextUtils.lastIndexOf("", '0', 0) + 12, 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            char[] cArr5 = new char[i6];
            i2 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i17 = i6 - i8;
            System.arraycopy(cArr5, 0, cArr3, i17, i8);
            System.arraycopy(cArr5, i8, cArr3, 0, i17);
        } else {
            i2 = 0;
        }
        if (z2) {
            char[] cArr6 = new char[i6];
            while (true) {
                mVar.f19943d = i2;
                if (mVar.f19943d >= i6) {
                    break;
                }
                int i18 = $11 + 91;
                $10 = i18 % 128;
                int i19 = i18 % 2;
                cArr6[mVar.f19943d] = cArr3[(i6 - mVar.f19943d) - 1];
                i2 = mVar.f19943d + 1;
            }
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            int i20 = 0;
            while (true) {
                mVar.f19943d = i20;
                if (mVar.f19943d >= i6) {
                    break;
                }
                cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                i20 = mVar.f19943d + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c4, code lost:
    
        if (r15.f21354f.o() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c6, code lost:
    
        a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d0, code lost:
    
        if (r15.f21354f.o() == false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(o.i.d r16, o.h.d r17, o.bl.e r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bl.b.a(o.i.d, o.h.d, o.bl.e):void");
    }

    @Override // o.ab.e
    public final /* synthetic */ o.ab.c c() {
        int i2 = 2 % 2;
        int i3 = f21351m + 13;
        f21349k = i3 % 128;
        int i4 = i3 % 2;
        e eVarN = n();
        if (i4 != 0) {
            int i5 = 91 / 0;
        }
        return eVarN;
    }

    @Override // o.ab.e
    public final String e() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f21351m + 117;
        f21349k = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = new Object[1];
            q("\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000", new int[]{33, 19, 0, 0}, false, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            q("\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000", new int[]{33, 19, 0, 0}, false, objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        int i4 = f21349k + 107;
        f21351m = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }
}
