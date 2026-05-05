package kotlinx.coroutines.flow;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import yg.InterfaceC1492Gx;

/* JADX INFO: Access modifiers changed from: package-private */
/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$MultiFileClassPart.<init>(KotlinClassMetadata.kt:308)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:54)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d̉=!4i\bDJc|\u0004O\f8é6B\u0015\"4\u0012}\bnjO0LeN.ZS8\u000fs{:$sR\u007fّS[*\u007f2\t\u0016N\u0016f\u000fL`ŏQ\u000f.\u001c\tl<I\u001cx\f\u0011?8HoM4eok;\u0011z<\u0005.5:8(\t\u0019@8Ϻ(|\u000bE[\fX0noZT\u0013˟\u0013\u001a:\fN\"\u0011\u001e#g|5xrc:=$\u001bipPmdH\u0017[\u0012^Z7\u000f\u0007ad+n6U\u0017+م\u0011\u0007zaO\u0005Oq\u0004\u0005\u0017&?MWyo<h\u0002$\u0015qO;\\\u0013(bӤ_`4-;QsK\u0017\u000eVv+\u007f\u001bC\u001c\u000e4/`H;#~\u000e\u001e5\u0005r\u001a@~\u0001~D\u0006Эo6?+\u00105;9af\u007f`S,\\A\u0014\u0005;)S\u0005|(sT<h[\u001bƻ{Q7]͞AU"}, d2 = {"0tU3X9", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\tz", "\"", "1`_.V0Mg", "", "=m1BY->`\u0003\u0010zk-\u0004\u0013A", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0002EZ~ DW'.ZDBuFs", "1n]3_(MS", "4k^DB5", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "1`]0X3EO\u0016\u0006z", "1gT0^\rE]+\\\u0005g;|\u001c>", "", "1gT0^\rE]+\\\u0005g;|\u001c>$`/\u0006Rf&\u0011AM\u0018E\u0006%Hhc/", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 5, mv = {2, 0, 0}, pn = "", xi = 48, xs = ">AE<8<Ez.9;7<:.2(5o&+-4j\u0001&(/\u0002*")
public final /* synthetic */ class FlowKt__ContextKt {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016O\n8v4e%,\u0015wF\u0010\u00175\\]^\"f\bw\u0019bwZwlW\u0001-z\u0002\f{Kad(>G0?C\u0017h\f\u0010'j[DtLG")
    @InterfaceC1492Gx
    public static final /* synthetic */ Flow buffer(Flow flow, int i2) {
        return buffer$default(flow, i2, null, 2, null);
    }

    public static final <T> Flow<T> buffer(Flow<? extends T> flow, int i2, BufferOverflow bufferOverflow) {
        int i3 = i2;
        BufferOverflow bufferOverflow2 = bufferOverflow;
        if (i3 < 0 && i3 != -2 && i3 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i3).toString());
        }
        if (i3 == -1 && bufferOverflow2 != BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (i3 == -1) {
            bufferOverflow2 = BufferOverflow.DROP_OLDEST;
            i3 = 0;
        }
        return flow instanceof FusibleFlow ? FusibleFlow.DefaultImpls.fuse$default((FusibleFlow) flow, null, i3, bufferOverflow2, 1, null) : new ChannelFlowOperatorImpl(flow, null, i3, bufferOverflow2, 2, null);
    }

    public static /* synthetic */ Flow buffer$default(Flow flow, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = -2;
        }
        return buffer(flow, i2);
    }

    public static /* synthetic */ Flow buffer$default(Flow flow, int i2, BufferOverflow bufferOverflow, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i2 = -2;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return FlowKt.buffer(flow, i2, bufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Flow<T> cancellable(Flow<? extends T> flow) {
        return flow instanceof CancellableFlow ? flow : new CancellableFlowImpl(flow);
    }

    private static final void checkFlowContext$FlowKt__ContextKt(CoroutineContext coroutineContext) {
        if (coroutineContext.get(Job.Key) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext).toString());
        }
    }

    public static final <T> Flow<T> conflate(Flow<? extends T> flow) {
        return buffer$default(flow, -1, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Flow<T> flowOn(Flow<? extends T> flow, CoroutineContext coroutineContext) {
        checkFlowContext$FlowKt__ContextKt(coroutineContext);
        return Intrinsics.areEqual(coroutineContext, EmptyCoroutineContext.INSTANCE) ? flow : flow instanceof FusibleFlow ? FusibleFlow.DefaultImpls.fuse$default((FusibleFlow) flow, coroutineContext, 0, null, 6, null) : new ChannelFlowOperatorImpl(flow, coroutineContext, 0, null, 12, null);
    }
}
