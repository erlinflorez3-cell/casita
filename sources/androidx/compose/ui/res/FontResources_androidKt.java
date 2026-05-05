package androidx.compose.ui.res;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.LoadedFontFamily;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.text.font.Typeface;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: FontResources.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d̉=!4i\bӵLc\u0003'I\u0006F\u000b6B\u0015\"4\u0012}\nnjO0LeN.jf8\u0013\u0004{b'\f(\u007fHSUH\u007fh\u000eҊRgutbp\u0019J'\u0006D{\u001b0W]\u0011]@\u0018bF}IKM\u001e?\u007fa\u0015B\u0013ړJ\"fx[В\u001cݵL\u0010~ٙce\u001a\u0012HL\u0001<b\r{\u0007*\u0014\u0016>N\u0004L]\u001eN\rԣnҺ>/+ɅݬFY"}, d2 = {"1`R5X\u0013HQ\u001f", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "Ax]0?6:R\u0019}ir7|\n+c\u007f6", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJOA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~H\u0012+7n\u0012,M\u0019", "4n]AE,L])\fx^", "4n]A9(FW \u0013", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W=\u0001.D#^*@|v*UGB\u007f\n\u0005\u0011q`F\u0011g+a@%QTY6jR<J$\u001bi\u0012V+VbcI/xR7,]\u0010\rh7q\u007f\u0019 \u00124}:@`\u0018R\u0004#u\u000b9l\u0010h_\rV\u000bFl3sUN1g:; \u0012qn", "4n]AE,L])\fx^\r\n\u00137C\n1\u000b@\u0014&", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", RemoteSettings.FORWARD_SLASH_STRING, "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FontResources_androidKt {
    private static final Object cacheLock = new Object();
    private static final Map<FontFamily, Typeface> syncLoadedTypefaces = new LinkedHashMap();

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0013X\u0001;v\u0007Tkg\u00078\rU!;O`\f\u000f6\u0013|\u001f\u0012\fYwxU4\nuv`JCZetR\u0014\u00108M!bb~4&", replaceWith = @ReplaceWith(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    @InterfaceC1492Gx
    public static final Typeface fontResource(FontFamily fontFamily, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -190831095, "C(fontResource)54@1901L7:FontResources.android.kt#ccshc7");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-190831095, i2, -1, "androidx.compose.ui.res.fontResource (FontResources.android.kt:53)");
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Typeface typefaceFontResourceFromContext = fontResourceFromContext((Context) objConsume, fontFamily);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return typefaceFontResourceFromContext;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0013X\u0001;v\u0007Tkg\u00078\rU!;O`\f\u000f6\u0013|\u001f\u0012\fYwxU4\nuv`JCZetR\u0014\u00108M!bb~4&", replaceWith = @ReplaceWith(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    @InterfaceC1492Gx
    private static final Typeface fontResourceFromContext(Context context, FontFamily fontFamily) {
        Typeface typeface;
        if ((fontFamily instanceof SystemFontFamily) || (fontFamily instanceof LoadedFontFamily)) {
            synchronized (cacheLock) {
                Map<FontFamily, Typeface> map = syncLoadedTypefaces;
                Typeface typefaceTypeface$default = map.get(fontFamily);
                if (typefaceTypeface$default == null) {
                    typefaceTypeface$default = AndroidTypeface_androidKt.Typeface$default(context, fontFamily, null, 4, null);
                    map.put(fontFamily, typefaceTypeface$default);
                }
                typeface = typefaceTypeface$default;
            }
            return typeface;
        }
        return AndroidTypeface_androidKt.Typeface$default(context, fontFamily, null, 4, null);
    }
}
