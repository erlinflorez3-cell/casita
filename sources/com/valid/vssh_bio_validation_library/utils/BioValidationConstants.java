package com.valid.vssh_bio_validation_library.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.InterfaceC1492Gx;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0005WيN\f^B-!d\u0011xGiʴ=0Re߲2T"}, d2 = {"\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017SJo;,^EeCw_3Ru#VPX5:\\{K#\u000ec\u001d\\\u0001", "", "u(E", "\u0011n\\=T5B]\"", "Drb5 (GR&\t~]s|\u0011,e~'{?H\u0014\u001bQ7\u001f8})4U\r$Av\u0010-M@Km"}, k = 1, mv = {1, 4, 1}, pn = "", xs = "")
public final class BioValidationConstants {
    public static final String API_AUTHENTICATION_KEY;
    public static final String API_DERIVE;
    public static final String API_EXCHANGE_KEY;
    public static final String API_EXCHANGE_KEY2;
    public static final String API_GET_CERTIFICATES;
    public static final String API_GET_CERTIFICATES2;
    public static final Companion Companion;
    public static final String ENCRYPTION_ALGORITHM;
    public static final String ENCRYPTION_BLOCK_MODE;
    public static final String ENCRYPTION_PADDING;
    public static final String EP_REFRESH_SESSION;
    public static final int ERROR_ADD_NEW_BIOMETRIC_TYPE = -11;
    public static final int FACE_ENABLED = 2;
    public static final int FINGERPRINT_ACQUIRED_IMAGER_DIRTY = 3;
    public static final int FINGERPRINT_ACQUIRED_INSUFFICIENT = 2;
    public static final int FINGERPRINT_ACQUIRED_PARTIAL = 1;
    public static final int FINGERPRINT_ACQUIRED_TOO_FAST = 5;
    public static final int FINGERPRINT_ACQUIRED_TOO_SLOW = 4;
    public static final int FINGERPRINT_ERROR_CANCELED = 5;
    public static final int FINGERPRINT_ERROR_HW_UNAVAILABLE = 1;
    public static final int FINGERPRINT_ERROR_LOCKOUT = 7;
    public static final int FINGERPRINT_ERROR_LOCKOUT_PERMANENT = 9;
    public static final int FINGERPRINT_ERROR_NO_FINGERPRINTS = 11;
    public static final int FINGERPRINT_ERROR_NO_SPACE = 4;
    public static final int FINGERPRINT_ERROR_TIMEOUT = 3;
    public static final int FINGERPRINT_ERROR_UNABLE_TO_PROCESS = 2;
    public static final int FINGERPRINT_ERROR_USER_CANCELED = 10;
    public static final int FINGERPRINT_ERROR_VENDOR = 8;
    public static final int FINGER_PRINT_ENABLED = 1;
    public static final String GENERATE_DERIVE_KEY_SUCCESS;
    public static final String GENERIC_ERROR_MESSAGE;
    public static final String HASH_KEY;
    public static final String HINT_TOUCH_FINGERPRINT_SENSOR;
    public static final int IRIS_AVAILABLE = 3;
    public static final int IV_LENGTH_BYTE = 12;
    public static final String KEY_AES_KEY;
    public static final String KEY_APPLICATION_CODE;
    public static final String KEY_DERIVATION_DATA;
    public static final int KEY_SIZE = 128;
    public static final int SC_EXPIRED_SESSION = 8;
    public static final int SC_EXPIRED_SESSION_CORE = 440;
    public static final int STATUS_CODE_BIOMETRIC_ERROR_HW_UNAVAILABLE = 2;
    public static final int STATUS_CODE_BIOMETRIC_ERROR_NONE_ENROLLED = 3;
    public static final int STATUS_CODE_BIOMETRIC_ERROR_NO_HARDWARE = 1;
    public static final int STATUS_CODE_BIOMETRIC_ERROR_UNSUPPORTED = 5;
    public static final int STATUS_CODE_BIOMETRIC_STATUS_UNKNOWN = 4;
    public static final int STATUS_CODE_BIOMETRIC_SUCCESS = 0;
    public static final int STATUS_CODE_DERIVE_KEY_ERROR = 1;
    public static final int STATUS_CODE_DERIVE_KEY_SUCCESS = 0;
    public static final int TAG_LENGTH_BIT = 128;
    public static final String VALUE_APPLICATION_CODE = C1561oA.Kd("[GSQMIa_`V", (short) (Od.Xd() ^ ((442225016 ^ 725896861) ^ (-824165633))));
    public static final String VALUE_AES_KEY = Wg.Zd("RlT4]2R", (short) (C1607wl.Xd() ^ (C1499aX.Xd() ^ (1250323037 ^ (-152909322)))), (short) (C1607wl.Xd() ^ ((1142238486 ^ 470671268) ^ 1478001074)));
    public static final String URL_BASE2 = C1561oA.Xd("\u0019&'$(oef,/+!/\u001f/0-#%q)'=1?30:1/|3@?\u00025E?\u0004?:N@S>W\u000e", (short) (C1633zX.Xd() ^ (OY.Xd() ^ (-69932646))));
    public static final String URL_BASE = Wg.vd("kxurzB45_ao'rumceUab$\\Vl\u0019bJVXT`]\u0010\u001a\u0016\f\u0017\u0017\u0019T~\f\u0007H\u0002\u0013L\u007f\u0004}>yx\rz\u000el\u0006", (short) (Od.Xd() ^ ((726084283 ^ 177707681) ^ (-567332950))));
    public static final String PUBLIC_KEY = Qg.kd("idc[a\u0002WcVz}\u0003xzwTE\u0003:KIXKKEDQDAP6>IDC;;^A85D72h36e$a`\u0018M:_:20Y+-FIC\u0015\fCR#\u0007D9\u001c;+:\u001c\u001225\u0017DAw-\u0016z*15\u0010\bj1\u0014}\t/\u0001\u001b&\bx\u000f}\u001a%\u0014\u0001\u0014dnZro\\oj\u0014\u0006|p\u0014Vcw\u0005\u0012\t\u0001\u000b\u0005\u0007^aYxh\\ec\u0002z[vbL;Q9XNn6tkFd6gAG,A<nbm7J61?5>=<M\u001eOTX\u0010^Y\r7\u0018C--64T()\u0018HCJL?9\u0005%\u0018>\"8A\u0017:{\u0019\u001b89\u0016%\u000bs\u000e \u001dn\u0002\u0005~.\u001dj\u001c&w\u0005u`\u007f\u0019\u0002{myVQv\u0013q\u0005\u000b\u0002\u0007\u0015t\u0007\u000b{DK\u000bX\rFD]h\u000bb\u0007?\u0006yORi8uXvXlPVW@Hn]H.^A\\W^\\WRE \u001d>CaT]J<\u0011=Z\u0014\u0016M\u0010\u000f3\u0010I\u001e\u000e>#9\b9\u001b!?\u0003G6</F\u00032\u000b=!|3z1z\u00077\u000b\u000e\u000f\u00151\f\u001f!\u001e\bl\u0007y\u001e[\u001e\u001b\u001f~\"a\u000bk\u000e|\u0010tjh\u0006\r\u0007\u0014\u0011b\f^\u0007\u0010`ZVeTT", (short) (ZN.Xd() ^ (C1607wl.Xd() ^ 1849976375)), (short) (ZN.Xd() ^ (989194386 ^ 989200159)));
    public static final String OPTIONS_AUTH_AVAILABLE = hg.Vd("|0.!\u001d%*\u001e\u0017\u0014&\u001a\u001f\u001dM\u001c\u001c\u001f\u0013\u0018\u0016\u001aE\u0006\u001a\u0004\u000b\r\u0001\u0001\n\u0002U:", (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (-831063043))), (short) (ZN.Xd() ^ (2023537109 ^ 2023542339)));
    public static final String KEY_SIGN = C1561oA.ud("f[X^", (short) (C1580rY.Xd() ^ (1921807473 ^ (-1921793085))));
    public static final String KEY_NAME = C1561oA.yd(".\\O^XSK3ZoFh`dT", (short) (C1633zX.Xd() ^ (OY.Xd() ^ (1941303439 ^ (-2006894310)))));

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005*4\u0012\u0006\rnj?]JͣIDɟ\u0004*=j<9*[ҸuCIUj\n0\ngN\u0016iEЁ-ŲG\u000f\u000eǝIv:Lmx\f\u0014e˷\u0015ņC3Uڎ\u000eEnxN\u0005N4x؇Lڱ\u0005\u001a2Ϻ`\u0003\tHc\f@2\u0017\u0088\rň\u0011M\r܅b\u0012L&\u0019\u001e\u000bi%ȫ\u001bǰa:7݊SuPU?_^~$μ\u0019ù+\r~ѭn7N?M\u0015SUYޞ%ÜC\u0003Gм\u000e\u0011v0?+wu.̳+ÿ\u0018\u00153˽]i\u00010t\u0005\u007fbbʳ}յgKXʫx\u0004\t\u0007%<2\u0010\\ΰ\u001bͶ1\u001anڜ^?\u0003~k@~\u000f5۔Rѐe6\u001fӛP?9G3f\u007fn\u0012ϑ!Ѽ\u007f\u0005\u0015̔s\r|0sT<mkØ'ɐU1Y̵\u000eT\\\u001aq=\u001c\u0011GîTò\b0Oĉ\u007f\b\u001f?/%eh\u0010\u0601sȠ\u0006HLϙG\u0011nzki\u0001U\u0017̕Aގ;*\u0011ȱ+Pr\u0018\u0004P\u0003e\u0003ґ ɟX\u0007\u0006ܱc,j\fT!S\u001d%п;ȬnMe܃u;tLqn\u001a\u001b.ޱ1ۋ9Qk߄2^\u0005*W<\u0011\u0012/ٯ\u0015ΐ\u0010Zd̥r>V\u0002(w*Q%܃e\u0558Cq$ع|='t-H1+\u0019ˍOȤcZpɭO`A=\u001biR\u0002_ɝ#ʷtooծ\u001a8\u000bz:-o^\fӮxƁ&h<ês\u0013\r\u000f\u0018G\u0016Y\u001eƉ?טyU\u0004\u008df&GmG=A\u001cUȂ\u0005ī1ETǩ6][/?z+\u0007e\u0097;\u05cek\brѱ|lxhgTE/MܬEן\fd\bט2R\tf{T9]\u0015λEè]<V˻M\u0011->=\u0001\u001e$Sލ\u007fϡ+\u001d\u001eߐd;#\u0003ui\u001e0Pʳa֑xe\fϺ4\"}\u0005i]`=\u000fՅ,˽B\",ЗSNV\u000e\u0010\bp\u0016\u000bن\u0006ȈEdxމ\tY\u0019S\u0016f59cߥ)ݍ>\u0013wϘ\u0005:mO\fC,\u00165ǀwݱQSoƚ>Wj1b\u000f8\rRωA݁ =(݈(n\u0017W\u001esF8\u0018ݬ5ƀ@\t,҉|H\u00163[T\u0018\bfĆRʮc\u000f\u001fϨ\u0013\u007fI\u007f&T'^-ާWޝI`)ơQ\u000b\u001d]6xc>[֎\u0019ߟ3c:ܬ$)\u0017F\u0003O-h{ń\u0017ȗ=\u001b0߰Q\u0017S\n[I08Zڢ{Թoo\u0014Մh\t+o0\u001bg^g٪Iҍb\u000b]̤\u001fp\u0005@~R|/\u007fͭMէ\u0012<\u0012ۇ[%]\"\bb[Y%ߞ\nƴ\u001e\u0001\u001f\u05edy\u0013\u001a-{FI:\\ם\u007fִMj\u001c՝Lcal\u0016\bN-}\u05fbGֈ`W\u0016ўZi)l.qDoXƈeц$\u00046\u05fdE~\u0018a 6}\u000f\nÿeȨ]k\u007f˺\u001139!\u001eByuOƄ6ؼgn]̃Sr?\f\u0012n[]sԛyӰ2\u0013`Ŕ\u000b\u001daVp\u0011.!kҸq߱\fb1ց ov(\u0004O\n\u001a\u0002ԡ>ˮe18ܼn\n-2\u000e\u0004XV~ׄ\u000eܑQ>lӷ-xP\u0011&^\u0019*;Í^ì\u0018|\u0007Ĝ/\u001d!n^rLf\u0006еk۵_\rO֜W\u0010S\u0005>!_T\u0016ה\nכ\u000fo0ϓה\u0007v"}, d2 = {"\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017SJo;,^EeCw_3Ru#VPX5:\\{K#\u000ec\u001d\\ij\u000faL wHA(]", "", "u(E", "\u000fO8,4\u001c-6xgiB\nXw\u0013Oh\"a t", "", "\u000fO8,7\f+7\n^", "\u000fO8,8\u001f\u001c6tg\\>&bh#", "\u000fO8,8\u001f\u001c6tg\\>&bh#2", "\u000fO8,:\f-Mv^gM\u0010]l\rAn\bi", "\u000fO8,:\f-Mv^gM\u0010]l\rAn\bi\r", "\u0013M2\u001fL\u0017-7\u0003gt:\u0013^r\u001cIn\u000bc", "\u0013M2\u001fL\u0017-7\u0003gt;\u0013ff\u0015_g\u0012Z ", "\u0013M2\u001fL\u0017-7\u0003gtI\b[g\u0013Na", "\u0013ON\u001f8\r+3\u0007atL\fjv\u0013Oh", "\u0013QA\u001cE&\u001a2wxc>\u001eve\u0013Og\bj-dt\u00116cx\u001c", "", "\u0014@2\u0012R\f'/ueZ=", "\u0014H=\u00148\u0019)@|giX\bZt\u001fIl\bZ:d~r)Oz6U\t\"Hq", "\u0014H=\u00148\u0019)@|giX\bZt\u001fIl\bZ:d\u007f\u00057Pn T\t\u0015Bl", "\u0014H=\u00148\u0019)@|giX\bZt\u001fIl\bZ:kr\u00046Si#", "\u0014H=\u00148\u0019)@|giX\bZt\u001fIl\bZ:o\u0001\u0001APi*e", "\u0014H=\u00148\u0019)@|giX\bZt\u001fIl\bZ:o\u0001\u0001A]t&h", "\u0014H=\u00148\u0019)@|giX\fiu\u0019Ry\u0006W)^v}'N", "\u0014H=\u00148\u0019)@|giX\fiu\u0019Ry\u000bm:p\u007fr8Kq#R\u0002\u001c9", "\u0014H=\u00148\u0019)@|giX\fiu\u0019Ry\u000fe\u001ef\u0001\u00076", "\u0014H=\u00148\u0019)@|giX\fiu\u0019Ry\u000fe\u001ef\u0001\u00076ix\u001cc\r\u0011B]\t&", "\u0014H=\u00148\u0019)@|giX\fiu\u0019Ry\u0011e:az\u007f)Oz'c\t\u001eHk", "\u0014H=\u00148\u0019)@|giX\fiu\u0019Ry\u0011e:n\u0002r%O", "\u0014H=\u00148\u0019)@|giX\fiu\u0019Ry\u0017_(`\u0001\u00076", "\u0014H=\u00148\u0019)@|giX\fiu\u0019Ry\u0018d\u001c]}vA^w6a\u0012\u001f7]\u000e%", "\u0014H=\u00148\u0019)@|giX\fiu\u0019Ry\u0018i m\u0011t#Xk\u001c]\u0005\u0014", "\u0014H=\u00148\u0019)@|giX\fiu\u0019Ry\u0019[)_\u0001\u0004", "\u0014H=\u00148\u00198>\u0006bcM&\\q\u000bBf\bZ", "\u0015D=\u0012E\b-3\u0013]ZK\u0010mh)K_\u001cu.ptt']{", "\u0015D=\u0012E\u0010\u001cMxkgH\u0019vp\u000fSm\u0004] ", "\u0016@B\u0015R\u0012\u001eG", "\u0016H=!R\u001b(Cvat?\u0010ej\u000fRj\u0015_)o\u0011\u0005'X{&c", "\u0017Q8 R\b//|eV;\u0013\\", "\u0017UN\u00198\u0015 B{xWR\u001b\\", "\u0019DH,4\f,M~^n", "\u0019DH,4\u0017):|\\VM\u0010fq)Ci\u0007[", "\u0019DH,7\f+7\nZiB\u0016e\u0003\u000eAn\u0004", "\u0019DH,A\b&3", "\u0019DH,F\u0010 <", "\u0019DH,F\u001033", "\u001dOC\u0016B\u0015,MtniA&Xy\u000bIf\u0004X'`", "\u001eT1\u0019<\n89xr", "!BN\u0012K\u0017\"@x]tL\fjv\u0013Oh", "!BN\u0012K\u0017\"@x]tL\fjv\u0013Oh\"Y*mv", "!S0!H\u001a81\u0003]ZX\t`r\u0017En\u0015_\u001ezv\u00044Yz6Y\u0017/If{(Iy\u0015) \"K", "!S0!H\u001a81\u0003]ZX\t`r\u0017En\u0015_\u001ezv\u00044Yz6_\u000f\u001e9w\u007f Z\u007f\u00154#\u001a", "!S0!H\u001a81\u0003]ZX\t`r\u0017En\u0015_\u001ezv\u00044Yz6_\u000f/<Y\r\u0016_q\u001b-", "!S0!H\u001a81\u0003]ZX\t`r\u0017En\u0015_\u001ezv\u00044Yz6f\u000e#Ih\u000b!Z\u0005\u000e,", "!S0!H\u001a81\u0003]ZX\t`r\u0017En\u0015_\u001ez\u0005\u0006#^}*p\u0015\u001e?f\n)V", "!S0!H\u001a81\u0003]ZX\t`r\u0017En\u0015_\u001ez\u0005\u0007%Mm*d", "!S0!H\u001a81\u0003]ZX\u000b\\u\u0013V_\"a t\u0011v4\\w)", "!S0!H\u001a81\u0003]ZX\u000b\\u\u0013V_\"a t\u0011\u00057Mk\u001cd\u0013", "\"@6,?\f'5\bat;\u0010k", "#Q;,5\b,3", "#Q;,5\b,3e", "$@;\"8&\u001a3\u0007x`> ", "$@;\"8&\u001a>\u0004e^<\bkl\u0019Ny\u0006e\u001f`", "Drb5 (GR&\t~]s|\u0011,e~'{?H\u0014\u001bQ7\u001f8})4U\r$Av\u0010-M@Km"}, k = 1, mv = {1, 4, 1}, pn = "", xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        short sXd = (short) (FB.Xd() ^ (C1580rY.Xd() ^ (1106483876 ^ (-1887094317))));
        int[] iArr = new int["CESKYEYOVV-K_M".length()];
        QB qb = new QB("CESKYEYOVV-K_M");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        KEY_DERIVATION_DATA = new String(iArr, 0, i2);
        KEY_APPLICATION_CODE = Xg.qd("\u0001\u0011\u0012\u000f\r\b\u0007\u001b\u0011\u0018\u0018m\u001b\u0011\u0013", (short) (OY.Xd() ^ ((348887211 ^ 288542126) ^ 100214248)), (short) (OY.Xd() ^ ((96199340 ^ 243593379) ^ 188710891)));
        int iXd = OY.Xd() ^ (1864897631 ^ 1795367160);
        short sXd2 = (short) (ZN.Xd() ^ ((37973519 ^ 1217130729) ^ 1254682509));
        short sXd3 = (short) (ZN.Xd() ^ iXd);
        int[] iArr2 = new int["\u001d%o\u0002X\u001f".length()];
        QB qb2 = new QB("\u001d%o\u0002X\u001f");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd3) ^ sXd2));
            i3++;
        }
        KEY_AES_KEY = new String(iArr2, 0, i3);
        HINT_TOUCH_FINGERPRINT_SENSOR = ZO.xd(")f\r;vcb-\u000b&\u000f5~\u001cIt,~L\n(P\ri)\u0005~z\"7Lm@\u0013&o", (short) (C1580rY.Xd() ^ (ZN.Xd() ^ (-864688798))), (short) (C1580rY.Xd() ^ ((910704338 ^ 1485508387) ^ (-1858302758))));
        HASH_KEY = C1626yg.Ud("z{P}\u001f%l", (short) (C1633zX.Xd() ^ ((1095598809 ^ 1639289480) ^ (-553156539))), (short) (C1633zX.Xd() ^ (1040823918 ^ (-1040830134))));
        short sXd4 = (short) (C1633zX.Xd() ^ (1646744951 ^ (-1646735343)));
        int[] iArr3 = new int["3\u0017#g2\u000f,<\f[`v\u001d\u0014=e9/\u0005+\u0012\u0017F=x\u001e4l\u0012&Q".length()];
        QB qb3 = new QB("3\u0017#g2\u000f,<\f[`v\u001d\u0014=e9/\u0005+\u0012\u0017F=x\u001e4l\u0012&Q");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd4 + i4)));
            i4++;
        }
        GENERIC_ERROR_MESSAGE = new String(iArr3, 0, i4);
        GENERATE_DERIVE_KEY_SUCCESS = EO.Od("\u0001g\u0005\"x$\u0011laXY\u0003(A7zZhfR\u0010Y7=\u0017b", (short) (FB.Xd() ^ ((42372398 ^ 536461736) ^ 494868236)));
        EP_REFRESH_SESSION = C1561oA.Qd("4exvi/dv`d\\h`]B[n", (short) (C1580rY.Xd() ^ (C1499aX.Xd() ^ (1937709602 ^ 820270844))));
        ENCRYPTION_PADDING = C1593ug.zd("\u0003%\u0007\u0019\u001d\u001e$*$", (short) (Od.Xd() ^ (C1633zX.Xd() ^ 1951488726)), (short) (Od.Xd() ^ (1517829452 ^ (-1517844614))));
        ENCRYPTION_BLOCK_MODE = C1561oA.od("idm", (short) (OY.Xd() ^ (1702731526 ^ 1702755702)));
        short sXd5 = (short) (OY.Xd() ^ (1560968044 ^ 1560944206));
        int[] iArr4 = new int["\u0010\u0015$".length()];
        QB qb4 = new QB("\u0010\u0015$");
        int i5 = 0;
        while (qb4.YK()) {
            int iKK4 = qb4.KK();
            Xu xuXd4 = Xu.Xd(iKK4);
            iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - ((sXd5 + sXd5) + i5));
            i5++;
        }
        ENCRYPTION_ALGORITHM = new String(iArr4, 0, i5);
        API_GET_CERTIFICATES2 = Wg.Zd("$\u0007\u0010U)6\u0011d%<\u0017trB(c\u0003EK.\u0004{_E", (short) (C1580rY.Xd() ^ (C1580rY.Xd() ^ (78950184 ^ 893233760))), (short) (C1580rY.Xd() ^ (C1499aX.Xd() ^ (1940282995 ^ 809320331))));
        API_GET_CERTIFICATES = C1561oA.Xd("N\u0017\u0015\u0016\f\b\u0015\u0019\rU\u001d\u0010\u001e#\u0013!\\$\u0017\u0016)'\u001f+1", (short) (Od.Xd() ^ (OY.Xd() ^ (18960545 ^ (-84555511)))));
        API_EXCHANGE_KEY2 = Wg.vd("\u0002\u0003|p\u0005r\u0001\u007fCyu\nG~\u0011z\u0007~\u000b\u0003\bN\f\u0005 T", (short) (FB.Xd() ^ ((269748842 ^ 841865244) ^ 574220153)));
        API_EXCHANGE_KEY = Qg.kd("?\u0003\u0004}q}kyx4jfz0gycg_kc`'d]p", (short) (FB.Xd() ^ (720159956 ^ 720145948)), (short) (FB.Xd() ^ (FB.Xd() ^ (709525321 ^ 1973749935))));
        API_DERIVE = hg.Vd("\u001fea`TNY[M\u0014YJVYGS\rRC@QMCMQ\u0006I:7HD:DH|11=3?-\u0012+>\n$%&\u0014.3 $\u0004\u001e", (short) (OY.Xd() ^ ((177388689 ^ 1969740729) ^ 2146772235)), (short) (OY.Xd() ^ (483143146 ^ 483139622)));
        API_AUTHENTICATION_KEY = C1561oA.ud("4esr.sdpse^_l", (short) (ZN.Xd() ^ (597578297 ^ 597568418)));
        Companion = new Companion(null);
    }
}
