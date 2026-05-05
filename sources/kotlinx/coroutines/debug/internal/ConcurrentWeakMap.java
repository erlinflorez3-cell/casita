package kotlinx.coroutines.debug.internal;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.util.concurrent.Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractMutableMap;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.ranges.RangesKt;
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
@Metadata(bv = {}, d1 = {"ЯX\u001d<K!&˛\bDRш|İI\u0006F\u000b6Ȑ\u0007\":\u001b\u007f\u0007lkA0ZeP\u008cZS@\u000fs{J$c$\bCC٥\"}0\u000fWNmhvJh\u000bK\u000f\f\u001d\u0001j:j]xc\u0013\u00172P\u0015G3SrE9vt>\u0005&4(\u0600\u0010ڎ) 0Ϻ\u001eu#Cy\f:6FoHS5M3\u001aB\u0012N\"\u0011\u001e#f^8Xl$;]%;jivP ?\rS\u0013Fb*%v\u0010\"ҋD9;\u001a3YK\r`lW\u0003m\u0004\u0004\u00051=5>aum5\u000f~D\u00199c%])̦#ӻQԃ\u0010'9d,h^$@y\u0011zC;4\u0012\u0014;`.cԿ\u0017\f\u001cJ\rr\n?\u0017\u0016ެF\u007f\ty~,3\u0019K-O\u001a\u001dP\u0012?'bO{;ټd7ъr!iiV\u007f#5lyg0\b?mL\\\u001eq=$Վ!h\u0010A\u001c2]~ezW.ϲ)7iQk'y$`D\u0016\tKt1Wwu`@P\u0001^I8-$Zrv5s^yp0!M\"U5$N\u0013pc\u0006C9%>V&řk;jk\u0013=EvIi~\u001a\u0019(En5EQ\u001a߄qT\u0007\u0014u;\u0011ڳ\u0007p\u0019Ͱ\u000e+p6%JPz\u0012\b{z\u0088\"\u0012`KHʌ6Ϝ5\u0019dé\u0019\u0015,OY|7m\u0011=fюVտ(\u0007\u0002&z\u0018\u000f`-\t}\u0003\u0011O<~p\"cۋ\u007fQOz,ȿjط\u0001'\u001f\u0001y\u001dU\u0006\u001dkZ\f.\be\n0\"*;a/sП\u001f\u0001928,sl!\u0002\b\"hؔ|܃}\u0013Sj4\t\u0016\tҚ0\u000b"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E?\u0001\u0014'I9\u0012E\u0006%Bby'\u0001K 7KSHx4'$Za5\rK(YL", "\u0019", "", "$", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c}%&Tk\fK^5DUz'7U\u00129#", "EdP8E,??)~\u000b^", "", "\nh]6g\u0005", "uY\u0018#", "-rXGX", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u0015+x\u001d\u0012", "1na2", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u00154o\u000f\u0012", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E?\u0001\u0014'I9\u0012E\u0006%Bby'\u0001K 7KSHx4'$Za5\rK(Y5\u0005QYN\u0002", "\u001aiPCTuEO\"\u0001Dk,}R\u001ce\u0001(\t@\n\u0015\u00173\u007f\u000eLvz", "Ahi2", "", "5dc \\A>", "u(8", "2dR?X4>\\(l~s,", "", "5dc", "9dh", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", ">tc", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4H7|0g\u001cdj;PM)Sv%V\"", "@d\\<i,", ">tc l5<V&\t\u0004bA|\b", "9dh@", "", "5dc\u0018X@L", "u(;7T=:\u001d)\u000e~euj\t>;", "3mc?\\,L", "", "5dc\u0012a;KW\u0019\r", "1kT.e", "@t]$X(D@\u0019\u007ffn,\r\t\rl\u007f$\u0005D\n\u0019}Qy\u0019,\u007f49`a)Fm#;]NJk3", "1kT.a\u001e>O\u001fkz_", ExifInterface.LONGITUDE_EAST, "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E?\u0001\u0014'I9\u0012E\u0006%Bby'\u0001P\u0012<PC:]4\u001a\u001bUa:\\", "\u0011na2", "\u0013mc?l", "\u0019dh#T3NS\u0007~\n", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ConcurrentWeakMap<K, V> extends AbstractMutableMap<K, V> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater _size$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(ConcurrentWeakMap.class, "_size$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater core$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(ConcurrentWeakMap.class, Object.class, "core$volatile");
    private volatile /* synthetic */ int _size$volatile;
    private volatile /* synthetic */ Object core$volatile;
    private final ReferenceQueue<K> weakRefQueue;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4E\u0007\"B\u0012\u007fјnjO0Le^.ZS0\u0014s{B$c$wFCU0}*\tUOog|qb\u000bI\u000f\u000e\u0016\u000fj4I[xc܋\u0011Hԏ ?aL(<Y!\u0002F\t.2:8(\u0006в\u001e,N\u0012\u0005}\fY\u001a\u001eH@\u001f;\u0003\u0011[\u00122\u00124?f\u0001fou\\NJ\u0003\\p.S\u0007wQf'\u0016ܞƊQ\rTdo\u001b\u0005r6+nIe\u00193_\u001b\u0007\u0001\\\u0006\u0003\b!K\u0018\u0001)=*wr\b:f\u000f,\u0015a˽=c\u0001:t\u0007g_B&[]iK^#@\u007f\u000b}\u001d<:\u05fa\u001c&v8ǉ\u001ef\u0016${\t\u0001jX`0މ\u0013\f\u000bcF\u0017[ĮC-I\u001b\u001dP\u0010Sa^E\u0015\u001d\rL51v/ul\u0012p\u0015!U&[y{NX`T\u001a[MmJ\u000e\u0011\u001eJ\u00066G\u000eL,'<5=Ik;3!\"ȵXFwv;_xUyR\u000f]P\u000efC8\t$Zre[ߛRԜ\\,\u0019۳l`\u0015\u0002 \u0013N]N˖#ٚ\u0014NWŖ:v[b\"%]g\u000eխp«\u0012WAӔ\u0004<_i(a\u0001}j̶>3\u001afnZa\u001cdl024XjFǮ\u0012C|\u0016A;\u0016ڧ\u001e\u0005;?$t\u001dX\u0007.DW{7^\tqfкVօ($"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E?\u0001\u0014'I9\u0012E\u0006%Bby'\u0001K 7KSHx4'$Za5\rK(Y5\u0005QYN\u0002", "", "/k[<V(MS\u0018", "", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u007f\u0017\u0014WqW@\u007f45f\u0007\u001c>7s8VAKxA\u001e\u001ewS9\u0003i\u0014J\u0002|+\u0010?", "AgX3g", "Bga2f/HZ\u0018", ":nP1", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u0015+x\u001d\u0012", "9dh@", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u0015#|\u001b8\u000bz", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E?\u0001\u0014'I9\u0012E\u0006%Bby'\u0001P\u0012<PC:]4\u001a\u001bUa:\\", "D`[BX:", "7mS2k", "6`b5", "5dc\u0016`7E", "9dh", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "@d\\<i,\u001cZ\u0019z\u0004^+X\u0018", "", ">tc\u0016`7E", "D`[BX", "EdP8>,R\u001e", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015SMJr8'(2_C\u0014m<]z0GZ\u0018+\\O\u0003?]\u0016c\u001dN8\u0016\u0001`\u000b\u0007jR:\u001f\u0007\u001eI}AU\u0001\rkQ\u001colSRYNu\u001ew\u000b\u0013eKY]\t\u001d", "@dW.f/", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E?\u0001\u0014'I9\u0012E\u0006%Bby'\u0001K 7KSHx4'$Za5\rK(YL", "1kT.a\u001e>O\u001fkz_", "EdP8E,?", "9dh#T3NS|\u000ezk(\f\u0013<", "", "\u0013", "4`RAb9R", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u0019dh#T3NS|\u000ezk(\f\u0013<", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private final class Core {
        private static final /* synthetic */ AtomicIntegerFieldUpdater load$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(Core.class, "load$volatile");
        private final int allocated;
        private final /* synthetic */ AtomicReferenceArray keys;
        private volatile /* synthetic */ int load$volatile;
        private final int shift;
        private final int threshold;
        private final /* synthetic */ AtomicReferenceArray values;

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я2\u001d<K!&˛\bDR\u000b|İI\u0006F\u000b6B\u0005#4\u0012\u0006\rnj?2LeV.Zݷ2\u000fy\u0005<$a%yCIT\"Ԃ(ޞQdʴ\u0010pPZ\u0019B?\f&zz,\u0010T']R.BX}@K_\u007f?I`+Ȃ\u0015\"B\"nx\u0015\u0003**~\u0010%|ŲO\u000e\u00183Nt\u0003X\u001bW\u001d\u001a@\u0011\u0005 I%jsf6vy$Ɣ/k\u000fwPf'\u00160Cֈ\rТX'\u001b\u0006*$9PO5C6\u001a\u0017Wpi@\u001bQ\u0002?\u0015h]ݐ;K\u0004WlW\u0010\u0016%+\u0006\r\ft|؛\u0007Ōd\f/˃ oYU&(&\u0001RȡHǬ\u0012\u0006/Ξ~;(m \u000eiοIԢlг\u0006`J\u007f\ti\u0007%3\tK+o\u001a=Ϣ\u000eޅ\u001dP?{\u0013\u0015̽'\u0013"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E?\u0001\u0014'I9\u0012E\u0006%Bby'\u0001K 7KSHx4'$Za5\rK(Y5\u0005QYNjBR\u0007.\u0010\u0019j\u000e2:\r\u0012UP.{\u001a", "\u0013", "", "4`RAb9R", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u007f\u0017\u0014WqW@\u007f45f\u0007\u001c>7s8VAKxA\u001e\u001ewS9\u0003i\u0014J\u0002e%V[,29xG#\u0019^\u0017\u00180\u001e\r#B4wBF#\u00125WK\u001cx\n\n%\u0012?s=\u0018\u001a\u0001", "7mS2k", "", "9dh", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "D`[BX", "4h]1A,Qb", "", "6`b\u001bX?M", "", "<dgA", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "@d\\<i,", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
        private final class KeyValueIterator<E> implements Iterator<E>, KMutableIterator {
            private final Function2<K, V, E> factory;
            private int index = -1;
            private K key;
            private V value;

            /* JADX WARN: Multi-variable type inference failed */
            public KeyValueIterator(Function2<? super K, ? super V, ? extends E> function2) {
                this.factory = function2;
                findNext();
            }

            private final void findNext() {
                K k2;
                while (true) {
                    int i2 = this.index + 1;
                    this.index = i2;
                    if (i2 >= ((Core) Core.this).allocated) {
                        return;
                    }
                    HashedWeakRef hashedWeakRef = (HashedWeakRef) Core.this.getKeys().get(this.index);
                    if (hashedWeakRef != null && (k2 = (K) hashedWeakRef.get()) != null) {
                        this.key = k2;
                        Object obj = (V) Core.this.getValues().get(this.index);
                        if (obj instanceof Marked) {
                            obj = (V) ((Marked) obj).ref;
                        }
                        if (obj != null) {
                            this.value = (V) obj;
                            return;
                        }
                    }
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < ((Core) Core.this).allocated;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.util.Iterator
            public E next() {
                if (this.index >= ((Core) Core.this).allocated) {
                    throw new NoSuchElementException();
                }
                Function2<K, V, E> function2 = this.factory;
                K k2 = this.key;
                if (k2 == false) {
                    Intrinsics.throwUninitializedPropertyAccessException("key");
                    k2 = (K) Unit.INSTANCE;
                }
                V v2 = this.value;
                if (v2 == false) {
                    Intrinsics.throwUninitializedPropertyAccessException("value");
                    v2 = (V) Unit.INSTANCE;
                }
                E e2 = (E) function2.invoke(k2, v2);
                findNext();
                return e2;
            }

            @Override // java.util.Iterator
            public Void remove() {
                ConcurrentWeakMapKt.noImpl();
                throw new KotlinNothingValueException();
            }
        }

        public Core(int i2) {
            this.allocated = i2;
            this.shift = Integer.numberOfLeadingZeros(i2) + 1;
            this.threshold = (i2 * 2) / 3;
            this.keys = new AtomicReferenceArray(i2);
            this.values = new AtomicReferenceArray(i2);
        }

        public final /* synthetic */ AtomicReferenceArray getKeys() {
            return this.keys;
        }

        private final /* synthetic */ int getLoad$volatile() {
            return this.load$volatile;
        }

        public final /* synthetic */ AtomicReferenceArray getValues() {
            return this.values;
        }

        private final int index(int i2) {
            return (i2 * (-1640531527)) >>> this.shift;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object putImpl$default(Core core, Object obj, Object obj2, HashedWeakRef hashedWeakRef, int i2, Object obj3) {
            if ((i2 & 4) != 0) {
                hashedWeakRef = null;
            }
            return core.putImpl(obj, obj2, hashedWeakRef);
        }

        private final void removeCleanedAt(int i2) {
            Object obj;
            do {
                obj = getValues().get(i2);
                if (obj == null || (obj instanceof Marked)) {
                    return;
                }
            } while (!Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0.m(getValues(), i2, obj, null));
            ConcurrentWeakMap.this.decrementSize();
        }

        private final /* synthetic */ void setLoad$volatile(int i2) {
            this.load$volatile = i2;
        }

        private final /* synthetic */ void update$atomicfu(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Function1<? super Integer, Integer> function1) {
            int i2;
            do {
                i2 = atomicIntegerFieldUpdater.get(obj);
            } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i2, function1.invoke(Integer.valueOf(i2)).intValue()));
        }

        public final void cleanWeakRef(HashedWeakRef<?> hashedWeakRef) {
            int iIndex = index(hashedWeakRef.hash);
            while (true) {
                HashedWeakRef<?> hashedWeakRef2 = (HashedWeakRef) getKeys().get(iIndex);
                if (hashedWeakRef2 == null) {
                    return;
                }
                if (hashedWeakRef2 == hashedWeakRef) {
                    removeCleanedAt(iIndex);
                    return;
                } else {
                    if (iIndex == 0) {
                        iIndex = this.allocated;
                    }
                    iIndex--;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final V getImpl(K k2) {
            int iIndex = index(k2.hashCode());
            while (true) {
                HashedWeakRef hashedWeakRef = (HashedWeakRef) getKeys().get(iIndex);
                if (hashedWeakRef == null) {
                    return null;
                }
                Object obj = hashedWeakRef.get();
                if (Intrinsics.areEqual(k2, obj)) {
                    V v2 = (V) getValues().get(iIndex);
                    return v2 instanceof Marked ? (V) ((Marked) v2).ref : v2;
                }
                if (obj == null) {
                    removeCleanedAt(iIndex);
                }
                if (iIndex == 0) {
                    iIndex = this.allocated;
                }
                iIndex--;
            }
        }

        public final <E> Iterator<E> keyValueIterator(Function2<? super K, ? super V, ? extends E> function2) {
            return new KeyValueIterator(function2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:79:0x0060, code lost:
        
            r1 = getValues().get(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x006a, code lost:
        
            if ((r1 instanceof kotlinx.coroutines.debug.internal.Marked) == false) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x0070, code lost:
        
            return kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.REHASH;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x0079, code lost:
        
            if (com.google.common.util.concurrent.Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0.m(getValues(), r2, r1, r7) == false) goto L103;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x007b, code lost:
        
            return r1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object putImpl(K r6, V r7, kotlinx.coroutines.debug.internal.HashedWeakRef<K> r8) {
            /*
                r5 = this;
                int r0 = r6.hashCode()
                int r2 = r5.index(r0)
                r3 = 0
            L9:
                java.util.concurrent.atomic.AtomicReferenceArray r0 = r5.getKeys()
                java.lang.Object r0 = r0.get(r2)
                kotlinx.coroutines.debug.internal.HashedWeakRef r0 = (kotlinx.coroutines.debug.internal.HashedWeakRef) r0
                if (r0 != 0) goto L4d
                r4 = 0
                if (r7 != 0) goto L19
                return r4
            L19:
                if (r3 != 0) goto L35
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = getLoad$volatile$FU()
            L1f:
                int r1 = r3.get(r5)
                int r0 = r5.threshold
                if (r1 < r0) goto L2c
                kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.access$getREHASH$p()
                return r0
            L2c:
                int r0 = r1 + 1
                boolean r0 = r3.compareAndSet(r5, r1, r0)
                if (r0 == 0) goto L1f
                r3 = 1
            L35:
                if (r8 != 0) goto L42
                kotlinx.coroutines.debug.internal.HashedWeakRef r8 = new kotlinx.coroutines.debug.internal.HashedWeakRef
                kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V> r0 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.this
                java.lang.ref.ReferenceQueue r0 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.access$getWeakRefQueue$p(r0)
                r8.<init>(r6, r0)
            L42:
                java.util.concurrent.atomic.AtomicReferenceArray r0 = r5.getKeys()
                boolean r0 = com.google.common.util.concurrent.Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0.m(r0, r2, r4, r8)
                if (r0 != 0) goto L60
                goto L9
            L4d:
                java.lang.Object r1 = r0.get()
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r1)
                if (r0 == 0) goto L7c
                if (r3 == 0) goto L60
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = getLoad$volatile$FU()
                r0.decrementAndGet(r5)
            L60:
                java.util.concurrent.atomic.AtomicReferenceArray r0 = r5.getValues()
                java.lang.Object r1 = r0.get(r2)
                boolean r0 = r1 instanceof kotlinx.coroutines.debug.internal.Marked
                if (r0 == 0) goto L71
                kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.access$getREHASH$p()
                return r0
            L71:
                java.util.concurrent.atomic.AtomicReferenceArray r0 = r5.getValues()
                boolean r0 = com.google.common.util.concurrent.Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0.m(r0, r2, r1, r7)
                if (r0 == 0) goto L60
                return r1
            L7c:
                if (r1 != 0) goto L81
                r5.removeCleanedAt(r2)
            L81:
                if (r2 != 0) goto L85
                int r2 = r5.allocated
            L85:
                int r2 = r2 + (-1)
                goto L9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.putImpl(java.lang.Object, java.lang.Object, kotlinx.coroutines.debug.internal.HashedWeakRef):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final ConcurrentWeakMap<K, V>.Core rehash() {
            int i2;
            Object obj;
            while (true) {
                ConcurrentWeakMap<K, V>.Core core = (ConcurrentWeakMap<K, V>.Core) ConcurrentWeakMap.this.new Core(Integer.highestOneBit(RangesKt.coerceAtLeast(ConcurrentWeakMap.this.size(), 4)) * 4);
                int i3 = this.allocated;
                while (i2 < i3) {
                    HashedWeakRef hashedWeakRef = (HashedWeakRef) getKeys().get(i2);
                    Object obj2 = hashedWeakRef != null ? hashedWeakRef.get() : null;
                    if (hashedWeakRef != null && obj2 == null) {
                        removeCleanedAt(i2);
                    }
                    while (true) {
                        obj = getValues().get(i2);
                        if (obj instanceof Marked) {
                            obj = ((Marked) obj).ref;
                            break;
                        }
                        if (Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0.m(getValues(), i2, obj, ConcurrentWeakMapKt.mark(obj))) {
                            break;
                        }
                    }
                    i2 = (obj2 == null || obj == null || core.putImpl(obj2, obj, hashedWeakRef) != ConcurrentWeakMapKt.REHASH) ? i2 + 1 : 0;
                }
                return core;
            }
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u0006DLc\u0003)I\u00066\u00154B\u0015ӬT\u0014}\u0007tia2JfV.\u0003_:\u0011{{z#k&\u0002C\u0002UH~b\u001e_Rui\u0007J\u0011\u000bS\u0013\u0014\u0019\u0011jbJǤ|_\u0018\u0013@G8RAW\b=oa%:\u0013+J\"nzK\u0015ʀ.H\u001e\u0003KWY\u000e*0vp\u0011ļ\u000f̂\t\"\u001a\u0006L(\u0019 bm\\=\u0019\u0001k=G#9j\u0019Ď)ۢ4\u0005U\rT\\?\u000f|j,2Ñ;B"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E?\u0001\u0014'I9\u0012E\u0006%Bby'\u0001K 7KSHx4'$Za5\rK(Y5\u0007P[[@2", "\u0019", "$", "", "9dh", "D`[BX", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq>", "5dc\u0018X@", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "5dc#T3NS", "Adc#T3NS", "<df#T3NS", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private static final class Entry<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {
        private final K key;
        private final V value;

        public Entry(K k2, V v2) {
            this.key = k2;
            this.value = v2;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            ConcurrentWeakMapKt.noImpl();
            throw new KotlinNothingValueException();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&˛\bDZc|İI\u0006F\u000b6B\u0005#4\u0012\u0006\rnj?1LeV7ZS0\u0010s{BKcҕwٔ=kڼ&$\u000fO\\f\u0018tZ\\\u001bCU\u0005Dx+KYk\u0007^*!BD\u007f?iݹ\u007f?I`+5\u0015\"B\"ny3\u0003ʀ.J\u0016y\tG\u0014\u001f 9Xph\\=Q\u0013%*\u0006t G2֔kNDT5jH<;\tyD^'\u00160+[SЖTw+\u0005b6=P9E\u0015[م\u0013\tb[u\u0002OsM\u0005\u001f'U- ֘Y͏\\\u007f\u001cƃ{a\u001bb\u000b&\u000b\u000b\b5b˃-յgOh\u0010.~\t\u0004ɇ@\u0013"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E?\u0001\u0014'I9\u0012E\u0006%Bby'\u0001K 7KSHx4'$Za5\rK(Y5\rG`?(cbr+\u0014!0", "\u0013", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c}%&Tk\fK^5DUz'7[\u0016=#", "4`RAb9R", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u007f\u0017\u0014WqW@\u007f45f\u0007\u001c>7s8VAKxA\u001e\u001ewS9\u0003i\u0014J\u0002|.RX;cV{\u0007\u0019#bWO;\u0016\u0003hE.wR\u0001\u007f\u00185G\u0011?r\nXkQ&", "Ahi2", "", "5dc \\A>", "u(8", "/cS", "", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "7sT?T;H`", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private final class KeyValueSet<E> extends AbstractMutableSet<E> {
        private final Function2<K, V, E> factory;

        /* JADX WARN: Multi-variable type inference failed */
        public KeyValueSet(Function2<? super K, ? super V, ? extends E> function2) {
            this.factory = function2;
        }

        @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(E e2) {
            ConcurrentWeakMapKt.noImpl();
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.collections.AbstractMutableSet
        public int getSize() {
            return ConcurrentWeakMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return ((Core) ConcurrentWeakMap.getCore$volatile$FU().get(ConcurrentWeakMap.this)).keyValueIterator(this.factory);
        }
    }

    public ConcurrentWeakMap() {
        this(false, 1, null);
    }

    public ConcurrentWeakMap(boolean z2) {
        this.core$volatile = new Core(16);
        this.weakRefQueue = z2 ? new ReferenceQueue<>() : null;
    }

    public /* synthetic */ ConcurrentWeakMap(boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? false : z2);
    }

    public static final Map.Entry _get_entries_$lambda$1(Object obj, Object obj2) {
        return new Entry(obj, obj2);
    }

    public static final Object _get_keys_$lambda$0(Object obj, Object obj2) {
        return obj;
    }

    private final void cleanWeakRef(HashedWeakRef<?> hashedWeakRef) {
        ((Core) core$volatile$FU.get(this)).cleanWeakRef(hashedWeakRef);
    }

    public final void decrementSize() {
        _size$volatile$FU.decrementAndGet(this);
    }

    private final /* synthetic */ Object getCore$volatile() {
        return this.core$volatile;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater getCore$volatile$FU() {
        return core$volatile$FU;
    }

    private final /* synthetic */ int get_size$volatile() {
        return this._size$volatile;
    }

    private final synchronized V putSynchronized(K k2, V v2) {
        V v3;
        Core coreRehash = (Core) core$volatile$FU.get(this);
        while (true) {
            v3 = (V) Core.putImpl$default(coreRehash, k2, v2, null, 4, null);
            if (v3 == ConcurrentWeakMapKt.REHASH) {
                coreRehash = coreRehash.rehash();
                core$volatile$FU.set(this, coreRehash);
            }
        }
        return v3;
    }

    private final /* synthetic */ void setCore$volatile(Object obj) {
        this.core$volatile = obj;
    }

    private final /* synthetic */ void set_size$volatile(int i2) {
        this._size$volatile = i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Iterator<K> it = keySet().iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (V) ((Core) core$volatile$FU.get(this)).getImpl(obj);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public Set<Map.Entry<K, V>> getEntries() {
        return new KeyValueSet(new Function2() { // from class: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ConcurrentWeakMap._get_entries_$lambda$1(obj, obj2);
            }
        });
    }

    @Override // kotlin.collections.AbstractMutableMap
    public Set<K> getKeys() {
        return new KeyValueSet(new Function2() { // from class: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ConcurrentWeakMap._get_keys_$lambda$0(obj, obj2);
            }
        });
    }

    @Override // kotlin.collections.AbstractMutableMap
    public int getSize() {
        return _size$volatile$FU.get(this);
    }

    @Override // kotlin.collections.AbstractMutableMap, java.util.AbstractMap, java.util.Map
    public V put(K k2, V v2) {
        V vPutSynchronized = (V) Core.putImpl$default((Core) core$volatile$FU.get(this), k2, v2, null, 4, null);
        if (vPutSynchronized == ConcurrentWeakMapKt.REHASH) {
            vPutSynchronized = putSynchronized(k2, v2);
        }
        if (vPutSynchronized == null) {
            _size$volatile$FU.incrementAndGet(this);
        }
        return vPutSynchronized;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (obj == 0) {
            return null;
        }
        V vPutSynchronized = (V) Core.putImpl$default((Core) core$volatile$FU.get(this), obj, null, null, 4, null);
        if (vPutSynchronized == ConcurrentWeakMapKt.REHASH) {
            vPutSynchronized = putSynchronized(obj, null);
        }
        if (vPutSynchronized != null) {
            _size$volatile$FU.decrementAndGet(this);
        }
        return vPutSynchronized;
    }

    public final void runWeakRefQueueCleaningLoopUntilInterrupted() {
        if (this.weakRefQueue == null) {
            throw new IllegalStateException("Must be created with weakRefQueue = true".toString());
        }
        while (true) {
            try {
                Reference<? extends K> referenceRemove = this.weakRefQueue.remove();
                Intrinsics.checkNotNull(referenceRemove, "null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>");
                cleanWeakRef((HashedWeakRef) referenceRemove);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
