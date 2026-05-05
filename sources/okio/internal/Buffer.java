package okio.internal;

import androidx.compose.animation.core.AnimationKt;
import androidx.exifinterface.media.ExifInterface;
import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.events.eventsapi.EnrichmentAttributesGenerator;
import com.google.common.base.Ascii;
import com.squareup.wire.internal.MathMethodsKt;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import okhttp3.internal.connection.RealConnection;
import okio.Buffer;
import okio.ByteString;
import okio.C1458SegmentedByteString;
import okio.Options;
import okio.Segment;
import okio.SegmentPool;
import okio.SegmentedByteString;
import okio.Sink;
import okio.Source;
import okio.Utf8;
import okio._JvmPlatformKt;
import yg.InterfaceC1492Gx;

/* JADX INFO: renamed from: okio.internal.-Buffer */
/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:254)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яć\u0014D߬)\u001ew\u0010LDiw\fA\u00147\u0013.H~*, }\u000f߿r9>Mm߉6Ri*\u0017k\u00027,[2qK;k\u001a\u0006̝\u0011OdgonP`\u0013C\u001dإ\u001exp-QU\u0007`\u001a\u000f8Fw?IMw=?e|6\u001b :\">\u0003\r\u0001(2P\u0010|zKK\u001a\u001e8@vAZ\rc\u0005\"\u0012\fC(\u00014\\oN<[t]P/+\u0003oDfUm9\u0015M;P\u0005+\u001b\u0002y\u001eYLg9#2k\u00035Z\fC\u0011M\n=3gW+9X\fWd`0\u0018#;g\r\fzlؘ\u001d\\n\u001d?+}usP<;>\u07bf\u0002%G\u0012\"\u001e'v@U\u001a\u0015\u001dTޘz\u000b^Nf\u001a^p\u0005#ad*kį9CD)}iai,v7*\u0018S̕)\u0019\u0012/sl\u000e\u000f(CT&daUNV`N8lmq\u0012\u000bz\u0002X\t`K\u000eJ\u0014\u0011\\\u001ckڜaQ8/\b\u001aHrq\u001f\u0005\u000f{\u0004o`eX$\u0005\u0015eHOȲ`\\w\u0013\u000bhT\u000719MJi7\u0002\u001638\\&Dgظ\u0016fbv\u000b\u0003M\f,M/\u0015J\nry1o9\r8{Ȣi(l`\u001b,?jj-X\u0015U\u001aۏ`tK0W`j>|$D|\u001fC6M\u001844ZSI`#o\u001b\u001epF-\rm\u0003\u0001\u0010-Yyɵ\t\u0002?\u0003.\u0019P\u000bu\u0018g'\\\\\u0001n0EA\u007f^I*cI\u00014+(Mѩy\u0018buv_L\u001b\u001b\u001eU*3F\u001eG|G=A8/-@)EEzw,ʹS*2\t)\u0012\u000fipVg6\u007f7ݛf\u0003u]\u0002/\"%h\u001b#6w0}o`\u0013G\u0012Y;_LW\u000b\u0003\be~<\u000b\u00147\u001eS\t &\u000bPECU%\\ߑ\u001aG(o\f\u0002o\\\u0002\u000b\u000fT\b\u0016\b:\u0013.o\u0011P$ЧAPlg-V\"Rt+Bv}(\fP8L\raGqh~pPM97.j\u0015G%p\u0005c\u0001ܥu\u0016O<\u000eBsq\u0003<^q8AQa\u0017\u0006myo;N\u001d%#{_sXΓC8ie\u0013!04x@6oN\u0013\tJ8<4ZmNՂIl{\u0014B\u0013\u007ftt7\u0017`U$?dAlx\u000bk\u000fγxPnUB\u0001-1[\u001e'Hw܋s^_=\u0019J\u0001\u0002\u001c1\u001b\u0019bEܻ+CWbn3(\u0007\u007f3E\fVy\u0006D\u001f_)\u001cp6Ȱ>0\b+x0\u001bgz9_%C%Θ[|ar-*f\u0001wJ)-\u000e-\u0012J%'\u000bGT9ŸhEW\\/OCH\u0006?DW\u001aRŲi^.;>M-k[\u0013\u0014U\u000f\bWI-  N&Jȍ'tr\u001c\u001f\"]IL>qDu2\r!\u007f8\u0004\\]%v\u0018I 6}\u0007yù\u0019vdy19@U0\u0015\u0006p^/ǎ\u0010{wq)m\u000b1nYV(\u0002sǡ#!2[i+X\t?9SNkW֨\u001a-1-r bWMwc\u0017\u00042ψa%==*Ba_Ez\u001e,2*y\u0012]l(CP\u001dצVw\u0017\u001c\u0005B\u0006N\u0007jVw%\u00107/\u0015~vcWӃ:^},&G7G'\u0004\rusMʘKa3/sjA16`K\u0018(%$I̍h\r\u00138\u0006!r.(T-tgm\u001e5\u001e<m\u0013\blɕKPU\u0016q)\u000e?4\u00038NS\r\u001e*\u0002i3o\u001eW۵\u001bP\u0019}N15\u0019Y{%X\u0016-\u0005\u001bY\u00121\u001a?:كx;B\u001d83W\u0015CM5\u0014_W\u0010\u0010/b~{.\u001dՠgD\\C\u00116y\u0004R(\nM7T\n\u0004>\u0018E_MpؤbXa\u0002$\u001c&X_\u0017DQZ3Ԯy\"?wd\fd\n\u000b\\A)'IHLEEl5M\u0014ˉ\u007f#W\u001b\u0013,7=\u0012Q3E\u0010@S\u007f\u000fCI!UuۘcT&\u0002SR2\u0010I\"GnlZ\n;blc\u0019i4˪e([ \\%\u0004&Dz`.sM\u001c5\u001c\u000fFd[)QO|#@=,\u000f2P'#\u0006D6\u000fǇ\b\u0016end+3u\u0006iG@i,%+as%48\u0018nUZmq\u0007B\u007fߓ\u0011\u0006qf\u0005}\\3hIK\u0013>E\u0004x|FG\u0005gJ0^\u0006\u001c_|H>L)J.m>KHP-b\nך\u00074:K%-e-E\u000b7\nwA/E(\u0007R\u0004u]|\u0010\u001e(AG\u0018Q̼YQE1G%1l\u00010\\wh-qW`\u001baxsuΧEGTYAnem,\u007f?-\u001fP+2,+$\u0011oYج\u0014:r\u0011\"NVW[sY?yrn\u001dQ\r\f\\\u0011~˒\fU\u0019\u001f:45irh,\\\u00049K]A\u0014*\u0014t-ڏ_eX9N1>_\u00059c}rDr_6p>E_lČ\u0019\u001a-+\u0001y{v<X\u0017\u0004v\u001en\u0002+x\u0011\b92ſj\u0012\u0006t@VclOplGy\u007f\u0002).\\b7h7ִG(\u0006z\n?6v}A\u0001/^\u0012\u001b\"\u0016\\vQ(c>0A:S\f-wN\u0014n\u0003a&\u001dB֟9N }\u000e\u0015\u00153Q\u000fr2\u007f5Q>f\u0004/`N!ݱ\"El5Q\u0001\bXN4|3?\u001fW`6\u000e\u001f!iEӽ6WO=QGgy#\u001bB\u0380@4\u0001z\u001dk\r)<#\u001e\u001f@G,Mz)\f\u0010C[\u0002QJ\\L5\u000ek\b ;p\"\u0006sJi6\u0018KWѮ4ضvˎƥ@YOk\">7\u000f \u0015U\np4xER'\u000fXN\u0018x1\u001f~+\tswGt$\u0018xÚ^\u000etʛ\u007f4o<\fһUЩ/íu\u0014Sɕ}\u00011G\u001cJ.<UN{x{Ib\u001aJ\u0007\u001e\t\b֊FԾ_B\u001fܓ(nBqR{u\bjӴ\u001eӼ\u001eZn\u05f9\r\u0003^h(=D\u0015j؋\u0011َ-#Hϲߋ`l\b>\u000fާMeP҅hw"}, d2 = {"\u0016DG,7\u0010 7\bxWR\u001b\\v", "", "5dc\u00158\u001f82|`^M&Y|\u001eEmfwI\n!&C~\u0012F\u007f3", "u(E", "5dc\u00158\u001f82|`^M&Y|\u001eEm", "u(J\u000f", "\u001dU4\u001f9\u0013(E\u0013]^@\u0010k\u0003\u001dT[\u0015j", "", "\u001dU4\u001f9\u0013(E\u0013sdG\f", "!D6\u001a8\u0015-7\u0002`tM\u000fih\u001dHi\u000fZ", "", "@`]4X\fJc\u0015\u0006\t", "", "AdV:X5M", "\u001anZ6bu,S\u001b\u0007zg;R", "AdV:X5M>#\r", "0xc2f", "0xc2f\u0016?T'~\n", "0xc2f\u0013B[\u001d\u000e", "1n\\:b5\u001cZ\u0019z\b", "", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "1n\\:b5\u001cZ#\rz", "\u001anZ6bu\u001bc\u001a\u007fzkjl\u0012=a\u0001(YP\u000e%!TE", "1n\\:b5\u001c]!\n\u0002^;|v/g\b(\u0005O]+&GM\u0018L\u007f4", "1n\\:b5\u001c]$\u0013", "1n\\:b5\u001c]$\u0013ih", "=tc", "=eU@X;", "0xc266N\\(", "1n\\:b5\u001e_)z\u0002l", "=sW2e", "", "1n\\:b5\u001ef$z\u0004]\t\r\n0e\r", ";h]\u000fl;>1#\u000f\u0004m", "1n\\:b5 S(", "", ">nb", "1n\\:b5!O'\u0002Xh+|", "1n\\:b5\"\\\u0018~\u000eH-", AdkSettings.PLATFORM_TYPE_MOBILE, "4q^:<5=S,", "Bn8;W,Q", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "1n\\:b5\"\\\u0018~\u000eH-\\\u0010/m\u007f1\u000b", "B`a4X;\u001bg(~\t", "1n\\:b5'S,\u000e", "1n\\:b5+O\"\u0001z>8\r\u00056s", "1n\\:b5+S\u0015}", "Ah]8", "1n\\:b5+S\u0015}Ve3", "\u001anZ6bu,W\"\u0005P", "1n\\:b5+S\u0015}Vg+n\u00163t\u007f\u0018\u0005N|\u0018\u0017", "Cmb.Y,\u001cc&\r\u0005k", "1n\\:b5+S\u0015}Wr;|", "1n\\:b5+S\u0015}Wr;|d<r{<", "1n\\:b5+S\u0015}Wr;|v>r\u00041}", "1n\\:b5+S\u0015}Y^*\u0001\u0011+lf2\u0005B", "1n\\:b5+S\u0015}[n3\u0004\u001d", "1n\\:b5+S\u0015}]^?x\b/c\u00040wGp %Kq\u0017<u\f?b\u007f", "1n\\:b5+S\u0015}^g;", "1n\\:b5+S\u0015}ah5~", "1n\\:b5+S\u0015}ha6\n\u0018", "", "1n\\:b5+S\u0015}jg:x\n/", "1n\\:b5+S\u0015}jm-O", "", "1n\\:b5+S\u0015}jm-Of9d\u007f\u0013\u0006D\n&", "1n\\:b5+S\u0015}jm-Oo3n\u007f", "1n\\:b5+S\u0015}jm-Oo3n\u007f\u0016\u000bM\u0005\u0015&", ":h\\6g", "1n\\:b5+S'\u0003\u0010^\t\r\n0e\r", "<df \\A>", "1n\\:b5,S\u0019\u0005", "1n\\:b5,S ~xm", "=oc6b5L", "\u001anZ6bu(^(\u0003\u0005g:R", "1n\\:b5,Y\u001d\n", "1n\\:b5,\\\u0015\n\ta6\f", "1n\\:b50`\u001d\u000ev[3|v/g\b(\u0005O", ";h]6`<F1\u0015\nv\\0\f\u001d", "1n\\:b50`\u001d\u000ez", "And?V,", "0xc2F;KW\"\u0001", "\u001anZ6bu,])\fx^\u0002", "1n\\:b50`\u001d\u000ez:3\u0004", "1n\\:b50`\u001d\u000ez;@\f\t", "1n\\:b50`\u001d\u000ez=,z\r7a\u0007\u000f\u0006I\u0003", "D", "1n\\:b50`\u001d\u000ezA,\u0010\u0005.e},\u0004<\b\u0007 Us\u0010Ev$\u001cc\u0007\"", "1n\\:b50`\u001d\u000ezB5\f", "7", "1n\\:b50`\u001d\u000ezE6\u0006\u000b", "1n\\:b50`\u001d\u000ezL/\u0007\u0016>", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "1n\\:b50`\u001d\u000ezN;}[", "Asa6a.", "0dV6a\u0010GR\u0019\u0012", "3mS\u0016a+>f", "1n\\:b50`\u001d\u000ezN;}[\ro~(fJ\u0005 &", "1nS2C6B\\(", "@dP1H;?&\u007f\u0003\u0004^", "<df9\\5>", "AdT8", "\"", ":`\\/W(", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "uK^8\\6\b0)\u007f{^9Rm\u0016k\n7\u0003D\n`\u001cXwW=\u0007.3h\u0002*@{_\u000f]L9z8(\u001e57|mh(_rpNHW.&<oB\u0014\u0010ic", "Ad[2V;)`\u0019\u007f~q", "Ad[2V;-`)\bxZ;|\b", "=jX<"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class Buffer {
    private static final byte[] HEX_DIGIT_BYTES = _JvmPlatformKt.asUtf8ToByteArray("0123456789abcdef");
    public static final long OVERFLOW_DIGIT_START = -7;
    public static final long OVERFLOW_ZONE = -922337203685477580L;
    public static final int SEGMENTING_THRESHOLD = 4096;

    public static final void commonClear(okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        buffer.skip(buffer.size());
    }

    public static final void commonClose(Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        if (unsafeCursor.buffer == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        unsafeCursor.buffer = null;
        unsafeCursor.setSegment$okio(null);
        unsafeCursor.offset = -1L;
        unsafeCursor.data = null;
        unsafeCursor.start = -1;
        unsafeCursor.end = -1;
    }

    public static final long commonCompleteSegmentByteCount(okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        long size = buffer.size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        Segment segment2 = segment.prev;
        Intrinsics.checkNotNull(segment2);
        return (segment2.limit >= 8192 || !segment2.owner) ? size : size - ((long) (segment2.limit - segment2.pos));
    }

    public static final okio.Buffer commonCopy(okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        okio.Buffer buffer2 = new okio.Buffer();
        if (buffer.size() == 0) {
            return buffer2;
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        Segment segmentSharedCopy = segment.sharedCopy();
        buffer2.head = segmentSharedCopy;
        segmentSharedCopy.prev = buffer2.head;
        segmentSharedCopy.next = segmentSharedCopy.prev;
        for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
            Segment segment3 = segmentSharedCopy.prev;
            Intrinsics.checkNotNull(segment3);
            Intrinsics.checkNotNull(segment2);
            segment3.push(segment2.sharedCopy());
        }
        buffer2.setSize$okio(buffer.size());
        return buffer2;
    }

    public static final okio.Buffer commonCopyTo(okio.Buffer buffer, okio.Buffer out, long j2, long j3) {
        long j4 = j3;
        long j5 = j2;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        SegmentedByteString.checkOffsetAndCount(buffer.size(), j5, j4);
        if (j4 == 0) {
            return buffer;
        }
        out.setSize$okio(out.size() + j4);
        Segment segment = buffer.head;
        while (true) {
            Intrinsics.checkNotNull(segment);
            if (j5 < segment.limit - segment.pos) {
                break;
            }
            j5 -= (long) (segment.limit - segment.pos);
            segment = segment.next;
        }
        while (j4 > 0) {
            Intrinsics.checkNotNull(segment);
            Segment segmentSharedCopy = segment.sharedCopy();
            segmentSharedCopy.pos += (int) j5;
            segmentSharedCopy.limit = Math.min(segmentSharedCopy.pos + ((int) j4), segmentSharedCopy.limit);
            if (out.head == null) {
                segmentSharedCopy.prev = segmentSharedCopy;
                segmentSharedCopy.next = segmentSharedCopy.prev;
                out.head = segmentSharedCopy.next;
            } else {
                Segment segment2 = out.head;
                Intrinsics.checkNotNull(segment2);
                Segment segment3 = segment2.prev;
                Intrinsics.checkNotNull(segment3);
                segment3.push(segmentSharedCopy);
            }
            j4 -= (long) (segmentSharedCopy.limit - segmentSharedCopy.pos);
            segment = segment.next;
            j5 = 0;
        }
        return buffer;
    }

    public static final boolean commonEquals(okio.Buffer buffer, Object obj) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer == obj) {
            return true;
        }
        if (!(obj instanceof okio.Buffer)) {
            return false;
        }
        okio.Buffer buffer2 = (okio.Buffer) obj;
        if (buffer.size() != buffer2.size()) {
            return false;
        }
        if (buffer.size() == 0) {
            return true;
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        Segment segment2 = buffer2.head;
        Intrinsics.checkNotNull(segment2);
        int i2 = segment.pos;
        int i3 = segment2.pos;
        long j2 = 0;
        while (j2 < buffer.size()) {
            long jMin = Math.min(segment.limit - i2, segment2.limit - i3);
            long j3 = 0;
            while (j3 < jMin) {
                int i4 = i2 + 1;
                int i5 = i3 + 1;
                if (segment.data[i2] != segment2.data[i3]) {
                    return false;
                }
                j3++;
                i2 = i4;
                i3 = i5;
            }
            if (i2 == segment.limit) {
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                i2 = segment.pos;
            }
            if (i3 == segment2.limit) {
                segment2 = segment2.next;
                Intrinsics.checkNotNull(segment2);
                i3 = segment2.pos;
            }
            j2 += jMin;
        }
        return true;
    }

    public static final long commonExpandBuffer(Buffer.UnsafeCursor unsafeCursor, int i2) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        if (i2 <= 0) {
            throw new IllegalArgumentException(("minByteCount <= 0: " + i2).toString());
        }
        if (i2 > 8192) {
            throw new IllegalArgumentException(("minByteCount > Segment.SIZE: " + i2).toString());
        }
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        if (!unsafeCursor.readWrite) {
            throw new IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
        }
        long size = buffer.size();
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i2);
        int i3 = 8192 - segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = 8192;
        long j2 = i3;
        buffer.setSize$okio(size + j2);
        unsafeCursor.setSegment$okio(segmentWritableSegment$okio);
        unsafeCursor.offset = size;
        unsafeCursor.data = segmentWritableSegment$okio.data;
        unsafeCursor.start = 8192 - i3;
        unsafeCursor.end = 8192;
        return j2;
    }

    public static final byte commonGet(okio.Buffer buffer, long j2) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        SegmentedByteString.checkOffsetAndCount(buffer.size(), j2, 1L);
        Segment segment = buffer.head;
        if (segment == null) {
            Segment segment2 = null;
            Intrinsics.checkNotNull(null);
            byte[] bArr = segment2.data;
            throw null;
        }
        if (buffer.size() - j2 < j2) {
            long size = buffer.size();
            while (size > j2) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            Intrinsics.checkNotNull(segment);
            return segment.data[(int) ((((long) segment.pos) + j2) - size)];
        }
        long j3 = 0;
        while (true) {
            long j4 = ((long) (segment.limit - segment.pos)) + j3;
            if (j4 > j2) {
                Intrinsics.checkNotNull(segment);
                return segment.data[(int) ((((long) segment.pos) + j2) - j3)];
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j3 = j4;
        }
    }

    public static final int commonHashCode(okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segment = buffer.head;
        if (segment == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = segment.limit;
            for (int i4 = segment.pos; i4 < i3; i4++) {
                i2 = (i2 * 31) + segment.data[i4];
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
        } while (segment != buffer.head);
        return i2;
    }

    public static final long commonIndexOf(okio.Buffer buffer, byte b2, long j2, long j3) {
        Segment segment;
        int i2;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        long size = 0;
        if (0 > j2 || j2 > j3) {
            throw new IllegalArgumentException(("size=" + buffer.size() + " fromIndex=" + j2 + " toIndex=" + j3).toString());
        }
        if (j3 > buffer.size()) {
            j3 = buffer.size();
        }
        if (j2 == j3 || (segment = buffer.head) == null) {
            return -1L;
        }
        if (buffer.size() - j2 < j2) {
            size = buffer.size();
            while (size > j2) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            if (segment == null) {
                return -1L;
            }
            while (size < j3) {
                byte[] bArr = segment.data;
                int iMin = (int) Math.min(segment.limit, (((long) segment.pos) + j3) - size);
                i2 = (int) ((((long) segment.pos) + j2) - size);
                while (i2 < iMin) {
                    if (bArr[i2] != b2) {
                        i2++;
                    }
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j2 = size;
            }
            return -1L;
        }
        while (true) {
            long j4 = ((long) (segment.limit - segment.pos)) + size;
            if (j4 > j2) {
                break;
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            size = j4;
        }
        if (segment == null) {
            return -1L;
        }
        while (size < j3) {
            byte[] bArr2 = segment.data;
            int iMin2 = (int) Math.min(segment.limit, (((long) segment.pos) + j3) - size);
            i2 = (int) ((((long) segment.pos) + j2) - size);
            while (i2 < iMin2) {
                if (bArr2[i2] != b2) {
                    i2++;
                }
            }
            size += (long) (segment.limit - segment.pos);
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j2 = size;
        }
        return -1L;
        return ((long) (i2 - segment.pos)) + size;
    }

    public static final long commonIndexOf(okio.Buffer buffer, ByteString bytes, long j2) {
        int i2;
        long j3 = j2;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.size() <= 0) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long size = 0;
        if (j3 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j3).toString());
        }
        Segment segment = buffer.head;
        if (segment == null) {
            return -1L;
        }
        if (buffer.size() - j3 < j3) {
            size = buffer.size();
            while (size > j3) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            if (segment == null) {
                return -1L;
            }
            byte[] bArrInternalArray$okio = bytes.internalArray$okio();
            byte b2 = bArrInternalArray$okio[0];
            int size2 = bytes.size();
            long size3 = (buffer.size() - ((long) size2)) + 1;
            while (size < size3) {
                byte[] bArr = segment.data;
                int iMin = (int) Math.min(segment.limit, (((long) segment.pos) + size3) - size);
                i2 = (int) ((((long) segment.pos) + j3) - size);
                while (i2 < iMin) {
                    if (bArr[i2] != b2 || !rangeEquals(segment, i2 + 1, bArrInternalArray$okio, 1, size2)) {
                        i2++;
                    }
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j3 = size;
            }
            return -1L;
        }
        while (true) {
            long j4 = ((long) (segment.limit - segment.pos)) + size;
            if (j4 > j3) {
                break;
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            size = j4;
        }
        if (segment == null) {
            return -1L;
        }
        byte[] bArrInternalArray$okio2 = bytes.internalArray$okio();
        byte b3 = bArrInternalArray$okio2[0];
        int size4 = bytes.size();
        long size5 = (buffer.size() - ((long) size4)) + 1;
        while (size < size5) {
            byte[] bArr2 = segment.data;
            int iMin2 = (int) Math.min(segment.limit, (((long) segment.pos) + size5) - size);
            i2 = (int) ((((long) segment.pos) + j3) - size);
            while (i2 < iMin2) {
                if (bArr2[i2] == b3 && rangeEquals(segment, i2 + 1, bArrInternalArray$okio2, 1, size4)) {
                }
                i2++;
            }
            size += (long) (segment.limit - segment.pos);
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j3 = size;
        }
        return -1L;
        return ((long) (i2 - segment.pos)) + size;
    }

    public static final long commonIndexOfElement(okio.Buffer buffer, ByteString targetBytes, long j2) {
        int i2;
        int i3;
        long j3 = j2;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long size = 0;
        if (j3 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j3).toString());
        }
        Segment segment = buffer.head;
        if (segment == null) {
            return -1L;
        }
        if (buffer.size() - j3 < j3) {
            size = buffer.size();
            while (size > j3) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            if (segment == null) {
                return -1L;
            }
            if (targetBytes.size() == 2) {
                byte b2 = targetBytes.getByte(0);
                byte b3 = targetBytes.getByte(1);
                while (size < buffer.size()) {
                    byte[] bArr = segment.data;
                    i2 = (int) ((((long) segment.pos) + j3) - size);
                    int i4 = segment.limit;
                    while (i2 < i4) {
                        byte b4 = bArr[i2];
                        if (b4 == b2 || b4 == b3) {
                            i3 = segment.pos;
                        } else {
                            i2++;
                        }
                    }
                    size += (long) (segment.limit - segment.pos);
                    segment = segment.next;
                    Intrinsics.checkNotNull(segment);
                    j3 = size;
                }
            } else {
                byte[] bArrInternalArray$okio = targetBytes.internalArray$okio();
                while (size < buffer.size()) {
                    byte[] bArr2 = segment.data;
                    i2 = (int) ((((long) segment.pos) + j3) - size);
                    int i5 = segment.limit;
                    while (i2 < i5) {
                        byte b5 = bArr2[i2];
                        for (byte b6 : bArrInternalArray$okio) {
                            if (b5 == b6) {
                                i3 = segment.pos;
                            }
                        }
                        i2++;
                    }
                    size += (long) (segment.limit - segment.pos);
                    segment = segment.next;
                    Intrinsics.checkNotNull(segment);
                    j3 = size;
                }
            }
            return -1L;
        }
        while (true) {
            long j4 = ((long) (segment.limit - segment.pos)) + size;
            if (j4 > j3) {
                break;
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            size = j4;
        }
        if (segment == null) {
            return -1L;
        }
        if (targetBytes.size() == 2) {
            byte b7 = targetBytes.getByte(0);
            byte b8 = targetBytes.getByte(1);
            while (size < buffer.size()) {
                byte[] bArr3 = segment.data;
                i2 = (int) ((((long) segment.pos) + j3) - size);
                int i6 = segment.limit;
                while (i2 < i6) {
                    byte b9 = bArr3[i2];
                    if (b9 == b7 || b9 == b8) {
                        i3 = segment.pos;
                    } else {
                        i2++;
                    }
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j3 = size;
            }
        } else {
            byte[] bArrInternalArray$okio2 = targetBytes.internalArray$okio();
            while (size < buffer.size()) {
                byte[] bArr4 = segment.data;
                i2 = (int) ((((long) segment.pos) + j3) - size);
                int i7 = segment.limit;
                while (i2 < i7) {
                    byte b10 = bArr4[i2];
                    for (byte b11 : bArrInternalArray$okio2) {
                        if (b10 == b11) {
                            i3 = segment.pos;
                        }
                    }
                    i2++;
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j3 = size;
            }
        }
        return -1L;
        return ((long) (i2 - i3)) + size;
    }

    public static final int commonNext(Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        long j2 = unsafeCursor.offset;
        okio.Buffer buffer = unsafeCursor.buffer;
        Intrinsics.checkNotNull(buffer);
        if (j2 != buffer.size()) {
            return unsafeCursor.seek(unsafeCursor.offset == -1 ? 0L : unsafeCursor.offset + ((long) (unsafeCursor.end - unsafeCursor.start)));
        }
        throw new IllegalStateException("no more bytes".toString());
    }

    public static final boolean commonRangeEquals(okio.Buffer buffer, long j2, ByteString bytes, int i2, int i3) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (j2 < 0 || i2 < 0 || i3 < 0 || buffer.size() - j2 < i3 || bytes.size() - i2 < i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (buffer.getByte(((long) i4) + j2) != bytes.getByte(i2 + i4)) {
                return false;
            }
        }
        return true;
    }

    public static final int commonRead(okio.Buffer buffer, byte[] sink) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        return buffer.read(sink, 0, sink.length);
    }

    public static final int commonRead(okio.Buffer buffer, byte[] sink, int i2, int i3) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        SegmentedByteString.checkOffsetAndCount(sink.length, i2, i3);
        Segment segment = buffer.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(i3, segment.limit - segment.pos);
        ArraysKt.copyInto(segment.data, sink, i2, segment.pos, segment.pos + iMin);
        segment.pos += iMin;
        buffer.setSize$okio(buffer.size() - ((long) iMin));
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    public static final long commonRead(okio.Buffer buffer, okio.Buffer sink, long j2) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (buffer.size() == 0) {
            return -1L;
        }
        if (j2 > buffer.size()) {
            j2 = buffer.size();
        }
        sink.write(buffer, j2);
        return j2;
    }

    public static final long commonReadAll(okio.Buffer buffer, Sink sink) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        long size = buffer.size();
        if (size > 0) {
            sink.write(buffer, size);
        }
        return size;
    }

    public static final Buffer.UnsafeCursor commonReadAndWriteUnsafe(okio.Buffer buffer, Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        Buffer.UnsafeCursor unsafeCursorResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(unsafeCursor);
        if (unsafeCursorResolveDefaultParameter.buffer != null) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        unsafeCursorResolveDefaultParameter.buffer = buffer;
        unsafeCursorResolveDefaultParameter.readWrite = true;
        return unsafeCursorResolveDefaultParameter;
    }

    public static final byte commonReadByte(okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i2 = segment.pos;
        int i3 = segment.limit;
        int i4 = i2 + 1;
        byte b2 = segment.data[i2];
        buffer.setSize$okio(buffer.size() - 1);
        if (i4 == i3) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i4;
        }
        return b2;
    }

    public static final byte[] commonReadByteArray(okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        return buffer.readByteArray(buffer.size());
    }

    public static final byte[] commonReadByteArray(okio.Buffer buffer, long j2) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (buffer.size() < j2) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j2];
        buffer.readFully(bArr);
        return bArr;
    }

    public static final ByteString commonReadByteString(okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        return buffer.readByteString(buffer.size());
    }

    public static final ByteString commonReadByteString(okio.Buffer buffer, long j2) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (buffer.size() < j2) {
            throw new EOFException();
        }
        if (j2 < 4096) {
            return new ByteString(buffer.readByteArray(j2));
        }
        ByteString byteStringSnapshot = buffer.snapshot((int) j2);
        buffer.skip(j2);
        return byteStringSnapshot;
    }

    public static final long commonReadDecimalLong(okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        long j2 = 0;
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        long j3 = -7;
        boolean z2 = false;
        boolean z3 = false;
        do {
            Segment segment = buffer.head;
            Intrinsics.checkNotNull(segment);
            byte[] bArr = segment.data;
            int i3 = segment.pos;
            int i4 = segment.limit;
            while (i3 < i4) {
                byte b2 = bArr[i3];
                if (b2 >= 48 && b2 <= 57) {
                    int i5 = 48 - b2;
                    if (j2 < OVERFLOW_ZONE || (j2 == OVERFLOW_ZONE && i5 < j3)) {
                        okio.Buffer bufferWriteByte = new okio.Buffer().writeDecimalLong(j2).writeByte((int) b2);
                        if (!z2) {
                            bufferWriteByte.readByte();
                        }
                        throw new NumberFormatException("Number too large: " + bufferWriteByte.readUtf8());
                    }
                    j2 = (j2 * 10) + ((long) i5);
                } else {
                    if (b2 != 45 || i2 != 0) {
                        z3 = true;
                        break;
                    }
                    j3--;
                    z2 = true;
                }
                i3++;
                i2++;
            }
            if (i3 == i4) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i3;
            }
            if (z3) {
                break;
            }
        } while (buffer.head != null);
        buffer.setSize$okio(buffer.size() - ((long) i2));
        if (i2 >= (z2 ? 2 : 1)) {
            return z2 ? j2 : -j2;
        }
        if (buffer.size() != 0) {
            throw new NumberFormatException((z2 ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + SegmentedByteString.toHexString(buffer.getByte(0L)));
        }
        throw new EOFException();
    }

    public static final void commonReadFully(okio.Buffer buffer, okio.Buffer sink, long j2) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (buffer.size() >= j2) {
            sink.write(buffer, j2);
        } else {
            sink.write(buffer, buffer.size());
            throw new EOFException();
        }
    }

    public static final void commonReadFully(okio.Buffer buffer, byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i2 = 0;
        while (i2 < sink.length) {
            int i3 = buffer.read(sink, i2, sink.length - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x006f A[EDGE_INSN: B:91:0x006f->B:81:0x006f BREAK  A[LOOP:0: B:54:0x0015->B:94:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long commonReadHexadecimalUnsignedLong(okio.Buffer r17) throws java.io.EOFException {
        /*
            java.lang.String r0 = "<this>"
            r6 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            long r1 = r6.size()
            r16 = 0
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 == 0) goto Lbb
            r8 = 0
            r15 = r8
            r4 = r16
        L15:
            okio.Segment r11 = r6.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            byte[] r10 = r11.data
            int r9 = r11.pos
            int r7 = r11.limit
        L20:
            if (r9 >= r7) goto L5e
            r3 = r10[r9]
            r0 = 48
            if (r3 < r0) goto L45
            r0 = 57
            if (r3 > r0) goto L45
            int r14 = r3 + (-48)
        L2e:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r1 = r12 + r4
            long r12 = r12 | r4
            long r1 = r1 - r12
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 != 0) goto L7c
            r0 = 4
            long r4 = r4 << r0
            long r2 = (long) r14
            long r0 = r4 + r2
            long r4 = r4 & r2
            long r0 = r0 - r4
            r4 = r0
            int r9 = r9 + 1
            int r8 = r8 + 1
            goto L20
        L45:
            r0 = 97
            if (r3 < r0) goto L50
            r0 = 102(0x66, float:1.43E-43)
            if (r3 > r0) goto L50
            int r14 = r3 + (-87)
            goto L2e
        L50:
            r0 = 65
            if (r3 < r0) goto L5b
            r0 = 70
            if (r3 > r0) goto L5b
            int r14 = r3 + (-55)
            goto L2e
        L5b:
            if (r8 == 0) goto La2
            r15 = 1
        L5e:
            if (r9 != r7) goto L79
            okio.Segment r0 = r11.pop()
            r6.head = r0
            okio.SegmentPool.recycle(r11)
        L69:
            if (r15 != 0) goto L6f
            okio.Segment r0 = r6.head
            if (r0 != 0) goto L15
        L6f:
            long r2 = r6.size()
            long r0 = (long) r8
            long r2 = r2 - r0
            r6.setSize$okio(r2)
            return r4
        L79:
            r11.pos = r9
            goto L69
        L7c:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.writeHexadecimalUnsignedLong(r4)
            okio.Buffer r3 = r0.writeByte(r3)
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Number too large: "
            r1.<init>(r0)
            java.lang.String r0 = r3.readUtf8()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        La2:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r0)
            java.lang.String r0 = okio.SegmentedByteString.toHexString(r3)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        Lbb:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.Buffer.commonReadHexadecimalUnsignedLong(okio.Buffer):long");
    }

    public static final int commonReadInt(okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() < 4) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i2 = segment.pos;
        int i3 = segment.limit;
        if (i3 - i2 < 4) {
            int i4 = (buffer.readByte() & 255) << 24;
            int i5 = (buffer.readByte() & 255) << 16;
            int i6 = ((i4 + i5) - (i4 & i5)) | (((-1) - (((-1) - buffer.readByte()) | ((-1) - 255))) << 8);
            byte b2 = buffer.readByte();
            int i7 = (b2 + 255) - (b2 | 255);
            return (i7 + i6) - (i7 & i6);
        }
        byte[] bArr = segment.data;
        byte b3 = bArr[i2];
        int i8 = ((b3 + 255) - (b3 | 255)) << 24;
        byte b4 = bArr[i2 + 1];
        int i9 = ((b4 + 255) - (b4 | 255)) << 16;
        int i10 = (i9 + i8) - (i9 & i8);
        int i11 = (bArr[i2 + 2] & 255) << 8;
        int i12 = (i10 + i11) - (i10 & i11);
        int i13 = i2 + 4;
        int i14 = (-1) - (((-1) - ((-1) - (((-1) - bArr[i2 + 3]) | ((-1) - 255)))) & ((-1) - i12));
        buffer.setSize$okio(buffer.size() - 4);
        if (i13 == i3) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i13;
        }
        return i14;
    }

    public static final long commonReadLong(okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() < 8) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i2 = segment.pos;
        int i3 = segment.limit;
        if (i3 - i2 < 8) {
            long j2 = buffer.readInt();
            return (-1) - (((-1) - (((j2 + 4294967295L) - (j2 | 4294967295L)) << 32)) & ((-1) - (4294967295L & ((long) buffer.readInt()))));
        }
        byte[] bArr = segment.data;
        long j3 = (((-1) - (((-1) - ((long) bArr[i2])) | ((-1) - 255))) << 56) | ((((long) bArr[i2 + 1]) & 255) << 48);
        long j4 = bArr[i2 + 2];
        long j5 = j3 | (((j4 + 255) - (j4 | 255)) << 40) | ((((long) bArr[i2 + 3]) & 255) << 32);
        long j6 = bArr[i2 + 4];
        long j7 = j5 | (((j6 + 255) - (j6 | 255)) << 24) | (((-1) - (((-1) - ((long) bArr[i2 + 5])) | ((-1) - 255))) << 16);
        int i4 = i2 + 7;
        long j8 = ((-1) - (((-1) - ((long) bArr[i2 + 6])) | ((-1) - 255))) << 8;
        int i5 = i2 + 8;
        long j9 = ((-1) - (((-1) - j7) & ((-1) - j8))) | (((long) bArr[i4]) & 255);
        buffer.setSize$okio(buffer.size() - 8);
        if (i5 == i3) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i5;
        }
        return j9;
    }

    public static final short commonReadShort(okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() < 2) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i2 = segment.pos;
        int i3 = segment.limit;
        if (i3 - i2 < 2) {
            byte b2 = buffer.readByte();
            int i4 = ((b2 + 255) - (b2 | 255)) << 8;
            byte b3 = buffer.readByte();
            int i5 = (b3 + 255) - (b3 | 255);
            return (short) ((i5 + i4) - (i5 & i4));
        }
        byte[] bArr = segment.data;
        int i6 = i2 + 1;
        int i7 = ((-1) - (((-1) - bArr[i2]) | ((-1) - 255))) << 8;
        int i8 = i2 + 2;
        int i9 = (-1) - (((-1) - (bArr[i6] & 255)) & ((-1) - i7));
        buffer.setSize$okio(buffer.size() - 2);
        if (i8 == i3) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i8;
        }
        return (short) i9;
    }

    public static final Buffer.UnsafeCursor commonReadUnsafe(okio.Buffer buffer, Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        Buffer.UnsafeCursor unsafeCursorResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(unsafeCursor);
        if (unsafeCursorResolveDefaultParameter.buffer != null) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        unsafeCursorResolveDefaultParameter.buffer = buffer;
        unsafeCursorResolveDefaultParameter.readWrite = false;
        return unsafeCursorResolveDefaultParameter;
    }

    public static final String commonReadUtf8(okio.Buffer buffer, long j2) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (buffer.size() < j2) {
            throw new EOFException();
        }
        if (j2 == 0) {
            return "";
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        if (((long) segment.pos) + j2 > segment.limit) {
            return _Utf8Kt.commonToUtf8String$default(buffer.readByteArray(j2), 0, 0, 3, null);
        }
        int i2 = (int) j2;
        String strCommonToUtf8String = _Utf8Kt.commonToUtf8String(segment.data, segment.pos, segment.pos + i2);
        segment.pos += i2;
        buffer.setSize$okio(buffer.size() - j2);
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return strCommonToUtf8String;
    }

    public static final int commonReadUtf8CodePoint(okio.Buffer buffer) throws EOFException {
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        byte b2 = buffer.getByte(0L);
        if ((-1) - (((-1) - b2) | ((-1) - 128)) == 0) {
            i2 = (b2 + 127) - (127 | b2);
            i4 = 0;
            i3 = 1;
        } else if ((-1) - (((-1) - b2) | ((-1) - CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY)) == 192) {
            i2 = (b2 + Ascii.US) - (31 | b2);
            i3 = 2;
            i4 = 128;
        } else if ((b2 & 240) == 224) {
            i2 = (-1) - (((-1) - b2) | ((-1) - 15));
            i3 = 3;
            i4 = 2048;
        } else {
            if ((b2 & 248) != 240) {
                buffer.skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i2 = (-1) - (((-1) - b2) | ((-1) - 7));
            i3 = 4;
            i4 = 65536;
        }
        long j2 = i3;
        if (buffer.size() < j2) {
            throw new EOFException("size < " + i3 + ": " + buffer.size() + " (to read code point prefixed 0x" + SegmentedByteString.toHexString(b2) + ')');
        }
        for (int i5 = 1; i5 < i3; i5++) {
            long j3 = i5;
            byte b3 = buffer.getByte(j3);
            if ((192 & b3) != 128) {
                buffer.skip(j3);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i2 = (i2 << 6) | (b3 & Utf8.REPLACEMENT_BYTE);
        }
        buffer.skip(j2);
        return i2 > 1114111 ? Utf8.REPLACEMENT_CODE_POINT : ((55296 > i2 || i2 >= 57344) && i2 >= i4) ? i2 : Utf8.REPLACEMENT_CODE_POINT;
    }

    public static final String commonReadUtf8Line(okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        long jIndexOf = buffer.indexOf((byte) 10);
        if (jIndexOf != -1) {
            return readUtf8Line(buffer, jIndexOf);
        }
        if (buffer.size() != 0) {
            return buffer.readUtf8(buffer.size());
        }
        return null;
    }

    public static final String commonReadUtf8LineStrict(okio.Buffer buffer, long j2) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j2 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j2).toString());
        }
        long j3 = j2 != Long.MAX_VALUE ? j2 + 1 : Long.MAX_VALUE;
        long jIndexOf = buffer.indexOf((byte) 10, 0L, j3);
        if (jIndexOf != -1) {
            return readUtf8Line(buffer, jIndexOf);
        }
        if (j3 < buffer.size() && buffer.getByte(j3 - 1) == 13 && buffer.getByte(j3) == 10) {
            return readUtf8Line(buffer, j3);
        }
        okio.Buffer buffer2 = new okio.Buffer();
        buffer.copyTo(buffer2, 0L, Math.min(32, buffer.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(buffer.size(), j2) + " content=" + buffer2.readByteString().hex() + Typography.ellipsis);
    }

    public static final long commonResizeBuffer(Buffer.UnsafeCursor unsafeCursor, long j2) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        if (!unsafeCursor.readWrite) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
        }
        long size = buffer.size();
        if (j2 <= size) {
            if (j2 < 0) {
                throw new IllegalArgumentException(("newSize < 0: " + j2).toString());
            }
            long j3 = size - j2;
            while (true) {
                if (j3 <= 0) {
                    break;
                }
                Segment segment = buffer.head;
                Intrinsics.checkNotNull(segment);
                Segment segment2 = segment.prev;
                Intrinsics.checkNotNull(segment2);
                long j4 = segment2.limit - segment2.pos;
                if (j4 > j3) {
                    segment2.limit -= (int) j3;
                    break;
                }
                buffer.head = segment2.pop();
                SegmentPool.recycle(segment2);
                j3 -= j4;
            }
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j2;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
        } else if (j2 > size) {
            long j5 = j2 - size;
            boolean z2 = true;
            while (j5 > 0) {
                Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                int iMin = (int) Math.min(j5, 8192 - segmentWritableSegment$okio.limit);
                segmentWritableSegment$okio.limit += iMin;
                j5 -= (long) iMin;
                if (z2) {
                    unsafeCursor.setSegment$okio(segmentWritableSegment$okio);
                    unsafeCursor.offset = size;
                    unsafeCursor.data = segmentWritableSegment$okio.data;
                    unsafeCursor.start = segmentWritableSegment$okio.limit - iMin;
                    unsafeCursor.end = segmentWritableSegment$okio.limit;
                    z2 = false;
                }
            }
        }
        buffer.setSize$okio(j2);
        return size;
    }

    public static final int commonSeek(Buffer.UnsafeCursor unsafeCursor, long j2) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        if (j2 < -1 || j2 > buffer.size()) {
            throw new ArrayIndexOutOfBoundsException("offset=" + j2 + " > size=" + buffer.size());
        }
        if (j2 == -1 || j2 == buffer.size()) {
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j2;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
            return -1;
        }
        long size = buffer.size();
        Segment segmentPush = buffer.head;
        Segment segment$okio = buffer.head;
        long j3 = 0;
        if (unsafeCursor.getSegment$okio() != null) {
            long j4 = unsafeCursor.offset;
            int i2 = unsafeCursor.start;
            Segment segment$okio2 = unsafeCursor.getSegment$okio();
            Intrinsics.checkNotNull(segment$okio2);
            long j5 = j4 - ((long) (i2 - segment$okio2.pos));
            if (j5 > j2) {
                segment$okio = unsafeCursor.getSegment$okio();
                size = j5;
            } else {
                segmentPush = unsafeCursor.getSegment$okio();
                j3 = j5;
            }
        }
        if (size - j2 > j2 - j3) {
            while (true) {
                Intrinsics.checkNotNull(segmentPush);
                if (j2 < ((long) (segmentPush.limit - segmentPush.pos)) + j3) {
                    break;
                }
                j3 += (long) (segmentPush.limit - segmentPush.pos);
                segmentPush = segmentPush.next;
            }
        } else {
            while (size > j2) {
                Intrinsics.checkNotNull(segment$okio);
                segment$okio = segment$okio.prev;
                Intrinsics.checkNotNull(segment$okio);
                size -= (long) (segment$okio.limit - segment$okio.pos);
            }
            j3 = size;
            segmentPush = segment$okio;
        }
        if (unsafeCursor.readWrite) {
            Intrinsics.checkNotNull(segmentPush);
            if (segmentPush.shared) {
                Segment segmentUnsharedCopy = segmentPush.unsharedCopy();
                if (buffer.head == segmentPush) {
                    buffer.head = segmentUnsharedCopy;
                }
                segmentPush = segmentPush.push(segmentUnsharedCopy);
                Segment segment = segmentPush.prev;
                Intrinsics.checkNotNull(segment);
                segment.pop();
            }
        }
        unsafeCursor.setSegment$okio(segmentPush);
        unsafeCursor.offset = j2;
        Intrinsics.checkNotNull(segmentPush);
        unsafeCursor.data = segmentPush.data;
        unsafeCursor.start = segmentPush.pos + ((int) (j2 - j3));
        unsafeCursor.end = segmentPush.limit;
        return unsafeCursor.end - unsafeCursor.start;
    }

    public static final int commonSelect(okio.Buffer buffer, Options options) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        int iSelectPrefix$default = selectPrefix$default(buffer, options, false, 2, null);
        if (iSelectPrefix$default == -1) {
            return -1;
        }
        buffer.skip(options.getByteStrings$okio()[iSelectPrefix$default].size());
        return iSelectPrefix$default;
    }

    public static final void commonSkip(okio.Buffer buffer, long j2) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        while (j2 > 0) {
            Segment segment = buffer.head;
            if (segment == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j2, segment.limit - segment.pos);
            long j3 = iMin;
            buffer.setSize$okio(buffer.size() - j3);
            j2 -= j3;
            segment.pos += iMin;
            if (segment.pos == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    public static final ByteString commonSnapshot(okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() <= 2147483647L) {
            return buffer.snapshot((int) buffer.size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + buffer.size()).toString());
    }

    public static final ByteString commonSnapshot(okio.Buffer buffer, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (i2 == 0) {
            return ByteString.EMPTY;
        }
        SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, i2);
        Segment segment = buffer.head;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Intrinsics.checkNotNull(segment);
            if (segment.limit == segment.pos) {
                throw new AssertionError("s.limit == s.pos");
            }
            i4 += segment.limit - segment.pos;
            i5++;
            segment = segment.next;
        }
        byte[][] bArr = new byte[i5][];
        int[] iArr = new int[i5 * 2];
        Segment segment2 = buffer.head;
        int i6 = 0;
        while (i3 < i2) {
            Intrinsics.checkNotNull(segment2);
            bArr[i6] = segment2.data;
            i3 += segment2.limit - segment2.pos;
            iArr[i6] = Math.min(i3, i2);
            iArr[bArr.length + i6] = segment2.pos;
            segment2.shared = true;
            i6++;
            segment2 = segment2.next;
        }
        return new C1458SegmentedByteString(bArr, iArr);
    }

    public static final Segment commonWritableSegment(okio.Buffer buffer, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (i2 < 1 || i2 > 8192) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        if (buffer.head == null) {
            Segment segmentTake = SegmentPool.take();
            buffer.head = segmentTake;
            segmentTake.prev = segmentTake;
            segmentTake.next = segmentTake;
            return segmentTake;
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        Segment segment2 = segment.prev;
        Intrinsics.checkNotNull(segment2);
        return (segment2.limit + i2 > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
    }

    public static final okio.Buffer commonWrite(okio.Buffer buffer, ByteString byteString, int i2, int i3) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(buffer, i2, i3);
        return buffer;
    }

    public static final okio.Buffer commonWrite(okio.Buffer buffer, Source source, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        while (j2 > 0) {
            long j3 = source.read(buffer, j2);
            if (j3 == -1) {
                throw new EOFException();
            }
            j2 -= j3;
        }
        return buffer;
    }

    public static final okio.Buffer commonWrite(okio.Buffer buffer, byte[] source) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        return buffer.write(source, 0, source.length);
    }

    public static final okio.Buffer commonWrite(okio.Buffer buffer, byte[] source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        long j2 = i3;
        SegmentedByteString.checkOffsetAndCount(source.length, i2, j2);
        int i4 = i3 + i2;
        while (i2 < i4) {
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
            int iMin = Math.min(i4 - i2, 8192 - segmentWritableSegment$okio.limit);
            int i5 = i2 + iMin;
            ArraysKt.copyInto(source, segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, i2, i5);
            segmentWritableSegment$okio.limit += iMin;
            i2 = i5;
        }
        buffer.setSize$okio(buffer.size() + j2);
        return buffer;
    }

    public static final void commonWrite(okio.Buffer buffer, okio.Buffer source, long j2) {
        Segment segment;
        long j3 = j2;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (source == buffer) {
            throw new IllegalArgumentException("source == this".toString());
        }
        SegmentedByteString.checkOffsetAndCount(source.size(), 0L, j3);
        while (j3 > 0) {
            Segment segment2 = source.head;
            Intrinsics.checkNotNull(segment2);
            int i2 = segment2.limit;
            Intrinsics.checkNotNull(source.head);
            if (j3 < i2 - r0.pos) {
                if (buffer.head != null) {
                    Segment segment3 = buffer.head;
                    Intrinsics.checkNotNull(segment3);
                    segment = segment3.prev;
                } else {
                    segment = null;
                }
                if (segment != null && segment.owner) {
                    if ((((long) segment.limit) + j3) - ((long) (segment.shared ? 0 : segment.pos)) <= 8192) {
                        Segment segment4 = source.head;
                        Intrinsics.checkNotNull(segment4);
                        segment4.writeTo(segment, (int) j3);
                        source.setSize$okio(source.size() - j3);
                        buffer.setSize$okio(buffer.size() + j3);
                        return;
                    }
                }
                Segment segment5 = source.head;
                Intrinsics.checkNotNull(segment5);
                source.head = segment5.split((int) j3);
            }
            Segment segment6 = source.head;
            Intrinsics.checkNotNull(segment6);
            long j4 = segment6.limit - segment6.pos;
            source.head = segment6.pop();
            if (buffer.head == null) {
                buffer.head = segment6;
                segment6.prev = segment6;
                segment6.next = segment6.prev;
            } else {
                Segment segment7 = buffer.head;
                Intrinsics.checkNotNull(segment7);
                Segment segment8 = segment7.prev;
                Intrinsics.checkNotNull(segment8);
                segment8.push(segment6).compact();
            }
            source.setSize$okio(source.size() - j4);
            buffer.setSize$okio(buffer.size() + j4);
            j3 -= j4;
        }
    }

    public static /* synthetic */ okio.Buffer commonWrite$default(okio.Buffer buffer, ByteString byteString, int i2, int i3, int i4, Object obj) {
        if ((i4 + 2) - (2 | i4) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = byteString.size();
        }
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(buffer, i2, i3);
        return buffer;
    }

    public static final long commonWriteAll(okio.Buffer buffer, Source source) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        long j2 = 0;
        while (true) {
            long j3 = source.read(buffer, 8192L);
            if (j3 == -1) {
                return j2;
            }
            j2 += j3;
        }
    }

    public static final okio.Buffer commonWriteByte(okio.Buffer buffer, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i3 = segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = i3 + 1;
        bArr[i3] = (byte) i2;
        buffer.setSize$okio(buffer.size() + 1);
        return buffer;
    }

    public static final okio.Buffer commonWriteDecimalLong(okio.Buffer buffer, long j2) {
        boolean z2;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j2 == 0) {
            return buffer.writeByte(48);
        }
        int i2 = 1;
        if (j2 < 0) {
            j2 = -j2;
            if (j2 < 0) {
                return buffer.writeUtf8("-9223372036854775808");
            }
            z2 = true;
        } else {
            z2 = false;
        }
        if (j2 >= 100000000) {
            i2 = j2 < 1000000000000L ? j2 < RealConnection.IDLE_CONNECTION_HEALTHY_NS ? j2 < MathMethodsKt.NANOS_PER_SECOND ? 9 : 10 : j2 < 100000000000L ? 11 : 12 : j2 < 1000000000000000L ? j2 < 10000000000000L ? 13 : j2 < 100000000000000L ? 14 : 15 : j2 < 100000000000000000L ? j2 < 10000000000000000L ? 16 : 17 : j2 < EnrichmentAttributesGenerator.SEND_NOW_PLACEHOLDER ? 18 : 19;
        } else if (j2 >= 10000) {
            i2 = j2 < AnimationKt.MillisToNanos ? j2 < 100000 ? 5 : 6 : j2 < 10000000 ? 7 : 8;
        } else if (j2 >= 100) {
            i2 = j2 < 1000 ? 3 : 4;
        } else if (j2 >= 10) {
            i2 = 2;
        }
        if (z2) {
            i2++;
        }
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i3 = segmentWritableSegment$okio.limit + i2;
        while (j2 != 0) {
            long j3 = 10;
            i3--;
            bArr[i3] = getHEX_DIGIT_BYTES()[(int) (j2 % j3)];
            j2 /= j3;
        }
        if (z2) {
            bArr[i3 - 1] = 45;
        }
        segmentWritableSegment$okio.limit += i2;
        buffer.setSize$okio(buffer.size() + ((long) i2));
        return buffer;
    }

    public static final okio.Buffer commonWriteHexadecimalUnsignedLong(okio.Buffer buffer, long j2) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j2 == 0) {
            return buffer.writeByte(48);
        }
        long j3 = j2 >>> 1;
        long j4 = (j3 + j2) - (j3 & j2);
        long j5 = j4 >>> 2;
        long j6 = (j4 + j5) - (j4 & j5);
        long j7 = j6 | (j6 >>> 4);
        long j8 = j7 | (j7 >>> 8);
        long j9 = (-1) - (((-1) - j8) & ((-1) - (j8 >>> 16)));
        long j10 = j9 | (j9 >>> 32);
        long j11 = j10 - ((j10 >>> 1) & 6148914691236517205L);
        long j12 = ((j11 >>> 2) & 3689348814741910323L) + (j11 & 3689348814741910323L);
        long j13 = (j12 >>> 4) + j12;
        long j14 = (j13 + 1085102592571150095L) - (j13 | 1085102592571150095L);
        long j15 = j14 + (j14 >>> 8);
        long j16 = j15 + (j15 >>> 16);
        int i2 = (int) (((((-1) - (((-1) - j16) | ((-1) - 63))) + ((j16 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i3 = segmentWritableSegment$okio.limit;
        for (int i4 = (segmentWritableSegment$okio.limit + i2) - 1; i4 >= i3; i4--) {
            bArr[i4] = getHEX_DIGIT_BYTES()[(int) ((-1) - (((-1) - 15) | ((-1) - j2)))];
            j2 >>>= 4;
        }
        segmentWritableSegment$okio.limit += i2;
        buffer.setSize$okio(buffer.size() + ((long) i2));
        return buffer;
    }

    public static final okio.Buffer commonWriteInt(okio.Buffer buffer, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i3 = segmentWritableSegment$okio.limit;
        bArr[i3] = (byte) ((i2 >>> 24) & 255);
        int i4 = i2 >>> 16;
        bArr[i3 + 1] = (byte) ((i4 + 255) - (i4 | 255));
        bArr[i3 + 2] = (byte) ((-1) - (((-1) - (i2 >>> 8)) | ((-1) - 255)));
        bArr[i3 + 3] = (byte) (i2 & 255);
        segmentWritableSegment$okio.limit = i3 + 4;
        buffer.setSize$okio(buffer.size() + 4);
        return buffer;
    }

    public static final okio.Buffer commonWriteLong(okio.Buffer buffer, long j2) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(8);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i2 = segmentWritableSegment$okio.limit;
        long j3 = j2 >>> 56;
        bArr[i2] = (byte) ((j3 + 255) - (j3 | 255));
        bArr[i2 + 1] = (byte) ((j2 >>> 48) & 255);
        bArr[i2 + 2] = (byte) ((-1) - (((-1) - (j2 >>> 40)) | ((-1) - 255)));
        bArr[i2 + 3] = (byte) ((j2 >>> 32) & 255);
        long j4 = j2 >>> 24;
        bArr[i2 + 4] = (byte) ((j4 + 255) - (j4 | 255));
        long j5 = j2 >>> 16;
        bArr[i2 + 5] = (byte) ((j5 + 255) - (j5 | 255));
        long j6 = j2 >>> 8;
        bArr[i2 + 6] = (byte) ((j6 + 255) - (j6 | 255));
        bArr[i2 + 7] = (byte) ((-1) - (((-1) - j2) | ((-1) - 255)));
        segmentWritableSegment$okio.limit = i2 + 8;
        buffer.setSize$okio(buffer.size() + 8);
        return buffer;
    }

    public static final okio.Buffer commonWriteShort(okio.Buffer buffer, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i3 = segmentWritableSegment$okio.limit;
        bArr[i3] = (byte) ((-1) - (((-1) - (i2 >>> 8)) | ((-1) - 255)));
        bArr[i3 + 1] = (byte) ((i2 + 255) - (i2 | 255));
        segmentWritableSegment$okio.limit = i3 + 2;
        buffer.setSize$okio(buffer.size() + 2);
        return buffer;
    }

    public static final okio.Buffer commonWriteUtf8(okio.Buffer buffer, String string, int i2, int i3) {
        char cCharAt;
        int i4 = i2;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        if (i4 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i4).toString());
        }
        if (i3 < i4) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i3 + " < " + i4).toString());
        }
        if (i3 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i3 + " > " + string.length()).toString());
        }
        while (i4 < i3) {
            char cCharAt2 = string.charAt(i4);
            if (cCharAt2 < 128) {
                Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                byte[] bArr = segmentWritableSegment$okio.data;
                int i5 = segmentWritableSegment$okio.limit - i4;
                int iMin = Math.min(i3, 8192 - i5);
                int i6 = i4 + 1;
                bArr[i4 + i5] = (byte) cCharAt2;
                while (true) {
                    i4 = i6;
                    if (i4 >= iMin || (cCharAt = string.charAt(i4)) >= 128) {
                        break;
                    }
                    i6 = i4 + 1;
                    bArr[i4 + i5] = (byte) cCharAt;
                }
                int i7 = (i5 + i4) - segmentWritableSegment$okio.limit;
                segmentWritableSegment$okio.limit += i7;
                buffer.setSize$okio(buffer.size() + ((long) i7));
            } else {
                if (cCharAt2 < 2048) {
                    Segment segmentWritableSegment$okio2 = buffer.writableSegment$okio(2);
                    int i8 = cCharAt2 >> 6;
                    segmentWritableSegment$okio2.data[segmentWritableSegment$okio2.limit] = (byte) ((i8 + 192) - (i8 & 192));
                    int i9 = (cCharAt2 + '?') - (cCharAt2 | '?');
                    segmentWritableSegment$okio2.data[segmentWritableSegment$okio2.limit + 1] = (byte) ((i9 + 128) - (i9 & 128));
                    segmentWritableSegment$okio2.limit += 2;
                    buffer.setSize$okio(buffer.size() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    Segment segmentWritableSegment$okio3 = buffer.writableSegment$okio(3);
                    segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit] = (byte) ((-1) - (((-1) - (cCharAt2 >> '\f')) & ((-1) - CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY)));
                    int i10 = cCharAt2 >> 6;
                    segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit + 1] = (byte) (((i10 + 63) - (i10 | 63)) | 128);
                    segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit + 2] = (byte) ((-1) - (((-1) - ((cCharAt2 + '?') - (cCharAt2 | '?'))) & ((-1) - 128)));
                    segmentWritableSegment$okio3.limit += 3;
                    buffer.setSize$okio(buffer.size() + 3);
                } else {
                    int i11 = i4 + 1;
                    char cCharAt3 = i11 < i3 ? string.charAt(i11) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        buffer.writeByte(63);
                        i4 = i11;
                    } else {
                        int i12 = ((((-1) - ((65535 - cCharAt2) | ((-1) - 1023))) << 10) | (cCharAt3 & 1023)) + 65536;
                        Segment segmentWritableSegment$okio4 = buffer.writableSegment$okio(4);
                        int i13 = i12 >> 18;
                        segmentWritableSegment$okio4.data[segmentWritableSegment$okio4.limit] = (byte) ((i13 + 240) - (i13 & 240));
                        segmentWritableSegment$okio4.data[segmentWritableSegment$okio4.limit + 1] = (byte) ((-1) - (((-1) - ((-1) - (((-1) - (i12 >> 12)) | ((-1) - 63)))) & ((-1) - 128)));
                        int i14 = (i12 >> 6) & 63;
                        segmentWritableSegment$okio4.data[segmentWritableSegment$okio4.limit + 2] = (byte) ((i14 + 128) - (i14 & 128));
                        segmentWritableSegment$okio4.data[segmentWritableSegment$okio4.limit + 3] = (byte) (((i12 + 63) - (i12 | 63)) | 128);
                        segmentWritableSegment$okio4.limit += 4;
                        buffer.setSize$okio(buffer.size() + 4);
                        i4 += 2;
                    }
                }
                i4++;
            }
        }
        return buffer;
    }

    public static final okio.Buffer commonWriteUtf8CodePoint(okio.Buffer buffer, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (i2 < 128) {
            buffer.writeByte(i2);
        } else if (i2 < 2048) {
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(2);
            segmentWritableSegment$okio.data[segmentWritableSegment$okio.limit] = (byte) ((-1) - (((-1) - (i2 >> 6)) & ((-1) - 192)));
            segmentWritableSegment$okio.data[segmentWritableSegment$okio.limit + 1] = (byte) ((-1) - (((-1) - ((i2 + 63) - (i2 | 63))) & ((-1) - 128)));
            segmentWritableSegment$okio.limit += 2;
            buffer.setSize$okio(buffer.size() + 2);
        } else if (55296 <= i2 && i2 < 57344) {
            buffer.writeByte(63);
        } else if (i2 < 65536) {
            Segment segmentWritableSegment$okio2 = buffer.writableSegment$okio(3);
            segmentWritableSegment$okio2.data[segmentWritableSegment$okio2.limit] = (byte) ((-1) - (((-1) - (i2 >> 12)) & ((-1) - CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY)));
            int i3 = (i2 >> 6) & 63;
            segmentWritableSegment$okio2.data[segmentWritableSegment$okio2.limit + 1] = (byte) ((i3 + 128) - (i3 & 128));
            segmentWritableSegment$okio2.data[segmentWritableSegment$okio2.limit + 2] = (byte) ((i2 & 63) | 128);
            segmentWritableSegment$okio2.limit += 3;
            buffer.setSize$okio(buffer.size() + 3);
        } else {
            if (i2 > 1114111) {
                throw new IllegalArgumentException("Unexpected code point: 0x" + SegmentedByteString.toHexString(i2));
            }
            Segment segmentWritableSegment$okio3 = buffer.writableSegment$okio(4);
            int i4 = i2 >> 18;
            segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit] = (byte) ((i4 + 240) - (i4 & 240));
            segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit + 1] = (byte) ((-1) - (((-1) - ((-1) - (((-1) - (i2 >> 12)) | ((-1) - 63)))) & ((-1) - 128)));
            int i5 = i2 >> 6;
            segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit + 2] = (byte) ((-1) - (((-1) - ((i5 + 63) - (i5 | 63))) & ((-1) - 128)));
            segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit + 3] = (byte) ((i2 & 63) | 128);
            segmentWritableSegment$okio3.limit += 4;
            buffer.setSize$okio(buffer.size() + 4);
        }
        return buffer;
    }

    public static final byte[] getHEX_DIGIT_BYTES() {
        return HEX_DIGIT_BYTES;
    }

    public static /* synthetic */ void getHEX_DIGIT_BYTES$annotations() {
    }

    public static final boolean rangeEquals(Segment segment, int i2, byte[] bytes, int i3, int i4) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i5 = segment.limit;
        byte[] bArr = segment.data;
        while (i3 < i4) {
            if (i2 == i5) {
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                bArr = segment.data;
                i2 = segment.pos;
                i5 = segment.limit;
            }
            if (bArr[i2] != bytes[i3]) {
                return false;
            }
            i2++;
            i3++;
        }
        return true;
    }

    public static final String readUtf8Line(okio.Buffer buffer, long j2) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (buffer.getByte(j3) == 13) {
                String utf8 = buffer.readUtf8(j3);
                buffer.skip(2L);
                return utf8;
            }
        }
        String utf82 = buffer.readUtf8(j2);
        buffer.skip(1L);
        return utf82;
    }

    public static final <T> T seek(okio.Buffer buffer, long j2, Function2<? super Segment, ? super Long, ? extends T> lambda) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(lambda, "lambda");
        Segment segment = buffer.head;
        if (segment == null) {
            return lambda.invoke(null, -1L);
        }
        if (buffer.size() - j2 < j2) {
            long size = buffer.size();
            while (size > j2) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            return lambda.invoke(segment, Long.valueOf(size));
        }
        long j3 = 0;
        while (true) {
            long j4 = ((long) (segment.limit - segment.pos)) + j3;
            if (j4 > j2) {
                return lambda.invoke(segment, Long.valueOf(j3));
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j3 = j4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0099, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0031, code lost:
    
        if (r16 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0033, code lost:
    
        return -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int selectPrefix(okio.Buffer r14, okio.Options r15, boolean r16) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "options"
            r2 = r15
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Segment r8 = r14.head
            r15 = -2
            r7 = -1
            if (r8 != 0) goto L16
            if (r16 == 0) goto L14
        L13:
            return r15
        L14:
            r15 = r7
            goto L13
        L16:
            byte[] r1 = r8.data
            int r3 = r8.pos
            int r0 = r8.limit
            int[] r14 = r2.getTrie$okio()
            r13 = 0
            r6 = r8
            r12 = r7
            r4 = r13
        L24:
            int r2 = r4 + 1
            r9 = r14[r4]
            int r10 = r4 + 2
            r2 = r14[r2]
            if (r2 == r7) goto L2f
            r12 = r2
        L2f:
            if (r6 != 0) goto L34
        L31:
            if (r16 == 0) goto L99
            return r15
        L34:
            r11 = 0
            if (r9 >= 0) goto L49
            int r2 = r9 * (-1)
            int r9 = r10 + r2
        L3b:
            int r2 = r3 + 1
            r5 = r1[r3]
            r3 = 255(0xff, float:3.57E-43)
            r5 = r5 & r3
            int r4 = r10 + 1
            r3 = r14[r10]
            if (r5 == r3) goto L70
            return r12
        L49:
            int r2 = r3 + 1
            r5 = r1[r3]
            r3 = 255(0xff, float:3.57E-43)
            r5 = r5 & r3
            int r4 = r10 + r9
        L52:
            if (r10 != r4) goto L55
            return r12
        L55:
            r3 = r14[r10]
            if (r5 != r3) goto L6d
            int r10 = r10 + r9
            r3 = r14[r10]
            if (r2 != r0) goto L8c
            okio.Segment r6 = r6.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            int r2 = r6.pos
            byte[] r1 = r6.data
            int r0 = r6.limit
            if (r6 != r8) goto L8c
            r6 = r11
            goto L8c
        L6d:
            int r10 = r10 + 1
            goto L52
        L70:
            if (r4 != r9) goto L91
            r3 = 1
        L73:
            if (r2 != r0) goto L90
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            okio.Segment r6 = r6.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            int r2 = r6.pos
            byte[] r1 = r6.data
            int r0 = r6.limit
            if (r6 != r8) goto L8f
            if (r3 == 0) goto L31
            r6 = r11
        L88:
            if (r3 == 0) goto L93
            r3 = r14[r4]
        L8c:
            if (r3 < 0) goto L96
            return r3
        L8f:
            goto L88
        L90:
            goto L88
        L91:
            r3 = r13
            goto L73
        L93:
            r3 = r2
            r10 = r4
            goto L3b
        L96:
            int r4 = -r3
            r3 = r2
            goto L24
        L99:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.Buffer.selectPrefix(okio.Buffer, okio.Options, boolean):int");
    }

    public static /* synthetic */ int selectPrefix$default(okio.Buffer buffer, Options options, boolean z2, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            z2 = false;
        }
        return selectPrefix(buffer, options, z2);
    }
}
