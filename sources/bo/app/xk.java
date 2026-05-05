package bo.app;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes4.dex */
public enum xk {
    INTEGER(TypedValues.Custom.S_INT),
    COLOR("color"),
    BOOLEAN("bool"),
    STRING("string"),
    DRAWABLE_IDENTIFIER("drawable"),
    STRING_ARRAY("array");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2229a;

    xk(String str) {
        this.f2229a = str;
    }
}
