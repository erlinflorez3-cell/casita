package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Process;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.WorkManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.InterfaceC1492Gx;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: ProcessUtils.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001e\u001d̉=!,u\bDJc|\u0004W\u00068é6B\r+4ߚ\u007f\u0007|jAӄ\\uV.jU@\u000e\u001azd(i%\nCiW`~:\u001d]Q\u007fg\u001dN\u000b\u000fQ\u0010\u001e\u0016'l\\Mc}u\u0012=8b{M\u074ceok87ҝ8ӯ$2*\u0600ѯ\t\b"}, d2 = {"\"@6", "", "5dc\u001de6<S'\rcZ4|", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7r32Y(NZ(i\bh*|\u0017=", "", "1n]3\\.N`\u0015\u000e~h5", "\u001a`]1e6BR,H\rh9\u0003R\ro\t)\u007fB\u0011$\u0013Vs\u0018EL", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 2, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ProcessUtils {
    private static final String TAG;

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("ProcessUtils");
        Intrinsics.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(\"ProcessUtils\")");
        TAG = strTagWithPrefix;
    }

    public static final boolean isDefaultProcess(Context context, Configuration configuration) throws Throwable {
        Object obj;
        Intrinsics.checkNotNullParameter(context, Wg.vd("grtyewv", (short) (C1607wl.Xd() ^ 17280)));
        Intrinsics.checkNotNullParameter(configuration, Qg.kd("4?=463@<*<053", (short) (C1607wl.Xd() ^ 4657), (short) (C1607wl.Xd() ^ 16316)));
        String processName = getProcessName(context);
        String defaultProcessName = configuration.getDefaultProcessName();
        if (defaultProcessName != null && defaultProcessName.length() != 0) {
            return Intrinsics.areEqual(processName, configuration.getDefaultProcessName());
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(hg.Vd("MYN[WPJ\u0013GRPUEMR\u000b\u001fJHM=OJ", (short) (Od.Xd() ^ (-11481)), (short) (Od.Xd() ^ (-9433)))).getMethod(C1561oA.ud("IFT NMHD=:L@EC\u001dA8@", (short) (C1580rY.Xd() ^ (-1509))), new Class[0]);
        try {
            method.setAccessible(true);
            ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
            String strYd = C1561oA.yd("gslyyrp9alnsgox1fb&8jihdQNdXa_=a\r\u0015", (short) (FB.Xd() ^ 6826));
            String strYd2 = C1561oA.Yd("mpncfuvRfsl", (short) (C1633zX.Xd() ^ (-27096)));
            try {
                Class<?> cls = Class.forName(strYd);
                Field field = 1 != 0 ? cls.getField(strYd2) : cls.getDeclaredField(strYd2);
                field.setAccessible(true);
                obj = field.get(applicationInfo);
            } catch (Throwable th) {
                obj = null;
            }
            return Intrinsics.areEqual(processName, (String) obj);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static final String getProcessName(Context context) throws Throwable {
        Object next;
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.INSTANCE.getProcessName();
        }
        short sXd = (short) (C1499aX.Xd() ^ (-15889));
        int[] iArr = new int["\u0018w}&x%u6\u000eOK1p#2K/\n[j\nh\u000f\u007f\fE".length()];
        QB qb = new QB("\u0018w}&x%u6\u000eOK1p#2K/\n[j\nh\u000f\u007f\fE");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        try {
            Method declaredMethod = Class.forName(new String(iArr, 0, i2), false, WorkManager.class.getClassLoader()).getDeclaredMethod(EO.Od("\u0006o:\u001a\u0006dFq[ka}W]\u001cH2\u0018", (short) (C1499aX.Xd() ^ (-10462))), new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            Intrinsics.checkNotNull(objInvoke);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Throwable th) {
            Logger.get().debug(TAG, C1561oA.Qd("'?11:2k?9h+/+(/b\u0003$4(4&04\u000e!*\u001c\u0017\u0019S\u0019!#O\u001f \u001c\u000f\u0010\u001d\u001cu\b\u0013\n", (short) (C1499aX.Xd() ^ (-1587))), th);
        }
        int iMyPid = Process.myPid();
        String strZd = C1593ug.zd("ORdZh\\hn", (short) (C1499aX.Xd() ^ (-17514)), (short) (C1499aX.Xd() ^ (-11400)));
        short sXd2 = (short) (C1580rY.Xd() ^ (-14570));
        int[] iArr2 = new int[">J?LHA;\u00048CAF6>C{\u0010;9>.@;".length()];
        QB qb2 = new QB(">J?LHA;\u00048CAF6>C{\u0010;9>.@;");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        Object[] objArr = {strZd};
        Method method = Class.forName(new String(iArr2, 0, i3)).getMethod(Wg.Zd("{XQ`x!\u0010=+?;xn@gV", (short) (C1633zX.Xd() ^ (-28514)), (short) (C1633zX.Xd() ^ (-17238))), Class.forName(C1561oA.Kd("kcye3rhvp8^\u0001\u007fw}w", (short) (ZN.Xd() ^ 22045))));
        try {
            method.setAccessible(true);
            Object objInvoke2 = method.invoke(context, objArr);
            Intrinsics.checkNotNull(objInvoke2, C1561oA.Xd("8@89m21?@BHt8<w<;NP|RN\u007fOQQ\u0011S[ST\t^d\\R\u000eP^Udb]Y$Xhi(<_qguiu{Pesgnm{", (short) (C1633zX.Xd() ^ (-23034))));
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) objInvoke2).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return null;
            }
            Iterator<T> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((ActivityManager.RunningAppProcessInfo) next).pid == iMyPid) {
                    break;
                }
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
            if (runningAppProcessInfo != null) {
                return runningAppProcessInfo.processName;
            }
            return null;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
