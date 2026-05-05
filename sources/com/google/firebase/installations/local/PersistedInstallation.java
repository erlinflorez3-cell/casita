package com.google.firebase.installations.local;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.json.JSONException;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes7.dex */
public class PersistedInstallation {
    private static final String AUTH_TOKEN_KEY = "AuthToken";
    private static final String EXPIRES_IN_SECONDS_KEY = "ExpiresInSecs";
    private static final String FIREBASE_INSTALLATION_ID_KEY = "Fid";
    private static final String FIS_ERROR_KEY = "FisError";
    private static final String PERSISTED_STATUS_KEY = "Status";
    private static final String REFRESH_TOKEN_KEY = "RefreshToken";
    private static final String SETTINGS_FILE_NAME_PREFIX = "PersistedInstallation";
    private static final String TOKEN_CREATION_TIME_IN_SECONDS_KEY = "TokenCreationEpochInSecs";
    private File dataFile;
    private final FirebaseApp firebaseApp;

    public enum RegistrationStatus {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public PersistedInstallation(FirebaseApp firebaseApp) {
        this.firebaseApp = firebaseApp;
    }

    private File getDataFile() {
        short sXd = (short) (FB.Xd() ^ 23809);
        int[] iArr = new int["\u0016,:<3>@22\u0018>DF4@A7KAHH\t".length()];
        QB qb = new QB("\u0016,:<3>@22\u0018>DF4@A7KAHH\t");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        if (this.dataFile == null) {
            synchronized (this) {
                if (this.dataFile == null) {
                    Context applicationContext = this.firebaseApp.getApplicationContext();
                    Object[] objArr = new Object[0];
                    Method method = Class.forName(Xg.qd("UcZigb^)_llseov1Gtt{m\u0002~", (short) (C1499aX.Xd() ^ (-27521)), (short) (C1499aX.Xd() ^ (-18152)))).getMethod(Jg.Wd("y*OSQf\u0016za9\u001d", (short) (OY.Xd() ^ 30714), (short) (OY.Xd() ^ 8802)), new Class[0]);
                    try {
                        method.setAccessible(true);
                        File file = (File) method.invoke(applicationContext, objArr);
                        StringBuilder sbAppend = new StringBuilder(str).append(this.firebaseApp.getPersistenceKey());
                        short sXd2 = (short) (OY.Xd() ^ 19573);
                        short sXd3 = (short) (OY.Xd() ^ 6375);
                        int[] iArr2 = new int["U\u0011\u001d'K".length()];
                        QB qb2 = new QB("U\u0011\u001d'K");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd3) + sXd2)));
                            i3++;
                        }
                        this.dataFile = new File(file, sbAppend.append(new String(iArr2, 0, i3)).toString());
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            }
        }
        return this.dataFile;
    }

    private JSONObject readJSONFromFile() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(getDataFile());
            while (true) {
                try {
                    int i2 = fileInputStream.read(bArr, 0, 16384);
                    if (i2 < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, i2);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    public void clearForTesting() {
        getDataFile().delete();
    }

    public PersistedInstallationEntry insertOrUpdatePersistedInstallationEntry(PersistedInstallationEntry persistedInstallationEntry) {
        File fileCreateTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            short sXd = (short) (Od.Xd() ^ (-2546));
            short sXd2 = (short) (Od.Xd() ^ (-2005));
            int[] iArr = new int["\u0004\u001cH".length()];
            QB qb = new QB("\u0004\u001cH");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                i2++;
            }
            jSONObject.put(new String(iArr, 0, i2), persistedInstallationEntry.getFirebaseInstallationId());
            jSONObject.put(Ig.wd("\u001e\u000b\u0004Lc-", (short) (ZN.Xd() ^ 189)), persistedInstallationEntry.getRegistrationStatus().ordinal());
            jSONObject.put(EO.Od("P3Vk\tY+'S", (short) (Od.Xd() ^ (-15294))), persistedInstallationEntry.getAuthToken());
            jSONObject.put(C1561oA.Qd("K]]hZg[F`[T\\", (short) (C1607wl.Xd() ^ 20420)), persistedInstallationEntry.getRefreshToken());
            short sXd3 = (short) (ZN.Xd() ^ 4187);
            short sXd4 = (short) (ZN.Xd() ^ 12591);
            int[] iArr2 = new int["\\xupzP\u0001tq\u0006{\u0003\u0003Z\u0007\u0007{\u0002c\no\u0003\u0002\u0013".length()];
            QB qb2 = new QB("\\xupzP\u0001tq\u0006{\u0003\u0003Z\u0007\u0007{\u0002c\no\u0003\u0002\u0013");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i3)) - sXd4);
                i3++;
            }
            jSONObject.put(new String(iArr2, 0, i3), persistedInstallationEntry.getTokenCreationEpochInSecs());
            jSONObject.put(C1561oA.od("b\u0015\f\u0004\f}\u000b_\u0004gxu\u0005", (short) (C1633zX.Xd() ^ (-30655))), persistedInstallationEntry.getExpiresInSecs());
            jSONObject.put(C1561oA.Kd("a\u0006\u0011c\u0012\u0013\u0011\u0015", (short) (ZN.Xd() ^ 9836)), persistedInstallationEntry.getFisError());
            short sXd5 = (short) (C1499aX.Xd() ^ (-2259));
            short sXd6 = (short) (C1499aX.Xd() ^ (-19949));
            int[] iArr3 = new int[".\u001c>U!DW\"61,J]$DZ%QXwL".length()];
            QB qb3 = new QB(".\u001c>U!DW\"61,J]$DZ%QXwL");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(((i4 * sXd6) ^ sXd5) + xuXd3.CK(iKK3));
                i4++;
            }
            String str = new String(iArr3, 0, i4);
            String strXd = C1561oA.Xd("vpt", (short) (C1633zX.Xd() ^ (-386)));
            Context applicationContext = this.firebaseApp.getApplicationContext();
            Object[] objArr = new Object[0];
            Method method = Class.forName(Wg.vd("\u0015#\u0016%'\"\u001ad\u001f,(/%/2l\u0007407-A:", (short) (C1580rY.Xd() ^ (-9028)))).getMethod(Qg.kd("!\u001e,|\u001f!\u0019&u\u001a\"", (short) (C1580rY.Xd() ^ (-65)), (short) (C1580rY.Xd() ^ (-8393))), new Class[0]);
            try {
                method.setAccessible(true);
                fileCreateTempFile = File.createTempFile(str, strXd, (File) method.invoke(applicationContext, objArr));
                FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                String string = jSONObject.toString();
                short sXd7 = (short) (C1499aX.Xd() ^ (-14895));
                short sXd8 = (short) (C1499aX.Xd() ^ (-15446));
                int[] iArr4 = new int["^\\M3=".length()];
                QB qb4 = new QB("^\\M3=");
                int i5 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i5] = xuXd4.fK(sXd7 + i5 + xuXd4.CK(iKK4) + sXd8);
                    i5++;
                }
                fileOutputStream.write(string.getBytes(new String(iArr4, 0, i5)));
                fileOutputStream.close();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (IOException | JSONException unused) {
        }
        if (fileCreateTempFile.renameTo(getDataFile())) {
            return persistedInstallationEntry;
        }
        throw new IOException(C1561oA.ud("\u0007~ppyq+~x(yksepg!tgc\u001dphj_ac[\u0015hb\u0012AUaaV__OM1UYYEONBTHMK", (short) (C1607wl.Xd() ^ 9172)));
    }

    public PersistedInstallationEntry readPersistedInstallationEntryValue() {
        JSONObject jSONFromFile = readJSONFromFile();
        String strOptString = jSONFromFile.optString(FIREBASE_INSTALLATION_ID_KEY, null);
        int iOptInt = jSONFromFile.optInt(PERSISTED_STATUS_KEY, RegistrationStatus.ATTEMPT_MIGRATION.ordinal());
        String strOptString2 = jSONFromFile.optString(AUTH_TOKEN_KEY, null);
        String strOptString3 = jSONFromFile.optString(REFRESH_TOKEN_KEY, null);
        long jOptLong = jSONFromFile.optLong(TOKEN_CREATION_TIME_IN_SECONDS_KEY, 0L);
        long jOptLong2 = jSONFromFile.optLong(EXPIRES_IN_SECONDS_KEY, 0L);
        return PersistedInstallationEntry.builder().setFirebaseInstallationId(strOptString).setRegistrationStatus(RegistrationStatus.values()[iOptInt]).setAuthToken(strOptString2).setRefreshToken(strOptString3).setTokenCreationEpochInSecs(jOptLong).setExpiresInSecs(jOptLong2).setFisError(jSONFromFile.optString(FIS_ERROR_KEY, null)).build();
    }
}
