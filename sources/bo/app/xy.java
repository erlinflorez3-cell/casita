package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.enums.CardKey;
import com.braze.events.FeedUpdatedEvent;
import com.braze.models.cards.Card;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import com.dynatrace.android.agent.Global;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public final class xy implements ICardStorageProvider {

    /* JADX INFO: renamed from: a */
    public final h00 f2248a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f2249b;

    /* JADX INFO: renamed from: c */
    public final AbstractSet f2250c;

    /* JADX INFO: renamed from: d */
    public final AbstractSet f2251d;

    /* JADX INFO: renamed from: e */
    public final ty f2252e;

    public xy(Context context, String str, h00 h00Var) throws Throwable {
        short sXd = (short) (ZN.Xd() ^ 10049);
        int[] iArr = new int["\u001a%#(\u0018*%".length()];
        QB qb = new QB("\u001a%#(\u0018*%");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(context, new String(iArr, 0, i2));
        Intrinsics.checkNotNullParameter(h00Var, C1561oA.Kd("5F6P<%:H<CBP", (short) (FB.Xd() ^ 8632)));
        this.f2248a = h00Var;
        this.f2252e = new ty();
        String str2 = Wg.Zd("*5>\u000eLitu\u000e\u0016U*6?MK\\Y,s}\r\u00164@:GEVcx\n\u0014&\u0018\u001d-E", (short) (C1607wl.Xd() ^ 3930), (short) (C1607wl.Xd() ^ 5214)) + StringUtils.getCacheFileSuffix(context, str == null ? "" : str);
        Class<?> cls = Class.forName(C1561oA.Xd("esjywrn9o||\u0004u\u007f\u0007AW\u0005\u0005\f}\u0012\u000f", (short) (FB.Xd() ^ 16922)));
        Class<?>[] clsArr = {Class.forName(Wg.vd("\u000b\u0001\u0015~J\b{\b\u007fEi\n\u0007|\u0001x", (short) (C1607wl.Xd() ^ 13386))), Integer.TYPE};
        Object[] objArr = {str2, 0};
        short sXd2 = (short) (C1633zX.Xd() ^ (-19555));
        short sXd3 = (short) (C1633zX.Xd() ^ (-20202));
        int[] iArr2 = new int["sp~\\phxjhStffdpbj^_l".length()];
        QB qb2 = new QB("sp~\\phxjhStffdpbj^_l");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, yg.hg.Vd("\u0012\u001d\u001b \u0010\"\u001dU\u000e\u000b\u0019v\u000b\u0003\u0013\u0005\u0003m\u000f\u0001\u0001~\u000b|鶳^x?2T\u007f}\u0003r\u0005\u007f8VWKKdTUKWASC&", (short) (C1607wl.Xd() ^ 20954), (short) (C1607wl.Xd() ^ 11137)));
            this.f2249b = sharedPreferences;
            this.f2250c = a(uy.VIEWED_CARDS);
            this.f2251d = a(uy.READ_CARDS);
            a(str);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final FeedUpdatedEvent a(String str, JSONArray cardsArray) throws JSONException {
        Intrinsics.checkNotNullParameter(cardsArray, "cardsArray");
        String str2 = str == null ? "" : str;
        String string = this.f2249b.getString("uid", "");
        if (!Intrinsics.areEqual(string, str2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new wy(str, string), 7, (Object) null);
            return null;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new vy(str), 6, (Object) null);
        long jNowInSeconds = DateTimeUtils.nowInSeconds();
        SharedPreferences.Editor editorEdit = this.f2249b.edit();
        if (cardsArray.length() == 0) {
            editorEdit.remove("cards");
        } else {
            editorEdit.putString("cards", cardsArray.toString());
        }
        editorEdit.putLong("cards_timestamp", jNowInSeconds);
        editorEdit.apply();
        AbstractSet abstractSet = this.f2250c;
        Intrinsics.checkNotNullParameter(cardsArray, "cardsArray");
        HashSet hashSet = new HashSet();
        int length = cardsArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject = cardsArray.getJSONObject(i2);
            CardKey cardKey = CardKey.ID;
            if (jSONObject.has(cardKey.getFeedKey())) {
                String string2 = jSONObject.getString(cardKey.getFeedKey());
                Intrinsics.checkNotNullExpressionValue(string2, "card.getString(CardKey.ID.feedKey)");
                hashSet.add(string2);
            }
        }
        abstractSet.retainAll(hashSet);
        a(this.f2250c, uy.VIEWED_CARDS);
        AbstractSet abstractSet2 = this.f2251d;
        Intrinsics.checkNotNullParameter(cardsArray, "cardsArray");
        HashSet hashSet2 = new HashSet();
        int length2 = cardsArray.length();
        for (int i3 = 0; i3 < length2; i3++) {
            JSONObject jSONObject2 = cardsArray.getJSONObject(i3);
            CardKey cardKey2 = CardKey.ID;
            if (jSONObject2.has(cardKey2.getFeedKey())) {
                String string3 = jSONObject2.getString(cardKey2.getFeedKey());
                Intrinsics.checkNotNullExpressionValue(string3, "card.getString(CardKey.ID.feedKey)");
                hashSet2.add(string3);
            }
        }
        abstractSet2.retainAll(hashSet2);
        a(this.f2251d, uy.READ_CARDS);
        return a(cardsArray, str, false, jNowInSeconds);
    }

    public final FeedUpdatedEvent a(JSONArray cardJsonStringArray, String str, boolean z2, long j2) {
        List<Card> list;
        if (cardJsonStringArray.length() == 0) {
            list = new ArrayList();
        } else {
            CardKey.Provider cardKeyProvider = new CardKey.Provider(false);
            h00 brazeManager = this.f2248a;
            ty cardAnalyticsProvider = this.f2252e;
            Intrinsics.checkNotNullParameter(cardJsonStringArray, "cardJsonStringArray");
            Intrinsics.checkNotNullParameter(cardKeyProvider, "cardKeyProvider");
            Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
            Intrinsics.checkNotNullParameter(this, "cardStorageProvider");
            Intrinsics.checkNotNullParameter(cardAnalyticsProvider, "cardAnalyticsProvider");
            list = SequencesKt.toList(SequencesKt.mapNotNull(SequencesKt.asSequence(SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, cardJsonStringArray.length())), new tl(cardJsonStringArray)), new ul(cardJsonStringArray)).iterator()), new wl(cardAnalyticsProvider, cardKeyProvider, brazeManager, this, cardJsonStringArray)));
        }
        for (Card card : list) {
            if (this.f2250c.contains(card.getId())) {
                card.setViewed(true);
                card.setIndicatorHighlighted(true);
            }
            if (this.f2251d.contains(card.getId())) {
                card.setIndicatorHighlighted(true);
            }
        }
        return new FeedUpdatedEvent(list, str, z2, j2);
    }

    public final AbstractSet a(uy uyVar) {
        String str = uyVar.f1986b;
        if (this.f2249b.contains(str)) {
            HashSet hashSet = null;
            String input = this.f2249b.getString(str, null);
            if (input != null) {
                Intrinsics.checkNotNullParameter(input, "input");
                hashSet = new HashSet();
                String[] strArr = (String[]) StringsKt.split$default((CharSequence) input, new String[]{Global.SEMICOLON}, false, 0, 6, (Object) null).toArray(new String[0]);
                Collections.addAll(hashSet, Arrays.copyOf(strArr, strArr.length));
            }
            SharedPreferences.Editor editorEdit = this.f2249b.edit();
            editorEdit.remove(str);
            editorEdit.apply();
            if (hashSet != null) {
                a(hashSet, uyVar);
                return hashSet;
            }
        }
        return new ConcurrentSkipListSet(this.f2249b.getStringSet(uyVar.f1985a, new HashSet()));
    }

    public final void a(String str) {
        SharedPreferences.Editor editorEdit = this.f2249b.edit();
        editorEdit.putString("uid", str);
        editorEdit.apply();
    }

    public final void a(AbstractSet cardIds, uy property) {
        Intrinsics.checkNotNullParameter(cardIds, "cardIds");
        Intrinsics.checkNotNullParameter(property, "property");
        String str = property.f1985a;
        SharedPreferences.Editor editorEdit = this.f2249b.edit();
        if (cardIds.isEmpty()) {
            editorEdit.remove(str);
        } else {
            editorEdit.putStringSet(str, cardIds);
        }
        editorEdit.apply();
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final Object getCachedCardsAsEvent() {
        return a(new JSONArray(this.f2249b.getString("cards", "[]")), this.f2249b.getString("uid", ""), true, this.f2249b.getLong("cards_timestamp", -1L));
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsClicked(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsDismissed(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsViewed(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        if (this.f2250c.contains(cardId)) {
            return;
        }
        this.f2250c.add(cardId);
        a(this.f2250c, uy.VIEWED_CARDS);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsVisuallyRead(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        if (this.f2251d.contains(cardId)) {
            return;
        }
        this.f2251d.add(cardId);
        a(this.f2251d, uy.READ_CARDS);
    }
}
