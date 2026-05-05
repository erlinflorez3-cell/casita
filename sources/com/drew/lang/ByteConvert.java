package com.drew.lang;

import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes3.dex */
public class ByteConvert {
    public static int toInt32BigEndian(byte[] bArr) {
        int i2 = bArr[0] << Ascii.CAN;
        int i3 = ((i2 + ViewCompat.MEASURED_STATE_MASK) - (i2 | ViewCompat.MEASURED_STATE_MASK)) | ((bArr[1] << 16) & 16711680);
        int i4 = bArr[2] << 8;
        return (-1) - (((-1) - ((-1) - (((-1) - bArr[3]) | ((-1) - 255)))) & ((-1) - (i3 | ((i4 + 65280) - (i4 | 65280)))));
    }

    public static int toInt32LittleEndian(byte[] bArr) {
        int i2 = ((-1) - (((-1) - bArr[0]) | ((-1) - 255))) | ((-1) - (((-1) - (bArr[1] << 8)) | ((-1) - 65280))) | ((-1) - (((-1) - (bArr[2] << 16)) | ((-1) - 16711680)));
        int i3 = bArr[3] << Ascii.CAN;
        return ((i3 + ViewCompat.MEASURED_STATE_MASK) - (i3 | ViewCompat.MEASURED_STATE_MASK)) | i2;
    }
}
