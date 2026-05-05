package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public abstract class FluentIterable<E> implements Iterable<E> {
    private final Optional<Iterable<E>> iterableDelegate;

    /* JADX INFO: renamed from: com.google.common.collect.FluentIterable$1 */
    class AnonymousClass1 extends FluentIterable<E> {
        final /* synthetic */ Iterable val$iterable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Iterable iterable, final Iterable val$iterable) {
            super(iterable);
            val$iterable = val$iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<E> iterator() {
            return val$iterable.iterator();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.FluentIterable$2 */
    class AnonymousClass2<T> extends FluentIterable<T> {
        final /* synthetic */ Iterable val$inputs;

        AnonymousClass2(final Iterable val$inputs) {
            val$inputs = val$inputs;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.concat(Iterators.transform(val$inputs.iterator(), new FluentIterable$2$$ExternalSyntheticLambda0()));
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.FluentIterable$3 */
    class AnonymousClass3<T> extends FluentIterable<T> {
        final /* synthetic */ Iterable[] val$inputs;

        /* JADX INFO: renamed from: com.google.common.collect.FluentIterable$3$1 */
        class AnonymousClass1 extends AbstractIndexedListIterator<Iterator<? extends T>> {
            AnonymousClass1(int size) {
                super(size);
            }

            @Override // com.google.common.collect.AbstractIndexedListIterator
            public Iterator<? extends T> get(int i2) {
                return val$inputs[i2].iterator();
            }
        }

        AnonymousClass3(final Iterable[] val$inputs) {
            val$inputs = val$inputs;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.concat(new AbstractIndexedListIterator<Iterator<? extends T>>(val$inputs.length) { // from class: com.google.common.collect.FluentIterable.3.1
                AnonymousClass1(int size) {
                    super(size);
                }

                @Override // com.google.common.collect.AbstractIndexedListIterator
                public Iterator<? extends T> get(int i2) {
                    return val$inputs[i2].iterator();
                }
            });
        }
    }

    private static class FromIterableFunction<E> implements Function<Iterable<E>, FluentIterable<E>> {
        private FromIterableFunction() {
        }

        @Override // com.google.common.base.Function
        public FluentIterable<E> apply(Iterable<E> fromObject) {
            return FluentIterable.from(fromObject);
        }
    }

    protected FluentIterable() {
        this.iterableDelegate = Optional.absent();
    }

    FluentIterable(Iterable<E> iterable) {
        this.iterableDelegate = Optional.of(iterable);
    }

    public static <T> FluentIterable<T> concat(final Iterable<? extends Iterable<? extends T>> inputs) {
        Preconditions.checkNotNull(inputs);
        return new FluentIterable<T>() { // from class: com.google.common.collect.FluentIterable.2
            final /* synthetic */ Iterable val$inputs;

            AnonymousClass2(final Iterable inputs2) {
                val$inputs = inputs2;
            }

            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return Iterators.concat(Iterators.transform(val$inputs.iterator(), new FluentIterable$2$$ExternalSyntheticLambda0()));
            }
        };
    }

    public static <T> FluentIterable<T> concat(Iterable<? extends T> a2, Iterable<? extends T> b2) {
        return concatNoDefensiveCopy(a2, b2);
    }

    public static <T> FluentIterable<T> concat(Iterable<? extends T> a2, Iterable<? extends T> b2, Iterable<? extends T> c2) {
        return concatNoDefensiveCopy(a2, b2, c2);
    }

    public static <T> FluentIterable<T> concat(Iterable<? extends T> a2, Iterable<? extends T> b2, Iterable<? extends T> c2, Iterable<? extends T> d2) {
        return concatNoDefensiveCopy(a2, b2, c2, d2);
    }

    public static <T> FluentIterable<T> concat(Iterable<? extends T>... inputs) {
        return concatNoDefensiveCopy((Iterable[]) Arrays.copyOf(inputs, inputs.length));
    }

    private static <T> FluentIterable<T> concatNoDefensiveCopy(final Iterable<? extends T>... inputs) {
        for (Iterable<? extends T> iterable : inputs) {
            Preconditions.checkNotNull(iterable);
        }
        return new FluentIterable<T>() { // from class: com.google.common.collect.FluentIterable.3
            final /* synthetic */ Iterable[] val$inputs;

            /* JADX INFO: renamed from: com.google.common.collect.FluentIterable$3$1 */
            class AnonymousClass1 extends AbstractIndexedListIterator<Iterator<? extends T>> {
                AnonymousClass1(int size) {
                    super(size);
                }

                @Override // com.google.common.collect.AbstractIndexedListIterator
                public Iterator<? extends T> get(int i2) {
                    return val$inputs[i2].iterator();
                }
            }

            AnonymousClass3(final Iterable[] inputs2) {
                val$inputs = inputs2;
            }

            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return Iterators.concat(new AbstractIndexedListIterator<Iterator<? extends T>>(val$inputs.length) { // from class: com.google.common.collect.FluentIterable.3.1
                    AnonymousClass1(int size) {
                        super(size);
                    }

                    @Override // com.google.common.collect.AbstractIndexedListIterator
                    public Iterator<? extends T> get(int i2) {
                        return val$inputs[i2].iterator();
                    }
                });
            }
        };
    }

    @Deprecated
    public static <E> FluentIterable<E> from(FluentIterable<E> iterable) {
        return (FluentIterable) Preconditions.checkNotNull(iterable);
    }

    public static <E> FluentIterable<E> from(final Iterable<E> iterable) {
        return iterable instanceof FluentIterable ? (FluentIterable) iterable : new FluentIterable<E>(iterable) { // from class: com.google.common.collect.FluentIterable.1
            final /* synthetic */ Iterable val$iterable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(final Iterable iterable2, final Iterable iterable22) {
                super(iterable22);
                val$iterable = iterable22;
            }

            @Override // java.lang.Iterable
            public Iterator<E> iterator() {
                return val$iterable.iterator();
            }
        };
    }

    public static <E> FluentIterable<E> from(E[] elements) {
        return from(Arrays.asList(elements));
    }

    private Iterable<E> getDelegate() {
        return this.iterableDelegate.or(this);
    }

    public static <E> FluentIterable<E> of() {
        return from(Collections.emptyList());
    }

    public static <E> FluentIterable<E> of(@ParametricNullness E element, E... elements) {
        return from(Lists.asList(element, elements));
    }

    public final boolean allMatch(Predicate<? super E> predicate) {
        return Iterables.all(getDelegate(), predicate);
    }

    public final boolean anyMatch(Predicate<? super E> predicate) {
        return Iterables.any(getDelegate(), predicate);
    }

    public final FluentIterable<E> append(Iterable<? extends E> other) {
        return concat(getDelegate(), other);
    }

    public final FluentIterable<E> append(E... elements) {
        return concat(getDelegate(), Arrays.asList(elements));
    }

    public final boolean contains(@CheckForNull Object target) {
        return Iterables.contains(getDelegate(), target);
    }

    public final <C extends Collection<? super E>> C copyInto(C collection) {
        Preconditions.checkNotNull(collection);
        Iterable<E> delegate = getDelegate();
        if (delegate instanceof Collection) {
            collection.addAll((Collection) delegate);
        } else {
            Iterator<E> it = delegate.iterator();
            while (it.hasNext()) {
                collection.add(it.next());
            }
        }
        return collection;
    }

    public final FluentIterable<E> cycle() {
        return from(Iterables.cycle(getDelegate()));
    }

    public final FluentIterable<E> filter(Predicate<? super E> predicate) {
        return from(Iterables.filter(getDelegate(), predicate));
    }

    public final <T> FluentIterable<T> filter(Class<T> type) {
        return from(Iterables.filter((Iterable<?>) getDelegate(), (Class) type));
    }

    public final Optional<E> first() {
        Iterator<E> it = getDelegate().iterator();
        return it.hasNext() ? Optional.of(it.next()) : Optional.absent();
    }

    public final Optional<E> firstMatch(Predicate<? super E> predicate) {
        return Iterables.tryFind(getDelegate(), predicate);
    }

    @ParametricNullness
    public final E get(int i2) {
        return (E) Iterables.get(getDelegate(), i2);
    }

    public final <K> ImmutableListMultimap<K, E> index(Function<? super E, K> keyFunction) {
        return Multimaps.index(getDelegate(), keyFunction);
    }

    public final boolean isEmpty() {
        return !getDelegate().iterator().hasNext();
    }

    public final String join(Joiner joiner) {
        return joiner.join(this);
    }

    public final Optional<E> last() {
        E next;
        Iterable<E> delegate = getDelegate();
        if (delegate instanceof List) {
            List list = (List) delegate;
            return list.isEmpty() ? Optional.absent() : Optional.of(list.get(list.size() - 1));
        }
        Iterator<E> it = delegate.iterator();
        if (!it.hasNext()) {
            return Optional.absent();
        }
        if (delegate instanceof SortedSet) {
            return Optional.of(((SortedSet) delegate).last());
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return Optional.of(next);
    }

    public final FluentIterable<E> limit(int maxSize) {
        return from(Iterables.limit(getDelegate(), maxSize));
    }

    public final int size() {
        return Iterables.size(getDelegate());
    }

    public final FluentIterable<E> skip(int numberToSkip) {
        return from(Iterables.skip(getDelegate(), numberToSkip));
    }

    public final E[] toArray(Class<E> cls) {
        return (E[]) Iterables.toArray(getDelegate(), cls);
    }

    public final ImmutableList<E> toList() {
        return ImmutableList.copyOf(getDelegate());
    }

    public final <V> ImmutableMap<E, V> toMap(Function<? super E, V> valueFunction) {
        return Maps.toMap(getDelegate(), valueFunction);
    }

    public final ImmutableMultiset<E> toMultiset() {
        return ImmutableMultiset.copyOf(getDelegate());
    }

    public final ImmutableSet<E> toSet() {
        return ImmutableSet.copyOf(getDelegate());
    }

    public final ImmutableList<E> toSortedList(Comparator<? super E> comparator) {
        return Ordering.from(comparator).immutableSortedCopy(getDelegate());
    }

    public final ImmutableSortedSet<E> toSortedSet(Comparator<? super E> comparator) {
        return ImmutableSortedSet.copyOf(comparator, getDelegate());
    }

    public String toString() {
        return Iterables.toString(getDelegate());
    }

    public final <T> FluentIterable<T> transform(Function<? super E, T> function) {
        return from(Iterables.transform(getDelegate(), function));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> FluentIterable<T> transformAndConcat(Function<? super E, ? extends Iterable<? extends T>> function) {
        return concat(transform(function));
    }

    public final <K> ImmutableMap<K, E> uniqueIndex(Function<? super E, K> keyFunction) {
        return Maps.uniqueIndex(getDelegate(), keyFunction);
    }
}
