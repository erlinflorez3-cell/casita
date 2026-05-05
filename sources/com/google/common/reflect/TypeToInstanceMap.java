package com.google.common.reflect;

import com.google.errorprone.annotations.DoNotMock;
import java.util.Map;
import javax.annotation.CheckForNull;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes7.dex */
@DoNotMock("^}l(Nspy\u0006sq|rb\u0005|^NfAcigUoedM^n\u001bk[\n4]YGEPVFh`RBZ5GMK9C98!BR")
@InterfaceC1492Gx
@ElementTypesAreNonnullByDefault
public interface TypeToInstanceMap<B> extends Map<TypeToken<? extends B>, B> {
    @CheckForNull
    <T extends B> T getInstance(TypeToken<T> type);

    @CheckForNull
    <T extends B> T getInstance(Class<T> type);

    @CheckForNull
    <T extends B> T putInstance(TypeToken<T> type, @ParametricNullness T value);

    @CheckForNull
    <T extends B> T putInstance(Class<T> type, @ParametricNullness T value);
}
