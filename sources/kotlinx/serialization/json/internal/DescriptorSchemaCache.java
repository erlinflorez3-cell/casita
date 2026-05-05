package kotlinx.serialization.json.internal;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLcz\u0004I\u0006>.6B\u0015\"4\u0012\u000e\u0007njO0LeN3ZS@\u000fs{:$c$\u007fCCU \u007f(ޛeȞ\u0018g\u001dI\u0013\nVO\tȀ|j:I\u001e'k\u0018'4Xn\u0006:muCʠn{^\u0005N1R<\b\r\u0019\u001aXK@\u0001\tLc\u0012\"2Pp\u0001Y;QK܌\u0012ĂB \u000f(%\u001f\\A`l$AO)\t݃PUO_^{}\u0011T\\?\r%dN5N@M\u001b5U\u0013\u0007\u0019bm\u0007o{K\u0011\u0001-7-Ys\u001e=\u0007\rЏ\u0019+]\u001b&'4k\u001dQ\u000f\u001cG1UҪYW6(&y,\u0011J\f&\u0006UK^7(o \u0014Cv\u0003S\u0007W0br\u0004\trN\u0017k\u0007yچ9ӸjQoMi\u0003E|\u001d5.%\u0011nO^d,p1+\\\bWASP=vM8]Mo\u0014p\u0011\u0001X\u0006\u0019M\u00101\f\u0011\\\u0016\u0004<\n;yܬmɘLDoϸݼd|"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\rMQ9x8)$rn'\u0005f,Vr\u0005CJQ,2", "", "u(E", ";`_", "", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0016G}\fIz0Dc\u000b.\u0001[\u0016;Q?BJ4,\u0013ueD\u0016m9$", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\rMQ9x8)$rn'\u0005f,Vr\u0005CJQ,\u001b8rQi", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\rMQ9x8)$rn\u0018\u0003r($", "5dc", "\"", "2db0e0Ib#\f", "9dh", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Fo\u001c:\u0004)@h\b-E7\u0004.ZG7r\u0013\u001e#fn=\u0012r6[L\u000eMV]3`[\u0006\u0007\"\u0012g\u0012J2\u0011\u001aUP(xM\u0001$\u00166RK?q\u0010\f#\u00171q:!V\u001eE\u0007\u0019\u0001P3u4WbyO=#^(g\f\u001e\u0003\\N\u0010gzv\u0015,d\u001a5\u0006\u0005UZ\\O~geVn", "5dc\u001ce\u0017Nb", "2dU.h3MD\u0015\u0006\u000b^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Fo\u001c:\u0004)@h\b-E7\u0004.ZG7r\u0013\u001e#fn=\u0012r6[L\u000eMV]3`[\u0006\u0007\"\u0012g\u0012J2\u0011\u001aUP(xM\u0001$\u00166RK?q\u0010\f#\u00171q:!V\u001eE\u0007\u0019\u0001P3u4WbyO=#^(g\f\u001e\u0003\\N\u0010\u000b\u001a{(\"lYw\u000f\r[Zsb\u0003evK#\u0004Fm\u001f}dDTs_E?|b2\u0001s#.\"{'}/M\u001e';d\u0003Z=", "Adc", "", "D`[BX", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Fo\u001c:\u0004)@h\b-E7\u0004.ZG7r\u0013\u001e#fn=\u0012r6[L\u000eMV]3`[\u0006\u0007\"\u0012g\u0012J2\u0011\u001aUP(xM\u0001$\u00166RK?q\u0010\f#\u00171q:!V\u001eE\u0007\u0019\u0001P3u4WbyO=#^(g\f\u001e\u0003\\N\u0010\u000b\u0019m*\u00172W*\u0013}\u001dzoWyev\u001d\\k", "\u0019dh", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u001c%Qx"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DescriptorSchemaCache {
    private final Map<SerialDescriptor, Map<Key<Object>, Object>> map = CreateMapForCacheKt.createMapForCache(16);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d<K!&˛\bDRш|\u0004G\u0006FéVH\u0005Ӭ:\u0011 \u0007\u0015ji0re\t1ʂW*\u001dlڽ8&"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\rMQ9x8)$rn'\u0005f,Vr\u0005CJQ,\u001b8rQi", "\"", "", "u(E", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u001c%Qx"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Key<T> {
    }

    public final <T> T get(SerialDescriptor descriptor, Key<T> key) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Map<Key<Object>, Object> map = this.map.get(descriptor);
        Object obj = map != null ? map.get(key) : null;
        if (obj == null) {
            return null;
        }
        return (T) obj;
    }

    public final <T> T getOrPut(SerialDescriptor descriptor, Key<T> key, Function0<? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        T t2 = (T) get(descriptor, key);
        if (t2 != null) {
            return t2;
        }
        T tInvoke = defaultValue.invoke();
        set(descriptor, key, tInvoke);
        return tInvoke;
    }

    public final <T> void set(SerialDescriptor descriptor, Key<T> key, T value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Map<SerialDescriptor, Map<Key<Object>, Object>> map = this.map;
        Map<Key<Object>, Object> mapCreateMapForCache = map.get(descriptor);
        if (mapCreateMapForCache == null) {
            mapCreateMapForCache = CreateMapForCacheKt.createMapForCache(2);
            map.put(descriptor, mapCreateMapForCache);
        }
        mapCreateMapForCache.put(key, value);
    }
}
