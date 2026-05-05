package com.google.common.math;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Doubles;
import io.sentry.protocol.MetricSummary;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public final class Stats implements Serializable {
    static final int BYTES = 40;
    private static final long serialVersionUID = 0;
    private final long count;
    private final double max;
    private final double mean;
    private final double min;
    private final double sumOfSquaresOfDeltas;

    Stats(long count, double mean, double sumOfSquaresOfDeltas, double min, double max) {
        this.count = count;
        this.mean = mean;
        this.sumOfSquaresOfDeltas = sumOfSquaresOfDeltas;
        this.min = min;
        this.max = max;
    }

    public static Stats fromByteArray(byte[] byteArray) {
        Preconditions.checkNotNull(byteArray);
        Preconditions.checkArgument(byteArray.length == 40, "Expected Stats.BYTES = %s remaining , got %s", 40, byteArray.length);
        return readFrom(ByteBuffer.wrap(byteArray).order(ByteOrder.LITTLE_ENDIAN));
    }

    public static double meanOf(Iterable<? extends Number> values) {
        return meanOf(values.iterator());
    }

    public static double meanOf(Iterator<? extends Number> values) {
        Preconditions.checkArgument(values.hasNext());
        double dDoubleValue = values.next().doubleValue();
        long j2 = 1;
        while (values.hasNext()) {
            double dDoubleValue2 = values.next().doubleValue();
            j2++;
            dDoubleValue = (Doubles.isFinite(dDoubleValue2) && Doubles.isFinite(dDoubleValue)) ? dDoubleValue + ((dDoubleValue2 - dDoubleValue) / j2) : StatsAccumulator.calculateNewMeanNonFinite(dDoubleValue, dDoubleValue2);
        }
        return dDoubleValue;
    }

    public static double meanOf(double... values) {
        Preconditions.checkArgument(values.length > 0);
        double dCalculateNewMeanNonFinite = values[0];
        for (int i2 = 1; i2 < values.length; i2++) {
            double d2 = values[i2];
            dCalculateNewMeanNonFinite = (Doubles.isFinite(d2) && Doubles.isFinite(dCalculateNewMeanNonFinite)) ? dCalculateNewMeanNonFinite + ((d2 - dCalculateNewMeanNonFinite) / ((double) (i2 + 1))) : StatsAccumulator.calculateNewMeanNonFinite(dCalculateNewMeanNonFinite, d2);
        }
        return dCalculateNewMeanNonFinite;
    }

    public static double meanOf(int... values) {
        Preconditions.checkArgument(values.length > 0);
        double dCalculateNewMeanNonFinite = values[0];
        for (int i2 = 1; i2 < values.length; i2++) {
            double d2 = values[i2];
            dCalculateNewMeanNonFinite = (Doubles.isFinite(d2) && Doubles.isFinite(dCalculateNewMeanNonFinite)) ? dCalculateNewMeanNonFinite + ((d2 - dCalculateNewMeanNonFinite) / ((double) (i2 + 1))) : StatsAccumulator.calculateNewMeanNonFinite(dCalculateNewMeanNonFinite, d2);
        }
        return dCalculateNewMeanNonFinite;
    }

    public static double meanOf(long... values) {
        Preconditions.checkArgument(values.length > 0);
        double dCalculateNewMeanNonFinite = values[0];
        for (int i2 = 1; i2 < values.length; i2++) {
            double d2 = values[i2];
            dCalculateNewMeanNonFinite = (Doubles.isFinite(d2) && Doubles.isFinite(dCalculateNewMeanNonFinite)) ? dCalculateNewMeanNonFinite + ((d2 - dCalculateNewMeanNonFinite) / ((double) (i2 + 1))) : StatsAccumulator.calculateNewMeanNonFinite(dCalculateNewMeanNonFinite, d2);
        }
        return dCalculateNewMeanNonFinite;
    }

    public static Stats of(Iterable<? extends Number> values) {
        StatsAccumulator statsAccumulator = new StatsAccumulator();
        statsAccumulator.addAll(values);
        return statsAccumulator.snapshot();
    }

    public static Stats of(Iterator<? extends Number> values) {
        StatsAccumulator statsAccumulator = new StatsAccumulator();
        statsAccumulator.addAll(values);
        return statsAccumulator.snapshot();
    }

    public static Stats of(double... values) {
        StatsAccumulator statsAccumulator = new StatsAccumulator();
        statsAccumulator.addAll(values);
        return statsAccumulator.snapshot();
    }

    public static Stats of(int... values) {
        StatsAccumulator statsAccumulator = new StatsAccumulator();
        statsAccumulator.addAll(values);
        return statsAccumulator.snapshot();
    }

    public static Stats of(long... values) {
        StatsAccumulator statsAccumulator = new StatsAccumulator();
        statsAccumulator.addAll(values);
        return statsAccumulator.snapshot();
    }

    static Stats readFrom(ByteBuffer buffer) {
        Preconditions.checkNotNull(buffer);
        Preconditions.checkArgument(buffer.remaining() >= 40, "Expected at least Stats.BYTES = %s remaining , got %s", 40, buffer.remaining());
        return new Stats(buffer.getLong(), buffer.getDouble(), buffer.getDouble(), buffer.getDouble(), buffer.getDouble());
    }

    public long count() {
        return this.count;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Stats stats = (Stats) obj;
        return this.count == stats.count && Double.doubleToLongBits(this.mean) == Double.doubleToLongBits(stats.mean) && Double.doubleToLongBits(this.sumOfSquaresOfDeltas) == Double.doubleToLongBits(stats.sumOfSquaresOfDeltas) && Double.doubleToLongBits(this.min) == Double.doubleToLongBits(stats.min) && Double.doubleToLongBits(this.max) == Double.doubleToLongBits(stats.max);
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.count), Double.valueOf(this.mean), Double.valueOf(this.sumOfSquaresOfDeltas), Double.valueOf(this.min), Double.valueOf(this.max));
    }

    public double max() {
        Preconditions.checkState(this.count != 0);
        return this.max;
    }

    public double mean() {
        Preconditions.checkState(this.count != 0);
        return this.mean;
    }

    public double min() {
        Preconditions.checkState(this.count != 0);
        return this.min;
    }

    public double populationStandardDeviation() {
        return Math.sqrt(populationVariance());
    }

    public double populationVariance() {
        Preconditions.checkState(this.count > 0);
        if (Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        if (this.count == 1) {
            return 0.0d;
        }
        return DoubleUtils.ensureNonNegative(this.sumOfSquaresOfDeltas) / count();
    }

    public double sampleStandardDeviation() {
        return Math.sqrt(sampleVariance());
    }

    public double sampleVariance() {
        Preconditions.checkState(this.count > 1);
        if (Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        return DoubleUtils.ensureNonNegative(this.sumOfSquaresOfDeltas) / (this.count - 1);
    }

    public double sum() {
        return this.mean * this.count;
    }

    double sumOfSquaresOfDeltas() {
        return this.sumOfSquaresOfDeltas;
    }

    public byte[] toByteArray() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(40).order(ByteOrder.LITTLE_ENDIAN);
        writeTo(byteBufferOrder);
        return byteBufferOrder.array();
    }

    public String toString() {
        return count() > 0 ? MoreObjects.toStringHelper(this).add(MetricSummary.JsonKeys.COUNT, this.count).add("mean", this.mean).add("populationStandardDeviation", populationStandardDeviation()).add(MetricSummary.JsonKeys.MIN, this.min).add(MetricSummary.JsonKeys.MAX, this.max).toString() : MoreObjects.toStringHelper(this).add(MetricSummary.JsonKeys.COUNT, this.count).toString();
    }

    void writeTo(ByteBuffer buffer) {
        Preconditions.checkNotNull(buffer);
        Preconditions.checkArgument(buffer.remaining() >= 40, "Expected at least Stats.BYTES = %s remaining , got %s", 40, buffer.remaining());
        buffer.putLong(this.count).putDouble(this.mean).putDouble(this.sumOfSquaresOfDeltas).putDouble(this.min).putDouble(this.max);
    }
}
