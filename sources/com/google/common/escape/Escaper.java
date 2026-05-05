package com.google.common.escape;

import com.google.common.base.Function;
import com.google.errorprone.annotations.DoNotMock;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes7.dex */
@DoNotMock("^}l(Jyfe\u0002w\u0002\u0004;|\u0001xe?j[VfXf)+\u001foo\u001e\\jX^OMW\u0006PIeZ^T`\u000eQ^HGvL=;r}&UBAMCMOi.4*9:)8")
@InterfaceC1492Gx
@ElementTypesAreNonnullByDefault
public abstract class Escaper {
    private final Function<String, String> asFunction = new Function() { // from class: com.google.common.escape.Escaper$$ExternalSyntheticLambda0
        @Override // com.google.common.base.Function
        public final Object apply(Object obj) {
            return this.f$0.escape((String) obj);
        }
    };

    protected Escaper() {
    }

    public final Function<String, String> asFunction() {
        return this.asFunction;
    }

    public abstract String escape(String string);
}
