package org.koin.core.context;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.KoinApplication;
import org.koin.core.context.KoinContext;
import org.koin.core.module.KoinApplicationDslMarker;
import org.koin.core.module.Module;
import org.koin.mp.KoinPlatformTools;
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
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d̉=!,i\bӵLc\u0003\"I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nj?0Le^.ZS@\u000fs{J$c$wDSg(Ԃ:\t}M\u0018q|Jr\u0011S\u0011\u0016\u0016'lZJm\u0005k܈'2pno7[rU9\u000fvN\u0013.6:8(\n1\u001e8N(v)H\u0012\u0011*SNtRR;R53 \rV5\u0011 lg|;Xnm:]\"1q+N\u0006h݁\u0001M\u0013P\u001b,%zo)C@e4-7a\u000f\u001fR\n>3I\u007f=\u001dn7);I\"YdY\u0018 #7g\r\fqV`\u0013Tx\fU-ջgX"}, d2 = {":nP1>6B\\\u0001\tyn3|\u0017", "", ";nSB_,L", "", "\u001ana4\"2HW\"Hxh9|R7o~8\u0003@J~!F\u007f\u0015<L", ";nSB_,", "AsP?g\u0012HW\"", "\u001ana4\"2HW\"Hxh9|R\u0015o\u00041WK\f\u001e\u001bEk\u001d@\u0001.\u000b", "9nX;47IZ\u001d|vm0\u0007\u0012", "/o_\u0011X*EO&z\nb6\u0006", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001ana4\"2HW\"Hyl3Fn9i\t\u0004\u0007K_\u0017\u0015Nk\u001b8\u0006)?bS", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "As^=>6B\\", "Cm[<T+$]\u001d\bbh+\r\u0010/s", "9nX; *H`\u0019"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class DefaultContextExtKt {
    public static final void loadKoinModules(List<Module> modules) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        KoinContext.DefaultImpls.loadKoinModules$default(KoinPlatformTools.INSTANCE.defaultContext(), (List) modules, false, 2, (Object) null);
    }

    public static final void loadKoinModules(Module module) {
        Intrinsics.checkNotNullParameter(module, "module");
        KoinContext.DefaultImpls.loadKoinModules$default(KoinPlatformTools.INSTANCE.defaultContext(), module, false, 2, (Object) null);
    }

    @KoinApplicationDslMarker
    public static final KoinApplication startKoin(Function1<? super KoinApplication, Unit> appDeclaration) {
        Intrinsics.checkNotNullParameter(appDeclaration, "appDeclaration");
        return KoinPlatformTools.INSTANCE.defaultContext().startKoin(appDeclaration);
    }

    @KoinApplicationDslMarker
    public static final KoinApplication startKoin(KoinApplication koinApplication) {
        Intrinsics.checkNotNullParameter(koinApplication, "koinApplication");
        return KoinPlatformTools.INSTANCE.defaultContext().startKoin(koinApplication);
    }

    public static final void stopKoin() {
        KoinPlatformTools.INSTANCE.defaultContext().stopKoin();
    }

    public static final void unloadKoinModules(List<Module> modules) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        KoinPlatformTools.INSTANCE.defaultContext().unloadKoinModules(modules);
    }

    public static final void unloadKoinModules(Module module) {
        Intrinsics.checkNotNullParameter(module, "module");
        KoinPlatformTools.INSTANCE.defaultContext().unloadKoinModules(module);
    }
}
