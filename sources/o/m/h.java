package o.m;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.CancellationSignal;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethod;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethodType;
import fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPrompt;
import fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPromptCallback;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public abstract class h implements o.ea.a<CustomerAuthenticationMethod> {
    private static final byte[] $$l = null;
    private static final int $$m = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b */
    private static long f26471b = 0;

    /* JADX INFO: renamed from: f */
    private static int f26472f = 0;

    /* JADX INFO: renamed from: g */
    public static int f26473g = 0;

    /* JADX INFO: renamed from: h */
    public static int f26474h = 0;

    /* JADX INFO: renamed from: i */
    public static int f26475i = 0;

    /* JADX INFO: renamed from: j */
    private static int[] f26476j = null;

    /* JADX INFO: renamed from: k */
    public static int f26477k = 0;

    /* JADX INFO: renamed from: l */
    public static int f26478l = 0;

    /* JADX INFO: renamed from: m */
    private static int f26479m = 0;

    /* JADX INFO: renamed from: n */
    public static int f26480n = 0;

    /* JADX INFO: renamed from: o */
    private static int f26481o = 0;

    /* JADX INFO: renamed from: s */
    private static int f26482s = 0;

    /* JADX INFO: renamed from: a */
    private b f26483a;

    /* JADX INFO: renamed from: c */
    private i f26484c;

    /* JADX INFO: renamed from: d */
    private final HashMap<f, o.q.a> f26485d = new HashMap<>();

    /* JADX INFO: renamed from: e */
    private Integer f26486e;

    /* JADX INFO: renamed from: o.m.h$2 */
    final class AnonymousClass2 implements o.l.a {

        /* JADX INFO: renamed from: e */
        private static int f26487e = 0;

        /* JADX INFO: renamed from: j */
        private static int f26488j = 1;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Context f26490b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ CustomerAuthenticationPromptCallback f26491c;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ CancellationSignal f26492d;

        AnonymousClass2(CustomerAuthenticationPromptCallback customerAuthenticationPromptCallback, Context context, CancellationSignal cancellationSignal) {
            customerAuthenticationPromptCallback = customerAuthenticationPromptCallback;
            context = context;
            cancellationSignal = cancellationSignal;
        }

        @Override // o.l.a
        public final void b(o.g.a aVar, o.l.c cVar) {
            int i2 = 2 % 2;
            new o.bz.b();
            CustomerAuthenticationPromptCallback customerAuthenticationPromptCallback = customerAuthenticationPromptCallback;
            if (customerAuthenticationPromptCallback != null) {
                int i3 = f26488j;
                int i4 = (((i3 + 87) - (87 & i3)) << 1) - (i3 ^ 87);
                f26487e = i4 % 128;
                int i5 = i4 % 2;
                customerAuthenticationPromptCallback.onAuthenticationSuccess(o.bz.b.b(aVar));
                int i6 = f26487e + 25;
                f26488j = i6 % 128;
                int i7 = i6 % 2;
            }
            int i8 = f26488j;
            int i9 = ((i8 + 91) - (91 | i8)) + (i8 | 91);
            f26487e = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
        }

        @Override // o.l.a
        public final void c(o.l.c cVar) {
            int i2 = 2 % 2;
            int i3 = f26488j + 75;
            f26487e = i3 % 128;
            int i4 = i3 % 2;
            int i5 = o.l.c.f26343i * 1393535565;
            o.l.c.f26343i = i5;
            int iMyUid = Process.myUid();
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i6 = o.l.c.f26342h * 1493295148;
            o.l.c.f26342h = i6;
            if (((o.l.c) o.l.c.b(iFreeMemory, i6, iMyUid, 1058468260, new Object[]{cVar}, -1058468258, i5)) != null) {
                int i7 = f26487e;
                int i8 = (i7 & 59) + ((i7 + 59) - (i7 & 59));
                f26488j = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = o.l.c.f26343i * 1393535565;
                    o.l.c.f26343i = i9;
                    int iMyUid2 = Process.myUid();
                    int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
                    int i10 = o.l.c.f26342h * 1493295148;
                    o.l.c.f26342h = i10;
                    ((o.l.c) o.l.c.b(iFreeMemory2, i10, iMyUid2, 1058468260, new Object[]{cVar}, -1058468258, i9)).b(context, this, cancellationSignal);
                    int i11 = 68 / 0;
                } else {
                    int i12 = o.l.c.f26343i * 1393535565;
                    o.l.c.f26343i = i12;
                    int iMyUid3 = Process.myUid();
                    int iFreeMemory3 = (int) Runtime.getRuntime().freeMemory();
                    int i13 = o.l.c.f26342h * 1493295148;
                    o.l.c.f26342h = i13;
                    ((o.l.c) o.l.c.b(iFreeMemory3, i13, iMyUid3, 1058468260, new Object[]{cVar}, -1058468258, i12)).b(context, this, cancellationSignal);
                }
            }
            int i14 = f26488j;
            int i15 = (i14 ^ 99) + (((i14 + 99) - (i14 | 99)) << 1);
            f26487e = i15 % 128;
            if (i15 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
        
            if (((o.l.c) o.l.c.b(r5, r6, r7, 1058468260, new java.lang.Object[]{r14}, -1058468258, r11)) != null) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
        
            r11 = o.l.c.f26343i * 1393535565;
            o.l.c.f26343i = r11;
            r7 = android.os.Process.myUid();
            r5 = (int) java.lang.Runtime.getRuntime().freeMemory();
            r6 = o.l.c.f26342h * 1493295148;
            o.l.c.f26342h = r6;
            r3 = (o.l.c) o.l.c.b(r5, r6, r7, 1058468260, new java.lang.Object[]{r14}, -1058468258, r11);
            r3.e((o.l.c) null);
            r3.b(r3, r12, r4);
            r1 = o.m.h.AnonymousClass2.f26487e + 61;
            o.m.h.AnonymousClass2.f26488j = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
        
            if ((r1 % 2) == 0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00bf, code lost:
        
            if (((o.l.c) o.l.c.b(r5, r6, r7, 1058468260, new java.lang.Object[]{r14}, -1058468258, r11)) != null) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00c2, code lost:
        
            throw null;
         */
        @Override // o.l.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(o.l.d r13, o.l.c r14) {
            /*
                Method dump skipped, instruction units count: 231
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.m.h.AnonymousClass2.c(o.l.d, o.l.c):void");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0029 -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(int r9, short r10, int r11) {
        /*
            byte[] r8 = o.m.h.$$l
            int r7 = r11 + 107
            int r0 = r10 * 2
            int r6 = r0 + 4
            int r1 = r9 * 2
            int r0 = 1 - r1
            byte[] r5 = new byte[r0]
            r4 = 0
            int r3 = 0 - r1
            if (r8 != 0) goto L2e
            r7 = r3
            r1 = r6
            r2 = r4
        L16:
            int r6 = r6 + r7
            int r0 = r1 + 1
            r1 = r2
            r7 = r6
            r6 = r0
        L1c:
            byte r0 = (byte) r7
            r5[r1] = r0
            int r2 = r1 + 1
            if (r1 != r3) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L29:
            r0 = r8[r6]
            r1 = r6
            r6 = r0
            goto L16
        L2e:
            r1 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m.h.$$n(int, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26478l = -295139584;
        f26480n = -570417952;
        f26477k = -1780002052;
        f26474h = 1183062431;
        f26475i = -509500738;
        f26473g = 884154451;
        f26479m = 0;
        f26482s = 1;
        f26472f = 0;
        f26481o = 1;
        n();
        ViewConfiguration.getScrollBarFadeDuration();
        ViewConfiguration.getKeyRepeatTimeout();
        ViewConfiguration.getJumpTapTimeout();
        int i2 = f26479m + 55;
        f26482s = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public h(i iVar) {
        this.f26484c = iVar;
    }

    private static void G(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i4 = $10 + 111;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                str2.toCharArray();
                throw null;
            }
            charArray = str2.toCharArray();
        }
        o.a.k kVar = new o.a.k();
        char[] cArrC = o.a.k.c(f26471b ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            int i5 = $10 + 5;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            kVar.f19938a = kVar.f19939c - 4;
            int i7 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f26471b)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(Gravity.getAbsoluteGravity(0, 0) + 229, (char) (KeyEvent.normalizeMetaState(0) + 51004), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 8, 1749983833, false, $$n(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(Color.rgb(0, 0, 0) + 16777891, (char) Drawable.resolveOpacity(0, 0), Color.green(0) + 12, 522683165, false, $$n(b4, b5, (byte) ((b5 + 7) - (7 & b5))), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                int i8 = $10 + 55;
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
        objArr[0] = new String(cArrC, 4, cArrC.length - 4);
    }

    private static void H(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        o.a.l lVar = new o.a.l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f26476j;
        char c2 = '0';
        int i5 = 989264422;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = $11 + 125;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + 67;
                $10 = i10 % 128;
                int i11 = i10 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i9])};
                    Object objA = o.d.d.a(i5);
                    if (objA == null) {
                        byte b2 = (byte) i6;
                        byte b3 = b2;
                        objA = o.d.d.a(TextUtils.indexOf("", "") + 675, (char) (TextUtils.indexOf("", c2) + 1), (ViewConfiguration.getTouchSlop() >> 8) + 12, -328001469, false, $$n(b2, b3, (byte) ((-1) - (((-1) - b3) & ((-1) - 14)))), new Class[]{Integer.TYPE});
                    }
                    iArr3[i9] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i9++;
                    i3 = 2;
                    c2 = '0';
                    i5 = 989264422;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f26476j;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i12 = 0; i12 < length3; i12++) {
                int i13 = $10 + 87;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                Object[] objArr3 = {Integer.valueOf(iArr5[i12])};
                Object objA2 = o.d.d.a(989264422);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(674 - TextUtils.lastIndexOf("", '0'), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 12 - Color.red(0), -328001469, false, $$n(b4, b5, (byte) (14 | b5)), new Class[]{Integer.TYPE});
                }
                iArr6[i12] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        lVar.f19941d = 0;
        int i15 = $10 + 13;
        $11 = i15 % 128;
        int i16 = i15 % 2;
        while (lVar.f19941d < iArr.length) {
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            o.a.l.a(iArr4);
            int i17 = 0;
            for (int i18 = 16; i17 < i18; i18 = 16) {
                int i19 = $11 + 75;
                $10 = i19 % 128;
                int i20 = i19 % 2;
                lVar.f19942e ^= iArr4[i17];
                Object[] objArr4 = {lVar, Integer.valueOf(o.a.l.e(lVar.f19942e)), lVar, lVar};
                Object objA3 = o.d.d.a(2098218801);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(301 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (52696 - Process.getGidForName("")), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 11, -1416256172, false, $$n(b6, b7, (byte) ((-1) - (((-1) - b7) & ((-1) - 12)))), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i17++;
            }
            int i21 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i21;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i22 = lVar.f19942e;
            int i23 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            o.a.l.a(iArr4);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr5 = {lVar, lVar};
            Object objA4 = o.d.d.a(986820978);
            if (objA4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objA4 = o.d.d.a(229 - (ViewConfiguration.getTapTimeout() >> 16), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 51004), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 9, -330018025, false, $$n(b8, b9, (byte) ((-1) - (((-1) - b9) & ((-1) - 10)))), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private CustomerAuthenticationMethod a() {
        int i2 = 669539982 * f26473g;
        f26473g = i2;
        int i3 = f26475i * (-754464451);
        f26475i = i3;
        int i4 = f26474h * 1424163322;
        f26474h = i4;
        return (CustomerAuthenticationMethod) c(i4, new Object[]{this}, i2, -379724694, i3, 379724694, (int) Process.getElapsedCpuTime());
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i2 = 2 % 2;
        CustomerAuthenticationMethod customerAuthenticationMethod = new CustomerAuthenticationMethod((h) objArr[0]);
        int i3 = f26472f + 57;
        f26481o = i3 % 128;
        if (i3 % 2 != 0) {
            return customerAuthenticationMethod;
        }
        throw null;
    }

    public static /* synthetic */ Object c(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) throws CloneNotSupportedException {
        int i8 = ~i6;
        int i9 = ~i3;
        int i10 = (~((-1) - (((-1) - i8) & ((-1) - i9)))) | i4;
        int i11 = (-1) - (((-1) - i9) & ((-1) - i4));
        int i12 = (~((~i4) | i6)) | (~i11);
        int i13 = (~((-1) - (((-1) - i3) & ((-1) - ((-1) - (((-1) - i8) & ((-1) - i4))))))) | (~((-1) - (((-1) - i11) & ((-1) - i6))));
        int i14 = i4 + i6 + i5 + (528639218 * i2) + ((-532493036) * i7);
        int i15 = i14 * i14;
        int i16 = ((i4 * 873666089) - 1460666368) + (873666089 * i6) + ((-875965520) * i10) + (437982760 * i12) + ((-437982760) * i13) + (435683328 * i5) + (1819279360 * i2) + ((-1621098496) * i7) + (586088448 * i15);
        int i17 = (i4 * (-1573143961)) + 2078511484 + (i6 * (-1573143961)) + (i10 * 1872) + (i12 * (-936)) + (i13 * 936) + (i5 * (-1573143025)) + (i2 * 123045422) + (i7 * (-1548035028)) + (i15 * 1845559296);
        int i18 = i16 + (i17 * i17 * 1848705024);
        if (i18 != 1) {
            return i18 != 2 ? b(objArr) : e(objArr);
        }
        int i19 = 2 % 2;
        throw new CloneNotSupportedException();
    }

    private o.q.a d(f fVar) {
        int i2 = 2 % 2;
        int i3 = f26472f + 99;
        f26481o = i3 % 128;
        int i4 = i3 % 2;
        o.q.a aVar = this.f26485d.get(fVar);
        if (i4 != 0) {
            return aVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0035, code lost:
    
        if (r10 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0037, code lost:
    
        if (r2 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x003f, code lost:
    
        if (r9.f26483a != o.m.b.f26400a) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0041, code lost:
    
        r3 = r9.e(r10, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0045, code lost:
    
        if (r8 == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0047, code lost:
    
        r2 = o.m.c.d().d(o.m.i.b(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0053, code lost:
    
        if (r2 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0059, code lost:
    
        if (r2.f26483a != o.m.b.f26400a) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x005b, code lost:
    
        if (r12 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x005d, code lost:
    
        r2 = r2.e(r10, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0065, code lost:
    
        if (r3.e(r2) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0067, code lost:
    
        r1 = o.m.h.f26472f + 47;
        o.m.h.f26481o = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0070, code lost:
    
        if ((r1 % 2) == 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0076, code lost:
    
        if (r2.e(r3) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x007c, code lost:
    
        if (o.ea.f.a() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x007e, code lost:
    
        r1 = o.m.h.f26481o + 115;
        o.m.h.f26472f = r1 % 128;
        r1 = r1 % 2;
        r0 = new java.lang.Object[1];
        H(new int[]{1773064499, 1862432808, 309281407, 379712727, -331132011, 1326481510, 381588527, -1887089791, -1363084840, 310984324, 725810801, 1735494774, 567383541, 1283995012, 835036455, -432914093, 1366736004, 509135808}, 33 - (android.view.KeyEvent.getMaxKeyCode() >> 16), r0);
        r5 = ((java.lang.String) r0[0]).intern();
        r0 = new java.lang.Object[1];
        H(new int[]{1333674542, -665470902, 1187108079, 692305990, -125611110, -1333513232, -1694041728, -1615716275, 194407760, -952620917, -1919439486, -814277277, -1785046504, 438081819, 1531166524, -1210123526, -871608288, -387921201, -513921995, -1923804369, 1681829787, 1671780827, -829274595, 573239376, 1064416492, -363990160, 1445960424, 648152354, 811000653, -1442166547, -1456335813, -1831090402, 868395963, -1829582814, 333101536, 775642087}, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 71, r0);
        o.ea.f.d(r5, java.lang.String.format(((java.lang.String) r0[0]).intern(), r9.d(), r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ce, code lost:
    
        r2 = fr.antelop.sdk.exception.WalletValidationErrorCode.Unexpected;
        r0 = new java.lang.Object[1];
        G("稳穰鲣蹼棇䷠둟菕ヴ솜ݞ㚋\uef22㬬툗祹ꖮ湯淿ꏀ僰ꆈ❇효༔ᬿ\uf216\u197c얷乑跬䏕", android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e8, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(r2, ((java.lang.String) r0[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e9, code lost:
    
        if (r10 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ed, code lost:
    
        r2.e(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f2, code lost:
    
        r3 = fr.antelop.sdk.exception.WalletValidationErrorCode.Mandatory;
        r0 = new java.lang.Object[1];
        H(new int[]{-755900130, -1693792926, -1407834718, 804647056, 2128869490, -517936905, 865805565, 2012090520, 1555773940, -288323887, -1023655572, -1504143888, -689594026, -174494125}, 28 - android.graphics.Color.blue(0), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0113, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(r3, ((java.lang.String) r0[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0114, code lost:
    
        r2 = fr.antelop.sdk.exception.WalletValidationErrorCode.WrongState;
        r0 = new java.lang.Object[1];
        G("稳穰鲣蹼棇䷠둟菕ヴ솜ݞ㚋\uef22㬬툗祹ꖮ湯淿ꏀ僰ꆈ❇효༔ᬿ\uf216\u197c얷乑跬䏕", android.text.TextUtils.indexOf("", ""), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0130, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(r2, ((java.lang.String) r0[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0131, code lost:
    
        r2 = fr.antelop.sdk.exception.WalletValidationErrorCode.Unknown;
        r0 = new java.lang.Object[1];
        G("稳穰鲣蹼棇䷠둟菕ヴ솜ݞ㚋\uef22㬬툗祹ꖮ湯淿ꏀ僰ꆈ❇효༔ᬿ\uf216\u197c얷乑跬䏕", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014c, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(r2, ((java.lang.String) r0[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x014d, code lost:
    
        if (r11 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x014f, code lost:
    
        r3.b(r10, new o.m.h.AnonymousClass2(r9), r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0158, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0159, code lost:
    
        r11 = new android.os.CancellationSignal();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x015f, code lost:
    
        r2 = fr.antelop.sdk.exception.WalletValidationErrorCode.WrongState;
        r0 = new java.lang.Object[1];
        G("稳穰鲣蹼棇䷠둟菕ヴ솜ݞ㚋\uef22㬬툗祹ꖮ湯淿ꏀ僰ꆈ❇효༔ᬿ\uf216\u197c얷乑跬䏕", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x017a, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(r2, ((java.lang.String) r0[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x017b, code lost:
    
        r3 = fr.antelop.sdk.exception.WalletValidationErrorCode.Mandatory;
        r0 = new java.lang.Object[1];
        H(new int[]{-755900130, -1693792926, -1407834718, 804647056, 2128869490, -517936905, 865805565, 2012090520, 1555773940, -288323887, -1023655572, -1504143888, -689594026, -174494125}, 'L' - android.text.AndroidCharacter.getMirror('0'), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019e, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(r3, ((java.lang.String) r0[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x019f, code lost:
    
        r4 = fr.antelop.sdk.exception.WalletValidationErrorCode.Mandatory;
        r0 = new java.lang.Object[1];
        H(new int[]{-26929594, 1783894078, -1791614819, -612892138}, 7 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01cb, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(r4, ((java.lang.String) r0[0]).intern());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object e(java.lang.Object[] r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m.h.e(java.lang.Object[]):java.lang.Object");
    }

    static void init$0() {
        $$l = new byte[]{Ascii.ETB, 117, 49, -107};
        $$m = 164;
    }

    static void n() {
        f26471b = -2541063919061270320L;
        f26476j = new int[]{1658225355, -1184484497, -302388786, 949037897, 1280716792, 1384507047, 1714960047, -1848600650, -1998366688, -607071241, -1796312144, 812277281, 1120144822, -1886956278, -1571627223, 757300787, -1966680220, -390518535};
    }

    void a(Context context) {
        int i2 = 2 % 2;
        int i3 = f26472f + 33;
        f26481o = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            int i5 = f26481o + 1;
            f26472f = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            H(new int[]{1773064499, 1862432808, 309281407, 379712727, -331132011, 1326481510, 381588527, -1887089791, -1363084840, 310984324, 725810801, 1735494774, 567383541, 1283995012, 835036455, -432914093, 1366736004, 509135808}, 33 - TextUtils.indexOf("", ""), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            H(new int[]{-685560395, -1731527457, 557541810, 2027505181, 835036455, -432914093, -2026763158, -978848551, 1691084588, 1039017320, 2068883539, 1601930495, -1692334524, -1821702636, -1019992338, -1901713123, -704456420, 312871644, 485485507, 1868529012, 1462179598, 80231194, -640401303, 1719456761, -84889132, -1495064083, -1818586075, 2047835, -892510146, -963570675, 2067183474, -1111266303}, 63 - Color.red(0), objArr2);
            o.ea.f.c(strIntern, String.format(((String) objArr2[0]).intern(), d(), f()));
        }
        int i7 = f26472f + 59;
        f26481o = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void a(Context context, boolean z2, o.ef.a aVar) {
        int i2 = 2 % 2;
        if (z2) {
            int i3 = f26472f + 67;
            f26481o = i3 % 128;
            int i4 = i3 % 2;
            a(b.f26400a);
            int i5 = f26481o + 3;
            f26472f = i5 % 128;
            int i6 = i5 % 2;
        } else {
            a(b.f26402c);
        }
        if (o.ea.f.a()) {
            int i7 = f26472f + 57;
            f26481o = i7 % 128;
            int i8 = i7 % 2;
            Object[] objArr = new Object[1];
            H(new int[]{1773064499, 1862432808, 309281407, 379712727, -331132011, 1326481510, 381588527, -1887089791, -1363084840, 310984324, 725810801, 1735494774, 567383541, 1283995012, 835036455, -432914093, 1366736004, 509135808}, 33 - View.MeasureSpec.getSize(0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            H(new int[]{-685560395, -1731527457, 1150425423, 493163680, -1683610994, 2091812303, 2102349295, 278751905, -402708751, -1881280174, -470987834, 601333708, -1785046504, 438081819, 66068322, -1766584404, 138913337, 396726436, -640401303, 1719456761, 394956278, -1076270112}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 41, objArr2);
            o.ea.f.c(strIntern, String.format(((String) objArr2[0]).intern(), d(), f()));
        }
        if (aVar != null) {
            int i9 = f26481o + 77;
            f26472f = i9 % 128;
            if (i9 % 2 != 0) {
                this.f26485d.values().iterator();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            for (o.q.a aVar2 : this.f26485d.values()) {
                int i10 = f26472f + 49;
                f26481o = i10 % 128;
                int i11 = i10 % 2;
                aVar2.a(aVar.v(aVar2.c()));
            }
        }
    }

    public final void a(b bVar) {
        int i2 = 2 % 2;
        int i3 = f26481o + 35;
        f26472f = i3 % 128;
        if (i3 % 2 == 0) {
            this.f26483a = bVar;
            return;
        }
        this.f26483a = bVar;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean a(f fVar) {
        int i2 = 2 % 2;
        int i3 = f26472f + 75;
        f26481o = i3 % 128;
        int i4 = i3 % 2;
        boolean zContains = this.f26485d.keySet().contains(fVar);
        int i5 = f26481o + 71;
        f26472f = i5 % 128;
        if (i5 % 2 == 0) {
            return zContains;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public o.g.b b(o.g.a aVar, f fVar, boolean z2) throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        H(new int[]{1773064499, 1862432808, 309281407, 379712727, -331132011, 1326481510, 381588527, -1887089791, -1363084840, 310984324, 725810801, 1735494774, 567383541, 1283995012, 835036455, -432914093, 1366736004, 509135808}, 33 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
        String strIntern = ((String) objArr[0]).intern();
        o.q.a aVar2 = this.f26485d.get(fVar);
        if (o.ea.f.a()) {
            Object[] objArr2 = new Object[1];
            H(new int[]{1358546029, -1977833966, -2102181010, 2119740620, 374994046, -1951885018, 865805565, 2012090520, 539524636, 620979904, 601677793, 1619462678, -1416513723, 1904293140, 835036455, -432914093, -201749341, -1759252863, -1022898335, -17714198}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 39, objArr2);
            o.ea.f.c(strIntern, String.format(((String) objArr2[0]).intern(), d()));
        }
        if (aVar2 == null) {
            if (o.ea.f.a()) {
                Object[] objArr3 = new Object[1];
                G("竼窊⊛ぐ奉籱穤䷳〰羨㛁\uf8a7\uefef蔓\ue388띎ꕡ큗山添倽᾽ᛎ\u18af࿇ꔈ쎲흇씬\uf02c밭跬瀋㾫盇㢛\u2fd8䔕⎸\uf734\ue534逤鱕귡逞\udfc4囉墏侪攍άᜳհ끢ﱝ췛뀆ￌ뚵碗澿Ԥ掩㝪╂偶\udc17\ued92퀝龑雨顩辵┮䍐坢䕂炎㰙ඊ\uf0f7뿌\uf6f5롢꾳씣ꍉ真敐\u10c9᰷ⷛႬ念훥\ud86f쿄\ue534荀霆蕔ゞ簹", ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0), objArr3);
                o.ea.f.c(strIntern, ((String) objArr3[0]).intern());
            }
            o.g.b bVar = o.g.b.f26185c;
            int i3 = f26472f + 37;
            f26481o = i3 % 128;
            int i4 = i3 % 2;
            return bVar;
        }
        if (!(aVar2 instanceof o.q.c)) {
            int i5 = f26481o;
            int i6 = i5 + 15;
            f26472f = i6 % 128;
            int i7 = i6 % 2;
            if (!(aVar2 instanceof o.q.d)) {
                int i8 = i5 + 31;
                f26472f = i8 % 128;
                int i9 = i8 % 2;
                if (!(aVar2 instanceof o.q.b)) {
                    if (aVar2 instanceof o.q.e) {
                        return o.g.b.f26186d;
                    }
                    if (o.ea.f.a()) {
                        Object[] objArr4 = new Object[1];
                        H(new int[]{1358546029, -1977833966, -2102181010, 2119740620, 374994046, -1951885018, 865805565, 2012090520, 539524636, 620979904, 601677793, 1619462678, 155182867, -12141720, 1101681968, 1738297473, -715134502, 801927783, 303572636, 1357261879, 1825774349, 141509969, -938118348, -732449001, 601677793, 1619462678}, 53 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr4);
                        o.ea.f.c(strIntern, ((String) objArr4[0]).intern());
                    }
                    return o.g.b.f26185c;
                }
            }
        }
        if (((aVar2 instanceof o.q.b) || (aVar2 instanceof o.q.d)) && this.f26484c == i.f26500i) {
            if (o.ea.f.a()) {
                Object[] objArr5 = new Object[1];
                H(new int[]{1358546029, -1977833966, -2102181010, 2119740620, 374994046, -1951885018, 865805565, 2012090520, 539524636, 620979904, 601677793, 1619462678, -988012319, 18096361, -659396153, -1168672549, -2123430102, -2027435364, -1819384690, -1960766022, 1303574934, -1629180086, -1153579591, -1030651522, -1050808597, 1094043507, -958256937, 1871480405, -315232754, -1109671821, 1767177898, -1633208134, 2091198300, 2106141732, 194407760, -952620917, -2107475446, -1319841448, 1130043330, 1861217682, -220040326, 343381113, 441727459, -874922641, 582458844, 1973189724, -331248332, -1193748891, 424172215, 1982844263, -1840503004, 451593277}, 103 - TextUtils.getTrimmedLength(""), objArr5);
                o.ea.f.c(strIntern, ((String) objArr5[0]).intern());
            }
            return o.g.b.f26186d;
        }
        if (this.f26483a == b.f26400a) {
            return o.g.b.f26186d;
        }
        int i10 = f26472f + 61;
        f26481o = i10 % 128;
        if (i10 % 2 == 0) {
            o.ea.f.a();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (o.ea.f.a()) {
            Object[] objArr6 = new Object[1];
            H(new int[]{1358546029, -1977833966, -2102181010, 2119740620, 374994046, -1951885018, 865805565, 2012090520, 539524636, 620979904, 601677793, 1619462678, 155182867, -12141720, 1101681968, 1738297473, -715134502, 801927783, 303572636, 1357261879, 601677793, 1619462678, 1037809951, -1044850030, 84823182, -1027630754, 560109597, 1605545317, -1353184031, -2108905317, -402708751, -1881280174, 497660361, 149792681, 1303574934, -1629180086, 394956278, -1076270112}, 73 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr6);
            o.ea.f.d(strIntern, ((String) objArr6[0]).intern());
        }
        return o.g.b.f26184b;
    }

    protected o.ef.a c() throws Throwable {
        int i2 = 2 % 2;
        try {
            o.ef.a aVar = new o.ef.a();
            for (o.q.a aVar2 : this.f26485d.values()) {
                int i3 = f26481o + 123;
                f26472f = i3 % 128;
                int i4 = i3 % 2;
                aVar.a(aVar2.c(), aVar2.d());
            }
            if (o.ea.f.a()) {
                int i5 = f26472f + 29;
                f26481o = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr = new Object[1];
                H(new int[]{1773064499, 1862432808, 309281407, 379712727, -331132011, 1326481510, 381588527, -1887089791, -1363084840, 310984324, 725810801, 1735494774, 567383541, 1283995012, 835036455, -432914093, 1366736004, 509135808}, 32 - TextUtils.indexOf((CharSequence) "", '0'), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                G("供俫硣檻\uf1c6퓻땅苕Շ╲鹕㞍\ubb7f0䬅硾逑誠\uf4feꋚ敔䕇븒ퟶ㫳￼欿ᡷ\uf003ꪖᓦ䊋䔹攁\ude0f\uf7a0\u1afbᾤ譲㠋퀁쪘㒔拗ꕮ蔽︂鞨竌㿯ꬬ\ud81a〜\uea9c咀˺蕧ꔸṵ랭媋徃쭢\uf84eူ", TextUtils.getOffsetBefore("", 0), objArr2);
                o.ea.f.c(strIntern, String.format(((String) objArr2[0]).intern(), d(), aVar));
            }
            int i7 = f26481o + 125;
            f26472f = i7 % 128;
            if (i7 % 2 == 0) {
                return aVar;
            }
            throw null;
        } catch (o.ef.b e2) {
            if (o.ea.f.a()) {
                Object[] objArr3 = new Object[1];
                H(new int[]{1773064499, 1862432808, 309281407, 379712727, -331132011, 1326481510, 381588527, -1887089791, -1363084840, 310984324, 725810801, 1735494774, 567383541, 1283995012, 835036455, -432914093, 1366736004, 509135808}, 33 - (ViewConfiguration.getScrollBarSize() >> 8), objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                G("귃궳䤟寇줒\uec2f\u0efd㥭\ue71fᐎꚁ谵㣵\uee8c珑쏆牉믜찪ᥢ蜌琻", ExpandableListView.getPackedPositionType(0L), objArr4);
                o.ea.f.e(strIntern2, ((String) objArr4[0]).intern(), e2);
            }
            return new o.ef.a();
        }
    }

    boolean c(Context context, boolean z2, o.bg.c cVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26472f + 89;
        f26481o = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (z2) {
            a(b.f26400a);
        } else {
            a(b.f26402c);
        }
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            H(new int[]{1773064499, 1862432808, 309281407, 379712727, -331132011, 1326481510, 381588527, -1887089791, -1363084840, 310984324, 725810801, 1735494774, 567383541, 1283995012, 835036455, -432914093, 1366736004, 509135808}, 33 - Drawable.resolveOpacity(0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            H(new int[]{-685560395, -1731527457, 1150425423, 493163680, 1274120075, -884135364, -942810497, -332317125, 314241692, -1099217391, 485485507, 1868529012, 1462179598, 80231194, -640401303, 1719456761, -84889132, -1495064083, -1818586075, 2047835, -892510146, -963570675, 2067183474, -1111266303}, Color.argb(0, 0, 0, 0) + 47, objArr2);
            o.ea.f.c(strIntern, String.format(((String) objArr2[0]).intern(), d(), f()));
            int i4 = f26472f + 15;
            f26481o = i4 % 128;
            int i5 = i4 % 2;
        }
        return false;
    }

    protected final Object clone() throws CloneNotSupportedException {
        int id = (int) Thread.currentThread().getId();
        int i2 = f26477k * 179096567;
        f26477k = i2;
        int id2 = (int) Thread.currentThread().getId();
        int i3 = f26480n * 59283044;
        f26480n = i3;
        return c(id2, new Object[]{this}, id, 2144187040, i2, -2144187039, i3);
    }

    public final i d() {
        int i2 = 2 % 2;
        int i3 = f26481o + 35;
        int i4 = i3 % 128;
        f26472f = i4;
        int i5 = i3 % 2;
        i iVar = this.f26484c;
        int i6 = i4 + 69;
        f26481o = i6 % 128;
        int i7 = i6 % 2;
        return iVar;
    }

    public void d(int i2) {
        int i3 = 2 % 2;
        int i4 = f26472f + 41;
        f26481o = i4 % 128;
        if (i4 % 2 != 0) {
            this.f26486e = Integer.valueOf(i2);
        } else {
            this.f26486e = Integer.valueOf(i2);
            throw null;
        }
    }

    public void d(Context context, o.g.a aVar, o.j.e eVar, a aVar2, boolean z2) throws Throwable {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = f26481o + 71;
            f26472f = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            H(new int[]{1773064499, 1862432808, 309281407, 379712727, -331132011, 1326481510, 381588527, -1887089791, -1363084840, 310984324, 725810801, 1735494774, 567383541, 1283995012, 835036455, -432914093, 1366736004, 509135808}, Color.alpha(0) + 33, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            H(new int[]{1358546029, -1977833966, -2102181010, 2119740620, 374994046, -1951885018, 865805565, 2012090520, -1533366363, -612702608, 485485507, 1868529012, 1462179598, 80231194, -640401303, 1719456761, -874906858, 207223389}, Gravity.getAbsoluteGravity(0, 0) + 34, objArr2);
            o.ea.f.c(strIntern, String.format(((String) objArr2[0]).intern(), d()));
        }
        eVar.c(aVar);
        int i5 = f26481o + 53;
        f26472f = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 65 / 0;
        }
    }

    public final void d(f fVar, o.q.a aVar) {
        int i2 = 2 % 2;
        int i3 = f26481o + 61;
        f26472f = i3 % 128;
        if (i3 % 2 != 0) {
            this.f26485d.put(fVar, aVar);
            int i4 = 41 / 0;
        } else {
            this.f26485d.put(fVar, aVar);
        }
        int i5 = f26472f + 45;
        f26481o = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.ea.a
    public final /* synthetic */ CustomerAuthenticationMethod e() {
        int i2 = 2 % 2;
        int i3 = f26481o + 85;
        f26472f = i3 % 128;
        int i4 = i3 % 2;
        int i5 = f26473g * 669539982;
        f26473g = i5;
        int i6 = f26475i * (-754464451);
        f26475i = i6;
        int i7 = 1424163322 * f26474h;
        f26474h = i7;
        CustomerAuthenticationMethod customerAuthenticationMethod = (CustomerAuthenticationMethod) c(i7, new Object[]{this}, i5, -379724694, i6, 379724694, (int) Process.getElapsedCpuTime());
        int i8 = f26472f + 117;
        f26481o = i8 % 128;
        if (i8 % 2 != 0) {
            return customerAuthenticationMethod;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected abstract o.l.c e(Context context, CustomerAuthenticationPrompt customerAuthenticationPrompt) throws WalletValidationException;

    public final void e(Context context, CustomerAuthenticationPrompt customerAuthenticationPrompt, CustomerAuthenticationPromptCallback customerAuthenticationPromptCallback, CustomerAuthenticationMethodType customerAuthenticationMethodType, CustomerAuthenticationPrompt customerAuthenticationPrompt2, CancellationSignal cancellationSignal) throws WalletValidationException, CloneNotSupportedException {
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int id = (int) Thread.currentThread().getId();
        int i2 = f26478l * (-377380400);
        f26478l = i2;
        c(i2, new Object[]{this, context, customerAuthenticationPrompt, customerAuthenticationPromptCallback, customerAuthenticationMethodType, customerAuthenticationPrompt2, cancellationSignal}, iElapsedRealtime, -960880587, id, 960880589, (int) Thread.currentThread().getId());
    }

    void e(Context context, h hVar) {
        int i2 = 2 % 2;
        this.f26486e = hVar.f26486e;
        for (Map.Entry<f, o.q.a> entry : hVar.f26485d.entrySet()) {
            o.q.a aVar = this.f26485d.get(entry.getKey());
            if (aVar == null) {
                int i3 = f26472f + 37;
                f26481o = i3 % 128;
                if (i3 % 2 == 0) {
                    this.f26485d.put(entry.getKey(), entry.getValue());
                    throw null;
                }
                this.f26485d.put(entry.getKey(), entry.getValue());
            } else {
                aVar.e(entry.getValue());
            }
        }
        Iterator<Map.Entry<f, o.q.a>> it = this.f26485d.entrySet().iterator();
        while (it.hasNext()) {
            if (!hVar.f26485d.containsKey(it.next().getKey())) {
                it.remove();
                int i4 = f26481o + 37;
                f26472f = i4 % 128;
                int i5 = i4 % 2;
            }
        }
    }

    void e(Context context, boolean z2) {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = f26481o + 93;
            f26472f = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            H(new int[]{1773064499, 1862432808, 309281407, 379712727, -331132011, 1326481510, 381588527, -1887089791, -1363084840, 310984324, 725810801, 1735494774, 567383541, 1283995012, 835036455, -432914093, 1366736004, 509135808}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 33, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            G("ܘݪ砹櫶㔞ာ諷뵻䷕┘媊ࠞ鈦\udf91迟䟊\ud895諶〷鴡ⶕ䕓窉\ue81f爽￫꾸➑룍\uaad0큺紴ච攈᪆저刬ᾦ俹ߩ飊쪋\uf007嵢", KeyEvent.normalizeMetaState(0), objArr2);
            o.ea.f.c(strIntern, String.format(((String) objArr2[0]).intern(), d(), f()));
        }
        int i5 = f26481o + 73;
        f26472f = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 68 / 0;
        }
    }

    public boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f26472f + 113;
            f26481o = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            h hVar = (h) obj;
            if (this.f26484c == hVar.f26484c && this.f26483a == hVar.f26483a) {
                int i5 = f26472f + 39;
                f26481o = i5 % 128;
                Object obj2 = null;
                if (i5 % 2 == 0) {
                    Objects.equals(d(f.f26437b), hVar.d(f.f26437b));
                    obj2.hashCode();
                    throw null;
                }
                if (Objects.equals(d(f.f26437b), hVar.d(f.f26437b)) && Objects.equals(d(f.f26439e), hVar.d(f.f26439e)) && Objects.equals(d(f.f26438c), hVar.d(f.f26438c))) {
                    int i6 = f26472f + 97;
                    f26481o = i6 % 128;
                    if (i6 % 2 != 0) {
                        return true;
                    }
                    obj2.hashCode();
                    throw null;
                }
            }
        }
        return false;
    }

    public final b f() {
        int i2 = 2 % 2;
        int i3 = f26472f + 115;
        f26481o = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f26483a;
        }
        throw null;
    }

    protected final void finalize() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26472f + 51;
        f26481o = i3 % 128;
        if (i3 % 2 == 0) {
            super.finalize();
            throw null;
        }
        super.finalize();
        int i4 = f26481o + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f26472f = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
    }

    public final o.q.c g() {
        int i2 = 2 % 2;
        int i3 = f26472f + 1;
        f26481o = i3 % 128;
        int i4 = i3 % 2;
        o.q.c cVar = (o.q.c) d(f.f26437b);
        int i5 = f26472f + 57;
        f26481o = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 54 / 0;
        }
        return cVar;
    }

    public final Set<f> h() {
        int i2 = 2 % 2;
        int i3 = f26481o + 107;
        f26472f = i3 % 128;
        int i4 = i3 % 2;
        HashMap<f, o.q.a> map = this.f26485d;
        if (i4 == 0) {
            return map.keySet();
        }
        map.keySet();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f26481o + 37;
        f26472f = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = super.hashCode();
        int i5 = f26481o + 93;
        f26472f = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public final o.ef.a i() throws Throwable {
        int i2 = 2 % 2;
        o.ef.a aVar = new o.ef.a();
        Object[] objArr = new Object[1];
        G("\u0e7fฑ북꽊뇼铅䫽給", KeyEvent.getMaxKeyCode() >> 16, objArr);
        aVar.a(((String) objArr[0]).intern(), (Object) m());
        Object[] objArr2 = new Object[1];
        G("\uee30\uee51ੌᢅ\uf795튵읉\uf0deꓮ坿頝䖊笄", ExpandableListView.getPackedPositionType(0L), objArr2);
        aVar.b(((String) objArr2[0]).intern(), this.f26483a.equals(b.f26400a));
        int i3 = f26472f + 109;
        f26481o = i3 % 128;
        if (i3 % 2 != 0) {
            return aVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer j() {
        int i2 = 2 % 2;
        int i3 = f26472f + 123;
        f26481o = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f26486e;
        }
        throw null;
    }

    final String m() {
        int i2 = 2 % 2;
        int i3 = f26481o + 35;
        f26472f = i3 % 128;
        int i4 = i3 % 2;
        String string = d().toString();
        int i5 = f26472f + 39;
        f26481o = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }
}
