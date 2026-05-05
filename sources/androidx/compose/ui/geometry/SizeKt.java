package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d̉=!4i\bDZc|\u0004G\t8\u000b<K\u0007\"2\u0018\u007f\u0007toA0JmP.hS2\u000fq|<$i(yCAW\"}0\u000fWNmgvJp\u000bK\u000f\f\u0017\u0011\u0006:Vmx\f\u0012?6P}W3{~m=n\u0005N\u0005NAh=ѩ\t\u0001(;`8\u0005\r[K:\u0012`D~Mj\r{\u0005J\u0016\u0014R8\u0001L\\\u0018RD]\u0005]h>i\b\u07bcA÷Ϯc2\u0003c\u001b]lJ\u001b\u000fy\u001eY@_5C%\u0004\r\u0015ksE\u0013A\u0002=3hUAqɥyˇ5ݙÿ\u0018\u00171j\u001by\u000bCj\"i`:'SO\u0012i\u0001\u00126\u0017\u0013{;<J\u0602\u000eТG͓ǉ\u001eh\u000e.A\u0016\u000bpNm\u001a^p\u007f#ad&U\u0004AJQ\u001b\u0015Q(ݪ!ل6ަ˿\u0011 )!|Csq\u001c}-\u001b\u0003wy1\u007fcmL\\)q=\u001c\u00047ï\nň\u0003\u0382Ͻ\u00041\u00021<;=Ki^;!\u001a(pD\u0016vKeŞR֟ʐLB(\u0016$_J%\u001aɮ\\d3jxT\u0007,G\u0012rΉ\tą\f\u001d0^}=/'(PUkwnmz\u0018*Gfe_\u0017k<Woԛ3\fȩeߧe\\\u0007\u0016ECp\u0007phH[\u001ac|E0<`j>}$D|\fIռ?Hʑ6Ϝ5#l\u0017N\u000e,DY~\u000fkhqɰ~Y;'\tȏ@#\bɿT\u0006"}, d2 = {"1d]AX9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "5dc\u0010X5MS&F\u000bo@pf4k>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "uI\u0018#", "5dc\u0010X5MS&F\u000bo@pf4k", "uI\u0018\u0017", "7rB=X*BT\u001d~y", "", "7rB=X*BT\u001d~y&<\u000e\u001d#C\u0005.:<\n !Vk\u001d@\u0001.C", "7rB=X*BT\u001d~y&<\u000e\u001d#C\u0005.", "uI\u0018'", "7rD;f7>Q\u001d\u007f~^+", "7rD;f7>Q\u001d\u007f~^+D\u0019@ys\u0006\u0001F?\u0013 Py\u001d8\u0006)?b\f", "7rD;f7>Q\u001d\u007f~^+D\u0019@ys\u0006\u0001F", "!hi2", "EhSA[", "", "6dX4[;", "uE5u=", ":da=", "AsP?g", "As^=", "4qP0g0H\\", ":da= \u001d@E\nknJ", "uI9\u0013\u001c\u0011", "B`Z2B9\u001eZ'~", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "B`Z2B9\u001eZ'~BM4if>E[", "uI;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHuzR", "Bh\\2f", "", "Ahi2", "Bh\\2fs=\u001fij\n`v", "uC9u=", "uE9u=", "", "uH9u=", "BnA2V;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "BnA2V;\u0006c*\u0013n<1\u0003", "uI\u0018\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Io\u0018Dv4BmG\r7k%\u0004", "Ch\u001c4X6FS(\f\u000fX9|\u0010/a\u000e("}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SizeKt {
    /* JADX INFO: renamed from: getCenter-uvyYCjk$annotations */
    public static /* synthetic */ void m4017getCenteruvyYCjk$annotations(long j2) {
    }

    /* JADX INFO: renamed from: isSpecified-uvyYCjk */
    public static final boolean m4018isSpecifieduvyYCjk(long j2) {
        return j2 != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* JADX INFO: renamed from: isSpecified-uvyYCjk$annotations */
    public static /* synthetic */ void m4019isSpecifieduvyYCjk$annotations(long j2) {
    }

    /* JADX INFO: renamed from: isUnspecified-uvyYCjk */
    public static final boolean m4020isUnspecifieduvyYCjk(long j2) {
        return j2 == InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* JADX INFO: renamed from: isUnspecified-uvyYCjk$annotations */
    public static /* synthetic */ void m4021isUnspecifieduvyYCjk$annotations(long j2) {
    }

    /* JADX INFO: renamed from: takeOrElse-TmRCtEA */
    public static final long m4023takeOrElseTmRCtEA(long j2, Function0<Size> function0) {
        return j2 != InlineClassHelperKt.UnspecifiedPackedFloats ? j2 : function0.invoke().m4011unboximpl();
    }

    /* JADX INFO: renamed from: lerp-VgWVRYQ */
    public static final long m4022lerpVgWVRYQ(long j2, long j3, float f2) {
        if (j2 == InlineClassHelperKt.UnspecifiedPackedFloats || j3 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            InlineClassHelperKt.throwIllegalStateException("Offset is unspecified");
        }
        float fLerp = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 >> 32)), f2);
        float fLerp2 = MathHelpersKt.lerp(Float.intBitsToFloat((int) ((j2 + 4294967295L) - (j2 | 4294967295L))), Float.intBitsToFloat((int) (j3 & 4294967295L)), f2);
        return Size.m3997constructorimpl((((long) Float.floatToRawIntBits(fLerp)) << 32) | ((-1) - (((-1) - ((long) Float.floatToRawIntBits(fLerp2))) | ((-1) - 4294967295L))));
    }

    /* JADX INFO: renamed from: times-d16Qtg0 */
    public static final long m4026timesd16Qtg0(int i2, long j2) {
        return Size.m4009times7Ah8Wj8(j2, i2);
    }

    /* JADX INFO: renamed from: times-d16Qtg0 */
    public static final long m4024timesd16Qtg0(double d2, long j2) {
        return Size.m4009times7Ah8Wj8(j2, (float) d2);
    }

    /* JADX INFO: renamed from: times-d16Qtg0 */
    public static final long m4025timesd16Qtg0(float f2, long j2) {
        return Size.m4009times7Ah8Wj8(j2, f2);
    }

    /* JADX INFO: renamed from: toRect-uvyYCjk */
    public static final Rect m4027toRectuvyYCjk(long j2) {
        return RectKt.m3977Recttz77jQw(Offset.Companion.m3953getZeroF1C5BW0(), j2);
    }

    /* JADX INFO: renamed from: getCenter-uvyYCjk */
    public static final long m4016getCenteruvyYCjk(long j2) {
        if (j2 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            InlineClassHelperKt.throwIllegalStateException("Size is unspecified");
        }
        return OffsetKt.Offset(Float.intBitsToFloat((int) (j2 >> 32)) / 2.0f, Float.intBitsToFloat((int) ((-1) - (((-1) - j2) | ((-1) - 4294967295L)))) / 2.0f);
    }

    public static final long Size(float f2, float f3) {
        return Size.m3997constructorimpl(((-1) - (((-1) - ((long) Float.floatToRawIntBits(f3))) | ((-1) - 4294967295L))) | (Float.floatToRawIntBits(f2) << 32));
    }
}
