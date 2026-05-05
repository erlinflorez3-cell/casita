package o.ad;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import o.a.i;
import o.i.c;
import o.m.f;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends c {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f20132b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f20133c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f20134d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f20135e = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f20136h = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:5:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$f(short r7, byte r8, byte r9) {
        /*
            int r7 = r7 * 3
            int r1 = r7 + 1
            int r0 = r9 + 4
            int r6 = 122 - r8
            byte[] r5 = o.ad.b.$$d
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r5 != 0) goto L26
            r2 = r0
            r1 = r3
        L11:
            int r0 = -r0
            int r6 = r6 + r0
            r0 = r2
        L14:
            int r2 = r0 + 1
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r1 != r7) goto L21
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L21:
            int r1 = r1 + 1
            r0 = r5[r2]
            goto L11
        L26:
            r1 = r3
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ad.b.$$f(short, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20134d = 0;
        f20136h = 1;
        b();
        Process.getThreadPriority(0);
        ExpandableListView.getPackedPositionGroup(0L);
        int i2 = f20136h + 93;
        f20134d = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b() throws Throwable {
        Object[] objArr = new Object[1];
        j((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), "봢礎ᰪ荭躒㚻ꨊ⼗\ue8cb\uddd3籝踝\uf602㮧뜙꼦\uecf6졐쁣좜\u187e霨絺뾞瀒棼津㴲圉架\ue6dd奝趩", "\u0000\u0000\u0000\u0000", "눈ɰ묹熺", ExpandableListView.getPackedPositionType(0L) + 956461234, objArr);
        super(((String) objArr[0]).intern(), f.f26439e, true);
    }

    static void b() {
        f20133c = 740602047300126166L;
        f20132b = -2027946841;
        f20135e = (char) 17878;
    }

    static void init$0() {
        $$d = new byte[]{35, 9, MessagePack.Code.STR32, -91};
        $$e = 205;
    }

    private static void j(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = $11 + 63;
        $10 = i5 % 128;
        Object charArray = str6;
        if (i5 % 2 != 0) {
            throw null;
        }
        if (str6 != null) {
            charArray = str6.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        int i6 = 0;
        Object charArray2 = str5;
        if (str5 != null) {
            int i7 = $10 + 83;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 31 / 0;
                charArray2 = str5.toCharArray();
            } else {
                charArray2 = str5.toCharArray();
            }
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
            int i9 = $10 + 21;
            $11 = i9 % 128;
            int i10 = i9 % i3;
            try {
                Object[] objArr2 = {iVar};
                Object objA = o.d.d.a(540069882);
                if (objA == null) {
                    int iIndexOf = TextUtils.indexOf("", "", i6, i6) + 106;
                    char cResolveSizeAndState = (char) View.resolveSizeAndState(i6, i6, i6);
                    int absoluteGravity = Gravity.getAbsoluteGravity(i6, i6) + 11;
                    byte b2 = (byte) i6;
                    String str$$f = $$f(b2, (byte) ((b2 + 57) - (57 & b2)), (byte) (-1));
                    Class[] clsArr = new Class[1];
                    clsArr[i6] = Object.class;
                    objA = o.d.d.a(iIndexOf, cResolveSizeAndState, absoluteGravity, -155898465, false, str$$f, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = o.d.d.a(2068572);
                if (objA2 == null) {
                    byte b3 = (byte) i6;
                    objA2 = o.d.d.a(847 - (KeyEvent.getMaxKeyCode() >> 16), (char) (Color.rgb(i6, i6, i6) + 16783704), (ExpandableListView.getPackedPositionForChild(i6, i6) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i6, i6) == 0L ? 0 : -1)) + 13, -694521287, false, $$f(b3, (byte) (54 | b3), (byte) (-1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA3 = o.d.d.a(-1122996612);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = o.d.d.a((Process.myPid() >> 22) + 458, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 11, 1804962841, false, $$f(b4, (byte) ((-1) - (((-1) - b4) & ((-1) - 56))), (byte) (-1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = o.d.d.a(-1223178239);
                if (objA4 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objA4 = o.d.d.a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 639, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 65101), 13 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 1636969060, false, $$f(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r7[iVar.f19932b])) ^ (f20133c ^ 740602047300126166L)) ^ ((long) ((int) (((long) f20132b) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f20135e) ^ 740602047300126166L))));
                iVar.f19932b++;
                int i11 = $11 + 19;
                $10 = i11 % 128;
                i3 = 2;
                int i12 = i11 % 2;
                i6 = 0;
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
}
