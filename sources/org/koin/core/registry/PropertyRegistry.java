package org.koin.core.registry;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.Koin;
import org.koin.mp.KoinPlatformTools;
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
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4D\u0007\":5\u007f\u0007tvAӄLeV.ZS0\u0014s{BFc$wFQ٥J}P\b\u0010Ywk|Jr\u000bq\u0010و\u001axx.\u0012Y\u0007e*\u000f`K8KAW\b=gi%:\u0013+J\"f\u0001M\u001a(6`\u0012\ry\nX,\u00146ϋ~G\u0003\u0011[\u00102\u00124Eŋ\u0005\u001eju\u0017NV{u:],3yP^?k@~]\rt[7\u000f\u0007aL*nH}<3e\u001b\u0007\u0001d_\tEмK\u0012\u0011'U*yweAp\u007fB\u001c[S\u001bp\u000b&#\u0012\u0018ӠВ+-UwYe^:\u0006z\u0014\rj\u0005dͻ)ρ23\"Ǒ \u00109w\u0001W\u0011h\u0010cZ\f\u000bcF\u0017S\u0007C-I\u001b\u0015P\u0010Ao\u05ce9߉\t\r&ŀѐr7"}, d2 = {"\u001ana4\"2HW\"Hxh9|R<e\u0002,\nO\u000e+`2|\u0018Gv2Dmj 9q$=ZW\u0011", "", "-j^6a", "\u001ana4\"2HW\"Hxh9|R\u0015o\u00041Q", "uK^?ZuD]\u001d\bD\\6\n\txK\n,\u0005\u0016D\b", "5dc,^6B\\W\u0005\u0005b5v\u00079r\u007f", "u(;<e.\bY#\u0003\u0004(*\u0007\u0016//e2\u007fIV", "-uP9h,L", "", "", "1k^@X", "", "2d[2g,)`#\nzk;\u0011", "9dh", "5dc\u001de6IS&\u000e\u000f", "\"", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "A`e2C9H^\u0019\f\nb,\u000b", ">q^=X9MW\u0019\r", "", "A`e2C9H^\u0019\f\nr", "D`[BX", "A`e2C9H^\u0019\f\nrj\u0003\u00133ny&\u0006M\u0001", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq>", "9nX; *H`\u0019"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class PropertyRegistry {
    private final Koin _koin;
    private final Map<String, Object> _values;

    public PropertyRegistry(Koin _koin) {
        Intrinsics.checkNotNullParameter(_koin, "_koin");
        this._koin = _koin;
        this._values = KoinPlatformTools.INSTANCE.safeHashMap();
    }

    public final void close() {
        this._values.clear();
    }

    public final void deleteProperty(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this._values.remove(key);
    }

    public final <T> T getProperty(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        T t2 = (T) this._values.get(key);
        if (t2 == null) {
            return null;
        }
        return t2;
    }

    public final Koin get_koin$koin_core() {
        return this._koin;
    }

    public final void saveProperties(Map<String, ? extends Object> properties) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        this._koin.getLogger().debug("load " + properties.size() + " properties");
        this._values.putAll(properties);
    }

    public final <T> void saveProperty$koin_core(String key, T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this._values.put(key, value);
    }
}
