package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
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
/* JADX INFO: compiled from: ListItem.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eQLш|\u0004O\f8\u000b4G\u0007\":\u001b\u007f\u0007tʑA0JhP.`_2\u000fq}:ŝ\u001a:ڎaN\u0006 \u000e$\u0019O|ʴ\u0016m\u0003Y\u001e\u0004\u001e\f\u0016\tn:Imx\f\u0013Ƥ6DuAAP8VGd\r63!b&F~\u001d\u0001Hݒ\u000fǌvےBŷë\u00162FvHYUe\u0013\"*\u0006l)1$jlf8^k\fDuޡ\u0004ݦFP-j>\t\u0016\u001bTa?\r%bdҿ?˝9\u0017+a\u0011\n\u001biM\u0012Wqk\u0015/Ҿ&ȅMu]Gf\u0012d!9O%]!'3ӧSԃ\u0010'3ՒҳJPʾ'w)|ȡ<\t\u0016\t-πJ[\u0019Ǻ\f\""}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006])Cha/7u\u0005BXC\u0011", "", ":h]2f", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uH\u0018\u0016", "1n\\=T9>B#", "=sW2e", "1n\\=T9>B#F\u000fa\u007fLk\u0013g", "uH8u<", "3pd._:", "", "", "3pd._:\u0006W!\n\u0002", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "\u0011n\\=T5B]\"", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
final class ListItemType implements Comparable<ListItemType> {
    private final int lines;
    public static final Companion Companion = new Companion(null);
    private static final int OneLine = m2224constructorimpl(1);
    private static final int TwoLine = m2224constructorimpl(2);
    private static final int ThreeLine = m2224constructorimpl(3);

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ListItemType m2222boximpl(int i2) {
        return new ListItemType(i2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m2224constructorimpl(int i2) {
        return i2;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2225equalsimpl(int i2, Object obj) {
        return (obj instanceof ListItemType) && i2 == ((ListItemType) obj).m2230unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2226equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2227hashCodeimpl(int i2) {
        return Integer.hashCode(i2);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2228toStringimpl(int i2) {
        return "ListItemType(lines=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m2225equalsimpl(this.lines, obj);
    }

    public int hashCode() {
        return m2227hashCodeimpl(this.lines);
    }

    public String toString() {
        return m2228toStringimpl(this.lines);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2230unboximpl() {
        return this.lines;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(ListItemType listItemType) {
        return m2229compareToyh95HIg(listItemType.m2230unboximpl());
    }

    private /* synthetic */ ListItemType(int i2) {
        this.lines = i2;
    }

    /* JADX INFO: renamed from: compareTo-yh95HIg, reason: not valid java name */
    public static int m2223compareToyh95HIg(int i2, int i3) {
        return Intrinsics.compare(i2, i3);
    }

    /* JADX INFO: renamed from: compareTo-yh95HIg, reason: not valid java name */
    public int m2229compareToyh95HIg(int i2) {
        return m2223compareToyh95HIg(this.lines, i2);
    }

    /* JADX INFO: compiled from: ListItem.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005)4\u0012\u0006\u0010nj?3JͣIDɟ\u0004*=j<9*[ҸuCIUb*0\u0013gN\u0016i\u001fNh\u0016[\u000f4\")n:Vmx\f\u001e?6P}W3{{\u0004ʡ`ԓ5\u0004܌1Ĳأ}\u0007\u0007)8X`\u000e\tDc\f@2фoíƞ\fLŋ\u001e\u001a\u000e>.\u00066^mQDL=tH5;\u0003\u0018DŰ&ڿޗ{LϘJ\\/\r\u0005f6-F>C\u0019uj\u0011\u000fj[m\u0005Ճpܵߔg&ݳ/Q{WD]\u0018\u0016\u001b4]\u0011ơr/d\bWԂ(U*WcQo˔,\t"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006])Cha/7u\u0005BXCyI>& dj=\u0011l\u0002", "", "u(E", "\u001dmT\u0019\\5>", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006])Cha/7u\u0005BXC\u0011", "5dc\u001ca,%W\"~B:3o\r>OR", "u(8", "\u0017", "\"ga2X\u0013B\\\u0019", "5dc![9>S\u007f\u0003\u0004^sX\u0010\"i\u000f\u0012N", "\"v^\u0019\\5>", "5dc!j6%W\"~B:3o\r>OR", "7me<^,", "6`b\u001ci,KZ\u001d\bz", "", "6`b h7I]&\u000e~g.", "7rBBc7H`(\u0003\u0004`\u0014\r\u0010>i\u0007,\u0005@", "7me<^,\u0006H`ehcAKG7a\u000f(\tD|\u001edA|\u000eCv!CY", "uYI'\u001c\u0010", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getOneLine-AlXitO8, reason: not valid java name */
        public final int m2231getOneLineAlXitO8() {
            return ListItemType.OneLine;
        }

        /* JADX INFO: renamed from: getTwoLine-AlXitO8, reason: not valid java name */
        public final int m2233getTwoLineAlXitO8() {
            return ListItemType.TwoLine;
        }

        /* JADX INFO: renamed from: getThreeLine-AlXitO8, reason: not valid java name */
        public final int m2232getThreeLineAlXitO8() {
            return ListItemType.ThreeLine;
        }

        /* JADX INFO: renamed from: invoke-Z-LSjz4$material3_release, reason: not valid java name */
        public final int m2234invokeZLSjz4$material3_release(boolean z2, boolean z3, boolean z4) {
            if ((!z2 || !z3) && !z4) {
                if (z2 || z3) {
                    return m2233getTwoLineAlXitO8();
                }
                return m2231getOneLineAlXitO8();
            }
            return m2232getThreeLineAlXitO8();
        }
    }
}
