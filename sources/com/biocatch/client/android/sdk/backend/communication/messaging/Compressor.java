package com.biocatch.client.android.sdk.backend.communication.messaging;

import com.biocatch.client.android.sdk.wrappers.Base64;
import com.biocatch.client.android.sdk.wrappers.DeflaterFactory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
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
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.`c2şs{J$c$wCCU(\n*\teNogtJb\u000bY\u000f\u000eǝ~̓Bկ\u0006x\f\u0011OMRsM3eok:pxD\u000782P;\n\t\u000f\u001eBH>{ټGK\u001a\u0018xL~Aj\r{\rJ\u0016\u0014G8\u0001Lf0\\DS\u0005]h7S\u0007wKf'\u000e8CMURb3%v\u0010+[DE>-%\u0002\u0011O^iK\u001b? J5l50CI\"a~f\u000e#-+}\u001a\u000ev4e\u001dQ\u000f\u0014m+\u0018qY`&(&\f,\u0011J\r&\u0006UPt-jr\u0016\u000eKt!T\u0017Г\u0004ެF\u007f\u0003ʨ\u0007#3\u0004K+g =Ϣcޅ\u001dN?ަU\u0019,%\u0019nO^+טbڠ\u001fT\u007f\u0383šUR"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011TN:jNtA\u001d\u0014$kX3\u0018\u0012YO2xQ\r", "", "0`b2)z", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G2Di!9MPI5\u0011\u001a#h2\b\\", "8r^;G6&a\u001biv\\2", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011TN:jNtA\u001d\u0014$r\\5\u0016sc)2p/3\u001d\u000e\u0002", "2dU9T;>`yzxm6\n\u001d", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G2Di!9MPI5\u0013\u001e\u0016o]H\u0007p\rJt6QYb\u0002", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004iIz\u00129XCHy}z\u0011va\nU9\u0013L\u0001/\u0011IR6ZN\u0002;\u0017[X\u0015R+\u0016\u0014#=-mQA#\u0007uW\u0001A2}\b\u0014\u00145so\fT\u001aO\u0002%~E'dU]i\u0003\u0011IEp8`\u000ec&^\u0004\u001f2\u001ez\b%P^0twQ\u0017H9wqo\u0011\u0016~B\":|YI\u000fm\\@t0.\u0015w\u0001\u0011?bx*>;\u0003:sHq\u0001Vr\u0018KlBs,]H#56Is;Ir\u007fyRc,\u0010", "1n\\=e,La\b\tWr;|", "", "2`c.", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "1n\\=e,La\b\tWr;|l8t\u007f5\u0005<\b", "1n\\=e,La\b\thm9\u0001\u00121", "", "\u001ana4\"1L]\"H_L\u0016ed<r{<Q", "1n\\=e,La\b\thm9\u0001\u00121I\t7{M\n\u0013\u001e", "2dU9T;>", "\u001aiPCTuB]b[\u000fm,X\u0016<a\u0014\u0012\fO\f'&5~\u001b<r-\u000b", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class Compressor {
    private final Base64 base64;
    private final DeflaterFactory deflaterFactory;
    private final JsonToMsgPack jsonToMsgPack;

    public Compressor(Base64 base64, JsonToMsgPack jsonToMsgPack, DeflaterFactory deflaterFactory) {
        Intrinsics.checkNotNullParameter(base64, "base64");
        Intrinsics.checkNotNullParameter(jsonToMsgPack, "jsonToMsgPack");
        Intrinsics.checkNotNullParameter(deflaterFactory, "deflaterFactory");
        this.base64 = base64;
        this.jsonToMsgPack = jsonToMsgPack;
        this.deflaterFactory = deflaterFactory;
    }

    private final byte[] compressToByteInternal(byte[] bArr) throws IOException {
        return this.base64.encode(deflate(bArr).toByteArray(), 0);
    }

    private final String compressToStringInternal(byte[] bArr) throws IOException {
        return this.base64.encodeToString(deflate(bArr).toByteArray(), 0);
    }

    private final ByteArrayOutputStream deflate(byte[] bArr) throws IOException {
        Deflater deflater = this.deflaterFactory.getDeflater(9, true);
        ByteArrayOutputStream byteArrayOutputStream = this.deflaterFactory.getByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream = this.deflaterFactory.getDeflaterOutputStream(byteArrayOutputStream, deflater);
        deflaterOutputStream.write(bArr);
        deflaterOutputStream.close();
        deflater.end();
        return byteArrayOutputStream;
    }

    public final byte[] compressToByte(JSONObject data) throws JSONException, IOException {
        Intrinsics.checkNotNullParameter(data, "data");
        return compressToByteInternal(this.jsonToMsgPack.convert(data));
    }

    public final String compressToString(JSONArray data) throws JSONException, IOException {
        Intrinsics.checkNotNullParameter(data, "data");
        return compressToStringInternal(this.jsonToMsgPack.convert(data));
    }

    public final String compressToString(JSONObject data) throws JSONException, IOException {
        Intrinsics.checkNotNullParameter(data, "data");
        return compressToStringInternal(this.jsonToMsgPack.convert(data));
    }
}
