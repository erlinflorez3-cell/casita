package com.incode.welcome_sdk.commons.exceptions;

import com.incode.welcome_sdk.data.remote.beans.FaceAuthenticationErrorCode;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class FaceAuthenticationException extends Exception {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a */
    private static int f5014a = 0;

    /* JADX INFO: renamed from: b */
    private static int f5015b = 1;

    /* JADX INFO: renamed from: d */
    private static int f5016d = 0;

    /* JADX INFO: renamed from: e */
    private static int f5017e = 1;
    private final FaceAuthenticationErrorCode code;
    private final String message;
    public static final b Companion = new b((byte) 0);
    private static final KSerializer<Object>[] $childSerializers = {EnumsKt.createSimpleEnumSerializer("com.incode.welcome_sdk.data.remote.beans.FaceAuthenticationErrorCode", FaceAuthenticationErrorCode.values()), null};

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final class a implements GeneratedSerializer<FaceAuthenticationException> {

        /* JADX INFO: renamed from: a */
        private static int f5018a = 1;

        /* JADX INFO: renamed from: b */
        private static int f5019b = 0;

        /* JADX INFO: renamed from: c */
        private static int f5020c = 0;

        /* JADX INFO: renamed from: d */
        public static final a f5021d;

        /* JADX INFO: renamed from: e */
        private static final /* synthetic */ PluginGeneratedSerialDescriptor f5022e;

        /* JADX INFO: renamed from: j */
        private static int f5023j = 1;

        static {
            a aVar = new a();
            f5021d = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.incode.welcome_sdk.commons.exceptions.FaceAuthenticationException", aVar, 2);
            pluginGeneratedSerialDescriptor.addElement("name", false);
            pluginGeneratedSerialDescriptor.addElement("message", false);
            f5022e = pluginGeneratedSerialDescriptor;
            int i2 = f5019b + 99;
            f5023j = i2 % 128;
            int i3 = i2 % 2;
        }

        private a() {
        }

        private FaceAuthenticationException b(Decoder decoder) {
            FaceAuthenticationErrorCode faceAuthenticationErrorCode;
            String strDecodeStringElement;
            int i2;
            int i3 = 2 % 2;
            int i4 = f5020c + 37;
            f5018a = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.checkNotNullParameter(decoder, "");
            SerialDescriptor descriptor = getDescriptor();
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
            KSerializer[] kSerializerArrAccess$get$childSerializers$cp = FaceAuthenticationException.access$get$childSerializers$cp();
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                faceAuthenticationErrorCode = (FaceAuthenticationErrorCode) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, kSerializerArrAccess$get$childSerializers$cp[0], null);
                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 1);
                i2 = 3;
            } else {
                faceAuthenticationErrorCode = null;
                strDecodeStringElement = null;
                boolean z2 = true;
                i2 = 0;
                while (z2) {
                    int i6 = f5018a + 99;
                    f5020c = i6 % 128;
                    int i7 = i6 % 2;
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                    if (iDecodeElementIndex == -1) {
                        z2 = false;
                    } else if (iDecodeElementIndex == 0) {
                        faceAuthenticationErrorCode = (FaceAuthenticationErrorCode) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, kSerializerArrAccess$get$childSerializers$cp[0], faceAuthenticationErrorCode);
                        i2 |= 1;
                    } else {
                        if (iDecodeElementIndex != 1) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 1);
                        i2 |= 2;
                    }
                }
            }
            compositeDecoderBeginStructure.endStructure(descriptor);
            return new FaceAuthenticationException(i2, faceAuthenticationErrorCode, strDecodeStringElement, null);
        }

        private void b(Encoder encoder, FaceAuthenticationException faceAuthenticationException) {
            int i2 = 2 % 2;
            int i3 = f5020c + 13;
            f5018a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(faceAuthenticationException, "");
            SerialDescriptor descriptor = getDescriptor();
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
            FaceAuthenticationException.write$Self$onboard_release(faceAuthenticationException, compositeEncoderBeginStructure, descriptor);
            compositeEncoderBeginStructure.endStructure(descriptor);
            int i5 = f5018a + 29;
            f5020c = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            int i2 = 2 % 2;
            int i3 = f5018a + 107;
            f5020c = i3 % 128;
            int i4 = i3 % 2;
            KSerializer<?>[] kSerializerArr = {FaceAuthenticationException.access$get$childSerializers$cp()[0], StringSerializer.INSTANCE};
            int i5 = f5018a + 41;
            f5020c = i5 % 128;
            if (i5 % 2 == 0) {
                return kSerializerArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public final /* synthetic */ Object deserialize(Decoder decoder) {
            int i2 = 2 % 2;
            int i3 = f5018a + 57;
            f5020c = i3 % 128;
            int i4 = i3 % 2;
            FaceAuthenticationException faceAuthenticationExceptionB = b(decoder);
            int i5 = f5018a + 109;
            f5020c = i5 % 128;
            int i6 = i5 % 2;
            return faceAuthenticationExceptionB;
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            int i2 = 2 % 2;
            int i3 = f5018a;
            int i4 = i3 + 103;
            f5020c = i4 % 128;
            int i5 = i4 % 2;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f5022e;
            int i6 = i3 + 29;
            f5020c = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 87 / 0;
            }
            return pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final /* synthetic */ void serialize(Encoder encoder, Object obj) {
            int i2 = 2 % 2;
            int i3 = f5020c + 35;
            f5018a = i3 % 128;
            int i4 = i3 % 2;
            b(encoder, (FaceAuthenticationException) obj);
            int i5 = f5018a + 123;
            f5020c = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] typeParametersSerializers() {
            KSerializer<?>[] kSerializerArrTypeParametersSerializers;
            int i2 = 2 % 2;
            int i3 = f5020c + 121;
            f5018a = i3 % 128;
            if (i3 % 2 == 0) {
                kSerializerArrTypeParametersSerializers = GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
                int i4 = 55 / 0;
            } else {
                kSerializerArrTypeParametersSerializers = GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
            int i5 = f5018a + 47;
            f5020c = i5 % 128;
            int i6 = i5 % 2;
            return kSerializerArrTypeParametersSerializers;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ FaceAuthenticationException(int i2, @SerialName("name") FaceAuthenticationErrorCode faceAuthenticationErrorCode, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i2 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 3, a.f5021d.getDescriptor());
        }
        this.code = faceAuthenticationErrorCode;
        this.message = str;
    }

    public static final /* synthetic */ KSerializer[] access$get$childSerializers$cp() {
        int i2 = 2 % 2;
        int i3 = f5016d;
        int i4 = i3 + 13;
        f5017e = i4 % 128;
        int i5 = i4 % 2;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        int i6 = i3 + 105;
        f5017e = i6 % 128;
        int i7 = i6 % 2;
        return kSerializerArr;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$onboard_release(FaceAuthenticationException faceAuthenticationException, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        int i2 = 2 % 2;
        int i3 = f5016d + 11;
        f5017e = i3 % 128;
        int i4 = i3 % 2;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], faceAuthenticationException.code);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, faceAuthenticationException.getMessage());
        int i5 = f5016d + 25;
        f5017e = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
    }

    public final FaceAuthenticationErrorCode getCode() {
        int i2 = 2 % 2;
        int i3 = f5016d + 33;
        int i4 = i3 % 128;
        f5017e = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        FaceAuthenticationErrorCode faceAuthenticationErrorCode = this.code;
        int i5 = i4 + 121;
        f5016d = i5 % 128;
        int i6 = i5 % 2;
        return faceAuthenticationErrorCode;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        int i2 = 2 % 2;
        int i3 = f5016d + 5;
        int i4 = i3 % 128;
        f5017e = i4;
        int i5 = i3 % 2;
        String str = this.message;
        int i6 = i4 + 47;
        f5016d = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public static final class b {

        /* JADX INFO: renamed from: b */
        private static int f5024b = 1;

        /* JADX INFO: renamed from: e */
        private static int f5025e = 0;

        private b() {
        }

        public final KSerializer<FaceAuthenticationException> serializer() {
            int i2 = 2 % 2;
            int i3 = f5025e + 91;
            f5024b = i3 % 128;
            int i4 = i3 % 2;
            a aVar = a.f5021d;
            if (i4 != 0) {
                return aVar;
            }
            throw null;
        }

        public static FaceAuthenticationException a() {
            int i2 = 2 % 2;
            FaceAuthenticationException faceAuthenticationException = new FaceAuthenticationException(FaceAuthenticationErrorCode.NETWORK_ERROR, "No network connection available");
            int i3 = f5025e + 29;
            f5024b = i3 % 128;
            if (i3 % 2 != 0) {
                return faceAuthenticationException;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static FaceAuthenticationException b() {
            int i2 = 2 % 2;
            FaceAuthenticationException faceAuthenticationException = new FaceAuthenticationException(FaceAuthenticationErrorCode.UNKNOWN, "An unknown error occurred");
            int i3 = f5024b + 27;
            f5025e = i3 % 128;
            if (i3 % 2 == 0) {
                return faceAuthenticationException;
            }
            throw null;
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceAuthenticationException(FaceAuthenticationErrorCode faceAuthenticationErrorCode, String str) {
        super(str);
        Intrinsics.checkNotNullParameter(faceAuthenticationErrorCode, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.code = faceAuthenticationErrorCode;
        this.message = str;
    }

    static {
        Object obj = null;
        int i2 = f5015b + 27;
        f5014a = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @SerialName("name")
    public static /* synthetic */ void getCode$annotations() {
        int i2 = 2 % 2;
        int i3 = f5016d + 17;
        f5017e = i3 % 128;
        int i4 = i3 % 2;
    }
}
