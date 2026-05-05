package com.biocatch.client.android.sdk.collection.collectors.jailbreak;

import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.client.android.sdk.collection.StaticCollectionItem;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u0016DLш|\u0004O\u000f8é6B\r@4\u0012\u0006\u0013nj?5Le^.Zݷ0ş\u0002ڔd$\n#2rKY(}:\t}Owq|Lr\u0011S\u0011\u0016\u0016'nZLe\u0003k\u0017'8RqO3{sk<pxD\u000b82P9ѩ\t\u0001(1\u0011\u0016\u0005\u0006[K:\u001evTAO`\u000fe\u000b*\u0014\u0016>N\u0005L_ʄR<PǍu<5+\u0011r\u0013Z5_H|{\u000e\u001dÙ)˼za&Ѩ\u0011LC\u001a=Y\u0013\tb[m\u0007mtݘ\tn/ݐCKyaDaP #1g\r\fs|؛\u0007Ōd\f/˃ջgX"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011QJ0cO\u007f=\u0010\u0018$rJ/\u0014\u0002fA t,A\u001e\b3\u001f", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0003w]H\u000ba\nX}.GJ]0f[VL\u0014\u001a0", "7rA<b;>R", "", "/o_9\\*:b\u001d\t\u0004l", "", "", ">`c5f", ">da:\\:LW#\b\t", "uY;7T=:\u001d)\u000e~euc\r=tU\u000f\u0001<\u0012\u0013`W~\u0012C@\f9g\ru,1\u0007", "5dc\u000ec7EW\u0017z\nb6\u0006\u0017", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u001dT;Aa", "Bn9 B\u0015\u001a`&z\u000f", "\u001ana4\"1L]\"H_L\u0016ed<r{<Q", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class JailbreakModel extends StaticCollectionItem {
    private final List<String> applications;
    private final boolean isRooted;
    private final List<String> paths;
    private final boolean permissions;

    public JailbreakModel(boolean z2, List<String> applications, List<String> paths, boolean z3) {
        Intrinsics.checkNotNullParameter(applications, "applications");
        Intrinsics.checkNotNullParameter(paths, "paths");
        this.isRooted = z2;
        this.applications = applications;
        this.paths = paths;
        this.permissions = z3;
    }

    public final List<String> getApplications() {
        return this.applications;
    }

    public final List<String> getPaths() {
        return this.paths;
    }

    @Override // com.biocatch.android.commonsdk.backend.CollectionItem
    public JSONArray toJSONArray() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.isRooted);
        jSONArray.put(new JSONArray((Collection) this.applications));
        jSONArray.put(new JSONArray((Collection) this.paths));
        jSONArray.put(this.permissions);
        return buildStatic(CollectorID.Jailbreak.getStaticFieldName(), jSONArray);
    }
}
