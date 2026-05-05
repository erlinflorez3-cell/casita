package fr.antelop.sdk.card;

import java.util.Date;
import o.ep.c;

/* JADX INFO: loaded from: classes5.dex */
public final class CardInfo {
    private final c innerCardInfo;

    public CardInfo(c cVar) {
        this.innerCardInfo = cVar;
    }

    public final String getBin() {
        return this.innerCardInfo.b();
    }

    public final CardDisplay getDisplay() {
        Object[] objArr = {this.innerCardInfo};
        int i2 = (-581252450) * c.f24440h;
        c.f24440h = i2;
        int i3 = (int) Runtime.getRuntime().totalMemory();
        int i4 = c.f24441i * 151058815;
        c.f24441i = i4;
        int i5 = (-518773767) * c.f24439f;
        c.f24439f = i5;
        return (CardDisplay) c.c(i2, i3, i5, -465660215, objArr, 465660217, i4);
    }

    public final Date getExpiryDate() {
        return this.innerCardInfo.c();
    }

    public final String getIssuerCardId() {
        return this.innerCardInfo.a();
    }

    public final String getLastDigits() {
        Object[] objArr = {this.innerCardInfo};
        int i2 = 574268897 * c.f24438e;
        c.f24438e = i2;
        int id = (int) Thread.currentThread().getId();
        int i3 = c.f24436c * 1169734117;
        c.f24436c = i3;
        int i4 = (-2104816085) * c.f24434a;
        c.f24434a = i4;
        return (String) c.c(i2, id, i4, 1241915024, objArr, -1241915024, i3);
    }

    public final String toString() {
        StringBuilder sbAppend = new StringBuilder("CardInfo{bin='").append(this.innerCardInfo.b()).append("', expiryDate='").append(this.innerCardInfo.c()).append("', lastDigits=");
        Object[] objArr = {this.innerCardInfo};
        int i2 = 574268897 * c.f24438e;
        c.f24438e = i2;
        int id = (int) Thread.currentThread().getId();
        int i3 = c.f24436c * 1169734117;
        c.f24436c = i3;
        int i4 = (-2104816085) * c.f24434a;
        c.f24434a = i4;
        StringBuilder sbAppend2 = sbAppend.append((String) c.c(i2, id, i4, 1241915024, objArr, -1241915024, i3)).append("', display=");
        Object[] objArr2 = {this.innerCardInfo};
        int i5 = (-581252450) * c.f24440h;
        c.f24440h = i5;
        int i6 = (int) Runtime.getRuntime().totalMemory();
        int i7 = c.f24441i * 151058815;
        c.f24441i = i7;
        int i8 = (-518773767) * c.f24439f;
        c.f24439f = i8;
        return sbAppend2.append((CardDisplay) c.c(i5, i6, i8, -465660215, objArr2, 465660217, i7)).append("'}").toString();
    }
}
