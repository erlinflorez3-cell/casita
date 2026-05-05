package okio.internal;

import androidx.exifinterface.media.ExifInterface;
import com.dynatrace.android.agent.AdkSettings;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.Source;
import okio.Timeout;
import yg.InterfaceC1492Gx;

/* JADX INFO: renamed from: okio.internal.-RealBufferedSink, reason: invalid class name */
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
@Metadata(bv = {}, d1 = {"ЯF\u001d̉=!,i\bDZc|İI\u0006F\u000b6B\u0005#4\u0012\u000e\u0007nʑA0RqP.XS2\u000fy\f<řc$\u007fIC٥\"}8\tWNunvϺb\u000bY\u000f\u000e\u0016\u000fj4I[\fu\u001d\u001d˰Zom2uok9'қ<\u001d+@#Py3\u0003B*v\u0010=ٚIc\u0017 3XphT5M3\u001aXàD8\f,`\u007fNdG\u0015]h/iɆoZY5dH|{\u0013nTU\r=Ѯ$CKE<-%\u0002\u000b/R\n?IӋwU\u0018v0?+wu\u007f6\u0007\u007fD\u00199Y%]!1#ӥWx/54gcyR6(&z,\u0011J\u000e&\u0006US^1(r \u000ea\u0002#WN^\u001a^p\rAʩ</@\u000e<C9Ieyai\u0019~;\n\u000f%\u001eQ\u0010\u001f%ib&`C+\u001bȮWIdNF`N8[em2p\u0013\u00068\u0015HG.AB߿4/HEdQ#Om*Hrg'\tnyki\u0001Zp&|\"O*7\u0019\u000bHr\u0013\u0004P\u0003erҋS4o\u0015\u0007 \u0013N^ <O%@R]r\u0002j{p:)=tOY\u001d{Tä?vFCe{\u0010\u0010b\u001f\u0014m<\u0013\tfpZS:m#̦(J[x%\u0010{rP4\u0013`?\" BBI\u0019\u000b\"\u000fҒ$ZT\u000b wZ\u0017\u0012'Ta$3m2\r!\u0001~l7גm\u0011\\:\u0016x\"[Cy5G&\u0006&vL\u0015#5\u000f:ÓM\u007f_Uf\u0005\u0016$W$ D\u001aiU=X+\u000f-6xĉ3]_\u0001\u0002iM@)#|(\u000fkl<\u0003 j\u001f9'ʅPgg%?\u000f^!%0d.y\u0012J\t_{T9k\u0005εx\u001blJlP|3!F%/oR\u0001CE['K&>Ң5-tk\t\b.(d7&#e40q6\bb\u007fjxկ>al\r_:$\u001b\u0005jH\u0019w8F\u0017T%3vN+ݦ\\P`\u0019Q\u0016f5.5p\u0005[j\u0017}!L.\u000e2:ʖ\u0004,\u0002QG)M\u0002i\u0016my\\;N\u001d-#{_vB KDnW\u0011\u0016`\n\u0002=NAioK¶\u000f<G:b \u000bqV\u0012\u0006>z0Jm6/2p\u0001\u0002ٚ\u0014ֳ|\u0005"}, d2 = {"1n\\:b5\u001cZ#\rz", "", "\u001anZ6bu+S\u0015\u0006Wn-}\t<e~\u0016\u007fI\u0007l", "1n\\:b5\u001e[\u001d\u000e", "\u001anZ6bu\u001bc\u001a\u007fzk,{v3n\u0006}", "1n\\:b5\u001e[\u001d\u000eXh4\b\u0010/t\u007f\u0016{B\t\u0017 V}", "1n\\:b5\u001fZ)\r}", "1n\\:b5-W!~\u0005n;", "\u001anZ6bu-W!~\u0005n;R", "1n\\:b5-]\u0007\u000e\bb5~", "", "1n\\:b50`\u001d\u000ez", "And?V,", "", "=eU@X;", "", "0xc266N\\(", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "", "0xc2F;KW\"\u0001", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "\u001anZ6bu,])\fx^\u0002", "1n\\:b50`\u001d\u000ez:3\u0004", "1n\\:b50`\u001d\u000ez;@\f\t", AdkSettings.PLATFORM_TYPE_MOBILE, "1n\\:b50`\u001d\u000ez=,z\r7a\u0007\u000f\u0006I\u0003", "D", "1n\\:b50`\u001d\u000ezA,\u0010\u0005.e},\u0004<\b\u0007 Us\u0010Ev$\u001cc\u0007\"", "1n\\:b50`\u001d\u000ezB5\f", "7", "1n\\:b50`\u001d\u000ezB5\fo/", "1n\\:b50`\u001d\u000ezE6\u0006\u000b", "1n\\:b50`\u001d\u000ezE6\u0006\u000b\u0016e", "1n\\:b50`\u001d\u000ezL/\u0007\u0016>", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "1n\\:b50`\u001d\u000ezL/\u0007\u0016>L\u007f", "1n\\:b50`\u001d\u000ezN;}[", "Asa6a.", "0dV6a\u0010GR\u0019\u0012", "3mS\u0016a+>f", "1n\\:b50`\u001d\u000ezN;}[\ro~(fJ\u0005 &", "1nS2C6B\\(", "=jX<"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class RealBufferedSink {
    public static final void commonClose(okio.RealBufferedSink realBufferedSink) throws Throwable {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            return;
        }
        try {
            if (realBufferedSink.bufferField.size() > 0) {
                realBufferedSink.sink.write(realBufferedSink.bufferField, realBufferedSink.bufferField.size());
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            realBufferedSink.sink.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        realBufferedSink.closed = true;
        if (th != null) {
            throw th;
        }
    }

    public static final BufferedSink commonEmit(okio.RealBufferedSink realBufferedSink) throws IOException {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed".toString());
        }
        long size = realBufferedSink.bufferField.size();
        if (size > 0) {
            realBufferedSink.sink.write(realBufferedSink.bufferField, size);
        }
        return realBufferedSink;
    }

    public static final BufferedSink commonEmitCompleteSegments(okio.RealBufferedSink realBufferedSink) throws IOException {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed".toString());
        }
        long jCompleteSegmentByteCount = realBufferedSink.bufferField.completeSegmentByteCount();
        if (jCompleteSegmentByteCount > 0) {
            realBufferedSink.sink.write(realBufferedSink.bufferField, jCompleteSegmentByteCount);
        }
        return realBufferedSink;
    }

    public static final void commonFlush(okio.RealBufferedSink realBufferedSink) throws IOException {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed".toString());
        }
        if (realBufferedSink.bufferField.size() > 0) {
            realBufferedSink.sink.write(realBufferedSink.bufferField, realBufferedSink.bufferField.size());
        }
        realBufferedSink.sink.flush();
    }

    public static final Timeout commonTimeout(okio.RealBufferedSink realBufferedSink) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        return realBufferedSink.sink.timeout();
    }

    public static final String commonToString(okio.RealBufferedSink realBufferedSink) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        return "buffer(" + realBufferedSink.sink + ')';
    }

    public static final BufferedSink commonWrite(okio.RealBufferedSink realBufferedSink, ByteString byteString) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.write(byteString);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWrite(okio.RealBufferedSink realBufferedSink, ByteString byteString, int i2, int i3) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.write(byteString, i2, i3);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWrite(okio.RealBufferedSink realBufferedSink, Source source, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        while (j2 > 0) {
            long j3 = source.read(realBufferedSink.bufferField, j2);
            if (j3 == -1) {
                throw new EOFException();
            }
            j2 -= j3;
            realBufferedSink.emitCompleteSegments();
        }
        return realBufferedSink;
    }

    public static final BufferedSink commonWrite(okio.RealBufferedSink realBufferedSink, byte[] source) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.write(source);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWrite(okio.RealBufferedSink realBufferedSink, byte[] source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.write(source, i2, i3);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final void commonWrite(okio.RealBufferedSink realBufferedSink, Buffer source, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.write(source, j2);
        realBufferedSink.emitCompleteSegments();
    }

    public static final long commonWriteAll(okio.RealBufferedSink realBufferedSink, Source source) throws IOException {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        long j2 = 0;
        while (true) {
            long j3 = source.read(realBufferedSink.bufferField, 8192L);
            if (j3 == -1) {
                return j2;
            }
            j2 += j3;
            realBufferedSink.emitCompleteSegments();
        }
    }

    public static final BufferedSink commonWriteByte(okio.RealBufferedSink realBufferedSink, int i2) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeByte(i2);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteDecimalLong(okio.RealBufferedSink realBufferedSink, long j2) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeDecimalLong(j2);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteHexadecimalUnsignedLong(okio.RealBufferedSink realBufferedSink, long j2) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeHexadecimalUnsignedLong(j2);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteInt(okio.RealBufferedSink realBufferedSink, int i2) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeInt(i2);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteIntLe(okio.RealBufferedSink realBufferedSink, int i2) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeIntLe(i2);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteLong(okio.RealBufferedSink realBufferedSink, long j2) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeLong(j2);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteLongLe(okio.RealBufferedSink realBufferedSink, long j2) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeLongLe(j2);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteShort(okio.RealBufferedSink realBufferedSink, int i2) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeShort(i2);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteShortLe(okio.RealBufferedSink realBufferedSink, int i2) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeShortLe(i2);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteUtf8(okio.RealBufferedSink realBufferedSink, String string) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeUtf8(string);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteUtf8(okio.RealBufferedSink realBufferedSink, String string, int i2, int i3) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeUtf8(string, i2, i3);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteUtf8CodePoint(okio.RealBufferedSink realBufferedSink, int i2) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeUtf8CodePoint(i2);
        return realBufferedSink.emitCompleteSegments();
    }
}
