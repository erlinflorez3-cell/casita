package c1;

import kotlin.NoWhenBranchMatchedException;
import y0.accurate;
import y0.card;
import y0.clean;
import y0.dressing;
import y0.genetic;
import y0.notice;
import y0.personality;
import y0.pierce;
import y0.remedy;

/* JADX INFO: loaded from: classes4.dex */
public final class proposal implements b1.tongue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final proposal f2504a = new proposal();

    @Override // b1.tongue
    public final Object a(Object obj) {
        pierce pierceVar;
        dressing dressingVar;
        f0.superior superiorVar = (f0.superior) obj;
        y0.cooperative cooperativeVarA = clean.a();
        if (superiorVar.f18518a != null) {
            notice noticeVarA = personality.a();
            int iOrdinal = superiorVar.f18518a.f27441a.ordinal();
            if (iOrdinal == 0) {
                pierceVar = pierce.f28494d;
            } else if (iOrdinal == 1) {
                pierceVar = pierce.f28493c;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                pierceVar = pierce.f28492b;
            }
            notice noticeVarA2 = noticeVarA.a(pierceVar);
            int iOrdinal2 = superiorVar.f18518a.f27442b.ordinal();
            if (iOrdinal2 == 0) {
                dressingVar = dressing.f28469b;
            } else if (iOrdinal2 == 1) {
                dressingVar = dressing.f28471d;
            } else {
                if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                dressingVar = dressing.f28470c;
            }
            cooperativeVarA.a(noticeVarA2.a(dressingVar));
        }
        j0.pair pairVar = superiorVar.f18519b;
        if (pairVar != null && (pairVar.f19804a != null || pairVar.f19805b != null || pairVar.f19806c != null || pairVar.f19807d != null || pairVar.f19808e != null || pairVar.f19809f != null)) {
            accurate accurateVarA = remedy.a();
            Boolean bool = pairVar.f19804a;
            if (bool != null) {
                accurateVarA.a(bool.booleanValue());
            }
            Boolean bool2 = pairVar.f19805b;
            if (bool2 != null) {
                accurateVarA.b(bool2.booleanValue());
            }
            Boolean bool3 = pairVar.f19806c;
            if (bool3 != null) {
                accurateVarA.e(bool3.booleanValue());
            }
            Boolean bool4 = pairVar.f19807d;
            if (bool4 != null) {
                accurateVarA.d(bool4.booleanValue());
            }
            Boolean bool5 = pairVar.f19808e;
            if (bool5 != null) {
                accurateVarA.c(bool5.booleanValue());
            }
            Boolean bool6 = pairVar.f19809f;
            if (bool6 != null) {
                accurateVarA.f(bool6.booleanValue());
            }
            cooperativeVarA.a(accurateVarA);
        }
        h0.pair pairVar2 = superiorVar.f18520c;
        if (pairVar2 != null) {
            genetic geneticVarA = card.a();
            geneticVarA.a(pairVar2.f19685c);
            geneticVarA.a(pairVar2.f19683a);
            geneticVarA.b(pairVar2.f19684b);
            cooperativeVarA.a(geneticVarA);
        }
        return (clean) cooperativeVarA.build();
    }
}
