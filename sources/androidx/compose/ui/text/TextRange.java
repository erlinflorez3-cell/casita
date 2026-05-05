package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: TextRange.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O\r8\u000b4C\u0007\":\u001b\u007f\u0007lkA0RkP.Xl2\u000fy\b<$a&wٙykڼ\u001cJ9O|f mr\u001b\u001aIƤ\u0016\u001a\u0007jDI\u0004yٕ\u0016\u00118D}B{f}SQ`#;5$@9Py3Џ`ݙHȮuٙŲO\u000e\u0018HN\n\u0003h\u001bc\u001d\u001a@\u000bn$\u000f8tg|?\u000fǔ]Ơ3%\t\u0005Pjow>\u001ae\rtYW\u0013\u0005x6-V6c\u0014kڜ\u0004\u07baV]E!M\u0011\u0006\u0013vG?+w|\u001e\u0383Wÿ\u0018\u00171p\u001bh;<j'i`:,[Sqbh\u000eV»¶zȞʀ\b\u0010\fJVGu't,&3#\u0018\u001aTг\u0006`H&\t\t\u0007&3\u0004K+g \u001d\u0016ň?\u001df9\u0002\u000b\u001b%s\u0010|)sT<iK_ƻ{UISFGVYZhKy\u001cp\u0011\u000b`HΥK\u0004G}\u0017;%0\bjG19k0Qz,Л\td\u0001UoaVKr}$GB\t:cz)ʰoTlZ2\"['%\u0013\f\b+ \u000bx\u0013Ɯ'ŎROpȉ;\\k\u001c=/\u0015<\u00103«\u0012[Q`9H_j`p`\u000b,?jk;\u001dڋFW$\\b=0=ʔi\u0010ȁzD|\rƑ2Dy\u001f:ϛMG[ĒL,"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "", ">`R8X+/O \u000fz", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uI\u0018\u0017", "1n[9T7LS\u0018", "", "5dc\u0010b3EO$\rz]s\u0001\u0011:l", "uI\u0018'", "3mS", "", "5dc\u0012a+\u0006W!\n\u0002", "uI\u0018\u0016", ":d]4g/", "5dc\u0019X5@b\u001cF~f7\u0004", ";`g", "5dc\u001aT?\u0006W!\n\u0002", ";h]", "5dc\u001a\\5\u0006W!\n\u0002", "@de2e:>R", "5dc\u001fX=>`'~y&0\u0005\u00146", "AsP?g", "5dc g(Kb`\u0003\u0003i3", "1n]AT0Ga", "=sW2e", "1n]AT0Ga`N\u0010\\s\fo\u0002", "uI9uM", "=eU@X;", "1n]AT0Ga`\u0003\u0003i3", "uI8uM", "3pd._:", "3pd._:\u0006W!\n\u0002", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "7mc2e:>Q(\r", "7mc2e:>Q(\rB.AzP>LR", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uI\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "\u0011n\\=T5B]\"", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class TextRange {
    public static final Companion Companion = new Companion(null);
    private static final long Zero = TextRangeKt.TextRange(0);
    private final long packedValue;

    /* JADX INFO: renamed from: box-impl */
    public static final /* synthetic */ TextRange m6111boximpl(long j2) {
        return new TextRange(j2);
    }

    /* JADX INFO: renamed from: constructor-impl */
    public static long m6112constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: equals-impl */
    public static boolean m6115equalsimpl(long j2, Object obj) {
        return (obj instanceof TextRange) && j2 == ((TextRange) obj).m6127unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0 */
    public static final boolean m6116equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* JADX INFO: renamed from: getEnd-impl */
    public static final int m6118getEndimpl(long j2) {
        return (int) ((j2 + 4294967295L) - (j2 | 4294967295L));
    }

    /* JADX INFO: renamed from: getStart-impl */
    public static final int m6123getStartimpl(long j2) {
        return (int) (j2 >> 32);
    }

    /* JADX INFO: renamed from: hashCode-impl */
    public static int m6124hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    public boolean equals(Object obj) {
        return m6115equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m6124hashCodeimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl */
    public final /* synthetic */ long m6127unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ TextRange(long j2) {
        this.packedValue = j2;
    }

    /* JADX INFO: renamed from: getMin-impl */
    public static final int m6121getMinimpl(long j2) {
        return m6123getStartimpl(j2) > m6118getEndimpl(j2) ? m6118getEndimpl(j2) : m6123getStartimpl(j2);
    }

    /* JADX INFO: renamed from: getMax-impl */
    public static final int m6120getMaximpl(long j2) {
        return m6123getStartimpl(j2) > m6118getEndimpl(j2) ? m6123getStartimpl(j2) : m6118getEndimpl(j2);
    }

    /* JADX INFO: renamed from: getCollapsed-impl */
    public static final boolean m6117getCollapsedimpl(long j2) {
        return m6123getStartimpl(j2) == m6118getEndimpl(j2);
    }

    /* JADX INFO: renamed from: getReversed-impl */
    public static final boolean m6122getReversedimpl(long j2) {
        return m6123getStartimpl(j2) > m6118getEndimpl(j2);
    }

    /* JADX INFO: renamed from: getLength-impl */
    public static final int m6119getLengthimpl(long j2) {
        return m6120getMaximpl(j2) - m6121getMinimpl(j2);
    }

    /* JADX INFO: renamed from: intersects-5zc-tL8 */
    public static final boolean m6125intersects5zctL8(long j2, long j3) {
        return m6121getMinimpl(j2) < m6120getMaximpl(j3) && m6121getMinimpl(j3) < m6120getMaximpl(j2);
    }

    /* JADX INFO: renamed from: contains-5zc-tL8 */
    public static final boolean m6113contains5zctL8(long j2, long j3) {
        return m6121getMinimpl(j2) <= m6121getMinimpl(j3) && m6120getMaximpl(j3) <= m6120getMaximpl(j2);
    }

    /* JADX INFO: renamed from: contains-impl */
    public static final boolean m6114containsimpl(long j2, int i2) {
        return i2 < m6120getMaximpl(j2) && m6121getMinimpl(j2) <= i2;
    }

    public String toString() {
        return m6126toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: toString-impl */
    public static String m6126toStringimpl(long j2) {
        return "TextRange(" + m6123getStartimpl(j2) + ", " + m6118getEndimpl(j2) + ')';
    }

    /* JADX INFO: compiled from: TextRange.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005$2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005;i%\nCiWܵ|̝\u0093NM˗kvRZ\u0019H'\b\u001c{x0ղU\u0002e\u0015\u0015̒^\u001e>;Mu\\ˉdz"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7,s8UN7t8(\u001e>", "", "u(E", "(da<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "5dc'X9H\u001b\u0018Rd*4\\h", "u(9", "\u0018", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getZero-d9O1mEE */
        public final long m6128getZerod9O1mEE() {
            return TextRange.Zero;
        }
    }
}
