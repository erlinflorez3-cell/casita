package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: SelectionLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4C\u0007\"B\u0012\u007f\u0007lmA0RkP.XV2\u000fy\u0005<$a&yCQU\"}(\u0010WN}gvJ`\u000bK\u000f\u0014\u0016\u0001̓4Ikxe\u0012\u00153HNU\u074c}ok8)\tD$882:\n\u0005/0Xh@z\tdc\f@F\u0007\u0015\u0003l\u001bo\u001d\u001a@)n0\u000fBts^8Xl\f??%\u0013ipqU\u0005v!\u0016\u001dTz?\r%rN1N^M\u0017;R1ޗ\u0019\u007f\u0010\u0013MqU\u0005\u0017(}ȉKָ[:p\u0002\u001a\u00179R]m\u0001*t\u0005\u007feb˓-յgOh\u0010.}\t\u0003]L\u0012\u0016\u001e'v3\u0004զhڿ\u00127\rtYI^\t/R\u000e\u0005y6E0Vĸ-ݰ\u001fjicA%\\DL\u0015\u001b,;\u0001\u001d&2ڑ\u0010\u05ce\u0019\u001flyW@_G\u000eX\\\u001aq=\u001c\u0015GĎ\u0004ò\b4_\u00025\f\u001f@g5EnQ#OpXҭFϼz\txjY}`O\u00114|+O,\u001f\u000b\tZ;ʴmÏX\\D\u0013S3b\u001fN\u0018!9twj,{ŒPћlm\u0003Oc$3<7Gg\n\u0004\u000e\u0006>5ۏ7Ʉg\u0014yT|0MC3\u0015f\u0004ZS:e3͌$ĘLn(y\u0002b\\\u0019ȇ1ŭڧ\u001c843\u001f{CGҺ\"j̇\u0001\b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\u000eC`X<k(", "", "1q^@f\u001aMO(\u000f\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=grukG\u0015Q;J\u00067U\"", "5dc\u0010e6La\u0007\u000evm<\u000b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7$.TC9z8(\u001e2?F\u0011q:<\u0006#V\\\\\u0002", "1ta?X5M7\"\u007f\u0005", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r(K}'+UO62", "5dc\u0010h9KS\"\u000e^g-\u0007", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7$.TC9z8(\u001e2O9\u000ec*]r$NL25]\\H", "3mS\u0016a-H", "5dc\u0012a+\"\\\u001a\t", "3mS _6M", "", "5dc\u0012a+,Z#\u000e", "u(8", "4ha@g\u0010GT#", "5dc\u0013\\9Lb|\b{h", "7rBAT9M6\u0015\bye,", "", "u(I", ":`bA<5?]", "5dc\u0019T:M7\"\u007f\u0005", ">qTC\\6Na\u0007~\u0002^*\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f|", "5dc\u001de,OW#\u000f\tL,\u0004\t-t\u00042\u0005", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7$.TC9z8(\u001e2O9\u000ec*]z1P\"", "Ahi2", "5dc \\A>", "AsP?g\u0010GT#", "5dc g(Kb|\b{h", "AsP?g\u001aE](", "5dc g(Kb\u0007\u0006\u0005m", "1qT.g,,c\u0016lze,z\u00183o\t6", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\ng! IY\u000bAv#DAy+\r", "Ad[2V;B]\"", "4na\u0012T*A;\u001d}ye,`\u00120o", "", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "Ag^B_++S\u0017\t\u0003i<\f\t\u001de\u0007(yO\u0005! ", "=sW2e", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface SelectionLayout {
    LongObjectMap<Selection> createSubSelections(Selection selection);

    void forEachMiddleInfo(Function1<? super SelectableInfo, Unit> function1);

    CrossStatus getCrossStatus();

    SelectableInfo getCurrentInfo();

    SelectableInfo getEndInfo();

    int getEndSlot();

    SelectableInfo getFirstInfo();

    SelectableInfo getLastInfo();

    Selection getPreviousSelection();

    int getSize();

    SelectableInfo getStartInfo();

    int getStartSlot();

    boolean isStartHandle();

    boolean shouldRecomputeSelection(SelectionLayout selectionLayout);
}
