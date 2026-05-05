package com.incode.welcome_sdk.commons.theme;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnit;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.protocol.Device;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class Typography {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5538a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5539b = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5540d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5541e = 1;
    private final Family family;
    private final Weight fontWeight;
    private final LetterSpacing letterSpacing;
    public static final c Companion = new c(0);
    private static final KSerializer<Object>[] $childSerializers = {new ContextualSerializer(Reflection.getOrCreateKotlinClass(Family.class), Family.c.f5547b, new KSerializer[0]), null, null};

    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f5578c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f5579e = 1;

        private c() {
        }

        public final KSerializer<Typography> serializer() {
            int i2 = 2 % 2;
            int i3 = f5579e + 35;
            f5578c = i3 % 128;
            int i4 = i3 % 2;
            e eVar = e.f5583d;
            if (i4 == 0) {
                return eVar;
            }
            throw null;
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final class e implements GeneratedSerializer<Typography> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f5580a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f5581b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ PluginGeneratedSerialDescriptor f5582c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f5583d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f5584e = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f5585i = 1;

        static {
            e eVar = new e();
            f5583d = eVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.incode.welcome_sdk.commons.theme.Typography", eVar, 3);
            pluginGeneratedSerialDescriptor.addElement(Device.JsonKeys.FAMILY, true);
            pluginGeneratedSerialDescriptor.addElement(ViewProps.LETTER_SPACING, true);
            pluginGeneratedSerialDescriptor.addElement(ViewProps.FONT_WEIGHT, true);
            f5582c = pluginGeneratedSerialDescriptor;
            int i2 = f5584e + 25;
            f5585i = i2 % 128;
            int i3 = i2 % 2;
        }

        private e() {
        }

        private Typography a(Decoder decoder) {
            int i2;
            Weight weight;
            Family family;
            LetterSpacing letterSpacing;
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(decoder, "");
            SerialDescriptor descriptor = getDescriptor();
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
            KSerializer[] kSerializerArrAccess$get$childSerializers$cp = Typography.access$get$childSerializers$cp();
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                family = (Family) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, kSerializerArrAccess$get$childSerializers$cp[0], null);
                letterSpacing = (LetterSpacing) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, LetterSpacing.b.f5562e, null);
                weight = (Weight) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 2, Weight.b.f5570a, null);
                i2 = 7;
            } else {
                boolean z2 = true;
                i2 = 0;
                weight = null;
                family = null;
                letterSpacing = null;
                while (z2) {
                    int i4 = f5580a + 123;
                    f5581b = i4 % 128;
                    if (i4 % 2 != 0) {
                        compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                        throw null;
                    }
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                    if (iDecodeElementIndex == -1) {
                        int i5 = f5581b + 95;
                        f5580a = i5 % 128;
                        int i6 = i5 % 2;
                        z2 = false;
                    } else if (iDecodeElementIndex == 0) {
                        family = (Family) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, kSerializerArrAccess$get$childSerializers$cp[0], family);
                        i2 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        letterSpacing = (LetterSpacing) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, LetterSpacing.b.f5562e, letterSpacing);
                        i2 |= 2;
                    } else {
                        if (iDecodeElementIndex != 2) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        weight = (Weight) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 2, Weight.b.f5570a, weight);
                        i2 |= 4;
                    }
                }
            }
            compositeDecoderBeginStructure.endStructure(descriptor);
            return new Typography(i2, family, letterSpacing, weight, (SerializationConstructorMarker) null);
        }

        private void c(Encoder encoder, Typography typography) {
            int i2 = 2 % 2;
            int i3 = f5581b + 3;
            f5580a = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(encoder, "");
                Intrinsics.checkNotNullParameter(typography, "");
                SerialDescriptor descriptor = getDescriptor();
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
                Typography.write$Self$onboard_release(typography, compositeEncoderBeginStructure, descriptor);
                compositeEncoderBeginStructure.endStructure(descriptor);
                throw null;
            }
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(typography, "");
            SerialDescriptor descriptor2 = getDescriptor();
            CompositeEncoder compositeEncoderBeginStructure2 = encoder.beginStructure(descriptor2);
            Typography.write$Self$onboard_release(typography, compositeEncoderBeginStructure2, descriptor2);
            compositeEncoderBeginStructure2.endStructure(descriptor2);
            int i4 = f5580a + 105;
            f5581b = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            int i2 = 2 % 2;
            int i3 = f5580a + 1;
            f5581b = i3 % 128;
            int i4 = i3 % 2;
            KSerializer<?>[] kSerializerArr = {Typography.access$get$childSerializers$cp()[0], LetterSpacing.b.f5562e, Weight.b.f5570a};
            int i5 = f5581b + 107;
            f5580a = i5 % 128;
            int i6 = i5 % 2;
            return kSerializerArr;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public final /* synthetic */ Object deserialize(Decoder decoder) {
            int i2 = 2 % 2;
            int i3 = f5580a + 49;
            f5581b = i3 % 128;
            int i4 = i3 % 2;
            Typography typographyA = a(decoder);
            int i5 = f5580a + 23;
            f5581b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 22 / 0;
            }
            return typographyA;
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            int i2 = 2 % 2;
            int i3 = f5581b;
            int i4 = i3 + 45;
            f5580a = i4 % 128;
            int i5 = i4 % 2;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f5582c;
            int i6 = i3 + 23;
            f5580a = i6 % 128;
            int i7 = i6 % 2;
            return pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final /* synthetic */ void serialize(Encoder encoder, Object obj) {
            int i2 = 2 % 2;
            int i3 = f5580a + 85;
            f5581b = i3 % 128;
            int i4 = i3 % 2;
            c(encoder, (Typography) obj);
            if (i4 != 0) {
                throw null;
            }
            int i5 = f5580a + 11;
            f5581b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 30 / 0;
            }
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] typeParametersSerializers() {
            int i2 = 2 % 2;
            int i3 = f5581b + 51;
            f5580a = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
                obj.hashCode();
                throw null;
            }
            KSerializer<?>[] kSerializerArrTypeParametersSerializers = GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            int i4 = f5580a + 61;
            f5581b = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializerArrTypeParametersSerializers;
            }
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i2 = f5538a + 35;
        f5541e = i2 % 128;
        int i3 = i2 % 2;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Typography(int i2, Family family, LetterSpacing letterSpacing, Weight weight, SerializationConstructorMarker serializationConstructorMarker) {
        Weight weight2 = weight;
        LetterSpacing letterSpacing2 = letterSpacing;
        Family family2 = family;
        if ((i2 & 1) == 0) {
            family2 = new Family((FontFamily) null, (FontFamily) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }
        this.family = family2;
        if ((i2 & 2) == 0) {
            letterSpacing2 = new LetterSpacing(0L, 0L, 0L, 0L, 15, (DefaultConstructorMarker) null);
        }
        this.letterSpacing = letterSpacing2;
        if ((i2 & 4) == 0) {
            weight2 = new Weight((FontWeight) null, (FontWeight) null, (FontWeight) null, (FontWeight) null, 15, (DefaultConstructorMarker) null);
        }
        this.fontWeight = weight2;
    }

    public Typography(Family family, LetterSpacing letterSpacing, Weight weight) {
        Intrinsics.checkNotNullParameter(family, "");
        Intrinsics.checkNotNullParameter(letterSpacing, "");
        Intrinsics.checkNotNullParameter(weight, "");
        this.family = family;
        this.letterSpacing = letterSpacing;
        this.fontWeight = weight;
    }

    public static final /* synthetic */ KSerializer[] access$get$childSerializers$cp() {
        int i2 = 2 % 2;
        int i3 = f5540d + 41;
        f5539b = i3 % 128;
        if (i3 % 2 != 0) {
            return $childSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void write$Self$onboard_release(com.incode.welcome_sdk.commons.theme.Typography r15, kotlinx.serialization.encoding.CompositeEncoder r16, kotlinx.serialization.descriptors.SerialDescriptor r17) {
        /*
            r0 = 2
            int r1 = r0 % r0
            kotlinx.serialization.KSerializer<java.lang.Object>[] r9 = com.incode.welcome_sdk.commons.theme.Typography.$childSerializers
            r8 = 0
            r1 = r17
            r2 = r16
            boolean r4 = r2.shouldEncodeElementDefault(r1, r8)
            r5 = 3
            r3 = r15
            if (r4 == 0) goto L9e
        L12:
            r6 = r9[r8]
            kotlinx.serialization.SerializationStrategy r6 = (kotlinx.serialization.SerializationStrategy) r6
            com.incode.welcome_sdk.commons.theme.Typography$Family r4 = r3.family
            r2.encodeSerializableElement(r1, r8, r6, r4)
        L1b:
            r4 = 1
            boolean r6 = r2.shouldEncodeElementDefault(r1, r4)
            if (r6 == 0) goto L83
            int r6 = com.incode.welcome_sdk.commons.theme.Typography.f5539b
            int r7 = r6 + 53
            int r6 = r7 % 128
            com.incode.welcome_sdk.commons.theme.Typography.f5540d = r6
            int r7 = r7 % r0
        L2b:
            com.incode.welcome_sdk.commons.theme.Typography$LetterSpacing$b r7 = com.incode.welcome_sdk.commons.theme.Typography.LetterSpacing.b.f5562e
            kotlinx.serialization.SerializationStrategy r7 = (kotlinx.serialization.SerializationStrategy) r7
            com.incode.welcome_sdk.commons.theme.Typography$LetterSpacing r6 = r3.letterSpacing
            r2.encodeSerializableElement(r1, r4, r7, r6)
        L34:
            boolean r6 = r2.shouldEncodeElementDefault(r1, r0)
            if (r6 == 0) goto L62
        L3a:
            if (r4 == 0) goto L55
            int r4 = com.incode.welcome_sdk.commons.theme.Typography.f5539b
            int r7 = r4 + 123
            int r4 = r7 % 128
            com.incode.welcome_sdk.commons.theme.Typography.f5540d = r4
            int r7 = r7 % r0
            r6 = 23
            if (r7 == 0) goto L60
            r4 = 0
        L4a:
            if (r4 == r6) goto L56
            com.incode.welcome_sdk.commons.theme.Typography$Weight$b r4 = com.incode.welcome_sdk.commons.theme.Typography.Weight.b.f5570a
            kotlinx.serialization.SerializationStrategy r4 = (kotlinx.serialization.SerializationStrategy) r4
            com.incode.welcome_sdk.commons.theme.Typography$Weight r0 = r3.fontWeight
            r2.encodeSerializableElement(r1, r5, r4, r0)
        L55:
            return
        L56:
            com.incode.welcome_sdk.commons.theme.Typography$Weight$b r4 = com.incode.welcome_sdk.commons.theme.Typography.Weight.b.f5570a
            kotlinx.serialization.SerializationStrategy r4 = (kotlinx.serialization.SerializationStrategy) r4
            com.incode.welcome_sdk.commons.theme.Typography$Weight r3 = r3.fontWeight
            r2.encodeSerializableElement(r1, r0, r4, r3)
            goto L55
        L60:
            r4 = r6
            goto L4a
        L62:
            com.incode.welcome_sdk.commons.theme.Typography$Weight r6 = r3.fontWeight
            com.incode.welcome_sdk.commons.theme.Typography$Weight r7 = new com.incode.welcome_sdk.commons.theme.Typography$Weight
            r12 = 15
            r13 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
            if (r6 != 0) goto L81
            int r6 = com.incode.welcome_sdk.commons.theme.Typography.f5539b
            int r7 = r6 + 51
            int r6 = r7 % 128
            com.incode.welcome_sdk.commons.theme.Typography.f5540d = r6
            int r7 = r7 % r0
            if (r7 == 0) goto L3a
        L81:
            r4 = 0
            goto L3a
        L83:
            com.incode.welcome_sdk.commons.theme.Typography$LetterSpacing r6 = r3.letterSpacing
            com.incode.welcome_sdk.commons.theme.Typography$LetterSpacing r7 = new com.incode.welcome_sdk.commons.theme.Typography$LetterSpacing
            r16 = 15
            r17 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r7 = r7
            r7.<init>(r8, r10, r12, r14, r16, r17)
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
            if (r6 != 0) goto L34
            goto L2b
        L9e:
            com.incode.welcome_sdk.commons.theme.Typography$Family r7 = r3.family
            com.incode.welcome_sdk.commons.theme.Typography$Family r6 = new com.incode.welcome_sdk.commons.theme.Typography$Family
            r4 = 0
            r6.<init>(r4, r4, r5, r4)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r6)
            if (r4 != 0) goto Lae
            goto L12
        Lae:
            int r4 = com.incode.welcome_sdk.commons.theme.Typography.f5539b
            int r6 = r4 + 113
            int r4 = r6 % 128
            com.incode.welcome_sdk.commons.theme.Typography.f5540d = r4
            int r6 = r6 % r0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.theme.Typography.write$Self$onboard_release(com.incode.welcome_sdk.commons.theme.Typography, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public /* synthetic */ Typography(Family family, LetterSpacing letterSpacing, Weight weight, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        Weight weight2 = weight;
        LetterSpacing letterSpacing2 = letterSpacing;
        Family family2 = family;
        if ((i2 & 1) != 0) {
            family2 = new Family((FontFamily) null, (FontFamily) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }
        if ((i2 & 2) != 0) {
            letterSpacing2 = new LetterSpacing(0L, 0L, 0L, 0L, 15, (DefaultConstructorMarker) null);
        }
        if ((i2 & 4) != 0) {
            weight2 = new Weight((FontWeight) null, (FontWeight) null, (FontWeight) null, (FontWeight) null, 15, (DefaultConstructorMarker) null);
        }
        this(family2, letterSpacing2, weight2);
    }

    public final Family getFamily() {
        Family family;
        int i2 = 2 % 2;
        int i3 = f5540d;
        int i4 = i3 + 105;
        f5539b = i4 % 128;
        if (i4 % 2 == 0) {
            family = this.family;
            int i5 = 1 / 0;
        } else {
            family = this.family;
        }
        int i6 = i3 + 11;
        f5539b = i6 % 128;
        int i7 = i6 % 2;
        return family;
    }

    public final LetterSpacing getLetterSpacing() {
        int i2 = 2 % 2;
        int i3 = f5540d;
        int i4 = i3 + 17;
        f5539b = i4 % 128;
        int i5 = i4 % 2;
        LetterSpacing letterSpacing = this.letterSpacing;
        int i6 = i3 + 43;
        f5539b = i6 % 128;
        if (i6 % 2 != 0) {
            return letterSpacing;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Weight getFontWeight() {
        int i2 = 2 % 2;
        int i3 = f5540d + 1;
        f5539b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.fontWeight;
        }
        throw null;
    }

    @Serializable
    public static final class Weight {
        public static final int $stable = 0;
        public static final d Companion = new d(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f5566a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f5567c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f5568d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f5569e = 0;
        private final FontWeight bold;
        private final FontWeight extraBold;
        private final FontWeight medium;
        private final FontWeight regular;

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public static final class b implements GeneratedSerializer<Weight> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f5570a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f5571b = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f5572c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f5573d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ PluginGeneratedSerialDescriptor f5574e;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static int f5575h = 1;

            static {
                b bVar = new b();
                f5570a = bVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.incode.welcome_sdk.commons.theme.Typography.Weight", bVar, 4);
                pluginGeneratedSerialDescriptor.addElement("regular", true);
                pluginGeneratedSerialDescriptor.addElement("medium", true);
                pluginGeneratedSerialDescriptor.addElement("bold", true);
                pluginGeneratedSerialDescriptor.addElement("extraBold", true);
                f5574e = pluginGeneratedSerialDescriptor;
                int i2 = f5573d + 79;
                f5575h = i2 % 128;
                int i3 = i2 % 2;
            }

            private b() {
            }

            private void c(Encoder encoder, Weight weight) {
                int i2 = 2 % 2;
                int i3 = f5572c + 23;
                f5571b = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(encoder, "");
                    Intrinsics.checkNotNullParameter(weight, "");
                    SerialDescriptor descriptor = getDescriptor();
                    CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
                    Weight.write$Self$onboard_release(weight, compositeEncoderBeginStructure, descriptor);
                    compositeEncoderBeginStructure.endStructure(descriptor);
                    return;
                }
                Intrinsics.checkNotNullParameter(encoder, "");
                Intrinsics.checkNotNullParameter(weight, "");
                SerialDescriptor descriptor2 = getDescriptor();
                CompositeEncoder compositeEncoderBeginStructure2 = encoder.beginStructure(descriptor2);
                Weight.write$Self$onboard_release(weight, compositeEncoderBeginStructure2, descriptor2);
                compositeEncoderBeginStructure2.endStructure(descriptor2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private Weight e(Decoder decoder) {
                int i2;
                FontWeight fontWeight;
                FontWeight fontWeight2;
                FontWeight fontWeight3;
                FontWeight fontWeight4;
                int i3 = 2 % 2;
                int i4 = f5571b + 47;
                f5572c = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNullParameter(decoder, "");
                SerialDescriptor descriptor = getDescriptor();
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
                FontWeight fontWeight5 = null;
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    fontWeight4 = (FontWeight) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, com.incode.welcome_sdk.commons.theme.c.f5599e, null);
                    fontWeight = (FontWeight) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, com.incode.welcome_sdk.commons.theme.c.f5599e, null);
                    fontWeight2 = (FontWeight) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 2, com.incode.welcome_sdk.commons.theme.c.f5599e, null);
                    fontWeight3 = (FontWeight) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 3, com.incode.welcome_sdk.commons.theme.c.f5599e, null);
                    i2 = 15;
                } else {
                    i2 = 0;
                    boolean z2 = true;
                    fontWeight = null;
                    fontWeight2 = null;
                    fontWeight3 = null;
                    while (z2) {
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                        if (iDecodeElementIndex == -1) {
                            int i6 = f5572c + 19;
                            f5571b = i6 % 128;
                            if (i6 % 2 == 0) {
                                int i7 = 3 / 2;
                            }
                            z2 = false;
                        } else if (iDecodeElementIndex == 0) {
                            fontWeight5 = (FontWeight) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, com.incode.welcome_sdk.commons.theme.c.f5599e, fontWeight5);
                            i2 |= 1;
                        } else if (iDecodeElementIndex == 1) {
                            fontWeight = (FontWeight) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, com.incode.welcome_sdk.commons.theme.c.f5599e, fontWeight);
                            i2 |= 2;
                        } else if (iDecodeElementIndex == 2) {
                            fontWeight2 = (FontWeight) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 2, com.incode.welcome_sdk.commons.theme.c.f5599e, fontWeight2);
                            i2 |= 4;
                        } else {
                            if (iDecodeElementIndex != 3) {
                                throw new UnknownFieldException(iDecodeElementIndex);
                            }
                            fontWeight3 = (FontWeight) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 3, com.incode.welcome_sdk.commons.theme.c.f5599e, fontWeight3);
                            i2 |= 8;
                            int i8 = f5572c + 51;
                            f5571b = i8 % 128;
                            int i9 = i8 % 2;
                        }
                    }
                    fontWeight4 = fontWeight5;
                }
                compositeDecoderBeginStructure.endStructure(descriptor);
                return new Weight(i2, fontWeight4, fontWeight, fontWeight2, fontWeight3, (SerializationConstructorMarker) null);
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer<?>[] childSerializers() {
                int i2 = 2 % 2;
                int i3 = f5572c + 43;
                f5571b = i3 % 128;
                int i4 = i3 % 2;
                KSerializer<?>[] kSerializerArr = {com.incode.welcome_sdk.commons.theme.c.f5599e, com.incode.welcome_sdk.commons.theme.c.f5599e, com.incode.welcome_sdk.commons.theme.c.f5599e, com.incode.welcome_sdk.commons.theme.c.f5599e};
                int i5 = f5571b + 99;
                f5572c = i5 % 128;
                int i6 = i5 % 2;
                return kSerializerArr;
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            public final /* synthetic */ Object deserialize(Decoder decoder) {
                int i2 = 2 % 2;
                int i3 = f5571b + 55;
                f5572c = i3 % 128;
                if (i3 % 2 != 0) {
                    e(decoder);
                    throw null;
                }
                Weight weightE = e(decoder);
                int i4 = f5572c + 77;
                f5571b = i4 % 128;
                int i5 = i4 % 2;
                return weightE;
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public final SerialDescriptor getDescriptor() {
                int i2 = 2 % 2;
                int i3 = f5571b;
                int i4 = i3 + 71;
                f5572c = i4 % 128;
                int i5 = i4 % 2;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f5574e;
                int i6 = i3 + 123;
                f5572c = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 20 / 0;
                }
                return pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.SerializationStrategy
            public final /* synthetic */ void serialize(Encoder encoder, Object obj) {
                int i2 = 2 % 2;
                int i3 = f5572c + 57;
                f5571b = i3 % 128;
                int i4 = i3 % 2;
                c(encoder, (Weight) obj);
                if (i4 == 0) {
                    throw null;
                }
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer<?>[] typeParametersSerializers() {
                int i2 = 2 % 2;
                int i3 = f5572c + 65;
                f5571b = i3 % 128;
                int i4 = i3 % 2;
                KSerializer<?>[] kSerializerArrTypeParametersSerializers = GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
                int i5 = f5571b + 61;
                f5572c = i5 % 128;
                if (i5 % 2 == 0) {
                    return kSerializerArrTypeParametersSerializers;
                }
                throw null;
            }
        }

        public static final class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f5576a = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f5577d = 1;

            private d() {
            }

            public final KSerializer<Weight> serializer() {
                int i2 = 2 % 2;
                int i3 = f5576a + 71;
                f5577d = i3 % 128;
                if (i3 % 2 == 0) {
                    b bVar = b.f5570a;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                b bVar2 = b.f5570a;
                int i4 = f5576a + 7;
                f5577d = i4 % 128;
                int i5 = i4 % 2;
                return bVar2;
            }

            public /* synthetic */ d(byte b2) {
                this();
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ Weight(int i2, FontWeight fontWeight, FontWeight fontWeight2, FontWeight fontWeight3, FontWeight fontWeight4, SerializationConstructorMarker serializationConstructorMarker) {
            this.regular = (i2 & 1) == 0 ? IncodeTypefaceTokens.INSTANCE.getWeightRegular() : fontWeight;
            if ((i2 & 2) == 0) {
                this.medium = IncodeTypefaceTokens.INSTANCE.getWeightMedium();
            } else {
                this.medium = fontWeight2;
            }
            if ((i2 & 4) == 0) {
                this.bold = IncodeTypefaceTokens.INSTANCE.getWeightBold();
            } else {
                this.bold = fontWeight3;
            }
            if ((i2 & 8) == 0) {
                this.extraBold = IncodeTypefaceTokens.INSTANCE.getWeightExtraBold();
            } else {
                this.extraBold = fontWeight4;
            }
        }

        public Weight(FontWeight fontWeight, FontWeight fontWeight2, FontWeight fontWeight3, FontWeight fontWeight4) {
            Intrinsics.checkNotNullParameter(fontWeight, "");
            Intrinsics.checkNotNullParameter(fontWeight2, "");
            Intrinsics.checkNotNullParameter(fontWeight3, "");
            Intrinsics.checkNotNullParameter(fontWeight4, "");
            this.regular = fontWeight;
            this.medium = fontWeight2;
            this.bold = fontWeight3;
            this.extraBold = fontWeight4;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final /* synthetic */ void write$Self$onboard_release(com.incode.welcome_sdk.commons.theme.Typography.Weight r6, kotlinx.serialization.encoding.CompositeEncoder r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
            /*
                r5 = 2
                int r0 = r5 % r5
                int r0 = com.incode.welcome_sdk.commons.theme.Typography.Weight.f5567c
                int r1 = r0 + 33
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.theme.Typography.Weight.f5568d = r0
                int r1 = r1 % r5
                r4 = 0
                boolean r0 = r7.shouldEncodeElementDefault(r8, r4)
                if (r0 == 0) goto Lb0
                int r2 = com.incode.welcome_sdk.commons.theme.Typography.Weight.f5568d
                int r1 = r2 + 109
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.theme.Typography.Weight.f5567c = r0
                int r1 = r1 % r5
                int r1 = r2 + 41
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.theme.Typography.Weight.f5567c = r0
                int r1 = r1 % r5
            L23:
                int r0 = com.incode.welcome_sdk.commons.theme.Typography.Weight.f5568d
                int r1 = r0 + 85
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.theme.Typography.Weight.f5567c = r0
                int r1 = r1 % r5
                com.incode.welcome_sdk.commons.theme.c r1 = com.incode.welcome_sdk.commons.theme.c.f5599e
                kotlinx.serialization.SerializationStrategy r1 = (kotlinx.serialization.SerializationStrategy) r1
                androidx.compose.ui.text.font.FontWeight r0 = r6.regular
                r7.encodeSerializableElement(r8, r4, r1, r0)
            L35:
                r3 = 1
                boolean r0 = r7.shouldEncodeElementDefault(r8, r3)
                if (r0 == 0) goto La1
            L3c:
                com.incode.welcome_sdk.commons.theme.c r1 = com.incode.welcome_sdk.commons.theme.c.f5599e
                kotlinx.serialization.SerializationStrategy r1 = (kotlinx.serialization.SerializationStrategy) r1
                androidx.compose.ui.text.font.FontWeight r0 = r6.medium
                r7.encodeSerializableElement(r8, r3, r1, r0)
            L45:
                boolean r0 = r7.shouldEncodeElementDefault(r8, r5)
                if (r0 == 0) goto L90
                int r0 = com.incode.welcome_sdk.commons.theme.Typography.Weight.f5568d
                int r1 = r0 + 109
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.theme.Typography.Weight.f5567c = r0
                int r1 = r1 % r5
            L54:
                r0 = r3
            L55:
                if (r0 == 0) goto L60
                com.incode.welcome_sdk.commons.theme.c r1 = com.incode.welcome_sdk.commons.theme.c.f5599e
                kotlinx.serialization.SerializationStrategy r1 = (kotlinx.serialization.SerializationStrategy) r1
                androidx.compose.ui.text.font.FontWeight r0 = r6.bold
                r7.encodeSerializableElement(r8, r5, r1, r0)
            L60:
                r2 = 3
                boolean r0 = r7.shouldEncodeElementDefault(r8, r2)
                if (r0 == 0) goto L7e
                int r0 = com.incode.welcome_sdk.commons.theme.Typography.Weight.f5567c
                int r1 = r0 + 77
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.theme.Typography.Weight.f5568d = r0
                int r1 = r1 % r5
                if (r1 == 0) goto L8e
            L72:
                if (r4 == 0) goto L7d
                com.incode.welcome_sdk.commons.theme.c r1 = com.incode.welcome_sdk.commons.theme.c.f5599e
                kotlinx.serialization.SerializationStrategy r1 = (kotlinx.serialization.SerializationStrategy) r1
                androidx.compose.ui.text.font.FontWeight r0 = r6.extraBold
                r7.encodeSerializableElement(r8, r2, r1, r0)
            L7d:
                return
            L7e:
                androidx.compose.ui.text.font.FontWeight r1 = r6.extraBold
                com.incode.welcome_sdk.commons.theme.IncodeTypefaceTokens r0 = com.incode.welcome_sdk.commons.theme.IncodeTypefaceTokens.INSTANCE
                androidx.compose.ui.text.font.FontWeight r0 = r0.getWeightExtraBold()
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
                r0 = r0 ^ r3
                if (r0 == r3) goto L8e
                goto L72
            L8e:
                r4 = r3
                goto L72
            L90:
                androidx.compose.ui.text.font.FontWeight r1 = r6.bold
                com.incode.welcome_sdk.commons.theme.IncodeTypefaceTokens r0 = com.incode.welcome_sdk.commons.theme.IncodeTypefaceTokens.INSTANCE
                androidx.compose.ui.text.font.FontWeight r0 = r0.getWeightBold()
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
                if (r0 != 0) goto L9f
                goto L54
            L9f:
                r0 = r4
                goto L55
            La1:
                androidx.compose.ui.text.font.FontWeight r1 = r6.medium
                com.incode.welcome_sdk.commons.theme.IncodeTypefaceTokens r0 = com.incode.welcome_sdk.commons.theme.IncodeTypefaceTokens.INSTANCE
                androidx.compose.ui.text.font.FontWeight r0 = r0.getWeightMedium()
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
                if (r0 != 0) goto L45
                goto L3c
            Lb0:
                androidx.compose.ui.text.font.FontWeight r1 = r6.regular
                com.incode.welcome_sdk.commons.theme.IncodeTypefaceTokens r0 = com.incode.welcome_sdk.commons.theme.IncodeTypefaceTokens.INSTANCE
                androidx.compose.ui.text.font.FontWeight r0 = r0.getWeightRegular()
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
                if (r0 != 0) goto L35
                goto L23
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.theme.Typography.Weight.write$Self$onboard_release(com.incode.welcome_sdk.commons.theme.Typography$Weight, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        public /* synthetic */ Weight(FontWeight fontWeight, FontWeight fontWeight2, FontWeight fontWeight3, FontWeight fontWeight4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? IncodeTypefaceTokens.INSTANCE.getWeightRegular() : fontWeight, (i2 & 2) != 0 ? IncodeTypefaceTokens.INSTANCE.getWeightMedium() : fontWeight2, (i2 & 4) != 0 ? IncodeTypefaceTokens.INSTANCE.getWeightBold() : fontWeight3, (i2 & 8) != 0 ? IncodeTypefaceTokens.INSTANCE.getWeightExtraBold() : fontWeight4);
        }

        public final FontWeight getRegular() {
            int i2 = 2 % 2;
            int i3 = f5567c + 97;
            int i4 = i3 % 128;
            f5568d = i4;
            int i5 = i3 % 2;
            FontWeight fontWeight = this.regular;
            int i6 = i4 + 37;
            f5567c = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 17 / 0;
            }
            return fontWeight;
        }

        public final FontWeight getMedium() {
            int i2 = 2 % 2;
            int i3 = f5568d + 115;
            f5567c = i3 % 128;
            if (i3 % 2 != 0) {
                return this.medium;
            }
            throw null;
        }

        public final FontWeight getBold() {
            int i2 = 2 % 2;
            int i3 = f5567c + 39;
            f5568d = i3 % 128;
            int i4 = i3 % 2;
            FontWeight fontWeight = this.bold;
            if (i4 != 0) {
                int i5 = 64 / 0;
            }
            return fontWeight;
        }

        public final FontWeight getExtraBold() {
            int i2 = 2 % 2;
            int i3 = f5568d + 81;
            f5567c = i3 % 128;
            if (i3 % 2 != 0) {
                return this.extraBold;
            }
            throw null;
        }

        static {
            int i2 = f5566a + 45;
            f5569e = i2 % 128;
            int i3 = i2 % 2;
        }

        public Weight() {
            this((FontWeight) null, (FontWeight) null, (FontWeight) null, (FontWeight) null, 15, (DefaultConstructorMarker) null);
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            if (this == obj) {
                int i3 = f5567c + 17;
                f5568d = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
            if (!(obj instanceof Weight)) {
                return false;
            }
            Weight weight = (Weight) obj;
            if (!Intrinsics.areEqual(this.regular, weight.regular)) {
                return false;
            }
            if (Intrinsics.areEqual(this.medium, weight.medium)) {
                if (!Intrinsics.areEqual(this.bold, weight.bold) || !Intrinsics.areEqual(this.extraBold, weight.extraBold)) {
                    return false;
                }
                int i5 = f5567c + 73;
                f5568d = i5 % 128;
                if (i5 % 2 == 0) {
                    return true;
                }
                throw null;
            }
            int i6 = f5567c;
            int i7 = i6 + 37;
            f5568d = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 81;
            f5568d = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = f5567c + 23;
            f5568d = i3 % 128;
            int iHashCode = i3 % 2 != 0 ? (((((this.regular.hashCode() + 28) >>> this.medium.hashCode()) << 1) % this.bold.hashCode()) / 5) << this.extraBold.hashCode() : (((((this.regular.hashCode() * 31) + this.medium.hashCode()) * 31) + this.bold.hashCode()) * 31) + this.extraBold.hashCode();
            int i4 = f5567c + 101;
            f5568d = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f5568d + 115;
            f5567c = i3 % 128;
            if (i3 % 2 == 0) {
                String str = "Weight(regular=" + this.regular + ", medium=" + this.medium + ", bold=" + this.bold + ", extraBold=" + this.extraBold + ")";
                throw null;
            }
            String str2 = "Weight(regular=" + this.regular + ", medium=" + this.medium + ", bold=" + this.bold + ", extraBold=" + this.extraBold + ")";
            int i4 = f5568d + 79;
            f5567c = i4 % 128;
            int i5 = i4 % 2;
            return str2;
        }

        public static /* synthetic */ Weight copy$default(Weight weight, FontWeight fontWeight, FontWeight fontWeight2, FontWeight fontWeight3, FontWeight fontWeight4, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = f5567c + 29;
            int i5 = i4 % 128;
            f5568d = i5;
            int i6 = i4 % 2;
            if ((i2 & 1) != 0) {
                fontWeight = weight.regular;
            }
            if ((i2 & 2) != 0) {
                fontWeight2 = weight.medium;
                int i7 = i5 + 89;
                f5567c = i7 % 128;
                int i8 = i7 % 2;
            }
            if ((i2 & 4) != 0) {
                fontWeight3 = weight.bold;
            }
            if ((i2 & 8) != 0) {
                int i9 = f5567c + 63;
                f5568d = i9 % 128;
                if (i9 % 2 != 0) {
                    FontWeight fontWeight5 = weight.extraBold;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                fontWeight4 = weight.extraBold;
            }
            return weight.copy(fontWeight, fontWeight2, fontWeight3, fontWeight4);
        }

        public final Weight copy(FontWeight fontWeight, FontWeight fontWeight2, FontWeight fontWeight3, FontWeight fontWeight4) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(fontWeight, "");
            Intrinsics.checkNotNullParameter(fontWeight2, "");
            Intrinsics.checkNotNullParameter(fontWeight3, "");
            Intrinsics.checkNotNullParameter(fontWeight4, "");
            Weight weight = new Weight(fontWeight, fontWeight2, fontWeight3, fontWeight4);
            int i3 = f5568d + 65;
            f5567c = i3 % 128;
            if (i3 % 2 != 0) {
                return weight;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final FontWeight component4() {
            int i2 = 2 % 2;
            int i3 = f5567c + 21;
            int i4 = i3 % 128;
            f5568d = i4;
            int i5 = i3 % 2;
            FontWeight fontWeight = this.extraBold;
            int i6 = i4 + 45;
            f5567c = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 86 / 0;
            }
            return fontWeight;
        }

        public final FontWeight component3() {
            int i2 = 2 % 2;
            int i3 = f5568d + 83;
            int i4 = i3 % 128;
            f5567c = i4;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            FontWeight fontWeight = this.bold;
            int i5 = i4 + 27;
            f5568d = i5 % 128;
            if (i5 % 2 == 0) {
                return fontWeight;
            }
            obj.hashCode();
            throw null;
        }

        public final FontWeight component2() {
            int i2 = 2 % 2;
            int i3 = f5567c;
            int i4 = i3 + 103;
            f5568d = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            FontWeight fontWeight = this.medium;
            int i5 = i3 + 51;
            f5568d = i5 % 128;
            int i6 = i5 % 2;
            return fontWeight;
        }

        public final FontWeight component1() {
            int i2 = 2 % 2;
            int i3 = f5567c + 27;
            int i4 = i3 % 128;
            f5568d = i4;
            int i5 = i3 % 2;
            FontWeight fontWeight = this.regular;
            int i6 = i4 + 19;
            f5567c = i6 % 128;
            int i7 = i6 % 2;
            return fontWeight;
        }
    }

    @Serializable
    public static final class Family {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f5542a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f5543b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f5544d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f5545e = 0;
        private final FontFamily display;
        private final FontFamily text;
        public static final e Companion = new e(0);
        private static final KSerializer<Object>[] $childSerializers = {new ContextualSerializer(Reflection.getOrCreateKotlinClass(FontFamily.class), null, new KSerializer[0]), new ContextualSerializer(Reflection.getOrCreateKotlinClass(FontFamily.class), null, new KSerializer[0])};

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public static final class c implements GeneratedSerializer<Family> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f5546a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f5547b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f5548c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f5549d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ PluginGeneratedSerialDescriptor f5550e;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static int f5551h = 1;

            static {
                c cVar = new c();
                f5547b = cVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.incode.welcome_sdk.commons.theme.Typography.Family", cVar, 2);
                pluginGeneratedSerialDescriptor.addElement("text", true);
                pluginGeneratedSerialDescriptor.addElement("display", true);
                f5550e = pluginGeneratedSerialDescriptor;
                int i2 = f5551h + 69;
                f5546a = i2 % 128;
                int i3 = i2 % 2;
            }

            private c() {
            }

            private Family b(Decoder decoder) {
                FontFamily fontFamily;
                FontFamily fontFamily2;
                int i2 = 2;
                int i3 = 2 % 2;
                int i4 = f5548c + 19;
                f5549d = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNullParameter(decoder, "");
                SerialDescriptor descriptor = getDescriptor();
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
                KSerializer[] kSerializerArrAccess$get$childSerializers$cp = Family.access$get$childSerializers$cp();
                SerializationConstructorMarker serializationConstructorMarker = null;
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    int i6 = f5548c + 39;
                    f5549d = i6 % 128;
                    if (i6 % 2 != 0) {
                        fontFamily = (FontFamily) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, kSerializerArrAccess$get$childSerializers$cp[0], null);
                        fontFamily2 = (FontFamily) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, kSerializerArrAccess$get$childSerializers$cp[0], null);
                    } else {
                        fontFamily = (FontFamily) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, kSerializerArrAccess$get$childSerializers$cp[0], null);
                        fontFamily2 = (FontFamily) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, kSerializerArrAccess$get$childSerializers$cp[1], null);
                        i2 = 3;
                    }
                } else {
                    fontFamily = null;
                    fontFamily2 = null;
                    i2 = 0;
                    boolean z2 = true;
                    while (z2) {
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                        if (iDecodeElementIndex == -1) {
                            z2 = false;
                        } else if (iDecodeElementIndex == 0) {
                            fontFamily = (FontFamily) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, kSerializerArrAccess$get$childSerializers$cp[0], fontFamily);
                            i2 |= 1;
                        } else {
                            if (iDecodeElementIndex != 1) {
                                throw new UnknownFieldException(iDecodeElementIndex);
                            }
                            fontFamily2 = (FontFamily) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, kSerializerArrAccess$get$childSerializers$cp[1], fontFamily2);
                            i2 |= 2;
                        }
                    }
                }
                compositeDecoderBeginStructure.endStructure(descriptor);
                return new Family(i2, fontFamily, fontFamily2, serializationConstructorMarker);
            }

            private void b(Encoder encoder, Family family) {
                int i2 = 2 % 2;
                int i3 = f5548c + 51;
                f5549d = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(encoder, "");
                    Intrinsics.checkNotNullParameter(family, "");
                    SerialDescriptor descriptor = getDescriptor();
                    CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
                    Family.write$Self$onboard_release(family, compositeEncoderBeginStructure, descriptor);
                    compositeEncoderBeginStructure.endStructure(descriptor);
                    return;
                }
                Intrinsics.checkNotNullParameter(encoder, "");
                Intrinsics.checkNotNullParameter(family, "");
                SerialDescriptor descriptor2 = getDescriptor();
                CompositeEncoder compositeEncoderBeginStructure2 = encoder.beginStructure(descriptor2);
                Family.write$Self$onboard_release(family, compositeEncoderBeginStructure2, descriptor2);
                compositeEncoderBeginStructure2.endStructure(descriptor2);
                int i4 = 77 / 0;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer<?>[] childSerializers() {
                int i2 = 2 % 2;
                int i3 = f5549d + 35;
                f5548c = i3 % 128;
                if (i3 % 2 != 0) {
                    KSerializer<?>[] kSerializerArrAccess$get$childSerializers$cp = Family.access$get$childSerializers$cp();
                    return new KSerializer[]{kSerializerArrAccess$get$childSerializers$cp[0], kSerializerArrAccess$get$childSerializers$cp[1]};
                }
                KSerializer<?>[] kSerializerArr = new KSerializer[5];
                KSerializer<?> kSerializer = Family.access$get$childSerializers$cp()[1];
                kSerializerArr[0] = kSerializer;
                kSerializerArr[1] = kSerializer;
                return kSerializerArr;
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            public final /* synthetic */ Object deserialize(Decoder decoder) {
                int i2 = 2 % 2;
                int i3 = f5549d + 97;
                f5548c = i3 % 128;
                int i4 = i3 % 2;
                Family familyB = b(decoder);
                int i5 = f5549d + 41;
                f5548c = i5 % 128;
                int i6 = i5 % 2;
                return familyB;
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public final SerialDescriptor getDescriptor() {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor;
                int i2 = 2 % 2;
                int i3 = f5548c;
                int i4 = i3 + 29;
                f5549d = i4 % 128;
                if (i4 % 2 != 0) {
                    pluginGeneratedSerialDescriptor = f5550e;
                    int i5 = 30 / 0;
                } else {
                    pluginGeneratedSerialDescriptor = f5550e;
                }
                int i6 = i3 + 5;
                f5549d = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 27 / 0;
                }
                return pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.SerializationStrategy
            public final /* synthetic */ void serialize(Encoder encoder, Object obj) {
                int i2 = 2 % 2;
                int i3 = f5548c + 101;
                f5549d = i3 % 128;
                int i4 = i3 % 2;
                b(encoder, (Family) obj);
                int i5 = f5549d + 59;
                f5548c = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer<?>[] typeParametersSerializers() {
                int i2 = 2 % 2;
                int i3 = f5548c + 43;
                f5549d = i3 % 128;
                int i4 = i3 % 2;
                KSerializer<?>[] kSerializerArrTypeParametersSerializers = GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
                int i5 = f5548c + 69;
                f5549d = i5 % 128;
                if (i5 % 2 == 0) {
                    return kSerializerArrTypeParametersSerializers;
                }
                throw null;
            }
        }

        public static final class e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f5552b = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f5553d = 1;

            private e() {
            }

            public final KSerializer<Family> serializer() {
                int i2 = 2 % 2;
                int i3 = f5553d + 117;
                f5552b = i3 % 128;
                int i4 = i3 % 2;
                c cVar = c.f5547b;
                int i5 = f5552b + 37;
                f5553d = i5 % 128;
                int i6 = i5 % 2;
                return cVar;
            }

            public /* synthetic */ e(byte b2) {
                this();
            }
        }

        static {
            int i2 = f5542a + 117;
            f5545e = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 61 / 0;
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ Family(int i2, FontFamily fontFamily, FontFamily fontFamily2, SerializationConstructorMarker serializationConstructorMarker) {
            this.text = (i2 & 1) == 0 ? IncodeTypefaceTokens.INSTANCE.getFamilyText() : fontFamily;
            if ((i2 & 2) == 0) {
                this.display = IncodeTypefaceTokens.INSTANCE.getFamilyDisplay();
            } else {
                this.display = fontFamily2;
            }
        }

        public Family(FontFamily fontFamily, FontFamily fontFamily2) {
            Intrinsics.checkNotNullParameter(fontFamily, "");
            Intrinsics.checkNotNullParameter(fontFamily2, "");
            this.text = fontFamily;
            this.display = fontFamily2;
        }

        public static final /* synthetic */ KSerializer[] access$get$childSerializers$cp() {
            int i2 = 2 % 2;
            int i3 = f5543b + 99;
            f5544d = i3 % 128;
            if (i3 % 2 != 0) {
                return $childSerializers;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0084 A[PHI: r4
  0x0084: PHI (r4v1 kotlinx.serialization.KSerializer<java.lang.Object>[]) = 
  (r4v0 kotlinx.serialization.KSerializer<java.lang.Object>[])
  (r4v4 kotlinx.serialization.KSerializer<java.lang.Object>[])
 binds: [B:25:0x0081, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0019 A[PHI: r4
  0x0019: PHI (r4v3 kotlinx.serialization.KSerializer<java.lang.Object>[]) = 
  (r4v0 kotlinx.serialization.KSerializer<java.lang.Object>[])
  (r4v1 kotlinx.serialization.KSerializer<java.lang.Object>[])
  (r4v4 kotlinx.serialization.KSerializer<java.lang.Object>[])
 binds: [B:25:0x0081, B:28:0x0090, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final /* synthetic */ void write$Self$onboard_release(com.incode.welcome_sdk.commons.theme.Typography.Family r6, kotlinx.serialization.encoding.CompositeEncoder r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
            /*
                r5 = 2
                int r0 = r5 % r5
                int r0 = com.incode.welcome_sdk.commons.theme.Typography.Family.f5544d
                int r1 = r0 + 83
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.theme.Typography.Family.f5543b = r0
                int r1 = r1 % r5
                r3 = 0
                r2 = 1
                if (r1 == 0) goto L7b
                kotlinx.serialization.KSerializer<java.lang.Object>[] r4 = com.incode.welcome_sdk.commons.theme.Typography.Family.$childSerializers
                boolean r0 = r7.shouldEncodeElementDefault(r8, r2)
                r0 = r0 ^ r2
                if (r0 == r2) goto L84
            L19:
                r0 = r2
            L1a:
                if (r0 == 0) goto L2e
                int r0 = com.incode.welcome_sdk.commons.theme.Typography.Family.f5544d
                int r1 = r0 + 67
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.theme.Typography.Family.f5543b = r0
                int r1 = r1 % r5
                r1 = r4[r3]
                kotlinx.serialization.SerializationStrategy r1 = (kotlinx.serialization.SerializationStrategy) r1
                androidx.compose.ui.text.font.FontFamily r0 = r6.text
                r7.encodeSerializableElement(r8, r3, r1, r0)
            L2e:
                boolean r0 = r7.shouldEncodeElementDefault(r8, r2)
                if (r0 == 0) goto L56
                int r0 = com.incode.welcome_sdk.commons.theme.Typography.Family.f5544d
                int r1 = r0 + 19
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.theme.Typography.Family.f5543b = r0
                int r1 = r1 % r5
                if (r1 == 0) goto L54
            L3f:
                if (r3 == 0) goto L53
                int r0 = com.incode.welcome_sdk.commons.theme.Typography.Family.f5544d
                int r1 = r0 + 65
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.theme.Typography.Family.f5543b = r0
                int r1 = r1 % r5
                r1 = r4[r2]
                kotlinx.serialization.SerializationStrategy r1 = (kotlinx.serialization.SerializationStrategy) r1
                androidx.compose.ui.text.font.FontFamily r0 = r6.display
                r7.encodeSerializableElement(r8, r2, r1, r0)
            L53:
                return
            L54:
                r3 = r2
                goto L3f
            L56:
                androidx.compose.ui.text.font.FontFamily r1 = r6.display
                com.incode.welcome_sdk.commons.theme.IncodeTypefaceTokens r0 = com.incode.welcome_sdk.commons.theme.IncodeTypefaceTokens.INSTANCE
                androidx.compose.ui.text.font.FontFamily r0 = r0.getFamilyDisplay()
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
                r0 = r0 ^ r2
                if (r0 == r2) goto L66
                goto L3f
            L66:
                int r0 = com.incode.welcome_sdk.commons.theme.Typography.Family.f5544d
                int r1 = r0 + 117
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.theme.Typography.Family.f5543b = r0
                int r1 = r1 % r5
                if (r1 == 0) goto L79
            L71:
                int r1 = r0 + 95
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.theme.Typography.Family.f5544d = r0
                int r1 = r1 % r5
                goto L3f
            L79:
                r3 = r2
                goto L71
            L7b:
                kotlinx.serialization.KSerializer<java.lang.Object>[] r4 = com.incode.welcome_sdk.commons.theme.Typography.Family.$childSerializers
                boolean r0 = r7.shouldEncodeElementDefault(r8, r3)
                if (r0 == 0) goto L84
                goto L19
            L84:
                androidx.compose.ui.text.font.FontFamily r1 = r6.text
                com.incode.welcome_sdk.commons.theme.IncodeTypefaceTokens r0 = com.incode.welcome_sdk.commons.theme.IncodeTypefaceTokens.INSTANCE
                androidx.compose.ui.text.font.FontFamily r0 = r0.getFamilyText()
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
                if (r0 != 0) goto L93
                goto L19
            L93:
                r0 = r3
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.theme.Typography.Family.write$Self$onboard_release(com.incode.welcome_sdk.commons.theme.Typography$Family, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        public /* synthetic */ Family(FontFamily fontFamily, FontFamily fontFamily2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? IncodeTypefaceTokens.INSTANCE.getFamilyText() : fontFamily, (i2 & 2) != 0 ? IncodeTypefaceTokens.INSTANCE.getFamilyDisplay() : fontFamily2);
        }

        public final FontFamily getText() {
            int i2 = 2 % 2;
            int i3 = f5543b + 89;
            int i4 = i3 % 128;
            f5544d = i4;
            int i5 = i3 % 2;
            FontFamily fontFamily = this.text;
            int i6 = i4 + 99;
            f5543b = i6 % 128;
            if (i6 % 2 == 0) {
                return fontFamily;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final FontFamily getDisplay() {
            int i2 = 2 % 2;
            int i3 = f5544d;
            int i4 = i3 + 99;
            f5543b = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            FontFamily fontFamily = this.display;
            int i5 = i3 + 113;
            f5543b = i5 % 128;
            int i6 = i5 % 2;
            return fontFamily;
        }

        public Family() {
            this((FontFamily) null, (FontFamily) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            if (this == obj) {
                int i3 = f5543b + 105;
                f5544d = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
            if (!(obj instanceof Family)) {
                int i5 = f5543b + 125;
                f5544d = i5 % 128;
                if (i5 % 2 != 0) {
                    return false;
                }
                throw null;
            }
            Family family = (Family) obj;
            if (!Intrinsics.areEqual(this.text, family.text)) {
                return false;
            }
            if (Intrinsics.areEqual(this.display, family.display)) {
                return true;
            }
            int i6 = f5543b + 121;
            f5544d = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = f5543b + 87;
            f5544d = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode = (this.text.hashCode() * 31) + this.display.hashCode();
            int i5 = f5543b + 67;
            f5544d = i5 % 128;
            int i6 = i5 % 2;
            return iHashCode;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f5544d + 21;
            f5543b = i3 % 128;
            int i4 = i3 % 2;
            String str = "Family(text=" + this.text + ", display=" + this.display + ")";
            int i5 = f5543b + 97;
            f5544d = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public static /* synthetic */ Family copy$default(Family family, FontFamily fontFamily, FontFamily fontFamily2, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = f5543b;
            int i5 = i4 + 51;
            f5544d = i5 % 128;
            if (i5 % 2 != 0 && (i2 & 1) != 0) {
                int i6 = i4 + 101;
                f5544d = i6 % 128;
                if (i6 % 2 == 0) {
                    FontFamily fontFamily3 = family.text;
                    throw null;
                }
                fontFamily = family.text;
            }
            if ((i2 & 2) != 0) {
                fontFamily2 = family.display;
            }
            return family.copy(fontFamily, fontFamily2);
        }

        public final Family copy(FontFamily fontFamily, FontFamily fontFamily2) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(fontFamily, "");
            Intrinsics.checkNotNullParameter(fontFamily2, "");
            Family family = new Family(fontFamily, fontFamily2);
            int i3 = f5544d + 45;
            f5543b = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 21 / 0;
            }
            return family;
        }

        public final FontFamily component2() {
            int i2 = 2 % 2;
            int i3 = f5544d + 37;
            f5543b = i3 % 128;
            if (i3 % 2 == 0) {
                return this.display;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final FontFamily component1() {
            FontFamily fontFamily;
            int i2 = 2 % 2;
            int i3 = f5544d;
            int i4 = i3 + 23;
            f5543b = i4 % 128;
            if (i4 % 2 != 0) {
                fontFamily = this.text;
                int i5 = 44 / 0;
            } else {
                fontFamily = this.text;
            }
            int i6 = i3 + 27;
            f5543b = i6 % 128;
            if (i6 % 2 == 0) {
                return fontFamily;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ void getDisplay$annotations() {
            int i2 = 2 % 2;
            int i3 = f5544d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f5543b = i3 % 128;
            int i4 = i3 % 2;
        }

        public static /* synthetic */ void getText$annotations() {
            int i2 = 2 % 2;
            int i3 = f5544d + 33;
            f5543b = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    @Serializable
    public static final class LetterSpacing {
        public static final int $stable = 0;
        public static final d Companion = new d(0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f5554b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f5555c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f5556d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f5557e = 1;
        private final long extraLarge;
        private final long large;
        private final long medium;
        private final long none;

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public static final class b implements GeneratedSerializer<LetterSpacing> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f5558a = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f5559b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final /* synthetic */ PluginGeneratedSerialDescriptor f5560c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f5561d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final b f5562e;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static int f5563j = 1;

            static {
                b bVar = new b();
                f5562e = bVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.incode.welcome_sdk.commons.theme.Typography.LetterSpacing", bVar, 4);
                pluginGeneratedSerialDescriptor.addElement("none", true);
                pluginGeneratedSerialDescriptor.addElement("medium", true);
                pluginGeneratedSerialDescriptor.addElement("large", true);
                pluginGeneratedSerialDescriptor.addElement("extraLarge", true);
                f5560c = pluginGeneratedSerialDescriptor;
                int i2 = f5559b + 21;
                f5563j = i2 % 128;
                int i3 = i2 % 2;
            }

            private b() {
            }

            private LetterSpacing a(Decoder decoder) {
                int i2;
                TextUnit textUnit;
                TextUnit textUnit2;
                TextUnit textUnit3;
                TextUnit textUnit4;
                int i3 = 2 % 2;
                Intrinsics.checkNotNullParameter(decoder, "");
                SerialDescriptor descriptor = getDescriptor();
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
                TextUnit textUnit5 = null;
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    int i4 = f5561d + 35;
                    f5558a = i4 % 128;
                    int i5 = i4 % 2;
                    textUnit4 = (TextUnit) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, m.f5753b, null);
                    textUnit = (TextUnit) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, m.f5753b, null);
                    textUnit2 = (TextUnit) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 2, m.f5753b, null);
                    textUnit3 = (TextUnit) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 3, m.f5753b, null);
                    i2 = 15;
                } else {
                    i2 = 0;
                    boolean z2 = true;
                    textUnit = null;
                    textUnit2 = null;
                    textUnit3 = null;
                    while (z2) {
                        int i6 = f5561d + 71;
                        f5558a = i6 % 128;
                        int i7 = i6 % 2;
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                        if (iDecodeElementIndex == -1) {
                            int i8 = f5561d + 93;
                            f5558a = i8 % 128;
                            int i9 = i8 % 2;
                            z2 = false;
                        } else if (iDecodeElementIndex == 0) {
                            textUnit5 = (TextUnit) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, m.f5753b, textUnit5);
                            i2 |= 1;
                        } else if (iDecodeElementIndex == 1) {
                            textUnit = (TextUnit) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, m.f5753b, textUnit);
                            i2 |= 2;
                        } else if (iDecodeElementIndex == 2) {
                            textUnit2 = (TextUnit) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 2, m.f5753b, textUnit2);
                            i2 |= 4;
                        } else {
                            if (iDecodeElementIndex != 3) {
                                throw new UnknownFieldException(iDecodeElementIndex);
                            }
                            textUnit3 = (TextUnit) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 3, m.f5753b, textUnit3);
                            i2 |= 8;
                        }
                    }
                    textUnit4 = textUnit5;
                }
                compositeDecoderBeginStructure.endStructure(descriptor);
                return new LetterSpacing(i2, textUnit4, textUnit, textUnit2, textUnit3, null, null);
            }

            private void b(Encoder encoder, LetterSpacing letterSpacing) {
                int i2 = 2 % 2;
                int i3 = f5561d + 83;
                f5558a = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(encoder, "");
                    Intrinsics.checkNotNullParameter(letterSpacing, "");
                    SerialDescriptor descriptor = getDescriptor();
                    CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
                    LetterSpacing.write$Self$onboard_release(letterSpacing, compositeEncoderBeginStructure, descriptor);
                    compositeEncoderBeginStructure.endStructure(descriptor);
                    return;
                }
                Intrinsics.checkNotNullParameter(encoder, "");
                Intrinsics.checkNotNullParameter(letterSpacing, "");
                SerialDescriptor descriptor2 = getDescriptor();
                CompositeEncoder compositeEncoderBeginStructure2 = encoder.beginStructure(descriptor2);
                LetterSpacing.write$Self$onboard_release(letterSpacing, compositeEncoderBeginStructure2, descriptor2);
                compositeEncoderBeginStructure2.endStructure(descriptor2);
                int i4 = 67 / 0;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer<?>[] childSerializers() {
                KSerializer<?>[] kSerializerArr;
                int i2 = 2 % 2;
                int i3 = f5561d + 83;
                f5558a = i3 % 128;
                if (i3 % 2 == 0) {
                    kSerializerArr = new KSerializer[4];
                    kSerializerArr[0] = m.f5753b;
                    kSerializerArr[0] = m.f5753b;
                    kSerializerArr[4] = m.f5753b;
                    kSerializerArr[3] = m.f5753b;
                } else {
                    kSerializerArr = new KSerializer[]{m.f5753b, m.f5753b, m.f5753b, m.f5753b};
                }
                int i4 = f5561d + 43;
                f5558a = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerArr;
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            public final /* synthetic */ Object deserialize(Decoder decoder) {
                int i2 = 2 % 2;
                int i3 = f5558a + 45;
                f5561d = i3 % 128;
                int i4 = i3 % 2;
                LetterSpacing letterSpacingA = a(decoder);
                int i5 = f5561d + 57;
                f5558a = i5 % 128;
                if (i5 % 2 != 0) {
                    return letterSpacingA;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public final SerialDescriptor getDescriptor() {
                int i2 = 2 % 2;
                int i3 = f5561d;
                int i4 = i3 + 61;
                f5558a = i4 % 128;
                int i5 = i4 % 2;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f5560c;
                int i6 = i3 + 75;
                f5558a = i6 % 128;
                int i7 = i6 % 2;
                return pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.SerializationStrategy
            public final /* synthetic */ void serialize(Encoder encoder, Object obj) {
                int i2 = 2 % 2;
                int i3 = f5558a + 25;
                f5561d = i3 % 128;
                int i4 = i3 % 2;
                b(encoder, (LetterSpacing) obj);
                int i5 = f5558a + 63;
                f5561d = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 10 / 0;
                }
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer<?>[] typeParametersSerializers() {
                int i2 = 2 % 2;
                int i3 = f5558a + 27;
                f5561d = i3 % 128;
                if (i3 % 2 == 0) {
                    return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
                }
                GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
                throw null;
            }
        }

        public static final class d {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f5564b = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f5565e = 0;

            private d() {
            }

            public final KSerializer<LetterSpacing> serializer() {
                int i2 = 2 % 2;
                int i3 = f5565e + 87;
                f5564b = i3 % 128;
                int i4 = i3 % 2;
                b bVar = b.f5562e;
                int i5 = f5564b + 55;
                f5565e = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 89 / 0;
                }
                return bVar;
            }

            public /* synthetic */ d(byte b2) {
                this();
            }
        }

        private LetterSpacing(int i2, TextUnit textUnit, TextUnit textUnit2, TextUnit textUnit3, TextUnit textUnit4, SerializationConstructorMarker serializationConstructorMarker) {
            this.none = (i2 & 1) == 0 ? IncodeTypefaceTokens.INSTANCE.m8079getLetterSpacingNoneXSAIIZE() : textUnit.m6840unboximpl();
            this.medium = (i2 & 2) == 0 ? IncodeTypefaceTokens.INSTANCE.m8078getLetterSpacingMediumXSAIIZE() : textUnit2.m6840unboximpl();
            this.large = (i2 & 4) == 0 ? IncodeTypefaceTokens.INSTANCE.m8077getLetterSpacingLargeXSAIIZE() : textUnit3.m6840unboximpl();
            this.extraLarge = (i2 & 8) == 0 ? IncodeTypefaceTokens.INSTANCE.m8076getLetterSpacingExtraLargeXSAIIZE() : textUnit4.m6840unboximpl();
        }

        private LetterSpacing(long j2, long j3, long j4, long j5) {
            this.none = j2;
            this.medium = j3;
            this.large = j4;
            this.extraLarge = j5;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final /* synthetic */ void write$Self$onboard_release(com.incode.welcome_sdk.commons.theme.Typography.LetterSpacing r8, kotlinx.serialization.encoding.CompositeEncoder r9, kotlinx.serialization.descriptors.SerialDescriptor r10) {
            /*
                r4 = 2
                int r0 = r4 % r4
                r6 = 0
                boolean r0 = r9.shouldEncodeElementDefault(r10, r6)
                if (r0 == 0) goto Lac
            La:
                com.incode.welcome_sdk.commons.theme.m r2 = com.incode.welcome_sdk.commons.theme.m.f5753b
                kotlinx.serialization.SerializationStrategy r2 = (kotlinx.serialization.SerializationStrategy) r2
                long r0 = r8.none
                androidx.compose.ui.unit.TextUnit r0 = androidx.compose.ui.unit.TextUnit.m6821boximpl(r0)
                r9.encodeSerializableElement(r10, r6, r2, r0)
                int r0 = com.incode.welcome_sdk.commons.theme.Typography.LetterSpacing.f5557e
                int r1 = r0 + 71
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.theme.Typography.LetterSpacing.f5556d = r0
                int r1 = r1 % r4
            L20:
                r5 = 1
                boolean r0 = r9.shouldEncodeElementDefault(r10, r5)
                if (r0 == 0) goto L9c
            L27:
                com.incode.welcome_sdk.commons.theme.m r2 = com.incode.welcome_sdk.commons.theme.m.f5753b
                kotlinx.serialization.SerializationStrategy r2 = (kotlinx.serialization.SerializationStrategy) r2
                long r0 = r8.medium
                androidx.compose.ui.unit.TextUnit r0 = androidx.compose.ui.unit.TextUnit.m6821boximpl(r0)
                r9.encodeSerializableElement(r10, r5, r2, r0)
            L34:
                boolean r0 = r9.shouldEncodeElementDefault(r10, r4)
                if (r0 == 0) goto L80
                int r0 = com.incode.welcome_sdk.commons.theme.Typography.LetterSpacing.f5557e
                int r1 = r0 + 87
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.theme.Typography.LetterSpacing.f5556d = r0
                int r1 = r1 % r4
                if (r1 == 0) goto L8e
            L45:
                r7 = 3
                boolean r0 = r9.shouldEncodeElementDefault(r10, r7)
                if (r0 == 0) goto L66
            L4c:
                r6 = r5
            L4d:
                if (r6 == 0) goto L65
                int r0 = com.incode.welcome_sdk.commons.theme.Typography.LetterSpacing.f5557e
                int r1 = r0 + 33
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.theme.Typography.LetterSpacing.f5556d = r0
                int r1 = r1 % r4
                com.incode.welcome_sdk.commons.theme.m r2 = com.incode.welcome_sdk.commons.theme.m.f5753b
                kotlinx.serialization.SerializationStrategy r2 = (kotlinx.serialization.SerializationStrategy) r2
                long r0 = r8.extraLarge
                androidx.compose.ui.unit.TextUnit r0 = androidx.compose.ui.unit.TextUnit.m6821boximpl(r0)
                r9.encodeSerializableElement(r10, r7, r2, r0)
            L65:
                return
            L66:
                long r2 = r8.extraLarge
                com.incode.welcome_sdk.commons.theme.IncodeTypefaceTokens r0 = com.incode.welcome_sdk.commons.theme.IncodeTypefaceTokens.INSTANCE
                long r0 = r0.m8076getLetterSpacingExtraLargeXSAIIZE()
                boolean r0 = androidx.compose.ui.unit.TextUnit.m6828equalsimpl0(r2, r0)
                if (r0 != 0) goto L4d
                int r0 = com.incode.welcome_sdk.commons.theme.Typography.LetterSpacing.f5557e
                int r1 = r0 + 87
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.theme.Typography.LetterSpacing.f5556d = r0
                int r1 = r1 % r4
                if (r1 == 0) goto L4c
                goto L4d
            L80:
                long r2 = r8.large
                com.incode.welcome_sdk.commons.theme.IncodeTypefaceTokens r0 = com.incode.welcome_sdk.commons.theme.IncodeTypefaceTokens.INSTANCE
                long r0 = r0.m8077getLetterSpacingLargeXSAIIZE()
                boolean r0 = androidx.compose.ui.unit.TextUnit.m6828equalsimpl0(r2, r0)
                if (r0 != 0) goto L45
            L8e:
                com.incode.welcome_sdk.commons.theme.m r2 = com.incode.welcome_sdk.commons.theme.m.f5753b
                kotlinx.serialization.SerializationStrategy r2 = (kotlinx.serialization.SerializationStrategy) r2
                long r0 = r8.large
                androidx.compose.ui.unit.TextUnit r0 = androidx.compose.ui.unit.TextUnit.m6821boximpl(r0)
                r9.encodeSerializableElement(r10, r4, r2, r0)
                goto L45
            L9c:
                long r2 = r8.medium
                com.incode.welcome_sdk.commons.theme.IncodeTypefaceTokens r0 = com.incode.welcome_sdk.commons.theme.IncodeTypefaceTokens.INSTANCE
                long r0 = r0.m8078getLetterSpacingMediumXSAIIZE()
                boolean r0 = androidx.compose.ui.unit.TextUnit.m6828equalsimpl0(r2, r0)
                r0 = r0 ^ r5
                if (r0 == r5) goto L27
                goto L34
            Lac:
                long r2 = r8.none
                com.incode.welcome_sdk.commons.theme.IncodeTypefaceTokens r0 = com.incode.welcome_sdk.commons.theme.IncodeTypefaceTokens.INSTANCE
                long r0 = r0.m8079getLetterSpacingNoneXSAIIZE()
                boolean r0 = androidx.compose.ui.unit.TextUnit.m6828equalsimpl0(r2, r0)
                if (r0 == 0) goto La
                goto L20
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.theme.Typography.LetterSpacing.write$Self$onboard_release(com.incode.welcome_sdk.commons.theme.Typography$LetterSpacing, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        public /* synthetic */ LetterSpacing(long j2, long j3, long j4, long j5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? IncodeTypefaceTokens.INSTANCE.m8079getLetterSpacingNoneXSAIIZE() : j2, (i2 & 2) != 0 ? IncodeTypefaceTokens.INSTANCE.m8078getLetterSpacingMediumXSAIIZE() : j3, (i2 & 4) != 0 ? IncodeTypefaceTokens.INSTANCE.m8077getLetterSpacingLargeXSAIIZE() : j4, (i2 & 8) != 0 ? IncodeTypefaceTokens.INSTANCE.m8076getLetterSpacingExtraLargeXSAIIZE() : j5, null);
        }

        /* JADX INFO: renamed from: getNone-XSAIIZE, reason: not valid java name */
        public final long m8109getNoneXSAIIZE() {
            int i2 = 2 % 2;
            int i3 = f5557e;
            int i4 = i3 + 49;
            f5556d = i4 % 128;
            int i5 = i4 % 2;
            long j2 = this.none;
            int i6 = i3 + 65;
            f5556d = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 87 / 0;
            }
            return j2;
        }

        /* JADX INFO: renamed from: getMedium-XSAIIZE, reason: not valid java name */
        public final long m8108getMediumXSAIIZE() {
            int i2 = 2 % 2;
            int i3 = f5556d + 83;
            int i4 = i3 % 128;
            f5557e = i4;
            int i5 = i3 % 2;
            long j2 = this.medium;
            int i6 = i4 + 83;
            f5556d = i6 % 128;
            int i7 = i6 % 2;
            return j2;
        }

        /* JADX INFO: renamed from: getLarge-XSAIIZE, reason: not valid java name */
        public final long m8107getLargeXSAIIZE() {
            int i2 = 2 % 2;
            int i3 = f5556d + 121;
            f5557e = i3 % 128;
            if (i3 % 2 != 0) {
                return this.large;
            }
            int i4 = 69 / 0;
            return this.large;
        }

        /* JADX INFO: renamed from: getExtraLarge-XSAIIZE, reason: not valid java name */
        public final long m8106getExtraLargeXSAIIZE() {
            int i2 = 2 % 2;
            int i3 = f5556d + 113;
            f5557e = i3 % 128;
            if (i3 % 2 != 0) {
                return this.extraLarge;
            }
            throw null;
        }

        static {
            int i2 = f5555c + 97;
            f5554b = i2 % 128;
            int i3 = i2 % 2;
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ LetterSpacing(int i2, TextUnit textUnit, TextUnit textUnit2, TextUnit textUnit3, TextUnit textUnit4, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
            this(i2, textUnit, textUnit2, textUnit3, textUnit4, serializationConstructorMarker);
        }

        public /* synthetic */ LetterSpacing(long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
            this(j2, j3, j4, j5);
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            if (this == obj) {
                int i3 = f5557e + 41;
                f5556d = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
            if (!(obj instanceof LetterSpacing)) {
                return false;
            }
            LetterSpacing letterSpacing = (LetterSpacing) obj;
            if (!TextUnit.m6828equalsimpl0(this.none, letterSpacing.none)) {
                int i5 = f5556d + 83;
                f5557e = i5 % 128;
                return i5 % 2 == 0;
            }
            if (!TextUnit.m6828equalsimpl0(this.medium, letterSpacing.medium)) {
                int i6 = f5557e + 89;
                f5556d = i6 % 128;
                return i6 % 2 != 0;
            }
            if (!TextUnit.m6828equalsimpl0(this.large, letterSpacing.large)) {
                return false;
            }
            if (TextUnit.m6828equalsimpl0(this.extraLarge, letterSpacing.extraLarge)) {
                return true;
            }
            int i7 = f5557e + 51;
            f5556d = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = f5556d + 33;
            f5557e = i3 % 128;
            int i4 = i3 % 2;
            int iM6832hashCodeimpl = (((((TextUnit.m6832hashCodeimpl(this.none) * 31) + TextUnit.m6832hashCodeimpl(this.medium)) * 31) + TextUnit.m6832hashCodeimpl(this.large)) * 31) + TextUnit.m6832hashCodeimpl(this.extraLarge);
            int i5 = f5556d + 89;
            f5557e = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 1 / 0;
            }
            return iM6832hashCodeimpl;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f5557e + 47;
            f5556d = i3 % 128;
            int i4 = i3 % 2;
            String str = "LetterSpacing(none=" + TextUnit.m6838toStringimpl(this.none) + ", medium=" + TextUnit.m6838toStringimpl(this.medium) + ", large=" + TextUnit.m6838toStringimpl(this.large) + ", extraLarge=" + TextUnit.m6838toStringimpl(this.extraLarge) + ")";
            int i5 = f5557e + 15;
            f5556d = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 75 / 0;
            }
            return str;
        }

        /* JADX INFO: renamed from: copy-SJ4xkqo$default, reason: not valid java name */
        public static /* synthetic */ LetterSpacing m8100copySJ4xkqo$default(LetterSpacing letterSpacing, long j2, long j3, long j4, long j5, int i2, Object obj) {
            int i3 = 2 % 2;
            if ((i2 & 1) != 0) {
                j2 = letterSpacing.none;
            }
            if ((i2 & 2) != 0) {
                int i4 = f5557e + 73;
                f5556d = i4 % 128;
                if (i4 % 2 != 0) {
                    j3 = letterSpacing.medium;
                    int i5 = 47 / 0;
                } else {
                    j3 = letterSpacing.medium;
                }
            }
            if ((i2 & 4) != 0) {
                j4 = letterSpacing.large;
                int i6 = f5556d + 3;
                f5557e = i6 % 128;
                int i7 = i6 % 2;
            }
            if ((i2 & 8) != 0) {
                j5 = letterSpacing.extraLarge;
            }
            return letterSpacing.m8105copySJ4xkqo(j2, j3, j4, j5);
        }

        /* JADX INFO: renamed from: copy-SJ4xkqo, reason: not valid java name */
        public final LetterSpacing m8105copySJ4xkqo(long j2, long j3, long j4, long j5) {
            int i2 = 2 % 2;
            LetterSpacing letterSpacing = new LetterSpacing(j2, j3, j4, j5, null);
            int i3 = f5557e + 49;
            f5556d = i3 % 128;
            if (i3 % 2 == 0) {
                return letterSpacing;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: component4-XSAIIZE, reason: not valid java name */
        public final long m8104component4XSAIIZE() {
            long j2;
            int i2 = 2 % 2;
            int i3 = f5557e;
            int i4 = i3 + 33;
            f5556d = i4 % 128;
            if (i4 % 2 != 0) {
                j2 = this.extraLarge;
                int i5 = 31 / 0;
            } else {
                j2 = this.extraLarge;
            }
            int i6 = i3 + 59;
            f5556d = i6 % 128;
            if (i6 % 2 == 0) {
                return j2;
            }
            throw null;
        }

        /* JADX INFO: renamed from: component3-XSAIIZE, reason: not valid java name */
        public final long m8103component3XSAIIZE() {
            int i2 = 2 % 2;
            int i3 = f5557e;
            int i4 = i3 + 89;
            f5556d = i4 % 128;
            int i5 = i4 % 2;
            long j2 = this.large;
            int i6 = i3 + 3;
            f5556d = i6 % 128;
            int i7 = i6 % 2;
            return j2;
        }

        /* JADX INFO: renamed from: component2-XSAIIZE, reason: not valid java name */
        public final long m8102component2XSAIIZE() {
            int i2 = 2 % 2;
            int i3 = f5557e;
            int i4 = i3 + 65;
            f5556d = i4 % 128;
            int i5 = i4 % 2;
            long j2 = this.medium;
            int i6 = i3 + 111;
            f5556d = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 55 / 0;
            }
            return j2;
        }

        /* JADX INFO: renamed from: component1-XSAIIZE, reason: not valid java name */
        public final long m8101component1XSAIIZE() {
            int i2 = 2 % 2;
            int i3 = f5556d + 79;
            f5557e = i3 % 128;
            if (i3 % 2 != 0) {
                return this.none;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public Typography() {
        this((Family) null, (LetterSpacing) null, (Weight) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.incode.welcome_sdk.commons.theme.Typography) == true) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r6 = (com.incode.welcome_sdk.commons.theme.Typography) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.family, r6.family) == true) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.letterSpacing, r6.letterSpacing) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        r1 = com.incode.welcome_sdk.commons.theme.Typography.f5540d + 89;
        com.incode.welcome_sdk.commons.theme.Typography.f5539b = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if ((r1 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.fontWeight, r6.fontWeight) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        r1 = com.incode.welcome_sdk.commons.theme.Typography.f5539b + 91;
        com.incode.welcome_sdk.commons.theme.Typography.f5540d = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if ((r1 % 2) != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.commons.theme.Typography.f5540d
            int r1 = r0 + 11
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.theme.Typography.f5539b = r0
            int r1 = r1 % r4
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L16
            r0 = 83
            int r0 = r0 / r3
            if (r5 != r6) goto L19
        L15:
            return r2
        L16:
            if (r5 != r6) goto L19
            goto L15
        L19:
            boolean r0 = r6 instanceof com.incode.welcome_sdk.commons.theme.Typography
            if (r0 == r2) goto L1e
            return r3
        L1e:
            com.incode.welcome_sdk.commons.theme.Typography r6 = (com.incode.welcome_sdk.commons.theme.Typography) r6
            com.incode.welcome_sdk.commons.theme.Typography$Family r1 = r5.family
            com.incode.welcome_sdk.commons.theme.Typography$Family r0 = r6.family
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 == r2) goto L2b
            return r3
        L2b:
            com.incode.welcome_sdk.commons.theme.Typography$LetterSpacing r1 = r5.letterSpacing
            com.incode.welcome_sdk.commons.theme.Typography$LetterSpacing r0 = r6.letterSpacing
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 != 0) goto L43
            int r0 = com.incode.welcome_sdk.commons.theme.Typography.f5540d
            int r1 = r0 + 89
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.theme.Typography.f5539b = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L41
        L40:
            return r2
        L41:
            r2 = r3
            goto L40
        L43:
            com.incode.welcome_sdk.commons.theme.Typography$Weight r1 = r5.fontWeight
            com.incode.welcome_sdk.commons.theme.Typography$Weight r0 = r6.fontWeight
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 != 0) goto L4e
            return r3
        L4e:
            int r0 = com.incode.welcome_sdk.commons.theme.Typography.f5539b
            int r1 = r0 + 91
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.theme.Typography.f5540d = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L5a
            return r2
        L5a:
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.theme.Typography.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f5539b + 39;
        f5540d = i3 % 128;
        int iHashCode = i3 % 2 != 0 ? (((this.family.hashCode() >> 4) / this.letterSpacing.hashCode()) + 7) / this.fontWeight.hashCode() : (((this.family.hashCode() * 31) + this.letterSpacing.hashCode()) * 31) + this.fontWeight.hashCode();
        int i4 = f5540d + 99;
        f5539b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        String str;
        int i2 = 2 % 2;
        int i3 = f5539b + 43;
        f5540d = i3 % 128;
        if (i3 % 2 != 0) {
            str = "Typography(family=" + this.family + ", letterSpacing=" + this.letterSpacing + ", fontWeight=" + this.fontWeight + ")";
            int i4 = 3 / 0;
        } else {
            str = "Typography(family=" + this.family + ", letterSpacing=" + this.letterSpacing + ", fontWeight=" + this.fontWeight + ")";
        }
        int i5 = f5540d + 51;
        f5539b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static /* synthetic */ Typography copy$default(Typography typography, Family family, LetterSpacing letterSpacing, Weight weight, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = f5540d + 103;
            f5539b = i4 % 128;
            if (i4 % 2 == 0) {
                Family family2 = typography.family;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            family = typography.family;
        }
        if ((i2 & 2) != 0) {
            int i5 = f5539b + 41;
            f5540d = i5 % 128;
            int i6 = i5 % 2;
            letterSpacing = typography.letterSpacing;
        }
        if ((i2 & 4) != 0) {
            weight = typography.fontWeight;
            int i7 = f5539b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f5540d = i7 % 128;
            int i8 = i7 % 2;
        }
        return typography.copy(family, letterSpacing, weight);
    }

    public final Typography copy(Family family, LetterSpacing letterSpacing, Weight weight) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(family, "");
        Intrinsics.checkNotNullParameter(letterSpacing, "");
        Intrinsics.checkNotNullParameter(weight, "");
        Typography typography = new Typography(family, letterSpacing, weight);
        int i3 = f5540d + 25;
        f5539b = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 69 / 0;
        }
        return typography;
    }

    public final Weight component3() {
        int i2 = 2 % 2;
        int i3 = f5540d;
        int i4 = i3 + 73;
        f5539b = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Weight weight = this.fontWeight;
        int i5 = i3 + 9;
        f5539b = i5 % 128;
        int i6 = i5 % 2;
        return weight;
    }

    public final LetterSpacing component2() {
        int i2 = 2 % 2;
        int i3 = f5539b + 69;
        int i4 = i3 % 128;
        f5540d = i4;
        int i5 = i3 % 2;
        LetterSpacing letterSpacing = this.letterSpacing;
        int i6 = i4 + 29;
        f5539b = i6 % 128;
        if (i6 % 2 != 0) {
            return letterSpacing;
        }
        throw null;
    }

    public final Family component1() {
        int i2 = 2 % 2;
        int i3 = f5540d;
        int i4 = i3 + 91;
        f5539b = i4 % 128;
        int i5 = i4 % 2;
        Family family = this.family;
        int i6 = i3 + 63;
        f5539b = i6 % 128;
        if (i6 % 2 != 0) {
            return family;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void getFamily$annotations() {
        int i2 = 2 % 2;
        int i3 = f5540d + 37;
        f5539b = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }
}
