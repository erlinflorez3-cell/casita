package androidx.compose.ui.graphics;

import androidx.exifinterface.media.ExifInterface;
import com.swmansion.rnscreens.Screen;
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
/* JADX INFO: compiled from: BlendMode.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4C\u0007\":\u001b\u007f\u0007lnA0RqP.XU0ŧ*\u0012éBjTqq:\u000e\u0019\rb\u0018UȞwk|Jr\u000bq\u0010و\u001azp.WXAu \u0013JB\u001eDcS}CQb\u000b53\u001fxƉ9ѩ\t\u0003 1V\u0018?\tQT$\u0012^A7ńQҫQ\u0007 \u001c\u0014Ah\u000e,g\u007fNdT3qƠ3%\tvP\\wk>|e\rtU}˜xҐ\"+Hʺߗ\u0014%٘\u0002\u0007\u0001\\ϓ\u0007O"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`})6U -M\u0019", "", "D`[BX", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uH\u0018\u0016", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "\u0011n\\=T5B]\"", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class BlendMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Clear = m4087constructorimpl(0);
    private static final int Src = m4087constructorimpl(1);
    private static final int Dst = m4087constructorimpl(2);
    private static final int SrcOver = m4087constructorimpl(3);
    private static final int DstOver = m4087constructorimpl(4);
    private static final int SrcIn = m4087constructorimpl(5);
    private static final int DstIn = m4087constructorimpl(6);
    private static final int SrcOut = m4087constructorimpl(7);
    private static final int DstOut = m4087constructorimpl(8);
    private static final int SrcAtop = m4087constructorimpl(9);
    private static final int DstAtop = m4087constructorimpl(10);
    private static final int Xor = m4087constructorimpl(11);
    private static final int Plus = m4087constructorimpl(12);
    private static final int Modulate = m4087constructorimpl(13);
    private static final int Screen = m4087constructorimpl(14);
    private static final int Overlay = m4087constructorimpl(15);
    private static final int Darken = m4087constructorimpl(16);
    private static final int Lighten = m4087constructorimpl(17);
    private static final int ColorDodge = m4087constructorimpl(18);
    private static final int ColorBurn = m4087constructorimpl(19);
    private static final int Hardlight = m4087constructorimpl(20);
    private static final int Softlight = m4087constructorimpl(21);
    private static final int Difference = m4087constructorimpl(22);
    private static final int Exclusion = m4087constructorimpl(23);
    private static final int Multiply = m4087constructorimpl(24);
    private static final int Hue = m4087constructorimpl(25);
    private static final int Saturation = m4087constructorimpl(26);
    private static final int Color = m4087constructorimpl(27);
    private static final int Luminosity = m4087constructorimpl(28);

    /* JADX INFO: renamed from: box-impl */
    public static final /* synthetic */ BlendMode m4086boximpl(int i2) {
        return new BlendMode(i2);
    }

    /* JADX INFO: renamed from: constructor-impl */
    public static int m4087constructorimpl(int i2) {
        return i2;
    }

    /* JADX INFO: renamed from: equals-impl */
    public static boolean m4088equalsimpl(int i2, Object obj) {
        return (obj instanceof BlendMode) && i2 == ((BlendMode) obj).m4092unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0 */
    public static final boolean m4089equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* JADX INFO: renamed from: hashCode-impl */
    public static int m4090hashCodeimpl(int i2) {
        return Integer.hashCode(i2);
    }

    public boolean equals(Object obj) {
        return m4088equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4090hashCodeimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl */
    public final /* synthetic */ int m4092unboximpl() {
        return this.value;
    }

    private /* synthetic */ BlendMode(int i2) {
        this.value = i2;
    }

    /* JADX INFO: compiled from: BlendMode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005\\2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005;i%\nCiWܵ|̝\u0093NM˗kvRZ\u0019H'\b\u001c{x0\u001al\u0007c*\u000f`DƜ>\u074c߲n<˃d|>\u0005.7::\u007f\f\u000f\u001ez_\u001e~\u0013Cy\u000eݮ/ϋú9QҫQ\r\"\u0012\u0014C8\u0003$euR\u0007_zgR/Q\u0005\u07bcA÷ф^/ƊQ\u0015NT5\u0012\u000fc$6N;\u0006,3_\u001b\u0007\u0001]У\u0002ӊҵ<\u0004ص+/3I\u0002\\NZ\u0006!#/ $k\u0001>\\3Sՙ\u000bʬ̼NbׂT\u00160w\t\u0001%>\n\u001d\u0014+\u0019E;*~\b<5иqԟŬO\u0001ެF\b\u0003aD\u001c=\u00029<G\u001f7hoM1Ne}͕\f̔ƹ\u007fmĲ_\\\u0016`# lyWD_D\u000e_\\\u001eq=\u001c\u0006ψạň\u0003/Ͻ\u00047\u0004\u0011<\u001c=9aN1%<\u0019VZ\u007fv3bŞR֟˦G?̱r\u001e?*\u0017\u0011rFj\u001cyT%o:)e\u001c\u0003\tś\u0007ʶٷ[v˶%-\u0018N]m\u0002lSv\u0018)\u007f}Es\u0007k<Y¢]ڨΉPbߧeZ~\u0014MAz\u0007^\u0002PW\\qjD:2vlߑvӻϢM\u000bƱ6Gy\u001cB1I\u001bb2V\u0007nYO\u001b!_\tj˦}Ԟו#\u0002Ȑ(|\u0011\u0001^a\tqm\u0018W0Mw0MYQc\u001bƘTȨش3{ɠ\u000b\u0007{\u007fUldIR\u000e$y&\u0013.829\u007f1̈́\u0012Áʨ(1ī1MTrsVe\u0014-\u001e\u000b}_RvR\u007f\b\u0019rߓ_ʄ²NSЂ&~fr1\r|\u0002\u007f\u0007T~\u0018zb1s>wtľXߢӷ7{ġ#&-\u0001}'\u001573j5!f\u000f\"W-a\fkݩ-Ӡ̥\u000e%܌i\f4c$tzSc[I<\u001ap\rh:$\u001b\u0005ޢG۳Τ\u0007Aީ8\u0015;HOi\tX>x\u00193N}\u0015X%p\u0005]Ȟ\u0012̊ё3-ʡ.{K}\"c['\u0017zak>\u0005Y\u000b#J=\fГzς£\u0011\u001bݞ$^_b\u00175\u001eu\u001eeO?3\u001cJ9<4Z>\u0082\n͏Ԇh\u0005خ~\bN_\u001d\u001cJDyld\u0012%\u0010j\t`\u0005\u000fGɰ ơݹ}\u000eʟ\"\u0001=1\u0013r^V5\u0017@\u0005$4\u0017O\u0003O-h\u0000*לɭ8\u001aϜ\\\t\u0013EkHa\u0004<9U->\u0003}BP\u0018+\u001fĦ\u0017Ç˼P\u0010چz8f\u000bciff|ItV\u001f977\u0013|<>õ\u000eԥŸNqƚf5TN\u0006<[\u001c\u0007PR-W#\u000b\u001e^\u001b[\bُ,֑ȏi\u0013ր\u007f_[;\f\r8\"-?\u0003%-n\u001c#\"]I<мpдʁ\u0001\b\u07b3T(\f.Xy\u000b\f4EDSב3\u000b\u001ba_ŷ\u0014O?/+r%\u0605O'"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`})6U -M\u0002\u0019u<)\u0011qeC\u00109", "", "u(E", "\u0011kT.e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`})6U -M\u0019", "5dc\u0010_,:``I\u0004H|m\u001b\u001f", "u(8", "\u0017", "\u0011n[<e", "5dc\u0010b3H``I\u0004H|m\u001b\u001f", "\u0011n[<e\tN`\"", "5dc\u0010b3H`u\u000f\bgsG\u0012\u00196p:k", "\u0011n[<e\u000bHR\u001b~", "5dc\u0010b3H`w\ty`,DS8OP\u0019\u000e0", "\u0012`a8X5", "5dc\u0011T9DS\"FEg\u0016MyAU", "\u0012hU3X9>\\\u0017~", "5dc\u0011\\-?S&~\u0004\\,DS8OP\u0019\u000e0", "\u0012rc", "5dc\u0011f;\u0006\u001e\"hKO>l", "\u0012rc\u000eg6I", "5dc\u0011f;\u001ab#\nB)5fY wo", "\u0012rc\u0016a", "5dc\u0011f;\"\\`I\u0004H|m\u001b\u001f", "\u0012rc\u001ch;", "5dc\u0011f;(c(FEg\u0016MyAU", "\u0012rc\u001ci,K", "5dc\u0011f;(d\u0019\fB)5fY wo", "\u0013wR9h:B]\"", "5dc\u0012k*Ec'\u0003\u0005gsG\u0012\u00196p:k", "\u0016`a1_0@V(", "5dc\u0015T9=Z\u001d\u0001}msG\u0012\u00196p:k", "\u0016tT", "5dc\u0015h,\u0006\u001e\"hKO>l", "\u001ahV5g,G", "5dc\u0019\\.Ab\u0019\bB)5fY wo", "\u001at\\6a6LW(\u0013", "5dc\u0019h4B\\#\r~m@DS8OP\u0019\u000e0", "\u001bnSB_(MS", "5dc\u001ab+NZ\u0015\u000ez&v\u0006r\u007fV\u0012\u0018", "\u001bt[A\\7Eg", "5dc\u001ah3MW$\u0006\u000f&v\u0006r\u007fV\u0012\u0018", "\u001duT?_(R", "5dc\u001ci,KZ\u0015\u0013B)5fY wo", "\u001ekd@", "5dc\u001d_<L\u001bc\bd/\u001d\u000fx", "!`cBe(MW#\b", "5dc T;N`\u0015\u000e~h5DS8OP\u0019\u000e0", "!ba2X5", "5dc V9>S\"FEg\u0016MyAU", "!nUA_0@V(", "5dc b-MZ\u001d\u0001}msG\u0012\u00196p:k", "!qR", "5dc e*\u0006\u001e\"hKO>l", "!qR\u000eg6I", "5dc e*\u001ab#\nB)5fY wo", "!qR\u0016a", "5dc e*\"\\`I\u0004H|m\u001b\u001f", "!qR\u001ch;", "5dc e*(c(FEg\u0016MyAU", "!qR\u001ci,K", "5dc e*(d\u0019\fB)5fY wo", "&na", "5dc%b9\u0006\u001e\"hKO>l", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getClear-0nO6VwU */
        public final int m4093getClear0nO6VwU() {
            return BlendMode.Clear;
        }

        /* JADX INFO: renamed from: getSrc-0nO6VwU */
        public final int m4116getSrc0nO6VwU() {
            return BlendMode.Src;
        }

        /* JADX INFO: renamed from: getDst-0nO6VwU */
        public final int m4099getDst0nO6VwU() {
            return BlendMode.Dst;
        }

        /* JADX INFO: renamed from: getSrcOver-0nO6VwU */
        public final int m4120getSrcOver0nO6VwU() {
            return BlendMode.SrcOver;
        }

        /* JADX INFO: renamed from: getDstOver-0nO6VwU */
        public final int m4103getDstOver0nO6VwU() {
            return BlendMode.DstOver;
        }

        /* JADX INFO: renamed from: getSrcIn-0nO6VwU */
        public final int m4118getSrcIn0nO6VwU() {
            return BlendMode.SrcIn;
        }

        /* JADX INFO: renamed from: getDstIn-0nO6VwU */
        public final int m4101getDstIn0nO6VwU() {
            return BlendMode.DstIn;
        }

        /* JADX INFO: renamed from: getSrcOut-0nO6VwU */
        public final int m4119getSrcOut0nO6VwU() {
            return BlendMode.SrcOut;
        }

        /* JADX INFO: renamed from: getDstOut-0nO6VwU */
        public final int m4102getDstOut0nO6VwU() {
            return BlendMode.DstOut;
        }

        /* JADX INFO: renamed from: getSrcAtop-0nO6VwU */
        public final int m4117getSrcAtop0nO6VwU() {
            return BlendMode.SrcAtop;
        }

        /* JADX INFO: renamed from: getDstAtop-0nO6VwU */
        public final int m4100getDstAtop0nO6VwU() {
            return BlendMode.DstAtop;
        }

        /* JADX INFO: renamed from: getXor-0nO6VwU */
        public final int m4121getXor0nO6VwU() {
            return BlendMode.Xor;
        }

        /* JADX INFO: renamed from: getPlus-0nO6VwU */
        public final int m4112getPlus0nO6VwU() {
            return BlendMode.Plus;
        }

        /* JADX INFO: renamed from: getModulate-0nO6VwU */
        public final int m4109getModulate0nO6VwU() {
            return BlendMode.Modulate;
        }

        /* JADX INFO: renamed from: getScreen-0nO6VwU */
        public final int m4114getScreen0nO6VwU() {
            return BlendMode.Screen;
        }

        /* JADX INFO: renamed from: getOverlay-0nO6VwU */
        public final int m4111getOverlay0nO6VwU() {
            return BlendMode.Overlay;
        }

        /* JADX INFO: renamed from: getDarken-0nO6VwU */
        public final int m4097getDarken0nO6VwU() {
            return BlendMode.Darken;
        }

        /* JADX INFO: renamed from: getLighten-0nO6VwU */
        public final int m4107getLighten0nO6VwU() {
            return BlendMode.Lighten;
        }

        /* JADX INFO: renamed from: getColorDodge-0nO6VwU */
        public final int m4096getColorDodge0nO6VwU() {
            return BlendMode.ColorDodge;
        }

        /* JADX INFO: renamed from: getColorBurn-0nO6VwU */
        public final int m4095getColorBurn0nO6VwU() {
            return BlendMode.ColorBurn;
        }

        /* JADX INFO: renamed from: getHardlight-0nO6VwU */
        public final int m4105getHardlight0nO6VwU() {
            return BlendMode.Hardlight;
        }

        /* JADX INFO: renamed from: getSoftlight-0nO6VwU */
        public final int m4115getSoftlight0nO6VwU() {
            return BlendMode.Softlight;
        }

        /* JADX INFO: renamed from: getDifference-0nO6VwU */
        public final int m4098getDifference0nO6VwU() {
            return BlendMode.Difference;
        }

        /* JADX INFO: renamed from: getExclusion-0nO6VwU */
        public final int m4104getExclusion0nO6VwU() {
            return BlendMode.Exclusion;
        }

        /* JADX INFO: renamed from: getMultiply-0nO6VwU */
        public final int m4110getMultiply0nO6VwU() {
            return BlendMode.Multiply;
        }

        /* JADX INFO: renamed from: getHue-0nO6VwU */
        public final int m4106getHue0nO6VwU() {
            return BlendMode.Hue;
        }

        /* JADX INFO: renamed from: getSaturation-0nO6VwU */
        public final int m4113getSaturation0nO6VwU() {
            return BlendMode.Saturation;
        }

        /* JADX INFO: renamed from: getColor-0nO6VwU */
        public final int m4094getColor0nO6VwU() {
            return BlendMode.Color;
        }

        /* JADX INFO: renamed from: getLuminosity-0nO6VwU */
        public final int m4108getLuminosity0nO6VwU() {
            return BlendMode.Luminosity;
        }
    }

    public String toString() {
        return m4091toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: toString-impl */
    public static String m4091toStringimpl(int i2) {
        return m4089equalsimpl0(i2, Clear) ? "Clear" : m4089equalsimpl0(i2, Src) ? "Src" : m4089equalsimpl0(i2, Dst) ? "Dst" : m4089equalsimpl0(i2, SrcOver) ? "SrcOver" : m4089equalsimpl0(i2, DstOver) ? "DstOver" : m4089equalsimpl0(i2, SrcIn) ? "SrcIn" : m4089equalsimpl0(i2, DstIn) ? "DstIn" : m4089equalsimpl0(i2, SrcOut) ? "SrcOut" : m4089equalsimpl0(i2, DstOut) ? "DstOut" : m4089equalsimpl0(i2, SrcAtop) ? "SrcAtop" : m4089equalsimpl0(i2, DstAtop) ? "DstAtop" : m4089equalsimpl0(i2, Xor) ? "Xor" : m4089equalsimpl0(i2, Plus) ? "Plus" : m4089equalsimpl0(i2, Modulate) ? "Modulate" : m4089equalsimpl0(i2, Screen) ? Screen.TAG : m4089equalsimpl0(i2, Overlay) ? "Overlay" : m4089equalsimpl0(i2, Darken) ? "Darken" : m4089equalsimpl0(i2, Lighten) ? "Lighten" : m4089equalsimpl0(i2, ColorDodge) ? "ColorDodge" : m4089equalsimpl0(i2, ColorBurn) ? "ColorBurn" : m4089equalsimpl0(i2, Hardlight) ? "HardLight" : m4089equalsimpl0(i2, Softlight) ? "Softlight" : m4089equalsimpl0(i2, Difference) ? "Difference" : m4089equalsimpl0(i2, Exclusion) ? "Exclusion" : m4089equalsimpl0(i2, Multiply) ? "Multiply" : m4089equalsimpl0(i2, Hue) ? "Hue" : m4089equalsimpl0(i2, Saturation) ? ExifInterface.TAG_SATURATION : m4089equalsimpl0(i2, Color) ? "Color" : m4089equalsimpl0(i2, Luminosity) ? "Luminosity" : "Unknown";
    }
}
