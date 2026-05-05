package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
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
import yg.hg;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
public final class AFc1vSDK implements AFc1tSDK {
    private final AFc1hSDK AFAdRevenueData;
    private final AFc1qSDK getMediationNetwork;
    private final Map<String, Integer> getMonetizationNetwork;
    private final AFc1rSDK getRevenue;

    public AFc1vSDK(AFc1hSDK aFc1hSDK, AFc1qSDK aFc1qSDK) {
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        this.AFAdRevenueData = aFc1hSDK;
        this.getMediationNetwork = aFc1qSDK;
        this.getRevenue = new AFc1rSDK(CollectionsKt.listOf((Object[]) new AFc1sSDK[]{new AFc1sSDK("ConversionsCache", CollectionsKt.listOf(AFe1pSDK.CONVERSION), 1), new AFc1sSDK("AttrCache", CollectionsKt.listOf(AFe1pSDK.ATTR), 1), new AFc1sSDK("OtherCache", CollectionsKt.listOf((Object[]) new AFe1pSDK[]{AFe1pSDK.LAUNCH, AFe1pSDK.INAPP, AFe1pSDK.ADREVENUE, AFe1pSDK.ARS_VALIDATE, AFe1pSDK.PURCHASE_VALIDATE, AFe1pSDK.MANUAL_PURCHASE_VALIDATION, AFe1pSDK.SDK_SERVICES}), 40)}));
        this.getMonetizationNetwork = MapsKt.mutableMapOf(TuplesKt.to("ConversionsCache", 0), TuplesKt.to("AttrCache", 0), TuplesKt.to("OtherCache", 0));
    }

