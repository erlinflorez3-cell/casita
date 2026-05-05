package o.dj;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.a.n;
import okio.Utf8;

/* JADX INFO: loaded from: classes6.dex */
public final class d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f23122f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f23123h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f23124j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f23125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o.ef.a f23126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f23127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Date f23128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Date f23129e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r7, short r8, short r9) {
        /*
            int r0 = r7 * 4
            int r7 = r0 + 4
            byte[] r6 = o.dj.d.$$a
            int r5 = r8 * 3
            int r1 = r5 + 1
            int r0 = r9 * 2
            int r4 = 115 - r0
            byte[] r3 = new byte[r1]
            r2 = 0
            if (r6 != 0) goto L29
            r1 = r5
            r0 = r2
        L15:
            int r7 = r7 + 1
            int r4 = r4 + r1
            r1 = r0
        L19:
            byte r0 = (byte) r4
            r3[r1] = r0
            int r0 = r1 + 1
            if (r1 != r5) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L26:
            r1 = r6[r7]
            goto L15
        L29:
            r1 = r2
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dj.d.$$c(short, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23122f = 0;
        f23124j = 1;
        f23123h = -1270219499;
    }

    public d(long j2, h hVar, Date date, Date date2, o.ef.a aVar) {
        this.f23125a = j2;
        this.f23127c = hVar;
        this.f23129e = date;
        this.f23128d = date2;
        this.f23126b = aVar;
    }

    private static void g(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i6 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(f23123h)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0) + 271, (char) TextUtils.getOffsetBefore("", 0), 12 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -2071844881, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a((Process.myPid() >> 22) + 522, (char) (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.indexOf("", "", 0, 0) + 12, 627984172, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
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
        if (i4 > 0) {
            int i7 = $10 + 83;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            nVar.f19945b = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
        }
        if (z2) {
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = o.d.d.a(-202660535);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(522 - Color.blue(0), (char) View.MeasureSpec.getSize(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 11, 627984172, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            int i9 = $10 + 87;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 3 / 2;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void init$0() {
        $$a = new byte[]{75, Utf8.REPLACEMENT_BYTE, 5, -84};
        $$b = 234;
    }

    public final h a() {
        int i2 = 2 % 2;
        int i3 = f23124j;
        int i4 = i3 + 93;
        f23122f = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        h hVar = this.f23127c;
        int i5 = i3 + 51;
        f23122f = i5 % 128;
        int i6 = i5 % 2;
        return hVar;
    }

    public final Date b() {
        Date date;
        int i2 = 2 % 2;
        int i3 = f23124j + 69;
        int i4 = i3 % 128;
        f23122f = i4;
        if (i3 % 2 != 0) {
            date = this.f23128d;
            int i5 = 45 / 0;
        } else {
            date = this.f23128d;
        }
        int i6 = i4 + 17;
        f23124j = i6 % 128;
        if (i6 % 2 != 0) {
            return date;
        }
        throw null;
    }

    public final Date c() {
        int i2 = 2 % 2;
        int i3 = f23124j;
        int i4 = i3 + 85;
        f23122f = i4 % 128;
        int i5 = i4 % 2;
        Date date = this.f23129e;
        int i6 = i3 + 47;
        f23122f = i6 % 128;
        int i7 = i6 % 2;
        return date;
    }

    public final boolean d() {
        int i2 = 2 % 2;
        int i3 = f23124j + 113;
        f23122f = i3 % 128;
        int i4 = i3 % 2;
        Date date = this.f23128d;
        if (date == null || !date.before(new Date())) {
            return false;
        }
        int i5 = f23122f + 15;
        f23124j = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public final long e() {
        int i2 = 2 % 2;
        int i3 = f23122f;
        int i4 = i3 + 27;
        f23124j = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.f23125a;
        int i6 = i3 + 45;
        f23124j = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f23125a == dVar.f23125a) {
                int i3 = f23124j + 43;
                f23122f = i3 % 128;
                if (i3 % 2 != 0) {
                    this.f23127c.ordinal();
                    dVar.f23127c.ordinal();
                    throw null;
                }
                if (this.f23127c.ordinal() == dVar.f23127c.ordinal()) {
                    int i4 = f23124j + 13;
                    f23122f = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 68 / 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHash;
        int i2 = 2 % 2;
        int i3 = f23124j + 85;
        f23122f = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = new Object[3];
            objArr[1] = Long.valueOf(this.f23125a);
            objArr[1] = this.f23127c;
            iHash = Objects.hash(objArr);
        } else {
            iHash = Objects.hash(Long.valueOf(this.f23125a), this.f23127c);
        }
        int i4 = f23122f + 117;
        f23124j = i4 % 128;
        if (i4 % 2 != 0) {
            return iHash;
        }
        throw null;
    }

    public final o.ef.a j() {
        int i2 = 2 % 2;
        int i3 = f23122f + 25;
        int i4 = i3 % 128;
        f23124j = i4;
        int i5 = i3 % 2;
        o.ef.a aVar = this.f23126b;
        int i6 = i4 + 117;
        f23122f = i6 % 128;
        int i7 = i6 % 2;
        return aVar;
    }

    public final String toString() throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        g(27 - (ViewConfiguration.getTapTimeout() >> 16), "\uffff\uffe7\b\t\u0003\u000e\ufffb�\u0003\u0000\u0003\u000e\t￨\u0006\u0006\u000f￪ￗ\ufffe\u0003\u0015\uffff\u0001\ufffb\r\r", true, 116 - TextUtils.getTrimmedLength(""), 18 - (Process.myPid() >> 22), objArr);
        StringBuilder sbAppend = sb.append(((String) objArr[0]).intern()).append(this.f23125a);
        Object[] objArr2 = new Object[1];
        g(ExpandableListView.getPackedPositionChild(0L) + 10, "￦\u0017\u0012\u0010\u0012\u001b\u0018\uffc9ￕ", true, TextUtils.lastIndexOf("", '0', 0, 0) + 102, 9 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
        StringBuilder sbAppend2 = sbAppend.append(((String) objArr2[0]).intern()).append(this.f23127c);
        Object[] objArr3 = new Object[1];
        g(14 - TextUtils.lastIndexOf("", '0', 0, 0), "\u0006￩\u0013\u0014\u000e\u0019\u0006\n\u0017\bￅ\uffd1￢\n\u0019", true, TextUtils.getCapsMode("", 0, 0) + 105, (ViewConfiguration.getScrollBarSize() >> 8) + 12, objArr3);
        StringBuilder sbAppend3 = sbAppend2.append(((String) objArr3[0]).intern()).append(this.f23129e);
        Object[] objArr4 = new Object[1];
        g(9 - TextUtils.getCapsMode("", 0, 0), "ￒ￣\u001f\u0018\u000f\u0016\u001e\u000bￆ", true, 104 - TextUtils.indexOf("", "", 0, 0), ExpandableListView.getPackedPositionGroup(0L) + 1, objArr4);
        StringBuilder sbAppend4 = sbAppend3.append(((String) objArr4[0]).intern()).append(this.f23128d);
        Object[] objArr5 = new Object[1];
        g(9 - TextUtils.indexOf((CharSequence) "", '0'), "\u0016\uffc9ￕ￦\u000e\u0010\n\u001c\u001c\u000e", true, KeyEvent.keyCodeFromString("") + 101, Color.blue(0) + 3, objArr5);
        String string = sbAppend4.append(((String) objArr5[0]).intern()).append(this.f23126b).append(AbstractJsonLexerKt.END_OBJ).toString();
        int i3 = f23124j + 63;
        f23122f = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }
}
