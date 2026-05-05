package androidx.compose.ui.graphics;

import android.graphics.PorterDuff;
import android.os.Build;
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
/* JADX INFO: compiled from: AndroidBlendMode.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я \u001d̉=!,r\bDZc|\u0004G\u00078\u000bDB\u0007\"2\u0015\u007f\u0007|jA0Jf`@`ݷB\u000f\u001az\\$\n$܇BПڈ\u001e\u007f(\n]P\u007f{|Mr\u000bq\u0013.\u0016'jrHȺwزܫ\u00134HtM9e~K@xtd\u0005H2P<@\u0004в\u001e*V\u0018\u000f\u000fQT$\u0012^J\u0019:\u0001\r\u0014Ĩݾ\u0011ß̧$\u0003$guZȧHqe=5ݬ\u001f\u0018AĠ+l"}, d2 = {"7rBBc7H`(~y", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`})6U -M\u0019", "7rBBc7H`(~y&:P\u00058f\u0006z", "uH\u0018'", "Bn0;W9HW\u0018[\u0002^5{p9d\u007f", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u0003@\n\u0016~Qn\u000e\u0012", "Bn0;W9HW\u0018[\u0002^5{p9d\u007fo\n\u0014| \u0018MB", "uH\u0018\u0019T5=`#\u0003y(.\n\u0005:h\u0004&\n\n]\u001e\u0017PnuFu%\u000b", "Bn2<`7Ha\u0019[\u0002^5{p9d\u007f", "uKP;W9HW\u0018H|k(\b\f3c\u000eqXG\u0001 \u0016/y\r<Lh\u0019", "Bn?<e;>`w\u000f{_\u0014\u0007\b/", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013\u0006M\u0010\u0017$&\u007f\u000f=5\r?X}u", "Bn?<e;>`w\u000f{_\u0014\u0007\b/-\u000e{wI\u0002\u001di", "uH\u0018\u0019T5=`#\u0003y(.\n\u0005:h\u0004&\n\nk!$Vo\u001b\u001b\u0007&6\u0018e*6mk", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidBlendMode_androidKt {

    /* JADX INFO: compiled from: AndroidBlendMode.android.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[android.graphics.BlendMode.values().length];
            try {
                iArr[android.graphics.BlendMode.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[android.graphics.BlendMode.SRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[android.graphics.BlendMode.DST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[android.graphics.BlendMode.SRC_OVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[android.graphics.BlendMode.DST_OVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[android.graphics.BlendMode.SRC_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[android.graphics.BlendMode.DST_IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[android.graphics.BlendMode.SRC_OUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[android.graphics.BlendMode.DST_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[android.graphics.BlendMode.SRC_ATOP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[android.graphics.BlendMode.DST_ATOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[android.graphics.BlendMode.XOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[android.graphics.BlendMode.PLUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[android.graphics.BlendMode.MODULATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[android.graphics.BlendMode.SCREEN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[android.graphics.BlendMode.OVERLAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[android.graphics.BlendMode.DARKEN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[android.graphics.BlendMode.LIGHTEN.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[android.graphics.BlendMode.COLOR_DODGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[android.graphics.BlendMode.COLOR_BURN.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[android.graphics.BlendMode.HARD_LIGHT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[android.graphics.BlendMode.SOFT_LIGHT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[android.graphics.BlendMode.DIFFERENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[android.graphics.BlendMode.EXCLUSION.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[android.graphics.BlendMode.MULTIPLY.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[android.graphics.BlendMode.HUE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[android.graphics.BlendMode.SATURATION.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[android.graphics.BlendMode.COLOR.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[android.graphics.BlendMode.LUMINOSITY.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: isSupported-s9anfk8, reason: not valid java name */
    public static final boolean m4028isSupporteds9anfk8(int i2) {
        return Build.VERSION.SDK_INT >= 29 || BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4120getSrcOver0nO6VwU()) || m4030toPorterDuffModes9anfk8(i2) != PorterDuff.Mode.SRC_OVER;
    }

    /* JADX INFO: renamed from: toPorterDuffMode-s9anfk8, reason: not valid java name */
    public static final PorterDuff.Mode m4030toPorterDuffModes9anfk8(int i2) {
        if (BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4093getClear0nO6VwU())) {
            return PorterDuff.Mode.CLEAR;
        }
        if (BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4116getSrc0nO6VwU())) {
            return PorterDuff.Mode.SRC;
        }
        if (BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4099getDst0nO6VwU())) {
            return PorterDuff.Mode.DST;
        }
        if (BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4120getSrcOver0nO6VwU())) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4103getDstOver0nO6VwU())) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4118getSrcIn0nO6VwU())) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4101getDstIn0nO6VwU())) {
            return PorterDuff.Mode.DST_IN;
        }
        if (BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4119getSrcOut0nO6VwU())) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4102getDstOut0nO6VwU())) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4117getSrcAtop0nO6VwU())) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4100getDstAtop0nO6VwU())) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4121getXor0nO6VwU())) {
            return PorterDuff.Mode.XOR;
        }
        if (BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4112getPlus0nO6VwU())) {
            return PorterDuff.Mode.ADD;
        }
        if (BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4114getScreen0nO6VwU())) {
            return PorterDuff.Mode.SCREEN;
        }
        if (BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4111getOverlay0nO6VwU())) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4097getDarken0nO6VwU())) {
            return PorterDuff.Mode.DARKEN;
        }
        if (BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4107getLighten0nO6VwU())) {
            return PorterDuff.Mode.LIGHTEN;
        }
        if (BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4109getModulate0nO6VwU())) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    /* JADX INFO: renamed from: toAndroidBlendMode-s9anfk8, reason: not valid java name */
    public static final android.graphics.BlendMode m4029toAndroidBlendModes9anfk8(int i2) {
        return BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4093getClear0nO6VwU()) ? android.graphics.BlendMode.CLEAR : BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4116getSrc0nO6VwU()) ? android.graphics.BlendMode.SRC : BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4099getDst0nO6VwU()) ? android.graphics.BlendMode.DST : BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4120getSrcOver0nO6VwU()) ? android.graphics.BlendMode.SRC_OVER : BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4103getDstOver0nO6VwU()) ? android.graphics.BlendMode.DST_OVER : BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4118getSrcIn0nO6VwU()) ? android.graphics.BlendMode.SRC_IN : BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4101getDstIn0nO6VwU()) ? android.graphics.BlendMode.DST_IN : BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4119getSrcOut0nO6VwU()) ? android.graphics.BlendMode.SRC_OUT : BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4102getDstOut0nO6VwU()) ? android.graphics.BlendMode.DST_OUT : BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4117getSrcAtop0nO6VwU()) ? android.graphics.BlendMode.SRC_ATOP : BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4100getDstAtop0nO6VwU()) ? android.graphics.BlendMode.DST_ATOP : BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4121getXor0nO6VwU()) ? android.graphics.BlendMode.XOR : BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4112getPlus0nO6VwU()) ? android.graphics.BlendMode.PLUS : BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4109getModulate0nO6VwU()) ? android.graphics.BlendMode.MODULATE : BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4114getScreen0nO6VwU()) ? android.graphics.BlendMode.SCREEN : BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4111getOverlay0nO6VwU()) ? android.graphics.BlendMode.OVERLAY : BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4097getDarken0nO6VwU()) ? android.graphics.BlendMode.DARKEN : BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4107getLighten0nO6VwU()) ? android.graphics.BlendMode.LIGHTEN : BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4096getColorDodge0nO6VwU()) ? android.graphics.BlendMode.COLOR_DODGE : BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4095getColorBurn0nO6VwU()) ? android.graphics.BlendMode.COLOR_BURN : BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4105getHardlight0nO6VwU()) ? android.graphics.BlendMode.HARD_LIGHT : BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4115getSoftlight0nO6VwU()) ? android.graphics.BlendMode.SOFT_LIGHT : BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4098getDifference0nO6VwU()) ? android.graphics.BlendMode.DIFFERENCE : BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4104getExclusion0nO6VwU()) ? android.graphics.BlendMode.EXCLUSION : BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4110getMultiply0nO6VwU()) ? android.graphics.BlendMode.MULTIPLY : BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4106getHue0nO6VwU()) ? android.graphics.BlendMode.HUE : BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4113getSaturation0nO6VwU()) ? android.graphics.BlendMode.SATURATION : BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4094getColor0nO6VwU()) ? android.graphics.BlendMode.COLOR : BlendMode.m4089equalsimpl0(i2, BlendMode.Companion.m4108getLuminosity0nO6VwU()) ? android.graphics.BlendMode.LUMINOSITY : android.graphics.BlendMode.SRC_OVER;
    }

    public static final int toComposeBlendMode(android.graphics.BlendMode blendMode) {
        switch (WhenMappings.$EnumSwitchMapping$0[blendMode.ordinal()]) {
            case 1:
                return BlendMode.Companion.m4093getClear0nO6VwU();
            case 2:
                return BlendMode.Companion.m4116getSrc0nO6VwU();
            case 3:
                return BlendMode.Companion.m4099getDst0nO6VwU();
            case 4:
                return BlendMode.Companion.m4120getSrcOver0nO6VwU();
            case 5:
                return BlendMode.Companion.m4103getDstOver0nO6VwU();
            case 6:
                return BlendMode.Companion.m4118getSrcIn0nO6VwU();
            case 7:
                return BlendMode.Companion.m4101getDstIn0nO6VwU();
            case 8:
                return BlendMode.Companion.m4119getSrcOut0nO6VwU();
            case 9:
                return BlendMode.Companion.m4102getDstOut0nO6VwU();
            case 10:
                return BlendMode.Companion.m4117getSrcAtop0nO6VwU();
            case 11:
                return BlendMode.Companion.m4100getDstAtop0nO6VwU();
            case 12:
                return BlendMode.Companion.m4121getXor0nO6VwU();
            case 13:
                return BlendMode.Companion.m4112getPlus0nO6VwU();
            case 14:
                return BlendMode.Companion.m4109getModulate0nO6VwU();
            case 15:
                return BlendMode.Companion.m4114getScreen0nO6VwU();
            case 16:
                return BlendMode.Companion.m4111getOverlay0nO6VwU();
            case 17:
                return BlendMode.Companion.m4097getDarken0nO6VwU();
            case 18:
                return BlendMode.Companion.m4107getLighten0nO6VwU();
            case 19:
                return BlendMode.Companion.m4096getColorDodge0nO6VwU();
            case 20:
                return BlendMode.Companion.m4095getColorBurn0nO6VwU();
            case 21:
                return BlendMode.Companion.m4105getHardlight0nO6VwU();
            case 22:
                return BlendMode.Companion.m4115getSoftlight0nO6VwU();
            case 23:
                return BlendMode.Companion.m4098getDifference0nO6VwU();
            case 24:
                return BlendMode.Companion.m4104getExclusion0nO6VwU();
            case 25:
                return BlendMode.Companion.m4110getMultiply0nO6VwU();
            case 26:
                return BlendMode.Companion.m4106getHue0nO6VwU();
            case 27:
                return BlendMode.Companion.m4113getSaturation0nO6VwU();
            case 28:
                return BlendMode.Companion.m4094getColor0nO6VwU();
            case 29:
                return BlendMode.Companion.m4108getLuminosity0nO6VwU();
            default:
                return BlendMode.Companion.m4120getSrcOver0nO6VwU();
        }
    }
}