    private static AFc1uSDK AFAdRevenueData(File file) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
            try {
                char[] cArr = new char[(int) file.length()];
                inputStreamReader.read(cArr);
                AFc1uSDK aFc1uSDK = new AFc1uSDK(cArr);
                aFc1uSDK.getMediationNetwork = file.getName();
                CloseableKt.closeFinally(inputStreamReader, null);
                return aFc1uSDK;
            } finally {
            }
        } catch (Exception e2) {
            AFLogger.INSTANCE.e(AFg1cSDK.CACHE, "Error while loading request from cache", e2, false, false, true, false);
            return null;
        }
    }

    private final String AFAdRevenueData(AFe1pSDK aFe1pSDK) {
        String str;
        AFc1sSDK mediationNetwork = getMediationNetwork(aFe1pSDK);
        if (mediationNetwork == null || (str = mediationNetwork.AFAdRevenueData) == null) {
            throw new UnsupportedOperationException("Cache do not support this type of events");
        }
        return str;
    }

    private final AFc1sSDK getMediationNetwork(AFe1pSDK aFe1pSDK) {
        Object next;
        Iterator<T> it = this.getRevenue.getMediationNetwork.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AFc1sSDK) next).getMediationNetwork.contains(aFe1pSDK)) {
                break;
            }
        }
        return (AFc1sSDK) next;
    }

    private final boolean getMediationNetwork(File file) throws Throwable {
        try {
            file.delete();
            getMonetizationNetwork();
            return true;
        } catch (Exception e2) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not delete " + file.getName() + " from cache", e2, false, false, false, false, 120, null);
            return false;
        }
    }

    private final void getMonetizationNetwork() throws Throwable {
        for (AFc1sSDK aFc1sSDK : this.getRevenue.getMediationNetwork) {
            String str = aFc1sSDK.AFAdRevenueData;
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.checkNotNull(context);
            short sXd = (short) (C1607wl.Xd() ^ 13334);
            int[] iArr = new int[")5*73,&n#.,1!).fz&$)\u0019+&".length()];
            QB qb = new QB(")5*73,&n#.,1!).fz&$)\u0019+&");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Kd("ML\\/SWQ`2Xb", (short) (OY.Xd() ^ 12695)), new Class[0]);
            try {
                method.setAccessible(true);
                File file = new File(new File((File) method.invoke(context, objArr), Wg.Zd("ros\u0003\b\u0006KTM\u0016.\t\u0006z", (short) (FB.Xd() ^ 20604), (short) (FB.Xd() ^ 3296))), str);
                if (file.exists()) {
                    Map<String, Integer> map = this.getMonetizationNetwork;
                    String str2 = aFc1sSDK.AFAdRevenueData;
                    File[] fileArrListFiles = file.listFiles();
                    map.put(str2, Integer.valueOf(fileArrListFiles != null ? fileArrListFiles.length : 0));
                } else {
                    file.mkdirs();
                    this.getMonetizationNetwork.put(aFc1sSDK.AFAdRevenueData, 0);
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    @Override // com.appsflyer.internal.AFc1tSDK
    public final List<AFc1uSDK> getCurrencyIso4217Code() throws Throwable {
        String strXd = C1561oA.Xd(")/<P]bSbd4SV\\Z", (short) (C1633zX.Xd() ^ (-32391)));
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, Wg.vd("Pm\u007f*Hejnvt3dr}\u0005s\r\r\u000f", (short) (ZN.Xd() ^ 4330)), false, 4, null);
        ArrayList arrayList = new ArrayList();
        ArrayList<File> arrayList2 = new ArrayList();
        try {
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.checkNotNull(context);
            Object[] objArr = new Object[0];
            Method method = Class.forName(Qg.kd("8D9FB;5}2=;@08=u\n538(:5", (short) (OY.Xd() ^ 23427), (short) (OY.Xd() ^ 24957))).getMethod(hg.Vd("IFT%GIAN\u001eBJ", (short) (C1607wl.Xd() ^ 12664), (short) (C1607wl.Xd() ^ 14779)), new Class[0]);
            try {
                method.setAccessible(true);
                if (!new File((File) method.invoke(context, objArr), strXd).exists()) {
                    Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                    Intrinsics.checkNotNull(context2);
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(C1561oA.ud("+7,95.(p%0.3#+0h|(&+\u001b-(", (short) (Od.Xd() ^ (-22295)))).getMethod(C1561oA.yd("\u0004\u0003\u000fa\n\u000e\u0004\u0013h\u000f\u0015", (short) (ZN.Xd() ^ 13298)), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        new File((File) method2.invoke(context2, objArr2), strXd).mkdir();
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                Iterator<T> it = this.getRevenue.getMediationNetwork.iterator();
                while (it.hasNext()) {
                    String str = ((AFc1sSDK) it.next()).AFAdRevenueData;
                    Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
                    Intrinsics.checkNotNull(context3);
                    Object[] objArr3 = new Object[0];
                    Method method3 = Class.forName(C1561oA.Yd("\u0010\u001e\u0015$\"\u001d\u0019c\u001a''. *1k\u0002//6(<9", (short) (C1580rY.Xd() ^ (-5759)))).getMethod(Xg.qd("nm}Ptxr\u0002Sy\u0004", (short) (C1499aX.Xd() ^ (-1731)), (short) (C1499aX.Xd() ^ (-6080))), new Class[0]);
                    try {
                        method3.setAccessible(true);
                        File file = new File(new File((File) method3.invoke(context3, objArr3), strXd), str);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        File[] fileArrListFiles = file.listFiles();
                        if (fileArrListFiles == null) {
                            fileArrListFiles = new File[0];
                        }
                        CollectionsKt.addAll(arrayList2, fileArrListFiles);
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
                for (File file2 : arrayList2) {
                    AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, Jg.Wd("qE/\u0016\u000f* \u0019~qq!>\u0010r\\$\u0004sc--", (short) (C1607wl.Xd() ^ 25491), (short) (C1607wl.Xd() ^ 32527)) + file2.getName(), false, 4, null);
                    AFc1uSDK aFc1uSDKAFAdRevenueData = AFAdRevenueData(file2);
                    if (aFc1uSDKAFAdRevenueData != null) {
                        arrayList.add(aFc1uSDKAFAdRevenueData);
                    }
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (Exception e5) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
            Exception exc = e5;
            short sXd = (short) (OY.Xd() ^ 13398);
            short sXd2 = (short) (OY.Xd() ^ 18177);
            int[] iArr = new int["{\u0002-KH9<Co\u0010\b\fR\u0016e#\u001bYs(\u0005(L\u0014\u007fb\u0004O\u0011".length()];
            QB qb = new QB("{\u0002-KH9<Co\u0010\b\fR\u0016e#\u001bYs(\u0005(L\u0014\u007fb\u0004O\u0011");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                i2++;
            }
            AFh1ySDK.e$default(aFLogger, aFg1cSDK, new String(iArr, 0, i2), exc, false, false, false, false, 120, null);
        }
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, C1626yg.Ud(".\u00188KNe", (short) (C1580rY.Xd() ^ (-17219)), (short) (C1580rY.Xd() ^ (-13789))) + arrayList.size() + Ig.wd("A6`\u0004\b8\u00156:NZ\u0003DVY\u007f", (short) (C1633zX.Xd() ^ (-3966))), false, 4, null);
        return arrayList;
    }

    @Override // com.appsflyer.internal.AFc1tSDK
    public final String getMediationNetwork(AFc1uSDK aFc1uSDK) throws Throwable {
        File file;
        String str;
        List listSortedWith;
        List<File> listTake;
        short sXd = (short) (FB.Xd() ^ 13508);
        int[] iArr = new int["`\u001eL\u007f\u0014L\u0010\u0017:=Qy-,".length()];
        QB qb = new QB("`\u001eL\u007f\u0014L\u0010\u0017:=Qy-,");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        String str2 = new String(iArr, 0, i2);
        String strQd = C1561oA.Qd("Ursws-{\u0002o{nsu|r#hpr\u001frvl`\u001a", (short) (Od.Xd() ^ (-4527)));
        String strZd = C1593ug.zd("e\u0005\b\u000e\fG\u001b\u000f\u001c!\u0012!#iP\u0016\"\"\u001aaV\u001b\u001a\u001d#!\b#8y`", (short) (FB.Xd() ^ 25250), (short) (FB.Xd() ^ 37));
        String strOd = C1561oA.od("Lijnnrj\"sepsboo\u001apak^\u0015IE>+\u0010", (short) (C1607wl.Xd() ^ 2396));
        Intrinsics.checkNotNullParameter(aFc1uSDK, "");
        try {
            AFe1pSDK aFe1pSDK = aFc1uSDK.AFAdRevenueData;
            Intrinsics.checkNotNullExpressionValue(aFe1pSDK, "");
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.checkNotNull(context);
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Kd("\b\u0016\r\u001c\u001a\u0015\u0011[\u0012\u001f\u001f&\u0018\")cy''. 41", (short) (Od.Xd() ^ (-5822)))).getMethod(Wg.Zd("\u0003F| ;m0.7-\u001e", (short) (OY.Xd() ^ 5570), (short) (OY.Xd() ^ 31490)), new Class[0]);
            try {
                method.setAccessible(true);
                File file2 = new File(new File((File) method.invoke(context, objArr), str2), AFAdRevenueData(aFe1pSDK));
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, strOd + aFc1uSDK.getRevenue, false, 4, null);
                String strValueOf = String.valueOf(System.currentTimeMillis());
                file = new File(file2, strValueOf);
                try {
                    file.createNewFile();
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file.getPath(), true), Charset.defaultCharset());
                    try {
                        OutputStreamWriter outputStreamWriter2 = outputStreamWriter;
                        outputStreamWriter2.write(C1561oA.Xd("}m{}t{{K", (short) (C1499aX.Xd() ^ (-22455))));
                        outputStreamWriter2.write(aFc1uSDK.getCurrencyIso4217Code);
                        outputStreamWriter2.write(10);
                        short sXd2 = (short) (FB.Xd() ^ 30383);
                        int[] iArr2 = new int["&\"\u001bj".length()];
                        QB qb2 = new QB("&\"\u001bj");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK((sXd2 ^ i3) + xuXd2.CK(iKK2));
                            i3++;
                        }
                        outputStreamWriter2.write(new String(iArr2, 0, i3));
                        outputStreamWriter2.write(aFc1uSDK.getRevenue);
                        outputStreamWriter2.write(10);
                        outputStreamWriter2.write(Qg.kd("b^p\\7", (short) (OY.Xd() ^ 26699), (short) (OY.Xd() ^ 20807)));
                        Object[] objArr2 = {aFc1uSDK.getMediationNetwork(), 2};
                        Method declaredMethod = Class.forName(hg.Vd("MYN[WPJ\u0013YWKM\u000e!?PA\u0011\u000e", (short) (ZN.Xd() ^ 29224), (short) (ZN.Xd() ^ 19659))).getDeclaredMethod(C1561oA.ud("y\u0002u\u0001ttb|_\u007f|rvn", (short) (C1633zX.Xd() ^ (-7746))), byte[].class, Integer.TYPE);
                        try {
                            declaredMethod.setAccessible(true);
                            outputStreamWriter2.write((String) declaredMethod.invoke(null, objArr2));
                            outputStreamWriter2.write(10);
                            AFe1pSDK aFe1pSDK2 = aFc1uSDK.AFAdRevenueData;
                            outputStreamWriter2.write(C1561oA.yd("(.&\u001ct", (short) (C1607wl.Xd() ^ 7746)));
                            outputStreamWriter2.write(aFe1pSDK2.name());
                            outputStreamWriter2.write(10);
                            Map<String, String> map = aFc1uSDK.getMonetizationNetwork;
                            if (map != null && !map.isEmpty()) {
                                outputStreamWriter2.write(C1561oA.Yd("\u000e\f\t\r\u000f\u001d\u001fi", (short) (C1633zX.Xd() ^ (-7260))));
                                Map<String, String> map2 = aFc1uSDK.getMonetizationNetwork;
                                Intrinsics.checkNotNull(map2, "");
                                String string = new JSONObject(map2).toString();
                                Intrinsics.checkNotNullExpressionValue(string, "");
                                byte[] bytes = string.getBytes(Charsets.UTF_8);
                                Intrinsics.checkNotNullExpressionValue(bytes, "");
                                Class<?> cls = Class.forName(Xg.qd("iwn}{vr=\u0006\u0006{\u007fBWw\u000b}ON", (short) (ZN.Xd() ^ 25683), (short) (ZN.Xd() ^ 30384)));
                                Class<?>[] clsArr = {byte[].class, Integer.TYPE};
                                Object[] objArr3 = {bytes, 2};
                                short sXd3 = (short) (FB.Xd() ^ 30453);
                                short sXd4 = (short) (FB.Xd() ^ 18145);
                                int[] iArr3 = new int["_c[jrVHg]ac\\lh".length()];
                                QB qb3 = new QB("_c[jrVHg]ac\\lh");
                                int i4 = 0;
                                while (qb3.YK()) {
                                    int iKK3 = qb3.KK();
                                    Xu xuXd3 = Xu.Xd(iKK3);
                                    iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((i4 * sXd4) ^ sXd3));
                                    i4++;
                                }
                                Method declaredMethod2 = cls.getDeclaredMethod(new String(iArr3, 0, i4), clsArr);
                                try {
                                    declaredMethod2.setAccessible(true);
                                    outputStreamWriter2.write((String) declaredMethod2.invoke(null, objArr3));
                                    outputStreamWriter2.write(10);
                                } catch (InvocationTargetException e2) {
                                    throw e2.getCause();
                                }
                            }
                            outputStreamWriter2.flush();
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(outputStreamWriter, null);
                            AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, strZd + strValueOf, false, 4, null);
                            AFe1pSDK aFe1pSDK3 = aFc1uSDK.AFAdRevenueData;
                            Intrinsics.checkNotNullExpressionValue(aFe1pSDK3, "");
                            AFc1sSDK mediationNetwork = getMediationNetwork(aFe1pSDK3);
                            Integer numValueOf = mediationNetwork != null ? Integer.valueOf(mediationNetwork.getMonetizationNetwork) : null;
                            if (numValueOf != null) {
                                int iIntValue = numValueOf.intValue();
                                Map<String, Integer> map3 = this.getMonetizationNetwork;
                                AFc1sSDK mediationNetwork2 = getMediationNetwork(aFe1pSDK3);
                                if (mediationNetwork2 == null || (str = mediationNetwork2.AFAdRevenueData) == null) {
                                    throw new UnsupportedOperationException(C1561oA.od("\u000e+,0,e)3b004^12,+)+,V*\u001d\u001d&Q%)\u001f\u0013L\u001b\u0011I\u000e\u001e\f\u0014\u0019\u0017", (short) (OY.Xd() ^ 11006)));
                                }
                                Integer num = map3.get(str);
                                int iIntValue2 = num != null ? num.intValue() : 0;
                                if (iIntValue2 >= iIntValue) {
                                    int i5 = (iIntValue2 + 1) - iIntValue;
                                    AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, strQd + aFe1pSDK3 + ZO.xd("QFb0<=C\u0014\u0016\u0006w", (short) (OY.Xd() ^ 15443), (short) (OY.Xd() ^ 32289)) + i5 + C1626yg.Ud("U\u001ae\u001bE\u0001.\u0002", (short) (OY.Xd() ^ 5760), (short) (OY.Xd() ^ 15239)), false, 4, null);
                                    Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                                    Intrinsics.checkNotNull(context2);
                                    Class<?> cls2 = Class.forName(Ig.wd("\u0004Hn\u001a\u000eK07>[^\u0001G@\\1*f\u000bv)eE", (short) (C1580rY.Xd() ^ (-31823))));
                                    Class<?>[] clsArr2 = new Class[0];
                                    Object[] objArr4 = new Object[0];
                                    short sXd5 = (short) (OY.Xd() ^ 30018);
                                    int[] iArr4 = new int["\u0019oN~{#Fv}\u0016#".length()];
                                    QB qb4 = new QB("\u0019oN~{#Fv}\u0016#");
                                    int i6 = 0;
                                    while (qb4.YK()) {
                                        int iKK4 = qb4.KK();
                                        Xu xuXd4 = Xu.Xd(iKK4);
                                        iArr4[i6] = xuXd4.fK((C1561oA.Xd[i6 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + i6)) + xuXd4.CK(iKK4));
                                        i6++;
                                    }
                                    Method method2 = cls2.getMethod(new String(iArr4, 0, i6), clsArr2);
                                    try {
                                        method2.setAccessible(true);
                                        File file3 = new File(new File((File) method2.invoke(context2, objArr4), str2), AFAdRevenueData(aFe1pSDK3));
                                        if (!file3.exists()) {
                                            file3.mkdirs();
                                        }
                                        File[] fileArrListFiles = file3.listFiles();
                                        if (fileArrListFiles != null && (listSortedWith = ArraysKt.sortedWith(fileArrListFiles, new Comparator() { // from class: com.appsflyer.internal.AFc1vSDK.4
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // java.util.Comparator
                                            public final int compare(T t2, T t3) {
                                                return ComparisonsKt.compareValues(((File) t2).getName(), ((File) t3).getName());
                                            }
                                        })) != null && (listTake = CollectionsKt.take(listSortedWith, i5)) != null) {
                                            for (File file4 : listTake) {
                                                file4.delete();
                                                AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, C1561oA.Qd(".KLPL\u0006JRWTZ\u007f", (short) (OY.Xd() ^ 537)) + file4.getName() + C1593ug.zd("N\"\u0016\u001f\"*\u001a\u001a", (short) (C1580rY.Xd() ^ (-12662)), (short) (C1580rY.Xd() ^ (-17612))), false, 4, null);
                                            }
                                        }
                                    } catch (InvocationTargetException e3) {
                                        throw e3.getCause();
                                    }
                                }
                                getMonetizationNetwork();
                            }
                            return strValueOf;
                        } catch (InvocationTargetException e4) {
                            throw e4.getCause();
                        }
                    } finally {
                    }
                } catch (Exception e5) {
                    e = e5;
                    if (file != null) {
                        file.delete();
                    }
                    AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, C1561oA.Kd("`\u000e\u0015\r\u0006B\u0012\u0014\u001aF\u000b\n\r\u0013\u0011L \u0014!&\u0017&(", (short) (C1633zX.Xd() ^ (-1725))), e, false, false, false, false, 120, null);
                    return null;
                }
            } catch (InvocationTargetException e6) {
                throw e6.getCause();
            }
        } catch (Exception e7) {
            e = e7;
            file = null;
        }
    }

    @Override // com.appsflyer.internal.AFc1tSDK
    public final void getMediationNetwork() throws Throwable {
        String strZd = Wg.Zd("/~?Kr\u001cIo1Ph\u001dFe\u0013:", (short) (OY.Xd() ^ 8361), (short) (OY.Xd() ^ 30526));
        try {
            int revenue = this.getMediationNetwork.getRevenue(strZd, -1);
            short sXd = (short) (Od.Xd() ^ (-5041));
            int[] iArr = new int["MS`t\u0002\u0007w\u0007\tXwz\u0001~".length()];
            QB qb = new QB("MS`t\u0002\u0007w\u0007\tXwz\u0001~");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                i2++;
            }
            String str = new String(iArr, 0, i2);
            if (revenue == 2) {
                Context context = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.checkNotNull(context);
                short sXd2 = (short) (FB.Xd() ^ 3779);
                int[] iArr2 = new int[",8-:6/)q&1/4$,1i\u001eIGL<NI".length()];
                QB qb2 = new QB(",8-:6/)q&1/4$,1i\u001eIGL<NI");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK((sXd2 ^ i3) + xuXd2.CK(iKK2));
                    i3++;
                }
                Object[] objArr = new Object[0];
                Method method = Class.forName(new String(iArr2, 0, i3)).getMethod(Qg.kd(".+9\n,.&3\u0003'/", (short) (C1633zX.Xd() ^ (-2804)), (short) (C1633zX.Xd() ^ (-27515))), new Class[0]);
                try {
                    method.setAccessible(true);
                    if (!new File((File) method.invoke(context, objArr), str).exists()) {
                        Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                        Intrinsics.checkNotNull(context2);
                        Object[] objArr2 = new Object[0];
                        Method method2 = Class.forName(hg.Vd("\f\u0018\r\u001a\u0016\u000f\tQ\u0006\u0011\u000f\u0014\u0004\f\u0011I]\t\u0007\f{\u000e\t", (short) (C1607wl.Xd() ^ 16598), (short) (C1607wl.Xd() ^ 1580))).getMethod(C1561oA.ud("YVd5WYQ^.RZ", (short) (C1499aX.Xd() ^ (-5303))), new Class[0]);
                        try {
                            method2.setAccessible(true);
                            new File((File) method2.invoke(context2, objArr2), str).mkdir();
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } else {
                this.getMediationNetwork.getMediationNetwork(strZd, 2);
                Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.checkNotNull(context3);
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(C1561oA.yd("`napje](ZgcjXbe 2_[bPd]", (short) (ZN.Xd() ^ 16014))).getMethod(C1561oA.Yd("|{\f^\u0003\u0007\u0001\u0010a\b\u0012", (short) (C1633zX.Xd() ^ (-29668))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    if (new File((File) method3.invoke(context3, objArr3), str).exists()) {
                        Context context4 = this.AFAdRevenueData.getMonetizationNetwork;
                        Intrinsics.checkNotNull(context4);
                        Object[] objArr4 = new Object[0];
                        Method method4 = Class.forName(Xg.qd("\u0003\u0011\b\u0017\u0015\u0010\fV\r\u001a\u001a!\u0013\u001d$^t\"\")\u001b/,", (short) (ZN.Xd() ^ 18940), (short) (ZN.Xd() ^ 1943))).getMethod(Jg.Wd("k5\u0019wp@\u000fh\u000e@\u001f", (short) (OY.Xd() ^ 14664), (short) (OY.Xd() ^ 30205)), new Class[0]);
                        try {
                            method4.setAccessible(true);
                            FilesKt.deleteRecursively(new File((File) method4.invoke(context4, objArr4), str));
                            Context context5 = this.AFAdRevenueData.getMonetizationNetwork;
                            Intrinsics.checkNotNull(context5);
                            Object[] objArr5 = new Object[0];
                            Method method5 = Class.forName(ZO.xd("\u001eR\"*,vLe-3!_Sz%DxI\u000eL>\u00111", (short) (C1607wl.Xd() ^ 11620), (short) (C1607wl.Xd() ^ 17906))).getMethod(C1626yg.Ud("\r0f[\u0013F\r/>\u001b2", (short) (C1607wl.Xd() ^ 23639), (short) (C1607wl.Xd() ^ 25597)), new Class[0]);
                            try {
                                method5.setAccessible(true);
                                new File((File) method5.invoke(context5, objArr5), str).mkdir();
                            } catch (InvocationTargetException e4) {
                                throw e4.getCause();
                            }
                        } catch (InvocationTargetException e5) {
                            throw e5.getCause();
                        }
                    }
                } catch (InvocationTargetException e6) {
                    throw e6.getCause();
                }
            }
            getMonetizationNetwork();
        } catch (Exception e7) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, Ig.wd("F)!s#2\u0019)P*w\u001dLWxX\t'bY", (short) (C1607wl.Xd() ^ 22306)), e7, false, false, false, false, 120, null);
        }
    }

    @Override // com.appsflyer.internal.AFc1tSDK
    public final void getRevenue() throws Throwable {
        String strOd = EO.Od("l'W\b\u000fH\n\u00126F\\\u000378", (short) (OY.Xd() ^ 383));
        try {
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.checkNotNull(context);
            short sXd = (short) (FB.Xd() ^ 13474);
            int[] iArr = new int["\u0005\u0011\u0006\u0013\u000f\b\u0002J~\n\b\r|\u0005\nBV\u0002\u007f\u0005t\u0007\u0002".length()];
            QB qb = new QB("\u0005\u0011\u0006\u0013\u000f\b\u0002J~\n\b\r|\u0005\nBV\u0002\u007f\u0005t\u0007\u0002");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1593ug.zd("\r\f\u001cn\u0013\u0017\u0011 q\u0018\"", (short) (C1633zX.Xd() ^ (-6328)), (short) (C1633zX.Xd() ^ (-11688))), new Class[0]);
            try {
                method.setAccessible(true);
                if (!new File((File) method.invoke(context, objArr), strOd).exists()) {
                    Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                    Intrinsics.checkNotNull(context2);
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(C1561oA.od("`lanjc]&ZechX`e\u001e2][`Pb]", (short) (C1607wl.Xd() ^ 19800))).getMethod(C1561oA.Kd("ts\u0004Vz~x\bY\u007f\n", (short) (ZN.Xd() ^ 25341)), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        new File((File) method2.invoke(context2, objArr2), strOd).mkdir();
                        return;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                Iterator<T> it = this.getRevenue.getMediationNetwork.iterator();
                while (it.hasNext()) {
                    String str = ((AFc1sSDK) it.next()).AFAdRevenueData;
                    Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
                    Intrinsics.checkNotNull(context3);
                    short sXd2 = (short) (ZN.Xd() ^ 3623);
                    short sXd3 = (short) (ZN.Xd() ^ 23978);
                    int[] iArr2 = new int["(9\u0011_.MFs{Giq2\u001eg@)W7~~us".length()];
                    QB qb2 = new QB("(9\u0011_.MFs{Giq2\u001eg@)W7~~us");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                        i3++;
                    }
                    Class<?> cls = Class.forName(new String(iArr2, 0, i3));
                    Object[] objArr3 = new Object[0];
                    Method method3 = cls.getMethod(C1561oA.Xd("('7\n.2,;\r3=", (short) (C1499aX.Xd() ^ (-1515))), new Class[0]);
                    try {
                        method3.setAccessible(true);
                        File[] fileArrListFiles = new File(new File((File) method3.invoke(context3, objArr3), strOd), str).listFiles();
                        if (fileArrListFiles != null) {
                            Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                            for (File file : fileArrListFiles) {
                                AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, Wg.vd("@h`[sC`ami#<)Nv{[P\u000bMRSWSY\u0014eWjm\\i\u0012<", (short) (OY.Xd() ^ 9156)) + file.getName(), false, 4, null);
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
                                StringBuilder sbAppend = new StringBuilder().append(Qg.kd("i\n\u0010\b\u0016\n\u000e\u0006=", (short) (OY.Xd() ^ 26819), (short) (OY.Xd() ^ 29936))).append(file.getName());
                                short sXd4 = (short) (OY.Xd() ^ 7364);
                                short sXd5 = (short) (OY.Xd() ^ 32380);
                                int[] iArr3 = new int["H\u000e\u0019\u0015\u0012C\u0006\u0003\u0004\b\u0004".length()];
                                QB qb3 = new QB("H\u000e\u0019\u0015\u0012C\u0006\u0003\u0004\b\u0004");
                                int i4 = 0;
                                while (qb3.YK()) {
                                    int iKK3 = qb3.KK();
                                    Xu xuXd3 = Xu.Xd(iKK3);
                                    iArr3[i4] = xuXd3.fK(sXd4 + i4 + xuXd3.CK(iKK3) + sXd5);
                                    i4++;
                                }
                                AFh1ySDK.i$default(aFLogger, aFg1cSDK, sbAppend.append(new String(iArr3, 0, i4)).toString(), false, 4, null);
                                file.delete();
                            }
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
                Context context4 = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.checkNotNull(context4);
                Object[] objArr4 = new Object[0];
                Method method4 = Class.forName(C1561oA.ud("R^S`\\UO\u0018LWUZJRW\u0010$OMRBTO", (short) (C1633zX.Xd() ^ (-22690)))).getMethod(C1561oA.yd("ts\u007fRrvl{Iou", (short) (FB.Xd() ^ 28797)), new Class[0]);
                try {
                    method4.setAccessible(true);
                    FilesKt.deleteRecursively(new File((File) method4.invoke(context4, objArr4), strOd));
                    getMonetizationNetwork();
                    return;
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        } catch (Exception e6) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, C1561oA.Yd("=jqib\u001fnpv#gqkhzLkntr.\u0002u\u0003\bx\b\n", (short) (FB.Xd() ^ 4919)), e6, false, false, false, false, 120, null);
        }
        AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, C1561oA.Yd("=jqib\u001fnpv#gqkhzLkntr.\u0002u\u0003\bx\b\n", (short) (FB.Xd() ^ 4919)), e6, false, false, false, false, 120, null);
    }

    @Override // com.appsflyer.internal.AFc1tSDK
    public final boolean getRevenue(String str) throws Throwable {
        if (str == null) {
            return false;
        }
        Context context = this.AFAdRevenueData.getMonetizationNetwork;
        Intrinsics.checkNotNull(context);
        Object[] objArr = new Object[0];
        Method method = Class.forName(Xg.qd("<JAPNIE\u0010FSSZLV]\u0018.[[bThe", (short) (C1607wl.Xd() ^ 13562), (short) (C1607wl.Xd() ^ 19598))).getMethod(Jg.Wd("/@z\u001c*T\u0019\u0017r\u007fs", (short) (C1499aX.Xd() ^ (-29199)), (short) (C1499aX.Xd() ^ (-17401))), new Class[0]);
        try {
            method.setAccessible(true);
            File file = (File) method.invoke(context, objArr);
            String strXd = ZO.xd("\u007f\u001fR\rEM:`w@\r6\u0013w", (short) (ZN.Xd() ^ 15046), (short) (ZN.Xd() ^ 13897));
            if (new File(file, strXd).exists()) {
                AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, EO.Od("\taV+r\u001dBjJ", (short) (C1633zX.Xd() ^ (-12147))) + str + C1561oA.Qd("\u000bP[WT\u0006HEFJF", (short) (C1607wl.Xd() ^ 16698)), false, 4, null);
                Iterator<T> it = this.getRevenue.getMediationNetwork.iterator();
                while (it.hasNext()) {
                    String str2 = ((AFc1sSDK) it.next()).AFAdRevenueData;
                    Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                    Intrinsics.checkNotNull(context2);
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(C1593ug.zd("t\u0003y\t\u0007\u0002}H~\f\f\u0013\u0005\u000f\u0016Pf\u0014\u0014\u001b\r!\u001e", (short) (C1633zX.Xd() ^ (-4537)), (short) (C1633zX.Xd() ^ (-18700)))).getMethod(C1561oA.od("khvGikcp@dl", (short) (OY.Xd() ^ 28485)), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        File file2 = new File(new File(new File((File) method2.invoke(context2, objArr2), strXd), str2), str);
                        if (file2.exists()) {
                            return getMediationNetwork(file2);
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                return true;
            }
            Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.checkNotNull(context3);
            Class<?> cls = Class.forName(C1626yg.Ud("f\r#]q_`U\rP>jVf#[\u0016\u0018SH\u0017ca", (short) (C1607wl.Xd() ^ 6268), (short) (C1607wl.Xd() ^ 22002)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr3 = new Object[0];
            short sXd = (short) (FB.Xd() ^ 30024);
            int[] iArr = new int["\u0018BAxx xw|FM".length()];
            QB qb = new QB("\u0018BAxx xw|FM");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                i2++;
            }
            Method method3 = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method3.setAccessible(true);
                new File((File) method3.invoke(context3, objArr3), strXd).mkdir();
                return true;
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }
}
