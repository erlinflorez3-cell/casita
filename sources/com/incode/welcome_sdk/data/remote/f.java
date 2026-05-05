package com.incode.welcome_sdk.data.remote;

import android.os.Build;
import androidx.compose.ui.layout.LayoutKt;
import com.incode.welcome_sdk.data.remote.a;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static int f10148p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f10149q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f10150r = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static int f10152u = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Float> f10153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f10154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f10155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f10156d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f10157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f10158g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f10159h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f10160i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f10161j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f10162k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f10163l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f10164m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f10165n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f10166o;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f10167t;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static d f10147e = new d(0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final KSerializer<Object>[] f10151s = {null, new LinkedHashMapSerializer(StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(FloatSerializer.INSTANCE)), null, null, null, null, null, null, null, null, null, null, null, null, null};

    public static final class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10168c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10169d = 0;

        private d() {
        }

        public final KSerializer<f> serializer() {
            int i2 = 2 % 2;
            int i3 = f10168c + 113;
            f10169d = i3 % 128;
            int i4 = i3 % 2;
            e eVar = e.f10170a;
            if (i4 == 0) {
                return eVar;
            }
            throw null;
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final class e implements GeneratedSerializer<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f10170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ PluginGeneratedSerialDescriptor f10171b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10172c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10173d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10174e = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f10175j = 1;

        static {
            e eVar = new e();
            f10170a = eVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.incode.welcome_sdk.data.remote.SyncLivenessStatRequestBody", eVar, 15);
            pluginGeneratedSerialDescriptor.addElement("base64Frame", false);
            pluginGeneratedSerialDescriptor.addElement("coordinates", false);
            pluginGeneratedSerialDescriptor.addElement("frameSize", false);
            pluginGeneratedSerialDescriptor.addElement("recognitionConfidence", false);
            pluginGeneratedSerialDescriptor.addElement("livenessConfidence", false);
            pluginGeneratedSerialDescriptor.addElement("clientRecognitionThreshold", false);
            pluginGeneratedSerialDescriptor.addElement("clientLivenessThreshold", false);
            pluginGeneratedSerialDescriptor.addElement("brightness", false);
            pluginGeneratedSerialDescriptor.addElement("blurriness", false);
            pluginGeneratedSerialDescriptor.addElement("authenticationType", false);
            pluginGeneratedSerialDescriptor.addElement("userId", false);
            pluginGeneratedSerialDescriptor.addElement("authenticationMethod", false);
            pluginGeneratedSerialDescriptor.addElement("deviceType", true);
            pluginGeneratedSerialDescriptor.addElement("deviceName", true);
            pluginGeneratedSerialDescriptor.addElement("version", true);
            f10171b = pluginGeneratedSerialDescriptor;
            int i2 = f10174e + 101;
            f10175j = i2 % 128;
            int i3 = i2 % 2;
        }

        private e() {
        }

        private void d(Encoder encoder, f fVar) {
            int i2 = 2 % 2;
            int i3 = f10173d + 115;
            f10172c = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(encoder, "");
                Intrinsics.checkNotNullParameter(fVar, "");
                SerialDescriptor descriptor = getDescriptor();
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
                f.a(fVar, compositeEncoderBeginStructure, descriptor);
                compositeEncoderBeginStructure.endStructure(descriptor);
                return;
            }
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(fVar, "");
            SerialDescriptor descriptor2 = getDescriptor();
            CompositeEncoder compositeEncoderBeginStructure2 = encoder.beginStructure(descriptor2);
            f.a(fVar, compositeEncoderBeginStructure2, descriptor2);
            compositeEncoderBeginStructure2.endStructure(descriptor2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private f e(Decoder decoder) {
            float fDecodeFloatElement;
            float fDecodeFloatElement2;
            float fDecodeFloatElement3;
            float fDecodeFloatElement4;
            float fDecodeFloatElement5;
            String strDecodeStringElement;
            a aVar;
            String strDecodeStringElement2;
            String strDecodeStringElement3;
            String strDecodeStringElement4;
            String strDecodeStringElement5;
            int iDecodeIntElement;
            Map map;
            float fDecodeFloatElement6;
            int i2 = 2;
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(decoder, "");
            SerialDescriptor descriptor = getDescriptor();
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
            KSerializer[] kSerializerArrA = f.a();
            int i4 = 10;
            int i5 = 0;
            boolean z2 = true;
            String str = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 0);
                map = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, kSerializerArrA[1], null);
                aVar = (a) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 2, a.d.f8970b, null);
                fDecodeFloatElement = compositeDecoderBeginStructure.decodeFloatElement(descriptor, 3);
                fDecodeFloatElement6 = compositeDecoderBeginStructure.decodeFloatElement(descriptor, 4);
                fDecodeFloatElement2 = compositeDecoderBeginStructure.decodeFloatElement(descriptor, 5);
                fDecodeFloatElement4 = compositeDecoderBeginStructure.decodeFloatElement(descriptor, 6);
                fDecodeFloatElement3 = compositeDecoderBeginStructure.decodeFloatElement(descriptor, 7);
                fDecodeFloatElement5 = compositeDecoderBeginStructure.decodeFloatElement(descriptor, 8);
                strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 9);
                str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 10, StringSerializer.INSTANCE, null);
                strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 11);
                strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 12);
                strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 13);
                iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor, 14);
                i5 = LayoutKt.LargeDimension;
            } else {
                fDecodeFloatElement = 0.0f;
                fDecodeFloatElement2 = 0.0f;
                fDecodeFloatElement3 = 0.0f;
                fDecodeFloatElement4 = 0.0f;
                fDecodeFloatElement5 = 0.0f;
                boolean z3 = true;
                strDecodeStringElement = null;
                aVar = null;
                strDecodeStringElement2 = null;
                strDecodeStringElement3 = null;
                strDecodeStringElement4 = null;
                strDecodeStringElement5 = null;
                iDecodeIntElement = 0;
                map = null;
                fDecodeFloatElement6 = 0.0f;
                while (z3 == z2) {
                    int i6 = f10173d + 91;
                    f10172c = i6 % 128;
                    int i7 = i6 % i2;
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                    switch (iDecodeElementIndex) {
                        case -1:
                            z3 = false;
                            z2 = true;
                            i2 = 2;
                            i4 = 10;
                            break;
                        case 0:
                            z2 = true;
                            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 0);
                            i5 |= 1;
                            i2 = 2;
                            i4 = 10;
                            break;
                        case 1:
                            z2 = true;
                            map = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, kSerializerArrA[1], map);
                            i5 |= 2;
                            i2 = 2;
                            i4 = 10;
                            break;
                        case 2:
                            aVar = (a) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, i2, a.d.f8970b, aVar);
                            i5 |= 4;
                            z2 = true;
                            i4 = 10;
                            break;
                        case 3:
                            fDecodeFloatElement = compositeDecoderBeginStructure.decodeFloatElement(descriptor, 3);
                            i5 |= 8;
                            z2 = true;
                            i4 = 10;
                            break;
                        case 4:
                            fDecodeFloatElement6 = compositeDecoderBeginStructure.decodeFloatElement(descriptor, 4);
                            i5 |= 16;
                            int i8 = f10173d + 79;
                            f10172c = i8 % 128;
                            int i9 = i8 % i2;
                            z2 = true;
                            i4 = 10;
                            break;
                        case 5:
                            fDecodeFloatElement2 = compositeDecoderBeginStructure.decodeFloatElement(descriptor, 5);
                            i5 |= 32;
                            z2 = true;
                            i4 = 10;
                            break;
                        case 6:
                            fDecodeFloatElement4 = compositeDecoderBeginStructure.decodeFloatElement(descriptor, 6);
                            i5 |= 64;
                            z2 = true;
                            break;
                        case 7:
                            fDecodeFloatElement3 = compositeDecoderBeginStructure.decodeFloatElement(descriptor, 7);
                            i5 |= 128;
                            z2 = true;
                            break;
                        case 8:
                            fDecodeFloatElement5 = compositeDecoderBeginStructure.decodeFloatElement(descriptor, 8);
                            i5 |= 256;
                            z2 = true;
                            break;
                        case 9:
                            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 9);
                            i5 |= 512;
                            z2 = true;
                            break;
                        case 10:
                            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i4, StringSerializer.INSTANCE, str);
                            i5 |= 1024;
                            z2 = true;
                            break;
                        case 11:
                            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 11);
                            i5 |= 2048;
                            z2 = true;
                            break;
                        case 12:
                            strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 12);
                            i5 |= 4096;
                            z2 = true;
                            break;
                        case 13:
                            strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 13);
                            i5 |= 8192;
                            z2 = true;
                            break;
                        case 14:
                            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor, 14);
                            i5 |= 16384;
                            z2 = true;
                            break;
                        default:
                            throw new UnknownFieldException(iDecodeElementIndex);
                    }
                }
            }
            compositeDecoderBeginStructure.endStructure(descriptor);
            return new f(i5, strDecodeStringElement, map, aVar, fDecodeFloatElement, fDecodeFloatElement6, fDecodeFloatElement2, fDecodeFloatElement4, fDecodeFloatElement3, fDecodeFloatElement5, strDecodeStringElement2, str, strDecodeStringElement3, strDecodeStringElement4, strDecodeStringElement5, iDecodeIntElement);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            int i2 = 2 % 2;
            int i3 = f10172c + 87;
            f10173d = i3 % 128;
            int i4 = i3 % 2;
            KSerializer<?>[] kSerializerArr = {StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(f.a()[1]), a.d.f8970b, FloatSerializer.INSTANCE, FloatSerializer.INSTANCE, FloatSerializer.INSTANCE, FloatSerializer.INSTANCE, FloatSerializer.INSTANCE, FloatSerializer.INSTANCE, StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, IntSerializer.INSTANCE};
            int i5 = f10173d + 73;
            f10172c = i5 % 128;
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
            int i3 = f10172c + 63;
            f10173d = i3 % 128;
            int i4 = i3 % 2;
            f fVarE = e(decoder);
            int i5 = f10172c + 41;
            f10173d = i5 % 128;
            int i6 = i5 % 2;
            return fVarE;
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            int i2 = 2 % 2;
            int i3 = f10173d + 35;
            f10172c = i3 % 128;
            int i4 = i3 % 2;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10171b;
            if (i4 != 0) {
                int i5 = 38 / 0;
            }
            return pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final /* synthetic */ void serialize(Encoder encoder, Object obj) {
            int i2 = 2 % 2;
            int i3 = f10172c + 101;
            f10173d = i3 % 128;
            int i4 = i3 % 2;
            d(encoder, (f) obj);
            if (i4 == 0) {
                int i5 = 63 / 0;
            }
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] typeParametersSerializers() {
            int i2 = 2 % 2;
            int i3 = f10172c + 13;
            f10173d = i3 % 128;
            int i4 = i3 % 2;
            KSerializer<?>[] kSerializerArrTypeParametersSerializers = GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            int i5 = f10173d + 19;
            f10172c = i5 % 128;
            int i6 = i5 % 2;
            return kSerializerArrTypeParametersSerializers;
        }
    }

    static {
        int i2 = f10152u + 29;
        f10149q = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 94 / 0;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ f(int i2, String str, Map map, a aVar, float f2, float f3, float f4, float f5, float f6, float f7, String str2, String str3, String str4, String str5, String str6, int i3) {
        int i4 = i3;
        String str7 = str6;
        String str8 = str5;
        if (4095 != (i2 & 4095)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 4095, e.f10170a.getDescriptor());
        }
        this.f10155c = str;
        this.f10153a = map;
        this.f10154b = aVar;
        this.f10156d = f2;
        this.f10160i = f3;
        this.f10161j = f4;
        this.f10157f = f5;
        this.f10159h = f6;
        this.f10158g = f7;
        this.f10166o = str2;
        this.f10163l = str3;
        this.f10164m = str4;
        this.f10162k = (i2 & 4096) == 0 ? "ANDROID" : str8;
        if ((i2 & 8192) == 0) {
            str7 = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(str7, "");
        }
        this.f10165n = str7;
        this.f10167t = (i2 & 16384) == 0 ? Build.VERSION.SDK_INT : i4;
    }

    private f(String str, Map<String, Float> map, a aVar, float f2, float f3, float f4, float f5, float f6, float f7, String str2, String str3, String str4, String str5, String str6, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aVar, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.f10155c = str;
        this.f10153a = map;
        this.f10154b = aVar;
        this.f10156d = f2;
        this.f10160i = f3;
        this.f10161j = f4;
        this.f10157f = f5;
        this.f10159h = f6;
        this.f10158g = f7;
        this.f10166o = str2;
        this.f10163l = str3;
        this.f10164m = str4;
        this.f10162k = str5;
        this.f10165n = str6;
        this.f10167t = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007a  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void a(com.incode.welcome_sdk.data.remote.f r5, kotlinx.serialization.encoding.CompositeEncoder r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.remote.f.a(com.incode.welcome_sdk.data.remote.f, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public static final /* synthetic */ KSerializer[] a() {
        int i2 = 2 % 2;
        int i3 = f10148p + 1;
        f10150r = i3 % 128;
        if (i3 % 2 == 0) {
            return f10151s;
        }
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ f(String str, Map map, a aVar, float f2, float f3, float f4, float f5, float f6, float f7, String str2, String str3, String str4) {
        String str5 = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(str5, "");
        this(str, map, aVar, f2, f3, f4, f5, f6, f7, str2, str3, str4, "ANDROID", str5, Build.VERSION.SDK_INT);
    }

    public final String e(Json json) {
        int i2 = 2 % 2;
        int i3 = f10148p + 117;
        f10150r = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(json, "");
        Json json2 = json;
        json2.getSerializersModule();
        String strEncodeToString = json2.encodeToString(f10147e.serializer(), this);
        int i5 = f10148p + 61;
        f10150r = i5 % 128;
        int i6 = i5 % 2;
        return strEncodeToString;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!Intrinsics.areEqual(this.f10155c, fVar.f10155c)) {
            int i3 = f10148p + 65;
            f10150r = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.f10153a, fVar.f10153a)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f10154b, fVar.f10154b)) {
            int i5 = f10148p + 25;
            int i6 = i5 % 128;
            f10150r = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 81;
            f10148p = i8 % 128;
            if (i8 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (Float.compare(this.f10156d, fVar.f10156d) != 0) {
            int i9 = f10150r + 19;
            f10148p = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (Float.compare(this.f10160i, fVar.f10160i) != 0) {
            return false;
        }
        if (Float.compare(this.f10161j, fVar.f10161j) != 0) {
            int i11 = f10150r + 99;
            f10148p = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (Float.compare(this.f10157f, fVar.f10157f) != 0) {
            return false;
        }
        if (Float.compare(this.f10159h, fVar.f10159h) != 0) {
            int i13 = f10150r + 41;
            f10148p = i13 % 128;
            return i13 % 2 == 0;
        }
        if (Float.compare(this.f10158g, fVar.f10158g) != 0) {
            int i14 = f10148p + 41;
            f10150r = i14 % 128;
            return i14 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.f10166o, fVar.f10166o)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f10163l, fVar.f10163l)) {
            int i15 = f10148p + 29;
            f10150r = i15 % 128;
            int i16 = i15 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.f10164m, fVar.f10164m) || !Intrinsics.areEqual(this.f10162k, fVar.f10162k) || !Intrinsics.areEqual(this.f10165n, fVar.f10165n)) {
            return false;
        }
        if (this.f10167t == fVar.f10167t) {
            return true;
        }
        int i17 = f10150r + 103;
        f10148p = i17 % 128;
        return i17 % 2 == 0;
    }

    public final int hashCode() {
        int iHashCode;
        int i2 = 2 % 2;
        int iHashCode2 = this.f10155c.hashCode() * 31;
        Map<String, Float> map = this.f10153a;
        int iHashCode3 = 0;
        if (map == null) {
            int i3 = f10148p + 103;
            f10150r = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = map.hashCode();
        }
        int iHashCode4 = (((((((((((((((((iHashCode2 + iHashCode) * 31) + this.f10154b.hashCode()) * 31) + Float.hashCode(this.f10156d)) * 31) + Float.hashCode(this.f10160i)) * 31) + Float.hashCode(this.f10161j)) * 31) + Float.hashCode(this.f10157f)) * 31) + Float.hashCode(this.f10159h)) * 31) + Float.hashCode(this.f10158g)) * 31) + this.f10166o.hashCode()) * 31;
        String str = this.f10163l;
        if (str == null) {
            int i5 = f10150r + 95;
            f10148p = i5 % 128;
            if (i5 % 2 == 0) {
                iHashCode3 = 1;
            }
        } else {
            iHashCode3 = str.hashCode();
        }
        return ((((((((iHashCode4 + iHashCode3) * 31) + this.f10164m.hashCode()) * 31) + this.f10162k.hashCode()) * 31) + this.f10165n.hashCode()) * 31) + Integer.hashCode(this.f10167t);
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f10148p + 29;
        f10150r = i3 % 128;
        int i4 = i3 % 2;
        String str = "SyncLivenessStatRequestBody(base64Frame=" + this.f10155c + ", coordinates=" + this.f10153a + ", frameSize=" + this.f10154b + ", recognitionConfidence=" + this.f10156d + ", livenessConfidence=" + this.f10160i + ", clientRecognitionThreshold=" + this.f10161j + ", clientLivenessThreshold=" + this.f10157f + ", brightness=" + this.f10159h + ", blurriness=" + this.f10158g + ", authenticationType=" + this.f10166o + ", userId=" + this.f10163l + ", authenticationMethod=" + this.f10164m + ", deviceType=" + this.f10162k + ", deviceName=" + this.f10165n + ", version=" + this.f10167t + ")";
        int i5 = f10148p + 19;
        f10150r = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
