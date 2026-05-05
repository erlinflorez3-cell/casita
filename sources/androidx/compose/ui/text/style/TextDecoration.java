package androidx.compose.ui.text.style;

import androidx.compose.ui.util.ListUtilsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: TextDecoration.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4D\u0007\":\u001b\u007f\u0007lnA0RqP.XS0\u0014\u0002ڔR2\f$ BsT(>/\u000fѧ^kunbZ9DǇ\n\u0016\u0007ltXc}u\u0012=8rsM:eokʠ'ҡ6M1@*Py3\u0007J0V\u0017\u000f|YJ:\u0011vϢp\u0003X\u001bV\u001d\u001a@\u0007\u00054I-jqf6vǍ\u000e>=.\u001bip÷mۆ0ES\u001bRl';\u0004(2{OE5-%\u0002\u0004\u07baVaGšWsC\bv+ݹ/X"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|t.KMHgC\"\u001fq7", "", ";`b8", "", "uH\u0018#", "5dc\u001aT:D", "u(8", "1n]AT0Ga", "", "=sW2e", "3pd._:", "6`b566=S", ">kd@", "2dR<e(MW#\b", "BnBAe0GU", "", "\u0011n\\=T5B]\"", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextDecoration {
    public static final int $stable = 0;
    private final int mask;
    public static final Companion Companion = new Companion(null);
    private static final TextDecoration None = new TextDecoration(0);
    private static final TextDecoration Underline = new TextDecoration(1);
    private static final TextDecoration LineThrough = new TextDecoration(2);

    public TextDecoration(int i2) {
        this.mask = i2;
    }

    public final int getMask() {
        return this.mask;
    }

    /* JADX INFO: compiled from: TextDecoration.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005+4\u0012\u0006%nʑ?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\u0004g(\n:\t}P\u0018q|Wr\u0011S\u0011\u0016\u0016'lZW&\u0013k\u0013'2pqu7$ږ?˃d\u0001>ӌ04(;\b\u0005\u0019\u001c0L\u001e{K]Y\u0012*0nrpVc˧\u0007ܨ\u0016\u0012FĨ\u0011 bn\\6`ncB=(S\u0004PW?_^~\u0004\u0011\u001dÞ)˼zm&ѨP9;\u001f3S\u001b\tXfM\bӳuL"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|t.KMHgC\"\u001fq \u0017\u0011k7J\u007f+QU$", "", "u(E", "\u001ah]2G/K])\u0001}", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|t.KMHgC\"\u001fq7", "5dc\u0019\\5>B\u001c\f\u0005n.\u007fG+n\t2\u000b<\u0010\u001b!P}", "5dc\u0019\\5>B\u001c\f\u0005n.\u007f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006\u00054I`}i&m)=,C9uA\u001a$lkB\\", "\u001cn]2", "5dc\u001bb5>\u0012\u0015\b\u0004h;x\u00183o\t6", "5dc\u001bb5>", "#mS2e3B\\\u0019", "5dc\"a+>` \u0003\u0004^jx\u00128o\u000f$\u000bD\u000b %", "5dc\"a+>` \u0003\u0004^", "1n\\/\\5>", "2dR<e(MW#\b\t", "", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getLineThrough$annotations() {
        }

        public static /* synthetic */ void getNone$annotations() {
        }

        public static /* synthetic */ void getUnderline$annotations() {
        }

        private Companion() {
        }

        public final TextDecoration getNone() {
            return TextDecoration.None;
        }

        public final TextDecoration getUnderline() {
            return TextDecoration.Underline;
        }

        public final TextDecoration getLineThrough() {
            return TextDecoration.LineThrough;
        }

        public final TextDecoration combine(List<TextDecoration> list) {
            int iValueOf = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                iValueOf = Integer.valueOf(iValueOf.intValue() | list.get(i2).getMask());
            }
            return new TextDecoration(iValueOf.intValue());
        }
    }

    public final TextDecoration plus(TextDecoration textDecoration) {
        return new TextDecoration(textDecoration.mask | this.mask);
    }

    public final boolean contains(TextDecoration textDecoration) {
        int i2 = this.mask;
        return (-1) - (((-1) - textDecoration.mask) & ((-1) - i2)) == i2;
    }

    public String toString() {
        if (this.mask == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.mask & Underline.mask) != 0) {
            arrayList.add("Underline");
        }
        if ((-1) - (((-1) - this.mask) | ((-1) - LineThrough.mask)) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + ListUtilsKt.fastJoinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null) + AbstractJsonLexerKt.END_LIST;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TextDecoration) && this.mask == ((TextDecoration) obj).mask;
    }

    public int hashCode() {
        return this.mask;
    }
}
