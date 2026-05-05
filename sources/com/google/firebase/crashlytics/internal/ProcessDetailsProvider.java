package com.google.firebase.crashlytics.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Process;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.hg;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u001e\u007fјnjG6LeN.ZS8\u0018sڔ<$iByّCU0}*\tUOm̨n`ҙ;C=\u0005V}p,֒Yxk\u0012W^PpW3{qm=nwN\u0005N6R>\u007f\u0005\u000f\u001fBH>|+IQ\f 7XphX=S\u000b\u001a \u000eV /'#l\u0017HVvu@?%\u0013ipPUj`\u0001[\u0019^TU\u001a?m,9X7c\u0017UW\u0011\u0013j[m\u0010\bwK\u0014\u0001'U/\u0010sɷ:h"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n~$\u0013Ur\u0015P\u0006)3gG$@|\u0016;V?B5\u001f+\u001ffaG\u0015B,]r+NZ99fcv<\u0014\u001f0", "", "u(E", "0tX9W\u0017K]\u0017~\tl\u000b|\u0018+i\u00076", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n~$\u0013Ur\u0015P\u0006)3gG$@|\u0016;V?B5<(\u0014hh\u0003dp(\\y.[[R*j?rH\u001e\u001fiL<+\u001b\u0013]K--$H\u001f\u0011;\b]Fs\b\u0010\u0014\nDnzK\u0015zT\u0004\u0013uO7GFh[}NO\u001b", ">q^0X:L<\u0015\u0007z", "", ">hS", "", "7l_<e;:\\\u0017~", "7r32Y(NZ(i\bh*|\u0017=", "", "5dc\u000ec7)`#|zl:[\t>a\u0004/\n", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "5dc\u0010h9KS\"\u000eek6z\t=s^(\u000b<\u0005\u001e%", "5dc\u001de6<S'\rcZ4|", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>#BU\f#>\u0002%2KQ"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ProcessDetailsProvider {
    public static final ProcessDetailsProvider INSTANCE = new ProcessDetailsProvider();

    private ProcessDetailsProvider() {
    }

    public static /* synthetic */ CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails$default(ProcessDetailsProvider processDetailsProvider, String str, int i2, int i3, boolean z2, int i4, Object obj) {
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i2 = 0;
        }
        if ((4 & i4) != 0) {
            i3 = 0;
        }
        if ((i4 & 8) != 0) {
            z2 = false;
        }
        return processDetailsProvider.buildProcessDetails(str, i2, i3, z2);
    }

    private final String getProcessName() {
        String processName;
        if (Build.VERSION.SDK_INT < 33) {
            return (Build.VERSION.SDK_INT < 28 || (processName = Application.getProcessName()) == null) ? "" : processName;
        }
        String strMyProcessName = Process.myProcessName();
        Intrinsics.checkNotNullExpressionValue(strMyProcessName, "{\n      Process.myProcessName()\n    }");
        return strMyProcessName;
    }

    public final CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails(String processName) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        return buildProcessDetails$default(this, processName, 0, 0, false, 14, null);
    }

    public final CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails(String processName, int i2) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        return buildProcessDetails$default(this, processName, i2, 0, false, 12, null);
    }

    public final CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails(String processName, int i2, int i3) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        return buildProcessDetails$default(this, processName, i2, i3, false, 8, null);
    }

    public final CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails(String processName, int i2, int i3, boolean z2) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetailsBuild = CrashlyticsReport.Session.Event.Application.ProcessDetails.builder().setProcessName(processName).setPid(i2).setImportance(i3).setDefaultProcess(z2).build();
        Intrinsics.checkNotNullExpressionValue(processDetailsBuild, "builder()\n      .setProc…ltProcess)\n      .build()");
        return processDetailsBuild;
    }

    public final List<CrashlyticsReport.Session.Event.Application.ProcessDetails> getAppProcessDetails(Context context) throws Throwable {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(context, Wg.Zd("v~:<ix1", (short) (C1633zX.Xd() ^ (-4937)), (short) (C1633zX.Xd() ^ (-11449))));
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Xd("\f\u001a\u0011 \u001e\u0019\u0015_\u0016##*\u001c&-g}++2$85", (short) (C1580rY.Xd() ^ (-287)))).getMethod(Wg.vd("UTd2Z[XVIH\\RQQ-Sdn", (short) (Od.Xd() ^ (-1306))), new Class[0]);
        try {
            method.setAccessible(true);
            ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
            short sXd = (short) (C1607wl.Xd() ^ 8323);
            short sXd2 = (short) (C1607wl.Xd() ^ 950);
            int[] iArr = new int[".:/<81+s(316&.3k-)hz)(#\u001f\u0018\u0015'\u001b \u001ew\u001c\u0013\u001b".length()];
            QB qb = new QB(".:/<81+s(316&.3k-)hz)(#\u001f\u0018\u0015'\u001b \u001ew\u001c\u0013\u001b");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            String str = new String(iArr, 0, i2);
            String strVd = hg.Vd("A4.", (short) (FB.Xd() ^ 18255), (short) (FB.Xd() ^ 443));
            try {
                Class<?> cls = Class.forName(str);
                Field field = 1 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(applicationInfo);
            } catch (Throwable th) {
                obj = null;
            }
            int iIntValue = ((Integer) obj).intValue();
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1561oA.ud("\u000b\u0017\f\u0019\u0015\u000e\bP\u0005\u0010\u000e\u0013\u0003\u000b\u0010H\\\b\u0006\u000bz\r\b", (short) (C1580rY.Xd() ^ (-24160)))).getMethod(C1561oA.yd("jiuCwxqo^]mcnnFlYc", (short) (OY.Xd() ^ 27474)), new Class[0]);
            try {
                method2.setAccessible(true);
                ApplicationInfo applicationInfo2 = (ApplicationInfo) method2.invoke(context, objArr2);
                short sXd3 = (short) (C1633zX.Xd() ^ (-22599));
                int[] iArr2 = new int["%3*972.x/<<C5?F\u0001DB\u0004\u0018HIFD?>RHOO+QJT".length()];
                QB qb2 = new QB("%3*972.x/<<C5?F\u0001DB\u0004\u0018HIFD?>RHOO+QJT");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd3 + sXd3) + sXd3) + i3));
                    i3++;
                }
                String str2 = new String(iArr2, 0, i3);
                String strQd = Xg.qd("\u001c\u001f\u001d\u0012\u0015$%\u0001\u0015\"\u001b", (short) (C1499aX.Xd() ^ (-8009)), (short) (C1499aX.Xd() ^ (-15744)));
                try {
                    Class<?> cls2 = Class.forName(str2);
                    Field field2 = 1 != 0 ? cls2.getField(strQd) : cls2.getDeclaredField(strQd);
                    field2.setAccessible(true);
                    obj2 = field2.get(applicationInfo2);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                String str3 = (String) obj2;
                String strWd = Jg.Wd("r|y\u0012\u0006%\u001bF", (short) (Od.Xd() ^ (-535)), (short) (Od.Xd() ^ (-15502)));
                short sXd4 = (short) (C1633zX.Xd() ^ (-25549));
                short sXd5 = (short) (C1633zX.Xd() ^ (-26282));
                int[] iArr3 = new int["i@YX\"-%o/*45^0$%U;}-y\u007f'".length()];
                QB qb3 = new QB("i@YX\"-%o/*45^0$%U;}-y\u007f'");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((i4 * sXd5) + sXd4)));
                    i4++;
                }
                Object[] objArr3 = {strWd};
                Method method3 = Class.forName(new String(iArr3, 0, i4)).getMethod(Ig.wd("\u0011@=|\u0013_|u/DX\b=6 K", (short) (C1580rY.Xd() ^ (-9128))), Class.forName(C1626yg.Ud("k9$}R^*\u00019\u00076W+\u0010}\b", (short) (FB.Xd() ^ 22397), (short) (FB.Xd() ^ 29554))));
                try {
                    method3.setAccessible(true);
                    Object objInvoke = method3.invoke(context, objArr3);
                    ActivityManager activityManager = objInvoke instanceof ActivityManager ? (ActivityManager) objInvoke : null;
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
                    if (runningAppProcesses == null) {
                        runningAppProcesses = CollectionsKt.emptyList();
                    }
                    List listFilterNotNull = CollectionsKt.filterNotNull(runningAppProcesses);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : listFilterNotNull) {
                        if (((ActivityManager.RunningAppProcessInfo) obj3).uid == iIntValue) {
                            arrayList.add(obj3);
                        }
                    }
                    ArrayList<ActivityManager.RunningAppProcessInfo> arrayList2 = arrayList;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList2) {
                        arrayList3.add(CrashlyticsReport.Session.Event.Application.ProcessDetails.builder().setProcessName(runningAppProcessInfo.processName).setPid(runningAppProcessInfo.pid).setImportance(runningAppProcessInfo.importance).setDefaultProcess(Intrinsics.areEqual(runningAppProcessInfo.processName, str3)).build());
                    }
                    return arrayList3;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    public final CrashlyticsReport.Session.Event.Application.ProcessDetails getCurrentProcessDetails(Context context) {
        Object next;
        Intrinsics.checkNotNullParameter(context, "context");
        int iMyPid = Process.myPid();
        Iterator<T> it = getAppProcessDetails(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((CrashlyticsReport.Session.Event.Application.ProcessDetails) next).getPid() == iMyPid) {
                break;
            }
        }
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = (CrashlyticsReport.Session.Event.Application.ProcessDetails) next;
        return processDetails == null ? buildProcessDetails$default(this, getProcessName(), iMyPid, 0, false, 12, null) : processDetails;
    }
}
