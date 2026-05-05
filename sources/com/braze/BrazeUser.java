package com.braze;

import bo.app.aj;
import bo.app.ak;
import bo.app.ba;
import bo.app.bj;
import bo.app.bk;
import bo.app.cj;
import bo.app.ck;
import bo.app.di;
import bo.app.dj;
import bo.app.dk;
import bo.app.e00;
import bo.app.ei;
import bo.app.ej;
import bo.app.ek;
import bo.app.fi;
import bo.app.fj;
import bo.app.fk;
import bo.app.gi;
import bo.app.gj;
import bo.app.gk;
import bo.app.h00;
import bo.app.hi;
import bo.app.hj;
import bo.app.hk;
import bo.app.ii;
import bo.app.ij;
import bo.app.ik;
import bo.app.j9;
import bo.app.ji;
import bo.app.jj;
import bo.app.jk;
import bo.app.ki;
import bo.app.kj;
import bo.app.kk;
import bo.app.l9;
import bo.app.li;
import bo.app.lj;
import bo.app.lk;
import bo.app.m9;
import bo.app.mi;
import bo.app.mj;
import bo.app.mk;
import bo.app.ni;
import bo.app.nj;
import bo.app.nk;
import bo.app.o9;
import bo.app.oi;
import bo.app.oj;
import bo.app.ok;
import bo.app.pi;
import bo.app.pj;
import bo.app.pk;
import bo.app.qa0;
import bo.app.qi;
import bo.app.qj;
import bo.app.qk;
import bo.app.r9;
import bo.app.ri;
import bo.app.rj;
import bo.app.rk;
import bo.app.s8;
import bo.app.si;
import bo.app.sj;
import bo.app.sk;
import bo.app.tf;
import bo.app.ti;
import bo.app.tj;
import bo.app.tk;
import bo.app.u9;
import bo.app.uh0;
import bo.app.ui;
import bo.app.uj;
import bo.app.uk;
import bo.app.v9;
import bo.app.vb0;
import bo.app.vi;
import bo.app.vj;
import bo.app.vk;
import bo.app.w9;
import bo.app.wi;
import bo.app.wj;
import bo.app.wn;
import bo.app.xi;
import bo.app.xj;
import bo.app.y00;
import bo.app.yi;
import bo.app.yj;
import bo.app.z9;
import bo.app.zc0;
import bo.app.zd;
import bo.app.zi;
import bo.app.zj;
import com.braze.enums.BrazeDateFormat;
import com.braze.enums.Gender;
import com.braze.enums.Month;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.models.outgoing.AttributionData;
import com.braze.models.outgoing.BrazeLocation;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.ValidationUtils;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;
import yg.InterfaceC1492Gx;

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
@Metadata(bv = {}, d1 = {"Яğ\u0014D57\u001eq\u007fR܀kt\u0012M\u000e0\u0011.J~05\u001aw\rmr9FDmH4S[*\u001dq\u0004é,[:qK;[\"\u0006\"\u001fOVgm{RZ\u0019H\u0017إ\u001exx3Qǁ\u0001] \u0013:ԏw?IMw=?`|6\u001b :\">z\r\u0001(9P\u0010|\u0002KK\"\u00128@v@Z\r[\u0005\"\u0012\fE(\u00014\\oN<Ht]P/+\u0003oDV'u0\u0005M\u0013F\\'#vi\u001e1@?5+%[\u0003\rYaD\u0019ӊ\"=3ggV1ɞ\u0004[D2\u0018\u0014C\u0004_\u0011kO>\\3-p\u00105\ngcyP\u001e,\u0006\\\u0014\rjd\u001e\n5-F-HJڿ\u00125z`a/\u0019\u001dlF\u0018z\u00109G)\u000e4C9If\u0002eI\u001bf7*\u0005ڟ\"%\u0007r/`\u001d#n\u001c3T&TaWNC`P Xkmձtd\b1\u00128\u0010\u0015=\u0006).E(gaG,9m\u0018GrgЛ\tbn]wZ\u0011U0z.7X\f<`Ro\u001dmfS\u0007,ҭQ\u001eZ\u0013\f\u0010[3j\u0007T!S\u0013~Svw\u0003M\f\u0017ɻ3h=h|{VzGtK5\u007ff@e`\t,?js5\\tVk\f\toX&@]\u0003\u0010&\rΌR\u000e\u0019HM\tdI:J1\\CK3$PY\u0015\u000buY\u0017\u0010њX5*\u001cw,=\u001e\u000fktp\u001ej)O:\u0017x$C@\u007f5Ԋ*W(\u0004B\u0005k\u001c\r\u0011\u0018G\u0016OwRz2\u000eW\u0012\u001fD\u001a\u07fcU1C0\u001d\u0007qE\u0010M]L!h\u0002Q F\u0013|(-³l0m(x\u0012tsxmgTE%'b\u0001E d.\u0018ӶJ|M\u0007b,$QW\u0018\u001bYjQh\u0001\u0013C6%/oݕ\u000173h5%^\u000b\"U-a\fl 2\b\u0007'&#eנ0e\u001c\u0016pY&GI`aY-AR*z*ZJ\u0001v6Bީ8\u000f9pOl9qFx#/,i70\u001b\u001an[h\u0013 \u0002BXw*\"F\u0382\u0018`IP\u001fy\u001c\u0003{\u0019c\\9M?\u000e\u0019%In@\u001cm$d\u0002z\t^\u0017֯\u001c8Gfp2\u0005$2_D<6\u000esXw/(z.F\u0010\u0013%\\Zsi\u0005ոXzb\u0002V4)`nLB\u0001-\u0012c\"\u0007^I\u0005\u001cF\u00053q\\\u0019SK9ƨnQ\u0005\u00123\\\roGF@X/\u000euaQr\u001a62GYqy\u001a$8F|ܫF\u001a!d_\u0016(\u0012>\n#U\u0013Q\u0015z \u0010jNP)/~\u000b8T\n==ĢStu\u000e;\u007f\u0017\u001fEn2\u0001EGY\u000b\u001a&{FI-69;gajB[,]Y;\f=8 U\u0007;&Ǜ[\u0010l5kQ\u00031\u007fAz\u00027\u0016\u0001$\u0012Wbt!\n^\fDy\u001a30JȨ]m}LN_s\b\u0014{ch'\r\u0014pq\u0018m\u000b1faZ\b\u0019EPK\tߓQ0\u0019\u0012h?Yn.\u0013)\u007fB\u0018V#D1z)>O\u0014l~\u0016g[;+Խo,gk>Wf!-7\u000e\u0004XWX\u0019I\u007fe>\u0013\t\rxP\u0014&fz,tv\"(B|-\u0004ր\u0015\u0015:\u0004\u0001\\-BEX7[;J\u0011\u000b\u0012na&O1ĿC\u001d=q\u0019wp\u0012\u001fDRb#\u0003ZF\u0017\u001c\u0018gZ-vXKZ?YR\u001e҉\u0007(Q\u0007FsPK\u001fQ)/\t;PBjC4;\u007f3q\u001f\u0017\u0001#z\u001eo5*{oܱW'0D\u000b.UR\bu\u0004:\":#'=8\b\u001b\u0006f֑)7k\u00115\u0014JzXFec\u0005\u0012\u00122W{] \u0010TnEˌ#&*M\u0004kH\u0007?\u0018B_\u000b\u000f\u0007weM>*d!t'U7\u0011s8^\u001a ydi-LC\u0011\u0013Gvn23l\u0015\u0012ej\u0010\nr?u\u001c=\u000f\u0014vK\u0019\u0013\u000f}$\u00070߳vO5,k\r[\u0017\u0012\fJadHwDgS\u001e-@T\u0014nx7i_>jB\u0011\u001bN\u00101\u0001\u0013ڞd\u001f\u001exYI\u000fIjLeA\u0011Yp\u00132\bFB:\u000bʲ\u001a0Nj\u0010R\u0013\b#hKG\"Dw\u0016d%9\u001d?[U\n3\u0012\u0003GmT\"^C9A@\u0006J\u00078,a֓Y#Q:9kH\u00069\u0006_Vl\u001dZ\\\u00147]dv\u0010t|Rh\u00060^`ʒ\u0003\\I5\u000fMoOcn}~`;m[;ɲ-Ů[rZW)\u0007\u0007\\S\"Ou+\u000bL/o2yє\u000fжB\u007f\u0010^O2\u000bK\u001a$\u0011@b!]\u0006u/\u007fKCɢqȍ\u001d[G\u0001\u0012~5\u0004V%2D\u007f\u0013\u0018nX_YԘ8̨-LS[\u0017HPM_\r\u0003pF\ff9<=\\\u0089dɲ9?gB2\u0013~n\u0018axcBe\u001eM+Y$Қ-ݕ\u001dB9s\u0017K]Hd\u0011_Fp>EWVD!k2\u001dTa2\rgtmƐoݺn}lb\u0017DBWPf\u007f_t9ٓg."}, d2 = {"\u001ab^:\")KO.~D;9x\u001e/U\u000e(\t\u0016", "", "", "/kX.f", ":`Q2_", "", "/cS\u000e_0:a", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@okqB", "4ha@g\u0015:[\u0019", "Adc\u0013\\9Lb\u0002z\u0003^", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?5", ":`bAA(FS", "Adc\u0019T:M<\u0015\u0007z", "3lP6_", "Adc\u0012`(BZ", "\u001ab^:\")KO.~D^5\r\u0011=/a(\u0005?\u0001$l", "5d]1X9", "Adc\u0014X5=S&", "uKR<`u;`\u0015\u0014z(,\u0006\u00197sI\n{I\u007f\u0017$\u001d3\u0003", "", "GdP?", "\u001ab^:\")KO.~D^5\r\u0011=/g2\u0005O\u0004l", ";n]A[", "2`h", "Adc\u0011T;>=\u001a[~k;\u007f", "uH;0b4\bP&z\u0010^u|\u0012?m\u000eqcJ\n&\u001a\u001dSQ1", "1nd;g9R", "Adc\u0010b<Gb&\u0013", "6n\\260Mg", "Adc\u0015b4>1\u001d\u000e\u000f", ":`]4h(@S", "Adc\u0019T5@c\u0015\u0001z", "\u001ab^:\")KO.~D^5\r\u0011=/h2\u000bD\u0002\u001b\u0015C~\u0012F\u007f\u0013EV\f\u001eDq!=QMDZH)\u0015>", "3lP6_\u0015Hb\u001d\u007f~\\(\f\r9nm8xN~$\u001bR~\u0012F\u007f\u0014Id}", "Adc\u0012`(BZ\u0002\t\nb-\u0001\u0007+t\u00042\u0005.\u0011\u0014%E|\u0012G\u0006)?bl4Bm", "uKR<`u;`\u0015\u0014z(,\u0006\u00197sI\u0011\u0006O\u0005\u0018\u001bEk\u001d@\u0001.#iz.5z\u001a9\\GEt#2 h7|{", ">tb5A6MW\u001a\u0003xZ;\u0001\u00138S\u0010%\n>\u000e\u001b\"Vs\u0018Ee9@Y", "Adc\u001dh:A<#\u000e~_0z\u0005>i\n1iP}%\u0015Ts\u0019Kz/>H\u0012+7", "AtQ@V9B^(\u0003\u0005g\u000e\n\u0013?pc'", "/cS!b\u001aNP'|\bb7\f\r9na5\u0006P\f", "@d\\<i,\u001f`#\u0007hn)\u000b\u0007<i\u000b7\u007fJ\nx$Q\u007f\u0019", ">g^;X\u0015N[\u0016~\b", "Adc\u001d[6GS\u0002\u000f\u0003[,\n", "9dh", "D`[BX", "Adc\u0010h:M]!n\t^9X\u0018>r\u0004%\fO\u0001", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}p\u0004u", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004u", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}\\\u0004u", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}`\u0004u", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}Z\u0004u", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", ";da4X", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bJ\u000e\u0019`L}\u0018E@\n#Cf\n4r\u0016,\\\u00190/)", "\u001ana4\"1L]\"H_L\u0016ed<r{<Q", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bJ\u000e\u0019`L}\u0018E@\n#Cf{Dz\u0012B#\u00070", "/cS!b\nNa(\t\u0003:;\f\u00163b\u00107{\u001c\u000e$\u0013[", "@d\\<i,\u001f`#\u0007Xn:\f\u00137A\u000f7\tD}'&GK\u001bIr9", "", "D`[BX:", "Adc\u0010h:M]!Z\nm9\u0001\u0006?t\u007f\u0004\tM|+", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004\u00118", "Adc\u0010h:M]!n\t^9X\u0018>r\u0004%\fO\u0001\u0006!0y ", "AdR<a+L4&\t\u0003>7\u0007\u00072", "Adc\u0010h:M]!n\t^9X\u0018>r\u0004%\fO\u0001\u0006!5o\fF\u007f$C:\u000b*?M!8KF", "7mR?X4>\\(ove<|", "7mR?X4>\\(\\\u000bl;\u0007\u0011\u001fs\u007f5WO\u0010$\u001bD\u007f\u001d<", "Cmb2g\nNa(\t\u0003N:|\u0016\u000bt\u000f5\u007f=\u0011&\u0017", "\u001ab^:\")KO.~Df6{\t6sI2\fO\u0003!\u001bPqW\u0018\u00064B]z0Fq 7,?Jg\n", "/sc?\\)Nb\u001d\t\u0004=(\f\u0005", "Adc\u000eg;KW\u0016\u000f\nb6\u0006g+t{", "uKR<`u;`\u0015\u0014z(4\u0007\b/l\u000eq\u0006P\u0010\u0019!Kx\u0010\u0006R4Df\u0002\u001dG|\u001a8V\"7z0sX]", ":`c6g<=S", ":n]4\\;NR\u0019", "/kc6g<=S", "/bRBe(<g", "DdaA\\*:Zt|xn9x\u0007C", "", "Adc\u0019T:M9\"\t\rg\u0013\u0007\u0007+t\u00042\u0005", "uC3\u0019](OOb\u0006vg.Fg9u|/{\u0016g\u001c\u0013XkWCr.7#\\*Gj\u001d.#*@gE\u001a^o]B\t-\u000bX\u0007$NL$oM", "Adc\u0019b*:b\u001d\t\u0004<<\u000b\u00189m[7\u000bM\u0005\u0014'Vo", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}Z\u001fD\b", "Cmb2g\u0013HQ\u0015\u000e~h5Z\u0019=t\n0WO\u0010$\u001bD\u007f\u001d<", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "Adc\u0010h:M]!Z\nm9\u0001\u0006?t\u007f", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k#\u00118", "Adc\u0010h:M]!Z\nm9\u0001\u0006?t\u007f\u0017\u0006.\u0001\u0015!Pn\u001c\u001d\u0004/=9\t*5p", "\u001aa^{T7I\u001d)\u0002E4", "CrT?6(<V\u0019", "\u001aa^{T7I\u001d)\u0002E4", "\u001aa^{T7I\u001d\u001cIE4", "0qPGX\u0014:\\\u0015\u0001zk", "\u001aa^{T7I\u001d\u001cIE4", "7mc2e5:Z\t\rzk\u0010{", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "\u001aa^{T7I\u001d-IE4", ":nR.g0H\\\u0001z\u0004Z.|\u0016", "\u001aa^{T7I\u001d-IE4", "\u001aa^{T7I\u001d*{E4", "AdaCX9\u001c]\"\u007f~`\u001a\f\u0013<a\u0002(fM\u000b(\u001bFo\u001b", "\u001aa^{T7I\u001d*{E4", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u001e!Eu\u001c\u0006c%5b\r-3v%\u0015WAAA", "CrT?<+%]\u0017\u0005", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u001e!Eu\u001c\u0006c%5b\r-3v%\u0015WAAA", "CrT?<+", "5dc\"f,K7\u0018", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\"f,K7\u0018", "\nh]6g\u0005", "uKQ<\"(I^b\u000f})\u0002c\u00069/{3\u0007\n\u0004aa\u001dV\u00138\b!~`y)97\u0004=ZGDm\n\u0005\u0012r+5\u0012nubAq\u001d3K6&N}H]#WX$n}", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xs = "")
public final class BrazeUser {
    private final h00 brazeManager;
    private volatile String internalUserId;
    private final y00 locationManager;
    private final vb0 serverConfigStorageProvider;
    private final uh0 userCache;
    private final ReentrantLock userIdLock;

