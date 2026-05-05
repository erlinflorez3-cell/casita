package com.incode.welcome_sdk.data.remote.beans;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class FaceAuthenticationRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f9082a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9083c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9084d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f9085e = 0;
    private final String base64Image;
    private final Map<String, Float> faceCoordinates;
    private final String hint;
    private final String metadata;
    private final String recordingId;
    public static final a Companion = new a(0);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new LinkedHashMapSerializer(StringSerializer.INSTANCE, FloatSerializer.INSTANCE), null, null};

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f9086b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f9087e = 1;

        private a() {
        }

        public final KSerializer<FaceAuthenticationRequest> serializer() {
            int i2 = 2 % 2;
            int i3 = f9087e + 101;
            f9086b = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                d dVar = d.f9091d;
                obj.hashCode();
                throw null;
            }
            d dVar2 = d.f9091d;
            int i4 = f9086b + 55;
            f9087e = i4 % 128;
            if (i4 % 2 != 0) {
                return dVar2;
            }
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final class d implements GeneratedSerializer<FaceAuthenticationRequest> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f9088a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ PluginGeneratedSerialDescriptor f9089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f9090c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f9091d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f9092e = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f9093g = 1;

        static {
            d dVar = new d();
            f9091d = dVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.incode.welcome_sdk.data.remote.beans.FaceAuthenticationRequest", dVar, 5);
            pluginGeneratedSerialDescriptor.addElement("metadata", false);
            pluginGeneratedSerialDescriptor.addElement("base64Image", false);
            pluginGeneratedSerialDescriptor.addElement("faceCoordinates", false);
            pluginGeneratedSerialDescriptor.addElement("hint", false);
            pluginGeneratedSerialDescriptor.addElement("recordingId", false);
            f9089b = pluginGeneratedSerialDescriptor;
            int i2 = f9093g + 47;
            f9088a = i2 % 128;
            int i3 = i2 % 2;
        }

        private d() {
        }

        private FaceAuthenticationRequest b(Decoder decoder) {
            String strDecodeStringElement;
            Map map;
            String str;
            String str2;
            String str3;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(decoder, "");
            SerialDescriptor descriptor = getDescriptor();
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
            KSerializer[] kSerializerArrAccess$get$childSerializers$cp = FaceAuthenticationRequest.access$get$childSerializers$cp();
            int i3 = 0;
            String str4 = null;
            if (!(!compositeDecoderBeginStructure.decodeSequentially())) {
                int i4 = f9090c + 13;
                f9092e = i4 % 128;
                int i5 = i4 % 2;
                str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, StringSerializer.INSTANCE, null);
                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 1);
                map = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, kSerializerArrAccess$get$childSerializers$cp[2], null);
                str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, StringSerializer.INSTANCE, null);
                str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, StringSerializer.INSTANCE, null);
                i3 = 31;
            } else {
                boolean z2 = true;
                strDecodeStringElement = null;
                map = null;
                str = null;
                str2 = null;
                while (!(!z2)) {
                    int i6 = f9092e + 69;
                    f9090c = i6 % 128;
                    int i7 = i6 % 2;
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                    if (iDecodeElementIndex == -1) {
                        z2 = false;
                    } else if (iDecodeElementIndex == 0) {
                        str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, StringSerializer.INSTANCE, str4);
                        i3 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 1);
                        i3 |= 2;
                    } else if (iDecodeElementIndex == 2) {
                        map = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, kSerializerArrAccess$get$childSerializers$cp[2], map);
                        i3 |= 4;
                    } else if (iDecodeElementIndex == 3) {
                        str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, StringSerializer.INSTANCE, str);
                        i3 |= 8;
                    } else {
                        if (iDecodeElementIndex != 4) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, StringSerializer.INSTANCE, str2);
                        i3 |= 16;
                    }
                }
                str3 = str4;
            }
            compositeDecoderBeginStructure.endStructure(descriptor);
            return new FaceAuthenticationRequest(i3, str3, strDecodeStringElement, map, str, str2, null);
        }

        private void c(Encoder encoder, FaceAuthenticationRequest faceAuthenticationRequest) {
            int i2 = 2 % 2;
            int i3 = f9092e + 103;
            f9090c = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(faceAuthenticationRequest, "");
            SerialDescriptor descriptor = getDescriptor();
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
            FaceAuthenticationRequest.write$Self$onboard_release(faceAuthenticationRequest, compositeEncoderBeginStructure, descriptor);
            compositeEncoderBeginStructure.endStructure(descriptor);
            int i5 = f9090c + 97;
            f9092e = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            int i2 = 2 % 2;
            int i3 = f9092e + 39;
            f9090c = i3 % 128;
            int i4 = i3 % 2;
            KSerializer<?>[] kSerializerArr = {BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(FaceAuthenticationRequest.access$get$childSerializers$cp()[2]), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)};
            int i5 = f9092e + 37;
            f9090c = i5 % 128;
            int i6 = i5 % 2;
            return kSerializerArr;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public final /* synthetic */ Object deserialize(Decoder decoder) {
            int i2 = 2 % 2;
            int i3 = f9092e + 109;
            f9090c = i3 % 128;
            int i4 = i3 % 2;
            FaceAuthenticationRequest faceAuthenticationRequestB = b(decoder);
            int i5 = f9090c + 105;
            f9092e = i5 % 128;
            if (i5 % 2 != 0) {
                return faceAuthenticationRequestB;
            }
            throw null;
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            int i2 = 2 % 2;
            int i3 = f9090c;
            int i4 = i3 + 61;
            f9092e = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f9089b;
                obj.hashCode();
                throw null;
            }
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor2 = f9089b;
            int i5 = i3 + 125;
            f9092e = i5 % 128;
            if (i5 % 2 != 0) {
                return pluginGeneratedSerialDescriptor2;
            }
            throw null;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final /* synthetic */ void serialize(Encoder encoder, Object obj) {
            int i2 = 2 % 2;
            int i3 = f9090c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f9092e = i3 % 128;
            int i4 = i3 % 2;
            c(encoder, (FaceAuthenticationRequest) obj);
            int i5 = f9090c + 13;
            f9092e = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] typeParametersSerializers() {
            KSerializer<?>[] kSerializerArrTypeParametersSerializers;
            int i2 = 2 % 2;
            int i3 = f9092e + 47;
            f9090c = i3 % 128;
            if (i3 % 2 != 0) {
                kSerializerArrTypeParametersSerializers = GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
                int i4 = 3 / 0;
            } else {
                kSerializerArrTypeParametersSerializers = GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
            int i5 = f9092e + 77;
            f9090c = i5 % 128;
            int i6 = i5 % 2;
            return kSerializerArrTypeParametersSerializers;
        }
    }

    static {
        int i2 = f9082a + 47;
        f9085e = i2 % 128;
        int i3 = i2 % 2;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ FaceAuthenticationRequest(int i2, String str, String str2, Map map, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i2 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 31, d.f9091d.getDescriptor());
        }
        this.metadata = str;
        this.base64Image = str2;
        this.faceCoordinates = map;
        this.hint = str3;
        this.recordingId = str4;
    }

    public FaceAuthenticationRequest(String str, String str2, Map<String, Float> map, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.metadata = str;
        this.base64Image = str2;
        this.faceCoordinates = map;
        this.hint = str3;
        this.recordingId = str4;
    }

    public static final /* synthetic */ KSerializer[] access$get$childSerializers$cp() {
        int i2 = 2 % 2;
        int i3 = f9083c;
        int i4 = i3 + 9;
        f9084d = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        int i5 = i3 + 31;
        f9084d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 14 / 0;
        }
        return kSerializerArr;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$onboard_release(FaceAuthenticationRequest faceAuthenticationRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        int i2 = 2 % 2;
        int i3 = f9083c + 111;
        f9084d = i3 % 128;
        int i4 = i3 % 2;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, faceAuthenticationRequest.metadata);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, faceAuthenticationRequest.base64Image);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], faceAuthenticationRequest.faceCoordinates);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, faceAuthenticationRequest.hint);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, faceAuthenticationRequest.recordingId);
        int i5 = f9084d + 55;
        f9083c = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getMetadata() {
        int i2 = 2 % 2;
        int i3 = f9083c + 35;
        int i4 = i3 % 128;
        f9084d = i4;
        int i5 = i3 % 2;
        String str = this.metadata;
        int i6 = i4 + 51;
        f9083c = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getBase64Image() {
        int i2 = 2 % 2;
        int i3 = f9083c + 55;
        int i4 = i3 % 128;
        f9084d = i4;
        int i5 = i3 % 2;
        String str = this.base64Image;
        int i6 = i4 + 125;
        f9083c = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final Map<String, Float> getFaceCoordinates() {
        int i2 = 2 % 2;
        int i3 = f9083c;
        int i4 = i3 + 79;
        f9084d = i4 % 128;
        int i5 = i4 % 2;
        Map<String, Float> map = this.faceCoordinates;
        int i6 = i3 + 59;
        f9084d = i6 % 128;
        if (i6 % 2 == 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getHint() {
        int i2 = 2 % 2;
        int i3 = f9084d;
        int i4 = i3 + 71;
        f9083c = i4 % 128;
        int i5 = i4 % 2;
        String str = this.hint;
        int i6 = i3 + 67;
        f9083c = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String getRecordingId() {
        int i2 = 2 % 2;
        int i3 = f9083c + 57;
        int i4 = i3 % 128;
        f9084d = i4;
        int i5 = i3 % 2;
        String str = this.recordingId;
        int i6 = i4 + 97;
        f9083c = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }
}
