package com.google.common.collect;

import com.google.errorprone.annotations.DoNotMock;
import java.util.Map;
import javax.annotation.CheckForNull;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes7.dex */
@DoNotMock("^}l(Nspy\u0006sq|rQwmlmKg>dfhbpbeJ_k\u001cX\\\u00075ZZDF]W2\\Na^@H#EKI7A7F/@P")
@InterfaceC1492Gx
@ElementTypesAreNonnullByDefault
public interface ClassToInstanceMap<B> extends Map<Class<? extends B>, B> {
    @CheckForNull
    <T extends B> T getInstance(Class<T> type);

    @CheckForNull
    <T extends B> T putInstance(Class<T> type, @ParametricNullness T value);
}
