package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.intl.LocaleList;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
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
/* JADX INFO: compiled from: KeyboardOptions.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r+4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<$a$yCQU\"}(:WNumvJ`\u000bK\u000f\u001c\u0016\u0001j2J]xk\u001e\u00172HoE8cڎ[\u0002\u0011td\u0004X1jxI\u000b\u0016*0N\u0010\u0005z[K:\u0013@D~<j\r{\b*\u0018\f>.\u00056\\\u0016SFNr]H5;\u0003\u0018I^/e0\u000bU%Hj&;\u007fq&1@E?-'i\u00025UkG\t?\u007fH\u001dj=&YUָ[6f\rTB1d\u001dcx&j\u0005i`:(;UiK^\u0010@w)~\u001dB\n\u000e\u0014+`.[\u001fv\u000e\u00143\u0003xk@~\tެF\u007f\tovP+\u0015C1?\u001btQy;GOG\u0002\u000b\r,%\u0019nO^d\u0014f\u0015)X\u0010Q_VPCNN\u0018_Um2wr\n0\u0004>O\u00181\u0012\u0010\\ É;[G2a=\u0012NJg\u0005\u0005xh\u0002jbPF\"|&O,\u001f\u000b\tGt\u000bqPb\\D\u0011{!d\r\u0004\b!&twj(5\u0018TOvq\u0003Os\tS8v?_ny\u0018o;t2cTs\u0018gR\u0005\u001fW>x\u0004\u0007r͞W\fhmpZ@{\u0003\u0010&ӻtT\u0012\u0013@?\n\u001cb-a\u001fb\u0015V\u00056Bo\u007f9e`h\u001e\u0003l3R\b\u001a*z\t\u000fVtp\u001en?Nڌ{ʠĘ1CWi'[\u001efvg\u0015#5Ѩ$\u0006MgZGdlDv\u0006\u0002&\u0016(;i/k\u0016?\u0005/2\u00101]L!j\u0002S\u0018'\t\u0003\u0012\u000fio^o\u000ej~4xl`N\u0003 h{ޞqּϋh\u0002\u007f\u0018T2\u0010@b>s>wͿ3_BNF|\u001d\u001fL&1u(|C/['K\u0019(\u001a5\u0015oa\u0002o\\~\u0013\u0015,ts\nDcDv\u0013Yc2I@a[\u0015=P-\u001d\u000bHHx\u0002 D\u001f3;6xIjpdCe\rE|\u0015\u0013r\u0012ÖUܪǈ\u0017q\u0004l<\u0019rPQ1,^qљASYg{mc\\9K?\u0012\u0011{?~*\u001eS\u001f\u0005Z\u0013\u000f6\u0006\u0002\u001cNAig5B\u000f$B2T\b9J\u0005q\f\u0010\t\b^a%\u0016`K$C\\\u000eb\u0003tX^\u0004\u000fH\u0011)0\u0001\r\u001aK \u000f4_\u0011\u0600E\u07bcвg4\u0007\f+Cc{]:~%YG\u0005?)dp\u0003!D\fB\u0010ΐ6L\\7+\u0004o:ՄH\u0003+~0\u001dOP?٣=/Ϳ\u000fUj\r-| &jNPiE\u000fE\u001cJK'\u000bGۚ#upidP\u000e6q\u05ceI,Rk\u001f\f+'v!3\u0006CqUI\u0019\u0017mس\u009cW;\u0004Mh&5J\r!\u000b\u001fTzZu)<.qDe8MiЫ\"ɯ2T\u0005t\u0010@\u0016Ig\u00049\u0016!s*~\u00061X)Ak4EƑl\u0001\u0012cz{\u0007W\u0011\u0019tH'\f|Fh\u001d7*\u0004nì\\ϳ\u0015W8Z\u0017\u001a\"*v6D\bz)>PˣgҴךNZá/7s*oNHT$\u0019-\u0016F\u001c8r@\u0015iW\u0004~;Ӻ^إAĠҋ]i܍hx$+\u001a\u001c\rd/\"!?^t4c]Cق#a\u0015ӑx\t\neWGqC`a37`\u0017&hM֮\u0005̯fx\u0018,H,\u0001!8C;Ll=H.܋#ݦӟ\u0002%ɷI@J\b:.&\u00135~F<\u000ft(ASQaHOOW͂:݆nޞڋ4iܱW)B\u0003\u0003'\u001b[JCya\f7!&eOFߩYǃ?)MgRN\u001a\u00176a\rQ{V=fЫHʿď\u001dxߝD\b\u0012\u001f2A\u001ew)(SM\u0019Bm\u0006XV\"\\:f\u0001ޢp\u0087\"ؙږwrԤ0m0uj\u0006oP\u0012\f\"!\\@@,\u001b\u0010ƘQn\u0002ޠ\\\u000fK?E;VAAD\u0015\u0010}tvo פOҰ`gL\u0015y2HEy8\u007fvNnz\u0019;\u001cle\u0001i\u001cT̼\u0014@\u001a\r\u001b\u001c\u00103X\u0011\u000ewm*5|\u000fFd_/\f\u0018ǔ\rڝ\u0013(v0H>\u0019\u001bߪ.Q\u001f\u0005\u0004ߡ|C\u0012;Gy`ې\u0016 "}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001dm*+W?Hj\u001e)$lkB\u00159", "", "1`_6g(EW.z\nb6\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#c Kj *ZB\u0019g?\"$dh=\u001c_;R\u00010\u001d", "/tc<66K`\u0019|\n", "", "9dh/b(KR\b\u0013\u0006^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#c Kj *ZB*\u007f?\u001ej", "7lT\u000eV;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a(7I\u0014=QMDA", ">kPAY6K[|\u0007zH7\f\r9n\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#h'3|\u00178ZK\u001fs4\b weC\u0010q\u0002", "Ag^D>,RP#z\b]\u0016\u0006i9c\u00106", "6h]A?6<O ~\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u0006,~@\b\u001e3t\u0016\u0015QQJA", "uHI\u0016<\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`'K9\u001d<\n4~]\u0007+G|_\u0019T?Jl>+\u001dLi9pn;R\u00010U\"51Xcn\u0007\u001b\u000ec\u0010\u0018\b\u0017\u000f`A w\u001a\u001e\u001b\u0011+V\f?g\u0014U\u0014\u0018=uzPVYW}^\u0005A<w\u0010]h\tN\u000b,l(`\u0013_\u0004`HIyzw#*oT7S\u0001d\u0019<V\u0003vgT\"v?m\u001dm\\BUvd\u001a~0-Z\t\b\u0010Ab\u0002\u0013p:\n47\f(u", "uHI\u0016<\u0013D](\u0006~gu\u0002\u001a7/\u00041\u000b@\u000e \u0013N9l<w!E`\r}Av$=ZS9z>+|dn?\u0007p\u0002\u0012g", "uHI\u0016<\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`'K9\u001d<\n4~]\u0007+G|_\u0019T?Jl>+\u001dLi9pn;R\u00010U\"52fayA\u001d[_\u001fVt\u0011\u000ehA1w@>hf,J}Ko\u0010i \u0017Cy}RT\u001fQ\u0007|qN/hS/#j", "/tc<66K`\u0019|\n>5x\u00066e~", "uH;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016dz}Cx\rI\u0001)4lG\u001eAu!8[C\u0005{8g$htHPg5Y\u00076\u00117U(kS|J\u001cub\u000e86\u001c\tcJ2D+<\u001b\u0019(\u0013\t7q\u0003Ur\u0018?qp>_e.u\u001etN3lEl)wQIPl8dUo!&I:7#;\u001d$wWwp\u0006Q\ryR`kuVna>.Mt_O\u000ftfD>+(Z{\u0005\u001b._>\nt.\u007fD1EB\u000fTu'Knv$6i)#3<< \u0015\u000fT", "5dc\u000eh;H1#\f\b^*\fG+n\t2\u000b<\u0010\u001b!P}", "u(E", "5dc\u000eh;H1#\f\b^*\f", "u(I", "5dc\u000eh;H1#\f\b^*\fh8a|/{?", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016", "\u001aiPCTuEO\"\u0001D;6\u0007\u0010/a\t}", "/tc<66K`\u0019|\nH9[\t0a\u0010/\u000b", "5dc\u000eh;H1#\f\b^*\fr<D\u007f)wP\b&", "5dc\u0010T7Bb\u0015\u0006~s(\f\r9nG\fk)t\u0002jM", "u(8", "\u0017", "1`_6g(EW.z\nb6\u0006r<D\u007f)wP\b&", "5dc\u0010T7Bb\u0015\u0006~s(\f\r9ni5Z@\u0002\u0013'N~U f\u000e)DQ&", "5dc\u0015\\5M:#|ve,\u000b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006z.D`G\u0007Ak\u00125M*?yCs", "6h]A?6<O ~\tH9[\t0a\u0010/\u000b", "5dc\u0015\\5M:#|ve,\u000br<D\u007f)wP\b&", "5dc\u0016`,\u001aQ(\u0003\u0005gs|x.um8\u0006", "7lT\u000eV;B]\"h\b=,}\u0005?l\u000f", "5dc\u0016`,\u001aQ(\u0003\u0005g\u0016\ng/f{8\u0003OH\u0017\u0007F\u007f{L\u0001c6c\u000e)6i%2WL5x4%\u0015do9", "7r2<`7ES(~\u0002r\u001c\u0006\u0017:e},|D\u0001\u0016", "5dc\u0018X@;]\u0015\fyM@\b\tvP\u0005\u000b\u0004\u0011`v", "9dh/b(KR\b\u0013\u0006^\u0016\ng/f{8\u0003O", "5dc\u0018X@;]\u0015\fyM@\b\t\u0019r^(|<\u0011\u001e&\u000fZ\u0013\u001f~u\u00159", "5dc\u001d_(MT#\f\u0003B4|r:t\u00042\u0005N", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006z.@i\ri\"t\u0012=NMHs\u0018&\u0015RlH\u000bm5\\L", "Ag^B_+,V#\u0011`^@y\u0013+r~\u0012\u0005!\u000b\u0015'U", "5dc [6NZ\u0018l}h>b\tCb\n$\t?j wQm\u001eJ5!>b\b/3|\u001a8VQ", "5dc [6NZ\u0018l}h>b\tCb\n$\t?j wQm\u001eJ", "5dc [6P9\u0019\u0013wh(\n\b\u0019n`2yP\u000f", "Ag^D>,RP#z\b]\u0016\u0006i9c\u00106eM_\u0017\u0018C\u007f\u0015K", "5dc [6P9\u0019\u0013wh(\n\b\u0019n`2yP\u000f\u0001$&o\u000f8\u0007,D\u0018~*Gv\u0015*\\GEt.+\u0015oa5\u0015c", "1n_F", "1n_F yF \u0016P\u000fp", "uHI\u0016<o%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`Hy\u001eEu!D]\b)\u0001|\u0016A\\\r!kH\u001b\u001fdn8pn;R\u00010U\"", "1n_F 0C\u001fd\u007f}h", "uHI\u0016<\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`'K9\u001d<\n4~]\u0007+G|_\u0019T?Jl>+\u001dLi9pn;R\u00010U\"\u0012\u0013X[qJ\u001e\u0016Y!\u0018)\u0017\rdK2n\u000e8)\u00185H}Jl\u000b\u0015_\u001d5}\u007f\f<\u0010[v\u001fqN(RQhc\u0004PO\u001b", "1n_F \u0010'duMvJ", "uHI\u0016<\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`'K9\u001d<\n4~]\u0007+G|_\u0019T?Jl>+\u001dLi9pn;R\u00010U\"51Xcn\u0007\u001b\u000ec\u0010\u0018\b\u0017\u000f`A w\u001a\u001e\u001b\u0011+V\f?g\u0014U\u0014\u0018=uzPVYW}^\u0005A<w\u0010]h\tN\u000b,l(`\u0013_\u0004`HIyWX\u0015$g]8\u000ezfZp\\\u0002rqU\u0019D9.NvZBTs_E>6\u001f^\u000bAw2lq5p:\u0003\u001e5Eh\u000fTum", "uH;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016dz}Cx\rI\u0001)4lG\u001eAu!8[C\u0005{8g$htHPg5Y\u00076\u00117U(kS|J\u001cub\u000e86\u001c\tcJ2D+<\u001b\u0019(\u0013\t7q\u0003Ur\u0018?qp>_e.u\u001etN3lEl)wQIPl8dUo!&I:7#;\u001d$wWwp\u0006Q\ryR`kuVn>\u001f GlhPInh\u0006r1'V\u0006\u0006\u0012{Y~;},\u007fC.@mNZg+M(^\u0015@YK#35&\u001eNOm~z\u0014", "3pd._:", "=sW2e", "4h[9H5L^\u0019|~_0|\b a\u00078{Nr\u001b&J", "4h[9H5L^\u0019|~_0|\b a\u00078{Nr\u001b&J.\u000fF\u0007.4U\r$Av\u0010;MJ;gB\u001e", "6`b566=S", "", ";da4X", "Bn8:X\u0016Ib\u001d\t\u0004l", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a(7W!=QMDy\n", "Ah]4_,%W\"~", "Bn8:X\u0016Ib\u001d\t\u0004lj}\u0013?n~$\u000bD\u000b \u0011To\u0015<r35", "BnBAe0GU", "", "\u0011n\\=T5B]\"", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class KeyboardOptions {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final KeyboardOptions Default = new KeyboardOptions(0, (Boolean) null, 0, 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 127, (DefaultConstructorMarker) null);
    private static final KeyboardOptions SecureTextField = new KeyboardOptions(0, (Boolean) false, KeyboardType.Companion.m6360getPasswordPjHm6EE(), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 121, (DefaultConstructorMarker) null);
    private final Boolean autoCorrectEnabled;
    private final int capitalization;
    private final LocaleList hintLocales;
    private final int imeAction;
    private final int keyboardType;
    private final PlatformImeOptions platformImeOptions;
    private final Boolean showKeyboardOnFocus;

    public /* synthetic */ KeyboardOptions(int i2, Boolean bool, int i3, int i4, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, bool, i3, i4, platformImeOptions, bool2, localeList);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0013R\u00016\u0005yTlkLg\u000fX\u001ak\\acH*\u0014v\u001ff\t[q~]\u0007czpMx\u0002a]s>Y]BJ&_[\b#d\b<zRCt\u001bY&I\u001e\u000b\u0019\u0010s\u000e{< \u000b\u000e|o#\u0015\u0001\\\u0015QH", replaceWith = @ReplaceWith(expression = "KeyboardOptions(capitalization = capitalization, autoCorrectEnabled = autoCorrect, keyboardType = keyboardType, imeAction = imeAction,platformImeOptions = platformImeOptions, showKeyboardOnFocus = showKeyboardOnFocus,hintLocales = hintLocales)", imports = {}))
    @InterfaceC1492Gx
    public /* synthetic */ KeyboardOptions(int i2, boolean z2, int i3, int i4, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, z2, i3, i4, platformImeOptions, bool, localeList);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0010G\u0005C\u0006u\u001ee]Kg\u0001_'kPeZ\n9\u001e(\u000fa\u0004Vo~")
    @InterfaceC1492Gx
    public /* synthetic */ KeyboardOptions(int i2, boolean z2, int i3, int i4, PlatformImeOptions platformImeOptions, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, z2, i3, i4, platformImeOptions);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0013R\u00016\u0005yTlkLg\u000fX\u001ak\\acH*\u0014v\u001ff\t[q~]\u0007czpMx\u0002a]s>Y]BJ&_[\b#d\bKq?H\u0018\u001bY!-({#\u0012\u0007\u0015~E/\u000b\u000e|o#\u0015\u0001\\\u0015QH")
    @InterfaceC1492Gx
    public /* synthetic */ KeyboardOptions(int i2, boolean z2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, z2, i3, i4);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0013R\u00016\u0005yTlkLg\u000fX\u001akOq`\u0018\n\u0014z\u001eWyZSxOv0kl\ftT\\lmKZ7\u0001")
    @InterfaceC1492Gx
    public static /* synthetic */ void getAutoCorrect$annotations() {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\fT~A\u0007x\u001a[\u0018M7\r\u0010\u00175\\]^\"f\bw\u0019bwZwlW\u0001-z\u0002\u001a$7`a(LN-J%\u0017oN\t#jL*s$C\u0015!Za")
    @InterfaceC1492Gx
    public static /* synthetic */ void getShouldShowKeyboardOnFocus$annotations() {
    }

    private KeyboardOptions(int i2, Boolean bool, int i3, int i4, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList) {
        this.capitalization = i2;
        this.autoCorrectEnabled = bool;
        this.keyboardType = i3;
        this.imeAction = i4;
        this.platformImeOptions = platformImeOptions;
        this.showKeyboardOnFocus = bool2;
        this.hintLocales = localeList;
    }

    public /* synthetic */ KeyboardOptions(int i2, Boolean bool, int i3, int i4, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i5) | ((-1) - 1)) != 0 ? KeyboardCapitalization.Companion.m6336getUnspecifiedIUNYP9k() : i2, (-1) - (((-1) - i5) | ((-1) - 2)) != 0 ? null : bool, (-1) - (((-1) - i5) | ((-1) - 4)) != 0 ? KeyboardType.Companion.m6363getUnspecifiedPjHm6EE() : i3, (i5 & 8) != 0 ? ImeAction.Companion.m6309getUnspecifiedeUduSuo() : i4, (-1) - (((-1) - i5) | ((-1) - 16)) != 0 ? null : platformImeOptions, (i5 + 32) - (i5 | 32) != 0 ? null : bool2, (i5 + 64) - (i5 | 64) == 0 ? localeList : null, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: getCapitalization-IUNYP9k, reason: not valid java name */
    public final int m1347getCapitalizationIUNYP9k() {
        return this.capitalization;
    }

    public final Boolean getAutoCorrectEnabled() {
        return this.autoCorrectEnabled;
    }

    /* JADX INFO: renamed from: getKeyboardType-PjHm6EE, reason: not valid java name */
    public final int m1350getKeyboardTypePjHm6EE() {
        return this.keyboardType;
    }

    /* JADX INFO: renamed from: getImeAction-eUduSuo, reason: not valid java name */
    public final int m1348getImeActioneUduSuo() {
        return this.imeAction;
    }

    public final PlatformImeOptions getPlatformImeOptions() {
        return this.platformImeOptions;
    }

    public final Boolean getShowKeyboardOnFocus() {
        return this.showKeyboardOnFocus;
    }

    public final LocaleList getHintLocales() {
        return this.hintLocales;
    }

    /* JADX INFO: compiled from: KeyboardOptions.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005'2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005>i%\nCiWP\u0002xޣQɁksvϺj\rI\u0012\u0014\u0016\u0011l2Mc}.,\u001d8Zom5\u0004ڎ\u0014ʢbҽ:\u0011(݅2:\u007f\f\u000f\u001aBJ\u0016~\tHƠ\u0010\u001b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001dm*+W?Hj\u001e)$lkB\u0015\"\nX~2CUR6e(", "", "u(E", "\u0012dU.h3M", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001dm*+W?Hj\u001e)$lkB\u00159", "5dc\u0011X-:c \u000e9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "5dc\u0011X-:c \u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7{.a@EgA\u001d~sp=\u0011l:$", "!dRBe,-S,\u000e[b,\u0004\b", "5dc X*N`\u0019mzq;]\r/l~f|J\u0011 \u0016C~\u0012F\u007f\u001fBY\u0005 3{\u0016lILDuC\u001a$lkB\u0015", "5dc X*N`\u0019mzq;]\r/l~f|J\u0011 \u0016C~\u0012F\u007f\u001fBY\u0005 3{\u0016", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getDefault$annotations() {
        }

        public static /* synthetic */ void getSecureTextField$foundation_release$annotations() {
        }

        private Companion() {
        }

        public final KeyboardOptions getDefault() {
            return KeyboardOptions.Default;
        }

        public final KeyboardOptions getSecureTextField$foundation_release() {
            return KeyboardOptions.SecureTextField;
        }
    }

    public /* synthetic */ KeyboardOptions(int i2, boolean z2, int i3, int i4, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i5) | ((-1) - 1)) != 0 ? KeyboardCapitalization.Companion.m6336getUnspecifiedIUNYP9k() : i2, z2, (-1) - (((-1) - i5) | ((-1) - 4)) != 0 ? KeyboardType.Companion.m6363getUnspecifiedPjHm6EE() : i3, (-1) - (((-1) - i5) | ((-1) - 8)) != 0 ? ImeAction.Companion.m6309getUnspecifiedeUduSuo() : i4, (i5 & 16) != 0 ? null : platformImeOptions, (-1) - (((-1) - i5) | ((-1) - 32)) != 0 ? null : bool, (i5 + 64) - (i5 | 64) == 0 ? localeList : null, (DefaultConstructorMarker) null);
    }

    private KeyboardOptions(int i2, boolean z2, int i3, int i4, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList) {
        this(i2, Boolean.valueOf(z2), i3, i4, platformImeOptions, bool, localeList, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ KeyboardOptions(int i2, boolean z2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 + 1) - (1 | i5) != 0 ? KeyboardCapitalization.Companion.m6336getUnspecifiedIUNYP9k() : i2, (i5 + 2) - (2 | i5) != 0 ? Default.getAutoCorrectOrDefault() : z2, (4 & i5) != 0 ? KeyboardType.Companion.m6363getUnspecifiedPjHm6EE() : i3, (-1) - (((-1) - i5) | ((-1) - 8)) != 0 ? ImeAction.Companion.m6301getDefaulteUduSuo() : i4, (DefaultConstructorMarker) null);
    }

    private KeyboardOptions(int i2, boolean z2, int i3, int i4) {
        this(i2, Boolean.valueOf(z2), i3, i4, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 96, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ KeyboardOptions(int i2, boolean z2, int i3, int i4, PlatformImeOptions platformImeOptions, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i5) | ((-1) - 1)) != 0 ? KeyboardCapitalization.Companion.m6334getNoneIUNYP9k() : i2, (i5 + 2) - (2 | i5) != 0 ? Default.getAutoCorrectOrDefault() : z2, (i5 + 4) - (4 | i5) != 0 ? KeyboardType.Companion.m6362getTextPjHm6EE() : i3, (i5 + 8) - (8 | i5) != 0 ? ImeAction.Companion.m6301getDefaulteUduSuo() : i4, (-1) - (((-1) - i5) | ((-1) - 16)) != 0 ? null : platformImeOptions, (DefaultConstructorMarker) null);
    }

    private KeyboardOptions(int i2, boolean z2, int i3, int i4, PlatformImeOptions platformImeOptions) {
        this(i2, Boolean.valueOf(z2), i3, i4, platformImeOptions, Boolean.valueOf(Default.getShowKeyboardOnFocusOrDefault$foundation_release()), (LocaleList) null, 64, (DefaultConstructorMarker) null);
    }

    public final boolean getAutoCorrect() {
        return getAutoCorrectOrDefault();
    }

    public final /* synthetic */ boolean getShouldShowKeyboardOnFocus() {
        Boolean bool = this.showKeyboardOnFocus;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private final boolean getAutoCorrectOrDefault() {
        Boolean bool = this.autoCorrectEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX INFO: renamed from: getCapitalizationOrDefault-IUNYP9k, reason: not valid java name */
    private final int m1341getCapitalizationOrDefaultIUNYP9k() {
        KeyboardCapitalization keyboardCapitalizationM6321boximpl = KeyboardCapitalization.m6321boximpl(this.capitalization);
        if (KeyboardCapitalization.m6324equalsimpl0(keyboardCapitalizationM6321boximpl.m6327unboximpl(), KeyboardCapitalization.Companion.m6336getUnspecifiedIUNYP9k())) {
            keyboardCapitalizationM6321boximpl = null;
        }
        return keyboardCapitalizationM6321boximpl != null ? keyboardCapitalizationM6321boximpl.m6327unboximpl() : KeyboardCapitalization.Companion.m6334getNoneIUNYP9k();
    }

    /* JADX INFO: renamed from: getKeyboardTypeOrDefault-PjHm6EE, reason: not valid java name */
    private final int m1342getKeyboardTypeOrDefaultPjHm6EE() {
        KeyboardType keyboardTypeM6338boximpl = KeyboardType.m6338boximpl(this.keyboardType);
        if (KeyboardType.m6341equalsimpl0(keyboardTypeM6338boximpl.m6344unboximpl(), KeyboardType.Companion.m6363getUnspecifiedPjHm6EE())) {
            keyboardTypeM6338boximpl = null;
        }
        return keyboardTypeM6338boximpl != null ? keyboardTypeM6338boximpl.m6344unboximpl() : KeyboardType.Companion.m6362getTextPjHm6EE();
    }

    /* JADX INFO: renamed from: getImeActionOrDefault-eUduSuo$foundation_release, reason: not valid java name */
    public final int m1349getImeActionOrDefaulteUduSuo$foundation_release() {
        ImeAction imeActionM6285boximpl = ImeAction.m6285boximpl(this.imeAction);
        if (ImeAction.m6288equalsimpl0(imeActionM6285boximpl.m6291unboximpl(), ImeAction.Companion.m6309getUnspecifiedeUduSuo())) {
            imeActionM6285boximpl = null;
        }
        return imeActionM6285boximpl != null ? imeActionM6285boximpl.m6291unboximpl() : ImeAction.Companion.m6301getDefaulteUduSuo();
    }

    public final boolean getShowKeyboardOnFocusOrDefault$foundation_release() {
        Boolean bool = this.showKeyboardOnFocus;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private final LocaleList getHintLocalesOrDefault() {
        LocaleList localeList = this.hintLocales;
        return localeList == null ? LocaleList.Companion.getEmpty() : localeList;
    }

    private final boolean isCompletelyUnspecified() {
        return KeyboardCapitalization.m6324equalsimpl0(this.capitalization, KeyboardCapitalization.Companion.m6336getUnspecifiedIUNYP9k()) && this.autoCorrectEnabled == null && KeyboardType.m6341equalsimpl0(this.keyboardType, KeyboardType.Companion.m6363getUnspecifiedPjHm6EE()) && ImeAction.m6288equalsimpl0(this.imeAction, ImeAction.Companion.m6309getUnspecifiedeUduSuo()) && this.platformImeOptions == null && this.showKeyboardOnFocus == null && this.hintLocales == null;
    }

    public static /* synthetic */ ImeOptions toImeOptions$foundation_release$default(KeyboardOptions keyboardOptions, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = ImeOptions.Companion.getDefault().getSingleLine();
        }
        return keyboardOptions.toImeOptions$foundation_release(z2);
    }

    public final ImeOptions toImeOptions$foundation_release(boolean z2) {
        return new ImeOptions(z2, m1341getCapitalizationOrDefaultIUNYP9k(), getAutoCorrectOrDefault(), m1342getKeyboardTypeOrDefaultPjHm6EE(), m1349getImeActionOrDefaulteUduSuo$foundation_release(), this.platformImeOptions, getHintLocalesOrDefault(), (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: copy-INvB4aQ$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m1338copyINvB4aQ$default(KeyboardOptions keyboardOptions, int i2, Boolean bool, int i3, int i4, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList, int i5, Object obj) {
        Boolean bool3 = bool2;
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        int i6 = i4;
        int i7 = i3;
        Boolean bool4 = bool;
        int i8 = i2;
        if ((i5 & 1) != 0) {
            i8 = keyboardOptions.capitalization;
        }
        if ((i5 & 2) != 0) {
            bool4 = keyboardOptions.autoCorrectEnabled;
        }
        if ((i5 + 4) - (i5 | 4) != 0) {
            i7 = keyboardOptions.keyboardType;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 8)) != 0) {
            i6 = keyboardOptions.imeAction;
        }
        if ((i5 & 16) != 0) {
            platformImeOptions2 = keyboardOptions.platformImeOptions;
        }
        if ((i5 & 32) != 0) {
            bool3 = null;
        }
        return keyboardOptions.m1344copyINvB4aQ(i8, bool4, i7, i6, platformImeOptions2, bool3, (-1) - (((-1) - i5) | ((-1) - 64)) == 0 ? localeList : null);
    }

    /* JADX INFO: renamed from: copy-INvB4aQ, reason: not valid java name */
    public final KeyboardOptions m1344copyINvB4aQ(int i2, Boolean bool, int i3, int i4, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList) {
        return new KeyboardOptions(i2, bool, i3, i4, platformImeOptions, bool2, localeList, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: copy-INvB4aQ$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m1339copyINvB4aQ$default(KeyboardOptions keyboardOptions, int i2, boolean z2, int i3, int i4, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList, int i5, Object obj) {
        if ((1 & i5) != 0) {
            i2 = keyboardOptions.capitalization;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 2)) != 0) {
            z2 = keyboardOptions.getAutoCorrectOrDefault();
        }
        if ((-1) - (((-1) - i5) | ((-1) - 4)) != 0) {
            i3 = keyboardOptions.keyboardType;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 8)) != 0) {
            i4 = keyboardOptions.imeAction;
        }
        if ((16 & i5) != 0) {
            platformImeOptions = keyboardOptions.platformImeOptions;
        }
        if ((i5 + 32) - (32 | i5) != 0) {
            bool = Boolean.valueOf(keyboardOptions.getShowKeyboardOnFocusOrDefault$foundation_release());
        }
        if ((i5 + 64) - (i5 | 64) != 0) {
            localeList = keyboardOptions.hintLocales;
        }
        return keyboardOptions.m1345copyINvB4aQ(i2, z2, i3, i4, platformImeOptions, bool, localeList);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0013R\u00016\u0005yTlkLg\u000fX\u001akQk\\\"f\u000b}\u001aU\u000bO}x\u000e\t,g|\fxCXa{xG,r;'j[\\1jZ@hR\u0019 \rI I\u001f6D\u0003\u0005\r|<0P\u0010I", replaceWith = @ReplaceWith(expression = "copy(capitalization = capitalization, autoCorrectEnabled = autoCorrect, keyboardType = keyboardType, imeAction = imeAction,platformImeOptions = platformImeOptions, showKeyboardOnFocus = showKeyboardOnFocus ?: true,hintLocales = hintLocales)", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: copy-INvB4aQ, reason: not valid java name */
    public final /* synthetic */ KeyboardOptions m1345copyINvB4aQ(int i2, boolean z2, int i3, int i4, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList) {
        return new KeyboardOptions(i2, Boolean.valueOf(z2), i3, i4, platformImeOptions, bool, localeList, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: copy-ij11fho$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m1340copyij11fho$default(KeyboardOptions keyboardOptions, int i2, boolean z2, int i3, int i4, PlatformImeOptions platformImeOptions, int i5, Object obj) {
        if ((1 & i5) != 0) {
            i2 = keyboardOptions.capitalization;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 2)) != 0) {
            z2 = keyboardOptions.getAutoCorrectOrDefault();
        }
        if ((4 & i5) != 0) {
            i3 = keyboardOptions.keyboardType;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 8)) != 0) {
            i4 = keyboardOptions.imeAction;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 16)) != 0) {
            platformImeOptions = keyboardOptions.platformImeOptions;
        }
        return keyboardOptions.m1346copyij11fho(i2, z2, i3, i4, platformImeOptions);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0010G\u0005C\u0006u\u001ee]Kg\u0001_'kPeZ\n9\u001e(\u000fa\u0004Vo~Wv-rq`}")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: copy-ij11fho, reason: not valid java name */
    public final /* synthetic */ KeyboardOptions m1346copyij11fho(int i2, boolean z2, int i3, int i4, PlatformImeOptions platformImeOptions) {
        return new KeyboardOptions(i2, Boolean.valueOf(z2), i3, i4, platformImeOptions, this.showKeyboardOnFocus, this.hintLocales, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: copy-3m2b7yw$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m1337copy3m2b7yw$default(KeyboardOptions keyboardOptions, int i2, boolean z2, int i3, int i4, int i5, Object obj) {
        if ((1 & i5) != 0) {
            i2 = keyboardOptions.capitalization;
        }
        if ((2 & i5) != 0) {
            z2 = keyboardOptions.getAutoCorrectOrDefault();
        }
        if ((4 & i5) != 0) {
            i3 = keyboardOptions.keyboardType;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 8)) != 0) {
            i4 = keyboardOptions.imeAction;
        }
        return keyboardOptions.m1343copy3m2b7yw(i2, z2, i3, i4);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0013R\u00016\u0005yTlkLg\u000fX\u001ak\\acH*\u0014x%\u0012|[|mb}3t(`lCa\u001c|:Q#Fy!f`\u00031fIG%N@\u0013 M#V(_A\u0007a\u001c\u0004@+Y\u0011;m#\u001a|U\u0015S\u007fS{")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: copy-3m2b7yw, reason: not valid java name */
    public final /* synthetic */ KeyboardOptions m1343copy3m2b7yw(int i2, boolean z2, int i3, int i4) {
        return new KeyboardOptions(i2, Boolean.valueOf(z2), i3, i4, this.platformImeOptions, this.showKeyboardOnFocus, this.hintLocales, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyboardOptions)) {
            return false;
        }
        KeyboardOptions keyboardOptions = (KeyboardOptions) obj;
        return KeyboardCapitalization.m6324equalsimpl0(this.capitalization, keyboardOptions.capitalization) && Intrinsics.areEqual(this.autoCorrectEnabled, keyboardOptions.autoCorrectEnabled) && KeyboardType.m6341equalsimpl0(this.keyboardType, keyboardOptions.keyboardType) && ImeAction.m6288equalsimpl0(this.imeAction, keyboardOptions.imeAction) && Intrinsics.areEqual(this.platformImeOptions, keyboardOptions.platformImeOptions) && Intrinsics.areEqual(this.showKeyboardOnFocus, keyboardOptions.showKeyboardOnFocus) && Intrinsics.areEqual(this.hintLocales, keyboardOptions.hintLocales);
    }

    public int hashCode() {
        int iM6325hashCodeimpl = KeyboardCapitalization.m6325hashCodeimpl(this.capitalization) * 31;
        Boolean bool = this.autoCorrectEnabled;
        int iHashCode = (((((iM6325hashCodeimpl + (bool != null ? bool.hashCode() : 0)) * 31) + KeyboardType.m6342hashCodeimpl(this.keyboardType)) * 31) + ImeAction.m6289hashCodeimpl(this.imeAction)) * 31;
        PlatformImeOptions platformImeOptions = this.platformImeOptions;
        int iHashCode2 = (iHashCode + (platformImeOptions != null ? platformImeOptions.hashCode() : 0)) * 31;
        Boolean bool2 = this.showKeyboardOnFocus;
        int iHashCode3 = (iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        LocaleList localeList = this.hintLocales;
        return iHashCode3 + (localeList != null ? localeList.hashCode() : 0);
    }

    public String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) KeyboardCapitalization.m6326toStringimpl(this.capitalization)) + ", autoCorrectEnabled=" + this.autoCorrectEnabled + ", keyboardType=" + ((Object) KeyboardType.m6343toStringimpl(this.keyboardType)) + ", imeAction=" + ((Object) ImeAction.m6290toStringimpl(this.imeAction)) + ", platformImeOptions=" + this.platformImeOptions + "showKeyboardOnFocus=" + this.showKeyboardOnFocus + ", hintLocales=" + this.hintLocales + ')';
    }

    public final KeyboardOptions merge(KeyboardOptions keyboardOptions) {
        KeyboardOptions keyboardOptionsFillUnspecifiedValuesWith$foundation_release;
        return (keyboardOptions == null || (keyboardOptionsFillUnspecifiedValuesWith$foundation_release = keyboardOptions.fillUnspecifiedValuesWith$foundation_release(this)) == null) ? this : keyboardOptionsFillUnspecifiedValuesWith$foundation_release;
    }

    public final KeyboardOptions fillUnspecifiedValuesWith$foundation_release(KeyboardOptions keyboardOptions) {
        int iM6327unboximpl;
        int iM6344unboximpl;
        int iM6291unboximpl;
        if (keyboardOptions != null && !keyboardOptions.isCompletelyUnspecified() && !Intrinsics.areEqual(keyboardOptions, this)) {
            if (isCompletelyUnspecified()) {
                return keyboardOptions;
            }
            KeyboardCapitalization keyboardCapitalizationM6321boximpl = KeyboardCapitalization.m6321boximpl(this.capitalization);
            if (KeyboardCapitalization.m6324equalsimpl0(keyboardCapitalizationM6321boximpl.m6327unboximpl(), KeyboardCapitalization.Companion.m6336getUnspecifiedIUNYP9k())) {
                keyboardCapitalizationM6321boximpl = null;
            }
            if (keyboardCapitalizationM6321boximpl != null) {
                iM6327unboximpl = keyboardCapitalizationM6321boximpl.m6327unboximpl();
            } else {
                iM6327unboximpl = keyboardOptions.capitalization;
            }
            Boolean bool = this.autoCorrectEnabled;
            if (bool == null) {
                bool = keyboardOptions.autoCorrectEnabled;
            }
            KeyboardType keyboardTypeM6338boximpl = KeyboardType.m6338boximpl(this.keyboardType);
            if (KeyboardType.m6341equalsimpl0(keyboardTypeM6338boximpl.m6344unboximpl(), KeyboardType.Companion.m6363getUnspecifiedPjHm6EE())) {
                keyboardTypeM6338boximpl = null;
            }
            if (keyboardTypeM6338boximpl != null) {
                iM6344unboximpl = keyboardTypeM6338boximpl.m6344unboximpl();
            } else {
                iM6344unboximpl = keyboardOptions.keyboardType;
            }
            ImeAction imeActionM6285boximpl = ImeAction.m6285boximpl(this.imeAction);
            ImeAction imeAction = ImeAction.m6288equalsimpl0(imeActionM6285boximpl.m6291unboximpl(), ImeAction.Companion.m6309getUnspecifiedeUduSuo()) ? null : imeActionM6285boximpl;
            if (imeAction != null) {
                iM6291unboximpl = imeAction.m6291unboximpl();
            } else {
                iM6291unboximpl = keyboardOptions.imeAction;
            }
            PlatformImeOptions platformImeOptions = this.platformImeOptions;
            if (platformImeOptions == null) {
                platformImeOptions = keyboardOptions.platformImeOptions;
            }
            Boolean bool2 = this.showKeyboardOnFocus;
            if (bool2 == null) {
                bool2 = keyboardOptions.showKeyboardOnFocus;
            }
            LocaleList localeList = this.hintLocales;
            if (localeList == null) {
                localeList = keyboardOptions.hintLocales;
            }
            return new KeyboardOptions(iM6327unboximpl, bool, iM6344unboximpl, iM6291unboximpl, platformImeOptions, bool2, localeList, (DefaultConstructorMarker) null);
        }
        return this;
    }
}
