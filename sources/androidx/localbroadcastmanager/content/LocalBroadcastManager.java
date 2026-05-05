package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public final class LocalBroadcastManager {
    private static final boolean DEBUG = false;
    static final int MSG_EXEC_PENDING_BROADCASTS = 1;
    private static final String TAG = "LocalBroadcastManager";
    private static LocalBroadcastManager mInstance = null;
    private static final Object mLock = new Object();
    private final Context mAppContext;
    private final Handler mHandler;
    private final HashMap<BroadcastReceiver, ArrayList<ReceiverRecord>> mReceivers = new HashMap<>();
    private final HashMap<String, ArrayList<ReceiverRecord>> mActions = new HashMap<>();
    private final ArrayList<BroadcastRecord> mPendingBroadcasts = new ArrayList<>();

    private static final class ReceiverRecord {
        boolean broadcasting;
        boolean dead;
        final IntentFilter filter;
        final BroadcastReceiver receiver;

        ReceiverRecord(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.filter = intentFilter;
            this.receiver = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.receiver);
            sb.append(" filter=");
            sb.append(this.filter);
            if (this.dead) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private static final class BroadcastRecord {
        final Intent intent;
        final ArrayList<ReceiverRecord> receivers;

        BroadcastRecord(Intent intent, ArrayList<ReceiverRecord> arrayList) {
            this.intent = intent;
            this.receivers = arrayList;
        }
    }

    public static LocalBroadcastManager getInstance(Context context) {
        LocalBroadcastManager localBroadcastManager;
        synchronized (mLock) {
            if (mInstance == null) {
                Object[] objArr = new Object[0];
                Method method = Class.forName(hg.Vd("7C8EA:4|1<:?/7<t\t427'94", (short) (Od.Xd() ^ (-5811)), (short) (Od.Xd() ^ (-22533)))).getMethod(C1561oA.ud("liwCqpkg`]ochf:echXje", (short) (C1633zX.Xd() ^ (-17677))), new Class[0]);
                try {
                    method.setAccessible(true);
                    mInstance = new LocalBroadcastManager((Context) method.invoke(context, objArr));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            localBroadcastManager = mInstance;
        }
        return localBroadcastManager;
    }

    private LocalBroadcastManager(Context context) throws Throwable {
        this.mAppContext = context;
        Class<?> cls = Class.forName(Wg.vd("\\j]lnia,fsovlvy4.[W^Tha", (short) (FB.Xd() ^ 17566)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1499aX.Xd() ^ (-30579));
        short sXd2 = (short) (C1499aX.Xd() ^ (-5385));
        int[] iArr = new int["fcqI\\cgDfeeYe".length()];
        QB qb = new QB("fcqI\\cgDfeeYe");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            this.mHandler = new Handler((Looper) method.invoke(context, objArr)) { // from class: androidx.localbroadcastmanager.content.LocalBroadcastManager.1
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    if (message.what == 1) {
                        LocalBroadcastManager.this.executePendingBroadcasts();
                    } else {
                        super.handleMessage(message);
                    }
                }
            };
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.mReceivers) {
            ReceiverRecord receiverRecord = new ReceiverRecord(intentFilter, broadcastReceiver);
            ArrayList<ReceiverRecord> arrayList = this.mReceivers.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.mReceivers.put(broadcastReceiver, arrayList);
            }
            arrayList.add(receiverRecord);
            for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                String action = intentFilter.getAction(i2);
                ArrayList<ReceiverRecord> arrayList2 = this.mActions.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.mActions.put(action, arrayList2);
                }
                arrayList2.add(receiverRecord);
            }
        }
    }

    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        synchronized (this.mReceivers) {
            ArrayList<ReceiverRecord> arrayListRemove = this.mReceivers.remove(broadcastReceiver);
            if (arrayListRemove == null) {
                return;
            }
            for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                ReceiverRecord receiverRecord = arrayListRemove.get(size);
                receiverRecord.dead = true;
                for (int i2 = 0; i2 < receiverRecord.filter.countActions(); i2++) {
                    String action = receiverRecord.filter.getAction(i2);
                    ArrayList<ReceiverRecord> arrayList = this.mActions.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            ReceiverRecord receiverRecord2 = arrayList.get(size2);
                            if (receiverRecord2.receiver == broadcastReceiver) {
                                receiverRecord2.dead = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.mActions.remove(action);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean sendBroadcast(Intent intent) {
        String str;
        String strYd;
        String strYd2 = C1561oA.yd("m\u0011\u001f\u0015  N\u001c\u000e\u0019\u0017]H", (short) (FB.Xd() ^ 22409));
        String strYd3 = C1561oA.Yd("t\t\u0018\u0015\u0013\u001e\u0012\u0018\u0012K!'\u001f\u0015P", (short) (FB.Xd() ^ 31104));
        synchronized (this.mReceivers) {
            String action = intent.getAction();
            Context context = this.mAppContext;
            Object[] objArr = new Object[0];
            Method method = Class.forName(Xg.qd("4B9HFA=\b>KKRDNU\u0010&SSZL`]", (short) (FB.Xd() ^ 22831), (short) (FB.Xd() ^ 25256))).getMethod(Jg.Wd("$*8\u00061O4\u0005-Rn\u0001N(\u0004-9%", (short) (ZN.Xd() ^ 2977), (short) (ZN.Xd() ^ 1286)), new Class[0]);
            try {
                method.setAccessible(true);
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded((ContentResolver) method.invoke(context, objArr));
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z2 = false;
                int i2 = 0;
                byte b2 = (-1) - (((-1) - intent.getFlags()) | ((-1) - 8)) != 0;
                if (b2 != false) {
                    ZO.xd("\u001eI\ni\u0004V&PG\u00048U\u0014PXd\f*4\u007fH", (short) (FB.Xd() ^ 7387), (short) (FB.Xd() ^ 12744));
                    StringBuilder sbAppend = new StringBuilder(strYd3).append(strResolveTypeIfNeeded).append(C1626yg.Ud("EY{\u001aV\u0003>m", (short) (ZN.Xd() ^ 12799), (short) (ZN.Xd() ^ 5718))).append(scheme);
                    short sXd = (short) (C1607wl.Xd() ^ 27727);
                    int[] iArr = new int["6-R<\u000emG\u0019j\u00116".length()];
                    QB qb = new QB("6-R<\u000emG\u0019j\u00116");
                    int i3 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd + i3)));
                        i3++;
                    }
                    sbAppend.append(new String(iArr, 0, i3)).append(intent).toString();
                }
                ArrayList<ReceiverRecord> arrayList = this.mActions.get(intent.getAction());
                if (arrayList != null) {
                    if (b2 != false) {
                        EO.Od("M\u001f\u0003b/J)/x9<\u0016slWG\u0002t4<\u0001", (short) (OY.Xd() ^ 22250));
                        String str2 = strYd2 + arrayList;
                    }
                    ArrayList arrayList2 = null;
                    while (i2 < arrayList.size()) {
                        ReceiverRecord receiverRecord = arrayList.get(i2);
                        if (b2 != false) {
                            C1561oA.Qd("\u001d?2/9\u000e=9*,*'88\u0010#/!&#/", (short) (FB.Xd() ^ 12623));
                            String str3 = C1593ug.zd("`u\ny\u007f\u0002\b\u0002;}\u0005\u007f\t\u000f\u0015\u0017C\u000b\u000f\u0013\u001c\u000e\u001cJ", (short) (Od.Xd() ^ (-22384)), (short) (Od.Xd() ^ (-24388))) + receiverRecord.filter;
                        }
                        if (receiverRecord.broadcasting) {
                            if (b2 != false) {
                                C1561oA.od("$F96@\u0015D@131.??\u0017*6(-*6", (short) (C1499aX.Xd() ^ (-1120)));
                                short sXd2 = (short) (C1633zX.Xd() ^ (-17134));
                                int[] iArr2 = new int["no\u0017;?H:H}KxN<NDCS\u007fBNUIFJ`\bJNOQQ".length()];
                                QB qb2 = new QB("no\u0017;?H:H}KxN<NDCS\u007fBNUIFJ`\bJNOQQ");
                                int i4 = 0;
                                while (qb2.YK()) {
                                    int iKK2 = qb2.KK();
                                    Xu xuXd2 = Xu.Xd(iKK2);
                                    iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i4));
                                    i4++;
                                }
                                new String(iArr2, 0, i4);
                            }
                            str = action;
                        } else {
                            str = action;
                            int iMatch = receiverRecord.filter.match(str, strResolveTypeIfNeeded, scheme, data, categories, Wg.Zd("@g9\u0016~1?\u001bj^;\u0018\be\u001c\u000fy=!}h", (short) (FB.Xd() ^ 13282), (short) (FB.Xd() ^ 8012)));
                            if (iMatch >= 0) {
                                if (b2 != false) {
                                    short sXd3 = (short) (OY.Xd() ^ 301);
                                    int[] iArr3 = new int["%I>=I QOBFFEXZ4IWKRQ_".length()];
                                    QB qb3 = new QB("%I>=I QOBFFEXZ4IWKRQ_");
                                    int i5 = 0;
                                    while (qb3.YK()) {
                                        int iKK3 = qb3.KK();
                                        Xu xuXd3 = Xu.Xd(iKK3);
                                        iArr3[i5] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd3 + i5));
                                        i5++;
                                    }
                                    new String(iArr3, 0, i5);
                                    String str4 = Wg.vd("Z[\u0003'#,\u001e,b1&:\"(&&KKL\u001b\b\u001c\f\u0012oc-", (short) (Od.Xd() ^ (-26242))) + Integer.toHexString(iMatch);
                                }
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(receiverRecord);
                                receiverRecord.broadcasting = true;
                            } else if (b2 != false) {
                                if (iMatch == -4) {
                                    strYd = C1561oA.Yd("VUi[^gks", (short) (FB.Xd() ^ 3794));
                                } else if (iMatch == -3) {
                                    short sXd4 = (short) (OY.Xd() ^ 15346);
                                    int[] iArr4 = new int["besitt".length()];
                                    QB qb4 = new QB("besitt");
                                    int i6 = 0;
                                    while (qb4.YK()) {
                                        int iKK4 = qb4.KK();
                                        Xu xuXd4 = Xu.Xd(iKK4);
                                        iArr4[i6] = xuXd4.fK(xuXd4.CK(iKK4) - (sXd4 ^ i6));
                                        i6++;
                                    }
                                    strYd = new String(iArr4, 0, i6);
                                } else if (iMatch == -2) {
                                    strYd = C1561oA.ud(",(:&", (short) (C1499aX.Xd() ^ (-3442)));
                                } else if (iMatch == -1) {
                                    strYd = hg.Vd("@D:.", (short) (ZN.Xd() ^ 21121), (short) (ZN.Xd() ^ PhotoshopDirectory.TAG_LAYERS_GROUP_INFORMATION));
                                } else {
                                    short sXd5 = (short) (C1607wl.Xd() ^ 569);
                                    short sXd6 = (short) (C1607wl.Xd() ^ 20359);
                                    int[] iArr5 = new int["\u0006}y{{\u0003x)zlgxsq".length()];
                                    QB qb5 = new QB("\u0006}y{{\u0003x)zlgxsq");
                                    int i7 = 0;
                                    while (qb5.YK()) {
                                        int iKK5 = qb5.KK();
                                        Xu xuXd5 = Xu.Xd(iKK5);
                                        iArr5[i7] = xuXd5.fK(((sXd5 + i7) + xuXd5.CK(iKK5)) - sXd6);
                                        i7++;
                                    }
                                    strYd = new String(iArr5, 0, i7);
                                }
                                short sXd7 = (short) (C1499aX.Xd() ^ (-31102));
                                short sXd8 = (short) (C1499aX.Xd() ^ (-27952));
                                int[] iArr6 = new int["'K@?K\"SQDHHGZ\\6KYMTSa".length()];
                                QB qb6 = new QB("'K@?K\"SQDHHGZ\\6KYMTSa");
                                int i8 = 0;
                                while (qb6.YK()) {
                                    int iKK6 = qb6.KK();
                                    Xu xuXd6 = Xu.Xd(iKK6);
                                    iArr6[i8] = xuXd6.fK((xuXd6.CK(iKK6) - (sXd7 + i8)) + sXd8);
                                    i8++;
                                }
                                new String(iArr6, 0, i8);
                                StringBuilder sb = new StringBuilder();
                                short sXd9 = (short) (C1499aX.Xd() ^ (-4671));
                                short sXd10 = (short) (C1499aX.Xd() ^ (-25374));
                                int[] iArr7 = new int["9'sdM$;\u0016)[GP1\u000eu\tY\u0015/\ra4,`".length()];
                                QB qb7 = new QB("9'sdM$;\u0016)[GP1\u000eu\tY\u0015/\ra4,`");
                                int i9 = 0;
                                while (qb7.YK()) {
                                    int iKK7 = qb7.KK();
                                    Xu xuXd7 = Xu.Xd(iKK7);
                                    iArr7[i9] = xuXd7.fK(xuXd7.CK(iKK7) - ((i9 * sXd10) ^ sXd9));
                                    i9++;
                                }
                                sb.append(new String(iArr7, 0, i9)).append(strYd).toString();
                            }
                        }
                        i2++;
                        action = str;
                    }
                    if (arrayList2 != null) {
                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                            ((ReceiverRecord) arrayList2.get(i10)).broadcasting = false;
                        }
                        this.mPendingBroadcasts.add(new BroadcastRecord(intent, arrayList2));
                        if (!this.mHandler.hasMessages(1)) {
                            this.mHandler.sendEmptyMessage(1);
                        }
                        return true;
                    }
                    z2 = false;
                }
                return z2;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public void sendBroadcastSync(Intent intent) {
        if (sendBroadcast(intent)) {
            executePendingBroadcasts();
        }
    }

    void executePendingBroadcasts() {
        int size;
        BroadcastRecord[] broadcastRecordArr;
        while (true) {
            synchronized (this.mReceivers) {
                size = this.mPendingBroadcasts.size();
                if (size <= 0) {
                    return;
                }
                broadcastRecordArr = new BroadcastRecord[size];
                this.mPendingBroadcasts.toArray(broadcastRecordArr);
                this.mPendingBroadcasts.clear();
            }
            for (int i2 = 0; i2 < size; i2++) {
                BroadcastRecord broadcastRecord = broadcastRecordArr[i2];
                int size2 = broadcastRecord.receivers.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ReceiverRecord receiverRecord = broadcastRecord.receivers.get(i3);
                    if (!receiverRecord.dead) {
                        receiverRecord.receiver.onReceive(this.mAppContext, broadcastRecord.intent);
                    }
                }
            }
        }
    }
}
