package org.koin.core.instance;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.annotation.KoinReflectAPI;
import org.koin.core.error.NoBeanDefFoundException;
import org.koin.core.logger.Level;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.scope.Scope;
import org.koin.ext.KClassExtKt;
import org.koin.mp.KoinPlatformTimeTools;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d̉=!,˛\bӵLc\u0003\u0013Iي8\u000bDB\u0007\"2\u0013\u007f\u0007|jAӄLe^.ZS0\u0011s{J$c$wFS~(Ԃ:\t}M\u0018q|Jr\u0011S\u0011\u0016\u0016'iZJ\u0006\u0005k\u0014':RsE2]ok8\u000fw|\u0005ڶ6\"F}\u001d.(/`\u0016\u0007|SK:\u0011^A!B`\u000fe\t*\u0012\f?N\u0004N`uTNH\u001bdj31\u000b\u0002B|0&0ƊQ\rT^?<\u0005l6+\u0007CU\u001b+م\u0011\u0013z[m\u0002gqk\f\u0019158ayg8h\u007fZ!Y]=a\u00015t\u0005\u007fiR,˦ScY`&N\u0006\u0006\u0014\r\u0003\u0010.\u000e-Ξ<90e0\u000eas\u001bSnW2dH\u007f\trN\u0017S\tyڇ?ӸjQoMϳRJ"}, d2 = {"1qT.g,\"\\'\u000evg*|", "", "/qV@", "", "1n]@g9NQ(\t\b", "\u001aiPCTuEO\"\u0001Dk,}\u0010/c\u000fqYJ\n%&T\u007f\fK\u00012\u000b", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q'\u0006\u0013(C9\u00158\u007f'~f}!>m\u0014=\u0017!EtB-\"x_H\u0011p\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "5dc\u000ee.N[\u0019\b\nl", "Ab^=X", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", ">`a.`,MS&\r", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "uKY.i(\bZ\u0015\b|(9|\n6e}7E\u001e\u000b %V|\u001e:\u0006/B/d*Do_4WGD52(\"h+G\u0005m7N@\u0015EVY,29|J\u0016[`\u0018R4V\u0003cN$8O3,\u00044I\u0011;uJv\u0012\u001b1rpQV\u001dU\\\u001f|@)u\u001c\u001dU`L=V^sk\bh\u001f&$7)\u0014o(p", "<df\u0016a:MO\"|z", "\"", "9B[.f:", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", ">`a.`:", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]+?h\u0005$@7#.NJ;iCgzFh5\u0015q\u00025\u00014I\u0016T6`[<;\u001e\u001fZWY'\u001a\u0001aA3nQ\u0001\n\u00049E\n;w\u0001\u0019$p?qoBce\u000b`\u001aqR%2MUh{\u0011+Bg*b\u001b5", "2dU\u001dT9:['", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@", "9nX; *H`\u0019"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class InstanceBuilderKt {
    private static final Object createInstance(Object[] objArr, Constructor<? extends Object> constructor) {
        Object objNewInstance = objArr.length == 0 ? constructor.newInstance(new Object[0]) : constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        Intrinsics.checkNotNull(objNewInstance);
        return objNewInstance;
    }

    private static final Object[] getArguments(Constructor<?> constructor, Scope scope, final ParametersHolder parametersHolder) throws NoBeanDefFoundException {
        int length = constructor.getParameterTypes().length;
        if (length == 0) {
            return new Object[0];
        }
        Object[] objArr = new Object[length];
        for (int i2 = 0; i2 < length; i2++) {
            objArr[i2] = Unit.INSTANCE;
        }
        for (int i3 = 0; i3 < length; i3++) {
            Class<?> cls = constructor.getParameterTypes()[i3];
            Intrinsics.checkNotNull(cls);
            KClass<?> kotlinClass = JvmClassMappingKt.getKotlinClass(cls);
            Object orNull = scope.getOrNull(kotlinClass, null, new Function0<ParametersHolder>() { // from class: org.koin.core.instance.InstanceBuilderKt.getArguments.1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final ParametersHolder invoke() {
                    return parametersHolder;
                }
            });
            if (orNull == null && (orNull = parametersHolder.getOrNull(kotlinClass)) == null) {
                throw new NoBeanDefFoundException("No definition found for class '" + kotlinClass + '\'');
            }
            objArr[i3] = orNull;
        }
        return objArr;
    }

    @Deprecated(message = "\u000eU\u0005C1f\u001a]dL+\u000fY$:\u000e=<qf\u000e{KV{V\u0001oQu8kl")
    @InterfaceC1492Gx
    @KoinReflectAPI
    public static final <T> T newInstance(Scope scope, KClass<T> kClass, ParametersHolder params) throws NoBeanDefFoundException {
        Object[] arguments;
        T t2;
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(params, "params");
        if (scope.getLogger().getLevel() == Level.DEBUG) {
            scope.getLogger().debug("|- creating new instance - " + KClassExtKt.getFullName(kClass));
        }
        Constructor<?>[] constructors = JvmClassMappingKt.getJavaClass((KClass) kClass).getConstructors();
        Intrinsics.checkNotNullExpressionValue(constructors, "getConstructors(...)");
        Constructor constructor = (Constructor) ArraysKt.firstOrNull(constructors);
        if (constructor == null) {
            throw new IllegalStateException(("No constructor found for class '" + KClassExtKt.getFullName(kClass) + '\'').toString());
        }
        if (scope.getLogger().getLevel() == Level.DEBUG) {
            Pair pair = new Pair(getArguments(constructor, scope, params), Double.valueOf((KoinPlatformTimeTools.INSTANCE.getTimeInNanoSeconds() - KoinPlatformTimeTools.INSTANCE.getTimeInNanoSeconds()) / 1000000.0d));
            Pair pair2 = new Pair(pair.component1(), Double.valueOf(((Number) pair.component2()).doubleValue()));
            arguments = (Object[]) pair2.component1();
            scope.getLogger().debug("|- got arguments in " + ((Number) pair2.component2()).doubleValue() + " ms");
        } else {
            arguments = getArguments(constructor, scope, params);
        }
        if (scope.getLogger().getLevel() == Level.DEBUG) {
            Pair pair3 = new Pair(createInstance(arguments, constructor), Double.valueOf((KoinPlatformTimeTools.INSTANCE.getTimeInNanoSeconds() - KoinPlatformTimeTools.INSTANCE.getTimeInNanoSeconds()) / 1000000.0d));
            Pair pair4 = new Pair(pair3.component1(), Double.valueOf(((Number) pair3.component2()).doubleValue()));
            t2 = (T) pair4.component1();
            scope.getLogger().debug("|- created instance in " + ((Number) pair4.component2()).doubleValue() + " ms");
        } else {
            t2 = (T) createInstance(arguments, constructor);
        }
        Intrinsics.checkNotNull(t2, "null cannot be cast to non-null type T of org.koin.core.instance.InstanceBuilderKt.newInstance");
        return t2;
    }

    @Deprecated(message = "\u000eU\u0005C1f\u001a]dL+\u000fY$:\u000e=<qf\u000e{KV{V\u0001oQu8kl")
    @InterfaceC1492Gx
    @KoinReflectAPI
    public static final /* synthetic */ <T> T newInstance(Scope scope, ParametersHolder defParams) {
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(defParams, "defParams");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) newInstance(scope, Reflection.getOrCreateKotlinClass(Object.class), defParams);
    }

    public static /* synthetic */ Object newInstance$default(Scope scope, ParametersHolder defParams, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            defParams = ParametersHolderKt.emptyParametersHolder();
        }
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(defParams, "defParams");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return newInstance(scope, Reflection.getOrCreateKotlinClass(Object.class), defParams);
    }
}