    public BrazeUser(uh0 userCache, h00 brazeManager, String internalUserId, y00 locationManager, vb0 serverConfigStorageProvider) {
        Intrinsics.checkNotNullParameter(userCache, "userCache");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(internalUserId, "internalUserId");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        this.userCache = userCache;
        this.brazeManager = brazeManager;
        this.internalUserId = internalUserId;
        this.locationManager = locationManager;
        this.serverConfigStorageProvider = serverConfigStorageProvider;
        this.userIdLock = new ReentrantLock();
    }

    public static /* synthetic */ boolean incrementCustomUserAttribute$default(BrazeUser brazeUser, String str, int i2, int i3, Object obj) {
        if ((i3 + 2) - (i3 | 2) != 0) {
            i2 = 1;
        }
        return brazeUser.incrementCustomUserAttribute(str, i2);
    }

    public static /* synthetic */ boolean setCustomAttribute$default(BrazeUser brazeUser, String str, Object obj, boolean z2, int i2, Object obj2) {
        if ((i2 + 4) - (i2 | 4) != 0) {
            z2 = false;
        }
        return brazeUser.setCustomAttribute(str, obj, z2);
    }

    public static /* synthetic */ boolean setCustomUserAttribute$default(BrazeUser brazeUser, String str, JSONObject jSONObject, boolean z2, int i2, Object obj) {
        if ((i2 + 4) - (i2 | 4) != 0) {
            z2 = false;
        }
        return brazeUser.setCustomUserAttribute(str, jSONObject, z2);
    }

