package androidx.compose.ui.text.font;

import com.drew.metadata.exif.makernotes.LeicaMakernoteDirectory;
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
/* JADX INFO: compiled from: FontWeight.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eQLш|\u0004O\f8\u000b4F\u0007\":\u001b\u007f\u0007tʑA0JeP.`_2\u000fq{:)qҕ\u0010Pk[*\u007f2\t}Ȟ\u0016f'IgKN\u001f\n$x\u0003,wVޯa\u0012\u001d4\u000b~M8eok:\u0011xD\u000b82P\u0600@ڥ\u0001b;V\u0017\u000fzqS<\u0018>F\t<h\f{\u000e`Ş\u0006\u0007&\u000f(tg|7\u000f\u0001&@=.\u001bipZms\u0001\f[\r^TU\u000ețe$3¨O7\u001b(a\u0007߀Vi"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F_\u00162OFJA", "", "EdX4[;", "", "uH\u0018#", "5dc$X0@V(", "u(8", "1n\\=T9>B#", "=sW2e", "3pd._:", "", "", "6`b566=S", "BnBAe0GU", "", "\u0011n\\=T5B]\"", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FontWeight implements Comparable<FontWeight> {
    public static final int $stable = 0;
    private static final FontWeight Black;
    private static final FontWeight Bold;
    public static final Companion Companion = new Companion(null);
    private static final FontWeight ExtraBold;
    private static final FontWeight ExtraLight;
    private static final FontWeight Light;
    private static final FontWeight Medium;
    private static final FontWeight Normal;
    private static final FontWeight SemiBold;
    private static final FontWeight Thin;
    private static final FontWeight W100;
    private static final FontWeight W200;
    private static final FontWeight W300;
    private static final FontWeight W400;
    private static final FontWeight W500;
    private static final FontWeight W600;
    private static final FontWeight W700;
    private static final FontWeight W800;
    private static final FontWeight W900;
    private static final List<FontWeight> values;
    private final int weight;

    public FontWeight(int i2) {
        this.weight = i2;
        if (1 > i2 || i2 >= 1001) {
            throw new IllegalArgumentException(("Font weight can be in range [1, 1000]. Current value: " + i2).toString());
        }
    }

    public final int getWeight() {
        return this.weight;
    }

    /* JADX INFO: compiled from: FontWeight.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005W4\u0012\u0006%nj?1JͣIDɟ\u0004*=j<9*[ҸuCIUj\u00180\ngN\u0016i%N1ŗEǇ\n\"\u0001̓<K[{k\u0012'4HsM8\u001e\nK?xtd\u0007V6x؈{ڱ\u0005&2Ϻ x\u0001JY\f*2FxHW]g\u0013#*\u0006l\"7\"3ɩPɇLxeŽ?%\tsPN?a6\b[\u0012\u0017n5\u0019\u000faL-v;\f՞'٨\u0007\u0013Z¹O\u0005E~K\u0005\u0001)-9Wx(Pf\u000f,\u0015YQCaI̮^ԇUl\u0014ʬ;Qi[^\u000e@y\u0001\r\u001bAT(\u00149`.[\u001c\u001d\fdޟvɤWLX\u061cnD\u0006\u000eo6/'\u0006G9>k\u0001_vS\u0019|92\tc̜%ъr-c٪\u001eb\u001b1bwi3WWKM\u001f$gU\u0006\u0004\u001fd8.ZΊIĬ3\b\u0019ф''=tG#9m\bbRlG\u001fn\u0004ki\u0001Jv&Eݳ9Ҋ\r\u0018bեt\u0007qlbXD\u0013S9b\fN\"!>twj#[\u0014%рjȬnYe܃51lVgn\u0004\u0010]Yl8\u0006kq1yR%\u0016u@9ڻZڋF_\u0014ȗl*(TVj(y\u0002g\\\u0011cLM\u001644Z3O`kȅ\u0005ٿFM\u0005ȁo\\n5\rTK&\t\u00102yY\u001b^\u0004\to\u0016z\u007f0Sʨ$έE]=ӧ6W(\u0011B|;\t\u0005\u001d\u000eL8fUv\u0005\u0016$W2$l֥;ֺ3I\u001bÁ\u000f+8-;Edtk}[\u0017w\u0015\u000b'';\u00170\u001e\fAѹ.߯nVWܷ'$|\r\u0001# f\u0006)oKKaq\u0005#[lK)\u00070ߪP̞\u0001\u0011'Ǉ5\u0003uS\u000b5EE-O$|dI#\u0015ui\u001e00feնvФ\b8kܞ\u007fdW\u0012@;PK_4L't\u0007\u0011x`j&\nx\r\u000bه5ȈEpxމHO\u0011f\ff\u001f.\u0013)d`\u000b+}7L4o,\u0004C,\u0016\r}{ݏOϬksuжt\rPJ\u0018Gֳ5,"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F_\u00162OFJ*\u0012(\u001ds]B\u000bm5$", "", "u(E", "\u0010kP0^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F_\u00162OFJA", "5dc\u000f_(<YWz\u0004g6\f\u0005>i\n1\n", "5dc\u000f_(<Y", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av% MG=nCs", "\u0010n[1", "5dc\u000fb3=\u0012\u0015\b\u0004h;x\u00183o\t6", "5dc\u000fb3=", "\u0013wc?T\tHZ\u0018", "5dc\u0012k;KOu\t\u0002]jx\u00128o\u000f$\u000bD\u000b %", "5dc\u0012k;KOu\t\u0002]", "\u0013wc?T\u0013BU\u001c\u000e", "5dc\u0012k;KO\u007f\u0003|a;;\u00058n\n7wO\u0005! U", "5dc\u0012k;KO\u007f\u0003|a;", "\u001ahV5g", "5dc\u0019\\.AbWz\u0004g6\f\u0005>i\n1\n", "5dc\u0019\\.Ab", "\u001bdS6h4", "5dc\u001aX+Bc!=vg5\u0007\u0018+t\u00042\u0005N", "5dc\u001aX+Bc!", "\u001cna:T3", "5dc\u001bb9FO =vg5\u0007\u0018+t\u00042\u0005N", "5dc\u001bb9FO ", "!d\\656ER", "5dc X4B0#\u0006y\u001d(\u0006\u00129t{7\u007fJ\n%", "5dc X4B0#\u0006y", "\"gX;", "5dc![0G\u0012\u0015\b\u0004h;x\u00183o\t6", "5dc![0G", "%0\u001f|", "5dc$$v\t\u0012\u0015\b\u0004h;x\u00183o\t6", "5dc$$v\t", "%1\u001f|", "5dc$%v\t\u0012\u0015\b\u0004h;x\u00183o\t6", "5dc$%v\t", "%2\u001f|", "5dc$&v\t\u0012\u0015\b\u0004h;x\u00183o\t6", "5dc$&v\t", "%3\u001f|", "5dc$'v\t\u0012\u0015\b\u0004h;x\u00183o\t6", "5dc$'v\t", "%4\u001f|", "5dc$(v\t\u0012\u0015\b\u0004h;x\u00183o\t6", "5dc$(v\t", "%5\u001f|", "5dc$)v\t\u0012\u0015\b\u0004h;x\u00183o\t6", "5dc$)v\t", "%6\u001f|", "5dc$*v\t\u0012\u0015\b\u0004h;x\u00183o\t6", "5dc$*v\t", "%7\u001f|", "5dc$+v\t\u0012\u0015\b\u0004h;x\u00183o\t6", "5dc$+v\t", "%8\u001f|", "5dc$,v\t\u0012\u0015\b\u0004h;x\u00183o\t6", "5dc$,v\t", "D`[BX:", "", "5dc#T3NS'=\u000bb&\f\tBty5{G\u0001\u0013%G", "u(;7T=:\u001d)\u000e~euc\r=tU", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getBlack$annotations() {
        }

        public static /* synthetic */ void getBold$annotations() {
        }

        public static /* synthetic */ void getExtraBold$annotations() {
        }

        public static /* synthetic */ void getExtraLight$annotations() {
        }

        public static /* synthetic */ void getLight$annotations() {
        }

        public static /* synthetic */ void getMedium$annotations() {
        }

        public static /* synthetic */ void getNormal$annotations() {
        }

        public static /* synthetic */ void getSemiBold$annotations() {
        }

        public static /* synthetic */ void getThin$annotations() {
        }

        public static /* synthetic */ void getW100$annotations() {
        }

        public static /* synthetic */ void getW200$annotations() {
        }

        public static /* synthetic */ void getW300$annotations() {
        }

        public static /* synthetic */ void getW400$annotations() {
        }

        public static /* synthetic */ void getW500$annotations() {
        }

        public static /* synthetic */ void getW600$annotations() {
        }

        public static /* synthetic */ void getW700$annotations() {
        }

        public static /* synthetic */ void getW800$annotations() {
        }

        public static /* synthetic */ void getW900$annotations() {
        }

        private Companion() {
        }

        public final FontWeight getW100() {
            return FontWeight.W100;
        }

        public final FontWeight getW200() {
            return FontWeight.W200;
        }

        public final FontWeight getW300() {
            return FontWeight.W300;
        }

        public final FontWeight getW400() {
            return FontWeight.W400;
        }

        public final FontWeight getW500() {
            return FontWeight.W500;
        }

        public final FontWeight getW600() {
            return FontWeight.W600;
        }

        public final FontWeight getW700() {
            return FontWeight.W700;
        }

        public final FontWeight getW800() {
            return FontWeight.W800;
        }

        public final FontWeight getW900() {
            return FontWeight.W900;
        }

        public final FontWeight getThin() {
            return FontWeight.Thin;
        }

        public final FontWeight getExtraLight() {
            return FontWeight.ExtraLight;
        }

        public final FontWeight getLight() {
            return FontWeight.Light;
        }

        public final FontWeight getNormal() {
            return FontWeight.Normal;
        }

        public final FontWeight getMedium() {
            return FontWeight.Medium;
        }

        public final FontWeight getSemiBold() {
            return FontWeight.SemiBold;
        }

        public final FontWeight getBold() {
            return FontWeight.Bold;
        }

        public final FontWeight getExtraBold() {
            return FontWeight.ExtraBold;
        }

        public final FontWeight getBlack() {
            return FontWeight.Black;
        }

        public final List<FontWeight> getValues$ui_text_release() {
            return FontWeight.values;
        }
    }

    static {
        FontWeight fontWeight = new FontWeight(100);
        W100 = fontWeight;
        FontWeight fontWeight2 = new FontWeight(200);
        W200 = fontWeight2;
        FontWeight fontWeight3 = new FontWeight(300);
        W300 = fontWeight3;
        FontWeight fontWeight4 = new FontWeight(400);
        W400 = fontWeight4;
        FontWeight fontWeight5 = new FontWeight(500);
        W500 = fontWeight5;
        FontWeight fontWeight6 = new FontWeight(600);
        W600 = fontWeight6;
        FontWeight fontWeight7 = new FontWeight(700);
        W700 = fontWeight7;
        FontWeight fontWeight8 = new FontWeight(LeicaMakernoteDirectory.TAG_CAMERA_TEMPERATURE);
        W800 = fontWeight8;
        FontWeight fontWeight9 = new FontWeight(900);
        W900 = fontWeight9;
        Thin = fontWeight;
        ExtraLight = fontWeight2;
        Light = fontWeight3;
        Normal = fontWeight4;
        Medium = fontWeight5;
        SemiBold = fontWeight6;
        Bold = fontWeight7;
        ExtraBold = fontWeight8;
        Black = fontWeight9;
        values = CollectionsKt.listOf((Object[]) new FontWeight[]{fontWeight, fontWeight2, fontWeight3, fontWeight4, fontWeight5, fontWeight6, fontWeight7, fontWeight8, fontWeight9});
    }

    @Override // java.lang.Comparable
    public int compareTo(FontWeight fontWeight) {
        return Intrinsics.compare(this.weight, fontWeight.weight);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FontWeight) && this.weight == ((FontWeight) obj).weight;
    }

    public int hashCode() {
        return this.weight;
    }

    public String toString() {
        return "FontWeight(weight=" + this.weight + ')';
    }
}
