package com.davivienda.daviviendaapp;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
import yg.Xu;
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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u0016DLcz\u0004I\u0006>)6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ@ş\u001c{b#\u001c'ڱG;c\u001aF6\u0017PfmwpZZ9F=\bF|x0aU'bX#z^}EK[\u007fGIh\u00056\u000b!B\">z3\bH,x\u0014\u0005~[K:\u0017vTª>Z"}, d2 = {"\u001ab^:\"+:d\u001d\u0010~^5{\u0005xd{9\u007fQ\u0005\u0017 Fk\nG\u0002n\"Yy\u001eFX\u0012,S?=kBs", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E-\u0001\u0013\u0015VZ\n:|!7YS", "u(E", "1qT.g,'O(\u0003\f^\u0014\u0007\b?l\u007f6", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW%r49j}\bAl&5M\u0019", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "1qT.g,/W\u0019\u0011bZ5x\u000b/r\u000e", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n&]}2\u001fi\u001f*OCHA", "/o_,e,ES\u0015\rz"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ReactPackages implements ReactPackage {
    @Override // com.facebook.react.ReactPackage
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) throws Throwable {
        Intrinsics.checkNotNullParameter(reactApplicationContext, C1561oA.Qd("WIDEU#NLQASN", (short) (C1633zX.Xd() ^ ((294957345 ^ 157708126) ^ (-418574103)))));
        ArrayList arrayList = new ArrayList();
        Object[] objArr = {reactApplicationContext};
        Constructor<?> constructor = Class.forName(C1593ug.zd("dqp2ig}q\u007fspzqo=tr\t|\u000b~{\u0006|z{\f\rK\u0001\u0012\n\u0006\n\t\u0018S|\u001b\u001c\u0012m\u001b\u001f\u0013w\u001e\u001a&`\n()\u001fz(, \u0005+'3\r\"0$+*8", (short) (C1633zX.Xd() ^ (FB.Xd() ^ (-1609499903))), (short) (C1633zX.Xd() ^ (2095915022 ^ (-2095916569))))).getConstructor(Class.forName(C1561oA.od("z\u0006\u0003Bystuq}|w9|nijz3fukegd,Oa\\]m9gfa]VSeY^\\0[Y^N`[", (short) (C1633zX.Xd() ^ ((1829003606 ^ 355279407) ^ (-2015973168))))));
        try {
            constructor.setAccessible(true);
            arrayList.add(constructor.newInstance(objArr));
            short sXd = (short) (FB.Xd() ^ (1180416296 ^ 1180427588));
            int[] iArr = new int["p}|>us\n}\f\u007f|\u0007}{I\u0001~\u0015\t\u0017\u000b\b\u0012\t\u0007\b\u0018\u0019W\r\u001e\u0016\u0012\u0016\u0015$_\u0014))\u001e\u001c&-#\u001e\u001d1'..n\u000526*\u0007<<1/9@610D:AA!6D8?>L".length()];
            QB qb = new QB("p}|>us\n}\f\u007f|\u0007}{I\u0001~\u0015\t\u0017\u000b\b\u0012\t\u0007\b\u0018\u0019W\r\u001e\u0016\u0012\u0016\u0015$_\u0014))\u001e\u001c&-#\u001e\u001d1'..n\u000526*\u0007<<1/9@610D:AA!6D8?>L");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                i2++;
            }
            Object[] objArr2 = {reactApplicationContext};
            Constructor<?> constructor2 = Class.forName(new String(iArr, 0, i2)).getConstructor(Class.forName(Wg.Zd("X<Aj$\u0002\u0010wthqR\u0018A< Bx|U'E\b0r^K\u0007BiF6\norWR4S-3\u001aw\b\nunh\u0005", (short) (OY.Xd() ^ ((1108612871 ^ 1166099809) ^ 127205724)), (short) (OY.Xd() ^ (1736840402 ^ 1736855499)))));
            try {
                constructor2.setAccessible(true);
                arrayList.add(constructor2.newInstance(objArr2));
                Object[] objArr3 = {reactApplicationContext};
                Constructor<?> constructor3 = Class.forName(C1561oA.Xd("Yfe'^\\rftheofd2ig}q\u007fspzqop\u0001\u0002@u\u0007~z~}\rH\u0003\u0002\f\u0004\u0012\n\u0005Pf\u0014\u0018\fn\u000e\u0018\u0010\u001e\u0016\u0011{\u0011\u001f\u0013\u001a\u0019'", (short) (C1499aX.Xd() ^ ((206454617 ^ 2131676710) ^ (-1933621755))))).getConstructor(Class.forName(Wg.vd(".96u5/01%10+t8*%>N\u0007:QGAC8\u007f#589I\u0015[ZUQROaURP$OUZJ\\o", (short) (C1633zX.Xd() ^ ((1843349328 ^ 542954037) ^ (-1300484390))))));
                try {
                    constructor3.setAccessible(true);
                    arrayList.add(constructor3.newInstance(objArr3));
                    Object[] objArr4 = {reactApplicationContext};
                    Constructor<?> constructor4 = Class.forName(Qg.kd("\u0004\u000f\fK\u0001|\u0011\u0003\u000f\u0001{\u0004xt@uq\u0006w\u0004upxmihvu2etjdfcp*_i\\md[ch!5`bT2\\O`WNV[3FRDIFR", (short) (OY.Xd() ^ ((1315460042 ^ 648051086) ^ 1757953935)), (short) (OY.Xd() ^ (1814050924 ^ 1814041394)))).getConstructor(Class.forName(hg.Vd("v\u0002~>uopqmyxs5xjefv/bqgac`(K]XYi5cb]YROaUZX,WUZJ\\W", (short) (C1607wl.Xd() ^ (120699993 ^ 120689727)), (short) (C1607wl.Xd() ^ ((2094219119 ^ 1507393405) ^ 621527903)))));
                    try {
                        constructor4.setAccessible(true);
                        arrayList.add(constructor4.newInstance(objArr4));
                        Object[] objArr5 = {reactApplicationContext};
                        Constructor<?> constructor5 = Class.forName(C1561oA.ud("R]Z\u001aOK_Q]OJRGC\u000fD@TFRD?G<87ED\u00014C9352?x,27='1-'#5).,j}$)\u000f\u0019#\u001f\u0019\u0015'\u001b \u001e{\u000f\u001b\r\u0012\u000f\u001b", (short) (C1499aX.Xd() ^ (1924058858 ^ (-1924057400))))).getConstructor(Class.forName(C1561oA.yd("0;<{/)./'361n2(# 0l +!\u001f!\u001aa\t\u001b\u0012\u0013'r\u001d\u001c\u001b\u0017\f\t\u001f\u0013\u0014\u0012i\u0015\u000f\u0014\b\u001a\u0011", (short) (C1580rY.Xd() ^ ((561354932 ^ 1338022396) ^ (-1857360620))))));
                        try {
                            constructor5.setAccessible(true);
                            arrayList.add(constructor5.newInstance(objArr5));
                            short sXd2 = (short) (C1633zX.Xd() ^ ((40884554 ^ 107262394) ^ (-67839474)));
                            int[] iArr2 = new int["{\t\bI\u0001~\u0015\t\u0017\u000b\b\u0012\t\u0007T\f\n \u0014\"\u0016\u0013\u001d\u0014\u0012\u0013#$b\u0018)!\u001d! /j.1/7+')7s\u0017:8@402@\u0018>DF4@A".length()];
                            QB qb2 = new QB("{\t\bI\u0001~\u0015\t\u0017\u000b\b\u0012\t\u0007T\f\n \u0014\"\u0016\u0013\u001d\u0014\u0012\u0013#$b\u0018)!\u001d! /j.1/7+')7s\u0017:8@402@\u0018>DF4@A");
                            int i3 = 0;
                            while (qb2.YK()) {
                                int iKK2 = qb2.KK();
                                Xu xuXd2 = Xu.Xd(iKK2);
                                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
                                i3++;
                            }
                            Class<?> cls = Class.forName(new String(iArr2, 0, i3));
                            Class<?>[] clsArr = new Class[1];
                            short sXd3 = (short) (Od.Xd() ^ (572299501 ^ (-572299292)));
                            short sXd4 = (short) (Od.Xd() ^ ((886883627 ^ 50704467) ^ (-936985031)));
                            int[] iArr3 = new int["DQP\u0012KGJMKYZW\u001b`TQTf!Vg_[_^(Ma^asAqromhg{qxxN{{\u0003t\t\u0006".length()];
                            QB qb3 = new QB("DQP\u0012KGJMKYZW\u001b`TQTf!Vg_[_^(Ma^asAqromhg{qxxN{{\u0003t\t\u0006");
                            int i4 = 0;
                            while (qb3.YK()) {
                                int iKK3 = qb3.KK();
                                Xu xuXd3 = Xu.Xd(iKK3);
                                iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd3 + i4)) + sXd4);
                                i4++;
                            }
                            clsArr[0] = Class.forName(new String(iArr3, 0, i4));
                            Object[] objArr6 = {reactApplicationContext};
                            Constructor<?> constructor6 = cls.getConstructor(clsArr);
                            try {
                                constructor6.setAccessible(true);
                                arrayList.add(constructor6.newInstance(objArr6));
                                Class<?> cls2 = Class.forName(Jg.Wd("\rt\\_\u007fZ\"lN=\u00050\u000e/(\u001aGV_\u0007EAtp\u0018qr\u000f`\r)\u0002)P6@n\"z]Vf\u0011t\u007f.\r[/\u0013r\"~'Q\u001a", (short) (Od.Xd() ^ ((955623987 ^ 745279044) ^ (-345605705))), (short) (Od.Xd() ^ (1934082079 ^ (-1934079866)))));
                                Class<?>[] clsArr2 = new Class[1];
                                short sXd5 = (short) (C1499aX.Xd() ^ ((1236377133 ^ 25708045) ^ (-1211754830)));
                                short sXd6 = (short) (C1499aX.Xd() ^ ((227588822 ^ 391467740) ^ (-449152470)));
                                int[] iArr4 = new int["\u0010V;\u0002|hGK?KIL^bocJJ[89Mq8\u001aO\u0013ojY2O+o\u0012bl`y7??\u001bwk9#O\u0014".length()];
                                QB qb4 = new QB("\u0010V;\u0002|hGK?KIL^bocJJ[89Mq8\u001aO\u0013ojY2O+o\u0012bl`y7??\u001bwk9#O\u0014");
                                int i5 = 0;
                                while (qb4.YK()) {
                                    int iKK4 = qb4.KK();
                                    Xu xuXd4 = Xu.Xd(iKK4);
                                    iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((i5 * sXd6) + sXd5)));
                                    i5++;
                                }
                                clsArr2[0] = Class.forName(new String(iArr4, 0, i5));
                                Object[] objArr7 = {reactApplicationContext};
                                Constructor<?> constructor7 = cls2.getConstructor(clsArr2);
                                try {
                                    constructor7.setAccessible(true);
                                    arrayList.add(constructor7.newInstance(objArr7));
                                    Object[] objArr8 = {reactApplicationContext};
                                    Constructor<?> constructor8 = Class.forName(C1626yg.Ud("~[ )'M0H\u0007t)bC!e\f\u0006dD\u0011Zo\t2#\u001bL%R<[hG\u000ej6%~)&\u0012\u0017N@\u0003&;\u000f38W}Ac\u001f)itC>V", (short) (FB.Xd() ^ (1330748112 ^ 1330766694)), (short) (FB.Xd() ^ ((555526894 ^ 1786003483) ^ 1265158956)))).getConstructor(Class.forName(Ig.wd("\\\u0016F\u001f(}S.s\r\u000b-\u0004RA$XsUR+J#\"\u0019-4uSH-^uP\u0013F!\u0003\u0015{\u0006m\u000f\u001d\u001e0\ru\u007f", (short) (Od.Xd() ^ (1746397116 ^ (-1746402691))))));
                                    try {
                                        constructor8.setAccessible(true);
                                        arrayList.add(constructor8.newInstance(objArr8));
                                        Object[] objArr9 = {reactApplicationContext};
                                        Constructor<?> constructor9 = Class.forName(EO.Od("jH\u00185\u001cEj.\u0006\t\u0003.ri\u001erDG\u0003<i.I;r\u00034\\H\u000f?Tw\u00196\u0003_LIF;!\u00034\u0015QIx&(M,AF\u0018[|/\n\nph#\"Q\u0016b", (short) (C1607wl.Xd() ^ ((184593231 ^ 2067062096) ^ 1882473128)))).getConstructor(Class.forName(C1561oA.Qd("]he%\\VWXT`_Z\u001c_QLM]\u0016IXNHJG\u000f2D?@P\u001cJID@96H<A?\u0013><A1C>", (short) (C1499aX.Xd() ^ ((1301029066 ^ 780403876) ^ (-1661471252))))));
                                        try {
                                            constructor9.setAccessible(true);
                                            arrayList.add(constructor9.newInstance(objArr9));
                                            Object[] objArr10 = {reactApplicationContext};
                                            Constructor<?> constructor10 = Class.forName(C1593ug.zd("2?>\u007f75K?MA>H?=\u000bB@VJXLISJHIYZ\u0019N_WSWVe![eWp&:hoaimoWbnoiySvl~vp", (short) (C1580rY.Xd() ^ ((1748097462 ^ 672047445) ^ (-1077892354))), (short) (C1580rY.Xd() ^ ((1985564382 ^ 1078752628) ^ (-907349027))))).getConstructor(Class.forName(C1561oA.od("DOL\fC=>?;GFA\u0003F834D|0?5/1.u\u0019+&'7\u000310+' \u001d/#(&y%#(\u0018*%", (short) (FB.Xd() ^ ((312289805 ^ 51762988) ^ 294175550)))));
                                            try {
                                                constructor10.setAccessible(true);
                                                arrayList.add(constructor10.newInstance(objArr10));
                                                return arrayList;
                                            } catch (InvocationTargetException e2) {
                                                throw e2.getCause();
                                            }
                                        } catch (InvocationTargetException e3) {
                                            throw e3.getCause();
                                        }
                                    } catch (InvocationTargetException e4) {
                                        throw e4.getCause();
                                    }
                                } catch (InvocationTargetException e5) {
                                    throw e5.getCause();
                                }
                            } catch (InvocationTargetException e6) {
                                throw e6.getCause();
                            }
                        } catch (InvocationTargetException e7) {
                            throw e7.getCause();
                        }
                    } catch (InvocationTargetException e8) {
                        throw e8.getCause();
                    }
                } catch (InvocationTargetException e9) {
                    throw e9.getCause();
                }
            } catch (InvocationTargetException e10) {
                throw e10.getCause();
            }
        } catch (InvocationTargetException e11) {
            throw e11.getCause();
        }
    }

    @Override // com.facebook.react.ReactPackage
    public List<ViewManager<?, ?>> createViewManagers(ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, C1561oA.Kd("dXUXj:ggn`tq", (short) (Od.Xd() ^ (C1633zX.Xd() ^ 1951479194))));
        List<ViewManager<?, ?>> listEmptyList = Collections.emptyList();
        Intrinsics.checkNotNullExpressionValue(listEmptyList, Wg.Zd("\u0005+S<e97aE\u0018\"\t,\u007f", (short) (FB.Xd() ^ (1871489719 ^ 1871506441)), (short) (FB.Xd() ^ ((756875836 ^ 1536265314) ^ 1988949794))));
        return listEmptyList;
    }
}
