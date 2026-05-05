package kotlinx.coroutines.tasks;

import com.dynatrace.android.agent.Global;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.ChildHandle;
import kotlinx.coroutines.ChildJob;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.selects.SelectClause0;
import kotlinx.coroutines.selects.SelectClause1;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001a\u001d̉=!4i\bӵLc\u000b\u0004I\u00066\u000b6B\u0015\"4\u0012}\u000b~\u0005Gӄ\\kX0bSp\u000f\u001azT&aҕ\u007fCc[*\u007f2\t\u0016N\u0016h\u0007dh\r[\u0015\u0016\u0018\tjrI\u0004y}\u0014\u0015˰Pog9]qM9'td\u00048V0:\u0012\u000b\u0011\u001c:HVv)Dk\u000e\u0018ؓNpbX\u001dO\u0015\u001aX\u0006l\u001f1\"jjf6vp$?GI\u0011nZT7a@|\u0014\rtUG\u000f|ѭ,+h=E\u00175SI\u0007\u0001Zo\tMtU\u0007~&U/\u0010soRf\u0006,\u0015qO-_x̦j\u0005yf\u001c);O*K~\rnÂ9ԫ\u0011<\u0012\u0015\u001eKV4E\u001a-\b.5zɁa@x\bnD\u0010z(6E$079<3f\u007fe\u0002ϒ\rѼ\u007f\u0005\u001b&;'|*sTT`5\u001dZȭ_1yFMJ^\n =\u001c\u0003!h\u0010-\u001c2]~]\u007fWчUÉ;[G+ݒo\f"}, d2 = {"/rC.f2", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EB\t%`Vk\u001cB\u0005n$U\f&\r", "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001f\u0001\u0018\u0017T|\u000e;L", "/r32Y,K`\u0019}", "1`]0X3EO(\u0003\u0005g\u001b\u0007\u000f/nm2\fM~\u0017", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EB\t%`Vk\u001cB\u0005n\u0013U\u0007\u001e7t\u001d*\\GEt#(\u001bhj'\u0011s9Lv|", "/r32Y,K`\u0019}^f7\u0004", "/vP6g", "uKR<`u@]#\u0001\u0002^ux\u0012.r\n,z\n\u0003\u001f%\u0011~\nJ|3~Hy.=C|4WRBo=g\u0013rnC\u0017r0Wv5\u0011*X5kV{M\u0010!^\u0018W\u0001Pk^=5j\u000e>\u001b\u0011.\u0013k8m\u0001\n%c", "uKR<`u@]#\u0001\u0002^ux\u0012.r\n,z\n\u0003\u001f%\u0011~\nJ|3~Hy.=C|,WK\u0005m>(\u0017oa\u0003\u0003l+[\u0001+F\u0016P4j\u001c\u00029\"\u0018hW,'\u0016\u0003YH+jS;)\u0011\u001bS\b;qn\u0016&\u001b3jF)\\\u001aV\u0001\u0019~\u000b'rSco\tKJEpsB\u0016h,`CJ #u#$>\u0014\u0015\u000fwd\r<Yupi\u0011\u0003w=$<|1", "/vP6g\u0010F^ ", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eo\u0007G|+^Uo\u001bMz#5g"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class TasksKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.tasks.TasksKt$asDeferredImpl$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯĊ\u0014D߬)\u001e\u007f\u007fL܀kt\u001aA\u000eֶ\u0013.X~*,\u0018x\u000ffxB8ǏmH<S[*\u001dk\u00044:[,qI;]\u001a\f̝\u0011OTgon`Z\u0013C%\u0006\u001exp.QU\u000f]\u001a\u000f8Fw?IMwމA`\u000b6\r H\"@y\u000b\u0004\"*^\u0010~zIK\u0014\u0012F@x:X\u000eU\u00050\u0012\u000e>&\u0003&\\}N>ԟt]P/+\u0003oBv&ڿ6\u0005cεvZ7\u000f\u0007aTѨn6}$3S\u001b\u0007\u0001\\o\u0007MsU\u0005\u0017*mǺH<cD\\\u0018\u0014Kۀ\u0016լ\u001dę*\\\u0013V)\u001d51gcyW>.\u0006\u0003\u0014\u000fR\u0003<\u000fmζ-u!t\u000e&3#|\u001aċOJoP\u0006\u0013ad!U\u0006A3Q\u001d|P\u0010F_ע6D?\u001b*;\u00015.{\\\u0014_#(|yg0\u007fNmL\\\u0019q=4\u0011!x\u0010:\u001cBW\u0002?{W;''G[g51m\u0012H\u000bt%\u0016'üRׂVHN57<E>!\u000epC+\u001a\fVZW:&u\u001c\u0003\u0019.\u0012!6t}L#5\u0010\u0015d\u0017\u00011ܫ^ܦ)/tO\"uy'o9\r>{ȹbXm`\u0011,?rϵKֲe͞W\fhwp+@d\u0003\u0012\u000ezrWRƦ1\b\u001e*QD1GzEi\u0011=Z^\r\u001cok~\u000f-]տ(\roE\u0005\u000f\u0007rlrum\u001fQ<~p\"[K\u007fU_ĶTj%B\u001a;\u0007-\u00120Kuo_L\u001b\u001d&Y\nD.\u001agX_^!.\u0017FB\u0015=Vbq\u0014Z̊\u00161\u0001\u001e\n\u0015A\u000b>i\u000ep\u00174plZO\u0003!P\u0017%ш\"Pp\u000e\u001fyF)Q*ӑJИBI\u0001\b\"O\\^\u0015\u0005MEU\t}8\u00159=C-\u001eD\u000fZڃ\u0014*lw\u0018Fy\u00116Vxs-DcD\u0017)Ъ^zJFqq~lLTp\u0011m`j&2\tޞ5U:Vm|p\u0005?\u0014ߩ.Ns\u0015Y%vf]J\u0013\u001e(b\\6͟v\u0014\u0005\"\u000e[%?T*ܡp>Rj;b\u000f8\u0012Rϙqb#KQnW\u0011\u0010\u0007ӆvhAOQz\tL\t*5ZS^\u0558F%v\u0014B\u0013\u0006Va\u001f\u0017h߿\"n-լWIcd|\u001d`s\u0016wƸ\u0004O\u001aAT\u00117G\u0004\u001cp\u000bC:Ѻ\u0004Ӟ!@"}, d2 = {"9nc9\\5Q\u001d\u0017\t\bh<\f\r8e\u000eq\u000b<\u000f\u001d%\u0011^\nJ|3\u001bh<\u001cEL\u0016/MPHk3\u0002\u001dshwT", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001f\u0001\u0018\u0017T|\u000e;L", "/sc.V/\u001cV\u001d\u0006y", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u0004\u001b\u001eFR\nEu,5/", "1gX9W", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u0004\u001b\u001eFT\u00189L", "/vP6g", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "1`]0X3", "", "1`d@X", "", "", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt\u0013Pm\u000eC}!D]\b)\u0017\u0001\u0014.XR?u=s", "4n[1", Global.BLANK, "", "7mXA\\(E", "=oT?T;B]\"", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3F,u5MK;tCs", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00100\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "5dc", "\u0013", "9dh", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3F,{.a\u0019", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0003?b\r J|T\u0014MW\u0011/\u001b$\u001fwh=\u0010-*X\u00041W[R5\\`<\u001b\u001e\u001fd\u001e]/\u0016\u00057K-}DJ.F\fP\u0002Ch\n\u001bk", "5dc\u0010T5<S \u0006vm0\u0007\u0012\u000fx}(\u0007O\u0005! ", "5dc\u0010b4IZ\u0019\u000ez]", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "5dc\u0010b4IZ\u0019\u000e~h5\\\u001c-e\u000b7\u007fJ\n\u0001$0\u007f\u0015C", "7me<^,(\\v\t\u0003i3|\u00183o\t", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001f\u0005%\"Q}\n9}%\u0018U\u0007\u001f>mk", "6`]1_,K", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "=m2.a*>Z \u0003\u0004`", "7me<^,\"[!~yb(\f\t6y", "8nX;", ";h]Bf\u0012>g", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", ">kd@", "1n]AX?M", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "=sW2e", "AsP?g", "1gX9W9>\\", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", "7r00g0OS", "7r2.a*>Z ~y", "7r2<`7ES(~y", "=m0DT0M", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0015t\u0012>[C\u0007A", "=m9<\\5", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0015t\u0012>[C\u0006A", ">`a2a;", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eo\u0007G|+^Uo\u001bMz#5g"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass3<T> implements Deferred<T> {
        private final /* synthetic */ CompletableDeferred<T> $$delegate_0;

        AnonymousClass3(CompletableDeferred<T> completableDeferred) {
            completableDeferred = completableDeferred;
        }

        @Override // kotlinx.coroutines.Job
        public ChildHandle attachChild(ChildJob childJob) {
            return completableDeferred.attachChild(childJob);
        }

        @Override // kotlinx.coroutines.Deferred
        public Object await(Continuation<? super T> continuation) {
            return completableDeferred.await(continuation);
        }

        @Override // kotlinx.coroutines.Job
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016O\n8v4e%*\u0015wF\u0010\u00175\\]^\"f\bw\u0019bwZwlW\u0001-z\u0002\f{Kad(OK0FC!d_9}5\b\f3\u000f\u0002*")
        @InterfaceC1492Gx
        public /* synthetic */ void cancel() {
            completableDeferred.cancel();
        }

        @Override // kotlinx.coroutines.Job
        public void cancel(CancellationException cancellationException) {
            completableDeferred.cancel(cancellationException);
        }

        @Override // kotlinx.coroutines.Job
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016O\n8v4e%*\u0015wF\u0010\u00175\\]^\"f\bw\u0019bwZwlW\u0001-z\u0002\f{Kad(OK0FC!d_9}5\b\f3\u000f\u0002*")
        @InterfaceC1492Gx
        public /* synthetic */ boolean cancel(Throwable th) {
            return completableDeferred.cancel(th);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public <R> R fold(R r2, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) completableDeferred.fold(r2, function2);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
            return (E) completableDeferred.get(key);
        }

        @Override // kotlinx.coroutines.Job
        public CancellationException getCancellationException() {
            return completableDeferred.getCancellationException();
        }

        @Override // kotlinx.coroutines.Job
        public Sequence<Job> getChildren() {
            return completableDeferred.getChildren();
        }

        @Override // kotlinx.coroutines.Deferred
        public T getCompleted() {
            return completableDeferred.getCompleted();
        }

        @Override // kotlinx.coroutines.Deferred
        public Throwable getCompletionExceptionOrNull() {
            return completableDeferred.getCompletionExceptionOrNull();
        }

        @Override // kotlin.coroutines.CoroutineContext.Element
        public CoroutineContext.Key<?> getKey() {
            return completableDeferred.getKey();
        }

        @Override // kotlinx.coroutines.Deferred
        public SelectClause1<T> getOnAwait() {
            return completableDeferred.getOnAwait();
        }

        @Override // kotlinx.coroutines.Job
        public SelectClause0 getOnJoin() {
            return completableDeferred.getOnJoin();
        }

        @Override // kotlinx.coroutines.Job
        public Job getParent() {
            return completableDeferred.getParent();
        }

        @Override // kotlinx.coroutines.Job
        public DisposableHandle invokeOnCompletion(Function1<? super Throwable, Unit> function1) {
            return completableDeferred.invokeOnCompletion(function1);
        }

        @Override // kotlinx.coroutines.Job
        public DisposableHandle invokeOnCompletion(boolean z2, boolean z3, Function1<? super Throwable, Unit> function1) {
            return completableDeferred.invokeOnCompletion(z2, z3, function1);
        }

        @Override // kotlinx.coroutines.Job
        public boolean isActive() {
            return completableDeferred.isActive();
        }

        @Override // kotlinx.coroutines.Job
        public boolean isCancelled() {
            return completableDeferred.isCancelled();
        }

        @Override // kotlinx.coroutines.Job
        public boolean isCompleted() {
            return completableDeferred.isCompleted();
        }

        @Override // kotlinx.coroutines.Job
        public Object join(Continuation<? super Unit> continuation) {
            return completableDeferred.join(continuation);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
            return completableDeferred.minusKey(key);
        }

        @Override // kotlin.coroutines.CoroutineContext
        public CoroutineContext plus(CoroutineContext coroutineContext) {
            return completableDeferred.plus(coroutineContext);
        }

        @Override // kotlinx.coroutines.Job
        @Deprecated(level = DeprecationLevel.ERROR, message = "\u0012V\u0001Gr\t$i\u0018\u000erA\u0010$:\u000epc\u0018fnw\u000e\u0012\u0006HxoQ\t7&q_$OR]vBT%??%i\u001a9\fgJznQs\u0013KJ#V*\fH\u000b\u0001\u0011/:+Y\u0012\u0001u6G\u0001T\u0015L\u007fOBg2aszSfn;)\taEO9\u0004/a\u001eN_Q//CIf\u000f&8\u0001Aeo\u000b4+aHG\u0003.n8W\u0003\u0014\u0012Ci\u0004,W%\u0017}'':B\fV<\u000bS]=\u0003m0\\hg6 .w\u0012*\u0018xh\u000el\n{o\u000e.LvU\u001a]-2 Y?\u0011\u0001;WNaoS%nY%\u000f{\"Em1S:&\u0002")
        @InterfaceC1492Gx
        public Job plus(Job job) {
            return completableDeferred.plus(job);
        }

        @Override // kotlinx.coroutines.Job
        public boolean start() {
            return completableDeferred.start();
        }
    }

    public static final <T> Deferred<T> asDeferred(Task<T> task) {
        return asDeferredImpl(task, null);
    }

    public static final <T> Deferred<T> asDeferred(Task<T> task, CancellationTokenSource cancellationTokenSource) {
        return asDeferredImpl(task, cancellationTokenSource);
    }

    private static final <T> Deferred<T> asDeferredImpl(Task<T> task, final CancellationTokenSource cancellationTokenSource) {
        final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        if (task.isComplete()) {
            Exception exception = task.getException();
            if (exception != null) {
                completableDeferredCompletableDeferred$default.completeExceptionally(exception);
            } else if (task.isCanceled()) {
                Job.DefaultImpls.cancel$default((Job) completableDeferredCompletableDeferred$default, (CancellationException) null, 1, (Object) null);
            } else {
                completableDeferredCompletableDeferred$default.complete(task.getResult());
            }
        } else {
            task.addOnCompleteListener(DirectExecutor.INSTANCE, new OnCompleteListener() { // from class: kotlinx.coroutines.tasks.TasksKt$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    TasksKt.asDeferredImpl$lambda$1(completableDeferredCompletableDeferred$default, task2);
                }
            });
        }
        if (cancellationTokenSource != null) {
            completableDeferredCompletableDeferred$default.invokeOnCompletion(new Function1() { // from class: kotlinx.coroutines.tasks.TasksKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TasksKt.asDeferredImpl$lambda$2(cancellationTokenSource, (Throwable) obj);
                }
            });
        }
        return new Deferred<T>() { // from class: kotlinx.coroutines.tasks.TasksKt.asDeferredImpl.3
            private final /* synthetic */ CompletableDeferred<T> $$delegate_0;

            AnonymousClass3(final CompletableDeferred<T> completableDeferredCompletableDeferred$default2) {
                completableDeferred = completableDeferredCompletableDeferred$default2;
            }

            @Override // kotlinx.coroutines.Job
            public ChildHandle attachChild(ChildJob childJob) {
                return completableDeferred.attachChild(childJob);
            }

            @Override // kotlinx.coroutines.Deferred
            public Object await(Continuation<? super T> continuation) {
                return completableDeferred.await(continuation);
            }

            @Override // kotlinx.coroutines.Job
            @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016O\n8v4e%*\u0015wF\u0010\u00175\\]^\"f\bw\u0019bwZwlW\u0001-z\u0002\f{Kad(OK0FC!d_9}5\b\f3\u000f\u0002*")
            @InterfaceC1492Gx
            public /* synthetic */ void cancel() {
                completableDeferred.cancel();
            }

            @Override // kotlinx.coroutines.Job
            public void cancel(CancellationException cancellationException) {
                completableDeferred.cancel(cancellationException);
            }

            @Override // kotlinx.coroutines.Job
            @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016O\n8v4e%*\u0015wF\u0010\u00175\\]^\"f\bw\u0019bwZwlW\u0001-z\u0002\f{Kad(OK0FC!d_9}5\b\f3\u000f\u0002*")
            @InterfaceC1492Gx
            public /* synthetic */ boolean cancel(Throwable th) {
                return completableDeferred.cancel(th);
            }

            @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            public <R> R fold(R r2, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
                return (R) completableDeferred.fold(r2, function2);
            }

            @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
                return (E) completableDeferred.get(key);
            }

            @Override // kotlinx.coroutines.Job
            public CancellationException getCancellationException() {
                return completableDeferred.getCancellationException();
            }

            @Override // kotlinx.coroutines.Job
            public Sequence<Job> getChildren() {
                return completableDeferred.getChildren();
            }

            @Override // kotlinx.coroutines.Deferred
            public T getCompleted() {
                return completableDeferred.getCompleted();
            }

            @Override // kotlinx.coroutines.Deferred
            public Throwable getCompletionExceptionOrNull() {
                return completableDeferred.getCompletionExceptionOrNull();
            }

            @Override // kotlin.coroutines.CoroutineContext.Element
            public CoroutineContext.Key<?> getKey() {
                return completableDeferred.getKey();
            }

            @Override // kotlinx.coroutines.Deferred
            public SelectClause1<T> getOnAwait() {
                return completableDeferred.getOnAwait();
            }

            @Override // kotlinx.coroutines.Job
            public SelectClause0 getOnJoin() {
                return completableDeferred.getOnJoin();
            }

            @Override // kotlinx.coroutines.Job
            public Job getParent() {
                return completableDeferred.getParent();
            }

            @Override // kotlinx.coroutines.Job
            public DisposableHandle invokeOnCompletion(Function1<? super Throwable, Unit> function1) {
                return completableDeferred.invokeOnCompletion(function1);
            }

            @Override // kotlinx.coroutines.Job
            public DisposableHandle invokeOnCompletion(boolean z2, boolean z3, Function1<? super Throwable, Unit> function1) {
                return completableDeferred.invokeOnCompletion(z2, z3, function1);
            }

            @Override // kotlinx.coroutines.Job
            public boolean isActive() {
                return completableDeferred.isActive();
            }

            @Override // kotlinx.coroutines.Job
            public boolean isCancelled() {
                return completableDeferred.isCancelled();
            }

            @Override // kotlinx.coroutines.Job
            public boolean isCompleted() {
                return completableDeferred.isCompleted();
            }

            @Override // kotlinx.coroutines.Job
            public Object join(Continuation<? super Unit> continuation) {
                return completableDeferred.join(continuation);
            }

            @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
                return completableDeferred.minusKey(key);
            }

            @Override // kotlin.coroutines.CoroutineContext
            public CoroutineContext plus(CoroutineContext coroutineContext) {
                return completableDeferred.plus(coroutineContext);
            }

            @Override // kotlinx.coroutines.Job
            @Deprecated(level = DeprecationLevel.ERROR, message = "\u0012V\u0001Gr\t$i\u0018\u000erA\u0010$:\u000epc\u0018fnw\u000e\u0012\u0006HxoQ\t7&q_$OR]vBT%??%i\u001a9\fgJznQs\u0013KJ#V*\fH\u000b\u0001\u0011/:+Y\u0012\u0001u6G\u0001T\u0015L\u007fOBg2aszSfn;)\taEO9\u0004/a\u001eN_Q//CIf\u000f&8\u0001Aeo\u000b4+aHG\u0003.n8W\u0003\u0014\u0012Ci\u0004,W%\u0017}'':B\fV<\u000bS]=\u0003m0\\hg6 .w\u0012*\u0018xh\u000el\n{o\u000e.LvU\u001a]-2 Y?\u0011\u0001;WNaoS%nY%\u000f{\"Em1S:&\u0002")
            @InterfaceC1492Gx
            public Job plus(Job job) {
                return completableDeferred.plus(job);
            }

            @Override // kotlinx.coroutines.Job
            public boolean start() {
                return completableDeferred.start();
            }
        };
    }

    public static final void asDeferredImpl$lambda$1(CompletableDeferred completableDeferred, Task task) {
        Exception exception = task.getException();
        if (exception != null) {
            completableDeferred.completeExceptionally(exception);
        } else if (task.isCanceled()) {
            Job.DefaultImpls.cancel$default((Job) completableDeferred, (CancellationException) null, 1, (Object) null);
        } else {
            completableDeferred.complete(task.getResult());
        }
    }

    public static final Unit asDeferredImpl$lambda$2(CancellationTokenSource cancellationTokenSource, Throwable th) {
        cancellationTokenSource.cancel();
        return Unit.INSTANCE;
    }

    public static final <T> Task<T> asTask(final Deferred<? extends T> deferred) {
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        deferred.invokeOnCompletion(new Function1() { // from class: kotlinx.coroutines.tasks.TasksKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TasksKt.asTask$lambda$0(cancellationTokenSource, deferred, taskCompletionSource, (Throwable) obj);
            }
        });
        return taskCompletionSource.getTask();
    }

    public static final Unit asTask$lambda$0(CancellationTokenSource cancellationTokenSource, Deferred deferred, TaskCompletionSource taskCompletionSource, Throwable th) {
        if (th instanceof CancellationException) {
            cancellationTokenSource.cancel();
            return Unit.INSTANCE;
        }
        Throwable completionExceptionOrNull = deferred.getCompletionExceptionOrNull();
        if (completionExceptionOrNull == null) {
            taskCompletionSource.setResult(deferred.getCompleted());
        } else {
            RuntimeExecutionException runtimeExecutionException = completionExceptionOrNull instanceof Exception ? (Exception) completionExceptionOrNull : null;
            if (runtimeExecutionException == null) {
                runtimeExecutionException = new RuntimeExecutionException(completionExceptionOrNull);
            }
            taskCompletionSource.setException(runtimeExecutionException);
        }
        return Unit.INSTANCE;
    }

    public static final <T> Object await(Task<T> task, CancellationTokenSource cancellationTokenSource, Continuation<? super T> continuation) {
        return awaitImpl(task, cancellationTokenSource, continuation);
    }

    public static final <T> Object await(Task<T> task, Continuation<? super T> continuation) {
        return awaitImpl(task, null, continuation);
    }

    public static final <T> Object awaitImpl(Task<T> task, final CancellationTokenSource cancellationTokenSource, Continuation<? super T> continuation) throws Exception {
        if (task.isComplete()) {
            Exception exception = task.getException();
            if (exception != null) {
                throw exception;
            }
            if (task.isCanceled()) {
                throw new CancellationException("Task " + task + " was cancelled normally.");
            }
            return task.getResult();
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        task.addOnCompleteListener(DirectExecutor.INSTANCE, new OnCompleteListener() { // from class: kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task<T> task2) {
                Exception exception2 = task2.getException();
                if (exception2 != null) {
                    Continuation continuation2 = cancellableContinuationImpl2;
                    Result.Companion companion = Result.Companion;
                    continuation2.resumeWith(Result.m8980constructorimpl(ResultKt.createFailure(exception2)));
                } else {
                    if (task2.isCanceled()) {
                        CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuationImpl2, null, 1, null);
                        return;
                    }
                    Continuation continuation3 = cancellableContinuationImpl2;
                    Result.Companion companion2 = Result.Companion;
                    continuation3.resumeWith(Result.m8980constructorimpl(task2.getResult()));
                }
            }
        });
        if (cancellationTokenSource != null) {
            cancellableContinuationImpl2.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    cancellationTokenSource.cancel();
                }
            });
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
