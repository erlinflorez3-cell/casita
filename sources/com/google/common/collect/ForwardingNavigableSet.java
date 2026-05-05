package com.google.common.collect;

import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingNavigableSet<E> extends ForwardingSortedSet<E> implements NavigableSet<E> {

    protected class StandardDescendingSet extends Sets.DescendingSet<E> {
        public StandardDescendingSet(final ForwardingNavigableSet this$0) {
            super(this$0);
        }
    }

    protected ForwardingNavigableSet() {
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public E ceiling(@ParametricNullness E e2) {
        return delegate().ceiling(e2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract NavigableSet<E> delegate();

    @Override // java.util.NavigableSet
    public Iterator<E> descendingIterator() {
        return delegate().descendingIterator();
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> descendingSet() {
        return delegate().descendingSet();
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public E floor(@ParametricNullness E e2) {
        return delegate().floor(e2);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> headSet(@ParametricNullness E toElement, boolean inclusive) {
        return delegate().headSet(toElement, inclusive);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public E higher(@ParametricNullness E e2) {
        return delegate().higher(e2);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public E lower(@ParametricNullness E e2) {
        return delegate().lower(e2);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public E pollFirst() {
        return delegate().pollFirst();
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public E pollLast() {
        return delegate().pollLast();
    }

    @CheckForNull
    protected E standardCeiling(@ParametricNullness E e2) {
        return (E) Iterators.getNext(tailSet(e2, true).iterator(), null);
    }

    @ParametricNullness
    protected E standardFirst() {
        return iterator().next();
    }

    @CheckForNull
    protected E standardFloor(@ParametricNullness E e2) {
        return (E) Iterators.getNext(headSet(e2, true).descendingIterator(), null);
    }

    protected SortedSet<E> standardHeadSet(@ParametricNullness E toElement) {
        return headSet(toElement, false);
    }

    @CheckForNull
    protected E standardHigher(@ParametricNullness E e2) {
        return (E) Iterators.getNext(tailSet(e2, false).iterator(), null);
    }

    @ParametricNullness
    protected E standardLast() {
        return descendingIterator().next();
    }

    @CheckForNull
    protected E standardLower(@ParametricNullness E e2) {
        return (E) Iterators.getNext(headSet(e2, false).descendingIterator(), null);
    }

    @CheckForNull
    protected E standardPollFirst() {
        return (E) Iterators.pollNext(iterator());
    }

    @CheckForNull
    protected E standardPollLast() {
        return (E) Iterators.pollNext(descendingIterator());
    }

    protected NavigableSet<E> standardSubSet(@ParametricNullness E fromElement, boolean fromInclusive, @ParametricNullness E toElement, boolean toInclusive) {
        return tailSet(fromElement, fromInclusive).headSet(toElement, toInclusive);
    }

    @Override // com.google.common.collect.ForwardingSortedSet
    protected SortedSet<E> standardSubSet(@ParametricNullness E fromElement, @ParametricNullness E toElement) {
        return subSet(fromElement, true, toElement, false);
    }

    protected SortedSet<E> standardTailSet(@ParametricNullness E fromElement) {
        return tailSet(fromElement, true);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> subSet(@ParametricNullness E fromElement, boolean fromInclusive, @ParametricNullness E toElement, boolean toInclusive) {
        return delegate().subSet(fromElement, fromInclusive, toElement, toInclusive);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> tailSet(@ParametricNullness E fromElement, boolean inclusive) {
        return delegate().tailSet(fromElement, inclusive);
    }
}
