package com.google.android.datatransport;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Event<T> {
    public static <T> Event<T> ofData(int i2, T t2) {
        return new AutoValue_Event(Integer.valueOf(i2), t2, Priority.DEFAULT, null, null);
    }

    public static <T> Event<T> ofData(int i2, T t2, EventContext eventContext) {
        return new AutoValue_Event(Integer.valueOf(i2), t2, Priority.DEFAULT, null, eventContext);
    }

    public static <T> Event<T> ofData(int i2, T t2, ProductData productData) {
        return new AutoValue_Event(Integer.valueOf(i2), t2, Priority.DEFAULT, productData, null);
    }

    public static <T> Event<T> ofData(int i2, T t2, ProductData productData, EventContext eventContext) {
        return new AutoValue_Event(Integer.valueOf(i2), t2, Priority.DEFAULT, productData, eventContext);
    }

    public static <T> Event<T> ofData(T t2) {
        return new AutoValue_Event(null, t2, Priority.DEFAULT, null, null);
    }

    public static <T> Event<T> ofData(T t2, EventContext eventContext) {
        return new AutoValue_Event(null, t2, Priority.DEFAULT, null, eventContext);
    }

    public static <T> Event<T> ofData(T t2, ProductData productData) {
        return new AutoValue_Event(null, t2, Priority.DEFAULT, productData, null);
    }

    public static <T> Event<T> ofData(T t2, ProductData productData, EventContext eventContext) {
        return new AutoValue_Event(null, t2, Priority.DEFAULT, productData, eventContext);
    }

    public static <T> Event<T> ofTelemetry(int i2, T t2) {
        return new AutoValue_Event(Integer.valueOf(i2), t2, Priority.VERY_LOW, null, null);
    }

    public static <T> Event<T> ofTelemetry(int i2, T t2, EventContext eventContext) {
        return new AutoValue_Event(Integer.valueOf(i2), t2, Priority.VERY_LOW, null, eventContext);
    }

    public static <T> Event<T> ofTelemetry(int i2, T t2, ProductData productData) {
        return new AutoValue_Event(Integer.valueOf(i2), t2, Priority.VERY_LOW, productData, null);
    }

    public static <T> Event<T> ofTelemetry(int i2, T t2, ProductData productData, EventContext eventContext) {
        return new AutoValue_Event(Integer.valueOf(i2), t2, Priority.VERY_LOW, productData, eventContext);
    }

    public static <T> Event<T> ofTelemetry(T t2) {
        return new AutoValue_Event(null, t2, Priority.VERY_LOW, null, null);
    }

    public static <T> Event<T> ofTelemetry(T t2, EventContext eventContext) {
        return new AutoValue_Event(null, t2, Priority.VERY_LOW, null, eventContext);
    }

    public static <T> Event<T> ofTelemetry(T t2, ProductData productData) {
        return new AutoValue_Event(null, t2, Priority.VERY_LOW, productData, null);
    }

    public static <T> Event<T> ofTelemetry(T t2, ProductData productData, EventContext eventContext) {
        return new AutoValue_Event(null, t2, Priority.VERY_LOW, productData, eventContext);
    }

    public static <T> Event<T> ofUrgent(int i2, T t2) {
        return new AutoValue_Event(Integer.valueOf(i2), t2, Priority.HIGHEST, null, null);
    }

    public static <T> Event<T> ofUrgent(int i2, T t2, EventContext eventContext) {
        return new AutoValue_Event(Integer.valueOf(i2), t2, Priority.HIGHEST, null, eventContext);
    }

    public static <T> Event<T> ofUrgent(int i2, T t2, ProductData productData) {
        return new AutoValue_Event(Integer.valueOf(i2), t2, Priority.HIGHEST, productData, null);
    }

    public static <T> Event<T> ofUrgent(int i2, T t2, ProductData productData, EventContext eventContext) {
        return new AutoValue_Event(Integer.valueOf(i2), t2, Priority.HIGHEST, productData, eventContext);
    }

    public static <T> Event<T> ofUrgent(T t2) {
        return new AutoValue_Event(null, t2, Priority.HIGHEST, null, null);
    }

    public static <T> Event<T> ofUrgent(T t2, EventContext eventContext) {
        return new AutoValue_Event(null, t2, Priority.HIGHEST, null, eventContext);
    }

    public static <T> Event<T> ofUrgent(T t2, ProductData productData) {
        return new AutoValue_Event(null, t2, Priority.HIGHEST, productData, null);
    }

    public static <T> Event<T> ofUrgent(T t2, ProductData productData, EventContext eventContext) {
        return new AutoValue_Event(null, t2, Priority.HIGHEST, productData, eventContext);
    }

    public abstract Integer getCode();

    public abstract EventContext getEventContext();

    public abstract T getPayload();

    public abstract Priority getPriority();

    public abstract ProductData getProductData();
}
