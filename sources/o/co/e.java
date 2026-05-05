package o.co;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import o.a.n;
import o.d.d;
import o.et.h;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends a<h> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f22529a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f22530c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f22531d = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:5:0x0017). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$f(int r9, int r10, short r11) {
        /*
            int r0 = r10 * 2
            int r8 = 5 - r0
            byte[] r7 = o.co.e.$$d
            int r2 = r9 * 2
            int r1 = 1 - r2
            int r0 = r11 * 2
            int r0 = r0 + 113
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r7 != 0) goto L2c
            r3 = r5
            r2 = r8
        L17:
            int r0 = -r0
            int r8 = r8 + r0
            int r2 = r2 + 1
            r1 = r3
        L1c:
            byte r0 = (byte) r8
            r6[r1] = r0
            int r3 = r1 + 1
            if (r1 != r4) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L29:
            r0 = r7[r2]
            goto L17
        L2c:
            r1 = r5
            r2 = r8
            r8 = r0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.co.e.$$f(int, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22529a = 0;
        f22530c = 1;
        f22531d = -1270219498;
    }

    private static h b(String str, String str2, int i2, String str3) {
        int i3 = 2 % 2;
        h hVar = new h(str, str2, i2, str3);
        int i4 = f22529a + 29;
        f22530c = i4 % 128;
        if (i4 % 2 != 0) {
            return hVar;
        }
        throw null;
    }

    private static byte[] b() {
        int i2 = 2 % 2;
        int i3 = f22529a + 39;
        f22530c = i3 % 128;
        int i4 = i3 % 2;
        return new byte[0];
    }

    static void init$0() {
        $$d = new byte[]{0, -128, Ascii.EM, 70, MessagePack.Code.FIXEXT4};
        $$e = 45;
    }

    private static void m(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        int i6 = $11 + 77;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (nVar.f19944a < i2) {
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i8 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(f22531d)};
                Object objA = d.a(1376241034);
                if (objA == null) {
                    int i9 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 269;
                    char c2 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int mirror = ';' - AndroidCharacter.getMirror('0');
                    byte b2 = $$d[0];
                    byte b3 = b2;
                    objA = d.a(i9, c2, mirror, -2071844881, false, $$f(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = d.a(-202660535);
                if (objA2 == null) {
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 522;
                    char trimmedLength = (char) TextUtils.getTrimmedLength("");
                    int i10 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 11;
                    byte b4 = $$d[0];
                    byte b5 = b4;
                    objA2 = d.a(longPressTimeout, trimmedLength, i10, 627984172, false, $$f(b4, b5, b5), new Class[]{Object.class, Object.class});
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
                int i11 = $10 + 33;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = d.a(-202660535);
                if (objA3 == null) {
                    int iIndexOf = 522 - TextUtils.indexOf("", "", 0);
                    char c3 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int iRed = Color.red(0) + 12;
                    byte b6 = $$d[0];
                    byte b7 = b6;
                    objA3 = d.a(iIndexOf, c3, iRed, 627984172, false, $$f(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    @Override // o.co.a
    public final /* bridge */ /* synthetic */ o.et.a c(String str, String str2, int i2, String str3) {
        int i3 = 2 % 2;
        int i4 = f22529a + 5;
        f22530c = i4 % 128;
        if (i4 % 2 != 0) {
            return super.c(str, str2, i2, str3);
        }
        super.c(str, str2, i2, str3);
        throw null;
    }

    @Override // o.co.a
    final void c(List<h> list, o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        m(14 - (ViewConfiguration.getScrollDefaultDelay() >> 16), "�\t\f\ufffe\r￬\t\ufffb\u0007\u0003\b\u0001￬\uffff", false, TextUtils.lastIndexOf("", '0', 0) + 116, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 5, objArr);
        Object[] objArr2 = {aVar, ((String) objArr[0]).intern()};
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int iMyUid = Process.myUid();
        int i3 = o.ef.a.f23780n * (-1229108307);
        o.ef.a.f23780n = i3;
        b();
        Iterator<h> it = list.iterator();
        int i4 = f22530c + 9;
        f22529a = i4 % 128;
        int i5 = i4 % 2;
        while (it.hasNext()) {
            int i6 = f22529a + 65;
            f22530c = i6 % 128;
            if (i6 % 2 == 0) {
                it.next();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            it.next();
        }
    }

    @Override // o.co.a, o.cl.c
    public final /* bridge */ /* synthetic */ List d(String str, String str2, int i2, String str3, o.ef.a aVar) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f22529a + 23;
        f22530c = i4 % 128;
        int i5 = i4 % 2;
        List listD = super.d(str, str2, i2, str3, aVar);
        int i6 = f22530c + 65;
        f22529a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 83 / 0;
        }
        return listD;
    }

    @Override // o.co.a
    final /* synthetic */ o.et.a e(String str, String str2, int i2, String str3) {
        int i3 = 2 % 2;
        int i4 = f22529a + 57;
        f22530c = i4 % 128;
        if (i4 % 2 == 0) {
            b(str, str2, i2, str3);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        h hVarB = b(str, str2, i2, str3);
        int i5 = f22529a + 107;
        f22530c = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 86 / 0;
        }
        return hVarB;
    }
}
