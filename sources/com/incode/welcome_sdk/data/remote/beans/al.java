package com.incode.welcome_sdk.data.remote.beans;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class al {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f9273a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9274b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9275c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f9276e = 1;
    private final List<a> features;
    private final String sessionIdentifier;
    public static final d Companion = new d(0);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(a.d.f9286d), null};

    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f9289b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f9290d = 0;

        private d() {
        }

        public final KSerializer<al> serializer() {
            int i2 = 2 % 2;
            int i3 = f9289b + 121;
            f9290d = i3 % 128;
            if (i3 % 2 != 0) {
                e eVar = e.f9294d;
                throw null;
            }
            e eVar2 = e.f9294d;
            int i4 = f9290d + 109;
            f9289b = i4 % 128;
            int i5 = i4 % 2;
            return eVar2;
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final class e implements GeneratedSerializer<al> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final /* synthetic */ PluginGeneratedSerialDescriptor f9291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f9292b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f9293c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f9294d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f9295e = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f9296g = 1;

        static {
            e eVar = new e();
            f9294d = eVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.incode.welcome_sdk.data.remote.beans.ResponseFeatureConfig", eVar, 2);
            pluginGeneratedSerialDescriptor.addElement("features", false);
            pluginGeneratedSerialDescriptor.addElement("sessionIdentifier", false);
            f9291a = pluginGeneratedSerialDescriptor;
            int i2 = f9296g + 37;
            f9293c = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 88 / 0;
            }
        }

        private e() {
        }

        private void c(Encoder encoder, al alVar) {
            int i2 = 2 % 2;
            int i3 = f9292b + 95;
            f9295e = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(encoder, "");
                Intrinsics.checkNotNullParameter(alVar, "");
                SerialDescriptor descriptor = getDescriptor();
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
                al.b(alVar, compositeEncoderBeginStructure, descriptor);
                compositeEncoderBeginStructure.endStructure(descriptor);
                int i4 = 19 / 0;
            } else {
                Intrinsics.checkNotNullParameter(encoder, "");
                Intrinsics.checkNotNullParameter(alVar, "");
                SerialDescriptor descriptor2 = getDescriptor();
                CompositeEncoder compositeEncoderBeginStructure2 = encoder.beginStructure(descriptor2);
                al.b(alVar, compositeEncoderBeginStructure2, descriptor2);
                compositeEncoderBeginStructure2.endStructure(descriptor2);
            }
            int i5 = f9292b + 15;
            f9295e = i5 % 128;
            int i6 = i5 % 2;
        }

        private al d(Decoder decoder) {
            String strDecodeStringElement;
            int i2;
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(decoder, "");
            SerialDescriptor descriptor = getDescriptor();
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
            KSerializer[] kSerializerArrE = al.e();
            List list = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                int i4 = f9292b + 89;
                f9295e = i4 % 128;
                int i5 = i4 % 2;
                list = (List) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, kSerializerArrE[0], null);
                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 1);
                i2 = 3;
            } else {
                strDecodeStringElement = null;
                boolean z2 = true;
                i2 = 0;
                while (z2) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                    if (iDecodeElementIndex == -1) {
                        int i6 = f9295e + 33;
                        f9292b = i6 % 128;
                        int i7 = i6 % 2;
                        z2 = false;
                    } else if (iDecodeElementIndex == 0) {
                        list = (List) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, kSerializerArrE[0], list);
                        i2 |= 1;
                    } else {
                        if (iDecodeElementIndex != 1) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 1);
                        i2 |= 2;
                        int i8 = f9295e + 85;
                        f9292b = i8 % 128;
                        int i9 = i8 % 2;
                    }
                }
            }
            compositeDecoderBeginStructure.endStructure(descriptor);
            return new al(i2, list, strDecodeStringElement);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?>[] kSerializerArr;
            int i2 = 2 % 2;
            int i3 = f9295e + 3;
            f9292b = i3 % 128;
            if (i3 % 2 == 0) {
                kSerializerArr = new KSerializer[4];
                kSerializerArr[0] = al.e()[0];
                kSerializerArr[0] = StringSerializer.INSTANCE;
            } else {
                kSerializerArr = new KSerializer[]{al.e()[0], StringSerializer.INSTANCE};
            }
            int i4 = f9295e + 101;
            f9292b = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerArr;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public final /* synthetic */ Object deserialize(Decoder decoder) {
            int i2 = 2 % 2;
            int i3 = f9295e + 71;
            f9292b = i3 % 128;
            int i4 = i3 % 2;
            al alVarD = d(decoder);
            int i5 = f9295e + 83;
            f9292b = i5 % 128;
            if (i5 % 2 != 0) {
                return alVarD;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            int i2 = 2 % 2;
            int i3 = f9295e;
            int i4 = i3 + 25;
            f9292b = i4 % 128;
            int i5 = i4 % 2;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f9291a;
            int i6 = i3 + 77;
            f9292b = i6 % 128;
            int i7 = i6 % 2;
            return pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final /* synthetic */ void serialize(Encoder encoder, Object obj) {
            int i2 = 2 % 2;
            int i3 = f9295e + 57;
            f9292b = i3 % 128;
            int i4 = i3 % 2;
            c(encoder, (al) obj);
            int i5 = f9295e + 7;
            f9292b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 74 / 0;
            }
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] typeParametersSerializers() {
            int i2 = 2 % 2;
            int i3 = f9295e + 93;
            f9292b = i3 % 128;
            if (i3 % 2 == 0) {
                GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
                throw null;
            }
            KSerializer<?>[] kSerializerArrTypeParametersSerializers = GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            int i4 = f9295e + 29;
            f9292b = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializerArrTypeParametersSerializers;
            }
            throw null;
        }
    }

    static {
        int i2 = f9274b + 17;
        f9276e = i2 % 128;
        int i3 = i2 % 2;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ al(int i2, List list, String str) {
        if (3 != (i2 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 3, e.f9294d.getDescriptor());
        }
        this.features = list;
        this.sessionIdentifier = str;
    }

    @JvmStatic
    public static final /* synthetic */ void b(al alVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        int i2 = 2 % 2;
        int i3 = f9275c + 3;
        f9273a = i3 % 128;
        int i4 = i3 % 2;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], alVar.features);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, alVar.sessionIdentifier);
        int i5 = f9273a + 41;
        f9275c = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ KSerializer[] e() {
        int i2 = 2 % 2;
        int i3 = f9275c + 51;
        f9273a = i3 % 128;
        if (i3 % 2 != 0) {
            return $childSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<a> a() {
        int i2 = 2 % 2;
        int i3 = f9275c + 89;
        f9273a = i3 % 128;
        if (i3 % 2 != 0) {
            return this.features;
        }
        throw null;
    }

    public final String d() {
        int i2 = 2 % 2;
        int i3 = f9273a;
        int i4 = i3 + 41;
        f9275c = i4 % 128;
        int i5 = i4 % 2;
        String str = this.sessionIdentifier;
        int i6 = i3 + 57;
        f9275c = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    @Serializable
    public static final class a {
        public static final int $stable = 0;
        public static final C0235a Companion = new C0235a(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f9277a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f9278b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f9279c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f9280e = 1;
        private final boolean enabled;
        private final String feature;

        /* JADX INFO: renamed from: com.incode.welcome_sdk.data.remote.beans.al$a$a, reason: collision with other inner class name */
        public static final class C0235a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f9281a = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f9282d = 0;

            private C0235a() {
            }

            public final KSerializer<a> serializer() {
                int i2 = 2 % 2;
                int i3 = f9281a + 115;
                f9282d = i3 % 128;
                int i4 = i3 % 2;
                d dVar = d.f9286d;
                int i5 = f9282d + 117;
                f9281a = i5 % 128;
                int i6 = i5 % 2;
                return dVar;
            }

            public /* synthetic */ C0235a(byte b2) {
                this();
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public static final class d implements GeneratedSerializer<a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f9283a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f9284b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final /* synthetic */ PluginGeneratedSerialDescriptor f9285c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final d f9286d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f9287e = 1;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static int f9288i = 1;

            static {
                d dVar = new d();
                f9286d = dVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.incode.welcome_sdk.data.remote.beans.ResponseFeatureConfig.FeatureConfig", dVar, 2);
                pluginGeneratedSerialDescriptor.addElement("enabled", false);
                pluginGeneratedSerialDescriptor.addElement("feature", false);
                f9285c = pluginGeneratedSerialDescriptor;
                int i2 = f9288i + 113;
                f9284b = i2 % 128;
                if (i2 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private d() {
            }

            private a b(Decoder decoder) {
                String strDecodeStringElement;
                boolean zDecodeBooleanElement;
                int i2;
                int i3 = 2 % 2;
                Intrinsics.checkNotNullParameter(decoder, "");
                SerialDescriptor descriptor = getDescriptor();
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    int i4 = f9283a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                    f9287e = i4 % 128;
                    int i5 = i4 % 2;
                    zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(descriptor, 0);
                    if (i5 == 0) {
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 1);
                        i2 = 5;
                    } else {
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 1);
                        i2 = 3;
                    }
                } else {
                    Object obj = null;
                    strDecodeStringElement = null;
                    zDecodeBooleanElement = false;
                    i2 = 0;
                    boolean z2 = true;
                    while (!(!z2)) {
                        int i6 = f9283a + 85;
                        f9287e = i6 % 128;
                        if (i6 % 2 == 0) {
                            compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                            obj.hashCode();
                            throw null;
                        }
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                        if (iDecodeElementIndex == -1) {
                            z2 = false;
                        } else if (iDecodeElementIndex == 0) {
                            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(descriptor, 0);
                            i2 |= 1;
                        } else {
                            if (iDecodeElementIndex != 1) {
                                throw new UnknownFieldException(iDecodeElementIndex);
                            }
                            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 1);
                            i2 |= 2;
                            int i7 = f9287e + 21;
                            f9283a = i7 % 128;
                            if (i7 % 2 != 0) {
                                int i8 = 3 % 2;
                            }
                        }
                    }
                }
                compositeDecoderBeginStructure.endStructure(descriptor);
                return new a(i2, zDecodeBooleanElement, strDecodeStringElement);
            }

            private void e(Encoder encoder, a aVar) {
                int i2 = 2 % 2;
                int i3 = f9283a + 35;
                f9287e = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(encoder, "");
                    Intrinsics.checkNotNullParameter(aVar, "");
                    SerialDescriptor descriptor = getDescriptor();
                    CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
                    a.d(aVar, compositeEncoderBeginStructure, descriptor);
                    compositeEncoderBeginStructure.endStructure(descriptor);
                    return;
                }
                Intrinsics.checkNotNullParameter(encoder, "");
                Intrinsics.checkNotNullParameter(aVar, "");
                SerialDescriptor descriptor2 = getDescriptor();
                CompositeEncoder compositeEncoderBeginStructure2 = encoder.beginStructure(descriptor2);
                a.d(aVar, compositeEncoderBeginStructure2, descriptor2);
                compositeEncoderBeginStructure2.endStructure(descriptor2);
                int i4 = 29 / 0;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer<?>[] childSerializers() {
                KSerializer<?>[] kSerializerArr;
                int i2 = 2 % 2;
                int i3 = f9283a + 91;
                f9287e = i3 % 128;
                if (i3 % 2 == 0) {
                    kSerializerArr = new KSerializer[4];
                    kSerializerArr[1] = BooleanSerializer.INSTANCE;
                    kSerializerArr[0] = StringSerializer.INSTANCE;
                } else {
                    kSerializerArr = new KSerializer[]{BooleanSerializer.INSTANCE, StringSerializer.INSTANCE};
                }
                int i4 = f9283a + 27;
                f9287e = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializerArr;
                }
                throw null;
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            public final /* synthetic */ Object deserialize(Decoder decoder) {
                int i2 = 2 % 2;
                int i3 = f9287e + 61;
                f9283a = i3 % 128;
                int i4 = i3 % 2;
                a aVarB = b(decoder);
                int i5 = f9287e + 93;
                f9283a = i5 % 128;
                int i6 = i5 % 2;
                return aVarB;
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public final SerialDescriptor getDescriptor() {
                int i2 = 2 % 2;
                int i3 = f9287e + 9;
                int i4 = i3 % 128;
                f9283a = i4;
                int i5 = i3 % 2;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f9285c;
                int i6 = i4 + 17;
                f9287e = i6 % 128;
                int i7 = i6 % 2;
                return pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.SerializationStrategy
            public final /* synthetic */ void serialize(Encoder encoder, Object obj) {
                int i2 = 2 % 2;
                int i3 = f9283a + 73;
                f9287e = i3 % 128;
                int i4 = i3 % 2;
                e(encoder, (a) obj);
                if (i4 == 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                int i5 = f9283a + 45;
                f9287e = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer<?>[] typeParametersSerializers() {
                int i2 = 2 % 2;
                int i3 = f9283a + 21;
                f9287e = i3 % 128;
                int i4 = i3 % 2;
                KSerializer<?>[] kSerializerArrTypeParametersSerializers = GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
                int i5 = f9287e + 87;
                f9283a = i5 % 128;
                int i6 = i5 % 2;
                return kSerializerArrTypeParametersSerializers;
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ a(int i2, boolean z2, String str) {
            if (3 != (i2 & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i2, 3, d.f9286d.getDescriptor());
            }
            this.enabled = z2;
            this.feature = str;
        }

        @JvmStatic
        public static final /* synthetic */ void d(a aVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            int i2 = 2 % 2;
            int i3 = f9279c + 19;
            f9277a = i3 % 128;
            int i4 = i3 % 2;
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, aVar.enabled);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, aVar.feature);
        }

        public final boolean d() {
            int i2 = 2 % 2;
            int i3 = f9277a;
            int i4 = i3 + 121;
            f9279c = i4 % 128;
            int i5 = i4 % 2;
            boolean z2 = this.enabled;
            int i6 = i3 + 123;
            f9279c = i6 % 128;
            int i7 = i6 % 2;
            return z2;
        }

        public final String e() {
            int i2 = 2 % 2;
            int i3 = f9279c + 105;
            f9277a = i3 % 128;
            if (i3 % 2 != 0) {
                return this.feature;
            }
            throw null;
        }

        static {
            int i2 = f9280e + 77;
            f9278b = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            int i3 = f9277a;
            int i4 = i3 + 11;
            f9279c = i4 % 128;
            int i5 = i4 % 2;
            if (this == obj) {
                int i6 = i3 + 1;
                f9279c = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.enabled == aVar.enabled && Intrinsics.areEqual(this.feature, aVar.feature);
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = f9279c + 67;
            f9277a = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode = Boolean.hashCode(this.enabled);
            return i4 == 0 ? (iHashCode + 63) >> this.feature.hashCode() : (iHashCode * 31) + this.feature.hashCode();
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f9277a + 81;
            f9279c = i3 % 128;
            int i4 = i3 % 2;
            String str = "FeatureConfig(enabled=" + this.enabled + ", feature=" + this.feature + ")";
            int i5 = f9277a + 31;
            f9279c = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f9273a + 81;
            int i4 = i3 % 128;
            f9275c = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 17;
            f9273a = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof al)) {
            return false;
        }
        al alVar = (al) obj;
        if (!Intrinsics.areEqual(this.features, alVar.features)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.sessionIdentifier, alVar.sessionIdentifier)) {
            int i8 = f9273a + 105;
            f9275c = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = f9273a + 1;
        f9275c = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 65 / 0;
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f9275c + 9;
        f9273a = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (this.features.hashCode() * 31) + this.sessionIdentifier.hashCode();
        int i5 = f9273a + 35;
        f9275c = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9275c + 83;
        f9273a = i3 % 128;
        if (i3 % 2 == 0) {
            String str = "ResponseFeatureConfig(features=" + this.features + ", sessionIdentifier=" + this.sessionIdentifier + ")";
            throw null;
        }
        String str2 = "ResponseFeatureConfig(features=" + this.features + ", sessionIdentifier=" + this.sessionIdentifier + ")";
        int i4 = f9273a + 51;
        f9275c = i4 % 128;
        if (i4 % 2 == 0) {
            return str2;
        }
        throw null;
    }
}
