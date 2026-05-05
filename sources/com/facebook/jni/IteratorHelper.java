package com.facebook.jni;

import java.util.Iterator;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class IteratorHelper {

    @Nullable
    private Object mElement;
    private final Iterator mIterator;

    public IteratorHelper(Iterable iterable) {
        this.mIterator = iterable.iterator();
    }

    public IteratorHelper(Iterator it) {
        this.mIterator = it;
    }

    boolean hasNext() {
        if (this.mIterator.hasNext()) {
            this.mElement = this.mIterator.next();
            return true;
        }
        this.mElement = null;
        return false;
    }
}
