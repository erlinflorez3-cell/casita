package com.statsig.androidsdk;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0010\u001d<;!&i\u000eӵLc\u000b\u0004Iي>éFD\u0015!r\u0011\u0018\u000flʑG/Zdp.\u0001SR\u000f\u001a|zŤ\u001aҾuE"}, d2 = {"\n`]<a@F])\rS", "\"", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "1n\\{f;:b'\u0003|((\u0006\b<o\u0004'\n?\u0007`\u0005Vk\u001dJz'\u001eY\r2Az\u001c\u0012UNB*?(#wN9\u0013s,\\\u0006e\u0015"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class StatsigNetworkImpl$retryApiPostLogs$$inlined$postRequest$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LogEventResponse>, Object> {
    final /* synthetic */ String $bodyString;
    final /* synthetic */ ContextType $contextType;
    final /* synthetic */ Diagnostics $diagnostics;
    final /* synthetic */ String $eventsCount;
    final /* synthetic */ String $requestCacheKey;
    final /* synthetic */ int $retries;
    final /* synthetic */ Ref.ObjectRef $statusCode$inlined;
    final /* synthetic */ Integer $timeout;
    final /* synthetic */ UrlConfig $urlConfig;
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ StatsigNetworkImpl this$0;

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigNetworkImpl$retryApiPostLogs$$inlined$postRequest$default$1$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d̉=!,i\bӵLc\u0003İI\u0006F\u000b6Ȑ\rӬD\u0012&\u0006\u0007r?ӄRe^-zSX\u0010\u0014{b&\"Ҡ0ٺ?X"}, d2 = {"\n`]<a@F])\rS", "", "\"", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "1n\\{f;:b'\u0003|((\u0006\b<o\u0004'\n?\u0007`\u0005Vk\u001dJz'\u001eY\r2Az\u001c\u0012UNB*?(#wN9\u0013s,\\\u0006e\u0015\u000b\u001d"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.LongRef $end;
        final /* synthetic */ Ref.ObjectRef $errorMessage;
        final /* synthetic */ long $start;
        final /* synthetic */ Integer $timeout;
        final /* synthetic */ UrlConfig $urlConfig;
        int label;
        final /* synthetic */ StatsigNetworkImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.LongRef longRef, long j2, Integer num, StatsigNetworkImpl statsigNetworkImpl, UrlConfig urlConfig, Ref.ObjectRef objectRef, Continuation continuation) {
            super(2, continuation);
            this.$end = longRef;
            this.$start = j2;
            this.$timeout = num;
            this.this$0 = statsigNetworkImpl;
            this.$urlConfig = urlConfig;
            this.$errorMessage = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$end, this.$start, this.$timeout, this.this$0, this.$urlConfig, this.$errorMessage, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                long j2 = (this.$end.element - this.$start) / ((long) 1000000000);
                Integer num = this.$timeout;
                boolean z2 = j2 > ((long) (num == null ? 0 : num.intValue()));
                this.label = 1;
                obj = this.this$0.networkResolver.tryFetchUpdatedFallbackInfo(this.this$0.sdkKey, this.$urlConfig, (String) this.$errorMessage.element, z2, this.this$0.connectivityListener.isNetworkAvailable(), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                this.$urlConfig.setFallbackUrl(this.this$0.networkResolver.getActiveFallbackUrlFromMemory(this.$urlConfig));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigNetworkImpl$retryApiPostLogs$$inlined$postRequest$default$1$2, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d̉=!,i\bӵLc\u0003İI\u0006F\u000b6Ȑ\rӬD\u0012&\u0006\u0007r?ӄRe^-zSX\u0010\u0014{b&\"Ҡ0ٺ?X"}, d2 = {"\n`]<a@F])\rS", "", "\"", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "1n\\{f;:b'\u0003|((\u0006\b<o\u0004'\n?\u0007`\u0005Vk\u001dJz'\u001eY\r2Az\u001c\u0012UNB*?(#wN9\u0013s,\\\u0006e\u0015\u000b\u001d"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.LongRef $end;
        final /* synthetic */ Ref.ObjectRef $errorMessage;
        final /* synthetic */ long $start;
        final /* synthetic */ Integer $timeout;
        final /* synthetic */ UrlConfig $urlConfig;
        int label;
        final /* synthetic */ StatsigNetworkImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Ref.LongRef longRef, long j2, Integer num, StatsigNetworkImpl statsigNetworkImpl, UrlConfig urlConfig, Ref.ObjectRef objectRef, Continuation continuation) {
            super(2, continuation);
            this.$end = longRef;
            this.$start = j2;
            this.$timeout = num;
            this.this$0 = statsigNetworkImpl;
            this.$urlConfig = urlConfig;
            this.$errorMessage = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$end, this.$start, this.$timeout, this.this$0, this.$urlConfig, this.$errorMessage, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                long j2 = (this.$end.element - this.$start) / ((long) 1000000000);
                Integer num = this.$timeout;
                boolean z2 = j2 > ((long) (num == null ? 0 : num.intValue()));
                this.label = 1;
                obj = this.this$0.networkResolver.tryFetchUpdatedFallbackInfo(this.this$0.sdkKey, this.$urlConfig, (String) this.$errorMessage.element, z2, this.this$0.connectivityListener.isNetworkAvailable(), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                this.$urlConfig.setFallbackUrl(this.this$0.networkResolver.getActiveFallbackUrlFromMemory(this.$urlConfig));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigNetworkImpl$retryApiPostLogs$$inlined$postRequest$default$1$3, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d̉=!,i\bӵLc\u0003İI\u0006F\u000b6Ȑ\rӬD\u0012&\u0006\u0007r?ӄRe^-zSX\u0010\u0014{b&\"Ҡ0ٺ?X"}, d2 = {"\n`]<a@F])\rS", "", "\"", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "1n\\{f;:b'\u0003|((\u0006\b<o\u0004'\n?\u0007`\u0005Vk\u001dJz'\u001eY\r2Az\u001c\u0012UNB*?(#wN9\u0013s,\\\u0006e\u0015\u000b\u001d"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.LongRef $end;
        final /* synthetic */ Ref.ObjectRef $errorMessage;
        final /* synthetic */ long $start;
        final /* synthetic */ Integer $timeout;
        final /* synthetic */ UrlConfig $urlConfig;
        int label;
        final /* synthetic */ StatsigNetworkImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Ref.LongRef longRef, long j2, Integer num, StatsigNetworkImpl statsigNetworkImpl, UrlConfig urlConfig, Ref.ObjectRef objectRef, Continuation continuation) {
            super(2, continuation);
            this.$end = longRef;
            this.$start = j2;
            this.$timeout = num;
            this.this$0 = statsigNetworkImpl;
            this.$urlConfig = urlConfig;
            this.$errorMessage = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$end, this.$start, this.$timeout, this.this$0, this.$urlConfig, this.$errorMessage, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                long j2 = (this.$end.element - this.$start) / ((long) 1000000000);
                Integer num = this.$timeout;
                boolean z2 = j2 > ((long) (num == null ? 0 : num.intValue()));
                this.label = 1;
                obj = this.this$0.networkResolver.tryFetchUpdatedFallbackInfo(this.this$0.sdkKey, this.$urlConfig, (String) this.$errorMessage.element, z2, this.this$0.connectivityListener.isNetworkAvailable(), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                this.$urlConfig.setFallbackUrl(this.this$0.networkResolver.getActiveFallbackUrlFromMemory(this.$urlConfig));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigNetworkImpl$retryApiPostLogs$$inlined$postRequest$default$1$4, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d̉=!,i\bӵLc\u0003İI\u0006F\u000b6Ȑ\rӬD\u0012&\u0006\u0007r?ӄRe^-zSX\u0010\u0014{b&\"Ҡ0ٺ?X"}, d2 = {"\n`]<a@F])\rS", "", "\"", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "1n\\{f;:b'\u0003|((\u0006\b<o\u0004'\n?\u0007`\u0005Vk\u001dJz'\u001eY\r2Az\u001c\u0012UNB*?(#wN9\u0013s,\\\u0006e\u0015\u000b\u001d"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.LongRef $end;
        final /* synthetic */ Ref.ObjectRef $errorMessage;
        final /* synthetic */ long $start;
        final /* synthetic */ Integer $timeout;
        final /* synthetic */ UrlConfig $urlConfig;
        int label;
        final /* synthetic */ StatsigNetworkImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Ref.LongRef longRef, long j2, Integer num, StatsigNetworkImpl statsigNetworkImpl, UrlConfig urlConfig, Ref.ObjectRef objectRef, Continuation continuation) {
            super(2, continuation);
            this.$end = longRef;
            this.$start = j2;
            this.$timeout = num;
            this.this$0 = statsigNetworkImpl;
            this.$urlConfig = urlConfig;
            this.$errorMessage = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.$end, this.$start, this.$timeout, this.this$0, this.$urlConfig, this.$errorMessage, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                long j2 = (this.$end.element - this.$start) / ((long) 1000000000);
                Integer num = this.$timeout;
                boolean z2 = j2 > ((long) (num == null ? 0 : num.intValue()));
                this.label = 1;
                obj = this.this$0.networkResolver.tryFetchUpdatedFallbackInfo(this.this$0.sdkKey, this.$urlConfig, (String) this.$errorMessage.element, z2, this.this$0.connectivityListener.isNetworkAvailable(), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                this.$urlConfig.setFallbackUrl(this.this$0.networkResolver.getActiveFallbackUrlFromMemory(this.$urlConfig));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigNetworkImpl$retryApiPostLogs$$inlined$postRequest$default$1(UrlConfig urlConfig, StatsigNetworkImpl statsigNetworkImpl, String str, Integer num, String str2, ContextType contextType, Diagnostics diagnostics, int i2, String str3, Continuation continuation, Ref.ObjectRef objectRef) {
        super(2, continuation);
        this.$urlConfig = urlConfig;
        this.this$0 = statsigNetworkImpl;
        this.$requestCacheKey = str;
        this.$timeout = num;
        this.$eventsCount = str2;
        this.$contextType = contextType;
        this.$diagnostics = diagnostics;
        this.$retries = i2;
        this.$bodyString = str3;
        this.$statusCode$inlined = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StatsigNetworkImpl$retryApiPostLogs$$inlined$postRequest$default$1(this.$urlConfig, this.this$0, this.$requestCacheKey, this.$timeout, this.$eventsCount, this.$contextType, this.$diagnostics, this.$retries, this.$bodyString, continuation, this.$statusCode$inlined);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LogEventResponse> continuation) {
        return ((StatsigNetworkImpl$retryApiPostLogs$$inlined$postRequest$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0077 A[Catch: all -> 0x03f6, Exception -> 0x03fd, TRY_LEAVE, TryCatch #16 {Exception -> 0x03fd, all -> 0x03f6, blocks: (B:12:0x004a, B:15:0x006b, B:17:0x0077), top: B:168:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02d2 A[Catch: all -> 0x039b, Exception -> 0x039d, TryCatch #15 {Exception -> 0x039d, all -> 0x039b, blocks: (B:85:0x02b7, B:87:0x02c1, B:88:0x02d2, B:90:0x02d8, B:92:0x02de, B:93:0x02e6, B:95:0x02f9, B:96:0x02fb, B:99:0x031c, B:107:0x0397, B:108:0x039a, B:97:0x0303), top: B:170:0x02b7 }] */
    /* JADX WARN: Type inference failed for: r4v6, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v61, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v3, types: [T, java.lang.Integer] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1107
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.statsig.androidsdk.StatsigNetworkImpl$retryApiPostLogs$$inlined$postRequest$default$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
