package com.dynatrace.agent.events.enrichment.sanitation;

import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONArray;
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
@Metadata(bv = {}, d1 = {"ЯH\u001d̉=!,o\bDJd|\u0004W\u00068é6B\r@4\u0012\u0006\u0013nj?5Le^.ZS0\u0016s{J$c$wKCU(\r*\tUNog\u0005Jb\u000bI\u000f\u000e\u0016\u0007s4Icތe܈'BP\u000fW3{\bm?ftD%82P7@ڎ\u001938i(v)[{\u0016 RXvJT\u001dM3(@)\u0005ĨӘ\"\\urNZz\u0003R/Q)\u0012B|M\u00104\u000bt%F\u0003-SǸy(9hO5CN{\u00035|\"?#K\u007fܵ\u001dhU&\u0002ɡFɱ:X\bϬ57]\rurT[[Ī3В++WҪk\\\u001c)\u0010z*\f\u0013Ǌ`Ν+H6Ʀ:r\u0016\u0010Kt!V\u0017Г\u0004ެF\u007f\u0003ʨV/3\u0004K1I\u001dvQ\u0010AGS\u000eާ\u0007ڟ\")\t͙9]Z\u0015n\u001d;l\u0006ZIWP?XN8_krZ͐d͆.\n8Ϛ\u00181\u0002\u001b<\u001fEOiD;'{\u0004XD\u0016|3e?׆kʐLF*Â.90\u0015\u001abdv\u0013xhT\u0007:g۴\u001eΤ\u000b\u0004\u0010ʶ8^}K/50`]y\u0002j{k`ə1Ϭ;_v\u0088&Y?pAEqu\u001etjvBM\u0013϶\u0007ֽjH[ێr^.6@X\u000b\"\u0006\u0011\\N:!\tŮsʬ829ǉt\u0017N\u0019,Ra\u000f\u0017vrh>\u0017+՝&ғm*|է\u0019Rb\n}\u0002\u0019[:\u0018x\"[Y(ڂ\u001błY(pؔ\u0015%\r\u001b\u0002\u001agyZddlD\u000e,ݩ\"ک\u001e?YǽU\u0015\u0015\u001d7Lı1p"}, d2 = {"\u001b@G,4\u001b-@|[jM\fvn\u000fYy\u0016_5`", "", "\u001b@G,F\u001b+7\u0002`tO\bcx\u000f_m\fp ", "\u0018R>\u001bR\n.A\bhbX\r`h\u0016Dy\u000f_(d\u0006", "9dh\u001fX.>f", "\u001aj^A_0G\u001d(~\u000emui\t1e\u0013}", "5d]2e(MW#\bVi0]\r/l~6", "", "", "5dc\u0014X5>`\u0015\u000e~h5X\u00143F\u0004(\u0003?\u000f", "u(;7T=:\u001d)\u000e~euc\r=tU", ";nS6Y0<O(\u0003\u0005g\b\b\r\u0010i\u007f/zN", "5dc\u001ab+BT\u001d|vm0\u0007\u0012\u000bp\u0004\t\u007f@\b\u0016%", ";nS6Y0<O(\u0003\u0005g\b\b\r\u0010i\u007f/zNr\u001b&JK\u0015CR61]\u0005\u001c4t\u0016\u001cX?9k", "5dc\u001ab+BT\u001d|vm0\u0007\u0012\u000bp\u0004\t\u007f@\b\u0016%9s\u001d?R,<5\u000f\u001c;t\u0012+TC)v0\u001c\u0015", "Adb@\\6G>&\t\u0006^9\f\r/sh$\u0004@\u000f\"\u0013Eo", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017Q7t8-\u0011weC\u0010-\b]\u00064KI^;\\?rL\u0014\u001bi\u0012X4y\u0015`Ay", "5dc X:LW#\bek6\b\t<t\u0004(\n)|\u001f\u0017Uz\n:v", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`\u0017Xo\u0017K\u0005n5b\u000b$5p\u001e.VR\u0005y0'\u0019w]H\u000bm5\u0018R6VYR)lar*\u0014!Z\u0017]/\u0017\u000eFQ+n\u001a", "3uT;g\u0017K]$~\bm0|\u0017\u0018a\b(\nK|\u0015\u0017", "5dc\u0012i,Gb\u0004\f\u0005i,\n\u00183e\u000e\u0011wH\u0001%\"Cm\u000e", "4hT9W:\u001aZ \t\r^+`\u0012\u0011e\t(\t<\u0010\u001b!PK\u0019@", "5dc\u0013\\,ER'Z\u0002e6\u000f\t.I\t\n{I\u0001$\u0013Vs\u0018ER09", "4hT9W:\u001aZ \t\r^+`\u0012\u0017o~,|D~\u0013&Ky\u0017\u0018\u0002)", "5dc\u0013\\,ER'Z\u0002e6\u000f\t.I\t\u0010\u0006?\u0005\u0018\u001bEk\u001d@\u0001.\u0011d\u0002", "@d\\<i,'S'\u000ez]\u0011\u000b\u00138O|-{>\u0010r FK\u001bIr9C", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017Q7t8-\u0011weC\u0010-\b]\u00064KI^;\\@nF\u0018!^#N8b", "5dc\u001fX4Hd\u0019gzl;|\b\u0014s\n1e=\u0006\u0017\u0015VK\u0017;R2BU\u0012.", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`\u0017Xo\u0017K\u0005n5b\u000b$5p\u001e.VR\u0005y0'\u0019w]H\u000bm5\u0018R6VYR)lar+\u0010\u001b^\u001dR@\r\u0012/", "@d\\<i,\u001ab(\f~[<\f\t!i\u000f+[S~\u0017\u0017Fs\u0017>\\%IG\u000257", "5dc\u001fX4Hd\u0019Z\nm9\u0001\u0006?t\u007f\u001a\u007fO\u0004v*Eo\u000e;z.7?}4%q+.", "@d\\<i,\u001ab(\f~[<\f\t=W\u00047~$\n(\u0013Ns\r\"v9C", "5dc\u001fX4Hd\u0019Z\nm9\u0001\u0006?t\u007f6mD\u0010\u001azP\u0001\nCz$\u001bY\u0012.", "BqX:G6H:#\b|L;\n\r8gp$\u0003P\u0001%", "=qX4\\5:Z\u007f~\u0004`;\u007f", "@d\\<i,\u001aZ Z\nm9\u0001\u0006?t\u007f6", "9dT=", "", "uZ;0b4\bR-\bvm9x\u0007//{*{I\u0010`\u0017Xo\u0017K\u0005n5b\u000b$5p\u001e.VR\u0005y0'\u0019w]H\u000bm5\u0018R6VYR)lar*\u0014!Z\u0017]/\u0017\u000eFQ+n\u001az\u0006\u00066QK:|\n\b%\u001b1hp\fR\u0012G\u0003$?A:hOhmCGJRf(g\u0014_&k\u0004H \u001du(\u0017wT8\u0013E/ \u0002_}dwV\u0019h4-B|_[E|+", "BqX:90>Z\u0018\r", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017Q7t8-\u0011weC\u0010-\u001aJ\u007f+VH]0f[PG\u001d!Z!]\u0001", "<`\\2f7:Q\u0019", "7r??\\4Bb\u001d\u0010z", "", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class JsonAttributeSanitationKt {
    public static final int JSON_CUSTOM_FIELD_LIMIT = 50;
    private static final int MAX_ATTRIBUTE_KEY_SIZE = 100;
    public static final int MAX_STRING_VALUE_SIZE = 5000;
    private static final Regex keyRegex = new Regex("^[a-zA-Z0-9]+(?:\\.[a-zA-Z][a-zA-Z0-9]*|_[a-zA-Z0-9]+)*$");
    private static final List<String> generationApiFields = CollectionsKt.listOf("duration");
    private static final List<String> modificationApiFields = CollectionsKt.listOf((Object[]) new String[]{EventKeys.URL.FULL, EventKeys.EXCEPTION.STACK_TRACE});
    private static final List<String> modificationApiFieldsWithAllAvailableSpace = CollectionsKt.listOf(EventKeys.EXCEPTION.STACK_TRACE);
    private static final AttributeRetentionRule sessionPropertiesNamespace = new AttributeRetentionRule() { // from class: com.dynatrace.agent.events.enrichment.sanitation.JsonAttributeSanitationKt$$ExternalSyntheticLambda3
        @Override // com.dynatrace.agent.events.enrichment.sanitation.AttributeRetentionRule
        public final boolean shouldKeep(JsonAttribute jsonAttribute) {
            return JsonAttributeSanitationKt.sessionPropertiesNamespace$lambda$0(jsonAttribute);
        }
    };
    private static final AttributeRetentionRule eventPropertiesNamespace = new AttributeRetentionRule() { // from class: com.dynatrace.agent.events.enrichment.sanitation.JsonAttributeSanitationKt$$ExternalSyntheticLambda4
        @Override // com.dynatrace.agent.events.enrichment.sanitation.AttributeRetentionRule
        public final boolean shouldKeep(JsonAttribute jsonAttribute) {
            return JsonAttributeSanitationKt.eventPropertiesNamespace$lambda$1(jsonAttribute);
        }
    };
    private static final AttributeRetentionRule fieldsAllowedInGenerationApi = new AttributeRetentionRule() { // from class: com.dynatrace.agent.events.enrichment.sanitation.JsonAttributeSanitationKt$$ExternalSyntheticLambda5
        @Override // com.dynatrace.agent.events.enrichment.sanitation.AttributeRetentionRule
        public final boolean shouldKeep(JsonAttribute jsonAttribute) {
            return JsonAttributeSanitationKt.fieldsAllowedInGenerationApi$lambda$2(jsonAttribute);
        }
    };
    private static final AttributeRetentionRule fieldsAllowedInModificationApi = new AttributeRetentionRule() { // from class: com.dynatrace.agent.events.enrichment.sanitation.JsonAttributeSanitationKt$$ExternalSyntheticLambda6
        @Override // com.dynatrace.agent.events.enrichment.sanitation.AttributeRetentionRule
        public final boolean shouldKeep(JsonAttribute jsonAttribute) {
            return JsonAttributeSanitationKt.fieldsAllowedInModificationApi$lambda$3(jsonAttribute);
        }
    };
    private static final AttributeSanitizer removeNestedJsonObjectAndArrays = new AttributeSanitizer() { // from class: com.dynatrace.agent.events.enrichment.sanitation.JsonAttributeSanitationKt$$ExternalSyntheticLambda7
        @Override // com.dynatrace.agent.events.enrichment.sanitation.AttributeSanitizer
        public final JsonAttribute sanitize(JsonAttribute jsonAttribute) {
            return JsonAttributeSanitationKt.removeNestedJsonObjectAndArrays$lambda$4(jsonAttribute);
        }
    };
    private static final AttributeSanitizer removeAttributeWithExceedingKeySize = new AttributeSanitizer() { // from class: com.dynatrace.agent.events.enrichment.sanitation.JsonAttributeSanitationKt$$ExternalSyntheticLambda8
        @Override // com.dynatrace.agent.events.enrichment.sanitation.AttributeSanitizer
        public final JsonAttribute sanitize(JsonAttribute jsonAttribute) {
            return JsonAttributeSanitationKt.removeAttributeWithExceedingKeySize$lambda$5(jsonAttribute);
        }
    };
    private static final AttributeSanitizer removeAttributesWithInvalidKeys = new AttributeSanitizer() { // from class: com.dynatrace.agent.events.enrichment.sanitation.JsonAttributeSanitationKt$$ExternalSyntheticLambda9
        @Override // com.dynatrace.agent.events.enrichment.sanitation.AttributeSanitizer
        public final JsonAttribute sanitize(JsonAttribute jsonAttribute) {
            return JsonAttributeSanitationKt.removeAttributesWithInvalidKeys$lambda$6(jsonAttribute);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean eventPropertiesNamespace$lambda$1(JsonAttribute jsonAttribute) {
        Intrinsics.checkNotNullParameter(jsonAttribute, "jsonAttribute");
        return StringsKt.startsWith$default(jsonAttribute.getKey(), EventKeys.EVENT_PROPERTIES.NAMESPACE, false, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fieldsAllowedInGenerationApi$lambda$2(JsonAttribute jsonAttribute) {
        Intrinsics.checkNotNullParameter(jsonAttribute, "jsonAttribute");
        return generationApiFields.contains(jsonAttribute.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fieldsAllowedInModificationApi$lambda$3(JsonAttribute jsonAttribute) {
        Intrinsics.checkNotNullParameter(jsonAttribute, "jsonAttribute");
        return modificationApiFields.contains(jsonAttribute.getKey());
    }

    public static final AttributeRetentionRule getEventPropertiesNamespace() {
        return eventPropertiesNamespace;
    }

    public static final AttributeRetentionRule getFieldsAllowedInGenerationApi() {
        return fieldsAllowedInGenerationApi;
    }

    public static final AttributeRetentionRule getFieldsAllowedInModificationApi() {
        return fieldsAllowedInModificationApi;
    }

    public static final List<String> getGenerationApiFields() {
        return generationApiFields;
    }

    public static final List<String> getModificationApiFields() {
        return modificationApiFields;
    }

    public static final List<String> getModificationApiFieldsWithAllAvailableSpace() {
        return modificationApiFieldsWithAllAvailableSpace;
    }

    public static final AttributeSanitizer getRemoveAttributeWithExceedingKeySize() {
        return removeAttributeWithExceedingKeySize;
    }

    public static final AttributeSanitizer getRemoveAttributesWithInvalidKeys() {
        return removeAttributesWithInvalidKeys;
    }

    public static final AttributeSanitizer getRemoveNestedJsonObjectAndArrays() {
        return removeNestedJsonObjectAndArrays;
    }

    public static final AttributeRetentionRule getSessionPropertiesNamespace() {
        return sessionPropertiesNamespace;
    }

    private static final boolean isPrimitive(Object obj) {
        return (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof Boolean);
    }

    public static final AttributeSanitizer removeAllAttributes(final AttributeRetentionRule[] keep) {
        Intrinsics.checkNotNullParameter(keep, "keep");
        return new AttributeSanitizer() { // from class: com.dynatrace.agent.events.enrichment.sanitation.JsonAttributeSanitationKt$$ExternalSyntheticLambda1
            @Override // com.dynatrace.agent.events.enrichment.sanitation.AttributeSanitizer
            public final JsonAttribute sanitize(JsonAttribute jsonAttribute) {
                return JsonAttributeSanitationKt.removeAllAttributes$lambda$9(keep, jsonAttribute);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAttribute removeAllAttributes$lambda$9(AttributeRetentionRule[] attributeRetentionRuleArr, JsonAttribute jsonAttribute) {
        Intrinsics.checkNotNullParameter(jsonAttribute, "jsonAttribute");
        for (AttributeRetentionRule attributeRetentionRule : attributeRetentionRuleArr) {
            if (attributeRetentionRule.shouldKeep(jsonAttribute)) {
                return jsonAttribute;
            }
        }
        Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "sanitation: key '" + jsonAttribute.getKey() + "' is outside of allowed namespace and thus dropped");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAttribute removeAttributeWithExceedingKeySize$lambda$5(JsonAttribute jsonAttribute) {
        Intrinsics.checkNotNullParameter(jsonAttribute, "jsonAttribute");
        if (jsonAttribute.getKey().length() <= 100) {
            return jsonAttribute;
        }
        Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "sanitation: dropped a key because it was too long; limit: 100; actual length: " + jsonAttribute.getKey().length() + "; key: '" + jsonAttribute.getKey() + '\'');
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAttribute removeAttributesWithInvalidKeys$lambda$6(JsonAttribute jsonAttribute) {
        Intrinsics.checkNotNullParameter(jsonAttribute, "jsonAttribute");
        if (keyRegex.matchEntire(jsonAttribute.getKey()) != null) {
            return jsonAttribute;
        }
        Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "sanitation: dropped a key because it does not conform to expected pattern; key: " + jsonAttribute.getKey());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAttribute removeNestedJsonObjectAndArrays$lambda$4(JsonAttribute jsonAttribute) {
        Intrinsics.checkNotNullParameter(jsonAttribute, "jsonAttribute");
        if (!(jsonAttribute.getValue() instanceof JSONObject) && !(jsonAttribute.getValue() instanceof JSONArray)) {
            return jsonAttribute;
        }
        Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "sanitation: key '" + jsonAttribute.getKey() + "' is a nested object or array and thus dropped");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean sessionPropertiesNamespace$lambda$0(JsonAttribute jsonAttribute) {
        Intrinsics.checkNotNullParameter(jsonAttribute, "jsonAttribute");
        return StringsKt.startsWith$default(jsonAttribute.getKey(), EventKeys.SESSION_PROPERTIES.NAMESPACE, false, 2, (Object) null);
    }

    public static final SanitationContext trimFields(SanitationContext sanitationContext, final String namespace) {
        Intrinsics.checkNotNullParameter(sanitationContext, "<this>");
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Iterator<String> itKeys = sanitationContext.getSanitizedJson().keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        List list = SequencesKt.toList(SequencesKt.sorted(SequencesKt.filter(SequencesKt.asSequence(itKeys), new Function1() { // from class: com.dynatrace.agent.events.enrichment.sanitation.JsonAttributeSanitationKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(JsonAttributeSanitationKt.trimFields$lambda$10(namespace, (String) obj));
            }
        })));
        if (list.size() > 50) {
            ArrayList arrayList = new ArrayList();
            ListIterator listIterator = list.listIterator(50);
            while (listIterator.hasNext()) {
                String str = (String) listIterator.next();
                Object objRemove = sanitationContext.getSanitizedJson().remove(str);
                Intrinsics.checkNotNull(objRemove);
                Intrinsics.checkNotNull(str);
                arrayList.add(new JsonAttribute(str, objRemove));
            }
            Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "sanitation: json contains too many attributes in " + namespace + " namespace : " + list.size() + "; dropped attributes: " + arrayList);
            sanitationContext.getDroppedAttributes().addAll(arrayList);
        }
        return sanitationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean trimFields$lambda$10(String str, String str2) {
        Intrinsics.checkNotNull(str2);
        return StringsKt.startsWith$default(str2, str, false, 2, (Object) null);
    }

    public static final AttributeSanitizer trimTooLongStringValues(final int i2) {
        return new AttributeSanitizer() { // from class: com.dynatrace.agent.events.enrichment.sanitation.JsonAttributeSanitationKt$$ExternalSyntheticLambda2
            @Override // com.dynatrace.agent.events.enrichment.sanitation.AttributeSanitizer
            public final JsonAttribute sanitize(JsonAttribute jsonAttribute) {
                return JsonAttributeSanitationKt.trimTooLongStringValues$lambda$7(i2, jsonAttribute);
            }
        };
    }

    public static /* synthetic */ AttributeSanitizer trimTooLongStringValues$default(int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 5000;
        }
        return trimTooLongStringValues(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAttribute trimTooLongStringValues$lambda$7(int i2, JsonAttribute jsonAttribute) {
        Intrinsics.checkNotNullParameter(jsonAttribute, "jsonAttribute");
        if (isPrimitive(jsonAttribute.getValue())) {
            return jsonAttribute;
        }
        String string = jsonAttribute.getValue().toString();
        int iMax = Math.max(i2, 5000);
        if (string.length() < iMax) {
            return jsonAttribute;
        }
        Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "sanitation: value of key '" + jsonAttribute.getKey() + "' is too long and thus is trimmed; original length: " + string.length() + "; ");
        return new JsonAttribute(jsonAttribute.getKey(), StringsKt.take(string, iMax));
    }
}
