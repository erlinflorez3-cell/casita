package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: Selectable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\\\u001d<K!&i\u000eӵLш|\u0004O\r8\u000b4C\u0007\":\u0012\u007fјnjO0L͜P.hS2şs{B*cҕyCIZ\"Ԃ*\teNo˧vJp\u000bKƤ\u000e\u0016\u0007s4I[ze\u0012%2JoE4UoS9ht<\u0007(288\u0002ڎ\u0007x@Ϻ@v)B\u0014\u001a 4XphW=Q\u0013 *\u0006l'GB%u\\>`l\fC_'\u0011sZNUjv!\u0016\u001bT`?\r%nN/NAM\u0015S^I+\u001b~M\u0011Wqk\u0014\u0019+5;as\u0006G\t\u0004\"'CO;p9Jڑ\u0004ĩՙ\u000b&˦SeQd\u001c=@\u0001\n#T\u0004<\u0011mlv5(} \u0010Is!k\u0007tJlP\u0019\u0013ad$U\u0004A5Q\u001b\u0015\\(_a\\E\u0016\u001d\rL01r/el\u000e\u000f ax@l?lX=vj:]Kw\u001cp\u0011\rp(ϻFĉôz\u0010ѧ\u001b'=xGAis\u0010g\\i\r\u0004\u000fy\u001a\u000e\u001bNNB\u0007\u0016eKO0+Tr\u0005\u0004P\u0003Y\u0003ұOɟX\u000b\u0016\n\u0019\"jz͌ %ĮN^piple\r+æ\u0003eXvm\u0014vg]ۑ9sӰ\u0014`"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r(K}'\u001d", "", "Ad[2V;:P ~^]", "", "5dc X3>Q(zwe,`\b", "u(9", "/o_2a+,S ~xm(y\u0010/I\t)\u0006/\u000bs'Kv\r<\u0004", "", "0tX9W,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\u000eC`X<k/\u0003A\u001b\u0011Z\u001b$", "5dc\u000fb<GR\u001d\b|;6\u0010", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "=eU@X;", "", "5dc\u0010X5MS&r[h9f\n0s\u007f7", "", "5dc\u0015T5=Z\u0019i\u0005l0\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "Ad[2V;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f|", "7rBAT9M6\u0015\bye,", "", "5dc\u0015T5=Z\u0019i\u0005l0\f\r9nG'X\u001c\u0004i\u00047", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001{\u00165MAJo>'^Va@\u0007a;R\u00010\u001dA\u0012\u0011", "5dc\u0019T:MD\u001d\r~[3|r0f\u000e(\u000b", "5dc\u0019T@Hc(\\\u0005h9{\r8a\u000f(\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "5dc\u0019\\5>:\u0019\u007f\n", "5dc\u0019\\5>@\u001d\u0001}m", "5dc\u001fT5@S\u0003\u007fab5|f9n\u000f$\u007fI\u0005 \u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "5dc\u001fT5@S\u0003\u007fab5|f9n\u000f$\u007fI\u0005 \u0019\u000f7\u0013OH\n\u0016g", "uH\u0018\u0017", "5dc X3>Q(Z\u0002e\u001a|\u0010/c\u000f,\u0006I", "5dc!X?M", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface Selectable {
    void appendSelectableInfoToBuilder(SelectionLayoutBuilder selectionLayoutBuilder);

    Rect getBoundingBox(int i2);

    float getCenterYForOffset(int i2);

    /* JADX INFO: renamed from: getHandlePosition-dBAh8RU */
    long mo1666getHandlePositiondBAh8RU(Selection selection, boolean z2);

    int getLastVisibleOffset();

    LayoutCoordinates getLayoutCoordinates();

    float getLineLeft(int i2);

    float getLineRight(int i2);

    /* JADX INFO: renamed from: getRangeOfLineContaining--jx7JFs */
    long mo1667getRangeOfLineContainingjx7JFs(int i2);

    Selection getSelectAllSelection();

    long getSelectableId();

    AnnotatedString getText();
}
