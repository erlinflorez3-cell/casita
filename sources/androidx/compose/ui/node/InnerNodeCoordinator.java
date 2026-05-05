package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: InnerNodeCoordinator.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яď\u0014D57\u001eq\u007fZDkŞ\fA\u001c0\u0013.H~*,(w\u000ffp=8D{H6RY-\u0017k\n:,Ӌ,qY;]ڼ\u0006\"\u0017OVgmnRZ!C\u0017إ\u001ex\u0001,Qǁ\u0001](\u000f:ԏw?AVw=?f|6\u001b :Ĳ@y\u001b\u0001\"*N\u0015~zYK\u0014۵8@\u0007:Z\rS\u0005\"\u0012\u001c>(ҵ&\\uS>ԟt]P/+\u0003\u007fBV'u0\u0005M\u0013KZ܋#Ǹ\u007f_[@e4M%\u0015EG]kC\u0011?\n=3iҊ++Wu Df\u0010,\u0015Y`=a\u00018t\u0005\u007fsR;sUq_h\u000eV\rA\u0010Ut\u0012$\u001e'vC]\u001et\u001f&3#\u000b\u0004D^\u001bvB.\u0015\u0012:%@\u00183YUKj_~S\u0019|U,\t\u001b=;\u0001\u001d?\"hَ_ٽôXyWQ_a\u0006V\\,q=\u001c\u0015!f\u0010M\u001c0u\u0011u\u0010Y<%IO[g4Qo\u0010m\\g%\u0016'|\u001c\u0002`nX\"\u001d=g.\u00174rD\u0013.2dղW\u008cҭQ\u001eZ1\f3[.j$T!S!~Sv\r\u0003M\f\u001bkC/Eg\u001c\u0004\u000e\u0006J\u000f7Cv{\u0010\u0010c=(\bBp3pfphRZ%@0a`j>\r,H\\<+2m#L::c1^+G1Q\tUEDm\u000f\u0001\u0010-ic(\u0011\u001f<t77\u0001`~'\u007fxwd-w0fYdE\u001b6UP$D~3\u0007-\t\u0016F\u0016\u0007ܤPl\u001c2\u001c\u000eĆ\u0015֝\u07fcU1CP\u001d=qZ\u0010a]L!z\u0002Q \\\u0013|(Ekl<\u001f j\u001fd\u0011nX\u000fl\u0017P*%\u0005ص\u0007ۭѣ}cL8U$%1iCat\u0019XjRh\u0003\u0013\"6'\u0017nP\u0001s\u007f\u001aۆ)ə{ 7֒y_ou<\u0001\u0003\u0011,|s\r|{$yzQ\f=\u0012ΆK˕\u0003J*غ|\u0005HTx\u0005 D\u000fB\u001bBǨAixY>ԩ']|֮\u000bo"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9qE\u007f%BB\b\u001f7K 8ZB?t0-\u001fu7", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u0013c\b-6q\u001f*\\MHA", ":`h<h;']\u0018~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mk", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW#r9?i\r\tAl\u0016\u0004\u00114", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9tF\u0001+1\\}\u001c6L\u00165ME7z4s", ":n^8T/>O\u0018]ze,~\u0005>e", "5dc\u0019b6DO\u001c~v]\u000b|\u0010/g{7{", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]/?_y#7i\u0015\rMJ;m0-\u0015>", "Adc\u0019b6DO\u001c~v]\u000b|\u0010/g{7{", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW#\u0001/;U\u0001 3lt.TC=gC\u001ej,R", "B`X9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9|8z,\u001dc|$8q\u0016;6M:k\n", "5dc!T0E\u0012\u0015\b\u0004h;x\u00183o\t6", "u(E", "5dc!T0E", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006e!9`e*6q\u00172MP$u3\u001ej", "1`[0h3:b\u0019Z\u0002b.\u0006\u0011/n\u000f\u000f\u007fI\u0001", "", "/kX4a4>\\(e~g,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", "3mbBe,%]#\u0005va,x\b\u000ee\u0007(}<\u0010\u0017tTo\nKv$", "", "6hc!X:M1\u001c\u0003\u0002]", "6hc!X:MA#\u000f\b\\,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u0013c\b-6q\u001f*\\MH*\u0017\"$WaG\u0016Q6^\u0004%G\"", ">nX;g,K>#\r~m0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "6hc!X:M@\u0019\r\u000be;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9p@\u0006\u00145g\r\r7{&5\\\u0019", "7rC<h*A3*~\u0004m", "", "7r8;?(RS&", "6hc!X:M1\u001c\u0003\u0002]sp\u0015 A\u000f8_", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW%\u0001$57\b*Dl\u001a7IRExr\u0001\u0019wP9\u0015r\u001aX\u00074EL$\u0011CN{<!\u001c^\rat\u000b\u000faL.|D\u0001/\fuR\f:hJn\u001a\u001d$j~QC\u0010U\n\u001c\u0005\u0017\u001e]\nJ", ";`g\u0016a;KW\"\r~\\\u000f|\r1h\u000f", "EhSA[", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", "6dX4[;", ";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";dP@h9>\u001bukik@\u0007S", "uI\u0018\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Nk\"F\u00074~D\u0005\u001c5m\u0012+TC\u0011", ";h]\u0016a;KW\"\r~\\\u000f|\r1h\u000f", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h", "=m03g,K> zx^\b\f", ">da3b9F2&z\r", "1`]CT:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", "5qP=[0<a\u007fz\u000f^9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u00149", ">kP0X\bM", ">nb6g0H\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "HH]1X?", "", ":`h2e\tE]\u0017\u0005", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<4?OkA\f\u0013rl9\\", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", ">kP0X\bM\u001b\u001aQ\u000eO\u000e\u0006\u0013", "uI5\u0019^6MZ\u001d\bDc=\u0005R0u\t&\u000bD\u000b %\u0011P\u001eEt49c\u0007k\r1\u0007", ":`h2e", "uI5\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`I|\nGy)3gG'3\u0002\u0016;\u0017%Hg?!\u0019fo \u0003w,[Lj8", "\u0011n\\=T5B]\"", "\u001an^8T/>O\u0018]ze,~\u0005>ec0\u0007G", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class InnerNodeCoordinator extends NodeCoordinator {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Paint innerBoundsPaint;
    private LookaheadDelegate lookaheadDelegate;
    private final TailModifierNode tail;

    public static /* synthetic */ void getTail$annotations() {
    }

    public InnerNodeCoordinator(LayoutNode layoutNode) {
        super(layoutNode);
        this.tail = new TailModifierNode();
        getTail().updateCoordinator$ui_release(this);
        this.lookaheadDelegate = layoutNode.getLookaheadRoot$ui_release() != null ? new LookaheadDelegateImpl() : null;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public TailModifierNode getTail() {
        return this.tail;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    protected void setLookaheadDelegate(LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    /* JADX INFO: compiled from: InnerNodeCoordinator.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00116Ȑ\u0007\"B\u0012\u007f\u0007lmA0ZeP\u008cZS@\u000fs{:'c$\u007fCC٥ ԅ$\u001fѧ~g\u0016m\u000b]ŲG\u000f\u0014\u0016Ax:Jmx\f\u0014?6PrW3{s\u0004M)\u0003D\n82P:*\t\u000f BH>xAW\u0014\u001a 7XphT=Q\u0013\"*\u0006l\"G2%\u007f\\?`l\fD_'\u0011tZNUkv\u0011ת\fϿù+\u000f|n,9\tEC$=S1\t\u0003_M\tWqk\u0007/;o9W\u0004o6\u0007\u0002D\u00199W%]!(#\u0019\u001af\u001a8CO\u0012]\u0017 ߍw\u007f\u0004\u0010Bǫ*4&χ2@"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9qE\u007f%BB\b\u001f7K 8ZB?t0-\u001fu  \u0011m2Jy'CK-,cRt9#\u0012>\u0016Y2b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9tF\u0001+1\\}\u001c6L\u00165ME7z4s", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW \u007f.5ff*6ms8WP:o=\u001a$rn\u000fJT", "1`[0h3:b\u0019Z\u0002b.\u0006\u0011/n\u000f\u000f\u007fI\u0001", "", "/kX4a4>\\(e~g,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", ";`g\u0016a;KW\"\r~\\\u000f|\r1h\u000f", "EhSA[", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", "6dX4[;", ";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";dP@h9>\u001bukik@\u0007S", "uI\u0018\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Nk\"F\u00074~D\u0005\u001c5m\u0012+TC\u0011", ";h]\u0016a;KW\"\r~\\\u000f|\r1h\u000f", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h", ">kP0X\nAW }\b^5", "", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private final class LookaheadDelegateImpl extends LookaheadDelegate {
        public LookaheadDelegateImpl() {
            super(InnerNodeCoordinator.this);
        }

        @Override // androidx.compose.ui.layout.Measurable
        /* JADX INFO: renamed from: measure-BRTryo0 */
        public Placeable mo5514measureBRTryo0(long j2) {
            LookaheadDelegateImpl lookaheadDelegateImpl = this;
            lookaheadDelegateImpl.m5577setMeasurementConstraintsBRTryo0(j2);
            MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i2 = 0;
                do {
                    LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = content[i2].getLookaheadPassDelegate$ui_release();
                    Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
                    lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
                    i2++;
                } while (i2 < size);
            }
            lookaheadDelegateImpl.set_measureResult(getLayoutNode().getMeasurePolicy().mo375measure3p2s80s(this, getLayoutNode().getChildLookaheadMeasurables$ui_release(), j2));
            return lookaheadDelegateImpl;
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public int calculateAlignmentLine(AlignmentLine alignmentLine) {
            Integer num = getAlignmentLinesOwner().calculateAlignmentLines().get(alignmentLine);
            int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            getCachedAlignmentLinesMap().put(alignmentLine, Integer.valueOf(iIntValue));
            return iIntValue;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate
        protected void placeChildren() {
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLayoutNode().getLookaheadPassDelegate$ui_release();
            Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
            lookaheadPassDelegate$ui_release.onNodePlaced$ui_release();
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i2) {
            return getLayoutNode().minLookaheadIntrinsicWidth(i2);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i2) {
            return getLayoutNode().minLookaheadIntrinsicHeight(i2);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i2) {
            return getLayoutNode().maxLookaheadIntrinsicWidth(i2);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i2) {
            return getLayoutNode().maxLookaheadIntrinsicHeight(i2);
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void ensureLookaheadDelegateCreated() {
        if (getLookaheadDelegate() == null) {
            setLookaheadDelegate(new LookaheadDelegateImpl());
        }
    }

    @Override // androidx.compose.ui.layout.Measurable
    /* JADX INFO: renamed from: measure-BRTryo0 */
    public Placeable mo5514measureBRTryo0(long j2) {
        if (getForceMeasureWithLookaheadConstraints$ui_release()) {
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            j2 = lookaheadDelegate.m5695getConstraintsmsEJaDk$ui_release();
        }
        m5577setMeasurementConstraintsBRTryo0(j2);
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                content[i2].getMeasurePassDelegate$ui_release().setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
                i2++;
            } while (i2 < size);
        }
        setMeasureResult$ui_release(getLayoutNode().getMeasurePolicy().mo375measure3p2s80s(this, getLayoutNode().getChildMeasurables$ui_release(), j2));
        onMeasured();
        return this;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i2) {
        return getLayoutNode().minIntrinsicWidth(i2);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i2) {
        return getLayoutNode().minIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i2) {
        return getLayoutNode().maxIntrinsicWidth(i2);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i2) {
        return getLayoutNode().maxIntrinsicHeight(i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public void mo5575placeAtf8xVGno(long j2, float f2, GraphicsLayer graphicsLayer) {
        super.mo5575placeAtf8xVGno(j2, f2, graphicsLayer);
        onAfterPlaceAt();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public void mo5515placeAtf8xVGno(long j2, float f2, Function1<? super GraphicsLayerScope, Unit> function1) {
        super.mo5515placeAtf8xVGno(j2, f2, function1);
        onAfterPlaceAt();
    }

    private final void onAfterPlaceAt() {
        if (isShallowPlacing$ui_release()) {
            return;
        }
        onPlaced();
        getLayoutNode().getMeasurePassDelegate$ui_release().onNodePlaced$ui_release();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public int calculateAlignmentLine(AlignmentLine alignmentLine) {
        LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            return lookaheadDelegate.calculateAlignmentLine(alignmentLine);
        }
        Integer num = getAlignmentLinesOwner().calculateAlignmentLines().get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void performDraw(Canvas canvas, GraphicsLayer graphicsLayer) {
        Owner ownerRequireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
        MutableVector<LayoutNode> zSortedChildren = getLayoutNode().getZSortedChildren();
        int size = zSortedChildren.getSize();
        if (size > 0) {
            LayoutNode[] content = zSortedChildren.getContent();
            int i2 = 0;
            do {
                LayoutNode layoutNode = content[i2];
                if (layoutNode.isPlaced()) {
                    layoutNode.draw$ui_release(canvas, graphicsLayer);
                }
                i2++;
            } while (i2 < size);
        }
        if (ownerRequireOwner.getShowLayoutBounds()) {
            drawBorder(canvas, innerBoundsPaint);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    @Override // androidx.compose.ui.node.NodeCoordinator
    /* JADX INFO: renamed from: hitTestChild-YqVAtuI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo5658hitTestChildYqVAtuI(androidx.compose.ui.node.NodeCoordinator.HitTestSource r13, long r14, androidx.compose.ui.node.HitTestResult r16, boolean r17, boolean r18) {
        /*
            r12 = this;
            r11 = r18
            r0 = r12
            androidx.compose.ui.node.LayoutNode r0 = r12.getLayoutNode()
            r5 = r13
            boolean r0 = r5.shouldHitTestChildren(r0)
            r4 = 1
            r2 = 0
            r10 = r17
            r7 = r14
            if (r0 == 0) goto L72
            boolean r0 = r12.m5743withinLayerBoundsk4lQ0M(r7)
            if (r0 == 0) goto L5a
        L19:
            r2 = r4
        L1a:
            if (r2 == 0) goto L4f
            r9 = r16
            int r3 = androidx.compose.ui.node.HitTestResult.access$getHitDepth$p(r9)
            androidx.compose.ui.node.LayoutNode r0 = r12.getLayoutNode()
            androidx.compose.runtime.collection.MutableVector r0 = r0.getZSortedChildren()
            int r2 = r0.getSize()
            if (r2 <= 0) goto L4c
            int r2 = r2 - r4
            java.lang.Object[] r1 = r0.getContent()
        L35:
            r6 = r1[r2]
            androidx.compose.ui.node.LayoutNode r6 = (androidx.compose.ui.node.LayoutNode) r6
            boolean r0 = r6.isPlaced()
            if (r0 == 0) goto L48
            r5.mo5744childHitTestYqVAtuI(r6, r7, r9, r10, r11)
            boolean r0 = r9.hasHit()
            if (r0 != 0) goto L50
        L48:
            int r2 = r2 + (-1)
            if (r2 >= 0) goto L35
        L4c:
            androidx.compose.ui.node.HitTestResult.access$setHitDepth$p(r9, r3)
        L4f:
            return
        L50:
            boolean r0 = r9.getShouldSharePointerInputWithSibling()
            if (r0 == 0) goto L4c
            r9.acceptHits()
            goto L48
        L5a:
            if (r10 == 0) goto L72
            long r0 = r12.m5734getMinimumTouchTargetSizeNHjbRc()
            float r1 = r12.m5731distanceInMinimumTouchTargettz77jQw(r7, r0)
            boolean r0 = java.lang.Float.isInfinite(r1)
            if (r0 != 0) goto L72
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L72
            r11 = r2
            goto L19
        L72:
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.InnerNodeCoordinator.mo5658hitTestChildYqVAtuI(androidx.compose.ui.node.NodeCoordinator$HitTestSource, long, androidx.compose.ui.node.HitTestResult, boolean, boolean):void");
    }

    /* JADX INFO: compiled from: InnerNodeCoordinator.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#2ߛx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00053i%\nCiW۟\u0002(\u0011ѧfimqX^ŸG\u0014"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9qE\u007f%BB\b\u001f7K 8ZB?t0-\u001fu \u0017\u0011k7J\u007f+QU$", "", "u(E", "7m]2e\tHc\"}\tI(\u0001\u0012>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\u0002)FC", "5dc\u0016a5>`u\t\u000bg+\u000bs+i\t7", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#h\u001c;v%\u0004", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Paint getInnerBoundsPaint() {
            return InnerNodeCoordinator.innerBoundsPaint;
        }
    }

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo4057setColor8_81llA(Color.Companion.m4212getRed0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.mo4061setStylek9PVt8s(PaintingStyle.Companion.m4446getStrokeTiuSbCo());
        innerBoundsPaint = Paint;
    }
}
