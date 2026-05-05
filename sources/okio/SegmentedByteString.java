package okio;

import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Buffer;
import yg.InterfaceC1492Gx;

/* JADX INFO: renamed from: okio.-SegmentedByteString */
/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯP\u001d̉=!,o\bDJd|\u0004W\u00068\u000b4E\u0007\":\u001b\u007fјnjG@LeN1ZS8\u000fsڔ<$i+yCAX\"}0\fWNmivJp\u000bK\u000f\f\u0016\u0001j:Q]xc\u0014\u00172P{G3SoUgn|N\u0005N;R<\b\u000f\u0019\u001aXS@z\tOc\f@/ptH_%M3%B\nL.\u0019\u001e\u000bf~:V{u:]\"I݃Zl5oH|{\u001evX5\u001f\u000faL>p;C)=S1\u001a\u0003_M\u0012Wqk\u0018/ѧ?BW\to6\u0007\u0013D\u00199Y%]!%\r\t_m$'Yb*֠V&?\u0006\u0010\u0014\rj\u0017>\n5RF-Hy8\u0012A\u0002\u000bSnOHފH\u0018\toL/%.6[=)}iai\u001c\u0015љ\u0014\u0018\u001b6;\u0001\u001d \u0004T<yE\u001fb\u0012i1\u007f?\u0004ʱX\"lK\u0006\u001cp\u0011\u0015R\u0004^`03\n+F\u0017SJ\"ݾ-9~\u0010`\\g%\u0018\th\u0002h\u0003LN<\u0007\u0016e=OȲd\\w\u0013\u0007hT\u0007+9MJS7\u0002\u0016/8\\&;gظ\u001afav\u007f\u0003M\f\tM/\u0015B\nry+o9\r2{ȡ{\"oh\u000f\u0014m;\u000b\u0005\u0007\u0005rW\u001ayt(P1\u000fК(\u0002\ndf\fA1gqJ3rջ1f#h\u001b\u001epT%\t\u000em/ɭ\u0017^AD\u001biR\u00161\u0001~}7ב\u007f\fWN\u0015`P@iQc,VY0\u0005L|Q\u0006E͟\n_zZjdlDt}{N/J=_IU\u0013=}oɆ\fEXZ\u0017}Q{\u0011Oz+\u0013??vH\u007f\b\u0019orߍtbYb<:v\r\u0019K\b\u0013\u0019@ӓ^\u0005U\tl\u000b\ndqr1X\u0003ѾP\u0007\u0013D6%/\u0016J|c@\nگ5)\u0006;G\u0015\u0010v\u0012o\\\u0013\u0013\u00134\u000f}\u0004Z|\\˲lqo@ծPI\b}\u0015Юfк\u0007HP۳\u0010\nH\tB\u000eSbOf\tVfPAɀTև\tՐ\u0011|^ܪJ\u0015u\u0002B3w,yI\f\u001bڔGM"}, d2 = {"\u0012D5\u000eH\u0013-M\u0013[\u000fm,j\u0018<i\t*uN\u0005,\u0017", "", "5dc\u00118\r\u001aC\u007fmtX\t\u0011\u0018/S\u000f5\u007fI\u0003\u0011%K\u0005\u000e", "u(8", "\u0012D5\u000eH\u0013-M\u0013\bzp&l\u0012=a\u0001(YP\u000e%!T", "\u001anZ6bu\u001bc\u001a\u007fzkjl\u0012=a\u0001(YP\u000e%!TE", "5dc\u00118\r\u001aC\u007fmtX5|\u001b)U\t6wA\u0001t'T}\u0018I5!>b\b/3|\u001a8VQ", "u(E", "5dc\u00118\r\u001aC\u007fmtX5|\u001b)U\t6wA\u0001t'T}\u0018I", "u(;<^0H\u001du\u000f{_,\nG\u001fn\u000e$|@^'$Uy\u001b\u0012", "/qa.l\u0019:\\\u001b~Zj<x\u0010=", "", RemoteSettings.FORWARD_SLASH_STRING, "", "/NU3f,M", AdkSettings.PLATFORM_TYPE_MOBILE, "0NU3f,M", "0xc266N\\(", "1gT0^\u0016?T'~\n:5{f9u\t7", "", "Ahi2", "", "=eU@X;", ";h]\u001cY", "@db<_=>2\u0019\u007fvn3\fs+r{0{O\u0001$", "Cmb.Y,\u001cc&\r\u0005k", "/mS", "", "=sW2e", ":dUAE6MO(~", "0hc\u0010b<Gb", "Ahi2C(KO!", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", ">nb6g0H\\", "@de2e:>0-\u000ezl", "", "@hV5g\u0019Hb\u0015\u000ez", "Ag[", "Aga", "Bn72k\u001aM`\u001d\b|", "", "Fna", "=jX<"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class SegmentedByteString {
    private static final Buffer.UnsafeCursor DEFAULT__new_UnsafeCursor = new Buffer.UnsafeCursor();
    private static final int DEFAULT__ByteString_size = -1234567890;

    public static final int and(byte b2, int i2) {
        return (-1) - (((-1) - b2) | ((-1) - i2));
    }

    public static final long and(byte b2, long j2) {
        long j3 = b2;
        return (j3 + j2) - (j3 | j2);
    }

    public static final long and(int i2, long j2) {
        return ((long) i2) & j2;
    }

    public static final boolean arrayRangeEquals(byte[] a2, int i2, byte[] b2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        for (int i5 = 0; i5 < i4; i5++) {
            if (a2[i5 + i2] != b2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    public static final void checkOffsetAndCount(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    public static final int getDEFAULT__ByteString_size() {
        return DEFAULT__ByteString_size;
    }

    public static final Buffer.UnsafeCursor getDEFAULT__new_UnsafeCursor() {
        return DEFAULT__new_UnsafeCursor;
    }

    public static /* synthetic */ void getDEFAULT__new_UnsafeCursor$annotations() {
    }

    public static final int leftRotate(int i2, int i3) {
        int i4 = i2 << i3;
        int i5 = i2 >>> (32 - i3);
        return (i5 + i4) - (i5 & i4);
    }

    public static final long minOf(int i2, long j2) {
        return Math.min(i2, j2);
    }

    public static final long minOf(long j2, int i2) {
        return Math.min(j2, i2);
    }

    public static final int resolveDefaultParameter(ByteString byteString, int i2) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        return i2 == DEFAULT__ByteString_size ? byteString.size() : i2;
    }

    public static final int resolveDefaultParameter(byte[] bArr, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return i2 == DEFAULT__ByteString_size ? bArr.length : i2;
    }

    public static final Buffer.UnsafeCursor resolveDefaultParameter(Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return unsafeCursor == DEFAULT__new_UnsafeCursor ? new Buffer.UnsafeCursor() : unsafeCursor;
    }

    public static final int reverseBytes(int i2) {
        int i3 = ((-16777216) & i2) >>> 24;
        int i4 = ((16711680 + i2) - (16711680 | i2)) >>> 8;
        int i5 = (i3 + i4) - (i3 & i4);
        int i6 = ((65280 + i2) - (65280 | i2)) << 8;
        int i7 = (i5 + i6) - (i5 & i6);
        int i8 = ((i2 + 255) - (i2 | 255)) << 24;
        return (i8 + i7) - (i8 & i7);
    }

    public static final long reverseBytes(long j2) {
        long j3 = (((-1) - (((-1) - (-72057594037927936L)) | ((-1) - j2))) >>> 56) | (((71776119061217280L + j2) - (71776119061217280L | j2)) >>> 40);
        long j4 = ((-1) - (((-1) - 280375465082880L) | ((-1) - j2))) >>> 24;
        long j5 = (-1) - (((-1) - (((j3 + j4) - (j3 & j4)) | ((1095216660480L & j2) >>> 8))) & ((-1) - (((4278190080L + j2) - (4278190080L | j2)) << 8)));
        long j6 = (16711680 & j2) << 24;
        long j7 = ((j5 + j6) - (j5 & j6)) | (((-1) - (((-1) - 65280) | ((-1) - j2))) << 40);
        long j8 = ((-1) - (((-1) - j2) | ((-1) - 255))) << 56;
        return (j8 + j7) - (j8 & j7);
    }

    public static final short reverseBytes(short s2) {
        int i2 = (65280 & s2) >>> 8;
        int i3 = ((s2 + 255) - (s2 | 255)) << 8;
        return (short) ((i3 + i2) - (i3 & i2));
    }

    public static final long rightRotate(long j2, int i2) {
        return (-1) - (((-1) - (j2 << (64 - i2))) & ((-1) - (j2 >>> i2)));
    }

    public static final int shl(byte b2, int i2) {
        return b2 << i2;
    }

    public static final int shr(byte b2, int i2) {
        return b2 >> i2;
    }

    public static final String toHexString(byte b2) {
        int i2 = b2 >> 4;
        return StringsKt.concatToString(new char[]{okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i2 + 15) - (i2 | 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(-1) - (((-1) - b2) | ((-1) - 15))]});
    }

    public static final String toHexString(int i2) {
        if (i2 == 0) {
            return AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        int i3 = i2 >> 16;
        int i4 = 0;
        char[] cArr = {okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i2 >> 28) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(-1) - (((-1) - (i2 >> 24)) | ((-1) - 15))], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(-1) - (((-1) - (i2 >> 20)) | ((-1) - 15))], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i3 + 15) - (i3 | 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i2 >> 12) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i2 >> 8) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(-1) - (((-1) - (i2 >> 4)) | ((-1) - 15))], okio.internal.ByteString.getHEX_DIGIT_CHARS()[i2 & 15]};
        while (i4 < 8 && cArr[i4] == '0') {
            i4++;
        }
        return StringsKt.concatToString(cArr, i4, 8);
    }

    public static final String toHexString(long j2) {
        if (j2 == 0) {
            return AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        long j3 = j2 >> 52;
        long j4 = j2 >> 12;
        int i2 = 0;
        char[] cArr = {okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((-1) - (((-1) - (j2 >> 60)) | ((-1) - 15)))], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j2 >> 56) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j3 + 15) - (j3 | 15))], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j2 >> 48) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((-1) - (((-1) - (j2 >> 44)) | ((-1) - 15)))], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((-1) - (((-1) - (j2 >> 40)) | ((-1) - 15)))], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j2 >> 36) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((-1) - (((-1) - (j2 >> 32)) | ((-1) - 15)))], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j2 >> 28) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((-1) - (((-1) - (j2 >> 24)) | ((-1) - 15)))], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((-1) - (((-1) - (j2 >> 20)) | ((-1) - 15)))], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((-1) - (((-1) - (j2 >> 16)) | ((-1) - 15)))], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j4 + 15) - (j4 | 15))], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((-1) - (((-1) - (j2 >> 8)) | ((-1) - 15)))], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((-1) - (((-1) - (j2 >> 4)) | ((-1) - 15)))], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j2 + 15) - (j2 | 15))]};
        while (i2 < 16 && cArr[i2] == '0') {
            i2++;
        }
        return StringsKt.concatToString(cArr, i2, 16);
    }

    public static final byte xor(byte b2, byte b3) {
        return (byte) (b2 ^ b3);
    }
}
