package r;

import android.app.Application;
import com.dynatrace.android.agent.Global;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class misplace {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f28247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f28248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f28249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function0 f28250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function1 f28251e;

    public misplace(Application application) {
        tongue tongueVar = tongue.f28258a;
        apparatus apparatusVar = apparatus.f28245a;
        civilian civilianVar = civilian.f28246a;
        taste tasteVar = taste.f28257a;
        this.f28247a = application;
        this.f28248b = tongueVar;
        this.f28249c = apparatusVar;
        this.f28250d = civilianVar;
        this.f28251e = tasteVar;
    }

    public final List a() {
        List mutableList = ArraysKt.toMutableList(superior.f28256d);
        String str = (String) this.f28249c.invoke();
        if (StringsKt.isBlank(str)) {
            return CollectionsKt.toList(mutableList);
        }
        for (String str2 : StringsKt.split$default((CharSequence) str, new String[]{Global.COLON}, false, 0, 6, (Object) null)) {
            if (!StringsKt.endsWith$default(str2, RemoteSettings.FORWARD_SLASH_STRING, false, 2, (Object) null)) {
                str2 = str2 + RemoteSettings.FORWARD_SLASH_STRING;
            }
            if (!mutableList.contains(str2)) {
                mutableList.add(str2);
            }
        }
        return CollectionsKt.toList(mutableList);
    }
}
