package com.incode.welcome_sdk.data.remote.beans;

import androidx.autofill.HintConstants;
import java.io.IOException;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f9417a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9418b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9419d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f9420e = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f9421c;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final class a implements GeneratedSerializer<be> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f9422a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f9423b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ PluginGeneratedSerialDescriptor f9424c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f9425d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f9426e;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f9427i = 1;

        static {
            a aVar = new a();
            f9426e = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.incode.welcome_sdk.data.remote.beans.ResponsePhonePrefill", aVar, 1);
            pluginGeneratedSerialDescriptor.addElement(HintConstants.AUTOFILL_HINT_PHONE, false);
            f9424c = pluginGeneratedSerialDescriptor;
            int i2 = f9427i + 27;
            f9425d = i2 % 128;
            int i3 = i2 % 2;
        }

        private a() {
        }

        private be e(Decoder decoder) {
            String strDecodeStringElement;
            int i2 = 2 % 2;
            int i3 = f9422a + 113;
            f9423b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(decoder, "");
            SerialDescriptor descriptor = getDescriptor();
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
            int i5 = 1;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                int i6 = f9422a + 15;
                f9423b = i6 % 128;
                if (i6 % 2 == 0) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 1);
                    i5 = 0;
                } else {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 0);
                }
            } else {
                strDecodeStringElement = null;
                boolean z2 = true;
                int i7 = 0;
                while (z2) {
                    int i8 = f9423b + 91;
                    f9422a = i8 % 128;
                    if (i8 % 2 != 0) {
                        compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                        throw null;
                    }
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                    if (iDecodeElementIndex == -1) {
                        int i9 = f9422a + 5;
                        f9423b = i9 % 128;
                        if (i9 % 2 == 0) {
                            int i10 = 2 % 4;
                        }
                        z2 = false;
                    } else {
                        if (iDecodeElementIndex != 0) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 0);
                        i7 = 1;
                    }
                }
                i5 = i7;
            }
            compositeDecoderBeginStructure.endStructure(descriptor);
            return new be(i5, strDecodeStringElement);
        }

        private void e(Encoder encoder, be beVar) {
            int i2 = 2 % 2;
            int i3 = f9423b + 71;
            f9422a = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(encoder, "");
                Intrinsics.checkNotNullParameter(beVar, "");
                SerialDescriptor descriptor = getDescriptor();
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
                be.a(beVar, compositeEncoderBeginStructure, descriptor);
                compositeEncoderBeginStructure.endStructure(descriptor);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(beVar, "");
            SerialDescriptor descriptor2 = getDescriptor();
            CompositeEncoder compositeEncoderBeginStructure2 = encoder.beginStructure(descriptor2);
            be.a(beVar, compositeEncoderBeginStructure2, descriptor2);
            compositeEncoderBeginStructure2.endStructure(descriptor2);
            int i4 = f9422a + 33;
            f9423b = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 45 / 0;
            }
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            int i2 = 2 % 2;
            int i3 = f9422a + 37;
            f9423b = i3 % 128;
            int i4 = i3 % 2;
            KSerializer<?>[] kSerializerArr = {StringSerializer.INSTANCE};
            int i5 = f9422a + 79;
            f9423b = i5 % 128;
            if (i5 % 2 != 0) {
                return kSerializerArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public final /* synthetic */ Object deserialize(Decoder decoder) {
            int i2 = 2 % 2;
            int i3 = f9422a + 85;
            f9423b = i3 % 128;
            int i4 = i3 % 2;
            be beVarE = e(decoder);
            int i5 = f9423b + 87;
            f9422a = i5 % 128;
            if (i5 % 2 == 0) {
                return beVarE;
            }
            throw null;
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            int i2 = 2 % 2;
            int i3 = f9422a + 67;
            f9423b = i3 % 128;
            int i4 = i3 % 2;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f9424c;
            if (i4 != 0) {
                return pluginGeneratedSerialDescriptor;
            }
            throw null;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final /* synthetic */ void serialize(Encoder encoder, Object obj) {
            int i2 = 2 % 2;
            int i3 = f9423b + 103;
            f9422a = i3 % 128;
            int i4 = i3 % 2;
            e(encoder, (be) obj);
            int i5 = f9423b + 93;
            f9422a = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] typeParametersSerializers() {
            int i2 = 2 % 2;
            int i3 = f9423b + 3;
            f9422a = i3 % 128;
            if (i3 % 2 != 0) {
                GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            KSerializer<?>[] kSerializerArrTypeParametersSerializers = GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            int i4 = f9423b + 125;
            f9422a = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 68 / 0;
            }
            return kSerializerArrTypeParametersSerializers;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ be(int i2, String str) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 1, a.f9426e.getDescriptor());
        }
        this.f9421c = str;
    }

    public be(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f9421c = str;
    }

    @JvmStatic
    public static final /* synthetic */ void a(be beVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        int i2 = 2 % 2;
        int i3 = f9419d + 15;
        f9420e = i3 % 128;
        int i4 = i3 % 2;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, beVar.f9421c);
        int i5 = f9419d + 19;
        f9420e = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f9428b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f9429d = 0;

        private c() {
        }

        public final KSerializer<be> serializer() {
            int i2 = 2 % 2;
            int i3 = f9428b + 39;
            f9429d = i3 % 128;
            int i4 = i3 % 2;
            a aVar = a.f9426e;
            int i5 = f9428b + 113;
            f9429d = i5 % 128;
            int i6 = i5 % 2;
            return aVar;
        }

        @JvmStatic
        public static be d(ResponseBody responseBody) throws JSONException, IOException {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseBody, "");
            String strOptString = new JSONObject(responseBody.string()).optString(HintConstants.AUTOFILL_HINT_PHONE);
            Intrinsics.checkNotNullExpressionValue(strOptString, "");
            be beVar = new be(strOptString);
            int i3 = f9428b + 81;
            f9429d = i3 % 128;
            int i4 = i3 % 2;
            return beVar;
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    public final String c() {
        String str;
        int i2 = 2 % 2;
        int i3 = f9420e + 35;
        int i4 = i3 % 128;
        f9419d = i4;
        if (i3 % 2 != 0) {
            str = this.f9421c;
            int i5 = 62 / 0;
        } else {
            str = this.f9421c;
        }
        int i6 = i4 + 69;
        f9420e = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    static {
        new c((byte) 0);
        int i2 = f9417a + 3;
        f9418b = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final be c(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        int i3 = f9420e + 59;
        f9419d = i3 % 128;
        if (i3 % 2 != 0) {
            c.d(responseBody);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        be beVarD = c.d(responseBody);
        int i4 = f9419d + 83;
        f9420e = i4 % 128;
        int i5 = i4 % 2;
        return beVarD;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be)) {
            int i3 = f9419d + 33;
            f9420e = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.f9421c, ((be) obj).f9421c)) {
            return false;
        }
        int i5 = f9420e + 107;
        f9419d = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f9420e + 59;
        f9419d = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f9421c;
        if (i4 == 0) {
            return str.hashCode();
        }
        str.hashCode();
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9419d + 55;
        f9420e = i3 % 128;
        int i4 = i3 % 2;
        String str = "ResponsePhonePrefill(phone=" + this.f9421c + ")";
        int i5 = f9419d + 35;
        f9420e = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
