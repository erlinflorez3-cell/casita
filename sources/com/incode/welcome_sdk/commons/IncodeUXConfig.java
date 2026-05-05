package com.incode.welcome_sdk.commons;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class IncodeUXConfig {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a */
    private static int f4576a = 0;

    /* JADX INFO: renamed from: b */
    private static int f4577b = 0;

    /* JADX INFO: renamed from: c */
    private static int f4578c = 1;

    /* JADX INFO: renamed from: d */
    private static int f4579d = 1;
    private final CloseButtonPosition closeButtonPosition;
    private final HelpButtonPosition helpButtonPosition;
    private final boolean showFooter;
    public static final e Companion = new e((byte) 0);
    private static final KSerializer<Object>[] $childSerializers = {null, CloseButtonPosition.Companion.serializer(), HelpButtonPosition.Companion.serializer()};
    private static final Json json = JsonKt.Json$default(null, c.f4586c, 1, null);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final class d implements GeneratedSerializer<IncodeUXConfig> {

        /* JADX INFO: renamed from: a */
        private static int f4589a = 1;

        /* JADX INFO: renamed from: b */
        private static int f4590b = 0;

        /* JADX INFO: renamed from: c */
        public static final d f4591c;

        /* JADX INFO: renamed from: d */
        private static int f4592d = 0;

        /* JADX INFO: renamed from: e */
        private static final /* synthetic */ PluginGeneratedSerialDescriptor f4593e;

        /* JADX INFO: renamed from: h */
        private static int f4594h = 1;

        static {
            d dVar = new d();
            f4591c = dVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.incode.welcome_sdk.commons.IncodeUXConfig", dVar, 3);
            pluginGeneratedSerialDescriptor.addElement("showFooter", true);
            pluginGeneratedSerialDescriptor.addElement("closeButtonPosition", true);
            pluginGeneratedSerialDescriptor.addElement("helpButtonPosition", true);
            f4593e = pluginGeneratedSerialDescriptor;
            int i2 = f4594h + 47;
            f4590b = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 43 / 0;
            }
        }

        private d() {
        }

        private IncodeUXConfig a(Decoder decoder) {
            HelpButtonPosition helpButtonPosition;
            boolean zDecodeBooleanElement;
            int i2;
            CloseButtonPosition closeButtonPosition;
            int i3 = 2 % 2;
            int i4 = f4592d + 61;
            f4589a = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.checkNotNullParameter(decoder, "");
            SerialDescriptor descriptor = getDescriptor();
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
            KSerializer[] kSerializerArrAccess$get$childSerializers$cp = IncodeUXConfig.access$get$childSerializers$cp();
            CloseButtonPosition closeButtonPosition2 = null;
            if (!(!compositeDecoderBeginStructure.decodeSequentially())) {
                int i6 = f4589a + 59;
                f4592d = i6 % 128;
                int i7 = i6 % 2;
                zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(descriptor, 0);
                closeButtonPosition = (CloseButtonPosition) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, kSerializerArrAccess$get$childSerializers$cp[1], null);
                helpButtonPosition = (HelpButtonPosition) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 2, kSerializerArrAccess$get$childSerializers$cp[2], null);
                int i8 = f4589a + 45;
                f4592d = i8 % 128;
                int i9 = i8 % 2;
                i2 = 7;
            } else {
                boolean z2 = true;
                helpButtonPosition = null;
                zDecodeBooleanElement = false;
                i2 = 0;
                while (!(!z2)) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                    if (iDecodeElementIndex == -1) {
                        z2 = false;
                    } else if (iDecodeElementIndex == 0) {
                        zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(descriptor, 0);
                        i2 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        closeButtonPosition2 = (CloseButtonPosition) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, kSerializerArrAccess$get$childSerializers$cp[1], closeButtonPosition2);
                        i2 |= 2;
                    } else {
                        if (iDecodeElementIndex != 2) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        helpButtonPosition = (HelpButtonPosition) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 2, kSerializerArrAccess$get$childSerializers$cp[2], helpButtonPosition);
                        i2 |= 4;
                    }
                }
                closeButtonPosition = closeButtonPosition2;
            }
            compositeDecoderBeginStructure.endStructure(descriptor);
            IncodeUXConfig incodeUXConfig = new IncodeUXConfig(i2, zDecodeBooleanElement, closeButtonPosition, helpButtonPosition, (SerializationConstructorMarker) null);
            int i10 = f4592d + 27;
            f4589a = i10 % 128;
            int i11 = i10 % 2;
            return incodeUXConfig;
        }

        private void a(Encoder encoder, IncodeUXConfig incodeUXConfig) {
            int i2 = 2 % 2;
            int i3 = f4592d + 71;
            f4589a = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(encoder, "");
                Intrinsics.checkNotNullParameter(incodeUXConfig, "");
                SerialDescriptor descriptor = getDescriptor();
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
                IncodeUXConfig.write$Self$onboard_release(incodeUXConfig, compositeEncoderBeginStructure, descriptor);
                compositeEncoderBeginStructure.endStructure(descriptor);
                return;
            }
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(incodeUXConfig, "");
            SerialDescriptor descriptor2 = getDescriptor();
            CompositeEncoder compositeEncoderBeginStructure2 = encoder.beginStructure(descriptor2);
            IncodeUXConfig.write$Self$onboard_release(incodeUXConfig, compositeEncoderBeginStructure2, descriptor2);
            compositeEncoderBeginStructure2.endStructure(descriptor2);
            int i4 = 49 / 0;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            int i2 = 2 % 2;
            int i3 = f4589a + 73;
            f4592d = i3 % 128;
            int i4 = i3 % 2;
            KSerializer<?>[] kSerializerArrAccess$get$childSerializers$cp = IncodeUXConfig.access$get$childSerializers$cp();
            KSerializer<?>[] kSerializerArr = {BooleanSerializer.INSTANCE, kSerializerArrAccess$get$childSerializers$cp[1], kSerializerArrAccess$get$childSerializers$cp[2]};
            int i5 = f4589a + 7;
            f4592d = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 96 / 0;
            }
            return kSerializerArr;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public final /* synthetic */ Object deserialize(Decoder decoder) {
            int i2 = 2 % 2;
            int i3 = f4589a + 97;
            f4592d = i3 % 128;
            int i4 = i3 % 2;
            IncodeUXConfig incodeUXConfigA = a(decoder);
            int i5 = f4592d + 77;
            f4589a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 64 / 0;
            }
            return incodeUXConfigA;
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            int i2 = 2 % 2;
            int i3 = f4589a;
            int i4 = i3 + 35;
            f4592d = i4 % 128;
            if (i4 % 2 != 0) {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f4593e;
                throw null;
            }
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor2 = f4593e;
            int i5 = i3 + 85;
            f4592d = i5 % 128;
            int i6 = i5 % 2;
            return pluginGeneratedSerialDescriptor2;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final /* synthetic */ void serialize(Encoder encoder, Object obj) {
            int i2 = 2 % 2;
            int i3 = f4589a + 25;
            f4592d = i3 % 128;
            int i4 = i3 % 2;
            a(encoder, (IncodeUXConfig) obj);
            if (i4 != 0) {
                int i5 = 84 / 0;
            }
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] typeParametersSerializers() {
            int i2 = 2 % 2;
            int i3 = f4592d + 77;
            f4589a = i3 % 128;
            int i4 = i3 % 2;
            KSerializer<?>[] kSerializerArrTypeParametersSerializers = GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            int i5 = f4589a + 9;
            f4592d = i5 % 128;
            int i6 = i5 % 2;
            return kSerializerArrTypeParametersSerializers;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ IncodeUXConfig(int i2, boolean z2, CloseButtonPosition closeButtonPosition, HelpButtonPosition helpButtonPosition, SerializationConstructorMarker serializationConstructorMarker) {
        this.showFooter = (i2 & 1) == 0 ? true : z2;
        if ((i2 & 2) == 0) {
            this.closeButtonPosition = CloseButtonPosition.TOP_RIGHT;
        } else {
            this.closeButtonPosition = closeButtonPosition;
        }
        if ((i2 & 4) == 0) {
            this.helpButtonPosition = HelpButtonPosition.BOTTOM_RIGHT;
        } else {
            this.helpButtonPosition = helpButtonPosition;
        }
    }

    public IncodeUXConfig(boolean z2, CloseButtonPosition closeButtonPosition, HelpButtonPosition helpButtonPosition) {
        Intrinsics.checkNotNullParameter(closeButtonPosition, "");
        Intrinsics.checkNotNullParameter(helpButtonPosition, "");
        this.showFooter = z2;
        this.closeButtonPosition = closeButtonPosition;
        this.helpButtonPosition = helpButtonPosition;
    }

    public static final /* synthetic */ KSerializer[] access$get$childSerializers$cp() {
        KSerializer<Object>[] kSerializerArr;
        int i2 = 2 % 2;
        int i3 = f4576a + 101;
        int i4 = i3 % 128;
        f4578c = i4;
        if (i3 % 2 == 0) {
            kSerializerArr = $childSerializers;
            int i5 = 82 / 0;
        } else {
            kSerializerArr = $childSerializers;
        }
        int i6 = i4 + 71;
        f4576a = i6 % 128;
        if (i6 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Json access$getJson$cp() {
        int i2 = 2 % 2;
        int i3 = f4576a;
        int i4 = i3 + 37;
        f4578c = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Json json2 = json;
        int i5 = i3 + 61;
        f4578c = i5 % 128;
        int i6 = i5 % 2;
        return json2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void write$Self$onboard_release(com.incode.welcome_sdk.commons.IncodeUXConfig r6, kotlinx.serialization.encoding.CompositeEncoder r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.commons.IncodeUXConfig.f4578c
            int r1 = r0 + 65
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.IncodeUXConfig.f4576a = r0
            int r1 = r1 % r2
            kotlinx.serialization.KSerializer<java.lang.Object>[] r5 = com.incode.welcome_sdk.commons.IncodeUXConfig.$childSerializers
            r4 = 0
            boolean r0 = r7.shouldEncodeElementDefault(r8, r4)
            r3 = 1
            if (r0 == 0) goto L7e
            int r0 = com.incode.welcome_sdk.commons.IncodeUXConfig.f4578c
            int r1 = r0 + 121
        L1a:
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.IncodeUXConfig.f4576a = r0
            int r1 = r1 % r2
            int r0 = com.incode.welcome_sdk.commons.IncodeUXConfig.f4576a
            int r1 = r0 + 87
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.IncodeUXConfig.f4578c = r0
            int r1 = r1 % r2
            boolean r0 = r6.showFooter
            r7.encodeBooleanElement(r8, r4, r0)
        L2d:
            boolean r0 = r7.shouldEncodeElementDefault(r8, r3)
            if (r0 == 0) goto L6e
        L33:
            r1 = r5[r3]
            kotlinx.serialization.SerializationStrategy r1 = (kotlinx.serialization.SerializationStrategy) r1
            com.incode.welcome_sdk.commons.CloseButtonPosition r0 = r6.closeButtonPosition
            r7.encodeSerializableElement(r8, r3, r1, r0)
        L3c:
            boolean r0 = r7.shouldEncodeElementDefault(r8, r2)
            if (r0 == 0) goto L67
        L42:
            int r0 = com.incode.welcome_sdk.commons.IncodeUXConfig.f4578c
            int r1 = r0 + 103
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.IncodeUXConfig.f4576a = r0
            int r1 = r1 % r2
            r1 = r5[r2]
            kotlinx.serialization.SerializationStrategy r1 = (kotlinx.serialization.SerializationStrategy) r1
            com.incode.welcome_sdk.commons.HelpButtonPosition r0 = r6.helpButtonPosition
            r7.encodeSerializableElement(r8, r2, r1, r0)
            int r0 = com.incode.welcome_sdk.commons.IncodeUXConfig.f4576a
            int r1 = r0 + 77
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.IncodeUXConfig.f4578c = r0
            int r1 = r1 % r2
        L5d:
            int r0 = com.incode.welcome_sdk.commons.IncodeUXConfig.f4578c
            int r1 = r0 + 19
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.IncodeUXConfig.f4576a = r0
            int r1 = r1 % r2
            return
        L67:
            com.incode.welcome_sdk.commons.HelpButtonPosition r1 = r6.helpButtonPosition
            com.incode.welcome_sdk.commons.HelpButtonPosition r0 = com.incode.welcome_sdk.commons.HelpButtonPosition.BOTTOM_RIGHT
            if (r1 == r0) goto L5d
            goto L42
        L6e:
            com.incode.welcome_sdk.commons.CloseButtonPosition r1 = r6.closeButtonPosition
            com.incode.welcome_sdk.commons.CloseButtonPosition r0 = com.incode.welcome_sdk.commons.CloseButtonPosition.TOP_RIGHT
            if (r1 == r0) goto L3c
            int r0 = com.incode.welcome_sdk.commons.IncodeUXConfig.f4576a
            int r1 = r0 + 119
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.IncodeUXConfig.f4578c = r0
            int r1 = r1 % r2
            goto L33
        L7e:
            boolean r0 = r6.showFooter
            if (r0 == r3) goto L2d
            int r0 = com.incode.welcome_sdk.commons.IncodeUXConfig.f4578c
            int r1 = r0 + 87
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.IncodeUXConfig.write$Self$onboard_release(com.incode.welcome_sdk.commons.IncodeUXConfig, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final boolean getShowFooter() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f4578c;
        int i4 = i3 + 35;
        f4576a = i4 % 128;
        if (i4 % 2 != 0) {
            z2 = this.showFooter;
            int i5 = 5 / 0;
        } else {
            z2 = this.showFooter;
        }
        int i6 = i3 + 65;
        f4576a = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public /* synthetic */ IncodeUXConfig(boolean z2, CloseButtonPosition closeButtonPosition, HelpButtonPosition helpButtonPosition, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z2, (i2 & 2) != 0 ? CloseButtonPosition.TOP_RIGHT : closeButtonPosition, (i2 & 4) != 0 ? HelpButtonPosition.BOTTOM_RIGHT : helpButtonPosition);
    }

    public final CloseButtonPosition getCloseButtonPosition() {
        int i2 = 2 % 2;
        int i3 = f4578c;
        int i4 = i3 + 23;
        f4576a = i4 % 128;
        int i5 = i4 % 2;
        CloseButtonPosition closeButtonPosition = this.closeButtonPosition;
        int i6 = i3 + 53;
        f4576a = i6 % 128;
        int i7 = i6 % 2;
        return closeButtonPosition;
    }

    public final HelpButtonPosition getHelpButtonPosition() {
        int i2 = 2 % 2;
        int i3 = f4576a;
        int i4 = i3 + 47;
        f4578c = i4 % 128;
        int i5 = i4 % 2;
        HelpButtonPosition helpButtonPosition = this.helpButtonPosition;
        int i6 = i3 + 95;
        f4578c = i6 % 128;
        if (i6 % 2 != 0) {
            return helpButtonPosition;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Builder {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: b */
        private static int f4580b = 17 % 128;

        /* JADX INFO: renamed from: c */
        private static int f4581c = 1;

        /* JADX INFO: renamed from: d */
        private static int f4582d = 0;

        /* JADX INFO: renamed from: e */
        private static int f4583e = 0;
        private boolean showFooter = true;
        private CloseButtonPosition closeButtonPosition = CloseButtonPosition.TOP_RIGHT;
        private HelpButtonPosition helpButtonPosition = HelpButtonPosition.BOTTOM_RIGHT;

        public final Builder setShowFooter(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f4581c + 89;
            int i4 = i3 % 128;
            f4582d = i4;
            if (i3 % 2 != 0) {
                this.showFooter = z2;
                int i5 = 9 / 0;
            } else {
                this.showFooter = z2;
            }
            int i6 = i4 + 73;
            f4581c = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final Builder setCloseButtonPosition(CloseButtonPosition closeButtonPosition) {
            int i2 = 2 % 2;
            int i3 = f4582d + 33;
            f4581c = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(closeButtonPosition, "");
                this.closeButtonPosition = closeButtonPosition;
                int i4 = 64 / 0;
            } else {
                Intrinsics.checkNotNullParameter(closeButtonPosition, "");
                this.closeButtonPosition = closeButtonPosition;
            }
            int i5 = f4581c + 33;
            f4582d = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setHelpButtonPosition(HelpButtonPosition helpButtonPosition) {
            int i2 = 2 % 2;
            int i3 = f4582d + 5;
            f4581c = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(helpButtonPosition, "");
                this.helpButtonPosition = helpButtonPosition;
                int i4 = 80 / 0;
            } else {
                Intrinsics.checkNotNullParameter(helpButtonPosition, "");
                this.helpButtonPosition = helpButtonPosition;
            }
            return this;
        }

        public final IncodeUXConfig build() {
            int i2 = 2 % 2;
            IncodeUXConfig incodeUXConfig = new IncodeUXConfig(this.showFooter, this.closeButtonPosition, this.helpButtonPosition);
            int i3 = f4581c + 55;
            f4582d = i3 % 128;
            int i4 = i3 % 2;
            return incodeUXConfig;
        }

        static {
            int i2 = 17 % 2;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: d */
        private static int f4595d = 0;

        /* JADX INFO: renamed from: e */
        private static int f4596e = 1;

        private e() {
        }

        public final KSerializer<IncodeUXConfig> serializer() {
            int i2 = 2 % 2;
            int i3 = f4595d + 65;
            f4596e = i3 % 128;
            int i4 = i3 % 2;
            d dVar = d.f4591c;
            if (i4 != 0) {
                return dVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @JvmStatic
        public final IncodeUXConfig fromJson(String str) {
            int i2 = 2 % 2;
            int i3 = f4596e + 63;
            f4595d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            IncodeUXConfig incodeUXConfig = (IncodeUXConfig) IncodeUXConfig.access$getJson$cp().decodeFromString(serializer(), str);
            int i5 = f4595d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f4596e = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 57 / 0;
            }
            return incodeUXConfig;
        }

        @JvmStatic
        public final String toJson(IncodeUXConfig incodeUXConfig) {
            int i2 = 2 % 2;
            int i3 = f4595d + 19;
            f4596e = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(incodeUXConfig, "");
                return IncodeUXConfig.access$getJson$cp().encodeToString(serializer(), incodeUXConfig);
            }
            Intrinsics.checkNotNullParameter(incodeUXConfig, "");
            IncodeUXConfig.access$getJson$cp().encodeToString(serializer(), incodeUXConfig);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ e(byte b2) {
            this();
        }
    }

    static {
        Object obj = null;
        int i2 = f4577b + 49;
        f4579d = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final class c extends Lambda implements Function1<JsonBuilder, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f4584a = 0;

        /* JADX INFO: renamed from: b */
        private static int f4585b = 1;

        /* JADX INFO: renamed from: c */
        public static final c f4586c = new c();

        /* JADX INFO: renamed from: d */
        private static int f4587d = 1;

        /* JADX INFO: renamed from: e */
        private static int f4588e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
            int i2 = 2 % 2;
            int i3 = f4585b + 19;
            f4588e = i3 % 128;
            int i4 = i3 % 2;
            b(jsonBuilder);
            Unit unit = Unit.INSTANCE;
            int i5 = f4588e + 51;
            f4585b = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private static void b(JsonBuilder jsonBuilder) {
            int i2 = 2 % 2;
            int i3 = f4585b + 111;
            f4588e = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(jsonBuilder, "");
            jsonBuilder.setIgnoreUnknownKeys(true);
            int i5 = f4585b + 81;
            f4588e = i5 % 128;
            int i6 = i5 % 2;
        }

        static {
            int i2 = f4584a + 17;
            f4587d = i2 % 128;
            int i3 = i2 % 2;
        }

        c() {
            super(1);
        }
    }

    @JvmStatic
    public static final String toJson(IncodeUXConfig incodeUXConfig) {
        int i2 = 2 % 2;
        int i3 = f4578c + 63;
        f4576a = i3 % 128;
        if (i3 % 2 != 0) {
            Companion.toJson(incodeUXConfig);
            throw null;
        }
        String json2 = Companion.toJson(incodeUXConfig);
        int i4 = f4576a + 89;
        f4578c = i4 % 128;
        int i5 = i4 % 2;
        return json2;
    }

    @JvmStatic
    public static final IncodeUXConfig fromJson(String str) {
        int i2 = 2 % 2;
        int i3 = f4576a + 17;
        f4578c = i3 % 128;
        int i4 = i3 % 2;
        IncodeUXConfig incodeUXConfigFromJson = Companion.fromJson(str);
        int i5 = f4576a + 117;
        f4578c = i5 % 128;
        int i6 = i5 % 2;
        return incodeUXConfigFromJson;
    }

    public IncodeUXConfig() {
        this(false, (CloseButtonPosition) null, (HelpButtonPosition) null, 7, (DefaultConstructorMarker) null);
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f4578c;
        int i4 = i3 + 21;
        f4576a = i4 % 128;
        int i5 = i4 % 2;
        if (this == obj) {
            int i6 = i3 + 63;
            f4576a = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof IncodeUXConfig)) {
            return false;
        }
        IncodeUXConfig incodeUXConfig = (IncodeUXConfig) obj;
        if (this.showFooter != incodeUXConfig.showFooter) {
            int i8 = i3 + 51;
            f4576a = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.closeButtonPosition == incodeUXConfig.closeButtonPosition) {
            return this.helpButtonPosition == incodeUXConfig.helpButtonPosition;
        }
        int i10 = i3 + 99;
        f4576a = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f4576a + 39;
        f4578c = i3 % 128;
        int iHashCode = i3 % 2 == 0 ? (((Boolean.hashCode(this.showFooter) >> 1) / this.closeButtonPosition.hashCode()) + 5) >> this.helpButtonPosition.hashCode() : (((Boolean.hashCode(this.showFooter) * 31) + this.closeButtonPosition.hashCode()) * 31) + this.helpButtonPosition.hashCode();
        int i4 = f4576a + 113;
        f4578c = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f4578c + 81;
        f4576a = i3 % 128;
        if (i3 % 2 == 0) {
            return "IncodeUXConfig(showFooter=" + this.showFooter + ", closeButtonPosition=" + this.closeButtonPosition + ", helpButtonPosition=" + this.helpButtonPosition + ")";
        }
        String str = "IncodeUXConfig(showFooter=" + this.showFooter + ", closeButtonPosition=" + this.closeButtonPosition + ", helpButtonPosition=" + this.helpButtonPosition + ")";
        throw null;
    }

    public static /* synthetic */ IncodeUXConfig copy$default(IncodeUXConfig incodeUXConfig, boolean z2, CloseButtonPosition closeButtonPosition, HelpButtonPosition helpButtonPosition, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = f4576a + 111;
            f4578c = i4 % 128;
            int i5 = i4 % 2;
            z2 = incodeUXConfig.showFooter;
        }
        if ((i2 & 2) != 0) {
            int i6 = f4576a + 37;
            f4578c = i6 % 128;
            int i7 = i6 % 2;
            closeButtonPosition = incodeUXConfig.closeButtonPosition;
        }
        if ((i2 & 4) != 0) {
            int i8 = f4578c + 1;
            f4576a = i8 % 128;
            if (i8 % 2 != 0) {
                HelpButtonPosition helpButtonPosition2 = incodeUXConfig.helpButtonPosition;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            helpButtonPosition = incodeUXConfig.helpButtonPosition;
        }
        return incodeUXConfig.copy(z2, closeButtonPosition, helpButtonPosition);
    }

    public final IncodeUXConfig copy(boolean z2, CloseButtonPosition closeButtonPosition, HelpButtonPosition helpButtonPosition) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(closeButtonPosition, "");
        Intrinsics.checkNotNullParameter(helpButtonPosition, "");
        IncodeUXConfig incodeUXConfig = new IncodeUXConfig(z2, closeButtonPosition, helpButtonPosition);
        int i3 = f4578c + 79;
        f4576a = i3 % 128;
        if (i3 % 2 == 0) {
            return incodeUXConfig;
        }
        throw null;
    }

    public final HelpButtonPosition component3() {
        int i2 = 2 % 2;
        int i3 = f4578c + 39;
        f4576a = i3 % 128;
        if (i3 % 2 == 0) {
            return this.helpButtonPosition;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CloseButtonPosition component2() {
        int i2 = 2 % 2;
        int i3 = f4578c + 21;
        f4576a = i3 % 128;
        if (i3 % 2 == 0) {
            return this.closeButtonPosition;
        }
        throw null;
    }

    public final boolean component1() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f4578c;
        int i4 = i3 + 103;
        f4576a = i4 % 128;
        if (i4 % 2 != 0) {
            z2 = this.showFooter;
            int i5 = 63 / 0;
        } else {
            z2 = this.showFooter;
        }
        int i6 = i3 + 63;
        f4576a = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        throw null;
    }
}
