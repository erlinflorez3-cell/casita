package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: PersistentOrderedSet.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯT\u001d<K!&˛\bDZc|\u0004W\u00068é6B\rӬ4\u0012}\u0007njO0Le^.ZS0\u0014s{B*c$wHCU(\u001a*ޛWN}gvJ`\u000bK\u000f\u0014\u001f\u0001j2I]xk8\u00172HpG3coE9fu<ӌ6݅@]\"\u0007\u0007ɝ8G@|\u000bE[\fX/npjX\u001dO\u0015\u001aX\u0005l!9\u001d\u0002(yFNz_R19\u0002\u0018E^-m4\u0015O#E\u0003*\u001d\u0007o#CLG7%%\nΈ\u0017Tk?1F Cݾl'53\u0012\reHp\u0006$\u0017;OCƞ!'\r\t_s$'aՒ*_ח\u0012(\u0006\u000fD'J\u0019&\f7J>-PǑ6\u000fc~\u0001iXV\u0012`R\u007f1ʨd.k\u0014{7G3~Wq=)Nmަ3&d7Iz/ul\u0014p\u0017+T.\u0383_R\u0007Q\u0011b\u0018tUm2\r\u0013\u00068\u0017HG6\u07fcB\u0094.ϲ)7iVk.y `Jwx\u0015`\u001fׅ\u0018q\u000fخ\"7/EJ!\u0012jFt\u0005\"¬\u0003Y\\\u0015[/l\u00074ܱY4Ϣ{</9Xn]\n\u0002p]_\u001a%eωeZ\u001f{\u001cyQjC7acFРbx$?j~3{-V\u001c&h}@(BJz\u0010.ӻrO<\u001d@U\n\"D.A\u0019\u0013év\u001adV\n\u0017\u0017\u0004rn \u0001d3ZѰ\u0018%%\u0013\u000fftv\u007fi\tIbʉ\u000f9sU\"I'(m$~3+&]ѩuõKmT܁dn\u001c~c\u0006p4(>i;M\u0015\u001f~_Ʌ\u0012/UL!l\u007fSh\u05fe|܃}\u0015CÜFi\u000eu~81~XSl\u00198u\ruyΩfѣ}gNک_eZ\u0018iH\u001a\u0005\u0011gTNf\f;stݩ\u0003Ȟ&\u0001M/I7+'߹\u0018U"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WKFh\u000e\u001a\u001a\u001cDjyQ@\u001dFy\"u@\u0017hU#JyTOIp9d\u0015n\u0007i9:1\u0014p\u0007\u001bw&", "\u0013", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c}%&Tk\fKd%D/", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$xN8\u001b\tgP$wS%\u001f\u0017\u0002", "4ha@g\fES!~\u0004m", "", ":`bA83>[\u0019\b\n", "6`b5@(I", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp*R\u001b\u0011d\u0015\u0003O-vUYh\t*=Se\u0012`\u00175", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WKFh\u000e\u001a\u001a\u001cDjyQ@\u001dFy\"u@\u0017hU#F}PGS8", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015IL:x>\"\u0014{+7\u0011k7X\u0005'\u0011Y^5kVz=]\u0012m\u001dN8\u0016\u0001`\u000b*xS>#\u0011?\u0013\u007fEo\b\f\u0014\u001d9tyP \u0014O\u0002%\u0005=&oF#c\u0002RHEj*m\u001b[,`DC2]u!#x_*\u0007\u0003Sxn]CRgT'~F3>vj)A}X$p2t\u000fl", "5dc\u0013\\9Lbx\u0006zf,\u0006\u0018mr\u00101\u000bD\t\u0017\u0011To\u0015<r35", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "5dc\u0015T:A;\u0015\n9k<\u0006\u00183m\u007f\"\t@\b\u0017\u0013Uo", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006v8DY\u000b)3t_4WRBo=1^fk@\u000ec*]z1PZ\u00180dZ\u0003L\u0010\u000fa\u000e\u0018/\u0015\u0010`A,nMF\u001b\u00170S\u000bI2\u0005\u0014\u001e\u001eDfmIVwC\u0005^`A6vJgnyPP(^8gs[(2", "5dc\u0019T:M3 ~\u0003^5\fG<u\t7\u007fH\u0001\u0011$Gv\u000e8\u0005%", "Ahi2", "", "5dc \\A>", "u(8", "/cS", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'| \u0016Ty\u0012;\nn3c\u0006+A{\u0016wZSDz8&\u00152aL\u0016c9Wr.\u0011RX;cV{P]\u0010d\u0015U+\u000b\u0014]K-|\u000e;'\u0010<X}8o\u0001U\u0001\u000eBxtPe\u0010P\t\u0003uP~", "/cS\u000e_3", "3kT:X5Ma", "", "0tX9W,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$xN8\u001b\tgP$wS%\u001f\u0017j&\u0012?o\u007f\f#c", "1kT.e", "1n]AT0Ga", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "7sT?T;H`", "", "@d\\<i,", "@d\\<i,\u001aZ ", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "@dc.\\5\u001aZ ", "\u0011n\\=T5B]\"", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PersistentOrderedSet<E> extends AbstractSet<E> implements PersistentSet<E> {
    private final Object firstElement;
    private final PersistentHashMap<E, Links> hashMap;
    private final Object lastElement;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final PersistentOrderedSet EMPTY = new PersistentOrderedSet(EndOfChain.INSTANCE, EndOfChain.INSTANCE, PersistentHashMap.Companion.emptyOf$runtime_release());

    public final Object getFirstElement$runtime_release() {
        return this.firstElement;
    }

    public final Object getLastElement$runtime_release() {
        return this.lastElement;
    }

    public final PersistentHashMap<E, Links> getHashMap$runtime_release() {
        return this.hashMap;
    }

    public PersistentOrderedSet(Object obj, Object obj2, PersistentHashMap<E, Links> persistentHashMap) {
        this.firstElement = obj;
        this.lastElement = obj2;
        this.hashMap = persistentHashMap;
    }

    @Override // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.hashMap.size();
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.hashMap.containsKey(obj);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> add(E e2) {
        if (this.hashMap.containsKey(e2)) {
            return this;
        }
        if (isEmpty()) {
            return new PersistentOrderedSet(e2, e2, this.hashMap.put(e2, new Links()));
        }
        Object obj = this.lastElement;
        Links links = this.hashMap.get((E) obj);
        Intrinsics.checkNotNull(links);
        return new PersistentOrderedSet(this.firstElement, e2, this.hashMap.put((E) obj, links.withNext(e2)).put(e2, new Links(obj)));
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> addAll(Collection<? extends E> collection) {
        PersistentSet.Builder<E> builder = builder();
        builder.addAll(collection);
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> remove(E e2) {
        Links links = this.hashMap.get(e2);
        if (links == null) {
            return this;
        }
        PersistentHashMap persistentHashMapRemove = this.hashMap.remove(e2);
        if (links.getHasPrevious()) {
            V v2 = persistentHashMapRemove.get(links.getPrevious());
            Intrinsics.checkNotNull(v2);
            persistentHashMapRemove = persistentHashMapRemove.put(links.getPrevious(), ((Links) v2).withNext(links.getNext()));
        }
        if (links.getHasNext()) {
            V v3 = persistentHashMapRemove.get(links.getNext());
            Intrinsics.checkNotNull(v3);
            persistentHashMapRemove = persistentHashMapRemove.put(links.getNext(), ((Links) v3).withPrevious(links.getPrevious()));
        }
        return new PersistentOrderedSet(!links.getHasPrevious() ? links.getNext() : this.firstElement, !links.getHasNext() ? links.getPrevious() : this.lastElement, persistentHashMapRemove);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> removeAll(Collection<? extends E> collection) {
        PersistentSet.Builder<E> builder = builder();
        builder.removeAll(collection);
        return builder.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> removeAll(Function1<? super E, Boolean> function1) {
        PersistentSet.Builder<E> builder = builder();
        CollectionsKt.removeAll(builder, function1);
        return builder.build();
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> retainAll(Collection<? extends E> collection) {
        PersistentSet.Builder<E> builder = builder();
        builder.retainAll(collection);
        return builder.build();
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> clear() {
        return Companion.emptyOf$runtime_release();
    }

    @Override // kotlin.collections.AbstractSet, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new PersistentOrderedSetIterator(this.firstElement, this.hashMap);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet.Builder<E> builder() {
        return new PersistentOrderedSetBuilder(this);
    }

    /* JADX INFO: compiled from: PersistentOrderedSet.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\r!4ߚ\u007f\u0007|jA0JfN\u008dSiճ?k*3d`*qٴ?U(}j ]R\u007fm~Lj\u000b\n\u00154\u001b\u0019l2Hc~$܈Ƥ6BuF\u0004_}>Qf\u00058\u0015 `%f{[В\u001cݵL\u0010~ٙŸO\u0014"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WKFh\u000e\u001a\u001a\u001cDjyQ@\u001dFy\"u@\u0017hU#JyTOIp9d\u0015n\u0007i9:1\u0014p\u0007\u001bw\u000f\f\u0014\u0004^\r{V\u0004p=", "", "u(E", "\u0013L?!L", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WKFh\u000e\u001a\u001a\u001cDjyQ@\u001dFy\"u@\u0017hU#JyTOIp9d\u0015n\u0007i9:1\u0014p\u0007\u001bw&", "", "3l_Al\u0016?", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$xN8\u001b\tgP$wS%\u001f\u0017\u0002", "\u0013", "3l_Al\u0016?\u0012&\u000f\u0004m0\u0005\t)r\u007f/{<\u000f\u0017", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <E> PersistentSet<E> emptyOf$runtime_release() {
            return PersistentOrderedSet.EMPTY;
        }
    }
}
