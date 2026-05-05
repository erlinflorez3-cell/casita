package com.google.android.gms.internal.phenotype;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public class zzf {
    private static HashMap<String, String> zzbi = null;
    private static Object zzbn = null;
    private static boolean zzbo = false;
    private static final Uri CONTENT_URI = Uri.parse("content://com.google.android.gsf.gservices");
    private static final Uri zzbe = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    private static final Pattern zzbf = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    private static final Pattern zzbg = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static final AtomicBoolean zzbh = new AtomicBoolean();
    private static final HashMap<String, Boolean> zzbj = new HashMap<>();
    private static final HashMap<String, Integer> zzbk = new HashMap<>();
    private static final HashMap<String, Long> zzbl = new HashMap<>();
    private static final HashMap<String, Float> zzbm = new HashMap<>();
    private static String[] zzbp = new String[0];

    private static <T> T zza(HashMap<String, T> map, String str, T t2) {
        synchronized (zzf.class) {
            if (!map.containsKey(str)) {
                return null;
            }
            T t3 = map.get(str);
            if (t3 != null) {
                t2 = t3;
            }
            return t2;
        }
    }

    public static String zza(ContentResolver contentResolver, String str, String str2) {
        synchronized (zzf.class) {
            zza(contentResolver);
            Object obj = zzbn;
            if (zzbi.containsKey(str)) {
                String str3 = zzbi.get(str);
                return str3 != null ? str3 : null;
            }
            for (String str4 : zzbp) {
                if (str.startsWith(str4)) {
                    if (!zzbo || zzbi.isEmpty()) {
                        zzbi.putAll(zza(contentResolver, zzbp));
                        zzbo = true;
                        if (zzbi.containsKey(str)) {
                            String str5 = zzbi.get(str);
                            return str5 != null ? str5 : null;
                        }
                    }
                    return null;
                }
            }
            Cursor cursorQuery = contentResolver.query(CONTENT_URI, null, null, new String[]{str}, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(1);
                        if (string != null && string.equals(null)) {
                            string = null;
                        }
                        zza(obj, str, string);
                        String str6 = string != null ? string : null;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return str6;
                    }
                } finally {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            }
            zza(obj, str, (String) null);
            return null;
        }
    }

    private static Map<String, String> zza(ContentResolver contentResolver, String... strArr) {
        Cursor cursorQuery = contentResolver.query(zzbe, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (cursorQuery == null) {
            return treeMap;
        }
        while (cursorQuery.moveToNext()) {
            try {
                treeMap.put(cursorQuery.getString(0), cursorQuery.getString(1));
            } finally {
                cursorQuery.close();
            }
        }
        return treeMap;
    }

    private static void zza(ContentResolver contentResolver) {
        if (zzbi == null) {
            zzbh.set(false);
            zzbi = new HashMap<>();
            zzbn = new Object();
            zzbo = false;
            contentResolver.registerContentObserver(CONTENT_URI, true, new zzg(null));
            return;
        }
        if (zzbh.getAndSet(false)) {
            zzbi.clear();
            zzbj.clear();
            zzbk.clear();
            zzbl.clear();
            zzbm.clear();
            zzbn = new Object();
            zzbo = false;
        }
    }

    private static void zza(Object obj, String str, String str2) {
        synchronized (zzf.class) {
            if (obj == zzbn) {
                zzbi.put(str, str2);
            }
        }
    }

    public static boolean zza(ContentResolver contentResolver, String str, boolean z2) {
        Object objZzb = zzb(contentResolver);
        HashMap<String, Boolean> map = zzbj;
        Boolean boolValueOf = (Boolean) zza(map, str, Boolean.valueOf(z2));
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        String strZza = zza(contentResolver, str, (String) null);
        if (strZza != null && !strZza.equals("")) {
            if (zzbf.matcher(strZza).matches()) {
                z2 = true;
            } else if (zzbg.matcher(strZza).matches()) {
                z2 = false;
            } else {
                String str2 = "attempt to read gservices key " + str + " (value \"" + strZza + "\") as boolean";
            }
            boolValueOf = Boolean.valueOf(z2);
        }
        synchronized (zzf.class) {
            if (objZzb == zzbn) {
                map.put(str, boolValueOf);
                zzbi.remove(str);
            }
        }
        return z2;
    }

    private static Object zzb(ContentResolver contentResolver) {
        Object obj;
        synchronized (zzf.class) {
            zza(contentResolver);
            obj = zzbn;
        }
        return obj;
    }
}
