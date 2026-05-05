package com.davivienda.daviviendaapp.bridges.gpay;

import fr.antelop.sdk.AntelopError;
import fr.antelop.sdk.AsyncRequestType;
import fr.antelop.sdk.Wallet;
import fr.antelop.sdk.WalletManagerCallbackCompat;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethodType;
import fr.antelop.sdk.authentication.CustomerCredentialsRequiredReason;
import fr.antelop.sdk.authentication.LocalAuthenticationErrorReason;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u001e\u007fјnjG0L͜P.hS2şs{J$cҕyCI٥\"}(\u000bWN}gvJ`\u000bK\u000f\u001c\u0016\u0001j2I]xs\u0012\u00172XoG3SqCʠvҚf\u0005N1bC\n\t\u000f\u001aBH>wټGK\u001a\u0014x`~?j\r{\u000bJ\u0016\u0014E8\u0001Ld\u0018RDQ\u0005]h9S\twMf)u/+YSZ\u001d?\u001b\u0004y\u001eYFg9#,k\u00035Z\fE\u0011J\n?\u001bgU3q]<oDf\u0018\u0014C1\u007f\u0011k{>\\3[\u0011\u001256geaO<4>\u000fD%J\u0013&\u0006UN^1(v \u000ea\u0006#YN[\u001a`X~)m|+m\"A=Q\u001b\u0015W\u0012?'aO{3!N)\u000fw9]j\r\u000f\u001fKZ\u0006\\ISV<vZPm\u0006\u0018\u0012\u0006z\u0002X\n`K\u000eE\u0014\u0011\\.U;iL;!\u001a\u001axJu\u0010\u001db~R\u0018VxF0y.9@\b:f\u000bxM\u0004^np,?SLX\u0015\u0014 \u0013Ns(B/0(Peg\u0018v\u0014qR5=\u0002OY\u001dq>]GiK7gb>m\u0019\u000bdKJe\u001dX\u0015F*ۑ\u001dڅ,\":ʋ;\u001c\u0006{\\N:\u0014\tŰsʬ8,9ǉË\u0019d"}, d2 = {"\u001ab^:\"+:d\u001d\u0010~^5{\u0005xd{9\u007fQ\u0005\u0017 Fk\nG\u0002n2f\u0002\u001f9m$wON7\u007f}y\u001ewa@\u0011n\u0014J\u007f#IL[\nXYy:\u0010\u0010`\u001c$", "\u001aea{T5MS \t\u0006(:{\u000fxW{/\u0003@\u0010~\u0013Pk\u0010<\u0004\u00031`\u0005\u001d3k\u001c\fWKFgCs", "=v]2e", "\u001ab^:\"+:d\u001d\u0010~^5{\u0005xd{9\u007fQ\u0005\u0017 Fk\nG\u0002n2f\u0002\u001f9m$wON7\u007f}y\u001ewa@\u0011n\u001eJ}.G[66[by=i", "uKR<`u=O*\u0003\fb,\u0006\b+/~$\rD\u0012\u001b\u0017Pn\n8\u00020~V\u000b$6o\u0016<\u0017EFgHgpqp9\u000em7@r.NL]\u0014fQ\u0003D\u0014g\u001e~", "\"@6", "", "=m0@l5<@\u0019\u000b\u000b^:\fh<r\n5", "", "@d`BX:M1#}z", "\u001aea{T5MS \t\u0006(:{\u000fxA\u000e<\u0005>m\u0017#Wo\u001cKe9@YS", "3qa<e", "\u001aea{T5MS \t\u0006(:{\u000fxA\t7{G\u000b\"vT|\u0018IL", "1`[9U(<Ywz\nZ", "", "=m0@l5<@\u0019\u000b\u000b^:\fv?c}(\nN", "=m2<a5>Q(\u0003\u0005g\f\n\u00169r", "=m2<a5>Q(\u0003\u0005g\u001a\r\u0007-e\u000e6", "E`[9X;", "\u001aea{T5MS \t\u0006(:{\u000fxW{/\u0003@\u0010l", "=m2?X+>\\(\u0003ve:i\t;u\u00045{?", "@dP@b5", "\u001aea{T5MS \t\u0006(:{\u000fxa\u00107~@\n&\u001bEk\u001d@\u0001.~7\u000e.Fw\u001e.Z!Hk3\u001e\u001ewe5\u000eq\u0019N\u00037KYN+IRnK\u001e\u001b0", "=m;<V(E/)\u000e}^5\f\r-a\u000f,\u0006I`$$Q|", "Bx_2", "\u001aea{T5MS \t\u0006(:{\u000fxa\u00107~@\n&\u001bEk\u001d@\u0001.~7\u000e.Fw\u001e.Z\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u000fG[Q6[A\u0007H\u0014g", "\u001aea{T5MS \t\u0006(:{\u000fxa\u00107~@\n&\u001bEk\u001d@\u0001.~@\b\u001e3tq>\\F;tC\"\u0013dp=\u0011l\f[\u00041T9N(j\\{\u0013", ";db@T.>", "=m;<V(E/)\u000e}^5\f\r-a\u000f,\u0006In'\u0015Eo\u001cJ", "=m??b=Ba\u001d\t\u0004b5~u/q\u0010,\t@\u007f", "/o_,e,ES\u0015\rz"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class AntelopManagerCallbacks implements WalletManagerCallbackCompat {
    private final String TAG;
    private final AntelopWalletModule owner;

    public AntelopManagerCallbacks(AntelopWalletModule antelopWalletModule) {
        Intrinsics.checkNotNullParameter(antelopWalletModule, Wg.vd("'.(\u001e.", (short) (Od.Xd() ^ (95009889 ^ (-95002494)))));
        this.owner = antelopWalletModule;
        int iXd = C1633zX.Xd() ^ (927332214 ^ 1125440656);
        int iXd2 = ZN.Xd() ^ (1886944719 ^ (-1139961961));
        short sXd = (short) (C1580rY.Xd() ^ iXd);
        short sXd2 = (short) (C1580rY.Xd() ^ iXd2);
        int[] iArr = new int["e\u0001hq{zr\u0001Xkwinkw".length()];
        QB qb = new QB("e\u0001hq{zr\u0001Xkwinkw");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        this.TAG = new String(iArr, 0, i2);
    }

    @Override // fr.antelop.sdk.WalletManagerCallbackCompat
    public void onAsyncRequestError(AsyncRequestType asyncRequestType, AntelopError antelopError, Object obj) throws Throwable {
        Intrinsics.checkNotNullParameter(asyncRequestType, hg.Vd("\u0012\u0004\u000f\u0012\u0001\u000e\u000e[\u0007zz", (short) (FB.Xd() ^ ((2100847117 ^ 1727174031) ^ 466256765)), (short) (FB.Xd() ^ ((763361401 ^ 1576271839) ^ 1888231163))));
        Intrinsics.checkNotNullParameter(antelopError, C1561oA.ud("Q]\\XZ", (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ (568690579 ^ 275574594)))));
        AntelopWalletModule antelopWalletModule = this.owner;
        Class<?> cls = Class.forName(C1561oA.yd("?JG\u0007D@TFZLGOLH\u0014IMaS_YT\\QUTba&Yh^`b_l.fn^}1Co|lrt|bku|t\u0003Z\u0004w\b}}", (short) (Od.Xd() ^ ((1373854036 ^ 832718228) ^ (-1614888106)))));
        Class<?>[] clsArr = new Class[C1633zX.Xd() ^ (314924473 ^ (-1720990096))];
        clsArr[0] = Class.forName(C1561oA.Yd("\u001a'c\u0018&-\u001f'+-k2$,o\u00047>4*\u001a.;@1@B#IA7", (short) (C1607wl.Xd() ^ (C1633zX.Xd() ^ (-1951489874)))));
        int iXd = C1633zX.Xd() ^ (816047275 ^ 1156754372);
        int iXd2 = FB.Xd() ^ (-1609502584);
        short sXd = (short) (C1633zX.Xd() ^ iXd);
        short sXd2 = (short) (C1633zX.Xd() ^ iXd2);
        int[] iArr = new int["|\nFz\t\u0010\u0002\n\u000e\u0010N\u0015\u0007\u000fRf\u0015\u001c\u000e\u0016\u001a\u001cq !\u001f#".length()];
        QB qb = new QB("|\nFz\t\u0010\u0002\n\u000e\u0010N\u0015\u0007\u000fRf\u0015\u001c\u000e\u0016\u001a\u001cq !\u001f#");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        clsArr[1] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = new Object[(1102086122 ^ 580727683) ^ 1663913067];
        objArr[0] = asyncRequestType;
        objArr[1] = antelopError;
        Method method = cls.getMethod(Jg.Wd("[z1U<\u0013{@]\u007faVo\u0010\u0013tTI_W2\u0012\u0017h", (short) (C1499aX.Xd() ^ (1559288903 ^ (-1559292564))), (short) (C1499aX.Xd() ^ (110312443 ^ (-110297796)))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(antelopWalletModule, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // fr.antelop.sdk.WalletManagerCallbackCompat
    public void onAsyncRequestSuccess(AsyncRequestType asyncRequestType, Object obj) throws Throwable {
        Intrinsics.checkNotNullParameter(asyncRequestType, ZO.xd("|LA8S\u0004h|=gv", (short) (C1580rY.Xd() ^ (ZN.Xd() ^ (-864713609))), (short) (C1580rY.Xd() ^ (C1633zX.Xd() ^ (800029195 ^ 1543380937)))));
        AntelopWalletModule antelopWalletModule = this.owner;
        Class<?> cls = Class.forName(C1626yg.Ud("}1>/;/=K4An\n^\u0016\u0010\u001d\u0018*!\u0004#GHC|,HA\u0007+f\u0006<X#\u001e\u0015 ]\u000e+x\u0018V\u001fZ''*~t\u0002A}qk!>3Iu", (short) (C1499aX.Xd() ^ (FB.Xd() ^ (1048181732 ^ (-1637271108)))), (short) (C1499aX.Xd() ^ (1452384575 ^ (-1452389099)))));
        Class<?>[] clsArr = {Class.forName(Ig.wd("D\t2>R\u001b8O\u0013t4[\u001d\u001a<YCc\u007f-](ZV{\u000e0?\u0017\u001f@", (short) (C1633zX.Xd() ^ (1810603587 ^ (-1810608071)))))};
        Object[] objArr = {asyncRequestType};
        short sXd = (short) (C1607wl.Xd() ^ ((1985567135 ^ 221810952) ^ 2070006837));
        int[] iArr = new int["!pQ \u00067\u0004l=KEm&4`@kW Y\f\\-'\t\\".length()];
        QB qb = new QB("!pQ \u00067\u0004l=KEm&4`@kW Y\f\\-'\t\\");
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
            method.invoke(antelopWalletModule, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // fr.antelop.sdk.WalletManagerCallbackCompat
    public void onConnectionError(AntelopError antelopError, Object obj) throws Throwable {
        Intrinsics.checkNotNullParameter(antelopError, C1561oA.Qd("DPOKM", (short) (C1499aX.Xd() ^ ((862869483 ^ 1077332613) ^ (-1935190432)))));
        AntelopWalletModule antelopWalletModule = this.owner;
        Class<?> cls = Class.forName(C1593ug.zd("\u0004\u0011\u0010Q\t\u0007\u001d\u0011\u001f\u0013\u0010\u001a\u0011\u000f\\\u0014\u0012(\u001c*\u001e\u001b%\u001c\u001a\u001b+,j 1)%)(7r-7)Bw\f:A3;?A)4@A;K%H>PHB", (short) (FB.Xd() ^ (OY.Xd() ^ 69958481)), (short) (FB.Xd() ^ (C1499aX.Xd() ^ (-1134241313)))));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (Od.Xd() ^ (2066859660 ^ (-2066871883)));
        int[] iArr = new int["\u001e)c\u0016\"'\u0017\u001d\u001f\u001f[ \u0010\u0016Wi\u0016\u001b\u000b\u0011\u0013\u0013f\u0013\u0012\u000e\u0010".length()];
        QB qb = new QB("\u001e)c\u0016\"'\u0017\u001d\u001f\u001f[ \u0010\u0016Wi\u0016\u001b\u000b\u0011\u0013\u0013f\u0013\u0012\u000e\u0010");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {antelopError};
        Method method = cls.getMethod(C1561oA.Kd("\u0003\u0003X\u0006\u0006\u0007~}\u0010\u0006\r\rd\u0013\u0014\u0012\u0016H\u0007\u0017\u0018\b\u001c\u0010\u0018\u0012\u000f\"\u0015", (short) (ZN.Xd() ^ (212755892 ^ 212762297))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(antelopWalletModule, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // fr.antelop.sdk.WalletManagerCallbackCompat
    public void onConnectionSuccess(Wallet wallet, Object obj) throws Throwable {
        Intrinsics.checkNotNullParameter(wallet, Wg.Zd("+yu[5)", (short) (C1633zX.Xd() ^ (C1580rY.Xd() ^ 831066927)), (short) (C1633zX.Xd() ^ ((1960769170 ^ 116052787) ^ (-1916038488)))));
        AntelopWalletModule antelopWalletModule = this.owner;
        Object[] objArr = {wallet};
        Method method = Class.forName(C1561oA.Xd("Wdc%\\Zpdrfcmdb0ge{o}qnxomn~\u007f>s\u0005|x|{\u000bF\u0001\u000b|\u0016K_\u000e\u0015\u0007\u000f\u0013\u0015|\b\u0014\u0015\u000f\u001fx\u001c\u0012$\u001c\u0016", (short) (C1607wl.Xd() ^ ((1575705297 ^ 307137495) ^ 1336260769)))).getMethod(Qg.kd("\u0010\u000ea\r\u000b\n\u007f|\r\u0001\u0006\u0004g\tutu\u0003\u00021m{zhzlrjevg", (short) (FB.Xd() ^ ((281946726 ^ 612180974) ^ 884176763)), (short) (FB.Xd() ^ (C1633zX.Xd() ^ (681942144 ^ (-1559530826))))), Class.forName(Wg.vd("\\i\"Vho]e]_\u001a`V^\u001eHgspj~", (short) (C1633zX.Xd() ^ (C1607wl.Xd() ^ (1907446575 ^ (-536173909)))))));
        try {
            method.setAccessible(true);
            method.invoke(antelopWalletModule, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // fr.antelop.sdk.WalletManagerCallbackCompat
    public void onCredentialsRequired(CustomerCredentialsRequiredReason customerCredentialsRequiredReason, AntelopError antelopError, Object obj) {
        int iXd = C1607wl.Xd() ^ (1612420521 ^ (-241155456));
        Intrinsics.checkNotNullParameter(customerCredentialsRequiredReason, hg.Vd("\u0006wr\u0004~|", (short) (C1580rY.Xd() ^ (531452905 ^ (-531462903))), (short) (C1580rY.Xd() ^ iXd)));
    }

    @Override // fr.antelop.sdk.WalletManagerCallbackCompat
    public void onLocalAuthenticationError(CustomerAuthenticationMethodType customerAuthenticationMethodType, LocalAuthenticationErrorReason localAuthenticationErrorReason, String str, Object obj) throws Throwable {
        Intrinsics.checkNotNullParameter(customerAuthenticationMethodType, C1561oA.ud(",0&\u001a", (short) (FB.Xd() ^ (Od.Xd() ^ 1207802721))));
        Intrinsics.checkNotNullParameter(localAuthenticationErrorReason, C1561oA.yd(" \u0012\u0011\"!\u001f", (short) (C1633zX.Xd() ^ (C1580rY.Xd() ^ 831086075))));
        AntelopWalletModule antelopWalletModule = this.owner;
        Class<?> cls = Class.forName(C1561oA.Yd("1>=~64J>L@=G><\nA?UIWKHRIGHXY\u0018M^VRVUd ZdVo%9gn`hlnVamnhxRuk}uo", (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (-831073628)))));
        Class<?>[] clsArr = new Class[OY.Xd() ^ 69929195];
        int iXd = C1499aX.Xd() ^ (80392241 ^ (-1196551177));
        clsArr[0] = Class.forName(Xg.qd(":G\u00048FM?GKM\fRDL\u0010DYYNLV]SNMaW^^\u001f5hgied]k;ppecmtjedxnuuUn~s{qb\t\u0001v", (short) (FB.Xd() ^ ((1750865211 ^ 635936500) ^ 1304154192)), (short) (FB.Xd() ^ iXd)));
        int iXd2 = Od.Xd() ^ (-1207816126);
        clsArr[1] = Class.forName(Jg.Wd("=4\rX\u0003\u0015\u001fB^kF$2G#r +<Qw\n\u0018.Edx\u00173~6u\u0003\r5\"s~\f'I[m\u007f\u001b:Hj\u0003e0Hdsl\u001c1Oh\u007f", (short) (C1580rY.Xd() ^ ((2087554801 ^ 1068351643) ^ (-1136672243))), (short) (C1580rY.Xd() ^ iXd2)));
        clsArr[1583547360 ^ 1583547362] = Class.forName(ZO.xd("x\u0015\r@05U-Z&\\\b@LWY", (short) (OY.Xd() ^ (OY.Xd() ^ 69938483)), (short) (OY.Xd() ^ (C1633zX.Xd() ^ (-1951488932)))));
        Object[] objArr = new Object[C1499aX.Xd() ^ (1632639287 ^ (-583761448))];
        objArr[0] = customerAuthenticationMethodType;
        objArr[1] = localAuthenticationErrorReason;
        objArr[Od.Xd() ^ (648084334 ^ 1633513273)] = str;
        short sXd = (short) (Od.Xd() ^ (FB.Xd() ^ (217571197 ^ (-1394141761))));
        short sXd2 = (short) (Od.Xd() ^ ((804678676 ^ 1339506185) ^ (-1612782501)));
        int[] iArr = new int["_MuV\b7SgH3MQ\u0014K\\M\u0003WU7x\u0006\u001eZ\u0019T=\u0016".length()];
        QB qb = new QB("_MuV\b7SgH3MQ\u0014K\\M\u0003WU7x\u0006\u001eZ\u0019T=\u0016");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
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

    @Override // fr.antelop.sdk.WalletManagerCallbackCompat
    public void onLocalAuthenticationSuccess(CustomerAuthenticationMethodType customerAuthenticationMethodType, Object obj) throws Throwable {
        Intrinsics.checkNotNullParameter(customerAuthenticationMethodType, Ig.wd("T\nnP", (short) (C1633zX.Xd() ^ (2023764798 ^ (-2023752640)))));
        AntelopWalletModule antelopWalletModule = this.owner;
        Object[] objArr = {customerAuthenticationMethodType};
        Method method = Class.forName(EO.Od("e\"\u0010*\"l($paYFgd+Eo\u001d9@r$\u0019\rIGuK!\u0005;Ur\rD\u0006gGM6T2p&\u0004\u0003@\u001c!!U\u0006kN\u0011\u0017\u0012nN9\u0010", (short) (C1633zX.Xd() ^ (FB.Xd() ^ (-1609512452))))).getMethod(C1593ug.zd("\u0005\u0005c\b|{\b]\u0013\u0013\bs\u0017\u0006\u0007\n\u0019\u001aK\n\u001a\u001b\u000b\u001f\u0013\u001b\u0015\u0012%\u0018", (short) (FB.Xd() ^ (FB.Xd() ^ 1609530750)), (short) (FB.Xd() ^ (6919758 ^ 6938779))), Class.forName(C1561oA.Qd("w\u0003=o{\u0001pvxx5yio1cvtgckpd]Zl`ec\"6gdd^[R^,_]PLTYMFCUINL*AOBH<+OE9", (short) (C1607wl.Xd() ^ (C1633zX.Xd() ^ (904712297 ^ (-1102960238)))))));
        try {
            method.setAccessible(true);
            method.invoke(antelopWalletModule, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // fr.antelop.sdk.WalletManagerCallbackCompat
    public void onProvisioningRequired(Object obj) throws Throwable {
        AntelopWalletModule antelopWalletModule = this.owner;
        int iXd = C1499aX.Xd() ^ (-1134248510);
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.od("~\n\u0007F{w\f}\n{v~so;pl\u0001r~pkshdcqp-`oe_a^k%]eUl 2^cSY[[AJTSKY1RFVLD", (short) (FB.Xd() ^ iXd))).getMethod(C1561oA.Kd("[[>a_g[f]dd`f`L`mrgqee&dtueymuol\u007fr", (short) (ZN.Xd() ^ (FB.Xd() ^ 1609523789))), new Class[0]);
        try {
            method.setAccessible(true);
            method.invoke(antelopWalletModule, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
