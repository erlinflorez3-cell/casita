package fr.antelop.sdk.card;

import android.os.SystemClock;
import java.util.Random;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.cs.d;

/* JADX INFO: loaded from: classes5.dex */
public final class EmvApplicationActivationMethod {
    private final d innerMethod;

    public EmvApplicationActivationMethod(d dVar) {
        this.innerMethod = dVar;
    }

    public final String getData1() {
        return this.innerMethod.c();
    }

    public final String getData2() {
        return this.innerMethod.h();
    }

    public final String getDescription() {
        Object[] objArr = {this.innerMethod};
        int i2 = d.f22594f * (-2099637768);
        d.f22594f = i2;
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i3 = d.f22596i * 1831495389;
        d.f22596i = i3;
        return (String) d.b(new Random().nextInt(1327362422), -1030571470, 1030571473, objArr, i3, i2, iElapsedRealtime);
    }

    public final String getId() {
        Object[] objArr = {this.innerMethod};
        int i2 = d.f22590b * 2033895861;
        d.f22590b = i2;
        int i3 = d.f22593e * 1121861622;
        d.f22593e = i3;
        int priority = Thread.currentThread().getPriority();
        int i4 = (-121879155) * d.f22589a;
        d.f22589a = i4;
        return (String) d.b(i4, 1953396095, -1953396094, objArr, priority, i2, i3);
    }

    public final EmvApplicationActivationMethodType getType() {
        Object[] objArr = {this.innerMethod};
        int i2 = d.f22592d * (-1580426530);
        d.f22592d = i2;
        int i3 = d.f22591c * 1801994784;
        d.f22591c = i3;
        return (EmvApplicationActivationMethodType) d.b(Thread.activeCount(), -1645654662, 1645654662, objArr, Thread.currentThread().getPriority(), i2, i3);
    }

    public final String toString() {
        return new StringBuilder("EmvApplicationActivationMethod{id=").append(getId()).append(", type=").append(getType()).append(", data1=").append(getData1() == null ? "" : getData1()).append(", data2=").append(getData2() == null ? "" : getData2()).append(", description=").append(getDescription() != null ? getDescription() : "").append(AbstractJsonLexerKt.END_OBJ).toString();
    }
}
