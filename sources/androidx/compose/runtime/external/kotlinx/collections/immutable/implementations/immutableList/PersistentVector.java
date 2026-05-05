package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: PersistentVector.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&˛\bDZc|\u0004W\u00068é6B\r14\u0012\u0006јnj?0LeV4ZS0\u001as{J$c$wFCU0}*\tUQog|rb\u000bI\u001b\u000e\u0016\u000fj4Ic\u0002e\u0012\u00159HģU\u074cuqCʠnsf\u000b0428@\u0004/\u001aZN x\u000bC\u0012\u000b@1\u0001$J^\u001bO\u001d\"\"\nN\"\u0017\u001d\u000bk|9Xxk?G+\u0013mRP=^^\u0001{\u0010VX5\u0013\u000faL2P;C\u001d=S1\u000eқ_?\u0011H:V\u0013u?-;K\u0004Wlݙ.\u0014E/]\u001bur\\ؘKeԃ\u0010'9^,l^\u001b@}\u000b}\u001d<:\u05fa4'x2;*~\b<:%vaNh\u0002\u0015ۍF\u000fˋ:\u00173\u0011{FG-~Yq?)PMz3\u0011L&1r/kl\u000e\u000f\u001caTɐU1_S\u0006T\\\u001eqC}\u0006\u0001b8Ï2E\u000e\u0014w\u0010\u001fD/%mكi'/{\u001aHrn=ݪ`ĈWi`_\tg|.O2\u0019\u0010jFz\u0004\u001aT\u0003[\\\u001d[\u001el\u000f\u000e\f#\"rvj%S\u0013~Sv\u0003\u0003M\f\u0011U3tGqn\u001a\u0015\b?lAMSy\u000f\u0010V'\u0018MVz\u0005\u0007\u0002\tS۱^\\6>z{x-\u0010\u0002TP\u001c\u0013hŭ ʉd8?\u001bt\u001dX\u0007.DW{7c\tk@\u0003bQ<\u0003\u0018+%\u000f\u000f^tr\u0006f'Mr|˃&-Op}-4u:nD~3\u00075͞.h\u0018PU\\\u0005\u0016$\\B4^WGsGG#\u0013\u000f+H\u0001[Ibq\u0014T}\u001e5|\u0015\u0002\u001f?x0}\u0007\u0019tZc\u001bN]m/\"%e#'\u0016t\u0018y\u0010M+Kqw#[ld9\u0003ʾ@NF!MP,J\u0019u2~E-yگK\u0016( =\u0017yeys>{x\u000eTx\u0014\u0007\\g$\u0016zQ\f9k<Wr\u0017>P+3\u0003\u074cLj\u0006/\u000bJB5KNQf\u0001Vnԇ9ɀ.r\u0015.%xf_J\u0015\u0006|b2\u000e-$O\f=vK5\u0015]U}l\u001cO\u000b\u000ez\u001b\u00185\u00149~\u0016,?6U\u0006f73Ls͛:AI\u000eMy\u0017PL4L\f\u001bEjh4\u0014)\u0003vm\u001d\u0019JL\u0004?f\u0010jw\u000bZ^\u0004\u000fH\u0011%8\u001a\u0017\u000fa%)A?\n\u0006Nd3s4\u0017RK\rIm\u0016~ݝ)+R\u0002\u0002;6\u0007\u0019\u0011U_SI8ԍ2GY}y\u001f$D(~-BNÇIS!_%a\r;\u001cx\u0017x\u0005D~X^$9~1Մ<<:\u0013\u0019)gr\u001eis`\u00173Ev2\t'H9\t\"{\u0012JI06A;?ar$+\fYi:,\fN#W\b\u0003:tW<m:a)J.qDi2\r!s8\u0004\\e;r˹2\bDsJl\u0010Gv_{y1@]ߜ\u001b\u0006rWvz\"k|g~W!\u0002\u00155\u0005|\u001f1^C!'{5C\\hS)SN_A\u0004\"%>\u001fd\u000f))֤Scv&4Ui3C/\u001a1(1xs,47\u007f\u0006\u0006:T^ֽiV}Br\u0019tlp^>bx6|tBÉZ\u0011۫L^\u001f$|\u0004\u0001U|7G\u001d/]#F\u000f\u000b2Hy2/3jG+;B\r\u0006'%\u00151=\u0013x\u000eCZ\t!\u0007\u00180;Vl=H.\n*{\u001d\u001b(aDfFN,י\u0012\u0011=\u0014\t6L^2$KUCC/\u0010/\u0019f\tFޡ\u001bǝnS[%8\u000bM\r\u001bG\u00121\u001aAJمtܯ3\u000fwߦ(xI+Mez.b֢gڧ\u0003SkǾ'c2TCQn\u0010cE\u0018\u0012/(4\b\f\".I_K\u0001ئ^ȡZu_\u000444߈r~"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp)Z\u001eVC\u007fuN7lTh_\u0003V2E`9n\u00195", "\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$xN8\u001b\tgP$wS\u001e#\u0016;\u001f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp)Z\u001eVCprO8uBWndGNSf8s\fh,C>H3i", "@n^A", "", "", "B`X9", "Ahi2", "", "@n^AF/BT(", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q6g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#'\u001f/%", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "5dc \\A>", "u(8", "/cS", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'| \u0016Ty\u0012;\nn3c\u0006+A{\u0016wZSDz8&\u00152aL\u0016c9Wr.\u0011RX;cV{P]\u0010d\u0015U+\u000b\u0014]K-|\u000e;'\u0010<X}8o\u0001U\u0001\u000eBxtPe\u0010P\t{yO8>", "7mS2k", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u0013 F|\u0018@u8~W\b(Bw$.\u0017PKtC\"\u001dh+9\u001ar,[\u007f#N\u0016T6kYvF'[X\u0018U2\r\u0003hE.wR\u0001#\u00104Y\u00117e\b\f_x5w~Fd\u001fG\u0003$\\E7w\u001c", "0tU3X9\u001f]&", "uH\u0018(?1:d\u0015H\u0002Z5~R\u0019b\u0005(yOV", "0tX9W,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp)Z\u001eVC\u007fuN7lTh_\u0003V2E`9n\u0019<-`A9$!G", "5dc", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "7mb2e;\"\\(\tgh6\f", "AgX3g", "3kT:X5M1\u0015\f\br", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp)Z\u001eVC~rF)fUF_z\u001d", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$d}\u001cC\u0001\n\u0006}!>[G\n4r\u0016,\\\u0019\"g=\u001d\"re8\u001a-*X~2QZNuib{L\u0018\u001aZWN>\u001c\u0005fJ u\u000e=)\u00173M\u000bN2~\u0016\u001d\u00155h\u007fF`\u0019UC\u0019}I9wBVfy\u0011EMm1d\u0014_&k6I(\u001ez'dlX6\u001a\u000bO\u000eyR`kuVbd5)>kj3Ep+\u007fj\u000e$G\rs[9T}->\u0017\u00019*4sZ", "7mb2e;\"\\(\tiZ0\u0004", "B`X9<5=S,", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#\u0007\"g=\u001d\"re8\u001a-*X~2QZNuib{L\u0018\u001aZWN>\u001c\u0005fJ u\u000e=)\u00173M\u000bN2~\u0016\u001d\u00155h\u007fF`\u0019UC\u0019}I9wBVfy\u0011EMm1d\u0014_&k6I(\u001ez'dlX6\u001a\u000bO\u000eyR`kuVbe81LqiUExd-t%.U\tM", ":hbA<;>`\u0015\u000e\u0005k", "", ">t[9?(Lbu\u000f{_,\n", "B`X96(K`-", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$d}\u0013Pn\u001bFz$H#{*?x <M\rH{=-\u0019pa\u0003\u0007v;N\u00040CS\u00182fayA\u001d%$\fX2\u0014\u0005WP(xMEh\f4Q\u0012Jd}\u0013\u0016W9r{IV\u0018G\u0003$qP-rOg)}OIUq&a\u0013_\u0004`HIm}n\u001e\u001bf_\u001b\n|)Th9~cxCb\u00024-@7ECJoSKJ", ">t[9?(Lbu\u000f{_,\ni<o\b\u0015\u0006J\u0010", "@n^AF0SS", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$dZ}Cx\rI\u0001)4lG\u001eAu!8[C\u0005xD'$li9Pc?]v4PHUub\\\u0002D\u0018\u001bmWL5\u0014\fY?3rN@-Q0Q\nKw|\t\u001d\u000e~UpOd\u0014U\t\u0015~P\u0010lTh5", ">tb590EZ\u0019}iZ0\u0004", "4h[9X+-O\u001d\u0006", "<df!T0E", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q6g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#9\"p0/\u00112h5\u0010eu8s,GJ]\u0002 9nF\u0013\u001fd\u0012M>V\u0003cI/xR7h\u0015<R\u0011?p\u0001U\u0016!Dj}KR\u0017\u0011\u007f\u001f\u0005H-qY#]\u0004NHE`9h\u0016h+&>B,$\u0001\u0015\u0018oPw\u000e\u0004^\u0018rZypvC(~B-L7_NM\u007fd8q.\u001f2\u007f\u0006!{Ct8\u00031\u0012C*?suKe'HkN", ">tb5G(BZ", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$v}\u001cC\u0001\n\u0006}!>[G\n4r\u0016,\\\u0019~a\u001b#\u0011y]\u0003\u000e_5P@\u0011DQN*k(", "@d\\<i,\u001aZ ", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "@d\\<i,\u001ab", "@d\\<i,\u001f`#\u0007gh6\fd>", "@d\\<i,\u001f`#\u0007iZ0\u0004d>", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$dzZ.k\u0017;\u0004/9X\u0011i5w\u001e9WQ;5A.\u001eweA\u0007-,a\u0006'TUJ3&X|L\u001b\u0016c!\u0018)\u0017\f`A\"}HA(\u0016uM\nCx\u0010\b\u0013\u001554[Bc\u001eK\b$uJ8OJgnO", "Adc", "Adc\u0016a\u0019H](", ExifInterface.GPS_MEASUREMENT_3D, "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$d}\u001cC\u0001\n\u0006}!>[G\n4r\u0016,\\\u0019~a\u001b#\u0011y]\u0003\u000e_5P@\u0011DQN*k(", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PersistentVector<E> extends AbstractPersistentList<E> implements PersistentList<E> {
    public static final int $stable = 8;
    private final Object[] root;
    private final int rootShift;
    private final int size;
    private final Object[] tail;

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.size;
    }

    public PersistentVector(Object[] objArr, Object[] objArr2, int i2, int i3) {
        this.root = objArr;
        this.tail = objArr2;
        this.size = i2;
        this.rootShift = i3;
        if (!(size() > 32)) {
            PreconditionsKt.throwIllegalArgumentException("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        CommonFunctionsKt.m3763assert(size() - UtilsKt.rootSize(size()) <= RangesKt.coerceAtMost(objArr2.length, 32));
    }

    private final int rootSize() {
        return UtilsKt.rootSize(size());
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> add(E e2) {
        int size = size() - rootSize();
        if (size < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            objArrCopyOf[size] = e2;
            return new PersistentVector(this.root, objArrCopyOf, size() + 1, this.rootShift);
        }
        return pushFilledTail(this.root, this.tail, UtilsKt.presizedBufferWith(e2));
    }

    private final PersistentVector<E> pushFilledTail(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i2 = this.rootShift;
        if (size > (1 << i2)) {
            Object[] objArrPresizedBufferWith = UtilsKt.presizedBufferWith(objArr);
            int i3 = this.rootShift + 5;
            return new PersistentVector<>(pushTail(objArrPresizedBufferWith, i3, objArr2), objArr3, size() + 1, i3);
        }
        return new PersistentVector<>(pushTail(objArr, i2, objArr2), objArr3, size() + 1, this.rootShift);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object[] pushTail(java.lang.Object[] r5, int r6, java.lang.Object[] r7) {
        /*
            r4 = this;
            int r0 = r4.size()
            int r0 = r0 + (-1)
            int r3 = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.indexSegment(r0, r6)
            r1 = 32
            if (r5 == 0) goto L19
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r5, r1)
            java.lang.String r0 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            if (r2 != 0) goto L1b
        L19:
            java.lang.Object[] r2 = new java.lang.Object[r1]
        L1b:
            r1 = 5
            if (r6 != r1) goto L21
            r2[r3] = r7
        L20:
            return r2
        L21:
            r0 = r2[r3]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r6 = r6 - r1
            java.lang.Object[] r0 = r4.pushTail(r0, r6, r7)
            r2[r3] = r0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector.pushTail(java.lang.Object[], int, java.lang.Object[]):java.lang.Object[]");
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> add(int i2, E e2) {
        ListImplementation.checkPositionIndex$runtime_release(i2, size());
        if (i2 == size()) {
            return add((Object) e2);
        }
        int iRootSize = rootSize();
        if (i2 >= iRootSize) {
            return insertIntoTail(this.root, i2 - iRootSize, e2);
        }
        ObjectRef objectRef = new ObjectRef(null);
        return insertIntoTail(insertIntoRoot(this.root, this.rootShift, i2, e2, objectRef), 0, objectRef.getValue());
    }

    private final PersistentVector<E> insertIntoTail(Object[] objArr, int i2, Object obj) {
        int size = size() - rootSize();
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        if (size < 32) {
            ArraysKt.copyInto(this.tail, objArrCopyOf, i2 + 1, i2, size);
            objArrCopyOf[i2] = obj;
            return new PersistentVector<>(objArr, objArrCopyOf, size() + 1, this.rootShift);
        }
        Object[] objArr2 = this.tail;
        Object obj2 = objArr2[31];
        ArraysKt.copyInto(objArr2, objArrCopyOf, i2 + 1, i2, size - 1);
        objArrCopyOf[i2] = obj;
        return pushFilledTail(objArr, objArrCopyOf, UtilsKt.presizedBufferWith(obj2));
    }

    private final Object[] insertIntoRoot(Object[] objArr, int i2, int i3, Object obj, ObjectRef objectRef) {
        Object[] objArrCopyOf;
        int iIndexSegment = UtilsKt.indexSegment(i3, i2);
        if (i2 == 0) {
            if (iIndexSegment == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            }
            ArraysKt.copyInto(objArr, objArrCopyOf, iIndexSegment + 1, iIndexSegment, 31);
            objectRef.setValue(objArr[31]);
            objArrCopyOf[iIndexSegment] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(this, newSize)");
        int i4 = i2 - 5;
        Object obj2 = objArr[iIndexSegment];
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iIndexSegment] = insertIntoRoot((Object[]) obj2, i4, i3, obj, objectRef);
        for (int i5 = iIndexSegment + 1; i5 < 32 && objArrCopyOf2[i5] != null; i5++) {
            Object obj3 = objArr[i5];
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[i5] = insertIntoRoot((Object[]) obj3, i4, 0, objectRef.getValue(), objectRef);
        }
        return objArrCopyOf2;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> removeAt(int i2) {
        ListImplementation.checkElementIndex$runtime_release(i2, size());
        int iRootSize = rootSize();
        if (i2 >= iRootSize) {
            return removeFromTailAt(this.root, iRootSize, this.rootShift, i2 - iRootSize);
        }
        return removeFromTailAt(removeFromRootAt(this.root, this.rootShift, i2, new ObjectRef(this.tail[0])), iRootSize, this.rootShift, 0);
    }

    private final PersistentList<E> removeFromTailAt(Object[] objArr, int i2, int i3, int i4) {
        int size = size() - i2;
        CommonFunctionsKt.m3763assert(i4 < size);
        if (size == 1) {
            return pullLastBufferFromRoot(objArr, i2, i3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        int i5 = size - 1;
        if (i4 < i5) {
            ArraysKt.copyInto(this.tail, objArrCopyOf, i4, i4 + 1, size);
        }
        objArrCopyOf[i5] = null;
        return new PersistentVector(objArr, objArrCopyOf, (i2 + size) - 1, i3);
    }

    private final PersistentList<E> pullLastBufferFromRoot(Object[] objArr, int i2, int i3) {
        if (i3 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(this, newSize)");
            }
            return new SmallPersistentVector(objArr);
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArrPullLastBuffer = pullLastBuffer(objArr, i3, i2 - 1, objectRef);
        Intrinsics.checkNotNull(objArrPullLastBuffer);
        Object value = objectRef.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) value;
        if (objArrPullLastBuffer[1] == null) {
            Object obj = objArrPullLastBuffer[0];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            return new PersistentVector((Object[]) obj, objArr2, i2, i3 - 5);
        }
        return new PersistentVector(objArrPullLastBuffer, objArr2, i2, i3);
    }

    private final Object[] pullLastBuffer(Object[] objArr, int i2, int i3, ObjectRef objectRef) {
        Object[] objArrPullLastBuffer;
        int iIndexSegment = UtilsKt.indexSegment(i3, i2);
        if (i2 == 5) {
            objectRef.setValue(objArr[iIndexSegment]);
            objArrPullLastBuffer = null;
        } else {
            Object obj = objArr[iIndexSegment];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrPullLastBuffer = pullLastBuffer((Object[]) obj, i2 - 5, i3, objectRef);
        }
        if (objArrPullLastBuffer == null && iIndexSegment == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[iIndexSegment] = objArrPullLastBuffer;
        return objArrCopyOf;
    }

    private final Object[] removeFromRootAt(Object[] objArr, int i2, int i3, ObjectRef objectRef) {
        Object[] objArrCopyOf;
        int iIndexSegment = UtilsKt.indexSegment(i3, i2);
        if (i2 == 0) {
            if (iIndexSegment == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            }
            ArraysKt.copyInto(objArr, objArrCopyOf, iIndexSegment, iIndexSegment + 1, 32);
            objArrCopyOf[31] = objectRef.getValue();
            objectRef.setValue(objArr[iIndexSegment]);
            return objArrCopyOf;
        }
        int iIndexSegment2 = objArr[31] == null ? UtilsKt.indexSegment(rootSize() - 1, i2) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(this, newSize)");
        int i4 = i2 - 5;
        int i5 = iIndexSegment + 1;
        if (i5 <= iIndexSegment2) {
            while (true) {
                Object obj = objArrCopyOf2[iIndexSegment2];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iIndexSegment2] = removeFromRootAt((Object[]) obj, i4, 0, objectRef);
                if (iIndexSegment2 == i5) {
                    break;
                }
                iIndexSegment2--;
            }
        }
        Object obj2 = objArrCopyOf2[iIndexSegment];
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iIndexSegment] = removeFromRootAt((Object[]) obj2, i4, i3, objectRef);
        return objArrCopyOf2;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> removeAll(Function1<? super E, Boolean> function1) {
        PersistentVectorBuilder<E> persistentVectorBuilderBuilder = builder();
        persistentVectorBuilderBuilder.removeAllWithPredicate(function1);
        return persistentVectorBuilderBuilder.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentVectorBuilder<E> builder() {
        return new PersistentVectorBuilder<>(this, this.root, this.tail, this.rootShift);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i2) {
        ListImplementation.checkPositionIndex$runtime_release(i2, size());
        return new PersistentVectorIterator(this.root, this.tail, i2, size(), (this.rootShift / 5) + 1);
    }

    private final Object[] bufferFor(int i2) {
        if (rootSize() <= i2) {
            return this.tail;
        }
        Object[] objArr = this.root;
        for (int i3 = this.rootShift; i3 > 0; i3 -= 5) {
            Object[] objArr2 = objArr[UtilsKt.indexSegment(i2, i3)];
            Intrinsics.checkNotNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public E get(int i2) {
        ListImplementation.checkElementIndex$runtime_release(i2, size());
        return (E) bufferFor(i2)[(-1) - (((-1) - i2) | ((-1) - 31))];
    }

    @Override // kotlin.collections.AbstractList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> set(int i2, E e2) {
        ListImplementation.checkElementIndex$runtime_release(i2, size());
        if (rootSize() <= i2) {
            Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            objArrCopyOf[(i2 + 31) - (i2 | 31)] = e2;
            return new PersistentVector(this.root, objArrCopyOf, size(), this.rootShift);
        }
        return new PersistentVector(setInRoot(this.root, this.rootShift, i2, e2), this.tail, size(), this.rootShift);
    }

    private final Object[] setInRoot(Object[] objArr, int i2, int i3, Object obj) {
        int iIndexSegment = UtilsKt.indexSegment(i3, i2);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        if (i2 == 0) {
            objArrCopyOf[iIndexSegment] = obj;
        } else {
            Object obj2 = objArrCopyOf[iIndexSegment];
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf[iIndexSegment] = setInRoot((Object[]) obj2, i2 - 5, i3, obj);
        }
        return objArrCopyOf;
    }
}
