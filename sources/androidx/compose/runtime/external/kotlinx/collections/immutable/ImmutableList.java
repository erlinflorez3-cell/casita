package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.markers.KMappedMarker;
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
/* JADX INFO: compiled from: ImmutableList.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&˛\bDR\u0002|\u0004W\u00068\u000b4B\u0007\":\u0018\u007f\u0007lk?\u000fZ͜p2Xݷ8\u000e\nzd*k&\u0002C\u0002TH}R\u000f_Pwg5I\t\f{\u000e\f^\u0015x.a[\t_\"\u000fhԏ\u001eЀcQ}@Q`#:5$@'Py3\u0005`>ѳ\u000fٜ͌CO\u0014\u00146_\u001f9Ŏ\u0011Tũ\u001e\u0011"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$qV3\u001d\u0014U>+n+;-\u0017\u0002", "\u0013", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$qV3\u001d\u0014U>+n\"A&\u000f,G\u0011?r\na", "AtQ\u0019\\:M", "4q^:<5=S,", "", "Bn8;W,Q", "!tQ\u0019\\:M", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface ImmutableList<E> extends List<E>, ImmutableCollection<E>, KMappedMarker {
    @Override // java.util.List
    default ImmutableList<E> subList(int i2, int i3) {
        return new SubList(this, i2, i3);
    }

    /* JADX INFO: compiled from: ImmutableList.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&˛\bDZc|\u0004W\u00068\u000b4B\u0007\":\u0018\u007f\u0007ls?0Z͜p0XR8\u000e\u001c\u0002D&k$8BiUJ\u00042\u000b_N.f\u001dK\u001b,S\u0019\u0014\u0018\u0011p<Kex\u0014\u0011=2RsM6eok=pxD\n82P<ѩ\t\u0001(0\u0011$\u0005\u0006[KB\u0011`D~Fj\r{\t`Ş\u0006̧$\u0001,i0jDV\u0005cJ13\u0003 A|'\u00104\u000bP%F\u0003+=zo#C@e9[9$\u000f\u0015Ys?1CHܸ\u0011ص+'3ɞDcD[\u0018\u0014C/&\u0558_ę*\\\rĩ1\u001e53gcyTD|Nߕ}Ɂ@\b&\b-Q<7jx\u0016\u0010Kz\u0003UPP8]p\u007fQʫ8а)\u007f;ٿ\n'tVy;GR\u000eީ\u0007ڟ\"#\t͙ĸ_c"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$qV3\u001d\u0014U>+n+;-\u0017j7\u00128O\u0005\u001a%c", "\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$qV3\u001d\u0014U>+n+;-\u0017\u0002", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c}%&Tk\fK])ChS", "And?V,", "4q^:<5=S,", "", "Bn8;W,Q", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW<\n45f\u0007\u001c>7\u001c8\\J?tGg\u0013rh@\u0007a;R\u00010U\u0016R4db\u00029\u0011\u0019ZW23\u0015\u0015h=!uD\u001e#\u0016;\u001fe\u001f,q", "-rXGX", "Ahi2", "5dc \\A>", "u(8", "5dc", "7mS2k", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "AtQ\u0019\\:M", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class SubList<E> extends AbstractList<E> implements ImmutableList<E> {
        private int _size;
        private final int fromIndex;
        private final ImmutableList<E> source;
        private final int toIndex;

        /* JADX WARN: Multi-variable type inference failed */
        public SubList(ImmutableList<? extends E> immutableList, int i2, int i3) {
            this.source = immutableList;
            this.fromIndex = i2;
            this.toIndex = i3;
            ListImplementation.checkRangeIndexes$runtime_release(i2, i3, immutableList.size());
            this._size = i3 - i2;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public E get(int i2) {
            ListImplementation.checkElementIndex$runtime_release(i2, this._size);
            return this.source.get(this.fromIndex + i2);
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this._size;
        }

        @Override // kotlin.collections.AbstractList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
        public ImmutableList<E> subList(int i2, int i3) {
            ListImplementation.checkRangeIndexes$runtime_release(i2, i3, this._size);
            ImmutableList<E> immutableList = this.source;
            int i4 = this.fromIndex;
            return new SubList(immutableList, i2 + i4, i4 + i3);
        }
    }
}
