package androidx.compose.ui.graphics;

import android.graphics.PorterDuffColorFilter;
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
/* JADX INFO: compiled from: AndroidColorFilter.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d̉=!4i\bDZc|İI\u0006F\u000b6B\u0005'4\u0012\u000e\u0007nj?4Le^.ZS0\u0010s{B-c$wCCU0}*\tUO\u007f\u0004|Ϻr\u000fq\u000en\u0016Wj\\Mcyu\u0012=4\tģѹ2ݹڱA;fwD\t8I0=\u0012\u0005/\u001cZP\u001e|\u0013Gy\u000bz0\u001fp\u0001ĥҫQ\u0005(\u0019\u001eb.\t6`\u0016M\u001fHK]j31\f\u0002B|1\u00104\u000bX%F\u00031SǸӦ\u001dѨË;7\u001b1a\u0010\u001fviM\u001bC <mh\u0006'[M\u0002fNX.\u001eE/]\u001durTmKĩՙ\u000bʬ˦SeQb\u001c;\u0010\u0001\n!T\u0004<\u001bmΞF3(| \u000ea\n9ԟXX\u0010uZ\u007f)`^\u0017S\u0018K3G4~Q\u0010SANez-\u0017$ŀ\u000f\tA[\u0003\r\u0011\u0015ISȰQ6YCC˒j8Xǆq\u001f"}, d2 = {"/bcBT3\u001c] \t\bF(\f\u00163x]2\u0003J\u000ew\u001bN~\u000eI", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006\u0006G\u000b$wKv\u001d<\u0004z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001eU\r$Hms8TMHL8%$hn\u000f", "1n[<e\u0014:b&\u0003\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DU\u0012=ZGNA", "/bcBT3\u001c] \t\bF(\f\u00163x]2\u0003J\u000ew\u001bN~\u000eI>*\u0018;E\nBk", "uZ5u?(GR&\t~]u~\u0016+p\u0003,yNJt!Ny\u001b\u001dz,DY\u000bu", "/bcBT3\u001c] \t\bF(\f\u00163x`5\u0006Ha\u001b\u001eVo\u001b", "4h[AX9", "uKP;W9HW\u0018H|k(\b\f3c\u000eqYJ\b!$(s\u0015Kv2\u000b\u001ds\u0001", "/bcBT3%W\u001b\u0002\nb5~f9l\n5\\D\b&\u0017T", ";t[A\\7Eg", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "/cS", "/bcBT3%W\u001b\u0002\nb5~f9l\n5\\D\b&\u0017T7U&h*\u001c^a", "uI9u?(GR&\t~]u~\u0016+p\u0003,yNJt!Ny\u001b\u001dz,DY\u000bu", "/bcBT3-W\"\u000eXh3\u0007\u0016\u0010i\u00077{M", "1n[<e", "0kT;W\u0014HR\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`})6U -M\u0019", "/bcBT3-W\"\u000eXh3\u0007\u0016\u0010i\u00077{MH*v6x\u001b;\u0005", "uI8u?(GR&\t~]u~\u0016+p\u0003,yNJt!Ny\u001b\u001dz,DY\u000bu", "At_=b9Mav\t\u0002h9d\u0005>r\u0004;gP\u0001$+", "", "At_=b9Ma\u007f\u0003|a;\u0001\u00121C\n/\u0006Ma\u001b\u001eVo\u001b(\u0007%Bm", "/r0;W9HW\u0018\\\u0005e6\ni3l\u000f(\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DN\u001a5\\CHA", "/r2<`7Ha\u0019\\\u0005e6\ni3l\u000f(\t", "\u001c`c6i,\u001c] \t\b?0\u0004\u0018/r", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidColorFilter_androidKt {
    public static final boolean supportsColorMatrixQuery() {
        return true;
    }

    public static final boolean supportsLightingColorFilterQuery() {
        return true;
    }

    public static final android.graphics.ColorFilter asAndroidColorFilter(ColorFilter colorFilter) {
        return colorFilter.getNativeColorFilter$ui_graphics_release();
    }

    public static final ColorFilter asComposeColorFilter(android.graphics.ColorFilter colorFilter) {
        if (29 <= Build.VERSION.SDK_INT && (colorFilter instanceof android.graphics.BlendModeColorFilter)) {
            return BlendModeColorFilterHelper.INSTANCE.createBlendModeColorFilter((android.graphics.BlendModeColorFilter) colorFilter);
        }
        if ((colorFilter instanceof android.graphics.LightingColorFilter) && supportsLightingColorFilterQuery()) {
            android.graphics.LightingColorFilter lightingColorFilter = (android.graphics.LightingColorFilter) colorFilter;
            return new LightingColorFilter(ColorKt.Color(lightingColorFilter.getColorMultiply()), ColorKt.Color(lightingColorFilter.getColorAdd()), colorFilter, null);
        }
        if ((colorFilter instanceof android.graphics.ColorMatrixColorFilter) && supportsColorMatrixQuery()) {
            return new ColorMatrixColorFilter(null, colorFilter, 0 == true ? 1 : 0);
        }
        return new ColorFilter(colorFilter);
    }

    /* JADX INFO: renamed from: actualTintColorFilter-xETnrds, reason: not valid java name */
    public static final android.graphics.ColorFilter m4044actualTintColorFilterxETnrds(long j2, int i2) {
        return Build.VERSION.SDK_INT >= 29 ? BlendModeColorFilterHelper.INSTANCE.m4124BlendModeColorFilterxETnrds(j2, i2) : new PorterDuffColorFilter(ColorKt.m4232toArgb8_81llA(j2), AndroidBlendMode_androidKt.m4030toPorterDuffModes9anfk8(i2));
    }

    /* JADX INFO: renamed from: actualColorMatrixColorFilter-jHG-Opc, reason: not valid java name */
    public static final android.graphics.ColorFilter m4042actualColorMatrixColorFilterjHGOpc(float[] fArr) {
        return new android.graphics.ColorMatrixColorFilter(fArr);
    }

    /* JADX INFO: renamed from: actualLightingColorFilter--OWjLjI, reason: not valid java name */
    public static final android.graphics.ColorFilter m4043actualLightingColorFilterOWjLjI(long j2, long j3) {
        return new android.graphics.LightingColorFilter(ColorKt.m4232toArgb8_81llA(j2), ColorKt.m4232toArgb8_81llA(j3));
    }

    public static final float[] actualColorMatrixFromFilter(android.graphics.ColorFilter colorFilter) {
        if ((colorFilter instanceof android.graphics.ColorMatrixColorFilter) && supportsColorMatrixQuery()) {
            return ColorMatrixFilterHelper.INSTANCE.m4258getColorMatrix8unuwjk((android.graphics.ColorMatrixColorFilter) colorFilter);
        }
        throw new IllegalArgumentException("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
    }
}
