package o.g;

import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.Date;
import o.a.k;
import o.ea.m;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    private static final byte[] $$c = null;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f26166a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f26167c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f26168d = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f26169g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f26170i = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f26171b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Date f26172e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final /* synthetic */ b[] f26173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f26174b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f26175c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f26176d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static long f26177e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f26178f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static char f26179g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f26180h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f26181i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f26182j = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(short r9, byte r10, int r11) {
            /*
                int r8 = 122 - r11
                int r0 = r9 * 2
                int r7 = 3 - r0
                int r1 = r10 * 4
                int r0 = 1 - r1
                byte[] r6 = o.g.a.b.$$a
                byte[] r5 = new byte[r0]
                r4 = 0
                int r3 = 0 - r1
                if (r6 != 0) goto L2d
                r2 = r7
                r0 = r3
                r1 = r4
            L16:
                int r0 = -r0
                int r7 = r7 + r0
                r8 = r7
                r7 = r2
            L1a:
                byte r0 = (byte) r8
                int r2 = r7 + 1
                r5[r1] = r0
                if (r1 != r3) goto L27
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L27:
                r0 = r6[r2]
                int r1 = r1 + 1
                r7 = r8
                goto L16
            L2d:
                r1 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: o.g.a.b.$$c(short, byte, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f26180h = 0;
            f26181i = 1;
            f26178f = 0;
            f26182j = 1;
            d();
            Object[] objArr = new Object[1];
            k((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), "緑ꛗ\ue673䝚旍핧ﶏ覦", "\u0000\u0000\u0000\u0000", "䐝篗Ꮓͅ", View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
            f26175c = new b(((String) objArr[0]).intern(), 0);
            Object[] objArr2 = new Object[1];
            k((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "䢛隞쩨쒰시譜꼔䟭", "\u0000\u0000\u0000\u0000", "ꢴ搖쐵㌐", (-1) - MotionEvent.axisFromString(""), objArr2);
            f26176d = new b(((String) objArr2[0]).intern(), 1);
            f26173a = b();
            int i2 = f26181i + 61;
            f26180h = i2 % 128;
            int i3 = i2 % 2;
        }

        private b(String str, int i2) {
        }

        private static /* synthetic */ b[] b() {
            int i2 = 2 % 2;
            int i3 = f26182j;
            int i4 = i3 + 35;
            f26178f = i4 % 128;
            int i5 = i4 % 2;
            b[] bVarArr = {f26175c, f26176d};
            int i6 = i3 + 113;
            f26178f = i6 % 128;
            int i7 = i6 % 2;
            return bVarArr;
        }

        static void d() {
            f26177e = 740602047300126166L;
            f26174b = 1564493270;
            f26179g = (char) 27673;
        }

        static void init$0() {
            $$a = new byte[]{91, 84, -6, Ascii.ETB};
            $$b = 117;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void k(char r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, int r26, java.lang.Object[] r27) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 582
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.g.a.b.k(char, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object[]):void");
        }

        public static b valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f26182j + 107;
            f26178f = i3 % 128;
            int i4 = i3 % 2;
            b bVar = (b) Enum.valueOf(b.class, str);
            int i5 = f26178f + 49;
            f26182j = i5 % 128;
            int i6 = i5 % 2;
            return bVar;
        }

        public static b[] values() {
            int i2 = 2 % 2;
            int i3 = f26182j + 41;
            f26178f = i3 % 128;
            int i4 = i3 % 2;
            b[] bVarArr = (b[]) f26173a.clone();
            int i5 = f26182j + 97;
            f26178f = i5 % 128;
            int i6 = i5 % 2;
            return bVarArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(short r9, byte r10, int r11) {
        /*
            int r8 = r10 * 3
            int r1 = r8 + 1
            byte[] r7 = o.g.a.$$c
            int r0 = r11 * 7
            int r6 = r0 + 107
            int r5 = r9 + 4
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r7 != 0) goto L28
            r0 = r8
            r2 = r3
        L13:
            int r0 = -r0
            int r6 = r6 + r0
            r1 = r2
        L16:
            byte r0 = (byte) r6
            r4[r1] = r0
            int r5 = r5 + 1
            int r2 = r1 + 1
            if (r1 != r8) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L25:
            r0 = r7[r5]
            goto L13
        L28:
            r1 = r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.g.a.$$g(short, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26170i = 0;
        f26169g = 1;
        f26166a = 0;
        f26168d = 1;
        i();
        AndroidCharacter.getMirror('0');
        int i2 = f26170i + 23;
        f26169g = i2 % 128;
        int i3 = i2 % 2;
    }

    public a(b bVar, Date date) {
        this.f26171b = bVar;
        this.f26172e = date;
    }

    static void i() {
        f26167c = 7069968400115923919L;
    }

    static void init$0() {
        $$c = new byte[]{112, 68, MessagePack.Code.BIN8, -81};
        $$f = 131;
    }

    private static void l(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        Object obj = str2;
        if (str2 != null) {
            char[] charArray = str2.toCharArray();
            int i4 = $11 + 43;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            obj = charArray;
        }
        k kVar = new k();
        char[] cArrC = k.c(f26167c ^ (-5882309809461882246L), (char[]) obj, i2);
        int i6 = 4;
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            int i7 = $11 + 107;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            kVar.f19938a = kVar.f19939c - i6;
            int i9 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % i6]), Long.valueOf(kVar.f19938a), Long.valueOf(f26167c)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objA = o.d.d.a(229 - ExpandableListView.getPackedPositionType(0L), (char) (51005 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 9 - TextUtils.getCapsMode("", 0, 0), 1749983833, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 + 1);
                    objA2 = o.d.d.a(675 - TextUtils.getCapsMode("", 0, 0), (char) View.MeasureSpec.getMode(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 11, 522683165, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                int i10 = $10 + 69;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                i6 = 4;
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

    public final boolean a(Integer num, Date date) throws Throwable {
        int i2 = 2 % 2;
        if (num == null) {
            int i3 = f26168d + 35;
            f26166a = i3 % 128;
            if (i3 % 2 != 0) {
                o.ea.f.a();
                throw null;
            }
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                l("俴侷驳玴\u0fed\u242e\udce2饕\ue945ઔ疧䞴Ƚ굂⺌", 1 - TextUtils.getCapsMode("", 0, 0), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                l("ힲퟛ病鰃ⶴ켴ﺛ牓焖\ue525埸겢驾䋙\u0cd2얷⎯ꮀ\uea37纏䳏\uf0e0䍠霮闺幰㠚〓㼿ꜚ醷楗堗ఫ们菿\ue161嗵⟝㳤ન늈鴙", 1 - ExpandableListView.getPackedPositionGroup(0L), objArr2);
                o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
                int i4 = f26166a + 13;
                f26168d = i4 % 128;
                int i5 = i4 % 2;
            }
            return false;
        }
        if (o.ea.f.a()) {
            Object[] objArr3 = new Object[1];
            l("俴侷驳玴\u0fed\u242e\udce2饕\ue945ઔ疧䞴Ƚ굂⺌", -TextUtils.indexOf((CharSequence) "", '0'), objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr4 = new Object[1];
            l("ᑣᐊ戢诤Ἰ憳찗\udcd4닇\uf2c2整ȥ妯唾㹞欰\ue07e뱧\ud8bb퀈輞\ue707燣㦩嘳䦓\u0ad3麞ﳯ냦ꌹ쟅鯛ᯊ籡ⴶ⊗䈞ᕟ鉩줭ꔫ", Color.green(0) + 1, objArr4);
            o.ea.f.c(strIntern2, sb.append(((String) objArr4[0]).intern()).append(this.f26172e.getTime()).toString());
            int i6 = f26166a + 99;
            f26168d = i6 % 128;
            int i7 = i6 % 2;
        }
        Date date2 = new Date(this.f26172e.getTime() + ((long) (num.intValue() * 1000)));
        if (o.ea.f.a()) {
            Object[] objArr5 = new Object[1];
            l("俴侷驳玴\u0fed\u242e\udce2饕\ue945ઔ疧䞴Ƚ굂⺌", AndroidCharacter.getMirror('0') - '/', objArr5);
            String strIntern3 = ((String) objArr5[0]).intern();
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            l("曖暿첽╻姯ᇻ諀겜쁲屝⎣牭⬚ﮡ碉᭸鋋ዸ鹬ꁀﶫ䦘㜰䧬⒂\ue70d䰓\ueed9蹚ṹ\ue5e2랂\ue94e땕㪴嵵偌\uecc8", Color.alpha(0) + 1, objArr6);
            o.ea.f.c(strIntern3, sb2.append(((String) objArr6[0]).intern()).append(date2.getTime()).toString());
        }
        return date.after(date2);
    }

    public abstract byte[] a();

    public abstract o.m.i b();

    public abstract String c();

    protected final Object clone() throws CloneNotSupportedException {
        int i2 = 2 % 2;
        throw new CloneNotSupportedException();
    }

    public abstract byte[] d();

    public abstract byte[] e();

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f26168d + 97;
        f26166a = i3 % 128;
        int i4 = i3 % 2;
        boolean zEquals = super.equals(obj);
        int i5 = f26168d + 9;
        f26166a = i5 % 128;
        int i6 = i5 % 2;
        return zEquals;
    }

    public final b f() {
        int i2 = 2 % 2;
        int i3 = f26166a + 37;
        int i4 = i3 % 128;
        f26168d = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        b bVar = this.f26171b;
        int i5 = i4 + 61;
        f26166a = i5 % 128;
        int i6 = i5 % 2;
        return bVar;
    }

    protected final void finalize() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26168d + 45;
        f26166a = i3 % 128;
        if (i3 % 2 != 0) {
            super.finalize();
            int i4 = 97 / 0;
        } else {
            super.finalize();
        }
        int i5 = f26166a + 23;
        f26168d = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean h() {
        boolean zE;
        int i2 = 2 % 2;
        int i3 = f26166a + 29;
        f26168d = i3 % 128;
        if (i3 % 2 == 0) {
            o.m.i iVarB = b();
            o.m.i[] iVarArr = new o.m.i[5];
            iVarArr[0] = o.m.i.f26495c;
            iVarArr[1] = o.m.i.f26496d;
            zE = m.c.e(iVarB, iVarArr);
        } else {
            zE = m.c.e(b(), o.m.i.f26495c, o.m.i.f26496d);
        }
        int i4 = f26168d + 9;
        f26166a = i4 % 128;
        if (i4 % 2 == 0) {
            return zE;
        }
        throw null;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f26168d + 27;
        f26166a = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = super.hashCode();
        int i5 = f26168d + 91;
        f26166a = i5 % 128;
        if (i5 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public abstract String j();

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f26168d + 105;
        f26166a = i3 % 128;
        int i4 = i3 % 2;
        String string = super.toString();
        int i5 = f26168d + 89;
        f26166a = i5 % 128;
        if (i5 % 2 == 0) {
            return string;
        }
        throw null;
    }
}
