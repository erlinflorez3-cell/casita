package com.incode.welcome_sdk.commons.theme;

import android.content.Context;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnit;
import com.incode.welcome_sdk.DisplayMode;
import com.incode.welcome_sdk.commons.theme.IncodeColorPalette;
import com.incode.welcome_sdk.commons.theme.IncodeTypography;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.modules.SerializersModuleBuilder;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class IncodeThemeConfig {
    public static final int $stable = 0;
    public static final c Companion = new c((byte) 0);

    /* JADX INFO: renamed from: a */
    private static int f5467a = 0;

    /* JADX INFO: renamed from: b */
    private static int f5468b = 0;

    /* JADX INFO: renamed from: c */
    private static int f5469c = 1;

    /* JADX INFO: renamed from: d */
    private static int f5470d = 1;
    private final IncodeColorPalette colorPalette;
    private final DisplayMode displayMode;
    private final IncodeTypography typography;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final class b implements GeneratedSerializer<IncodeThemeConfig> {

        /* JADX INFO: renamed from: a */
        private static int f5475a = 0;

        /* JADX INFO: renamed from: b */
        private static int f5476b = 1;

        /* JADX INFO: renamed from: c */
        private static final /* synthetic */ PluginGeneratedSerialDescriptor f5477c;

        /* JADX INFO: renamed from: d */
        private static int f5478d = 0;

        /* JADX INFO: renamed from: e */
        public static final b f5479e;

        /* JADX INFO: renamed from: h */
        private static int f5480h = 1;

        static {
            b bVar = new b();
            f5479e = bVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.incode.welcome_sdk.commons.theme.IncodeThemeConfig", bVar, 3);
            pluginGeneratedSerialDescriptor.addElement("typography", true);
            pluginGeneratedSerialDescriptor.addElement("colorPalette", true);
            pluginGeneratedSerialDescriptor.addElement("displayMode", true);
            f5477c = pluginGeneratedSerialDescriptor;
            int i2 = f5475a + 111;
            f5480h = i2 % 128;
            int i3 = i2 % 2;
        }

        private b() {
        }

        private IncodeThemeConfig b(Decoder decoder) {
            int i2;
            IncodeColorPalette incodeColorPalette;
            DisplayMode displayMode;
            IncodeTypography incodeTypography;
            int i3 = 2 % 2;
            int i4 = f5476b + 97;
            f5478d = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.checkNotNullParameter(decoder, "");
            SerialDescriptor descriptor = getDescriptor();
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
            IncodeTypography incodeTypography2 = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                int i6 = f5478d + 79;
                f5476b = i6 % 128;
                int i7 = i6 % 2;
                incodeTypography = (IncodeTypography) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, IncodeTypography.c.f5530a, null);
                incodeColorPalette = (IncodeColorPalette) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, IncodeColorPalette.d.f5449c, null);
                displayMode = (DisplayMode) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, com.incode.welcome_sdk.commons.theme.b.f5591c, null);
                i2 = 7;
            } else {
                i2 = 0;
                boolean z2 = true;
                incodeColorPalette = null;
                displayMode = null;
                while (z2) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                    if (iDecodeElementIndex == -1) {
                        z2 = false;
                    } else if (iDecodeElementIndex == 0) {
                        incodeTypography2 = (IncodeTypography) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, IncodeTypography.c.f5530a, incodeTypography2);
                        i2 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        incodeColorPalette = (IncodeColorPalette) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, IncodeColorPalette.d.f5449c, incodeColorPalette);
                        i2 |= 2;
                    } else {
                        if (iDecodeElementIndex != 2) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        displayMode = (DisplayMode) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, com.incode.welcome_sdk.commons.theme.b.f5591c, displayMode);
                        i2 |= 4;
                        int i8 = f5476b + 65;
                        f5478d = i8 % 128;
                        int i9 = i8 % 2;
                    }
                }
                incodeTypography = incodeTypography2;
            }
            compositeDecoderBeginStructure.endStructure(descriptor);
            return new IncodeThemeConfig(i2, incodeTypography, incodeColorPalette, displayMode, (SerializationConstructorMarker) null);
        }

        private void c(Encoder encoder, IncodeThemeConfig incodeThemeConfig) {
            int i2 = 2 % 2;
            int i3 = f5478d + 23;
            f5476b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(incodeThemeConfig, "");
            SerialDescriptor descriptor = getDescriptor();
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
            IncodeThemeConfig.write$Self$onboard_release(incodeThemeConfig, compositeEncoderBeginStructure, descriptor);
            compositeEncoderBeginStructure.endStructure(descriptor);
            int i5 = f5476b + 49;
            f5478d = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            int i2 = 2 % 2;
            int i3 = f5478d + 121;
            f5476b = i3 % 128;
            int i4 = i3 % 2;
            KSerializer<?>[] kSerializerArr = {IncodeTypography.c.f5530a, IncodeColorPalette.d.f5449c, BuiltinSerializersKt.getNullable(com.incode.welcome_sdk.commons.theme.b.f5591c)};
            int i5 = f5478d + 77;
            f5476b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 7 / 0;
            }
            return kSerializerArr;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public final /* synthetic */ Object deserialize(Decoder decoder) {
            int i2 = 2 % 2;
            int i3 = f5476b + 89;
            f5478d = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                b(decoder);
                obj.hashCode();
                throw null;
            }
            IncodeThemeConfig incodeThemeConfigB = b(decoder);
            int i4 = f5476b + 25;
            f5478d = i4 % 128;
            if (i4 % 2 == 0) {
                return incodeThemeConfigB;
            }
            throw null;
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            int i2 = 2 % 2;
            int i3 = f5476b + 19;
            int i4 = i3 % 128;
            f5478d = i4;
            int i5 = i3 % 2;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f5477c;
            int i6 = i4 + 43;
            f5476b = i6 % 128;
            int i7 = i6 % 2;
            return pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final /* synthetic */ void serialize(Encoder encoder, Object obj) {
            int i2 = 2 % 2;
            int i3 = f5478d + 55;
            f5476b = i3 % 128;
            int i4 = i3 % 2;
            c(encoder, (IncodeThemeConfig) obj);
            int i5 = f5476b + 23;
            f5478d = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] typeParametersSerializers() {
            int i2 = 2 % 2;
            int i3 = f5476b + 47;
            f5478d = i3 % 128;
            if (i3 % 2 != 0) {
                GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
                throw null;
            }
            KSerializer<?>[] kSerializerArrTypeParametersSerializers = GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            int i4 = f5478d + 57;
            f5476b = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerArrTypeParametersSerializers;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ IncodeThemeConfig(int i2, IncodeTypography incodeTypography, IncodeColorPalette incodeColorPalette, DisplayMode displayMode, SerializationConstructorMarker serializationConstructorMarker) {
        DisplayMode displayMode2 = displayMode;
        IncodeColorPalette incodeColorPalette2 = incodeColorPalette;
        this.typography = (i2 & 1) == 0 ? new IncodeTypography((IncodeTypography.Family) null, (IncodeTypography.LetterSpacing) null, (IncodeTypography.Weight) null, 7, (DefaultConstructorMarker) null) : incodeTypography;
        this.colorPalette = (i2 & 2) == 0 ? new IncodeColorPalette(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, Integer.MAX_VALUE, (DefaultConstructorMarker) null) : incodeColorPalette2;
        this.displayMode = (i2 & 4) == 0 ? null : displayMode2;
    }

    public IncodeThemeConfig(IncodeTypography incodeTypography, IncodeColorPalette incodeColorPalette, DisplayMode displayMode) {
        Intrinsics.checkNotNullParameter(incodeTypography, "");
        Intrinsics.checkNotNullParameter(incodeColorPalette, "");
        this.typography = incodeTypography;
        this.colorPalette = incodeColorPalette;
        this.displayMode = displayMode;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00b9  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void write$Self$onboard_release(com.incode.welcome_sdk.commons.theme.IncodeThemeConfig r68, kotlinx.serialization.encoding.CompositeEncoder r69, kotlinx.serialization.descriptors.SerialDescriptor r70) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.theme.IncodeThemeConfig.write$Self$onboard_release(com.incode.welcome_sdk.commons.theme.IncodeThemeConfig, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ IncodeThemeConfig(com.incode.welcome_sdk.commons.theme.IncodeTypography r69, com.incode.welcome_sdk.commons.theme.IncodeColorPalette r70, com.incode.welcome_sdk.DisplayMode r71, int r72, kotlin.jvm.internal.DefaultConstructorMarker r73) {
        /*
            r68 = this;
            r1 = r71
            r3 = r70
            r0 = r69
            r2 = r72 & 1
            if (r2 == 0) goto L70
            com.incode.welcome_sdk.commons.theme.IncodeTypography r0 = new com.incode.welcome_sdk.commons.theme.IncodeTypography
            r8 = 7
            r9 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
        L15:
            r2 = r72 & 2
            if (r2 == 0) goto L6f
            com.incode.welcome_sdk.commons.theme.IncodeColorPalette r3 = new com.incode.welcome_sdk.commons.theme.IncodeColorPalette
            r66 = 2147483647(0x7fffffff, float:NaN)
            r67 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r32 = 0
            r34 = 0
            r36 = 0
            r38 = 0
            r40 = 0
            r42 = 0
            r44 = 0
            r46 = 0
            r48 = 0
            r50 = 0
            r52 = 0
            r54 = 0
            r56 = 0
            r58 = 0
            r60 = 0
            r62 = 0
            r64 = 0
            r3.<init>(r4, r6, r8, r10, r12, r14, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r67)
        L61:
            r2 = r72 & 4
            if (r2 == 0) goto L6c
            r1 = 0
            r2 = r68
        L68:
            r2.<init>(r0, r3, r1)
            return
        L6c:
            r2 = r68
            goto L68
        L6f:
            goto L61
        L70:
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.theme.IncodeThemeConfig.<init>(com.incode.welcome_sdk.commons.theme.IncodeTypography, com.incode.welcome_sdk.commons.theme.IncodeColorPalette, com.incode.welcome_sdk.DisplayMode, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final IncodeTypography getTypography() {
        int i2 = 2 % 2;
        int i3 = f5468b + 77;
        f5470d = i3 % 128;
        if (i3 % 2 != 0) {
            return this.typography;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final IncodeColorPalette getColorPalette() {
        int i2 = 2 % 2;
        int i3 = f5470d;
        int i4 = i3 + 35;
        f5468b = i4 % 128;
        int i5 = i4 % 2;
        IncodeColorPalette incodeColorPalette = this.colorPalette;
        int i6 = i3 + 105;
        f5468b = i6 % 128;
        if (i6 % 2 == 0) {
            return incodeColorPalette;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final DisplayMode getDisplayMode() {
        int i2 = 2 % 2;
        int i3 = f5470d + 65;
        int i4 = i3 % 128;
        f5468b = i4;
        int i5 = i3 % 2;
        DisplayMode displayMode = this.displayMode;
        int i6 = i4 + 13;
        f5470d = i6 % 128;
        int i7 = i6 % 2;
        return displayMode;
    }

    public final String toJson(Context context) {
        int i2 = 2 % 2;
        int i3 = f5468b + 49;
        f5470d = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Json jsonC = c.c(context);
            jsonC.getSerializersModule();
            jsonC.encodeToString(Companion.serializer(), this);
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        Json jsonC2 = c.c(context);
        jsonC2.getSerializersModule();
        String strEncodeToString = jsonC2.encodeToString(Companion.serializer(), this);
        int i4 = f5468b + 17;
        f5470d = i4 % 128;
        int i5 = i4 % 2;
        return strEncodeToString;
    }

    public static final class Builder {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a */
        private static int f5471a = 1;

        /* JADX INFO: renamed from: c */
        private static int f5472c = 1;

        /* JADX INFO: renamed from: d */
        private static int f5473d = 0;

        /* JADX INFO: renamed from: e */
        private static int f5474e = 0;
        private DisplayMode displayMode;
        private IncodeTypography typography = new IncodeTypography((IncodeTypography.Family) null, (IncodeTypography.LetterSpacing) null, (IncodeTypography.Weight) null, 7, (DefaultConstructorMarker) null);
        private IncodeColorPalette colorPalette = new IncodeColorPalette(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Integer.MAX_VALUE, (DefaultConstructorMarker) null);

        public final Builder setTypography(IncodeTypography incodeTypography) {
            int i2 = 2 % 2;
            int i3 = f5472c + 105;
            f5473d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(incodeTypography, "");
            this.typography = incodeTypography;
            int i5 = f5472c + 123;
            f5473d = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final Builder setColorPalette(IncodeColorPalette incodeColorPalette) {
            int i2 = 2 % 2;
            int i3 = f5473d + 101;
            f5472c = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(incodeColorPalette, "");
                this.colorPalette = incodeColorPalette;
                throw null;
            }
            Intrinsics.checkNotNullParameter(incodeColorPalette, "");
            this.colorPalette = incodeColorPalette;
            int i4 = f5473d + 13;
            f5472c = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public final Builder setDisplayMode(DisplayMode displayMode) {
            int i2 = 2 % 2;
            int i3 = f5472c + 81;
            f5473d = i3 % 128;
            int i4 = i3 % 2;
            this.displayMode = displayMode;
            if (i4 != 0) {
                int i5 = 10 / 0;
            }
            return this;
        }

        public final IncodeThemeConfig build() {
            int i2 = 2 % 2;
            IncodeThemeConfig incodeThemeConfig = new IncodeThemeConfig(this.typography, this.colorPalette, this.displayMode);
            int i3 = f5473d + 47;
            f5472c = i3 % 128;
            int i4 = i3 % 2;
            return incodeThemeConfig;
        }

        static {
            int i2 = 1 + 109;
            f5474e = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: b */
        private static int f5481b = 0;

        /* JADX INFO: renamed from: d */
        private static int f5482d = 1;

        private c() {
        }

        public static final /* synthetic */ Json c(Context context) {
            int i2 = 2 % 2;
            int i3 = f5482d + 105;
            f5481b = i3 % 128;
            int i4 = i3 % 2;
            Json jsonA = a(context);
            if (i4 != 0) {
                int i5 = 7 / 0;
            }
            int i6 = f5481b + 111;
            f5482d = i6 % 128;
            int i7 = i6 % 2;
            return jsonA;
        }

        public final KSerializer<IncodeThemeConfig> serializer() {
            int i2 = 2 % 2;
            int i3 = f5481b + 93;
            f5482d = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                b bVar = b.f5479e;
                throw null;
            }
            b bVar2 = b.f5479e;
            int i4 = f5482d + 87;
            f5481b = i4 % 128;
            if (i4 % 2 == 0) {
                return bVar2;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.commons.theme.IncodeThemeConfig$c$c */
        static final class C0219c extends Lambda implements Function1<JsonBuilder, Unit> {

            /* JADX INFO: renamed from: d */
            private static int f5483d = 0;

            /* JADX INFO: renamed from: e */
            private static int f5484e = 1;

            /* JADX INFO: renamed from: c */
            private /* synthetic */ Context f5485c;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
                int i2 = 2 % 2;
                int i3 = f5484e + 47;
                f5483d = i3 % 128;
                int i4 = i3 % 2;
                d(jsonBuilder);
                Unit unit = Unit.INSTANCE;
                if (i4 == 0) {
                    return unit;
                }
                throw null;
            }

            private void d(JsonBuilder jsonBuilder) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(jsonBuilder, "");
                Context context = this.f5485c;
                SerializersModuleBuilder serializersModuleBuilder = new SerializersModuleBuilder();
                serializersModuleBuilder.contextual(Reflection.getOrCreateKotlinClass(Color.class), e.f5610b);
                serializersModuleBuilder.contextual(Reflection.getOrCreateKotlinClass(FontWeight.class), com.incode.welcome_sdk.commons.theme.c.f5599e);
                serializersModuleBuilder.contextual(Reflection.getOrCreateKotlinClass(TextUnit.class), m.f5753b);
                serializersModuleBuilder.contextual(Reflection.getOrCreateKotlinClass(DisplayMode.class), com.incode.welcome_sdk.commons.theme.b.f5591c);
                serializersModuleBuilder.contextual(Reflection.getOrCreateKotlinClass(IncodeTypography.Family.class), new d(new a(context)));
                jsonBuilder.setSerializersModule(serializersModuleBuilder.build());
                jsonBuilder.setEncodeDefaults(true);
                jsonBuilder.setIgnoreUnknownKeys(true);
                int i3 = f5483d + 71;
                f5484e = i3 % 128;
                if (i3 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0219c(Context context) {
                super(1);
                this.f5485c = context;
            }
        }

        private static Json a(Context context) {
            int i2 = 2 % 2;
            Object obj = null;
            Json jsonJson$default = JsonKt.Json$default(null, new C0219c(context), 1, null);
            int i3 = f5481b + 29;
            f5482d = i3 % 128;
            if (i3 % 2 != 0) {
                return jsonJson$default;
            }
            obj.hashCode();
            throw null;
        }

        @JvmStatic
        public final IncodeThemeConfig fromJson(Context context, String str) {
            int i2 = 2 % 2;
            int i3 = f5481b + 29;
            f5482d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Json jsonA = a(context);
            jsonA.getSerializersModule();
            IncodeThemeConfig incodeThemeConfig = (IncodeThemeConfig) jsonA.decodeFromString(IncodeThemeConfig.Companion.serializer(), str);
            int i5 = f5482d + 69;
            f5481b = i5 % 128;
            int i6 = i5 % 2;
            return incodeThemeConfig;
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    static {
        int i2 = f5467a + 19;
        f5469c = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @JvmStatic
    public static final IncodeThemeConfig fromJson(Context context, String str) {
        int i2 = 2 % 2;
        int i3 = f5470d + 89;
        f5468b = i3 % 128;
        int i4 = i3 % 2;
        IncodeThemeConfig incodeThemeConfigFromJson = Companion.fromJson(context, str);
        int i5 = f5470d + 23;
        f5468b = i5 % 128;
        if (i5 % 2 == 0) {
            return incodeThemeConfigFromJson;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public IncodeThemeConfig() {
        this((IncodeTypography) null, (IncodeColorPalette) null, (DisplayMode) null, 7, (DefaultConstructorMarker) null);
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f5470d + 73;
        f5468b = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncodeThemeConfig)) {
            return false;
        }
        IncodeThemeConfig incodeThemeConfig = (IncodeThemeConfig) obj;
        if (!Intrinsics.areEqual(this.typography, incodeThemeConfig.typography)) {
            int i4 = f5468b + 11;
            f5470d = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.colorPalette, incodeThemeConfig.colorPalette)) {
            return false;
        }
        if (this.displayMode == incodeThemeConfig.displayMode) {
            return true;
        }
        int i6 = f5470d + 113;
        f5468b = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0023 A[PHI: r2
  0x0023: PHI (r2v4 int) = (r2v0 int), (r2v5 int) binds: [B:23:0x0042, B:18:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045 A[PHI: r2
  0x0045: PHI (r2v1 int) = (r2v0 int), (r2v5 int) binds: [B:23:0x0042, B:18:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int hashCode() {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.commons.theme.IncodeThemeConfig.f5470d
            int r1 = r0 + 91
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.theme.IncodeThemeConfig.f5468b = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L2f
            com.incode.welcome_sdk.commons.theme.IncodeTypography r0 = r4.typography
            int r0 = r0.hashCode()
            int r1 = r0 >> 125
            com.incode.welcome_sdk.commons.theme.IncodeColorPalette r0 = r4.colorPalette
            int r0 = r0.hashCode()
            int r1 = r1 >>> r0
            int r2 = r1 >> 81
            com.incode.welcome_sdk.DisplayMode r0 = r4.displayMode
            if (r0 != 0) goto L45
        L23:
            int r0 = com.incode.welcome_sdk.commons.theme.IncodeThemeConfig.f5468b
            int r1 = r0 + 39
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.theme.IncodeThemeConfig.f5470d = r0
            int r1 = r1 % r3
            r0 = 0
        L2d:
            int r2 = r2 + r0
            return r2
        L2f:
            com.incode.welcome_sdk.commons.theme.IncodeTypography r0 = r4.typography
            int r0 = r0.hashCode()
            int r1 = r0 * 31
            com.incode.welcome_sdk.commons.theme.IncodeColorPalette r0 = r4.colorPalette
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r2 = r1 * 31
            com.incode.welcome_sdk.DisplayMode r0 = r4.displayMode
            if (r0 != 0) goto L45
            goto L23
        L45:
            com.incode.welcome_sdk.DisplayMode r0 = r4.displayMode
            int r0 = r0.hashCode()
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.theme.IncodeThemeConfig.hashCode():int");
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f5468b + 53;
        f5470d = i3 % 128;
        int i4 = i3 % 2;
        String str = "IncodeThemeConfig(typography=" + this.typography + ", colorPalette=" + this.colorPalette + ", displayMode=" + this.displayMode + ")";
        int i5 = f5468b + 97;
        f5470d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static /* synthetic */ IncodeThemeConfig copy$default(IncodeThemeConfig incodeThemeConfig, IncodeTypography incodeTypography, IncodeColorPalette incodeColorPalette, DisplayMode displayMode, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = f5468b + 73;
        int i5 = i4 % 128;
        f5470d = i5;
        if (i4 % 2 != 0 ? (i2 & 1) != 0 : (i2 & 1) != 0) {
            incodeTypography = incodeThemeConfig.typography;
        }
        if ((i2 & 2) != 0) {
            int i6 = i5 + 43;
            f5468b = i6 % 128;
            int i7 = i6 % 2;
            incodeColorPalette = incodeThemeConfig.colorPalette;
            if (i7 != 0) {
                int i8 = 15 / 0;
            }
        }
        if ((i2 & 4) != 0) {
            displayMode = incodeThemeConfig.displayMode;
        }
        return incodeThemeConfig.copy(incodeTypography, incodeColorPalette, displayMode);
    }

    public final IncodeThemeConfig copy(IncodeTypography incodeTypography, IncodeColorPalette incodeColorPalette, DisplayMode displayMode) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(incodeTypography, "");
        Intrinsics.checkNotNullParameter(incodeColorPalette, "");
        IncodeThemeConfig incodeThemeConfig = new IncodeThemeConfig(incodeTypography, incodeColorPalette, displayMode);
        int i3 = f5470d + 33;
        f5468b = i3 % 128;
        int i4 = i3 % 2;
        return incodeThemeConfig;
    }

    public final DisplayMode component3() {
        int i2 = 2 % 2;
        int i3 = f5468b + 51;
        int i4 = i3 % 128;
        f5470d = i4;
        int i5 = i3 % 2;
        DisplayMode displayMode = this.displayMode;
        int i6 = i4 + 45;
        f5468b = i6 % 128;
        int i7 = i6 % 2;
        return displayMode;
    }

    public final IncodeColorPalette component2() {
        IncodeColorPalette incodeColorPalette;
        int i2 = 2 % 2;
        int i3 = f5470d;
        int i4 = i3 + 15;
        f5468b = i4 % 128;
        if (i4 % 2 != 0) {
            incodeColorPalette = this.colorPalette;
            int i5 = 49 / 0;
        } else {
            incodeColorPalette = this.colorPalette;
        }
        int i6 = i3 + 59;
        f5468b = i6 % 128;
        int i7 = i6 % 2;
        return incodeColorPalette;
    }

    public final IncodeTypography component1() {
        int i2 = 2 % 2;
        int i3 = f5470d;
        int i4 = i3 + 33;
        f5468b = i4 % 128;
        int i5 = i4 % 2;
        IncodeTypography incodeTypography = this.typography;
        int i6 = i3 + 43;
        f5468b = i6 % 128;
        int i7 = i6 % 2;
        return incodeTypography;
    }
}
