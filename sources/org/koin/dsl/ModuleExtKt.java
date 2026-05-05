package org.koin.dsl;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.koin.core.annotation.KoinReflectAPI;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.InstanceBuilderKt;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d̉=!4i\bӵLc\u0003İI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljA0RnP\u008cj|8ş\u0004\u0002D&k$8CiT:\u0006(ޛ]N}f\u0017J\t\fk\u000f4\u0018)r2Ic{u\u0014%1ps\u0006ݔS\bpGe\r<\u0015\"B\"~y3\u007f:2NƵ\u0005zYJ4\u0012^A\u0019:\u0001\u000f}\r \u0012\u0014A8\u00034[\u0016RfNr]H5;\u0003\u0018I\u0015ϓe݇\u0001U"}, d2 = {"4`RAb9R", "\u001ana4\"2HW\"Hxh9|R.e\u0001,\u0005D\u0010\u001b!P9sFz.\u0014Y~$@q%2WL\u0011", "\"", "", "\u001ana4\"2HW\"Hxh9|R7o~8\u0003@J~!F\u007f\u0015<L", "?tP9\\-BS&", "\u001ana4\"2HW\"Hxh9|R;u{/\u007fA\u0005\u0017$\u0011[\u001e8})6]}-\r", "Ah]4_,", "1qT.g,(\\\u0007\u000evk;", "", "9nX; *H`\u0019"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ModuleExtKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.dsl.ModuleExtKt$factory$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d<;!&i\u000eӵLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0012\u0006ј~j\u007f/dmN\u008c`R@\u000e\u0014{b$\u0004$ DkY(\u007f:\t}Q.oĔN\\\u0011G\u001d\u000b"}, d2 = {"\n`]<a@F])\rS", "\"", "", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", ">`a.`:", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass1<T> extends Lambda implements Function2<Scope, ParametersHolder, T> {
        public static final AnonymousClass1 INSTANCE;

        static {
            Intrinsics.needClassReification();
            INSTANCE = new AnonymousClass1();
        }

        public AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final T invoke(Scope factory, ParametersHolder params) {
            Intrinsics.checkNotNullParameter(factory, "$this$factory");
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) InstanceBuilderKt.newInstance(factory, Reflection.getOrCreateKotlinClass(Object.class), params);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.dsl.ModuleExtKt$single$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d<;!&i\u000eӵLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0012\u0006ј~j\u007f/dmN\u008c`R@\u000e\u0014{b$\u0004$ DkY(\u007f:\t}Q.oĔN\\\u0011G\u001d\u000b"}, d2 = {"\n`]<a@F])\rS", "\"", "", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", ">`a.`:", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class C14871<T> extends Lambda implements Function2<Scope, ParametersHolder, T> {
        public static final C14871 INSTANCE;

        static {
            Intrinsics.needClassReification();
            INSTANCE = new C14871();
        }

        public C14871() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final T invoke(Scope single, ParametersHolder params) {
            Intrinsics.checkNotNullParameter(single, "$this$single");
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) InstanceBuilderKt.newInstance(single, Reflection.getOrCreateKotlinClass(Object.class), params);
        }
    }

    @Deprecated(message = "\u00046dtz\bT[]W:\u007fS\u0016@S`\f\u00125Dn\rh\u0006X.yT4*gk`sTfKnx*\u0011\u001f")
    @InterfaceC1492Gx
    @KoinReflectAPI
    public static final /* synthetic */ <T> KoinDefinition<T> factory(Module module, Qualifier qualifier) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.needClassReification();
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, anonymousClass1, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return new KoinDefinition<>(module, factoryInstanceFactory);
    }

    public static /* synthetic */ KoinDefinition factory$default(Module module, Qualifier qualifier, int i2, Object obj) {
        Qualifier qualifier2 = qualifier;
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            qualifier2 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.needClassReification();
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier2, anonymousClass1, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return new KoinDefinition(module, factoryInstanceFactory);
    }

    @Deprecated(message = "\u00046dtz\bT[]W:\u007fS\u0016@S`\f\u00125Dn\rh\u0006X.yT47ovSpG<b(\u001d9\n")
    @InterfaceC1492Gx
    @KoinReflectAPI
    public static final /* synthetic */ <T> KoinDefinition<T> single(Module module, Qualifier qualifier, boolean z2) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.needClassReification();
        C14871 c14871 = C14871.INSTANCE;
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, c14871, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (z2 || module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return new KoinDefinition<>(module, singleInstanceFactory2);
    }

    public static /* synthetic */ KoinDefinition single$default(Module module, Qualifier qualifier, boolean z2, int i2, Object obj) {
        Qualifier qualifier2 = qualifier;
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            qualifier2 = null;
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            z2 = false;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.needClassReification();
        C14871 c14871 = C14871.INSTANCE;
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier2, c14871, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (z2 || module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return new KoinDefinition(module, singleInstanceFactory2);
    }
}
