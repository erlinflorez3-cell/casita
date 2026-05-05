package com.facetec.sdk;

import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class ec extends cz<Time> {
    public static final cy B = new cy() { // from class: com.facetec.sdk.ec.1
        AnonymousClass1() {
        }

        @Override // com.facetec.sdk.cy
        public final <T> cz<T> V(ck ckVar, ef<T> efVar) {
            if (efVar.Z() == Time.class) {
                return new ec();
            }
            return null;
        }
    };
    private final DateFormat I = new SimpleDateFormat("hh:mm:ss a");

    /* JADX INFO: renamed from: com.facetec.sdk.ec$1 */
    final class AnonymousClass1 implements cy {
        AnonymousClass1() {
        }

        @Override // com.facetec.sdk.cy
        public final <T> cz<T> V(ck ckVar, ef<T> efVar) {
            if (efVar.Z() == Time.class) {
                return new ec();
            }
            return null;
        }
    }

    @Override // com.facetec.sdk.cz
    public synchronized void B(ek ekVar, Time time) throws IOException {
        ekVar.V(time == null ? null : this.I.format((Date) time));
    }

    @Override // com.facetec.sdk.cz
    /* JADX INFO: renamed from: Z */
    public synchronized Time V(ei eiVar) throws IOException {
        if (eiVar.D() == el.NULL) {
            eiVar.S();
            return null;
        }
        try {
            return new Time(this.I.parse(eiVar.L()).getTime());
        } catch (ParseException e2) {
            throw new da(e2);
        }
    }
}
