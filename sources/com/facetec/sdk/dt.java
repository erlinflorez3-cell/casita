package com.facetec.sdk;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class dt extends cz<Date> {
    public static final cy Z = new cy() { // from class: com.facetec.sdk.dt.4
        AnonymousClass4() {
        }

        @Override // com.facetec.sdk.cy
        public final <T> cz<T> V(ck ckVar, ef<T> efVar) {
            if (efVar.Z() == Date.class) {
                return new dt();
            }
            return null;
        }
    };
    private final List<DateFormat> I;

    /* JADX INFO: renamed from: com.facetec.sdk.dt$4 */
    final class AnonymousClass4 implements cy {
        AnonymousClass4() {
        }

        @Override // com.facetec.sdk.cy
        public final <T> cz<T> V(ck ckVar, ef<T> efVar) {
            if (efVar.Z() == Date.class) {
                return new dt();
            }
            return null;
        }
    }

    public dt() {
        ArrayList arrayList = new ArrayList();
        this.I = arrayList;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (dk.I()) {
            arrayList.add(dp.B(2, 2));
        }
    }

    @Override // com.facetec.sdk.cz
    public synchronized void B(ek ekVar, Date date) throws IOException {
        if (date == null) {
            ekVar.F();
        } else {
            ekVar.V(this.I.get(0).format(date));
        }
    }

    private synchronized Date Code(String str) {
        Iterator<DateFormat> it = this.I.iterator();
        while (it.hasNext()) {
            try {
                return it.next().parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return ed.I(str, new ParsePosition(0));
        } catch (ParseException e2) {
            throw new da(str, e2);
        }
    }

    @Override // com.facetec.sdk.cz
    public final /* synthetic */ Date V(ei eiVar) throws IOException {
        if (eiVar.D() != el.NULL) {
            return Code(eiVar.L());
        }
        eiVar.S();
        return null;
    }
}
