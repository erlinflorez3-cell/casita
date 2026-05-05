package com.facetec.sdk;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
final class ci extends cz<Date> {
    private final List<DateFormat> Code;
    private final Class<? extends Date> V;

    public ci(Class<? extends Date> cls, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        this.Code = arrayList;
        this.V = Code(cls);
        arrayList.add(DateFormat.getDateTimeInstance(i2, i3, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            arrayList.add(DateFormat.getDateTimeInstance(i2, i3));
        }
        if (dk.I()) {
            arrayList.add(dp.B(i2, i3));
        }
    }

    ci(Class<? extends Date> cls, String str) {
        ArrayList arrayList = new ArrayList();
        this.Code = arrayList;
        this.V = Code(cls);
        arrayList.add(new SimpleDateFormat(str, Locale.US));
        if (Locale.getDefault().equals(Locale.US)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    private static Class<? extends Date> Code(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        throw new IllegalArgumentException(new StringBuilder("Date type must be one of ").append(Date.class).append(", ").append(Timestamp.class).append(", or ").append(java.sql.Date.class).append(" but was ").append(cls).toString());
    }

    private Date Z(String str) {
        synchronized (this.Code) {
            Iterator<DateFormat> it = this.Code.iterator();
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
    }

    @Override // com.facetec.sdk.cz
    public final /* synthetic */ void B(ek ekVar, Date date) throws IOException {
        Date date2 = date;
        if (date2 == null) {
            ekVar.F();
            return;
        }
        synchronized (this.Code) {
            ekVar.V(this.Code.get(0).format(date2));
        }
    }

    @Override // com.facetec.sdk.cz
    public final /* synthetic */ Date V(ei eiVar) throws IOException {
        if (eiVar.D() == el.NULL) {
            eiVar.S();
            return null;
        }
        Date dateZ = Z(eiVar.L());
        Class<? extends Date> cls = this.V;
        if (cls == Date.class) {
            return dateZ;
        }
        if (cls == Timestamp.class) {
            return new Timestamp(dateZ.getTime());
        }
        if (cls == java.sql.Date.class) {
            return new java.sql.Date(dateZ.getTime());
        }
        throw new AssertionError();
    }

    public final String toString() {
        DateFormat dateFormat = this.Code.get(0);
        return dateFormat instanceof SimpleDateFormat ? new StringBuilder("DefaultDateTypeAdapter(").append(((SimpleDateFormat) dateFormat).toPattern()).append(')').toString() : new StringBuilder("DefaultDateTypeAdapter(").append(dateFormat.getClass().getSimpleName()).append(')').toString();
    }
}
