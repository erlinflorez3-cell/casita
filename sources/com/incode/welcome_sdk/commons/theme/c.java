package com.incode.welcome_sdk.commons.theme;

import androidx.compose.ui.text.font.FontWeight;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements KSerializer<FontWeight> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5595a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5597c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5598d = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f5600j = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f5599e = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SerialDescriptor f5596b = SerialDescriptorsKt.PrimitiveSerialDescriptor("FontWeight", PrimitiveKind.STRING.INSTANCE);

    private c() {
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final /* synthetic */ Object deserialize(Decoder decoder) {
        int i2 = 2 % 2;
        int i3 = f5597c + 77;
        f5598d = i3 % 128;
        int i4 = i3 % 2;
        FontWeight fontWeightA = a(decoder);
        int i5 = f5597c + 97;
        f5598d = i5 % 128;
        if (i5 % 2 == 0) {
            return fontWeightA;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i2 = 2 % 2;
        int i3 = f5598d + 57;
        f5597c = i3 % 128;
        int i4 = i3 % 2;
        e(encoder, (FontWeight) obj);
        if (i4 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    static {
        int i2 = f5600j + 23;
        f5595a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        int i2 = 2 % 2;
        int i3 = f5597c + 107;
        f5598d = i3 % 128;
        if (i3 % 2 == 0) {
            return f5596b;
        }
        throw null;
    }

    private static void e(Encoder encoder, FontWeight fontWeight) {
        int i2 = 2 % 2;
        int i3 = f5598d + 33;
        f5597c = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(fontWeight, "");
            encoder.encodeString(n.e(fontWeight));
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(fontWeight, "");
            encoder.encodeString(n.e(fontWeight));
            int i4 = 3 / 0;
        }
    }

    private static FontWeight a(Decoder decoder) {
        int i2 = 2 % 2;
        int i3 = f5598d + 47;
        f5597c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        FontWeight fontWeightA = n.a(decoder.decodeString());
        int i5 = f5597c + 13;
        f5598d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 57 / 0;
        }
        return fontWeightA;
    }
}
