package kotlinx.serialization;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.reflect.KType;
import kotlinx.serialization.internal.InternalHexConverter;
import kotlinx.serialization.modules.SerializersModule;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<;!&i\u0016DLш|\u0004O\u00168\u000b4C\u0007\":\u001e\u007f\u0007ljA0ZeP.XS2\u000f\u0002{<$a*yCQU\"}(\u000bgnu˧\u0007J!\nc\u0013\fǝ\u0007iBH}x\f\u0012?6PpW3{q\u0004ʧfҽ:\u0005.5:X\b\t\u0019\u001apG0z\u0001ŏY\u000b(/hphR=Q\u0013\u001f*\u0006l&GȭbʄR6Vsuc='\u001bi\tMGa6ŧ[\fnTU\r'k,3X=E\u00175SI\u0006\u0001do\u0007MvU\u0005\u0017-ݳ/I\u0002aNx\u000e\u001f-+\u0016\f}v,ؘ\u0013Pv\u000bO+}o{T\u001c5\u0010z*\u0013\u0003ǐ\u0014Ν+H<;2\u0007\u0016\u001dKt!U`T\bމP~\u0011`^\u0017S\u007fc/G+~Q(:_ג=߉\t\r,4\u0019\u000f/ml\u000e\u000f\u001b;X}\u0383?PV<pN8Ymq\u0012\u0001z\u0002p\u0003vϡ\u0006\u009e\u007f\u0011<*=`iK;!\u001a\bhFmϸ\u0013_\u0011S\u0018RxJ0\u0003.=:\u000b\u001cZ\u000bc3\u0001\u0001Xf<)MbSΘ\u0002\b!6t\u0018J8=\u0010|U\tmpܔk\t;.\u000f7\bz\u001c\u0012eIv3{P*ߋg؏z\u0014MTО\tq"}, d2 = {"2dR<W,\u001f`#\u0007Wr;|d<r{<", "\"", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`sKx\nI\u000b\u0006?f\u0006\u001cFC", "0xc2f", "", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `$s\u00178\u00049\u0016c\u000b(3|k$*\u0007\"p0/\u00112h5\u0010eu8s,GJ]\u0002", "2dR<W,\u001f`#\u0007]^?j\u0018<i\t*", "6dg", "", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `$s\u00178\u00049\u0016c\u000b(3|k\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d\u001051Xcn\u0007\u001b\u000ec\u0010\u0018\u0015\n\nY?3D", "2db2e0:Z\u001d\u0014zk", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`uG}\u000eIz!<]\u0013\u001cFq 7;RHgC\u001e\u0017|7", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `$s\u00178\u00049\u0016c\u000b(3|k\u0015SMJr8'(2o9\u0014g(Uz<C[R6e\u001cQ=\"\u0012g\u0012J2\u0011\u001aUP(xM%.\u0015(X\u0002=|Vr\u001b\nFf:IR\u0019IC\u0003\u0005N-qH/#`L=V^sk\bh\u001f&$7)\u0014o(p", "2dR<W,\u001f`#\u0007hm9\u0001\u00121", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0005V|\u0012Ex\u0006?f\u0006\u001cFC", "Asa6a.", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `5~\u001b@\u007f'\u0016c\u000b(3|k\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d\u001051Xcn\u0007\u001b\u000ec\u0010\u0018\u0015\n\nY?3D", "3mR<W,-]u\u0013\n^\b\n\u0016+y", "D`[BX", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `$s\u00178\u00049\u0016c\u000b(3|k\u0015R?Lg}%\u0011qc\u0003p`1Nt6\u001d\u0010D\t", "3mR<W,-]{~\u000eL;\n\r8g", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `$s\u00178\u00049\u0016c\u000b(3|k\u0015R?Lg}%\u0011qc\u0003p`1Nt6\u001d\u001051Xcn\u0007\u001b\u000ec\u0010\u0018\u0019\u001c\u0012]J&D", "Ada6T3Bh\u0019\f", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0005G|\u00128})JU\r$Av\u0004=Z?Jk62j", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `$s\u00178\u00049\u0016c\u000b(3|k\u0015SMJr8'(2o9\u0014g(Uz<C[R6e\u001c`=!\u0016V\u0015R@\t\u0014]K-\\SD\u001b\u0017,K\u0016\u0011O\u0006\b'\n~qlKXY1v\u001au?8>\n@duX=\u000fi&m\u000e)\u000bkG>-\u0016G", "3mR<W,-]\u0007\u000e\bb5~", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `5~\u001b@\u007f'\u0016c\u000b(3|k\u0015R?Lg}%\u0011qc\u0003p`1Nt6\u001d\u001051Xcn\u0007\u001b\u000ec\u0010\u0018\u0019\u001c\u0012]J&D", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SerialFormatKt {
    public static final /* synthetic */ <T> T decodeFromByteArray(BinaryFormat binaryFormat, byte[] bytes) {
        Intrinsics.checkNotNullParameter(binaryFormat, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        SerializersModule serializersModule = binaryFormat.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) binaryFormat.decodeFromByteArray(SerializersKt.serializer(serializersModule, (KType) null), bytes);
    }

    public static final /* synthetic */ <T> T decodeFromHexString(BinaryFormat binaryFormat, String hex) {
        Intrinsics.checkNotNullParameter(binaryFormat, "<this>");
        Intrinsics.checkNotNullParameter(hex, "hex");
        SerializersModule serializersModule = binaryFormat.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) decodeFromHexString(binaryFormat, SerializersKt.serializer(serializersModule, (KType) null), hex);
    }

    public static final <T> T decodeFromHexString(BinaryFormat binaryFormat, DeserializationStrategy<? extends T> deserializer, String hex) {
        Intrinsics.checkNotNullParameter(binaryFormat, "<this>");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(hex, "hex");
        return (T) binaryFormat.decodeFromByteArray(deserializer, InternalHexConverter.INSTANCE.parseHexBinary(hex));
    }

    public static final /* synthetic */ <T> T decodeFromString(StringFormat stringFormat, String string) {
        Intrinsics.checkNotNullParameter(stringFormat, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        SerializersModule serializersModule = stringFormat.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) stringFormat.decodeFromString(SerializersKt.serializer(serializersModule, (KType) null), string);
    }

    public static final /* synthetic */ <T> byte[] encodeToByteArray(BinaryFormat binaryFormat, T t2) {
        Intrinsics.checkNotNullParameter(binaryFormat, "<this>");
        SerializersModule serializersModule = binaryFormat.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return binaryFormat.encodeToByteArray(SerializersKt.serializer(serializersModule, (KType) null), t2);
    }

    public static final /* synthetic */ <T> String encodeToHexString(BinaryFormat binaryFormat, T t2) {
        Intrinsics.checkNotNullParameter(binaryFormat, "<this>");
        SerializersModule serializersModule = binaryFormat.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return encodeToHexString(binaryFormat, SerializersKt.serializer(serializersModule, (KType) null), t2);
    }

    public static final <T> String encodeToHexString(BinaryFormat binaryFormat, SerializationStrategy<? super T> serializer, T t2) {
        Intrinsics.checkNotNullParameter(binaryFormat, "<this>");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        return InternalHexConverter.INSTANCE.printHexBinary(binaryFormat.encodeToByteArray(serializer, t2), true);
    }

    public static final /* synthetic */ <T> String encodeToString(StringFormat stringFormat, T t2) {
        Intrinsics.checkNotNullParameter(stringFormat, "<this>");
        SerializersModule serializersModule = stringFormat.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return stringFormat.encodeToString(SerializersKt.serializer(serializersModule, (KType) null), t2);
    }
}
