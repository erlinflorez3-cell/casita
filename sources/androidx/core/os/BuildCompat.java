package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.exifinterface.media.ExifInterface;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.JvmStatic;
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
/* JADX INFO: compiled from: BuildCompat.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005$4\u0012\u0006\u0010nj?5LeV:ZS0\u0018qۛ4:ӋTqq:\u000e\u001a\u0016;ITTg̊rJh\u000b\f\u0015\u0014\u001c\u0011jZP\u001c}&\u0018\u001d:Zom:\u0014t\u0006?n}N\u0005N9h=B\u000b\u000f$BH>}AH\u0014\u0012 ;XphYSRM  \u0012V /%#l\u0017LVyu:]*3mP\\?_^\f}\u0011Td?\r%pd0\t=C&=S1\u000e\u0019`\b\tM\u0004U\u0005\u0017.m0\u0012yeIp\u007fB\u001cqTUc\u0001:t\u0005\u007fgR,sUq`h\u000eV~A\u0001UB\u0012$\u001e'v5s\u001f/\u000e\u001cJ\rr\u0002G\u0017\u0007/P\u000e{y6E'67\u0002ݕ\u001dƻUaCϊ\u001fE\n\b%\u001eQ\u0003%%2ٲ\u0010\u05ce\u0019\u001b\\ȭ\"?_DUH|\f\u0010ADՖrĊ\u0006*\f\u0382\u0018\u000e=\u0001).E'm_\u0010\u0602#Ƞ\u0006HLϙС\tz"}, d2 = {"\u001a`]1e6BR,Hxh9|R9sI\u0005\fD\b\u0016tQw\u00198\u0006z", "", "u(E", "\u000fCN 8\u0019/7v^hX\fow\u000fNm\fe)zz\u007f6", "", " ^4%G\f'A|hcX\u0010ew", "!^4%G\f'A|hcX\u0010ew", "\"^4%G\f'A|hcX\u0010ew", "7r0A?,:a([", "", "7r0A?,:a(g", "7r0A?,:a(gbKw", "7r0A?,:a(h", "7r0A?,:a(hbKw", "7r0A?,:a(i", "7r0A?,:a(i\b^\u0019|\u0010/a\u000e(YJ\u007f\u0017 Cw\u000e", "1nS2a(FS", "", "0tX9W\nHR\u0019\bvf,", "7r0A?,:a(j", "7r0A?,:a(k", "7r0A?,:a(l", "7r0A?,:a(l\f+", "7r0A?,:a(m", "7r0A?,:a(n", "7r0A?,:a(o", "\u000foX\u007f#\u0010F^ ", "\u001eqT?X3>O'~h]2Z\f/c\u0006", "1na2R9>Z\u0019z\t^"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BuildCompat {
    public static final int AD_SERVICES_EXTENSION_INT;
    public static final BuildCompat INSTANCE = new BuildCompat();
    public static final int R_EXTENSION_INT;
    public static final int S_EXTENSION_INT;
    public static final int T_EXTENSION_INT;

    /* JADX INFO: compiled from: BuildCompat.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d<K!&i\u000e]LшzĸA\u001cֶ;.p}bܥ\u0082{\u0007"}, d2 = {"\u001a`]1e6BR,Hxh9|R9sI\u0005\fD\b\u0016tQw\u00198\u0006c f}-7t\u0016*[C)j:{\u0018h_?\\", "", "1na2R9>Z\u0019z\t^"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @Retention(RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(AnnotationRetention.BINARY)
    public @interface PrereleaseSdkCheck {
    }

    @Deprecated(message = "\u0004T\u007fG\u0001}\u0019\u0017F\u00071\u000e\u0010\u0016kTeZ\n3\u000e\u0003\u0011V6XsvSu7k(MrF\rppBY]@?&^[}aa[zsMs\u001e\u001bU\u001bI-6B\u0007u\u0011\u0003J\u001d]\u0017I\u001d\u000b\u001c;_\u0019K\u0007\u00010-petHb2s\u007f_~0\u0004\u0011e\u00050) KWQ2$J<f\u000e\u001cePA\u0016qS:/\u000fE;p7aE1MDl=w\u007f\u001dE[#I45\u007fw|6\u0012\u007fP\"vpMb=HO\u001cYaLvi\u0001\u001c\\\u000e@Q(-\"\u001c\u0015", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 24", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final boolean isAtLeastN() {
        return true;
    }

    @Deprecated(message = "\u0004T\u007fG\u0001}\u0019\u0017F\u0007\u0015l!T5a\u001cMH-\u000ev\r^\u007f`sn\u000e\u0007)rmMwG\r]v=\u00062;C%\u0016Y~6`W?%GGQ\u001aVSP*\u0005;\u0007\u0005K}<\u001fP\u0011\u000f^4!I\bxS:X74=\u0013q@\u0013.s\t/\f'HO/\rZ\u0016J?g&51Cvw\u007f#+BN[\u001dZ7[cA;\u0002dl<\u001a\u0012\u0006\u0016H2+\u0001Rjk\u000f &Fw\u0012g\u00026D\u007f>\u0004tt\u0018UE ~WWy8\u000b\u0012SMKb\\\u001b,x\u00078\u001e\u0019(", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 25", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final boolean isAtLeastNMR1() {
        return true;
    }

    @Deprecated(message = "\u0004T\u007fG\u0001}\u0019\u0017G\u00071\u000e\u0010\u0016kTeZ\n3\u000e\u0003\u0011V6XsvSu7k(MrF\rppBY]@?&^[}aa[zsMs\u001e\u001bU\u001bI-6B\u0007u\u0011\u0003J\u001d]\u0017I\u001d\u000b\u001c;_\u0019K\u0007\u00010-petHb2s\u007f_~0\u0004\u0011e\u00050) KWQ2$J<f\u000e\u001cePA\u0016qS:/\u000fE;p7aE1MDl=w\u007f\u001dE[\u0017\u001f2':8^i\u0006\u0003Hk\u001f_Zc3NN{~RS\u000bS\u0006\"(,?4:1Ni", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 26", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final boolean isAtLeastO() {
        return true;
    }

    private BuildCompat() {
    }

    private static final Integer isAtLeastPreReleaseCodename$codenameToInt(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return Intrinsics.areEqual(upperCase, "BAKLAVA") ? 0 : null;
    }

    @JvmStatic
    public static final boolean isAtLeastPreReleaseCodename(String codename, String buildCodename) {
        Intrinsics.checkNotNullParameter(codename, "codename");
        Intrinsics.checkNotNullParameter(buildCodename, "buildCodename");
        if (Intrinsics.areEqual("REL", buildCodename)) {
            return false;
        }
        Integer numIsAtLeastPreReleaseCodename$codenameToInt = isAtLeastPreReleaseCodename$codenameToInt(buildCodename);
        Integer numIsAtLeastPreReleaseCodename$codenameToInt2 = isAtLeastPreReleaseCodename$codenameToInt(codename);
        if (numIsAtLeastPreReleaseCodename$codenameToInt != null && numIsAtLeastPreReleaseCodename$codenameToInt2 != null) {
            return numIsAtLeastPreReleaseCodename$codenameToInt.intValue() >= numIsAtLeastPreReleaseCodename$codenameToInt2.intValue();
        }
        if (numIsAtLeastPreReleaseCodename$codenameToInt != null || numIsAtLeastPreReleaseCodename$codenameToInt2 != null) {
            return numIsAtLeastPreReleaseCodename$codenameToInt != null;
        }
        String upperCase = buildCodename.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = codename.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    @Deprecated(message = "\u0004T\u007fG\u0001}\u0019\u0017G\u0007\u0015l!T5a\u001cMH-\u000ev\r^\u007f`sn\u000e\u0007)rmMwG\r]v=\u00062;C%\u0016Y~6`W?%GGQ\u001aVSP*\u0005;\u0007\u0005K}<\u001fP\u0011\u000f^4!I\bxS:X74=\u0013q@\u0013.s\t/\f'HO/\rZ\u0016J?g&51Cvw\u007f#+BN[\u001dZ7[cA;\u0002dl<\u001a\u0012\u0006\u0016H2+\u0001Rjk\u000f &Fw\u0012g\u00026D\u007f>\u0004tt\u0018UE ~WWy8\u000b\u0012SMKb\\\u001b,x\u00078 \u0019(", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 27", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final boolean isAtLeastOMR1() {
        return Build.VERSION.SDK_INT >= 27;
    }

    @Deprecated(message = "\u0004T\u007fG\u0001}\u0019\u0017H\u00071\u000e\u0010\u0016kTeZ\n3\u000e\u0003\u0011V6XsvSu7k(MrF\rppBY]@?&^[}aa[zsMs\u001e\u001bU\u001bI-6B\u0007u\u0011\u0003J\u001d]\u0017I\u001d\u000b\u001c;_\u0019K\u0007\u00010-petHb2s\u007f_~0\u0004\u0011e\u00050) KWQ2$J<f\u000e\u001cePA\u0016qS:/\u000fE;p7aE1MDl=w\u007f\u001dE[#I45\u007fw|6\u0012\u007fP\"vpMb=HO\u001cYaLvi\u0001\u001c\\\u000e@Q(-&\u001c\u0015", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 28", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final boolean isAtLeastP() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @Deprecated(message = "\u0004T\u007fG\u0001}\u0019\u0017I\u00071\u000e\u0010\u0016kTeZ\n3\u000e\u0003\u0011V6XsvSu7k(MrF\rppBY]@?&^[}aa[zsMs\u001e\u001bU\u001bI-6B\u0007u\u0011\u0003J\u001d]\u0017I\u001d\u000b\u001c;_\u0019K\u0007\u00010-petHb2s\u007f_~0\u0004\u0011e\u00050) KWQ2$J<f\u000e\u001cePA\u0016qS:/\u000fE;p7aE1MDl=w\u007f\u001dE[#I45\u007fw|6\u0012\u007fP\"vpMb=HO\u001cYaLvi\u0001\u001c\\\u000e@Q(-'\u001c\u0015", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 29", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final boolean isAtLeastQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @Deprecated(message = "\u0004T\u007fG\u0001}\u0019\u0017J\u00071\u000e\u0010\u0016kTeZ\n3\u000e\u0003\u0011V6XsvSu7k(MrF\rppBY]@?&^[}aa[zsMs\u001e\u001bU\u001bI-6B\u0007u\u0011\u0003J\u001d]\u0017I\u001d\u000b\u001c;_\u0019K\u0007\u00010-petHb2s\u007f_~0\u0004\u0011e\u00050) KWQ2$J<f\u000e\u001cePA\u0016qS:/\u000fE;p7aE1MDl=w\u007f\u001dE[#I45\u007fw|6\u0012\u007fP\"vpMb=HO\u001cYaLvi\u0001\u001c\\\u000e@Q(.\u001e\u001c\u0015", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 30", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final boolean isAtLeastR() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @Deprecated(message = "\u0004T\u007fG\u0001}\u0019\u0017K\u00071\u000e\u0010\u0016kTeZ\n3\u000e\u0003\u0011V6XsvSu7k(MrF\rppBY]@?&^[}aa[zsMs\u001e\u001bU\u001bI-6B\u0007u\u0011\u0003J\u001d]\u0017I\u001d\u000b\u001c;_\u0019K\u0007\u00010-petHb2s\u007f_~0\u0004\u0011e\u00050) KWQ2$J<f\u000e\u001cePA\u0016qS:/\u000fE;p7aE1MDl=w\u007f\u001dE[#I45\u007fw|6\u0012\u007fP\"vpMb=HO\u001cYaLvi\u0001\u001c\\\u000e@Q(.\u001f\u001c\u0015", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 31", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final boolean isAtLeastS() {
        if (Build.VERSION.SDK_INT < 31) {
            if (Build.VERSION.SDK_INT >= 30) {
                String CODENAME = Build.VERSION.CODENAME;
                Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
                if (isAtLeastPreReleaseCodename(ExifInterface.LATITUDE_SOUTH, CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }

    @Deprecated(message = "\u0004T\u007fG\u0001}\u0019\u0017K]y:Y(kO\u001cR\u00125\u0006t\u0015l{J.|S\u0001)g{Q$C[`(MN'Fy\u001f[`\u00021\\\bDx}B!KS#R\"{FA\u0001\u0011r</^~\u000evoGd\\OV\u0004M:g3X/MX)}\u0012%yaM\u001ee\u007fZ\u001b Mg$%^P<q\u007f\u00189Fzec\u000bE$XLqz.bE\u0019\u0012\u001eQnMy+X\\X\u000eja\u0010K\u0002\u0014|XY'5~6f/QS\u0017z\\6~N\u0003-Q<V4F8\u000en\u0019f\u0017", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 32", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final boolean isAtLeastSv2() {
        if (Build.VERSION.SDK_INT < 32) {
            if (Build.VERSION.SDK_INT >= 31) {
                String CODENAME = Build.VERSION.CODENAME;
                Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
                if (isAtLeastPreReleaseCodename("Sv2", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }

    @Deprecated(message = "\u0004T\u007fG\u0001}\u0019\u0017LP:{]\u001e?c\u001cU\u001cf\u0006(\u0012[\u0005Gzshy(&zQpGNomxG,7y&^U\raeMOmM8Q\u0015ZSR*6@\u0011\u0001\u0013tI[Y\u0003~b5\u001b|Z)\r:*BgH\\{G\u0013\u001es;2z/S&+\u0003Z\u001e\u0019xSQ&4RLw\u007fV8FG[^^6[^?q\u0003-iFW\f\u000e\u0006Ae}1\u0012\u0017@\u001826\u007f9\u0001 <\fW#hzJ\u0006Skd{\u0002SZ~S\u0007\u001c6AF_gD<\u0010\u0007D&X-z\u001f.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 33", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final boolean isAtLeastT() {
        if (Build.VERSION.SDK_INT < 33) {
            if (Build.VERSION.SDK_INT >= 32) {
                String CODENAME = Build.VERSION.CODENAME;
                Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
                if (isAtLeastPreReleaseCodename("Tiramisu", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }

    @Deprecated(message = "\u0004T\u007fG\u0001}\u0019\u0017MW;\u0004T\u001a\u0010]sZk(\u0018mK[\n\u0006o*T}2gtU~GQ\u001cz>R#4M\u0017\u0016M\b&\u0018\\CnQs\u001f\u0011[\u001cS\u001f6=\u00152\u001a~v(Z\f\u0003b4G\nM\u0013D\u000eT/:J!/$g[\u0006\u0005,\u0002aF\u0015e\u0011 \"\u001aOW\u0016_(Lvf:\u001d;UPhb\u000bC![>3\u0002* B\u001e?\u0019\f8w+$MYi\u000b1;Hweb\u0010\u000bI\u001f-F(\u0006]d .m\u0004q\u0018ne$M@U]WI\u001c\u000f+QH\u0002H\u001c^>\"v^\u00151\u0016", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 34", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final boolean isAtLeastU() {
        if (Build.VERSION.SDK_INT < 34) {
            if (Build.VERSION.SDK_INT >= 33) {
                String CODENAME = Build.VERSION.CODENAME;
                Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
                if (isAtLeastPreReleaseCodename("UpsideDownCake", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }

    @Deprecated(message = "\u0004T\u007fG\u0001}\u0019\u0017NH6\u0004\\!-7_Qk9\ni\u0019\u0012\u007fY.k\u000ez-tiXm\\R`(KK*8;%[\fz0\\\bOmGGQ\u0019L(L*zs\u000b\u0006K}F[W\r\nd'\u001a;V\u0015B\u007fTA)Cl=z<0.\u0013)\u0002.\u0004\u0012+>-\u001a\u0018Hh\u0017$^GE%{V,VOkoPp.TE7o8er'\u0006D\u00187m~WP`Y\u001c 4\u0014\u0006<=\u000b\nX#*~40_rem\fP}\u0015v\u001c{^3TgQJ<i:J4\u0018C\u0016\u0013 #\u0014K\u0014\u0006H\u001a", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 35", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final boolean isAtLeastV() {
        if (Build.VERSION.SDK_INT < 35) {
            if (Build.VERSION.SDK_INT >= 34) {
                String CODENAME = Build.VERSION.CODENAME;
                Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
                if (isAtLeastPreReleaseCodename("VanillaIceCream", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }

    @JvmStatic
    public static final boolean isAtLeastB() {
        if (Build.VERSION.SDK_INT < 36) {
            if (Build.VERSION.SDK_INT >= 35) {
                String CODENAME = Build.VERSION.CODENAME;
                Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
                if (isAtLeastPreReleaseCodename("Baklava", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        R_EXTENSION_INT = Build.VERSION.SDK_INT >= 30 ? Api30Impl.INSTANCE.getExtensionVersion(30) : 0;
        S_EXTENSION_INT = Build.VERSION.SDK_INT >= 30 ? Api30Impl.INSTANCE.getExtensionVersion(31) : 0;
        T_EXTENSION_INT = Build.VERSION.SDK_INT >= 30 ? Api30Impl.INSTANCE.getExtensionVersion(33) : 0;
        AD_SERVICES_EXTENSION_INT = Build.VERSION.SDK_INT >= 30 ? Api30Impl.INSTANCE.getExtensionVersion(1000000) : 0;
    }

    /* JADX INFO: compiled from: BuildCompat.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005\"2\u009dw\u001d߿\u001b9^C&M4Rޚ.\u000fy{|0i%\nCiWJ\u00020\fgN\u0016iĚN^"}, d2 = {"\u001a`]1e6BR,Hxh9|R9sI\u0005\fD\b\u0016tQw\u00198\u0006c\u0011d\u0002m\u0002Q\u001e9T\u0019", "", "u(E", "5dc\u0012k;>\\'\u0003\u0005g\u001d|\u0016=i\n1", "", "3wc2a:B]\"", "1na2R9>Z\u0019z\t^"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class Api30Impl {
        public static final Api30Impl INSTANCE = new Api30Impl();

        private Api30Impl() {
        }

        public final int getExtensionVersion(int i2) {
            return SdkExtensions.getExtensionVersion(i2);
        }
    }
}
