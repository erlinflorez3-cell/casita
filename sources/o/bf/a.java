package o.bf;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.OlympusRawInfoMakernoteDirectory;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.EligibilityDenialReason;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import o.a.g;
import o.a.l;
import o.a.m;
import o.bg.c;
import o.cg.f;
import o.cg.i;
import o.ea.f;
import o.en.b;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends o.ab.e<InterfaceC0340a> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: k */
    private static int f20986k = 0;

    /* JADX INFO: renamed from: l */
    private static int[] f20987l = null;

    /* JADX INFO: renamed from: p */
    private static int f20988p = 0;

    /* JADX INFO: renamed from: q */
    private static int f20989q = 0;

    /* JADX INFO: renamed from: r */
    private static int f20990r = 0;

    /* JADX INFO: renamed from: f */
    e f20991f;

    /* JADX INFO: renamed from: g */
    List<o.en.e> f20992g;

    /* JADX INFO: renamed from: j */
    String f20993j;

    /* JADX INFO: renamed from: m */
    boolean f20994m;

    /* JADX INFO: renamed from: n */
    boolean f20995n;

    /* JADX INFO: renamed from: o */
    boolean f20996o;

    /* JADX INFO: renamed from: o.bf.a$a */
    public interface InterfaceC0340a {
        void c(EligibilityDenialReason eligibilityDenialReason, String str);

        void e(c cVar);

        void e(boolean z2, List<o.en.e> list);
    }

    static final class d extends o.ab.c<a> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b */
        private static char[] f20997b = null;

        /* JADX INFO: renamed from: c */
        private static char f20998c = 0;

        /* JADX INFO: renamed from: d */
        private static char f20999d = 0;

        /* JADX INFO: renamed from: f */
        private static char f21000f = 0;

        /* JADX INFO: renamed from: g */
        private static int f21001g = 0;

        /* JADX INFO: renamed from: i */
        private static int f21002i = 0;

        /* JADX INFO: renamed from: j */
        private static char f21003j = 0;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0026 -> B:17:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$d(byte r9, short r10, int r11) {
            /*
                int r8 = r11 + 69
                byte[] r7 = o.bf.a.d.$$a
                int r2 = r10 * 2
                int r1 = 1 - r2
                int r0 = r9 * 3
                int r6 = 4 - r0
                byte[] r5 = new byte[r1]
                r4 = 0
                int r3 = 0 - r2
                if (r7 != 0) goto L2c
                r2 = r6
                r0 = r3
                r1 = r4
            L16:
                int r6 = r6 + r0
                r8 = r6
                r6 = r2
            L19:
                int r2 = r6 + 1
                byte r0 = (byte) r8
                r5[r1] = r0
                if (r1 != r3) goto L26
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L26:
                int r1 = r1 + 1
                r0 = r7[r2]
                r6 = r8
                goto L16
            L2c:
                r1 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.bf.a.d.$$d(byte, short, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f21001g = 0;
            f21002i = 1;
            f20997b = new char[]{56505, 56563, 56561, 56523, 56488, 56484, 56486, 56486, 56503, 56535, 56551, 56553, 56537, 56542, 56561, 56541, 56538, 56562, 56561, 56553, 56532, 56542, 56557, 56548, 56554, 56562, 56558, 56556, 56558, 56347, 56754, 56747, 56752, 56760, 56760, 56485, 56526, 56529, 56526, 56521, 56542, 56557, 56548, 56554, 56562, 56558, 56556, 56558, 56560, 56563, 56561, 56523, 56488, 56484, 56486, 56486, 56509, 56571, 56569, 56531, 56496, 56492, 56494, 56494, 56513, 56547, 56563, 56571, 56565, 56564, 56571, 56530, 56528, 56560, 56565, 56570, 56565, 56560, 56554, 56522, 56528, 56569, 56563, 56562, 56560, 56561, 56561, 56562, 56566, 56564, 56566, 56527, 56523, 56555, 56557, 56562, 56560, 56556, 56560, 56420, 56426, 56387, 56348, 56390, 56387, 56359, 56359, 56348, 56390, 56428, 56429, 56427, 56389, 56354, 56350, 56352, 56352, 56387, 56421, 56422, 56427, 56425, 56424, 56426, 56422, 56380, 56363, 56403, 56419, 56414, 56380, 56534, 56366, 56364, 56326, 56547, 56543, 56545, 56545, 56324, 56358, 56359, 56364, 56362, 56361, 56363, 56359, 56573, 56572, 56356, 56356, 56351, 56573, 56322, 56361, 56364, 56325, 56574, 56357, 56365, 56364, 56356, 56323, 56545, 56322, 56361, 56364, 56325, 56572, 56356, 56361, 56363, 56361, 56353, 56351, 56358, 56360, 56358, 56357, 56574, 56323, 56364, 56363, 56356, 56359, 56359, 56358, 56325, 56574, 56357, 56363, 56324, 56573, 56355, 56357, 56355, 56355, 56352, 56352, 56357, 56357, 56361, 56369, 56327, 56324, 56358, 56359, 56367, 56363, 56363, 56552, 56405, 56406, 56408, 56408, 56402, 56402, 56392, 56396, 56403, 56402, 56408, 56406, 56401, 56401, 56545, 56387, 56353, 56355, 56397, 56360, 56353, 56391, 56393, 56391, 56391, 56388, 56390, 56391, 56353, 56354, 56393, 56399, 56360, 56359, 56400, 56399, 56392, 56395, 56395, 56394, 56379, 56371, 56396, 56398, 56464, 56493, 56493, 56522, 56555, 56556, 56556, 56553, 56560, 56561, 56520, 56521, 56560, 56554, 56515, 56514, 56552, 56551, 56549, 56552, 56552, 56554, 56552, 56514, 56522, 56561, 56558, 56519, 56521, 56558, 56516, 56514, 56548, 56550, 56559, 56557, 56532, 56556, 56426, 56443, 56441, 56444, 56429, 56429, 56447, 56445, 56445, 56442, 56442, 56447, 56447, 56707, 56715, 56435, 56430, 56707, 56706, 56444, 56444, 56446, 56332, 56732, 56731, 56729, 56732, 56732, 56734, 56716, 56720, 56741, 56738, 56443, 56417, 56417, 56438, 56736, 56744, 56736, 56728, 56738, 56722, 56720, 56743, 56741, 56723, 56723, 56738, 56443, 56410, 56410, 56441, 56739, 56734, 56718, 56730, 56746, 56738, 56734, 56734, 56729, 56729, 56732, 56732, 56734, 56716, 56716, 56731, 56728, 56730, 56713, 56498, 56552, 56551, 56549, 56552, 56552, 56554, 56552, 56514, 56493, 56493, 56514, 56556, 56564, 56556, 56548, 56558, 56542, 56540, 56563, 56561, 56543, 56543, 56558, 56519, 56486, 56486, 56517, 56559, 56554, 56538, 56550, 56566, 56558, 56554, 56554, 56549, 56549, 56552, 56552, 56554, 56536, 56536, 56551, 56548, 56550, 56533};
            f20998c = (char) 3939;
            f20999d = (char) 1255;
            f21003j = (char) 19131;
            f21000f = (char) 25148;
        }

        d(a aVar) {
            super(aVar, false);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0015, code lost:
        
            if (r10 == 0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x001c, code lost:
        
            if ((!o.ea.f.a()) == true) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x001e, code lost:
        
            r3 = d();
            r1 = new java.lang.Object[1];
            m("\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001", new int[]{com.facebook.imageutils.JfifUtil.MARKER_APP1, 30, 95, 26}, false, r1);
            o.ea.f.c(r3, ((java.lang.String) r1[0]).intern());
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x003e, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0040, code lost:
        
            if (r10 == 0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0043, code lost:
        
            r7 = o.bf.e.b(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0047, code lost:
        
            if (r7 != null) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x004d, code lost:
        
            if (o.ea.f.a() == false) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x004f, code lost:
        
            r3 = d();
            r1 = new java.lang.Object[1];
            o("炂糛练및\uddf3峬譶엤⟽뼩砫脳誐케蒚죾䟻陶ⱙ䌨鵮赳髈쇰\ue3ce빈兹归㱟鐻互燪㮂⿃൨\u2b75臌⼨伕ꉷ\udeec䙙겘鷖ꭄ㕣䭁列⺐緿铀\u0af5\u12c1룳ఢ讑쁃ϕ梑\uea2c겠\u1976൨\u2b75皲햞\uddf3峬쓞η", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 70, r1);
            o.ea.f.d(r3, ((java.lang.String) r1[0]).intern());
            r1 = o.bf.a.d.f21002i + 95;
            o.bf.a.d.f21001g = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0077, code lost:
        
            return o.bf.e.f21017g;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x007c, code lost:
        
            if (o.ea.f.a() == false) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x007e, code lost:
        
            r4 = d();
            r3 = new java.lang.StringBuilder();
            r1 = new java.lang.Object[1];
            m("\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001", new int[]{255, 37, 0, 0}, true, r1);
            o.ea.f.c(r4, r3.append(((java.lang.String) r1[0]).intern()).append(r7).toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00ad, code lost:
        
            return r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
        
            return null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private o.bf.e e(int r10) throws java.lang.Throwable {
            /*
                r9 = this;
                r8 = 2
                int r0 = r8 % r8
                int r0 = o.bf.a.d.f21002i
                int r1 = r0 + 7
                int r0 = r1 % 128
                o.bf.a.d.f21001g = r0
                int r1 = r1 % r8
                r4 = 95
                r6 = 1
                r5 = 0
                if (r1 == 0) goto L40
                r0 = 36
                int r0 = r0 / r5
                if (r10 != 0) goto L43
            L17:
                boolean r0 = o.ea.f.a()
                r0 = r0 ^ r6
                if (r0 == r6) goto L3e
                java.lang.String r3 = r9.d()
                r2 = 30
                r1 = 26
                r0 = 225(0xe1, float:3.15E-43)
                int[] r2 = new int[]{r0, r2, r4, r1}
                java.lang.Object[] r1 = new java.lang.Object[r6]
                java.lang.String r0 = "\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001"
                m(r0, r2, r5, r1)
                r0 = r1[r5]
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = r0.intern()
                o.ea.f.c(r3, r0)
            L3e:
                r0 = 0
                return r0
            L40:
                if (r10 != 0) goto L43
                goto L17
            L43:
                o.bf.e r7 = o.bf.e.b(r10)
                if (r7 != 0) goto L78
                boolean r0 = o.ea.f.a()
                if (r0 == 0) goto L75
                java.lang.String r3 = r9.d()
                int r0 = android.view.ViewConfiguration.getFadingEdgeLength()
                int r0 = r0 >> 16
                int r2 = r0 + 70
                java.lang.Object[] r1 = new java.lang.Object[r6]
                java.lang.String r0 = "炂糛练및\uddf3峬譶엤⟽뼩砫脳誐케蒚죾䟻陶ⱙ䌨鵮赳髈쇰\ue3ce빈兹归㱟鐻互燪㮂⿃൨\u2b75臌⼨伕ꉷ\udeec䙙겘鷖ꭄ㕣䭁列⺐緿铀\u0af5\u12c1룳ఢ讑쁃ϕ梑\uea2c겠\u1976൨\u2b75皲햞\uddf3峬쓞η"
                o(r0, r2, r1)
                r0 = r1[r5]
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = r0.intern()
                o.ea.f.d(r3, r0)
                int r1 = o.bf.a.d.f21002i
                int r1 = r1 + r4
                int r0 = r1 % 128
                o.bf.a.d.f21001g = r0
                int r1 = r1 % r8
            L75:
                o.bf.e r0 = o.bf.e.f21017g
                return r0
            L78:
                boolean r0 = o.ea.f.a()
                if (r0 == 0) goto Lad
                java.lang.String r4 = r9.d()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r1 = 255(0xff, float:3.57E-43)
                r0 = 37
                int[] r2 = new int[]{r1, r0, r5, r5}
                java.lang.Object[] r1 = new java.lang.Object[r6]
                java.lang.String r0 = "\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001"
                m(r0, r2, r6, r1)
                r0 = r1[r5]
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = r0.intern()
                java.lang.StringBuilder r0 = r3.append(r0)
                java.lang.StringBuilder r0 = r0.append(r7)
                java.lang.String r0 = r0.toString()
                o.ea.f.c(r4, r0)
            Lad:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: o.bf.a.d.e(int):o.bf.e");
        }

        static void init$0() {
            $$a = new byte[]{0, -128, Ascii.EM, 70, MessagePack.Code.FIXEXT4};
            $$b = 133;
        }

        private static void m(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
            char[] cArr;
            int i2;
            int i3;
            String str2 = str;
            int i4 = 2 % 2;
            int i5 = $10 + 41;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            Object obj = str2;
            if (str2 != null) {
                byte[] bytes = str2.getBytes("ISO-8859-1");
                int i7 = $11 + 17;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                obj = bytes;
            }
            byte[] bArr = (byte[]) obj;
            m mVar = new m();
            int i9 = 0;
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            int i13 = iArr[3];
            char[] cArr2 = f20997b;
            long j2 = 0;
            if (cArr2 != null) {
                int i14 = $11 + 27;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i16 = 0;
                while (i16 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i16])};
                        Object objA = o.d.d.a(-2071388435);
                        if (objA == null) {
                            int i17 = 250 - (SystemClock.elapsedRealtime() > j2 ? 1 : (SystemClock.elapsedRealtime() == j2 ? 0 : -1));
                            char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                            int iResolveOpacity = Drawable.resolveOpacity(i9, i9) + 11;
                            byte b2 = $$a[i9];
                            byte b3 = b2;
                            objA = o.d.d.a(i17, tapTimeout, iResolveOpacity, 1376582792, false, $$d(b2, b3, (byte) ((-1) - (((-1) - b3) & ((-1) - 47)))), new Class[]{Integer.TYPE});
                        }
                        cArr3[i16] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        i16++;
                        i9 = 0;
                        j2 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            char[] cArr4 = new char[i11];
            System.arraycopy(cArr2, i10, cArr4, 0, i11);
            if (bArr != null) {
                char[] cArr5 = new char[i11];
                mVar.f19943d = 0;
                char c2 = 0;
                while (mVar.f19943d < i11) {
                    if (bArr[mVar.f19943d] == 1) {
                        int i18 = mVar.f19943d;
                        Object[] objArr3 = {Integer.valueOf(cArr4[mVar.f19943d]), Integer.valueOf(c2)};
                        Object objA2 = o.d.d.a(120026474);
                        if (objA2 == null) {
                            objA2 = o.d.d.a(11 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) View.MeasureSpec.getSize(0), 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i18] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                        i3 = 2;
                    } else {
                        int i19 = mVar.f19943d;
                        Object[] objArr4 = {Integer.valueOf(cArr4[mVar.f19943d]), Integer.valueOf(c2)};
                        Object objA3 = o.d.d.a(1632715197);
                        if (objA3 == null) {
                            int i20 = 837 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            char maxKeyCode = (char) (27279 - (KeyEvent.getMaxKeyCode() >> 16));
                            int iIndexOf = TextUtils.indexOf("", "", 0) + 11;
                            byte b4 = $$a[0];
                            byte b5 = b4;
                            objA3 = o.d.d.a(i20, maxKeyCode, iIndexOf, -1210801192, false, $$d(b4, b5, (byte) ((b5 + 51) - (51 & b5))), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i19] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                        int i21 = $10 + 55;
                        $11 = i21 % 128;
                        i3 = 2;
                        int i22 = i21 % 2;
                    }
                    c2 = cArr5[mVar.f19943d];
                    Object[] objArr5 = new Object[i3];
                    objArr5[1] = mVar;
                    objArr5[0] = mVar;
                    Object objA4 = o.d.d.a(-1041906996);
                    if (objA4 == null) {
                        objA4 = o.d.d.a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 21, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 35715), 10 - ExpandableListView.getPackedPositionChild(0L), 392175785, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
                cArr4 = cArr5;
            }
            if (i13 > 0) {
                char[] cArr6 = new char[i11];
                System.arraycopy(cArr4, 0, cArr6, 0, i11);
                int i23 = i11 - i13;
                System.arraycopy(cArr6, 0, cArr4, i23, i13);
                System.arraycopy(cArr6, i13, cArr4, 0, i23);
            }
            if (z2) {
                int i24 = $11 + 5;
                $10 = i24 % 128;
                if (i24 % 2 != 0) {
                    cArr = new char[i11];
                    i2 = 1;
                } else {
                    cArr = new char[i11];
                    i2 = 0;
                }
                while (true) {
                    mVar.f19943d = i2;
                    if (mVar.f19943d >= i11) {
                        break;
                    }
                    int i25 = $11 + 57;
                    $10 = i25 % 128;
                    if (i25 % 2 != 0) {
                        cArr[mVar.f19943d] = cArr4[i11 << mVar.f19943d];
                        i2 = mVar.f19943d >>> 1;
                    } else {
                        cArr[mVar.f19943d] = cArr4[(i11 - mVar.f19943d) - 1];
                        i2 = mVar.f19943d + 1;
                    }
                }
                cArr4 = cArr;
            }
            if (i12 > 0) {
                int i26 = $10 + 65;
                $11 = i26 % 128;
                int i27 = i26 % 2;
                int i28 = 0;
                while (true) {
                    mVar.f19943d = i28;
                    if (mVar.f19943d >= i11) {
                        break;
                    }
                    cArr4[mVar.f19943d] = (char) (cArr4[mVar.f19943d] - iArr[2]);
                    i28 = mVar.f19943d + 1;
                }
            }
            objArr[0] = new String(cArr4);
        }

        private static void o(String str, int i2, Object[] objArr) throws Throwable {
            Object charArray;
            String str2 = str;
            int i3 = 2 % 2;
            int i4 = $11 + 57;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 95 / 0;
                charArray = str2 != null ? str2.toCharArray() : str2;
            } else if (str2 != null) {
            }
            char[] cArr = (char[]) charArray;
            g gVar = new g();
            char[] cArr2 = new char[cArr.length];
            gVar.f19924d = 0;
            char[] cArr3 = new char[2];
            int i6 = $11 + 109;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            while (gVar.f19924d < cArr.length) {
                cArr3[0] = cArr[gVar.f19924d];
                cArr3[1] = cArr[gVar.f19924d + 1];
                int i8 = 58224;
                for (int i9 = 0; i9 < 16; i9++) {
                    char c2 = cArr3[1];
                    char c3 = cArr3[0];
                    try {
                        Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i8) ^ ((c3 << 4) + ((char) (((long) f21003j) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f21000f)};
                        Object objA = o.d.d.a(1603517628);
                        if (objA == null) {
                            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 270;
                            char cMyPid = (char) (Process.myPid() >> 22);
                            int iCombineMeasuredStates = 11 - View.combineMeasuredStates(0, 0);
                            byte b2 = $$a[0];
                            byte b3 = b2;
                            objA = o.d.d.a(maxKeyCode, cMyPid, iCombineMeasuredStates, -1995022631, false, $$d(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) f20998c) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f20999d)};
                        Object objA2 = o.d.d.a(1603517628);
                        if (objA2 == null) {
                            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 270;
                            char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 11;
                            byte b4 = $$a[0];
                            byte b5 = b4;
                            objA2 = o.d.d.a(windowTouchSlop, capsMode, keyRepeatDelay, -1995022631, false, $$d(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                        i8 -= 40503;
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
                    int size = 270 - View.MeasureSpec.getSize(0);
                    char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 12;
                    byte b6 = $$a[0];
                    byte b7 = b6;
                    objA3 = o.d.d.a(size, jumpTapTimeout, bitsPerPixel, -2074123590, false, $$d(b6, b7, (byte) (b7 + 3)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2, 0, i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x001d, code lost:
        
            if (r5.c() == o.bg.a.C) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x001f, code lost:
        
            e().g().c(fr.antelop.sdk.EligibilityDenialReason.OsNotSupported, null);
            r1 = o.bf.a.d.f21002i + 43;
            o.bf.a.d.f21001g = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
        
            if (r5.c() == o.bg.a.C) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
        
            e().g().e(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
        
            return;
         */
        @Override // o.ab.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(o.bg.c r5) {
            /*
                r4 = this;
                r3 = 2
                int r0 = r3 % r3
                int r0 = o.bf.a.d.f21001g
                int r1 = r0 + 81
                int r0 = r1 % 128
                o.bf.a.d.f21002i = r0
                int r1 = r1 % r3
                if (r1 != 0) goto L3b
                o.ab.e r1 = r4.e()
                o.bf.a r1 = (o.bf.a) r1
                r0 = 1
                r1.f20995n = r0
                o.bg.a r1 = r5.c()
                o.bg.a r0 = o.bg.a.C
                if (r1 != r0) goto L4d
            L1f:
                o.ab.e r0 = r4.e()
                o.bf.a r0 = (o.bf.a) r0
                java.lang.Object r2 = r0.g()
                o.bf.a$a r2 = (o.bf.a.InterfaceC0340a) r2
                fr.antelop.sdk.EligibilityDenialReason r1 = fr.antelop.sdk.EligibilityDenialReason.OsNotSupported
                r0 = 0
                r2.c(r1, r0)
                int r0 = o.bf.a.d.f21002i
                int r1 = r0 + 43
                int r0 = r1 % 128
                o.bf.a.d.f21001g = r0
                int r1 = r1 % r3
                return
            L3b:
                o.ab.e r1 = r4.e()
                o.bf.a r1 = (o.bf.a) r1
                r0 = 0
                r1.f20995n = r0
                o.bg.a r1 = r5.c()
                o.bg.a r0 = o.bg.a.C
                if (r1 != r0) goto L4d
                goto L1f
            L4d:
                o.ab.e r0 = r4.e()
                o.bf.a r0 = (o.bf.a) r0
                java.lang.Object r0 = r0.g()
                o.bf.a$a r0 = (o.bf.a.InterfaceC0340a) r0
                r0.e(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.bf.a.d.b(o.bg.c):void");
        }

        @Override // o.ab.c
        public final void c() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f21001g + 53;
            f21002i = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = {j(), h()};
                int i4 = o.c.a.f21922i * 1809095941;
                o.c.a.f21922i = i4;
                int i5 = o.c.a.f21923j * (-208500124);
                o.c.a.f21923j = i5;
                o.c.a.e(objArr, 367855230, (int) Runtime.getRuntime().freeMemory(), i4, i5, -367855229, (int) SystemClock.uptimeMillis());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object[] objArr2 = {j(), h()};
            int i6 = o.c.a.f21922i * 1809095941;
            o.c.a.f21922i = i6;
            int i7 = o.c.a.f21923j * (-208500124);
            o.c.a.f21923j = i7;
            o.c.a.e(objArr2, 367855230, (int) Runtime.getRuntime().freeMemory(), i6, i7, -367855229, (int) SystemClock.uptimeMillis());
            int i8 = f21001g + 93;
            f21002i = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 98 / 0;
            }
        }

        @Override // o.ab.c
        public final void c(c cVar) throws Throwable {
            String strIntern;
            Object obj;
            int i2 = 2 % 2;
            e().f20995n = false;
            if (e().f20992g != null) {
                int i3 = f21002i + 51;
                f21001g = i3 % 128;
                int i4 = i3 % 2;
                if (!e().f20992g.isEmpty()) {
                    if (f.a()) {
                        Object[] objArr = new Object[1];
                        m("\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000", new int[]{OlympusRawInfoMakernoteDirectory.TagWbRbLevelsEveningSunlight, 23, 149, 0}, false, objArr);
                        String strIntern2 = ((String) objArr[0]).intern();
                        Object[] objArr2 = new Object[1];
                        m("\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new int[]{365, 47, 0, 0}, true, objArr2);
                        f.c(strIntern2, ((String) objArr2[0]).intern());
                    }
                    e().g().e(e().f20994m, e().f20992g);
                    return;
                }
            }
            if (!(!f.a())) {
                int i5 = f21002i + 91;
                f21001g = i5 % 128;
                if (i5 % 2 != 0) {
                    Object[] objArr3 = new Object[1];
                    m("\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000", new int[]{OlympusRawInfoMakernoteDirectory.TagWbRbLevelsEveningSunlight, 23, 149, 0}, true, objArr3);
                    strIntern = ((String) objArr3[0]).intern();
                    Object[] objArr4 = new Object[1];
                    m("\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new int[]{315, 50, 180, 0}, true, objArr4);
                    obj = objArr4[0];
                } else {
                    Object[] objArr5 = new Object[1];
                    m("\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000", new int[]{OlympusRawInfoMakernoteDirectory.TagWbRbLevelsEveningSunlight, 23, 149, 0}, false, objArr5);
                    strIntern = ((String) objArr5[0]).intern();
                    Object[] objArr6 = new Object[1];
                    m("\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new int[]{315, 50, 180, 0}, true, objArr6);
                    obj = objArr6[0];
                }
                f.c(strIntern, ((String) obj).intern());
            }
            e().g().c(e().f20991f.a(), e().f20993j);
        }

        @Override // o.ab.c
        public final void g() throws Throwable {
            o.ef.a aVarX;
            ArrayList<e> arrayList;
            ArrayList arrayList2;
            int i2 = 2 % 2;
            try {
                o.bf.d dVar = new o.bf.d(h());
                o.ef.a aVar = new o.ef.a();
                try {
                    Object[] objArr = new Object[1];
                    m("\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{29, 6, 197, 4}, false, objArr);
                    aVar.b(((String) objArr[0]).intern(), e().f20996o);
                    Object[] objArr2 = new Object[1];
                    o("┡槖\ue843ฆ縢츮㻐霵됦㰻\ue384⯞㻐霵愶륡", 17 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr2);
                    dVar.c(((String) objArr2[0]).intern(), aVar);
                    Object[] objArr3 = {j()};
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int iUptimeMillis = (int) SystemClock.uptimeMillis();
                    int priority = Thread.currentThread().getPriority();
                    int i3 = b.f24088c * (-1721916949);
                    b.f24088c = i3;
                    dVar.d(((o.fm.g) b.a(-568976488, elapsedCpuTime, objArr3, iUptimeMillis, 568976490, priority, i3)).b().a(h()));
                } catch (o.ef.b e2) {
                    if (f.a()) {
                        String strD = d();
                        Object[] objArr4 = new Object[1];
                        m("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{35, 21, 0, 13}, false, objArr4);
                        f.e(strD, ((String) objArr4[0]).intern(), e2);
                    }
                    f().d(o.bg.a.f21032a);
                }
                try {
                    f.e eVarT = dVar.t();
                    int i4 = f21001g + 9;
                    f21002i = i4 % 128;
                    int i5 = i4 % 2;
                    o.ef.a aVarB = eVarT.b();
                    Context contextH = h();
                    Object[] objArr5 = new Object[1];
                    o("┡槖\ue843ฆ縢츮㻐霵됦㰻\ue384⯞㻐霵愶륡", 17 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr5);
                    i iVarA = i.a(contextH, aVarB, 17, ((String) objArr5[0]).intern());
                    int i6 = i.f22351a * 54917210;
                    i.f22351a = i6;
                    int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                    int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                    int i7 = i.f22352b * (-842077802);
                    i.f22352b = i7;
                    if (((Long) i.b(iElapsedRealtime, i6, i7, -1938085664, new Object[]{iVarA}, 1938085665, elapsedCpuTime2)) != null) {
                        o.bt.e eVarC = o.bt.e.c();
                        int i8 = i.f22351a * 54917210;
                        i.f22351a = i8;
                        int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                        int elapsedCpuTime3 = (int) Process.getElapsedCpuTime();
                        int i9 = i.f22352b * (-842077802);
                        i.f22352b = i9;
                        eVarC.c((Long) i.b(iElapsedRealtime2, i8, i9, -1938085664, new Object[]{iVarA}, 1938085665, elapsedCpuTime3));
                    }
                    if (!iVarA.c().a()) {
                        int i10 = f21002i + 69;
                        f21001g = i10 % 128;
                        if (i10 % 2 == 0) {
                            f().d(iVarA.c().e().c());
                            return;
                        } else {
                            f().d(iVarA.c().e().c());
                            int i11 = 55 / 0;
                            return;
                        }
                    }
                    if (o.ea.f.a()) {
                        String strD2 = d();
                        StringBuilder sb = new StringBuilder();
                        Object[] objArr6 = new Object[1];
                        o("\ueb50ꛗ\ud93b䦾ꢦ鯆ⱴ謼ꮏꨔ娸뼜지\uef8d\ue06e鑍鑞騈鱥ᥧ惹ﻗ", View.MeasureSpec.getSize(0) + 21, objArr6);
                        o.ea.f.c(strD2, sb.append(((String) objArr6[0]).intern()).append(iVarA.e()).toString());
                    }
                    if (o.ea.f.a()) {
                        String strD3 = d();
                        StringBuilder sb2 = new StringBuilder();
                        Object[] objArr7 = new Object[1];
                        o("\ueb50ꛗ\ud93b䦾ꢦ鯆ⱴ謼齟ꁲ鍶끚⃥ﻬ淘聭鱥ᥧ惹ﻗ", 19 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr7);
                        o.ea.f.c(strD3, sb2.append(((String) objArr7[0]).intern()).append(iVarA.b()).toString());
                    }
                    try {
                        o.ef.a aVarB2 = iVarA.b();
                        Object[] objArr8 = new Object[1];
                        o("┡槖\ue843ฆ縢츮㻐霵됦㰻\ue384⯞㻐霵愶륡", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 15, objArr8);
                        aVarX = aVarB2.x(((String) objArr8[0]).intern());
                        arrayList = new ArrayList();
                        arrayList2 = new ArrayList();
                    } catch (o.ef.b e3) {
                        e = e3;
                    }
                    for (o.en.e eVar : o.en.e.values()) {
                        int i12 = f21002i + 49;
                        f21001g = i12 % 128;
                        int i13 = i12 % 2;
                        String strA = eVar.a();
                        Integer numG = aVarX.g(strA);
                        if (o.ea.f.a()) {
                            String strD4 = d();
                            Object[] objArr9 = new Object[1];
                            m("\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{98, 33, 122, 11}, false, objArr9);
                            o.ea.f.c(strD4, String.format(((String) objArr9[0]).intern(), strA, numG));
                        }
                        if (numG == null) {
                            int i14 = f21001g + 13;
                            f21002i = i14 % 128;
                            if (i14 % 2 == 0) {
                                o.ea.f.a();
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            if (!(!o.ea.f.a())) {
                                int i15 = f21002i + 39;
                                f21001g = i15 % 128;
                                int i16 = i15 % 2;
                                String strD5 = d();
                                Object[] objArr10 = new Object[1];
                                m("\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000", new int[]{131, 79, 59, 0}, false, objArr10);
                                o.ea.f.c(strD5, ((String) objArr10[0]).intern());
                            }
                            if (o.ea.f.a()) {
                                String strD6 = d();
                                Object[] objArr11 = new Object[1];
                                m("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{35, 21, 0, 13}, false, objArr11);
                                o.ea.f.e(strD6, ((String) objArr11[0]).intern(), e);
                            }
                            f().d(o.bg.a.f21036e);
                            i().d(h());
                        }
                        try {
                            e eVarE = e(numG.intValue());
                            if (eVarE == null) {
                                arrayList2.add(eVar);
                            } else {
                                arrayList.add(eVarE);
                            }
                        } catch (o.ef.b e4) {
                            e = e4;
                        }
                    }
                    e eVar2 = null;
                    if (!arrayList2.isEmpty()) {
                        a aVarE = e();
                        Object[] objArr12 = new Object[1];
                        o("춲譝ّ蹽\u0bdd慎雴踙\udeec䙙玄䢙", Process.getGidForName("") + 12, objArr12);
                        aVarE.f20994m = aVarX.h(((String) objArr12[0]).intern()).booleanValue();
                        e().f20992g = arrayList2;
                    } else {
                        int i17 = f21001g + 9;
                        f21002i = i17 % 128;
                        int i18 = i17 % 2;
                        int iD = 0;
                        for (e eVar3 : arrayList) {
                            if (eVar3.d() > iD) {
                                iD = eVar3.d();
                                eVar2 = eVar3;
                            }
                        }
                        a aVarE2 = e();
                        Object[] objArr13 = new Object[1];
                        m("\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{Mp4VideoDirectory.TAG_COMPRESSION_TYPE, 15, 109, 14}, true, objArr13);
                        Object[] objArr14 = {aVarX, ((String) objArr13[0]).intern()};
                        int i19 = o.ef.a.f23782p * (-1576737484);
                        o.ef.a.f23782p = i19;
                        aVarE2.f20993j = (String) o.ef.a.a(-781664457, objArr14, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i19, Thread.currentThread().getPriority());
                        e().f20991f = eVar2;
                    }
                    i().d(h());
                } catch (o.bk.d e5) {
                    if (o.ea.f.a()) {
                        String strD7 = d();
                        Object[] objArr15 = new Object[1];
                        o("ꕹ\uf55d\ue843ฆ\uec83묶\uf606ﰱR\uf2fd술Ἱ镟\ue4d5\uf1f4뭫ﳎ貙R\uf2fd술Ἱ镟\ue4d5铲羪랫笺郀忦\ue30c钥铲羪齟ꁲꮏꨔ娸뼜䠥竧⃥ﻬ䦋妵\uec73밻㐣馇ᦴ瑻", 52 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr15);
                        o.ea.f.e(strD7, ((String) objArr15[0]).intern(), e5);
                    }
                    f().d(e5.c());
                } catch (o.bt.b e6) {
                    if (o.ea.f.a()) {
                        String strD8 = d();
                        Object[] objArr16 = new Object[1];
                        m("\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001", new int[]{56, 42, 8, 0}, false, objArr16);
                        o.ea.f.e(strD8, ((String) objArr16[0]).intern(), e6);
                    }
                    f().d(o.bg.a.C);
                } catch (o.bu.c e7) {
                    if (o.ea.f.a()) {
                        String strD9 = d();
                        Object[] objArr17 = new Object[1];
                        m("\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001", new int[]{56, 42, 8, 0}, false, objArr17);
                        o.ea.f.e(strD9, ((String) objArr17[0]).intern(), e7);
                    }
                    f().d(e7.c().a());
                } catch (o.bw.d e8) {
                    if (o.ea.f.a()) {
                        String strD10 = d();
                        Object[] objArr18 = new Object[1];
                        m("\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001", new int[]{56, 42, 8, 0}, false, objArr18);
                        o.ea.f.e(strD10, ((String) objArr18[0]).intern(), e8);
                    }
                    f().d(o.bg.a.f21045n);
                } catch (o.cg.a e9) {
                    if (o.ea.f.a()) {
                        String strD11 = d();
                        Object[] objArr19 = new Object[1];
                        m("\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001", new int[]{56, 42, 8, 0}, false, objArr19);
                        o.ea.f.e(strD11, ((String) objArr19[0]).intern(), e9);
                    }
                    f().d(e9.c().c());
                }
            } catch (o.bk.d e10) {
                if (o.ea.f.a()) {
                    String strD12 = d();
                    Object[] objArr20 = new Object[1];
                    m("\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001", new int[]{0, 29, 0, 0}, false, objArr20);
                    o.ea.f.e(strD12, ((String) objArr20[0]).intern(), e10);
                }
                f().d(e10.c());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0029 -> B:17:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(short r9, byte r10, short r11) {
        /*
            byte[] r8 = o.bf.a.$$d
            int r0 = r9 * 2
            int r0 = 121 - r0
            int r1 = r10 * 4
            int r7 = 3 - r1
            int r2 = r11 * 4
            int r1 = 1 - r2
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r8 != 0) goto L2f
            r2 = r7
            r1 = r4
            r3 = r5
        L18:
            int r0 = -r1
            int r7 = r7 + r0
            r0 = r7
            r7 = r2
        L1c:
            int r2 = r7 + 1
            byte r1 = (byte) r0
            r6[r3] = r1
            if (r3 != r4) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L29:
            int r3 = r3 + 1
            r1 = r8[r2]
            r7 = r0
            goto L18
        L2f:
            r3 = r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bf.a.$$j(short, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20990r = 0;
        f20988p = 1;
        f20986k = 0;
        f20989q = 1;
        k();
        Color.argb(0, 0, 0, 0);
        AudioTrack.getMinVolume();
        int i2 = f20990r + 123;
        f20988p = i2 % 128;
        int i3 = i2 % 2;
    }

    public a(Context context, b bVar, InterfaceC0340a interfaceC0340a) {
        super(context, interfaceC0340a, bVar, o.bg.e.f21103a);
        this.f20994m = false;
        this.f20995n = false;
    }

    static void init$0() {
        $$d = new byte[]{45, 113, 111, 122};
        $$e = 153;
    }

    static void k() {
        f20987l = new int[]{-1206220162, -1507245568, -1920166638, -1407686189, 164292497, -1491705062, 191224139, -2117292218, 551474916, -1457945017, -181363645, 1767039770, 1170900465, 1631127439, -1975200770, 91979214, 869661065, 361264924};
    }

    private d l() {
        int i2 = 2 % 2;
        d dVar = new d(this);
        int i3 = f20986k + 71;
        f20989q = i3 % 128;
        int i4 = i3 % 2;
        return dVar;
    }

    private static void s(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f20987l;
        int i4 = 989264422;
        int i5 = 0;
        if (iArr3 != null) {
            int i6 = $11 + 73;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                    Object objA = o.d.d.a(i4);
                    if (objA == null) {
                        byte b2 = (byte) i5;
                        byte b3 = b2;
                        objA = o.d.d.a(KeyEvent.getDeadChar(i5, i5) + 675, (char) View.MeasureSpec.getMode(i5), 11 - TextUtils.indexOf((CharSequence) "", '0'), -328001469, false, $$j(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr2[i7] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i7++;
                    i4 = 989264422;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f20987l;
        long j2 = 0;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i8])};
                Object objA2 = o.d.d.a(989264422);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(675 - (ViewConfiguration.getTouchSlop() >> 8), (char) (1 - (SystemClock.elapsedRealtimeNanos() > j2 ? 1 : (SystemClock.elapsedRealtimeNanos() == j2 ? 0 : -1))), 12 - (ViewConfiguration.getPressedStateDuration() >> 16), -328001469, false, $$j(b4, b5, b5), new Class[]{Integer.TYPE});
                }
                iArr6[i8] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                i8++;
                j2 = 0;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        lVar.f19941d = 0;
        while (lVar.f19941d < iArr.length) {
            int i9 = $11 + 55;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i11 = 0;
            for (int i12 = 16; i11 < i12; i12 = 16) {
                int i13 = $10 + 99;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                lVar.f19942e ^= iArr4[i11];
                Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA3 = o.d.d.a(2098218801);
                if (objA3 == null) {
                    int i15 = 301 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    char mode = (char) (52697 - View.MeasureSpec.getMode(0));
                    int size = View.MeasureSpec.getSize(0) + 11;
                    byte b6 = (byte) ($$e & 7);
                    byte b7 = (byte) (b6 - 1);
                    objA3 = o.d.d.a(i15, mode, size, -1416256172, false, $$j(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i11++;
            }
            int i16 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i16;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i17 = lVar.f19942e;
            int i18 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr4);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr5 = {lVar, lVar};
            Object objA4 = o.d.d.a(986820978);
            if (objA4 == null) {
                byte b8 = (byte) 2;
                byte b9 = (byte) (b8 - 2);
                objA4 = o.d.d.a(230 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (51004 - View.MeasureSpec.getMode(0)), TextUtils.indexOf("", "", 0) + 9, -330018025, false, $$j(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    @Override // o.ab.e
    public final /* synthetic */ o.ab.c c() {
        int i2 = 2 % 2;
        int i3 = f20986k + 25;
        f20989q = i3 % 128;
        int i4 = i3 % 2;
        d dVarL = l();
        int i5 = f20989q + 71;
        f20986k = i5 % 128;
        int i6 = i5 % 2;
        return dVarL;
    }

    public final void d(boolean z2) throws Throwable {
        int i2 = 2 % 2;
        this.f20996o = z2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            s(new int[]{-1176034468, 1680547541, 2056387687, 1811792609, -1835721295, -93335108, -681656094, -1658402504, 373021958, -1055263850, -2105530510, -706332958}, 23 - Color.argb(0, 0, 0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            s(new int[]{-1858380709, -6427253, -938871646, 1396483114, 936743567, 766513504, -257790338, -842293393, -1886974089, -49230010}, 18 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        this.f20995n = true;
        o.bu.e.a().d(b(), false, false);
        if (o.bw.a.a(b()).isEmpty()) {
            if (o.bq.b.c(b())) {
                a();
                return;
            }
            if (o.ea.f.a()) {
                int i3 = f20989q + 11;
                f20986k = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr3 = new Object[1];
                s(new int[]{-1176034468, 1680547541, 2056387687, 1811792609, -1835721295, -93335108, -681656094, -1658402504, 373021958, -1055263850, -2105530510, -706332958}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23, objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                s(new int[]{1518044633, 507227475, 671102929, -1853118817, -1854275810, 1868474752, -1611092036, -1480386305, 2084868910, -274679375, 1477888865, -2058205433, 1575929404, 1907129944, -2059290575, -967264389, 456271807, -1669474362}, AndroidCharacter.getMirror('0') - '\f', objArr4);
                o.ea.f.c(strIntern2, ((String) objArr4[0]).intern());
            }
            g().c(EligibilityDenialReason.CpuArchitectureNotSupported, null);
            return;
        }
        int i5 = f20986k + 89;
        f20989q = i5 % 128;
        int i6 = i5 % 2;
        if (o.ea.f.a()) {
            int i7 = f20989q + 79;
            f20986k = i7 % 128;
            int i8 = i7 % 2;
            Object[] objArr5 = new Object[1];
            s(new int[]{-1176034468, 1680547541, 2056387687, 1811792609, -1835721295, -93335108, -681656094, -1658402504, 373021958, -1055263850, -2105530510, -706332958}, 23 - KeyEvent.keyCodeFromString(""), objArr5);
            String strIntern3 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            s(new int[]{-1900753038, -433637390, 1136185611, 2005184201, 973298970, 773633986, -1672960283, 737863628, 1809223553, -2095470754, 1889118696, -1992362630, -962610481, 1517569973, 1491394353, -616176412, -36463695, 163758484, -1283222482, -1307021725, 936743567, 766513504, -257790338, -842293393, -1886974089, -49230010}, KeyEvent.getDeadChar(0, 0) + 50, objArr6);
            o.ea.f.c(strIntern3, ((String) objArr6[0]).intern());
        }
        o.bw.a.b();
        new o.dk.a(b()).d();
        c cVarD = d();
        o.bg.a aVar = o.bg.a.f21045n;
        Object[] objArr7 = new Object[1];
        s(new int[]{1001210433, 597528231, -395002044, 642969867, -661606021, 1512194312, -1170465582, -1481888792, 2120591084, 1026648869, -1100146257, 814076847, -891463545, -1373702335}, ((Process.getThreadPriority(0) + 20) >> 6) + 28, objArr7);
        cVarD.c(aVar, ((String) objArr7[0]).intern());
        g().e(d());
    }

    @Override // o.ab.e
    public final String e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20989q + 19;
        f20986k = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        s(new int[]{-1176034468, 1680547541, 2056387687, 1811792609, -1835721295, -93335108, -681656094, -1658402504, 373021958, -1055263850, -2105530510, -706332958}, 24 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f20989q + 51;
        f20986k = i5 % 128;
        if (i5 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    public final boolean m() {
        int i2 = 2 % 2;
        int i3 = f20986k + 87;
        int i4 = i3 % 128;
        f20989q = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        boolean z2 = this.f20995n;
        int i5 = i4 + 99;
        f20986k = i5 % 128;
        if (i5 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public final void o() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20986k + 55;
        f20989q = i3 % 128;
        if (i3 % 2 == 0) {
            i();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (i() != null) {
            int i4 = f20989q + 77;
            f20986k = i4 % 128;
            int i5 = i4 % 2;
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                s(new int[]{-1176034468, 1680547541, 2056387687, 1811792609, -1835721295, -93335108, -681656094, -1658402504, 373021958, -1055263850, -2105530510, -706332958}, TextUtils.lastIndexOf("", '0', 0, 0) + 24, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                s(new int[]{-695586449, 1458750693, -1176034468, 1680547541, 2056387687, 1811792609, -1835721295, -93335108, -681656094, -1658402504, -1411320500, 1728060363}, 21 - MotionEvent.axisFromString(""), objArr2);
                o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            }
            this.f20995n = false;
            int i6 = f20989q + 23;
            f20986k = i6 % 128;
            int i7 = i6 % 2;
        }
    }
}
