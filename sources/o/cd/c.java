package o.cd;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import fr.antelop.sdk.WalletLockReason;
import fr.antelop.sdk.WalletNotificationServiceCallback;
import fr.antelop.sdk.card.EmvApplicationActivationMethod;
import java.util.Date;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements WalletNotificationServiceCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f22125a = 877409192;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f22126b = 1600183651;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f22127c = 1650163619;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f22128d = 538457594;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f22129e = 1966069355;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f22130f = 280564633;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f22131g = -1438507308;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f22132h = 1708791069;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f22133i = -1469110382;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f22134j = 1061977488;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f22135k = -996298301;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f22136l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f22137m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f22138n = -820095289;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f22139o = 1420025298;

    private static /* synthetic */ Object b(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = f22136l + 67;
        f22137m = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = f22137m + 17;
        f22136l = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Object e(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
        int i8 = ~i4;
        int i9 = ~((i8 + i6) - (i8 & i6));
        int i10 = ~((-1) - (((-1) - (~i6)) & ((-1) - (~i2))));
        int i11 = (i10 + i9) - (i10 & i9);
        int i12 = (i6 + i2) - (i6 & i2);
        int i13 = i6 + i2 + i5 + ((-39394691) * i3) + ((-2104995841) * i7);
        int i14 = i13 * i13;
        int i15 = (i6 * (-1880913482)) + 198443008 + ((-1880913482) * i2) + ((-1126725195) * i9) + (i11 * 1126725195) + (1126725195 * i12) + ((-754188288) * i5) + ((-1529085952) * i3) + ((-319553536) * i7) + ((-289079296) * i14);
        int i16 = ((i6 * 1773844906) - 1404835566) + (i2 * 1773844906) + (i9 * (-613)) + (i11 * IptcDirectory.TAG_COUNTRY_OR_PRIMARY_LOCATION_NAME) + (i12 * IptcDirectory.TAG_COUNTRY_OR_PRIMARY_LOCATION_NAME) + (i5 * 1773845519) + (i3 * 1055723859) + (i7 * 1996616689) + (i14 * (-1450508288));
        int i17 = i15 + (i16 * i16 * (-778371072));
        if (i17 == 1) {
            int i18 = 2 % 2;
            int i19 = f22137m;
            int i20 = ((-1) - (((-1) - i19) | ((-1) - 87))) + ((-1) - (((-1) - i19) & ((-1) - 87)));
            f22136l = i20 % 128;
            int i21 = i20 % 2;
            return null;
        }
        if (i17 == 2) {
            int i22 = 2 % 2;
            int i23 = f22137m;
            int i24 = (i23 & 31) + ((-1) - (((-1) - i23) & ((-1) - 31)));
            f22136l = i24 % 128;
            int i25 = i24 % 2;
            return null;
        }
        if (i17 == 3) {
            return b(objArr);
        }
        if (i17 == 4) {
            int i26 = 2 % 2;
            int i27 = f22136l + 3;
            f22137m = i27 % 128;
            int i28 = i27 % 2;
            return null;
        }
        if (i17 != 5) {
            return c(objArr);
        }
        int i29 = 2 % 2;
        int i30 = f22136l;
        int i31 = (i30 ^ 5) + (((i30 + 5) - (i30 | 5)) << 1);
        f22137m = i31 % 128;
        int i32 = i31 % 2;
        return null;
    }

    @Override // fr.antelop.sdk.WalletNotificationServiceCallback
    public final void onCardsUpdated(Context context) {
        int id = (int) Thread.currentThread().getId();
        int priority = Thread.currentThread().getPriority();
        int iMyUid = Process.myUid();
        int i2 = f22131g * (-1197317488);
        f22131g = i2;
        e(1463267068, iMyUid, id, priority, new Object[]{this, context}, -1463267065, i2);
    }

    @Override // fr.antelop.sdk.WalletNotificationServiceCallback
    public final void onCountersUpdated(Context context) {
        int i2 = f22138n * (-1561467445);
        f22138n = i2;
        int i3 = f22139o * 1790439799;
        f22139o = i3;
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i4 = f22135k * 771387659;
        f22135k = i4;
        e(496708911, elapsedCpuTime, i2, i3, new Object[]{this, context}, -496708906, i4);
    }

    @Override // fr.antelop.sdk.WalletNotificationServiceCallback
    public final void onCustomerCredentialsReset(Context context) {
        int i2 = 2 % 2;
        int i3 = f22136l;
        int i4 = ((i3 + 7) - (7 | i3)) + ((-1) - (((-1) - i3) & ((-1) - 7)));
        f22137m = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // fr.antelop.sdk.WalletNotificationServiceCallback
    public final void onEmvApplicationActivationRequired(Context context, String str, List<EmvApplicationActivationMethod> list) {
        int i2 = 2 % 2;
        int i3 = f22136l + 59;
        f22137m = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // fr.antelop.sdk.WalletNotificationServiceCallback
    public final void onEmvApplicationCredentialsUpdated(Context context) {
        int i2 = f22127c * 482410992;
        f22127c = i2;
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i3 = f22128d * (-137798957);
        f22128d = i3;
        e(1769540366, iUptimeMillis, i2, iFreeMemory, new Object[]{this, context}, -1769540364, i3);
    }

    @Override // fr.antelop.sdk.WalletNotificationServiceCallback
    public final void onLogout(Context context) {
        int i2 = f22126b * 1918821330;
        f22126b = i2;
        int iNextInt = new Random().nextInt();
        e(-1323815907, new Random().nextInt(), i2, iNextInt, new Object[]{this, context}, 1323815907, (int) Runtime.getRuntime().freeMemory());
    }

    @Override // fr.antelop.sdk.WalletNotificationServiceCallback
    public final void onLostEligibility(Context context) {
        int i2 = f22129e * 1982759752;
        f22129e = i2;
        int i3 = f22125a * (-333464237);
        f22125a = i3;
        e(-1776666922, new Random().nextInt(), i2, i3, new Object[]{this, context}, 1776666923, Process.myTid());
    }

    @Override // fr.antelop.sdk.WalletNotificationServiceCallback
    public final void onSettingsUpdated(Context context) {
        int i2 = 2 % 2;
        int i3 = f22137m + 77;
        f22136l = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // fr.antelop.sdk.WalletNotificationServiceCallback
    public final void onSunsetScheduled(Context context, Date date) {
        int i2 = 2 % 2;
        int i3 = f22137m + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f22136l = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // fr.antelop.sdk.WalletNotificationServiceCallback
    public final void onWalletDeleted(Context context) {
        int i2 = 2 % 2;
        int i3 = f22136l + 41;
        f22137m = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // fr.antelop.sdk.WalletNotificationServiceCallback
    public final void onWalletLoaded(Context context) {
        int i2 = 2 % 2;
        int i3 = f22137m;
        int i4 = (i3 & 109) + (i3 | 109);
        f22136l = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // fr.antelop.sdk.WalletNotificationServiceCallback
    public final void onWalletLocked(Context context, WalletLockReason walletLockReason) {
        int i2 = f22134j * (-908308031);
        f22134j = i2;
        int i3 = f22133i * (-832840147);
        f22133i = i3;
        int i4 = f22132h * 937357826;
        f22132h = i4;
        int i5 = f22130f * (-314983656);
        f22130f = i5;
        e(694098149, i4, i2, i3, new Object[]{this, context, walletLockReason}, -694098145, i5);
    }

    @Override // fr.antelop.sdk.WalletNotificationServiceCallback
    public final void onWalletUnlocked(Context context) {
        int i2 = 2 % 2;
        int i3 = f22137m;
        int i4 = (i3 ^ 7) + (((-1) - (((-1) - i3) | ((-1) - 7))) << 1);
        f22136l = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
    }
}
