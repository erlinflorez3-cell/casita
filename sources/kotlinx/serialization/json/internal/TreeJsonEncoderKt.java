package kotlinx.serialization.json.internal;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d̉=!,u\bӵLc\u0003\rI\u0006F\u000b6B\u0005$4\u0012\u000e\u0007nj?2Le^.Zݷ2\u000f\u0002{<$a$\nkIZ2}h\u000foVm˧|Pp\nk\u000f4\u001d)n:Qmx\f\u0019?6PxW3{q\u0004ʡfҽ:\u0005.<:c\b\u0010\u0019\u001aXO0x\u0001ŏY\u0012:0n|jV\u001bU\u001d\u001aX\fn*\u000f+tm^8Xl$@]1InŌR'm?\u001dY\u001bϿl';u8ӝ}Ë;5\u001dǬs\u0019\u0015Rs?1@\u001a=3j]g\u0002ɡuɱ:\\\u0018\u0016\u001b.]\u0011Ǉv6"}, d2 = {"\u001eQ8\u001a<\u001b\"Dxxi:\u000e", "", "@d`B\\9>a\b\t\u0006E,\u000e\t6T{*", "", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0016G}\fIz0Dc\u000b.\u0001[\u0016;Q?BJ4,\u0013ueD\u0016m9$", "5dc\u001fX8NW&~\tM6\bo/v\u007f/j<\u0003", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Fo\u001c:\u0004)@h\b-E7\u0004.ZG7r\u0013\u001e#fn=\u0012r6[Lj<", "1`bA", "\"", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?b]'7u\u00167\\\u0019", "D`[BX", "2db0e0Ib#\f", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `L}\u0018E@\nCc\u0007\u007f>m\u001e.VR\u0011R:($oeB\u001a-:N\u0004+CSRAXavG\u001d[Y\u000e\\)\u001a\tdP.{R\u0001\r\b9M}BG\u0001\u001a\u0014\u001b9u\u007fLce\u000b`\u001b\u007fP0lOl)\bGNI^1h![,`DCm\u0019\u007f#$25<\u0014\u00053\u0018rZypv\u001d", "EqXAX\u0011L]\"", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?bS", "Ada6T3Bh\u0019\f", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0005G|\u00128})JU\r$Av\u0004=Z?Jk62j", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `L}\u0018E@\nCc\u0007u\u001er\u0012?I\rBg= ^R^>\u0007a;$]-Q[U0ee<K\u0014\u001f^\nU/\"\u0001hE.w\u000e%\u001f\u00150E\t?}|\u001b\u001a\u0018>X\u007fOR\u001fG{)K\u0005\u0010nPhf}PT\u000fp*q\u0010[$`O63\u0018{\"dm^8\u0013E8\u001f|[YngO\u0019\u0004Gy", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u001c%Qx"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TreeJsonEncoderKt {
    public static final String PRIMITIVE_TAG = "primitive";

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T extends JsonElement> T cast(JsonElement value, SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
        if (value instanceof JsonElement) {
            return value;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        throw JsonExceptionsKt.JsonDecodingException(-1, sb.append(Reflection.getOrCreateKotlinClass(JsonElement.class)).append(" as the serialized body of ").append(descriptor.getSerialName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(value.getClass())).toString());
    }

    public static final boolean getRequiresTopLevelTag(SerialDescriptor serialDescriptor) {
        return (serialDescriptor.getKind() instanceof PrimitiveKind) || serialDescriptor.getKind() == SerialKind.ENUM.INSTANCE;
    }

    @InternalSerializationApi
    public static final <T> JsonElement writeJson(Json json, T t2, SerializationStrategy<? super T> serializer) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        new JsonTreeEncoder(json, new Function1<JsonElement, Unit>() { // from class: kotlinx.serialization.json.internal.TreeJsonEncoderKt$writeJson$encoder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(JsonElement jsonElement) {
                invoke2(jsonElement);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(JsonElement it) {
                Intrinsics.checkNotNullParameter(it, "it");
                objectRef.element = it;
            }
        }).encodeSerializableValue(serializer, t2);
        if (objectRef.element != null) {
            return (JsonElement) objectRef.element;
        }
        Intrinsics.throwUninitializedPropertyAccessException("result");
        return null;
    }
}
