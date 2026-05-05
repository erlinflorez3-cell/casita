package o.cs;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.lang.reflect.Method;
import o.a.k;
import o.ef.a;
import o.en.f;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f22564b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f22565d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f22566e = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r8, short r9, short r10) {
        /*
            int r7 = r9 * 3
            int r1 = r7 + 1
            byte[] r6 = o.cs.b.$$a
            int r0 = r8 * 4
            int r5 = 3 - r0
            int r0 = r10 * 7
            int r4 = 114 - r0
            byte[] r3 = new byte[r1]
            r2 = 0
            if (r6 != 0) goto L2b
            r0 = r5
            r4 = r7
            r1 = r2
        L16:
            int r5 = r5 + r4
            r4 = r5
            r5 = r0
        L19:
            byte r0 = (byte) r4
            r3[r1] = r0
            if (r1 != r7) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L24:
            int r0 = r5 + 1
            int r1 = r1 + 1
            r5 = r6[r0]
            goto L16
        L2b:
            r1 = r2
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cs.b.$$c(byte, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22565d = 0;
        f22566e = 1;
        f22564b = -3119082133312836837L;
    }

    private static void a(String str, int i2, Object[] objArr) throws Throwable {
        Object obj;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 13;
        $11 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (str2 != null) {
            char[] charArray = str2.toCharArray();
            int i5 = $11 + 121;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            obj = charArray;
        } else {
            obj = str2;
        }
        k kVar = new k();
        char[] cArrC = k.c(f22564b ^ (-5882309809461882246L), (char[]) obj, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            int i7 = $11 + 29;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            kVar.f19938a = kVar.f19939c - 4;
            int i9 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f22564b)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(View.MeasureSpec.getMode(0) + 229, (char) (51003 - TextUtils.lastIndexOf("", '0', 0, 0)), 9 - KeyEvent.normalizeMetaState(0), 1749983833, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(675 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (Process.myPid() >> 22), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 12, 522683165, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
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

    public static d b(a aVar) throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        a("皙盰픅가蘵ꖱ", 1 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
        Object[] objArr2 = {aVar, ((String) objArr[0]).intern()};
        int i3 = a.f23782p * (-1576737484);
        a.f23782p = i3;
        String str = (String) a.a(-781664457, objArr2, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i3, Thread.currentThread().getPriority());
        try {
            Object[] objArr3 = new Object[1];
            a("뫙몭䖪ꊐ볁㲲倢킇", (ViewConfiguration.getTapTimeout() >> 16) + 1, objArr3);
            Object[] objArr4 = {aVar, ((String) objArr3[0]).intern()};
            int i4 = a.f23782p * (-1576737484);
            a.f23782p = i4;
            c cVarC = c.c((String) a.a(-781664457, objArr4, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i4, Thread.currentThread().getPriority()));
            int i5 = f22566e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f22565d = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 % 5;
            }
            Object[] objArr5 = new Object[1];
            a("嫚媮옊躬携뼎簖\u086d", 1 - (ViewConfiguration.getTouchSlop() >> 8), objArr5);
            Object[] objArr6 = {aVar, ((String) objArr5[0]).intern(), null};
            int i7 = a.f23773g * 1081559339;
            a.f23773g = i7;
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i8 = a.f23772f * (-1705304066);
            a.f23772f = i8;
            String str2 = (String) a.a(1581939473, objArr6, i8, (int) SystemClock.uptimeMillis(), -1581939469, i7, iMaxMemory);
            Object[] objArr7 = new Object[1];
            a("ྚ\u0ffeጦ舷ₘ樦炁\uea2f䳚", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1, objArr7);
            Object[] objArr8 = {aVar, ((String) objArr7[0]).intern(), null};
            int i9 = a.f23773g * 1081559339;
            a.f23773g = i9;
            int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
            int i10 = a.f23772f * (-1705304066);
            a.f23772f = i10;
            String str3 = (String) a.a(1581939473, objArr8, i10, (int) SystemClock.uptimeMillis(), -1581939469, i9, iMaxMemory2);
            Object[] objArr9 = new Object[1];
            a("肅胡婼㵤斧⍼쿒攳\u09e5", 1 - Color.blue(0), objArr9);
            Object[] objArr10 = {aVar, ((String) objArr9[0]).intern(), null};
            int i11 = a.f23773g * 1081559339;
            a.f23773g = i11;
            int iMaxMemory3 = (int) Runtime.getRuntime().maxMemory();
            int i12 = a.f23772f * (-1705304066);
            a.f23772f = i12;
            d dVar = new d(str, cVarC, str2, str3, (String) a.a(1581939473, objArr10, i12, (int) SystemClock.uptimeMillis(), -1581939469, i11, iMaxMemory3));
            int i13 = f22566e + 33;
            f22565d = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 12 / 0;
            }
            return dVar;
        } catch (IllegalArgumentException unused) {
            StringBuilder sb = new StringBuilder();
            Object[] objArr11 = new Object[1];
            a("⁹‰本⻊ඝḣ\udc7e양懟䂯ќじ\ueb22娾懑嚄郕㞻罀結똄ᄷ哘掄宂\ueab2눈蘜䄘쐪迁계曟ꇾ", View.MeasureSpec.makeMeasureSpec(0, 0) + 1, objArr11);
            StringBuilder sbAppend = sb.append(((String) objArr11[0]).intern());
            Object[] objArr12 = new Object[1];
            a("뫙몭䖪ꊐ볁㲲倢킇", 1 - Color.red(0), objArr12);
            Object[] objArr13 = {aVar, ((String) objArr12[0]).intern()};
            int i15 = a.f23782p * (-1576737484);
            a.f23782p = i15;
            throw new f(sbAppend.append((String) a.a(-781664457, objArr13, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i15, Thread.currentThread().getPriority())).toString());
        }
    }

    static void init$0() {
        $$a = new byte[]{127, 52, 116, 98};
        $$b = 142;
    }
}
