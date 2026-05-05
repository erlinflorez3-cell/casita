package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: FocusedBounds.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"B\u0012\u007f\u0007tjA0JhP.`ݷ2\u000fq\u007f:řqҕ\u0010RkUH|R\t}N f}\u000bs\u001bU\u001d\u0007.\u0007z0YW\u000f\\@\u0012BD\u007f?aQ\u001e?˃dtD\nh@0E\u0012\u0005/\u001eZN\u001e\u0005\u0013Ea\u000b@3\u0011\u0017HS%[\u0015\u001e\"\bT\u001f/!li^6vp\f<\u0006ݑ\u000fݦFZ/ڿH~S\u0013T[G\u000f|i,0\u0011IC\u001e=S1\u0011)ÐAƄCwEݛ\u0001)-6W\u007fɷ:h"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0006?W\u000e.7lr8]L:y\u001e\u001b#hnJ\u0007p\u0015Xu'\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9|Ir65f\f\u001c4t\u0016\u0017WB;A", "=m?<f0MW#\bz]", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc(", "5dc\u001ca\u0017Ha\u001d\u000e~h5|\b", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "Adc\u001ca\u0017Ha\u001d\u000e~h5|\b", "BqPCX9LS~~\u000f", "", "5dc!e(OS&\rzD,\u0011", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "=m5<V<L0#\u000f\u0004]:Z\f+n\u0002(z", "4nRBf,=0#\u000f\u0004]:", "\"qPCX9LS~~\u000f", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FocusedBoundsObserverNode extends Modifier.Node implements TraversableNode {
    private Function1<? super LayoutCoordinates, Unit> onPositioned;
    private final Object traverseKey = TraverseKey;
    public static final TraverseKey TraverseKey = new TraverseKey(null);
    public static final int $stable = 8;

    public final Function1<LayoutCoordinates, Unit> getOnPositioned() {
        return this.onPositioned;
    }

    public final void setOnPositioned(Function1<? super LayoutCoordinates, Unit> function1) {
        this.onPositioned = function1;
    }

    public FocusedBoundsObserverNode(Function1<? super LayoutCoordinates, Unit> function1) {
        this.onPositioned = function1;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    public final void onFocusBoundsChanged(LayoutCoordinates layoutCoordinates) {
        this.onPositioned.invoke(layoutCoordinates);
        FocusedBoundsObserverNode focusedBoundsObserverNode = (FocusedBoundsObserverNode) TraversableNodeKt.findNearestAncestor(this);
        if (focusedBoundsObserverNode != null) {
            focusedBoundsObserverNode.onFocusBoundsChanged(layoutCoordinates);
        }
    }

    /* JADX INFO: compiled from: FocusedBounds.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0004Gّ1!Ǟr~P+R|\rfʴ=0Re߲2S"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0006?W\u000e.7lr8]L:y\u001e\u001b#hnJ\u0007p\u0015Xu'\u0006;[(mR\u007fK\u0014wZ\"$", "", "u(E", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class TraverseKey {
        public /* synthetic */ TraverseKey(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TraverseKey() {
        }
    }
}
