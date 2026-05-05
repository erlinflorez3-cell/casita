package o.f;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.k;
import o.d.d;
import org.msgpack.core.MessagePack;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f25702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f25703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f25704c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f25705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static long f25706f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f25707g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f25708h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ a[] f25709i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f25710j = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f25711m = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f25712d;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r7, int r8, short r9) {
        /*
            int r0 = r8 * 3
            int r8 = 1 - r0
            int r0 = r9 * 7
            int r1 = 114 - r0
            int r0 = r7 * 3
            int r2 = 4 - r0
            byte[] r7 = o.f.a.$$a
            byte[] r6 = new byte[r8]
            r5 = 0
            if (r7 != 0) goto L2c
            r0 = r2
            r4 = r8
            r3 = r5
        L16:
            int r1 = -r2
            int r1 = r1 + r4
            r2 = r0
        L19:
            int r0 = r2 + 1
            byte r2 = (byte) r1
            r6[r3] = r2
            int r3 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L28:
            r2 = r7[r0]
            r4 = r1
            goto L16
        L2c:
            r3 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.f.a.$$c(short, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f25710j = 0;
        f25711m = 1;
        f25707g = 0;
        f25708h = 1;
        c();
        Object[] objArr = new Object[1];
        k("穤稪㲍ᾛ臼굙읠읗", 1 - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        k("̓͝臶ꋀ\u0a8e폊䰲매", -TextUtils.lastIndexOf("", '0', 0, 0), objArr2);
        f25703b = new a(strIntern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        k("鴣鵰돆郚ꊶＩ\ue430", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        k("ৎঝ䉚慦䧷荐ད", 1 - KeyEvent.normalizeMetaState(0), objArr4);
        f25705e = new a(strIntern2, 1, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        k("甈畆餉먟훟ᬷ遙焏\uf889ଶ", 1 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        k("퓱풿㎌Ⴚ烖눚㙰\ud82e奆ꆢꑔ", -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr6);
        f25702a = new a(strIntern3, 2, ((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        k("랻럯\udba1\uf8b7諏㶭챿垣㨜䦂幸얌갔잓\ue811", Color.rgb(0, 0, 0) + 16777217, objArr7);
        String strIntern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        k("夸奬\ue338쀎\uf3a2ኙ딏碰풙焌✷\uea9e䊱！酟铯\uf0d0", (Process.myTid() >> 22) + 1, objArr8);
        f25704c = new a(strIntern4, 3, ((String) objArr8[0]).intern());
        f25709i = a();
        int i2 = f25711m + 87;
        f25710j = i2 % 128;
        int i3 = i2 % 2;
    }

    private a(String str, int i2, String str2) {
        this.f25712d = str2;
    }

    private static /* synthetic */ a[] a() {
        int i2 = 2 % 2;
        int i3 = f25707g + 89;
        f25708h = i3 % 128;
        if (i3 % 2 != 0) {
            return new a[]{f25703b, f25705e, f25702a, f25704c};
        }
        a[] aVarArr = new a[5];
        aVarArr[0] = f25703b;
        aVarArr[0] = f25705e;
        aVarArr[5] = f25702a;
        aVarArr[2] = f25704c;
        return aVarArr;
    }

    static void c() {
        f25706f = -5634778248374865661L;
    }

    public static a e(String str) {
        int i2 = 2 % 2;
        a[] aVarArrValues = values();
        int length = aVarArrValues.length;
        int i3 = 0;
        while (true) {
            Object obj = null;
            if (i3 >= length) {
                int i4 = f25707g + 37;
                f25708h = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 86 / 0;
                }
                return null;
            }
            int i6 = f25708h + 67;
            f25707g = i6 % 128;
            if (i6 % 2 != 0) {
                str.equals(aVarArrValues[i3].f25712d);
                obj.hashCode();
                throw null;
            }
            a aVar = aVarArrValues[i3];
            if (str.equals(aVar.f25712d)) {
                return aVar;
            }
            i3++;
        }
    }

    static void init$0() {
        $$a = new byte[]{0, -128, Ascii.EM, 70, MessagePack.Code.FIXEXT4};
        $$b = 32;
    }

    private static void k(String str, int i2, Object[] objArr) throws Throwable {
        Object obj;
        String str2 = str;
        int i3 = 2 % 2;
        if (str2 != null) {
            int i4 = $11 + 115;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                str2.toCharArray();
                throw null;
            }
            char[] charArray = str2.toCharArray();
            int i5 = $11 + 43;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            obj = charArray;
        } else {
            obj = str2;
        }
        k kVar = new k();
        char[] cArrC = k.c(f25706f ^ (-5882309809461882246L), (char[]) obj, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            kVar.f19938a = kVar.f19939c - 4;
            int i7 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f25706f)};
                Object objA = d.a(-1093976004);
                if (objA == null) {
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 229;
                    char c2 = (char) (51005 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                    int windowTouchSlop = 9 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    byte b2 = $$a[0];
                    byte b3 = b2;
                    objA = d.a(fadingEdgeLength, c2, windowTouchSlop, 1749983833, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = d.a(-912105096);
                if (objA2 == null) {
                    int deadChar = 675 - KeyEvent.getDeadChar(0, 0);
                    char c3 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i8 = 13 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    byte b4 = $$a[0];
                    byte b5 = b4;
                    objA2 = d.a(deadChar, c3, i8, 522683165, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
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

    public static a valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f25708h + 51;
        f25707g = i3 % 128;
        int i4 = i3 % 2;
        a aVar = (a) Enum.valueOf(a.class, str);
        if (i4 == 0) {
            return aVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static a[] values() {
        int i2 = 2 % 2;
        int i3 = f25707g + 43;
        f25708h = i3 % 128;
        int i4 = i3 % 2;
        a[] aVarArr = f25709i;
        if (i4 != 0) {
            return (a[]) aVarArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String e() {
        int i2 = 2 % 2;
        int i3 = f25707g + 73;
        f25708h = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f25712d;
        }
        throw null;
    }
}
