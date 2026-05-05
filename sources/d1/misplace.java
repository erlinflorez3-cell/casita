package d1;

import android.app.Application;
import android.content.SharedPreferences;
import com.dynatrace.android.agent.Global;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class misplace {

    /* JADX INFO: renamed from: a */
    public final Application f18434a;

    /* JADX INFO: renamed from: b */
    public final i1.misplace f18435b;

    /* JADX INFO: renamed from: c */
    public final Lazy f18436c = LazyKt.lazy(new taste(this));

    public misplace(Application application, i1.misplace misplaceVar) {
        this.f18434a = application;
        this.f18435b = misplaceVar;
    }

    public static String a(String str) {
        return str + "_IV";
    }

    public final void a(String str, String str2) {
        String str3;
        if (str2 == null) {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) this.f18436c.getValue()).edit();
            editorEdit.remove(a(str));
            editorEdit.remove(str);
            editorEdit.commit();
            return;
        }
        String strReplace$default = StringsKt.replace$default(UUID.randomUUID().toString(), Global.HYPHEN, "", false, 4, (Object) null);
        i1.misplace misplaceVar = this.f18435b;
        try {
            str3 = (String) misplaceVar.f19719c.invoke(misplaceVar.a(strReplace$default, 1, str2.getBytes(Charsets.UTF_8)));
        } catch (Exception unused) {
            str3 = null;
        }
        if (str3 == null) {
            return;
        }
        SharedPreferences.Editor editorEdit2 = ((SharedPreferences) this.f18436c.getValue()).edit();
        editorEdit2.putString(a(str), strReplace$default);
        editorEdit2.putString(str, str3);
        editorEdit2.commit();
    }

    public final String b(String str) {
        String string;
        byte[] bArrA;
        String string2 = ((SharedPreferences) this.f18436c.getValue()).getString(str, null);
        if (string2 == null || (string = ((SharedPreferences) this.f18436c.getValue()).getString(a(str), null)) == null) {
            return null;
        }
        i1.misplace misplaceVar = this.f18435b;
        try {
            bArrA = misplaceVar.a(string, 2, (byte[]) misplaceVar.f19720d.invoke(string2));
        } catch (Exception unused) {
            bArrA = null;
        }
        if (bArrA != null) {
            return new String(bArrA, Charsets.UTF_8);
        }
        return null;
    }
}
