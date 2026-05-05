package o.di;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import o.a.q;
import o.ea.f;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends d {
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f23051a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f23052b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f23053c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f23054d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f23055e = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(int r6, byte r7, byte r8) {
        /*
            int r0 = r8 * 7
            int r8 = r0 + 71
            int r0 = r7 * 2
            int r7 = 3 - r0
            int r0 = r6 * 2
            int r6 = 1 - r0
            byte[] r5 = o.di.e.$$c
            byte[] r4 = new byte[r6]
            r3 = 0
            if (r5 != 0) goto L2b
            r2 = r3
            r0 = r7
        L15:
            int r7 = r7 + r8
            r1 = r2
            r8 = r7
            r7 = r0
        L19:
            byte r0 = (byte) r8
            int r2 = r1 + 1
            r4[r1] = r0
            if (r2 != r6) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L26:
            int r0 = r7 + 1
            r7 = r5[r0]
            goto L15
        L2b:
            r1 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.di.e.$$e(int, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23053c = 0;
        f23054d = 1;
        f23051a = 0;
        f23052b = 1;
        b();
        View.resolveSize(0, 0);
        int i2 = f23053c + 1;
        f23054d = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void b() {
        f23055e = 6326349535401574007L;
    }

    private static void f(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        if (str2 != null) {
            int i4 = $11 + 93;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = (char[]) charArray;
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i6 = qVar.f19948a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA = o.d.d.a(-1011865131);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 731, (char) (7932 - ((byte) KeyEvent.getModifierMetaStateMask())), KeyEvent.normalizeMetaState(0) + 11, 355847088, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i6] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f23055e ^ 4743694005979712847L);
                Object[] objArr3 = {qVar, qVar};
                Object objA2 = o.d.d.a(1452497747);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 836, (char) (ExpandableListView.getPackedPositionGroup(0L) + 27279), 11 - Color.argb(0, 0, 0, 0), -2145994442, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
            Object[] objArr4 = {qVar, qVar};
            Object objA3 = o.d.d.a(1452497747);
            if (objA3 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objA3 = o.d.d.a(Drawable.resolveOpacity(0, 0) + 836, (char) (27279 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 11 - (ViewConfiguration.getTouchSlop() >> 8), -2145994442, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        String str3 = new String(cArr2);
        int i7 = $11 + 31;
        $10 = i7 % 128;
        if (i7 % 2 == 0) {
            objArr[0] = str3;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static void init$0() {
        $$c = new byte[]{101, -29, 17, 95};
        $$d = 127;
    }

    @Override // o.di.d
    public final b a(Context context, o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23052b + 1;
        f23051a = i3 % 128;
        int i4 = i3 % 2;
        if (!(!f.a())) {
            int i5 = f23052b + 7;
            f23051a = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            f("獫\uf470紏\ue6f7濻킛塓셳䨉돘㓷붕╕깸ᜌ飹ǡ誐\uf24e筨ﰐ旜\ueee2垀\udf42", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 34603, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            f("獜ꍢ팭ϑ㎕掳鉩숵\uf280⋞勦腇넳\ue1dbᇒ䆶災ꀫ탞\u009eザ杣霿쟉\uf7d0⟹嘶蘟뛉\ue69eᚶ䕠甪ꗎ헞֒㑗搦钊쒹\uf4a9⭠嬇诋뮐\uebaa᩶", 53299 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i7 = f23051a + 125;
            f23052b = i7 % 128;
            int i8 = i7 % 2;
        }
        return new b(false);
    }
}
