package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public class Storage {
    private static final Lock zaa = new ReentrantLock();
    private static Storage zab = null;
    private final Lock zac = new ReentrantLock();
    private final SharedPreferences zad;

    Storage(Context context) throws Throwable {
        String strKd = C1561oA.Kd("jwv8r{|u{u?s\u0002x\b\u0006\u0001|G\u0002\t\u0010K\u0012\t\b\u0010\f\u0012", (short) (C1499aX.Xd() ^ (-25647)));
        Class<?> cls = Class.forName(Wg.Zd("UO\u0002\u0011J\u0005|\u0005;\u0004CFwCF@R?z\u00021\u0001}", (short) (C1499aX.Xd() ^ (-11751)), (short) (C1499aX.Xd() ^ (-12032))));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (OY.Xd() ^ 20212);
        int[] iArr = new int["\u0014\f\"\u000e[\u001b\u0011\u001f\u0019`\u0007)( & ".length()];
        QB qb = new QB("\u0014\f\"\u000e[\u001b\u0011\u001f\u0019`\u0007)( & ");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        clsArr[1] = Integer.TYPE;
        Object[] objArr = {strKd, 0};
        short sXd2 = (short) (OY.Xd() ^ 17995);
        int[] iArr2 = new int["&%5\u0015#\u001d/#\u001b\b+\u001f\u0019\u0019'\u001b\u001d\u0013\u0016%".length()];
        QB qb2 = new QB("&%5\u0015#\u001d/#\u001b\b+\u001f\u0019\u0019'\u001b\u001d\u0013\u0016%");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((sXd2 ^ i3) + xuXd2.CK(iKK2));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            this.zad = (SharedPreferences) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static Storage getInstance(Context context) {
        Preconditions.checkNotNull(context);
        Lock lock = zaa;
        lock.lock();
        try {
            if (zab == null) {
                short sXd = (short) (C1580rY.Xd() ^ (-27380));
                short sXd2 = (short) (C1580rY.Xd() ^ (-24919));
                int[] iArr = new int[")5*73,&n#.,1!).fz&$)\u0019+&".length()];
                QB qb = new QB(")5*73,&n#.,1!).fz&$)\u0019+&");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                    i2++;
                }
                Object[] objArr = new Object[0];
                Method method = Class.forName(new String(iArr, 0, i2)).getMethod(hg.Vd("\u0003\u007f\u000eY\b\u0007\u0002}vs\u0006y~|P{y~n\u0001{", (short) (C1633zX.Xd() ^ (-14435)), (short) (C1633zX.Xd() ^ (-27761))), new Class[0]);
                try {
                    method.setAccessible(true);
                    zab = new Storage((Context) method.invoke(context, objArr));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            Storage storage = zab;
            lock.unlock();
            return storage;
        } catch (Throwable th) {
            zaa.unlock();
            throw th;
        }
    }

    private static final String zae(String str, String str2) {
        return str + Global.COLON + str2;
    }

    public void clear() {
        this.zac.lock();
        try {
            this.zad.edit().clear().apply();
        } finally {
            this.zac.unlock();
        }
    }

    public GoogleSignInAccount getSavedDefaultGoogleSignInAccount() {
        String strZaa;
        String strZaa2 = zaa("defaultGoogleSignInAccount");
        GoogleSignInAccount googleSignInAccountZab = null;
        if (TextUtils.isEmpty(strZaa2) || (strZaa = zaa(zae("googleSignInAccount", strZaa2))) == null) {
            return null;
        }
        try {
            googleSignInAccountZab = GoogleSignInAccount.zab(strZaa);
            return googleSignInAccountZab;
        } catch (JSONException unused) {
            return googleSignInAccountZab;
        }
    }

    public GoogleSignInOptions getSavedDefaultGoogleSignInOptions() {
        String strZaa;
        String strZaa2 = zaa("defaultGoogleSignInAccount");
        GoogleSignInOptions googleSignInOptionsZab = null;
        if (TextUtils.isEmpty(strZaa2) || (strZaa = zaa(zae("googleSignInOptions", strZaa2))) == null) {
            return null;
        }
        try {
            googleSignInOptionsZab = GoogleSignInOptions.zab(strZaa);
            return googleSignInOptionsZab;
        } catch (JSONException unused) {
            return googleSignInOptionsZab;
        }
    }

    public String getSavedRefreshToken() {
        return zaa("refreshToken");
    }

    public void saveDefaultGoogleSignInAccount(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        zad("defaultGoogleSignInAccount", googleSignInAccount.zac());
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        String strZac = googleSignInAccount.zac();
        zad(zae("googleSignInAccount", strZac), googleSignInAccount.zad());
        zad(zae("googleSignInOptions", strZac), googleSignInOptions.zaf());
    }

    protected final String zaa(String str) {
        this.zac.lock();
        try {
            return this.zad.getString(str, null);
        } finally {
            this.zac.unlock();
        }
    }

    protected final void zab(String str) {
        this.zac.lock();
        try {
            this.zad.edit().remove(str).apply();
        } finally {
            this.zac.unlock();
        }
    }

    public final void zac() {
        String strZaa = zaa("defaultGoogleSignInAccount");
        zab("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strZaa)) {
            return;
        }
        zab(zae("googleSignInAccount", strZaa));
        zab(zae("googleSignInOptions", strZaa));
    }

    protected final void zad(String str, String str2) {
        this.zac.lock();
        try {
            this.zad.edit().putString(str, str2).apply();
        } finally {
            this.zac.unlock();
        }
    }
}
