package okhttp3.internal.ws;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
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
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\":\u0018\u007f\u0007lpA0RlP.Xb2\u000fy{<řc$\bCCU(\u000e*\tUNm̮n`ҙ;C=\u0005V}p,֒Yxk\u0012W>P\nW3{qm=n\u0010N\u0005N4jF\b!\u0019\u001c@G>x+GY)*0nt\u0003f\u001bk\u001d\u001a@%n$\u000f>tg|WxpkUG#1\f\u000bZ5\u0003H|{,vX5*\u000faL/\u0011CC\u0016=S1\t)º\u0012ƄCqEݛ935.as\u0006:/ÝfƦ/O\u0015ƞC2j\ni`:+\u0002Փ6ׂT\u000e0»K\b\u001bB\u001c\u000e4+\u001f͔\u007fբj\b\u0016ޗE~aGh\u0002\rFVЮ4ي\u001b%\bđ{E)niai\u001d%њN˿\u0011\u001e+Ч?-i]&`C\u001f+Ȯ$śU@Eʰ\u001f\u0016gG\u0006\u0004\u001ffXÐVΥK\u007f7Ʌa:%0O[g'wǾTҩHg~ݓ1taujHn/Eݬ\nҊ\r\fbե5\u0011y^lXZ\u0015$Ƚ'Θ\u0002\b\u001b\u05fe-\u0004J0=\u0010|S?Ȋ=ܷa\n-Ä7Cg~\u0004\u000e\u0006=5ک\bɄg\u0010i\u05ecG MMz\u0005\u0007j\u0019ͮ^Ⱥ`(*õ\u0019v\u001e\n\u0014D|\u0010iԶ\u0012ۇ 44ջih#[\u001b\u001epESȂ2˖l\u0010\u0007Ԟ\u00040\u0011}<t7\u0005'ʕC״kxQؓMl0BYQc\u001d|ştמ8|+ȔO\u007f\u000e]\u007fLuYCֶHʀ\u007f \u001e֝\n]=T+\u000f--\tĉ\u007f։Prmʸ\u001e\u001e5\u0013\u0015y=??֬:Űnp4ߌ;V]m/\"%kIֽZܐ\u0004yi¿ےK\b"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI:\n\nr\u0017\u00145y\fBv4 f\b/Ak 5#", "", "u(E", "\u000fB2\u0012C\u001b8;t`^<", "", "\u0010/N\u0013?\b Mybc", "", "\u0010/N\u0013?\b M\u0006lk*", "\u0010/N\u0013?\b M\u0006lk+", "\u0010/N\u0013?\b M\u0006lk,", "\u0010/N\u001a4\u001a$M\u0003iXH\u000b\\", "\u00100N\u0013?\b M\u0001ZhD", "\u00100N\u001a4\u001a$M\u007f^c@\u001b_", "\u0011K> 8&\u001c:|^cM&^r\u0013Na\"W2\\\u000b", "\u0011K> 8&&3\u0007lV@\fvp\u000bX", "", "\u0011K> 8&'=\u0013li:\u001blv)Ci\u0007[", "\u001dO2\u001c7\f80|gVK ", "\u001dO2\u001c7\f81\u0003giB\u0015ld\u001eIi\u0011", "\u001dO2\u001c7\f81\u0003giK\u0016c\u0003\rLi\u0016[", "\u001dO2\u001c7\f81\u0003giK\u0016c\u0003\u001aIh\n", "\u001dO2\u001c7\f81\u0003giK\u0016c\u0003\u001aOh\n", "\u001dO2\u001c7\f84\u007fZ\\X\nfq\u001eRi\u000f", "\u001dO2\u001c7\f8Bxqi", "\u001e@H\u0019B\b\u001dMuri>&dd\"", "\u001e@H\u0019B\b\u001dM\u007fhc@", "\u001e@H\u0019B\b\u001dM\u0007adK\u001b", "\u001e@H\u0019B\b\u001dM\u0007adK\u001bvp\u000bX", "/bR2c;!S\u0015}zk", "9dh", "1k^@X\nHR\u0019^\u000e\\,\b\u00183o\t\u0010{N\u000f\u0013\u0019G", "1nS2", "BnV4_,&O'\u0005", "", "1ta@b9", "\u001anZ6bu\u001bc\u001a\u007fzkjl\u0012=a\u0001(YP\u000e%!TE", "", "D`[6W(MSv\u0006\u0005l,Z\u0013.e", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class WebSocketProtocol {
    public static final String ACCEPT_MAGIC = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    public static final int B0_FLAG_FIN = 128;
    public static final int B0_FLAG_RSV1 = 64;
    public static final int B0_FLAG_RSV2 = 32;
    public static final int B0_FLAG_RSV3 = 16;
    public static final int B0_MASK_OPCODE = 15;
    public static final int B1_FLAG_MASK = 128;
    public static final int B1_MASK_LENGTH = 127;
    public static final int CLOSE_CLIENT_GOING_AWAY = 1001;
    public static final long CLOSE_MESSAGE_MAX = 123;
    public static final int CLOSE_NO_STATUS_CODE = 1005;
    public static final WebSocketProtocol INSTANCE = new WebSocketProtocol();
    public static final int OPCODE_BINARY = 2;
    public static final int OPCODE_CONTINUATION = 0;
    public static final int OPCODE_CONTROL_CLOSE = 8;
    public static final int OPCODE_CONTROL_PING = 9;
    public static final int OPCODE_CONTROL_PONG = 10;
    public static final int OPCODE_FLAG_CONTROL = 8;
    public static final int OPCODE_TEXT = 1;
    public static final long PAYLOAD_BYTE_MAX = 125;
    public static final int PAYLOAD_LONG = 127;
    public static final int PAYLOAD_SHORT = 126;
    public static final long PAYLOAD_SHORT_MAX = 65535;

    private WebSocketProtocol() {
    }

    public final String acceptHeader(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ByteString.Companion.encodeUtf8(key + ACCEPT_MAGIC).sha1().base64();
    }

    public final String closeCodeExceptionMessage(int i2) {
        if (i2 < 1000 || i2 >= 5000) {
            return "Code must be in range [1000,5000): " + i2;
        }
        if ((1004 > i2 || i2 >= 1007) && (1015 > i2 || i2 >= 3000)) {
            return null;
        }
        return "Code " + i2 + " is reserved and may not be used.";
    }

    public final void toggleMask(Buffer.UnsafeCursor cursor, byte[] key) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(key, "key");
        int length = key.length;
        int i2 = 0;
        do {
            byte[] bArr = cursor.data;
            int i3 = cursor.start;
            int i4 = cursor.end;
            if (bArr != null) {
                while (i3 < i4) {
                    int i5 = i2 % length;
                    bArr[i3] = (byte) (bArr[i3] ^ key[i5]);
                    i3++;
                    i2 = i5 + 1;
                }
            }
        } while (cursor.next() != -1);
    }

    public final void validateCloseCode(int i2) {
        String strCloseCodeExceptionMessage = closeCodeExceptionMessage(i2);
        if (strCloseCodeExceptionMessage == null) {
            return;
        }
        Intrinsics.checkNotNull(strCloseCodeExceptionMessage);
        throw new IllegalArgumentException(strCloseCodeExceptionMessage.toString());
    }
}
