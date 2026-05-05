package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.Set;
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
/* JADX INFO: compiled from: LookaheadLayoutCoordinates.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я^\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007lkA0RnP.XW2\u000f\u0002{<$a*yCIu\"}8\tWNmhvJp\u000bK\u000f\f\u0016\u0001j:O]xc\u0012\u00172XoG3S\u0003E9nt>ӌ(288\u0002\u0005\u0007!0Ϻ&͌+Cy\u000bR;PtHR%M3\u001bŪ\n>.\u0003fkumNH\u001b}j31$\u0002B|@&ܵ|\u0016#Tv?\r%\u0005N/N[M\u0015SR3\u000b`\u0001W\u0003my\u0004\u00191G5Qas\u0006E\t\u0004\"9CO;\\#*j,i`:6qcԣJִˎ,y\u0001$\u001beL6\u0014M`.[)\u0017\f\u001cW\rr\u0002?\u0001\u0006li\u0018z\u0010EG)\u000e]C9In\u0018uߛ\u0018\u05cbѼ\u007f\u0007\u0013I1-79i\u0002&`C*\u0005{__i@kW\u0015\u001e֨<Чձtd\bY\u0012`\u0010\u0018=-).E4g_GQ9k0W\u000b{ѱ\u0004\u009bĈWkXzNR7.E]!\f\tS\u0015\ty~lXZ \u00140Ϻ\u0006âݔ\u0017\"b,JQm(\\\u0005\u0001i\u0019\\\u000e\u000e3e~7\b}2\"Ŝ8Ӕۋ9SiGo\u0003?4Mtz\u0005\u0007 rW\u001a~t(P1xn\u001e2\u0014D|GYFǦpʉٜ03\u001f\u0019#\u0006K6P\u007f\u0015\t\u000e\u0014\u0019\u0014\r\u000fK$1%j\tנ\u007fˆʷtqm8WlEx0nYQc(VY0+L|Q\u0016E\bŋFх֙KNrY\u0004\u0006L/$\u001dQQ]AISɒ-6\u001a/KQ\u0001k\"_ .\u0013|(\u0017q=\u0005ԭ\nϡt0xlPXb!r\tl};\b\u0013\b06\u001dۀIϭX\u000fs@O}\u0011c\r]F|\u001d\u001fL&˽s(\u0005ކEE-)$\u0005dG#oui\u001e=0#eձvѺ\u0003Ϻќ\u0015n͈UaJ=>Yg\u0010\u000f62~\u001bD^i&\u0007x]\u000bٖ5ȈEh\tX>`\u0019CNz\u0015A%rlZh\u0012&R\u000bʴaͫwG\u0016\u0016dY3%\u001eku\u0005\u0006Ql\rZ\u000f8$*I%frݒ\"ݫ[f!2\f\u000e&Q\u0012Sp!T\tRQb\u0011^\u0558EԆhвڄy~ʮc\u0013/4H\u0012Ig\u0558T\u0002dYNϕ|s_)*\u0007\u001eܙ7b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]/?_y#7i\u0015\u0015IWE{C{\u001frn8\u000bl(]v5\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", ":n^8T/>O\u0018]ze,~\u0005>e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9tF\u0001+1\\}\u001c6L\u00165ME7z4s", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW#\u0001/;U\u0001 3lt.TC=gC\u001ej,R", "1n^?W0GO(\t\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u0013c\b-6q\u001f*\\MHA", "5dc\u0010b6KR\u001d\bvm6\n", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006_/4Y[*Az\u00152V?JuAs", "7mc?b+NQ\u0019\rbh;\u0001\u00138F\r$\u0004@j\u0018\u0004Gp\u000eIv.3Y", "", "5dc\u0016a;K]\u0018\u000fx^:d\u0013>i\n1\\M|\u001f\u00171pz<w%BY\u0007\u001e7", "u(I", "7r0Ag(<V\u0019}", "5dc\u0019b6DO\u001c~v]\u000b|\u0010/g{7{", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]/?_y#7i\u0015\rMJ;m0-\u0015>", ":n^8T/>O\u0018h{_:|\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "5dc\u0019b6DO\u001c~v]\u0016}\n=e\u000fo\\\f^fs9:", "u(9", ">`a2a;\u001c]#\fyb5x\u0018/s", "5dc\u001dT9>\\(\\\u0005h9{\r8a\u000f(\n", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001cU\u0012*G|s8WP:o=\u001a$ho\u000f", ">`a2a;%O-\t\u000bm\n\u0007\u0013<d\u00041wO\u0001%", "5dc\u001dT9>\\(evr6\r\u0018\ro\n5zD\n\u0013&G}", ">q^C\\+>Rt\u0006~`5\u0005\t8tf,\u0005@\u000f", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", "5dc\u001de6OW\u0018~y:3\u0001\u000b8m\u007f1\u000b'\u0005 \u0017U", "u(;7T=:\u001d)\u000e~euj\t>;", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "5dc \\A>\u001b\r{\u000ff\u0013I\u000b", "5dc", "", "/kX4a4>\\(e~g,", ":nR._\tHc\"}~g.Y\u0013BO\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "And?V,\u001c]#\fyb5x\u0018/s", "1kX=56N\\\u0018\r", ":nR._\u0017Ha\u001d\u000e~h5f\n", "@d[.g0OS\b\thh<\n\u0007/", ":nR._\u0017Ha\u001d\u000e~h5f\nvRO\u0007{\u0012Pr", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\f1m\b0FK 8ZB?t0-\u0015v7\u001eJH", "7mR9h+>;#\u000e~h5]\u0016+m\u007f\u0012|-\u0001\u0018\u0017To\u0017:v", ":nR._\u0017Ha\u001d\u000e~h5f\nvSy\u0011\u0006<a\u0007", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\f1m\b0FK 8ZB?t0-\u0015v7\u001e{'\u0011", ":nR._\u001bH@#\t\n", "@d[.g0OS\b\tah*x\u0010", ":nR._\u001bH@#\t\n&\u0014bP\u0012zS\u0018", "uI\u0018\u0017", ":nR._\u001bHA\u0017\fz^5", ":nR._\u001bHA\u0017\fz^5Dp\u0015-b=O0", ":nR._\u001bHE\u001d\byh>", ":nR._\u001bHE\u001d\byh>Dp\u0015-b=O0", "Aba2X5-]\u007f\txZ3", "@d[.g0OS\b\th\\9|\t8", "Aba2X5-]\u007f\txZ3Dp\u0015-b=O0", "BqP;f-H`!_\bh4", "", ";`c?\\?", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001dU\r-;\u0001k", "BqP;f-H`!_\bh4Dh\u00168\\\u0017\u007f\u0013", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\f1m\b0FK 8ZB?t0-\u0015v7/g'\u001d", "BqP;f-H`!m\u0005L*\n\t/n", "BqP;f-H`!m\u0005L*\n\t/nGwN=f\u0014\tE", "uZ5uI", "Eh]1b>-]\u007f\txZ3", "@d[.g0OS\b\tlb5{\u0013A", "Eh]1b>-]\u007f\txZ3Dp\u0015-b=O0", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LookaheadLayoutCoordinates implements LayoutCoordinates {
    public static final int $stable = 0;
    private final LookaheadDelegate lookaheadDelegate;

    public LookaheadLayoutCoordinates(LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    public final LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    public final NodeCoordinator getCoordinator() {
        return this.lookaheadDelegate.getCoordinator();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: getSize-YbymL2g */
    public long mo5522getSizeYbymL2g() {
        LookaheadDelegate lookaheadDelegate = this.lookaheadDelegate;
        return IntSizeKt.IntSize(lookaheadDelegate.getWidth(), lookaheadDelegate.getHeight());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        return getCoordinator().getProvidedAlignmentLines();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public LayoutCoordinates getParentLayoutCoordinates() {
        LookaheadDelegate lookaheadDelegate;
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(NodeCoordinator.ExpectAttachedLayoutCoordinates);
        }
        NodeCoordinator wrappedBy$ui_release = getCoordinator().getLayoutNode().getOuterCoordinator$ui_release().getWrappedBy$ui_release();
        if (wrappedBy$ui_release == null || (lookaheadDelegate = wrappedBy$ui_release.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.getCoordinates();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public LayoutCoordinates getParentCoordinates() {
        LookaheadDelegate lookaheadDelegate;
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(NodeCoordinator.ExpectAttachedLayoutCoordinates);
        }
        NodeCoordinator wrappedBy$ui_release = getCoordinator().getWrappedBy$ui_release();
        if (wrappedBy$ui_release == null || (lookaheadDelegate = wrappedBy$ui_release.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.getCoordinates();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return getCoordinator().isAttached();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean getIntroducesMotionFrameOfReference() {
        return this.lookaheadDelegate.isPlacedUnderMotionFrameOfReference();
    }

    /* JADX INFO: renamed from: getLookaheadOffset-F1C5BW0 */
    private final long m5541getLookaheadOffsetF1C5BW0() {
        LookaheadDelegate rootLookaheadDelegate = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
        return Offset.m3941minusMKHz9U(mo5523localPositionOfR5De75A(rootLookaheadDelegate.getCoordinates(), Offset.Companion.m3953getZeroF1C5BW0()), getCoordinator().mo5523localPositionOfR5De75A(rootLookaheadDelegate.getCoordinator(), Offset.Companion.m3953getZeroF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: screenToLocal-MK-Hz9U */
    public long mo5528screenToLocalMKHz9U(long j2) {
        return Offset.m3942plusMKHz9U(getCoordinator().mo5528screenToLocalMKHz9U(j2), m5541getLookaheadOffsetF1C5BW0());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToScreen-MK-Hz9U */
    public long mo5526localToScreenMKHz9U(long j2) {
        return getCoordinator().mo5526localToScreenMKHz9U(Offset.m3942plusMKHz9U(j2, m5541getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: windowToLocal-MK-Hz9U */
    public long mo5531windowToLocalMKHz9U(long j2) {
        return Offset.m3942plusMKHz9U(getCoordinator().mo5531windowToLocalMKHz9U(j2), m5541getLookaheadOffsetF1C5BW0());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToWindow-MK-Hz9U */
    public long mo5527localToWindowMKHz9U(long j2) {
        return getCoordinator().mo5527localToWindowMKHz9U(Offset.m3942plusMKHz9U(j2, m5541getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToRoot-MK-Hz9U */
    public long mo5525localToRootMKHz9U(long j2) {
        return getCoordinator().mo5525localToRootMKHz9U(Offset.m3942plusMKHz9U(j2, m5541getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localPositionOf-R5De75A */
    public long mo5523localPositionOfR5De75A(LayoutCoordinates layoutCoordinates, long j2) {
        return mo5524localPositionOfS_NoaFU(layoutCoordinates, j2, true);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localPositionOf-S_NoaFU */
    public long mo5524localPositionOfS_NoaFU(LayoutCoordinates layoutCoordinates, long j2, boolean z2) {
        if (layoutCoordinates instanceof LookaheadLayoutCoordinates) {
            LookaheadDelegate lookaheadDelegate = ((LookaheadLayoutCoordinates) layoutCoordinates).lookaheadDelegate;
            lookaheadDelegate.getCoordinator().onCoordinatesUsed$ui_release();
            LookaheadDelegate lookaheadDelegate2 = getCoordinator().findCommonAncestor$ui_release(lookaheadDelegate.getCoordinator()).getLookaheadDelegate();
            if (lookaheadDelegate2 != null) {
                long jM6769minusqkQi6aY = IntOffset.m6769minusqkQi6aY(IntOffset.m6770plusqkQi6aY(lookaheadDelegate.m5699positionIniSbpLlY$ui_release(lookaheadDelegate2, !z2), IntOffsetKt.m6782roundk4lQ0M(j2)), this.lookaheadDelegate.m5699positionIniSbpLlY$ui_release(lookaheadDelegate2, !z2));
                return OffsetKt.Offset(IntOffset.m6766getXimpl(jM6769minusqkQi6aY), IntOffset.m6767getYimpl(jM6769minusqkQi6aY));
            }
            LookaheadDelegate rootLookaheadDelegate = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate);
            long jM6770plusqkQi6aY = IntOffset.m6770plusqkQi6aY(IntOffset.m6770plusqkQi6aY(lookaheadDelegate.m5699positionIniSbpLlY$ui_release(rootLookaheadDelegate, !z2), rootLookaheadDelegate.mo5692getPositionnOccac()), IntOffsetKt.m6782roundk4lQ0M(j2));
            LookaheadDelegate rootLookaheadDelegate2 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
            long jM6769minusqkQi6aY2 = IntOffset.m6769minusqkQi6aY(jM6770plusqkQi6aY, IntOffset.m6770plusqkQi6aY(this.lookaheadDelegate.m5699positionIniSbpLlY$ui_release(rootLookaheadDelegate2, !z2), rootLookaheadDelegate2.mo5692getPositionnOccac()));
            long jOffset = OffsetKt.Offset(IntOffset.m6766getXimpl(jM6769minusqkQi6aY2), IntOffset.m6767getYimpl(jM6769minusqkQi6aY2));
            NodeCoordinator wrappedBy$ui_release = rootLookaheadDelegate2.getCoordinator().getWrappedBy$ui_release();
            Intrinsics.checkNotNull(wrappedBy$ui_release);
            NodeCoordinator wrappedBy$ui_release2 = rootLookaheadDelegate.getCoordinator().getWrappedBy$ui_release();
            Intrinsics.checkNotNull(wrappedBy$ui_release2);
            return wrappedBy$ui_release.mo5524localPositionOfS_NoaFU(wrappedBy$ui_release2, jOffset, z2);
        }
        LookaheadDelegate rootLookaheadDelegate3 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
        return Offset.m3942plusMKHz9U(mo5524localPositionOfS_NoaFU(rootLookaheadDelegate3.getLookaheadLayoutCoordinates(), j2, z2), rootLookaheadDelegate3.getCoordinator().getCoordinates().mo5524localPositionOfS_NoaFU(layoutCoordinates, Offset.Companion.m3953getZeroF1C5BW0(), z2));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Rect localBoundingBoxOf(LayoutCoordinates layoutCoordinates, boolean z2) {
        return getCoordinator().localBoundingBoxOf(layoutCoordinates, z2);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: transformFrom-EL8BTi8 */
    public void mo5529transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, float[] fArr) {
        getCoordinator().mo5529transformFromEL8BTi8(layoutCoordinates, fArr);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: transformToScreen-58bKbWc */
    public void mo5530transformToScreen58bKbWc(float[] fArr) {
        getCoordinator().mo5530transformToScreen58bKbWc(fArr);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public int get(AlignmentLine alignmentLine) {
        return this.lookaheadDelegate.get(alignmentLine);
    }
}
