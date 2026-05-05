package androidx.compose.animation;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: SharedContentNode.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0017\u007f\u0007tsAӄLeV\u008cZݷ2\u000fy\u0002<řc$\u007fOC٥\"}0\tWNmgvJp\u000bKƤ\fǞ~\u0001ߚy[\t_\"\u000f`B\u001e>sX\u007fAGa\r63\"ݨ&8\b\bI!8N(v)E\u0012ď\u0013xQ~Aj\r{ĨJ\u0018\f>.\u00026\\\u0016P|զk&@=+\u001bipNmsx\u000e[\u0016^TU\u0017'g,6X9K\u0014S_I߮S$F\u0011L\n=3vmާ*\u0012zeEp\u007fB%q͔\f&\u00014m\u001dQ\u000f\u001eW/]vcP<(>\u000fD\u0017J\u0018&\u0006UZV-H{N\"\u0004\u0004\u0001TXP0`۰\u0004\u0001iا/'\u000679>Ӿjg"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f\u0014w&7LQ$u3\u001etoaA\u0007l;$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uFu)6]}- w\u0015.-J;s4'$>", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f\u0014w&7LQ$u3\u001ej", "AgP?X+\u001eZ\u0019\u0007zg;j\u0018+t\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f\u0017t\u00166MLJO=-\u0015uj5\u000eQ;J\u0006'\u001d", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u00138U\u000b 6M\u001d.UCDz\u0018'$hnB\u0003j\u001a]r6G\"\u0012\u001d", "5dc [(KS\u0018^\u0002^4|\u0012>S\u000f$\u000b@", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn#\\y-7lu5MK;tC\u0002\u001ewaF\u0010_3<\u0006#VL$", "1n\\=b5>\\(J", "1n_F", "1qT.g,", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "CoS.g,", "", "<nS2", "7mb=X*MO\u0016\u0006zI9\u0007\u0014/r\u000f,{N", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SharedBoundsNodeElement extends ModifierNodeElement<SharedBoundsNode> {
    public static final int $stable = 0;
    private final SharedElementInternalState sharedElementState;

    public static /* synthetic */ SharedBoundsNodeElement copy$default(SharedBoundsNodeElement sharedBoundsNodeElement, SharedElementInternalState sharedElementInternalState, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            sharedElementInternalState = sharedBoundsNodeElement.sharedElementState;
        }
        return sharedBoundsNodeElement.copy(sharedElementInternalState);
    }

    public final SharedElementInternalState component1() {
        return this.sharedElementState;
    }

    public final SharedBoundsNodeElement copy(SharedElementInternalState sharedElementInternalState) {
        return new SharedBoundsNodeElement(sharedElementInternalState);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SharedBoundsNodeElement) && Intrinsics.areEqual(this.sharedElementState, ((SharedBoundsNodeElement) obj).sharedElementState);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.sharedElementState.hashCode();
    }

    public String toString() {
        return "SharedBoundsNodeElement(sharedElementState=" + this.sharedElementState + ')';
    }

    public final SharedElementInternalState getSharedElementState() {
        return this.sharedElementState;
    }

    public SharedBoundsNodeElement(SharedElementInternalState sharedElementInternalState) {
        this.sharedElementState = sharedElementInternalState;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SharedBoundsNode create() {
        return new SharedBoundsNode(this.sharedElementState);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SharedBoundsNode sharedBoundsNode) {
        sharedBoundsNode.setState$animation_release(this.sharedElementState);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("sharedBounds");
        inspectorInfo.getProperties().set("sharedElementState", this.sharedElementState);
    }
}
