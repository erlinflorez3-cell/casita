package g;

import i1.close;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.PropertyReference0Impl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import v0.civilian;

/* JADX INFO: loaded from: classes4.dex */
public final class tongue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OkHttpClient f19651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final civilian f19652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l.tongue f19654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pair f19655f;

    /* JADX WARN: Type inference failed for: r0v0, types: [g.pair] */
    public tongue(String str, OkHttpClient okHttpClient, civilian civilianVar, String str2, l.tongue tongueVar) {
        ?? r02 = new PropertyReference0Impl() { // from class: g.pair
            {
                close closeVar = close.f19714a;
            }

            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public final Object get() {
                ((close) this.receiver).getClass();
                return close.a();
            }
        };
        this.f19650a = str;
        this.f19651b = okHttpClient;
        this.f19652c = civilianVar;
        this.f19653d = str2;
        this.f19654e = tongueVar;
        this.f19655f = r02;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0 A[Catch: all -> 0x012e, TryCatch #3 {all -> 0x012e, blocks: (B:30:0x00a7, B:32:0x00b0, B:35:0x00b8, B:36:0x00bc, B:37:0x00d6, B:39:0x00dc, B:40:0x00eb, B:42:0x00ef, B:46:0x0111, B:45:0x00fb, B:44:0x00f5), top: B:69:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8 A[Catch: all -> 0x012e, TryCatch #3 {all -> 0x012e, blocks: (B:30:0x00a7, B:32:0x00b0, B:35:0x00b8, B:36:0x00bc, B:37:0x00d6, B:39:0x00dc, B:40:0x00eb, B:42:0x00ef, B:46:0x0111, B:45:0x00fb, B:44:0x00f5), top: B:69:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc A[Catch: all -> 0x012e, LOOP:0: B:37:0x00d6->B:39:0x00dc, LOOP_END, TryCatch #3 {all -> 0x012e, blocks: (B:30:0x00a7, B:32:0x00b0, B:35:0x00b8, B:36:0x00bc, B:37:0x00d6, B:39:0x00dc, B:40:0x00eb, B:42:0x00ef, B:46:0x0111, B:45:0x00fb, B:44:0x00f5), top: B:69:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(k0.pair r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g.tongue.a(k0.pair, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Request.Builder a(Request.Builder builder, k0.pair pairVar) {
        try {
            String str = this.f19653d;
            String str2 = pairVar.f19831c;
            String str3 = pairVar.f19829a;
            for (Map.Entry entry : MapsKt.mapOf(TuplesKt.to("x-ma-bid", pairVar.f19832d), TuplesKt.to("x-ma-did", pairVar.f19833e), TuplesKt.to("x-ma-pid", str2), TuplesKt.to("x-ma-sid", str3), TuplesKt.to("x-ma-hostname", str)).entrySet()) {
                builder.header((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (IllegalStateException unused) {
        }
        return builder;
    }
}
