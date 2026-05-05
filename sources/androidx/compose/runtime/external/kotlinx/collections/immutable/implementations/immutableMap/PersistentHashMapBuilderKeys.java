package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.markers.KMutableSet;
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
/* JADX INFO: compiled from: PersistentHashMapBuilderContentViews.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0006DLc\u0003%I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljA0RkP.XT2\u000fy\u0005<$a%yCIU\"}(\tWNu\u000fvJ`\u000bIƤ\u001cǝ!l2կcw\u0006\u0014\u00151Poo9]qM9'sd\u0006P82:\n\u0005G\u0019XJP\u000e\u000bSY\u000f*<PrJRC˟\u0015\u001c\"\u0006t\u001f/\"֔kNDM5pH9;\u0003\u0018M~+m<\u0015MCϿ\u001b;˼za,8\t=C#=S1\u0016\u0019o\b\u0017M\u0002U\u0005\u00172W/W\u007fo6\u000fÜZƚ+̠\u0011]\u00013%\u0012_q$-;QsK\u0007ʫV\nAԟ\r\u0005\u0017\u001c\u0019?H\\8Jj\u0016\u001aKt)ԟ\u0007dؿbB\u000e\b2N%(\u0018?;;+f\bĥK\u001b^72\u0004;\"yЪpĲ_T\u0016֫e-b}i1\u007fGs\u001d%˺[ǀq\b\td\b2\u00129Ѓ\u0004C"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp*R\u001b\u0011d\u0015\u0003O-vUYh\t*=Se\u0012`\u0017<-`A9$!W\u0019/v&", "\u0019", "$", "", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c}%&Tk\fK^5DUz'7[\u0016=#", "0tX9W,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp*R\u001b\u0011d\u0015\u0003O-vUYh\t*=Se\u0012`\u0017<-`A9$!G", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW<\n45f\u0007\u001c>7\u001c8\\J?tGg\u0013rh@\u0007a;R\u00010U\u0016R4db\u00029\u0011\u0019ZWR3\u0018\fYI$wS3.\f6R\u0010\u0005l\t\u0014&\u001d1gwB>\fRC\u007fuN7lTh_\u0003V$Ap-L\bjyl>A#\u0014~n^Y", "Ahi2", "", "5dc \\A>", "u(8", "/cS", "", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "1kT.e", "", "1n]AT0Ga", "7sT?T;H`", "", "@d\\<i,", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PersistentHashMapBuilderKeys<K, V> extends AbstractMutableSet<K> implements Set<K>, KMutableSet {
    public static final int $stable = 8;
    private final PersistentHashMapBuilder<K, V> builder;

    public PersistentHashMapBuilderKeys(PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        this.builder = persistentHashMapBuilder;
    }

    @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(K k2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.builder.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<K> iterator() {
        return new PersistentHashMapBuilderKeysIterator(this.builder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!this.builder.containsKey(obj)) {
            return false;
        }
        this.builder.remove(obj);
        return true;
    }

    @Override // kotlin.collections.AbstractMutableSet
    public int getSize() {
        return this.builder.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.builder.containsKey(obj);
    }
}
