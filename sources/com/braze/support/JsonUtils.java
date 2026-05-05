package com.braze.support;

import android.os.Bundle;
import bo.app.a40;
import bo.app.b40;
import bo.app.c40;
import bo.app.d40;
import bo.app.e40;
import bo.app.f40;
import bo.app.g40;
import bo.app.h40;
import bo.app.i40;
import bo.app.y30;
import bo.app.z30;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
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
@Metadata(bv = {}, d1 = {"Яj\u001d̉=!,u\bӵLc\u0003\rIي8\u000bDB\u0007\"2\u0016\u007f\u0007txA0JiP.hS2\u000fq{<$q$yّCU(\r*ޛWNu\u0004vJp\u000bKƤ\u000e\u0016\u0007\r4կ]xk0\u00172HoG3[uE9ft>\u0005.6*8\u007f\b\t\u001a8n\u0018͌\u0003Ca\f\u001a0FqRj\u001bM\u001d\u001a@\u0007n&\u000f tid5vo\u000e@='\u001bkXMUbH\u0011[\u0012^TU\u0010'e,1X7c\u0018UW\u0011\u000ej[m\u0006W\"K\r\u0001)=*\u0010|wD^Ü\"\u001eAN5c\u0003(l\u0005\u0018i:1[SqVh\u000eVz+\u007f\u001bH\u001c\u000e4&\u000f͚3բj\b\u001c@\r)aHh\u0002%K \tgا%.\u00162S?+haa\u0002\"|A,\t\u001b);\u0001\u001d$\fX\u001cl-\u001b\u0003v\u00025_NUH\u0015\u0013 Ƥsձtb\u00109\u001cqU\bG{W773=كG,Is\u0012JTg=\u000evg\u0002s\u0003LN-\u0007\u0016e-9\u0010hP|\u0005\u001aO\u0005b:!e\"d\t\u000e\bY)\u000b\tl%3\u001efO/rҷQ]\u00187G\u007fEl\u0007k<kY`9̐_x8gbx$?\u0003w3nڋFS\u001aqtB0E`j>\f\u001cFTۼ!Gg},<<7)^%HI3pZ+!wpv*\u0017`C&\u0013iRs\u0019\u0003`\\\u001fn\u0016\u0014q.\u0013_P0YaC5>[2jD|Q\u0006-\u0011(I}Ku`\u0005\u001e\u0004s\u0014 D\u001daQ]@+*\rHJ\u0004CDz\u0013\u000eQ{\u0015W\u0001\u000b\u0006'=~-\u0016\u00071uݽdjXpl00\u0019vt9\u0007\u0013#\"at}wib\u0017s@_q1X\u0084R8\u000b)723&\b$\u00134[BO\u001dDzD5#muk\u0006-(a'0\u0003\f\u001c,\u0012\u0015\u0018dg\\`OPSg%V\"Rk+D^i&\u000bZ\u001dB4KHoe\u0019XNL92.l\u00157%rlZh\u0016\b\u0019BVw0\u0004E\u000e\u0014%XS:mWmƚ{`r\nr\u0011 \n*E5ܥ$U9d\u007fz\u000f@\b\u0004\u0018|Vi\f%@\u000fӗBAR\u00073C\u0003lLؒ\u0003\u0018Pm9/2p\u001fcX$S'[n[\u0013\r]`O-)~=6N|C^\u001dmtWuѹ2!_+̿3j}}=ފ-\u05ffX9#ι\u0098\u00059"}, d2 = {"\"@6", "", "/qT\u0017f6G=\u0016\u0004z\\;\u000bh;u{/", "", "B`a4X;", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "And?V,", ";da4X\u0011L]\"hwc,z\u0018=", "=kS\u0017f6G", "<df\u0017f6G", "=oc\u0012a<F", "\"`a4X;\u001e\\)\u0007", "", "8r^;B)CS\u0017\u000e", "9dh", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV}\u001cC\u0001\n\u0006}!>[G\u000eFz\u001a7O\u0019~R9\u001a&d+@\u0003l.\u0018V0WT$", "2dU.h3M3\"\u000f\u0003", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV}\u001cC\u0001\n\u0006}!>[G\u000eFz\u001a7O\u0019\"p0/\u00112h5\u0010eu.\u007f7O\"\u0012\u0013aN\u00049]\u0019V\u0017Ptl\u000eiIy", "B`a4X;\u001e\\)\u0007Xe(\u000b\u0017", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV}\u001cC\u0001\n\u0006}!>[G\u000eFz\u001a7O\u0019\"p0/\u00112h5\u0010eu,}#UZ$\u0013aN\u00049]\u0019V\u0017Ptl\u000eiIy2+<\u001b\u0019(\u0013\t7q\u0003Uu\u0017ErF", "1n]@g9NQ(c\th5X\u0016<a\u0014", "\u001ana4\"1L]\"H_L\u0016ed<r{<Q", "\"", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g!$I9\u0013J\u0001.~>k\n I#;IW\u0011", "", "\u001ab^:\")KO.~Df6{\t6sI\ffP\u0010z VyrJ\u0001.\u000b", "1n]CX9M8\u0007hcH)\u0002\t-tn2c<\f", "", "1n]CX9MA(\f~g.a\u00179n[5\t<\u0015\u0006!.s\u001cK", "", "2dT=V6Ig", "5dc\u0010b3H`|\b\n^.|\u0016\u0019rh8\u0003G", "", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV}\u001cC\u0001\n\u0006}!>[G\u000eFz\u001a7O\u0019~R9\u001a&d+@\u0003l.\u0018Z0VLP,i(", "5dc\u0011b<;Z\u0019h\bG<\u0004\u0010", "", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV}\u001cC\u0001\n\u0006}!>[G\u000eFz\u001a7O\u0019~R9\u001a&d+@\u0003l.\u0018U1WIU,2", "5dc\u001cc;B]\"z\u0002L;\n\r8g", "5dc\u001de,Mb-i\bb5\f\t.S\u000f5\u007fI\u0003", "7r4>h(EB#", "7sT?T;H`", "", ">`a@X\u0011L]\"hwc,z\u0018\u0013n\u000f2XP\n\u0016\u001eG", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", ">kd@", "=sW2e\u0011L]\"", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class JsonUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("JsonUtils");

    public static final boolean areJsonObjectsEqual(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null || jSONObject.length() != jSONObject2.length()) {
            return false;
        }
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "target.keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!jSONObject2.has(next)) {
                return false;
            }
            Object objOpt = jSONObject.opt(next);
            Object objOpt2 = jSONObject2.opt(next);
            if ((objOpt instanceof JSONObject) && (objOpt2 instanceof JSONObject)) {
                if (!isEqualTo((JSONObject) objOpt, (JSONObject) objOpt2)) {
                    return false;
                }
            } else if (objOpt != null && objOpt2 != null && !Intrinsics.areEqual(objOpt, objOpt2)) {
                return false;
            }
        }
        return true;
    }

    public static final <T> JSONArray constructJsonArray(Collection<? extends IPutIntoJson<T>> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        JSONArray jSONArray = new JSONArray();
        Iterator<? extends IPutIntoJson<T>> it = collection.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().forJsonPut());
        }
        return jSONArray;
    }

    public static final <T> JSONArray constructJsonArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        JSONArray jSONArray = new JSONArray();
        for (T t2 : tArr) {
            jSONArray.put(t2);
        }
        return jSONArray;
    }

    public static final Map<String, String> convertJSONObjectToMap(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "this.keys()");
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            Intrinsics.checkNotNullExpressionValue(key, "key");
            String string = jSONObject.getString(key);
            Intrinsics.checkNotNullExpressionValue(string, "this.getString(key)");
            linkedHashMap.put(key, string);
        }
        return linkedHashMap;
    }

    public static final List<String> convertStringJsonArrayToList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            try {
                String string = jSONArray.getString(i2);
                Intrinsics.checkNotNullExpressionValue(string, "this.getString(i)");
                arrayList.add(string);
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new y30(i2, jSONArray), 8, (Object) null);
            }
        }
        return arrayList;
    }

    public static final JSONObject deepcopy(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        return new JSONObject(jSONObject.toString());
    }

    public static final Integer getColorIntegerOrNull(JSONObject jSONObject, String str) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Integer numValueOf = null;
        if (str == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            numValueOf = Integer.valueOf(jSONObject.getInt(str));
            return numValueOf;
        } catch (Throwable th) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, th, false, (Function0) z30.f2344a, 8, (Object) null);
            return numValueOf;
        }
    }

    public static final Double getDoubleOrNull(JSONObject jSONObject, String str) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return Double.valueOf(jSONObject.optDouble(str));
    }

    public static final String getOptionalString(JSONObject jSONObject, String str) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    public static final String getPrettyPrintedString(JSONArray jSONArray) {
        String string = "";
        if (jSONArray != null) {
            try {
                string = jSONArray.toString(2);
            } catch (Throwable th) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, th, false, (Function0) b40.f241a, 8, (Object) null);
            }
            Intrinsics.checkNotNullExpressionValue(string, "try {\n        this.toStr…ring.\" }\n        \"\"\n    }");
        }
        return string;
    }

    public static final String getPrettyPrintedString(JSONObject jSONObject) {
        String string = "";
        if (jSONObject != null) {
            try {
                string = jSONObject.toString(2);
            } catch (Throwable th) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, th, false, (Function0) a40.f170a, 8, (Object) null);
            }
            Intrinsics.checkNotNullExpressionValue(string, "try {\n        this.toStr…ring.\" }\n        \"\"\n    }");
        }
        return string;
    }

    public static final boolean isEqualTo(JSONObject jSONObject, JSONObject jSONObject2) {
        return areJsonObjectsEqual(jSONObject, jSONObject2);
    }

    public static final /* synthetic */ <T> Iterator<T> iterator(JSONArray jSONArray) {
        if (jSONArray == null) {
            return CollectionsKt.emptyList().iterator();
        }
        Sequence sequenceAsSequence = CollectionsKt.asSequence(RangesKt.until(0, jSONArray.length()));
        Intrinsics.needClassReification();
        Sequence sequenceFilter = SequencesKt.filter(sequenceAsSequence, new c40(jSONArray));
        Intrinsics.needClassReification();
        return SequencesKt.map(sequenceFilter, new d40(jSONArray)).iterator();
    }

    public static final /* synthetic */ <T> Iterator<T> iterator(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "this.keys()");
        Sequence sequenceAsSequence = SequencesKt.asSequence(itKeys);
        Intrinsics.needClassReification();
        Sequence sequenceFilter = SequencesKt.filter(sequenceAsSequence, new e40(jSONObject));
        Intrinsics.needClassReification();
        return SequencesKt.map(sequenceFilter, new f40(jSONObject)).iterator();
    }

    public static final JSONObject mergeJsonObjects(JSONObject oldJson, JSONObject newJson) {
        Intrinsics.checkNotNullParameter(oldJson, "oldJson");
        Intrinsics.checkNotNullParameter(newJson, "newJson");
        JSONObject jSONObject = new JSONObject();
        Iterator<String> itKeys = oldJson.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "oldJson.keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                jSONObject.put(next, oldJson.get(next));
            } catch (JSONException e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new g40(next), 8, (Object) null);
            }
        }
        Iterator<String> itKeys2 = newJson.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys2, "newJson.keys()");
        while (itKeys2.hasNext()) {
            String next2 = itKeys2.next();
            try {
                jSONObject.put(next2, newJson.get(next2));
            } catch (JSONException e3) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) new h40(next2), 8, (Object) null);
            }
        }
        return jSONObject;
    }

    public static final /* synthetic */ <TargetEnum extends Enum<TargetEnum>> TargetEnum optEnum(JSONObject jsonObject, String key) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            e eVar = e.f2703a;
            String string = jsonObject.getString(key);
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
            String str = string;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            Locale locale = US;
            Intrinsics.checkNotNullExpressionValue(string.toUpperCase(US), "this as java.lang.String).toUpperCase(locale)");
            Intrinsics.reifiedOperationMarker(5, "TargetEnum");
            Enum[] enumArr = new Enum[0];
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Exception unused) {
            return null;
        }
    }

    public static final <TargetEnum extends Enum<TargetEnum>> TargetEnum optEnum(JSONObject jsonObject, String key, Class<TargetEnum> targetEnumClass, TargetEnum targetenum) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(targetEnumClass, "targetEnumClass");
        try {
            String string = jsonObject.getString(key);
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String enumValue = string.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(enumValue, "this as java.lang.String).toUpperCase(locale)");
            Intrinsics.checkNotNullParameter(enumValue, "enumValue");
            Intrinsics.checkNotNullParameter(targetEnumClass, "targetEnumClass");
            TargetEnum targetenum2 = (TargetEnum) Enum.valueOf(targetEnumClass, enumValue);
            return targetenum2 == null ? targetenum : targetenum2;
        } catch (Exception unused) {
            return targetenum;
        }
    }

    public static final /* synthetic */ <TargetEnum extends Enum<TargetEnum>> TargetEnum optEnum(JSONObject jsonObject, String key, TargetEnum defaultEnum) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultEnum, "defaultEnum");
        try {
            e eVar = e.f2703a;
            String string = jsonObject.getString(key);
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
            String str = string;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            Locale locale = US;
            Intrinsics.checkNotNullExpressionValue(string.toUpperCase(US), "this as java.lang.String).toUpperCase(locale)");
            Intrinsics.reifiedOperationMarker(5, "TargetEnum");
            Enum[] enumArr = new Enum[0];
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Exception unused) {
            return defaultEnum;
        }
    }

    public static final Bundle parseJsonObjectIntoBundle(String str) {
        Bundle bundle = new Bundle();
        if (str != null && !StringsKt.isBlank(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle.putString(next, jSONObject.getString(next));
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) i40.f870a, 8, (Object) null);
            }
        }
        return bundle;
    }

    public static final JSONObject plus(JSONObject jSONObject, JSONObject otherJson) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(otherJson, "otherJson");
        return mergeJsonObjects(jSONObject, otherJson);
    }
}
