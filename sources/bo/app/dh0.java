package bo.app;

import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class dh0 extends bh0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap f494f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh0(JSONObject json) {
        super(json);
        Intrinsics.checkNotNullParameter(json, "json");
        this.f494f = new LinkedHashMap();
    }
}
