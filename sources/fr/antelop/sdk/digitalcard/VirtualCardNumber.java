package fr.antelop.sdk.digitalcard;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import fr.antelop.sdk.R;
import fr.antelop.sdk.exception.WalletValidationException;
import fr.antelop.sdk.util.OperationCallback;
import java.lang.reflect.Method;
import java.util.Date;
import o.a.g;
import o.eb.b;
import o.eb.e;
import o.ep.d;
import o.ep.h;
import o.er.a;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class VirtualCardNumber {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f19282a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f19283b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f19284c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char f19285d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f19286e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f19287f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f19288g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f19289h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f19290i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f19291j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f19292k = 0;
    private final d digitalCard;
    private final a emvApplication;
    private final h innerVirtualCardNumber;

    public enum Status {
        Active,
        Suspended
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(short r7, int r8, byte r9) {
        /*
            int r0 = r7 * 2
            int r0 = r0 + 4
            int r8 = r8 * 3
            int r2 = r8 + 1
            int r1 = 78 - r9
            byte[] r7 = fr.antelop.sdk.digitalcard.VirtualCardNumber.$$c
            byte[] r6 = new byte[r2]
            r5 = 0
            if (r7 != 0) goto L2b
            r4 = r0
            r2 = r8
            r3 = r5
        L14:
            int r1 = -r0
            int r1 = r1 + r2
            int r0 = r4 + 1
        L18:
            byte r2 = (byte) r1
            r6[r3] = r2
            if (r3 != r8) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L23:
            r2 = r7[r0]
            int r3 = r3 + 1
            r4 = r0
            r0 = r2
            r2 = r1
            goto L14
        L2b:
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.VirtualCardNumber.$$e(short, int, byte):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        f19292k = 151058815;
        f19289h = -1067487663;
        init$0();
        f19288g = 0;
        f19287f = 1;
        f19290i = 0;
        f19291j = 1;
        b();
        f19286e = (char) 23408;
        f19282a = (char) 45914;
        f19285d = (char) 2889;
        f19284c = (char) 37568;
        int i2 = f19287f + 123;
        f19288g = i2 % 128;
        int i3 = i2 % 2;
    }

    public VirtualCardNumber(d dVar, a aVar, h hVar) {
        this.digitalCard = dVar;
        this.emvApplication = aVar;
        this.innerVirtualCardNumber = hVar;
    }

    static void b() {
        f19283b = -8782973351923296237L;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x02aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] e(android.content.Context r21, int r22, int r23, int r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1619
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.VirtualCardNumber.e(android.content.Context, int, int, int):java.lang.Object[]");
    }

    static void init$0() {
        $$a = new byte[]{120, -15, 89, -97};
        $$b = 1;
    }

    static void init$1() {
        $$c = new byte[]{97, 52, 124, MessagePack.Code.EXT16};
        $$d = 252;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void l(java.lang.String r25, int r26, java.lang.Object[] r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.VirtualCardNumber.l(java.lang.String, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = 101 - r7
            int r0 = r9 * 3
            int r6 = r0 + 4
            byte[] r5 = fr.antelop.sdk.digitalcard.VirtualCardNumber.$$a
            int r4 = r8 * 3
            int r0 = r4 + 1
            byte[] r3 = new byte[r0]
            r2 = 0
            if (r5 != 0) goto L29
            r0 = r7
            r7 = r4
            r1 = r2
        L14:
            int r7 = r7 + r0
            int r6 = r6 + 1
        L17:
            byte r0 = (byte) r7
            r3[r1] = r0
            if (r1 != r4) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            r10[r2] = r0
            return
        L24:
            int r1 = r1 + 1
            r0 = r5[r6]
            goto L14
        L29:
            r1 = r2
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.VirtualCardNumber.m(int, int, short, java.lang.Object[]):void");
    }

    private static void n(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = 0;
        Object charArray = str2;
        if (str2 != null) {
            int i6 = $11 + 43;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 33 / 0;
                charArray = str2.toCharArray();
            } else {
                charArray = str2.toCharArray();
            }
        }
        char[] cArr = (char[]) charArray;
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            cArr3[i5] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i8 = 58224;
            int i9 = i5;
            while (i9 < 16) {
                int i10 = $11 + 67;
                $10 = i10 % 128;
                int i11 = i10 % i3;
                char c2 = cArr3[1];
                char c3 = cArr3[i5];
                int i12 = (c3 + i8) ^ ((c3 << 4) + ((char) (((long) f19285d) ^ (-7511683281764982996L))));
                int i13 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f19284c);
                    objArr2[i3] = Integer.valueOf(i13);
                    objArr2[1] = Integer.valueOf(i12);
                    objArr2[i5] = Integer.valueOf(c2);
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        int packedPositionChild = 269 - ExpandableListView.getPackedPositionChild(0L);
                        char cResolveOpacity = (char) Drawable.resolveOpacity(i5, i5);
                        int modifierMetaStateMask = 10 - ((byte) KeyEvent.getModifierMetaStateMask());
                        byte b2 = (byte) i5;
                        byte b3 = b2;
                        String str$$e = $$e(b2, b3, (byte) ((b3 + 9) - (9 & b3)));
                        Class[] clsArr = new Class[4];
                        clsArr[i5] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objA = o.d.d.a(packedPositionChild, cResolveOpacity, modifierMetaStateMask, -1995022631, false, str$$e, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) f19286e) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f19282a)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(269 - TextUtils.indexOf((CharSequence) "", '0'), (char) TextUtils.getOffsetBefore("", 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 12, -1995022631, false, $$e(b4, b5, (byte) ((b5 + 9) - (9 & b5))), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    i3 = 2;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[gVar.f19924d] = cArr3[0];
            cArr2[gVar.f19924d + 1] = cArr3[1];
            Object[] objArr4 = {gVar, gVar};
            Object objA3 = o.d.d.a(1390051551);
            if (objA3 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objA3 = o.d.d.a(Color.red(0) + 270, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 11 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -2074123590, false, $$e(b6, b7, (byte) (6 | b7)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            i3 = 2;
            i5 = 0;
        }
        String str3 = new String(cArr2, 0, i2);
        int i14 = $10 + 49;
        $11 = i14 % 128;
        int i15 = i14 % 2;
        objArr[0] = str3;
    }

    public final void delete(Context context, OperationCallback<Void> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19290i + 43;
        f19291j = i3 % 128;
        int i4 = i3 % 2;
        this.innerVirtualCardNumber.d(context, this.emvApplication.f(), this.digitalCard, operationCallback);
        int i5 = f19291j + 39;
        f19290i = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getBin() {
        int i2 = 2 % 2;
        int i3 = f19291j + 73;
        f19290i = i3 % 128;
        int i4 = i3 % 2;
        h hVar = this.innerVirtualCardNumber;
        if (i4 == 0) {
            return hVar.b();
        }
        hVar.b();
        throw null;
    }

    public final Date getCreationDate() {
        int i2 = 2 % 2;
        int i3 = f19291j + 49;
        f19290i = i3 % 128;
        int i4 = i3 % 2;
        Date dateF = this.innerVirtualCardNumber.f();
        int i5 = f19290i + 31;
        f19291j = i5 % 128;
        if (i5 % 2 != 0) {
            return dateF;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Date getExpiryDate() {
        Date dateJ;
        int i2 = 2 % 2;
        int i3 = f19290i + 21;
        f19291j = i3 % 128;
        if (i3 % 2 == 0) {
            dateJ = this.innerVirtualCardNumber.j();
            int i4 = 32 / 0;
        } else {
            dateJ = this.innerVirtualCardNumber.j();
        }
        int i5 = f19290i + 41;
        f19291j = i5 % 128;
        int i6 = i5 % 2;
        return dateJ;
    }

    public final String getId() {
        int i2 = 2 % 2;
        int i3 = f19290i + 21;
        f19291j = i3 % 128;
        int i4 = i3 % 2;
        String strA = this.innerVirtualCardNumber.a();
        int i5 = f19290i + 47;
        f19291j = i5 % 128;
        if (i5 % 2 != 0) {
            return strA;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getLastDigits() {
        String str;
        int i2 = 2 % 2;
        int i3 = f19290i + 109;
        f19291j = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {this.innerVirtualCardNumber};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i4 = h.f24523c * (-1159367798);
            h.f24523c = i4;
            int i5 = h.f24521a * 1358326175;
            h.f24521a = i5;
            int i6 = h.f24522b * 1587957066;
            h.f24522b = i6;
            str = (String) h.c(173556768, elapsedCpuTime, -173556768, i4, objArr, i5, i6);
            int i7 = 45 / 0;
        } else {
            Object[] objArr2 = {this.innerVirtualCardNumber};
            int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
            int i8 = h.f24523c * (-1159367798);
            h.f24523c = i8;
            int i9 = h.f24521a * 1358326175;
            h.f24521a = i9;
            int i10 = h.f24522b * 1587957066;
            h.f24522b = i10;
            str = (String) h.c(173556768, elapsedCpuTime2, -173556768, i8, objArr2, i9, i10);
        }
        int i11 = f19291j + 9;
        f19290i = i11 % 128;
        int i12 = i11 % 2;
        return str;
    }

    public final Integer getMaxPaymentNumber() {
        int i2 = 2 % 2;
        int i3 = f19290i + 67;
        f19291j = i3 % 128;
        int i4 = i3 % 2;
        Integer numI = this.innerVirtualCardNumber.i();
        int i5 = f19290i + 19;
        f19291j = i5 % 128;
        if (i5 % 2 != 0) {
            return numI;
        }
        throw null;
    }

    public final String getName() {
        int i2 = 2 % 2;
        int i3 = f19291j + 89;
        f19290i = i3 % 128;
        int i4 = i3 % 2;
        String strH = this.innerVirtualCardNumber.h();
        int i5 = f19290i + 121;
        f19291j = i5 % 128;
        int i6 = i5 % 2;
        return strH;
    }

    public final String getProviderVcnId() {
        int i2 = 2 % 2;
        int i3 = f19290i + 23;
        f19291j = i3 % 128;
        int i4 = i3 % 2;
        String strD = this.innerVirtualCardNumber.d();
        int i5 = f19290i + 45;
        f19291j = i5 % 128;
        int i6 = i5 % 2;
        return strD;
    }

    public final SecureVirtualCardNumberDisplay getSecureVirtualCardNumberDisplay() {
        int i2 = 2 % 2;
        SecureVirtualCardNumberDisplay secureVirtualCardNumberDisplay = new SecureVirtualCardNumberDisplay(this.innerVirtualCardNumber.c(this.emvApplication.g(), this.digitalCard, new e() { // from class: fr.antelop.sdk.digitalcard.VirtualCardNumber.1
            @Override // o.eb.e
            public int getThemeResource(b bVar) throws Throwable {
                b.d();
                return R.style.antelopSecureVirtualCardNumberDisplayThemeInternal;
            }
        }));
        int i3 = f19291j + 97;
        f19290i = i3 % 128;
        int i4 = i3 % 2;
        return secureVirtualCardNumberDisplay;
    }

    public final SecureVirtualCardNumberResume getSecureVirtualCardNumberResume() {
        int i2 = 2 % 2;
        SecureVirtualCardNumberResume secureVirtualCardNumberResume = new SecureVirtualCardNumberResume(this.innerVirtualCardNumber.d(this.emvApplication.f(), this.digitalCard));
        int i3 = f19291j + 3;
        f19290i = i3 % 128;
        if (i3 % 2 == 0) {
            return secureVirtualCardNumberResume;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Status getStatus() {
        int i2 = 2 % 2;
        int i3 = f19290i + 123;
        f19291j = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = {this.innerVirtualCardNumber};
            int i4 = h.f24529j * (-1456136215);
            h.f24529j = i4;
            int i5 = h.f24527h * 389977318;
            h.f24527h = i5;
            int i6 = h.f24528i * (-407821031);
            h.f24528i = i6;
            int i7 = h.f24526f * (-2143292461);
            h.f24526f = i7;
            return ((h.e) h.c(-1791483773, i4, 1791483775, i5, objArr, i6, i7)).d();
        }
        Object[] objArr2 = {this.innerVirtualCardNumber};
        int i8 = h.f24529j * (-1456136215);
        h.f24529j = i8;
        int i9 = h.f24527h * 389977318;
        h.f24527h = i9;
        int i10 = h.f24528i * (-407821031);
        h.f24528i = i10;
        int i11 = h.f24526f * (-2143292461);
        h.f24526f = i11;
        int i12 = 24 / 0;
        return ((h.e) h.c(-1791483773, i8, 1791483775, i9, objArr2, i10, i11)).d();
    }

    public final void resume(Context context, OperationCallback<Void> operationCallback) throws WalletValidationException {
        int i2 = 2 % 2;
        int i3 = f19290i + 25;
        f19291j = i3 % 128;
        int i4 = i3 % 2;
        this.innerVirtualCardNumber.e(context, this.emvApplication.f(), this.digitalCard, operationCallback);
        int i5 = f19290i + 59;
        f19291j = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void suspend(Context context, OperationCallback<Void> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19291j + 97;
        f19290i = i3 % 128;
        int i4 = i3 % 2;
        this.innerVirtualCardNumber.b(context, this.emvApplication.f(), this.digitalCard, operationCallback);
        int i5 = f19290i + 37;
        f19291j = i5 % 128;
        int i6 = i5 % 2;
    }
}
