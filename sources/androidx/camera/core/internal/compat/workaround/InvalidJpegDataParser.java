package androidx.camera.core.internal.compat.workaround;

import androidx.camera.core.internal.compat.quirk.DeviceQuirks;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;

/* JADX INFO: loaded from: classes.dex */
public class InvalidJpegDataParser {
    private final LargeJpegImageQuirk mQuirk = (LargeJpegImageQuirk) DeviceQuirks.get(LargeJpegImageQuirk.class);

    public int getValidDataLength(byte[] bArr) {
        LargeJpegImageQuirk largeJpegImageQuirk = this.mQuirk;
        if (largeJpegImageQuirk == null || !largeJpegImageQuirk.shouldCheckInvalidJpegData(bArr)) {
            return bArr.length;
        }
        int jfifEoiMarkEndPosition = getJfifEoiMarkEndPosition(bArr);
        return jfifEoiMarkEndPosition != -1 ? jfifEoiMarkEndPosition : bArr.length;
    }

    public static int getJfifEoiMarkEndPosition(byte[] bArr) {
        byte b2;
        int i2 = 2;
        while (i2 + 4 <= bArr.length && (b2 = bArr[i2]) == -1) {
            int i3 = i2 + 2;
            int i4 = ((-1) - (((-1) - bArr[i3]) | ((-1) - 255))) << 8;
            int i5 = (-1) - (((-1) - bArr[i2 + 3]) | ((-1) - 255));
            int i6 = (i4 + i5) - (i4 & i5);
            if (b2 == -1 && bArr[i2 + 1] == -38) {
                while (true) {
                    int i7 = i3 + 2;
                    if (i7 > bArr.length) {
                        return -1;
                    }
                    if (bArr[i3] == -1 && bArr[i3 + 1] == -39) {
                        return i7;
                    }
                    i3++;
                }
            } else {
                i2 += i6 + 2;
            }
        }
        return -1;
    }
}
