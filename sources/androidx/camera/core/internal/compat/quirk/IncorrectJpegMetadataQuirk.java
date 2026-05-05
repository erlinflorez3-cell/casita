package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.Quirk;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class IncorrectJpegMetadataQuirk implements Quirk {
    private static final Set<String> SAMSUNG_DEVICES = new HashSet(Arrays.asList("A24"));

    static boolean load() {
        return isSamsungProblematicDevice();
    }

    private static boolean isSamsungProblematicDevice() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && SAMSUNG_DEVICES.contains(Build.DEVICE.toUpperCase(Locale.US));
    }

    public byte[] jpegImageToJpegByteArray(ImageProxy imageProxy) {
        int iFindSecondFfd8Position = 0;
        ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
        byte[] bArr = new byte[buffer.capacity()];
        buffer.rewind();
        buffer.get(bArr);
        if (!canParseSosMarker(bArr) && (iFindSecondFfd8Position = findSecondFfd8Position(bArr)) == -1) {
            return bArr;
        }
        return Arrays.copyOfRange(bArr, iFindSecondFfd8Position, buffer.limit());
    }

    private boolean canParseSosMarker(byte[] bArr) {
        byte b2;
        int i2 = 2;
        while (i2 + 4 <= bArr.length && (b2 = bArr[i2]) == -1) {
            if (b2 == -1 && bArr[i2 + 1] == -38) {
                return true;
            }
            byte b3 = bArr[i2 + 2];
            i2 += ((-1) - (((-1) - (((b3 + 255) - (b3 | 255)) << 8)) & ((-1) - ((-1) - (((-1) - bArr[i2 + 3]) | ((-1) - 255)))))) + 2;
        }
        return false;
    }

    private int findSecondFfd8Position(byte[] bArr) {
        int i2 = 2;
        while (true) {
            int i3 = i2 + 1;
            if (i3 > bArr.length) {
                return -1;
            }
            if (bArr[i2] == -1 && bArr[i3] == -40) {
                return i2;
            }
            i2 = i3;
        }
    }
}
