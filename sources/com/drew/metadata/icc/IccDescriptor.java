package com.drew.metadata.icc;

import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import com.drew.lang.ByteArrayReader;
import com.drew.metadata.TagDescriptor;
import com.dynatrace.android.agent.Global;
import cz.msebera.android.httpclient.protocol.HTTP;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes3.dex */
public class IccDescriptor extends TagDescriptor<IccDirectory> {
    private static final int ICC_TAG_TYPE_CURV = 1668641398;
    private static final int ICC_TAG_TYPE_DESC = 1684370275;
    private static final int ICC_TAG_TYPE_MEAS = 1835360627;
    private static final int ICC_TAG_TYPE_MLUC = 1835824483;
    private static final int ICC_TAG_TYPE_SIG = 1936287520;
    private static final int ICC_TAG_TYPE_TEXT = 1952807028;
    private static final int ICC_TAG_TYPE_XYZ_ARRAY = 1482250784;

    public IccDescriptor(IccDirectory iccDirectory) {
        super(iccDirectory);
    }

    public static String formatDoubleAsString(double d2, int i2, boolean z2) {
        int i3 = i2;
        boolean z3 = true;
        if (i3 < 1) {
            return "" + Math.round(d2);
        }
        long jAbs = Math.abs((long) d2);
        long jRound = (int) Math.round((Math.abs(d2) - jAbs) * Math.pow(10.0d, i3));
        String str = "";
        long j2 = jRound;
        while (i3 > 0) {
            byte bAbs = (byte) Math.abs(j2 % 10);
            j2 /= 10;
            if (str.length() > 0 || z2 || bAbs != 0 || i3 == 1) {
                str = ((int) bAbs) + str;
            }
            i3--;
        }
        long j3 = jAbs + j2;
        if (d2 >= 0.0d || (j3 == 0 && jRound == 0)) {
            z3 = false;
        }
        return (z3 ? Global.HYPHEN : "") + j3 + "." + str;
    }

    private static int getInt32FromString(String str) throws IOException {
        return new ByteArrayReader(str.getBytes()).getInt32(0);
    }

    private String getPlatformDescription() {
        String string = ((IccDirectory) this._directory).getString(40);
        if (string == null) {
            return null;
        }
        try {
            switch (getInt32FromString(string)) {
                case 1095782476:
                    return "Apple Computer, Inc.";
                case 1297303124:
                    return "Microsoft Corporation";
                case 1397180704:
                    return "Silicon Graphics, Inc.";
                case 1398099543:
                    return "Sun Microsystems, Inc.";
                case 1413959252:
                    return "Taligent, Inc.";
                default:
                    return String.format("Unknown (%s)", string);
            }
        } catch (IOException unused) {
            return string;
        }
    }

    private String getProfileClassDescription() {
        String string = ((IccDirectory) this._directory).getString(12);
        if (string == null) {
            return null;
        }
        try {
            switch (getInt32FromString(string)) {
                case 1633842036:
                    return "Abstract";
                case 1818848875:
                    return "DeviceLink";
                case 1835955314:
                    return "Display Device";
                case 1852662636:
                    return "Named Color";
                case 1886549106:
                    return "Output Device";
                case 1935896178:
                    return "Input Device";
                case 1936744803:
                    return "ColorSpace Conversion";
                default:
                    return String.format("Unknown (%s)", string);
            }
        } catch (IOException unused) {
            return string;
        }
    }

    private String getProfileVersionDescription() {
        Integer integer = ((IccDirectory) this._directory).getInteger(8);
        if (integer == null) {
            return null;
        }
        int iIntValue = (integer.intValue() & ViewCompat.MEASURED_STATE_MASK) >> 24;
        int iIntValue2 = ((-1) - (((-1) - integer.intValue()) | ((-1) - 15728640))) >> 20;
        int iIntValue3 = integer.intValue();
        return String.format("%d.%d.%d", Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(((iIntValue3 + 983040) - (iIntValue3 | 983040)) >> 16));
    }

    private String getRenderingIntentDescription() {
        return getIndexedDescription(64, "Perceptual", "Media-Relative Colorimetric", ExifInterface.TAG_SATURATION, "ICC-Absolute Colorimetric");
    }

