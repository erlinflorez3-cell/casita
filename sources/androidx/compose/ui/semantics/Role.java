package androidx.compose.ui.semantics;

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
/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4C\u0007\":\u001b\u007f\u0007lnA0RqP.XU0ŧ*\u0012éBjTqq:\u000e\u0019\rb\u0018UNwk|Jr\u000bq\u0010و\u001azp.WXAu \u0013JB\u001eDcS}CQb\u000b53\u001fxƉ9ѩ\t\u0003 1V\u0018?\tQT$\u0012^A7ńQҫQ\u0007 \u001c\u0014Ah\u000e,g\u007fNdT3qƠ3%\tvP\\wk>|e\rtU}˜xҐ\"+Hʺߗ\u0014%٘\u0002\u0007\u0001\\ϓ\u0007O"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~F\b'7C", "", "D`[BX", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uH\u0018\u0016", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "\u0011n\\=T5B]\"", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class Role {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Button = m5927constructorimpl(0);
    private static final int Checkbox = m5927constructorimpl(1);
    private static final int Switch = m5927constructorimpl(2);
    private static final int RadioButton = m5927constructorimpl(3);
    private static final int Tab = m5927constructorimpl(4);
    private static final int Image = m5927constructorimpl(5);
    private static final int DropdownList = m5927constructorimpl(6);

    /* JADX INFO: renamed from: box-impl */
    public static final /* synthetic */ Role m5926boximpl(int i2) {
        return new Role(i2);
    }

    /* JADX INFO: renamed from: constructor-impl */
    private static int m5927constructorimpl(int i2) {
        return i2;
    }

    /* JADX INFO: renamed from: equals-impl */
    public static boolean m5928equalsimpl(int i2, Object obj) {
        return (obj instanceof Role) && i2 == ((Role) obj).m5932unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0 */
    public static final boolean m5929equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* JADX INFO: renamed from: hashCode-impl */
    public static int m5930hashCodeimpl(int i2) {
        return Integer.hashCode(i2);
    }

    public boolean equals(Object obj) {
        return m5928equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5930hashCodeimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl */
    public final /* synthetic */ int m5932unboximpl() {
        return this.value;
    }

    /* JADX INFO: compiled from: SemanticsProperties.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u000502ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005;i%\nCiWܵ|̝\u0093NM˗kvRZ\u0019H'\b\u001c{x0\u001al\u0007c*\u000f`DƜ>\u074c߲n<˃d|>\u0005.7::\u007f\f\u000f\u001ez_\u001e~\u0013Cy\u000eݮ/ϋú9QҫQ\r\"\u0012\u0014C8\u0003$euR\u0007_zgR/Q\u0005\u07bcA÷ф^/ƊQ\u0015NT5\u0012\u000fc$6N;\u0006,3_\u001b\u0007\u0001]У\u0002ӊҵ<\u0004ص+/3I\u0002\\NZ\u0006!#/ $k\u0001>\\3Sՙ\u000bʬ̼NbׂT\u00160w\t\u0001%>\n\u001d\u0014+\u0019E;*~\b<5иqԟŬO\u0001ެF\b\u0003aD\u001c=\u00029<G\u001fƛQjC\u001cTѻ\u00183\f&#\u0007\u000eĸ_f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~F\b'7,s8UN7t8(\u001e>", "", "u(E", "\u0010tcAb5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~F\b'7C", "5dc\u000fh;M]\"F\u00050\u001d\r\u0014zc", "u(8", "\u0017", "\u0011gT0^)Hf", "5dc\u0010[,<Y\u0016\t\u000e&6Ny?pK&", "\u0012q^=W6P\\\u007f\u0003\tm", "5dc\u0011e6IR#\u0011\u0004E0\u000b\u0018voQ\u0019\fKL\u0015", "\u0017lP4X", "5dc\u0016`(@S`\tLO<\bT-", " `S6b\tNb(\t\u0004", "5dc\u001fT+B]u\u000f\nm6\u0006P97p8\u0007\f~", "!vXAV/", "5dc j0MQ\u001cF\u00050\u001d\r\u0014zc", "\"`Q", "5dc!T)\u0006]jo\u000biwz", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getButton-o7Vup1c */
        public final int m5933getButtono7Vup1c() {
            return Role.Button;
        }

        /* JADX INFO: renamed from: getCheckbox-o7Vup1c */
        public final int m5934getCheckboxo7Vup1c() {
            return Role.Checkbox;
        }

        /* JADX INFO: renamed from: getSwitch-o7Vup1c */
        public final int m5938getSwitcho7Vup1c() {
            return Role.Switch;
        }

        /* JADX INFO: renamed from: getRadioButton-o7Vup1c */
        public final int m5937getRadioButtono7Vup1c() {
            return Role.RadioButton;
        }

        /* JADX INFO: renamed from: getTab-o7Vup1c */
        public final int m5939getTabo7Vup1c() {
            return Role.Tab;
        }

        /* JADX INFO: renamed from: getImage-o7Vup1c */
        public final int m5936getImageo7Vup1c() {
            return Role.Image;
        }

        /* JADX INFO: renamed from: getDropdownList-o7Vup1c */
        public final int m5935getDropdownListo7Vup1c() {
            return Role.DropdownList;
        }
    }

    private /* synthetic */ Role(int i2) {
        this.value = i2;
    }

    public String toString() {
        return m5931toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: toString-impl */
    public static String m5931toStringimpl(int i2) {
        return m5929equalsimpl0(i2, Button) ? "Button" : m5929equalsimpl0(i2, Checkbox) ? "Checkbox" : m5929equalsimpl0(i2, Switch) ? "Switch" : m5929equalsimpl0(i2, RadioButton) ? "RadioButton" : m5929equalsimpl0(i2, Tab) ? "Tab" : m5929equalsimpl0(i2, Image) ? "Image" : m5929equalsimpl0(i2, DropdownList) ? "DropdownList" : "Unknown";
    }
}
