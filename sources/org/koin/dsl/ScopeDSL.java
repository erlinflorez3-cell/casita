package org.koin.dsl;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.module.KoinDslMarker;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
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
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u000bnjO0LeN/ZS@\u000fs{J$c$\bCCU0}*\teNogtJ`\u0010YƤ6\u0016'il\\e|k\u0012'2ppO7[qU9\u000fwȥ\t @&\u0001I\u0013\n20X\u0012\u0007z\nV:\u001cPDví`\u0018c\u0004J\u001a\f>.\r6^}MdI\u001d\u0005@51\u0010\u0002c^)o0+\\\u001dHd';\u0007q ;@}@C3<\t\u0017Tk?IJPNݾl'-=\u0010֜]ΥWÜ\\d9b%c\u0003(l\u0005\u0018k:1KSi֟^\u0019>v+\u0004\u0013<\u0012\u001a\u001e)^-[\u001b\u0017/\u00149\u0003\u007fka`\u0004nB.\nq8'%.C;;+f\u0018li'7=\f\u0007\u001d\u001ei\fM2ƟX\u000ef'aƟ}ϼ0҅\u0011LVP\"Ykpձth\nÏ\u001c2M\u0005=\u0002a=%%O[g$\u074co\bPֳ\u007fx\u000bgv[֢RMH%tޅgX\bɚ^X"}, d2 = {"\u001ana4\"2HW\"Hyl3Fv-o\u000b(Z.gl", "", "Ab^=X\u0018NO \u0003{b,\n", "\u001ana4\"2HW\"Hxh9|R;u{/\u007fA\u0005\u0017$\u0011[\u001e8})6]}-\r", ";nSB_,", "\u001ana4\"2HW\"Hxh9|R7o~8\u0003@J~!F\u007f\u0015<L", "uK^?ZuD]\u001d\bD\\6\n\txq\u0010$\u0003D\u0002\u001b\u0017T9yLr,9Z\u0002 DC|8ZE\u0005q>\"\u001e2_C\u0014cuV\u0001&WSNuD\\qM\u001b\u00120Q?", "5dc\u001ab+NZ\u0019", "u(;<e.\bY#\u0003\u0004(*\u0007\u0016//\b2zP\b\u0017`/y\rL}%\u000b", "5dc V6IS\u0005\u000fve0}\r/r", "u(;<e.\bY#\u0003\u0004(*\u0007\u0016//\f8wG\u0005\u0018\u001bG|W(\u0007!<]~$7zk", "4`RAb9R", "\u001ana4\"2HW\"Hxh9|R.e\u0001,\u0005D\u0010\u001b!P9sFz.\u0014Y~$@q%2WL\u0011", "\"", "?tP9\\-BS&", "2dU6a0MW#\b", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "\u001ana4\"2HW\"Hxh9|R.e\u0001,\u0005D\u0010\u001b!P9l<w)>]\r$Avk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "Ab^=X+", "9nX; *H`\u0019"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ScopeDSL {
    private final Module module;
    private final Qualifier scopeQualifier;

    public ScopeDSL(Qualifier scopeQualifier, Module module) {
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Intrinsics.checkNotNullParameter(module, "module");
        this.scopeQualifier = scopeQualifier;
        this.module = module;
    }

    public static /* synthetic */ KoinDefinition factory$default(ScopeDSL scopeDSL, Qualifier qualifier, Function2 definition, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            qualifier = null;
        }
        Intrinsics.checkNotNullParameter(definition, "definition");
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, definition, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return new KoinDefinition(module, factoryInstanceFactory);
    }

    public static /* synthetic */ KoinDefinition scoped$default(ScopeDSL scopeDSL, Qualifier qualifier, Function2 definition, int i2, Object obj) {
        Qualifier qualifier2 = qualifier;
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            qualifier2 = null;
        }
        Intrinsics.checkNotNullParameter(definition, "definition");
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Scoped;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier2, definition, kind, listEmptyList));
        scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory);
        return new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory);
    }

    public final /* synthetic */ <T> KoinDefinition<T> factory(Qualifier qualifier, Function2<? super Scope, ? super ParametersHolder, ? extends T> definition) {
        Intrinsics.checkNotNullParameter(definition, "definition");
        Module module = getModule();
        Qualifier scopeQualifier = getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, definition, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return new KoinDefinition<>(module, factoryInstanceFactory);
    }

    public final Module getModule() {
        return this.module;
    }

    public final Qualifier getScopeQualifier() {
        return this.scopeQualifier;
    }

    public final /* synthetic */ <T> KoinDefinition<T> scoped(Qualifier qualifier, Function2<? super Scope, ? super ParametersHolder, ? extends T> definition) {
        Intrinsics.checkNotNullParameter(definition, "definition");
        Qualifier scopeQualifier = getScopeQualifier();
        Kind kind = Kind.Scoped;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, definition, kind, listEmptyList));
        getModule().indexPrimaryType(scopedInstanceFactory);
        return new KoinDefinition<>(getModule(), scopedInstanceFactory);
    }
}
