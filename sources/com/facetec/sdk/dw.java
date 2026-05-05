package com.facetec.sdk;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class dw extends cz<Object> {
    public static final cy Z = new cy() { // from class: com.facetec.sdk.dw.2
        AnonymousClass2() {
        }

        @Override // com.facetec.sdk.cy
        public final <T> cz<T> V(ck ckVar, ef<T> efVar) {
            if (efVar.Z() == Object.class) {
                return new dw(ckVar);
            }
            return null;
        }
    };
    private final ck Code;

    /* JADX INFO: renamed from: com.facetec.sdk.dw$2 */
    final class AnonymousClass2 implements cy {
        AnonymousClass2() {
        }

        @Override // com.facetec.sdk.cy
        public final <T> cz<T> V(ck ckVar, ef<T> efVar) {
            if (efVar.Z() == Object.class) {
                return new dw(ckVar);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.dw$4 */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] B;

        static {
            int[] iArr = new int[el.values().length];
            B = iArr;
            try {
                iArr[el.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                B[el.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                B[el.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                B[el.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                B[el.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                B[el.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    dw(ck ckVar) {
        this.Code = ckVar;
    }

    @Override // com.facetec.sdk.cz
    public final void B(ek ekVar, Object obj) throws IOException {
        if (obj == null) {
            ekVar.F();
            return;
        }
        cz czVarV = this.Code.V(obj.getClass());
        if (!(czVarV instanceof dw)) {
            czVarV.B(ekVar, obj);
        } else {
            ekVar.I();
            ekVar.B();
        }
    }

    @Override // com.facetec.sdk.cz
    public final Object V(ei eiVar) throws IOException {
        switch (AnonymousClass4.B[eiVar.D().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                eiVar.I();
                while (eiVar.V()) {
                    arrayList.add(V(eiVar));
                }
                eiVar.B();
                return arrayList;
            case 2:
                dm dmVar = new dm();
                eiVar.Code();
                while (eiVar.V()) {
                    dmVar.put(eiVar.C(), V(eiVar));
                }
                eiVar.Z();
                return dmVar;
            case 3:
                return eiVar.L();
            case 4:
                return Double.valueOf(eiVar.c());
            case 5:
                return Boolean.valueOf(eiVar.F());
            case 6:
                eiVar.S();
                return null;
            default:
                throw new IllegalStateException();
        }
    }
}
