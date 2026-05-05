package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&˛\bDZc|İI\u0006F\u000b6B\u0015\"4\u0012\u0006јnjGNLe^.ZS@\u000fs{:$c$\bCCU0}*\teNo˧vJp\u000bK\u000f\f\u0019~jBկ}zc܈\u001d1ruO5]o\u00048\u000ftv60\\09\u0012+\u0011\":N x\u000bCy\u0010@3PxJX\u001dO\u0015\u001a@\fl%\u0011(lo^8Xl\u0014ŽE\"1ppPϮc0\u000bUU\u0007b4%\u0005q(;HG7%%\nΈ\u001dQ\nF1M\"G\u0013w?-;K\u0004Wd\\.\u0017E5]\u001dux6^\u0015Q\u000f\u0012U0\u0016wؘOʫÂvyց\f<Ǭ\u0012\b-Y<?j\t\u0016\u0017K\u000b\u0003YPT\u0012^H\u0001)lF\u001f5\u0006C-I\u001b\u001dϟ\u0010GGX\u000eީ\u0007ڟ\"#\t͙q\u000eb\u000fx;+\\\bWASP=vR8\\Mu\u0014vr\u0004:\u0004^M.4\f\u001b>\u001f59k9Yܩ\u0002\u0001vK\u0016x[\u009ejרmRPؗ̑n#?*\u000f+bGjʯ\b~S`,\u0017dɥX\u001a"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#[*@k&;ZCDz\u0017\u001a#kI5\u0012N([r/G[[0qRq\u001b\u0010\u0010]\u000e$", "\"", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#h\u001cDi\u001e.\\P?\u00014\u001d\u0003hn=\u0003j0cv4%HL/\\(", "1n\\=h;>", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "", "", "\u001aj^A_0G\u001d&~{e,z\u0018xKn<\u0007@V", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`|5o\u001b@r,9n}-\r", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&Sc(", "1`R5X", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt!Pm\u001eI\u0004%>h`\u001cEp}*X\u0019", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#h\u001cDi\u001e.\\P?\u00014\u001drd_<\u0007C5]\u0004;\u001d", "5dc", "\u001aj^A_0G\u001d\u0006~\tn3\f^", "9dh", "Bx_2f", "5dcyZ\u0010\u001aZ)F\t", "uKZ<g3B\\b\fz_3|\u0007>/e\u0006\u0003<\u000f%l.t\nMrnEh\u0002'\u0001T\u001a<\\\u0019~R9\u001a&d+@\u0003l.\u0018`$LLL;2", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class ConcurrentHashMapParametrizedCache<T> implements ParametrizedSerializerCache<T> {
    private final ConcurrentHashMap<Class<?>, ParametrizedCacheEntry<T>> cache;
    private final Function2<KClass<Object>, List<? extends KType>, KSerializer<T>> compute;

    /* JADX WARN: Multi-variable type inference failed */
    public ConcurrentHashMapParametrizedCache(Function2<? super KClass<Object>, ? super List<? extends KType>, ? extends KSerializer<T>> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.compute = compute;
        this.cache = new ConcurrentHashMap<>();
    }

    @Override // kotlinx.serialization.internal.ParametrizedSerializerCache
    /* JADX INFO: renamed from: get-gIAlu-s */
    public Object mo10579getgIAlus(KClass<Object> key, List<? extends KType> types) {
        Object objM8980constructorimpl;
        ParametrizedCacheEntry<T> parametrizedCacheEntryPutIfAbsent;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        ConcurrentHashMap<Class<?>, ParametrizedCacheEntry<T>> concurrentHashMap = this.cache;
        Class<?> javaClass = JvmClassMappingKt.getJavaClass((KClass) key);
        ParametrizedCacheEntry<T> parametrizedCacheEntry = concurrentHashMap.get(javaClass);
        if (parametrizedCacheEntry == null && (parametrizedCacheEntryPutIfAbsent = concurrentHashMap.putIfAbsent(javaClass, (parametrizedCacheEntry = new ParametrizedCacheEntry<>()))) != null) {
            parametrizedCacheEntry = parametrizedCacheEntryPutIfAbsent;
        }
        ParametrizedCacheEntry<T> parametrizedCacheEntry2 = parametrizedCacheEntry;
        List<? extends KType> list = types;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new KTypeWrapper((KType) it.next()));
        }
        ArrayList arrayList2 = arrayList;
        ConcurrentHashMap concurrentHashMap2 = ((ParametrizedCacheEntry) parametrizedCacheEntry2).serializers;
        Object objM8979boximpl = concurrentHashMap2.get(arrayList2);
        if (objM8979boximpl == null) {
            try {
                Result.Companion companion = Result.Companion;
                objM8980constructorimpl = Result.m8980constructorimpl(this.compute.invoke(key, types));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM8980constructorimpl = Result.m8980constructorimpl(ResultKt.createFailure(th));
            }
            objM8979boximpl = Result.m8979boximpl(objM8980constructorimpl);
            Object objPutIfAbsent = concurrentHashMap2.putIfAbsent(arrayList2, objM8979boximpl);
            if (objPutIfAbsent != null) {
                objM8979boximpl = objPutIfAbsent;
            }
        }
        Intrinsics.checkNotNullExpressionValue(objM8979boximpl, "serializers.getOrPut(wra… { producer() }\n        }");
        return ((Result) objM8979boximpl).m8989unboximpl();
    }
}
