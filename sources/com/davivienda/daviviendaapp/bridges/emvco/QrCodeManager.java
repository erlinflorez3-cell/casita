package com.davivienda.daviviendaapp.bridges.emvco;

import co.com.rbm.sdkqrcode.data.DataAmount;
import co.com.rbm.sdkqrcode.data.QrEntity;
import co.com.rbm.sdkqrcode.manager.QrManagerImp;
import co.com.rbm.sdkqrcode.result.QrLicenseCallback;
import co.com.rbm.sdkqrcode.result.QrManagerCallback;
import com.davivienda.daviviendaapp.common.helper.Utils;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"ЯT\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljA0ZeP\u008cZS@\u000fsڔ<$i$yّCU(\n*\tUTog|Sb\u000bI\u0010\u000e\u0016\u0007p4I[ze\u0012%2JģG3[ڎE9fzLӌ>YR8(\u00041\u001aXH@v)D\u0004\u000b9pK\u0001>`\u000fe\u0005H\u0015ĂB \u000f\"%}\\?`l\fD_'\u0011tZNUk`\u0001[\u001a^TU\u0013=ffANEM\u0015S]3\u000b`fW\u0003m}m\tv4?+wy\u001e;!.\"$CO;g#*j\u0015i`:3[Sq\\h\u000eV\u0004+\u007f\u001bN\u001c\u000e43x2;%~\b<?%vaMh\u0002\rHF\u007f*D%8\u00183YCKj_uS\u0019|LB\u0019U$1\u0017\u0007!\n`Tt]3b\u000fi1\u007fJmL\\\"q=\u001c\u001d!h\u0010D\u001c2]~]\bWB_IEvQ#Ou2NR\u0004\u000f\u0007vg\u0002u\u0003NN?\u0007\u0018M)7*\u000bJr$\u0004RjWZ1\u00140\u001d-\f)+ \u000b\u0002l%32fO\u0017u\u001bQk-=/\u0015C\nry2o9\r?eUq\u001dyR%\u001a\u0006A+\u001bf\fZS:d\r,0X`j>\u0004,H\\\u0019+2mwb9|='a-H1$\u0019ˉ)ȤcZpɭO`A+\u001biR|_əRʷtooծ͋0%"}, d2 = {"\u001ab^:\"+:d\u001d\u0010~^5{\u0005xd{9\u007fQ\u0005\u0017 Fk\nG\u0002n2f\u0002\u001f9m$wMKLi>g\u0001u?C\u0006c\u0014J\u007f#IL[\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\ 7y4\u0003\u0011y]!\u0011b<Uv|", "\u001ab^{V6F\u001d&{\u0003(:{\u000f;r}2z@J$\u0017U\u007f\u0015K@\u0011BAy)3o\u0016;+?Br1\u001a\u0013n7", "\u001ab^{V6F\u001d&{\u0003(:{\u000f;r}2z@J$\u0017U\u007f\u0015K@\u0011B@\u0002\u001e7v$.+?Br1\u001a\u0013n7", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$:\u0018", "1`[9U(<Y", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW\u001ar,<Vy\u001e=C", "?q<.a(@S&", "\u001ab^{V6F\u001d&{\u0003(:{\u000f;r}2z@J\u001f\u0013Pk\u0010<\u0004n!fe\u001c@i\u0018.Z'Cv\n", "1`[0h3:b\u0019mvq\u000b\u0011\u0012+m\u0004&", "", "Bh_", "", "1a", "1`[0h3:b\u0019mvq\u000f\u0011\u0006<i~", "1`[0h3:b\u0019mvq\u001a\f\u0005>i}", "7uP\u001dX9<S\"\u000ev`,", "7mR\u001dX9<S\"\u000ev`,", "BqP;f(<b\u001d\t\u0004:4\u0007\u00198t", "1gT0^\u0010GW(\u0003ve0\u0012\t\u001dc{1", "AsP?g", "", "5dc\u001bT4>", "=m4?e6KA\u001c\t\r", "3qa<e\u001bR^\u0019", "", ";db@T.>", "=mB0T5+S'\n\u0005g:|", "?q3.g(", "?q4;g0Mg", "\u001ab^{V6F\u001d&{\u0003(:{\u000f;r}2z@J\u0016\u0013VkW(\u0004\u0005>h\u0002/KC", "=aY\u0012`=J`\u0003\fg[4", "", ">q^0V,La\u0005\fYZ;x", "Cq[\u000fT:>", ">tQ9\\*$S-", ":hR2a*>", "BqP;f-H`!]vm(\\\u0011@c\n", "@`f\u0011T;:", "\u0011n\\=T5B]\"", "/o_,e,ES\u0015\rz"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class QrCodeManager extends ReactContextBaseJavaModule implements QrManagerCallback, QrLicenseCallback {
    public static final Companion Companion = new Companion(null);
    private static QrEntity qrEntityStatic = null;
    private Callback callback;
    private final QrManagerImp qrManager;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005%2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005>i%\nEQTH\u007fxޢ[ɁksvϺr\rI\u0012\u0014\u001a\u0019l2Nc~ٛ\u0016\u0016"}, d2 = {"\u001ab^:\"+:d\u001d\u0010~^5{\u0005xd{9\u007fQ\u0005\u0017 Fk\nG\u0002n2f\u0002\u001f9m$wMKLi>g\u0001u?C\u0006c\u0014J\u007f#IL[j:\\zH\u0010\u001b^\u0018W\u0001", "", "u(E", "?q4;g0Mg\u0007\u000evm0z", "\u001ab^{V6F\u001d&{\u0003(:{\u000f;r}2z@J\u0016\u0013VkW(\u0004\u0005>h\u0002/KC", "5dc\u001ee\fGb\u001d\u000e\u000fL;x\u00183c", "u(;0bu<]!H\b[4F\u0017.k\f5yJ\u007f\u0017`Fk\u001d8@\u0011B9\u0007/;|*\u0004", "Adc\u001ee\fGb\u001d\u000e\u000fL;x\u00183c", "uKR<\"*H[b\fwfu\u000b\b5q\r&\u0006?\u0001`\u0016C~\n\u0006b2\u0015b\r$F\u0002kq>", "/o_,e,ES\u0015\rz"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final QrEntity getQrEntityStatic() {
            return QrCodeManager.qrEntityStatic;
        }

        public final void setQrEntityStatic(QrEntity qrEntity) {
            QrCodeManager.qrEntityStatic = qrEntity;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrCodeManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Intrinsics.checkNotNullParameter(reactApplicationContext, C1561oA.Yd("l`]`rBoovh|y", (short) (OY.Xd() ^ (C1607wl.Xd() ^ 1849957469))));
        this.qrManager = new QrManagerImp(reactApplicationContext);
    }

    @ReactMethod
    public final void calculateTaxDynamic(String str, Callback callback) throws Throwable {
        Intrinsics.checkNotNullParameter(str, Xg.qd("\u0010\u0006\u000e", (short) (ZN.Xd() ^ (C1607wl.Xd() ^ 1849973242)), (short) (ZN.Xd() ^ (FB.Xd() ^ (662151112 ^ 2023283711)))));
        Intrinsics.checkNotNullParameter(callback, Jg.Wd("\u0006,", (short) (ZN.Xd() ^ ((1270741295 ^ 288108869) ^ 1519511009)), (short) (ZN.Xd() ^ (749282813 ^ 749302841))));
        try {
            this.callback = callback;
            DataAmount dataAmountCalculateTaxDynamic = this.qrManager.calculateTaxDynamic(qrEntityStatic, str);
            Callback callback2 = this.callback;
            if (callback2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ZO.xd("\u001c8'\nR>jx", (short) (Od.Xd() ^ ((792516922 ^ 80586981) ^ (-737214578))), (short) (Od.Xd() ^ ((310217490 ^ 1421247834) ^ (-1187714689)))));
                callback2 = null;
            }
            Utils utils = Utils.INSTANCE;
            Intrinsics.checkNotNull(dataAmountCalculateTaxDynamic);
            Class<?> cls = Class.forName(C1626yg.Ud("\u0002\u0017Ff7W\u0010\u001f.d.Hf+8bBOVz6e\u0010/#C`T\u000ePs\bb&0u,\fb?\u0007\u001euO\u0006,jq", (short) (C1499aX.Xd() ^ (896860474 ^ (-896884565))), (short) (C1499aX.Xd() ^ ((204529178 ^ 841535597) ^ (-1041768921)))));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(Ig.wd(";\u0018h=Y\u000b'c\u0015+qU\u001c%~\u001da_,\u0005\u000f\u001d0Gu\u000e\u0006RW\u0016Q[=%5\t", (short) (C1633zX.Xd() ^ (1862687436 ^ (-1862678833)))));
            Object[] objArr = {dataAmountCalculateTaxDynamic};
            Method method = cls.getMethod(EO.Od("\u001eR!\u0013\fQoNB\u001a\tB91k?q", (short) (C1499aX.Xd() ^ ((428385358 ^ 435988473) ^ (-7604039)))), clsArr);
            try {
                method.setAccessible(true);
                callback2.invoke(null, (WritableMap) method.invoke(utils, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (IllegalArgumentException e3) {
            String.valueOf(e3.getMessage());
            C1561oA.Qd("\r\u0019\u0018\u0014\u0016B\u0005\u0002\f\u0002\u0013\t|\u000f~lx\u000fY\u000e\u0002s~yr.", (short) (C1580rY.Xd() ^ (1659893804 ^ (-1659881628))));
            int i2 = Integer.parseInt(String.valueOf(e3.getMessage()));
            String strValueOf = String.valueOf(e3.getMessage());
            Class<?> cls2 = Class.forName(C1593ug.zd("gts5lj\u0001t\u0003vs}tr@wu\f\u007f\u000e\u0002~\t\u007f}~\u000f\u0010N\u0004\u0015\r\t\r\f\u001bV\u000f\u0018\"\u0010\u001d\\\u0001#t\"\u0018\u001a\u0003\u0018&\u001a! .", (short) (C1580rY.Xd() ^ (359400589 ^ (-359419641))), (short) (C1580rY.Xd() ^ ((1689365545 ^ 532469626) ^ (-2064473022)))));
            Class<?>[] clsArr2 = new Class[(1542777281 ^ 2123635777) ^ 627111298];
            clsArr2[0] = Integer.TYPE;
            clsArr2[1] = Class.forName(C1561oA.od("\\RfP\u001cYMYQ\u0017;[XNRJ", (short) (Od.Xd() ^ ((506021415 ^ 1415217637) ^ (-1249104101)))));
            Object[] objArr2 = new Object[(2121076498 ^ 853629190) ^ 1284265494];
            objArr2[0] = Integer.valueOf(i2);
            objArr2[1] = strValueOf;
            Method method2 = cls2.getMethod(C1561oA.Kd("xxP~\u007f}\u0002cy\u0002\u000b", (short) (C1633zX.Xd() ^ (1604444579 ^ (-1604431206)))), clsArr2);
            try {
                method2.setAccessible(true);
                method2.invoke(this, objArr2);
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }
    }

    @ReactMethod
    public final void calculateTaxHybrid(String str, Callback callback) throws Throwable {
        Intrinsics.checkNotNullParameter(str, Wg.Zd("\u007f6^", (short) (Od.Xd() ^ (FB.Xd() ^ (-1609528459))), (short) (Od.Xd() ^ (Od.Xd() ^ (548707594 ^ (-1732858057))))));
        Intrinsics.checkNotNullParameter(callback, C1561oA.Xd("``", (short) (C1633zX.Xd() ^ ((990698757 ^ 1481074040) ^ (-1665895697)))));
        try {
            this.callback = callback;
            DataAmount dataAmountCalculateTaxDynamic = this.qrManager.calculateTaxDynamic(qrEntityStatic, str);
            Callback callback2 = this.callback;
            if (callback2 == null) {
                short sXd = (short) (C1499aX.Xd() ^ (1081288670 ^ (-1081287544)));
                int[] iArr = new int["`]kj[Y^e".length()];
                QB qb = new QB("`]kj[Y^e");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                    i2++;
                }
                Intrinsics.throwUninitializedPropertyAccessException(new String(iArr, 0, i2));
                callback2 = null;
            }
            Utils utils = Utils.INSTANCE;
            Intrinsics.checkNotNull(dataAmountCalculateTaxDynamic);
            Class<?> cls = Class.forName(Qg.kd("-85t*&:,8*%-\"\u001ei\u001f\u001b/!-\u001f\u001a\"\u0017\u0013\u0012 \u001f[\u0010\u001b\u0018\u0017\u0018\u0016T\u000e\n\u0010\u0013\u0007\u0013Ms\u0012\u0006\b\u000e", (short) (C1607wl.Xd() ^ ((2032917981 ^ 1176797253) ^ 1057955221)), (short) (C1607wl.Xd() ^ (1240377921 ^ 1240377778))));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(hg.Vd("HS\u0011EPM\rP?I\tM=CHH8C77~40B.y\u000f+=)\b34916", (short) (ZN.Xd() ^ (1944349792 ^ 1944335701)), (short) (ZN.Xd() ^ ((18779673 ^ 239788022) ^ 257192787))));
            Object[] objArr = {dataAmountCalculateTaxDynamic};
            Method method = cls.getMethod(C1561oA.ud("TN.>NN?\u001d9K7\u0016ABG?D", (short) (C1633zX.Xd() ^ ((1736504557 ^ 801315126) ^ (-1212401907)))), clsArr);
            try {
                method.setAccessible(true);
                callback2.invoke(null, (WritableMap) method.invoke(utils, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (IllegalArgumentException e3) {
            String.valueOf(e3.getMessage());
            short sXd2 = (short) (C1607wl.Xd() ^ ((1487645918 ^ 689382610) ^ 1908204924));
            int[] iArr2 = new int["\u000f\u001d\u001a\u0018 N\u000f\u000e\u000e\u0006\u0015\r\u0007\u001b\tx\u001b3\u007f2 1%!Q".length()];
            QB qb2 = new QB("\u000f\u001d\u001a\u0018 N\u000f\u000e\u000e\u0006\u0015\r\u0007\u001b\tx\u001b3\u007f2 1%!Q");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i3));
                i3++;
            }
            new String(iArr2, 0, i3);
            int i4 = Integer.parseInt(String.valueOf(e3.getMessage()));
            String strValueOf = String.valueOf(e3.getMessage());
            Class<?> cls2 = Class.forName(C1561oA.Yd("dqp2ig}q\u007fspzqo=tr\t|\u000b~{\u0006|z{\f\rK\u0001\u0012\n\u0006\n\t\u0018S\f\u0015\u001f\r\u001aY} q\u001f\u0015\u0017\u007f\u0015#\u0017\u001e\u001d+", (short) (C1499aX.Xd() ^ (1265622651 ^ (-1265602190)))));
            Class<?>[] clsArr2 = new Class[248861162 ^ 248861160];
            clsArr2[0] = Integer.TYPE;
            clsArr2[1] = Class.forName(Xg.qd("\u001c\u0014*\u0016c#\u0019'!h\u000f10(.(", (short) (FB.Xd() ^ ((49389820 ^ 757912119) ^ 803044907)), (short) (FB.Xd() ^ (1860614887 ^ 1860613363))));
            Object[] objArr2 = new Object[(539323017 ^ 2008148747) ^ 1469350272];
            objArr2[0] = Integer.valueOf(i4);
            objArr2[1] = strValueOf;
            Method method2 = cls2.getMethod(Jg.Wd("%\u0019X[D7\u001fYS\u0010\u0001", (short) (C1607wl.Xd() ^ ((1618257070 ^ 202129952) ^ 1819843073)), (short) (C1607wl.Xd() ^ (278900039 ^ 278917537))), clsArr2);
            try {
                method2.setAccessible(true);
                method2.invoke(this, objArr2);
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }
    }

    @ReactMethod
    public final void calculateTaxStatic(String str, String str2, String str3, String str4, Callback callback) throws Throwable {
        Intrinsics.checkNotNullParameter(str, ZO.xd("^\u007fJt3\u0010`\u0015ciD\u0006V", (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (586564759 ^ (-327097076)))), (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (536005413 ^ (-1805899315))))));
        Intrinsics.checkNotNullParameter(str2, C1626yg.Ud("\u001f/>6W^\t#\u007f\u000bq#s", (short) (FB.Xd() ^ (2027074752 ^ 2027062017)), (short) (FB.Xd() ^ ((163951772 ^ 150152344) ^ 20378673))));
        Intrinsics.checkNotNullParameter(str3, Ig.wd("\t2\r\f\u00181\u0019\u0018FmdcA?o\b5", (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (-831062484)))));
        Intrinsics.checkNotNullParameter(str4, EO.Od("r\u0017@", (short) (C1499aX.Xd() ^ (ZN.Xd() ^ (-864690065)))));
        short sXd = (short) (C1580rY.Xd() ^ (C1633zX.Xd() ^ 1951487820));
        int[] iArr = new int["CA".length()];
        QB qb = new QB("CA");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(callback, new String(iArr, 0, i2));
        try {
            this.callback = callback;
            DataAmount dataAmountCalculateTaxStatic = this.qrManager.calculateTaxStatic(qrEntityStatic, str, str2, str3, str4);
            Callback callback2 = this.callback;
            if (callback2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(C1593ug.zd("=<HI@@CL", (short) (OY.Xd() ^ (570747718 ^ 570731822)), (short) (OY.Xd() ^ ((523798079 ^ 1707143436) ^ 2063097261))));
                callback2 = null;
            }
            Utils utils = Utils.INSTANCE;
            Intrinsics.checkNotNull(dataAmountCalculateTaxStatic);
            Class<?> cls = Class.forName(C1561oA.od("\u0015 \u001d\\\u0012\u000e\"\u0014 \u0012\r\u0015\n\u0006Q\u0007\u0003\u0017\t\u0015\u0007\u0002\n~zy\b\u0007Cw\u0003\u007f~\u007f}<uqwznz5[ymou", (short) (C1607wl.Xd() ^ (256893330 ^ 256898901))));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(C1561oA.Kd("\"/n%21r8)5v=/7>@2?57\u000186J8\u0006\u001d;O=\u001eKNUOV", (short) (OY.Xd() ^ ((884119580 ^ 1242501844) ^ 2126361618))));
            Object[] objArr = {dataAmountCalculateTaxStatic};
            Method method = cls.getMethod(Wg.Zd("P\u0017GcHT\u0016\u0004p\u000fO:67\r\u0011f", (short) (ZN.Xd() ^ ((1416975856 ^ 811883417) ^ 1678848903)), (short) (ZN.Xd() ^ (467345904 ^ 467361615))), clsArr);
            try {
                method.setAccessible(true);
                callback2.invoke(null, (WritableMap) method.invoke(utils, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (IllegalArgumentException e3) {
            String.valueOf(e3.getMessage());
            short sXd2 = (short) (C1499aX.Xd() ^ ((1620658201 ^ 1212418592) ^ (-685599313)));
            int[] iArr2 = new int["\u007f\u000e\u000f\r\u0011?\u0015\u0003\u001bC\u0018\u001a\b\u001c\u0012\rJ".length()];
            QB qb2 = new QB("\u007f\u000e\u000f\r\u0011?\u0015\u0003\u001bC\u0018\u001a\b\u001c\u0012\rJ");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 + i3));
                i3++;
            }
            new String(iArr2, 0, i3);
            int i4 = Integer.parseInt(String.valueOf(e3.getMessage()));
            String strValueOf = String.valueOf(e3.getMessage());
            Class<?> cls2 = Class.forName(Wg.vd("|\n\tJyw\u000e\u0002\b{x\u0003qo=t\u000b!\u0015#\u000f\f\u0016\r\u0003\u0004\u0014\u0015K\u0001\u0012\n\u001e\"!0c\u001c%/\u0015\"a\u0006 q\u001f\u0015/\u0018-;'.-;", (short) (C1499aX.Xd() ^ (476108150 ^ (-476089111)))));
            Class<?>[] clsArr2 = new Class[1727566526 ^ 1727566524];
            clsArr2[0] = Integer.TYPE;
            short sXd3 = (short) (C1633zX.Xd() ^ (834863030 ^ (-834855224)));
            short sXd4 = (short) (C1633zX.Xd() ^ ((1839069214 ^ 566032088) ^ (-1277248601)));
            int[] iArr3 = new int["F<P:\u0006C7C;\u0001%EB8<4".length()];
            QB qb3 = new QB("F<P:\u0006C7C;\u0001%EB8<4");
            int i5 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i5] = xuXd3.fK(((sXd3 + i5) + xuXd3.CK(iKK3)) - sXd4);
                i5++;
            }
            clsArr2[1] = Class.forName(new String(iArr3, 0, i5));
            Object[] objArr2 = new Object[(213409927 ^ 654754659) ^ 733914086];
            objArr2[0] = Integer.valueOf(i4);
            objArr2[1] = strValueOf;
            Method method2 = cls2.getMethod(hg.Vd("\u0014\u0012g\u0014\u0013\u000f\u0011p\u0005\u000b\u0012", (short) (C1633zX.Xd() ^ (1436155377 ^ (-1436131833))), (short) (C1633zX.Xd() ^ (1314901576 ^ (-1314899631)))), clsArr2);
            try {
                method2.setAccessible(true);
                method2.invoke(this, objArr2);
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }
    }

    @Override // co.com.rbm.sdkqrcode.result.QrLicenseCallback
    public void checkInitializeScan(boolean z2) {
        Callback callback = this.callback;
        if (callback == null) {
            Intrinsics.throwUninitializedPropertyAccessException(C1561oA.ud("LISRGEFM", (short) (OY.Xd() ^ (C1580rY.Xd() ^ (-831069055)))));
            callback = null;
        }
        callback.invoke(null, Boolean.valueOf(z2));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C1561oA.yd("\u001c>\u0010=+-\u0016+1%,+1\u0001\u000f\u0006\r\u000b\u0006\u0002", (short) (C1580rY.Xd() ^ (FB.Xd() ^ (622181713 ^ (-2063261825)))));
    }

    @Override // co.com.rbm.sdkqrcode.result.QrErrorCallback
    public void onErrorShow(int i2, String str) throws Throwable {
        Callback callback = this.callback;
        if (callback == null) {
            Intrinsics.throwUninitializedPropertyAccessException(C1561oA.Yd("PO[\\SSV_", (short) (C1499aX.Xd() ^ (2109951846 ^ (-2109937235)))));
            callback = null;
        }
        Utils utils = Utils.INSTANCE;
        Class<?> cls = Class.forName(Xg.qd("\u0013 \u001f`\u0018\u0016, .\"\u001f) \u001ek#!7+9-*4+)*:;y0=<=@@\u0001<:BG=K\b0PFJR", (short) (C1499aX.Xd() ^ ((179319761 ^ 502289362) ^ (-390091345))), (short) (C1499aX.Xd() ^ (FB.Xd() ^ (-1609528673)))));
        Class<?>[] clsArr = new Class[C1580rY.Xd() ^ (-831067165)];
        short sXd = (short) (FB.Xd() ^ (C1499aX.Xd() ^ (161023981 ^ (-1241653048))));
        short sXd2 = (short) (FB.Xd() ^ ((477548450 ^ 859756737) ^ 793272358));
        int[] iArr = new int["\u0007~M.4w&)['\u0006\u001dTL\u000fy".length()];
        QB qb = new QB("\u0007~M.4w&)['\u0006\u001dTL\u000fy");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - ((i3 * sXd2) ^ sXd));
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i3));
        clsArr[1] = Integer.TYPE;
        Object[] objArr = new Object[181814730 ^ 181814728];
        objArr[0] = str;
        objArr[1] = Integer.valueOf(i2);
        Method method = cls.getMethod(ZO.xd("\nVtI\u0017R\tB\"J}&[", (short) (C1499aX.Xd() ^ ((1034816415 ^ 890594786) ^ (-146490514))), (short) (C1499aX.Xd() ^ (OY.Xd() ^ (-69958787)))), clsArr);
        try {
            method.setAccessible(true);
            callback.invoke((WritableMap) method.invoke(utils, objArr), null);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // co.com.rbm.sdkqrcode.result.QrManagerCallback
    public void onScanResponse(String str, QrEntity qrEntity, Object obj) throws Throwable {
        String strUd = C1626yg.Ud("\u007f{\u000f}+)l:", (short) (C1607wl.Xd() ^ ((534132971 ^ 1816761198) ^ 1939859987)), (short) (C1607wl.Xd() ^ ((2015455708 ^ 1726929592) ^ 516940182)));
        if (qrEntity == null) {
            Callback callback = this.callback;
            if (callback == null) {
                Intrinsics.throwUninitializedPropertyAccessException(strUd);
                callback = null;
            }
            callback.invoke(null, false);
            return;
        }
        qrEntityStatic = qrEntity;
        Callback callback2 = this.callback;
        if (callback2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(strUd);
            callback2 = null;
        }
        Utils utils = Utils.INSTANCE;
        Object[] objArr = {qrEntity};
        Method method = Class.forName(Ig.wd("J\t7\u00115\u000exA\u0018\u0018\u0010ALQ<V\u0007(@7s\u0015}mdRAp\u00127\u0019|b@&\u00195\u0018>2- )4TU\u0002a", (short) (C1499aX.Xd() ^ (206109341 ^ (-206083291))))).getMethod(C1561oA.Qd("<6\u0016&66'\u00145\"!\"/.\u000b+\u000b\u001a\u0017#\u0019\u0017", (short) (FB.Xd() ^ (Od.Xd() ^ 1207806334))), Class.forName(EO.Od("K\b:JG\"\u0001G\u0012k,Q\u0011$\u0010q\u0007/^\u001a\u001d\u000ej{Smu?\u000e\f 3Xy", (short) (C1580rY.Xd() ^ (FB.Xd() ^ (1383254248 ^ (-228427493)))))));
        try {
            method.setAccessible(true);
            callback2.invoke(null, (WritableMap) method.invoke(utils, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @ReactMethod
    public final void proccessQrData(String str, String str2, String str3, Callback callback) {
        Intrinsics.checkNotNullParameter(str, C1593ug.zd("\u001c\u001a\u0015k\f\u001f\u0012", (short) (C1607wl.Xd() ^ ((304887277 ^ 1574521281) ^ 1341471824)), (short) (C1607wl.Xd() ^ ((1895164776 ^ 1304159564) ^ 1028529194))));
        Intrinsics.checkNotNullParameter(str2, C1561oA.od("\u0006\nu~zsZs\u0007", (short) (Od.Xd() ^ (187421434 ^ (-187412981)))));
        Intrinsics.checkNotNullParameter(str3, C1561oA.Kd("B@;>H>A", (short) (C1580rY.Xd() ^ (Od.Xd() ^ (-1207808195)))));
        Intrinsics.checkNotNullParameter(callback, Wg.Zd("\n\"", (short) (C1580rY.Xd() ^ (C1607wl.Xd() ^ (-1849957987))), (short) (C1580rY.Xd() ^ (OY.Xd() ^ (375974539 ^ (-306430266))))));
        this.callback = callback;
        this.qrManager.initializeLibrary(str, str2, str3, this);
    }

    @ReactMethod
    public final void transformDataEmvco(String str, Callback callback) throws Throwable {
        short sXd = (short) (FB.Xd() ^ (1510992585 ^ 1510976072));
        int[] iArr = new int["\u0005t\fYw\fy".length()];
        QB qb = new QB("\u0005t\fYw\fy");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        Intrinsics.checkNotNullParameter(str, new String(iArr, 0, i2));
        Intrinsics.checkNotNullParameter(callback, Wg.vd("EC", (short) (ZN.Xd() ^ (ZN.Xd() ^ 864685570))));
        this.callback = callback;
        this.qrManager.transformData(str, this);
    }
}
