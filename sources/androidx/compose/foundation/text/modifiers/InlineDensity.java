package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
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
/* JADX INFO: compiled from: InlineDensity.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLш|\u0004O\u000b8\u000b4C\u0007\"B\u0012\u007f\u0007ljA0RlP.XV2\u000fy\u0005<$a&yCI[\"}(\nWNusvJ`\rIƦD,ю\tFyU'\\J\u000eL\u0003\u0007EG]sK9xtd\u0006060:\u0012\u0005/\u001bݵL\u0012|}QOL!6T\u0001>`\re\u0005H\u0017ĂB\"\u0007!jm\u000fENlm>=*\u001bipVϮc2\u0003P\u001bO\u001d?\u001b\u0004y\u001eYNg;#4k\u0005\u001dQ\n>Iԡrݘ\tj-79Z<eDj\u0018\u0014C>\u0016֬\\ę*^\u000ben!o8]ycP<?>\u000fԫ\u0011>\n&\u0014@\u0019=;\u001a~\b<4+7ՂDT\u001a`H\n\tl\u0007&3\u0002K+g\u001c\u001d\u0016ň?\u001df9\u0002\u0011\u001b)s\r|(sT<hkÔVɐU1Y̵\u05c9GU˶X=\u001c\f\u0378f\u001d"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBgxqh=\u0010c\u000bN\u007f5K[b\u0002", "", "2d]@\\;R", "", "4n]AF*:Z\u0019", "1n]@g9NQ(\t\b&0\u0005\u00146", "uE5u=", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001bv.C]\r4\r1z", ">`R8X+/O \u000fz", "", "uI\u0018\u0017", "5dc\u0011X5LW(\u0013Bb4\b\u0010", "uI\u0018\u0013", "5dc\u0013b5MA\u0017z\u0002^s\u0001\u0011:l", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "", "6`b566=S`\u0003\u0003i3", "uI\u0018\u0016", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uI\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "\u0011n\\=T5B]\"", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class InlineDensity {
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = m1626constructorimpl(Float.NaN, Float.NaN);
    private final long packedValue;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ InlineDensity m1625boximpl(long j2) {
        return new InlineDensity(j2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static long m1627constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1629equalsimpl(long j2, Object obj) {
        return (obj instanceof InlineDensity) && j2 == ((InlineDensity) obj).m1635unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1630equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1633hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    public boolean equals(Object obj) {
        return m1629equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m1633hashCodeimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m1635unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ InlineDensity(long j2) {
        this.packedValue = j2;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m1628constructorimpl(Density density) {
        return m1626constructorimpl(density.getDensity(), density.getFontScale());
    }

    public String toString() {
        return m1634toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1634toStringimpl(long j2) {
        return "InlineDensity(density=" + m1631getDensityimpl(j2) + ", fontScale=" + m1632getFontScaleimpl(j2) + ')';
    }

    /* JADX INFO: compiled from: InlineDensity.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005$2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005;i%\nCiWܵ|̝\u0093NM˗kvRZ\u0019H'\b\u001c{x0ղU\u0002e\u0015\u0015̒^\u001e>;Mu\\ˉdz"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBgxqh=\u0010c\u000bN\u007f5K[bj:\\zH\u0010\u001b^\u0018W\u0001", "", "u(E", "#mb=X*BT\u001d~y", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBgxqh=\u0010c\u000bN\u007f5K[b\u0002", "5dc\"a:IS\u0017\u0003{b,{P\u00162P\u0006^Q\u000f", "u(9", "\u0018", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getUnspecified-L26CHvs, reason: not valid java name */
        public final long m1636getUnspecifiedL26CHvs() {
            return InlineDensity.Unspecified;
        }
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m1626constructorimpl(float f2, float f3) {
        return m1627constructorimpl(((-1) - (((-1) - ((long) Float.floatToRawIntBits(f3))) | ((-1) - 4294967295L))) | (Float.floatToRawIntBits(f2) << 32));
    }

    /* JADX INFO: renamed from: getDensity-impl, reason: not valid java name */
    public static final float m1631getDensityimpl(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    /* JADX INFO: renamed from: getFontScale-impl, reason: not valid java name */
    public static final float m1632getFontScaleimpl(long j2) {
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }
}
