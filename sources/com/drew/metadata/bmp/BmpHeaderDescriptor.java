package com.drew.metadata.bmp;

import com.drew.metadata.TagDescriptor;
import com.drew.metadata.bmp.BmpHeaderDirectory;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes3.dex */
public class BmpHeaderDescriptor extends TagDescriptor<BmpHeaderDirectory> {
    public BmpHeaderDescriptor(BmpHeaderDirectory bmpHeaderDirectory) {
        super(bmpHeaderDirectory);
    }

    public static String formatFixed1616(int i2) {
        return formatFixed1616(((long) i2) & 4294967295L);
    }

    public static String formatFixed1616(long j2) {
        return new DecimalFormat("0.###").format(Double.valueOf(j2 / 65536.0d));
    }

    public static String formatFixed1616(Integer num) {
        if (num == null) {
            return null;
        }
        return formatFixed1616(((long) num.intValue()) & 4294967295L);
    }

    public static String formatFixed1616(Long l2) {
        if (l2 == null) {
            return null;
        }
        return formatFixed1616(l2.longValue());
    }

    public static String formatHex(int i2, int i3) {
        return formatHex((-1) - (((-1) - ((long) i2)) | ((-1) - 4294967295L)), i3);
    }

    public static String formatHex(long j2, int i2) {
        return String.format("0x%0" + i2 + "X", Long.valueOf(j2));
    }

    public static String formatHex(Integer num, int i2) {
        if (num == null) {
            return null;
        }
        long jIntValue = num.intValue();
        return formatHex((jIntValue + 4294967295L) - (jIntValue | 4294967295L), i2);
    }

    public static String formatHex(Long l2, int i2) {
        if (l2 == null) {
            return null;
        }
        return formatHex(l2.longValue(), i2);
    }

    public String getBitmapTypeDescription() {
        BmpHeaderDirectory.BitmapType bitmapType = ((BmpHeaderDirectory) this._directory).getBitmapType();
        if (bitmapType == null) {
            return null;
        }
        return bitmapType.toString();
    }

    public String getColorEncodingDescription() {
        BmpHeaderDirectory.ColorEncoding colorEncoding = ((BmpHeaderDirectory) this._directory).getColorEncoding();
        if (colorEncoding == null) {
            return null;
        }
        return colorEncoding.toString();
    }

    public String getColorSpaceTypeDescription() {
        BmpHeaderDirectory.ColorSpaceType colorSpaceType = ((BmpHeaderDirectory) this._directory).getColorSpaceType();
        if (colorSpaceType == null) {
            return null;
        }
        return colorSpaceType.toString();
    }

    public String getCompressionDescription() {
        BmpHeaderDirectory.Compression compression = ((BmpHeaderDirectory) this._directory).getCompression();
        if (compression != null) {
            return compression.toString();
        }
        Integer integer = ((BmpHeaderDirectory) this._directory).getInteger(5);
        if (integer == null) {
            return null;
        }
        return "Illegal value 0x" + Integer.toHexString(integer.intValue());
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        if (i2 == -2) {
            return getBitmapTypeDescription();
        }
        if (i2 == 5) {
            return getCompressionDescription();
        }
        switch (i2) {
            case 10:
                return getRenderingDescription();
            case 11:
                return getColorEncodingDescription();
            case 12:
            case 13:
            case 14:
            case 15:
                return formatHex(((BmpHeaderDirectory) this._directory).getLongObject(i2), 8);
            case 16:
                return getColorSpaceTypeDescription();
            case 17:
            case 18:
            case 19:
                return formatFixed1616(((BmpHeaderDirectory) this._directory).getLongObject(i2));
            case 20:
                return getRenderingIntentDescription();
            default:
                return super.getDescription(i2);
        }
    }

    public String getRenderingDescription() {
        BmpHeaderDirectory.RenderingHalftoningAlgorithm rendering = ((BmpHeaderDirectory) this._directory).getRendering();
        if (rendering == null) {
            return null;
        }
        return rendering.toString();
    }

    public String getRenderingIntentDescription() {
        BmpHeaderDirectory.RenderingIntent renderingIntent = ((BmpHeaderDirectory) this._directory).getRenderingIntent();
        if (renderingIntent == null) {
            return null;
        }
        return renderingIntent.toString();
    }
}
