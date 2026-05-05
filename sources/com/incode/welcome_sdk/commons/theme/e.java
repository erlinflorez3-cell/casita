package com.incode.welcome_sdk.commons.theme;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.UStringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements KSerializer<Color> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5611c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5612d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5613e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f5614f = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f5610b = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SerialDescriptor f5609a = SerialDescriptorsKt.PrimitiveSerialDescriptor("Color", PrimitiveKind.STRING.INSTANCE);

    private e() {
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final /* synthetic */ Object deserialize(Decoder decoder) {
        Color colorM4168boximpl;
        int i2 = 2 % 2;
        int i3 = f5612d + 75;
        f5613e = i3 % 128;
        if (i3 % 2 != 0) {
            colorM4168boximpl = Color.m4168boximpl(c(decoder));
            int i4 = 11 / 0;
        } else {
            colorM4168boximpl = Color.m4168boximpl(c(decoder));
        }
        int i5 = f5613e + 99;
        f5612d = i5 % 128;
        int i6 = i5 % 2;
        return colorM4168boximpl;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i2 = 2 % 2;
        int i3 = f5613e + 93;
        f5612d = i3 % 128;
        Color color = (Color) obj;
        if (i3 % 2 == 0) {
            c(encoder, color.m4188unboximpl());
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        c(encoder, color.m4188unboximpl());
        int i4 = f5613e + 57;
        f5612d = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        int i2 = f5611c + 35;
        f5614f = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 30 / 0;
        }
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        int i2 = 2 % 2;
        int i3 = f5613e;
        int i4 = i3 + 61;
        f5612d = i4 % 128;
        int i5 = i4 % 2;
        SerialDescriptor serialDescriptor = f5609a;
        int i6 = i3 + 91;
        f5612d = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 74 / 0;
        }
        return serialDescriptor;
    }

    private static void c(Encoder encoder, long j2) {
        String strDropLast;
        StringBuilder sb;
        int i2 = 2 % 2;
        int i3 = f5613e + 19;
        f5612d = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            strDropLast = StringsKt.dropLast(UStringsKt.m10292toStringJSWoG40(j2, 13), 124);
            sb = new StringBuilder("#");
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            strDropLast = StringsKt.dropLast(UStringsKt.m10292toStringJSWoG40(j2, 16), 8);
            sb = new StringBuilder("#");
        }
        encoder.encodeString(sb.append(strDropLast).toString());
        int i4 = f5612d + 97;
        f5613e = i4 % 128;
        int i5 = i4 % 2;
    }

    private static long c(Decoder decoder) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        String strRemovePrefix = StringsKt.removePrefix(decoder.decodeString(), (CharSequence) "#");
        if (strRemovePrefix.length() == 6) {
            int i3 = f5613e + 79;
            f5612d = i3 % 128;
            int i4 = i3 % 2;
            strRemovePrefix = "ff" + strRemovePrefix;
            int i5 = f5612d + 49;
            f5613e = i5 % 128;
            int i6 = i5 % 2;
        }
        return ColorKt.Color(Long.parseLong(strRemovePrefix, CharsKt.checkRadix(16)));
    }
}
