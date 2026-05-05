package o.ex;

import fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControlUpdate;
import fr.antelop.sdk.exception.WalletValidationException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.er.y;
import o.y.n;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: b */
    private static int f25572b = 1;

    /* JADX INFO: renamed from: d */
    private static int f25573d = 0;

    /* JADX INFO: renamed from: a */
    private final List<a<?>> f25574a = new ArrayList();

    /* JADX INFO: renamed from: c */
    private final o.ep.d f25575c;

    public d(o.ep.d dVar) {
        this.f25575c = dVar;
    }

    public final n b() throws WalletValidationException {
        int i2 = 2 % 2;
        o.ep.d dVar = this.f25575c;
        y yVar = new y(dVar, (o.er.a) dVar.G());
        n nVar = new n(yVar.a(), this.f25575c, yVar.c(), yVar, this.f25574a);
        int i3 = f25573d;
        int i4 = ((-1) - (((-1) - i3) | ((-1) - 71))) + ((i3 + 71) - (i3 & 71));
        f25572b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
        return nVar;
    }

    public final void b(a<?> aVar) {
        int i2 = 2 % 2;
        int i3 = f25573d + 9;
        f25572b = i3 % 128;
        int i4 = i3 % 2;
        this.f25574a.add(aVar);
        int i5 = f25572b + 69;
        f25573d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 68 / 0;
        }
    }

    public final List<TransactionControlUpdate<?>> e() {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Iterator<a<?>> it = this.f25574a.iterator();
        int i3 = f25572b + 93;
        while (true) {
            f25573d = i3 % 128;
            int i4 = i3 % 2;
            if (!it.hasNext()) {
                break;
            }
            arrayList.add(new TransactionControlUpdate(it.next()));
            i3 = f25572b + 49;
        }
        int i5 = f25573d + 47;
        f25572b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 61 / 0;
        }
        return arrayList;
    }
}
