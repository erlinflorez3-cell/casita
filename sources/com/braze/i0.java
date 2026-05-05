package com.braze;

import android.content.Intent;
import bo.app.a4;
import bo.app.ci0;
import bo.app.lx;
import bo.app.n60;
import bo.app.tf;
import bo.app.y3;
import bo.app.z3;
import com.braze.support.BrazeLogger;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f2661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f2662b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Intent intent, Braze braze) {
        super(0);
        this.f2661a = intent;
        this.f2662b = braze;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        Intent intent = this.f2661a;
        if (intent == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f2662b, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) y3.f2261a, 6, (Object) null);
        } else {
            String campaignId = intent.getStringExtra("cid");
            if (campaignId == null || StringsKt.isBlank(campaignId)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f2662b, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) a4.f169a, 6, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f2662b, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new z3(campaignId), 6, (Object) null);
                tf tfVar = ((ci0) this.f2662b.getUdm$android_sdk_base_release()).f403v;
                int i2 = n60.f1344i;
                Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("cid", campaignId);
                LinkedHashMap linkedHashMap = lx.f1214b;
                tfVar.a(new n60(jSONObject));
            }
            Braze.Companion.requestTriggersIfInAppMessageTestPush$android_sdk_base_release(this.f2661a, ((ci0) this.f2662b.getUdm$android_sdk_base_release()).f403v);
        }
        return Unit.INSTANCE;
    }
}
