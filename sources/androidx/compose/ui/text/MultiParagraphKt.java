package androidx.compose.ui.text;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: MultiParagraph.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d̉=!,o\bӵLc\u0003\"I\u0006F\u000b6B\u0005%4\u0012\u0006\fnʑA0ReP\u008cZS@\u000fsڔ<$q$yCAY2\u001a0ޛgN\u0016f\u001fTh\u000b[\u0015\u0016\u0018\tjZK\u0004y\u000e\u0016\u001d5Zom2\u0014ڎUUnxN\u0005N1RB\b\u0005\u0019 :J v)Ey\rB4NuRR;LK܅*\"L&\u0019\u001e\u000bf~@Vlu@?%\u0013ipPU``\u0001[\u0014^TU\u0015=ѭ6eN@M\u0015S]3\u0011`[W\tOsM\u0005\u0017)U,yweAp\u007fB![_\u001bj\u000b2l\u0007a`:);QsK~\u0018V\u0006AԈʗ;ǉ؝\n)N=;*~3\u001cD\rr\u0002?p\u0004dۍ\u000e\r\n<''\u00103qKIg\u0002qI,fC\f\u0007\u001d\u001ei\u0013~#kT<_C)\u001bȰWĻQEEKT̅uklշtv"}, d2 = {"4h]1C(KO\u001b\fvi/Y\u001d\u0013n~(\u000f", "", ">`a.Z9:^\u001cb\u0004_6c\r=t", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9x8\u0004!7fy+:Q\u001f/W\u0019", "7mS2k", "4h]1C(KO\u001b\fvi/Y\u001d\u0016i\t(_I\u007f\u0017*", ":h]2<5=S,", "4h]1C(KO\u001b\fvi/Y\u001d#", "G", "", "4h]1C(KO\u001b\fvi/\u000beCR{1}@", "", "@`]4X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "/bc6b5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "4h]1C(KO\u001b\fvi/\u000beCR{1}@H\u0005\u0014\u000fL\f\t^", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;d\u000f\u0002J\u0010\u001e\u001bP9\u0013M~n6i\u0007\u001eFq 7[\r\u001c{=\u001c$lkBR9o?", "4`bA50GO&\u0013h^(\n\u00072", "\"", "1n\\=T9Ba#\b", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MultiParagraphKt {
    public static final int findParagraphByIndex(List<ParagraphInfo> list, int i2) {
        int endIndex = ((ParagraphInfo) CollectionsKt.last((List) list)).getEndIndex();
        if (i2 > ((ParagraphInfo) CollectionsKt.last((List) list)).getEndIndex()) {
            throw new IllegalArgumentException(("Index " + i2 + " should be less or equal than last line's end " + endIndex).toString());
        }
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i4);
            byte b2 = paragraphInfo.getStartIndex() > i2 ? (byte) 1 : paragraphInfo.getEndIndex() <= i2 ? (byte) -1 : (byte) 0;
            if (b2 < 0) {
                i3 = i4 + 1;
            } else {
                if (b2 <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int findParagraphByY(List<ParagraphInfo> list, float f2) {
        if (f2 <= 0.0f) {
            return 0;
        }
        if (f2 >= ((ParagraphInfo) CollectionsKt.last((List) list)).getBottom()) {
            return CollectionsKt.getLastIndex(list);
        }
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i3);
            byte b2 = paragraphInfo.getTop() > f2 ? (byte) 1 : paragraphInfo.getBottom() <= f2 ? (byte) -1 : (byte) 0;
            if (b2 < 0) {
                i2 = i3 + 1;
            } else {
                if (b2 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: renamed from: findParagraphsByRange-Sb-Bc2M, reason: not valid java name */
    public static final void m5995findParagraphsByRangeSbBc2M(List<ParagraphInfo> list, long j2, Function1<? super ParagraphInfo, Unit> function1) {
        int size = list.size();
        for (int iFindParagraphByIndex = findParagraphByIndex(list, TextRange.m6121getMinimpl(j2)); iFindParagraphByIndex < size; iFindParagraphByIndex++) {
            ParagraphInfo paragraphInfo = list.get(iFindParagraphByIndex);
            if (paragraphInfo.getStartIndex() >= TextRange.m6120getMaximpl(j2)) {
                return;
            }
            if (paragraphInfo.getStartIndex() != paragraphInfo.getEndIndex()) {
                function1.invoke(paragraphInfo);
            }
        }
    }

    private static final <T> int fastBinarySearch(List<? extends T> list, Function1<? super T, Integer> function1) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iIntValue = function1.invoke(list.get(i3)).intValue();
            if (iIntValue < 0) {
                i2 = i3 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int findParagraphByLineIndex(List<ParagraphInfo> list, int i2) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i4);
            byte b2 = paragraphInfo.getStartLineIndex() > i2 ? (byte) 1 : paragraphInfo.getEndLineIndex() <= i2 ? (byte) -1 : (byte) 0;
            if (b2 < 0) {
                i3 = i4 + 1;
            } else {
                if (b2 <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }
}
