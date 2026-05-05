package com.biocatch.client.android.sdk.collection.collectors.simData;

import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.client.android.sdk.collection.StaticCollectionItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLш|\u0004O\u00128\u000b4B\u0007\":\u0018\u007f\u0007ljA0RnP\u008cZS@\u000fs{:,c$\bCC٥ Ԃ8ޛ\u007fN\u0016f/\u0006j\u0011Q\u000f\u001e\u0018\u000fiZJe~k\u0014'4Xnm4]sK<xtd\t060=\u0012\u0005/\u001e:N\u0016v\tIc\f@7Pv@R\u001bU\u001d\u001a@\u000f̧$\u0001,f0TD[\u0005]hCi\u0017:Q\\-w0+TϘJZ/˙\u000fc$6NC\u0006!3[\u001b\u0007\u0001d\u0016ŤAџA\u0005pѧw<Wuo8n~B\u0016ۣS\u0013eö>^\u000b^n\u001aw:]fcP<,Þ~\u0002\u0015ɝ\u001c\u0010\f6V>})t\r&3#vՂDV\nމZ\u0002\u0001rD'u\u0011A+Q\u001d|P\u0010<ϭR=\u0004˜% )\u0013|/ƥX#"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZR4;N\u00029]\u007f^\u0016-'\u001c\u0001AK#nK\r", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0003w]H\u000ba\nX}.GJ]0f[VL\u0014\u001a0", "=oT?T;H`\u0002z\u0003^", "", "7r^", ";bR", "", ";mR", "0tX9W\u001aMO(\u0003x", "", "1n[9X*MW#\b^]", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u001218\"i>&^eeC\u0005_;LypCUM9fVq\u0007\u0012\u001cb\u0016X4\u001b\u0004_\u000b\"xK>\u001f\u0006;M\fD2^\u0016\u001d\u00155h\u007fLcs&OXf", "5dc\u000fh0ER\u0007\u000evm0z", "u(I", "5dc\u0016f6", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u001aV*", "u(8", "5dc\u001aa*", "5dc\u001cc,KO(\t\bG(\u0005\t", "Bn9 B\u0015\u001a`&z\u000f", "\u001ana4\"1L]\"H_L\u0016ed<r{<Q", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class SimDataModel extends StaticCollectionItem {
    private final boolean buildStatic;
    private final CollectorID collectionId;
    private final String iso;
    private final int mcc;
    private final int mnc;
    private final String operatorName;

    public SimDataModel(String str, String str2, int i2, int i3, boolean z2, CollectorID collectionId) {
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        this.operatorName = str;
        this.iso = str2;
        this.mcc = i2;
        this.mnc = i3;
        this.buildStatic = z2;
        this.collectionId = collectionId;
    }

    public /* synthetic */ SimDataModel(String str, String str2, int i2, int i3, boolean z2, CollectorID collectorID, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i2, i3, (-1) - (((-1) - i4) | ((-1) - 16)) != 0 ? true : z2, (i4 & 32) != 0 ? CollectorID.SimData : collectorID);
    }

    public final boolean getBuildStatic() {
        return this.buildStatic;
    }

    public final String getIso() {
        return this.iso;
    }

    public final int getMcc() {
        return this.mcc;
    }

    public final int getMnc() {
        return this.mnc;
    }

    public final String getOperatorName() {
        return this.operatorName;
    }

    @Override // com.biocatch.android.commonsdk.backend.CollectionItem
    public JSONArray toJSONArray() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(clearNull(this.operatorName));
        jSONArray.put(this.mcc);
        jSONArray.put(this.mnc);
        jSONArray.put(clearNull(this.iso));
        jSONArray.put(-1);
        return this.buildStatic ? buildStatic(this.collectionId.getStaticFieldName(), jSONArray) : jSONArray;
    }
}
