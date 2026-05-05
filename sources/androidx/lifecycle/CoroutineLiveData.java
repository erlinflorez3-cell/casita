package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: CoroutineLiveData.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&˛\bDZc|İI\u0006F\u000b6Ȑ\u0007\":\u0019\u007fјnjO0Le^.ZS@\u000fs{B$c$\u007fّCU0}*\tUNog\u0005JbŏK\u000f\u001c\u0016\u0001j2K]xs\u0012\u0017˰JoU3UoC<fҚLӌH4(\u0600\b\u00041 :J vABy\fRvPv@R\u001bN\u001d\u001a@\bN&\u0007\u001ejjf6vpme=(\u001b\u0011HM7g@\u0003]\u000fVT]˙%h.3P=E\u00175S1\u0010\u0001cO\u0007OsS\u0004\u00171U1ʁwW<cÿ\u0018\u00159[Uk\u00017t\u0005\u007fiRʭiյgMV 6\u000bC\u0018\u001bP\u001c\u000e4<x8;0~\u000e\u001e5\u0005r\nó~\u0019%ێ>ѐe8\u001d=\u000eLs?)\u0001iai\"\u0015ID\u000b\u001b9;\u0001\u001d*\"f^t#(l\u007fa3a@sʰd\t\bKDՑ|Ċ\u0006*\f\u0382\u0018\u000e=\u000b)0-$ek\u0010\u05fd-Ƞ\u0006HLϙС\t|"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E\u001e\u000b$!W~\u0012Ev\f9j}~3|\u0012\u0004", "\"", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E(\u0001\u0016\u001bC~\u0018I])FY\\\u001cFik", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "Bh\\2b<M7\"f\t", "", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005(\u0017&k\u001d8d#?d}u", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0003?b\r J|k\u00134IEz;\"\u001e2fJ\u000f--^\u007f%VPX5j\u001cSM\u001d\u0010i\u0012X4YZ\u001d2", "0k^0^\u0019N\\\"~\b", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E\u001d\b!\u0015M\\\u001eE\u007f%B/", "3lXAg,=A#\u000f\b\\,", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E \t\u001b&Vo\r*\u00015BW}u", "1kT.e\u001aHc&|z", "1kT.e\u001aHc&|z\u001d3\u0001\n/c\u0014&\u0003@z\u001e\u001bXo\r8\u0006!/f}'7i$.", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "3lXAF6N`\u0017~", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001f\u0005%\"Q}\n9}%\u0018U\u0007\u001f>mk", "And?V,", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005(\u0017&k\u001d8L", "3lXAF6N`\u0017~9e0}\t-y}/{:\b\u001b(Gn\nKr\u001fBY\u0005 3{\u0016", "uKP;W9HW\u0018\u0012De0}\t-y}/{\ng\u001b(GN\nKrz\u001c_\b/>q\u001fwKMHuD-\u0019qaGPA6W\u0006+P\\J;`\\{\u0013Wx_\n_'V\fUJ&8.4$\b*XW", "=m00g0OS", "=m8;T*MW*~", ":hU2V@<Z\u0019F\u0002b=|\b+t{\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CoroutineLiveData<T> extends MediatorLiveData<T> {
    private BlockRunner<T> blockRunner;
    private EmittedSource emittedSource;

    public /* synthetic */ CoroutineLiveData(EmptyCoroutineContext emptyCoroutineContext, long j2, Function2 function2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? EmptyCoroutineContext.INSTANCE : emptyCoroutineContext, (i2 + 2) - (i2 | 2) != 0 ? 5000L : j2, function2);
    }

    public CoroutineLiveData(CoroutineContext context, long j2, Function2<? super LiveDataScope<T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        this.blockRunner = new BlockRunner<>(this, block, j2, CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().getImmediate().plus(context).plus(SupervisorKt.SupervisorJob((Job) context.get(Job.Key)))), new Function0<Unit>(this) { // from class: androidx.lifecycle.CoroutineLiveData.1
            final /* synthetic */ CoroutineLiveData<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((CoroutineLiveData) this.this$0).blockRunner = null;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.CoroutineLiveData] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.lifecycle.CoroutineLiveData, androidx.lifecycle.CoroutineLiveData<T>, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emitSource$lifecycle_livedata_release(androidx.lifecycle.LiveData<T> r8, kotlin.coroutines.Continuation<? super kotlinx.coroutines.DisposableHandle> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.lifecycle.CoroutineLiveData$emitSource$1
            if (r0 == 0) goto L63
            r6 = r9
            androidx.lifecycle.CoroutineLiveData$emitSource$1 r6 = (androidx.lifecycle.CoroutineLiveData$emitSource$1) r6
            int r0 = r6.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L63
            int r0 = r6.label
            int r0 = r0 - r2
            r6.label = r0
        L19:
            java.lang.Object r5 = r6.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L35
            if (r1 == r0) goto L47
            if (r1 != r3) goto L69
            java.lang.Object r2 = r6.L$0
            androidx.lifecycle.CoroutineLiveData r2 = (androidx.lifecycle.CoroutineLiveData) r2
            kotlin.ResultKt.throwOnFailure(r5)
        L30:
            androidx.lifecycle.EmittedSource r5 = (androidx.lifecycle.EmittedSource) r5
            r2.emittedSource = r5
            return r5
        L35:
            kotlin.ResultKt.throwOnFailure(r5)
            r6.L$0 = r7
            r6.L$1 = r8
            r6.label = r0
            java.lang.Object r0 = r7.clearSource$lifecycle_livedata_release(r6)
            if (r0 != r4) goto L45
            return r4
        L45:
            r2 = r7
            goto L52
        L47:
            java.lang.Object r8 = r6.L$1
            androidx.lifecycle.LiveData r8 = (androidx.lifecycle.LiveData) r8
            java.lang.Object r2 = r6.L$0
            androidx.lifecycle.CoroutineLiveData r2 = (androidx.lifecycle.CoroutineLiveData) r2
            kotlin.ResultKt.throwOnFailure(r5)
        L52:
            r1 = r2
            androidx.lifecycle.MediatorLiveData r1 = (androidx.lifecycle.MediatorLiveData) r1
            r6.L$0 = r2
            r0 = 0
            r6.L$1 = r0
            r6.label = r3
            java.lang.Object r5 = androidx.lifecycle.CoroutineLiveDataKt.addDisposableSource(r1, r8, r6)
            if (r5 != r4) goto L30
            return r4
        L63:
            androidx.lifecycle.CoroutineLiveData$emitSource$1 r6 = new androidx.lifecycle.CoroutineLiveData$emitSource$1
            r6.<init>(r7, r9)
            goto L19
        L69:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.CoroutineLiveData.emitSource$lifecycle_livedata_release(androidx.lifecycle.LiveData, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object clearSource$lifecycle_livedata_release(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.lifecycle.CoroutineLiveData$clearSource$1
            if (r0 == 0) goto L41
            r4 = r6
            androidx.lifecycle.CoroutineLiveData$clearSource$1 r4 = (androidx.lifecycle.CoroutineLiveData$clearSource$1) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L41
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L13:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L47
            java.lang.Object r1 = r4.L$0
            androidx.lifecycle.CoroutineLiveData r1 = (androidx.lifecycle.CoroutineLiveData) r1
            kotlin.ResultKt.throwOnFailure(r3)
        L27:
            r0 = 0
            r1.emittedSource = r0
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L2d:
            kotlin.ResultKt.throwOnFailure(r3)
            androidx.lifecycle.EmittedSource r0 = r5.emittedSource
            if (r0 == 0) goto L3f
            r4.L$0 = r5
            r4.label = r1
            java.lang.Object r0 = r0.disposeNow(r4)
            if (r0 != r2) goto L3f
            return r2
        L3f:
            r1 = r5
            goto L27
        L41:
            androidx.lifecycle.CoroutineLiveData$clearSource$1 r4 = new androidx.lifecycle.CoroutineLiveData$clearSource$1
            r4.<init>(r5, r6)
            goto L13
        L47:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.CoroutineLiveData.clearSource$lifecycle_livedata_release(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    protected void onActive() {
        super.onActive();
        BlockRunner<T> blockRunner = this.blockRunner;
        if (blockRunner != null) {
            blockRunner.maybeRun();
        }
    }

    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    protected void onInactive() {
        super.onInactive();
        BlockRunner<T> blockRunner = this.blockRunner;
        if (blockRunner != null) {
            blockRunner.cancel();
        }
    }
}
