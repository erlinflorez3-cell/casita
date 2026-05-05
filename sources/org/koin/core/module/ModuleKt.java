package org.koin.core.module;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.error.DefinitionOverrideException;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.InstanceFactory;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
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
@Metadata(bv = {}, d1 = {"Я^\u001d̉=!4i\bDJc|\u0004W\u00068é6B\u0015\"4\u0012\u000e\u0007njO0Le^.ZS@\u000fs{:$c$\bCC٥\"}8\tWȞog|jb\u000bY\u000f\u000eǝ\u0001j:g]ތe\u0012\u001d2JģG3coEʠhtD\u0011(288\u0002\u0005\u0007\u001bB\"\u001e͌\u0013I[\u000e\"0\u0007phQ-Q\u000b܅ \u0006T\u001f1&bg\\7`ns9]%3\u0011HT5bH\u001e]\u000fVTU\u0012\u0007c.+n=E\u00175SI\u0007\u0001_(\tOsM\u0005/'\u00062ʁwW<`0\u001a\u001b+]\u0016urT^KıfѨ&˃g;YZ&.\b|\f\r\u0003\u0004<\u0011GL4Ʀ(f\u001e\rc|xSNQ\u001a`X~)cf>+\u0006A.Q<vSq;GSG}\u0015\rL)\u0011p1[\u001b\u000e\u000f\u0019\u0004Z\bSAQ\u0007='Ŭ]=s\f!f\u00103\u001c0u\u0002uɍ\u0017ҽ\u0016¦O5G/9q\u0012JTg=\u0005\u000fusmX̲N\"\u0005\u0015g2\u000f\fhE|\u0007\u0002O\u0003Z\\8S\"b\n\u0016)#\"lwj&5\u0012^O\u0017ozOm\nk/\u0015;Bt{\u0010g9%3\u0014XӒ\u0014aX~DEBb\u0013a~B\u0002\u000e!٪.Ш1ʋ\u0003(\u0006\n\\T\u001c\u0015B? ,b;a#j&`\t.DQ|7o\tz(\u001dbF<\u0003\u00188%\u0011\u000fett\u007fg~JZ\u0013\u0011*;Xi9G>>\"GMC\"\u001f\u001e\u0002\u001a_m\\I\\lD\u0006\u0004\u000eH\u001c*;a/k#=\u0011Y6\u0010H]L!u\u0018ˮ\u0012\u0600z\u0002\u0002\u0012Aö^\u0016\u0007ϧtH"}, d2 = {"-eP0g6Kg|\b\tm(\u0006\u0007/F{&\u000bJ\u000e+", "\u001ana4\"2HW\"Hxh9|R3n\u000e7wI~\u0017`(k\fK\u00012I=\u0007.Fi\u001f,M$7iC(\"|7", "\"", "?tP9\\-BS&", "\u001ana4\"2HW\"Hxh9|R;u{/\u007fA\u0005\u0017$\u0011[\u001e8})6]}-\r", "2dU6a0MW#\b", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "\u001ana4\"2HW\"Hxh9|R.e\u0001,\u0005D\u0010\u001b!P9l<w)>]\r$Avk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "Ab^=X\u0018NO \u0003{b,\n", "-rR<c,=7\"\r\nZ5z\t\u0010a}7\u0006M\u0015", "\u001ana4\"2HW\"Hxh9|R3n\u000e7wI~\u0017`5m\u0018Gv$\u0019b\f/3v\u0014..?9z>+)>", "-rX;Z3>7\"\r\nZ5z\t\u0010a}7\u0006M\u0015", "\u001ana4\"2HW\"Hxh9|R3n\u000e7wI~\u0017`5s\u0017>}%\u0019b\f/3v\u0014..?9z>+)>", "4kPAg,G", "", "\u001ana4\"2HW\"Hxh9|R7o~8\u0003@J~!F\u007f\u0015<L", ";nSB_,L", "", "=uT?e0=Sx\f\bh9", "", "4`RAb9R", "\u001ana4\"2HW\"Hxh9|R3n\u000e7wI~\u0017`+x\u001cKr.3Y^\u001c5| ;a\u0019", ";`_=\\5@", "", "\u001ana4\"2HW\"Hxh9|R.e\u0001,\u0005D\u0010\u001b!P9qEu%H?}4\r", ">kd@", ";nSB_,", "9nX; *H`\u0019"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ModuleKt {
    public static final /* synthetic */ <T> FactoryInstanceFactory<T> _factoryInstanceFactory(Qualifier qualifier, Function2<? super Scope, ? super ParametersHolder, ? extends T> definition, Qualifier scopeQualifier) {
        Intrinsics.checkNotNullParameter(definition, "definition");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new FactoryInstanceFactory<>(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, definition, kind, listEmptyList));
    }

    public static /* synthetic */ FactoryInstanceFactory _factoryInstanceFactory$default(Qualifier qualifier, Function2 definition, Qualifier qualifier2, int i2, Object obj) {
        StringQualifier scopeQualifier = qualifier2;
        Qualifier qualifier3 = qualifier;
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            qualifier3 = null;
        }
        if ((i2 & 4) != 0) {
            scopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        }
        Intrinsics.checkNotNullParameter(definition, "definition");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier3, definition, kind, listEmptyList));
    }

    public static final /* synthetic */ <T> ScopedInstanceFactory<T> _scopedInstanceFactory(Qualifier qualifier, Function2<? super Scope, ? super ParametersHolder, ? extends T> definition, Qualifier scopeQualifier) {
        Intrinsics.checkNotNullParameter(definition, "definition");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Kind kind = Kind.Scoped;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new ScopedInstanceFactory<>(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, definition, kind, listEmptyList));
    }

    public static /* synthetic */ ScopedInstanceFactory _scopedInstanceFactory$default(Qualifier qualifier, Function2 definition, Qualifier scopeQualifier, int i2, Object obj) {
        Qualifier qualifier2 = qualifier;
        if ((i2 + 1) - (i2 | 1) != 0) {
            qualifier2 = null;
        }
        Intrinsics.checkNotNullParameter(definition, "definition");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Kind kind = Kind.Scoped;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new ScopedInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier2, definition, kind, listEmptyList));
    }

    public static final /* synthetic */ <T> SingleInstanceFactory<T> _singleInstanceFactory(Qualifier qualifier, Function2<? super Scope, ? super ParametersHolder, ? extends T> definition, Qualifier scopeQualifier) {
        Intrinsics.checkNotNullParameter(definition, "definition");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new SingleInstanceFactory<>(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, definition, kind, listEmptyList));
    }

    public static /* synthetic */ SingleInstanceFactory _singleInstanceFactory$default(Qualifier qualifier, Function2 definition, Qualifier qualifier2, int i2, Object obj) {
        StringQualifier scopeQualifier = qualifier2;
        Qualifier qualifier3 = qualifier;
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            qualifier3 = null;
        }
        if ((i2 & 4) != 0) {
            scopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        }
        Intrinsics.checkNotNullParameter(definition, "definition");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new SingleInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier3, definition, kind, listEmptyList));
    }

    public static final Set<Module> flatten(List<Module> modules) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        flatten$flat(modules, linkedHashSet);
        return linkedHashSet;
    }

    private static final void flatten$flat(List<Module> list, Set<Module> set) {
        for (Module module : list) {
            set.add(module);
            flatten$flat(module.getIncludedModules(), set);
        }
    }

    public static final void overrideError(InstanceFactory<?> factory, String mapping) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        throw new DefinitionOverrideException("Already existing definition for " + factory.getBeanDefinition() + " at " + mapping);
    }

    public static final List<Module> plus(List<Module> list, Module module) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(module, "module");
        return CollectionsKt.plus((Collection) list, (Iterable) CollectionsKt.listOf(module));
    }
}
