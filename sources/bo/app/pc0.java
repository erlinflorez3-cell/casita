package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.Xg;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public final class pc0 implements f00 {

    /* JADX INFO: renamed from: a */
    public boolean f1505a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f1506b;

    public pc0(Context context, String str, String str2) throws Throwable {
        Intrinsics.checkNotNullParameter(context, C1561oA.Yd("jww~p\u0005\u0002", (short) (C1633zX.Xd() ^ (-26216))));
        Object[] objArr = {Xg.qd("v\u0004\u0003Dx\t\n|\u000b\u0016K\u0012\u0014\u0010\u0014\u0004\u000b\nS\b\u0018\u0019\f\u001a%\f\u0013%\u0015\u001f&\u0012')%)\u0019 \u001f", (short) (C1607wl.Xd() ^ 10930), (short) (C1607wl.Xd() ^ 14245)) + StringUtils.getCacheFileSuffix(context, str, str2), 0};
        Method method = Class.forName(Jg.Wd("\fW\u0010\u001c\u001cT\u0019a\u0018b$($K3\u000f\u0002P6^.c=", (short) (FB.Xd() ^ 1766), (short) (FB.Xd() ^ 11115))).getMethod(C1626yg.Ud("+\u0017(\u0010;4OGHQw,)'c}pO~]", (short) (FB.Xd() ^ 23302), (short) (FB.Xd() ^ 15490)), Class.forName(ZO.xd("{\ba\u0010qy}*d-G.4\u001ad2", (short) (C1607wl.Xd() ^ 821), (short) (C1607wl.Xd() ^ 12222))), Integer.TYPE);
        try {
            method.setAccessible(true);
            this.f1506b = (SharedPreferences) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [T, java.lang.String] */
    @Override // bo.app.f00
    public final Collection a() {
        if (this.f1505a) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) kc0.f1100a, 6, (Object) null);
            return CollectionsKt.emptyList();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Map<String, ?> all = this.f1506b.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "prefs.all");
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String uniqueIdentifier = entry.getKey();
            Object value = entry.getValue();
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            try {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.String");
                objectRef.element = (String) value;
                z9 z9Var = ba.f257g;
                String serializedEvent = (String) value;
                Intrinsics.checkNotNullExpressionValue(uniqueIdentifier, "eventId");
                z9Var.getClass();
                Intrinsics.checkNotNullParameter(serializedEvent, "serializedEvent");
                Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
                e00 e00VarA = z9Var.a(new t8(serializedEvent, uniqueIdentifier));
                if (e00VarA != null) {
                    linkedHashSet.add(e00VarA);
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new lc0(uniqueIdentifier, objectRef), 4, (Object) null);
                SharedPreferences.Editor editorEdit = this.f1506b.edit();
                editorEdit.remove(uniqueIdentifier);
                editorEdit.apply();
            }
        }
        return linkedHashSet;
    }

    @Override // bo.app.f00
    public final void a(e00 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f1505a) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new ic0(event), 6, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new jc0(event), 7, (Object) null);
        SharedPreferences.Editor editorEdit = this.f1506b.edit();
        ba baVar = (ba) event;
        String str = baVar.f262d;
        event.getClass();
        String string = baVar.forJsonPut().toString();
        Intrinsics.checkNotNullExpressionValue(string, "forJsonPut().toString()");
        editorEdit.putString(str, string).apply();
    }

    @Override // bo.app.f00
    public final void a(Set events) {
        Intrinsics.checkNotNullParameter(events, "events");
        if (this.f1505a) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new nc0(events), 6, (Object) null);
            return;
        }
        SharedPreferences.Editor editorEdit = this.f1506b.edit();
        Iterator it = events.iterator();
        while (it.hasNext()) {
            String str = ((ba) ((e00) it.next())).f262d;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new oc0(str), 7, (Object) null);
            editorEdit.remove(str);
        }
        editorEdit.apply();
    }

    @Override // bo.app.f00
    public final void close() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) mc0.f1276a, 6, (Object) null);
        this.f1505a = true;
    }
}
