package androidx.compose.foundation.text;

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
/* JADX INFO: compiled from: KeyCommand.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eRLш|\u0004O\u000f8\u000b4t\u0005ӭ+(Մ7lz;@D\u0014߉\\Q\u00147\u0015k\f82[<qq<ڈ\u001e}0\u000b ]ug\u0007J\t\fß\u0013\f\u001eю\u0003.OX\u0007az\u000f8GX?9SX=?g]6\u000b(\u001b\">\u0003m\u0001 41\u0010|\u0006,K\u0012\u001e\u0019@vG;\rS\u0013\u0003\u0012\fM\t\u0001$lPN<YU]@A\f\u0003oU7'eDeM\u0013[='\u0013\rJ\u001e1W 5\u001b=<\u0003\rkD?\tYZ=\u000b\u0004\u0010'1e\\W<uh\u0014\u001bI8\rc\u0012\u000f\\\u000bqI\f-L8cQrv(}\u001ed\rB(v\u0006-m\u0017- \rp\u000e9\u001c[SFxj^H)ca<A\u000e\u007f9V\"\u001bl}J;\u001f{ {\u000b;\u0007#\u0007\u001e\n[Z>I\u0015!\u0006`Q7\u0004)=N\u0002rYC\"շt\u0018"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001dm*\fWKCg=\u001dj", "", "3cXAf\u001b>f(", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_5D\b", "5dc\u0012W0Ma\b~\u000em", "u(I", "\u001aD5!R\n!/\u0006", " H6\u0015G&\u001c6tk", " H6\u0015G&0=\u0006]", "\u001aD5!R\u001e(@w", "\u001cDG!R\u0017\u001a@t`g:\u0017_", "\u001eQ4#R\u0017\u001a@t`g:\u0017_", "\u001aH=\u0012R\u001a-/\u0006m", "\u001aH=\u0012R\f'2", "\u001aH=\u0012R\u0013\u001e4\b", "\u001aH=\u0012R\u0019\"5{m", "#O", "\u0012NF\u001b", "\u001e@6\u0012R\u001c)", "\u001e@6\u0012R\u000b(E\u0002", "\u0016N<\u0012", "\u0013M3", "\u0011N?&", "\u001e@B!8", "\u0011TC", "\u0012D;\u0012G\f8>\u0006^kX\n_d\u001c", "\u0012D;\u0012G\f8<xqiX\n_d\u001c", "\u0012D;\u0012G\f8>\u0006^kX\u001efu\u000e", "\u0012D;\u0012G\f8<xqiX\u001efu\u000e", "\u0012D;\u0012G\f84\u0006hbX\u0013`q\u000f_m\u0017W-o", "\u0012D;\u0012G\f8B\u0003xaB\u0015\\\u0003\u000fN^", "!D;\u00126\u001b8/\u007fe", "!D;\u00126\u001b8:x_iX\n_d\u001c", "!D;\u00126\u001b8@|`]M&Zk\u000bR", "!D;\u00126\u001b8C\u0004", "!D;\u00126\u001b82\u0003pc", "!D;\u00126\u001b8>t`ZX\u001cg", "!D;\u00126\u001b8>t`ZX\u000bfz\u0018", "!D;\u00126\u001b86\u0003fZ", "!D;\u00126\u001b83\u0002]", "!D;\u00126\u001b8:x_iX\u001efu\u000e", "!D;\u00126\u001b8@|`]M&nr\u001cD", "!D;\u00126\u001b8<xqiX\u0017Xu\u000bGl\u0004f#", "!D;\u00126\u001b8>\u0006^kX\u0017Xu\u000bGl\u0004f#", "!D;\u00126\u001b8:|gZX\u001akd\u001cT", "!D;\u00126\u001b8:|gZX\feg", "!D;\u00126\u001b8:|gZX\u0013\\i\u001e", "!D;\u00126\u001b8:|gZX\u0019`j\u0012T", "\u0012DB\u0012?\f\u001cB", "\u001cDF,?\u0010'3", "\"@1", "#M3\u001c", " D3\u001c", "\u0011G0\u001f4\n-3\u0006xe:\u0013\\w\u001eE", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public enum KeyCommand {
    LEFT_CHAR(false),
    RIGHT_CHAR(false),
    RIGHT_WORD(false),
    LEFT_WORD(false),
    NEXT_PARAGRAPH(false),
    PREV_PARAGRAPH(false),
    LINE_START(false),
    LINE_END(false),
    LINE_LEFT(false),
    LINE_RIGHT(false),
    UP(false),
    DOWN(false),
    PAGE_UP(false),
    PAGE_DOWN(false),
    HOME(false),
    END(false),
    COPY(false),
    PASTE(true),
    CUT(true),
    DELETE_PREV_CHAR(true),
    DELETE_NEXT_CHAR(true),
    DELETE_PREV_WORD(true),
    DELETE_NEXT_WORD(true),
    DELETE_FROM_LINE_START(true),
    DELETE_TO_LINE_END(true),
    SELECT_ALL(false),
    SELECT_LEFT_CHAR(false),
    SELECT_RIGHT_CHAR(false),
    SELECT_UP(false),
    SELECT_DOWN(false),
    SELECT_PAGE_UP(false),
    SELECT_PAGE_DOWN(false),
    SELECT_HOME(false),
    SELECT_END(false),
    SELECT_LEFT_WORD(false),
    SELECT_RIGHT_WORD(false),
    SELECT_NEXT_PARAGRAPH(false),
    SELECT_PREV_PARAGRAPH(false),
    SELECT_LINE_START(false),
    SELECT_LINE_END(false),
    SELECT_LINE_LEFT(false),
    SELECT_LINE_RIGHT(false),
    DESELECT(false),
    NEW_LINE(true),
    TAB(true),
    UNDO(true),
    REDO(true),
    CHARACTER_PALETTE(true);

    private final boolean editsText;

    KeyCommand(boolean z2) {
        this.editsText = z2;
    }

    public final boolean getEditsText() {
        return this.editsText;
    }
}
