package com.upokecenter.cbor;

import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
final class CBORCanonical {
    static final Comparator<CBORObject> Comparer = new CtapComparer(null);
    private static final Comparator<Map.Entry<byte[], byte[]>> ByteComparer = new CtapByteComparer(null);

    /* JADX INFO: renamed from: com.upokecenter.cbor.CBORCanonical$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$upokecenter$cbor$CBORType;

        static {
            int[] iArr = new int[CBORType.values().length];
            $SwitchMap$com$upokecenter$cbor$CBORType = iArr;
            try {
                iArr[CBORType.Integer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.SimpleValue.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.Boolean.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.FloatingPoint.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.ByteString.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.TextString.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.Array.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.Map.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private static final class CtapByteComparer implements Comparator<Map.Entry<byte[], byte[]>> {
        private CtapByteComparer() {
        }

        /* synthetic */ CtapByteComparer(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // java.util.Comparator
        public int compare(Map.Entry<byte[], byte[]> entry, Map.Entry<byte[], byte[]> entry2) {
            byte[] key = entry.getKey();
            byte[] key2 = entry2.getKey();
            if (key == null) {
                return key2 == null ? 0 : -1;
            }
            if (key2 == null) {
                return 1;
            }
            if (key.length == 0) {
                return key2.length == 0 ? 0 : -1;
            }
            if (key2.length == 0) {
                return 1;
            }
            if (key == key2) {
                return 0;
            }
            byte b2 = key[0];
            int i2 = (-1) - (((-1) - b2) | ((-1) - CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY));
            byte b3 = key2[0];
            if (i2 != (b3 + CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY) - (224 | b3)) {
                return (-1) - (((-1) - b2) | ((-1) - CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY)) < (b3 & MessagePack.Code.NEGFIXINT_PREFIX) ? -1 : 1;
            }
            if (key.length != key2.length) {
                return key.length < key2.length ? -1 : 1;
            }
            for (int i3 = 0; i3 < key.length; i3++) {
                byte b4 = key[i3];
                byte b5 = key2[i3];
                if (b4 != b5) {
                    return (b4 & 255) < (b5 & 255) ? -1 : 1;
                }
            }
            return 0;
        }
    }

    private static final class CtapComparer implements Comparator<CBORObject> {
        private CtapComparer() {
        }

        /* synthetic */ CtapComparer(AnonymousClass1 anonymousClass1) {
            this();
        }

        private static int MajorType(CBORObject cBORObject) {
            if (cBORObject.isTagged()) {
                return 6;
            }
            switch (AnonymousClass1.$SwitchMap$com$upokecenter$cbor$CBORType[cBORObject.getType().ordinal()]) {
                case 1:
                    return cBORObject.AsNumber().IsNegative() ? 1 : 0;
                case 2:
                case 3:
                case 4:
                    return 7;
                case 5:
                    return 2;
                case 6:
                    return 3;
                case 7:
                    return 4;
                case 8:
                    return 5;
                default:
                    throw new IllegalStateException();
            }
        }

        @Override // java.util.Comparator
        public int compare(CBORObject cBORObject, CBORObject cBORObject2) {
            byte[] bArrCtapCanonicalEncode;
            byte[] bArrCtapCanonicalEncode2;
            if (cBORObject == null) {
                return cBORObject2 == null ? 0 : -1;
            }
            if (cBORObject2 == null) {
                return 1;
            }
            if (cBORObject == cBORObject2) {
                return 0;
            }
            CBORObject cBORObjectUntag = cBORObject.Untag();
            CBORObject cBORObjectUntag2 = cBORObject2.Untag();
            int iMajorType = MajorType(cBORObjectUntag);
            int iMajorType2 = MajorType(cBORObjectUntag2);
            if (iMajorType != iMajorType2) {
                return iMajorType < iMajorType2 ? -1 : 1;
            }
            if (iMajorType == 2) {
                bArrCtapCanonicalEncode = cBORObjectUntag.GetByteString();
                bArrCtapCanonicalEncode2 = cBORObjectUntag2.GetByteString();
            } else {
                bArrCtapCanonicalEncode = CBORCanonical.CtapCanonicalEncode(cBORObjectUntag);
                bArrCtapCanonicalEncode2 = CBORCanonical.CtapCanonicalEncode(cBORObjectUntag2);
            }
            if (bArrCtapCanonicalEncode.length != bArrCtapCanonicalEncode2.length) {
                return bArrCtapCanonicalEncode.length < bArrCtapCanonicalEncode2.length ? -1 : 1;
            }
            for (int i2 = 0; i2 < bArrCtapCanonicalEncode.length; i2++) {
                byte b2 = bArrCtapCanonicalEncode[i2];
                byte b3 = bArrCtapCanonicalEncode2[i2];
                if (b2 != b3) {
                    return (b2 + 255) - (b2 | 255) < (b3 + 255) - (b3 | 255) ? -1 : 1;
                }
            }
            return 0;
        }
    }

    private CBORCanonical() {
    }

