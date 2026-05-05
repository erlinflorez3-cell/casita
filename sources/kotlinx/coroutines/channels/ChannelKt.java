package kotlinx.coroutines.channels;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.ChannelResult;
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
@Metadata(bv = {}, d1 = {"Я:\u001d<;!&i\u0016DLш|\u0004W\u00068\u000b<C\u0007\"B\u0012\u007f\u0007loA0ReP.XV2\u000f\u0002{<$a$yCI[\"Ԃ*\teNogtJr[QƤ\u001e\u0016?iLK[ތk\u001178RqO3\u0014nk9\u0011\u0016D\u00068O2K\n\u0016\u0017\u0019XKǘz\u0005IO\u001c\u00186E\u0001<X\u0013s\u000b*\u0014\u0016>f\u007fL^.\u07b5<ԢleB5)\u0002yB\\&}ܞƊQ\u000fL[5\u0015\u000f6,4X=E\u00175SI\u0006\u0001[_\u0005EмK\u0004\u0011-7-Ys\u001e5\u0007\u007fD49Y%x\u00037l\u0014\u0018_В+5Ug[V\u0014-\b|\u0002\u0013b\u000f\u001e\b7H\\9HhNԋ9ςr[HV\b]R\u007f\t`TЍӾ\u000451F)ni8I\u001af=\f\u0007\u001d\u001ei\u007f\u001d!{V\u0014֫#\u001a|}a3a@\u0004G|\n\n^{\u000e\t\u007f\u0012=\u0014A]~]~ 2!+;k?)&{\u0004NJ\u000e|\u0015bxS\u0018^vBhÉ\u001cն*\u0011\u0014`Jc\u0015k^Sv\u008cҭQ\u001eZ\u0015\f\u0010+vj\u0007T'5\u0012^O/h\u0019M}\f+Ät6\u0002t{\u0010g9%2cQ\u00141o\\\u000f1OOr\u0016nepV۱^f.&BNp\u0015\b}JT2\u0019BA\u0002\u001cb8_\u001b#ðNҔ\u001eJI\u0003\u000f^jh\u001e}r՜ʗ\u0007k*\u0005\u0017\th\u0019~\u0001\u007f~Y.\r`h@ocU\u001b,Ş0{d\u0003)\u0007\r\b\u0018G\u0016awRr\u0016\u0004k\u0014 D1ie5=!'\u00177B\u0004=E\u0013\u0006uS]\u0012U\u0007\u0013x==\u0001Ju\u0019\u0003v<bzJ\u0016gE4\u0017`xּ\u0016w0\u007fgF\t[{T9p\u0005NΨ\u0007r"}, d2 = {"5dc\u001ce\fEa\u0019", "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7t\u0003.[SBz\n", "=m5.\\3N`\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "3wR2c;B]\"", "5dc\u001ce\fEa\u0019Fli\u000e\tu80", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010/\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "=mBBV*>a'", "/bc6b5", "D`[BX", "", "=mBBV*>a'Fli\u000e\tu80", "=m5.\\3N`\u0019Fli\u000e\tu80", "=m29b:>R", "=m29b:>R`p\u0006@8i\u0012y", "\u0011gP;a,E", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7tk", "\u0013", "1`_.V0Mg", "", "=m1BY->`\u0003\u0010zk-\u0004\u0013A", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0002EZ~ DW'.ZDBuFs", "=mD;W,EW*~\b^+\\\u0010/m\u007f1\u000b", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ChannelKt {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016O\n8v4e%,\u0015wF\u0010\u00175\\]^\"f\bw\u0019bwZwlW\u0001-z\u0002\f{Kad(>G0?C\u0017h\f\u0010'j[DtLG")
    @InterfaceC1492Gx
    public static final /* synthetic */ Channel Channel(int i2) {
        return Channel$default(i2, null, null, 6, null);
    }

    public static final <E> Channel<E> Channel(int i2, BufferOverflow bufferOverflow, Function1<? super E, Unit> function1) {
        if (i2 == -2) {
            return bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel<>(Channel.Factory.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core(), function1) : new ConflatedBufferedChannel(1, bufferOverflow, function1);
        }
        if (i2 == -1) {
            if (bufferOverflow == BufferOverflow.SUSPEND) {
                return new ConflatedBufferedChannel(1, BufferOverflow.DROP_OLDEST, function1);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (i2 == 0) {
            return bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel<>(0, function1) : new ConflatedBufferedChannel(1, bufferOverflow, function1);
        }
        if (i2 != Integer.MAX_VALUE) {
            return bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel<>(i2, function1) : new ConflatedBufferedChannel(i2, bufferOverflow, function1);
        }
        return new BufferedChannel(Integer.MAX_VALUE, function1);
    }

    public static /* synthetic */ Channel Channel$default(int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return Channel(i2);
    }

    public static /* synthetic */ Channel Channel$default(int i2, BufferOverflow bufferOverflow, Function1 function1, int i3, Object obj) {
        if ((i3 + 1) - (1 | i3) != 0) {
            i2 = 0;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            function1 = null;
        }
        return Channel(i2, bufferOverflow, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOrElse-WpGqRn0 */
    public static final <T> T m10495getOrElseWpGqRn0(Object obj, Function1<? super Throwable, ? extends T> function1) {
        return obj instanceof ChannelResult.Failed ? function1.invoke(ChannelResult.m10503exceptionOrNullimpl(obj)) : obj;
    }

    /* JADX INFO: renamed from: onClosed-WpGqRn0 */
    public static final <T> Object m10496onClosedWpGqRn0(Object obj, Function1<? super Throwable, Unit> function1) {
        if (obj instanceof ChannelResult.Closed) {
            function1.invoke(ChannelResult.m10503exceptionOrNullimpl(obj));
        }
        return obj;
    }

    /* JADX INFO: renamed from: onFailure-WpGqRn0 */
    public static final <T> Object m10497onFailureWpGqRn0(Object obj, Function1<? super Throwable, Unit> function1) {
        if (obj instanceof ChannelResult.Failed) {
            function1.invoke(ChannelResult.m10503exceptionOrNullimpl(obj));
        }
        return obj;
    }

    /* JADX INFO: renamed from: onSuccess-WpGqRn0 */
    public static final <T> Object m10498onSuccessWpGqRn0(Object obj, Function1<? super T, Unit> function1) {
        if (!(obj instanceof ChannelResult.Failed)) {
            function1.invoke(obj);
        }
        return obj;
    }
}
