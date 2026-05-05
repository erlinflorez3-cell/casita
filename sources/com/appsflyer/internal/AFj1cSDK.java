package com.appsflyer.internal;

import android.content.Context;
import android.net.Uri;
import com.appsflyer.AFLogger;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
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
import yg.ZN;
import yg.ZO;

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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njG<LeN4ZS@\u000fs{:<c$\u007fLCU \u007f*\teNogtJ`\u0010YƤ$F)jZH\u000ew\u000eR&8G\u007fCAM\b=ga\u0005<\u000b @$Py3\u0004ʀ.H\u001ezCIY\u0011*0nv\u0001RUS\u0013!*\u0006l&G\u001e%m\\>`l\f@u#KoPW?_^\u0003\u0014\r\u000fZ5\u0017\u000faL1\u00077}\u001b3^\u001b\u0007\u0001a\u0006\u0003\bwK\u0011\u0001'U1\u0010s Df\r,\u0015YU=a\u00014t\u0005\u007foR'sUq[h\u000eV}A{UB\u0012\u001f\u001e'v4s\u001a/\u000e\u001cE\rr\u0002F\u0017\u0002'H\u000e\u000ey6E+F3s?)ziai\u001f\u00157D\u0013\u001b3;\u0001\u001d'\fZ\u001cv-\u001djv\u007f7\u001aXK_f\n\bC\u001e\n~z\u001a,\u001a/u\u0006_\u0002\u001fG/'MZg)iw\u0010b\\g%\u000b\u0011lawjHn17\u001aEE!\f\tJ-\tyllXZ\u0017\u0016 b$\u0016\bA&%{J?=\u0010|U1mxlu\nS5/;g\u000f\u0004\u000e\u0006?'7Cr{\u0010\u0010X?\u0018M^z\u0005\u0007l\u000ba\u001a}t(P8xp\u001e\u000e\u0014Fd\u000bA8\bw*XD1Gb[HK$Pf\u0015\t\u000e`/\u0010GZAJ\u001biRzO\u0001\u0019b~\u0017\u007fxw2C`jAOyM\u0019T[Jhb\u0003S\r\u0005s\u000ep\u007fLuv3\u0016>i\nK.\u001agWW=A\u0015//8\u0002;qdr\u0014{\u0014\u0012o\u0005\u000b'';\u00174\u0010\b\u0019vr`3h]\u0003/\"%\u000e\u001b#6\u00140\u007fo^\u0013IyS9anO\u0001\u001cq>d7+\u000be\u001eu\r}\"\u00155[D}ݷ\u0018߳\u0018/\u001d˕.u}0\u0012b=)KЄ\u0006Нg\u0016w̥мac"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`W~\u0012C@\u0005FY\u0007/'z\u001d\u001bMQErE\u001e\">", "", "7c??b=BR\u0019\f", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`Ey\u0016G\u0001.5b\r.\u0001Q\u0015\u0019ZMLo3\u001e\">", "AdaCX9\u001c]\"\u007f~`\u001c\n\u0010\u0010o\r0wO\u0010\u0017$", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`W~\u0012C@\u00135f\u000f DK 7NG=[A%urnA\u0003r;N\u0004|", "uKR<`u:^$\r{e@|\u0016xi\t7{M\n\u0013\u001e\u0011m\u0018D\u0002/>Y\u0007/E7y-8PE|8\u001d\u0015u7 \u0005m4\u0018r2RZO3pR\u007f\u0007\u0018\u001bi\u000e[4\t\f#Q3rK\u0001\r\b9Z\u0002HF\u000b\u0015\u0017\u00127Z}I7\u001aT\u0002\u0011\u0005P)u\u001c\u001dP", "5dc\u000eW\u0019>d\u0019\b\u000b^\u001c\n\u0010", "", "5dc\u000ec7LB&zxd0\u0006\u000b\u001fr\u0007", "5dc\u000ee:\u001bW \u0006~g.K", "5dc\u000ee:\u001bW \u0006~g.L", "5dc\u0011W3.` ", "5dc\u0012i,Gb'm\bZ*\u0003\r8go5\u0003", "5dc\u0013\\9Lb\u007fz\u000bg*\u007fx<l", "5dc\u0019T<GQ\u001cn\be", "3uT;g", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`Oy\r<}n5j})F7q\u000f-T;tCs", "5dc\u001aT5NO ove0{\u0005>ei1{/\u0005\u001f\u00172\u007f\u001b:y!CYm->", "5dc\u001aT5NO ove0{\u0005>em8xN~$\u001bR~\u0012F\u007f\u0010Ef{#3{\u0016\u001eZJ", "5dc\u001d_(R7\"\u000ez`9\u0001\u0018CU\r/", "5dc\u001fX->`&~\bM9x\u00075i\t*kM\b", "5dc\u001fX.Ba(~\bN9\u0004", "5dc\"e3\u001f]&Z\bl", "0h[9\\5@D\u0019\f\tb6\u0006", "5dc\"e3\u001f]&]ye\f\u000e\t8t", "2de\u0018X@", "Bh\\2f;:[$", "5dc\"e3\u001f]&^\f^5\f", "5dc\"e3\u001f]&fvg<x\u0010\u0019n\u007f\u0017\u007fH\u0001\u0002'Tm\u00118\u0005%&U\u0005$6i%2WL", "5dc\"e3\u001f]&fvg<x\u0010\u001du|6yM\u0005\"&Ky\u0017'\u000723\\y.7^\u00125QB7z8(\u001e", "5dc\"e3\u001f]&i\u0002Z@`\u0012>e\u00025\u007fO\u0015\u0004\u0017Ry\u001bKz.7", "5dc\"e3\u001f]&i\bb=x\u0007CS{1z=\u000b*", "5dc\"e3\u001f]&kyF6\u0006\r>o\r", "5dc\"e3\u001f]&kz`0\u000b\u0018/r", "5dc\"e3\u001f]&ove0{\u0005>ej8\t>\u0004\u0013%G", "5dc\"e3\u001f]&ove0{\u0005>ej8\t>\u0004\u0013%Ga\u0012Ky\u00175V`\u001c@l\u001d.Z", "5dc\"e3\u001f]&o~Z7", "5dc#T3BR\u0015\u000ezI<\n\u00072a\u000e(kM\b", "5dc#T3BR\u0015\u000ezI<\n\u00072a\u000e(mD\u0010\u001a\tGlp8\u007f$<Y\u000b\u0010Dt", "5dc#\\(I0\u001d\u0006\u0002b5~W", "5dc#\\(I0\u001d\u0006\u0002b5~X", "/o_2a+\u001bc\u001d\u0006yG<\u0005\u0006/r", "7r01E,OS\"\u000fz>=|\u0012>", "", "/o_2a+\u001c]\"\u007f~`<\n\t.C\u0003$\u0005I\u0001\u001e", "7rA2Z0Lb\u0019\fZo,\u0006\u0018", "/o_2a+)O\u0017\u0005v`,e\u00057e", "/o_2a+,W\u001bj\u000b^9\u0011s+r{0", "\u001a`]1e6BRb\bzmul\u00163$\\8\u007fG\u007f\u0017$\u001d", "\u0011n\\=T5B]\"", "!C:,c9HR\u0006~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AFj1cSDK {
    public static final String AFAdRevenueData;
    public static final String areAllFieldsValid;
    public static final String component1;
    public static final String component2;
    public static final String component3;
    public static final String component4;
    private static final String equals;
    public static final AFa1ySDK getCurrencyIso4217Code = new AFa1ySDK(null);
    public static final String getMediationNetwork;
    public static final String getMonetizationNetwork;
    private final AFc1oSDK copydefault;
    public final AFk1zSDK getRevenue;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005,2ߡx\u001d߿\u001b9^C&O4Rޚ.\u0011q{B%,6\u007fHSUH\u007fX\t&Ȣi̊rNb\rI\u0012\u0014\u001aI|:Pmx\f\u0014E6\u0019ī\u0002ݯQsE;fzD\tpD0>\u0012\u0005/\u001c`Lf͔|ŲO\u0010\u001a2FwHV]_\u0013#*\u0006l\"7\"3ɩPɇLpe<5+\u0011m\u0013`5jH|{\u000f|X}ˡxҐ\"/H9;\u001f3WS\u0019`gW\u0003mss\t?ѯiȅMw_8^\f\"\u0019{a\u001bg\u000b&\u000b\u0007\bdbʴ-յgOX\u0010.\u0003\t\u007f]N\u0012\u001b\u001e'v0c\u001e=ڤ\u0010\u07baxv[BV\u000flFP\roD/%.5a=qƠSň?\u001dV9\u0002\u0013\u001b\""}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0013\bt\u0013\u0014?<{\u0018iaB;\"!A", "", "\nh]6g\u0005", "u(E", "", "3pd._:", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0010h9KS\"|\u000fB:\u0007W{1Q\u0006\u0006?\u0001", "\u000fE01E,OS\"\u000fz=(\f\u0005", "5dc\u001ab5>b\u001d\u0014vm0\u0007\u0012\u0018e\u000f:\u0006M\u0007", "1n\\=b5>\\(M", "5dc\u001fX=>\\)~", "/qT\u000e_3\u001fW\u0019\u0006yl\u001dx\u00103d", "5dc\u001aX+BO(\u0003\u0005g\u0015|\u0018Ao\r.", "1n\\=b5>\\(L", "1n\\=b5>\\(K", "1n\\=b5>\\(J"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AFa1ySDK {
        private AFa1ySDK() {
        }

        public /* synthetic */ AFa1ySDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String str = com.appsflyer.internal.AFa1ySDK.getMediationNetwork + "/androidevent?app_id=";
        equals = str;
        getMediationNetwork = "https://%sattr.%s/api/v" + str;
        AFAdRevenueData = "https://%sadrevenue.%s/api/v2/generic/v6.17.6/android?app_id=";
        getMonetizationNetwork = "https://%sconversions.%s/api/v" + str;
        areAllFieldsValid = "https://%slaunches.%s/api/v" + str;
        component4 = "https://%sinapps.%s/api/v" + str;
        component2 = "https://%sregister.%s/api/v" + str;
        component1 = "https://%svalidate.%s/api/v" + str;
        component3 = "https://%smonitorsdk.%s/api/remote-debug/v2.0?app_id=";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFj1cSDK(AFc1oSDK aFc1oSDK) {
        this(aFc1oSDK, null, 2, null);
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
    }

    private AFj1cSDK(AFc1oSDK aFc1oSDK, AFk1zSDK aFk1zSDK) {
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(aFk1zSDK, "");
        this.copydefault = aFc1oSDK;
        this.getRevenue = aFk1zSDK;
    }

    public /* synthetic */ AFj1cSDK(AFc1oSDK aFc1oSDK, AFk1ySDK aFk1ySDK, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFc1oSDK, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? new AFk1ySDK() : aFk1ySDK);
    }

    public static String getMediationNetwork() {
        return "https://privacy-sandbox.appsflyersdk.com/api/trigger";
    }

    public static String getRevenue(String str, boolean z2) {
        return str + (!z2 ? "&buildnumber=6.17.6" : "");
    }

    public final String getMediationNetwork(String str) throws Throwable {
        Context context = this.copydefault.getCurrencyIso4217Code.getMonetizationNetwork;
        Class<?> cls = Class.forName(Wg.vd("Zh[jlg_*Ta]dZdg\",YU\\Rf_", (short) (Od.Xd() ^ (-15312))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (ZN.Xd() ^ 29313);
        short sXd2 = (short) (ZN.Xd() ^ 28815);
        int[] iArr = new int["yv\u0005_opwlqnVhsj".length()];
        QB qb = new QB("yv\u0005_opwlqnVhsj");
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
            return str + ((String) method.invoke(context, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final String getMediationNetwork(String str, boolean z2) {
        if (z2) {
            return str;
        }
        String strComponent3 = this.copydefault.component3();
        String str2 = strComponent3 != null ? "&channel=" + strComponent3 : null;
        if (str2 == null) {
            str2 = "";
        }
        return str + str2;
    }

    public final String getMonetizationNetwork(String str, String str2) throws Throwable {
        Context context = this.copydefault.getCurrencyIso4217Code.getMonetizationNetwork;
        short sXd = (short) (C1580rY.Xd() ^ (-30763));
        short sXd2 = (short) (C1580rY.Xd() ^ (-20320));
        int[] iArr = new int["Zf[hd]W T_]bRZ_\u0018,WUZJ\\W".length()];
        QB qb = new QB("Zf[hd]W T_]bRZ_\u0018,WUZJ\\W");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.ud("\u007f|\u000beuv}rwt\\nyp", (short) (C1607wl.Xd() ^ 1638)), new Class[0]);
        try {
            method.setAccessible(true);
            String str3 = (String) method.invoke(context, objArr);
            Intrinsics.checkNotNullExpressionValue(str3, "");
            String strComponent3 = this.copydefault.component3();
            String str4 = strComponent3;
            if (str4 != null && !StringsKt.isBlank(str4)) {
                String string = StringsKt.trim((CharSequence) str4).toString();
                short sXd3 = (short) (OY.Xd() ^ 22671);
                int[] iArr2 = new int["6".length()];
                QB qb2 = new QB("6");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 ^ i3));
                    i3++;
                }
                strComponent3 = new String(iArr2, 0, i3) + string;
            }
            if (strComponent3 == null) {
                strComponent3 = "";
            }
            Uri.Builder builderAppendPath = Uri.parse(this.getRevenue.getMediationNetwork(C1561oA.Yd("bopmq9/0'vhqyks7/~;\u0004?=@@s\u0002x\b\u0006\u0001|H", (short) (C1580rY.Xd() ^ (-24718))))).buildUpon().appendPath(str3 + StringsKt.trim((CharSequence) strComponent3).toString());
            Intrinsics.checkNotNullExpressionValue(builderAppendPath, "");
            if (str == null || str2 == null) {
                String strWd = str == null ? Jg.Wd("T\u001a})\bb", (short) (C1580rY.Xd() ^ (-22391)), (short) (C1580rY.Xd() ^ (-9021))) : ZO.xd("C&s\tX<n{\u0014", (short) (C1607wl.Xd() ^ 23136), (short) (C1607wl.Xd() ^ 22241));
                AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, strWd.concat(C1626yg.Ud("kZy.(d\u0012MX\u0006Kc`\u0010'e\u0001TT*Vo3\u0006{,\u0017FN\u007fg6\u000e\u000e:@>vw\u0006CA]\u0010\u001a", (short) (C1580rY.Xd() ^ (-26155)), (short) (C1580rY.Xd() ^ (-7649)))), new IllegalStateException(strWd.concat(Ig.wd("}\u00182{H\u001bs9", (short) (ZN.Xd() ^ 30396)))), true, false, false, true);
            } else {
                builderAppendPath.appendQueryParameter(Xg.qd("\u001f%\u001f4+*", (short) (FB.Xd() ^ 20831), (short) (FB.Xd() ^ 764)), AFj1dSDK.getMonetizationNetwork(str2 + str, str));
            }
            String string2 = builderAppendPath.appendQueryParameter(EO.Od("\u000fY.~\u001e1n\u0010<#$", (short) (C1607wl.Xd() ^ 28848)), com.appsflyer.internal.AFa1ySDK.getMediationNetwork).build().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "");
            return string2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
