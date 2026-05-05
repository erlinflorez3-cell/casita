package com.incode.welcome_sdk.data.remote.beans;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
import com.incode.welcome_sdk.CameraFacing;
import com.incode.welcome_sdk.data.DeviceFingerprint;
import com.incode.welcome_sdk.results.Status;
import io.sentry.protocol.Device;
import io.sentry.protocol.OperatingSystem;
import java.util.Calendar;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes5.dex */
@InternalSerializationApi
@Serializable
public final class s {

    /* JADX INFO: renamed from: a */
    private static g f9933a = new g((byte) 0);

    /* JADX INFO: renamed from: h */
    private static final Json f9934h = ((com.incode.welcome_sdk.commons.utils.x) com.incode.welcome_sdk.e.b.a((Class<?>) com.incode.welcome_sdk.commons.utils.x.class)).b();

    /* JADX INFO: renamed from: k */
    private static int f9935k = 1;

    /* JADX INFO: renamed from: m */
    private static int f9936m = 0;

    /* JADX INFO: renamed from: n */
    private static int f9937n = 0;

    /* JADX INFO: renamed from: o */
    private static int f9938o = 1;

    /* JADX INFO: renamed from: b */
    private final String f9939b;

    /* JADX INFO: renamed from: c */
    private final long f9940c;

    /* JADX INFO: renamed from: d */
    private final i f9941d;

    /* JADX INFO: renamed from: e */
    private final String f9942e;

    /* JADX INFO: renamed from: f */
    private final e f9943f;

    /* JADX INFO: renamed from: g */
    private final String f9944g;

    /* JADX INFO: renamed from: i */
    private final d f9945i;

