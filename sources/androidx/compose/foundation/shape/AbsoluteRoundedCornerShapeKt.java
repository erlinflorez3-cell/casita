package androidx.compose.foundation.shape;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: AbsoluteRoundedCornerShape.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0018\u007f\u0007toAӄLeV4ZS0\u0012\u0004\bBřs$ BkY(}:\t}O\u007f}|Ϻr\u000bq\u000e6\u001a\u0007lDI\u0004{ګ\u0011Ɓ̓FqE7[tUonҚN\u0005N1R>\u007f\u0005\u000f BH>y+IQ\f 7XphU=S\u000b\u001a \u000eV /!\rmT6Vuu:]&ʾhĩĚ+a6\u0007[\u0018^`5˙\u000faL*p;C\u0017=S1\u0013j\bMšWqk\u0004\u0019--+Wyo6\u0007\fD\u001b1O\u001bd\u000b&\u000b\u0011\u0002f\u0012'9W{K~\u001aX}\u0001{\u001bE\u001c\u000e43`:;Կ~\b<2%vaMh\u0002\rP\u0018'oا/%.2[?!g_pS\u0019|E,\u000b\u0013\u001f1\u0011\u0007!\nb>f\u001b\u001cb\ti1\u007fNmNT\u000bgO\u0006\u0004\u001fp̦*\t8J\u0006\u009d\u0018?-ϸ)J"}, d2 = {"\u000fab<_<MS\u0006\t\u000bg+|\b\ro\r1{Mn\u001a\u0013Ro", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@38U\t \u0001I\u0013<WJKz4\u000b\u001fxj8\u0007b\nX\u00040GY</X]r\u0013", "1na;X9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@38U\t \u0001K ;VCHY83\u0015>", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u000fab<_<MS\u0006\t\u000bg+|\b\ro\r1{Mn\u001a\u0013RoU\u0007Gw\u007f^wn", "uE\u0018\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0002!'Pn\nKz/>#\f#3x\u0016w)@Iu;.$hNC\u0017l+Nu\u0005QYW,i@u9\u001f\u00120", "Bn_\u0019X-M", "Bn_\u001f\\.Ab", "0ncAb4+W\u001b\u0002\n", "0ncAb4%S\u001a\u000e", "\u000fab<_<MS\u0006\t\u000bg+|\b\ro\r1{Mn\u001a\u0013RoU8J\u0015:=\rn", "uE5\u00139o%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`Hy\u001eEu!D]\b)\u0001{\u0019*XC\u0005G1,\u001foqH\u0007P6^\u007f&GK,6i[rJ\u0002\u0015V\u0019N\u0001", "", ">da0X5M", "", "Bn_\u0019X-M>\u0019\fx^5\f", "Bn_\u001f\\.Ab\u0004~\b\\,\u0006\u0018", "0ncAb4+W\u001b\u0002\nI,\n\u0007/n\u000f", "0ncAb4%S\u001a\u000ee^9z\t8t", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AbsoluteRoundedCornerShapeKt {
    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(CornerSize cornerSize) {
        return new AbsoluteRoundedCornerShape(cornerSize, cornerSize, cornerSize, cornerSize);
    }

    /* JADX INFO: renamed from: AbsoluteRoundedCornerShape-0680j_4, reason: not valid java name */
    public static final AbsoluteRoundedCornerShape m1289AbsoluteRoundedCornerShape0680j_4(float f2) {
        return AbsoluteRoundedCornerShape(CornerSizeKt.m1293CornerSize0680j_4(f2));
    }

    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(float f2) {
        return AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(f2));
    }

    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(int i2) {
        return AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(i2));
    }

    /* JADX INFO: renamed from: AbsoluteRoundedCornerShape-a9UjIt4, reason: not valid java name */
    public static final AbsoluteRoundedCornerShape m1290AbsoluteRoundedCornerShapea9UjIt4(float f2, float f3, float f4, float f5) {
        return new AbsoluteRoundedCornerShape(CornerSizeKt.m1293CornerSize0680j_4(f2), CornerSizeKt.m1293CornerSize0680j_4(f3), CornerSizeKt.m1293CornerSize0680j_4(f4), CornerSizeKt.m1293CornerSize0680j_4(f5));
    }

    public static /* synthetic */ AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape$default(float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        return AbsoluteRoundedCornerShape(f2, f3, f4, f5);
    }

    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(float f2, float f3, float f4, float f5) {
        return new AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(f2), CornerSizeKt.CornerSize(f3), CornerSizeKt.CornerSize(f4), CornerSizeKt.CornerSize(f5));
    }

    public static /* synthetic */ AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape$default(int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((-1) - (((-1) - i6) | ((-1) - 1)) != 0) {
            i2 = 0;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 2)) != 0) {
            i3 = 0;
        }
        if ((4 & i6) != 0) {
            i4 = 0;
        }
        if ((i6 + 8) - (i6 | 8) != 0) {
            i5 = 0;
        }
        return AbsoluteRoundedCornerShape(i2, i3, i4, i5);
    }

    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(int i2, int i3, int i4, int i5) {
        return new AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(i2), CornerSizeKt.CornerSize(i3), CornerSizeKt.CornerSize(i4), CornerSizeKt.CornerSize(i5));
    }

    /* JADX INFO: renamed from: AbsoluteRoundedCornerShape-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ AbsoluteRoundedCornerShape m1291AbsoluteRoundedCornerShapea9UjIt4$default(float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            f2 = Dp.m6638constructorimpl(0);
        }
        if ((2 & i2) != 0) {
            f3 = Dp.m6638constructorimpl(0);
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            f4 = Dp.m6638constructorimpl(0);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            f5 = Dp.m6638constructorimpl(0);
        }
        return m1290AbsoluteRoundedCornerShapea9UjIt4(f2, f3, f4, f5);
    }
}
