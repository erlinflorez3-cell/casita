package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1aSDK;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.Ig;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes3.dex */
public final class AFd1ySDK implements AFc1cSDK {
    private final AFc1hSDK getMonetizationNetwork;

    public AFd1ySDK(AFc1hSDK aFc1hSDK) {
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        this.getMonetizationNetwork = aFc1hSDK;
    }

    private final File AFAdRevenueData() throws Throwable {
        Context context = this.getMonetizationNetwork.getMonetizationNetwork;
        if (context == null) {
            return null;
        }
        Class<?> cls = Class.forName(Ig.wd("5\u000b\u001dPS\t]\u001d\u007fM4R\u0015*\u0002RCc8\u0014B+?", (short) (C1633zX.Xd() ^ (-8819))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1499aX.Xd() ^ (-11786));
        int[] iArr = new int["\r`\u007fj\t1\u0018\b\u0010bo".length()];
        QB qb = new QB("\r`\u007fj\t1\u0018\b\u0010bo");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            File file = new File((File) method.invoke(context, objArr), C1561oA.Qd("\r\u0011\u000fA+,69-204\u0003 !%!", (short) (C1607wl.Xd() ^ 26679)));
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final String AFAdRevenueData(Throwable th, String str) {
        String str2;
        File file;
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (this) {
            File fileAFAdRevenueData = AFAdRevenueData();
            str2 = null;
            if (fileAFAdRevenueData != null) {
                file = new File(fileAFAdRevenueData, "6.17.6");
                if (!file.exists()) {
                    file.mkdirs();
                }
            } else {
                file = null;
            }
            if (file != null) {
                try {
                    AFc1aSDK revenue = AFd1sSDK.getRevenue(th, str);
                    String str3 = revenue.AFAdRevenueData;
                    File file2 = new File(file, str3);
                    if (file2.exists()) {
                        AFc1aSDK.AFa1zSDK aFa1zSDK = AFc1aSDK.AFa1zSDK;
                        AFc1aSDK mediationNetwork = AFc1aSDK.AFa1zSDK.getMediationNetwork(FilesKt.readText$default(file2, null, 1, null));
                        if (mediationNetwork != null) {
                            mediationNetwork.getMediationNetwork++;
                            revenue = mediationNetwork;
                        }
                    }
                    FilesKt.writeText$default(file2, revenue.getMonetizationNetwork(), null, 2, null);
                    str2 = str3;
                } catch (Exception e2) {
                    AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "Could not cache exception\n " + e2.getMessage(), false, 4, null);
                }
            }
        }
        return str2;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final void getCurrencyIso4217Code(int i2, int i3) {
        File[] fileArrListFiles;
        synchronized (this) {
            File fileAFAdRevenueData = AFAdRevenueData();
            if (fileAFAdRevenueData != null && (fileArrListFiles = fileAFAdRevenueData.listFiles()) != null) {
                Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                ArrayList arrayList = new ArrayList();
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "");
                    int mediationNetwork = AFk1xSDK.getMediationNetwork(name);
                    if (i2 > mediationNetwork || mediationNetwork > i3) {
                        arrayList.add(file);
                    }
                }
                ArrayList<File> arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                for (File file2 : arrayList2) {
                    Intrinsics.checkNotNullExpressionValue(file2, "");
                    arrayList3.add(Boolean.valueOf(FilesKt.deleteRecursively(file2)));
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final boolean getCurrencyIso4217Code() {
        return getMonetizationNetwork(new String[0]);
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final int getMediationNetwork() {
        Iterator<T> it = getRevenue().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((AFc1aSDK) it.next()).getMediationNetwork;
        }
        return i2;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final boolean getMonetizationNetwork(String... strArr) {
        boolean zDeleteRecursively;
        Intrinsics.checkNotNullParameter(strArr, "");
        synchronized (this) {
            File fileAFAdRevenueData = AFAdRevenueData();
            zDeleteRecursively = true;
            if (fileAFAdRevenueData != null) {
                if (strArr.length == 0) {
                    AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions", false, 4, null);
                    zDeleteRecursively = FilesKt.deleteRecursively(fileAFAdRevenueData);
                } else {
                    AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions except for: " + ArraysKt.joinToString$default(strArr, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), false, 4, null);
                    File[] fileArrListFiles = fileAFAdRevenueData.listFiles();
                    if (fileArrListFiles != null) {
                        Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                        ArrayList arrayList = new ArrayList();
                        for (File file : fileArrListFiles) {
                            if (!ArraysKt.contains(strArr, file.getName())) {
                                arrayList.add(file);
                            }
                        }
                        ArrayList<File> arrayList2 = arrayList;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                        for (File file2 : arrayList2) {
                            Intrinsics.checkNotNullExpressionValue(file2, "");
                            arrayList3.add(Boolean.valueOf(FilesKt.deleteRecursively(file2)));
                        }
                        Set set = CollectionsKt.toSet(arrayList3);
                        if (set.isEmpty()) {
                            set = SetsKt.setOf(Boolean.TRUE);
                        }
                        Set set2 = set;
                        if (set2.size() != 1 || !((Boolean) CollectionsKt.first(set2)).booleanValue()) {
                            zDeleteRecursively = false;
                        }
                    }
                }
            }
        }
        return zDeleteRecursively;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0088 A[Catch: all -> 0x008e, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x000e, B:9:0x001a, B:23:0x0078, B:24:0x007b, B:20:0x0050, B:25:0x007e, B:27:0x0088, B:10:0x001c, B:12:0x0022, B:14:0x0032, B:16:0x0046, B:17:0x0049, B:18:0x004c), top: B:33:0x0001, inners: #1 }] */
    @Override // com.appsflyer.internal.AFc1cSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.appsflyer.internal.AFc1aSDK> getRevenue() {
        /*
            r18 = this;
            monitor-enter(r18)
            java.io.File r0 = r18.AFAdRevenueData()     // Catch: java.lang.Throwable -> L8e
            r6 = 0
            if (r0 == 0) goto L86
            java.io.File[] r5 = r0.listFiles()     // Catch: java.lang.Throwable -> L8e
            if (r5 == 0) goto L86
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8e
            r4.<init>()     // Catch: java.lang.Throwable -> L8e
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Throwable -> L8e
            int r3 = r5.length     // Catch: java.lang.Throwable -> L8e
            r11 = 0
            r2 = r11
        L18:
            if (r2 >= r3) goto L7e
            r0 = r5[r2]     // Catch: java.lang.Throwable -> L8e
            java.io.File[] r10 = r0.listFiles()     // Catch: java.lang.Throwable -> L4f
            if (r10 == 0) goto L75
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)     // Catch: java.lang.Throwable -> L4f
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4f
            r9.<init>()     // Catch: java.lang.Throwable -> L4f
            java.util.Collection r9 = (java.util.Collection) r9     // Catch: java.lang.Throwable -> L4f
            int r8 = r10.length     // Catch: java.lang.Throwable -> L4f
            r7 = r11
        L30:
            if (r7 >= r8) goto L4c
            r1 = r10[r7]     // Catch: java.lang.Throwable -> L4f
            com.appsflyer.internal.AFc1aSDK$AFa1zSDK r0 = com.appsflyer.internal.AFc1aSDK.AFa1zSDK     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)     // Catch: java.lang.Throwable -> L4f
            r0 = 1
            java.lang.String r0 = kotlin.io.FilesKt.readText$default(r1, r6, r0, r6)     // Catch: java.lang.Throwable -> L4f
            com.appsflyer.internal.AFc1aSDK r0 = com.appsflyer.internal.AFc1aSDK.AFa1zSDK.getMediationNetwork(r0)     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L49
            r9.add(r0)     // Catch: java.lang.Throwable -> L4f
        L49:
            int r7 = r7 + 1
            goto L30
        L4c:
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Throwable -> L4f
            goto L76
        L4f:
            r0 = move-exception
            com.appsflyer.AFLogger r12 = com.appsflyer.AFLogger.INSTANCE     // Catch: java.lang.Throwable -> L8e
            com.appsflyer.internal.AFh1ySDK r12 = (com.appsflyer.internal.AFh1ySDK) r12     // Catch: java.lang.Throwable -> L8e
            com.appsflyer.internal.AFg1cSDK r13 = com.appsflyer.internal.AFg1cSDK.EXCEPTION_MANAGER     // Catch: java.lang.Throwable -> L8e
            java.lang.String r7 = r0.getMessage()     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r1.<init>()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = "Could not get stored exceptions\n "
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r0 = r0.append(r7)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r14 = r0.toString()     // Catch: java.lang.Throwable -> L8e
            r16 = 4
            r17 = 0
            r15 = 0
            com.appsflyer.internal.AFh1ySDK.v$default(r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L8e
        L75:
            r9 = r6
        L76:
            if (r9 == 0) goto L7b
            r4.add(r9)     // Catch: java.lang.Throwable -> L8e
        L7b:
            int r2 = r2 + 1
            goto L18
        L7e:
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L8e
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Throwable -> L8e
            java.util.List r6 = kotlin.collections.CollectionsKt.flatten(r4)     // Catch: java.lang.Throwable -> L8e
        L86:
            if (r6 != 0) goto L8c
            java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()     // Catch: java.lang.Throwable -> L8e
        L8c:
            monitor-exit(r18)
            return r6
        L8e:
            r0 = move-exception
            monitor-exit(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1ySDK.getRevenue():java.util.List");
    }
}