    private static boolean ByteArraysEqual(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private static void CheckDepth(CBORObject cBORObject, int i2) {
        if (cBORObject.getType() == CBORType.Array) {
            for (int i3 = 0; i3 < cBORObject.size(); i3++) {
                if (i2 >= 3 && IsArrayOrMap(cBORObject.get(i3))) {
                    throw new CBORException("Nesting level too deep");
                }
                CheckDepth(cBORObject.get(i3), i2 + 1);
            }
            return;
        }
        if (cBORObject.getType() == CBORType.Map) {
            for (CBORObject cBORObject2 : cBORObject.getKeys()) {
                if (i2 >= 3 && (IsArrayOrMap(cBORObject2) || IsArrayOrMap(cBORObject.get(cBORObject2)))) {
                    throw new CBORException("Nesting level too deep");
                }
                int i4 = i2 + 1;
                CheckDepth(cBORObject2, i4);
                CheckDepth(cBORObject.get(cBORObject2), i4);
            }
        }
    }

    public static byte[] CtapCanonicalEncode(CBORObject cBORObject) {
        return CtapCanonicalEncode(cBORObject, 0);
    }

    private static byte[] CtapCanonicalEncode(CBORObject cBORObject, int i2) throws Throwable {
        CBORObject cBORObjectUntag = cBORObject.Untag();
        CBORType type = cBORObjectUntag.getType();
        try {
            ByteArrayOutputStream byteArrayOutputStream = null;
            byte[] bArr = null;
            ByteArrayOutputStream byteArrayOutputStream2 = null;
            if (type == CBORType.Array) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    try {
                        CBORObject.WriteValue((OutputStream) byteArrayOutputStream3, 4, cBORObjectUntag.size());
                        for (int i3 = 0; i3 < cBORObjectUntag.size(); i3++) {
                            if (i2 >= 3 && IsArrayOrMap(cBORObjectUntag.get(i3))) {
                                throw new CBORException("Nesting level too deep");
                            }
                            byte[] bArrCtapCanonicalEncode = CtapCanonicalEncode(cBORObjectUntag.get(i3), i2 + 1);
                            byteArrayOutputStream3.write(bArrCtapCanonicalEncode, 0, bArrCtapCanonicalEncode.length);
                        }
                        byte[] byteArray = byteArrayOutputStream3.toByteArray();
                        try {
                            byteArrayOutputStream3.close();
                        } catch (IOException unused) {
                        }
                        return byteArray;
                    } catch (Throwable th) {
                        th = th;
                        byteArrayOutputStream = byteArrayOutputStream3;
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                if (type != CBORType.Map) {
                    if (type == CBORType.SimpleValue || type == CBORType.Boolean || type == CBORType.ByteString || type == CBORType.TextString) {
                        return cBORObjectUntag.EncodeToBytes(CBOREncodeOptions.Default);
                    }
                    if (type == CBORType.FloatingPoint) {
                        long jAsDoubleBits = cBORObjectUntag.AsDoubleBits() >> 16;
                        return new byte[]{-5, (byte) ((-1) - (((-1) - (r16 >> 56)) | ((-1) - 255))), (byte) ((-1) - (((-1) - (r16 >> 48)) | ((-1) - 255))), (byte) ((r16 >> 40) & 255), (byte) ((r16 >> 32) & 255), (byte) ((-1) - (((-1) - (r16 >> 24)) | ((-1) - 255))), (byte) ((jAsDoubleBits + 255) - (jAsDoubleBits | 255)), (byte) ((r16 >> 8) & 255), (byte) ((r16 + 255) - (r16 | 255))};
                    }
                    if (type == CBORType.Integer) {
                        return cBORObjectUntag.EncodeToBytes(CBOREncodeOptions.Default);
                    }
                    throw new IllegalArgumentException("Invalid CBOR type.");
                }
                ArrayList arrayList = new ArrayList();
                for (CBORObject cBORObject2 : cBORObjectUntag.getKeys()) {
                    if (i2 >= 3 && (IsArrayOrMap(cBORObject2) || IsArrayOrMap(cBORObjectUntag.get(cBORObject2)))) {
                        throw new CBORException("Nesting level too deep");
                    }
                    int i4 = i2 + 1;
                    CheckDepth(cBORObject2, i4);
                    CheckDepth(cBORObjectUntag.get(cBORObject2), i4);
                    arrayList.add(new AbstractMap.SimpleImmutableEntry(CtapCanonicalEncode(cBORObject2, i4), CtapCanonicalEncode(cBORObjectUntag.get(cBORObject2), i4)));
                }
                Collections.sort(arrayList, ByteComparer);
                try {
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        CBORObject.WriteValue((OutputStream) byteArrayOutputStream4, 5, cBORObjectUntag.size());
                        int i5 = 0;
                        while (i5 < arrayList.size()) {
                            Map.Entry entry = (Map.Entry) arrayList.get(i5);
                            byte[] bArr2 = (byte[]) entry.getKey();
                            if (bArr != null && ByteArraysEqual(bArr2, bArr)) {
                                throw new CBORException("duplicate canonical CBOR key");
                            }
                            byteArrayOutputStream4.write(bArr2, 0, bArr2.length);
                            byte[] bArr3 = (byte[]) entry.getValue();
                            byteArrayOutputStream4.write(bArr3, 0, bArr3.length);
                            i5++;
                            bArr = bArr2;
                        }
                        byte[] byteArray2 = byteArrayOutputStream4.toByteArray();
                        try {
                            byteArrayOutputStream4.close();
                        } catch (IOException unused3) {
                        }
                        return byteArray2;
                    } catch (Throwable th3) {
                        th = th3;
                        byteArrayOutputStream2 = byteArrayOutputStream4;
                        if (byteArrayOutputStream2 != null) {
                            try {
                                byteArrayOutputStream2.close();
                            } catch (IOException unused4) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (IOException e2) {
            throw new IllegalStateException(e2.toString(), e2);
        }
    }

    private static boolean IsArrayOrMap(CBORObject cBORObject) {
        return cBORObject.getType() == CBORType.Array || cBORObject.getType() == CBORType.Map;
    }
}
