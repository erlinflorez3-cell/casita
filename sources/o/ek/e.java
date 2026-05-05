package o.ek;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.mov.metadata.QuickTimeMetadataDirectory;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import o.a.i;
import o.a.o;
import o.ea.f;
import o.ek.a;
import o.ek.b;
import o.ep.d;
import o.et.c;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static int f24022a = 0;

    /* JADX INFO: renamed from: b */
    public static int f24023b = 0;

    /* JADX INFO: renamed from: c */
    public static int f24024c = 0;

    /* JADX INFO: renamed from: d */
    public static int f24025d = 0;

    /* JADX INFO: renamed from: e */
    public static int f24026e = 0;

    /* JADX INFO: renamed from: f */
    public static int f24027f = 0;

    /* JADX INFO: renamed from: g */
    public static int f24028g = 0;

    /* JADX INFO: renamed from: h */
    public static int f24029h = 0;

    /* JADX INFO: renamed from: i */
    public static int f24030i = 0;

    /* JADX INFO: renamed from: j */
    public static int f24031j = 0;

    /* JADX INFO: renamed from: l */
    public static int f24032l = 0;

    /* JADX INFO: renamed from: p */
    private static long f24033p = 0;

    /* JADX INFO: renamed from: q */
    private static int f24034q = 0;

    /* JADX INFO: renamed from: r */
    private static char[] f24035r = null;

    /* JADX INFO: renamed from: s */
    private static int f24036s = 0;

    /* JADX INFO: renamed from: t */
    private static int f24037t = 0;

    /* JADX INFO: renamed from: u */
    public static int f24038u = 0;

    /* JADX INFO: renamed from: v */
    public static int f24039v = 0;

    /* JADX INFO: renamed from: y */
    private static int f24040y = 0;

    /* JADX INFO: renamed from: m */
    private final HashMap<String, o.ek.a> f24042m = new HashMap<>();

    /* JADX INFO: renamed from: o */
    private final HashMap<String, b> f24044o = new HashMap<>();

    /* JADX INFO: renamed from: n */
    private final LinkedHashMap<String, d> f24043n = new LinkedHashMap<>();

    /* JADX INFO: renamed from: k */
    private final LinkedHashMap<String, d> f24041k = new LinkedHashMap<>();

    /* JADX INFO: renamed from: o.ek.e$1 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a */
        private static int f24045a = 1;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f24046b;

        /* JADX INFO: renamed from: e */
        private static int f24047e = 0;

        static {
            int[] iArr = new int[o.eq.d.values().length];
            f24046b = iArr;
            try {
                iArr[o.eq.d.f24730a.ordinal()] = 1;
                int i2 = f24045a + 9;
                f24047e = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24046b[o.eq.d.f24731b.ordinal()] = 2;
                int i4 = f24045a + 19;
                f24047e = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24046b[o.eq.d.f24733d.ordinal()] = 3;
                int i7 = f24045a;
                int i8 = (((i7 + 21) - (21 & i7)) << 1) - (i7 ^ 21);
                f24047e = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24046b[o.eq.d.f24734e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24046b[o.eq.d.f24732c.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final class a extends Enum<a> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        public static final a f24048a;

        /* JADX INFO: renamed from: b */
        public static final a f24049b;

        /* JADX INFO: renamed from: c */
        private static final /* synthetic */ a[] f24050c;

        /* JADX INFO: renamed from: d */
        private static long f24051d = 0;

        /* JADX INFO: renamed from: e */
        public static final a f24052e;

        /* JADX INFO: renamed from: f */
        private static int f24053f = 0;

        /* JADX INFO: renamed from: g */
        private static int f24054g = 0;

        /* JADX INFO: renamed from: h */
        private static int f24055h = 0;

        /* JADX INFO: renamed from: i */
        private static char f24056i = 0;

        /* JADX INFO: renamed from: j */
        private static int f24057j = 0;

        /* JADX INFO: renamed from: n */
        private static int f24058n = 0;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0017  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x001d -> B:17:0x0011). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(byte r7, byte r8, byte r9) {
            /*
                int r7 = r7 + 4
                int r6 = r8 * 2
                int r0 = r6 + 1
                int r5 = 122 - r9
                byte[] r4 = o.ek.e.a.$$a
                byte[] r3 = new byte[r0]
                r2 = 0
                if (r4 != 0) goto L24
                r0 = r6
                r1 = r2
            L11:
                int r5 = r5 + r0
            L12:
                byte r0 = (byte) r5
                r3[r1] = r0
                if (r1 != r6) goto L1d
                java.lang.String r0 = new java.lang.String
                r0.<init>(r3, r2)
                return r0
            L1d:
                int r1 = r1 + 1
                int r7 = r7 + 1
                r0 = r4[r7]
                goto L11
            L24:
                r1 = r2
                goto L12
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ek.e.a.$$c(byte, byte, byte):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f24053f = 0;
            f24058n = 1;
            f24054g = 0;
            f24055h = 1;
            d();
            Object[] objArr = new Object[1];
            k((char) TextUtils.getTrimmedLength(""), "鷓觝垌囜烙氉Ⴭ紜\uf017\udeee궆畓⾷䓶㙞ಏ馫笺⇑犟욜뙑\ue337姏꫁", "\u0000\u0000\u0000\u0000", "辀읬ᐌ酶", 214396047 - View.resolveSize(0, 0), objArr);
            f24052e = new a(((String) objArr[0]).intern(), 0);
            Object[] objArr2 = new Object[1];
            k((char) (14096 - View.MeasureSpec.getSize(0)), "嗎雚쭃輪孪‧蝟鮡겅蕏ퟨ鎣ĺ\uabfd\uf1faﮡ紇貳", "\u0000\u0000\u0000\u0000", "ଔꃿံ輷", 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr2);
            f24049b = new a(((String) objArr2[0]).intern(), 1);
            Object[] objArr3 = new Object[1];
            k((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43924), "툘㕪뵝讄", "\u0000\u0000\u0000\u0000", "컻㮳鐤↫", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, objArr3);
            f24048a = new a(((String) objArr3[0]).intern(), 2);
            f24050c = e();
            int i2 = f24053f + 11;
            f24058n = i2 % 128;
            int i3 = i2 % 2;
        }

        private a(String str, int i2) {
            super(str, i2);
        }

        static void d() {
            f24051d = 740602047300126166L;
            f24057j = 1707898229;
            f24056i = (char) 17878;
        }

        private static /* synthetic */ a[] e() {
            int i2 = 2 % 2;
            int i3 = f24055h;
            int i4 = i3 + 125;
            f24054g = i4 % 128;
            int i5 = i4 % 2;
            a[] aVarArr = {f24052e, f24049b, f24048a};
            int i6 = i3 + 23;
            f24054g = i6 % 128;
            if (i6 % 2 == 0) {
                return aVarArr;
            }
            throw null;
        }

        static void init$0() {
            $$a = new byte[]{34, -117, -98, -86};
            $$b = 67;
        }

        private static void k(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            int i3 = 2;
            int i4 = 2 % 2;
            int i5 = $11 + 5;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            Object charArray = str6;
            if (str6 != null) {
                charArray = str6.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            Object charArray2 = str5;
            if (str5 != null) {
                int i7 = $11 + 95;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                charArray2 = str5.toCharArray();
            }
            char[] cArr2 = (char[]) charArray2;
            Object charArray3 = str4;
            if (str4 != null) {
                charArray3 = str4.toCharArray();
            }
            i iVar = new i();
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
            while (iVar.f19932b < length3) {
                int i9 = $10 + 7;
                $11 = i9 % 128;
                int i10 = i9 % i3;
                try {
                    Object[] objArr2 = {iVar};
                    Object objA = o.d.d.a(540069882);
                    if (objA == null) {
                        byte b2 = (byte) (-1);
                        byte b3 = (byte) (b2 + 1);
                        objA = o.d.d.a((-16777110) - Color.rgb(0, 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 11, -155898465, false, $$c(b2, b3, (byte) (57 | b3)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {iVar};
                    Object objA2 = o.d.d.a(2068572);
                    if (objA2 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        objA2 = o.d.d.a(847 - (Process.myPid() >> 22), (char) (6488 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12, -694521287, false, $$c(b4, b5, (byte) (54 | b5)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                    Object objA3 = o.d.d.a(-1122996612);
                    if (objA3 == null) {
                        byte b6 = (byte) (-1);
                        byte b7 = (byte) (b6 + 1);
                        objA3 = o.d.d.a(View.MeasureSpec.makeMeasureSpec(0, 0) + 458, (char) View.MeasureSpec.getSize(0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 11, 1804962841, false, $$c(b6, b7, (byte) ((-1) - (((-1) - b7) & ((-1) - 56)))), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                    Object objA4 = o.d.d.a(-1223178239);
                    if (objA4 == null) {
                        byte b8 = (byte) (-1);
                        byte b9 = (byte) (b8 + 1);
                        objA4 = o.d.d.a(639 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (65100 - (ViewConfiguration.getLongPressTimeout() >> 16)), 12 - View.combineMeasuredStates(0, 0), 1636969060, false, $$c(b8, b9, b9), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                    cArr3[iIntValue2] = iVar.f19933e;
                    cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r8[iVar.f19932b])) ^ (f24051d ^ 740602047300126166L)) ^ ((long) ((int) (((long) f24057j) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f24056i) ^ 740602047300126166L))));
                    iVar.f19932b++;
                    i3 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            String str7 = new String(cArr5);
            int i11 = $10 + 121;
            $11 = i11 % 128;
            if (i11 % 2 != 0) {
                objArr[0] = str7;
            } else {
                int i12 = 67 / 0;
                objArr[0] = str7;
            }
        }

        public static a valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f24055h + 31;
            f24054g = i3 % 128;
            int i4 = i3 % 2;
            a aVar = (a) Enum.valueOf(a.class, str);
            int i5 = f24055h + 125;
            f24054g = i5 % 128;
            if (i5 % 2 == 0) {
                return aVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static a[] values() {
            int i2 = 2 % 2;
            int i3 = f24055h + 17;
            f24054g = i3 % 128;
            int i4 = i3 % 2;
            a[] aVarArr = f24050c;
            if (i4 == 0) {
                return (a[]) aVarArr.clone();
            }
            throw null;
        }
    }

    private static String $$g(int i2, short s2, int i3) {
        byte[] bArr = $$c;
        int i4 = 105 - i2;
        int i5 = s2 * 3;
        int i6 = 4 - (i3 * 3);
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        int i8 = -1;
        if (bArr == null) {
            i4 = i7 + i6;
            i6++;
        }
        while (true) {
            i8++;
            bArr2[i8] = (byte) i4;
            if (i8 == i7) {
                return new String(bArr2, 0);
            }
            int i9 = i6;
            i4 += bArr[i6];
            i6 = i9 + 1;
        }
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f24039v = 474915397;
        f24038u = 1690163638;
        init$0();
        f24032l = -665933309;
        f24029h = -1317004738;
        f24027f = -1710045085;
        f24028g = -1610292741;
        f24030i = -1079020661;
        f24031j = -2024842421;
        f24025d = -1613450937;
        f24026e = -1501618159;
        f24023b = 5516651;
        f24022a = -1291193611;
        f24024c = -1627335127;
        f24037t = 0;
        f24040y = 1;
        f24036s = 0;
        f24034q = 1;
        i();
        SystemClock.uptimeMillis();
        Color.alpha(0);
        ViewConfiguration.getScrollBarSize();
        TextUtils.lastIndexOf("", '0', 0, 0);
        SystemClock.elapsedRealtime();
        TextUtils.lastIndexOf("", '0');
        TextUtils.getOffsetBefore("", 0);
        SystemClock.currentThreadTimeMillis();
        ViewConfiguration.getEdgeSlop();
        TextUtils.indexOf("", "", 0, 0);
        ViewConfiguration.getScrollDefaultDelay();
        View.MeasureSpec.makeMeasureSpec(0, 0);
        TextUtils.getOffsetBefore("", 0);
        SystemClock.elapsedRealtime();
        ExpandableListView.getPackedPositionType(0L);
        Process.getGidForName("");
        ViewConfiguration.getScrollDefaultDelay();
        Color.red(0);
        PointF.length(0.0f, 0.0f);
        View.MeasureSpec.getMode(0);
        KeyEvent.normalizeMetaState(0);
        int i2 = f24040y + 33;
        f24037t = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        e eVar = (e) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        o.en.e eVar2 = (o.en.e) objArr[3];
        int i2 = 2 % 2;
        int i3 = f24036s + 3;
        f24034q = i3 % 128;
        if (i3 % 2 == 0) {
            eVar.f24041k.put(str, d.a(str, eVar2, str2));
            throw null;
        }
        eVar.f24041k.put(str, d.a(str, eVar2, str2));
        int i4 = f24036s + 29;
        f24034q = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private c a(String str) {
        int i2 = 2 % 2;
        if (str == null) {
            return null;
        }
        for (d dVar : this.f24043n.values()) {
            int i3 = f24034q + 75;
            f24036s = i3 % 128;
            int i4 = i3 % 2;
            if (dVar.A() == null) {
                break;
            }
            Iterator<o.ep.a> it = dVar.A().values().iterator();
            while (it.hasNext()) {
                int i5 = f24034q + 9;
                f24036s = i5 % 128;
                if (i5 % 2 != 0) {
                    it.next().c().iterator();
                    throw null;
                }
                for (c cVar : it.next().c()) {
                    if (cVar.k().equals(str)) {
                        return cVar;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0317  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object b(int r17, int r18, int r19, int r20, java.lang.Object[] r21, int r22, int r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 814
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ek.e.b(int, int, int, int, java.lang.Object[], int, int):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:353:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0a4a  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0b25 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object b(java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2937
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ek.e.b(java.lang.Object[]):java.lang.Object");
    }

    private o.ek.a b(o.fj.b bVar, o.eq.b bVar2, d dVar, a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24034q + 3;
        f24036s = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        w((char) View.MeasureSpec.getSize(0), 198 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 11 - ((Process.getThreadPriority(0) + 20) >> 6), objArr);
        String strIntern = ((String) objArr[0]).intern();
        o.ek.a aVar2 = this.f24042m.get(bVar2.k());
        if (aVar2 == null) {
            if (f.a()) {
                Object[] objArr2 = new Object[1];
                w((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 41756), TextUtils.lastIndexOf("", '0', 0) + 1433, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 64, objArr2);
                String strIntern2 = ((String) objArr2[0]).intern();
                String strK = bVar2.k();
                int priority = Thread.currentThread().getPriority();
                int i5 = (int) Runtime.getRuntime().totalMemory();
                int i6 = o.eq.b.f24696b * 579433029;
                o.eq.b.f24696b = i6;
                f.c(strIntern, String.format(strIntern2, strK, (o.eq.d) o.eq.b.e(i6, Thread.currentThread().getPriority(), i5, -578669383, priority, 578669383, new Object[]{bVar2})));
            }
            String strK2 = bVar2.k();
            String strB = dVar.b();
            int priority2 = Thread.currentThread().getPriority();
            int i7 = (int) Runtime.getRuntime().totalMemory();
            int i8 = o.eq.b.f24696b * 579433029;
            o.eq.b.f24696b = i8;
            o.ek.a aVar3 = new o.ek.a(strK2, strB, (o.eq.d) o.eq.b.e(i8, Thread.currentThread().getPriority(), i7, -578669383, priority2, 578669383, new Object[]{bVar2}), bVar2.s(), null, true);
            int priority3 = Thread.currentThread().getPriority();
            int i9 = (int) Runtime.getRuntime().totalMemory();
            int i10 = o.eq.b.f24696b * 579433029;
            o.eq.b.f24696b = i10;
            if (((o.eq.d) o.eq.b.e(i10, Thread.currentThread().getPriority(), i9, -578669383, priority3, 578669383, new Object[]{bVar2})) != o.eq.d.f24732c) {
                this.f24042m.put(aVar3.b(), aVar3);
                int priority4 = Thread.currentThread().getPriority();
                int i11 = (int) Runtime.getRuntime().totalMemory();
                int i12 = o.eq.b.f24696b * 579433029;
                o.eq.b.f24696b = i12;
                Object[] objArr3 = {bVar, (o.eq.d) o.eq.b.e(i12, Thread.currentThread().getPriority(), i11, -578669383, priority4, 578669383, new Object[]{bVar2}), bVar2};
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int id = (int) Thread.currentThread().getId();
                int iNextInt = new Random().nextInt();
                int i13 = o.fj.b.f25910n * 338152958;
                o.fj.b.f25910n = i13;
                o.fj.b.e(678627396, id, iMaxMemory, -678627392, objArr3, i13, iNextInt);
                int priority5 = Thread.currentThread().getPriority();
                int i14 = (int) Runtime.getRuntime().totalMemory();
                int i15 = o.eq.b.f24696b * 579433029;
                o.eq.b.f24696b = i15;
                Object[] objArr4 = {bVar, bVar2, dVar, (o.eq.d) o.eq.b.e(i15, Thread.currentThread().getPriority(), i14, -578669383, priority5, 578669383, new Object[]{bVar2}), aVar};
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i16 = f24024c * 1538781690;
                f24024c = i16;
                b(iElapsedRealtime, 1201789185, i16, iUptimeMillis, objArr4, iFreeMemory, -1201789185);
            }
            return aVar3;
        }
        if (f.a()) {
            StringBuilder sb = new StringBuilder();
            Object[] objArr5 = new Object[1];
            w((char) (33387 - TextUtils.indexOf("", "", 0, 0)), View.combineMeasuredStates(0, 0) + 1497, 46 - View.resolveSize(0, 0), objArr5);
            f.c(strIntern, sb.append(((String) objArr5[0]).intern()).append(bVar2.k()).toString());
        }
        o.eq.d dVarD = aVar2.d();
        int priority6 = Thread.currentThread().getPriority();
        int i17 = (int) Runtime.getRuntime().totalMemory();
        int i18 = o.eq.b.f24696b * 579433029;
        o.eq.b.f24696b = i18;
        o.eq.d dVarC = c(dVarD, (o.eq.d) o.eq.b.e(i18, Thread.currentThread().getPriority(), i17, -578669383, priority6, 578669383, new Object[]{bVar2}));
        if (f.a()) {
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            w((char) ((-1) - TextUtils.lastIndexOf("", '0')), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1542, TextUtils.indexOf((CharSequence) "", '0', 0) + 43, objArr6);
            f.c(strIntern, sb2.append(((String) objArr6[0]).intern()).append(dVarC).toString());
            int i19 = f24034q + 121;
            f24036s = i19 % 128;
            int i20 = i19 % 2;
        }
        if (dVarC != aVar2.d()) {
            if (f.a()) {
                StringBuilder sb3 = new StringBuilder();
                Object[] objArr7 = new Object[1];
                w((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1585, TextUtils.lastIndexOf("", '0') + 55, objArr7);
                StringBuilder sbAppend = sb3.append(((String) objArr7[0]).intern()).append(aVar2.d());
                Object[] objArr8 = new Object[1];
                w((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 31564), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1639, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4, objArr8);
                f.c(strIntern, sbAppend.append(((String) objArr8[0]).intern()).append(dVarC).toString());
            }
            int priority7 = Thread.currentThread().getPriority();
            int i21 = (int) Runtime.getRuntime().totalMemory();
            int i22 = o.eq.b.f24696b * 579433029;
            o.eq.b.f24696b = i22;
            Object[] objArr9 = {bVar, (o.eq.d) o.eq.b.e(i22, Thread.currentThread().getPriority(), i21, -578669383, priority7, 578669383, new Object[]{bVar2}), bVar2};
            int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
            int id2 = (int) Thread.currentThread().getId();
            int iNextInt2 = new Random().nextInt();
            int i23 = o.fj.b.f25910n * 338152958;
            o.fj.b.f25910n = i23;
            o.fj.b.e(678627396, id2, iMaxMemory2, -678627392, objArr9, i23, iNextInt2);
            int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
            int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
            int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
            int i24 = f24024c * 1538781690;
            f24024c = i24;
            b(iElapsedRealtime2, 1201789185, i24, iUptimeMillis2, new Object[]{bVar, bVar2, dVar, dVarC, aVar}, iFreeMemory2, -1201789185);
        } else {
            if (f.a()) {
                StringBuilder sb4 = new StringBuilder();
                Object[] objArr10 = new Object[1];
                w((char) (14515 - TextUtils.lastIndexOf("", '0')), 1644 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 50, objArr10);
                f.c(strIntern, sb4.append(((String) objArr10[0]).intern()).append(aVar2.d()).toString());
            }
            if (aVar != a.f24048a) {
                int i25 = f24036s + 75;
                f24034q = i25 % 128;
                int i26 = i25 % 2;
                Object[] objArr11 = {bVar, bVar2, dVar, aVar2.d(), aVar};
                int iElapsedRealtime3 = (int) SystemClock.elapsedRealtime();
                int iUptimeMillis3 = (int) SystemClock.uptimeMillis();
                int iFreeMemory3 = (int) Runtime.getRuntime().freeMemory();
                int i27 = f24024c * 1538781690;
                f24024c = i27;
                b(iElapsedRealtime3, 1201789185, i27, iUptimeMillis3, objArr11, iFreeMemory3, -1201789185);
            }
        }
        aVar2.c(dVarC);
        int priority8 = Thread.currentThread().getPriority();
        int i28 = (int) Runtime.getRuntime().totalMemory();
        int i29 = o.eq.b.f24696b * 579433029;
        o.eq.b.f24696b = i29;
        if (((o.eq.d) o.eq.b.e(i29, Thread.currentThread().getPriority(), i28, -578669383, priority8, 578669383, new Object[]{bVar2})) != o.eq.d.f24730a && (bVar2 instanceof c)) {
            int i30 = f24036s + 21;
            f24034q = i30 % 128;
            int i31 = i30 % 2;
            this.f24042m.remove(c.a(bVar2.k()));
        }
        if (dVarC == o.eq.d.f24731b) {
            if (!aVar2.h()) {
                bVar2.x();
            }
            String strE = aVar2.e();
            Map<String, o.cs.d> mapR = bVar2.r();
            if (strE != null && mapR != null && !mapR.isEmpty()) {
                int i32 = f24036s + 69;
                f24034q = i32 % 128;
                int i33 = i32 % 2;
                bVar2.e(mapR.get(strE));
            }
        } else {
            bVar2.a((Map<String, o.cs.d>) null);
        }
        if (dVarC == o.eq.d.f24732c) {
            this.f24042m.remove(bVar2.k());
        }
        bVar2.c(dVarC);
        return aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static o.fj.a b(o.fj.a r3, o.ek.e.a r4) {
        /*
            r2 = 2
            int r0 = r2 % r2
            int r0 = o.ek.e.f24036s
            int r1 = r0 + 91
            int r0 = r1 % 128
            o.ek.e.f24034q = r0
            int r1 = r1 % r2
            if (r1 != 0) goto L26
            o.fj.a r1 = o.fj.a.f25887e
            r0 = 7
            int r0 = r0 / 0
            if (r3 == r1) goto L1f
        L15:
            o.fj.a r0 = o.fj.a.f25884b
            if (r3 == r0) goto L1f
            o.fj.a r0 = o.fj.a.f25885c
            if (r3 == r0) goto L1f
            if (r3 != 0) goto L3c
        L1f:
            o.ek.e$a r0 = o.ek.e.a.f24052e
            if (r4 != r0) goto L2b
            o.fj.a r0 = o.fj.a.f25888f
            return r0
        L26:
            o.fj.a r0 = o.fj.a.f25887e
            if (r3 == r0) goto L1f
            goto L15
        L2b:
            int r0 = o.ek.e.f24036s
            int r1 = r0 + 115
            int r0 = r1 % 128
            o.ek.e.f24034q = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L37
            return r3
        L37:
            r0 = 0
            r0.hashCode()
            throw r0
        L3c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ek.e.b(o.fj.a, o.ek.e$a):o.fj.a");
    }

    private static void b(o.fj.b bVar, o.eq.b bVar2, d dVar, o.eq.d dVar2, a aVar) throws Throwable {
        Object[] objArr = {bVar, bVar2, dVar, dVar2, aVar};
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i2 = f24024c * 1538781690;
        f24024c = i2;
        b(iElapsedRealtime, 1201789185, i2, iUptimeMillis, objArr, iFreeMemory, -1201789185);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0047 A[PHI: r3 r5
  0x0047: PHI (r3v13 o.er.b) = (r3v2 o.er.b), (r3v16 o.er.b) binds: [B:88:0x0157, B:73:0x0045] A[DONT_GENERATE, DONT_INLINE]
  0x0047: PHI (r5v6 java.lang.String) = (r5v2 java.lang.String), (r5v8 java.lang.String) binds: [B:88:0x0157, B:73:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015b A[PHI: r3 r5
  0x015b: PHI (r3v3 o.er.b) = (r3v2 o.er.b), (r3v16 o.er.b) binds: [B:88:0x0157, B:73:0x0045] A[DONT_GENERATE, DONT_INLINE]
  0x015b: PHI (r5v3 java.lang.String) = (r5v2 java.lang.String), (r5v8 java.lang.String) binds: [B:88:0x0157, B:73:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object c(java.lang.Object[] r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ek.e.c(java.lang.Object[]):java.lang.Object");
    }

    public static LinkedHashMap<String, d> c(o.ef.c cVar) throws Throwable {
        int i2 = 2 % 2;
        LinkedHashMap<String, d> linkedHashMap = new LinkedHashMap<>();
        int i3 = 0;
        while (true) {
            try {
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i4 = o.ef.c.f23799b * 1567746851;
                o.ef.c.f23799b = i4;
                int i5 = 1136425123 * o.ef.c.f23798a;
                o.ef.c.f23798a = i5;
                if (i3 >= ((Integer) o.ef.c.b((int) Runtime.getRuntime().maxMemory(), i5, i4, -1513293186, elapsedCpuTime, 1513293186, new Object[]{cVar})).intValue()) {
                    return linkedHashMap;
                }
                o.ef.a aVarD = cVar.d(i3);
                new o.ci.e();
                d dVarC = o.ci.e.c(aVarD);
                Object obj = null;
                if (dVarC == null) {
                    int i6 = f24034q + 87;
                    f24036s = i6 % 128;
                    if (i6 % 2 != 0) {
                        f.a();
                        obj.hashCode();
                        throw null;
                    }
                    if (f.a()) {
                        Object[] objArr = new Object[1];
                        w((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 198, TextUtils.indexOf((CharSequence) "", '0', 0) + 12, objArr);
                        String strIntern = ((String) objArr[0]).intern();
                        Object[] objArr2 = new Object[1];
                        w((char) ((ViewConfiguration.getTapTimeout() >> 16) + 36584), 1271 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 34, objArr2);
                        f.c(strIntern, ((String) objArr2[0]).intern());
                    }
                } else {
                    if (linkedHashMap.put(dVarC.b(), dVarC) != null) {
                        Object[] objArr3 = new Object[1];
                        w((char) (ViewConfiguration.getTapTimeout() >> 16), Color.blue(0) + 1341, 42 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
                        throw new o.en.f(((String) objArr3[0]).intern());
                    }
                    int i7 = f24036s + 17;
                    f24034q = i7 % 128;
                    if (i7 % 2 == 0) {
                        f.a();
                        throw null;
                    }
                    if (f.a()) {
                        Object[] objArr4 = new Object[1];
                        w((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 199 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 11, objArr4);
                        String strIntern2 = ((String) objArr4[0]).intern();
                        Object[] objArr5 = new Object[1];
                        w((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), TextUtils.lastIndexOf("", '0', 0) + QuickTimeMetadataDirectory.TAG_LOCATION_DATE, 39 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr5);
                        f.c(strIntern2, ((String) objArr5[0]).intern());
                        int i8 = f24034q + 103;
                        f24036s = i8 % 128;
                        if (i8 % 2 != 0) {
                            int i9 = 4 / 2;
                        }
                    }
                }
                i3++;
            } catch (o.ef.b e2) {
                StringBuilder sb = new StringBuilder();
                Object[] objArr6 = new Object[1];
                w((char) (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1383, 48 - TextUtils.lastIndexOf("", '0', 0), objArr6);
                throw new o.en.f(sb.append(((String) objArr6[0]).intern()).append(e2.getMessage()).toString());
            }
        }
    }

    private static o.eq.d c(o.eq.d dVar, o.eq.d dVar2) {
        int i2 = 2 % 2;
        if (dVar == o.eq.d.f24732c) {
            int i3 = f24036s + 25;
            f24034q = i3 % 128;
            if (i3 % 2 != 0) {
                return o.eq.d.f24732c;
            }
            int i4 = 10 / 0;
            return o.eq.d.f24732c;
        }
        if (dVar2 == o.eq.d.f24731b && dVar == o.eq.d.f24733d) {
            int i5 = f24034q + 9;
            f24036s = i5 % 128;
            int i6 = i5 % 2;
            return o.eq.d.f24733d;
        }
        if (dVar != o.eq.d.f24736h || dVar2 == o.eq.d.f24732c) {
            return dVar2;
        }
        int i7 = f24036s + 93;
        f24034q = i7 % 128;
        if (i7 % 2 != 0) {
            return o.eq.d.f24736h;
        }
        o.eq.d dVar3 = o.eq.d.f24736h;
        throw null;
    }

    private void c(d dVar) throws Throwable {
        int priority = Thread.currentThread().getPriority();
        int i2 = f24031j * 244712428;
        f24031j = i2;
        int i3 = f24030i * (-1718398185);
        f24030i = i3;
        b(priority, -998435311, Process.myPid(), i2, new Object[]{this, dVar}, i3, 998435314);
    }

    private void d(o.ef.c cVar) throws Throwable {
        int iMyUid = Process.myUid();
        int i2 = f24028g * (-1600048184);
        f24028g = i2;
        int priority = Thread.currentThread().getPriority();
        int i3 = f24027f * 1856045561;
        f24027f = i3;
        b(iMyUid, 26815844, i3, i2, new Object[]{this, cVar}, priority, -26815840);
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        e eVar = (e) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = f24034q + 101;
        f24036s = i3 % 128;
        int i4 = i3 % 2;
        LinkedHashMap<String, d> linkedHashMap = eVar.f24041k;
        if (i4 != 0) {
            linkedHashMap.containsKey(str);
            throw null;
        }
        boolean zContainsKey = linkedHashMap.containsKey(str);
        int i5 = f24036s + 69;
        f24034q = i5 % 128;
        int i6 = i5 % 2;
        return Boolean.valueOf(zContainsKey);
    }

    private void e(o.ef.c cVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24034q + 37;
        f24036s = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            Object[] objArr = new Object[1];
            w((char) (ViewConfiguration.getTouchSlop() >> 8), 198 - Color.blue(0), KeyEvent.getDeadChar(0, 0) + 11, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            w((char) (MotionEvent.axisFromString("") + 11565), 282 - KeyEvent.normalizeMetaState(0), 30 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
            f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(cVar).toString());
        }
        new b.c();
        int i5 = f24036s + 121;
        f24034q = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 3 % 3;
        }
        int i7 = 0;
        while (true) {
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i8 = o.ef.c.f23799b * 1567746851;
            o.ef.c.f23799b = i8;
            int i9 = 1136425123 * o.ef.c.f23798a;
            o.ef.c.f23798a = i9;
            if (i7 >= ((Integer) o.ef.c.b((int) Runtime.getRuntime().maxMemory(), i9, i8, -1513293186, elapsedCpuTime, 1513293186, new Object[]{cVar})).intValue()) {
                return;
            }
            int i10 = f24034q + 111;
            f24036s = i10 % 128;
            int i11 = i10 % 2;
            b bVarD = b.c.d(cVar.d(i7));
            if (this.f24044o.put(bVarD.e(), bVarD) != null) {
                Object[] objArr3 = new Object[1];
                w((char) TextUtils.getTrimmedLength(""), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 312, 30 - View.MeasureSpec.getSize(0), objArr3);
                throw new o.ef.b(((String) objArr3[0]).intern());
            }
            i7++;
        }
    }

    private boolean e(o.eq.b bVar) throws Throwable {
        int i2 = 2 % 2;
        if (!(bVar instanceof c)) {
            if (f.a()) {
                Object[] objArr = new Object[1];
                w((char) (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 198, 11 - TextUtils.getOffsetAfter("", 0), objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                w((char) (KeyEvent.keyCodeFromString("") + 1366), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1691, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 41, objArr2);
                StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern()).append(bVar.k());
                Object[] objArr3 = new Object[1];
                w((char) ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1732, 53 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr3);
                f.c(strIntern, sbAppend.append(((String) objArr3[0]).intern()).toString());
            }
            return false;
        }
        c cVarA = a(bVar.k());
        if (cVarA == null) {
            int i3 = f24036s + 85;
            f24034q = i3 % 128;
            int i4 = i3 % 2;
            if (f.a()) {
                Object[] objArr4 = new Object[1];
                w((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 199 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), Color.green(0) + 11, objArr4);
                String strIntern2 = ((String) objArr4[0]).intern();
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr5 = new Object[1];
                w((char) (1365 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getEdgeSlop() >> 16) + 1692, 41 - Gravity.getAbsoluteGravity(0, 0), objArr5);
                StringBuilder sbAppend2 = sb2.append(((String) objArr5[0]).intern()).append(bVar.k());
                Object[] objArr6 = new Object[1];
                w((char) (ViewConfiguration.getPressedStateDuration() >> 16), 1785 - View.MeasureSpec.getMode(0), 53 - Color.alpha(0), objArr6);
                f.c(strIntern2, sbAppend2.append(((String) objArr6[0]).intern()).toString());
            }
            return false;
        }
        c cVar = (c) bVar;
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i5 = c.f25343l * (-1658435610);
        c.f25343l = i5;
        int i6 = c.f25348q * 740487534;
        c.f25348q = i6;
        int i7 = c.f25347p * (-1494696993);
        c.f25347p = i7;
        String str = (String) c.d(-1396987465, new Object[]{cVarA}, iUptimeMillis, 1396987468, i5, i6, i7);
        int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
        c.f25343l = c.f25343l * (-1658435610);
        c.f25348q = c.f25348q * 740487534;
        c.f25347p = c.f25347p * (-1494696993);
        if (!(!str.equals((String) c.d(-1396987465, new Object[]{cVar}, iUptimeMillis2, 1396987468, r24, r25, r26)))) {
            if (f.a()) {
                Object[] objArr7 = new Object[1];
                w((char) (ViewConfiguration.getPressedStateDuration() >> 16), 198 - View.combineMeasuredStates(0, 0), 10 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr7);
                String strIntern3 = ((String) objArr7[0]).intern();
                StringBuilder sb3 = new StringBuilder();
                Object[] objArr8 = new Object[1];
                w((char) (1297 - KeyEvent.normalizeMetaState(0)), 1837 - ((byte) KeyEvent.getModifierMetaStateMask()), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 52, objArr8);
                StringBuilder sbAppend3 = sb3.append(((String) objArr8[0]).intern()).append(bVar.k());
                Object[] objArr9 = new Object[1];
                w((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 1921 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 21 - Color.green(0), objArr9);
                f.c(strIntern3, sbAppend3.append(((String) objArr9[0]).intern()).toString());
            }
            return false;
        }
        if (f.a()) {
            Object[] objArr10 = new Object[1];
            w((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), Color.green(0) + 198, 11 - TextUtils.indexOf("", ""), objArr10);
            String strIntern4 = ((String) objArr10[0]).intern();
            StringBuilder sb4 = new StringBuilder();
            Object[] objArr11 = new Object[1];
            w((char) (Gravity.getAbsoluteGravity(0, 0) + QuickTimeMetadataDirectory.TAG_YEAR), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1838, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 53, objArr11);
            StringBuilder sbAppend4 = sb4.append(((String) objArr11[0]).intern()).append(bVar.k());
            Object[] objArr12 = new Object[1];
            w((char) Drawable.resolveOpacity(0, 0), 1890 - View.combineMeasuredStates(0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 24, objArr12);
            StringBuilder sbAppend5 = sbAppend4.append(((String) objArr12[0]).intern());
            int iUptimeMillis3 = (int) SystemClock.uptimeMillis();
            int i8 = c.f25343l * (-1658435610);
            c.f25343l = i8;
            int i9 = c.f25348q * 740487534;
            c.f25348q = i9;
            int i10 = c.f25347p * (-1494696993);
            c.f25347p = i10;
            StringBuilder sbAppend6 = sbAppend5.append((String) c.d(-1396987465, new Object[]{cVarA}, iUptimeMillis3, 1396987468, i8, i9, i10));
            Object[] objArr13 = new Object[1];
            w((char) (TextUtils.lastIndexOf("", '0') + 46478), 1914 - KeyEvent.keyCodeFromString(""), Process.getGidForName("") + 7, objArr13);
            StringBuilder sbAppend7 = sbAppend6.append(((String) objArr13[0]).intern());
            int iUptimeMillis4 = (int) SystemClock.uptimeMillis();
            int i11 = c.f25343l * (-1658435610);
            c.f25343l = i11;
            int i12 = c.f25348q * 740487534;
            c.f25348q = i12;
            int i13 = c.f25347p * (-1494696993);
            c.f25347p = i13;
            f.c(strIntern4, sbAppend7.append((String) c.d(-1396987465, new Object[]{cVar}, iUptimeMillis4, 1396987468, i11, i12, i13)).toString());
            int i14 = f24034q + 93;
            f24036s = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 3 % 4;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0039 A[PHI: r6
  0x0039: PHI (r6v3 o.ep.d) = (r6v1 o.ep.d), (r6v5 o.ep.d) binds: [B:43:0x01bb, B:34:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private o.ef.c f() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ek.e.f():o.ef.c");
    }

    private o.ef.c h() throws o.ef.b {
        int i2 = 2 % 2;
        new b.c();
        o.ef.c cVar = new o.ef.c();
        Iterator<b> it = this.f24044o.values().iterator();
        while (it.hasNext()) {
            int i3 = f24036s + 3;
            f24034q = i3 % 128;
            if (i3 % 2 == 0) {
                cVar.a(b.c.e(it.next()));
                int i4 = 21 / 0;
            } else {
                cVar.a(b.c.e(it.next()));
            }
        }
        int i5 = f24036s + 29;
        f24034q = i5 % 128;
        int i6 = i5 % 2;
        return cVar;
    }

    static void i() {
        char[] cArr = new char[2080];
        ByteBuffer.wrap("(\u0093b\u0010½ØÈ¶\u0002u]%è\u0097\"I}\r\u0088ùÃò\u001db¨Ñã\u0087=gH+\u0083àÞåh\u0013£Áþ\u0082\bvCn\u009eâ(Jc\u001f¾ÃÉ®\u0003,^(é\u0085#\u000b~\u000e\u0089àÄ¦\u001e\u0013©\u0098äÉ>}I2\u0084æÞSi\u001d¤Óÿü\txD(\u009f\u0092)Dd\f¿ûÊ£\u0004m_Ãê\u008b$\u0003\u007f;\u008aìÅ°\u001f\u0013ª\u008cå\u008c?wJ%\u0085áßRj\u000f¥í\u0094\u0093Þ)\u0001üt\u009f¾Iá\u0012T¨\u009e/Á54Ü\u007fÎ¡f\u0014÷_°\u0081`ô\f?Ïb´Ô$\u001fòBµ´@ æjZµ\u0088Àì\n$UoàÙ*\"uN\u0080¿Ëý\u00150 \u0096ëß5\u0000\u0015w_Í\u0080\u0018õ{?\u00ad`öÕL\u001fË@ßµ;þt ÿ\u0095+ÞD\u0000\u0084uä¾0ãzUØ\u009e\u0000Ãf5§~ê£0\u0015\u008f^ß\u0094\u0091Þ2\u0001êt\u009f¾Cá\u0015T¸\u009e@Á*4ß\u007f\u008c¡\\\u0014í_¢\u0081`ô\u0000?Íb\u0099®^äà;(NJ\u0084ÎÛÑnk¤©ûû\u000eGEu\u009b\u008a.;eq»·ÎÂþ\u0083´;kå\u001e\u009bÔJ\u008b\n> ô`«\n^Ö\u0015\u008bËE~Õ5´ëh\u009e\u0014Ý5\u0097\u0088HL?Ûumª¸ßÎ\u0015\u0006\u0094\u0091Þ&\u0001êt\u0089\u0094\u0096Þ2\u0001õt\u0080¾_\u0094±Þ&\u0001êt\u0089¾ká\u001aT¢\u009e`Á=4Ê\u007f\u0092q\\;îä6\u0091^[\u0088\u0004Ý±g{¯$çÑ\r\u009abD\u009fñ?ºEd£\u0011ÞÚ\u0016\u0087\u00101¢úz§wQ\u009e\u001aÔÇ\u001bqí:òç$\u0090MZ\u0097\u0007\u0094°9zþO\u0093\u0005\u0017ÚÍ¯¤ej:=\u008f\u0088EP\u001a\u001aïî¤åzuÏÆ\u0084\u0090Z\u0011/-ä÷¹¢\u000f\u0001ÄÑ\u0099\u0090oo$-ùýO@\u0004\u0014Ù\u0095®©d\u007f9v\u008e\u0084DR\u0019\u0014îí£¨y\u0006Î×\u0083\u009bY{.!ãû¹·ó\u0005,ÝYµ\u0093cÌ6y\u008c³Dì\f\u0019æR\u008f\u008cx9Ðr\u008b¬KÙe\u0012£Oûù\u00022Ão\u0095\u0099jÒp\u000f÷¹Uò\u001c/ÒXé\u0092(Ï\u007f\u0094¶Þ2\u0001èt\u0081¾Oá\u0018T\u00ad\u009euÁ?4Ë\u007fÀ¡V\u0014ï_±\u0081pôI?Ëb\u0093Ôh\u001føB¸´Hÿ\u0013\"Ä\u0094dß+\u0002õu\u0097¿[â\u0017SÜ\u0019kÆ§³Äy\"&Rß\u0098\u00957Jè?\u009bõ@ª\n\u001f\u008cÕc\u008a+\u007fÈ4ªêR>ttÃ«\u0001Þ\u007f\u0014¥KîþN9\u008as:¬ñÙ\u0081\u0013_L\u0013ù\u00823ml%\u0099ÆÒ\u009e\u0013&Y\u0096\u0086]ó-9óf¿Ó.\u0019ÁF\u0089³jø2&®\u0093\u000f\u0094\u0087Þ7\u0001üt\u008c¾Rá\u001eT\u008f\u009e`Á(4Ë\u007f\u0093¡\u0015\u0014£_ã\u0081Wô\b?Ðb\u0093Ôh\u0094ÒÞ/\u0001ùt\u009e¾\u0006á\u0019T©\u009edÁ44\u008f\u007f\u0095¡E\u0014ê_¢\u0081`ô\f?Æ\u0094\u0087Þ7\u0001üt\u008c¾Rá\u001eT\u008f\u009e`Á(4Ë\u007f\u0093¡\u0015\u0014£_ã\u0081Wô\b?Ðb\u0093Ôh\u001fÔB¸´Mÿ\u0013\"\u0091\u001e\u009bT+\u008bàþ\u00904Nk\u0002Þ\u0093\u0014|K4¾×õ\u008f+\t\u009e¿Õÿ\u000bK~\u0014µÌè\u008f^t\u0095ÀÈ©>Tu\u000f¨Ø\u001exU7\u0088¬\u0094\u0087Þ7\u0001üt\u008c¾Rá\u001eT\u008f\u009e`Á(4Ë\u007f\u0093¡\u0015\u0014£_ã\u0081wô\u001c?Ðb\u0085Ô-\u001fóB¢´hÿ\u001d\"Ã\u0094nßq\u0002÷u\u0080¿Jâ'U¡\u009fkÂ?5Ôx¹¢#\u0015âX\u0098\u0082Cõ\u000f8ÞbfÕ4\u0018üC\u0081µMø\u0007#é\u00958Øw *j\u0084µBÀ7\u0094ÒÞh\u0001¸t\u008e¾Gá\tT¨\u009e/Á=4Ê\u007f\u0094¡a\u0014ë_±\u0081yô\u001a?ãb\u0099Ô,\u001fÞB¹´Eÿ\u0018\"Ø\u0094~ß6\u0002ÿu\u008b¿MâSUþ\u009f9À\u0014\u008a¤Uo \u001fêÁµ\u008d\u0000\u001cÊó\u0095»`X+\u0000õ\u0086@0\u000bpÕó \u009fkC6\t\u0080¨KO\u0016+àÜ«¬vMÀ÷\u008b¨Vj!\u0002ëÄ¶\u008f\u00019Ëù\u0096\u0087aX,\nö¹A5\frÖ\u009f¡±lA6ý\u0081½La\u0017\u0018áÔ¬³w5ÁÐ\u008c´WK\"\u001cìÊ·n\u0002.Ìî\u0097«bI-\u0012÷£Bd\r2×Ò¢\u008em\u0001#\u009fi/¶äÃ\u0094\tJV\u0006ã\u0097)xv0\u0083ÓÈ\u008b\u0016\r£»èû6xC\u0014\u0088ÈÕ\u0082c#¨Äõ \u0003WH'\u0095Æ#|h#µáÂ\u0089\bOU\u0004â²(ru\f\u0082ÓÏ\u0081\u00152¢¾ïù5\u0014B:\u008fÊÕvb6¯êô\u0093\u0002_O8\u0094¾\"Lo.´ÜÁ\u008c\u000fJTòá°/lt\u0016\u0094\u0087Þ7\u0001üt\u008c¾Rá\u001eT\u008f\u009e`Á(4Ë\u007f\u0093¡\u0015\u0014£_ã\u0081`ô\f?Ðb\u009aÔ;\u001fÜB¸´Oÿ?\"Þ\u0094dß;\u0002ùu\u0091¿Wâ\u001cUª\u009fjÂ\u00145Ëx\u0099¢*\u0015¦Xá\u0082\fõ\"8ÒbnÕ.\u0018òC\u008bµGø #¦\u0095CØ'\u0003Øv\u008f¸YãýV½\u0098}Ã86Úy\u0081£0\u0016÷Y¡\u0083Aö\u001d9\u0086s$¬ÿÙ\u008f\u0013cL\u001cù¸3cl/\u0099\u0089ÒË\f\u0013¹Ýò«,sY\r\u0092ÈÏ\u0094yn²ïï¿\u0019\rR\u0019\u008fÖ9or1¯óØÃ\u0012[O\u0014ø°2{ot\u0098ÍÕ\u009f\u000f2¸ïõ¨/^\u0094\u0080Þ\"\u0001ùt\u0089¾eá\u001aT¾\u009eeÁ)4\u008f\u007fÍ¡\u0015\u0014Û_\u00ad\u0081uô\u000b?Îb\u0092Ôh\u001féB¹´\u000bÿ\u001f\"Ð\u0094iß7\u0002õuÅ¿jâUU\u0087|\"6\u0092éY\u009c)V÷\t»¼*vÅ)\u008dÜn\u0097\u0012Iùü_·\u000eiò\u001c\u00ad×u\u008a6< ÷Yª\u001d\\ï\u0017¾Êq|Â7\u009fê[\u009d4WÒ\n¸½\u0007wÓ*×Ý/\u0090}J¡ýM°\rjì\u001d¶Ðk\u008a\u008a=\u0086ðE«9]ô\u0010´Ë\u0002}Ó0Òë~\u009e,Pò\u000bZ¾\u001c\u0094\u0087Þ7\u0001üt\u008c¾Rá\u001eT\u008f\u009e`Á(4Ë\u007f·¡\\\u0014ú_«\u0081Wô\b?Ðb\u0093Ô\u0005\u001füB¸´Jÿ\u001b\"Ô\u0094gß:\u0002þu\u0091¿wâ\u001dU¢\u009fvÂr5\u008axØ¢\u0000\u0015çXµ\u0082Mõ\u00068ßbbÕ%\u0018ûC\u009aµ\u0003\u0094\u0087Þ7\u0001üt\u008c¾Rá\u001eT\u008f\u009e`Á(4Ë\u007f·¡\\\u0014ú_«\u0081Wô\b?Ðb\u0093Ô\u0005\u001füB¸´Jÿ\u001b\"Ô\u0094gß:\u0002þu\u0091¿wâ\u001dU¢\u009fvÂr5\u008axØ¢\u0002\u0015ðX¾\u0082^õ\u00138ÓbkÕ%\u0018µCºµFø\u0006#¤\u0095qØ\u0016\u0003Æv\u0099¸uãäV²\u0098uÃ\u00036Ëy\u0099£*\u0016ðY \u0083wö\r9ÓcsÖ-\u0019ÞLÆ¶\u0016ù¬\u0094\u0087Þ7\u0001üt\u008c¾Rá\u001eT\u008f\u009e`Á(4Ë\u007f·¡\\\u0014ú_«\u0081Wô\b?Ðb\u0093Ô\u0005\u001füB¸´Jÿ\u001b\"Ô\u0094gß:\u0002þu\u0091¿wâ\u001dU¢\u009fvÂr5\u008axØ¢\u0002\u0015ðX¾\u0082^õ\u00138ÓbkÕ%\u0018µC«µ@ø\u001b#¤\u0095QØ#\u0003Év\u0089¸_ãèV\u0088\u0098~Ã\u00016Úy\u009e£e\u0016íY¶\u0083Pö*9ÆcfÖ,\u0019ØL\u0095¶\u001bù¡,áí\u0089§9xò\r\u0082Ç\\\u0098\u0010-\u0081çn¸&MÅ\u0006¹ØRmô&¥øY\u008d\u0006FÞ\u001b\u009d\u00ad\u000bfò;¶ÍD\u0086\u0015[Úíi¦4{ð\f\u009fÆy\u009b\u0013,¬æx»|L\u0084\u0001ÖÛ\flþ!°ûP\u008c\u001dAÝ\u001be¬+a»:¡ÌN\u0081\u0019Z¨ìy¡7zÒ\u000fÓÁQ\u009aë/´ápºDOÂ\u0000\u009bÚ?oØ ¼úY\u008f2@ß\u001af¯;`ð5\u009cÏT\u0080öU¦ïw 5uÁ\u000e\u0090À%\u0095ã.úà\nµLNß\u0000gÕ?në#\u0080=\fw¼¨wÝ\u0007\u0017ÙH\u0095ý\u00047ëh£\u009d@Ö<\b×½qö (Ü]\u0083\u0096[Ë\u0018}\u008e¶wë3\u001dÁV\u0090\u008b_=ìv±«uÜ\u001a\u0016üK\u0096ü)6ýkù\u009c\u0001ÑS\u000b\u0083¼nñ?+Ê\\¹\u0091EËå|¿±wê\u0006\u001cüQ\u0090\u008a)<ìq²ª\u0003ß\u0012\u0011ØJtÿ21ùj\u0095\u009fQÐ\u001f\nâ¿5ð-*ß_\u0096\u0090XÊø\u007f¶\u0094\u0087Þ7\u0001üt\u008c¾Rá\u001eT\u008f\u009e`Á(4Ë\u007f·¡\\\u0014ú_«\u0081Wô\b?Ðb\u0093Ô\u0005\u001füB¸´Jÿ\u001b\"Ô\u0094gß:\u0002þu\u0091¿wâ\u001dU¢\u009fvÂr5\u008axØ¢\u0003\u0015éXû\u0082iõ\u00028ÕbbÕ\u0013\u0018áC\u008fµWø\u001d#ª\u0095VØ8\u0003Ãv\u0098¸X\u001ahPÊ\u008f\u0011úa0\u008doòÚV\u0010\u008dOÁºgñ%/ý\u009a\u0003ÑF\u000f\u008czõ±3ì?ZÃ\u0091\u0014ÌL:§q´¬c\u001aÂQÄ\u008c\u0013ûd1¦lëÛE\u0011\u009fLÝ\u0094\u0080Þ\"\u0001ùt\u0089¾eá\u001aT¾\u009eeÁ)4\u008f\u007fÍ¡\u0015\u0014Í_¢\u0081fô\r?\u0082b\u0096Ô,\u001fùB³´Oÿ\\\"Å\u0094eß\u007f\u0002äu\u008d¿[âSU§\u009fxÂ 5ÃxØ¢ \u0015çX«\u0094±Þ&\u0001êt\u0089¾Uá[T»\u009ehÁ.4Ç\u007fÀ¡A\u0014æ_¦\u00814ô\u001a?Ãb\u009aÔ-\u001f½B\u009f´oÿ\\\"Ô\u0094dß<\u0002ÿu\u0090¿Pâ\u0007U¡\u009fkÂ75ÃxØ¢$\u0015èXû\u0082fõ28õbA\u0094¸Þ4\u0001÷t\u0083¾\u0006á\u001eT´\u009ebÁ?4ß\u007f\u0094¡\\\u0014á_\u00ad\u00814ô\f?Ìb\u0094Ô'\u001fèB¸´_ÿ\u0019\"Ã\u0094oß;\u0002°u\u0092¿Vâ\u001aU¨\u009f|Âr5Õx\u009d¢,\u0015âX²\u0082Bõ\u00068\u009ablÕ!\u0018çC\u008aµPøT#ó\u0095\"7\u0082}?¢÷×\u0097\u001d^B#÷¼=jb\u0006\u0097ÂÜ\u008d\u0002D·úü½\"hW\u0000\u009cÖÁ\u0085w;¼Éá¥\u0017P\\\u000e\u0081\u008c7:|b¡ãÖ\u009d\u001cTANö¼<ia9\u0096\u009aÛ\u0084\u0001 ¶ëûæ!UV\u0019\u009bÓÁwv>»üà\u0096\u0016Z[I\u0080î6?{o ÆÕÀ\u001b\u0006@¶õ²;x`\u0016\u0095ÖÚ\u0098\u0000+µ£úô \u0019UA\u009aÜ\u0016ô\\I\u0083\u0081öá<(cUÖÊ\u001c\u001cCp¶´ýû#2\u0096\u008cÝË\u0003\u001evv½ àóVM\u009d¿ÀÓ6&}x ú\u0016L]\u0014\u0080\u009e÷ã=#`8×Î\u001d\u0002@I·ìúá C\u0097\u0099ÚÂ\u0000.woº§à\u0001WO\u009aÞÁ¿7h\u0094\u009fÞ\"\u0001êt\u008a¾Cá>T¡\u009ewÁ\u001b4ß\u007f\u0090¡Y\u0014ç_ \u0081uô\u001d?Ëb\u0098Ô&\u001fÔB¸´Mÿ\u0013\"\u0091\u0094'ß\u007f\u0002ýu\u0080¿Lâ\u0014U¡\u009f}Âr5Ôx\u008c¢,\u0015òX®\u0082_õA8\u0080b/\u0094\u009fÞ\"\u0001êt\u008a¾Cá>T¡\u009ewÁ\u001b4ß\u007f\u0090¡Y\u0014ç_ \u0081uô\u001d?Ëb\u0098Ô&\u001fÔB¸´Mÿ\u0013\"\u0091\u0094'ß\u007f\u0002õu\u0088¿HâSU¥\u009fiÂ\"5\u0087x\u008b¢9\u0015çX¯\u0082Yõ\u00128\u009ablÕ(\u0018ôC\u0080µDø\u0011#\u00ad\u0095\"Ø1\u0003Úv\u0092¸[ã«ï\u009e¥\u007fz»\u000f\u0081¬+æ\u00969^L>\u0086÷Ù\u008al\u0015¦Ãù¯\fkG$\u0099í,Sg\u0014¹ÁÌ©\u0007\u007fZ,ì\u0092'`z\f\u008cùÇ§\u001a%¬\u0093çË:AM<\u0087üÚçm\u0011§Ýú\u0096\r3@?\u009a\u008d-S`\u001bºíÍ¦\u0000.ZÈí\u0080 @{#\u008däÀà\u001bG\u00ad\u0096\u0091ÇÛy\u0004«qØ»\u001bä}Qè\u009b8Äj1\u0090zÚ¤\u0006\u0011\u0091Zñ\u0084\u0017ñO:\u0090gÀÑj\u001a®G ±Pú\n'¢\u00911Ú\u007f\u0007æpòº\u0018çUPþ\u009a&Çg0\u0090}Ú§r\u0010¿]ã\u0087Zð\r=Ì\u0094ÒÞ.\u0001ëtÍ¾Há\u0014T¸\u009e!Á;4Á\u007fÀ¡}\u0014í_¦\u0081Qô\u0004?Ôb¶Ô8\u001fíBº´Bÿ\u001f\"Ð\u0094~ß6\u0002ÿu\u008b¿\u0012âSUª\u009fvÂr5×x\u008a¢\"\u0015àX²\u0082@õ\u00048\u009abfÕ$\u0018µC\u009aµLøT#ª\u0095jØ2\u0003Ëv\u0096\u0094ÒÞ.\u0001ëtÍ¾Tá\u001eT¯\u009edÁ34Ù\u007f\u0085¡Q\u0014®_¥\u0081{ô\u001b?\u0082b\u0083Ô \u001føBö´\u001aÿ\u000f\"Å\u0094*ß+\u0002ùu\u0088¿[â_Uä\u009fwÂ=5\u0087x\u0088¢?\u0015éX½\u0082Eõ\r8ßb/Õ)\u0018ñCÎµWø\u001b#é\u0095aØ?\u0003Ív\u009e¸]\u0091\u0080Û>\u0004ìq\u009f»\\ä:Q¯\u009b\u007fÄ-1×z\u009d¤A\u0011ÖZ¶\u0084Pñ\b:×g\u0087Ñ-\u001aéGç±\u0017úM'ð\u0091iÚ!\u0007çp\u009dºCç\u0007Põ\u009agÇ%0\u0096}¬§1\u0010á]ê\u0087|ð\u0000=ÛgrÐ8\u001dçF\u009e°Fý\f&·\u0090}Ýf\u0006\u0083sÌ\u0094ÒÞ/\u0001ùt\u009e¾\u0006á\u0019T©\u009edÁ44\u008f\u007f\u0095¡E\u0014ê_¢\u0081`ô\f?Æb×Ô.\u001fïB¹´Fÿ\\\"\u008b!_k¾´zÁ@\u000b\u0091TÖ\u0094ÒÞ/\u0001ùt\u009e¾\u0006á\u0015T£\u009euÁz4Í\u007f\u0085¡P\u0014à_ã\u0081aô\u0019?Æb\u0096Ô<\u001føB²\u0094\u0081Þ\"\u0001êt\u0084¾Gá\u0017T¥\u009e{Á?\u0094\u0081Þ\"\u0001êt\u0084¾Gá\u0017T¥\u009e{Á?4ë\u007f\u0095¡X\u0014ã_ª\u0081qô\u001a?áb\u0096Ô:\u001fùB¥´\u000bÿQ\"\u0091\u0094Cß\u001b\u0002°uß¿\u001eF+\f\u0088Ó@¦.lí3½\u0086\u000fLÑ\u0013\u0095æA\u00ad?sòÆI\u008d\u0000SÛ&°íK°<\u0006\u0090ÍS\u0090\u000ff¡-ûð;Fé\r¦Ði§\u001amÑ0\u008b\u0087NMð\u0010¹ç_ª\u0016pÇÇe\u008a5P¦'ñê0û\u0011±¥na\u001b\tÑÍ\u008e\u008f;\u0004ñá®¡[c\u0010\u001dÎÈ{o0'îú\u009b\u0085P[\r\u0013»ªp~-\u0014ÛÒ\u0090\u0081M}ûä°¦mt\u001a\u001eÐÒ\u008d\u008a: ðû\u00ad±Zx\u0017\u0010Í¦z~7%íÄ\u009a\u0088W\u0017\r¯ºíwY,\u0000ÚÚ\u0097\u0090L2úî·®lL\u0019\u001f×Õ\u008cT94÷ú¬\u0092YA\u0016\u0018Ì¬".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2080);
        f24035r = cArr;
        f24033p = 236179501277437511L;
    }

    static void init$0() {
        $$a = new byte[]{83, -90, 91, 36};
        $$b = 82;
    }

    static void init$1() {
        $$d = new byte[]{6, 32, -91, MessagePack.Code.BIN16, MessagePack.Code.BIN16, 58, 9, MessagePack.Code.UINT64, 57};
        $$e = 190;
    }

    static void init$2() {
        $$c = new byte[]{74, -74, 100, -77};
        $$f = 16;
    }

    private o.ef.c j() throws o.ef.b {
        int i2 = 2 % 2;
        new a.c();
        o.ef.c cVar = new o.ef.c();
        Iterator<o.ek.a> it = this.f24042m.values().iterator();
        int i3 = f24036s + 87;
        f24034q = i3 % 128;
        int i4 = i3 % 2;
        while (it.hasNext()) {
            int i5 = f24034q + 13;
            f24036s = i5 % 128;
            if (i5 % 2 != 0) {
                cVar.a(a.c.d(it.next()));
                throw null;
            }
            cVar.a(a.c.d(it.next()));
        }
        return cVar;
    }

    private static void w(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f24035r[i2 + i5])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0') + 743, (char) TextUtils.getOffsetBefore("", 0), Color.alpha(0) + 12, 632508977, false, $$g((byte) 6, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(f24033p), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b3 = (byte) 5;
                    byte b4 = (byte) (b3 - 5);
                    objA2 = o.d.d.a(766 - TextUtils.getCapsMode("", 0, 0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12469), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 11, 1946853218, false, $$g(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objA3 = o.d.d.a(387 - KeyEvent.getDeadChar(0, 0), (char) Color.alpha(0), 18 - Gravity.getAbsoluteGravity(0, 0), 39570797, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                int i6 = $10 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i8 = $10 + 17;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr5 = {oVar, oVar};
                Object objA4 = o.d.d.a(-723636472);
                if (objA4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objA4 = o.d.d.a(KeyEvent.normalizeMetaState(0) + 387, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 18, 39570797, false, $$g(b7, b8, b8), new Class[]{Object.class, Object.class});
                }
                Object obj = null;
                ((Method) objA4).invoke(null, objArr5);
                obj.hashCode();
                throw null;
            }
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr6 = {oVar, oVar};
            Object objA5 = o.d.d.a(-723636472);
            if (objA5 == null) {
                byte b9 = (byte) 0;
                byte b10 = b9;
                objA5 = o.d.d.a(ExpandableListView.getPackedPositionChild(0L) + 388, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 19 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 39570797, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:17:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void x(short r9, int r10, byte r11, java.lang.Object[] r12) {
        /*
            int r0 = r9 * 4
            int r9 = 1 - r0
            int r8 = 98 - r11
            byte[] r7 = o.ek.e.$$a
            int r6 = r10 + 4
            byte[] r5 = new byte[r9]
            r4 = 0
            if (r7 != 0) goto L2c
            r0 = r9
            r3 = r6
            r2 = r4
        L12:
            int r0 = -r0
            int r6 = r6 + r0
            r1 = r2
            r8 = r6
            r6 = r3
        L17:
            int r3 = r6 + 1
            int r2 = r1 + 1
            byte r0 = (byte) r8
            r5[r1] = r0
            if (r2 != r9) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r12[r4] = r0
            return
        L28:
            r0 = r7[r3]
            r6 = r8
            goto L12
        L2c:
            r1 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ek.e.x(short, int, byte, java.lang.Object[]):void");
    }

    private static void z(byte b2, int i2, int i3, Object[] objArr) {
        int i4 = 111 - (i2 * 13);
        int i5 = i3 * 5;
        int i6 = b2 + 4;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i5 + 1];
        int i7 = -1;
        if (bArr == null) {
            i4 = (i6 + i4) - 6;
            i6 = i6;
        }
        while (true) {
            i7++;
            int i8 = i6 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i4 = (i4 + bArr[i8]) - 6;
                i6 = i8;
            }
        }
    }

    public final LinkedHashMap<String, d> a() {
        int i2 = 2 % 2;
        LinkedHashMap<String, d> linkedHashMap = new LinkedHashMap<>(this.f24043n);
        linkedHashMap.putAll(this.f24041k);
        int i3 = f24034q + 101;
        f24036s = i3 % 128;
        int i4 = i3 % 2;
        return linkedHashMap;
    }

    public final void a(String str, String str2, o.ep.b bVar) {
        int i2 = 2 % 2;
        int i3 = f24036s + 49;
        f24034q = i3 % 128;
        int i4 = i3 % 2;
        b bVar2 = this.f24044o.get(str);
        if (bVar2 != null) {
            bVar2.d(new b.d(str2, bVar));
            int i5 = f24034q + 41;
            f24036s = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c8 A[PHI: r5
  0x00c8: PHI (r5v2 o.ek.a) = (r5v1 o.ek.a), (r5v5 o.ek.a) binds: [B:51:0x00c6, B:33:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(o.eq.b r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ek.e.a(o.eq.b):void");
    }

    public final void a(o.eq.b bVar, o.cs.d dVar) {
        int i2 = 2 % 2;
        bVar.e(dVar);
        o.ek.a aVar = this.f24042m.get(bVar.k());
        if (aVar != null) {
            int i3 = f24034q + 69;
            f24036s = i3 % 128;
            int i4 = i3 % 2;
            int i5 = o.cs.d.f22590b * 2033895861;
            o.cs.d.f22590b = i5;
            int i6 = o.cs.d.f22593e * 1121861622;
            o.cs.d.f22593e = i6;
            int priority = Thread.currentThread().getPriority();
            int i7 = o.cs.d.f22589a * (-121879155);
            o.cs.d.f22589a = i7;
            aVar.a((String) o.cs.d.b(i7, 1953396095, -1953396094, new Object[]{dVar}, priority, i5, i6));
            int i8 = f24036s + 91;
            f24034q = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    public final o.fj.b b(Context context, LinkedHashMap<String, d> linkedHashMap, o.ev.b bVar) {
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int iMyUid = Process.myUid();
        int i2 = f24029h * 1092908448;
        f24029h = i2;
        int i3 = f24032l * (-28842699);
        f24032l = i3;
        return (o.fj.b) b(iElapsedRealtime, 1001399399, i3, iMyUid, new Object[]{this, context, linkedHashMap, bVar}, i2, -1001399394);
    }

    public final void b() {
        int i2 = 2 % 2;
        int i3 = f24034q + 47;
        f24036s = i3 % 128;
        if (i3 % 2 == 0) {
            this.f24044o.clear();
            this.f24043n.clear();
        } else {
            this.f24044o.clear();
            this.f24043n.clear();
            int i4 = 8 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(o.ef.c r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ek.e.b(o.ef.c):void");
    }

    public final void b(o.eq.b bVar) {
        int i2 = 2 % 2;
        bVar.e(null);
        bVar.a((Map<String, o.cs.d>) null);
        bVar.c(o.eq.d.f24733d);
        o.ek.a aVar = this.f24042m.get(bVar.k());
        if (aVar != null) {
            int i3 = f24034q + 3;
            f24036s = i3 % 128;
            int i4 = i3 % 2;
            aVar.a(null);
            aVar.c(o.eq.d.f24733d);
            int i5 = f24034q + 93;
            f24036s = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 % 4;
            }
        }
    }

    public final boolean b(String str) {
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i2 = f24022a * (-1511445380);
        f24022a = i2;
        int iNextInt = new Random().nextInt();
        int i3 = f24023b * (-859027871);
        f24023b = i3;
        return ((Boolean) b(elapsedCpuTime, 1095925120, i3, i2, new Object[]{this, str}, iNextInt, -1095925119)).booleanValue();
    }

    public final o.eq.b c(String str) {
        int i2 = 2 % 2;
        int i3 = f24034q + 27;
        f24036s = i3 % 128;
        int i4 = i3 % 2;
        if (str == null) {
            return null;
        }
        for (d dVar : this.f24043n.values()) {
            if (dVar.A() == null) {
                break;
            }
            Iterator<o.ep.a> it = dVar.A().values().iterator();
            int i5 = f24036s + 23;
            f24034q = i5 % 128;
            int i6 = i5 % 2;
            while (it.hasNext()) {
                for (o.eq.b bVar : it.next()) {
                    if (bVar.k().equals(str)) {
                        int i7 = f24034q + 33;
                        int i8 = i7 % 128;
                        f24036s = i8;
                        if (i7 % 2 != 0) {
                            throw null;
                        }
                        int i9 = i8 + 87;
                        f24034q = i9 % 128;
                        if (i9 % 2 != 0) {
                            return bVar;
                        }
                        throw null;
                    }
                }
            }
        }
        return null;
    }

    public final void c() {
        int i2 = 2 % 2;
        int i3 = f24034q + 7;
        f24036s = i3 % 128;
        if (i3 % 2 == 0) {
            this.f24042m.clear();
            return;
        }
        this.f24042m.clear();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x04b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(o.ef.a r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1889
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ek.e.c(o.ef.a):void");
    }

    public final o.ef.a d() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24036s + 9;
        f24034q = i3 % 128;
        int i4 = i3 % 2;
        if (!(!f.a())) {
            int i5 = f24034q + 91;
            f24036s = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            w((char) TextUtils.getCapsMode("", 0, 0), 198 - (Process.myTid() >> 22), TextUtils.lastIndexOf("", '0', 0) + 12, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            w((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), Color.alpha(0) + 1941, 9 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i7 = f24036s + 47;
            f24034q = i7 % 128;
            int i8 = i7 % 2;
        }
        o.ef.a aVar = new o.ef.a();
        Object[] objArr3 = new Object[1];
        w((char) (TextUtils.lastIndexOf("", '0', 0) + 18851), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 181, 4 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr3);
        aVar.a(((String) objArr3[0]).intern(), j());
        Object[] objArr4 = new Object[1];
        w((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 189 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3, objArr4);
        aVar.a(((String) objArr4[0]).intern(), h());
        Object[] objArr5 = new Object[1];
        w((char) TextUtils.getOffsetAfter("", 0), TextUtils.indexOf("", "", 0, 0) + 193, 4 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr5);
        aVar.a(((String) objArr5[0]).intern(), f());
        return aVar;
    }

    public final void d(d dVar, o.ep.f fVar) {
        int i2 = 2 % 2;
        int i3 = f24036s + 25;
        f24034q = i3 % 128;
        if (i3 % 2 == 0) {
            this.f24044o.get(dVar.b());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        b bVar = this.f24044o.get(dVar.b());
        if (bVar != null) {
            int i4 = f24036s + 117;
            f24034q = i4 % 128;
            int i5 = i4 % 2;
            bVar.d(fVar);
        }
        int i6 = f24034q + 41;
        f24036s = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 50 / 0;
        }
    }

    public final LinkedHashMap<String, d> e() {
        int i2 = 2 % 2;
        int i3 = f24036s;
        int i4 = i3 + 81;
        f24034q = i4 % 128;
        int i5 = i4 % 2;
        LinkedHashMap<String, d> linkedHashMap = this.f24043n;
        int i6 = i3 + 115;
        f24034q = i6 % 128;
        int i7 = i6 % 2;
        return linkedHashMap;
    }

    public final void e(String str, String str2, o.en.e eVar) throws Throwable {
        int i2 = f24026e * (-1277290283);
        f24026e = i2;
        int i3 = f24025d * (-660549863);
        f24025d = i3;
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        b(i2, 1607389248, (int) SystemClock.uptimeMillis(), i3, new Object[]{this, str, str2, eVar}, iFreeMemory, -1607389246);
    }

    public final void g() {
        int i2 = 2 % 2;
        int i3 = f24036s + 63;
        f24034q = i3 % 128;
        if (i3 % 2 != 0) {
            this.f24041k.clear();
            return;
        }
        this.f24041k.clear();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
