package com.drew.imaging.tiff;

import com.drew.lang.RandomAccessReader;
import com.drew.lang.Rational;
import java.io.IOException;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public class TiffReader {
    private static int calculateTagOffset(int i2, int i3) {
        return i2 + 2 + (i3 * 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0100 A[Catch: all -> 0x01ea, TryCatch #1 {all -> 0x01ea, blocks: (B:71:0x0186, B:49:0x00f8, B:54:0x0109, B:57:0x012a, B:60:0x0133, B:62:0x0138, B:64:0x0141, B:65:0x015c, B:68:0x0163, B:70:0x0177, B:56:0x0113, B:51:0x0100, B:77:0x019d, B:79:0x01a7, B:90:0x01ce, B:92:0x01d4), top: B:110:0x00f8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void processIfd(com.drew.imaging.tiff.TiffHandler r24, com.drew.lang.RandomAccessReader r25, java.util.Set<java.lang.Integer> r26, int r27, int r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.drew.imaging.tiff.TiffReader.processIfd(com.drew.imaging.tiff.TiffHandler, com.drew.lang.RandomAccessReader, java.util.Set, int, int):void");
    }

    private static void processTag(TiffHandler tiffHandler, int i2, int i3, int i4, int i5, RandomAccessReader randomAccessReader) throws IOException {
        int i6 = 0;
        switch (i5) {
            case 1:
                if (i4 != 1) {
                    short[] sArr = new short[i4];
                    while (i6 < i4) {
                        sArr[i6] = randomAccessReader.getUInt8(i3 + i6);
                        i6++;
                    }
                    tiffHandler.setInt8uArray(i2, sArr);
                } else {
                    tiffHandler.setInt8u(i2, randomAccessReader.getUInt8(i3));
                }
                break;
            case 2:
                tiffHandler.setString(i2, randomAccessReader.getNullTerminatedStringValue(i3, i4, null));
                break;
            case 3:
                if (i4 != 1) {
                    int[] iArr = new int[i4];
                    while (i6 < i4) {
                        iArr[i6] = randomAccessReader.getUInt16((i6 * 2) + i3);
                        i6++;
                    }
                    tiffHandler.setInt16uArray(i2, iArr);
                } else {
                    tiffHandler.setInt16u(i2, randomAccessReader.getUInt16(i3));
                }
                break;
            case 4:
                if (i4 != 1) {
                    long[] jArr = new long[i4];
                    while (i6 < i4) {
                        jArr[i6] = randomAccessReader.getUInt32((i6 * 4) + i3);
                        i6++;
                    }
                    tiffHandler.setInt32uArray(i2, jArr);
                } else {
                    tiffHandler.setInt32u(i2, randomAccessReader.getUInt32(i3));
                }
                break;
            case 5:
                if (i4 == 1) {
                    tiffHandler.setRational(i2, new Rational(randomAccessReader.getUInt32(i3), randomAccessReader.getUInt32(i3 + 4)));
                } else if (i4 > 1) {
                    Rational[] rationalArr = new Rational[i4];
                    while (i6 < i4) {
                        int i7 = i6 * 8;
                        rationalArr[i6] = new Rational(randomAccessReader.getUInt32(i3 + i7), randomAccessReader.getUInt32(i3 + 4 + i7));
                        i6++;
                    }
                    tiffHandler.setRationalArray(i2, rationalArr);
                }
                break;
            case 6:
                if (i4 != 1) {
                    byte[] bArr = new byte[i4];
                    while (i6 < i4) {
                        bArr[i6] = randomAccessReader.getInt8(i3 + i6);
                        i6++;
                    }
                    tiffHandler.setInt8sArray(i2, bArr);
                } else {
                    tiffHandler.setInt8s(i2, randomAccessReader.getInt8(i3));
                }
                break;
            case 7:
                tiffHandler.setByteArray(i2, randomAccessReader.getBytes(i3, i4));
                break;
            case 8:
                if (i4 != 1) {
                    short[] sArr2 = new short[i4];
                    while (i6 < i4) {
                        sArr2[i6] = randomAccessReader.getInt16((i6 * 2) + i3);
                        i6++;
                    }
                    tiffHandler.setInt16sArray(i2, sArr2);
                } else {
                    tiffHandler.setInt16s(i2, randomAccessReader.getInt16(i3));
                }
                break;
            case 9:
                if (i4 != 1) {
                    int[] iArr2 = new int[i4];
                    while (i6 < i4) {
                        iArr2[i6] = randomAccessReader.getInt32((i6 * 4) + i3);
                        i6++;
                    }
                    tiffHandler.setInt32sArray(i2, iArr2);
                } else {
                    tiffHandler.setInt32s(i2, randomAccessReader.getInt32(i3));
                }
                break;
            case 10:
                if (i4 == 1) {
                    tiffHandler.setRational(i2, new Rational(randomAccessReader.getInt32(i3), randomAccessReader.getInt32(i3 + 4)));
                } else if (i4 > 1) {
                    Rational[] rationalArr2 = new Rational[i4];
                    while (i6 < i4) {
                        int i8 = i6 * 8;
                        rationalArr2[i6] = new Rational(randomAccessReader.getInt32(i3 + i8), randomAccessReader.getInt32(i3 + 4 + i8));
                        i6++;
                    }
                    tiffHandler.setRationalArray(i2, rationalArr2);
                }
                break;
            case 11:
                if (i4 != 1) {
                    float[] fArr = new float[i4];
                    while (i6 < i4) {
                        fArr[i6] = randomAccessReader.getFloat32((i6 * 4) + i3);
                        i6++;
                    }
                    tiffHandler.setFloatArray(i2, fArr);
                } else {
                    tiffHandler.setFloat(i2, randomAccessReader.getFloat32(i3));
                }
                break;
            case 12:
                if (i4 != 1) {
                    double[] dArr = new double[i4];
                    while (i6 < i4) {
                        dArr[i6] = randomAccessReader.getDouble64((i6 * 8) + i3);
                        i6++;
                    }
                    tiffHandler.setDoubleArray(i2, dArr);
                } else {
                    tiffHandler.setDouble(i2, randomAccessReader.getDouble64(i3));
                }
                break;
            default:
                tiffHandler.error(String.format("Invalid TIFF tag format code %d for tag 0x%04X", Integer.valueOf(i5), Integer.valueOf(i2)));
                break;
        }
    }

    public void processTiff(RandomAccessReader randomAccessReader, TiffHandler tiffHandler, int i2) throws Throwable {
        short int16 = randomAccessReader.getInt16(i2);
        if (int16 == 19789) {
            randomAccessReader.setMotorolaByteOrder(true);
        } else {
            if (int16 != 18761) {
                throw new TiffProcessingException("Unclear distinction between Motorola/Intel byte ordering: " + ((int) int16));
            }
            randomAccessReader.setMotorolaByteOrder(false);
        }
        tiffHandler.setTiffMarker(randomAccessReader.getUInt16(i2 + 2));
        int int32 = randomAccessReader.getInt32(i2 + 4) + i2;
        if (int32 >= randomAccessReader.getLength() - 1) {
            tiffHandler.warn("First IFD offset is beyond the end of the TIFF data segment -- trying default offset");
            int32 = i2 + 8;
        }
        processIfd(tiffHandler, randomAccessReader, new HashSet(), int32, i2);
    }
}
