package o.di;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.i;
import o.a.k;

/* JADX INFO: loaded from: classes6.dex */
final class c extends d {
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f23038a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f23039b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f23040c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f23041d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f23042e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f23043f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f23044g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f23045i = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(int r7, short r8, byte r9) {
        /*
            int r7 = r7 * 4
            int r1 = r7 + 1
            int r0 = r9 * 4
            int r6 = r0 + 4
            int r0 = 122 - r8
            byte[] r5 = o.di.c.$$c
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r5 != 0) goto L27
            r2 = r6
            r1 = r3
        L13:
            int r0 = -r0
            int r6 = r6 + r0
            int r2 = r2 + 1
        L17:
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r1 != r7) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L22:
            int r1 = r1 + 1
            r0 = r5[r2]
            goto L13
        L27:
            r1 = r3
            r2 = r6
            r6 = r0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.di.c.$$e(int, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23043f = 0;
        f23045i = 1;
        f23041d = 0;
        f23044g = 1;
        c();
        View.resolveSizeAndState(0, 0, 0);
        SystemClock.elapsedRealtimeNanos();
        int i2 = f23043f + 73;
        f23045i = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 49 / 0;
        }
    }

    c() {
    }

    static void c() {
        f23042e = 2456058117146100443L;
        f23040c = 1564493270;
        f23038a = (char) 17878;
        f23039b = 6704454480032371211L;
    }

    private static void h(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2 % 2;
        Object obj = null;
        Object charArray = str6;
        if (str6 != null) {
            int i4 = $11 + 47;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                str6.toCharArray();
                throw null;
            }
            charArray = str6.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str5;
        if (str5 != null) {
            int i5 = $10 + 23;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            charArray2 = str5.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str4;
        if (str4 != null) {
            int i7 = $11 + 13;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                str4.toCharArray();
                throw null;
            }
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
            try {
                Object[] objArr2 = {iVar};
                Object objA = o.d.d.a(540069882);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a(106 - TextUtils.indexOf("", ""), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), ((Process.getThreadPriority(0) + 20) >> 6) + 11, -155898465, false, $$e(b2, (byte) (57 | b2), b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(obj, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = o.d.d.a(2068572);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = o.d.d.a(847 - Color.red(0), (char) (6488 - View.MeasureSpec.getSize(0)), View.MeasureSpec.getMode(0) + 12, -694521287, false, $$e(b3, (byte) ((b3 + 54) - (54 & b3)), b3), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA3 = o.d.d.a(-1122996612);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = o.d.d.a(((Process.getThreadPriority(0) + 20) >> 6) + 458, (char) KeyEvent.normalizeMetaState(0), View.combineMeasuredStates(0, 0) + 11, 1804962841, false, $$e(b4, (byte) ((b4 + 56) - (56 & b4)), b4), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = o.d.d.a(-1223178239);
                if (objA4 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objA4 = o.d.d.a(Process.getGidForName("") + OlympusMakernoteDirectory.TAG_PREVIEW_IMAGE, (char) (65099 - ((byte) KeyEvent.getModifierMetaStateMask())), 11 - TextUtils.lastIndexOf("", '0', 0, 0), 1636969060, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                obj = null;
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r9[iVar.f19932b])) ^ (f23042e ^ 740602047300126166L)) ^ ((long) ((int) (((long) f23040c) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f23038a) ^ 740602047300126166L))));
                iVar.f19932b++;
                int i8 = $10 + 113;
                $11 = i8 % 128;
                int i9 = i8 % 2;
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
        $$c = new byte[]{113, 60, -124, 107};
        $$d = 179;
    }

    private static void j(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10;
        int i5 = i4 + 9;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        if (str2 != null) {
            int i7 = i4 + 117;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        k kVar = new k();
        char[] cArrC = k.c(f23039b ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            kVar.f19938a = kVar.f19939c - 4;
            int i9 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f23039b)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a(((byte) KeyEvent.getModifierMetaStateMask()) + 230, (char) (51004 - TextUtils.getCapsMode("", 0, 0)), 9 - ExpandableListView.getPackedPositionGroup(0L), 1749983833, false, $$e(b2, (byte) ((b2 + Ascii.SI) - (15 & b2)), b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = o.d.d.a(675 - TextUtils.indexOf("", "", 0), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.CR, 522683165, false, $$e(b3, (byte) ((-1) - (((-1) - b3) & ((-1) - 8))), b3), new Class[]{Object.class, Object.class});
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

    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    @Override // o.di.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.di.b a(android.content.Context r27, o.ef.a r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 687
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.di.c.a(android.content.Context, o.ef.a):o.di.b");
    }
}
