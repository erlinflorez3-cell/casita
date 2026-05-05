package x0;

import com.cleafy.mobile.detection.agent.configuration.CleafyConfiguration;
import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.text.StringsKt;
import w0.fling;

/* JADX INFO: loaded from: classes2.dex */
public final class pair {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final abundant f28452a;

    public pair(c.civilian civilianVar, w0.taste tasteVar, f1.tongue tongueVar, e1.pair pairVar) {
        fling flingVar = tasteVar.f28405a;
        CleafyConfiguration cleafyConfiguration = civilianVar.f2448b;
        this.f28452a = new abundant(flingVar, cleafyConfiguration.f2799k, cleafyConfiguration.f2790b, cleafyConfiguration.f2791c, StringsKt.removeSuffix(cleafyConfiguration.f2789a, (CharSequence) RemoteSettings.FORWARD_SLASH_STRING), tongueVar.f18542b, pairVar.f18483a, superior.f28455a);
    }
}
