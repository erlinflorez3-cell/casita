package com.dynatrace.agent.communication.network.request;

import com.dynatrace.agent.communication.network.CompressionToolkitKt;
import com.dynatrace.agent.communication.network.datasource.DataRequest;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
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
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\u0015\"4\u0012\u0006\u000enʑA0RnP.XT2\u000f\u0002{<řc$\bCC٥ Ԃ8ޛ\u007fN\u0016f/oj\u000fQ\u000f\u001e\u0016'k<Sczu\u0018\u001f4Rom7{rM?ftD\n82P>ѩ\t\u0003 1V\u0018?\u0007QT$\u0012^J!>`\u0018e\u0005H\u001eVJ.\u00016\\\u0016O\rԢnҺ>/+Ʌ:T\\)w6\rO\u001dF\u0003+;y8ӟ-Ë;5\u001dǬ$\u000f\u0015Ws?1EHܸ\u0007ص+'3ɞ־[C"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}+\u0015tq9\u0015ru-r6C9N8lR\u0001Lt\u000eX\u001dX8!Z", "", "Dda@\\6G", "", "Bh\\2f;:[$i\bh=\u0001\b/r", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "CrT\u0010b4I`\u0019\r\tb6\u0006", "", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010.\u0002C:\u0018", "1qT.g,+S%\u000fzl;", "\u001anZ5g;I!bkzj<|\u0017>;", "2`c.E,Jc\u0019\r\n", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}\u001d\u0011w]G\u0011s9Lvp&H](IR~M\u0014 ic", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class DataRequestFactory {
    private final Function0<Long> timestampProvider;
    private final boolean useCompression;
    private final String version;

    public DataRequestFactory(String version, Function0<Long> timestampProvider, boolean z2) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        this.version = version;
        this.timestampProvider = timestampProvider;
        this.useCompression = z2;
    }

    public /* synthetic */ DataRequestFactory(String str, Function0 function0, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, function0, (i2 + 4) - (i2 | 4) != 0 ? true : z2);
    }

    public final Request createRequest(DataRequest dataRequest) throws IOException {
        byte[] bArrEncodeToByteArray;
        MediaType mediaType;
        Compression compression;
        Intrinsics.checkNotNullParameter(dataRequest, "dataRequest");
        if (this.useCompression) {
            bArrEncodeToByteArray = CompressionToolkitKt.gzipDeflate(dataRequest.getBody());
            mediaType = MediaType.Companion.get("application/octet-stream");
            compression = Compression.GZIP;
        } else {
            bArrEncodeToByteArray = StringsKt.encodeToByteArray(dataRequest.getBody());
            mediaType = MediaType.Companion.get("application/json;charset=UTF-8");
            compression = Compression.UNCOMPRESSED;
        }
        Headers.Builder builderAdd = new Headers.Builder().add("accept-encoding", "gzip");
        return new Request.Builder().post(RequestBody.Companion.create$default(RequestBody.Companion, bArrEncodeToByteArray, mediaType, 0, 0, 6, (Object) null)).headers(builderAdd.build()).url(HttpUrlExtensionsKt.buildWithQueryChecksum(HttpUrlExtensionsKt.addServerIdParameter(HttpUrlExtensionsKt.addRetryQueryParameters(HttpUrlExtensionsKt.addBodyQueryParameters(HttpUrlExtensionsKt.addBaseQueryParameters(HttpUrl.Companion.get(dataRequest.getEndPointInfo().getUrl()).newBuilder(), dataRequest.getEndPointInfo(), this.version, dataRequest.getServerData().getConfig().getRevision()), bArrEncodeToByteArray, compression, dataRequest.isPriority() ? "high" : null, this.timestampProvider), dataRequest.getRetryInfo()), dataRequest.getServerId()))).build();
    }
}
