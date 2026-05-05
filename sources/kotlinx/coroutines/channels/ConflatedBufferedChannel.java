package kotlinx.coroutines.channels;

import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectInstance;
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
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&˛\bDZc|İI\u0006>\u00116Ȑ\u0007\"B\u0012\u007fјnjO0Le^.ZS8\u000fs{:%c$\u007fLCU \u0003*\teNogtRb\u000bY\u000f\u000e\u0016\u0007̓4I[yc %˰jqE\u074c[nm?pvF\u0005f1P8:>\u0011\u001e8I(v)E[\u0010 3XphV\u001dm\u000b\u001a \u000bV:\u0011 lg\u0005ȤXnm:]+\u0019hpU\u0010g@~]\r|Ö=\fUgӿ/B=>#/\u001c\u0017\u0015`s?1G\"A\u0013w?'aɞ:ɥtݼ\u0004\u0014#;\u0018#k\u0004>\\3]\u0011\u00105:gc\u0002ִTߛ6ߡ\u007f\u000fB\u0016\u001c\u0016oc<@2l\u0018\u0010Ct![nd2bP\u000f\u0013alЍk\u0014Ĵ/;!{_w\u0004<\\N\u0014\u000b\u001d 3\u0001\u001d)\nh>d#*lw\bĸ\u0002DK`f\n\bI4\u0004Ͳf\u00040\u001d>aHR\n,F\u001d59k9Q)\u001a\u0016xHu\u0006\u001d`\u001fׅ\u001aVVX:nDCp\tɔ^Fj!yj\u001dt:.e\u001c\u0003\u000f.\u0010!>t{L!+\u0011|n\u0019ox\\u\f;.\u0015W \u00014\u0019eZv3c]*\u001eуVv\u001aa\rn\u0013Y~B\u0002\u000e1٥*ϒ6HrݘH\bRQ$\u0013`CHʌ6Ϝ5\u0019dé\u0019\u0015,MY|7k\u0011;fьVտ(\u0007\u0002&z\u0014\u000f]ʽt\u0013"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0003?b~'3|\u0016-*S<l4+\u0015g?<\u0003l5N}|", "\u0013", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0002EZ~ Dm\u0015\fP?Dt4%j", "1`_.V0Mg", "", "=m1BY->`\u0003\u0010zk-\u0004\u0013A", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0002EZ~ DW'.ZDBuFs", "=mD;W,EW*~\b^+\\\u0010/m\u007f1\u000b", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u000f>I\u0007\u001f7t\u001a?MP;j\u0014%\u0015paB\u00169", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\nh]6g\u0005", "uH;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u0015\u001aCx\u0017<}3~6\u000e!8m#\u0018^CHl;('>H?\u0011r3R\u007fpL]Vu]b{;#\u0016d\u0017\\tm\u0015b?3rN@j]o:", "7r2<a-EO(~y=9\u0007\u0014\u0019l~(\nO", "", "u(I", "Ad]1", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxW:\u00012?i\r$@m$w+MDz8'%dp=\u0011l\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "Ad]159HO\u0018|vl;", "Ad]159HO\u0018|vl;;\u000f9t\u0007,\u0005Sz\u0015!Ty\u001eKz.5gw\u001eAz\u0016", "Bqh X5=", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7t\u0003.[SBz\n", "Bqh X5=\u001b}iG]\u0012`x", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "Bqh X5=7!\n\u0002", "7rB2a+(^", "Bqh X5=7!\n\u0002&\u0014\u0002S\u0018BQ\u0010", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}p\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", "Bqh X5=2&\t\u0006E(\f\t=t", "Bqh X5=2&\t\u0006E(\f\t=tG\u0010\u0001\u000bish/", "@dV6f;>`\u0007~\u0002^*\fi9rm(\u0005?", "Ad[2V;", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u001bv$=IL9k\n", "", "Ag^B_+,S\"}hn:\b\t8d", "Ag^B_+,S\"}hn:\b\t8d>.\u0006O\b\u001b Zi\fF\u0004/Eh\u0002)7{\u0010,WP;", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public class ConflatedBufferedChannel<E> extends BufferedChannel<E> {
    private final int capacity;
    private final BufferOverflow onBufferOverflow;

    public ConflatedBufferedChannel(int i2, BufferOverflow bufferOverflow, Function1<? super E, Unit> function1) {
        super(i2, function1);
        this.capacity = i2;
        this.onBufferOverflow = bufferOverflow;
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + Reflection.getOrCreateKotlinClass(BufferedChannel.class).getSimpleName() + " instead").toString());
        }
        if (i2 < 1) {
            throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i2 + " was specified").toString());
        }
    }

    public /* synthetic */ ConflatedBufferedChannel(int i2, BufferOverflow bufferOverflow, Function1 function1, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, bufferOverflow, (i3 + 4) - (i3 | 4) != 0 ? null : function1);
    }

    static /* synthetic */ <E> Object send$suspendImpl(ConflatedBufferedChannel<E> conflatedBufferedChannel, E e2, Continuation<? super Unit> continuation) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
        Object objM10518trySendImplMj0NB7M = conflatedBufferedChannel.m10518trySendImplMj0NB7M(e2, true);
        if (!(objM10518trySendImplMj0NB7M instanceof ChannelResult.Closed)) {
            return Unit.INSTANCE;
        }
        ChannelResult.m10503exceptionOrNullimpl(objM10518trySendImplMj0NB7M);
        Function1<E, Unit> function1 = conflatedBufferedChannel.onUndeliveredElement;
        if (function1 == null || (undeliveredElementExceptionCallUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function1, e2, null, 2, null)) == null) {
            throw conflatedBufferedChannel.getSendException();
        }
        ExceptionsKt.addSuppressed(undeliveredElementExceptionCallUndeliveredElementCatchingException$default, conflatedBufferedChannel.getSendException());
        throw undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
    }

    static /* synthetic */ <E> Object sendBroadcast$suspendImpl(ConflatedBufferedChannel<E> conflatedBufferedChannel, E e2, Continuation<? super Boolean> continuation) {
        Object objM10518trySendImplMj0NB7M = conflatedBufferedChannel.m10518trySendImplMj0NB7M(e2, true);
        if (objM10518trySendImplMj0NB7M instanceof ChannelResult.Failed) {
            return Boxing.boxBoolean(false);
        }
        return Boxing.boxBoolean(true);
    }

    /* JADX INFO: renamed from: trySendDropLatest-Mj0NB7M, reason: not valid java name */
    private final Object m10517trySendDropLatestMj0NB7M(E e2, boolean z2) {
        Function1<E, Unit> function1;
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
        Object objMo10484trySendJP2dKIU = super.mo10484trySendJP2dKIU(e2);
        if (ChannelResult.m10509isSuccessimpl(objMo10484trySendJP2dKIU) || ChannelResult.m10507isClosedimpl(objMo10484trySendJP2dKIU)) {
            return objMo10484trySendJP2dKIU;
        }
        if (!z2 || (function1 = this.onUndeliveredElement) == null || (undeliveredElementExceptionCallUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function1, e2, null, 2, null)) == null) {
            return ChannelResult.Companion.m10514successJP2dKIU(Unit.INSTANCE);
        }
        throw undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
    }

    /* JADX INFO: renamed from: trySendImpl-Mj0NB7M, reason: not valid java name */
    private final Object m10518trySendImplMj0NB7M(E e2, boolean z2) {
        return this.onBufferOverflow == BufferOverflow.DROP_LATEST ? m10517trySendDropLatestMj0NB7M(e2, z2) : m10493trySendDropOldestJP2dKIU(e2);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    protected boolean isConflatedDropOldest() {
        return this.onBufferOverflow == BufferOverflow.DROP_OLDEST;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.BufferedChannel
    protected void registerSelectForSend(SelectInstance<?> selectInstance, Object obj) {
        Object objMo10484trySendJP2dKIU = mo10484trySendJP2dKIU(obj);
        if (!(objMo10484trySendJP2dKIU instanceof ChannelResult.Failed)) {
            selectInstance.selectInRegistrationPhase(Unit.INSTANCE);
        } else {
            if (!(objMo10484trySendJP2dKIU instanceof ChannelResult.Closed)) {
                throw new IllegalStateException("unreachable".toString());
            }
            ChannelResult.m10503exceptionOrNullimpl(objMo10484trySendJP2dKIU);
            selectInstance.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public Object send(E e2, Continuation<? super Unit> continuation) {
        return send$suspendImpl((ConflatedBufferedChannel) this, (Object) e2, continuation);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public Object sendBroadcast$kotlinx_coroutines_core(E e2, Continuation<? super Boolean> continuation) {
        return sendBroadcast$suspendImpl((ConflatedBufferedChannel) this, (Object) e2, continuation);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean shouldSendSuspend$kotlinx_coroutines_core() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public Object mo10484trySendJP2dKIU(E e2) {
        return m10518trySendImplMj0NB7M(e2, false);
    }
}
