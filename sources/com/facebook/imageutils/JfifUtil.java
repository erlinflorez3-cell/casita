package com.facebook.imageutils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005.4\u0012\u000e\u0007nʑA0RuP\u008cZS8\u0018s{:'aӜqYП\u0006\u001a,!ITTg̊rJh\u000b\f\u001d\u0014#\u0011jZK\u0006|k '2pq\u00068\u0016}KHxtd\u0007P60H\u0012\u0005/+pMX\u0007\tRc\f@2pvHd%O\u001b\u0019@\u0019\u0005%I,j{f6v\u0002\u000e>=9\u001bipPm_x\u000b[$^TU\u000f'e,;X7c&kSK\u001d`sW\u0003m\u0007m\tv7?+w\u0005\b:f\u0019,\u0015YQSbC2j\u0006i`:)\u0002ՙ6ׂT\u000e0»K\b\u001b?\u001c\u000e4)\u001f͚\u007fբj\b\u0016ޗE~aDh\u0002\rDVд4ي\u001b%\bđ{E)kiai\u001b%ѠN˿\u0011\u001e+Ч?-iZ&`C\u001d+ȴ$śU@Eʰ\u001f\u0016gD\u0006\u0004\u001fdXÖVΥK\u007f7Ʌa:%-O[g%wȄTҩHg~ݓ1tarjHn$Eݲ\nҊ\r\fbե5\u0011yZlXZ\u0013$Ƀ'Θ\u0002\b\u001b\u05fe-\u0004J,=\u0010|Q?Ȑ=ܷa\n-Ä7Cgz\u0004\u000e\u0006;5گ\bɄg\u0010i\u05ecρ\u0018Y"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\fO\u0005\u001e%\u0011T\u000f@w\u0015D]\u0005u", "", "u(E", "\u000fO?}R\f17yxb:\u000e`f", "", "\u001b@A\u00188\u00198/\u0004iF", "\u001b@A\u00188\u001983\u0003b", "\u001b@A\u00188\u001983\u0007\\VI\fve#T_", "\u001b@A\u00188\u001984|khM&Y|\u001eE", "\u001b@A\u00188\u00198@\u0007mE", "\u001b@A\u00188\u00198@\u0007mL", "\u001b@A\u00188\u00198A\u0003_\u0004", "\u001b@A\u00188\u00198A\u0003b", "\u001b@A\u00188\u00198A\u0003l", "\u001b@A\u00188\u00198Bxf", "5dc\u000eh;H@#\u000evm,X\u00121l\u007f\t\tJ\t\u0001$Ko\u0017Kr49c\u0007", "=qX2a;:b\u001d\t\u0004", "5dc\u001ce0>\\(z\nb6\u0006", "7m_Bg\u001aM`\u0019z\u0003", "\u001aiPCTuB]bb\u0004i<\fv>r\u007f$\u0004\u0016", "8oT4", "", "7rB\u001c95", "", ";`a8X9", ";ne2G6\u001a>\u0004JZQ\u0010]", ";ne2G6&O&\u0005zk", ";`a8X9-]y\u0003\u0004]", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class JfifUtil {
    public static final int APP1_EXIF_MAGIC = 1165519206;
    public static final JfifUtil INSTANCE = new JfifUtil();
    public static final int MARKER_APP1 = 225;
    public static final int MARKER_EOI = 217;
    public static final int MARKER_ESCAPE_BYTE = 0;
    public static final int MARKER_FIRST_BYTE = 255;
    public static final int MARKER_RST0 = 208;
    public static final int MARKER_RST7 = 215;
    public static final int MARKER_SOFn = 192;
    public static final int MARKER_SOI = 216;
    public static final int MARKER_SOS = 218;
    public static final int MARKER_TEM = 1;

    private JfifUtil() {
    }

    @JvmStatic
    public static final int getAutoRotateAngleFromOrientation(int i2) {
        return TiffUtil.getAutoRotateAngleFromOrientation(i2);
    }

    @JvmStatic
    public static final int getOrientation(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        try {
            int iMoveToAPP1EXIF = INSTANCE.moveToAPP1EXIF(inputStream);
            if (iMoveToAPP1EXIF == 0) {
                return 0;
            }
            return TiffUtil.readOrientationFromTIFF(inputStream, iMoveToAPP1EXIF);
        } catch (IOException unused) {
            return 0;
        }
    }

    @JvmStatic
    public static final int getOrientation(byte[] bArr) {
        return getOrientation(new ByteArrayInputStream(bArr));
    }

    private final boolean isSOFn(int i2) {
        switch (i2) {
            case 192:
            case 193:
            case 194:
            case 195:
            case 197:
            case 198:
            case 199:
            case 201:
            case 202:
            case 203:
            case 205:
            case 206:
            case 207:
                return true;
            case 196:
            case 200:
            case 204:
            default:
                return false;
        }
    }

    private final int moveToAPP1EXIF(InputStream inputStream) throws IOException {
        if (moveToMarker(inputStream, MARKER_APP1)) {
            int packedInt = StreamProcessor.readPackedInt(inputStream, 2, false);
            if (packedInt - 2 > 6) {
                int packedInt2 = StreamProcessor.readPackedInt(inputStream, 4, false);
                int packedInt3 = StreamProcessor.readPackedInt(inputStream, 2, false);
                int i2 = packedInt - 8;
                if (packedInt2 == 1165519206 && packedInt3 == 0) {
                    return i2;
                }
            }
        }
        return 0;
    }

    @JvmStatic
    public static final boolean moveToMarker(InputStream inputStream, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        while (StreamProcessor.readPackedInt(inputStream, 1, false) == 255) {
            int packedInt = 255;
            while (packedInt == 255) {
                packedInt = StreamProcessor.readPackedInt(inputStream, 1, false);
            }
            if ((i2 == 192 && INSTANCE.isSOFn(packedInt)) || packedInt == i2) {
                return true;
            }
            if (packedInt != 1 && packedInt != 216) {
                if (packedInt == 217 || packedInt == 218) {
                    break;
                }
                inputStream.skip(StreamProcessor.readPackedInt(inputStream, 2, false) - 2);
            }
        }
        return false;
    }
}
