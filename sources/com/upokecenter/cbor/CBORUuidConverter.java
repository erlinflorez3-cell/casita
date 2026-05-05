package com.upokecenter.cbor;

import com.google.common.base.Ascii;
import java.util.UUID;
import org.apache.commons.codec.language.Soundex;

/* JADX INFO: loaded from: classes5.dex */
class CBORUuidConverter implements ICBORToFromConverter<UUID> {
    CBORUuidConverter() {
    }

    private static CBORObject ValidateObject(CBORObject cBORObject) {
        if (cBORObject.getType() != CBORType.ByteString) {
            throw new CBORException("UUID must be a byte String");
        }
        if (cBORObject.GetByteString().length == 16) {
            return cBORObject;
        }
        throw new CBORException("UUID must be 16 bytes long");
    }

    @Override // com.upokecenter.cbor.ICBORToFromConverter
    public UUID FromCBORObject(CBORObject cBORObject) {
        if (!cBORObject.HasMostOuterTag(37)) {
            throw new CBORException("Must have outermost tag 37");
        }
        ValidateObject(cBORObject);
        byte[] bArrGetByteString = cBORObject.GetByteString();
        char[] cArr = new char[36];
        int i2 = 0;
        for (int i3 = 0; i3 < 16; i3++) {
            if (i3 == 4 || i3 == 6 || i3 == 8 || i3 == 10) {
                cArr[i2] = Soundex.SILENT_MARKER;
                i2++;
            }
            int i4 = i2 + 1;
            int i5 = bArrGetByteString[i3] >> 4;
            cArr[i2] = "0123456789abcdef".charAt((i5 + 15) - (i5 | 15));
            i2 += 2;
            byte b2 = bArrGetByteString[i3];
            cArr[i4] = "0123456789abcdef".charAt((b2 + Ascii.SI) - (b2 | Ascii.SI));
        }
        return UUID.fromString(new String(cArr));
    }

    @Override // com.upokecenter.cbor.ICBORConverter
    public CBORObject ToCBORObject(UUID uuid) {
        return CBORObject.FromObjectAndTag(PropertyMap.UUIDToBytes(uuid), 37);
    }
}
