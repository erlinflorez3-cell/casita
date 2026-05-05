package kotlinx.coroutines.internal;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import com.google.common.util.concurrent.Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import yg.InterfaceC1492Gx;

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
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯP\u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000b<I\u0007Ӭ4\u0012\u000e\u0007njO0LeN0ZS8\u0018s{J$c$wFCU0}*\tUNog\u0005JbŏK\u000f\u0014\u001c\u0001̓4Ikxe\u0012\u00153JoU3UڎU\u001fnҚN\u000b0428@\u0005/\u0019JT\u0016͌\tCs\u0012\"2Pp\u0001R;N-\u001aX\u0006n$\u000f tg|9x!k>GS\u0013zR]Ub݁\u0001W\u0013Ld-\u0013}q 1F]7%6c\u0012MRÜC\rEwM\u000bn.7-Oy}>h\u0002$\u0015qO;b9̦ػ\tQn\u0015?T]mcP<3\u0018\u0007\u0002ȞJ\u00046\f7J>-`f6\u000f[z\u0003UPPH^p\f+eD$=\u007fy+\u007fӖliSI'f=\f\u0007\u001d\u001ei\u0001\u001d {`\u0014֫#\u001b|}a3a@\u0004H|\u000b\u0002C}\u0006\u0001bH*2<w\u0004=}).E(g_G29kHHt\u001e|\u000bnlk\u001abYP1\u001d\u0019֖.\u0013\u0012`Tj\u000br`V^27O,e\u0017\rN\u0013ء`\u0002B'5\u0016TVxkpS\u0004\u001251v7 n\u001a\u0013\u001eޫdKT_s(a\u0019\b4KBϵ\u0013i\u000fHc\u000ej\\n3`Z\u0013\u0010>\r\u000b\u0088ܟ\u00172M\u00054j:E1\\CS+\u001epV-\rmp\u0001\u0010-kcC\u0011\u0002<\u0010\u0019\u0012`k\u001f\u0007ς|S2\u0003p(3Ha7\u001f,{<x6\r#5\n\"\u0019\u000eшRgXz1\u000eU*7l֠\fֺ3=\u001bÁ\u001f5@\u001eEEz\u0010<ʻOɟ+z\u0005Ȫӡ?\u0007"}, d2 = {"4h]1F,@[\u0019\b\nB5\f\t<n{/", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u00135[\u0006 @|\u007f;+JEy4\u001dj", "!", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u00135[\u0006 @|k", "7c", "", "1qT.g,'S+lz`4|\u0012>", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", ">qTC", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0005 &G|\u00178}n#Y\u007f(7v%\u00042*AuC%\u0019q+>\u0018kuO\u00070E[R6e`<\u001e$\u001bX\u001dR5\u0016Q/\u0005\u000bs@H\u001bQ3E\u000b=2j\t\u001b\u000e3yF", ";ne296Ke\u0015\fy", "", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u00154o\u000f\u0012", "Bn", "4h]1F,@[\u0019\b\n:5{p9v\u007f\t\u0006M\u0013\u0013$F", "AsP?g\rK]!", "1k^@X", "\u001c", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u0003?b{0Dz\u00167\\*?t:\u001e\u0014OeG\u0016L6Mv|", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0005 &G|\u00178}n\u0013c\u0007\u001eGz#.VR\"o=$\u0015gH=\u0015r\u0015Xu'\u001d\u001052fayA\u001d%$\fX8\u0017\u0015hE-nR\u0001#\u0011;I\u000fDd\bUs\u0018>h\u0001Oc\u0010P\t{yJ/hE@c\bV*Oa*:", "/cS\u0010b5=W(\u0003\u0005g(\u0004\u0010C", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u0015+x\u001d\u0012", "2d[AT", "", "1n]1\\;B]\"", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "1ta", "\u001eN8\u001bG\f+A\u0013l]B\rk", "\u0011K> 8\u000b", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u0013Iaz*>C", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ConcurrentLinkedListKt {
    private static final Symbol CLOSED = new Symbol("CLOSED");
    private static final int POINTERS_SHIFT = 16;

    private static final /* synthetic */ boolean addConditionally$atomicfu(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, int i2, Function1<? super Integer, Boolean> function1) {
        int i3;
        do {
            i3 = atomicIntegerFieldUpdater.get(obj);
            if (!function1.invoke(Integer.valueOf(i3)).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i3, i3 + i2));
        return true;
    }

    private static final /* synthetic */ boolean addConditionally$atomicfu$array(AtomicIntegerArray atomicIntegerArray, int i2, int i3, Function1<? super Integer, Boolean> function1) {
        int i4;
        do {
            i4 = atomicIntegerArray.get(i2);
            if (!function1.invoke(Integer.valueOf(i4)).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerArray.compareAndSet(i2, i4, i4 + i3));
        return true;
    }

    public static final <N extends ConcurrentLinkedListNode<N>> N close(N n2) {
        while (true) {
            Object nextOrClosed = n2.getNextOrClosed();
            if (nextOrClosed == CLOSED) {
                return n2;
            }
            ConcurrentLinkedListNode concurrentLinkedListNode = (ConcurrentLinkedListNode) nextOrClosed;
            if (concurrentLinkedListNode != null) {
                n2 = (N) concurrentLinkedListNode;
            } else if (n2.markAsClosed()) {
                return n2;
            }
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> Object findSegmentAndMoveForward$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, long j2, S s2, Function2<? super Long, ? super S, ? extends S> function2) {
        Object objFindSegmentInternal;
        loop0: while (true) {
            objFindSegmentInternal = findSegmentInternal(s2, j2, function2);
            if (!SegmentOrClosed.m10558isClosedimpl(objFindSegmentInternal)) {
                Segment segmentM10556getSegmentimpl = SegmentOrClosed.m10556getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(obj);
                    if (segment.id >= segmentM10556getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!segmentM10556getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, obj, segment, segmentM10556getSegmentimpl)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                    } else if (segmentM10556getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        segmentM10556getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        return objFindSegmentInternal;
    }

    public static final /* synthetic */ <S extends Segment<S>> Object findSegmentAndMoveForward$atomicfu$array(AtomicReferenceArray atomicReferenceArray, int i2, long j2, S s2, Function2<? super Long, ? super S, ? extends S> function2) {
        Object objFindSegmentInternal;
        loop0: while (true) {
            objFindSegmentInternal = findSegmentInternal(s2, j2, function2);
            if (!SegmentOrClosed.m10558isClosedimpl(objFindSegmentInternal)) {
                Segment segmentM10556getSegmentimpl = SegmentOrClosed.m10556getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceArray.get(i2);
                    if (segment.id >= segmentM10556getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!segmentM10556getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceArray, i2, segment, segmentM10556getSegmentimpl)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                    } else if (segmentM10556getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        segmentM10556getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        return objFindSegmentInternal;
    }

    public static final <S extends Segment<S>> Object findSegmentInternal(S s2, long j2, Function2<? super Long, ? super S, ? extends S> function2) {
        while (true) {
            if (s2.id >= j2 && !s2.isRemoved()) {
                return SegmentOrClosed.m10553constructorimpl(s2);
            }
            Object nextOrClosed = s2.getNextOrClosed();
            if (nextOrClosed == CLOSED) {
                return SegmentOrClosed.m10553constructorimpl(CLOSED);
            }
            S sInvoke = (S) ((ConcurrentLinkedListNode) nextOrClosed);
            if (sInvoke == null) {
                sInvoke = function2.invoke(Long.valueOf(s2.id + 1), s2);
                if (s2.trySetNext(sInvoke)) {
                    if (s2.isRemoved()) {
                        s2.remove();
                    }
                }
            }
            s2 = (Object) sInvoke;
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> boolean moveForward$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, S s2) {
        while (true) {
            Segment segment = (Segment) atomicReferenceFieldUpdater.get(obj);
            if (segment.id >= s2.id) {
                return true;
            }
            if (!s2.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, obj, segment, s2)) {
                if (segment.decPointers$kotlinx_coroutines_core()) {
                    segment.remove();
                }
                return true;
            }
            if (s2.decPointers$kotlinx_coroutines_core()) {
                s2.remove();
            }
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> boolean moveForward$atomicfu$array(AtomicReferenceArray atomicReferenceArray, int i2, S s2) {
        while (true) {
            Segment segment = (Segment) atomicReferenceArray.get(i2);
            if (segment.id >= s2.id) {
                return true;
            }
            if (!s2.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            if (Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceArray, i2, segment, s2)) {
                if (segment.decPointers$kotlinx_coroutines_core()) {
                    segment.remove();
                }
                return true;
            }
            if (s2.decPointers$kotlinx_coroutines_core()) {
                s2.remove();
            }
        }
    }
}
