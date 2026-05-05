package cl.json.social;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import cl.json.RNShareImpl;
import cl.json.ShareFile;
import cl.json.ShareFiles;
import com.dynatrace.android.agent.Global;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.sentry.SentryLockReason;
import io.sentry.SentryReplayEvent;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.CX;
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
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ShareIntent {
    protected ShareFile backgroundAsset;
    protected String chooserTitle = "Share";
    protected ShareFile fileShare;
    protected Intent intent;
    protected ReadableMap options;
    protected final ReactApplicationContext reactContext;
    protected ShareFile stickerAsset;

    /* JADX INFO: renamed from: cl.json.social.ShareIntent$1 */
    class AnonymousClass1 implements Comparator<HashMap<String, String>> {
        AnonymousClass1() {
        }

        @Override // java.util.Comparator
        public int compare(HashMap<String, String> map, HashMap<String, String> map2) {
            return map.get("simpleName").compareTo(map2.get("simpleName"));
        }
    }

    public ShareIntent(ReactApplicationContext reactApplicationContext) {
        this.reactContext = reactApplicationContext;
        setIntent(new Intent("android.intent.action.SEND"));
        getIntent().setType("text/plain");
    }

    private ComponentName[] getExcludedComponentArray(ReadableArray readableArray) throws Throwable {
        if (readableArray == null) {
            return null;
        }
        Intent intent = new Intent(getIntent().getAction());
        intent.setType(getIntent().getType());
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = this.reactContext.getPackageManager();
        Object[] objArr = {intent, 0};
        Method method = Class.forName(C1593ug.zd("6D;JHC?\n@MMTFPW\u0012US\u00158JMVMTS<Q_SZYg", (short) (OY.Xd() ^ 1862), (short) (OY.Xd() ^ 25797))).getMethod(C1561oA.Kd("hm^ltEkrdnuCfxn|p|ro~", (short) (ZN.Xd() ^ 20524)), Class.forName(C1561oA.od("EQFSOHB\u000b?JHM=EJ\u0003\u001dAF6>C", (short) (ZN.Xd() ^ 11671))), Integer.TYPE);
        try {
            method.setAccessible(true);
            List<ResolveInfo> list = (List) method.invoke(packageManager, objArr);
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                String string = readableArray.getString(i2);
                for (ResolveInfo resolveInfo : list) {
                    if (resolveInfo.activityInfo.packageName.equals(string)) {
                        arrayList.add(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name));
                    }
                }
            }
            return (ComponentName[]) arrayList.toArray(new ComponentName[0]);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static boolean hasValidKey(String str, ReadableMap readableMap) {
        return (readableMap == null || !readableMap.hasKey(str) || readableMap.isNull(str)) ? false : true;
    }

    public static boolean isPackageInstalled(String str, Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.Zd(",#bzQ59L{q:I\u0014\u0007\u0017\u001a(>\u0007\u0017a^c", (short) (OY.Xd() ^ 3269), (short) (OY.Xd() ^ 6628))).getMethod(C1561oA.Xd("vu\u0006btw\u0001w~}f{\n}\u0005\u0004\u0012", (short) (FB.Xd() ^ 23700)), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            try {
                Class<?> cls = Class.forName(Wg.vd("SaTce`X#]jfmcmp+RP\u000e1GJOFQP5J\\PSRD", (short) (OY.Xd() ^ 10405)));
                Class<?>[] clsArr = new Class[2];
                clsArr[0] = Class.forName(Qg.kd("ndxb.k_kc)Mmj`d\\", (short) (C1633zX.Xd() ^ (-17359)), (short) (C1633zX.Xd() ^ (-4693))));
                clsArr[1] = Integer.TYPE;
                Object[] objArr2 = {str, 1};
                short sXd = (short) (ZN.Xd() ^ 7648);
                short sXd2 = (short) (ZN.Xd() ^ 9342);
                int[] iArr = new int["MJX3CDK@EB%I@H".length()];
                QB qb = new QB("MJX3CDK@EB%I@H");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                    i2++;
                }
                Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method2.setAccessible(true);
                    method2.invoke(packageManager, objArr2);
                    return true;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    protected static String urlEncode(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("URLEncoder.encode() failed for " + str);
        }
    }

    public Intent excludeChooserIntent(Intent intent, ReadableMap readableMap) throws Throwable {
        String strQd;
        String strWd;
        ArrayList arrayList = new ArrayList();
        ArrayList<HashMap> arrayList2 = new ArrayList();
        Intent intent2 = new Intent(intent.getAction());
        intent2.setType(intent.getType());
        PackageManager packageManager = this.reactContext.getPackageManager();
        Class<?> cls = Class.forName(C1561oA.ud("r~s\u0001|uo8lwuzjrw0qm-N^_f[`]DWcUZWc", (short) (ZN.Xd() ^ 7640)));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (C1607wl.Xd() ^ 18347);
        int[] iArr = new int["|\t\u0002\u000f\u000f\b\u0006N\u0007\u0012\u0014\u0019\r\u0015\u001eVTx\u0002q}\u0003".length()];
        QB qb = new QB("|\t\u0002\u000f\u000f\b\u0006N\u0007\u0012\u0014\u0019\r\u0015\u001eVTx\u0002q}\u0003");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        clsArr[1] = Integer.TYPE;
        Object[] objArr = {intent2, 0};
        short sXd2 = (short) (Od.Xd() ^ (-13482));
        int[] iArr2 = new int["9>/=E\u0016<C5?F\u00147I?MAMC@O".length()];
        QB qb2 = new QB("9>/=E\u0016<C5?F\u00147I?MAMC@O");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            List list = (List) method.invoke(packageManager, objArr);
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    strQd = Xg.qd("\u0015\u001f\u0015()\u0005\u0019&\u001f", (short) (C1580rY.Xd() ^ (-19810)), (short) (C1580rY.Xd() ^ (-6117)));
                    strWd = Jg.Wd("OA\u007fBt5(S\u001bq&", (short) (C1499aX.Xd() ^ (-13994)), (short) (C1499aX.Xd() ^ (-23085)));
                    if (!zHasNext) {
                        break;
                    }
                    ResolveInfo resolveInfo = (ResolveInfo) it.next();
                    if (resolveInfo.activityInfo != null && !readableMap.getArray(ZO.xd("n %U\u0004[G\u0019gTqry&7M9X.C\b", (short) (C1607wl.Xd() ^ 2313), (short) (C1607wl.Xd() ^ 7915))).toString().contains(resolveInfo.activityInfo.packageName)) {
                        HashMap map = new HashMap();
                        map.put(strWd, resolveInfo.activityInfo.packageName);
                        map.put(strQd, resolveInfo.activityInfo.name);
                        String strValueOf = String.valueOf(resolveInfo.activityInfo.loadLabel(this.reactContext.getPackageManager()));
                        short sXd3 = (short) (Od.Xd() ^ (-12050));
                        short sXd4 = (short) (Od.Xd() ^ (-2972));
                        int[] iArr3 = new int["h\u001f\u0012\u0004w&\u0005,Yr".length()];
                        QB qb3 = new QB("h\u001f\u0012\u0004w&\u0005,Yr");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i4 * sXd4))) + xuXd3.CK(iKK3));
                            i4++;
                        }
                        map.put(new String(iArr3, 0, i4), strValueOf);
                        arrayList2.add(map);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    Collections.sort(arrayList2, new Comparator<HashMap<String, String>>() { // from class: cl.json.social.ShareIntent.1
                        AnonymousClass1() {
                        }

                        @Override // java.util.Comparator
                        public int compare(HashMap<String, String> map2, HashMap<String, String> map22) {
                            return map2.get("simpleName").compareTo(map22.get("simpleName"));
                        }
                    });
                    for (HashMap map2 : arrayList2) {
                        Intent intent3 = (Intent) intent.clone();
                        intent3.setPackage((String) map2.get(strWd));
                        intent3.setClassName((String) map2.get(strWd), (String) map2.get(strQd));
                        arrayList.add(intent3);
                    }
                    Intent intentCreateChooser = Intent.createChooser((Intent) arrayList.remove(arrayList.size() - 1), Ig.wd("\u0002*S~\u0018", (short) (C1499aX.Xd() ^ (-23041))));
                    intentCreateChooser.putExtra(EO.Od("5\bQAX\u0010)\u001c\u0013u{L\u0005\u0017f=\u0016uMfnSxy\u0010\u001b6\u0013*GZ\u007f\u000b7_.", (short) (FB.Xd() ^ 10554)), (Parcelable[]) arrayList.toArray(new Parcelable[0]));
                    return intentCreateChooser;
                }
            }
            return Intent.createChooser(intent, C1561oA.Qd("p\u0005|\r~", (short) (OY.Xd() ^ 20976)));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    protected String getComponentClass() {
        return null;
    }

    protected abstract String getDefaultWebLink();

    protected ShareFile getFileShare(ReadableMap readableMap) {
        String string = hasValidKey("filename", readableMap) ? readableMap.getString("filename") : null;
        boolean zValueOf = hasValidKey("useInternalStorage", readableMap) ? Boolean.valueOf(readableMap.getBoolean("useInternalStorage")) : false;
        return hasValidKey("type", readableMap) ? new ShareFile(readableMap.getString("url"), readableMap.getString("type"), string, zValueOf, this.reactContext) : new ShareFile(readableMap.getString("url"), string, zValueOf, this.reactContext);
    }

    protected ShareFiles getFileShares(ReadableMap readableMap) {
        ArrayList arrayList = new ArrayList();
        if (hasValidKey("filenames", readableMap)) {
            ReadableArray array = readableMap.getArray("filenames");
            for (int i2 = 0; i2 < array.size(); i2++) {
                arrayList.add(array.getString(i2));
            }
        }
        boolean zValueOf = hasValidKey("useInternalStorage", readableMap) ? Boolean.valueOf(readableMap.getBoolean("useInternalStorage")) : false;
        return hasValidKey("type", readableMap) ? new ShareFiles(readableMap.getArray(SentryReplayEvent.JsonKeys.URLS), arrayList, readableMap.getString("type"), zValueOf, this.reactContext) : new ShareFiles(readableMap.getArray(SentryReplayEvent.JsonKeys.URLS), arrayList, zValueOf, this.reactContext);
    }

    protected Intent getIntent() {
        return this.intent;
    }

    protected Intent[] getIntentsToViewFile(Intent intent, Uri uri) throws Throwable {
        PackageManager packageManager = this.reactContext.getPackageManager();
        Class<?> cls = Class.forName(C1593ug.zd("KYP_]XT\u001fUbbi[el'jh*M_bkbihQfthon|", (short) (OY.Xd() ^ 29097), (short) (OY.Xd() ^ 11649)));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (C1607wl.Xd() ^ 5897);
        int[] iArr = new int["(4)62+%m\"-+0 (-e\u007f$)\u0019!&".length()];
        QB qb = new QB("(4)62+%m\"-+0 (-e\u007f$)\u0019!&");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        clsArr[1] = Integer.TYPE;
        Object[] objArr = {intent, 0};
        Method method = cls.getMethod(C1561oA.Kd("\u001e#\u0014\"*z!(\u001a$+x\u001c.$2&2(%4", (short) (C1499aX.Xd() ^ (-26503))), clsArr);
        try {
            method.setAccessible(true);
            List list = (List) method.invoke(packageManager, objArr);
            Intent[] intentArr = new Intent[list.size()];
            for (int i3 = 0; i3 < list.size(); i3++) {
                ResolveInfo resolveInfo = (ResolveInfo) list.get(i3);
                String str = resolveInfo.activityInfo.packageName;
                Intent intent2 = new Intent();
                intent2.setComponent(new ComponentName(str, resolveInfo.activityInfo.name));
                intent2.setAction(Wg.Zd("u\u001d{\u000ew\u0007J;?[FC1\u000fQms]}Hn\u00078\u0010T~", (short) (C1633zX.Xd() ^ (-13566)), (short) (C1633zX.Xd() ^ (-23683))));
                intent2.setDataAndType(uri, intent.getType());
                intent2.addFlags(1);
                intentArr[i3] = new Intent(intent2);
            }
            return intentArr;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    protected abstract String getPackage();

    protected abstract String getPlayStoreLink();

    public void open(ReadableMap readableMap) throws ActivityNotFoundException {
        this.options = readableMap;
        if (hasValidKey("isNewTask", readableMap) && readableMap.getBoolean("isNewTask")) {
            getIntent().addFlags(268468224);
        }
        if (hasValidKey("subject", readableMap)) {
            getIntent().putExtra("android.intent.extra.SUBJECT", readableMap.getString("subject"));
        }
        if (hasValidKey("email", readableMap)) {
            getIntent().putExtra("android.intent.extra.EMAIL", new String[]{readableMap.getString("email")});
        }
        if (hasValidKey("title", readableMap)) {
            this.chooserTitle = readableMap.getString("title");
        }
        String string = hasValidKey("message", readableMap) ? readableMap.getString("message") : "";
        String string2 = hasValidKey(NotificationCompat.CATEGORY_SOCIAL, readableMap) ? readableMap.getString(NotificationCompat.CATEGORY_SOCIAL) : "";
        if (string2.equals("sms")) {
            String string3 = readableMap.getString("recipient");
            if (!string3.isEmpty()) {
                getIntent().putExtra(SentryLockReason.JsonKeys.ADDRESS, string3);
            }
        }
        if (string2.equals("whatsapp") && readableMap.hasKey("whatsAppNumber")) {
            getIntent().putExtra("jid", readableMap.getString("whatsAppNumber") + "@s.whatsapp.net");
        }
        if (string2.equals("whatsappbusiness") && readableMap.hasKey("whatsAppNumber")) {
            getIntent().putExtra("jid", readableMap.getString("whatsAppNumber") + "@s.whatsapp.net");
        }
        if (hasValidKey(SentryReplayEvent.JsonKeys.URLS, readableMap)) {
            ShareFiles fileShares = getFileShares(readableMap);
            if (!fileShares.isFile()) {
                if (TextUtils.isEmpty(string)) {
                    getIntent().putExtra("android.intent.extra.TEXT", readableMap.getArray(SentryReplayEvent.JsonKeys.URLS).getString(0));
                    return;
                } else {
                    getIntent().putExtra("android.intent.extra.TEXT", string + Global.BLANK + readableMap.getArray(SentryReplayEvent.JsonKeys.URLS).getString(0));
                    return;
                }
            }
            ArrayList<Uri> uri = fileShares.getURI();
            ClipData clipData = new ClipData(new ClipDescription("Files", new String[]{fileShares.getType()}), new ClipData.Item(uri.get(0)));
            for (int i2 = 1; i2 < uri.size(); i2++) {
                clipData.addItem(new ClipData.Item(uri.get(i2)));
            }
            getIntent().setClipData(clipData);
            getIntent().setAction("android.intent.action.SEND_MULTIPLE");
            getIntent().setType(fileShares.getType());
            getIntent().putParcelableArrayListExtra("android.intent.extra.STREAM", uri);
            getIntent().addFlags(1);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            getIntent().putExtra("android.intent.extra.TEXT", string);
            return;
        }
        if (!hasValidKey("url", readableMap)) {
            if (TextUtils.isEmpty(string)) {
                return;
            }
            getIntent().putExtra("android.intent.extra.TEXT", string);
            return;
        }
        ShareFile fileShare = getFileShare(readableMap);
        this.fileShare = fileShare;
        if (!fileShare.isFile()) {
            if (TextUtils.isEmpty(string)) {
                getIntent().putExtra("android.intent.extra.TEXT", readableMap.getString("url"));
                return;
            } else {
                getIntent().putExtra("android.intent.extra.TEXT", string + Global.BLANK + readableMap.getString("url"));
                return;
            }
        }
        Uri uri2 = this.fileShare.getURI();
        ClipData clipDataNewUri = ClipData.newUri(this.reactContext.getContentResolver(), "File", uri2);
        getIntent().setType(this.fileShare.getType());
        getIntent().setClipData(clipDataNewUri);
        getIntent().putExtra("android.intent.extra.STREAM", uri2);
        getIntent().addFlags(1);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        getIntent().putExtra("android.intent.extra.TEXT", string);
    }

    protected void openIntentChooser() throws Exception {
        Intent intentCreateChooser;
        IntentSender sharingSenderIntent;
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity == null) {
            TargetChosenReceiver.callbackReject("Something went wrong");
            return;
        }
        if (TargetChosenReceiver.isSupported()) {
            sharingSenderIntent = TargetChosenReceiver.getSharingSenderIntent(this.reactContext);
            intentCreateChooser = Intent.createChooser(getIntent(), this.chooserTitle, sharingSenderIntent);
        } else {
            intentCreateChooser = Intent.createChooser(getIntent(), this.chooserTitle);
            sharingSenderIntent = null;
        }
        intentCreateChooser.addFlags(1073741824);
        if (hasValidKey("showAppsToView", this.options) && hasValidKey("url", this.options)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setType(this.fileShare.getType());
            intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", getIntentsToViewFile(intent, this.fileShare.getURI()));
        }
        if (hasValidKey("excludedActivityTypes", this.options)) {
            intentCreateChooser.putExtra("android.intent.extra.EXCLUDE_COMPONENTS", getExcludedComponentArray(this.options.getArray("excludedActivityTypes")));
            CX.ud();
            currentActivity.startActivityForResult(intentCreateChooser, RNShareImpl.SHARE_REQUEST_CODE);
        } else {
            CX.ud();
            currentActivity.startActivityForResult(intentCreateChooser, RNShareImpl.SHARE_REQUEST_CODE);
        }
        if (sharingSenderIntent == null) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putBoolean(FirebaseAnalytics.Param.SUCCESS, true);
            writableMapCreateMap.putString("message", "OK");
            TargetChosenReceiver.callbackResolve(writableMapCreateMap);
        }
    }

    protected void setIntent(Intent intent) {
        this.intent = intent;
    }
}
