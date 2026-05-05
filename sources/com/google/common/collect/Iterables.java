package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public final class Iterables {

    /* JADX INFO: renamed from: com.google.common.collect.Iterables$1 */
    class AnonymousClass1<T> extends FluentIterable<T> {
        final /* synthetic */ Iterable val$iterable;

        AnonymousClass1(final Iterable val$iterable) {
            val$iterable = val$iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.cycle(val$iterable);
        }

        @Override // com.google.common.collect.FluentIterable
        public String toString() {
            return val$iterable.toString() + " (cycled)";
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterables$2 */
    class AnonymousClass2<T> extends FluentIterable<List<T>> {
        final /* synthetic */ Iterable val$iterable;
        final /* synthetic */ int val$size;

        AnonymousClass2(final Iterable val$iterable, final int val$size) {
            val$iterable = val$iterable;
            val$size = val$size;
        }

        @Override // java.lang.Iterable
        public Iterator<List<T>> iterator() {
            return Iterators.partition(val$iterable.iterator(), val$size);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterables$3 */
    class AnonymousClass3<T> extends FluentIterable<List<T>> {
        final /* synthetic */ Iterable val$iterable;
        final /* synthetic */ int val$size;

        AnonymousClass3(final Iterable val$iterable, final int val$size) {
            val$iterable = val$iterable;
            val$size = val$size;
        }

        @Override // java.lang.Iterable
        public Iterator<List<T>> iterator() {
            return Iterators.paddedPartition(val$iterable.iterator(), val$size);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterables$4 */
    class AnonymousClass4<T> extends FluentIterable<T> {
        final /* synthetic */ Predicate val$retainIfTrue;
        final /* synthetic */ Iterable val$unfiltered;

        AnonymousClass4(final Iterable val$unfiltered, final Predicate val$retainIfTrue) {
            val$unfiltered = val$unfiltered;
            val$retainIfTrue = val$retainIfTrue;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.filter(val$unfiltered.iterator(), val$retainIfTrue);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterables$5 */
    class AnonymousClass5<T> extends FluentIterable<T> {
        final /* synthetic */ Iterable val$fromIterable;
        final /* synthetic */ Function val$function;

        AnonymousClass5(final Iterable val$fromIterable, final Function val$function) {
            val$fromIterable = val$fromIterable;
            val$function = val$function;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.transform(val$fromIterable.iterator(), val$function);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterables$6 */
    class AnonymousClass6<T> extends FluentIterable<T> {
        final /* synthetic */ Iterable val$iterable;
        final /* synthetic */ int val$numberToSkip;

        /* JADX INFO: renamed from: com.google.common.collect.Iterables$6$1 */
        class AnonymousClass1 implements Iterator<T> {
            boolean atStart = true;
            final /* synthetic */ Iterator val$iterator;

            AnonymousClass1(final AnonymousClass6 this$0, final Iterator val$iterator) {
                val$iterator = val$iterator;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return val$iterator.hasNext();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                T t2 = (T) val$iterator.next();
                this.atStart = false;
                return t2;
            }

            @Override // java.util.Iterator
            public void remove() {
                CollectPreconditions.checkRemove(!this.atStart);
                val$iterator.remove();
            }
        }

        AnonymousClass6(final Iterable val$iterable, final int val$numberToSkip) {
            val$iterable = val$iterable;
            val$numberToSkip = val$numberToSkip;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            Iterable iterable = val$iterable;
            if (iterable instanceof List) {
                List list = (List) iterable;
                return list.subList(Math.min(list.size(), val$numberToSkip), list.size()).iterator();
            }
            Iterator<T> it = iterable.iterator();
            Iterators.advance(it, val$numberToSkip);
            return new Iterator<T>(this) { // from class: com.google.common.collect.Iterables.6.1
                boolean atStart = true;
                final /* synthetic */ Iterator val$iterator;

                AnonymousClass1(AnonymousClass6 this, Iterator it2) {
                    val$iterator = it2;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return val$iterator.hasNext();
                }

                @Override // java.util.Iterator
                @ParametricNullness
                public T next() {
                    T t2 = (T) val$iterator.next();
                    this.atStart = false;
                    return t2;
                }

                @Override // java.util.Iterator
                public void remove() {
                    CollectPreconditions.checkRemove(!this.atStart);
                    val$iterator.remove();
                }
            };
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterables$7 */
    class AnonymousClass7<T> extends FluentIterable<T> {
        final /* synthetic */ Iterable val$iterable;
        final /* synthetic */ int val$limitSize;

        AnonymousClass7(final Iterable val$iterable, final int val$limitSize) {
            val$iterable = val$iterable;
            val$limitSize = val$limitSize;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.limit(val$iterable.iterator(), val$limitSize);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterables$8 */
    class AnonymousClass8<T> extends FluentIterable<T> {
        final /* synthetic */ Iterable val$iterable;

        AnonymousClass8(final Iterable val$iterable) {
            val$iterable = val$iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            Iterable iterable = val$iterable;
            return iterable instanceof Queue ? new ConsumingQueueIterator((Queue) val$iterable) : Iterators.consumingIterator(iterable.iterator());
        }

        @Override // com.google.common.collect.FluentIterable
        public String toString() {
            return "Iterables.consumingIterable(...)";
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterables$9 */
    class AnonymousClass9<T> extends FluentIterable<T> {
        final /* synthetic */ Comparator val$comparator;
        final /* synthetic */ Iterable val$iterables;

        AnonymousClass9(final Iterable val$iterables, final Comparator val$comparator) {
            val$iterables = val$iterables;
            val$comparator = val$comparator;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.mergeSorted(Iterables.transform(val$iterables, new FluentIterable$2$$ExternalSyntheticLambda0()), val$comparator);
        }
    }

    private static final class UnmodifiableIterable<T> extends FluentIterable<T> {
        private final Iterable<? extends T> iterable;

        private UnmodifiableIterable(Iterable<? extends T> iterable) {
            this.iterable = iterable;
        }

        /* synthetic */ UnmodifiableIterable(Iterable iterable, AnonymousClass1 anonymousClass1) {
            this(iterable);
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.unmodifiableIterator(this.iterable.iterator());
        }

        @Override // com.google.common.collect.FluentIterable
        public String toString() {
            return this.iterable.toString();
        }
    }

    private Iterables() {
    }

    public static <T> boolean addAll(Collection<T> addTo, Iterable<? extends T> elementsToAdd) {
        return elementsToAdd instanceof Collection ? addTo.addAll((Collection) elementsToAdd) : Iterators.addAll(addTo, ((Iterable) Preconditions.checkNotNull(elementsToAdd)).iterator());
    }

    public static <T> boolean all(Iterable<T> iterable, Predicate<? super T> predicate) {
        return Iterators.all(iterable.iterator(), predicate);
    }

    public static <T> boolean any(Iterable<T> iterable, Predicate<? super T> predicate) {
        return Iterators.any(iterable.iterator(), predicate);
    }

    private static <E> Collection<E> castOrCopyToCollection(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : Lists.newArrayList(iterable.iterator());
    }

    public static <T> Iterable<T> concat(Iterable<? extends Iterable<? extends T>> inputs) {
        return FluentIterable.concat(inputs);
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> a2, Iterable<? extends T> b2) {
        return FluentIterable.concat(a2, b2);
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> a2, Iterable<? extends T> b2, Iterable<? extends T> c2) {
        return FluentIterable.concat(a2, b2, c2);
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> a2, Iterable<? extends T> b2, Iterable<? extends T> c2, Iterable<? extends T> d2) {
        return FluentIterable.concat(a2, b2, c2, d2);
    }

    @SafeVarargs
    public static <T> Iterable<T> concat(Iterable<? extends T>... inputs) {
        return FluentIterable.concat(inputs);
    }

    public static <T> Iterable<T> consumingIterable(final Iterable<T> iterable) {
        Preconditions.checkNotNull(iterable);
        return new FluentIterable<T>() { // from class: com.google.common.collect.Iterables.8
            final /* synthetic */ Iterable val$iterable;

            AnonymousClass8(final Iterable iterable2) {
                val$iterable = iterable2;
            }

            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                Iterable iterable2 = val$iterable;
                return iterable2 instanceof Queue ? new ConsumingQueueIterator((Queue) val$iterable) : Iterators.consumingIterator(iterable2.iterator());
            }

            @Override // com.google.common.collect.FluentIterable
            public String toString() {
                return "Iterables.consumingIterable(...)";
            }
        };
    }

    public static boolean contains(Iterable<? extends Object> iterable, @CheckForNull Object element) {
        return iterable instanceof Collection ? Collections2.safeContains((Collection) iterable, element) : Iterators.contains(iterable.iterator(), element);
    }

    public static <T> Iterable<T> cycle(final Iterable<T> iterable) {
        Preconditions.checkNotNull(iterable);
        return new FluentIterable<T>() { // from class: com.google.common.collect.Iterables.1
            final /* synthetic */ Iterable val$iterable;

            AnonymousClass1(final Iterable iterable2) {
                val$iterable = iterable2;
            }

            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return Iterators.cycle(val$iterable);
            }

            @Override // com.google.common.collect.FluentIterable
            public String toString() {
                return val$iterable.toString() + " (cycled)";
            }
        };
    }

    @SafeVarargs
    public static <T> Iterable<T> cycle(T... elements) {
        return cycle(Lists.newArrayList(elements));
    }

    public static boolean elementsEqual(Iterable<?> iterable1, Iterable<?> iterable2) {
        if ((iterable1 instanceof Collection) && (iterable2 instanceof Collection) && ((Collection) iterable1).size() != ((Collection) iterable2).size()) {
            return false;
        }
        return Iterators.elementsEqual(iterable1.iterator(), iterable2.iterator());
    }

    public static <T> Iterable<T> filter(final Iterable<T> unfiltered, final Predicate<? super T> retainIfTrue) {
        Preconditions.checkNotNull(unfiltered);
        Preconditions.checkNotNull(retainIfTrue);
        return new FluentIterable<T>() { // from class: com.google.common.collect.Iterables.4
            final /* synthetic */ Predicate val$retainIfTrue;
            final /* synthetic */ Iterable val$unfiltered;

            AnonymousClass4(final Iterable unfiltered2, final Predicate retainIfTrue2) {
                val$unfiltered = unfiltered2;
                val$retainIfTrue = retainIfTrue2;
            }

            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return Iterators.filter(val$unfiltered.iterator(), val$retainIfTrue);
            }
        };
    }

    public static <T> Iterable<T> filter(final Iterable<?> unfiltered, final Class<T> desiredType) {
        Preconditions.checkNotNull(unfiltered);
        Preconditions.checkNotNull(desiredType);
        return filter(unfiltered, Predicates.instanceOf(desiredType));
    }

    @ParametricNullness
    public static <T> T find(Iterable<T> iterable, Predicate<? super T> predicate) {
        return (T) Iterators.find(iterable.iterator(), predicate);
    }

    @CheckForNull
    public static <T> T find(Iterable<? extends T> iterable, Predicate<? super T> predicate, @CheckForNull T t2) {
        return (T) Iterators.find(iterable.iterator(), predicate, t2);
    }

    public static int frequency(Iterable<?> iterable, @CheckForNull Object obj) {
        return iterable instanceof Multiset ? ((Multiset) iterable).count(obj) : iterable instanceof Set ? ((Set) iterable).contains(obj) ? 1 : 0 : Iterators.frequency(iterable.iterator(), obj);
    }

    @ParametricNullness
    public static <T> T get(Iterable<T> iterable, int i2) {
        Preconditions.checkNotNull(iterable);
        return iterable instanceof List ? (T) ((List) iterable).get(i2) : (T) Iterators.get(iterable.iterator(), i2);
    }

    @ParametricNullness
    public static <T> T get(Iterable<? extends T> iterable, int i2, @ParametricNullness T t2) {
        Preconditions.checkNotNull(iterable);
        Iterators.checkNonnegative(i2);
        if (iterable instanceof List) {
            List listCast = Lists.cast(iterable);
            return i2 < listCast.size() ? (T) listCast.get(i2) : t2;
        }
        Iterator<? extends T> it = iterable.iterator();
        Iterators.advance(it, i2);
        return (T) Iterators.getNext(it, t2);
    }

    @ParametricNullness
    public static <T> T getFirst(Iterable<? extends T> iterable, @ParametricNullness T t2) {
        return (T) Iterators.getNext(iterable.iterator(), t2);
    }

    @ParametricNullness
    public static <T> T getLast(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return (T) Iterators.getLast(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) getLastInNonemptyList(list);
    }

    @ParametricNullness
    public static <T> T getLast(Iterable<? extends T> iterable, @ParametricNullness T t2) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return t2;
            }
            if (iterable instanceof List) {
                return (T) getLastInNonemptyList(Lists.cast(iterable));
            }
        }
        return (T) Iterators.getLast(iterable.iterator(), t2);
    }

    @ParametricNullness
    private static <T> T getLastInNonemptyList(List<T> list) {
        return list.get(list.size() - 1);
    }

    @ParametricNullness
    public static <T> T getOnlyElement(Iterable<T> iterable) {
        return (T) Iterators.getOnlyElement(iterable.iterator());
    }

    @ParametricNullness
    public static <T> T getOnlyElement(Iterable<? extends T> iterable, @ParametricNullness T t2) {
        return (T) Iterators.getOnlyElement(iterable.iterator(), t2);
    }

    public static <T> int indexOf(Iterable<T> iterable, Predicate<? super T> predicate) {
        return Iterators.indexOf(iterable.iterator(), predicate);
    }

    public static boolean isEmpty(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext();
    }

    public static <T> Iterable<T> limit(final Iterable<T> iterable, final int limitSize) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkArgument(limitSize >= 0, "limit is negative");
        return new FluentIterable<T>() { // from class: com.google.common.collect.Iterables.7
            final /* synthetic */ Iterable val$iterable;
            final /* synthetic */ int val$limitSize;

            AnonymousClass7(final Iterable iterable2, final int limitSize2) {
                val$iterable = iterable2;
                val$limitSize = limitSize2;
            }

            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return Iterators.limit(val$iterable.iterator(), val$limitSize);
            }
        };
    }

    public static <T> Iterable<T> mergeSorted(final Iterable<? extends Iterable<? extends T>> iterables, final Comparator<? super T> comparator) {
        Preconditions.checkNotNull(iterables, "iterables");
        Preconditions.checkNotNull(comparator, "comparator");
        return new UnmodifiableIterable(new FluentIterable<T>() { // from class: com.google.common.collect.Iterables.9
            final /* synthetic */ Comparator val$comparator;
            final /* synthetic */ Iterable val$iterables;

            AnonymousClass9(final Iterable iterables2, final Comparator comparator2) {
                val$iterables = iterables2;
                val$comparator = comparator2;
            }

            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return Iterators.mergeSorted(Iterables.transform(val$iterables, new FluentIterable$2$$ExternalSyntheticLambda0()), val$comparator);
            }
        });
    }

    public static <T> Iterable<List<T>> paddedPartition(final Iterable<T> iterable, final int size) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkArgument(size > 0);
        return new FluentIterable<List<T>>() { // from class: com.google.common.collect.Iterables.3
            final /* synthetic */ Iterable val$iterable;
            final /* synthetic */ int val$size;

            AnonymousClass3(final Iterable iterable2, final int size2) {
                val$iterable = iterable2;
                val$size = size2;
            }

            @Override // java.lang.Iterable
            public Iterator<List<T>> iterator() {
                return Iterators.paddedPartition(val$iterable.iterator(), val$size);
            }
        };
    }

    public static <T> Iterable<List<T>> partition(final Iterable<T> iterable, final int size) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkArgument(size > 0);
        return new FluentIterable<List<T>>() { // from class: com.google.common.collect.Iterables.2
            final /* synthetic */ Iterable val$iterable;
            final /* synthetic */ int val$size;

            AnonymousClass2(final Iterable iterable2, final int size2) {
                val$iterable = iterable2;
                val$size = size2;
            }

            @Override // java.lang.Iterable
            public Iterator<List<T>> iterator() {
                return Iterators.partition(val$iterable.iterator(), val$size);
            }
        };
    }

    public static boolean removeAll(Iterable<?> removeFrom, Collection<?> elementsToRemove) {
        return removeFrom instanceof Collection ? ((Collection) removeFrom).removeAll((Collection) Preconditions.checkNotNull(elementsToRemove)) : Iterators.removeAll(removeFrom.iterator(), elementsToRemove);
    }

    @CheckForNull
    static <T> T removeFirstMatching(Iterable<T> removeFrom, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate);
        Iterator<T> it = removeFrom.iterator();
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    public static <T> boolean removeIf(Iterable<T> removeFrom, Predicate<? super T> predicate) {
        return ((removeFrom instanceof RandomAccess) && (removeFrom instanceof List)) ? removeIfFromRandomAccessList((List) removeFrom, (Predicate) Preconditions.checkNotNull(predicate)) : Iterators.removeIf(removeFrom.iterator(), predicate);
    }

    private static <T> boolean removeIfFromRandomAccessList(List<T> list, Predicate<? super T> predicate) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < list.size()) {
            T t2 = list.get(i2);
            if (!predicate.apply(t2)) {
                if (i2 > i3) {
                    try {
                        list.set(i3, t2);
                    } catch (IllegalArgumentException unused) {
                        slowRemoveIfForRemainingElements(list, predicate, i3, i2);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        slowRemoveIfForRemainingElements(list, predicate, i3, i2);
                        return true;
                    }
                }
                i3++;
            }
            i2++;
        }
        list.subList(i3, list.size()).clear();
        return i2 != i3;
    }

    public static boolean retainAll(Iterable<?> removeFrom, Collection<?> elementsToRetain) {
        return removeFrom instanceof Collection ? ((Collection) removeFrom).retainAll((Collection) Preconditions.checkNotNull(elementsToRetain)) : Iterators.retainAll(removeFrom.iterator(), elementsToRetain);
    }

    public static int size(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).size() : Iterators.size(iterable.iterator());
    }

    public static <T> Iterable<T> skip(final Iterable<T> iterable, final int numberToSkip) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkArgument(numberToSkip >= 0, "number to skip cannot be negative");
        return new FluentIterable<T>() { // from class: com.google.common.collect.Iterables.6
            final /* synthetic */ Iterable val$iterable;
            final /* synthetic */ int val$numberToSkip;

            /* JADX INFO: renamed from: com.google.common.collect.Iterables$6$1 */
            class AnonymousClass1 implements Iterator<T> {
                boolean atStart = true;
                final /* synthetic */ Iterator val$iterator;

                AnonymousClass1(AnonymousClass6 this, Iterator it2) {
                    val$iterator = it2;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return val$iterator.hasNext();
                }

                @Override // java.util.Iterator
                @ParametricNullness
                public T next() {
                    T t2 = (T) val$iterator.next();
                    this.atStart = false;
                    return t2;
                }

                @Override // java.util.Iterator
                public void remove() {
                    CollectPreconditions.checkRemove(!this.atStart);
                    val$iterator.remove();
                }
            }

            AnonymousClass6(final Iterable iterable2, final int numberToSkip2) {
                val$iterable = iterable2;
                val$numberToSkip = numberToSkip2;
            }

            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                Iterable iterable2 = val$iterable;
                if (iterable2 instanceof List) {
                    List list = (List) iterable2;
                    return list.subList(Math.min(list.size(), val$numberToSkip), list.size()).iterator();
                }
                Iterator it2 = iterable2.iterator();
                Iterators.advance(it2, val$numberToSkip);
                return new Iterator<T>(this) { // from class: com.google.common.collect.Iterables.6.1
                    boolean atStart = true;
                    final /* synthetic */ Iterator val$iterator;

                    AnonymousClass1(AnonymousClass6 this, Iterator it22) {
                        val$iterator = it22;
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return val$iterator.hasNext();
                    }

                    @Override // java.util.Iterator
                    @ParametricNullness
                    public T next() {
                        T t2 = (T) val$iterator.next();
                        this.atStart = false;
                        return t2;
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        CollectPreconditions.checkRemove(!this.atStart);
                        val$iterator.remove();
                    }
                };
            }
        };
    }

    private static <T> void slowRemoveIfForRemainingElements(List<T> list, Predicate<? super T> predicate, int to, int from) {
        for (int size = list.size() - 1; size > from; size--) {
            if (predicate.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i2 = from - 1; i2 >= to; i2--) {
            list.remove(i2);
        }
    }

    static Object[] toArray(Iterable<?> iterable) {
        return castOrCopyToCollection(iterable).toArray();
    }

    public static <T> T[] toArray(Iterable<? extends T> iterable, Class<T> cls) {
        return (T[]) toArray(iterable, ObjectArrays.newArray(cls, 0));
    }

    static <T> T[] toArray(Iterable<? extends T> iterable, T[] tArr) {
        return (T[]) castOrCopyToCollection(iterable).toArray(tArr);
    }

    public static String toString(Iterable<?> iterable) {
        return Iterators.toString(iterable.iterator());
    }

    public static <F, T> Iterable<T> transform(final Iterable<F> fromIterable, final Function<? super F, ? extends T> function) {
        Preconditions.checkNotNull(fromIterable);
        Preconditions.checkNotNull(function);
        return new FluentIterable<T>() { // from class: com.google.common.collect.Iterables.5
            final /* synthetic */ Iterable val$fromIterable;
            final /* synthetic */ Function val$function;

            AnonymousClass5(final Iterable fromIterable2, final Function function2) {
                val$fromIterable = fromIterable2;
                val$function = function2;
            }

            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return Iterators.transform(val$fromIterable.iterator(), val$function);
            }
        };
    }

    public static <T> Optional<T> tryFind(Iterable<T> iterable, Predicate<? super T> predicate) {
        return Iterators.tryFind(iterable.iterator(), predicate);
    }

    @Deprecated
    public static <E> Iterable<E> unmodifiableIterable(ImmutableCollection<E> iterable) {
        return (Iterable) Preconditions.checkNotNull(iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Iterable<T> unmodifiableIterable(final Iterable<? extends T> iterable) {
        Preconditions.checkNotNull(iterable);
        return ((iterable instanceof UnmodifiableIterable) || (iterable instanceof ImmutableCollection)) ? iterable : new UnmodifiableIterable(iterable);
    }
}
