package com.ts.coresdk.a.b;

import android.content.Context;
import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ts.coresdk.TSCall;
import com.ts.coresdk.TSCallback;
import com.ts.coresdk.TSNetworkResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import retrofit2.Call;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&˛\bDZc|\u0004G\u00068\u000bDB\u0007\"2\u0013\u007f\u0007tjA0JeP.hS2\u000fq{<$q$yCAV\"}8\tWNmgvJh\u0014K\u000f\f\u0017\u0001jBI]xc\u0016\u0015˰Xģ]2uqCʠn\u0013f\u000b04280ڎ/$bG\u000f7\u0016SO\u001a H@\u001f:b\u0017[ 2\u0018\u0016@0\u0001Tձ\u0016QɇLncV=@KvPV?_^\u0004\u0014!ТX)\u0013~o'sSE@-+c\u0005\u0017R\u0012Ϊ1I8Rݾl)-6W\u007f Qf\u000f,\u0015YV=g\u00014t\u000bab\u001c'aՒ\u0012X\u0017\"߭{|\u0002\u001cJ\u0014V\u00195ZF3*h\u0018\u000eiο!d\u0007eؿbD\u0006\roI_2\u000eHC9Iz\u0018uޅ\u001dP=\u0011\u0013#f0\u000f\u00069[\u0003\"')ôXyWH_V\u0006U\\#q=\u001c\u001c7w͆.\u00066`\u000eIL#<\u0016=7\n9Y!BȹJזkz\rbnTwT\u0019X0t.=:\u000b\u001cZzߟ3n\u0007T/\u0090\u0013ܖ X\u000f\u007f\u000e\u0017.a"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxaI%E=V", RemoteSettings.FORWARD_SLASH_STRING, "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1w", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "\u001aqTAe6?W(KD<(\u0004\u0010\u0005", "1x", "\u001aqTAe6?W(KD<(\u0004\u0010\u0005", AdkSettings.PLATFORM_TYPE_MOBILE, "", "1`]0X3", "u(E", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0006wG\bl", "1k^;X", "u(;0b4\bb'Hxh9|\u0017.kI\u0017i\u001e|\u001e\u001e\u001d", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0006wG\b\u0014\u0013Euc", ">/", "3m`BX<>", "uKR<`uMab|\u0005k,\u000b\b5/n\u0016Y<\b\u001e\u0014Cm\u0014\u0012:\u0016", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0011{O\u0013!$M\\\u000eJ\u0002/>g}u", "3wT0h;>", "u(;0b4\bb'Hxh9|\u0017.kI\u0017i)\u0001&)Q|\u0014)v3@c\u0007.7C", "", "7r2.a*>Z\u0019}", "u(I", "7r4EX*Nb\u0019}", "\u001anZ5g;I!bkzj<|\u0017>;", "@d`BX:M", "u(;<^/Mb$LDK,\t\u0019/s\u000f}", ">0", "\nh]6g\u0005", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtIv4Bc~$F:_\fIJBAw\u000f", "\""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class b<T> implements TSCall<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f18245a = new a(null);

    /* JADX INFO: renamed from: cz, reason: collision with root package name */
    private static final TSNetworkResponse.TSExternalNetworkError f18246cz = new TSNetworkResponse.TSExternalNetworkError("Return type is incorrect");
    private final Context cx;
    private final Call<T> cy;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u0016DLcz\u0007I\u0006>é4ȗ\u007f8ܥBw5k+@6DͿL0XV8\u0013<\u000eB&s$ BqUpԆ$\u07beSRoitJh\f"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxaI%E=?\u0013l", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0011{O\u0013!$M\\\u000eJ\u0002/>g}^&[uA\\CHt0%}hpK\u0011p2.\u00044QY$", "1y", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0011{O\u0013!$M\\\u000eJ\u0002/>g}^&[uA\\CHt0%}hpK\u0011p2.\u00044QY$", RemoteSettings.FORWARD_SLASH_STRING, "\nh]6g\u0005", "u(E", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public b(Context context, Call<T> call) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(call, "");
        this.cx = context;
        this.cy = call;
    }

    @Override // com.ts.coresdk.TSCall
    public void cancel() {
        this.cy.cancel();
    }

    @Override // com.ts.coresdk.TSCall
    public TSCall<T> clone() {
        return new b(this.cx, this.cy);
    }

    @Override // com.ts.coresdk.TSCall
    public void enqueue(TSCallback<T> tSCallback) {
        Intrinsics.checkNotNullParameter(tSCallback, "");
        tSCallback.error(f18246cz);
    }

    @Override // com.ts.coresdk.TSCall
    public TSNetworkResponse<T> execute() {
        return f18246cz;
    }

    @Override // com.ts.coresdk.TSCall
    public boolean isCanceled() {
        return this.cy.isCanceled();
    }

    @Override // com.ts.coresdk.TSCall
    public boolean isExecuted() {
        return this.cy.isExecuted();
    }

    @Override // com.ts.coresdk.TSCall
    public Request request() {
        Request request = this.cy.request();
        Intrinsics.checkNotNullExpressionValue(request, "");
        return request;
    }
}
