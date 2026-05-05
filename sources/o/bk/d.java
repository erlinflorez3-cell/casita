package o.bk;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.i;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends Exception {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f21317b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f21318c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f21319d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f21320e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f21321g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f21322h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f21323i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f21324a;

    /* JADX INFO: renamed from: o.bk.d$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f21325a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f21326c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f21327e;

        static {
            int[] iArr = new int[a.values().length];
            f21327e = iArr;
            try {
                iArr[a.f21331e.ordinal()] = 1;
                int i2 = f21326c;
                int i3 = (i2 & 91) + (i2 | 91);
                f21325a = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21327e[a.f21328b.ordinal()] = 2;
                int i5 = f21325a;
                int i6 = (i5 & 37) + (i5 | 37);
                f21326c = i6 % 128;
                if (i6 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f21328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ a[] f21329c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long f21330d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f21331e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f21332f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f21333g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static char f21334h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f21335i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f21336j = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static int f21337m = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f21338a;

        private static String $$c(int i2, int i3, byte b2) {
            byte[] bArr = $$a;
            int i4 = i3 + 65;
            int i5 = 4 - (b2 * 4);
            int i6 = i2 * 4;
            byte[] bArr2 = new byte[1 - i6];
            int i7 = 0 - i6;
            int i8 = -1;
            if (bArr == null) {
                i4 = (-i4) + i7;
                i5++;
            }
            while (true) {
                i8++;
                bArr2[i8] = (byte) i4;
                if (i8 == i7) {
                    return new String(bArr2, 0);
                }
                i4 = (-bArr[i5]) + i4;
                i5++;
            }
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f21336j = 0;
            f21337m = 1;
            f21333g = 0;
            f21332f = 1;
            a();
            Object[] objArr = new Object[1];
            k((char) (9221 - (ViewConfiguration.getLongPressTimeout() >> 16)), "뮚碌桎뼶ো\uab07퓻\ue391튉蹼侃\u0b65潴", "\u0000\u0000\u0000\u0000", "뻠칭פ䘤", View.MeasureSpec.getMode(0) - 456233538, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            k((char) (26009 - MotionEvent.axisFromString("")), "䆋骰ᚨ㼘⚿\uddeaⅾ\uf16e劼쒵\ue9c2㊵云䖗", "\u0000\u0000\u0000\u0000", "⽡⚚騤ꑥ", Drawable.resolveOpacity(0, 0), objArr2);
            f21331e = new a(strIntern, 0, ((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            k((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), "벻뤓逤쉳㩳ꨑ찺䊽", "\u0000\u0000\u0000\u0000", "ሧਥ㝫\ude72", Gravity.getAbsoluteGravity(0, 0), objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            k((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\uf2ef竄訥渾ꖧ\u2e78ꇻ苏䜯", "\u0000\u0000\u0000\u0000", "\udff4鬀귺柍", View.getDefaultSize(0, 0) - 90504993, objArr4);
            f21328b = new a(strIntern2, 1, ((String) objArr4[0]).intern());
            f21329c = b();
            int i2 = f21336j + 49;
            f21337m = i2 % 128;
            int i3 = i2 % 2;
        }

        private a(String str, int i2, String str2) {
            this.f21338a = str2;
        }

        static void a() {
            f21330d = 740602047300126166L;
            f21335i = 1564493270;
            f21334h = (char) 1109;
        }

        private static /* synthetic */ a[] b() {
            int i2 = 2 % 2;
            int i3 = f21332f;
            int i4 = i3 + 83;
            f21333g = i4 % 128;
            int i5 = i4 % 2;
            a[] aVarArr = {f21331e, f21328b};
            int i6 = i3 + 7;
            f21333g = i6 % 128;
            int i7 = i6 % 2;
            return aVarArr;
        }

        static void init$0() {
            $$a = new byte[]{85, Ascii.RS, 127, 42};
            $$b = 138;
        }

        private static void k(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            int i3 = 2;
            int i4 = 2 % 2;
            Object obj = null;
            Object charArray = str6;
            if (str6 != null) {
                int i5 = $10 + 9;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    str6.toCharArray();
                    obj.hashCode();
                    throw null;
                }
                charArray = str6.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            Object charArray2 = str5;
            if (str5 != null) {
                charArray2 = str5.toCharArray();
            }
            char[] cArr2 = (char[]) charArray2;
            Object charArray3 = str4;
            if (str4 != null) {
                int i6 = $11 + 29;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                charArray3 = str4.toCharArray();
            }
            i iVar = new i();
            int length = cArr.length;
            char[] cArr3 = new char[length];
            int length2 = cArr2.length;
            char[] cArr4 = new char[length2];
            int i8 = 0;
            System.arraycopy(cArr, 0, cArr3, 0, length);
            System.arraycopy(cArr2, 0, cArr4, 0, length2);
            cArr3[0] = (char) (cArr3[0] ^ c2);
            cArr4[2] = (char) (cArr4[2] + ((char) i2));
            int length3 = ((char[]) charArray3).length;
            char[] cArr5 = new char[length3];
            iVar.f19932b = 0;
            while (iVar.f19932b < length3) {
                int i9 = $11 + 117;
                $10 = i9 % 128;
                int i10 = i9 % i3;
                try {
                    Object[] objArr2 = {iVar};
                    Object objA = o.d.d.a(540069882);
                    if (objA == null) {
                        int packedPositionGroup = 106 - ExpandableListView.getPackedPositionGroup(0L);
                        char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                        int offsetAfter = 11 - TextUtils.getOffsetAfter("", i8);
                        byte b2 = (byte) i8;
                        byte b3 = b2;
                        String str$$c = $$c(b2, b3, b3);
                        Class[] clsArr = new Class[1];
                        clsArr[i8] = Object.class;
                        objA = o.d.d.a(packedPositionGroup, maxKeyCode, offsetAfter, -155898465, false, str$$c, clsArr);
                    }
                    int iIntValue = ((Integer) ((Method) objA).invoke(obj, objArr2)).intValue();
                    Object[] objArr3 = {iVar};
                    Object objA2 = o.d.d.a(2068572);
                    if (objA2 == null) {
                        int mirror = AndroidCharacter.getMirror('0') + 799;
                        char fadingEdgeLength = (char) (6488 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                        int iLastIndexOf = 11 - TextUtils.lastIndexOf("", '0', i8, i8);
                        byte b4 = (byte) i8;
                        byte b5 = (byte) (b4 + 3);
                        String str$$c2 = $$c(b4, b5, (byte) (b5 - 3));
                        Class[] clsArr2 = new Class[1];
                        clsArr2[i8] = Object.class;
                        objA2 = o.d.d.a(mirror, fadingEdgeLength, iLastIndexOf, -694521287, false, str$$c2, clsArr2);
                    }
                    int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    int i11 = cArr3[iVar.f19932b % 4] * 32718;
                    Object[] objArr4 = new Object[3];
                    objArr4[2] = Integer.valueOf(cArr4[iIntValue]);
                    objArr4[1] = Integer.valueOf(i11);
                    objArr4[i8] = iVar;
                    Object objA3 = o.d.d.a(-1122996612);
                    if (objA3 == null) {
                        byte b6 = (byte) i8;
                        byte b7 = (byte) (b6 + 1);
                        objA3 = o.d.d.a((ViewConfiguration.getPressedStateDuration() >> 16) + 458, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (CdmaCellLocation.convertQuartSecToDecDegrees(i8) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i8) == 0.0d ? 0 : -1)) + 11, 1804962841, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                    Object objA4 = o.d.d.a(-1223178239);
                    if (objA4 == null) {
                        byte b8 = (byte) 0;
                        i3 = 2;
                        objA4 = o.d.d.a(TextUtils.lastIndexOf("", '0', 0) + OlympusMakernoteDirectory.TAG_PREVIEW_IMAGE, (char) (65101 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), TextUtils.getCapsMode("", 0, 0) + 12, 1636969060, false, $$c(b8, (byte) ((b8 + 57) - (57 & b8)), b8), new Class[]{Integer.TYPE, Integer.TYPE});
                    } else {
                        i3 = 2;
                    }
                    obj = null;
                    cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                    cArr3[iIntValue2] = iVar.f19933e;
                    cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r9[iVar.f19932b])) ^ (f21330d ^ 740602047300126166L)) ^ ((long) ((int) (((long) f21335i) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f21334h) ^ 740602047300126166L))));
                    iVar.f19932b++;
                    i8 = 0;
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

        public static a valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f21333g + 19;
            f21332f = i3 % 128;
            int i4 = i3 % 2;
            a aVar = (a) Enum.valueOf(a.class, str);
            int i5 = f21333g + 15;
            f21332f = i5 % 128;
            int i6 = i5 % 2;
            return aVar;
        }

        public static a[] values() {
            int i2 = 2 % 2;
            int i3 = f21332f + 59;
            f21333g = i3 % 128;
            int i4 = i3 % 2;
            a[] aVarArr = (a[]) f21329c.clone();
            int i5 = f21333g + 73;
            f21332f = i5 % 128;
            if (i5 % 2 != 0) {
                return aVarArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r7, byte r8, short r9) {
        /*
            int r0 = 122 - r8
            int r9 = r9 + 4
            int r1 = r7 * 3
            int r8 = 1 - r1
            byte[] r7 = o.bk.d.$$a
            byte[] r6 = new byte[r8]
            r5 = 0
            if (r7 != 0) goto L2a
            r1 = r8
            r2 = r9
            r4 = r5
        L12:
            int r0 = -r1
            int r9 = r9 + r0
            r3 = r4
            r0 = r9
            r9 = r2
        L17:
            int r4 = r3 + 1
            int r2 = r9 + 1
            byte r1 = (byte) r0
            r6[r3] = r1
            if (r4 != r8) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L26:
            r1 = r7[r2]
            r9 = r0
            goto L12
        L2a:
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bk.d.$$c(byte, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21322h = 0;
        f21321g = 1;
        f21318c = 0;
        f21323i = 1;
        b();
        ViewConfiguration.getKeyRepeatDelay();
        ViewConfiguration.getScrollBarFadeDuration();
        int i2 = f21322h + 31;
        f21321g = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    d(a aVar) throws Throwable {
        StringBuilder sbAppend = new StringBuilder().append(aVar.f21338a);
        Object[] objArr = new Object[1];
        f((char) (18888 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), "䃇\uee4c꺵룔㱔븝∖\uef22兟㰓㝎溯豞ᾯ↰Ⳁ嘅\u0b5a佥∔縉樛⏟ﲹ䘫ᵼ䉏", "\u0000\u0000\u0000\u0000", "䮬昵젖ꝉ", View.MeasureSpec.makeMeasureSpec(0, 0) + 375797067, objArr);
        super(sbAppend.append(((String) objArr[0]).intern()).toString());
        this.f21324a = aVar;
    }

    static void b() {
        f21317b = 740602047300126166L;
        f21319d = 1564493270;
        f21320e = (char) 48069;
    }

    private static void f(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = $11;
        int i6 = i5 + 55;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        Object obj = null;
        Object charArray = str6;
        if (str6 != null) {
            int i8 = i5 + 87;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                str6.toCharArray();
                throw null;
            }
            charArray = str6.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str5;
        if (str5 != null) {
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
        int i9 = 0;
        System.arraycopy(cArr, 0, cArr3, 0, length);
        System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c2);
        cArr4[2] = (char) (cArr4[2] + ((char) i2));
        int length3 = ((char[]) charArray3).length;
        char[] cArr5 = new char[length3];
        iVar.f19932b = 0;
        while (iVar.f19932b < length3) {
            int i10 = $11 + 1;
            $10 = i10 % 128;
            int i11 = i10 % i3;
            try {
                Object[] objArr2 = {iVar};
                Object objA = o.d.d.a(540069882);
                if (objA == null) {
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 107;
                    char threadPriority = (char) ((Process.getThreadPriority(i9) + 20) >> 6);
                    int i12 = 11 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte b2 = (byte) i9;
                    String str$$c = $$c(b2, (byte) ((b2 + 57) - (57 & b2)), (byte) (-1));
                    Class[] clsArr = new Class[1];
                    clsArr[i9] = Object.class;
                    objA = o.d.d.a(packedPositionChild, threadPriority, i12, -155898465, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(obj, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = o.d.d.a(2068572);
                if (objA2 == null) {
                    byte b3 = (byte) i9;
                    objA2 = o.d.d.a(846 - Process.getGidForName(""), (char) (TextUtils.getOffsetAfter("", i9) + 6488), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12, -694521287, false, $$c(b3, (byte) ((b3 + 54) - (54 & b3)), (byte) (-1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA3 = o.d.d.a(-1122996612);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = o.d.d.a(View.resolveSizeAndState(0, 0, 0) + 458, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 11 - (ViewConfiguration.getScrollBarSize() >> 8), 1804962841, false, $$c(b4, (byte) ((-1) - (((-1) - b4) & ((-1) - 56))), (byte) (-1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = o.d.d.a(-1223178239);
                if (objA4 == null) {
                    int i13 = 640 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    char touchSlop = (char) (65100 - (ViewConfiguration.getTouchSlop() >> 8));
                    int i14 = 13 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    String str$$c2 = $$c(b5, b6, (byte) (b6 - 1));
                    i3 = 2;
                    objA4 = o.d.d.a(i13, touchSlop, i14, 1636969060, false, str$$c2, new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i3 = 2;
                }
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) ((((long) ((int) (((long) f21319d) ^ 740602047300126166L))) ^ (((long) (cArr3[iIntValue2] ^ r8[iVar.f19932b])) ^ (f21317b ^ 740602047300126166L))) ^ ((long) ((char) (((long) f21320e) ^ 740602047300126166L))));
                iVar.f19932b++;
                obj = null;
                i9 = 0;
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

    static void init$0() {
        $$a = new byte[]{78, MessagePack.Code.UINT16, MessagePack.Code.FALSE, 123};
        $$b = 249;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r0 == 2) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        r1 = new java.lang.StringBuilder();
        r14 = new java.lang.Object[1];
        f((char) (6547 - (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1))), "ꪉ\uffdd煒ꢱۛ芳쯧퇕畚愘ﭥ쿡㷋쌦䠾呈䈯\ue1bc", "\u0000\u0000\u0000\u0000", "팃稑銋㠙", android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0073, code lost:
    
        throw new java.lang.UnsupportedOperationException(r1.append(((java.lang.String) r14[0]).intern()).append(r15.f21324a.name()).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r1 == 2) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        return o.bg.a.A;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.bg.a c() throws java.lang.Throwable {
        /*
            r15 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = o.bk.d.f21318c
            int r1 = r0 + 79
            int r0 = r1 % 128
            o.bk.d.f21323i = r0
            int r1 = r1 % r3
            r8 = 0
            r7 = 1
            if (r1 != 0) goto L24
            int[] r1 = o.bk.d.AnonymousClass4.f21327e
            o.bk.d$a r0 = r15.f21324a
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 37
            int r0 = r0 / r8
            if (r1 == r7) goto L74
            if (r1 != r3) goto L33
        L21:
            o.bg.a r0 = o.bg.a.A
            return r0
        L24:
            int[] r1 = o.bk.d.AnonymousClass4.f21327e
            o.bk.d$a r0 = r15.f21324a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r7) goto L74
            if (r0 != r3) goto L33
            goto L21
        L33:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r5 = android.os.SystemClock.currentThreadTimeMillis()
            r3 = -1
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            int r0 = 6547 - r0
            char r9 = (char) r0
            int r0 = android.view.ViewConfiguration.getKeyRepeatDelay()
            int r13 = r0 >> 16
            java.lang.Object[] r14 = new java.lang.Object[r7]
            java.lang.String r10 = "ꪉ\uffdd煒ꢱۛ芳쯧퇕畚愘ﭥ쿡㷋쌦䠾呈䈯\ue1bc"
            java.lang.String r11 = "\u0000\u0000\u0000\u0000"
            java.lang.String r12 = "팃稑銋㠙"
            f(r9, r10, r11, r12, r13, r14)
            r0 = r14[r8]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.StringBuilder r1 = r1.append(r0)
            o.bk.d$a r0 = r15.f21324a
            java.lang.String r0 = r0.name()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L74:
            o.bg.a r2 = o.bg.a.f21052u
            int r0 = o.bk.d.f21323i
            int r1 = r0 + 101
            int r0 = r1 % 128
            o.bk.d.f21318c = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L82
            return r2
        L82:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bk.d.c():o.bg.a");
    }
}
