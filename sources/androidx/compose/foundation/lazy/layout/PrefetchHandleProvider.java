package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: compiled from: LazyLayoutPrefetchState.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.hS2şs{B*cҕyCQU\"Ԃ*\teNogtKb\u000bY\u000f\u000e\u0016~l2Hkތ\u000e\u0012=1znTsh\u007fAG`\r63!B&F{\u001d\u0001H-X\u0014\u0005~[K:\u0017ضDpHXUs\u0013!*\u0006l(1\"jpf6vv\u000e>=.\u001bipZWc>\ne\rtbބ\fǸҐ\"-FFC%my\u0011\u0018j[m\u0015ouK\u000e\u0001'U5yweAp\u007fB![S\u001bj\u000b&\u000b\u0013Ƣ_ϯˏ/Qi^^\"x\u0004\t\u007f%<2\u0013\\άJͶ1\u001anڜ^?\u0003rk@~\u00035ې\u0002ѐe6\u001fӛP?9;3f\u007fd\u0012ύPѼ\u007f\u0005\u0015̔Ń\u0001s)^Z\u05f7|C\u001aǁ{g"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005VA\u001e\u0016hp7\nF(Wu.G7[6mVq=!g", "", "7sT:66Gb\u0019\b\n?(z\u00189r\u0014", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;2\u0006'O*X5kR{Lt\u000eX\u001dX8!Z", "AtQ0b4I]'~aZ@\u0007\u0019>S\u000f$\u000b@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006d52W\b(Bw$.4?OuD-\u0003w]H\u00079", "3wT0h;H`", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005VA\u001e\u0016hp7\nQ*Qv&WSN92", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001t\u0012BWSJ5\u001b\u001a*|H5\u001bm<]Z6GT,6earF#rV\f]5\u001a\u0019/( wCD)\f+\\K9r\t\u0017 \u001c54\u0001F \u0017C\u000e\u001f\u0006PrVVV]\u0004OLOp*K\bs'lI(3\u0010\u0001\u0019pOL7\t\t]\u0015qeCeqO$\u0005F$\bneVNnQKx1(\u0015\u0003s'F\"{'\t7\u0014Cs!q\u0005Lg'<af\u0013/\\@7-6Ih\u0003<", "1qT.g,'S'\u000ez]\u0017\n\t0e\u000f&~-\u0001#'G}\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005VA\u001e\u0016hp7\nP,Z\u0007'U[$", "7mS2k", "", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ">qT3X;<V\u0001~\nk0z\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005VA\u001e\u0016hp7\nK,]\u0004+EZ$", "1qT.g,'S'\u000ez]\u0017\n\t0e\u000f&~-\u0001#'G}\u001d\u0004g\u000b\u001c\\h\u0011+", "uH9\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0002!'Pn\nKz/>#\u0005\u001cL\u0002_5IWE{Cg\u007fua:\u0007r*Q^'VYR*j(6$\u0010\u001bY\u001bX/\f\u0018#?.vOA-\buJ\fKq\u007f\b%\u0012?s:IR%[C\u001cqU3xU#J\u0007GBEq(gx_)l:H3i", "AbW2W<ES\u0004\fz_,\f\u00072", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;9\u0004'HL]*_@\u00029#\u0012\u0019x[+\u000e\u0005h?'Q@@\u001e\u000f,\u001f", "AbW2W<ES\u0004\fz_,\f\u00072-p\u000ebCk\b\u000b", "uH9\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0002!'Pn\nKz/>#\u0005\u001cL\u0002_5IWE{Cg\u007fua:\u0007r*Q^'VYR*j(6$\u0010\u001bY\u001bX/\f\u0018#?.vOA-\buJ\fKq\u007f\b%\u0012?s:IR%[C\u001cqU3xU#Fu\\U,^>n\u001cn\bi:;$#o\u001c\twL=\n:>\u001erSyveJ{vA#Em1", "\u0016`]1_,\u001a\\\u0018kzj<|\u0017>I\b3\u0003", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PrefetchHandleProvider {
    public static final int $stable = 8;
    private final PrefetchScheduler executor;
    private final LazyLayoutItemContentFactory itemContentFactory;
    private final SubcomposeLayoutState subcomposeLayoutState;

    public PrefetchHandleProvider(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, SubcomposeLayoutState subcomposeLayoutState, PrefetchScheduler prefetchScheduler) {
        this.itemContentFactory = lazyLayoutItemContentFactory;
        this.subcomposeLayoutState = subcomposeLayoutState;
        this.executor = prefetchScheduler;
    }

    /* JADX INFO: renamed from: schedulePrefetch-VKLhPVY */
    public final LazyLayoutPrefetchState.PrefetchHandle m1203schedulePrefetchVKLhPVY(int i2, long j2, PrefetchMetrics prefetchMetrics) {
        HandleAndRequestImpl handleAndRequestImpl = new HandleAndRequestImpl(this, i2, j2, prefetchMetrics, null);
        this.executor.schedulePrefetch(handleAndRequestImpl);
        return handleAndRequestImpl;
    }

    /* JADX INFO: renamed from: createNestedPrefetchRequest-VKLhPVY */
    public final PrefetchRequest m1202createNestedPrefetchRequestVKLhPVY(int i2, long j2, PrefetchMetrics prefetchMetrics) {
        return new HandleAndRequestImpl(this, i2, j2, prefetchMetrics, null);
    }

    /* JADX INFO: compiled from: LazyLayoutPrefetchState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯZ\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<H\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP.XT2\u000fy\u0005<$a)yCQU\"}8\tWȞog\u0005JbŏK\u000f\u0014\u0016\u0001j2N]xk\u001e\u0017˰JoU3UoC9htD\f(2(8\u007fڒ\u00030ݒx\u0010%ysK:\u0012h?\u0016zm\u001dQ\u0013\u001b*\u0006l\"\u0011\"jjf6vpm>=(\u001bipTϮc0\u000bTULb=%v\u00105qT\u007f;#=k\u00035i\"SKE\u007fV\u001dhU>qI<oDr\u0018\u0014CB\u007f\u0011ku>\\3U'\f̥*ՒӍOR\u0014C\u0006\u0017D\u001dJ!&\u0010=G\\?jj6Ԅ\u0004t!f\u0007PJdP\u001e\u0013ad6k\u0014{5G;~Q\u0010EANe\u001dK!f5\u000f\u00119[\u0003\u0018\t\u0015Iu(U?tX=vrPY\u000e\u0002\u0012sz\u0002X\b\u0007ϝ\u0002ôz߾ҽ\u0016$ھ_;+!y\n\u0019Pu\u007f\u001d`\u0017]@ɰTغ&n\u001eճz\u0015\u001a[\\d3m'ӼZ¯\u0015M$\u0381W\n\u0016\u001e8\\&Fwغ\u001cʽShqҔ\u001eo\u00181Gfec%,dæ;ӷ79ie\u0016m`\u0004dKJp\u001dX\u0015L*ۑfڅ,\":ʋ;\u001c\u0006\u000b\\N:\u001d\tŰ}ʬ8,9ǉ-'V\u00136Bo\u0007? 1ӓ\u0012њX7<\u0005o4\u0003\u0016Qfj\u0002\bq\u000fHZ\u000f1&[ۋ\"5G9,ȫtط\u0001#\u000fѨD\u000eU{dIbkD\u000b,ݫ,ک\u001e9Yǽ\u000e\u001f\u001d\u0004A203\u001cɦtϯUM\u001a\u05fdϘ|\u0003\u0017>n\u05cd\u00046ix,f\nߣSz"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005VA\u001e\u0016hp7\nF(Wu.G7[6mVq=!P=\nW*\u0014\u00055J#[DC/\b:XeCs\ba", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;9\u0004'HL]*_@\u00029#\u0012\u0019x[+\u000e\u0005h?'Q@@\u001e\u000f,\u001f", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005VA\u001e\u0016hp7\nP,Z\u0007'U[$", "7mS2k", "", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ">qT3X;<V\u0001~\nk0z\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005VA\u001e\u0016hp7\nK,]\u0004+EZ$", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001t\u0012BWSJ5\u001f+\u0015iaH\u0005f\u000fJ\u007f&NL99fcv<\u0014\u001f0q3\u0012\t\u000eXN.rCJh\u00066Q\rEv\u0001U\u0017\u0018Eso>e\u0014Q\u0003^|=>|\u0010`[\u000eQQT,\u0015q\f`\u001dk8=\f\u0014\u0001&\u001ff^\u0004p\u0002] yV\u00031lX!D<-MmhOAv\u001f\u001bt(\u001b[\u0003\u0007o<a\u0003:\u0002=\u0002C4CL\u0001Xm\u0018K4<\u0006", "\u0018", "6`b\u001fX:HZ*~yG,\u000b\u0018/dj5{A\u0001&\u0015Jo\u001c", "", "7r2.a*>Z\u0019}", "7r2<`7Ha\u0019}", "u(I", "7r<2T:N`\u0019}", "7rD?Z,Gb", "7rE._0=", "<dbAX+)`\u0019\u007fzm*\u007ff9n\u000f5\u0006G\b\u0017$", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005VA\u001e\u0016hp7\nF(Wu.G7[6mVq=!P=\nW*\u0014\u00055J#[DC/\b:XeCs\bJ~\u000eCypAA\u001dGz\u0015\u0005?,FPbn\u0007QHLb7:", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005VA\u001e\u0016hp7\nF(Wu.G7[6mVq=!g", ">qT0b4I]'~]Z5{\u0010/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006d52W\b(Bw$.4?OuD-\u0003w]H\u0007\"\u0017[v%QTY6jRq+\u001b\u001cipJ4\f\fY\u0017", "1`]0X3", "", ";`a84:.`\u001b~\u0004m", ">da3b9F1#\u0007\u0006h:\u0001\u00183o\t", ">da3b9F;\u0019z\tn9|", ">da3b9F;\u0019z\tn9|P\fRn5\u0010JK", "uI\u0018#", "@db<_=><\u0019\r\n^+g\u0016/f\u007f7yCn&\u0013Vo\u001c", "BnBAe0GU", "", "3wT0h;>", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005VA\u001e\u0016hp7\nP,Z\u0007'U[<*f]r\u0013", "Ag^B_+\u001ef\u0019|\u000bm,", "/uT?T.>", "", "\u001cdbAX+)`\u0019\u007fzm*\u007ff9n\u000f5\u0006G\b\u0017$", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private final class HandleAndRequestImpl implements LazyLayoutPrefetchState.PrefetchHandle, PrefetchRequest {
        private final long constraints;
        private boolean hasResolvedNestedPrefetches;
        private final int index;
        private boolean isCanceled;
        private boolean isMeasured;
        private boolean isUrgent;
        private NestedPrefetchController nestedPrefetchController;
        private SubcomposeLayoutState.PrecomposedSlotHandle precomposeHandle;
        private final PrefetchMetrics prefetchMetrics;

        public /* synthetic */ HandleAndRequestImpl(PrefetchHandleProvider prefetchHandleProvider, int i2, long j2, PrefetchMetrics prefetchMetrics, DefaultConstructorMarker defaultConstructorMarker) {
            this(i2, j2, prefetchMetrics);
        }

        private HandleAndRequestImpl(int i2, long j2, PrefetchMetrics prefetchMetrics) {
            this.index = i2;
            this.constraints = j2;
            this.prefetchMetrics = prefetchMetrics;
        }

        private final boolean isComposed() {
            return this.precomposeHandle != null;
        }

        private final boolean isValid() {
            if (!this.isCanceled) {
                int itemCount = PrefetchHandleProvider.this.itemContentFactory.getItemProvider().invoke().getItemCount();
                int i2 = this.index;
                if (i2 >= 0 && i2 < itemCount) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle
        public void cancel() {
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.precomposeHandle;
            if (precomposedSlotHandle != null) {
                precomposedSlotHandle.dispose();
            }
            this.precomposeHandle = null;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle
        public void markAsUrgent() {
            this.isUrgent = true;
        }

        private final boolean shouldExecute(PrefetchRequestScope prefetchRequestScope, long j2) {
            long jAvailableTimeNanos = prefetchRequestScope.availableTimeNanos();
            return (this.isUrgent && jAvailableTimeNanos > 0) || j2 < jAvailableTimeNanos;
        }

        @Override // androidx.compose.foundation.lazy.layout.PrefetchRequest
        public boolean execute(PrefetchRequestScope prefetchRequestScope) {
            long averageMeasureTimeNanos;
            long averageCompositionTimeNanos;
            if (!isValid()) {
                return false;
            }
            Object contentType = PrefetchHandleProvider.this.itemContentFactory.getItemProvider().invoke().getContentType(this.index);
            if (!isComposed()) {
                if (contentType != null && this.prefetchMetrics.getAverageCompositionTimeNanosByContentType().contains(contentType)) {
                    averageCompositionTimeNanos = this.prefetchMetrics.getAverageCompositionTimeNanosByContentType().get(contentType);
                } else {
                    averageCompositionTimeNanos = this.prefetchMetrics.getAverageCompositionTimeNanos();
                }
                if (!shouldExecute(prefetchRequestScope, averageCompositionTimeNanos)) {
                    return true;
                }
                PrefetchMetrics prefetchMetrics = this.prefetchMetrics;
                long jNanoTime = System.nanoTime();
                Trace.beginSection("compose:lazy:prefetch:compose");
                try {
                    performComposition();
                    Unit unit = Unit.INSTANCE;
                    Trace.endSection();
                    long jNanoTime2 = System.nanoTime() - jNanoTime;
                    if (contentType != null) {
                        prefetchMetrics.getAverageCompositionTimeNanosByContentType().set(contentType, prefetchMetrics.calculateAverageTime(jNanoTime2, prefetchMetrics.getAverageCompositionTimeNanosByContentType().getOrDefault(contentType, 0L)));
                    }
                    prefetchMetrics.averageCompositionTimeNanos = prefetchMetrics.calculateAverageTime(jNanoTime2, prefetchMetrics.getAverageCompositionTimeNanos());
                } finally {
                }
            }
            if (!this.isUrgent) {
                if (!this.hasResolvedNestedPrefetches) {
                    if (prefetchRequestScope.availableTimeNanos() <= 0) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        this.nestedPrefetchController = resolveNestedPrefetchStates();
                        this.hasResolvedNestedPrefetches = true;
                        Unit unit2 = Unit.INSTANCE;
                    } finally {
                    }
                }
                NestedPrefetchController nestedPrefetchController = this.nestedPrefetchController;
                if (nestedPrefetchController != null ? nestedPrefetchController.executeNestedPrefetches(prefetchRequestScope) : false) {
                    return true;
                }
            }
            if (!this.isMeasured && !Constraints.m6595isZeroimpl(this.constraints)) {
                if (contentType != null && this.prefetchMetrics.getAverageMeasureTimeNanosByContentType().contains(contentType)) {
                    averageMeasureTimeNanos = this.prefetchMetrics.getAverageMeasureTimeNanosByContentType().get(contentType);
                } else {
                    averageMeasureTimeNanos = this.prefetchMetrics.getAverageMeasureTimeNanos();
                }
                if (!shouldExecute(prefetchRequestScope, averageMeasureTimeNanos)) {
                    return true;
                }
                PrefetchMetrics prefetchMetrics2 = this.prefetchMetrics;
                long jNanoTime3 = System.nanoTime();
                Trace.beginSection("compose:lazy:prefetch:measure");
                try {
                    m1204performMeasureBRTryo0(this.constraints);
                    Unit unit3 = Unit.INSTANCE;
                    Trace.endSection();
                    long jNanoTime4 = System.nanoTime() - jNanoTime3;
                    if (contentType != null) {
                        prefetchMetrics2.getAverageMeasureTimeNanosByContentType().set(contentType, prefetchMetrics2.calculateAverageTime(jNanoTime4, prefetchMetrics2.getAverageMeasureTimeNanosByContentType().getOrDefault(contentType, 0L)));
                    }
                    prefetchMetrics2.averageMeasureTimeNanos = prefetchMetrics2.calculateAverageTime(jNanoTime4, prefetchMetrics2.getAverageMeasureTimeNanos());
                } finally {
                }
            }
            return false;
        }

        private final void performComposition() {
            if (!isValid()) {
                throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performComposition()".toString());
            }
            if (this.precomposeHandle == null) {
                LazyLayoutItemProvider lazyLayoutItemProviderInvoke = PrefetchHandleProvider.this.itemContentFactory.getItemProvider().invoke();
                Object key = lazyLayoutItemProviderInvoke.getKey(this.index);
                this.precomposeHandle = PrefetchHandleProvider.this.subcomposeLayoutState.precompose(key, PrefetchHandleProvider.this.itemContentFactory.getContent(this.index, key, lazyLayoutItemProviderInvoke.getContentType(this.index)));
                return;
            }
            throw new IllegalArgumentException("Request was already composed!".toString());
        }

        /* JADX INFO: renamed from: performMeasure-BRTryo0 */
        private final void m1204performMeasureBRTryo0(long j2) {
            if (this.isCanceled) {
                throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performMeasure()".toString());
            }
            if (this.isMeasured) {
                throw new IllegalArgumentException("Request was already measured!".toString());
            }
            this.isMeasured = true;
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.precomposeHandle;
            if (precomposedSlotHandle == null) {
                throw new IllegalArgumentException("performComposition() must be called before performMeasure()".toString());
            }
            int placeablesCount = precomposedSlotHandle.getPlaceablesCount();
            for (int i2 = 0; i2 < placeablesCount; i2++) {
                precomposedSlotHandle.mo5540premeasure0kLqBqw(i2, j2);
            }
        }

        private final NestedPrefetchController resolveNestedPrefetchStates() {
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.precomposeHandle;
            if (precomposedSlotHandle == null) {
                throw new IllegalArgumentException("Should precompose before resolving nested prefetch states".toString());
            }
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            precomposedSlotHandle.traverseDescendants("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", new Function1<TraversableNode, TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.foundation.lazy.layout.PrefetchHandleProvider$HandleAndRequestImpl$resolveNestedPrefetchStates$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public final TraversableNode.Companion.TraverseDescendantsAction invoke(TraversableNode traversableNode) {
                    T tMutableListOf;
                    Intrinsics.checkNotNull(traversableNode, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                    LazyLayoutPrefetchState prefetchState = ((TraversablePrefetchStateNode) traversableNode).getPrefetchState();
                    Ref.ObjectRef<List<LazyLayoutPrefetchState>> objectRef2 = objectRef;
                    List<LazyLayoutPrefetchState> list = objectRef2.element;
                    if (list != null) {
                        list.add(prefetchState);
                        tMutableListOf = list;
                    } else {
                        tMutableListOf = CollectionsKt.mutableListOf(prefetchState);
                    }
                    objectRef2.element = tMutableListOf;
                    return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
                }
            });
            List list = (List) objectRef.element;
            if (list != null) {
                return new NestedPrefetchController(list);
            }
            return null;
        }

        public String toString() {
            return "HandleAndRequestImpl { index = " + this.index + ", constraints = " + ((Object) Constraints.m6596toStringimpl(this.constraints)) + ", isComposed = " + isComposed() + ", isMeasured = " + this.isMeasured + ", isCanceled = " + this.isCanceled + " }";
        }

        /* JADX INFO: compiled from: LazyLayoutPrefetchState.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004O$8\u000bDB\u0007\"2\u0012\u007f\u0007tpAӄLeV=ZS@\u000fs{:%c$\u007fLCU0}*ޛUȡi}ñzZ9BO\u0017&\u0003x,a[\t_\"\u000f`D\u001e@ݯQoK<)|D\u001082PD\"\u0005/'zT\u001ez\u0013Cy\u0011hؖL¤>R\u0015˟U6 \fV.\u0011(lo^8Xl\fBE\"1jpU}ۂ2ƊQ\u000fNT5\u0016Gm,5X7c\u001a{و\u000f\u07baV[Gš\u0010\u0004K\u0005\u0001-7-Ys\u00068\u0007\u0001jƆ-̠\u0011]z̦ف\t_"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005VA\u001e\u0016hp7\nF(Wu.G7[6mVq=!P=\nW*\u0014\u00055J#[DC/\b:XeCs\bJ~\u000eCypAA\u001dGz\u0015\u0005?,FPbn\u0007QHLb7:", "", "AsPAX:", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;9\u0004'HL]*_@\u00029#\u00120", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001t\u0012BWSJ5\u001f+\u0015iaH\u0005f\u000fJ\u007f&NL99fcv<\u0014\u001f\u0019pJ4\f\fY\u001d-m17+\u0018,W\u0011\u001fp\f\u0013kt:f\u0002>  V}\u001c?(-vU/#j", "@d`BX:M7\"}zq", "", "@d`BX:Mau\u0013hm(\f\t", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005VA\u001e\u0016hp7\nP,Z\u0007'U[$", ")KY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;", "AsPAX\u0010GR\u0019\u0012", "3wT0h;><\u0019\r\n^+g\u0016/f\u007f7yC\u0001%", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005VA\u001e\u0016hp7\nP,Z\u0007'U[<*f]r\u0013", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        private final class NestedPrefetchController {
            private int requestIndex;
            private final List<PrefetchRequest>[] requestsByState;
            private int stateIndex;
            private final List<LazyLayoutPrefetchState> states;

            public NestedPrefetchController(List<LazyLayoutPrefetchState> list) {
                this.states = list;
                this.requestsByState = new List[list.size()];
                if (list.isEmpty()) {
                    throw new IllegalArgumentException("NestedPrefetchController shouldn't be created with no states".toString());
                }
            }

            public final boolean executeNestedPrefetches(PrefetchRequestScope prefetchRequestScope) {
                if (this.stateIndex >= this.states.size()) {
                    return false;
                }
                if (HandleAndRequestImpl.this.isCanceled) {
                    throw new IllegalStateException("Should not execute nested prefetch on canceled request".toString());
                }
                Trace.beginSection("compose:lazy:prefetch:nested");
                while (this.stateIndex < this.states.size()) {
                    try {
                        if (this.requestsByState[this.stateIndex] == null) {
                            if (prefetchRequestScope.availableTimeNanos() <= 0) {
                                return true;
                            }
                            List<PrefetchRequest>[] listArr = this.requestsByState;
                            int i2 = this.stateIndex;
                            listArr[i2] = this.states.get(i2).collectNestedPrefetchRequests$foundation_release();
                        }
                        List<PrefetchRequest> list = this.requestsByState[this.stateIndex];
                        Intrinsics.checkNotNull(list);
                        while (this.requestIndex < list.size()) {
                            if (list.get(this.requestIndex).execute(prefetchRequestScope)) {
                                return true;
                            }
                            this.requestIndex++;
                        }
                        this.requestIndex = 0;
                        this.stateIndex++;
                    } finally {
                        Trace.endSection();
                    }
                }
                Unit unit = Unit.INSTANCE;
                return false;
            }
        }
    }
}
