package com.dynatrace.agent.events.enrichment;

import com.dynatrace.agent.communication.network.response.JsonExtensionKt;
import com.dynatrace.agent.di.SelfMonitoringComponent;
import com.dynatrace.agent.events.enrichment.sanitation.AttributeSanitizer;
import com.dynatrace.agent.events.enrichment.sanitation.JsonAttribute;
import com.dynatrace.agent.events.enrichment.sanitation.JsonAttributeKt;
import com.dynatrace.agent.events.enrichment.sanitation.SanitationContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯP\u001d̉=!4i\bDZc|İI\u0006>é6B\u0005\"4\u0012\u000e\u0007nʑA0RtP.hS2\u000fq|<$q$yّCU(\u0007*ޛWNusvJ`\fK\u000f\u0014\u0016\u0001j2L]xk0\u0017˰JoU3UڎUCnҚN\u0005N1J8(\u0004GɝBR\u001e͌\u0013Cy\f:0np\u0001ĥ%[\u0013\u001b*\u0006l\"1\"jjf6vn$ŽG@\u0011mZNUdX|{\rv^5\u0013\u000fg.-P7c\u001dSZIޗқ_?\u0011H\nO\u0013r?'YI\u001cWdX0\u0018#6g\r\f~lؘ\u001dcn\u0019?+}qsP<((~\n\u001cT\u0004<\u0016mΞF?(w \u000ea\u0003\u001bSnP2bP\u0012\u0013ad'kĮK=G.~Q\u0010OANe{5\u0011,8\u0019nO[\u001bוxA)j\u0010Q_QpAVe\"Ykm4tp\u001aB\u0004^G09\n*F\u001d59k9Q1\u001a\u001cxHu\u0012\u001d`\u0017o0ɭ͛D?"}, d2 = {"2dT=66Ig", "\u001ana4\"1L]\"H_L\u0016ed<r{<Q", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "1n_F=:H\\\nz\u0002n,", "", "D`[BX", "A`]6g0SS\u0018]z^7Z\u0013:y", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017Q7t8-\u0011weC\u0010-\u001aJ\u007f+VH]0f[PG\u001d!Z!]\u0001", "/sc?\\)Nb\u0019lvg0\f\rDe\r6", "", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017Q7t8-\u0011weC\u0010-\b]\u00064KI^;\\@nF\u0018!^#N8b", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV\r}Ey\u0016\u0006u9>U\r-3k\u0016wIE;tCg\u0015yaB\u0016quN\u007f4KJQ4\\[\u0002\u0007\"\u000ec\u0012]'\u001c\tcJmJSF,\f)Y\u0011;V|\u0015\u001a\u001d9\u007fpO,S.w\u001f}\u000b(|OUn\u0007C?E,&f\fh,&:K$\u001d\u0001'dhY;\u000eyV\u0019r[\t1uC\"~G MqeO\u000f]QEx6\u001bZ\u007f\u0002\u001b\u0010b}:t@\u0013\n", ">tc", "8r^;4;M`\u001d{\u000bm,", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017Q7t8-\u0011weC\u0010-\u0011\\\u00010#[]9`O\u0003L\u0014g", "6`b\u0010[(KO\u0017\u000ezk0\u000b\u00183c", "", "9dh", "", "6`b\u0018X@\"\\", "<`\\2f7:Q\u0019", ">tc\u000e_3\u001ab(\f~[<\f\t=O\u0001", "", "=sW2e", "5dc\u001aX9@S\u0018l\nZ9\f\u0019:E\u0011(\u0005Oj$\u007fC~\u0012Mv", "<`c6i,\u001ed\u0019\b\n", "1o4CX5M", "1o:2l:", "", "Ad[3@6GW(\t\bb5~", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u007f\u001b`5o\u0015=^/>]\r*Dq\u001f0+MCv>'\u0015qp\u000f", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class JsonObjectExtensionsKt {
    public static final Object copyJsonValue(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value instanceof JSONArray ? deepCopy((JSONArray) value) : value instanceof JSONObject ? deepCopy((JSONObject) value) : value;
    }

    public static final JSONArray deepCopy(JSONArray jSONArray) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = jSONArray.get(i2);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            jSONArray2.put(copyJsonValue(obj));
        }
        return jSONArray2;
    }

    public static final JSONObject deepCopy(JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            jSONObject2.put(next, copyJsonValue(obj));
        }
        return jSONObject2;
    }

    public static final JSONObject getMergedStartupEventOrNative(JSONObject nativeEvent, JSONObject cpEvent, List<String> cpKeys, SelfMonitoringComponent selfMonitoring) throws JSONException {
        Intrinsics.checkNotNullParameter(nativeEvent, "nativeEvent");
        Intrinsics.checkNotNullParameter(cpEvent, "cpEvent");
        Intrinsics.checkNotNullParameter(cpKeys, "cpKeys");
        Intrinsics.checkNotNullParameter(selfMonitoring, "selfMonitoring");
        long jOptLong = nativeEvent.optLong(EventKeys.START_TIME);
        long jOptLong2 = cpEvent.optLong(EventKeys.START_TIME);
        if (jOptLong2 < jOptLong) {
            selfMonitoring.reportLogEvent("CrossPlatformStartEventEarly", "Cross Platform app start has a smaller start time " + jOptLong2 + " than native " + jOptLong);
            return nativeEvent;
        }
        long jOptLong3 = nativeEvent.optLong("duration") + jOptLong;
        long jOptLong4 = cpEvent.optLong("duration") + jOptLong2;
        long j2 = jOptLong2 - jOptLong;
        Iterator<String> itKeys = cpEvent.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (cpKeys.contains(next)) {
                Intrinsics.checkNotNull(next);
                if (JsonExtensionKt.getLongOrNull(cpEvent, next) != null) {
                    nativeEvent.put(next, cpEvent.getLong(next) + j2);
                }
            }
            nativeEvent.put(next, cpEvent.get(next));
        }
        long jMax = Math.max(jOptLong3, jOptLong4);
        nativeEvent.put(EventKeys.START_TIME, jOptLong);
        nativeEvent.put("duration", jMax - jOptLong);
        return nativeEvent;
    }

    public static final boolean hasCharacteristic(JSONObject jSONObject, String key) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            if (!jSONObject.has(key)) {
                return false;
            }
            Object obj = jSONObject.get(key);
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            return false;
        } catch (JSONException unused) {
            return false;
        }
    }

    public static final boolean hasKeyIn(JSONObject jSONObject, String namespace) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        for (String str : SequencesKt.asSequence(itKeys)) {
            Intrinsics.checkNotNull(str);
            if (StringsKt.startsWith$default(str, namespace, false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    public static final JSONObject put(JSONObject jSONObject, JsonAttribute jsonAttribute) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(jsonAttribute, "jsonAttribute");
        JSONObject jSONObjectPut = jSONObject.put(jsonAttribute.getKey(), jsonAttribute.getValue());
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    public static final void putAllAttributesOf(JSONObject jSONObject, JSONObject other) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Iterator<String> itKeys = other.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            jSONObject.put(next, other.get(next));
        }
    }

    public static final SanitationContext sanitizedDeepCopy(JSONObject jSONObject, AttributeSanitizer[] attributeSanitizers) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(attributeSanitizers, "attributeSanitizers");
        JSONObject jSONObject2 = new JSONObject();
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Intrinsics.checkNotNull(next);
            Object obj = jSONObject.get(next);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            JsonAttribute jsonAttribute = new JsonAttribute(next, copyJsonValue(obj));
            JsonAttribute jsonAttributeApplySanitizers = JsonAttributeKt.applySanitizers(jsonAttribute, attributeSanitizers);
            if (jsonAttributeApplySanitizers != null) {
                put(jSONObject2, jsonAttributeApplySanitizers);
            } else {
                Boolean.valueOf(arrayList.add(jsonAttribute));
            }
        }
        return new SanitationContext(jSONObject2, arrayList);
    }
}
