package o.ee;

import android.os.SystemClock;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcessActivityCallback;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f23714a = 338751195;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f23715b = 301258833;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f23716e = 922234485;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f23717g = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f23718j = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f23719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f23720d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f23721f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final CustomerAuthenticatedProcessActivityCallback f23722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f23723i;

    public d(String str, String str2, String str3, boolean z2, CustomerAuthenticatedProcessActivityCallback customerAuthenticatedProcessActivityCallback) {
        this.f23720d = str;
        this.f23719c = str2;
        this.f23721f = z2;
        this.f23723i = str3;
        this.f23722h = customerAuthenticatedProcessActivityCallback;
    }

    public static /* synthetic */ Object c(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
        int i8 = ~i2;
        int i9 = ~i7;
        int i10 = ~i6;
        int i11 = (i10 + i9) - (i10 & i9);
        int i12 = ~i11;
        int i13 = (i8 + i12) - (i8 & i12);
        int i14 = (-1) - (((-1) - i6) & ((-1) - i9));
        int i15 = ~((-1) - (((-1) - i11) & ((-1) - i2)));
        int i16 = i7 + i2 + i4 + (1075552530 * i5) + ((-1519595880) * i3);
        int i17 = i16 * i16;
        int i18 = (((-1050772794) * i7) - 1639710720) + ((-2116975300) * i2) + (i13 * (-533101253)) + (533101253 * i14) + ((-533101253) * i15) + ((-1583874048) * i4) + ((-189792256) * i5) + (1111490560 * i3) + (1415839744 * i17);
        int i19 = (i7 * 251836610) + 257048825 + (i2 * 251838484) + (i13 * 937) + (i14 * (-937)) + (i15 * 937) + (i4 * 251837547) + (i5 * 1710852742) + (i3 * (-1855850104)) + (i17 * (-1244921856));
        return i18 + ((i19 * i19) * (-1300496384)) != 1 ? d(objArr) : c(objArr);
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        d dVar = (d) objArr[0];
        int i2 = 2 % 2;
        int i3 = f23717g + 123;
        f23718j = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = dVar.f23721f;
        if (i4 != 0) {
            return Boolean.valueOf(z2);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        d dVar = (d) objArr[0];
        int i2 = 2 % 2;
        int i3 = f23717g;
        int i4 = ((i3 + 55) - (55 | i3)) + ((i3 + 55) - (55 & i3));
        f23718j = i4 % 128;
        int i5 = i4 % 2;
        String str = dVar.f23720d;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 39;
        f23718j = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final CustomerAuthenticatedProcessActivityCallback a() {
        CustomerAuthenticatedProcessActivityCallback customerAuthenticatedProcessActivityCallback;
        int i2 = 2 % 2;
        int i3 = f23717g + 29;
        int i4 = i3 % 128;
        f23718j = i4;
        if (i3 % 2 == 0) {
            customerAuthenticatedProcessActivityCallback = this.f23722h;
            int i5 = 29 / 0;
        } else {
            customerAuthenticatedProcessActivityCallback = this.f23722h;
        }
        int i6 = i4 + 65;
        f23717g = i6 % 128;
        if (i6 % 2 == 0) {
            return customerAuthenticatedProcessActivityCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String b() {
        int i2 = 2 % 2;
        int i3 = f23718j;
        int i4 = i3 + 21;
        f23717g = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f23719c;
        int i6 = (i3 ^ 103) + (((i3 + 103) - (i3 | 103)) << 1);
        f23717g = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String c() {
        int i2 = 2 % 2;
        int i3 = f23717g;
        int i4 = (((-1) - (((-1) - i3) & ((-1) - 59))) << 1) - (i3 ^ 59);
        int i5 = i4 % 128;
        f23718j = i5;
        int i6 = i4 % 2;
        String str = this.f23723i;
        int i7 = ((-1) - (((-1) - i5) | ((-1) - 75))) + (i5 | 75);
        f23717g = i7 % 128;
        if (i7 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean d() {
        int i2 = f23715b * (-721725668);
        f23715b = i2;
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i3 = f23716e * 756777998;
        f23716e = i3;
        return ((Boolean) c(-441459975, new Random().nextInt(), new Object[]{this}, iFreeMemory, i3, i2, 441459976)).booleanValue();
    }

    public final String e() {
        int priority = Thread.currentThread().getPriority();
        int priority2 = Thread.currentThread().getPriority();
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i2 = (-1097789956) * f23714a;
        f23714a = i2;
        return (String) c(432629012, i2, new Object[]{this}, priority2, iElapsedRealtime, priority, -432629012);
    }
}
