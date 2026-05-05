package androidx.compose.animation.core;

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
/* JADX INFO: compiled from: SpringSimulation.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004O\r8\u000b4E\u0007\":\u0017\u007f\u0007lpA0RnP.XU2\u000fy\u0002<$a%yCIa\"}(\nUȠ&}ñzZ9BO\u0013&|x,aU'^ܫ\u00134HqM6\u0016\u0015KExtdӌP8(8\b\u000b\u0019\u001aXO@|\u0001CY\u0016*0nwŦQ҈͘\u0004\u0019Ū\n@&\u000e,j0fDW\u0005]h?S\twSf)u/+LSіUܮ\u0011xg09S\u007fC#9k\u00035g\"Ё\u0002ӭu?\u000b~5>sW\u0002oNX.-[ܗNոat,v\u0013l1\u001b5+gcyQˎ,}\u0003Ԉ%>\n\u0012\u0014,\u0019=; ~\b<:+7ՂDT\u001a`H\b\tj\u0007&3\nK+g\"\u001d\u0016ň?\u001df9\u0002\u0010\u001b'ŉ\u007fnĒ[]\u0016`\u001b:\\zWŚmn<˙R&"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\bA|\u001a8V\u0019", "", ">`R8X+/O \u000fz", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uI\u0018\u0017", "5dc\u001dT*DS\u0018ove<|", "u(9", "D`[BX", "", "5dc#T3NS`\u0003\u0003i3", "uI\u0018\u0013", "Dd[<V0Mg", "5dc#X3HQ\u001d\u000e\u000f&0\u0005\u00146", "1n_F", "1n_F \u001f\u001b'\u0019j\u0004N", "uI5\u0013\u001c\u0011", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "", "6`b566=S`\u0003\u0003i3", "uI\u0018\u0016", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uI\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class Motion {
    private final long packedValue;

    /* JADX INFO: renamed from: box-impl */
    public static final /* synthetic */ Motion m495boximpl(long j2) {
        return new Motion(j2);
    }

    /* JADX INFO: renamed from: constructor-impl */
    public static long m496constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: equals-impl */
    public static boolean m499equalsimpl(long j2, Object obj) {
        return (obj instanceof Motion) && j2 == ((Motion) obj).m505unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0 */
    public static final boolean m500equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* JADX INFO: renamed from: hashCode-impl */
    public static int m503hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    /* JADX INFO: renamed from: toString-impl */
    public static String m504toStringimpl(long j2) {
        return "Motion(packedValue=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return m499equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m503hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m504toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl */
    public final /* synthetic */ long m505unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ Motion(long j2) {
        this.packedValue = j2;
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: copy-XB9eQnU */
    public static final long m497copyXB9eQnU(long j2, float f2, float f3) {
        return SpringSimulationKt.Motion(f2, f3);
    }

    /* JADX INFO: renamed from: copy-XB9eQnU$default */
    public static /* synthetic */ long m498copyXB9eQnU$default(long j2, float f2, float f3, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            f2 = m501getValueimpl(j2);
        }
        if ((i2 & 2) != 0) {
            f3 = m502getVelocityimpl(j2);
        }
        return m497copyXB9eQnU(j2, f2, f3);
    }

    /* JADX INFO: renamed from: getValue-impl */
    public static final float m501getValueimpl(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    /* JADX INFO: renamed from: getVelocity-impl */
    public static final float m502getVelocityimpl(long j2) {
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }
}
