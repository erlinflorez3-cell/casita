package androidx.compose.material3.carousel;

import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: Keylines.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d̉=!,n\bDJe|\u0004W\u00068\u000b4E\u0007\"B\u0012\u007f\u0007ljA0ZeP.XS2\u000fy\u0002<$a'\naI٥2}P\b\u007fRug\u0007J\t\ns\u0013\u0014\u0017\u0011jZH\u0006|k\u0014'2pn\u00063e\u001eK<xtd\tP60=\u0012\u0005/\u0019ZL\u001e|\u0013Cy\u000bB4NwRR;L5\u001e \u000eV /\u001d\rk\\?`l\fDu݊\u001b,PY?_^\u0001}\u0011T`?\r%nN/N<M\u0015SR3\u000b`iW\u0003mpm\tv-?+wr\b:f\u000f,\u0015Y_=cx&j\u0016i`:&[UiK^ @w)zSɝ\u001c4\u0014:`.[\u001e\u0017\f\u001c?\rr\u0002M\u0001\u0006lG\u0018z\u00105G)\u000eGC9Ie\u0002eI\u001ff7*\u0004S̔ũ\u0005\u0004"}, d2 = {"1`[0h3:b\u0019fz]0\r\u0011\rh\u0004/z.\u0005,\u0017", "", ";h]6`<F;\u0019}~n4j\rDe", ":`a4X\u0010MS!l~s,", "@d\\.\\5B\\\u001bl\u0006Z*|", "1qT.g,%S\u001a\u000eVe0~\u0012/de(\u0010G\u0005 \u0017.s\u001cK", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\u0014MWBo=\u001e{loH\\", "1`a<h:>Z\u0001z~g\b\u0010\r=S\u0004={", "7sT:F7:Q\u001d\b|", ":dUA45<V#\fhbA|", "@hV5g\bGQ\u001c\t\bL0\u0012\t", "/qa.a.>[\u0019\b\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\nZP7t6\u001e\u001dhjH\\", ";t[A\\\tK]+\rzD,\u0011\u00103n\u007f\u000f\u007fN\u0010", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", ">qT3X9KS\u0018b\n^4j\rDe", "7sT:66N\\(", "", ";h] `(EZ|\u000ezf\u001a\u0001\u001e/", ";`g `(EZ|\u000ezf\u001a\u0001\u001e/", "CmR<a;:W\"~yD,\u0011\u00103n\u007f\u000f\u007fN\u0010", "7sT:F0SS", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class KeylinesKt {
    public static /* synthetic */ KeylineList multiBrowseKeylineList$default(Density density, float f2, float f3, float f4, int i2, float f5, float f6, int i3, Object obj) {
        if ((32 & i3) != 0) {
            f5 = density.mo710toPx0680j_4(CarouselDefaults.INSTANCE.m2899getMinSmallItemSizeD9Ej5fM$material3_release());
        }
        if ((-1) - (((-1) - i3) | ((-1) - 64)) != 0) {
            f6 = density.mo710toPx0680j_4(CarouselDefaults.INSTANCE.m2898getMaxSmallItemSizeD9Ej5fM$material3_release());
        }
        return multiBrowseKeylineList(density, f2, f3, f4, i2, f5, f6);
    }

    public static final KeylineList multiBrowseKeylineList(Density density, float f2, float f3, float f4, int i2, float f5, float f6) {
        if (f2 == 0.0f || f3 == 0.0f) {
            return KeylineListKt.emptyKeylineList();
        }
        int[] iArr = {1};
        int[] iArr2 = {1, 0};
        float fMin = Math.min(f3, f2);
        float fCoerceIn = RangesKt.coerceIn(fMin / 3.0f, f5, f6);
        float f7 = (fMin + fCoerceIn) / 2.0f;
        if (f2 < 2 * f5) {
            iArr = new int[]{0};
        }
        int iCeil = (int) Math.ceil(f2 / fMin);
        int iMax = (iCeil - Math.max(1, (int) Math.floor(((f2 - (ArraysKt.maxOrThrow(iArr2) * f7)) - (ArraysKt.maxOrThrow(iArr) * f6)) / fMin))) + 1;
        int[] iArr3 = new int[iMax];
        for (int i3 = 0; i3 < iMax; i3++) {
            iArr3[i3] = iCeil - i3;
        }
        float fMo710toPx0680j_4 = density.mo710toPx0680j_4(CarouselDefaults.INSTANCE.m2897getAnchorSizeD9Ej5fM$material3_release());
        Arrangement arrangementFindLowestCostArrangement = Arrangement.Companion.findLowestCostArrangement(f2, f4, fCoerceIn, f5, f6, iArr, f7, iArr2, fMin, iArr3);
        if (arrangementFindLowestCostArrangement != null && arrangementFindLowestCostArrangement.itemCount() > i2) {
            int smallCount = arrangementFindLowestCostArrangement.getSmallCount();
            int mediumCount = arrangementFindLowestCostArrangement.getMediumCount();
            for (int iItemCount = arrangementFindLowestCostArrangement.itemCount() - i2; iItemCount > 0; iItemCount--) {
                if (smallCount > 0) {
                    smallCount--;
                } else if (mediumCount > 1) {
                    mediumCount--;
                }
            }
            arrangementFindLowestCostArrangement = Arrangement.Companion.findLowestCostArrangement(f2, f4, fCoerceIn, f5, f6, new int[]{smallCount}, f7, new int[]{mediumCount}, fMin, iArr3);
        }
        if (arrangementFindLowestCostArrangement == null) {
            return KeylineListKt.emptyKeylineList();
        }
        return createLeftAlignedKeylineList(f2, f4, fMo710toPx0680j_4, fMo710toPx0680j_4, arrangementFindLowestCostArrangement);
    }

    public static final KeylineList createLeftAlignedKeylineList(float f2, float f3, final float f4, final float f5, final Arrangement arrangement) {
        return KeylineListKt.m2905keylineListOfWNYm7Xg(f2, f3, CarouselAlignment.Companion.m2896getStartNUL3oTo(), new Function1<KeylineListScope, Unit>() { // from class: androidx.compose.material3.carousel.KeylinesKt.createLeftAlignedKeylineList.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KeylineListScope keylineListScope) {
                invoke2(keylineListScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(KeylineListScope keylineListScope) {
                keylineListScope.add(f4, true);
                int largeCount = arrangement.getLargeCount();
                Arrangement arrangement2 = arrangement;
                for (int i2 = 0; i2 < largeCount; i2++) {
                    KeylineListScope.add$default(keylineListScope, arrangement2.getLargeSize(), false, 2, null);
                }
                int mediumCount = arrangement.getMediumCount();
                Arrangement arrangement3 = arrangement;
                for (int i3 = 0; i3 < mediumCount; i3++) {
                    KeylineListScope.add$default(keylineListScope, arrangement3.getMediumSize(), false, 2, null);
                }
                int smallCount = arrangement.getSmallCount();
                Arrangement arrangement4 = arrangement;
                for (int i4 = 0; i4 < smallCount; i4++) {
                    KeylineListScope.add$default(keylineListScope, arrangement4.getSmallSize(), false, 2, null);
                }
                keylineListScope.add(f5, true);
            }
        });
    }

    public static final KeylineList uncontainedKeylineList(Density density, float f2, float f3, float f4) {
        if (f2 == 0.0f || f3 == 0.0f) {
            return KeylineListKt.emptyKeylineList();
        }
        float fMin = Math.min(f3 + f4, f2);
        int iMax = Math.max(1, (int) Math.floor(f2 / fMin));
        float f5 = f2 - (iMax * fMin);
        int i2 = f5 <= 0.0f ? 0 : 1;
        float fMo710toPx0680j_4 = density.mo710toPx0680j_4(CarouselDefaults.INSTANCE.m2897getAnchorSizeD9Ej5fM$material3_release());
        float fCalculateMediumChildSize = calculateMediumChildSize(fMo710toPx0680j_4, fMin, f5);
        return createLeftAlignedKeylineList(f2, f4, Math.max(Math.min(fMo710toPx0680j_4, f3), fCalculateMediumChildSize * 0.5f), fMo710toPx0680j_4, new Arrangement(0, 0.0f, 0, fCalculateMediumChildSize, i2, fMin, iMax));
    }

    private static final float calculateMediumChildSize(float f2, float f3, float f4) {
        float fMax = Math.max(1.5f * f4, f2);
        float f5 = f3 * 0.85f;
        return fMax > f5 ? Math.max(f5, f4 * 1.2f) : fMax;
    }
}
