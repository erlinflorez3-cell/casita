package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: BeyondBoundsLayout.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007|jA0ZeP.XV0s\u0002ڔd$\n#*CE`b90\tgP}f5Kz\rIƤ\u0014\u0017)n:Kmx\f\u0015?IPsWF]qM9\u000fzF\t0487@\u0006/\u001fݵL\u0010|\u0002\noŁ\u0011ؓϮt<X\u0015[\u000eݾ\u0011\u0005̇ \f&_mߐRvke<5B1hŒR3܀4{"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006S%Ic\u0007\u001f\u0014w&7LQ\"gH(%w7", "", ":`h<h;", "\"", "2ha2V;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006S%Ic\u0007\u001f\u0014w&7LQ\"gH(%w  \u0003w6^\u0006\u0006KYN*kV|Fi", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006S%Ic\u0007\u001f\u0014w&7LQ\"gH(%w \u0016\u0007w6Wu\u0004Q\\W+j@pG\u001f\u00120", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", ":`h<h;\u0006]j\u0001FI5O", "uH;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIuzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "\u0010dh<a+\u001b])\byl\u001az\u0013:e", "\u001a`h<h;\u001dW&~xm0\u0007\u0012", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface BeyondBoundsLayout {

    /* JADX INFO: compiled from: BeyondBoundsLayout.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4C\u0005\u0007Bߚ(\u0007\u0015i\n@Re`.\u0001T\u0001Ɔmڷ8(s&wEIXܵ|̝ޞORoiti\t\nå\u0013\nȞ|i"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006S%Ic\u0007\u001f\u0014w&7LQ\"gH(%w \u0016\u0007w6Wu\u0004Q\\W+j@pG\u001f\u00120", "", "6`b\u001ab9>1#\b\n^5\f", "", "5dc\u0015T:&]&~Xh5\f\t8t", "u(I", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface BeyondBoundsScope {
        boolean getHasMoreContent();
    }

    /* JADX INFO: renamed from: layout-o7g1Pn8 */
    <T> T mo1171layouto7g1Pn8(int i2, Function1<? super BeyondBoundsScope, ? extends T> function1);

    /* JADX INFO: compiled from: BeyondBoundsLayout.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4C\u0007\":\u001b\u007f\u0007lnA0RqP.XU0ŧ*\u0012éBjTqq:\u000e\u0019\rb\u0018UȞwk|Jr\u000bq\u0010و\u001azp.WXAu \u0013JB\u001eDcS}CQb\u000b53\u001fxƉ9ѩ\t\u0003 1V\u0018?\tQT$\u0012^A7ńQҫQ\u0007 \u001c\u0014Ah\u000e,g\u007fNdT3qƠ3%\tvP\\wk>|e\rtU}˜xҐ\"+Hʺߗ\u0014%٘\u0002\u0007\u0001\\ϓ\u0007O"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006S%Ic\u0007\u001f\u0014w&7LQ\"gH(%w  \u0003w6^\u0006\u0006KYN*kV|Fi", "", "D`[BX", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uH\u0018\u0016", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "\u0011n\\=T5B]\"", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @JvmInline
    public static final class LayoutDirection {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Before = m5492constructorimpl(1);
        private static final int After = m5492constructorimpl(2);
        private static final int Left = m5492constructorimpl(3);
        private static final int Right = m5492constructorimpl(4);
        private static final int Above = m5492constructorimpl(5);
        private static final int Below = m5492constructorimpl(6);

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ LayoutDirection m5491boximpl(int i2) {
            return new LayoutDirection(i2);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static int m5492constructorimpl(int i2) {
            return i2;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m5493equalsimpl(int i2, Object obj) {
            return (obj instanceof LayoutDirection) && i2 == ((LayoutDirection) obj).m5497unboximpl();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m5494equalsimpl0(int i2, int i3) {
            return i2 == i3;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m5495hashCodeimpl(int i2) {
            return Integer.hashCode(i2);
        }

        public boolean equals(Object obj) {
            return m5493equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m5495hashCodeimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m5497unboximpl() {
            return this.value;
        }

        private /* synthetic */ LayoutDirection(int i2) {
            this.value = i2;
        }

        /* JADX INFO: compiled from: BeyondBoundsLayout.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005.2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005;i%\nCiWܵ|̝\u0093NM˗kvRZ\u0019H'\b\u001c{x0\u001al\u0007c*\u000f`DƜ>\u074c߲n<˃d|>\u0005.7::\u007f\f\u000f\u001ez_\u001e~\u0013Cy\u000eݮ/ϋú9QҫQ\r\"\u0012\u0014C8\u0003$euR\u0007_zgR/Q\u0005\u07bcA÷ф^/ƊQ\u0015NT5\u0012\u000fc$6N;\u0006,3_\u001b\u0007\u0001]У\u0002ӊҵ<\u0004ص+/3I\u0002\\NZ\u0006!#/ $k\u0001>\\3Sՙ\u000bʬ̼NbׂT\u00160w\t\u0001%>\n\u001d\u0014+Ρ.6\"i\u000eԦO#q[@V!\u07b2F\u0010"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006S%Ic\u0007\u001f\u0014w&7LQ\"gH(%w  \u0003w6^\u0006\u0006KYN*kV|FRod\u0016Y'\u0016\tcJy", "", "u(E", "\u000fa^CX", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006S%Ic\u0007\u001f\u0014w&7LQ\"gH(%w  \u0003w6^\u0006\u0006KYN*kV|Fi", "5dc\u000eU6OS`\u0002\u0005q\u001cf\t\u000f", "u(8", "\u0017", "\u000fec2e", "5dc\u000eY;>``\u0002\u0005q\u001cf\t\u000f", "\u0010dU<e,", "5dc\u000fX-H`\u0019F}h?lr/E", "\u0010d[<j", "5dc\u000fX3He`\u0002\u0005q\u001cf\t\u000f", "\u001adUA", "5dc\u0019X-M\u001b\u001c\t\u000eN\u0016|h", " hV5g", "5dc\u001f\\.Ab`\u0002\u0005q\u001cf\t\u000f", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX INFO: renamed from: getBefore-hoxUOeE, reason: not valid java name */
            public final int m5500getBeforehoxUOeE() {
                return LayoutDirection.Before;
            }

            /* JADX INFO: renamed from: getAfter-hoxUOeE, reason: not valid java name */
            public final int m5499getAfterhoxUOeE() {
                return LayoutDirection.After;
            }

            /* JADX INFO: renamed from: getLeft-hoxUOeE, reason: not valid java name */
            public final int m5502getLefthoxUOeE() {
                return LayoutDirection.Left;
            }

            /* JADX INFO: renamed from: getRight-hoxUOeE, reason: not valid java name */
            public final int m5503getRighthoxUOeE() {
                return LayoutDirection.Right;
            }

            /* JADX INFO: renamed from: getAbove-hoxUOeE, reason: not valid java name */
            public final int m5498getAbovehoxUOeE() {
                return LayoutDirection.Above;
            }

            /* JADX INFO: renamed from: getBelow-hoxUOeE, reason: not valid java name */
            public final int m5501getBelowhoxUOeE() {
                return LayoutDirection.Below;
            }
        }

        public String toString() {
            return m5496toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m5496toStringimpl(int i2) {
            return m5494equalsimpl0(i2, Before) ? "Before" : m5494equalsimpl0(i2, After) ? "After" : m5494equalsimpl0(i2, Left) ? "Left" : m5494equalsimpl0(i2, Right) ? "Right" : m5494equalsimpl0(i2, Above) ? "Above" : m5494equalsimpl0(i2, Below) ? "Below" : "invalid LayoutDirection";
        }
    }
}
