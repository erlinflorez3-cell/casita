package com.google.crypto.tink.internal;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.StringReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class JsonParser {
    private static final JsonElementTypeAdapter JSON_ELEMENT = new JsonElementTypeAdapter(null);

    /* JADX INFO: renamed from: com.google.crypto.tink.internal.JsonParser$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static final class JsonElementTypeAdapter extends TypeAdapter<JsonElement> {
        private static final int RECURSION_LIMIT = 100;

        private JsonElementTypeAdapter() {
        }

        /* synthetic */ JsonElementTypeAdapter(AnonymousClass1 anonymousClass1) {
            this();
        }

        private JsonElement readTerminal(JsonReader in, JsonToken peeked) throws IOException {
            int i2 = AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken[peeked.ordinal()];
            if (i2 == 3) {
                String strNextString = in.nextString();
                if (JsonParser.isValidString(strNextString)) {
                    return new JsonPrimitive(strNextString);
                }
                throw new IOException("illegal characters in string");
            }
            if (i2 == 4) {
                return new JsonPrimitive(new LazilyParsedNumber(in.nextString()));
            }
            if (i2 == 5) {
                return new JsonPrimitive(Boolean.valueOf(in.nextBoolean()));
            }
            if (i2 != 6) {
                throw new IllegalStateException("Unexpected token: " + peeked);
            }
            in.nextNull();
            return JsonNull.INSTANCE;
        }

        @Nullable
        private JsonElement tryBeginNesting(JsonReader in, JsonToken peeked) throws IOException {
            int i2 = AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken[peeked.ordinal()];
            if (i2 == 1) {
                in.beginArray();
                return new JsonArray();
            }
            if (i2 != 2) {
                return null;
            }
            in.beginObject();
            return new JsonObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public JsonElement read2(JsonReader in) throws IOException {
            String strNextName;
            JsonToken jsonTokenPeek = in.peek();
            JsonElement jsonElementTryBeginNesting = tryBeginNesting(in, jsonTokenPeek);
            if (jsonElementTryBeginNesting == null) {
                return readTerminal(in, jsonTokenPeek);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                if (in.hasNext()) {
                    if (jsonElementTryBeginNesting instanceof JsonObject) {
                        strNextName = in.nextName();
                        if (!JsonParser.isValidString(strNextName)) {
                            throw new IOException("illegal characters in string");
                        }
                    } else {
                        strNextName = null;
                    }
                    JsonToken jsonTokenPeek2 = in.peek();
                    JsonElement jsonElementTryBeginNesting2 = tryBeginNesting(in, jsonTokenPeek2);
                    boolean z2 = jsonElementTryBeginNesting2 != null;
                    if (jsonElementTryBeginNesting2 == null) {
                        jsonElementTryBeginNesting2 = readTerminal(in, jsonTokenPeek2);
                    }
                    if (jsonElementTryBeginNesting instanceof JsonArray) {
                        ((JsonArray) jsonElementTryBeginNesting).add(jsonElementTryBeginNesting2);
                    } else {
                        JsonObject jsonObject = (JsonObject) jsonElementTryBeginNesting;
                        if (jsonObject.has(strNextName)) {
                            throw new IOException("duplicate key: " + strNextName);
                        }
                        jsonObject.add(strNextName, jsonElementTryBeginNesting2);
                    }
                    if (z2) {
                        arrayDeque.addLast(jsonElementTryBeginNesting);
                        if (arrayDeque.size() > 100) {
                            throw new IOException("too many recursions");
                        }
                        jsonElementTryBeginNesting = jsonElementTryBeginNesting2;
                    } else {
                        continue;
                    }
                } else {
                    if (jsonElementTryBeginNesting instanceof JsonArray) {
                        in.endArray();
                    } else {
                        in.endObject();
                    }
                    if (arrayDeque.isEmpty()) {
                        return jsonElementTryBeginNesting;
                    }
                    jsonElementTryBeginNesting = (JsonElement) arrayDeque.removeLast();
                }
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter out, JsonElement value) {
            throw new UnsupportedOperationException("write is not supported");
        }
    }

    private static final class LazilyParsedNumber extends Number {
        private final String value;

        public LazilyParsedNumber(String value) {
            this.value = value;
        }

        private void readObject(ObjectInputStream in) throws NotSerializableException {
            throw new NotSerializableException("serialization is not supported");
        }

        private Object writeReplace() throws NotSerializableException {
            throw new NotSerializableException("serialization is not supported");
        }

        @Override // java.lang.Number
        public double doubleValue() {
            return Double.parseDouble(this.value);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof LazilyParsedNumber) {
                return this.value.equals(((LazilyParsedNumber) obj).value);
            }
            return false;
        }

        @Override // java.lang.Number
        public float floatValue() {
            return Float.parseFloat(this.value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @Override // java.lang.Number
        public int intValue() {
            try {
                try {
                    return Integer.parseInt(this.value);
                } catch (NumberFormatException unused) {
                    return new BigDecimal(this.value).intValue();
                }
            } catch (NumberFormatException unused2) {
                return (int) Long.parseLong(this.value);
            }
        }

        @Override // java.lang.Number
        public long longValue() {
            try {
                return Long.parseLong(this.value);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.value).longValue();
            }
        }

        public String toString() {
            return this.value;
        }
    }

    private JsonParser() {
    }

    public static long getParsedNumberAsLongOrThrow(JsonElement element) {
        if (element.getAsNumber() instanceof LazilyParsedNumber) {
            return Long.parseLong(element.getAsNumber().toString());
        }
        throw new IllegalArgumentException("does not contain a parsed number.");
    }

    public static boolean isValidString(String s2) {
        int length = s2.length();
        int i2 = 0;
        while (i2 != length) {
            char cCharAt = s2.charAt(i2);
            int i3 = i2 + 1;
            if (!Character.isSurrogate(cCharAt)) {
                i2 = i3;
            } else {
                if (Character.isLowSurrogate(cCharAt) || i3 == length || !Character.isLowSurrogate(s2.charAt(i3))) {
                    return false;
                }
                i2 += 2;
            }
        }
        return true;
    }

    public static JsonElement parse(String json) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(json));
            jsonReader.setLenient(false);
            return JSON_ELEMENT.read2(jsonReader);
        } catch (NumberFormatException e2) {
            throw new IOException(e2);
        }
    }
}
