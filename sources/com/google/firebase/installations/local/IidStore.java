package com.google.firebase.installations.local;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.webkit.ProxyConfig;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.stats.CodePackage;
import com.google.common.base.Ascii;
import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes7.dex */
public class IidStore {
    private static final String[] ALLOWABLE_SCOPES = {ProxyConfig.MATCH_ALL_SCHEMES, FirebaseMessaging.INSTANCE_ID_SCOPE, CodePackage.GCM, ""};
    private static final String IID_SHARED_PREFS_NAME = "com.google.android.gms.appid";
    private static final String JSON_ENCODED_PREFIX = "{";
    private static final String JSON_TOKEN_KEY = "token";
    private static final String STORE_KEY_ID = "|S|id";
    private static final String STORE_KEY_PUB = "|S||P|";
    private static final String STORE_KEY_SEPARATOR = "|";
    private static final String STORE_KEY_TOKEN = "|T|";
    private final String defaultSenderId;
    private final SharedPreferences iidPrefs;

    public IidStore(SharedPreferences sharedPreferences, String str) {
        this.iidPrefs = sharedPreferences;
        this.defaultSenderId = str;
    }

    public IidStore(FirebaseApp firebaseApp) throws Throwable {
        Context applicationContext = firebaseApp.getApplicationContext();
        String strXd = ZO.xd("?e{G&f=R'/Y!\b\t=(%\u0019\u007fb1[6KF1| ", (short) (OY.Xd() ^ 21323), (short) (OY.Xd() ^ 4561));
        short sXd = (short) (OY.Xd() ^ 18534);
        short sXd2 = (short) (OY.Xd() ^ 27465);
        int[] iArr = new int["A8\u0012\u001fi\"`^C\u001a4H\\b60(e\u0004,\u0016v{".length()];
        QB qb = new QB("A8\u0012\u001fi\"`^C\u001a4H\\b60(e\u0004,\u0016v{");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = {Class.forName(Ig.wd("9\u0003*,!\u0013[`~\u0005(o\u001b$t\u0013", (short) (Od.Xd() ^ (-28266)))), Integer.TYPE};
        Object[] objArr = {strXd, 0};
        short sXd3 = (short) (C1607wl.Xd() ^ 25134);
        int[] iArr2 = new int["4d\"!U\u001b\u0010K\t9Uj\u0016\u0013<Q\u0007\u001aDj".length()];
        QB qb2 = new QB("4d\"!U\u001b\u0010K\t9Uj\u0016\u0013<Q\u0007\u001aDj");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + i3)) + xuXd2.CK(iKK2));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            this.iidPrefs = (SharedPreferences) method.invoke(applicationContext, objArr);
            this.defaultSenderId = getDefaultSenderId(firebaseApp);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private String createTokenKey(String str, String str2) {
        return STORE_KEY_TOKEN + str + STORE_KEY_SEPARATOR + str2;
    }

    private static String getDefaultSenderId(FirebaseApp firebaseApp) {
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        String applicationId = firebaseApp.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:") && !applicationId.startsWith("2:")) {
            return applicationId;
        }
        String[] strArrSplit = applicationId.split(Global.COLON);
        if (strArrSplit.length != 4) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private static String getIdFromPublicKey(PublicKey publicKey) throws Throwable {
        try {
            byte[] bArrDigest = MessageDigest.getInstance(C1561oA.Qd("\u000b~ve", (short) (C1580rY.Xd() ^ (-9901)))).digest(publicKey.getEncoded());
            byte b2 = bArrDigest[0];
            int i2 = ((b2 + Ascii.SI) - (b2 | Ascii.SI)) + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION;
            bArrDigest[0] = (byte) ((i2 + 255) - (i2 | 255));
            Object[] objArr = {bArrDigest, 0, 8, 11};
            Method declaredMethod = Class.forName(C1593ug.zd("\f\u001a\u0011 \u001e\u0019\u0015_((\u001e\"dy\u001a- qp", (short) (C1499aX.Xd() ^ (-19143)), (short) (C1499aX.Xd() ^ (-19341)))).getDeclaredMethod(C1561oA.od("'/#.\"\"\u0010*\r-* $\u001c", (short) (C1607wl.Xd() ^ 5964)), byte[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE);
            try {
                declaredMethod.setAccessible(true);
                return (String) declaredMethod.invoke(null, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (NoSuchAlgorithmException unused) {
            C1561oA.Kd("\u001cIIPBLS6BNXIX", (short) (C1607wl.Xd() ^ 5755));
            Wg.Zd("P\u0017^\u0010P\u007f\u001e}\u0017@L1\u0007A^0\u00120Ed>k\u0006P97}0n%D\u0006mp.b%Y|8eQ]\u0010L\u0013>o+M\u001bK", (short) (Od.Xd() ^ (-14052)), (short) (Od.Xd() ^ (-29997)));
            return null;
        }
    }

    private String parseIidTokenFromJson(String str) {
        try {
            return new JSONObject(str).getString(JSON_TOKEN_KEY);
        } catch (JSONException unused) {
            return null;
        }
    }

    private PublicKey parseKey(String str) {
        try {
            Class<?> cls = Class.forName(C1561oA.Xd("\u0004\u0012\t\u0018\u0016\u0011\rW  \u0016\u001a\\q\u0012%\u0018ih", (short) (Od.Xd() ^ (-16872))));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(Wg.vd("rj|h:ykyg/Qsvnpj", (short) (C1607wl.Xd() ^ 8911)));
            clsArr[1] = Integer.TYPE;
            Object[] objArr = {str, 8};
            Method declaredMethod = cls.getDeclaredMethod(Qg.kd("PPMXLL", (short) (ZN.Xd() ^ 12223), (short) (ZN.Xd() ^ 9558)), clsArr);
            try {
                declaredMethod.setAccessible(true);
                return KeyFactory.getInstance(hg.Vd("||i", (short) (OY.Xd() ^ 17045), (short) (OY.Xd() ^ 3028))).generatePublic(new X509EncodedKeySpec((byte[]) declaredMethod.invoke(null, objArr)));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e3) {
            String str2 = C1561oA.ud("9]dNXTN\tSL_\u0005WWQSEC}", (short) (OY.Xd() ^ 14075)) + e3;
            C1561oA.yd("Hsqvnv{\\^hp_t", (short) (C1580rY.Xd() ^ (-24582)));
            return null;
        }
    }

    private String readInstanceIdFromLocalStorage() {
        String string;
        synchronized (this.iidPrefs) {
            string = this.iidPrefs.getString(STORE_KEY_ID, null);
        }
        return string;
    }

    private String readPublicKeyFromLocalStorageAndCalculateInstanceId() {
        synchronized (this.iidPrefs) {
            String string = this.iidPrefs.getString(STORE_KEY_PUB, null);
            if (string == null) {
                return null;
            }
            PublicKey key = parseKey(string);
            if (key == null) {
                return null;
            }
            return getIdFromPublicKey(key);
        }
    }

    public String readIid() {
        synchronized (this.iidPrefs) {
            String instanceIdFromLocalStorage = readInstanceIdFromLocalStorage();
            if (instanceIdFromLocalStorage != null) {
                return instanceIdFromLocalStorage;
            }
            return readPublicKeyFromLocalStorageAndCalculateInstanceId();
        }
    }

    public String readToken() {
        synchronized (this.iidPrefs) {
            for (String str : ALLOWABLE_SCOPES) {
                String string = this.iidPrefs.getString(createTokenKey(this.defaultSenderId, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith(JSON_ENCODED_PREFIX)) {
                        string = parseIidTokenFromJson(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }
}
