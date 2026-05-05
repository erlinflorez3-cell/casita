package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
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
/* JADX INFO: compiled from: NodeKind.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&˛\bDRш|İI\u0006>\u00116B\u0005%4\u0012\u0006\u0010nj?8LeV:ZS0\u0010qږr:ӋLsIПc\u0019.\"7O\u000ftwrX[#C=\bȀ|l2Lc|&*\u001d9Zom;}uKBxvL\u0004N2hٗzڱ\u0005\u001c0R\u001e\u0002CQY\u0018*0nr\u0001ż\f̂\t\u001c\u0018\u0013L$I;juf6vn\u000eB=,\u001bmRN-`^ŧ\u0014μPŏ&˙țe 1OEE];a\u0011\u001fR\nA3C\u007fF\u001dhU)qɥ}ɱ:Z\u0006%#;\u0018\u001bk\u0005>\\3d'ц&˦SeQd\u001c=H\n\n\u000eT\u0004<\bόL45Կ~\n\u00148\u0003xԨ?Q؟^G\b}gى3S~ĺ/O"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u001b]\u0007\u001f\r", "\"", "", ";`b8", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uH\u0018\u0016", "5dc\u001aT:D", "u(8", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "=q", "=q\u001c\u0015,wO]vb", "uH8u<", "=q\u001c6`7E", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class NodeKind<T> {
    private final int mask;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ NodeKind m5748boximpl(int i2) {
        return new NodeKind(i2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> int m5749constructorimpl(int i2) {
        return i2;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m5750equalsimpl(int i2, Object obj) {
        return (obj instanceof NodeKind) && i2 == ((NodeKind) obj).m5756unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5751equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m5752hashCodeimpl(int i2) {
        return Integer.hashCode(i2);
    }

    /* JADX INFO: renamed from: or-H91voCI, reason: not valid java name */
    public static final int m5753orH91voCI(int i2, int i3) {
        return (-1) - (((-1) - i2) & ((-1) - i3));
    }

    /* JADX INFO: renamed from: or-impl, reason: not valid java name */
    public static final int m5754orimpl(int i2, int i3) {
        return (-1) - (((-1) - i2) & ((-1) - i3));
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m5755toStringimpl(int i2) {
        return "NodeKind(mask=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m5750equalsimpl(this.mask, obj);
    }

    public int hashCode() {
        return m5752hashCodeimpl(this.mask);
    }

    public String toString() {
        return m5755toStringimpl(this.mask);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5756unboximpl() {
        return this.mask;
    }

    private /* synthetic */ NodeKind(int i2) {
        this.mask = i2;
    }

    public final int getMask() {
        return this.mask;
    }
}
