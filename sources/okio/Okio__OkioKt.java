package okio;

import com.dynatrace.android.agent.Global;
import java.io.Closeable;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

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
    	at kotlin.metadata.jvm.KotlinClassMetadata$MultiFileClassPart.<init>(KotlinClassMetadata.kt:308)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:54)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d̉=!4i\bDJc|\u0004W\u00068\u000bDB\u0007\"B\u0012\u007f\u0007lkA0ZeP.hS2şs{J$c$wCS`(Ԃ:\t}M.lĔNZ\u0011C'\u000e$y\u0003,wW!]@\u000eJJ}@KM\u001e@a`#:\u001d_@'PyK\u0007:8NƵ\u0005\u0002kS\"\u0011^HY<h\f,\u000e:\u0014\f=.\u0007F\\.UfXzgR;3\u0005yB\u0015.o2\rMSL\u00032SǿgՕ*¨˝9\u00153_\u038b\u0007WcB\tӤ\"k\u0004ػ+4"}, d2 = {"0kP0^/HZ\u0019l~g2", "\u001anZ6bu,W\"\u0005P", "0kP0^/HZ\u0019", "0tU3X9", "\u001anZ6bu\u001bc\u001a\u007fzk,{v3n\u0006}", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", "\u001anZ6bu,])\fx^\u0002", "CrT", Global.BLANK, "\"", "\u001aiPCTuB]b\\\u0002h:|\u0005,l\u007f}", "\u001anZ6bu\u001cZ#\rzZ)\u0004\t\u0005", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "uKY.i(\bW#HXe6\u000b\t+b\u0007(Q'\u0007!&Ns\u0017\u0006{6=#~0@k%2WLI5\u0015.\u001efp=\u0011lw$:\u000eLH_(&YnF\u0016[D\u000bS+\u000b\u0014/", "=jX<"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 48, xs = "B=:?}\u001d85:")
final /* synthetic */ class Okio__OkioKt {
    public static final Sink blackhole() {
        return new BlackholeSink();
    }

    public static final BufferedSink buffer(Sink sink) {
        Intrinsics.checkNotNullParameter(sink, "<this>");
        return new RealBufferedSink(sink);
    }

    public static final BufferedSource buffer(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        return new RealBufferedSource(source);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public static final <T extends Closeable, R> R use(T t2, Function1<? super T, ? extends R> block) {
        ?? r1;
        Intrinsics.checkNotNullParameter(block, "block");
        R th = null;
        try {
            R rInvoke = block.invoke(t2);
            InlineMarker.finallyStart(1);
            if (t2 != null) {
                try {
                    t2.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            InlineMarker.finallyEnd(1);
            r1 = th;
            th = rInvoke;
        } catch (Throwable th3) {
            InlineMarker.finallyStart(1);
            if (t2 != null) {
                try {
                    t2.close();
                } catch (Throwable th4) {
                    ExceptionsKt.addSuppressed(th3, th4);
                }
            }
            InlineMarker.finallyEnd(1);
            r1 = th3;
        }
        if (r1 == 0) {
            return th;
        }
        throw r1;
    }
}
