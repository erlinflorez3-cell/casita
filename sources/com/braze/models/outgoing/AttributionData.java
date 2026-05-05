package com.braze.models.outgoing;

import bo.app.r;
import bo.app.s;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\r.4\u0012}\u000floOӄbpx4bU:\u000f\u001a{b#\u0014#}\u0004`e\u001e\f&!O|jwrX`#C=\t&|x3aU'`\"\u0013@J\b?aPڱA;f}D\u000fh?09\u0012\u0005/\u001ap\\ǘz|IL\u001a\u0014\u0001R~>j\r{\bP\u0012\\̇\"Ә\"`oP<Lzb\u000bA1\t\u0002B|*\u00160Sմ\u000fТX+\u0015xg$9E\bG#,k\u00035U\u0012?YӍsݘ\tl/)1P\u0002\\\u0007j\u000e\u001c-+}\u0010\u0014r|؛\u0007Ōd\u0010/-UkYU˔,\u0005"}, d2 = {"\u001ab^:\")KO.~Df6{\t6sI2\fO\u0003!\u001bPqW\u0018\u00064B]z0Fq 7,?Jg\n", "\u001ab^:\")KO.~Df6{\t6sI\ffP\u0010z VyrJ\u0001.\u000b", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "4na\u0017f6G>)\u000e", "u(;<e.\bX'\t\u0004(\u0011jr\u0018O|-{>\u0010l", "", "<dcDb9D", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "1`\\=T0@\\", "/c6?b<I", "1qT.g0OS", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d3S(mN<D\u0010\u001b\\W<:\u001a\tbCy25", "\u0011n\\=T5B]\"", "0n\u001e.c7\b`", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xs = "")
public final class AttributionData implements IPutIntoJson<JSONObject> {
    private static final String ADGROUP_KEY = "adgroup";
    private static final String CAMPAIGN_KEY = "campaign";
    private static final String CREATIVE_KEY = "ad";
    public static final r Companion = new r();
    private static final String NETWORK_KEY = "source";
    private final String adGroup;
    private final String campaign;
    private final String creative;
    private final String network;

    public AttributionData(String network, String campaign, String adGroup, String creative) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        Intrinsics.checkNotNullParameter(adGroup, "adGroup");
        Intrinsics.checkNotNullParameter(creative, "creative");
        this.network = network;
        this.campaign = campaign;
        this.adGroup = adGroup;
        this.creative = creative;
    }

    @Override // com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!StringsKt.isBlank(this.network)) {
                jSONObject.put("source", this.network);
            }
            if (!StringsKt.isBlank(this.campaign)) {
                jSONObject.put("campaign", this.campaign);
            }
            if (!StringsKt.isBlank(this.adGroup)) {
                jSONObject.put(ADGROUP_KEY, this.adGroup);
            }
            if (!StringsKt.isBlank(this.creative)) {
                jSONObject.put(CREATIVE_KEY, this.creative);
            }
        } catch (JSONException e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) s.f1717a, 4, (Object) null);
        }
        return jSONObject;
    }
}
