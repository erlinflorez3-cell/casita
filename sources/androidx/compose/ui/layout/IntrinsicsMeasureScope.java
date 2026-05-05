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
@Metadata(bv = {}, d1 = {"Яć\u0014D57\u001eq\u007fZDkt\u001aA\u000e0\u0011.J~8,\u001aw\rfr9>ImH4U[*\u001dt\u00044*],qY;]ڼ\u0006\"\u0017UVgmnRZ\u0019e\u0017\u0006,xrߚQU\u000f]\u001a\u000fHBw?AMw=O`|Ȃ\r H\"@ц\r\u00010*P\u0010|zKK\"\u00128@vAZ\rc\u0005\"\u0012\u001c>(\u0001$`oNLHt]P/+\u0003oHTϋuܞ-M;E\u0005';v\"1;DE6-%\u0002\u0003\u0017ViA\u001b? @ݾl'5/\u0012ReFp\u007fB&[S\u001bo\u000b&\u000b\u0018\u0002d\u001a;CO\u0012^\u0001\u001e6\r\u0013\b\u001d>\u0014\u000e4>X0=\u001a\u0015\u001b<I%\naXh\u0015nD\u0010z\u0010P''\u00103YT1e\u007fzޅ\u001dN=\u00185\",@\u0019\u007f1]d\u000e\u000f3+V\bQ_lnV˓R\n_Y4\u00189w\u0010I\u001c0u\u0013W{?N]¾6ڼ8\u05fa\u074co\u0004Neu\u0019Muvr\u0002RvSJnDZp¶\u000b˧CߟʰoRZ|:6\u00161b-\u0016\bA@\u0005wjDkŃMұgȉҷQ_\u0010L=\u000f\u007fq|\u0012&Wg~[5\u007fiVиQБ\u0013>سaڳֽjDY5h\u0007p:@n\u0003\u0010&\u001clN:&xƅp̂3+״\u0018¢ČL\u0005$kO(Qth\u0015(~\u0003`L\u0003\u0018R;տ\u007f̿[ʙ״kzO[\u000b\u0011jBO\u0003M\u0019T[Jhb\u001diȬ}ϗ~øѨPIR\u001f$ \u001e\u0011.G29\u007f5e\u0013=\"oɝ\u0001ЈDɣȌiSSE5#E\u0005\u001do\u0001.\u0016=\u0013pZ\u00171ߒN\u001d,0.vrQ6\r\u007f(\u000f\rہFуSެИBKx;gl\u0017M\u000b>7\u001eS$\u0018\"+Usϖ&߭\u0015ߐӄ3\u0017g\u0018w+v\u0012pH>t\u0014'TcDu)Ы\\ҟ:7ַX˚й&&r?P\u00043\u0010\u0016{!4;VpA\u0013\u0004\u001dЭLÊ.|\u05fe\u0006ԭޛtXav!-NF<dBsq\u0004Jr\u001aѱ\u0014ߠWk\u0006oQc\u0019R_\u001c\u0019\u0005In@\"s4-͈eס4\n\f\u001a<KIjUN\u0017/L,j\u0014A\u0018+ɂ\tخ~\u0004^a\u0015\"@ODMd\u0010lx\u000bY\u001fϊb҇d'2܀\u0017\u00119,\u0007D̐\u0005vNW5ҔN/R%\t!\n˓\u0003%"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014<5C7yD+\u0015V_C\u0012c\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001e\u0003fkD\u00079", "7mc?\\5LW\u0017fzZ:\r\u0016/S}2\u0007@", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\t>h\u000b$@{\u001a,5C7yD+\u0015V_C\u0012c\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0015]\u000b4wHFhn(]\fKw_\u0010#\u000e3ytL_e\u000bj", "2d]@\\;R", "", "5dc\u0011X5LW(\u0013", "u(5", "4n]AF*:Z\u0019", "5dc\u0013b5MA\u0017z\u0002^", "7r;<b2B\\\u001bZ}^({", "", "u(I", "5dc\u0019T@Hc(]~k,z\u00183o\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=s", ":`h<h;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "EhSA[", "", "6dX4[;", "/kX4a4>\\(e~g,\u000b", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", "@t[2e:", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006c5<Y\u000b\u000e5w!.#", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", ">kP0X4>\\([\u0002h*\u0003", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016l8J7i4&\u0015qp'\u0005m7NL", "@nd;W\u001bH>,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "@nd;W\u001bH>,FE/~G\u000e)4", "uE\u0018\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/\r", "@nd;W\u001bH>,FBKxo\u0003\u007fo", "uI\u0018\u0016", "Bn3=", "Bn3= \u000e:<d]n:", "uI\u0018\u0013", "Bn3= <\u000bc#ljF", "uE\u0018\u0013", "uH\u0018\u0013", "Bn3=F0SS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGd)JYS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "Bn3=F0SS`\u0005Bk-my\u0017", "uI\u0018\u0017", "Bn?E", "Bn?E v\u000f&c\u0004t-", "Bn?E s+ \fxKh", "BnA2V;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGc%3hS", "BnB6m,", "BnB6m,\u0006F\u001fzlG\u001bh", "BnB=", "BnB= vQ;\tNyh", "uE\u0018\u0017", "BnB= 2)he`\u000f-", "uH\u0018\u0017", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class IntrinsicsMeasureScope implements MeasureScope, IntrinsicMeasureScope {
    public static final int $stable = 0;
    private final /* synthetic */ IntrinsicMeasureScope $$delegate_0;
    private final LayoutDirection layoutDirection;

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
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

    public IntrinsicsMeasureScope(IntrinsicMeasureScope intrinsicMeasureScope, LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
        this.$$delegate_0 = intrinsicMeasureScope;
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
        if ((iCoerceAtLeast + ViewCompat.MEASURED_STATE_MASK) - (iCoerceAtLeast | ViewCompat.MEASURED_STATE_MASK) == 0 && (ViewCompat.MEASURED_STATE_MASK + iCoerceAtLeast2) - ((-16777216) | iCoerceAtLeast2) == 0) {
            z2 = true;
        }
        if (!z2) {
            InlineClassHelperKt.throwIllegalStateException("Size(" + iCoerceAtLeast + " x " + iCoerceAtLeast2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult() { // from class: androidx.compose.ui.layout.IntrinsicsMeasureScope.layout.1
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

    /* JADX INFO: renamed from: androidx.compose.ui.layout.IntrinsicsMeasureScope$layout$1 */
    /* JADX INFO: compiled from: Layout.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я1\u001d̉=!4i\bӵLc\u0003&I\u0006F\u000b6B\r(4\u0012}\u000bnjO0Le^.ZS8\u000fs{J$c$wGcTڼ\u0004*\u001fѧ~g\u0016m\u0013`\u0019U'\u0006D\u00051@\u001as\u0007]*\u001bBD\u007f?aO\u007f?I`#93!hv\u000fѝ\u0007в\u001e.`\u0012|~QP\\$>F\t:\u0001\u0010\u0004YpŞ\b̧$\u00056^mUDP=\u0003H8;\u0016yD^'\u000e;\rO\u001dF\u00033#u\u0010(ҋD7;\"[(YޮTÜC\u0007WsC\u0013v6w=W\u0004o6\u0007\u0003Ji\u0002̔\u000fǁv*t\u0007Wq\u001a/ˬSv"}, d2 = {"/mS?b0=fb|\u0005f7\u0007\u0017//\u0010,EG|+!W~W \u007f4B]\u0007.;k$\u0016M?I{A\u001e\u0003fkD\u0007\"3J\u000b1W[\rw", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "/kX4a4>\\(e~g,\u000b", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", "", "5dc\u000e_0@\\!~\u0004m\u0013\u0001\u0012/s", "u(;7T=:\u001d)\u000e~eud\u0005:;", "6dX4[;", "5dc\u0015X0@V(", "u(8", "@t[2e:", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006c5<Y\u000b\u000e5w!.#", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "5dc\u001fh3>`'", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "EhSA[", "5dc$\\+MV", ">kP0X\nAW }\b^5", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
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
