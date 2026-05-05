package com.dynatrace.agent.events.enrichment.sanitation;

import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.agent.events.enrichment.JsonObjectExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!4i\bDZc|\u0004G\u0006H\u0015<Ȑ\u0017\"Z\u0011 \u0007\u0015j\u007fӄ\\oV/jSX\u000e\u0014{b$\"ҕڷG="}, d2 = {"A`]6g0SS\u0007~\tl0\u0007\u0012\u001ar\n3{M\u0010\u001b\u0017U", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017Q7t8-\u0011weC\u0010-\u001aJ\u007f+VH]0f[PG\u001d!Z!]\u0001", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "A`]6g0SS\u0006\u000f\u0003>=|\u0012>", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class SanitationStrategiesKt {
    public static final SanitationContext sanitizeRumEvent(JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        SanitationContext sanitationContextTrimFields = JsonAttributeSanitationKt.trimFields(JsonObjectExtensionsKt.sanitizedDeepCopy(jSONObject, new AttributeSanitizer[]{JsonAttributeSanitationKt.removeAllAttributes(new AttributeRetentionRule[]{JsonAttributeSanitationKt.getFieldsAllowedInGenerationApi(), JsonAttributeSanitationKt.getEventPropertiesNamespace()}), JsonAttributeSanitationKt.getRemoveAttributeWithExceedingKeySize(), JsonAttributeSanitationKt.getRemoveAttributesWithInvalidKeys(), JsonAttributeSanitationKt.getRemoveNestedJsonObjectAndArrays(), JsonAttributeSanitationKt.trimTooLongStringValues$default(0, 1, null)}), EventKeys.EVENT_PROPERTIES.NAMESPACE);
        if (!sanitationContextTrimFields.getDroppedAttributes().isEmpty()) {
            sanitationContextTrimFields.getSanitizedJson().put(EventKeys.DT.SUPPORT.API_HAS_DROPPED_CUSTOM_PROPERTIES, true);
        }
        return sanitationContextTrimFields;
    }

    public static final SanitationContext sanitizeSessionProperties(JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        SanitationContext sanitationContextTrimFields = JsonAttributeSanitationKt.trimFields(JsonObjectExtensionsKt.sanitizedDeepCopy(jSONObject, new AttributeSanitizer[]{JsonAttributeSanitationKt.removeAllAttributes(new AttributeRetentionRule[]{JsonAttributeSanitationKt.getFieldsAllowedInGenerationApi(), JsonAttributeSanitationKt.getSessionPropertiesNamespace()}), JsonAttributeSanitationKt.getRemoveAttributeWithExceedingKeySize(), JsonAttributeSanitationKt.getRemoveAttributesWithInvalidKeys(), JsonAttributeSanitationKt.getRemoveNestedJsonObjectAndArrays(), JsonAttributeSanitationKt.trimTooLongStringValues$default(0, 1, null)}), EventKeys.SESSION_PROPERTIES.NAMESPACE);
        if (!sanitationContextTrimFields.getDroppedAttributes().isEmpty()) {
            sanitationContextTrimFields.getSanitizedJson().put(EventKeys.DT.SUPPORT.API_HAS_DROPPED_CUSTOM_PROPERTIES, true);
        }
        return sanitationContextTrimFields;
    }
}
