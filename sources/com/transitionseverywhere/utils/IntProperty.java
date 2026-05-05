package com.transitionseverywhere.utils;

import android.util.Property;

/* JADX INFO: loaded from: classes5.dex */
public abstract class IntProperty<T> extends Property<T, Integer> {
    public IntProperty() {
        super(Integer.class, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.util.Property
    public Integer get(T t2) {
        return 0;
    }

    public Property<T, Integer> optimize() {
        return new android.util.IntProperty<T>(null) { // from class: com.transitionseverywhere.utils.IntProperty.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.util.IntProperty, android.util.Property
            public Integer get(T t2) {
                return IntProperty.this.get((Object) t2);
            }

            @Override // android.util.IntProperty
            public void setValue(T t2, int i2) {
                IntProperty.this.setValue(t2, i2);
            }
        };
    }

    @Override // android.util.Property
    public final void set(T t2, Integer num) {
        setValue(t2, num.intValue());
    }

    public abstract void setValue(T t2, int i2);
}
