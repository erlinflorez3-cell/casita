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
public final class IncodeTypography {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5490b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5491c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5492d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5493e = 0;
    private final Family family;
    private final Weight fontWeight;
    private final LetterSpacing letterSpacing;
    public static final d Companion = new d(0);
    private static final KSerializer<Object>[] $childSerializers = {new ContextualSerializer(Reflection.getOrCreateKotlinClass(Family.class), Family.a.f5500c, new KSerializer[0]), null, null};

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final class c implements GeneratedSerializer<IncodeTypography> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f5530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ PluginGeneratedSerialDescriptor f5531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f5532c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f5533d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f5534e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f5535f = 1;

        static {
            c cVar = new c();
            f5530a = cVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.incode.welcome_sdk.commons.theme.IncodeTypography", cVar, 3);
            pluginGeneratedSerialDescriptor.addElement(Device.JsonKeys.FAMILY, true);
            pluginGeneratedSerialDescriptor.addElement(ViewProps.LETTER_SPACING, true);
            pluginGeneratedSerialDescriptor.addElement(ViewProps.FONT_WEIGHT, true);
            f5531b = pluginGeneratedSerialDescriptor;
            int i2 = f5535f + 71;
            f5533d = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 35 / 0;
            }
        }

        private c() {
        }

        private IncodeTypography b(Decoder decoder) {
            LetterSpacing letterSpacing;
            Weight weight;
            int i2;
            Family family;
            int iDecodeElementIndex;
            int i3;
            int i4 = 2 % 2;
            Intrinsics.checkNotNullParameter(decoder, "");
            SerialDescriptor descriptor = getDescriptor();
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
            KSerializer[] kSerializerArrAccess$get$childSerializers$cp = IncodeTypography.access$get$childSerializers$cp();
            Family family2 = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                family = (Family) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, kSerializerArrAccess$get$childSerializers$cp[0], null);
                letterSpacing = (LetterSpacing) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, LetterSpacing.a.f5512c, null);
                weight = (Weight) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 2, Weight.c.f5527d, null);
                i2 = 7;
            } else {
                letterSpacing = null;
                weight = null;
                boolean z2 = true;
                i2 = 0;
                while (z2) {
                    int i5 = f5532c + 99;
                    f5534e = i5 % 128;
                    if (i5 % 2 == 0) {
                        iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                        int i6 = 50 / 0;
                        if (iDecodeElementIndex == -1) {
                            z2 = false;
                        } else if (iDecodeElementIndex == 0) {
                            family2 = (Family) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, kSerializerArrAccess$get$childSerializers$cp[0], family2);
                            i2 |= 1;
                            i3 = f5532c + 39;
                            f5534e = i3 % 128;
                            int i7 = i3 % 2;
                        } else if (iDecodeElementIndex != 1) {
                            if (iDecodeElementIndex != 2) {
                                throw new UnknownFieldException(iDecodeElementIndex);
                            }
                            weight = (Weight) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 2, Weight.c.f5527d, weight);
                            i2 |= 4;
                        } else {
                            letterSpacing = (LetterSpacing) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, LetterSpacing.a.f5512c, letterSpacing);
                            i2 |= 2;
                            i3 = f5534e + 13;
                            f5532c = i3 % 128;
                            int i72 = i3 % 2;
                        }
                    } else {
                        iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                        if (iDecodeElementIndex == -1) {
                            z2 = false;
                        } else if (iDecodeElementIndex == 0) {
                            family2 = (Family) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, kSerializerArrAccess$get$childSerializers$cp[0], family2);
                            i2 |= 1;
                            i3 = f5532c + 39;
                            f5534e = i3 % 128;
                            int i722 = i3 % 2;
                        } else if (iDecodeElementIndex != 1) {
                            if (iDecodeElementIndex != 2) {
                                throw new UnknownFieldException(iDecodeElementIndex);
                            }
                            weight = (Weight) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 2, Weight.c.f5527d, weight);
                            i2 |= 4;
                        } else {
                            letterSpacing = (LetterSpacing) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, LetterSpacing.a.f5512c, letterSpacing);
                            i2 |= 2;
                            i3 = f5534e + 13;
                            f5532c = i3 % 128;
                            int i7222 = i3 % 2;
                        }
                    }
                }
                family = family2;
            }
            compositeDecoderBeginStructure.endStructure(descriptor);
            return new IncodeTypography(i2, family, letterSpacing, weight, (SerializationConstructorMarker) null);
        }

        private void b(Encoder encoder, IncodeTypography incodeTypography) {
            int i2 = 2 % 2;
            int i3 = f5532c + 53;
            f5534e = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(incodeTypography, "");
            SerialDescriptor descriptor = getDescriptor();
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
            IncodeTypography.write$Self$onboard_release(incodeTypography, compositeEncoderBeginStructure, descriptor);
            compositeEncoderBeginStructure.endStructure(descriptor);
            int i5 = f5532c + 71;
            f5534e = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?>[] kSerializerArr;
            int i2 = 2 % 2;
            int i3 = f5532c + 7;
            f5534e = i3 % 128;
            if (i3 % 2 == 0) {
                kSerializerArr = new KSerializer[3];
                kSerializerArr[1] = IncodeTypography.access$get$childSerializers$cp()[0];
                kSerializerArr[1] = LetterSpacing.a.f5512c;
                kSerializerArr[2] = Weight.c.f5527d;
            } else {
                kSerializerArr = new KSerializer[]{IncodeTypography.access$get$childSerializers$cp()[0], LetterSpacing.a.f5512c, Weight.c.f5527d};
            }
            int i4 = f5534e + 49;
            f5532c = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializerArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public final /* synthetic */ Object deserialize(Decoder decoder) {
            int i2 = 2 % 2;
            int i3 = f5532c + 15;
            f5534e = i3 % 128;
            int i4 = i3 % 2;
            IncodeTypography incodeTypographyB = b(decoder);
            if (i4 == 0) {
                int i5 = 74 / 0;
            }
            int i6 = f5534e + 37;
            f5532c = i6 % 128;
            int i7 = i6 % 2;
            return incodeTypographyB;
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            int i2 = 2 % 2;
            int i3 = f5532c + 9;
            int i4 = i3 % 128;
            f5534e = i4;
            int i5 = i3 % 2;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f5531b;
            int i6 = i4 + 115;
            f5532c = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 40 / 0;
            }
            return pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final /* synthetic */ void serialize(Encoder encoder, Object obj) {
            int i2 = 2 % 2;
            int i3 = f5534e + 69;
            f5532c = i3 % 128;
            int i4 = i3 % 2;
            b(encoder, (IncodeTypography) obj);
            int i5 = f5534e + 87;
            f5532c = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] typeParametersSerializers() {
            KSerializer<?>[] kSerializerArrTypeParametersSerializers;
            int i2 = 2 % 2;
            int i3 = f5532c + 31;
            f5534e = i3 % 128;
            if (i3 % 2 == 0) {
                kSerializerArrTypeParametersSerializers = GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
                int i4 = 98 / 0;
            } else {
                kSerializerArrTypeParametersSerializers = GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
            int i5 = f5534e + 23;
            f5532c = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 97 / 0;
            }
            return kSerializerArrTypeParametersSerializers;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f5536c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f5537d = 0;

        private d() {
        }

        public final KSerializer<IncodeTypography> serializer() {
            int i2 = 2 % 2;
            int i3 = f5536c + 7;
            f5537d = i3 % 128;
            int i4 = i3 % 2;
            c cVar = c.f5530a;
            int i5 = f5537d + 51;
            f5536c = i5 % 128;
            int i6 = i5 % 2;
            return cVar;
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    static {
        int i2 = f5491c + 3;
        f5490b = i2 % 128;
        int i3 = i2 % 2;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ IncodeTypography(int i2, Family family, LetterSpacing letterSpacing, Weight weight, SerializationConstructorMarker serializationConstructorMarker) {
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

    public IncodeTypography(Family family, LetterSpacing letterSpacing, Weight weight) {
        Intrinsics.checkNotNullParameter(family, "");
        Intrinsics.checkNotNullParameter(letterSpacing, "");
        Intrinsics.checkNotNullParameter(weight, "");
        this.family = family;
        this.letterSpacing = letterSpacing;
        this.fontWeight = weight;
    }

    public static final /* synthetic */ KSerializer[] access$get$childSerializers$cp() {
        int i2 = 2 % 2;
        int i3 = f5493e + 65;
        f5492d = i3 % 128;
        int i4 = i3 % 2;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (i4 == 0) {
            int i5 = 5 / 0;
        }
        return kSerializerArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void write$Self$onboard_release(com.incode.welcome_sdk.commons.theme.IncodeTypography r14, kotlinx.serialization.encoding.CompositeEncoder r15, kotlinx.serialization.descriptors.SerialDescriptor r16) {
        /*
            r7 = 2
            int r0 = r7 % r7
            int r0 = com.incode.welcome_sdk.commons.theme.IncodeTypography.f5493e
            int r1 = r0 + 29
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.theme.IncodeTypography.f5492d = r0
            int r1 = r1 % r7
            kotlinx.serialization.KSerializer<java.lang.Object>[] r6 = com.incode.welcome_sdk.commons.theme.IncodeTypography.$childSerializers
            r5 = 0
            r0 = r16
            boolean r1 = r15.shouldEncodeElementDefault(r0, r5)
            if (r1 == 0) goto L9f
            int r1 = com.incode.welcome_sdk.commons.theme.IncodeTypography.f5493e
            int r2 = r1 + 57
        L1b:
            int r1 = r2 % 128
            com.incode.welcome_sdk.commons.theme.IncodeTypography.f5492d = r1
            int r2 = r2 % r7
            int r1 = com.incode.welcome_sdk.commons.theme.IncodeTypography.f5493e
            int r2 = r1 + 105
            int r1 = r2 % 128
            com.incode.welcome_sdk.commons.theme.IncodeTypography.f5492d = r1
            int r2 = r2 % r7
            r2 = r6[r5]
            kotlinx.serialization.SerializationStrategy r2 = (kotlinx.serialization.SerializationStrategy) r2
            com.incode.welcome_sdk.commons.theme.IncodeTypography$Family r1 = r14.family
            r15.encodeSerializableElement(r0, r5, r2, r1)
        L32:
            r2 = 1
            boolean r1 = r15.shouldEncodeElementDefault(r0, r2)
            if (r1 == 0) goto L85
        L39:
            com.incode.welcome_sdk.commons.theme.IncodeTypography$LetterSpacing$a r3 = com.incode.welcome_sdk.commons.theme.IncodeTypography.LetterSpacing.a.f5512c
            kotlinx.serialization.SerializationStrategy r3 = (kotlinx.serialization.SerializationStrategy) r3
            com.incode.welcome_sdk.commons.theme.IncodeTypography$LetterSpacing r1 = r14.letterSpacing
            r15.encodeSerializableElement(r0, r2, r3, r1)
        L42:
            r3 = 2
            boolean r1 = r15.shouldEncodeElementDefault(r0, r3)
            if (r1 == 0) goto L70
            int r1 = com.incode.welcome_sdk.commons.theme.IncodeTypography.f5492d
            int r2 = r1 + 79
            int r1 = r2 % 128
            com.incode.welcome_sdk.commons.theme.IncodeTypography.f5493e = r1
            int r2 = r2 % r3
        L52:
            int r1 = com.incode.welcome_sdk.commons.theme.IncodeTypography.f5493e
            int r2 = r1 + 121
            int r1 = r2 % 128
            com.incode.welcome_sdk.commons.theme.IncodeTypography.f5492d = r1
            r3 = 2
            int r2 = r2 % r3
            if (r2 != 0) goto L69
            com.incode.welcome_sdk.commons.theme.IncodeTypography$Weight$c r2 = com.incode.welcome_sdk.commons.theme.IncodeTypography.Weight.c.f5527d
            kotlinx.serialization.SerializationStrategy r2 = (kotlinx.serialization.SerializationStrategy) r2
            com.incode.welcome_sdk.commons.theme.IncodeTypography$Weight r1 = r14.fontWeight
            r3 = 5
        L65:
            r15.encodeSerializableElement(r0, r3, r2, r1)
        L68:
            return
        L69:
            com.incode.welcome_sdk.commons.theme.IncodeTypography$Weight$c r2 = com.incode.welcome_sdk.commons.theme.IncodeTypography.Weight.c.f5527d
            kotlinx.serialization.SerializationStrategy r2 = (kotlinx.serialization.SerializationStrategy) r2
            com.incode.welcome_sdk.commons.theme.IncodeTypography$Weight r1 = r14.fontWeight
            goto L65
        L70:
            com.incode.welcome_sdk.commons.theme.IncodeTypography$Weight r1 = r14.fontWeight
            com.incode.welcome_sdk.commons.theme.IncodeTypography$Weight r2 = new com.incode.welcome_sdk.commons.theme.IncodeTypography$Weight
            r7 = 15
            r8 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L68
            goto L52
        L85:
            com.incode.welcome_sdk.commons.theme.IncodeTypography$LetterSpacing r1 = r14.letterSpacing
            com.incode.welcome_sdk.commons.theme.IncodeTypography$LetterSpacing r3 = new com.incode.welcome_sdk.commons.theme.IncodeTypography$LetterSpacing
            r12 = 15
            r13 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r3 = r3
            r3.<init>(r4, r6, r8, r10, r12, r13)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L42
            goto L39
        L9f:
            com.incode.welcome_sdk.commons.theme.IncodeTypography$Family r4 = r14.family
            com.incode.welcome_sdk.commons.theme.IncodeTypography$Family r3 = new com.incode.welcome_sdk.commons.theme.IncodeTypography$Family
            r2 = 3
            r1 = 0
            r3.<init>(r1, r1, r2, r1)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r3)
            if (r1 != 0) goto L32
            int r1 = com.incode.welcome_sdk.commons.theme.IncodeTypography.f5493e
            int r2 = r1 + 11
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.theme.IncodeTypography.write$Self$onboard_release(com.incode.welcome_sdk.commons.theme.IncodeTypography, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public /* synthetic */ IncodeTypography(Family family, LetterSpacing letterSpacing, Weight weight, int i2, DefaultConstructorMarker defaultConstructorMarker) {
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
        int i2 = 2 % 2;
        int i3 = f5492d + 87;
        int i4 = i3 % 128;
        f5493e = i4;
        int i5 = i3 % 2;
        Family family = this.family;
        int i6 = i4 + 53;
        f5492d = i6 % 128;
        int i7 = i6 % 2;
        return family;
    }

    public final LetterSpacing getLetterSpacing() {
        int i2 = 2 % 2;
        int i3 = f5493e + 83;
        f5492d = i3 % 128;
        if (i3 % 2 != 0) {
            return this.letterSpacing;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Weight getFontWeight() {
        int i2 = 2 % 2;
        int i3 = f5492d;
        int i4 = i3 + 27;
        f5493e = i4 % 128;
        int i5 = i4 % 2;
        Weight weight = this.fontWeight;
        int i6 = i3 + 27;
        f5493e = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 98 / 0;
        }
        return weight;
    }

    @Serializable
    public static final class Weight {
        public static final int $stable = 0;
        public static final b Companion = new b(0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f5518b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f5519c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f5520d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f5521e = 0;
        private final FontWeight bold;
        private final FontWeight extraBold;
        private final FontWeight medium;
        private final FontWeight regular;

        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f5522a = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f5523b = 0;

            private b() {
            }

            public final KSerializer<Weight> serializer() {
                int i2 = 2 % 2;
                int i3 = f5522a + 17;
                f5523b = i3 % 128;
                int i4 = i3 % 2;
                c cVar = c.f5527d;
                if (i4 == 0) {
                    return cVar;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public /* synthetic */ b(byte b2) {
                this();
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public static final class c implements GeneratedSerializer<Weight> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f5524a = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f5525b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f5526c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final c f5527d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ PluginGeneratedSerialDescriptor f5528e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static int f5529g = 1;

            static {
                c cVar = new c();
                f5527d = cVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.incode.welcome_sdk.commons.theme.IncodeTypography.Weight", cVar, 4);
                pluginGeneratedSerialDescriptor.addElement("regular", true);
                pluginGeneratedSerialDescriptor.addElement("medium", true);
                pluginGeneratedSerialDescriptor.addElement("bold", true);
                pluginGeneratedSerialDescriptor.addElement("extraBold", true);
                f5528e = pluginGeneratedSerialDescriptor;
                int i2 = f5529g + 3;
                f5526c = i2 % 128;
                int i3 = i2 % 2;
            }

            private c() {
            }

            private void a(Encoder encoder, Weight weight) {
                int i2 = 2 % 2;
                int i3 = f5525b + 27;
                f5524a = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(encoder, "");
                    Intrinsics.checkNotNullParameter(weight, "");
                    SerialDescriptor descriptor = getDescriptor();
                    CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
                    Weight.write$Self$onboard_release(weight, compositeEncoderBeginStructure, descriptor);
                    compositeEncoderBeginStructure.endStructure(descriptor);
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(encoder, "");
                Intrinsics.checkNotNullParameter(weight, "");
                SerialDescriptor descriptor2 = getDescriptor();
                CompositeEncoder compositeEncoderBeginStructure2 = encoder.beginStructure(descriptor2);
                Weight.write$Self$onboard_release(weight, compositeEncoderBeginStructure2, descriptor2);
                compositeEncoderBeginStructure2.endStructure(descriptor2);
                int i4 = f5524a + 73;
                f5525b = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            }

            private Weight d(Decoder decoder) {
                int i2;
                FontWeight fontWeight;
                FontWeight fontWeight2;
                FontWeight fontWeight3;
                FontWeight fontWeight4;
                int i3 = 2 % 2;
                int i4 = f5525b + 61;
                f5524a = i4 % 128;
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
                    while (!(!z2)) {
                        int i6 = f5524a + 9;
                        f5525b = i6 % 128;
                        int i7 = i6 % 2;
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                        if (iDecodeElementIndex == -1) {
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
                            int i8 = f5524a + 21;
                            f5525b = i8 % 128;
                            int i9 = i8 % 2;
                        } else {
                            if (iDecodeElementIndex != 3) {
                                throw new UnknownFieldException(iDecodeElementIndex);
                            }
                            fontWeight3 = (FontWeight) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 3, com.incode.welcome_sdk.commons.theme.c.f5599e, fontWeight3);
                            i2 |= 8;
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
                int i3 = f5524a + 103;
                f5525b = i3 % 128;
                int i4 = i3 % 2;
                KSerializer<?>[] kSerializerArr = {com.incode.welcome_sdk.commons.theme.c.f5599e, com.incode.welcome_sdk.commons.theme.c.f5599e, com.incode.welcome_sdk.commons.theme.c.f5599e, com.incode.welcome_sdk.commons.theme.c.f5599e};
                int i5 = f5525b + 65;
                f5524a = i5 % 128;
                if (i5 % 2 != 0) {
                    return kSerializerArr;
                }
                throw null;
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            public final /* synthetic */ Object deserialize(Decoder decoder) {
                int i2 = 2 % 2;
                int i3 = f5525b + 41;
                f5524a = i3 % 128;
                int i4 = i3 % 2;
                Weight weightD = d(decoder);
                int i5 = f5524a + 105;
                f5525b = i5 % 128;
                int i6 = i5 % 2;
                return weightD;
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public final SerialDescriptor getDescriptor() {
                int i2 = 2 % 2;
                int i3 = f5525b;
                int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f5524a = i4 % 128;
                int i5 = i4 % 2;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f5528e;
                int i6 = i3 + 89;
                f5524a = i6 % 128;
                if (i6 % 2 != 0) {
                    return pluginGeneratedSerialDescriptor;
                }
                throw null;
            }

            @Override // kotlinx.serialization.SerializationStrategy
            public final /* synthetic */ void serialize(Encoder encoder, Object obj) {
                int i2 = 2 % 2;
                int i3 = f5525b + 71;
                f5524a = i3 % 128;
                int i4 = i3 % 2;
                a(encoder, (Weight) obj);
                if (i4 == 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                int i5 = f5524a + 5;
                f5525b = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer<?>[] typeParametersSerializers() {
                int i2 = 2 % 2;
                int i3 = f5525b + 55;
                f5524a = i3 % 128;
                int i4 = i3 % 2;
                KSerializer<?>[] kSerializerArrTypeParametersSerializers = GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
                int i5 = f5524a + 7;
                f5525b = i5 % 128;
                if (i5 % 2 == 0) {
                    return kSerializerArrTypeParametersSerializers;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
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

        /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final /* synthetic */ void write$Self$onboard_release(com.incode.welcome_sdk.commons.theme.IncodeTypography.Weight r4, kotlinx.serialization.encoding.CompositeEncoder r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
            /*
                Method dump skipped, instruction units count: 236
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.theme.IncodeTypography.Weight.write$Self$onboard_release(com.incode.welcome_sdk.commons.theme.IncodeTypography$Weight, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        public /* synthetic */ Weight(FontWeight fontWeight, FontWeight fontWeight2, FontWeight fontWeight3, FontWeight fontWeight4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? IncodeTypefaceTokens.INSTANCE.getWeightRegular() : fontWeight, (i2 & 2) != 0 ? IncodeTypefaceTokens.INSTANCE.getWeightMedium() : fontWeight2, (i2 & 4) != 0 ? IncodeTypefaceTokens.INSTANCE.getWeightBold() : fontWeight3, (i2 & 8) != 0 ? IncodeTypefaceTokens.INSTANCE.getWeightExtraBold() : fontWeight4);
        }

        public final FontWeight getRegular() {
            int i2 = 2 % 2;
            int i3 = f5518b + 79;
            f5519c = i3 % 128;
            if (i3 % 2 == 0) {
                return this.regular;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final FontWeight getMedium() {
            int i2 = 2 % 2;
            int i3 = f5518b;
            int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f5519c = i4 % 128;
            int i5 = i4 % 2;
            FontWeight fontWeight = this.medium;
            int i6 = i3 + 97;
            f5519c = i6 % 128;
            int i7 = i6 % 2;
            return fontWeight;
        }

        public final FontWeight getBold() {
            int i2 = 2 % 2;
            int i3 = f5518b;
            int i4 = i3 + 123;
            f5519c = i4 % 128;
            int i5 = i4 % 2;
            FontWeight fontWeight = this.bold;
            int i6 = i3 + 103;
            f5519c = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 78 / 0;
            }
            return fontWeight;
        }

        public final FontWeight getExtraBold() {
            int i2 = 2 % 2;
            int i3 = f5519c;
            int i4 = i3 + 113;
            f5518b = i4 % 128;
            int i5 = i4 % 2;
            FontWeight fontWeight = this.extraBold;
            int i6 = i3 + 5;
            f5518b = i6 % 128;
            if (i6 % 2 != 0) {
                return fontWeight;
            }
            throw null;
        }

        static {
            int i2 = f5520d + 15;
            f5521e = i2 % 128;
            int i3 = i2 % 2;
        }

        public Weight() {
            this((FontWeight) null, (FontWeight) null, (FontWeight) null, (FontWeight) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Weight(FontWeight fontWeight) {
            this(fontWeight, (FontWeight) null, (FontWeight) null, (FontWeight) null, 14, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(fontWeight, "");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Weight(FontWeight fontWeight, FontWeight fontWeight2) {
            this(fontWeight, fontWeight2, (FontWeight) null, (FontWeight) null, 12, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(fontWeight, "");
            Intrinsics.checkNotNullParameter(fontWeight2, "");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Weight(FontWeight fontWeight, FontWeight fontWeight2, FontWeight fontWeight3) {
            this(fontWeight, fontWeight2, fontWeight3, (FontWeight) null, 8, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(fontWeight, "");
            Intrinsics.checkNotNullParameter(fontWeight2, "");
            Intrinsics.checkNotNullParameter(fontWeight3, "");
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            int i3 = f5518b + 73;
            int i4 = i3 % 128;
            f5519c = i4;
            if (i3 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof Weight) {
                Weight weight = (Weight) obj;
                return Intrinsics.areEqual(this.regular, weight.regular) && Intrinsics.areEqual(this.medium, weight.medium) && Intrinsics.areEqual(this.bold, weight.bold) && Intrinsics.areEqual(this.extraBold, weight.extraBold);
            }
            int i5 = i4 + 89;
            f5518b = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = f5518b + 97;
            f5519c = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode = (((((this.regular.hashCode() * 31) + this.medium.hashCode()) * 31) + this.bold.hashCode()) * 31) + this.extraBold.hashCode();
            int i5 = f5518b + 111;
            f5519c = i5 % 128;
            int i6 = i5 % 2;
            return iHashCode;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f5519c + 71;
            f5518b = i3 % 128;
            int i4 = i3 % 2;
            String str = "Weight(regular=" + this.regular + ", medium=" + this.medium + ", bold=" + this.bold + ", extraBold=" + this.extraBold + ")";
            int i5 = f5518b + 115;
            f5519c = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 75 / 0;
            }
            return str;
        }

        public static /* synthetic */ Weight copy$default(Weight weight, FontWeight fontWeight, FontWeight fontWeight2, FontWeight fontWeight3, FontWeight fontWeight4, int i2, Object obj) {
            int i3 = 2 % 2;
            Object obj2 = null;
            if ((i2 & 1) != 0) {
                int i4 = f5518b + 117;
                f5519c = i4 % 128;
                if (i4 % 2 != 0) {
                    FontWeight fontWeight5 = weight.regular;
                    obj2.hashCode();
                    throw null;
                }
                fontWeight = weight.regular;
            }
            if ((i2 & 2) != 0) {
                int i5 = f5519c + 55;
                f5518b = i5 % 128;
                if (i5 % 2 == 0) {
                    fontWeight2 = weight.medium;
                    int i6 = 11 / 0;
                } else {
                    fontWeight2 = weight.medium;
                }
            }
            if ((i2 & 4) != 0) {
                int i7 = f5518b + 79;
                f5519c = i7 % 128;
                if (i7 % 2 != 0) {
                    FontWeight fontWeight6 = weight.bold;
                    obj2.hashCode();
                    throw null;
                }
                fontWeight3 = weight.bold;
            }
            if ((i2 & 8) != 0) {
                int i8 = f5519c + 105;
                f5518b = i8 % 128;
                if (i8 % 2 == 0) {
                    fontWeight4 = weight.extraBold;
                    int i9 = 26 / 0;
                } else {
                    fontWeight4 = weight.extraBold;
                }
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
            int i3 = f5518b + 35;
            f5519c = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 15 / 0;
            }
            return weight;
        }

        public final FontWeight component4() {
            int i2 = 2 % 2;
            int i3 = f5518b + 113;
            int i4 = i3 % 128;
            f5519c = i4;
            int i5 = i3 % 2;
            FontWeight fontWeight = this.extraBold;
            int i6 = i4 + 99;
            f5518b = i6 % 128;
            if (i6 % 2 != 0) {
                return fontWeight;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final FontWeight component3() {
            int i2 = 2 % 2;
            int i3 = f5519c;
            int i4 = i3 + 5;
            f5518b = i4 % 128;
            int i5 = i4 % 2;
            FontWeight fontWeight = this.bold;
            int i6 = i3 + 17;
            f5518b = i6 % 128;
            int i7 = i6 % 2;
            return fontWeight;
        }

        public final FontWeight component2() {
            int i2 = 2 % 2;
            int i3 = f5519c + 35;
            int i4 = i3 % 128;
            f5518b = i4;
            int i5 = i3 % 2;
            FontWeight fontWeight = this.medium;
            int i6 = i4 + 99;
            f5519c = i6 % 128;
            int i7 = i6 % 2;
            return fontWeight;
        }

        public final FontWeight component1() {
            int i2 = 2 % 2;
            int i3 = f5518b;
            int i4 = i3 + 61;
            f5519c = i4 % 128;
            int i5 = i4 % 2;
            FontWeight fontWeight = this.regular;
            int i6 = i3 + 47;
            f5519c = i6 % 128;
            int i7 = i6 % 2;
            return fontWeight;
        }
    }

    @Serializable
    public static final class Family {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f5494a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f5495b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f5496c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f5497d = 0;
        private final FontFamily display;
        private final FontFamily text;
        public static final d Companion = new d(0);
        private static final KSerializer<Object>[] $childSerializers = {new ContextualSerializer(Reflection.getOrCreateKotlinClass(FontFamily.class), null, new KSerializer[0]), new ContextualSerializer(Reflection.getOrCreateKotlinClass(FontFamily.class), null, new KSerializer[0])};

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public static final class a implements GeneratedSerializer<Family> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f5498a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f5499b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f5500c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ PluginGeneratedSerialDescriptor f5501d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f5502e = 1;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static int f5503j = 1;

            static {
                a aVar = new a();
                f5500c = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.incode.welcome_sdk.commons.theme.IncodeTypography.Family", aVar, 2);
                pluginGeneratedSerialDescriptor.addElement("text", true);
                pluginGeneratedSerialDescriptor.addElement("display", true);
                f5501d = pluginGeneratedSerialDescriptor;
                int i2 = f5498a + 59;
                f5503j = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 75 / 0;
                }
            }

            private a() {
            }

            private void b(Encoder encoder, Family family) {
                int i2 = 2 % 2;
                int i3 = f5502e + 115;
                f5499b = i3 % 128;
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
                throw null;
            }

            private Family e(Decoder decoder) {
                FontFamily fontFamily;
                FontFamily fontFamily2;
                int i2;
                int i3 = 2 % 2;
                Intrinsics.checkNotNullParameter(decoder, "");
                SerialDescriptor descriptor = getDescriptor();
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
                KSerializer[] kSerializerArrAccess$get$childSerializers$cp = Family.access$get$childSerializers$cp();
                SerializationConstructorMarker serializationConstructorMarker = null;
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    fontFamily2 = (FontFamily) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, kSerializerArrAccess$get$childSerializers$cp[0], null);
                    fontFamily = (FontFamily) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, kSerializerArrAccess$get$childSerializers$cp[1], null);
                    int i4 = f5499b + 53;
                    f5502e = i4 % 128;
                    int i5 = i4 % 2;
                    i2 = 3;
                } else {
                    fontFamily = null;
                    fontFamily2 = null;
                    i2 = 0;
                    boolean z2 = true;
                    while (z2) {
                        int i6 = f5499b + 81;
                        f5502e = i6 % 128;
                        int i7 = i6 % 2;
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                        if (iDecodeElementIndex == -1) {
                            z2 = false;
                        } else if (iDecodeElementIndex == 0) {
                            fontFamily2 = (FontFamily) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, kSerializerArrAccess$get$childSerializers$cp[0], fontFamily2);
                            i2 |= 1;
                        } else {
                            if (iDecodeElementIndex != 1) {
                                throw new UnknownFieldException(iDecodeElementIndex);
                            }
                            fontFamily = (FontFamily) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, kSerializerArrAccess$get$childSerializers$cp[1], fontFamily);
                            i2 |= 2;
                        }
                    }
                }
                compositeDecoderBeginStructure.endStructure(descriptor);
                return new Family(i2, fontFamily2, fontFamily, serializationConstructorMarker);
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer<?>[] childSerializers() {
                KSerializer<?>[] kSerializerArr;
                int i2 = 2 % 2;
                int i3 = f5502e + 17;
                f5499b = i3 % 128;
                if (i3 % 2 != 0) {
                    KSerializer<?>[] kSerializerArrAccess$get$childSerializers$cp = Family.access$get$childSerializers$cp();
                    kSerializerArr = new KSerializer[5];
                    kSerializerArr[1] = kSerializerArrAccess$get$childSerializers$cp[1];
                    kSerializerArr[0] = kSerializerArrAccess$get$childSerializers$cp[1];
                } else {
                    KSerializer<?>[] kSerializerArrAccess$get$childSerializers$cp2 = Family.access$get$childSerializers$cp();
                    kSerializerArr = new KSerializer[]{kSerializerArrAccess$get$childSerializers$cp2[0], kSerializerArrAccess$get$childSerializers$cp2[1]};
                }
                int i4 = f5502e + 49;
                f5499b = i4 % 128;
                if (i4 % 2 == 0) {
                    return kSerializerArr;
                }
                throw null;
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            public final /* synthetic */ Object deserialize(Decoder decoder) {
                int i2 = 2 % 2;
                int i3 = f5499b + 63;
                f5502e = i3 % 128;
                if (i3 % 2 == 0) {
                    e(decoder);
                    throw null;
                }
                Family familyE = e(decoder);
                int i4 = f5502e + 3;
                f5499b = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 62 / 0;
                }
                return familyE;
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public final SerialDescriptor getDescriptor() {
                int i2 = 2 % 2;
                int i3 = f5502e + 93;
                f5499b = i3 % 128;
                int i4 = i3 % 2;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f5501d;
                if (i4 == 0) {
                    return pluginGeneratedSerialDescriptor;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // kotlinx.serialization.SerializationStrategy
            public final /* synthetic */ void serialize(Encoder encoder, Object obj) {
                int i2 = 2 % 2;
                int i3 = f5502e + 11;
                f5499b = i3 % 128;
                int i4 = i3 % 2;
                b(encoder, (Family) obj);
                int i5 = f5502e + 99;
                f5499b = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer<?>[] typeParametersSerializers() {
                int i2 = 2 % 2;
                int i3 = f5499b + 111;
                f5502e = i3 % 128;
                int i4 = i3 % 2;
                KSerializer<?>[] kSerializerArrTypeParametersSerializers = GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
                int i5 = f5499b + 37;
                f5502e = i5 % 128;
                int i6 = i5 % 2;
                return kSerializerArrTypeParametersSerializers;
            }
        }

        public static final class d {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f5504b = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f5505e = 1;

            private d() {
            }

            public final KSerializer<Family> serializer() {
                int i2 = 2 % 2;
                int i3 = f5504b + 75;
                f5505e = i3 % 128;
                int i4 = i3 % 2;
                a aVar = a.f5500c;
                int i5 = f5505e + 51;
                f5504b = i5 % 128;
                if (i5 % 2 == 0) {
                    return aVar;
                }
                throw null;
            }

            public /* synthetic */ d(byte b2) {
                this();
            }
        }

        static {
            int i2 = f5497d + 53;
            f5495b = i2 % 128;
            int i3 = i2 % 2;
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
            int i3 = f5494a;
            int i4 = i3 + 115;
            f5496c = i4 % 128;
            int i5 = i4 % 2;
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            int i6 = i3 + 83;
            f5496c = i6 % 128;
            int i7 = i6 % 2;
            return kSerializerArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final /* synthetic */ void write$Self$onboard_release(com.incode.welcome_sdk.commons.theme.IncodeTypography.Family r6, kotlinx.serialization.encoding.CompositeEncoder r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
            /*
                r5 = 2
                int r0 = r5 % r5
                int r0 = com.incode.welcome_sdk.commons.theme.IncodeTypography.Family.f5494a
                int r1 = r0 + 11
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.theme.IncodeTypography.Family.f5496c = r0
                int r1 = r1 % r5
                kotlinx.serialization.KSerializer<java.lang.Object>[] r4 = com.incode.welcome_sdk.commons.theme.IncodeTypography.Family.$childSerializers
                r3 = 0
                boolean r0 = r7.shouldEncodeElementDefault(r8, r3)
                if (r0 == 0) goto L5e
                int r0 = com.incode.welcome_sdk.commons.theme.IncodeTypography.Family.f5494a
                int r1 = r0 + 57
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.theme.IncodeTypography.Family.f5496c = r0
                int r1 = r1 % r5
                int r1 = r0 + 123
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.theme.IncodeTypography.Family.f5494a = r0
                int r1 = r1 % r5
            L25:
                r1 = r4[r3]
                kotlinx.serialization.SerializationStrategy r1 = (kotlinx.serialization.SerializationStrategy) r1
                androidx.compose.ui.text.font.FontFamily r0 = r6.text
                r7.encodeSerializableElement(r8, r3, r1, r0)
            L2e:
                r2 = 1
                boolean r0 = r7.shouldEncodeElementDefault(r8, r2)
                if (r0 == 0) goto L4e
                int r0 = com.incode.welcome_sdk.commons.theme.IncodeTypography.Family.f5494a
                int r1 = r0 + 73
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.theme.IncodeTypography.Family.f5496c = r0
                int r1 = r1 % r5
                if (r1 == 0) goto L5c
            L40:
                r0 = r3 ^ 1
                if (r0 == r2) goto L4d
                r1 = r4[r2]
                kotlinx.serialization.SerializationStrategy r1 = (kotlinx.serialization.SerializationStrategy) r1
                androidx.compose.ui.text.font.FontFamily r0 = r6.display
                r7.encodeSerializableElement(r8, r2, r1, r0)
            L4d:
                return
            L4e:
                androidx.compose.ui.text.font.FontFamily r1 = r6.display
                com.incode.welcome_sdk.commons.theme.IncodeTypefaceTokens r0 = com.incode.welcome_sdk.commons.theme.IncodeTypefaceTokens.INSTANCE
                androidx.compose.ui.text.font.FontFamily r0 = r0.getFamilyDisplay()
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
                if (r0 != 0) goto L40
            L5c:
                r3 = r2
                goto L40
            L5e:
                androidx.compose.ui.text.font.FontFamily r1 = r6.text
                com.incode.welcome_sdk.commons.theme.IncodeTypefaceTokens r0 = com.incode.welcome_sdk.commons.theme.IncodeTypefaceTokens.INSTANCE
                androidx.compose.ui.text.font.FontFamily r0 = r0.getFamilyText()
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
                if (r0 != 0) goto L2e
                int r0 = com.incode.welcome_sdk.commons.theme.IncodeTypography.Family.f5494a
                int r1 = r0 + 113
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.theme.IncodeTypography.Family.f5496c = r0
                int r1 = r1 % r5
                goto L25
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.theme.IncodeTypography.Family.write$Self$onboard_release(com.incode.welcome_sdk.commons.theme.IncodeTypography$Family, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        public /* synthetic */ Family(FontFamily fontFamily, FontFamily fontFamily2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? IncodeTypefaceTokens.INSTANCE.getFamilyText() : fontFamily, (i2 & 2) != 0 ? IncodeTypefaceTokens.INSTANCE.getFamilyDisplay() : fontFamily2);
        }

        public final FontFamily getText() {
            int i2 = 2 % 2;
            int i3 = f5496c;
            int i4 = i3 + 11;
            f5494a = i4 % 128;
            int i5 = i4 % 2;
            FontFamily fontFamily = this.text;
            int i6 = i3 + 103;
            f5494a = i6 % 128;
            if (i6 % 2 != 0) {
                return fontFamily;
            }
            throw null;
        }

        public final FontFamily getDisplay() {
            int i2 = 2 % 2;
            int i3 = f5494a + 49;
            int i4 = i3 % 128;
            f5496c = i4;
            int i5 = i3 % 2;
            FontFamily fontFamily = this.display;
            int i6 = i4 + 61;
            f5494a = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 78 / 0;
            }
            return fontFamily;
        }

        public Family() {
            this((FontFamily) null, (FontFamily) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Family(FontFamily fontFamily) {
            this(fontFamily, (FontFamily) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            Intrinsics.checkNotNullParameter(fontFamily, "");
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            int i3 = f5494a + 29;
            f5496c = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Family)) {
                return false;
            }
            Family family = (Family) obj;
            if (Intrinsics.areEqual(this.text, family.text)) {
                if (!Intrinsics.areEqual(this.display, family.display)) {
                    return false;
                }
                int i5 = f5494a + 123;
                f5496c = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            int i7 = f5496c;
            int i8 = i7 + 101;
            f5494a = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i7 + 9;
            f5494a = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = f5496c + 83;
            f5494a = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode = this.text.hashCode();
            return i4 == 0 ? (iHashCode + 17) >>> this.display.hashCode() : (iHashCode * 31) + this.display.hashCode();
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f5496c + 41;
            f5494a = i3 % 128;
            if (i3 % 2 == 0) {
                String str = "Family(text=" + this.text + ", display=" + this.display + ")";
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str2 = "Family(text=" + this.text + ", display=" + this.display + ")";
            int i4 = f5494a + 113;
            f5496c = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 0;
            }
            return str2;
        }

        public static /* synthetic */ Family copy$default(Family family, FontFamily fontFamily, FontFamily fontFamily2, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = f5496c;
            int i5 = i4 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f5494a = i5 % 128;
            int i6 = i5 % 2;
            if ((i2 & 1) != 0) {
                int i7 = i4 + 107;
                f5494a = i7 % 128;
                if (i7 % 2 == 0) {
                    fontFamily = family.text;
                    int i8 = 57 / 0;
                } else {
                    fontFamily = family.text;
                }
            }
            if ((i2 & 2) != 0) {
                int i9 = i4 + 35;
                int i10 = i9 % 128;
                f5494a = i10;
                int i11 = i9 % 2;
                fontFamily2 = family.display;
                int i12 = i10 + 7;
                f5496c = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 5 / 3;
                }
            }
            return family.copy(fontFamily, fontFamily2);
        }

        public final Family copy(FontFamily fontFamily, FontFamily fontFamily2) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(fontFamily, "");
            Intrinsics.checkNotNullParameter(fontFamily2, "");
            Family family = new Family(fontFamily, fontFamily2);
            int i3 = f5494a + 81;
            f5496c = i3 % 128;
            if (i3 % 2 == 0) {
                return family;
            }
            throw null;
        }

        public final FontFamily component2() {
            int i2 = 2 % 2;
            int i3 = f5494a + 93;
            int i4 = i3 % 128;
            f5496c = i4;
            int i5 = i3 % 2;
            FontFamily fontFamily = this.display;
            int i6 = i4 + 11;
            f5494a = i6 % 128;
            int i7 = i6 % 2;
            return fontFamily;
        }

        public final FontFamily component1() {
            int i2 = 2 % 2;
            int i3 = f5494a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            int i4 = i3 % 128;
            f5496c = i4;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            FontFamily fontFamily = this.text;
            int i5 = i4 + 99;
            f5494a = i5 % 128;
            if (i5 % 2 != 0) {
                return fontFamily;
            }
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ void getDisplay$annotations() {
            int i2 = 2 % 2;
            int i3 = f5494a + 33;
            f5496c = i3 % 128;
            int i4 = i3 % 2;
        }

        public static /* synthetic */ void getText$annotations() {
            int i2 = 2 % 2;
            int i3 = f5496c + 67;
            f5494a = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    @Serializable
    public static final class LetterSpacing {
        public static final int $stable = 0;
        public static final c Companion = new c(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f5506a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f5507b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f5508c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f5509d = 0;
        private final long extraLarge;
        private final long large;
        private final long medium;
        private final long none;

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public static final class a implements GeneratedSerializer<LetterSpacing> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f5510a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f5511b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f5512c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f5513d = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ PluginGeneratedSerialDescriptor f5514e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static int f5515g = 1;

            static {
                a aVar = new a();
                f5512c = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.incode.welcome_sdk.commons.theme.IncodeTypography.LetterSpacing", aVar, 4);
                pluginGeneratedSerialDescriptor.addElement("none", true);
                pluginGeneratedSerialDescriptor.addElement("medium", true);
                pluginGeneratedSerialDescriptor.addElement("large", true);
                pluginGeneratedSerialDescriptor.addElement("extraLarge", true);
                f5514e = pluginGeneratedSerialDescriptor;
                int i2 = f5515g + 9;
                f5511b = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
            }

            private a() {
            }

            private void b(Encoder encoder, LetterSpacing letterSpacing) {
                int i2 = 2 % 2;
                int i3 = f5510a + 37;
                f5513d = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(encoder, "");
                    Intrinsics.checkNotNullParameter(letterSpacing, "");
                    SerialDescriptor descriptor = getDescriptor();
                    CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
                    LetterSpacing.write$Self$onboard_release(letterSpacing, compositeEncoderBeginStructure, descriptor);
                    compositeEncoderBeginStructure.endStructure(descriptor);
                    throw null;
                }
                Intrinsics.checkNotNullParameter(encoder, "");
                Intrinsics.checkNotNullParameter(letterSpacing, "");
                SerialDescriptor descriptor2 = getDescriptor();
                CompositeEncoder compositeEncoderBeginStructure2 = encoder.beginStructure(descriptor2);
                LetterSpacing.write$Self$onboard_release(letterSpacing, compositeEncoderBeginStructure2, descriptor2);
                compositeEncoderBeginStructure2.endStructure(descriptor2);
                int i4 = f5510a + 103;
                f5513d = i4 % 128;
                int i5 = i4 % 2;
            }

            private LetterSpacing d(Decoder decoder) {
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
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                        if (iDecodeElementIndex == -1) {
                            int i4 = f5513d + 29;
                            f5510a = i4 % 128;
                            int i5 = i4 % 2;
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
                            int i6 = f5513d + 73;
                            f5510a = i6 % 128;
                            int i7 = i6 % 2;
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

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer<?>[] childSerializers() {
                KSerializer<?>[] kSerializerArr;
                int i2 = 2 % 2;
                int i3 = f5510a + 91;
                f5513d = i3 % 128;
                if (i3 % 2 == 0) {
                    kSerializerArr = new KSerializer[4];
                    kSerializerArr[0] = m.f5753b;
                    kSerializerArr[1] = m.f5753b;
                    kSerializerArr[5] = m.f5753b;
                    kSerializerArr[5] = m.f5753b;
                } else {
                    kSerializerArr = new KSerializer[]{m.f5753b, m.f5753b, m.f5753b, m.f5753b};
                }
                int i4 = f5513d + 67;
                f5510a = i4 % 128;
                if (i4 % 2 == 0) {
                    return kSerializerArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            public final /* synthetic */ Object deserialize(Decoder decoder) {
                int i2 = 2 % 2;
                int i3 = f5513d + 101;
                f5510a = i3 % 128;
                if (i3 % 2 == 0) {
                    return d(decoder);
                }
                d(decoder);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public final SerialDescriptor getDescriptor() {
                int i2 = 2 % 2;
                int i3 = f5513d + 25;
                f5510a = i3 % 128;
                int i4 = i3 % 2;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f5514e;
                if (i4 != 0) {
                    int i5 = 6 / 0;
                }
                return pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.SerializationStrategy
            public final /* synthetic */ void serialize(Encoder encoder, Object obj) {
                int i2 = 2 % 2;
                int i3 = f5510a + 51;
                f5513d = i3 % 128;
                int i4 = i3 % 2;
                b(encoder, (LetterSpacing) obj);
                int i5 = f5510a + 65;
                f5513d = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer<?>[] typeParametersSerializers() {
                int i2 = 2 % 2;
                int i3 = f5513d + 63;
                f5510a = i3 % 128;
                int i4 = i3 % 2;
                KSerializer<?>[] kSerializerArrTypeParametersSerializers = GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
                int i5 = f5513d + 101;
                f5510a = i5 % 128;
                if (i5 % 2 == 0) {
                    return kSerializerArrTypeParametersSerializers;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public static final class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f5516a = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f5517e = 1;

            private c() {
            }

            public final KSerializer<LetterSpacing> serializer() {
                a aVar;
                int i2 = 2 % 2;
                int i3 = f5517e + 105;
                f5516a = i3 % 128;
                if (i3 % 2 != 0) {
                    aVar = a.f5512c;
                    int i4 = 17 / 0;
                } else {
                    aVar = a.f5512c;
                }
                int i5 = f5516a + 65;
                f5517e = i5 % 128;
                int i6 = i5 % 2;
                return aVar;
            }

            public /* synthetic */ c(byte b2) {
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

        /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final /* synthetic */ void write$Self$onboard_release(com.incode.welcome_sdk.commons.theme.IncodeTypography.LetterSpacing r8, kotlinx.serialization.encoding.CompositeEncoder r9, kotlinx.serialization.descriptors.SerialDescriptor r10) {
            /*
                r4 = 2
                int r0 = r4 % r4
                r6 = 0
                boolean r0 = r9.shouldEncodeElementDefault(r10, r6)
                if (r0 == 0) goto Lb7
            La:
                int r0 = com.incode.welcome_sdk.commons.theme.IncodeTypography.LetterSpacing.f5509d
                int r1 = r0 + 115
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.theme.IncodeTypography.LetterSpacing.f5506a = r0
                int r1 = r1 % r4
                com.incode.welcome_sdk.commons.theme.m r2 = com.incode.welcome_sdk.commons.theme.m.f5753b
                kotlinx.serialization.SerializationStrategy r2 = (kotlinx.serialization.SerializationStrategy) r2
                long r0 = r8.none
                androidx.compose.ui.unit.TextUnit r0 = androidx.compose.ui.unit.TextUnit.m6821boximpl(r0)
                r9.encodeSerializableElement(r10, r6, r2, r0)
            L20:
                r5 = 1
                boolean r0 = r9.shouldEncodeElementDefault(r10, r5)
                if (r0 == 0) goto L91
                int r0 = com.incode.welcome_sdk.commons.theme.IncodeTypography.LetterSpacing.f5506a
                int r1 = r0 + 29
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.theme.IncodeTypography.LetterSpacing.f5509d = r0
                int r1 = r1 % r4
                if (r1 == 0) goto L9f
            L32:
                boolean r0 = r9.shouldEncodeElementDefault(r10, r4)
                if (r0 == 0) goto L81
            L38:
                com.incode.welcome_sdk.commons.theme.m r2 = com.incode.welcome_sdk.commons.theme.m.f5753b
                kotlinx.serialization.SerializationStrategy r2 = (kotlinx.serialization.SerializationStrategy) r2
                long r0 = r8.large
                androidx.compose.ui.unit.TextUnit r0 = androidx.compose.ui.unit.TextUnit.m6821boximpl(r0)
                r9.encodeSerializableElement(r10, r4, r2, r0)
            L45:
                r7 = 3
                boolean r0 = r9.shouldEncodeElementDefault(r10, r7)
                if (r0 == r5) goto L77
                long r2 = r8.extraLarge
                com.incode.welcome_sdk.commons.theme.IncodeTypefaceTokens r0 = com.incode.welcome_sdk.commons.theme.IncodeTypefaceTokens.INSTANCE
                long r0 = r0.m8076getLetterSpacingExtraLargeXSAIIZE()
                boolean r0 = androidx.compose.ui.unit.TextUnit.m6828equalsimpl0(r2, r0)
                if (r0 != 0) goto L6d
            L5a:
                r6 = r5
            L5b:
                r0 = r6 ^ 1
                if (r0 == r5) goto L6c
                com.incode.welcome_sdk.commons.theme.m r2 = com.incode.welcome_sdk.commons.theme.m.f5753b
                kotlinx.serialization.SerializationStrategy r2 = (kotlinx.serialization.SerializationStrategy) r2
                long r0 = r8.extraLarge
                androidx.compose.ui.unit.TextUnit r0 = androidx.compose.ui.unit.TextUnit.m6821boximpl(r0)
                r9.encodeSerializableElement(r10, r7, r2, r0)
            L6c:
                return
            L6d:
                int r0 = com.incode.welcome_sdk.commons.theme.IncodeTypography.LetterSpacing.f5506a
                int r1 = r0 + 89
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.theme.IncodeTypography.LetterSpacing.f5509d = r0
                int r1 = r1 % r4
                goto L5b
            L77:
                int r0 = com.incode.welcome_sdk.commons.theme.IncodeTypography.LetterSpacing.f5509d
                int r1 = r0 + 13
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.theme.IncodeTypography.LetterSpacing.f5506a = r0
                int r1 = r1 % r4
                goto L5a
            L81:
                long r2 = r8.large
                com.incode.welcome_sdk.commons.theme.IncodeTypefaceTokens r0 = com.incode.welcome_sdk.commons.theme.IncodeTypefaceTokens.INSTANCE
                long r0 = r0.m8077getLetterSpacingLargeXSAIIZE()
                boolean r0 = androidx.compose.ui.unit.TextUnit.m6828equalsimpl0(r2, r0)
                r0 = r0 ^ r5
                if (r0 == r5) goto L38
                goto L45
            L91:
                long r2 = r8.medium
                com.incode.welcome_sdk.commons.theme.IncodeTypefaceTokens r0 = com.incode.welcome_sdk.commons.theme.IncodeTypefaceTokens.INSTANCE
                long r0 = r0.m8078getLetterSpacingMediumXSAIIZE()
                boolean r0 = androidx.compose.ui.unit.TextUnit.m6828equalsimpl0(r2, r0)
                if (r0 != 0) goto L32
            L9f:
                int r0 = com.incode.welcome_sdk.commons.theme.IncodeTypography.LetterSpacing.f5506a
                int r1 = r0 + 25
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.theme.IncodeTypography.LetterSpacing.f5509d = r0
                int r1 = r1 % r4
                com.incode.welcome_sdk.commons.theme.m r2 = com.incode.welcome_sdk.commons.theme.m.f5753b
                kotlinx.serialization.SerializationStrategy r2 = (kotlinx.serialization.SerializationStrategy) r2
                long r0 = r8.medium
                androidx.compose.ui.unit.TextUnit r0 = androidx.compose.ui.unit.TextUnit.m6821boximpl(r0)
                r9.encodeSerializableElement(r10, r5, r2, r0)
                goto L32
            Lb7:
                long r2 = r8.none
                com.incode.welcome_sdk.commons.theme.IncodeTypefaceTokens r0 = com.incode.welcome_sdk.commons.theme.IncodeTypefaceTokens.INSTANCE
                long r0 = r0.m8079getLetterSpacingNoneXSAIIZE()
                boolean r0 = androidx.compose.ui.unit.TextUnit.m6828equalsimpl0(r2, r0)
                if (r0 != 0) goto L20
                goto La
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.theme.IncodeTypography.LetterSpacing.write$Self$onboard_release(com.incode.welcome_sdk.commons.theme.IncodeTypography$LetterSpacing, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        public /* synthetic */ LetterSpacing(long j2, long j3, long j4, long j5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? IncodeTypefaceTokens.INSTANCE.m8079getLetterSpacingNoneXSAIIZE() : j2, (i2 & 2) != 0 ? IncodeTypefaceTokens.INSTANCE.m8078getLetterSpacingMediumXSAIIZE() : j3, (i2 & 4) != 0 ? IncodeTypefaceTokens.INSTANCE.m8077getLetterSpacingLargeXSAIIZE() : j4, (i2 & 8) != 0 ? IncodeTypefaceTokens.INSTANCE.m8076getLetterSpacingExtraLargeXSAIIZE() : j5, null);
        }

        /* JADX INFO: renamed from: getNone-XSAIIZE, reason: not valid java name */
        public final long m8099getNoneXSAIIZE() {
            int i2 = 2 % 2;
            int i3 = f5506a + 67;
            f5509d = i3 % 128;
            if (i3 % 2 == 0) {
                return this.none;
            }
            throw null;
        }

        /* JADX INFO: renamed from: getMedium-XSAIIZE, reason: not valid java name */
        public final long m8098getMediumXSAIIZE() {
            int i2 = 2 % 2;
            int i3 = f5506a + 7;
            f5509d = i3 % 128;
            if (i3 % 2 == 0) {
                return this.medium;
            }
            throw null;
        }

        /* JADX INFO: renamed from: getLarge-XSAIIZE, reason: not valid java name */
        public final long m8097getLargeXSAIIZE() {
            int i2 = 2 % 2;
            int i3 = f5506a + 21;
            int i4 = i3 % 128;
            f5509d = i4;
            int i5 = i3 % 2;
            long j2 = this.large;
            int i6 = i4 + 71;
            f5506a = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 4 / 0;
            }
            return j2;
        }

        /* JADX INFO: renamed from: getExtraLarge-XSAIIZE, reason: not valid java name */
        public final long m8096getExtraLargeXSAIIZE() {
            int i2 = 2 % 2;
            int i3 = f5509d;
            int i4 = i3 + 97;
            f5506a = i4 % 128;
            int i5 = i4 % 2;
            long j2 = this.extraLarge;
            int i6 = i3 + 65;
            f5506a = i6 % 128;
            if (i6 % 2 != 0) {
                return j2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i2 = f5508c + 29;
            f5507b = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 44 / 0;
            }
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
                int i3 = f5509d + 15;
                f5506a = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
            if (!(obj instanceof LetterSpacing)) {
                return false;
            }
            LetterSpacing letterSpacing = (LetterSpacing) obj;
            if (!TextUnit.m6828equalsimpl0(this.none, letterSpacing.none) || !TextUnit.m6828equalsimpl0(this.medium, letterSpacing.medium)) {
                return false;
            }
            if (TextUnit.m6828equalsimpl0(this.large, letterSpacing.large)) {
                return TextUnit.m6828equalsimpl0(this.extraLarge, letterSpacing.extraLarge);
            }
            int i5 = f5509d + 95;
            f5506a = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = f5506a + 29;
            f5509d = i3 % 128;
            return (i3 % 2 != 0 ? ((((TextUnit.m6832hashCodeimpl(this.none) + 120) / TextUnit.m6832hashCodeimpl(this.medium)) * 105) % TextUnit.m6832hashCodeimpl(this.large)) - 122 : ((((TextUnit.m6832hashCodeimpl(this.none) * 31) + TextUnit.m6832hashCodeimpl(this.medium)) * 31) + TextUnit.m6832hashCodeimpl(this.large)) * 31) + TextUnit.m6832hashCodeimpl(this.extraLarge);
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f5506a + 25;
            f5509d = i3 % 128;
            int i4 = i3 % 2;
            String str = "LetterSpacing(none=" + TextUnit.m6838toStringimpl(this.none) + ", medium=" + TextUnit.m6838toStringimpl(this.medium) + ", large=" + TextUnit.m6838toStringimpl(this.large) + ", extraLarge=" + TextUnit.m6838toStringimpl(this.extraLarge) + ")";
            int i5 = f5509d + 27;
            f5506a = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        /* JADX INFO: renamed from: copy-SJ4xkqo$default, reason: not valid java name */
        public static /* synthetic */ LetterSpacing m8090copySJ4xkqo$default(LetterSpacing letterSpacing, long j2, long j3, long j4, long j5, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = f5509d + 67;
            int i5 = i4 % 128;
            f5506a = i5;
            int i6 = i4 % 2;
            if ((i2 & 1) != 0) {
                int i7 = i5 + 83;
                f5509d = i7 % 128;
                int i8 = i7 % 2;
                j2 = letterSpacing.none;
            }
            if ((i2 & 2) != 0) {
                int i9 = i5 + 105;
                f5509d = i9 % 128;
                if (i9 % 2 != 0) {
                    long j6 = letterSpacing.medium;
                    throw null;
                }
                j3 = letterSpacing.medium;
            }
            if ((i2 & 4) != 0) {
                j4 = letterSpacing.large;
            }
            if ((i2 & 8) != 0) {
                j5 = letterSpacing.extraLarge;
                int i10 = i5 + 117;
                f5509d = i10 % 128;
                int i11 = i10 % 2;
            }
            return letterSpacing.m8095copySJ4xkqo(j2, j3, j4, j5);
        }

        /* JADX INFO: renamed from: copy-SJ4xkqo, reason: not valid java name */
        public final LetterSpacing m8095copySJ4xkqo(long j2, long j3, long j4, long j5) {
            int i2 = 2 % 2;
            LetterSpacing letterSpacing = new LetterSpacing(j2, j3, j4, j5, null);
            int i3 = f5509d + 69;
            f5506a = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 56 / 0;
            }
            return letterSpacing;
        }

        /* JADX INFO: renamed from: component4-XSAIIZE, reason: not valid java name */
        public final long m8094component4XSAIIZE() {
            int i2 = 2 % 2;
            int i3 = f5506a;
            int i4 = i3 + 87;
            f5509d = i4 % 128;
            int i5 = i4 % 2;
            long j2 = this.extraLarge;
            int i6 = i3 + 125;
            f5509d = i6 % 128;
            if (i6 % 2 == 0) {
                return j2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: component3-XSAIIZE, reason: not valid java name */
        public final long m8093component3XSAIIZE() {
            int i2 = 2 % 2;
            int i3 = f5509d + 107;
            f5506a = i3 % 128;
            if (i3 % 2 != 0) {
                return this.large;
            }
            throw null;
        }

        /* JADX INFO: renamed from: component2-XSAIIZE, reason: not valid java name */
        public final long m8092component2XSAIIZE() {
            int i2 = 2 % 2;
            int i3 = f5509d;
            int i4 = i3 + 5;
            f5506a = i4 % 128;
            int i5 = i4 % 2;
            long j2 = this.medium;
            int i6 = i3 + 117;
            f5506a = i6 % 128;
            int i7 = i6 % 2;
            return j2;
        }

        /* JADX INFO: renamed from: component1-XSAIIZE, reason: not valid java name */
        public final long m8091component1XSAIIZE() {
            long j2;
            int i2 = 2 % 2;
            int i3 = f5509d;
            int i4 = i3 + 29;
            f5506a = i4 % 128;
            if (i4 % 2 == 0) {
                j2 = this.none;
                int i5 = 1 / 0;
            } else {
                j2 = this.none;
            }
            int i6 = i3 + 23;
            f5506a = i6 % 128;
            int i7 = i6 % 2;
            return j2;
        }
    }

    public IncodeTypography() {
        this((Family) null, (LetterSpacing) null, (Weight) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IncodeTypography(Family family) {
        this(family, (LetterSpacing) null, (Weight) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(family, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IncodeTypography(Family family, LetterSpacing letterSpacing) {
        this(family, letterSpacing, (Weight) null, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(family, "");
        Intrinsics.checkNotNullParameter(letterSpacing, "");
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f5492d;
            int i4 = i3 + 117;
            f5493e = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 11;
            f5493e = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof IncodeTypography)) {
            int i8 = f5492d + 103;
            f5493e = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        IncodeTypography incodeTypography = (IncodeTypography) obj;
        if (!Intrinsics.areEqual(this.family, incodeTypography.family) || !Intrinsics.areEqual(this.letterSpacing, incodeTypography.letterSpacing)) {
            return false;
        }
        if (Intrinsics.areEqual(this.fontWeight, incodeTypography.fontWeight)) {
            return true;
        }
        int i10 = f5492d + 85;
        f5493e = i10 % 128;
        return i10 % 2 != 0;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f5493e + 39;
        f5492d = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((this.family.hashCode() * 31) + this.letterSpacing.hashCode()) * 31) + this.fontWeight.hashCode();
        int i5 = f5493e + 51;
        f5492d = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f5493e + 73;
        f5492d = i3 % 128;
        if (i3 % 2 != 0) {
            return "IncodeTypography(family=" + this.family + ", letterSpacing=" + this.letterSpacing + ", fontWeight=" + this.fontWeight + ")";
        }
        String str = "IncodeTypography(family=" + this.family + ", letterSpacing=" + this.letterSpacing + ", fontWeight=" + this.fontWeight + ")";
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ IncodeTypography copy$default(IncodeTypography incodeTypography, Family family, LetterSpacing letterSpacing, Weight weight, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            family = incodeTypography.family;
        }
        if ((i2 & 2) != 0) {
            int i4 = f5492d + 125;
            f5493e = i4 % 128;
            int i5 = i4 % 2;
            letterSpacing = incodeTypography.letterSpacing;
        }
        if ((i2 & 4) != 0) {
            int i6 = f5493e;
            int i7 = i6 + 59;
            f5492d = i7 % 128;
            if (i7 % 2 == 0) {
                weight = incodeTypography.fontWeight;
                int i8 = 67 / 0;
            } else {
                weight = incodeTypography.fontWeight;
            }
            int i9 = i6 + 41;
            f5492d = i9 % 128;
            int i10 = i9 % 2;
        }
        return incodeTypography.copy(family, letterSpacing, weight);
    }

    public final IncodeTypography copy(Family family, LetterSpacing letterSpacing, Weight weight) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(family, "");
        Intrinsics.checkNotNullParameter(letterSpacing, "");
        Intrinsics.checkNotNullParameter(weight, "");
        IncodeTypography incodeTypography = new IncodeTypography(family, letterSpacing, weight);
        int i3 = f5493e + 57;
        f5492d = i3 % 128;
        int i4 = i3 % 2;
        return incodeTypography;
    }

    public final Weight component3() {
        int i2 = 2 % 2;
        int i3 = f5492d + 73;
        f5493e = i3 % 128;
        int i4 = i3 % 2;
        Weight weight = this.fontWeight;
        if (i4 != 0) {
            int i5 = 7 / 0;
        }
        return weight;
    }

    public final LetterSpacing component2() {
        int i2 = 2 % 2;
        int i3 = f5492d;
        int i4 = i3 + 41;
        f5493e = i4 % 128;
        int i5 = i4 % 2;
        LetterSpacing letterSpacing = this.letterSpacing;
        int i6 = i3 + 121;
        f5493e = i6 % 128;
        if (i6 % 2 == 0) {
            return letterSpacing;
        }
        throw null;
    }

    public final Family component1() {
        int i2 = 2 % 2;
        int i3 = f5493e;
        int i4 = i3 + 79;
        f5492d = i4 % 128;
        int i5 = i4 % 2;
        Family family = this.family;
        int i6 = i3 + 67;
        f5492d = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 71 / 0;
        }
        return family;
    }

    public static /* synthetic */ void getFamily$annotations() {
        int i2 = 2 % 2;
        int i3 = f5493e + 67;
        f5492d = i3 % 128;
        int i4 = i3 % 2;
    }
}
