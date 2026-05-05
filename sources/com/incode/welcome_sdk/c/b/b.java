package com.incode.welcome_sdk.c.b;

import com.incode.welcome_sdk.data.EventValues;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {
    public static final d b(e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "");
        HashMap<String, Object> mapB = eVar.b();
        String str = (String) (mapB != null ? mapB.get(EventValues.SCREEN_NAME.getValue()) : null);
        HashMap<String, Object> mapB2 = eVar.b();
        return new d(eVar.a().getValue(), null, str, eVar.b(), (Long) (mapB2 != null ? mapB2.get(EventValues.TIMESTAMP.getValue()) : null));
    }
}
