package android.util;

/* JADX INFO: loaded from: classes.dex */
public abstract class IntProperty<T> extends Property<T, Integer> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.util.Property
    public abstract Integer get(T t2);

    public abstract void setValue(T t2, int i2);

    public IntProperty(String str) {
        super(Integer.class, str);
    }

    @Override // android.util.Property
    public final void set(T t2, Integer num) {
        setValue(t2, num.intValue());
    }
}
