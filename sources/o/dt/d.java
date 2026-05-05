package o.dt;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import o.a.k;
import o.i.c;
import o.m.f;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends c {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f23335b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f23336c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f23337d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final o.i.d f23338e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f23339h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f23340j = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$f(int r7, int r8, int r9) {
        /*
            int r0 = r8 * 7
            int r8 = r0 + 107
            int r0 = r7 * 3
            int r7 = r0 + 3
            int r0 = r9 * 4
            int r6 = 1 - r0
            byte[] r5 = o.dt.d.$$d
            byte[] r4 = new byte[r6]
            r3 = 0
            if (r5 != 0) goto L2a
            r0 = r6
            r2 = r3
        L15:
            int r0 = -r0
            int r8 = r8 + r0
            int r7 = r7 + 1
            r1 = r2
        L1a:
            int r2 = r1 + 1
            byte r0 = (byte) r8
            r4[r1] = r0
            if (r2 != r6) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L27:
            r0 = r5[r7]
            goto L15
        L2a:
            r1 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dt.d.$$f(int, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23340j = 0;
        f23339h = 1;
        f23335b = 0;
        f23337d = 1;
        d();
        View.MeasureSpec.getMode(0);
        f23338e = new o.i.d();
        int i2 = f23340j + 79;
        f23339h = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d() throws Throwable {
        Object[] objArr = new Object[1];
        k("ড韏㋾৵\u16fa】詩\u09d2\u0cceᇍ㔷ˬϰ᳟㹖Чڇܱ⍸ᤥᶿȌ⑩ቍ၁൯⺨ᝧᝨࡄᎭ⡦", -TextUtils.lastIndexOf("", '0', 0), objArr);
        super(((String) objArr[0]).intern(), f.f26437b, false);
    }

    public static o.i.d b() {
        o.i.d dVar;
        int i2 = 2 % 2;
        int i3 = f23335b + 41;
        int i4 = i3 % 128;
        f23337d = i4;
        if (i3 % 2 == 0) {
            dVar = f23338e;
            int i5 = 15 / 0;
        } else {
            dVar = f23338e;
        }
        int i6 = i4 + 105;
        f23335b = i6 % 128;
        int i7 = i6 % 2;
        return dVar;
    }

    static void d() {
        f23336c = 6047487749376185149L;
    }

    static void init$0() {
        $$d = new byte[]{32, MessagePack.Code.STR16, MessagePack.Code.NEVER_USED};
        $$e = 229;
    }

    private static void k(String str, int i2, Object[] objArr) throws Throwable {
        Object obj;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 57;
        int i5 = i4 % 128;
        $10 = i5;
        int i6 = i4 % 2;
        if (str2 != null) {
            int i7 = i5 + 45;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            char[] charArray = str2.toCharArray();
            int i9 = $10 + 55;
            $11 = i9 % 128;
            obj = charArray;
            if (i9 % 2 == 0) {
                int i10 = 4 / 2;
                obj = charArray;
            }
        } else {
            obj = str2;
        }
        k kVar = new k();
        char[] cArrC = k.c(f23336c ^ (-5882309809461882246L), (char[]) obj, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            int i11 = $11 + 33;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            kVar.f19938a = kVar.f19939c - 4;
            int i13 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f23336c)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(229 - TextUtils.getOffsetBefore("", 0), (char) (51004 - KeyEvent.getDeadChar(0, 0)), Color.blue(0) + 9, 1749983833, false, $$f(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i13] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    objA2 = o.d.d.a(674 - MotionEvent.axisFromString(""), (char) ExpandableListView.getPackedPositionGroup(0L), 13 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 522683165, false, $$f(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
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
}
