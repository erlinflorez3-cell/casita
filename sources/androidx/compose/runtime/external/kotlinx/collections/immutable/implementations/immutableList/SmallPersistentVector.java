package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
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
/* JADX INFO: compiled from: SmallPersistentVector.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&˛\bDZc|\u0004W\u00068é6B\r14\u0012\u0006јnj?1LeV4ZS0\u0010s{J$c$wGCU(\u001a*\tUPog\u0005Jb\u000bI\u0013\u000e\u0016\u0007\u00134I[xe\u0012%2JoM<UoC;fҚLӌ>XJ:\u007fڎ\u000f\u0019ZN x\u000bC\u0012\u000b@0pvJT\u001dMK\u0019@\u0007v\u001f'^owZDJ\u0005eJ33\u0005\u007fA|+\u000e3ƊQ\rTYo&\u0005l61P9E\u0015[م1\u0013\u0003_M\u0010Wqsݛ/;ݳ/I\u0002e~y\u000e\u001f-1_\u000fmr\\ؘ3]\u0011\u00105:gcyX>,\u0006\b\u0014\rrǉT\u001aόL.;*/*\u001cD\rxcB`\u0002\u0015ۍ.\u0007\u0012:%4\u00183YAKp_sS\u001f^9\f\u0005C̔Q\u001455$n\u001cq-!dya1\b̵kT~\u0014gQ\u0006\n\u0001d\u0012*:\u0382u\u0013u\u0010YI%:OcI'1m\u0018Grk%\b\u0011lapjHn*5\u0016֖.\t\u001ap\rp\u0013\u0003hZh.!MR\u03815\u0016N'hp\u0006U9%Fʚ\u007flwye]8-uϠ7֍rk\u001cq\u0002qAPic>i\u0003z\"LTb;֚-Vΐ\u0010ZjDjEV\b(w*L~\u0010!?WqRعrEǬ`\u0015V\u001ffVO\u001b!ejj ~\u000b՜R\"\u001a(\u0003\u0018\u0019P\u000bx6{Ai:\u001dx(=Ca5Oğ\u0004.\u0019D\u000bD\u001f\u000b\u0004\u0002Wg\u0003܁\\n&u\u0004\u001fN8`M\u001aCK7'\u000594\u0012-{ɣ!q\u0002Q 6\u0013|(\u0017\u0002|v\t\u0016\u0010\t2plZO\u000bϟP\u0003\u000fv1\u0017|\u007f(iv~Upl\u000b\u0012Ŭ\u0010\u0007è]<\\HM\u001b- =\t\u007f&\r7CBU!Dzjٯ\u0017˸akw.\bh_8\u0003l\u001c,\u0012\u001e&7(ϸ4֑<Mq\u0001D+2vĀFo"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp)Z\u001eVC\u0003}=0o1Yl\bKOTb3s|_\u001bkDGy", "\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$qV3\u001d\u0014U>+n+;-\u0017\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp)Z\u001eVCprO8uBWndGNSf8s\fh,C>H3i", "0tU3X9", "", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "Ahi2", "", "5dc \\A>", "u(8", "/cS", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$xN8\u001b\tgP$wS\u001e#\u0016;\u001f", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'| \u0016Ty\u0012;\nn3c\u0006+A{\u0016wZSDz8&\u00152aL\u0016c9Wr.\u0011RX;cV{P]\u0010d\u0015U+\u000b\u0014]K-|\u000e;'\u0010<X}8o\u0001U\u0001\u000eBxtPe\u0010P\t{yO8>", "7mS2k", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u0013 F|\u0018@u8~W\b(Bw$.\u0017PKtC\"\u001dh+9\u001ar,[\u007f#N\u0016T6kYvF'[X\u0018U2\r\u0003hE.wR\u0001#\u00104Y\u00117e\b\f_x5w~Fd\u001fG\u0003$\\E7w\u001c", "/cS\u000e_3", "1", "", "3kT:X5Ma", "0tU3X9(T\u0007\u0003\u0010^", "uH\u0018(?1:d\u0015H\u0002Z5~R\u0019b\u0005(yOV", "0tX9W,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$xN8\u001b\tgP$wS\u001e#\u0016;\b^Kl\b\u000b\u0016\u001b\u000b", "5dc", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "7mS2k\u0016?", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", ":`bA<5=S,h{", ":hbA<;>`\u0015\u000e\u0005k", "", "@d\\<i,\u001aZ ", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "@d\\<i,\u001ab", "Adc", "\u0011n\\=T5B]\"", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SmallPersistentVector<E> extends AbstractPersistentList<E> implements ImmutableList<E> {
    private final Object[] buffer;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final SmallPersistentVector EMPTY = new SmallPersistentVector(new Object[0]);

    public SmallPersistentVector(Object[] objArr) {
        this.buffer = objArr;
        CommonFunctionsKt.m3763assert(objArr.length <= 32);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.buffer.length;
    }

    private final Object[] bufferOfSize(int i2) {
        return new Object[i2];
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> add(E e2) {
        if (size() < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() + 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            objArrCopyOf[size()] = e2;
            return new SmallPersistentVector(objArrCopyOf);
        }
        return new PersistentVector(this.buffer, UtilsKt.presizedBufferWith(e2), size() + 1, 0);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> addAll(Collection<? extends E> collection) {
        if (size() + collection.size() <= 32) {
            Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() + collection.size());
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            int size = size();
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                objArrCopyOf[size] = it.next();
                size++;
            }
            return new SmallPersistentVector(objArrCopyOf);
        }
        PersistentList.Builder<E> builder = builder();
        builder.addAll(collection);
        return builder.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> removeAll(Function1<? super E, Boolean> function1) {
        Object[] objArrCopyOf = this.buffer;
        int size = size();
        int size2 = size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size2; i2++) {
            Object obj = this.buffer[i2];
            if (function1.invoke(obj).booleanValue()) {
                if (!z2) {
                    Object[] objArr = this.buffer;
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
                    z2 = true;
                    size = i2;
                }
            } else if (z2) {
                objArrCopyOf[size] = obj;
                size++;
            }
        }
        if (size == size()) {
            return this;
        }
        if (size == 0) {
            return EMPTY;
        }
        return new SmallPersistentVector(ArraysKt.copyOfRange(objArrCopyOf, 0, size));
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> addAll(int i2, Collection<? extends E> collection) {
        int i3 = i2;
        ListImplementation.checkPositionIndex$runtime_release(i3, size());
        if (size() + collection.size() <= 32) {
            Object[] objArrBufferOfSize = bufferOfSize(size() + collection.size());
            ArraysKt.copyInto$default(this.buffer, objArrBufferOfSize, 0, 0, i3, 6, (Object) null);
            ArraysKt.copyInto(this.buffer, objArrBufferOfSize, collection.size() + i3, i3, size());
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                objArrBufferOfSize[i3] = it.next();
                i3++;
            }
            return new SmallPersistentVector(objArrBufferOfSize);
        }
        PersistentList.Builder<E> builder = builder();
        builder.addAll(i3, collection);
        return builder.build();
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> add(int i2, E e2) {
        ListImplementation.checkPositionIndex$runtime_release(i2, size());
        if (i2 == size()) {
            return add((Object) e2);
        }
        if (size() < 32) {
            Object[] objArrBufferOfSize = bufferOfSize(size() + 1);
            ArraysKt.copyInto$default(this.buffer, objArrBufferOfSize, 0, 0, i2, 6, (Object) null);
            ArraysKt.copyInto(this.buffer, objArrBufferOfSize, i2 + 1, i2, size());
            objArrBufferOfSize[i2] = e2;
            return new SmallPersistentVector(objArrBufferOfSize);
        }
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        ArraysKt.copyInto(this.buffer, objArrCopyOf, i2 + 1, i2, size() - 1);
        objArrCopyOf[i2] = e2;
        return new PersistentVector(objArrCopyOf, UtilsKt.presizedBufferWith(this.buffer[31]), size() + 1, 0);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> removeAt(int i2) {
        ListImplementation.checkElementIndex$runtime_release(i2, size());
        if (size() == 1) {
            return EMPTY;
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() - 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        ArraysKt.copyInto(this.buffer, objArrCopyOf, i2, i2 + 1, size());
        return new SmallPersistentVector(objArrCopyOf);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList.Builder<E> builder() {
        return new PersistentVectorBuilder(this, null, this.buffer, 0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public int indexOf(Object obj) {
        return ArraysKt.indexOf(this.buffer, obj);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        return ArraysKt.lastIndexOf(this.buffer, obj);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i2) {
        ListImplementation.checkPositionIndex$runtime_release(i2, size());
        return new BufferIterator(this.buffer, i2, size());
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public E get(int i2) {
        ListImplementation.checkElementIndex$runtime_release(i2, size());
        return (E) this.buffer[i2];
    }

    @Override // kotlin.collections.AbstractList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> set(int i2, E e2) {
        ListImplementation.checkElementIndex$runtime_release(i2, size());
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i2] = e2;
        return new SmallPersistentVector(objArrCopyOf);
    }

    /* JADX INFO: compiled from: SmallPersistentVector.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\r!4\u0012}\blʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$BXIV2\u00042\u000b_N\u0016j\u001dLҼ\u000fI\u0017إ.zp0WZ\u07b5a\u0018"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp)Z\u001eVC\u0003}=0o1Yl\bKOTb3s|_\u001bkDGbq{!&dY2\u0014\u0005)", "", "u(E", "\u0013L?!L", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp)Z\u001eVC\u0003}=0o1Yl\bKOTb3s|_\u001bkDGy", "", "5dc\u0012@\u0017-G", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006v8DY\u000b)3t_4WRBo=1^fk@\u000ec*]z1PZ\u00180dZ\u0003L\u0010\u000fa\u000e\u0018/\u0015\u0010`A,nMF\u001b\u00170S\u000bI2\u0005\u0014\u001e\u001eDfmIVvK\b$?/1dM`JyTOIp9d\u0015n\u000e\\8I.!G", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SmallPersistentVector getEMPTY() {
            return SmallPersistentVector.EMPTY;
        }
    }
}
