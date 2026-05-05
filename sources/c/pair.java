package c;

import android.app.Application;
import com.cleafy.mobile.detection.agent.configuration.CleafyConfiguration;
import j.fabricate;
import n.slide;
import w0.taste;

/* JADX INFO: loaded from: classes4.dex */
public final class pair {
    public static superior a(Application application, CleafyConfiguration cleafyConfiguration) {
        civilian civilianVar = new civilian(application, cleafyConfiguration);
        g1.superior superiorVar = new g1.superior();
        e1.pair pairVar = new e1.pair(superiorVar);
        d1.pair pairVar2 = new d1.pair(civilianVar);
        r0.pair pairVar3 = new r0.pair(civilianVar, pairVar2);
        f1.tongue tongueVar = new f1.tongue(pairVar3);
        taste tasteVar = new taste(tongueVar, pairVar);
        v0.taste tasteVar2 = new v0.taste(civilianVar, pairVar);
        x0.pair pairVar4 = new x0.pair(civilianVar, tasteVar, tongueVar, pairVar);
        e.tongue tongueVar2 = new e.tongue(civilianVar, pairVar2, pairVar4, tongueVar);
        m.pair pairVar5 = new m.pair(civilianVar);
        r.pair pairVar6 = new r.pair(civilianVar);
        s.apparatus apparatusVar = new s.apparatus(civilianVar);
        slide slideVar = new slide(civilianVar, apparatusVar);
        q.pair pairVar7 = new q.pair(civilianVar);
        p.pair pairVar8 = new p.pair(civilianVar, pairVar);
        l.pair pairVar9 = new l.pair(pairVar7, pairVar8, new o.pair(civilianVar, pairVar));
        f.slide slideVar2 = new f.slide(civilianVar, pairVar9);
        g.apparatus apparatusVar2 = new g.apparatus(civilianVar, tasteVar, tasteVar2, pairVar9);
        h.pair pairVar10 = new h.pair(civilianVar);
        fabricate fabricateVar = new fabricate(civilianVar, pairVar);
        t.pair pairVar11 = new t.pair(pairVar4, tasteVar2, pairVar);
        i.pair pairVar12 = new i.pair(civilianVar);
        u.pair pairVar13 = new u.pair(pairVar8);
        v.taste tasteVar3 = new v.taste(civilianVar, pairVar3, slideVar2, pairVar11, pairVar);
        c0.pair pairVar14 = new c0.pair(fabricateVar, apparatusVar2, pairVar5, pairVar6, apparatusVar, slideVar, pairVar9, pairVar10, pairVar12, pairVar11, pairVar3, pairVar);
        b0.pair pairVar15 = new b0.pair(civilianVar, fabricateVar, pairVar3, pairVar11, pairVar);
        z.pair pairVar16 = new z.pair(pairVar3, pairVar11, pairVar9, pairVar);
        w.civilian civilianVar2 = new w.civilian(civilianVar, new y.pair(civilianVar, pairVar16), pairVar15);
        return new superior(new d.apparatus(civilianVar, superiorVar, tongueVar2, pairVar3, pairVar9, new a0.pair(civilianVar, pairVar3, pairVar, pairVar9, pairVar11), new x.pair(civilianVar, pairVar9, pairVar14), pairVar14, civilianVar2, pairVar16, tasteVar3, tasteVar2, pairVar13, pairVar, tongueVar));
    }
}
