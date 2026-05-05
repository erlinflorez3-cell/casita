package com.braze.support;

import bo.app.l70;
import bo.app.m70;
import bo.app.n70;
import bo.app.o70;
import bo.app.p70;
import bo.app.q70;
import bo.app.r70;
import com.braze.support.BrazeLogger;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176Ȑ\u0007\":0\u007f\u0007|jA0JeP.`\\2\u000fq{<$i3yCAU\"}8\tWNmjvJp\u000bK\u000f\f\u0018~͛,_ǁ)]@\u000erGu?ݯQoK9))D\u00068487(\u00041\u001e8J(v)F{\u001c\u00180NtR\\\u001dS\u0015\u001e\"\u0006D!/$\u000bl~DNlkAG+\u0013mRP=^^{{\u0012\u000f\u00105\u0015\u000faL4p;C\u001f=S1\n\u0003_M\u000eWqk\b\u0019C5/a\u0002g@^~$\u001b;O\u0013^\t%\u000b\u000b\u007fl,-;OiLf\rV}A\u0001Ɂ@\u0004\u001c\u0013o\n<;2h\u001e\ra\u0004#[N`\u001abR\u007f\u0001bd\u001dU\u0004A6Q\u001b\u0015T\u0012W'RO\n\u0015\u0017$\"\u0011t1[Z\u000fv\u0014IZ&]QWP=NO XksJpĊ\u0006*\u0012A\u0010==\n)0-$eji'/u\u001aHrj'\tnski\u0001Kp>|\u001aO8\u0019\u0016`Ct\u000b{PZYB\u0010{\"\u0003\u0013\u001e\u000e# bxR S\u0016\u0015TŹmj[oRf=yO[\u0005j<fifAEig aXwBElf\u0013c~B\u0002\u000f\u000bx6&JVz\u001a}zTT\u001c\u00138@\b\u001bb2_%|\u001bX\u0003$CW{7e!mʐ\u0003TA5K'2\b!\u0003f[\u001f~\u0018|W6\u0015`P0qUC$>UPkd\u00191\u000b\u0017\u0002\u0010QmKWR|\u0016{V\u0012\u001fD g]OC#\u000f\u0005*H\u0001[K\u0013wϯUM 9C@\b#Sv>i\u0018j\u001f5pnZQj\u0016Pu\r\bS\u000er\u0016\u0012c\\yub\u0005\u000fiUar1hlbF\u0004\u001d).+\u0007n2~K,q&K\"\u0018\u0016E\u0014\u0010\\0tЦ}b\u001d>ܒi\u001d"}, d2 = {"\u001ab^:\")KO.~Dl<\b\u00149r\u000fqh@\u0002\u001e\u0017E~\u0012F\u007f\u0015D]\u0005.\r", "", "u(E", "1n]@g9NQ(hwc,z\u0018\u001bu\u0004(\u000bG\u0015", "1kP@f7:b\u001c", "", ">`a.`,MS&m\u000fi,\u000b", "", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "/qV@", "2nT@@,MV#}Zq0\u000b\u0018", "", "1kP@f\u0015:[\u0019", ";dc5b+'O!~", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok$4H7|0g\u001cdj;PA3J\u00055\u001d\u0010C", "5dc\u0011X*EO&~yF,\f\f9dk8\u007f@\u0010\u001e+", "\u001aiPCTuEO\"\u0001Dk,}\u0010/c\u000fqc@\u0010\u001a!FE", "1kPGm", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sU\u000f\u0001<\u0012\u0013`Nk\u0017>@\u0013Df\u0002)9C\f\u0015R?Lg}%\u0011qc\u0003dj(\\\u0005|\u000b3S(mN<D\u0010\u001b\\W[+\u000e\fY?38,7.\u000b6HW", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok$4H7|0g\u001cdj;PA3J\u00055\u001d\u001051Xcn\u0007\u001b\u000ec\u0010\u00188\r\u0006`A\"}\u000e\u001f\u001f\u0017/S\u0001\u0011", "5dc\u001aX;A]\u0018j\u000bb,\f\u0010C", "7me<^,&S(\u0002\u0005]\u0018\r\r/t\u0007<", "\u001aj^A_0G\u001d\u0004z~k\u0002", "@dR2\\=>`", ";dc5b+", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExnBY~'7k%w5CJn>\u001dj^H>\u0003t(\u0018}#PN\u0018\u0016YWr;#g\u001etT5\u001c\f]JmY@;,]", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ReflectionUtils {
    public static final ReflectionUtils INSTANCE = new ReflectionUtils();

    private ReflectionUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object constructObjectQuietly$default(ReflectionUtils reflectionUtils, String str, List list, List list2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        return reflectionUtils.constructObjectQuietly(str, list, list2);
    }

    @JvmStatic
    public static final boolean doesMethodExist(String className, String methodName, Class<?>... parameterTypes) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        return getMethodQuietly(className, methodName, (Class<?>[]) Arrays.copyOf(parameterTypes, parameterTypes.length)) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Class] */
    private final Method getDeclaredMethodQuietly(Class<?> cls, String str, Class<?>... clsArr) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = cls;
        while (true) {
            T t2 = objectRef.element;
            if (t2 == 0) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.D, (Throwable) null, false, (Function0) new n70(str), 6, (Object) null);
                return null;
            }
            try {
                return ((Class) t2).getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.D, (Throwable) null, false, (Function0) new m70(str, objectRef), 6, (Object) null);
                objectRef.element = ((Class) objectRef.element).getSuperclass();
            }
        }
    }

    @JvmStatic
    public static final Method getMethodQuietly(Class<?> clazz, String methodName, Class<?>... parameterTypes) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.D, (Throwable) e2, false, (Function0) p70.f1493a, 4, (Object) null);
            return null;
        }
    }

    @JvmStatic
    public static final Method getMethodQuietly(String className, String methodName, Class<?>... parameterTypes) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            Class<?> clazz = Class.forName(className);
            Intrinsics.checkNotNullExpressionValue(clazz, "clazz");
            return getMethodQuietly(clazz, methodName, (Class<?>[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.D, (Throwable) e2, false, (Function0) q70.f1580a, 4, (Object) null);
            return null;
        }
    }

    @JvmStatic
    public static final Pair<Boolean, Object> invokeMethodQuietly(Object obj, Method method, Object... args) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            return new Pair<>(Boolean.TRUE, method.invoke(obj, Arrays.copyOf(args, args.length)));
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.D, (Throwable) e2, false, (Function0) r70.f1651a, 4, (Object) null);
            return new Pair<>(Boolean.FALSE, null);
        }
    }

    public final Object constructObjectQuietly(String classpath, List<? extends Class<?>> parameterTypes, List<? extends Object> args) {
        Intrinsics.checkNotNullParameter(classpath, "classpath");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            Class<?> cls = Class.forName(classpath);
            Class[] clsArr = (Class[]) parameterTypes.toArray(new Class[0]);
            Constructor<?> constructor = cls.getConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            Object[] array = args.toArray(new Object[0]);
            return constructor.newInstance(Arrays.copyOf(array, array.length));
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) l70.f1172a, 4, (Object) null);
            return null;
        }
    }

    public final Method getDeclaredMethodQuietly(String className, String methodName, Class<?>... parameterTypes) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            Class<?> clazz = Class.forName(className);
            Intrinsics.checkNotNullExpressionValue(clazz, "clazz");
            return getDeclaredMethodQuietly(clazz, methodName, (Class<?>[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.D, (Throwable) e2, false, (Function0) o70.f1425a, 4, (Object) null);
            return null;
        }
    }
}
