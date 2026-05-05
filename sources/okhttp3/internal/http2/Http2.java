package okhttp3.internal.http2;

import cz.msebera.android.httpclient.message.TokenParser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.Util;
import okio.ByteString;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u001a6B\r.4\u0012}\u0007njO0LeN.ZS8\u0015s{:<c$\u007fLCU ~(ߢOdʴ\u0018nxYKH\u0015\u0006Ȁ|j:I\u001e\rk/'2pro7[\u000eU9\u000f}f\t.Q:8(\u000eI-8h(v)F{\u0010 NXph[S˟ŋ\u001e\u0012\f_h-,~\u007fNdK\u001daHR;\u0003\u0018f~+mU\u0015M;O\u0005+\u001b\u001dy\u001eYIg9#Ck\u00035[\fC\u0011^\n=3qw;9J\f]FZ\u0010\u0014C.}\u000f4ù(ػ\tSh\f5/ qYU&(&\u00012\u0011\u0013Ǒ\u0010Ν+H6Ʀj|\u0016\u0015K|\u0003WPR\u0018]p\u0003)c\rА'ő7-A\u001btU2G'VO{3\u0016tŇSͼ%[\\ו1!)^\u0010Q_Z\u0017ׇ\u001bݳ\u000eYEЧT|p\rB\u0004^PV\u0082N 2\u0017-ڛ,E1-\u0004\u0002vM>ϿW¾lSqɭ\u0019L0{.7X\u0012bɵ\u0017\u0081\tkXӹ)8\u001f[4T5\u0007^ʽrϢ{<)ط`Z]w\u0002j{f`ɟ\u0002Ϭ;Yv\u0088^cGnK5\u007flfЧ%λ\u0018?DϵUltSk\u0012j^8\"`K\u0019\u0012NӾF«\u0010\u0015:?\u007f \u00058?+t\u0015v\ft՚\u0014Ҵ\r_bӐ`\u000bbF<\u0003\u0018-KծS˩`pwΟIU:\u0011x\"[J(ڈkłY\"pؔM/\u0015\u0014\f\u007fup#܈\u001f̡\u001au]ݨp\"(Oi/k\u001ceȶ{ɨ\u0006-MɣCq_d*')\u0006Pҿ\u000eÿ2g\u0010ξA8n\u0003bO\u0003 xԵ1ѓ'\blрJmT\u0014_c\u0003\u00142ų\u001c\u03a2\u0007YDѾ\t\t\u001396%/xxģ\bԩG'%ȶH =0y]\u0018x\u0005ӧ5Ϫ*tmֽ|o$\fzQ\f;\u0012Ͷ\u001c˕\u0003>*غр\u0007i"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGCz", "", "u(E", "\u0010H=\u000eE ", "", "", ")KY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}", "\u0011N=\u001b8\n-7\u0003gtI\u0019\\i\u000bC_", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "\u0014K0\u0014F", "\u0014K0\u0014R\b\u001c9", "", "\u0014K0\u0014R\n(;\u0004kZL\u001a\\g", "\u0014K0\u0014R\f'2\u0013aZ:\u000b\\u\u001d", "\u0014K0\u0014R\f'2\u0013ijL\u000fvs\u001cOg\fi ", "\u0014K0\u0014R\f'2\u0013liK\fXp", "\u0014K0\u0014R\u0015(<x", "\u0014K0\u0014R\u0017\u001a2w^Y", "\u0014K0\u0014R\u0017+7\u0003k^M ", "\u0014Q0\u001a8&'/\u0001^h", "\u0017M8!<\b%M\u0001ZmX\rid\u0017Ey\u0016_5`", "\"X?\u0012R\n(<\bbcN\bkl\u0019N", "\"X?\u0012R\u000b\u001aBt", "\"X?\u0012R\u000e(/\u000bZn", "\"X?\u0012R\u000f\u001e/w^gL", "\"X?\u0012R\u0017\"<z", "\"X?\u0012R\u0017+7\u0003k^M ", "\"X?\u0012R\u0017.A{xeK\u0016dl\u001dE", "\"X?\u0012R\u0019,B\u0013liK\fXp", "\"X?\u0012R\u001a\u001eB\bbc@\u001a", "\"X?\u0012R\u001e\"<whlX\u001cgg\u000bT_", "4na:T;\u001fZ\u0015\u0001\t", "Bx_2", "4kP4f", "4na:T;MS\u0018m\u000fi,", "4na:T;MS\u0018m\u000fi,;\u00135h\u000f7\u0007", "4qP:X\u0013HU", "7mQ<h5=", "", "Asa2T4\"R", ":d]4g/", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Http2 {
    private static final String[] BINARY;
    public static final int FLAG_ACK = 1;
    public static final int FLAG_COMPRESSED = 32;
    public static final int FLAG_END_HEADERS = 4;
    public static final int FLAG_END_PUSH_PROMISE = 4;
    public static final int FLAG_END_STREAM = 1;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_PADDED = 8;
    public static final int FLAG_PRIORITY = 32;
    public static final int INITIAL_MAX_FRAME_SIZE = 16384;
    public static final int TYPE_CONTINUATION = 9;
    public static final int TYPE_DATA = 0;
    public static final int TYPE_GOAWAY = 7;
    public static final int TYPE_HEADERS = 1;
    public static final int TYPE_PING = 6;
    public static final int TYPE_PRIORITY = 2;
    public static final int TYPE_PUSH_PROMISE = 5;
    public static final int TYPE_RST_STREAM = 3;
    public static final int TYPE_SETTINGS = 4;
    public static final int TYPE_WINDOW_UPDATE = 8;
    public static final Http2 INSTANCE = new Http2();
    public static final ByteString CONNECTION_PREFACE = ByteString.Companion.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final String[] FRAME_NAMES = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    private static final String[] FLAGS = new String[64];

    static {
        String[] strArr = new String[256];
        for (int i2 = 0; i2 < 256; i2++) {
            String binaryString = Integer.toBinaryString(i2);
            Intrinsics.checkNotNullExpressionValue(binaryString, "toBinaryString(it)");
            strArr[i2] = StringsKt.replace$default(Util.format("%8s", binaryString), TokenParser.SP, '0', false, 4, (Object) null);
        }
        BINARY = strArr;
        String[] strArr2 = FLAGS;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i3 = iArr[0];
        strArr2[(-1) - (((-1) - i3) & ((-1) - 8))] = strArr2[i3] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            int i6 = iArr[0];
            String[] strArr3 = FLAGS;
            int i7 = (i6 + i5) - (i6 & i5);
            strArr3[i7] = strArr3[i6] + '|' + strArr3[i5];
            strArr3[(i7 + 8) - (i7 & 8)] = strArr3[i6] + '|' + strArr3[i5] + "|PADDED";
        }
        int length = FLAGS.length;
        for (int i8 = 0; i8 < length; i8++) {
            String[] strArr4 = FLAGS;
            if (strArr4[i8] == null) {
                strArr4[i8] = BINARY[i8];
            }
        }
    }

    private Http2() {
    }

    public final String formatFlags(int i2, int i3) {
        String str;
        if (i3 == 0) {
            return "";
        }
        if (i2 != 2 && i2 != 3) {
            if (i2 == 4 || i2 == 6) {
                return i3 == 1 ? "ACK" : BINARY[i3];
            }
            if (i2 != 7 && i2 != 8) {
                String[] strArr = FLAGS;
                if (i3 < strArr.length) {
                    str = strArr[i3];
                    Intrinsics.checkNotNull(str);
                } else {
                    str = BINARY[i3];
                }
                return (i2 != 5 || (4 & i3) == 0) ? (i2 != 0 || (-1) - (((-1) - i3) | ((-1) - 32)) == 0) ? str : StringsKt.replace$default(str, "PRIORITY", "COMPRESSED", false, 4, (Object) null) : StringsKt.replace$default(str, "HEADERS", "PUSH_PROMISE", false, 4, (Object) null);
            }
        }
        return BINARY[i3];
    }

    public final String formattedType$okhttp(int i2) {
        String[] strArr = FRAME_NAMES;
        return i2 < strArr.length ? strArr[i2] : Util.format("0x%02x", Integer.valueOf(i2));
    }

    public final String frameLog(boolean z2, int i2, int i3, int i4, int i5) {
        return Util.format("%s 0x%08x %5d %-13s %s", z2 ? "<<" : ">>", Integer.valueOf(i2), Integer.valueOf(i3), formattedType$okhttp(i4), formatFlags(i4, i5));
    }
}
