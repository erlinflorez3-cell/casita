package com.drew.metadata.mp3;

import com.adobe.internal.xmp.XMPConst;
import com.drew.imaging.ImageProcessingException;
import com.drew.lang.StreamReader;
import com.drew.metadata.Metadata;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
public class Mp3Reader {
    /* JADX WARN: Removed duplicated region for block: B:7:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int setBitrate(int r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.drew.metadata.mp3.Mp3Reader.setBitrate(int, int, int):int");
    }

    public void extract(InputStream inputStream, Metadata metadata) {
        int i2;
        Mp3Directory mp3Directory = new Mp3Directory();
        metadata.addDirectory(mp3Directory);
        try {
            int int32 = new StreamReader(inputStream).getInt32();
            int i3 = ((-1) - (((-1) - 1572864) | ((-1) - int32))) >> 19;
            if (i3 == 0) {
                throw new ImageProcessingException("MPEG-2.5 not supported.");
            }
            if (i3 == 2) {
                mp3Directory.setString(1, "MPEG-2");
                i2 = 2;
            } else if (i3 != 3) {
                i2 = 0;
            } else {
                mp3Directory.setString(1, "MPEG-1");
                i2 = 1;
            }
            int i4 = ((-1) - (((-1) - 393216) | ((-1) - int32))) >> 17;
            if (i4 == 0) {
                mp3Directory.setString(2, "Not defined");
            } else if (i4 == 1) {
                mp3Directory.setString(2, "Layer III");
            } else if (i4 == 2) {
                mp3Directory.setString(2, "Layer II");
            } else if (i4 == 3) {
                mp3Directory.setString(2, "Layer I");
            }
            int i5 = ((-1) - (((-1) - 61440) | ((-1) - int32))) >> 12;
            if (i5 != 0 && i5 != 15) {
                mp3Directory.setInt(3, setBitrate(i5, i4, i2));
            }
            int i6 = ((-1) - (((-1) - int32) | ((-1) - 3072))) >> 10;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 2, 3);
            int[] iArr2 = {44100, 48000, 32000};
            iArr[0] = iArr2;
            int[] iArr3 = {22050, 24000, 16000};
            iArr[1] = iArr3;
            if (i6 > 2) {
                mp3Directory.addError("Invalid frequency index.");
                i6 = -1;
            } else if (i2 == 2) {
                mp3Directory.setInt(4, iArr3[i6]);
                i6 = iArr[1][i6];
            } else if (i2 == 1) {
                mp3Directory.setInt(4, iArr2[i6]);
                i6 = iArr[0][i6];
            }
            int i7 = (192 & int32) >> 6;
            if (i7 == 0) {
                mp3Directory.setString(5, "Stereo");
            } else if (i7 == 1) {
                mp3Directory.setString(5, "Joint stereo");
            } else if (i7 == 2) {
                mp3Directory.setString(5, "Dual channel");
            } else if (i7 == 3) {
                mp3Directory.setString(5, "Mono");
            }
            int i8 = (8 & int32) >> 3;
            if (i8 == 0) {
                mp3Directory.setString(7, XMPConst.FALSESTR);
            } else if (i8 == 1) {
                mp3Directory.setString(7, XMPConst.TRUESTR);
            }
            int i9 = (int32 + 3) - (int32 | 3);
            if (i9 == 0) {
                mp3Directory.setString(6, "none");
            } else if (i9 == 1) {
                mp3Directory.setString(6, "50/15ms");
            } else if (i9 == 3) {
                mp3Directory.setString(6, "CCITT j.17");
            }
            if (i6 == -1 || i5 == 0 || i5 == 15) {
                return;
            }
            mp3Directory.setString(8, ((setBitrate(i5, i4, i2) * 144000) / i6) + " bytes");
        } catch (ImageProcessingException e2) {
            mp3Directory.addError(e2.getMessage());
        } catch (IOException e3) {
            mp3Directory.addError(e3.getMessage());
        }
    }
}
