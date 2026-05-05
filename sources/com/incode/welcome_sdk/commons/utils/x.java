package com.incode.welcome_sdk.commons.utils;

import com.biocatch.client.android.sdk.core.Constants;
import com.jakewharton.retrofit2.converter.kotlinx.serialization.KotlinSerializationConverterFactory;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuilder;
import okhttp3.MediaType;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes5.dex */
public final class x {

    /* JADX INFO: renamed from: a */
    private static int f6657a = 0;

    /* JADX INFO: renamed from: b */
    private static int f6658b = 1;

    /* JADX INFO: renamed from: c */
    private final Lazy f6659c = LazyKt.lazy(a.f6663b);

    /* JADX INFO: renamed from: e */
    private final Lazy f6661e = LazyKt.lazy(new d());

    /* JADX INFO: renamed from: d */
    private final Converter.Factory f6660d = KotlinSerializationConverterFactory.create(b(), MediaType.Companion.get(Constants.WUP_CONTENT_TYPE));

    public static final /* synthetic */ SerializersModule c(x xVar) {
        int i2 = 2 % 2;
        int i3 = f6657a + 7;
        f6658b = i3 % 128;
        int i4 = i3 % 2;
        SerializersModule serializersModuleC = xVar.c();
        int i5 = f6658b + 55;
        f6657a = i5 % 128;
        int i6 = i5 % 2;
        return serializersModuleC;
    }

    static final class a extends Lambda implements Function0<SerializersModule> {

        /* JADX INFO: renamed from: a */
        private static int f6662a = 0;

        /* JADX INFO: renamed from: b */
        public static final a f6663b = new a();

        /* JADX INFO: renamed from: c */
        private static int f6664c = 1;

        /* JADX INFO: renamed from: d */
        private static int f6665d = 0;

        /* JADX INFO: renamed from: e */
        private static int f6666e = 1;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ SerializersModule invoke() {
            int i2 = 2 % 2;
            int i3 = f6665d + 17;
            f6664c = i3 % 128;
            int i4 = i3 % 2;
            SerializersModule serializersModuleB = b();
            int i5 = f6665d + 31;
            f6664c = i5 % 128;
            int i6 = i5 % 2;
            return serializersModuleB;
        }

        private static SerializersModule b() {
            int i2 = 2 % 2;
            SerializersModule serializersModuleBuild = new SerializersModuleBuilder().build();
            int i3 = f6664c + 43;
            f6665d = i3 % 128;
            int i4 = i3 % 2;
            return serializersModuleBuild;
        }

        static {
            int i2 = f6666e + 65;
            f6662a = i2 % 128;
            int i3 = i2 % 2;
        }

        a() {
            super(0);
        }
    }

    private final SerializersModule c() {
        SerializersModule serializersModule;
        int i2 = 2 % 2;
        int i3 = f6657a + 77;
        f6658b = i3 % 128;
        if (i3 % 2 == 0) {
            serializersModule = (SerializersModule) this.f6659c.getValue();
            int i4 = 49 / 0;
        } else {
            serializersModule = (SerializersModule) this.f6659c.getValue();
        }
        int i5 = f6658b + 111;
        f6657a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 56 / 0;
        }
        return serializersModule;
    }

    static final class d extends Lambda implements Function0<Json> {

        /* JADX INFO: renamed from: c */
        private static int f6667c = 0;

        /* JADX INFO: renamed from: e */
        private static int f6668e = 1;

        /* JADX INFO: renamed from: com.incode.welcome_sdk.commons.utils.x$d$3 */
        static final class AnonymousClass3 extends Lambda implements Function1<JsonBuilder, Unit> {

            /* JADX INFO: renamed from: b */
            private static int f6670b = 0;

            /* JADX INFO: renamed from: e */
            private static int f6671e = 1;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
                int i2 = 2 % 2;
                int i3 = f6671e + 69;
                f6670b = i3 % 128;
                int i4 = i3 % 2;
                e(jsonBuilder);
                Unit unit = Unit.INSTANCE;
                if (i4 != 0) {
                    throw null;
                }
                int i5 = f6670b + 23;
                f6671e = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 27 / 0;
                }
                return unit;
            }

            private void e(JsonBuilder jsonBuilder) {
                int i2 = 2 % 2;
                int i3 = f6671e + 35;
                f6670b = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(jsonBuilder, "");
                    jsonBuilder.setSerializersModule(x.c(xVar));
                    jsonBuilder.setEncodeDefaults(false);
                } else {
                    Intrinsics.checkNotNullParameter(jsonBuilder, "");
                    jsonBuilder.setSerializersModule(x.c(xVar));
                    jsonBuilder.setEncodeDefaults(true);
                }
                jsonBuilder.setIgnoreUnknownKeys(true);
                int i4 = f6670b + 31;
                f6671e = i4 % 128;
                int i5 = i4 % 2;
            }

            AnonymousClass3() {
                super(1);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Json invoke() {
            int i2 = 2 % 2;
            int i3 = f6667c + 61;
            f6668e = i3 % 128;
            if (i3 % 2 != 0) {
                return d();
            }
            d();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private Json d() {
            int i2 = 2 % 2;
            Json jsonJson$default = JsonKt.Json$default(null, new Function1<JsonBuilder, Unit>() { // from class: com.incode.welcome_sdk.commons.utils.x.d.3

                /* JADX INFO: renamed from: b */
                private static int f6670b = 0;

                /* JADX INFO: renamed from: e */
                private static int f6671e = 1;

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
                    int i22 = 2 % 2;
                    int i3 = f6671e + 69;
                    f6670b = i3 % 128;
                    int i4 = i3 % 2;
                    e(jsonBuilder);
                    Unit unit = Unit.INSTANCE;
                    if (i4 != 0) {
                        throw null;
                    }
                    int i5 = f6670b + 23;
                    f6671e = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 27 / 0;
                    }
                    return unit;
                }

                private void e(JsonBuilder jsonBuilder) {
                    int i22 = 2 % 2;
                    int i3 = f6671e + 35;
                    f6670b = i3 % 128;
                    if (i3 % 2 != 0) {
                        Intrinsics.checkNotNullParameter(jsonBuilder, "");
                        jsonBuilder.setSerializersModule(x.c(xVar));
                        jsonBuilder.setEncodeDefaults(false);
                    } else {
                        Intrinsics.checkNotNullParameter(jsonBuilder, "");
                        jsonBuilder.setSerializersModule(x.c(xVar));
                        jsonBuilder.setEncodeDefaults(true);
                    }
                    jsonBuilder.setIgnoreUnknownKeys(true);
                    int i4 = f6670b + 31;
                    f6671e = i4 % 128;
                    int i5 = i4 % 2;
                }

                AnonymousClass3() {
                    super(1);
                }
            }, 1, null);
            int i3 = f6667c + 23;
            f6668e = i3 % 128;
            int i4 = i3 % 2;
            return jsonJson$default;
        }

        d() {
            super(0);
        }
    }

    public final Json b() {
        int i2 = 2 % 2;
        int i3 = f6657a + 43;
        f6658b = i3 % 128;
        int i4 = i3 % 2;
        Json json = (Json) this.f6661e.getValue();
        if (i4 != 0) {
            return json;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Converter.Factory e() {
        int i2 = 2 % 2;
        int i3 = f6658b;
        int i4 = i3 + 67;
        f6657a = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Converter.Factory factory = this.f6660d;
        int i5 = i3 + 17;
        f6657a = i5 % 128;
        int i6 = i5 % 2;
        return factory;
    }
}
