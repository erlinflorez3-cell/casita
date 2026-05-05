package com.appsflyer;

import androidx.exifinterface.media.ExifInterface;
import com.appsflyer.internal.AFc1kSDK;
import com.appsflyer.internal.AFg1cSDK;
import com.appsflyer.internal.AFh1ySDK;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import yg.InterfaceC1492Gx;

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
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00176Ȑ\u0007\":\u0012\u007f\u0007ljA0RnP.XT2\u000fy|<$a6yCQU\"}(\u0012WNuvvJ`\u000fK\u000f\u001c\u0016\u0001j2I]xk3\u00172HoEޔM\u0006މi`#5=\u001fjb?\u007f\u0005в\u001e,N\u0010\u0005{\f`\u001a\u0017H@\u001f>\u0003\u0011[\b2\u00124@f\u0006ɉ`iT;Vr&W=(\u001bipRWc>\u007fe\rtVW\u0011\u0005i6+n>{\u001aȏW\u0005\rWiHKt\u007fM\u001dhU+[M\u0002aNX.\u0016E/]\u0019urTg5Un\u0019?+}j{T\u001c6\u0010z*\u0014l\b\u001c\u0015?H\\4`kڿ\u00125z\u0003aQ\u0019#lR\u0018z\u0010:G+\u000eEC;1e\u007fck\u001f\\C\u0014\u0007#\u001dQ\f5&ƟX\u0010f%)g@z?aX=vR:_K\u007f\u001crx\u0001X\u0006`M\u000e;\u0014\u0013D\u0016SB\f=1/\u0004\u0002vK.{ݶdjYy`\\\tS|&O*7\u0010\u000bJr\u0017\u0004RjWZ\u0013}\"b\u0013\u0016\n)\u001f\u000b\u0003l%3\u001efO\u0017p\u001bQk\u0019=/\u0015> s«\u0012Y?nAJ\u001a\u0005\u001ewjvBClh\u0013j~Di\u000b\t^X(@T\u0003\u0012\u000ezrYR\u0018\u0558Cs\"J:Da\u0006#^\u001b\u001epE-\u000fml\u0001\u0012\u0015Sa&3o2\u0001!\u0003f[\u001fz\u0018|WC\u0015`P4\bVڤ\u001d([8vHE8\u0015\u0018\f\u007fuk|KZ\u0005.u\u0004}f\u001b׀=S5V!\u0015GF@\u001bEEzv\u0016U[*?z+{??v6\u007f\b\u0019wreʧNQZ00\u007f'\b1\"|\u007f(ev~U{l\u000b\n@\u0010wè]>TR\u000b\u000bg33\u001d\b\"+9]G58.wB1[fԃmq4\u0016p\u0015n\ns!DcDs\u0013UkMS8w[ECѐ(n\t_Vp@\u001dP(L\raLqh~tPM91Dk¡0\u000fvui@[\r\fSF_Xws\u0002\"|[%?O\u0004k{uc\\9QU\u000fν\u007f3t1*Fh{e\u0006!04wH:O\\z\u0005j)T8:^ \u000bqV\u001a\n\u001e\u0003\u0018F\u000e\u0016]F¡w=\\1b\u001d%\u001cV,xE\u000f%Z\u0005\r0K\u001e'Ua\t{hl/\u001241W+.3j}\n\u0017)9jl9I/\t\u0005\u0019SuCw\tf\bU8\u0006k\u001e\u0013h\u001c\u000b%Z\u0018I@\u0018%چz2d2c\r\u0017\u0002\u0005;~R|&Y\u0003\t\u001e&<8/;\u001d]\u0015\bb[N\u0015\f̢G\u001c\u0007@RSO1\u000b\u000f^\u001b[\ne1Kj\u0003\u0014U\u001c\bWI   N)4x/do\u000e\u0015\u0011$/Ɛ\u001as\u001c\u000e\u0010-[o.2FJ#v:>\u0016cg\nC\u0006\u0019]ik& nSKl4AƑlz\u0010\u0012z\u00137t\u00193~1\u0005}\u001f=^J!/]2\u0019Wj:?RN\u00051\u007fB\u0014Ӕ#8\u000e\u00137?\u0018\tv\"\u0004O\n\u0011[3yKy1^rN\u0002-\u001c\u000e\u0004XVX\u0019I^e>\u0013\u0010#\u0001ܣ[\u0010d\u001c6\t=17F\u0015~vbA\u0017Bg\u000b\u001e\u0013Og\u001d-}%G\u000f\t4IW.91\u0001FaKכ\u000fq.)\u001f'\u000bu\u00034BB7&6(\u0003ߤúTٗ\u001e+a&s\u0019\u0011[\u001c^Fy 2!\u0010!/\t7Nt\u0013ZrԡǠ3¡\u001d\u0015\t\u0017>=}<"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR\u000bFf2}B\u0001$l", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0011\b\u000b\u0013\u0014?S", "\nh]6g\u0005", "u(E", "", "2dQBZ\u0013HU\u0001~\tl(~\t", "", "/e32U<@:#\u0001", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "", "Ag^B_++S!\t\n^\u000b|\u0006?g", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}p\u0004q", ";db@T.>", "", "3w", ">qX;g\u0014>a'z|^", ">qX;g\u001bA`#\u0011v[3|", "Ag^B_++S$\t\bm\u001b\u0007hBM{1wB\u0001$", "/e4?e6K:#\u0001", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u00190`)a\u0006", "3qa<e\u0013HU\u0001~\tl(~\t", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~\\", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u00190/%", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u00190`w\u000f", "/e4?e6K:#\u0001[h9\\\u001c-M{1wB\u0001$\u0001Pv\"", "2hb.U3>@\u0019\n\u0005k;\u0001\u00121", ":nV\u001aX:LO\u001b~", "/e8;Y6%]\u001b", "/e;<Z\rH`\u0017~", "@c;<Z\u0014>a'z|^", "/eA\u0011?6@", "/eE2e)Ha\u0019e\u0005`", "E`a;\\5@:#\u0001b^:\u000b\u00051e", "/eF.e5%]\u001b", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0010\bt\u0013\u0014?S", "B`V", ";rV", ExifInterface.GPS_MEASUREMENT_2D, "uKR<`u:^$\r{e@|\u0016xi\t7{M\n\u0013\u001e\u0011Kn>B##8cu\u001er\u0012?I\rBg= ^VpF\u000bl.$kj8", "Bga<j(;Z\u0019", ">qX;g\u0014LU", ExifInterface.GPS_MEASUREMENT_3D, "uKR<`u:^$\r{e@|\u0016xi\t7{M\n\u0013\u001e\u0011Kn>B##8cu\u001er\u0012?I\rBg= ^VpF\u000bl.$],C]JucN{?]\u0001]\u001bX=\t\u0002`Ayc9,\u0014K\u001d", "4na0X", "uKR<`u:^$\r{e@|\u0016xi\t7{M\n\u0013\u001e\u0011Kn>B##8cu\u001er\u0012?I\rBg= ^VpF\u000bl.$:\u0018", "7", "", "1kX2a;", "@dV6f;>`v\u0006~^5\f", "uZ;0b4\bO$\n\t_3\u0011\t</\u00041\u000b@\u000e \u0013N9i\u001dypIG\\\u0006\r1\u0007", "Cma2Z0Lb\u0019\fXe0|\u0012>", "D", ExifInterface.LONGITUDE_EAST, "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012#Y\u000b1;k\u0016\u0004", "5dc\u0010h9KS\"|\u000fB:\u0007W{1Q\u0006\u0006?\u0001", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "", "5dc\u001aX+BO(\u0003\u0005g\u0015|\u0018Ao\r.", "\u001anV\u0019X=>Z"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AFLogger extends AFh1ySDK {
    public static final AFLogger INSTANCE = new AFLogger();
    private static final Lazy getMediationNetwork = LazyKt.lazy(AnonymousClass7.getRevenue);
    private static final Lazy getCurrencyIso4217Code = LazyKt.lazy(AnonymousClass5.AFAdRevenueData);

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d<K!&˛\bDRc|\u0004G\u0006>\fFB-\"\\\u0016\u0006\u0006~jgӄ\u000bm߬2TY+\u001dm"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0011\b\u000b\u0013\u0014?S", ">/", "", "\u000fE01E,OS\"\u000fz=(\f\u0005", "uKR<`u:^$\r{e@|\u0016xi\t7{M\n\u0013\u001e\u0011Kn?B9#8cuz^"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function1<AFh1ySDK, Unit> {
        private /* synthetic */ boolean $AFAdRevenueData;
        private /* synthetic */ String $getCurrencyIso4217Code;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, boolean z2) {
            super(1);
            str = str;
            z = z2;
        }

        public final void AFAdRevenueData(AFh1ySDK aFh1ySDK) {
            Intrinsics.checkNotNullParameter(aFh1ySDK, "");
            aFh1ySDK.i(aFg1cSDK, str, z);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFh1ySDK aFh1ySDK) {
            AFAdRevenueData(aFh1ySDK);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$10 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d<K!&˛\bDRc|\u0004G\u0006>\fFB-\"\\\u0016\u0006\u0006~jgӄ\u000bm߬2TY+\u001dm"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0011\b\u000b\u0013\u0014?S", ">/", "", "5dc\u001aX+BO(\u0003\u0005g\u0015|\u0018Ao\r.", "uKR<`u:^$\r{e@|\u0016xi\t7{M\n\u0013\u001e\u0011Kn?B9#8cuz^"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass10 extends Lambda implements Function1<AFh1ySDK, Unit> {
        private /* synthetic */ String $getCurrencyIso4217Code;
        private /* synthetic */ boolean $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass10(String str, boolean z2) {
            super(1);
            str = str;
            z = z2;
        }

        public final void getMediationNetwork(AFh1ySDK aFh1ySDK) {
            Intrinsics.checkNotNullParameter(aFh1ySDK, "");
            aFh1ySDK.v(aFg1cSDK, str, z);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFh1ySDK aFh1ySDK) {
            getMediationNetwork(aFh1ySDK);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d<K!&˛\bDRc|\u0004G\u0006>\fFB-\"\\\u0016\u0006\u0006~jgӄ\u000bm߬2TY+\u001dm"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0011\b\u000b\u0013\u0014?S", ">/", "", "5dc\u0010h9KS\"|\u000fB:\u0007W{1Q\u0006\u0006?\u0001", "uKR<`u:^$\r{e@|\u0016xi\t7{M\n\u0013\u001e\u0011Kn?B9#8cuz^"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function1<AFh1ySDK, Unit> {
        private /* synthetic */ boolean $getCurrencyIso4217Code;
        private /* synthetic */ String $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, boolean z2) {
            super(1);
            str = str;
            z = z2;
        }

        public final void getCurrencyIso4217Code(AFh1ySDK aFh1ySDK) {
            Intrinsics.checkNotNullParameter(aFh1ySDK, "");
            aFh1ySDK.d(aFg1cSDK, str, z);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFh1ySDK aFh1ySDK) {
            getCurrencyIso4217Code(aFh1ySDK);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d<K!&˛\bDRc|\u0004G\u0006>\fFB-\"\\\u0016\u0006\u0006~jgӄ\u000bm߬2TY+\u001dm"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0011\b\u000b\u0013\u0014?S", ">/", "", "5dc\u001fX=>\\)~", "uKR<`u:^$\r{e@|\u0016xi\t7{M\n\u0013\u001e\u0011Kn?B9#8cuz^"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends Lambda implements Function1<AFh1ySDK, Unit> {
        private /* synthetic */ String $AFAdRevenueData;
        private /* synthetic */ boolean $areAllFieldsValid;
        private /* synthetic */ boolean $component1;
        private /* synthetic */ boolean $getMediationNetwork;
        private /* synthetic */ Throwable $getMonetizationNetwork;
        private /* synthetic */ boolean $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(String str, Throwable th, boolean z2, boolean z3, boolean z4, boolean z5) {
            super(1);
            str = str;
            th = th;
            z = z2;
            z = z3;
            z = z4;
            z = z5;
        }

        public final void getRevenue(AFh1ySDK aFh1ySDK) {
            Intrinsics.checkNotNullParameter(aFh1ySDK, "");
            aFh1ySDK.e(aFg1cSDK, str, th, z, z, z, z);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFh1ySDK aFh1ySDK) {
            getRevenue(aFh1ySDK);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$4 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d<K!&˛\bDRc|\u0004G\u0006>\fFB-\"\\\u0016\u0006\u0006~jgӄ\u000bm߬2TY+\u001dm"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0011\b\u000b\u0013\u0014?S", ">/", "", "5dc\u001ab5>b\u001d\u0014vm0\u0007\u0012\u0018e\u000f:\u0006M\u0007", "uKR<`u:^$\r{e@|\u0016xi\t7{M\n\u0013\u001e\u0011Kn?B9#8cuz^"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass4 extends Lambda implements Function1<AFh1ySDK, Unit> {
        private /* synthetic */ String $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(String str) {
            super(1);
            str = str;
        }

        public final void getMonetizationNetwork(AFh1ySDK aFh1ySDK) {
            Intrinsics.checkNotNullParameter(aFh1ySDK, "");
            aFh1ySDK.force(aFg1cSDK, str);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFh1ySDK aFh1ySDK) {
            getMonetizationNetwork(aFh1ySDK);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$5 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d<K!&i\u0006DRb\r\u0004oيv\u0014ȁF\u0001(+ w"}, d2 = {"\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012#Y\u000b1;k\u0016\u0004", "\u000fE01E,OS\"\u000fz=(\f\u0005", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`'\u0003\u000e:\u00074?fk D~\u001a,M\u0019"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass5 extends Lambda implements Function0<ExecutorService> {
        public static final AnonymousClass5 AFAdRevenueData = ;

        AnonymousClass5() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFAdRevenueData */
        public final ExecutorService invoke() {
            return AFc1kSDK.getMediationNetwork();
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$7 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<CB&i\u0016DLcz\u0004O\u0006H\u0011>D\u000f\"Z\u0011&ј-s˱4FkH<S"}, d2 = {"", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0011\b\u000b\u0013\u0014?S", "5dc\u001aX+BO(\u0003\u0005g\u0015|\u0018Ao\r.", "u(;7T=:\u001d)\u000e~euj\t>;"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass7 extends Lambda implements Function0<Set<AFh1ySDK>> {
        public static final AnonymousClass7 getRevenue = ;

        AnonymousClass7() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getMediationNetwork */
        public final Set<AFh1ySDK> invoke() {
            return new LinkedHashSet();
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$9 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d<K!&˛\bDRc|\u0004G\u0006>\fFB-\"\\\u0016\u0006\u0006~jgӄ\u000bm߬2TY+\u001dm"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0011\b\u000b\u0013\u0014?S", ">/", "", "\u000fE01E,OS\"\u000fz=(\f\u0005", "uKR<`u:^$\r{e@|\u0016xi\t7{M\n\u0013\u001e\u0011Kn?B9#8cuz^"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass9 extends Lambda implements Function1<AFh1ySDK, Unit> {
        private /* synthetic */ String $AFAdRevenueData;
        private /* synthetic */ boolean $getMonetizationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass9(String str, boolean z2) {
            super(1);
            str = str;
            z = z2;
        }

        public final void AFAdRevenueData(AFh1ySDK aFh1ySDK) {
            Intrinsics.checkNotNullParameter(aFh1ySDK, "");
            aFh1ySDK.w(aFg1cSDK, str, z);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFh1ySDK aFh1ySDK) {
            AFAdRevenueData(aFh1ySDK);
            return Unit.INSTANCE;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u000eRLc\u0003\nI\u00066\u00164ȗ}8ܥB}\u0017hz9^Ǐ\u0014GnaY*\u001fo\n5<[Rqٴ?W \u007f0\f fuk\u0007J\t\u000by\u0014\\ǥz̶0S]zc\u0016\u001d7ZqE9[v&9f|\u001f\u0005&;\u000b8\u007f\u000fi\u001a0Sxv\u0001O4\f\u0018="}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR\u000bFf2}B\u0001$U.y\u0010#v65`S", "", "", ">/", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_$D\b", ":de2_", "\u0017", "5dc\u0019X=>Z", "u(8", "\u001cN=\u0012", "\u0013QA\u001cE", "%@A\u001b<\u0015 ", "\u0017M5\u001c", "\u0012D1\":", "$DA\u000fB\u001a\u001e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);

        private final int level;

        LogLevel(int i2) {
            this.level = i2;
        }

        public final int getLevel() {
            return this.level;
        }
    }

    private AFLogger() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0007K\fGvw\u0016k]Kg\u000eY#/S\u001cb^tU;Y\"", replaceWith = @ReplaceWith(expression = "AFLogger.d()", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final void afDebugLog(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.d(AFg1cSDK.OTHER, str, true);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0007K\fGvw\u0016k]Kg\u000eY#/S\u001cb^tU;Y\"", replaceWith = @ReplaceWith(expression = "AFLogger.d()", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final void afDebugLog(String str, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.d(AFg1cSDK.OTHER, str, z2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0007K\fGvw\u0016k]Kg\u000eY#/S\u001cb^tU;Y\"", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final void afErrorLog(String str, Throwable th) {
        NullPointerException nullPointerException = th;
        String str2 = str;
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        String str3 = str2;
        if (str3 == null || StringsKt.isBlank(str3)) {
            str2 = "null";
        }
        if (nullPointerException == null) {
            nullPointerException = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str2, nullPointerException, false, false, false, false, 120, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0007K\fGvw\u0016k]Kg\u000eY#/S\u001cb^tU;Y\"", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final void afErrorLog(String str, Throwable th, boolean z2) {
        NullPointerException nullPointerException = th;
        String str2 = str;
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        String str3 = str2;
        if (str3 == null || StringsKt.isBlank(str3)) {
            str2 = "null";
        }
        if (nullPointerException == null) {
            nullPointerException = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str2, nullPointerException, false, z2, false, false, 104, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0007K\fGvw\u0016k]Kg\u000eY#/S\u001cb^tU;Y\"", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final void afErrorLog(String str, Throwable th, boolean z2, boolean z3) {
        NullPointerException nullPointerException = th;
        String str2 = str;
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        String str3 = str2;
        if (str3 == null || StringsKt.isBlank(str3)) {
            str2 = "null";
        }
        if (nullPointerException == null) {
            nullPointerException = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str2, nullPointerException, false, z2, z3, false, 72, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0007K\fGvw\u0016k]Kg\u000eY#/S\u001cb^tU;Y\"", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final void afErrorLog(String str, Throwable th, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        AFh1ySDK.e$default(INSTANCE, AFg1cSDK.OTHER, str, th, z2, z3, z4, false, 64, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0007K\fGvw\u0016k]Kg\u000eY#/S\u001cb^tU;Y\"", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final void afErrorLogForExcManagerOnly(String str, Throwable th) {
        NullPointerException nullPointerException = th;
        String str2 = str;
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        String str3 = str2;
        if (str3 == null || StringsKt.isBlank(str3)) {
            str2 = "null";
        }
        if (nullPointerException == null) {
            nullPointerException = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str2, nullPointerException, false, false, true, false, 64, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0007K\fGvw\u0016k]Kg\u000eY#/S\u001cb^tU;Y\"", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final void afErrorLogForExcManagerOnly(String str, Throwable th, boolean z2) {
        NullPointerException nullPointerException = th;
        String str2 = str;
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        String str3 = str2;
        if (str3 == null || StringsKt.isBlank(str3)) {
            str2 = "null";
        }
        if (nullPointerException == null) {
            nullPointerException = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str2, nullPointerException, false, false, !z2, false, 64, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0007K\fGvw\u0016k]Kg\u000eY#/S\u001cb^tU;Y\"", replaceWith = @ReplaceWith(expression = "AFLogger.i()", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final void afInfoLog(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.i(AFg1cSDK.OTHER, str, true);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0007K\fGvw\u0016k]Kg\u000eY#/S\u001cb^tU;Y\"", replaceWith = @ReplaceWith(expression = "AFLogger.i()", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final void afInfoLog(String str, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.i(AFg1cSDK.OTHER, str, z2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0007K\fGvw\u0016k]Kg\u000eY#/S\u001cb^tU;Y\"", replaceWith = @ReplaceWith(expression = "AFLogger.force()", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final void afLogForce(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.force(AFg1cSDK.OTHER, str);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0007K\fGvw\u0016k]Kg\u000eY#/S\u001cb^tU;Y\"", replaceWith = @ReplaceWith(expression = "AFLogger.v()", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final void afRDLog(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.v(AFg1cSDK.OTHER, str, true);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0007K\fGvw\u0016k]Kg\u000eY#/S\u001cb^tU;Y\"", replaceWith = @ReplaceWith(expression = "AFLogger.v()", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final void afVerboseLog(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.v(AFg1cSDK.OTHER, str, false);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0007K\fGvw\u0016k]Kg\u000eY#/S\u001cb^tU;Y\"", replaceWith = @ReplaceWith(expression = "AFLogger.w()", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final void afWarnLog(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AFh1ySDK.w$default(INSTANCE, AFg1cSDK.OTHER, str, false, 4, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0007K\fGvw\u0016k]Kg\u000eY#/S\u001cb^tU;Y\"", replaceWith = @ReplaceWith(expression = "AFLogger.w()", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final void afWarnLog(String str, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.w(AFg1cSDK.OTHER, str, z2);
    }

    public static final void getCurrencyIso4217Code(AFh1ySDK[] aFh1ySDKArr) {
        Intrinsics.checkNotNullParameter(aFh1ySDKArr, "");
        CollectionsKt.addAll((Set) getMediationNetwork.getValue(), aFh1ySDKArr);
    }

    public static final void getMediationNetwork(AFh1ySDK[] aFh1ySDKArr) {
        Intrinsics.checkNotNullParameter(aFh1ySDKArr, "");
        ((Set) getMediationNetwork.getValue()).removeAll(ArraysKt.toSet(aFh1ySDKArr));
    }

    public static final void getMonetizationNetwork(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator it = ((Set) getMediationNetwork.getValue()).iterator();
        while (it.hasNext()) {
            function1.invoke((AFh1ySDK) it.next());
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void d(AFg1cSDK aFg1cSDK, String str, boolean z2) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFh1ySDK, Unit>() { // from class: com.appsflyer.AFLogger.2
            private /* synthetic */ boolean $getCurrencyIso4217Code;
            private /* synthetic */ String $getRevenue;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(String str2, boolean z22) {
                super(1);
                str = str2;
                z = z22;
            }

            public final void getCurrencyIso4217Code(AFh1ySDK aFh1ySDK) {
                Intrinsics.checkNotNullParameter(aFh1ySDK, "");
                aFh1ySDK.d(aFg1cSDK, str, z);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFh1ySDK aFh1ySDK) {
                getCurrencyIso4217Code(aFh1ySDK);
                return Unit.INSTANCE;
            }
        }));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFh1ySDK, Unit>() { // from class: com.appsflyer.AFLogger.3
            private /* synthetic */ String $AFAdRevenueData;
            private /* synthetic */ boolean $areAllFieldsValid;
            private /* synthetic */ boolean $component1;
            private /* synthetic */ boolean $getMediationNetwork;
            private /* synthetic */ Throwable $getMonetizationNetwork;
            private /* synthetic */ boolean $getRevenue;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(String str2, Throwable th2, boolean z22, boolean z32, boolean z42, boolean z52) {
                super(1);
                str = str2;
                th = th2;
                z = z22;
                z = z32;
                z = z42;
                z = z52;
            }

            public final void getRevenue(AFh1ySDK aFh1ySDK) {
                Intrinsics.checkNotNullParameter(aFh1ySDK, "");
                aFh1ySDK.e(aFg1cSDK, str, th, z, z, z, z);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFh1ySDK aFh1ySDK) {
                getRevenue(aFh1ySDK);
                return Unit.INSTANCE;
            }
        }));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void force(AFg1cSDK aFg1cSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFh1ySDK, Unit>() { // from class: com.appsflyer.AFLogger.4
            private /* synthetic */ String $getRevenue;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(String str2) {
                super(1);
                str = str2;
            }

            public final void getMonetizationNetwork(AFh1ySDK aFh1ySDK) {
                Intrinsics.checkNotNullParameter(aFh1ySDK, "");
                aFh1ySDK.force(aFg1cSDK, str);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFh1ySDK aFh1ySDK) {
                getMonetizationNetwork(aFh1ySDK);
                return Unit.INSTANCE;
            }
        }));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void i(AFg1cSDK aFg1cSDK, String str, boolean z2) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFh1ySDK, Unit>() { // from class: com.appsflyer.AFLogger.1
            private /* synthetic */ boolean $AFAdRevenueData;
            private /* synthetic */ String $getCurrencyIso4217Code;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String str2, boolean z22) {
                super(1);
                str = str2;
                z = z22;
            }

            public final void AFAdRevenueData(AFh1ySDK aFh1ySDK) {
                Intrinsics.checkNotNullParameter(aFh1ySDK, "");
                aFh1ySDK.i(aFg1cSDK, str, z);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFh1ySDK aFh1ySDK) {
                AFAdRevenueData(aFh1ySDK);
                return Unit.INSTANCE;
            }
        }));
    }

    public final void registerClient(final AFh1ySDK... aFh1ySDKArr) {
        Intrinsics.checkNotNullParameter(aFh1ySDKArr, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new Runnable() { // from class: com.appsflyer.AFLogger$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AFLogger.getCurrencyIso4217Code(aFh1ySDKArr);
            }
        });
    }

    public final void unregisterClient(final AFh1ySDK... aFh1ySDKArr) {
        Intrinsics.checkNotNullParameter(aFh1ySDKArr, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new Runnable() { // from class: com.appsflyer.AFLogger$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AFLogger.getMediationNetwork(aFh1ySDKArr);
            }
        });
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void v(AFg1cSDK aFg1cSDK, String str, boolean z2) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFh1ySDK, Unit>() { // from class: com.appsflyer.AFLogger.10
            private /* synthetic */ String $getCurrencyIso4217Code;
            private /* synthetic */ boolean $getRevenue;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass10(String str2, boolean z22) {
                super(1);
                str = str2;
                z = z22;
            }

            public final void getMediationNetwork(AFh1ySDK aFh1ySDK) {
                Intrinsics.checkNotNullParameter(aFh1ySDK, "");
                aFh1ySDK.v(aFg1cSDK, str, z);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFh1ySDK aFh1ySDK) {
                getMediationNetwork(aFh1ySDK);
                return Unit.INSTANCE;
            }
        }));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void w(AFg1cSDK aFg1cSDK, String str, boolean z2) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFh1ySDK, Unit>() { // from class: com.appsflyer.AFLogger.9
            private /* synthetic */ String $AFAdRevenueData;
            private /* synthetic */ boolean $getMonetizationNetwork;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass9(String str2, boolean z22) {
                super(1);
                str = str2;
                z = z22;
            }

            public final void AFAdRevenueData(AFh1ySDK aFh1ySDK) {
                Intrinsics.checkNotNullParameter(aFh1ySDK, "");
                aFh1ySDK.w(aFg1cSDK, str, z);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFh1ySDK aFh1ySDK) {
                AFAdRevenueData(aFh1ySDK);
                return Unit.INSTANCE;
            }
        }));
    }
}
