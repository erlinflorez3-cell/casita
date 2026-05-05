package kotlinx.coroutines;

import com.dynatrace.android.agent.Global;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яd\u001d<K!&˛\bDZc|\u0004W\u00068\u000bDB\u0007\"B\u0012\u007fјnjO0L͜P.`\\2\u000fq\u0007<$i$yCAW\"}0\nWNmgvJh\u0017K\u000f\f\u0016\u0001j:կ]xc\u0012\u00172XoG3SuE9vt>\u0005&2*8\u0010\u0005\t\u001a@H\u0018v\u0001CQ1(ؓht@ĥ\u001bL#܅B\u0006l 1\u001e\u000bh~<Xnm:u\"1krNUbp\u001a]\u0011TX?\r%f./N=M\u0015SZ\u0013\u000b`cW\u0003mxݘ\tj-09S<jDl\u0018\u0014C@\u007f\u0011k\t>\\;ĩ'\u001eˏ/Oqb\u0019$6\u0010\u0013{;Q4\u0012\u0014@`.[4\u0017\f\u001cN\rr\u0002G\u0017\u0014'H\u000e\u0017y6EBFEsI)\u0005iai.~=\n$% 9\u007f\u001dA\"VVw#<lw\u007fF\u0002JKjf\u0010i?}\u0004'ç0M˙4G\u000eFD!<;=7\nNS'y!`F}u3\u0001/e2eVe:nDLZ\r\u001a\u0001\\d3\u0006\u0017ӹг0\u0011SC\u001d\u0012\f0+ \u000b\u0015\u0003/ٚ\u0014NU\u001223[\b\"%]{W[tj\u001c\u0003ibA_ic>\u000e\u0003z\"lTbK\u0004\u0017ga:r}.!BJz\u0010>'TV\u001c\u0019BA\u0002\u001cjι_\u001bl\u0019X\u00054Ao\u001d7\u000f˖l\u0010\u0005\u0005տ(\u0003wUE\u001e\u000f[tp\u001el֑M8\u0005ʠ2/G]C&>W(vB\fs\u0019\r\u0004\u0018G\u0016Q}!C\u05ccwʀ\u007f$.\u001c?b=Lc!\r;J\u0002[L\u0003G<ˏOɟ+~\u0015{\u0015MvAԿ\f\u001d"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001c}%&Tk\fKT/Bc\u000e/;v\u0016\u0004", "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014\u0005Wz\u0019F\u00044\u000b", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", ">`a2a;\u001c]\"\u000ezq;", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "7mXAC(KS\"\u000e_h)", "", "/bc6i,", "\nh]6g\u0005", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0003?b\r J|k#B\u0007,", "1n]AX?M", "5dc\u0010b5MS,\u000e9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "u(E", "5dc\u0010b5MS,\u000e", "u(;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%\u0013c\u0007/7\u0001%\u0004", "1na<h;B\\\u0019\\\u0005g;|\u001c>", "5dc\u0010b9Hc(\u0003\u0004^\n\u0007\u0012>e\u00137", "7r00g0OS", "u(I", "=m2<`7ES(~y", "", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "=m2.a*>Z ~y", "1`d@X", "", "6`]1_,=", "1`]0X3EO(\u0003\u0005g\f\u0010\u0007/p\u000f,\u0006Ih\u0017%Uk\u0010<", "", "=m2<`7ES(\u0003\u0005g\u0010\u0006\u0018/r\t$\u0003", "AsPAX", "", "@dbB`,0W(\u0002", "@dbB_;", "\u001aj^A_0G\u001d\u0006~\tn3\f^", "/ec2e\u0019>a)\u0007z", "6`]1_,(\\v\t\u0003i3|\u00183o\t\b\u000f>\u0001\"&Ky\u0017", "3wR2c;B]\"", "6`]1_,(\\v\t\u0003i3|\u00183o\t\b\u000f>\u0001\"&Ky\u0017z|/D`\u0002)Jg\u00148ZMKz8'\u0015v[7\u0011p,", "<`\\2F;KW\"\u0001", "<`\\2F;KW\"\u00019d6\f\u00103n\u0013\"yJ\u000e!'Vs\u0017<\u0005\u001f3c\u000b ", "AsP?g", Global.BLANK, "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0013DU\u000b/\r", "@dR2\\=>`", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%#hy-FC|3IT75;\u001a\u001ej+#\u0004h,L\u0006|.RX;cV{\u0007\u0019#bWO;\u0016\u0003hE.wR\u0001\u007f\u00185G\u0011?r\nXkQ&", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public abstract class AbstractCoroutine<T> extends JobSupport implements Job, Continuation<T>, CoroutineScope {
    private final CoroutineContext context;

    public AbstractCoroutine(CoroutineContext coroutineContext, boolean z2, boolean z3) {
        super(z3);
        if (z2) {
            initParentJob((Job) coroutineContext.get(Job.Key));
        }
        this.context = coroutineContext.plus(this);
    }

    public static /* synthetic */ void getContext$annotations() {
    }

    protected void afterResume(Object obj) {
        afterCompletion(obj);
    }

    @Override // kotlinx.coroutines.JobSupport
    public String cancellationExceptionMessage() {
        return DebugStringsKt.getClassSimpleName(this) + " was cancelled";
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.context;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.context;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void handleOnCompletionException$kotlinx_coroutines_core(Throwable th) {
        CoroutineExceptionHandlerKt.handleCoroutineException(this.context, th);
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.JobSupport
    public String nameString$kotlinx_coroutines_core() {
        String coroutineName = CoroutineContextKt.getCoroutineName(this.context);
        return coroutineName == null ? super.nameString$kotlinx_coroutines_core() : "\"" + coroutineName + "\":" + super.nameString$kotlinx_coroutines_core();
    }

    protected void onCancelled(Throwable th, boolean z2) {
    }

    protected void onCompleted(T t2) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.JobSupport
    protected final void onCompletionInternal(Object obj) {
        if (!(obj instanceof CompletedExceptionally)) {
            onCompleted(obj);
        } else {
            CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj;
            onCancelled(completedExceptionally.cause, completedExceptionally.getHandled());
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Object objMakeCompletingOnce$kotlinx_coroutines_core = makeCompletingOnce$kotlinx_coroutines_core(CompletionStateKt.toState(obj));
        if (objMakeCompletingOnce$kotlinx_coroutines_core == JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            return;
        }
        afterResume(objMakeCompletingOnce$kotlinx_coroutines_core);
    }

    public final <R> void start(CoroutineStart coroutineStart, R r2, Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) {
        coroutineStart.invoke(function2, r2, this);
    }
}
