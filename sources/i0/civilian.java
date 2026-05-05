package i0;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class civilian implements Map, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public final String f19689a;

    /* JADX INFO: renamed from: b */
    public final String f19690b;

    /* JADX INFO: renamed from: c */
    public final String f19691c;

    /* JADX INFO: renamed from: d */
    public final String f19692d;

    /* JADX INFO: renamed from: e */
    public final String f19693e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Map f19694f;

    public civilian(String str, String str2, String str3, String str4, String str5) {
        this.f19689a = str;
        this.f19690b = str2;
        this.f19691c = str3;
        this.f19692d = str4;
        this.f19693e = str5;
        this.f19694f = MapsKt.mapOf(TuplesKt.to("x-ma-bid", str3), TuplesKt.to("x-ma-did", str4), TuplesKt.to("x-ma-pid", str), TuplesKt.to("x-ma-sid", str2), TuplesKt.to("x-ma-hostname", str5));
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f19694f.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f19694f.containsValue((String) obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f19694f.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof civilian)) {
            return false;
        }
        civilian civilianVar = (civilian) obj;
        return Intrinsics.areEqual(this.f19689a, civilianVar.f19689a) && Intrinsics.areEqual(this.f19690b, civilianVar.f19690b) && Intrinsics.areEqual(this.f19691c, civilianVar.f19691c) && Intrinsics.areEqual(this.f19692d, civilianVar.f19692d) && Intrinsics.areEqual(this.f19693e, civilianVar.f19693e);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (String) this.f19694f.get((String) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f19693e.hashCode() + d0.superior.a(this.f19692d, d0.superior.a(this.f19691c, d0.superior.a(this.f19690b, this.f19689a.hashCode() * 31, 31), 31), 31);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f19694f.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f19694f.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f19694f.size();
    }

    public final String toString() {
        return "Headers(eventId=" + this.f19689a + ", sessionId=" + this.f19690b + ", browserId=" + this.f19691c + ", deviceId=" + this.f19692d + ", applicationHostname=" + this.f19693e + ")";
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f19694f.values();
    }
}
