package bo.app;

import com.braze.models.IPutIntoJson;
import com.braze.models.inappmessage.InAppMessageBase;
import com.facebook.common.callercontext.ContextChain;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.LinkedHashMap;
import kotlin.collections.MapsKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public enum lx implements IPutIntoJson {
    LOCATION_RECORDED("lr"),
    CUSTOM_EVENT("ce"),
    PURCHASE("p"),
    PUSH_STORY_PAGE_CLICK("cic"),
    PUSH_CLICKED("pc"),
    PUSH_ACTION_BUTTON_CLICKED("ca"),
    INTERNAL(ContextChain.TAG_INFRA),
    INTERNAL_ERROR("ie"),
    NEWS_FEED_CARD_IMPRESSION("ci"),
    NEWS_FEED_CARD_CLICK("cc"),
    GEOFENCE("g"),
    CONTENT_CARDS_CLICK("ccc"),
    CONTENT_CARDS_IMPRESSION("cci"),
    CONTENT_CARDS_CONTROL_IMPRESSION("ccic"),
    CONTENT_CARDS_DISMISS("ccd"),
    INCREMENT("inc"),
    ADD_TO_CUSTOM_ATTRIBUTE_ARRAY(ProductAction.ACTION_ADD),
    REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY("rem"),
    SET_CUSTOM_ATTRIBUTE_ARRAY("set"),
    INAPP_MESSAGE_IMPRESSION("si"),
    INAPP_MESSAGE_CONTROL_IMPRESSION("iec"),
    INAPP_MESSAGE_CLICK("sc"),
    INAPP_MESSAGE_BUTTON_CLICK("sbc"),
    /* JADX INFO: Fake field, exist only in values array */
    INAPP_MESSAGE_MESSAGE_EXTRAS(InAppMessageBase.MESSAGE_EXTRAS),
    USER_ALIAS("uae"),
    SESSION_START("ss"),
    SESSION_END("se"),
    /* JADX INFO: Fake field, exist only in values array */
    TEST_TYPE("tt"),
    LOCATION_CUSTOM_ATTRIBUTE_ADD("lcaa"),
    LOCATION_CUSTOM_ATTRIBUTE_REMOVE("lcar"),
    NESTED_CUSTOM_ATTRIBUTE_MERGE("ncam"),
    SUBSCRIPTION_GROUP_UPDATE("sgu"),
    FEATURE_FLAG_IMPRESSION_EVENT("ffi"),
    PUSH_DELIVERY_EVENT("pde"),
    UNKNOWN("");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f1214b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1239a;

    static {
        lx[] lxVarArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(lxVarArrValues.length), 16));
        for (lx lxVar : lxVarArrValues) {
            linkedHashMap.put(lxVar.f1239a, lxVar);
        }
        f1214b = linkedHashMap;
    }

    lx(String str) {
        this.f1239a = str;
    }

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        return this.f1239a;
    }
}
