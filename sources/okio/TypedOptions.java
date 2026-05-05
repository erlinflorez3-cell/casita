package okio;

import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Options;
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
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&˛\bDRш|\u0004W\u00068\u000bDB\u0007\"B\u0012\u007fјnjGNL͜P.hS2\u000fq\u007f<$i*yCAZ0Ԃ@\u001dwTm˧|I\u0003\u000bq\u000f6\u001c\tl<I\u001cw\f\u0013?6pq(3,ru8t5O\u0015*@&P\u007f\u0015\u0003**~Ƶ%\u007fSO\u001a\u0018H@\u001fAň\u0011M\u0013\"Z\u001aL1\u0019\u001e\u0013ɡ~:V~u:]1IݚBĚ+_>\u0010\u001e%TX?\u0013\u0007c.+vʺc\u001a{ن\u0005\u07baVaGšWsC\u000ev1w=Wyo6\u0007\u0007jƄ-̠\u0011cz̦t\u0007Wk\u001a3{aqXh\u000eV\u00061Pcɴ\u0006؝\n+`03)t\u0018ԭ7\n"}, d2 = {"\u001anZ6bu-g$~yH7\f\r9n\u000e}", "\"", "", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c}%&Tk\fK])ChS", "\u001aiPCTuNb\u001d\u0006DK(\u0006\b9m[&y@\u000f%l", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E-| \u0016Qwi:t%CgS", ":hbA", "", "=oc6b5L", "\u001anZ6bu(^(\u0003\u0005g:R", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f2\u0002D\u000b`\u0001R~\u0012F\u007f3\u000b\u001dn", "5dc\u0019\\:M\u0012#\u0005~h", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u001cc;B]\"\r9h2\u0001\u0013", "u(;<^0H\u001d\u0003\n\nb6\u0006\u0017\u0005", "Ahi2", "", "5dc \\A>", "u(8", "5dc", "7mS2k", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "\u0011n\\=T5B]\"", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class TypedOptions<T> extends AbstractList<T> implements RandomAccess {
    public static final Companion Companion = new Companion(null);
    private final List<T> list;
    private final Options options;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005\"4\u0012\u0006!nʑA0ZeP.hS2şqڛ5:ӋTqq:\u0016\u001f\u0004\"\u07beSNug7\u0007h\f[\u0015\u0016\u0018\tjrL\u0004z}\u0018\u00151Prg3{nmCnxN\u000b0428@\b/\u001fZX\u001e|\u0013O[\u000e\"0\u0007sJT\u001dM3\"@\r\u0005İ\u0007ʟ[ɡޱ6Mt`@ǜS1hŒR0"}, d2 = {"\u001anZ6bu-g$~yH7\f\r9n\u000efYJ\t\"\u0013Ps\u0018EL", "", "u(E", "=e", "\u001anZ6bu-g$~yH7\f\r9n\u000e}", "\"", "D`[BX:", "", "3mR<W,", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final <T> TypedOptions<T> of(Iterable<? extends T> values, Function1<? super T, ? extends ByteString> encode) {
            Intrinsics.checkNotNullParameter(values, "values");
            Intrinsics.checkNotNullParameter(encode, "encode");
            List list = CollectionsKt.toList(values);
            Options.Companion companion = Options.Companion;
            int size = list.size();
            ByteString[] byteStringArr = new ByteString[size];
            for (int i2 = 0; i2 < size; i2++) {
                byteStringArr[i2] = encode.invoke((Object) list.get(i2));
            }
            return new TypedOptions<>(list, companion.of(byteStringArr));
        }
    }

    public TypedOptions(List<? extends T> list, Options options) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(options, "options");
        this.options = options;
        List<T> list2 = CollectionsKt.toList(list);
        this.list = list2;
        if (list2.size() != options.size()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @JvmStatic
    public static final <T> TypedOptions<T> of(Iterable<? extends T> iterable, Function1<? super T, ? extends ByteString> function1) {
        return Companion.of(iterable, function1);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public T get(int i2) {
        return this.list.get(i2);
    }

    public final List<T> getList$okio() {
        return this.list;
    }

    public final Options getOptions$okio() {
        return this.options;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.list.size();
    }
}
