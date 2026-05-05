package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.primitives.Ints;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import javax.annotation.CheckForNull;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public final class Iterators {

    /* JADX INFO: renamed from: com.google.common.collect.Iterators$1 */
    class AnonymousClass1<T> extends UnmodifiableIterator<T> {
        final /* synthetic */ Iterator val$iterator;

        AnonymousClass1(final Iterator val$iterator) {
            val$iterator = val$iterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return val$iterator.hasNext();
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            return (T) val$iterator.next();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterators$10 */
    class AnonymousClass10<T> extends UnmodifiableIterator<T> {
        final /* synthetic */ Enumeration val$enumeration;

        AnonymousClass10(final Enumeration val$enumeration) {
            val$enumeration = val$enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return val$enumeration.hasMoreElements();
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            return (T) val$enumeration.nextElement();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterators$11 */
    class AnonymousClass11<T> implements Enumeration<T> {
        final /* synthetic */ Iterator val$iterator;

        AnonymousClass11(final Iterator val$iterator) {
            val$iterator = val$iterator;
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return val$iterator.hasNext();
        }

        @Override // java.util.Enumeration
        @ParametricNullness
        public T nextElement() {
            return (T) val$iterator.next();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterators$2 */
    class AnonymousClass2<T> implements Iterator<T> {
        Iterator<T> iterator = Iterators.emptyModifiableIterator();
        final /* synthetic */ Iterable val$iterable;

        AnonymousClass2(final Iterable val$iterable) {
            val$iterable = val$iterable;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext() || val$iterable.iterator().hasNext();
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            if (!this.iterator.hasNext()) {
                Iterator<T> it = val$iterable.iterator();
                this.iterator = it;
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
            }
            return this.iterator.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.iterator.remove();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterators$3 */
    class AnonymousClass3<I> extends UnmodifiableIterator<I> {
        int index = 0;
        final /* synthetic */ Iterator[] val$elements;

        AnonymousClass3(final Iterator[] val$elements) {
            val$elements = val$elements;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < val$elements.length;
        }

        @Override // java.util.Iterator
        public Iterator next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Iterator it = (Iterator) Objects.requireNonNull(val$elements[this.index]);
            Iterator[] itArr = val$elements;
            int i2 = this.index;
            itArr[i2] = null;
            this.index = i2 + 1;
            return it;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterators$4 */
    class AnonymousClass4<T> extends UnmodifiableIterator<List<T>> {
        final /* synthetic */ Iterator val$iterator;
        final /* synthetic */ boolean val$pad;
        final /* synthetic */ int val$size;

        AnonymousClass4(final Iterator val$iterator, final int val$size, final boolean val$pad) {
            val$iterator = val$iterator;
            val$size = val$size;
            val$pad = val$pad;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return val$iterator.hasNext();
        }

        @Override // java.util.Iterator
        public List<T> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object[] objArr = new Object[val$size];
            int i2 = 0;
            while (i2 < val$size && val$iterator.hasNext()) {
                objArr[i2] = val$iterator.next();
                i2++;
            }
            for (int i3 = i2; i3 < val$size; i3++) {
                objArr[i3] = null;
            }
            List<T> listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(objArr));
            return (val$pad || i2 == val$size) ? listUnmodifiableList : listUnmodifiableList.subList(0, i2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterators$5 */
    class AnonymousClass5<T> extends AbstractIterator<T> {
        final /* synthetic */ Predicate val$retainIfTrue;
        final /* synthetic */ Iterator val$unfiltered;

        AnonymousClass5(final Iterator val$unfiltered, final Predicate val$retainIfTrue) {
            val$unfiltered = val$unfiltered;
            val$retainIfTrue = val$retainIfTrue;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.common.collect.AbstractIterator
        @CheckForNull
        protected T computeNext() {
            while (val$unfiltered.hasNext()) {
                T t2 = (T) val$unfiltered.next();
                if (val$retainIfTrue.apply(t2)) {
                    return t2;
                }
            }
            return endOfData();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterators$6 */
    class AnonymousClass6<F, T> extends TransformedIterator<F, T> {
        final /* synthetic */ Function val$function;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(Iterator backingIterator, final Function val$function) {
            super(backingIterator);
            val$function = val$function;
        }

        @Override // com.google.common.collect.TransformedIterator
        @ParametricNullness
        T transform(@ParametricNullness F f2) {
            return (T) val$function.apply(f2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterators$7 */
    class AnonymousClass7<T> implements Iterator<T> {
        private int count;
        final /* synthetic */ Iterator val$iterator;
        final /* synthetic */ int val$limitSize;

        AnonymousClass7(final int val$limitSize, final Iterator val$iterator) {
            val$limitSize = val$limitSize;
            val$iterator = val$iterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.count < val$limitSize && val$iterator.hasNext();
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.count++;
            return (T) val$iterator.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            val$iterator.remove();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterators$8 */
    class AnonymousClass8<T> extends UnmodifiableIterator<T> {
        final /* synthetic */ Iterator val$iterator;

        AnonymousClass8(final Iterator val$iterator) {
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
            val$iterator.remove();
            return t2;
        }

        public String toString() {
            return "Iterators.consumingIterator(...)";
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterators$9 */
    class AnonymousClass9<T> extends UnmodifiableIterator<T> {
        boolean done;
        final /* synthetic */ Object val$value;

        AnonymousClass9(final Object val$value) {
            val$value = val$value;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.done;
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            if (this.done) {
                throw new NoSuchElementException();
            }
            this.done = true;
            return (T) val$value;
        }
    }

    private static final class ArrayItr<T> extends AbstractIndexedListIterator<T> {
        static final UnmodifiableListIterator<Object> EMPTY = new ArrayItr(new Object[0], 0, 0, 0);
        private final T[] array;
        private final int offset;

        ArrayItr(T[] array, int offset, int length, int index) {
            super(length, index);
            this.array = array;
            this.offset = offset;
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        @ParametricNullness
        protected T get(int index) {
            return this.array[this.offset + index];
        }
    }

    private static class ConcatenatedIterator<T> implements Iterator<T> {
        private Iterator<? extends T> iterator = Iterators.emptyIterator();

        @CheckForNull
        private Deque<Iterator<? extends Iterator<? extends T>>> metaIterators;

        @CheckForNull
        private Iterator<? extends T> toRemove;

        @CheckForNull
        private Iterator<? extends Iterator<? extends T>> topMetaIterator;

        ConcatenatedIterator(Iterator<? extends Iterator<? extends T>> metaIterator) {
            this.topMetaIterator = (Iterator) Preconditions.checkNotNull(metaIterator);
        }

        @CheckForNull
        private Iterator<? extends Iterator<? extends T>> getTopMetaIterator() {
            while (true) {
                Iterator<? extends Iterator<? extends T>> it = this.topMetaIterator;
                if (it != null && it.hasNext()) {
                    return this.topMetaIterator;
                }
                Deque<Iterator<? extends Iterator<? extends T>>> deque = this.metaIterators;
                if (deque == null || deque.isEmpty()) {
                    return null;
                }
                this.topMetaIterator = this.metaIterators.removeFirst();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!((Iterator) Preconditions.checkNotNull(this.iterator)).hasNext()) {
                Iterator<? extends Iterator<? extends T>> topMetaIterator = getTopMetaIterator();
                this.topMetaIterator = topMetaIterator;
                if (topMetaIterator == null) {
                    return false;
                }
                Iterator<? extends T> next = topMetaIterator.next();
                this.iterator = next;
                if (next instanceof ConcatenatedIterator) {
                    ConcatenatedIterator concatenatedIterator = (ConcatenatedIterator) next;
                    this.iterator = concatenatedIterator.iterator;
                    if (this.metaIterators == null) {
                        this.metaIterators = new ArrayDeque();
                    }
                    this.metaIterators.addFirst(this.topMetaIterator);
                    if (concatenatedIterator.metaIterators != null) {
                        while (!concatenatedIterator.metaIterators.isEmpty()) {
                            this.metaIterators.addFirst(concatenatedIterator.metaIterators.removeLast());
                        }
                    }
                    this.topMetaIterator = concatenatedIterator.topMetaIterator;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Iterator<? extends T> it = this.iterator;
            this.toRemove = it;
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            Iterator<? extends T> it = this.toRemove;
            if (it == null) {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
            it.remove();
            this.toRemove = null;
        }
    }

    private enum EmptyModifiableIterator implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            CollectPreconditions.checkRemove(false);
        }
    }

    static class MergingIterator<T> extends UnmodifiableIterator<T> {
        final Queue<PeekingIterator<T>> queue;

        public MergingIterator(Iterable<? extends Iterator<? extends T>> iterators, final Comparator<? super T> itemComparator) {
            this.queue = new PriorityQueue(2, new Comparator() { // from class: com.google.common.collect.Iterators$MergingIterator$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return itemComparator.compare(((PeekingIterator) obj).peek(), ((PeekingIterator) obj2).peek());
                }
            });
            for (Iterator<? extends T> it : iterators) {
                if (it.hasNext()) {
                    this.queue.add(Iterators.peekingIterator(it));
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.queue.isEmpty();
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            PeekingIterator<T> peekingIteratorRemove = this.queue.remove();
            T next = peekingIteratorRemove.next();
            if (peekingIteratorRemove.hasNext()) {
                this.queue.add(peekingIteratorRemove);
            }
            return next;
        }
    }

    private static class PeekingImpl<E> implements PeekingIterator<E> {
        private boolean hasPeeked;
        private final Iterator<? extends E> iterator;

        @CheckForNull
        private E peekedElement;

        public PeekingImpl(Iterator<? extends E> iterator) {
            this.iterator = (Iterator) Preconditions.checkNotNull(iterator);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.hasPeeked || this.iterator.hasNext();
        }

        @Override // com.google.common.collect.PeekingIterator, java.util.Iterator
        @ParametricNullness
        public E next() {
            if (!this.hasPeeked) {
                return this.iterator.next();
            }
            E e2 = (E) NullnessCasts.uncheckedCastNullableTToT(this.peekedElement);
            this.hasPeeked = false;
            this.peekedElement = null;
            return e2;
        }

        @Override // com.google.common.collect.PeekingIterator
        @ParametricNullness
        public E peek() {
            if (!this.hasPeeked) {
                this.peekedElement = this.iterator.next();
                this.hasPeeked = true;
            }
            return (E) NullnessCasts.uncheckedCastNullableTToT(this.peekedElement);
        }

        @Override // com.google.common.collect.PeekingIterator, java.util.Iterator
        public void remove() {
            Preconditions.checkState(!this.hasPeeked, "Can't remove after you've peeked at next");
            this.iterator.remove();
        }
    }

    private Iterators() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static <T> boolean addAll(Collection<T> collection, Iterator<? extends T> it) {
        Preconditions.checkNotNull(collection);
        Preconditions.checkNotNull(it);
        ?? r2 = 0;
        while (it.hasNext()) {
            boolean zAdd = collection.add(it.next());
            int i2 = (r2 + (zAdd ? 1 : 0)) - (r2 & (zAdd ? 1 : 0));
            r2 = 1;
            if (i2 != 1) {
                r2 = 0;
            }
        }
        return r2;
    }

    public static int advance(Iterator<?> iterator, int numberToAdvance) {
        Preconditions.checkNotNull(iterator);
        int i2 = 0;
        Preconditions.checkArgument(numberToAdvance >= 0, "numberToAdvance must be nonnegative");
        while (i2 < numberToAdvance && iterator.hasNext()) {
            iterator.next();
            i2++;
        }
        return i2;
    }

    public static <T> boolean all(Iterator<T> iterator, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate);
        while (iterator.hasNext()) {
            if (!predicate.apply(iterator.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean any(Iterator<T> iterator, Predicate<? super T> predicate) {
        return indexOf(iterator, predicate) != -1;
    }

    public static <T> Enumeration<T> asEnumeration(Iterator<T> iterator) {
        Preconditions.checkNotNull(iterator);
        return new Enumeration<T>() { // from class: com.google.common.collect.Iterators.11
            final /* synthetic */ Iterator val$iterator;

            AnonymousClass11(Iterator iterator2) {
                val$iterator = iterator2;
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return val$iterator.hasNext();
            }

            @Override // java.util.Enumeration
            @ParametricNullness
            public T nextElement() {
                return (T) val$iterator.next();
            }
        };
    }

    static <T> ListIterator<T> cast(Iterator<T> iterator) {
        return (ListIterator) iterator;
    }

    static void checkNonnegative(int position) {
        if (position < 0) {
            throw new IndexOutOfBoundsException("position (" + position + ") must not be negative");
        }
    }

    static void clear(Iterator<?> iterator) {
        Preconditions.checkNotNull(iterator);
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }

    public static <T> Iterator<T> concat(Iterator<? extends Iterator<? extends T>> inputs) {
        return new ConcatenatedIterator(inputs);
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> a2, Iterator<? extends T> b2) {
        Preconditions.checkNotNull(a2);
        Preconditions.checkNotNull(b2);
        return concat(consumingForArray(a2, b2));
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> a2, Iterator<? extends T> b2, Iterator<? extends T> c2) {
        Preconditions.checkNotNull(a2);
        Preconditions.checkNotNull(b2);
        Preconditions.checkNotNull(c2);
        return concat(consumingForArray(a2, b2, c2));
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> a2, Iterator<? extends T> b2, Iterator<? extends T> c2, Iterator<? extends T> d2) {
        Preconditions.checkNotNull(a2);
        Preconditions.checkNotNull(b2);
        Preconditions.checkNotNull(c2);
        Preconditions.checkNotNull(d2);
        return concat(consumingForArray(a2, b2, c2, d2));
    }

    public static <T> Iterator<T> concat(Iterator<? extends T>... inputs) {
        return concatNoDefensiveCopy((Iterator[]) Arrays.copyOf(inputs, inputs.length));
    }

    static <T> Iterator<T> concatNoDefensiveCopy(Iterator<? extends T>... inputs) {
        for (Iterator it : (Iterator[]) Preconditions.checkNotNull(inputs)) {
            Preconditions.checkNotNull(it);
        }
        return concat(consumingForArray(inputs));
    }

    private static <I extends Iterator<?>> Iterator<I> consumingForArray(I... elements) {
        return new UnmodifiableIterator<I>() { // from class: com.google.common.collect.Iterators.3
            int index = 0;
            final /* synthetic */ Iterator[] val$elements;

            AnonymousClass3(Iterator[] elements2) {
                val$elements = elements2;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < val$elements.length;
            }

            @Override // java.util.Iterator
            public Iterator next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Iterator it = (Iterator) Objects.requireNonNull(val$elements[this.index]);
                Iterator[] itArr = val$elements;
                int i2 = this.index;
                itArr[i2] = null;
                this.index = i2 + 1;
                return it;
            }
        };
    }

    public static <T> Iterator<T> consumingIterator(Iterator<T> iterator) {
        Preconditions.checkNotNull(iterator);
        return new UnmodifiableIterator<T>() { // from class: com.google.common.collect.Iterators.8
            final /* synthetic */ Iterator val$iterator;

            AnonymousClass8(Iterator iterator2) {
                val$iterator = iterator2;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return val$iterator.hasNext();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                T t2 = (T) val$iterator.next();
                val$iterator.remove();
                return t2;
            }

            public String toString() {
                return "Iterators.consumingIterator(...)";
            }
        };
    }

    public static boolean contains(Iterator<?> iterator, @CheckForNull Object element) {
        if (element == null) {
            while (iterator.hasNext()) {
                if (iterator.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (iterator.hasNext()) {
            if (element.equals(iterator.next())) {
                return true;
            }
        }
        return false;
    }

    public static <T> Iterator<T> cycle(Iterable<T> iterable) {
        Preconditions.checkNotNull(iterable);
        return new Iterator<T>() { // from class: com.google.common.collect.Iterators.2
            Iterator<T> iterator = Iterators.emptyModifiableIterator();
            final /* synthetic */ Iterable val$iterable;

            AnonymousClass2(Iterable iterable2) {
                val$iterable = iterable2;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.iterator.hasNext() || val$iterable.iterator().hasNext();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                if (!this.iterator.hasNext()) {
                    Iterator<T> it = val$iterable.iterator();
                    this.iterator = it;
                    if (!it.hasNext()) {
                        throw new NoSuchElementException();
                    }
                }
                return this.iterator.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.iterator.remove();
            }
        };
    }

    @SafeVarargs
    public static <T> Iterator<T> cycle(T... elements) {
        return cycle(Lists.newArrayList(elements));
    }

    public static boolean elementsEqual(Iterator<?> iterator1, Iterator<?> iterator2) {
        while (iterator1.hasNext()) {
            if (!iterator2.hasNext() || !com.google.common.base.Objects.equal(iterator1.next(), iterator2.next())) {
                return false;
            }
        }
        return !iterator2.hasNext();
    }

    static <T> UnmodifiableIterator<T> emptyIterator() {
        return emptyListIterator();
    }

    static <T> UnmodifiableListIterator<T> emptyListIterator() {
        return (UnmodifiableListIterator<T>) ArrayItr.EMPTY;
    }

    static <T> Iterator<T> emptyModifiableIterator() {
        return EmptyModifiableIterator.INSTANCE;
    }

    public static <T> UnmodifiableIterator<T> filter(Iterator<T> unfiltered, Predicate<? super T> retainIfTrue) {
        Preconditions.checkNotNull(unfiltered);
        Preconditions.checkNotNull(retainIfTrue);
        return new AbstractIterator<T>() { // from class: com.google.common.collect.Iterators.5
            final /* synthetic */ Predicate val$retainIfTrue;
            final /* synthetic */ Iterator val$unfiltered;

            AnonymousClass5(Iterator unfiltered2, Predicate retainIfTrue2) {
                val$unfiltered = unfiltered2;
                val$retainIfTrue = retainIfTrue2;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            protected T computeNext() {
                while (val$unfiltered.hasNext()) {
                    T t2 = (T) val$unfiltered.next();
                    if (val$retainIfTrue.apply(t2)) {
                        return t2;
                    }
                }
                return endOfData();
            }
        };
    }

    public static <T> UnmodifiableIterator<T> filter(Iterator<?> unfiltered, Class<T> desiredType) {
        return filter(unfiltered, Predicates.instanceOf(desiredType));
    }

    @ParametricNullness
    public static <T> T find(Iterator<T> iterator, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(iterator);
        Preconditions.checkNotNull(predicate);
        while (iterator.hasNext()) {
            T next = iterator.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object] */
    @CheckForNull
    public static <T> T find(Iterator<? extends T> it, Predicate<? super T> predicate, @CheckForNull T t2) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(predicate);
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        return t2;
    }

    @SafeVarargs
    public static <T> UnmodifiableIterator<T> forArray(T... array) {
        return forArray(array, 0, array.length, 0);
    }

    static <T> UnmodifiableListIterator<T> forArray(T[] array, int offset, int length, int index) {
        Preconditions.checkArgument(length >= 0);
        Preconditions.checkPositionIndexes(offset, offset + length, array.length);
        Preconditions.checkPositionIndex(index, length);
        return length == 0 ? emptyListIterator() : new ArrayItr(array, offset, length, index);
    }

    public static <T> UnmodifiableIterator<T> forEnumeration(Enumeration<T> enumeration) {
        Preconditions.checkNotNull(enumeration);
        return new UnmodifiableIterator<T>() { // from class: com.google.common.collect.Iterators.10
            final /* synthetic */ Enumeration val$enumeration;

            AnonymousClass10(Enumeration enumeration2) {
                val$enumeration = enumeration2;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return val$enumeration.hasMoreElements();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                return (T) val$enumeration.nextElement();
            }
        };
    }

    public static int frequency(Iterator<?> iterator, @CheckForNull Object element) {
        int i2 = 0;
        while (contains(iterator, element)) {
            i2++;
        }
        return i2;
    }

    @ParametricNullness
    public static <T> T get(Iterator<T> iterator, int position) {
        checkNonnegative(position);
        int iAdvance = advance(iterator, position);
        if (iterator.hasNext()) {
            return iterator.next();
        }
        throw new IndexOutOfBoundsException("position (" + position + ") must be less than the number of elements that remained (" + iAdvance + ")");
    }

    @ParametricNullness
    public static <T> T get(Iterator<? extends T> it, int i2, @ParametricNullness T t2) {
        checkNonnegative(i2);
        advance(it, i2);
        return (T) getNext(it, t2);
    }

    @ParametricNullness
    public static <T> T getLast(Iterator<T> iterator) {
        T next;
        do {
            next = iterator.next();
        } while (iterator.hasNext());
        return next;
    }

    @ParametricNullness
    public static <T> T getLast(Iterator<? extends T> it, @ParametricNullness T t2) {
        return it.hasNext() ? (T) getLast(it) : t2;
    }

    @ParametricNullness
    public static <T> T getNext(Iterator<? extends T> iterator, @ParametricNullness T defaultValue) {
        return iterator.hasNext() ? iterator.next() : defaultValue;
    }

    @ParametricNullness
    public static <T> T getOnlyElement(Iterator<T> iterator) {
        T next = iterator.next();
        if (!iterator.hasNext()) {
            return next;
        }
        StringBuilder sbAppend = new StringBuilder("expected one element but was: <").append(next);
        for (int i2 = 0; i2 < 4 && iterator.hasNext(); i2++) {
            sbAppend.append(", ").append(iterator.next());
        }
        if (iterator.hasNext()) {
            sbAppend.append(", ...");
        }
        sbAppend.append(Typography.greater);
        throw new IllegalArgumentException(sbAppend.toString());
    }

    @ParametricNullness
    public static <T> T getOnlyElement(Iterator<? extends T> it, @ParametricNullness T t2) {
        return it.hasNext() ? (T) getOnlyElement(it) : t2;
    }

    public static <T> int indexOf(Iterator<T> iterator, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate, "predicate");
        int i2 = 0;
        while (iterator.hasNext()) {
            if (predicate.apply(iterator.next())) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static <T> Iterator<T> limit(Iterator<T> iterator, int limitSize) {
        Preconditions.checkNotNull(iterator);
        Preconditions.checkArgument(limitSize >= 0, "limit is negative");
        return new Iterator<T>() { // from class: com.google.common.collect.Iterators.7
            private int count;
            final /* synthetic */ Iterator val$iterator;
            final /* synthetic */ int val$limitSize;

            AnonymousClass7(int limitSize2, Iterator iterator2) {
                val$limitSize = limitSize2;
                val$iterator = iterator2;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.count < val$limitSize && val$iterator.hasNext();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.count++;
                return (T) val$iterator.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                val$iterator.remove();
            }
        };
    }

    public static <T> UnmodifiableIterator<T> mergeSorted(Iterable<? extends Iterator<? extends T>> iterators, Comparator<? super T> comparator) {
        Preconditions.checkNotNull(iterators, "iterators");
        Preconditions.checkNotNull(comparator, "comparator");
        return new MergingIterator(iterators, comparator);
    }

    public static <T> UnmodifiableIterator<List<T>> paddedPartition(Iterator<T> iterator, int size) {
        return partitionImpl(iterator, size, true);
    }

    public static <T> UnmodifiableIterator<List<T>> partition(Iterator<T> iterator, int size) {
        return partitionImpl(iterator, size, false);
    }

    private static <T> UnmodifiableIterator<List<T>> partitionImpl(Iterator<T> iterator, int size, boolean pad) {
        Preconditions.checkNotNull(iterator);
        Preconditions.checkArgument(size > 0);
        return new UnmodifiableIterator<List<T>>() { // from class: com.google.common.collect.Iterators.4
            final /* synthetic */ Iterator val$iterator;
            final /* synthetic */ boolean val$pad;
            final /* synthetic */ int val$size;

            AnonymousClass4(Iterator iterator2, int size2, boolean pad2) {
                val$iterator = iterator2;
                val$size = size2;
                val$pad = pad2;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return val$iterator.hasNext();
            }

            @Override // java.util.Iterator
            public List<T> next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = new Object[val$size];
                int i2 = 0;
                while (i2 < val$size && val$iterator.hasNext()) {
                    objArr[i2] = val$iterator.next();
                    i2++;
                }
                for (int i3 = i2; i3 < val$size; i3++) {
                    objArr[i3] = null;
                }
                List<T> listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(objArr));
                return (val$pad || i2 == val$size) ? listUnmodifiableList : listUnmodifiableList.subList(0, i2);
            }
        };
    }

    @Deprecated
    public static <T> PeekingIterator<T> peekingIterator(PeekingIterator<T> iterator) {
        return (PeekingIterator) Preconditions.checkNotNull(iterator);
    }

    public static <T> PeekingIterator<T> peekingIterator(Iterator<? extends T> iterator) {
        return iterator instanceof PeekingImpl ? (PeekingImpl) iterator : new PeekingImpl(iterator);
    }

    @CheckForNull
    static <T> T pollNext(Iterator<T> iterator) {
        if (!iterator.hasNext()) {
            return null;
        }
        T next = iterator.next();
        iterator.remove();
        return next;
    }

    public static boolean removeAll(Iterator<?> removeFrom, Collection<?> elementsToRemove) {
        Preconditions.checkNotNull(elementsToRemove);
        boolean z2 = false;
        while (removeFrom.hasNext()) {
            if (elementsToRemove.contains(removeFrom.next())) {
                removeFrom.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static <T> boolean removeIf(Iterator<T> removeFrom, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate);
        boolean z2 = false;
        while (removeFrom.hasNext()) {
            if (predicate.apply(removeFrom.next())) {
                removeFrom.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static boolean retainAll(Iterator<?> removeFrom, Collection<?> elementsToRetain) {
        Preconditions.checkNotNull(elementsToRetain);
        boolean z2 = false;
        while (removeFrom.hasNext()) {
            if (!elementsToRetain.contains(removeFrom.next())) {
                removeFrom.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static <T> UnmodifiableIterator<T> singletonIterator(@ParametricNullness T value) {
        return new UnmodifiableIterator<T>() { // from class: com.google.common.collect.Iterators.9
            boolean done;
            final /* synthetic */ Object val$value;

            AnonymousClass9(Object value2) {
                val$value = value2;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return !this.done;
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                if (this.done) {
                    throw new NoSuchElementException();
                }
                this.done = true;
                return (T) val$value;
            }
        };
    }

    public static int size(Iterator<?> iterator) {
        long j2 = 0;
        while (iterator.hasNext()) {
            iterator.next();
            j2++;
        }
        return Ints.saturatedCast(j2);
    }

    public static <T> T[] toArray(Iterator<? extends T> it, Class<T> cls) {
        return (T[]) Iterables.toArray(Lists.newArrayList(it), cls);
    }

    public static String toString(Iterator<?> iterator) {
        StringBuilder sb = new StringBuilder("[");
        boolean z2 = true;
        while (iterator.hasNext()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append(iterator.next());
            z2 = false;
        }
        return sb.append(AbstractJsonLexerKt.END_LIST).toString();
    }

    public static <F, T> Iterator<T> transform(Iterator<F> fromIterator, Function<? super F, ? extends T> function) {
        Preconditions.checkNotNull(function);
        return new TransformedIterator<F, T>(fromIterator) { // from class: com.google.common.collect.Iterators.6
            final /* synthetic */ Function val$function;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(Iterator fromIterator2, Function function2) {
                super(fromIterator2);
                val$function = function2;
            }

            @Override // com.google.common.collect.TransformedIterator
            @ParametricNullness
            T transform(@ParametricNullness F f2) {
                return (T) val$function.apply(f2);
            }
        };
    }

    public static <T> Optional<T> tryFind(Iterator<T> iterator, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(iterator);
        Preconditions.checkNotNull(predicate);
        while (iterator.hasNext()) {
            T next = iterator.next();
            if (predicate.apply(next)) {
                return Optional.of(next);
            }
        }
        return Optional.absent();
    }

    @Deprecated
    public static <T> UnmodifiableIterator<T> unmodifiableIterator(UnmodifiableIterator<T> iterator) {
        return (UnmodifiableIterator) Preconditions.checkNotNull(iterator);
    }

    public static <T> UnmodifiableIterator<T> unmodifiableIterator(Iterator<? extends T> iterator) {
        Preconditions.checkNotNull(iterator);
        return iterator instanceof UnmodifiableIterator ? (UnmodifiableIterator) iterator : new UnmodifiableIterator<T>() { // from class: com.google.common.collect.Iterators.1
            final /* synthetic */ Iterator val$iterator;

            AnonymousClass1(Iterator iterator2) {
                val$iterator = iterator2;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return val$iterator.hasNext();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                return (T) val$iterator.next();
            }
        };
    }
}
