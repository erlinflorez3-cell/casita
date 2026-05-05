package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<;\"&i\u000eKLш|\u0004W\u00068\u000bDB\u0007\"B\u0012\u007f\u0007tʑA0ZeP.XS2\u000f\u0002{<$a(yCQU\"}(\tWN}gvJ`\u000bK\u000f\u001c\u0016\u0001jBI]ތub\u001d˰Zo\u00062mqCʠnsf\t.2:8(\u00061?8J(\u0018\u0001B[\u000e\"0ntJZ\u001dS\u0015\u001c\"\u0006\u0005\u001f/#lk^8^k\f@]&ɨmBT.&ܥ;մ\rN\\-\u0013uq\u001e9@U4չ)S\u0011\u000fj.MšWq\u0004\u0004\t)-ǢWr\b:f\t,\u0015YY=\u0003\u0001(t&W_\u001c);O\u0012O`\u00168}\u000b}\u001d<J\r4,X2=\u001c|\u0007<9#uՂDP\be\tȜ9ʫ6\u001f-\u00069*I\u001btQ\u007f:ϭR9\u0002\u0010\u001b&;F|-sV$_[\u001atyWĸ_?mL\\\nq=\u001c\u0005!\b\u0010,\u001cQM~?}!.E)GcI)1m\u0012H\u000bf%\nplckhGn(\u001d\u0019֖.\t\u0012a\u000bߦC\u07fbTTf4)\u0015*`\u001f\u007f\u001e\u0012f[\u0018>'ط\u001eM\u007flwse]8/_\fE[\u0007\r\u0014VI`C5\u007fg ib|$ALbKW\u0015Gc\u0010j^>!`N\u0019\u0013ȑ\u007fDT\u0013YԼ}ۇ 62>'d-#\u0011,ZC\u0013\b\u000e`\t\u0012\u0005ԞA3#o*s\u0017\u007fx\\7~\u0018\tW<\u0015l2/QQ{(6W2hz{Q\u0018/\u0019\u000eI\u007fmMK|\u0018\u0006U*$&\"IW??#\u000fE(`\u0007=I\\t{P{\u0018U}܃}\u000fAotgŰnp:r\u0003h]g/\"%r#'\u0016y\u0018y\u0010G+Kqj#[l`#\u0007gLf8+\u001deǇݻ\u0005\t"}, d2 = {"Ehc5G0FS#\u000f\n", "\"", "Bh\\2@0EZ\u001d\r", "", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uI;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu\u001es =TGD52(\"rqH\u000bl,\\@\u0005QU]0ebnL\u0018\u001ccc\u0012\u0012\u0012\u0001j=mu@@!Q\u0016F\u0007;f\u0010a", "Bh\\2b<M", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006IV", "Ehc5G0FS#\u000f\n&\u0012c\u001d5u{\f", "Ehc5G0FS#\u000f\nH9e\u00196l", "Ehc5G0FS#\u000f\nH9e\u00196lG\u000ebT\u0007'\u0013+", "AdcBc\u001bB[\u0019\t\u000bm", "#", "1na<h;B\\\u0019", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E/\u0005\u001f\u0017Q\u007f\u001d\u001a\u00012?i\r$@mk", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\no\u001b\u001fGy\u001eKT/Bc\u000e/;v\u0016\u00044IEz;\"\u001e2fJ\u000f--^\u007f%VPX5j\u001cSM\u001d\u0010i\u0012X4YZ\u001d()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@", "\"h\\2b<M1\u0015\bx^3\u0004\u0005>i\n1[S~\u0017\"Vs\u0018E", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E/\u0005\u001f\u0017Q\u007f\u001d\u001ar.3Y\u0005'3|\u001a8V#Ni4)$lkB\\", "Bh\\2", "2d[.l", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001f\u0001\u001e\u0013[E", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class TimeoutKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1<T> extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TimeoutKt.withTimeoutOrNull(0L, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlinx.coroutines.TimeoutCancellationException TimeoutCancellationException(long r2, kotlinx.coroutines.Delay r4, kotlinx.coroutines.Job r5) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.DelayWithTimeoutDiagnostics
            if (r0 == 0) goto L31
            kotlinx.coroutines.DelayWithTimeoutDiagnostics r4 = (kotlinx.coroutines.DelayWithTimeoutDiagnostics) r4
        L6:
            if (r4 == 0) goto L16
            kotlin.time.Duration$Companion r0 = kotlin.time.Duration.Companion
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            long r0 = kotlin.time.DurationKt.toDuration(r2, r0)
            java.lang.String r1 = r4.m10474timeoutMessageLRDsOJo(r0)
            if (r1 != 0) goto L2b
        L16:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Timed out waiting for "
            r1.<init>(r0)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = " ms"
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = r0.toString()
        L2b:
            kotlinx.coroutines.TimeoutCancellationException r0 = new kotlinx.coroutines.TimeoutCancellationException
            r0.<init>(r1, r5)
            return r0
        L31:
            r4 = 0
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.TimeoutKt.TimeoutCancellationException(long, kotlinx.coroutines.Delay, kotlinx.coroutines.Job):kotlinx.coroutines.TimeoutCancellationException");
    }

    private static final <U, T extends U> Object setupTimeout(TimeoutCoroutine<U, ? super T> timeoutCoroutine, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        JobKt.disposeOnCompletion(timeoutCoroutine, DelayKt.getDelay(timeoutCoroutine.uCont.getContext()).invokeOnTimeout(timeoutCoroutine.time, timeoutCoroutine, timeoutCoroutine.getContext()));
        return UndispatchedKt.startUndispatchedOrReturnIgnoreTimeout(timeoutCoroutine, timeoutCoroutine, function2);
    }

    public static final <T> Object withTimeout(long j2, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        if (j2 <= 0) {
            throw new TimeoutCancellationException("Timed out immediately");
        }
        Object obj = setupTimeout(new TimeoutCoroutine(j2, continuation), function2);
        if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return obj;
    }

    /* JADX INFO: renamed from: withTimeout-KLykuaI */
    public static final <T> Object m10481withTimeoutKLykuaI(long j2, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return withTimeout(DelayKt.m10473toDelayMillisLRDsOJo(j2), function2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0082  */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, kotlinx.coroutines.TimeoutCoroutine] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object withTimeoutOrNull(long r8, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r10, kotlin.coroutines.Continuation<? super T> r11) {
        /*
            boolean r0 = r11 instanceof kotlinx.coroutines.TimeoutKt.AnonymousClass1
            if (r0 == 0) goto L32
            r5 = r11
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r5 = (kotlinx.coroutines.TimeoutKt.AnonymousClass1) r5
            int r0 = r5.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L32
            int r0 = r5.label
            int r0 = r0 - r2
            r5.label = r0
        L19:
            java.lang.Object r1 = r5.result
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r6 = 0
            r4 = 1
            if (r0 == 0) goto L44
            if (r0 != r4) goto L3c
            long r2 = r5.J$0
            java.lang.Object r3 = r5.L$1
            kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref.ObjectRef) r3
            java.lang.Object r0 = r5.L$0
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            goto L38
        L32:
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r5 = new kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1
            r5.<init>(r11)
            goto L19
        L38:
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L7a
            goto L77
        L3c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L44:
            kotlin.ResultKt.throwOnFailure(r1)
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 > 0) goto L4e
            return r6
        L4e:
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef
            r3.<init>()
            r5.L$0 = r10     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L78
            r5.L$1 = r3     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L78
            r5.J$0 = r8     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L78
            r5.label = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L78
            r1 = r5
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L78
            kotlinx.coroutines.TimeoutCoroutine r0 = new kotlinx.coroutines.TimeoutCoroutine     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L78
            r0.<init>(r8, r1)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L78
            r3.element = r0     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L78
            java.lang.Object r1 = setupTimeout(r0, r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L78
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L78
            if (r1 != r0) goto L74
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L78
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r5)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L78
        L74:
            if (r1 != r7) goto L77
            return r7
        L77:
            return r1
        L78:
            r2 = move-exception
            goto L7b
        L7a:
            r2 = move-exception
        L7b:
            kotlinx.coroutines.Job r1 = r2.coroutine
            T r0 = r3.element
            if (r1 != r0) goto L82
            return r6
        L82:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: withTimeoutOrNull-KLykuaI */
    public static final <T> Object m10482withTimeoutOrNullKLykuaI(long j2, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return withTimeoutOrNull(DelayKt.m10473toDelayMillisLRDsOJo(j2), function2, continuation);
    }
}
