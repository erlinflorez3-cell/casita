package com.horcrux.svg;

import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.SVGLength;
import io.sentry.ProfilingTraceData;

/* JADX INFO: loaded from: classes7.dex */
class PropHelper {
    private static final int inputMatrixDataSize = 6;

    /* JADX INFO: renamed from: com.horcrux.svg.PropHelper$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$SVGLength$UnitType;

        static {
            int[] iArr = new int[SVGLength.UnitType.values().length];
            $SwitchMap$com$horcrux$svg$SVGLength$UnitType = iArr;
            try {
                iArr[SVGLength.UnitType.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLength$UnitType[SVGLength.UnitType.PX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLength$UnitType[SVGLength.UnitType.PERCENTAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLength$UnitType[SVGLength.UnitType.EMS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLength$UnitType[SVGLength.UnitType.EXS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLength$UnitType[SVGLength.UnitType.CM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLength$UnitType[SVGLength.UnitType.MM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLength$UnitType[SVGLength.UnitType.IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLength$UnitType[SVGLength.UnitType.PT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLength$UnitType[SVGLength.UnitType.PC.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLength$UnitType[SVGLength.UnitType.UNKNOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    PropHelper() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static double fromRelative(SVGLength sVGLength, double d2, double d3, double d4, double d5) {
        double d6;
        if (sVGLength == null) {
            return d3;
        }
        SVGLength.UnitType unitType = sVGLength.unit;
        double d7 = sVGLength.value;
        switch (AnonymousClass1.$SwitchMap$com$horcrux$svg$SVGLength$UnitType[unitType.ordinal()]) {
            case 1:
            case 2:
                d5 = 1.0d;
                d7 *= d5;
                d6 = d7 * d4;
                break;
            case 3:
                d6 = (d7 / 100.0d) * d2;
                break;
            case 4:
                d7 *= d5;
                d6 = d7 * d4;
                break;
            case 5:
                d5 /= 2.0d;
                d7 *= d5;
                d6 = d7 * d4;
                break;
            case 6:
                d5 = 35.43307d;
                d7 *= d5;
                d6 = d7 * d4;
                break;
            case 7:
                d5 = 3.543307d;
                d7 *= d5;
                d6 = d7 * d4;
                break;
            case 8:
                d5 = 90.0d;
                d7 *= d5;
                d6 = d7 * d4;
                break;
            case 9:
                d5 = 1.25d;
                d7 *= d5;
                d6 = d7 * d4;
                break;
            case 10:
                d5 = 15.0d;
                d7 *= d5;
                d6 = d7 * d4;
                break;
            default:
                d6 = d7 * d4;
                break;
        }
        return d6 + d3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static double fromRelative(String str, double d2, double d3, double d4) {
        double dDoubleValue;
        String strTrim = str.trim();
        int length = strTrim.length();
        int i2 = length - 1;
        if (length == 0 || strTrim.equals(ProfilingTraceData.TRUNCATION_REASON_NORMAL)) {
            return 0.0d;
        }
        if (strTrim.codePointAt(i2) == 37) {
            return (Double.valueOf(strTrim.substring(0, i2)).doubleValue() / 100.0d) * d2;
        }
        int i3 = length - 2;
        if (i3 > 0) {
            String strSubstring = strTrim.substring(i3);
            strSubstring.hashCode();
            switch (strSubstring) {
                case "cm":
                    d4 = 35.43307d;
                    length = i3;
                    break;
                case "em":
                    length = i3;
                    break;
                case "in":
                    d4 = 90.0d;
                    length = i3;
                    break;
                case "mm":
                    d4 = 3.543307d;
                    length = i3;
                    break;
                case "pc":
                    d4 = 15.0d;
                    length = i3;
                    break;
                case "pt":
                    d4 = 1.25d;
                    length = i3;
                    break;
                case "px":
                    length = i3;
                    d4 = 1.0d;
                    break;
                default:
                    d4 = 1.0d;
                    break;
            }
            dDoubleValue = Double.valueOf(strTrim.substring(0, length)).doubleValue() * d4;
        } else {
            dDoubleValue = Double.valueOf(strTrim).doubleValue();
        }
        return dDoubleValue * d3;
    }

    static int toMatrixData(ReadableArray readableArray, float[] fArr, float f2) {
        int size = readableArray.size();
        if (size != 6) {
            return size;
        }
        fArr[0] = (float) readableArray.getDouble(0);
        fArr[1] = (float) readableArray.getDouble(2);
        fArr[2] = ((float) readableArray.getDouble(4)) * f2;
        fArr[3] = (float) readableArray.getDouble(1);
        fArr[4] = (float) readableArray.getDouble(3);
        fArr[5] = ((float) readableArray.getDouble(5)) * f2;
        return 6;
    }
}
