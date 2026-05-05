package okio;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import yg.InterfaceC1492Gx;

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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\u0015\"4\u0012}\u0007njG<LeN.ZS@\u000fs{:$c$\bCCU \u0002*\t]No˧vJp\u000bKƤ\u000e\u0016\u0007q4I[xs܈-Jrom2}ok9\u0019sNE580H}\u0013\u00022*v\u0010\u0007~QM$\u0012^C¤>R\u001bQE/\u0018\u0014N$\u000f\u001ftg|6Xpk?G#1oŌR'm7=b\u0013Td+\u001bwy\u001eY@G9#-k\u00035[ÜC\u0003M{}\"n57/Wto6\u0007\u007f$\u00199Z%]!2l\t_e$'YUӍOP\u001c5@\u0006\n\u001bT\u0004<\u0012mMͶ1\u001al\u0019VI\u0003\u0005k@~\u0015\u000fF\u000e\u000fy6E:079O3f\u007fx\u0002-\u001fF\n\u0013%\u001eQ\r%fƟX\u0012x\u0017!b\u0006`\u0002_NE`P XkvZ͒d͆.\u00048ϚP=\n!F\u0019;6\n<yܬmɘLDoϸݼd\u0002"}, d2 = {"\u001anZ6bu!O'\u0002~g.j\r8kU", "\u001anZ6bu\u001f]&\u0011vk+\u0001\u00121S\u00041\u0002\u0016", "\u001anZ6bu,W\"\u0005P", "Ah]8", "2hV2f;", "\u001aiPCTuLS\u0017\u000f\bb;\u0011R\u0017e\u000e6wB\u0001u\u001bIo\u001cKL", "uK^8\\6\bA\u001d\b\u00014\u0013\u0002\u0005@aI6{>\u0011$\u001bV\u0004W$v3CU\u007f \u0016q\u0018.[R\u0011/%", "/kV<e0MV!", "", "uK^8\\6\bA\u001d\b\u00014\u0013\u0002\u0005@aI/wI\u0003`\u0005V|\u0012ExzxJ", ";`R", "\u001aiPCT?\bQ&\u0013\u0006m6Fp+cU", "uK^8\\6\bA\u001d\b\u00014\u0013\u0002\u0005@a\u0013qyM\u0015\"&Q9u8tzxJ", "9dh", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "uK^8\\6\bA\u001d\b\u00014\u0013\u0007\u000f3oI\u0005\u0010O\u0001\u0005&Ts\u0017>L\f:U\u000f\u001c\u0001t\u00127O\r)zA\"\u001ej7|w", "6`b5", "u(;<^0H\u001du\u0013\n^\u001a\f\u00163n\u0002}", ";db@T.>2\u001d\u0001zl;", "zcT=e,<O(~yX/x\u00172", "EqXAX", "", "And?V,", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "0xc266N\\(", "", "\u0011n\\=T5B]\"", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class HashingSink extends ForwardingSink implements Sink {
    public static final Companion Companion = new Companion(null);
    private final Mac mac;
    private final MessageDigest messageDigest;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0LeN3Xݾ+%ӆ,4RZdvI;ڈ\u001e}0\t\u0018duh\u0007J\t\rs\u0013\u0014\u0019\u0011jZM\u0006|k\u0017'2pu\u00068\u0016\u0006K@xtd\u0007P60;\u0012\u0005/\u001eZL\u001e{\u0013Cy\u0012X5\t\u0007HZ%M3\u001cB\nL#\u0019\u001e\u000bk~:Vqu:])In\u000b\\5hH|{\u000fvX5\u0010\u000faL/\u0007<}#3]\u001b\u0007\u0001]o\u0007MtU\u0005\u0017+m0\u0012\u0002eAp\u007fB\u0017[S\u001b`\u000b&\u000b\t\u0018eT59[{K~\u0010X{\t~%<2\u0012L,χ2:"}, d2 = {"\u001anZ6bu!O'\u0002~g.j\r8k>\u0006\u0006H\f\u0013 Ky\u0017\u0012", "", "u(E", "6lP0F/:\u001f", "\u001anZ6bu!O'\u0002~g.j\r8kU", "Ah]8", "\u001anZ6bu,W\"\u0005P", "9dh", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "6lP0F/: hO", "6lP0F/:#dK", ";c$", "AgP}", "AgP~(|", "AgP\u0002$x", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final HashingSink hmacSha1(Sink sink, ByteString key) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            Intrinsics.checkNotNullParameter(key, "key");
            return new HashingSink(sink, key, "HmacSHA1");
        }

        @JvmStatic
        public final HashingSink hmacSha256(Sink sink, ByteString key) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            Intrinsics.checkNotNullParameter(key, "key");
            return new HashingSink(sink, key, "HmacSHA256");
        }

        @JvmStatic
        public final HashingSink hmacSha512(Sink sink, ByteString key) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            Intrinsics.checkNotNullParameter(key, "key");
            return new HashingSink(sink, key, "HmacSHA512");
        }

        @JvmStatic
        public final HashingSink md5(Sink sink) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return new HashingSink(sink, MessageDigestAlgorithms.MD5);
        }

        @JvmStatic
        public final HashingSink sha1(Sink sink) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return new HashingSink(sink, "SHA-1");
        }

        @JvmStatic
        public final HashingSink sha256(Sink sink) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return new HashingSink(sink, "SHA-256");
        }

        @JvmStatic
        public final HashingSink sha512(Sink sink) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return new HashingSink(sink, "SHA-512");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HashingSink(Sink sink, String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        Intrinsics.checkNotNullExpressionValue(messageDigest, "getInstance(...)");
        this(sink, messageDigest);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSink(Sink sink, MessageDigest digest) {
        super(sink);
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(digest, "digest");
        this.messageDigest = digest;
        this.mac = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSink(Sink sink, Mac mac) {
        super(sink);
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(mac, "mac");
        this.mac = mac;
        this.messageDigest = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HashingSink(Sink sink, ByteString key, String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            Unit unit = Unit.INSTANCE;
            Intrinsics.checkNotNull(mac);
            this(sink, mac);
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    @JvmStatic
    public static final HashingSink hmacSha1(Sink sink, ByteString byteString) {
        return Companion.hmacSha1(sink, byteString);
    }

    @JvmStatic
    public static final HashingSink hmacSha256(Sink sink, ByteString byteString) {
        return Companion.hmacSha256(sink, byteString);
    }

    @JvmStatic
    public static final HashingSink hmacSha512(Sink sink, ByteString byteString) {
        return Companion.hmacSha512(sink, byteString);
    }

    @JvmStatic
    public static final HashingSink md5(Sink sink) {
        return Companion.md5(sink);
    }

    @JvmStatic
    public static final HashingSink sha1(Sink sink) {
        return Companion.sha1(sink);
    }

    @JvmStatic
    public static final HashingSink sha256(Sink sink) {
        return Companion.sha256(sink);
    }

    @JvmStatic
    public static final HashingSink sha512(Sink sink) {
        return Companion.sha512(sink);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "hash", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_hash, reason: not valid java name */
    public final ByteString m10814deprecated_hash() {
        return hash();
    }

    public final ByteString hash() {
        byte[] bArrDoFinal;
        MessageDigest messageDigest = this.messageDigest;
        if (messageDigest != null) {
            bArrDoFinal = messageDigest.digest();
        } else {
            Mac mac = this.mac;
            Intrinsics.checkNotNull(mac);
            bArrDoFinal = mac.doFinal();
        }
        Intrinsics.checkNotNull(bArrDoFinal);
        return new ByteString(bArrDoFinal);
    }

    @Override // okio.ForwardingSink, okio.Sink
    public void write(Buffer source, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        SegmentedByteString.checkOffsetAndCount(source.size(), 0L, j2);
        Segment segment = source.head;
        Intrinsics.checkNotNull(segment);
        long j3 = 0;
        while (j3 < j2) {
            int iMin = (int) Math.min(j2 - j3, segment.limit - segment.pos);
            MessageDigest messageDigest = this.messageDigest;
            if (messageDigest != null) {
                messageDigest.update(segment.data, segment.pos, iMin);
            } else {
                Mac mac = this.mac;
                Intrinsics.checkNotNull(mac);
                mac.update(segment.data, segment.pos, iMin);
            }
            j3 += (long) iMin;
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
        }
        super.write(source, j2);
    }
}
