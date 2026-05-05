package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: OnPositionedDispatcher.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u001a6B\u0015\"4\u0012}\u0007njO0L͜P.`S2\u000fq|<$i-yCAZ Ԃ8ޛm`\u0018g\u001dI\u0013\nUO\tȀ|j:I\u001e|k\u0019'2pw\bA[xU9\u000f|f\t.<:8(\bG\u001arL\u001e\u0002\u0013Cy\u0018Z<N}RR;U5\u001e \u0014V /!%s\\E`l\fB_'\u0011yZNUbx\t[\u001e^TU\u0015'e,9X7c\u0018uk\u0011\bjeO\u0007OsS\u0004\u0017*=*wu.̯dÿ\u0018\u00173O\u001baC8j\nif\u001c);O\u0012N~\u0014~¾|ԫ\u0011<\f\u05faΣ+["}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wEa/C]\r$Av\u0016-,GIv0-\u0013kaF\\", "", "u(E", "1`R5X+']\u0018~\t", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mk", ")KP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW#r9?i\r\tAl\u0016\u0004", ":`h<h;']\u0018~\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011p\u0002", "2hb=T;<V", "", "2hb=T;<V{\u0003zk(\n\u00072y", ":`h<h;']\u0018~", "7r=<g\fF^(\u0013", "", "=m=<W,)]'\u0003\nb6\u0006\t.", "<nS2", "=mA<b;']\u0018~eh:\u0001\u00183o\t(z", "@n^AA6=S", "@d\\<i,", "\u0011n\\=T5B]\"", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class OnPositionedDispatcher {
    private static final int MinArraySize = 16;
    private LayoutNode[] cachedNodes;
    private final MutableVector<LayoutNode> layoutNodes = new MutableVector<>(new LayoutNode[16], 0);
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public final boolean isNotEmpty() {
        return this.layoutNodes.isNotEmpty();
    }

    public final void onNodePositioned(LayoutNode layoutNode) {
        this.layoutNodes.add(layoutNode);
        layoutNode.setNeedsOnPositionedDispatch$ui_release(true);
    }

    public final void remove(LayoutNode layoutNode) {
        this.layoutNodes.remove(layoutNode);
    }

    public final void onRootNodePositioned(LayoutNode layoutNode) {
        this.layoutNodes.clear();
        this.layoutNodes.add(layoutNode);
        layoutNode.setNeedsOnPositionedDispatch$ui_release(true);
    }

    public final void dispatch() {
        this.layoutNodes.sortWith(Companion.DepthComparator.INSTANCE);
        int size = this.layoutNodes.getSize();
        LayoutNode[] layoutNodeArr = this.cachedNodes;
        if (layoutNodeArr == null || layoutNodeArr.length < size) {
            layoutNodeArr = new LayoutNode[Math.max(16, this.layoutNodes.getSize())];
        }
        this.cachedNodes = null;
        for (int i2 = 0; i2 < size; i2++) {
            layoutNodeArr[i2] = this.layoutNodes.getContent()[i2];
        }
        this.layoutNodes.clear();
        while (true) {
            size--;
            if (-1 < size) {
                LayoutNode layoutNode = layoutNodeArr[size];
                Intrinsics.checkNotNull(layoutNode);
                if (layoutNode.getNeedsOnPositionedDispatch$ui_release()) {
                    dispatchHierarchy(layoutNode);
                }
            } else {
                this.cachedNodes = layoutNodeArr;
                return;
            }
        }
    }

    private final void dispatchHierarchy(LayoutNode layoutNode) {
        layoutNode.dispatchOnPositionedCallbacks$ui_release();
        int i2 = 0;
        layoutNode.setNeedsOnPositionedDispatch$ui_release(false);
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            do {
                dispatchHierarchy(content[i2]);
                i2++;
            } while (i2 < size);
        }
    }

    /* JADX INFO: compiled from: OnPositionedDispatcher.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005\"2ߛx\u001d߿\u001b9^C\u001eG1\u0013X0\u000fө\u007f42[t}Q<m\u001a,$_Ѫ!˗knRҙŸG\u0013"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wEa/C]\r$Av\u0016-,GIv0-\u0013kaFEA6V\u0002#PPX52", "", "u(E", "\u001bh]\u000ee9:g\u0007\u0003\u0010^", "", "\u0012d_A[\nH[$z\bZ;\u0007\u0016", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: compiled from: OnPositionedDispatcher.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0005\"4\u0012\u0006\rnj?1JΟHDɟ\u0004:\u001fm\f4R[Rp,Ae\u001c\u000e\"7O-h(sPZŲG\u000f\u0014\u0018A\u0001:Lmx\f\u0016?6PtW3{om=nzN\u0005N2hLѯ\t\b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wEa/C]\r$Av\u0016-,GIv0-\u0013kaFEA6V\u0002#PPX5\u001b1rH#\u00158\u0018V6\t\u0012UP.{\u001a", "\u001aiPCTuNb\u001d\u0006D<6\u0005\u0014+r{7\u0006MV", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mk", "\u001aj^A_0G\u001dv\t\u0003i(\n\u0005>o\r}", "u(E", "1n\\=T9>", "", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        private static final class DepthComparator implements Comparator<LayoutNode> {
            public static final DepthComparator INSTANCE = new DepthComparator();

            private DepthComparator() {
            }

            @Override // java.util.Comparator
            public int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
                int iCompare = Intrinsics.compare(layoutNode2.getDepth$ui_release(), layoutNode.getDepth$ui_release());
                return iCompare != 0 ? iCompare : Intrinsics.compare(layoutNode.hashCode(), layoutNode2.hashCode());
            }
        }
    }
}
