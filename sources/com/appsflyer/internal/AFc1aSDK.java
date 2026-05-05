package com.appsflyer.internal;

import com.google.firebase.messaging.Constants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
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
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLc\u0003\u0010I\u00066\f6B\r(4\u0012}\bnjG9LeN0ZS@\u000fs{:-aҜwYПs2.\"7N\u0007f\u007f/qj\u000fQ\u0010\u001e\u0016'j<Mczu\u0012=2RsM6eok9pz<\u0005.7:8(\tв\u001e,N\u0016\u0005\u0002\fc\u001a\u001bH@\u001fB\u0003\u0013[\u00062\u0014\u001c=N\u007fd\u05c8hߑ:JrfH9k\u0011wMf'\u000e4C\u05c8\fТX)\u0013\u0002o*sMEC-%\u0002\u0010MWÜC\u0005E\u007fK\u0014145;as\u00066\u001f\u0005Џ\u0019-U\u001dk\u0004nj\u0013cx\fU+\u0016ԂJח\u0012*}\r\n\u001e\r\u0018\u001c\u0019?H\\1PjF\u0012\nχ|ՂDT\n`H\u0013\tu\u0007)3\u000eK+g\u001b\u001dV8ݪ\u001b\u05ee;\u007f\r\u000f$8\u000f\u0005qmb#x\u0015IT.U\bҍBףLR\u0012[C\u0005\u0012\u00073\u00148\u0014HG./2\u0015\u0005ϗ'ھ_=+#q\u0010VZ"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\f\br\u0013\u0014?S", "", "", ">/", ">0", ">1", "", ">2", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d0\u0012\u001d", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "6`b566=S", "u(8", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "5dc\u001fX=>\\)~", "u(;<e.\bX'\t\u0004(\u0011jr\u0018O|-{>\u0010l", "5dc\u001ab5>b\u001d\u0014vm0\u0007\u0012\u0018e\u000f:\u0006M\u0007", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "BnBAe0GU", "5dc\u001aX+BO(\u0003\u0005g\u0015|\u0018Ao\r.", "\u0017", "\u000fE01E,OS\"\u000fz=(\f\u0005", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0010h9KS\"|\u000fB:\u0007W{1Q\u0006\u0006?\u0001", "\u000fEP}m\u001a\u001d9"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AFc1aSDK {
    public static final AFa1zSDK AFa1zSDK = new AFa1zSDK(null);
    final String AFAdRevenueData;
    public String getCurrencyIso4217Code;
    int getMediationNetwork;
    public String getRevenue;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0007\":!\u007f\u0007tvAӄLeV7ZS0\u000fs{J$c$wEA٭\u001b\u0014̝9O|f(uPZŲG\u0011\f\u0016\u0007ktxc\u0001u\u0012=9ruM6eqS8\u000fvf\u0019.8:B\n\u000b\u0007\u0019:J&u)Hy\u001022VohWSMŋ\u001e\u0014\fF.\nfsuYNJ\u0003\\h9S\u0007wEf'\u000e5CRϘJV-\u0018\u0005mfDNDM\u0015SX+\u0007\u0001`o\u0007MtU\u0005\u0017,m+ʁwY<e\u000e\""}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\f\br\u0013\u0014?<{\u0018iaC;\"!A", "", "\nh]6g\u0005", "u(E", "", ">/", "", "", ">0", "", "\u000fE01E,OS\"\u000fz=(\f\u0005", "uKY.i(\bZ\u0015\b|(\u0010\u0006\u0018/g\u007f5Q6g\u001c\u0013XkWCr.7#k/Dq\u001f0#\u00070", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\f\br\u0013\u0014?S", "5dc\u001aX+BO(\u0003\u0005g\u0015|\u0018Ao\r.", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'~!\u001f\u0011k\u0019G\u0005&<m}-\u0001q\u001f=MPDg;gpI_\u0005\u0003Q\u000b4L", "5dc\u001fX=>\\)~", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@okq4H7|0g\u001cdj;PQ;[z0I\""}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AFa1zSDK {
        private AFa1zSDK() {
        }

        public /* synthetic */ AFa1zSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static boolean AFAdRevenueData(Integer num, String... strArr) {
            String str;
            boolean z2 = num == null;
            int length = strArr.length;
            for (int i2 = 0; i2 < 3; i2++) {
                z2 = z2 || (str = strArr[i2]) == null || str.length() == 0;
            }
            return z2;
        }

        public static AFc1aSDK getMediationNetwork(String str) throws Throwable {
            Intrinsics.checkNotNullParameter(str, "");
            List<String> listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{"\n"}, false, 0, 6, (Object) null);
            if (listSplit$default.size() != 4) {
                return null;
            }
            String revenue = null;
            String revenue2 = null;
            String revenue3 = null;
            Integer numValueOf = null;
            for (String str2 : listSplit$default) {
                if (StringsKt.startsWith$default(str2, "label=", false, 2, (Object) null)) {
                    revenue = getRevenue(str2, "label=");
                } else if (StringsKt.startsWith$default(str2, "hashName=", false, 2, (Object) null)) {
                    revenue2 = getRevenue(str2, "hashName=");
                } else if (!StringsKt.startsWith$default(str2, "stackTrace=", false, 2, (Object) null)) {
                    if (!StringsKt.startsWith$default(str2, "c=", false, 2, (Object) null)) {
                        break;
                    }
                    String strSubstring = str2.substring(2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    numValueOf = Integer.valueOf(Integer.parseInt(StringsKt.trim((CharSequence) strSubstring).toString()));
                } else {
                    revenue3 = getRevenue(str2, "stackTrace=");
                }
            }
            if (AFAdRevenueData(numValueOf, revenue, revenue2, revenue3)) {
                return null;
            }
            Intrinsics.checkNotNull(revenue);
            Intrinsics.checkNotNull(revenue2);
            Intrinsics.checkNotNull(revenue3);
            Intrinsics.checkNotNull(numValueOf);
            return new AFc1aSDK(revenue, revenue2, revenue3, numValueOf.intValue());
        }

        private static String getRevenue(String str, String str2) throws Throwable {
            String strSubstring = str.substring(str2.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            String string = StringsKt.trim((CharSequence) strSubstring).toString();
            Intrinsics.checkNotNullParameter(string, "");
            byte[] bytes = string.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            Intrinsics.checkNotNullParameter(bytes, "");
            Object[] objArr = {bytes, 2};
            Method declaredMethod = Class.forName(C1561oA.od("R^S`\\UO\u0018^\\PR\u0013&DUF\u0016\u0013", (short) (C1580rY.Xd() ^ (-31852)))).getDeclaredMethod(C1561oA.Kd("\u0018\u001a\u0019&\u001c\u001e", (short) (C1580rY.Xd() ^ (-15900))), byte[].class, Integer.TYPE);
            try {
                declaredMethod.setAccessible(true);
                byte[] bArr = (byte[]) declaredMethod.invoke(null, objArr);
                Intrinsics.checkNotNullExpressionValue(bArr, "");
                return new String(bArr, Charsets.UTF_8);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public AFc1aSDK(String str, String str2, String str3, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.getCurrencyIso4217Code = str;
        this.AFAdRevenueData = str2;
        this.getRevenue = str3;
        this.getMediationNetwork = i2;
    }

    public /* synthetic */ AFc1aSDK(String str, String str2, String str3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i3 & 8) != 0 ? 1 : i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1aSDK)) {
            return false;
        }
        AFc1aSDK aFc1aSDK = (AFc1aSDK) obj;
        return Intrinsics.areEqual(this.getCurrencyIso4217Code, aFc1aSDK.getCurrencyIso4217Code) && Intrinsics.areEqual(this.AFAdRevenueData, aFc1aSDK.AFAdRevenueData) && Intrinsics.areEqual(this.getRevenue, aFc1aSDK.getRevenue) && this.getMediationNetwork == aFc1aSDK.getMediationNetwork;
    }

    public final String getMonetizationNetwork() throws Throwable {
        String str = this.getCurrencyIso4217Code;
        Intrinsics.checkNotNullParameter(str, "");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        short sXd = (short) (C1499aX.Xd() ^ (-1632));
        short sXd2 = (short) (C1499aX.Xd() ^ (-18571));
        int[] iArr = new int["Qzh\t\u0006\u001d\u000bm2&7.\u0010\u001aM\\M3&".length()];
        QB qb = new QB("Qzh\t\u0006\u001d\u000bm2&7.\u0010\u001aM\\M3&");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {bytes, 2};
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1561oA.Xd("fpfsik[w\\~}u{u", (short) (ZN.Xd() ^ 14238)), byte[].class, Integer.TYPE);
        try {
            declaredMethod.setAccessible(true);
            String str2 = (String) declaredMethod.invoke(null, objArr);
            String str3 = this.AFAdRevenueData;
            Intrinsics.checkNotNullParameter(str3, "");
            byte[] bytes2 = str3.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes2, "");
            Class<?> cls = Class.forName(Wg.vd("y\b~\u000e\u0004~zE\u0006\u0006{\u007f:Oo\u0003m?>", (short) (ZN.Xd() ^ 11443)));
            Class<?>[] clsArr = {byte[].class, Integer.TYPE};
            Object[] objArr2 = {bytes2, 2};
            short sXd3 = (short) (OY.Xd() ^ 12532);
            short sXd4 = (short) (OY.Xd() ^ 7891);
            int[] iArr2 = new int["@H<G;;)C&FC9=5".length()];
            QB qb2 = new QB("@H<G;;)C&FC9=5");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(((sXd3 + i3) + xuXd2.CK(iKK2)) - sXd4);
                i3++;
            }
            Method declaredMethod2 = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
            try {
                declaredMethod2.setAccessible(true);
                String str4 = (String) declaredMethod2.invoke(null, objArr2);
                String str5 = this.getRevenue;
                Intrinsics.checkNotNullParameter(str5, "");
                byte[] bytes3 = str5.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes3, "");
                Object[] objArr3 = {bytes3, 2};
                Method declaredMethod3 = Class.forName(hg.Vd("O[P]YRL\u0015[YMO\u0010#ARC\u0013\u0010", (short) (Od.Xd() ^ (-5110)), (short) (Od.Xd() ^ (-2142)))).getDeclaredMethod(C1561oA.ud("T\\P[OO=W:ZWMQI", (short) (FB.Xd() ^ 7710)), byte[].class, Integer.TYPE);
                try {
                    declaredMethod3.setAccessible(true);
                    return C1561oA.yd("C779G\u0017", (short) (C1580rY.Xd() ^ (-5582))) + str2 + C1561oA.Yd("I)#6,\u0013'4-\u0006", (short) (C1499aX.Xd() ^ (-22433))) + str4 + Xg.qd("[FH69B,K;>A\u001a", (short) (FB.Xd() ^ 17815), (short) (FB.Xd() ^ 29661)) + ((String) declaredMethod3.invoke(null, objArr3)) + Jg.Wd("tk*", (short) (C1607wl.Xd() ^ 13893), (short) (C1607wl.Xd() ^ 19144)) + this.getMediationNetwork;
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

    public final JSONObject getRevenue() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.ScionAnalytics.PARAM_LABEL, this.getCurrencyIso4217Code);
        jSONObject.put("hash_name", this.AFAdRevenueData);
        jSONObject.put("st", this.getRevenue);
        jSONObject.put("c", String.valueOf(this.getMediationNetwork));
        return jSONObject;
    }

    public final int hashCode() {
        return (((((this.getCurrencyIso4217Code.hashCode() * 31) + this.AFAdRevenueData.hashCode()) * 31) + this.getRevenue.hashCode()) * 31) + Integer.hashCode(this.getMediationNetwork);
    }

    public final String toString() {
        return "ExceptionInfo(label=" + this.getCurrencyIso4217Code + ", hashName=" + this.AFAdRevenueData + ", stackTrace=" + this.getRevenue + ", counter=" + this.getMediationNetwork + ")";
    }
}
