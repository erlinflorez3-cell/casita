package com.facebook.react.common.assets;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Build;
import android.util.SparseArray;
import androidx.core.content.res.ResourcesCompat;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
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
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u000eӵLcz\u0004I\u0006>.6B\r.4\u0012\u000e\u0007nʑA0ZeP\u008cZS8\u000fsڔ<$q$yCAU\"}0\u000fWNmivJp\u000bKƤ\u000e\u0016\u000fj4I[ye\u0012\u001d;JoE7cڎ[U\u0011td\u0004X3=T\u0017E\u0004ʀ.H\u001evC_Y\u0013*0nxjV\u001bV\u001d\u001a@\u0010n$\u000f)tg|9xpkFG#1v\u000bd5fH|{\u0015vX5\u0018\u000faL.p=C#=U\u0019\u0006\u0001_\b!M\u0001U\u0005\u0017+W/W\u0004o6\u0007\u0003D\u00199`%]!8\r\u000b_s$)AN\u0012_\u0019,6\u0007\u0013{;@4\u0012\u00147`.[\u001d\u0017\f\u001cH\rr\u0002M\u0001\blU\u0018|w5E9HY9H3f\u007fek\u001d\\G\u0014\u0005;!S\u0005|7sT<mE\u001fb\u000fi1\u007fXmN\\\u001dq?\u0004\u0003\u001fvJP\u0012?_\u007f]\u007fA2%5O[g&Qo\u0010]\\g%\u0012\u0011la\u007fjHn/\u001f\u001cE=!\u000epC\u0013\u00194nbqD\u0011{$\u0005\u000b\f\u0018+ \u000bzl%3%fO\u0017v\u001bSk$=1|6\br<&e:v?ESs\u0010\u0010U\u0007\u0016O<\u0011\t\u0007h\u0019Ͱ\u000eȺ`(*õ\u0019\u0003\u001e|\u0014P^\u000e#2mt,6<1GbCJYٟD˩\u0001\tgʳӹ\u0014\u001d"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxW8\u000535h\fi$m\u0012,\\$EtC\u0006\u0011q];\u0007p\u0002", "", "u(E", "1tbAb4-g$~{Z*|f+c\u0003(", "", "", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0017\u0010K\u0001\u0018\u0013Eoc", "4n]A6(<V\u0019", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxW8\u000535h\fi$m\u0012,\\$EtC\u0006\u0011q];\u0007pj*\u00055G[/6eaS9\u001c\u0016a\"$", "/cS\u0010h:M]!_\u0005g;", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "4n]A9(FW \u0013", "4n]A<+", "", "4n]A", "5dc!l7>T\u0015|z", "4n]A9(FW \u0013cZ4|", "Bx_2Y(<S\u0007\u000e\u000fe,", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxW8\u000535h\fi$m\u0012,\\$EtC\u0006\u0011q];\u0007pj=\u000b2GMJ*\\@\u0002Q\u001b\u00120", "/rb2g\u0014:\\\u0015\u0001zk", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\n\\%%G~u8\u007f!7Y\u000bu", "Ash9X", "EdX4[;", "7sP9\\*", "", "Adc!l7>T\u0015|z", "Bx_2Y(<S", "\u000frb2g\rH\\(_vf0\u0004\u001d", "\u0011n\\=T5B]\"", "\"x_2Y(<S\u0007\u000e\u000fe,", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ReactFontManager {
    private static final String FONTS_ASSET_PATH = "fonts/";
    public static final Companion Companion = new Companion(null);
    private static final String[] EXTENSIONS = {"", "_bold", "_italic", "_bold_italic"};
    private static final String[] FILE_EXTENSIONS = {".ttf", ".otf"};
    private static final ReactFontManager _instance = new ReactFontManager();
    private final Map<String, AssetFontFamily> fontCache = new LinkedHashMap();
    private final Map<String, Typeface> customTypefaceCache = new LinkedHashMap();

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\u0007njG6L͜P.`S2\u000fq{:$qҕ\"CiTZ\u0001̀\rO\\g0|X^#E%\u0005D{\u001b0WZ\u0011]@\u0015zX}FKM\u001eEid\u0003;\u001d `(h\u007f\u0013\n2,^\u000f%}\u0014_\u001a\u0013HH\u0001>b\u000fc\u0004H\u00154@vҸ ֔kN>ԟǶaD"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxW8\u000535h\fi$m\u0012,\\$EtC\u0006\u0011q];\u0007pj*\u00055G[/6eaS9\u001c\u0016a\"$", "", "u(E", "Bx_2Y(<S\u0007\nvk:|d<r{<", "\u001a`]1e6BRb\u000f\nb3Fv:a\r6{\u001c\u000e$\u0013[E", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0017\u0010K\u0001\u0018\u0013Eoc", "5dc!l7>T\u0015|z?6\nv>y\u0007(", "Ash9X", "", "Adc!l7>T\u0015|z?6\nv>y\u0007(", "", "Bx_2Y(<S", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class AssetFontFamily {
        private final SparseArray<Typeface> typefaceSparseArray = new SparseArray<>(4);

        public final Typeface getTypefaceForStyle(int i2) {
            return this.typefaceSparseArray.get(i2);
        }

        public final void setTypefaceForStyle(int i2, Typeface typeface) {
            this.typefaceSparseArray.put(i2, typeface);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u001a6B\r.4\u0012}\tnjO0L͜P.hS2\u000fq{<$i*yّCU0}*\tUNmˮo`ҙ;C=\u0005V}p,֒Yxk\u0012WRPxW3{ym=n\u007fN\u0005N5R<\b\u0011\u0019\u001aXU@|\tQc\u000e(/n\u007f\u0001RUS\u0013**\u0006l(G#-{\\7`rm<?#1lpP}ۂ2ƊQ\u000fNT5\u0011Gu,0X=E\u00175S1\n\u0001]\u0016ŤAџA\u0007p'5/\u001a\u007fe<p\u007fB\u0018\u0002̀_ǁv&dӤ\"l\u001a.CO\u0012S'ʮ*Þ~{\u0015ɝǲ\u0012\u0017"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxW8\u000535h\fi$m\u0012,\\$EtC\u0006\u0011q];\u0007pj,\u0001/RHW0f[H", "", "u(E", "\u0013WC\u0012A\u001a\"=\u0002l", "", "", ")KY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}", "\u0014H;\u0012R\f1BxghB\u0016ev", "\u0014N=!F&\u001aA\u0007^iX\u0017Xw\u0012", "-h]@g(GQ\u0019", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxW8\u000535h\fi$m\u0012,\\$EtC\u0006\u0011q];\u0007p\u0002", "1qT.g,\u001aa'~\nM@\b\t0a}(", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0017\u0010K\u0001\u0018\u0013Eoc", "4n]A9(FW \u0013cZ4|", "Ash9X", "", "/rb2g\u0014:\\\u0015\u0001zk", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\n\\%%G~u8\u007f!7Y\u000bu", "5dc\u0016a:MO\"|z", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Typeface createAssetTypeface(String str, int i2, AssetManager assetManager) {
            if (assetManager != null) {
                String str2 = ReactFontManager.EXTENSIONS[i2];
                for (String str3 : ReactFontManager.FILE_EXTENSIONS) {
                    try {
                        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(assetManager, ReactFontManager.FONTS_ASSET_PATH + str + str2 + str3);
                        Intrinsics.checkNotNullExpressionValue(typefaceCreateFromAsset, "createFromAsset(...)");
                        return typefaceCreateFromAsset;
                    } catch (RuntimeException unused) {
                    }
                }
            }
            Typeface typefaceCreate = Typeface.create(str, i2);
            Intrinsics.checkNotNullExpressionValue(typefaceCreate, "create(...)");
            return typefaceCreate;
        }

        @JvmStatic
        public final ReactFontManager getInstance() {
            return ReactFontManager._instance;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004O\f8é6B\r+4\u0012}\fnjO0LeN/hݷH\u001c\u001c{b#\u0014#~\u0004P[.\u000e&\u0017Ofg\u0016oZ^\u0019E'\u0006D{̶0Ic|\u001e)\u0015GRsM8eok:pz<\u0005.2:8(\u0006в\u001e*V\u0016?\tQU$\u0012^K!@`\u0019e\u00070\u00114Ip\r,^\u007fNdKCҚ<ǥ'\u0003qĩ\u001f6m7\u0015M;G\u000bk˼ze6-F?C\u001eu_\u0011\u0007j[m\u0004\u0016п?ݾl'/Ǣʇwe"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxW8\u000535h\fi$m\u0012,\\$EtC\u0006\u0011q];\u0007pj=\u000b2GMJ*\\@\u0002Q\u001b\u00120", "", "EdX4[;", "", "7sP9\\*", "", "uHIuI", "Ash9X", "uH8uI", "<dP?X:MA(\u0013\u0002^", "5dc\u001bX(KS'\u000ehm@\u0004\t", "u(8", "/o_9l", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0017\u0010K\u0001\u0018\u0013Eoc", "Bx_2Y(<S", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class TypefaceStyle {
        public static final int BOLD = 700;
        public static final Companion Companion = new Companion(null);
        public static final int NORMAL = 400;
        private final boolean italic;
        private final int weight;

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005\"2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԉt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̚~֒Yxe܈ƪ6F"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxW8\u000535h\fi$m\u0012,\\$EtC\u0006\u0011q];\u0007pj=\u000b2GMJ*\\@\u0002Q\u001b\u0012\u0019kX3\u0018\u0001bE.w\u001a", "", "u(E", "\u0010N;\u0011", "", "\u001cNA\u001a4\u0013", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public TypefaceStyle(int i2) {
            this(i2, 0, 2, null);
        }

        public TypefaceStyle(int i2, int i3) {
            i2 = i2 == -1 ? 0 : i2;
            this.italic = (i2 + 2) - (2 | i2) != 0;
            this.weight = i3 == -1 ? (i2 & 1) != 0 ? 700 : 400 : i3;
        }

        public /* synthetic */ TypefaceStyle(int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(i2, (i4 + 2) - (i4 | 2) != 0 ? -1 : i3);
        }

        public TypefaceStyle(int i2, boolean z2) {
            this.italic = z2;
            this.weight = i2 == -1 ? 400 : i2;
        }

        public final Typeface apply(Typeface typeface) {
            if (Build.VERSION.SDK_INT < 28) {
                Typeface typefaceCreate = Typeface.create(typeface, getNearestStyle());
                Intrinsics.checkNotNull(typefaceCreate);
                return typefaceCreate;
            }
            Typeface typefaceCreate2 = Typeface.create(typeface, this.weight, this.italic);
            Intrinsics.checkNotNull(typefaceCreate2);
            return typefaceCreate2;
        }

        public final int getNearestStyle() {
            return this.weight < 700 ? this.italic ? 2 : 0 : this.italic ? 3 : 1;
        }
    }

    @JvmStatic
    public static final ReactFontManager getInstance() {
        return Companion.getInstance();
    }

    public final void addCustomFont(Context context, String fontFamily, int i2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        addCustomFont(fontFamily, ResourcesCompat.getFont(context, i2));
    }

    public final void addCustomFont(String fontFamily, Typeface typeface) {
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        if (typeface != null) {
            this.customTypefaceCache.put(fontFamily, typeface);
        }
    }

    public final Typeface getTypeface(String fontFamilyName, int i2, int i3, AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(fontFamilyName, "fontFamilyName");
        return getTypeface(fontFamilyName, new TypefaceStyle(i2, i3), assetManager);
    }

    public final Typeface getTypeface(String fontFamilyName, int i2, AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(fontFamilyName, "fontFamilyName");
        return getTypeface(fontFamilyName, new TypefaceStyle(i2, 0, 2, null), assetManager);
    }

    public final Typeface getTypeface(String fontFamilyName, int i2, boolean z2, AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(fontFamilyName, "fontFamilyName");
        return getTypeface(fontFamilyName, new TypefaceStyle(i2, z2), assetManager);
    }

    public final Typeface getTypeface(String fontFamilyName, TypefaceStyle typefaceStyle, AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(fontFamilyName, "fontFamilyName");
        Intrinsics.checkNotNullParameter(typefaceStyle, "typefaceStyle");
        if (this.customTypefaceCache.containsKey(fontFamilyName)) {
            return typefaceStyle.apply(this.customTypefaceCache.get(fontFamilyName));
        }
        Map<String, AssetFontFamily> map = this.fontCache;
        AssetFontFamily assetFontFamily = map.get(fontFamilyName);
        if (assetFontFamily == null) {
            assetFontFamily = new AssetFontFamily();
            map.put(fontFamilyName, assetFontFamily);
        }
        AssetFontFamily assetFontFamily2 = assetFontFamily;
        int nearestStyle = typefaceStyle.getNearestStyle();
        Typeface typefaceForStyle = assetFontFamily2.getTypefaceForStyle(nearestStyle);
        if (typefaceForStyle != null) {
            return typefaceForStyle;
        }
        Typeface typefaceCreateAssetTypeface = Companion.createAssetTypeface(fontFamilyName, nearestStyle, assetManager);
        assetFontFamily2.setTypefaceForStyle(nearestStyle, typefaceCreateAssetTypeface);
        return typefaceCreateAssetTypeface;
    }

    public final void setTypeface(String fontFamilyName, int i2, Typeface typeface) {
        Intrinsics.checkNotNullParameter(fontFamilyName, "fontFamilyName");
        if (typeface != null) {
            Map<String, AssetFontFamily> map = this.fontCache;
            AssetFontFamily assetFontFamily = map.get(fontFamilyName);
            if (assetFontFamily == null) {
                assetFontFamily = new AssetFontFamily();
                map.put(fontFamilyName, assetFontFamily);
            }
            assetFontFamily.setTypefaceForStyle(i2, typeface);
        }
    }
}
