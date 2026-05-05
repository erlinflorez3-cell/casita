package com.google.common.primitives;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
import kotlin.jvm.internal.CharCompanionObject;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public final class Chars {
    public static final int BYTES = 2;

    private static class CharArrayAsList extends AbstractList<Character> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final char[] array;
        final int end;
        final int start;

        CharArrayAsList(char[] array) {
            this(array, 0, array.length);
        }

        CharArrayAsList(char[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object target) {
            return (target instanceof Character) && Chars.indexOf(this.array, ((Character) target).charValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof CharArrayAsList)) {
                return super.equals(object);
            }
            CharArrayAsList charArrayAsList = (CharArrayAsList) object;
            int size = size();
            if (charArrayAsList.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (this.array[this.start + i2] != charArrayAsList.array[charArrayAsList.start + i2]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Character get(int index) {
            Preconditions.checkElementIndex(index, size());
            return Character.valueOf(this.array[this.start + index]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i2 = this.start; i2 < this.end; i2++) {
                iHashCode = (iHashCode * 31) + Chars.hashCode(this.array[i2]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object target) {
            int iIndexOf;
            if (!(target instanceof Character) || (iIndexOf = Chars.indexOf(this.array, ((Character) target).charValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iIndexOf - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object target) {
            int iLastIndexOf;
            if (!(target instanceof Character) || (iLastIndexOf = Chars.lastIndexOf(this.array, ((Character) target).charValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Character set(int index, Character element) {
            Preconditions.checkElementIndex(index, size());
            char[] cArr = this.array;
            int i2 = this.start;
            char c2 = cArr[i2 + index];
            cArr[i2 + index] = ((Character) Preconditions.checkNotNull(element)).charValue();
            return Character.valueOf(c2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Character> subList(int fromIndex, int toIndex) {
            Preconditions.checkPositionIndexes(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.emptyList();
            }
            char[] cArr = this.array;
            int i2 = this.start;
            return new CharArrayAsList(cArr, fromIndex + i2, i2 + toIndex);
        }

        char[] toCharArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 3);
            sb.append(AbstractJsonLexerKt.BEGIN_LIST).append(this.array[this.start]);
            int i2 = this.start;
            while (true) {
                i2++;
                if (i2 >= this.end) {
                    return sb.append(AbstractJsonLexerKt.END_LIST).toString();
                }
                sb.append(", ").append(this.array[i2]);
            }
        }
    }

    private enum LexicographicalComparator implements Comparator<char[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(char[] left, char[] right) {
            int iMin = Math.min(left.length, right.length);
            for (int i2 = 0; i2 < iMin; i2++) {
                int iCompare = Chars.compare(left[i2], right[i2]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Chars.lexicographicalComparator()";
        }
    }

    private Chars() {
    }

    public static List<Character> asList(char... backingArray) {
        return backingArray.length == 0 ? Collections.emptyList() : new CharArrayAsList(backingArray);
    }

    public static char checkedCast(long value) {
        char c2 = (char) value;
        Preconditions.checkArgument(((long) c2) == value, "Out of range: %s", value);
        return c2;
    }

    public static int compare(char a2, char b2) {
        return a2 - b2;
    }

    public static char[] concat(char[]... arrays) {
        int length = 0;
        for (char[] cArr : arrays) {
            length += cArr.length;
        }
        char[] cArr2 = new char[length];
        int length2 = 0;
        for (char[] cArr3 : arrays) {
            System.arraycopy(cArr3, 0, cArr2, length2, cArr3.length);
            length2 += cArr3.length;
        }
        return cArr2;
    }

    public static char constrainToRange(char value, char min, char max) {
        Preconditions.checkArgument(min <= max, "min (%s) must be less than or equal to max (%s)", min, max);
        return value < min ? min : value < max ? value : max;
    }

    public static boolean contains(char[] array, char target) {
        for (char c2 : array) {
            if (c2 == target) {
                return true;
            }
        }
        return false;
    }

    public static char[] ensureCapacity(char[] array, int minLength, int padding) {
        Preconditions.checkArgument(minLength >= 0, "Invalid minLength: %s", minLength);
        Preconditions.checkArgument(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? Arrays.copyOf(array, minLength + padding) : array;
    }

    public static char fromByteArray(byte[] bytes) {
        Preconditions.checkArgument(bytes.length >= 2, "array too small: %s < %s", bytes.length, 2);
        return fromBytes(bytes[0], bytes[1]);
    }

    public static char fromBytes(byte b12, byte b2) {
        return (char) ((-1) - (((-1) - (b12 << 8)) & ((-1) - (b2 & 255))));
    }

    public static int hashCode(char value) {
        return value;
    }

    public static int indexOf(char[] array, char target) {
        return indexOf(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(char[] array, char target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int indexOf(char[] r5, char[] r6) {
        /*
            java.lang.String r0 = "array"
            com.google.common.base.Preconditions.checkNotNull(r5, r0)
            java.lang.String r0 = "target"
            com.google.common.base.Preconditions.checkNotNull(r6, r0)
            int r0 = r6.length
            r4 = 0
            if (r0 != 0) goto Lf
            return r4
        Lf:
            r3 = r4
        L10:
            int r1 = r5.length
            int r0 = r6.length
            int r1 = r1 - r0
            int r0 = r1 + 1
            if (r3 >= r0) goto L2a
            r2 = r4
        L18:
            int r0 = r6.length
            if (r2 >= r0) goto L29
            int r0 = r3 + r2
            char r1 = r5[r0]
            char r0 = r6[r2]
            if (r1 == r0) goto L26
            int r3 = r3 + 1
            goto L10
        L26:
            int r2 = r2 + 1
            goto L18
        L29:
            return r3
        L2a:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.Chars.indexOf(char[], char[]):int");
    }

    public static String join(String separator, char... array) {
        Preconditions.checkNotNull(separator);
        int length = array.length;
        if (length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder((separator.length() * (length - 1)) + length);
        sb.append(array[0]);
        for (int i2 = 1; i2 < length; i2++) {
            sb.append(separator).append(array[i2]);
        }
        return sb.toString();
    }

    public static int lastIndexOf(char[] array, char target) {
        return lastIndexOf(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(char[] array, char target, int start, int end) {
        for (int i2 = end - 1; i2 >= start; i2--) {
            if (array[i2] == target) {
                return i2;
            }
        }
        return -1;
    }

    public static Comparator<char[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static char max(char... array) {
        Preconditions.checkArgument(array.length > 0);
        char c2 = array[0];
        for (int i2 = 1; i2 < array.length; i2++) {
            char c3 = array[i2];
            if (c3 > c2) {
                c2 = c3;
            }
        }
        return c2;
    }

    public static char min(char... array) {
        Preconditions.checkArgument(array.length > 0);
        char c2 = array[0];
        for (int i2 = 1; i2 < array.length; i2++) {
            char c3 = array[i2];
            if (c3 < c2) {
                c2 = c3;
            }
        }
        return c2;
    }

    public static void reverse(char[] array) {
        Preconditions.checkNotNull(array);
        reverse(array, 0, array.length);
    }

    public static void reverse(char[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i2 = toIndex - 1; fromIndex < i2; i2--) {
            char c2 = array[fromIndex];
            array[fromIndex] = array[i2];
            array[i2] = c2;
            fromIndex++;
        }
    }

    public static void rotate(char[] array, int distance) {
        rotate(array, distance, 0, array.length);
    }

    public static void rotate(char[] array, int distance, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        if (array.length <= 1) {
            return;
        }
        int i2 = toIndex - fromIndex;
        int i3 = (-distance) % i2;
        if (i3 < 0) {
            i3 += i2;
        }
        int i4 = i3 + fromIndex;
        if (i4 == fromIndex) {
            return;
        }
        reverse(array, fromIndex, i4);
        reverse(array, i4, toIndex);
        reverse(array, fromIndex, toIndex);
    }

    public static char saturatedCast(long value) {
        if (value > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            return CharCompanionObject.MAX_VALUE;
        }
        if (value < 0) {
            return (char) 0;
        }
        return (char) value;
    }

    public static void sortDescending(char[] array) {
        Preconditions.checkNotNull(array);
        sortDescending(array, 0, array.length);
    }

    public static void sortDescending(char[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        Arrays.sort(array, fromIndex, toIndex);
        reverse(array, fromIndex, toIndex);
    }

    public static char[] toArray(Collection<Character> collection) {
        if (collection instanceof CharArrayAsList) {
            return ((CharArrayAsList) collection).toCharArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        char[] cArr = new char[length];
        for (int i2 = 0; i2 < length; i2++) {
            cArr[i2] = ((Character) Preconditions.checkNotNull(array[i2])).charValue();
        }
        return cArr;
    }

    public static byte[] toByteArray(char value) {
        return new byte[]{(byte) (value >> '\b'), (byte) value};
    }
}
