package com.incode.welcome_sdk.data.remote.beans;

import com.incode.welcome_sdk.data.remote.beans.q;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f9308a = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9309d = 0;

    public static final String e(ap apVar) {
        Iterator it;
        Object next;
        int i2 = 2 % 2;
        int i3 = f9309d + 45;
        f9308a = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(apVar, "");
            it = apVar.b().iterator();
            int i4 = 94 / 0;
        } else {
            Intrinsics.checkNotNullParameter(apVar, "");
            it = apVar.b().iterator();
        }
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(!Intrinsics.areEqual(((p) next).c(), "FINISH_GPT"))) {
                int i5 = f9308a + 3;
                f9309d = i5 % 128;
                int i6 = i5 % 2;
                break;
            }
        }
        p pVar = (p) next;
        if (pVar == null) {
            return null;
        }
        q qVarE = pVar.e();
        Intrinsics.checkNotNull(qVarE, "");
        return ((q.m) qVarE).b();
    }
}
