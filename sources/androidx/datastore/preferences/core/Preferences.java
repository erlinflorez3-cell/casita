package androidx.datastore.preferences.core;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: Preferences.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLcz\u0004I\u0006>-6B\u0015\"4ߚ\u007f\u0007tsA0JhP.hS2\u000fq}:Hqҕ\"CiTR}/\u0017\u0010Sm˧ĔNZ\u0019CW\u001c$y\u0003<Y[\ta\"\u000f8C\u001eBCO\u007f=g_#8KDz=F}\u001d\u0001H/h\u0012|ٙQQ<\u001c>G\t@b\u000f]\u0005`\u00184AfӜ\u001e%\n\\>`ns9u)#kH÷5e`\u0007[\u0014^Z7\u000f\u0007ad1n:{ս%٨\u0007\u0007`d\b\u0007M{U\u0005\u00172o/W\u007fo6\u0007ÜЕ\u0019:"}, d2 = {"\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaG\\", "", "u(E", "/r<.c", "", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaGEI,bL", "1n]AT0Ga", "", "\"", "9dh", "5dc", "uKP;W9HW\u0018\u0012D](\f\u0005=t\n5{\n\f$\u0017Ho\u001b<\u007f#5gG\u001eAz\u0016w8P;l4+\u0015q_9\u0015\"\u0012N\u000b|\u000b3S(mN<D\u0010\u001b\\W8(\u0012\u0005WPy", "Bn<Bg(;Z\u0019i\b^-|\u0016/n}(\n", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0016]R7h;\u001e\u007fua:\u0007p,Wt'U\"", "Bn??X->`\u0019\bx^:", "\u0019dh", "\u001e`X?", "2`c.f;H`\u0019F\u0006k,}\t<e\t&{NH\u0015!To"}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public abstract class Preferences {
    public abstract Map<Key<?>, Object> asMap();

    public abstract <T> boolean contains(Key<T> key);

    public abstract <T> T get(Key<T> key);

    /* JADX INFO: compiled from: Preferences.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&˛\bDRш|İI\u0006>\u00176B\u0005$4\u0012\u0006\u0010nj?0LeV4Zݷ2\u000f\u0002{<$a&\bّcW Ԃ0\b\u007fN\u0016g/W`ŏS\u0013\u0014\u0017\u0011jZKǤ|] \u0012zS}EKM\u001eDif\u0003>\u001d\"H!fyKЦ\u001arN\u001e\u007f\u0013Cy\u0016XD\t\u000bH]%S\u0015\u001c\"\u0006tĨ/*\rk\\C`l\u0014Žuݑ\u0005ݦFN5mx\u0003[\u001c^TU\u000f=un:N8M\u0015SUΫ\u000bXcΪ\u001bAwA\u0013mҐ+;"}, d2 = {"\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaGEI,bL", "\"", "", "<`\\2", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "3pd._:", "", "=sW2e", "6`b566=S", "", "Bn", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaGEN(R\u0004|", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'| \u0016Ty\u0012;\nn4U\r\u001cE| ;M\rFx4\u001f\u0015uaB\u0005c:\u0018t1TL\u0018\u0017iRs=!\u0012c\fN9KoUE1D", "BnBAe0GU", "2`c.f;H`\u0019F\u0006k,}\t<e\t&{NH\u0015!To"}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    public static final class Key<T> {
        private final String name;

        public Key(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
        }

        public final String getName() {
            return this.name;
        }

        public final Pair<T> to(T t2) {
            return new Pair<>(this, t2);
        }

        public boolean equals(Object obj) {
            if (obj instanceof Key) {
                return Intrinsics.areEqual(this.name, ((Key) obj).name);
            }
            return false;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        public String toString() {
            return this.name;
        }
    }

    /* JADX INFO: compiled from: Preferences.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&˛\bDRш|İI\u0006F\u000b6B\u0005(Bߚ \tlʑG/tev.\u0013n0ş{\u0006B%s*\u0002EKUPԂP\u000b_Ruj\u0007J\u0011ŏß\u0013\u0006$|;DWV\u0011c\"\u0011BB&ЀaOFފ;žx<\rړJ$>~\u0013\u0007j>V\u0013\u000fzyŷb۶2ϮtBZ\r[\u000e2\u0014\fE.\tɏ`q"}, d2 = {"\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaGEN(R\u0004|", "\"", "", "9dh", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaGEI,bL", "D`[BX", "uKP;W9HW\u0018\u0012D](\f\u0005=t\n5{\n\f$\u0017Ho\u001b<\u007f#5gG\u001eAz\u0016w8P;l4+\u0015q_9\u0015\"\u0012N\u000b|.QJ=X\u001cy9\u001d\u0014$wK0\r\u0003h\u0017g_", "5dc\u0018X@|R\u0015\u000evl;\u0007\u0016/_\u000b5{A\u0001$\u0017Pm\u000eJp#?f}", "u(;.a+K]\u001d}\u000e(+x\u0018+s\u000f2\t@J\"$Gp\u000eIv.3Y\fi5w#.\u0017.Hk5\u001e\"hj7\u0007qj4v;\u001d", "5dc#T3NSW}vm(\u000b\u00189r\u007f\"\u0007M\u0001\u0018\u0017To\u0017:v3/W\b-7", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "2`c.f;H`\u0019F\u0006k,}\t<e\t&{NH\u0015!To"}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    public static final class Pair<T> {
        private final Key<T> key;
        private final T value;

        public Pair(Key<T> key, T t2) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
            this.value = t2;
        }

        public final Key<T> getKey$datastore_preferences_core() {
            return this.key;
        }

        public final T getValue$datastore_preferences_core() {
            return this.value;
        }
    }

    public final MutablePreferences toMutablePreferences() {
        return new MutablePreferences(MapsKt.toMutableMap(asMap()), false);
    }

    public final Preferences toPreferences() {
        return new MutablePreferences(MapsKt.toMutableMap(asMap()), true);
    }
}
