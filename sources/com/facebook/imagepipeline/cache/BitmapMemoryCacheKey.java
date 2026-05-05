package com.facebook.imagepipeline.cache;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u0011s{Břc$wFCU(\u0004*\tUOog|Qb\u000bI\u001f\u000e\u0016\u0007s4կ]xs\u0012\u00172HuEݓS\u0006މi`#5EYB&Fy\u001d\u0001H+X\u0016\u0005|[M\"\u0011^C\u0001>`\u0011e\u0005H\u0017\u0016B.\u00076\\\u0016UFNzeR19\u0002\u0018A^-m9\u0015O#E\u0003(˼za,5\t>C7=S1\b\u0019Ā@KH\u007f`\u001dj=&YL:ʕ7!\u0007\"9CO;b9ͭ]MXn1?+}j\u0012\u05fb\u000fp\u0001\t\"%>\u001a\r4&\u000fΚ.bo\u00165Kv\tRnQHߐCH\to^/%.\\[=)\u0011iaiD\u0015KDN\u001bJ;\u0001\u001dď\fZ\u0014`#\u001blw\u007f2\u0002HCH\\\fq?\u0004\u0003\u001fe20\n0U\u0004G{?3G+=[G)9k0Oto|\u0005npkkhGn!\u001f\u001e=*\u0017\u0015rFz\u0004\u001aQ\u001bї+Y^*\u0002\u001f}6<Pb\u0006j9'&M}t0ҫM&\u00103^~7\bo2\" ?lcMQ\u0012\"(f?\u001aMmz\u0005\u0007\u0010\tgTajZ:2vkVɅz\u0015h\u001a\u001eJA\b\u001bb8\bǐhČL\u000f&ՓY~\u000flhv0\u0001ZB2\u0013:0\u0003\u001a\u0019P\u000b\u0003F\u03a2zͅ0|hõ}P_;1&\u0004)מ8\u0003+Ȕ\u0017u\u0006Zu`\u0018[z+\u000eU*6ک\u001e?YǽU\u0015\u0015\u00167JR>ST\u000bggL@&ϸ\u0001\u007f\u0017\u0090\u00010m!x\u000b|qxSgV-!%_ѓ'\u000elр\u0012cL\u0016U\u007f%\u001ci@at\u0019XjQ̞\u0001\u000b'Ǉ=\u0003u?\u000bS}R5!.wB4ֵecq۰F{h.4\u00156\u0013:c.o\u0011RЄ6A@Ծq\u0001DC2\tĀF{"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u0014q%6IN#k<(\"|?5\u0005f,4v;\u001d", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0007+c\u0003(E>\u000b\u001f\u001fQxW\u001ar#8Yc KC", "And?V,,b&\u0003\u0004`", "", "@db6m,(^(\u0003\u0005g:", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/=a\b)\u0001Z\u0016<QX;U?-\u0019rjG\\", "@nc.g0H\\\u0003\n\nb6\u0006\u0017", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/=a\b)\u0001Z =IR?u=\b weC\u0010q\u0002", "7lP4X\u000b>Q#}zH7\f\r9n\u000e", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/=a\b)\u0001Q\u001e*OC\u001ak2(\u0014hKD\u0016g6W\u0005|", ">nbAc9HQ\u0019\r\th9Z\u0005-h\u007f\u000e{T", ">nbAc9HQ\u0019\r\th9e\u00057e", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b>\u000b\u001f`Hk\f<s/?_G$?i\u0018.XGFk;\"\u001eh+7\u0011k4X\u007fp4L\\0qR\\H#\u0016d\u0017\\\u0001s\u0003cImo@5\u001f\u00056S\b\u0005l\t\b\u0018\u000e@n{B]\u0014Py^sK1pPb)fQPAq.n\u0015I(k>D-\"G\u007f\u0019rXw\u000bwQ\u0011o\\\u0004m1K!v:$IqfFLs^<>%)S\u0004\u0002\u001b{<|'v-b4(@c\u00055r'Bh\u0002#\u0002C?1.\u007f=\u000f=K`\u007fvDWf\u001b_\u000b\u000e,3;!mol\u0012l\u0003[\u001a[\u001basV\u001eW\u0002OE9\u001c#O\u0001\fI\t\"\r\u0010&C):", "1`[9X9\u001c]\"\u000ezq;", "", "5dc\u0010T3ES&\\\u0005g;|\u001c>", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "Adc\u0010T3ES&\\\u0005g;|\u001c>", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "6`b5", "", "5dc\u0016`(@Sw~xh+|r:t\u00042\u0005N", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3c\u0006(Av_\u0012U?=k\u0013\u001e\u0013r`9pn;R\u00010U\"", "7m16g4:^vzxa,j\r8c\u007f", "", "5dc\u0016a\tBb!z\u0006<(z\f/S\u00041y@", "u(9", "5dc\u001db:M^&\tx^:\u000b\u0013<C{&~@f\u0017+", "u(;0b4\bT\u0015|z[6\u0007\u000fxc{&~@J\u0015!Ow\u0018E@\u00031W\u0001 \u001dm*\u0004", "5dc\u001db:M^&\tx^:\u000b\u0013<N{0{", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u001fX:Bh\u0019h\u0006m0\u0007\u0012=", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3c\u0006(Av_\u001bMQ?\u00014\b weC\u0010q\u0002", "5dc\u001fb;:b\u001d\t\u0004H7\f\r9n\u000e", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3c\u0006(Av_\u001bWR7z8(\u001eRlH\u000bm5\\L", "5dc b<KQ\u0019l\nk0\u0006\u000b", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n]AT0Ga\t\f~", "", "CqX", "\u001a`]1e6BRb\bzmul\u00163;", "1n_F", "3pd._:", "=sW2e", "5dc\"e0,b&\u0003\u0004`", "6`b566=S", "7rA2f6N`\u0017~^]\r\u0007\u0016\u000ee|8}B\u0005 \u0019", "BnBAe0GU", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BitmapMemoryCacheKey implements CacheKey {
    private Object callerContext;
    private final int hash;
    private final ImageDecodeOptions imageDecodeOptions;
    private final long inBitmapCacheSince;
    private final CacheKey postprocessorCacheKey;
    private final String postprocessorName;
    private final ResizeOptions resizeOptions;
    private final RotationOptions rotationOptions;
    private final String sourceString;

    public BitmapMemoryCacheKey(String sourceString, ResizeOptions resizeOptions, RotationOptions rotationOptions, ImageDecodeOptions imageDecodeOptions, CacheKey cacheKey, String str) {
        Intrinsics.checkNotNullParameter(sourceString, "sourceString");
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(imageDecodeOptions, "imageDecodeOptions");
        this.sourceString = sourceString;
        this.resizeOptions = resizeOptions;
        this.rotationOptions = rotationOptions;
        this.imageDecodeOptions = imageDecodeOptions;
        this.postprocessorCacheKey = cacheKey;
        this.postprocessorName = str;
        int iHashCode = this.sourceString.hashCode() * 31;
        ResizeOptions resizeOptions2 = this.resizeOptions;
        int iHashCode2 = (((((iHashCode + (resizeOptions2 != null ? resizeOptions2.hashCode() : 0)) * 31) + this.rotationOptions.hashCode()) * 31) + this.imageDecodeOptions.hashCode()) * 31;
        CacheKey cacheKey2 = this.postprocessorCacheKey;
        int iHashCode3 = (iHashCode2 + (cacheKey2 != null ? cacheKey2.hashCode() : 0)) * 31;
        String str2 = this.postprocessorName;
        this.hash = iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.inBitmapCacheSince = RealtimeSinceBootClock.get().now();
    }

    public static /* synthetic */ BitmapMemoryCacheKey copy$default(BitmapMemoryCacheKey bitmapMemoryCacheKey, String str, ResizeOptions resizeOptions, RotationOptions rotationOptions, ImageDecodeOptions imageDecodeOptions, CacheKey cacheKey, String str2, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            str = bitmapMemoryCacheKey.sourceString;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            resizeOptions = bitmapMemoryCacheKey.resizeOptions;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            rotationOptions = bitmapMemoryCacheKey.rotationOptions;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            imageDecodeOptions = bitmapMemoryCacheKey.imageDecodeOptions;
        }
        if ((16 & i2) != 0) {
            cacheKey = bitmapMemoryCacheKey.postprocessorCacheKey;
        }
        if ((i2 & 32) != 0) {
            str2 = bitmapMemoryCacheKey.postprocessorName;
        }
        return bitmapMemoryCacheKey.copy(str, resizeOptions, rotationOptions, imageDecodeOptions, cacheKey, str2);
    }

    public final String component1() {
        return this.sourceString;
    }

    public final ResizeOptions component2() {
        return this.resizeOptions;
    }

    public final RotationOptions component3() {
        return this.rotationOptions;
    }

    public final ImageDecodeOptions component4() {
        return this.imageDecodeOptions;
    }

    public final CacheKey component5() {
        return this.postprocessorCacheKey;
    }

    public final String component6() {
        return this.postprocessorName;
    }

    @Override // com.facebook.cache.common.CacheKey
    public boolean containsUri(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String uriString = getUriString();
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "uri.toString()");
        return StringsKt.contains$default((CharSequence) uriString, (CharSequence) string, false, 2, (Object) null);
    }

    public final BitmapMemoryCacheKey copy(String sourceString, ResizeOptions resizeOptions, RotationOptions rotationOptions, ImageDecodeOptions imageDecodeOptions, CacheKey cacheKey, String str) {
        Intrinsics.checkNotNullParameter(sourceString, "sourceString");
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(imageDecodeOptions, "imageDecodeOptions");
        return new BitmapMemoryCacheKey(sourceString, resizeOptions, rotationOptions, imageDecodeOptions, cacheKey, str);
    }

    @Override // com.facebook.cache.common.CacheKey
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.facebook.imagepipeline.cache.BitmapMemoryCacheKey");
        BitmapMemoryCacheKey bitmapMemoryCacheKey = (BitmapMemoryCacheKey) obj;
        return Intrinsics.areEqual(this.sourceString, bitmapMemoryCacheKey.sourceString) && Intrinsics.areEqual(this.resizeOptions, bitmapMemoryCacheKey.resizeOptions) && Intrinsics.areEqual(this.rotationOptions, bitmapMemoryCacheKey.rotationOptions) && Intrinsics.areEqual(this.imageDecodeOptions, bitmapMemoryCacheKey.imageDecodeOptions) && Intrinsics.areEqual(this.postprocessorCacheKey, bitmapMemoryCacheKey.postprocessorCacheKey) && Intrinsics.areEqual(this.postprocessorName, bitmapMemoryCacheKey.postprocessorName);
    }

    public final Object getCallerContext() {
        return this.callerContext;
    }

    public final ImageDecodeOptions getImageDecodeOptions() {
        return this.imageDecodeOptions;
    }

    public final long getInBitmapCacheSince() {
        return this.inBitmapCacheSince;
    }

    public final CacheKey getPostprocessorCacheKey() {
        return this.postprocessorCacheKey;
    }

    public final String getPostprocessorName() {
        return this.postprocessorName;
    }

    public final ResizeOptions getResizeOptions() {
        return this.resizeOptions;
    }

    public final RotationOptions getRotationOptions() {
        return this.rotationOptions;
    }

    public final String getSourceString() {
        return this.sourceString;
    }

    @Override // com.facebook.cache.common.CacheKey
    public String getUriString() {
        return this.sourceString;
    }

    @Override // com.facebook.cache.common.CacheKey
    public int hashCode() {
        return this.hash;
    }

    @Override // com.facebook.cache.common.CacheKey
    public boolean isResourceIdForDebugging() {
        return false;
    }

    public final void setCallerContext(Object obj) {
        this.callerContext = obj;
    }

    @Override // com.facebook.cache.common.CacheKey
    public String toString() {
        return "BitmapMemoryCacheKey(sourceString=" + this.sourceString + ", resizeOptions=" + this.resizeOptions + ", rotationOptions=" + this.rotationOptions + ", imageDecodeOptions=" + this.imageDecodeOptions + ", postprocessorCacheKey=" + this.postprocessorCacheKey + ", postprocessorName=" + this.postprocessorName + ")";
    }
}
