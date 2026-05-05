package androidx.compose.ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.compose.ui.graphics.vector.PathParser;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	... 4 more
    */
/* JADX INFO: compiled from: XmlVectorParser.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яn\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r(4\u0012}\u000bnjO0LeN2ZS8\u0018s{:$c$\u007fHC٥\"}8\tWNmlvJh\u0017K\u000f\f\u0016\u0001jBI]ތe\u0012%2JoU3UڎE9vt>\u0005&7*8\u0010\u0005\tɝ2H\u001e\n\u0003CQ\f\u001a0NpBR\u0013M\u000b܆\u0018\u001c̄P\u0001L[(cFLz]R/Q\u0004yHT'm2\u0015M;Iù+\r\u0005ef2NDM\u0015STIߞS$F\u0011M\n=3kmޗ,\u0012\u000feEp\u007fBƃ[U\u0013]\u0001&t\u0005\u007fa<-1OqMh\u000eVzAՏ\f\u0005\u0015\u001c\u0016?H\\>Jl\u0016 Kv\tRnOHߠCH\u0017oI/%.G[=){iai/~;\n\u001c%\u001eQ\u0004\u001f%il&`C/\u001d\u0014_Ji@k\\~\u000egR\u0006\u0004\u001fx2.\u0012G_\u007f]~A2%?O[g7i\b\u0010c\\g%\b\u0011la~jHn8\u001f\u001aEA!\f\tG\u0015\tyjlXZ\u0014\u0016Bb#\u0016\bA1\r{J6=\u0010|e\u0019mxju\nSM\u0017=_my-o9\r6eUq*yR%%\bjp%phXR:{\r,0G`j>\u000e,N\\.+8UpJW|1G\u0001EL\u0011;ZA+'\u0010`n\u000f\rsK$1ll+\u0017&h\\\u001f\u0016\u0018|WA\u0015`PCq[C;>[8gb s\u0007-\u00180Kui_L\u001b4&[\u0002\u001f$9QQ]@C\u0015\u0005(@\u001cEEzu.w[9?z+\u000e??vC\u007f\b\u0019\u0007\\dxggTE@'dx\"\u0016\u0004\u0018y\u0010I+Kqn#[l];)gdf8+\bO\"3\u0016\b\"+K]G5:.wBMEgch}M\u0012b=)%i\u0012F{\u0016\u001ee\u001as@dPKo}l@Tp\u0011W`j&\u001er\rB$KHog9]Fw#/,iMք\f9\u0001ie+o,J^c8 [}B\u0003s/\u001fokm\u0004ly\u007f[J=.;\u007f?\u001c*\u001ckN\u0007[p8H\u0006\"H~HI\u0014\u001d<7Bzˍ;P\u0019Q\u0007\u0002\u0006>.0JmC/2pv\u0002V^l\u0007^nH3c\u001cǾ-Ǆ\u0005\u000b\u0017ɼ6z;6\u0013sfV5j@\t$+\u0017$\u0003O-p[Ľ\u001bǶ;Ь,X\tՊ\u0016lQI\u001a62HԆqqwȯP\u001a\u0003(P$ð=\u0007"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_,WKFgCgpq`F\u0011g+?v%VV[\u0017X_\u0001=!g", "", "Fl[\u001dT9LS&", "\u001ana4\"?FZ$\u000f\u0002eu\u000eTxX\b/fP\b\u001e\u0002C|\u001c<\u0004z", "1n]3\\.", "", "uK^?ZuQ[ \n\u000be3F\u001az/r0\u0003+\u0011\u001e\u001e2k\u001bJv2\u000b=A\u0011", "5dc\u0010b5?W\u001b", "u(8", "Adc\u0010b5?W\u001b", "uH\u0018#", ">`c5C(Ka\u0019\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>V0+#hn\u000f", "5dc%`3)O&\rzk", "u(;<e.\bf!\u0006\u0006n3\u0004R@1I\u001b\u0004Gk'\u001eNZ\nI\u0005%B/", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "5dc\u0011\\4>\\'\u0003\u0005g", "", "Bx_2W\bK`\u0015\u0013", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\no+\"GniI\u0004!I/", "7mS2k", "2dU#T3NS", "5dc\u0013_6:b", "2dU.h3MD\u0015\u0006\u000b^", "5dc\u0016a;", "5dc\u001bT4>Ru\t\u0005e,x\u0012", "/sc?A(FS", "", "@db\u0016W", "5dc\u001bT4>Rv\t\u0002h9j\u0018+t\u007f\u000f\u007fN\u0010", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\n^!\u001eQ|{Kr45@\u0002.FC", "BgT:X", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\nm\u0017%Q\u007f\u001b:v3sH\u0001 ?mk", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\nm\u0017%Q\u007f\u001b:v3\u000b", "5dc\u001bT4>Rv\t\u0003i3|\u001c\ro\u00072\t", "\u001a`]1e6BR,Hxh9|R-o\t7{I\u0010`$G}W\u001a\u0001-@`}3\u0015w\u001d8Z!Es?\u001a$>", "5dc\u001bT4>Ry\u0006\u0005Z;", "5dc\u001bT4>R|\b\n", "5dc g9B\\\u001b", "6`b566=S", "=ac.\\5\u001ab(\f~[<\f\t=", "@db", "Adc", "\u001a`]1e6BRb\u000f\nb3Fd>t\r,xP\u0010\u0017\u0005G~c", "/sc?f", "", "BnBAe0GU", "CoS.g,\u001c]\"\u007f~`", "", "@db\u0010b5?W\u001b", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidVectorParser {
    public static final int $stable = 8;
    private int config;
    public final PathParser pathParser;
    private final XmlPullParser xmlParser;

    public static /* synthetic */ AndroidVectorParser copy$default(AndroidVectorParser androidVectorParser, XmlPullParser xmlPullParser, int i2, int i3, Object obj) {
        if ((i3 + 1) - (1 | i3) != 0) {
            xmlPullParser = androidVectorParser.xmlParser;
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            i2 = androidVectorParser.config;
        }
        return androidVectorParser.copy(xmlPullParser, i2);
    }

    public final XmlPullParser component1() {
        return this.xmlParser;
    }

    public final int component2() {
        return this.config;
    }

    public final AndroidVectorParser copy(XmlPullParser xmlPullParser, int i2) {
        return new AndroidVectorParser(xmlPullParser, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidVectorParser)) {
            return false;
        }
        AndroidVectorParser androidVectorParser = (AndroidVectorParser) obj;
        return Intrinsics.areEqual(this.xmlParser, androidVectorParser.xmlParser) && this.config == androidVectorParser.config;
    }

    public int hashCode() {
        return (this.xmlParser.hashCode() * 31) + Integer.hashCode(this.config);
    }

    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.xmlParser + ", config=" + this.config + ')';
    }

    public AndroidVectorParser(XmlPullParser xmlPullParser, int i2) {
        this.xmlParser = xmlPullParser;
        this.config = i2;
        this.pathParser = new PathParser();
    }

    public /* synthetic */ AndroidVectorParser(XmlPullParser xmlPullParser, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(xmlPullParser, (-1) - (((-1) - i3) | ((-1) - 2)) != 0 ? 0 : i2);
    }

    public final XmlPullParser getXmlParser() {
        return this.xmlParser;
    }

    public final int getConfig() {
        return this.config;
    }

    public final void setConfig(int i2) {
        this.config = i2;
    }

    private final void updateConfig(int i2) {
        this.config = i2 | this.config;
    }

    public final TypedArray obtainAttributes(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        TypedArray typedArrayObtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, iArr);
        updateConfig(typedArrayObtainAttributes.getChangingConfigurations());
        return typedArrayObtainAttributes;
    }

    public final int getNamedInt(TypedArray typedArray, String str, int i2, int i3) {
        int namedInt = TypedArrayUtils.getNamedInt(typedArray, this.xmlParser, str, i2, i3);
        updateConfig(typedArray.getChangingConfigurations());
        return namedInt;
    }

    public final float getNamedFloat(TypedArray typedArray, String str, int i2, float f2) {
        float namedFloat = TypedArrayUtils.getNamedFloat(typedArray, this.xmlParser, str, i2, f2);
        updateConfig(typedArray.getChangingConfigurations());
        return namedFloat;
    }

    public final boolean getNamedBoolean(TypedArray typedArray, String str, int i2, boolean z2) {
        boolean namedBoolean = TypedArrayUtils.getNamedBoolean(typedArray, this.xmlParser, str, i2, z2);
        updateConfig(typedArray.getChangingConfigurations());
        return namedBoolean;
    }

    public final float getFloat(TypedArray typedArray, int i2, float f2) {
        float f3 = typedArray.getFloat(i2, f2);
        updateConfig(typedArray.getChangingConfigurations());
        return f3;
    }

    public final int getInt(TypedArray typedArray, int i2, int i3) {
        int i4 = typedArray.getInt(i2, i3);
        updateConfig(typedArray.getChangingConfigurations());
        return i4;
    }

    public final String getString(TypedArray typedArray, int i2) {
        String string = typedArray.getString(i2);
        updateConfig(typedArray.getChangingConfigurations());
        return string;
    }

    public final float getDimension(TypedArray typedArray, int i2, float f2) {
        float dimension = typedArray.getDimension(i2, f2);
        updateConfig(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final ComplexColorCompat getNamedComplexColor(TypedArray typedArray, Resources.Theme theme, String str, int i2, int i3) {
        ComplexColorCompat namedComplexColor = TypedArrayUtils.getNamedComplexColor(typedArray, this.xmlParser, theme, str, i2, i3);
        updateConfig(typedArray.getChangingConfigurations());
        return namedComplexColor;
    }

    public final ColorStateList getNamedColorStateList(TypedArray typedArray, Resources.Theme theme, String str, int i2) {
        ColorStateList namedColorStateList = TypedArrayUtils.getNamedColorStateList(typedArray, this.xmlParser, theme, str, i2);
        updateConfig(typedArray.getChangingConfigurations());
        return namedColorStateList;
    }
}
