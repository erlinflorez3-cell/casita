package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.DoNotMock;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes8.dex */
@DoNotMock("^}l(hgqs\u007f{rqy.qmd_j\u0018^dfhfcc.\u001dej+LRLM_NHEU\u001fcU`bTZ@\u0007D=I>B8PNNGV")
@InterfaceC1492Gx
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", explanation = "Use canonical fakes instead.", link = "go/gmscore-restrictedinheritance")
public interface TelemetryLoggingClient extends HasApiKey<TelemetryLoggingOptions> {
    @ResultIgnorabilityUnspecified
    Task<Void> log(TelemetryData telemetryData);
}
