package com.horcrux.svg;

import com.dynatrace.android.agent.Global;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import io.sentry.ProfilingTraceData;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
class SVGLength {
    final UnitType unit;
    final double value;

    /* JADX INFO: renamed from: com.horcrux.svg.SVGLength$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        static {
            int[] iArr = new int[ReadableType.values().length];
            $SwitchMap$com$facebook$react$bridge$ReadableType = iArr;
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Array.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum UnitType {
        UNKNOWN,
        NUMBER,
        PERCENTAGE,
        EMS,
        EXS,
        PX,
        CM,
        MM,
        IN,
        PT,
        PC
    }

    private SVGLength() {
        this.value = 0.0d;
        this.unit = UnitType.UNKNOWN;
    }

    SVGLength(double d2) {
        this.value = d2;
        this.unit = UnitType.NUMBER;
    }

    SVGLength(String str) {
        String strTrim = str.trim();
        int length = strTrim.length();
        int i2 = length - 1;
        if (length == 0 || strTrim.equals(ProfilingTraceData.TRUNCATION_REASON_NORMAL)) {
            this.unit = UnitType.UNKNOWN;
            this.value = 0.0d;
            return;
        }
        if (strTrim.codePointAt(i2) == 37) {
            this.unit = UnitType.PERCENTAGE;
            this.value = Double.valueOf(strTrim.substring(0, i2)).doubleValue();
            return;
        }
        int i3 = length - 2;
        if (i3 <= 0) {
            this.unit = UnitType.NUMBER;
            this.value = Double.valueOf(strTrim).doubleValue();
            return;
        }
        String strSubstring = strTrim.substring(i3);
        strSubstring.hashCode();
        switch (strSubstring) {
            case "cm":
                this.unit = UnitType.CM;
                length = i3;
                break;
            case "em":
                this.unit = UnitType.EMS;
                length = i3;
                break;
            case "ex":
                this.unit = UnitType.EXS;
                length = i3;
                break;
            case "in":
                this.unit = UnitType.IN;
                length = i3;
                break;
            case "mm":
                this.unit = UnitType.MM;
                length = i3;
                break;
            case "pc":
                this.unit = UnitType.PC;
                length = i3;
                break;
            case "pt":
                this.unit = UnitType.PT;
                length = i3;
                break;
            case "px":
                this.unit = UnitType.NUMBER;
                length = i3;
                break;
            default:
                this.unit = UnitType.NUMBER;
                break;
        }
        this.value = Double.valueOf(strTrim.substring(0, length)).doubleValue();
    }

    static ArrayList<SVGLength> arrayFrom(Dynamic dynamic) {
        int i2 = AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[dynamic.getType().ordinal()];
        if (i2 == 1) {
            ArrayList<SVGLength> arrayList = new ArrayList<>(1);
            arrayList.add(new SVGLength(dynamic.asDouble()));
            return arrayList;
        }
        int i3 = 0;
        if (i2 == 2) {
            String[] strArrSplit = dynamic.asString().trim().replaceAll(",", Global.BLANK).split(Global.BLANK);
            ArrayList<SVGLength> arrayList2 = new ArrayList<>(strArrSplit.length);
            int length = strArrSplit.length;
            while (i3 < length) {
                arrayList2.add(new SVGLength(strArrSplit[i3]));
                i3++;
            }
            return arrayList2;
        }
        if (i2 != 3) {
            return null;
        }
        ReadableArray readableArrayAsArray = dynamic.asArray();
        int size = readableArrayAsArray.size();
        ArrayList<SVGLength> arrayList3 = new ArrayList<>(size);
        while (i3 < size) {
            arrayList3.add(from(readableArrayAsArray.getDynamic(i3)));
            i3++;
        }
        return arrayList3;
    }

    static ArrayList<SVGLength> arrayFrom(ReadableArray readableArray) {
        int size = readableArray.size();
        ArrayList<SVGLength> arrayList = new ArrayList<>(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(from(readableArray.getDynamic(i2)));
        }
        return arrayList;
    }

    static SVGLength from(Dynamic dynamic) {
        int i2 = AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[dynamic.getType().ordinal()];
        return i2 != 1 ? i2 != 2 ? new SVGLength() : new SVGLength(dynamic.asString()) : new SVGLength(dynamic.asDouble());
    }

    static SVGLength from(Double d2) {
        return d2 != null ? new SVGLength(d2.doubleValue()) : new SVGLength();
    }

    static SVGLength from(String str) {
        return str != null ? new SVGLength(str) : new SVGLength();
    }

    static String toString(Dynamic dynamic) {
        int i2 = AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[dynamic.getType().ordinal()];
        if (i2 == 1) {
            return String.valueOf(dynamic.asDouble());
        }
        if (i2 != 2) {
            return null;
        }
        return dynamic.asString();
    }
}
