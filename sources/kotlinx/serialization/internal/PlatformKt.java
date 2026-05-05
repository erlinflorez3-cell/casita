package kotlinx.serialization.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationException;
import yg.InterfaceC1492Gx;
import yg.Kl;

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
@Metadata(bv = {}, d1 = {"ЯN\u001d̉=!4i\bӵLc\u0003İIي8\u000bDB\u0007Ӭ4\u0012\u0006\u0016nj?0LeV7Zݷ2\u000f\u0002{<$a*yCI[\"Ԃ*\t]dogtLb\u000bQ\u000e\u000e\u0016~k4Ikxe\u0012%2JoE4e=Kʠx|F\u000702h8\u0010\u0004/\u0019JN\u0016͌\tCs\f@1pxHT%Q\u0015\u001a\u0018\u0007l#1>jkfFXxc9?+\u0013mRP=^^}{\ftYG\u0015\u0007e.-V6c\u0016SRI\u0007қ_?\u0011E\nQ\u0013o?'YQ$aDa\u0018\u001a%-_\r\fsTfKĩx\u001c56geaO<) ~\f\rB\u0005<\tmHFO(r \u0016Cv\u0003S\u0007P\u0018]p~\u001bg<Ѝ3\u007f[+g\u001c\u000fWq=)N}{3\u0017dŀ\u0019:/hl\u0016p\u0017+T>QGPn<hT\u0010ԯKm,p\u0011\u0003R\n@I\u0010/B\u0011\\\u001aUWi=;1{\u000eNCw~\u0015dxU\u007fQvAPmD<J\u0011\u001c^Tf\u001bj~U\u0007+W۳ɟX\u0007\f\u000e+kj\u0005T)5\u0012^O/i\u0001L\f\tE5lŽgn\u0014\u000e\u0006:\u00079ESs\u0010(R%\u001eo\\p\tpvR_\u0012Yl026Xl&v*E|\u000bA7_y,8<3/[CI1\u001d\tˆҴ\r_hv(\u001fbB<\ty&\u0005\tGP\u000bo\u0010m~̢:|\t\"[By;)(e\"/4+&M~\f\"UwdO\\n&u\u001c{6\u0015H8q5CП\u001d~Q20.mR\u0003gaMX')\u007f@\u000fS\r<x j7,\u0001lP֢b\u0017J|nt3\b+\u007f(fv~Uul\u000b\nQ\u0010\u0380\tʾ@NF\u0011\u001d2,6\u0019oP\u0005]-q<M\u001a\u0006&G\u0015\u0010p0۱4\u0012\u0005\u001d<\rm\u0014.s\u00166bg\\`:XO_˚L\"Ll1Cpp\b\nR\tz\raK\bd\tpFd#/,n'2\u0013ߞd[b\u0013\u001e~\\4o,\u0004CD\u0014\rFk\u0011emu\u0006\u0006K\u000b\u0013j\u0015\u0010Κ\n1\u0017\u0012J>H\\gd\u00190LsF9\b;z\u0013J\"<4ZV0\u000fSTo\u0007>\u0005Fʋw\u001d%MZsip6X\t\\\\I3c\fǷ9s\u000f\u001b'9.zE1K\u000btYOi8ܬa\u001d1\u001b\u0019P\u001fn+*Rqa\u001d>WG\u000bmmSK\u00126JdW\fTu\u001c:(|c_v:i[\u001f\u007f\u000f6n\red\u0015d%\u001c-ŚƬ&)\r\u001cխ\u0012^"}, d2 = {"7me<^,,S&\u0003ve0\u0012\t<O\t\u0006\u0006H\f\u0013 Ky\u0017", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`|5o\u001b@r,9n}-\r", "\"", "", "8B[.f:", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "/qV@", "", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sU\u001ebF\u000b&\u001eKx!\u0006\u0005%B]y';\u0003\u0012=QMD5\u001a\f\u0015ue5\u000egAN\u0004|\u000b3T6kYvF'[h\u000e[/\t\f]V }HA(Q\u00127\u0002Hl|\u0013\u001a#5wF", "7rA2Y,KS\"|z:9\n\u0005C", "", "@n^A63:a'", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "1n\\=T5B]\"h\bG<\u0004\u0010", "1n\\=\\3>R\u0007~\bb(\u0004\rDe\r\f\u0004K\b", "1n]@g9NQ(lzk0x\u00103z\u007f5\\J\u000ex\u001bXo\u0017+\u000b055\u000b\"E", "uKZ<g3B\\b\fz_3|\u0007>/e\u0006\u0003<\u000f%l=V\u0014F\u0006,9b\u0011iEm#2IJ?\u00010-\u0019rj\u0003lQ,[z#NPc,i(6$\u001a\u001ci\u0015R4 NgA1r@>#\u001d(X\u0006EqJq\u0004\u000eBnlIZ%G\u0007j", "1qT.g,\u001e\\)\u0007h^9\u0001\u00056i\u0015(\t", "4h]1B)CS\u0017\u000eh^9\u0001\u00056i\u0015(\t", "5dc\u0010[,<Y\u0019}", "7mS2k", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$D}\u001cC\u0001\n\u0006}!>[G\n4r\u0016,\\\u0019", "", "7mc2e-:Q\u0019lzk0x\u00103z\u007f5", "7r=<g\bG\\#\u000evm,{", "7r?<_@F]&\n}b*j\t<i{/\u007fU\u0001$", ">kPAY6K[\u0007\nz\\0}\r-S\u007f5\u007f<\b\u001b,G|vF\u0006\u00125[\u0002.Fm#.L", "", "Ada6T3Bh\u0019\fch;i\t1i\u000e7{M\u0001\u0016", "Bn=.g0OSt\f\bZ@`\u0011:l", "\u0013", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "3B[.f:", "uKY.i(\bc(\u0003\u0002(\b\n\u0016+yf,\nOV}\u001dQ~\u0015@\u007fnBY~'7k%w3!BgB,j,W \f_=J@.CUPuFOw=\u0012!0", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PlatformKt {
    private static final Object companionOrNull(Class<?> cls) {
        try {
            Field declaredField = cls.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T> KSerializer<T> compiledSerializerImpl(KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        return constructSerializerForGivenTypeArgs(kClass, (KSerializer<Object>[]) new KSerializer[0]);
    }

    public static final <T> KSerializer<T> constructSerializerForGivenTypeArgs(Class<T> cls, KSerializer<Object>... args) throws IllegalAccessException, InvocationTargetException {
        Object obj;
        Field field;
        KSerializer<T> kSerializerInterfaceSerializer;
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        if (cls.isEnum() && isNotAnnotated(cls)) {
            return createEnumSerializer(cls);
        }
        if (cls.isInterface() && (kSerializerInterfaceSerializer = interfaceSerializer(cls)) != null) {
            return kSerializerInterfaceSerializer;
        }
        KSerializer<T> kSerializerInvokeSerializerOnCompanion = invokeSerializerOnCompanion(cls, (KSerializer[]) Arrays.copyOf(args, args.length));
        if (kSerializerInvokeSerializerOnCompanion != null) {
            return kSerializerInvokeSerializerOnCompanion;
        }
        KSerializer<T> kSerializerFindObjectSerializer = findObjectSerializer(cls);
        if (kSerializerFindObjectSerializer != null) {
            return kSerializerFindObjectSerializer;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            Intrinsics.checkNotNullExpressionValue(declaredClasses, "declaredClasses");
            Class<?>[] clsArr = declaredClasses;
            int length = clsArr.length;
            int i2 = 0;
            Class<?> cls2 = null;
            boolean z2 = false;
            while (true) {
                if (i2 < length) {
                    Class<?> cls3 = clsArr[i2];
                    if (Intrinsics.areEqual(cls3.getSimpleName(), "$serializer")) {
                        if (z2) {
                            break;
                        }
                        z2 = true;
                        cls2 = cls3;
                    }
                    i2++;
                } else if (!z2) {
                }
            }
            cls2 = null;
            Class<?> cls4 = cls2;
            obj = (cls4 == null || (field = cls4.getField("INSTANCE")) == null) ? null : field.get(null);
        } catch (NoSuchFieldException unused) {
        }
        KSerializer<T> kSerializer = obj instanceof KSerializer ? (KSerializer) obj : null;
        if (kSerializer != null) {
            return kSerializer;
        }
        if (isPolymorphicSerializer(cls)) {
            return new PolymorphicSerializer(JvmClassMappingKt.getKotlinClass(cls));
        }
        return null;
    }

    public static final <T> KSerializer<T> constructSerializerForGivenTypeArgs(KClass<T> kClass, KSerializer<Object>... args) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        return constructSerializerForGivenTypeArgs(JvmClassMappingKt.getJavaClass((KClass) kClass), (KSerializer<Object>[]) Arrays.copyOf(args, args.length));
    }

    private static final <T> KSerializer<T> createEnumSerializer(Class<T> cls) {
        T[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        Intrinsics.checkNotNullExpressionValue(canonicalName, "canonicalName");
        Intrinsics.checkNotNull(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new EnumSerializer(canonicalName, (Enum[]) enumConstants);
    }

    private static final <T> KSerializer<T> findObjectSerializer(Class<T> cls) throws IllegalAccessException, InvocationTargetException {
        Field[] declaredFields = cls.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "declaredFields");
        Field[] fieldArr = declaredFields;
        int length = fieldArr.length;
        Field field = null;
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            if (i2 >= length) {
                if (!z2) {
                    break;
                }
            } else {
                Field field2 = fieldArr[i2];
                Field field3 = field2;
                if (Intrinsics.areEqual(field3.getName(), "INSTANCE") && Intrinsics.areEqual(field3.getType(), cls) && Modifier.isStatic(field3.getModifiers())) {
                    if (z2) {
                        break;
                    }
                    z2 = true;
                    field = field2;
                }
                i2++;
            }
        }
        field = null;
        Field field4 = field;
        if (field4 == null) {
            return null;
        }
        Object obj = field4.get(null);
        Method[] methods = cls.getMethods();
        Intrinsics.checkNotNullExpressionValue(methods, "methods");
        Method[] methodArr = methods;
        int length2 = methodArr.length;
        Method method = null;
        int i3 = 0;
        boolean z3 = false;
        while (true) {
            if (i3 >= length2) {
                if (!z3) {
                    break;
                }
            } else {
                Method method2 = methodArr[i3];
                Method method3 = method2;
                if (Intrinsics.areEqual(method3.getName(), "serializer")) {
                    Class<?>[] parameterTypes = method3.getParameterTypes();
                    Intrinsics.checkNotNullExpressionValue(parameterTypes, "it.parameterTypes");
                    if (parameterTypes.length == 0 && Intrinsics.areEqual(method3.getReturnType(), KSerializer.class)) {
                        if (z3) {
                            break;
                        }
                        z3 = true;
                        method = method2;
                    }
                }
                i3++;
            }
        }
        method = null;
        Method method4 = method;
        if (method4 == null) {
            return null;
        }
        Object objInvoke = method4.invoke(obj, new Object[0]);
        if (objInvoke instanceof KSerializer) {
            return (KSerializer) objInvoke;
        }
        return null;
    }

    public static final <T> T getChecked(T[] tArr, int i2) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr[i2];
    }

    public static final boolean getChecked(boolean[] zArr, int i2) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr[i2];
    }

    private static final <T> KSerializer<T> interfaceSerializer(Class<T> cls) {
        Serializable serializable = (Serializable) Kl.Kd(cls, Serializable.class);
        if (serializable == null || Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(serializable.with()), Reflection.getOrCreateKotlinClass(PolymorphicSerializer.class))) {
            return new PolymorphicSerializer(JvmClassMappingKt.getKotlinClass(cls));
        }
        return null;
    }

    private static final <T> KSerializer<T> invokeSerializerOnCompanion(Class<?> cls, KSerializer<Object>... kSerializerArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        Object objCompanionOrNull = companionOrNull(cls);
        if (objCompanionOrNull == null) {
            return null;
        }
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                clsArr = new Class[length];
                for (int i2 = 0; i2 < length; i2++) {
                    clsArr[i2] = KSerializer.class;
                }
            }
            Object objInvoke = objCompanionOrNull.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(objCompanionOrNull, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (objInvoke instanceof KSerializer) {
                return (KSerializer) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause == null) {
                throw e2;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e2.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    private static final <T> boolean isNotAnnotated(Class<T> cls) {
        return Kl.Kd(cls, Serializable.class) == null && Kl.Kd(cls, Polymorphic.class) == null;
    }

    private static final <T> boolean isPolymorphicSerializer(Class<T> cls) {
        if (Kl.Kd(cls, Polymorphic.class) != null) {
            return true;
        }
        Serializable serializable = (Serializable) Kl.Kd(cls, Serializable.class);
        return serializable != null && Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(serializable.with()), Reflection.getOrCreateKotlinClass(PolymorphicSerializer.class));
    }

    public static final boolean isReferenceArray(KClass<Object> rootClass) {
        Intrinsics.checkNotNullParameter(rootClass, "rootClass");
        return JvmClassMappingKt.getJavaClass((KClass) rootClass).isArray();
    }

    public static final Void platformSpecificSerializerNotRegistered(KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Platform_commonKt.serializerNotRegistered(kClass);
        throw new KotlinNothingValueException();
    }

    public static final Void serializerNotRegistered(Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        throw new SerializationException(Platform_commonKt.notRegisteredMessage((KClass<?>) JvmClassMappingKt.getKotlinClass(cls)));
    }

    public static final <T, E extends T> E[] toNativeArrayImpl(ArrayList<E> arrayList, KClass<T> eClass) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(eClass, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) JvmClassMappingKt.getJavaClass((KClass) eClass), arrayList.size());
        Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        E[] eArr = (E[]) arrayList.toArray((Object[]) objNewInstance);
        Intrinsics.checkNotNullExpressionValue(eArr, "toArray(java.lang.reflec….java, size) as Array<E>)");
        return eArr;
    }
}
