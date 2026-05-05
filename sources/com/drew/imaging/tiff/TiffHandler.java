package com.drew.imaging.tiff;

import com.drew.lang.RandomAccessReader;
import com.drew.lang.Rational;
import com.drew.metadata.StringValue;
import java.io.IOException;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public interface TiffHandler {
    boolean customProcessTag(int i2, Set<Integer> set, int i3, RandomAccessReader randomAccessReader, int i4, int i5) throws IOException;

    void endingIFD();

    void error(String str);

    boolean hasFollowerIfd();

    void setByteArray(int i2, byte[] bArr);

    void setDouble(int i2, double d2);

    void setDoubleArray(int i2, double[] dArr);

    void setFloat(int i2, float f2);

    void setFloatArray(int i2, float[] fArr);

    void setInt16s(int i2, int i3);

    void setInt16sArray(int i2, short[] sArr);

    void setInt16u(int i2, int i3);

    void setInt16uArray(int i2, int[] iArr);

    void setInt32s(int i2, int i3);

    void setInt32sArray(int i2, int[] iArr);

    void setInt32u(int i2, long j2);

    void setInt32uArray(int i2, long[] jArr);

    void setInt8s(int i2, byte b2);

    void setInt8sArray(int i2, byte[] bArr);

    void setInt8u(int i2, short s2);

    void setInt8uArray(int i2, short[] sArr);

    void setRational(int i2, Rational rational);

    void setRationalArray(int i2, Rational[] rationalArr);

    void setString(int i2, StringValue stringValue);

    void setTiffMarker(int i2) throws TiffProcessingException;

    Long tryCustomProcessFormat(int i2, int i3, long j2);

    boolean tryEnterSubIfd(int i2);

    void warn(String str);
}
