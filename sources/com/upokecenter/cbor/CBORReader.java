package com.upokecenter.cbor;

import com.upokecenter.numbers.EInteger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
class CBORReader {
    private static final byte[] EmptyByteArray = new byte[0];
    private int depth;
    private boolean hasSharableObjects;
    private final CBOREncodeOptions options;
    private final InputStream stream;
    private StringRefs stringRefs;

    public CBORReader(InputStream inputStream) {
        this(inputStream, CBOREncodeOptions.Default);
    }

    public CBORReader(InputStream inputStream, CBOREncodeOptions cBOREncodeOptions) {
        this.stream = inputStream;
        this.options = cBOREncodeOptions;
    }

    private void HandleItemTag(long j2) {
        int i2 = j2 >= 257 ? 257 : j2 < 0 ? 0 : (int) j2;
        if (i2 == 25) {
            if (this.stringRefs == null) {
                throw new CBORException("No stringref namespace");
            }
            return;
        }
        if (i2 != 256) {
            if (i2 == 28 || i2 == 29) {
                this.hasSharableObjects = true;
                return;
            }
            return;
        }
        StringRefs stringRefs = this.stringRefs;
        if (stringRefs == null) {
            stringRefs = new StringRefs();
        }
        this.stringRefs = stringRefs;
        stringRefs.Push();
    }

    private CBORObject ObjectFromByteArray(byte[] bArr, int i2) {
        CBORObject cBORObjectFromRaw = CBORObject.FromRaw(bArr);
        StringRefs stringRefs = this.stringRefs;
        if (stringRefs != null) {
            stringRefs.AddStringIfNeeded(cBORObjectFromRaw, i2);
        }
        return cBORObjectFromRaw;
    }

    private CBORObject ObjectFromUtf8Array(byte[] bArr, int i2) {
        CBORObject cBORObjectFromObject = bArr.length == 0 ? CBORObject.FromObject("") : CBORObject.FromRawUtf8(bArr);
        StringRefs stringRefs = this.stringRefs;
        if (stringRefs != null) {
            stringRefs.AddStringIfNeeded(cBORObjectFromObject, i2);
        }
        return cBORObjectFromObject;
    }

