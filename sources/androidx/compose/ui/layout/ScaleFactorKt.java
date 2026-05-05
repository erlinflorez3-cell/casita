package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
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
/* JADX INFO: compiled from: ScaleFactor.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d̉=!,r\bDZc|\u0004G\r8\u000b<G\u0007\"2\u0019\u007f\u0007|jA0JiP.hS2\u000fq\u0001L?i,\nCiUJ\u00020\u0012gN\u0016q\u001fNh\u0016[\u000f4 ?o߽MU\u0007i*7@O\b?aM AGn\r63 b&F\t\u001d\u0001H*x\u0014\u0005\u000b[K:\u001cvEú9ĥҫQ\u0007 #\u0014P8\u001e,o\u007fNd\\\u0015]hCS\u0007wWf'\u000e0Cչ\rѸS܋˼zc$ANNM\u001f3k\u001b\u0007\u0001eg\u0003m{\u0004\u0005\u0001J5Das\u00066\u0001\u007fB\u0015[Y\u001bw\u000b,l\u0007a`:'Yj*֦V̤'»ߡ\u007f\u000fB \u001c#?e<K2f6\"[t!gpT\u0010sZ\u007f)a|Е%Ƨ2ٿݰ\u001fhW\u0001I0fT\n#%\u001eQ\u0015\u0017!\nT>d#;lw\u007fE\u0018̽=̩MˣՒAo\n\u0012p\u0019J!>Ϛ\u0018/*\u0010V\u0017S7\u0012߄#wȅ\u0004ҩHq\u0007\u0007fiakjJF%|\u001aWG\u0017\u0011rD\u0013\u0004\u0014P\u0003XbӑMrΉ\tą\f\u001d0^}B/'(PUownܗ]\u000f-2lƟu\u001dj\u07b6[["}, d2 = {"7rB=X*BT\u001d~y", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006d#1`}\u00013k%8Z\u0019", "7rB=X*BT\u001d~y&\rb[+Ys6:<\n !Vk\u001d@\u0001.C", "uI\u0018#", "7rB=X*BT\u001d~y&\rb[+Ys6", "uI\u0018'", "7rD;f7>Q\u001d\u007f~^+", "7rD;f7>Q\u001d\u007f~^+Di\u00158{\u001coN?\u0013 Py\u001d8\u0006)?b\f", "7rD;f7>Q\u001d\u007f~^+Di\u00158{\u001coN", "!bP9X\r:Q(\t\b", "AbP9X\u001f", "", "AbP9X ", "uE5u=", ":da=", "AsP?g", "As^=", "4qP0g0H\\", ":da= s;2|\u007fK)", "uI9\u0013\u001c\u0011", "2he", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "AbP9X\r:Q(\t\b", "2heyH\u0018-E\u001aP\r", "uI9u=", "@nd;W\u001bHB\u0019\b\na:", "B`Z2B9\u001eZ'~", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "B`Z2B9\u001eZ'~Bh@[\b{q\n", "uI;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHuzR", "Bh\\2f", "Bh\\2fs.?\bp{0>", "Ahi2", "Bh\\2fsF\u001b+Kz2z", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ScaleFactorKt {
    /* JADX INFO: renamed from: isSpecified-FK8aYYs$annotations */
    public static /* synthetic */ void m5613isSpecifiedFK8aYYs$annotations(long j2) {
    }

    /* JADX INFO: renamed from: isUnspecified-FK8aYYs$annotations */
    public static /* synthetic */ void m5615isUnspecifiedFK8aYYs$annotations(long j2) {
    }

    public static final float roundToTenths(float f2) {
        float f3 = 10;
        float f4 = f2 * f3;
        int i2 = (int) f4;
        if (f4 - i2 >= 0.5f) {
            i2++;
        }
        return i2 / f3;
    }

    /* JADX INFO: renamed from: isSpecified-FK8aYYs */
    public static final boolean m5612isSpecifiedFK8aYYs(long j2) {
        return j2 != ScaleFactor.Companion.m5610getUnspecified_hLwfpc();
    }

    /* JADX INFO: renamed from: isUnspecified-FK8aYYs */
    public static final boolean m5614isUnspecifiedFK8aYYs(long j2) {
        return j2 == ScaleFactor.Companion.m5610getUnspecified_hLwfpc();
    }

    /* JADX INFO: renamed from: times-UQTWf7w */
    public static final long m5618timesUQTWf7w(long j2, long j3) {
        return SizeKt.Size(Size.m4006getWidthimpl(j2) * ScaleFactor.m5603getScaleXimpl(j3), Size.m4003getHeightimpl(j2) * ScaleFactor.m5604getScaleYimpl(j3));
    }

    /* JADX INFO: renamed from: times-m-w2e94 */
    public static final long m5619timesmw2e94(long j2, long j3) {
        return m5618timesUQTWf7w(j3, j2);
    }

    /* JADX INFO: renamed from: div-UQTWf7w */
    public static final long m5611divUQTWf7w(long j2, long j3) {
        return SizeKt.Size(Size.m4006getWidthimpl(j2) / ScaleFactor.m5603getScaleXimpl(j3), Size.m4003getHeightimpl(j2) / ScaleFactor.m5604getScaleYimpl(j3));
    }

    /* JADX INFO: renamed from: lerp--bDIf60 */
    public static final long m5616lerpbDIf60(long j2, long j3, float f2) {
        return ScaleFactor(MathHelpersKt.lerp(ScaleFactor.m5603getScaleXimpl(j2), ScaleFactor.m5603getScaleXimpl(j3), f2), MathHelpersKt.lerp(ScaleFactor.m5604getScaleYimpl(j2), ScaleFactor.m5604getScaleYimpl(j3), f2));
    }

    public static final long ScaleFactor(float f2, float f3) {
        return ScaleFactor.m5597constructorimpl((((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
    }

    /* JADX INFO: renamed from: takeOrElse-oyDd2qo */
    public static final long m5617takeOrElseoyDd2qo(long j2, Function0<ScaleFactor> function0) {
        return j2 != ScaleFactor.Companion.m5610getUnspecified_hLwfpc() ? j2 : function0.invoke().m5608unboximpl();
    }
}
