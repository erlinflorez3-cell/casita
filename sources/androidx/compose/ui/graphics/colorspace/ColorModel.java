package androidx.compose.ui.graphics.colorspace;

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
/* JADX INFO: compiled from: ColorModel.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O\r8\u000b4C\u0007\":\u0018\u007f\u0007lmA0RnP.XW2\u000fy\b<$a&wٙykڼ\u001c79O|f m_\u001b\u001aIƤ\u0016\u001a\u0007jDI\u0004yٕ\u0016\u00118D}B{e}GQ`#A5&@.P{\u001b\u007fH)\u000fȌwټGM\u0012\u001f>N9H`\u001ce\u0005H\u0017L͛\u001fӘ\"^m^DQ5jH@;\u0003\u0018T\u0015;ۢ4~S Thw%\u0005e6+n<kZ{ٍ\u0005\u07baVeO\u0005EwK\f\u0001)-3W|(Bf\u007f,\u0015YPcƟt͉`\u0005YӠϸ&+եbK~\u000f߳{\u0011"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005I>%\u001fuIC\u0006c3$", "", ">`R8X+/O \u000fz", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uI\u0018\u0017", "1n\\=b5>\\(\\\u0005n5\f", "", "5dc\u0010b4I]\"~\u0004m\n\u0007\u00198t>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "u(E", "5dc\u0010b4I]\"~\u0004m\n\u0007\u00198tG,\u0004K\b", "uI\u0018\u0016", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uI\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "\u0011n\\=T5B]\"", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class ColorModel {
    private static final long Cmyk;
    public static final Companion Companion = new Companion(null);
    private static final long Lab;
    private static final long Rgb;
    private static final long Xyz;
    private final long packedValue;

    /* JADX INFO: renamed from: box-impl */
    public static final /* synthetic */ ColorModel m4582boximpl(long j2) {
        return new ColorModel(j2);
    }

    /* JADX INFO: renamed from: constructor-impl */
    public static long m4583constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: equals-impl */
    public static boolean m4584equalsimpl(long j2, Object obj) {
        return (obj instanceof ColorModel) && j2 == ((ColorModel) obj).m4589unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0 */
    public static final boolean m4585equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    public static /* synthetic */ void getComponentCount$annotations() {
    }

    /* JADX INFO: renamed from: getComponentCount-impl */
    public static final int m4586getComponentCountimpl(long j2) {
        return (int) (j2 >> 32);
    }

    /* JADX INFO: renamed from: hashCode-impl */
    public static int m4587hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    public boolean equals(Object obj) {
        return m4584equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m4587hashCodeimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl */
    public final /* synthetic */ long m4589unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ ColorModel(long j2) {
        this.packedValue = j2;
    }

    /* JADX INFO: compiled from: ColorModel.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005*2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005;i%\nCiWܵ|̝\u0093NM˗kvRZ\u0019H'\b\u001c{x0\u001al\u0007c*\u000f`DƜ>\u074c߲n<˃d|>\u0005.7::\u007f\f\u000f\u001ez_\u001e~\u0013Cy\u000eݮ/ϋú9QҫQ\r\"\u0012\u0014C8\u0003$euR\u0007_zgR/Q\u0005\u07bcA÷ф^/ƊQ\u0015NT5\u0012\u000fc$6N;ߑ\u0015.[\u0006\rҚwm\u0002GqC$ػ+3"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005I>%\u001fuIC\u0006c3\rT1OWJ5`\\{\u0013", "", "u(E", "\u0011lh8", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005I>%\u001fuIC\u0006c3$", "5dc\u0010`@D\u001b,}\u0005P!m\u001b", "u(9", "\u0018", "\u001a`Q", "5dc\u0019T)\u0006f\u0018\tlS\u001d\u000f", " fQ", "5dc\u001fZ)\u0006f\u0018\tlS\u001d\u000f", "&xi", "5dc%lA\u0006f\u0018\tlS\u001d\u000f", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getRgb-xdoWZVw */
        public final long m4592getRgbxdoWZVw() {
            return ColorModel.Rgb;
        }

        /* JADX INFO: renamed from: getXyz-xdoWZVw */
        public final long m4593getXyzxdoWZVw() {
            return ColorModel.Xyz;
        }

        /* JADX INFO: renamed from: getLab-xdoWZVw */
        public final long m4591getLabxdoWZVw() {
            return ColorModel.Lab;
        }

        /* JADX INFO: renamed from: getCmyk-xdoWZVw */
        public final long m4590getCmykxdoWZVw() {
            return ColorModel.Cmyk;
        }
    }

    static {
        long j2 = 3;
        long j3 = j2 << 32;
        long j4 = 0;
        Rgb = m4583constructorimpl(((j4 + 4294967295L) - (j4 | 4294967295L)) | j3);
        long j5 = (-1) - (((-1) - ((long) 1)) | ((-1) - 4294967295L));
        Xyz = m4583constructorimpl((j5 + j3) - (j5 & j3));
        long j6 = 2;
        Lab = m4583constructorimpl(j3 | ((j6 + 4294967295L) - (j6 | 4294967295L)));
        Cmyk = m4583constructorimpl(((j2 + 4294967295L) - (j2 | 4294967295L)) | (((long) 4) << 32));
    }

    public String toString() {
        return m4588toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: toString-impl */
    public static String m4588toStringimpl(long j2) {
        return m4585equalsimpl0(j2, Rgb) ? "Rgb" : m4585equalsimpl0(j2, Xyz) ? "Xyz" : m4585equalsimpl0(j2, Lab) ? "Lab" : m4585equalsimpl0(j2, Cmyk) ? "Cmyk" : "Unknown";
    }
}
