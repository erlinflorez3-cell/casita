package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.coroutine.BrazeCoroutineScope;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xu;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements SharedPreferences {

    /* JADX INFO: renamed from: a */
    public final Context f1557a;

    /* JADX INFO: renamed from: b */
    public SharedPreferences f1558b;

    /* JADX INFO: renamed from: c */
    public final Job f1559c;

    public q(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("persistent.com.appboy.storage.sdk_enabled_cache", "name");
        this.f1557a = context;
        this.f1559c = BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new o(this, null), 3, null);
    }

    public final void a() throws Throwable {
        if (!this.f1559c.isCompleted()) {
            BuildersKt__BuildersKt.runBlocking$default(null, new p(this, null), 1, null);
        }
        Context context = this.f1557a;
        String strKd = Qg.kd(";/;;099)16n#.+j\u001d+*\u001b'0c((\"$\u0012\u0017\u0014[ \u0010\u0016\t\u000e\u0016\b\b\u0011\t\u0007\u0001\u0004\u0001\u0002\u0006\u0002", (short) (Od.Xd() ^ (-1454)), (short) (Od.Xd() ^ (-6499)));
        Class<?> cls = Class.forName(yg.hg.Vd("\u001a&\u001b($\u001d\u0017_\u0014\u001f\u001d\"\u0012\u001a\u001fWk\u0017\u0015\u001a\n\u001c\u0017", (short) (FB.Xd() ^ 7042), (short) (FB.Xd() ^ 17632)));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (C1499aX.Xd() ^ (-92));
        int[] iArr = new int["RH\\F\u0012OCOG\r1QNDH@".length()];
        QB qb = new QB("RH\\F\u0012OCOG\r1QNDH@");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        clsArr[1] = Integer.TYPE;
        Object[] objArr = {strKd, 0};
        Method method = cls.getMethod(C1561oA.yd("c`rP`Xl^hSxjfdtfzns\u0001", (short) (C1580rY.Xd() ^ (-24316))), clsArr);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, C1561oA.Yd(" --4&:7q,+;\u001b1+=11\u001eA577E9⍴C<\u0004x\u001dJJQCWT\u000f/2(*E7:2@,@2\u0017", (short) (C1607wl.Xd() ^ 4808)));
            this.f1558b = sharedPreferences;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) throws Throwable {
        a();
        SharedPreferences sharedPreferences = this.f1558b;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        return sharedPreferences.contains(str);
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() throws Throwable {
        a();
        SharedPreferences sharedPreferences = this.f1558b;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "prefs.edit()");
        return editorEdit;
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() throws Throwable {
        a();
        SharedPreferences sharedPreferences = this.f1558b;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        Map<String, ?> all = sharedPreferences.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "prefs.all");
        return all;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z2) throws Throwable {
        a();
        SharedPreferences sharedPreferences = this.f1558b;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        return sharedPreferences.getBoolean(str, z2);
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f2) throws Throwable {
        a();
        SharedPreferences sharedPreferences = this.f1558b;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        return sharedPreferences.getFloat(str, f2);
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i2) throws Throwable {
        a();
        SharedPreferences sharedPreferences = this.f1558b;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        return sharedPreferences.getInt(str, i2);
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j2) throws Throwable {
        a();
        SharedPreferences sharedPreferences = this.f1558b;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        return sharedPreferences.getLong(str, j2);
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) throws Throwable {
        a();
        SharedPreferences sharedPreferences = this.f1558b;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        return sharedPreferences.getString(str, str2);
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) throws Throwable {
        a();
        SharedPreferences sharedPreferences = this.f1558b;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        return sharedPreferences.getStringSet(str, set);
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) throws Throwable {
        a();
        SharedPreferences sharedPreferences = this.f1558b;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) throws Throwable {
        a();
        SharedPreferences sharedPreferences = this.f1558b;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        sharedPreferences.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }
}
