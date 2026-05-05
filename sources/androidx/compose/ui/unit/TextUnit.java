package androidx.compose.ui.unit;

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
/* JADX INFO: compiled from: TextUnit.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u000eӵLш|\u0004O\r8\u000b4C\u0007\":\u001b\u007f\u0007lqA0ZeP.XS2\u000fy\u0001<$a%yCI[\"}(\u000bWNukvJ`\u0016K\u000f\u0014\"\u0001j2M[ޔ\u001c(ƁPp ?aL(<g!\u0004<ӌ0608\u0012\u0005/\u001bݵL\u0012||QNT+>U\t:\u0001#}\t()\u001e>Nҵdոo¦5ԟǰa<5;\u0011\u0003\u000bj5yH|{εvX5$\u000faLF\u0007ˁ=\u05cf$RЁ\u0006ѸÜC\u0005E\u000eK\"1C5Eas\u0006̬\t\u0004\",CO;o9̭d՝P_Ѩ&˃յgMV*6\u0016C\u0018\u001bV\u001c\u000e4Ωx2;1~\b<I;Ɉ[ŬO\u0001\u0081Aȕѐe8\u001dA\u000eRsQ)\u0007iai\u001e~=\n\u001c% 9\u007f\u001d \"ہ\u000f\u05ce\u0019\u001dZ\u0019_S\u001aNKkf\n\bS4֥oĊ\u0006,\nTU%w\u0018\u001fT/%eكi'/\u0003\u001aHr\u0003=ݚhŞRh˦G̱ؗr\u0018=Q\u0017)#`r+\u0004P\u0003А\\\u0015[3l\u0007,\u001aY\u0605d˵; ڰ\u000fʚћlkptk(mKt]qn\u001aލ\b=lJMQ\u0012&(׳~ޖ>;Ѯ\u0004֚ڋFU\u0012\u0002jGj?V\u0013(w*m\u0015 Ʊ6AwFBWy-jA`\u0003LՓ\bҘ\u0011ߙYg˦}Ԟտ(\u0005oQ\u0003\fQ_jt\bg'NbA˃&1YS;\u001f4\\rwB\u0005;\u0007-x6\fѨPKdn\u001c~c\u0003p\"(9i/k\u0014eȰ+ɨ\u0006-MɣC}_W*')}0M\u0012Þ0Թ\ft\u0001.fuX[l\u0019(\u0004lus\u001dr\u000e\u0012at\n}(Գ\nϵǥHqè]@f:\u0003\u0015-!u\u0010}3\u00155[U]aə{\u0018G\u0017gpw\u0004ЌxbϚ%t\u0014\u0005Ͻc\u001fweWЃNi7QY\u0005]і(\u001c"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/\r", "", ">`R8X+/O \u000fz", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uI\u0018\u0017", "7r4:", "", "7r4: 0F^ ", "uI\u0018'", "7rB=", "7rB= 0F^ ", "@`f!l7>", "5dc\u001fT>-g$~9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "u(E", "5dc\u001fT>-g$~Bb4\b\u0010", "Bx_2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/&\u0002!.#", "5dc!l7>\u001b\tb\u0005n6fd", "D`[BX", "", "5dc#T3NS`\u0003\u0003i3", "uI\u0018\u0013", "1n\\=T9>B#", "", "=sW2e", "1n\\=T9>B#FBKxo\u0003\u007fo", "uI9u<", "2he", "", "2hey^\u0017S z\u0013I", "uI3u=", "uI5u=", "uI8u=", "3pd._:", "3pd._:\u0006W!\n\u0002", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "uI\u0018\u0016", "Bh\\2f", "Bh\\2fsD>.K\\rz", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uI\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "CmP?l\u0014B\\)\r", "CmP?l\u0014B\\)\rBQ\u001aXl\u0013Z_", "\u0011n\\=T5B]\"", "Ch\u001cBa0MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class TextUnit {
    public static final Companion Companion = new Companion(null);
    private static final TextUnitType[] TextUnitTypes = {TextUnitType.m6856boximpl(TextUnitType.Companion.m6865getUnspecifiedUIouoOA()), TextUnitType.m6856boximpl(TextUnitType.Companion.m6864getSpUIouoOA()), TextUnitType.m6856boximpl(TextUnitType.Companion.m6863getEmUIouoOA())};
    private static final long Unspecified = TextUnitKt.pack(0, Float.NaN);
    private final long packedValue;

    /* JADX INFO: renamed from: box-impl */
    public static final /* synthetic */ TextUnit m6821boximpl(long j2) {
        return new TextUnit(j2);
    }

    /* JADX INFO: renamed from: constructor-impl */
    public static long m6823constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: equals-impl */
    public static boolean m6827equalsimpl(long j2, Object obj) {
        return (obj instanceof TextUnit) && j2 == ((TextUnit) obj).m6840unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0 */
    public static final boolean m6828equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    public static /* synthetic */ void getRawType$annotations() {
    }

    /* JADX INFO: renamed from: getRawType-impl */
    public static final long m6829getRawTypeimpl(long j2) {
        return (j2 + 1095216660480L) - (j2 | 1095216660480L);
    }

    /* JADX INFO: renamed from: hashCode-impl */
    public static int m6832hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    public boolean equals(Object obj) {
        return m6827equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m6832hashCodeimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl */
    public final /* synthetic */ long m6840unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ TextUnit(long j2) {
        this.packedValue = j2;
    }

    /* JADX INFO: renamed from: unaryMinus-XSAIIZE */
    public static final long m6839unaryMinusXSAIIZE(long j2) {
        TextUnitKt.m6844checkArithmeticR2X_6o(j2);
        return TextUnitKt.pack(m6829getRawTypeimpl(j2), -m6831getValueimpl(j2));
    }

    /* JADX INFO: renamed from: div-kPz2Gy4 */
    public static final long m6825divkPz2Gy4(long j2, float f2) {
        TextUnitKt.m6844checkArithmeticR2X_6o(j2);
        return TextUnitKt.pack(m6829getRawTypeimpl(j2), m6831getValueimpl(j2) / f2);
    }

    /* JADX INFO: renamed from: div-kPz2Gy4 */
    public static final long m6824divkPz2Gy4(long j2, double d2) {
        TextUnitKt.m6844checkArithmeticR2X_6o(j2);
        return TextUnitKt.pack(m6829getRawTypeimpl(j2), (float) (((double) m6831getValueimpl(j2)) / d2));
    }

    /* JADX INFO: renamed from: div-kPz2Gy4 */
    public static final long m6826divkPz2Gy4(long j2, int i2) {
        TextUnitKt.m6844checkArithmeticR2X_6o(j2);
        return TextUnitKt.pack(m6829getRawTypeimpl(j2), m6831getValueimpl(j2) / i2);
    }

    /* JADX INFO: renamed from: times-kPz2Gy4 */
    public static final long m6836timeskPz2Gy4(long j2, float f2) {
        TextUnitKt.m6844checkArithmeticR2X_6o(j2);
        return TextUnitKt.pack(m6829getRawTypeimpl(j2), m6831getValueimpl(j2) * f2);
    }

    /* JADX INFO: renamed from: times-kPz2Gy4 */
    public static final long m6835timeskPz2Gy4(long j2, double d2) {
        TextUnitKt.m6844checkArithmeticR2X_6o(j2);
        return TextUnitKt.pack(m6829getRawTypeimpl(j2), (float) (((double) m6831getValueimpl(j2)) * d2));
    }

    /* JADX INFO: renamed from: times-kPz2Gy4 */
    public static final long m6837timeskPz2Gy4(long j2, int i2) {
        TextUnitKt.m6844checkArithmeticR2X_6o(j2);
        return TextUnitKt.pack(m6829getRawTypeimpl(j2), m6831getValueimpl(j2) * i2);
    }

    /* JADX INFO: renamed from: compareTo--R2X_6o */
    public static final int m6822compareToR2X_6o(long j2, long j3) {
        TextUnitKt.m6845checkArithmeticNB67dxo(j2, j3);
        return Float.compare(m6831getValueimpl(j2), m6831getValueimpl(j3));
    }

    public String toString() {
        return m6838toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: toString-impl */
    public static String m6838toStringimpl(long j2) {
        long jM6830getTypeUIouoOA = m6830getTypeUIouoOA(j2);
        return TextUnitType.m6859equalsimpl0(jM6830getTypeUIouoOA, TextUnitType.Companion.m6865getUnspecifiedUIouoOA()) ? "Unspecified" : TextUnitType.m6859equalsimpl0(jM6830getTypeUIouoOA, TextUnitType.Companion.m6864getSpUIouoOA()) ? m6831getValueimpl(j2) + ".sp" : TextUnitType.m6859equalsimpl0(jM6830getTypeUIouoOA, TextUnitType.Companion.m6863getEmUIouoOA()) ? m6831getValueimpl(j2) + ".em" : "Invalid";
    }

    /* JADX INFO: compiled from: TextUnit.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u001a6B\u0015\"4\u0012}\tnjO0LeN1Xݾ+%ӆ,4RZdvI;ڈ\u001e}0\t huh\u0007Pj\rS\u000f4\u0019'l\u0003հWޯa\u001a\u00172PuW5SsK>1\u0017D\f82P@0\tWɥ,ѳ\u000f͌ےBJë\u0016>HpH^\u001dO\u000b# \u0006V\"\u0007(jrޱ6Qt`@Ǥ?1hJN-~݇\u0001Z"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/uK 6X?Do>'j", "", "u(E", "\"dgAH5Bb\b\u0013\u0006^:", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/&\u0002!.#", "5dc!X?MC\"\u0003\nM@\b\t=$\u0010,uP\n\u001b&A|\u000eCv!CY", "u(J\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Wx\u0012K@\u00145l\r\u0010@q%\u001daN;A", ")KP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W+v8DI\u0007$F\\*9M\u0019", "#mb=X*BT\u001d~y", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/\r", "5dc\"a:IS\u0017\u0003{b,{P\"S[\f_5`U\u0013Px\u0018Kr49c\u0007.", "5dc\"a:IS\u0017\u0003{b,{P\"S[\f_5`", "u(9", "\u0018", "Ch\u001cBa0MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getUnspecified-XSAIIZE$annotations */
        public static /* synthetic */ void m6841getUnspecifiedXSAIIZE$annotations() {
        }

        private Companion() {
        }

        public final TextUnitType[] getTextUnitTypes$ui_unit_release() {
            return TextUnit.TextUnitTypes;
        }

        /* JADX INFO: renamed from: getUnspecified-XSAIIZE */
        public final long m6842getUnspecifiedXSAIIZE() {
            return TextUnit.Unspecified;
        }
    }

    /* JADX INFO: renamed from: getType-UIouoOA */
    public static final long m6830getTypeUIouoOA(long j2) {
        return TextUnitTypes[(int) (m6829getRawTypeimpl(j2) >>> 32)].m6862unboximpl();
    }

    /* JADX INFO: renamed from: isSp-impl */
    public static final boolean m6834isSpimpl(long j2) {
        return m6829getRawTypeimpl(j2) == 4294967296L;
    }

    /* JADX INFO: renamed from: isEm-impl */
    public static final boolean m6833isEmimpl(long j2) {
        return m6829getRawTypeimpl(j2) == 8589934592L;
    }

    /* JADX INFO: renamed from: getValue-impl */
    public static final float m6831getValueimpl(long j2) {
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }
}
