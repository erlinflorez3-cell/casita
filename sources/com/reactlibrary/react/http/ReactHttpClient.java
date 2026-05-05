package com.reactlibrary.react.http;

import com.cleafy.mobile.detection.agent.Cleafy;
import com.dynatrace.android.callback.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.`Y2şs{J$c$wCCU0}*ޛWNugvJ`\u000bYƤ6\u0016'il\u0005e~k\u0012'4Xnm4]sK;xtd\b080<\u0012\u0007\u0017\u0019XM |\tIc\u000e(/nuJV\u001bT\u001d\u001a@\u000eN&\u000f'tid5vvҺ>/1\u000e2N\\5w0+\\SІ\u0013ܮ\u0011vo.{LEA-%\u0002\u0010]ѻ]ύ\u0007?yܵUv5-CK\nVd]Vϯ\u0017ۣS\reövj\u0013Ux\u000e=*}h\"ַ\u0010߭{z\u0004Ȟ\r\u0012\u001c\u000f?JD,Hp^ԇ5ϢvSHАRjP\u0002\u0013ad\u001a{ı5ڢ=\u001bnϟ2G'UO{3\u0015tŃ\u0003ͼ%[\\וה\u0019,"}, d2 = {"\u001ab^:\"9>O\u0017\u000e\u0002b)\n\u0005<yI5{<~&`J~\u001dG@\u00125U{/\u001a|%9+J?k=-j", "", "Cq[ g9B\\\u001b", "", "@d`BX:M;\u0019\u000e}h+", "\u001ab^:\"9>O\u0017\u000e\u0002b)\n\u0005<yI5{<~&`J~\u001dG@\bDh\t\b7|\u00198L\u0019", ">`a.`:", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "6dP1X9L", "Bh\\2b<M", "", ">q^:\\:>", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW'\u0004/=]\f \r", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b>\u000b\u001f`To\n:\u0006,9V\u000b\u001cD\u0002_;M?9z}!$wl\u0003ir;Y^'VOX+29pG\u001c[[\nL+\n\u000fcGm{D3\u001d\u0017uF\u000f?g\u0003\f_z5fo>S\u0017Ga\u0011\u0001\u0017\u0010fPa)zC?E_4n\u0012)*\\683]n&\u001fgR.ShS\rqNvng/\u0015\u0006\u000e\b%keN\u000fpQ:t$)U\u0002A\u001f2Tr:>*\u00118)8dN6t\"Fb\u0007\u0015\u0002 2", "1n];X*MW#\b", "\u001aiPCTuGS(H]m;\bx\u001cL]2\u0005I\u0001\u0015&Ky\u0017\u0012", "3wT0h;>", "", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "/o_,e,ES\u0015\rz"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ReactHttpClient {
    private final HttpURLConnection connection;
    private final ReadableMap headers;
    private final ReadableMap params;
    private final Promise promise;
    private final HttpMethod requestMethod;
    private final int timeout;

    /* JADX INFO: renamed from: com.reactlibrary.react.http.ReactHttpClient$execute$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReactHttpClient.this.execute(this);
        }
    }

    public ReactHttpClient(String str, HttpMethod requestMethod, ReadableMap readableMap, ReadableMap readableMap2, int i2, Promise promise) throws IOException {
        Intrinsics.checkNotNullParameter(requestMethod, "requestMethod");
        this.requestMethod = requestMethod;
        this.params = readableMap;
        this.headers = readableMap2;
        this.timeout = i2;
        this.promise = promise;
        URL url = new URL(str);
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        Callback.openConnection(uRLConnectionOpenConnection);
        Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        this.connection = Cleafy.getHttpURLConnectionFactory().create(url, (HttpURLConnection) uRLConnectionOpenConnection);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object execute(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.reactlibrary.react.http.ReactHttpClient.AnonymousClass1
            if (r0 == 0) goto L2b
            r5 = r7
            com.reactlibrary.react.http.ReactHttpClient$execute$1 r5 = (com.reactlibrary.react.http.ReactHttpClient.AnonymousClass1) r5
            int r0 = r5.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L2b
            int r0 = r5.label
            int r0 = r0 - r2
            r5.label = r0
        L19:
            java.lang.Object r1 = r5.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L39
            if (r0 != r3) goto L31
            java.lang.Object r2 = r5.L$0
            com.reactlibrary.react.http.ReactHttpClient r2 = (com.reactlibrary.react.http.ReactHttpClient) r2
            goto L57
        L2b:
            com.reactlibrary.react.http.ReactHttpClient$execute$1 r5 = new com.reactlibrary.react.http.ReactHttpClient$execute$1
            r5.<init>(r7)
            goto L19
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L39:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Exception -> L64
            kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2     // Catch: java.lang.Exception -> L64
            com.reactlibrary.react.http.ReactHttpClient$execute$response$1 r1 = new com.reactlibrary.react.http.ReactHttpClient$execute$response$1     // Catch: java.lang.Exception -> L64
            r0 = 0
            r1.<init>(r6, r0)     // Catch: java.lang.Exception -> L64
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1     // Catch: java.lang.Exception -> L64
            r5.L$0 = r6     // Catch: java.lang.Exception -> L64
            r5.label = r3     // Catch: java.lang.Exception -> L64
            java.lang.Object r1 = kotlinx.coroutines.BuildersKt.withContext(r2, r1, r5)     // Catch: java.lang.Exception -> L64
            if (r1 != r4) goto L55
            return r4
        L55:
            r2 = r6
            goto L5a
        L57:
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> L67
        L5a:
            com.facebook.react.bridge.WritableMap r1 = (com.facebook.react.bridge.WritableMap) r1     // Catch: java.lang.Exception -> L67
            com.facebook.react.bridge.Promise r0 = r2.promise     // Catch: java.lang.Exception -> L67
            if (r0 == 0) goto L71
            r0.resolve(r1)     // Catch: java.lang.Exception -> L67
            goto L71
        L64:
            r1 = move-exception
            r2 = r6
            goto L68
        L67:
            r1 = move-exception
        L68:
            com.facebook.react.bridge.Promise r0 = r2.promise
            if (r0 == 0) goto L71
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.reject(r1)
        L71:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactlibrary.react.http.ReactHttpClient.execute(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
