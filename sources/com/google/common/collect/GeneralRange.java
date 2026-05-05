package com.google.common.collect;

import com.dynatrace.android.agent.Global;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Comparator;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
final class GeneralRange<T> implements Serializable {
    private final Comparator<? super T> comparator;
    private final boolean hasLowerBound;
    private final boolean hasUpperBound;
    private final BoundType lowerBoundType;

    @CheckForNull
    private final T lowerEndpoint;

    @CheckForNull
    @LazyInit
    private transient GeneralRange<T> reverse;
    private final BoundType upperBoundType;

    @CheckForNull
    private final T upperEndpoint;

    private GeneralRange(Comparator<? super T> comparator, boolean z2, @CheckForNull T t2, BoundType boundType, boolean z3, @CheckForNull T t3, BoundType boundType2) {
        this.comparator = (Comparator) Preconditions.checkNotNull(comparator);
        this.hasLowerBound = z2;
        this.hasUpperBound = z3;
        this.lowerEndpoint = t2;
        this.lowerBoundType = (BoundType) Preconditions.checkNotNull(boundType);
        this.upperEndpoint = t3;
        this.upperBoundType = (BoundType) Preconditions.checkNotNull(boundType2);
        if (z2) {
            comparator.compare((Object) NullnessCasts.uncheckedCastNullableTToT(t2), (Object) NullnessCasts.uncheckedCastNullableTToT(t2));
        }
        if (z3) {
            comparator.compare((Object) NullnessCasts.uncheckedCastNullableTToT(t3), (Object) NullnessCasts.uncheckedCastNullableTToT(t3));
        }
        if (z2 && z3) {
            int iCompare = comparator.compare((Object) NullnessCasts.uncheckedCastNullableTToT(t2), (Object) NullnessCasts.uncheckedCastNullableTToT(t3));
            boolean z4 = true;
            Preconditions.checkArgument(iCompare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", t2, t3);
            if (iCompare == 0) {
                if (boundType == BoundType.OPEN && boundType2 == BoundType.OPEN) {
                    z4 = false;
                }
                Preconditions.checkArgument(z4);
            }
        }
    }

    static <T> GeneralRange<T> all(Comparator<? super T> comparator) {
        return new GeneralRange<>(comparator, false, null, BoundType.OPEN, false, null, BoundType.OPEN);
    }

    static <T> GeneralRange<T> downTo(Comparator<? super T> comparator, @ParametricNullness T endpoint, BoundType boundType) {
        return new GeneralRange<>(comparator, true, endpoint, boundType, false, null, BoundType.OPEN);
    }

    static <T extends Comparable> GeneralRange<T> from(Range<T> range) {
        return new GeneralRange<>(Ordering.natural(), range.hasLowerBound(), range.hasLowerBound() ? range.lowerEndpoint() : null, range.hasLowerBound() ? range.lowerBoundType() : BoundType.OPEN, range.hasUpperBound(), range.hasUpperBound() ? range.upperEndpoint() : null, range.hasUpperBound() ? range.upperBoundType() : BoundType.OPEN);
    }

    static <T> GeneralRange<T> range(Comparator<? super T> comparator, @ParametricNullness T lower, BoundType lowerType, @ParametricNullness T upper, BoundType upperType) {
        return new GeneralRange<>(comparator, true, lower, lowerType, true, upper, upperType);
    }

    static <T> GeneralRange<T> upTo(Comparator<? super T> comparator, @ParametricNullness T endpoint, BoundType boundType) {
        return new GeneralRange<>(comparator, false, null, BoundType.OPEN, true, endpoint, boundType);
    }

    Comparator<? super T> comparator() {
        return this.comparator;
    }

    boolean contains(@ParametricNullness T t2) {
        return (tooLow(t2) || tooHigh(t2)) ? false : true;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof GeneralRange)) {
            return false;
        }
        GeneralRange generalRange = (GeneralRange) obj;
        return this.comparator.equals(generalRange.comparator) && this.hasLowerBound == generalRange.hasLowerBound && this.hasUpperBound == generalRange.hasUpperBound && getLowerBoundType().equals(generalRange.getLowerBoundType()) && getUpperBoundType().equals(generalRange.getUpperBoundType()) && Objects.equal(getLowerEndpoint(), generalRange.getLowerEndpoint()) && Objects.equal(getUpperEndpoint(), generalRange.getUpperEndpoint());
    }

    BoundType getLowerBoundType() {
        return this.lowerBoundType;
    }

    @CheckForNull
    T getLowerEndpoint() {
        return this.lowerEndpoint;
    }

    BoundType getUpperBoundType() {
        return this.upperBoundType;
    }

    @CheckForNull
    T getUpperEndpoint() {
        return this.upperEndpoint;
    }

    boolean hasLowerBound() {
        return this.hasLowerBound;
    }

    boolean hasUpperBound() {
        return this.hasUpperBound;
    }

    public int hashCode() {
        return Objects.hashCode(this.comparator, getLowerEndpoint(), getLowerBoundType(), getUpperEndpoint(), getUpperBoundType());
    }

    GeneralRange<T> intersect(GeneralRange<T> other) {
        int iCompare;
        int iCompare2;
        int iCompare3;
        Preconditions.checkNotNull(other);
        Preconditions.checkArgument(this.comparator.equals(other.comparator));
        boolean z2 = this.hasLowerBound;
        T lowerEndpoint = getLowerEndpoint();
        BoundType lowerBoundType = getLowerBoundType();
        if (!hasLowerBound()) {
            z2 = other.hasLowerBound;
            lowerEndpoint = other.getLowerEndpoint();
            lowerBoundType = other.getLowerBoundType();
        } else if (other.hasLowerBound() && ((iCompare = this.comparator.compare(getLowerEndpoint(), other.getLowerEndpoint())) < 0 || (iCompare == 0 && other.getLowerBoundType() == BoundType.OPEN))) {
            lowerEndpoint = other.getLowerEndpoint();
            lowerBoundType = other.getLowerBoundType();
        }
        boolean z3 = this.hasUpperBound;
        T upperEndpoint = getUpperEndpoint();
        BoundType upperBoundType = getUpperBoundType();
        if (!hasUpperBound()) {
            z3 = other.hasUpperBound;
            upperEndpoint = other.getUpperEndpoint();
            upperBoundType = other.getUpperBoundType();
        } else if (other.hasUpperBound() && ((iCompare2 = this.comparator.compare(getUpperEndpoint(), other.getUpperEndpoint())) > 0 || (iCompare2 == 0 && other.getUpperBoundType() == BoundType.OPEN))) {
            upperEndpoint = other.getUpperEndpoint();
            upperBoundType = other.getUpperBoundType();
        }
        if (z2 && z3 && ((iCompare3 = this.comparator.compare(lowerEndpoint, upperEndpoint)) > 0 || (iCompare3 == 0 && lowerBoundType == BoundType.OPEN && upperBoundType == BoundType.OPEN))) {
            lowerBoundType = BoundType.OPEN;
            upperBoundType = BoundType.CLOSED;
            lowerEndpoint = upperEndpoint;
        }
        return new GeneralRange<>(this.comparator, z2, lowerEndpoint, lowerBoundType, z3, upperEndpoint, upperBoundType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean isEmpty() {
        return (hasUpperBound() && tooLow(NullnessCasts.uncheckedCastNullableTToT(getUpperEndpoint()))) || (hasLowerBound() && tooHigh(NullnessCasts.uncheckedCastNullableTToT(getLowerEndpoint())));
    }

    GeneralRange<T> reverse() {
        GeneralRange<T> generalRange = this.reverse;
        if (generalRange != null) {
            return generalRange;
        }
        GeneralRange<T> generalRange2 = new GeneralRange<>(Ordering.from(this.comparator).reverse(), this.hasUpperBound, getUpperEndpoint(), getUpperBoundType(), this.hasLowerBound, getLowerEndpoint(), getLowerBoundType());
        generalRange2.reverse = this;
        this.reverse = generalRange2;
        return generalRange2;
    }

    public String toString() {
        return this.comparator + Global.COLON + (this.lowerBoundType == BoundType.CLOSED ? AbstractJsonLexerKt.BEGIN_LIST : '(') + (this.hasLowerBound ? this.lowerEndpoint : "-∞") + AbstractJsonLexerKt.COMMA + (this.hasUpperBound ? this.upperEndpoint : "∞") + (this.upperBoundType == BoundType.CLOSED ? AbstractJsonLexerKt.END_LIST : ')');
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [boolean, int] */
    boolean tooHigh(@ParametricNullness T t2) {
        if (!hasUpperBound()) {
            return false;
        }
        int iCompare = this.comparator.compare(t2, NullnessCasts.uncheckedCastNullableTToT(getUpperEndpoint()));
        int i2 = iCompare > 0 ? 1 : 0;
        int i3 = (iCompare == 0 ? 1 : 0) & (getUpperBoundType() == BoundType.OPEN ? 1 : 0);
        return (i3 + i2) - (i3 & i2);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [boolean, int] */
    boolean tooLow(@ParametricNullness T t2) {
        if (!hasLowerBound()) {
            return false;
        }
        int iCompare = this.comparator.compare(t2, NullnessCasts.uncheckedCastNullableTToT(getLowerEndpoint()));
        int i2 = iCompare < 0 ? 1 : 0;
        int i3 = (iCompare == 0 ? 1 : 0) & (getLowerBoundType() == BoundType.OPEN ? 1 : 0);
        return (i3 + i2) - (i3 & i2);
    }
}
