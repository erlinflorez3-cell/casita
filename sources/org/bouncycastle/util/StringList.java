package org.bouncycastle.util;

/* JADX INFO: loaded from: classes2.dex */
public interface StringList extends Iterable<String> {
    boolean add(String str);

    String get(int i2);

    int size();

    String[] toStringArray();

    String[] toStringArray(int i2, int i3);
}
