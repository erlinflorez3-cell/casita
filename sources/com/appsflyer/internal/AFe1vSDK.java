package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.dynatrace.android.agent.Global;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;

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
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0013\u007f\u0007tvA0JlP.`\\2\u000fq}Jřy8\"CiTR|6Id^kuobZ9C\u001f\n${\u0003,wWޯa\u0014\u00156Pt\u0010F[xU9\u000fzlEv݉ķ8ѩ\t\u0005\",N\u0017\u0005\u0003\u0014^\u001a\u001dH@\u001f@\tM$Ĭ܊\u0012ĂB$\t bq\\>\u0019{kGG#1ox\u0014Ϯc4\u0015O\u0013Pb3]\to-C@e5K%*Ό\tқ_C\u000bAwH\u0013vw69S\fWdh6YƦ/S%_x/j\u0016\"r\u001a.CO\u0012M\u0007\u000e~¿|ԫ\u0011@\f\u0010\f0V@})t\u001b&3#x\n\u0006г\u0006bZ\u0002\u0001pD#"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u000e\b\b\u0013\u0014?S", "", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\f\b\u0001\u0013\u0014?S", ">/", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\f\b\u0003\u0013\u0014?S", ">0", "\nh]6g\u0005", "uKR<`u:^$\r{e@|\u0016xi\t7{M\n\u0013\u001e\u0011Kn:B/#8cu\u001ek 6\u0017?FvB\u001f\u001c|aFPg5]v4PHUu83p\t \u007f9s$n}", "", "1n\\=b5>\\(K", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "5dc\u001aX+BO(\u0003\u0005g\u0015|\u0018Ao\r.", "\u000fE01E,OS\"\u000fz=(\f\u0005", "5dc\u001fX=>\\)~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u001ab5>b\u001d\u0014vm0\u0007\u0012\u0018e\u000f:\u0006M\u0007", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\f\b\u0001\u0013\u0014?S", "5dc\u0010h9KS\"|\u000fB:\u0007W{1Q\u0006\u0006?\u0001", "", "u(I", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\f\b\u0003\u0013\u0014?S", "1n\\=b5>\\(L", "\u000fEP}l\u001a\u001d9"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AFe1vSDK {
    private static AFe1ySDK component1 = null;
    public final Lazy AFAdRevenueData;
    private final Lazy component2;
    private final AFc1qSDK getMediationNetwork;
    private final AFc1oSDK getRevenue;
    public static final AFa1ySDK AFa1ySDK = new AFa1ySDK(null);
    public static String getMonetizationNetwork = "https://%scdn-%ssettings.%s/android/v1/%s/settings";
    public static String getCurrencyIso4217Code = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";
    private static final List<String> component4 = CollectionsKt.listOf((Object[]) new String[]{"googleplay", "playstore", "googleplaystore"});

    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] AFAdRevenueData;

        static {
            int[] iArr = new int[AFe1tSDK.values().length];
            try {
                iArr[AFe1tSDK.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1tSDK.API.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFe1tSDK.RC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AFAdRevenueData = iArr;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006>)6B\r.4\u0012}\rnjO0LeN/Xݾ+%ӆ,4RZdxI;ڈ\u001e\u007f(\t]O8\u0006|Rr\u0011S\u0011\u0016\u0016'mZK\f}4ܐ\u0011̓FyG5SsK>xv<\u000b.9rL\b\u000f\u0019\u001aXKFz9G\"Ð\u001cضDtBT\u0013S\u0013#b\u001aL&\u0019\u001e\u000bj\u0005:\u0007p4ƅ9ݭ\u0007mJP-j>\u0006\u001e)T_?\u000f\r`L7v;s\u001a{ٍ\u000f\u07baVeG\u0005E~K\u0013\t)-1W\u0003"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u000e\b\b\u0013\u0014?<{\u0018iaB;\"!A", "", "\nh]6g\u0005", "u(E", "", "", "1n\\=b5>\\(M", "\u001aiPCTuNb\u001d\u0006DE0\u000b\u0018\u0005", "5dc\u001ab5>b\u001d\u0014vm0\u0007\u0012\u0018e\u000f:\u0006M\u0007", "u(;7T=:\u001d)\u000e~euc\r=tU", "\u000fE01E,OS\"\u000fz=(\f\u0005", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u001aX+BO(\u0003\u0005g\u0015|\u0018Ao\r.", "5dc\u0010h9KS\"|\u000fB:\u0007W{1Q\u0006\u0006?\u0001", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u000e\b\u000b\u0013\u0014?S", "1n\\=b5>\\(J", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u000e\b\u000b\u0013\u0014?S", "uKR<`u:^$\r{e@|\u0016xi\t7{M\n\u0013\u001e\u0011Kn<B9#8cuz^"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AFa1ySDK {
        private AFa1ySDK() {
        }

        public /* synthetic */ AFa1ySDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static List<String> getMonetizationNetwork() {
            return AFe1vSDK.component4;
        }

        public static void getMonetizationNetwork(AFe1ySDK aFe1ySDK) {
            AFe1vSDK.component1 = aFe1ySDK;
        }
    }

    public AFe1vSDK(AFc1oSDK aFc1oSDK, AFc1qSDK aFc1qSDK) {
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        this.getRevenue = aFc1oSDK;
        this.getMediationNetwork = aFc1qSDK;
        this.component2 = LazyKt.lazy(new Function0<String>() { // from class: com.appsflyer.internal.AFe1vSDK.5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                String strAFAdRevenueData = com.appsflyer.internal.AFa1ySDK.AFAdRevenueData(AFe1vSDK.this.getMediationNetwork, AFe1vSDK.this.getRevenue.component3());
                String str = strAFAdRevenueData;
                if (str != null && !StringsKt.isBlank(str)) {
                    String string = StringsKt.trim((CharSequence) str).toString();
                    AFa1ySDK aFa1ySDK = AFe1vSDK.AFa1ySDK;
                    List<String> monetizationNetwork = AFa1ySDK.getMonetizationNetwork();
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    String lowerCase = string.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    if (monetizationNetwork.contains(lowerCase)) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String str2 = String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{string}, 1));
                        Intrinsics.checkNotNullExpressionValue(str2, "");
                        AFLogger.afWarnLog(str2);
                        strAFAdRevenueData = "";
                    } else {
                        strAFAdRevenueData = Global.HYPHEN + string;
                    }
                }
                return StringsKt.trim((CharSequence) (strAFAdRevenueData != null ? strAFAdRevenueData : "")).toString();
            }
        });
        this.AFAdRevenueData = LazyKt.lazy(new Function0<String>() { // from class: com.appsflyer.internal.AFe1vSDK.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
            public final String invoke() throws Throwable {
                Context context = AFe1vSDK.this.getRevenue.getCurrencyIso4217Code.getMonetizationNetwork;
                Object[] objArr = new Object[0];
                Method method = Class.forName(Xg.qd("\u001e,#20+'q(55<.8?y\u0010==D6JG", (short) (FB.Xd() ^ 28418), (short) (FB.Xd() ^ 29455))).getMethod(Jg.Wd("v@-ta/\u0015vhBxg_5", (short) (FB.Xd() ^ 21668), (short) (FB.Xd() ^ 266)), new Class[0]);
                try {
                    method.setAccessible(true);
                    String str = (String) method.invoke(context, objArr);
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    return AFe1vSDK.getMediationNetwork(str, AFe1vSDK.AFAdRevenueData(AFe1vSDK.this));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        });
    }

    public static final /* synthetic */ String AFAdRevenueData(AFe1vSDK aFe1vSDK) {
        return (String) aFe1vSDK.component2.getValue();
    }

    public static final /* synthetic */ String getMediationNetwork(String str, String str2) throws Throwable {
        String str3 = str + str2;
        Intrinsics.checkNotNullParameter(str3, "");
        short sXd = (short) (OY.Xd() ^ 8027);
        short sXd2 = (short) (OY.Xd() ^ 23308);
        int[] iArr = new int["6\\[0_\u0005b".length()];
        QB qb = new QB("6\\[0_\u0005b");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        MessageDigest messageDigest = MessageDigest.getInstance(new String(iArr, 0, i2));
        byte[] bytes = str3.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        short sXd3 = (short) (Od.Xd() ^ (-2534));
        short sXd4 = (short) (Od.Xd() ^ (-25364));
        int[] iArr2 = new int["7JBc\u0002l\u0016\u0013t\fP\u000eS2x)6#b".length()];
        QB qb2 = new QB("7JBc\u0002l\u0016\u0013t\fP\u000eS2x)6#b");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
            i3++;
        }
        Object[] objArr = {bArrDigest, 2};
        Method declaredMethod = Class.forName(new String(iArr2, 0, i3)).getDeclaredMethod(Ig.wd(".\nJ9[\u000f4]\u0016\u0006\u0004^41", (short) (C1499aX.Xd() ^ (-26682))), byte[].class, Integer.TYPE);
        try {
            declaredMethod.setAccessible(true);
            String str4 = (String) declaredMethod.invoke(null, objArr);
            Intrinsics.checkNotNullExpressionValue(str4, "");
            String lowerCase = str4.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            String str5 = lowerCase;
            short sXd5 = (short) (C1633zX.Xd() ^ (-11380));
            int[] iArr3 = new int["*\\<;QT".length()];
            QB qb3 = new QB("*\\<;QT");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + i4)) + xuXd3.CK(iKK3));
                i4++;
            }
            String strSubstring = new Regex(new String(iArr3, 0, i4)).replace(str5, "").substring(0, 6);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            return strSubstring + C1561oA.Qd("(", (short) (Od.Xd() ^ (-9679)));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static boolean getMediationNetwork() {
        return component1 == null;
    }

    public static final void getMonetizationNetwork(AFe1ySDK aFe1ySDK) {
        AFa1ySDK.getMonetizationNetwork(aFe1ySDK);
    }

    public final String AFAdRevenueData() {
        int i2 = AFa1uSDK.AFAdRevenueData[(getMediationNetwork() ? AFe1tSDK.DEFAULT : AFe1tSDK.API).ordinal()];
        if (i2 == 1) {
            return "appsflyersdk.com";
        }
        if (i2 != 2) {
            if (i2 == 3) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        AFe1ySDK aFe1ySDK = component1;
        String str = aFe1ySDK != null ? aFe1ySDK.getCurrencyIso4217Code : null;
        return str == null ? "" : str;
    }

    public final String getCurrencyIso4217Code() {
        int i2 = AFa1uSDK.AFAdRevenueData[(getMediationNetwork() ? AFe1tSDK.DEFAULT : AFe1tSDK.API).ordinal()];
        if (i2 == 1) {
            return (String) this.AFAdRevenueData.getValue();
        }
        if (i2 != 2) {
            if (i2 == 3) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        AFe1ySDK aFe1ySDK = component1;
        String str = aFe1ySDK != null ? aFe1ySDK.getMonetizationNetwork : null;
        return str == null ? "" : str;
    }
}
