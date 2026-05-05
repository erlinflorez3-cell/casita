package androidx.collection;

import java.util.List;
import kotlin.Metadata;
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
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: ObjectList.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d̉=!,x\bDRш|\u0004G\u00068\u000bDB\u0007\"2\u0013\u007f\u0007|jA0JqP.`S2\u000fy\u001a<řc$\u007fICU \u007f:\u0019]R\u007fm~Lj\u000b\n\u00144\u0019\u0019l2կc}u%\u001d8ZuO5]o\u0004>\u000f{V\u0007&݅0=@ڕ\u00072GV\u0016\u000f\u0001SM\u001c\u0012vE\u001fAr\u000fSĨ(\u00176B.\t6\\.SɇLlkCGH\u0011oZT7a@|\u0014\u0012t[G\u000f|ѭ,0p;C\u001d=SI\f\u0003_M\rWq\u0004\nص+'9T\f\u0005D^\u0018\u001a%-_\r$wTc%Sfϯ50\u007fgYX&(>\u007f,\u0011J\u000e&\u0006mM^1(r \u000eyyɤW@^\u000fvn\u000e\u0001y<''\u00103q>ImqcAϊ\\<,\u0015\u001b,;\t~%aS\u001e`[ \u0003vq1\u0018E\u0004ʷT̆]={\u0013\tr\u0010:\u001c6W\u0002?{W3E(W]?\u05fa/p\u001aeRw\u000f\u000bpjci\u0019Mn%\u000f\u0018=ѧ\u0017\u0011\u000bHr\r\u0004P\u001b]¯\u0015M*e\u001f#\u0016#8b\b>1%VS}k\nlSΪ\u0018*_jEa\u0007kT\\ibA?icVf؏z\u0014MNz2fvZY\u001c\\l(h7vm0y\u0002ͩ\\\u0011C6My44r6I`#R\u001b\u001e\tF-\rmf\u0001\u0010EYտ(\u0003w7\r2\u000f`tv\u007fi\tIr\u0002\u000f%MCWځ'+\u00062vB\u0015+\u0017\u0003y~Wg\u0013Lzk6u\u001c\u0001°\u001a\u001aGeGS!$\u0017)`\u0018UI\\rkR{)W~\u000b\u0012';\u0017G.\b\u0003\u000f:z\u0003J}j?&\u0007^x$6{0}oa\u0013G\u0012m;_Le\u000b\u0003\bU\u00158\u001d\u001b-Ǉ=\t\u007f&\r7CBU\u001dDvjٯ\u0017˸akw.\bc/:\u0003g\u001c4s\u001a\u007fdg\\`;fL0˝@ѐ(l\u000bܩ\u05fen\u0015"}, d2 = {"\u0013l_Al\bK`\u0015\u0013", "", "", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "\u0013l_Al\u0016;X\u0019|\nE0\u000b\u0018", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nj\u0014\u001cGm\u001d#z3D/", "3l_Al\u0016;X\u0019|\nE0\u000b\u0018", "\u0013", ";tc.U3>=\u0016\u0004z\\;c\r=ti)", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<`\":Y{/\u001eq$=#", "3kT:X5M\u001f", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'| \u0016Ty\u0012;\nn3c\u0005'7k%2WL\u0005SD-\u0011eh9p`1Nt6.P\\;2", "3kT:X5M ", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4?DjA(\u0019gt\u0003\u0005m3Uv%VPX5&:\u0003L\u0010\u000fa\u000e8(\u0012\u0005WP\u000brRFt", "3kT:X5M!", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015R?Lg}%\u0011qc\u0003p`1Nt6\u001d\u00105(eQ\u007fG\u0018\u0011mWL5\u0014\fY?3rN@ho<X}8o\u0001u\u0013\u00135h\u007f)Z\u001eVO", "3kT:X5Ma", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u0013 F|\u0018@u8~W\b'>m\u0014=QMD5\u001c.$d^@\u0007M)Sv%V3R:k(", "=aY2V;%W'\u000ed_", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'| \u0016Ty\u0012;\nn3c\u0005'7k%2WL\u0005U1#\u0015fp \u000bq;$", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4?DjA(\u0019gt\u0003\u0005m3Uv%VPX5&<oB\u0014\u0010itR9\u001cZ", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015R?Lg}%\u0011qc\u0003p`1Nt6\u001d\u00105(eQ\u007fG\u0018\u0011mWL5\u0014\fY?3rN@hq)N\u00029wg\u0010$\u001d\u000b", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u0013 F|\u0018@u8~W\b'>m\u0014=QMD5\u001e\u001b\u001ah_Hmg:]L", "1gT0^\u0010GR\u0019\u0012", "", "", "7mS2k", "", "1gT0^\u001aNP|\by^?", "4q^:<5=S,", "Bn8;W,Q", "1n[9X*MW#\b"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ObjectListKt {
    private static final Object[] EmptyArray = new Object[0];
    private static final ObjectList<Object> EmptyObjectList = new MutableObjectList(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkIndex(List<?> list, int i2) {
        int size = list.size();
        if (i2 < 0 || i2 >= size) {
            throw new IndexOutOfBoundsException("Index " + i2 + " is out of bounds. The list has " + size + " elements.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkSubIndex(List<?> list, int i2, int i3) {
        int size = list.size();
        if (i2 > i3) {
            throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i2 + ") is less than 0.");
        }
        if (i3 > size) {
            throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is more than than the list size (" + size + ')');
        }
    }

    public static final <E> ObjectList<E> emptyObjectList() {
        ObjectList<E> objectList = (ObjectList<E>) EmptyObjectList;
        Intrinsics.checkNotNull(objectList, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
        return objectList;
    }

    public static final <E> ObjectList<E> objectListOf() {
        ObjectList<E> objectList = (ObjectList<E>) EmptyObjectList;
        Intrinsics.checkNotNull(objectList, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.objectListOf>");
        return objectList;
    }

    public static final <E> ObjectList<E> objectListOf(E e2) {
        return mutableObjectListOf(e2);
    }

    public static final <E> ObjectList<E> objectListOf(E e2, E e3) {
        return mutableObjectListOf(e2, e3);
    }

    public static final <E> ObjectList<E> objectListOf(E e2, E e3, E e4) {
        return mutableObjectListOf(e2, e3, e4);
    }

    public static final <E> ObjectList<E> objectListOf(E... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableObjectList mutableObjectList = new MutableObjectList(elements.length);
        mutableObjectList.plusAssign((Object[]) elements);
        return mutableObjectList;
    }

    public static final <E> MutableObjectList<E> mutableObjectListOf() {
        return new MutableObjectList<>(0, 1, null);
    }

    public static final <E> MutableObjectList<E> mutableObjectListOf(E e2) {
        MutableObjectList<E> mutableObjectList = new MutableObjectList<>(1);
        mutableObjectList.add(e2);
        return mutableObjectList;
    }

    public static final <E> MutableObjectList<E> mutableObjectListOf(E e2, E e3) {
        MutableObjectList<E> mutableObjectList = new MutableObjectList<>(2);
        mutableObjectList.add(e2);
        mutableObjectList.add(e3);
        return mutableObjectList;
    }

    public static final <E> MutableObjectList<E> mutableObjectListOf(E e2, E e3, E e4) {
        MutableObjectList<E> mutableObjectList = new MutableObjectList<>(3);
        mutableObjectList.add(e2);
        mutableObjectList.add(e3);
        mutableObjectList.add(e4);
        return mutableObjectList;
    }

    public static final <E> MutableObjectList<E> mutableObjectListOf(E... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableObjectList<E> mutableObjectList = new MutableObjectList<>(elements.length);
        mutableObjectList.plusAssign((Object[]) elements);
        return mutableObjectList;
    }
}
