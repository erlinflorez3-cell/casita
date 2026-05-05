package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: DepthSortedSet.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4B\u0007\"B\u0012\u007f\u0007|jA0ZeP\u008cZS82s{B*c$wFCU0}*ޛWNugvJ`\u0010K\u000f\u001c\u0016\u0001j2I]xk\u001e\u0017˰HģU\u074c}ok8!\u007fF\t.2:8(\u0006в\u001e*V\u0012?\u0007Q[$\u0012^Q!>`\u001fe\u0005H\u0017NJ.\u00146\\\u0016OfLzoR/Q\b2F\\;w0+NUMb<%v\u0010\u001fq¯=}\u00193i\u001b\u0007\u0001`\b M\tU\u0005\u00178W=OueNp\f$\u0017;O;b\u0003(l\u0005\u007fq:@qՙi\u0014\\\u001cB\u0010z*\u000el\b\u001c\u0018?H\\2bl\u0016)Kt!o\u0007dRzP\u0003\u0013qF\u00195\u007fa0g\u001fOWq=)Ne\u0001c\u0013tŃ\u0003ͼ%[\\ו1!)T\u0010Q_R\u0017׃Jݳ\u000eYEЧT\u0016p\tB\u0010@I\u0010/*\u0016>\u001957\nBQ)\"B\u001fֶϞvݶdr[kXTN/\u0007\u0018=4\u0017\u0017+Vr\u0013\u0004VdZ<\u0011{!\u0003\u0016Tܴ\u0015ء`wDƙ٠\u0014k"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9l<\u000248G\b-Fm\u0015\u001cMR\u0011", "", "3wc?T\bLa\u0019\f\nb6\u0006\u0017", "", "uY\u0018#", "\u0012d_A[\nH[$z\bZ;\u0007\u0016", "\u001aiPCTuNb\u001d\u0006D<6\u0005\u0014+r{7\u0006MV", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mk", "\u001aj^A_0G\u001dv\t\u0003i(\n\u0005>o\r}", ";`_\u001cY\u0016KW\u001b\u0003\u0004Z3[\t:t\u0003", "", "", "5dc\u001aT7(T\u0003\f~`0\u0006\u00056D\u007f3\u000bC", "u(;7T=:\u001d)\u000e~eud\u0005:;", ";`_\u001cY\u0016KW\u001b\u0003\u0004Z3[\t:t\u0003fz@\b\u0017\u0019C~\u000e", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "Adc", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9|Iv%#Y\ru", "/cS", "", "<nS2", "1n]AT0Ga", "7r4:c;R", "7r=<g\fF^(\u0013", ">n_", ">n_\u0012T*A", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "@d\\<i,", "BnBAe0GU", "", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DepthSortedSet {
    public static final int $stable = 8;
    private final Comparator<LayoutNode> DepthComparator;
    private final boolean extraAssertions;
    private final Lazy mapOfOriginalDepth$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<Map<LayoutNode, Integer>>() { // from class: androidx.compose.ui.node.DepthSortedSet$mapOfOriginalDepth$2
        @Override // kotlin.jvm.functions.Function0
        public final Map<LayoutNode, Integer> invoke() {
            return new LinkedHashMap();
        }
    });
    private final TreeSet<LayoutNode> set;

    public DepthSortedSet(boolean z2) {
        this.extraAssertions = z2;
        Comparator<LayoutNode> comparator = new Comparator<LayoutNode>() { // from class: androidx.compose.ui.node.DepthSortedSet$DepthComparator$1
            @Override // java.util.Comparator
            public int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
                int iCompare = Intrinsics.compare(layoutNode.getDepth$ui_release(), layoutNode2.getDepth$ui_release());
                return iCompare != 0 ? iCompare : Intrinsics.compare(layoutNode.hashCode(), layoutNode2.hashCode());
            }
        };
        this.DepthComparator = comparator;
        this.set = new TreeSet<>(comparator);
    }

    private final Map<LayoutNode, Integer> getMapOfOriginalDepth() {
        return (Map) this.mapOfOriginalDepth$delegate.getValue();
    }

    public final boolean contains(LayoutNode layoutNode) {
        boolean zContains = this.set.contains(layoutNode);
        if (this.extraAssertions) {
            if (!(zContains == getMapOfOriginalDepth().containsKey(layoutNode))) {
                InlineClassHelperKt.throwIllegalStateException("inconsistency in TreeSet");
            }
        }
        return zContains;
    }

    public final void add(LayoutNode layoutNode) {
        if (!layoutNode.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("DepthSortedSet.add called on an unattached node");
        }
        if (this.extraAssertions) {
            Integer num = getMapOfOriginalDepth().get(layoutNode);
            if (num == null) {
                getMapOfOriginalDepth().put(layoutNode, Integer.valueOf(layoutNode.getDepth$ui_release()));
            } else {
                if (!(num.intValue() == layoutNode.getDepth$ui_release())) {
                    InlineClassHelperKt.throwIllegalStateException("invalid node depth");
                }
            }
        }
        this.set.add(layoutNode);
    }

    public final boolean remove(LayoutNode layoutNode) {
        if (!layoutNode.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("DepthSortedSet.remove called on an unattached node");
        }
        boolean zRemove = this.set.remove(layoutNode);
        if (this.extraAssertions) {
            if (!Intrinsics.areEqual(getMapOfOriginalDepth().remove(layoutNode), zRemove ? Integer.valueOf(layoutNode.getDepth$ui_release()) : null)) {
                InlineClassHelperKt.throwIllegalStateException("invalid node depth");
            }
        }
        return zRemove;
    }

    public final LayoutNode pop() {
        LayoutNode layoutNodeFirst = this.set.first();
        remove(layoutNodeFirst);
        return layoutNodeFirst;
    }

    public final boolean isEmpty() {
        return this.set.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    public String toString() {
        return this.set.toString();
    }

    public final void popEach(Function1<? super LayoutNode, Unit> function1) {
        while (!isEmpty()) {
            function1.invoke(pop());
        }
    }
}
