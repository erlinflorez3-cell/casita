package com.ticnow.sdk.idnowonboarding.services.reintents;

import android.content.Context;
import com.biocatch.client.android.sdk.core.Constants;
import com.google.gson.Gson;
import com.ticnow.sdk.idnowonboarding.model.api.IDReintentServicesImpl;
import com.ticnow.sdk.idnowonboarding.services.IdNowRetrofitApiAdapter;
import com.ticnow.sdk.idnowsecurity.api.IDSecurityApiImpl;
import com.ticnow.sdk.idnowsecurity.http.codes.IDEnrollmentResponseCodes;
import com.ticnow.sdk.idnowsecurity.http.paths.IDEndPoints;
import com.ticnow.sdk.idnowsecurity.http.response.IdNowCommonResponse;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я6\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0ZeP.hS2\u000fq{<$q$yّCU(}*\tUP}˧\rY\u000b\u000bq\u000e>\u0015\b+yYY\u0007]*\u000f`C\u007fCAO\b=gc\u0005l\u0013$JTH\r\u0015\u00120)v\u0016ͯ~MQ\u0013\"6FxJT\u0013S+#\"\u0017N//(֔kX<O|c@73\u0005oHt2o2\rM;R\u0003,˼za,8\t=C#=S1\u0013\u0019`\u0010AMuU7x:7<_r\u0006<ݼ\u0004\u001e\u001b2_\u0013cz6^\u000bW\u0007\u00157<_ryZˎ,\u0002\u0001\u0003\u001dB\n\u0016\u0016)N4S%v\n\u001e3#~\u0002E'؟j۰\u0004ziاg1\u000e3C9Ig(ĨGϭR7\u0004˜]*1\u0003\u0007!\nWd֮!ôXwYĸҮDM"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f D~\u001a,MQ\u0005x4\"\u001ewaB\u0016qu0v6'U[6cYz=\u001d!G\u000eR4\u001c\u0005bP\rnVEt", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "5dc\u0012a9HZ \u0007zg;i\t3n\u000f(\u0005Oi\u0017)U", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwIN?5\u0018|\u0002heB\u0016c5]d'T]R*\\`VE\u001f\u0019\u0019oN4\r\u0012UP$PDF~\u00119S\tBp\u0001\u0015%z5nyQV\u0019Vb\u0015\bO\u0016hTif\t\u001d", "1`[9U(<Y", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016<XMDy4gxgJC\u0019A6V~1P9N:g\\{K\u0014g", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "7c=<j\nH[!\t\u0004K,\u000b\u00149n\u000e(", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001k -MQ\u0005O\u0013}\u001euk@\u000ek,W\u0006\u0014GZY6e`r\u001b\u001e\u0011Z\u001c$", "1nS2", "", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~h\u0002\u001e@w(w[BA58\u001d\u001ersC\u0010`6J\u0004&KUPud\\q=\u001b[V\u0019RtpcFA(wS7(\u0017\u001aI\u000fLl~\f$q=uw\u00018\u0010Py\"qP)JFh?\u0003TKLi2d\u0015n\n\\>C3\u0014z(\u0004hb<v{a!yaONmQ(\u0002<-\brlN\u000fpeEr6#U\u0005\u0006[\u0013h})\u00041\u000e=v\f(u", "5dc", "\u0011n\\=T5B]\"", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class GetEnrollmentReintentNews {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "GetEnrollmentReintentNews";
    private Function2<? super IdNowCommonResponse, ? super IDEnrollmentResponseCodes, Unit> callback;
    private Context context;
    private IDReintentServicesImpl.GenerateGetEnrollmentReintentNewsResult getEnrollmentReintentNews;

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٨lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f D~\u001a,MQ\u0005x4\"\u001ewaB\u0016qu0v6'U[6cYz=\u001d!G\u000eR4\u001c\u0005bP\rnVE]e6Q\r7q\u0005\u0016\u001fc", "", "u(E", "\"@6", "", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.services.reintents.GetEnrollmentReintentNews$get$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0010\u001d̉=!,i\bDZc|\u0004G\u0006>éFB-!T\u0012&\u0007-ʜwӧHgN/`U"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "7me<^,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4H7|0g\u001cdj;PM)Sv%V\""}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        private CoroutineScope p$;

        AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> completion) {
            Intrinsics.checkParameterIsNotNull(completion, "completion");
            AnonymousClass1 anonymousClass1 = GetEnrollmentReintentNews.this.new AnonymousClass1(completion);
            anonymousClass1.p$ = (CoroutineScope) obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                new IDSecurityApiImpl();
                RequestBody.Companion companion = RequestBody.Companion;
                String json = new Gson().toJson(GetEnrollmentReintentNews.this.getEnrollmentReintentNews);
                Intrinsics.checkExpressionValueIsNotNull(json, "Gson().toJson(getEnrollmentReintentNews)");
                companion.create((MediaType) null, json);
                IDEndPoints currentInstance = IDEndPoints.getCurrentInstance();
                Intrinsics.checkExpressionValueIsNotNull(currentInstance, "IDEndPoints.getCurrentInstance()");
                String analizeDni = currentInstance.getAnalizeDni();
                String str = "Base url: " + analizeDni;
                Retrofit retrofitBuild = new Retrofit.Builder().baseUrl(analizeDni).addConverterFactory(GsonConverterFactory.create()).client(new OkHttpClient.Builder().connectTimeout(30L, TimeUnit.SECONDS).readTimeout(30L, TimeUnit.SECONDS).writeTimeout(30L, TimeUnit.SECONDS).callTimeout(30L, TimeUnit.SECONDS).build()).build();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("Content-Type", Constants.WUP_CONTENT_TYPE);
                ((IdNowRetrofitApiAdapter) retrofitBuild.create(IdNowRetrofitApiAdapter.class)).getEnrollmentReintentNews(linkedHashMap).enqueue(new Callback<IdNowCommonResponse>() { // from class: com.ticnow.sdk.idnowonboarding.services.reintents.GetEnrollmentReintentNews.get.1.1
                    @Override // retrofit2.Callback
                    public void onFailure(Call<IdNowCommonResponse> call, Throwable t2) {
                        Intrinsics.checkParameterIsNotNull(call, "call");
                        Intrinsics.checkParameterIsNotNull(t2, "t");
                        GetEnrollmentReintentNews.this.callback.invoke(null, IDEnrollmentResponseCodes.GENERAL_ERROR);
                    }

                    @Override // retrofit2.Callback
                    public void onResponse(Call<IdNowCommonResponse> call, Response<IdNowCommonResponse> response) {
                        Intrinsics.checkParameterIsNotNull(call, "call");
                        Intrinsics.checkParameterIsNotNull(response, "response");
                        try {
                            String str2 = "Calling getEnrollmentReintentNews success, response: " + new Gson().toJson(response);
                        } catch (Exception e2) {
                            GetEnrollmentReintentNews.this.callback.invoke(null, IDEnrollmentResponseCodes.GENERAL_ERROR);
                        }
                    }
                });
            } catch (Exception e2) {
            }
            return Unit.INSTANCE;
        }
    }

    public GetEnrollmentReintentNews(Context context, IDReintentServicesImpl.GenerateGetEnrollmentReintentNewsResult getEnrollmentReintentNews, Function2<? super IdNowCommonResponse, ? super IDEnrollmentResponseCodes, Unit> callback) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(getEnrollmentReintentNews, "getEnrollmentReintentNews");
        Intrinsics.checkParameterIsNotNull(callback, "callback");
        this.context = context;
        this.getEnrollmentReintentNews = getEnrollmentReintentNews;
        this.callback = callback;
    }

    public final void get() {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new AnonymousClass1(null), 3, null);
    }
}
