package androidx.compose.runtime;

import androidx.collection.MutableScatterMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
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
/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0006DLc\u0003İIي8\u000bDB\u0007\"2\u0015\u007f\u0007tsA0JgP.`Y2\u000fq\u0001<$i$yCAW\"}0\u0015WNmhtϾ\u0019!¼7\b\u001cюx+q[~\\ \u000fZB\u001e@cM\u001e>yy\u0005F\u0013\"J.H{\u0015\u0001PݒX\u0012\u0007zqL:\u0015ضDr@V\u001bRM2 \u000eV /'\rm\\@`ns9]$IޚCĚ+a6\b[\u0019\u000fb5\u001a\u000faL9\u0007̑4չ)U\t\u0016`k\b\u0018M\u0003U\u0007~&]*yweHp\u007fJƃۣS\u000fc\u00064pMln!?+}y{T\u001c:\u0010z2Ȟl\b\u001c\u001d?Hd,բj\n\u0014K\u0003\f\u001cN^\u001cvB.\u0016(پ\u0016Ӿ\u000451U)\u0004\"|I\u001bfC\f\u0007\u001d\u001eYЧ~#kT<aC\u001eƻ{W9҅X?NT\u0018`Ʀl\u0006\u0378f "}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000e5i%=MP#{;-\u0019P]D\\", "\u0019", "$", "", ";`_", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<d#1h\r DU\u00129#", "1n]@g9NQ(\t\b&0\u0005\u00146", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ~'Vk\u000bCv\u00133U\r/7z}*X\u0019~R0'\u0014uk=\u0006vuL\u0001.NLL;`\\{\u0007{\"i\nK2\rrW=3}DD\u0007\u00047\u001f", "5dc\u001aT7", "u(;.a+K]\u001d}\u000e(*\u0007\u00106e}7\u007fJ\n`~W~\n9}%#Wy/Fm#\u0016IN\u0011", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ~'Vk\u000bCv\u00133U\r/7z}*X\u0019\"p0/\u00112h5\u0010eu8s,GJ]\u0002 G", "6`b566=S", "", "6`b566=S`\u0003\u0003i3", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ~'Vk\u000bCv\u00133U\r/7z}*X\u0019~O", ">n_", "9dh", ">n_y\\4IZ", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ~'Vk\u000bCv\u00133U\r/7z}*X\u0019\"p0/\u00112h5\u0010eu8s,GJ]\u0002 9w9%\u000e$\u0015J4\u000fNC>)nBFt", ">tc", "", "D`[BX", ">tcy\\4IZ", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ~'Vk\u000bCv\u00133U\r/7z}*X\u0019\"p0/\u00112h5\u0010eu8s,GJ]\u0002CWnN\u0010[a\nW-VnVF$lS\rbx", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ~'Vk\u000bCv\u00133U\r/7z}*X\u0019~R9\u001a&d+@\u0003l.\u0018d6TPW.2", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
final class MutableScatterMultiMap<K, V> {
    private final MutableScatterMap<K, Object> map;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MutableScatterMultiMap m3651boximpl(MutableScatterMap mutableScatterMap) {
        return new MutableScatterMultiMap(mutableScatterMap);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <K, V> MutableScatterMap<K, Object> m3652constructorimpl(MutableScatterMap<K, Object> mutableScatterMap) {
        return mutableScatterMap;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3653equalsimpl(MutableScatterMap<K, Object> mutableScatterMap, Object obj) {
        return (obj instanceof MutableScatterMultiMap) && Intrinsics.areEqual(mutableScatterMap, ((MutableScatterMultiMap) obj).m3659unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3654equalsimpl0(MutableScatterMap<K, Object> mutableScatterMap, MutableScatterMap<K, Object> mutableScatterMap2) {
        return Intrinsics.areEqual(mutableScatterMap, mutableScatterMap2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3655hashCodeimpl(MutableScatterMap<K, Object> mutableScatterMap) {
        return mutableScatterMap.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3658toStringimpl(MutableScatterMap<K, Object> mutableScatterMap) {
        return "MutableScatterMultiMap(map=" + mutableScatterMap + ')';
    }

    public boolean equals(Object obj) {
        return m3653equalsimpl(this.map, obj);
    }

    public int hashCode() {
        return m3655hashCodeimpl(this.map);
    }

    public String toString() {
        return m3658toStringimpl(this.map);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ MutableScatterMap m3659unboximpl() {
        return this.map;
    }

    private /* synthetic */ MutableScatterMultiMap(MutableScatterMap mutableScatterMap) {
        this.map = mutableScatterMap;
    }

    public final MutableScatterMap<K, Object> getMap() {
        return this.map;
    }

    /* JADX INFO: renamed from: pop-impl, reason: not valid java name */
    public static final V m3656popimpl(MutableScatterMap<K, Object> mutableScatterMap, K k2) {
        V v2 = (V) mutableScatterMap.get(k2);
        if (v2 == null) {
            return null;
        }
        if (TypeIntrinsics.isMutableList(v2)) {
            List listAsMutableList = TypeIntrinsics.asMutableList(v2);
            v2 = (V) listAsMutableList.remove(0);
            if (listAsMutableList.isEmpty()) {
                mutableScatterMap.remove(k2);
            }
        } else {
            mutableScatterMap.remove(k2);
        }
        Intrinsics.checkNotNull(v2, "null cannot be cast to non-null type V of androidx.compose.runtime.MutableScatterMultiMap.pop_impl$lambda$1");
        return v2;
    }

    /* JADX INFO: renamed from: put-impl, reason: not valid java name */
    public static final void m3657putimpl(MutableScatterMap<K, Object> mutableScatterMap, K k2, V v2) {
        int iFindInsertIndex = mutableScatterMap.findInsertIndex(k2);
        boolean z2 = iFindInsertIndex < 0;
        Object obj = z2 ? null : mutableScatterMap.values[iFindInsertIndex];
        if (obj != null) {
            if (TypeIntrinsics.isMutableList(obj)) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<V of androidx.compose.runtime.MutableScatterMultiMap.put_impl$lambda$0>");
                List listAsMutableList = TypeIntrinsics.asMutableList(obj);
                listAsMutableList.add(v2);
                v2 = (V) listAsMutableList;
            } else {
                v2 = (V) CollectionsKt.mutableListOf(obj, v2);
            }
        }
        if (z2) {
            int i2 = ~iFindInsertIndex;
            mutableScatterMap.keys[i2] = k2;
            mutableScatterMap.values[i2] = v2;
            return;
        }
        mutableScatterMap.values[iFindInsertIndex] = v2;
    }
}
