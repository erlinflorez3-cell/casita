package com.davivienda.daviviendaapp.bridges.authentication;

import com.davivienda.daviviendaapp.common.helper.CoreHelper;
import com.davivienda.daviviendaapp.common.helper.Utils;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.valid.vssh_android_core.VsshCoreManagerImp;
import com.valid.vssh_android_core.model.LambdaError;
import com.valid.vssh_android_core.model.LambdaSuccess;
import com.valid.vssh_android_core.model.RecoveryModel;
import com.valid.vssh_android_core.model.RegisterModel;
import com.valid.vssh_android_core.model.response.CoreErrorModelResponse;
import com.valid.vssh_android_core.model.response.CoreGenericModelResponse;
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
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjG<L͜P.`S2\u000fq~<$q$yCAV\"}8\tWNmh\u0005Ϻ\u000b\u000bq\u000eF!\tn:Imx\f\u0013Ƥ6B}A{S}BQ`#<K4z(F\u0001\u001d\u0001H2\u000f\u0010??QT$\u0012^H!>`\u0017e\u0005H\u00186B.\f6\\\u0016TfLziR/Q\t\u001aH\\4w2\u0013L;T\u0005-\u001b\u0006y A?eCE+a\u0013\u001fTq>1M\"A\u0013y?'Y[:\\~%\u000e'-+}\u0015\u000ev4p\u001dQ\u000f\u0012W/]mcP<.(~\n\u0018T\u0004<\fWL<92f6\u0014cz\u0001`XR\u0018]p\u000e+gD&=\u0002I*g)\u0017WoK1PMz3\u001bN'\u000f\u007f9[\u0003 '\u001ak`\u0006TIQnA\u001fݓ6ՒAm\f͏Đ\u0006?"}, d2 = {"\u001ab^:\"+:d\u001d\u0010~^5{\u0005xd{9\u007fQ\u0005\u0017 Fk\nG\u0002n2f\u0002\u001f9m$wISJn4'$l_5\u0016g6W@\u0005QYN\blau=\u001d!^\fJ:\u0011\u000fb) w@9\u001f\u0015\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\ 7y4\u0003\u0011y]!\u0011b<Uv|", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$:\u0018", "1na2@(GO\u001b~\b", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)a\t'\tJ\u0005\u0016\u0011Ey\u001b<@\u0016Cg\u0001}Az\u0016\u0016IL7m4+xpl\u000f", "5dc\u001bT4>", "", "7mXA66KS", "", "@dR<i,Kg", ">`b@j6KR", ">tQ9\\*$S-", "/oX", "6dP1X9L", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "/cS6g0H\\\u0015\u0006YZ;x", ">qX;V0IO ]vm(", "1`[9U(<Y", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW\u001ar,<Vy\u001e=C", "AhV;<5", "/o_9\\*:b\u001d\t\u0004<6{\t", "/o_,e,ES\u0015\rz"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class CoreAuthenticationManager extends ReactContextBaseJavaModule {
    private VsshCoreManagerImp coreManager;

    public static /* synthetic */ void $r8$lambda$0bUQi4szjWUB7wbOk9JpoBxsy_8(Callback callback, CoreErrorModelResponse coreErrorModelResponse) throws Throwable {
        Class<?> cls = Class.forName(Wg.vd("P]X\u001aUSeYk_Xb][%\\>TDRJGMDFGST\u0017LYQqup\u007f?s\u0005\u0005}{\u0002\t\u0003}x\rfmi*DqqeF{wlnx{q\u0011\u0010 \u0016!!|\u0012$\u0018\u001b\u001a,", (short) (ZN.Xd() ^ (1141428381 ^ 1141439616))));
        Class<?>[] clsArr = new Class[C1607wl.Xd() ^ 1849955288];
        clsArr[0] = Class.forName(Qg.kd("3>;z2,-.*650q5'\"#3k\u001f.$\u001e \u001ddx\u0016 \u001f\u0014\u0012\u0013\u001a", (short) (C1633zX.Xd() ^ ((1441472128 ^ 1890655901) ^ (-626658609))), (short) (C1633zX.Xd() ^ ((1771435746 ^ 1630268887) ^ (-146694918)))));
        int iXd = OY.Xd() ^ 69946587;
        clsArr[1] = Class.forName(hg.Vd("9DA\u0001H2<82zB>=1'(4)62+%\u001f\"-/!h'(\u001c\u001c\"b&\u0018%!\u001f\u001d!\u0012Ym\u0019\u001b\rk\u0018\u0017\u0013\u0015n\u0010\u0004\u0004\nn\u0001\u000e\n\b\u0006\nz", (short) (FB.Xd() ^ ((1459728042 ^ 118136178) ^ 1342926342)), (short) (FB.Xd() ^ iXd)));
        Object[] objArr = new Object[238327343 ^ 238327341];
        objArr[0] = callback;
        objArr[1] = coreErrorModelResponse;
        Method declaredMethod = cls.getDeclaredMethod(C1561oA.ud("K=:EK9EKt<0;/0,m{", (short) (ZN.Xd() ^ (C1499aX.Xd() ^ (1878883052 ^ (-744905406))))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static /* synthetic */ void $r8$lambda$2SJRMYW2LTEEcF4ZoXQGr1dh6WQ(Callback callback, CoreGenericModelResponse coreGenericModelResponse) throws Throwable {
        short sXd = (short) (C1580rY.Xd() ^ (575481021 ^ (-575490682)));
        int[] iArr = new int["5B=~:8J>@4-720y1#9)7/,2)\u001b\u001c()k!.&VZUd$XiiRPV]WRMaKRN\u000f)VVJ\u001bPLACMPFts\u0004y\u0005\u0005`uwknm\u007f".length()];
        QB qb = new QB("5B=~:8J>@4-720y1#9)7/,2)\u001b\u001c()k!.&VZUd$XiiRPV]WRMaKRN\u000f)VVJ\u001bPLACMPFts\u0004y\u0005\u0005`uwknm\u007f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[1897883500 ^ 1897883502];
        clsArr[0] = Class.forName(C1561oA.Yd("\u001f,+l&\"%(&452u;/,/A{1B:6:9\u0003\u00198DE<<?H", (short) (C1580rY.Xd() ^ (534330659 ^ (-534336374)))));
        clsArr[1] = Class.forName(Xg.qd("\f\u0019\u0018Y#\u000f\u001b\u0019\u0015_)'(\u001e\u0016\u0019'\u001e-+&\"\u001e#04(q25+-5w=1@>>>D7\u0001\u0017DH<\u001f>H@NFA,OEGO6JYWWW]P", (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ 1849973323)), (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ 1849951693))));
        Object[] objArr = new Object[C1580rY.Xd() ^ (1436681191 ^ (-1680545788))];
        objArr[0] = callback;
        objArr[1] = coreGenericModelResponse;
        int iXd = OY.Xd() ^ (-69944162);
        Method declaredMethod = cls.getDeclaredMethod(Jg.Wd("\u0014,\fw4>U\u0003YJ!\bf\u000e{", (short) (C1633zX.Xd() ^ ((788278141 ^ 1017971916) ^ (-307321851))), (short) (C1633zX.Xd() ^ iXd)), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static /* synthetic */ void $r8$lambda$S6YyWelkbFJY3cyzhoO4lthw2PY(Callback callback, CoreErrorModelResponse coreErrorModelResponse) throws Throwable {
        int iXd = ZN.Xd() ^ 864685835;
        Class<?> cls = Class.forName(ZO.xd("4\u001b/\u00027.@-PP\u000b\b8\u0019\u0005Eix~(gK\u001b~q\u0006L-\u000f\u001c6<yTr\u0016\u0002qT=\u0003Leq\u001a_\u001f,\"+hR@^\u001a{\u001fZN;\u001e\u0017+f1imV/ hp1nC\u0016%", (short) (ZN.Xd() ^ (460320065 ^ 460300632)), (short) (ZN.Xd() ^ iXd)));
        Class<?>[] clsArr = new Class[FB.Xd() ^ 1609527089];
        clsArr[0] = Class.forName(C1626yg.Ud("T!Y]\u000et\u0006K\bo@\u001d8*){\u00048\u001f>\u0001?Ah\u0006\u0007\rT!\u0001yzZ)", (short) (OY.Xd() ^ (C1607wl.Xd() ^ (649610018 ^ 1224499270))), (short) (OY.Xd() ^ (ZN.Xd() ^ 864683177))));
        clsArr[1] = Class.forName(Ig.wd("0b\u0013scx(U\t?\u0006h\u001d\f~g\u0017\u001fe\u001b=\u0011y\u0002V\u001dr\u0012\u001b\u0010hN-QM\u0007&G\u001d.7@6ecr`\u000fJi6l;-w\u0004\r\u0015y\u000eb\u0003M@\n", (short) (C1580rY.Xd() ^ (C1580rY.Xd() ^ 831084444))));
        Object[] objArr = new Object[1440687559 ^ 1440687557];
        objArr[0] = callback;
        objArr[1] = coreErrorModelResponse;
        Method declaredMethod = cls.getDeclaredMethod(EO.Od("\u001c`n\u0010\\.I|O+\u001a\u0002J\u000b\u0004", (short) (C1607wl.Xd() ^ ((349601479 ^ 1874338622) ^ 2070812959))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static /* synthetic */ void $r8$lambda$ctEgBDZJunuV1Vwzac5oVb7poSI(Callback callback, CoreGenericModelResponse coreGenericModelResponse) throws Throwable {
        Class<?> cls = Class.forName(C1561oA.Qd("\u000f\u001a\u0017V\f\b\u001c\u000e\u001a\f\u0007\u000f\u0004\u007fK\u0001|\u0011\u0003\u000f\u0001{\u0004xts\u0002\u0001=p\u007fuoqn{5gzxkgotha^pdig&:egY4geXT\\aUNK]QVT2EQCHEQ", (short) (FB.Xd() ^ ((912336492 ^ 1793316733) ^ 1552070249))));
        Class<?>[] clsArr = new Class[C1580rY.Xd() ^ (897383545 ^ (-83224678))];
        clsArr[0] = Class.forName(C1593ug.zd("MZY\u001bTPSVTbc`$i]Z]o*_phdhg1Gfrsjjmv", (short) (OY.Xd() ^ ((1889202025 ^ 66328584) ^ 1936633836)), (short) (OY.Xd() ^ ((1351060292 ^ 1836902326) ^ 1039889071))));
        clsArr[1] = Class.forName(C1561oA.od("\u0001\f\tH\u0010y\u0004\u007fyB\n\u0006\u0005xno{p}yrlfitvh0nocci*m_lhfdhY!5`bT5RZP\\RK4UIIO4FSOMKO@", (short) (Od.Xd() ^ (1128442184 ^ (-1128458883)))));
        Object[] objArr = new Object[195411414 ^ 195411412];
        objArr[0] = callback;
        objArr[1] = coreGenericModelResponse;
        Method declaredMethod = cls.getDeclaredMethod(C1561oA.Kd(":.-:B2@Hs=3@697z\n", (short) (FB.Xd() ^ ((593309477 ^ 972736532) ^ 447196693))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreAuthenticationManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        int iXd = Od.Xd() ^ (1510337446 ^ (-502809038));
        Intrinsics.checkNotNullParameter(reactApplicationContext, Wg.Zd("\u0007&\f:V\u000fgQe\u0003\u0001'", (short) (C1580rY.Xd() ^ ((390062320 ^ 303766864) ^ (-86294696))), (short) (C1580rY.Xd() ^ iXd)));
    }

    private final void initCore() throws Throwable {
        CoreHelper coreHelper = CoreHelper.INSTANCE;
        Class<?> cls = Class.forName(C1561oA.Xd("anm/fdzn|pmwnl:qo\u0006y\b{x\u0003ywx\t\nH~\f\u000b\f\u000f\u000fO\u000b\t\u0011\u0016\f\u001aVl\u001a\u001e\u0012u\u0014\u001c!\u0017%", (short) (Od.Xd() ^ (ZN.Xd() ^ (1880426779 ^ (-1134505687))))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (Od.Xd() ^ (1119438088 ^ (-1119436728)));
        int[] iArr = new int["0/;\u0011;A?-/%$\u000348(\u0011:H8?BP".length()];
        QB qb = new QB("0/;\u0011;A?-/%$\u000348(\u0011:H8?BP");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            this.coreManager = (VsshCoreManagerImp) method.invoke(coreHelper, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static final void recovery$lambda$2(Callback callback, CoreGenericModelResponse coreGenericModelResponse) throws Throwable {
        Intrinsics.checkNotNullParameter(callback, Qg.kd("\u0015SPZYNLMT", (short) (Od.Xd() ^ (FB.Xd() ^ (692205936 ^ (-1991080741)))), (short) (Od.Xd() ^ (C1607wl.Xd() ^ (1618596910 ^ (-238935998))))));
        Utils utils = Utils.INSTANCE;
        Intrinsics.checkNotNull(coreGenericModelResponse);
        Object[] objArr = {coreGenericModelResponse};
        Method method = Class.forName(hg.Vd("epm-b^rdpb]eZV\"WSgYeWRZOKJXW\u0014HSPOPN\rFBHK?K\u0006,J>@F", (short) (FB.Xd() ^ (93832199 ^ 93831516)), (short) (FB.Xd() ^ ((1255070336 ^ 996502021) ^ 1907087495)))).getMethod(C1561oA.yd("\u0018\u000b\u001dn\u0016\u0018\u000en\u0018 \u001a&\u0018\u0011}\u001f\u001f\u001f)\u000e\u001c))'15*", (short) (OY.Xd() ^ (ZN.Xd() ^ 864691357))), Class.forName(C1561oA.ud(",74s;%/+%m510$\u001a\u001b'\u001c)%\u001e\u0018\u0012\u0015 \"\u0014[\u001a\u001b\u000f\u000f\u0015U\u0019\u000b\u0018\u0014\u0012\u0010\u0014\u0005L`\f\u000e\u007f`}\u0006{\b}v_\u0001ttz_q~zxvzk", (short) (Od.Xd() ^ (2134223411 ^ (-2134215612))))));
        try {
            method.setAccessible(true);
            callback.invoke(null, (WritableMap) method.invoke(utils, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static final void recovery$lambda$3(Callback callback, CoreErrorModelResponse coreErrorModelResponse) throws Throwable {
        Intrinsics.checkNotNullParameter(callback, C1561oA.Yd("\u000eNMYZQQT]", (short) (ZN.Xd() ^ ((1011851818 ^ 275137568) ^ 740942548))));
        Utils utils = Utils.INSTANCE;
        Intrinsics.checkNotNull(coreErrorModelResponse);
        Object[] objArr = {coreErrorModelResponse};
        Method method = Class.forName(Xg.qd("\u0003\u0010\u000fP\b\u0006\u001c\u0010\u001e\u0012\u000f\u0019\u0010\u000e[\u0013\u0011'\u001b)\u001d\u001a$\u001b\u0019\u001a*+i -,-00p,*27-;w @6:B", (short) (C1607wl.Xd() ^ ((929011993 ^ 1470447882) ^ 1627057806)), (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ (1240774116 ^ 665898340))))).getMethod(ZO.xd("\u0007iqB\u0002=eoPQ\u0013\u001ck&r%>q(o\u0007Mo$c", (short) (C1499aX.Xd() ^ ((748907142 ^ 55145506) ^ (-803891910))), (short) (C1499aX.Xd() ^ ((113771762 ^ 1329929109) ^ (-1234004873)))), Class.forName(Jg.Wd("pF\u0004\u000e\u001aL\u0019a<O[ a\"Z&\u0017V$l(j)vb1euv>z]01?uK\nT3\u00027I \u0018\\\u0017ZQ\u0011Y\u001e@$dE\u0016A\u0014k,rS$U", (short) (OY.Xd() ^ (Od.Xd() ^ (811332946 ^ 2007379856))), (short) (OY.Xd() ^ ((1305711604 ^ 399021159) ^ 1511728754)))));
        try {
            method.setAccessible(true);
            callback.invoke((WritableMap) method.invoke(utils, objArr), null);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static final void signIn$lambda$0(Callback callback, CoreGenericModelResponse coreGenericModelResponse) throws Throwable {
        Intrinsics.checkNotNullParameter(callback, C1626yg.Ud("R\u001c*^kJ\u0018 6", (short) (C1499aX.Xd() ^ (FB.Xd() ^ (-1609528526))), (short) (C1499aX.Xd() ^ (C1607wl.Xd() ^ (160705914 ^ (-1741690515))))));
        Utils utils = Utils.INSTANCE;
        Intrinsics.checkNotNull(coreGenericModelResponse);
        Object[] objArr = {coreGenericModelResponse};
        Method method = Class.forName(Ig.wd("D*8\u0017Dcb4q\u0017\u0017<fS6\tHM\u0007:m4aQ^x(j8\u001eTn\\?#\u001fB\u0019\u000b\u0017\u0006yi\u0011HO{T", (short) (C1607wl.Xd() ^ (285175528 ^ 285166898)))).getMethod(C1561oA.Qd("obpBmoaB_g]i_XAbVV\\AS`\\ZX\\M", (short) (ZN.Xd() ^ ((2090670246 ^ 1646589828) ^ 515497454))), Class.forName(EO.Od("'cUtn6[Z0L\u0015m<=\u001a|.D\r\u007f4mDF=\u0012iV\u0016lk\u000b,\u000e\u0003Ff\u0006\u0012|\u0004\u0010',E2z-[\u0003\fU\u001e\u0013+\u007fp\u0012C96h\u0002~U2c", (short) (C1580rY.Xd() ^ ((1061136551 ^ 1962235811) ^ (-1271568060))))));
        try {
            method.setAccessible(true);
            callback.invoke(null, (WritableMap) method.invoke(utils, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static final void signIn$lambda$1(Callback callback, CoreErrorModelResponse coreErrorModelResponse) throws Throwable {
        Intrinsics.checkNotNullParameter(callback, C1593ug.zd("\u007f@?KLCCFO", (short) (OY.Xd() ^ ((1579312992 ^ 1292656369) ^ 321808102)), (short) (OY.Xd() ^ (782194516 ^ 782176343))));
        Utils utils = Utils.INSTANCE;
        Intrinsics.checkNotNull(coreErrorModelResponse);
        Class<?> cls = Class.forName(C1561oA.od("\u0015 \u001d\\\u0012\u000e\"\u0014 \u0012\r\u0015\n\u0006Q\u0007\u0003\u0017\t\u0015\u0007\u0002\n~zy\b\u0007Cw\u0003\u007f~\u007f}<uqwznz5[ymou", (short) (Od.Xd() ^ ((1678941037 ^ 714609608) ^ (-1317701459)))));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (FB.Xd() ^ (C1633zX.Xd() ^ (-1951466191)));
        int[] iArr = new int["\u001d*)j4 ,*&p:89/'*8/><73/4AE9\u0003CF<>F\tNBQOOOUH\u0012(UYM.\\][_;^TV^EYhfffl_".length()];
        QB qb = new QB("\u001d*)j4 ,*&p:89/'*8/><73/4AE9\u0003CF<>F\tNBQOOOUH\u0012(UYM.\\][_;^TV^EYhfffl_");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {coreErrorModelResponse};
        int iXd = ZN.Xd() ^ 864701112;
        int iXd2 = C1499aX.Xd() ^ (1709749699 ^ (-645114003));
        short sXd2 = (short) (FB.Xd() ^ iXd);
        short sXd3 = (short) (FB.Xd() ^ iXd2);
        int[] iArr2 = new int[";;sc\u0012BN<\u001b6Am]\n\u001cFcb!=Kw\u0001#F".length()];
        QB qb2 = new QB(";;sc\u0012BN<\u001b6Am]\n\u001cFcb!=Kw\u0001#F");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            callback.invoke((WritableMap) method.invoke(utils, objArr), null);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C1561oA.Xd("FswkH}}rpz\u0002wrq\u0006{\u0003\u0003bw\u0006y\u0001\u007f\u000e]kbqojf", (short) (FB.Xd() ^ (C1580rY.Xd() ^ (-831074294))));
    }

    @ReactMethod
    public final void recovery(String str, String str2, String str3, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, final Callback callback) throws Throwable {
        Intrinsics.checkNotNullParameter(str, Wg.vd("\ny\u000b\n\u0015\f\u000e~", (short) (ZN.Xd() ^ ((822021434 ^ 1414413181) ^ 1689339987))));
        int iXd = C1580rY.Xd() ^ (161577838 ^ 942169054);
        short sXd = (short) (Od.Xd() ^ ((1250163842 ^ 2059632239) ^ (-809559763)));
        short sXd2 = (short) (Od.Xd() ^ iXd);
        int[] iArr = new int["\u007f\u0004oxtmTm\u0001".length()];
        QB qb = new QB("\u007f\u0004oxtmTm\u0001");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        Intrinsics.checkNotNullParameter(str2, new String(iArr, 0, i2));
        Intrinsics.checkNotNullParameter(str3, hg.Vd("\u0018&\u001e", (short) (C1607wl.Xd() ^ (ZN.Xd() ^ (1826653939 ^ 1600832347))), (short) (C1607wl.Xd() ^ (ZN.Xd() ^ (101557529 ^ 898095740)))));
        Intrinsics.checkNotNullParameter(callback, C1561oA.ud("a^hg\\Z[b", (short) (C1633zX.Xd() ^ (FB.Xd() ^ (-1609500527)))));
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.yd("1<=|.*B4L>=E62\u00027\u001f3)5#\u001e*\u001f'&87o#6,\u0012\u0014\u0015\"W\n!\u001f\u001e\u001a&+\u001b\u0014\u0015'\u0007\f\u000eL\\\b\u000e\u007ff\u001a\u001c\u000f\u0007\u000f\u0018\fpm\u0004wxvXk\u0004u~{\u0004", (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ 1849977717)))).getDeclaredMethod(C1561oA.Yd(".40<\f9=1", (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ (1553884451 ^ 853155055)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this, objArr);
            RecoveryModel recoveryModel = new RecoveryModel();
            recoveryModel.password = str;
            recoveryModel.publicKey = str2;
            recoveryModel.api = str3;
            if (readableMap != null) {
                Utils utils = Utils.INSTANCE;
                HashMap<String, Object> hashMap = readableMap.toHashMap();
                Class<?> cls = Class.forName(Xg.qd("\u0006\u0013\u0012S\u000b\t\u001f\u0013!\u0015\u0012\u001c\u0013\u0011^\u0016\u0014*\u001e, \u001d'\u001e\u001c\u001d-.l#0/033s/-5:0>z#C9=E", (short) (ZN.Xd() ^ (1807465393 ^ 1807477391)), (short) (ZN.Xd() ^ (315623835 ^ 315640825))));
                Class<?>[] clsArr = new Class[1];
                short sXd3 = (short) (C1580rY.Xd() ^ ((1880025246 ^ 1362334909) ^ (-557673486)));
                short sXd4 = (short) (C1580rY.Xd() ^ (899802826 ^ (-899796810)));
                int[] iArr2 = new int["#\u0003\u0001EZ{\u0004B\u001eI<>:\b6#\u001c".length()];
                QB qb2 = new QB("#\u0003\u0001EZ{\u0004B\u001eI<>:\b6#\u001c");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd4) ^ sXd3));
                    i3++;
                }
                clsArr[0] = Class.forName(new String(iArr2, 0, i3));
                Object[] objArr2 = {hashMap};
                Method method = cls.getMethod(ZO.xd("\u0003E6e3\u0013\\?tqb$\u000e\u001ds\u0005\u0019", (short) (FB.Xd() ^ (866338034 ^ 866333211)), (short) (FB.Xd() ^ (623815940 ^ 623830531))), clsArr);
                try {
                    method.setAccessible(true);
                    recoveryModel.headers = (Map) method.invoke(utils, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            if (readableMap2 != null) {
                recoveryModel.additionalData = readableMap2.toHashMap();
            } else {
                recoveryModel.additionalData = new HashMap();
            }
            if (readableMap3 != null) {
                recoveryModel.principalData = readableMap3.toHashMap();
            } else {
                recoveryModel.principalData = new HashMap();
            }
            VsshCoreManagerImp vsshCoreManagerImp = this.coreManager;
            if (vsshCoreManagerImp == null) {
                short sXd5 = (short) (FB.Xd() ^ (1420665741 ^ 1420679020));
                short sXd6 = (short) (FB.Xd() ^ ((1028455224 ^ 880078100) ^ 154667353));
                int[] iArr3 = new int["ObaY0G\u00120\u000f!\"".length()];
                QB qb3 = new QB("ObaY0G\u00120\u000f!\"");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + (i4 * sXd6))) + xuXd3.CK(iKK3));
                    i4++;
                }
                Intrinsics.throwUninitializedPropertyAccessException(new String(iArr3, 0, i4));
                vsshCoreManagerImp = null;
            }
            vsshCoreManagerImp.recovery(recoveryModel, new LambdaSuccess() { // from class: com.davivienda.daviviendaapp.bridges.authentication.CoreAuthenticationManager$$ExternalSyntheticLambda0
                @Override // com.valid.vssh_android_core.model.LambdaSuccess
                public final void lambdaSuccessResponse(Object obj) throws Throwable {
                    CoreAuthenticationManager.$r8$lambda$ctEgBDZJunuV1Vwzac5oVb7poSI(callback, (CoreGenericModelResponse) obj);
                }
            }, new LambdaError() { // from class: com.davivienda.daviviendaapp.bridges.authentication.CoreAuthenticationManager$$ExternalSyntheticLambda1
                @Override // com.valid.vssh_android_core.model.LambdaError
                public final void lambdaErrorResponse(Object obj) throws Throwable {
                    CoreAuthenticationManager.$r8$lambda$0bUQi4szjWUB7wbOk9JpoBxsy_8(callback, (CoreErrorModelResponse) obj);
                }
            });
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @ReactMethod
    public final void signIn(String str, String str2, String str3, String str4, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, final Callback callback) throws Throwable {
        Intrinsics.checkNotNullParameter(str, Ig.wd("_?\u000fp+Xp9o7:jlah", (short) (FB.Xd() ^ (1257855582 ^ 1257864965))));
        Intrinsics.checkNotNullParameter(str2, EO.Od("k/Sr6kJ\u001c", (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ (1875441679 ^ 1581381851)))));
        Intrinsics.checkNotNullParameter(str3, C1561oA.Qd("DH4=92\u00192E", (short) (Od.Xd() ^ (OY.Xd() ^ (-69949072)))));
        Intrinsics.checkNotNullParameter(str4, C1593ug.zd("BRL", (short) (ZN.Xd() ^ (C1607wl.Xd() ^ 1849970823)), (short) (ZN.Xd() ^ (708350921 ^ 708374720))));
        Intrinsics.checkNotNullParameter(callback, C1561oA.od("gdnmb`ah", (short) (C1580rY.Xd() ^ (C1499aX.Xd() ^ (982720257 ^ 2030598622)))));
        short sXd = (short) (C1499aX.Xd() ^ (OY.Xd() ^ (1493893111 ^ (-1562487188))));
        int[] iArr = new int["\n\u0017\u0016W\u000f\r#\u0017%\u0019\u0016 \u0017\u0015b\u001a\u0018.\"0$!+\" !12p&7/+/.=x-BB75?F<76J@GG\b\u001eKOC UUJHRYOJI]SZZ:O]QXWe".length()];
        QB qb = new QB("\n\u0017\u0016W\u000f\r#\u0017%\u0019\u0016 \u0017\u0015b\u001a\u0018.\"0$!+\" !12p&7/+/.=x-BB75?F<76J@GG\b\u001eKOC UUJHRYOJI]SZZ:O]QXWe");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(Wg.Zd("G?d\u001eSVc%", (short) (ZN.Xd() ^ ((1717556267 ^ 1619957866) ^ 114374050)), (short) (ZN.Xd() ^ (267273608 ^ 267270607))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this, objArr);
            RegisterModel registerModel = new RegisterModel();
            registerModel.applicationCode = str;
            registerModel.password = str2;
            registerModel.publicKey = str3;
            registerModel.api = str4;
            if (readableMap != null) {
                Utils utils = Utils.INSTANCE;
                Object[] objArr2 = {readableMap.toHashMap()};
                Method method = Class.forName(C1561oA.Xd("\u0005\u0012\u0011R\n\b\u001e\u0012 \u0014\u0011\u001b\u0012\u0010]\u0015\u0013)\u001d+\u001f\u001c&\u001d\u001b\u001c,-k\"/./22r.,49/=y\"B8<D", (short) (C1580rY.Xd() ^ ((631663760 ^ 1102839633) ^ (-1679681028))))).getMethod(Qg.kd("b\\<L\\\\MY3FT6VSIME", (short) (FB.Xd() ^ (782672740 ^ 782677335)), (short) (FB.Xd() ^ ((1563690206 ^ 2001091071) ^ 712114222))), Class.forName(Wg.vd("\u007fw\nuG\u0010\f\u0002y<Sm\u0005z\\q\u0016", (short) (ZN.Xd() ^ (525382759 ^ 525369410)))));
                try {
                    method.setAccessible(true);
                    registerModel.headers = (Map) method.invoke(utils, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            if (readableMap2 != null) {
                registerModel.additionalData = readableMap2.toHashMap();
            } else {
                registerModel.additionalData = new HashMap();
            }
            if (readableMap3 != null) {
                registerModel.principalData = readableMap3.toHashMap();
            } else {
                registerModel.principalData = new HashMap();
            }
            VsshCoreManagerImp vsshCoreManagerImp = this.coreManager;
            if (vsshCoreManagerImp == null) {
                Intrinsics.throwUninitializedPropertyAccessException(hg.Vd("ny{mTgsejgs", (short) (C1607wl.Xd() ^ ((752233081 ^ 1964996458) ^ 1506346243)), (short) (C1607wl.Xd() ^ ((297137344 ^ 1909054035) ^ 1618759525))));
                vsshCoreManagerImp = null;
            }
            vsshCoreManagerImp.register(registerModel, new LambdaSuccess() { // from class: com.davivienda.daviviendaapp.bridges.authentication.CoreAuthenticationManager$$ExternalSyntheticLambda2
                @Override // com.valid.vssh_android_core.model.LambdaSuccess
                public final void lambdaSuccessResponse(Object obj) throws Throwable {
                    CoreAuthenticationManager.$r8$lambda$2SJRMYW2LTEEcF4ZoXQGr1dh6WQ(callback, (CoreGenericModelResponse) obj);
                }
            }, new LambdaError() { // from class: com.davivienda.daviviendaapp.bridges.authentication.CoreAuthenticationManager$$ExternalSyntheticLambda3
                @Override // com.valid.vssh_android_core.model.LambdaError
                public final void lambdaErrorResponse(Object obj) throws Throwable {
                    CoreAuthenticationManager.$r8$lambda$S6YyWelkbFJY3cyzhoO4lthw2PY(callback, (CoreErrorModelResponse) obj);
                }
            });
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
