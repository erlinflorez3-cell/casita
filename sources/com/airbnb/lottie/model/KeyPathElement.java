package com.airbnb.lottie.model;

import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface KeyPathElement {
    <T> void addValueCallback(T t2, LottieValueCallback<T> lottieValueCallback);

    void resolveKeyPath(KeyPath keyPath, int i2, List<KeyPath> list, KeyPath keyPath2);
}