    private String getTagDataString(int i2) {
        String str;
        String str2;
        try {
            byte[] byteArray = ((IccDirectory) this._directory).getByteArray(i2);
            if (byteArray == null) {
                return ((IccDirectory) this._directory).getString(i2);
            }
            ByteArrayReader byteArrayReader = new ByteArrayReader(byteArray);
            int i3 = 0;
            int int32 = byteArrayReader.getInt32(0);
            switch (int32) {
                case ICC_TAG_TYPE_XYZ_ARRAY /* 1482250784 */:
                    StringBuilder sb = new StringBuilder();
                    DecimalFormat decimalFormat = new DecimalFormat("0.####");
                    int length = (byteArray.length - 8) / 12;
                    while (i3 < length) {
                        int i4 = i3 * 12;
                        float s15Fixed16 = byteArrayReader.getS15Fixed16(i4 + 8);
                        float s15Fixed162 = byteArrayReader.getS15Fixed16(i4 + 12);
                        float s15Fixed163 = byteArrayReader.getS15Fixed16(i4 + 16);
                        if (i3 > 0) {
                            sb.append(", ");
                        }
                        sb.append("(").append(decimalFormat.format(s15Fixed16)).append(", ").append(decimalFormat.format(s15Fixed162)).append(", ").append(decimalFormat.format(s15Fixed163)).append(")");
                        i3++;
                    }
                    return sb.toString();
                case ICC_TAG_TYPE_CURV /* 1668641398 */:
                    int int322 = byteArrayReader.getInt32(8);
                    StringBuilder sb2 = new StringBuilder();
                    for (int i5 = 0; i5 < int322; i5++) {
                        if (i5 != 0) {
                            sb2.append(", ");
                        }
                        sb2.append(formatDoubleAsString(((double) byteArrayReader.getUInt16((i5 * 2) + 12)) / 65535.0d, 7, false));
                    }
                    return sb2.toString();
                case 1684370275:
                    return new String(byteArray, 12, byteArrayReader.getInt32(8) - 1);
                case 1835360627:
                    int int323 = byteArrayReader.getInt32(8);
                    float s15Fixed164 = byteArrayReader.getS15Fixed16(12);
                    float s15Fixed165 = byteArrayReader.getS15Fixed16(16);
                    float s15Fixed166 = byteArrayReader.getS15Fixed16(20);
                    int int324 = byteArrayReader.getInt32(24);
                    float s15Fixed167 = byteArrayReader.getS15Fixed16(28);
                    int int325 = byteArrayReader.getInt32(32);
                    String str3 = int323 != 0 ? int323 != 1 ? int323 != 2 ? String.format("Unknown %d", Integer.valueOf(int323)) : "1964 10°" : "1931 2°" : "Unknown";
                    String str4 = int324 != 0 ? int324 != 1 ? int324 != 2 ? String.format("Unknown %d", Integer.valueOf(int323)) : "0/d or d/0" : "0/45 or 45/0" : "Unknown";
                    switch (int325) {
                        case 0:
                            str2 = "unknown";
                            break;
                        case 1:
                            str2 = "D50";
                            break;
                        case 2:
                            str2 = "D65";
                            break;
                        case 3:
                            str2 = "D93";
                            break;
                        case 4:
                            str2 = "F2";
                            break;
                        case 5:
                            str2 = "D55";
                            break;
                        case 6:
                            str2 = ExifInterface.GPS_MEASUREMENT_IN_PROGRESS;
                            break;
                        case 7:
                            str2 = "Equi-Power (E)";
                            break;
                        case 8:
                            str2 = "F8";
                            break;
                        default:
                            str2 = String.format("Unknown %d", Integer.valueOf(int325));
                            break;
                    }
                    DecimalFormat decimalFormat2 = new DecimalFormat("0.###");
                    return String.format("%s Observer, Backing (%s, %s, %s), Geometry %s, Flare %d%%, Illuminant %s", str3, decimalFormat2.format(s15Fixed164), decimalFormat2.format(s15Fixed165), decimalFormat2.format(s15Fixed166), str4, Integer.valueOf(Math.round(s15Fixed167 * 100.0f)), str2);
                case ICC_TAG_TYPE_MLUC /* 1835824483 */:
                    int int326 = byteArrayReader.getInt32(8);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(int326);
                    while (i3 < int326) {
                        int i6 = i3 * 12;
                        String stringFromInt32 = IccReader.getStringFromInt32(byteArrayReader.getInt32(i6 + 16));
                        int int327 = byteArrayReader.getInt32(i6 + 20);
                        int int328 = byteArrayReader.getInt32(i6 + 24);
                        try {
                            str = new String(byteArray, int328, int327, "UTF-16BE");
                        } catch (UnsupportedEncodingException unused) {
                            str = new String(byteArray, int328, int327);
                        }
                        sb3.append(Global.BLANK).append(stringFromInt32).append("(").append(str).append(")");
                        i3++;
                    }
                    return sb3.toString();
                case ICC_TAG_TYPE_SIG /* 1936287520 */:
                    return IccReader.getStringFromInt32(byteArrayReader.getInt32(8));
                case ICC_TAG_TYPE_TEXT /* 1952807028 */:
                    try {
                        return new String(byteArray, 8, byteArray.length - 9, HTTP.ASCII);
                    } catch (UnsupportedEncodingException unused2) {
                        return new String(byteArray, 8, byteArray.length - 9);
                    }
                default:
                    return String.format("%s (0x%08X): %d bytes", IccReader.getStringFromInt32(int32), Integer.valueOf(int32), Integer.valueOf(byteArray.length));
            }
        } catch (IOException unused3) {
            return null;
        }
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        return i2 != 8 ? i2 != 12 ? i2 != 40 ? i2 != 64 ? (i2 <= 538976288 || i2 >= 2054847098) ? super.getDescription(i2) : getTagDataString(i2) : getRenderingIntentDescription() : getPlatformDescription() : getProfileClassDescription() : getProfileVersionDescription();
    }
}
