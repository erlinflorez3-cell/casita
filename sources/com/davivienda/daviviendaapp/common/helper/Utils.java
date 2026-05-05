package com.davivienda.daviviendaapp.common.helper;

import co.com.rbm.sdkqrcode.data.DataAmount;
import co.com.rbm.sdkqrcode.data.QrEntity;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.valid.vssh_android_core.basecore.BaseResponse;
import com.valid.vssh_android_core.model.response.ClientHelloModelResponse;
import com.valid.vssh_android_core.model.response.CoreErrorModelResponse;
import com.valid.vssh_android_core.model.response.CoreGenericBridgeModelResponse;
import com.valid.vssh_android_core.model.response.CoreGenericModelResponse;
import com.valid.vssh_android_core.model.response.DocumentType;
import com.valid.vssh_android_core.model.response.DocumentTypeResponse;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
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
@Metadata(bv = {}, d1 = {"Яč\u0014D57\u001eq\u007fR܀kt\nA\u000e0!.Jչ*, \u0007\u000ffp:8D{H6Ri*\u0017ӆ\u00044:[,ڎK;k\u001a\u0006\"\u000fOVg}nRҙ\u0013C\u001d(\u001exx8Qǁ\u0001](\u000f:ԏw?IMw=?a|6\u0013&:Ĳ@y\u001b\u0001\"ݒP\u0010\rzKŷ\u0014\u0012F@x:X\u000eU\u0005(5\u000ē(\u00014\\oޮ>H\u0003]Bǂ+\u0003\u007fBV'u0\u0005ձ\u0013цT=˙'aL*\u0001<;\u0015ȏW\u0003\u0015R$T\u0011@\n=3jW/9L\f[FX\u0006\u0015C/̠\u0011]\u0001+%\u001f_f$'YQ\u0014[^\u0015@\u0004\u000b{\u0013=2\u0016n+X.3\u001bE\u0011T3=\taJh\u0002\rM0\u0007oB/-\u001031:+fWbi&\u00157D\u0011\u001b,;\u0001\u001d,\fX\u001co-\u001b\u0003\b\u001aI_QUH|\u0015\nM{\u0013\tn\u0012,\u00140u\u0013?}!.E$em\u0002//\u007f\u001aHrr'\tnwki\u0001]\t.|,O*7\u0017\u000bHr\u0014\u0004P\u0003ot'[4l\u0007,\u0013C&j\u0011T#;\u000f|b\u0019mxgu\nSJ/Cg\u000b\u0004\u000e\u0006D\u000f7C`{\u0010\u0010o? MZz\u0005\u0007qrW\u001ait(PQ\u0011v\u001e\u0018\u0014D|\u0017C6M\u000144ZRah#j\u001b\u001epC-\rmi\u0001\u0010-s{8\u0011\r<t7\f\u0001h~\u0014\u007f\u0001Y,\u0003a2-GRc>na0\u000fL|Q\u0012/w\u000eV\u007fLus5\"\u0004}\u0014 D%iU=L+\u000f-Rz6;od~uS]\u0012U\u000e\r{\u001f;\u0017A\u0016-\u001b\u0011:\u0005\u0003f_V'\"%q\u0003%\u0018d.x\u0010qcSsV\u001b[l\\\u0003\u0005i<|7[1Ƚ\"R"}, d2 = {"\u001ab^:\"+:d\u001d\u0010~^5{\u0005xd{9\u007fQ\u0005\u0017 Fk\nG\u0002n3c\u0006(Av_1MJFkAg\u0005we@\u00159", "", "u(E", "/qa.l\u001bHE&\u0003\nZ)\u0004\t\u000br\r$\u0010", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW.\u0004)DUz'7I#;IW\u0011", "/qa.l", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u0015!O9\u000f8t%2c\b&\u0001z\u0016*KR\u0005hA\"\u0014ja\u0003xp0]r$NL*9iN\u0007\u0013", "/qa.l\u001bHE&\u0003\n^(y\u0010/A\r5wT", "7mXA\\(E/&\fvr", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", ":h]8X+-`\u0019~bZ7k\u0013!r\u00047{<}\u001e\u0017/k\u0019", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW.\u0004)DUz'7U\u00129#", "7mXA\\(E;\u0015\n", "\u001ab^:\".H]\u001b\u0006z(.\u000b\u00138/\u00041\u000b@\u000e \u0013N9t@\u007f+5Xl-7m}*X\u0019", ";`_\u000fT:>@\u0019\r\u0006h5\u000b\t\u001du}&{N\u000ft!P}\u001eDv\u00075b}-;k", "@db=b5LS", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)a\t'\tJ\u0005\u0016\u0011Ey\u001b<@\"1g}\u001eAz\u0016w*?Ik!\u001e#skB\u0015c\u0002", ";`_\u000f\\6FS(\f~\\\u0014\u0007\b/ll(\nK\u000b %G", "", "", ";`_\u0010b9>3&\f\u0005k\u0014\u0007\b/ll(\nK\u000b %G", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)a\t'\tJ\u0005\u0016\u0011Ey\u001b<@-?X}'\u0001z\u0016<XMDy4grrn9fp9X\u0004\u000fQKN3IR\u0001H\u001e\u001bh\u000e$", ";`_\u0010b9>5\u0019\bzk0zp9d\u007f/h@\u000f\"!P}\u000e", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)a\t'\tJ\u0005\u0016\u0011Ey\u001b<@-?X}'\u0001z\u0016<XMDy4grrn9hc5N\u0004+E4X+\\Y_=\"\u001dd\u0017\\+b", ";`_\u0012e9H`x\u0007\f\\6", ";db@T.>", "3qa<e", "", ";`_\u001fX:I]\"\rzL<z\u0007/s\u000e\u0006\u0003D\u0001 &*o\u0015C\u0001", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)a\t'\tJ\u0005\u0016\u0011Ey\u001b<@-?X}'\u0001z\u0016<XMDy4groe9\u0010r\u000fN}.Q4X+\\Y_=\"\u001dd\u0017\\+b", ";`_\u001fX:I]\"\rzL<z\u0007/s\u000e\u0006\u0006I\u000f'\u001fGQ\u000eEv29W", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)a\t'\tJ\u0005\u0016\u0011Ey\u001b<@-?X}'\u0001z\u0016<XMDy4grrn9hc5N\u0004+E)[0[Tr%\u001e\u0011Z\u0015;+\u001b\u0010cJ2n\u001a", ";`_\u001fX:I]\"\rzL<z\u0007/s\u000e\u0007\u0006>\u0011\u001f\u0017P~|P\u0002%", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)a\t'\tJ\u0005\u0016\u0011Ey\u001b<@-?X}'\u0001z\u0016<XMDy4gsr_I\u000fc5]e;RL;,j]|F\"\u00120", ";`_\u001fX:I]\"\rzL<z\u0007/s\u000e\u0016{O\u0011\"", ";`_!b\u001eKW(zwe,d\u0005:", ";`_", "", "Bn?.e:>2\u0015\u000ev:4\u0007\u00198t", "\u001ab^{V6F\u001d&{\u0003(:{\u000f;r}2z@J\u0016\u0013VkW\u001br415\u0006*Gv%\u0004", "Bn?.e:>A)|x^:\u000bt<S}$\u0005@\u007f", "\u001ab^{V6F\u001d&{\u0003(:{\u000f;r}2z@J\u0016\u0013VkW(\u0004\u0005>h\u0002/KC", "Bn?.e:>`\u0001z\u0006L;\n\r8g", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u0017a\u000b}", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a/k\u0019\u0012", "/o_,e,ES\u0015\rz"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class Utils {
    public static final Utils INSTANCE = new Utils();

    private Utils() {
    }

    private final WritableArray arrayToWriteableArray(ArrayList<?> arrayList) throws Throwable {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (Object obj : arrayList) {
            if (obj == null) {
                writableArrayCreateArray.pushNull();
            } else if (obj instanceof String) {
                writableArrayCreateArray.pushString((String) obj);
            } else if (obj instanceof Integer) {
                writableArrayCreateArray.pushInt(((Number) obj).intValue());
            } else if (obj instanceof Double) {
                writableArrayCreateArray.pushDouble(((Number) obj).doubleValue());
            } else if (obj instanceof Boolean) {
                writableArrayCreateArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof ArrayList) {
                ArrayList arrayList2 = (ArrayList) obj;
                short sXd = (short) (C1633zX.Xd() ^ ((2013467377 ^ 460038805) ^ (-1667809753)));
                int[] iArr = new int["|\b\u0005Dyu\n{\byt|qm9nj~p|niqfbaon+_jgfge$]Y_bVb\u001dCaUW]".length()];
                QB qb = new QB("|\b\u0005Dyu\n{\byt|qm9nj~p|niqfbaon+_jgfge$]Y_bVb\u001dCaUW]");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                Object[] objArr = {arrayList2};
                Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(Wg.Zd("\u001cy\u0007@a\t/cF\n\"]b0EG.,9n\u0014", (short) (ZN.Xd() ^ (1423699729 ^ 1423679874)), (short) (ZN.Xd() ^ (285498569 ^ 285491209))), Class.forName(C1561oA.Kd("3+A-zCC9=\u007f\u0014FG7P$BMO", (short) (Od.Xd() ^ ((909929721 ^ 1147481190) ^ (-1918452584))))));
                try {
                    declaredMethod.setAccessible(true);
                    writableArrayCreateArray.pushArray((WritableArray) declaredMethod.invoke(this, objArr));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } else if (obj instanceof LinkedTreeMap) {
                Object[] objArr2 = {(LinkedTreeMap) obj};
                Method declaredMethod2 = Class.forName(C1561oA.Xd("x\u0006\u0005F}{\u0012\u0006\u0014\b\u0005\u000f\u0006\u0004Q\t\u0007\u001d\u0011\u001f\u0013\u0010\u001a\u0011\u000f\u0010 !_\u0016#\"#&&f\" (-#1m\u00166,08", (short) (Od.Xd() ^ (1302427690 ^ (-1302428096))))).getDeclaredMethod(Qg.kd("<8<81/\u001e;-,\u0013&4\u00171\u00182(2\"\u001d\u001d&\u001e\u0005\u0018&", (short) (OY.Xd() ^ ((217401773 ^ 272007002) ^ 482563840)), (short) (OY.Xd() ^ (1661517105 ^ 1661504285))), Class.forName(Wg.vd("boj,jspism3m~{w8x~\u0002s\u0006\u0003r~Ed~\u0005\u0007\u0002}nQEB+DT", (short) (ZN.Xd() ^ (1398499126 ^ 1398474907)))));
                try {
                    declaredMethod2.setAccessible(true);
                    writableArrayCreateArray.pushMap((WritableMap) declaredMethod2.invoke(this, objArr2));
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } else {
                continue;
            }
        }
        Intrinsics.checkNotNull(writableArrayCreateArray);
        return writableArrayCreateArray;
    }

    private final WritableMap linkedTreeMapToWriteableMap(LinkedTreeMap<?, ?> linkedTreeMap) throws Throwable {
        WritableMap writableMapCreateMap = Arguments.createMap();
        for (Map.Entry<?, ?> entry : linkedTreeMap.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                writableMapCreateMap.putNull(key.toString());
            } else if (value instanceof String) {
                writableMapCreateMap.putString(key.toString(), (String) value);
            } else if (value instanceof Integer) {
                writableMapCreateMap.putInt(key.toString(), ((Number) value).intValue());
            } else if (value instanceof Double) {
                writableMapCreateMap.putDouble(key.toString(), ((Number) value).doubleValue());
            } else if (value instanceof Boolean) {
                writableMapCreateMap.putBoolean(key.toString(), ((Boolean) value).booleanValue());
            } else if (value instanceof ArrayList) {
                String string = key.toString();
                ArrayList arrayList = (ArrayList) value;
                short sXd = (short) (C1580rY.Xd() ^ (2053577637 ^ (-2053596684)));
                short sXd2 = (short) (C1580rY.Xd() ^ (1668524914 ^ (-1668517607)));
                int[] iArr = new int["p{x8mi}o{mhpea-b^rdpb]eZVUcb\u001fS^[Z[Y\u0018QMSVJV\u00117UIKQ".length()];
                QB qb = new QB("p{x8mi}o{mhpea-b^rdpb]eZVUcb\u001fS^[Z[Y\u0018QMSVJV\u00117UIKQ");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                    i2++;
                }
                Object[] objArr = {arrayList};
                Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1561oA.yd("\u0004\u0014\u0013\u0001\u0018q\fr\u001d\u0013\u001d\r\b\b\u0011\ts$#\u0011(", (short) (Od.Xd() ^ ((410456177 ^ 1636034472) ^ (-2046095541)))), Class.forName(C1561oA.ud("_UiS\u001fecWY\u001a,\\[I`2NWW", (short) (OY.Xd() ^ ((152886496 ^ 1636327712) ^ 1754565156)))));
                try {
                    declaredMethod.setAccessible(true);
                    writableMapCreateMap.putArray(string, (WritableArray) declaredMethod.invoke(this, objArr));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } else if (value instanceof LinkedTreeMap) {
                String string2 = key.toString();
                LinkedTreeMap linkedTreeMap2 = (LinkedTreeMap) value;
                Class<?> cls = Class.forName(C1561oA.Yd("?LK\rDBXLZNKULJ\u0018OMcWeYV`WUVfg&\\ihill-hfnsiw4\\|rv~", (short) (C1633zX.Xd() ^ (394210209 ^ (-394229270)))));
                Class<?>[] clsArr = new Class[1];
                short sXd3 = (short) (C1499aX.Xd() ^ (1485642847 ^ (-1485654755)));
                short sXd4 = (short) (C1499aX.Xd() ^ ((941564037 ^ 2013504837) ^ (-1075613114)));
                int[] iArr2 = new int["+87x3<=6<6\u007f:GDD\u0005AGN@NK?K\u000e-KQOJJ;ZNO8M]".length()];
                QB qb2 = new QB("+87x3<=6<6\u007f:GDD\u0005AGN@NK?K\u000e-KQOJJ;ZNO8M]");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i3)) + sXd4);
                    i3++;
                }
                clsArr[0] = Class.forName(new String(iArr2, 0, i3));
                Object[] objArr2 = {linkedTreeMap2};
                Method declaredMethod2 = cls.getDeclaredMethod(Jg.Wd("8iJ{\u0003V\u00024t),tQI \\\u00050W}\u0006Z!/c+V", (short) (Od.Xd() ^ ((426498395 ^ 779783216) ^ (-923865387))), (short) (Od.Xd() ^ (1361746578 ^ (-1361764819)))), clsArr);
                try {
                    declaredMethod2.setAccessible(true);
                    writableMapCreateMap.putMap(string2, (WritableMap) declaredMethod2.invoke(this, objArr2));
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } else {
                continue;
            }
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public final WritableArray arrayToWritableArray(Object[] objArr) throws Throwable {
        Intrinsics.checkNotNullParameter(objArr, ZO.xd("\u001f\u001e{@&", (short) (Od.Xd() ^ (OY.Xd() ^ (-69945012))), (short) (Od.Xd() ^ (C1633zX.Xd() ^ 1951471894))));
        WritableArray writableArrayCreateArray = Arguments.createArray();
        int length = objArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = objArr[i2];
            if (obj instanceof Integer) {
                Intrinsics.checkNotNull(obj, C1626yg.Ud("N{\u000fU JJgQj^C\u0005&\u001coeGklbi\u0004_=}E@\u000f,\u001d;=\u000bmW\u0013ap6Y#AwC\t\u000b", (short) (OY.Xd() ^ (2103267951 ^ 2103251455)), (short) (OY.Xd() ^ (954681206 ^ 954683763))));
                writableArrayCreateArray.pushInt(((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                Intrinsics.checkNotNull(obj, Ig.wd("$\u007fF!* 4w\u001c\u0010\u0011$\u0013&^\u0007[U\u001d\u0012+p|I\u001b\u0010+?\u000e\u0011'\u007fv\u001bY\u0002eONg]\b6}g\rY\u00039K", (short) (C1499aX.Xd() ^ (830515357 ^ (-830523054)))));
                writableArrayCreateArray.pushDouble(((Double) obj).doubleValue());
            } else if (obj instanceof String) {
                Intrinsics.checkNotNull(obj, EO.Od("6nS7\u001b$Rf>\u000f\u0016\u001f-&d\u0002-Q\n1=k\u0002T=\f(\u001f DtC0V\u0006D\u001e\n\u000b}u\nb\u001c\u001fX\fLc\u007f", (short) (FB.Xd() ^ ((2093189425 ^ 1957731682) ^ 141760290))));
                writableArrayCreateArray.pushString((String) obj);
            } else if (obj instanceof Boolean) {
                Intrinsics.checkNotNull(obj, C1561oA.Qd("y\u007fut'ifrqqu ac\u001d_\\mm\u0018ke\u0015bb`\u001e^dZY\f_cYM\u0007QTXOKO\u000e!MLH@;G", (short) (Od.Xd() ^ (597050909 ^ (-597041154)))));
                writableArrayCreateArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof WritableMap) {
                Intrinsics.checkNotNull(obj, C1593ug.zd("@H@Au:9GHJP|@D\u007fDCVX\u0005ZV\bWYY\u0019[c[\\\u0011fldZ\u0016Zgf(a]`caopm1vjgj|7l}uqut>h\u0005|\tvx\u0004}f{\f", (short) (ZN.Xd() ^ ((1810222996 ^ 774262221) ^ 1170454542)), (short) (ZN.Xd() ^ ((478938577 ^ 1272622288) ^ 1465305621))));
                writableArrayCreateArray.pushMap((WritableMap) obj);
            } else if (obj instanceof WritableArray) {
                Intrinsics.checkNotNull(obj, C1561oA.od(")/%$V\u0019\u0016\"!!%O\u0011\u0013L\u000f\f\u001d\u001dG\u001b\u0015D\u0012\u0012\u0010M\u000e\u0014\n\t;\u000f\u0013\t|6x\u0004\u0001@wqrso{zu7zlghx1dsiceb*RlblXXaY4dcQh", (short) (OY.Xd() ^ (80502454 ^ 80494417))));
                writableArrayCreateArray.pushArray((WritableArray) obj);
            } else {
                boolean z2 = obj instanceof HashMap;
                short sXd = (short) (OY.Xd() ^ (833590543 ^ 833616947));
                int[] iArr = new int["!)!\"V\u001b\u001a()+1]!%`%$79e;7h8::y<D<=qGME;vCHNGEK\fBOMNHGYOVV\\\u00188aaOQ\\V?Td1 #\u0018#8".length()];
                QB qb = new QB("!)!\"V\u001b\u001a()+1]!%`%$79e;7h8::y<D<=qGME;vCHNGEK\fBOMNHGYOVV\\\u00188aaOQ\\V?Td1 #\u0018#8");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i3));
                    i3++;
                }
                String str = new String(iArr, 0, i3);
                if (z2) {
                    Intrinsics.checkNotNull(obj, str);
                    Object[] objArr2 = {TypeIntrinsics.asMutableMap(obj)};
                    Method method = Class.forName(Wg.Zd("1LV\u0003CO\u0011\u000e\u0007\u0006\u0011DFN\u0006Kt\u0014\u0012\f\u000eTIJ2A\\\u0007OQ\r\u0015AN\u0018\u0007M\u0016\u0007\u0017{\u0013\u001a-V\u001bJ\u001d", (short) (C1607wl.Xd() ^ (940228046 ^ 940236356)), (short) (C1607wl.Xd() ^ ((2131146452 ^ 1170525399) ^ 985796607)))).getMethod(Wg.vd("XM]B^Gc[WEGRL5JZ", (short) (FB.Xd() ^ (1321256092 ^ 1321268728))), Class.forName(C1561oA.Xd("+#9%r;;15w\u0018-=", (short) (Od.Xd() ^ (346124518 ^ (-346108974))))));
                    try {
                        method.setAccessible(true);
                        writableArrayCreateArray.pushMap((WritableMap) method.invoke(this, objArr2));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } else if (obj instanceof Map) {
                    Intrinsics.checkNotNull(obj, str);
                    Object[] objArr3 = {TypeIntrinsics.asMutableMap(obj)};
                    Method method2 = Class.forName(Qg.kd("\u0004\u000f\fK\u0001|\u0011\u0003\u000f\u0001{\u0004xt@uq\u0006w\u0004upxmihvu2fqnmnl+d`fi]i$Jh\\^d", (short) (ZN.Xd() ^ ((263116788 ^ 2007307453) ^ 2014038523)), (short) (ZN.Xd() ^ (2020462861 ^ 2020442770)))).getMethod(C1561oA.ud("!\u0014\"\u0005\u001f\u0006 \u0016 \f\f\u0015\rs\u0007\u0015", (short) (C1607wl.Xd() ^ (2140465286 ^ 2140465659))), Class.forName(hg.Vd("qg{e1wuik,J]k", (short) (OY.Xd() ^ ((434245321 ^ 539213124) ^ 968987022)), (short) (OY.Xd() ^ (897115126 ^ 897095205)))));
                    try {
                        method2.setAccessible(true);
                        writableArrayCreateArray.pushMap((WritableMap) method2.invoke(this, objArr3));
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } else if (TypeIntrinsics.isMutableMap(obj)) {
                    Object obj2 = objArr[i2];
                    Intrinsics.checkNotNull(obj2, str);
                    Map mapAsMutableMap = TypeIntrinsics.asMutableMap(obj2);
                    short sXd2 = (short) (C1499aX.Xd() ^ ((438072799 ^ 1423937238) ^ (-1321464787)));
                    int[] iArr2 = new int["\r\u001a\u0019Z\u0012\u0010&\u001a\u0018\f\t\u0013\n\bU\r\u001b1%3'$.%\u0013\u0014$%c\u001a'&7::z64<A'5q\u001a:04<".length()];
                    QB qb2 = new QB("\r\u001a\u0019Z\u0012\u0010&\u001a\u0018\f\t\u0013\n\bU\r\u001b1%3'$.%\u0013\u0014$%c\u001a'&7::z64<A'5q\u001a:04<");
                    int i4 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i4));
                        i4++;
                    }
                    Object[] objArr4 = {mapAsMutableMap};
                    Method method3 = Class.forName(new String(iArr2, 0, i4)).getMethod(Xg.qd("~s\u0004h\u0005m\n\u0002\u000e{}\t\u0003k\u0001\u0011", (short) (C1499aX.Xd() ^ (355033362 ^ (-355034995))), (short) (C1499aX.Xd() ^ ((11316038 ^ 1324042106) ^ (-1313339410)))), Class.forName(C1561oA.Yd("<4J6\u0004LLBF\t)>N", (short) (Od.Xd() ^ (654278367 ^ (-654255440))))));
                    try {
                        method3.setAccessible(true);
                        writableArrayCreateArray.pushMap((WritableMap) method3.invoke(this, objArr4));
                    } catch (InvocationTargetException e4) {
                        throw e4.getCause();
                    }
                } else if (obj instanceof Object[]) {
                    Object obj3 = objArr[i2];
                    Intrinsics.checkNotNull(obj3, Jg.Wd("\u0003\b \u007fUv\u0014~!\u0002(7\u001c|Z{\u001c*LUN'~+N-\r,S(K\\S\\tG&OtUoLr\u0010K\u001a{\u000b\u0005\u0005R\u0005", (short) (C1499aX.Xd() ^ ((440952593 ^ 496604172) ^ (-131171712))), (short) (C1499aX.Xd() ^ ((1512760864 ^ 1367877201) ^ (-195227470)))));
                    Object[] objArr5 = {(Object[]) obj3};
                    Method method4 = Class.forName(ZO.xd("B\\qGO`\u0018$\f.r\u00108[_\b\\|u=%^J\u001b*{*\u001bH[\u0005!:e~OjD.aqjJ3m\u0005b\u0004", (short) (Od.Xd() ^ ((1141602026 ^ 1783282006) ^ (-776056413))), (short) (Od.Xd() ^ (821919854 ^ (-821932020))))).getMethod(C1626yg.Ud("0\u0001}b\u001a\u001c Gh\u0015Ll/<oKGo\u0003r", (short) (C1607wl.Xd() ^ ((810212074 ^ 794547836) ^ 521222091)), (short) (C1607wl.Xd() ^ (826500389 ^ 826490661))), Object[].class);
                    try {
                        method4.setAccessible(true);
                        writableArrayCreateArray.pushArray((WritableArray) method4.invoke(this, objArr5));
                    } catch (InvocationTargetException e5) {
                        throw e5.getCause();
                    }
                } else {
                    writableArrayCreateArray.pushNull();
                }
            }
        }
        Intrinsics.checkNotNull(writableArrayCreateArray);
        return writableArrayCreateArray;
    }

    public final WritableMap mapBaseResponseSuccessConsumeGeneric(BaseResponse baseResponse) {
        Intrinsics.checkNotNullParameter(baseResponse, Ig.wd("OttNTv[5", (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ (436944673 ^ 1951346586)))));
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(EO.Od("'R~(j,\u0007", (short) (C1633zX.Xd() ^ (2007624522 ^ (-2007620553)))), baseResponse.headers);
        writableMapCreateMap.putString(C1561oA.Qd("\u007f\u007fk}}zIthh", (short) (OY.Xd() ^ ((314465188 ^ 1287195974) ^ 1577545618))), baseResponse.additionalData.toString());
        if (baseResponse.additionalData != null) {
            Map map = baseResponse.additionalData;
            short sXd = (short) (FB.Xd() ^ (1298488026 ^ 1298473894));
            short sXd2 = (short) (FB.Xd() ^ (540547905 ^ 540554689));
            int[] iArr = new int["\"*\"#W\u001c\u001b)*,2^\"&a&%8:f<8i9;;z=E=>rHNF<wDIOHFL\rCPNOIHZPWW]\u00199N^+\u001a\u001d\u0012\u001d2".length()];
            QB qb = new QB("\"*\"#W\u001c\u001b)*,2^\"&a&%8:f<8i9;;z=E=>rHNF<wDIOHFL\rCPNOIHZPWW]\u00199N^+\u001a\u001d\u0012\u001d2");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                i2++;
            }
            Intrinsics.checkNotNull(map, new String(iArr, 0, i2));
            for (Map.Entry entry : map.entrySet()) {
                writableMapCreateMap.putString(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
            }
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public final WritableMap mapBiometricModelResponse(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, C1561oA.od("ZLYUSQUF", (short) (OY.Xd() ^ (OY.Xd() ^ 69957023))));
        WritableMap writableMapCreateMap = Arguments.createMap();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            if (entry.getValue() instanceof String) {
                writableMapCreateMap.putString(key, String.valueOf(map.get(String.valueOf(key))));
            }
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public final WritableMap mapCoreErrorModelResponse(CoreErrorModelResponse coreErrorModelResponse) {
        Intrinsics.checkNotNullParameter(coreErrorModelResponse, C1561oA.Kd("0$31117*", (short) (C1633zX.Xd() ^ (ZN.Xd() ^ (1082946070 ^ (-1929797440))))));
        WritableMap writableMapCreateMap = Arguments.createMap();
        Integer num = coreErrorModelResponse.httpErrorCode;
        String strZd = Wg.Zd("\"CXi3u\u000b\u001d\u0005j,6,", (short) (C1633zX.Xd() ^ ((1055472499 ^ 682634446) ^ (-374933573))), (short) (C1633zX.Xd() ^ ((1786916170 ^ 1947670729) ^ (-513104180))));
        Intrinsics.checkNotNullExpressionValue(num, strZd);
        writableMapCreateMap.putInt(strZd, num.intValue());
        Integer num2 = coreErrorModelResponse.internalErrorCode;
        String strXd = C1561oA.Xd("8>E7EB6B\u001cJKIM\u001fLBD", (short) (FB.Xd() ^ ((1416301738 ^ 1961932542) ^ 547067053)));
        Intrinsics.checkNotNullExpressionValue(num2, strXd);
        writableMapCreateMap.putInt(strXd, num2.intValue());
        short sXd = (short) (C1580rY.Xd() ^ (FB.Xd() ^ (145657794 ^ (-1463915949))));
        int[] iArr = new int["f_noV]\\".length()];
        QB qb = new QB("f_noV]\\");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        writableMapCreateMap.putString(new String(iArr, 0, i2), coreErrorModelResponse.errorMessage);
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public final WritableMap mapCoreGenericModelResponse(CoreGenericModelResponse coreGenericModelResponse) {
        Intrinsics.checkNotNullParameter(coreGenericModelResponse, Qg.kd("SERNLJN?", (short) (C1633zX.Xd() ^ (C1607wl.Xd() ^ (-1849972058))), (short) (C1633zX.Xd() ^ (1252968893 ^ (-1252973416)))));
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(hg.Vd("(\u0019%(\u001a\u0013\u0014{\u000e\u0019\u0010", (short) (C1633zX.Xd() ^ (OY.Xd() ^ (844117786 ^ (-914044379)))), (short) (C1633zX.Xd() ^ ((37193150 ^ 1881673209) ^ (-1914668303)))), coreGenericModelResponse.serviceName);
        Integer num = coreGenericModelResponse.statusCode;
        String strUd = C1561oA.ud("}}i{{xGrff", (short) (OY.Xd() ^ (366523239 ^ 366522052)));
        Intrinsics.checkNotNullExpressionValue(num, strUd);
        writableMapCreateMap.putInt(strUd, num.intValue());
        writableMapCreateMap.putString(C1561oA.yd(":1>=*/,", (short) (C1580rY.Xd() ^ (FB.Xd() ^ (7800471 ^ (-1603802190))))), coreGenericModelResponse.message);
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public final WritableMap mapErrorEmvco(String str, int i2) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (str != null) {
            writableMapCreateMap.putString(C1561oA.Yd("ZSbcRYX9ghfj", (short) (C1633zX.Xd() ^ (OY.Xd() ^ (-69931904)))), str);
        }
        short sXd = (short) (FB.Xd() ^ (C1499aX.Xd() ^ (-1134233023)));
        short sXd2 = (short) (FB.Xd() ^ (706389481 ^ 706392163));
        int[] iArr = new int["}\u0004{qR\u0001\u0002\u007f\u0004".length()];
        QB qb = new QB("}\u0004{qR\u0001\u0002\u007f\u0004");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) + sXd2);
            i3++;
        }
        writableMapCreateMap.putInt(new String(iArr, 0, i3), i2);
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public final WritableMap mapResponseSuccessClientHello(ClientHelloModelResponse clientHelloModelResponse) {
        Intrinsics.checkNotNullParameter(clientHelloModelResponse, Jg.Wd("o'w\u001f~\u001bm\u001c", (short) (C1633zX.Xd() ^ ((399152045 ^ 1306164779) ^ (-1511051516))), (short) (C1633zX.Xd() ^ ((784344852 ^ 1202562008) ^ (-1768796958)))));
        WritableMap writableMapCreateMap = Arguments.createMap();
        Boolean bool = clientHelloModelResponse.allowLoginOnUnassignedDevice;
        int iXd = C1580rY.Xd() ^ (495698303 ^ (-738381321));
        String strXd = ZO.xd("IP<(B)[Ug|aJ'%Q!HQ4<5\u0016\t\to\n\u0002\n", (short) (C1607wl.Xd() ^ (1907698893 ^ 1907719287)), (short) (C1607wl.Xd() ^ iXd));
        Intrinsics.checkNotNullExpressionValue(bool, strXd);
        writableMapCreateMap.putBoolean(strXd, bool.booleanValue());
        Boolean bool2 = clientHelloModelResponse.deviceAssigned;
        String strUd = C1626yg.Ud("=C\u0013[\\n\u001eC6a1qP\u000e", (short) (C1499aX.Xd() ^ (463199787 ^ (-463203996))), (short) (C1499aX.Xd() ^ ((1362337625 ^ 551619591) ^ (-1909623044))));
        Intrinsics.checkNotNullExpressionValue(bool2, strUd);
        writableMapCreateMap.putBoolean(strUd, bool2.booleanValue());
        Boolean bool3 = clientHelloModelResponse.userExists;
        short sXd = (short) (C1607wl.Xd() ^ ((1115321926 ^ 845755079) ^ 1880295557));
        int[] iArr = new int["\u00159)\u0016_>[\rK6".length()];
        QB qb = new QB("\u00159)\u0016_>[\rK6");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        Intrinsics.checkNotNullExpressionValue(bool3, str);
        writableMapCreateMap.putBoolean(str, bool3.booleanValue());
        Boolean bool4 = clientHelloModelResponse.userHasBiometry;
        short sXd2 = (short) (ZN.Xd() ^ (FB.Xd() ^ (540650803 ^ 2144777038)));
        int[] iArr2 = new int["8\f\u000e9H7eC2\f\f]8<'".length()];
        QB qb2 = new QB("8\f\u000e9H7eC2\f\f]8<'");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + i3)) + xuXd2.CK(iKK2));
            i3++;
        }
        String str2 = new String(iArr2, 0, i3);
        Intrinsics.checkNotNullExpressionValue(bool4, str2);
        writableMapCreateMap.putBoolean(str2, bool4.booleanValue());
        writableMapCreateMap.putInt(C1561oA.Qd("liZfFfRdT", (short) (Od.Xd() ^ (ZN.Xd() ^ (1936954252 ^ (-1090107862))))), clientHelloModelResponse.userState);
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public final WritableMap mapResponseSuccessConsumeGeneric(CoreGenericBridgeModelResponse coreGenericBridgeModelResponse) throws Throwable {
        String strZd = C1593ug.zd("QETRRRXK", (short) (C1633zX.Xd() ^ (C1633zX.Xd() ^ 1951478943)), (short) (C1633zX.Xd() ^ ((1789101996 ^ 2120799475) ^ (-348863702))));
        Intrinsics.checkNotNullParameter(coreGenericBridgeModelResponse, strZd);
        Gson gson = new Gson();
        WritableMap writableMapCreateMap = Arguments.createMap();
        Type type = new TypeToken<Map<String, ? extends String>>() { // from class: com.davivienda.daviviendaapp.common.helper.Utils$mapResponseSuccessConsumeGeneric$type$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, C1561oA.od("&#1\u00104*\u001e_dcb\\", (short) (OY.Xd() ^ (1690361069 ^ 1690367513))));
        Map<String, Object> map = coreGenericBridgeModelResponse.response;
        Intrinsics.checkNotNullExpressionValue(map, strZd);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                if (value instanceof Boolean) {
                    Intrinsics.checkNotNull(key);
                    writableMapCreateMap.putBoolean(key, ((Boolean) value).booleanValue());
                }
                if (value instanceof Integer) {
                    Intrinsics.checkNotNull(key);
                    writableMapCreateMap.putInt(key, ((Number) value).intValue());
                }
                if (value instanceof Double) {
                    Intrinsics.checkNotNull(key);
                    writableMapCreateMap.putDouble(key, ((Number) value).doubleValue());
                }
                if (value instanceof String) {
                    Intrinsics.checkNotNull(key);
                    writableMapCreateMap.putString(key, (String) value);
                }
                if (value instanceof ArrayList) {
                    Intrinsics.checkNotNull(key);
                    Class<?> cls = Class.forName(C1561oA.Kd("lyx:qo\u0006y\b{x\u0003ywE|z\u0011\u0005\u0013\u0007\u0004\u000e\u0005\u0003\u0004\u0014\u0015S\n\u0017\u0016\u0017\u001a\u001aZ\u0016\u0014\u001c!\u0017%a\n* $,", (short) (C1580rY.Xd() ^ (1872402166 ^ (-1872413920)))));
                    Class<?>[] clsArr = {Class.forName(Wg.Zd("v%,ZXkb#O~aJ\u001anVVKAk", (short) (C1580rY.Xd() ^ (1268381276 ^ (-1268359213))), (short) (C1580rY.Xd() ^ ((99690647 ^ 2078150463) ^ (-2117025922)))))};
                    Object[] objArr = {(ArrayList) value};
                    short sXd = (short) (C1499aX.Xd() ^ (260280735 ^ (-260288023)));
                    int[] iArr = new int[".@A1J&B+G?K=:<GA\u001ePQAZ".length()];
                    QB qb = new QB(".@A1J&B+G?K=:<GA\u001ePQAZ");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                        i2++;
                    }
                    Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
                    try {
                        declaredMethod.setAccessible(true);
                        writableMapCreateMap.putArray(key, (WritableArray) declaredMethod.invoke(this, objArr));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                if (value instanceof LinkedTreeMap) {
                    Intrinsics.checkNotNull(key);
                    LinkedTreeMap linkedTreeMap = (LinkedTreeMap) value;
                    Class<?> cls2 = Class.forName(Wg.vd("-85t*&:,H:5=2.y/;OAM?:B7CBPO\f@KH\u0017\u0018\u0016T\u000e\n\u0010\u0013\u0017#]\u0004\"\u0016\u0018\u001e", (short) (C1633zX.Xd() ^ ((313385138 ^ 2027190561) ^ (-1786360640)))));
                    Class<?>[] clsArr2 = new Class[1];
                    short sXd2 = (short) (ZN.Xd() ^ ((192957748 ^ 1181170546) ^ 1306994441));
                    short sXd3 = (short) (ZN.Xd() ^ ((1509643533 ^ 1232819481) ^ 276824413));
                    int[] iArr2 = new int["|\b\u0005D|\u0004\u0003y}u=u\u0001{y8rv{kwrdn/Lhlha_Nk]\\CVd".length()];
                    QB qb2 = new QB("|\b\u0005D|\u0004\u0003y}u=u\u0001{y8rv{kwrdn/Lhlha_Nk]\\CVd");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
                        i3++;
                    }
                    clsArr2[0] = Class.forName(new String(iArr2, 0, i3));
                    Object[] objArr2 = {linkedTreeMap};
                    short sXd4 = (short) (C1633zX.Xd() ^ ((2082285445 ^ 2134344981) ^ (-53124257)));
                    short sXd5 = (short) (C1633zX.Xd() ^ (1767503952 ^ (-1767478383)));
                    int[] iArr3 = new int["\u0019\u0015\u0019\u0015\u000e\fz\u0018\n\to\u0003\u0011s\u000et\u000f\u0005\u000f~yy\u0003zat\u0003".length()];
                    QB qb3 = new QB("\u0019\u0015\u0019\u0015\u000e\fz\u0018\n\to\u0003\u0011s\u000et\u000f\u0005\u000f~yy\u0003zat\u0003");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(sXd4 + i4 + xuXd3.CK(iKK3) + sXd5);
                        i4++;
                    }
                    Method declaredMethod2 = cls2.getDeclaredMethod(new String(iArr3, 0, i4), clsArr2);
                    try {
                        declaredMethod2.setAccessible(true);
                        writableMapCreateMap.putMap(key, (WritableMap) declaredMethod2.invoke(this, objArr2));
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } else {
                    continue;
                }
            } else {
                Intrinsics.checkNotNull(key);
                writableMapCreateMap.putNull(key);
            }
        }
        if (coreGenericBridgeModelResponse.headers != null) {
            Object objFromJson = gson.fromJson(coreGenericBridgeModelResponse.headers, type);
            Intrinsics.checkNotNullExpressionValue(objFromJson, C1561oA.ud("\u0002\r\t\u0006a\n\u0005\u0003;@?>8", (short) (C1633zX.Xd() ^ ((1945200851 ^ 2108451834) ^ (-240986588)))));
            for (Map.Entry entry2 : ((Map) objFromJson).entrySet()) {
                String str = (String) entry2.getKey();
                String str2 = (String) entry2.getValue();
                if (str2 instanceof String) {
                    writableMapCreateMap.putString(str, str2);
                }
            }
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public final WritableMap mapResponseSuccessDocumentType(DocumentTypeResponse documentTypeResponse) {
        Intrinsics.checkNotNullParameter(documentTypeResponse, C1561oA.yd("G9FB@>B3", (short) (C1633zX.Xd() ^ (359730049 ^ (-359741843)))));
        WritableMap writableMapCreateMap = Arguments.createMap();
        for (DocumentType documentType : documentTypeResponse.documentTypes) {
            writableMapCreateMap.putString(C1561oA.Yd("\"\u001e", (short) (FB.Xd() ^ (742212407 ^ 742226198))), documentType.id);
            writableMapCreateMap.putString(Xg.qd("\u0017\u000b\u0018\u0011", (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ 1134251391)), (short) (C1633zX.Xd() ^ ((51273872 ^ 1471649887) ^ (-1421464641)))), documentType.name);
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public final WritableArray mapResponseSuccessSetup(CoreGenericBridgeModelResponse coreGenericBridgeModelResponse) {
        short sXd = (short) (Od.Xd() ^ ((244494159 ^ 46972165) ^ (-207489170)));
        short sXd2 = (short) (Od.Xd() ^ ((1885342099 ^ 1834497396) ^ (-490227671)));
        int[] iArr = new int["H\u0015\\\u0013s*l<".length()];
        QB qb = new QB("H\u0015\\\u0013s*l<");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        Intrinsics.checkNotNullParameter(coreGenericBridgeModelResponse, str);
        Gson gson = new Gson();
        WritableMap writableMapCreateMap = Arguments.createMap();
        Type type = new TypeToken<Map<String, ? extends String>>() { // from class: com.davivienda.daviviendaapp.common.helper.Utils$mapResponseSuccessSetup$type$1
        }.getType();
        short sXd3 = (short) (OY.Xd() ^ (C1499aX.Xd() ^ (-1134261462)));
        short sXd4 = (short) (OY.Xd() ^ ((1535476080 ^ 427719348) ^ 1123784634));
        int[] iArr2 = new int["Lq\u0001bdOw\u007fz^=u".length()];
        QB qb2 = new QB("Lq\u0001bdOw\u007fz^=u");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd4) + sXd3)));
            i3++;
        }
        Intrinsics.checkNotNullExpressionValue(type, new String(iArr2, 0, i3));
        Map<String, Object> map = coreGenericBridgeModelResponse.response;
        Intrinsics.checkNotNullExpressionValue(map, str);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                Intrinsics.checkNotNull(key);
                writableMapCreateMap.putString(key, (String) value);
            }
            if (value instanceof ArrayList) {
                WritableArray writableArrayCreateArray = Arguments.createArray();
                for (Object obj : (ArrayList) value) {
                    if (obj instanceof LinkedTreeMap) {
                        WritableMap writableMapCreateMap2 = Arguments.createMap();
                        for (Map.Entry entry2 : ((Map) obj).entrySet()) {
                            writableMapCreateMap2.putString(entry2.getKey().toString(), entry2.getValue().toString());
                        }
                        writableArrayCreateArray.pushMap(writableMapCreateMap2);
                    }
                }
                Intrinsics.checkNotNull(key);
                writableMapCreateMap.putArray(key, writableArrayCreateArray);
            }
        }
        if (coreGenericBridgeModelResponse.headers != null) {
            Object objFromJson = gson.fromJson(coreGenericBridgeModelResponse.headers, type);
            int iXd = C1499aX.Xd() ^ (1154489195 ^ (-122368511));
            Intrinsics.checkNotNullExpressionValue(objFromJson, C1626yg.Ud("?\u0003uZ\u0010\u0005\f\n!WjI{", (short) (OY.Xd() ^ (892794105 ^ 892774028)), (short) (OY.Xd() ^ iXd)));
            for (Map.Entry entry3 : ((Map) objFromJson).entrySet()) {
                String str2 = (String) entry3.getKey();
                String str3 = (String) entry3.getValue();
                if (str3 instanceof String) {
                    writableMapCreateMap.putString(str2, str3);
                }
            }
        }
        WritableArray writableArrayCreateArray2 = Arguments.createArray();
        writableArrayCreateArray2.pushMap(writableMapCreateMap);
        Intrinsics.checkNotNull(writableArrayCreateArray2);
        return writableArrayCreateArray2;
    }

    public final WritableMap mapToWritableMap(Map<?, ?> map) throws Throwable {
        Intrinsics.checkNotNullParameter(map, Ig.wd("4ZW", (short) (OY.Xd() ^ ((10176309 ^ 1329728111) ^ 1339638539))));
        WritableMap writableMapCreateMap = Arguments.createMap();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof String) {
                String strValueOf = String.valueOf(entry.getKey());
                Object value2 = entry.getValue();
                Intrinsics.checkNotNull(value2, EO.Od("X(-To`B?\u001esr\u007f\r\u000e4Z%\u001df:M\u0011+}](E?,qUk \fl\u00145dA\\X}M\u0003\u001f,.U|\u001e", (short) (C1633zX.Xd() ^ ((694184058 ^ 1295887573) ^ (-1683879496)))));
                writableMapCreateMap.putString(strValueOf, (String) value2);
            } else if (value instanceof Boolean) {
                String strValueOf2 = String.valueOf(entry.getKey());
                Object value3 = entry.getValue();
                Intrinsics.checkNotNull(value3, C1561oA.Qd("flba\u0014VS_^^b\rNP\nLIZZ\u0005XR\u0002OOM\u000bKQGFxLPF:s>AE<8<z\u000e:95-(4", (short) (ZN.Xd() ^ (1438793930 ^ 1438794635))));
                writableMapCreateMap.putBoolean(strValueOf2, ((Boolean) value3).booleanValue());
            } else if (value instanceof Double) {
                String strValueOf3 = String.valueOf(entry.getKey());
                Object value4 = entry.getValue();
                short sXd = (short) (Od.Xd() ^ ((2051557248 ^ 1132662842) ^ (-969614871)));
                short sXd2 = (short) (Od.Xd() ^ ((340249709 ^ 585918083) ^ (-917215456)));
                int[] iArr = new int["x\u0001xy.rq\u007f\u0001\u0003\t5x|8|{\u000f\u0011=\u0013\u000f@\u0010\u0012\u0012Q\u0014\u001c\u0014\u0015I\u001f%\u001d\u0013N\u001b &\u001f\u001d#cz'.\u001c'!".length()];
                QB qb = new QB("x\u0001xy.rq\u007f\u0001\u0003\t5x|8|{\u000f\u0011=\u0013\u000f@\u0010\u0012\u0012Q\u0014\u001c\u0014\u0015I\u001f%\u001d\u0013N\u001b &\u001f\u001d#cz'.\u001c'!");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                    i2++;
                }
                Intrinsics.checkNotNull(value4, new String(iArr, 0, i2));
                writableMapCreateMap.putDouble(strValueOf3, ((Double) value4).doubleValue());
            } else if (value instanceof Integer) {
                String strValueOf4 = String.valueOf(entry.getKey());
                Object value5 = entry.getValue();
                Intrinsics.checkNotNull(value5, C1561oA.od("\u0005\u000b\u0001\u007f2tq}||\u0001+ln(jgxx#vp mmk)ioed\u0017jndX\u0012\\_cZVZ\u00193W\\", (short) (C1580rY.Xd() ^ (391533339 ^ (-391527929)))));
                writableMapCreateMap.putInt(strValueOf4, ((Integer) value5).intValue());
            } else if (value instanceof WritableMap) {
                String strValueOf5 = String.valueOf(entry.getKey());
                Object value6 = entry.getValue();
                Intrinsics.checkNotNull(value6, C1561oA.Kd("MUMN\u0003GFTUW]\nMQ\rQPce\u0012gc\u0015dff&hphi\u001esyqg#gts5njmpn|}z>\u0004wtw\nDy\u000b\u0003~\u0003\u0002Ku\u0012\n\u0016\u0004\u0006\u0011\u000bs\t\u0019", (short) (C1580rY.Xd() ^ ((1638311150 ^ 1701604941) ^ (-80401956)))));
                writableMapCreateMap.putMap(strValueOf5, (WritableMap) value6);
            } else if (value instanceof WritableArray) {
                String strValueOf6 = String.valueOf(entry.getKey());
                Object value7 = entry.getValue();
                Intrinsics.checkNotNull(value7, Wg.Zd("\u0016zk\"WPI4^]\u0014>:<PI:\u0002}^5\u000fp=heV\u0016~,&\u0010V\u0019\u0003UJ\fIF8g<sx+2pVwm^\u0015\u0015`\u0010\u0016\\M~\u0004?z\u0002G<\u0001d''z\f0mN%", (short) (OY.Xd() ^ ((1417154217 ^ 1049555849) ^ 1794571277)), (short) (OY.Xd() ^ ((809502139 ^ 159426511) ^ 968920133))));
                writableMapCreateMap.putArray(strValueOf6, (WritableArray) value7);
            } else if (value instanceof Map) {
                String strValueOf7 = String.valueOf(entry.getKey());
                Utils utils = INSTANCE;
                Object value8 = entry.getValue();
                Intrinsics.checkNotNull(value8, C1561oA.Xd("\u0006\u000e\u0006\u0007;\u007f~\r\u000e\u0010\u0016B\u0006\nE\n\t\u001c\u001eJ \u001cM\u001d\u001f\u001f^!)!\"V,2* [(-3,*0p'423-,>4;;A|\u001dFF46A;$9I\u0016\u0005\b|\b\u001d", (short) (FB.Xd() ^ ((1428467094 ^ 84303868) ^ 1344443871))));
                Object[] objArr = {TypeIntrinsics.asMutableMap(value8)};
                Method method = Class.forName(Wg.vd("\b\u0013\u0010O\u0005\u0001\u0015\u0007\u0013\u0005\u007f\b|xDyu\n{\byt|qmlzy6jurqrp/hdjmam(Nl`bh", (short) (Od.Xd() ^ (1838210440 ^ (-1838218083))))).getMethod(hg.Vd("@3A$>%?5?++4,\u0013&4", (short) (C1607wl.Xd() ^ ((569695635 ^ 177955178) ^ 728757497)), (short) (C1607wl.Xd() ^ ((1658593965 ^ 966573340) ^ 1530964026))), Class.forName(Qg.kd("\u0015\u000b\u001f\tT\u001b\u0019\r\u000fOm\u0001\u000f", (short) (C1607wl.Xd() ^ ((1156981477 ^ 195961209) ^ 1331171520)), (short) (C1607wl.Xd() ^ ((487267517 ^ 1530502412) ^ 1177737585)))));
                try {
                    method.setAccessible(true);
                    writableMapCreateMap.putMap(strValueOf7, (WritableMap) method.invoke(utils, objArr));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } else if (value instanceof Object[]) {
                String strValueOf8 = String.valueOf(entry.getKey());
                Utils utils2 = INSTANCE;
                Object value9 = entry.getValue();
                Intrinsics.checkNotNull(value9, C1561oA.ud("pvlk\u001e`]ihhl\u0017XZ\u0014VSdd\u000fb\\\fYYW\u0015U[QP\u0003VZPD}HKOFBF\u0005\u0017GF4K\ry\r", (short) (C1633zX.Xd() ^ (2034099170 ^ (-2034100554)))));
                Object[] objArr2 = {(Object[]) value9};
                Method method2 = Class.forName(C1561oA.yd("4A@\u00021/E9OC@J97\u0005<\"8,:&#-$*+;<r)65\u001e!!a\u0015\u0013\u001b \u001e,h\u0011)\u001f#+", (short) (C1633zX.Xd() ^ ((498530738 ^ 1136944841) ^ (-1584592252))))).getMethod(C1561oA.Yd("&89)B\u001e:#?7C13>8\u0015GH8Q", (short) (FB.Xd() ^ (1001023365 ^ 1001015305))), Object[].class);
                try {
                    method2.setAccessible(true);
                    writableMapCreateMap.putArray(strValueOf8, (WritableArray) method2.invoke(utils2, objArr2));
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } else {
                writableMapCreateMap.putNull(String.valueOf(entry.getKey()));
            }
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public final WritableMap toParseDataAmount(DataAmount dataAmount) {
        int iXd = C1580rY.Xd() ^ 831087756;
        Intrinsics.checkNotNullParameter(dataAmount, Xg.qd(", /---3&", (short) (C1580rY.Xd() ^ ((1962501262 ^ 1709921933) ^ (-286424644))), (short) (C1580rY.Xd() ^ iXd)));
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(Jg.Wd("\u001c%\u0010", (short) (C1633zX.Xd() ^ (433157300 ^ (-433142240))), (short) (C1633zX.Xd() ^ ((2138432523 ^ 613977692) ^ (-1542284316)))), String.valueOf(dataAmount.getIva()));
        String strValueOf = String.valueOf(dataAmount.getInc());
        int iXd2 = FB.Xd() ^ (-1609523493);
        writableMapCreateMap.putString(ZO.xd("Gm^", (short) (C1633zX.Xd() ^ (373463868 ^ (-373467707))), (short) (C1633zX.Xd() ^ iXd2)), strValueOf);
        String strValueOf2 = String.valueOf(dataAmount.getTransactionAmount());
        int iXd3 = C1499aX.Xd() ^ (-1134255376);
        int iXd4 = C1607wl.Xd() ^ (2102207471 ^ 319373132);
        short sXd = (short) (FB.Xd() ^ iXd3);
        short sXd2 = (short) (FB.Xd() ^ iXd4);
        int[] iArr = new int["?_v\u0017\u00035b5q\u000b`\u0007w\u001f\u0010?o".length()];
        QB qb = new QB("?_v\u0017\u00035b5q\u000b`\u0007w\u001f\u0010?o");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        writableMapCreateMap.putString(new String(iArr, 0, i2), strValueOf2);
        writableMapCreateMap.putString(Ig.wd("`/\u0013a}dv5V]", (short) (C1607wl.Xd() ^ (Od.Xd() ^ 1207806763))), String.valueOf(dataAmount.getBaseAmount()));
        writableMapCreateMap.putString(EO.Od("@lc0[}6g\u0019\u0016\u001a", (short) (C1633zX.Xd() ^ (FB.Xd() ^ (-1609523907)))), String.valueOf(dataAmount.getTotalAmount()));
        String strValueOf3 = String.valueOf(dataAmount.getTip());
        short sXd3 = (short) (C1633zX.Xd() ^ (C1607wl.Xd() ^ (1732711465 ^ (-151224316))));
        int[] iArr2 = new int["\u0016\n\u0010".length()];
        QB qb2 = new QB("\u0016\n\u0010");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        writableMapCreateMap.putString(new String(iArr2, 0, i3), strValueOf3);
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public final WritableMap toParseSuccessQrScaned(QrEntity qrEntity) {
        Intrinsics.checkNotNullParameter(qrEntity, C1593ug.zd("$\u0018'%%%+\u001e", (short) (C1607wl.Xd() ^ (C1633zX.Xd() ^ (917081184 ^ (-1123585699)))), (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (-831070988)))));
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        WritableMap writableMapCreateMap3 = Arguments.createMap();
        WritableMap writableMapCreateMap4 = Arguments.createMap();
        WritableMap writableMapCreateMap5 = Arguments.createMap();
        writableMapCreateMap4.putString(C1561oA.od("pdphu`ebLm__]i[cWX", (short) (Od.Xd() ^ ((683639534 ^ 372417035) ^ (-1049456253)))), qrEntity.getMerchantInformationLanguageC().getLanguagePreference());
        writableMapCreateMap4.putString(C1561oA.Kd("\u000b\u0004\u0012\u0004\n\u0004\u0012\u0019s\b\u0015\u000ej\u0017 \u0012 \u001d\u0011%\u0017~\u0015#\u001d,\u0019 \u001f", (short) (Od.Xd() ^ (C1633zX.Xd() ^ 1951494227))), qrEntity.getMerchantInformationLanguageC().getMerchantNameAlternateLanguage());
        String merchantCityAlternateLanguage = qrEntity.getMerchantInformationLanguageC().getMerchantCityAlternateLanguage();
        int iXd = FB.Xd() ^ (372387483 ^ 1239251094);
        writableMapCreateMap4.putString(Wg.Zd("1\u0001fN+-`Nur\u0014Qo#Sk\u0011dn:An,ap\u0018[\u0018/", (short) (FB.Xd() ^ ((1896966432 ^ 372569208) ^ 1730533388)), (short) (FB.Xd() ^ iXd)), merchantCityAlternateLanguage);
        writableMapCreateMap3.putString(C1561oA.Xd("b^<_nshrft", (short) (C1633zX.Xd() ^ (1439876517 ^ (-1439877174)))), qrEntity.getMerchantAccountInformationC().getIdAcquirer());
        writableMapCreateMap3.putString(Wg.vd("\u0012\n\b\u000f\u000e|]\txxcz\u0003rzr\u001b ", (short) (OY.Xd() ^ (OY.Xd() ^ 69949490))), qrEntity.getMerchantAccountInformationC().getUniqueCodeMerchant());
        String uniqueCodeMerchantAggre = qrEntity.getMerchantAccountInformationC().getUniqueCodeMerchantAggre();
        int iXd2 = C1607wl.Xd() ^ (2125385516 ^ 283830569);
        writableMapCreateMap3.putString(Qg.kd("C;5<?.\u000b6**\u0011(4$( ,1|\"!+\u001d", (short) (FB.Xd() ^ (857988100 ^ 857993337)), (short) (FB.Xd() ^ iXd2)), uniqueCodeMerchantAggre);
        String billNumber = qrEntity.getMerchantAdditionalDataC().getBillNumber();
        int iXd3 = FB.Xd() ^ (151053567 ^ (-1458542928));
        writableMapCreateMap2.putString(hg.Vd("jprqRxoceq", (short) (C1499aX.Xd() ^ ((686665986 ^ 1509847194) ^ (-1897106479))), (short) (C1499aX.Xd() ^ iXd3)), billNumber);
        writableMapCreateMap2.putString(C1561oA.ud("\u001e\u001f\u0011\u0017\u0019\u0011x\u001f\u0016\n\f\u0018", (short) (FB.Xd() ^ (672809814 ^ 672798723))), qrEntity.getMerchantAdditionalDataC().getMobileNumber());
        String storeLabel = qrEntity.getMerchantAdditionalDataC().getStoreLabel();
        short sXd = (short) (Od.Xd() ^ (C1633zX.Xd() ^ 1951495590));
        int[] iArr = new int["\"$ $\u0018\u007f\u0016\u0018\f\u0014".length()];
        QB qb = new QB("\"$ $\u0018\u007f\u0016\u0018\f\u0014");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        writableMapCreateMap2.putString(new String(iArr, 0, i2), storeLabel);
        writableMapCreateMap2.putString(C1561oA.Yd("<@K4@IO%MF<@N", (short) (FB.Xd() ^ ((379590097 ^ 741247403) ^ 982423633))), qrEntity.getMerchantAdditionalDataC().getLoyaltyNumber());
        String referenceLabel = qrEntity.getMerchantAdditionalDataC().getReferenceLabel();
        int iXd4 = Od.Xd() ^ (-1207814326);
        writableMapCreateMap2.putString(Xg.qd("\u0001tvv\u0005x\u0003x{cy{\u007f\b", (short) (C1499aX.Xd() ^ ((1362063734 ^ 1009858052) ^ (-1830714402))), (short) (C1499aX.Xd() ^ iXd4)), referenceLabel);
        writableMapCreateMap2.putString(Jg.Wd("ER)\u000ey[45oXBA\u0019", (short) (Od.Xd() ^ (C1633zX.Xd() ^ (1275757021 ^ 945525870))), (short) (Od.Xd() ^ (C1580rY.Xd() ^ 831062549))), qrEntity.getMerchantAdditionalDataC().getCustomerLabel());
        String terminalLabel = qrEntity.getMerchantAdditionalDataC().getTerminalLabel();
        int iXd5 = C1580rY.Xd() ^ (815221818 ^ (-18770557));
        writableMapCreateMap2.putString(ZO.xd("\u0007\u000erO\t~\u001c0-\tT46", (short) (C1607wl.Xd() ^ ((170433261 ^ 2013086029) ^ 2111164286)), (short) (C1607wl.Xd() ^ iXd5)), terminalLabel);
        writableMapCreateMap2.putString(C1626yg.Ud("\tIr3}k}BD\b!9\u00176G9Ua\u001b\u001f", (short) (ZN.Xd() ^ (ZN.Xd() ^ (349679595 ^ 660471483))), (short) (ZN.Xd() ^ ((1626860672 ^ 462706232) ^ 2070128541))), qrEntity.getMerchantAdditionalDataC().getPurposeOfTransaction());
        writableMapCreateMap2.putString(Ig.wd("f\u0013~u(H4!MyH!QR^u\u0015&-D\u0011Cdu\u000f)8\u0016\u001b", (short) (FB.Xd() ^ (OY.Xd() ^ 69928166))), qrEntity.getMerchantAdditionalDataC().getAdditionalConsumerDataRequest());
        writableMapCreateMap5.putString(EO.Od("\u001fX3\u0017x\t4S", (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ 1134255115))), qrEntity.getMerchantAUnreservedC().getValueINC());
        writableMapCreateMap5.putString(C1561oA.Qd("dNX`O2^H", (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (-831073940)))), qrEntity.getMerchantAUnreservedC().getValueIva());
        String baseIva = qrEntity.getMerchantAUnreservedC().getBaseIva();
        int iXd6 = C1580rY.Xd() ^ (790274119 ^ 512999921);
        writableMapCreateMap5.putString(C1593ug.zd("$$7*\u000f=)", (short) (C1633zX.Xd() ^ (586148168 ^ (-586147665))), (short) (C1633zX.Xd() ^ iXd6)), baseIva);
        writableMapCreateMap5.putString(C1561oA.od("^bZfe[a", (short) (C1580rY.Xd() ^ ((1185840668 ^ 603865315) ^ (-1699766731)))), qrEntity.getMerchantAUnreservedC().getChannel());
        writableMapCreateMap5.putString(C1561oA.Kd("~\f\f\u0003\t\u0015\u000b\u0012\u0012msi", (short) (Od.Xd() ^ (C1499aX.Xd() ^ (2013658794 ^ 1000271261)))), qrEntity.getMerchantAUnreservedC().getConditionINC());
        writableMapCreateMap5.putString(Wg.Zd("\\\rp\u000b-\u001d6!<;-|", (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (259392832 ^ (-1056904040)))), (short) (C1607wl.Xd() ^ (OY.Xd() ^ 69943079))), qrEntity.getMerchantAUnreservedC().getConditionIVA());
        writableMapCreateMap5.putString(C1561oA.Xd("q~~u{\b}\u0005\u0005ky\u0012i\n\u0002", (short) (OY.Xd() ^ (1777612276 ^ 1777619756))), qrEntity.getMerchantAUnreservedC().getConditionTaxOne());
        String conditionTaxTwo = qrEntity.getMerchantAUnreservedC().getConditionTaxTwo();
        short sXd2 = (short) (OY.Xd() ^ ((2035435044 ^ 1533046059) ^ 573716877));
        int[] iArr2 = new int["DOQFFPHMW<Lb9[V".length()];
        QB qb2 = new QB("DOQFFPHMW<Lb9[V");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((sXd2 ^ i3) + xuXd2.CK(iKK2));
            i3++;
        }
        writableMapCreateMap5.putString(new String(iArr2, 0, i3), conditionTaxTwo);
        writableMapCreateMap5.putString(Qg.kd("\u0016!\u001f#\u0014\u0011\" \u0014 \u000e{\u0019\u0007\u0013\u0017\u0004\u0005\u0015\t\u000e\f", (short) (C1607wl.Xd() ^ ((361779045 ^ 1940624515) ^ 1715198595)), (short) (C1607wl.Xd() ^ ((620473178 ^ 638018056) ^ 50108679))), qrEntity.getMerchantAUnreservedC().getConsecutiveTransaction());
        writableMapCreateMap5.putString(hg.Vd("H4J >4", (short) (C1499aX.Xd() ^ (ZN.Xd() ^ (-864707560))), (short) (C1499aX.Xd() ^ (1148792531 ^ (-1148802362)))), qrEntity.getMerchantAUnreservedC().getTaxOne());
        writableMapCreateMap5.putString(C1561oA.ud("\u0011|\u0013m\u0010\u0007", (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (-1951472025)))), qrEntity.getMerchantAUnreservedC().getTaxTwo());
        String securityField = qrEntity.getMerchantAUnreservedC().getSecurityField();
        short sXd3 = (short) (C1499aX.Xd() ^ (OY.Xd() ^ (148028284 ^ (-217694502))));
        int[] iArr3 = new int["A4/BD<DJ\u001c@9A>".length()];
        QB qb3 = new QB("A4/BD<DJ\u001c@9A>");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd3 ^ i4));
            i4++;
        }
        writableMapCreateMap5.putString(new String(iArr3, 0, i4), securityField);
        writableMapCreateMap.putString(C1561oA.Yd("\u000b|\u0016\n\u000e\u0001\u0005g\u0012\u0016\u0012\u0007\u001bp\u0017\u000e\u0014\u000f\u000e\"\u001e\"", (short) (ZN.Xd() ^ (C1607wl.Xd() ^ (1397036285 ^ 1023489230)))), qrEntity.getPayloadFormatIndicator());
        writableMapCreateMap.putString(Xg.qd(",,'-4\u0010(\f2.:0)=3::\u001a3C8@6", (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ 1951493942)), (short) (C1499aX.Xd() ^ (FB.Xd() ^ (-1609500085)))), qrEntity.getPointOfInitiationMethod());
        writableMapCreateMap.putString(Jg.Wd("@\u001d\u001cunVSH\u0005\n'\u0005zqhV\u0012%\u0004u", (short) (ZN.Xd() ^ ((431845309 ^ 1024234391) ^ 615638111)), (short) (ZN.Xd() ^ ((690593457 ^ 751035125) ^ 99242619))), qrEntity.getMerchantCategoryCode());
        writableMapCreateMap.putString(ZO.xd(".z\"\u00061_$J*r\nVpigc-\u000e*", (short) (C1607wl.Xd() ^ (OY.Xd() ^ 69934232)), (short) (C1607wl.Xd() ^ (ZN.Xd() ^ 864704299))), qrEntity.getTransactionCurrency());
        writableMapCreateMap.putString(C1626yg.Ud("^@N\u007f\u0004(\u001bJ\u0003Jw\\c7*F\u0003", (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (542289431 ^ (-1409518918)))), (short) (ZN.Xd() ^ ((1468677970 ^ 1669979855) ^ 872667914))), qrEntity.getTransactionAmount());
        short sXd4 = (short) (OY.Xd() ^ (C1607wl.Xd() ^ 1849976408));
        int[] iArr4 = new int["[(z3LP37\u0015QZ9\u0007\u0014\u0003d\u00141|{;\u000bQHo".length()];
        QB qb4 = new QB("[(z3LP37\u0015QZ9\u0007\u0014\u0003d\u00141|{;\u000bQHo");
        int i5 = 0;
        while (qb4.YK()) {
            int iKK4 = qb4.KK();
            Xu xuXd4 = Xu.Xd(iKK4);
            iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ (sXd4 + i5)));
            i5++;
        }
        writableMapCreateMap.putString(new String(iArr4, 0, i5), qrEntity.getTipOrConvenienceIndicator());
        writableMapCreateMap.putString(EO.Od(",l{\u001ex\b\u0005K+W8\u000ffU/!ZX\u0004=\u007f;FS\u0003W", (short) (C1499aX.Xd() ^ ((619935351 ^ 1457930521) ^ (-1914000743)))), qrEntity.getValueOfConvenienceFeeFixed());
        writableMapCreateMap.putString(C1561oA.Qd("L6@H7 6\u0012=;B082-5)*\n('\u0011%1!\"*/\u001b \u001d", (short) (FB.Xd() ^ ((1530229985 ^ 951689264) ^ 1670178823))), qrEntity.getValueOfConvenienceFeePercentage());
        int iXd7 = ZN.Xd() ^ (1874991312 ^ (-1548231558));
        writableMapCreateMap.putString(C1593ug.zd("4AHBIHP\u001bH>@", (short) (C1633zX.Xd() ^ ((284077046 ^ 1042913616) ^ (-784795211))), (short) (C1633zX.Xd() ^ iXd7)), qrEntity.getCountryCode());
        writableMapCreateMap.putString(C1561oA.od("ofrbf^joHZe\\", (short) (FB.Xd() ^ ((1599452820 ^ 726000300) ^ 1947218918))), qrEntity.getMerchantName());
        writableMapCreateMap.putString(C1561oA.Kd("UN\\NTN\\c3Zfl", (short) (OY.Xd() ^ (841922091 ^ 841913179))), qrEntity.getMerchantCity());
        writableMapCreateMap.putString(Wg.Zd("qtlqrq<luz", (short) (C1499aX.Xd() ^ (ZN.Xd() ^ (-864688789))), (short) (C1499aX.Xd() ^ ((215039168 ^ 4350190) ^ (-210981866)))), qrEntity.getPostalCode());
        writableMapCreateMap.putString(C1561oA.Xd("euvyw\u007fkwZ\u0003{qu\u0004", (short) (C1633zX.Xd() ^ (799507838 ^ (-799532735)))), qrEntity.getApprovalNumber());
        writableMapCreateMap.putString(Wg.vd("@PB", (short) (C1499aX.Xd() ^ (C1499aX.Xd() ^ (1078611154 ^ 64042493)))), qrEntity.getCrc());
        int iXd8 = OY.Xd() ^ (68150079 ^ 2408490);
        int iXd9 = C1607wl.Xd() ^ 1849965016;
        short sXd5 = (short) (C1607wl.Xd() ^ iXd8);
        short sXd6 = (short) (C1607wl.Xd() ^ iXd9);
        int[] iArr5 = new int["'&!".length()];
        QB qb5 = new QB("'&!");
        int i6 = 0;
        while (qb5.YK()) {
            int iKK5 = qb5.KK();
            Xu xuXd5 = Xu.Xd(iKK5);
            iArr5[i6] = xuXd5.fK(((sXd5 + i6) + xuXd5.CK(iKK5)) - sXd6);
            i6++;
        }
        writableMapCreateMap.putString(new String(iArr5, 0, i6), qrEntity.getRrn());
        int iXd10 = OY.Xd() ^ 69927904;
        int iXd11 = C1633zX.Xd() ^ (-1951491869);
        short sXd7 = (short) (ZN.Xd() ^ iXd10);
        short sXd8 = (short) (ZN.Xd() ^ iXd11);
        int[] iArr6 = new int["4+7'+#/4\u007f\"!%/#(&\u0018\"x\u0015'\u0013".length()];
        QB qb6 = new QB("4+7'+#/4\u007f\"!%/#(&\u0018\"x\u0015'\u0013");
        int i7 = 0;
        while (qb6.YK()) {
            int iKK6 = qb6.KK();
            Xu xuXd6 = Xu.Xd(iKK6);
            iArr6[i7] = xuXd6.fK(sXd7 + i7 + xuXd6.CK(iKK6) + sXd8);
            i7++;
        }
        writableMapCreateMap.putMap(new String(iArr6, 0, i7), writableMapCreateMap2);
        writableMapCreateMap.putMap(C1561oA.ud("!\u0018$\u0014\u0018\u0010\u001c!l\u000e\r\u0018\u001d\u0015\u001am\u0012\t\u0011\u0013\r\u007f\u0012\u0006\u000b\t", (short) (FB.Xd() ^ (ZN.Xd() ^ (1556016051 ^ 1865720928)))), writableMapCreateMap3);
        writableMapCreateMap.putMap(C1561oA.yd("2)5%1)5:\u0006*!)3- 2\u001e#!}\u001a&\u001e+\u000e\u0013\u0010}\u0016\u001d\u001f\u001a\u0006\u0018\b", (short) (Od.Xd() ^ (C1633zX.Xd() ^ (1530044870 ^ 795077219)))), writableMapCreateMap4);
        writableMapCreateMap.putMap(C1561oA.Yd("f_m_e_mtVpuixky~nn_qz~{q\u0006w\u0007", (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (285934574 ^ (-545397572))))), writableMapCreateMap5);
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public final Map<String, String> toParserMapString(HashMap<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, Xg.qd("cXh", (short) (OY.Xd() ^ (Od.Xd() ^ (1361134914 ^ 383581759))), (short) (OY.Xd() ^ (C1499aX.Xd() ^ (682431751 ^ (-1798733684))))));
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                map2.put(key, value);
            }
        }
        return map2;
    }
}
