package com.upokecenter.cbor;

import com.upokecenter.cbor.URIUtility;
import java.net.URI;

/* JADX INFO: loaded from: classes5.dex */
class CBORUriConverter implements ICBORToFromConverter<URI> {
    CBORUriConverter() {
    }

    private static CBORObject ValidateObject(CBORObject cBORObject) {
        if (cBORObject.getType() != CBORType.TextString) {
            throw new CBORException("URI/IRI must be a text String");
        }
        boolean zHasMostOuterTag = cBORObject.HasMostOuterTag(266);
        if (cBORObject.HasMostOuterTag(267) && !URIUtility.IsValidIRI(cBORObject.AsString(), URIUtility.ParseMode.IRIStrict)) {
            throw new CBORException("String is not a valid IRI Reference");
        }
        if (zHasMostOuterTag && (!URIUtility.IsValidIRI(cBORObject.AsString(), URIUtility.ParseMode.IRIStrict) || !URIUtility.HasScheme(cBORObject.AsString()))) {
            throw new CBORException("String is not a valid IRI");
        }
        if (URIUtility.IsValidIRI(cBORObject.AsString(), URIUtility.ParseMode.URIStrict) && URIUtility.HasScheme(cBORObject.AsString())) {
            return cBORObject;
        }
        throw new CBORException("String is not a valid URI");
    }

    @Override // com.upokecenter.cbor.ICBORToFromConverter
    public URI FromCBORObject(CBORObject cBORObject) {
        if (!cBORObject.HasMostOuterTag(32) && !cBORObject.HasMostOuterTag(266) && !cBORObject.HasMostOuterTag(267)) {
            throw new CBORException();
        }
        ValidateObject(cBORObject);
        try {
            return new URI(cBORObject.AsString());
        } catch (Exception e2) {
            throw new CBORException(e2.getMessage(), e2);
        }
    }

    @Override // com.upokecenter.cbor.ICBORConverter
    public CBORObject ToCBORObject(URI uri) {
        if (uri == null) {
            throw new NullPointerException("uri");
        }
        String string = uri.toString();
        int i2 = 0;
        for (int i3 = 0; i3 < string.length(); i3++) {
            int i4 = string.charAt(i3) >= 128 ? 1 : 0;
            i2 = (i2 + i4) - (i2 & i4);
        }
        int i5 = i2 != 0 ? 266 : 32;
        if (!URIUtility.HasScheme(string)) {
            i5 = 267;
        }
        return CBORObject.FromObjectAndTag(string, i5);
    }
}
