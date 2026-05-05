package o.eu;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Random;
import o.a.n;
import o.eu.e;
import o.ff.e;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b<T extends o.ff.e, U extends e<T>> extends a<T, U> {
    private static final byte[] $$h = null;
    private static final int $$i = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static int f25456a = 0;

    /* JADX INFO: renamed from: b */
    private static int f25457b = 0;

    /* JADX INFO: renamed from: c */
    private static int f25458c = 0;

    /* JADX INFO: renamed from: e */
    private final String f25459e;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0023 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(int r8, byte r9, int r10) {
        /*
            byte[] r7 = o.eu.b.$$h
            int r0 = r10 * 2
            int r6 = r0 + 113
            int r0 = r8 * 4
            int r5 = r0 + 4
            int r4 = r9 * 3
            int r0 = r4 + 1
            byte[] r3 = new byte[r0]
            r2 = 0
            if (r7 != 0) goto L28
            r0 = r4
            r1 = r2
        L15:
            int r5 = r5 + 1
            int r6 = r6 + r0
        L18:
            byte r0 = (byte) r6
            r3[r1] = r0
            if (r1 != r4) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L23:
            int r1 = r1 + 1
            r0 = r7[r5]
            goto L15
        L28:
            r1 = r2
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eu.b.$$j(int, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f25456a = 0;
        f25458c = 1;
        f25457b = -1270219365;
    }

    public b() throws Throwable {
        Object[] objArr = new Object[1];
        m(((byte) KeyEvent.getModifierMetaStateMask()) + 4, "\ufffb\ufff9\f", false, 232 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1 - View.getDefaultSize(0, 0), objArr);
        this.f25459e = ((String) objArr[0]).intern();
    }

    static void init$0() {
        $$h = new byte[]{108, -100, -109, 80};
        $$i = 174;
    }

    private static void m(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            int i6 = $10 + 5;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i8 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(f25457b)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(Color.red(0) + 270, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10, -2071844881, false, $$j(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(522 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) TextUtils.getTrimmedLength(""), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 11, 627984172, false, $$j(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                int i9 = $11 + 99;
                $10 = i9 % 128;
                int i10 = i9 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i4 > 0) {
            nVar.f19945b = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
        }
        if (z2) {
            int i11 = $10 + 35;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                int i13 = $10 + 55;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    cArr4[nVar.f19944a] = cArr2[i2 >>> nVar.f19944a];
                    Object[] objArr4 = {nVar, nVar};
                    Object objA3 = o.d.d.a(-202660535);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a(522 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) View.combineMeasuredStates(0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12, 627984172, false, $$j(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } else {
                    cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                    Object[] objArr5 = {nVar, nVar};
                    Object objA4 = o.d.d.a(-202660535);
                    if (objA4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objA4 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0) + 523, (char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 12, 627984172, false, $$j(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    @Override // o.eu.a
    public /* synthetic */ o.ef.a a(o.ff.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25456a + 59;
        f25458c = i3 % 128;
        int i4 = i3 % 2;
        o.ef.a aVarA = a((o.ff.e) aVar);
        int i5 = f25458c + 77;
        f25456a = i5 % 128;
        if (i5 % 2 == 0) {
            return aVarA;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public o.ef.a a(T t2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25456a + 99;
        f25458c = i3 % 128;
        int i4 = i3 % 2;
        o.ef.a aVarA = super.a(t2);
        Object[] objArr = new Object[1];
        m(2 - ExpandableListView.getPackedPositionChild(0L), "\ufffb\ufff9\f", false, 232 - Drawable.resolveOpacity(0, 0), 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
        aVarA.c(((String) objArr[0]).intern(), t2.i());
        int i5 = f25458c + 97;
        f25456a = i5 % 128;
        int i6 = i5 % 2;
        return aVarA;
    }

    public T b(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25458c + 53;
        f25456a = i3 % 128;
        int i4 = i3 % 2;
        T t2 = (T) super.d(aVar);
        Object[] objArr = new Object[1];
        m((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3, "\ufffb\ufff9\f", false, TextUtils.lastIndexOf("", '0') + 233, 1 - Drawable.resolveOpacity(0, 0), objArr);
        Object[] objArr2 = {aVar, ((String) objArr[0]).intern()};
        int i5 = o.ef.a.f23778l * 493926616;
        o.ef.a.f23778l = i5;
        int i6 = o.ef.a.f23779m * 1131312688;
        o.ef.a.f23779m = i6;
        t2.a(((Integer) o.ef.a.a(1122077797, objArr2, (int) SystemClock.elapsedRealtime(), new Random().nextInt(1747993327), -1122077791, i5, i6)).intValue());
        int i7 = f25458c + 41;
        f25456a = i7 % 128;
        int i8 = i7 % 2;
        return t2;
    }

    @Override // o.eu.a
    public /* synthetic */ o.ff.a d(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25458c + 61;
        f25456a = i3 % 128;
        int i4 = i3 % 2;
        o.ff.e eVarB = b(aVar);
        if (i4 != 0) {
            int i5 = 95 / 0;
        }
        int i6 = f25456a + 79;
        f25458c = i6 % 128;
        if (i6 % 2 != 0) {
            return eVarB;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
