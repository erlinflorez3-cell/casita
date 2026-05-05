package com.incode.welcome_sdk.data.remote;

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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes5.dex */
@SerialName("frameSize")
@Serializable
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f8961a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f8962b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f8963e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f8964g = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f8966d;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f8967a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f8968b = 0;

        private b() {
        }

        public final KSerializer<a> serializer() {
            int i2 = 2 % 2;
            int i3 = f8968b + 27;
            f8967a = i3 % 128;
            int i4 = i3 % 2;
            d dVar = d.f8970b;
            if (i4 != 0) {
                return dVar;
            }
            throw null;
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final class d implements GeneratedSerializer<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final /* synthetic */ PluginGeneratedSerialDescriptor f8969a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f8970b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f8971c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f8972d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f8973e = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f8974g = 1;

        static {
            d dVar = new d();
            f8970b = dVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("frameSize", dVar, 2);
            pluginGeneratedSerialDescriptor.addElement("width", false);
            pluginGeneratedSerialDescriptor.addElement("height", false);
            f8969a = pluginGeneratedSerialDescriptor;
            int i2 = f8973e + 1;
            f8974g = i2 % 128;
            int i3 = i2 % 2;
        }

        private d() {
        }

        private a c(Decoder decoder) {
            int iDecodeIntElement;
            int iDecodeIntElement2;
            int i2;
            int i3 = 2 % 2;
            int i4 = f8971c + 51;
            f8972d = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.checkNotNullParameter(decoder, "");
            SerialDescriptor descriptor = getDescriptor();
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                int i6 = f8972d + 93;
                f8971c = i6 % 128;
                if (i6 % 2 != 0) {
                    iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor, 1);
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 0);
                    i2 = 4;
                } else {
                    iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor, 0);
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 1);
                    i2 = 3;
                }
            } else {
                boolean z2 = true;
                iDecodeIntElement = 0;
                iDecodeIntElement2 = 0;
                i2 = 0;
                while (z2) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                    if (iDecodeElementIndex == -1) {
                        z2 = false;
                    } else if (iDecodeElementIndex == 0) {
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor, 0);
                        i2 |= 1;
                    } else {
                        if (iDecodeElementIndex != 1) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 1);
                        i2 |= 2;
                    }
                }
            }
            compositeDecoderBeginStructure.endStructure(descriptor);
            a aVar = new a(i2, iDecodeIntElement, iDecodeIntElement2);
            int i7 = f8971c + 27;
            f8972d = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 64 / 0;
            }
            return aVar;
        }

        private void e(Encoder encoder, a aVar) {
            int i2 = 2 % 2;
            int i3 = f8971c + 89;
            f8972d = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(encoder, "");
                Intrinsics.checkNotNullParameter(aVar, "");
                SerialDescriptor descriptor = getDescriptor();
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
                a.a(aVar, compositeEncoderBeginStructure, descriptor);
                compositeEncoderBeginStructure.endStructure(descriptor);
                return;
            }
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(aVar, "");
            SerialDescriptor descriptor2 = getDescriptor();
            CompositeEncoder compositeEncoderBeginStructure2 = encoder.beginStructure(descriptor2);
            a.a(aVar, compositeEncoderBeginStructure2, descriptor2);
            compositeEncoderBeginStructure2.endStructure(descriptor2);
            throw null;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?>[] kSerializerArr;
            int i2 = 2 % 2;
            int i3 = f8972d + 125;
            f8971c = i3 % 128;
            if (i3 % 2 != 0) {
                kSerializerArr = new KSerializer[5];
                kSerializerArr[0] = IntSerializer.INSTANCE;
                kSerializerArr[1] = IntSerializer.INSTANCE;
            } else {
                kSerializerArr = new KSerializer[]{IntSerializer.INSTANCE, IntSerializer.INSTANCE};
            }
            int i4 = f8972d + 111;
            f8971c = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerArr;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public final /* synthetic */ Object deserialize(Decoder decoder) {
            int i2 = 2 % 2;
            int i3 = f8972d + 53;
            f8971c = i3 % 128;
            int i4 = i3 % 2;
            a aVarC = c(decoder);
            int i5 = f8972d + 1;
            f8971c = i5 % 128;
            if (i5 % 2 == 0) {
                return aVarC;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor;
            int i2 = 2 % 2;
            int i3 = f8972d;
            int i4 = i3 + 121;
            f8971c = i4 % 128;
            if (i4 % 2 != 0) {
                pluginGeneratedSerialDescriptor = f8969a;
                int i5 = 60 / 0;
            } else {
                pluginGeneratedSerialDescriptor = f8969a;
            }
            int i6 = i3 + 101;
            f8971c = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 79 / 0;
            }
            return pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final /* synthetic */ void serialize(Encoder encoder, Object obj) {
            int i2 = 2 % 2;
            int i3 = f8972d + 71;
            f8971c = i3 % 128;
            int i4 = i3 % 2;
            Object obj2 = null;
            e(encoder, (a) obj);
            if (i4 != 0) {
                obj2.hashCode();
                throw null;
            }
            int i5 = f8972d + 9;
            f8971c = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            obj2.hashCode();
            throw null;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] typeParametersSerializers() {
            int i2 = 2 % 2;
            int i3 = f8971c + 95;
            f8972d = i3 % 128;
            if (i3 % 2 != 0) {
                return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
            GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public a(int i2, int i3) {
        this.f8966d = i2;
        this.f8965c = i3;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ a(int i2, int i3, int i4) {
        if (3 != (i2 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 3, d.f8970b.getDescriptor());
        }
        this.f8966d = i3;
        this.f8965c = i4;
    }

    @JvmStatic
    public static final /* synthetic */ void a(a aVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        int i2 = 2 % 2;
        int i3 = f8961a + 83;
        f8962b = i3 % 128;
        int i4 = i3 % 2;
        compositeEncoder.encodeIntElement(serialDescriptor, 0, aVar.f8966d);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, aVar.f8965c);
        int i5 = f8961a + 81;
        f8962b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 78 / 0;
        }
    }

    static {
        new b((byte) 0);
        int i2 = f8963e + 115;
        f8964g = i2 % 128;
        int i3 = i2 % 2;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof a))) {
            a aVar = (a) obj;
            if (this.f8966d == aVar.f8966d) {
                return this.f8965c == aVar.f8965c;
            }
            int i3 = f8961a + 63;
            f8962b = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = f8961a;
        int i6 = i5 + 21;
        f8962b = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i5 + 63;
        f8962b = i8 % 128;
        if (i8 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f8961a + 101;
        f8962b = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (Integer.hashCode(this.f8966d) * 31) + Integer.hashCode(this.f8965c);
        int i5 = f8961a + 91;
        f8962b = i5 % 128;
        if (i5 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f8962b + 29;
        f8961a = i3 % 128;
        int i4 = i3 % 2;
        String str = "FrameSizeRequestBody(width=" + this.f8966d + ", height=" + this.f8965c + ")";
        int i5 = f8962b + 55;
        f8961a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
