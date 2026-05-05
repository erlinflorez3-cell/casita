package com.google.android.gms.internal.clearcut;

import com.dynatrace.android.agent.Global;
import cz.msebera.android.httpclient.message.TokenParser;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzdr {
    static String zza(zzdo zzdoVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ").append(str);
        zza(zzdoVar, sb, 0);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:236:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0239  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zza(com.google.android.gms.internal.clearcut.zzdo r13, java.lang.StringBuilder r14, int r15) {
        /*
            Method dump skipped, instruction units count: 699
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzdr.zza(com.google.android.gms.internal.clearcut.zzdo, java.lang.StringBuilder, int):void");
    }

    static final void zza(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zza(sb, i2, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zza(sb, i2, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append(TokenParser.SP);
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"").append(zzet.zzc(zzbb.zzf((String) obj))).append('\"');
            return;
        }
        if (obj instanceof zzbb) {
            sb.append(": \"").append(zzet.zzc((zzbb) obj)).append('\"');
            return;
        }
        if (obj instanceof zzcg) {
            sb.append(" {");
            zza((zzcg) obj, sb, i2 + 2);
            sb.append("\n");
            while (i3 < i2) {
                sb.append(TokenParser.SP);
                i3++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ").append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i5 = i2 + 2;
        zza(sb, i5, "key", entry.getKey());
        zza(sb, i5, "value", entry.getValue());
        sb.append("\n");
        while (i3 < i2) {
            sb.append(TokenParser.SP);
            i3++;
        }
        sb.append("}");
    }

    private static final String zzj(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.isUpperCase(cCharAt)) {
                sb.append(Global.UNDERSCORE);
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }
}
