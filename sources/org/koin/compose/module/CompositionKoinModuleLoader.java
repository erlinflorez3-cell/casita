package org.koin.compose.module;

import androidx.compose.runtime.RememberObserver;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinExperimentalAPI;
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
@KoinExperimentalAPI
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004O$8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0RnP.X[2\u000fy{<$a&wHQ٥J}P\b\u0010wwq|Jr\u0011S\u0011\u0016\u0016'lZJe|k\u0015'2psO7[tU9\u000fzF\t.9:8(\u000bв\u001e*V\u0018?\u0001Q[$\u0012^Q7N\u001b\u0013[\u00172\u00124Of\u0015fbuaNH\u001bn\u0001Ck\twVf'\u000eACM]Ub*%v\u0010\"ҋD==Ֆ=U\t\u0010`e\u0010\u0018MqU\u000bx)7+wu\u00067ݼ\u0004\u001a\u001dۀg\u000fc}4hU`n\u0013?+}iׂT\u00140»\u0013}\u0013I\u0012\u001cV6V3E\u001a\u0015\u000eԧ7zzԟXR\bmP\u000eіeK"}, d2 = {"\u001ana4\"2HW\"Hxh4\b\u0013=eI0\u0006?\u0011\u001e\u0017\u0011M\u0018D\u0002/C]\r$Av{8QL#u3.\u001chHC\u0003b,[L", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-!j$.ZT;x\n", ";nSB_,L", "", "\u001ana4\"2HW\"Hxh9|R7o~8\u0003@J~!F\u007f\u0015<L", "9nX;", "\u001ana4\"2HW\"Hxh9|R\u0015o\u00041Q", "Cm[<T+(\\y\t\b`6\f\u0018/n", "", "Cm[<T+(\\t{vg+\u0007\u0012/d", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f2\tBJ\u001d!KxW:\u000125#c*;vk#B\u0007,", "5dc\u0018b0G", "u(;<e.\bY#\u0003\u0004(*\u0007\u0016//e2\u007fIV", "5dc\u001ab+NZ\u0019\r", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\"a3HO\u0018h\u0004:)x\u0012.o\t(z", "u(I", "5dc\"a3HO\u0018h\u0004?6\n\u000b9t\u000f(\u0005", "=m0/T5=]\"~y", "", "=m5<e.Hb(~\u0004", "=mA2`,FP\u0019\fz]", "Cm[<T+&]\u0018\u000f\u0002^:", "9nX; *H[$\t\t^"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class CompositionKoinModuleLoader implements RememberObserver {
    public static final int $stable = 8;
    private final Koin koin;
    private final List<Module> modules;
    private final boolean unloadOnAbandoned;
    private final boolean unloadOnForgotten;

    public CompositionKoinModuleLoader(List<Module> modules, Koin koin, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        Intrinsics.checkNotNullParameter(koin, "koin");
        this.modules = modules;
        this.koin = koin;
        this.unloadOnForgotten = z2;
        this.unloadOnAbandoned = z3;
        koin.getLogger().debug(this + " -> load modules");
        Koin.loadModules$default(koin, modules, false, false, 6, null);
    }

    private final void unloadModules() {
        this.koin.getLogger().debug(this + " -> unload modules");
        this.koin.unloadModules(this.modules);
    }

    public final Koin getKoin() {
        return this.koin;
    }

    public final List<Module> getModules() {
        return this.modules;
    }

    public final boolean getUnloadOnAbandoned() {
        return this.unloadOnAbandoned;
    }

    public final boolean getUnloadOnForgotten() {
        return this.unloadOnForgotten;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        if (this.unloadOnAbandoned) {
            unloadModules();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        if (this.unloadOnForgotten) {
            unloadModules();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }
}
