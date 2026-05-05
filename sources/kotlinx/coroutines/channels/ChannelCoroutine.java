package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.selects.SelectClause1;
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
@Metadata(bv = {}, d1 = {"Яd\u001d<K!&˛\bDZc|\u0004O\u00068\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?0LeV7ZS0\u0016s{B%c$\bCCU0}*\tUQog\u0005Jb\u000bY\u000f\u000e\u0016~j4Ikxe\u0012\u00155JoU3UoC?htL\u0005(2(9\u0002\u0005\u0017\u001a2H&v\u0003ŏQ\u001a(ؓhr@ĥ\u001bL5 \"\bN /\u001f\u000bg~<Xnm:u\"1k\u0003y7c>\u007fe\rtX7\u0017\u0005f61P9E\u0015[م1\tb_M\tWqk\fx+53as\u0006=ݼ\u0004\u0016\u001b4]\u0017&x4k\u001dQ\u000f\rm@\u0018sY_&(&\u0002,\u0013J\u0014&\b=G\\>`kP'A\u0004\u000bSnQ2jP\u0010\u0013iL\u0016S\u0013\u001c-O\u001aEcň?\u0019\\KD\u0013\u001b3;\u0001\u001d\"\fX\u001cp-\u001b\u0003\t\u0018E\u001aQK^f\n\bD\u001e\n~r\u001a,\u001a/u\u0011uɜ\u0010vC3Ns9Q\"\u001c#V\\\u007f\u0014\u0015sxd\u007fQvQ̱r =D\u0019\u0012`_t\u0007qVzh<\u0013]\u001c\u0003\b,!Yؕ[@I/A(T_jyj\u0004Ϊ8BuϠ8\"}y,o9\r:eUq/yR-ܝ\u0006גaMatbk\u000ep[^ίxʣiX~\nef\fIԵ\u0006ڻ[|9?;t\u001bX\u0005.Bwґ7\u0003!ӧOG]AH\u001bk:s?ɖ\u0017ʬ08v\u0007nD|\u000f#]E_T1&\fȨ/ث<k\u0014\r\u001a\u0018MwNWL#ֵ$xB¤\u0015bN_VU\u0019\u001f\u0001920.so#i_l*'1۠@ӏ:9Fu\r\u0003v<bzJ\u0006ܷE$Mܪtן\fj\bטyH\u0001Rq`[pLV\u000b\ti>^83þM [EȞ&\u0001M/I5+\"H\u001d==y]\u0018vd\u000e9ϟ)En\u0012U{\u0016\u001ei\bq\tֆ;\u001ab\rh:$\u001b\nx\\A̓\u000b\u0013\u0016B8KNQf\u0001Vnԇ9[T֜\n| ~\u0004sF#w\u000e:>a:sy͟B\u0002qQgߔV8~{yt\u0013Z\u0013\u001a\r\u00120%ܞJiVj.Ś\f\u0001\u001f\u0002GNSKd\u0015<?ӗD4L\u000e\u001bEdi<؋)1t\u0010eĶ5§wm"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7ts8ZMKz8'\u0015>", "\u0013", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001c}%&Tk\fKT/Bc\u000e/;v\u0016\u0004", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7tk", ">`a2a;\u001c]\"\u000ezq;", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "-bW.a5>Z", "7mXAC(KS\"\u000e_h)", "", "/bc6i,", "\nh]6g\u0005", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0003?b\r J|k\u0015SMJr8'(2_C\u0014m<]z0GZ\u0018*_N{F\u0014\u0019hW,.\t\u000ebA+D9,bx", "5dc,V/:\\\"~\u0002", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u0015\u001aCx\u0017<}3~7\u0001\u001c@v\u00165#", "1gP;a,E", "5dc\u0010[(G\\\u0019\u0006", "1`]0X3", "1`d@X", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158\u0006)?b]35m!=QMDA", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt\u0013Pm\u000eC}!D]\b)\u0017\u0001\u0014.XR?u=s", "uKY.i(\bc(\u0003\u0002(*\u0007\u0012-u\r5{I\u0010`tCx\f<},1h\u0002*@M),MNJo>'j,R", "1`]0X3\"\\(~\bg(\u0004", "1k^@X", "7me<^,(\\v\u0006\u0005l,", "6`]1_,K", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "7sT?T;H`", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7ty=MP7z>+j", "=eU2e", "3kT:X5M", ">n[9", "@dR2\\=>", "@dR2\\=>1\u0015\u000exa0\u0006\u000b", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7t\u0003.[SBz\n", "@dR2\\=>=&g\u000be3", "Ad]1", "Bqh\u001fX*>W*~", "Bqh X5=", "7r29b:>Ry\t\bK,z\t3v\u007f", "7r29b:>Ry\t\bL,\u0006\b", "7r4:c;R", "=mA2V,Bd\u0019", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0015t\u0012>[C\u0007A", "=mA2V,Bd\u0019\\vm*\u007f\r8g", "=mA2V,Bd\u0019h\bG<\u0004\u0010", "=mB2a+", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0015t\u0012>[C\bA", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00135b|}:i\u001f7MJ\u0011", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public class ChannelCoroutine<E> extends AbstractCoroutine<Unit> implements Channel<E> {
    private final Channel<E> _channel;

    public ChannelCoroutine(CoroutineContext coroutineContext, Channel<E> channel, boolean z2, boolean z3) {
        super(coroutineContext, z2, z3);
        this._channel = channel;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016O\n8v4e%*\u0015wF\u0010\u00175\\]^\"f\bw\u0019bwZwlW\u0001-z\u0002\f{Kad(OK0FC!d_9}5\b\f3\u000f\u0002*")
    @InterfaceC1492Gx
    public /* synthetic */ void cancel() {
        ChannelCoroutine<E> channelCoroutine = this;
        cancelInternal(new JobCancellationException(channelCoroutine.cancellationExceptionMessage(), null, channelCoroutine));
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            ChannelCoroutine<E> channelCoroutine = this;
            cancellationException = new JobCancellationException(channelCoroutine.cancellationExceptionMessage(), null, channelCoroutine);
        }
        cancelInternal(cancellationException);
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016O\n8v4e%*\u0015wF\u0010\u00175\\]^\"f\bw\u0019bwZwlW\u0001-z\u0002\f{Kad(OK0FC!d_9}5\b\f3\u000f\u0002*")
    @InterfaceC1492Gx
    public final /* synthetic */ boolean cancel(Throwable th) {
        ChannelCoroutine<E> channelCoroutine = this;
        cancelInternal(new JobCancellationException(channelCoroutine.cancellationExceptionMessage(), null, channelCoroutine));
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
        return this._channel.close(th);
    }

    public final Channel<E> getChannel() {
        return this;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<E> getOnReceive() {
        return this._channel.getOnReceive();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<ChannelResult<E>> getOnReceiveCatching() {
        return this._channel.getOnReceiveCatching();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<E> getOnReceiveOrNull() {
        return this._channel.getOnReceiveOrNull();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public SelectClause2<E, SendChannel<E>> getOnSend() {
        return this._channel.getOnSend();
    }

    protected final Channel<E> get_channel() {
        return this._channel;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: invokeOnClose */
    public void mo10566invokeOnClose(Function1<? super Throwable, Unit> function1) {
        this._channel.mo10566invokeOnClose(function1);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isClosedForReceive() {
        return this._channel.isClosedForReceive();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return this._channel.isClosedForSend();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
        return this._channel.isEmpty();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public ChannelIterator<E> iterator() {
        return this._channel.iterator();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0007K\fGvw\u0016k]Kg\u0004^T@Va\f\u000f(\u001bw!d6Ut*\u0015\t6\u007f[QrF\u0014\u001cu>Z&B>", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    @InterfaceC1492Gx
    public boolean offer(E e2) {
        return this._channel.offer(e2);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0007K\fGvw\u0016k]Kg\u0004^T@Va\f\u000f(\u001bw!d6Ut*\u0015\t6\u007fZQgGVrm\u007f\u0014]#F\u0017W_~afWOj}H\u001a\r[SX#{s\u0012\u0005\u001b\u0006@ P\u0002;o'\u0018\bI\u0013D\bF<<pW~@f[|\u000b454I$.\u0011*,J<Z\u0013.-CC,\u000eV)MJib\u000b4\u001ddL7.&sr^\u0010\u0014\u0010;++\u001cM[#I%1\rw\u0011\\\u00026T0.}q\u0004O\u001fr3\u001czi\u000fo%3vb\"\u0005t`O/L&[\u001e`-1 YFKU9M\fhkZ,;\u0014_\rveKtva\u0004'H\\C\"", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    @InterfaceC1492Gx
    public E poll() {
        return this._channel.poll();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public Object receive(Continuation<? super E> continuation) {
        return this._channel.receive(continuation);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: receiveCatching-JP2dKIU */
    public Object mo10491receiveCatchingJP2dKIU(Continuation<? super ChannelResult<? extends E>> continuation) {
        Object obj = this._channel.mo10491receiveCatchingJP2dKIU(continuation);
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return obj;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0007K\fGvw\u0016k]Kg\u0004^T2Or[\u001bf\u0014nK\u0019\tKqoW\u000b)Ii`gJVjo\u007f\u0014]#F\u0017W_~afWOj}H\u001a\r[SX#{s\u0012\u0005\u001b\u0006@ P\u0002;o'\u0018\bI\u0013D\bF<<pW~@f[|\u000b454I$.\u0011*,J<Z\u0013.-CC,\u000eV)MJib\u000b4\u001ddL7.&sr^\u0012\n\u00074m\u0002\u001d3iE\u001f+.Aw\u0001]\u0001B\u0004$8\r(\u0005Rd 2\u0011\u0003i\u0015v\u001d2(`g\u0005t\\Q!TkW-\u001a8+eFJ\u0011\u0001CMR'm\u000b4>\r4\u0011l\"|yvVt/JX#&W;\n+Ka,\u000e\u0005\u0019@\u0003SIhEM#)", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    @InterfaceC1492Gx
    public Object receiveOrNull(Continuation<? super E> continuation) {
        return this._channel.receiveOrNull(continuation);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public Object send(E e2, Continuation<? super Unit> continuation) {
        return this._channel.send(e2, continuation);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: tryReceive-PtdJZtk */
    public Object mo10492tryReceivePtdJZtk() {
        return this._channel.mo10492tryReceivePtdJZtk();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public Object mo10484trySendJP2dKIU(E e2) {
        return this._channel.mo10484trySendJP2dKIU(e2);
    }
}
