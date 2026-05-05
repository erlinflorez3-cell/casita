package o.et;

import android.os.SystemClock;
import fr.antelop.sdk.card.emvapplication.EmvApplicationType;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public class f extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f25366g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f25367h = 1965706032;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f25368i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f25369j = -13541834;

    public f(String str, String str2, int i2, String str3) {
        super(str, o.dp.b.f23214b, str2, i2, str3);
    }

    public static /* synthetic */ Object b(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~i3;
        int i9 = ~i6;
        int i10 = ~i5;
        int i11 = (~((-1) - (((-1) - ((i8 + i9) - (i8 & i9))) & ((-1) - i10)))) | (~((i3 + i6) - (i3 & i6)));
        int i12 = ~(i5 | i6);
        int i13 = i11 | i12;
        int i14 = ~((-1) - (((-1) - i8) & ((-1) - i6)));
        int i15 = ~((-1) - (((-1) - i9) & ((-1) - i10)));
        int i16 = (-1) - (((-1) - i12) & ((-1) - ((i8 + i15) - (i8 & i15))));
        int i17 = i3 + i6 + i2 + (1349231875 * i7) + (1735201104 * i4);
        int i18 = i17 * i17;
        int i19 = ((-413510627) * i3) + 1558183936 + (237349861 * i6) + (i13 * 325430244) + (325430244 * i14) + ((-325430244) * i16) + ((-88080384) * i2) + ((-1337982976) * i7) + (469762048 * i4) + (1272971264 * i18);
        int i20 = ((i3 * 236314795) - 374860141) + (i6 * 236313123) + (i13 * (-836)) + (i14 * (-836)) + (i16 * 836) + (i2 * 236313959) + (i7 * (-66979019)) + (i4 * (-1872492752)) + (i18 * (-417333248));
        if (i19 + (i20 * i20 * 639631360) != 1) {
            return c(objArr);
        }
        int i21 = 2 % 2;
        int i22 = f25366g + 103;
        int i23 = i22 % 128;
        f25368i = i23;
        int i24 = i22 % 2;
        int i25 = i23 + 45;
        f25366g = i25 % 128;
        int i26 = i25 % 2;
        return null;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        f fVar = (f) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = f25366g;
        int i4 = ((45 | i3) << 1) - (i3 ^ 45);
        f25368i = i4 % 128;
        if (i4 % 2 == 0) {
            return fVar.d(str);
        }
        fVar.d(str);
        throw null;
    }

    private o.fa.a d(String str) {
        int i2 = 2 % 2;
        o.fa.a aVar = new o.fa.a(k(), str, false);
        int i3 = f25366g;
        int i4 = (i3 & 89) + (i3 | 89);
        f25368i = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
        return aVar;
    }

    @Override // o.et.c
    public final byte[] F() {
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int iNextInt = new Random().nextInt(1409955012);
        int i2 = 1128646341 * f25367h;
        f25367h = i2;
        return (byte[]) b(iElapsedRealtime, 2139137845, i2, new Object[]{this}, iFreeMemory, -2139137844, iNextInt);
    }

    @Override // o.et.c
    public EmvApplicationType a() {
        int i2 = 2 % 2;
        int i3 = f25366g + 13;
        f25368i = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            EmvApplicationType emvApplicationType = EmvApplicationType.HceIssuerPure;
            obj.hashCode();
            throw null;
        }
        EmvApplicationType emvApplicationType2 = EmvApplicationType.HceIssuerPure;
        int i4 = f25368i;
        int i5 = (i4 ^ 23) + (((i4 + 23) - (i4 | 23)) << 1);
        f25366g = i5 % 128;
        if (i5 % 2 != 0) {
            return emvApplicationType2;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.et.c
    protected final c b(String str, String str2, int i2, String str3) {
        int i3 = 2 % 2;
        f fVar = new f(str, str2, i2, str3);
        int i4 = f25366g;
        int i5 = (((-1) - (((-1) - i4) & ((-1) - 81))) << 1) - (i4 ^ 81);
        f25368i = i5 % 128;
        int i6 = i5 % 2;
        return fVar;
    }

    @Override // o.eq.b
    public final /* synthetic */ o.eu.d c(String str) {
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i2 = (int) Runtime.getRuntime().totalMemory();
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i3 = f25369j * 1591671995;
        f25369j = i3;
        return (o.eu.d) b(i2, 1491041174, i3, new Object[]{this, str}, iFreeMemory, -1491041174, iMaxMemory);
    }
}
