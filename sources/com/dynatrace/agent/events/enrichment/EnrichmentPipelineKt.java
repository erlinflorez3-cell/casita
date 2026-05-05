package com.dynatrace.agent.events.enrichment;

import com.dynatrace.agent.events.EventModifier;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.agent.events.enrichment.merge.ModifiedJsonMerger;
import com.dynatrace.agent.events.enrichment.sanitation.JsonAttributeSanitationKt;
import com.dynatrace.agent.storage.preference.MetricsData;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
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
@Metadata(bv = {}, d1 = {"Яb\u001d̉=!4i\bDJc|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007|jAӄLeV=ZS8şs{:$c$\bCCU }*\t]pog|Vb\u000bY\u000f\u000eǝ\u0001j:h]xc\u001a\u00172P\u000eG3coEʠhtL\u0005(2(9\u0002\u0005\u000f\u001a2H\u0016w\u0013\tYÈ*2VohQ=Q\u0013\u001a*\u0006l\u001f1\"jhf6vn\u000e>=&\u001bipPWi>\u0001e\u0013VV7\r%gL0pEC\u001c=]\u0013\u000bb]U\u0002mzS\u0004\u0017/mǢʁwWDb\u00186#6g\r\f~V`\u0013^x\fU*\u007fsY^&4\b|\f\rj\u0014\u001e\b7H\\>HuNԄK\t\u0001eXV\u0012`R\u007f)rd*U\u0004A?Q\u001b\u0015P(ݢ1\\E\u0011\u001d\rL\"1r/ql\u000e\u000f!aƘ\u0010s?hX=vM:]K\u0004\u001cp\u0011\u000eZ\u0014>_\u0018;\f\u0013>\u0017SGk;3!\u001a\u0013vS.ϸ\u001d\u0016vl\u0002T^?PzF;8#$Zrp5y^[p6!Q,V\u001d|6\u001c6[&DQ/\u001eignyl]]8+]k}ժˇo\u000eeUvGCn{\u0016qT\u0007\u0014m[\u0011#\tjPs$Z\u000bIhõ`~\u001e\u001a\u0014J^\u000e#2m\u0011JR\\5'\u007f-H1?\tˆ\u0015!m~\u0001\u0010-y[*\u0013k4t7\u0012~o!su\u001fa,+qh-Y[C@>UP\u000e\\|Q\u0006E͞ûK\u0010"}, d2 = {"3ma6V/+c!^\f^5\f", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "@t\\\u0012i,Gb", "=uT?e0=O\u0016\u0006z:;\f\u00163b\u00107{\u001c\u0003\u0019$Gq\nK\u00012", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017\u001fJzA\"\u0012xp9be.[v)C[X92", ">q^AX*MS\u0018Z\nm9\u0001\u0006?t\u007f\u0004}B\u000e\u0017\u0019C~\u0018I", "3uT;g\u0014HR\u001d\u007f~^9\u000b", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt!Pm\u001eI\u0004%>hd$@s\u0016-9S;{4s", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\bAl\u001a/QCHA", "3uT;g\nH\\(~\u000em", "", "", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV}\u0015QwW;\u000b.1h\u000b\u001c5m_*OCDz}\u001e&hjH\u0015-,W\u0004+EOV,ea<\u0019#!g\u0012K;\u001c\u00055C&{D9\u001b\u00176VW\"f\u000b\u0014_\rIslQc\fEy^qC)qU#_\u000bGJTpsd\u0015l!Z=B$\u001d\u0001bvw_;\u000exc r.{itG\u001bvG.KCBKA\u0001Q\u0006\u00056#REu\u001c;V\u00058\u0002-\rCs\u0014n\u000eIw%K^\u0002$\u0013`J-&5(#?[cKb%\u0013d0]Q\u0015^>3bObhH\r\u00163ZB?naJ<`\u0010G\u0013T\u0003\u0011/h?`y\u0013\u0018\\", "3ma6V/#a#\blb;\u007fd>t\r,xP\u0010\u0017%", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017#Dx8\u001c\u0018h`\u001e\u0015m5,\u00010VHR5\\_H", "7m_Bg\u0011L]\"", "3ma6V/FS\"\u000eVm;\n\r,u\u000f(\n", "", "", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017#Dx8\u001c\u0018paB\u0016?;]\u0004+D\\],2", "4h]18?Ba(\u0003\u0004`\u0016\u000e\t<r\u0004'z@\n|\u0017[}", "", "8r^;", "7mc2Z9:b\u0019h\f^9\n\r.d\u007f1a@\u0015%", "8r^;66Gb\u0015\u0003\u0004^9", "7mc2Z9:b\u0019i\bh;|\u0007>e~\u0004\u000bO\u000e\u001b\u0014W~\u000eJ", ">q^AX*MS\u0018Z\nm9\u0001\u0006?t\u007f6", "/o_9l\u0014HR\u001d\u007f~\\(\f\r9n\u000e", "3ma6V/>R}\r\u0005g\n\u0007\u0012>a\u00041{M", ";nS6Y0>`'", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0017(Gx\u001dJ@%>f\u0002\u001e:u\u00167\\\r\u001btA\"\u0013ka8kq6WT1P[J0eR\u007f\u0013\nx_\n_'V\fUJ&8.4$\b*XW\"m|\u001d\u0012WEytI \u000eQ\u0003\u0013\u0006N6hOh)WQJCr7q\fh,C>C*\u0014p\u0005+h`._?:\u000f|ZCf{P\u0015\nE <m%BGo^K>'0K\u0005\u0007 {X}8x+\u0007<*?sN+p%B\\{\u0015+AO1/\u0014F\u001cNGg~lKc", "1n[9X*MA(\t\b^+d\t>r\u0004&\n.\u0011\"\"Ns\u000eI\u0005", "", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017\u001fJzA\"\u0012xp9ts7Y}+GY$", ";dc?\\*L2\u0015\u000ev", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r#kC+\u0019fo\u0018\u0003r($", "1n[9X*M1\u0015|}^+d\t>r\u0004&\n.\u0011\"\"Ns\u000eI\u0005", ";dc?\\*L1\u0015|}^", "/cS\"a0Jc\u0019[\u000fD,\u0011", "", "/sc?\\)Nb\u0019", "3mbBe,\u001ed\u0019\b\nI9\u0007\u0014/r\u000f,{N^\u001a\u0013Tk\fKv29g\r$5", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class EnrichmentPipelineKt {
    private static final void addUniqueByKey(List<EnrichmentAttribute> list, EnrichmentAttribute enrichmentAttribute) {
        Iterator<EnrichmentAttribute> it = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (Intrinsics.areEqual(it.next().getKey(), enrichmentAttribute.getKey())) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            Boolean.valueOf(list.add(enrichmentAttribute));
        } else {
            Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "key '" + enrichmentAttribute.getKey() + "' already in overridden keys list. Replacing it.");
            list.set(i2, enrichmentAttribute);
        }
    }

    public static final EnrichedJsonContainer applyModifications(EnrichedJsonContainer enrichedJsonContainer, Object[] objArr, ConcurrentLinkedQueue<EventModifier> modifiers) throws JSONException {
        String strJoinToString$default;
        Intrinsics.checkNotNullParameter(enrichedJsonContainer, "enrichedJsonContainer");
        Intrinsics.checkNotNullParameter(modifiers, "modifiers");
        if (modifiers.isEmpty()) {
            return enrichedJsonContainer;
        }
        StringBuilder sbAppend = new StringBuilder("apply modifications: with ").append(modifiers.size()).append(" modifier(s); context: ");
        if (objArr == null || (strJoinToString$default = ArraysKt.joinToString$default(objArr, ", ", "[", "]", 0, (CharSequence) null, new Function1() { // from class: com.dynatrace.agent.events.enrichment.EnrichmentPipelineKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EnrichmentPipelineKt.applyModifications$lambda$3(obj);
            }
        }, 24, (Object) null)) == null) {
            strJoinToString$default = "null";
        }
        Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, sbAppend.append(strJoinToString$default).toString());
        JSONObject jSONObjectDeepCopy = JsonObjectExtensionsKt.deepCopy(enrichedJsonContainer.getEnrichedJson());
        Iterator<EventModifier> it = modifiers.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        boolean z2 = false;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            EventModifier next = it.next();
            try {
                jSONObjectDeepCopy = next.modifyEvent(jSONObjectDeepCopy, objArr);
            } catch (Exception unused) {
                Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "apply modifications: event modifier caused exception. EventModifier: " + Reflection.getOrCreateKotlinClass(next.getClass()).getSimpleName());
                z2 = true;
            }
            if (jSONObjectDeepCopy == null) {
                Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "apply modifications: event dropped by event modifier. EventModifier: " + Reflection.getOrCreateKotlinClass(next.getClass()).getSimpleName());
                break;
            }
        }
        if (jSONObjectDeepCopy == null) {
            return null;
        }
        EnrichedJsonContainer enrichedJsonContainerMerge = new ModifiedJsonMerger(enrichedJsonContainer, JsonObjectExtensionsKt.hasCharacteristic(enrichedJsonContainer.getEnrichedJson(), EventKeys.Characteristics.HAS_SESSION_PROPERTIES)).merge(jSONObjectDeepCopy);
        if (!z2) {
            return enrichedJsonContainerMerge;
        }
        enrichedJsonContainerMerge.getEnrichedJson().put(EventKeys.DT.SUPPORT.API_HAS_ENRICH_EXCEPTION, true);
        return enrichedJsonContainerMerge;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence applyModifications$lambda$3(Object obj) {
        Class<?> cls;
        return String.valueOf((obj == null || (cls = obj.getClass()) == null) ? null : cls.getName());
    }

    public static final List<AttributeSupplier> collectCachedMetricsSuppliers(MetricsData metricsCache) {
        Intrinsics.checkNotNullParameter(metricsCache, "metricsCache");
        return CollectionsKt.listOf(new CachedMetricsSupplier(metricsCache));
    }

    public static final List<AttributeSupplier> collectStoredMetricsSuppliers(MetricsData metricsData) {
        Intrinsics.checkNotNullParameter(metricsData, "metricsData");
        return CollectionsKt.listOf(new StoredMetricsSupplier(metricsData));
    }

    public static final EnrichedJsonContainer enrichJsonWithAttributes(JSONObject inputJson, Map<String, EnrichmentAttribute> enrichmentAttributes) throws JSONException {
        Intrinsics.checkNotNullParameter(inputJson, "inputJson");
        Intrinsics.checkNotNullParameter(enrichmentAttributes, "enrichmentAttributes");
        JSONObject jSONObjectDeepCopy = JsonObjectExtensionsKt.deepCopy(inputJson);
        List<EnrichmentAttribute> listFindExistingOverriddenKeys = findExistingOverriddenKeys(jSONObjectDeepCopy);
        jSONObjectDeepCopy.remove(EventKeys.DT.SUPPORT.API_OVERRIDDEN_FIELDS);
        for (Map.Entry<String, EnrichmentAttribute> entry : enrichmentAttributes.entrySet()) {
            String key = entry.getKey();
            EnrichmentAttribute value = entry.getValue();
            Object objOpt = jSONObjectDeepCopy.opt(key);
            if (objOpt == null || objOpt.equals(value.getValue())) {
                jSONObjectDeepCopy.put(key, value.getValue());
            } else {
                Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "auto-enrichment value overwritten: " + value + " is overwritten with custom value: " + objOpt);
                if (JsonAttributeSanitationKt.getGenerationApiFields().contains(key)) {
                    addUniqueByKey(listFindExistingOverriddenKeys, value);
                }
            }
        }
        return new EnrichedJsonContainer(jSONObjectDeepCopy, listFindExistingOverriddenKeys);
    }

    public static final JSONObject enrichRumEvent(JSONObject rumEvent, AttributeAggregator overridableAttributeAggregator, AttributeAggregator protectedAttributeAggregator, ConcurrentLinkedQueue<EventModifier> eventModifiers, Object[] objArr) {
        Intrinsics.checkNotNullParameter(rumEvent, "rumEvent");
        Intrinsics.checkNotNullParameter(overridableAttributeAggregator, "overridableAttributeAggregator");
        Intrinsics.checkNotNullParameter(protectedAttributeAggregator, "protectedAttributeAggregator");
        Intrinsics.checkNotNullParameter(eventModifiers, "eventModifiers");
        Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "rum event: " + rumEvent);
        EnrichedJsonContainer enrichedJsonContainerEnrichJsonWithAttributes = enrichJsonWithAttributes(rumEvent, overridableAttributeAggregator.aggregatedAttributes());
        EnrichedJsonContainer enrichedJsonContainerCopy$default = EnrichedJsonContainer.copy$default(enrichedJsonContainerEnrichJsonWithAttributes, integrateProtectedAttributes(enrichedJsonContainerEnrichJsonWithAttributes, protectedAttributeAggregator.aggregatedAttributes()), null, 2, null);
        Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "rum event after basic enrichment: overridden attributes: " + enrichedJsonContainerEnrichJsonWithAttributes.getOverriddenAttributes() + "; event: " + enrichedJsonContainerEnrichJsonWithAttributes.getEnrichedJson());
        EnrichedJsonContainer enrichedJsonContainerApplyModifications = applyModifications(enrichedJsonContainerCopy$default, objArr, eventModifiers);
        if (enrichedJsonContainerApplyModifications == null) {
            return null;
        }
        Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "rum event after modifications: overridden attributes: " + enrichedJsonContainerApplyModifications.getOverriddenAttributes() + "; event: " + enrichedJsonContainerApplyModifications.getEnrichedJson());
        JSONObject jSONObjectIntegrateOverriddenKeys = integrateOverriddenKeys(enrichedJsonContainerApplyModifications);
        ensureEventPropertiesCharacteristic(jSONObjectIntegrateOverriddenKeys);
        Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "rum event after full enrichment: " + jSONObjectIntegrateOverriddenKeys);
        return jSONObjectIntegrateOverriddenKeys;
    }

    public static final void ensureEventPropertiesCharacteristic(JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        if (JsonObjectExtensionsKt.hasKeyIn(jSONObject, EventKeys.EVENT_PROPERTIES.NAMESPACE) && !JsonObjectExtensionsKt.hasCharacteristic(jSONObject, EventKeys.Characteristics.HAS_EVENT_PROPERTIES)) {
            jSONObject.put(EventKeys.Characteristics.HAS_EVENT_PROPERTIES, true);
        } else {
            if (!JsonObjectExtensionsKt.hasCharacteristic(jSONObject, EventKeys.Characteristics.HAS_EVENT_PROPERTIES) || JsonObjectExtensionsKt.hasKeyIn(jSONObject, EventKeys.EVENT_PROPERTIES.NAMESPACE)) {
                return;
            }
            jSONObject.remove(EventKeys.Characteristics.HAS_EVENT_PROPERTIES);
        }
    }

    public static final List<EnrichmentAttribute> findExistingOverriddenKeys(JSONObject json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        JSONArray jSONArrayOptJSONArray = json.optJSONArray(EventKeys.DT.SUPPORT.API_OVERRIDDEN_FIELDS);
        if (jSONArrayOptJSONArray == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (jSONArrayOptJSONArray.get(i2) instanceof String) {
                String string = jSONArrayOptJSONArray.getString(i2);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                arrayList.add(new EnrichmentAttribute(string, "unknown"));
            } else {
                Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "dropped existing overridden_key because it was no String: " + jSONArrayOptJSONArray.get(i2));
            }
        }
        return arrayList;
    }

    public static final JSONObject integrateOverriddenKeys(EnrichedJsonContainer jsonContainer) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonContainer, "jsonContainer");
        JSONObject enrichedJson = jsonContainer.getEnrichedJson();
        if (enrichedJson.remove(EventKeys.DT.SUPPORT.API_OVERRIDDEN_FIELDS) != null) {
            Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "protected attribute integration: encountered key 'dt.support.api.overridden_fields' which is protected and will be removed");
        }
        List<EnrichmentAttribute> overriddenAttributes = jsonContainer.getOverriddenAttributes();
        if (overriddenAttributes.isEmpty()) {
            return enrichedJson;
        }
        List<EnrichmentAttribute> list = overriddenAttributes;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((EnrichmentAttribute) it.next()).getKey());
        }
        JSONObject jSONObjectPut = enrichedJson.put(EventKeys.DT.SUPPORT.API_OVERRIDDEN_FIELDS, new JSONArray((Collection) arrayList));
        Intrinsics.checkNotNull(jSONObjectPut);
        return jSONObjectPut;
    }

    public static final JSONObject integrateProtectedAttributes(EnrichedJsonContainer jsonContainer, Map<String, EnrichmentAttribute> protectedAttributes) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonContainer, "jsonContainer");
        Intrinsics.checkNotNullParameter(protectedAttributes, "protectedAttributes");
        JSONObject enrichedJson = jsonContainer.getEnrichedJson();
        for (Map.Entry<String, EnrichmentAttribute> entry : protectedAttributes.entrySet()) {
            String key = entry.getKey();
            EnrichmentAttribute value = entry.getValue();
            if (enrichedJson.has(key)) {
                Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "protected attribute integration: encountered key '" + key + "' which is protected and will be overwritten with " + value);
            }
            enrichedJson.put(key, value.getValue());
        }
        return enrichedJson;
    }
}
