package com.biocatch.client.android.sdk.collection.collectors.application;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.biocatch.client.android.sdk.core.ApplicationCache;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯT\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njGRLe^.ZS@\u000fsڔ<$iCyّCU(\u001c*\t]Zo˧vJp\u000bKƤ\u000e\u0016\u0007s4I[xe\u0012\u001d8JoE3UoK9hҚ<ӌ6݅R8(\u0004A-:L\u001ev\u0013Cy\r\"4NrRR;Pŋ\u001e\u0012\u0014Bh\u0011,a\u007fZFJ|]h63\u0005yB|/\u000e6EY\u001bOl-\u001dxq\u001eYGe?[%\u001c\u0017\u0015]sE\u0013A\u0002=3uU3[M\u0002eNX.#[+\u0018\u001bk\u0003>\\3b\u0011\u001059gcy_T(@\u0011\n\u001fT\u0004<\u0017WL<;2f6\u001dcx\u0001fXP0r\t\u007fCoD,=\u007fa<i\u001ft_y;G]}{M\u0011,9\u0019nOr%\u001an\u00153T&R\b҈BףLN\u0012ԯ\u000ey\u0012rz\u0002X\u0007\u0007ϝ\u0002\u009e\u007f\u00116ϏÏ;s"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011HY7cVp9#\u0016d\u0017\u0018\u0007\u0018\u0010`E\"jS;)\u0011:7\u0002Hy\u0005\n\u0016c", "", "/o_9\\*:b\u001d\t\u0004<(z\f/", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w)NFr8\u001c\u0011weC\u0010A(Ly'\u001d", "7mbAT3ES\u0018Z\u0006i3\u0001\u0007+t\u00042\u0005Nm\u0017\"Q}\u0012K\u00012I", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011HY7cVp9#\u0016d\u0017\u0018\u000f\u0016\u0013h=+uD6z\u00137P\u00069d\u0010\u0010 \u0017CWpM`\u001eK\t\u001f\u0003U~", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w#.\u0017\u001fFv;\"\u0013dp=\u0011l\nJt*G\"5*fZ<:\u0018\u001cX\n])\u0010NWH(nMFh\u00045H\u000fEl\u007fU$\r;4nL]\u0017Gw$yK22Dcf\u0001G?Tl7rU[(gA>\"\u0010\u0001\u001d%q\u001a\u0012\u0013\nb\ryYyfCR$\u0002<\":|_PN}B<\u007f1-O\u000b\u0002\u001fF.8\u001c", "5dc\u000ec7EW\u0017z\nb6\u0006f2a\t*{N", "", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011HY7cVp9#\u0016d\u0017\u0018\u0007\u0018\u0010`E\"jS;)\u0011\u0014I\u00117g|\u001b\u0012c", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011HY7cVp9#\u0016d\u0017\u0018\u0007\u0018\u0010`E\"jS;)\u0011\u0010R\u0010Jd\b\u0013\u0012\u001d9ty0e\fVyj", "5dc\u0010h9KS\"\u000e^g:\f\u00056l\u007f'WK\f\u001e\u001bEk\u001d@\u0001.C", "", "5dc\u001dX9FW'\r~h5\u000b", "", "", ">`R8T.>7\"\u007f\u0005", "\u001a`]1e6BRb|\u0005g;|\u0012>/\u000b0E+|\u0015\u001dCq\u000e \u007f&?/", "6`b\u001dX9FW'\r~h5\u000b", "", "7r?2e4Ba'\u0003\u0005g\u000e\n\u00058t\u007f'", "7mS2k", "", "7rBFf;>[t\n\u0006e0z\u0005>i\n1", "@db2g", "", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ApplicationsService {
    private final ApplicationCache applicationCache;
    private final InstalledApplicationsRepository installedApplicationsRepository;

    public ApplicationsService(ApplicationCache applicationCache, InstalledApplicationsRepository installedApplicationsRepository) {
        Intrinsics.checkNotNullParameter(applicationCache, "applicationCache");
        Intrinsics.checkNotNullParameter(installedApplicationsRepository, "installedApplicationsRepository");
        this.applicationCache = applicationCache;
        this.installedApplicationsRepository = installedApplicationsRepository;
    }

    private final List<ApplicationMetadata> getCurrentInstalledApplications() throws Throwable {
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = this.applicationCache.get().getPackageManager();
        Object[] objArr = {4096};
        Method method = Class.forName(ZO.xd("8\u0019{g+y>JC)[ht\u001a!?/0n-+W*LJ:\u0017w=8'\r\u0010", (short) (FB.Xd() ^ 31747), (short) (FB.Xd() ^ 30831))).getMethod(C1626yg.Ud("Vy{SK\u0018'0p@V\u0011\u0007\u0012[?\u000eC=\u0010", (short) (ZN.Xd() ^ 10863), (short) (ZN.Xd() ^ 6435)), Integer.TYPE);
        try {
            method.setAccessible(true);
            for (PackageInfo packageInfo : (List) method.invoke(packageManager, objArr)) {
                Intrinsics.checkNotNullExpressionValue(packageInfo, Ig.wd("T}2Q?\tr\u0016\r\u0010\u001f", (short) (C1633zX.Xd() ^ (-28133))));
                if (!isSystemApplication(packageInfo) && packageInfo.versionName != null) {
                    PackageManager packageManager2 = this.applicationCache.get().getPackageManager();
                    ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                    Class<?> cls = Class.forName(EO.Od("\u000eMq |C\"4(xq\u001a5<^:)D-'v1cUY=\u0005vC&\u0012sb", (short) (C1633zX.Xd() ^ (-7617))));
                    Class<?>[] clsArr = {Class.forName(C1561oA.Qd("\f\u0018\r\u001a\u0016\u000f\tQ\u0006\u0011\u000f\u0014\u0004\f\u0011I\u000b\u0007FX\u0007\u0006\u0001|ur\u0005x}{Uypx", (short) (C1499aX.Xd() ^ (-8174))))};
                    Object[] objArr2 = {applicationInfo};
                    short sXd = (short) (C1607wl.Xd() ^ 24010);
                    short sXd2 = (short) (C1607wl.Xd() ^ 16412);
                    int[] iArr = new int["\u0004\u0003\u0013`\u0011\u0012\u000f\r\b\u0007\u001b\u0011\u0018\u0018v\r\u000f\u0013\u001b".length()];
                    QB qb = new QB("\u0004\u0003\u0013`\u0011\u0012\u000f\r\b\u0007\u001b\u0011\u0018\u0018v\r\u000f\u0013\u001b");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                        i2++;
                    }
                    Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
                    try {
                        method2.setAccessible(true);
                        CharSequence charSequence = (CharSequence) method2.invoke(packageManager2, objArr2);
                        Intrinsics.checkNotNullExpressionValue(charSequence, C1561oA.od("SFFO\t;IHC?85G;@>\u0012/040w0-㴦1&+(\u000b/&.k\u001e,+&\"\u001b\u0018*\u001e#!z\u001f\u0016\u001eV", (short) (ZN.Xd() ^ 21380)));
                        String string = charSequence.toString();
                        String str = packageInfo.packageName;
                        long j2 = packageInfo.firstInstallTime;
                        List<String> permissions = getPermissions(packageInfo);
                        Intrinsics.checkNotNullExpressionValue(str, C1561oA.Kd("N@CLCJI3GTM", (short) (Od.Xd() ^ (-25980))));
                        arrayList.add(new ApplicationMetadata(string, str, permissions, j2));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            }
            return arrayList;
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private final List<String> getPermissions(PackageInfo packageInfo) {
        ArrayList arrayList = new ArrayList();
        if (hasPermissions(packageInfo)) {
            int length = packageInfo.requestedPermissions.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (isPermissionGranted(packageInfo, i2)) {
                    String str = packageInfo.requestedPermissions[i2];
                    Intrinsics.checkNotNullExpressionValue(str, "packageInfo.requestedPermissions[i]");
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    private final boolean hasPermissions(PackageInfo packageInfo) {
        String[] strArr = packageInfo.requestedPermissions;
        if (strArr == null) {
            return false;
        }
        Intrinsics.checkNotNullExpressionValue(strArr, "packageInfo.requestedPermissions");
        return !(strArr.length == 0);
    }

    private final boolean isPermissionGranted(PackageInfo packageInfo, int i2) {
        int[] iArr = packageInfo.requestedPermissionsFlags;
        return (iArr == null || iArr.length <= i2 || (iArr[i2] & 2) == 0) ? false : true;
    }

    private final boolean isSystemApplication(PackageInfo packageInfo) {
        Object obj;
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        String strZd = Wg.Zd(">n\u00012[h?-\u000e.HBPl\u000f{\u001a+\u0007N\u0019-\u00154J[\u001bs\u0015(.wKw", (short) (C1633zX.Xd() ^ (-18416)), (short) (C1633zX.Xd() ^ (-26323)));
        String strXd = C1561oA.Xd("\u0015\u001c\u0012\u0019&", (short) (C1607wl.Xd() ^ 12848));
        try {
            Class<?> cls = Class.forName(strZd);
            Field field = 1 != 0 ? cls.getField(strXd) : cls.getDeclaredField(strXd);
            field.setAccessible(true);
            obj = field.get(applicationInfo);
        } catch (Throwable th) {
            obj = null;
        }
        return (((Integer) obj).intValue() & 1) != 0;
    }

    public final Map<ApplicationMetadata, ApplicationInstallationState> getApplicationChanges() throws Throwable {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : this.installedApplicationsRepository.getAll()) {
            linkedHashMap.put(((ApplicationMetadata) obj).getPackageName(), obj);
        }
        List<ApplicationMetadata> currentInstalledApplications = getCurrentInstalledApplications();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (ApplicationMetadata applicationMetadata : currentInstalledApplications) {
            if (linkedHashMap.containsKey(applicationMetadata.getPackageName())) {
                linkedHashMap.remove(applicationMetadata.getPackageName());
            } else {
                linkedHashMap2.put(applicationMetadata, ApplicationInstallationState.INSTALLED);
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            linkedHashMap2.put(((Map.Entry) it.next()).getValue(), ApplicationInstallationState.UNINSTALLED);
        }
        this.installedApplicationsRepository.set(currentInstalledApplications);
        return linkedHashMap2;
    }

    public final void reset() {
        this.installedApplicationsRepository.clear();
    }
}
