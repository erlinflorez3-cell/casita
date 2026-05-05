package com.facetec.sdk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fn {
    public static final fn Z = new fn() { // from class: com.facetec.sdk.fn.3
    };

    public interface B {
        fn Code();
    }

    static B Z(fn fnVar) {
        return new B() { // from class: com.facetec.sdk.fn.1
            @Override // com.facetec.sdk.fn.B
            public final fn Code() {
                return fn.this;
            }
        };
    }
}
