package com.google.common.base;

import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes3.dex */
@DoNotMock("^}l(Tvwm\u0001\u0001p|;}q4o[cmZ\u001f\u0013cs\"NpqgjjJV\u0015IGYHRe\u001a\u0018")
@InterfaceC1492Gx
@ElementTypesAreNonnullByDefault
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: com.google.common.base.Optional$1 */
    class AnonymousClass1 implements Iterable<T> {
        final /* synthetic */ Iterable val$optionals;

        /* JADX INFO: renamed from: com.google.common.base.Optional$1$1 */
        class C01851 extends AbstractIterator<T> {
            private final Iterator<? extends Optional<? extends T>> iterator;

            C01851() {
                this.iterator = (Iterator) Preconditions.checkNotNull(val$optionals.iterator());
            }

            @Override // com.google.common.base.AbstractIterator
            @CheckForNull
            protected T computeNext() {
                while (this.iterator.hasNext()) {
                    Optional<? extends T> next = this.iterator.next();
                    if (next.isPresent()) {
                        return next.get();
                    }
                }
                return endOfData();
            }
        }

        AnonymousClass1(final Iterable val$optionals) {
            val$optionals = val$optionals;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return new AbstractIterator<T>() { // from class: com.google.common.base.Optional.1.1
                private final Iterator<? extends Optional<? extends T>> iterator;

                C01851() {
                    this.iterator = (Iterator) Preconditions.checkNotNull(val$optionals.iterator());
                }

                @Override // com.google.common.base.AbstractIterator
                @CheckForNull
                protected T computeNext() {
                    while (this.iterator.hasNext()) {
                        Optional<? extends T> next = this.iterator.next();
                        if (next.isPresent()) {
                            return next.get();
                        }
                    }
                    return endOfData();
                }
            };
        }
    }

    Optional() {
    }

    public static <T> Optional<T> absent() {
        return Absent.withType();
    }

    public static <T> Optional<T> fromNullable(@CheckForNull T nullableReference) {
        return nullableReference == null ? absent() : new Present(nullableReference);
    }

    public static <T> Optional<T> of(T reference) {
        return new Present(Preconditions.checkNotNull(reference));
    }

    public static <T> Iterable<T> presentInstances(final Iterable<? extends Optional<? extends T>> optionals) {
        Preconditions.checkNotNull(optionals);
        return new Iterable<T>() { // from class: com.google.common.base.Optional.1
            final /* synthetic */ Iterable val$optionals;

            /* JADX INFO: renamed from: com.google.common.base.Optional$1$1 */
            class C01851 extends AbstractIterator<T> {
                private final Iterator<? extends Optional<? extends T>> iterator;

                C01851() {
                    this.iterator = (Iterator) Preconditions.checkNotNull(val$optionals.iterator());
                }

                @Override // com.google.common.base.AbstractIterator
                @CheckForNull
                protected T computeNext() {
                    while (this.iterator.hasNext()) {
                        Optional<? extends T> next = this.iterator.next();
                        if (next.isPresent()) {
                            return next.get();
                        }
                    }
                    return endOfData();
                }
            }

            AnonymousClass1(final Iterable optionals2) {
                val$optionals = optionals2;
            }

            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return new AbstractIterator<T>() { // from class: com.google.common.base.Optional.1.1
                    private final Iterator<? extends Optional<? extends T>> iterator;

                    C01851() {
                        this.iterator = (Iterator) Preconditions.checkNotNull(val$optionals.iterator());
                    }

                    @Override // com.google.common.base.AbstractIterator
                    @CheckForNull
                    protected T computeNext() {
                        while (this.iterator.hasNext()) {
                            Optional<? extends T> next = this.iterator.next();
                            if (next.isPresent()) {
                                return next.get();
                            }
                        }
                        return endOfData();
                    }
                };
            }
        };
    }

    public abstract Set<T> asSet();

    public abstract boolean equals(@CheckForNull Object object);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract Optional<T> or(Optional<? extends T> secondChoice);

    public abstract T or(Supplier<? extends T> supplier);

    public abstract T or(T defaultValue);

    @CheckForNull
    public abstract T orNull();

    public abstract String toString();

    public abstract <V> Optional<V> transform(Function<? super T, V> function);
}
