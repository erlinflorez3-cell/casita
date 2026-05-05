package com.braze.support;

import bo.app.a30;
import bo.app.g30;
import bo.app.h00;
import bo.app.w20;
import bo.app.x20;
import bo.app.y20;
import bo.app.z20;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.models.inappmessage.InAppMessageControl;
import com.braze.models.inappmessage.InAppMessageFull;
import com.braze.models.inappmessage.InAppMessageHtml;
import com.braze.models.inappmessage.InAppMessageHtmlFull;
import com.braze.models.inappmessage.InAppMessageModal;
import com.braze.models.inappmessage.InAppMessageSlideup;
import com.braze.support.BrazeLogger;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a */
    public static final String f2709a = BrazeLogger.INSTANCE.getBrazeLogTag("InAppMessageModelUtils");

    public static final g30 a(JSONObject inAppMessageJson) {
        Intrinsics.checkNotNullParameter(inAppMessageJson, "inAppMessageJson");
        JSONObject jSONObjectOptJSONObject = inAppMessageJson.optJSONObject("themes");
        JSONObject messageThemeJson = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject("dark") : null;
        if (messageThemeJson == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(messageThemeJson, "messageThemeJson");
        return new g30(JsonUtils.getColorIntegerOrNull(messageThemeJson, InAppMessageBase.BG_COLOR), JsonUtils.getColorIntegerOrNull(messageThemeJson, InAppMessageBase.MESSAGE_TEXT_COLOR), JsonUtils.getColorIntegerOrNull(messageThemeJson, "close_btn_color"), JsonUtils.getColorIntegerOrNull(messageThemeJson, InAppMessageBase.ICON_COLOR), JsonUtils.getColorIntegerOrNull(messageThemeJson, InAppMessageBase.ICON_BG_COLOR), JsonUtils.getColorIntegerOrNull(messageThemeJson, "header_text_color"), JsonUtils.getColorIntegerOrNull(messageThemeJson, "frame_color"));
    }

    public static final InAppMessageBase a(JSONObject inAppMessageJson, h00 brazeManager) {
        InAppMessageBase inAppMessageFull;
        String upperCase;
        Intrinsics.checkNotNullParameter(inAppMessageJson, "inAppMessageJson");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        try {
            Intrinsics.checkNotNullParameter(inAppMessageJson, "inAppMessageJson");
            if (inAppMessageJson.optBoolean(InAppMessageBase.IS_CONTROL, false)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f2709a, BrazeLogger.Priority.D, (Throwable) null, false, (Function0) x20.f2178a, 12, (Object) null);
                return new InAppMessageControl(inAppMessageJson, brazeManager);
            }
            try {
                String string = inAppMessageJson.getString("type");
                Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                upperCase = string.toUpperCase(US);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            } catch (Exception unused) {
                messageType = null;
            }
            for (MessageType messageType : MessageType.values()) {
                if (Intrinsics.areEqual(messageType.name(), upperCase)) {
                    if (messageType == null) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f2709a, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new y20(inAppMessageJson), 12, (Object) null);
                        return null;
                    }
                    int i2 = w20.f2098a[messageType.ordinal()];
                    if (i2 == 1) {
                        inAppMessageFull = new InAppMessageFull(inAppMessageJson, brazeManager);
                    } else if (i2 == 2) {
                        inAppMessageFull = new InAppMessageModal(inAppMessageJson, brazeManager);
                    } else if (i2 == 3) {
                        inAppMessageFull = new InAppMessageSlideup(inAppMessageJson, brazeManager);
                    } else if (i2 == 4) {
                        inAppMessageFull = new InAppMessageHtmlFull(inAppMessageJson, brazeManager);
                    } else {
                        if (i2 != 5) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f2709a, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new z20(inAppMessageJson), 12, (Object) null);
                            return null;
                        }
                        inAppMessageFull = new InAppMessageHtml(inAppMessageJson, brazeManager);
                    }
                    return inAppMessageFull;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f2709a, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new a30(inAppMessageJson), 8, (Object) null);
            return null;
        }
    }

    public static final JSONArray b(JSONObject inAppMessageJson) {
        JSONObject jSONObjectOptJSONObject;
        Intrinsics.checkNotNullParameter(inAppMessageJson, "inAppMessageJson");
        JSONObject jSONObjectOptJSONObject2 = inAppMessageJson.optJSONObject("themes");
        JSONArray jSONArrayOptJSONArray = (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("dark")) == null) ? null : jSONObjectOptJSONObject.optJSONArray("btns");
        return jSONArrayOptJSONArray == null ? new JSONArray() : jSONArrayOptJSONArray;
    }
}
