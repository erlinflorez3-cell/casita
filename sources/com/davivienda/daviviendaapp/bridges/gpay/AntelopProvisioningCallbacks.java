package com.davivienda.daviviendaapp.bridges.gpay;

import fr.antelop.sdk.AntelopError;
import fr.antelop.sdk.EligibilityDenialReason;
import fr.antelop.sdk.Product;
import fr.antelop.sdk.WalletProvisioningCallback;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u0012\u007fјnjO0L͜P.`ݷ2\u000fq{<$i-yّCU(\u001d*\teNogtJb\u000bY\u000f\u000eǝ\u0001j:U]xc\u0014\u00172P~G3SrCʠvҚf\u0005N1bC\n\t\u000f\u001aBH>wټGK\u001a\u0014xX~=j\r{\tJ\u0016\u0014C8\u0001Lb\u0018TDO\u0005_P.Q\u000b0V\u0017Mm9\u0015M;J\u0005+\u001b\u0001y\u001eYKg?#1k\t\u0017Tk?1M J5n5.CK\nVd`F(]M]\u001curT`5Un\u001c?+}t{V\u001c/\u0010|\u0012\fj\f>\f5ZF/0e6!y\t;kNd\u001a^p\u0004+eD\u001c=\u007fa1i!tXy=/Me\u0004K!f3\u000f\u00049[\u0003\u0012\u0011\u001b)[\u0010SGPnE\u000fbR~K\u0004\u001cp\u0011\u0006Z\u0010>^\u00187\f\u00154\u001657\nLQ9\u001c\bVK\u007fx\u001b_\u0017[0f͕D\"|/\u007fB\u0017&rD\u0013\t\u001cTb]D\u0011{\"\u0005\r\f\u000f+\"rvj)k$\u0017_v\u0005\u0003M\f\u000eU5t>qp\u0002\r\u0006A%G}aq,yR%\u0018oBp\fphXR:b#<r>Vj(w*E%ۿ\u0015\u0558Cq$عϢ56"}, d2 = {"\u001ab^:\"+:d\u001d\u0010~^5{\u0005xd{9\u007fQ\u0005\u0017 Fk\nG\u0002n2f\u0002\u001f9m$wON7\u007f}y\u001ewa@\u0011n\u0017[\u00018KZR6eV{?q\u000ea\u0015K'\u000b\u000bg\u0017", "\u001aea{T5MS \t\u0006(:{\u000fxW{/\u0003@\u0010\u0002$Q\u0001\u0012Jz/>]\u0007\"\u0015i\u001d5J?9q\n", "=v]2e", "\u001ab^:\"+:d\u001d\u0010~^5{\u0005xd{9\u007fQ\u0005\u0017 Fk\nG\u0002n2f\u0002\u001f9m$wON7\u007f}y\u001ewa@\u0011n\u001eJ}.G[66[by=i", "uKR<`u=O*\u0003\fb,\u0006\b+/~$\rD\u0012\u001b\u0017Pn\n8\u00020~V\u000b$6o\u0016<\u0017EFgHgpqp9\u000em7@r.NL]\u0014fQ\u0003D\u0014g\u001e~", "=m25X*D3 \u0003|b)\u0001\u00103t\u0014\b\tM\u000b$", "", "3qa<e", "\u001aea{T5MS \t\u0006(:{\u000fxA\t7{G\u000b\"vT|\u0018IL", "1`[9U(<Ywz\nZ", "", "=m32i0<Sx\u0006~`0y\u0010/", "4h]4X9I`\u001d\b\n:3\u0004\u0013Ae~", "", "3kX4\\)ES\u0004\f\u0005]<z\u0018=", "", "\u001aea{T5MS \t\u0006(:{\u000fxP\r2zP~&l", "=m32i0<S\u0002\t\n>3\u0001\u000b3b\u0007(", "@dP@b5", "\u001aea{T5MS \t\u0006(:{\u000fxE\u0007,}D}\u001b\u001eK~\"\u001bv.9U\u0005\r7i$8V\u0019", "2d]6T3+S\u001a~\b^5z\t", "", "=m8;\\;BO \u0003\u0010Z;\u0001\u00138E\r5\u0006M", "=m8;\\;BO \u0003\u0010Z;\u0001\u00138S\u0010&y@\u000f%", "=m?2e4Ba'\u0003\u0005g\u0015\u0007\u0018\u0011r{1\u000b@\u007f", ">da:\\:LW#\b\t", "", "uZ;7T=:\u001d z\u0004`uj\u0018<i\t*Q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004\u00114", "=m??b=Ba\u001d\t\u0004b5~h<r\n5", "=m??b=Ba\u001d\t\u0004b5~s/n~,\u0005B", "=m??b=Ba\u001d\t\u0004b5~v?c}(\nN", "/o_,e,ES\u0015\rz"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class AntelopProvisioningCallbacks implements WalletProvisioningCallback {
    private final AntelopWalletModule owner;

    public AntelopProvisioningCallbacks(AntelopWalletModule antelopWalletModule) {
        int iXd = OY.Xd() ^ (1458674263 ^ (-1390082645));
        Intrinsics.checkNotNullParameter(antelopWalletModule, Wg.Zd(";$\u0014\u0003\t", (short) (C1633zX.Xd() ^ ((1676357624 ^ 1318884131) ^ (-762808093))), (short) (C1633zX.Xd() ^ iXd)));
        this.owner = antelopWalletModule;
    }

    @Override // fr.antelop.sdk.WalletProvisioningCallback
    public void onCheckEligibilityError(AntelopError antelopError, Object obj) throws Throwable {
        short sXd = (short) (OY.Xd() ^ (518823342 ^ 518839033));
        int[] iArr = new int["ESTRV".length()];
        QB qb = new QB("ESTRV");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        Intrinsics.checkNotNullParameter(antelopError, new String(iArr, 0, i2));
        AntelopWalletModule antelopWalletModule = this.owner;
        short sXd2 = (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (-1951486114)));
        int[] iArr2 = new int["ivq3nl~rthakfd.eWm]kc`f]OP\\] UbZ\u000b\u000f\n\u0019X\u0013\u0019\u000b\u0018M]\f\u0017\t\r\u0011\u0007nu\u0002\u0007\u0001\rf}s\u0002yw".length()];
        QB qb2 = new QB("ivq3nl~rthakfd.eWm]kc`f]OP\\] UbZ\u000b\u000f\n\u0019X\u0013\u0019\u000b\u0018M]\f\u0017\t\r\u0011\u0007nu\u0002\u0007\u0001\rf}s\u0002yw");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((sXd2 ^ i3) + xuXd2.CK(iKK2));
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr2, 0, i3));
        Class<?>[] clsArr = {Class.forName(Qg.kd("'2l\u001f+0 &((d)\u0019\u001f`r\u001f$\u0014\u001a\u001c\u001co\u001c\u001b\u0017\u0019", (short) (C1633zX.Xd() ^ (Od.Xd() ^ (1414237432 ^ (-330726181)))), (short) (C1633zX.Xd() ^ (ZN.Xd() ^ (1805129087 ^ (-1477589032))))))};
        Object[] objArr = {antelopError};
        int iXd = ZN.Xd() ^ (1190825202 ^ 1970335488);
        short sXd3 = (short) (C1607wl.Xd() ^ ((1079476121 ^ 2059028648) ^ 988627072));
        short sXd4 = (short) (C1607wl.Xd() ^ iXd);
        int[] iArr3 = new int["CA\"C?E\u0017;5?\u000f;:68h%32 2$*\"\u001d.\u001f".length()];
        QB qb3 = new QB("CA\"C?E\u0017;5?\u000f;:68h%32 2$*\"\u001d.\u001f");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(sXd3 + i4 + xuXd3.CK(iKK3) + sXd4);
            i4++;
        }
        Method method = cls.getMethod(new String(iArr3, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(antelopWalletModule, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // fr.antelop.sdk.WalletProvisioningCallback
    public void onDeviceEligible(boolean z2, List<Product> list, Object obj) throws Throwable {
        Intrinsics.checkNotNullParameter(list, C1561oA.ud("\u0016\u001c\u0018\u0015\u0016\u000e\u0017\u000fx\u001a\u0016\n\u001a\u0007\u0017\u0015", (short) (C1499aX.Xd() ^ ((214160353 ^ 1040179873) ^ (-826026632)))));
        AntelopWalletModule antelopWalletModule = this.owner;
        int size = list.size();
        Class<?> cls = Class.forName(C1561oA.yd("'23r,(@22$#+$ o%\u0015)\u001f+!\u001c(\u001d\r\f\u001e\u001d]\u0011$\u001a\b\n\u000b\u0018U\u000e\u001a\n\u0015H^\u000b\u0014\u0004\u000e\u0010\u0004iv\u0001\u0004{\u000eezn\u0003xt", (short) (OY.Xd() ^ (C1633zX.Xd() ^ (-1951492582)))));
        Class<?>[] clsArr = new Class[Od.Xd() ^ 1207800919];
        clsArr[0] = Boolean.TYPE;
        clsArr[1] = Integer.TYPE;
        Object[] objArr = new Object[C1499aX.Xd() ^ (1194429993 ^ (-78309689))];
        objArr[0] = Boolean.valueOf(z2);
        objArr[1] = Integer.valueOf(size);
        Method method = cls.getMethod(C1561oA.Yd("OO2US[+SQPSMXR\u0012P`aQeYa[Xk^", (short) (C1633zX.Xd() ^ (OY.Xd() ^ (1300227139 ^ (-1230292016))))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(antelopWalletModule, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // fr.antelop.sdk.WalletProvisioningCallback
    public void onDeviceNotEligible(EligibilityDenialReason eligibilityDenialReason, Object obj, String str) throws Throwable {
        Intrinsics.checkNotNullParameter(eligibilityDenialReason, Xg.qd("\u0007zw\u000b\b\b", (short) (OY.Xd() ^ (795576327 ^ 795589756)), (short) (OY.Xd() ^ (753731629 ^ 753750162))));
        AntelopWalletModule antelopWalletModule = this.owner;
        Class<?> cls = Class.forName(Jg.Wd("goyZ% /0Sd\\akxa\u0016%89d[chn\u007f\u000e'%x;WZilv\u0013_'.-I\u001c9h\u0001q\u0011$9 $M_jsL~\u00141(#", (short) (FB.Xd() ^ (C1633zX.Xd() ^ (651011271 ^ (-1385993035)))), (short) (FB.Xd() ^ ((485578921 ^ 1151018597) ^ 1483354418))));
        Class<?>[] clsArr = new Class[692079431 ^ 692079429];
        int iXd = Od.Xd() ^ (632957029 ^ (-1648853111));
        clsArr[0] = Class.forName(ZO.xd("?\u00160)Q\\/m\u0018MZYco\u001a\bUm4Ka\u0003k04\r2\u001e0\u001fX)\b\"NzB\u007f", (short) (C1633zX.Xd() ^ (901099723 ^ (-901103955))), (short) (C1633zX.Xd() ^ iXd)));
        clsArr[1] = Class.forName(C1626yg.Ud("e\u0016,\u0019\u0019\u001f\u001e\u001c:\u0018&a~_K]", (short) (C1580rY.Xd() ^ (FB.Xd() ^ (1579753925 ^ (-29763503)))), (short) (C1580rY.Xd() ^ (238579532 ^ (-238578797)))));
        Object[] objArr = new Object[(1749303256 ^ 847403619) ^ 1522951609];
        objArr[0] = eligibilityDenialReason;
        objArr[1] = str;
        Method method = cls.getMethod(Ig.wd("Ah<C_9!b,a\u0007e0\u0005\n9i:\u001f\u0002Gu\u001f\u001aRk\u0005Nr", (short) (OY.Xd() ^ (637679293 ^ 637694182))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(antelopWalletModule, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // fr.antelop.sdk.WalletProvisioningCallback
    public void onInitializationError(AntelopError antelopError, Object obj) throws Throwable {
        short sXd = (short) (ZN.Xd() ^ (1119371827 ^ 1119367501));
        int[] iArr = new int["\u0011sC\u001e\f".length()];
        QB qb = new QB("\u0011sC\u001e\f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(antelopError, new String(iArr, 0, i2));
        AntelopWalletModule antelopWalletModule = this.owner;
        short sXd2 = (short) (C1607wl.Xd() ^ ((1743932772 ^ 1754118355) ^ 260035394));
        int[] iArr2 = new int["\u0015 \u001d\\\u0012\u000e\"\u0014 \u0012\r\u0015\n\u0006Q\u0007\u0003\u0017\t\u0015\u0007\u0002\n~zy\b\u0007Cv\u0006{uwt\u0002;s{k\u00036HtyioqqW`jiaoGh\\lbZ".length()];
        QB qb2 = new QB("\u0015 \u001d\\\u0012\u000e\"\u0014 \u0012\r\u0015\n\u0006Q\u0007\u0003\u0017\t\u0015\u0007\u0002\n~zy\b\u0007Cv\u0006{uwt\u0002;s{k\u00036HtyioqqW`jiaoGh\\lbZ");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        Object[] objArr = {antelopError};
        Method method = Class.forName(new String(iArr2, 0, i3)).getMethod(C1561oA.od("\u0016\u0014t\u0016\u0012\u0018i\u000e\b\u0012a\u000e\r\t\u000b;w\u0006\u0005r\u0005v|to\u0001q", (short) (C1580rY.Xd() ^ (1649251663 ^ (-1649266842)))), Class.forName(C1593ug.zd("\u000f\u001cX\r\u001b\"\u0014\u001c \"`'\u0019!dx'. (,.\u00042315", (short) (ZN.Xd() ^ (ZN.Xd() ^ (390308965 ^ 617214671))), (short) (ZN.Xd() ^ ((748412747 ^ 1326687794) ^ 1669865236)))));
        try {
            method.setAccessible(true);
            method.invoke(antelopWalletModule, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // fr.antelop.sdk.WalletProvisioningCallback
    public void onInitializationSuccess(Object obj) throws Throwable {
        AntelopWalletModule antelopWalletModule = this.owner;
        Class<?> cls = Class.forName(C1561oA.Kd("\u0006\u0013\u0012S\u000b\t\u001f\u0013!\u0015\u0012\u001c\u0013\u0011^\u0016\u0014*\u001e, \u001d'\u001e\u001c\u001d-.l\"3+'+*9t/9+Dy\u000e<C5=AC+6BC=M'J@RJD", (short) (C1499aX.Xd() ^ (FB.Xd() ^ (1157612403 ^ (-454070412))))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        int iXd = C1499aX.Xd() ^ (-1134246917);
        short sXd = (short) (FB.Xd() ^ ((873195602 ^ 1331192643) ^ 2069080167));
        short sXd2 = (short) (FB.Xd() ^ iXd);
        int[] iArr = new int["\u0011\u001bz&^n=o\";\u0013?isr\tF\u00027S\r\t\u0016\u0012VWPn\u0019".length()];
        QB qb = new QB("\u0011\u001bz&^n=o\";\u0013?isr\tF\u00027S\r\t\u0016\u0012VWPn\u0019");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(antelopWalletModule, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // fr.antelop.sdk.WalletProvisioningCallback
    public void onPermissionNotGranted(String[] strArr, Object obj) throws Throwable {
        Intrinsics.checkNotNullParameter(strArr, C1561oA.Xd("siwsp{|szz\u0001", (short) (ZN.Xd() ^ (883736427 ^ 883751830))));
        AntelopWalletModule antelopWalletModule = this.owner;
        short sXd = (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (-831088010)));
        int[] iArr = new int["P]X\u001aUSeYk_Xb][%\\>TDRJGMDFGST\u0017LYQ150?~9?1N\u0004\u0014BM?CG-\u0015\u001c(-'3\r4*80.".length()];
        QB qb = new QB("P]X\u001aUSeYk_Xb][%\\>TDRJGMDFGST\u0017LYQ150?~9?1N\u0004\u0014BM?CG-\u0015\u001c(-'3\r4*80.");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = {String[].class};
        Object[] objArr = {strArr};
        short sXd2 = (short) (C1607wl.Xd() ^ (C1633zX.Xd() ^ (-1951468629)));
        short sXd3 = (short) (C1607wl.Xd() ^ (1584274571 ^ 1584293986));
        int[] iArr2 = new int["?=\u001e?;A\u001a.:4/87,1/\u000e.2\u0004.\u001c(-\u001d\u001bY\u0016$#\u0011#\u0015\u001b\u0013\u000e\u001f\u0010".length()];
        QB qb2 = new QB("?=\u001e?;A\u001a.:4/87,1/\u000e.2\u0004.\u001c(-\u001d\u001bY\u0016$#\u0011#\u0015\u001b\u0013\u000e\u001f\u0010");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(antelopWalletModule, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // fr.antelop.sdk.WalletProvisioningCallback
    public void onProvisioningError(AntelopError antelopError, Object obj) throws Throwable {
        Intrinsics.checkNotNullParameter(antelopError, hg.Vd("\u001b'&\"$", (short) (FB.Xd() ^ (C1580rY.Xd() ^ (127757195 ^ (-907287533)))), (short) (FB.Xd() ^ (FB.Xd() ^ (1412280467 ^ 197314919)))));
        AntelopWalletModule antelopWalletModule = this.owner;
        Object[] objArr = {antelopError};
        Method method = Class.forName(C1561oA.ud("Yda!VRfXdVQYNJ\u0016KG[MYKFNC?>LK\b;J@:<9F\u007f8@0Gz\r9>.466\u001c%/.&4\f-!1'\u001f", (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ (356054711 ^ 615624869))))).getMethod(C1561oA.Yd("ggJmksCqrpt'euvfznvpm\u0001s", (short) (ZN.Xd() ^ (C1607wl.Xd() ^ 1849965594))), Class.forName(C1561oA.yd("mz3gy\u0001nv~\u0001;\u0002w\u007f?SelZbjl>lqoo", (short) (C1607wl.Xd() ^ (350899379 ^ 350901531)))));
        try {
            method.setAccessible(true);
            method.invoke(antelopWalletModule, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // fr.antelop.sdk.WalletProvisioningCallback
    public void onProvisioningPending(Object obj) throws Throwable {
        AntelopWalletModule antelopWalletModule = this.owner;
        Class<?> cls = Class.forName(Xg.qd("6CB\u0004;9OCQEBLCA\u000fFDZN\\PMWNLM]^\u001dRc[W[Zi%_i[t*>lsemqs[frsm}Wzp\u0003zt", (short) (ZN.Xd() ^ (312820056 ^ 312834698)), (short) (ZN.Xd() ^ ((1372846450 ^ 1459282279) ^ 120158334))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        int iXd = C1580rY.Xd() ^ 831072182;
        int iXd2 = C1633zX.Xd() ^ (1355549930 ^ 614301342);
        short sXd = (short) (Od.Xd() ^ iXd);
        short sXd2 = (short) (Od.Xd() ^ iXd2);
        int[] iArr = new int["##pv\u007fj0)>\u0018\tqv\u0017@3>\u0011\u0010fyV>42".length()];
        QB qb = new QB("##pv\u007fj0)>\u0018\tqv\u0017@3>\u0011\u0010fyV>42");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(antelopWalletModule, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // fr.antelop.sdk.WalletProvisioningCallback
    public void onProvisioningSuccess(Object obj) throws Throwable {
        AntelopWalletModule antelopWalletModule = this.owner;
        int iXd = OY.Xd() ^ (-69954630);
        int iXd2 = C1607wl.Xd() ^ (666927939 ^ (-1233442214));
        Object[] objArr = new Object[0];
        Method method = Class.forName(ZO.xd("\t7\u001e67\blV[d\u0014/g[`./QW\u001a ^\u0010P@?;O_k\u000f\u00191:L+\u000fy\f}%\u0012\u0011_\u000b1e\u0014e%\u001er@@\u001b\u0018f\u0017Lr\n", (short) (Od.Xd() ^ iXd), (short) (Od.Xd() ^ iXd2))).getMethod(C1626yg.Ud("/\u0014\\w\u000f?-NsE?g\u000f PF\u001f\u000f \u0015\u0005$ \\\u0019", (short) (Od.Xd() ^ (OY.Xd() ^ (-69936212))), (short) (Od.Xd() ^ (ZN.Xd() ^ (2091689525 ^ (-1327932756))))), new Class[0]);
        try {
            method.setAccessible(true);
            method.invoke(antelopWalletModule, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
