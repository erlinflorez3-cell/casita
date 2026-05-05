package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
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
/* JADX INFO: compiled from: MeasureAndLayoutDelegate.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я^\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjG9LeN3ZS8\u0016s{:&c$\bCCU0}*ޛWN}gvϺb\u000bY\u000f\u000eǝ\u0001jBI]ތe\u0012%2JoE;UoK9ht<\u0012(288\u0002\u0005\u000730Ϻ&͌+Cy\u000bJ/\u00121Eb\u0011[\u00052\u00124?ŋ\u0005\u001eji\u0017<V\u0013u:]JIi\u000b\\5\bH|{4vZ-\r\u0005\u000b6+n=}53}\u001b\u0007\u0001ao\u0007M\u001dU\u0005\u0017(W1W o8n~B1qO\u05ce\\ö͉`\u0005W\u000eTG9}{K~\u0014X{\t'%<2\u000f6-VZE\u001c|\u0007<O;r֘?АؿbB\u0006**<%U\u00183Y`af\u001aoIJf7*,=\"1,\u0007!\nUT`]/b*i1\u007fgmL\\5q=\u001c\u0005!f\u0010]\u001c0u\u0006w\u0012\u001fb/%e\u0003i'/\u0017\u001aHrh'\tn\u001cki\u0001N\u0007\"7,E_!\f\tJ\u0015\u0013qPb\u000fD\u0019]\u001ed\u0007,/)\u001f\u000b/\u0005?3EfO\u0017\u0011\u001bQk5=/\u00158\nry:o9\rOΉPүߧeT|LMu+\tf!ZS:\u0002%40m`j>\u001f,H\\H+2mrdJ:n1\\Co3\"P}\u0015\t\u000e[\u0019\u0014\r\bK$1ojtQ\u001e^\u001b\to\u0016 y0\u000b :-oWe#4\u0016:nD~3\u0007-\u001b.~.չM\u0015x$7m{N=J=_qU\u0013=\u0013qT\u0010p]L!k\u0002Q R\u0013|(\u0010kn4g\u0016\u001e\t,\u000fpzUZ\u00170;vrQ\u000e+\u007fBoT@_c\u00032\fBW\u001e\u001bYjO~|M5,k\u0019oP$e1QR5\u0016&\u0015_\u0019o\u0011\u0002o\\\u007f)\u000fn\u000bsKDcDu\u0013Uk]S8wZ/D($zKZH\u0019}PX\u0017}%3vG\u0015tdce\u000b]~\u0017\r2\r~\u001fs:AuF@<*Bsq%DbQP)M\u0002h6\u0004Y(#J=\u0010;\u007f?\u001a*\u001ck!\u0007]h\t>N\f\u0018dG\u0004x\u0013\t!$b2l\f\u0019nli4\u0011+\u0006L_\u001d_JB\"A\u001f$bFtVv,\u0011InMB\u0001-+˵\u001d֭\u00985\u0007s\u0015b~,D\u000f$5\tIpw~\u0015&[Hbl3(\u0007\u0007QE.QW\u0005N\u0006](\u001coFȲ:±\u0001\u001dJȰkE_\u0016wv^da٠p͒hv\u001aצ#Z00\u0017z+\u0014\u0013\u0000\u001bՈ\u001dOzŷ3<ZV\u00107q 7[ؐ-\u000b$~iO)7VD;HajB-2\u001cĺ?\u0002 \"&3\u0012~qze\u001d~\n\f)j\u001a\u007f#z\u00027!\u0007dBn!ƚ~˹2\u000e>О\u001a5\b#lj<\n/R?1|\bRK\u0017\r8vC̜pό\u000f\u0003n۲'\u0006|Bh\u001d7=$ܛ\u0015͠^:\u0019֦pj\u001f\u0017,\u001b6!F\b\u0011A>b:֯rքS[\u0015ċ\u007fw8zI0\u00018TΨ{Ȅ\b*\\ӏeGdMVd7]C܃Yеbj0˯E 7/\u0015\u0001^]?/\u000bЛ~ܶcӵҧ\u0018\u001e˝\u0011GhԂT[WC91\u0001EC7`\f&hM֮\u0005̯fx\u0018,H'\u0001\u001f8B;fl=H-\u0002$\u001ce9f\"Ԛ:ܥ\f0)\u0010\u0017PhWpTj<4;\u007f9i\u0019?\u0002Kx\\˒\tص9niU+M\u000f\u001cQ#M\u001eIkhy_rQ0E0qʳh֑)9}N-1\u0010\u0005ڇ~VkY\u0015ˊHw4M\u001e\u007ft˗\u0004\\"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9u<r3Ef}{@l|*aMKz\u0013\u001e\u001chc5\u0016c\u0002", "", "@n^A", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mk", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW#r9?i\r\tAl\u0016\u0004\u00114", "1n]@\\:MS\"|\u000f</|\u00075e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehl-7ms8VQ?yC\u001e\u001efu\u0017\nc*Tv4\u001d", "2ta6a.\u001fc \u0006b^(\u000b\u0019<ef$\u0010J\u0011&\u0002C}\u001c", "", "2ta6a.&S\u0015\r\u000bk,c\u0005Co\u00107", "6`b\u001dX5=W\"\u0001b^(\u000b\u0019<ei5b<\u0015!'V", "5dc\u0015T:)S\"}~g.d\t+s\u00105{*\u000e}\u0013[y\u001eK", "u(I", "6`b\u001dX5=W\"\u0001dg\u0017\u0007\u00173t\u00042\u0005@\u007ft\u0013Nv\u000b8t+C", "5dc\u0015T:)S\"}~g.f\u0012\u001ao\u000e,\u000bD\u000b \u0017FM\nC}\"1W\u0004.", "\nrTA \u0006\u0017", "", ";dP@h9>7(~\bZ;\u0001\u00138", "5dc\u001aX(Lc&~^m,\n\u0005>i\n1", "u(9", "=m;.l6Nbv\t\u0003i3|\u0018/df,\nO\u0001 \u0017T}", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011p\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wN\u007f%B\u0018g)\u001ei*8]R\u0019u<)\u001chp9\u0006J0\\\u0006'PL[\u0002", "=m?<f0MW#\bz]\u000b\u0001\u0017:a\u000f&~@\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wEa/C]\r$Av\u0016-,GIv0-\u0013kaF\\", ">nbAc6GS\u0018fzZ:\r\u0016/R\u007f4\f@\u000f&%", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9u<r3Ef}{@l|*aMKz\u0013\u001e\u001chc5\u0016cj9\u00015VWX5\\Q_= \"Z\u001c]\u0001", "@d[.l6Nb\u0002\ty^:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9l<\u000248G\b-Fm\u0015\u001cMRIL>+slb:\u0007p,W\u0006\u0012CZ\\,j(", "@n^A66Ga(\fvb5\f\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "1`]\u000eY->Q(ivk,\u0006\u0018", "5dc\u0010T5\u001aT\u001a~xm\u0017x\u0016/n\u000f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW#r9?i\r\tAl\u0016\u0004\u00118", "1`]\u000eY->Q(ivk,\u0006\u0018\u0013nf2\u0006F|\u001a\u0017Cn", "5dc\u0010T5\u001aT\u001a~xm\u0017x\u0016/n\u000f\f\u0005'\u000b!\u001dCr\u000e8u", ";dP@h9>/\u001a\u007fz\\;\u000bs+r\u007f1\u000b", "5dc\u001aX(Lc&~V_-|\u0007>sj$\t@\n&", ";dP@h9>/\u001a\u007fz\\;\u000bs+r\u007f1\u000b'\u000b!\u001dCr\u000e8u", "5dc\u001aX(Lc&~V_-|\u0007>sj$\t@\n&}Qy\u00148y%1X", "1`[9B5%O-\t\u000bm\n\u0007\u0011:l\u007f7{?g\u001b%Vo\u0017<\u00043", "", "2hb=T;<V\u0003\beh:\u0001\u00183o\t(z\u001e|\u001e\u001eDk\fB\u0005", "4na0X\u000bBa$z\n\\/", "2n;<b2:V\u0019zyK,\u0005\t+s\u00105{", ":`h<h;']\u0018~", "1n]@g9:W\"\u000e\t", "2n;<b2:V\u0019zyK,\u0005\t+s\u00105{\b\u000f\u0016w#\u0001\u0003\u0018", "2nA2`,:a)\fz", "2nA2`,:a)\fz&:{i\u000bvt\u0004", "2qP6a\u0017Ha(\n\u0005g,{p/a\u000e8\t@m\u0017#Wo\u001cK\u0005", "3mbBe,,c\u0016\u000e\b^,c\u00139k{+{<\u007f\u0004\u0017Rv\n:v$", "4na0X\u0014>O'\u000f\b^\u001b\u007f\t\u001du|7\t@\u0001", "/eU2V;L:#\t\u0001Z/|\u0005.", "4na0X\u0014>O'\u000f\b^\u001b\u007f\t\u001du|7\t@\u0001z Vo\u001bEr,", ";dP@h9>/\"}aZ@\u0007\u0019>", "=m;.l6Nb", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", ";dP@h9>/\"}aZ@\u0007\u0019>-J.bL]#)", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW#r9?i\r\tAl\u0016\u00042\u0007,", ";dP@h9>=\"\u0006\u000f", "=m=<W,\u001dS(zxa,{", "<nS2", "=m[FE,FS\u0015\r\u000bk,`\n\u001dc\u0003(zP\b\u0017\u0016", ">da3b9F;\u0019z\tn9|d8df$\u0010J\u0011&", "4t[9C(La", "0k^0^", "@dV6f;>`\u0003\baZ@\u0007\u0019>C\n0\u0007G\u0001&\u0017FV\u0012J\u0006%>Y\u000b", ":hbAX5>`", "@d\\2T:N`\u0019Z\u0004]\u0019|\u0010+y\n8\u000b$\u0002\u007f\u0017Gn\u000e;", "@d[.l6Nb\u0002~z],{", "@d\\2T:N`\u0019e\u0005h2x\f/a~\u0015\u0006J\u0010%zP]\u001e9\u000625Y", "@d\\2T:N`\u0019h\u0004e@", "@d`BX:M:#\t\u0001Z/|\u0005.R\u007f/wT\u000b'&", "4na0X+", "@d`BX:M:#\t\u0001Z/|\u0005.R\u007f0{<\u000f'$G", "@d`BX:M=\"i\u0005l0\f\r9n\u007f'Y<\b\u001e\u0014Cm\u0014", "@d`BX:M@\u0019\u0006vr6\r\u0018", "@d`BX:M@\u0019\u0007zZ:\r\u0016/", "CoS.g,+]#\u000eXh5\u000b\u0018<a\u00041\u000bN", "CoS.g,+]#\u000eXh5\u000b\u0018<a\u00041\u000bNHs\u00046|\"FA", "uI\u0018#", ";dP@h9>>\u0019\byb5~", "\u001enbAc6GS\u0018kzj<|\u0017>", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MeasureAndLayoutDelegate {
    public static final int $stable = 8;
    private final LayoutTreeConsistencyChecker consistencyChecker;
    private boolean duringFullMeasureLayoutPass;
    private boolean duringMeasureLayout;
    private long measureIteration;
    private final MutableVector<Owner.OnLayoutCompletedListener> onLayoutCompletedListeners;
    private final OnPositionedDispatcher onPositionedDispatcher;
    private final MutableVector<PostponedRequest> postponedMeasureRequests;
    private final DepthSortedSetsForDifferentPasses relayoutNodes;
    private final LayoutNode root;
    private Constraints rootConstraints;

    /* JADX INFO: compiled from: MeasureAndLayoutDelegate.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LayoutNode.LayoutState.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MeasureAndLayoutDelegate(LayoutNode layoutNode) {
        this.root = layoutNode;
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = new DepthSortedSetsForDifferentPasses(Owner.Companion.getEnableExtraAssertions());
        this.relayoutNodes = depthSortedSetsForDifferentPasses;
        this.onPositionedDispatcher = new OnPositionedDispatcher();
        this.onLayoutCompletedListeners = new MutableVector<>(new Owner.OnLayoutCompletedListener[16], 0);
        this.measureIteration = 1L;
        MutableVector<PostponedRequest> mutableVector = new MutableVector<>(new PostponedRequest[16], 0);
        this.postponedMeasureRequests = mutableVector;
        this.consistencyChecker = Owner.Companion.getEnableExtraAssertions() ? new LayoutTreeConsistencyChecker(layoutNode, depthSortedSetsForDifferentPasses, mutableVector.asMutableList()) : null;
    }

    public final boolean getHasPendingMeasureOrLayout() {
        return this.relayoutNodes.isNotEmpty();
    }

    public final boolean getHasPendingOnPositionedCallbacks() {
        return this.onPositionedDispatcher.isNotEmpty();
    }

    public final long getMeasureIteration() {
        if (!this.duringMeasureLayout) {
            InlineClassHelperKt.throwIllegalArgumentException("measureIteration should be only used during the measure/layout pass");
        }
        return this.measureIteration;
    }

    /* JADX INFO: renamed from: updateRootConstraints-BRTryo0 */
    public final void m5704updateRootConstraintsBRTryo0(long j2) {
        Constraints constraints = this.rootConstraints;
        if (constraints == null ? false : Constraints.m6584equalsimpl0(constraints.m6597unboximpl(), j2)) {
            return;
        }
        if (this.duringMeasureLayout) {
            InlineClassHelperKt.throwIllegalArgumentException("updateRootConstraints called while measuring");
        }
        this.rootConstraints = Constraints.m6579boximpl(j2);
        if (this.root.getLookaheadRoot$ui_release() != null) {
            this.root.markLookaheadMeasurePending$ui_release();
        }
        this.root.markMeasurePending$ui_release();
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.relayoutNodes;
        LayoutNode layoutNode = this.root;
        depthSortedSetsForDifferentPasses.add(layoutNode, layoutNode.getLookaheadRoot$ui_release() != null);
    }

    public static /* synthetic */ boolean requestLookaheadRemeasure$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z2 = false;
        }
        return measureAndLayoutDelegate.requestLookaheadRemeasure(layoutNode, z2);
    }

    public final boolean requestLookaheadRemeasure(LayoutNode layoutNode, boolean z2) {
        LayoutNode parent$ui_release;
        LayoutNode parent$ui_release2;
        if (!(layoutNode.getLookaheadRoot$ui_release() != null)) {
            InlineClassHelperKt.throwIllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i2 == 1) {
            return false;
        }
        if (i2 == 2 || i2 == 3 || i2 == 4) {
            this.postponedMeasureRequests.add(new PostponedRequest(layoutNode, true, z2));
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker == null) {
                return false;
            }
            layoutTreeConsistencyChecker.assertConsistent();
            return false;
        }
        if (i2 == 5) {
            if (layoutNode.getLookaheadMeasurePending$ui_release() && !z2) {
                return false;
            }
            layoutNode.markLookaheadMeasurePending$ui_release();
            layoutNode.markMeasurePending$ui_release();
            if (layoutNode.isDeactivated()) {
                return false;
            }
            if ((Intrinsics.areEqual((Object) layoutNode.isPlacedInLookahead(), (Object) true) || getCanAffectParentInLookahead(layoutNode)) && ((parent$ui_release = layoutNode.getParent$ui_release()) == null || !parent$ui_release.getLookaheadMeasurePending$ui_release())) {
                this.relayoutNodes.add(layoutNode, true);
            } else if ((layoutNode.isPlaced() || getCanAffectParent(layoutNode)) && ((parent$ui_release2 = layoutNode.getParent$ui_release()) == null || !parent$ui_release2.getMeasurePending$ui_release())) {
                this.relayoutNodes.add(layoutNode, false);
            }
            return !this.duringFullMeasureLayoutPass;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ boolean requestRemeasure$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z2 = false;
        }
        return measureAndLayoutDelegate.requestRemeasure(layoutNode, z2);
    }

    public final boolean requestRemeasure(LayoutNode layoutNode, boolean z2) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3 || i2 == 4) {
                this.postponedMeasureRequests.add(new PostponedRequest(layoutNode, false, z2));
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            } else if (i2 == 5) {
                if (!layoutNode.getMeasurePending$ui_release() || z2) {
                    layoutNode.markMeasurePending$ui_release();
                    if (!layoutNode.isDeactivated() && (layoutNode.isPlaced() || getCanAffectParent(layoutNode))) {
                        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                        if (parent$ui_release == null || !parent$ui_release.getMeasurePending$ui_release()) {
                            this.relayoutNodes.add(layoutNode, false);
                        }
                        if (!this.duringFullMeasureLayoutPass) {
                            return true;
                        }
                    }
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return false;
    }

    public static /* synthetic */ boolean requestLookaheadRelayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z2, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            z2 = false;
        }
        return measureAndLayoutDelegate.requestLookaheadRelayout(layoutNode, z2);
    }

    public final boolean requestLookaheadRelayout(LayoutNode layoutNode, boolean z2) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4 && i2 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            if ((layoutNode.getLookaheadMeasurePending$ui_release() || layoutNode.getLookaheadLayoutPending$ui_release()) && !z2) {
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker == null) {
                    return false;
                }
                layoutTreeConsistencyChecker.assertConsistent();
                return false;
            }
            layoutNode.markLookaheadLayoutPending$ui_release();
            layoutNode.markLayoutPending$ui_release();
            if (layoutNode.isDeactivated()) {
                return false;
            }
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if (Intrinsics.areEqual((Object) layoutNode.isPlacedInLookahead(), (Object) true) && ((parent$ui_release == null || !parent$ui_release.getLookaheadMeasurePending$ui_release()) && (parent$ui_release == null || !parent$ui_release.getLookaheadLayoutPending$ui_release()))) {
                this.relayoutNodes.add(layoutNode, true);
            } else if (layoutNode.isPlaced() && ((parent$ui_release == null || !parent$ui_release.getLayoutPending$ui_release()) && (parent$ui_release == null || !parent$ui_release.getMeasurePending$ui_release()))) {
                this.relayoutNodes.add(layoutNode, false);
            }
            return !this.duringFullMeasureLayoutPass;
        }
        LayoutTreeConsistencyChecker layoutTreeConsistencyChecker2 = this.consistencyChecker;
        if (layoutTreeConsistencyChecker2 == null) {
            return false;
        }
        layoutTreeConsistencyChecker2.assertConsistent();
        return false;
    }

    public static /* synthetic */ boolean requestRelayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return measureAndLayoutDelegate.requestRelayout(layoutNode, z2);
    }

    public final boolean requestRelayout(LayoutNode layoutNode, boolean z2) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
            }
        } else if (i2 == 5) {
            if (!z2 && layoutNode.isPlaced() == layoutNode.isPlacedByParent() && (layoutNode.getMeasurePending$ui_release() || layoutNode.getLayoutPending$ui_release())) {
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker2 = this.consistencyChecker;
                if (layoutTreeConsistencyChecker2 != null) {
                    layoutTreeConsistencyChecker2.assertConsistent();
                }
            } else {
                layoutNode.markLayoutPending$ui_release();
                if (!layoutNode.isDeactivated() && layoutNode.isPlacedByParent()) {
                    LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                    if ((parent$ui_release == null || !parent$ui_release.getLayoutPending$ui_release()) && (parent$ui_release == null || !parent$ui_release.getMeasurePending$ui_release())) {
                        this.relayoutNodes.add(layoutNode, false);
                    }
                    if (!this.duringFullMeasureLayoutPass) {
                        return true;
                    }
                }
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return false;
    }

    public final void requestOnPositionedCallback(LayoutNode layoutNode) {
        this.onPositionedDispatcher.onNodePositioned(layoutNode);
    }

    /* JADX INFO: renamed from: doLookaheadRemeasure-sdFAvZA */
    private final boolean m5701doLookaheadRemeasuresdFAvZA(LayoutNode layoutNode, Constraints constraints) {
        boolean zM5664lookaheadRemeasure_Sx5XlM$ui_release$default;
        if (layoutNode.getLookaheadRoot$ui_release() == null) {
            return false;
        }
        if (constraints != null) {
            zM5664lookaheadRemeasure_Sx5XlM$ui_release$default = layoutNode.m5668lookaheadRemeasure_Sx5XlM$ui_release(constraints);
        } else {
            zM5664lookaheadRemeasure_Sx5XlM$ui_release$default = LayoutNode.m5664lookaheadRemeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null);
        }
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (zM5664lookaheadRemeasure_Sx5XlM$ui_release$default && parent$ui_release != null) {
            if (parent$ui_release.getLookaheadRoot$ui_release() == null) {
                LayoutNode.requestRemeasure$ui_release$default(parent$ui_release, false, false, false, 3, null);
            } else if (layoutNode.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                LayoutNode.requestLookaheadRemeasure$ui_release$default(parent$ui_release, false, false, false, 3, null);
            } else if (layoutNode.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InLayoutBlock) {
                LayoutNode.requestLookaheadRelayout$ui_release$default(parent$ui_release, false, 1, null);
            }
        }
        return zM5664lookaheadRemeasure_Sx5XlM$ui_release$default;
    }

    /* JADX INFO: renamed from: doRemeasure-sdFAvZA */
    private final boolean m5702doRemeasuresdFAvZA(LayoutNode layoutNode, Constraints constraints) {
        boolean zM5665remeasure_Sx5XlM$ui_release$default;
        if (constraints != null) {
            zM5665remeasure_Sx5XlM$ui_release$default = layoutNode.m5669remeasure_Sx5XlM$ui_release(constraints);
        } else {
            zM5665remeasure_Sx5XlM$ui_release$default = LayoutNode.m5665remeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null);
        }
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (zM5665remeasure_Sx5XlM$ui_release$default && parent$ui_release != null) {
            if (layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                LayoutNode.requestRemeasure$ui_release$default(parent$ui_release, false, false, false, 3, null);
            } else if (layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InLayoutBlock) {
                LayoutNode.requestRelayout$ui_release$default(parent$ui_release, false, 1, null);
            }
        }
        return zM5665remeasure_Sx5XlM$ui_release$default;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean measureAndLayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, Function0 function0, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            function0 = null;
        }
        return measureAndLayoutDelegate.measureAndLayout(function0);
    }

    public final void measureOnly() {
        if (this.relayoutNodes.isNotEmpty()) {
            if (!this.root.isAttached()) {
                InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
            }
            if (!this.root.isPlaced()) {
                InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
            }
            if (this.duringMeasureLayout) {
                InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
            }
            if (this.rootConstraints != null) {
                this.duringMeasureLayout = true;
                this.duringFullMeasureLayoutPass = false;
                try {
                    if (!this.relayoutNodes.isEmpty(true)) {
                        if (this.root.getLookaheadRoot$ui_release() != null) {
                            remeasureOnly(this.root, true);
                        } else {
                            remeasureLookaheadRootsInSubtree(this.root);
                        }
                    }
                    remeasureOnly(this.root, false);
                    this.duringMeasureLayout = false;
                    this.duringFullMeasureLayoutPass = false;
                    LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                    if (layoutTreeConsistencyChecker != null) {
                        layoutTreeConsistencyChecker.assertConsistent();
                    }
                } catch (Throwable th) {
                    this.duringMeasureLayout = false;
                    this.duringFullMeasureLayoutPass = false;
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: measureAndLayout-0kLqBqw */
    public final void m5703measureAndLayout0kLqBqw(LayoutNode layoutNode, long j2) {
        if (layoutNode.isDeactivated()) {
            return;
        }
        if (Intrinsics.areEqual(layoutNode, this.root)) {
            InlineClassHelperKt.throwIllegalArgumentException("measureAndLayout called on root");
        }
        if (!this.root.isAttached()) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
        }
        if (!this.root.isPlaced()) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
        }
        if (this.duringMeasureLayout) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
        }
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            this.duringFullMeasureLayoutPass = false;
            try {
                this.relayoutNodes.remove(layoutNode);
                if ((m5701doLookaheadRemeasuresdFAvZA(layoutNode, Constraints.m6579boximpl(j2)) || layoutNode.getLookaheadLayoutPending$ui_release()) && Intrinsics.areEqual((Object) layoutNode.isPlacedInLookahead(), (Object) true)) {
                    layoutNode.lookaheadReplace$ui_release();
                }
                ensureSubtreeLookaheadReplaced(layoutNode);
                m5702doRemeasuresdFAvZA(layoutNode, Constraints.m6579boximpl(j2));
                if (layoutNode.getLayoutPending$ui_release() && layoutNode.isPlaced()) {
                    layoutNode.replace$ui_release();
                    this.onPositionedDispatcher.onNodePositioned(layoutNode);
                }
                drainPostponedMeasureRequests();
                this.duringMeasureLayout = false;
                this.duringFullMeasureLayoutPass = false;
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            } catch (Throwable th) {
                this.duringMeasureLayout = false;
                this.duringFullMeasureLayoutPass = false;
                throw th;
            }
        }
        callOnLayoutCompletedListeners();
    }

    private final void performMeasureAndLayout(boolean z2, Function0<Unit> function0) {
        if (!this.root.isAttached()) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
        }
        if (!this.root.isPlaced()) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
        }
        if (this.duringMeasureLayout) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
        }
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            this.duringFullMeasureLayoutPass = z2;
            try {
                function0.invoke();
                InlineMarker.finallyStart(1);
                this.duringMeasureLayout = false;
                this.duringFullMeasureLayoutPass = false;
                InlineMarker.finallyEnd(1);
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                this.duringMeasureLayout = false;
                this.duringFullMeasureLayoutPass = false;
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
    }

    public final void registerOnLayoutCompletedListener(Owner.OnLayoutCompletedListener onLayoutCompletedListener) {
        this.onLayoutCompletedListeners.add(onLayoutCompletedListener);
    }

    private final void callOnLayoutCompletedListeners() {
        MutableVector<Owner.OnLayoutCompletedListener> mutableVector = this.onLayoutCompletedListeners;
        int size = mutableVector.getSize();
        if (size > 0) {
            Owner.OnLayoutCompletedListener[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                content[i2].onLayoutComplete();
                i2++;
            } while (i2 < size);
        }
        this.onLayoutCompletedListeners.clear();
    }

    static /* synthetic */ boolean remeasureAndRelayoutIfNeeded$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z2, boolean z3, int i2, Object obj) {
        if ((2 & i2) != 0) {
            z2 = true;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            z3 = true;
        }
        return measureAndLayoutDelegate.remeasureAndRelayoutIfNeeded(layoutNode, z2, z3);
    }

    private final boolean remeasureAndRelayoutIfNeeded(LayoutNode layoutNode, boolean z2, boolean z3) {
        Constraints constraints;
        LayoutNode parent$ui_release;
        if (layoutNode.isDeactivated()) {
            return false;
        }
        if (layoutNode.isPlaced() || layoutNode.isPlacedByParent() || getCanAffectParent(layoutNode) || Intrinsics.areEqual((Object) layoutNode.isPlacedInLookahead(), (Object) true) || getCanAffectParentInLookahead(layoutNode) || layoutNode.getAlignmentLinesRequired$ui_release()) {
            if (layoutNode == this.root) {
                constraints = this.rootConstraints;
                Intrinsics.checkNotNull(constraints);
            } else {
                constraints = null;
            }
            if (z2) {
                zM5701doLookaheadRemeasuresdFAvZA = layoutNode.getLookaheadMeasurePending$ui_release() ? m5701doLookaheadRemeasuresdFAvZA(layoutNode, constraints) : false;
                if (z3 && ((zM5701doLookaheadRemeasuresdFAvZA || layoutNode.getLookaheadLayoutPending$ui_release()) && Intrinsics.areEqual((Object) layoutNode.isPlacedInLookahead(), (Object) true))) {
                    layoutNode.lookaheadReplace$ui_release();
                }
            } else {
                boolean zM5702doRemeasuresdFAvZA = layoutNode.getMeasurePending$ui_release() ? m5702doRemeasuresdFAvZA(layoutNode, constraints) : false;
                if (z3 && layoutNode.getLayoutPending$ui_release() && (layoutNode == this.root || ((parent$ui_release = layoutNode.getParent$ui_release()) != null && parent$ui_release.isPlaced() && layoutNode.isPlacedByParent()))) {
                    if (layoutNode == this.root) {
                        layoutNode.place$ui_release(0, 0);
                    } else {
                        layoutNode.replace$ui_release();
                    }
                    this.onPositionedDispatcher.onNodePositioned(layoutNode);
                    LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                    if (layoutTreeConsistencyChecker != null) {
                        layoutTreeConsistencyChecker.assertConsistent();
                    }
                }
                zM5701doLookaheadRemeasuresdFAvZA = zM5702doRemeasuresdFAvZA;
            }
            drainPostponedMeasureRequests();
        }
        return zM5701doLookaheadRemeasuresdFAvZA;
    }

    private final void drainPostponedMeasureRequests() {
        if (this.postponedMeasureRequests.isNotEmpty()) {
            MutableVector<PostponedRequest> mutableVector = this.postponedMeasureRequests;
            int size = mutableVector.getSize();
            if (size > 0) {
                PostponedRequest[] content = mutableVector.getContent();
                int i2 = 0;
                do {
                    PostponedRequest postponedRequest = content[i2];
                    if (postponedRequest.getNode().isAttached()) {
                        if (!postponedRequest.isLookahead()) {
                            LayoutNode.requestRemeasure$ui_release$default(postponedRequest.getNode(), postponedRequest.isForced(), false, false, 2, null);
                        } else {
                            LayoutNode.requestLookaheadRemeasure$ui_release$default(postponedRequest.getNode(), postponedRequest.isForced(), false, false, 2, null);
                        }
                    }
                    i2++;
                } while (i2 < size);
            }
            this.postponedMeasureRequests.clear();
        }
    }

    private final void remeasureOnly(LayoutNode layoutNode, boolean z2) {
        Constraints constraints;
        if (layoutNode.isDeactivated()) {
            return;
        }
        if (layoutNode == this.root) {
            constraints = this.rootConstraints;
            Intrinsics.checkNotNull(constraints);
        } else {
            constraints = null;
        }
        if (z2) {
            m5701doLookaheadRemeasuresdFAvZA(layoutNode, constraints);
        } else {
            m5702doRemeasuresdFAvZA(layoutNode, constraints);
        }
    }

    public final void forceMeasureTheSubtree(LayoutNode layoutNode, boolean z2) {
        if (this.relayoutNodes.isEmpty(z2)) {
            return;
        }
        if (!this.duringMeasureLayout) {
            InlineClassHelperKt.throwIllegalStateException("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (measurePending(layoutNode, z2)) {
            InlineClassHelperKt.throwIllegalArgumentException("node not yet measured");
        }
        forceMeasureTheSubtreeInternal(layoutNode, z2);
    }

    private final void onlyRemeasureIfScheduled(LayoutNode layoutNode, boolean z2) {
        if (measurePending(layoutNode, z2) && this.relayoutNodes.contains(layoutNode, z2)) {
            remeasureAndRelayoutIfNeeded(layoutNode, z2, false);
        }
    }

    public static /* synthetic */ void dispatchOnPositionedCallbacks$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            z2 = false;
        }
        measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z2);
    }

    public final void dispatchOnPositionedCallbacks(boolean z2) {
        if (z2) {
            this.onPositionedDispatcher.onRootNodePositioned(this.root);
        }
        this.onPositionedDispatcher.dispatch();
    }

    public final void onNodeDetached(LayoutNode layoutNode) {
        this.relayoutNodes.remove(layoutNode);
        this.onPositionedDispatcher.remove(layoutNode);
    }

    private final boolean getMeasureAffectsParent(LayoutNode layoutNode) {
        return layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock || layoutNode.getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release();
    }

    private final boolean getCanAffectParent(LayoutNode layoutNode) {
        return layoutNode.getMeasurePending$ui_release() && getMeasureAffectsParent(layoutNode);
    }

    private final boolean getCanAffectParentInLookahead(LayoutNode layoutNode) {
        return layoutNode.getLookaheadMeasurePending$ui_release() && getMeasureAffectsParentLookahead(layoutNode);
    }

    private final boolean getMeasureAffectsParentLookahead(LayoutNode layoutNode) {
        AlignmentLines alignmentLines;
        if (layoutNode.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
            return true;
        }
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = layoutNode.getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release();
        return (lookaheadAlignmentLinesOwner$ui_release == null || (alignmentLines = lookaheadAlignmentLinesOwner$ui_release.getAlignmentLines()) == null || !alignmentLines.getRequired$ui_release()) ? false : true;
    }

    private final boolean measurePending(LayoutNode layoutNode, boolean z2) {
        return z2 ? layoutNode.getLookaheadMeasurePending$ui_release() : layoutNode.getMeasurePending$ui_release();
    }

    /* JADX INFO: compiled from: MeasureAndLayoutDelegate.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r+4\u0012}\u000bloOӄtev-\u0013n:\u0013y{L$\n%\u0002GIW2}P\f_Ruk\u0007J\t\u000eß\u0013\u0006$};;WY\u0011]@\u0012̓FuG\u074ceqC=nz\u0007\u0014.4:8(\bв\u001e0PƵ\u000f|IM\u001a\u0018\u0001O~:j\r{\u0006ܨ\u0016\fFĨ\u0019 bn\\>Ոpf"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9u<r3Ef}{@l|*aMKz\u0013\u001e\u001chc5\u0016cj9\u00015VWX5\\Q_= \"Z\u001c]\u0001", "", "<nS2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mk", "7r;<b2:V\u0019zy", "", "7r5<e*>R", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW#r9?i\r\tAl\u0016\u0004B8~\\", "u(I", "5dc\u001bb+>", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]!Ic\u000e/ w\u0015.#", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class PostponedRequest {
        public static final int $stable = 8;
        private final boolean isForced;
        private final boolean isLookahead;
        private final LayoutNode node;

        public PostponedRequest(LayoutNode layoutNode, boolean z2, boolean z3) {
            this.node = layoutNode;
            this.isLookahead = z2;
            this.isForced = z3;
        }

        public final LayoutNode getNode() {
            return this.node;
        }

        public final boolean isForced() {
            return this.isForced;
        }

        public final boolean isLookahead() {
            return this.isLookahead;
        }
    }

    public final boolean measureAndLayout(Function0<Unit> function0) {
        boolean z2;
        if (!this.root.isAttached()) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
        }
        if (!this.root.isPlaced()) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
        }
        if (this.duringMeasureLayout) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
        }
        boolean z3 = false;
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            this.duringFullMeasureLayoutPass = true;
            try {
                if (this.relayoutNodes.isNotEmpty()) {
                    DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.relayoutNodes;
                    z2 = false;
                    while (depthSortedSetsForDifferentPasses.isNotEmpty()) {
                        boolean zIsEmpty = depthSortedSetsForDifferentPasses.lookaheadSet.isEmpty();
                        boolean z4 = !zIsEmpty;
                        LayoutNode layoutNodePop = (!zIsEmpty ? depthSortedSetsForDifferentPasses.lookaheadSet : depthSortedSetsForDifferentPasses.set).pop();
                        boolean zRemeasureAndRelayoutIfNeeded$default = remeasureAndRelayoutIfNeeded$default(this, layoutNodePop, z4, false, 4, null);
                        if (layoutNodePop == this.root && zRemeasureAndRelayoutIfNeeded$default) {
                            z2 = true;
                        }
                    }
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else {
                    z2 = false;
                }
                this.duringMeasureLayout = false;
                this.duringFullMeasureLayoutPass = false;
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
                z3 = z2;
            } catch (Throwable th) {
                this.duringMeasureLayout = false;
                this.duringFullMeasureLayoutPass = false;
                throw th;
            }
        }
        callOnLayoutCompletedListeners();
        return z3;
    }

    private final void remeasureLookaheadRootsInSubtree(LayoutNode layoutNode) {
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                LayoutNode layoutNode2 = content[i2];
                if (getMeasureAffectsParent(layoutNode2)) {
                    if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(layoutNode2)) {
                        remeasureOnly(layoutNode2, true);
                    } else {
                        remeasureLookaheadRootsInSubtree(layoutNode2);
                    }
                }
                i2++;
            } while (i2 < size);
        }
    }

    private final void ensureSubtreeLookaheadReplaced(LayoutNode layoutNode) {
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                LayoutNode layoutNode2 = content[i2];
                if (Intrinsics.areEqual((Object) layoutNode2.isPlacedInLookahead(), (Object) true) && !layoutNode2.isDeactivated()) {
                    if (this.relayoutNodes.contains(layoutNode2, true)) {
                        layoutNode2.lookaheadReplace$ui_release();
                    }
                    ensureSubtreeLookaheadReplaced(layoutNode2);
                }
                i2++;
            } while (i2 < size);
        }
    }

    private final void forceMeasureTheSubtreeInternal(LayoutNode layoutNode, boolean z2) {
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                LayoutNode layoutNode2 = content[i2];
                if ((!z2 && getMeasureAffectsParent(layoutNode2)) || (z2 && getMeasureAffectsParentLookahead(layoutNode2))) {
                    if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(layoutNode2) && !z2) {
                        if (layoutNode2.getLookaheadMeasurePending$ui_release() && this.relayoutNodes.contains(layoutNode2, true)) {
                            remeasureAndRelayoutIfNeeded(layoutNode2, true, false);
                        } else {
                            forceMeasureTheSubtree(layoutNode2, true);
                        }
                    }
                    onlyRemeasureIfScheduled(layoutNode2, z2);
                    if (!measurePending(layoutNode2, z2)) {
                        forceMeasureTheSubtreeInternal(layoutNode2, z2);
                    }
                }
                i2++;
            } while (i2 < size);
        }
        onlyRemeasureIfScheduled(layoutNode, z2);
    }
}
