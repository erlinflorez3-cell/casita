package com.google.common.collect;

import com.google.errorprone.annotations.DoNotMock;
import java.util.Map;
import javax.annotation.CheckForNull;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC1492Gx
@DoNotMock("^}l(Rgsw?vxvss}qg]\\")
@ElementTypesAreNonnullByDefault
public interface MapDifference<K, V> {

    @InterfaceC1492Gx
    @DoNotMock("^}l(Rgsw?vxvss}qg]\\")
    public interface ValueDifference<V> {
        boolean equals(@CheckForNull Object other);

        int hashCode();

        @ParametricNullness
        V leftValue();

        @ParametricNullness
        V rightValue();
    }

    boolean areEqual();

    Map<K, ValueDifference<V>> entriesDiffering();

    Map<K, V> entriesInCommon();

    Map<K, V> entriesOnlyOnLeft();

    Map<K, V> entriesOnlyOnRight();

    boolean equals(@CheckForNull Object object);

    int hashCode();
}
