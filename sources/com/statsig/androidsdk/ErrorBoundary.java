package com.statsig.androidsdk;

import androidx.exifinterface.media.ExifInterface;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
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
@Metadata(bv = {}, d1 = {"Яr\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":\u001e\u007fјnjO0L͜P.hS2\u000f\u0002{<řc$\bCCU \u0002*\t]No˧vJp\u000bK\u000f\f\u0016\u0001jBI]xs\u0012\u00172XoG3coE9fw>\u000562*\u0600\u0002\u0005\u0017\u001a2H\u0016w\u0003Ca\f\u001a0FqBR\u001bN\r\u001a\u0018\tDĨ\u0017Ȧ\rg|5\tym@5#\u0011iZNU`݁\u0001M\u001bH\u001d\u0001\u001b\by\u001eYRg?#8k\t\u0017Tk?1Q Q5p-'9^\fYLW.\u0018EVU\rk\t>\u0002\u0015jp#=*}{4R$'V\u0014ԫ\u0011F\n(\u0016-NI=\u001cl\u000e4O\u0005tc@~\u0014tA.\u0012\u0012>\u001d%\u000ePC;1e\u007fe\u0004N\\U\u0014\u0007#\u001di \u000f#a٪\u001c\u007fE5b\u000biGW?MP^\u0010i?}\u00047\u00020J\u00144W\u0002Ez?-E<}يwٳ ǽɘLDu\u0018MKvq\u0002R\u000f_Bp\u001cճ8(<tRw\u001d\u0002VSh4!S,V\u0017}N2N|\b@1'&M}g\u0018\u0002}\u0011\u0018;G\u0016=X~\u0001\u001ejgv\u001c50|ߧe\\|.OBh hhHY2}l028Xl wBc|,#6Os23Z0G~[ȄAەAˆҴ\r_h\rX\u0003bX<\u0003\u0018J=\r\u000fwtp\u001e\u000eAM:%x\"[E\u001aC'Om\"\u0017F-'\u0015\u001b\f\u007fu\u0012\u0013G\u0015\f$!m{N(J=_KU\u0013=)Y:\b-Sa\u000bggL@+A۠ɍ\u0013;nZ0\u0014x\u001eD`\u0019\\\u007fX%%\u000f^!'Pp\u000e(yF)Y\u0014X\u0019eVI!\u000e*J\\;\u0015\u00075\u001dS\u0005Fܵ\tީ1C/ݴf\u0004\"/-a\fjFІ{ˏ\u0013&|ЁT:q\u001b\bdg\\`A\u000fՁe˽B\",ЗS^Vq\u0010\u0018R\u000bD\raLolY\\HO\u001b/,je5cߡbݍ>\u0013wϘ\u0005<m4\fE\u0014\u0013\rN{ݑYϬkmuж-#X\u001b\"\u000b*5Eܟ(ݞ$b_ł!2\f\u0001&Da=h\u0014J\u0019Ӛ4.D\b\u0011ZҶm5"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'|\u001bF\u0004\u0002?i\u0007\u001f3z*\u0004", "", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%#W\b+7CY\u001f", "/oX\u0018X@", "", "2hP4a6Lb\u001d|\t", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`&s\n>\u007f/Ch\u0002\u001eEC", "AdT;", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u001de\u000f}", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a5o\u001d\u0012", "AsPAf0@;\u0019\u000ev](\f\u0005", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7A}/3l\u0012=I\u0019", "Cq[ g9B\\\u001b", "5dc\"e3,b&\u0003\u0004`jx\u0012.r\n,z:\u000f\u0016\u001dA|\u000eCv!CY", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\"e3,b&\u0003\u0004`jx\u0012.r\n,z:\u000f\u0016\u001dA|\u000eCv!CY", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "1`_Ah9>", "", "B`b8", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "B`V", "@dR<i,K", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aiPCTuEO\"\u0001D>?z\t:t\u00042\u0005\u0016", "\u001aj^A_0G\u001dx\u0012x^7\f\r9nU", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "3wR2c;B]\"", "1n]3\\.'O!~", "1`_Ah9>/'\u0013\u0004\\", "\"", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u0007=w%5QL\u0005i>+\u001fxp=\u0010c:\u0018T1P[R5lN\u0002A\u001e\u001b0Q50\t\u0016U\u000b+jM9hq)N\u00029wV", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", ExifInterface.GPS_MEASUREMENT_3D, "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d^0tT5\u001c\f]JmlND)\u0018;M\u000b;vJi \u0017DnyRR\u001fK\u0004\u001eK\u0005\u0010mBj[CN=NdsN\td\u001dZI\u0010", "5dc\u0012k*>^(\u0003\u0005g\u000fx\u0012.l\u007f5", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0005HW}+Fq 70?Dj;\u001e\">", "5dc\u001bb6I3,|zi;\u0001\u00138H{1zG\u0001$", "5dc\"e3", "6`]1_,\u001ef\u0017~\u0006m0\u0007\u0012", "", ":nV\u0012k*>^(\u0003\u0005g", ":nV\u0012k*>^(\u0003\u0005gjx\u0012.r\n,z:\u000f\u0016\u001dA|\u000eCv!CY", "Adc\u0018X@", "Adc\u001aX;:R\u0015\u000ev", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class ErrorBoundary {
    private String apiKey;
    private final CoroutineScope coroutineScope;
    private Diagnostics diagnostics;
    private HashSet<String> seen;
    private StatsigMetadata statsigMetadata;
    private String urlString;

    /* JADX INFO: renamed from: com.statsig.androidsdk.ErrorBoundary$captureAsync$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return ErrorBoundary.this.captureAsync(null, this);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.ErrorBoundary$captureAsync$2, reason: invalid class name */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return ErrorBoundary.this.captureAsync(null, null, this);
        }
    }

    public ErrorBoundary() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ErrorBoundary(CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        this.urlString = "https://prodregistryv2.org/v1/rgstr_e";
        this.seen = new HashSet<>();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ErrorBoundary(CoroutineScope coroutineScope, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            CompletableJob completableJobSupervisorJob$default = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);
            Dispatchers dispatchers = Dispatchers.INSTANCE;
            coroutineScope = CoroutineScopeKt.CoroutineScope(completableJobSupervisorJob$default.plus(Dispatchers.getIO()));
        }
        this(coroutineScope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void capture$default(ErrorBoundary errorBoundary, Function0 function0, String str, Function1 function1, String str2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            str = null;
        }
        if ((4 & i2) != 0) {
            function1 = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            str2 = null;
        }
        errorBoundary.capture(function0, str, function1, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleException(Throwable th) {
        System.out.println((Object) "[Statsig]: An unexpected exception occurred.");
        System.out.println(th);
        if (th instanceof ExternalException) {
            return;
        }
        logException$android_sdk_release$default(this, th, null, 2, null);
    }

    public static /* synthetic */ void logException$android_sdk_release$default(ErrorBoundary errorBoundary, Throwable th, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        errorBoundary.logException$android_sdk_release(th, str);
    }

    public final void capture(Function0<Unit> task, String str, Function1<? super Exception, Unit> function1, String str2) {
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            task.invoke();
        } catch (Exception e2) {
            handleException(e2);
            if (function1 == null) {
                return;
            }
            function1.invoke(e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> java.lang.Object captureAsync(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r6, kotlin.coroutines.Continuation<? super T> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.statsig.androidsdk.ErrorBoundary.AnonymousClass1
            if (r0 == 0) goto L25
            r4 = r7
            com.statsig.androidsdk.ErrorBoundary$captureAsync$1 r4 = (com.statsig.androidsdk.ErrorBoundary.AnonymousClass1) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L25
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L13:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L37
            if (r1 != r0) goto L2f
            java.lang.Object r1 = r4.L$0
            com.statsig.androidsdk.ErrorBoundary r1 = (com.statsig.androidsdk.ErrorBoundary) r1
            goto L2b
        L25:
            com.statsig.androidsdk.ErrorBoundary$captureAsync$1 r4 = new com.statsig.androidsdk.ErrorBoundary$captureAsync$1
            r4.<init>(r7)
            goto L13
        L2b:
            kotlin.ResultKt.throwOnFailure(r3)     // Catch: java.lang.Exception -> L48
            goto L4f
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L37:
            kotlin.ResultKt.throwOnFailure(r3)
            r4.L$0 = r5     // Catch: java.lang.Exception -> L45
            r4.label = r0     // Catch: java.lang.Exception -> L45
            java.lang.Object r3 = r6.invoke(r4)     // Catch: java.lang.Exception -> L45
            if (r3 != r2) goto L4f
            return r2
        L45:
            r0 = move-exception
            r1 = r5
            goto L49
        L48:
            r0 = move-exception
        L49:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1.handleException(r0)
            r3 = 0
        L4f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.statsig.androidsdk.ErrorBoundary.captureAsync(kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> java.lang.Object captureAsync(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r8, kotlin.jvm.functions.Function2<? super java.lang.Exception, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r9, kotlin.coroutines.Continuation<? super T> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.statsig.androidsdk.ErrorBoundary.AnonymousClass2
            if (r0 == 0) goto L5e
            r6 = r10
            com.statsig.androidsdk.ErrorBoundary$captureAsync$2 r6 = (com.statsig.androidsdk.ErrorBoundary.AnonymousClass2) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L5e
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L16:
            java.lang.Object r5 = r6.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L36
            if (r1 == r0) goto L2a
            if (r1 != r3) goto L64
            kotlin.ResultKt.throwOnFailure(r5)
        L29:
            return r5
        L2a:
            java.lang.Object r9 = r6.L$1
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            java.lang.Object r2 = r6.L$0
            com.statsig.androidsdk.ErrorBoundary r2 = (com.statsig.androidsdk.ErrorBoundary) r2
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Exception -> L49
            goto L29
        L36:
            kotlin.ResultKt.throwOnFailure(r5)
            r6.L$0 = r7     // Catch: java.lang.Exception -> L46
            r6.L$1 = r9     // Catch: java.lang.Exception -> L46
            r6.label = r0     // Catch: java.lang.Exception -> L46
            java.lang.Object r5 = r8.invoke(r6)     // Catch: java.lang.Exception -> L46
            if (r5 != r4) goto L29
            return r4
        L46:
            r1 = move-exception
            r2 = r7
            goto L4a
        L49:
            r1 = move-exception
        L4a:
            r0 = r1
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r2.handleException(r0)
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r0
            r6.label = r3
            java.lang.Object r5 = r9.invoke(r1, r6)
            if (r5 != r4) goto L29
            return r4
        L5e:
            com.statsig.androidsdk.ErrorBoundary$captureAsync$2 r6 = new com.statsig.androidsdk.ErrorBoundary$captureAsync$2
            r6.<init>(r10)
            goto L16
        L64:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.statsig.androidsdk.ErrorBoundary.captureAsync(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final CoroutineExceptionHandler getExceptionHandler() {
        return new ErrorBoundary$getExceptionHandler$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, this);
    }

    public final CoroutineExceptionHandler getNoopExceptionHandler() {
        return new ErrorBoundary$getNoopExceptionHandler$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key);
    }

    public final String getUrl() {
        return this.urlString;
    }

    public final String getUrlString$android_sdk_release() {
        return this.urlString;
    }

    public final void logException$android_sdk_release(Throwable exception, String str) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        try {
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, getNoopExceptionHandler(), null, new ErrorBoundary$logException$1(this, exception, str, null), 2, null);
        } catch (Exception unused) {
        }
    }

    public final void setKey(String apiKey) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.apiKey = apiKey;
    }

    public final void setMetadata(StatsigMetadata statsigMetadata) {
        Intrinsics.checkNotNullParameter(statsigMetadata, "statsigMetadata");
        this.statsigMetadata = statsigMetadata;
    }

    public final void setUrlString$android_sdk_release(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.urlString = str;
    }
}