    /* JADX INFO: renamed from: j */
    private final j f9946j;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final class c implements GeneratedSerializer<s> {

        /* JADX INFO: renamed from: a */
        private static int f9971a = 0;

        /* JADX INFO: renamed from: b */
        private static int f9972b = 1;

        /* JADX INFO: renamed from: c */
        public static final c f9973c;

        /* JADX INFO: renamed from: d */
        private static int f9974d = 0;

        /* JADX INFO: renamed from: e */
        private static final /* synthetic */ PluginGeneratedSerialDescriptor f9975e;

        /* JADX INFO: renamed from: i */
        private static int f9976i = 1;

        static {
            c cVar = new c();
            f9973c = cVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.incode.welcome_sdk.data.remote.beans.Metadata", cVar, 8);
            pluginGeneratedSerialDescriptor.addElement("timestamp", true);
            pluginGeneratedSerialDescriptor.addElement("sdkPlatform", true);
            pluginGeneratedSerialDescriptor.addElement("sdkVersion", true);
            pluginGeneratedSerialDescriptor.addElement(Device.TYPE, false);
            pluginGeneratedSerialDescriptor.addElement("camera", false);
            pluginGeneratedSerialDescriptor.addElement("iad", false);
            pluginGeneratedSerialDescriptor.addElement("behavior", false);
            pluginGeneratedSerialDescriptor.addElement("captureMode", false);
            f9975e = pluginGeneratedSerialDescriptor;
            int i2 = f9976i + 89;
            f9974d = i2 % 128;
            int i3 = i2 % 2;
        }

        private c() {
        }

        private void a(Encoder encoder, s sVar) {
            int i2 = 2 % 2;
            int i3 = f9971a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f9972b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(sVar, "");
            SerialDescriptor descriptor = getDescriptor();
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
            s.d(sVar, compositeEncoderBeginStructure, descriptor);
            compositeEncoderBeginStructure.endStructure(descriptor);
            int i5 = f9972b + 113;
            f9971a = i5 % 128;
            int i6 = i5 % 2;
        }

        private s b(Decoder decoder) {
            long jDecodeLongElement;
            String strDecodeStringElement;
            String strDecodeStringElement2;
            i iVar;
            d dVar;
            j jVar;
            e eVar;
            String str;
            int i2;
            int i3 = 2 % 2;
            int i4 = f9971a + 21;
            f9972b = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.checkNotNullParameter(decoder, "");
            SerialDescriptor descriptor = getDescriptor();
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
            int i6 = 7;
            String strDecodeStringElement3 = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(descriptor, 0);
                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 1);
                strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 2);
                iVar = (i) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 3, i.d.f10036a, null);
                dVar = (d) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 4, d.e.f9987c, null);
                jVar = (j) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 5, j.b.f10051c, null);
                eVar = (e) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 6, e.c.f9997a, null);
                str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 7, StringSerializer.INSTANCE, null);
                i2 = 255;
            } else {
                jDecodeLongElement = 0;
                strDecodeStringElement2 = null;
                str = null;
                jVar = null;
                eVar = null;
                i2 = 0;
                boolean z2 = true;
                iVar = null;
                dVar = null;
                while (z2) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                    switch (iDecodeElementIndex) {
                        case -1:
                            z2 = false;
                            break;
                        case 0:
                            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(descriptor, 0);
                            i2 |= 1;
                            break;
                        case 1:
                            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 1);
                            i2 |= 2;
                            break;
                        case 2:
                            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 2);
                            i2 |= 4;
                            break;
                        case 3:
                            iVar = (i) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 3, i.d.f10036a, iVar);
                            i2 |= 8;
                            break;
                        case 4:
                            dVar = (d) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 4, d.e.f9987c, dVar);
                            i2 |= 16;
                            int i7 = f9972b + 53;
                            f9971a = i7 % 128;
                            int i8 = i7 % 2;
                            break;
                        case 5:
                            jVar = (j) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 5, j.b.f10051c, jVar);
                            i2 |= 32;
                            continue;
                        case 6:
                            eVar = (e) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 6, e.c.f9997a, eVar);
                            i2 |= 64;
                            continue;
                        case 7:
                            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i6, StringSerializer.INSTANCE, str);
                            i2 |= 128;
                            continue;
                        default:
                            throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    i6 = 7;
                }
                strDecodeStringElement = strDecodeStringElement3;
            }
            compositeDecoderBeginStructure.endStructure(descriptor);
            return new s(i2, jDecodeLongElement, strDecodeStringElement, strDecodeStringElement2, iVar, dVar, jVar, eVar, str);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            int i2 = 2 % 2;
            int i3 = f9972b + 67;
            f9971a = i3 % 128;
            int i4 = i3 % 2;
            KSerializer<?>[] kSerializerArr = {LongSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, i.d.f10036a, d.e.f9987c, j.b.f10051c, e.c.f9997a, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)};
            int i5 = f9972b + 33;
            f9971a = i5 % 128;
            int i6 = i5 % 2;
            return kSerializerArr;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public final /* synthetic */ Object deserialize(Decoder decoder) {
            int i2 = 2 % 2;
            int i3 = f9972b + 11;
            f9971a = i3 % 128;
            int i4 = i3 % 2;
            s sVarB = b(decoder);
            int i5 = f9972b + 101;
            f9971a = i5 % 128;
            int i6 = i5 % 2;
            return sVarB;
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            int i2 = 2 % 2;
            int i3 = f9972b + 69;
            f9971a = i3 % 128;
            int i4 = i3 % 2;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f9975e;
            if (i4 != 0) {
                int i5 = 44 / 0;
            }
            return pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final /* synthetic */ void serialize(Encoder encoder, Object obj) {
            int i2 = 2 % 2;
            int i3 = f9972b + 11;
            f9971a = i3 % 128;
            int i4 = i3 % 2;
            a(encoder, (s) obj);
            if (i4 != 0) {
                throw null;
            }
            int i5 = f9972b + 101;
            f9971a = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] typeParametersSerializers() {
            int i2 = 2 % 2;
            int i3 = f9972b + 79;
            f9971a = i3 % 128;
            int i4 = i3 % 2;
            KSerializer<?>[] kSerializerArrTypeParametersSerializers = GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            int i5 = f9972b + 95;
            f9971a = i5 % 128;
            int i6 = i5 % 2;
            return kSerializerArrTypeParametersSerializers;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ s(int i2, long j2, String str, String str2, i iVar, d dVar, j jVar, e eVar, String str3) {
        if (248 != (i2 & 248)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 248, c.f9973c.getDescriptor());
        }
        this.f9940c = (i2 & 1) == 0 ? Calendar.getInstance().getTimeInMillis() : j2;
        if ((i2 & 2) == 0) {
            this.f9939b = "ANDROID";
        } else {
            this.f9939b = str;
        }
        if ((i2 & 4) == 0) {
            this.f9942e = "5.40.3";
        } else {
            this.f9942e = str2;
        }
        this.f9941d = iVar;
        this.f9945i = dVar;
        this.f9946j = jVar;
        this.f9943f = eVar;
        this.f9944g = str3;
    }

    private s(long j2, String str, String str2, i iVar, d dVar, j jVar, e eVar, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(iVar, "");
        Intrinsics.checkNotNullParameter(dVar, "");
        Intrinsics.checkNotNullParameter(jVar, "");
        Intrinsics.checkNotNullParameter(eVar, "");
        this.f9940c = j2;
        this.f9939b = str;
        this.f9942e = str2;
        this.f9941d = iVar;
        this.f9945i = dVar;
        this.f9946j = jVar;
        this.f9943f = eVar;
        this.f9944g = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0053  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void d(com.incode.welcome_sdk.data.remote.beans.s r8, kotlinx.serialization.encoding.CompositeEncoder r9, kotlinx.serialization.descriptors.SerialDescriptor r10) {
        /*
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.data.remote.beans.s.f9936m
            int r1 = r0 + 69
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.remote.beans.s.f9935k = r0
            int r1 = r1 % r2
            r7 = 0
            boolean r0 = r9.shouldEncodeElementDefault(r10, r7)
            if (r0 != 0) goto L21
            long r3 = r8.f9940c
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            long r5 = r0.getTimeInMillis()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L2f
        L21:
            int r0 = com.incode.welcome_sdk.data.remote.beans.s.f9935k
            int r1 = r0 + 83
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.remote.beans.s.f9936m = r0
            int r1 = r1 % r2
            long r0 = r8.f9940c
            r9.encodeLongElement(r10, r7, r0)
        L2f:
            r3 = 1
            boolean r0 = r9.shouldEncodeElementDefault(r10, r3)
            if (r0 == 0) goto L9f
            int r0 = com.incode.welcome_sdk.data.remote.beans.s.f9935k
            int r1 = r0 + 37
        L3a:
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.remote.beans.s.f9936m = r0
            int r1 = r1 % r2
            int r0 = com.incode.welcome_sdk.data.remote.beans.s.f9935k
            int r1 = r0 + 121
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.remote.beans.s.f9936m = r0
            int r1 = r1 % r2
            java.lang.String r0 = r8.f9939b
            r9.encodeStringElement(r10, r3, r0)
        L4d:
            boolean r0 = r9.shouldEncodeElementDefault(r10, r2)
            if (r0 == 0) goto L94
        L53:
            int r0 = com.incode.welcome_sdk.data.remote.beans.s.f9936m
            int r1 = r0 + 85
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.remote.beans.s.f9935k = r0
            int r1 = r1 % r2
            java.lang.String r0 = r8.f9942e
            r9.encodeStringElement(r10, r2, r0)
        L61:
            com.incode.welcome_sdk.data.remote.beans.s$i$d r2 = com.incode.welcome_sdk.data.remote.beans.s.i.d.f10036a
            kotlinx.serialization.SerializationStrategy r2 = (kotlinx.serialization.SerializationStrategy) r2
            com.incode.welcome_sdk.data.remote.beans.s$i r1 = r8.f9941d
            r0 = 3
            r9.encodeSerializableElement(r10, r0, r2, r1)
            com.incode.welcome_sdk.data.remote.beans.s$d$e r2 = com.incode.welcome_sdk.data.remote.beans.s.d.e.f9987c
            kotlinx.serialization.SerializationStrategy r2 = (kotlinx.serialization.SerializationStrategy) r2
            com.incode.welcome_sdk.data.remote.beans.s$d r1 = r8.f9945i
            r0 = 4
            r9.encodeSerializableElement(r10, r0, r2, r1)
            com.incode.welcome_sdk.data.remote.beans.s$j$b r2 = com.incode.welcome_sdk.data.remote.beans.s.j.b.f10051c
            kotlinx.serialization.SerializationStrategy r2 = (kotlinx.serialization.SerializationStrategy) r2
            com.incode.welcome_sdk.data.remote.beans.s$j r1 = r8.f9946j
            r0 = 5
            r9.encodeSerializableElement(r10, r0, r2, r1)
            com.incode.welcome_sdk.data.remote.beans.s$e$c r2 = com.incode.welcome_sdk.data.remote.beans.s.e.c.f9997a
            kotlinx.serialization.SerializationStrategy r2 = (kotlinx.serialization.SerializationStrategy) r2
            com.incode.welcome_sdk.data.remote.beans.s$e r1 = r8.f9943f
            r0 = 6
            r9.encodeSerializableElement(r10, r0, r2, r1)
            kotlinx.serialization.internal.StringSerializer r2 = kotlinx.serialization.internal.StringSerializer.INSTANCE
            kotlinx.serialization.SerializationStrategy r2 = (kotlinx.serialization.SerializationStrategy) r2
            java.lang.String r1 = r8.f9944g
            r0 = 7
            r9.encodeNullableSerializableElement(r10, r0, r2, r1)
            return
        L94:
            java.lang.String r1 = r8.f9942e
            java.lang.String r0 = "5.40.3"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 == 0) goto L53
            goto L61
        L9f:
            java.lang.String r1 = r8.f9939b
            java.lang.String r0 = "ANDROID"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 != 0) goto L4d
            int r0 = com.incode.welcome_sdk.data.remote.beans.s.f9935k
            int r1 = r0 + 33
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.remote.beans.s.d(com.incode.welcome_sdk.data.remote.beans.s, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public /* synthetic */ s(i iVar, d dVar, j jVar, e eVar, String str) {
        this(Calendar.getInstance().getTimeInMillis(), "ANDROID", "5.40.3", iVar, dVar, jVar, eVar, str);
    }

    public final long a() {
        int i2 = 2 % 2;
        int i3 = f9935k + 91;
        int i4 = i3 % 128;
        f9936m = i4;
        int i5 = i3 % 2;
        long j2 = this.f9940c;
        int i6 = i4 + 75;
        f9935k = i6 % 128;
        if (i6 % 2 != 0) {
            return j2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class b {

        /* JADX INFO: renamed from: f */
        private static int f9962f = 0;

        /* JADX INFO: renamed from: g */
        private static int f9963g = 1;

        /* JADX INFO: renamed from: a */
        public com.incode.welcome_sdk.data.remote.beans.f f9964a;

        /* JADX INFO: renamed from: b */
        public Status f9965b;

        /* JADX INFO: renamed from: c */
        public a f9966c;

        /* JADX INFO: renamed from: d */
        public CameraFacing f9967d;

        /* JADX INFO: renamed from: e */
        public i f9968e;

        /* JADX INFO: renamed from: h */
        public Status f9969h;

        /* JADX INFO: renamed from: j */
        public Status f9970j;

        private b(i iVar, CameraFacing cameraFacing, a aVar, com.incode.welcome_sdk.data.remote.beans.f fVar, Status status, Status status2, Status status3) {
            Intrinsics.checkNotNullParameter(iVar, "");
            this.f9968e = iVar;
            this.f9967d = null;
            this.f9966c = null;
            this.f9964a = null;
            this.f9965b = null;
            this.f9970j = null;
            this.f9969h = null;
        }

        public /* synthetic */ b(byte b2) {
            this(new i((String) null, (String) null, (String) null, (String) null, (f) null, (String) null, (String) null, 127), null, null, null, null, null, null);
        }

        public final s c() {
            i iVar = this.f9968e;
            CameraFacing cameraFacing = this.f9967d;
            d dVar = new d(cameraFacing != null ? r.c(cameraFacing) : null, this.f9966c);
            j jVar = new j(this.f9965b, this.f9970j);
            e eVar = new e(this.f9969h);
            com.incode.welcome_sdk.data.remote.beans.f fVar = this.f9964a;
            return new s(iVar, dVar, jVar, eVar, fVar != null ? fVar.name() : null);
        }

        public b() {
            this((byte) 0);
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            int i3 = f9963g + 105;
            int i4 = i3 % 128;
            f9962f = i4;
            int i5 = i3 % 2;
            if (this == obj) {
                int i6 = i4 + 101;
                f9963g = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!Intrinsics.areEqual(this.f9968e, bVar.f9968e)) {
                int i8 = f9963g + 67;
                f9962f = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (this.f9967d == bVar.f9967d) {
                return Intrinsics.areEqual(this.f9966c, bVar.f9966c) && this.f9964a == bVar.f9964a && this.f9965b == bVar.f9965b && this.f9970j == bVar.f9970j && this.f9969h == bVar.f9969h;
            }
            int i10 = f9962f + 13;
            f9963g = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x001b A[PHI: r1
  0x001b: PHI (r1v18 int) = (r1v2 int), (r1v19 int) binds: [B:61:0x007a, B:37:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x007d A[PHI: r1
  0x007d: PHI (r1v3 int) = (r1v2 int), (r1v19 int) binds: [B:61:0x007a, B:37:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int hashCode() {
            /*
                r6 = this;
                r5 = 2
                int r0 = r5 % r5
                int r0 = com.incode.welcome_sdk.data.remote.beans.s.b.f9963g
                int r1 = r0 + 29
                int r0 = r1 % 128
                com.incode.welcome_sdk.data.remote.beans.s.b.f9962f = r0
                int r1 = r1 % r5
                r4 = 0
                if (r1 == 0) goto L70
                com.incode.welcome_sdk.data.remote.beans.s$i r0 = r6.f9968e
                int r0 = r0.hashCode()
                int r1 = r0 / 119
                com.incode.welcome_sdk.CameraFacing r0 = r6.f9967d
                if (r0 != 0) goto L7d
            L1b:
                r0 = r4
            L1c:
                int r1 = r1 + r0
                int r3 = r1 * 31
                com.incode.welcome_sdk.data.remote.beans.s$a r0 = r6.f9966c
                if (r0 != 0) goto L62
                int r0 = com.incode.welcome_sdk.data.remote.beans.s.b.f9963g
                int r1 = r0 + 109
                int r0 = r1 % 128
                com.incode.welcome_sdk.data.remote.beans.s.b.f9962f = r0
                int r1 = r1 % r5
                r2 = r4
            L2d:
                int r3 = r3 + r2
                int r1 = r3 * 31
                com.incode.welcome_sdk.data.remote.beans.f r0 = r6.f9964a
                if (r0 != 0) goto L5d
                r0 = r4
            L35:
                int r1 = r1 + r0
                int r1 = r1 * 31
                com.incode.welcome_sdk.results.Status r0 = r6.f9965b
                if (r0 != 0) goto L58
                r0 = r4
            L3d:
                int r1 = r1 + r0
                int r1 = r1 * 31
                com.incode.welcome_sdk.results.Status r0 = r6.f9970j
                if (r0 != 0) goto L53
                r0 = r4
            L45:
                int r1 = r1 + r0
                int r1 = r1 * 31
                com.incode.welcome_sdk.results.Status r0 = r6.f9969h
                if (r0 != 0) goto L4e
            L4c:
                int r1 = r1 + r4
                return r1
            L4e:
                int r4 = r0.hashCode()
                goto L4c
            L53:
                int r0 = r0.hashCode()
                goto L45
            L58:
                int r0 = r0.hashCode()
                goto L3d
            L5d:
                int r0 = r0.hashCode()
                goto L35
            L62:
                int r2 = r0.hashCode()
                int r0 = com.incode.welcome_sdk.data.remote.beans.s.b.f9962f
                int r1 = r0 + 73
                int r0 = r1 % 128
                com.incode.welcome_sdk.data.remote.beans.s.b.f9963g = r0
                int r1 = r1 % r5
                goto L2d
            L70:
                com.incode.welcome_sdk.data.remote.beans.s$i r0 = r6.f9968e
                int r0 = r0.hashCode()
                int r1 = r0 * 31
                com.incode.welcome_sdk.CameraFacing r0 = r6.f9967d
                if (r0 != 0) goto L7d
                goto L1b
            L7d:
                com.incode.welcome_sdk.CameraFacing r0 = r6.f9967d
                int r0 = r0.hashCode()
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.remote.beans.s.b.hashCode():int");
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f9962f + 73;
            f9963g = i3 % 128;
            int i4 = i3 % 2;
            String str = "Builder(device=" + this.f9968e + ", cameraFacingMode=" + this.f9967d + ", cameraSettings=" + this.f9966c + ", captureType=" + this.f9964a + ", iadZc=" + this.f9965b + ", iadEcc=" + this.f9970j + ", behaviorMs=" + this.f9969h + ")";
            int i5 = f9962f + 65;
            f9963g = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }

    @Serializable
    public static final class i {

        /* JADX INFO: renamed from: g */
        private static int f10023g = 0;

        /* JADX INFO: renamed from: h */
        private static int f10024h = 0;

        /* JADX INFO: renamed from: i */
        private static int f10025i = 1;

        /* JADX INFO: renamed from: n */
        private static int f10026n = 1;

        /* JADX INFO: renamed from: a */
        private final String f10027a;

        /* JADX INFO: renamed from: b */
        private final String f10028b;

        /* JADX INFO: renamed from: c */
        private final f f10029c;

        /* JADX INFO: renamed from: d */
        private final String f10030d;

        /* JADX INFO: renamed from: e */
        private final String f10031e;

        /* JADX INFO: renamed from: f */
        private final String f10032f;

        /* JADX INFO: renamed from: j */
        private final String f10033j;

        public static final class b {

            /* JADX INFO: renamed from: b */
            private static int f10034b = 0;

            /* JADX INFO: renamed from: d */
            private static int f10035d = 1;

            private b() {
            }

            public final KSerializer<i> serializer() {
                int i2 = 2 % 2;
                int i3 = f10035d + 63;
                f10034b = i3 % 128;
                int i4 = i3 % 2;
                d dVar = d.f10036a;
                if (i4 == 0) {
                    return dVar;
                }
                throw null;
            }

            public /* synthetic */ b(byte b2) {
                this();
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public static final class d implements GeneratedSerializer<i> {

            /* JADX INFO: renamed from: a */
            public static final d f10036a;

            /* JADX INFO: renamed from: b */
            private static final /* synthetic */ PluginGeneratedSerialDescriptor f10037b;

            /* JADX INFO: renamed from: c */
            private static int f10038c = 0;

            /* JADX INFO: renamed from: d */
            private static int f10039d = 0;

            /* JADX INFO: renamed from: e */
            private static int f10040e = 1;

            /* JADX INFO: renamed from: h */
            private static int f10041h = 1;

            static {
                d dVar = new d();
                f10036a = dVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.incode.welcome_sdk.data.remote.beans.Metadata.Device", dVar, 7);
                pluginGeneratedSerialDescriptor.addElement("kind", true);
                pluginGeneratedSerialDescriptor.addElement(Device.JsonKeys.MODEL, true);
                pluginGeneratedSerialDescriptor.addElement(OperatingSystem.TYPE, true);
                pluginGeneratedSerialDescriptor.addElement("osVersion", true);
                pluginGeneratedSerialDescriptor.addElement("screenDimensions", true);
                pluginGeneratedSerialDescriptor.addElement("fingerprintHash", true);
                pluginGeneratedSerialDescriptor.addElement("ip", true);
                f10037b = pluginGeneratedSerialDescriptor;
                int i2 = f10038c + 27;
                f10041h = i2 % 128;
                int i3 = i2 % 2;
            }

            private d() {
            }

            private void a(Encoder encoder, i iVar) {
                int i2 = 2 % 2;
                int i3 = f10040e + 5;
                f10039d = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(encoder, "");
                Intrinsics.checkNotNullParameter(iVar, "");
                SerialDescriptor descriptor = getDescriptor();
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
                i.b(iVar, compositeEncoderBeginStructure, descriptor);
                compositeEncoderBeginStructure.endStructure(descriptor);
                int i5 = f10039d + 13;
                f10040e = i5 % 128;
                int i6 = i5 % 2;
            }

            private i c(Decoder decoder) {
                String str;
                f fVar;
                String str2;
                String str3;
                String strDecodeStringElement;
                String strDecodeStringElement2;
                String str4;
                int i2 = 2;
                int i3 = 2 % 2;
                int i4 = f10039d + 109;
                f10040e = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNullParameter(decoder, "");
                SerialDescriptor descriptor = getDescriptor();
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
                int i6 = 0;
                boolean z2 = true;
                String str5 = null;
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 0);
                    str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, StringSerializer.INSTANCE, null);
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 2);
                    str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, StringSerializer.INSTANCE, null);
                    fVar = (f) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, f.b.f10014d, null);
                    str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 5, StringSerializer.INSTANCE, null);
                    str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 6, StringSerializer.INSTANCE, null);
                    int i7 = f10040e + 49;
                    f10039d = i7 % 128;
                    int i8 = i7 % 2;
                    i6 = 127;
                } else {
                    boolean z3 = true;
                    str = null;
                    fVar = null;
                    str2 = null;
                    str3 = null;
                    strDecodeStringElement = null;
                    strDecodeStringElement2 = null;
                    while (z3 == z2) {
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                        switch (iDecodeElementIndex) {
                            case -1:
                                z3 = false;
                                z2 = true;
                                break;
                            case 0:
                                z2 = true;
                                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 0);
                                i6 |= 1;
                                i2 = 2;
                                break;
                            case 1:
                                z2 = true;
                                str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, StringSerializer.INSTANCE, str5);
                                i6 |= 2;
                                i2 = 2;
                                break;
                            case 2:
                                strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor, i2);
                                i6 |= 4;
                                z2 = true;
                                break;
                            case 3:
                                str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, StringSerializer.INSTANCE, str);
                                i6 |= 8;
                                z2 = true;
                                break;
                            case 4:
                                fVar = (f) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, f.b.f10014d, fVar);
                                i6 |= 16;
                                z2 = true;
                                break;
                            case 5:
                                str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 5, StringSerializer.INSTANCE, str2);
                                i6 |= 32;
                                z2 = true;
                                break;
                            case 6:
                                str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 6, StringSerializer.INSTANCE, str3);
                                i6 |= 64;
                                z2 = true;
                                break;
                            default:
                                throw new UnknownFieldException(iDecodeElementIndex);
                        }
                    }
                    str4 = str5;
                }
                compositeDecoderBeginStructure.endStructure(descriptor);
                return new i(i6, strDecodeStringElement, str4, strDecodeStringElement2, str, fVar, str2, str3);
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer<?>[] childSerializers() {
                int i2 = 2 % 2;
                int i3 = f10040e + 9;
                f10039d = i3 % 128;
                int i4 = i3 % 2;
                KSerializer<?>[] kSerializerArr = {StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(f.b.f10014d), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)};
                int i5 = f10039d + 17;
                f10040e = i5 % 128;
                int i6 = i5 % 2;
                return kSerializerArr;
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            public final /* synthetic */ Object deserialize(Decoder decoder) {
                int i2 = 2 % 2;
                int i3 = f10039d + 23;
                f10040e = i3 % 128;
                int i4 = i3 % 2;
                i iVarC = c(decoder);
                int i5 = f10039d + 41;
                f10040e = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 3 / 0;
                }
                return iVarC;
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public final SerialDescriptor getDescriptor() {
                int i2 = 2 % 2;
                int i3 = f10040e + 3;
                int i4 = i3 % 128;
                f10039d = i4;
                int i5 = i3 % 2;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10037b;
                int i6 = i4 + 83;
                f10040e = i6 % 128;
                int i7 = i6 % 2;
                return pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.SerializationStrategy
            public final /* synthetic */ void serialize(Encoder encoder, Object obj) {
                int i2 = 2 % 2;
                int i3 = f10039d + 107;
                f10040e = i3 % 128;
                int i4 = i3 % 2;
                a(encoder, (i) obj);
                int i5 = f10039d + 27;
                f10040e = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 17 / 0;
                }
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer<?>[] typeParametersSerializers() {
                int i2 = 2 % 2;
                int i3 = f10039d + 15;
                f10040e = i3 % 128;
                int i4 = i3 % 2;
                KSerializer<?>[] kSerializerArrTypeParametersSerializers = GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
                int i5 = f10039d + 91;
                f10040e = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 33 / 0;
                }
                return kSerializerArrTypeParametersSerializers;
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ i(int i2, String str, String str2, String str3, String str4, f fVar, String str5, String str6) {
            this.f10028b = (i2 & 1) == 0 ? "mobile" : str;
            if ((i2 & 2) == 0) {
                this.f10027a = null;
            } else {
                this.f10027a = str2;
            }
            if ((i2 & 4) == 0) {
                this.f10030d = EventMetricsAggregator.OS_NAME;
            } else {
                this.f10030d = str3;
            }
            if ((i2 & 8) == 0) {
                this.f10031e = null;
            } else {
                this.f10031e = str4;
            }
            if ((i2 & 16) == 0) {
                this.f10029c = null;
            } else {
                this.f10029c = fVar;
            }
            if ((i2 & 32) == 0) {
                this.f10033j = null;
            } else {
                this.f10033j = str5;
            }
            if ((i2 & 64) == 0) {
                this.f10032f = null;
            } else {
                this.f10032f = str6;
            }
        }

        private i(String str, String str2, String str3, String str4, f fVar, String str5, String str6) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.f10028b = str;
            this.f10027a = str2;
            this.f10030d = str3;
            this.f10031e = str4;
            this.f10029c = fVar;
            this.f10033j = str5;
            this.f10032f = str6;
        }

        /* JADX WARN: Removed duplicated region for block: B:66:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x00b9  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final /* synthetic */ void b(com.incode.welcome_sdk.data.remote.beans.s.i r5, kotlinx.serialization.encoding.CompositeEncoder r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
            /*
                Method dump skipped, instruction units count: 249
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.remote.beans.s.i.b(com.incode.welcome_sdk.data.remote.beans.s$i, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        public /* synthetic */ i(String str, String str2, String str3, String str4, f fVar, String str5, String str6, int i2) {
            this((i2 & 1) != 0 ? "mobile" : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? EventMetricsAggregator.OS_NAME : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : fVar, (i2 & 32) != 0 ? null : str5, (i2 & 64) == 0 ? str6 : null);
        }

        public i(DeviceFingerprint deviceFingerprint, f fVar) {
            this((String) null, deviceFingerprint != null ? deviceFingerprint.getDeviceModel() : null, (String) null, String.valueOf(deviceFingerprint != null ? Integer.valueOf(deviceFingerprint.getOsVersion()) : null), fVar, deviceFingerprint != null ? deviceFingerprint.getHash() : null, deviceFingerprint != null ? deviceFingerprint.getIp() : null, 5);
        }

        static {
            new b((byte) 0);
            int i2 = f10026n + 93;
            f10024h = i2 % 128;
            int i3 = i2 % 2;
        }

        public i() {
            this((String) null, (String) null, (String) null, (String) null, (f) null, (String) null, (String) null, 127);
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            if (this == obj) {
                int i3 = f10025i + 103;
                f10023g = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (!Intrinsics.areEqual(this.f10028b, iVar.f10028b) || !Intrinsics.areEqual(this.f10027a, iVar.f10027a) || !Intrinsics.areEqual(this.f10030d, iVar.f10030d) || !Intrinsics.areEqual(this.f10031e, iVar.f10031e)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.f10029c, iVar.f10029c)) {
                int i5 = f10023g + 23;
                f10025i = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.f10033j, iVar.f10033j)) {
                return false;
            }
            if (Intrinsics.areEqual(this.f10032f, iVar.f10032f)) {
                return true;
            }
            int i7 = f10023g + 113;
            f10025i = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public final int hashCode() {
            int iHashCode;
            int i2 = 2 % 2;
            int i3 = f10023g + 77;
            f10025i = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode2 = this.f10028b.hashCode() * 31;
            String str = this.f10027a;
            int iHashCode3 = 0;
            int iHashCode4 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.f10030d.hashCode()) * 31;
            String str2 = this.f10031e;
            if (str2 == null) {
                int i5 = f10025i + 99;
                f10023g = i5 % 128;
                int i6 = i5 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str2.hashCode();
            }
            int i7 = (iHashCode4 + iHashCode) * 31;
            f fVar = this.f10029c;
            int iHashCode5 = (i7 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            String str3 = this.f10033j;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f10032f;
            if (str4 == null) {
                int i8 = f10025i + 59;
                f10023g = i8 % 128;
                int i9 = i8 % 2;
            } else {
                iHashCode3 = str4.hashCode();
            }
            return iHashCode6 + iHashCode3;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f10025i + 35;
            f10023g = i3 % 128;
            if (i3 % 2 != 0) {
                String str = "Device(kind=" + this.f10028b + ", model=" + this.f10027a + ", os=" + this.f10030d + ", osVersion=" + this.f10031e + ", screenDimensions=" + this.f10029c + ", fingerprintHash=" + this.f10033j + ", ip=" + this.f10032f + ")";
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str2 = "Device(kind=" + this.f10028b + ", model=" + this.f10027a + ", os=" + this.f10030d + ", osVersion=" + this.f10031e + ", screenDimensions=" + this.f10029c + ", fingerprintHash=" + this.f10033j + ", ip=" + this.f10032f + ")";
            int i4 = f10025i + 17;
            f10023g = i4 % 128;
            int i5 = i4 % 2;
            return str2;
        }
    }

    @Serializable
    public static final class f {

        /* JADX INFO: renamed from: a */
        private static int f10005a = 0;

        /* JADX INFO: renamed from: c */
        private static int f10006c = 1;

        /* JADX INFO: renamed from: d */
        private static int f10007d = 0;

        /* JADX INFO: renamed from: j */
        private static int f10008j = 1;

        /* JADX INFO: renamed from: b */
        private final int f10009b;

        /* JADX INFO: renamed from: e */
        private final int f10010e;

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public static final class b implements GeneratedSerializer<f> {

            /* JADX INFO: renamed from: a */
            private static final /* synthetic */ PluginGeneratedSerialDescriptor f10011a;

            /* JADX INFO: renamed from: b */
            private static int f10012b = 1;

            /* JADX INFO: renamed from: c */
            private static int f10013c = 0;

            /* JADX INFO: renamed from: d */
            public static final b f10014d;

            /* JADX INFO: renamed from: e */
            private static int f10015e = 0;

            /* JADX INFO: renamed from: h */
            private static int f10016h = 1;

            static {
                b bVar = new b();
                f10014d = bVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.incode.welcome_sdk.data.remote.beans.Metadata.Dimensions", bVar, 2);
                pluginGeneratedSerialDescriptor.addElement("width", false);
                pluginGeneratedSerialDescriptor.addElement("height", false);
                f10011a = pluginGeneratedSerialDescriptor;
                int i2 = f10013c + 43;
                f10016h = i2 % 128;
                int i3 = i2 % 2;
            }

            private b() {
            }

            private f d(Decoder decoder) {
                int iDecodeIntElement;
                int iDecodeIntElement2;
                int i2;
                int i3 = 2 % 2;
                int i4 = f10015e + 81;
                f10012b = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNullParameter(decoder, "");
                SerialDescriptor descriptor = getDescriptor();
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    i2 = 3;
                    int i6 = f10015e + 3;
                    f10012b = i6 % 128;
                    int i7 = i6 % 2;
                    iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor, 0);
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 1);
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
                return new f(i2, iDecodeIntElement, iDecodeIntElement2);
            }

            private void d(Encoder encoder, f fVar) {
                int i2 = 2 % 2;
                int i3 = f10015e + 47;
                f10012b = i3 % 128;
                if (i3 % 2 != 0) {
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

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer<?>[] childSerializers() {
                int i2 = 2 % 2;
                int i3 = f10015e + 71;
                f10012b = i3 % 128;
                int i4 = i3 % 2;
                KSerializer<?>[] kSerializerArr = {IntSerializer.INSTANCE, IntSerializer.INSTANCE};
                int i5 = f10012b + 41;
                f10015e = i5 % 128;
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
                int i3 = f10012b + 93;
                f10015e = i3 % 128;
                if (i3 % 2 != 0) {
                    d(decoder);
                    throw null;
                }
                f fVarD = d(decoder);
                int i4 = f10012b + 51;
                f10015e = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 55 / 0;
                }
                return fVarD;
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public final SerialDescriptor getDescriptor() {
                int i2 = 2 % 2;
                int i3 = f10012b;
                int i4 = i3 + 105;
                f10015e = i4 % 128;
                int i5 = i4 % 2;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10011a;
                int i6 = i3 + 75;
                f10015e = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 77 / 0;
                }
                return pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.SerializationStrategy
            public final /* synthetic */ void serialize(Encoder encoder, Object obj) {
                int i2 = 2 % 2;
                int i3 = f10015e + 13;
                f10012b = i3 % 128;
                int i4 = i3 % 2;
                d(encoder, (f) obj);
                if (i4 == 0) {
                    int i5 = 62 / 0;
                }
                int i6 = f10012b + 83;
                f10015e = i6 % 128;
                int i7 = i6 % 2;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer<?>[] typeParametersSerializers() {
                int i2 = 2 % 2;
                int i3 = f10015e + 69;
                f10012b = i3 % 128;
                if (i3 % 2 != 0) {
                    return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
                }
                GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
                throw null;
            }
        }

        public static final class e {

            /* JADX INFO: renamed from: d */
            private static int f10017d = 0;

            /* JADX INFO: renamed from: e */
            private static int f10018e = 1;

            private e() {
            }

            public final KSerializer<f> serializer() {
                int i2 = 2 % 2;
                int i3 = f10018e + 99;
                f10017d = i3 % 128;
                int i4 = i3 % 2;
                b bVar = b.f10014d;
                if (i4 != 0) {
                    int i5 = 11 / 0;
                }
                return bVar;
            }

            public /* synthetic */ e(byte b2) {
                this();
            }
        }

        public f(int i2, int i3) {
            this.f10010e = i2;
            this.f10009b = i3;
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ f(int i2, int i3, int i4) {
            if (3 != (i2 & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i2, 3, b.f10014d.getDescriptor());
            }
            this.f10010e = i3;
            this.f10009b = i4;
        }

        @JvmStatic
        public static final /* synthetic */ void a(f fVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            int i2 = 2 % 2;
            int i3 = f10005a + 51;
            f10006c = i3 % 128;
            int i4 = i3 % 2;
            compositeEncoder.encodeIntElement(serialDescriptor, 0, fVar.f10010e);
            compositeEncoder.encodeIntElement(serialDescriptor, 1, fVar.f10009b);
            int i5 = f10005a + 69;
            f10006c = i5 % 128;
            int i6 = i5 % 2;
        }

        static {
            new e((byte) 0);
            int i2 = f10007d + 69;
            f10008j = i2 % 128;
            int i3 = i2 % 2;
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            if (this == obj) {
                int i3 = f10005a;
                int i4 = i3 + 71;
                f10006c = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 3;
                f10006c = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 13 / 0;
                }
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (this.f10010e != fVar.f10010e) {
                return false;
            }
            if (this.f10009b == fVar.f10009b) {
                return true;
            }
            int i8 = f10005a + 99;
            f10006c = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = f10006c + 43;
            f10005a = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode = (Integer.hashCode(this.f10010e) * 31) + Integer.hashCode(this.f10009b);
            int i5 = f10005a + 85;
            f10006c = i5 % 128;
            if (i5 % 2 != 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f10006c + 5;
            f10005a = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                String str = "Dimensions(width=" + this.f10010e + ", height=" + this.f10009b + ")";
                obj.hashCode();
                throw null;
            }
            String str2 = "Dimensions(width=" + this.f10010e + ", height=" + this.f10009b + ")";
            int i4 = f10005a + 79;
            f10006c = i4 % 128;
            if (i4 % 2 != 0) {
                return str2;
            }
            throw null;
        }
    }

    @Serializable
    public static final class d {

        /* JADX INFO: renamed from: c */
        private static int f9977c = 0;

        /* JADX INFO: renamed from: d */
        private static int f9978d = 1;

        /* JADX INFO: renamed from: e */
        private static int f9979e = 0;

        /* JADX INFO: renamed from: i */
        private static int f9980i = 1;

        /* JADX INFO: renamed from: a */
        private final a f9981a;

        /* JADX INFO: renamed from: b */
        private final String f9982b;

        public static final class a {

            /* JADX INFO: renamed from: b */
            private static int f9983b = 0;

            /* JADX INFO: renamed from: c */
            private static int f9984c = 1;

            private a() {
            }

            public final KSerializer<d> serializer() {
                int i2 = 2 % 2;
                int i3 = f9983b + 101;
                f9984c = i3 % 128;
                int i4 = i3 % 2;
                e eVar = e.f9987c;
                int i5 = f9984c + 23;
                f9983b = i5 % 128;
                if (i5 % 2 == 0) {
                    return eVar;
                }
                throw null;
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public static final class e implements GeneratedSerializer<d> {

            /* JADX INFO: renamed from: a */
            private static int f9985a = 1;

            /* JADX INFO: renamed from: b */
            private static int f9986b = 0;

            /* JADX INFO: renamed from: c */
            public static final e f9987c;

            /* JADX INFO: renamed from: d */
            private static int f9988d = 0;

            /* JADX INFO: renamed from: e */
            private static final /* synthetic */ PluginGeneratedSerialDescriptor f9989e;

            /* JADX INFO: renamed from: f */
            private static int f9990f = 1;

            static {
                e eVar = new e();
                f9987c = eVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.incode.welcome_sdk.data.remote.beans.Metadata.Camera", eVar, 2);
                pluginGeneratedSerialDescriptor.addElement("facingMode", true);
                pluginGeneratedSerialDescriptor.addElement("settings", true);
                f9989e = pluginGeneratedSerialDescriptor;
                int i2 = f9986b + 63;
                f9990f = i2 % 128;
                int i3 = i2 % 2;
            }

            private e() {
            }

            private void c(Encoder encoder, d dVar) {
                int i2 = 2 % 2;
                int i3 = f9985a + 3;
                f9988d = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(encoder, "");
                    Intrinsics.checkNotNullParameter(dVar, "");
                    SerialDescriptor descriptor = getDescriptor();
                    CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
                    d.b(dVar, compositeEncoderBeginStructure, descriptor);
                    compositeEncoderBeginStructure.endStructure(descriptor);
                    int i4 = 7 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(encoder, "");
                    Intrinsics.checkNotNullParameter(dVar, "");
                    SerialDescriptor descriptor2 = getDescriptor();
                    CompositeEncoder compositeEncoderBeginStructure2 = encoder.beginStructure(descriptor2);
                    d.b(dVar, compositeEncoderBeginStructure2, descriptor2);
                    compositeEncoderBeginStructure2.endStructure(descriptor2);
                }
                int i5 = f9985a + 9;
                f9988d = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private d d(Decoder decoder) {
                int i2;
                a aVar;
                String str;
                int i3 = 2 % 2;
                int i4 = f9985a + 79;
                f9988d = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNullParameter(decoder, "");
                SerialDescriptor descriptor = getDescriptor();
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
                String str2 = null;
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    int i6 = f9988d + 35;
                    f9985a = i6 % 128;
                    if (i6 % 2 == 0) {
                        str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, StringSerializer.INSTANCE, null);
                        aVar = (a) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, a.c.f9958c, null);
                        i2 = 5;
                    } else {
                        str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, StringSerializer.INSTANCE, null);
                        aVar = (a) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, a.c.f9958c, null);
                        i2 = 3;
                    }
                } else {
                    i2 = 0;
                    aVar = null;
                    boolean z2 = true;
                    while (z2) {
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                        if (iDecodeElementIndex == -1) {
                            z2 = false;
                        } else if (iDecodeElementIndex == 0) {
                            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, StringSerializer.INSTANCE, str2);
                            i2 |= 1;
                        } else {
                            if (iDecodeElementIndex != 1) {
                                throw new UnknownFieldException(iDecodeElementIndex);
                            }
                            aVar = (a) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, a.c.f9958c, aVar);
                            i2 |= 2;
                        }
                    }
                    str = str2;
                }
                compositeDecoderBeginStructure.endStructure(descriptor);
                d dVar = new d(i2, str, aVar);
                int i7 = f9988d + 73;
                f9985a = i7 % 128;
                int i8 = i7 % 2;
                return dVar;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer<?>[] childSerializers() {
                int i2 = 2 % 2;
                int i3 = f9988d + 3;
                f9985a = i3 % 128;
                if (i3 % 2 != 0) {
                    return new KSerializer[]{BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(a.c.f9958c)};
                }
                KSerializer<?>[] kSerializerArr = new KSerializer[4];
                kSerializerArr[1] = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                kSerializerArr[0] = BuiltinSerializersKt.getNullable(a.c.f9958c);
                return kSerializerArr;
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            public final /* synthetic */ Object deserialize(Decoder decoder) {
                int i2 = 2 % 2;
                int i3 = f9985a + 37;
                f9988d = i3 % 128;
                if (i3 % 2 == 0) {
                    return d(decoder);
                }
                d(decoder);
                throw null;
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public final SerialDescriptor getDescriptor() {
                int i2 = 2 % 2;
                int i3 = f9985a;
                int i4 = i3 + 109;
                f9988d = i4 % 128;
                int i5 = i4 % 2;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f9989e;
                int i6 = i3 + 77;
                f9988d = i6 % 128;
                int i7 = i6 % 2;
                return pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.SerializationStrategy
            public final /* synthetic */ void serialize(Encoder encoder, Object obj) {
                int i2 = 2 % 2;
                int i3 = f9988d + 87;
                f9985a = i3 % 128;
                int i4 = i3 % 2;
                c(encoder, (d) obj);
                int i5 = f9985a + 27;
                f9988d = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer<?>[] typeParametersSerializers() {
                int i2 = 2 % 2;
                int i3 = f9988d + 55;
                f9985a = i3 % 128;
                int i4 = i3 % 2;
                KSerializer<?>[] kSerializerArrTypeParametersSerializers = GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
                if (i4 == 0) {
                    int i5 = 54 / 0;
                }
                return kSerializerArrTypeParametersSerializers;
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ d(int i2, String str, a aVar) {
            if ((i2 & 1) == 0) {
                this.f9982b = null;
            } else {
                this.f9982b = str;
            }
            if ((i2 & 2) == 0) {
                this.f9981a = null;
            } else {
                this.f9981a = aVar;
            }
        }

        public d(String str, a aVar) {
            this.f9982b = str;
            this.f9981a = aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:52:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x006e  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final /* synthetic */ void b(com.incode.welcome_sdk.data.remote.beans.s.d r7, kotlinx.serialization.encoding.CompositeEncoder r8, kotlinx.serialization.descriptors.SerialDescriptor r9) {
            /*
                r6 = 2
                int r0 = r6 % r6
                int r0 = com.incode.welcome_sdk.data.remote.beans.s.d.f9979e
                int r1 = r0 + 125
                int r0 = r1 % 128
                com.incode.welcome_sdk.data.remote.beans.s.d.f9978d = r0
                int r1 = r1 % r6
                r4 = 1
                r3 = 0
                if (r1 != 0) goto L72
                boolean r0 = r8.shouldEncodeElementDefault(r9, r3)
                if (r0 == 0) goto L79
            L16:
                int r5 = com.incode.welcome_sdk.data.remote.beans.s.d.f9978d
                int r1 = r5 + 33
                int r0 = r1 % 128
                com.incode.welcome_sdk.data.remote.beans.s.d.f9979e = r0
                int r1 = r1 % r6
                if (r1 == 0) goto L70
                r2 = r3
            L22:
                int r1 = r5 + 15
                int r0 = r1 % 128
                com.incode.welcome_sdk.data.remote.beans.s.d.f9979e = r0
                int r1 = r1 % r6
            L29:
                if (r2 == 0) goto L3d
                kotlinx.serialization.internal.StringSerializer r1 = kotlinx.serialization.internal.StringSerializer.INSTANCE
                kotlinx.serialization.SerializationStrategy r1 = (kotlinx.serialization.SerializationStrategy) r1
                java.lang.String r0 = r7.f9982b
                r8.encodeNullableSerializableElement(r9, r3, r1, r0)
                int r0 = com.incode.welcome_sdk.data.remote.beans.s.d.f9978d
                int r1 = r0 + 65
                int r0 = r1 % 128
                com.incode.welcome_sdk.data.remote.beans.s.d.f9979e = r0
                int r1 = r1 % r6
            L3d:
                boolean r0 = r8.shouldEncodeElementDefault(r9, r4)
                if (r0 == 0) goto L6a
                int r0 = com.incode.welcome_sdk.data.remote.beans.s.d.f9978d
                int r1 = r0 + 99
                int r0 = r1 % 128
                com.incode.welcome_sdk.data.remote.beans.s.d.f9979e = r0
                int r1 = r1 % r6
                if (r1 == 0) goto L6e
            L4e:
                r0 = r3
            L4f:
                if (r0 == 0) goto L65
                int r0 = com.incode.welcome_sdk.data.remote.beans.s.d.f9979e
                int r2 = r0 + 35
                int r0 = r2 % 128
                com.incode.welcome_sdk.data.remote.beans.s.d.f9978d = r0
                int r2 = r2 % r6
                com.incode.welcome_sdk.data.remote.beans.s$a$c r1 = com.incode.welcome_sdk.data.remote.beans.s.a.c.f9958c
                kotlinx.serialization.SerializationStrategy r1 = (kotlinx.serialization.SerializationStrategy) r1
                com.incode.welcome_sdk.data.remote.beans.s$a r0 = r7.f9981a
                if (r2 != 0) goto L66
                r8.encodeNullableSerializableElement(r9, r3, r1, r0)
            L65:
                return
            L66:
                r8.encodeNullableSerializableElement(r9, r4, r1, r0)
                goto L65
            L6a:
                com.incode.welcome_sdk.data.remote.beans.s$a r0 = r7.f9981a
                if (r0 == 0) goto L4e
            L6e:
                r0 = r4
                goto L4f
            L70:
                r2 = r4
                goto L22
            L72:
                boolean r0 = r8.shouldEncodeElementDefault(r9, r3)
                if (r0 == 0) goto L79
                goto L16
            L79:
                java.lang.String r0 = r7.f9982b
                if (r0 == 0) goto L88
                int r0 = com.incode.welcome_sdk.data.remote.beans.s.d.f9978d
                int r1 = r0 + 53
                int r0 = r1 % 128
                com.incode.welcome_sdk.data.remote.beans.s.d.f9979e = r0
                int r1 = r1 % r6
                r2 = r4
                goto L29
            L88:
                int r0 = com.incode.welcome_sdk.data.remote.beans.s.d.f9979e
                int r1 = r0 + 117
                int r0 = r1 % 128
                com.incode.welcome_sdk.data.remote.beans.s.d.f9978d = r0
                int r1 = r1 % r6
                r2 = r3
                goto L29
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.remote.beans.s.d.b(com.incode.welcome_sdk.data.remote.beans.s$d, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        private /* synthetic */ d(byte b2) {
            this(null, null);
        }

        static {
            new a((byte) 0);
            int i2 = f9980i + 87;
            f9977c = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 20 / 0;
            }
        }

        public d() {
            this((byte) 0);
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            if (this == obj) {
                int i3 = f9979e + 61;
                f9978d = i3 % 128;
                return i3 % 2 != 0;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return Intrinsics.areEqual(this.f9982b, dVar.f9982b) && Intrinsics.areEqual(this.f9981a, dVar.f9981a);
            }
            int i4 = f9978d + 53;
            f9979e = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            int i2;
            int i3 = 2 % 2;
            String str = this.f9982b;
            int iHashCode = 0;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
            a aVar = this.f9981a;
            if (aVar == null) {
                i2 = f9979e + 41;
                f9978d = i2 % 128;
            } else {
                iHashCode = aVar.hashCode();
                i2 = f9978d + 53;
                f9979e = i2 % 128;
            }
            int i4 = i2 % 2;
            return iHashCode2 + iHashCode;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f9979e + 33;
            f9978d = i3 % 128;
            int i4 = i3 % 2;
            String str = "Camera(facingMode=" + this.f9982b + ", settings=" + this.f9981a + ")";
            int i5 = f9979e + 103;
            f9978d = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }

    @Serializable
    public static final class a {

        /* JADX INFO: renamed from: b */
        private static int f9947b = 0;

        /* JADX INFO: renamed from: c */
        private static int f9948c = 1;

        /* JADX INFO: renamed from: h */
        private static int f9949h = 0;

        /* JADX INFO: renamed from: j */
        private static int f9950j = 1;

        /* JADX INFO: renamed from: a */
        private final int f9951a;

        /* JADX INFO: renamed from: d */
        private final int f9952d;

        /* JADX INFO: renamed from: e */
        private final String f9953e;

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public static final class c implements GeneratedSerializer<a> {

            /* JADX INFO: renamed from: a */
            private static int f9956a = 0;

            /* JADX INFO: renamed from: b */
            private static final /* synthetic */ PluginGeneratedSerialDescriptor f9957b;

            /* JADX INFO: renamed from: c */
            public static final c f9958c;

            /* JADX INFO: renamed from: d */
            private static int f9959d = 1;

            /* JADX INFO: renamed from: e */
            private static int f9960e = 0;

            /* JADX INFO: renamed from: i */
            private static int f9961i = 1;

            static {
                c cVar = new c();
                f9958c = cVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.incode.welcome_sdk.data.remote.beans.Metadata.CameraSettings", cVar, 3);
                pluginGeneratedSerialDescriptor.addElement("width", false);
                pluginGeneratedSerialDescriptor.addElement("height", false);
                pluginGeneratedSerialDescriptor.addElement("focusMode", false);
                f9957b = pluginGeneratedSerialDescriptor;
                int i2 = f9961i + 35;
                f9960e = i2 % 128;
                int i3 = i2 % 2;
            }

            private c() {
            }

            private void d(Encoder encoder, a aVar) {
                int i2 = 2 % 2;
                int i3 = f9959d + 39;
                f9956a = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(encoder, "");
                Intrinsics.checkNotNullParameter(aVar, "");
                SerialDescriptor descriptor = getDescriptor();
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
                a.a(aVar, compositeEncoderBeginStructure, descriptor);
                compositeEncoderBeginStructure.endStructure(descriptor);
                int i5 = f9959d + 87;
                f9956a = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            private a e(Decoder decoder) {
                String strDecodeStringElement;
                int iDecodeIntElement;
                int iDecodeIntElement2;
                int i2;
                int i3 = 2 % 2;
                int i4 = f9956a + 105;
                f9959d = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNullParameter(decoder, "");
                SerialDescriptor descriptor = getDescriptor();
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
                Object obj = null;
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor, 0);
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 1);
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 2);
                    int i6 = f9959d + 117;
                    f9956a = i6 % 128;
                    int i7 = i6 % 2;
                    i2 = 7;
                } else {
                    strDecodeStringElement = null;
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
                        } else if (iDecodeElementIndex == 1) {
                            iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 1);
                            i2 |= 2;
                        } else {
                            if (iDecodeElementIndex != 2) {
                                throw new UnknownFieldException(iDecodeElementIndex);
                            }
                            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 2);
                            i2 |= 4;
                        }
                    }
                }
                compositeDecoderBeginStructure.endStructure(descriptor);
                a aVar = new a(i2, iDecodeIntElement, iDecodeIntElement2, strDecodeStringElement);
                int i8 = f9959d + 13;
                f9956a = i8 % 128;
                if (i8 % 2 == 0) {
                    return aVar;
                }
                obj.hashCode();
                throw null;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer<?>[] childSerializers() {
                int i2 = 2 % 2;
                int i3 = f9956a + 75;
                f9959d = i3 % 128;
                if (i3 % 2 != 0) {
                    return new KSerializer[]{IntSerializer.INSTANCE, IntSerializer.INSTANCE, StringSerializer.INSTANCE};
                }
                KSerializer<?>[] kSerializerArr = new KSerializer[5];
                kSerializerArr[1] = IntSerializer.INSTANCE;
                kSerializerArr[0] = IntSerializer.INSTANCE;
                kSerializerArr[4] = StringSerializer.INSTANCE;
                return kSerializerArr;
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            public final /* synthetic */ Object deserialize(Decoder decoder) {
                int i2 = 2 % 2;
                int i3 = f9956a + 49;
                f9959d = i3 % 128;
                int i4 = i3 % 2;
                a aVarE = e(decoder);
                if (i4 == 0) {
                    int i5 = 3 / 0;
                }
                return aVarE;
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public final SerialDescriptor getDescriptor() {
                int i2 = 2 % 2;
                int i3 = f9956a;
                int i4 = i3 + 95;
                f9959d = i4 % 128;
                int i5 = i4 % 2;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f9957b;
                int i6 = i3 + 27;
                f9959d = i6 % 128;
                if (i6 % 2 != 0) {
                    return pluginGeneratedSerialDescriptor;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // kotlinx.serialization.SerializationStrategy
            public final /* synthetic */ void serialize(Encoder encoder, Object obj) {
                int i2 = 2 % 2;
                int i3 = f9959d + 51;
                f9956a = i3 % 128;
                int i4 = i3 % 2;
                d(encoder, (a) obj);
                if (i4 != 0) {
                    throw null;
                }
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer<?>[] typeParametersSerializers() {
                int i2 = 2 % 2;
                int i3 = f9959d + 109;
                f9956a = i3 % 128;
                int i4 = i3 % 2;
                KSerializer<?>[] kSerializerArrTypeParametersSerializers = GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
                int i5 = f9959d + 3;
                f9956a = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 17 / 0;
                }
                return kSerializerArrTypeParametersSerializers;
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ a(int i2, int i3, int i4, String str) {
            if (7 != (i2 & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i2, 7, c.f9958c.getDescriptor());
            }
            this.f9952d = i3;
            this.f9951a = i4;
            this.f9953e = str;
        }

        public a(int i2, int i3, String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.f9952d = i2;
            this.f9951a = i3;
            this.f9953e = str;
        }

        @JvmStatic
        public static final /* synthetic */ void a(a aVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            int i2 = 2;
            int i3 = 2 % 2;
            int i4 = f9947b + 25;
            f9948c = i4 % 128;
            if (i4 % 2 == 0) {
                compositeEncoder.encodeIntElement(serialDescriptor, 0, aVar.f9952d);
                compositeEncoder.encodeIntElement(serialDescriptor, 0, aVar.f9951a);
                i2 = 5;
            } else {
                compositeEncoder.encodeIntElement(serialDescriptor, 0, aVar.f9952d);
                compositeEncoder.encodeIntElement(serialDescriptor, 1, aVar.f9951a);
            }
            compositeEncoder.encodeStringElement(serialDescriptor, i2, aVar.f9953e);
        }

        public a(int i2, int i3) {
            this(i2, i3, "auto");
        }

        public static final class b {

            /* JADX INFO: renamed from: b */
            private static int f9954b = 1;

            /* JADX INFO: renamed from: d */
            private static int f9955d = 0;

            private b() {
            }

            public final KSerializer<a> serializer() {
                int i2 = 2 % 2;
                int i3 = f9954b + 55;
                f9955d = i3 % 128;
                int i4 = i3 % 2;
                c cVar = c.f9958c;
                int i5 = f9955d + 57;
                f9954b = i5 % 128;
                if (i5 % 2 != 0) {
                    return cVar;
                }
                throw null;
            }

            @JvmStatic
            public static String d(boolean z2) {
                int i2 = 2 % 2;
                int i3 = f9954b + 79;
                int i4 = i3 % 128;
                f9955d = i4;
                Object obj = null;
                if (i3 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (!z2) {
                    return "manual";
                }
                int i5 = i4 + 121;
                f9954b = i5 % 128;
                if (i5 % 2 != 0) {
                    return "auto";
                }
                obj.hashCode();
                throw null;
            }

            public /* synthetic */ b(byte b2) {
                this();
            }
        }

        static {
            new b((byte) 0);
            int i2 = f9949h + 63;
            f9950j = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 32 / 0;
            }
        }

        @JvmStatic
        public static final String d(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f9948c + 57;
            f9947b = i3 % 128;
            int i4 = i3 % 2;
            String strD = b.d(z2);
            int i5 = f9948c + 19;
            f9947b = i5 % 128;
            int i6 = i5 % 2;
            return strD;
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            int i3 = f9947b;
            int i4 = i3 + 23;
            f9948c = i4 % 128;
            int i5 = i4 % 2;
            if (this == obj) {
                int i6 = i3 + 47;
                f9948c = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 5 / 0;
                }
                return true;
            }
            if (!(obj instanceof a)) {
                int i8 = i3 + 71;
                f9948c = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            a aVar = (a) obj;
            if (this.f9952d != aVar.f9952d || this.f9951a != aVar.f9951a) {
                return false;
            }
            if (!(!Intrinsics.areEqual(this.f9953e, aVar.f9953e))) {
                return true;
            }
            int i10 = f9947b + 61;
            f9948c = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = f9947b + 49;
            f9948c = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode = (((Integer.hashCode(this.f9952d) * 31) + Integer.hashCode(this.f9951a)) * 31) + this.f9953e.hashCode();
            int i5 = f9948c + 65;
            f9947b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 43 / 0;
            }
            return iHashCode;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f9948c + 99;
            f9947b = i3 % 128;
            if (i3 % 2 == 0) {
                return "CameraSettings(width=" + this.f9952d + ", height=" + this.f9951a + ", focusMode=" + this.f9953e + ")";
            }
            int i4 = 19 / 0;
            return "CameraSettings(width=" + this.f9952d + ", height=" + this.f9951a + ", focusMode=" + this.f9953e + ")";
        }
    }

    @Serializable
    public static final class j {

        /* JADX INFO: renamed from: a */
        private static int f10042a = 0;

        /* JADX INFO: renamed from: d */
        private static int f10043d = 1;

        /* JADX INFO: renamed from: e */
        private static final KSerializer<Object>[] f10044e;

        /* JADX INFO: renamed from: g */
        private static int f10045g = 1;

        /* JADX INFO: renamed from: i */
        private static int f10046i = 0;

        /* JADX INFO: renamed from: b */
        private final Status f10047b;

        /* JADX INFO: renamed from: c */
        private final Status f10048c;

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public static final class b implements GeneratedSerializer<j> {

            /* JADX INFO: renamed from: a */
            private static final /* synthetic */ PluginGeneratedSerialDescriptor f10049a;

            /* JADX INFO: renamed from: b */
            private static int f10050b = 1;

            /* JADX INFO: renamed from: c */
            public static final b f10051c;

            /* JADX INFO: renamed from: d */
            private static int f10052d = 0;

            /* JADX INFO: renamed from: e */
            private static int f10053e = 0;

            /* JADX INFO: renamed from: h */
            private static int f10054h = 1;

            static {
                b bVar = new b();
                f10051c = bVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.incode.welcome_sdk.data.remote.beans.Metadata.Iad", bVar, 2);
                pluginGeneratedSerialDescriptor.addElement("zc", false);
                pluginGeneratedSerialDescriptor.addElement("ecc", false);
                f10049a = pluginGeneratedSerialDescriptor;
                int i2 = f10053e + 123;
                f10054h = i2 % 128;
                int i3 = i2 % 2;
            }

            private b() {
            }

            private j b(Decoder decoder) {
                Status status;
                int i2;
                Status status2;
                int i3 = 2 % 2;
                int i4 = f10050b + 5;
                f10052d = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNullParameter(decoder, "");
                SerialDescriptor descriptor = getDescriptor();
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
                KSerializer[] kSerializerArrA = j.a();
                Status status3 = null;
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    int i6 = f10052d + 37;
                    f10050b = i6 % 128;
                    int i7 = i6 % 2;
                    status2 = (Status) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, kSerializerArrA[0], null);
                    status = (Status) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, kSerializerArrA[1], null);
                    int i8 = f10050b + 97;
                    f10052d = i8 % 128;
                    int i9 = i8 % 2;
                    i2 = 3;
                } else {
                    status = null;
                    i2 = 0;
                    boolean z2 = true;
                    while (z2) {
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                        if (iDecodeElementIndex == -1) {
                            z2 = false;
                        } else if (iDecodeElementIndex == 0) {
                            status3 = (Status) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, kSerializerArrA[0], status3);
                            i2 |= 1;
                        } else {
                            if (iDecodeElementIndex != 1) {
                                throw new UnknownFieldException(iDecodeElementIndex);
                            }
                            status = (Status) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, kSerializerArrA[1], status);
                            i2 |= 2;
                        }
                    }
                    status2 = status3;
                }
                compositeDecoderBeginStructure.endStructure(descriptor);
                return new j(i2, status2, status);
            }

            private void b(Encoder encoder, j jVar) {
                int i2 = 2 % 2;
                int i3 = f10052d + 125;
                f10050b = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(encoder, "");
                Intrinsics.checkNotNullParameter(jVar, "");
                SerialDescriptor descriptor = getDescriptor();
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
                j.b(jVar, compositeEncoderBeginStructure, descriptor);
                compositeEncoderBeginStructure.endStructure(descriptor);
                int i5 = f10050b + 111;
                f10052d = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer<?>[] childSerializers() {
                int i2 = 2 % 2;
                int i3 = f10052d + 111;
                f10050b = i3 % 128;
                int i4 = i3 % 2;
                KSerializer[] kSerializerArrA = j.a();
                KSerializer<?>[] kSerializerArr = {BuiltinSerializersKt.getNullable(kSerializerArrA[0]), BuiltinSerializersKt.getNullable(kSerializerArrA[1])};
                int i5 = f10052d + 37;
                f10050b = i5 % 128;
                if (i5 % 2 != 0) {
                    return kSerializerArr;
                }
                throw null;
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            public final /* synthetic */ Object deserialize(Decoder decoder) {
                int i2 = 2 % 2;
                int i3 = f10050b + 85;
                f10052d = i3 % 128;
                int i4 = i3 % 2;
                j jVarB = b(decoder);
                int i5 = f10052d + 107;
                f10050b = i5 % 128;
                if (i5 % 2 != 0) {
                    return jVarB;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public final SerialDescriptor getDescriptor() {
                int i2 = 2 % 2;
                int i3 = f10050b + 97;
                int i4 = i3 % 128;
                f10052d = i4;
                int i5 = i3 % 2;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10049a;
                int i6 = i4 + 35;
                f10050b = i6 % 128;
                int i7 = i6 % 2;
                return pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.SerializationStrategy
            public final /* synthetic */ void serialize(Encoder encoder, Object obj) {
                int i2 = 2 % 2;
                int i3 = f10050b + 1;
                f10052d = i3 % 128;
                int i4 = i3 % 2;
                b(encoder, (j) obj);
                if (i4 != 0) {
                    int i5 = 48 / 0;
                }
                int i6 = f10052d + 121;
                f10050b = i6 % 128;
                int i7 = i6 % 2;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer<?>[] typeParametersSerializers() {
                int i2 = 2 % 2;
                int i3 = f10052d + 117;
                f10050b = i3 % 128;
                if (i3 % 2 != 0) {
                    return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
                }
                GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
                throw null;
            }
        }

        public static final class e {

            /* JADX INFO: renamed from: c */
            private static int f10055c = 0;

            /* JADX INFO: renamed from: e */
            private static int f10056e = 1;

            private e() {
            }

            public final KSerializer<j> serializer() {
                int i2 = 2 % 2;
                int i3 = f10056e + 21;
                f10055c = i3 % 128;
                int i4 = i3 % 2;
                b bVar = b.f10051c;
                if (i4 != 0) {
                    int i5 = 94 / 0;
                }
                return bVar;
            }

            public /* synthetic */ e(byte b2) {
                this();
            }
        }

        static {
            new e((byte) 0);
            f10044e = new KSerializer[]{EnumsKt.createSimpleEnumSerializer("com.incode.welcome_sdk.results.Status", Status.values()), EnumsKt.createSimpleEnumSerializer("com.incode.welcome_sdk.results.Status", Status.values())};
            int i2 = f10045g + 59;
            f10046i = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ j(int i2, Status status, Status status2) {
            if (3 != (i2 & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i2, 3, b.f10051c.getDescriptor());
            }
            this.f10048c = status;
            this.f10047b = status2;
        }

        public j(Status status, Status status2) {
            this.f10048c = status;
            this.f10047b = status2;
        }

        public static final /* synthetic */ KSerializer[] a() {
            KSerializer<Object>[] kSerializerArr;
            int i2 = 2 % 2;
            int i3 = f10042a + 57;
            int i4 = i3 % 128;
            f10043d = i4;
            if (i3 % 2 == 0) {
                kSerializerArr = f10044e;
                int i5 = 92 / 0;
            } else {
                kSerializerArr = f10044e;
            }
            int i6 = i4 + 79;
            f10042a = i6 % 128;
            int i7 = i6 % 2;
            return kSerializerArr;
        }

        @JvmStatic
        public static final /* synthetic */ void b(j jVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object> kSerializer;
            int i2 = 2 % 2;
            int i3 = f10043d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f10042a = i3 % 128;
            if (i3 % 2 != 0) {
                KSerializer<Object>[] kSerializerArr = f10044e;
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], jVar.f10048c);
                kSerializer = kSerializerArr[0];
            } else {
                KSerializer<Object>[] kSerializerArr2 = f10044e;
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr2[0], jVar.f10048c);
                kSerializer = kSerializerArr2[1];
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializer, jVar.f10047b);
            int i4 = f10042a + 57;
            f10043d = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            int i3 = f10042a;
            int i4 = i3 + 73;
            f10043d = i4 % 128;
            if (i4 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            if (this.f10048c == jVar.f10048c) {
                return this.f10047b == jVar.f10047b;
            }
            int i5 = i3 + 53;
            f10043d = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public final int hashCode() {
            int iHashCode;
            int i2 = 2 % 2;
            int i3 = f10042a + 83;
            int i4 = i3 % 128;
            f10043d = i4;
            if (i3 % 2 == 0) {
                throw null;
            }
            Status status = this.f10048c;
            int iHashCode2 = 0;
            if (status == null) {
                int i5 = i4 + 41;
                f10042a = i5 % 128;
                int i6 = i5 % 2;
                iHashCode = 0;
            } else {
                iHashCode = status.hashCode();
            }
            int i7 = iHashCode * 31;
            Status status2 = this.f10047b;
            if (status2 == null) {
                int i8 = f10043d + 45;
                f10042a = i8 % 128;
                int i9 = i8 % 2;
            } else {
                iHashCode2 = status2.hashCode();
            }
            int i10 = i7 + iHashCode2;
            int i11 = f10043d + 41;
            f10042a = i11 % 128;
            int i12 = i11 % 2;
            return i10;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f10042a + 59;
            f10043d = i3 % 128;
            if (i3 % 2 != 0) {
                return "Iad(zc=" + this.f10048c + ", ecc=" + this.f10047b + ")";
            }
            String str = "Iad(zc=" + this.f10048c + ", ecc=" + this.f10047b + ")";
            throw null;
        }
    }

    @Serializable
    public static final class e {

        /* JADX INFO: renamed from: a */
        private static int f9991a = 1;

        /* JADX INFO: renamed from: b */
        private static final KSerializer<Object>[] f9992b;

        /* JADX INFO: renamed from: d */
        private static int f9993d = 0;

        /* JADX INFO: renamed from: e */
        private static int f9994e = 0;

        /* JADX INFO: renamed from: f */
        private static int f9995f = 1;

        /* JADX INFO: renamed from: c */
        private final Status f9996c;

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public static final class c implements GeneratedSerializer<e> {

            /* JADX INFO: renamed from: a */
            public static final c f9997a;

            /* JADX INFO: renamed from: b */
            private static int f9998b = 0;

            /* JADX INFO: renamed from: c */
            private static int f9999c = 1;

            /* JADX INFO: renamed from: d */
            private static final /* synthetic */ PluginGeneratedSerialDescriptor f10000d;

            /* JADX INFO: renamed from: e */
            private static int f10001e = 0;

            /* JADX INFO: renamed from: f */
            private static int f10002f = 1;

            static {
                c cVar = new c();
                f9997a = cVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.incode.welcome_sdk.data.remote.beans.Metadata.Behavior", cVar, 1);
                pluginGeneratedSerialDescriptor.addElement("ms", false);
                f10000d = pluginGeneratedSerialDescriptor;
                int i2 = f10002f + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f10001e = i2 % 128;
                int i3 = i2 % 2;
            }

            private c() {
            }

            private void d(Encoder encoder, e eVar) {
                int i2 = 2 % 2;
                int i3 = f9998b + 75;
                f9999c = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(encoder, "");
                Intrinsics.checkNotNullParameter(eVar, "");
                SerialDescriptor descriptor = getDescriptor();
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
                e.e(eVar, compositeEncoderBeginStructure, descriptor);
                compositeEncoderBeginStructure.endStructure(descriptor);
                int i5 = f9998b + 19;
                f9999c = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            private e e(Decoder decoder) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(decoder, "");
                SerialDescriptor descriptor = getDescriptor();
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
                KSerializer[] kSerializerArrB = e.b();
                Status status = null;
                int i3 = 1;
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    int i4 = f9999c + 59;
                    f9998b = i4 % 128;
                    if (i4 % 2 != 0) {
                        status = (Status) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, kSerializerArrB[0], null);
                        i3 = 0;
                    } else {
                        status = (Status) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, kSerializerArrB[0], null);
                    }
                } else {
                    boolean z2 = true;
                    int i5 = 0;
                    while (!(!z2)) {
                        int i6 = f9999c + 77;
                        f9998b = i6 % 128;
                        int i7 = i6 % 2;
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                        if (iDecodeElementIndex == -1) {
                            z2 = false;
                        } else {
                            if (iDecodeElementIndex != 0) {
                                throw new UnknownFieldException(iDecodeElementIndex);
                            }
                            status = (Status) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, kSerializerArrB[0], status);
                            i5 = 1;
                        }
                    }
                    i3 = i5;
                }
                compositeDecoderBeginStructure.endStructure(descriptor);
                e eVar = new e(i3, status);
                int i8 = f9999c + 19;
                f9998b = i8 % 128;
                int i9 = i8 % 2;
                return eVar;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer<?>[] childSerializers() {
                int i2 = 2 % 2;
                int i3 = f9999c + 9;
                f9998b = i3 % 128;
                if (i3 % 2 == 0) {
                    return new KSerializer[]{BuiltinSerializersKt.getNullable(e.b()[0])};
                }
                KSerializer<?>[] kSerializerArr = new KSerializer[1];
                kSerializerArr[1] = BuiltinSerializersKt.getNullable(e.b()[0]);
                return kSerializerArr;
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            public final /* synthetic */ Object deserialize(Decoder decoder) {
                int i2 = 2 % 2;
                int i3 = f9999c + 15;
                f9998b = i3 % 128;
                if (i3 % 2 != 0) {
                    e(decoder);
                    throw null;
                }
                e eVarE = e(decoder);
                int i4 = f9999c + 97;
                f9998b = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 6 / 0;
                }
                return eVarE;
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public final SerialDescriptor getDescriptor() {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor;
                int i2 = 2 % 2;
                int i3 = f9999c;
                int i4 = i3 + 85;
                f9998b = i4 % 128;
                if (i4 % 2 != 0) {
                    pluginGeneratedSerialDescriptor = f10000d;
                    int i5 = 62 / 0;
                } else {
                    pluginGeneratedSerialDescriptor = f10000d;
                }
                int i6 = i3 + 17;
                f9998b = i6 % 128;
                int i7 = i6 % 2;
                return pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.SerializationStrategy
            public final /* synthetic */ void serialize(Encoder encoder, Object obj) {
                int i2 = 2 % 2;
                int i3 = f9999c + 83;
                f9998b = i3 % 128;
                int i4 = i3 % 2;
                d(encoder, (e) obj);
                int i5 = f9999c + 101;
                f9998b = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer<?>[] typeParametersSerializers() {
                int i2 = 2 % 2;
                int i3 = f9999c + 71;
                f9998b = i3 % 128;
                int i4 = i3 % 2;
                KSerializer<?>[] kSerializerArrTypeParametersSerializers = GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
                int i5 = f9998b + 5;
                f9999c = i5 % 128;
                if (i5 % 2 != 0) {
                    return kSerializerArrTypeParametersSerializers;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.data.remote.beans.s$e$e */
        public static final class C0238e {

            /* JADX INFO: renamed from: a */
            private static int f10003a = 0;

            /* JADX INFO: renamed from: b */
            private static int f10004b = 1;

            private C0238e() {
            }

            public final KSerializer<e> serializer() {
                int i2 = 2 % 2;
                int i3 = f10004b + 101;
                f10003a = i3 % 128;
                int i4 = i3 % 2;
                c cVar = c.f9997a;
                int i5 = f10003a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f10004b = i5 % 128;
                if (i5 % 2 != 0) {
                    return cVar;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public /* synthetic */ C0238e(byte b2) {
                this();
            }
        }

        static {
            new C0238e((byte) 0);
            f9992b = new KSerializer[]{EnumsKt.createSimpleEnumSerializer("com.incode.welcome_sdk.results.Status", Status.values())};
            int i2 = f9995f + 99;
            f9993d = i2 % 128;
            int i3 = i2 % 2;
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ e(int i2, Status status) {
            if (1 != (i2 & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i2, 1, c.f9997a.getDescriptor());
            }
            this.f9996c = status;
        }

        public e(Status status) {
            this.f9996c = status;
        }

        public static final /* synthetic */ KSerializer[] b() {
            int i2 = 2 % 2;
            int i3 = f9991a;
            int i4 = i3 + 123;
            f9994e = i4 % 128;
            int i5 = i4 % 2;
            KSerializer<Object>[] kSerializerArr = f9992b;
            int i6 = i3 + 63;
            f9994e = i6 % 128;
            int i7 = i6 % 2;
            return kSerializerArr;
        }

        @JvmStatic
        public static final /* synthetic */ void e(e eVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            int i2 = 2 % 2;
            int i3 = f9994e + 59;
            f9991a = i3 % 128;
            if (i3 % 2 == 0) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, f9992b[0], eVar.f9996c);
            } else {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, f9992b[0], eVar.f9996c);
            }
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            int i3 = f9994e + 5;
            int i4 = i3 % 128;
            f9991a = i4;
            if (i3 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e) || this.f9996c != ((e) obj).f9996c) {
                return false;
            }
            int i5 = i4 + 115;
            f9994e = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 36 / 0;
            }
            return true;
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = f9994e;
            int i4 = i3 + 41;
            f9991a = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                throw null;
            }
            Status status = this.f9996c;
            if (status != null) {
                return status.hashCode();
            }
            int i5 = i3 + 85;
            f9991a = i5 % 128;
            if (i5 % 2 != 0) {
                return 0;
            }
            obj.hashCode();
            throw null;
        }

        public final String toString() {
            String str;
            int i2 = 2 % 2;
            int i3 = f9991a + 61;
            f9994e = i3 % 128;
            if (i3 % 2 != 0) {
                str = "Behavior(ms=" + this.f9996c + ")";
                int i4 = 25 / 0;
            } else {
                str = "Behavior(ms=" + this.f9996c + ")";
            }
            int i5 = f9991a + 71;
            f9994e = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final String b() {
        int i2 = 2 % 2;
        int i3 = f9935k + 109;
        f9936m = i3 % 128;
        int i4 = i3 % 2;
        Json json = f9934h;
        json.getSerializersModule();
        String strEncodeToString = json.encodeToString(f9933a.serializer(), this);
        int i5 = f9935k + 89;
        f9936m = i5 % 128;
        int i6 = i5 % 2;
        return strEncodeToString;
    }

    public static final class g {

        /* JADX INFO: renamed from: a */
        public static int f10019a = 0;

        /* JADX INFO: renamed from: b */
        private static int f10020b = 1;

        /* JADX INFO: renamed from: c */
        private static int f10021c = 0;

        /* JADX INFO: renamed from: d */
        public static int f10022d = 0;

        private g() {
        }

        public final KSerializer<s> serializer() {
            int i2 = 2 % 2;
            int i3 = f10020b + 69;
            f10021c = i3 % 128;
            int i4 = i3 % 2;
            c cVar = c.f9973c;
            int i5 = f10020b + 71;
            f10021c = i5 % 128;
            int i6 = i5 % 2;
            return cVar;
        }

        public static int e() {
            int i2 = f10022d;
            int i3 = i2 % 8046710;
            f10022d = i2 + 1;
            if (i3 != 0) {
                return f10019a;
            }
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            f10019a = iFreeMemory;
            return iFreeMemory;
        }

        public /* synthetic */ g(byte b2) {
            this();
        }
    }

    static {
        int i2 = f9938o + 87;
        f9937n = i2 % 128;
        int i3 = i2 % 2;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f9936m + 15;
            f9935k = i3 % 128;
            return i3 % 2 != 0;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f9940c != sVar.f9940c) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f9939b, sVar.f9939b)) {
            int i4 = f9936m + 27;
            f9935k = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.f9942e, sVar.f9942e)) {
            return false;
        }
        if (Intrinsics.areEqual(this.f9941d, sVar.f9941d)) {
            if (Intrinsics.areEqual(this.f9945i, sVar.f9945i)) {
                return Intrinsics.areEqual(this.f9946j, sVar.f9946j) && Intrinsics.areEqual(this.f9943f, sVar.f9943f) && Intrinsics.areEqual(this.f9944g, sVar.f9944g);
            }
            int i5 = f9936m + 61;
            f9935k = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = f9936m + 95;
        int i8 = i7 % 128;
        f9935k = i8;
        boolean z2 = i7 % 2 == 0;
        int i9 = i8 + 89;
        f9936m = i9 % 128;
        if (i9 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i2 = 2 % 2;
        int i3 = f9935k + 41;
        f9936m = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode2 = ((((((((((((Long.hashCode(this.f9940c) * 31) + this.f9939b.hashCode()) * 31) + this.f9942e.hashCode()) * 31) + this.f9941d.hashCode()) * 31) + this.f9945i.hashCode()) * 31) + this.f9946j.hashCode()) * 31) + this.f9943f.hashCode()) * 31;
        String str = this.f9944g;
        if (str == null) {
            int i5 = f9935k + 107;
            f9936m = i5 % 128;
            iHashCode = i5 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9935k + 9;
        f9936m = i3 % 128;
        if (i3 % 2 == 0) {
            return "Metadata(timestamp=" + this.f9940c + ", sdkPlatform=" + this.f9939b + ", sdkVersion=" + this.f9942e + ", device=" + this.f9941d + ", camera=" + this.f9945i + ", iad=" + this.f9946j + ", behavior=" + this.f9943f + ", captureMode=" + this.f9944g + ")";
        }
        String str = "Metadata(timestamp=" + this.f9940c + ", sdkPlatform=" + this.f9939b + ", sdkVersion=" + this.f9942e + ", device=" + this.f9941d + ", camera=" + this.f9945i + ", iad=" + this.f9946j + ", behavior=" + this.f9943f + ", captureMode=" + this.f9944g + ")";
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
