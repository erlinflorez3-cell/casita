package androidx.compose.material.ripple;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: RippleTheme.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001e\u001d̉=!4i\bDJd|\u0004W\u00068\u000bDB\u0007\"2\u0015\u007f\u0007tvAӄdqV\u008cjSX\u000eBڗ6ż_$yّ[a(}:\t}M>˪pН^\u000bKƤ&\"\u0007kDI\u0004w4܋\u0011̓FoG\u074cm\u0010K;xzF\u000702P<(\b7\u001e\u0001Ђ\u0012ͯ~OSÈ\"2FuHX%O\u000b! \u000e^,\u000f'tg|@\u001fǐ0Ơ3#\u000b݃ŒR2"}, d2 = {"\u0012`a8G/>[\u0019k~i7\u0004\t\u000bl\u000b+w", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i$q!9TC\u0017r?!\u0011>", "\u001ahV5g\u001bAS!~]b.\u007ff9n\u000f5wN\u0010\u0004\u001bRz\u0015<R,@\\y", "\u001ahV5g\u001bAS!~ah>Z\u00138t\r$\nOm\u001b\"Rv\u000e\u0018}08U", "\u001anR._\u0019B^$\u0006zM/|\u0011/", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9xI\u000169Xy\u001d>ms8UNEy8-\u0019rj \u0011a(UL", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i$q!9TC*n4&\u0015>", "5dc\u0019b*:Z\u0006\u0003\u0006i3|w2e\b(:<\n !Vk\u001d@\u0001.C", "u(E", "5dc\u0019b*:Z\u0006\u0003\u0006i3|w2e\b(", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006a2?j\u0002\u001f3j\u001d.+MCv>,\u0019weC\u0010J6Lr.\u001d", " h_=_,-V\u0019\u0007z=,\b\u0016/c{7\u007fJ\n~\u0017U}\n>v", "", ";`c2e0:Z`\f~i7\u0004\t)r\u007f/{<\u000f\u0017"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RippleThemeKt {
    private static final String RippleThemeDeprecationMessage = "RippleTheme and LocalRippleTheme have been deprecated - they are not compatible with the new ripple implementation using the new Indication APIs that provide notable performance improvements. For a migration guide and background information, please visit developer.android.com";
    private static final ProvidableCompositionLocal<RippleTheme> LocalRippleTheme = CompositionLocalKt.staticCompositionLocalOf(new Function0<RippleTheme>() { // from class: androidx.compose.material.ripple.RippleThemeKt$LocalRippleTheme$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final RippleTheme invoke() {
            return DebugRippleTheme.INSTANCE;
        }
    });
    private static final RippleAlpha LightThemeHighContrastRippleAlpha = new RippleAlpha(0.16f, 0.24f, 0.08f, 0.24f);
    private static final RippleAlpha LightThemeLowContrastRippleAlpha = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.12f);
    private static final RippleAlpha DarkThemeRippleAlpha = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.1f);

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0015O\fE}y\t_]T-:Q#0\u000eH[\f(\u0011Z\u0015b\u0007Rs^Vy1k(TeXR\u001cj>K,r>\u0017f^~%Y\\@i}\u0001Q O\u0019]ZwF\u00072\u001a~K[N\r\tm#\u001c\u0005J\u001cD:X7<9\u0013\u0004CX[|\u0001754M 6\u000b T\u0014Fb\u001e%,CEy{+/PI\u0016r^:*VxFv* A\u001d\u0017Dl=ht\u001bEk`\u0019-a[(eg<\u000bL\u001f=:x\u0003Yui2\u0011.v\u001b~\u00190tS\"\u0005mmT+YsJ']-^iRG\u001ePGMY'i_3|\r\u0006\u0018y\"7'~\\v85g=#we\u00054\u000e&->\u0003\u00127=G6j<K&*`m\u000f2D\u007f\f\u0014\u0015/$\u000f\u001d)^y\r(fe\u001b|bY,Hs\u0003\u0017bX>MeA=9q@p\u0002V\u0019?W\u001c|\u000e\u0006ks")
    @InterfaceC1492Gx
    public static /* synthetic */ void getLocalRippleTheme$annotations() {
    }

    public static final ProvidableCompositionLocal<RippleTheme> getLocalRippleTheme() {
        return LocalRippleTheme;
    }
}
