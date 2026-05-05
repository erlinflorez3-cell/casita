package com.ts.coresdk;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {
    public static final JsonArray a(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            return new JsonParser().parse(str).getAsJsonArray();
        } catch (Throwable unused) {
            return null;
        }
    }
}
