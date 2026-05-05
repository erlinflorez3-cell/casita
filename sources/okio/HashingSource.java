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
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\u0015\"4\u0012}\u0007njG<LeN.ZS@\u000fs{:$c$\bCCU \u0002*\t]Uo˧vJp\u000bK\u000f\f\u0017\u000f̓J`\u0006x\f\u0011?2pow2d0R?n\u0005:\u0013!J\"fy\u0015\u0005(,`\u0010%}ŲO\f 4\u0001\u0006@`\u001dQ\u0013\u001b*\u0006l \u0011\"jlf6vrҺ>/1\n*WT5o4\u000bN%F\u0003'\u001dzo&C@e>չ)S\u0011\u0011\u0013xE\u0011OuK\u0006\u0001'U+YweAp\u007fB!;S\u001bb\u000b&\u000b\u000bŌd\f58\u0018nY^&(&\u0007B\u0012ʀ\b\u000e\f8\u0011D;,~\b<F%vaTh\u0002\rW0~oL/%.FqMku_oS\u0019|C2Jڟ\"'\u0019p'ib\u001d1#)\\\u0010SGPnF\u001fݓ\fՒAm\f͏3\u00108\u0014HI\u0016.*\u0014\u0005ϒ'ھ_9+ܩȦ\u0006`"}, d2 = {"\u001anZ6bu!O'\u0002~g.j\u0013?r}(Q", "\u001anZ6bu\u001f]&\u0011vk+\u0001\u00121S\n8\t>\u0001l", "\u001anZ6bu,])\fx^\u0002", "And?V,", "2hV2f;", "\u001aiPCTuLS\u0017\u000f\bb;\u0011R\u0017e\u000e6wB\u0001u\u001bIo\u001cKL", "uK^8\\6\bA#\u000f\b\\,Ro4a\u0011$EN\u0001\u0015'Ts\u001dP@\r5g\f\u001c9mt2OCIz\na\u0006", "/kV<e0MV!", "", "uK^8\\6\bA#\u000f\b\\,Ro4a\u0011$EG| \u0019\u0011]\u001dIz.7/A\u0011", ";`R", "\u001aiPCT?\bQ&\u0013\u0006m6Fp+cU", "uK^8\\6\bA#\u000f\b\\,Ro4a\u0011$\u000f\n~$+R~\u0018\u0006^!3/A\u0011", "9dh", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "uK^8\\6\bA#\u000f\b\\,Ro9k\u00042E\u001d\u0015&\u00175~\u001b@\u007f'\u000b@\u0003\u001cHi_5IL=5\"-\"lj;\\'\u001d", "6`b5", "u(;<^0H\u001du\u0013\n^\u001a\f\u00163n\u0002}", ";db@T.>2\u001d\u0001zl;", "zcT=e,<O(~yX/x\u00172", "@dP1", "", "Ah]8", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "0xc266N\\(", "\u0011n\\=T5B]\"", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class HashingSource extends ForwardingSource implements Source {
    public static final Companion Companion = new Companion(null);
    private final Mac mac;
    private final MessageDigest messageDigest;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0LeN3Xݾ+%ӆ,4RZdvI;ڈ\u001e}0\t\u0018duh\u0007J\t\rs\u0013\u0014\u0019\u0011jZM\u0006|k\u0017'2pu\u00068\u0016\u0006K@xtd\u0007P60;\u0012\u0005/\u001eZL\u001e{\u0013Cy\u0012X5\t\u0007HZ%M3\u001cB\nL#\u0019\u001e\u000bk~:Vqu:])In\u000b\\5hH|{\u000fvX5\u0010\u000faL/\u0007<}#3]\u001b\u0007\u0001]o\u0007MtU\u0005\u0017+m0\u0012\u0002eAp\u007fB\u0017[S\u001b`\u000b&\u000b\t\u0018eT59[{K~\u0010X{\t~%<2\u0012L,χ2:"}, d2 = {"\u001anZ6bu!O'\u0002~g.j\u0013?r}(:\u001e\u000b\u001f\"Cx\u0012F\u007fz", "", "u(E", "6lP0F/:\u001f", "\u001anZ6bu!O'\u0002~g.j\u0013?r}(Q", "And?V,", "\u001anZ6bu,])\fx^\u0002", "9dh", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "6lP0F/: hO", "6lP0F/:#dK", ";c$", "AgP}", "AgP~(|", "AgP\u0002$x", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final HashingSource hmacSha1(Source source, ByteString key) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(key, "key");
            return new HashingSource(source, key, "HmacSHA1");
        }

        @JvmStatic
        public final HashingSource hmacSha256(Source source, ByteString key) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(key, "key");
            return new HashingSource(source, key, "HmacSHA256");
        }

        @JvmStatic
        public final HashingSource hmacSha512(Source source, ByteString key) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(key, "key");
            return new HashingSource(source, key, "HmacSHA512");
        }

        @JvmStatic
        public final HashingSource md5(Source source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new HashingSource(source, MessageDigestAlgorithms.MD5);
        }

        @JvmStatic
        public final HashingSource sha1(Source source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new HashingSource(source, "SHA-1");
        }

        @JvmStatic
        public final HashingSource sha256(Source source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new HashingSource(source, "SHA-256");
        }

        @JvmStatic
        public final HashingSource sha512(Source source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new HashingSource(source, "SHA-512");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HashingSource(Source source, String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        Intrinsics.checkNotNullExpressionValue(messageDigest, "getInstance(...)");
        this(source, messageDigest);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSource(Source source, MessageDigest digest) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(digest, "digest");
        this.messageDigest = digest;
        this.mac = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSource(Source source, Mac mac) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(mac, "mac");
        this.mac = mac;
        this.messageDigest = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HashingSource(Source source, ByteString key, String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            Unit unit = Unit.INSTANCE;
            Intrinsics.checkNotNull(mac);
            this(source, mac);
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    @JvmStatic
    public static final HashingSource hmacSha1(Source source, ByteString byteString) {
        return Companion.hmacSha1(source, byteString);
    }

    @JvmStatic
    public static final HashingSource hmacSha256(Source source, ByteString byteString) {
        return Companion.hmacSha256(source, byteString);
    }

    @JvmStatic
    public static final HashingSource hmacSha512(Source source, ByteString byteString) {
        return Companion.hmacSha512(source, byteString);
    }

    @JvmStatic
    public static final HashingSource md5(Source source) {
        return Companion.md5(source);
    }

    @JvmStatic
    public static final HashingSource sha1(Source source) {
        return Companion.sha1(source);
    }

    @JvmStatic
    public static final HashingSource sha256(Source source) {
        return Companion.sha256(source);
    }

    @JvmStatic
    public static final HashingSource sha512(Source source) {
        return Companion.sha512(source);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "hash", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_hash, reason: not valid java name */
    public final ByteString m10815deprecated_hash() {
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

    @Override // okio.ForwardingSource, okio.Source
    public long read(Buffer sink, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j3 = super.read(sink, j2);
        if (j3 != -1) {
            long size = sink.size() - j3;
            long size2 = sink.size();
            Segment segment = sink.head;
            Intrinsics.checkNotNull(segment);
            while (size2 > size) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size2 -= (long) (segment.limit - segment.pos);
            }
            while (size2 < sink.size()) {
                int i2 = (int) ((((long) segment.pos) + size) - size2);
                MessageDigest messageDigest = this.messageDigest;
                if (messageDigest != null) {
                    messageDigest.update(segment.data, i2, segment.limit - i2);
                } else {
                    Mac mac = this.mac;
                    Intrinsics.checkNotNull(mac);
                    mac.update(segment.data, i2, segment.limit - i2);
                }
                size2 += (long) (segment.limit - segment.pos);
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                size = size2;
            }
        }
        return j3;
    }
}
