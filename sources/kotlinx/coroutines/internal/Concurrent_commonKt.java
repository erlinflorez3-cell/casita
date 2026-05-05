package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<;!&i\u0016DLc\u000b\u0004I\u00066\u00106B\r\"4ߚ\u007f\u0007|jA0ZeP\u008cZS@\u000fs{:$s\t\u007fKSUH\u0007B\u000bUȞuf\u0017Zj\rS\u000fL\u0015'k\u0015Oezm\u0012U1!oom[yUop\u0007F\u00150428@\u0004/\u001b\u0013N x\u000bC\u0012\u000bp0P\u0002JaSLŋ\u001e\u001c\fJ0\u0007$iwP<N\u0013җJ13\u0003\u0018K|2ۢ4|S\u001b\r×-˼za,:`yCՖ=SI\u0006r]EšMpe\u0015x)7+\u0010r\u00067A\u0006$\u0017;OS\\Q&\r\t_Ӡ$'aՒ\u001a\n\u000fL~¼\u0007ԫ\u0011L\u0014\u0010\f)V1E\u001cl\f\u001c8\u0015tYF^\t\u07b2F\u0010"}, d2 = {"D`[BX", "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u0017?f\u0004\u001cDw&7L\u001fJu<\"\u0013Ua:\u0007p,Wt'\u001d", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5Z\u0016/MP;t2\u001ej", "5dc#T3NSWz\u0004g6\f\u0005>i\n1\n", "uKY.i(\bc(\u0003\u0002(*\u0007\u0012-u\r5{I\u0010`\u0013Vy\u0016@tn\u0011h\b(;k\u0003.NCHk=\u001c\u0015>%*", "5dc#T3NS", "uKY.i(\bc(\u0003\u0002(*\u0007\u0012-u\r5{I\u0010`\u0013Vy\u0016@tn\u0011h\b(;k\u0003.NCHk=\u001c\u0015>% \f_=J@.CUPuFOw=\u0012!0", "Adc#T3NS", "uKY.i(\bc(\u0003\u0002(*\u0007\u0012-u\r5{I\u0010`\u0013Vy\u0016@tn\u0011h\b(;k\u0003.NCHk=\u001c\u0015>H>\u0003t(\u0018}#PN\u0018\u0016YWr;#g\u001e~", ":n^=", "", "/bc6b5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKY.i(\bc(\u0003\u0002(*\u0007\u0012-u\r5{I\u0010`\u0013Vy\u0016@tn\u0011h\b(;k\u0003.NCHk=\u001c\u0015>H?\u0011r3R\u007fpL]Vu]b{;#\u0016d\u0017\\tm\u0015b?3rN@k]o:", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class Concurrent_commonKt {
    public static final <T> T getValue(AtomicReference<T> atomicReference) {
        return atomicReference.get();
    }

    public static /* synthetic */ void getValue$annotations(AtomicReference atomicReference) {
    }

    public static final <T> void loop(AtomicReference<T> atomicReference, Function2<? super AtomicReference<T>, ? super T, Unit> function2) {
        while (true) {
            function2.invoke(atomicReference, (Object) getValue(atomicReference));
        }
    }

    public static final <T> void setValue(AtomicReference<T> atomicReference, T t2) {
        atomicReference.set(t2);
    }
}
