package com.facetec.sdk;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Process;
import com.biocatch.client.android.sdk.core.Constants;
import com.facetec.sdk.a;
import com.facetec.sdk.cf;
import com.facetec.sdk.ft;
import com.facetec.sdk.fv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class S {
    private static ft V = null;
    private final Semaphore I = new Semaphore(1);

    static class Code extends ax {
        private ArrayList<String> B;
        private String Code;
        private Semaphore I;
        private a.Z Z;

        Code(Context context, a.Z z2, ArrayList<String> arrayList, String str, Semaphore semaphore) {
            super(context);
            this.Z = z2;
            this.B = arrayList;
            this.Code = str;
            this.I = semaphore;
        }

        @Override // com.facetec.sdk.ax
        final void Code() throws Throwable {
            if (this.Z != a.Z.USER_CANCELLED) {
                Process.setThreadPriority(19);
            }
            a.Code(this.V, this.Code, this.B, "");
            this.I.release();
        }
    }

    S() {
    }

    private static synchronized ft V() {
        if (V == null) {
            V = Z();
        }
        return V;
    }

    private static ft Z() {
        return new ft.Z().Z(TimeUnit.SECONDS).B(TimeUnit.SECONDS).V(TimeUnit.SECONDS).I();
    }

    final void Code() {
        Semaphore semaphore = this.I;
        if (semaphore != null) {
            try {
                if (semaphore.tryAcquire(5L, TimeUnit.SECONDS)) {
                    this.I.release();
                }
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    }

    final synchronized void Code(Context context, a.Z z2) {
        boolean zM = ai.m();
        ArrayList arrayList = new ArrayList();
        arrayList.add(bo.V);
        ah ahVarL = ai.L();
        if (ahVarL == ah.PROCESSING_COMPLETE_SUCCESS) {
            arrayList.add(bo.Z);
        } else if (ahVarL == ah.PROCESSING_COMPLETE_RETRY) {
            arrayList.add(bo.I);
        } else if (z2 == a.Z.USER_CANCELLED) {
            arrayList.add(bo.B);
            arrayList.add(a.B);
        } else if (z2 == a.Z.SESSION_CONTEXT_SWITCH) {
            arrayList.add(bo.Code);
            arrayList.add(a.B);
        } else if (z2 == a.Z.PRE_SESSION_PHASE_1_TIMEOUT) {
            arrayList.add(bo.f3043g);
            arrayList.add(a.B);
        } else if (z2 == a.Z.PRE_SESSION_PHASE_2_TIMEOUT) {
            arrayList.add(bo.f3045i);
            arrayList.add(a.B);
        } else if (z2 == a.Z.SESSION_TIMEOUT) {
            arrayList.add(bo.L);
            arrayList.add(a.B);
        } else {
            arrayList.add(bo.I);
        }
        if (zM) {
            arrayList.add(bo.C);
        } else {
            arrayList.add(bo.F);
        }
        if (z2 != a.Z.USER_WAS_SUCCESSFUL) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ai.v((String) it.next());
            }
        }
        if (a.V()) {
            try {
                this.I.acquire();
                new Code(context, z2, arrayList, null, this.I).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            } catch (InterruptedException e2) {
                L.V(e2);
            }
        }
    }

    final synchronized void Z(FaceTecSessionResult faceTecSessionResult, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("faceScan", faceTecSessionResult.getFaceScanBase64());
            jSONObject.put("auditTrailImage", faceTecSessionResult.getAuditTrailCompressedBase64()[0]);
            jSONObject.put("lowQualityAuditTrailImage", faceTecSessionResult.getLowQualityAuditTrailCompressedBase64()[0]);
            if (a.V()) {
                V().I(new fv.Z().I("https://api.facetec.com/api/v3/biometrics/liveness-3d").Code("Content-Type", Constants.WUP_CONTENT_TYPE).Code("X-Device-Key", str).Code("User-Agent", FaceTecSDK.createFaceTecAPIUserAgentString(faceTecSessionResult.getSessionId())).B(gb.V(fw.V("application/json; charset=utf-8"), jSONObject.toString())).Z()).Z(new cf.I() { // from class: com.facetec.sdk.S.2
                    @Override // com.facetec.sdk.cf.I
                    public final void B(fy fyVar) {
                    }

                    @Override // com.facetec.sdk.cf.I
                    public final void Z() {
                    }
                });
            }
        } catch (JSONException unused) {
        }
    }
}
