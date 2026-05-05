package com.google.common.base;

/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
abstract class CommonPattern {
    CommonPattern() {
    }

    public static CommonPattern compile(String pattern) {
        return Platform.compilePattern(pattern);
    }

    public static boolean isPcreLike() {
        return Platform.patternCompilerIsPcreLike();
    }

    public abstract int flags();

    public abstract CommonMatcher matcher(CharSequence t2);

    public abstract String pattern();

    public abstract String toString();
}
