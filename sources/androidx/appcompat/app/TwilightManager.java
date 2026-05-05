package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.compose.material3.internal.CalendarModelKt;
import androidx.core.content.PermissionChecker;
import com.statsig.androidsdk.StatsigLoggerKt;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import yg.C1499aX;
import yg.C1561oA;
import yg.OY;
import yg.Qg;
import yg.Wg;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes.dex */
class TwilightManager {
    private static final int SUNRISE = 6;
    private static final int SUNSET = 22;
    private static final String TAG = "TwilightManager";
    private static TwilightManager sInstance = null;
    private final Context mContext;
    private final LocationManager mLocationManager;
    private final TwilightState mTwilightState = new TwilightState();

    static TwilightManager getInstance(Context context) throws Throwable {
        if (sInstance == null) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Kd("\n\u0018\u000f\u001e\u001c\u0017\u0013]\u0014!!(\u001a$+e{))0\"63", (short) (ZN.Xd() ^ 32483))).getMethod(Wg.Zd("J2wn4~2y*Z\u0014@pEdGq\u000e1\u000ba", (short) (OY.Xd() ^ 27960), (short) (OY.Xd() ^ 20179)), new Class[0]);
            try {
                method.setAccessible(true);
                Context context2 = (Context) method.invoke(context, objArr);
                Object[] objArr2 = {C1561oA.Xd("7;0/C9@@", (short) (C1499aX.Xd() ^ (-11172)))};
                Method method2 = Class.forName(Wg.vd("\u0012 \u0013\"\u001c\u0017\u000fY\f\u0019\u0015\u001c\n\u0014\u0017Q\u00041-4\"6/", (short) (OY.Xd() ^ 26265))).getMethod(hg.Vd("\\YgEjccSZ?P\\_QJK", (short) (ZN.Xd() ^ 20425), (short) (ZN.Xd() ^ 26441)), Class.forName(Qg.kd("H>R<\bE9E=\u0003'GD:>6", (short) (C1499aX.Xd() ^ (-15775)), (short) (C1499aX.Xd() ^ (-5933)))));
                try {
                    method2.setAccessible(true);
                    sInstance = new TwilightManager(context2, (LocationManager) method2.invoke(context2, objArr2));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        return sInstance;
    }

    static void setInstance(TwilightManager twilightManager) {
        sInstance = twilightManager;
    }

    TwilightManager(Context context, LocationManager locationManager) {
        this.mContext = context;
        this.mLocationManager = locationManager;
    }

    boolean isNight() {
        TwilightState twilightState = this.mTwilightState;
        if (isStateValid()) {
            return twilightState.isNight;
        }
        Location lastKnownLocation = getLastKnownLocation();
        if (lastKnownLocation != null) {
            updateState(lastKnownLocation);
            return twilightState.isNight;
        }
        int i2 = Calendar.getInstance().get(11);
        return i2 < 6 || i2 >= 22;
    }

    private Location getLastKnownLocation() {
        Location lastKnownLocationForProvider = PermissionChecker.checkSelfPermission(this.mContext, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? getLastKnownLocationForProvider("network") : null;
        Location lastKnownLocationForProvider2 = PermissionChecker.checkSelfPermission(this.mContext, "android.permission.ACCESS_FINE_LOCATION") == 0 ? getLastKnownLocationForProvider("gps") : null;
        return (lastKnownLocationForProvider2 == null || lastKnownLocationForProvider == null) ? lastKnownLocationForProvider2 != null ? lastKnownLocationForProvider2 : lastKnownLocationForProvider : lastKnownLocationForProvider2.getTime() > lastKnownLocationForProvider.getTime() ? lastKnownLocationForProvider2 : lastKnownLocationForProvider;
    }

    private Location getLastKnownLocationForProvider(String str) {
        try {
            if (this.mLocationManager.isProviderEnabled(str)) {
                return this.mLocationManager.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e2) {
            return null;
        }
    }

    private boolean isStateValid() {
        return this.mTwilightState.nextUpdate > System.currentTimeMillis();
    }

    private void updateState(Location location) {
        long j2;
        TwilightState twilightState = this.mTwilightState;
        long jCurrentTimeMillis = System.currentTimeMillis();
        TwilightCalculator twilightCalculator = TwilightCalculator.getInstance();
        twilightCalculator.calculateTwilight(jCurrentTimeMillis - CalendarModelKt.MillisecondsIn24Hours, location.getLatitude(), location.getLongitude());
        twilightCalculator.calculateTwilight(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z2 = twilightCalculator.state == 1;
        long j3 = twilightCalculator.sunrise;
        long j4 = twilightCalculator.sunset;
        twilightCalculator.calculateTwilight(jCurrentTimeMillis + CalendarModelKt.MillisecondsIn24Hours, location.getLatitude(), location.getLongitude());
        long j5 = twilightCalculator.sunrise;
        if (j3 == -1 || j4 == -1) {
            j2 = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis <= j4) {
                j5 = jCurrentTimeMillis > j3 ? j4 : j3;
            }
            j2 = j5 + StatsigLoggerKt.FLUSH_TIMER_MS;
        }
        twilightState.isNight = z2;
        twilightState.nextUpdate = j2;
    }

    private static class TwilightState {
        boolean isNight;
        long nextUpdate;

        TwilightState() {
        }
    }
}
