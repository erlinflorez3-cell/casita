package com.facetec.sdk;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class ct extends cm {
    private final Object Z;

    public ct(Boolean bool) {
        this.Z = dp.Code(bool);
    }

    public ct(Number number) {
        this.Z = dp.Code(number);
    }

    public ct(String str) {
        this.Z = dp.Code(str);
    }

    private static boolean I(ct ctVar) {
        Object obj = ctVar.Z;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.facetec.sdk.cm
    public final int B() {
        return a() ? Code().intValue() : Integer.parseInt(V());
    }

    @Override // com.facetec.sdk.cm
    public final Number Code() {
        Object obj = this.Z;
        return obj instanceof String ? new dl((String) this.Z) : (Number) obj;
    }

    @Override // com.facetec.sdk.cm
    public final double I() {
        return a() ? Code().doubleValue() : Double.parseDouble(V());
    }

    @Override // com.facetec.sdk.cm
    public final boolean L() {
        return c() ? ((Boolean) this.Z).booleanValue() : Boolean.parseBoolean(V());
    }

    @Override // com.facetec.sdk.cm
    public final String V() {
        return a() ? Code().toString() : c() ? ((Boolean) this.Z).toString() : (String) this.Z;
    }

    @Override // com.facetec.sdk.cm
    public final long Z() {
        return a() ? Code().longValue() : Long.parseLong(V());
    }

    public final boolean a() {
        return this.Z instanceof Number;
    }

    public final boolean b() {
        return this.Z instanceof String;
    }

    public final boolean c() {
        return this.Z instanceof Boolean;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ct ctVar = (ct) obj;
        if (this.Z == null) {
            return ctVar.Z == null;
        }
        if (I(this) && I(ctVar)) {
            return Code().longValue() == ctVar.Code().longValue();
        }
        Object obj2 = this.Z;
        if (!(obj2 instanceof Number) || !(ctVar.Z instanceof Number)) {
            return obj2.equals(ctVar.Z);
        }
        double dDoubleValue = Code().doubleValue();
        double dDoubleValue2 = ctVar.Code().doubleValue();
        return dDoubleValue == dDoubleValue2 || (Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2));
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        if (this.Z == null) {
            return 31;
        }
        if (I(this)) {
            jDoubleToLongBits = Code().longValue();
        } else {
            Object obj = this.Z;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(Code().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }
}
