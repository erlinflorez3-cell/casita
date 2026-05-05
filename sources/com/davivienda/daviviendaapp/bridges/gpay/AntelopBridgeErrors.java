package com.davivienda.daviviendaapp.bridges.gpay;

import kotlin.Metadata;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Qg;
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
@Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005,2 w\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԉt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̚~֒Yxe܈_>PsW3{q\u0014ʧ3ҽ:\u0005(݅rD\b\n\u0019\u001aXJf͓MŲO\f\u001aؓ\u0011|HX%M3\u001chæ\u0011ŋ\u0005\u001edɡ\u001fBVsu:]%Y݊\u0015Ě+_8ŧ\u001e\u0019T\\?\r%ctѯ\u0013˝9\u0015-مS\u0013`dW\u0003ms\u0014ݢ;Ҋ++Q֕(Bf\n,\u0015YQcƥE͉`\u0005YӠ\\39Z{K~\u0010~ÂMԫ\u0011<\f\u05faV3V:E\u001a\u0015\ndޞGɤW@X\u061c/N\u000e\by6E'VĘ}ݰ\u001ffYĥދ\u001d\\"}, d2 = {"\u001ab^:\"+:d\u001d\u0010~^5{\u0005xd{9\u007fQ\u0005\u0017 Fk\nG\u0002n2f\u0002\u001f9m$wON7\u007f}y\u001ewa@\u0011n\t[z&IL.9i\\\u007fKi", "", "u(E", "\u000fMC,6\b+2\u0013^gK\u0016i", "", "\u000fMC,6\b+2\u0013gdM&]r\u001fN^", "\u000fMC,6\u0016'<x\\iX\fiu\u0019R", "\u000fMC,8\u0015+=\u007fet>\u0019ir\u001c", "\u000fMC,:\u0017\u001aG\u0013\\VG\u0017lv\u0012__\u0015h*m", "\u000fMC,:\u0017\u001aG\u0013ijL\u000fvh\u001cRi\u0015", "\u000fMC,:\u0017\u001aG\u0013li:\u001blv)El\u0015e-", "\u000fMC,A\u00168/vm^O\u0010k|", "\u000fMC,A\u00168Etea>\u001b", "\u000fMC,C\u0019(D\u0013bcB\u001bvh\u001cRi\u0015", "\u000fMC,C\u0019(D\u0013eVN\u0015Zk)El\u0015e-", "\u000fMC,C\u0019(D\u0013gdM&ih\u000bDs", "/o_,e,ES\u0015\rz"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class AntelopBridgeErrors {
    public static final String ANT_CARD_ERROR;
    public static final AntelopBridgeErrors INSTANCE;
    public static final String ANT_PROV_NOT_READY = Qg.kd("~\u000b\u0010\u001a\n\u000b\u0007\r\u0015\u0003\u0003\u0007\u0011\u0003toq\u0006", (short) (C1580rY.Xd() ^ (2097923299 ^ (-2097923731))), (short) (C1580rY.Xd() ^ ((1133724002 ^ 2039900587) ^ (-973421211))));
    public static final String ANT_PROV_LAUNCH_ERROR = hg.Vd("+7<F6739A-!4, $:\u001f+*&(", (short) (C1499aX.Xd() ^ (OY.Xd() ^ (2131052728 ^ (-2066636112)))), (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ 1951487950)));
    public static final String ANT_PROV_INIT_ERROR = C1561oA.ud("dpu\u007foplrzcgakuZfeac", (short) (C1499aX.Xd() ^ (1859288734 ^ (-1859282003))));
    public static final String ANT_NO_WALLET = C1561oA.yd("\"07C35F?\u001a&'!1", (short) (ZN.Xd() ^ ((905842120 ^ 2137471064) ^ 1251561672)));
    public static final String ANT_NO_ACTIVITY = C1561oA.Yd("#18D46G*-?5C7CI", (short) (OY.Xd() ^ (1994989350 ^ 1995005612)));
    public static final String ANT_GPAY_STATUS_ERROR = Xg.qd("O]dpYcUnujlZnpo|cqrpt", (short) (C1633zX.Xd() ^ (ZN.Xd() ^ (-864712458))), (short) (C1633zX.Xd() ^ ((35679254 ^ 457534398) ^ (-426070951))));
    public static final String ANT_GPAY_PUSH_ERROR = Jg.Wd("zzouD@03@$\u0018\u0011lv[S:*\u001c", (short) (C1633zX.Xd() ^ (ZN.Xd() ^ (-864704754))), (short) (C1633zX.Xd() ^ ((1634216245 ^ 1946047074) ^ (-311830243))));
    public static final String ANT_GPAY_CANPUSH_ERROR = ZO.xd("2O\u0018tBA_14?ST9&\u0004#[\t5*sd", (short) (C1580rY.Xd() ^ (C1633zX.Xd() ^ (1170034650 ^ 837577139))), (short) (C1580rY.Xd() ^ (C1580rY.Xd() ^ (1690180377 ^ 1429680633))));
    public static final String ANT_ENROLL_ERROR = C1626yg.Ud("\"v\u0019B\u0016{81E4\t\u0011NBtk", (short) (C1580rY.Xd() ^ (1388135495 ^ (-1388131803))), (short) (C1580rY.Xd() ^ (FB.Xd() ^ (176136730 ^ (-1435557702)))));
    public static final String ANT_CONNECT_ERROR = Ig.wd("zY-\u0018L{'^vdwd{~/uP", (short) (ZN.Xd() ^ (ZN.Xd() ^ (392703739 ^ 618792218))));
    public static final String ANT_CARD_NOT_FOUND = EO.Od("G%-[~R;\rki`\u0010jS<g6\u0012", (short) (C1607wl.Xd() ^ (FB.Xd() ^ 1609509542)));

    static {
        short sXd = (short) (OY.Xd() ^ (2075323343 ^ 2075309958));
        int[] iArr = new int["^joy\\YiZtYed`b".length()];
        QB qb = new QB("^joy\\YiZtYed`b");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        ANT_CARD_ERROR = new String(iArr, 0, i2);
        INSTANCE = new AntelopBridgeErrors();
    }

    private AntelopBridgeErrors() {
    }
}
