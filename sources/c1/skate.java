package c1;

import android.os.Debug;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipFile;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import yg.C1580rY;
import yg.C1633zX;
import yg.FB;
import yg.QB;
import yg.Qg;
import yg.Xu;

/* JADX INFO: loaded from: classes4.dex */
public final class skate implements b1.tongue {

    /* JADX INFO: renamed from: g */
    public static final taste f2506g = new taste();

    /* JADX INFO: renamed from: a */
    public final Function1 f2507a;

    /* JADX INFO: renamed from: b */
    public final i1.skate f2508b;

    /* JADX INFO: renamed from: c */
    public final Function1 f2509c;

    /* JADX INFO: renamed from: d */
    public final apparatus f2510d;

    /* JADX INFO: renamed from: e */
    public final civilian f2511e;

    /* JADX INFO: renamed from: f */
    public final boolean f2512f;

    public skate() {
        superior superiorVar = superior.f2515a;
        i1.skate skateVar = i1.proposal.f19722a;
        tongue tongueVar = tongue.f2517a;
        apparatus apparatusVar = new apparatus();
        civilian civilianVar = new civilian();
        boolean zIsDebuggerConnected = Debug.isDebuggerConnected();
        this.f2507a = superiorVar;
        this.f2508b = skateVar;
        this.f2509c = tongueVar;
        this.f2510d = apparatusVar;
        this.f2511e = civilianVar;
        this.f2512f = zIsDebuggerConnected;
    }

    @Override // b1.tongue
    public final y0.proposal a(e0.pair pairVar) throws IOException {
        Object objM8980constructorimpl;
        Object objM8980constructorimpl2;
        Sequence map;
        y0.slide slideVarA = y0.proposal.h().d(pairVar.f18468l.f18476c).e(pairVar.f18457a).b(pairVar.f18458b).a(pairVar.f18459c).c(pairVar.f18460d).b().b(pairVar.f18470n == e0.tongue.f18480a).a(this.f2512f).b(pairVar.f18461e).f(pairVar.f18462f).a((y0.misplace) y0.misplace.a().a(pairVar.f18468l.f18474a).build()).a(pairVar.f18468l.f18477d);
        List<e0.apparatus> list = pairVar.f18464h;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (e0.apparatus apparatusVar : list) {
            arrayList.add((y0.close) y0.close.a().a(apparatusVar.f18451a).a((-1) - (((-1) - apparatusVar.f18452b) | ((-1) - 2)) != 0).build());
        }
        y0.slide slideVarC = slideVarA.c(arrayList);
        List list2 = pairVar.f18463g;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add((y0.civilian) y0.civilian.a().a().a((String) it.next()).build());
        }
        y0.slide slideVarA2 = slideVarC.b(arrayList2).a(SequencesKt.toList(SequencesKt.distinct(SequencesKt.mapNotNull(CollectionsKt.asSequence(pairVar.f18469m), new misplace(this)))));
        if (!pairVar.f18465i.isEmpty()) {
            List<e0.superior> list3 = pairVar.f18465i;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            for (e0.superior superiorVar : list3) {
                arrayList3.add((y0.tongue) y0.tongue.a().a(superiorVar.f18471a).b(superiorVar.f18473c).c(superiorVar.f18472b).build());
            }
            slideVarA2 = slideVarA2.a(arrayList3);
        }
        if (!pairVar.f18466j.isEmpty()) {
            List<e0.superior> list4 = pairVar.f18466j;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            for (e0.superior superiorVar2 : list4) {
                arrayList4.add((y0.tongue) y0.tongue.a().a(superiorVar2.f18471a).b(superiorVar2.f18473c).c(superiorVar2.f18472b).build());
            }
            slideVarA2 = slideVarA2.d(arrayList4);
        }
        if (!pairVar.f18467k.isEmpty()) {
            List<e0.civilian> list5 = pairVar.f18467k;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
            for (e0.civilian civilianVar : list5) {
                arrayList5.add((y0.sea) y0.sea.a().a(civilianVar.f18453a).b(civilianVar.f18455c).c(civilianVar.f18454b).build());
            }
            slideVarA2 = slideVarA2.e(arrayList5);
        }
        try {
            Result.Companion companion = Result.Companion;
            objM8980constructorimpl = Result.m8980constructorimpl((ZipFile) this.f2507a.invoke(pairVar.f18468l.f18479f));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM8980constructorimpl = Result.m8980constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8986isFailureimpl(objM8980constructorimpl)) {
            objM8980constructorimpl = null;
        }
        ZipFile zipFile = (ZipFile) objM8980constructorimpl;
        if (zipFile != null) {
            ZipFile zipFile2 = zipFile;
            try {
                ZipFile zipFile3 = zipFile2;
                Class<?> cls = Class.forName(Qg.kd("\n\u007f\u0014}I\u0010\u000e\u0002\u0004D\u0010}\u0004@ky\u007fTvxp", (short) (C1633zX.Xd() ^ (-27556)), (short) (C1633zX.Xd() ^ (-2128))));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr = new Object[0];
                short sXd = (short) (FB.Xd() ^ 30533);
                short sXd2 = (short) (FB.Xd() ^ 7173);
                int[] iArr = new int[" (-* \u001b(".length()];
                QB qb = new QB(" (-* \u001b(");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                    i2++;
                }
                Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method.setAccessible(true);
                    Iterator it2 = SequencesKt.mapNotNull(SequencesKt.filter(SequencesKt.asSequence(CollectionsKt.iterator((Enumeration) method.invoke(zipFile3, objArr))), slide.f2513a), new gregarious(this, zipFile3)).iterator();
                    while (it2.hasNext()) {
                        slideVarA2.a((y0.fabricate) it2.next());
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(zipFile2, null);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } finally {
            }
        }
        if (slideVarA2.a() == 0) {
            try {
                Result.Companion companion3 = Result.Companion;
                File parentFile = ((i1.stain) this.f2508b.a(pairVar.f18468l.f18479f)).f19724a.getParentFile();
                i1.stain stainVar = parentFile != null ? new i1.stain(parentFile) : null;
                Sequence sequenceFilter = (stainVar == null || (map = SequencesKt.map(FilesKt.walkTopDown(stainVar.f19724a), i1.profile.f19721a)) == null) ? null : SequencesKt.filter(map, fabricate.f2496a);
                if (sequenceFilter == null) {
                    sequenceFilter = SequencesKt.emptySequence();
                }
                objM8980constructorimpl2 = Result.m8980constructorimpl(sequenceFilter);
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.Companion;
                objM8980constructorimpl2 = Result.m8980constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m8983exceptionOrNullimpl(objM8980constructorimpl2) != null) {
                objM8980constructorimpl2 = SequencesKt.emptySequence();
            }
            Iterator it3 = SequencesKt.mapNotNull(SequencesKt.filter((Sequence) objM8980constructorimpl2, abundant.f2491a), new close(this)).iterator();
            while (it3.hasNext()) {
                slideVarA2.a((y0.fabricate) it3.next());
            }
        }
        y0.gregarious gregariousVarA = y0.fabricate.a();
        short sXd3 = (short) (C1580rY.Xd() ^ (-20496));
        int[] iArr2 = new int["GUO".length()];
        QB qb2 = new QB("GUO");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        y0.gregarious gregariousVarB = gregariousVarA.b(new String(iArr2, 0, i3));
        String str = (String) this.f2510d.invoke(pairVar.f18468l.f18479f);
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : null;
        if (lowerCase == null) {
            lowerCase = "";
        }
        return (y0.proposal) slideVarA2.a((y0.fabricate) gregariousVarB.a(lowerCase).build()).build();
    }
}
