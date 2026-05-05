package o.p;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import fr.antelop.sdk.authentication.CustomerAuthenticationPattern;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.d.d;
import o.ea.a;
import o.m.i;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements a<CustomerAuthenticationPattern> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f26677a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f26678b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f26679c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f26680d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f26681e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char f26682f = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static long f26683i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f26684j = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f26685l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f26686m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f26687n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f26688o = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f26689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i[][] f26690h;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r6, int r7, int r8) {
        /*
            int r2 = r8 * 2
            int r1 = 1 - r2
            byte[] r8 = o.p.b.$$a
            int r0 = r7 * 4
            int r7 = 4 - r0
            int r6 = r6 + 65
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r8 != 0) goto L2a
            r0 = r7
            r2 = r4
        L15:
            int r7 = r7 + 1
            int r6 = r6 + r0
        L18:
            byte r0 = (byte) r6
            r5[r2] = r0
            if (r2 != r3) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L23:
            int r2 = r2 + 1
            r1 = r8[r7]
            r0 = r6
            r6 = r1
            goto L15
        L2a:
            r2 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.p.b.$$c(short, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26677a = 1214461040;
        f26679c = 1574227764;
        f26678b = -1924106756;
        f26680d = -231614247;
        f26681e = 657436572;
        f26688o = 0;
        f26687n = 1;
        f26685l = 0;
        f26686m = 1;
        a();
        KeyEvent.getMaxKeyCode();
        ViewConfiguration.getEdgeSlop();
        int i2 = f26687n + 123;
        f26688o = i2 % 128;
        int i3 = i2 % 2;
    }

    public b(String str, i[][] iVarArr) {
        this.f26689g = str;
        this.f26690h = iVarArr;
    }

    public static /* synthetic */ Object a(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) {
        int i8 = ~i2;
        int i9 = ~i4;
        int i10 = (-1) - (((-1) - (~i7)) & ((-1) - i9));
        int i11 = ~i10;
        int i12 = (i8 + i11) - (i8 & i11);
        int i13 = i7 | i9;
        int i14 = ~((i10 + i2) - (i10 & i2));
        int i15 = i4 + i2 + i6 + (1075552530 * i3) + ((-1519595880) * i5);
        int i16 = i15 * i15;
        int i17 = (((-1050772794) * i4) - 1639710720) + ((-2116975300) * i2) + (i12 * (-533101253)) + (533101253 * i13) + ((-533101253) * i14) + ((-1583874048) * i6) + ((-189792256) * i3) + (1111490560 * i5) + (1415839744 * i16);
        int i18 = (i4 * 251836610) + 257048825 + (i2 * 251838484) + (i12 * 937) + (i13 * (-937)) + (i14 * 937) + (i6 * 251837547) + (i3 * 1710852742) + (i5 * (-1855850104)) + (i16 * (-1244921856));
        return i17 + ((i18 * i18) * (-1300496384)) != 1 ? c(objArr) : b(objArr);
    }

    static void a() {
        f26683i = 740602047300126166L;
        f26684j = 1564493270;
        f26682f = (char) 16374;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i2 = 2 % 2;
        CustomerAuthenticationPattern customerAuthenticationPattern = new CustomerAuthenticationPattern((b) objArr[0]);
        int i3 = f26685l + 91;
        f26686m = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 78 / 0;
        }
        return customerAuthenticationPattern;
    }

    private CustomerAuthenticationPattern c() {
        int i2 = f26678b * (-2074643795);
        f26678b = i2;
        int i3 = (int) Runtime.getRuntime().totalMemory();
        int i4 = (-490241699) * f26679c;
        f26679c = i4;
        int i5 = f26677a * (-122253235);
        f26677a = i5;
        return (CustomerAuthenticationPattern) a(-994565942, i4, 994565943, i5, i3, i2, new Object[]{this});
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        b bVar = (b) objArr[0];
        int i2 = 2 % 2;
        int i3 = f26686m;
        int i4 = i3 + 1;
        f26685l = i4 % 128;
        int i5 = i4 % 2;
        i[][] iVarArr = bVar.f26690h;
        if (i5 != 0) {
            int length = iVarArr.length;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int length2 = iVarArr.length;
        int i6 = i3 + 79;
        f26685l = i6 % 128;
        if (i6 % 2 == 0) {
            return Integer.valueOf(length2);
        }
        int i7 = 65 / 0;
        return Integer.valueOf(length2);
    }

    static void init$0() {
        $$a = new byte[]{119, -27, 45, 98};
        $$b = 97;
    }

    private static void k(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2 % 2;
        Object charArray = str6;
        if (str6 != null) {
            charArray = str6.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str5;
        if (str5 != null) {
            int i4 = $10 + 107;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 22 / 0;
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
        o.a.i iVar = new o.a.i();
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
                Object objA = d.a(540069882);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = d.a(TextUtils.indexOf("", "") + 106, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), View.MeasureSpec.getMode(0) + 11, -155898465, false, $$c(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = d.a(2068572);
                if (objA2 == null) {
                    byte b4 = (byte) 3;
                    byte b5 = (byte) (b4 - 3);
                    objA2 = d.a(847 - View.getDefaultSize(0, 0), (char) (6488 - ExpandableListView.getPackedPositionGroup(0L)), (ViewConfiguration.getPressedStateDuration() >> 16) + 12, -694521287, false, $$c(b4, b5, b5), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA3 = d.a(-1122996612);
                if (objA3 == null) {
                    int absoluteGravity = 458 - Gravity.getAbsoluteGravity(0, 0);
                    char size = (char) View.MeasureSpec.getSize(0);
                    int i6 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 10;
                    byte b6 = (byte) ((-1) - (((-1) - $$b) | ((-1) - 7)));
                    byte b7 = (byte) (b6 - 1);
                    objA3 = d.a(absoluteGravity, size, i6, 1804962841, false, $$c(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = d.a(-1223178239);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    objA4 = d.a((ViewConfiguration.getScrollBarSize() >> 8) + 639, (char) (View.resolveSizeAndState(0, 0, 0) + 65100), TextUtils.getCapsMode("", 0, 0) + 12, 1636969060, false, $$c((byte) 57, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r8[iVar.f19932b])) ^ (f26683i ^ 740602047300126166L)) ^ ((long) ((int) (((long) f26684j) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f26682f) ^ 740602047300126166L))));
                iVar.f19932b++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str7 = new String(cArr5);
        int i7 = $10 + 111;
        $11 = i7 % 128;
        if (i7 % 2 != 0) {
            objArr[0] = str7;
        } else {
            int i8 = 75 / 0;
            objArr[0] = str7;
        }
    }

    public final String b() {
        int i2 = 2 % 2;
        int i3 = f26685l;
        int i4 = i3 + 5;
        f26686m = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f26689g;
        int i6 = i3 + 1;
        f26686m = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 40 / 0;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c2, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(o.m.f r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.p.b.b(o.m.f):boolean");
    }

    public final i[] b(int i2) {
        int i3 = 2 % 2;
        int i4 = f26686m;
        int i5 = i4 + 41;
        f26685l = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i2 + 1;
        i[][] iVarArr = this.f26690h;
        if (i7 <= iVarArr.length) {
            return iVarArr[i2];
        }
        int i8 = i4 + 11;
        f26685l = i8 % 128;
        int i9 = i8 % 2;
        return null;
    }

    public final boolean c(i iVar, int i2) {
        int i3 = 2 % 2;
        i[] iVarArrB = b(i2);
        Object obj = null;
        if (iVarArrB == null) {
            int i4 = f26686m + 27;
            f26685l = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        }
        int length = iVarArrB.length;
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = f26686m;
            int i7 = i6 + 51;
            f26685l = i7 % 128;
            if (i7 % 2 != 0) {
                i iVar2 = iVarArrB[i5];
                obj.hashCode();
                throw null;
            }
            if (iVarArrB[i5] == iVar) {
                int i8 = i6 + 87;
                f26685l = i8 % 128;
                int i9 = i8 % 2;
                return true;
            }
        }
        return false;
    }

    public final int d() {
        int i2 = f26681e * 372422417;
        f26681e = i2;
        int i3 = f26680d * 1240573401;
        f26680d = i3;
        return ((Integer) a(-927348846, Process.myPid(), 927348846, Process.myUid(), i3, i2, new Object[]{this})).intValue();
    }

    @Override // o.ea.a
    public final /* synthetic */ CustomerAuthenticationPattern e() {
        CustomerAuthenticationPattern customerAuthenticationPattern;
        int i2 = 2 % 2;
        int i3 = f26685l + 17;
        f26686m = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = f26678b * (-2074643795);
            f26678b = i4;
            int i5 = (int) Runtime.getRuntime().totalMemory();
            int i6 = f26679c * (-490241699);
            f26679c = i6;
            int i7 = f26677a * (-122253235);
            f26677a = i7;
            customerAuthenticationPattern = (CustomerAuthenticationPattern) a(-994565942, i6, 994565943, i7, i5, i4, new Object[]{this});
            int i8 = 24 / 0;
        } else {
            int i9 = f26678b * (-2074643795);
            f26678b = i9;
            int i10 = (int) Runtime.getRuntime().totalMemory();
            int i11 = f26679c * (-490241699);
            f26679c = i11;
            int i12 = f26677a * (-122253235);
            f26677a = i12;
            customerAuthenticationPattern = (CustomerAuthenticationPattern) a(-994565942, i11, 994565943, i12, i10, i9, new Object[]{this});
        }
        int i13 = f26686m + 35;
        f26685l = i13 % 128;
        int i14 = i13 % 2;
        return customerAuthenticationPattern;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.m.i[] e(int r11, o.m.f r12) {
        /*
            r10 = this;
            r9 = 2
            int r0 = r9 % r9
            int r0 = o.p.b.f26685l
            int r1 = r0 + 61
            int r0 = r1 % 128
            o.p.b.f26686m = r0
            int r1 = r1 % r9
            o.m.i[] r6 = r10.b(r11)
            r5 = 0
            r8 = 0
            if (r6 != 0) goto L23
            int r0 = o.p.b.f26685l
            int r1 = r0 + 91
            int r0 = r1 % 128
            o.p.b.f26686m = r0
            int r1 = r1 % r9
            if (r1 != 0) goto L22
            r0 = 9
            int r0 = r0 / r5
        L22:
            return r8
        L23:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            o.m.c r0 = o.m.c.d()
            java.util.HashMap r3 = r0.e()
            int r2 = r6.length
            int r0 = o.p.b.f26685l
            int r1 = r0 + 53
            int r0 = r1 % 128
            o.p.b.f26686m = r0
            int r1 = r1 % r9
        L3a:
            if (r5 >= r2) goto L96
            r0 = r6[r5]
            java.lang.Object r7 = r3.get(r0)
            o.m.h r7 = (o.m.h) r7
            if (r7 == 0) goto L8c
            int r0 = o.p.b.f26685l
            int r1 = r0 + 103
            int r0 = r1 % 128
            o.p.b.f26686m = r0
            int r1 = r1 % r9
            if (r1 == 0) goto L95
            if (r12 == 0) goto L5d
            java.util.Set r0 = r7.h()
            boolean r0 = r0.contains(r12)
            if (r0 == 0) goto L8c
        L5d:
            o.m.b r1 = r7.f()
            o.m.b r0 = o.m.b.f26400a
            if (r1 == r0) goto L78
            int r0 = o.p.b.f26685l
            int r1 = r0 + 101
            int r0 = r1 % 128
            o.p.b.f26686m = r0
            int r1 = r1 % r9
            if (r1 == 0) goto L8f
            o.m.i r1 = r7.d()
            o.m.i r0 = o.m.i.f26500i
            if (r1 != r0) goto L8c
        L78:
            boolean r0 = r7 instanceof o.m.m
            if (r0 == 0) goto L85
            r0 = r7
            o.m.m r0 = (o.m.m) r0
            boolean r0 = r0.k()
            if (r0 != 0) goto L8c
        L85:
            o.m.i r0 = r7.d()
            r4.add(r0)
        L8c:
            int r5 = r5 + 1
            goto L3a
        L8f:
            r7.d()
            o.m.i r0 = o.m.i.f26500i
            throw r8
        L95:
            throw r8
        L96:
            int r0 = r4.size()
            o.m.i[] r0 = new o.m.i[r0]
            java.lang.Object[] r0 = r4.toArray(r0)
            o.m.i[] r0 = (o.m.i[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.p.b.e(int, o.m.f):o.m.i[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r5 = 2
            int r0 = r5 % r5
            int r2 = o.p.b.f26686m
            int r1 = r2 + 61
            int r0 = r1 % 128
            o.p.b.f26685l = r0
            int r1 = r1 % r5
            r4 = 1
            if (r6 != r7) goto L10
            return r4
        L10:
            r3 = 0
            if (r7 == 0) goto L29
            int r1 = r2 + 41
            int r0 = r1 % 128
            o.p.b.f26685l = r0
            int r1 = r1 % r5
            if (r1 == 0) goto L2a
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r1 = r7.getClass()
            r0 = 63
            int r0 = r0 / r3
            if (r2 == r1) goto L35
        L29:
            return r3
        L2a:
            java.lang.Class r1 = r6.getClass()
            java.lang.Class r0 = r7.getClass()
            if (r1 == r0) goto L35
            goto L29
        L35:
            o.p.b r7 = (o.p.b) r7
            java.lang.String r1 = r6.f26689g
            java.lang.String r0 = r7.f26689g
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L60
            int r0 = o.p.b.f26686m
            int r1 = r0 + 121
            int r0 = r1 % 128
            o.p.b.f26685l = r0
            int r1 = r1 % r5
            if (r1 != 0) goto L6a
            o.m.i[][] r1 = r6.f26690h
            o.m.i[][] r0 = r7.f26690h
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L60
            int r0 = o.p.b.f26686m
            int r1 = r0 + 21
            int r0 = r1 % 128
            o.p.b.f26685l = r0
            int r1 = r1 % r5
            return r4
        L60:
            int r0 = o.p.b.f26686m
            int r1 = r0 + 115
            int r0 = r1 % 128
            o.p.b.f26685l = r0
            int r1 = r1 % r5
            goto L29
        L6a:
            o.m.i[][] r1 = r6.f26690h
            o.m.i[][] r0 = r7.f26690h
            java.util.Arrays.equals(r1, r0)
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.p.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f26685l + 47;
        f26686m = i3 % 128;
        return i3 % 2 == 0 ? (Objects.hash(this.f26689g) % 31) / Arrays.hashCode(this.f26690h) : (Objects.hash(this.f26689g) * 31) + Arrays.hashCode(this.f26690h);
    }

    public final String toString() throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        k((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), "蹹愽볹ꪓ3\uf731홿䌈潸袝啹䝳巹ጫ屦ᅖ욟䥱里\uf5f6㚤ጶ⍄餦鵍韷욐膄聐ள벫栗आ", "\u0000\u0000\u0000\u0000", "㔼п銀\udb9a", (-2147205323) - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
        StringBuilder sbAppend = sb.append(((String) objArr[0]).intern()).append(this.f26689g).append('\'');
        Object[] objArr2 = new Object[1];
        k((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "鱅냐廑楼ꞇᦞ쭒䬑", "\u0000\u0000\u0000\u0000", "ꢙ㓸⩖ᆥ", Color.blue(0), objArr2);
        String string = sbAppend.append(((String) objArr2[0]).intern()).append(Arrays.toString(this.f26690h)).append(AbstractJsonLexerKt.END_OBJ).toString();
        int i3 = f26685l + 113;
        f26686m = i3 % 128;
        if (i3 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
