package com.google.common.base;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class MoreObjects {

    public static final class ToStringHelper {
        private final String className;
        private final ValueHolder holderHead;
        private ValueHolder holderTail;
        private boolean omitEmptyValues;
        private boolean omitNullValues;

        private static final class UnconditionalValueHolder extends ValueHolder {
            private UnconditionalValueHolder() {
                super();
            }
        }

        private static class ValueHolder {

            @CheckForNull
            String name;

            @CheckForNull
            ValueHolder next;

            @CheckForNull
            Object value;

            private ValueHolder() {
            }
        }

        private ToStringHelper(String className) {
            ValueHolder valueHolder = new ValueHolder();
            this.holderHead = valueHolder;
            this.holderTail = valueHolder;
            this.omitNullValues = false;
            this.omitEmptyValues = false;
            this.className = (String) Preconditions.checkNotNull(className);
        }

        private ValueHolder addHolder() {
            ValueHolder valueHolder = new ValueHolder();
            this.holderTail.next = valueHolder;
            this.holderTail = valueHolder;
            return valueHolder;
        }

        private ToStringHelper addHolder(@CheckForNull Object value) {
            addHolder().value = value;
            return this;
        }

        private ToStringHelper addHolder(String name, @CheckForNull Object value) {
            ValueHolder valueHolderAddHolder = addHolder();
            valueHolderAddHolder.value = value;
            valueHolderAddHolder.name = (String) Preconditions.checkNotNull(name);
            return this;
        }

        private UnconditionalValueHolder addUnconditionalHolder() {
            UnconditionalValueHolder unconditionalValueHolder = new UnconditionalValueHolder();
            this.holderTail.next = unconditionalValueHolder;
            this.holderTail = unconditionalValueHolder;
            return unconditionalValueHolder;
        }

        private ToStringHelper addUnconditionalHolder(Object value) {
            addUnconditionalHolder().value = value;
            return this;
        }

        private ToStringHelper addUnconditionalHolder(String name, Object value) {
            UnconditionalValueHolder unconditionalValueHolderAddUnconditionalHolder = addUnconditionalHolder();
            unconditionalValueHolderAddUnconditionalHolder.value = value;
            unconditionalValueHolderAddUnconditionalHolder.name = (String) Preconditions.checkNotNull(name);
            return this;
        }

        private static boolean isEmpty(Object value) {
            return value instanceof CharSequence ? ((CharSequence) value).length() == 0 : value instanceof Collection ? ((Collection) value).isEmpty() : value instanceof Map ? ((Map) value).isEmpty() : value instanceof Optional ? !((Optional) value).isPresent() : value.getClass().isArray() && Array.getLength(value) == 0;
        }

        public ToStringHelper add(String name, char value) {
            return addUnconditionalHolder(name, String.valueOf(value));
        }

        public ToStringHelper add(String name, double value) {
            return addUnconditionalHolder(name, String.valueOf(value));
        }

        public ToStringHelper add(String name, float value) {
            return addUnconditionalHolder(name, String.valueOf(value));
        }

        public ToStringHelper add(String name, int value) {
            return addUnconditionalHolder(name, String.valueOf(value));
        }

        public ToStringHelper add(String name, long value) {
            return addUnconditionalHolder(name, String.valueOf(value));
        }

        public ToStringHelper add(String name, @CheckForNull Object value) {
            return addHolder(name, value);
        }

        public ToStringHelper add(String name, boolean value) {
            return addUnconditionalHolder(name, String.valueOf(value));
        }

        public ToStringHelper addValue(char value) {
            return addUnconditionalHolder(String.valueOf(value));
        }

        public ToStringHelper addValue(double value) {
            return addUnconditionalHolder(String.valueOf(value));
        }

        public ToStringHelper addValue(float value) {
            return addUnconditionalHolder(String.valueOf(value));
        }

        public ToStringHelper addValue(int value) {
            return addUnconditionalHolder(String.valueOf(value));
        }

        public ToStringHelper addValue(long value) {
            return addUnconditionalHolder(String.valueOf(value));
        }

        public ToStringHelper addValue(@CheckForNull Object value) {
            return addHolder(value);
        }

        public ToStringHelper addValue(boolean value) {
            return addUnconditionalHolder(String.valueOf(value));
        }

        public ToStringHelper omitNullValues() {
            this.omitNullValues = true;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r7 = this;
                boolean r6 = r7.omitNullValues
                boolean r5 = r7.omitEmptyValues
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r0 = 32
                r1.<init>(r0)
                java.lang.String r0 = r7.className
                java.lang.StringBuilder r1 = r1.append(r0)
                r0 = 123(0x7b, float:1.72E-43)
                java.lang.StringBuilder r4 = r1.append(r0)
                com.google.common.base.MoreObjects$ToStringHelper$ValueHolder r0 = r7.holderHead
                com.google.common.base.MoreObjects$ToStringHelper$ValueHolder r3 = r0.next
                java.lang.String r1 = ""
            L1d:
                if (r3 == 0) goto L6a
                java.lang.Object r2 = r3.value
                boolean r0 = r3 instanceof com.google.common.base.MoreObjects.ToStringHelper.UnconditionalValueHolder
                if (r0 != 0) goto L29
                if (r2 != 0) goto L61
                if (r6 != 0) goto L5a
            L29:
                r4.append(r1)
                java.lang.String r0 = r3.name
                if (r0 == 0) goto L3b
                java.lang.String r0 = r3.name
                java.lang.StringBuilder r1 = r4.append(r0)
                r0 = 61
                r1.append(r0)
            L3b:
                if (r2 == 0) goto L5d
                java.lang.Class r0 = r2.getClass()
                boolean r0 = r0.isArray()
                if (r0 == 0) goto L5d
                java.lang.Object[] r0 = new java.lang.Object[]{r2}
                java.lang.String r2 = java.util.Arrays.deepToString(r0)
                int r1 = r2.length()
                r0 = 1
                int r1 = r1 - r0
                r4.append(r2, r0, r1)
            L58:
                java.lang.String r1 = ", "
            L5a:
                com.google.common.base.MoreObjects$ToStringHelper$ValueHolder r3 = r3.next
                goto L1d
            L5d:
                r4.append(r2)
                goto L58
            L61:
                if (r5 == 0) goto L29
                boolean r0 = isEmpty(r2)
                if (r0 != 0) goto L5a
                goto L29
            L6a:
                r0 = 125(0x7d, float:1.75E-43)
                java.lang.StringBuilder r0 = r4.append(r0)
                java.lang.String r0 = r0.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.MoreObjects.ToStringHelper.toString():java.lang.String");
        }
    }

    private MoreObjects() {
    }

    public static <T> T firstNonNull(@CheckForNull T first, @CheckForNull T second) {
        if (first != null) {
            return first;
        }
        if (second != null) {
            return second;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static ToStringHelper toStringHelper(Class<?> clazz) {
        return new ToStringHelper(clazz.getSimpleName());
    }

    public static ToStringHelper toStringHelper(Object self) {
        return new ToStringHelper(self.getClass().getSimpleName());
    }

    public static ToStringHelper toStringHelper(String className) {
        return new ToStringHelper(className);
    }
}
