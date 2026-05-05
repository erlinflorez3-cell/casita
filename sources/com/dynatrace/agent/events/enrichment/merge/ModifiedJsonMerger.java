package com.dynatrace.agent.events.enrichment.merge;

import com.dynatrace.agent.events.enrichment.EnrichedJsonContainer;
import com.dynatrace.agent.events.enrichment.EnrichmentAttribute;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.agent.events.enrichment.JsonObjectExtensionsKt;
import com.dynatrace.agent.events.enrichment.sanitation.AttributeRetentionRule;
import com.dynatrace.agent.events.enrichment.sanitation.AttributeSanitizer;
import com.dynatrace.agent.events.enrichment.sanitation.JsonAttribute;
import com.dynatrace.agent.events.enrichment.sanitation.JsonAttributeKt;
import com.dynatrace.agent.events.enrichment.sanitation.JsonAttributeSanitationKt;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я^\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r+4\u0012}\bnjO0L͜P.`r2\u000f\u0002{<řc$\u007fOC٥\"}0\u000fWȞog\u0005JbŏK\u000f\u0014%\u0001jBI]xc\u001a\u00172PoG\u074cUoS9ht<\u0010(20V\u0002\u0005\u0007\u001a0Ϻ&͌+Cy\u000bREPtHR%M3\u001b\"\nL\"\u0019\u001e\u000bjߑ:JraH4k\u001cwZf-o2\rM;Y\u00039=zo7C@eC[%٨\u0007\u0007`u\b\u000fM\rU\u0005\u0017(W/W\u0010o6\u0007\u0007\\#9l%]!D\r\t_\u007f$'Yo*K\u0019\u001c6\u0019\u0013{;Z4\u0012\u0014F`.[:-\bV9\u0003\u0015k@~ %BH\toY/%.Q[=)\u000biai%\u00157D\u0013\u001bC;\u0001\u001d?\fX\u001c\u0007-\u001b\u0003\u0018\u00181\u001aVKof\n\b[\u001e\b~\u0007\u001a*2<w\u0004=\").EE}[\u00025/\u0014\u001aHrj\u001f\u0005\u000ft\u0004m`qX\"\u001d\u001d}*Q\u001ehn|\u0005\u001aS|XZ1} b2\u0016\bA'#w\u0005+3<fO\u0017l\u0013M\f*k//Og\u001c\u0004\u0014g;n3c[\u0012>\nR%\u001bo@p!pfpZRZ%20a`j>z$D|\u0018Y2\u0010}*6D1G_kȀ\u0005ٿFA\u0005ȁ0fv\u0016\u0017Ta+Yǰ&ڲ\r\u0001XʔA\u0002u\u0001a2\rb2-o[c\"|š$מ8|+ȔO\u0006\u000eR\u007fRWN|\u0016$a*)l֠;ֺ3=\u001bÁO5@\u000fEEz\u0001<ʻYɟ+z\u0005Ȫ_Gv=\u007f\b\u0019\u0001\u0003ߏlߝST\u001fǱGr\u00014 j\u0010{qF)Z\u0012faϸ@ϗv\u0005a<\\LM\u0019-3=\u0007\u007f$\r5[VU/lߓ\u0016ڏ\u0019cei}BJt\u001d<\re2/\u001aVF̨SЄ6?PK_\u0015L9٣p3"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017K;x6\u001e^Pk8\u000bd0Nu\fUVW\u0014\\_t=!g", "", "0`b2=:H\\v\t\u0004m(\u0001\u0012/r", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017#Dx8\u001c\u0018h`\u001e\u0015m5,\u00010VHR5\\_H", "7rB2f:B]\"i\bh7|\u0016>i\u007f6[Q\u0001 &", "", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0017(Gx\u001dJ@%>f\u0002\u001e:u\u00167\\\r\u001btA\"\u0013ka8kq6WT1P[J0eR\u007f\u0013\tUK", "0`b2=:H\\", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "=uT?e0=R\u0019\bVm;\n\r,u\u000f(\n", "", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017#Dx8\u001c\u0018paB\u0016?;]\u0004+D\\],2", "2q^=c,=/(\u000e\bb)\r\u0018/s", "", "/cS2W\bMb&\u0003wn;|\u0017", "", "/k[<j,=<\u0015\u0007zl7x\u0007/", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017Q7t8-\u0011weC\u0010-\b]\u00064KI^;\\?rL\u0014\u001bi\u0012X4y\u0015`Ay", "1gP;Z,=/(\u000e\bb)\r\u0018/S{1\u007fO\u0005,\u0017T}", "", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017Q7t8-\u0011weC\u0010-\b]\u00064KI^;\\@nF\u0018!^#N8b", ")KR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0017(Gx\u001dJ@%>f\u0002\u001e:u\u00167\\\rIg=\"$dp=\u0011lu*\u00066TPK<kR`9\u001d\u0016i\u0012c+\u001aZ", "<df\u000eg;KW\u0016\u000f\n^\u001ax\u00123t\u0004={M\u000f", "7rC<b\u0014:\\-Z\nm9\u0001\u0006?t\u007f6W?\u007f\u0017\u0016", "u(I", "1gP;Z,=/(\u000e\bb)\r\u0018/S{1\u007fO\u0005,\u0017T}nF\u0004\u00069Y\u0005\u001fE_\u001a=P\u001fBr\u0010/\u0011lh5\u0004j,<\u0002#EL", "=qX4\\5:Z\u007f~\u0004`;\u007f", "uH\u0018(?*H[b}\u000fg(\f\u0016+c\u007fqwB\u0001 &\u0011o\u001f<\u007f4C#})Dq\u00141UCDz},\u0011qeH\u0003r0X\u007fp#[]9`O\u0003L\u0014\u007fV\u0017R:\u0011\u001aYNy", ";da4X", ";nS6Y0>R}\r\u0005g", ";da4X\u0015>et\u000e\nk0y\u0019>e", "", "8r^;4;M`\u001d{\u000bm,", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017Q7t8-\u0011weC\u0010-\u0011\\\u00010#[]9`O\u0003L\u0014g", ";da4X\u0014HR\u001d\u007f~^+X\u0018>r\u0004%\fO\u0001", "Adc\u0015T:\u001d`#\n\u0006^+]\r/l~6\\G|\u0019", "2q^=", "9dh", "/cS\u001bX>\u001ab(\f~[<\f\t", "A`]6g0SS\u0018Z\nm9\u0001\u0006?t\u007f", "=uT?j9Bb\u0019Z\nm9\u0001\u0006?t\u007f", "7r=2j\u001bH", "8r^;B)CS\u0017\u000e", "6`b\u0010[(GU\u0019}", "4q^:=:H\\", "6`b\u001cc,G;#}~_0|\b\u0010i\u007f/z2\u0005&\u001a#v\u0015\u0018\b!9`y\u001d>m\u00049IA;", "4h]1E,F]*~y:;\f\u00163b\u00107{N", "", "7r09_6PS\u0018m\u0005;,i\t7o\u0011(z", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ModifiedJsonMerger {
    private int addedAttributes;
    private final AttributeRetentionRule allowedNamespace;
    private final JSONObject baseJson;
    private final AttributeSanitizer[] changedAttributeSanitizers;
    private final List<String> droppedAttributes;
    private final boolean isSessionPropertiesEvent;
    private final AttributeSanitizer[] newAttributeSanitizers;
    private final List<EnrichmentAttribute> overriddenAttributes;

    public ModifiedJsonMerger(EnrichedJsonContainer baseJsonContainer, boolean z2) {
        Intrinsics.checkNotNullParameter(baseJsonContainer, "baseJsonContainer");
        this.isSessionPropertiesEvent = z2;
        this.baseJson = baseJsonContainer.getEnrichedJson();
        this.overriddenAttributes = CollectionsKt.toMutableList((Collection) baseJsonContainer.getOverriddenAttributes());
        this.droppedAttributes = new ArrayList();
        AttributeRetentionRule sessionPropertiesNamespace = z2 ? JsonAttributeSanitationKt.getSessionPropertiesNamespace() : JsonAttributeSanitationKt.getEventPropertiesNamespace();
        this.allowedNamespace = sessionPropertiesNamespace;
        this.changedAttributeSanitizers = new AttributeSanitizer[]{JsonAttributeSanitationKt.removeAllAttributes(new AttributeRetentionRule[]{sessionPropertiesNamespace, JsonAttributeSanitationKt.getFieldsAllowedInModificationApi()}), JsonAttributeSanitationKt.getRemoveNestedJsonObjectAndArrays(), JsonAttributeSanitationKt.trimTooLongStringValues$default(0, 1, null)};
        this.newAttributeSanitizers = new AttributeSanitizer[]{JsonAttributeSanitationKt.removeAllAttributes(new AttributeRetentionRule[]{sessionPropertiesNamespace}), JsonAttributeSanitationKt.getRemoveAttributeWithExceedingKeySize(), JsonAttributeSanitationKt.getRemoveAttributesWithInvalidKeys(), JsonAttributeSanitationKt.getRemoveNestedJsonObjectAndArrays(), JsonAttributeSanitationKt.trimTooLongStringValues$default(0, 1, null)};
    }

    private final void addNewAttribute(JsonAttribute jsonAttribute) throws JSONException {
        JsonObjectExtensionsKt.put(this.baseJson, jsonAttribute);
        this.addedAttributes++;
    }

    private final AttributeSanitizer[] changedAttributeSanitizersForFieldsWithAllAvailableSpace(int i2) {
        return new AttributeSanitizer[]{JsonAttributeSanitationKt.removeAllAttributes(new AttributeRetentionRule[]{this.allowedNamespace, JsonAttributeSanitationKt.getFieldsAllowedInModificationApi()}), JsonAttributeSanitationKt.getRemoveNestedJsonObjectAndArrays(), JsonAttributeSanitationKt.trimTooLongStringValues(i2)};
    }

    private final void drop(String str) {
        this.droppedAttributes.add(str);
    }

    private final List<EnrichmentAttribute> findRemovedAttributes(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!jSONObject2.has(next)) {
                Intrinsics.checkNotNull(next);
                if (isAllowedToBeRemoved(next)) {
                    Object obj = jSONObject.get(next);
                    Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                    arrayList.add(new EnrichmentAttribute(next, obj));
                    arrayList2.add(next);
                    Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "merge modifications: attribute '" + next + "' has been removed by event modifier");
                } else {
                    Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "merge modifications: removing of protected attribute '" + next + "' is not allowed and thus ignored");
                }
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            jSONObject.remove((String) it.next());
        }
        return arrayList;
    }

    private final boolean hasChanged(JsonAttribute jsonAttribute, JSONObject jSONObject) {
        return !Intrinsics.areEqual(jSONObject.get(jsonAttribute.getKey()), jsonAttribute.getValue());
    }

    private final boolean hasOpenModifiedFieldWithAllAvailableSpace(JsonAttribute jsonAttribute) {
        List<String> modificationApiFieldsWithAllAvailableSpace = JsonAttributeSanitationKt.getModificationApiFieldsWithAllAvailableSpace();
        if ((modificationApiFieldsWithAllAvailableSpace instanceof Collection) && modificationApiFieldsWithAllAvailableSpace.isEmpty()) {
            return false;
        }
        Iterator<T> it = modificationApiFieldsWithAllAvailableSpace.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual((String) it.next(), jsonAttribute.getKey())) {
                return true;
            }
        }
        return false;
    }

    private final boolean isAllowedToBeRemoved(String str) {
        return this.isSessionPropertiesEvent ? StringsKt.startsWith$default(str, EventKeys.SESSION_PROPERTIES.NAMESPACE, false, 2, (Object) null) : StringsKt.startsWith$default(str, EventKeys.EVENT_PROPERTIES.NAMESPACE, false, 2, (Object) null);
    }

    private final boolean isNewTo(String str, JSONObject jSONObject) {
        return !jSONObject.has(str);
    }

    private final boolean isTooManyAttributesAdded() {
        return this.addedAttributes >= 50;
    }

    private final void mergeModifiedAttribute(JsonAttribute jsonAttribute) throws JSONException {
        if (hasChanged(jsonAttribute, this.baseJson)) {
            JsonAttribute jsonAttributeApplySanitizers = JsonAttributeKt.applySanitizers(jsonAttribute, hasOpenModifiedFieldWithAllAvailableSpace(jsonAttribute) ? changedAttributeSanitizersForFieldsWithAllAvailableSpace(this.baseJson.get(jsonAttribute.getKey()).toString().length()) : this.changedAttributeSanitizers);
            if (jsonAttributeApplySanitizers == null) {
                drop(jsonAttribute.getKey());
            } else {
                overwriteAttribute(jsonAttribute.getKey(), jsonAttributeApplySanitizers);
                Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "merge modifications: attribute '" + jsonAttribute.getKey() + "' is overwritten by " + jsonAttributeApplySanitizers);
            }
        }
    }

    private final void mergeNewAttribute(JsonAttribute jsonAttribute) throws JSONException {
        if (isTooManyAttributesAdded()) {
            Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "merge modifications: adding more than 50 attributes using event modifiers is not allowed; dropping: '" + jsonAttribute.getKey() + '\'');
            drop(jsonAttribute.getKey());
            return;
        }
        JsonAttribute jsonAttributeApplySanitizers = JsonAttributeKt.applySanitizers(jsonAttribute, this.newAttributeSanitizers);
        if (jsonAttributeApplySanitizers != null) {
            addNewAttribute(jsonAttributeApplySanitizers);
        } else {
            drop(jsonAttribute.getKey());
        }
    }

    private final void overwriteAttribute(String str, JsonAttribute jsonAttribute) throws JSONException {
        Object obj = this.baseJson.get(str);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        EnrichmentAttribute enrichmentAttribute = new EnrichmentAttribute(str, obj);
        JsonObjectExtensionsKt.put(this.baseJson, jsonAttribute);
        this.overriddenAttributes.add(enrichmentAttribute);
    }

    private final void setHasDroppedFieldsFlag() throws JSONException {
        boolean zOptBoolean = this.baseJson.optBoolean(EventKeys.DT.SUPPORT.API_HAS_DROPPED_CUSTOM_PROPERTIES);
        if (!this.droppedAttributes.isEmpty() || zOptBoolean) {
            this.baseJson.put(EventKeys.DT.SUPPORT.API_HAS_DROPPED_CUSTOM_PROPERTIES, true);
        }
    }

    public final EnrichedJsonContainer merge(JSONObject modifiedJson) throws JSONException {
        Intrinsics.checkNotNullParameter(modifiedJson, "modifiedJson");
        this.overriddenAttributes.addAll(findRemovedAttributes(this.baseJson, modifiedJson));
        Iterator<String> itKeys = modifiedJson.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        for (String str : SequencesKt.sorted(SequencesKt.asSequence(itKeys))) {
            Object obj = modifiedJson.get(str);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            Object objCopyJsonValue = JsonObjectExtensionsKt.copyJsonValue(obj);
            Intrinsics.checkNotNull(str);
            JsonAttribute jsonAttribute = new JsonAttribute(str, objCopyJsonValue);
            if (isNewTo(str, this.baseJson)) {
                mergeNewAttribute(jsonAttribute);
            } else {
                mergeModifiedAttribute(jsonAttribute);
            }
        }
        setHasDroppedFieldsFlag();
        return new EnrichedJsonContainer(this.baseJson, this.overriddenAttributes);
    }
}
