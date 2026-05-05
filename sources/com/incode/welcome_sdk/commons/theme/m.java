package com.incode.welcome_sdk.commons.theme;

import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements KSerializer<TextUnit> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5754c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5755d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5756e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f5757f = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f5753b = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SerialDescriptor f5752a = SerialDescriptorsKt.PrimitiveSerialDescriptor("TextUnit", PrimitiveKind.STRING.INSTANCE);

    private m() {
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final /* synthetic */ Object deserialize(Decoder decoder) {
        int i2 = 2 % 2;
        int i3 = f5756e + 65;
        f5754c = i3 % 128;
        int i4 = i3 % 2;
        TextUnit textUnitM6821boximpl = TextUnit.m6821boximpl(e(decoder));
        int i5 = f5756e + 89;
        f5754c = i5 % 128;
        int i6 = i5 % 2;
        return textUnitM6821boximpl;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i2 = 2 % 2;
        int i3 = f5756e + 91;
        f5754c = i3 % 128;
        int i4 = i3 % 2;
        a(encoder, ((TextUnit) obj).m6840unboximpl());
        int i5 = f5754c + 65;
        f5756e = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    static {
        int i2 = f5757f + 81;
        f5755d = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        int i2 = 2 % 2;
        int i3 = f5754c;
        int i4 = i3 + 97;
        f5756e = i4 % 128;
        int i5 = i4 % 2;
        SerialDescriptor serialDescriptor = f5752a;
        int i6 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f5756e = i6 % 128;
        int i7 = i6 % 2;
        return serialDescriptor;
    }

    private static void a(Encoder encoder, long j2) {
        int i2 = 2 % 2;
        int i3 = f5754c + 13;
        f5756e = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        encoder.encodeFloat(TextUnit.m6831getValueimpl(j2));
        int i5 = f5756e + 117;
        f5754c = i5 % 128;
        int i6 = i5 % 2;
    }

    private static long e(Decoder decoder) {
        int i2 = 2 % 2;
        int i3 = f5756e + 115;
        f5754c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        long jM6843TextUnitanM5pPY = TextUnitKt.m6843TextUnitanM5pPY(decoder.decodeFloat(), TextUnitType.Companion.m6864getSpUIouoOA());
        int i5 = f5756e + 75;
        f5754c = i5 % 128;
        int i6 = i5 % 2;
        return jM6843TextUnitanM5pPY;
    }
}
