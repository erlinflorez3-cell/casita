package com.google.crypto.tink;

import com.google.crypto.tink.internal.JsonParser;
import com.google.crypto.tink.proto.EncryptedKeyset;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.KeysetInfo;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.subtle.Base64;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.Path;

/* JADX INFO: loaded from: classes7.dex */
public final class JsonKeysetReader implements KeysetReader {
    private static final long MAX_KEY_ID = 4294967295L;
    private static final long MIN_KEY_ID = -2147483648L;
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final InputStream inputStream;
    private boolean urlSafeBase64 = false;

    private JsonKeysetReader(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    private EncryptedKeyset encryptedKeysetFromJson(JsonObject json) throws IOException {
        validateEncryptedKeyset(json);
        byte[] bArrUrlSafeDecode = this.urlSafeBase64 ? Base64.urlSafeDecode(json.get("encryptedKeyset").getAsString()) : Base64.decode(json.get("encryptedKeyset").getAsString());
        return json.has("keysetInfo") ? (EncryptedKeyset) EncryptedKeyset.newBuilder().setEncryptedKeyset(ByteString.copyFrom(bArrUrlSafeDecode)).setKeysetInfo(keysetInfoFromJson(json.getAsJsonObject("keysetInfo"))).build() : (EncryptedKeyset) EncryptedKeyset.newBuilder().setEncryptedKeyset(ByteString.copyFrom(bArrUrlSafeDecode)).build();
    }

    private static int getKeyId(JsonElement element) throws IOException {
        try {
            long parsedNumberAsLongOrThrow = JsonParser.getParsedNumberAsLongOrThrow(element);
            if (parsedNumberAsLongOrThrow > MAX_KEY_ID || parsedNumberAsLongOrThrow < MIN_KEY_ID) {
                throw new IOException("invalid key id");
            }
            return (int) element.getAsLong();
        } catch (NumberFormatException e2) {
            throw new IOException(e2);
        }
    }

    private static KeyData.KeyMaterialType getKeyMaterialType(String type) {
        type.hashCode();
        switch (type) {
            case "REMOTE":
                return KeyData.KeyMaterialType.REMOTE;
            case "SYMMETRIC":
                return KeyData.KeyMaterialType.SYMMETRIC;
            case "ASYMMETRIC_PRIVATE":
                return KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE;
            case "ASYMMETRIC_PUBLIC":
                return KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC;
            default:
                throw new JsonParseException("unknown key material type: " + type);
        }
    }

    private static OutputPrefixType getOutputPrefixType(String type) {
        type.hashCode();
        switch (type) {
            case "LEGACY":
                return OutputPrefixType.LEGACY;
            case "RAW":
                return OutputPrefixType.RAW;
            case "TINK":
                return OutputPrefixType.TINK;
            case "CRUNCHY":
                return OutputPrefixType.CRUNCHY;
            default:
                throw new JsonParseException("unknown output prefix type: " + type);
        }
    }

    private static KeyStatusType getStatus(String status) {
        status.hashCode();
        switch (status) {
            case "ENABLED":
                return KeyStatusType.ENABLED;
            case "DESTROYED":
                return KeyStatusType.DESTROYED;
            case "DISABLED":
                return KeyStatusType.DISABLED;
            default:
                throw new JsonParseException("unknown status: " + status);
        }
    }

    private KeyData keyDataFromJson(JsonObject json) {
        validateKeyData(json);
        return (KeyData) KeyData.newBuilder().setTypeUrl(json.get("typeUrl").getAsString()).setValue(ByteString.copyFrom(this.urlSafeBase64 ? Base64.urlSafeDecode(json.get("value").getAsString()) : Base64.decode(json.get("value").getAsString()))).setKeyMaterialType(getKeyMaterialType(json.get("keyMaterialType").getAsString())).build();
    }

    private Keyset.Key keyFromJson(JsonObject json) throws IOException {
        validateKey(json);
        return (Keyset.Key) Keyset.Key.newBuilder().setStatus(getStatus(json.get("status").getAsString())).setKeyId(getKeyId(json.get("keyId"))).setOutputPrefixType(getOutputPrefixType(json.get("outputPrefixType").getAsString())).setKeyData(keyDataFromJson(json.getAsJsonObject("keyData"))).build();
    }

    private static KeysetInfo.KeyInfo keyInfoFromJson(JsonObject json) throws IOException {
        return (KeysetInfo.KeyInfo) KeysetInfo.KeyInfo.newBuilder().setStatus(getStatus(json.get("status").getAsString())).setKeyId(getKeyId(json.get("keyId"))).setOutputPrefixType(getOutputPrefixType(json.get("outputPrefixType").getAsString())).setTypeUrl(json.get("typeUrl").getAsString()).build();
    }

    private Keyset keysetFromJson(JsonObject json) throws IOException {
        validateKeyset(json);
        Keyset.Builder builderNewBuilder = Keyset.newBuilder();
        if (json.has("primaryKeyId")) {
            builderNewBuilder.setPrimaryKeyId(getKeyId(json.get("primaryKeyId")));
        }
        JsonArray asJsonArray = json.getAsJsonArray("key");
        for (int i2 = 0; i2 < asJsonArray.size(); i2++) {
            builderNewBuilder.addKey(keyFromJson(asJsonArray.get(i2).getAsJsonObject()));
        }
        return (Keyset) builderNewBuilder.build();
    }

    private static KeysetInfo keysetInfoFromJson(JsonObject json) throws IOException {
        KeysetInfo.Builder builderNewBuilder = KeysetInfo.newBuilder();
        if (json.has("primaryKeyId")) {
            builderNewBuilder.setPrimaryKeyId(getKeyId(json.get("primaryKeyId")));
        }
        if (json.has("keyInfo")) {
            JsonArray asJsonArray = json.getAsJsonArray("keyInfo");
            for (int i2 = 0; i2 < asJsonArray.size(); i2++) {
                builderNewBuilder.addKeyInfo(keyInfoFromJson(asJsonArray.get(i2).getAsJsonObject()));
            }
        }
        return (KeysetInfo) builderNewBuilder.build();
    }

    private static void validateEncryptedKeyset(JsonObject json) {
        if (!json.has("encryptedKeyset")) {
            throw new JsonParseException("invalid encrypted keyset");
        }
    }

    private static void validateKey(JsonObject json) {
        if (!json.has("keyData") || !json.has("status") || !json.has("keyId") || !json.has("outputPrefixType")) {
            throw new JsonParseException("invalid key");
        }
    }

    private static void validateKeyData(JsonObject json) {
        if (!json.has("typeUrl") || !json.has("value") || !json.has("keyMaterialType")) {
            throw new JsonParseException("invalid keyData");
        }
    }

    private static void validateKeyset(JsonObject json) {
        if (!json.has("key") || json.getAsJsonArray("key").size() == 0) {
            throw new JsonParseException("invalid keyset");
        }
    }

    public static JsonKeysetReader withBytes(final byte[] bytes) {
        return new JsonKeysetReader(new ByteArrayInputStream(bytes));
    }

    @Deprecated
    public static JsonKeysetReader withFile(File file) throws IOException {
        return withInputStream(new FileInputStream(file));
    }

    public static JsonKeysetReader withInputStream(InputStream input) throws IOException {
        return new JsonKeysetReader(input);
    }

    @Deprecated
    public static JsonKeysetReader withJsonObject(Object input) {
        return withString(input.toString());
    }

    @Deprecated
    public static JsonKeysetReader withPath(String path) throws IOException {
        return withInputStream(new FileInputStream(new File(path)));
    }

    @Deprecated
    public static JsonKeysetReader withPath(Path path) throws IOException {
        return withInputStream(new FileInputStream(path.toFile()));
    }

    public static JsonKeysetReader withString(String input) {
        return new JsonKeysetReader(new ByteArrayInputStream(input.getBytes(UTF_8)));
    }

    @Override // com.google.crypto.tink.KeysetReader
    public Keyset read() throws IOException {
        try {
            try {
                return keysetFromJson(JsonParser.parse(new String(Util.readAll(this.inputStream), UTF_8)).getAsJsonObject());
            } catch (JsonParseException | IllegalStateException e2) {
                throw new IOException(e2);
            }
        } finally {
            InputStream inputStream = this.inputStream;
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    @Override // com.google.crypto.tink.KeysetReader
    public EncryptedKeyset readEncrypted() throws IOException {
        try {
            try {
                return encryptedKeysetFromJson(JsonParser.parse(new String(Util.readAll(this.inputStream), UTF_8)).getAsJsonObject());
            } catch (JsonParseException | IllegalStateException e2) {
                throw new IOException(e2);
            }
        } finally {
            InputStream inputStream = this.inputStream;
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    public JsonKeysetReader withUrlSafeBase64() {
        this.urlSafeBase64 = true;
        return this;
    }
}