    private static byte[] ReadByteData(InputStream inputStream, long j2, OutputStream outputStream) throws Throwable {
        if (j2 == 0) {
            return EmptyByteArray;
        }
        if ((j2 >> 63) != 0 || j2 > 2147483647L) {
            throw new CBORException("Length" + ToUnsignedEInteger(j2) + " is bigger than supported ");
        }
        if (PropertyMap.ExceedsKnownLength(inputStream, j2)) {
            throw new CBORException("Premature end of stream");
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        if (j2 <= 65536) {
            int i2 = (int) j2;
            byte[] bArr = new byte[i2];
            ReadHelper(inputStream, bArr, 0, i2);
            if (outputStream == null) {
                return bArr;
            }
            outputStream.write(bArr, 0, i2);
            return null;
        }
        byte[] bArr2 = new byte[65536];
        int i3 = (int) j2;
        if (outputStream != null) {
            while (i3 > 0) {
                int iMin = Math.min(65536, i3);
                ReadHelper(inputStream, bArr2, 0, iMin);
                outputStream.write(bArr2, 0, iMin);
                i3 -= iMin;
            }
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(65536);
            while (i3 > 0) {
                try {
                    int iMin2 = Math.min(65536, i3);
                    ReadHelper(inputStream, bArr2, 0, iMin2);
                    byteArrayOutputStream2.write(bArr2, 0, iMin2);
                    i3 -= iMin2;
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th;
                }
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            try {
                byteArrayOutputStream2.close();
            } catch (IOException unused2) {
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static long ReadDataLength(InputStream inputStream, int i2, int i3) throws IOException {
        return ReadDataLength(inputStream, i2, i3, true);
    }

    private static long ReadDataLength(InputStream inputStream, int i2, int i3, boolean z2) throws IOException {
        if (i2 < 0) {
            throw new CBORException("Unexpected data encountered");
        }
        if (((i2 >> 5) & 7) != i3) {
            throw new CBORException("Unexpected data encountered");
        }
        int i4 = (-1) - (((-1) - i2) | ((-1) - 31));
        if (i4 < 24) {
            return i4;
        }
        byte[] bArr = new byte[8];
        switch (i4) {
            case 24:
                int i5 = inputStream.read();
                if (i5 < 0) {
                    throw new CBORException("Premature end of data");
                }
                if (z2 || i5 >= 24) {
                    return i5;
                }
                throw new CBORException("Non-shortest CBOR form");
            case 25:
                ReadHelper(inputStream, bArr, 0, 2);
                int i6 = (bArr[0] & 255) << 8;
                byte b2 = bArr[1];
                int i7 = i6 | ((b2 + 255) - (b2 | 255));
                if (z2 || i7 >= 256) {
                    return i7;
                }
                throw new CBORException("Non-shortest CBOR form");
            case 26:
                ReadHelper(inputStream, bArr, 0, 4);
                long j2 = bArr[0];
                long j3 = ((j2 + 255) - (j2 | 255)) << 24;
                long j4 = (((long) bArr[1]) & 255) << 16;
                long j5 = ((j3 + j4) - (j3 & j4)) | (((-1) - (((-1) - ((long) bArr[2])) | ((-1) - 255))) << 8);
                long j6 = (-1) - (((-1) - ((long) bArr[3])) | ((-1) - 255));
                long j7 = (j5 + j6) - (j5 & j6);
                if (z2 || (j7 >> 16) != 0) {
                    return j7;
                }
                throw new CBORException("Non-shortest CBOR form");
            case 27:
                ReadHelper(inputStream, bArr, 0, 8);
                long j8 = (((long) bArr[0]) & 255) << 56;
                long j9 = (((long) bArr[1]) & 255) << 48;
                long j10 = (j8 + j9) - (j8 & j9);
                long j11 = ((-1) - (((-1) - ((long) bArr[2])) | ((-1) - 255))) << 40;
                long j12 = (j10 + j11) - (j10 & j11);
                long j13 = ((-1) - (((-1) - ((long) bArr[3])) | ((-1) - 255))) << 32;
                long j14 = bArr[4];
                long j15 = (-1) - (((-1) - ((-1) - (((-1) - ((j12 + j13) - (j12 & j13))) & ((-1) - (((j14 + 255) - (j14 | 255)) << 24))))) & ((-1) - ((((long) bArr[5]) & 255) << 16)));
                long j16 = ((-1) - (((-1) - ((long) bArr[6])) | ((-1) - 255))) << 8;
                long j17 = (j15 + j16) - (j15 & j16);
                long j18 = bArr[7];
                long j19 = (j18 + 255) - (j18 | 255);
                long j20 = (j17 + j19) - (j17 & j19);
                if (z2 || (j20 >> 32) != 0) {
                    return j20;
                }
                throw new CBORException("Non-shortest CBOR form");
            case 28:
            case 29:
            case 30:
                throw new CBORException("Unexpected data encountered");
            case 31:
                throw new CBORException("Indefinite-length data not allowed here");
            default:
                return i4;
        }
    }

    private static void ReadHelper(InputStream inputStream, byte[] bArr, int i2, int i3) throws IOException {
        while (i3 > 0) {
            int i4 = inputStream.read(bArr, i2, i3);
            if (i4 <= 0) {
                throw new CBORException("Premature end of data");
            }
            if (i4 > i3) {
                throw new CBORException("Internal error");
            }
            i2 += i4;
            i3 -= i4;
        }
        if (i3 != 0) {
            throw new CBORException("Internal error");
        }
    }

    private CBORObject ReadInternal() throws IOException {
        if (this.depth > 500) {
            throw new CBORException("Too deeply nested");
        }
        int i2 = this.stream.read();
        if (i2 >= 0) {
            return ReadForFirstByte(i2);
        }
        throw new CBORException("Premature end of data");
    }

    private CBORObject ReadInternalOrEOF() throws IOException {
        if (this.depth > 500) {
            throw new CBORException("Too deeply nested");
        }
        int i2 = this.stream.read();
        if (i2 < 0) {
            return null;
        }
        return ReadForFirstByte(i2);
    }

    private CBORObject ReadStringArrayMap(int i2, long j2) throws Throwable {
        this.options.getCtap2Canonical();
        CBORObject cBORObject = null;
        long j3 = 0;
        if (i2 == 2 || i2 == 3) {
            if ((j2 >> 31) != 0) {
                throw new CBORException("Length of " + ToUnsignedEInteger(j2).toString() + " is bigger than supported");
            }
            int i3 = (j2 > 2147483647L || (j2 >> 63) != 0) ? Integer.MAX_VALUE : (int) j2;
            byte[] bArrReadByteData = ReadByteData(this.stream, j2, null);
            if (i2 != 3) {
                return ObjectFromByteArray(bArrReadByteData, i3);
            }
            if (CBORUtilities.CheckUtf8(bArrReadByteData)) {
                return ObjectFromUtf8Array(bArrReadByteData, i3);
            }
            throw new CBORException("Invalid UTF-8");
        }
        if (i2 == 4) {
            if (this.options.getCtap2Canonical() && this.depth >= 4) {
                throw new CBORException("Depth too high in canonical CBOR");
            }
            CBORObject cBORObjectNewArray = CBORObject.NewArray();
            if ((j2 >> 31) != 0) {
                throw new CBORException("Length of " + ToUnsignedEInteger(j2).toString() + " is bigger than supported");
            }
            if (PropertyMap.ExceedsKnownLength(this.stream, j2)) {
                throw new CBORException("Remaining data too small for array length");
            }
            this.depth++;
            while (j3 < j2) {
                cBORObjectNewArray.Add(ReadInternal());
                j3++;
            }
            this.depth--;
            return cBORObjectNewArray;
        }
        if (i2 != 5) {
            return null;
        }
        if (this.options.getCtap2Canonical() && this.depth >= 4) {
            throw new CBORException("Depth too high in canonical CBOR");
        }
        CBORObject cBORObjectNewOrderedMap = this.options.getKeepKeyOrder() ? CBORObject.NewOrderedMap() : CBORObject.NewMap();
        if ((j2 >> 31) != 0) {
            throw new CBORException("Length of " + ToUnsignedEInteger(j2).toString() + " is bigger than supported");
        }
        if (PropertyMap.ExceedsKnownLength(this.stream, j2)) {
            throw new CBORException("Remaining data too small for map length");
        }
        Comparator<CBORObject> comparator = CBORCanonical.Comparer;
        while (j3 < j2) {
            this.depth++;
            CBORObject cBORObjectReadInternal = ReadInternal();
            CBORObject cBORObjectReadInternal2 = ReadInternal();
            this.depth--;
            if (this.options.getCtap2Canonical() && cBORObject != null) {
                int iCompare = comparator.compare(cBORObject, cBORObjectReadInternal);
                if (iCompare > 0) {
                    throw new CBORException("Map key not in canonical order");
                }
                if (iCompare == 0) {
                    throw new CBORException("Duplicate map key");
                }
            }
            if (!this.options.getAllowDuplicateKeys() && cBORObjectNewOrderedMap.ContainsKey(cBORObjectReadInternal)) {
                throw new CBORException("Duplicate key already exists");
            }
            cBORObjectNewOrderedMap.set(cBORObjectReadInternal, cBORObjectReadInternal2);
            j3++;
            cBORObject = cBORObjectReadInternal;
        }
        return cBORObjectNewOrderedMap;
    }

    private static CBORObject ResolveSharedRefs(CBORObject cBORObject, SharedRefs sharedRefs) {
        if (cBORObject == null) {
            return null;
        }
        CBORType type = cBORObject.getType();
        if (cBORObject.HasMostOuterTag(29)) {
            CBORObject cBORObjectUntagOne = cBORObject.UntagOne();
            if (cBORObjectUntagOne.isTagged() || cBORObjectUntagOne.getType() != CBORType.Integer || cBORObjectUntagOne.AsNumber().IsNegative()) {
                throw new CBORException("Shared ref index must be an untagged integer 0 or greater");
            }
            return sharedRefs.GetObject(cBORObjectUntagOne.AsEIntegerValue());
        }
        if (cBORObject.HasMostOuterTag(28)) {
            cBORObject = cBORObject.UntagOne();
            sharedRefs.AddObject(cBORObject);
        }
        if (type == CBORType.Map) {
            for (CBORObject cBORObject2 : cBORObject.getKeys()) {
                CBORObject cBORObject3 = cBORObject.get(cBORObject2);
                CBORObject cBORObjectResolveSharedRefs = ResolveSharedRefs(cBORObject3, sharedRefs);
                if (cBORObject3 != cBORObjectResolveSharedRefs) {
                    cBORObject.set(cBORObject2, cBORObjectResolveSharedRefs);
                }
            }
        } else if (type == CBORType.Array) {
            for (int i2 = 0; i2 < cBORObject.size(); i2++) {
                cBORObject.set(i2, ResolveSharedRefs(cBORObject.get(i2), sharedRefs));
            }
        }
        return cBORObject;
    }

    private static EInteger ToUnsignedEInteger(long j2) {
        EInteger eIntegerFromInt64 = EInteger.FromInt64((-1) - (((-1) - Long.MAX_VALUE) | ((-1) - j2)));
        return (j2 >> 63) != 0 ? eIntegerFromInt64.Add(EInteger.FromInt32(1).ShiftLeft(63)) : eIntegerFromInt64;
    }

    public CBORObject Read() throws IOException {
        CBORObject cBORObjectReadInternalOrEOF = this.options.getAllowEmpty() ? ReadInternalOrEOF() : ReadInternal();
        return (this.options.getResolveReferences() && this.hasSharableObjects) ? ResolveSharedRefs(cBORObjectReadInternalOrEOF, new SharedRefs()) : cBORObjectReadInternalOrEOF;
    }

    /* JADX WARN: Code restructure failed: missing block: B:402:0x0214, code lost:
    
        throw new com.upokecenter.cbor.CBORException("Length" + ToUnsignedEInteger(r2) + " is bigger than supported");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.upokecenter.cbor.CBORObject ReadForFirstByte(int r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 841
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.cbor.CBORReader.ReadForFirstByte(int):com.upokecenter.cbor.CBORObject");
    }
}
