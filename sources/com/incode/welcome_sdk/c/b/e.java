package com.incode.welcome_sdk.c.b;

import com.incode.welcome_sdk.data.Event;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<String, Object> f4509a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Event f4510c;

    public e(Event event, HashMap<String, Object> map) {
        Intrinsics.checkNotNullParameter(event, "");
        this.f4510c = event;
        this.f4509a = map;
    }

    public final Event a() {
        return this.f4510c;
    }

    public final HashMap<String, Object> b() {
        return this.f4509a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f4510c == eVar.f4510c && Intrinsics.areEqual(this.f4509a, eVar.f4509a);
    }

    public final int hashCode() {
        int iHashCode = this.f4510c.hashCode() * 31;
        HashMap<String, Object> map = this.f4509a;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return "ExternalEvent(event=" + this.f4510c + ", data=" + this.f4509a + ")";
    }
}
