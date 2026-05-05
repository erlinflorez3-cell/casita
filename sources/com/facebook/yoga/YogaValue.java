package com.facebook.yoga;

/* JADX INFO: loaded from: classes3.dex */
public class YogaValue {
    public final YogaUnit unit;
    public final float value;
    static final YogaValue UNDEFINED = new YogaValue(Float.NaN, YogaUnit.UNDEFINED);
    static final YogaValue ZERO = new YogaValue(0.0f, YogaUnit.POINT);
    static final YogaValue AUTO = new YogaValue(Float.NaN, YogaUnit.AUTO);

    /* JADX INFO: renamed from: com.facebook.yoga.YogaValue$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$yoga$YogaUnit;

        static {
            int[] iArr = new int[YogaUnit.values().length];
            $SwitchMap$com$facebook$yoga$YogaUnit = iArr;
            try {
                iArr[YogaUnit.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaUnit[YogaUnit.POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaUnit[YogaUnit.PERCENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaUnit[YogaUnit.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    YogaValue(float f2, int i2) {
        this(f2, YogaUnit.fromInt(i2));
    }

    public YogaValue(float f2, YogaUnit yogaUnit) {
        this.value = f2;
        this.unit = yogaUnit;
    }

    public static YogaValue parse(String str) {
        if (str == null) {
            return null;
        }
        return "undefined".equals(str) ? UNDEFINED : "auto".equals(str) ? AUTO : str.endsWith("%") ? new YogaValue(Float.parseFloat(str.substring(0, str.length() - 1)), YogaUnit.PERCENT) : new YogaValue(Float.parseFloat(str), YogaUnit.POINT);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof YogaValue)) {
            return false;
        }
        YogaValue yogaValue = (YogaValue) obj;
        YogaUnit yogaUnit = this.unit;
        if (yogaUnit == yogaValue.unit) {
            return yogaUnit == YogaUnit.UNDEFINED || this.unit == YogaUnit.AUTO || Float.compare(this.value, yogaValue.value) == 0;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.value) + this.unit.intValue();
    }

    public String toString() {
        int i2 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.unit.ordinal()];
        if (i2 == 1) {
            return "undefined";
        }
        if (i2 == 2) {
            return Float.toString(this.value);
        }
        if (i2 == 3) {
            return this.value + "%";
        }
        if (i2 == 4) {
            return "auto";
        }
        throw new IllegalStateException();
    }
}
