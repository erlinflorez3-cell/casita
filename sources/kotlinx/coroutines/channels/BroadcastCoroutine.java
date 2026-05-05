package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.selects.SelectClause2;
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
@Metadata(bv = {}, d1 = {"Яd\u001d<K!&˛\bDZc|\u0004O\u00068\u000bDB\u0007\"B\u0012\u007fјnjO0LeN.ZS8\u0018s{:)c$\bCCU \u007f*\t]Oog\u0005Jb\u000bY\u000f\u000e\u0016~r4Ikxe\u0012%2JoE5UoS9ht<\u0005(288\u0002\u0005\u0007\u001a2H&v\u0003ŏQ\u001c(ؓhr@ĥ\u001bL5 \"\bN /\u001f\u000bg~<Xnm:u\"1krT7a@|\u0014\ftWg0\u0007e,/X7c\u001a5]\u0011\rjaO\u0005Oqsݛ\u0017*7/Wzo6\u0007\bЏ\u0019-U\u0016k|nl\u0013dx\fU3\u007fiYd&*\u000ey*\"\u0003\tV\u001f5[F-Hg8\u001aA\t\u000b[VO0u+\u0002\u0011`\u0015-Ӿ\u000439Qct_zS\u0019|8,\t\u001b2;\u0001\u001d6\"hVs#5lw\u007f2\u0002DKcf\n\b>4\u0016Ͳf\u00028 x]\u000eL\u0014\u0011\\\u0018U;iM;!\u001a\u0017xHu\u0015\u001d`\u0017[0d\u0011P0\u000e.7X\u0011<`Rx\u001dmfS\u0007AWad\u0001\u0015\u001e \u0013N](]/F(k_{y{c\\8:çjA_\u0012{\u0014]]n5;W\n$qT\u0007\u0014m=\u0011'\u001fٿA\u001c\u001bh\u0002@\"`P\u001b\u0014\u0006\"\\NBƎxƅpdA:X1b%J\u0013\u001exˆ+1&ˊgX\u000eb\\<\u0003\u0018%%\r\u000fvtp&Ο?̹kEu0WYWE\u001b6UPib(S\u000b\r\u001a\u0018G\u001eն\u000eƙkf\u000ec\u00028\u001c*;a/sП=\u0002\u007fɊ\u0004βIRzόiO\u00182\t\tJ!IuFg6r'\u00017ʛLׅX\u001b:xd\u007f1\u00165\u0018\bp^\u0001Wed\u000b\u0012Ŭw\u00039.\u0013ҕ:٫\t#6'\u0007\u00010\u000f\u00066QS5\u0016&\u001ce)8Ӹl@G\b\u0010'8\u0005g\u0014,\u001aܞ\u007fjacB=HI\u0010˚l2R\u001bY݀Kܜ{7"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0002Bcy\u001f5i$=+MHuD-\u0019qa\u000f", "\u0013", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001c}%&Tk\fKT/Bc\u000e/;v\u0016\u0004", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0010Bc|05m#\u001cKMFk\n", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0002Bcy\u001f5i$=+F7t=\u001e\u001c>", ">`a2a;\u001c]\"\u000ezq;", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "-bW.a5>Z", "/bc6i,", "", "\nh]6g\u0005", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0003?b\r J|k\u0015SMJr8'(2_C\u0014m<]z0GZ\u0018*_N{F\u0014\u0019hW+8\u0017\u0001X? |S\u0015\"\u00045R\u0002B>uO\u0007", "5dc,V/:\\\"~\u0002", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u0015\u001aCx\u0017<}3~6\u000b*3l\u0014*[R\u0019n0'\u001ehh\u000f", "7r00g0OS", "u(I", "1gP;a,E", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00135b|}:i\u001f7MJ\u0011", "5dc\u0010[(G\\\u0019\u0006", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u0015\u001aCx\u0017<}3~G})6K\u0019*VL;r\n", "1`]0X3", "1`d@X", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158\u0006)?b]35m!=QMDA", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt\u0013Pm\u000eC}!D]\b)\u0017\u0001\u0014.XR?u=s", "uKY.i(\bc(\u0003\u0002(*\u0007\u0012-u\r5{I\u0010`tCx\f<},1h\u0002*@M),MNJo>'j,R", "1`]0X3\"\\(~\bg(\u0004", "=m2<`7ES(~y", "D`[BX", "uKZ<g3B\\bn\u0004b;RL ", "=m2.a*>Z ~y", "6`]1_,=", "1k^@X", "7me<^,(\\v\u0006\u0005l,", "6`]1_,K", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "=eU2e", "3kT:X5M", "=oT;F<;a\u0017\f~i;\u0001\u00138", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00125W}$Hms1ILDk;s", "Ad]1", "Bqh X5=", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7t\u0003.[SBz\n", "7r29b:>Ry\t\bL,\u0006\b", "=mB2a+", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0015t\u0012>[C\bA", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
class BroadcastCoroutine<E> extends AbstractCoroutine<Unit> implements ProducerScope<E>, BroadcastChannel<E> {
    private final BroadcastChannel<E> _channel;

    public BroadcastCoroutine(CoroutineContext coroutineContext, BroadcastChannel<E> broadcastChannel, boolean z2) {
        super(coroutineContext, false, z2);
        this._channel = broadcastChannel;
        initParentJob((Job) coroutineContext.get(Job.Key));
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            BroadcastCoroutine<E> broadcastCoroutine = this;
            cancellationException = new JobCancellationException(broadcastCoroutine.cancellationExceptionMessage(), null, broadcastCoroutine);
        }
        cancelInternal(cancellationException);
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016O\n8v4e%*\u0015wF\u0010\u00175\\]^\"f\bw\u0019bwZwlW\u0001-z\u0002\f{Kad(OK0FC!d_9}5\b\f3\u000f\u0002*")
    @InterfaceC1492Gx
    public final /* synthetic */ boolean cancel(Throwable th) {
        if (th == null) {
            BroadcastCoroutine<E> broadcastCoroutine = this;
            th = new JobCancellationException(broadcastCoroutine.cancellationExceptionMessage(), null, broadcastCoroutine);
        }
        cancelInternal(th);
        return true;
    }

    @Override // kotlinx.coroutines.JobSupport
    public void cancelInternal(Throwable th) {
        CancellationException cancellationException$default = JobSupport.toCancellationException$default(this, th, null, 1, null);
        this._channel.cancel(cancellationException$default);
        cancelCoroutine(cancellationException$default);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable th) {
        boolean zClose = this._channel.close(th);
        start();
        return zClose;
    }

    @Override // kotlinx.coroutines.channels.ProducerScope
    public SendChannel<E> getChannel() {
        return this;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public SelectClause2<E, SendChannel<E>> getOnSend() {
        return this._channel.getOnSend();
    }

    protected final BroadcastChannel<E> get_channel() {
        return this._channel;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: invokeOnClose */
    public void mo10566invokeOnClose(Function1<? super Throwable, Unit> function1) {
        this._channel.mo10566invokeOnClose(function1);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine, kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return this._channel.isClosedForSend();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0007K\fGvw\u0016k]Kg\u0004^T@Va\f\u000f(\u001bw!d6Ut*\u0015\t6\u007f[QrF\u0014\u001cu>Z&B>", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    @InterfaceC1492Gx
    public boolean offer(E e2) {
        return this._channel.offer(e2);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    protected void onCancelled(Throwable th, boolean z2) {
        if (this._channel.close(th) || z2) {
            return;
        }
        CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCompleted(Unit unit) {
        SendChannel.DefaultImpls.close$default(this._channel, null, 1, null);
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public ReceiveChannel<E> openSubscription() {
        return this._channel.openSubscription();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public Object send(E e2, Continuation<? super Unit> continuation) {
        return this._channel.send(e2, continuation);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public Object mo10484trySendJP2dKIU(E e2) {
        return this._channel.mo10484trySendJP2dKIU(e2);
    }
}
