package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.DropdownMenuPositionProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: AndroidMenu.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яv\u001d̉=!4i\bDJd|\u0004O\u00068é6B\r+4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<řc$\bCCU }*\teNog\u0005Jb\u000bY\u000f\u000e\u0016\u000fj4I[ye\u0012%2JģG3coEʠhtL\u0005(2(8\u0002\u0005\u0017\u001a2H\u0016\u007f\u0003Ca\f\u001aؓHpPR\u0015˟\r\u001a(\u0006F \u0007\u001etT\\8`l\f=_'\u0011mZNUd`\u0007[\u0013^Z7\u000f\u0007aL.n>e\u001b+S\u0011\u000fj[m\fowC\u0005v1?+w~\b<^\u007f\"!CO;j#,b\u0005_n$'YN\u0014e^\u001d@\u000e\u000b}\u001d<2\u001f\u0016)X.[\u001d\u0015\u0018ԧ7txeĖT\u0002dUF\u007f̡5ЍӾ\u000451M){iň:'PO{3\u0010N'\u000fr9[\u0003\u0013\u0011\u001f)Z\u0010WASP=vQ8`ms\npp\nB\u0004^P05\u0002\u0011<!=7\nDS'q\u0002VP\u007fv3m\u0019YoRVN:nD6Z\u000f\u0012ZRz\u001dk~k\t2\u0017M*l\u001f}6,Pb}</?(N}\u0004\u001apS]\u0018AGfet\u001fs\u0014WG{K7gb>\u007f\u0003\u0011\"NTx\u0015ZvB\u0002\u001dj^8\"`K\u0019 ȑ\u007fDT\u001eƱ6?w/z1״\u0018¢ČL\u0005$aO\u001d!Bhj(~\u00036T\u0007w(\r\t/U\rz}m\u0011O<~p\"[D\u007f<I,[\"v<\u0015#5\b$\u0006MgZQdlD\u0001\u0006\u0002&\u0016(Gi/k\u0012?\u00197A\u001aCUN\u0003e\u007f^\")\u000b|(\u0012ix\u05cek\bp\u0003ݽdjPb\u001b\u001cɪuܥѓ'\nj!\b\u0004^ںFqw#[lL#\u0012g`fC\r\u0007/\u001eS\u0004\u001e)Ŀ9-I9M \u00069G\u001bq_yo\\|\u0011\u0016Vzk\u0004:k.o\u0011Z\u000eEA8W\u007f\u0017K2&|\u0003pK\u0001v6Iީ8\r9ZqwvVFt#<\u000eh\u0017,;slZh\u001a̭\u000244qZyI}\"\u0007[%?R\u0004msmY\u0006#J=4;\u00027n GU \u0005\u0004\u0013\u00116\u0006\u0002ENCQa3jO)Ҭ0<\u0016:cfwв(z.E6ʖ\u0019ЋFyCٙ&V~\\dIζ`Jh$0ܢ\u001b=2Α|e"}, d2 = {"\u0012dU.h3M;\u0019\b\u000bI9\u0007\u0014/r\u000f,{N", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0013\u001b Fy \u0006a/@i\t\u000bDw!.ZR?kBs", "5dc\u0011X-:c \u000eb^5\rs<o\u000b(\tO\u0005\u0017%", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`)Kx\rF\tn c\t0BX#8XCHz8\u001e#>", "\u0012q^=W6P\\\u0001~\u0004n", "", "3w_.a+>R", "", "=m36f4Ba'kzj<|\u0017>", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "=eU@X;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lG`&6g}/\r", "Aba<_3,b\u0015\u000ez", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u00133f\b'>[%*\\C\u0011", ">q^=X9MW\u0019\r", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s8TSCt\"\u001c\u001fsa\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "\u0012q^=W6P\\\u0001~\u0004nsK\u000f4-y\u0011[", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u0007+\u00114X+`Sv=!g?tJ4\f\u0012cE#\u0002\u000e5)\u00107S\u0010;2\u0002\u0016&\u00174f\u007fF`\u0019\u0011g\u0013\u0003K0o4h[\tG\u0017,^3c\u0019i![M\u0004\"\u001ey$%vPw\u001a\u007f\u001d#v[xqy\u0011\u0004\u0005C4IXhPPobKx'-!b}\u001cA_x4>2\u0015<s7t\u000eIv\u001cHg\u0007^\rlJ%5:F\u001c\r!Jqu=\u001br#`\u001bW`?9$osc\u0012\u001c\u0017f&_=a)^AZ\u0011HWo\"|*b\u0006L", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "Bn]._\fES*z\nb6\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "AgP1b>\u001eZ\u0019\u0010vm0\u0007\u0012", "0na1X9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0002?f| D[%;WI;A", "\u0012q^=W6P\\\u0001~\u0004ns`\u0010\u0012_\u0014(\u000e", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u0007+\u00114X+`Sv=!g?tJ4\f\u0012cE#\u0002\u000e5)\u00107S\u0010;2\u0002\u0016&\u00174f\u007fF`\u0019\u0011g\u0013\u0003K0o4h[\tG\u0017,^3c\u0019i![M\u0004\"\u001ey$%vPw\u001a\u007f\u001d#v[xqy\u0011\u0004\u0005C4IXhPPobKx'-!bs\u001b1e~/s@M24>o\u000fYgaNbB\u00179XL**4J\\-N_\u0001l\u0014rI\u007fH\u0004\u0017aB;\u001ddx-F\u0019\u000fh!i5+`\u000bG[\u0005:Xs\u001f0\u0010[Lhx\u0015\u0016t3zoOCp;\u0007$\u007fK&hZ\b\u0014na\u001d>\u001f;h\u0013r3m\u0001.#\u0012fG\u0010\u0006b\u0011jWD\u0019lX|_V\u0003m4\u0003\u0019T+AK\u0006\u0004bL~\u0014\u001e4Jh\t%~sPyCh\t\t!\u001d)", "\u0012q^=W6P\\\u0001~\u0004ns`o!X\r\u000e\n", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u0007+\u00114X+`Sv=!g?tJ4\f\u0012cE#\u0002\u000e5)\u00107S\u0010;2\u0011\u0010_ 9soLhY2\u0004 \u0006L\u0014uPd_\u0007VEEp\u007fK\u0012i,c>Cm\u0019\u0003!di`7\b\u000bW\u001b{`CHwP\u0017\n<.G;1-AxTI~+\u001e^Eu\u001c:c~9tv\u0011D3Eh\rK1uHf\u0004\u001f:\\N|\n\u001a\u007f\u0004", "\u0012q^=W6P\\\u0001~\u0004n\u0010\f\t7", "BdgA", "=m29\\*D", ":dP1\\5@7\u0017\t\u0004", "BqP6_0GU||\u0005g", "3mP/_,=", "1n[<e:", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006^%>ia/7us8TMHy\n", "1n]AX5M>\u0015}yb5~", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d\\0tJ4\f\u0012cE#\u0002\u000e5)\u00107S\u0010;2\u0011\u0010_u?itCZ\u0010TO{{K8oJb)~XI\u000fc:m\nn!fCHmt\u0002\"\u0019wT8\u0013H)wx\\\tnkPb\u007fI,\bnkOC~YF}5h,\f\u0001\u0010A\\~4A\u0003x\u001b&?c\u0012Uk\u0017Q(v\u001f4gK5&\u007fD\u000fNKpyhE[2\u0007a\u0011\u001eFD1!CojR\u001c\u00153}W>`l\u000b;Q\u0019\bGy\u001d2P\rB%z\u001f\u0019\u0010#itMM$\u001e\b\u0016\u0005N2nZm~e\u0017 7\u0018.U\u0016x*m\r4\u000f\u0012gE\u0016\u007fXV^nR\u0018xU\u0001[!p.F\u0002\u0010E07UE@VL~\u0010#0~\u001a\u0003'|3*\nE\u000f\",==Aq`<\u0007eb&#p&&/:/\u0002('jgv4\u001f\u0002\r{F\u0013gFC\fAA\u0013w2ErO\r<$0\u001a4X\u001f=`\u0002k&?7&", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidMenu_androidKt {
    private static final PopupProperties DefaultMenuProperties = new PopupProperties(true, false, false, false, 14, (DefaultConstructorMarker) null);

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: DropdownMenu-IlH_yew, reason: not valid java name */
    public static final void m1781DropdownMenuIlH_yew(final boolean z2, final Function0<Unit> function0, Modifier modifier, long j2, ScrollState scrollState, PopupProperties popupProperties, Shape shape, long j3, float f2, float f3, BorderStroke borderStroke, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        BorderStroke borderStroke2 = borderStroke;
        float fM2245getShadowElevationD9Ej5fM = f3;
        float fM2246getTonalElevationD9Ej5fM = f2;
        long containerColor = j3;
        PopupProperties popupProperties2 = popupProperties;
        ScrollState scrollStateRememberScrollState = scrollState;
        long jM6659DpOffsetYgX7TsA = j2;
        Shape shape2 = shape;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1431928300);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DropdownMenu)P(3,6,4,5:c#ui.unit.DpOffset,8,7,10,1:c#ui.graphics.Color,11:c#ui.unit.Dp,9:c#ui.unit.Dp)182@6555L21,185@6667L5,187@6715L14,55@2073L42,59@2260L51,60@2347L7,62@2403L251,72@2825L494,68@2664L655:AndroidMenu.android.kt#uh7d8r");
        if ((i4 & 1) != 0) {
            i5 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i5 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 48));
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i7 = i4 & 4;
        if (i7 != 0) {
            i5 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i8 = composerStartRestartGroup.changed(companion) ? 256 : 128;
            i5 = (i5 + i8) - (i5 & i8);
        }
        int i9 = (-1) - (((-1) - i4) | ((-1) - 8));
        if (i9 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 3072));
        } else if ((i2 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changed(jM6659DpOffsetYgX7TsA) ? 2048 : 1024;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            i5 |= ((i4 + 16) - (i4 | 16) == 0 && composerStartRestartGroup.changed(scrollStateRememberScrollState)) ? 16384 : 8192;
        }
        int i10 = (i4 + 32) - (i4 | 32);
        if (i10 != 0) {
            i5 = (i5 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(popupProperties2) ? 131072 : 65536)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - 1572864)) == 0) {
            i5 |= ((i4 & 64) == 0 && composerStartRestartGroup.changed(shape2)) ? 1048576 : 524288;
        }
        if ((i2 + 12582912) - (i2 | 12582912) == 0) {
            i5 |= ((i4 + 128) - (i4 | 128) == 0 && composerStartRestartGroup.changed(containerColor)) ? 8388608 : 4194304;
        }
        int i11 = (-1) - (((-1) - i4) | ((-1) - 256));
        if (i11 != 0) {
            i5 |= 100663296;
        } else if ((-1) - (((-1) - i2) | ((-1) - 100663296)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(fM2246getTonalElevationD9Ej5fM) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        int i12 = (-1) - (((-1) - i4) | ((-1) - 512));
        if (i12 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 805306368));
        } else if ((i2 & 805306368) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(fM2245getShadowElevationD9Ej5fM) ? 536870912 : 268435456)));
        }
        int i13 = (i4 + 1024) - (i4 | 1024);
        if (i13 != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = i3 | (composerStartRestartGroup.changed(borderStroke2) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i4 & 2048) != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 48));
        } else if ((i3 & 48) == 0) {
            int i14 = composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
            i6 = (i6 + i14) - (i6 & i14);
        }
        if ((i5 & 306783379) == 306783378 && (i6 + 19) - (19 | i6) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i7 != 0) {
                    companion = Modifier.Companion;
                }
                if (i9 != 0) {
                    float f4 = 0;
                    jM6659DpOffsetYgX7TsA = DpKt.m6659DpOffsetYgX7TsA(Dp.m6638constructorimpl(f4), Dp.m6638constructorimpl(f4));
                }
                if ((i4 + 16) - (i4 | 16) != 0) {
                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-57345)));
                }
                if (i10 != 0) {
                    popupProperties2 = DefaultMenuProperties;
                }
                if ((i4 + 64) - (i4 | 64) != 0) {
                    shape2 = MenuDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i5 = (i5 - 3670017) - (i5 | (-3670017));
                }
                if ((i4 + 128) - (i4 | 128) != 0) {
                    containerColor = MenuDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-29360129)));
                }
                if (i11 != 0) {
                    fM2246getTonalElevationD9Ej5fM = MenuDefaults.INSTANCE.m2246getTonalElevationD9Ej5fM();
                }
                if (i12 != 0) {
                    fM2245getShadowElevationD9Ej5fM = MenuDefaults.INSTANCE.m2245getShadowElevationD9Ej5fM();
                }
                if (i13 != 0) {
                    borderStroke2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i4 + 16) - (i4 | 16) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-57345)));
                }
                if ((-1) - (((-1) - i4) | ((-1) - 64)) != 0) {
                    i5 = (i5 - 3670017) - (i5 | (-3670017));
                }
                if ((i4 + 128) - (i4 | 128) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-29360129)));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1431928300, i5, i6, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:54)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1468213501, "CC(remember):AndroidMenu.android.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new MutableTransitionState(false);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableTransitionState mutableTransitionState = (MutableTransitionState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            mutableTransitionState.setTargetState$animation_core_release(Boolean.valueOf(z2));
            if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue() || ((Boolean) mutableTransitionState.getTargetState()).booleanValue()) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1468219494, "CC(remember):AndroidMenu.android.kt#9igjgp");
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m4556boximpl(TransformOrigin.Companion.m4569getCenterSzJe1aQ()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final MutableState mutableState = (MutableState) objRememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composerStartRestartGroup.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Density density = (Density) objConsume;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1468224270, "CC(remember):AndroidMenu.android.kt#9igjgp");
                int i15 = (-1) - (((-1) - i5) | ((-1) - 7168)) == 2048 ? 1 : 0;
                boolean zChanged = composerStartRestartGroup.changed(density);
                int i16 = (i15 + (zChanged ? 1 : 0)) - (i15 & (zChanged ? 1 : 0));
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (i16 != 0 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new DropdownMenuPositionProvider(jM6659DpOffsetYgX7TsA, density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                            invoke2(intRect, intRect2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(IntRect intRect, IntRect intRect2) {
                            mutableState.setValue(TransformOrigin.m4556boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                        }
                    }, 4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                final Modifier modifier2 = companion;
                final ScrollState scrollState2 = scrollStateRememberScrollState;
                final Shape shape3 = shape2;
                final long j4 = containerColor;
                final float f5 = fM2246getTonalElevationD9Ej5fM;
                final float f6 = fM2245getShadowElevationD9Ej5fM;
                final BorderStroke borderStroke3 = borderStroke2;
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(2126968933, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i17) {
                        ComposerKt.sourceInformation(composer2, "C73@2839L470:AndroidMenu.android.kt#uh7d8r");
                        if ((i17 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2126968933, i17, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:73)");
                            }
                            Modifier modifier3 = modifier2;
                            MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                            MutableState<TransformOrigin> mutableState2 = mutableState;
                            ScrollState scrollState3 = scrollState2;
                            Shape shape4 = shape3;
                            long j5 = j4;
                            float f7 = f5;
                            float f8 = f6;
                            BorderStroke borderStroke4 = borderStroke3;
                            Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                            int i18 = MutableTransitionState.$stable << 3;
                            MenuKt.m2259DropdownMenuContentQj0Zi0g(modifier3, mutableTransitionState2, mutableState2, scrollState3, shape4, j5, f7, f8, borderStroke4, function32, composer2, (i18 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i18 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54);
                int i17 = (-1) - (((-1) - i5) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
                int i18 = (i17 + 3072) - (i17 & 3072);
                int i19 = i5 >> 9;
                AndroidPopup_androidKt.Popup((DropdownMenuPositionProvider) objRememberedValue3, function0, popupProperties2, composableLambdaRememberComposableLambda, composerStartRestartGroup, ((i19 + 896) - (i19 | 896)) | i18, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final long j5 = jM6659DpOffsetYgX7TsA;
            final ScrollState scrollState3 = scrollStateRememberScrollState;
            final PopupProperties popupProperties3 = popupProperties2;
            final Shape shape4 = shape2;
            final long j6 = containerColor;
            final float f7 = fM2246getTonalElevationD9Ej5fM;
            final float f8 = fM2245getShadowElevationD9Ej5fM;
            final BorderStroke borderStroke4 = borderStroke2;
            final Modifier modifier3 = companion;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i20) {
                    boolean z3 = z2;
                    Function0<Unit> function02 = function0;
                    Modifier modifier4 = modifier3;
                    long j7 = j5;
                    ScrollState scrollState4 = scrollState3;
                    PopupProperties popupProperties4 = popupProperties3;
                    Shape shape5 = shape4;
                    long j8 = j6;
                    float f9 = f7;
                    float f10 = f8;
                    BorderStroke borderStroke5 = borderStroke4;
                    Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                    int i21 = i2;
                    AndroidMenu_androidKt.m1781DropdownMenuIlH_yew(z3, function02, modifier4, j7, scrollState4, popupProperties4, shape5, j8, f9, f10, borderStroke5, function32, composer2, RecomposeScopeImplKt.updateChangedFlags((i21 + 1) - (i21 & 1)), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0010G\u0005C\u0006u\u001ee]Kg\u0001_'kPeZ\n9\u001e(\u000fa\u0004Vo~Wv-rq`}\u0010\rQ{>\u0006-I?$b[z&\u0018_DyFs\"\rY\u0015Q \u000b9\u0014\u0006KuF.\u000b\u0011\u0004^2\rG\b\u0013N\u0007P@spX{@i\u001d\u0003\u0005/\u0004m\u0004\u00114\u0003Z\u0017\u001aKV\u00172l", replaceWith = @ReplaceWith(expression = "DropdownMenu(\n    expanded = expanded,\n    onDismissRequest = onDismissRequest,\n    modifier = modifier,\n    offset = offset,\n    scrollState = scrollState,\n    properties = properties,\n    shape = MenuDefaults.shape,\n    containerColor = MenuDefaults.containerColor,\n    tonalElevation = MenuDefaults.TonalElevation,\n    shadowElevation = MenuDefaults.ShadowElevation,\n    border = null,\n    content = content,\n)", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: DropdownMenu-4kj-_NE, reason: not valid java name */
    public static final /* synthetic */ void m1779DropdownMenu4kj_NE(final boolean z2, final Function0 function0, Modifier modifier, long j2, ScrollState scrollState, PopupProperties popupProperties, final Function3 function3, Composer composer, final int i2, final int i3) {
        int i4;
        PopupProperties popupProperties2 = popupProperties;
        Modifier.Companion companion = modifier;
        ScrollState scrollStateRememberScrollState = scrollState;
        long jM6659DpOffsetYgX7TsA = j2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1137929566);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DropdownMenu)P(1,4,2,3:c#ui.unit.DpOffset,6,5)119@4573L21,130@4960L5,131@5005L14,123@4721L465:AndroidMenu.android.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = i2 | 6;
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i4 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            i4 |= 48;
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function0) ? 32 : 16)));
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 = (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 256 : 128)));
        }
        int i6 = (-1) - (((-1) - i3) | ((-1) - 8));
        if (i6 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 3072));
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(jM6659DpOffsetYgX7TsA) ? 2048 : 1024;
        }
        if ((i2 + 24576) - (i2 | 24576) == 0) {
            int i7 = ((i3 + 16) - (i3 | 16) == 0 && composerStartRestartGroup.changed(scrollStateRememberScrollState)) ? 16384 : 8192;
            i4 = (i4 + i7) - (i4 & i7);
        }
        int i8 = (i3 + 32) - (i3 | 32);
        if (i8 != 0) {
            i4 = (i4 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i2)) == 0) {
            i4 |= composerStartRestartGroup.changed(popupProperties2) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i4 = (i4 + 1572864) - (i4 & 1572864);
        } else if ((i2 & 1572864) == 0) {
            int i9 = composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288;
            i4 = (i4 + i9) - (i4 & i9);
        }
        if ((-1) - (((-1) - 599187) | ((-1) - i4)) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if (i6 != 0) {
                    float f2 = 0;
                    jM6659DpOffsetYgX7TsA = DpKt.m6659DpOffsetYgX7TsA(Dp.m6638constructorimpl(f2), Dp.m6638constructorimpl(f2));
                }
                if ((i3 & 16) != 0) {
                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    i4 = (i4 - 57345) - (i4 | (-57345));
                }
                if (i8 != 0) {
                    popupProperties2 = new PopupProperties(true, false, false, false, 14, (DefaultConstructorMarker) null);
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 + 16) - (i3 | 16) != 0) {
                    i4 = (i4 - 57345) - (i4 | (-57345));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1137929566, i4, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:123)");
            }
            int i10 = (-1) - (((-1) - (((-1) - (((-1) - ((-1) - (((-1) - (((-1) - (((-1) - i4) | ((-1) - 14))) | 905969664)) & ((-1) - (112 & i4))))) & ((-1) - (896 & i4)))) | ((i4 + 7168) - (7168 | i4)))) & ((-1) - ((57344 + i4) - (57344 | i4))));
            int i11 = (-1) - (((-1) - 458752) | ((-1) - i4));
            int i12 = i4 >> 15;
            long j3 = jM6659DpOffsetYgX7TsA;
            m1781DropdownMenuIlH_yew(z2, function0, companion, j3, scrollStateRememberScrollState, popupProperties2, MenuDefaults.INSTANCE.getShape(composerStartRestartGroup, 6), MenuDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6), MenuDefaults.INSTANCE.m2246getTonalElevationD9Ej5fM(), MenuDefaults.INSTANCE.m2245getShadowElevationD9Ej5fM(), null, function3, composerStartRestartGroup, (i10 + i11) - (i10 & i11), (-1) - (((-1) - ((i12 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i12 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))) & ((-1) - 6)), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final long j4 = jM6659DpOffsetYgX7TsA;
            final ScrollState scrollState2 = scrollStateRememberScrollState;
            final PopupProperties popupProperties3 = popupProperties2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i13) {
                    AndroidMenu_androidKt.m1779DropdownMenu4kj_NE(z2, function0, modifier2, j4, scrollState2, popupProperties3, function3, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))), i3);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0015K\fArw\u001a[\u0018IA:QT\u0010`k\\\r6\u001cvxW\u0005[.pc\u0003'zq[r\u0002de|A\u0006\u001fr-\u0015h[\u0006.K\\<yCs\"\rY\u0015Q \u000b9\u0014", replaceWith = @ReplaceWith(expression = "DropdownMenu(expanded,onDismissRequest, modifier, offset, rememberScrollState(), properties, content)", imports = {"androidx.compose.foundation.rememberScrollState"}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: DropdownMenu-ILWXrKs, reason: not valid java name */
    public static final /* synthetic */ void m1780DropdownMenuILWXrKs(final boolean z2, final Function0 function0, Modifier modifier, long j2, PopupProperties popupProperties, final Function3 function3, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier.Companion companion = modifier;
        PopupProperties popupProperties2 = popupProperties;
        long jM6659DpOffsetYgX7TsA = j2;
        Composer composerStartRestartGroup = composer.startRestartGroup(354826666);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DropdownMenu)P(1,4,2,3:c#ui.unit.DpOffset,5)163@6060L21,158@5896L251:AndroidMenu.android.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changed(z2) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            i4 |= 48;
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i5 = (-1) - (((-1) - i3) | ((-1) - 4));
        if (i5 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 256 : 128)));
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 = (i4 + 3072) - (i4 & 3072);
        } else if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            i4 |= composerStartRestartGroup.changed(jM6659DpOffsetYgX7TsA) ? 2048 : 1024;
        }
        int i7 = (-1) - (((-1) - i3) | ((-1) - 16));
        if (i7 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 24576));
        } else if ((i2 & 24576) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(popupProperties2) ? 16384 : 8192)));
        }
        if ((i3 & 32) != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i2 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i2 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536)));
        }
        if ((74899 & i4) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i5 != 0) {
                companion = Modifier.Companion;
            }
            if (i6 != 0) {
                float f2 = 0;
                jM6659DpOffsetYgX7TsA = DpKt.m6659DpOffsetYgX7TsA(Dp.m6638constructorimpl(f2), Dp.m6638constructorimpl(f2));
            }
            if (i7 != 0) {
                popupProperties2 = new PopupProperties(true, false, false, false, 14, (DefaultConstructorMarker) null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(354826666, i4, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:158)");
            }
            m1781DropdownMenuIlH_yew(z2, function0, companion, jM6659DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties2, null, 0L, 0.0f, 0.0f, null, function3, composerStartRestartGroup, (-1) - (((-1) - ((-1) - (((-1) - i4) | ((-1) - 8190)))) & ((-1) - ((-1) - (((-1) - (i4 << 3)) | ((-1) - 458752))))), (-1) - (((-1) - (i4 >> 12)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)), 1984);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final long j3 = jM6659DpOffsetYgX7TsA;
            final PopupProperties popupProperties3 = popupProperties2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    AndroidMenu_androidKt.m1780DropdownMenuILWXrKs(z2, function0, modifier2, j3, popupProperties3, function3, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))), i3);
                }
            });
        }
    }

    public static final void DropdownMenuItem(final Function2<? super Composer, ? super Integer, Unit> function2, final Function0<Unit> function0, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, boolean z2, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        int i4;
        final MutableInteractionSource mutableInteractionSource2;
        PaddingValues dropdownMenuItemContentPadding = paddingValues;
        MenuItemColors menuItemColorsItemColors = menuItemColors;
        boolean z3 = z2;
        Function2<? super Composer, ? super Integer, Unit> function24 = function23;
        Function2<? super Composer, ? super Integer, Unit> function25 = function22;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1826340448);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DropdownMenuItem)P(7,6,5,4,8,2)194@8925L12,180@6505L319:AndroidMenu.android.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i4 = i2 | 6;
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(function2) ? 4 : 2;
            i4 = (i5 + i2) - (i5 & i2);
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((i2 & 48) == 0) {
            int i6 = composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
            i4 = (i4 + i6) - (i4 & i6);
        }
        int i7 = (-1) - (((-1) - i3) | ((-1) - 4));
        if (i7 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 256 : 128)));
        }
        int i8 = i3 & 8;
        if (i8 != 0) {
            i4 = (i4 + 3072) - (i4 & 3072);
        } else if ((i2 & 3072) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function25) ? 2048 : 1024)));
        }
        int i9 = (i3 + 16) - (i3 | 16);
        if (i9 != 0) {
            i4 = (i4 + 24576) - (i4 & 24576);
        } else if ((i2 + 24576) - (i2 | 24576) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function24) ? 16384 : 8192)));
        }
        int i10 = (i3 + 32) - (i3 | 32);
        if (i10 != 0) {
            i4 = (i4 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(z3) ? 131072 : 65536)));
        }
        if ((-1) - (((-1) - 1572864) | ((-1) - i2)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((-1) - (((-1) - i3) | ((-1) - 64)) == 0 && composerStartRestartGroup.changed(menuItemColorsItemColors)) ? 1048576 : 524288)));
        }
        int i11 = (-1) - (((-1) - i3) | ((-1) - 128));
        if (i11 != 0) {
            i4 = (i4 + 12582912) - (i4 & 12582912);
        } else if ((i2 & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changed(dropdownMenuItemContentPadding) ? 8388608 : 4194304;
        }
        int i12 = i3 & 256;
        if (i12 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 100663296));
        } else if ((-1) - (((-1) - i2) | ((-1) - 100663296)) == 0) {
            int i13 = composerStartRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            i4 = (i4 + i13) - (i4 & i13);
        }
        if ((i4 & 38347923) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i7 != 0) {
                    companion = Modifier.Companion;
                }
                mutableInteractionSource2 = null;
                if (i8 != 0) {
                    function25 = null;
                }
                if (i9 != 0) {
                    function24 = null;
                }
                if (i10 != 0) {
                    z3 = true;
                }
                if ((i3 + 64) - (i3 | 64) != 0) {
                    menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                    i4 = (i4 - 3670017) - (i4 | (-3670017));
                }
                if (i11 != 0) {
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                }
                if (i12 == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 64) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-3670017)));
                }
                mutableInteractionSource2 = mutableInteractionSource;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1826340448, i4, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
            }
            MenuKt.DropdownMenuItemContent(function2, function0, companion, function25, function24, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, (-1) - (((-1) - i4) | ((-1) - 268435454)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            mutableInteractionSource2 = mutableInteractionSource;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final boolean z4 = z3;
            final MenuItemColors menuItemColors2 = menuItemColorsItemColors;
            final PaddingValues paddingValues2 = dropdownMenuItemContentPadding;
            final Modifier modifier2 = companion;
            final Function2<? super Composer, ? super Integer, Unit> function26 = function25;
            final Function2<? super Composer, ? super Integer, Unit> function27 = function24;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i14) {
                    AndroidMenu_androidKt.DropdownMenuItem(function2, function0, modifier2, function26, function27, z4, menuItemColors2, paddingValues2, mutableInteractionSource2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    public static final PopupProperties getDefaultMenuProperties() {
        return DefaultMenuProperties;
    }
}
