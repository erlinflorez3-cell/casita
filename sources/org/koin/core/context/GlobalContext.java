package org.koin.core.context;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.error.KoinAppAlreadyStartedException;
import org.koin.core.module.Module;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007llA0ReP\u008cZS8-s{J$cҕyCI^\"}(\fWN}gvJp\u000bK\u000f\u001c\u0016\u0001j2J[ߓ](ƁbB\u001e>sRu=˃dtD\u0005h80=\u0012\u0005/\u001cp\\X|\tIc\u000e(/nt\u0003Z\u001bT\u001d\u001c(\u0005l\"G2%\u0004\\>`l\fC_-\u0011sZT7a@|{\u0019t_W\u0011\u0005n6+nE{)mi\u0011\u000fj[m\fouK\u0014\u0001'U7yweCp\u007fB#qcUk\u00016t\u0005\u007fi<+9`{K~\u0012nwC\n\u001bN\u001c\u000e4+x2;+~\b<7;\u0007\u001cc^\u0014vB.~\u0012O%8\u0018H;;+f\u007feK\u001b^7*\u000e;2\f\u0001M6ƟX\u000ef+ah@W?hX=vWPm\u0006\u0002\u0012\tz\u0002X\r`Q\u000e9\u0014\u0017>\u001957\nEQ,2\u0016\u0011Ru\u000f\u001d`\u0017\\\u001aVVO:nDCp\u001d\\hRe\u001dmfS\u0007.g۶(Τ\u000b}\u0010ʶpj\u0006?9'&M}l@җYύ\u000e%7ωƦ]\b"}, d2 = {"\u001ana4\"2HW\"Hxh9|R-o\t7{S\u0010`xNy\u000b8}\u0003?b\r J|k", "\u001ana4\"2HW\"Hxh9|R-o\t7{S\u0010`|Qs\u0017\u001a\u0001.DY\u0011/\r", "u(E", "-j^6a", "\u001ana4\"2HW\"Hxh9|R\u0015o\u00041Q", "-j^6a\bI^ \u0003xZ;\u0001\u00138", "\u001ana4\"2HW\"Hxh9|R\u0015o\u00041WK\f\u001e\u001bEk\u001d@\u0001.\u000b", "5dc", "5dc\u0018b0G/$\n\u0002b*x\u00183o\t\u0012\t)\u0011\u001e\u001e", "5dc\u001ce\u0015NZ ", ":nP1>6B\\\u0001\tyn3|\u0017", "", ";nSB_,L", "", "\u001ana4\"2HW\"Hxh9|R7o~8\u0003@J~!F\u007f\u0015<L", "1qT.g,\u001eO\u001b~\bB5\u000b\u0018+n}(\n", "", ";nSB_,", "@dV6f;>`", "9nX;47IZ\u001d|vm0\u0007\u0012", "AsP?g\u0012HW\"", "/o_\u0011X*EO&z\nb6\u0006", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001ana4\"2HW\"Hyl3Fn9i\t\u0004\u0007K_\u0017\u0015Nk\u001b8\u0006)?bS", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "As^=>6B\\", "Cm[<T+$]\u001d\bbh+\r\u0010/s", "9nX; *H`\u0019"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class GlobalContext implements KoinContext {
    public static final GlobalContext INSTANCE = new GlobalContext();
    private static Koin _koin = null;
    private static KoinApplication _koinApplication = null;

    private GlobalContext() {
    }

    private final void register(KoinApplication koinApplication) throws KoinAppAlreadyStartedException {
        if (_koin != null) {
            throw new KoinAppAlreadyStartedException("A Koin Application has already been started");
        }
        _koinApplication = koinApplication;
        _koin = koinApplication.getKoin();
    }

    @Override // org.koin.core.context.KoinContext
    public Koin get() {
        Koin koin = _koin;
        if (koin != null) {
            return koin;
        }
        throw new IllegalStateException("KoinApplication has not been started".toString());
    }

    public final KoinApplication getKoinApplicationOrNull() {
        return _koinApplication;
    }

    @Override // org.koin.core.context.KoinContext
    public Koin getOrNull() {
        return _koin;
    }

    @Override // org.koin.core.context.KoinContext
    public void loadKoinModules(List<Module> modules, boolean z2) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        synchronized (this) {
            Koin.loadModules$default(INSTANCE.get(), modules, false, z2, 2, null);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // org.koin.core.context.KoinContext
    public void loadKoinModules(Module module, boolean z2) {
        Intrinsics.checkNotNullParameter(module, "module");
        synchronized (this) {
            Koin.loadModules$default(INSTANCE.get(), CollectionsKt.listOf(module), false, z2, 2, null);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // org.koin.core.context.KoinContext
    public KoinApplication startKoin(Function1<? super KoinApplication, Unit> appDeclaration) {
        KoinApplication koinApplicationInit;
        Intrinsics.checkNotNullParameter(appDeclaration, "appDeclaration");
        synchronized (this) {
            koinApplicationInit = KoinApplication.Companion.init();
            INSTANCE.register(koinApplicationInit);
            appDeclaration.invoke(koinApplicationInit);
            koinApplicationInit.createEagerInstances();
        }
        return koinApplicationInit;
    }

    @Override // org.koin.core.context.KoinContext
    public KoinApplication startKoin(KoinApplication koinApplication) {
        Intrinsics.checkNotNullParameter(koinApplication, "koinApplication");
        synchronized (this) {
            INSTANCE.register(koinApplication);
            koinApplication.createEagerInstances();
        }
        return koinApplication;
    }

    @Override // org.koin.core.context.KoinContext
    public void stopKoin() {
        synchronized (this) {
            Koin koin = _koin;
            if (koin != null) {
                koin.close();
            }
            _koin = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // org.koin.core.context.KoinContext
    public void unloadKoinModules(List<Module> modules) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        synchronized (this) {
            INSTANCE.get().unloadModules(modules);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // org.koin.core.context.KoinContext
    public void unloadKoinModules(Module module) {
        Intrinsics.checkNotNullParameter(module, "module");
        synchronized (this) {
            INSTANCE.get().unloadModules(CollectionsKt.listOf(module));
            Unit unit = Unit.INSTANCE;
        }
    }
}
