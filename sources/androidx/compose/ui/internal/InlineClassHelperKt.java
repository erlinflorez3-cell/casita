package androidx.compose.ui.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: InlineClassHelper.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d̉=!,i\bӵLc\u0003\rIي8\u000bDB\u0007\":\u001e\u007f\u0007ljA0R͜P.XX2\u000fyz<řs>\u007fّSUH|R\r]N\u007fg\u001dK!ŐIƧ\u0006\u001c\u0001n2կmxk\u0011'ZPģW3{nm=ntN\u0005N3RB\b\u0007\u0019 :J v)Gy\u000fXؔF\u0084:X\u0015Q\u000b܅*\u0006L\u001f\u0019Kjlf6\u000fr}@5݊\u0011ojNUf`\u0003[\r^V=\f=gdѩFʽ5\u001d-Y\tޗj]E\u0004Mpݘ\th5/C\u0005\u0002\\NXF\u001a51UՕkxN\\3X\u0011\u00125+geaOT.(\u0005\n\u000fT\n\u001e\b7H\\1HiNԅ9ςr[HV\bމZ\u0002\u0001bD\u0016Ӿ\u000439B3\u000f_kS\u0019|6,\t\u001b\u001e;\u0001\u001d\"\f^\u001cb-!dya1\u007fDkK\u0015ˤ_Ơm\nxf\bÏ\u001c0U~G\n\u001f9/%eZi'/w\u001aHrk=ݓxvavjHn!\u001f\u001aE6!\f\tH+ʍ\u0004^bfD\u0011{+\u0005\u000b\f\u0014+ \u000b{\u0003ƙ٠\u0014^"}, d2 = {"1gT0^\u0017KS\u0017\t\u0004]0\f\r9n", "", "D`[BX", "", ":`iF@,La\u0015\u0001z", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "1gT0^\u0017KS\u0017\t\u0004]0\f\r9nh2\u000b)\u0011\u001e\u001e", "\"", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010.\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "@d`B\\9>>&~xh5{\r>i\n1", "Bga<j\u0010EZ\u0019\u0001ve\b\n\u000b?m\u007f1\u000b \u0014\u0015\u0017R~\u0012F\u007f", ";db@T.>", "Bga<j\u0010EZ\u0019\u0001ve\u001a\f\u0005>e_;y@\f&\u001bQx", "Bga<j\u0010EZ\u0019\u0001ve\u001a\f\u0005>e_;y@\f&\u001bQxnF\u0004\u000eE`\u0005}:m\u00144", "", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class InlineClassHelperKt {
    public static final void throwIllegalStateException(String str) {
        throw new IllegalStateException(str);
    }

    public static final Void throwIllegalStateExceptionForNullCheck(String str) {
        throw new IllegalStateException(str);
    }

    public static final void throwIllegalArgumentException(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void checkPrecondition(boolean z2, Function0<String> function0) {
        if (z2) {
            return;
        }
        throwIllegalStateException(function0.invoke());
    }

    public static final void checkPrecondition(boolean z2) {
        if (z2) {
            return;
        }
        throwIllegalStateException("Check failed.");
    }

    public static final <T> T checkPreconditionNotNull(T t2, Function0<String> function0) {
        if (t2 != null) {
            return t2;
        }
        throwIllegalStateExceptionForNullCheck(function0.invoke());
        throw new KotlinNothingValueException();
    }

    public static final <T> T checkPreconditionNotNull(T t2) {
        if (t2 != null) {
            return t2;
        }
        throwIllegalStateExceptionForNullCheck("Required value was null.");
        throw new KotlinNothingValueException();
    }

    public static final void requirePrecondition(boolean z2, Function0<String> function0) {
        if (z2) {
            return;
        }
        throwIllegalArgumentException(function0.invoke());
    }
}
