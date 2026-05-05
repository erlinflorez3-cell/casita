package com.ts.coresdk.a.b.a;

import android.content.Context;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.google.gson.GsonBuilder;
import com.ts.coresdk.ITSModuleInfo;
import com.ts.coresdk.a.a.b;
import com.ts.coresdk.a.a.c;
import com.ts.coresdk.a.b.e;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
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
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r.4ߚ\u007f\u0007t\tAӄLe^.Zݷ2\u000fy\u0005<řc$\u007feCU \u007f*\teNogtKb\u000bQƤ\fȞx\u0001ߚyU'qR\u00168BņC5S\u0002KL)^D\u001384870ڎ!\u001c0Ϻ\u001e\u0004+GY\f*0nojV\u001bO\u001d\u001a@\u0007n$\u000f\"tg|9xxk@G+\u0013kRNUbF{{\u0012v^5\u0015\u000fg.-P7kՖSZ3\u000b`eW\u0003mzm\u0017v3?9Yug6\u0007\u0003$\u0017;O;`\t%\u000b\u0010\u0018eВ+-UqY_V{\u0006\t\u0014\rj\u0014>\n5HF-He8\u0012Av\u000bSnQ2bP\u0004\u0013ad\u001aU\fA1Q#vSq;GQMz3\u0012N'\u000fv9[\u0003\u0017\u0011')^\u0010_ASP=vQ\u001a[Mm2sx\u0001X\u000fvGĬ3}\u0017<%6"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxaI%E<J\u0013l", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", ">/", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxIn\u0016cJ\u007f'\u001eGS\u0017=\u0001z", ">0", "", ">1", "", ">2", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", ">3", "", ">4", "", ">5", "\"", RemoteSettings.FORWARD_SLASH_STRING, "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~h\fi5w#.[BA5\u0018\r\u0003Pk8\u0017j,2\u007f(Q\"51Xcn\u0007\u001b\u000ec\u0010\u0018\u0019\u001c\u0012]J&D+<\u001b\u0019(\u0013\u0012Jl\bU|\u0012CyF)[\fXu^|=2j\u00107fuUO\u001bW\u0011i\bp\u0019&JI(\u001b;\u0001\u0017s&qp\u0001O\"n\u001c\u0001cpIbd5)>kj\u001c", "\u001aqTAe6?W(KDK,\f\u00169f\u00047Q", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~h\fi5w#.[BA5\u0018\r\u0003Pk8\u0017j,2\u007f(Q\"51Xcn\u0007\u001b\u000ec\u0010\u0018\u0019\u001c\u0012]J&D+<\u001b\u0019(\u0013\u0012Jl\bU|\u0012CyF7=\u0015C\u000b\u0011?Q8lM#GuR\u0017\tI7d\u001bl']>Ip]^\u0019*uZ/\u000e\u000b)", "\nh]6g\u0005", "u(E", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class a {
    public static final a INSTANCE = new a();

    private a() {
    }

    private final Retrofit a(Context context, ITSModuleInfo iTSModuleInfo, String str, List<String> list, boolean z2, Map<String, String> map) {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new b(context, iTSModuleInfo));
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        Retrofit retrofitBuild = new Retrofit.Builder().baseUrl(str).addCallAdapterFactory(new e(context, list)).addConverterFactory(GsonConverterFactory.create(new GsonBuilder().setLenient().create())).client(new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).addInterceptor(new com.ts.coresdk.a.a.a(z2, map)).addInterceptor(new c(context)).build()).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "");
        return retrofitBuild;
    }

    public final <T> T a(Context context, ITSModuleInfo iTSModuleInfo, String str, List<String> list, Class<T> cls, boolean z2, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cls, "");
        try {
            return (T) a(context, iTSModuleInfo, str, list, z2, map).create(cls);
        } catch (Throwable unused) {
            return null;
        }
    }
}
