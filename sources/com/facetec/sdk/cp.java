package com.facetec.sdk;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class cp {
    private String D;
    private dj Z = dj.Code;
    private cw B = cw.DEFAULT;
    private cj Code = ch.IDENTITY;
    private final Map<Type, cq<?>> I = new HashMap();
    private final List<cy> V = new ArrayList();
    private final List<cy> L = new ArrayList();
    private boolean S = false;
    private int C = 2;
    private int F = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f3098b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3099c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f3100d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f3101e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f3097a = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f3102j = false;

    public final cp Code() {
        this.f3100d = false;
        return this;
    }

    public final ck I() {
        ci ciVar;
        ci ciVar2;
        ci ciVar3;
        ArrayList arrayList = new ArrayList(this.V.size() + this.L.size() + 3);
        arrayList.addAll(this.V);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.L);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        String str = this.D;
        int i2 = this.C;
        int i3 = this.F;
        if (str == null || "".equals(str.trim())) {
            if (i2 != 2 && i3 != 2) {
                ciVar = new ci(Date.class, i2, i3);
                ciVar2 = new ci(Timestamp.class, i2, i3);
                ciVar3 = new ci(java.sql.Date.class, i2, i3);
            }
            return new ck(this.Z, this.Code, this.I, this.S, this.f3098b, this.f3097a, this.f3100d, this.f3101e, this.f3102j, this.f3099c, this.B, arrayList);
        }
        ciVar = new ci(Date.class, str);
        ciVar2 = new ci(Timestamp.class, str);
        ciVar3 = new ci(java.sql.Date.class, str);
        arrayList.add(eb.V(Date.class, ciVar));
        arrayList.add(eb.V(Timestamp.class, ciVar2));
        arrayList.add(eb.V(java.sql.Date.class, ciVar3));
        return new ck(this.Z, this.Code, this.I, this.S, this.f3098b, this.f3097a, this.f3100d, this.f3101e, this.f3102j, this.f3099c, this.B, arrayList);
    }
}
