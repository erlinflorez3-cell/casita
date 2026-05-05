package com.incode.welcome_sdk.commons.theme;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.DisplayMode;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements KSerializer<DisplayMode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5590b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5592d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5593e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f5594f = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f5591c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SerialDescriptor f5589a = SerialDescriptorsKt.PrimitiveSerialDescriptor("DisplayMode", PrimitiveKind.STRING.INSTANCE);

    private b() {
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final /* synthetic */ Object deserialize(Decoder decoder) {
        int i2 = 2 % 2;
        int i3 = f5593e + 97;
        f5592d = i3 % 128;
        int i4 = i3 % 2;
        DisplayMode displayModeE = e(decoder);
        int i5 = f5593e + 97;
        f5592d = i5 % 128;
        if (i5 % 2 == 0) {
            return displayModeE;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i2 = 2 % 2;
        int i3 = f5593e + 27;
        f5592d = i3 % 128;
        int i4 = i3 % 2;
        a(encoder, (DisplayMode) obj);
        int i5 = f5592d + 47;
        f5593e = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        int i2 = 2 % 2;
        int i3 = f5593e + 103;
        int i4 = i3 % 128;
        f5592d = i4;
        int i5 = i3 % 2;
        SerialDescriptor serialDescriptor = f5589a;
        int i6 = i4 + 81;
        f5593e = i6 % 128;
        int i7 = i6 % 2;
        return serialDescriptor;
    }

    static {
        int i2 = f5594f + 107;
        f5590b = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 82 / 0;
        }
    }

    private static void a(Encoder encoder, DisplayMode displayMode) {
        int i2 = 2 % 2;
        int i3 = f5592d + 77;
        f5593e = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(displayMode, "");
        String lowerCase = displayMode.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        encoder.encodeString(lowerCase);
        int i5 = f5592d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f5593e = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static DisplayMode e(Decoder decoder) {
        int i2 = 2 % 2;
        int i3 = f5593e + 39;
        f5592d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        String upperCase = decoder.decodeString().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        DisplayMode displayModeValueOf = DisplayMode.valueOf(upperCase);
        int i5 = f5592d + 45;
        f5593e = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 84 / 0;
        }
        return displayModeValueOf;
    }
}
