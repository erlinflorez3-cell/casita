package kotlinx.coroutines.channels;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
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
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&˛\bDRш|İI\u0006>\u00146B\u0005$4\u0012\u0006\u0007nj?1Le^.ZS0\u0010s{J$c$wECU(~*\tUNog\u0005Jb\u000bY\u000f\u000e\u0016~l2.kތ\u0006\u0016\u0015˰Pn]\u074c}ok9)\tD\u000b82P?*\t\u000f\"BHF͌AŶ\në\u00160Ny\u0003m\u001b[\u001d \"\bN /%\u000bv~:Vtu:e݊I\u000eŌR)e@\u000b^UXb9%v\u0010 [H=5#8k\u0005\u001dQ\nSIc:h\u0013}?'YP$xDn\u00181%>_\u001esqTpԇUj\u0012?;Uid`\u0010.}!\u000f\u001d>\u0014\u000e4.vEs>/\u001b\u001cM\rr\u0002B\u0001\u0006lJ\u0018z\u0018ا]:ő7+G67io<1Ne};1tŨ\u0003ͼ%ed\u0010f\u0018)X\u0010S7RNB\u0019p\u0018cU\u007f\u0014rr\u0002`ʶ@O\u00105\f\u0013>\u0017[ڛ\nݽQ,BɜJזkz\u001dbn_w_͛D>"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00135b|}:i\u001f7MJ\u0011", "\u0013", "", "7r29b:>Ry\t\bL,\u0006\b", "", "7r29b:>Ry\t\bL,\u0006\bma\t1\u0006O|&\u001bQx\u001c", "u(E", "u(I", "Ad]1", "", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxW:\u00012?i\r$@m$w+MDz8'%dp=\u0011l\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "=mB2a+", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0015t\u0012>[C\bA", "5dc\u001ca\u001a>\\\u0018", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ%\u0017No\fK\u0005n#Y\u0005 5|s5ISIk\u0001s", "Bqh X5=", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7t\u0003.[SBz\n", "Bqh X5=\u001b}iG]\u0012`x", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "1k^@X", "1`d@X", "", "7me<^,(\\v\u0006\u0005l,", "6`]1_,K", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "=eU2e", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public interface SendChannel<E> {

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        public static /* synthetic */ boolean close$default(SendChannel sendChannel, Throwable th, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i2 & 1) != 0) {
                th = null;
            }
            return sendChannel.close(th);
        }

        public static /* synthetic */ void isClosedForSend$annotations() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Deprecated(level = DeprecationLevel.ERROR, message = "\u0007K\fGvw\u0016k]Kg\u0004^T@Va\f\u000f(\u001bw!d6Ut*\u0015\t6\u007f[QrF\u0014\u001cu>Z&B>", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
        @InterfaceC1492Gx
        public static <E> boolean offer(SendChannel<? super E> sendChannel, E e2) throws Throwable {
            Object objMo10484trySendJP2dKIU = sendChannel.mo10484trySendJP2dKIU(e2);
            if (ChannelResult.m10509isSuccessimpl(objMo10484trySendJP2dKIU)) {
                return true;
            }
            Throwable thM10503exceptionOrNullimpl = ChannelResult.m10503exceptionOrNullimpl(objMo10484trySendJP2dKIU);
            if (thM10503exceptionOrNullimpl == null) {
                return false;
            }
            throw StackTraceRecoveryKt.recoverStackTrace(thM10503exceptionOrNullimpl);
        }
    }

    boolean close(Throwable th);

    SelectClause2<E, SendChannel<E>> getOnSend();

    /* JADX INFO: renamed from: invokeOnClose */
    void mo10566invokeOnClose(Function1<? super Throwable, Unit> function1);

    boolean isClosedForSend();

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0007K\fGvw\u0016k]Kg\u0004^T@Va\f\u000f(\u001bw!d6Ut*\u0015\t6\u007f[QrF\u0014\u001cu>Z&B>", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    @InterfaceC1492Gx
    boolean offer(E e2);

    Object send(E e2, Continuation<? super Unit> continuation);

    /* JADX INFO: renamed from: trySend-JP2dKIU */
    Object mo10484trySendJP2dKIU(E e2);
}
