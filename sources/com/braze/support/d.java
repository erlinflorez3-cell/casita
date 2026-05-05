package com.braze.support;

import bo.app.nn;
import bo.app.on;
import bo.app.pn;
import bo.app.qn;
import bo.app.rn;
import bo.app.sn;
import bo.app.tn;
import bo.app.un;
import bo.app.vn;
import com.braze.enums.BrazeDateFormat;
import com.braze.support.BrazeLogger;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f2701a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f2702b = CollectionsKt.listOf((Object[]) new String[]{"$add", "$remove", "$update", "$identifier_key", "$identifier_value", "$new_object"});

    public static final boolean a(String str, Set blocklistedAttributes) {
        Intrinsics.checkNotNullParameter(blocklistedAttributes, "blocklistedAttributes");
        if (str == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f2701a, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) un.f1957a, 6, (Object) null);
            return false;
        }
        if (!blocklistedAttributes.contains(str)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f2701a, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new vn(str), 6, (Object) null);
        return false;
    }

    public final Object a(Object value, int i2) {
        Object date$default;
        d dVar;
        Intrinsics.checkNotNullParameter(value, "value");
        if ((value instanceof Boolean) || (value instanceof Integer) || (value instanceof Float) || (value instanceof Long) || (value instanceof Double)) {
            return value;
        }
        if (value instanceof String) {
            date$default = ValidationUtils.ensureBrazeFieldLength((String) value);
        } else {
            int i3 = 2;
            date$default = null;
            if (!(value instanceof Date)) {
                if (!(value instanceof JSONObject)) {
                    if (!(value instanceof JSONArray)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new qn(value), 6, (Object) null);
                        return null;
                    }
                    if (i2 != 0 || value.toString().length() <= 76800) {
                        JSONArray jSONArray = (JSONArray) value;
                        int i4 = i2 + 1;
                        if (i4 <= 50) {
                            JSONArray jSONArray2 = new JSONArray();
                            int length = jSONArray.length();
                            for (int i5 = 0; i5 < length; i5++) {
                                Object obj = jSONArray.get(i5);
                                Intrinsics.checkNotNullExpressionValue(obj, "jsonArray.get(i)");
                                Object objA = a(obj, i4);
                                if (objA == null) {
                                    return null;
                                }
                                jSONArray2.put(objA);
                            }
                            return jSONArray2;
                        }
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) rn.f1700a, 7, (Object) null);
                    } else {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new pn(value), 6, (Object) null);
                    }
                } else if (i2 != 0 || value.toString().length() <= 76800) {
                    JSONObject jSONObject = (JSONObject) value;
                    int i6 = i2 + 1;
                    if (i6 > 50) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) sn.f1782a, 7, (Object) null);
                    } else {
                        JSONObject jSONObject2 = new JSONObject();
                        Iterator<String> itKeys = jSONObject.keys();
                        Intrinsics.checkNotNullExpressionValue(itKeys, "json.keys()");
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            String strEnsureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(next);
                            d dVar2 = f2701a;
                            int i7 = (StringsKt.isBlank(strEnsureBrazeFieldLength) ? 1 : 0) | (StringsKt.contains$default((CharSequence) strEnsureBrazeFieldLength, (CharSequence) "$", false, i3, (Object) null) ? 1 : 0);
                            boolean zContains$default = StringsKt.contains$default((CharSequence) strEnsureBrazeFieldLength, (CharSequence) ".", false, i3, (Object) null);
                            int i8 = (i7 + (zContains$default ? 1 : 0)) - (i7 & (zContains$default ? 1 : 0)) != 1 ? 0 : 1;
                            int i9 = !f2702b.contains(strEnsureBrazeFieldLength) ? 1 : 0;
                            if ((i8 + i9) - (i8 | i9) == 1) {
                                dVar = dVar2;
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dVar2, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new tn(next), 6, (Object) null);
                            } else {
                                dVar = dVar2;
                            }
                            if (!StringsKt.isBlank(strEnsureBrazeFieldLength)) {
                                if (jSONObject.isNull(next)) {
                                    jSONObject2.put(next, JSONObject.NULL);
                                } else {
                                    Object obj2 = jSONObject.get(next);
                                    Intrinsics.checkNotNullExpressionValue(obj2, "json.get(key)");
                                    Object objA2 = dVar.a(obj2, i6);
                                    if (objA2 != null) {
                                        jSONObject2.put(strEnsureBrazeFieldLength, objA2);
                                    }
                                }
                            }
                            i3 = 2;
                        }
                        date$default = jSONObject2;
                    }
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new on(value), 6, (Object) null);
                }
                return date$default;
            }
            try {
                date$default = DateTimeUtils.formatDate$default((Date) value, BrazeDateFormat.LONG, null, 2, null);
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new nn(value), 4, (Object) null);
            }
        }
        return date$default;
    }
}
