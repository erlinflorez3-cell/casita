package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNodeCoordinator;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.ViewCompat;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:254)
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
/* JADX INFO: compiled from: ApproachMeasureScope.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яį\u0014D57\u001eq\u007fZDkt\u001aA\u000e0!.Jչ*,(w\u000f߿r9FDmH4R[*\u001dt\u00044*d,qQ@]\u001a\u0004&\u0011OdgonP[\u0013C%\u0006\u001exp-QU\u000f]\u001a\u000f8Bw?IMw=O`|6\u000b!:\"Ny\rЏ\"*V\u0016~zIK\u0014\u0012>bx:h\rUĨ\"\u0012\u001c>(\u00014\\oNDHt]P/+\u0003oBV'u0\u0005M\u0013F\\'#vi\u001e1G?5+%[\u0003\u001dRc?\tDy=\u001bh/'AI{W<^\u0006Ϭ+ۀ\u007f\r\fqV\\3Q\u0011\fU,\u0010v[T\u001c*\u0010z*\u0010L\b\u001c\n?H\\2բj\b\u001c9=Qajh\u0002\rm0~ob/%.`[=)\u0015iaiF~G\n4%*3\u0003~!\n\u0006\u001eb%\u001b\u0003%\u007fa\u0002WKzf\u001di?}\u0004\u001f\u0017\u0012,\u00140u5Ez?aϲ)7aoS6y9`Uwx\u0015`\u0017zyTX@P$DjҊ\r\f`z+\u00194\u0017b\u0003D\u0011{G\u0005\u000b\f4+ \u000b%l%3>fO\u0017\u0017\u001b_c\n3^~Cip{\u000e\u0006jn5EQ\u0012=\u0010\u0003')Msz\u0016hhRS:\u0002l*22v >+ԞHN\u0012IxƄpdI:i1\\Cu+\u001epzCș^̬gɭњX5*=w_=\u001e\u000f\ttp\u001e\u0015!IZ9'č,݄PځԊ*W(&B;k\u001c\r3\u0018G\u0016\u0006oL\u001bR<ɵzĆ\u0015֝\u07fcU1CS\u001d@qJ\u0010l]L!\u001fyM@;A۸xԱ:gؤfōϡt.f-X\u0013\u001d/06vrQA\r\u007f(\u000f\rہFуS\nѮ=δ\u03a2\u0007[B\u0011FAM4,j\u0019oPC]-qncɎvԚ.֒˸akuv\b,W0\u00030\u001c,\u0012<\u0018b\u007f\u0004xO\u0001^gJV\"R\u0001+Bv$>ټA߿3ؿάLCj=d{\u0016 =I~\u0007Z!\u0019V\nvY̢|ԧ-ɾͫwE\u0004al\u0005m\u001c[\"\u007fm\u001c\u001b\u0005\u000bx_Pβzy\u0004 mU \u0005\u001f\u000b\t^L:͐5ن:ؠƀ@\u000b*\u0007:\u0006P Q(\u0002\u0006>7(F\u000eH]ЀAȶ:ٙոXzb+VZ)]ntB\u0001-K[\u001e'IwܢlݧS.ӫ1ܬӘ!\u000b!A]T/=9\u0018l9Id\u0001\u00019r$ŵHϲ5\u0003ܔ(ԖÃs\u000e>n\u000bt\u00130)@i\u0011\u000e~\u0007͝\u0017ڀhZlɺ*hXW03\u001f|\u0003\u0019J\u0016_#'S\u000bo\u00112#Ϝ\u0004̢G&\tҿ\\+\r\u0019\u000bqf\u001d3\u0015C=\u000eXx\u0016?{\u0006Vȯ\u0002\u000e(é?\u0006z2ji^x\u0018p3:D\u0006LvXƙ\u0016ц$\bFLz\b\u0018DXH]\u0019K\u0002Ar\u0010\u007fN̒CӲ/p\u001eDQ\u0001\u0007 4~q\bm\u000b1ng+PҾ/ȃ!\r?O4,fd\u000b!a:p\u0011./kӈ\"߱\ffA\u0012U\u007fv\u000e<gi+C/\u001aI\u0018\u0006\u0007ݓ ߒ\u001eݗɚ\u0003)ķ,\u0019SXS^r*-\u0005Py&^\u0019K\u001bIbà\u0016В}Ĝז\u0010\u0012̭Jv6f5['@,#U\u0006\u001f\u0004soN!_yuo\u000e\u05cf\rÃ,z)\u0005@\u000b\u0003)ˢB\u0012z\u0003mǊItSE\u001a-xާq="}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R0@f\b\u001c5p}.IQKx4\f\u0013rl9jk7UL", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R0@f\b\u001c5p}.IQKx4\f\u0013rl9\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]/?_y#7i\u0015\u001cKMFk\n", "1n^?W0GO(\t\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehe*6q\u00172MP$u3\u001errkF\u0006g5J\u00061T\"", "/o_?b(<V\u0002\ty^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R0@f\b\u001c5p|*aMKz\u001c(\u0014lb=\u0007p\u0015Xu'\u001d", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW#r9?i\r\bAl\u001a/QCHT>\u001d\u0015FkC\u0014b0Wr6QY$\u0013X[qJ\u001e\u0016Y!\u0018)\u0017\rdK2n\u000eG#Q3E\u0016Ex\u0010Uq\u0019@wz>T\u0013.u)\u007fQ8PPXczKARK4c\f5`M", "/o_?b(<V\u0001~vl<\n\t\u001ce\f8\u007fM\u0001\u0016", "", "5dc\u000ec7K]\u0015|}F,x\u0017?r\u007f\u0015{L\u0011\u001b$GnLLz\u001fBY\u0005 3{\u0016", "u(I", "Adc\u000ec7K]\u0015|}F,x\u0017?r\u007f\u0015{L\u0011\u001b$GnLLz\u001fBY\u0005 3{\u0016", "uY\u0018#", "5dc\u000ec7K]\u0015|}G6{\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u0011d\t-Ai\u001414?OuD-|r`=\bg,[_1FL$", "Adc\u000ec7K]\u0015|}G6{\t", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\u0001@d\u000b*3k\u0019\u0015IWE{C\u0006\u001fge:\u000bc97\u0001&G\"\u0012\u001d", "5dc\u0010b6KR\u001d\bvm6\n", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]!Ic\u000e/\u001fw\u00152NG;x\u001d(\u0014h?C\u0011p+R\u007f#VV[\u0002", "2d]@\\;R", "", "5dc\u0011X5LW(\u0013", "u(5", "4n]AF*:Z\u0019", "5dc\u0013b5MA\u0017z\u0002^", "7r;<b2B\\\u001bZ}^({", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "5dc\u0019T@Hc(]~k,z\u00183o\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=s", ":n^8T/>O\u0018\\\u0005g:\f\u0016+i\t7\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "5dc\u0019b6DO\u001c~v]\n\u0007\u0012=t\r$\u007fI\u0010%^O}m!r\u0004;", "u(9", ":n^8T/>O\u0018l~s,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "5dc\u0019b6DO\u001c~v]\u001a\u0001\u001e/-s%\u0010Hgc\u0019", ":n^8T/>O\u0018lxh7|f9o\r'\u007fI|&\u0017U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016l8J7i4&\u0015qp'\u0005m7NL", "5dc\u0019b6DO\u001c~v]\u001az\u0013:e]2\u0006M\u007f\u001b C~\u000eJ", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\u0010<U{ 3j\u001d.\f.Bg2\u001e\u001dhjHta6Yv|\u000b3J5[_|A\u0013%$\fX3\u0018\u000fgAm~H\u0001&\u0004@S\u0012J2g\b*\u0018EyNL`\u001dF}\u001eqP)v\u001c", ":`h<h;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "EhSA[", "", "6dX4[;", "/kX4a4>\\(e~g,\u000b", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", "@t[2e:", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006c5<Y\u000b\u000e5w!.#", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", ">kP0X4>\\([\u0002h*\u0003", "@nd;W\u001bH>,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "@nd;W\u001bH>,FE/~G\u000e)4", "uE\u0018\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/\r", "@nd;W\u001bH>,FBKxo\u0003\u007fo", "uI\u0018\u0016", "Bn3=", "Bn3= \u000e:<d]n:", "uI\u0018\u0013", "Bn3= <\u000bc#ljF", "uE\u0018\u0013", "uH\u0018\u0013", "Bn3=F0SS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGd)JYS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "Bn3=F0SS`\u0005Bk-my\u0017", "uI\u0018\u0017", "Bn;<b2:V\u0019zy<6\u0007\u0016.i\t$\u000b@\u000f", "Bn?E", "Bn?E v\u000f&c\u0004t-", "Bn?E s+ \fxKh", "BnA2V;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGc%3hS", "BnB6m,", "BnB6m,\u0006F\u001fzlG\u001bh", "BnB=", "BnB= vQ;\tNyh", "uE\u0018\u0017", "BnB= 2)he`\u000f-", "uH\u0018\u0017", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ApproachMeasureScopeImpl implements ApproachMeasureScope, MeasureScope, LookaheadScope {
    public static final int $stable = 0;
    private boolean approachMeasureRequired;
    private ApproachLayoutModifierNode approachNode;
    private final LayoutModifierNodeCoordinator coordinator;

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return false;
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public MeasureResult layout(int i2, int i3, Map<AlignmentLine, Integer> map, Function1<? super Placeable.PlacementScope, Unit> function1) {
        return this.coordinator.layout(i2, i3, map, function1);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    public int mo703roundToPxR2X_6o(long j2) {
        return this.coordinator.mo703roundToPxR2X_6o(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    public int mo704roundToPx0680j_4(float f2) {
        return this.coordinator.mo704roundToPx0680j_4(f2);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public float mo705toDpGaN1DYA(long j2) {
        return this.coordinator.mo705toDpGaN1DYA(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public float mo706toDpu2uoSUM(float f2) {
        return this.coordinator.mo706toDpu2uoSUM(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public float mo707toDpu2uoSUM(int i2) {
        return this.coordinator.mo707toDpu2uoSUM(i2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    public long mo708toDpSizekrfVVM(long j2) {
        return this.coordinator.mo708toDpSizekrfVVM(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx--R2X_6o */
    public float mo709toPxR2X_6o(long j2) {
        return this.coordinator.mo709toPxR2X_6o(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx-0680j_4 */
    public float mo710toPx0680j_4(float f2) {
        return this.coordinator.mo710toPx0680j_4(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    public Rect toRect(DpRect dpRect) {
        return this.coordinator.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    public long mo711toSizeXkaWNTQ(long j2) {
        return this.coordinator.mo711toSizeXkaWNTQ(j2);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public long mo712toSp0xMU5do(float f2) {
        return this.coordinator.mo712toSp0xMU5do(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public long mo713toSpkPz2Gy4(float f2) {
        return this.coordinator.mo713toSpkPz2Gy4(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public long mo714toSpkPz2Gy4(int i2) {
        return this.coordinator.mo714toSpkPz2Gy4(i2);
    }

    public ApproachMeasureScopeImpl(LayoutModifierNodeCoordinator layoutModifierNodeCoordinator, ApproachLayoutModifierNode approachLayoutModifierNode) {
        this.coordinator = layoutModifierNodeCoordinator;
        this.approachNode = approachLayoutModifierNode;
    }

    public final LayoutModifierNodeCoordinator getCoordinator() {
        return this.coordinator;
    }

    public final ApproachLayoutModifierNode getApproachNode() {
        return this.approachNode;
    }

    public final void setApproachNode(ApproachLayoutModifierNode approachLayoutModifierNode) {
        this.approachNode = approachLayoutModifierNode;
    }

    @Override // androidx.compose.ui.layout.ApproachIntrinsicMeasureScope
    /* JADX INFO: renamed from: getLookaheadConstraints-msEJaDk */
    public long mo5488getLookaheadConstraintsmsEJaDk() {
        Constraints constraintsM5660getLookaheadConstraintsDWUhwKw$ui_release = this.coordinator.m5660getLookaheadConstraintsDWUhwKw$ui_release();
        if (constraintsM5660getLookaheadConstraintsDWUhwKw$ui_release != null) {
            return constraintsM5660getLookaheadConstraintsDWUhwKw$ui_release.m6597unboximpl();
        }
        throw new IllegalArgumentException("Error: Lookahead constraints requested before lookahead measure.".toString());
    }

    @Override // androidx.compose.ui.layout.ApproachIntrinsicMeasureScope
    /* JADX INFO: renamed from: getLookaheadSize-YbymL2g */
    public long mo5489getLookaheadSizeYbymL2g() {
        LookaheadDelegate lookaheadDelegate = this.coordinator.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        MeasureResult measureResult$ui_release = lookaheadDelegate.getMeasureResult$ui_release();
        return IntSizeKt.IntSize(measureResult$ui_release.getWidth(), measureResult$ui_release.getHeight());
    }

    public final boolean getApproachMeasureRequired$ui_release() {
        return this.approachMeasureRequired;
    }

    public final void setApproachMeasureRequired$ui_release(boolean z2) {
        this.approachMeasureRequired = z2;
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public LayoutCoordinates toLookaheadCoordinates(LayoutCoordinates layoutCoordinates) {
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates;
        if (layoutCoordinates instanceof LookaheadLayoutCoordinates) {
            return layoutCoordinates;
        }
        if (layoutCoordinates instanceof NodeCoordinator) {
            LookaheadDelegate lookaheadDelegate = ((NodeCoordinator) layoutCoordinates).getLookaheadDelegate();
            return (lookaheadDelegate == null || (lookaheadLayoutCoordinates = lookaheadDelegate.getLookaheadLayoutCoordinates()) == null) ? layoutCoordinates : lookaheadLayoutCoordinates;
        }
        throw new IllegalArgumentException("Unsupported LayoutCoordinates: " + layoutCoordinates);
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public LayoutCoordinates getLookaheadScopeCoordinates(Placeable.PlacementScope placementScope) {
        NodeCoordinator outerCoordinator$ui_release;
        LayoutNode lookaheadRoot$ui_release = this.coordinator.getLayoutNode().getLookaheadRoot$ui_release();
        if (lookaheadRoot$ui_release == null) {
            throw new IllegalArgumentException("Error: Requesting LookaheadScopeCoordinates is not permitted from outside of a LookaheadScope.".toString());
        }
        if (!lookaheadRoot$ui_release.isVirtualLookaheadRoot$ui_release()) {
            return lookaheadRoot$ui_release.getOuterCoordinator$ui_release();
        }
        LayoutNode parent$ui_release = lookaheadRoot$ui_release.getParent$ui_release();
        if (parent$ui_release == null || (outerCoordinator$ui_release = parent$ui_release.getInnerCoordinator$ui_release()) == null) {
            outerCoordinator$ui_release = lookaheadRoot$ui_release.getChildren$ui_release().get(0).getOuterCoordinator$ui_release();
        }
        return outerCoordinator$ui_release;
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public MeasureResult layout(int i2, int i3, Map<AlignmentLine, Integer> map, Function1<? super RulerScope, Unit> function1, Function1<? super Placeable.PlacementScope, Unit> function12) {
        if (!((i2 + ViewCompat.MEASURED_STATE_MASK) - (i2 | ViewCompat.MEASURED_STATE_MASK) == 0 && ((-16777216) & i3) == 0)) {
            InlineClassHelperKt.throwIllegalStateException("Size(" + i2 + " x " + i3 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult(i2, i3, map, function1, function12, this) { // from class: androidx.compose.ui.layout.ApproachMeasureScopeImpl.layout.1
            final /* synthetic */ Function1<Placeable.PlacementScope, Unit> $placementBlock;
            private final Map<AlignmentLine, Integer> alignmentLines;
            private final int height;
            private final Function1<RulerScope, Unit> rulers;
            final /* synthetic */ ApproachMeasureScopeImpl this$0;
            private final int width;

            public static /* synthetic */ void getAlignmentLines$annotations() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.$placementBlock = function12;
                this.this$0 = this;
                this.width = i2;
                this.height = i3;
                this.alignmentLines = map;
                this.rulers = function1;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public Function1<RulerScope, Unit> getRulers() {
                return this.rulers;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
                this.$placementBlock.invoke(this.this$0.getCoordinator().getPlacementScope());
            }
        };
    }
}
