package com.google.common.collect;

import com.google.common.base.Objects;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
final class CompactHashing {
    private static final int BYTE_MASK = 255;
    private static final int BYTE_MAX_SIZE = 256;
    static final int DEFAULT_SIZE = 3;
    static final int HASH_TABLE_BITS_MASK = 31;
    private static final int HASH_TABLE_BITS_MAX_BITS = 5;
    static final int MAX_SIZE = 1073741823;
    private static final int MIN_HASH_TABLE_SIZE = 4;
    static final int MODIFICATION_COUNT_INCREMENT = 32;
    private static final int SHORT_MASK = 65535;
    private static final int SHORT_MAX_SIZE = 65536;
    static final byte UNSET = 0;

    private CompactHashing() {
    }

    static Object createTable(int buckets) {
        if (buckets < 2 || buckets > 1073741824 || Integer.highestOneBit(buckets) != buckets) {
            throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + buckets);
        }
        return buckets <= 256 ? new byte[buckets] : buckets <= 65536 ? new short[buckets] : new int[buckets];
    }

    static int getHashPrefix(int value, int mask) {
        return value & (~mask);
    }

    static int getNext(int entry, int mask) {
        return (-1) - (((-1) - entry) | ((-1) - mask));
    }

    static int maskCombine(int prefix, int suffix, int mask) {
        int i2 = (-1) - (((-1) - prefix) | ((-1) - (~mask)));
        int i3 = (suffix + mask) - (suffix | mask);
        return (i2 + i3) - (i2 & i3);
    }

    static int newCapacity(int mask) {
        return (mask < 32 ? 4 : 2) * (mask + 1);
    }

    static int remove(@CheckForNull Object key, @CheckForNull Object value, int mask, Object table, int[] entries, Object[] keys, @CheckForNull Object[] values) {
        int i2;
        int i3;
        int iSmearedHash = Hashing.smearedHash(key);
        int i4 = (-1) - (((-1) - iSmearedHash) | ((-1) - mask));
        int iTableGet = tableGet(table, i4);
        if (iTableGet == 0) {
            return -1;
        }
        int hashPrefix = getHashPrefix(iSmearedHash, mask);
        int i5 = -1;
        while (true) {
            i2 = iTableGet - 1;
            i3 = entries[i2];
            if (getHashPrefix(i3, mask) == hashPrefix && Objects.equal(key, keys[i2]) && (values == null || Objects.equal(value, values[i2]))) {
                break;
            }
            iTableGet = getNext(i3, mask);
            if (iTableGet == 0) {
                return -1;
            }
            i5 = i2;
        }
        int next = getNext(i3, mask);
        if (i5 == -1) {
            tableSet(table, i4, next);
        } else {
            entries[i5] = maskCombine(entries[i5], next, mask);
        }
        return i2;
    }

    static void tableClear(Object table) {
        if (table instanceof byte[]) {
            Arrays.fill((byte[]) table, (byte) 0);
        } else if (table instanceof short[]) {
            Arrays.fill((short[]) table, (short) 0);
        } else {
            Arrays.fill((int[]) table, 0);
        }
    }

    static int tableGet(Object table, int index) {
        if (!(table instanceof byte[])) {
            return table instanceof short[] ? (-1) - (((-1) - ((short[]) table)[index]) | ((-1) - 65535)) : ((int[]) table)[index];
        }
        byte b2 = ((byte[]) table)[index];
        return (b2 + 255) - (b2 | 255);
    }

    static void tableSet(Object table, int index, int entry) {
        if (table instanceof byte[]) {
            ((byte[]) table)[index] = (byte) entry;
        } else if (table instanceof short[]) {
            ((short[]) table)[index] = (short) entry;
        } else {
            ((int[]) table)[index] = entry;
        }
    }

    static int tableSize(int expectedSize) {
        return Math.max(4, Hashing.closedTableSize(expectedSize + 1, 1.0d));
    }
}
