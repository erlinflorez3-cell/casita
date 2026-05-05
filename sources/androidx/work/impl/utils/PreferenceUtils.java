package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.Preference;
import com.ticnow.sdk.idnowonboarding.steps.response.IDStepResponseCodes;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.Xg;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public class PreferenceUtils {
    public static final String CREATE_PREFERENCE = "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))";
    public static final String INSERT_PREFERENCE = "INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)";
    public static final String KEY_LAST_CANCEL_ALL_TIME_MS = "last_cancel_all_time_ms";
    private static final String KEY_LAST_FORCE_STOP_MS = "last_force_stop_ms";
    public static final String KEY_RESCHEDULE_NEEDED = "reschedule_needed";
    public static final String PREFERENCES_FILE_NAME = "androidx.work.util.preferences";
    private final WorkDatabase mWorkDatabase;

    public PreferenceUtils(WorkDatabase workDatabase) {
        this.mWorkDatabase = workDatabase;
    }

    public long getLastCancelAllTimeMillis() {
        Long longValue = this.mWorkDatabase.preferenceDao().getLongValue(KEY_LAST_CANCEL_ALL_TIME_MS);
        if (longValue != null) {
            return longValue.longValue();
        }
        return 0L;
    }

    public LiveData<Long> getLastCancelAllTimeMillisLiveData() {
        return Transformations.map(this.mWorkDatabase.preferenceDao().getObservableLongValue(KEY_LAST_CANCEL_ALL_TIME_MS), new Function<Long, Long>() { // from class: androidx.work.impl.utils.PreferenceUtils.1
            @Override // androidx.arch.core.util.Function
            public Long apply(Long value) {
                return Long.valueOf(value != null ? value.longValue() : 0L);
            }
        });
    }

    public void setLastCancelAllTimeMillis(final long timeMillis) {
        this.mWorkDatabase.preferenceDao().insertPreference(new Preference(KEY_LAST_CANCEL_ALL_TIME_MS, Long.valueOf(timeMillis)));
    }

    public boolean getNeedsReschedule() {
        Long longValue = this.mWorkDatabase.preferenceDao().getLongValue(KEY_RESCHEDULE_NEEDED);
        return longValue != null && longValue.longValue() == 1;
    }

    public void setNeedsReschedule(boolean needsReschedule) {
        this.mWorkDatabase.preferenceDao().insertPreference(new Preference(KEY_RESCHEDULE_NEEDED, needsReschedule));
    }

    public void setLastForceStopEventMillis(long lastForceStopTimeMillis) {
        this.mWorkDatabase.preferenceDao().insertPreference(new Preference(KEY_LAST_FORCE_STOP_MS, Long.valueOf(lastForceStopTimeMillis)));
    }

    public long getLastForceStopEventMillis() {
        Long longValue = this.mWorkDatabase.preferenceDao().getLongValue(KEY_LAST_FORCE_STOP_MS);
        if (longValue != null) {
            return longValue.longValue();
        }
        return 0L;
    }

    public static void migrateLegacyPreferences(Context context, SupportSQLiteDatabase sqLiteDatabase) throws Throwable {
        String strUd = C1561oA.ud("'+/ ,-w&(t&\u0018\"\u001d\u0011\u0012\u0013l\u0015\u0019\u001e\u0018g'\u00167))'3%-!\"\u001cZa\u0019#\u001c/\u0015_R\u0012\u001d\u001f\u001d\u0015\f\"\f\u0016\u001e\r\u0007NDycmudq=D[\u0006~\u0012C6U\u0001\u0003\u0001xo\u0006oy\u0002p3", (short) (Od.Xd() ^ (-14029)));
        Object[] objArr = {C1561oA.yd("'5(794,Ak6+/-p55\u001f#a%, \u001e\u001e \u0014\u001a\u0010\u0017&", (short) (OY.Xd() ^ 31794)), 0};
        Method method = Class.forName(C1561oA.Yd("p~u\u0005\u0003}yDz\b\b\u000f\u0001\u000b\u0012Lb\u0010\u0010\u0017\t\u001d\u001a", (short) (ZN.Xd() ^ IDStepResponseCodes.STEP_RESULT_BIOMETRY_NOT_MET))).getMethod(Jg.Wd("a!ay@;}*Z\b\u001cHz;:fa\u0018KS", (short) (C1580rY.Xd() ^ (-6724)), (short) (C1580rY.Xd() ^ (-14237))), Class.forName(Xg.qd("\n\u0002\u0018\u0004Q\u0011\u0007\u0015\u000fV|\u001f\u001e\u0016\u001c\u0016", (short) (OY.Xd() ^ 5753), (short) (OY.Xd() ^ 10374))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
            String strXd = ZO.xd("j\u001ai+r1X0cchk%*4?X", (short) (C1580rY.Xd() ^ (-12723)), (short) (C1580rY.Xd() ^ (-3295)));
            boolean zContains = sharedPreferences.contains(strXd);
            String strUd2 = C1626yg.Ud("/\u0006R\b^\u0005`\u0013=>\u001e\u00119\u000f/}v;:zW \u0006", (short) (C1633zX.Xd() ^ (-2614)), (short) (C1633zX.Xd() ^ (-23878)));
            if (zContains || sharedPreferences.contains(strUd2)) {
                long j2 = sharedPreferences.getLong(strUd2, 0L);
                long j3 = sharedPreferences.getBoolean(strXd, false) ? 1L : 0L;
                sqLiteDatabase.beginTransaction();
                try {
                    sqLiteDatabase.execSQL(strUd, new Object[]{strUd2, Long.valueOf(j2)});
                    sqLiteDatabase.execSQL(strUd, new Object[]{strXd, Long.valueOf(j3)});
                    sharedPreferences.edit().clear().apply();
                    sqLiteDatabase.setTransactionSuccessful();
                } finally {
                    sqLiteDatabase.endTransaction();
                }
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
