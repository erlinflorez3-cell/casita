package com.ticnow.sdk.idnowonboarding.services;

import com.ticnow.sdk.idnowsecurity.http.response.IdNowCommonResponse;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Я.\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000bDB\u0007Ӭ4\u0012\u0006)njG<L͜P.hS2şs{J$c$wJA:0ԂR\t}M0(|Jr\u0011S\u0011\u0016\u0016'lZJ\u0006\u000bc\u0011\u001d5Z{O5]ok>pvF\u0005N7P<*\u000b\u0007\u00198N(v)J{\u0012\u0018/NxRR;V5 \u0018\u0005L*\u0019\u001e\u000bp\u0015[\u0011\u000fkEG)\u0013kRNUa^}}\u001fLS5\u0010\u000fm.-P7c\u001a5U\u0013\u0007\u0001`m\u0007\u0006\u0017\u0006;v3?1Yug6\u0007\u0002B\u0016[a\u0013\\\u0001)t\u0011ab\u001c'YTsM`\u000eV|)\u007f=B\n\r\u00144`.[!\u0017\u000e\u00142\u0003\u0001k@~\u000b%gH1oE/+\u00105;9Ih\u007fbk+T6\n\b%*3\u0003~!\nY\u001eb%\u001b\u0003|\u007f5\u0002FCG\\\u0017q=\u001c\u000b!h\b)\u0012>_\u007f]\u0005WS_QEkQ)1m\u0012Hri%\u0006\u0011zYh`KX.~\u0018G*7\u0011jFt\u0005\u001aU\u0003\\\\\u0017S\u001bb\u0018\u0016\bA'#\u001d˼%7"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f D~\u001a,MQ\u0005O3\u0007\u001fzN9\u0016p6Oz6#WR\b[N}L\u0014\u001f0", "", "/mP9\\A>2\"\u0003", "\u001aqTAe6?W(KD<(\u0004\u0010\u0005", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016<XMDy4gxgJC\u0019A6V~1P9N:g\\{K\u0014g", "6dP1X9L", "", "", "Co[<T+\u001d<|kzj<|\u0017>", "\u001anZ5g;I!bkzj<|\u0017>B\n'\u0010\u0016", "4q^;g\u000bGW", "\u001anZ5g;I!bf\u000be;\u0001\u0014+r\u000f\u0005\u0006?\u0015U\u0002C|\u001d\u0012", "0`R875B", "5dc\u0012a9HZ \u0007zg;i\t3n\u000f(\u0005Oi\u0017)U", ";`c0[\fG`#\u0006\u0002?(z\t", "Co[<T+&O(|}>5\n\u00136l`$y@m\u0017#Wo\u001cK", "Hn^:9(<S", ";`c0[\r:Q\u0019", ">nbA85K] \u0006\u0003^5\fu/i\t7{I\u0010\u007f\u0017Y}", "5dc\u0012a9HZ \u0007zg;i\t3n\u000f(\u0005Oi\u0017)U\\\u000eJ\u0007,D", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public interface IdNowRetrofitApiAdapter {
    @InterfaceC1492Gx
    @POST("\u0019\u001b#\u0015\u001bn\u001f\u0011'#7!z$\"")
    @Multipart
    Call<IdNowCommonResponse> analizeDni(@HeaderMap Map<String, String> map, @InterfaceC1492Gx @Part(encoding = "[aeWgm", value = "82-/ \"\u0001\n\u0004\f\u001e),\u001b((") RequestBody requestBody, @InterfaceC1492Gx @Part(encoding = "[aeWgm", value = "") MultipartBody.Part part, @InterfaceC1492Gx @Part(encoding = "[aeWgm", value = "") MultipartBody.Part part2);

    @InterfaceC1492Gx
    @GET("\u0012\u000f\u001dl\u0015\u0018\u0014\u0010\u000f\u000f\u0006\u000e\u0013o\u0002\u0005\t\u000e}\u0006\u000bcy\u000b\u0006")
    Call<IdNowCommonResponse> getEnrollmentReintentNews(@HeaderMap Map<String, String> map);

    @InterfaceC1492Gx
    @POST("\u0019\u001b#\u0015\u001bz\u0012$\u001e\"\u0002*)%%$\t#()")
    @Multipart
    Call<IdNowCommonResponse> matchEnrollFace(@HeaderMap Map<String, String> map, @InterfaceC1492Gx @Part(encoding = "[aeWgm", value = "82-/ \"\n\u001d/\u001d!}\u0018\u0019\u001a\u0006\u0018#&\u0015\"\"") RequestBody requestBody, @InterfaceC1492Gx @Part(encoding = "[aeWgm", value = "") MultipartBody.Part part);

    @InterfaceC1492Gx
    @POST("\u0019\u001b#\u0015\u001bz\u0012$\u001e\"\u0003\u001d\u001a\u001b")
    @Multipart
    Call<IdNowCommonResponse> matchFace(@HeaderMap Map<String, String> map, @InterfaceC1492Gx @Part(encoding = "[aeWgm", value = "82-/ \"\n\u001d/\u001d!}\u0018\u0019\u001a\u0006\u0018#&\u0015\"\"") RequestBody requestBody, @InterfaceC1492Gx @Part(encoding = "[aeWgm", value = "") MultipartBody.Part part);

    @InterfaceC1492Gx
    @POST("\u001a\u0017)x\u001d  \u001c''\"*+\b\u001e!16*23\f&7>")
    Call<IdNowCommonResponse> postEnrollmentReintentNews(@HeaderMap Map<String, String> map, @Body RequestBody requestBody);
}
