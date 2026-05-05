package com.swmansion.rnscreens.bottomsheet;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000b<H\u0007Ӭ4\u0012\u0006\u0010nj?3LeV3ZS0\u0013\u00047Břs*\u0002EKU`}P\boTm˧|J\u0003\u000bq\u0010.\u001c\tl<I\u001cx\f\u0011?:HoM5eqS8\u000fwf\u000b&20<\u0012\u0005/\u001fpϺǘzzQQ$g>G\t@b\u000f]\u0005`\u00124=@\u0007$ձuN^H\u001b^b53\u0005yB\u0015'\u000e/-U\u0013Fb/%xw\u001dYCg=\u001b%a\f\u001fTq>1B\"E\u000bh51CK\nVdc0\u001c\u001b+]\u0019ut<[3T'ϯˏ/OqXhW6\u0006\u0013\u0002\u001d>\u0014\u000eL'v-M lڜ\u001c3\u001dr\u0002Ax\bnD\u0010z(6E$0;19)nicQ\u0018|:,\r\u0013\u001e1\n\u0007#qS<cE#Zw_@iBSG|\r Ɲъ\bpp\u0012ø\bA"}, d2 = {"CrT \\5@Z\u0019]zm,\u0006\u0018", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EH|&\u0017Ts\nC@\"?h\r*?{\u0019.MR\u0005H>-$ri'\nc,]S'JH_0f_H", "\"", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "6dX4[;", "", "4na0X\fQ^\u0015\by^+j\u0018+t\u007f", "", "uKR<`u@]#\u0001\u0002^ux\u0012.r\n,z\n\t\u0013&G|\u00128}n2c\r/Au$1MCJ5\u0011($wkAtf,N\u0006\u0004GOJ=`\\\u007f\u0013z\u0017V\u001fJt\u0014\u0001bCmRMF\u001f\n,VW0,g\n \u0016~lzLX\u0017GC\u0011~@6rJX)\u0002CPEo.`\u0013)\u001afII.\u001c\u007f\u001c\u001bh_wf\u0006b |ZgjgG(W8':~_PRE", "CrT![9>Sw~\n^5\f\u0017", "AsPAX", "4ha@g\u000f>W\u001b\u0002\n", "6`[38?IO\"}z]\u0019x\u00183o", "", "3w_.a+>R\u0003\u007f{l,\fi<o\b\u0017\u0006K", "uKR<`u@]#\u0001\u0002^ux\u0012.r\n,z\n\t\u0013&G|\u00128}n2c\r/Au$1MCJ5\u0011($wkAtf,N\u0006\u0004GOJ=`\\\u007f\u0013z\u0017V\u001fJt\u0014\u0001bCmRMF\u001f\n,VW\"m|\u001d\u0012W<fyD sP\t\u0015wA6>-^[\u000bC\u000bL^3fU@$f6Iyzv\u0015,d\u001a5\u0006\u0005UZV[\tgiG&P{\u000b<wc\u0010Gy_>{'hG\u0005v\u001f<\\st|)\u001347:`\f\u0015d\"Mm\u0003\u001d:_A'5\u007f\u0019\u001dNZm}ZA\u000eh.>\b\u0011^F5#r;", "CrT!j6\u001dS(~\u0004m:", "AdR<a+!S\u001d\u0001}m", "uKR<`u@]#\u0001\u0002^ux\u0012.r\n,z\n\t\u0013&G|\u00128}n2c\r/Au$1MCJ5\u0011($wkAtf,N\u0006\u0004GOJ=`\\\u007f\u0013z\u0017V\u001fJt\u0014\u0001bCmRMF\u001f\n,VW\"m|\u001d\u0012W<fyD sP\t\u0015wA6>-^[\u000bC\u000bL^3fUC&k:<$!G\\\u0002fZ6S}]\u001btYy1cP\u0018\bB(=7cBTob@p.hH\u0006\u0007!<`\u0003.t-\u0013}\u0007@s\u0014Uo\u0006A^x$\t\\D#7:F \u0015", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class BottomSheetBehaviorExtKt {
    public static final <T extends View> BottomSheetBehavior<T> useSingleDetent(BottomSheetBehavior<T> bottomSheetBehavior, Integer num, boolean z2) throws Throwable {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "<this>");
        bottomSheetBehavior.setSkipCollapsed(true);
        bottomSheetBehavior.setFitToContents(true);
        if (z2) {
            bottomSheetBehavior.setState(3);
        }
        if (num != null) {
            num.intValue();
            bottomSheetBehavior.setMaxHeight(num.intValue());
        }
        return bottomSheetBehavior;
    }

    public static /* synthetic */ BottomSheetBehavior useSingleDetent$default(BottomSheetBehavior bottomSheetBehavior, Integer num, boolean z2, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            num = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z2 = true;
        }
        return useSingleDetent(bottomSheetBehavior, num, z2);
    }

    public static final <T extends View> BottomSheetBehavior<T> useThreeDetents(BottomSheetBehavior<T> bottomSheetBehavior, Integer num, Integer num2, Float f2, Integer num3) throws Throwable {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "<this>");
        bottomSheetBehavior.setSkipCollapsed(false);
        bottomSheetBehavior.setFitToContents(false);
        if (num != null) {
            num.intValue();
            bottomSheetBehavior.setState(num.intValue());
        }
        if (num2 != null) {
            num2.intValue();
            bottomSheetBehavior.setPeekHeight(num2.intValue());
        }
        if (f2 != null) {
            f2.floatValue();
            bottomSheetBehavior.setHalfExpandedRatio(f2.floatValue());
        }
        if (num3 != null) {
            num3.intValue();
            bottomSheetBehavior.setExpandedOffset(num3.intValue());
        }
        return bottomSheetBehavior;
    }

    public static /* synthetic */ BottomSheetBehavior useThreeDetents$default(BottomSheetBehavior bottomSheetBehavior, Integer num, Integer num2, Float f2, Integer num3, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            num = null;
        }
        if ((2 & i2) != 0) {
            num2 = null;
        }
        if ((4 & i2) != 0) {
            f2 = null;
        }
        if ((i2 & 8) != 0) {
            num3 = null;
        }
        return useThreeDetents(bottomSheetBehavior, num, num2, f2, num3);
    }

    public static final <T extends View> BottomSheetBehavior<T> useTwoDetents(BottomSheetBehavior<T> bottomSheetBehavior, Integer num, Integer num2, Integer num3) throws Throwable {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "<this>");
        bottomSheetBehavior.setSkipCollapsed(false);
        bottomSheetBehavior.setFitToContents(true);
        if (num != null) {
            num.intValue();
            bottomSheetBehavior.setState(num.intValue());
        }
        if (num2 != null) {
            num2.intValue();
            bottomSheetBehavior.setPeekHeight(num2.intValue());
        }
        if (num3 != null) {
            num3.intValue();
            bottomSheetBehavior.setMaxHeight(num3.intValue());
        }
        return bottomSheetBehavior;
    }

    public static /* synthetic */ BottomSheetBehavior useTwoDetents$default(BottomSheetBehavior bottomSheetBehavior, Integer num, Integer num2, Integer num3, int i2, Object obj) {
        if ((1 & i2) != 0) {
            num = null;
        }
        if ((2 & i2) != 0) {
            num2 = null;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            num3 = null;
        }
        return useTwoDetents(bottomSheetBehavior, num, num2, num3);
    }
}
