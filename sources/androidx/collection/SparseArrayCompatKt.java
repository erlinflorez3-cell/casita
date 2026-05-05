package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
/* JADX INFO: compiled from: SparseArrayCompat.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d̉=!,˛\bӵLc\u0003\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u0006\rnj?2LeV7ZS0(s{B0c$wFS\u0002(}:\t}O\bitϺh\rk\u0015\u0016\u0018\tjrK\u0004{\u000e\u0016\u001d6Zom8}sK?xt|\u0007f݆(أ}\u0005\u000f!B_\u001e~\u0013Cy\r22F\u0081HT5S\u0015\u001c\"\u0006\u0005\"/!#ɢTNgzfR/Q\r\nDTϋm2%S\u001dHd'Sx\u0010![DE9-%\u0002\bMѹaW'M|U\u0005\u00171G-O֕e8\u0001\u0006$\u0017;OS_!)\r\t_f$'qQ*֠Vˎ,w\t\b%a\u0012\u001b\u001e)^-s\u001c\u0007\n\u0014ޗ\u0003t{F`\u0004nBF|\u00109G)\u000e7C9Ik\u0018ĥޅ\u001dNE\n\u001d8,0\u0019ng]t\u0010fٽ)V WASP=\u000fP8\\mq\u0012tz\u0002X\t`K\u000e>\u0014\u0011t\u0019kڛ٦=#/{\u001agRx\u000f\u0005\u000fmskX̲N$\u0017\u001cG,\u0019\f!F\u0013\b\u001cTb\\D\u0011{!\u001bͶ\u0004 7.n\u0010<O*0PUŖwluc\u001a'?f}[\u001dn>[GdK5\u0018eVСXλ\u0018?Ju\u001dotVk\f\tfH$8ʋx\u0012 \u0002TP\u001c\u0013xA \u001fzκ71{#]\u001b\u001epF\u001d\u000beʳv\u0012'ZC&\u0013ijv7\u0004\u0001`~\u0006\u007fxw1Cʡ(Em_L1&\u0004#\t6\u0003Ƚ\u0015\u0001\u001c\u0006Wi\\G\u0013nDx\u0006\u007f.\u001a29\u007f4m\u0017\u001d\u0005A2H/\fɤxϯUM .\u0013$\b'Sh\\h(lvݚnlrUd\u00192v%tQ\u000b\u0015\f\bz^\u0003WgZ\nk>\u0010t1\\\u0003ѿ>\u00153-8=\u0003\u0006!C7ME-ݴ$y<5%cmi60(e?*\u0003i\u001c,\u0012\u001b f_cJ;~K ˛Dѐ(l\u0011R`\t\u0006#Z\tb\u000eSJGЬ~X`S\u001b1\u000efM.;s\u0007_H\u0017\b}b3&͈\fl\f/vCS\u001bmUmƚ{M\u0005\u0011Z\u0011\u001a\u000bB3\u001d\u0015LA.Zob756y&<Y=x\u0004j\bjҊ2T'\u0019_li4\u0011\u001b\u0002Lܪ\u001d\u0019ZH\u0004=f\u000e\u001bz\u000bYx\tn[x!X\u0006E۱96 CN\u001dmtUOe8ܬa\u001f1!zQ\u000ffk-rWi\u001f6n\u0019\u000bsbsM\u0010T\u001cGWr2ƒ\u0012PF\u000b<Z\u001a18\u0018\u0013\u007fx6͜\u0019W\rTtx\"f\u0019PP,/~\u000b\u0012T\n=\u0010IS\u0001uz-\u0013P>̀Iױ\u0005\u0017R9\u001f@\u000b\u0003^\u001b[\u0010U/CƖx\u0016O\u0002gUK}N\"N*4x/`o\u000e\u0015\u000f\u000e\u001fH6\n\u0016)\u00049\u0017^A\u001c.\u0011v9˗4ĝ:O\u0010U\u001a?l|\u0004wOAG-rݩPM\u0011~\u001ae|c5W9\u0006\u00175d\u0010\u0007-~\"9+[4+X!<W֧&Ǩ\u0015\u007f\"\u001c>6D,z)>T\u0004jvա]]51?m:aw2\u0001!DΦ\u007f\u000e\u001b8y@\u0015i|m@jӷjnj]\u001e`z(+v:,ZΚ\u0005`\u0003\u001f:LF9 \u00051=؟-]5Mp\t\u0014E\u0010(O4\u0003C)MJ\u000b\u001e-=֬\t̯ft\u000e8Z\u001f\u0001(\u007f,[Gt? śg&\u0016j\u0013([E~D6/W\u000e)gha8>#D<=W߂O\u001b1\t\u001b7\u0014\u001a/\u001bKi\u0018UM0\u0011~\u0011\r\u0006{_njwEv;/=tK[tJ=5,vmڇ\bʩN~[sv\u001boβa5s\u001dP\u07bdB·\u000e\u001f,ڎԿyN"}, d2 = {"\u0012D;\u0012G\f\u001d", "", "1n\\:b5\u001a^$~\u0004]", "", "\u0013", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nn\"\u0013T}\u000e\u0018\u000421m[*?x\u0012=#", "9dh", "", "D`[BX", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ\u0005\"C|\u001c<R2BU\u0012}Au!*\\\u0019\u001fR9\u001a&d+@\u0003l.\u0018`$LLL;2\u0016c", "1n\\:b5\u001cZ\u0019z\b", "1n\\:b5\u001c]\"\u000evb5\u000bn/y", "", "1n\\:b5\u001c]\"\u000evb5\u000by+l\u0010(", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ\u0005\"C|\u001c<R2BU\u0012}Au!*\\\u0019\"p0/\u00112h5\u0010eu8s,GJ]\u0002 G", "1n\\:b5 S(", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ\u0005\"C|\u001c<R2BU\u0012}Au!*\\\u0019\u001f/\u001b#\u0011y]\u0003\u000e_5P@\u0011DQN*k(", "2dU.h3MD\u0015\u0006\u000b^", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ\u0005\"C|\u001c<R2BU\u0012}Au!*\\\u0019\u001fR9\u001a&d+@\u0003l.\u0018`$LLL;2\u0016YB\u0010#VWU'\u0016\u0007#+!sD5.]", "1n\\:b5\"\\\u0018~\u000eH-b\tC", "1n\\:b5\"\\\u0018~\u000eH-m\u00056u\u007f", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ\u0005\"C|\u001c<R2BU\u0012}Au!*\\\u0019\"p0/\u00112h5\u0010eu8s,GJ]\u0002 6", "1n\\:b5\"ax\u0007\u0006m@", "1n\\:b5$S-Z\n", "7mS2k", "1n\\:b5)c(", "1n\\:b5)c(Z\u0002e", "=sW2e", "1n\\:b5)c(b{:)\u000b\t8t", "1n\\:b5+S!\t\f^", "1n\\:b5+S!\t\f^\b\f", "1n\\:b5+S!\t\f^\b\fu+n\u0002(", "Ahi2", "1n\\:b5+S$\u0006v\\,", "=kS#T3NS", "<df#T3NS", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ\u0005\"C|\u001c<R2BU\u0012}Au!*\\\u0019\u001fR9\u001a&d+@\u0003l.\u0018`$LLL;29w9%\u000e$\u0015J4\u000fNC>)nBFtK!", "1n\\:b5,S(ove<|d>", "1n\\:b5,W.~", "1n\\:b5-]\u0007\u000e\bb5~", "", "1n\\:b5/O \u000fz:;", "5b", "7mc2e5:Zz~\n", "\"", "1n[9X*MW#\b"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SparseArrayCompatKt {
    private static final Object DELETED = new Object();

    private static final <E, T extends E> T internalGet(SparseArrayCompat<E> sparseArrayCompat, int i2, T t2) {
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i2);
        return (iBinarySearch < 0 || sparseArrayCompat.values[iBinarySearch] == DELETED) ? t2 : (T) sparseArrayCompat.values[iBinarySearch];
    }

    public static final <E> void commonRemove(SparseArrayCompat<E> sparseArrayCompat, int i2) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i2);
        if (iBinarySearch >= 0) {
            Object obj = sparseArrayCompat.values[iBinarySearch];
            Object obj2 = DELETED;
            if (obj != obj2) {
                sparseArrayCompat.values[iBinarySearch] = obj2;
                sparseArrayCompat.garbage = true;
            }
        }
    }

    public static final <E> boolean commonRemove(SparseArrayCompat<E> sparseArrayCompat, int i2, Object obj) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        int iIndexOfKey = sparseArrayCompat.indexOfKey(i2);
        if (iIndexOfKey < 0 || !Intrinsics.areEqual(obj, sparseArrayCompat.valueAt(iIndexOfKey))) {
            return false;
        }
        sparseArrayCompat.removeAt(iIndexOfKey);
        return true;
    }

    public static final <E> void commonRemoveAt(SparseArrayCompat<E> sparseArrayCompat, int i2) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.values[i2] != DELETED) {
            sparseArrayCompat.values[i2] = DELETED;
            sparseArrayCompat.garbage = true;
        }
    }

    public static final <E> void commonRemoveAtRange(SparseArrayCompat<E> sparseArrayCompat, int i2, int i3) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        int iMin = Math.min(i3, i2 + i3);
        while (i2 < iMin) {
            sparseArrayCompat.removeAt(i2);
            i2++;
        }
    }

    public static final <E> E commonReplace(SparseArrayCompat<E> sparseArrayCompat, int i2, E e2) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        int iIndexOfKey = sparseArrayCompat.indexOfKey(i2);
        if (iIndexOfKey < 0) {
            return null;
        }
        E e3 = (E) sparseArrayCompat.values[iIndexOfKey];
        sparseArrayCompat.values[iIndexOfKey] = e2;
        return e3;
    }

    public static final <E> boolean commonReplace(SparseArrayCompat<E> sparseArrayCompat, int i2, E e2, E e3) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        int iIndexOfKey = sparseArrayCompat.indexOfKey(i2);
        if (iIndexOfKey < 0 || !Intrinsics.areEqual(sparseArrayCompat.values[iIndexOfKey], e2)) {
            return false;
        }
        sparseArrayCompat.values[iIndexOfKey] = e3;
        return true;
    }

    public static final <E> void gc(SparseArrayCompat<E> sparseArrayCompat) {
        int i2 = sparseArrayCompat.size;
        int[] iArr = sparseArrayCompat.keys;
        Object[] objArr = sparseArrayCompat.values;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != DELETED) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        sparseArrayCompat.garbage = false;
        sparseArrayCompat.size = i3;
    }

    public static final <E> void commonPut(SparseArrayCompat<E> sparseArrayCompat, int i2, E e2) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i2);
        if (iBinarySearch >= 0) {
            sparseArrayCompat.values[iBinarySearch] = e2;
            return;
        }
        int i3 = ~iBinarySearch;
        if (i3 < sparseArrayCompat.size && sparseArrayCompat.values[i3] == DELETED) {
            sparseArrayCompat.keys[i3] = i2;
            sparseArrayCompat.values[i3] = e2;
            return;
        }
        if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
            gc(sparseArrayCompat);
            i3 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i2);
        }
        if (sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(sparseArrayCompat.size + 1);
            int[] iArrCopyOf = Arrays.copyOf(sparseArrayCompat.keys, iIdealIntArraySize);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            sparseArrayCompat.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(sparseArrayCompat.values, iIdealIntArraySize);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            sparseArrayCompat.values = objArrCopyOf;
        }
        if (sparseArrayCompat.size - i3 != 0) {
            int i4 = i3 + 1;
            ArraysKt.copyInto(sparseArrayCompat.keys, sparseArrayCompat.keys, i4, i3, sparseArrayCompat.size);
            ArraysKt.copyInto(sparseArrayCompat.values, sparseArrayCompat.values, i4, i3, sparseArrayCompat.size);
        }
        sparseArrayCompat.keys[i3] = i2;
        sparseArrayCompat.values[i3] = e2;
        sparseArrayCompat.size++;
    }

    public static final <E> void commonPutAll(SparseArrayCompat<E> sparseArrayCompat, SparseArrayCompat<? extends E> other) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int size = other.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iKeyAt = other.keyAt(i2);
            E eValueAt = other.valueAt(i2);
            int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, iKeyAt);
            if (iBinarySearch >= 0) {
                sparseArrayCompat.values[iBinarySearch] = eValueAt;
            } else {
                int i3 = ~iBinarySearch;
                if (i3 < sparseArrayCompat.size && sparseArrayCompat.values[i3] == DELETED) {
                    sparseArrayCompat.keys[i3] = iKeyAt;
                    sparseArrayCompat.values[i3] = eValueAt;
                } else {
                    if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
                        gc(sparseArrayCompat);
                        i3 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, iKeyAt);
                    }
                    if (sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
                        int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(sparseArrayCompat.size + 1);
                        int[] iArrCopyOf = Arrays.copyOf(sparseArrayCompat.keys, iIdealIntArraySize);
                        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
                        sparseArrayCompat.keys = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(sparseArrayCompat.values, iIdealIntArraySize);
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
                        sparseArrayCompat.values = objArrCopyOf;
                    }
                    if (sparseArrayCompat.size - i3 != 0) {
                        int i4 = i3 + 1;
                        ArraysKt.copyInto(sparseArrayCompat.keys, sparseArrayCompat.keys, i4, i3, sparseArrayCompat.size);
                        ArraysKt.copyInto(sparseArrayCompat.values, sparseArrayCompat.values, i4, i3, sparseArrayCompat.size);
                    }
                    sparseArrayCompat.keys[i3] = iKeyAt;
                    sparseArrayCompat.values[i3] = eValueAt;
                    sparseArrayCompat.size++;
                }
            }
        }
    }

    public static final <E> E commonPutIfAbsent(SparseArrayCompat<E> sparseArrayCompat, int i2, E e2) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        E e3 = (E) commonGet(sparseArrayCompat, i2);
        if (e3 == null) {
            int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i2);
            if (iBinarySearch >= 0) {
                sparseArrayCompat.values[iBinarySearch] = e2;
            } else {
                int i3 = ~iBinarySearch;
                if (i3 < sparseArrayCompat.size && sparseArrayCompat.values[i3] == DELETED) {
                    sparseArrayCompat.keys[i3] = i2;
                    sparseArrayCompat.values[i3] = e2;
                } else {
                    if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
                        gc(sparseArrayCompat);
                        i3 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i2);
                    }
                    if (sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
                        int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(sparseArrayCompat.size + 1);
                        int[] iArrCopyOf = Arrays.copyOf(sparseArrayCompat.keys, iIdealIntArraySize);
                        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
                        sparseArrayCompat.keys = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(sparseArrayCompat.values, iIdealIntArraySize);
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
                        sparseArrayCompat.values = objArrCopyOf;
                    }
                    if (sparseArrayCompat.size - i3 != 0) {
                        int i4 = i3 + 1;
                        ArraysKt.copyInto(sparseArrayCompat.keys, sparseArrayCompat.keys, i4, i3, sparseArrayCompat.size);
                        ArraysKt.copyInto(sparseArrayCompat.values, sparseArrayCompat.values, i4, i3, sparseArrayCompat.size);
                    }
                    sparseArrayCompat.keys[i3] = i2;
                    sparseArrayCompat.values[i3] = e2;
                    sparseArrayCompat.size++;
                }
            }
        }
        return e3;
    }

    public static final <E> int commonSize(SparseArrayCompat<E> sparseArrayCompat) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        return sparseArrayCompat.size;
    }

    public static final <E> boolean commonIsEmpty(SparseArrayCompat<E> sparseArrayCompat) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        return sparseArrayCompat.size() == 0;
    }

    public static final <E> int commonKeyAt(SparseArrayCompat<E> sparseArrayCompat, int i2) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        return sparseArrayCompat.keys[i2];
    }

    public static final <E> E commonValueAt(SparseArrayCompat<E> sparseArrayCompat, int i2) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        return (E) sparseArrayCompat.values[i2];
    }

    public static final <E> void commonSetValueAt(SparseArrayCompat<E> sparseArrayCompat, int i2, E e2) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        sparseArrayCompat.values[i2] = e2;
    }

    public static final <E> int commonIndexOfKey(SparseArrayCompat<E> sparseArrayCompat, int i2) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        return ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i2);
    }

    public static final <E> int commonIndexOfValue(SparseArrayCompat<E> sparseArrayCompat, E e2) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        int i2 = sparseArrayCompat.size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (sparseArrayCompat.values[i3] == e2) {
                return i3;
            }
        }
        return -1;
    }

    public static final <E> boolean commonContainsKey(SparseArrayCompat<E> sparseArrayCompat, int i2) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        return sparseArrayCompat.indexOfKey(i2) >= 0;
    }

    public static final <E> void commonClear(SparseArrayCompat<E> sparseArrayCompat) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        int i2 = sparseArrayCompat.size;
        Object[] objArr = sparseArrayCompat.values;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        sparseArrayCompat.size = 0;
        sparseArrayCompat.garbage = false;
    }

    public static final <E> void commonAppend(SparseArrayCompat<E> sparseArrayCompat, int i2, E e2) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.size != 0 && i2 <= sparseArrayCompat.keys[sparseArrayCompat.size - 1]) {
            sparseArrayCompat.put(i2, e2);
            return;
        }
        if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
            gc(sparseArrayCompat);
        }
        int i3 = sparseArrayCompat.size;
        if (i3 >= sparseArrayCompat.keys.length) {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i3 + 1);
            int[] iArrCopyOf = Arrays.copyOf(sparseArrayCompat.keys, iIdealIntArraySize);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            sparseArrayCompat.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(sparseArrayCompat.values, iIdealIntArraySize);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            sparseArrayCompat.values = objArrCopyOf;
        }
        sparseArrayCompat.keys[i3] = i2;
        sparseArrayCompat.values[i3] = e2;
        sparseArrayCompat.size = i3 + 1;
    }

    public static final <E> String commonToString(SparseArrayCompat<E> sparseArrayCompat) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(sparseArrayCompat.size * 28);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int i2 = sparseArrayCompat.size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(sparseArrayCompat.keyAt(i3));
            sb.append('=');
            E eValueAt = sparseArrayCompat.valueAt(i3);
            if (eValueAt != sparseArrayCompat) {
                sb.append(eValueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "buffer.toString()");
        return string;
    }

    public static final <E> E commonGet(SparseArrayCompat<E> sparseArrayCompat, int i2) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i2);
        if (iBinarySearch < 0 || sparseArrayCompat.values[iBinarySearch] == DELETED) {
            return null;
        }
        return (E) sparseArrayCompat.values[iBinarySearch];
    }

    public static final <E> E commonGet(SparseArrayCompat<E> sparseArrayCompat, int i2, E e2) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i2);
        return (iBinarySearch < 0 || sparseArrayCompat.values[iBinarySearch] == DELETED) ? e2 : (E) sparseArrayCompat.values[iBinarySearch];
    }

    public static final <E> boolean commonContainsValue(SparseArrayCompat<E> sparseArrayCompat, E e2) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        int i2 = sparseArrayCompat.size;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                i3 = -1;
                break;
            }
            if (sparseArrayCompat.values[i3] == e2) {
                break;
            }
            i3++;
        }
        return i3 >= 0;
    }
}
