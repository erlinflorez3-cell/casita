package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import java.util.Set;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: LayoutCoordinates.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4K\u0007\":2\u007f\u0007|jA0JfP.hS2\u000fq|<$i*yCAU\"}8\tWNmhvJp\u000bK\u000f\f&\u0001j:I]ތe\u0012%2JoE:STSʠ\u0011td\u0004hA0M\u0012\u0005/0ZL\u001e\u000e\u0013Cy\u001aXغ@9R`%e\u0005H+6B.\u001b6\\\u0016ޮfNr]HJ;\u0003\u0018C\u0015K(P\u000bi%F\u0003D=zo8C@eߎE)a!\u001fR\n\\Icҵ<ݛص+)1h\u0002w~\u0005\u000e0-+}*\u000ev4v\u001dQ\u000fϯW1UcYn&(&\u0018,\u0013B\u0004\u001c'?H\\.`zܕ\rޗϢvUFr\u0010\u0002\u000b\u0018\t\u0006N\u0017S\u001dc/G@~Q\u0010X_rӒz˜ڟ\"%\u0007\u0015/\u0003\u001d&n=3T&naUNb`N8v\u0004\u0002ׇoç͆.\u00066p\u000eVD)<A=7\nVS%y'`D\u0016\u0014K\u0005ŞR֟ʐLB(\u001a$^r!\u001a\u0007\\d3\t\u0001XfY)MJqM\u0012ު\u0012\u05feϢ{>'S\u001eu\u0018\tw\u001ae]8U_jEs\u0007k<ãibAfic>\u0014\u0019\u000bޖ>ֺИ\tZlua@#t6WJH\u0019@(\u007fR\u007f$\u0013`q80ڲ+ջǬ`\u0017N9,y\n\u0015\u0017\u0018rh>\u001c\u000572<\u0002$#&Gt̍oבς|K27nI}Y_51&\u0004#\u001f\tSɔ\tҋw\nWiRIZo.w[\u007f.\u001bjI_5U\u0013=\u007f\u007fɬ\u0004βIP\u000bgWS ,K\u000f\b\u0016SjDf6ξGށbʧNSl\u0019(~l{s\u001ar\n\u0012c\\yuϊ+ߓ]ƏMv\u001b[BYF\u0006U5,1\u0019u2~E-q5K#Nӈ1ֵea\u0002q4\tp\u001fv\u000bs\u0015DcD\u00029к_ҟ:ַͯX}й&(\u0005\u0005H[x\f\u06ddA\tͬ\rBPDjއrfL\u0013/\u0004\u0006\u000f.\u0013\u0010\u0005Zǎ\u0017+Й8/"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "", "7mc?b+NQ\u0019\rbh;\u0001\u00138F\r$\u0004@j\u0018\u0004Gp\u000eIv.3Y", "", "5dc\u0016a;K]\u0018\u000fx^:d\u0013>i\n1\\M|\u001f\u00171pz<w%BY\u0007\u001e7,\u00127VMJgC\"\u001fqo", "u(E", "5dc\u0016a;K]\u0018\u000fx^:d\u0013>i\n1\\M|\u001f\u00171pz<w%BY\u0007\u001e7", "u(I", "7r0Ag(<V\u0019}", ">`a2a;\u001c]#\fyb5x\u0018/s", "5dc\u001dT9>\\(\\\u0005h9{\r8a\u000f(\n", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001cU\u0012*G|s8WP:o=\u001a$ho\u000f", ">`a2a;%O-\t\u000bm\n\u0007\u0013<d\u00041wO\u0001%", "5dc\u001dT9>\\(evr6\r\u0018\ro\n5zD\n\u0013&G}", ">q^C\\+>Rt\u0006~`5\u0005\t8tf,\u0005@\u000f", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", "5dc\u001de6OW\u0018~y:3\u0001\u000b8m\u007f1\u000b'\u0005 \u0017U", "u(;7T=:\u001d)\u000e~euj\t>;", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "5dc \\A>\u001b\r{\u000ff\u0013I\u000b", "u(9", "5dc", "", "/kX4a4>\\(e~g,", ":nR._\tHc\"}~g.Y\u0013BO\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "And?V,\u001c]#\fyb5x\u0018/s", "1kX=56N\\\u0018\r", ":nR._\u0017Ha\u001d\u000e~h5f\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "@d[.g0OS\b\thh<\n\u0007/", ":nR._\u0017Ha\u001d\u000e~h5f\nvRO\u0007{\u0012Pr", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\f1m\b0FK 8ZB?t0-\u0015v7\u001eJH", "7mR9h+>;#\u000e~h5]\u0016+m\u007f\u0012|-\u0001\u0018\u0017To\u0017:v", ":nR._\u0017Ha\u001d\u000e~h5f\nvSy\u0011\u0006<a\u0007", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\f1m\b0FK 8ZB?t0-\u0015v7\u001e{'\u0011", ":nR._\u001bH@#\t\n", "@d[.g0OS\b\tah*x\u0010", ":nR._\u001bH@#\t\n&\u0014bP\u0012zS\u0018", "uI\u0018\u0017", ":nR._\u001bHA\u0017\fz^5", ":nR._\u001bHA\u0017\fz^5Dp\u0015-b=O0", ":nR._\u001bHE\u001d\byh>", ":nR._\u001bHE\u001d\byh>Dp\u0015-b=O0", "Aba2X5-]\u007f\txZ3", "@d[.g0OS\b\th\\9|\t8", "Aba2X5-]\u007f\txZ3Dp\u0015-b=O0", "BqP;f-H`!_\bh4", "", ";`c?\\?", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001dU\r-;\u0001k", "BqP;f-H`!_\bh4Dh\u00168\\\u0017\u007f\u0013", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\f1m\b0FK 8ZB?t0-\u0015v7/g'\u001d", "BqP;f-H`!m\u0005L*\n\t/n", "BqP;f-H`!m\u0005L*\n\t/nGwN=f\u0014\tE", "uZ5uI", "Eh]1b>-]\u007f\txZ3", "@d[.g0OS\b\tlb5{\u0013A", "Eh]1b>-]\u007f\txZ3Dp\u0015-b=O0", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface LayoutCoordinates {
    int get(AlignmentLine alignmentLine);

    default boolean getIntroducesMotionFrameOfReference() {
        return false;
    }

    LayoutCoordinates getParentCoordinates();

    LayoutCoordinates getParentLayoutCoordinates();

    Set<AlignmentLine> getProvidedAlignmentLines();

    /* JADX INFO: renamed from: getSize-YbymL2g */
    long mo5522getSizeYbymL2g();

    boolean isAttached();

    Rect localBoundingBoxOf(LayoutCoordinates layoutCoordinates, boolean z2);

    /* JADX INFO: renamed from: localPositionOf-R5De75A */
    long mo5523localPositionOfR5De75A(LayoutCoordinates layoutCoordinates, long j2);

    /* JADX INFO: renamed from: localToRoot-MK-Hz9U */
    long mo5525localToRootMKHz9U(long j2);

    /* JADX INFO: renamed from: localToWindow-MK-Hz9U */
    long mo5527localToWindowMKHz9U(long j2);

    /* JADX INFO: renamed from: windowToLocal-MK-Hz9U */
    long mo5531windowToLocalMKHz9U(long j2);

    /* JADX INFO: compiled from: LayoutCoordinates.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        public static /* synthetic */ void getIntroducesMotionFrameOfReference$annotations() {
        }

        @Deprecated
        public static boolean getIntroducesMotionFrameOfReference(LayoutCoordinates layoutCoordinates) {
            return LayoutCoordinates.super.getIntroducesMotionFrameOfReference();
        }

        @Deprecated
        /* JADX INFO: renamed from: screenToLocal-MK-Hz9U */
        public static long m5535screenToLocalMKHz9U(LayoutCoordinates layoutCoordinates, long j2) {
            return LayoutCoordinates.super.mo5528screenToLocalMKHz9U(j2);
        }

        @Deprecated
        /* JADX INFO: renamed from: localToScreen-MK-Hz9U */
        public static long m5534localToScreenMKHz9U(LayoutCoordinates layoutCoordinates, long j2) {
            return LayoutCoordinates.super.mo5526localToScreenMKHz9U(j2);
        }

        @Deprecated
        /* JADX INFO: renamed from: localPositionOf-S_NoaFU */
        public static long m5532localPositionOfS_NoaFU(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j2, boolean z2) {
            return LayoutCoordinates.super.mo5524localPositionOfS_NoaFU(layoutCoordinates2, j2, z2);
        }

        @Deprecated
        /* JADX INFO: renamed from: transformFrom-EL8BTi8 */
        public static void m5536transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, float[] fArr) {
            LayoutCoordinates.super.mo5529transformFromEL8BTi8(layoutCoordinates2, fArr);
        }

        @Deprecated
        /* JADX INFO: renamed from: transformToScreen-58bKbWc */
        public static void m5537transformToScreen58bKbWc(LayoutCoordinates layoutCoordinates, float[] fArr) {
            LayoutCoordinates.super.mo5530transformToScreen58bKbWc(fArr);
        }
    }

    /* JADX INFO: renamed from: screenToLocal-MK-Hz9U */
    default long mo5528screenToLocalMKHz9U(long j2) {
        return Offset.Companion.m3952getUnspecifiedF1C5BW0();
    }

    /* JADX INFO: renamed from: localToScreen-MK-Hz9U */
    default long mo5526localToScreenMKHz9U(long j2) {
        return Offset.Companion.m3952getUnspecifiedF1C5BW0();
    }

    /* JADX INFO: renamed from: localPositionOf-S_NoaFU$default */
    static /* synthetic */ long m5521localPositionOfS_NoaFU$default(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j2, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localPositionOf-S_NoaFU");
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            j2 = Offset.Companion.m3953getZeroF1C5BW0();
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            z2 = true;
        }
        return layoutCoordinates.mo5524localPositionOfS_NoaFU(layoutCoordinates2, j2, z2);
    }

    /* JADX INFO: renamed from: localPositionOf-S_NoaFU */
    default long mo5524localPositionOfS_NoaFU(LayoutCoordinates layoutCoordinates, long j2, boolean z2) {
        throw new UnsupportedOperationException("localPositionOf is not implemented on this LayoutCoordinates");
    }

    static /* synthetic */ Rect localBoundingBoxOf$default(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            z2 = true;
        }
        return layoutCoordinates.localBoundingBoxOf(layoutCoordinates2, z2);
    }

    /* JADX INFO: renamed from: transformFrom-EL8BTi8 */
    default void mo5529transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, float[] fArr) {
        throw new UnsupportedOperationException("transformFrom is not implemented on this LayoutCoordinates");
    }

    /* JADX INFO: renamed from: transformToScreen-58bKbWc */
    default void mo5530transformToScreen58bKbWc(float[] fArr) {
        throw new UnsupportedOperationException("transformToScreen is not implemented on this LayoutCoordinates");
    }
}
