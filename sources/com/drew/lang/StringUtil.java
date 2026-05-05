package com.drew.lang;

import com.dynatrace.android.agent.Global;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class StringUtil {
    public static int compare(String str, String str2) {
        boolean z2 = str == null;
        boolean z3 = str2 == null;
        if (z2 && z3) {
            return 0;
        }
        if (z2) {
            return -1;
        }
        if (z3) {
            return 1;
        }
        return str.compareTo(str2);
    }

    public static String fromStream(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return sb.toString();
            }
            sb.append(line);
        }
    }

    public static String join(Iterable<? extends CharSequence> iterable, String str) {
        int length = str.length();
        Iterator<? extends CharSequence> it = iterable.iterator();
        StringBuilder sb = new StringBuilder(it.hasNext() ? it.next().length() + length : 0);
        Iterator<? extends CharSequence> it2 = iterable.iterator();
        if (it2.hasNext()) {
            sb.append(it2.next());
            while (it2.hasNext()) {
                sb.append(str);
                sb.append(it2.next());
            }
        }
        return sb.toString();
    }

    public static <T extends CharSequence> String join(T[] tArr, String str) {
        int length = str.length();
        int length2 = 0;
        for (T t2 : tArr) {
            length2 += t2.length() + length;
        }
        StringBuilder sb = new StringBuilder(length2);
        boolean z2 = true;
        for (T t3 : tArr) {
            if (z2) {
                z2 = false;
            } else {
                sb.append(str);
            }
            sb.append((CharSequence) t3);
        }
        return sb.toString();
    }

    public static String urlEncode(String str) {
        return str.replace(Global.BLANK, "%20");
    }
}
