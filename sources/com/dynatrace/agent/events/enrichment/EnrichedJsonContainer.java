package com.dynatrace.agent.events.enrichment;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r@4\u0012\u000e\u0007nj?8LeV7ZS0\u000fs{B*cҕyCIa\"Ԃ(ޜUdʴ\u0018nxYK^\u001f\n$x\u0003,wV\tg \u0011JH\u007fACM\u001eAgcҽ:\u0007&70>B\f\u000f%BH>wAƖLT\u001f>L\t@b\u000f]\u0005H\u00164AfӼ\u001f%\t\\C`l\fŽ_)\tiPN?_^}}\u0019LT5\u000f\u000fg.-P7c\u0019SVIߞQ$P\u0011M\n=3wW-9Y\fYLW.\u0013[ܗPUd\u00017t\u0005\u007frR̃*\u0018jYc&(&\u000fBɵ;T\u001d\u0014'`.[\u001bǴ\f\u0014;ο\u000bUFW\u0010f\u0013\u0015\tcN\u001d5\u0002C+g\u001f\u0015Tň?\u001fVљ\u0014\u0007\u0013'1\u000b\u0382%p"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017#Dx8\u001c\u0018h`\u001e\u0015m5,\u00010VHR5\\_H", "", "3ma6V/>R}\r\u0005g", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "=uT?e0=R\u0019\bVm;\n\r,u\u000f(\n", "", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017#Dx8\u001c\u0018paB\u0016?;]\u0004+D\\],2", "\nh]6g\u0005", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV}\u001cC\u0001\n\u0006\u000749`G\u0007;{%\u0004\u00114", "5dc\u0012a9BQ\u001c~yC:\u0007\u0012", "u(;<e.\bX'\t\u0004(\u0011jr\u0018O|-{>\u0010l", "5dc\u001ci,K`\u001d}y^5X\u0018>r\u0004%\fO\u0001%", "u(;7T=:\u001d)\u000e~euc\r=tU", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class EnrichedJsonContainer {
    private final JSONObject enrichedJson;
    private final List<EnrichmentAttribute> overriddenAttributes;

    public EnrichedJsonContainer(JSONObject enrichedJson, List<EnrichmentAttribute> overriddenAttributes) {
        Intrinsics.checkNotNullParameter(enrichedJson, "enrichedJson");
        Intrinsics.checkNotNullParameter(overriddenAttributes, "overriddenAttributes");
        this.enrichedJson = enrichedJson;
        this.overriddenAttributes = overriddenAttributes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EnrichedJsonContainer copy$default(EnrichedJsonContainer enrichedJsonContainer, JSONObject jSONObject, List list, int i2, Object obj) {
        if ((1 & i2) != 0) {
            jSONObject = enrichedJsonContainer.enrichedJson;
        }
        if ((i2 & 2) != 0) {
            list = enrichedJsonContainer.overriddenAttributes;
        }
        return enrichedJsonContainer.copy(jSONObject, list);
    }

    public final JSONObject component1() {
        return this.enrichedJson;
    }

    public final List<EnrichmentAttribute> component2() {
        return this.overriddenAttributes;
    }

    public final EnrichedJsonContainer copy(JSONObject enrichedJson, List<EnrichmentAttribute> overriddenAttributes) {
        Intrinsics.checkNotNullParameter(enrichedJson, "enrichedJson");
        Intrinsics.checkNotNullParameter(overriddenAttributes, "overriddenAttributes");
        return new EnrichedJsonContainer(enrichedJson, overriddenAttributes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnrichedJsonContainer)) {
            return false;
        }
        EnrichedJsonContainer enrichedJsonContainer = (EnrichedJsonContainer) obj;
        return Intrinsics.areEqual(this.enrichedJson, enrichedJsonContainer.enrichedJson) && Intrinsics.areEqual(this.overriddenAttributes, enrichedJsonContainer.overriddenAttributes);
    }

    public final JSONObject getEnrichedJson() {
        return this.enrichedJson;
    }

    public final List<EnrichmentAttribute> getOverriddenAttributes() {
        return this.overriddenAttributes;
    }

    public int hashCode() {
        return (this.enrichedJson.hashCode() * 31) + this.overriddenAttributes.hashCode();
    }

    public String toString() {
        return "EnrichedJsonContainer(enrichedJson=" + this.enrichedJson + ", overriddenAttributes=" + this.overriddenAttributes + ')';
    }
}
