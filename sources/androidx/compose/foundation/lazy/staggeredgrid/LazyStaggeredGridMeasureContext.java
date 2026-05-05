package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
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
/* JADX INFO: compiled from: LazyStaggeredGridMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яj\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r@4\u0012\u0006\rnʑA0ZeP\u008cZS@\u000fsڔ<$q$yّCU(\u0007*ޛWN}gvJ`\u000bK\u000f\u001c\u0016\u0001j2L]xs\u0012\u0017˰JoU3UoCIhtL\u0005(2(=\u0002\u0005\u0017\u001a2H\u0016~\u0003Ca\f\u001a0Fx@ĥ#˟5\u001a@\u0005~Ĭ\u007f.`uNNH\u001b^J91\u0005\u0002H^)o0+Q;Id+\u001b{y\u001eYFG9#,k\u00035ZkC\u0011H\n=3r7+9T\fWdd\u0010\u0018#8g\r\f\u00016`\u0013`x\fU/_gY`&(&\f\f\u0011J\u0016&\u0006UL>1(y \u000eax\u0003WNd\u001a^p\f\u000beD,=\u007fa/I\u001ftgy;GeG\u007f\u0013%6#/\bĲ_T\u001cz]@b<i1\u007f\u007feH|\u0010\nA{I\tb0.44UFG{?2ш$6ڼ8\u05fa\u074co\u0004N\fu?Mpv\u0012\u0002RvLJnD=Z\r\u001a \\d3o!cf?)MJXΘ\u0002\u000e\u001b\u05fetyB<3,\u001f^v{\u0003M\f\u000eɻ3l?ժ\u0007m\u0014tGz\u0004L_l(a\u0001\u0001ޖ>ֺѮ\u0004WڋF[\u0014ZjH:4N\t\u001e\u0017L[\\\u001c+2m\u0003̂3ι״\u0018[ČL\u000b&BO\u001d!a`\n\u001e\u001e%B2\u0019\u0002$# ɹTbxב\u007fzON\u000b\u0004r<OiM\u0019Tnɋl:\u0005Ƚ\u001f\u0001y$U\r\u001dVZw.u\u0004\b°\u001a A֗G?\u0019\u001a\rO\u0003\u0011;Jdr\u0014W̊\u0016-\u0003۠\u0012\u0011A\u0010<\u0010Xy~UxjxSݚ\u001b(~ܥ\u000b%\u000e\u000f\u000e\u00162U\tr{T9\bƏMx\u000bʛTP>*\u0013Mn4\u000f~:|c1ϡ+#\u001eߐ,1\u001b\u0011k\u0006@=\bw'&#iנ0i\u001e˱zScbIT\u001ah\rK:$\u001b\u0011\u074cLp\u007f٤Z\u000b:>Az\u0012s~\nPM9c̱j\r4ݸ\tXao!&NI<aByS\u007f$^q)?PϬksuжt\rPF\u0018CL@|\u00194=N^͓f\u000f8ү\f\u001a<zI\u001dUK\u00178L,j\u0014դGZqв(|\u0006\u0002m5gAPsSV<Uܢ`\\PγxGf]8>O#A\\\u00115_\u0011\u0016F\u0003n\u001aҩ\u0001Ә!\r3lU?tf{Xbd3(\u0007\u00053E\f\u0003\u007fπ6\u0086K-\u0006muNF[Ԁ\u001dK \u001e?ݓ-\u000eu8^\u0011t͍R."}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016YuN'\u001b\u0015fA\u0002xMF\u001f\u001b;\u001f", "", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016Y{]'\u001c\u0005/", ">h];X+\"b\u0019\u0007\t", "", "", "7sT:C9Hd\u001d}zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016Yq]+\u0015ofK5rC7,]", "@db<_=>R\u0007\u0006\u0005m:", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016Y{U5\u001c\u0013/", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "7rE2e;BQ\u0015\u0006", "", ";dP@h9>A\u0017\t\u0006^", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;6v#U\\[,JP|H\u0014g", ";`X;4?Bat\u0010vb3x\u00066em,\u0011@", "1n]AX5M=\u001a\u007f\t^;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "0dU<e,\u001c]\"\u000ezg;g\u0005.d\u00041}", "/ec2e\nH\\(~\u0004m\u0017x\b.i\t*", "@de2e:>:\u0015\u0013\u0005n;", ";`X;4?Ba\u0007\nv\\0\u0006\u000b", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "5qP=[0<av\t\u0004m,\u0010\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<+MDz41$>", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001{%*OE;x4\u001d\u0017ue8PJ(c\u000b\u0015VHP.\\_r<u\u001f^\r<:\t\u0014Y\u0017\u000bs@H\u001bQ<X\u0006B2g\u0010$\u001d\u000bQlKU\u001dQ}\u0014\t\u000b'rNdi\bG\u000bFl:m\u000b[,`DCm\u001bm./2^=\u0006}U\u0011\u007fRxitK\u0018D\u001f S\u0002IUAqW<\u0002'\u001e-\t{\u0011\u0016gt3_:\u000eE.5d\u0012!N\u0014G]\u0006\u001f0[Tp$@D\u001eIYc?mH\u001eq\u001e]\u0017\u0012l>z azw\u0012\u001d\u0016Y\u0019]5n_\u007f9_\n=\u0013V\u0011<ZlQW{\u0017\t\u0014$lGVG\u001aB\b$\u007fRwD\u0006i~o\u0017)8\u001a<lXf4gBW!\t29\u0016\fbB\u0011\u007fL\u001av\u0015yWl\u0004m=t%S1B\u0015#rgWV\f*>\u0011\u001af\u001dowR\u00076\u0001#/HY\u000eFE\u0013n\\7\t\u001fqG##6DKPJ{h\b6\u0019\u0007\u000evFrgKB\u0012BERj\u0010:mV\u0005\u0012AN\u0019+Z\u001f3_\b_@e{@T|\u000eI\u0014/B\u0015)(1xK\u001dud\u0011s\b\u0017\rs\u001b=x\u000ba]\u0016`\"D/N$\rb3\u000eY'Wp^P\n8CGWD}h\u0012\b~P\u00169g\u0015\u0004lH\n.1?!\u0010\u00158\u0003,K\u001bhk=h", "5dc\u000eY;>`v\t\u0004m,\u0006\u0018\u001aa~'\u007fI\u0003", "u(8", "5dc\u000fX-H`\u0019\\\u0005g;|\u0012>P{'zD\n\u0019", "5dc\u0010b5Lb&z~g;\u000bP7s_\rw\u001f\u0007", "u(9", "\u0018", "5dc\u0010b5MS\"\u000ed_-\u000b\t>-\t\u0012y>H\u0013\u0015", "5dc\u0010b9Hc(\u0003\u0004^\u001az\u0013:e", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJt!Ty\u001eKz.5G{*Bmk", "5dc\u0014e(IV\u001d|\t<6\u0006\u0018/x\u000f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#_-3x\u00192KQ\u0019u=-\u0015{p\u000f", "u(I", "5dc\u0016g,F>&\t\fb+|\u0016", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7$=IE=kA\u001e\u0014jn=\u0006-\u0013J\f;5[J.^R\u007f=\u0013sg\u0012M\u000f\u001c\u0005a,1xU;\u001e\b9\u001f", ":`]266N\\(", "5dc\u0019T5>1#\u000f\u0004m", ":`]2<5?]", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016YtJ4\rhbB.D", "5dc\u0019T5>7\"\u007f\u0005", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7$=IE=kA\u001e\u0014jn=\u0006-\u0013J\f;5[J.^R\u007f=\u0013sg\u0012M\u0012\t\u000eY%-oN\r", "5dc\u001aT0G/,\u0003\t:=x\r6a|/{.\u0005,\u0017", "5dc\u001aT0G/,\u0003\tL7x\u00073n\u0002", "5dc\u001aX(Lc&~h\\6\b\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7\u001d*aMKz}\u0005\u0011}u \u0003w6^\u0006\u000fGH\\<iR`;\u001e\u001dZc", ";dP@h9>R|\u000ezf\u0017\n\u0013@i~(\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016YuN'\u001b\u0015fA\u000f{NH#\u0007,VW", "5dc\u001aX(Lc&~yB;|\u0011\u001ar\n9\u007f?\u0001$", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7$=IE=kA\u001e\u0014jn=\u0006-\u0013J\f;5[J.^R\u007f=\u0013sg\u0012M\u0013\r\u0001gQ1n/D)\u00190H\u0002H>", "5dc\u001d\\5GS\u0018b\n^4\u000b", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u001fX:HZ*~yL3\u0007\u0018=", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7$=IE=kA\u001e\u0014jn=\u0006-\u0013J\f;5[J.^R\u007f=\u0013sg\u0012M\u0019\u0014\u000fhOy", "5dc\u001fX=>`'~aZ@\u0007\u0019>", "5dc g(MS", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7$=IE=kA\u001e\u0014jn=\u0006-\u0013J\f;5[J.^R\u007f=\u0013sg\u0012M\u0019\u001c\u0001hAy", "7r5B_3,^\u0015\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003tn(Wc#PNN\u0002", "7r5B_3,^\u0015\bBL!mr\u001bX[", "uI\u0018'", "5dc\u0019T5>7\"\u007f\u0005&\u001aqy\u0019Qr\u0004", "uI\u0018\u0016", "5dc c(G@\u0015\b|^", "7sT:<5=S,", ":`]2", "5dc c(G@\u0015\b|^s\u0004r\rC~vy", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001{%*OE;x4\u001d\u0017ue8PJ(c\u000b\u0015VHP.\\_r<u\u001f^\r2:\r\rDN.\u007fH6\u001f\u0015\u0002-e~M", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyStaggeredGridMeasureContext {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final int beforeContentPadding;
    private final long constraints;
    private final long contentOffset;
    private final CoroutineScope coroutineScope;
    private final GraphicsContext graphicsContext;
    private final boolean isVertical;
    private final LazyStaggeredGridItemProvider itemProvider;
    private final int laneCount;
    private final LazyStaggeredGridLaneInfo laneInfo;
    private final int mainAxisAvailableSize;
    private final int mainAxisSpacing;
    private final LazyLayoutMeasureScope measureScope;
    private final LazyStaggeredGridMeasureProvider measuredItemProvider;
    private final List<Integer> pinnedItems;
    private final LazyStaggeredGridSlots resolvedSlots;
    private final boolean reverseLayout;
    private final LazyStaggeredGridState state;

    public /* synthetic */ LazyStaggeredGridMeasureContext(LazyStaggeredGridState lazyStaggeredGridState, List list, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyStaggeredGridSlots lazyStaggeredGridSlots, long j2, boolean z2, LazyLayoutMeasureScope lazyLayoutMeasureScope, int i2, long j3, int i3, int i4, boolean z3, int i5, CoroutineScope coroutineScope, GraphicsContext graphicsContext, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyStaggeredGridState, list, lazyStaggeredGridItemProvider, lazyStaggeredGridSlots, j2, z2, lazyLayoutMeasureScope, i2, j3, i3, i4, z3, i5, coroutineScope, graphicsContext);
    }

    /* JADX INFO: renamed from: getLaneInfo-SZVOQXA */
    public final int m1223getLaneInfoSZVOQXA(long j2) {
        int i2 = (int) (j2 >> 32);
        if (((int) ((-1) - (((-1) - 4294967295L) | ((-1) - j2)))) - i2 != 1) {
            return -2;
        }
        return i2;
    }

    /* JADX INFO: renamed from: isFullSpan-SZVOQXA */
    public final boolean m1225isFullSpanSZVOQXA(long j2) {
        return ((int) ((-1) - (((-1) - 4294967295L) | ((-1) - j2)))) - ((int) (j2 >> 32)) != 1;
    }

    private LazyStaggeredGridMeasureContext(LazyStaggeredGridState lazyStaggeredGridState, List<Integer> list, final LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, final LazyStaggeredGridSlots lazyStaggeredGridSlots, long j2, final boolean z2, final LazyLayoutMeasureScope lazyLayoutMeasureScope, int i2, long j3, int i3, int i4, boolean z3, int i5, CoroutineScope coroutineScope, GraphicsContext graphicsContext) {
        this.state = lazyStaggeredGridState;
        this.pinnedItems = list;
        this.itemProvider = lazyStaggeredGridItemProvider;
        this.resolvedSlots = lazyStaggeredGridSlots;
        this.constraints = j2;
        this.isVertical = z2;
        this.measureScope = lazyLayoutMeasureScope;
        this.mainAxisAvailableSize = i2;
        this.contentOffset = j3;
        this.beforeContentPadding = i3;
        this.afterContentPadding = i4;
        this.reverseLayout = z3;
        this.mainAxisSpacing = i5;
        this.coroutineScope = coroutineScope;
        this.graphicsContext = graphicsContext;
        this.measuredItemProvider = new LazyStaggeredGridMeasureProvider(z2, lazyStaggeredGridItemProvider, lazyLayoutMeasureScope, lazyStaggeredGridSlots) { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext$measuredItemProvider$1
            @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider
            /* JADX INFO: renamed from: createItem-pitSLOA, reason: not valid java name */
            public LazyStaggeredGridMeasuredItem mo1226createItempitSLOA(int i6, int i7, int i8, Object obj, Object obj2, List<? extends Placeable> list2, long j4) {
                return new LazyStaggeredGridMeasuredItem(i6, obj, list2, this.this$0.isVertical(), this.this$0.getMainAxisSpacing(), i7, i8, this.this$0.getBeforeContentPadding(), this.this$0.getAfterContentPadding(), obj2, this.this$0.getState().getItemAnimator$foundation_release(), j4, null);
            }
        };
        this.laneInfo = lazyStaggeredGridState.getLaneInfo$foundation_release();
        this.laneCount = lazyStaggeredGridSlots.getSizes().length;
    }

    public final LazyStaggeredGridState getState() {
        return this.state;
    }

    public final List<Integer> getPinnedItems() {
        return this.pinnedItems;
    }

    public final LazyStaggeredGridItemProvider getItemProvider() {
        return this.itemProvider;
    }

    public final LazyStaggeredGridSlots getResolvedSlots() {
        return this.resolvedSlots;
    }

    /* JADX INFO: renamed from: getConstraints-msEJaDk */
    public final long m1221getConstraintsmsEJaDk() {
        return this.constraints;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    public final LazyLayoutMeasureScope getMeasureScope() {
        return this.measureScope;
    }

    public final int getMainAxisAvailableSize() {
        return this.mainAxisAvailableSize;
    }

    /* JADX INFO: renamed from: getContentOffset-nOcc-ac */
    public final long m1222getContentOffsetnOccac() {
        return this.contentOffset;
    }

    public final int getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    public final int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    public final boolean getReverseLayout() {
        return this.reverseLayout;
    }

    public final int getMainAxisSpacing() {
        return this.mainAxisSpacing;
    }

    public final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    public final GraphicsContext getGraphicsContext() {
        return this.graphicsContext;
    }

    public final LazyStaggeredGridMeasureProvider getMeasuredItemProvider() {
        return this.measuredItemProvider;
    }

    public final LazyStaggeredGridLaneInfo getLaneInfo() {
        return this.laneInfo;
    }

    public final int getLaneCount() {
        return this.laneCount;
    }

    public final boolean isFullSpan(LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int i2) {
        return lazyStaggeredGridItemProvider.getSpanProvider().isFullSpan(i2);
    }

    /* JADX INFO: renamed from: getSpanRange-lOCCd4c */
    public final long m1224getSpanRangelOCCd4c(LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int i2, int i3) {
        boolean zIsFullSpan = lazyStaggeredGridItemProvider.getSpanProvider().isFullSpan(i2);
        int i4 = zIsFullSpan ? this.laneCount : 1;
        if (zIsFullSpan) {
            i3 = 0;
        }
        return SpanRange.m1239constructorimpl(i3, i4);
    }
}
