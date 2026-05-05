package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.builders.ListBuilder;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$MultiFileClassPart.<init>(KotlinClassMetadata.kt:308)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:54)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯV\u001d̉=!,\b\bDJc|\u0004O%8\u000b4B\u0007\":\u0018\u007fјnjO0LeV.ZS@\u000fs{:'c$\u007fRCU(Ԃ*ޛWNu\u0004vJ`\u0016K\u000f\u0014\u001f\u0001j2I]xk,\u0017˰JoU3UڎE9vt>ӌ8R0\u0600\u0012\u000b\u0011\u001c:HVv)Bk\u000e\u0018ؓNpj\\\u001bN\u001d \"\bN G\u001e\u000bi\u00155`*k=G)\u0013kRNm_^{m\u000fLÖ5\r'e,/X7c\u001aUn\u0011\rjrO\u000bOwM\u0007x'm+wug8h\u007fB\u001dYVոar,eKīfѨ&˃g\u0019YS&.\b|\f\r\u0003\u0004<\u0005GJ4Ʀ(f8)Az\u000bjPX\u0012dR\u0002\u000ba|\u0017S\u0002C-I\u001b\u0015Y\u0010BϭR7\u0002\u000eS̖)Ҡmďsc\u001cj-\u001b\u0003|\u00025_KUH|\u000f Ɵs\u001c\u007fp\u000eB\u0004^L03\n\u001eF\u0017S<\"ݿ)9\f\u0010V\\o\u0007\tpjih\u0001Xn1\u001f\u001eE;!\u0010jDj\u0006\u001ab\u001bВ2ҭQ\u001cb\u001a\u0016:!.t}L#5\u0010\u0015c\u0017x\u000bOc܃3C\u0017?g\u007f\u0004\u0012g9d4cc\u0014\u001aog\u000f\u001aO>r\u0005\u001fzpbRșb͈&2V\u0001(\n\n[f\u0012#4Oqb4Z39^\u001bǽ\u0011\u001e\t@\u0015#mq\u0001\u0016\u000fVC$IiRv)\u0003Vʔ~o\u0018|W0\u0015`P2\bPM64m:nD~3\u0007E\b.F\bNMƂz*&Y\n9.\u001a\u007feȠA\u0013\u001d\u0019A_\u0010H]R\u0003gaMX;)\f\u001a\u0011AÜ<{8n~HxjxT\u0005!0\fvx3\nt\u007f@ut\n\u000eϊӝ\u000f[Lf\u000b2gZfB\r\u000b%\u001d5\u0003\u0006!+E[RG\u001f\u001cߐ\"C=immu-\nbU:#t40q5\bb\u007f}xծΒMY\r_:@z%ZNzy\u0018BOH;2hCjݥdLu\u0011?\u007fv\u0007r!\u001fy\"?+\u0014\fVFe:uS}Zrq$1OY܊{\u0002sb\u001bL\u001f\nQ\u0010_\u0012B KDnW\u0011.v\u000b\f5DgSh\u0015>\u0019$z@j\u0007+EZȫ\u0014$#\u0006Va\u001f\u0017xV\"b\u001d՝Z܂\\[P\bfѾ\u0011O)ܩ\u00037"}, d2 = {"0tX9W", "", "\u0013", "0tX9W,K", "", "0tX9W\u0013Ba(b\u0004m,\n\u0012+l", "1`_.V0Mg", "", "0tX9W,K/\u0017\u000e~h5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "1gT0^\nHc\"\u000edo,\n\n6o\u0012", "1nd;g", "1gT0^\u0010GR\u0019\u0012do,\n\n6o\u0012", "7mS2k", "1n[9X*MW#\bih\b\n\u0016+y", "", "", "1n[9X*MW#\b", "", "uKY.i(\bc(\u0003\u0002(\n\u0007\u00106e}7\u007fJ\nlZ=V\u00138\b!~`y)97\u007f+RC9z\n", "\"", "/qa.l", "uKY.i(\bc(\u0003\u0002(\n\u0007\u00106e}7\u007fJ\nl\r.t\nMrn<U\u0007\"\u0001W\u00133MAJAw\u0014{m]J\u0003-3J\u007f)\u00116K1\\P\u0002\u0013", "1qT.g,%W'\u000eWn0\u0004\b/r", ":hbAB-", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u001eKz,~@\u0002.FC", "Bda:\\5:b\u0019\\\u0005e3|\u0007>i\n1jJ\\$$C\u0004", "1n[9X*MW#\bhbA|", "uHJ\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016D\r}Lk\u001f8@,1b\u007fi!j\u001b.KR\u0011", "1n_FG6\u001a`&z\u000fH-X\u0012C", "7rE.e(KU'", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q5D\r}Lk\u001f8@,1b\u007fi!j\u001b.KR\u0011", "Agd3Y3>R", "", "@`]1b4", "\u001aiPCTuNb\u001d\u0006DK(\u0006\b9mU", "Bn;6f;", "\u001aiPCTuNb\u001d\u0006D>5\r\u0011/r{7\u007fJ\nl", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{/:65-*:.315o\u0003.*)!\u001e.\"'%)\u007f(")
public class CollectionsKt__CollectionsJVMKt {
    public static final <E> List<E> build(List<E> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((ListBuilder) builder).build();
    }

    private static final <E> List<E> buildListInternal(int i2, Function1<? super List<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        List listCreateListBuilder = CollectionsKt.createListBuilder(i2);
        builderAction.invoke(listCreateListBuilder);
        return CollectionsKt.build(listCreateListBuilder);
    }

    private static final <E> List<E> buildListInternal(Function1<? super List<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        builderAction.invoke(listCreateListBuilder);
        return CollectionsKt.build(listCreateListBuilder);
    }

    private static final int checkCountOverflow(int i2) {
        if (i2 < 0) {
            if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                throw new ArithmeticException("Count overflow has happened.");
            }
            CollectionsKt.throwCountOverflow();
        }
        return i2;
    }

    private static final int checkIndexOverflow(int i2) {
        if (i2 < 0) {
            if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            CollectionsKt.throwIndexOverflow();
        }
        return i2;
    }

    private static final Object[] collectionToArray(Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        return CollectionToArray.toArray(collection);
    }

    private static final <T> T[] collectionToArray(Collection<?> collection, T[] array) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(collection, array);
    }

    public static final <T> Object[] copyToArrayOfAny(T[] tArr, boolean z2) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (z2 && Intrinsics.areEqual(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static final <E> List<E> createListBuilder() {
        return new ListBuilder();
    }

    public static final <E> List<E> createListBuilder(int i2) {
        return new ListBuilder(i2);
    }

    public static final <T> List<T> listOf(T t2) {
        List<T> listSingletonList = Collections.singletonList(t2);
        Intrinsics.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static final <T> List<T> shuffled(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        List<T> mutableList = CollectionsKt.toMutableList(iterable);
        Collections.shuffle(mutableList);
        return mutableList;
    }

    public static final <T> List<T> shuffled(Iterable<? extends T> iterable, Random random) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        List<T> mutableList = CollectionsKt.toMutableList(iterable);
        Collections.shuffle(mutableList, random);
        return mutableList;
    }

    public static final <T> T[] terminateCollectionToArray(int i2, T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (i2 < array.length) {
            array[i2] = null;
        }
        return array;
    }

    private static final <T> List<T> toList(Enumeration<T> enumeration) {
        Intrinsics.checkNotNullParameter(enumeration, "<this>");
        ArrayList list = Collections.list(enumeration);
        Intrinsics.checkNotNullExpressionValue(list, "list(...)");
        return list;
    }
}
