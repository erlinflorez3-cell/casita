package androidx.core.os;

import android.os.PersistableBundle;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: PersistableBundle.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0018\u007fјnjG0LeN.ZS8\u001bs{:$aәqYП\u0006\u001a,!ITTg̊rJh\u000b\f\u001d\u0014\u0017\u0011jZK\u0006|k\u0015'2ps\u00068\u0016\u0012K>xtd\u000bP60?\u0012\u0005/\u001cZN\u001e~\u0013Ea\u000b@9pvH\\%O\u001b\u0019@\u0005\u0005%Ӟ\"g"}, d2 = {"\u001a`]1e6BR,Hxh9|R9sI\u0013{M\u000f\u001b%Vk\u000bCv\u0002Eb|'7I!2\u001a\u000f\u001fs?%zw7", "", "u(E", "1qT.g,)S&\r~l;x\u00066e\\8\u0005?\b\u0017", "\u001a`]1e6BRb\t\t(\u0017|\u0016=i\u000e7w=\b\u0017sWx\rCvz", "1`_.V0Mg", "", ">tc#T3NS", "", ">da@\\:MO\u0016\u0006z;<\u0006\b6e", "9dh", "", "D`[BX", "1na2 2Mf\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class PersistableBundleApi21ImplKt {
    public static final PersistableBundleApi21ImplKt INSTANCE = new PersistableBundleApi21ImplKt();

    private PersistableBundleApi21ImplKt() {
    }

    @JvmStatic
    public static final PersistableBundle createPersistableBundle(int i2) {
        return new PersistableBundle(i2);
    }

    @JvmStatic
    public static final void putValue(PersistableBundle persistableBundle, String str, Object obj) {
        if (obj == null) {
            persistableBundle.putString(str, null);
            return;
        }
        if (obj instanceof Boolean) {
            PersistableBundleApi22ImplKt.putBoolean(persistableBundle, str, ((Boolean) obj).booleanValue());
            return;
        }
        if (!(obj instanceof Double)) {
            if (!(obj instanceof Integer)) {
                if (!(obj instanceof Long)) {
                    if (!(obj instanceof String)) {
                        if (!(obj instanceof PersistableBundle)) {
                            if (obj instanceof boolean[]) {
                                PersistableBundleApi22ImplKt.putBooleanArray(persistableBundle, str, (boolean[]) obj);
                                return;
                            }
                            if (!(obj instanceof double[])) {
                                if (!(obj instanceof int[])) {
                                    if (!(obj instanceof long[])) {
                                        if (obj instanceof Object[]) {
                                            Class<?> componentType = obj.getClass().getComponentType();
                                            Intrinsics.checkNotNull(componentType);
                                            if (String.class.isAssignableFrom(componentType)) {
                                                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                                                persistableBundle.putStringArray(str, (String[]) obj);
                                                return;
                                            } else {
                                                throw new IllegalArgumentException("Unsupported value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                                            }
                                        }
                                        throw new IllegalArgumentException("Unsupported value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                                    }
                                    persistableBundle.putLongArray(str, (long[]) obj);
                                    return;
                                }
                                persistableBundle.putIntArray(str, (int[]) obj);
                                return;
                            }
                            persistableBundle.putDoubleArray(str, (double[]) obj);
                            return;
                        }
                        persistableBundle.putPersistableBundle(str, (PersistableBundle) obj);
                        return;
                    }
                    persistableBundle.putString(str, (String) obj);
                    return;
                }
                persistableBundle.putLong(str, ((Number) obj).longValue());
                return;
            }
            persistableBundle.putInt(str, ((Number) obj).intValue());
            return;
        }
        persistableBundle.putDouble(str, ((Number) obj).doubleValue());
    }
}
