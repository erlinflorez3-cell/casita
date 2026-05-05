package com.google.crypto.tink.jwt;

import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.google.common.base.Ascii;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.subtle.Base64;
import com.google.gson.JsonObject;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Optional;

/* JADX INFO: loaded from: classes7.dex */
final class JwtFormat {

    static class Parts {
        String header;
        String payload;
        byte[] signatureOrMac;
        String unsignedCompact;

        Parts(String unsignedCompact, byte[] signatureOrMac, String header, String payload) {
            this.unsignedCompact = unsignedCompact;
            this.signatureOrMac = signatureOrMac;
            this.header = header;
            this.payload = payload;
        }
    }

    private JwtFormat() {
    }

    static String createHeader(String algorithm, Optional<String> typeHeader, Optional<String> kid) throws InvalidAlgorithmParameterException {
        validateAlgorithm(algorithm);
        JsonObject jsonObject = new JsonObject();
        if (kid.isPresent()) {
            jsonObject.addProperty("kid", kid.get());
        }
        jsonObject.addProperty("alg", algorithm);
        if (typeHeader.isPresent()) {
            jsonObject.addProperty(ClientData.KEY_TYPE, typeHeader.get());
        }
        return Base64.urlSafeEncode(jsonObject.toString().getBytes(Util.UTF_8));
    }

    static String createSignedCompact(String unsignedCompact, byte[] signature) {
        return unsignedCompact + "." + encodeSignature(signature);
    }

    static String createUnsignedCompact(String algorithm, Optional<String> kid, RawJwt rawJwt) throws JwtInvalidException, InvalidAlgorithmParameterException {
        return createHeader(algorithm, rawJwt.hasTypeHeader() ? Optional.of(rawJwt.getTypeHeader()) : Optional.empty(), kid) + "." + encodePayload(rawJwt.getJsonPayload());
    }

    static String decodeHeader(String headerStr) throws JwtInvalidException {
        byte[] bArrStrictUrlSafeDecode = strictUrlSafeDecode(headerStr);
        validateUtf8(bArrStrictUrlSafeDecode);
        return new String(bArrStrictUrlSafeDecode, Util.UTF_8);
    }

    static String decodePayload(String payloadStr) throws JwtInvalidException {
        byte[] bArrStrictUrlSafeDecode = strictUrlSafeDecode(payloadStr);
        validateUtf8(bArrStrictUrlSafeDecode);
        return new String(bArrStrictUrlSafeDecode, Util.UTF_8);
    }

    static byte[] decodeSignature(String signatureStr) throws JwtInvalidException {
        return strictUrlSafeDecode(signatureStr);
    }

    static String encodePayload(String jsonPayload) {
        return Base64.urlSafeEncode(jsonPayload.getBytes(Util.UTF_8));
    }

    static String encodeSignature(byte[] signature) {
        return Base64.urlSafeEncode(signature);
    }

    static Optional<Integer> getKeyId(String kid) {
        byte[] bArrUrlSafeDecode = Base64.urlSafeDecode(kid);
        return bArrUrlSafeDecode.length != 4 ? Optional.empty() : Optional.of(Integer.valueOf(ByteBuffer.wrap(bArrUrlSafeDecode).getInt()));
    }

    static Optional<String> getKid(int keyId, OutputPrefixType prefix) throws JwtInvalidException {
        if (prefix == OutputPrefixType.RAW) {
            return Optional.empty();
        }
        if (prefix == OutputPrefixType.TINK) {
            return Optional.of(Base64.urlSafeEncode(ByteBuffer.allocate(4).putInt(keyId).array()));
        }
        throw new JwtInvalidException("unsupported output prefix type");
    }

    private static String getStringHeader(JsonObject header, String name) throws JwtInvalidException {
        if (!header.has(name)) {
            throw new JwtInvalidException("header " + name + " does not exist");
        }
        if (header.get(name).isJsonPrimitive() && header.get(name).getAsJsonPrimitive().isString()) {
            return header.get(name).getAsString();
        }
        throw new JwtInvalidException("header " + name + " is not a string");
    }

    static Optional<String> getTypeHeader(JsonObject header) throws JwtInvalidException {
        return header.has(ClientData.KEY_TYPE) ? Optional.of(getStringHeader(header, ClientData.KEY_TYPE)) : Optional.empty();
    }

    static boolean isValidUrlsafeBase64Char(char c2) {
        return (c2 >= 'a' && c2 <= 'z') || (c2 >= 'A' && c2 <= 'Z') || ((c2 >= '0' && c2 <= '9') || c2 == '-' || c2 == '_');
    }

