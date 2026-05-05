package com.dynatrace.agent.util;

import android.content.Context;
import android.content.pm.PackageManager;
import com.dynatrace.agent.common.connectivity.LocalBuild;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176B\u0005&4\u0012\u0006%nj?2LeV7ZS0\u0010s{J$c$wGCU( *\tUWm̨n`ҙ;C=\u0005V\u007fp,֒Yzc\u0012\u001d3\u000b{MDeokH\u0011xD\u001782PKB\u0013\u000f.BH>\u0006+GY\u001e*0n\u0004\u0001RU^\u0013/*\fN\"\u0011\u001e\u000bj|@\u000fǍҺ>/)\u00192M\\>w0+\\SϿù+\r|yfJNPM!5U\u0013\u0007\u0001^O\u0005Oqk\b\u0017AW/W\u000fo6\u0007\u0003ZƃۣS\rc\u000fno\u0013nx\fU:\u007fgYb&(&\u000eBȞʀ\b\u000e\fE\u0011J;9~\b<B%|a`h\bnD\u0010z\u00109E/079K3f\u007ft\u0002\u0019\u0017=\n&%\u001eQ\u00105!$p\u001c\u0003-\u001b\u0003\u0007\u0002;_cUN^\fi=\u001c\u0007\u001fl2.\u0012T_\u007f]~W.g1E]Q#OnX҉\u0017ϼz\u0005hå$u`LX\"\u001d\u0019\u000eѪ[ɔ^Dlʍ<\\b]D\u0011{\u001f+\u0378Pݔ\u0017 dɼ\r-3\u0016fO\u0017lAܗ0ܦ)/nŽ*zy\u0015o9\r6\fȤ6ߧeR~ܝ\u0010Hp\rpfpVbȚ^͈&2PК`\n\nMf\u0012#4OqJ7Z;o¥\u0017Ƞ\u0007\u001eJˆM\u001bme\u0001\u0016\u000fVC$1lR~_əRʷtooծ\u001a>\u000bl:3QSE\u0019TXPr\u000bí%ȷ\u0003s\bø8^UY\u0005\u001c\u0006W\f D\u001dg[\u0006ˎ\u0015ä\u0003):Ĉ}UZ\u0001}Sc\u0011U\nSȭ\u001b³l0o\bx\u0001ރd\u0010"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011&\u001bN9zF\u00014\u0014Y\r 5| ;#", "", "\nh]6g\u0005", "u(E", "\"DB!R\u0012\u001eG\u0007", "", "\u0010H=\u000eE 8A\t", "\u0010H=\u000eE 80\tln;\u0016o", "\u0010H=\u000eE 8;t`^L\u0012", "\u0012DE\u00166\f8>\u0006he>\u0019k|)Fi\u0015c\u001co", "\u001aN6,G\b ", "9m^Da\u0019H](Z\u0006i:g\u0005-k{*{N", "", "9m^Da\u000b:\\\u001b~\bh<\u000bd:p\u000e\u0013w>\u0007\u0013\u0019G}", "9m^Da\u0019H](\\\u0002h(\u0003\r8gj$yF|\u0019\u0017U", "At?.g/L", "1`R5X+\"a\u0006\t\u0005m,{", "", "\u001aiPCTuEO\"\u0001D;6\u0007\u0010/a\t}", "7r32i0<S\u0006\t\u0005m,{", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7r32i0<S\u0006\t\u0005m,{l8t\u007f5\u0005<\b", "2dc2e4B\\\u0019[~g(\n\u001d\u001aa\u000f+\n", "2dc2e4B\\\u0019[~g(\n\u001d\u001aa\u000f+\n~~!\u001fAn\"Er4BU{ 1i\u0018.VR5x4%\u0015do9", "1gT0^\u001b>a(dzr:", "1gT0^\u001b>a(dzr:;\u00079my'\u0010I|&$Cm\u000e6r'5b\r\u001aDm\u001d.IQ;", ">`a@X\u000b>d\u001d|zI9\u0007\u0014/r\u000f,{N", "", "2de6V,)`#\nzk;\u0001\t=", ">`a@X\u000b>d\u001d|zI9\u0007\u0014/r\u000f,{N?\u0015!Oi\rP\u007f!Dfy\u001e7g\u00120MLJeA\u001e\u001ch]G\u0007", "1gT0^\u0017Hb\u0019\b\nb(\u0004u9o\u000f\u0004\u0007K\u000f", "1gT0^\u0017Hb\u0019\b\nb(\u0004u9o\u000f\u0004\u0007K\u000fU\u0015Qw\b;\u000b.1h\u000b\u001c5m\u0010*OCDz.+\u0015oa5\u0015c", "7r0;l\u0017:Q\u001fz|^\r\n\u00137L\u00046\u000b$\n%&Cv\u0015<u", ">`R8T.>a", "1gT0^\u001aN3,\u0003\tm:", "1gT0^\tB\\\u0015\f\u000f", "2ha2V;H`\u001d~\t", "4h[2A(FS", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class RootDetector {
    private static final String BINARY_BUSYBOX = "busybox";
    private static final String BINARY_MAGISK = "magisk";
    private static final String BINARY_SU = "su";
    private static final String DEVICE_PROPERTY_FORMAT = "\\[(.*?)]:\\s*\\[(.*?)]";
    private static final String TEST_KEYS = "test-keys";
    private static Boolean cachedIsRooted = null;
    public static final RootDetector INSTANCE = new RootDetector();
    private static final String LOG_TAG = Global.LOG_PREFIX + "RootDetector";
    private static final List<String> knownRootAppsPackages = CollectionsKt.listOf((Object[]) new String[]{"com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk", "com.kingroot.kinguser", "com.kingo.root", "com.smedialink.oneclickroot", "com.zhiqupk.root.global", "com.alephzain.framaroot"});
    private static final List<String> knownDangerousAppsPackages = CollectionsKt.listOf((Object[]) new String[]{"com.koushikdutta.rommanager", "com.koushikdutta.rommanager.license", "com.dimonvideo.luckypatcher", "com.chelpus.lackypatch", "com.ramdroid.appquarantine", "com.ramdroid.appquarantinepro", "com.android.vending.billing.InAppBillingService.COIN", "com.android.vending.billing.InAppBillingService.LUCK", "com.chelpus.luckypatcher", "com.blackmartalpha", "org.blackmart.market", "com.allinone.free", "com.repodroid.app", "org.creeplays.hack", "com.baseappfull.fwd", "com.zmapp", "com.dv.marketmod.installer", "org.mobilism.android", "com.android.wp.net.log", "com.android.camera.update", "cc.madkite.freedom", "com.solohsu.android.edxp.manager", "org.meowcat.edxposed.manager", "com.xmodgame", "com.cih.game_cih", "com.charles.lpoqasert", "catch_.me_.if_.you_.can_"});
    private static final List<String> knownRootCloakingPackages = CollectionsKt.listOf((Object[]) new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "de.robv.android.xposed.installer", "com.saurik.substrate", "com.zachspong.temprootremovejb", "com.amphoras.hidemyroot", "com.amphoras.hidemyrootadfree", "com.formyhm.hiderootPremium", "com.formyhm.hideroot"});
    private static final List<String> suPaths = CollectionsKt.listOf((Object[]) new String[]{"/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/cache/", "/data/", "/dev/"});

    private RootDetector() {
    }

    private final boolean checkBinary(List<String> list, String str) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(it.next(), str);
            if (file.exists()) {
                if (!Global.DEBUG) {
                    return true;
                }
                Utility.zlogD(LOG_TAG, "file detected: " + file);
                return true;
            }
        }
        return false;
    }

    private final boolean checkSuExists() throws Throwable {
        Process process = null;
        try {
            Process processExec = Runtime.getRuntime().exec(new String[]{"which", "su"});
            Intrinsics.checkNotNull(processExec);
            try {
                boolean z2 = new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null;
                if (processExec != null) {
                    processExec.destroy();
                }
                return z2;
            } catch (Exception unused) {
                process = processExec;
                if (process != null) {
                    process.destroy();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                process = processExec;
                if (process != null) {
                    process.destroy();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final boolean isAnyPackageFromListInstalled(List<String> list, Context context) throws Throwable {
        Class<?> cls = Class.forName(Wg.Zd("w>zB\u0004g\u0019ke+P\u000fEX\u00146\u0011w<zQ.^", (short) (C1580rY.Xd() ^ (-15368)), (short) (C1580rY.Xd() ^ (-1468))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1607wl.Xd() ^ 1513);
        int[] iArr = new int["GFV3EHQHON7LZNUTb".length()];
        QB qb = new QB("GFV3EHQHON7LZNUTb");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            List<String> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            for (String str : list2) {
                try {
                    Class<?> cls2 = Class.forName(Wg.vd("\u0013\u001f\u0018%%\u001e\u001cd\u001d(*/#+4l\u0012\u000eQr\u0007\b\u0013\b\u0011\u000ex\f\u001c\u000e\u0017\u0014D", (short) (OY.Xd() ^ 9990)));
                    Class<?>[] clsArr2 = new Class[2];
                    clsArr2[0] = Class.forName(Qg.kd("RH\\F\u0012OCOG\r1QNDH@", (short) (Od.Xd() ^ (-23332)), (short) (Od.Xd() ^ (-7498))));
                    clsArr2[1] = Integer.TYPE;
                    Object[] objArr2 = {str, 0};
                    Method method2 = cls2.getMethod(hg.Vd("DAO*:;B7<9\u001c@7?", (short) (C1499aX.Xd() ^ (-2916)), (short) (C1499aX.Xd() ^ (-31923))), clsArr2);
                    try {
                        continue;
                        method2.setAccessible(true);
                        method2.invoke(packageManager, objArr2);
                        if (Global.DEBUG) {
                            Utility.zlogD(LOG_TAG, C1561oA.ud("**8(%5%#]-\u001d\u001e%\u001a\u001f\u001coT", (short) (C1633zX.Xd() ^ (-15668))) + str);
                        }
                        return true;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return false;
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private final boolean isDeviceRootedInternal(Context context) {
        if (!checkTestKeys$com_dynatrace_agent_release() && !checkPotentialRootApps$com_dynatrace_agent_release(context)) {
            List<String> listDetermineBinaryPaths$com_dynatrace_agent_release = determineBinaryPaths$com_dynatrace_agent_release();
            if (!checkBinary(listDetermineBinaryPaths$com_dynatrace_agent_release, "su") && !checkBinary(listDetermineBinaryPaths$com_dynatrace_agent_release, BINARY_BUSYBOX) && !checkBinary(listDetermineBinaryPaths$com_dynatrace_agent_release, BINARY_MAGISK)) {
                if (!checkSuExists()) {
                    return false;
                }
                if (Global.DEBUG) {
                    Utility.zlogD(LOG_TAG, "su command detected");
                }
                return true;
            }
            if (Global.DEBUG) {
                Utility.zlogD(LOG_TAG, "suspicious file detected");
            }
        }
        return true;
    }

    public final boolean checkPotentialRootApps$com_dynatrace_agent_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return isAnyPackageFromListInstalled(knownRootAppsPackages, context) || isAnyPackageFromListInstalled(knownRootCloakingPackages, context) || isAnyPackageFromListInstalled(knownDangerousAppsPackages, context);
    }

    public final boolean checkTestKeys$com_dynatrace_agent_release() {
        String testTags = LocalBuild.INSTANCE.getTestTags();
        boolean zContains$default = testTags != null ? StringsKt.contains$default((CharSequence) testTags, (CharSequence) TEST_KEYS, false, 2, (Object) null) : false;
        if (zContains$default && Global.DEBUG) {
            Utility.zlogD(LOG_TAG, "test-keys detected");
        }
        return zContains$default;
    }

    public final List<String> determineBinaryPaths$com_dynatrace_agent_release() {
        List<String> mutableList = CollectionsKt.toMutableList((Collection) suPaths);
        String str = System.getenv("PATH");
        if (str != null) {
            String str2 = str;
            if (str2.length() != 0) {
                List listSplit$default = StringsKt.split$default((CharSequence) str2, new String[]{Global.COLON}, false, 0, 6, (Object) null);
                ArrayList<String> arrayList = new ArrayList();
                for (Object obj : listSplit$default) {
                    if (((String) obj).length() > 0) {
                        arrayList.add(obj);
                    }
                }
                for (String str3 : arrayList) {
                    if (!StringsKt.endsWith$default(str3, RemoteSettings.FORWARD_SLASH_STRING, false, 2, (Object) null)) {
                        str3 = str3 + '/';
                    }
                    if (!mutableList.contains(str3)) {
                        mutableList.add(str3);
                    }
                }
            }
        }
        return mutableList;
    }

    public final boolean isDeviceRooted(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (cachedIsRooted == null) {
            cachedIsRooted = Boolean.valueOf(isDeviceRootedInternal(context));
        }
        Boolean bool = cachedIsRooted;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final Map<String, String> parseDeviceProperties$com_dynatrace_agent_release(String deviceProperties) {
        Intrinsics.checkNotNullParameter(deviceProperties, "deviceProperties");
        Sequence<MatchResult> sequenceFindAll$default = Regex.findAll$default(new Regex(DEVICE_PROPERTY_FORMAT), deviceProperties, 0, 2, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (MatchResult matchResult : sequenceFindAll$default) {
            linkedHashMap.put(matchResult.getGroupValues().get(1), matchResult.getGroupValues().get(2));
        }
        return linkedHashMap;
    }
}
