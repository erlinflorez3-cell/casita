package kotlin;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.internal.PlatformImplementationsKt;
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
@Metadata(bv = {}, d1 = {"Я6\u001d̉=!,x\bDZc|\u0004O\u00078\u000b4E\u0007\":0\u007f\u0007llA0ReP.XT2\u000f\u0002{<řc$\bCC٥\"}0\u0015WȞ\u007fy|Ur\u000bq\u001b.\u0016'k\\Mc\u0006u\u0012=3\ttW>[}U9\u000f\u0001^\u0005N3h؈\u007f\u001d\u0014(8`\u0010%\u0007kK:\u0013`D~Ij\r{\u0015`ŏ\fV3\u000f,tg|Bpl\f;_'\u0011zZNUqvůS%Pb:%v\u00102S@e6[*s\"\u0015ѸsE\u0013A\u0002=3hU&SI\"Xl\u001dÿ\u0018\u001f;Q\u0013_\u0001)t\u0007Wd\u001a,KqqQh\u00148y\u000b{;=2\u0015.'v/c^=ڤ\u0010\u07bax|cBV\nlE\u0018|g?%/ŗ7@"}, d2 = {"AsP0^\u001bKO\u0017~", "", "\u001aiPCTuEO\"\u0001DL;x\u00075T\r$y@`\u001e\u0017Oo\u0017KL", "", "5dc g(<Y\b\fv\\,;\u00058n\n7wO\u0005! U", "uKY.i(\bZ\u0015\b|(\u001b\u007f\u00169w{%\u0003@VZ\b", "5dc g(<Y\b\fv\\,", "uKY.i(\bZ\u0015\b|(\u001b\u007f\u00169w{%\u0003@VZ\r.t\nMrn<U\u0007\"\u0001[%*KI*x0\u001c\u0015Hh9\u000fc5]L", "At_=e,La\u0019}Zq*|\u0014>i\n1\n", "", "5dc h7I`\u0019\r\t^+\\\u001c-e\u000b7\u007fJ\n%UCx\u0017F\u0006!D]\b)E", "5dc h7I`\u0019\r\t^+\\\u001c-e\u000b7\u007fJ\n%", "uKY.i(\bZ\u0015\b|(\u001b\u007f\u00169w{%\u0003@VZ}Lk\u001f8@5D]\u0005i\u001eq$=#", "/cS h7I`\u0019\r\t^+", "", "3wR2c;B]\"", ">qX;g\u001aMO\u0017\u0005ik(z\t", "Asa2T4", "\u001aiPCTuB]bi\bb5\fv>r\u007f$\u0004\u0016", "EqXAX9", "\u001aiPCTuB]bi\bb5\fz<i\u000f(\t\u0016", "AsP0^\u001bKO\u0017~ih\u001a\f\u00163n\u0002", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{\u0011C-.8;/426\r5")
public class ExceptionsKt__ExceptionsKt {
    public static final void addSuppressed(Throwable th, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (th != exception) {
            PlatformImplementationsKt.IMPLEMENTATIONS.addSuppressed(th, exception);
        }
    }

    public static final StackTraceElement[] getStackTrace(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNull(stackTrace);
        return stackTrace;
    }

    public static /* synthetic */ void getStackTrace$annotations(Throwable th) {
    }

    public static final List<Throwable> getSuppressedExceptions(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        return PlatformImplementationsKt.IMPLEMENTATIONS.getSuppressed(th);
    }

    public static /* synthetic */ void getSuppressedExceptions$annotations(Throwable th) {
    }

    private static final void printStackTrace(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        th.printStackTrace();
    }

    private static final void printStackTrace(Throwable th, PrintStream stream) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Intrinsics.checkNotNullParameter(stream, "stream");
        th.printStackTrace(stream);
    }

    private static final void printStackTrace(Throwable th, PrintWriter writer) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Intrinsics.checkNotNullParameter(writer, "writer");
        th.printStackTrace(writer);
    }

    public static final String stackTraceToString(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
