package com.drew.lang;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ByteTrie<T> {
    private int _maxDepth;
    private final ByteTrieNode<T> _root = new ByteTrieNode<>();

    static class ByteTrieNode<T> {
        private final Map<Byte, ByteTrieNode<T>> _children = new HashMap();
        private T _value = null;

        ByteTrieNode() {
        }

        public void setValue(T t2) {
            if (this._value != null) {
                throw new RuntimeException("Value already set for this trie node");
            }
            this._value = t2;
        }
    }

    public void addPath(T t2, byte[]... bArr) {
        ByteTrieNode<T> byteTrieNode = this._root;
        int i2 = 0;
        for (byte[] bArr2 : bArr) {
            for (byte b2 : bArr2) {
                ByteTrieNode<T> byteTrieNode2 = (ByteTrieNode) ((ByteTrieNode) byteTrieNode)._children.get(Byte.valueOf(b2));
                if (byteTrieNode2 == null) {
                    byteTrieNode2 = new ByteTrieNode<>();
                    ((ByteTrieNode) byteTrieNode)._children.put(Byte.valueOf(b2), byteTrieNode2);
                }
                byteTrieNode = byteTrieNode2;
                i2++;
            }
        }
        if (i2 == 0) {
            throw new IllegalArgumentException("Parts must contain at least one byte.");
        }
        byteTrieNode.setValue(t2);
        this._maxDepth = Math.max(this._maxDepth, i2);
    }

    public T find(byte[] bArr) {
        return find(bArr, 0, bArr.length);
    }

    public T find(byte[] bArr, int i2, int i3) {
        int i4 = i3 + i2;
        if (i4 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        ByteTrieNode<T> byteTrieNode = this._root;
        T t2 = (T) ((ByteTrieNode) byteTrieNode)._value;
        while (i2 < i4) {
            byteTrieNode = (ByteTrieNode) ((ByteTrieNode) byteTrieNode)._children.get(Byte.valueOf(bArr[i2]));
            if (byteTrieNode == null) {
                break;
            }
            if (((ByteTrieNode) byteTrieNode)._value != null) {
                t2 = (T) ((ByteTrieNode) byteTrieNode)._value;
            }
            i2++;
        }
        return t2;
    }

    public int getMaxDepth() {
        return this._maxDepth;
    }

    public void setDefaultValue(T t2) {
        this._root.setValue(t2);
    }
}
