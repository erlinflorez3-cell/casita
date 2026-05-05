package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
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
/* JADX INFO: compiled from: Column.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яě\u0014D57\u001eq\u007fZDkt\u001aA\u000eֶ\u0013.X~*ܥ\u001aw\u001dfr96GmHDR[ճ\u0017k\n:,[*sK;c#\u0006\"\u000fQVguñRZ\u0011C\u0017\u0006,xrߚQU\u000f]\u001a\u000f8Cw?IMw=?`|6\u001b :Ĳ@y\u0013\u0010\"ݒP\u0010\rzKŷ\u0014\u0012>Sx:X\u0012U\u0005(\u0012\u000e>&\u0001&\\uZ>Hr^B/9\u0003qĩV'mN\u0005M#F\\'\u0013xi\u001eA@?5\u001b)YΉ\rh¹o\u0003mpm\u0005\u0017'g>Ywe7p\u007fB\u0017;S\u001b`\u000b&\u000b\tŌd\f50\u0018jYV&(&|Bɡ=L\u0015\u0014.`.[\u001e-۟\u000f{\u0010\u0001[XP0މr\u0006\u0001aD\u0018=\u007fa-i!lQo>1Ne\u007fKۃ\u001dk<|*sT<jE\u001fb\u0003i1\u007fLmL\\\u0017q=\u001c\u0010!f\u00108\u001c0u\f_\u007f\u001f=/%egi'/{\u001aHrx=\u0019ĔgؘׅQGغ&p\u001cI8\u001cTkRx\u001dk~e\t2\u001fb4V\u001d|6)fЖx\u0005Q3'fO\u0017u\u001bQk\"=/\u0015P\nty(o;t2cl\u0014\u0014on\u000f\u0014mH\u0013\tf\u0004ZS:f\r,0P`j>\u0017BD\u0017\u0013!RWqJ@rג\u0018%zV$6Bo\u001f9kh\f(\u0007d74\u0005\u007f##\"/t\rt}\r\u0011IZ#\u0011&;^i5G2\u0006&v[\u0015#5'$\u0004U\u0011dGzxFyc\u00188\u0016HE\u00025K='\u0001?10UuP\u0001\u0011iM@3+\u0001\b;Sh\\s8n~Yxjx[\u001b+Ȕz^\u0001QP\u000b\u000e)yF)w\u0014X\u0019\u0005VI!\u000f\n@\\i\u0015\u0005MFU\u0005}I\u00155[kW!$\u001d,/C\b$}85\b\u0015'&#\u0019Jёb^yp\u0006u2iDqY-Wh85\rP}\u0003w6N14;L\u000fU-\u0011dne\u000b]\n\u000f\u0007ZD!`ir+u\u000e6>_X.q7DbQ`)M\u0002s4\u0002\u0014|\u0019\u0007'\n9\bYn@Sm*d\u0010z\u000f@\b\u0004\u0018d{i\u001c5@\u0017aL,j\u0014QW\u001d\u0014\u0014N\u0013\u007ft\u00027\u0017`h$EdFl~lXX\u0005\u000f\u0005\u000fZZ\u0005\rOK\u001e'?w\u0019\u0600ESвg4\u0007\u0015+Kc\u000b]B~%YP|9I_\t\u000b\u0019}uIY\u0004F\u0004uc\u001c% \u0010FS\u0015\u001dp$aM\u001a1m;H^9a\rN\u0013.Bp`\u0007:/\u000f|\r\u000ejD=DIS\u0001-z-zZ>K\u0014&\u000f\u001a\\)5\u0010SݰHɴ1\u0006=σ\u000eUx\u0015?{\u0006U\u0012վ\nÙ$'\fȌը\\`\u0016f\u0010|#=\u001cެ2\u0011\u0001ƪ\u0017\u0016"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s8TSCt\u001c\u001e\u0011vqF\u0007N6Uz%[\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7X 5QAOA", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u00038_!ErD&\u001ePa5\u0015s9Na1NPL@2", "DdaA\\*:Zt\f\bZ5~\t7e\t7", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwwc9]z%CS$", "6na6m6Gb\u0015\u0006Ve0~\u00127e\t7", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4s<\b-;\u0003 7\\?BA", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_\nZP7t6\u001e\u001dhjHET,[\u0006+EHU\u0002CN{<!\u001c^\rat\u000b\u000faL.|D\u0001/\fu%\t?j\n\u0014\u0016\u0017D)SLc\u0014\\\u0004\u001e\u0005=0>\nJ", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "1qT.g,\u001c]\"\r\nk(\u0001\u0012>s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";`X;4?Ba\u0001\u0003\u0004", "", "1q^@f\bQW'f~g", ";`X;4?Ba\u0001z\u000e", "1q^@f\bQW'fvq", "7r??\\6KW(\u0003\u0010b5~", "", "1qT.g,\u001c]\"\r\nk(\u0001\u0012>sG;\\\rj{f3", "uH8\u0016<!\u00028", "3pd._:", "=sW2e", "", "5dc\u0010e6Lat\u0012~l\u0017\u0007\u00173t\u00042\u0005", ">kP0X(;Z\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", ">`a2a;\u001dO(z", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u00038_!ErD&\u001eS]F\u0007l;-r6C\"", "1q^@f\bQW'evr6\r\u0018\u001di\u0015(", "0dU<e,\u001c`#\r\t:?\u0001\u0017\u000bl\u0004*\u0005H\u0001 &.s\u0017<", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "6`b566=S", ">kP0X\u000f>Z$~\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", ">kP0X(;Z\u0019\r", "", ";dP@h9>A\u0017\t\u0006^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", ";`X;4?Ba\u0004\t\tb;\u0001\u00138s", "", ";`X;4?Ba\u007fz\u000fh<\fv3z\u007f", "1q^@f\bQW'h{_:|\u0018", "1ta?X5M:\u001d\bzB5{\tB", "AsP?g\u0010GR\u0019\u0012", "3mS\u0016a+>f", "uZ;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n `y\u001e7i\u00135M\u0019\"g=\u001d\"re8\u001a-*X~2QZNulV<D\u0010&d\u001e]tt\u0005UO4{D%\u001d\u00127IW\u001f^doy\u0004\u0019NT&\u001avC\u0003\u0014\u0003K-gY#]\u0004OLOp*.\u001ccfc6N.$\u0001b\u0003hL<\u001a\tS}r`\nnv\u001d", ">n_B_(MS\u0001z~g\b\u0010\r=P\n6\u007fO\u0005! U", "", "1gX9W9>\\\u0001z~g\b\u0010\r=S\u0004={", "BnBAe0GU", "", "1q^@f\bQW'l~s,", ";`X;4?Ba\u0007\u0003\u0010^", ";`g\u0016a;KW\"\r~\\\u000f|\r1h\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001e\u0003fkD\u00079", ";dP@h9:P ~\t", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001a\u0012oa\u000f", "EhSA[", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", "6dX4[;", ";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "1n]@g9:W\"\u000e\t", ";dP@h9>\u001bf\nGl~G\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b#\u0011y]\u0003\u0017r0U@\u000eKZ]\u0002A\u0016Y9\u001d\u0011g\u0018R* NWK,yNE\u001fQ<MKBd\u0015\u0016&\u001d~Rp>d Ty\u0002uO9oU/", ";h]\u0016a;KW\"\r~\\\u000f|\r1h\u000f", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ColumnMeasurePolicy implements MeasurePolicy, RowColumnMeasurePolicy {
    public static final int $stable = 0;
    private final Alignment.Horizontal horizontalAlignment;
    private final Arrangement.Vertical verticalArrangement;

    private final Arrangement.Vertical component1() {
        return this.verticalArrangement;
    }

    private final Alignment.Horizontal component2() {
        return this.horizontalAlignment;
    }

    public static /* synthetic */ ColumnMeasurePolicy copy$default(ColumnMeasurePolicy columnMeasurePolicy, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            vertical = columnMeasurePolicy.verticalArrangement;
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            horizontal = columnMeasurePolicy.horizontalAlignment;
        }
        return columnMeasurePolicy.copy(vertical, horizontal);
    }

    public final ColumnMeasurePolicy copy(Arrangement.Vertical vertical, Alignment.Horizontal horizontal) {
        return new ColumnMeasurePolicy(vertical, horizontal);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColumnMeasurePolicy)) {
            return false;
        }
        ColumnMeasurePolicy columnMeasurePolicy = (ColumnMeasurePolicy) obj;
        return Intrinsics.areEqual(this.verticalArrangement, columnMeasurePolicy.verticalArrangement) && Intrinsics.areEqual(this.horizontalAlignment, columnMeasurePolicy.horizontalAlignment);
    }

    public int hashCode() {
        return (this.verticalArrangement.hashCode() * 31) + this.horizontalAlignment.hashCode();
    }

    public String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.verticalArrangement + ", horizontalAlignment=" + this.horizontalAlignment + ')';
    }

    public ColumnMeasurePolicy(Arrangement.Vertical vertical, Alignment.Horizontal horizontal) {
        this.verticalArrangement = vertical;
        this.horizontalAlignment = horizontal;
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public int mainAxisSize(Placeable placeable) {
        return placeable.getHeight();
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public int crossAxisSize(Placeable placeable) {
        return placeable.getWidth();
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public void populateMainAxisPositions(int i2, int[] iArr, int[] iArr2, MeasureScope measureScope) {
        this.verticalArrangement.arrange(measureScope, i2, iArr, iArr2);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public MeasureResult placeHelper(final Placeable[] placeableArr, final MeasureScope measureScope, final int i2, final int[] iArr, int i3, final int i4, int[] iArr2, int i5, int i6, int i7) {
        return MeasureScope.layout$default(measureScope, i4, i3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.ColumnMeasurePolicy$placeHelper$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable[] placeableArr2 = placeableArr;
                ColumnMeasurePolicy columnMeasurePolicy = this;
                int i8 = i4;
                int i9 = i2;
                MeasureScope measureScope2 = measureScope;
                int[] iArr3 = iArr;
                int length = placeableArr2.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    Placeable placeable = placeableArr2[i10];
                    Intrinsics.checkNotNull(placeable);
                    Placeable.PlacementScope.place$default(placementScope, placeable, columnMeasurePolicy.getCrossAxisPosition(placeable, RowColumnImplKt.getRowColumnParentData(placeable), i8, i9, measureScope2.getLayoutDirection()), iArr3[i11], 0.0f, 4, null);
                    i10++;
                    i11++;
                }
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCrossAxisPosition(Placeable placeable, RowColumnParentData rowColumnParentData, int i2, int i3, LayoutDirection layoutDirection) {
        CrossAxisAlignment crossAxisAlignment = rowColumnParentData != null ? rowColumnParentData.getCrossAxisAlignment() : null;
        return crossAxisAlignment != null ? crossAxisAlignment.align$foundation_layout_release(i2 - placeable.getWidth(), layoutDirection, placeable, i3) : this.horizontalAlignment.align(0, i2 - placeable.getWidth(), layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    /* JADX INFO: renamed from: createConstraints-xF2OJ5Q, reason: not valid java name */
    public long mo933createConstraintsxF2OJ5Q(int i2, int i3, int i4, int i5, boolean z2) {
        return ColumnKt.createColumnConstraints(z2, i2, i3, i4, i5);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo375measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
        return RowColumnMeasurePolicyKt.measure$default(this, Constraints.m6592getMinHeightimpl(j2), Constraints.m6593getMinWidthimpl(j2), Constraints.m6590getMaxHeightimpl(j2), Constraints.m6591getMaxWidthimpl(j2), measureScope.mo704roundToPx0680j_4(this.verticalArrangement.mo904getSpacingD9Ej5fM()), measureScope, list, new Placeable[list.size()], 0, list.size(), null, 0, 3072, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return IntrinsicMeasureBlocks.INSTANCE.VerticalMinWidth(list, i2, intrinsicMeasureScope.mo704roundToPx0680j_4(this.verticalArrangement.mo904getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return IntrinsicMeasureBlocks.INSTANCE.VerticalMinHeight(list, i2, intrinsicMeasureScope.mo704roundToPx0680j_4(this.verticalArrangement.mo904getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return IntrinsicMeasureBlocks.INSTANCE.VerticalMaxWidth(list, i2, intrinsicMeasureScope.mo704roundToPx0680j_4(this.verticalArrangement.mo904getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return IntrinsicMeasureBlocks.INSTANCE.VerticalMaxHeight(list, i2, intrinsicMeasureScope.mo704roundToPx0680j_4(this.verticalArrangement.mo904getSpacingD9Ej5fM()));
    }
}
