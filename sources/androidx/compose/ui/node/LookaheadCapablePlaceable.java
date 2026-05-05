package androidx.compose.ui.node;

import androidx.collection.MutableObjectFloatMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.layout.Ruler;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.layout.VerticalRuler;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
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
/* JADX INFO: compiled from: LookaheadDelegate.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯĹ\u0014D57\u001eq\u007fZDkt\u001aA\u000e0!.J~(,\u001aw\u001dfrˎ8D{H6RY.\u0017k\u00124,[*rK;c#\u0006\"\u000f[Vg}nRZ\u0011D\u0017\u0006,xr,OX\u0001](\u000f:Bu@;M\u0006=A`z7\r H\"@y\u001b\u0001\"*^\u0010~zYK\u0014\u0012F@x:X\u000fU\u00050\u0012\u000e>&\u0001&\\uN>Hr]B/1\tqĩV'u0\u0005M\u0013H\\'#vi\u001e1@?5#*[\u0003\rWc?\u0011ayܵ\rh='3I\nW>X\u0006\u001b\u001d+e\rer,^\u000bovϯE\u000f\u007fcyO>(&z,\rj\u0005F\u0005\u000b\t1ǉ\u001ef\u0016\u0010{\u000b\u0001\u0011XP0\u001dr\u0004\t\u0001N\u0017S c/GZ~Q\u0010n_N\u007f\n\u0013M6#/0Q_bPx\u0015I\u0018>uyfN\u0002`N8\u0018ms\u00126z\u0004@\u0003^kF\u07fcɨ\u0015.\u001dk\u007fiGg9k0\u0007tk\u0005Lxh\u00022\u0019H\t0|_O*7ȱ\u000bHrD\u0004P\u0003\fr\u0011\u00160bQ\u0016\bAk\r{J`=\u0010|\u0003\u0019mx\u001au\nSz/Fg<\u0004\u000e\u0006z\u000f7C\u0014{\u0010\u0010\u0016=ܤ?\u0005p\u0013'~B\u0002J\u000b`6aJH\u0019C>{\r-\u001abJ? @d0?it\u0015vDNFON!_\t*@\u000fb\u0006<\u000fy&\u0005\t/\u0014lr\u007fg'\u000bZP\u00119;\u0016iH)(e\"\u00178\r%\u0017~\">]fz\u001dƥp\u0016{,,5$qQb??#\u000f-SB\u0004=Ez1\u0014'̊\u0016'\u0001S@#\u0004\r<@ j\u001fj\u0011\u0005X)l-2\tn\u00033\nt\u007f(\u0002t00id\rk>w\u0013a\u0010j\u0003~|M3,\u007f\u0019oP;e1Qf5\u0016&G_\u0019o9\u0002o\\E+#4Q}\u0004Z\"Fsp\u0011u2iky]\r\u001a:$\u001bN\u000bSxU B7rSQȈEdv5\u0001W\u0019\u000f\u0016f5j5p\u0005<\u0001\u00158\u0010B\u0010w*\"T&\u0014\rcU\u0015[6\u007fm\u001ck#\u000b\u001b\u001d\u0018\u000e\u00143\u0005\u0011JAv\u074bcť\r0\u000e\u058chFO@z\u0005j\u000fzҰ.ѧ\f\u000f[Vo\r\u001e\u0003PXm\u0018/4XriٙdֱzחZL\u001dbKj/5Q\u000f\u001d?6xc>[֮Hߟ3gJ\u0003Y+\u0017*;_\rv=+re\u0010а*\u0092\u0005\u000f]_I[\u0010IT_7\u0002\u0004o:INQsÄ\u001aê=[!a|El\rmfTx\u0005%7j\\8A~)\u000edۊ\u0016۪\u000f%WΓ\bd3b\\\u000bWE \u0018%\\y\u001f\u001a\u0016{FI>\\ח9ִMv\u001c՝\u0014YYU\f\u001b@\"-\u001f\u00039-o\u001c\u0003\"]IKlދ\"ȫ\u0006\u0015\u001bУ8\u00064g\u0003\u0006*0\u000eT]\u001a\u0004\u0012!}qk&A\u0017Ӷ-˭\nFcj~+q\u000f4~c.\u001bf_zPӈ/ȃ!\r?O48f\u0001\u000b#aGp\u0013\u0016\u0013Cұuߵ\nԖ-\u0014gen\u0019yZ,\u001c9X\u0004*\u0010[ëV$\u0006Υ\u0012w\nUbTeQdzVd7\u000bCܧYҋ]ȥݣcsצ-\u0018\u0015\u0001N\u000e\u001fC\u0005v\u0001O|SG\u001b/[;zp\u001f\u0014[Y81AbA+7`+\u001e]_\u0017\u0013<rt.J!?!4}+[x+ط&ž]$uѦS5Y|PB60GRŔ3^P\"D\u0015(U\feA{1\u0019\u0011\u0017H\u0006\u001e:/4\u0019\r*Ϻ6ʫ\u0001\u0001\u0015ׄJEyv\f?\u0003%?\u000f\u001eNmei`\f\u0590Xۡ\u0010\u0002mڄӰMl^\u0012gϔecD&y[_½\u000e\u0004"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9tF\u0001+1\\}\u001c6K\u00129I@Bk\u001f%\u0011fa5\u0004j,$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9u<r3Ef}\u000e5w!.?GJn\u001b\u001a)rqHom+NL", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uF\u0006)?bj 8m#.VA;V;\u001a\u0013hi9\u0010r\u000bN}'IH],2", "u(E", "-qd9X9,Q#\nz", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006c5<Y\u000b\u000e5w!.#", "/kX4a4>\\(e~g,\u000brAn\u007f5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9iCz'>a})FT\u001a7MQ%}=\u001e\">", "5dc\u000e_0@\\!~\u0004m\u0013\u0001\u0012/si:\u0005@\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006R,9[\u0007(7v%\u0015QL;y\u001e0\u001ehn\u000f", "1gX9W", "5dc\u0010[0ER", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]/?_y#7i\u0015\fIN7h;\u001e\u007fo]7\u0007_)Uv|", "1n^?W0GO(~\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "5dc\u0010b6KR\u001d\bvm,\u000b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001cU\u0012*G|s8WP:o=\u001a$ho\u000f", "6`b\u001aX(Lc&~g^:\r\u0010>", "", "5dc\u0015T:&S\u0015\r\u000bk,i\t=u\u00077", "u(I", "7r;<b2B\\\u001bZ}^({", "7r;<b2B\\\u001bZ}^({G+n\t2\u000b<\u0010\u001b!P}", "7r?9T*>R\t\by^9d\u0013>i\n1\\M|\u001f\u00171pz<w%BY\u0007\u001e7", "Adc\u001d_(<S\u0018n\u0004],\np9t\u00042\u0005!\u000e\u0013\u001fGY\u000f)v&5f})5m", "uY\u0018#", "7r?9T*B\\\u001b_\u0005k\b\u0004\r1n\b(\u0005O", "7r?9T*B\\\u001b_\u0005k\b\u0004\r1n\b(\u0005O?'\u001bA|\u000eCv!CY", "Adc\u001d_(<W\"\u0001[h9X\u00103g\t0{I\u0010U'Ki\u001b<}%1g}", "7rB5T3E]+i\u0002Z*\u0001\u00121", "7rB5T3E]+i\u0002Z*\u0001\u00121$\u0010,uM\u0001\u001e\u0017C}\u000e", "Adc [(EZ#\u0011ee(z\r8g>8\u007f:\u000e\u0017\u001eGk\u001c<", ":`h<h;']\u0018~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mk", "5dc\u0019T@Hc(g\u0005],", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]!Ic\u000e/ w\u0015.#", ";dP@h9>@\u0019\r\u000be;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "5dc\u001aX(Lc&~g^:\r\u0010>$\u0010,uM\u0001\u001e\u0017C}\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001dYy.Gz\u0016\u001bMQKrCs", ">`a2a;", "5dc\u001dT9>\\(", ">kP0X4>\\(lxh7|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016l8J7i4&\u0015qp'\u0005m7NL", "5dc\u001d_(<S!~\u0004m\u001az\u0013:e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n `y\u001e7i\u00135M\u0002&r0\u001c\u0015paB\u0016Q*X\u0002'\u001d", ">nb6g0H\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "5dc\u001db:Bb\u001d\t\u0004&5f\u0007--{&", "u(9", "@t[2e\u0019>O\u0018~\bl", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<d#1h\r DU\u00129#", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006c5<Y\u000bu", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<d#1h\r D[\u0016=#", "\u001aiPCTuEO\"\u0001Dk,}R!e{.h@\u0002\u0017$Gx\f<L", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9\u007f<r+\"Y~ Dm\u001f,M\u0019", "@t[2e\u001a<]$~", "5dc\u001fh3>`\u0007|\u0005i,", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\"i\u0005 D[\u00148XC\u0011", "@t[2e\u001d:Z)~\t", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<`\":Y{/\u0018t *\\+7v\n", "@t[2e\u001d:Z)~\t<(z\f/", "/cS\u001fh3>`\u0006~v],\n", "", "@t[2e", "1`[0h3:b\u0019Z\u0002b.\u0006\u0011/n\u000f\u000f\u007fI\u0001", "", "/kX4a4>\\(e~g,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", "1`_Ah9>@)\u0006zk:", "@dbB_;", "1`_Ah9>@)\u0006zk:;\u00193_\r(\u0003@|%\u0017", ">kP0X(;Z\u0019kzl<\u0004\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9xCr#5Uz'7Z\u0016<]JJA", "4h]145<S'\u000e\u0005k\u0019\r\u0010/r^(|D\n\u0017$", "4h]1E<ES&ove<|", "", "2dU.h3MD\u0015\u0006\u000b^", "5dc", "7me._0=O(~Xa0\u0004\b<e\t\u0012|\u001f\u0001\u0018\u001bPs\u0017>c5<Y\u000b", ":`h<h;", "EhSA[", "6dX4[;", "/kX4a4>\\(e~g,\u000b", "", "@t[2e:", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", ">kP0X4>\\([\u0002h*\u0003", "<nc6Y@+c ~\bO(\u0004\u0019/C\u0003$\u0005B\u0001", ":`h<h;']\u0018~\t", ">q^C\\+>@\u0019\u0006vm0\u000e\t\u001cu\u0007(\t1|\u001e'G", "D`[BX", ">q^C\\+>@)\u0006zk\u001dx\u0010?e", "@d_9T*>", "@d_9T*>\u0012)\u0003tk,\u0004\t+s\u007f", "7me._0=O(~Ve0~\u00127e\t7bD\n\u0017%(|\u0018Da/C]\r$Avs1IL=k", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u0013c\b-6q\u001f*\\MHA", "7r;.l6Nb\u0002\ty^\b\u0006\u0007/s\u000f2\t", "/mR2f;H`", "\u0011n\\=T5B]\"", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class LookaheadCapablePlaceable extends Placeable implements MeasureScopeWithLayoutNode, MotionReferencePlacementDelegate {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Function1<PlaceableResult, Unit> onCommitAffectingRuler = new Function1<PlaceableResult, Unit>() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PlaceableResult placeableResult) {
            invoke2(placeableResult);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PlaceableResult placeableResult) {
            if (placeableResult.isValidOwnerScope()) {
                placeableResult.getPlaceable().captureRulers(placeableResult);
            }
        }
    };
    private RulerScope _rulerScope;
    private boolean isPlacedUnderMotionFrameOfReference;
    private boolean isPlacingForAlignment;
    private boolean isShallowPlacing;
    private final Placeable.PlacementScope placementScope = PlaceableKt.PlacementScope(this);
    private MutableScatterMap<Ruler, MutableScatterSet<WeakReference<LayoutNode>>> rulerReaders;
    private MutableObjectFloatMap<Ruler> rulerValues;
    private MutableObjectFloatMap<Ruler> rulerValuesCache;

    public static /* synthetic */ void isLookingAhead$annotations() {
    }

    public abstract int calculateAlignmentLine(AlignmentLine alignmentLine);

    public abstract AlignmentLinesOwner getAlignmentLinesOwner();

    public abstract LookaheadCapablePlaceable getChild();

    public abstract LayoutCoordinates getCoordinates();

    public abstract boolean getHasMeasureResult();

    @Override // androidx.compose.ui.node.MeasureScopeWithLayoutNode
    public abstract LayoutNode getLayoutNode();

    public abstract MeasureResult getMeasureResult$ui_release();

    public abstract LookaheadCapablePlaceable getParent();

    /* JADX INFO: renamed from: getPosition-nOcc-ac */
    public abstract long mo5692getPositionnOccac();

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return false;
    }

    public abstract void replace$ui_release();

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public boolean isPlacedUnderMotionFrameOfReference() {
        return this.isPlacedUnderMotionFrameOfReference;
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public void setPlacedUnderMotionFrameOfReference(boolean z2) {
        this.isPlacedUnderMotionFrameOfReference = z2;
    }

    public final RulerScope getRulerScope() {
        RulerScope rulerScope = this._rulerScope;
        return rulerScope == null ? new RulerScope() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$rulerScope$1
            @Override // androidx.compose.ui.layout.RulerScope
            public LayoutCoordinates getCoordinates() {
                this.this$0.getLayoutNode().getLayoutDelegate$ui_release().onCoordinatesUsed();
                return this.this$0.getCoordinates();
            }

            @Override // androidx.compose.ui.layout.RulerScope
            public void provides(Ruler ruler, float f2) {
                this.this$0.provideRulerValue(ruler, f2);
            }

            @Override // androidx.compose.ui.layout.RulerScope
            public void providesRelative(VerticalRuler verticalRuler, float f2) {
                this.this$0.provideRelativeRulerValue(verticalRuler, f2);
            }

            @Override // androidx.compose.ui.unit.Density
            public float getDensity() {
                return this.this$0.getDensity();
            }

            @Override // androidx.compose.ui.unit.FontScaling
            public float getFontScale() {
                return this.this$0.getFontScale();
            }
        } : rulerScope;
    }

    @Override // androidx.compose.ui.layout.Measured
    public final int get(AlignmentLine alignmentLine) {
        int iCalculateAlignmentLine;
        if (getHasMeasureResult() && (iCalculateAlignmentLine = calculateAlignmentLine(alignmentLine)) != Integer.MIN_VALUE) {
            return iCalculateAlignmentLine + (alignmentLine instanceof VerticalAlignmentLine ? IntOffset.m6766getXimpl(m5572getApparentToRealOffsetnOccac()) : IntOffset.m6767getYimpl(m5572getApparentToRealOffsetnOccac()));
        }
        return Integer.MIN_VALUE;
    }

    public final boolean isShallowPlacing$ui_release() {
        return this.isShallowPlacing;
    }

    public final void setShallowPlacing$ui_release(boolean z2) {
        this.isShallowPlacing = z2;
    }

    public final boolean isPlacingForAlignment$ui_release() {
        return this.isPlacingForAlignment;
    }

    public final void setPlacingForAlignment$ui_release(boolean z2) {
        this.isPlacingForAlignment = z2;
    }

    public final Placeable.PlacementScope getPlacementScope() {
        return this.placementScope;
    }

    protected final void invalidateAlignmentLinesFromPositionChange(NodeCoordinator nodeCoordinator) {
        AlignmentLines alignmentLines;
        NodeCoordinator wrapped$ui_release = nodeCoordinator.getWrapped$ui_release();
        if (!Intrinsics.areEqual(wrapped$ui_release != null ? wrapped$ui_release.getLayoutNode() : null, nodeCoordinator.getLayoutNode())) {
            nodeCoordinator.getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            return;
        }
        AlignmentLinesOwner parentAlignmentLinesOwner = nodeCoordinator.getAlignmentLinesOwner().getParentAlignmentLinesOwner();
        if (parentAlignmentLinesOwner == null || (alignmentLines = parentAlignmentLinesOwner.getAlignmentLines()) == null) {
            return;
        }
        alignmentLines.onAlignmentsChanged();
    }

    public final float findRulerValue(Ruler ruler, float f2) {
        if (this.isPlacingForAlignment) {
            return f2;
        }
        LookaheadCapablePlaceable lookaheadCapablePlaceable = this;
        while (true) {
            MutableObjectFloatMap<Ruler> mutableObjectFloatMap = lookaheadCapablePlaceable.rulerValues;
            float orDefault = mutableObjectFloatMap != null ? mutableObjectFloatMap.getOrDefault(ruler, Float.NaN) : Float.NaN;
            if (!Float.isNaN(orDefault)) {
                lookaheadCapablePlaceable.addRulerReader(getLayoutNode(), ruler);
                return ruler.calculateCoordinate$ui_release(orDefault, lookaheadCapablePlaceable.getCoordinates(), getCoordinates());
            }
            LookaheadCapablePlaceable parent = lookaheadCapablePlaceable.getParent();
            if (parent == null) {
                lookaheadCapablePlaceable.addRulerReader(getLayoutNode(), ruler);
                return f2;
            }
            lookaheadCapablePlaceable = parent;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void addRulerReader(androidx.compose.ui.node.LayoutNode r27, androidx.compose.ui.layout.Ruler r28) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LookaheadCapablePlaceable.addRulerReader(androidx.compose.ui.node.LayoutNode, androidx.compose.ui.layout.Ruler):void");
    }

    private final LookaheadCapablePlaceable findAncestorRulerDefiner(Ruler ruler) {
        LookaheadCapablePlaceable parent;
        LookaheadCapablePlaceable lookaheadCapablePlaceable = this;
        while (true) {
            MutableObjectFloatMap<Ruler> mutableObjectFloatMap = lookaheadCapablePlaceable.rulerValues;
            if ((mutableObjectFloatMap != null && mutableObjectFloatMap.contains(ruler)) || (parent = lookaheadCapablePlaceable.getParent()) == null) {
                return lookaheadCapablePlaceable;
            }
            lookaheadCapablePlaceable = parent;
        }
    }

    private final boolean isLayoutNodeAncestor(LayoutNode layoutNode, LayoutNode layoutNode2) {
        if (layoutNode == layoutNode2) {
            return true;
        }
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (parent$ui_release != null) {
            return isLayoutNodeAncestor(parent$ui_release, layoutNode2);
        }
        return false;
    }

    private final void invalidateChildrenOfDefiningRuler(Ruler ruler) {
        MutableScatterMap<Ruler, MutableScatterSet<WeakReference<LayoutNode>>> mutableScatterMap = findAncestorRulerDefiner(ruler).rulerReaders;
        MutableScatterSet<WeakReference<LayoutNode>> mutableScatterSetRemove = mutableScatterMap != null ? mutableScatterMap.remove(ruler) : null;
        if (mutableScatterSetRemove != null) {
            notifyRulerValueChange(mutableScatterSetRemove);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.node.LookaheadCapablePlaceable$layout$1 */
    /* JADX INFO: compiled from: LookaheadDelegate.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я1\u001d̉=!4i\bӵLc\u0003&I\u0006F\u000b6B\r(4\u0012}\u000bnjO0Le^.ZS8\u000fs{J$c$wGcTڼ\u0004*\u001fѧ~g\u0016m\u0013`\u0019U'\u0006D\u00051@\u001as\u0007]*\u001bBD\u007f?aO\u007f?I`#93!hv\u000fѝ\u0007в\u001e.`\u0012|~QP\\$>F\t:\u0001\u0010\u0004YpŞ\b̧$\u00056^mUDP=\u0003H8;\u0016yD^'\u000e;\rO\u001dF\u00033#u\u0010(ҋD7;\"[(YޮTÜC\u0007WsC\u0013v6w=W\u0004o6\u0007\u0003Ji\u0002̔\u000fǁv*t\u0007Wq\u001a/ˬSv"}, d2 = {"/mS?b0=fb|\u0005f7\u0007\u0017//\u0010,EI\u000b\u0016\u0017\u0011V\u0018F|!8Yy\u001f\u0015i!*JJ;V;\u001a\u0013h]6\u000ecjUr;Q\\]j(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "/kX4a4>\\(e~g,\u000b", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", "", "5dc\u000e_0@\\!~\u0004m\u0013\u0001\u0012/s", "u(;7T=:\u001d)\u000e~eud\u0005:;", "6dX4[;", "5dc\u0015X0@V(", "u(8", "@t[2e:", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006c5<Y\u000b\u000e5w!.#", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "5dc\u001fh3>`'", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "EhSA[", "5dc$\\+MV", ">kP0X\nAW }\b^5", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements MeasureResult {
        final /* synthetic */ Map<AlignmentLine, Integer> $alignmentLines;
        final /* synthetic */ int $height;
        final /* synthetic */ Function1<Placeable.PlacementScope, Unit> $placementBlock;
        final /* synthetic */ Function1<RulerScope, Unit> $rulers;
        final /* synthetic */ int $width;
        final /* synthetic */ LookaheadCapablePlaceable this$0;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(int i2, int i3, Map<AlignmentLine, Integer> map, Function1<? super RulerScope, Unit> function1, Function1<? super Placeable.PlacementScope, Unit> function12, LookaheadCapablePlaceable lookaheadCapablePlaceable) {
            i = i2;
            i = i3;
            map = map;
            function1 = function1;
            function1 = function12;
            lookaheadCapablePlaceable = lookaheadCapablePlaceable;
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        public int getWidth() {
            return i;
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        public int getHeight() {
            return i;
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        public Map<AlignmentLine, Integer> getAlignmentLines() {
            return map;
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        public Function1<RulerScope, Unit> getRulers() {
            return function1;
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        public void placeChildren() {
            function1.invoke(lookaheadCapablePlaceable.getPlacementScope());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void captureRulers$ui_release(androidx.compose.ui.layout.MeasureResult r16) {
        /*
            r15 = this;
            r1 = r16
            if (r1 == 0) goto Ld
            androidx.compose.ui.node.PlaceableResult r0 = new androidx.compose.ui.node.PlaceableResult
            r0.<init>(r1, r15)
            r15.captureRulers(r0)
        Lc:
            return
        Ld:
            androidx.collection.MutableScatterMap<androidx.compose.ui.layout.Ruler, androidx.collection.MutableScatterSet<java.lang.ref.WeakReference<androidx.compose.ui.node.LayoutNode>>> r0 = r15.rulerReaders
            if (r0 == 0) goto L5b
            androidx.collection.ScatterMap r0 = (androidx.collection.ScatterMap) r0
            java.lang.Object[] r10 = r0.values
            long[] r9 = r0.metadata
            int r0 = r9.length
            int r8 = r0 + (-2)
            if (r8 < 0) goto L5b
            r14 = 0
            r7 = r14
        L1e:
            r3 = r9[r7]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r3
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r0 + r11
            long r0 = r0 | r11
            long r5 = r5 - r0
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 == 0) goto L56
            int r0 = r7 - r8
            int r0 = ~r0
            int r0 = r0 >>> 31
            r11 = 8
            int r6 = 8 - r0
            r5 = r14
        L3b:
            if (r5 >= r6) goto L54
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r3
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 >= 0) goto L50
            int r0 = r7 << 3
            int r0 = r0 + r5
            r0 = r10[r0]
            androidx.collection.MutableScatterSet r0 = (androidx.collection.MutableScatterSet) r0
            r15.notifyRulerValueChange(r0)
        L50:
            long r3 = r3 >> r11
            int r5 = r5 + 1
            goto L3b
        L54:
            if (r6 != r11) goto L5b
        L56:
            if (r7 == r8) goto L5b
            int r7 = r7 + 1
            goto L1e
        L5b:
            androidx.collection.MutableScatterMap<androidx.compose.ui.layout.Ruler, androidx.collection.MutableScatterSet<java.lang.ref.WeakReference<androidx.compose.ui.node.LayoutNode>>> r0 = r15.rulerReaders
            if (r0 == 0) goto L62
            r0.clear()
        L62:
            androidx.collection.MutableObjectFloatMap<androidx.compose.ui.layout.Ruler> r0 = r15.rulerValues
            if (r0 == 0) goto Lc
            r0.clear()
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LookaheadCapablePlaceable.captureRulers$ui_release(androidx.compose.ui.layout.MeasureResult):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void captureRulers(androidx.compose.ui.node.PlaceableResult r23) {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LookaheadCapablePlaceable.captureRulers(androidx.compose.ui.node.PlaceableResult):void");
    }

    /* JADX INFO: renamed from: androidx.compose.ui.node.LookaheadCapablePlaceable$captureRulers$3 */
    /* JADX INFO: compiled from: LookaheadDelegate.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends Lambda implements Function0<Unit> {
        final /* synthetic */ LookaheadCapablePlaceable this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(LookaheadCapablePlaceable lookaheadCapablePlaceable) {
            super(0);
            lookaheadCapablePlaceable = lookaheadCapablePlaceable;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            Function1<RulerScope, Unit> rulers = placeableResult.getResult().getRulers();
            if (rulers != null) {
                rulers.invoke(lookaheadCapablePlaceable.getRulerScope());
            }
        }
    }

    private final void notifyRulerValueChange(MutableScatterSet<WeakReference<LayoutNode>> mutableScatterSet) {
        LayoutNode layoutNode;
        MutableScatterSet<WeakReference<LayoutNode>> mutableScatterSet2 = mutableScatterSet;
        Object[] objArr = mutableScatterSet2.elements;
        long[] jArr = mutableScatterSet2.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((-1) - (((-1) - ((-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2)))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128 && (layoutNode = (LayoutNode) ((WeakReference) objArr[(i2 << 3) + i4]).get()) != null) {
                        if (isLookingAhead()) {
                            layoutNode.requestLookaheadRelayout$ui_release(false);
                        } else {
                            layoutNode.requestRelayout$ui_release(false);
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void provideRulerValue(Ruler ruler, float f2) {
        MutableObjectFloatMap<Ruler> mutableObjectFloatMap = this.rulerValues;
        if (mutableObjectFloatMap == null) {
            mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
            this.rulerValues = mutableObjectFloatMap;
        }
        mutableObjectFloatMap.set(ruler, f2);
    }

    public final void provideRelativeRulerValue(Ruler ruler, float f2) {
        MutableObjectFloatMap<Ruler> mutableObjectFloatMap = this.rulerValues;
        if (mutableObjectFloatMap == null) {
            mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
            this.rulerValues = mutableObjectFloatMap;
        }
        if (getLayoutDirection() != LayoutDirection.Ltr) {
            f2 = getWidth() - f2;
        }
        mutableObjectFloatMap.set(ruler, f2);
    }

    /* JADX INFO: compiled from: LookaheadDelegate.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012\u0006\u0007nʑ?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\fm(~:\u0015_Pwg\u001dMj\rS\u000f4\u001a'l\u0003ղWޯa\u0012\u0017˰ԸsD"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9tF\u0001+1\\}\u001c6K\u00129I@Bk\u001f%\u0011fa5\u0004j,\rT1OWJ5`\\{\u0013", "", "u(E", "=m2<`4Bbt\u007f{^*\f\r8gl8\u0003@\u000e", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9xCr#5Uz'7Z\u0016<]JJA", "", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public MeasureResult layout(int i2, int i3, Map<AlignmentLine, Integer> map, Function1<? super RulerScope, Unit> function1, Function1<? super Placeable.PlacementScope, Unit> function12) {
        if (!((i2 + ViewCompat.MEASURED_STATE_MASK) - (i2 | ViewCompat.MEASURED_STATE_MASK) == 0 && (-1) - (((-1) - ViewCompat.MEASURED_STATE_MASK) | ((-1) - i3)) == 0)) {
            InlineClassHelperKt.throwIllegalStateException("Size(" + i2 + " x " + i3 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable.layout.1
            final /* synthetic */ Map<AlignmentLine, Integer> $alignmentLines;
            final /* synthetic */ int $height;
            final /* synthetic */ Function1<Placeable.PlacementScope, Unit> $placementBlock;
            final /* synthetic */ Function1<RulerScope, Unit> $rulers;
            final /* synthetic */ int $width;
            final /* synthetic */ LookaheadCapablePlaceable this$0;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(int i22, int i32, Map<AlignmentLine, Integer> map2, Function1<? super RulerScope, Unit> function13, Function1<? super Placeable.PlacementScope, Unit> function122, LookaheadCapablePlaceable this) {
                i = i22;
                i = i32;
                map = map2;
                function1 = function13;
                function1 = function122;
                lookaheadCapablePlaceable = this;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return i;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return i;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return map;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public Function1<RulerScope, Unit> getRulers() {
                return function1;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
                function1.invoke(lookaheadCapablePlaceable.getPlacementScope());
            }
        };
    }
}
