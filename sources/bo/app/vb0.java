package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.json.JSONArray;
import org.json.JSONObject;
import yg.C1561oA;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.Qg;
import yg.Wg;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public final class vb0 {

    /* JADX INFO: renamed from: e */
    public static final int f2031e = (int) TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: f */
    public static final int f2032f = (int) TimeUnit.MINUTES.toMillis(5);

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f2033a;

    /* JADX INFO: renamed from: b */
    public final ReentrantLock f2034b;

    /* JADX INFO: renamed from: c */
    public final Mutex f2035c;

    /* JADX INFO: renamed from: d */
    public fb0 f2036d;

    public vb0(Context context, String str) throws Throwable {
        Intrinsics.checkNotNullParameter(context, Wg.Zd("odQ|K\u00040", (short) (ZN.Xd() ^ 29870), (short) (ZN.Xd() ^ 22506)));
        Intrinsics.checkNotNullParameter(str, C1561oA.Xd("K[U8Sh", (short) (ZN.Xd() ^ 18696)));
        Object[] objArr = {ib0.a(str), 0};
        Method method = Class.forName(Wg.vd("\u0002\u000e\u0003\u0010\f\u0005~G{\u0007\u0005\ny\u0002\u0007?S~|\u0002q\u0004~", (short) (Od.Xd() ^ (-9451)))).getMethod(yg.hg.Vd(",)7\u0015)!1#!\f-\u001f\u001f\u001d)\u001b#\u0017\u0018%", (short) (OY.Xd() ^ 3359), (short) (OY.Xd() ^ 716)), Class.forName(Qg.kd("{q\u0006o;xlxp6Zzwmqi", (short) (ZN.Xd() ^ 22401), (short) (ZN.Xd() ^ 3717))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
            this.f2033a = sharedPreferences;
            this.f2034b = new ReentrantLock();
            this.f2035c = MutexKt.Mutex$default(false, 1, null);
            String strUd = C1561oA.ud("C7HH23434A@1/)<,2%;)55*/-", (short) (C1633zX.Xd() ^ (-10944)));
            String string = sharedPreferences.getString(strUd, "");
            String strYd = C1561oA.yd("\u0005\u0003}\u007f{|", (short) (FB.Xd() ^ 22508));
            if (!Intrinsics.areEqual(strYd, string)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new hb0(string), 6, (Object) null);
                sharedPreferences.edit().putLong(C1561oA.Yd("\f\u0019\u0019\u0012\u0016\u0015\u000e$\u001a\u001f\u0018", (short) (ZN.Xd() ^ 24660)), 0L).putString(strUd, strYd).apply();
            }
            F();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final boolean A() {
        ReentrantLock reentrantLock = this.f2034b;
        reentrantLock.lock();
        try {
            fb0 fb0Var = this.f2036d;
            return fb0Var != null ? fb0Var.f641i : this.f2033a.getBoolean("geofences_enabled", false);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean B() {
        ReentrantLock reentrantLock = this.f2034b;
        reentrantLock.lock();
        try {
            fb0 fb0Var = this.f2036d;
            return fb0Var != null ? fb0Var.f640h : this.f2033a.getBoolean("geofences_enabled_set", false);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean C() {
        ReentrantLock reentrantLock = this.f2034b;
        reentrantLock.lock();
        try {
            fb0 fb0Var = this.f2036d;
            return fb0Var != null ? fb0Var.f649q : this.f2033a.getBoolean("global_req_rate_limit_enabled", true);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean D() {
        ReentrantLock reentrantLock = this.f2034b;
        reentrantLock.lock();
        try {
            fb0 fb0Var = this.f2036d;
            return fb0Var != null ? fb0Var.f647o : this.f2033a.getBoolean("push_max_enabled", false);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean E() {
        ReentrantLock reentrantLock = this.f2034b;
        reentrantLock.lock();
        try {
            fb0 fb0Var = this.f2036d;
            return fb0Var != null ? fb0Var.f657y : this.f2033a.getBoolean("sdk_debugger_enabled", false);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void F() {
        Map mapQ;
        fb0 fb0Var = new fb0();
        fb0Var.f635c = a();
        fb0Var.f634b = b();
        fb0Var.f636d = c();
        fb0Var.f633a = d();
        fb0Var.f643k = l();
        fb0Var.f637e = n();
        fb0Var.f638f = m();
        fb0Var.f639g = k();
        fb0Var.f641i = A();
        fb0Var.f640h = B();
        fb0Var.f642j = w();
        fb0Var.f644l = y();
        fb0Var.f645m = z();
        fb0Var.f646n = h();
        fb0Var.f647o = D();
        fb0Var.f648p = o();
        fb0Var.f652t = x();
        fb0Var.f649q = C();
        fb0Var.f650r = j();
        fb0Var.f651s = i();
        fb0Var.f653u = p();
        fb0Var.f656x = g();
        fb0Var.f654v = f();
        fb0Var.f655w = e();
        fb0Var.f657y = E();
        fb0Var.f658z = r();
        fb0Var.B = t();
        fb0Var.C = u();
        fb0Var.D = v();
        fb0Var.A = Long.valueOf(s());
        ReentrantLock reentrantLock = this.f2034b;
        reentrantLock.lock();
        try {
            fb0 fb0Var2 = this.f2036d;
            if (fb0Var2 == null || (mapQ = fb0Var2.E) == null) {
                mapQ = q();
            }
            reentrantLock.unlock();
            fb0Var.E = mapQ;
            reentrantLock = this.f2034b;
            reentrantLock.lock();
            try {
                fb0 fb0Var3 = this.f2036d;
                boolean z2 = fb0Var3 != null ? fb0Var3.F : this.f2033a.getBoolean("banners_enabled", false);
                reentrantLock.unlock();
                fb0Var.F = z2;
                reentrantLock = this.f2034b;
                reentrantLock.lock();
                try {
                    fb0 fb0Var4 = this.f2036d;
                    int i2 = fb0Var4 != null ? fb0Var4.G : this.f2033a.getInt("max_banner_placements", 0);
                    reentrantLock.unlock();
                    fb0Var.G = i2;
                    this.f2034b.lock();
                    try {
                        this.f2036d = fb0Var;
                        Unit unit = Unit.INSTANCE;
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final HashSet a(String str) {
        try {
            String string = this.f2033a.getString(str, "");
            HashSet hashSet = new HashSet();
            if (string != null && !StringsKt.isBlank(string)) {
                JSONArray jSONArray = new JSONArray(string);
                Iterator it = SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, jSONArray.length())), new lb0(jSONArray)), new mb0(jSONArray)).iterator();
                while (it.hasNext()) {
                    hashSet.add((String) it.next());
                }
                return hashSet;
            }
            return hashSet;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) nb0.f1353a, 4, (Object) null);
            return new HashSet();
        }
    }

    public final Set a() {
        Set setA;
        ReentrantLock reentrantLock = this.f2034b;
        reentrantLock.lock();
        try {
            fb0 fb0Var = this.f2036d;
            if (fb0Var == null || (setA = fb0Var.f635c) == null) {
                setA = a("blacklisted_attributes");
            }
            return setA;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a(fb0 serverConfig) {
        Intrinsics.checkNotNullParameter(serverConfig, "serverConfig");
        ReentrantLock reentrantLock = this.f2034b;
        reentrantLock.lock();
        try {
            this.f2036d = serverConfig;
            Unit unit = Unit.INSTANCE;
            try {
                SharedPreferences.Editor editorEdit = this.f2033a.edit();
                if (serverConfig.f634b != null) {
                    editorEdit.putString("blacklisted_events", new JSONArray((Collection) serverConfig.f634b).toString());
                }
                if (serverConfig.f635c != null) {
                    editorEdit.putString("blacklisted_attributes", new JSONArray((Collection) serverConfig.f635c).toString());
                }
                if (serverConfig.f636d != null) {
                    editorEdit.putString("blacklisted_purchases", new JSONArray((Collection) serverConfig.f636d).toString());
                }
                Map map = serverConfig.E;
                if (map != null) {
                    JSONObject jSONObject = new JSONObject();
                    for (k00 k00Var : map.keySet()) {
                        ra0 ra0Var = (ra0) map.get(k00Var);
                        if (ra0Var != null) {
                            jSONObject.put(k00Var.name(), new JSONObject().put("refill", ra0Var.f1663b).put("capacity", ra0Var.f1662a));
                        }
                    }
                    editorEdit.putString("global_req_rate_limit_endpoint_overrides", jSONObject.toString());
                }
                editorEdit.putLong("config_time", serverConfig.f633a).putInt("geofences_min_time_since_last_request", serverConfig.f637e).putInt("geofences_min_time_since_last_report", serverConfig.f638f).putInt("geofences_max_num_to_register", serverConfig.f639g).putBoolean("geofences_enabled", serverConfig.f641i).putBoolean("geofences_enabled_set", serverConfig.f640h).putLong("messaging_session_timeout", serverConfig.f643k).putBoolean("ephemeral_events_enabled", serverConfig.f644l).putBoolean("feature_flags_enabled", serverConfig.f645m).putInt("feature_flags_refresh_rate_limit", serverConfig.f646n).putBoolean("content_cards_enabled", serverConfig.f642j).putBoolean("push_max_enabled", serverConfig.f647o).putLong("push_max_redeliver_buffer", serverConfig.f648p).putBoolean("dust_enabled", serverConfig.f652t).putBoolean("global_req_rate_limit_enabled", serverConfig.f649q).putInt("global_req_rate_capacity", serverConfig.f651s).putInt("global_req_rate_refill_rate", serverConfig.f650r).putLong("push_max_redeliver_dedupe_buffer", serverConfig.f653u).putInt("default_backoff_scale_factor", serverConfig.f656x).putInt("default_backoff_min_sleep_duration__ms", serverConfig.f654v).putInt("default_backoff_max_sleep_duration_ms", serverConfig.f655w).putBoolean("sdk_debugger_enabled", serverConfig.f657y).putString("sdk_debugger_authorization_code", serverConfig.f658z).putLong("sdk_debugger_flush_interval_bytes", serverConfig.B).putLong("sdk_debugger_flush_interval_seconds", serverConfig.C).putLong("sdk_debugger_max_payload_bytes", serverConfig.D).putBoolean("banners_enabled", serverConfig.F).putInt("max_banner_placements", serverConfig.G);
                Long l2 = serverConfig.A;
                if (l2 != null) {
                    editorEdit.putLong("sdk_debugger_expiration_time", l2.longValue());
                }
                editorEdit.apply();
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) tb0.f1828a, 4, (Object) null);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new ub0(serverConfig), 6, (Object) null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a(r90 sdkDebugConfig) {
        Intrinsics.checkNotNullParameter(sdkDebugConfig, "sdkDebugConfig");
        ReentrantLock reentrantLock = this.f2034b;
        reentrantLock.lock();
        try {
            fb0 fb0Var = this.f2036d;
            if (fb0Var != null) {
                fb0Var.f657y = sdkDebugConfig.f1655a;
            }
            if (fb0Var != null) {
                fb0Var.B = sdkDebugConfig.f1658d;
            }
            if (fb0Var != null) {
                fb0Var.C = sdkDebugConfig.f1659e;
            }
            if (fb0Var != null) {
                fb0Var.D = sdkDebugConfig.f1660f;
            }
            String str = sdkDebugConfig.f1657c;
            if (str != null && fb0Var != null) {
                fb0Var.f658z = str;
            }
            Long l2 = sdkDebugConfig.f1656b;
            if (l2 != null) {
                long jLongValue = l2.longValue();
                fb0 fb0Var2 = this.f2036d;
                if (fb0Var2 != null) {
                    fb0Var2.A = Long.valueOf(jLongValue);
                }
                Unit unit = Unit.INSTANCE;
            }
            try {
                fb0 fb0Var3 = this.f2036d;
                if (fb0Var3 != null) {
                    SharedPreferences.Editor editorEdit = this.f2033a.edit();
                    editorEdit.putBoolean("sdk_debugger_enabled", fb0Var3.f657y).putString("sdk_debugger_authorization_code", fb0Var3.f658z).putLong("sdk_debugger_flush_interval_bytes", fb0Var3.B).putLong("sdk_debugger_flush_interval_seconds", fb0Var3.C).putLong("sdk_debugger_max_payload_bytes", fb0Var3.D);
                    Long l3 = fb0Var3.A;
                    if (l3 != null) {
                        editorEdit.putLong("sdk_debugger_expiration_time", l3.longValue());
                    }
                    editorEdit.apply();
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) rb0.f1665a, 4, (Object) null);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new sb0(this), 6, (Object) null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Set b() {
        Set setA;
        ReentrantLock reentrantLock = this.f2034b;
        reentrantLock.lock();
        try {
            fb0 fb0Var = this.f2036d;
            if (fb0Var == null || (setA = fb0Var.f634b) == null) {
                setA = a("blacklisted_events");
            }
            return setA;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Set c() {
        Set setA;
        ReentrantLock reentrantLock = this.f2034b;
        reentrantLock.lock();
        try {
            fb0 fb0Var = this.f2036d;
            if (fb0Var == null || (setA = fb0Var.f636d) == null) {
                setA = a("blacklisted_purchases");
            }
            return setA;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long d() {
        ReentrantLock reentrantLock = this.f2034b;
        reentrantLock.lock();
        try {
            fb0 fb0Var = this.f2036d;
            return fb0Var != null ? fb0Var.f633a : this.f2033a.getLong("config_time", 0L);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int e() {
        ReentrantLock reentrantLock = this.f2034b;
        reentrantLock.lock();
        try {
            fb0 fb0Var = this.f2036d;
            return fb0Var != null ? fb0Var.f655w : this.f2033a.getInt("default_backoff_max_sleep_duration_ms", f2032f);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int f() {
        ReentrantLock reentrantLock = this.f2034b;
        reentrantLock.lock();
        try {
            fb0 fb0Var = this.f2036d;
            return fb0Var != null ? fb0Var.f654v : this.f2033a.getInt("default_backoff_min_sleep_duration__ms", f2031e);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int g() {
        ReentrantLock reentrantLock = this.f2034b;
        reentrantLock.lock();
        try {
            fb0 fb0Var = this.f2036d;
            return fb0Var != null ? fb0Var.f656x : this.f2033a.getInt("default_backoff_scale_factor", 3);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int h() {
        ReentrantLock reentrantLock = this.f2034b;
        reentrantLock.lock();
        try {
            fb0 fb0Var = this.f2036d;
            return fb0Var != null ? fb0Var.f646n : this.f2033a.getInt("feature_flags_refresh_rate_limit", -1);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int i() {
        ReentrantLock reentrantLock = this.f2034b;
        reentrantLock.lock();
        try {
            fb0 fb0Var = this.f2036d;
            return fb0Var != null ? fb0Var.f651s : this.f2033a.getInt("global_req_rate_capacity", 30);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int j() {
        ReentrantLock reentrantLock = this.f2034b;
        reentrantLock.lock();
        try {
            fb0 fb0Var = this.f2036d;
            return fb0Var != null ? fb0Var.f650r : this.f2033a.getInt("global_req_rate_refill_rate", 30);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int k() {
        ReentrantLock reentrantLock = this.f2034b;
        reentrantLock.lock();
        try {
            fb0 fb0Var = this.f2036d;
            return fb0Var != null ? fb0Var.f639g : this.f2033a.getInt("geofences_max_num_to_register", -1);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long l() {
        ReentrantLock reentrantLock = this.f2034b;
        reentrantLock.lock();
        try {
            fb0 fb0Var = this.f2036d;
            return fb0Var != null ? fb0Var.f643k : this.f2033a.getLong("messaging_session_timeout", -1L);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int m() {
        ReentrantLock reentrantLock = this.f2034b;
        reentrantLock.lock();
        try {
            fb0 fb0Var = this.f2036d;
            return fb0Var != null ? fb0Var.f638f : this.f2033a.getInt("geofences_min_time_since_last_report", -1);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int n() {
        ReentrantLock reentrantLock = this.f2034b;
        reentrantLock.lock();
        try {
            fb0 fb0Var = this.f2036d;
            return fb0Var != null ? fb0Var.f637e : this.f2033a.getInt("geofences_min_time_since_last_request", -1);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long o() {
        ReentrantLock reentrantLock = this.f2034b;
        reentrantLock.lock();
        try {
            fb0 fb0Var = this.f2036d;
            return fb0Var != null ? fb0Var.f648p : this.f2033a.getLong("push_max_redeliver_buffer", 86400L);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long p() {
        ReentrantLock reentrantLock = this.f2034b;
        reentrantLock.lock();
        try {
            fb0 fb0Var = this.f2036d;
            return fb0Var != null ? fb0Var.f653u : this.f2033a.getLong("push_max_redeliver_dedupe_buffer", -1L);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final LinkedHashMap q() {
        String string;
        k00 k00VarValueOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            string = this.f2033a.getString("global_req_rate_limit_endpoint_overrides", "");
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) ob0.f1434a, 4, (Object) null);
        }
        if (string != null && string.length() != 0) {
            JSONObject jSONObject = new JSONObject(string);
            Iterator<String> itKeys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(itKeys, "json.keys()");
            while (itKeys.hasNext()) {
                String name = itKeys.next();
                j00 j00Var = k00.f1043b;
                Intrinsics.checkNotNullExpressionValue(name, "destKey");
                Intrinsics.checkNotNullParameter(name, "name");
                try {
                    k00VarValueOf = k00.valueOf(name);
                } catch (Exception e3) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) j00Var, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) new i00(name), 4, (Object) null);
                    k00VarValueOf = null;
                }
                if (k00VarValueOf != null) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(name);
                    linkedHashMap.put(k00VarValueOf, new ra0(jSONObject2.getInt("capacity"), jSONObject2.getInt("refill")));
                }
            }
            return linkedHashMap;
        }
        return linkedHashMap;
    }

    public final String r() {
        String string;
        ReentrantLock reentrantLock = this.f2034b;
        reentrantLock.lock();
        try {
            fb0 fb0Var = this.f2036d;
            if (fb0Var == null || (string = fb0Var.f658z) == null) {
                string = this.f2033a.getString("sdk_debugger_authorization_code", null);
            }
            return string;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long s() {
        Long l2;
        ReentrantLock reentrantLock = this.f2034b;
        reentrantLock.lock();
        try {
            fb0 fb0Var = this.f2036d;
            return (fb0Var == null || (l2 = fb0Var.A) == null) ? this.f2033a.getLong("sdk_debugger_expiration_time", -1L) : l2.longValue();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long t() {
        ReentrantLock reentrantLock = this.f2034b;
        reentrantLock.lock();
        try {
            fb0 fb0Var = this.f2036d;
            return fb0Var != null ? fb0Var.B : this.f2033a.getLong("sdk_debugger_flush_interval_bytes", 0L);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long u() {
        ReentrantLock reentrantLock = this.f2034b;
        reentrantLock.lock();
        try {
            fb0 fb0Var = this.f2036d;
            return fb0Var != null ? fb0Var.C : this.f2033a.getLong("sdk_debugger_flush_interval_seconds", 0L);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long v() {
        ReentrantLock reentrantLock = this.f2034b;
        reentrantLock.lock();
        try {
            fb0 fb0Var = this.f2036d;
            return fb0Var != null ? fb0Var.D : this.f2033a.getLong("sdk_debugger_max_payload_bytes", 0L);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean w() {
        ReentrantLock reentrantLock = this.f2034b;
        reentrantLock.lock();
        try {
            fb0 fb0Var = this.f2036d;
            return fb0Var != null ? fb0Var.f642j : this.f2033a.getBoolean("content_cards_enabled", false);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean x() {
        ReentrantLock reentrantLock = this.f2034b;
        reentrantLock.lock();
        try {
            fb0 fb0Var = this.f2036d;
            return fb0Var != null ? fb0Var.f652t : this.f2033a.getBoolean("dust_enabled", false);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean y() {
        ReentrantLock reentrantLock = this.f2034b;
        reentrantLock.lock();
        try {
            fb0 fb0Var = this.f2036d;
            return fb0Var != null ? fb0Var.f644l : this.f2033a.getBoolean("ephemeral_events_enabled", false);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean z() {
        ReentrantLock reentrantLock = this.f2034b;
        reentrantLock.lock();
        try {
            fb0 fb0Var = this.f2036d;
            return fb0Var != null ? fb0Var.f645m : this.f2033a.getBoolean("feature_flags_enabled", false);
        } finally {
            reentrantLock.unlock();
        }
    }
}
