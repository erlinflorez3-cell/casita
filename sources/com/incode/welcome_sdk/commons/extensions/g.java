package com.incode.welcome_sdk.commons.extensions;

import com.hbisoft.hbrecorder.HBRecorderListener;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.data.EventValues;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.modules.Modules;
import java.util.HashMap;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements HBRecorderListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5124a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5125d = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IncodeWelcomeRepository f5126c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.incode.welcome_sdk.modules.g f5127e;

    public g(IncodeWelcomeRepository incodeWelcomeRepository, com.incode.welcome_sdk.modules.g gVar) {
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        this.f5126c = incodeWelcomeRepository;
        this.f5127e = gVar;
    }

    @Override // com.hbisoft.hbrecorder.HBRecorderListener
    public final void HBRecorderOnStart() {
        int i2 = 2 % 2;
        int i3 = f5124a + 35;
        f5125d = i3 % 128;
        int i4 = i3 % 2;
        Timber.Forest.d("HBRecorderOnStart, module: " + this.f5127e, new Object[0]);
        int i5 = f5124a + 107;
        f5125d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 13 / 0;
        }
    }

    @Override // com.hbisoft.hbrecorder.HBRecorderListener
    public final void HBRecorderOnComplete() {
        int i2 = 2 % 2;
        int i3 = f5125d + 123;
        f5124a = i3 % 128;
        int i4 = i3 % 2;
        Timber.Forest.d("HBRecorderOnComplete, module: " + this.f5127e, new Object[0]);
        int i5 = f5124a + 71;
        f5125d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 73 / 0;
        }
    }

    @Override // com.hbisoft.hbrecorder.HBRecorderListener
    public final void HBRecorderOnError(int i2, String str) {
        int i3 = 2 % 2;
        int i4 = f5125d + 29;
        f5124a = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Timber.Forest.e("HBRecorderOnError errorCode:" + i2 + " reason: " + str + ", module: " + this.f5127e, new Object[0]);
        EventUtils.sendEvent(this.f5126c, Event.VIDEO_RECORDING_ERROR, (Modules) null, (HashMap<String, Object>) MapsKt.hashMapOf(TuplesKt.to(EventValues.SCREEN_NAME.getValue(), this.f5126c.getCurrentScreenName().name()), TuplesKt.to(EventValues.ERROR_MESSAGE.getValue(), str)));
        int i6 = f5125d + 59;
        f5124a = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.hbisoft.hbrecorder.HBRecorderListener
    public final void HBRecorderOnPause() {
        int i2 = 2 % 2;
        int i3 = f5124a + 19;
        f5125d = i3 % 128;
        if (i3 % 2 == 0) {
            Timber.Forest.d("HBRecorderOnPause, module: " + this.f5127e, new Object[0]);
        } else {
            Timber.Forest.d("HBRecorderOnPause, module: " + this.f5127e, new Object[0]);
        }
        int i4 = f5124a + 117;
        f5125d = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.hbisoft.hbrecorder.HBRecorderListener
    public final void HBRecorderOnResume() {
        int i2 = 2 % 2;
        int i3 = f5125d + 71;
        f5124a = i3 % 128;
        int i4 = i3 % 2;
        Timber.Forest.d("HBRecorderOnResume, module: " + this.f5127e, new Object[0]);
        int i5 = f5125d + 109;
        f5124a = i5 % 128;
        int i6 = i5 % 2;
    }
}
