package com.dynatrace.agent.events.enrichment;

import com.dynatrace.agent.events.enrichment.EventKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u0016DLш|\u0004O\u00128\u000b4D\u0007\":0\u007f\u0007|jA0JeN\u008chݷH\u0017\u001c{b#\u0014#y\u0004Pe\u001e\f\"!O|hwrX\\#C=\u0007Ȁ|l2Lc|&\u001e\u001d7ZuO5]ok@\u000fz|\u0019p>08\u0012\u0005/\u001b\u0001Ͻ\u0012ͯ~CSÈb<NrRR;N[܈\u0014ĂB \tȦ֚kW"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017.HuC\u001e\u0013wa8br;[z$W[N:Jb}H\u001b\u0016Z\u001b$", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017\u001fJzA\"\u0012xp9ts7Y}+GY$", "/o_9\\*:b\u001d\t\u0004B+", "", "/fT;g\u001d>`'\u0003\u0005g", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@okq>", "At_=_@", "", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017#Dx8\u001c\u0018paB\u0016?;]\u0004+D\\],2", "\u0011n\\=T5B]\"", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ProtectedAttributesSupplier implements AttributeSupplier {
    public static final Companion Companion = new Companion(null);
    public static final String RUM_SCHEMA_VERSION = "0.22.0";
    private final String agentVersion;
    private final String applicationId;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176Ȑ\u0005ӳ-(Մ7f\u00198pKkH¯VU0\u000fy|\u00050i&\nCiXpԉt\u07beSNo˧ĚN^"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017.HuC\u001e\u0013wa8br;[z$W[N:Jb}H\u001b\u0016Z\u001b\r\t\u0017\rd=-rN@t", "", "\nh]6g\u0005", "u(E", " T<,F\n!3\u0001ZtO\fiv\u0013Oh", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ProtectedAttributesSupplier(String applicationId, String agentVersion) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(agentVersion, "agentVersion");
        this.applicationId = applicationId;
        this.agentVersion = agentVersion;
    }

    @Override // com.dynatrace.agent.events.enrichment.AttributeSupplier
    public List<EnrichmentAttribute> supply() {
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        AttributeSupplierKt.addAttributeIfValueNotNull(listCreateListBuilder, EventKeys.DT.RUM.SCHEMA_VERSION, RUM_SCHEMA_VERSION);
        AttributeSupplierKt.addAttributeIfValueNotNull(listCreateListBuilder, EventKeys.DT.RUM.AGENT_VERSION, this.agentVersion);
        AttributeSupplierKt.addAttributeIfValueNotNull(listCreateListBuilder, EventKeys.DT.RUM.AGENT_TYPE, "android");
        AttributeSupplierKt.addAttributeIfValueNotNull(listCreateListBuilder, EventKeys.DT.RUM.APPLICATION_ID, this.applicationId);
        return CollectionsKt.build(listCreateListBuilder);
    }
}
