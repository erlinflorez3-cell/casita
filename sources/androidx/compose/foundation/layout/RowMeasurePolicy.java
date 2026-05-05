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
/* JADX INFO: compiled from: Row.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яē\u0014D57\u001eq\u007fZDkt\u001aA\u000eֶ\u0013.X~*ܥ\u001aw\u001dfr96GmHDR[ճ\u0017k\n:,[*sK;c#\u0006\"\u000fQVguñRZ\u0011C\u0017\u0006,xrߚQU\u000f]\u001a\u000f8Dw?IMwމA`\u0003E\rړ:\"Ny\rЏ\"*V#~zIP\u0014\u0012>@x:X\rU\u0005(\u001e\u000e>&\u0002&\\}N>ԟt]HM+\u0003\u007fBV'e2\u0005M#F\\'\u0013zgӝ1Vʺe\u0015SR3\u0007\u0001[\u007f\u0016OuK\u0006\u0001'U-Ywe9p\u007fB\u0019ۣS\rkwnc\u0013Wx\fU-\u0016ӭL\u0019\u00156~\u0013{;@Jؽ\u0007oc<52f6ԄczxSNQ\u001a^p\u0002+g<\u00173\u0003K+g\u001f-Ц`\u0004T\\@\u0014\u0005;(S\u0005|,sT<lE\u001fb\u0005i1\u007fLmL\\\u0018q=\u001c\u0010!f\u00109\u001c0u\f_\u007f\u001f>/%el\u007f7ޢjȵӿCfЛ\tbnewe\u0011Q0\u0003.7X\u001a<`Ry\u001dmfS\u0007BW݊\u001d\u001d/\f\u001f+ \u000b\u0004l%3(fO\u0017\u0003\u001bSk$=1|6\b\n\u001c\u0012eUv3c]\u0014\u0014oo\u000f\u0014mH)\u0005!mPq$Z\u000b4hŌG3u\u0006\u001b\\N:3bK\u007f=L4A\u001dl\u0017^\u0002L[o\u001f9ch\f(~\u0003WT\u0007wA\r\t/\\\rt}\r\u0011IZ#\u0011&;hi5G2\u0006&vP\u0015#5\u000b$\u0006U\u0010dIbkD\u001c\u0006\u007f.?29\u007f;m\u0017\u001d)A209uP\u0001\u0011iM@3A\u0011ɍ\u0013;vZ0.x\u001eD`\u0019x\u007fX%I\u000f^!/8h\u000e)yF)m\u0014X\u0019\u0001VI!)\n@\\[\u0015\u0005MBk\u00158)\u000beECUN\\¦\u0013w\u001fo\u0010\u0002o\\\u0006\u000b\u000fT\u000e,\u0018tm$#zQ\f>c8wrERjDz7ZH\u0019\u00040B7i==Vw|vf:]\u000b]6\u0015>\\\u0011~\u0010s:A{DHv\u007f8.[}Bjk%?\u0003\u0004q{$cb\u001bL\u001f\n94_&B K[nW\u0011\u0015v\u001a<BD}Sb3\\1$bPl\u0012\u0019ylo\u0016\u0012\u000b\u007ft\u001d=NbF\u0002yn\u000e\u0003\u0003#j\u0098\u0004_҇d#0@\rO{>\u0007vI\u0005\u001cR|/\u0012g1]+?3p_\u0001v%Y|\u0003pK,f:#E\fO\u0010\u0016~$Uk\u0006k\u001e\u0018`\u0018+Rr\")oi\u0017ox@^9\u000e\u0013\u0006\u0015z \"jNP5E\u000fM\u001aJ\u000b'\u000bGQIźdυPN\u007f˿\u0014&\u000f\u001a\\)5\u0010SݰHɴ1\u0006=σ֔Is\u001c'\u0002v[>\u0004к<N&؝xd"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u00038_+;gB.\"hLC\u000eg*bL", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7X 5QAOA", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u00038_!ErD&\u001ePa5\u0015s9Na1NPL@2", "6na6m6Gb\u0015\u0006Vk9x\u00121e\b(\u0005O", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwim9R\f1P[J32", "DdaA\\*:Zt\u0006~`5\u0005\t8t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4sJ}-Fq\u0014*T\u0019", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_\nZP7t6\u001e\u001dhjHEF6[z<QU](c(Y9\u001d\u0011g\u0018R* NWK,yNE\u001fQ<MK\u0017o\u0005\u000e\u001f\u00165s\u007f\u0001G\u0010T\t\u0019s=0>\nJ", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "1qT.g,\u001c]\"\r\nk(\u0001\u0012>s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";`X;4?Ba\u0001\u0003\u0004", "", "1q^@f\bQW'f~g", ";`X;4?Ba\u0001z\u000e", "1q^@f\bQW'fvq", "7r??\\6KW(\u0003\u0010b5~", "", "1qT.g,\u001c]\"\r\nk(\u0001\u0012>sG;\\\rj{f3", "uH8\u0016<!\u00028", "3pd._:", "=sW2e", "", "5dc\u0010e6Lat\u0012~l\u0017\u0007\u00173t\u00042\u0005", ">kP0X(;Z\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", ">`a2a;\u001dO(z", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u00038_!ErD&\u001eS]F\u0007l;-r6C\"", "1q^@f\bQW'evr6\r\u0018\u001di\u0015(", "0dU<e,\u001c`#\r\t:?\u0001\u0017\u000bl\u0004*\u0005H\u0001 &.s\u0017<", "6`b566=S", ">kP0X\u000f>Z$~\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", ">kP0X(;Z\u0019\r", "", ";dP@h9>A\u0017\t\u0006^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", ";`X;4?Ba\u0004\t\tb;\u0001\u00138s", "", ";`X;4?Ba\u007fz\u000fh<\fv3z\u007f", "1q^@f\bQW'h{_:|\u0018", "1ta?X5M:\u001d\bzB5{\tB", "AsP?g\u0010GR\u0019\u0012", "3mS\u0016a+>f", "uZ;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n `y\u001e7i\u00135M\u0019\"g=\u001d\"re8\u001a-*X~2QZNulV<D\u0010&d\u001e]tt\u0005UO4{D%\u001d\u00127IW\u001f^doy\u0004\u0019NT&\u001avC\u0003\u0014\u0003K-gY#]\u0004OLOp*.\u001ccfc6N.$\u0001b\u0003hL<\u001a\tS}r`\nnv\u001d", ">n_B_(MS\u0001z~g\b\u0010\r=P\n6\u007fO\u0005! U", "", "1gX9W9>\\\u0001z~g\b\u0010\r=S\u0004={", "BnBAe0GU", "", "1q^@f\bQW'l~s,", ";`X;4?Ba\u0007\u0003\u0010^", ";`g\u0016a;KW\"\r~\\\u000f|\r1h\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001e\u0003fkD\u00079", ";dP@h9:P ~\t", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001a\u0012oa\u000f", "EhSA[", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", "6dX4[;", ";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "1n]@g9:W\"\u000e\t", ";dP@h9>\u001bf\nGl~G\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b#\u0011y]\u0003\u0017r0U@\u000eKZ]\u0002A\u0016Y9\u001d\u0011g\u0018R* NWK,yNE\u001fQ<MKBd\u0015\u0016&\u001d~Rp>d Ty\u0002uO9oU/", ";h]\u0016a;KW\"\r~\\\u000f|\r1h\u000f", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RowMeasurePolicy implements MeasurePolicy, RowColumnMeasurePolicy {
    public static final int $stable = 0;
    private final Arrangement.Horizontal horizontalArrangement;
    private final Alignment.Vertical verticalAlignment;

    private final Arrangement.Horizontal component1() {
        return this.horizontalArrangement;
    }

    private final Alignment.Vertical component2() {
        return this.verticalAlignment;
    }

    public static /* synthetic */ RowMeasurePolicy copy$default(RowMeasurePolicy rowMeasurePolicy, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, int i2, Object obj) {
        if ((1 & i2) != 0) {
            horizontal = rowMeasurePolicy.horizontalArrangement;
        }
        if ((i2 & 2) != 0) {
            vertical = rowMeasurePolicy.verticalAlignment;
        }
        return rowMeasurePolicy.copy(horizontal, vertical);
    }

    public final RowMeasurePolicy copy(Arrangement.Horizontal horizontal, Alignment.Vertical vertical) {
        return new RowMeasurePolicy(horizontal, vertical);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RowMeasurePolicy)) {
            return false;
        }
        RowMeasurePolicy rowMeasurePolicy = (RowMeasurePolicy) obj;
        return Intrinsics.areEqual(this.horizontalArrangement, rowMeasurePolicy.horizontalArrangement) && Intrinsics.areEqual(this.verticalAlignment, rowMeasurePolicy.verticalAlignment);
    }

    public int hashCode() {
        return (this.horizontalArrangement.hashCode() * 31) + this.verticalAlignment.hashCode();
    }

    public String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.horizontalArrangement + ", verticalAlignment=" + this.verticalAlignment + ')';
    }

    public RowMeasurePolicy(Arrangement.Horizontal horizontal, Alignment.Vertical vertical) {
        this.horizontalArrangement = horizontal;
        this.verticalAlignment = vertical;
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public int mainAxisSize(Placeable placeable) {
        return placeable.getWidth();
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public int crossAxisSize(Placeable placeable) {
        return placeable.getHeight();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo375measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
        return RowColumnMeasurePolicyKt.measure$default(this, Constraints.m6593getMinWidthimpl(j2), Constraints.m6592getMinHeightimpl(j2), Constraints.m6591getMaxWidthimpl(j2), Constraints.m6590getMaxHeightimpl(j2), measureScope.mo704roundToPx0680j_4(this.horizontalArrangement.mo904getSpacingD9Ej5fM()), measureScope, list, new Placeable[list.size()], 0, list.size(), null, 0, 3072, null);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public void populateMainAxisPositions(int i2, int[] iArr, int[] iArr2, MeasureScope measureScope) {
        this.horizontalArrangement.arrange(measureScope, i2, iArr, measureScope.getLayoutDirection(), iArr2);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public MeasureResult placeHelper(final Placeable[] placeableArr, MeasureScope measureScope, final int i2, final int[] iArr, int i3, final int i4, int[] iArr2, int i5, int i6, int i7) {
        return MeasureScope.layout$default(measureScope, i3, i4, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.RowMeasurePolicy$placeHelper$1$1
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
                RowMeasurePolicy rowMeasurePolicy = this;
                int i8 = i4;
                int i9 = i2;
                int[] iArr3 = iArr;
                int length = placeableArr2.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    Placeable placeable = placeableArr2[i10];
                    Intrinsics.checkNotNull(placeable);
                    Placeable.PlacementScope.place$default(placementScope, placeable, iArr3[i11], rowMeasurePolicy.getCrossAxisPosition(placeable, RowColumnImplKt.getRowColumnParentData(placeable), i8, i9), 0.0f, 4, null);
                    i10++;
                    i11++;
                }
            }
        }, 4, null);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    /* JADX INFO: renamed from: createConstraints-xF2OJ5Q */
    public long mo933createConstraintsxF2OJ5Q(int i2, int i3, int i4, int i5, boolean z2) {
        return RowKt.createRowConstraints(z2, i2, i3, i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCrossAxisPosition(Placeable placeable, RowColumnParentData rowColumnParentData, int i2, int i3) {
        CrossAxisAlignment crossAxisAlignment = rowColumnParentData != null ? rowColumnParentData.getCrossAxisAlignment() : null;
        return crossAxisAlignment != null ? crossAxisAlignment.align$foundation_layout_release(i2 - placeable.getHeight(), LayoutDirection.Ltr, placeable, i3) : this.verticalAlignment.align(0, i2 - placeable.getHeight());
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return IntrinsicMeasureBlocks.INSTANCE.HorizontalMinWidth(list, i2, intrinsicMeasureScope.mo704roundToPx0680j_4(this.horizontalArrangement.mo904getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return IntrinsicMeasureBlocks.INSTANCE.HorizontalMinHeight(list, i2, intrinsicMeasureScope.mo704roundToPx0680j_4(this.horizontalArrangement.mo904getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return IntrinsicMeasureBlocks.INSTANCE.HorizontalMaxWidth(list, i2, intrinsicMeasureScope.mo704roundToPx0680j_4(this.horizontalArrangement.mo904getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return IntrinsicMeasureBlocks.INSTANCE.HorizontalMaxHeight(list, i2, intrinsicMeasureScope.mo704roundToPx0680j_4(this.horizontalArrangement.mo904getSpacingD9Ej5fM()));
    }
}
