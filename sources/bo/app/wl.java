package bo.app;

import com.braze.enums.CardKey;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class wl extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CardKey.Provider f2153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h00 f2154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ICardStorageProvider f2155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m00 f2156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ JSONArray f2157e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl(m00 m00Var, CardKey.Provider provider, h00 h00Var, ICardStorageProvider iCardStorageProvider, JSONArray jSONArray) {
        super(1);
        this.f2153a = provider;
        this.f2154b = h00Var;
        this.f2155c = iCardStorageProvider;
        this.f2156d = m00Var;
        this.f2157e = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        try {
            String string = it.toString();
            return xl.a(new JSONObject(string), this.f2153a, this.f2154b, this.f2155c, this.f2156d);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) xl.f2230a, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new vl(it, this.f2157e), 4, (Object) null);
            return null;
        }
    }
}