    public static /* synthetic */ void setLastKnownLocation$default(BrazeUser brazeUser, double d2, double d3, Double d4, Double d5, Double d6, int i2, Object obj) {
        Double d7 = d5;
        Double d8 = d4;
        if ((i2 & 4) != 0) {
            d8 = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            d7 = null;
        }
        brazeUser.setLastKnownLocation(d2, d3, d8, d7, (i2 + 16) - (i2 | 16) == 0 ? d6 : null);
    }

    public final boolean addAlias(String alias, String label) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(label, "label");
        boolean zA = false;
        if (StringsKt.isBlank(alias)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) di.f495a, 6, (Object) null);
            return false;
        }
        if (StringsKt.isBlank(label)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) ei.f577a, 6, (Object) null);
            return false;
        }
        try {
            z9 z9Var = ba.f257g;
            z9Var.getClass();
            Intrinsics.checkNotNullParameter(alias, "alias");
            Intrinsics.checkNotNullParameter(label, "label");
            e00 e00VarA = z9Var.a(new w9(alias, label));
            if (e00VarA == null) {
                return false;
            }
            zA = ((tf) this.brazeManager).a(e00VarA);
            return zA;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new fi(alias), 4, (Object) null);
            return zA;
        }
    }

    public final boolean addToCustomAttributeArray(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            if (!com.braze.support.d.a(key, this.serverConfigStorageProvider.a())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) gi.f760a, 6, (Object) null);
                return false;
            }
            if (value == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) com.braze.support.d.f2701a, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) wn.f2159a, 6, (Object) null);
                return false;
            }
            String key2 = ValidationUtils.ensureBrazeFieldLength(key);
            String value2 = ValidationUtils.ensureBrazeFieldLength(value);
            z9 z9Var = ba.f257g;
            z9Var.getClass();
            Intrinsics.checkNotNullParameter(key2, "key");
            Intrinsics.checkNotNullParameter(value2, "value");
            e00 e00VarA = z9Var.a(new s8(key2, value2));
            if (e00VarA == null) {
                return false;
            }
            return ((tf) this.brazeManager).a(e00VarA);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new hi(key), 4, (Object) null);
            return false;
        }
    }

    public final boolean addToSubscriptionGroup(String subscriptionGroupId) {
        Intrinsics.checkNotNullParameter(subscriptionGroupId, "subscriptionGroupId");
        try {
            if (StringsKt.isBlank(subscriptionGroupId)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) ii.f916a, 6, (Object) null);
                return false;
            }
            z9 z9Var = ba.f257g;
            zc0 subscriptionGroupStatus = zc0.SUBSCRIBED;
            z9Var.getClass();
            Intrinsics.checkNotNullParameter(subscriptionGroupId, "subscriptionGroupId");
            Intrinsics.checkNotNullParameter(subscriptionGroupStatus, "subscriptionGroupStatus");
            e00 e00VarA = z9Var.a(new v9(subscriptionGroupId, subscriptionGroupStatus));
            if (e00VarA == null) {
                return true;
            }
            ((tf) this.brazeManager).a(e00VarA);
            return true;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new ji(subscriptionGroupId), 4, (Object) null);
            return false;
        }
    }

    public final String getUserId() {
        ReentrantLock reentrantLock = this.userIdLock;
        reentrantLock.lock();
        try {
            return this.internalUserId;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean incrementCustomUserAttribute(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return incrementCustomUserAttribute$default(this, key, 0, 2, null);
    }

    public final boolean incrementCustomUserAttribute(String key, int i2) {
        Intrinsics.checkNotNullParameter(key, "key");
        boolean zA = false;
        try {
            if (!com.braze.support.d.a(key, this.serverConfigStorageProvider.a())) {
                return false;
            }
            String customUserAttributeKey = ValidationUtils.ensureBrazeFieldLength(key);
            z9 z9Var = ba.f257g;
            z9Var.getClass();
            Intrinsics.checkNotNullParameter(customUserAttributeKey, "customUserAttributeKey");
            e00 e00VarA = z9Var.a(new j9(customUserAttributeKey, i2));
            if (e00VarA == null) {
                return false;
            }
            zA = ((tf) this.brazeManager).a(e00VarA);
            return zA;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new ki(key, i2), 4, (Object) null);
            return zA;
        }
    }

    public final boolean removeFromCustomAttributeArray(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            if (!com.braze.support.d.a(key, this.serverConfigStorageProvider.a())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) li.f1198a, 6, (Object) null);
                return false;
            }
            if (value == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) com.braze.support.d.f2701a, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) wn.f2159a, 6, (Object) null);
                return false;
            }
            String key2 = ValidationUtils.ensureBrazeFieldLength(key);
            String value2 = ValidationUtils.ensureBrazeFieldLength(value);
            z9 z9Var = ba.f257g;
            z9Var.getClass();
            Intrinsics.checkNotNullParameter(key2, "key");
            Intrinsics.checkNotNullParameter(value2, "value");
            e00 e00VarA = z9Var.a(new r9(key2, value2));
            if (e00VarA == null) {
                return false;
            }
            return ((tf) this.brazeManager).a(e00VarA);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new mi(key), 4, (Object) null);
            return false;
        }
    }

    public final boolean removeFromSubscriptionGroup(String subscriptionGroupId) {
        Intrinsics.checkNotNullParameter(subscriptionGroupId, "subscriptionGroupId");
        try {
            if (StringsKt.isBlank(subscriptionGroupId)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) ni.f1366a, 6, (Object) null);
                return false;
            }
            z9 z9Var = ba.f257g;
            zc0 subscriptionGroupStatus = zc0.UNSUBSCRIBED;
            z9Var.getClass();
            Intrinsics.checkNotNullParameter(subscriptionGroupId, "subscriptionGroupId");
            Intrinsics.checkNotNullParameter(subscriptionGroupStatus, "subscriptionGroupStatus");
            e00 e00VarA = z9Var.a(new v9(subscriptionGroupId, subscriptionGroupStatus));
            if (e00VarA == null) {
                return true;
            }
            ((tf) this.brazeManager).a(e00VarA);
            return true;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new oi(subscriptionGroupId), 4, (Object) null);
            return false;
        }
    }

    public final boolean setAttributionData(AttributionData attributionData) {
        try {
            BuildersKt__Builders_commonKt.launch$default(qa0.f1589a, null, null, new pi(this, attributionData, null), 3, null);
            return true;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) qi.f1607a, 4, (Object) null);
            return false;
        }
    }

    public final boolean setCountry(String str) {
        if (str != null) {
            try {
                if (StringsKt.isBlank(str)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) ri.f1694a, 6, (Object) null);
                    return false;
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new ti(str), 4, (Object) null);
                return false;
            }
        }
        BuildersKt__Builders_commonKt.launch$default(qa0.f1589a, null, null, new si(this, str, null), 3, null);
        return true;
    }

    public final boolean setCustomAttribute(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return setCustomAttribute$default(this, key, value, false, 4, null);
    }

    public final boolean setCustomAttribute(String key, Object value, boolean z2) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!com.braze.support.d.a(key, this.serverConfigStorageProvider.a())) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) ui.f1950a, 6, (Object) null);
            return false;
        }
        String key2 = ValidationUtils.ensureBrazeFieldLength(key);
        Object objA = com.braze.support.d.f2701a.a(value, 0);
        if (objA == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new vi(key, value), 6, (Object) null);
            return false;
        }
        if (!(objA instanceof JSONObject) || !z2) {
            BuildersKt__Builders_commonKt.launch$default(qa0.f1589a, null, null, new xi(this, key2, objA, null), 3, null);
            return true;
        }
        z9 z9Var = ba.f257g;
        JSONObject json = (JSONObject) objA;
        z9Var.getClass();
        Intrinsics.checkNotNullParameter(key2, "key");
        Intrinsics.checkNotNullParameter(json, "json");
        e00 e00VarA = z9Var.a(new o9(key2, json));
        if (e00VarA != null) {
            return ((tf) this.brazeManager).a(e00VarA);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new wi(key2, objA), 6, (Object) null);
        return false;
    }

    public final boolean setCustomAttributeArray(String key, String[] values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        boolean zA = false;
        try {
            if (!com.braze.support.d.a(key, this.serverConfigStorageProvider.a())) {
                return false;
            }
            String key2 = ValidationUtils.ensureBrazeFieldLength(key);
            Intrinsics.checkNotNullParameter(values, "values");
            ArrayList arrayList = new ArrayList(values.length);
            for (String str : values) {
                arrayList.add(ValidationUtils.ensureBrazeFieldLength(str));
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            z9 z9Var = ba.f257g;
            z9Var.getClass();
            Intrinsics.checkNotNullParameter(key2, "key");
            e00 e00VarA = z9Var.a(new u9(key2, strArr));
            if (e00VarA == null) {
                return false;
            }
            zA = ((tf) this.brazeManager).a(e00VarA);
            return zA;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new yi(key), 4, (Object) null);
            return zA;
        }
    }

    public final boolean setCustomAttributeToSecondsFromEpoch(String key, long j2) {
        Intrinsics.checkNotNullParameter(key, "key");
        return setCustomAttribute$default(this, key, DateTimeUtils.createDate(j2), false, 4, null);
    }

    public final boolean setCustomUserAttribute(String key, double d2) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return setCustomAttribute$default(this, key, Double.valueOf(d2), false, 4, null);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new ej(key), 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, float f2) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return setCustomAttribute$default(this, key, Float.valueOf(f2), false, 4, null);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new bj(key), 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, int i2) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return setCustomAttribute$default(this, key, Integer.valueOf(i2), false, 4, null);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new aj(key), 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, long j2) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return setCustomAttribute$default(this, key, Long.valueOf(j2), false, 4, null);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new cj(key), 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            return setCustomAttribute$default(this, key, value, false, 4, null);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new dj(key), 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, JSONArray value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            return setCustomAttribute$default(this, key, value, false, 4, null);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new gj(key, value), 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, JSONObject value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return setCustomUserAttribute$default(this, key, value, false, 4, null);
    }

    public final boolean setCustomUserAttribute(String key, JSONObject value, boolean z2) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            return setCustomAttribute(key, value, z2);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new fj(key, value), 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, boolean z2) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return setCustomAttribute$default(this, key, Boolean.valueOf(z2), false, 4, null);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new zi(key), 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttributeToNow(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return setCustomAttributeToSecondsFromEpoch(key, DateTimeUtils.nowInSeconds());
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new hj(key), 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttributeToSecondsFromEpoch(String key, long j2) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return setCustomAttributeToSecondsFromEpoch(key, j2);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new ij(key, j2), 4, (Object) null);
            return false;
        }
    }

    public final boolean setDateOfBirth(int i2, Month month, int i3) {
        Intrinsics.checkNotNullParameter(month, "month");
        try {
            BuildersKt__Builders_commonKt.launch$default(qa0.f1589a, null, null, new jj(this, DateTimeUtils.formatDate$default(DateTimeUtils.createDate$default(i2, month.getValue(), i3, 0, 0, 0, 56, null), BrazeDateFormat.SHORT, null, 2, null), null), 3, null);
            return true;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new kj(i2, month, i3), 4, (Object) null);
            return false;
        }
    }

    public final boolean setEmail(String str) {
        String string;
        if (str != null) {
            try {
                if (StringsKt.isBlank(str)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) lj.f1200a, 6, (Object) null);
                    return false;
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new oj(str), 4, (Object) null);
                return false;
            }
        }
        if (str != null) {
            int length = str.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                boolean z3 = Intrinsics.compare((int) str.charAt(!z2 ? i2 : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    }
                    length--;
                } else if (z3) {
                    i2++;
                } else {
                    z2 = true;
                }
            }
            string = str.subSequence(i2, length + 1).toString();
        } else {
            string = null;
        }
        if (string == null || ValidationUtils.isValidEmailAddress(string)) {
            BuildersKt__Builders_commonKt.launch$default(qa0.f1589a, null, null, new mj(this, string, null), 3, null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new nj(str), 7, (Object) null);
        return false;
    }

    public final boolean setEmailNotificationSubscriptionType(NotificationSubscriptionType emailNotificationSubscriptionType) {
        Intrinsics.checkNotNullParameter(emailNotificationSubscriptionType, "emailNotificationSubscriptionType");
        try {
            BuildersKt__Builders_commonKt.launch$default(qa0.f1589a, null, null, new pj(this, emailNotificationSubscriptionType, null), 3, null);
            return true;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new qj(emailNotificationSubscriptionType), 4, (Object) null);
            return false;
        }
    }

    public final boolean setFirstName(String str) {
        if (str != null) {
            try {
                if (StringsKt.isBlank(str)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) rj.f1697a, 6, (Object) null);
                    return false;
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new tj(str), 4, (Object) null);
                return false;
            }
        }
        BuildersKt__Builders_commonKt.launch$default(qa0.f1589a, null, null, new sj(this, str, null), 3, null);
        return true;
    }

    public final boolean setGender(Gender gender) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        try {
            BuildersKt__Builders_commonKt.launch$default(qa0.f1589a, null, null, new uj(this, gender, null), 3, null);
            return true;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new vj(gender), 4, (Object) null);
            return false;
        }
    }

    public final boolean setHomeCity(String str) {
        if (str != null) {
            try {
                if (StringsKt.isBlank(str)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) wj.f2152a, 6, (Object) null);
                    return false;
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new yj(str), 4, (Object) null);
                return false;
            }
        }
        BuildersKt__Builders_commonKt.launch$default(qa0.f1589a, null, null, new xj(this, str, null), 3, null);
        return true;
    }

    public final boolean setLanguage(String str) {
        if (str != null) {
            try {
                if (StringsKt.isBlank(str)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) zj.f2402a, 6, (Object) null);
                    return false;
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new bk(str), 4, (Object) null);
                return false;
            }
        }
        BuildersKt__Builders_commonKt.launch$default(qa0.f1589a, null, null, new ak(this, str, null), 3, null);
        return true;
    }

    public final void setLastKnownLocation(double d2, double d3) {
        setLastKnownLocation$default(this, d2, d3, null, null, null, 28, null);
    }

    public final void setLastKnownLocation(double d2, double d3, Double d4) {
        setLastKnownLocation$default(this, d2, d3, d4, null, null, 24, null);
    }

    public final void setLastKnownLocation(double d2, double d3, Double d4, Double d5) {
        setLastKnownLocation$default(this, d2, d3, d4, d5, null, 16, null);
    }

    public final void setLastKnownLocation(double d2, double d3, Double d4, Double d5, Double d6) {
        try {
        } catch (Exception e2) {
            e = e2;
        }
        try {
            ((zd) this.locationManager).a(new BrazeLocation(d2, d3, d4, d5, d6));
        } catch (Exception e3) {
            e = e3;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) ck.f409a, 4, (Object) null);
        }
    }

    public final boolean setLastName(String str) {
        if (str != null) {
            try {
                if (StringsKt.isBlank(str)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) dk.f498a, 6, (Object) null);
                    return false;
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new fk(str), 4, (Object) null);
                return false;
            }
        }
        BuildersKt__Builders_commonKt.launch$default(qa0.f1589a, null, null, new ek(this, str, null), 3, null);
        return true;
    }

    public final void setLocationCustomAttribute(String key, double d2, double d3) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            if (!com.braze.support.d.a(key, this.serverConfigStorageProvider.a())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) gk.f764a, 6, (Object) null);
                return;
            }
            if (!ValidationUtils.isValidLocation(d2, d3)) {
                try {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new hk(d2, d3), 6, (Object) null);
                    return;
                } catch (Exception e2) {
                    e = e2;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new ik(key, d2, d3), 4, (Object) null);
                    return;
                }
            }
            String key2 = ValidationUtils.ensureBrazeFieldLength(key);
            z9 z9Var = ba.f257g;
            z9Var.getClass();
            Intrinsics.checkNotNullParameter(key2, "key");
            e00 e00VarA = z9Var.a(new l9(key2, d2, d3));
            if (e00VarA != null) {
                ((tf) this.brazeManager).a(e00VarA);
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public final boolean setPhoneNumber(String str) {
        String string;
        if (str != null) {
            try {
                if (StringsKt.isBlank(str)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) jk.f1020a, 6, (Object) null);
                    return false;
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new mk(str), 4, (Object) null);
                return false;
            }
        }
        if (str != null) {
            int length = str.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                boolean z3 = Intrinsics.compare((int) str.charAt(!z2 ? i2 : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    }
                    length--;
                } else if (z3) {
                    i2++;
                } else {
                    z2 = true;
                }
            }
            string = str.subSequence(i2, length + 1).toString();
        } else {
            string = null;
        }
        if (string == null || ValidationUtils.isValidPhoneNumber(string)) {
            BuildersKt__Builders_commonKt.launch$default(qa0.f1589a, null, null, new kk(this, string, null), 3, null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new lk(string), 6, (Object) null);
        return false;
    }

    public final boolean setPushNotificationSubscriptionType(NotificationSubscriptionType pushNotificationSubscriptionType) {
        Intrinsics.checkNotNullParameter(pushNotificationSubscriptionType, "pushNotificationSubscriptionType");
        try {
            BuildersKt__Builders_commonKt.launch$default(qa0.f1589a, null, null, new nk(this, pushNotificationSubscriptionType, null), 3, null);
            return true;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new ok(pushNotificationSubscriptionType), 4, (Object) null);
            return false;
        }
    }

    public final void setUserId(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new uk(userId), 6, (Object) null);
        ReentrantLock reentrantLock = this.userIdLock;
        reentrantLock.lock();
        try {
            if (!Intrinsics.areEqual(this.internalUserId, "") && !Intrinsics.areEqual(this.internalUserId, userId)) {
                throw new IllegalArgumentException("setExternalId can not be used to change the external ID of a UserCache from a non-empty value to a new value. Was: [" + this.internalUserId + "], tried to change to: [" + userId + AbstractJsonLexerKt.END_LIST);
            }
            this.internalUserId = userId;
            BuildersKt__Builders_commonKt.launch$default(qa0.f1589a, null, null, new vk(this, userId, null), 3, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean unsetCustomUserAttribute(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            if (com.braze.support.d.a(key, this.serverConfigStorageProvider.a())) {
                BuildersKt__Builders_commonKt.launch$default(qa0.f1589a, null, null, new qk(this, key, null), 3, null);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) pk.f1523a, 6, (Object) null);
            return false;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new rk(key), 4, (Object) null);
            return false;
        }
    }

    public final void unsetLocationCustomAttribute(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            if (!com.braze.support.d.a(key, this.serverConfigStorageProvider.a())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) sk.f1778a, 6, (Object) null);
                return;
            }
            String strEnsureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(key);
            z9 z9Var = ba.f257g;
            z9Var.getClass();
            e00 e00VarA = z9Var.a(new m9(strEnsureBrazeFieldLength));
            if (e00VarA != null) {
                ((tf) this.brazeManager).a(e00VarA);
            }
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new tk(key), 4, (Object) null);
        }
    }
}
