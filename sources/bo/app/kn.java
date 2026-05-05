package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.Constants;
import com.braze.enums.CardKey;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.models.cards.Card;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public final class kn implements ICardStorageProvider {

    /* JADX INFO: renamed from: l */
    public static final Set f1122l = SetsKt.setOf((Object[]) new String[]{CardKey.VIEWED.getContentCardsKey(), CardKey.DISMISSED.getContentCardsKey()});

    /* JADX INFO: renamed from: a */
    public final String f1123a;

    /* JADX INFO: renamed from: b */
    public final h00 f1124b;

    /* JADX INFO: renamed from: c */
    public long f1125c;

    /* JADX INFO: renamed from: d */
    public long f1126d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f1127e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashSet f1128f;

    /* JADX INFO: renamed from: g */
    public final LinkedHashSet f1129g;

    /* JADX INFO: renamed from: h */
    public final Map f1130h;

    /* JADX INFO: renamed from: i */
    public final SharedPreferences f1131i;

    /* JADX INFO: renamed from: j */
    public final SharedPreferences f1132j;

    /* JADX INFO: renamed from: k */
    public final cm f1133k;

    public /* synthetic */ kn(Context context, String str, String str2, h00 h00Var) {
        this(context, str, str2, h00Var, Constants.BRAZE_SDK_VERSION);
    }

    public kn(Context context, String str, String str2, h00 h00Var, String str3) throws Throwable {
        Collection collectionFilterNotNull;
        Collection collectionFilterNotNull2;
        Collection collectionFilterNotNull3;
        Intrinsics.checkNotNullParameter(context, ZO.xd("\u001e8J^t\u0019;", (short) (FB.Xd() ^ 26393), (short) (FB.Xd() ^ 20303)));
        Intrinsics.checkNotNullParameter(str, C1626yg.Ud("]\ffh7\u0019", (short) (FB.Xd() ^ 23828), (short) (FB.Xd() ^ 21532)));
        Intrinsics.checkNotNullParameter(str2, Ig.wd("jH\u000fT\u001eU", (short) (OY.Xd() ^ 23050)));
        Intrinsics.checkNotNullParameter(h00Var, EO.Od("\"\u0003\u00069e\n{k\u0019=;h", (short) (C1499aX.Xd() ^ (-21547))));
        short sXd = (short) (C1499aX.Xd() ^ (-5816));
        int[] iArr = new int["HYUTFNS1AG1?KK@EC".length()];
        QB qb = new QB("HYUTFNS1AG1?KK@EC");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(str3, new String(iArr, 0, i2));
        this.f1123a = str;
        this.f1124b = h00Var;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f1127e = linkedHashSet;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        this.f1128f = linkedHashSet2;
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        this.f1129g = linkedHashSet3;
        this.f1130h = new LinkedHashMap();
        String cacheFileSuffix = StringUtils.getCacheFileSuffix(context, str, str2);
        short sXd2 = (short) (ZN.Xd() ^ 4280);
        short sXd3 = (short) (ZN.Xd() ^ 20207);
        int[] iArr2 = new int["\n\u0017\u0016W\f\u001c\u001d\u0010\u001e)^%'#'\u0017\u001e\u001df\u001d**1#-4 %$6)9&;=9=-43.@CAI=9;I\u0006<;M@P".length()];
        QB qb2 = new QB("\n\u0017\u0016W\f\u001c\u001d\u0010\u001e)^%'#'\u0017\u001e\u001df\u001d**1#-4 %$6)9&;=9=-43.@CAI=9;I\u0006<;M@P");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
            i3++;
        }
        String str4 = new String(iArr2, 0, i3) + cacheFileSuffix;
        short sXd4 = (short) (FB.Xd() ^ 12788);
        int[] iArr3 = new int["UaVc_XR\u001bOZX]MUZ\u0013'RPUEWR".length()];
        QB qb3 = new QB("UaVc_XR\u001bOZX]MUZ\u0013'RPUEWR");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(sXd4 + sXd4 + i4 + xuXd3.CK(iKK3));
            i4++;
        }
        Object[] objArr = {str4, 0};
        Method method = Class.forName(new String(iArr3, 0, i4)).getMethod(Wg.Zd("2ehKT\u0012\u0017\u000e\u0001o\u0006|q56-*%\u001b-", (short) (OY.Xd() ^ 9396), (short) (OY.Xd() ^ 2320)), Class.forName(C1561oA.Kd("7/E1~>4B<\u0004*LKCIC", (short) (C1580rY.Xd() ^ (-2680)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
            String strXd = C1561oA.Xd("=JJQCWT\u000fIHX8NHZNN;^RTTbV鶛\\l!\u0016:ggn`tq,LOEGbTWO]I]O4", (short) (C1607wl.Xd() ^ 28295));
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, strXd);
            this.f1131i = sharedPreferences;
            Object[] objArr2 = {Wg.vd("\u001e)*i\u0019(\u001a2(o88.0\"'\u0010W\u0010\u001b\u0015\u001a\u000e\u0016'\u0011\u0018\u0015!\u0012$\u000f\u000e\u000e\f\u000ew|}v\u0013\u0014\u0014\u001a\b\u0002\u0006\u00128vq\u007fgii{s", (short) (C1580rY.Xd() ^ (-10581))) + cacheFileSuffix, 0};
            Method method2 = Class.forName(Qg.kd("]i^kg`Z#Wb`eU]b\u001b/ZX]M_Z", (short) (ZN.Xd() ^ 27136), (short) (ZN.Xd() ^ 8878))).getMethod(C1561oA.ud("}z\tfzr\u0003tr]~ppnzlthiv", (short) (Od.Xd() ^ (-2447))), Class.forName(yg.hg.Vd("MCWA\rJ>JB\b,LI?C;", (short) (FB.Xd() ^ 19863), (short) (FB.Xd() ^ 19551))), Integer.TYPE);
            try {
                method2.setAccessible(true);
                SharedPreferences sharedPreferences2 = (SharedPreferences) method2.invoke(context, objArr2);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences2, strXd);
                this.f1132j = sharedPreferences2;
                this.f1133k = new cm();
                Map<String, ?> all = sharedPreferences.getAll();
                Intrinsics.checkNotNull(all, C1561oA.yd("\u001b!\u0017\u0016P\u0013\u0010\u001c##'Q\u001b\u001dV\u0019}\u000f\u000f9\u0015\u000f>\f\u0014\u0012O\u0010\u001e\u0014\u0013EAE;/p;>BA=A\u007f<GCB\"\u001f/#0.2k\u001297#+4,\u0013N\\'U`d[Wc\"Ffkae]\t{FIULHL\u00137WTRVN$", (short) (ZN.Xd() ^ 12899)));
                this.f1130h = TypeIntrinsics.asMutableMap(all);
                Set<String> stringSet = sharedPreferences2.getStringSet(C1561oA.Yd(">DOJGRSFF", (short) (C1607wl.Xd() ^ 10379)), new HashSet());
                linkedHashSet.addAll((stringSet == null || (collectionFilterNotNull3 = CollectionsKt.filterNotNull(stringSet)) == null) ? SetsKt.emptySet() : collectionFilterNotNull3);
                HashSet hashSet = new HashSet();
                short sXd5 = (short) (C1607wl.Xd() ^ 24131);
                short sXd6 = (short) (C1607wl.Xd() ^ 16315);
                int[] iArr4 = new int["`tmgqee".length()];
                QB qb4 = new QB("`tmgqee");
                int i5 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i5] = xuXd4.fK((xuXd4.CK(iKK4) - (sXd5 + i5)) + sXd6);
                    i5++;
                }
                Set<String> stringSet2 = sharedPreferences2.getStringSet(new String(iArr4, 0, i5), hashSet);
                linkedHashSet3.addAll((stringSet2 == null || (collectionFilterNotNull2 = CollectionsKt.filterNotNull(stringSet2)) == null) ? SetsKt.emptySet() : collectionFilterNotNull2);
                Set<String> stringSet3 = sharedPreferences2.getStringSet(Jg.Wd("\u0004\u0016>d", (short) (FB.Xd() ^ 16089), (short) (FB.Xd() ^ 1639)), new HashSet());
                linkedHashSet2.addAll((stringSet3 == null || (collectionFilterNotNull = CollectionsKt.filterNotNull(stringSet3)) == null) ? SetsKt.emptySet() : collectionFilterNotNull);
                String strXd2 = ZO.xd("R\u001d\u0016e\u0006\b\u0001\u00198g4wTA6\u0005+yO\b\u001bm\u000b<#", (short) (C1499aX.Xd() ^ (-28354)), (short) (C1499aX.Xd() ^ (-5080)));
                String string = sharedPreferences2.getString(strXd2, "");
                boolean zAreEqual = Intrinsics.areEqual(str3, string);
                String strUd = C1626yg.Ud("nsZ!\u0012i\rh:2#nYFr\n\u001d", (short) (C1580rY.Xd() ^ (-9864)), (short) (C1580rY.Xd() ^ (-8363)));
                if (!zAreEqual) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new em(string, str3), 6, (Object) null);
                    sharedPreferences2.edit().putLong(strUd, 0L).putString(strXd2, str3).apply();
                }
                this.f1125c = sharedPreferences2.getLong(Ig.wd("\t%)\u000b\u0006\\n V\"6\u0017W'6L\u0003{%\u0001", (short) (C1633zX.Xd() ^ (-6024))), 0L);
                this.f1126d = sharedPreferences2.getLong(strUd, 0L);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.braze.events.ContentCardsUpdatedEvent a(bo.app.dm r30, java.lang.String r31) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 946
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.kn.a(bo.app.dm, java.lang.String):com.braze.events.ContentCardsUpdatedEvent");
    }

    public final ContentCardsUpdatedEvent a(boolean z2) {
        CardKey.Provider cardKeyProvider = CardKey.Provider.CONTENT_CARDS;
        JSONArray cardJsonStringArray = new JSONArray();
        Iterator it = this.f1130h.values().iterator();
        while (it.hasNext()) {
            cardJsonStringArray.put((String) it.next());
        }
        h00 brazeManager = this.f1124b;
        cm cardAnalyticsProvider = this.f1133k;
        Intrinsics.checkNotNullParameter(cardJsonStringArray, "cardJsonStringArray");
        Intrinsics.checkNotNullParameter(cardKeyProvider, "cardKeyProvider");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(this, "cardStorageProvider");
        Intrinsics.checkNotNullParameter(cardAnalyticsProvider, "cardAnalyticsProvider");
        List list = SequencesKt.toList(SequencesKt.mapNotNull(SequencesKt.asSequence(SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, cardJsonStringArray.length())), new tl(cardJsonStringArray)), new ul(cardJsonStringArray)).iterator()), new wl(cardAnalyticsProvider, cardKeyProvider, brazeManager, this, cardJsonStringArray)));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((Card) obj).isExpired()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List<Card> list2 = (List) pair.component1();
        List list3 = (List) pair.component2();
        for (Card card : list2) {
            Intrinsics.checkNotNullParameter(card, "card");
            String cardId = card.getId();
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new im(cardId), 7, (Object) null);
            a(cardId, (JSONObject) null);
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f1129g.add(cardId);
            qa0 qa0Var = qa0.f1589a;
            BuildersKt__Builders_commonKt.launch$default(qa0Var, null, null, new gm(this, null), 3, null);
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new mm(cardId), 6, (Object) null);
            LinkedHashSet linkedHashSet = this.f1128f;
            linkedHashSet.remove(cardId);
            BuildersKt__Builders_commonKt.launch$default(qa0Var, null, null, new nm(this, linkedHashSet, null), 3, null);
        }
        return new ContentCardsUpdatedEvent(list3, this.f1123a, this.f1132j.getLong("last_storage_update_timestamp", 0L), z2);
    }

    public final JSONObject a(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        String str = (String) this.f1130h.get(cardId);
        if (str == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new jm(cardId), 7, (Object) null);
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new km(str), 4, (Object) null);
            return null;
        }
    }

    public final void a(String cardId, CardKey cardKey) {
        Boolean value = Boolean.TRUE;
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(cardKey, "cardKey");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObjectA = a(cardId);
        if (jSONObjectA == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new an(cardId), 7, (Object) null);
            return;
        }
        try {
            jSONObjectA.put(cardKey.getContentCardsKey(), value);
            a(cardId, jSONObjectA);
        } catch (JSONException e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new bn(cardKey), 4, (Object) null);
        }
    }

    public final void a(String cardId, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        if (jSONObject == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new hn(cardId), 7, (Object) null);
            this.f1130h.remove(cardId);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new in(cardId), 7, (Object) null);
            Map map = this.f1130h;
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "cardJson.toString()");
            map.put(cardId, string);
        }
        BuildersKt__Builders_commonKt.launch$default(qa0.f1589a, null, null, new jn(this, jSONObject, cardId, null), 3, null);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final Object getCachedCardsAsEvent() {
        return a(true);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsClicked(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        a(cardId, CardKey.CLICKED);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsDismissed(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f1127e.add(cardId);
        BuildersKt__Builders_commonKt.launch$default(qa0.f1589a, null, null, new fm(this, null), 3, null);
        a(cardId, (JSONObject) null);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsViewed(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        a(cardId, CardKey.VIEWED);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsVisuallyRead(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        a(cardId, CardKey.READ);
    }
}
