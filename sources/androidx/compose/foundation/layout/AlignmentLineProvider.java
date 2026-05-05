package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measured;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0007\"B\u0012\u007f\u0007ljA0ZeP.hS2şq*Jř\f$ BsU\u001f\u0004b\u000eUP˗knXZSQ\u001d\u0007.x\u0019.yY\u0007`*\u000f`F6cݏLoDAƄx?"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q5QEDs4'$OeB\u0007N9X\b+FL[\u0002", "", "u(E", "1`[0h3:b\u0019Z\u0002b.\u0006\u0011/n\u000f\u000f\u007fI\u0001\u0002!Us\u001d@\u0001.", "", ">kP0X(;Z\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "\u0010k^0^", "$`[BX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q5QEDs4'$OeB\u0007N9X\b+FL[j9Y|;\u001ag", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q5QEDs4'$OeB\u0007N9X\b+FL[jMNyM\u0014g", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class AlignmentLineProvider {
    public static final int $stable = 0;

    public /* synthetic */ AlignmentLineProvider(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int calculateAlignmentLinePosition(Placeable placeable);

    private AlignmentLineProvider() {
    }

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLш|\u0004W\u00068\u000bDB\u0007\":\u0018\u007f\u0007lmA0ZeP.XT2\u000fy\u0005<řc$\u007fّCU }*\t]Zo˧tЂ`!¼?\u0006Dw+CYe\u0007]*\u001bBD\u007f?aO\u007f?I`#93!ݨ&8\b\tI(8O(v)F{\u0010 8Xph[SaM- \u0010V,\u0011 lg|8Xnm:]&1j\tľ((M\u000bX%F\u0003܋=\tg\u001e9@OA%'c\u00035TkA\u0013? @3imޗ*\u0012\u0005eBp\u007fB\"[U\u001bk\u000b(r\u0004\u007foR̃,\u0018jY`&(&}Bɵ;L\u0015\u00148`.[,-۳\r\u0004\u0010\u0001SX\\\u0012`R\u007f)cF\u00195\u007fa.g\u001cƻUgCϊf9\u0002\n\u001b$ũ\u0005\u0002"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q5QEDs4'$OeB\u0007N9X\b+FL[j9Y|;\u001ag", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q5QEDs4'$OeB\u0007N9X\b+FL[\u0002", ":h]2C9Hd\u001d}zk\t\u0004\u0013-k", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7lk", "", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc(", "5dc\u0019\\5>>&\t\fb+|\u0016\fl\n&\u0002", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "1`[0h3:b\u0019Z\u0002b.\u0006\u0011/n\u000f\u000f\u007fI\u0001\u0002!Us\u001d@\u0001.", ">kP0X(;Z\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "BnBAe0GU", "", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Block extends AlignmentLineProvider {
        public static final int $stable = 0;
        private final Function1<Measured, Integer> lineProviderBlock;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Block copy$default(Block block, Function1 function1, int i2, Object obj) {
            if ((i2 + 1) - (i2 | 1) != 0) {
                function1 = block.lineProviderBlock;
            }
            return block.copy(function1);
        }

        public final Function1<Measured, Integer> component1() {
            return this.lineProviderBlock;
        }

        public final Block copy(Function1<? super Measured, Integer> function1) {
            return new Block(function1);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Block) && Intrinsics.areEqual(this.lineProviderBlock, ((Block) obj).lineProviderBlock);
        }

        public int hashCode() {
            return this.lineProviderBlock.hashCode();
        }

        public String toString() {
            return "Block(lineProviderBlock=" + this.lineProviderBlock + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Block(Function1<? super Measured, Integer> function1) {
            super(null);
            this.lineProviderBlock = function1;
        }

        public final Function1<Measured, Integer> getLineProviderBlock() {
            return this.lineProviderBlock;
        }

        @Override // androidx.compose.foundation.layout.AlignmentLineProvider
        public int calculateAlignmentLinePosition(Placeable placeable) {
            return this.lineProviderBlock.invoke(placeable).intValue();
        }
    }

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4D\u0007\":\u0018\u007fјnjO0LeN/ZS8\u0018sڔ<$iҕyCAU\"}0\u0015WȞm˯t`ҙ;C=\u0005V\u0004z0WU\u0011]@\u0010̓FoM5\u0016}K>xtd\u000bP60?\u0012\u0005/\"p\\X}\tLc\f@1\u0007È;\u001b\u001e[\u000f2\u00124̄P\u0007$\\uNNH\u001b^\u0001ȉ\"KzPY?_^\t}\u0013Ta?\u000f\r`L9\u0007̑6],a\u0012\u001fR\nEIԡp\u0006\fv7?+w\u0005\u001e\u0383WP##+g\r\fs͉`\u000bYӠ$)1RqOם\u0012:"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q5QEDs4'$OeB\u0007N9X\b+FL[jMNyM\u0014g", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q5QEDs4'$OeB\u0007N9X\b+FL[\u0002", "/kX4a4>\\(e~g,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\u0001<]\u007f)?m\u001f=4GDk\na\u0006", "5dc\u000e_0@\\!~\u0004m\u0013\u0001\u0012/", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u0011`\u0002\"@u\u00167\\*?t4s", "1`[0h3:b\u0019Z\u0002b.\u0006\u0011/n\u000f\u000f\u007fI\u0001\u0002!Us\u001d@\u0001.", "", ">kP0X(;Z\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "BnBAe0GU", "", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Value extends AlignmentLineProvider {
        public static final int $stable = 0;
        private final AlignmentLine alignmentLine;

        public static /* synthetic */ Value copy$default(Value value, AlignmentLine alignmentLine, int i2, Object obj) {
            if ((i2 + 1) - (i2 | 1) != 0) {
                alignmentLine = value.alignmentLine;
            }
            return value.copy(alignmentLine);
        }

        public final AlignmentLine component1() {
            return this.alignmentLine;
        }

        public final Value copy(AlignmentLine alignmentLine) {
            return new Value(alignmentLine);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Value) && Intrinsics.areEqual(this.alignmentLine, ((Value) obj).alignmentLine);
        }

        public int hashCode() {
            return this.alignmentLine.hashCode();
        }

        public String toString() {
            return "Value(alignmentLine=" + this.alignmentLine + ')';
        }

        public Value(AlignmentLine alignmentLine) {
            super(null);
            this.alignmentLine = alignmentLine;
        }

        public final AlignmentLine getAlignmentLine() {
            return this.alignmentLine;
        }

        @Override // androidx.compose.foundation.layout.AlignmentLineProvider
        public int calculateAlignmentLinePosition(Placeable placeable) {
            return placeable.get(this.alignmentLine);
        }
    }
}
