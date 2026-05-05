package org.msgpack.value;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface ArrayValue extends Value, Iterable<Value> {
    Value get(int i2);

    Value getOrNilValue(int i2);

    @Override // java.lang.Iterable
    Iterator<Value> iterator();

    List<Value> list();

    int size();
}
