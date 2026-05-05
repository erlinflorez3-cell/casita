package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.ViewCompat;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: Layout.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яė\u0014D57\u001eq\u007fZDkt\u001aA\u000e0\u0011.J~8,\u001aw\rfr9>ImH4U[*\u001dt\u00044*],qY;]\u001a\u0004#\u0011OdgonPZ\u0013C%\u0006\u001eюr,W[\u0001]\u0018\u000f:B}a;M\u0006=Aś|6\u001b :\"Ny\r\u0001(*P\u0010\rzKŷ\u0014\u0012F@xíZ\rc\u0005\"\u0012\f>(\u00014\\oN<Ot]P/+\u0003\u007fBV'e4\u0005M#F\\'#vi\u001e1F=ߎ+Ǭ\u0004\u00035Q\f?1?2P\u0015l5(CI\"WF\\\u000e\u0016-+}\u0010ǁv&j\t\u001a?\u001a>CO\u0012c\u0001\u00126\u0011\u0013{;V4\u0012\u0014B`.[4\u0017\u0018\u001cO\r~cB`\u0002\r`\u0010|q6E?.P[P)\u0006itK\u001b^7*&\u001d 3\u0001\u001dCqS<\u0001ڠ\u001fT}tafNa`_\u001a[Mm2\u0016r\u0004:\u0004^i.Oɨ\u0015.\u001dH}o\u00028/\u0012\u001aHr\u0002\u001f\u0005\u000f\u0010\u001aַQΫ?̎å\u001a901\u001a\u0004\ry\u0013\u0012hT\u0007F9MJ~Mú\u0007̯\u001fοʟ@#+;\\{1~xzu\nSV\u000f7\b\u00192ޥV¢]ڨ̳Ue\u0016\u0010`&\\WJ\u0010\u001dX\u0015i{\f\tbnχ1̄i\u000fɧzͩ«\u0010\u00158o\u007fM|D?Ft\u0015v*FBo\u0017OݸYՉ\u000f}֗2ɴғm&z9\u000f\u0003%\u0006}\u001b\u0011IZ1\t\"[v\u0018ڙ\u0018ƘTȨמ8~)=\r+H\\u\u0005_L\u001b\u001c\u001eU*G\\ֵ8ؐ.ˋт\u0013\u0001/k\u0010^\u000ea\u0001\u001eiM@-#|(9\u0002ô-֏\u0007ξҔ0bp\u0005]\u0004_-\u0005\u001a\u000b#6!(y\u0010\u0004AĊb\u001d i|ar1\u000fdNf1KȬ\u001dߋ\u007fǻݕ\u000173\u00035T^\r\"o-a\f\u0014\u0018.(\nUֆsѺ\u0003ϺІ\u001aqh\u0013kt\u0004PW\u001a\u0017>PN\u0015\u0003pN1̓\u0007ʰ\b3ڸ2ǥыhr\\{[Mw\u0016tGD\r\u001f\u0001\u0004:A\nDӆ-˷)r̎|жڎG'\u0017\u0011a,>\u007fYa#J=\u0010A\u0010\b߃\u0015εA$nYh\u0010>\u000eD*DJSb3B?8\u000bʎ?ޭ\u000fGlk\f\u001a\t\b\u0017q\u001d\"JB\"G\rb+ܖ_ƪL\txGf,8\u000eO!A \u00115_\bD܅Vвg8\tҵ5\u000b!x]\u000e7;9Tl9I9/۵\u000e֮\\ŝΫ\u00015\u0086K-\u0006mu\u001eF+M3P,39\u007f&6ے3ϕ\nٝΝMcʝ\u0016jjP(?\r\u000eՇ\u000eE\u0012\u0012\u0011ġk!nj-Rm\u0000;\t"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R0@f\b\u001c5py7\\P?tB\"\u0013vI9\u0003q<[v\u0015EVY,2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R0@f\b\u001c5p}.IQKx4\f\u0013rl9\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R0@f\b\u001c5py7\\P?tB\"\u0013Pa5\u0015s9Nd%QWN\u0002", "7mc?\\5LW\u0017fzZ:\r\u0016/S}2\u0007@", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\u0001@d\u000b*3k\u0019\u0012VRHo=,\u0019fI9\u0003q<[v\u0015EVY,29nF\u0013\u001fd\u0012M>V\u0003cI/xR7h\u00180\u0013\u0012Dl\u0010U|\nIt\u0001Q5\u0014Ty\u0013\u0005E3q\u001c\u001dP", "2d]@\\;R", "", "5dc\u0011X5LW(\u0013", "u(5", "4n]AF*:Z\u0019", "5dc\u0013b5MA\u0017z\u0002^", "7r;<b2B\\\u001bZ}^({", "", "u(I", "5dc\u0019T@Hc(]~k,z\u00183o\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=s", ":n^8T/>O\u0018\\\u0005g:\f\u0016+i\t7\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "5dc\u0019b6DO\u001c~v]\n\u0007\u0012=t\r$\u007fI\u0010%^O}m!r\u0004;", "u(9", ":n^8T/>O\u0018l~s,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "5dc\u0019b6DO\u001c~v]\u001a\u0001\u001e/-s%\u0010Hgc\u0019", ":`h<h;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "EhSA[", "", "6dX4[;", "/kX4a4>\\(e~g,\u000b", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", "@t[2e:", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006c5<Y\u000b\u000e5w!.#", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", ">kP0X4>\\([\u0002h*\u0003", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016l8J7i4&\u0015qp'\u0005m7NL", "@nd;W\u001bH>,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "@nd;W\u001bH>,FE/~G\u000e)4", "uE\u0018\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/\r", "@nd;W\u001bH>,FBKxo\u0003\u007fo", "uI\u0018\u0016", "Bn3=", "Bn3= \u000e:<d]n:", "uI\u0018\u0013", "Bn3= <\u000bc#ljF", "uE\u0018\u0013", "uH\u0018\u0013", "Bn3=F0SS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGd)JYS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "Bn3=F0SS`\u0005Bk-my\u0017", "uI\u0018\u0017", "Bn?E", "Bn?E v\u000f&c\u0004t-", "Bn?E s+ \fxKh", "BnA2V;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGc%3hS", "BnB6m,", "BnB6m,\u0006F\u001fzlG\u001bh", "BnB=", "BnB= vQ;\tNyh", "uE\u0018\u0017", "BnB= 2)he`\u000f-", "uH\u0018\u0017", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ApproachIntrinsicsMeasureScope implements ApproachMeasureScope, ApproachIntrinsicMeasureScope {
    public static final int $stable = 0;
    private final /* synthetic */ ApproachIntrinsicMeasureScope $$delegate_0;
    private final LayoutDirection layoutDirection;

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    @Override // androidx.compose.ui.layout.ApproachIntrinsicMeasureScope
    /* JADX INFO: renamed from: getLookaheadConstraints-msEJaDk */
    public long mo5488getLookaheadConstraintsmsEJaDk() {
        return this.$$delegate_0.mo5488getLookaheadConstraintsmsEJaDk();
    }

    @Override // androidx.compose.ui.layout.ApproachIntrinsicMeasureScope
    /* JADX INFO: renamed from: getLookaheadSize-YbymL2g */
    public long mo5489getLookaheadSizeYbymL2g() {
        return this.$$delegate_0.mo5489getLookaheadSizeYbymL2g();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return this.$$delegate_0.isLookingAhead();
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    public int mo703roundToPxR2X_6o(long j2) {
        return this.$$delegate_0.mo703roundToPxR2X_6o(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    public int mo704roundToPx0680j_4(float f2) {
        return this.$$delegate_0.mo704roundToPx0680j_4(f2);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public float mo705toDpGaN1DYA(long j2) {
        return this.$$delegate_0.mo705toDpGaN1DYA(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public float mo706toDpu2uoSUM(float f2) {
        return this.$$delegate_0.mo706toDpu2uoSUM(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public float mo707toDpu2uoSUM(int i2) {
        return this.$$delegate_0.mo707toDpu2uoSUM(i2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    public long mo708toDpSizekrfVVM(long j2) {
        return this.$$delegate_0.mo708toDpSizekrfVVM(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx--R2X_6o */
    public float mo709toPxR2X_6o(long j2) {
        return this.$$delegate_0.mo709toPxR2X_6o(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx-0680j_4 */
    public float mo710toPx0680j_4(float f2) {
        return this.$$delegate_0.mo710toPx0680j_4(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    public Rect toRect(DpRect dpRect) {
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    public long mo711toSizeXkaWNTQ(long j2) {
        return this.$$delegate_0.mo711toSizeXkaWNTQ(j2);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public long mo712toSp0xMU5do(float f2) {
        return this.$$delegate_0.mo712toSp0xMU5do(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public long mo713toSpkPz2Gy4(float f2) {
        return this.$$delegate_0.mo713toSpkPz2Gy4(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public long mo714toSpkPz2Gy4(int i2) {
        return this.$$delegate_0.mo714toSpkPz2Gy4(i2);
    }

    public ApproachIntrinsicsMeasureScope(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
        this.$$delegate_0 = approachIntrinsicMeasureScope;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public MeasureResult layout(int i2, int i3, Map<AlignmentLine, Integer> map, Function1<? super RulerScope, Unit> function1, Function1<? super Placeable.PlacementScope, Unit> function12) {
        boolean z2 = false;
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i2, 0);
        int iCoerceAtLeast2 = RangesKt.coerceAtLeast(i3, 0);
        if ((iCoerceAtLeast & ViewCompat.MEASURED_STATE_MASK) == 0 && (ViewCompat.MEASURED_STATE_MASK + iCoerceAtLeast2) - ((-16777216) | iCoerceAtLeast2) == 0) {
            z2 = true;
        }
        if (!z2) {
            InlineClassHelperKt.throwIllegalStateException("Size(" + iCoerceAtLeast + " x " + iCoerceAtLeast2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult() { // from class: androidx.compose.ui.layout.ApproachIntrinsicsMeasureScope.layout.1
            final /* synthetic */ Map<AlignmentLine, Integer> $alignmentLines;
            final /* synthetic */ int $h;
            final /* synthetic */ Function1<RulerScope, Unit> $rulers;
            final /* synthetic */ int $w;

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(int iCoerceAtLeast3, int iCoerceAtLeast22, Map<AlignmentLine, Integer> map2, Function1<? super RulerScope, Unit> function13) {
                i = iCoerceAtLeast3;
                i = iCoerceAtLeast22;
                map = map2;
                function1 = function13;
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
        };
    }

    /* JADX INFO: renamed from: androidx.compose.ui.layout.ApproachIntrinsicsMeasureScope$layout$1 */
    /* JADX INFO: compiled from: Layout.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я1\u001d̉=!4i\bӵLc\u0003&I\u0006F\u000b6B\r(4\u0012}\u000bnjO0Le^.ZS8\u000fs{J$c$wGcTڼ\u0004*\u001fѧ~g\u0016m\u0013`\u0019U'\u0006D\u00051@\u001as\u0007]*\u001bBD\u007f?aO\u007f?I`#93!hv\u000fѝ\u0007в\u001e.`\u0012|~QP\\$>F\t:\u0001\u0010\u0004YpŞ\b̧$\u00056^mUDP=\u0003H8;\u0016yD^'\u000e;\rO\u001dF\u00033#u\u0010(ҋD7;\"[(YޮTÜC\u0007WsC\u0013v6w=W\u0004o6\u0007\u0003Ji\u0002̔\u000fǁv*t\u0007Wq\u001a/ˬSv"}, d2 = {"/mS?b0=fb|\u0005f7\u0007\u0017//\u0010,EG|+!W~W\u0018\u00020Bcy\u001e:Q\u001f=ZGDy8\u001c#Pa5\u0015s9Nd%QWNjcN\u0007G$!\u0019Y", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "/kX4a4>\\(e~g,\u000b", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", "", "5dc\u000e_0@\\!~\u0004m\u0013\u0001\u0012/s", "u(;7T=:\u001d)\u000e~eud\u0005:;", "6dX4[;", "5dc\u0015X0@V(", "u(8", "@t[2e:", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006c5<Y\u000b\u000e5w!.#", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "5dc\u001fh3>`'", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "EhSA[", "5dc$\\+MV", ">kP0X\nAW }\b^5", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements MeasureResult {
        final /* synthetic */ Map<AlignmentLine, Integer> $alignmentLines;
        final /* synthetic */ int $h;
        final /* synthetic */ Function1<RulerScope, Unit> $rulers;
        final /* synthetic */ int $w;

        @Override // androidx.compose.ui.layout.MeasureResult
        public void placeChildren() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(int iCoerceAtLeast3, int iCoerceAtLeast22, Map<AlignmentLine, Integer> map2, Function1<? super RulerScope, Unit> function13) {
            i = iCoerceAtLeast3;
            i = iCoerceAtLeast22;
            map = map2;
            function1 = function13;
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
    }
}
