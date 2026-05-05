package androidx.compose.animation;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.ui.unit.Density;
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
/* JADX INFO: compiled from: SplineBasedDecay.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d̉=!,n\bDJf|\u0004O\u00068é6B\r44\u0012}\u0007njG6L͜P.hS2\u000fq{<$q$yّSs(\u0002:\t}S\u0018k|Pr\u000bq\u00166\u001a\u0007rDI\u0004\u007f\u000e\u0016\u001d;Zom=\u0014oUQn\u007fN\u000b0428@\u0012/&JJ\u0016͌\tP{\u0010 >Xpha-Y\u0013܅*\u0006l\u001fWȩ/ʄR6PǍ}F=#\u001bipM}ۂ\u0003ƊQ\rNÖG\u0019\u0005b6+n6\fՙw٨\u0007\u0007Z¹_\u000fMsU\u0005\u0017&}ǥ\u001cָ[6`Ü4!9R%]!%3ӧ$ԃ\u0010'3ՒӓO`"}, d2 = {"\u0013mS!X5LW#\b", "", "\u0017mU9X*MW#\b", "\u001e0", "\u001e1", "!sP?g\u001b>\\'\u0003\u0005g", "1n\\=h;>A$\u0006~g,`\u00120o", "", "Ao[6a,)]'\u0003\nb6\u0006\u0017", "", "Ao[6a,-W!~\t", "<aB.`7ES'", "", "Ao[6a,\u001bO'~y=,z\u0005C", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG~7k\u0012B)L?s0-\u0019rj'\u0012c*$", "\"", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SplineBasedDecayKt {
    private static final float EndTension = 1.0f;
    private static final float Inflection = 0.35f;
    private static final float P1 = 0.175f;
    private static final float P2 = 0.35000002f;
    private static final float StartTension = 0.5f;

    public static final void computeSplineInfo(float[] fArr, float[] fArr2, int i2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i3 = 0; i3 < i2; i3++) {
            float f12 = i3 / i2;
            float f13 = 1.0f;
            while (true) {
                f2 = ((f13 - f10) / 2.0f) + f10;
                f3 = 1.0f - f2;
                f4 = f2 * 3.0f * f3;
                f5 = f2 * f2 * f2;
                float f14 = (((f3 * P1) + (P2 * f2)) * f4) + f5;
                if (Math.abs(f14 - f12) < 1.0E-5d) {
                    break;
                } else if (f14 > f12) {
                    f13 = f2;
                } else {
                    f10 = f2;
                }
            }
            float f15 = 0.5f;
            fArr[i3] = (f4 * ((f3 * 0.5f) + f2)) + f5;
            float f16 = 1.0f;
            while (true) {
                f6 = ((f16 - f11) / 2.0f) + f11;
                f7 = 1.0f - f6;
                f8 = f6 * 3.0f * f7;
                f9 = f6 * f6 * f6;
                float f17 = (((f7 * f15) + f6) * f8) + f9;
                if (Math.abs(f17 - f12) >= 1.0E-5d) {
                    if (f17 > f12) {
                        f16 = f6;
                    } else {
                        f11 = f6;
                    }
                    f15 = 0.5f;
                }
            }
            fArr2[i3] = (f8 * ((f7 * P1) + (f6 * P2))) + f9;
        }
        fArr2[i2] = 1.0f;
        fArr[i2] = 1.0f;
    }

    public static final <T> DecayAnimationSpec<T> splineBasedDecay(Density density) {
        return DecayAnimationSpecKt.generateDecayAnimationSpec(new SplineBasedFloatDecayAnimationSpec(density));
    }
}
