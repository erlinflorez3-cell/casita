package bo.app;

import com.braze.support.BrazeLogger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class fb0 {
    public Long A;
    public long B;
    public long C;
    public long D;
    public Map E;
    public boolean F;
    public int G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set f634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f640h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f641i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f642j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f643k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f644l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f645m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f646n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f647o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f648p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f649q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f650r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f651s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f652t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f653u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f654v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f655w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f656x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f657y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f658z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fb0() {
        this(0L, null, null, null, -1, -1, -1, false, false, false, -1L, false, false, -1, false, 86400L, true, 30, 30, false, -1L, ib0.b(), ib0.a(), 3, false, null, null, 0L, 0L, 0L, null, false, 0);
        int i2 = vb0.f2031e;
    }

    public fb0(long j2, Set set, Set set2, Set set3, int i2, int i3, int i4, boolean z2, boolean z3, boolean z4, long j3, boolean z5, boolean z6, int i5, boolean z7, long j4, boolean z8, int i6, int i7, boolean z9, long j5, int i8, int i9, int i10, boolean z10, String str, Long l2, long j6, long j7, long j8, Map map, boolean z11, int i11) {
        this.f633a = j2;
        this.f634b = set;
        this.f635c = set2;
        this.f636d = set3;
        this.f637e = i2;
        this.f638f = i3;
        this.f639g = i4;
        this.f640h = z2;
        this.f641i = z3;
        this.f642j = z4;
        this.f643k = j3;
        this.f644l = z5;
        this.f645m = z6;
        this.f646n = i5;
        this.f647o = z7;
        this.f648p = j4;
        this.f649q = z8;
        this.f650r = i6;
        this.f651s = i7;
        this.f652t = z9;
        this.f653u = j5;
        this.f654v = i8;
        this.f655w = i9;
        this.f656x = i10;
        this.f657y = z10;
        this.f658z = str;
        this.A = l2;
        this.B = j6;
        this.C = j7;
        this.D = j8;
        this.E = map;
        this.F = z11;
        this.G = i11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fb0(JSONObject configJson) {
        this();
        Intrinsics.checkNotNullParameter(configJson, "configJson");
        this.f633a = configJson.optLong("time", 0L);
        this.f643k = configJson.optLong("messaging_session_timeout", -1L);
        b(configJson);
        c(configJson);
        h(configJson);
        f(configJson);
        g(configJson);
        k(configJson);
        j(configJson);
        e(configJson);
        d(configJson);
        l(configJson);
        a(configJson);
    }

    public static HashSet a(String str, JSONObject jSONObject) {
        HashSet hashSet = new HashSet();
        if (jSONObject.has(str)) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
            Iterator it = jSONArrayOptJSONArray == null ? CollectionsKt.emptyList().iterator() : SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, jSONArrayOptJSONArray.length())), new db0(jSONArrayOptJSONArray)), new eb0(jSONArrayOptJSONArray)).iterator();
            while (it.hasNext()) {
                hashSet.add((String) it.next());
            }
        }
        return hashSet;
    }

    public final String a() {
        return this.f658z;
    }

    public final void a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("banners");
        if (jSONObjectOptJSONObject != null) {
            try {
                this.F = jSONObjectOptJSONObject.getBoolean("enabled");
                int i2 = jSONObjectOptJSONObject.getInt("max_placements");
                this.G = i2;
                if (!this.F || i2 > 0) {
                    return;
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new sa0(this), 7, (Object) null);
                }
            } catch (JSONException e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) ta0.f1826a, 4, (Object) null);
            }
            this.F = false;
            this.G = 0;
        }
    }

    public final void b(JSONObject jSONObject) {
        this.f634b = a("events_blacklist", jSONObject);
        this.f635c = a("attributes_blacklist", jSONObject);
        this.f636d = a("purchases_blacklist", jSONObject);
    }

    public final boolean b() {
        return this.f657y;
    }

    public final Long c() {
        return this.A;
    }

    public final void c(JSONObject jSONObject) {
        boolean z2;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("content_cards");
        if (jSONObjectOptJSONObject != null) {
            try {
                z2 = jSONObjectOptJSONObject.getBoolean("enabled");
            } catch (JSONException e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) ua0.f1928a, 4, (Object) null);
                z2 = false;
            }
            this.f642j = z2;
        }
    }

    public final long d() {
        return this.B;
    }

    public final void d(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("request_backoff");
        if (jSONObjectOptJSONObject != null) {
            this.f654v = jSONObjectOptJSONObject.optInt("min_sleep_duration_ms", this.f654v);
            this.f655w = jSONObjectOptJSONObject.optInt("max_sleep_duration_ms", this.f655w);
            this.f656x = jSONObjectOptJSONObject.optInt("scale_factor", this.f656x);
        }
    }

    public final long e() {
        return this.C;
    }

    public final void e(JSONObject jSONObject) {
        boolean z2;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("dust");
        if (jSONObjectOptJSONObject != null) {
            try {
                z2 = jSONObjectOptJSONObject.getBoolean("enabled");
            } catch (JSONException e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) va0.f2029a, 4, (Object) null);
                z2 = false;
            }
            this.f652t = z2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb0)) {
            return false;
        }
        fb0 fb0Var = (fb0) obj;
        return this.f633a == fb0Var.f633a && Intrinsics.areEqual(this.f634b, fb0Var.f634b) && Intrinsics.areEqual(this.f635c, fb0Var.f635c) && Intrinsics.areEqual(this.f636d, fb0Var.f636d) && this.f637e == fb0Var.f637e && this.f638f == fb0Var.f638f && this.f639g == fb0Var.f639g && this.f640h == fb0Var.f640h && this.f641i == fb0Var.f641i && this.f642j == fb0Var.f642j && this.f643k == fb0Var.f643k && this.f644l == fb0Var.f644l && this.f645m == fb0Var.f645m && this.f646n == fb0Var.f646n && this.f647o == fb0Var.f647o && this.f648p == fb0Var.f648p && this.f649q == fb0Var.f649q && this.f650r == fb0Var.f650r && this.f651s == fb0Var.f651s && this.f652t == fb0Var.f652t && this.f653u == fb0Var.f653u && this.f654v == fb0Var.f654v && this.f655w == fb0Var.f655w && this.f656x == fb0Var.f656x && this.f657y == fb0Var.f657y && Intrinsics.areEqual(this.f658z, fb0Var.f658z) && Intrinsics.areEqual(this.A, fb0Var.A) && this.B == fb0Var.B && this.C == fb0Var.C && this.D == fb0Var.D && Intrinsics.areEqual(this.E, fb0Var.E) && this.F == fb0Var.F && this.G == fb0Var.G;
    }

    public final long f() {
        return this.D;
    }

    public final void f(JSONObject jSONObject) {
        boolean z2;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ephemeral_events");
        if (jSONObjectOptJSONObject != null) {
            try {
                z2 = jSONObjectOptJSONObject.getBoolean("enabled");
            } catch (JSONException e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) wa0.f2125a, 4, (Object) null);
                z2 = false;
            }
            this.f644l = z2;
        }
    }

    public final void g(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("feature_flags");
        if (jSONObjectOptJSONObject != null) {
            try {
                this.f645m = jSONObjectOptJSONObject.optBoolean("enabled");
                this.f646n = jSONObjectOptJSONObject.getInt("refresh_rate_limit");
            } catch (JSONException e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) xa0.f2198a, 4, (Object) null);
                this.f645m = false;
            }
        }
    }

    public final void h(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("geofences");
        if (jSONObjectOptJSONObject != null) {
            try {
                this.f637e = jSONObjectOptJSONObject.getInt("min_time_since_last_request");
                this.f638f = jSONObjectOptJSONObject.getInt("min_time_since_last_report");
                this.f641i = jSONObjectOptJSONObject.getBoolean("enabled");
                this.f640h = true;
                this.f639g = jSONObjectOptJSONObject.optInt("max_num_to_register", 20);
            } catch (JSONException e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) ya0.f2293a, 4, (Object) null);
                this.f637e = -1;
                this.f638f = -1;
                this.f639g = -1;
                this.f641i = false;
                this.f640h = false;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v107 */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v23, types: [int] */
    /* JADX WARN: Type inference failed for: r0v25, types: [int] */
    /* JADX WARN: Type inference failed for: r0v30, types: [int] */
    /* JADX WARN: Type inference failed for: r0v32, types: [int] */
    /* JADX WARN: Type inference failed for: r0v37, types: [int] */
    /* JADX WARN: Type inference failed for: r0v42, types: [int] */
    /* JADX WARN: Type inference failed for: r0v50, types: [int] */
    /* JADX WARN: Type inference failed for: r0v64, types: [int] */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f633a) * 31;
        Set set = this.f634b;
        int iHashCode2 = (iHashCode + (set == null ? 0 : set.hashCode())) * 31;
        Set set2 = this.f635c;
        int iHashCode3 = (iHashCode2 + (set2 == null ? 0 : set2.hashCode())) * 31;
        Set set3 = this.f636d;
        int iHashCode4 = (Integer.hashCode(this.f639g) + ((Integer.hashCode(this.f638f) + ((Integer.hashCode(this.f637e) + ((iHashCode3 + (set3 == null ? 0 : set3.hashCode())) * 31)) * 31)) * 31)) * 31;
        boolean z2 = this.f640h;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int i2 = (iHashCode4 + r02) * 31;
        boolean z3 = this.f641i;
        ?? r03 = z3;
        if (z3) {
            r03 = 1;
        }
        int i3 = (i2 + r03) * 31;
        boolean z4 = this.f642j;
        ?? r04 = z4;
        if (z4) {
            r04 = 1;
        }
        int iHashCode5 = (Long.hashCode(this.f643k) + ((i3 + r04) * 31)) * 31;
        boolean z5 = this.f644l;
        ?? r05 = z5;
        if (z5) {
            r05 = 1;
        }
        int i4 = (iHashCode5 + r05) * 31;
        boolean z6 = this.f645m;
        ?? r06 = z6;
        if (z6) {
            r06 = 1;
        }
        int iHashCode6 = (Integer.hashCode(this.f646n) + ((i4 + r06) * 31)) * 31;
        boolean z7 = this.f647o;
        ?? r07 = z7;
        if (z7) {
            r07 = 1;
        }
        int iHashCode7 = (Long.hashCode(this.f648p) + ((iHashCode6 + r07) * 31)) * 31;
        boolean z8 = this.f649q;
        ?? r08 = z8;
        if (z8) {
            r08 = 1;
        }
        int iHashCode8 = (Integer.hashCode(this.f651s) + ((Integer.hashCode(this.f650r) + ((iHashCode7 + r08) * 31)) * 31)) * 31;
        boolean z9 = this.f652t;
        ?? r09 = z9;
        if (z9) {
            r09 = 1;
        }
        int iHashCode9 = (Integer.hashCode(this.f656x) + ((Integer.hashCode(this.f655w) + ((Integer.hashCode(this.f654v) + ((Long.hashCode(this.f653u) + ((iHashCode8 + r09) * 31)) * 31)) * 31)) * 31)) * 31;
        boolean z10 = this.f657y;
        ?? r010 = z10;
        if (z10) {
            r010 = 1;
        }
        int i5 = (iHashCode9 + r010) * 31;
        String str = this.f658z;
        int iHashCode10 = (i5 + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.A;
        int iHashCode11 = (Long.hashCode(this.D) + ((Long.hashCode(this.C) + ((Long.hashCode(this.B) + ((iHashCode10 + (l2 == null ? 0 : l2.hashCode())) * 31)) * 31)) * 31)) * 31;
        Map map = this.E;
        int iHashCode12 = (iHashCode11 + (map != null ? map.hashCode() : 0)) * 31;
        boolean z11 = this.F;
        return Integer.hashCode(this.G) + ((iHashCode12 + (z11 ? 1 : z11)) * 31);
    }

    public final void i(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("endpoint_overrides");
        if (jSONObjectOptJSONObject != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(itKeys, "endpointOverrides.keys()");
            while (itKeys.hasNext()) {
                String destinationSuffix = itKeys.next();
                j00 j00Var = k00.f1043b;
                Intrinsics.checkNotNullExpressionValue(destinationSuffix, "endpointSuffixPath");
                Intrinsics.checkNotNullParameter(destinationSuffix, "destinationSuffix");
                k00 k00Var = (k00) k00.f1044c.get(destinationSuffix);
                if (k00Var != null) {
                    JSONObject jSONObject2 = jSONObjectOptJSONObject.getJSONObject(destinationSuffix);
                    int i2 = jSONObject2.getInt("capacity");
                    int i3 = jSONObject2.getInt("refill_rate");
                    if (i2 > 0 && i3 > 0) {
                        linkedHashMap.put(k00Var, new ra0(i2, i3));
                    }
                }
            }
            if (linkedHashMap.isEmpty()) {
                return;
            }
            this.E = linkedHashMap;
        }
    }

    public final void j(JSONObject jSONObject) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("global_request_rate_limit");
            if (jSONObjectOptJSONObject != null) {
                if (!jSONObjectOptJSONObject.getBoolean("enabled")) {
                    this.f649q = false;
                    return;
                }
                int i2 = jSONObjectOptJSONObject.getInt("refill_rate");
                int i3 = jSONObjectOptJSONObject.getInt("capacity");
                if (i3 < 10) {
                    this.f649q = false;
                } else {
                    if (i2 <= 0) {
                        return;
                    }
                    this.f649q = true;
                    this.f651s = i3;
                    this.f650r = i2;
                    i(jSONObjectOptJSONObject);
                }
            }
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) za0.f2373a, 4, (Object) null);
            this.f649q = false;
            this.E = null;
        }
    }

    public final void k(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("push_max");
        if (jSONObjectOptJSONObject != null) {
            try {
                this.f647o = jSONObjectOptJSONObject.optBoolean("enabled");
                this.f648p = jSONObjectOptJSONObject.optLong("redeliver_buffer", 86400L);
                this.f653u = jSONObjectOptJSONObject.optLong("redeliver_dedupe_buffer", -1L);
            } catch (JSONException e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) ab0.f189a, 4, (Object) null);
                this.f647o = false;
                this.f648p = 0L;
                this.f653u = -1L;
            }
        }
    }

    public final void l(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("sdk_debugger");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        try {
            r90 r90VarA = w90.f2113k.a(jSONObjectOptJSONObject, false);
            if (r90VarA.f1655a) {
                this.f657y = true;
                this.f658z = r90VarA.f1657c;
                Long l2 = r90VarA.f1656b;
                if (l2 != null) {
                    this.A = Long.valueOf(l2.longValue());
                }
                this.B = r90VarA.f1658d;
                this.C = r90VarA.f1659e;
                this.D = r90VarA.f1660f;
            }
            String str = this.f658z;
            if (str != null && !StringsKt.isBlank(str) && this.B > 0 && this.C > 0 && this.D > 0) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new bb0(jSONObjectOptJSONObject), 7, (Object) null);
        } catch (JSONException e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) cb0.f331a, 4, (Object) null);
        }
        this.f657y = false;
        this.f658z = null;
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerConfig(configTime=");
        sb.append(this.f633a).append(", blocklistedEvents=").append(this.f634b).append(", blocklistedAttributes=").append(this.f635c).append(", blocklistedPurchases=").append(this.f636d).append(", minTimeSinceLastRequest=").append(this.f637e).append(", minTimeSinceLastReport=").append(this.f638f).append(", maxNumToRegister=").append(this.f639g).append(", geofencesEnabledSet=").append(this.f640h).append(", geofencesEnabled=").append(this.f641i).append(", isContentCardsFeatureEnabled=").append(this.f642j).append(", messagingSessionTimeout=").append(this.f643k).append(", ephemeralEventsEnabled=");
        sb.append(this.f644l).append(", featureFlagsEnabled=").append(this.f645m).append(", featureFlagsRefreshRateLimit=").append(this.f646n).append(", pushMaxEnabled=").append(this.f647o).append(", pushMaxRedeliverBuffer=").append(this.f648p).append(", globalRequestRateLimitEnabled=").append(this.f649q).append(", globalRequestRateLimitBucketRefillRate=").append(this.f650r).append(", globalRequestRateLimitBucketCapacity=").append(this.f651s).append(", isDustFeatureEnabled=").append(this.f652t).append(", pushMaxRedeliverDedupeBuffer=").append(this.f653u).append(", defaultBackoffMinSleepMs=").append(this.f654v).append(", defaultBackoffMaxSleepMs=").append(this.f655w);
        sb.append(", defaultBackoffScaleFactor=").append(this.f656x).append(", sdkDebuggerEnabled=").append(this.f657y).append(", sdkDebuggerAuthCode=").append(this.f658z).append(", sdkDebuggerExpirationTime=").append(this.A).append(", sdkDebuggerFlushIntervalBytes=").append(this.B).append(", sdkDebuggerFlushIntervalSeconds=").append(this.C).append(", sdkDebuggerMaxPayloadBytes=").append(this.D).append(", globalRequestRateLimitOverrides=").append(this.E).append(", bannersEnabled=").append(this.F).append(", maxBannerPlacements=").append(this.G).append(')');
        return sb.toString();
    }
}
