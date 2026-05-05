package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
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
@Deprecated(level = DeprecationLevel.ERROR, message = "\u0006U\n;}u)\\\\):\nQ\u0019/Oo`k/\u0006v\u001aW\u0003\u0006w}\u000ex)vzQgCaalxO,rN\u001a[\f\u007f#nWPw}C\u0018K:\u001cE-{8g~\u001b\u0007v\u001dY\u0002;f5G\nWOK\nO5-C\u0013\u0003Pc,}\u000e4z&")
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯV\u001d<K!&˛\bDZc|İI\u0006F\u000b6B\u0005*4\u0012\u0006\u0010nʑA0RfP.`S2\u000f\u0002{<$q$yCAV\"}8\tWN}gvJ`\rK\u000f\u001c\u0016\u0001j2I]xs\u0012\u00172HoG3coE9vt>ӌ&78\u0600\"\u0007\u0007ɝ8G@|\u000bE[\fX/npzg\u0013M\u0015$ \u0007V&\u0011 lg\u0005ȤvnҺ>1)\u0006wF\u000f.eDƊQ\u000fLW5\u00127p$?P;C\u001b=S9ޗқ_A\tB\u007fDMy53CI\"df^\u000e\"--e\f\f\u0002lذ\u0004\u001aw\u001a3CO\u0012[\u0001\u001a6\u0006\u0013\u0004#;2 n)^-\f+-ڳ\r{\u0006\u0001fXP0kr\u0006\toN\u0019;~a:\u007fӬe\u001a\u000eI-f7*\u0015=?1\u0016\u0007>kg\u001eq+\u001a\u0003\u0007Φ5[FTXT\u0010qMo\nv\t\u0010:\u0006@G.?*'tϦ$\u007fjG<9k0Utk\u0005\u001fxh\n֟\u0019͊?j{$RB\u000f\u001c\\Td;ߘ~p\u001f£\u0010\u0016+b$\u0016\bA0\r{J;=\u0010\u0005и/Ƞ*\u0016r\u0018CGlG[~k<gg}c9_}(a\tΘZ͊;3\u0017fgZY\u001c\\l(XõvlfǱ}ΌR\f\u001bԵ\u0010\u0001*:D1O¢K\rҴ\"FY~\u000fghq`\u0010b=<\u0005\u007f#+է7\u0015ʷts\u007fzO7\u000bir6OqM\u0019TbX|\u000bĂ&W\u0018\u0002!_y\\I\\lL߯e\u00040\u001c*;a/sП=\"WTXΦHʌv\n"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0003?b~'3|\u0016-*PEg3\u001c\u0011vp\u0017\n_5Wv.\u001d", "\u0013", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0002Bcy\u001f5i$=+F7t=\u001e\u001c>", "0q^.W*:a(", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0002Bcy\u001f5i$=+F7t=\u001e\u001cLiD\u000e9", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n~\u001a\u0013Px\u000eC\u0005n\u0012f\b\u001c6k\u0012<\\!>g='\u0015oEA\u0012j\u0002\u0012g", "u(E", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "5dc#T3NS", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "D`[BX\u0016K<)\u0006\u0002", "5dc#T3NS\u0003\fcn3\u0004", "1`]0X3", "", "1`d@X", "", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158\u0006)?b]35m!=QMDA", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt\u0013Pm\u000eC}!D]\b)\u0017\u0001\u0014.XR?u=s", "1k^@X", "7me<^,(\\v\u0006\u0005l,", "6`]1_,K", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "=eU2e", "3kT:X5M", "=oT;F<;a\u0017\f~i;\u0001\u00138", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00125W}$Hms1ILDk;s", "Ad]1", "Bqh X5=", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7t\u0003.[SBz\n", "7r29b:>Ry\t\bL,\u0006\b", "=mB2a+", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0015t\u0012>[C\bA", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00135b|}:i\u001f7MJ\u0011", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ConflatedBroadcastChannel<E> implements BroadcastChannel<E> {
    private final BroadcastChannelImpl<E> broadcast;

    public ConflatedBroadcastChannel() {
        this(new BroadcastChannelImpl(-1));
    }

    public ConflatedBroadcastChannel(E e2) {
        this();
        mo10484trySendJP2dKIU(e2);
    }

    private ConflatedBroadcastChannel(BroadcastChannelImpl<E> broadcastChannelImpl) {
        this.broadcast = broadcastChannelImpl;
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public void cancel(CancellationException cancellationException) {
        this.broadcast.cancel(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0005O\n6\u0004\u000eTZgT8{d\u001e.WhU\u001d@Dw\u001a^\u0010")
    @InterfaceC1492Gx
    public /* synthetic */ boolean cancel(Throwable th) {
        return this.broadcast.cancel(th);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable th) {
        return this.broadcast.close(th);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public SelectClause2<E, SendChannel<E>> getOnSend() {
        return this.broadcast.getOnSend();
    }

    public final E getValue() {
        return this.broadcast.getValue();
    }

    public final E getValueOrNull() {
        return this.broadcast.getValueOrNull();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: invokeOnClose */
    public void mo10566invokeOnClose(Function1<? super Throwable, Unit> function1) {
        this.broadcast.mo10566invokeOnClose(function1);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return this.broadcast.isClosedForSend();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0007K\fGvw\u0016k]Kg\u0004^T@Va\f\u000f(\u001bw!d6Ut*\u0015\t6\u007f[QrF\u0014\u001cu>Z&B>", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    @InterfaceC1492Gx
    public boolean offer(E e2) {
        return this.broadcast.offer(e2);
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public ReceiveChannel<E> openSubscription() {
        return this.broadcast.openSubscription();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public Object send(E e2, Continuation<? super Unit> continuation) {
        return this.broadcast.send(e2, continuation);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public Object mo10484trySendJP2dKIU(E e2) {
        return this.broadcast.mo10484trySendJP2dKIU(e2);
    }
}
