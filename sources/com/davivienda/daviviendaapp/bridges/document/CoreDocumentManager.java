package com.davivienda.daviviendaapp.bridges.document;

import com.davivienda.daviviendaapp.common.helper.CoreHelper;
import com.davivienda.daviviendaapp.common.helper.Utils;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.valid.vssh_android_core.document.CoreDocumentImp;
import com.valid.vssh_android_core.model.DocumentTypeModel;
import com.valid.vssh_android_core.model.LambdaError;
import com.valid.vssh_android_core.model.LambdaSuccess;
import com.valid.vssh_android_core.model.response.CoreErrorModelResponse;
import com.valid.vssh_android_core.model.response.CoreGenericModelResponse;
import com.valid.vssh_android_core.model.response.DocumentTypeResponse;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
import yg.InterfaceC1492Gx;
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
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjG0L͜P.`_2şs{J$c$wDCU0}*\tUO}˧\u001fJ\t\n\u0004\u001a\u0016\u001a\u0007jDI\u0004yٕ\u0016\u000f@D8uAR\b=gf%<\u000b @)Py3\tJ0V\u0019\u000f|YJ:\u001c`F~Ej\u000fc\u0004H\u001c6D.\r6^}MdR\u001daH<;\u0003\u0018P\u0015,(6\u000b\\%F\u0003/S\u000b*$9PO5C+\u001a\u0003W^iB\u001b? A[ؕSݳ/I{Ɏ͕\\\u0011"}, d2 = {"\u001ab^:\"+:d\u001d\u0010~^5{\u0005xd{9\u007fQ\u0005\u0017 Fk\nG\u0002n2f\u0002\u001f9m$wLM9{<\u001e\u001ew+\u0017\u0011p,-\u0001%WTN5k:nF\u0010\u0014Z\u001b$", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\ 7y4\u0003\u0011y]!\u0011b<Uv|", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$:\u0018", "1na2@(GO\u001b~\b", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)a\t'\tJ\u0005\u0016\u0011Ey\u001b<@$?W\u000e(7v%w+MHk\u0013(\u0013xi9\u0010r\u0010V\u0002|", "5dc\u0011b*N[\u0019\b\nM@\b\t", "", "/oX", "", "6dP1X9L", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "/cS6g0H\\\u0015\u0006YZ;x", ">qX;V0IO ]vm(", "1`[9U(<Y", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW\u001ar,<Vy\u001e=C", "5dc\u001bT4>", "7mXA66KS", "/o_,e,ES\u0015\rz"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class CoreDocumentManager extends ReactContextBaseJavaModule {
    private CoreDocumentImp coreManager;

    public static /* synthetic */ void $r8$lambda$O4r6jhma1Zymklh7TwQCzX9gBns(Callback callback, CoreGenericModelResponse coreGenericModelResponse) throws Throwable {
        int iXd = ZN.Xd() ^ (1960805304 ^ 1196791282);
        Class<?> cls = Class.forName(Wg.Zd("{rQ\u001d4\u001cN\u001a:\u0006t\u0017[q\u001f@^>NF\u001a/\u000b\u0016\u0006^~Y8SDF\"\u000e/\u0012_nly\\kD8_a\u0016+\u0011\u001dN\u0013s`i<fW\r*\u001au\u001fu\u0010", (short) (ZN.Xd() ^ (397475023 ^ 397456962)), (short) (ZN.Xd() ^ iXd)));
        Class<?>[] clsArr = new Class[OY.Xd() ^ (1446682233 ^ 1376884371)];
        clsArr[0] = Class.forName(C1561oA.Xd("JWV\u0018QMPSQ_`]!fZWZl'\\meaed.Dcopggjs", (short) (C1580rY.Xd() ^ (Od.Xd() ^ (-1207799169)))));
        clsArr[1] = Class.forName(Wg.vd("ivq3\u0001ltrb-rpuk_bd[fdc_W\\]aQ\u001b_bTVR\u0015VJ][WWQD\n QUE(;E9GC>%H248\u001f7F@@4:)", (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (194350147 ^ (-974958979))))));
        Object[] objArr = new Object[(1097968986 ^ 2100477876) ^ 1011028716];
        objArr[0] = callback;
        objArr[1] = coreGenericModelResponse;
        short sXd = (short) (C1499aX.Xd() ^ (915552705 ^ (-915570529)));
        short sXd2 = (short) (C1499aX.Xd() ^ (1504734191 ^ (-1504738244)));
        int[] iArr = new int["!\u001e,z%\u0018) \u0017\u001f$\u0003'\u001d\u0011N\u0016\n\u0015\t\n\u0006GS".length()];
        QB qb = new QB("!\u001e,z%\u0018) \u0017\u001f$\u0003'\u001d\u0011N\u0016\n\u0015\t\n\u0006GS");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static /* synthetic */ void $r8$lambda$VmxMic4plNum0IJNm_03l81fVuw(Callback callback, DocumentTypeResponse documentTypeResponse) throws Throwable {
        Class<?> cls = Class.forName(hg.Vd("9DA\u000162F8D619.*u+';-9+&.#\u001f\u001e,+g\u001b* \u001a\u001c\u0019&_\u0015\u001f\u0012#\u001a\u0011\u0019\u001eVj\u0016\u0018\ng\u0012\u0005\u0016\r\u0004\f\u0011h{\by~{\b", (short) (FB.Xd() ^ (FB.Xd() ^ (1256543445 ^ 352987878))), (short) (FB.Xd() ^ (C1633zX.Xd() ^ (-1951466973)))));
        Class<?>[] clsArr = new Class[1363120403 ^ 1363120401];
        clsArr[0] = Class.forName(C1561oA.ud(")41p(\"#$ ,+&g+\u001d\u0018\u0019)a\u0015$\u001a\u0014\u0016\u0013Zn\f\u0016\u0015\n\b\t\u0010", (short) (C1499aX.Xd() ^ ((225537353 ^ 2062667603) ^ (-2004936178)))));
        clsArr[1] = Class.forName(C1561oA.yd("_lk-nZfdh3|zsiadzq\u0001~qmin\u0004\b{E}\u0001vxH\u000bPDKIIIWJ\u0014+ODWPQ[bCaYO=Yhff^dW", (short) (C1580rY.Xd() ^ (C1499aX.Xd() ^ 1134262505))));
        Object[] objArr = new Object[Od.Xd() ^ (287057050 ^ 1457631437)];
        objArr[0] = callback;
        objArr[1] = documentTypeResponse;
        Method declaredMethod = cls.getDeclaredMethod(C1561oA.Yd("#\"2\u0003/$70)3:\u001bA9/n8.;142u\u0003", (short) (FB.Xd() ^ (C1607wl.Xd() ^ 1849952175))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$gRM-7eSHBvQaVh5x-rYJz0rrMWI, reason: not valid java name */
    public static /* synthetic */ void m7088$r8$lambda$gRM7eSHBvQaVh5xrYJz0rrMWI(Callback callback, CoreErrorModelResponse coreErrorModelResponse) throws Throwable {
        int iXd = C1580rY.Xd() ^ (2116846318 ^ (-1336263044));
        Class<?> cls = Class.forName(Xg.qd("{\t\bI\u0001~\u0015\t\u0017\u000b\b\u0012\t\u0007T\f\n \u0014\"\u0016\u0013\u001d\u0014\u0012\u0013#$b\u0018)!\u001d! /j\".#6/(29s\n7;/\u000f;0C<5?F 5C7>=K", (short) (ZN.Xd() ^ ((182352431 ^ 1754572606) ^ 1649071717)), (short) (ZN.Xd() ^ iXd)));
        Class<?>[] clsArr = new Class[(79077358 ^ 731173467) ^ 790777271];
        clsArr[0] = Class.forName(Jg.Wd("0+P\u0010~h\u0002r\u0018T;U\u000f\u0003l\u0019\"\"\u00025|bug\r\u0004\u007f=?o\\\u000b\u0013\n", (short) (ZN.Xd() ^ (C1607wl.Xd() ^ (818680519 ^ 1585976730))), (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (1977422399 ^ (-1146368467))))));
        clsArr[1] = Class.forName(ZO.xd("U^\\\"z@'\u0002S\u0012G?>nYV|m!`\b`rcWr\u0018t!#|we!k5Wg\u001e6\u000239#\u000b\u0001_I8cE\u001b\u0006G,K/aZ'3d\r\u0007\u001b", (short) (C1499aX.Xd() ^ ((1778865781 ^ 1272982580) ^ (-568809354))), (short) (C1499aX.Xd() ^ ((1452196342 ^ 245703514) ^ (-1479261662)))));
        Object[] objArr = new Object[OY.Xd() ^ 69929194];
        objArr[0] = callback;
        objArr[1] = coreErrorModelResponse;
        Method declaredMethod = cls.getDeclaredMethod(C1626yg.Ud("YpV\u0011\u0006o\u007f\u001btZ^Om\u001b2!\"o&v!\u000eN\n", (short) (OY.Xd() ^ (C1633zX.Xd() ^ (530178208 ^ (-1808322737)))), (short) (OY.Xd() ^ ((1090029998 ^ 286321074) ^ 1374163120))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreDocumentManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Intrinsics.checkNotNullParameter(reactApplicationContext, Ig.wd("Ce\u00105fx\rc+?Tn", (short) (ZN.Xd() ^ (FB.Xd() ^ 1609510674))));
    }

    public static /* synthetic */ void getDocumentType$default(CoreDocumentManager coreDocumentManager, String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, Callback callback, int i2, Object obj) throws Throwable {
        if ((i2 & 1) != 0) {
            str = "";
        }
        Class<?> cls = Class.forName(EO.Od("*d\u0017qY#\u0006k#D@i\u000e\u0007yP\u0002#@w%K%\u0017o_P\u001a%K;\u0012tUuA_}\u0012\u0010*\n18W![X)we>Z\u0014kru\"FXq\u0006YA\u0016", (short) (FB.Xd() ^ (1593139466 ^ 1593138444))));
        Class<?>[] clsArr = new Class[1212969716 ^ 1212969713];
        clsArr[0] = Class.forName(C1561oA.Qd("bXlV\"_S_W\u001dAa^TXP", (short) (C1580rY.Xd() ^ (Od.Xd() ^ (1342646745 ^ (-402309703))))));
        clsArr[1] = Class.forName(C1593ug.zd("CPO\u0011JFILJXYV\u001a_SPSe Uf^Z^]'L`]a_alfOdt", (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ 1951470662)), (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ 831065041))));
        clsArr[C1499aX.Xd() ^ (-1134257938)] = Class.forName(C1561oA.od(":EB\u000293451=<7x<.)*:r&5+%'$k\u000f!\u001c\u001e\u001a\u001a#\u001b\u0002\u0015#", (short) (Od.Xd() ^ (OY.Xd() ^ (-69945921)))));
        int iXd = ZN.Xd() ^ 864698099;
        short sXd = (short) (OY.Xd() ^ (Od.Xd() ^ 1207812814));
        int[] iArr = new int["FSR\u0014MILOM[\\Y\u001dbVSVh#Xia]a`*Oc`dbdoiRgw".length()];
        QB qb = new QB("FSR\u0014MILOM[\\Y\u001dbVSVh#Xia]a`*Oc`dbdoiRgw");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i3));
            i3++;
        }
        clsArr[iXd] = Class.forName(new String(iArr, 0, i3));
        int iXd2 = C1607wl.Xd() ^ 1849955294;
        int iXd3 = OY.Xd() ^ (123550338 ^ 58066096);
        int iXd4 = FB.Xd() ^ 1609510720;
        short sXd2 = (short) (OY.Xd() ^ iXd3);
        short sXd3 = (short) (OY.Xd() ^ iXd4);
        int[] iArr2 = new int["4W\twK|2Kx=W\u0003wS\u0002*_\u000f{^\n8eu..V+i\u007f/\\\u00121".length()];
        QB qb2 = new QB("4W\twK|2Kx=W\u0003wS\u0002*_\u000f{^\n8eu..V+i\u007f/\\\u00121");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK(((i4 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
            i4++;
        }
        clsArr[iXd2] = Class.forName(new String(iArr2, 0, i4));
        Object[] objArr = new Object[FB.Xd() ^ 1609527094];
        objArr[0] = str;
        objArr[1] = readableMap;
        objArr[1624279734 ^ 1624279732] = readableMap2;
        objArr[959435335 ^ 959435332] = readableMap3;
        objArr[FB.Xd() ^ (2030218011 ^ 653116460)] = callback;
        Method method = cls.getMethod(C1561oA.Xd("+*:\u000b7,?81;B#IA7", (short) (C1633zX.Xd() ^ ((1698868891 ^ 1778375897) ^ (-213717582)))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(coreDocumentManager, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static final void getDocumentType$lambda$0(Callback callback, DocumentTypeResponse documentTypeResponse) throws Throwable {
        Intrinsics.checkNotNullParameter(callback, Wg.vd("W\u0018\u0013\u001f\u001c\u0013\u000f\u0012'", (short) (C1580rY.Xd() ^ (1262715988 ^ (-1262727620)))));
        Utils utils = Utils.INSTANCE;
        Intrinsics.checkNotNull(documentTypeResponse);
        Class<?> cls = Class.forName(Qg.kd("9DA\u000162F8D619.*u+';-9+&.#\u001f\u001e,+g\u001c'$#$\"`\u001a\u0016\u001c\u001f\u0013\u001fY\u007f\u001e\u0012\u0014\u001a", (short) (C1580rY.Xd() ^ (OY.Xd() ^ (-69930134))), (short) (C1580rY.Xd() ^ (1000627310 ^ (-1000633647)))));
        Class<?>[] clsArr = {Class.forName(hg.Vd("Yda!hR\\XR\u001bb^]QGHTIVRKE?BMOA\tGH<<B\u0003F8EA?=A2y\u000f9,=4+38\u0017;1%\u0011#0,*(,\u001d", (short) (ZN.Xd() ^ ((1950654356 ^ 1555727216) ^ 687747579)), (short) (ZN.Xd() ^ (ZN.Xd() ^ 864705339))))};
        Object[] objArr = {documentTypeResponse};
        short sXd = (short) (C1607wl.Xd() ^ (ZN.Xd() ^ 864684059));
        int[] iArr = new int["qdrSernljn_LmZYZgf6`Sd[RZ_>bXL".length()];
        QB qb = new QB("qdrSernljn_LmZYZgf6`Sd[RZ_>bXL");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            callback.invoke(null, (WritableMap) method.invoke(utils, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static final void getDocumentType$lambda$1(Callback callback, CoreGenericModelResponse coreGenericModelResponse) throws Throwable {
        Intrinsics.checkNotNullParameter(callback, C1561oA.yd("/onzsjjmn", (short) (Od.Xd() ^ (C1499aX.Xd() ^ 1134236661))));
        Utils utils = Utils.INSTANCE;
        Intrinsics.checkNotNull(coreGenericModelResponse);
        Class<?> cls = Class.forName(C1561oA.Yd("'43t,*@4B63=42\u007f75K?MA>H?=>NO\u000eDQPQTT\u0015PNV[Q_\u001cDdZ^f", (short) (FB.Xd() ^ (C1633zX.Xd() ^ (-1951471937)))));
        Class<?>[] clsArr = new Class[1];
        int iXd = C1580rY.Xd() ^ (-831072834);
        int iXd2 = FB.Xd() ^ (205532025 ^ 1404006926);
        short sXd = (short) (OY.Xd() ^ iXd);
        short sXd2 = (short) (OY.Xd() ^ iXd2);
        int[] iArr = new int["^kj,uamkg2{yzphkyp\u007f}xtpu\u0003\u0007zD\u0005\b}\u007f\bJ\u0010\u0004\u0013\u0011\u0011\u0011\u0017\nSi\u0017\u001b\u000fq\u0011\u001b\u0013!\u0019\u0014~\"\u0018\u001a\"\t\u001d,***0#".length()];
        QB qb = new QB("^kj,uamkg2{yzphkyp\u007f}xtpu\u0003\u0007zD\u0005\b}\u007f\bJ\u0010\u0004\u0013\u0011\u0011\u0011\u0017\nSi\u0017\u001b\u000fq\u0011\u001b\u0013!\u0019\u0014~\"\u0018\u001a\"\t\u001d,***0#");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {coreGenericModelResponse};
        Method method = cls.getMethod(Jg.Wd("I<\u007fT5|f\r_j\u0016(S\u0012mT}\u0006A)pC9|07]", (short) (Od.Xd() ^ (C1580rY.Xd() ^ (1001450687 ^ 171561555))), (short) (Od.Xd() ^ (FB.Xd() ^ (-1609503598)))), clsArr);
        try {
            method.setAccessible(true);
            callback.invoke(null, (WritableMap) method.invoke(utils, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static final void getDocumentType$lambda$2(Callback callback, CoreErrorModelResponse coreErrorModelResponse) throws Throwable {
        Intrinsics.checkNotNullParameter(callback, ZO.xd("/<HR9s\ti!", (short) (ZN.Xd() ^ ((1799975439 ^ 1839395607) ^ 116114296)), (short) (ZN.Xd() ^ (ZN.Xd() ^ 864713128))));
        Utils utils = Utils.INSTANCE;
        Intrinsics.checkNotNull(coreErrorModelResponse);
        Class<?> cls = Class.forName(C1626yg.Ud("*;=\u0016rxFV^\bvy\r'9AXO\u0003\u000e9(\u001e7o3F@a_x\u000e#AxK\u001dJ3T\u0014)tz:?\u001e\u000b", (short) (C1580rY.Xd() ^ (C1607wl.Xd() ^ (-1849980081))), (short) (C1580rY.Xd() ^ (C1499aX.Xd() ^ (158104153 ^ 1257726753)))));
        Class<?>[] clsArr = {Class.forName(Ig.wd("i&V2*pK d=\u0004#87J2rv,M\u00117\f\f\u0012\u0005YMrf+\u0012\u0001 \u000b3#\u007f\"\u0013\u0018q\b\u0003.?\u001aT\u000e(z `y\u0013BIS\u0017\u00190O)\u0016N", (short) (C1633zX.Xd() ^ (438330546 ^ (-438310995)))))};
        Object[] objArr = {coreErrorModelResponse};
        short sXd = (short) (FB.Xd() ^ (C1607wl.Xd() ^ 1849955999));
        int[] iArr = new int["Ty7.K\u0003U.\u000221RW\u007f\u00194w_\u001b\u0015&n=H\u0012".length()];
        QB qb = new QB("Ty7.K\u0003U.\u000221RW\u007f\u00194w_\u001b\u0015&n=H\u0012");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            callback.invoke((WritableMap) method.invoke(utils, objArr), null);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final void initCore() throws Throwable {
        CoreHelper coreHelper = CoreHelper.INSTANCE;
        short sXd = (short) (FB.Xd() ^ (1893248374 ^ 1893259906));
        int[] iArr = new int["x\u0004\u0001@uq\u0006w\u0004upxmi5jfzlxjemb^]kj'[fcbca YU[^R^\u0019-XZL.JPSGS".length()];
        QB qb = new QB("x\u0004\u0001@uq\u0006w\u0004upxmi5jfzlxjemb^]kj'[fcbca YU[^R^\u0019-XZL.JPSGS");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1593ug.zd("\"!1\u0007-35#1'*\t6:.\u000e:/B;4>E", (short) (OY.Xd() ^ (C1580rY.Xd() ^ (220741286 ^ (-1017206680)))), (short) (OY.Xd() ^ (130424421 ^ 130436162))), new Class[0]);
        try {
            method.setAccessible(true);
            this.coreManager = (CoreDocumentImp) method.invoke(coreHelper, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @ReactMethod
    public final void getDocumentType(String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, final Callback callback) throws Throwable {
        Intrinsics.checkNotNullParameter(str, C1561oA.od("kyq", (short) (ZN.Xd() ^ (C1607wl.Xd() ^ 1849958073))));
        short sXd = (short) (C1499aX.Xd() ^ (161582658 ^ (-161608717)));
        int[] iArr = new int["\u0014\u0013\u001f \u0017\u0017\u001a#".length()];
        QB qb = new QB("\u0014\u0013\u001f \u0017\u0017\u001a#");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        Intrinsics.checkNotNullParameter(callback, new String(iArr, 0, i2));
        Class<?> cls = Class.forName(Wg.Zd("fAMZ&\"\u0015Tf7QX#|G<n\u00011\\t^\u0004WKX\u0015\u0012Tw\u0016x):&\u0002q\u0015nP(\u001cB\u001a\u0015,\u001e7a2\r6_oe:X]S\u0005VW{7\u001a", (short) (C1499aX.Xd() ^ (FB.Xd() ^ (1156610004 ^ (-455044001)))), (short) (C1499aX.Xd() ^ (1051056201 ^ (-1051039040)))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (C1580rY.Xd() ^ ((779511098 ^ 530793999) ^ (-836058260)));
        int[] iArr2 = new int["9?;G\u0017DH<".length()];
        QB qb2 = new QB("9?;G\u0017DH<");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 + i3));
            i3++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this, objArr);
            DocumentTypeModel documentTypeModel = new DocumentTypeModel();
            documentTypeModel.api = str;
            if (readableMap != null) {
                Utils utils = Utils.INSTANCE;
                Object[] objArr2 = {readableMap.toHashMap()};
                Method method = Class.forName(Wg.vd("alm-fbzll^]e^Z*_OcYe[VbWGFXW\u0018L[XKLN\rJFPS;G\u0006,NBHN", (short) (C1633zX.Xd() ^ (2027445883 ^ (-2027431818))))).getMethod(hg.Vd("=7\u0017'77(4\u000e!/\u00111.$( ", (short) (C1607wl.Xd() ^ ((174460734 ^ 112319102) ^ 215482226)), (short) (C1607wl.Xd() ^ (1838842505 ^ 1838867747))), Class.forName(Qg.kd("OEYC\u000fUSGI\n#;L@$7E", (short) (Od.Xd() ^ (259243751 ^ (-259250488))), (short) (Od.Xd() ^ (36459300 ^ (-36469501))))));
                try {
                    method.setAccessible(true);
                    documentTypeModel.headers = (Map) method.invoke(utils, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            if (readableMap2 != null) {
                documentTypeModel.additionalData = readableMap2.toHashMap();
            } else {
                documentTypeModel.additionalData = new HashMap();
            }
            if (readableMap3 != null) {
                documentTypeModel.principalData = readableMap3.toHashMap();
            } else {
                documentTypeModel.principalData = new HashMap();
            }
            CoreDocumentImp coreDocumentImp = this.coreManager;
            if (coreDocumentImp == null) {
                Intrinsics.throwUninitializedPropertyAccessException(C1561oA.ud("1<>0\u0017*6(-*6", (short) (ZN.Xd() ^ ((2117809712 ^ 116465107) ^ 2026521104))));
                coreDocumentImp = null;
            }
            coreDocumentImp.getDocumentType(documentTypeModel, new LambdaSuccess() { // from class: com.davivienda.daviviendaapp.bridges.document.CoreDocumentManager$$ExternalSyntheticLambda0
                @Override // com.valid.vssh_android_core.model.LambdaSuccess
                public final void lambdaSuccessResponse(Object obj) throws Throwable {
                    CoreDocumentManager.$r8$lambda$VmxMic4plNum0IJNm_03l81fVuw(callback, (DocumentTypeResponse) obj);
                }
            }, new LambdaSuccess() { // from class: com.davivienda.daviviendaapp.bridges.document.CoreDocumentManager$$ExternalSyntheticLambda1
                @Override // com.valid.vssh_android_core.model.LambdaSuccess
                public final void lambdaSuccessResponse(Object obj) throws Throwable {
                    CoreDocumentManager.$r8$lambda$O4r6jhma1Zymklh7TwQCzX9gBns(callback, (CoreGenericModelResponse) obj);
                }
            }, new LambdaError() { // from class: com.davivienda.daviviendaapp.bridges.document.CoreDocumentManager$$ExternalSyntheticLambda2
                @Override // com.valid.vssh_android_core.model.LambdaError
                public final void lambdaErrorResponse(Object obj) throws Throwable {
                    CoreDocumentManager.m7088$r8$lambda$gRM7eSHBvQaVh5xrYJz0rrMWI(callback, (CoreErrorModelResponse) obj);
                }
            });
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C1561oA.yd("t\"\"\u0016q\u001e\u000f\"' &-\u0003\u0018\"\u0016)(2\u0002\f\u0003\u000e\f\u0013\u000f", (short) (C1499aX.Xd() ^ ((2065858088 ^ 52186813) ^ (-2017354433))));
    }
}
