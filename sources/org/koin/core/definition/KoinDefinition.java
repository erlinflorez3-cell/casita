package org.koin.core.definition;

import com.dynatrace.android.agent.Global;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.instance.InstanceFactory;
import org.koin.core.module.KoinDslMarker;
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
@KoinDslMarker
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&˛\bDRш|İI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007lqA0RnP.XS2\u000fy\u0002<řc$\u007fOC٥ Ԋ(\u001fѧvimñXY;C=\u0006V\u0012z0WV\u0011]@\u0011BL}BKS\u007f?I`+Ȃ3$ݨ&8\b\nI!8R(v)E\u0012ď\u0013xM~Ej\u0013]\u0007*\u0012<̄N\u0005dָh\u0017]Vxu@?%\u0013ix÷Uڿ`\u0003S\rTU?\r%cN7F7C\u0018=Y\u0013\tb[ušmu\u0004ޢgo89V\fWdf0\u001a#:g\u000fsqT\\KƀaT.9_{K~\u001fnĒyD\u0014J\u0016&\u0006U[tǽ\u00197\u001d\u001c6\rxcB`\u0002\u0015ۍ.~ˋ:\u001d-ĮK-?!tX2J'OO{3\u000f̷'\u0007vďsV\u0014h#$ǁ{e"}, d2 = {"\u001ana4\"2HW\"Hxh9|R.e\u0001,\u0005D\u0010\u001b!P9sFz.\u0014Y~$@q%2WL\u0011", Global.BLANK, "", ";nSB_,", "\u001ana4\"2HW\"Hxh9|R7o~8\u0003@J~!F\u007f\u0015<L", "4`RAb9R", "\u001ana4\"2HW\"Hxh9|R3n\u000e7wI~\u0017`+x\u001cKr.3Y^\u001c5| ;a\u0019", "uK^?ZuD]\u001d\bD\\6\n\txm\n'\fG\u0001`~Qn\u001eCvz\u001cc\u000b\"\u0001s 2V\r9uA\u001e^ljG\u0016_5Lvp+U\\;X[p=t\u000eX\u001dX8!Z\u001d2", "5dc\u0013T*M]&\u0013", "u(;<e.\bY#\u0003\u0004(*\u0007\u0016//\u00041\nO| \u0015G9qE\u000541b{ \u0018i\u0014=WPOA", "5dc\u001ab+NZ\u0019", "u(;<e.\bY#\u0003\u0004(*\u0007\u0016//\b2zP\b\u0017`/y\rL}%\u000b", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "9nX; *H`\u0019"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class KoinDefinition<R> {
    private final InstanceFactory<R> factory;
    private final Module module;

    public KoinDefinition(Module module, InstanceFactory<R> factory) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.module = module;
        this.factory = factory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KoinDefinition copy$default(KoinDefinition koinDefinition, Module module, InstanceFactory instanceFactory, int i2, Object obj) {
        if ((1 & i2) != 0) {
            module = koinDefinition.module;
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            instanceFactory = koinDefinition.factory;
        }
        return koinDefinition.copy(module, instanceFactory);
    }

    public final Module component1() {
        return this.module;
    }

    public final InstanceFactory<R> component2() {
        return this.factory;
    }

    public final KoinDefinition<R> copy(Module module, InstanceFactory<R> factory) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new KoinDefinition<>(module, factory);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KoinDefinition)) {
            return false;
        }
        KoinDefinition koinDefinition = (KoinDefinition) obj;
        return Intrinsics.areEqual(this.module, koinDefinition.module) && Intrinsics.areEqual(this.factory, koinDefinition.factory);
    }

    public final InstanceFactory<R> getFactory() {
        return this.factory;
    }

    public final Module getModule() {
        return this.module;
    }

    public int hashCode() {
        return (this.module.hashCode() * 31) + this.factory.hashCode();
    }

    public String toString() {
        return "KoinDefinition(module=" + this.module + ", factory=" + this.factory + ')';
    }
}
