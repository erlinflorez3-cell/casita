package kotlinx.serialization.json.internal;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.reflect.KType;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.DecodeSequenceMode;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonEncoder;
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
@Metadata(bv = {}, d1 = {"Я:\u001d<;!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0L͜P.hS2şs{B$cҕyCQU\"Ԃ*\teNogtKr6QƤ\u001e\u0016?iLK[ތk\u001172poo=[pU?pvF\u0005f1P:*\t\u000f\u001dBH>zABƚ\u0010\u0012>E\tp`\u0013e\u000b*\u0014\u0016>f\u007fLc\bP<ԟz\\b/Q\u0003\u001aF\\*w0+Q=Pb(%|q ;@}4C'\u0004\t\rRiG\u001b? FKg?R9O\f]FZ\u0010\u0014[*}\u0014}v,ؘ\u0013Pv\u000bO+}c{T\u001c+\u0010z*\u0011l\n\u0014\u00065PF-HoNԆ9\r&aJh\u0002\rM |gا%$(3Y9Kj_mS\u0019|D,\u000f\u001b,;\u0007~#kTT_C*\u0005{_Ai@\u0004G\u0015\tՒAm\u0012\u0002Đ\u0006<"}, d2 = {"2dR<W,\u001bg\u0006~v],\n", "\"", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?bS", "2db2e0:Z\u001d\u0014zk", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`uG}\u000eIz!<]\u0013\u001cFq 7;RHgC\u001e\u0017|7", "@dP1X9", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\u001cMP?g;\u000b\u0015d`9\u00149", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `L}\u0018E@\nCc\u0007u\u001es =TGD~},\u0015ue5\u000egAJ\u0006+QU\u0018\u000b\\`rJ\u0018\u000ea\u0012c'\u001c\tcJ\u0012}Q3.\b.]W\"n\u000b\u001b\u001d\u0012>}:PV\u001dKu\u001cyV%wJchCLOOksh\u0015n\u001diC6+]_\u0019(lL5v{O\u0010r_O+NL\u0015\f4mEidH\u000fYRAt%.!", "2dR<W,-]\u0007~\u0007n,\u0006\u0007/B\u0014\u0015{<\u007f\u0017$", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", "4na:T;", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006U%3c| %m\">ML9k\u001c(\u0014h7", "3mR<W,\u001bg\u000b\f~m,\n", "", "EqXAX9", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\u0013[MD]A\"$hn\u000f", "Ada6T3Bh\u0019\f", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0005G|\u00128})JU\r$Av\u0004=Z?Jk62j", "D`[BX", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `L}\u0018E@\nCc\u0007u\u001es =TGD~},\u0015ue5\u000egAJ\u0006+QU\u00181j\\{\u0007\u0018\u001bi\u000e[4\t\f#&2xM),\f;I\u000f\u0011O\u0007\u0016%\u00159s\u0004\fd\u0010T}\u0011|E>dU]i\u0003\u0011/Eo.`\u0013c2XI>.\u001d_((d_.\f\u0010)wwN\u000bc1N\u0015\u0004:m(j`FC~+\u007fe", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u001c%Qx"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class JsonStreamsKt {
    public static final <T> T decodeByReader(Json json, DeserializationStrategy<? extends T> deserializer, SerialReader reader) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(reader, "reader");
        ReaderJsonLexer readerJsonLexer = new ReaderJsonLexer(reader, null, 2, null);
        try {
            T t2 = (T) new StreamingJsonDecoder(json, WriteMode.OBJ, readerJsonLexer, deserializer.getDescriptor(), null).decodeSerializableValue(deserializer);
            readerJsonLexer.expectEof();
            return t2;
        } finally {
            readerJsonLexer.release();
        }
    }

    @ExperimentalSerializationApi
    public static final <T> Sequence<T> decodeToSequenceByReader(Json json, SerialReader reader, DeserializationStrategy<? extends T> deserializer, DecodeSequenceMode format) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(format, "format");
        final Iterator itJsonIterator = JsonIteratorKt.JsonIterator(format, json, new ReaderJsonLexer(reader, new char[16384]), deserializer);
        return SequencesKt.constrainOnce(new Sequence<T>() { // from class: kotlinx.serialization.json.internal.JsonStreamsKt$decodeToSequenceByReader$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                return itJsonIterator;
            }
        });
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <T> Sequence<T> decodeToSequenceByReader(Json json, SerialReader reader, DecodeSequenceMode format) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(format, "format");
        SerializersModule serializersModule = json.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return decodeToSequenceByReader(json, reader, SerializersKt.serializer(serializersModule, (KType) null), format);
    }

    public static /* synthetic */ Sequence decodeToSequenceByReader$default(Json json, SerialReader serialReader, DeserializationStrategy deserializationStrategy, DecodeSequenceMode decodeSequenceMode, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            decodeSequenceMode = DecodeSequenceMode.AUTO_DETECT;
        }
        return decodeToSequenceByReader(json, serialReader, deserializationStrategy, decodeSequenceMode);
    }

    public static /* synthetic */ Sequence decodeToSequenceByReader$default(Json json, SerialReader reader, DecodeSequenceMode format, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            format = DecodeSequenceMode.AUTO_DETECT;
        }
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(format, "format");
        SerializersModule serializersModule = json.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return decodeToSequenceByReader(json, reader, SerializersKt.serializer(serializersModule, (KType) null), format);
    }

    public static final <T> void encodeByWriter(Json json, JsonWriter writer, SerializationStrategy<? super T> serializer, T t2) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        new StreamingJsonEncoder(writer, json, WriteMode.OBJ, new JsonEncoder[WriteMode.values().length]).encodeSerializableValue(serializer, t2);
    }
}
