package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.ContextCompat;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes7.dex */
class Store {
    static final String NO_BACKUP_FILE = "com.google.android.gms.appid-no-backup";
    static final String PREFERENCES = "com.google.android.gms.appid";
    private static final String SCOPE_ALL = "*";
    private static final String STORE_KEY_TOKEN = "|T|";
    final SharedPreferences store;

    static class Token {
        private static final String KEY_APP_VERSION = "appVersion";
        private static final String KEY_TIMESTAMP = "timestamp";
        private static final String KEY_TOKEN = "token";
        private static final long REFRESH_PERIOD_MILLIS = TimeUnit.DAYS.toMillis(7);
        final String appVersion;
        final long timestamp;
        final String token;

        private Token(String str, String str2, long j2) {
            this.token = str;
            this.appVersion = str2;
            this.timestamp = j2;
        }

        static String encode(String str, String str2, long j2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(KEY_TOKEN, str);
                jSONObject.put(KEY_APP_VERSION, str2);
                jSONObject.put("timestamp", j2);
                return jSONObject.toString();
            } catch (JSONException e2) {
                String str3 = "Failed to encode token: " + e2;
                return null;
            }
        }

        static Token parse(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new Token(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new Token(jSONObject.getString(KEY_TOKEN), jSONObject.getString(KEY_APP_VERSION), jSONObject.getLong("timestamp"));
            } catch (JSONException e2) {
                String str2 = "Failed to parse token: " + e2;
                return null;
            }
        }

        boolean needsRefresh(String str) {
            return System.currentTimeMillis() > this.timestamp + REFRESH_PERIOD_MILLIS || !str.equals(this.appVersion);
        }
    }

    public Store(Context context) throws Throwable {
        String strKd = C1561oA.Kd("@ML\u000eHQRKQK\u0015IWN][VR\u001dW^e!Uef`\\", (short) (OY.Xd() ^ 1786));
        short sXd = (short) (C1499aX.Xd() ^ (-10641));
        short sXd2 = (short) (C1499aX.Xd() ^ (-10461));
        int[] iArr = new int["@ \">GWd:} +;8Wk1X\u001b&:7Zf".length()];
        QB qb = new QB("@ \">GWd:} +;8Wk1X\u001b&:7Zf");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {strKd, 0};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Wg.vd("YXhH^Xj^^Knbddrfpfix", (short) (ZN.Xd() ^ 22607)), Class.forName(C1561oA.Xd("+#9%r2(60w\u001e@?7=7", (short) (OY.Xd() ^ 14120))), Integer.TYPE);
        try {
            method.setAccessible(true);
            this.store = (SharedPreferences) method.invoke(context, objArr);
            short sXd3 = (short) (C1633zX.Xd() ^ (-6542));
            short sXd4 = (short) (C1633zX.Xd() ^ (-8688));
            int[] iArr2 = new int["\u0015 \u001d\\\u0015\u001c\u001b\u0012\u0016\u000eU\b\u0014\t\u0016\u0012\u000b\u0005M\u0006\u000b\u0010I{\n\t\u0001zB\u0003\u0003?sqry\u0003|".length()];
            QB qb2 = new QB("\u0015 \u001d\\\u0015\u001c\u001b\u0012\u0016\u000eU\b\u0014\t\u0016\u0012\u000b\u0005M\u0006\u000b\u0010I{\n\t\u0001zB\u0003\u0003?sqry\u0003|");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(((sXd3 + i3) + xuXd2.CK(iKK2)) - sXd4);
                i3++;
            }
            checkForRestore(context, new String(iArr2, 0, i3));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void checkForRestore(Context context, String str) {
        File file = new File(ContextCompat.getNoBackupFilesDir(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || isEmpty()) {
                return;
            }
            deleteAll();
        } catch (IOException e2) {
            if (Log.isLoggable(Constants.TAG, 3)) {
                String str2 = "Error creating file in no backup dir: " + e2.getMessage();
            }
        }
    }

    private String createTokenKey(String str, String str2) {
        return str + STORE_KEY_TOKEN + str2 + "|*";
    }

    public synchronized void deleteAll() {
        this.store.edit().clear().commit();
    }

    public synchronized void deleteToken(String str, String str2) {
        String strCreateTokenKey = createTokenKey(str, str2);
        SharedPreferences.Editor editorEdit = this.store.edit();
        editorEdit.remove(strCreateTokenKey);
        editorEdit.commit();
    }

    public synchronized Token getToken(String str, String str2) {
        return Token.parse(this.store.getString(createTokenKey(str, str2), null));
    }

    public synchronized boolean isEmpty() {
        return this.store.getAll().isEmpty();
    }

    public synchronized void saveToken(String str, String str2, String str3, String str4) {
        String strEncode = Token.encode(str3, str4, System.currentTimeMillis());
        if (strEncode == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.store.edit();
        editorEdit.putString(createTokenKey(str, str2), strEncode);
        editorEdit.commit();
    }
}
