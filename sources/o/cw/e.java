package o.cw;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.ArrayList;
import o.a.k;
import o.cr.d;
import o.ef.a;
import o.ff.b;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements d<o.fk.d> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f22676b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f22677d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f22678e = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r8, byte r9, short r10) {
        /*
            int r7 = r10 + 4
            byte[] r6 = o.cw.e.$$a
            int r5 = r8 * 4
            int r1 = r5 + 1
            int r0 = r9 * 7
            int r0 = r0 + 107
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r6 != 0) goto L27
            r0 = r5
            r1 = r7
            r2 = r3
        L14:
            int r7 = r7 + r0
        L15:
            byte r0 = (byte) r7
            r4[r2] = r0
            if (r2 != r5) goto L20
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L20:
            int r2 = r2 + 1
            int r1 = r1 + 1
            r0 = r6[r1]
            goto L14
        L27:
            r2 = r3
            r1 = r7
            r7 = r0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cw.e.$$c(short, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22676b = 0;
        f22677d = 1;
        f22678e = -5328340388284477934L;
    }

    private static void a(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 17;
        $11 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        Object charArray = str2 != null ? str2.toCharArray() : str2;
        k kVar = new k();
        char[] cArrC = k.c(f22678e ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            int i5 = $10 + 121;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            kVar.f19938a = kVar.f19939c - 4;
            int i7 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f22678e)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(Drawable.resolveOpacity(0, 0) + 229, (char) (Color.blue(0) + 51004), (ViewConfiguration.getTapTimeout() >> 16) + 9, 1749983833, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    objA2 = o.d.d.a(675 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ExpandableListView.getPackedPositionGroup(0L), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13, 522683165, false, $$c(b4, b5, (byte) (-b5)), new Class[]{Object.class, Object.class});
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

    private static o.fk.d c(a aVar) throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        a("\uf418咝ñ\uf471盛࢛롅\ueffa藀", View.resolveSizeAndState(0, 0, 0), objArr);
        short sShortValue = aVar.l(((String) objArr[0]).intern()).shortValue();
        Object[] objArr2 = new Object[1];
        a("酰ᩒᶇ鄑ꮉ䙊ꔾ", TextUtils.lastIndexOf("", '0', 0, 0) + 1, objArr2);
        Object[] objArr3 = {aVar, ((String) objArr2[0]).intern()};
        int i3 = a.f23782p * (-1576737484);
        a.f23782p = i3;
        String str = (String) a.a(-781664457, objArr3, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i3, Thread.currentThread().getPriority());
        Object[] objArr4 = new Object[1];
        a("\ue428\uee25턵\ue45b撹눮", KeyEvent.keyCodeFromString(""), objArr4);
        Object[] objArr5 = {aVar, ((String) objArr4[0]).intern(), -1};
        int priority = Thread.currentThread().getPriority();
        int i4 = a.f23777k * (-845283131);
        a.f23777k = i4;
        int iIntValue = ((Integer) a.a(1647814368, objArr5, (int) SystemClock.uptimeMillis(), (int) Thread.currentThread().getId(), -1647814363, priority, i4)).intValue();
        Object[] objArr6 = new Object[1];
        a("\ud886栃代\ud8eb\udb4f㐊\uf64b츧ꥋꙿ擠", Color.alpha(0), objArr6);
        short sShortValue2 = aVar.l(((String) objArr6[0]).intern()).shortValue();
        Object[] objArr7 = new Object[1];
        a("湣돨㛉渇烏\uefeb蹰", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, objArr7);
        byte bByteValue = aVar.B(((String) objArr7[0]).intern()).byteValue();
        o.fk.d dVar = new o.fk.d(true, b.f25845c, sShortValue);
        dVar.c(iIntValue);
        dVar.e(sShortValue2);
        dVar.a(bByteValue);
        dVar.e(str);
        Object[] objArr8 = {dVar, new ArrayList()};
        int i5 = o.fk.d.f25964e * 683229526;
        o.fk.d.f25964e = i5;
        o.fk.d.b(1823901947, (int) Runtime.getRuntime().freeMemory(), -1823901946, objArr8, Thread.currentThread().getPriority(), Process.myTid(), i5);
        int i6 = f22677d + 29;
        f22676b = i6 % 128;
        int i7 = i6 % 2;
        return dVar;
    }

    static void init$0() {
        $$a = new byte[]{Ascii.GS, 50, -104, 42};
        $$b = 162;
    }

    @Override // o.cr.d
    public final /* synthetic */ o.ff.a e(a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f22676b + 69;
        f22677d = i3 % 128;
        int i4 = i3 % 2;
        o.fk.d dVarC = c(aVar);
        int i5 = f22676b + 111;
        f22677d = i5 % 128;
        int i6 = i5 % 2;
        return dVarC;
    }
}