    static Parts splitSignedCompact(String signedCompact) throws JwtInvalidException {
        validateASCII(signedCompact);
        int iLastIndexOf = signedCompact.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            throw new JwtInvalidException("only tokens in JWS compact serialization format are supported");
        }
        String strSubstring = signedCompact.substring(0, iLastIndexOf);
        byte[] bArrDecodeSignature = decodeSignature(signedCompact.substring(iLastIndexOf + 1));
        int iIndexOf = strSubstring.indexOf(46);
        if (iIndexOf < 0) {
            throw new JwtInvalidException("only tokens in JWS compact serialization format are supported");
        }
        String strSubstring2 = strSubstring.substring(0, iIndexOf);
        String strSubstring3 = strSubstring.substring(iIndexOf + 1);
        if (strSubstring3.indexOf(46) <= 0) {
            return new Parts(strSubstring, bArrDecodeSignature, decodeHeader(strSubstring2), decodePayload(strSubstring3));
        }
        throw new JwtInvalidException("only tokens in JWS compact serialization format are supported");
    }

    static byte[] strictUrlSafeDecode(String encodedData) throws JwtInvalidException {
        for (int i2 = 0; i2 < encodedData.length(); i2++) {
            if (!isValidUrlsafeBase64Char(encodedData.charAt(i2))) {
                throw new JwtInvalidException("invalid encoding");
            }
        }
        try {
            return Base64.urlSafeDecode(encodedData);
        } catch (IllegalArgumentException e2) {
            throw new JwtInvalidException("invalid encoding: " + e2);
        }
    }

    static void validateASCII(String data) throws JwtInvalidException {
        for (int i2 = 0; i2 < data.length(); i2++) {
            if ((-1) - ((65535 - data.charAt(i2)) | ((-1) - 128)) > 0) {
                throw new JwtInvalidException("Non ascii character");
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void validateAlgorithm(String algo) throws InvalidAlgorithmParameterException {
        algo.hashCode();
        byte b2 = -1;
        switch (algo.hashCode()) {
            case 66245349:
                if (algo.equals("ES256")) {
                    b2 = 0;
                }
                break;
            case 66246401:
                if (algo.equals("ES384")) {
                    b2 = 1;
                }
                break;
            case 66248104:
                if (algo.equals("ES512")) {
                    b2 = 2;
                }
                break;
            case 69015912:
                if (algo.equals("HS256")) {
                    b2 = 3;
                }
                break;
            case 69016964:
                if (algo.equals("HS384")) {
                    b2 = 4;
                }
                break;
            case 69018667:
                if (algo.equals("HS512")) {
                    b2 = 5;
                }
                break;
            case 76404080:
                if (algo.equals("PS256")) {
                    b2 = 6;
                }
                break;
            case 76405132:
                if (algo.equals("PS384")) {
                    b2 = 7;
                }
                break;
            case 76406835:
                if (algo.equals("PS512")) {
                    b2 = 8;
                }
                break;
            case 78251122:
                if (algo.equals("RS256")) {
                    b2 = 9;
                }
                break;
            case 78252174:
                if (algo.equals("RS384")) {
                    b2 = 10;
                }
                break;
            case 78253877:
                if (algo.equals("RS512")) {
                    b2 = Ascii.VT;
                }
                break;
        }
        switch (b2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return;
            default:
                throw new InvalidAlgorithmParameterException("invalid algorithm: " + algo);
        }
    }

    static void validateHeader(String expectedAlgorithm, Optional<String> tinkKid, Optional<String> customKid, JsonObject parsedHeader) throws JwtInvalidException, InvalidAlgorithmParameterException {
        validateAlgorithm(expectedAlgorithm);
        String stringHeader = getStringHeader(parsedHeader, "alg");
        if (!stringHeader.equals(expectedAlgorithm)) {
            throw new InvalidAlgorithmParameterException(String.format("invalid algorithm; expected %s, got %s", expectedAlgorithm, stringHeader));
        }
        if (parsedHeader.has("crit")) {
            throw new JwtInvalidException("all tokens with crit headers are rejected");
        }
        if (tinkKid.isPresent() && customKid.isPresent()) {
            throw new JwtInvalidException("custom_kid can only be set for RAW keys.");
        }
        boolean zHas = parsedHeader.has("kid");
        if (tinkKid.isPresent()) {
            if (!zHas) {
                throw new JwtInvalidException("missing kid in header");
            }
            validateKidInHeader(tinkKid.get(), parsedHeader);
        }
        if (customKid.isPresent() && zHas) {
            validateKidInHeader(customKid.get(), parsedHeader);
        }
    }

    private static void validateKidInHeader(String expectedKid, JsonObject parsedHeader) throws JwtInvalidException {
        if (!getStringHeader(parsedHeader, "kid").equals(expectedKid)) {
            throw new JwtInvalidException("invalid kid in header");
        }
    }

    static void validateUtf8(byte[] data) throws JwtInvalidException {
        try {
            Util.UTF_8.newDecoder().decode(ByteBuffer.wrap(data));
        } catch (CharacterCodingException e2) {
            throw new JwtInvalidException(e2.getMessage());
        }
    }
}
