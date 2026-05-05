package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
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
/* JADX INFO: compiled from: FlowLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яr\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4C\u0007\"B\u0012\u007f\u0007lkA0RnP.XS2\u000f\u0002{<$a%yCQU\"Ԃ*\t]TogtPb\u000bY\u000f\u000eǝ\u0001jBI]xc\u0012\u00172XoG3SoE9vt>ӌ(20G\u0002ڎ\t\u001a@H\u0018͌\u0003CY\u001f\u001a0FuBR\u001bM\r\u001a\u0018\bD~\u0017Ȧ\rg|5\u0011(kIG#1yrR5pH|{\u001fvX5 \u000faL=p;C)=S1\u0019\u0003_M\u0018Wqk\u0017\u0019+5Aas\u0006?\u001f\u0014ѥ\u0014ۀͶ\f\\ę*^\u000bhn$o[]|cP<:(~\n'T\u0004<!WN<I2h\u001e\ra\u0012#WNn\u001a^p\u0012+eD6=\u007faKi\u001ftry;G`}\u0010Mr,E\u0019nO~\u0005\u001an93\\\bUASV<vi8~mq\u0012\u0017z\u0002X+`K\u000eP\u0014\u0011\\)U;ia;!\u001a+xHu!\u001d`\u0017e\u001aVV^:nDIZ\u000f\u001a\u0006\\f\u001bj~}\t0\u001fy4T5\u00108\u0017.\n\u0010<O7@R]\u0017\u0002j{oP9çj7g\u001e44eiv3c\u0003\u0014\u0014o|\u000f\u0014mN\u0013\tf\u0019ZS:\u0004\r,0Z`j>!,H\\2+2m\u0019bHt;'\u0010-H10jA+$&n1\u001a\r\tK$1{Lt7\u001c\u0017pA\u007fuxa,+axαCپ9\u001d>W(jB\u007fs\u0017\rw\u0018G\u0016Q\u001eƩnטyY\u0014\"\u001c GX\u007fM!\u0017\u0017)`\u000b\u0004֍NȌiUe\u0014-\u0003\u000b\u0004_Kv9\u007f\b\u0019|\u0003߳lߝSX/$|k\u00011Сc\u007fכaU\u0003Gis\u0013^Dϖ\u000f1XDP>\u001c3\u001eǰ)6ȼ&{"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\"o=\u001e|h]G\u0017p,9\u0001.KJb\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u00038_!ErD&\u001ePa5\u0015s9Na1NPL@2", "1q^@f\bQW'Z\u0002b.\u0006\u0011/n\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s;WQIGG\"#Dh=\tl4N\u007f6\u001d", "5dc\u0010e6Lat\u0012~l\b\u0004\r1n\b(\u0005O", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w+PEyBy(lo\u0015\u000eg.W~'P[$", "6na6m6Gb\u0015\u0006Vk9x\u00121e\b(\u0005O", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwim9R\f1P[J32", "5dc\u0015b9Bh#\b\nZ3X\u0016<a\t*{H\u0001 &", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w)PHg= \u0015paB\u0016\"\u000fX\u0004+\\VW;XYH", "7r7<e0S]\"\u000eve", "", "u(I", "DdaA\\*:Zt\f\bZ5~\t7e\t7", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwwc9]z%CS$", "5dc#X9MW\u0017z\u0002:9\n\u00058g\u007f0{I\u0010", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w)PHg= \u0015paB\u0016\"\u001dN\u00046KJJ32", "1qT.g,\u001c]\"\r\nk(\u0001\u0012>s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";`X;4?Ba\u0001\u0003\u0004", "", "1q^@f\bQW'f~g", ";`X;4?Ba\u0001z\u000e", "1q^@f\bQW'fvq", "7r??\\6KW(\u0003\u0010b5~", "1qT.g,\u001c]\"\r\nk(\u0001\u0012>sG;\\\rj{f3", "uH8\u0016<!\u00028", "5dc\u0010e6Lat\u0012~l\u0017\u0007\u00173t\u00042\u0005", ">kP0X(;Z\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "@nf\u0010b3N[\"ivk,\u0006\u0018\u000ea\u000f$", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u00038_!ErD&\u001eS]F\u0007l;-r6C\"", "1q^@f\bQW'evr6\r\u0018\u001di\u0015(", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "0dU<e,\u001c`#\r\t:?\u0001\u0017\u000bl\u0004*\u0005H\u0001 &.s\u0017<", ">kP0X\u000f>Z$~\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", ">kP0X(;Z\u0019\r", "", ";dP@h9>A\u0017\t\u0006^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", ";`X;4?Ba\u0004\t\tb;\u0001\u00138s", "", ";`X;4?Ba\u007fz\u000fh<\fv3z\u007f", "1q^@f\bQW'h{_:|\u0018", "1ta?X5M:\u001d\bzB5{\tB", "AsP?g\u0010GR\u0019\u0012", "3mS\u0016a+>f", "uZ;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n `y\u001e7i\u00135M\u0019\"g=\u001d\"re8\u001a-*X~2QZNulV<D\u0010&d\u001e]tt\u0005UO4{D%\u001d\u00127IW\u001f^doy\u0004\u0019NT&\u001avC\u0003\u0014\u0003K-gY#]\u0004OLOp*.\u001ccfc6N.$\u0001b\u0003hL<\u001a\tS}r`\nnv\u001d", ">n_B_(MS\u0001z~g\b\u0010\r=P\n6\u007fO\u0005! U", "", "1gX9W9>\\\u0001z~g\b\u0010\r=S\u0004={", "1q^@f\bQW'l~s,", ";`X;4?Ba\u0007\u0003\u0010^", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface FlowLineMeasurePolicy extends RowColumnMeasurePolicy {
    CrossAxisAlignment getCrossAxisAlignment();

    Arrangement.Horizontal getHorizontalArrangement();

    Arrangement.Vertical getVerticalArrangement();

    boolean isHorizontal();

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default int mainAxisSize(Placeable placeable) {
        return isHorizontal() ? placeable.getMeasuredWidth() : placeable.getMeasuredHeight();
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default int crossAxisSize(Placeable placeable) {
        return isHorizontal() ? placeable.getMeasuredHeight() : placeable.getMeasuredWidth();
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    /* JADX INFO: renamed from: createConstraints-xF2OJ5Q */
    default long mo933createConstraintsxF2OJ5Q(int i2, int i3, int i4, int i5, boolean z2) {
        return isHorizontal() ? RowKt.createRowConstraints(z2, i2, i3, i4, i5) : ColumnKt.createColumnConstraints(z2, i2, i3, i4, i5);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default MeasureResult placeHelper(final Placeable[] placeableArr, final MeasureScope measureScope, final int i2, final int[] iArr, int i3, final int i4, final int[] iArr2, final int i5, final int i6, final int i7) {
        int i8;
        int i9 = i3;
        if (isHorizontal()) {
            i8 = i4;
        } else {
            i8 = i9;
            i9 = i4;
        }
        return MeasureScope.layout$default(measureScope, i9, i8, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.FlowLineMeasurePolicy$placeHelper$1$1
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
                int[] iArr3 = iArr2;
                int i10 = iArr3 != null ? iArr3[i5] : 0;
                for (int i11 = i6; i11 < i7; i11++) {
                    Placeable placeable = placeableArr[i11];
                    Intrinsics.checkNotNull(placeable);
                    int crossAxisPosition = this.getCrossAxisPosition(placeable, RowColumnImplKt.getRowColumnParentData(placeable), i4, measureScope.getLayoutDirection(), i2) + i10;
                    if (this.isHorizontal()) {
                        Placeable.PlacementScope.place$default(placementScope, placeable, iArr[i11 - i6], crossAxisPosition, 0.0f, 4, null);
                    } else {
                        Placeable.PlacementScope.place$default(placementScope, placeable, crossAxisPosition, iArr[i11 - i6], 0.0f, 4, null);
                    }
                }
            }
        }, 4, null);
    }

    default int getCrossAxisPosition(Placeable placeable, RowColumnParentData rowColumnParentData, int i2, LayoutDirection layoutDirection, int i3) {
        CrossAxisAlignment crossAxisAlignment;
        if (rowColumnParentData == null || (crossAxisAlignment = rowColumnParentData.getCrossAxisAlignment()) == null) {
            crossAxisAlignment = getCrossAxisAlignment();
        }
        int iCrossAxisSize = i2 - crossAxisSize(placeable);
        if (isHorizontal()) {
            layoutDirection = LayoutDirection.Ltr;
        }
        return crossAxisAlignment.align$foundation_layout_release(iCrossAxisSize, layoutDirection, placeable, i3);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default void populateMainAxisPositions(int i2, int[] iArr, int[] iArr2, MeasureScope measureScope) {
        if (isHorizontal()) {
            getHorizontalArrangement().arrange(measureScope, i2, iArr, measureScope.getLayoutDirection(), iArr2);
        } else {
            getVerticalArrangement().arrange(measureScope, i2, iArr, iArr2);
        }
    }
}
