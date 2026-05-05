package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.foundation.text.UndoManager_jvmKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
/* JADX INFO: compiled from: TextUndoOperation.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u000eӵLш|\u0004O\f8é6B\r.4\u0012}\u0007njO0LeN.ZS8\u0016sڔ<$i-yCAW\"}8\tWNmqvJp\u000bK\u000f\f\u0019~̓Bկs\u001a\u000e\u0012=1zn`s\r\u007fAG`\r63!B&F{\u001d\u0001H-X\u0014\u0005~[K:\u0015@D~?j\r{\u000b*\u0016\u0014E8\u0001LbwT<HzeR/Q\fyHT'm:\u0015M;Qù+\r\u0005mn:NAM\u0015S^Ϋ\u000bXcΪ\u001bAwJ\u0013vw69X\fWdh6XƦ/S%_x7j\u0017\"o\u001a'CO\u0012Lח\u0012.\u007f\u07be\u0014\u000fB\u0017\u001c\u001aw_<42f6\u0014\u008fsɁ֘?OؿbJ\bzoM/'\u0006H9Oku_eS\u0019|:߉\t\u0013&ŀ\u0019p'sb'1,)Y\u0010Q_Wή<ʰ߉\tXǀq\fxb\u0010A\u001c2M\u001a=\u0012a=%'O[g&\u074co\bPֳ\u007fx\u000b{vl:aV\\:nDTҊ\r\u0012bե|\u0007qnbw| [$l\u0007,\u0011˙$b\u007f˓9'\u0016n]~ȌjVe\r+æ\u0003eXvk\u0014vߓbU"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Ps5M\u0001p6La;L[qG}\u001dZ\u001bJ:\u0011\u000fb\u0017", "", "7mS2k", "", ">qT!X?M", "", ">nbAG,Qb", ">qT X3>Q(\u0003\u0005g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", ">nbAF,ES\u0017\u000e~h5", "Bh\\2<5&W \u0006~l", "", "1`]\u001aX9@S", "", "uH;7T=:\u001d z\u0004`uj\u0018<i\t*Q'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u00042( `\u001b$\u001fwh=\u0010-1_~pKU],i[nD]pZ\u000fJ;\u0014\u00147K-|SD/\u0006;S\u000f#d\u000e\u0012\u0016\u001b\u000b.a", "5dc\u0010T5&S&\u0001z", "u(I", "2d[2g0H\\\b\u0013\u0006^", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Ps5M\u0001p6La;;Ry=#\u0012I\"Y+b", "5dc\u0011X3>b\u001d\t\u0004M@\b\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ58'$hnB\u0003ju^\u007f&Q\u0016=,oaQ=\u001b\u0012i\u000e=?\u0018\u0005/", "5dc\u0016a+>f", "u(8", "5dc\u001db:MA\u0019\u0006z\\;\u0001\u00138-~{e\f\tvv", "u(9", "\u0018", "5dc\u001db:MB\u0019\u0012\n", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u001de,,S ~xm0\u0007\u0012vdS\u0012GH`v", "5dc\u001de,-S,\u000e", "BdgA8+Bb\b\u0013\u0006^", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Ps5M\u0001p6La;<QvL\u0003&e\u000e$", "5dc!X?M3\u0018\u0003\nM@\b\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ58'$hnB\u0003ju^\u007f&Q\u0016=,oaR<\u0018!I\"Y+b", "5dc!\\4>7\"f~e3\u0001\u0017", "\u0011n\\=T5B]\"", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextUndoOperation {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<TextUndoOperation, Object> Saver = new Saver<TextUndoOperation, Object>() { // from class: androidx.compose.foundation.text.input.internal.undo.TextUndoOperation$Companion$Saver$1
        @Override // androidx.compose.runtime.saveable.Saver
        public Object save(SaverScope saverScope, TextUndoOperation textUndoOperation) {
            return CollectionsKt.listOf(Integer.valueOf(textUndoOperation.getIndex()), textUndoOperation.getPreText(), textUndoOperation.getPostText(), Integer.valueOf(TextRange.m6123getStartimpl(textUndoOperation.m1624getPreSelectiond9O1mEE())), Integer.valueOf(TextRange.m6118getEndimpl(textUndoOperation.m1624getPreSelectiond9O1mEE())), Integer.valueOf(TextRange.m6123getStartimpl(textUndoOperation.m1623getPostSelectiond9O1mEE())), Integer.valueOf(TextRange.m6118getEndimpl(textUndoOperation.m1623getPostSelectiond9O1mEE())), Long.valueOf(textUndoOperation.getTimeInMillis()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.compose.runtime.saveable.Saver
        public TextUndoOperation restore(Object obj) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj2).intValue();
            Object obj3 = list.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            Object obj4 = list.get(2);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
            Object obj5 = list.get(3);
            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue2 = ((Integer) obj5).intValue();
            Object obj6 = list.get(4);
            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Int");
            long jTextRange = TextRangeKt.TextRange(iIntValue2, ((Integer) obj6).intValue());
            Object obj7 = list.get(5);
            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue3 = ((Integer) obj7).intValue();
            Object obj8 = list.get(6);
            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Int");
            long jTextRange2 = TextRangeKt.TextRange(iIntValue3, ((Integer) obj8).intValue());
            Object obj9 = list.get(7);
            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type kotlin.Long");
            return new TextUndoOperation(iIntValue, (String) obj3, (String) obj4, jTextRange, jTextRange2, ((Long) obj9).longValue(), false, 64, null);
        }
    };
    private final boolean canMerge;
    private final int index;
    private final long postSelection;
    private final String postText;
    private final long preSelection;
    private final String preText;
    private final TextEditType textEditType;
    private final long timeInMillis;

    public /* synthetic */ TextUndoOperation(int i2, String str, String str2, long j2, long j3, long j4, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, str, str2, j2, j3, j4, z2);
    }

    private TextUndoOperation(int i2, String str, String str2, long j2, long j3, long j4, boolean z2) {
        TextEditType textEditType;
        this.index = i2;
        this.preText = str;
        this.postText = str2;
        this.preSelection = j2;
        this.postSelection = j3;
        this.timeInMillis = j4;
        this.canMerge = z2;
        if (str.length() == 0 && str2.length() == 0) {
            throw new IllegalArgumentException("Either pre or post text must not be empty");
        }
        if (str.length() != 0 || str2.length() <= 0) {
            textEditType = (str.length() <= 0 || str2.length() != 0) ? TextEditType.Replace : TextEditType.Delete;
        } else {
            textEditType = TextEditType.Insert;
        }
        this.textEditType = textEditType;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getPreText() {
        return this.preText;
    }

    public final String getPostText() {
        return this.postText;
    }

    /* JADX INFO: renamed from: getPreSelection-d9O1mEE, reason: not valid java name */
    public final long m1624getPreSelectiond9O1mEE() {
        return this.preSelection;
    }

    /* JADX INFO: renamed from: getPostSelection-d9O1mEE, reason: not valid java name */
    public final long m1623getPostSelectiond9O1mEE() {
        return this.postSelection;
    }

    public /* synthetic */ TextUndoOperation(int i2, String str, String str2, long j2, long j3, long j4, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, str, str2, j2, j3, (-1) - (((-1) - i3) | ((-1) - 32)) != 0 ? UndoManager_jvmKt.timeNowMillis() : j4, (i3 + 64) - (i3 | 64) != 0 ? true : z2, null);
    }

    public final long getTimeInMillis() {
        return this.timeInMillis;
    }

    public final boolean getCanMerge() {
        return this.canMerge;
    }

    public final TextEditType getTextEditType() {
        return this.textEditType;
    }

    public final TextDeleteType getDeletionType() {
        if (this.textEditType == TextEditType.Delete && TextRange.m6117getCollapsedimpl(this.postSelection)) {
            if (TextRange.m6117getCollapsedimpl(this.preSelection)) {
                return TextRange.m6123getStartimpl(this.preSelection) > TextRange.m6123getStartimpl(this.postSelection) ? TextDeleteType.Start : TextDeleteType.End;
            }
            if (TextRange.m6123getStartimpl(this.preSelection) == TextRange.m6123getStartimpl(this.postSelection) && TextRange.m6123getStartimpl(this.preSelection) == this.index) {
                return TextDeleteType.Inner;
            }
            return TextDeleteType.NotByUser;
        }
        return TextDeleteType.NotByUser;
    }

    /* JADX INFO: compiled from: TextUndoOperation.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\blʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$B^IV2\n2\u000b_N\u0016j~Lj\u000bq\u000e4\u0018ѱn2Qǁ\u0011_\u0018\u0013@GŌC9"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Ps5M\u0001p6La;L[qG}\u001dZ\u001bJ:\u0011\u000fb\u007f\u0002xLB\u001b\u00110S\u000b\u0011", "", "u(E", "!`e2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?MP\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Ps5M\u0001p6La;L[qG}\u001dZ\u001bJ:\u0011\u000fb\u0017", "5dc T=>`", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005!FYy\u001d>m_\u001cIT;x\n", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<TextUndoOperation, Object> getSaver() {
            return TextUndoOperation.Saver;
        }
    }
}
