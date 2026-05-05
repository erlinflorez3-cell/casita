package androidx.compose.ui.text.platform;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.TypedValue;
import androidx.collection.LruCache;
import androidx.compose.ui.text.font.AndroidFont;
import androidx.compose.ui.text.font.AndroidPreloadedFont;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.ResourceFont;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.QB;
import yg.Xu;

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
/* JADX INFO: compiled from: AndroidFontListTypeface.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated(message = "\u0007[\fAzw\u0016k]\u0007+{S\u001d1")
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\r.4\u0012\u000e\u0007nj?0Le^.Zݷ2\u000f\u0002{<$a$wړ;kڼ.\"7N\u000flmnН^\u000bQ\u000fN,\u0007oDKkw\f\u0015?6PuW3{vm=n|N\u0005N;jL\b\u000f\u0019\u001aXL@z\tIc\f@7ptHZ%M3#b\u001eL!\u0019*li^6vom<?#1mpP}ۂ2ƊQ\rNÖܴ\u0011\u0002"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0019Cr46c\u000b(\u0001I\u001f-ZM?j#2 hb5\u0005c\nJt*G\"", "", "u(E", "1`R5X", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\ng$'%k\f?vz", "", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0017\u0010K\u0001\u0018\u0013Eoc", "5dc\u0018X@", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "4n]A", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FC", "5dc\u001ce\nKS\u0015\u000ez", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidTypefaceCache {
    public static final AndroidTypefaceCache INSTANCE = new AndroidTypefaceCache();
    private static final LruCache<String, Typeface> cache = new LruCache<>(16);
    public static final int $stable = 8;

    private AndroidTypefaceCache() {
    }

    public final Typeface getOrCreate(Context context, Font font) throws Throwable {
        Typeface typefaceLoadBlocking;
        Typeface typeface;
        String key = getKey(context, font);
        if (key != null && (typeface = cache.get(key)) != null) {
            return typeface;
        }
        if (font instanceof ResourceFont) {
            typefaceLoadBlocking = AndroidResourceFontLoaderHelper.INSTANCE.create(context, ((ResourceFont) font).getResId());
        } else {
            if (!(font instanceof AndroidFont)) {
                throw new IllegalArgumentException("Unknown font type: " + font);
            }
            AndroidFont androidFont = (AndroidFont) font;
            typefaceLoadBlocking = androidFont.getTypefaceLoader().loadBlocking(context, androidFont);
        }
        if (typefaceLoadBlocking == null) {
            throw new IllegalArgumentException("Unable to load font " + font);
        }
        if (key != null) {
            cache.put(key, typefaceLoadBlocking);
        }
        return typefaceLoadBlocking;
    }

    public final String getKey(Context context, Font font) throws Throwable {
        if (font instanceof ResourceFont) {
            TypedValue typedValue = new TypedValue();
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.yd("\u001b'\u001c)%\u001e\u0018`%0.3#+0h\r86;+=8", (short) (C1580rY.Xd() ^ (-11482)))).getMethod(C1561oA.Yd("NM]<P_\\caSVe", (short) (C1633zX.Xd() ^ (-10929))), new Class[0]);
            try {
                method.setAccessible(true);
                ((Resources) method.invoke(context, objArr)).getValue(((ResourceFont) font).getResId(), typedValue, true);
                short sXd = (short) (FB.Xd() ^ 10849);
                short sXd2 = (short) (FB.Xd() ^ 12277);
                int[] iArr = new int["\b{\u000bR".length()];
                QB qb = new QB("\b{\u000bR");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                    i2++;
                }
                StringBuilder sb = new StringBuilder(new String(iArr, 0, i2));
                CharSequence charSequence = typedValue.string;
                String string = charSequence != null ? charSequence.toString() : null;
                Intrinsics.checkNotNull(string);
                return sb.append(string).toString();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        if (font instanceof AndroidPreloadedFont) {
            return ((AndroidPreloadedFont) font).getCacheKey();
        }
        throw new IllegalArgumentException(Jg.Wd("\u0013>Jiu\u001a(uGoz\u001cK?Pbf_P", (short) (C1633zX.Xd() ^ (-9741)), (short) (C1633zX.Xd() ^ (-16273))) + font);
    }
}
