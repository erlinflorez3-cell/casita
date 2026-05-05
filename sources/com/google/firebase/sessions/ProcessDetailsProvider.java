package com.google.firebase.sessions;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.common.util.ProcessUtils;
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
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
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
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u001e\u007fјnjG6LeN.ZS8\u0018sڔ<$iByّCU0}*\tUPm̨n`ҙ;C=\u0005V}p,֒Yxk\u0012W^PpW3{qm=nwN\u0005N6R>\u007f\u0005\u000f\u001fBH>|+IQ\f 7XphX=S\u000b\u001a \u000eV /'#g\u0017HVvu@?%\u0013ipPUj`\u0001[\u0019^TU\u001a?m,9X7c\u0017UW\u0011\u0013j[m\u0010\b|K\u0014\u0001'U/\u0010֕ɱ:X\u0006$Ƭ/`"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n f\b\u001e7{$\rMR7o;,\u007fukJ\u000bb,[L", "", "u(E", "0tX9W\u0017K]\u0017~\tl\u000b|\u0018+i\u00076", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n f\b\u001e7{$\rMR7o;,j", ">q^0X:L<\u0015\u0007z", "", ">hS", "", "7l_<e;:\\\u0017~", "7r32Y(NZ(i\bh*|\u0017=", "", "5dc\u000ec7)`#|zl:[\t>a\u0004/\n", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "5dc\u0010h9KS\"\u000eek6z\t=s^(\u000b<\u0005\u001e%", "5dc\u001de6<S'\rcZ4|", "5dc\u001de6<S'\rcZ4|G-o\b\"}J\u000b\u0019\u001eGi\u000f@\u0004%2U\f 1n\u001a;M@7y4\u0018#hoG\u000bm5\\", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>35g\f$Av$"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ProcessDetailsProvider {
    public static final ProcessDetailsProvider INSTANCE = new ProcessDetailsProvider();

    private ProcessDetailsProvider() {
    }

    private final ProcessDetails buildProcessDetails(String str, int i2, int i3, boolean z2) {
        return new ProcessDetails(str, i2, i3, z2);
    }

    static /* synthetic */ ProcessDetails buildProcessDetails$default(ProcessDetailsProvider processDetailsProvider, String str, int i2, int i3, boolean z2, int i4, Object obj) {
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i2 = 0;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
            i3 = 0;
        }
        if ((i4 + 8) - (i4 | 8) != 0) {
            z2 = false;
        }
        return processDetailsProvider.buildProcessDetails(str, i2, i3, z2);
    }

    public final List<ProcessDetails> getAppProcessDetails(Context context) throws Throwable {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(context, Wg.vd("mxv{s\u0006\u0001", (short) (C1499aX.Xd() ^ (-28664))));
        Object[] objArr = new Object[0];
        Method method = Class.forName(Qg.kd("gshuqjd-aljo_gl%9dbgWid", (short) (C1499aX.Xd() ^ (-4143)), (short) (C1499aX.Xd() ^ (-10764)))).getMethod(hg.Vd("2/=\t761-&#5).,\u0006*!)", (short) (C1499aX.Xd() ^ (-14912)), (short) (C1499aX.Xd() ^ (-13233))), new Class[0]);
        try {
            method.setAccessible(true);
            android.content.pm.ApplicationInfo applicationInfo = (android.content.pm.ApplicationInfo) method.invoke(context, objArr);
            String strUd = C1561oA.ud("?K@MIB<\u00059DBG7?D|>:y\f:940)&8,1/\t-$,", (short) (C1607wl.Xd() ^ 6225));
            String strYd = C1561oA.yd("%\u0018\u0012", (short) (Od.Xd() ^ (-14382)));
            try {
                Class<?> cls = Class.forName(strUd);
                Field field = 1 != 0 ? cls.getField(strYd) : cls.getDeclaredField(strYd);
                field.setAccessible(true);
                obj = field.get(applicationInfo);
            } catch (Throwable th) {
                obj = null;
            }
            int iIntValue = ((Integer) obj).intValue();
            short sXd = (short) (FB.Xd() ^ 10180);
            int[] iArr = new int["\u007f\u000e\u0005\u0014\u0012\r\tS\n\u0017\u0017\u001e\u0010\u001a![q\u001f\u001f&\u0018,)".length()];
            QB qb = new QB("\u007f\u000e\u0005\u0014\u0012\r\tS\n\u0017\u0017\u001e\u0010\u001a![q\u001f\u001f&\u0018,)");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                i2++;
            }
            Class<?> cls2 = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr2 = new Object[0];
            short sXd2 = (short) (ZN.Xd() ^ 21638);
            short sXd3 = (short) (ZN.Xd() ^ 30239);
            int[] iArr2 = new int["21A\u000f?@=;65I?FF\"HAK".length()];
            QB qb2 = new QB("21A\u000f?@=;65I?FF\"HAK");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
                i3++;
            }
            Method method2 = cls2.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method2.setAccessible(true);
                android.content.pm.ApplicationInfo applicationInfo2 = (android.content.pm.ApplicationInfo) method2.invoke(context, objArr2);
                String strWd = Jg.Wd("z$B\u001b$Z\u001e\u0014s8c6/rE+\u0016O:\u0016Q\u000eRY Z\u00165g\u001fFw:{", (short) (C1580rY.Xd() ^ (-21400)), (short) (C1580rY.Xd() ^ (-12793)));
                short sXd4 = (short) (Od.Xd() ^ (-15881));
                short sXd5 = (short) (Od.Xd() ^ (-25890));
                int[] iArr3 = new int["?80,?wK8bF,".length()];
                QB qb3 = new QB("?80,?wK8bF,");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((i4 * sXd5) + sXd4)));
                    i4++;
                }
                String str = new String(iArr3, 0, i4);
                try {
                    Class<?> cls3 = Class.forName(strWd);
                    Field field2 = 1 != 0 ? cls3.getField(str) : cls3.getDeclaredField(str);
                    field2.setAccessible(true);
                    obj2 = field2.get(applicationInfo2);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                String str2 = (String) obj2;
                Object[] objArr3 = {C1626yg.Ud("sl?K\u000biA$", (short) (C1580rY.Xd() ^ (-3292)), (short) (C1580rY.Xd() ^ (-7997)))};
                Method method3 = Class.forName(Ig.wd("W\u001c>f:vWwq\f\u000b5vsSm=q\u0017g\u001dR2", (short) (Od.Xd() ^ (-6841)))).getMethod(C1561oA.Qd("\n\u0007\u0015r\u0018\u0011\u0011\u0001\bl}\n\r~wx", (short) (C1580rY.Xd() ^ (-3443))), Class.forName(EO.Od("\u0013D{\u0007KN'|H\u0013N\u0016B+`\u007f", (short) (FB.Xd() ^ 21696))));
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
                        String str3 = runningAppProcessInfo.processName;
                        Intrinsics.checkNotNullExpressionValue(str3, C1593ug.zd("#'!\"\u001e$\u001ex)*\u000b.,!$34\u000b1*4s7:8-0?@\u001c0=6", (short) (C1499aX.Xd() ^ (-13551)), (short) (C1499aX.Xd() ^ (-27261))));
                        arrayList3.add(new ProcessDetails(str3, runningAppProcessInfo.pid, runningAppProcessInfo.importance, Intrinsics.areEqual(runningAppProcessInfo.processName, str2)));
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

    public final ProcessDetails getCurrentProcessDetails(Context context) {
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
            if (((ProcessDetails) next).getPid() == iMyPid) {
                break;
            }
        }
        ProcessDetails processDetails = (ProcessDetails) next;
        return processDetails == null ? buildProcessDetails$default(this, getProcessName$com_google_firebase_firebase_sessions(), iMyPid, 0, false, 12, null) : processDetails;
    }

    public final String getProcessName$com_google_firebase_firebase_sessions() throws Throwable {
        String processName;
        if (Build.VERSION.SDK_INT >= 33) {
            String strMyProcessName = Process.myProcessName();
            Intrinsics.checkNotNullExpressionValue(strMyProcessName, "myProcessName()");
            return strMyProcessName;
        }
        if (Build.VERSION.SDK_INT >= 28 && (processName = Application.getProcessName()) != null) {
            return processName;
        }
        String myProcessName = ProcessUtils.getMyProcessName();
        return myProcessName != null ? myProcessName : "";
    }
}
