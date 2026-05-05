package com.drew.lang;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class Rational extends Number implements Comparable<Rational>, Serializable {
    private static final long serialVersionUID = 510688928138848770L;
    private final long _denominator;
    private final long _numerator;

    public Rational(long j2, long j3) {
        this._numerator = j2;
        this._denominator = j3;
    }

    private static long GCD(long j2, long j3) {
        if (j2 < 0) {
            j2 = -j2;
        }
        if (j3 < 0) {
            j3 = -j3;
        }
        while (j2 != 0 && j3 != 0) {
            if (j2 > j3) {
                j2 %= j3;
            } else {
                j3 %= j2;
            }
        }
        return j2 == 0 ? j3 : j2;
    }

    @Override // java.lang.Number
    public final byte byteValue() {
        return (byte) doubleValue();
    }

    @Override // java.lang.Comparable
    public int compareTo(Rational rational) {
        return Double.compare(doubleValue(), rational.doubleValue());
    }

    @Override // java.lang.Number
    public double doubleValue() {
        long j2 = this._numerator;
        if (j2 == 0) {
            return 0.0d;
        }
        return j2 / this._denominator;
    }

    public boolean equals(Rational rational) {
        return rational.doubleValue() == doubleValue();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Rational) && doubleValue() == ((Rational) obj).doubleValue();
    }

    public boolean equalsExact(Rational rational) {
        return getDenominator() == rational.getDenominator() && getNumerator() == rational.getNumerator();
    }

    @Override // java.lang.Number
    public float floatValue() {
        long j2 = this._numerator;
        if (j2 == 0) {
            return 0.0f;
        }
        return j2 / this._denominator;
    }

    public Rational getAbsolute() {
        return new Rational(Math.abs(this._numerator), Math.abs(this._denominator));
    }

    public final long getDenominator() {
        return this._denominator;
    }

    public final long getNumerator() {
        return this._numerator;
    }

    public Rational getReciprocal() {
        return new Rational(this._denominator, this._numerator);
    }

    public Rational getSimplifiedInstance() {
        long j2 = this._numerator;
        long j3 = this._denominator;
        if (j3 < 0) {
            j2 = -j2;
            j3 = -j3;
        }
        long jGCD = GCD(j2, j3);
        return new Rational(j2 / jGCD, j3 / jGCD);
    }

    public int hashCode() {
        return (((int) this._denominator) * 23) + ((int) this._numerator);
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) doubleValue();
    }

    public boolean isInteger() {
        long j2 = this._denominator;
        return j2 == 1 || (j2 != 0 && this._numerator % j2 == 0) || (j2 == 0 && this._numerator == 0);
    }

    public boolean isPositive() {
        if (isZero()) {
            return false;
        }
        return ((this._numerator > 0L ? 1 : (this._numerator == 0L ? 0 : -1)) > 0) == ((this._denominator > 0L ? 1 : (this._denominator == 0L ? 0 : -1)) > 0);
    }

    public boolean isZero() {
        return this._numerator == 0 || this._denominator == 0;
    }

    @Override // java.lang.Number
    public final long longValue() {
        return (long) doubleValue();
    }

    @Override // java.lang.Number
    public final short shortValue() {
        return (short) doubleValue();
    }

    public String toSimpleString(boolean z2) {
        if (this._denominator == 0 && this._numerator != 0) {
            return toString();
        }
        if (isInteger()) {
            return Integer.toString(intValue());
        }
        Rational simplifiedInstance = getSimplifiedInstance();
        if (z2) {
            String string = Double.toString(simplifiedInstance.doubleValue());
            if (string.length() < 5) {
                return string;
            }
        }
        return simplifiedInstance.toString();
    }

    public String toString() {
        return this._numerator + RemoteSettings.FORWARD_SLASH_STRING + this._denominator;
    }
}
