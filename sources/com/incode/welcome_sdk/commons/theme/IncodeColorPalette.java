package com.incode.welcome_sdk.commons.theme;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class IncodeColorPalette {
    public static final int $stable = 0;
    public static final e Companion = new e((byte) 0);

    /* JADX INFO: renamed from: a */
    private static int f5443a = 1;

    /* JADX INFO: renamed from: b */
    private static int f5444b = 0;

    /* JADX INFO: renamed from: c */
    private static int f5445c = 1;

    /* JADX INFO: renamed from: e */
    private static int f5446e = 0;
    private final long black;
    private final long brand200;
    private final long brand300;
    private final long brand400;
    private final long brand50;
    private final long brand500;
    private final long brand600;
    private final long brand900;
    private final long brandSecondary50;
    private final long brandSecondary500;
    private final long gray0;
    private final long gray100;
    private final long gray200;
    private final long gray300;
    private final long gray50;
    private final long gray500;
    private final long gray700;
    private final long gray800;
    private final long gray900;
    private final long negative50;
    private final long negative500;
    private final long negative600;
    private final long negative950;
    private final long neutral;
    private final long positive50;
    private final long positive600;
    private final long positive800;
    private final long warning400;
    private final long warning50;
    private final long warning500;
    private final long warning950;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final class d implements GeneratedSerializer<IncodeColorPalette> {

        /* JADX INFO: renamed from: a */
        private static int f5447a = 1;

        /* JADX INFO: renamed from: b */
        private static int f5448b = 0;

        /* JADX INFO: renamed from: c */
        public static final d f5449c;

        /* JADX INFO: renamed from: d */
        private static int f5450d = 0;

        /* JADX INFO: renamed from: e */
        private static final /* synthetic */ PluginGeneratedSerialDescriptor f5451e;

        /* JADX INFO: renamed from: h */
        private static int f5452h = 1;

        static {
            d dVar = new d();
            f5449c = dVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.incode.welcome_sdk.commons.theme.IncodeColorPalette", dVar, 31);
            pluginGeneratedSerialDescriptor.addElement("neutral", true);
            pluginGeneratedSerialDescriptor.addElement("black", true);
            pluginGeneratedSerialDescriptor.addElement("brand50", true);
            pluginGeneratedSerialDescriptor.addElement("brand200", true);
            pluginGeneratedSerialDescriptor.addElement("brand300", true);
            pluginGeneratedSerialDescriptor.addElement("brand400", true);
            pluginGeneratedSerialDescriptor.addElement("brand500", true);
            pluginGeneratedSerialDescriptor.addElement("brand600", true);
            pluginGeneratedSerialDescriptor.addElement("brand900", true);
            pluginGeneratedSerialDescriptor.addElement("gray0", true);
            pluginGeneratedSerialDescriptor.addElement("gray50", true);
            pluginGeneratedSerialDescriptor.addElement("gray100", true);
            pluginGeneratedSerialDescriptor.addElement("gray200", true);
            pluginGeneratedSerialDescriptor.addElement("gray300", true);
            pluginGeneratedSerialDescriptor.addElement("gray500", true);
            pluginGeneratedSerialDescriptor.addElement("gray700", true);
            pluginGeneratedSerialDescriptor.addElement("gray800", true);
            pluginGeneratedSerialDescriptor.addElement("gray900", true);
            pluginGeneratedSerialDescriptor.addElement("brandSecondary50", true);
            pluginGeneratedSerialDescriptor.addElement("brandSecondary500", true);
            pluginGeneratedSerialDescriptor.addElement("positive50", true);
            pluginGeneratedSerialDescriptor.addElement("positive600", true);
            pluginGeneratedSerialDescriptor.addElement("positive800", true);
            pluginGeneratedSerialDescriptor.addElement("warning50", true);
            pluginGeneratedSerialDescriptor.addElement("warning400", true);
            pluginGeneratedSerialDescriptor.addElement("warning500", true);
            pluginGeneratedSerialDescriptor.addElement("warning950", true);
            pluginGeneratedSerialDescriptor.addElement("negative50", true);
            pluginGeneratedSerialDescriptor.addElement("negative500", true);
            pluginGeneratedSerialDescriptor.addElement("negative600", true);
            pluginGeneratedSerialDescriptor.addElement("negative950", true);
            f5451e = pluginGeneratedSerialDescriptor;
            int i2 = f5450d + 73;
            f5452h = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 23 / 0;
            }
        }

        private d() {
        }

        private IncodeColorPalette a(Decoder decoder) {
            Color color;
            Color color2;
            Color color3;
            Color color4;
            Color color5;
            Color color6;
            Color color7;
            Color color8;
            Color color9;
            Color color10;
            Color color11;
            Color color12;
            Color color13;
            Color color14;
            Color color15;
            Color color16;
            Color color17;
            Color color18;
            Color color19;
            Color color20;
            Color color21;
            Color color22;
            Color color23;
            Color color24;
            Color color25;
            Color color26;
            Color color27;
            Color color28;
            Color color29;
            Color color30;
            Color color31;
            int i2;
            int i3;
            int i4 = 2 % 2;
            Intrinsics.checkNotNullParameter(decoder, "");
            SerialDescriptor descriptor = getDescriptor();
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
            int i5 = 0;
            boolean z2 = true;
            Color color32 = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                int i6 = f5448b + 77;
                f5447a = i6 % 128;
                int i7 = i6 % 2;
                color26 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, com.incode.welcome_sdk.commons.theme.e.f5610b, null);
                color27 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, com.incode.welcome_sdk.commons.theme.e.f5610b, null);
                color28 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 2, com.incode.welcome_sdk.commons.theme.e.f5610b, null);
                color29 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 3, com.incode.welcome_sdk.commons.theme.e.f5610b, null);
                color3 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 4, com.incode.welcome_sdk.commons.theme.e.f5610b, null);
                color5 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 5, com.incode.welcome_sdk.commons.theme.e.f5610b, null);
                color2 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 6, com.incode.welcome_sdk.commons.theme.e.f5610b, null);
                color11 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 7, com.incode.welcome_sdk.commons.theme.e.f5610b, null);
                color10 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 8, com.incode.welcome_sdk.commons.theme.e.f5610b, null);
                color4 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 9, com.incode.welcome_sdk.commons.theme.e.f5610b, null);
                color9 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 10, com.incode.welcome_sdk.commons.theme.e.f5610b, null);
                color8 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 11, com.incode.welcome_sdk.commons.theme.e.f5610b, null);
                color12 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 12, com.incode.welcome_sdk.commons.theme.e.f5610b, null);
                color13 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 13, com.incode.welcome_sdk.commons.theme.e.f5610b, null);
                color14 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 14, com.incode.welcome_sdk.commons.theme.e.f5610b, null);
                color15 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 15, com.incode.welcome_sdk.commons.theme.e.f5610b, null);
                color16 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 16, com.incode.welcome_sdk.commons.theme.e.f5610b, null);
                color17 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 17, com.incode.welcome_sdk.commons.theme.e.f5610b, null);
                color18 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 18, com.incode.welcome_sdk.commons.theme.e.f5610b, null);
                color19 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 19, com.incode.welcome_sdk.commons.theme.e.f5610b, null);
                color20 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 20, com.incode.welcome_sdk.commons.theme.e.f5610b, null);
                color21 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 21, com.incode.welcome_sdk.commons.theme.e.f5610b, null);
                color22 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 22, com.incode.welcome_sdk.commons.theme.e.f5610b, null);
                color23 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 23, com.incode.welcome_sdk.commons.theme.e.f5610b, null);
                color24 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 24, com.incode.welcome_sdk.commons.theme.e.f5610b, null);
                color25 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 25, com.incode.welcome_sdk.commons.theme.e.f5610b, null);
                color31 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 26, com.incode.welcome_sdk.commons.theme.e.f5610b, null);
                color = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 27, com.incode.welcome_sdk.commons.theme.e.f5610b, null);
                color7 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 28, com.incode.welcome_sdk.commons.theme.e.f5610b, null);
                color30 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 29, com.incode.welcome_sdk.commons.theme.e.f5610b, null);
                color6 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 30, com.incode.welcome_sdk.commons.theme.e.f5610b, null);
                i5 = Integer.MAX_VALUE;
            } else {
                color = null;
                color2 = null;
                color3 = null;
                color4 = null;
                color5 = null;
                color6 = null;
                color7 = null;
                color8 = null;
                color9 = null;
                color10 = null;
                color11 = null;
                color12 = null;
                color13 = null;
                color14 = null;
                color15 = null;
                color16 = null;
                color17 = null;
                color18 = null;
                color19 = null;
                color20 = null;
                color21 = null;
                color22 = null;
                color23 = null;
                color24 = null;
                color25 = null;
                color26 = null;
                color27 = null;
                color28 = null;
                color29 = null;
                color30 = null;
                while (z2) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                    switch (iDecodeElementIndex) {
                        case -1:
                            z2 = false;
                            Unit unit = Unit.INSTANCE;
                            break;
                        case 0:
                            color26 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, com.incode.welcome_sdk.commons.theme.e.f5610b, color26);
                            i5 |= 1;
                            Unit unit2 = Unit.INSTANCE;
                            break;
                        case 1:
                            color27 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, com.incode.welcome_sdk.commons.theme.e.f5610b, color27);
                            i5 |= 2;
                            Unit unit3 = Unit.INSTANCE;
                            break;
                        case 2:
                            color28 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 2, com.incode.welcome_sdk.commons.theme.e.f5610b, color28);
                            i5 |= 4;
                            Unit unit4 = Unit.INSTANCE;
                            break;
                        case 3:
                            color29 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 3, com.incode.welcome_sdk.commons.theme.e.f5610b, color29);
                            i5 |= 8;
                            Unit unit5 = Unit.INSTANCE;
                            break;
                        case 4:
                            color3 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 4, com.incode.welcome_sdk.commons.theme.e.f5610b, color3);
                            i5 |= 16;
                            Unit unit6 = Unit.INSTANCE;
                            break;
                        case 5:
                            color5 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 5, com.incode.welcome_sdk.commons.theme.e.f5610b, color5);
                            i5 |= 32;
                            Unit unit7 = Unit.INSTANCE;
                            break;
                        case 6:
                            color2 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 6, com.incode.welcome_sdk.commons.theme.e.f5610b, color2);
                            i5 |= 64;
                            Unit unit8 = Unit.INSTANCE;
                            break;
                        case 7:
                            color11 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 7, com.incode.welcome_sdk.commons.theme.e.f5610b, color11);
                            i5 |= 128;
                            Unit unit9 = Unit.INSTANCE;
                            break;
                        case 8:
                            color10 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 8, com.incode.welcome_sdk.commons.theme.e.f5610b, color10);
                            i5 |= 256;
                            Unit unit92 = Unit.INSTANCE;
                            break;
                        case 9:
                            color4 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 9, com.incode.welcome_sdk.commons.theme.e.f5610b, color4);
                            i5 |= 512;
                            Unit unit922 = Unit.INSTANCE;
                            break;
                        case 10:
                            color9 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 10, com.incode.welcome_sdk.commons.theme.e.f5610b, color9);
                            i5 |= 1024;
                            Unit unit9222 = Unit.INSTANCE;
                            break;
                        case 11:
                            color8 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 11, com.incode.welcome_sdk.commons.theme.e.f5610b, color8);
                            i5 |= 2048;
                            Unit unit92222 = Unit.INSTANCE;
                            break;
                        case 12:
                            color12 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 12, com.incode.welcome_sdk.commons.theme.e.f5610b, color12);
                            i5 |= 4096;
                            Unit unit10 = Unit.INSTANCE;
                            break;
                        case 13:
                            color13 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 13, com.incode.welcome_sdk.commons.theme.e.f5610b, color13);
                            i5 |= 8192;
                            Unit unit11 = Unit.INSTANCE;
                            break;
                        case 14:
                            color14 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 14, com.incode.welcome_sdk.commons.theme.e.f5610b, color14);
                            i5 |= 16384;
                            Unit unit12 = Unit.INSTANCE;
                            break;
                        case 15:
                            color15 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 15, com.incode.welcome_sdk.commons.theme.e.f5610b, color15);
                            i5 |= 32768;
                            Unit unit13 = Unit.INSTANCE;
                            break;
                        case 16:
                            color16 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 16, com.incode.welcome_sdk.commons.theme.e.f5610b, color16);
                            i5 |= 65536;
                            Unit unit14 = Unit.INSTANCE;
                            break;
                        case 17:
                            color17 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 17, com.incode.welcome_sdk.commons.theme.e.f5610b, color17);
                            i5 |= 131072;
                            Unit unit15 = Unit.INSTANCE;
                            break;
                        case 18:
                            color18 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 18, com.incode.welcome_sdk.commons.theme.e.f5610b, color18);
                            i5 |= 262144;
                            Unit unit16 = Unit.INSTANCE;
                            break;
                        case 19:
                            color19 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 19, com.incode.welcome_sdk.commons.theme.e.f5610b, color19);
                            i5 |= 524288;
                            Unit unit17 = Unit.INSTANCE;
                            break;
                        case 20:
                            color20 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 20, com.incode.welcome_sdk.commons.theme.e.f5610b, color20);
                            i3 = 1048576;
                            i5 |= i3;
                            Unit unit18 = Unit.INSTANCE;
                            break;
                        case 21:
                            color21 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 21, com.incode.welcome_sdk.commons.theme.e.f5610b, color21);
                            i3 = 2097152;
                            i5 |= i3;
                            Unit unit182 = Unit.INSTANCE;
                            break;
                        case 22:
                            color22 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 22, com.incode.welcome_sdk.commons.theme.e.f5610b, color22);
                            i3 = 4194304;
                            i5 |= i3;
                            Unit unit1822 = Unit.INSTANCE;
                            break;
                        case 23:
                            color23 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 23, com.incode.welcome_sdk.commons.theme.e.f5610b, color23);
                            i3 = 8388608;
                            i5 |= i3;
                            Unit unit18222 = Unit.INSTANCE;
                            break;
                        case 24:
                            color24 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 24, com.incode.welcome_sdk.commons.theme.e.f5610b, color24);
                            i3 = 16777216;
                            i5 |= i3;
                            Unit unit182222 = Unit.INSTANCE;
                            break;
                        case 25:
                            color25 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 25, com.incode.welcome_sdk.commons.theme.e.f5610b, color25);
                            i3 = 33554432;
                            i5 |= i3;
                            Unit unit1822222 = Unit.INSTANCE;
                            break;
                        case 26:
                            color32 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 26, com.incode.welcome_sdk.commons.theme.e.f5610b, color32);
                            i5 |= AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            Unit unit19 = Unit.INSTANCE;
                            int i8 = f5448b + 87;
                            f5447a = i8 % 128;
                            int i9 = i8 % 2;
                            break;
                        case 27:
                            color = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 27, com.incode.welcome_sdk.commons.theme.e.f5610b, color);
                            i2 = 134217728;
                            i5 |= i2;
                            Unit unit20 = Unit.INSTANCE;
                            break;
                        case 28:
                            color7 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 28, com.incode.welcome_sdk.commons.theme.e.f5610b, color7);
                            i2 = 268435456;
                            i5 |= i2;
                            Unit unit202 = Unit.INSTANCE;
                            break;
                        case 29:
                            color30 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 29, com.incode.welcome_sdk.commons.theme.e.f5610b, color30);
                            i2 = 536870912;
                            i5 |= i2;
                            Unit unit2022 = Unit.INSTANCE;
                            break;
                        case 30:
                            color6 = (Color) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 30, com.incode.welcome_sdk.commons.theme.e.f5610b, color6);
                            i2 = 1073741824;
                            i5 |= i2;
                            Unit unit20222 = Unit.INSTANCE;
                            break;
                        default:
                            throw new UnknownFieldException(iDecodeElementIndex);
                    }
                }
                color31 = color32;
            }
            compositeDecoderBeginStructure.endStructure(descriptor);
            return new IncodeColorPalette(i5, color26, color27, color28, color29, color3, color5, color2, color11, color10, color4, color9, color8, color12, color13, color14, color15, color16, color17, color18, color19, color20, color21, color22, color23, color24, color25, color31, color, color7, color30, color6, null, null);
        }

        private void c(Encoder encoder, IncodeColorPalette incodeColorPalette) {
            int i2 = 2 % 2;
            int i3 = f5448b + 111;
            f5447a = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(encoder, "");
                Intrinsics.checkNotNullParameter(incodeColorPalette, "");
                SerialDescriptor descriptor = getDescriptor();
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
                IncodeColorPalette.write$Self$onboard_release(incodeColorPalette, compositeEncoderBeginStructure, descriptor);
                compositeEncoderBeginStructure.endStructure(descriptor);
                return;
            }
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(incodeColorPalette, "");
            SerialDescriptor descriptor2 = getDescriptor();
            CompositeEncoder compositeEncoderBeginStructure2 = encoder.beginStructure(descriptor2);
            IncodeColorPalette.write$Self$onboard_release(incodeColorPalette, compositeEncoderBeginStructure2, descriptor2);
            compositeEncoderBeginStructure2.endStructure(descriptor2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            int i2 = 2 % 2;
            int i3 = f5447a + 79;
            f5448b = i3 % 128;
            int i4 = i3 % 2;
            KSerializer<?>[] kSerializerArr = {com.incode.welcome_sdk.commons.theme.e.f5610b, com.incode.welcome_sdk.commons.theme.e.f5610b, com.incode.welcome_sdk.commons.theme.e.f5610b, com.incode.welcome_sdk.commons.theme.e.f5610b, com.incode.welcome_sdk.commons.theme.e.f5610b, com.incode.welcome_sdk.commons.theme.e.f5610b, com.incode.welcome_sdk.commons.theme.e.f5610b, com.incode.welcome_sdk.commons.theme.e.f5610b, com.incode.welcome_sdk.commons.theme.e.f5610b, com.incode.welcome_sdk.commons.theme.e.f5610b, com.incode.welcome_sdk.commons.theme.e.f5610b, com.incode.welcome_sdk.commons.theme.e.f5610b, com.incode.welcome_sdk.commons.theme.e.f5610b, com.incode.welcome_sdk.commons.theme.e.f5610b, com.incode.welcome_sdk.commons.theme.e.f5610b, com.incode.welcome_sdk.commons.theme.e.f5610b, com.incode.welcome_sdk.commons.theme.e.f5610b, com.incode.welcome_sdk.commons.theme.e.f5610b, com.incode.welcome_sdk.commons.theme.e.f5610b, com.incode.welcome_sdk.commons.theme.e.f5610b, com.incode.welcome_sdk.commons.theme.e.f5610b, com.incode.welcome_sdk.commons.theme.e.f5610b, com.incode.welcome_sdk.commons.theme.e.f5610b, com.incode.welcome_sdk.commons.theme.e.f5610b, com.incode.welcome_sdk.commons.theme.e.f5610b, com.incode.welcome_sdk.commons.theme.e.f5610b, com.incode.welcome_sdk.commons.theme.e.f5610b, com.incode.welcome_sdk.commons.theme.e.f5610b, com.incode.welcome_sdk.commons.theme.e.f5610b, com.incode.welcome_sdk.commons.theme.e.f5610b, com.incode.welcome_sdk.commons.theme.e.f5610b};
            int i5 = f5448b + 69;
            f5447a = i5 % 128;
            int i6 = i5 % 2;
            return kSerializerArr;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public final /* synthetic */ Object deserialize(Decoder decoder) {
            int i2 = 2 % 2;
            int i3 = f5447a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f5448b = i3 % 128;
            if (i3 % 2 == 0) {
                return a(decoder);
            }
            a(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            int i2 = 2 % 2;
            int i3 = f5447a + 69;
            int i4 = i3 % 128;
            f5448b = i4;
            int i5 = i3 % 2;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f5451e;
            int i6 = i4 + 123;
            f5447a = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 20 / 0;
            }
            return pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final /* synthetic */ void serialize(Encoder encoder, Object obj) {
            int i2 = 2 % 2;
            int i3 = f5448b + 13;
            f5447a = i3 % 128;
            int i4 = i3 % 2;
            c(encoder, (IncodeColorPalette) obj);
            int i5 = f5447a + 91;
            f5448b = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] typeParametersSerializers() {
            int i2 = 2 % 2;
            int i3 = f5447a + 101;
            f5448b = i3 % 128;
            int i4 = i3 % 2;
            KSerializer<?>[] kSerializerArrTypeParametersSerializers = GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            int i5 = f5448b + 105;
            f5447a = i5 % 128;
            int i6 = i5 % 2;
            return kSerializerArrTypeParametersSerializers;
        }
    }

    private IncodeColorPalette(int i2, Color color, Color color2, Color color3, Color color4, Color color5, Color color6, Color color7, Color color8, Color color9, Color color10, Color color11, Color color12, Color color13, Color color14, Color color15, Color color16, Color color17, Color color18, Color color19, Color color20, Color color21, Color color22, Color color23, Color color24, Color color25, Color color26, Color color27, Color color28, Color color29, Color color30, Color color31, SerializationConstructorMarker serializationConstructorMarker) {
        this.neutral = (i2 & 1) == 0 ? ColorKt.Color(4294967295L) : color.m4188unboximpl();
        this.black = (i2 & 2) == 0 ? ColorKt.Color(4278190080L) : color2.m4188unboximpl();
        this.brand50 = (i2 & 4) == 0 ? ColorKt.Color(4293259519L) : color3.m4188unboximpl();
        this.brand200 = (i2 & 8) == 0 ? ColorKt.Color(4288267263L) : color4.m4188unboximpl();
        this.brand300 = (i2 & 16) == 0 ? ColorKt.Color(4284917503L) : color5.m4188unboximpl();
        this.brand400 = (i2 & 32) == 0 ? ColorKt.Color(4281567487L) : color6.m4188unboximpl();
        this.brand500 = (i2 & 64) == 0 ? ColorKt.Color(4278217471L) : color7.m4188unboximpl();
        this.brand600 = (i2 & 128) == 0 ? ColorKt.Color(4278212044L) : color8.m4188unboximpl();
        this.brand900 = (i2 & 256) == 0 ? ColorKt.Color(4280362811L) : color9.m4188unboximpl();
        this.gray0 = (i2 & 512) == 0 ? ColorKt.Color(4294967295L) : color10.m4188unboximpl();
        this.gray50 = (i2 & 1024) == 0 ? ColorKt.Color(4294769917L) : color11.m4188unboximpl();
        this.gray100 = (i2 & 2048) == 0 ? ColorKt.Color(4293651695L) : color12.m4188unboximpl();
        this.gray200 = (i2 & 4096) == 0 ? ColorKt.Color(4291217618L) : color13.m4188unboximpl();
        this.gray300 = (i2 & 8192) == 0 ? ColorKt.Color(4288915640L) : color14.m4188unboximpl();
        this.gray500 = (i2 & 16384) == 0 ? ColorKt.Color(4284507772L) : color15.m4188unboximpl();
        this.gray700 = (32768 & i2) == 0 ? ColorKt.Color(4282007115L) : color16.m4188unboximpl();
        this.gray800 = (65536 & i2) == 0 ? ColorKt.Color(4280690737L) : color17.m4188unboximpl();
        this.gray900 = (131072 & i2) == 0 ? ColorKt.Color(4279506202L) : color18.m4188unboximpl();
        this.brandSecondary50 = (262144 & i2) == 0 ? ColorKt.Color(4294107902L) : color19.m4188unboximpl();
        this.brandSecondary500 = (524288 & i2) == 0 ? ColorKt.Color(4286712529L) : color20.m4188unboximpl();
        this.positive50 = (1048576 & i2) == 0 ? ColorKt.Color(4293196784L) : color21.m4188unboximpl();
        this.positive600 = (2097152 & i2) == 0 ? ColorKt.Color(4279803744L) : color22.m4188unboximpl();
        this.positive800 = (4194304 & i2) == 0 ? ColorKt.Color(4278997040L) : color23.m4188unboximpl();
        this.warning50 = (8388608 & i2) == 0 ? ColorKt.Color(4294965227L) : color24.m4188unboximpl();
        this.warning400 = (16777216 & i2) == 0 ? ColorKt.Color(4294948423L) : color25.m4188unboximpl();
        this.warning500 = (33554432 & i2) == 0 ? ColorKt.Color(4294940928L) : color26.m4188unboximpl();
        this.warning950 = (67108864 & i2) == 0 ? ColorKt.Color(4283576576L) : color27.m4188unboximpl();
        this.negative50 = (134217728 & i2) == 0 ? ColorKt.Color(4294963440L) : color28.m4188unboximpl();
        this.negative500 = (268435456 & i2) == 0 ? ColorKt.Color(4294924895L) : color29.m4188unboximpl();
        this.negative600 = (536870912 & i2) == 0 ? ColorKt.Color(4293333265L) : color30.m4188unboximpl();
        this.negative950 = (i2 & 1073741824) == 0 ? ColorKt.Color(4280549377L) : color31.m4188unboximpl();
    }

    private IncodeColorPalette(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32) {
        this.neutral = j2;
        this.black = j3;
        this.brand50 = j4;
        this.brand200 = j5;
        this.brand300 = j6;
        this.brand400 = j7;
        this.brand500 = j8;
        this.brand600 = j9;
        this.brand900 = j10;
        this.gray0 = j11;
        this.gray50 = j12;
        this.gray100 = j13;
        this.gray200 = j14;
        this.gray300 = j15;
        this.gray500 = j16;
        this.gray700 = j17;
        this.gray800 = j18;
        this.gray900 = j19;
        this.brandSecondary50 = j20;
        this.brandSecondary500 = j21;
        this.positive50 = j22;
        this.positive600 = j23;
        this.positive800 = j24;
        this.warning50 = j25;
        this.warning400 = j26;
        this.warning500 = j27;
        this.warning950 = j28;
        this.negative50 = j29;
        this.negative500 = j30;
        this.negative600 = j31;
        this.negative950 = j32;
    }

    /* JADX WARN: Removed duplicated region for block: B:214:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0450  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void write$Self$onboard_release(com.incode.welcome_sdk.commons.theme.IncodeColorPalette r10, kotlinx.serialization.encoding.CompositeEncoder r11, kotlinx.serialization.descriptors.SerialDescriptor r12) {
        /*
            Method dump skipped, instruction units count: 1342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.theme.IncodeColorPalette.write$Self$onboard_release(com.incode.welcome_sdk.commons.theme.IncodeColorPalette, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public /* synthetic */ IncodeColorPalette(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? ColorKt.Color(4294967295L) : j2, (i2 & 2) != 0 ? ColorKt.Color(4278190080L) : j3, (i2 & 4) != 0 ? ColorKt.Color(4293259519L) : j4, (i2 & 8) != 0 ? ColorKt.Color(4288267263L) : j5, (i2 & 16) != 0 ? ColorKt.Color(4284917503L) : j6, (i2 & 32) != 0 ? ColorKt.Color(4281567487L) : j7, (i2 & 64) != 0 ? ColorKt.Color(4278217471L) : j8, (i2 & 128) != 0 ? ColorKt.Color(4278212044L) : j9, (i2 & 256) != 0 ? ColorKt.Color(4280362811L) : j10, (i2 & 512) != 0 ? ColorKt.Color(4294967295L) : j11, (i2 & 1024) != 0 ? ColorKt.Color(4294769917L) : j12, (i2 & 2048) != 0 ? ColorKt.Color(4293651695L) : j13, (i2 & 4096) != 0 ? ColorKt.Color(4291217618L) : j14, (i2 & 8192) != 0 ? ColorKt.Color(4288915640L) : j15, (i2 & 16384) != 0 ? ColorKt.Color(4284507772L) : j16, (32768 & i2) != 0 ? ColorKt.Color(4282007115L) : j17, (65536 & i2) != 0 ? ColorKt.Color(4280690737L) : j18, (131072 & i2) != 0 ? ColorKt.Color(4279506202L) : j19, (262144 & i2) != 0 ? ColorKt.Color(4294107902L) : j20, (524288 & i2) != 0 ? ColorKt.Color(4286712529L) : j21, (1048576 & i2) != 0 ? ColorKt.Color(4293196784L) : j22, (2097152 & i2) != 0 ? ColorKt.Color(4279803744L) : j23, (4194304 & i2) != 0 ? ColorKt.Color(4278997040L) : j24, (8388608 & i2) != 0 ? ColorKt.Color(4294965227L) : j25, (16777216 & i2) != 0 ? ColorKt.Color(4294948423L) : j26, (33554432 & i2) != 0 ? ColorKt.Color(4294940928L) : j27, (67108864 & i2) != 0 ? ColorKt.Color(4283576576L) : j28, (134217728 & i2) != 0 ? ColorKt.Color(4294963440L) : j29, (268435456 & i2) != 0 ? ColorKt.Color(4294924895L) : j30, (536870912 & i2) != 0 ? ColorKt.Color(4293333265L) : j31, (i2 & 1073741824) != 0 ? ColorKt.Color(4280549377L) : j32, null);
    }

    /* JADX INFO: renamed from: getNeutral-0d7_KjU */
    public final long m7970getNeutral0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5443a + 27;
        f5444b = i3 % 128;
        if (i3 % 2 == 0) {
            return this.neutral;
        }
        int i4 = 90 / 0;
        return this.neutral;
    }

    /* JADX INFO: renamed from: getBlack-0d7_KjU */
    public final long m7947getBlack0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5444b + 125;
        int i4 = i3 % 128;
        f5443a = i4;
        int i5 = i3 % 2;
        long j2 = this.black;
        int i6 = i4 + 75;
        f5444b = i6 % 128;
        if (i6 % 2 == 0) {
            return j2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: getBrand50-0d7_KjU */
    public final long m7951getBrand500d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5443a + 51;
        int i4 = i3 % 128;
        f5444b = i4;
        int i5 = i3 % 2;
        long j2 = this.brand50;
        int i6 = i4 + 43;
        f5443a = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getBrand200-0d7_KjU */
    public final long m7948getBrand2000d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5444b + 91;
        int i4 = i3 % 128;
        f5443a = i4;
        int i5 = i3 % 2;
        long j2 = this.brand200;
        int i6 = i4 + 105;
        f5444b = i6 % 128;
        if (i6 % 2 == 0) {
            return j2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: getBrand300-0d7_KjU */
    public final long m7949getBrand3000d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5444b + 67;
        int i4 = i3 % 128;
        f5443a = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        long j2 = this.brand300;
        int i5 = i4 + 75;
        f5444b = i5 % 128;
        int i6 = i5 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getBrand400-0d7_KjU */
    public final long m7950getBrand4000d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5443a + 9;
        int i4 = i3 % 128;
        f5444b = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j2 = this.brand400;
        int i5 = i4 + 81;
        f5443a = i5 % 128;
        int i6 = i5 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getBrand500-0d7_KjU */
    public final long m7952getBrand5000d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5443a + 39;
        f5444b = i3 % 128;
        if (i3 % 2 == 0) {
            return this.brand500;
        }
        throw null;
    }

    /* JADX INFO: renamed from: getBrand600-0d7_KjU */
    public final long m7953getBrand6000d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5444b + 109;
        int i4 = i3 % 128;
        f5443a = i4;
        int i5 = i3 % 2;
        long j2 = this.brand600;
        int i6 = i4 + 93;
        f5444b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 86 / 0;
        }
        return j2;
    }

    /* JADX INFO: renamed from: getBrand900-0d7_KjU */
    public final long m7954getBrand9000d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5443a + 91;
        int i4 = i3 % 128;
        f5444b = i4;
        int i5 = i3 % 2;
        long j2 = this.brand900;
        int i6 = i4 + 57;
        f5443a = i6 % 128;
        if (i6 % 2 != 0) {
            return j2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getGray0-0d7_KjU */
    public final long m7957getGray00d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5444b;
        int i4 = i3 + 63;
        f5443a = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.gray0;
        int i6 = i3 + 19;
        f5443a = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getGray50-0d7_KjU */
    public final long m7961getGray500d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5444b;
        int i4 = i3 + 97;
        f5443a = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.gray50;
        int i6 = i3 + 57;
        f5443a = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getGray100-0d7_KjU */
    public final long m7958getGray1000d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5443a + 69;
        int i4 = i3 % 128;
        f5444b = i4;
        int i5 = i3 % 2;
        long j2 = this.gray100;
        int i6 = i4 + 113;
        f5443a = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getGray200-0d7_KjU */
    public final long m7959getGray2000d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5444b;
        int i4 = i3 + 3;
        f5443a = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.gray200;
        int i6 = i3 + 121;
        f5443a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 39 / 0;
        }
        return j2;
    }

    /* JADX INFO: renamed from: getGray300-0d7_KjU */
    public final long m7960getGray3000d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5443a;
        int i4 = i3 + 107;
        f5444b = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.gray300;
        int i6 = i3 + 47;
        f5444b = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getGray500-0d7_KjU */
    public final long m7962getGray5000d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5444b;
        int i4 = i3 + 93;
        f5443a = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.gray500;
        int i6 = i3 + 47;
        f5443a = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getGray700-0d7_KjU */
    public final long m7963getGray7000d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5443a;
        int i4 = i3 + 39;
        f5444b = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.gray700;
        int i6 = i3 + 69;
        f5444b = i6 % 128;
        if (i6 % 2 == 0) {
            return j2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getGray800-0d7_KjU */
    public final long m7964getGray8000d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5443a + 53;
        int i4 = i3 % 128;
        f5444b = i4;
        int i5 = i3 % 2;
        long j2 = this.gray800;
        int i6 = i4 + 77;
        f5443a = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getGray900-0d7_KjU */
    public final long m7965getGray9000d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5444b + 1;
        f5443a = i3 % 128;
        if (i3 % 2 != 0) {
            return this.gray900;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getBrandSecondary50-0d7_KjU */
    public final long m7955getBrandSecondary500d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5443a + 97;
        int i4 = i3 % 128;
        f5444b = i4;
        int i5 = i3 % 2;
        long j2 = this.brandSecondary50;
        int i6 = i4 + 11;
        f5443a = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getBrandSecondary500-0d7_KjU */
    public final long m7956getBrandSecondary5000d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5443a + 27;
        f5444b = i3 % 128;
        if (i3 % 2 == 0) {
            return this.brandSecondary500;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getPositive50-0d7_KjU */
    public final long m7971getPositive500d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5443a;
        int i4 = i3 + 59;
        f5444b = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.positive50;
        int i6 = i3 + 113;
        f5444b = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getPositive600-0d7_KjU */
    public final long m7972getPositive6000d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5444b;
        int i4 = i3 + 21;
        f5443a = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.positive600;
        int i6 = i3 + 65;
        f5443a = i6 % 128;
        if (i6 % 2 != 0) {
            return j2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getPositive800-0d7_KjU */
    public final long m7973getPositive8000d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5443a + 123;
        int i4 = i3 % 128;
        f5444b = i4;
        int i5 = i3 % 2;
        long j2 = this.positive800;
        int i6 = i4 + 107;
        f5443a = i6 % 128;
        if (i6 % 2 != 0) {
            return j2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getWarning50-0d7_KjU */
    public final long m7975getWarning500d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5444b + 73;
        f5443a = i3 % 128;
        if (i3 % 2 != 0) {
            return this.warning50;
        }
        int i4 = 2 / 0;
        return this.warning50;
    }

    /* JADX INFO: renamed from: getWarning400-0d7_KjU */
    public final long m7974getWarning4000d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5443a + 101;
        f5444b = i3 % 128;
        if (i3 % 2 == 0) {
            return this.warning400;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getWarning500-0d7_KjU */
    public final long m7976getWarning5000d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5443a + 53;
        int i4 = i3 % 128;
        f5444b = i4;
        int i5 = i3 % 2;
        long j2 = this.warning500;
        int i6 = i4 + 69;
        f5443a = i6 % 128;
        if (i6 % 2 != 0) {
            return j2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: getWarning950-0d7_KjU */
    public final long m7977getWarning9500d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5444b + 85;
        f5443a = i3 % 128;
        if (i3 % 2 != 0) {
            return this.warning950;
        }
        int i4 = 76 / 0;
        return this.warning950;
    }

    /* JADX INFO: renamed from: getNegative50-0d7_KjU */
    public final long m7966getNegative500d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5444b + 65;
        f5443a = i3 % 128;
        if (i3 % 2 != 0) {
            return this.negative50;
        }
        int i4 = 30 / 0;
        return this.negative50;
    }

    /* JADX INFO: renamed from: getNegative500-0d7_KjU */
    public final long m7967getNegative5000d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5443a;
        int i4 = i3 + 59;
        f5444b = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        long j2 = this.negative500;
        int i5 = i3 + 3;
        f5444b = i5 % 128;
        if (i5 % 2 == 0) {
            return j2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: getNegative600-0d7_KjU */
    public final long m7968getNegative6000d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5443a;
        int i4 = i3 + 85;
        f5444b = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.negative600;
        int i6 = i3 + 37;
        f5444b = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getNegative950-0d7_KjU */
    public final long m7969getNegative9500d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5444b + 41;
        int i4 = i3 % 128;
        f5443a = i4;
        int i5 = i3 % 2;
        long j2 = this.negative950;
        int i6 = i4 + 65;
        f5444b = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    public static final class e {

        /* JADX INFO: renamed from: a */
        private static int f5453a = 0;

        /* JADX INFO: renamed from: e */
        private static int f5454e = 1;

        private e() {
        }

        public final KSerializer<IncodeColorPalette> serializer() {
            d dVar;
            int i2 = 2 % 2;
            int i3 = f5454e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f5453a = i3 % 128;
            if (i3 % 2 != 0) {
                dVar = d.f5449c;
                int i4 = 28 / 0;
            } else {
                dVar = d.f5449c;
            }
            int i5 = f5454e + 87;
            f5453a = i5 % 128;
            if (i5 % 2 == 0) {
                return dVar;
            }
            throw null;
        }

        @JvmStatic
        public static IncodeColorPalette b() {
            int i2 = 2 % 2;
            IncodeColorPalette incodeColorPalette = new IncodeColorPalette(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, Integer.MAX_VALUE, (DefaultConstructorMarker) null);
            int i3 = f5454e + 1;
            f5453a = i3 % 128;
            int i4 = i3 % 2;
            return incodeColorPalette;
        }

        public /* synthetic */ e(byte b2) {
            this();
        }
    }

    static {
        int i2 = f5446e + 13;
        f5445c = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ IncodeColorPalette(int i2, Color color, Color color2, Color color3, Color color4, Color color5, Color color6, Color color7, Color color8, Color color9, Color color10, Color color11, Color color12, Color color13, Color color14, Color color15, Color color16, Color color17, Color color18, Color color19, Color color20, Color color21, Color color22, Color color23, Color color24, Color color25, Color color26, Color color27, Color color28, Color color29, Color color30, Color color31, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, color, color2, color3, color4, color5, color6, color7, color8, color9, color10, color11, color12, color13, color14, color15, color16, color17, color18, color19, color20, color21, color22, color23, color24, color25, color26, color27, color28, color29, color30, color31, serializationConstructorMarker);
    }

    public /* synthetic */ IncodeColorPalette(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32);
    }

    @JvmStatic
    public static final IncodeColorPalette createDefault() {
        int i2 = 2 % 2;
        int i3 = f5443a + 99;
        f5444b = i3 % 128;
        int i4 = i3 % 2;
        IncodeColorPalette incodeColorPaletteB = e.b();
        if (i4 != 0) {
            int i5 = 37 / 0;
        }
        return incodeColorPaletteB;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncodeColorPalette)) {
            return false;
        }
        IncodeColorPalette incodeColorPalette = (IncodeColorPalette) obj;
        if (!Color.m4179equalsimpl0(this.neutral, incodeColorPalette.neutral)) {
            int i3 = f5443a + 87;
            f5444b = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Color.m4179equalsimpl0(this.black, incodeColorPalette.black)) {
            int i5 = f5444b;
            int i6 = i5 + 81;
            f5443a = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 19;
            f5443a = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Color.m4179equalsimpl0(this.brand50, incodeColorPalette.brand50) || !Color.m4179equalsimpl0(this.brand200, incodeColorPalette.brand200) || !Color.m4179equalsimpl0(this.brand300, incodeColorPalette.brand300) || !Color.m4179equalsimpl0(this.brand400, incodeColorPalette.brand400) || !Color.m4179equalsimpl0(this.brand500, incodeColorPalette.brand500) || !Color.m4179equalsimpl0(this.brand600, incodeColorPalette.brand600) || !Color.m4179equalsimpl0(this.brand900, incodeColorPalette.brand900) || !Color.m4179equalsimpl0(this.gray0, incodeColorPalette.gray0) || !Color.m4179equalsimpl0(this.gray50, incodeColorPalette.gray50) || !Color.m4179equalsimpl0(this.gray100, incodeColorPalette.gray100) || !Color.m4179equalsimpl0(this.gray200, incodeColorPalette.gray200) || !Color.m4179equalsimpl0(this.gray300, incodeColorPalette.gray300) || !Color.m4179equalsimpl0(this.gray500, incodeColorPalette.gray500) || (!Color.m4179equalsimpl0(this.gray700, incodeColorPalette.gray700)) || !Color.m4179equalsimpl0(this.gray800, incodeColorPalette.gray800) || !Color.m4179equalsimpl0(this.gray900, incodeColorPalette.gray900)) {
            return false;
        }
        if (!Color.m4179equalsimpl0(this.brandSecondary50, incodeColorPalette.brandSecondary50)) {
            int i10 = f5443a + 5;
            f5444b = i10 % 128;
            return i10 % 2 != 0;
        }
        if (!Color.m4179equalsimpl0(this.brandSecondary500, incodeColorPalette.brandSecondary500)) {
            int i11 = f5444b + 99;
            f5443a = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Color.m4179equalsimpl0(this.positive50, incodeColorPalette.positive50) || !Color.m4179equalsimpl0(this.positive600, incodeColorPalette.positive600) || !Color.m4179equalsimpl0(this.positive800, incodeColorPalette.positive800)) {
            return false;
        }
        if (!Color.m4179equalsimpl0(this.warning50, incodeColorPalette.warning50)) {
            int i13 = f5443a + 87;
            f5444b = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }
        if (!Color.m4179equalsimpl0(this.warning400, incodeColorPalette.warning400)) {
            int i15 = f5443a + 21;
            f5444b = i15 % 128;
            return i15 % 2 != 0;
        }
        if (!Color.m4179equalsimpl0(this.warning500, incodeColorPalette.warning500)) {
            return false;
        }
        if (Color.m4179equalsimpl0(this.warning950, incodeColorPalette.warning950)) {
            return Color.m4179equalsimpl0(this.negative50, incodeColorPalette.negative50) && Color.m4179equalsimpl0(this.negative500, incodeColorPalette.negative500) && Color.m4179equalsimpl0(this.negative600, incodeColorPalette.negative600) && Color.m4179equalsimpl0(this.negative950, incodeColorPalette.negative950);
        }
        int i16 = f5443a + 123;
        f5444b = i16 % 128;
        int i17 = i16 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f5444b + 45;
        f5443a = i3 % 128;
        int i4 = i3 % 2;
        int iM4185hashCodeimpl = (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Color.m4185hashCodeimpl(this.neutral) * 31) + Color.m4185hashCodeimpl(this.black)) * 31) + Color.m4185hashCodeimpl(this.brand50)) * 31) + Color.m4185hashCodeimpl(this.brand200)) * 31) + Color.m4185hashCodeimpl(this.brand300)) * 31) + Color.m4185hashCodeimpl(this.brand400)) * 31) + Color.m4185hashCodeimpl(this.brand500)) * 31) + Color.m4185hashCodeimpl(this.brand600)) * 31) + Color.m4185hashCodeimpl(this.brand900)) * 31) + Color.m4185hashCodeimpl(this.gray0)) * 31) + Color.m4185hashCodeimpl(this.gray50)) * 31) + Color.m4185hashCodeimpl(this.gray100)) * 31) + Color.m4185hashCodeimpl(this.gray200)) * 31) + Color.m4185hashCodeimpl(this.gray300)) * 31) + Color.m4185hashCodeimpl(this.gray500)) * 31) + Color.m4185hashCodeimpl(this.gray700)) * 31) + Color.m4185hashCodeimpl(this.gray800)) * 31) + Color.m4185hashCodeimpl(this.gray900)) * 31) + Color.m4185hashCodeimpl(this.brandSecondary50)) * 31) + Color.m4185hashCodeimpl(this.brandSecondary500)) * 31) + Color.m4185hashCodeimpl(this.positive50)) * 31) + Color.m4185hashCodeimpl(this.positive600)) * 31) + Color.m4185hashCodeimpl(this.positive800)) * 31) + Color.m4185hashCodeimpl(this.warning50)) * 31) + Color.m4185hashCodeimpl(this.warning400)) * 31) + Color.m4185hashCodeimpl(this.warning500)) * 31) + Color.m4185hashCodeimpl(this.warning950)) * 31) + Color.m4185hashCodeimpl(this.negative50)) * 31) + Color.m4185hashCodeimpl(this.negative500)) * 31) + Color.m4185hashCodeimpl(this.negative600)) * 31) + Color.m4185hashCodeimpl(this.negative950);
        int i5 = f5444b + 57;
        f5443a = i5 % 128;
        if (i5 % 2 != 0) {
            return iM4185hashCodeimpl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f5444b + 7;
        f5443a = i3 % 128;
        int i4 = i3 % 2;
        String str = "IncodeColorPalette(neutral=" + Color.m4186toStringimpl(this.neutral) + ", black=" + Color.m4186toStringimpl(this.black) + ", brand50=" + Color.m4186toStringimpl(this.brand50) + ", brand200=" + Color.m4186toStringimpl(this.brand200) + ", brand300=" + Color.m4186toStringimpl(this.brand300) + ", brand400=" + Color.m4186toStringimpl(this.brand400) + ", brand500=" + Color.m4186toStringimpl(this.brand500) + ", brand600=" + Color.m4186toStringimpl(this.brand600) + ", brand900=" + Color.m4186toStringimpl(this.brand900) + ", gray0=" + Color.m4186toStringimpl(this.gray0) + ", gray50=" + Color.m4186toStringimpl(this.gray50) + ", gray100=" + Color.m4186toStringimpl(this.gray100) + ", gray200=" + Color.m4186toStringimpl(this.gray200) + ", gray300=" + Color.m4186toStringimpl(this.gray300) + ", gray500=" + Color.m4186toStringimpl(this.gray500) + ", gray700=" + Color.m4186toStringimpl(this.gray700) + ", gray800=" + Color.m4186toStringimpl(this.gray800) + ", gray900=" + Color.m4186toStringimpl(this.gray900) + ", brandSecondary50=" + Color.m4186toStringimpl(this.brandSecondary50) + ", brandSecondary500=" + Color.m4186toStringimpl(this.brandSecondary500) + ", positive50=" + Color.m4186toStringimpl(this.positive50) + ", positive600=" + Color.m4186toStringimpl(this.positive600) + ", positive800=" + Color.m4186toStringimpl(this.positive800) + ", warning50=" + Color.m4186toStringimpl(this.warning50) + ", warning400=" + Color.m4186toStringimpl(this.warning400) + ", warning500=" + Color.m4186toStringimpl(this.warning500) + ", warning950=" + Color.m4186toStringimpl(this.warning950) + ", negative50=" + Color.m4186toStringimpl(this.negative50) + ", negative500=" + Color.m4186toStringimpl(this.negative500) + ", negative600=" + Color.m4186toStringimpl(this.negative600) + ", negative950=" + Color.m4186toStringimpl(this.negative950) + ")";
        int i5 = f5443a + 87;
        f5444b = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: copy-Y2hkOno$default */
    public static /* synthetic */ IncodeColorPalette m7914copyY2hkOno$default(IncodeColorPalette incodeColorPalette, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, int i2, Object obj) {
        long j33 = j2;
        long j34 = j6;
        long j35 = j7;
        long j36 = j3;
        long j37 = j5;
        long j38 = j4;
        long j39 = j32;
        long j40 = j23;
        long j41 = j28;
        long j42 = j27;
        long j43 = j13;
        long j44 = j26;
        long j45 = j24;
        long j46 = j25;
        long j47 = j22;
        long j48 = j15;
        long j49 = j21;
        long j50 = j19;
        long j51 = j30;
        long j52 = j16;
        long j53 = j29;
        long j54 = j11;
        long j55 = j18;
        long j56 = j17;
        long j57 = j8;
        long j58 = j9;
        long j59 = j31;
        long j60 = j12;
        long j61 = j10;
        long j62 = j20;
        long j63 = j14;
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            j33 = incodeColorPalette.neutral;
        }
        if ((i2 & 2) != 0) {
            j36 = incodeColorPalette.black;
        }
        if ((i2 & 4) != 0) {
            int i4 = f5443a + 75;
            f5444b = i4 % 128;
            if (i4 % 2 != 0) {
                j38 = incodeColorPalette.brand50;
                int i5 = 32 / 0;
            } else {
                j38 = incodeColorPalette.brand50;
            }
        }
        if ((i2 & 8) != 0) {
            j37 = incodeColorPalette.brand200;
        }
        if ((i2 & 16) != 0) {
            int i6 = f5443a + 59;
            f5444b = i6 % 128;
            int i7 = i6 % 2;
            j34 = incodeColorPalette.brand300;
        }
        if ((i2 & 32) != 0) {
            j35 = incodeColorPalette.brand400;
        }
        if ((i2 & 64) != 0) {
            j57 = incodeColorPalette.brand500;
        }
        if ((i2 & 128) != 0) {
            int i8 = f5444b + 115;
            f5443a = i8 % 128;
            if (i8 % 2 == 0) {
                long j64 = incodeColorPalette.brand600;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            j58 = incodeColorPalette.brand600;
        }
        if ((i2 & 256) != 0) {
            j61 = incodeColorPalette.brand900;
        }
        if ((i2 & 512) != 0) {
            j54 = incodeColorPalette.gray0;
        }
        if ((i2 & 1024) != 0) {
            int i9 = f5443a + 125;
            f5444b = i9 % 128;
            int i10 = i9 % 2;
            j60 = incodeColorPalette.gray50;
        }
        if ((i2 & 2048) != 0) {
            j43 = incodeColorPalette.gray100;
        }
        if ((i2 & 4096) != 0) {
            j63 = incodeColorPalette.gray200;
        }
        if ((i2 & 8192) != 0) {
            j48 = incodeColorPalette.gray300;
        }
        if ((i2 & 16384) != 0) {
            j52 = incodeColorPalette.gray500;
        }
        if ((32768 & i2) != 0) {
            j56 = incodeColorPalette.gray700;
        }
        if ((65536 & i2) != 0) {
            int i11 = f5444b + 121;
            f5443a = i11 % 128;
            int i12 = i11 % 2;
            j55 = incodeColorPalette.gray800;
            if (i12 == 0) {
                int i13 = 34 / 0;
            }
        }
        if ((131072 & i2) != 0) {
            int i14 = f5443a + 109;
            f5444b = i14 % 128;
            int i15 = i14 % 2;
            j50 = incodeColorPalette.gray900;
        }
        if ((262144 & i2) != 0) {
            j62 = incodeColorPalette.brandSecondary50;
        }
        if ((524288 & i2) != 0) {
            j49 = incodeColorPalette.brandSecondary500;
        }
        if ((1048576 & i2) != 0) {
            j47 = incodeColorPalette.positive50;
        }
        if ((2097152 & i2) != 0) {
            j40 = incodeColorPalette.positive600;
        }
        if ((4194304 & i2) != 0) {
            j45 = incodeColorPalette.positive800;
        }
        if ((8388608 & i2) != 0) {
            int i16 = f5444b + 89;
            f5443a = i16 % 128;
            int i17 = i16 % 2;
            j46 = incodeColorPalette.warning50;
            if (i17 == 0) {
                int i18 = 93 / 0;
            }
        }
        if ((16777216 & i2) != 0) {
            j44 = incodeColorPalette.warning400;
            int i19 = f5443a + 3;
            f5444b = i19 % 128;
            int i20 = i19 % 2;
        }
        if ((33554432 & i2) != 0) {
            j42 = incodeColorPalette.warning500;
        }
        if ((67108864 & i2) != 0) {
            int i21 = f5443a + 13;
            f5444b = i21 % 128;
            int i22 = i21 % 2;
            j41 = incodeColorPalette.warning950;
            if (i22 != 0) {
                int i23 = 72 / 0;
            }
        }
        if ((134217728 & i2) != 0) {
            j53 = incodeColorPalette.negative50;
        }
        if ((268435456 & i2) != 0) {
            j51 = incodeColorPalette.negative500;
        }
        if ((536870912 & i2) != 0) {
            j59 = incodeColorPalette.negative600;
        }
        if ((i2 & 1073741824) != 0) {
            j39 = incodeColorPalette.negative950;
        }
        long j65 = j53;
        long j66 = j51;
        long j67 = j59;
        long j68 = j39;
        IncodeColorPalette incodeColorPaletteM7946copyY2hkOno = incodeColorPalette.m7946copyY2hkOno(j33, j36, j38, j37, j34, j35, j57, j58, j61, j54, j60, j43, j63, j48, j52, j56, j55, j50, j62, j49, j47, j40, j45, j46, j44, j42, j41, j65, j66, j67, j68);
        int i24 = f5443a + 95;
        f5444b = i24 % 128;
        if (i24 % 2 == 0) {
            return incodeColorPaletteM7946copyY2hkOno;
        }
        throw null;
    }

    /* JADX INFO: renamed from: copy-Y2hkOno */
    public final IncodeColorPalette m7946copyY2hkOno(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32) {
        int i2 = 2 % 2;
        IncodeColorPalette incodeColorPalette = new IncodeColorPalette(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, null);
        int i3 = f5443a + 1;
        f5444b = i3 % 128;
        if (i3 % 2 == 0) {
            return incodeColorPalette;
        }
        throw null;
    }

    /* JADX INFO: renamed from: component31-0d7_KjU */
    public final long m7939component310d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5443a;
        int i4 = i3 + 95;
        f5444b = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.negative950;
        int i6 = i3 + 9;
        f5444b = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: component30-0d7_KjU */
    public final long m7938component300d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5444b;
        int i4 = i3 + 11;
        f5443a = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.negative600;
        int i6 = i3 + 45;
        f5443a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 86 / 0;
        }
        return j2;
    }

    /* JADX INFO: renamed from: component29-0d7_KjU */
    public final long m7936component290d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5444b + 29;
        int i4 = i3 % 128;
        f5443a = i4;
        int i5 = i3 % 2;
        long j2 = this.negative500;
        int i6 = i4 + 109;
        f5444b = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: component28-0d7_KjU */
    public final long m7935component280d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5443a + 57;
        int i4 = i3 % 128;
        f5444b = i4;
        int i5 = i3 % 2;
        long j2 = this.negative50;
        int i6 = i4 + 43;
        f5443a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 13 / 0;
        }
        return j2;
    }

    /* JADX INFO: renamed from: component27-0d7_KjU */
    public final long m7934component270d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5444b + 75;
        int i4 = i3 % 128;
        f5443a = i4;
        int i5 = i3 % 2;
        long j2 = this.warning950;
        int i6 = i4 + 97;
        f5444b = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: component26-0d7_KjU */
    public final long m7933component260d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5444b + 77;
        int i4 = i3 % 128;
        f5443a = i4;
        int i5 = i3 % 2;
        long j2 = this.warning500;
        int i6 = i4 + 63;
        f5444b = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: component25-0d7_KjU */
    public final long m7932component250d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5443a + 25;
        int i4 = i3 % 128;
        f5444b = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        long j2 = this.warning400;
        int i5 = i4 + 81;
        f5443a = i5 % 128;
        int i6 = i5 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: component24-0d7_KjU */
    public final long m7931component240d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5443a + 51;
        int i4 = i3 % 128;
        f5444b = i4;
        int i5 = i3 % 2;
        long j2 = this.warning50;
        int i6 = i4 + 121;
        f5443a = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: component23-0d7_KjU */
    public final long m7930component230d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5444b + 61;
        f5443a = i3 % 128;
        if (i3 % 2 != 0) {
            return this.positive800;
        }
        throw null;
    }

    /* JADX INFO: renamed from: component22-0d7_KjU */
    public final long m7929component220d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5443a + 21;
        int i4 = i3 % 128;
        f5444b = i4;
        int i5 = i3 % 2;
        long j2 = this.positive600;
        if (i5 != 0) {
            int i6 = 0 / 0;
        }
        int i7 = i4 + 19;
        f5443a = i7 % 128;
        int i8 = i7 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: component21-0d7_KjU */
    public final long m7928component210d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5444b + 11;
        f5443a = i3 % 128;
        if (i3 % 2 != 0) {
            return this.positive50;
        }
        int i4 = 0 / 0;
        return this.positive50;
    }

    /* JADX INFO: renamed from: component20-0d7_KjU */
    public final long m7927component200d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5444b;
        int i4 = i3 + 125;
        f5443a = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.brandSecondary500;
        int i6 = i3 + 53;
        f5443a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 33 / 0;
        }
        return j2;
    }

    /* JADX INFO: renamed from: component19-0d7_KjU */
    public final long m7925component190d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5444b + 85;
        int i4 = i3 % 128;
        f5443a = i4;
        int i5 = i3 % 2;
        long j2 = this.brandSecondary50;
        int i6 = i4 + 35;
        f5444b = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: component18-0d7_KjU */
    public final long m7924component180d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5443a + 29;
        f5444b = i3 % 128;
        if (i3 % 2 == 0) {
            return this.gray900;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: component17-0d7_KjU */
    public final long m7923component170d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5443a;
        int i4 = i3 + 51;
        f5444b = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        long j2 = this.gray800;
        int i5 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f5444b = i5 % 128;
        if (i5 % 2 == 0) {
            return j2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: component16-0d7_KjU */
    public final long m7922component160d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5443a + 21;
        int i4 = i3 % 128;
        f5444b = i4;
        int i5 = i3 % 2;
        long j2 = this.gray700;
        int i6 = i4 + 53;
        f5443a = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: component15-0d7_KjU */
    public final long m7921component150d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5443a + 65;
        int i4 = i3 % 128;
        f5444b = i4;
        int i5 = i3 % 2;
        long j2 = this.gray500;
        if (i5 != 0) {
            int i6 = 79 / 0;
        }
        int i7 = i4 + 81;
        f5443a = i7 % 128;
        if (i7 % 2 != 0) {
            return j2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: component14-0d7_KjU */
    public final long m7920component140d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5444b + 37;
        int i4 = i3 % 128;
        f5443a = i4;
        int i5 = i3 % 2;
        long j2 = this.gray300;
        int i6 = i4 + 21;
        f5444b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 90 / 0;
        }
        return j2;
    }

    /* JADX INFO: renamed from: component13-0d7_KjU */
    public final long m7919component130d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5443a + 3;
        f5444b = i3 % 128;
        if (i3 % 2 == 0) {
            return this.gray200;
        }
        int i4 = 72 / 0;
        return this.gray200;
    }

    /* JADX INFO: renamed from: component12-0d7_KjU */
    public final long m7918component120d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5443a;
        int i4 = i3 + 13;
        f5444b = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.gray100;
        int i6 = i3 + 93;
        f5444b = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: component11-0d7_KjU */
    public final long m7917component110d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5444b;
        int i4 = i3 + 83;
        f5443a = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.gray50;
        int i6 = i3 + 73;
        f5443a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 68 / 0;
        }
        return j2;
    }

    /* JADX INFO: renamed from: component10-0d7_KjU */
    public final long m7916component100d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5444b;
        int i4 = i3 + 55;
        f5443a = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j2 = this.gray0;
        int i5 = i3 + 89;
        f5443a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 16 / 0;
        }
        return j2;
    }

    /* JADX INFO: renamed from: component9-0d7_KjU */
    public final long m7945component90d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5443a + 37;
        f5444b = i3 % 128;
        if (i3 % 2 == 0) {
            return this.brand900;
        }
        int i4 = 40 / 0;
        return this.brand900;
    }

    /* JADX INFO: renamed from: component8-0d7_KjU */
    public final long m7944component80d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5444b + 33;
        f5443a = i3 % 128;
        if (i3 % 2 != 0) {
            return this.brand600;
        }
        int i4 = 75 / 0;
        return this.brand600;
    }

    /* JADX INFO: renamed from: component7-0d7_KjU */
    public final long m7943component70d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5443a + 23;
        int i4 = i3 % 128;
        f5444b = i4;
        int i5 = i3 % 2;
        long j2 = this.brand500;
        int i6 = i4 + 75;
        f5443a = i6 % 128;
        if (i6 % 2 != 0) {
            return j2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: component6-0d7_KjU */
    public final long m7942component60d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5444b;
        int i4 = i3 + 75;
        f5443a = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j2 = this.brand400;
        int i5 = i3 + 77;
        f5443a = i5 % 128;
        int i6 = i5 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: component5-0d7_KjU */
    public final long m7941component50d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5443a + 75;
        int i4 = i3 % 128;
        f5444b = i4;
        int i5 = i3 % 2;
        long j2 = this.brand300;
        int i6 = i4 + 3;
        f5443a = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: component4-0d7_KjU */
    public final long m7940component40d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5444b;
        int i4 = i3 + 117;
        f5443a = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.brand200;
        int i6 = i3 + 109;
        f5443a = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: component3-0d7_KjU */
    public final long m7937component30d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5443a;
        int i4 = i3 + 59;
        f5444b = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.brand50;
        int i6 = i3 + 75;
        f5444b = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: component2-0d7_KjU */
    public final long m7926component20d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5443a + 77;
        f5444b = i3 % 128;
        if (i3 % 2 == 0) {
            return this.black;
        }
        throw null;
    }

    /* JADX INFO: renamed from: component1-0d7_KjU */
    public final long m7915component10d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5444b;
        int i4 = i3 + 75;
        f5443a = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.neutral;
        int i6 = i3 + 11;
        f5443a = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }
}
