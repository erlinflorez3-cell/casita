package com.facebook.react.views.text.internal.span;

import android.content.res.AssetManager;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.facebook.react.views.text.ReactTypefaceUtils;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<H\u0007\"2\u0012\u007f\u0007tvA0JeP.hS2\u000fq\u0004<$i$yّCU0}*\tUP}˧\rb\u000b\u000bq\u000e6\u0016'jdHm9\r\"\u0013@C\b?aO\u007fAGc\r63\"B(F}\u001d\u00030)v\u0015\u0007\u0001QQ$\u0014F?\u001f?b\u0011[\f2\u00124Fŋ\u0005\u001ejp\u0017DV~u:]63mPb?_^\u0012\u0014!\u000fb5#\u000faL>p;C,=S1\u001c\u0019o\u0010\u000fMxU\u0005\u0017/}ǥKָ[6`Üd&9U%_\t%\u000b\nŌd\u0012/˃geQZ\u001c3H\f\n\u0011T\u0006$\u0005UMͶ1 nڜ&5z~aK!\u000elC\u0018z\u00108mӞ\u0002Ĵ/9#Ƙ\"mI\u001cf7*\u0007c̗%ъr!c٪^o#(lw\u007f3\b\u0005ףLR\"[C{\u0012\u007f3\u00118\u0014HG.12Uѧ\u001b)O]?4/zɞL]"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001d<\n4~]\u0007/7z\u001f*T\rIv0'^FqG\u0016m4<\u0006;NL<7X[H", "\u001a`]1e6BRb\u000ezq;F\u0017>y\u0007(E(\u0001&$Kmi=w%3h\u0002)9[!*V\u0019", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001d<\n4~]\u0007/7z\u001f*T\rIv0'^Ua5\u0005r\u001aYr0\u001d", ">qXCT;>A(\u0013\u0002^", "", ">qXCT;>E\u0019\u0003|a;", "4n]A9,:b)\fzL,\f\u00183n\u00026", "", "4n]A9(FW \u0013", "/rb2g\u0014:\\\u0015\u0001zk", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\n\\%%G~u8\u007f!7Y\u000bu", "uH8\u0019](OOb\u0006vg.Fv>r\u00041}\u0016g\u001c\u0013XkWCr.7#k/Dq\u001f0#*7t3+\u001fl`\u0003\u0005m5]v0V\u0016[,j\u001cNK\"\u0012iuJ4\t\u0007YNy25", "5dc\u0013b5M4\u0015\u0007~e@", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0013b5M4\u0019z\nn9|v/t\u000f,\u0005B\u000f", "Ash9X", "5dc g@ES", "u(8", "EdX4[;", "5dc$X0@V(", "CoS.g,\u001d`\u0015\u0011hm(\f\t", "", "2r", "\u001a`]1e6BRb\u000ezq;Fw/x\u000f\u0013wD\n&l", "CoS.g,&S\u0015\r\u000bk,j\u0018+t\u007f", ">`X;g", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class CustomStyleSpan extends MetricAffectingSpan implements ReactSpan {
    public static final Companion Companion = new Companion(null);
    private final AssetManager assetManager;
    private final String fontFamily;
    private final String fontFeatureSettings;
    private final int privateStyle;
    private final int privateWeight;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjG6LeN.ZS8\u001bs{:$c$\bCC٥ ԉ#\u001fѧ~g\u0016m\u000b_\u0011CǇ\n\u0016\u0007jt\u0004cyu\u0012=4rsM6eok=\u0011xD\n82P>*\t\u000f!BH>|+IY\u0014*2Voh[=S\u0013$*\bT\u001f/'\rk\\A`l\fFu#ɮmO"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001d<\n4~]\u0007/7z\u001f*T\rIv0'^FqG\u0016m4<\u0006;NL<7X[1\u001b\u001e\u001ae\nW/\u0017\u000e/", "", "u(E", "/o_9l", "", ">`X;g", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wD\n&l", "Ash9X", "", "EdX4[;", "4n]A9,:b)\fzL,\f\u00183n\u00026f<\u000e\u0013\u001f", "", "4`\\6_@", "/rb2g\u0014:\\\u0015\u0001zk", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\n\\%%G~u8\u007f!7Y\u000bu", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void apply(Paint paint, int i2, int i3, String str, String str2, AssetManager assetManager) {
            Typeface typefaceApplyStyles = ReactTypefaceUtils.applyStyles(paint.getTypeface(), i2, i3, str2, assetManager);
            Intrinsics.checkNotNullExpressionValue(typefaceApplyStyles, "applyStyles(...)");
            paint.setFontFeatureSettings(str);
            paint.setTypeface(typefaceApplyStyles);
            paint.setSubpixelText(true);
        }
    }

    public CustomStyleSpan(int i2, int i3, String str, String str2, AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        this.privateStyle = i2;
        this.privateWeight = i3;
        this.fontFeatureSettings = str;
        this.fontFamily = str2;
        this.assetManager = assetManager;
    }

    public final String getFontFamily() {
        return this.fontFamily;
    }

    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    public final int getStyle() {
        int i2 = this.privateStyle;
        if (i2 == -1) {
            return 0;
        }
        return i2;
    }

    public final int getWeight() {
        int i2 = this.privateWeight;
        if (i2 == -1) {
            return 400;
        }
        return i2;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        Companion.apply(ds, this.privateStyle, this.privateWeight, this.fontFeatureSettings, this.fontFamily, this.assetManager);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Companion.apply(paint, this.privateStyle, this.privateWeight, this.fontFeatureSettings, this.fontFamily, this.assetManager);
    }
}
