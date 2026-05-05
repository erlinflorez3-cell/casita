package o.by;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import fr.antelop.sdk.WalletLockReason;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class g {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static char[] D = null;
    private static int E = 0;
    private static int F = 0;
    private static int G = 0;
    private static long H = 0;
    private static int I = 0;
    public static int J = 0;

    /* JADX INFO: renamed from: a */
    public static int f21850a = 0;

    /* JADX INFO: renamed from: b */
    public static int f21851b = 0;

    /* JADX INFO: renamed from: c */
    public static int f21852c = 0;

    /* JADX INFO: renamed from: d */
    public static int f21853d = 0;

    /* JADX INFO: renamed from: e */
    public static int f21854e = 0;

    /* JADX INFO: renamed from: f */
    public static int f21855f = 0;

    /* JADX INFO: renamed from: g */
    public static int f21856g = 0;

    /* JADX INFO: renamed from: h */
    public static int f21857h = 0;

    /* JADX INFO: renamed from: i */
    public static int f21858i = 0;

    /* JADX INFO: renamed from: j */
    public static int f21859j = 0;

    /* JADX INFO: renamed from: o */
    public static int f21860o = 0;
    private String A;

    /* JADX INFO: renamed from: k */
    private boolean f21861k;

    /* JADX INFO: renamed from: l */
    private boolean f21862l;

    /* JADX INFO: renamed from: m */
    private boolean f21863m;

    /* JADX INFO: renamed from: n */
    private boolean f21864n;

    /* JADX INFO: renamed from: p */
    private boolean f21865p;

    /* JADX INFO: renamed from: q */
    private boolean f21866q;

    /* JADX INFO: renamed from: r */
    private boolean f21867r;

    /* JADX INFO: renamed from: s */
    private WalletLockReason f21868s;

    /* JADX INFO: renamed from: t */
    private boolean f21869t;

    /* JADX INFO: renamed from: v */
    private boolean f21871v;

    /* JADX INFO: renamed from: w */
    private boolean f21872w;

    /* JADX INFO: renamed from: y */
    private Date f21874y;

    /* JADX INFO: renamed from: z */
    private String f21875z;

    /* JADX INFO: renamed from: x */
    private final List<o.eq.b> f21873x = new ArrayList();

    /* JADX INFO: renamed from: u */
    private final List<o.dq.c> f21870u = new ArrayList();
    private final List<o.dd.e> C = new ArrayList();
    private final List<o.fj.d> B = new LinkedList();

    /* JADX INFO: renamed from: o.by.g$2 */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f21876b;

        /* JADX INFO: renamed from: c */
        private static int f21877c = 1;

        /* JADX INFO: renamed from: d */
        private static int f21878d = 0;

        static {
            int[] iArr = new int[o.fj.a.values().length];
            f21876b = iArr;
            try {
                iArr[o.fj.a.f25883a.ordinal()] = 1;
                int i2 = f21877c + 61;
                f21878d = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21876b[o.fj.a.f25886d.ordinal()] = 2;
                int i5 = f21878d;
                int i6 = ((i5 + 69) - (69 | i5)) + ((-1) - (((-1) - i5) & ((-1) - 69)));
                f21877c = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21876b[o.fj.a.f25887e.ordinal()] = 3;
                int i8 = f21877c + 91;
                f21878d = i8 % 128;
                int i9 = i8 % 2;
                int i10 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21876b[o.fj.a.f25885c.ordinal()] = 4;
                int i11 = f21877c;
                int i12 = (i11 & 125) + ((i11 + 125) - (i11 & 125));
                f21878d = i12 % 128;
                int i13 = i12 % 2;
                int i14 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21876b[o.fj.a.f25884b.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21876b[o.fj.a.f25890h.ordinal()] = 6;
                int i15 = f21877c + 99;
                f21878d = i15 % 128;
                int i16 = i15 % 2;
                int i17 = 2 % 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21876b[o.fj.a.f25891i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21876b[o.fj.a.f25892j.ordinal()] = 8;
                int i18 = f21877c;
                int i19 = (i18 & 7) + (7 | i18);
                f21878d = i19 % 128;
                if (i19 % 2 != 0) {
                    int i20 = 3 / 5;
                } else {
                    int i21 = 2 % 2;
                }
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21876b[o.fj.a.f25888f.ordinal()] = 9;
                int i22 = f21878d + 71;
                f21877c = i22 % 128;
                int i23 = i22 % 2;
                int i24 = 2 % 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21876b[o.fj.a.f25889g.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(short r8, short r9, byte r10) {
        /*
            int r0 = r8 * 4
            int r8 = r0 + 4
            byte[] r7 = o.by.g.$$c
            int r6 = 105 - r9
            int r1 = r10 * 4
            int r0 = 1 - r1
            byte[] r5 = new byte[r0]
            r4 = 0
            int r3 = 0 - r1
            if (r7 != 0) goto L29
            r2 = r4
            r1 = r8
        L15:
            int r8 = r8 + 1
            int r6 = r6 + r1
        L18:
            r1 = r6
            byte r0 = (byte) r1
            r5[r2] = r0
            if (r2 != r3) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L24:
            r6 = r7[r8]
            int r2 = r2 + 1
            goto L15
        L29:
            r2 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.by.g.$$g(short, short, byte):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        J = -998580521;
        init$0();
        f21860o = 1211596317;
        f21856g = 652651326;
        f21859j = -1206334570;
        f21858i = -1705272834;
        f21855f = 375222246;
        f21857h = -1935405309;
        f21851b = -1926950407;
        f21854e = -1912927840;
        f21852c = -1043899580;
        f21853d = -804893566;
        f21850a = 13137564;
        I = 0;
        E = 1;
        G = 0;
        F = 1;
        h();
        View.MeasureSpec.getMode(0);
        TextUtils.getOffsetAfter("", 0);
        ViewConfiguration.getLongPressTimeout();
        int i2 = I + 115;
        E = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void K(char r22, int r23, int r24, java.lang.Object[] r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.by.g.K(char, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void L(int r8, byte r9, byte r10, java.lang.Object[] r11) {
        /*
            int r8 = 101 - r8
            int r0 = r9 * 4
            int r0 = 3 - r0
            byte[] r7 = o.by.g.$$a
            int r6 = r10 * 4
            int r1 = r6 + 1
            byte[] r5 = new byte[r1]
            r4 = 0
            if (r7 != 0) goto L2b
            r1 = r0
            r3 = r4
        L13:
            int r0 = -r0
            int r8 = r8 + r0
            r0 = r1
            r2 = r3
        L17:
            int r1 = r0 + 1
            byte r0 = (byte) r8
            r5[r2] = r0
            int r3 = r2 + 1
            if (r2 != r6) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r11[r4] = r0
            return
        L28:
            r0 = r7[r1]
            goto L13
        L2b:
            r2 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.by.g.L(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002b -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void M(byte r8, byte r9, byte r10, java.lang.Object[] r11) {
        /*
            int r0 = r8 * 7
            int r8 = 10 - r0
            int r0 = r9 * 10
            int r7 = 111 - r0
            int r6 = r10 * 7
            int r0 = r6 + 1
            byte[] r5 = o.by.g.$$d
            byte[] r4 = new byte[r0]
            r3 = 0
            if (r5 != 0) goto L2e
            r0 = r6
            r2 = r3
        L15:
            int r0 = -r0
            int r7 = r7 + r0
            int r7 = r7 + (-6)
            r1 = r2
        L1a:
            int r8 = r8 + 1
            byte r0 = (byte) r7
            r4[r1] = r0
            int r2 = r1 + 1
            if (r1 != r6) goto L2b
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r11[r3] = r0
            return
        L2b:
            r0 = r5[r8]
            goto L15
        L2e:
            r1 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.by.g.M(byte, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object a(java.lang.Object[] r8) throws java.lang.Throwable {
        /*
            r7 = 0
            r4 = r8[r7]
            o.by.g r4 = (o.by.g) r4
            r8 = 2
            int r0 = r8 % r8
            int r0 = o.by.g.G
            int r1 = r0 + 31
            int r0 = r1 % 128
            o.by.g.F = r0
            int r1 = r1 % r8
            r3 = 1
            if (r1 != 0) goto L76
            boolean r1 = o.ea.f.a()
            r0 = 4
            int r0 = r0 / r7
            if (r1 == 0) goto L72
        L1c:
            int r0 = android.view.Gravity.getAbsoluteGravity(r7, r7)
            char r5 = (char) r0
            r1 = 0
            float r0 = android.graphics.PointF.length(r1, r1)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            int r0 = android.view.ViewConfiguration.getScrollBarSize()
            int r0 = r0 >> 8
            int r1 = 22 - r0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            K(r5, r2, r1, r0)
            r0 = r0[r7]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r6 = r0.intern()
            int r0 = android.graphics.Color.alpha(r7)
            int r0 = r0 + 25000
            char r5 = (char) r0
            java.lang.String r0 = ""
            int r0 = android.text.TextUtils.indexOf(r0, r0)
            int r2 = r0 + 817
            int r0 = android.view.ViewConfiguration.getKeyRepeatDelay()
            int r0 = r0 >> 16
            int r1 = 21 - r0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            K(r5, r2, r1, r0)
            r0 = r0[r7]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            o.ea.f.c(r6, r0)
            int r0 = o.by.g.F
            int r1 = r0 + 7
            int r0 = r1 % 128
            o.by.g.G = r0
            int r1 = r1 % r8
            if (r1 == 0) goto L72
            r0 = 4
            int r0 = r0 / 3
        L72:
            r4.f21867r = r3
            r0 = 0
            return r0
        L76:
            boolean r0 = o.ea.f.a()
            if (r0 == 0) goto L72
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.by.g.a(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        g gVar = (g) objArr[0];
        int i2 = 2 % 2;
        int i3 = F + 121;
        G = i3 % 128;
        int i4 = i3 % 2;
        List<o.dd.e> list = gVar.C;
        if (i4 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object d(Object[] objArr) throws Throwable {
        g gVar = (g) objArr[0];
        int i2 = 2 % 2;
        int i3 = F + 125;
        G = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            o.ea.f.a();
            obj.hashCode();
            throw null;
        }
        if (o.ea.f.a()) {
            Object[] objArr2 = new Object[1];
            K((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            K((char) (KeyEvent.getMaxKeyCode() >> 16), KeyEvent.keyCodeFromString("") + 769, View.MeasureSpec.getSize(0) + 23, objArr3);
            o.ea.f.c(strIntern, ((String) objArr3[0]).intern());
        }
        gVar.f21862l = true;
        int i4 = G + 93;
        F = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static List<o.fj.d> d(List<o.fj.d> list) {
        int i2 = 2 % 2;
        LinkedList linkedList = new LinkedList(new LinkedHashSet(list));
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            int i3 = F + 3;
            G = i3 % 128;
            if (i3 % 2 != 0) {
                ((o.fj.d) it.next()).a();
                o.fj.a aVar = o.fj.a.f25887e;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            o.fj.d dVar = (o.fj.d) it.next();
            if (dVar.a() == o.fj.a.f25887e || dVar.a() == o.fj.a.f25884b || dVar.a() == o.fj.a.f25885c || dVar.a() == o.fj.a.f25888f) {
                arrayList.add(dVar.c());
            }
        }
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            int i4 = G + 71;
            F = i4 % 128;
            int i5 = i4 % 2;
            o.fj.d dVar2 = (o.fj.d) it2.next();
            if (dVar2.a() == o.fj.a.f25891i && arrayList.contains(dVar2.c())) {
                int i6 = G + 21;
                F = i6 % 128;
                int i7 = i6 % 2;
                it2.remove();
            }
        }
        return linkedList;
    }

    private static /* synthetic */ Object e(Object[] objArr) throws Throwable {
        g gVar = (g) objArr[0];
        int i2 = 2 % 2;
        int i3 = G + 85;
        F = i3 % 128;
        if (i3 % 2 == 0) {
            o.ea.f.a();
            throw null;
        }
        if (o.ea.f.a()) {
            int i4 = F + 13;
            G = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr2 = new Object[1];
            K((char) (ViewConfiguration.getEdgeSlop() >> 16), KeyEvent.getMaxKeyCode() >> 16, (-16777194) - Color.rgb(0, 0, 0), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            K((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 23737), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 792, 25 - (ViewConfiguration.getEdgeSlop() >> 16), objArr3);
            o.ea.f.c(strIntern, ((String) objArr3[0]).intern());
        }
        gVar.f21863m = true;
        return null;
    }

    public static /* synthetic */ Object e(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~(i6 | i5);
        int i9 = (i7 + i8) - (i7 & i8);
        int i10 = ~(i5 | (~i7));
        int i11 = (i10 + i6) - (i10 & i6);
        int i12 = i6 + i7 + i2 + ((-1932811043) * i3) + (1521317780 * i4);
        int i13 = i12 * i12;
        int i14 = ((i6 * (-919556932)) - 154402816) + ((-919556932) * i7) + ((-1121407813) * i8) + (i9 * 1121407813) + (1121407813 * i11) + (201850880 * i2) + ((-2098724864) * i3) + ((-1398800384) * i4) + ((-1444151296) * i13);
        int i15 = (i6 * 1794637580) + 2133191799 + (i7 * 1794637580) + (i8 * (-161)) + (i9 * 161) + (i11 * 161) + (i2 * 1794637741) + (i3 * (-1844343719)) + (i4 * (-1188939004)) + (i13 * (-394526720));
        int i16 = i14 + (i15 * i15 * 821297152);
        return i16 != 1 ? i16 != 2 ? i16 != 3 ? a(objArr) : e(objArr) : b(objArr) : d(objArr);
    }

    static void h() {
        char[] cArr = new char[1185];
        ByteBuffer.wrap("\u0094½$ õÓ\u0085fV\u001bç¬·W@ó\u0011\u008c¡\u0005rÐ\u0002aÓ\u0004l¼<|Íé\u009eµ.Yÿå\u0088\u0080X?éÊ¬N\u001cêÍ\u0017½»nÕßu\u008f\u0084x\u0011)\\\u0099íJ\u0000:¸ëÑ\u0094\u0086$\"õß\u0085sV\u001dç½·L@Ù\u0011\u0094¡%rÈ\u0002pÓ\u0019lè<\u0003Í¬\u009e¼._ÿâ\u0088\u009dX<éÁ¹>J\u0013\u001b¬«wdç5\u0088Å&\u0096Í&z÷(\u0080×P|á\u0013² B_\u0013ü\u0094\u0086$\"õß\u0085sV\u001dç½·L@Ù\u0011\u0094¡%rÈ\u0002pÓ\u0019lè<\u0003Í¬\u009e¼._ÿâ\u0088\u009dX<éÁ¹>J\u0013\u001b¬«wdç5\u0088Å&\u0096Í&z÷ \u0080ÝPsá\u001d²±B^\u0013¸¬Ó||\rÐÝen\u0007?·ÏE\u0098æ)Îùv\u008a²÷\u0095G1\u0096Ìæ`5\u000e\u0084®Ô_#Êr\u0087Â6\u0011Ûac°\n\u000fû_\u0010®¿ý¯ML\u009cñë\u008e;/\u008aÒÚ-)\u0000x¿Èd\u0007ôV\u009b¦5õÞEi\u0094*ãÏ3o\u0082\nÑ¤!BpîÏ\u0089£ô\u0013PÂ\u00ad²\u0001aoÐÏ\u0080>w«&æ\u0096WEº5\u0002äk[\u009a\u000bqúÞ©Î\u0019-È\u0090¿ïoNÞ³\u008eL}a,Þ\u009c\u0005S\u0095\u0002úòT¡¿\u0011\bÀR·¯g\u0005Ök\u0085Óu<\u0082-2\u0089ãt\u0093Ø@¶ñ\u0016¡çVr\u0007?·\u008edc\u0014ÛÅ²zC*¨Û\u0007\u0088\u00178ôéI\u009e6N\u0097ÿj¯\u0095\\¸\r\u0007½ÜrL##Ó\u008d\u0080f0Ñá\u0097\u0096kFÔ÷¹¤\nTò\u0005Gº&j¢\u001byËÏx¬)\u001bÙä\u008eG\u0094\u0086$\"õß\u0085sV\u001dç½·L@Ù\u0011\u0094¡%rÈ\u0002pÓ\u0019lè<\u0003Í¬\u009e¼._ÿâ\u0088\u009dX<éÁ¹>J\u0013\u001b¬«cdó5\u0097Å>\u0096Ç&c÷\t\u0080ÀPSá\u0004²±B^\u0013ý¬\u0090|(\rËÝan\n?·Ïx\u0098í)\u009dù)\u008aæ\u0094\u0086$\"õß\u0085sV\u001dç½·L@Ù\u0011\u0094¡%rÈ\u0002pÓ\u0019lè<\u0003Í¬\u009e¼._ÿâ\u0088\u009dX<éÁ¹>J\u0013\u001b¬«ddã5\u0092Å#\u0096Ë&k÷)\u0080ÞPyá\u0011²½BX\u0013ñ¬\u0092|5\rÖÝyn*?«ÏY\u0098ü\u0094\u0086$\"õß\u0085sV\u001dç½·L@Ù\u0011\u0094¡%rÈ\u0002pÓ\u0019lè<\u0003Í¬\u009e¼._ÿâ\u0088\u009dX<éÁ¹>J\u0013\u001b¬«adö5\u0094Å\u0019\u0096Ý&`÷\u001f\u0080×Pdá%²·BR\u0013ý¬\u009a|)\rÎÝen\u0002?äÏ\u0007\u0098¨)\u008aù-\u008aæ[\u0095ëv¤\u008et:Ö\u0006f¢·_Çó\u0014\u009d¥=õÌ\u0002YS\u0014ã¥0H@ð\u0091\u0099.h~\u0083\u008f,Ü<lß½bÊ\u001d\u001a¼«Aû¾\b\u0093Y,é÷&gw\b\u0087¦ÔMdúµ¿ÂW\u0012ä£\u0082ð=\u0000ÔQ\u007fî+>¬OF\u009fá,\u0092}!\u008dÎ\u0094\u0086$\"õß\u0085sV\u001dç½·L@Ù\u0011\u0094¡%rÈ\u0002pÓ\u0019lè<\u0003Í¬\u009e¼._ÿâ\u0088\u009dX<éÁ¹>J\u0013\u001b¬«cdç5\u0096Å.\u0096Û&[÷\u001c\u0080ÖPqá\u0002²±B^\u0002¤²\u0000cý\u0013QÀ?q\u009f!nÖû\u0087¶7\u0007äê\u0094RE;úÊª![\u008e\b\u009e¸}iÀ\u001e¿Î\u001e\u007fã/\u001cÜ1\u008d\u008e=AòË£³S\u0006\u0000þ°Ia<\u0016ãÆgw$$\u0092Ôy\u0085Î:¹ê\u001a\u0094\u0086$\"õß\u0085sV\u001dç½·L@Ù\u0011\u0094¡%rÈ\u0002pÓ\u0019lè<\u0003Í¬\u009e¼._ÿâ\u0088\u009dX<éÁ¹>J\u0013\u001b¬«edë5\u0092Å\u000b\u0096Ø&~÷\u0000\u0080ÛPsá\u0017² BS\u0013÷¬\u0090|\u001f\rÐÝen\u0002?¡ÏD\u0098ü)\u0087ù-\u008aþ[\u0083ë\u0003¤Ät~\u0005\u0019ÖªfY7æ\u0094\u0086$\"õß\u0085sV\u001dç½·L@Ù\u0011\u0094¡%rÈ\u0002pÓ\u0019lè<\u0003Í¬\u009e¼._ÿâ\u0088\u009dX<éÁ¹>J\u0013\u001b¬«edë5\u0092Å\u000b\u0096Ø&~÷\u0000\u0080ÛPsá\u0017² BS\u0013÷¬\u0090|\u001d\rÁÝtn\u000f?²ÏK\u0098ü)\u0087ù#\u008aü[¢ë3¤Åto\u0005\u0011Ö¬fY7æÀÀ\u0090 !Ëñx\u0082HS«ãA¼\u0004Mð\u001dW®ä\u007f\u008a\u000fxØ\u0084h<j¸Ú\u001c\u000bá{M¨#\u0019\u0083Ir¾çïª_\u001b\u008cöüN-'\u0092ÖÂ=3\u0092`\u0082Ða\u0001Üv£¦\u0002\u0017ÿG\u0000´!å\u009dUl\u009aÜË\u008f;\u0004hòØQ\t&~é®g\u001f&L\u008c¼kíÕRàïå_A\u008e¼þ\u0010-~\u009cÞÌ/;ºj÷ÚF\t«y\u0013¨z\u0017\u008bG`¶ÏåßU<\u0084\u0081óþ#_\u0092¢Â]1p`ÏÐ\u0017\u001f\u0097Næ¾Gí¸]\f\u008clû¥+\u001a\u009azÉÙ9*h®×í\u0007[v ¦\u0017\u0015`DÃÓûcX²¥Â\u001a\u0011{ Æð\n\u0007\u009eVñæS5¨E\r\u0094j+Ü{\u001c\u008a\u009bÙÑi6¸\u0085Ïö\u001fY®÷þPÃ,s\u008f¢rÒÍ\u0001¬°\u0011àÍ\u0017MF ö\u0094%eUá\u0084ª;\u001ckÿ\u009aHÉ\u0007yä¨\u000eßm\u0094\u009c$?õÂ\u0085}V\u001cç¡·}@ó\u0011\u0097¡.rÒ\u0002aÓ\u0018l»<{Íü\u009e¶.Qÿâ\u0088\u0091X>é\u0090¹7È$x\u0087©zÙÅ\n¤»\u0019ëÖ\u001cEM#ý\u0095.{^Ò\u008f¦0;`ó\u0091MÂ\u0019rÝ£^Ô(\u0004\u0083µtåÃ\u0016ìGSõ4E\u0097\u0094jäÕ7´\u0086\tÖÁ!Up&À\u0084\u0013kcØ²\u0086\r\u0005]ê¬Aÿ\u000eOý\u009eZét9Û\u0094\u0081$5õÂ\u0085XV\u0015ç»·U@Î\u0011\u0087¡!rÕ\u0002kÓ\u0004l\u009c<AÍÂ\u009e½.Dÿÿ\u0088\u0092X#é\u0090¹7J\\\u001bï«\u0000¶\r\u0006®×S§ìt\u008dÅ0\u0095øbl3\u001f\u0083½PR áñ®N7\u001eÓïr¼ \fÊÝbª\u0001zãË\u0000þùNZ\u009f§ï\u0018<y\u008dÄÝ\f*\u0098{ëËI\u0018¦h\u0015¹C\u0006ÂV,§\u0086ôÂD!\u0095Ûâ¸\u0094\u009c$?õÂ\u0085}V\u001cç¡·n@î\u0011\u008d¡$rÓ\u0002gÓ\u001el\u009d<^Íè\u009e³.Dÿó\u0088\u0090Xré\u0091\u0094\u0081$5õÂ\u0085GV\u000fç¶·M@ù\u0011\u0096¡\u0004rÇ\u0002pÓ\u000fl\u009c<AÍÂ\u009e½.Dÿÿ\u0088\u0092X#é\u0090¹7J\\\u001bï«\u00002²\u0082\u001fSó#Gð4A\u0090\u0011{æ\u0093·¬\u0007\u0012Ô©¤vu2Ê\u009a\u009a{kÈ8\u009e\u0088RYÛ.ºþ\u0018Oò\u0094\u0097$<õ×\u0085dV\tç½·Z@Î\u0011\u0087¡!rÊ\u0002pÓ\u0003l¥<KkôÛ]\n¬z\u0019©8\u0018ØH3¿\u009eîé^\u0002\u008d\u0099ý\u0011,u\u0093ÐÃ'2\u008d\u0094\u009b$4õÓ\u0085zV\u000eç±·J@å\u0011ª¡!rÕ\u0002lÓ)l§<JÍé&ü\u0096QG½7\täzUÞ\u00055òÝ£ì\u0013_À¹°EaDÞÄ\u008e5\u007f\u008a,Ë\u009c6M\u008d:âêa[¿\u000b\u0003øv©Ì\u0019+\u0094\u0091$%õÄ\u0085fV\u001fç¶·J@Ý\u0011\u0092¡0rÊ\u0002mÓ\tl©<ZÍå\u009e½.^Ê\u008fz,«ÑÛn\b\u000f¹²én\u001eýO\u0094ÿ7,Ð\\y\u008d\r2²b\\\u0093óÀ²pq¡àÖ\u0094\u0006,·ßç%\u0014F^¾î\u001d?àO_\u009c>-\u0083}Y\u008aÒÛ©k\u0005¸íÈD\u0019!¦\u0086öe\u0007ÚT\u0089ä^5ÛB¥\u0092\f#²s\u0015s\u000eÃ©\u0012[bü±\u0087\u00004Pà§|ö\u001fF¡\u0095xåì4\u008f\u008b-ÛÂ*qy\tÉÜ\u0018oo\u0012¿¡\u000eE^¿\u00adÜÝbmÅ¼#Ìµ\u001fä®Zþ»\t'X|èÓ;\u0005K\u0090\u009aê%Luº\u0084\u000e×Wgé¶NÁ%\u0011\u0086 i\u0094Ò\u0094\u0081$5õÂ\u0085ZV\u0015ç¬·W@ú\u0011\u008b¡#rÇ\u0002pÓ\u0003l§<@ÍÈ\u009e³.Dÿ÷\u0088ÜXsé\u0098¹3J\\".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1185);
        D = cArr;
        H = 1851496520904025168L;
    }

    static void init$0() {
        $$a = new byte[]{81, 52, -106, MessagePack.Code.FIXEXT4};
        $$b = 81;
    }

    static void init$1() {
        $$d = new byte[]{125, 113, 52, MessagePack.Code.FLOAT32, 59, MessagePack.Code.EXT8, -6, 45, MessagePack.Code.BIN32, 56, -19};
        $$e = 116;
    }

    static void init$2() {
        $$c = new byte[]{113, 60, -124, 107};
        $$f = 45;
    }

    private void k() throws Throwable {
        int i2 = 2 % 2;
        int i3 = F + 63;
        G = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            int i5 = G + 61;
            F = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            K((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), ViewConfiguration.getTapTimeout() >> 16, 22 - KeyEvent.getDeadChar(0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            K((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 18278), 725 - Process.getGidForName(""), 23 - (KeyEvent.getMaxKeyCode() >> 16), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        this.f21864n = true;
    }

    private void l() {
        int i2 = f21859j * (-1563483516);
        f21859j = i2;
        int i3 = f21856g * (-223143057);
        f21856g = i3;
        int iMyTid = Process.myTid();
        int i4 = f21860o * (-986324698);
        f21860o = i4;
        e(new Object[]{this}, i3, iMyTid, i4, i2, -1781192648, 1781192651);
    }

    private void m() throws Throwable {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = F + 89;
            G = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            K((char) Color.blue(0), ViewConfiguration.getKeyRepeatTimeout() >> 16, (ViewConfiguration.getEdgeSlop() >> 16) + 22, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            K((char) (22448 - (ViewConfiguration.getWindowTouchSlop() >> 8)), ((Process.getThreadPriority(0) + 20) >> 6) + 749, 20 - View.resolveSizeAndState(0, 0, 0), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = F + 69;
            G = i5 % 128;
            int i6 = i5 % 2;
        }
        this.f21861k = true;
    }

    private void n() {
        int i2 = 2 % 2;
        int i3 = G + 95;
        F = i3 % 128;
        int i4 = i3 % 2;
        this.f21864n = false;
        this.f21861k = false;
        this.f21862l = false;
        this.f21863m = false;
        this.f21867r = false;
        this.f21868s = null;
        this.f21866q = false;
        this.f21869t = false;
        this.f21865p = false;
        this.f21874y = null;
        this.f21872w = false;
        this.f21871v = false;
        this.f21873x.clear();
        this.f21870u.clear();
        this.B.clear();
        int i5 = G + 99;
        F = i5 % 128;
        int i6 = i5 % 2;
    }

    private void o() throws Throwable {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = G + 61;
            F = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            K((char) Color.red(0), (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), 22 - Color.blue(0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            K((char) ((-1) - Process.getGidForName("")), 906 - (ViewConfiguration.getTouchSlop() >> 8), TextUtils.indexOf((CharSequence) "", '0') + 23, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = G + 49;
            F = i5 % 128;
            int i6 = i5 % 2;
        }
        this.f21865p = true;
    }

    public final void a() {
        int i2 = f21850a * (-1858193773);
        f21850a = i2;
        int i3 = f21853d * 1414328504;
        f21853d = i3;
        int i4 = f21852c * (-2003308375);
        f21852c = i4;
        int i5 = f21854e * 1746513136;
        f21854e = i5;
        e(new Object[]{this}, i3, i4, i5, i2, -192268551, 192268551);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x035f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.util.Date r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2036
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.by.g.a(java.util.Date):void");
    }

    public final void a(o.dd.e eVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = F + 93;
        G = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            K((char) Color.alpha(0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            K((char) (TextUtils.lastIndexOf("", '0', 0) + 18930), 1138 - Color.blue(0), TextUtils.getOffsetAfter("", 0) + 22, objArr2);
            StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern()).append(eVar.a().name());
            Object[] objArr3 = new Object[1];
            K((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1160, 1 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr3);
            o.ea.f.c(strIntern, sbAppend.append(((String) objArr3[0]).intern()).append(eVar.e().name()).toString());
            int i5 = F + 85;
            G = i5 % 128;
            int i6 = i5 % 2;
        }
        this.C.add(eVar);
    }

    public final void b() throws Throwable {
        int i2 = 2 % 2;
        int i3 = F + 29;
        G = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            K((char) (ViewConfiguration.getFadingEdgeLength() >> 16), ViewConfiguration.getTouchSlop() >> 8, 23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            K((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 24083), Color.argb(0, 0, 0, 0) + PhotoshopDirectory.TAG_ALTERNATE_SPOT_COLORS, Color.blue(0) + 24, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = G + 63;
            F = i5 % 128;
            int i6 = i5 % 2;
        }
        this.f21872w = true;
    }

    public final void c() throws Throwable {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = G + 57;
            F = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            K((char) TextUtils.getOffsetAfter("", 0), View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.indexOf((CharSequence) "", '0') + 23, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            K((char) (8850 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 865, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = G + 13;
            F = i5 % 128;
            int i6 = i5 % 2;
        }
        this.f21866q = true;
    }

    public final void c(String str, String str2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = F + 97;
        G = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            K((char) (ViewConfiguration.getTapTimeout() >> 16), Color.argb(0, 0, 0, 0), 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            K((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 1161 - (ViewConfiguration.getLongPressTimeout() >> 16), 24 - ExpandableListView.getPackedPositionType(0L), objArr2);
            StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern()).append(str);
            Object[] objArr3 = new Object[1];
            K((char) Drawable.resolveOpacity(0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1159, 1 - Color.blue(0), objArr3);
            o.ea.f.c(strIntern, sbAppend.append(((String) objArr3[0]).intern()).append(str2).toString());
        }
        this.f21875z = str;
        this.A = str2;
        int i5 = F + 53;
        G = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 82 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() throws java.lang.Throwable {
        /*
            r10 = this;
            r9 = 2
            int r0 = r9 % r9
            int r0 = o.by.g.F
            int r1 = r0 + 65
            int r0 = r1 % 128
            o.by.g.G = r0
            int r1 = r1 % r9
            r4 = 1
            r6 = 0
            if (r1 == 0) goto L6c
            boolean r1 = o.ea.f.a()
            r0 = 71
            int r0 = r0 / r6
            if (r1 == 0) goto L69
        L19:
            int r0 = android.view.View.combineMeasuredStates(r6, r6)
            char r3 = (char) r0
            int r0 = android.view.ViewConfiguration.getScrollBarFadeDuration()
            int r2 = r0 >> 16
            int r0 = android.view.View.resolveSizeAndState(r6, r6, r6)
            int r1 = r0 + 22
            java.lang.Object[] r0 = new java.lang.Object[r4]
            K(r3, r2, r1, r0)
            r0 = r0[r6]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r5 = r0.intern()
            long r7 = android.widget.ExpandableListView.getPackedPositionForGroup(r6)
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            int r0 = 27237 - r0
            char r3 = (char) r0
            java.lang.String r1 = ""
            int r0 = android.os.Process.getGidForName(r1)
            int r2 = r0 + 887
            int r0 = android.text.TextUtils.getOffsetAfter(r1, r6)
            int r1 = r0 + 20
            java.lang.Object[] r0 = new java.lang.Object[r4]
            K(r3, r2, r1, r0)
            r0 = r0[r6]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            o.ea.f.c(r5, r0)
            int r0 = o.by.g.F
            int r1 = r0 + 23
            int r0 = r1 % 128
            o.by.g.G = r0
            int r1 = r1 % r9
        L69:
            r10.f21869t = r4
            return
        L6c:
            boolean r0 = o.ea.f.a()
            if (r0 == 0) goto L69
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.by.g.d():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x0046 A[PHI: r3
  0x0046: PHI (r3v12 java.lang.String) = (r3v10 java.lang.String), (r3v22 java.lang.String) binds: [B:257:0x049f, B:164:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.content.Context r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.by.g.d(android.content.Context):void");
    }

    public final void d(WalletLockReason walletLockReason) throws Throwable {
        int i2 = 2 % 2;
        int i3 = F + 3;
        G = i3 % 128;
        if (i3 % 2 != 0) {
            o.ea.f.a();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            K((char) (ViewConfiguration.getScrollBarSize() >> 8), ViewConfiguration.getScrollBarSize() >> 8, Color.red(0) + 22, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            K((char) View.MeasureSpec.getSize(0), 838 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 25, objArr2);
            o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(walletLockReason.name()).toString());
        }
        this.f21868s = walletLockReason;
        int i4 = G + 37;
        F = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void d(o.fj.b bVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = F + 83;
        G = i3 % 128;
        int i4 = i3 % 2;
        if (bVar.c()) {
            m();
            int i5 = G + 93;
            F = i5 % 128;
            int i6 = i5 % 2;
        }
        if (!bVar.h().isEmpty()) {
            this.f21873x.addAll(bVar.h());
        }
        if (bVar.e().isEmpty()) {
            return;
        }
        int i7 = G + 51;
        F = i7 % 128;
        if (i7 % 2 != 0) {
            this.B.addAll(bVar.e());
        } else {
            this.B.addAll(bVar.e());
            int i8 = 25 / 0;
        }
    }

    public final void e() {
        int iNextInt = new Random().nextInt();
        int iMyPid = Process.myPid();
        int i2 = f21851b * (-1280983783);
        f21851b = i2;
        int i3 = f21857h * (-1171184006);
        f21857h = i3;
        e(new Object[]{this}, iMyPid, i2, i3, iNextInt, 1369120932, -1369120931);
    }

    public final void e(o.fj.e eVar) throws Throwable {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            K((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 23, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            K((char) (59272 - TextUtils.lastIndexOf("", '0', 0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1113, 23 - ExpandableListView.getPackedPositionChild(0L), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        if (eVar.f().a()) {
            k();
        }
        if (eVar.f().c()) {
            int iNextInt = new Random().nextInt();
            int iMyPid = Process.myPid();
            int i3 = (-1280983783) * f21851b;
            f21851b = i3;
            int i4 = (-1171184006) * f21857h;
            f21857h = i4;
            e(new Object[]{this}, iMyPid, i3, i4, iNextInt, 1369120932, -1369120931);
        }
        if (eVar.f().j()) {
            o();
            int i5 = G + 33;
            F = i5 % 128;
            int i6 = i5 % 2;
        }
        if (eVar.b()) {
            int i7 = F + 97;
            G = i7 % 128;
            int i8 = i7 % 2;
            int i9 = f21859j * (-1563483516);
            f21859j = i9;
            int i10 = f21856g * (-223143057);
            f21856g = i10;
            int iMyTid = Process.myTid();
            int i11 = f21860o * (-986324698);
            f21860o = i11;
            e(new Object[]{this}, i10, iMyTid, i11, i9, -1781192648, 1781192651);
        }
        d(eVar.j());
        this.f21870u.clear();
        this.f21870u.addAll(eVar.c());
    }

    public final String f() {
        int i2 = 2 % 2;
        int i3 = G + 87;
        int i4 = i3 % 128;
        F = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.f21875z;
        int i5 = i4 + 97;
        G = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
        return str;
    }

    public final String g() {
        int i2 = 2 % 2;
        int i3 = F;
        int i4 = i3 + 61;
        G = i4 % 128;
        int i5 = i4 % 2;
        String str = this.A;
        int i6 = i3 + 7;
        G = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<o.dd.e> i() {
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i2 = f21855f * (-1885634737);
        f21855f = i2;
        int i3 = f21858i * (-183515132);
        f21858i = i3;
        return (List) e(new Object[]{this}, iElapsedRealtime, i2, i3, iFreeMemory, 1928681451, -1928681449);
    }

    public final void j() throws Throwable {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = G + 81;
            F = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            K((char) TextUtils.getTrimmedLength(""), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 22 - ExpandableListView.getPackedPositionGroup(0L), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            K((char) (ExpandableListView.getPackedPositionType(0L) + 51746), 1091 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 23, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = G + 55;
            F = i5 % 128;
            int i6 = i5 % 2;
        }
        this.f21871v = true;
        int i7 = F + 121;
        G = i7 % 128;
        int i8 = i7 % 2;
    }
}
