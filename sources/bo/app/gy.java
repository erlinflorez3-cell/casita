package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.models.FeatureFlag;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;

/* JADX INFO: loaded from: classes4.dex */
public final class gy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v00 f778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v00 f779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vb0 f780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h00 f781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f783f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SharedPreferences f784g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SharedPreferences f785h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SharedPreferences f786i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicInteger f787j;

    public gy(Context context, String str, String str2, vw vwVar, v00 v00Var, vb0 vb0Var, h00 h00Var) throws Throwable {
        Intrinsics.checkNotNullParameter(context, C1561oA.ud("_jhm]oj", (short) (C1580rY.Xd() ^ (-17227))));
        Intrinsics.checkNotNullParameter(str, C1561oA.yd("Ue_B]r", (short) (Od.Xd() ^ (-11971))));
        short sXd = (short) (C1633zX.Xd() ^ (-23378));
        int[] iArr = new int["\u0018\u001e%\u0017%\"\u0016\"{.\u001e(/\f2 +)4*(6".length()];
        QB qb = new QB("\u0018\u001e%\u0017%\"\u0016\"{.\u001e(/\f2 +)4*(6");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        Intrinsics.checkNotNullParameter(vwVar, new String(iArr, 0, i2));
        Intrinsics.checkNotNullParameter(v00Var, Xg.qd("o\u0004\u0001r\u0001}q}W\ny\u0004\u000bg\u000e{\u0007\u0005\u0010\u0006\u0004\u0012", (short) (C1580rY.Xd() ^ (-12578)), (short) (C1580rY.Xd() ^ (-26780))));
        Intrinsics.checkNotNullParameter(vb0Var, Jg.Wd("c-\u0012m>#KQ oL\"mh;\u0016V4\nNP%\u0006P\u001buZ", (short) (Od.Xd() ^ (-22106)), (short) (Od.Xd() ^ (-16171))));
        short sXd2 = (short) (C1499aX.Xd() ^ (-12124));
        short sXd3 = (short) (C1499aX.Xd() ^ (-2072));
        int[] iArr2 = new int["<zf~H*Q(i$.8".length()];
        QB qb2 = new QB("<zf~H*Q(i$.8");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd3) + sXd2)));
            i3++;
        }
        Intrinsics.checkNotNullParameter(h00Var, new String(iArr2, 0, i3));
        this.f778a = vwVar;
        this.f779b = v00Var;
        this.f780c = vb0Var;
        this.f781d = h00Var;
        this.f782e = CollectionsKt.emptyList();
        this.f783f = new AtomicBoolean(false);
        String str3 = C1626yg.Ud("TV\r\u000f\u0014+\u000b5IGnl\u000eB$\bRpJt\u0002F\u0014\u0007)#>\n\f\u001a6y\u0003@F`\u0015B&l`\fg", (short) (Od.Xd() ^ (-25119)), (short) (Od.Xd() ^ (-31747))) + StringUtils.getCacheFileSuffix(context, str2, str);
        short sXd4 = (short) (C1499aX.Xd() ^ (-12551));
        int[] iArr3 = new int["$[}Bd9\u0006.,^Uc\u0005\u001a\n$o4Y&O\u001dt".length()];
        QB qb3 = new QB("$[}Bd9\u0006.,^Uc\u0005\u001a\n$o4Y&O\u001dt");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd4 + i4)));
            i4++;
        }
        Class<?> cls = Class.forName(new String(iArr3, 0, i4));
        Class<?>[] clsArr = new Class[2];
        short sXd5 = (short) (C1580rY.Xd() ^ (-28382));
        int[] iArr4 = new int["u\u001f\u0016hdh\u0002\u001ejt07dM\u0003a".length()];
        QB qb4 = new QB("u\u001f\u0016hdh\u0002\u001ejt07dM\u0003a");
        int i5 = 0;
        while (qb4.YK()) {
            int iKK4 = qb4.KK();
            Xu xuXd4 = Xu.Xd(iKK4);
            iArr4[i5] = xuXd4.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + i5)) + xuXd4.CK(iKK4));
            i5++;
        }
        clsArr[0] = Class.forName(new String(iArr4, 0, i5));
        clsArr[1] = Integer.TYPE;
        Object[] objArr = {str3, 0};
        Method method = cls.getMethod(C1561oA.Qd("vs\u0002_sk{mkVwiigsemabo", (short) (C1580rY.Xd() ^ (-23930))), clsArr);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
            short sXd6 = (short) (C1633zX.Xd() ^ (-20090));
            short sXd7 = (short) (C1633zX.Xd() ^ (-23364));
            int[] iArr5 = new int["|\n\n\u0011\u0003\u0017\u0014N\t\b\u0018w\u000e\b\u001a\u000e\u000ez\u001e\u0012\u0014\u0014\"\u0016訂\"\")\u001b/,f\u0007\n\u007f\u0002\u001d\u000f\u0012\n\u0018\u0004\u0018\nOfghis".length()];
            QB qb5 = new QB("|\n\n\u0011\u0003\u0017\u0014N\t\b\u0018w\u000e\b\u001a\u000e\u000ez\u001e\u0012\u0014\u0014\"\u0016訂\"\")\u001b/,f\u0007\n\u007f\u0002\u001d\u000f\u0012\n\u0018\u0004\u0018\nOfghis");
            int i6 = 0;
            while (qb5.YK()) {
                int iKK5 = qb5.KK();
                Xu xuXd5 = Xu.Xd(iKK5);
                iArr5[i6] = xuXd5.fK((xuXd5.CK(iKK5) - (sXd6 + i6)) - sXd7);
                i6++;
            }
            String str4 = new String(iArr5, 0, i6);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, str4);
            this.f784g = sharedPreferences;
            Object[] objArr2 = {C1561oA.od("ozw7jyg\u007fi1obn`ebnn(_]XjjfXX]QVa\u001b__Y[INK", (short) (C1580rY.Xd() ^ (-26381))) + StringUtils.getCacheFileSuffix(context, str2, str), 0};
            Method method2 = Class.forName(C1561oA.Kd("\u0012 \u0017&$\u001f\u001be\u001c))0\",3m\u0004118*>;", (short) (Od.Xd() ^ (-29001)))).getMethod(C1561oA.Xd("\u0019\u0018(\b\u001e\u0018*\u001e\u001e\u000b.\"$$2&0&)8", (short) (C1580rY.Xd() ^ (-27567))), Class.forName(Wg.Zd(":gV\u0016\\m<}Pi\t~V\u0004^-", (short) (C1633zX.Xd() ^ (-17627)), (short) (C1633zX.Xd() ^ (-5392)))), Integer.TYPE);
            try {
                method2.setAccessible(true);
                SharedPreferences sharedPreferences2 = (SharedPreferences) method2.invoke(context, objArr2);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences2, str4);
                this.f785h = sharedPreferences2;
                Object[] objArr3 = {Wg.vd("y\u0007\u0006G|\u000e}\u0018\u0004M\u000e\u0003\u0011\u0005\f\u000b\u0019\u001bV\u0010\u0010\r!#!\u0015\u0017\u001e\u0014\u001b(c %), /0'..4", (short) (Od.Xd() ^ (-24406))) + StringUtils.getCacheFileSuffix(context, str2, str), 0};
                Method method3 = Class.forName(Qg.kd("BNCPLE?\b<GEJ:BG\u007f\u0014?=B2D?", (short) (Od.Xd() ^ (-24018)), (short) (Od.Xd() ^ (-11235)))).getMethod(C1561oA.ud("85C!5-=/-\u00189++)5'/#$1", (short) (C1607wl.Xd() ^ 30732)), Class.forName(yg.hg.Vd("=3G1|:.:2w\u001c<9/3+", (short) (FB.Xd() ^ 9564), (short) (FB.Xd() ^ 32309))), Integer.TYPE);
                try {
                    method3.setAccessible(true);
                    SharedPreferences sharedPreferences3 = (SharedPreferences) method3.invoke(context, objArr3);
                    Intrinsics.checkNotNullExpressionValue(sharedPreferences3, str4);
                    this.f786i = sharedPreferences3;
                    this.f787j = new AtomicInteger(0);
                    a();
                    vwVar.c(new IEventSubscriber() { // from class: bo.app.gy$$ExternalSyntheticLambda0
                        @Override // com.braze.events.IEventSubscriber
                        public final void trigger(Object obj) {
                            gy.a(this.f$0, (w70) obj);
                        }
                    }, w70.class);
                    vwVar.c(new IEventSubscriber() { // from class: bo.app.gy$$ExternalSyntheticLambda1
                        @Override // com.braze.events.IEventSubscriber
                        public final void trigger(Object obj) {
                            gy.a(this.f$0, (v70) obj);
                        }
                    }, v70.class);
                    vwVar.c(new IEventSubscriber() { // from class: bo.app.gy$$ExternalSyntheticLambda2
                        @Override // com.braze.events.IEventSubscriber
                        public final void trigger(Object obj) {
                            gy.a(this.f$0, (jy) obj);
                        }
                    }, jy.class);
                    vwVar.c(new IEventSubscriber() { // from class: bo.app.gy$$ExternalSyntheticLambda3
                        @Override // com.braze.events.IEventSubscriber
                        public final void trigger(Object obj) {
                            gy.a(this.f$0, (iy) obj);
                        }
                    }, iy.class);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    public static final void a(gy this$0, iy it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.f783f.set(true);
        if (this$0.f783f.get()) {
            List list = this$0.f782e;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((FeatureFlag) it2.next()).deepcopy$android_sdk_base_release());
            }
            ((vw) this$0.f779b).b(FeatureFlagsUpdatedEvent.class, new FeatureFlagsUpdatedEvent(arrayList));
        }
    }

    public static final void a(gy this$0, jy it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.f783f.set(true);
        long jNowInSeconds = DateTimeUtils.nowInSeconds();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this$0, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new fy(jNowInSeconds), 6, (Object) null);
        this$0.f784g.edit().putLong("last_refresh", jNowInSeconds).apply();
    }

    public static final void a(gy this$0, v70 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.f2006a instanceof ny) {
            this$0.f787j.decrementAndGet();
        }
    }

    public static final void a(gy this$0, w70 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.f2109a instanceof ny) {
            this$0.f787j.incrementAndGet();
        }
    }

    public final FeatureFlagsUpdatedEvent a(JSONArray featureFlagsJson) {
        Intrinsics.checkNotNullParameter(featureFlagsJson, "featureFlagsData");
        Intrinsics.checkNotNullParameter(featureFlagsJson, "featureFlagsJson");
        ArrayList arrayList = new ArrayList();
        Iterator it = SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, featureFlagsJson.length())), new oy(featureFlagsJson)), new py(featureFlagsJson)).iterator();
        while (it.hasNext()) {
            FeatureFlag featureFlagA = com.braze.support.f.f2704a.a((JSONObject) it.next());
            if (featureFlagA != null) {
                arrayList.add(featureFlagA);
            }
        }
        this.f782e = arrayList;
        SharedPreferences.Editor editorEdit = this.f785h.edit();
        editorEdit.clear();
        for (FeatureFlag featureFlag : this.f782e) {
            try {
                editorEdit.putString(featureFlag.getId(), featureFlag.forJsonPut().toString());
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new dy(featureFlag), 4, (Object) null);
            }
        }
        editorEdit.apply();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) ey.f598a, 7, (Object) null);
        List list = this.f782e;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((FeatureFlag) it2.next()).deepcopy$android_sdk_base_release());
        }
        return new FeatureFlagsUpdatedEvent(arrayList2);
    }

    public final void a() {
        SharedPreferences sharedPreferences = this.f785h;
        ArrayList arrayList = new ArrayList();
        Map<String, ?> all = sharedPreferences.getAll();
        if (all == null || all.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) ux.f1981a, 7, (Object) null);
            this.f782e = CollectionsKt.emptyList();
            return;
        }
        Set<String> setKeySet = all.keySet();
        if (setKeySet.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) vx.f2082a, 6, (Object) null);
            this.f782e = CollectionsKt.emptyList();
            return;
        }
        for (String str : setKeySet) {
            String str2 = (String) all.get(str);
            if (str2 != null) {
                try {
                } catch (Exception e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new xx(str2), 4, (Object) null);
                }
                if (!StringsKt.isBlank(str2)) {
                    FeatureFlag featureFlagA = com.braze.support.f.f2704a.a(new JSONObject(str2));
                    if (featureFlagA != null) {
                        arrayList.add(featureFlagA);
                    }
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new wx(str), 6, (Object) null);
        }
        this.f782e = arrayList;
    }

    public final void a(String id) {
        Set<String> setKeySet;
        Intrinsics.checkNotNullParameter(id, "id");
        FeatureFlag ff = (FeatureFlag) CollectionsKt.firstOrNull((List) b(id));
        if ((ff != null ? ff.getTrackingString$android_sdk_base_release() : null) == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new zx(id), 6, (Object) null);
            return;
        }
        String id2 = ff.getId();
        Intrinsics.checkNotNullParameter(id2, "id");
        Map<String, ?> all = this.f786i.getAll();
        if (all != null && (setKeySet = all.keySet()) != null && setKeySet.contains(id2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new yx(ff), 6, (Object) null);
            return;
        }
        z9 z9Var = ba.f257g;
        z9Var.getClass();
        Intrinsics.checkNotNullParameter(ff, "ff");
        e00 e00VarA = z9Var.a(new a9(ff));
        if (e00VarA != null) {
            ((tf) this.f781d).a(e00VarA);
        }
        String id3 = ff.getId();
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f786i.edit().putBoolean(id3, true).apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public final ArrayList b(String str) {
        ?? arrayList;
        if (str != null) {
            List list = this.f782e;
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.areEqual(((FeatureFlag) obj).getId(), str)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = this.f782e;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((FeatureFlag) it.next()).deepcopy$android_sdk_base_release());
        }
        return arrayList2;
    }

    public final void b() {
        this.f786i.edit().clear().apply();
    }
}
