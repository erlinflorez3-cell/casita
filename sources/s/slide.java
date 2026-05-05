package s;

import android.app.Application;
import android.telephony.TelephonyManager;
import androidx.core.content.ContextCompat;
import kotlin.Result;
import kotlin.ResultKt;

/* JADX INFO: loaded from: classes2.dex */
public final class slide {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TelephonyManager f28285a;

    public slide(Application application) {
        this.f28285a = h1.pair.a(application, "android.permission.READ_PHONE_STATE") ? (TelephonyManager) ContextCompat.getSystemService(application, TelephonyManager.class) : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String a() {
        Object objM8980constructorimpl;
        if (i1.pair.f()) {
            return "";
        }
        TelephonyManager telephonyManager = this.f28285a;
        if (telephonyManager != null) {
            try {
                Result.Companion companion = Result.Companion;
                objM8980constructorimpl = Result.m8980constructorimpl(telephonyManager.getDeviceId());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM8980constructorimpl = Result.m8980constructorimpl(ResultKt.createFailure(th));
            }
            obj = (String) (Result.m8986isFailureimpl(objM8980constructorimpl) ? null : objM8980constructorimpl);
        }
        return obj == null ? "" : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String b() {
        Object objM8980constructorimpl;
        if (i1.pair.f()) {
            return "";
        }
        TelephonyManager telephonyManager = this.f28285a;
        if (telephonyManager != null) {
            try {
                Result.Companion companion = Result.Companion;
                objM8980constructorimpl = Result.m8980constructorimpl(telephonyManager.getSubscriberId());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM8980constructorimpl = Result.m8980constructorimpl(ResultKt.createFailure(th));
            }
            obj = (String) (Result.m8986isFailureimpl(objM8980constructorimpl) ? null : objM8980constructorimpl);
        }
        return obj == null ? "" : obj;
    }
}
