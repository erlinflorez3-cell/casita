package com.incode.welcome_sdk.commons.theme;

import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontListFontFamily;
import androidx.compose.ui.text.font.ResourceFont;
import com.incode.welcome_sdk.commons.theme.IncodeTypography;
import io.sentry.protocol.Device;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements KSerializer<IncodeTypography.Family> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5601d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5602e = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f5603c;

    public d(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "");
        this.f5603c = aVar;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final /* synthetic */ Object deserialize(Decoder decoder) {
        int i2 = 2 % 2;
        int i3 = f5602e + 83;
        f5601d = i3 % 128;
        int i4 = i3 % 2;
        IncodeTypography.Family familyA = a(decoder);
        int i5 = f5602e + 57;
        f5601d = i5 % 128;
        if (i5 % 2 == 0) {
            return familyA;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i2 = 2 % 2;
        int i3 = f5602e + 19;
        f5601d = i3 % 128;
        int i4 = i3 % 2;
        a(encoder, (IncodeTypography.Family) obj);
        int i5 = f5601d + 25;
        f5602e = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    static final class e extends Lambda implements Function1<ClassSerialDescriptorBuilder, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f5604a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f5605b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f5606c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f5607d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final e f5608e = new e();

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
            int i2 = 2 % 2;
            int i3 = f5606c + 23;
            f5604a = i3 % 128;
            int i4 = i3 % 2;
            e(classSerialDescriptorBuilder);
            Unit unit = Unit.INSTANCE;
            int i5 = f5604a + 23;
            f5606c = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        private static void e(ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
            int i2 = 2 % 2;
            int i3 = f5604a + 85;
            f5606c = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(classSerialDescriptorBuilder, "");
            classSerialDescriptorBuilder.element("text", BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE).getDescriptor(), CollectionsKt.emptyList(), true);
            classSerialDescriptorBuilder.element("display", BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE).getDescriptor(), CollectionsKt.emptyList(), true);
            int i5 = f5604a + 115;
            f5606c = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i2 = f5607d + 51;
            f5605b = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        e() {
            super(1);
        }
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        int i2 = 2 % 2;
        int i3 = f5601d + 53;
        f5602e = i3 % 128;
        SerialDescriptor serialDescriptorBuildClassSerialDescriptor = i3 % 2 == 0 ? SerialDescriptorsKt.buildClassSerialDescriptor(Device.JsonKeys.FAMILY, new SerialDescriptor[0], e.f5608e) : SerialDescriptorsKt.buildClassSerialDescriptor(Device.JsonKeys.FAMILY, new SerialDescriptor[0], e.f5608e);
        int i4 = f5602e + 91;
        f5601d = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptorBuildClassSerialDescriptor;
    }

    private void a(Encoder encoder, IncodeTypography.Family family) throws IllegalStateException {
        int i2 = 2 % 2;
        int i3 = f5602e + 11;
        f5601d = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(family, "");
            boolean z2 = encoder instanceof JsonEncoder;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(family, "");
        if (!(encoder instanceof JsonEncoder)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(family.getText() instanceof FontListFontFamily)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        List<Font> fonts = ((FontListFontFamily) family.getText()).getFonts();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = fonts.iterator();
        while (it.hasNext()) {
            int i4 = f5601d + 59;
            f5602e = i4 % 128;
            if (i4 % 2 == 0) {
                boolean z3 = it.next() instanceof ResourceFont;
                obj.hashCode();
                throw null;
            }
            Object next = it.next();
            if (next instanceof ResourceFont) {
                arrayList.add(next);
            }
        }
        ArrayList<ResourceFont> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (ResourceFont resourceFont : arrayList2) {
            arrayList3.add(TuplesKt.to(this.f5603c.a(resourceFont), n.e(resourceFont.getWeight())));
        }
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
        ArrayList<Pair> arrayList4 = arrayList3;
        for (Pair pair : arrayList4) {
            int i5 = f5602e + 87;
            f5601d = i5 % 128;
            int i6 = i5 % 2;
            JsonElementBuildersKt.put(jsonObjectBuilder2, (String) pair.getSecond(), (String) pair.getFirst());
        }
        Unit unit = Unit.INSTANCE;
        jsonObjectBuilder.put("text", jsonObjectBuilder2.build());
        JsonObjectBuilder jsonObjectBuilder3 = new JsonObjectBuilder();
        for (Pair pair2 : arrayList4) {
            int i7 = f5602e + 51;
            f5601d = i7 % 128;
            int i8 = i7 % 2;
            JsonElementBuildersKt.put(jsonObjectBuilder3, (String) pair2.getSecond(), (String) pair2.getFirst());
        }
        Unit unit2 = Unit.INSTANCE;
        jsonObjectBuilder.put("display", jsonObjectBuilder3.build());
        ((JsonEncoder) encoder).encodeJsonElement(jsonObjectBuilder.build());
    }

    private IncodeTypography.Family a(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        if (!(decoder instanceof JsonDecoder)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        JsonElement jsonElementDecodeJsonElement = ((JsonDecoder) decoder).decodeJsonElement();
        JsonElement jsonElement = (JsonElement) JsonElementKt.getJsonObject(jsonElementDecodeJsonElement).get((Object) "text");
        FontFamily fontFamilyB = jsonElement != null ? b(jsonElement) : null;
        JsonElement jsonElement2 = (JsonElement) JsonElementKt.getJsonObject(jsonElementDecodeJsonElement).get((Object) "display");
        FontFamily fontFamilyB2 = jsonElement2 != null ? b(jsonElement2) : null;
        if (fontFamilyB == null) {
            fontFamilyB = IncodeTypefaceTokens.INSTANCE.getFamilyText();
        }
        if (fontFamilyB2 == null) {
            fontFamilyB2 = IncodeTypefaceTokens.INSTANCE.getFamilyDisplay();
        }
        return new IncodeTypography.Family(fontFamilyB, fontFamilyB2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e A[PHI: r2
  0x002e: PHI (r2v6 kotlinx.serialization.json.JsonObject) = (r2v5 kotlinx.serialization.json.JsonObject), (r2v7 kotlinx.serialization.json.JsonObject) binds: [B:14:0x005e, B:7:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final androidx.compose.ui.text.font.FontFamily b(kotlinx.serialization.json.JsonElement r7) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.theme.d.b(kotlinx.serialization.json.JsonElement):androidx.compose.ui.text.font.FontFamily");
    }

    private final void c(JsonElement jsonElement, String str, List<Font> list) {
        JsonElement jsonElement2;
        int i2 = 2 % 2;
        int i3 = f5601d + 35;
        f5602e = i3 % 128;
        if (i3 % 2 == 0) {
            jsonElement2 = (JsonElement) JsonElementKt.getJsonObject(jsonElement).get((Object) "android");
            int i4 = 50 / 0;
            if (jsonElement2 == null) {
                return;
            }
        } else {
            jsonElement2 = (JsonElement) JsonElementKt.getJsonObject(jsonElement).get((Object) "android");
            if (jsonElement2 == null) {
                return;
            }
        }
        JsonObject jsonObject = JsonElementKt.getJsonObject(jsonElement2);
        if (jsonObject != null) {
            int i5 = f5602e + 121;
            f5601d = i5 % 128;
            int i6 = i5 % 2;
            JsonElement jsonElement3 = (JsonElement) jsonObject.get((Object) str);
            if (i6 != 0) {
                int i7 = 81 / 0;
                if (jsonElement3 == null) {
                    return;
                }
            } else if (jsonElement3 == null) {
                return;
            }
            list.add(this.f5603c.c(JsonElementKt.getJsonPrimitive(jsonElement3).getContent(), n.a(str)));
            int i8 = f5602e + 73;
            f5601d = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
        }
    }
}
