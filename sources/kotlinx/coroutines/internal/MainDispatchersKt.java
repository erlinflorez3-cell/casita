package kotlinx.coroutines.internal;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlinx.coroutines.MainCoroutineDispatcher;
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
@Metadata(bv = {}, d1 = {"Я6\u001d̉=!,u\bӵLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\":0\u007fјnjG9LeN0ZS@\u000fsڔ<$i%yCAU\"}0\bWȞ\u007f\u007f|Jr\u000bq\u0010.\u0016'l\\Sc{u\u0018\u001f4Rom5{s\u0004>x~D\n82P>\"\u0005/\u001bpM(\u0015\tMc\f@;px@R\u001bY\u001d\u001c(\u0005l-1&bg\\D`ns9]\"IiZT5nH|{\u001d\rÖG\u0019\u0005ѭ6+n6\fՙw٨\u0007\u0007Z¹_\u0015MxU\u0005\u0017-}ǥ\fָ[<`Ü$\u00171W\u001bfğ*m"}, d2 = {"\u0014@B!R\u001a\u001e@\nbX>&cr\u000bD_\u0015u+m\u0001\u0002'\\|0p\u000e\u0011A]", "", "Bqh\u0010e,:b\u0019]~l7x\u0018-h\u007f5", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E(|\u001b %y\u001bF\u000749b}~;{!*\\A>kAs", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\r1]\u0007~;{!*\\A>kA~\u0011fpC\u0014w\u0002", "4`RAb9BS'", "", "7r<6f:B\\\u001b", "", "!T?\u001dB\u0019-M\u0001bhL\u0010ej", "5dc H\u0017)=\u0006mtF\u0010jv\u0013NafwI\n!&C~\u0012F\u007f3", "u(E", "1qT.g,&W'\r~g.[\r=p{7yC\u0001$", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\r9g\f$@o}*QL\u0019uA(%weB\u0007B0\\\u0002#VJQ,i(", "1`d@X", "", "3qa<e\u000fB\\(", "Bga<j\u0014Ba'\u0003\u0004`\u0014x\r8D\u00046\u0007<\u0010\u0015\u001aG|mOt%@h\u0002*@", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class MainDispatchersKt {
    private static final String FAST_SERVICE_LOADER_PROPERTY_NAME = "kotlinx.coroutines.fast.service.loader";
    private static final boolean SUPPORT_MISSING = true;

    private static final MissingMainCoroutineDispatcher createMissingDispatcher(Throwable th, String str) throws Throwable {
        if (SUPPORT_MISSING) {
            return new MissingMainCoroutineDispatcher(th, str);
        }
        if (th != null) {
            throw th;
        }
        throwMissingMainDispatcherException();
        throw new KotlinNothingValueException();
    }

    static /* synthetic */ MissingMainCoroutineDispatcher createMissingDispatcher$default(Throwable th, String str, int i2, Object obj) {
        if ((1 & i2) != 0) {
            th = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            str = null;
        }
        return createMissingDispatcher(th, str);
    }

    private static /* synthetic */ void getSUPPORT_MISSING$annotations() {
    }

    public static final boolean isMissing(MainCoroutineDispatcher mainCoroutineDispatcher) {
        return mainCoroutineDispatcher.getImmediate() instanceof MissingMainCoroutineDispatcher;
    }

    public static final Void throwMissingMainDispatcherException() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlinx.coroutines.internal.MainDispatcherFactory] */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlinx.coroutines.internal.MainDispatcherFactory] */
    /* JADX WARN: Type inference failed for: r0v5, types: [kotlinx.coroutines.MainCoroutineDispatcher] */
    public static final MainCoroutineDispatcher tryCreateDispatcher(MainDispatcherFactory mainDispatcherFactory, List<? extends MainDispatcherFactory> list) {
        try {
            mainDispatcherFactory = mainDispatcherFactory.createDispatcher(list);
            return mainDispatcherFactory;
        } catch (Throwable th) {
            return createMissingDispatcher(th, mainDispatcherFactory.hintOnError());
        }
    }
}
