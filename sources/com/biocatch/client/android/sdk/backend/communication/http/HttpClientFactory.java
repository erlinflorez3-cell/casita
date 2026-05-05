package com.biocatch.client.android.sdk.backend.communication.http;

import com.biocatch.android.commonsdk.core.Utils;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.hS2şqڔJř\f$ B{t*\u00020\tgN\u0016h~Nh\r[\u000f4\u0019\tr2Ic|u\u0014%1ptУ7M}C\u0002d\u0003=\u001d `*\t\b\u0013\u00052,^\u000f%\u007f\u001aź\u000eܘ4@xí#\u0019[\u00072\u00124AvҸ ֔kN>ԟ=iH/;\u0003\u0018C%ώa݁\u0001M\u0015Ͽÿ+\u0016"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011O];g\u001cUL#\u001d8\u0015R+\u0016\u0014:=\"}ND3]", "", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "Cq[\u0013T*M]&\u0013", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011O];g\u001cb*zrV\f]5\u001a\u0019/", "Ar[ b*DS(_v\\;\u0007\u0016C", "\u001aiPCT?\b\\\u0019\u000eDl:\u0004R\u001dSf\u0016\u0006>\u0007\u0017&(k\fK\u00012I/", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G\u001eAz\u0016w=R?rBs{fkAP`0Xt#VJQuZYv=\u001d!$\nW*\u001a\u000f]@m|C=h\u0005(G\b;q\u007fU\u0014\u0018=r\u0001KZ\u000eC\t\u0019\u007fJrkUhjC7.,C&b\u001bi*p\u0010!)\u0010\u0003\u0015.2Y.\u0019Ea\u001fy\u001cgUN5#x>$MNWDTybPJj\u0010", "1qT.g,", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011O];g\u001cV #!ekU/\r\u000eh\u0017", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class HttpClientFactory {
    private final SSLSocketFactory sslSocketFactory;
    private final URLFactory urlFactory;
    private final Utils utils;

    public HttpClientFactory(Utils utils, URLFactory urlFactory, SSLSocketFactory sSLSocketFactory) {
        Intrinsics.checkNotNullParameter(utils, "utils");
        Intrinsics.checkNotNullParameter(urlFactory, "urlFactory");
        this.utils = utils;
        this.urlFactory = urlFactory;
        this.sslSocketFactory = sSLSocketFactory;
    }

    public /* synthetic */ HttpClientFactory(Utils utils, URLFactory uRLFactory, SSLSocketFactory sSLSocketFactory, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(utils, uRLFactory, (i2 + 4) - (i2 | 4) != 0 ? null : sSLSocketFactory);
    }

    public final IHttpClient create() {
        return new HttpClient(this.utils, this.urlFactory, this.sslSocketFactory);
    }
}
