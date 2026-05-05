package com.incode.welcome_sdk.commons.utils;

import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.data.EventValues;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.modules.Modules;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6568a = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f6569d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Modules f6570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.incode.welcome_sdk.commons.n f6571c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final IncodeWelcomeRepository f6572e;

    public o(IncodeWelcomeRepository incodeWelcomeRepository, com.incode.welcome_sdk.commons.n nVar, Modules modules) {
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(nVar, "");
        Intrinsics.checkNotNullParameter(modules, "");
        this.f6572e = incodeWelcomeRepository;
        this.f6571c = nVar;
        this.f6570b = modules;
    }

    private ScreenName d() {
        int i2 = 2 % 2;
        int i3 = f6568a + 95;
        f6569d = i3 % 128;
        int i4 = i3 % 2;
        ScreenName value = this.f6571c.b().getValue();
        int i5 = f6569d + 13;
        f6568a = i5 % 128;
        if (i5 % 2 != 0) {
            return value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void c(Event event) {
        int i2 = 2 % 2;
        int i3 = f6568a + 85;
        f6569d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(event, "");
        EventUtils.sendEvent(this.f6572e, event, this.f6570b, d());
        int i5 = f6568a + 43;
        f6569d = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void c(Event event, HashMap<String, Object> map) {
        int i2 = 2 % 2;
        int i3 = f6568a + 65;
        f6569d = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(event, "");
            Intrinsics.checkNotNullParameter(map, "");
            a(event, a(map));
        } else {
            Intrinsics.checkNotNullParameter(event, "");
            Intrinsics.checkNotNullParameter(map, "");
            a(event, a(map));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final void a(Event event, HashMap<String, Object> map) {
        int i2 = 2 % 2;
        int i3 = f6568a + 81;
        f6569d = i3 % 128;
        int i4 = i3 % 2;
        EventUtils.supportSendEvent(this.f6572e, event.getValue(), this.f6570b, map);
        int i5 = f6568a + 123;
        f6569d = i5 % 128;
        int i6 = i5 % 2;
    }

    private final HashMap<String, Object> a(HashMap<String, Object> map) {
        int i2 = 2 % 2;
        int i3 = f6569d + 41;
        f6568a = i3 % 128;
        int i4 = i3 % 2;
        map.put(EventValues.SCREEN_NAME.getValue(), d().name());
        int i5 = f6569d + 105;
        f6568a = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }
}
