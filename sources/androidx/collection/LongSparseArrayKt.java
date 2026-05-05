package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.LongIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.truncatedMessage(InvalidProtocolBufferException.java:70)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.refillBuffer(CodedInputStream.java:1094)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.ensureAvailable(CodedInputStream.java:1080)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readRawBytesSlowPath(CodedInputStream.java:1215)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readBytes(CodedInputStream.java:529)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:244)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:305)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:251)
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
/* JADX INFO: compiled from: LongSparseArray.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯZ\u001d̉=!,˛\bӵLc\u0003\nIي8\u000bDB\u0007\"2\u0015\u007f\u0007tjA0JeP.`Z2\u000fq}<$i-yCAp\"}0\u0015WNmjvJp\u000bK\u000f\u001c\u0016\u0001j2J]xs\u0012\u00172HpG3coE9fv>\u0005.X*\u0600\u00121\u000f\"BH>\u007f\u001bEQÈ :hvJT\u001dMK$@\tn$\u000f)tg|BxpkGG#Is\tø-ۢ4|[\u001b^k5\u001c\u000faL4`9;Ֆ3]+\rb]O\u0003\u0006{k\b/Ѩ-Ch\u0002gNX.%5-UՕk|Nb\u0015Sp\fm5}f{T\u001c3\u0010z*\u0019\u0003Ǌ\u0014\u001eKV@E\u001a\u0015\u0019.5zɁaJx\bnD\u0010z(@E(079F3f\u0018k\u0002ϋTѼ\u007f\u0005\u001b1;\u0018|5sT<i5\u001dZȭ_;yFMJ^\n G\u001c\u00077è\bB*>\\\u00181\u0012\u0010t!E9aݽ1+\u0014\bXFwvKj\u0017V\u001aVVK:nDCp\u009f\u0012ʑHd\u0013\u0002h\u0001fA)Mb^'\u007f\u000eʶ.f B1' N\u0016r\u0018m}a\u00180Gfee\u001fo\u001cnQ^y?\u0018Ұ\u0016уVv\"WT\u001b\u0013q~B\u001a\u000ezd.ί@J\u0013\u0012\u000ez\u000bX,\u00158>\u007f&\\2A\u001bl\u0015\u000f\rLEq\u0001\u0017jrh>\u000b\u000572\u001a\u0002$;\u000bGˇbʼsg\u0007aD\u001cn<EA\u007f69([Ȩv>%)\u0017\u0001\u0004\u007f\u000eqzJ|p$\u0001m{N\"`ߚWGa!*\u0017)`\u0003MGRǩs[u\u00187|\ryUE\u00171\u0018\fx}D`1T\u0016ܸ\u001dȔz^\u0001? {\u000e\u0017yF)X\u0004V\u0011ϵLS\u001b\ti>^8C\u000fM!k˛u:\u001cCK['K\"\u0018\u00165֒og\u0012u>{r\u000fl~\u0014\u0007\\g$\u000fzQ\f3\u0002ͰOq+LB<l1Khl}٤P\u0013\\\u0013CJQd7`fP;3\fq\u001f,;|\u0007_H \b}z8&͉yʸ\u0002\u0014lQ=8[t\u007fm\u001cT|\rP\u05fa\u0018\u0015$7~\u0014,=f`\u0006e9<\u0014\u00160>Q?h\u0004L\tj>Z?NՂIl\u0018\u00143\u0013\u0002\\^U!RDyĩd\u0018|~lXX\u0005'O\u000f$Z\u0005\r\u001aK\u001e'Aa\t{Sl/*<GҶ#͢\u001fj]\u0017~D9hl9I1x\u0003\u0011ԵkMq\bF\u0006W)4u\u001e\u000fh\u001c\u000b(Z\u0018IE\u0018Κe\u000f\\l/md|u\u0017\u0014lŚ\\,Q\u0005\u000b~\u001e<P\u00199\u001c\u007fv}mEL|\u0004gG(\u000e/Do\u0011RŲi̍\u001f-\u0014ZE\\W\u0011,'*`s=\u0004И.*O\n\u0005#lWTp8`K>$\u0011.b0\nYФ&\u001c\\X\u001c\u000b\fD\u0007|Y\"5\bՂlc\u0014}1B7+3\u0010pN\u0019|\u0018n\u0005c\u001da;\u0007t>ny57\u0017ɀ\u000fߓQ.!prn\u001fz8X?\u00114\u0017,˿D\u0012\u000b/ Qsh7u}^=/=vBa_<\u0003\"\fG\u0012uJ4\u0005,#dnM\u0005nOϟrܣ[\u000el\u0015@\u0011\u00037A\u0014+\bh`\u0017ӂBP\u001b$t1G\u0019ee;J\u0011\u000b\u0012da&O2\u0003C)DJ\u000b62=֬\t̯ft\u000eVZ \u0001-\u007f,[Gt? śg.\u0016j\u0013([E~L6/WÁ\u0017GqFNV\\HK[S9߿'\u001b)\u001bH\b\u007f\u0007_?\u0019T\u001aϸ0\u0019!\u000f=WywuZu=\u0088197u+Yv;k?\u0014OW\u0010\u0010\u0005b~{d\u001dՠgϕM5SO\u0012tN2\"\u001fR5&w)ǇS3p0o^PV:Y2)Z:|O;G\u001b\u0005:Ԉ4\u0002j\u0002\u0018sabJ\u001b\u0016\u001fܒL,Ur\u0017G]h@\rr\u0010uHEC\u001eYC(\r\u001f}}̂/Sx\u0004?bcs#u\n@XlF\u000bWO ,ƭ1\u001cZ\u001azps\to\u0012>\u00183\u001a\u0014yAR\u000f\t\u000fR^øQƭE՝t%[yz\u000b\u0007\u0011D`4˷\u001a\r.\u001c>J'\u0002DL\u000f\u0018C7U~YG@b,%+(s%L'.ߺMˇYqfUQh\u0019'bX{g|\u0007[ؽYfS\u001b\u0010l;.\u000eXl\u001dZ\\\u0014\u0019]dv\u001ct\u0003R?\u00066@2`~!E\f;b\u0602C\u05ee\u0014֧ܢ6bE\u0017|(9son\u0001fC/~ߏ\u0011\u0012i\u001f#\r.S\u007f4QvSКD\u0014\u001cj\u0007m|\u001c\b0\u0005gĮ/1.E?C[l\u001dgm\u001coj\rK8-4\b#$)iAl.$e̜Z8~/XMi\u0011-D\u0019\u0012+~\u001aP$>e\bM\u0006WdJ8\u0002ܱ@DY~I_O\u0019\rJguѕ\u0003[uK;w)>ws?f\u007fc\"yi\\\u0007JG[4M+\u0002`\u001flfҨL)><m\u0010{,\fT\u000f\u001ay6qžr{\u001blt@s>\u0003J\u001b\u001c\u0017S\f&iD\u0011\u0015\u0011tVN(b3.m̅Pц\u001d\u0001\u000fYy1\"y\\|3iC:hcP\u0017}'M͆\u0014\u0010\u0013g\b\u0017\f]y8;rL\t#џVf!\u0003CϹOܝ\bk7Ȋf\u0001N\u001cEZUn\t\n0ă\u001a~-2~UbQ<!!g5Մ\u001e\u05c9EaII'\u0017\u0011\u001eT\n8Sf\u0002яXa-1\u0002ݺO@Aܖ91"}, d2 = {"\u0012D;\u0012G\f\u001d", "", "Ahi2", "", "\"", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\ng! I]\u00198\u0004355\u000b-3\u0002k", "5dc \\A>\u0012\u0015\b\u0004h;x\u00183o\t6", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ}!Pq{Gr2CYY-Di*\u0004\u00114", "5dc \\A>", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ}!Pq{Gr2CYY-Di*\u0004\u0011'", "1n\\:b5\u001a^$~\u0004]", "", "\u0013", "9dh", "", "D`[BX", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ}!Pq{Gr2CYY-Di*\u00042*@gE\u001a^o]B\t-\u0016K{'E[$oM", "1n\\:b5\u001cZ\u0019z\b", "1n\\:b5\u001c]\"\u000evb5\u000bn/y", "", "1n\\:b5\u001c]\"\u000evb5\u000by+l\u0010(", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ}!Pq{Gr2CYY-Di*\u00044H7|0g\u001cdj;PM)Sv%V\"\u0012!", "1n\\:b5 Q", "1n\\:b5 S(", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ}!Pq{Gr2CYY-Di*\u00042\u0007\"p0/\u00112h5\u0010eu8s,GJ]\u0002", "2dU.h3MD\u0015\u0006\u000b^", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ}!Pq{Gr2CYY-Di*\u00042*@gE\u001a^o]B\t-\u0016K{'E[$oCWnN\u0010[a\nW-VnVF$lS\r", "1n\\:b5 S(b\u0004m,\n\u0012+l", "1n\\:b5\"\\\u0018~\u000eH-b\tC", "1n\\:b5\"\\\u0018~\u000eH-m\u00056u\u007f", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ}!Pq{Gr2CYY-Di*\u00044H7|0g\u001cdj;PM)Sv%V\"\u0012\u0010", "1n\\:b5\"ax\u0007\u0006m@", "1n\\:b5$S-Z\n", "7mS2k", "1n\\:b5)c(", "1n\\:b5)c(Z\u0002e", "=sW2e", "1n\\:b5)c(b{:)\u000b\t8t", "1n\\:b5+S!\t\f^", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ}!Pq{Gr2CYY-Di*\u00042*@gE\u001a^o]B\t-\u0016K{'E[$oQ", "1n\\:b5+S!\t\f^\b\f", "1n\\:b5+S$\u0006v\\,", "=kS#T3NS", "<df#T3NS", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ}!Pq{Gr2CYY-Di*\u00042*@gE\u001a^o]B\t-\u0016K{'E[$\u0013aN\u00049]\u0019V\u0017Ptv\u0002^A\"}\u001az\u0014", "1n\\:b5,S(ove<|d>", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ}!Pq{Gr2CYY-Di*\u00041*@gE\u001a^o]B\t-\u0016K{'E[$oM", "1n\\:b5,W.~", "1n\\:b5-]\u0007\u000e\bb5~", "", "1n\\:b5/O \u000fz:;", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ}!Pq{Gr2CYY-Di*\u00041\u0007\"p0/\u00112h5\u0010eu8s,GJ]\u0002", "1n]AT0Ga", "4na\u0012T*A", "/bc6b5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "5dc\u001ce\u000b>T\u0015\u000f\u0002m", "5dc\u001ce\fEa\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ}!Pq{Gr2CYY-Di*\u00042*AuC%\u0019q+>\u0018kuO\u00070E[R6e`<\u001e$\u001bX\u001dR5\u0016O/\u0005\u000bs@H\u001bQ3E\u000b=2j\t\u001b\u000e3yF", "7r=<g\fF^(\u0013", "9dh\u0016g,KO(\t\b", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E'\u000b \u0019+~\u000eIr4?fS", ">kd@", "@d\\<i,", "Adc", "D`[BX\u0010MS&z\nh9", "", "1n[9X*MW#\b"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LongSparseArrayKt {
    private static final Object DELETED = new Object();

    public static /* synthetic */ void getSize$annotations(LongSparseArray longSparseArray) {
    }

    public static final <T extends E, E> T commonGetInternal(LongSparseArray<E> longSparseArray, long j2, T t2) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j2);
        return (iBinarySearch < 0 || longSparseArray.values[iBinarySearch] == DELETED) ? t2 : (T) longSparseArray.values[iBinarySearch];
    }

    public static final <E> void commonRemove(LongSparseArray<E> longSparseArray, long j2) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j2);
        if (iBinarySearch < 0 || longSparseArray.values[iBinarySearch] == DELETED) {
            return;
        }
        longSparseArray.values[iBinarySearch] = DELETED;
        longSparseArray.garbage = true;
    }

    public static final <E> boolean commonRemove(LongSparseArray<E> longSparseArray, long j2, E e2) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        int iIndexOfKey = longSparseArray.indexOfKey(j2);
        if (iIndexOfKey < 0 || !Intrinsics.areEqual(e2, longSparseArray.valueAt(iIndexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(iIndexOfKey);
        return true;
    }

    public static final <E> void commonRemoveAt(LongSparseArray<E> longSparseArray, int i2) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        if (longSparseArray.values[i2] != DELETED) {
            longSparseArray.values[i2] = DELETED;
            longSparseArray.garbage = true;
        }
    }

    public static final <E> E commonReplace(LongSparseArray<E> longSparseArray, long j2, E e2) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        int iIndexOfKey = longSparseArray.indexOfKey(j2);
        if (iIndexOfKey < 0) {
            return null;
        }
        E e3 = (E) longSparseArray.values[iIndexOfKey];
        longSparseArray.values[iIndexOfKey] = e2;
        return e3;
    }

    public static final <E> boolean commonReplace(LongSparseArray<E> longSparseArray, long j2, E e2, E e3) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        int iIndexOfKey = longSparseArray.indexOfKey(j2);
        if (iIndexOfKey < 0 || !Intrinsics.areEqual(longSparseArray.values[iIndexOfKey], e2)) {
            return false;
        }
        longSparseArray.values[iIndexOfKey] = e3;
        return true;
    }

    public static final <E> void commonGc(LongSparseArray<E> longSparseArray) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        int i2 = longSparseArray.size;
        long[] jArr = longSparseArray.keys;
        Object[] objArr = longSparseArray.values;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != DELETED) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        longSparseArray.garbage = false;
        longSparseArray.size = i3;
    }

    public static final <E> void commonPut(LongSparseArray<E> longSparseArray, long j2, E e2) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j2);
        if (iBinarySearch >= 0) {
            longSparseArray.values[iBinarySearch] = e2;
            return;
        }
        int i2 = ~iBinarySearch;
        if (i2 < longSparseArray.size && longSparseArray.values[i2] == DELETED) {
            longSparseArray.keys[i2] = j2;
            longSparseArray.values[i2] = e2;
            return;
        }
        if (longSparseArray.garbage && longSparseArray.size >= longSparseArray.keys.length) {
            int i3 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = objArr[i5];
                if (obj != DELETED) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i4;
            i2 = ~ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j2);
        }
        if (longSparseArray.size >= longSparseArray.keys.length) {
            int iIdealLongArraySize = ContainerHelpersKt.idealLongArraySize(longSparseArray.size + 1);
            long[] jArrCopyOf = Arrays.copyOf(longSparseArray.keys, iIdealLongArraySize);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
            longSparseArray.keys = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(longSparseArray.values, iIdealLongArraySize);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            longSparseArray.values = objArrCopyOf;
        }
        if (longSparseArray.size - i2 != 0) {
            int i6 = i2 + 1;
            ArraysKt.copyInto(longSparseArray.keys, longSparseArray.keys, i6, i2, longSparseArray.size);
            ArraysKt.copyInto(longSparseArray.values, longSparseArray.values, i6, i2, longSparseArray.size);
        }
        longSparseArray.keys[i2] = j2;
        longSparseArray.values[i2] = e2;
        longSparseArray.size++;
    }

    public static final <E> void commonPutAll(LongSparseArray<E> longSparseArray, LongSparseArray<? extends E> other) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int size = other.size();
        for (int i2 = 0; i2 < size; i2++) {
            longSparseArray.put(other.keyAt(i2), other.valueAt(i2));
        }
    }

    public static final <E> E commonPutIfAbsent(LongSparseArray<E> longSparseArray, long j2, E e2) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        E e3 = longSparseArray.get(j2);
        if (e3 == null) {
            longSparseArray.put(j2, e2);
        }
        return e3;
    }

    public static final <E> int commonSize(LongSparseArray<E> longSparseArray) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        if (longSparseArray.garbage) {
            int i2 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != DELETED) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i3;
        }
        return longSparseArray.size;
    }

    public static final <E> boolean commonIsEmpty(LongSparseArray<E> longSparseArray) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        return longSparseArray.size() == 0;
    }

    public static final <E> long commonKeyAt(LongSparseArray<E> longSparseArray, int i2) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        if (!(i2 >= 0 && i2 < longSparseArray.size)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i2);
        }
        if (longSparseArray.garbage) {
            int i3 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = objArr[i5];
                if (obj != DELETED) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i4;
        }
        return longSparseArray.keys[i2];
    }

    public static final <E> E commonValueAt(LongSparseArray<E> longSparseArray, int i2) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        if (!(i2 >= 0 && i2 < longSparseArray.size)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i2);
        }
        if (longSparseArray.garbage) {
            int i3 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = objArr[i5];
                if (obj != DELETED) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i4;
        }
        return (E) longSparseArray.values[i2];
    }

    public static final <E> void commonSetValueAt(LongSparseArray<E> longSparseArray, int i2, E e2) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        if (!(i2 >= 0 && i2 < longSparseArray.size)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i2);
        }
        if (longSparseArray.garbage) {
            int i3 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = objArr[i5];
                if (obj != DELETED) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i4;
        }
        longSparseArray.values[i2] = e2;
    }

    public static final <E> int commonIndexOfKey(LongSparseArray<E> longSparseArray, long j2) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        if (longSparseArray.garbage) {
            int i2 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != DELETED) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i3;
        }
        return ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j2);
    }

    public static final <E> int commonIndexOfValue(LongSparseArray<E> longSparseArray, E e2) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        if (longSparseArray.garbage) {
            int i2 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != DELETED) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i3;
        }
        int i5 = longSparseArray.size;
        for (int i6 = 0; i6 < i5; i6++) {
            if (longSparseArray.values[i6] == e2) {
                return i6;
            }
        }
        return -1;
    }

    public static final <E> boolean commonContainsKey(LongSparseArray<E> longSparseArray, long j2) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        return longSparseArray.indexOfKey(j2) >= 0;
    }

    public static final <E> boolean commonContainsValue(LongSparseArray<E> longSparseArray, E e2) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        return longSparseArray.indexOfValue(e2) >= 0;
    }

    public static final <E> void commonClear(LongSparseArray<E> longSparseArray) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        int i2 = longSparseArray.size;
        Object[] objArr = longSparseArray.values;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        longSparseArray.size = 0;
        longSparseArray.garbage = false;
    }

    public static final <E> void commonAppend(LongSparseArray<E> longSparseArray, long j2, E e2) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        if (longSparseArray.size != 0 && j2 <= longSparseArray.keys[longSparseArray.size - 1]) {
            longSparseArray.put(j2, e2);
            return;
        }
        if (longSparseArray.garbage && longSparseArray.size >= longSparseArray.keys.length) {
            int i2 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != DELETED) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i3;
        }
        int i5 = longSparseArray.size;
        if (i5 >= longSparseArray.keys.length) {
            int iIdealLongArraySize = ContainerHelpersKt.idealLongArraySize(i5 + 1);
            long[] jArrCopyOf = Arrays.copyOf(longSparseArray.keys, iIdealLongArraySize);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
            longSparseArray.keys = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(longSparseArray.values, iIdealLongArraySize);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            longSparseArray.values = objArrCopyOf;
        }
        longSparseArray.keys[i5] = j2;
        longSparseArray.values[i5] = e2;
        longSparseArray.size = i5 + 1;
    }

    public static final <E> String commonToString(LongSparseArray<E> longSparseArray) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        if (longSparseArray.size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(longSparseArray.size * 28);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int i2 = longSparseArray.size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(longSparseArray.keyAt(i3));
            sb.append('=');
            E eValueAt = longSparseArray.valueAt(i3);
            if (eValueAt != sb) {
                sb.append(eValueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public static final <T> int getSize(LongSparseArray<T> longSparseArray) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        return longSparseArray.size();
    }

    public static final <T> boolean contains(LongSparseArray<T> longSparseArray, long j2) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        return longSparseArray.containsKey(j2);
    }

    public static final <T> void set(LongSparseArray<T> longSparseArray, long j2, T t2) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        longSparseArray.put(j2, t2);
    }

    public static final <T> LongSparseArray<T> plus(LongSparseArray<T> longSparseArray, LongSparseArray<T> other) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        LongSparseArray<T> longSparseArray2 = new LongSparseArray<>(longSparseArray.size() + other.size());
        longSparseArray2.putAll(longSparseArray);
        longSparseArray2.putAll(other);
        return longSparseArray2;
    }

    public static final <T> T getOrDefault(LongSparseArray<T> longSparseArray, long j2, T t2) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        return longSparseArray.get(j2, t2);
    }

    public static final <T> T getOrElse(LongSparseArray<T> longSparseArray, long j2, Function0<? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        T t2 = longSparseArray.get(j2);
        return t2 == null ? defaultValue.invoke() : t2;
    }

    public static final <T> boolean isNotEmpty(LongSparseArray<T> longSparseArray) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        return !longSparseArray.isEmpty();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0015K\fArw\u001a[\u0018^1\u000fXT9SiN\u000e9Dn!`yZwy\\BcXmYsXR\u001cmQZ#AM\u001beZ9+eXJwRt")
    @InterfaceC1492Gx
    public static final /* synthetic */ boolean remove(LongSparseArray longSparseArray, long j2, Object obj) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        return longSparseArray.remove(j2, obj);
    }

    public static final <T> void forEach(LongSparseArray<T> longSparseArray, Function2<? super Long, ? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int size = longSparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            action.invoke(Long.valueOf(longSparseArray.keyAt(i2)), longSparseArray.valueAt(i2));
        }
    }

    /* JADX INFO: renamed from: androidx.collection.LongSparseArrayKt$keyIterator$1 */
    /* JADX INFO: compiled from: LongSparseArray.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я!\u001d̉=!4i\bӵLc\u0003\nI\u00066\u000e6B\r+4ߚ\u007f\u0007tqAӄld߉4Ziճ?k*3lb2w[;\u0004!D̴\t\u0018Tuo\u0007J\t\u0014\n#V.\u0007jDI\u0004y4\u070f\u001b̓F{G\u074ceqC;nwV\u0007&60=ѯ\t\u000b"}, d2 = {"/mS?b0=fb|\u0005e3|\u0007>i\n1E'\u000b \u00195z\nI\u0005%\u0011f\u000b\u001cKS%lSCOOC\u001e\"dpC\u0014\"w", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E'\u000b \u0019+~\u000eIr4?fS", "7mS2k", "", "5dc\u0016a+>f", "u(8", "Adc\u0016a+>f", "uH\u0018#", "6`b\u001bX?M", "", "<dgA?6GU", "", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 extends LongIterator {
        final /* synthetic */ LongSparseArray<T> $this_keyIterator;
        private int index;

        AnonymousClass1(LongSparseArray<T> longSparseArray) {
            longSparseArray = longSparseArray;
        }

        public final int getIndex() {
            return this.index;
        }

        public final void setIndex(int i2) {
            this.index = i2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < longSparseArray.size();
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
        @Override // kotlin.collections.LongIterator
        public long nextLong() {
            LongSparseArray<T> longSparseArray = longSparseArray;
            int i2 = this.index;
            this.index = i2 + 1;
            return longSparseArray.keyAt(i2);
        }
    }

    public static final <T> LongIterator keyIterator(LongSparseArray<T> longSparseArray) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        return new LongIterator() { // from class: androidx.collection.LongSparseArrayKt.keyIterator.1
            final /* synthetic */ LongSparseArray<T> $this_keyIterator;
            private int index;

            AnonymousClass1(LongSparseArray<T> longSparseArray2) {
                longSparseArray = longSparseArray2;
            }

            public final int getIndex() {
                return this.index;
            }

            public final void setIndex(int i2) {
                this.index = i2;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < longSparseArray.size();
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
            @Override // kotlin.collections.LongIterator
            public long nextLong() {
                LongSparseArray<T> longSparseArray2 = longSparseArray;
                int i2 = this.index;
                this.index = i2 + 1;
                return longSparseArray2.keyAt(i2);
            }
        };
    }

    /* JADX INFO: renamed from: androidx.collection.LongSparseArrayKt$valueIterator$1 */
    /* JADX INFO: compiled from: LongSparseArray.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001d\u001d̉=!,\u0010\bӵLc\u0003\nI\u00066\u000e6B\r+4\u0012}\b\u000fiˎ6L{߉^Xc,\u001fk2éRZlxQAm\u001a,)OѾN0s|Rr\u000byƤLǴx̶0Ic\u0002.*\u001d2Zom4$ڕI˃d\u0001>ӌ84(:\b\b!\u001c0L\u001e{ڂGU"}, d2 = {"/mS?b0=fb|\u0005e3|\u0007>i\n1E'\u000b \u00195z\nI\u0005%\u0011f\u000b\u001cKS%l^?B{4\u0002$hn5\u0016m9\rB", "", "7mS2k", "", "5dc\u0016a+>f", "u(8", "Adc\u0016a+>f", "uH\u0018#", "6`b\u001bX?M", "", "<dgA", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class C03721<T> implements Iterator<T>, KMappedMarker {
        final /* synthetic */ LongSparseArray<T> $this_valueIterator;
        private int index;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        C03721(LongSparseArray<T> longSparseArray) {
            this.$this_valueIterator = longSparseArray;
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
            LongSparseArray<T> longSparseArray = this.$this_valueIterator;
            int i2 = this.index;
            this.index = i2 + 1;
            return longSparseArray.valueAt(i2);
        }
    }

    public static final <T> Iterator<T> valueIterator(LongSparseArray<T> longSparseArray) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        return new C03721(longSparseArray);
    }

    public static final <E> E commonGet(LongSparseArray<E> longSparseArray, long j2) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j2);
        if (iBinarySearch < 0 || longSparseArray.values[iBinarySearch] == DELETED) {
            return null;
        }
        return (E) longSparseArray.values[iBinarySearch];
    }

    public static final <E> E commonGet(LongSparseArray<E> longSparseArray, long j2, E e2) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j2);
        return (iBinarySearch < 0 || longSparseArray.values[iBinarySearch] == DELETED) ? e2 : (E) longSparseArray.values[iBinarySearch];
    }
}
