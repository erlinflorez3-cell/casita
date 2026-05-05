package com.facetec.sdk;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes3.dex */
public final class dy extends cz<Date> {
    public static final cy I = new cy() { // from class: com.facetec.sdk.dy.3
        AnonymousClass3() {
        }

        @Override // com.facetec.sdk.cy
        public final <T> cz<T> V(ck ckVar, ef<T> efVar) {
            if (efVar.Z() == Date.class) {
                return new dy();
            }
            return null;
        }
    };
    private final DateFormat B = new SimpleDateFormat("MMM d, yyyy");

    /* JADX INFO: renamed from: com.facetec.sdk.dy$3 */
    final class AnonymousClass3 implements cy {
        AnonymousClass3() {
        }

        @Override // com.facetec.sdk.cy
        public final <T> cz<T> V(ck ckVar, ef<T> efVar) {
            if (efVar.Z() == Date.class) {
                return new dy();
            }
            return null;
        }
    }

    @Override // com.facetec.sdk.cz
    /* JADX INFO: renamed from: Z */
    public synchronized Date V(ei eiVar) throws IOException {
        if (eiVar.D() == el.NULL) {
            eiVar.S();
            return null;
        }
        try {
            return new Date(this.B.parse(eiVar.L()).getTime());
        } catch (ParseException e2) {
            throw new da(e2);
        }
    }

    @Override // com.facetec.sdk.cz
    /* JADX INFO: renamed from: Z */
    public synchronized void B(ek ekVar, Date date) throws IOException {
        ekVar.V(date == null ? null : this.B.format((java.util.Date) date));
    }
}
