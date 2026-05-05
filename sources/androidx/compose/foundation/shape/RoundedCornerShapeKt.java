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
/* JADX INFO: compiled from: RoundedCornerShape.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d̉=!4i\bDJe|\u0004W\u00068é6B\u0015\"4\u0012}\rnjG5L͜P.`Y2\u000fq~L0i&\nCiTJ\u00020\fgN\u0016k\u0007`h\r[\u000f4\u0015)n:Nmx\f\u0018Ǻ1ԏņC5SvKAx+D\u000782P7*\u000b\u0007\u001a8Q(v)I{\u0012\u00180NzRR;S5 \u0018\u0006L+\u0019\u001e\u000bm~<NlkFG#1oƢMϋۢ4~S\u001aTb?\u0019\u0005c6+n6e\u00193X\u001b\u0007\u0001jW/MsU\u0005\u0017&W1Ose?p\u007fB$[U\u0013]\u00010t\u0005\u007fo<-1OqVh\u000eV\u0007+\u0002\u0013<\u0012\u001a\u001e'v=E&t\n&3#q\u0004D^\u0012vB.\fyb%'\u00183Y8KlWbI+f7*\u0016=$)\u0002|4sT<qE!Zx_Ei@kY~\u0010_>{\u0019\tb0;$?UĉG{?-ϲ)=cݽ;#q\u0002VEϜv\nhkYׁnv?̷r,"}, d2 = {"\u0011ha0_,,V\u0015\nz", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@38U\t \u0001Z >VB;j\u0012(\"qaFtf(Yv|", "5dc\u0010\\9<Z\u0019l}Z7|", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~g\u0001\u001cBm_\u001bWSDj4\u001drrnB\u0007p\u001aQr2G\"", " nd;W,=1#\f\u0004^9j\f+p\u007f", "1na;X9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@38U\t \u0001K ;VCHY83\u0015>", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", " nd;W,=1#\f\u0004^9j\f+p\u007foF\u0011Sa\u001cA>", "uE\u0018\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0002!'Pn\nKz/>#\f#3x\u0016w:MKt3\u001e\u0014FkF\u0010c9<y#RL$", "Bn_ g(Kb", "Bn_\u0012a+", "0ncAb4\u001e\\\u0018", "0ncAb4,b\u0015\f\n", " nd;W,=1#\f\u0004^9j\f+p\u007fow\u0014p\u001czV>", "uE5\u00139o%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`Hy\u001eEu!D]\b)\u0001{\u0019*XC\u0005X>.\u001ega8dm9Wv45OJ7\\(", "", ">da0X5M", "", "Bn_ g(Kb\u0004~\b\\,\u0006\u0018", "Bn_\u0012a+)S&|zg;", "0ncAb4\u001e\\\u0018izk*|\u0012>", "0ncAb4,b\u0015\f\nI,\n\u0007/n\u000f", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RoundedCornerShapeKt {
    private static final RoundedCornerShape CircleShape = RoundedCornerShape(50);

    public static final RoundedCornerShape getCircleShape() {
        return CircleShape;
    }

    public static final RoundedCornerShape RoundedCornerShape(CornerSize cornerSize) {
        return new RoundedCornerShape(cornerSize, cornerSize, cornerSize, cornerSize);
    }

    /* JADX INFO: renamed from: RoundedCornerShape-0680j_4 */
    public static final RoundedCornerShape m1301RoundedCornerShape0680j_4(float f2) {
        return RoundedCornerShape(CornerSizeKt.m1293CornerSize0680j_4(f2));
    }

    public static final RoundedCornerShape RoundedCornerShape(float f2) {
        return RoundedCornerShape(CornerSizeKt.CornerSize(f2));
    }

    public static final RoundedCornerShape RoundedCornerShape(int i2) {
        return RoundedCornerShape(CornerSizeKt.CornerSize(i2));
    }

    /* JADX INFO: renamed from: RoundedCornerShape-a9UjIt4 */
    public static final RoundedCornerShape m1302RoundedCornerShapea9UjIt4(float f2, float f3, float f4, float f5) {
        return new RoundedCornerShape(CornerSizeKt.m1293CornerSize0680j_4(f2), CornerSizeKt.m1293CornerSize0680j_4(f3), CornerSizeKt.m1293CornerSize0680j_4(f4), CornerSizeKt.m1293CornerSize0680j_4(f5));
    }

    public static /* synthetic */ RoundedCornerShape RoundedCornerShape$default(float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            f2 = 0.0f;
        }
        if ((2 & i2) != 0) {
            f3 = 0.0f;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        return RoundedCornerShape(f2, f3, f4, f5);
    }

    public static final RoundedCornerShape RoundedCornerShape(float f2, float f3, float f4, float f5) {
        return new RoundedCornerShape(CornerSizeKt.CornerSize(f2), CornerSizeKt.CornerSize(f3), CornerSizeKt.CornerSize(f4), CornerSizeKt.CornerSize(f5));
    }

    public static /* synthetic */ RoundedCornerShape RoundedCornerShape$default(int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((-1) - (((-1) - i6) | ((-1) - 1)) != 0) {
            i2 = 0;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 2)) != 0) {
            i3 = 0;
        }
        if ((i6 + 4) - (4 | i6) != 0) {
            i4 = 0;
        }
        if ((i6 + 8) - (i6 | 8) != 0) {
            i5 = 0;
        }
        return RoundedCornerShape(i2, i3, i4, i5);
    }

    public static final RoundedCornerShape RoundedCornerShape(int i2, int i3, int i4, int i5) {
        return new RoundedCornerShape(CornerSizeKt.CornerSize(i2), CornerSizeKt.CornerSize(i3), CornerSizeKt.CornerSize(i4), CornerSizeKt.CornerSize(i5));
    }

    /* JADX INFO: renamed from: RoundedCornerShape-a9UjIt4$default */
    public static /* synthetic */ RoundedCornerShape m1303RoundedCornerShapea9UjIt4$default(float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((1 & i2) != 0) {
            f2 = Dp.m6638constructorimpl(0);
        }
        if ((2 & i2) != 0) {
            f3 = Dp.m6638constructorimpl(0);
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            f4 = Dp.m6638constructorimpl(0);
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            f5 = Dp.m6638constructorimpl(0);
        }
        return m1302RoundedCornerShapea9UjIt4(f2, f3, f4, f5);
    }
}
