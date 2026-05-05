package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IEventSubscriber;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public final class cg0 implements h10 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f346p = TimeUnit.SECONDS.toMillis(30);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f347q = BrazeLogger.getBrazeLogTag((Class<?>) cg0.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h00 f349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v00 f350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v00 f351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SharedPreferences f353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final re0 f354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zg0 f355h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f356i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Queue f357j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f358k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f359l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile long f360m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ReentrantLock f361n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ReentrantLock f362o;

    public cg0(Context context, h00 h00Var, vw vwVar, v00 v00Var, BrazeConfigurationProvider brazeConfigurationProvider, String str, String str2) throws Throwable {
        Intrinsics.checkNotNullParameter(context, C1561oA.od("#.,1!3.", (short) (C1633zX.Xd() ^ (-12221))));
        Intrinsics.checkNotNullParameter(h00Var, C1561oA.Kd("\u0010!\u0011+\u0017\u007f\u0015#\u0017\u001e\u001d+", (short) (ZN.Xd() ^ 24934)));
        short sXd = (short) (C1499aX.Xd() ^ (-1655));
        short sXd2 = (short) (C1499aX.Xd() ^ (-9519));
        int[] iArr = new int["@O\bA\tAv:MCdu6N6\\!b\u001f\\\u0014]".length()];
        QB qb = new QB("@O\bA\tAv:MCdu6N6\\!b\u001f\\\u0014]");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(vwVar, new String(iArr, 0, i2));
        short sXd3 = (short) (C1607wl.Xd() ^ 12601);
        int[] iArr2 = new int["\u000f# \u0012 \u001d\u0011\u001dv)\u0019#*\u0007-\u001b&$/%#1".length()];
        QB qb2 = new QB("\u000f# \u0012 \u001d\u0011\u001dv)\u0019#*\u0007-\u001b&$/%#1");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i3));
            i3++;
        }
        Intrinsics.checkNotNullParameter(v00Var, new String(iArr2, 0, i3));
        Intrinsics.checkNotNullParameter(brazeConfigurationProvider, Wg.vd("\r\u0018\u0016\r\u0017\u0014!\u001d\u0013%\u0019\u001e$\u0005&\"\u0010\u0002{{\u0010", (short) (C1499aX.Xd() ^ (-4992))));
        Intrinsics.checkNotNullParameter(str2, Qg.kd("{\n\u0002b{\u000f", (short) (C1607wl.Xd() ^ 1657), (short) (C1607wl.Xd() ^ 16213)));
        this.f361n = new ReentrantLock();
        this.f362o = new ReentrantLock();
        short sXd4 = (short) (Od.Xd() ^ (-30588));
        short sXd5 = (short) (Od.Xd() ^ (-7059));
        int[] iArr3 = new int["<H=JF?9\u00026A?D4<Ay\u000e97<,>9".length()];
        QB qb3 = new QB("<H=JF?9\u00026A?D4<Ay\u000e97<,>9");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(sXd4 + i4 + xuXd3.CK(iKK3) + sXd5);
            i4++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr3, 0, i4)).getMethod(C1561oA.ud("C@N\u001aHGB>74F:?=\u0011<:?/A<", (short) (C1580rY.Xd() ^ (-20339))), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            Intrinsics.checkNotNullExpressionValue(context2, C1561oA.yd(":EGL8JI\u00020>A<4-.@PUW+RPYIWR", (short) (C1580rY.Xd() ^ (-26612))));
            this.f348a = context2;
            this.f349b = h00Var;
            this.f350c = vwVar;
            this.f351d = v00Var;
            this.f352e = brazeConfigurationProvider.getTriggerActionMinimumTimeIntervalInSeconds();
            String str3 = C1561oA.Yd("|\n\tJ~\u000f\u0010\u0003\u0011\u001cQ\u0018\u001a\u0016\u001a\n\u0011\u0010Y! \u0018\u0017\u0018\u0017%'b\u0017\u001a,\"))/", (short) (FB.Xd() ^ 11627)) + StringUtils.getCacheFileSuffix(context, str, str2);
            short sXd6 = (short) (Od.Xd() ^ (-2861));
            short sXd7 = (short) (Od.Xd() ^ (-31060));
            int[] iArr4 = new int["\u000b\u0019\u0010\u001f\u001d\u0018\u0014^\u0015\"\")\u001b%,f|**1#74".length()];
            QB qb4 = new QB("\u000b\u0019\u0010\u001f\u001d\u0018\u0014^\u0015\"\")\u001b%,f|**1#74");
            int i5 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i5] = xuXd4.fK((xuXd4.CK(iKK4) - (sXd6 + i5)) + sXd7);
                i5++;
            }
            Class<?> cls = Class.forName(new String(iArr4, 0, i5));
            Class<?>[] clsArr = new Class[2];
            short sXd8 = (short) (ZN.Xd() ^ 23237);
            short sXd9 = (short) (ZN.Xd() ^ 6540);
            int[] iArr5 = new int["i2\u001aGj\u000bR&\u0002*&\nZ7\u000fJ".length()];
            QB qb5 = new QB("i2\u001aGj\u000bR&\u0002*&\nZ7\u000fJ");
            int i6 = 0;
            while (qb5.YK()) {
                int iKK5 = qb5.KK();
                Xu xuXd5 = Xu.Xd(iKK5);
                iArr5[i6] = xuXd5.fK(xuXd5.CK(iKK5) - ((i6 * sXd9) ^ sXd8));
                i6++;
            }
            clsArr[0] = Class.forName(new String(iArr5, 0, i6));
            clsArr[1] = Integer.TYPE;
            Object[] objArr2 = {str3, 0};
            Method method2 = cls.getMethod(ZO.xd("h+1mw\u0012)_\u001d6%#@\\qXj\n\nv", (short) (C1633zX.Xd() ^ (-26058)), (short) (C1633zX.Xd() ^ (-29680))), clsArr);
            try {
                method2.setAccessible(true);
                SharedPreferences sharedPreferences = (SharedPreferences) method2.invoke(context, objArr2);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences, C1626yg.Ud("ydG1H\u001dZTNJ\u0015:\u0012SF@FkPzX\u001b\u0001B\u0af5\u000bnu{pbN\f@\u000f9\u0011Nb\u0018Kdqh\u0001c\u001cR]V", (short) (C1633zX.Xd() ^ (-18862)), (short) (C1633zX.Xd() ^ (-9823))));
                this.f353f = sharedPreferences;
                this.f354g = new re0(context, str2);
                this.f355h = new zg0(context, str, str2);
                this.f358k = c();
                this.f356i = new AtomicInteger(0);
                this.f357j = new ArrayDeque();
                d();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static final void a(cg0 this$0, te0 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.f356i.decrementAndGet();
        this$0.a();
    }

    public static final void a(cg0 this$0, ue0 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.f356i.incrementAndGet();
    }

    public final void a() {
        ReentrantLock reentrantLock = this.f362o;
        reentrantLock.lock();
        try {
            if (this.f356i.get() > 0) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f347q, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) ef0.f571a, 14, (Object) null);
            while (!this.f357j.isEmpty()) {
                g10 g10Var = (g10) this.f357j.poll();
                if (g10Var != null) {
                    Intrinsics.checkNotNullExpressionValue(g10Var, "poll()");
                    a(g10Var);
                }
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v9, types: [T, bo.app.bh0, bo.app.k10, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(g10 event) {
        k10 action;
        Intrinsics.checkNotNullParameter(event, "triggerEvent");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f347q, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ff0(event), 14, (Object) null);
        Intrinsics.checkNotNullParameter(event, "event");
        ReentrantLock reentrantLock = this.f361n;
        reentrantLock.lock();
        try {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f358k.values().iterator();
            int i2 = Integer.MIN_VALUE;
            while (it.hasNext()) {
                ?? r7 = (bh0) ((k10) it.next());
                if (r7.b(event) && this.f355h.a(r7) && df0.a(event, r7, this.f360m, this.f352e)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f347q, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new hf0(r7), 14, (Object) null);
                    int i3 = r7.f281b.f731c;
                    if (i3 > i2) {
                        objectRef.element = r7;
                        i2 = i3;
                    }
                    arrayList.add(r7);
                }
            }
            Object obj = objectRef.element;
            if (obj == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f347q, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new if0(event), 14, (Object) null);
                reentrantLock.unlock();
                action = null;
            } else {
                arrayList.remove(obj);
                ((bh0) ((k10) objectRef.element)).f283d = new dg0(arrayList);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f347q, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new jf0(event, objectRef), 14, (Object) null);
                action = (k10) objectRef.element;
            }
            if (action != null) {
                Intrinsics.checkNotNullParameter(event, "event");
                Intrinsics.checkNotNullParameter(action, "action");
                Map remoteAssetToLocalAssetPaths = this.f354g.a(action);
                Intrinsics.checkNotNullParameter(remoteAssetToLocalAssetPaths, "remoteAssetToLocalAssetPaths");
                ((dh0) action).f494f = new HashMap(remoteAssetToLocalAssetPaths);
                int i4 = ((bh0) action).f281b.f733e;
                long j2 = i4 != -1 ? ((we0) event).f2140b + ((long) i4) : -1L;
                long millis = TimeUnit.SECONDS.toMillis(r6.f732d);
                BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(millis), null, new mf0(action, this, event, j2, millis, null), 2, null);
                return;
            }
            String strA = event.a();
            int iHashCode = strA.hashCode();
            if (iHashCode != 3417674) {
                if (iHashCode != 717572172) {
                    if (iHashCode != 1743324417 || !strA.equals("purchase")) {
                        return;
                    }
                } else if (!strA.equals("custom_event")) {
                    return;
                }
            } else if (!strA.equals("open")) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new gf0(event), 7, (Object) null);
            v00 v00Var = this.f351d;
            String strA2 = event.a();
            Intrinsics.checkNotNullExpressionValue(strA2, "triggerEvent.triggerEventType");
            ((vw) v00Var).b(NoMatchingTriggerEvent.class, new NoMatchingTriggerEvent(strA2));
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a(g10 triggerEvent, k10 failedAction) {
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        Intrinsics.checkNotNullParameter(failedAction, "failedAction");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        String str = f347q;
        BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new vf0(failedAction), 14, (Object) null);
        dg0 dg0Var = ((bh0) failedAction).f283d;
        if (dg0Var == null) {
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) wf0.f2143a, 14, (Object) null);
            return;
        }
        k10 k10Var = (k10) dg0Var.f490a.poll();
        if (k10Var == null) {
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) xf0.f2210a, 14, (Object) null);
            return;
        }
        bh0 bh0Var = (bh0) k10Var;
        bh0Var.f283d = dg0Var;
        Map remoteAssetToLocalAssetPaths = this.f354g.a(k10Var);
        Intrinsics.checkNotNullParameter(remoteAssetToLocalAssetPaths, "remoteAssetToLocalAssetPaths");
        ((dh0) k10Var).f494f = new HashMap(remoteAssetToLocalAssetPaths);
        long j2 = ((we0) triggerEvent).f2140b;
        long j3 = bh0Var.f281b.f733e;
        long millis = TimeUnit.SECONDS.toMillis(r2.f732d);
        long j4 = j3 != -1 ? j3 + j2 : j2 + millis + f346p;
        if (j4 < DateTimeUtils.nowInMilliseconds()) {
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new yf0(k10Var), 14, (Object) null);
            a(triggerEvent, k10Var);
        } else {
            long jMax = Math.max(0L, (millis + j2) - DateTimeUtils.nowInMilliseconds());
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zf0(k10Var, jMax), 14, (Object) null);
            BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(jMax), null, new ag0(k10Var, this, triggerEvent, j4, null), 2, null);
        }
    }

    public final void a(List triggeredActions) {
        Intrinsics.checkNotNullParameter(triggeredActions, "triggeredActions");
        od0 od0Var = new od0();
        ReentrantLock reentrantLock = this.f361n;
        reentrantLock.lock();
        try {
            this.f358k.clear();
            SharedPreferences.Editor editorClear = this.f353f.edit().clear();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f347q, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new of0(triggeredActions), 14, (Object) null);
            Iterator it = triggeredActions.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                k10 k10Var = (k10) it.next();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f347q, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new pf0(k10Var), 14, (Object) null);
                this.f358k.put(((bh0) k10Var).f280a, k10Var);
                editorClear.putString(((bh0) k10Var).f280a, String.valueOf(k10Var.forJsonPut()));
                if (((bh0) k10Var).b(od0Var)) {
                    z2 = true;
                }
            }
            editorClear.apply();
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            zg0 zg0Var = this.f355h;
            zg0Var.getClass();
            Intrinsics.checkNotNullParameter(triggeredActions, "triggeredActions");
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(triggeredActions, 10));
            Iterator it2 = triggeredActions.iterator();
            while (it2.hasNext()) {
                arrayList.add(((bh0) ((k10) it2.next())).f280a);
            }
            SharedPreferences.Editor editorEdit = zg0Var.f2395a.edit();
            for (String str : CollectionsKt.toSet(zg0Var.f2396b.keySet())) {
                if (arrayList.contains(str)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) zg0Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new vg0(str), 7, (Object) null);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) zg0Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ug0(str), 7, (Object) null);
                    editorEdit.remove(str);
                }
            }
            editorEdit.apply();
            re0 re0Var = this.f354g;
            re0Var.getClass();
            Intrinsics.checkNotNullParameter(triggeredActions, "triggeredActions");
            ee0 ee0Var = re0.f1682e;
            Intrinsics.checkNotNullParameter(triggeredActions, "triggeredActions");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator it3 = triggeredActions.iterator();
            while (it3.hasNext()) {
                k10 k10Var2 = (k10) it3.next();
                if (((bh0) k10Var2).f282c) {
                    for (s70 s70Var : k10Var2.a()) {
                        String str2 = s70Var.f1748b;
                        if (!StringsKt.isBlank(str2)) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) ee0Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new de0(k10Var2, str2), 7, (Object) null);
                            linkedHashSet.add(s70Var);
                            linkedHashSet2.add(str2);
                        }
                    }
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) ee0Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ce0(k10Var2), 7, (Object) null);
                }
            }
            Pair pair = new Pair(linkedHashSet, linkedHashSet2);
            Set set = (Set) pair.component1();
            Set newRemotePathStrings = (Set) pair.component2();
            SharedPreferences.Editor editor = re0Var.f1683a.edit();
            ee0 ee0Var2 = re0.f1682e;
            Intrinsics.checkNotNullExpressionValue(editor, "localAssetEditor");
            ConcurrentHashMap localAssetPaths = re0Var.f1684b;
            LinkedHashMap preservedLocalAssetPathMap = re0Var.f1685c;
            Intrinsics.checkNotNullParameter(editor, "editor");
            Intrinsics.checkNotNullParameter(localAssetPaths, "localAssetPaths");
            Intrinsics.checkNotNullParameter(newRemotePathStrings, "newRemotePathStrings");
            Intrinsics.checkNotNullParameter(preservedLocalAssetPathMap, "preservedLocalAssetPathMap");
            for (String str3 : new HashSet(localAssetPaths.keySet())) {
                if (preservedLocalAssetPathMap.containsKey(str3)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) ee0Var2, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new wd0(str3), 7, (Object) null);
                } else if (!newRemotePathStrings.contains(str3)) {
                    localAssetPaths.remove(str3);
                    editor.remove(str3);
                    String str4 = (String) localAssetPaths.get(str3);
                    if (str4 != null && !StringsKt.isBlank(str4)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) ee0Var2, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new xd0(str4, str3), 7, (Object) null);
                        BrazeFileUtils.deleteFileOrDirectory(new File(str4));
                    }
                }
            }
            ee0 ee0Var3 = re0.f1682e;
            File triggeredAssetDirectory = re0Var.f1686d;
            ConcurrentHashMap remoteToLocalAssetsMap = re0Var.f1684b;
            LinkedHashMap preservedLocalAssetMap = re0Var.f1685c;
            Intrinsics.checkNotNullParameter(triggeredAssetDirectory, "triggeredAssetDirectory");
            Intrinsics.checkNotNullParameter(remoteToLocalAssetsMap, "remoteToLocalAssetsMap");
            Intrinsics.checkNotNullParameter(preservedLocalAssetMap, "preservedLocalAssetMap");
            File[] fileArrListFiles = triggeredAssetDirectory.listFiles();
            if (fileArrListFiles != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) ee0Var3, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new td0(fileArrListFiles), 6, (Object) null);
                try {
                    ArrayList arrayList2 = new ArrayList();
                    for (File file : fileArrListFiles) {
                        if (!remoteToLocalAssetsMap.containsValue(file.getPath())) {
                            arrayList2.add(file);
                        }
                    }
                    ArrayList<File> arrayList3 = new ArrayList();
                    for (Object obj : arrayList2) {
                        if (!preservedLocalAssetMap.containsValue(((File) obj).getPath())) {
                            arrayList3.add(obj);
                        }
                    }
                    for (File obsoleteFile : arrayList3) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) re0.f1682e, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ud0(obsoleteFile), 7, (Object) null);
                        Intrinsics.checkNotNullExpressionValue(obsoleteFile, "obsoleteFile");
                        BrazeFileUtils.deleteFileOrDirectory(obsoleteFile);
                    }
                } catch (Exception e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) ee0Var3, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) vd0.f2039a, 4, (Object) null);
                }
            }
            ArrayList<s70> arrayList4 = new ArrayList();
            for (Object obj2 : set) {
                if (!re0Var.f1684b.containsKey(((s70) obj2).f1748b)) {
                    arrayList4.add(obj2);
                }
            }
            for (s70 s70Var2 : arrayList4) {
                String str5 = s70Var2.f1748b;
                try {
                    String strA = re0Var.a(s70Var2);
                    if (strA != null && !StringsKt.isBlank(strA)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) re0Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new pe0(strA, str5), 7, (Object) null);
                        re0Var.f1684b.put(str5, strA);
                        editor.putString(str5, strA);
                    }
                } catch (Exception e3) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) re0Var, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) new qe0(str5), 4, (Object) null);
                }
            }
            editor.apply();
            if (!z2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f347q, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) rf0.f1688a, 14, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f347q, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) qf0.f1601a, 12, (Object) null);
                b(od0Var);
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final j10 b() {
        return this.f355h;
    }

    public final void b(g10 triggerEvent) {
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        ReentrantLock reentrantLock = this.f362o;
        reentrantLock.lock();
        try {
            this.f357j.add(triggerEvent);
            if (this.f356i.get() == 0) {
                a();
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final LinkedHashMap c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, ?> all = this.f353f.getAll();
        if (all != null && !all.isEmpty()) {
            try {
                for (String str : CollectionsKt.toSet(all.keySet())) {
                    String string = this.f353f.getString(str, null);
                    if (string == null || StringsKt.isBlank(string)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f347q, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new sf0(str), 12, (Object) null);
                    } else {
                        dh0 dh0VarB = ng0.f1362a.b(new JSONObject(string), this.f349b);
                        if (dh0VarB != null) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f347q, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new tf0(dh0VarB), 14, (Object) null);
                            linkedHashMap.put(dh0VarB.f280a, dh0VarB);
                        }
                    }
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f347q, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) uf0.f1941a, 8, (Object) null);
            }
        }
        return linkedHashMap;
    }

    public final void d() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f347q, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) bg0.f277a, 12, (Object) null);
        ((vw) this.f350c).c(new IEventSubscriber() { // from class: bo.app.cg0$$ExternalSyntheticLambda0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                cg0.a(this.f$0, (ue0) obj);
            }
        }, ue0.class);
        ((vw) this.f350c).c(new IEventSubscriber() { // from class: bo.app.cg0$$ExternalSyntheticLambda1
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                cg0.a(this.f$0, (te0) obj);
            }
        }, te0.class);
    }
}
