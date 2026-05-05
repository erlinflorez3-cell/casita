package org.koin.core;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.module.KoinApplicationDslMarker;
import org.koin.core.module.Module;
import org.koin.mp.KoinPlatformTimeTools;
import org.koin.mp.KoinPlatformTools;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146Ȑ\u0007\"B\u0012\u007f\u0007ljA0ReP.XV2\u000fy\u001a<$q$yّCU0}*\t]]ogtKb\u000bY\u000f\u000e\u0016~j4Ic\u001be\u0012\u001d>JoE6StSʠ~\u0012f\u0005N1Z7\u0017E\u0006 *Н\u0014v\tC\u0014\u0018 1XphY=Q\u0013\"*\u0006l\"I\"jpf6vs&>=-\u001bipUos>\be\rt[W\u0017\u0005m61P9E\u0015Sa1\u0014\u0019[\b\u000fM\u0001U\u0005\u0017ѧW/W\u0003o6\u0007\u0010\\29[%]!̦\r\u0015_l$/;SiJ`\u000eV\u0006)\r-<2\u001cΝ+H<?bx\u0016\u001aKt!ԟpZ\u0010jZ\u0006\u000bcF\u0017S\u000ea8\u0002't]y;G\u05cbg\u007f\u0013\u00196#/|iib!x\u0015IƘ(W7QNQ`N8n\u0006\u0006\u0012\u0007z\u0002Xʶ`W\u000eF\u0014\u001d>\u001957\nR3#{\u0002vC\u0016\u000fMyvm\u0002RvGRx$CB\u000f\u001c\\Td3y~a\u001f\u008cҭQ\u001cZ\"F\u001b!:twj(U\u0014\\k\u0001i\u0019[$܃ɻ3f=t?w\u001cXQ^a7(Ҳ\u001cуVv\u001c̳\rq\u0013[~B\u0002\u0010Ⱥ`.*õ`l\u0016|\nJ±\u00101"}, d2 = {"\u001ana4\"2HW\"Hxh9|R\u0015o\u00041WK\f\u001e\u001bEk\u001d@\u0001.\u000b", "", "u(E", "/k[<j\u0016OS&\f~],", "", "9nX;", "\u001ana4\"2HW\"Hxh9|R\u0015o\u00041Q", "5dc\u0018b0G", "u(;<e.\bY#\u0003\u0004(*\u0007\u0016//e2\u007fIV", "", "=uT?e0=S", "1k^@X", "1qT.g,\u001eO\u001b~\bB5\u000b\u0018+n}(\n", ":nP1@6=c ~\t", ";nSB_,L", "", "\u001ana4\"2HW\"Hxh9|R7o~8\u0003@J~!F\u007f\u0015<L", ":nV4X9", "\u001ana4\"2HW\"Hxh9|R6o\u0002*{MJ}!Iq\u000eIL", "", "uZ;<e.\bY#\u0003\u0004(*\u0007\u0016//\b2zP\b\u0017`/y\rL}%\u000b\u001dd*Do_4WGD52(\"h+\u001f\u0011g5*\u00022NPL(kV|Fi", ">qX;g\u0013HU\u001b~\b", ":de2_", "\u001ana4\"2HW\"Hxh9|R6o\u0002*{MJ}\u0017Xo\u0015\u0012", ">q^=X9MW\u0019\r", "D`[BX:", "", "", "Cm[<T+&]\u0018\u000f\u0002^:", "Cm[<T+&]\u0018\u000f\u0002^:;\u000f9i\t\"yJ\u000e\u0017", ";nSB_,", "\u0011n\\=T5B]\"", "9nX; *H`\u0019"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
@KoinApplicationDslMarker
public final class KoinApplication {
    public static final Companion Companion = new Companion(null);
    private boolean allowOverride;
    private final Koin koin;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f4\u007fB%s$ EшY\u001d"}, d2 = {"\u001ana4\"2HW\"Hxh9|R\u0015o\u00041WK\f\u001e\u001bEk\u001d@\u0001.s7\b(Bi\u001f2WL\u0011", "", "u(E", "7mXA", "\u001ana4\"2HW\"Hxh9|R\u0015o\u00041WK\f\u001e\u001bEk\u001d@\u0001.\u000b", "9nX; *H`\u0019"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KoinApplication init() {
            return new KoinApplication(null);
        }
    }

    private KoinApplication() {
        this.koin = new Koin();
        this.allowOverride = true;
    }

    public /* synthetic */ KoinApplication(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final void loadModules(List<Module> list) {
        this.koin.loadModules(list, this.allowOverride, false);
    }

    public static /* synthetic */ KoinApplication printLogger$default(KoinApplication koinApplication, Level level, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            level = Level.INFO;
        }
        return koinApplication.printLogger(level);
    }

    public final void allowOverride(boolean z2) {
        this.allowOverride = z2;
    }

    public final void close() {
        this.koin.close();
    }

    public final void createEagerInstances() {
        this.koin.createEagerInstances();
    }

    public final Koin getKoin() {
        return this.koin;
    }

    public final KoinApplication logger(Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.koin.setupLogger(logger);
        return this;
    }

    public final KoinApplication modules(List<Module> modules) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        if (this.koin.getLogger().isAt(Level.INFO)) {
            long timeInNanoSeconds = KoinPlatformTimeTools.INSTANCE.getTimeInNanoSeconds();
            loadModules(modules);
            this.koin.getLogger().display(Level.INFO, "Started " + this.koin.getInstanceRegistry().size() + " definitions in " + ((Number) new Pair(Unit.INSTANCE, Double.valueOf((KoinPlatformTimeTools.INSTANCE.getTimeInNanoSeconds() - timeInNanoSeconds) / 1000000.0d)).getSecond()).doubleValue() + " ms");
        } else {
            loadModules(modules);
        }
        return this;
    }

    public final KoinApplication modules(Module modules) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        return modules(CollectionsKt.listOf(modules));
    }

    public final KoinApplication modules(Module... modules) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        return modules(ArraysKt.toList(modules));
    }

    public final KoinApplication printLogger(Level level) {
        Intrinsics.checkNotNullParameter(level, "level");
        this.koin.setupLogger(KoinPlatformTools.INSTANCE.defaultLogger(level));
        return this;
    }

    public final KoinApplication properties(Map<String, ? extends Object> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.koin.getPropertyRegistry().saveProperties(values);
        return this;
    }

    public final void unloadModules$koin_core(List<Module> modules) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        this.koin.unloadModules(modules);
    }

    public final void unloadModules$koin_core(Module module) {
        Intrinsics.checkNotNullParameter(module, "module");
        this.koin.unloadModules(CollectionsKt.listOf(module));
    }
}
