package com.drew.metadata.photoshop;

import com.drew.lang.ByteArrayReader;
import com.drew.lang.Charsets;
import com.drew.metadata.TagDescriptor;
import com.google.android.material.timepicker.TimeModel;
import cz.msebera.android.httpclient.protocol.HTTP;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class PhotoshopDescriptor extends TagDescriptor<PhotoshopDirectory> {
    public PhotoshopDescriptor(PhotoshopDirectory photoshopDirectory) {
        super(photoshopDirectory);
    }

    private String get32BitNumberString(int i2) {
        byte[] byteArray = ((PhotoshopDirectory) this._directory).getByteArray(i2);
        if (byteArray == null) {
            return null;
        }
        try {
            return String.format(TimeModel.NUMBER_FORMAT, Integer.valueOf(new ByteArrayReader(byteArray).getInt32(0)));
        } catch (IOException unused) {
            return null;
        }
    }

    private String getBinaryDataString(int i2) {
        byte[] byteArray = ((PhotoshopDirectory) this._directory).getByteArray(i2);
        if (byteArray == null) {
            return null;
        }
        return String.format("%d bytes binary data", Integer.valueOf(byteArray.length));
    }

    private String getBooleanString(int i2) {
        byte[] byteArray = ((PhotoshopDirectory) this._directory).getByteArray(i2);
        if (byteArray == null || byteArray.length == 0) {
            return null;
        }
        return byteArray[0] == 0 ? "No" : "Yes";
    }

    private String getSimpleString(int i2) {
        byte[] byteArray = ((PhotoshopDirectory) this._directory).getByteArray(i2);
        if (byteArray == null) {
            return null;
        }
        return new String(byteArray);
    }

    public String getClippingPathNameString(int i2) {
        try {
            byte[] byteArray = ((PhotoshopDirectory) this._directory).getByteArray(i2);
            if (byteArray == null) {
                return null;
            }
            ByteArrayReader byteArrayReader = new ByteArrayReader(byteArray);
            return new String(byteArrayReader.getBytes(1, byteArrayReader.getByte(0)), "UTF-8");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        if (i2 != 1002) {
            if (i2 == 1005) {
                return getResolutionInfoDescription();
            }
            if (i2 == 1028) {
                return getBinaryDataString(i2);
            }
            if (i2 == 1030) {
                return getJpegQualityString();
            }
            if (i2 != 1044 && i2 != 1054) {
                if (i2 == 1057) {
                    return getVersionDescription();
                }
                if (i2 == 1062) {
                    return getPrintScaleDescription();
                }
                if (i2 == 1064) {
                    return getPixelAspectRatioString();
                }
                if (i2 == 2999) {
                    return getClippingPathNameString(i2);
                }
                if (i2 != 1049) {
                    if (i2 == 1050) {
                        return getSlicesDescription();
                    }
                    switch (i2) {
                        case PhotoshopDirectory.TAG_THUMBNAIL_OLD /* 1033 */:
                        case PhotoshopDirectory.TAG_THUMBNAIL /* 1036 */:
                            return getThumbnailDescription(i2);
                        case PhotoshopDirectory.TAG_COPYRIGHT /* 1034 */:
                            return getBooleanString(i2);
                        case PhotoshopDirectory.TAG_URL /* 1035 */:
                            break;
                        case 1037:
                            break;
                        default:
                            return (i2 < 2000 || i2 > 2998) ? super.getDescription(i2) : getPathString(i2);
                    }
                }
            }
            return get32BitNumberString(i2);
        }
        return getSimpleString(i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getJpegQualityString() {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.drew.metadata.photoshop.PhotoshopDescriptor.getJpegQualityString():java.lang.String");
    }

    public String getPathString(int i2) {
        String str = null;
        try {
            byte[] byteArray = ((PhotoshopDirectory) this._directory).getByteArray(i2);
            if (byteArray == null) {
                return null;
            }
            ByteArrayReader byteArrayReader = new ByteArrayReader(byteArray);
            short s2 = 1;
            int length = ((int) ((byteArrayReader.getLength() - ((long) byteArrayReader.getByte(((int) byteArrayReader.getLength()) - 1))) - 1)) / 26;
            Subpath subpath = new Subpath();
            Subpath subpath2 = new Subpath();
            ArrayList<Subpath> arrayList = new ArrayList();
            int i3 = 0;
            while (i3 < length) {
                int i4 = i3 * 26;
                try {
                    short int16 = byteArrayReader.getInt16(i4);
                    if (int16 != 0) {
                        if (int16 != s2) {
                            if (int16 == 2) {
                                s2 = 1;
                            } else if (int16 != 3) {
                                short s3 = 4;
                                if (int16 != 4) {
                                    if (int16 == 5) {
                                        s3 = 4;
                                    } else if (int16 == 8) {
                                        str = byteArrayReader.getInt16(i4 + 2) == 1 ? "with all pixels" : "without all pixels";
                                    }
                                }
                                Knot knot = int16 == s3 ? new Knot("Linked") : new Knot("Unlinked");
                                for (int i5 = 0; i5 < 6; i5++) {
                                    int i6 = i5 * 4;
                                    knot.setPoint(i5, ((double) byteArrayReader.getInt8(i6 + 2 + i4)) + (((double) byteArrayReader.getInt24((i6 + 3) + i4)) / Math.pow(2.0d, 24.0d)));
                                }
                                subpath2.add(knot);
                            } else {
                                if (subpath2.size() != 0) {
                                    arrayList.add(subpath2);
                                }
                                subpath2 = new Subpath("Open Subpath");
                            }
                        }
                        Knot knot2 = int16 == s2 ? new Knot("Linked") : new Knot("Unlinked");
                        for (int i7 = 0; i7 < 6; i7++) {
                            int i8 = i7 * 4;
                            knot2.setPoint(i7, ((double) byteArrayReader.getInt8(i8 + 2 + i4)) + (((double) byteArrayReader.getInt24((i8 + 3) + i4)) / Math.pow(2.0d, 24.0d)));
                        }
                        subpath.add(knot2);
                    } else {
                        if (subpath.size() != 0) {
                            arrayList.add(subpath);
                        }
                        subpath = new Subpath("Closed Subpath");
                    }
                    i3++;
                    s2 = 1;
                } catch (Exception unused) {
                    return null;
                }
            }
            if (subpath.size() != 0) {
                arrayList.add(subpath);
            }
            if (subpath2.size() != 0) {
                arrayList.add(subpath2);
            }
            byte b2 = byteArrayReader.getByte(((int) byteArrayReader.getLength()) - 1);
            String string = byteArrayReader.getString((((int) byteArrayReader.getLength()) - b2) - 1, b2, Charsets.ASCII);
            StringBuilder sb = new StringBuilder();
            sb.append('\"').append(string).append('\"').append(" having ");
            if (str != null) {
                sb.append("initial fill rule \"").append(str).append("\" and ");
            }
            sb.append(arrayList.size()).append(arrayList.size() == 1 ? " subpath:" : " subpaths:");
            for (Subpath subpath3 : arrayList) {
                sb.append("\n- ").append(subpath3.getType()).append(" with ").append(arrayList.size()).append(arrayList.size() == 1 ? " knot:" : " knots:");
                for (Knot knot3 : subpath3.getKnots()) {
                    sb.append("\n  - ").append(knot3.getType());
                    sb.append(" (").append(knot3.getPoint(0)).append(",").append(knot3.getPoint(1)).append(")");
                    sb.append(" (").append(knot3.getPoint(2)).append(",").append(knot3.getPoint(3)).append(")");
                    sb.append(" (").append(knot3.getPoint(4)).append(",").append(knot3.getPoint(5)).append(")");
                }
            }
            return sb.toString();
        } catch (Exception unused2) {
            return str;
        }
    }

    public String getPixelAspectRatioString() {
        try {
            byte[] byteArray = ((PhotoshopDirectory) this._directory).getByteArray(PhotoshopDirectory.TAG_PIXEL_ASPECT_RATIO);
            if (byteArray == null) {
                return null;
            }
            return Double.toString(new ByteArrayReader(byteArray).getDouble64(4));
        } catch (Exception unused) {
            return null;
        }
    }

    public String getPrintScaleDescription() {
        try {
            byte[] byteArray = ((PhotoshopDirectory) this._directory).getByteArray(PhotoshopDirectory.TAG_PRINT_SCALE);
            if (byteArray == null) {
                return null;
            }
            ByteArrayReader byteArrayReader = new ByteArrayReader(byteArray);
            int int32 = byteArrayReader.getInt32(0);
            float float32 = byteArrayReader.getFloat32(2);
            float float322 = byteArrayReader.getFloat32(6);
            float float323 = byteArrayReader.getFloat32(10);
            return int32 != 0 ? int32 != 1 ? int32 != 2 ? String.format("Unknown %04X, X:%s Y:%s, Scale:%s", Integer.valueOf(int32), Float.valueOf(float32), Float.valueOf(float322), Float.valueOf(float323)) : String.format("User defined, X:%s Y:%s, Scale:%s", Float.valueOf(float32), Float.valueOf(float322), Float.valueOf(float323)) : "Size to fit" : "Centered, Scale " + float323;
        } catch (Exception unused) {
            return null;
        }
    }

    public String getResolutionInfoDescription() {
        try {
            byte[] byteArray = ((PhotoshopDirectory) this._directory).getByteArray(1005);
            if (byteArray == null) {
                return null;
            }
            ByteArrayReader byteArrayReader = new ByteArrayReader(byteArray);
            float s15Fixed16 = byteArrayReader.getS15Fixed16(0);
            float s15Fixed162 = byteArrayReader.getS15Fixed16(8);
            DecimalFormat decimalFormat = new DecimalFormat("0.##");
            return decimalFormat.format(s15Fixed16) + "x" + decimalFormat.format(s15Fixed162) + " DPI";
        } catch (Exception unused) {
            return null;
        }
    }

    public String getSlicesDescription() {
        try {
            byte[] byteArray = ((PhotoshopDirectory) this._directory).getByteArray(PhotoshopDirectory.TAG_SLICES);
            if (byteArray == null) {
                return null;
            }
            ByteArrayReader byteArrayReader = new ByteArrayReader(byteArray);
            int int32 = byteArrayReader.getInt32(20) * 2;
            return String.format("%s (%d,%d,%d,%d) %d Slices", byteArrayReader.getString(24, int32, HTTP.UTF_16), Integer.valueOf(byteArrayReader.getInt32(4)), Integer.valueOf(byteArrayReader.getInt32(8)), Integer.valueOf(byteArrayReader.getInt32(12)), Integer.valueOf(byteArrayReader.getInt32(16)), Integer.valueOf(byteArrayReader.getInt32(int32 + 24)));
        } catch (IOException unused) {
            return null;
        }
    }

    public String getThumbnailDescription(int i2) {
        try {
            byte[] byteArray = ((PhotoshopDirectory) this._directory).getByteArray(i2);
            if (byteArray == null) {
                return null;
            }
            ByteArrayReader byteArrayReader = new ByteArrayReader(byteArray);
            int int32 = byteArrayReader.getInt32(0);
            int int322 = byteArrayReader.getInt32(4);
            int int323 = byteArrayReader.getInt32(8);
            int int324 = byteArrayReader.getInt32(16);
            int int325 = byteArrayReader.getInt32(20);
            return String.format("%s, %dx%d, Decomp %d bytes, %d bpp, %d bytes", int32 == 1 ? "JpegRGB" : "RawRGB", Integer.valueOf(int322), Integer.valueOf(int323), Integer.valueOf(int324), Integer.valueOf(byteArrayReader.getInt32(24)), Integer.valueOf(int325));
        } catch (IOException unused) {
            return null;
        }
    }

    public String getVersionDescription() {
        try {
            byte[] byteArray = ((PhotoshopDirectory) this._directory).getByteArray(PhotoshopDirectory.TAG_VERSION);
            if (byteArray == null) {
                return null;
            }
            ByteArrayReader byteArrayReader = new ByteArrayReader(byteArray);
            int int32 = byteArrayReader.getInt32(0);
            int int322 = byteArrayReader.getInt32(5) * 2;
            String string = byteArrayReader.getString(9, int322, HTTP.UTF_16);
            int int323 = byteArrayReader.getInt32(9 + int322);
            int i2 = int322 + 13;
            int i3 = int323 * 2;
            return String.format("%d (%s, %s) %d", Integer.valueOf(int32), string, byteArrayReader.getString(i2, i3, HTTP.UTF_16), Integer.valueOf(byteArrayReader.getInt32(i2 + i3)));
        } catch (IOException unused) {
            return null;
        }
    }
}
