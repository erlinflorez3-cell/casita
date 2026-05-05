package androidx.collection;

import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: SparseArray.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d̉=!,o\bӵLc\u000b\u0004I\u00066\f6B\r+4\u0012}\u0007njG0L͜P.hS2\u000f\u0002{<$a(yCQU\"}(\nWN}gvJ`\u0010K\u000f\u0014<\u0001̓Dhc|u\u0012=7bqE\u074c[oe?pvF\u0005f2P9*\t\u000f BH>uAŖS$d>G\t:\u0001\u0015m\u0007 Ň\u0014>H\u0007.^wN|H\u001b^jc1\f\u0002r^8o?+LϘJ^-\u0018\u0007g$7P9;\u001bKY\u0013\u0018bj\u0006\u0003ӭuG\u000bs7-1U\u0004Y<^&!%-_\r\fzTfKİfѨ&˃g\u0010Y^&(>z\u001c\u000fBǉ\u001c\u0006ON>/*fN\u000eau#WNV\u001a^p~+eD&=\u007fy+\u007fӜlЂe;'^O1\u0013\u001e6#GnA]Zוn\u0015CZ\bSAQ\u0007=vO:]Ks\u001cp\u0011\u0001Z\u000e>V\u00185\f\u0013>\u0017k7\nKiܰqʮGֳϼz\u0005n{k\u0001`\\X\"\u001d\u001bW,\u000fȱhD\r\u000b{RdXr\u0011{\u001d\u001bͼ\u0004 '.q\u0010<O;0PUŖwjuc\u001a'?f}Y\u001dl&\u0003GuK;ae a\u0019vB@\\d\u000b֚tB{\u0012j^8\"xH\u0019\u0011(\u0006Rf$\u0019BA\u0002\u001cz,_\u001a#ðH\u001bIPZ\u0015\t\u000e_\t\u0012\u0005ԞA$+o4v\u0019\u0001\u0017\\\u001fp\u0018|W2\u0015`P,qUC&>Uhhz\u0002ɠ\u000b~\u0002\u001a_\u0014ZbdlD}u}&چ(9y5M\u0015\u001f~o20.uP\u0001kiM@&+\u0001\b\u001cShtgNυxݽdjXkl10\u0014vx3\nt\u007f@at\u0019geZެi>qx\u0013[LN~|3 >E\u000fǻ:|c,c)#ȶ\u0006\u0014W\u001bq_yoty\u0011\u0010\\ܰeנ0g.qhSk5ձ8Na\u0002DчT\u001b\u0002ݒL\n"}, d2 = {"Ahi2", "", "\"", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nn\"\u0013T}\u000e\u0018\u000421m[*?x\u0012=#", "5dc \\A>", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ\u0005\"C|\u001c<R2BU\u0012}Au!*\\\u0019~O", "1n]AT0Ga", "", "9dh", "4na\u0012T*A", "", "/bc6b5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "D`[BX", "5dc\u001ce\u000b>T\u0015\u000f\u0002m", "2dU.h3MD\u0015\u0006\u000b^", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ\u0005\"C|\u001c<R2BU\u0012}Au!*\\\u0019\u001fR9\u001a&d+@\u0003l.\u0018`$LLL;2\u0016YB\u0010#VWU'\u0016\u0007#+!sD5.]", "5dc\u001ce\fEa\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ\u0005\"C|\u001c<R2BU\u0012}Au!*\\\u0019\u001fR:($oeBPh=V@(WUL;`\\{K]rj\u0017L:\u0011\u000fb\fy2+<\u001b\u0019(\u0013\t7q\u0003U\u007f\u000b:jnQ,", "7r=<g\fF^(\u0013", "9dh\u0016g,KO(\t\b", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E$\n&zVo\u001b8\u0006/B/", ">kd@", "=sW2e", "@d\\<i,", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ\u0005\"C|\u001c<R2BU\u0012}Au!*\\\u0019\u001fR9\u001a&d+@\u0003l.\u0018`$LLL;2\u0016g", "Adc", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ\u0005\"C|\u001c<R2BU\u0012}Au!*\\\u0019\u001fR9\u001a&d+@\u0003l.\u0018`$LLL;2\u0016c", "D`[BX\u0010MS&z\nh9", "", "1n[9X*MW#\b"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SparseArrayKt {
    public static final <T> int getSize(SparseArrayCompat<T> sparseArrayCompat) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        return sparseArrayCompat.size();
    }

    public static final <T> boolean contains(SparseArrayCompat<T> sparseArrayCompat, int i2) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        return sparseArrayCompat.containsKey(i2);
    }

    public static final <T> void set(SparseArrayCompat<T> sparseArrayCompat, int i2, T t2) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        sparseArrayCompat.put(i2, t2);
    }

    public static final <T> SparseArrayCompat<T> plus(SparseArrayCompat<T> sparseArrayCompat, SparseArrayCompat<T> other) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        SparseArrayCompat<T> sparseArrayCompat2 = new SparseArrayCompat<>(sparseArrayCompat.size() + other.size());
        sparseArrayCompat2.putAll(sparseArrayCompat);
        sparseArrayCompat2.putAll(other);
        return sparseArrayCompat2;
    }

    public static final <T> T getOrDefault(SparseArrayCompat<T> sparseArrayCompat, int i2, T t2) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        return sparseArrayCompat.get(i2, t2);
    }

    public static final <T> T getOrElse(SparseArrayCompat<T> sparseArrayCompat, int i2, Function0<? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        T t2 = sparseArrayCompat.get(i2);
        return t2 == null ? defaultValue.invoke() : t2;
    }

    public static final <T> boolean isNotEmpty(SparseArrayCompat<T> sparseArrayCompat) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        return !sparseArrayCompat.isEmpty();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0015K\fArw\u001a[\u0018^1\u000fXT9SiN\u000e9Dn!`yZwy\\BcXmYsXR\u001cmQZ#AM\u001beZ9+eXJwRt")
    @InterfaceC1492Gx
    public static final /* synthetic */ boolean remove(SparseArrayCompat sparseArrayCompat, int i2, Object obj) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        return sparseArrayCompat.remove(i2, obj);
    }

    public static final <T> void forEach(SparseArrayCompat<T> sparseArrayCompat, Function2<? super Integer, ? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int size = sparseArrayCompat.size();
        for (int i2 = 0; i2 < size; i2++) {
            action.invoke(Integer.valueOf(sparseArrayCompat.keyAt(i2)), sparseArrayCompat.valueAt(i2));
        }
    }

    public static final <T> IntIterator keyIterator(final SparseArrayCompat<T> sparseArrayCompat) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        return new IntIterator() { // from class: androidx.collection.SparseArrayKt.keyIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            public final void setIndex(int i2) {
                this.index = i2;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseArrayCompat.size();
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.collections.IntIterator
            public int nextInt() {
                SparseArrayCompat<T> sparseArrayCompat2 = sparseArrayCompat;
                int i2 = this.index;
                this.index = i2 + 1;
                return sparseArrayCompat2.keyAt(i2);
            }
        };
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.collection.SparseArrayKt$valueIterator$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SparseArray.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001d\u001d̉=!,\u0010\bӵLc\u0003\nI\u00066\u000e6B\r+4\u0012}\b\u000fiˎ6L{߉^Xc,\u001fk2éRZlxQAm\u001a,)OѾN0s|Rr\u000byƤLǴx̶0Ic\u0002.*\u001d2Zom4$ڕI˃d\u0001>ӌ84(:\b\b!\u001c0L\u001e{ڂGU"}, d2 = {"/mS?b0=fb|\u0005e3|\u0007>i\n1E.\f\u0013$UoiI\u0004!I?\r^Hi\u001d>M'JkA\u001a$rnwR", "", "7mS2k", "", "5dc\u0016a+>f", "u(8", "Adc\u0016a+>f", "uH\u0018#", "6`b\u001bX?M", "", "<dgA", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class C03731<T> implements Iterator<T>, KMappedMarker {
        final /* synthetic */ SparseArrayCompat<T> $this_valueIterator;
        private int index;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        C03731(SparseArrayCompat<T> sparseArrayCompat) {
            this.$this_valueIterator = sparseArrayCompat;
        }

        public final int getIndex() {
            return this.index;
        }

        public final void setIndex(int i2) {
            this.index = i2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.$this_valueIterator.size();
        }

        @Override // java.util.Iterator
        public T next() {
            SparseArrayCompat<T> sparseArrayCompat = this.$this_valueIterator;
            int i2 = this.index;
            this.index = i2 + 1;
            return sparseArrayCompat.valueAt(i2);
        }
    }

    public static final <T> Iterator<T> valueIterator(SparseArrayCompat<T> sparseArrayCompat) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        return new C03731(sparseArrayCompat);
    }
}
