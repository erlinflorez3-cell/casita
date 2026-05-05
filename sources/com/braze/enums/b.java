package com.braze.enums;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f2648a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(JSONObject jSONObject) {
        super(0);
        this.f2648a = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Short News card doesn't contain image url, parsing type as Text Announcement. JSON: " + this.f2648a;
    }
}
