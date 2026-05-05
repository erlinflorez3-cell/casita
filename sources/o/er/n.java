package o.er;

import android.os.Process;
import android.os.SystemClock;
import fr.antelop.sdk.digitalcard.ClickToPayComplianceSettings;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements o.ea.a<ClickToPayComplianceSettings> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f25089a = 241983609;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f25090b = 1578548419;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f25091c = -319462173;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f25092d = -621334020;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f25093i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f25094j = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f25095e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f25096g;

    public n(String str, String str2) {
        this.f25095e = str;
        this.f25096g = str2;
    }

    public static /* synthetic */ Object b(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~i5;
        int i9 = ~i7;
        int i10 = ~((-1) - (((-1) - (i8 | i9)) & ((-1) - i2)));
        int i11 = ~i2;
        int i12 = ~(((i11 + i9) - (i11 & i9)) | i5);
        int i13 = (-1) - (((-1) - i10) & ((-1) - i12));
        int i14 = ~((i9 + i5) - (i9 & i5));
        int i15 = ((-1) - (((-1) - (~((i2 + i8) - (i2 & i8)))) & ((-1) - (~(i8 | i7))))) | i12;
        int i16 = i5 + i7 + i6 + (1787548100 * i4) + (1101416392 * i3);
        int i17 = i16 * i16;
        int i18 = (((-61410478) * i5) - 623378432) + (561581232 * i7) + (i13 * (-311495855)) + ((-311495855) * i14) + (311495855 * i15) + (250085376 * i6) + ((-778043392) * i4) + ((-46137344) * i3) + (324403200 * i17);
        int i19 = (i5 * (-930662234)) + 656878810 + (i7 * (-930660720)) + (i13 * (-757)) + (i14 * (-757)) + (i15 * 757) + (i6 * (-930661477)) + (i4 * 2052861356) + (i3 * 749768216) + (i17 * (-2028863488));
        return i18 + ((i19 * i19) * (-1850081280)) != 1 ? b(objArr) : c(objArr);
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        n nVar = (n) objArr[0];
        int i2 = 2 % 2;
        int i3 = f25094j;
        int i4 = ((i3 + 17) - (17 | i3)) + (i3 | 17);
        int i5 = i4 % 128;
        f25093i = i5;
        int i6 = i4 % 2;
        String str = nVar.f25096g;
        int i7 = ((i5 + 19) - (19 | i5)) + ((-1) - (((-1) - i5) & ((-1) - 19)));
        f25094j = i7 % 128;
        if (i7 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        n nVar = (n) objArr[0];
        int i2 = 2 % 2;
        int i3 = f25093i + 103;
        f25094j = i3 % 128;
        if (i3 % 2 != 0) {
            nVar.d();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ClickToPayComplianceSettings clickToPayComplianceSettingsD = nVar.d();
        int i4 = f25093i + 73;
        f25094j = i4 % 128;
        int i5 = i4 % 2;
        return clickToPayComplianceSettingsD;
    }

    private ClickToPayComplianceSettings d() {
        int i2 = 2 % 2;
        ClickToPayComplianceSettings clickToPayComplianceSettings = new ClickToPayComplianceSettings(this);
        int i3 = f25093i;
        int i4 = ((83 | i3) << 1) - (i3 ^ 83);
        f25094j = i4 % 128;
        int i5 = i4 % 2;
        return clickToPayComplianceSettings;
    }

    public final String a() {
        int i2 = 2 % 2;
        int i3 = f25094j;
        int i4 = (((-1) - (((-1) - i3) & ((-1) - 83))) << 1) - (i3 ^ 83);
        f25093i = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f25095e;
        int i6 = i3 + 13;
        f25093i = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String b() {
        int i2 = f25090b * 366820712;
        f25090b = i2;
        int i3 = f25092d * (-107017395);
        f25092d = i3;
        int iMyUid = Process.myUid();
        return (String) b(i2, (int) SystemClock.elapsedRealtime(), iMyUid, new Object[]{this}, 445238705, i3, -445238705);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [fr.antelop.sdk.digitalcard.ClickToPayComplianceSettings, java.lang.Object] */
    @Override // o.ea.a
    public final /* synthetic */ ClickToPayComplianceSettings e() {
        int iActiveCount = Thread.activeCount();
        int i2 = f25091c * (-744093126);
        f25091c = i2;
        int i3 = 641193616 * f25089a;
        f25089a = i3;
        ?? B = b(iActiveCount, Process.myUid(), i3, new Object[]{this}, 1608723056, i2, -1608723055);
        return B;
    }
}
