package androidx.compose.ui.unit;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: Constraints.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d̉=!,p\bӵLc\u0003\nI\u00066\u001a6B\u0015\"4\u0012}\u0015njG0LeN/ZS8\u000es{:)c$\bCCU \u0005*\t]WogtPr>Q!\u001e\u0016'}\\O[xk&'2ppo9SoKNxtd\u0006P8(8\b\u001b\u0019\u001aXI@|\u0001CY#*0nq\u0001WҫQ\u0005(*\u001eT.\u001a6\\\u0016OfLzwR/Q\u0004\u001aF\\Bw0+NSFl5\u001b\u0013y\u001eYAg9#Bk\u00035S\"?\u001bj\u007f[\u001dhU:[M\u0002kNX.\u0015E/]\"urT]5Un\"?+}d{T\u001c?\u0010z*\u000e\u0003ǉ؝\n'VFE)t'&3#s\u0004D^\"vB.{(ت\u001d=\u000fALQ\u001b\u0015R\u0012?'pO{3\u000edŃ\u0007\u00077iw&`C?\u0005{_Vi@kI~\u000egc\u0006\u0004\u001fcH*\u001c>U'G{?VG)ExQ#OlHH\\u\u0005.xh\u0002j\u0003LN?\u0007\u0016e+O\frSr/\u0004P\u0003Y\\\u0015[<l\u0007,\tY\u0601b\u0010K/P(N}i\u001an[}\"%]g}խt\u0004(eev3cd\f\u0010\u0010e'\u0018Miz\u0005\u0007yδRێȺ`*(`V\u001a(\u0014\npf\fAbgqJG\\5'y-H1N\tFԊ\bݠ˖l\u0012\u0005\u0006AS\u001b\u00062'!\u0001~]\u0019o\u0016\fy0\u000b\u0014:-oR{\u001eƘTȨמ8~);\r)\u0018cu\u0003_L\u001b\u0017\u001eU*3F\u001eG\tG=A\u0010E.ʾ\u0001Ώ։Ptk\n[G?\u0017\u000b3';\u0017h\u0010\b\u0019\u0004\\dxggTER=cҩ\"Ψܐ\u0004{g\u0002\t\u0004{|\u0019\u0019VI!\u0016\u0002<|K-\u000b%\u001e3?\b\"+6]I-\u001d$7,/Cb$nݩ-Ӡˏ\u0013(z&\u0012m\u0004\"}̥i]`:\u000fՁ,˽B\",З#NVj\u0010\bp\n\u000bق\u0006ȈEdxމXY\u00191\u0016f5-cߡ)ݍ>\u0013wϘT:m-\fC,\u00155ƼwݱQSoƚ\u000eWj\u000fb\u000f8\fRυA݁ =(݈wn\u00175\u001esF7\u0018ݨ5ƀ@\t,҉LH\u0016\u0011[T\u0018\u0007fĂRʮc\u000f\u001fϨb\u007fI]&T']-ޣWޝI`)ơ!\u000b\u001d;6xc2[֊\u0019ߟ3c:ܬs)\u0017$\u0003O-g{ŀ\u0017ȗ=\u001b0߰!\u0017Sg[I07Zڞ{Թoo\u0014Մ8\t+M0\u001bgRg٦Iҍb\u000b]̤np\u0005\u001e~R|#\u007fͩMէ\u0012<\u0012ۇ+%]\u007f\bb[M%ߚ\nƴ\u001e\u0001\u001f\u05edI\u0013\u001a\u000b{FI.\\י\u007fִMj\u001c՝\u001ccaJ\u0016\bN!}\u05f7Gֈ`W\u0016ў*i)J.qDcXƄeц$\u00046\u05fd\u0015~\u0018? 6}\u0003\nûeȨ]k\u007f˺̻'0t\tHƐ\u0005'\tʑp&"}, d2 = {"\u0014nRBf\u0014:a\u001f", "", "\u0017mU6a0Mg", "", "\u001b`g\u000e_3He\u0019}[h9d\u0005BF\n&\fN]\u001b&U", "\u001b`g\u000e_3He\u0019}[h9d\u0005BN\n1\\J~'%$s\u001dJ", "\u001b`g\u000e_3He\u0019}[h9d\r8F\n&\fN]\u001b&U", "\u001b`g\u000e_3He\u0019}[h9d\r8N\n1\\J~'%$s\u001dJ", "\u001b`g\u0013b*Nau\u0003\nl", "\u001b`g\u0013b*Na{~~`/\f", "\u001b`g\u0013b*Na\u0001z\td", "\u001b`g\u0013b*Na\u000b\u0003ym/", "\u001b`g\u001bb5\u001f]\u0017\u000f\t;0\f\u0017", "\u001b`g\u001bb5\u001f]\u0017\u000f\tF(\u000b\u000f", "\u001bh]\u0013b*Nau\u0003\nl", "\u001bh]\u0013b*Na{~~`/\f", "\u001bh]\u0013b*Na\u0001z\td", "\u001bh]\u0013b*Na\u000b\u0003ym/", "\u001bh]\u001bb5\u001f]\u0017\u000f\t;0\f\u0017", "\u001bh]\u001bb5\u001f]\u0017\u000f\tF(\u000b\u000f", "\u0011n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";h]$\\+MV", ";`g$\\+MV", ";h]\u0015X0@V(", ";`g\u0015X0@V(", "uH8\u0016<o#", "/cS\u001aT?0W(\u0002bb5\u0001\u0011?m", ";`g", "D`[BX", "0hc@A,>Ry\t\bL0\u0012\t\u001fn}+{>\u0007\u0017\u0016", "Ahi2", "1qT.g,\u001c]\"\r\nk(\u0001\u0012>s", "6dX4[;&O'\u0005", "0hc\u001cY-LS(", "7mS2k\u001bH0\u001d\u000ed_-\u000b\t>", "7mS2k", "7me._0=1#\b\tm9x\r8t", "", "EhSA[\u001d:Z", "6dX4[;/O ", "7me._0=A\u001d\u0014z", "", ";`g\u000e_3He\u0019}[h9j\rDe", ";h]\u0015X0@V(h{_:|\u0018=", "EhSA[\u0014:a\u001f", "1n]@g9:W\"", "=sW2e\nH\\'\u000e\bZ0\u0006\u0018=", "1n]@g9:W\"Fc2\u0010fq I", "uI9u=", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "1n]@g9:W\"FIP8\u0012l\u000bM", "1n]@g9:W\"azb.\u007f\u0018", "6dX4[;", "1n]@g9:W\"azb.\u007f\u0018vKNr\\\u0014\u0014r", "uI8u<", "1n]@g9:W\"p~];\u007f", "EhSA[", "1n]@g9:W\"p~];\u007fP\u00154J\tOS\\", "7rB.g0LT\u001d~y;@", "", "7rB.g0LT\u001d~y;@DW!q\u0015\fW(", "uI9uM", "=eU@X;", "6na6m6Gb\u0015\u0006", "DdaA\\*:Z", "=eU@X;\u0006<\u0002OZpsl", "uI8\u0016\u001c\u0011", "Ch\u001cBa0MM&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ConstraintsKt {
    private static final long FocusMask = 3;
    private static final int Infinity = Integer.MAX_VALUE;
    private static final int MaxAllowedForMaxFocusBits = 8190;
    private static final int MaxAllowedForMaxNonFocusBits = 262142;
    private static final int MaxAllowedForMinFocusBits = 32766;
    private static final int MaxAllowedForMinNonFocusBits = 65534;
    private static final int MaxFocusBits = 18;
    private static final int MaxFocusHeight = 0;
    private static final int MaxFocusMask = 262143;
    private static final int MaxFocusWidth = 3;
    private static final int MaxNonFocusBits = 13;
    private static final int MaxNonFocusMask = 8191;
    private static final int MinFocusBits = 16;
    private static final int MinFocusHeight = 1;
    private static final int MinFocusMask = 65535;
    private static final int MinFocusWidth = 2;
    private static final int MinNonFocusBits = 15;
    private static final int MinNonFocusMask = 32767;

    private static final int bitsNeedForSizeUnchecked(int i2) {
        if (i2 < MaxNonFocusMask) {
            return 13;
        }
        if (i2 < 32767) {
            return 15;
        }
        if (i2 < 65535) {
            return 16;
        }
        return i2 < MaxFocusMask ? 18 : 255;
    }

    private static final int heightMask(int i2) {
        return (1 << (18 - i2)) - 1;
    }

    private static final int indexToBitOffset(int i2) {
        return ((1 & i2) << 1) + (((i2 & 2) >> 1) * 3);
    }

    private static final int minHeightOffsets(int i2) {
        return i2 + 15;
    }

    private static final int widthMask(int i2) {
        return (1 << (i2 + 13)) - 1;
    }

    private static final void invalidConstraint(int i2, int i3) {
        throw new IllegalArgumentException("Can't represent a width of " + i2 + " and height of " + i3 + " in Constraints");
    }

    private static final Void invalidSize(int i2) {
        throw new IllegalArgumentException("Can't represent a size of " + i2 + " in Constraints");
    }

    public static final long createConstraints(int i2, int i3, int i4, int i5) {
        int i6 = i5 == Integer.MAX_VALUE ? i4 : i5;
        int iBitsNeedForSizeUnchecked = bitsNeedForSizeUnchecked(i6);
        int i7 = i3 == Integer.MAX_VALUE ? i2 : i3;
        int iBitsNeedForSizeUnchecked2 = bitsNeedForSizeUnchecked(i7);
        if (iBitsNeedForSizeUnchecked + iBitsNeedForSizeUnchecked2 > 31) {
            invalidConstraint(i7, i6);
        }
        int i8 = i3 + 1;
        int i9 = i8 & (~(i8 >> 31));
        int i10 = i5 + 1;
        int i11 = i10 & (~(i10 >> 31));
        int i12 = 0;
        if (iBitsNeedForSizeUnchecked2 != 13) {
            if (iBitsNeedForSizeUnchecked2 == 18) {
                i12 = 3;
            } else if (iBitsNeedForSizeUnchecked2 == 15) {
                i12 = 1;
            } else if (iBitsNeedForSizeUnchecked2 == 16) {
                i12 = 2;
            }
        }
        int i13 = (((i12 + 1) - (1 | i12)) << 1) + ((((i12 + 2) - (2 | i12)) >> 1) * 3);
        return Constraints.m6580constructorimpl((-1) - (((-1) - (((-1) - (((-1) - (((long) i9) << 33)) & ((-1) - ((-1) - (((-1) - ((long) i12)) & ((-1) - (((long) i2) << 2))))))) | (((long) i4) << (i13 + 15)))) & ((-1) - (((long) i11) << (i13 + 46)))));
    }

    public static final int maxAllowedForSize(int i2) {
        if (i2 < MaxNonFocusMask) {
            return MaxAllowedForMaxNonFocusBits;
        }
        if (i2 < 32767) {
            return MaxAllowedForMinNonFocusBits;
        }
        if (i2 < 65535) {
            return MaxAllowedForMinFocusBits;
        }
        if (i2 < MaxFocusMask) {
            return MaxAllowedForMaxFocusBits;
        }
        invalidSize(i2);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ long Constraints$default(int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((1 & i6) != 0) {
            i2 = 0;
        }
        if ((i6 + 2) - (2 | i6) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        if ((4 & i6) != 0) {
            i4 = 0;
        }
        if ((i6 & 8) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        return Constraints(i2, i3, i4, i5);
    }

    public static final long Constraints(int i2, int i3, int i4, int i5) {
        if (!(i3 >= i2)) {
            InlineClassHelperKt.throwIllegalArgumentException("maxWidth(" + i3 + ") must be >= than minWidth(" + i2 + ')');
        }
        if (!(i5 >= i4)) {
            InlineClassHelperKt.throwIllegalArgumentException("maxHeight(" + i5 + ") must be >= than minHeight(" + i4 + ')');
        }
        if (!(i2 >= 0 && i4 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("minWidth(" + i2 + ") and minHeight(" + i4 + ") must be >= 0");
        }
        return createConstraints(i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: constrain-N9IONVI */
    public static final long m6606constrainN9IONVI(long j2, long j3) {
        return Constraints(RangesKt.coerceIn(Constraints.m6593getMinWidthimpl(j3), Constraints.m6593getMinWidthimpl(j2), Constraints.m6591getMaxWidthimpl(j2)), RangesKt.coerceIn(Constraints.m6591getMaxWidthimpl(j3), Constraints.m6593getMinWidthimpl(j2), Constraints.m6591getMaxWidthimpl(j2)), RangesKt.coerceIn(Constraints.m6592getMinHeightimpl(j3), Constraints.m6592getMinHeightimpl(j2), Constraints.m6590getMaxHeightimpl(j2)), RangesKt.coerceIn(Constraints.m6590getMaxHeightimpl(j3), Constraints.m6592getMinHeightimpl(j2), Constraints.m6590getMaxHeightimpl(j2)));
    }

    /* JADX INFO: renamed from: constrain-4WqzIAM */
    public static final long m6605constrain4WqzIAM(long j2, long j3) {
        return IntSizeKt.IntSize(RangesKt.coerceIn(IntSize.m6808getWidthimpl(j3), Constraints.m6593getMinWidthimpl(j2), Constraints.m6591getMaxWidthimpl(j2)), RangesKt.coerceIn(IntSize.m6807getHeightimpl(j3), Constraints.m6592getMinHeightimpl(j2), Constraints.m6590getMaxHeightimpl(j2)));
    }

    /* JADX INFO: renamed from: constrainWidth-K40F9xA */
    public static final int m6608constrainWidthK40F9xA(long j2, int i2) {
        return RangesKt.coerceIn(i2, Constraints.m6593getMinWidthimpl(j2), Constraints.m6591getMaxWidthimpl(j2));
    }

    /* JADX INFO: renamed from: constrainHeight-K40F9xA */
    public static final int m6607constrainHeightK40F9xA(long j2, int i2) {
        return RangesKt.coerceIn(i2, Constraints.m6592getMinHeightimpl(j2), Constraints.m6590getMaxHeightimpl(j2));
    }

    /* JADX INFO: renamed from: isSatisfiedBy-4WqzIAM */
    public static final boolean m6609isSatisfiedBy4WqzIAM(long j2, long j3) {
        int iM6593getMinWidthimpl = Constraints.m6593getMinWidthimpl(j2);
        int iM6591getMaxWidthimpl = Constraints.m6591getMaxWidthimpl(j2);
        int iM6808getWidthimpl = IntSize.m6808getWidthimpl(j3);
        if (iM6593getMinWidthimpl <= iM6808getWidthimpl && iM6808getWidthimpl <= iM6591getMaxWidthimpl) {
            int iM6592getMinHeightimpl = Constraints.m6592getMinHeightimpl(j2);
            int iM6590getMaxHeightimpl = Constraints.m6590getMaxHeightimpl(j2);
            int iM6807getHeightimpl = IntSize.m6807getHeightimpl(j3);
            if (iM6592getMinHeightimpl <= iM6807getHeightimpl && iM6807getHeightimpl <= iM6590getMaxHeightimpl) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: offset-NN6Ew-U$default */
    public static /* synthetic */ long m6611offsetNN6EwU$default(long j2, int i2, int i3, int i4, Object obj) {
        if ((i4 + 1) - (1 | i4) != 0) {
            i2 = 0;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i3 = 0;
        }
        return m6610offsetNN6EwU(j2, i2, i3);
    }

    /* JADX INFO: renamed from: offset-NN6Ew-U */
    public static final long m6610offsetNN6EwU(long j2, int i2, int i3) {
        return Constraints(RangesKt.coerceAtLeast(Constraints.m6593getMinWidthimpl(j2) + i2, 0), addMaxWithMinimum(Constraints.m6591getMaxWidthimpl(j2), i2), RangesKt.coerceAtLeast(Constraints.m6592getMinHeightimpl(j2) + i3, 0), addMaxWithMinimum(Constraints.m6590getMaxHeightimpl(j2), i3));
    }

    private static final int addMaxWithMinimum(int i2, int i3) {
        return i2 == Integer.MAX_VALUE ? i2 : RangesKt.coerceAtLeast(i2 + i3, 0);
    }
}
