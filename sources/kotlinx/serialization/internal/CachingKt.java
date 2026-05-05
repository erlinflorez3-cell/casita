package kotlinx.serialization.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d̉=!,r\bӵLc\u000b\u0004I\u00066\u000b6B\u0015\"4\u0012\u000e\u0007njO0L͜P.hS2\u000f\u0002{<$iҕyCIs\"}8\tWȞ\u007f\u001a|Jr\u0011S\u0011\u0016\u0016?lZJuzc܈\u001d4r\fM6e\bM?pxF\u0005&3P=\n\u000f\u0011\":J vAEa\u000b@6nt\u0001ĥ%\u000e\u0013!*\fN\"\u0011\u001e#i|>hncŽ=%3\u0014PQ?\u0006@\u0005]\u0013VV7\r%kL0P?E\u001b5U\u0013\u0007\u0001gm\u000eO{M\rx)7+\u0010um5\u0007\u0006B\u001eq˽-i\u0001̦t\u0005\u007f_bʯ-յgKXʫ߳{\b"}, d2 = {"CrT\u0010_(La\nz\u0002n,", "", "1qT.g,\u001cO\u0017\u0002z", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#k Dq\u00125QX;x\u0012\u001a\u0013ka\u000f", "\"", "4`RAb9R", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`|5o\u001b@r,9n}-\r", "1qT.g,)O&z\u0003^;\n\rDe~\u0006w>\u0004\u0017", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#h\u001cDi\u001e.\\P?\u00014\u001d\u0003hn=\u0003j0cv4%HL/\\(", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "", "\u001aj^A_0G\u001d&~{e,z\u0018xKn<\u0007@V", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CachingKt {
    private static final boolean useClassValue;

    static {
        Object objM8980constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM8980constructorimpl = Result.m8980constructorimpl(Class.forName("java.lang.ClassValue"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM8980constructorimpl = Result.m8980constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8987isSuccessimpl(objM8980constructorimpl)) {
            Result.Companion companion3 = Result.Companion;
            objM8980constructorimpl = true;
        }
        Object objM8980constructorimpl2 = Result.m8980constructorimpl(objM8980constructorimpl);
        if (Result.m8986isFailureimpl(objM8980constructorimpl2)) {
            objM8980constructorimpl2 = false;
        }
        useClassValue = ((Boolean) objM8980constructorimpl2).booleanValue();
    }

    public static final <T> SerializerCache<T> createCache(Function1<? super KClass<?>, ? extends KSerializer<T>> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return useClassValue ? new ClassValueCache<>(factory) : new ConcurrentHashMapCache<>(factory);
    }

    public static final <T> ParametrizedSerializerCache<T> createParametrizedCache(Function2<? super KClass<Object>, ? super List<? extends KType>, ? extends KSerializer<T>> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return useClassValue ? new ClassValueParametrizedCache<>(factory) : new ConcurrentHashMapParametrizedCache<>(factory);
    }
}
