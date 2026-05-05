package com.incode.welcome_sdk.data.remote.beans;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.commons.exceptions.FaceAuthenticationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class ResponseFaceAuthentication {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f9131a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9132b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9133c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f9134e = 0;
    private final String candidate;
    private final Integer captureAttemptsLimit;
    private final FaceAuthenticationException error;
    private final FaceAuthenticationOverallStatus overallStatusString;
    public static final d Companion = new d(0);
    private static final KSerializer<Object>[] $childSerializers = {FaceAuthenticationOverallStatus.Companion.serializer(), null, null, null};

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final class e implements GeneratedSerializer<ResponseFaceAuthentication> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final /* synthetic */ PluginGeneratedSerialDescriptor f9137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f9138b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f9139c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f9140d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final e f9141e;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f9142j = 1;

        static {
            e eVar = new e();
            f9141e = eVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.incode.welcome_sdk.data.remote.beans.ResponseFaceAuthentication", eVar, 4);
            pluginGeneratedSerialDescriptor.addElement("overallStatus", true);
            pluginGeneratedSerialDescriptor.addElement("captureAttemptsLimit", true);
            pluginGeneratedSerialDescriptor.addElement("candidate", true);
            pluginGeneratedSerialDescriptor.addElement("error", true);
            f9137a = pluginGeneratedSerialDescriptor;
            int i2 = f9139c + 59;
            f9142j = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 49 / 0;
            }
        }

        private e() {
        }

        private void a(Encoder encoder, ResponseFaceAuthentication responseFaceAuthentication) {
            int i2 = 2 % 2;
            int i3 = f9140d + 3;
            f9138b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(responseFaceAuthentication, "");
            SerialDescriptor descriptor = getDescriptor();
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
            ResponseFaceAuthentication.write$Self$onboard_release(responseFaceAuthentication, compositeEncoderBeginStructure, descriptor);
            compositeEncoderBeginStructure.endStructure(descriptor);
            int i5 = f9138b + 111;
            f9140d = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 52 / 0;
            }
        }

        private ResponseFaceAuthentication d(Decoder decoder) {
            int i2;
            Integer num;
            String str;
            FaceAuthenticationException faceAuthenticationException;
            FaceAuthenticationOverallStatus faceAuthenticationOverallStatus;
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(decoder, "");
            SerialDescriptor descriptor = getDescriptor();
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
            KSerializer[] kSerializerArrAccess$get$childSerializers$cp = ResponseFaceAuthentication.access$get$childSerializers$cp();
            FaceAuthenticationOverallStatus faceAuthenticationOverallStatus2 = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                int i4 = f9140d + 117;
                f9138b = i4 % 128;
                int i5 = i4 % 2;
                faceAuthenticationOverallStatus = (FaceAuthenticationOverallStatus) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, kSerializerArrAccess$get$childSerializers$cp[0], null);
                num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, IntSerializer.INSTANCE, null);
                str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, StringSerializer.INSTANCE, null);
                faceAuthenticationException = (FaceAuthenticationException) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, FaceAuthenticationException.a.f5021d, null);
                i2 = 15;
            } else {
                i2 = 0;
                boolean z2 = true;
                num = null;
                str = null;
                faceAuthenticationException = null;
                while (z2) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                    if (iDecodeElementIndex == -1) {
                        z2 = false;
                    } else if (iDecodeElementIndex == 0) {
                        faceAuthenticationOverallStatus2 = (FaceAuthenticationOverallStatus) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, kSerializerArrAccess$get$childSerializers$cp[0], faceAuthenticationOverallStatus2);
                        i2 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, IntSerializer.INSTANCE, num);
                        i2 |= 2;
                        int i6 = f9138b + 63;
                        f9140d = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i7 = 2 / 2;
                        }
                    } else if (iDecodeElementIndex == 2) {
                        str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, StringSerializer.INSTANCE, str);
                        i2 |= 4;
                    } else {
                        if (iDecodeElementIndex != 3) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        faceAuthenticationException = (FaceAuthenticationException) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, FaceAuthenticationException.a.f5021d, faceAuthenticationException);
                        i2 |= 8;
                    }
                }
                faceAuthenticationOverallStatus = faceAuthenticationOverallStatus2;
            }
            compositeDecoderBeginStructure.endStructure(descriptor);
            return new ResponseFaceAuthentication(i2, faceAuthenticationOverallStatus, num, str, faceAuthenticationException, (SerializationConstructorMarker) null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            int i2 = 2 % 2;
            int i3 = f9140d + 49;
            f9138b = i3 % 128;
            int i4 = i3 % 2;
            KSerializer<?>[] kSerializerArr = {ResponseFaceAuthentication.access$get$childSerializers$cp()[0], BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(FaceAuthenticationException.a.f5021d)};
            int i5 = f9138b + 109;
            f9140d = i5 % 128;
            int i6 = i5 % 2;
            return kSerializerArr;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public final /* synthetic */ Object deserialize(Decoder decoder) {
            int i2 = 2 % 2;
            int i3 = f9140d + 109;
            f9138b = i3 % 128;
            int i4 = i3 % 2;
            ResponseFaceAuthentication responseFaceAuthenticationD = d(decoder);
            int i5 = f9140d + 1;
            f9138b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 64 / 0;
            }
            return responseFaceAuthenticationD;
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            int i2 = 2 % 2;
            int i3 = f9140d;
            int i4 = i3 + 65;
            f9138b = i4 % 128;
            int i5 = i4 % 2;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f9137a;
            int i6 = i3 + 31;
            f9138b = i6 % 128;
            int i7 = i6 % 2;
            return pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final /* synthetic */ void serialize(Encoder encoder, Object obj) {
            int i2 = 2 % 2;
            int i3 = f9138b + 109;
            f9140d = i3 % 128;
            int i4 = i3 % 2;
            a(encoder, (ResponseFaceAuthentication) obj);
            if (i4 != 0) {
                int i5 = 98 / 0;
            }
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] typeParametersSerializers() {
            int i2 = 2 % 2;
            int i3 = f9140d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f9138b = i3 % 128;
            int i4 = i3 % 2;
            KSerializer<?>[] kSerializerArrTypeParametersSerializers = GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            int i5 = f9138b + 51;
            f9140d = i5 % 128;
            int i6 = i5 % 2;
            return kSerializerArrTypeParametersSerializers;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ ResponseFaceAuthentication(int i2, @SerialName("overallStatus") FaceAuthenticationOverallStatus faceAuthenticationOverallStatus, Integer num, String str, FaceAuthenticationException faceAuthenticationException, SerializationConstructorMarker serializationConstructorMarker) {
        this.overallStatusString = (i2 & 1) == 0 ? FaceAuthenticationOverallStatus.UNKNOWN : faceAuthenticationOverallStatus;
        if ((i2 & 2) == 0) {
            this.captureAttemptsLimit = null;
        } else {
            this.captureAttemptsLimit = num;
        }
        if ((i2 & 4) == 0) {
            this.candidate = null;
        } else {
            this.candidate = str;
        }
        if ((i2 & 8) == 0) {
            this.error = null;
        } else {
            this.error = faceAuthenticationException;
        }
    }

    public ResponseFaceAuthentication(FaceAuthenticationOverallStatus faceAuthenticationOverallStatus, Integer num, String str, FaceAuthenticationException faceAuthenticationException) {
        Intrinsics.checkNotNullParameter(faceAuthenticationOverallStatus, "");
        this.overallStatusString = faceAuthenticationOverallStatus;
        this.captureAttemptsLimit = num;
        this.candidate = str;
        this.error = faceAuthenticationException;
    }

    public static final /* synthetic */ KSerializer[] access$get$childSerializers$cp() {
        int i2 = 2 % 2;
        int i3 = f9132b + 117;
        f9131a = i3 % 128;
        int i4 = i3 % 2;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (i4 == 0) {
            int i5 = 98 / 0;
        }
        return kSerializerArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void write$Self$onboard_release(com.incode.welcome_sdk.data.remote.beans.ResponseFaceAuthentication r6, kotlinx.serialization.encoding.CompositeEncoder r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r3 = 2
            int r0 = r3 % r3
            kotlinx.serialization.KSerializer<java.lang.Object>[] r5 = com.incode.welcome_sdk.data.remote.beans.ResponseFaceAuthentication.$childSerializers
            r2 = 0
            boolean r0 = r7.shouldEncodeElementDefault(r8, r2)
            r4 = 1
            if (r0 == 0) goto Lb9
            int r0 = com.incode.welcome_sdk.data.remote.beans.ResponseFaceAuthentication.f9132b
            int r1 = r0 + 87
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.remote.beans.ResponseFaceAuthentication.f9131a = r0
            int r1 = r1 % r3
        L16:
            r0 = r4
        L17:
            r0 = r0 ^ r4
            if (r0 == r4) goto L2e
            int r0 = com.incode.welcome_sdk.data.remote.beans.ResponseFaceAuthentication.f9132b
            int r1 = r0 + 101
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.remote.beans.ResponseFaceAuthentication.f9131a = r0
            int r1 = r1 % r3
            if (r1 != 0) goto Lae
            r1 = r5[r4]
            kotlinx.serialization.SerializationStrategy r1 = (kotlinx.serialization.SerializationStrategy) r1
            com.incode.welcome_sdk.data.remote.beans.FaceAuthenticationOverallStatus r0 = r6.overallStatusString
            r7.encodeSerializableElement(r8, r4, r1, r0)
        L2e:
            boolean r0 = r7.shouldEncodeElementDefault(r8, r4)
            if (r0 == 0) goto L99
        L34:
            kotlinx.serialization.internal.IntSerializer r1 = kotlinx.serialization.internal.IntSerializer.INSTANCE
            kotlinx.serialization.SerializationStrategy r1 = (kotlinx.serialization.SerializationStrategy) r1
            java.lang.Integer r0 = r6.captureAttemptsLimit
            r7.encodeNullableSerializableElement(r8, r4, r1, r0)
        L3d:
            boolean r0 = r7.shouldEncodeElementDefault(r8, r3)
            if (r0 == 0) goto L8a
            int r0 = com.incode.welcome_sdk.data.remote.beans.ResponseFaceAuthentication.f9131a
            int r1 = r0 + 57
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.remote.beans.ResponseFaceAuthentication.f9132b = r0
            int r1 = r1 % r3
        L4c:
            r2 = r4
        L4d:
            r0 = r2 ^ 1
            if (r0 == r4) goto L63
            int r0 = com.incode.welcome_sdk.data.remote.beans.ResponseFaceAuthentication.f9132b
            int r1 = r0 + 75
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.remote.beans.ResponseFaceAuthentication.f9131a = r0
            int r1 = r1 % r3
            kotlinx.serialization.internal.StringSerializer r1 = kotlinx.serialization.internal.StringSerializer.INSTANCE
            kotlinx.serialization.SerializationStrategy r1 = (kotlinx.serialization.SerializationStrategy) r1
            java.lang.String r0 = r6.candidate
            r7.encodeNullableSerializableElement(r8, r3, r1, r0)
        L63:
            r2 = 3
            boolean r0 = r7.shouldEncodeElementDefault(r8, r2)
            if (r0 != 0) goto L80
            com.incode.welcome_sdk.commons.exceptions.FaceAuthenticationException r0 = r6.error
            if (r0 == 0) goto L7f
        L6e:
            int r1 = com.incode.welcome_sdk.data.remote.beans.ResponseFaceAuthentication.f9131a
            int r1 = r1 + r4
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.remote.beans.ResponseFaceAuthentication.f9132b = r0
            int r1 = r1 % r3
            com.incode.welcome_sdk.commons.exceptions.FaceAuthenticationException$a r1 = com.incode.welcome_sdk.commons.exceptions.FaceAuthenticationException.a.f5021d
            kotlinx.serialization.SerializationStrategy r1 = (kotlinx.serialization.SerializationStrategy) r1
            com.incode.welcome_sdk.commons.exceptions.FaceAuthenticationException r0 = r6.error
            r7.encodeNullableSerializableElement(r8, r2, r1, r0)
        L7f:
            return
        L80:
            int r0 = com.incode.welcome_sdk.data.remote.beans.ResponseFaceAuthentication.f9131a
            int r1 = r0 + 109
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.remote.beans.ResponseFaceAuthentication.f9132b = r0
            int r1 = r1 % r3
            goto L6e
        L8a:
            java.lang.String r0 = r6.candidate
            if (r0 == 0) goto L8f
            goto L4c
        L8f:
            int r0 = com.incode.welcome_sdk.data.remote.beans.ResponseFaceAuthentication.f9131a
            int r1 = r0 + 27
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.remote.beans.ResponseFaceAuthentication.f9132b = r0
            int r1 = r1 % r3
            goto L4d
        L99:
            java.lang.Integer r0 = r6.captureAttemptsLimit
            if (r0 == 0) goto L3d
            int r5 = com.incode.welcome_sdk.data.remote.beans.ResponseFaceAuthentication.f9132b
            int r1 = r5 + 67
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.remote.beans.ResponseFaceAuthentication.f9131a = r0
            int r1 = r1 % r3
            int r1 = r5 + 91
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.remote.beans.ResponseFaceAuthentication.f9131a = r0
            int r1 = r1 % r3
            goto L34
        Lae:
            r1 = r5[r2]
            kotlinx.serialization.SerializationStrategy r1 = (kotlinx.serialization.SerializationStrategy) r1
            com.incode.welcome_sdk.data.remote.beans.FaceAuthenticationOverallStatus r0 = r6.overallStatusString
            r7.encodeSerializableElement(r8, r2, r1, r0)
            goto L2e
        Lb9:
            com.incode.welcome_sdk.data.remote.beans.FaceAuthenticationOverallStatus r1 = r6.overallStatusString
            com.incode.welcome_sdk.data.remote.beans.FaceAuthenticationOverallStatus r0 = com.incode.welcome_sdk.data.remote.beans.FaceAuthenticationOverallStatus.UNKNOWN
            if (r1 == r0) goto Lc1
            goto L16
        Lc1:
            r0 = r2
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.remote.beans.ResponseFaceAuthentication.write$Self$onboard_release(com.incode.welcome_sdk.data.remote.beans.ResponseFaceAuthentication, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public /* synthetic */ ResponseFaceAuthentication(FaceAuthenticationOverallStatus faceAuthenticationOverallStatus, Integer num, String str, FaceAuthenticationException faceAuthenticationException, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? FaceAuthenticationOverallStatus.UNKNOWN : faceAuthenticationOverallStatus, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : faceAuthenticationException);
    }

    public final FaceAuthenticationOverallStatus getOverallStatusString() {
        int i2 = 2 % 2;
        int i3 = f9131a;
        int i4 = i3 + 9;
        f9132b = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        FaceAuthenticationOverallStatus faceAuthenticationOverallStatus = this.overallStatusString;
        int i5 = i3 + 49;
        f9132b = i5 % 128;
        if (i5 % 2 == 0) {
            return faceAuthenticationOverallStatus;
        }
        throw null;
    }

    public final Integer getCaptureAttemptsLimit() {
        int i2 = 2 % 2;
        int i3 = f9131a + 65;
        f9132b = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.captureAttemptsLimit;
        if (i4 != 0) {
            int i5 = 60 / 0;
        }
        return num;
    }

    public final String getCandidate() {
        int i2 = 2 % 2;
        int i3 = f9132b;
        int i4 = i3 + 21;
        f9131a = i4 % 128;
        int i5 = i4 % 2;
        String str = this.candidate;
        int i6 = i3 + 13;
        f9131a = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final FaceAuthenticationException getError() {
        int i2 = 2 % 2;
        int i3 = f9132b + 65;
        f9131a = i3 % 128;
        int i4 = i3 % 2;
        FaceAuthenticationException faceAuthenticationException = this.error;
        if (i4 == 0) {
            int i5 = 39 / 0;
        }
        return faceAuthenticationException;
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f9135a = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f9136e = 1;

        private d() {
        }

        public final KSerializer<ResponseFaceAuthentication> serializer() {
            int i2 = 2 % 2;
            int i3 = f9136e + 73;
            f9135a = i3 % 128;
            int i4 = i3 % 2;
            e eVar = e.f9141e;
            if (i4 == 0) {
                return eVar;
            }
            throw null;
        }

        public static ResponseFaceAuthentication a() {
            int i2 = 2 % 2;
            FaceAuthenticationOverallStatus faceAuthenticationOverallStatus = FaceAuthenticationOverallStatus.FAIL;
            FaceAuthenticationException.b bVar = FaceAuthenticationException.Companion;
            ResponseFaceAuthentication responseFaceAuthentication = new ResponseFaceAuthentication(faceAuthenticationOverallStatus, (Integer) null, (String) null, FaceAuthenticationException.b.a(), 6, (DefaultConstructorMarker) null);
            int i3 = f9135a + 117;
            f9136e = i3 % 128;
            if (i3 % 2 != 0) {
                return responseFaceAuthentication;
            }
            throw null;
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    static {
        int i2 = f9134e + 123;
        f9133c = i2 % 128;
        int i3 = i2 % 2;
    }

    public ResponseFaceAuthentication() {
        this((FaceAuthenticationOverallStatus) null, (Integer) null, (String) null, (FaceAuthenticationException) null, 15, (DefaultConstructorMarker) null);
    }

    @SerialName("overallStatus")
    public static /* synthetic */ void getOverallStatusString$annotations() {
        int i2 = 2 % 2;
        int i3 = f9131a + 61;
        f9132b = i3 % 128;
        int i4 = i3 % 2;
    }
}
