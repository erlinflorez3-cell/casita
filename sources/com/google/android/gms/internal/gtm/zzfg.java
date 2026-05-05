package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;
import kotlin.text.Typography;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
final class zzfg extends zzbu {
    private static final byte[] zza = "\n".getBytes();
    private final String zzb;
    private final zzfq zzc;

    zzfg(zzbx zzbxVar) {
        super(zzbxVar);
        this.zzb = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleAnalytics", zzbv.zza, Build.VERSION.RELEASE, zzfu.zzd(Locale.getDefault()), Build.MODEL, Build.ID);
        this.zzc = new zzfq(zzbxVar.zzr());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.OutputStream, java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzg(java.net.URL r7, byte[] r8, int r9) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.String r3 = "Error closing http post connection output stream"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)
            int r2 = r8.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.String r0 = "POST bytes, url"
            r6.zzG(r0, r1, r7)
            boolean r0 = zzU()
            if (r0 == 0) goto L22
            java.lang.String r1 = new java.lang.String
            r1.<init>(r8)
            java.lang.String r0 = "Post payload\n"
            r6.zzO(r0, r1)
        L22:
            r5 = 0
            java.net.HttpURLConnection r4 = r6.zzb(r7)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L69
            r0 = 1
            r4.setDoOutput(r0)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L81
            r4.setFixedLengthStreamingMode(r2)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L81
            com.dynatrace.android.callback.Callback.connect(r4)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L81
            java.io.OutputStream r5 = com.dynatrace.android.callback.Callback.getOutputStream(r4)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L81
            r5.write(r8)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L81
            r6.zzk(r4)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L81
            int r2 = com.dynatrace.android.callback.Callback.getResponseCode(r4)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L81
            r1 = 200(0xc8, float:2.8E-43)
            if (r2 != r1) goto L4b
            com.google.android.gms.internal.gtm.zzbs r0 = r6.zzs()     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L81
            r0.zzi()     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L81
            r2 = r1
        L4b:
            java.lang.String r1 = "POST status"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L81
            r6.zzF(r1, r0)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L81
            if (r5 == 0) goto L5e
            r5.close()     // Catch: java.io.IOException -> L5a
            goto L5e
        L5a:
            r0 = move-exception
            r6.zzJ(r3, r0)
        L5e:
            if (r4 == 0) goto L63
            r4.disconnect()
        L63:
            return r2
        L64:
            r1 = move-exception
            goto L6b
        L66:
            r1 = move-exception
            r4 = r5
            goto L82
        L69:
            r1 = move-exception
            r4 = r5
        L6b:
            java.lang.String r0 = "Network POST connection error"
            r6.zzR(r0, r1)     // Catch: java.lang.Throwable -> L81
            if (r5 == 0) goto L7a
            r5.close()     // Catch: java.io.IOException -> L76
            goto L7a
        L76:
            r0 = move-exception
            r6.zzJ(r3, r0)
        L7a:
            if (r4 == 0) goto L7f
            r4.disconnect()
        L7f:
            r0 = 0
            return r0
        L81:
            r1 = move-exception
        L82:
            if (r5 == 0) goto L8c
            r5.close()     // Catch: java.io.IOException -> L88
            goto L8c
        L88:
            r0 = move-exception
            r6.zzJ(r3, r0)
        L8c:
            if (r4 == 0) goto L91
            r4.disconnect()
        L91:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfg.zzg(java.net.URL, byte[], int):int");
    }

    private final URL zzh() {
        zzw();
        String strZzi = zzcv.zzi();
        zzw();
        try {
            return new URL(strZzi.concat((String) zzew.zzt.zzb()));
        } catch (MalformedURLException e2) {
            zzJ("Error trying to parse the hardcoded host url", e2);
            return null;
        }
    }

    private final URL zzi(zzez zzezVar) {
        String strConcat;
        if (zzezVar.zzh()) {
            zzw();
            String strZzi = zzcv.zzi();
            zzw();
            strConcat = strZzi.concat(zzcv.zzj());
        } else {
            zzw();
            String strZzk = zzcv.zzk();
            zzw();
            strConcat = strZzk.concat(zzcv.zzj());
        }
        try {
            return new URL(strConcat);
        } catch (MalformedURLException e2) {
            zzJ("Error trying to parse the hardcoded host url", e2);
            return null;
        }
    }

    private final URL zzj(zzez zzezVar, String str) {
        String str2;
        if (zzezVar.zzh()) {
            zzw();
            String strZzi = zzcv.zzi();
            zzw();
            str2 = strZzi + zzcv.zzj() + Global.QUESTION + str;
        } else {
            zzw();
            String strZzk = zzcv.zzk();
            zzw();
            str2 = strZzk + zzcv.zzj() + Global.QUESTION + str;
        }
        try {
            return new URL(str2);
        } catch (MalformedURLException e2) {
            zzJ("Error trying to parse the hardcoded host url", e2);
            return null;
        }
    }

    private final void zzk(HttpURLConnection httpURLConnection) throws Throwable {
        InputStream inputStream;
        try {
            inputStream = Callback.getInputStream(httpURLConnection);
            try {
                do {
                } while (inputStream.read(new byte[1024]) > 0);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        zzJ("Error closing http connection input stream", e2);
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        zzJ("Error closing http connection input stream", e3);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    private static final void zzl(StringBuilder sb, String str, String str2) throws UnsupportedEncodingException {
        if (sb.length() != 0) {
            sb.append(Typography.amp);
        }
        sb.append(URLEncoder.encode(str, "UTF-8"));
        sb.append('=');
        sb.append(URLEncoder.encode(str2, "UTF-8"));
    }

    final String zza(zzez zzezVar, boolean z2) {
        Preconditions.checkNotNull(zzezVar);
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry entry : zzezVar.zzg().entrySet()) {
                String str = (String) entry.getKey();
                if (!"ht".equals(str) && !"qt".equals(str) && !"AppUID".equals(str) && !"z".equals(str) && !"_gmsv".equals(str)) {
                    zzl(sb, str, (String) entry.getValue());
                }
            }
            zzl(sb, "ht", String.valueOf(zzezVar.zzd()));
            zzl(sb, "qt", String.valueOf(zzC().currentTimeMillis() - zzezVar.zzd()));
            zzw();
            if (z2) {
                long jZzc = zzezVar.zzc();
                zzl(sb, "z", jZzc != 0 ? String.valueOf(jZzc) : String.valueOf(zzezVar.zzb()));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e2) {
            zzJ("Failed to encode name or value", e2);
            return null;
        }
    }

    final HttpURLConnection zzb(URL url) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        Callback.openConnection(uRLConnectionOpenConnection);
        if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
            throw new IOException("Failed to obtain http connection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setDefaultUseCaches(false);
        zzw();
        httpURLConnection.setConnectTimeout(((Integer) zzew.zzE.zzb()).intValue());
        zzw();
        httpURLConnection.setReadTimeout(((Integer) zzew.zzF.zzb()).intValue());
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestProperty("User-Agent", this.zzb);
        httpURLConnection.setDoInput(true);
        return httpURLConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:189:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0200 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x013a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0258 A[EDGE_INSN: B:357:0x0258->B:288:0x0258 BREAK  A[LOOP:1: B:280:0x021b->B:361:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:361:? A[LOOP:1: B:280:0x021b->B:361:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:365:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zzc(java.util.List r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 786
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfg.zzc(java.util.List):java.util.List");
    }

    @Override // com.google.android.gms.internal.gtm.zzbu
    protected final void zzd() {
        zzO("Network initialized. User agent", this.zzb);
    }

    public final boolean zze() throws Throwable {
        NetworkInfo activeNetworkInfo;
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        Context contextZzo = zzo();
        String strXd = ZO.xd("\u007fhB'g|n=&Th:", (short) (C1580rY.Xd() ^ (-2753)), (short) (C1580rY.Xd() ^ (-21911)));
        short sXd = (short) (C1633zX.Xd() ^ (-23499));
        short sXd2 = (short) (C1633zX.Xd() ^ (-29053));
        int[] iArr = new int["c*% q9x\u0015\\H4%\u0012E\u0013nK\u0019D3\u0001\\m".length()];
        QB qb = new QB("c*% q9x\u0015\\H4%\u0012E\u0013nK\u0019D3\u0001\\m");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {strXd};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(EO.Od("`\u0018IHG\u0006j$~h\u0011Dv[e\u000e", (short) (FB.Xd() ^ 18624)), Class.forName(Ig.wd("e\u0013Z`tvS jP{7\u000bs\\r", (short) (OY.Xd() ^ 23608))));
        try {
            method.setAccessible(true);
            try {
                activeNetworkInfo = ((ConnectivityManager) method.invoke(contextZzo, objArr)).getActiveNetworkInfo();
            } catch (SecurityException unused) {
                activeNetworkInfo = null;
            }
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return true;
            }
            short sXd3 = (short) (ZN.Xd() ^ 26107);
            int[] iArr2 = new int["\u0007'V$\u001a(*!#\u001bN\u0011\u001c\u001a\u0019\u000f\f\u001c\u0010\u001c\u000e\u0018\u001c".length()];
            QB qb2 = new QB("\u0007'V$\u001a(*!#\u001bN\u0011\u001c\u001a\u0019\u000f\f\u001c\u0010\u001c\u000e\u0018\u001c");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            zzN(new String(iArr2, 0, i3));
            return false;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
