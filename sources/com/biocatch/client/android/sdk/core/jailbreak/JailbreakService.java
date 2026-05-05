package com.biocatch.client.android.sdk.core.jailbreak;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.client.android.sdk.core.RootCheckConstants;
import com.biocatch.client.android.sdk.wrappers.BuildInfo;
import com.dynatrace.android.agent.Global;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Xg;
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
@Metadata(bv = {}, d1 = {"Я\\\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u000fs{B-cҕyCId\"}0\u0015WNmnvJp\u000bKƤ\u000e\u0016\u000fj4I[xe\u0012\u001dPJoE:UoS9hҚ>\u000562*8\u007f\b\u0007ɝ@Ϻ@v)B\f/\"4NpRR;N\u0015\u001e \bV /!lk\\:`l\f??'\u0011oZNUf݁\u0001M\u001bN\u001d@\u001b\u007fy\u001eYJg?#0k\t\u0017Tk?1L IKhҊ++W\u0002 :f\u000f,\u0015YYUa\u00016t\u0005\u007fjT=9`{K~\u0018X{\t\u000e%<2\u001b6+VAE\u001a\u0015\u0015T3=vaTh\u0002\rLH~oK/%.=s?)|icQ\u0018|ND\u0013\u001b6;\u0003\u0005 \nm>d#5lw\u007f>\u001a]Kcf\u0010i?}\u0004\u001fo0F4:U\u001dG\u0002!0'%ehg/\u074co\u0002Vb0\u0003\u0013\u007f\u0001S\u0018\\xD0\u000f.7X\u0016T^R\u0006\u001dk~^!?\u001fo4^\u0017\u0002\u0018\u00156[&I7$>Zћlixp&\u00163S~7\b{\u001c\u0012e^v3cw,5oy\u000f O>r\u0005\u0007sRU\u001cZ\u000b5PZxt\u001e\u0003\u0014J^\u000e#2m~J@r1Ǭ`\u0015V,fPO'!_\tu@\u0003b^<\u0003\u00181;\tIZj\u001d\bm\tK<|\u000f/[]\"A'&m\"\u00175Sɀ\tҋw\u007fOх\u001dSZn.u\u0004~vډ\u001c\u07fcU/EП_\u000b76\u001a-sQIϏS̊\u0016'\u0003۠J\u001bInFg6qGݝbʧNO\\ϟȚz\f"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wR??r1+\u0015dg\u0003k_0Us4GHT\u001a\\_\u0004A\u0012\u00120", "", "0tX9W\u0010GT#", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G2Di!9MPI5\u0011.\u0019o`\u001d\u0010d6$", "8`X9U9>O\u001fp\bZ7\b\t<", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wR??r1+\u0015dg\u0003k_0Us4GHT\u001eiN}H\u0014\u001f0", ">`R8T.>;\u0015\bv`,\n", "\u001a`]1e6BRb|\u0005g;|\u0012>/\u000b0E+|\u0015\u001dCq\u000e$r.1[}-\r", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004iIz\u00129XCHy}z%lh8jl-XL\u000eEVVuYV|;\u0010!X\u0011\u0018)\u0014\tYJ38@@\u001e\u00156M\u0001\u0005v\u007f\u0012_\f?wp\f[\fK\u0001\u0012\u0003A%n\u0010>[}N>Rb&j}l\u0019gE:1iX\u0015$g]8\u000ez\u001d\u000f|[\tgpVb\u0006@m)iYLAqU$p0\u001bM{\u0005g\u0019V~3>*\b>(2s\u0003N1\u0014G]\u0006\u001f0[\u000b%0>D\u001dHYb{6<\u0018u\u001f+w\u001df<?n)V", "1gT0^\rH`x\b\u0005n.\u007fr:t\u00042\u0005N", "", "/qV@", "", "", "uZ;7T=:\u001d z\u0004`uj\u0018<i\t*Q\u0004u", "1gT0^\rH`\u0006peZ;\u007f\u0017", "1gT0^\rH`\u0007\u000fWb5x\u0016C", "1gT0^\u0010?>\u0015\u000e}>8\r\u00056s", ";nd;g\u0017HW\"\u000e", ">`c5G6\u001cV\u0019|\u0001", "1gT0^\u001aN3,\u0003\tm:", "1gT0^\u001b>a(dzr:", "5dc\u0016a7Nb\u0007\u000e\b^(\u0005", "\u001aiPCTuB]bb\u0004i<\fv>r\u007f$\u0004\u0016", "5dc\u001fb6M>\u0015|\u0001Z.|l8f\n", "\u001a`]1e6BRb|\u0005g;|\u0012>/\u000b0E+|\u0015\u001dCq\u000e \u007f&?/", "7s", "7mbAT3ES\u0018k\u0005h;X\u0014:s", "", ">`R8T.>a", "uZ;7T=:\u001d z\u0004`uj\u0018<i\t*Q\u0004g\u001c\u0013XkWL\u0006)<#d$E|k", "7r56_,\u001ef\u001d\r\nl", ">`c5", "7r9.\\3\u001b`#\u0005zg", ";nd;g\u0017K]$\rg^({\t<", "u(J\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "AbP;a,K<\u0019\u0012\n", "AbP;a,K", "\u001aiPCTuNb\u001d\u0006DL*x\u00128e\r}", "Adc\u001ab<Gbu\u0013k^9\u000b\r9n", "\u001aj^A_0G\u001d\u0004z~k\u0002", "uZ;7T=:\u001d z\u0004`uj\u0018<i\t*Q\u0004g\u001d!Vv\u0012E@\u00101]\u000bu", "Adc\u001ab<Gb\u0003\n\nb6\u0006", ";nd;g\u0016Ib\u001d\t\u0004l", "At16a(Kgy\u0003\u0002^\u0017x\u00182L\u00046\u000b", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class JailbreakService {
    private final BuildInfo buildInfo;
    private final JailbreakWrapper jailbreakWrapper;
    private final PackageManager packageManager;
    private final Utils utils;

    public JailbreakService(BuildInfo buildInfo, JailbreakWrapper jailbreakWrapper, PackageManager packageManager, Utils utils) {
        Intrinsics.checkNotNullParameter(buildInfo, "buildInfo");
        Intrinsics.checkNotNullParameter(jailbreakWrapper, "jailbreakWrapper");
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        Intrinsics.checkNotNullParameter(utils, "utils");
        this.buildInfo = buildInfo;
        this.jailbreakWrapper = jailbreakWrapper;
        this.packageManager = packageManager;
        this.utils = utils;
    }

    private final boolean checkForEnoughOptions(String[] strArr) {
        return (this.utils.isVersionLessOrEqualTo(23) && strArr.length < 4) || (!this.utils.isVersionLessOrEqualTo(23) && strArr.length < 6);
    }

    private final boolean checkIfPathEquals(String str, String str2) {
        return StringsKt.equals(str, str2, true);
    }

    private final Pair<String, String> setMountByVersion(String[] strArr) {
        return this.utils.isVersionLessOrEqualTo(23) ? new Pair<>(strArr[1], strArr[3]) : new Pair<>(strArr[2], setMountOption(strArr[5]));
    }

    private final String setMountOption(String str) {
        return StringsKt.replace$default(StringsKt.replace$default(str, "(", "", false, 4, (Object) null), ")", "", false, 4, (Object) null);
    }

    public final boolean checkForRWPaths() {
        String[] strArrMountPropsReader = mountPropsReader();
        int i2 = 0;
        if (strArrMountPropsReader == null) {
            return false;
        }
        int length = strArrMountPropsReader.length;
        int i3 = 0;
        while (i3 < length) {
            String str = strArrMountPropsReader[i3];
            if (str != null) {
                String[] strArr = new String[1];
                strArr[i2] = Global.BLANK;
                List listSplit$default = StringsKt.split$default((CharSequence) str, strArr, false, 0, 6, (Object) null);
                if (listSplit$default != null) {
                    Object[] array = listSplit$default.toArray(new String[i2]);
                    Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    String[] strArr2 = (String[]) array;
                    if (strArr2 != null && !checkForEnoughOptions(strArr2)) {
                        Pair<String, String> mountByVersion = setMountByVersion(strArr2);
                        String first = mountByVersion.getFirst();
                        String second = mountByVersion.getSecond();
                        String[] pathsThatShouldNotBeWritable = RootCheckConstants.INSTANCE.getPathsThatShouldNotBeWritable();
                        int length2 = pathsThatShouldNotBeWritable.length;
                        int i4 = i2;
                        while (i4 < length2) {
                            if (checkIfPathEquals(first, pathsThatShouldNotBeWritable[i4])) {
                                String[] strArr3 = new String[1];
                                strArr3[i2] = ",";
                                Object[] array2 = StringsKt.split$default((CharSequence) second, strArr3, false, 0, 6, (Object) null).toArray(new String[i2]);
                                Intrinsics.checkNotNull(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                int length3 = array2.length;
                                while (i2 < length3) {
                                    if (checkIfPathEquals((String) array2[i2], "rw")) {
                                        return true;
                                    }
                                    i2++;
                                }
                            }
                            i4++;
                            i2 = 0;
                        }
                    }
                } else {
                    continue;
                }
            }
            i3++;
            i2 = 0;
        }
        Unit unit = Unit.INSTANCE;
        return false;
    }

    public final boolean checkForSuBinary() {
        return !suBinaryFilePathList().isEmpty();
    }

    public final boolean checkSuExists() {
        boolean z2 = false;
        try {
            if (this.jailbreakWrapper.getBufferLines() != null) {
                z2 = true;
            }
        } catch (Throwable unused) {
        }
        this.jailbreakWrapper.destroyProcess();
        return z2;
    }

    public final boolean checkTestKeys() {
        String tags = this.buildInfo.getTags();
        return tags != null && StringsKt.contains$default((CharSequence) tags, (CharSequence) "test-keys", false, 2, (Object) null);
    }

    public final InputStream getInputStream() {
        return Runtime.getRuntime().exec("mount").getInputStream();
    }

    public final PackageInfo getRootPackageInfo(String str) throws Throwable {
        Intrinsics.checkNotNullParameter(str, C1561oA.Yd("\u001f+", (short) (C1580rY.Xd() ^ (-5044))));
        PackageManager packageManager = this.packageManager;
        Object[] objArr = {str, 0};
        Method method = Class.forName(Xg.qd("<JAPNIE\u0010FSSZLV]\u0018[Y\u001b>PS\\SZYBWeY`_m", (short) (OY.Xd() ^ 3396), (short) (OY.Xd() ^ 23642))).getMethod(ZO.xd("\u000fG\u001d>,u%d0ds6pB", (short) (OY.Xd() ^ 26890), (short) (OY.Xd() ^ 6170)), Class.forName(Jg.Wd("X=n!i8x}\u0003\u0019:c=,5\u0006", (short) (C1499aX.Xd() ^ (-9979)), (short) (C1499aX.Xd() ^ (-6809)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            return (PackageInfo) method.invoke(packageManager, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final List<String> installedRootApps(String[] packages) {
        Intrinsics.checkNotNullParameter(packages, "packages");
        ArrayList arrayList = new ArrayList();
        for (String str : packages) {
            try {
                if (getRootPackageInfo(str) != null) {
                    arrayList.add(str);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return arrayList;
    }

    public final boolean isFileExists(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return new File(path).exists();
    }

    public final boolean isJailBroken() {
        return checkTestKeys() || checkForSuBinary() || checkSuExists();
    }

    public final String[] mountPropsReader() {
        try {
            InputStream inputStream = getInputStream();
            if (inputStream == null) {
                return null;
            }
            Scanner scannerUseDelimiter = new Scanner(inputStream).useDelimiter("\\A");
            Intrinsics.checkNotNullExpressionValue(scannerUseDelimiter, "Scanner(inputStream).useDelimiter(\"\\\\A\")");
            Object[] array = StringsKt.split$default((CharSequence) scannerNext(scannerUseDelimiter), new String[]{"\n"}, false, 0, 6, (Object) null).toArray(new String[0]);
            Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return (String[]) array;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String scannerNext(Scanner scanner) {
        Intrinsics.checkNotNullParameter(scanner, "scanner");
        String next = scanner.next();
        Intrinsics.checkNotNullExpressionValue(next, "scanner.next()");
        return next;
    }

    public final List<String> suBinaryFilePathList() {
        String[] suPaths = RootCheckConstants.INSTANCE.getSuPaths();
        ArrayList arrayList = new ArrayList();
        for (String str : suPaths) {
            if (isFileExists(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
