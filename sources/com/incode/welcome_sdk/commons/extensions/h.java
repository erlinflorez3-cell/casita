package com.incode.welcome_sdk.commons.extensions;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5128a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5129c = 0;

    public static final <E> List<E> c(Iterable<? extends E> iterable, E e2, E e3) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(iterable, "");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (E e4 : iterable) {
            int i3 = f5129c + 83;
            f5128a = i3 % 128;
            int i4 = i3 % 2;
            if (!Intrinsics.areEqual(e4, e2)) {
                int i5 = f5128a + 23;
                f5129c = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 3 / 4;
                }
            } else {
                e4 = e3;
            }
            arrayList.add(e4);
            int i7 = f5128a + 51;
            f5129c = i7 % 128;
            int i8 = i7 % 2;
        }
        return arrayList;
    }
}
