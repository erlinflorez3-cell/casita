package androidx.compose.foundation.contextmenu;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.compose.ui.window.PopupProperties;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.valid.vssh_bio_validation_library.utils.BioValidationConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xu;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: ContextMenuUi.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яć\u0014D߬)\u001e\u007f\u007fLDiw\fA\u001c0\u0013ǞJ~01\u001aՄ\u000ffx98DkH6Ri*\u0017ӆ\u00044:[,qY;]\u001a\u0014\"\u0011OdgonP[\u0013C\u001d\u0012\u001eюr,W^\u0001ز\u001a\u000fHBw?IMw=?a|6\u001b :\">z\r\u00010*P\u0010|zKK\"\u00128@v<Z\r[\u000b\"\u0012\f?(\u00014\\oN<Lt]P/+\u0003oFfbm8\u0015M;O\u0005+\u001b\u0001y\u001eY?g;\u001b%a\u000e\u001fR\nK3Y\u007fJ\u001d~7);I\"fFZ\u0010\u0014C4}\u001bǁv&b\u0015Ōd\f-<\u0016bׂT\u000e6\n\u0013c\u001bO\u001c\u000e40x2;.~\b<H%vaVh\u0002\rY0~o@/%.2[?!f_lS\u0019|C,-\u0013\u001e1\u0019\u0007Cke\u001eoC4ƻ{[7kPCNi\u001a[Cs*\rr\u0004:\u0004^P\u0016.*\u001fѧ\u001b%=ki-/\t\u001aNTi\u0007\u0005\u000fq\u0002\b\u0019Gغ&n$VBU\u001az\\d3t\u0001XfM)MJv7\b\u001668b\b>1%>W}\u0007\u001apS]\u00180Gfee\u001fo\u001caQ^a4\u0002x\u001e\u0006j\b$ALb3}vDc\f\teV0ĘLj\u0016\tBC«\u0010\u0013@e\n`BLI\u0019\u000b\u001ex\u0007,cY|7\u0002\u000br\u001e\"l94\u0005y$#\u0012/n\rvug\u0007TD|\u000f.]V_Y17e$x4+H\u0017\u0001\u0004\u007fupzUƥp\u0016{fB\u001fک\u001e9_VU2\u001d'A20,uRxf_v*')'*\u0015Ai<\u0013 j\u001fV'iߝST%N\u000f|\u0001P d.\u0013\nH\u0011F\u0012\u0003;_Lx\u000b\u0003\bU\u00158ہ\u0004ȔǪ)\u0003uR\u000bfEa5O.wBH=csh\u001e\\*f\u001dU\re2E*\u0016ͪaГЄ6=>|g0VR2!\u001bBv\u0004 \bp>d\u00139GO\u001b\tVfw;5\u0004e\u0015c%p\u0005\u0006j\u0017}-L.\u000eC:CϘ\u0013٫ǜ)\u0013S\fu'\u0006kjEb\u0011 \n*_\u0017\u0012JrP\\]a\u0017f\u001esF`qAh\u0004J@<4ZfN\u000bcnwв(z.E\u0016ʕmϪDǠ?b\u0016֊\t^\\H\u0013a]b',\u000f\u0002/?,|M13r\u001d\u07bf1ҕ6\u0001[߹)'xU\u0017fS2\u001bǷ\fЬ,X\tՊԸ]HQ\u0005<\u0085cWlÉsG"}, d2 = {"\u0012dU.h3M1#\b\n^?\fp/n\u0010\u0006\u0006G\u000b$%", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@#?b\r J|\u001e.VS\u0005I>'$htHnc5^T1NV[:2", "5dc\u0011X-:c \u000eXh5\f\tBtg(\u0005P^!\u001eQ|\u001czr.>c\r\u001cFq 7[", "u(E", "5dc\u0011X-:c \u000eXh5\f\tBtg(\u0005P^!\u001eQ|\u001c", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~W\b)Fm)=UCD{}{\u001fqp9\u001ar\u0014N\u007f7%VU6i`H", "\u0012dU.h3M>#\n\u000bi\u0017\n\u0013:e\r7\u007f@\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0013\u001b Fy \u0006a/@i\t\u000bDw!.ZR?kBs", "\u0012hb.U3>Rt\u0006\u0006a(", "", "\u0011n]AX?M;\u0019\b\u000b<6\u0004\u00197n", "", "1n[<e:", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s8TSCt\"\u001c\u001fsa\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn3c\u0007/7\u0001%6MLK5\u0012(\u001ewaL\u0016K,W\u0007\u0005QSX9j(Y9\u001d\u0011g\u0018R* NWK,yNE\u001fQ<MK#r\u007f\u0010\u0017\u00125wF)\\\u001aV\u0001\u0019~\u000b.yN#`\nP?Tf4m\u001a)}lC83\u0018{\"h>7*\u0013z`\u001bvQ\r1eQ!\u0006B2>7hVN~YDtp|U\u0004\u0003\u001c@X\u0002\u0001X\u0011G%", "\u0011n]AX?M;\u0019\b\u000bB;|\u0011", ":`Q2_", "", "3mP/_,=", "", ":dP1\\5@7\u0017\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "7b^;66E]&", "=m29\\*D", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}p'| \u0016Ty\u0012;\nn3c\u0006+A{\u0016wNMKt3\u001a$lkBPa6W\u0006'Z[V,eb<\u001b\u001e\u001bi\u000ea:t\u0005bQ\u0002xKA,\u0016\u00020}Dg\u000e\u0016\u001a\rH4nL^\u001bQ\b\u0015?Q-2.c^}HEEo\u007fK\u0012i,c>Cm\u0019\u0003!di`7\b\u000bW\u001b{`CHwP\u0017\n<.G;1-KydCx0hP\r\u007f[3h})\u00041\u000e=8\u007fE\u0015Te'Bh\u0002_\u0002C=0%CF\u0017>^-svF\u0019r-aQ\u001br>@\u001dme-&\u0019\u000fh!i5n5d\u001b\u0016v", "\u0011n]AX?M;\u0019\b\u000bI6\b\u0019:", ">n_Bc\u0017Ha\u001d\u000e~h5g\u00169v\u0004'{M", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0013\u001b Fy \u0006a/@i\t\u000bA{\u001a=QMDVA(&l`9\u00149", "=m36f4Ba'", "1n]AX?M;\u0019\b\u000b;<\u0001\u0010.e\r\u0005\u0003J~\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@#?b\r J|\u001e.VS\u0005I>'$htHnc5^d%QWN\u0002", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ)\u001bPn\u0018N@\u0010?d\u000e+\"w$2\\GEt\u001f+\u001fye8\u0007p\u00025|1VSR5&W\u0004E]\u0013j\u0017L:\u0011\u000fbOmOT@\u001d\u00170S\u000b\u0006>g\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010icC/KDf+h\flrC6C#!{\u001d\u001a{\u001a,\u0014\u0004^\u001b\u0001RChqW\"y43Bwd\u0010Cy^Kt:.S{\u0001\"{6~4\u0004-\u0017C\u00126m\u0015)q\u001fHk\u0007j\u0013bK6-:E\\D\\k?mN\u0017f.e\u0012\u0017p~\u0012)ncrL\u0019\u0010)lB1j^\u000eAV\u0005Q\u0013m\u001f/Q\tP[C\"\u0019\u00103qmI\rx^\t%zR\"lfff*\t", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ)\u001bPn\u0018N@\u0010?d\u000e+\"w$2\\GEt\u001f+\u001fye8\u0007p\u00025|1VSR5&W\u0004E]\u0013j\u0017L:\u0011\u000fbOmOT@\u001d\u00170S\u000b\u0006>g\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010icC/KDf+h\flrC@D3\u001bu\"dma6S|c\u001apa}qpUb[H-<|_PN;+#p0\u001eX\u0006{\u0011E\"r5|8\u000eB*\u007fq\u0015Tv\u001cF^Br6dL146Ih#/'f", "1n\\=h;>1#\b\n^?\fp/n\u0010\u0006\u0006G\u000b$%", "0`R8Z9Hc\"}hm@\u0004\t\u0013d", "", "4na2Z9Hc\"}hm@\u0004\t\u0013d", "uH8\u0019T5=`#\u0003yquz\u00137p\n6{\n\u000e' Vs\u0016<@\u0003?a\t*Em#\u00041'~R0'\u0014uk=\u0006vuL\u0001/RV\\,&S|M\u001d\u0011V\u001dR5\u0016NWK-}DJ.\u0010,R\u0012\u0005F\u000b\u0015%\u000eHyXB_ %\u0004\u001c\u007fN7>", "2hb.U3>Rv\t\u0002h9", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\n^!\u001eQ|{Kr45@\u0002.FC", "2dU.h3M1#\u0006\u0005k", "2hb.U3>Rv\t\u0002h9DW!Te\u0015^,", "uKP;W9HW\u0018Hxh5\f\t8tI5{NJt!Ny\u001b*\u0006!DYd$E|k\u0013\u0011(", "3mP/_,=1#\u0006\u0005k", "3mP/_,=1#\u0006\u0005ksKz\u001eKl\u000bg", "@db<_=>1#\u0006\u0005k", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "@db\u0016W", "/sc?<+", "@db<_=>1#\u0006\u0005ks~U\u00191b*\n", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEq [h\u001a", "@db<_=>1#\u0006\u0005k\u001a\f\u0005>ef,\nO", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ContextMenuUi_androidKt {
    private static final float DisabledAlpha = 0.38f;
    private static final PopupProperties DefaultPopupProperties = new PopupProperties(true, false, false, false, 14, (DefaultConstructorMarker) null);
    private static final ContextMenuColors DefaultContextMenuColors = new ContextMenuColors(Color.Companion.m4215getWhite0d7_KjU(), Color.Companion.m4204getBlack0d7_KjU(), Color.Companion.m4204getBlack0d7_KjU(), Color.m4177copywmQWz5c$default(Color.Companion.m4204getBlack0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m4177copywmQWz5c$default(Color.Companion.m4204getBlack0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);

    public static /* synthetic */ void getDefaultContextMenuColors$annotations() {
    }

    public static final void ContextMenuPopup(final PopupPositionProvider popupPositionProvider, final Function0<Unit> function0, Modifier modifier, final Function1<? super ContextMenuScope, Unit> function1, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(712057293);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ContextMenuPopup)P(3,2,1)108@4164L26,104@4014L241:ContextMenuUi.android.kt#3xeu6s");
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = i2 | 6;
        } else if ((6 & i2) == 0) {
            i4 = (composerStartRestartGroup.changed(popupPositionProvider) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i5 = (-1) - (((-1) - i3) | ((-1) - 4));
        if (i5 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i4 |= composerStartRestartGroup.changed(companion) ? 256 : 128;
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 3072));
        } else if ((i2 + 3072) - (3072 | i2) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i5 != 0) {
                companion = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(712057293, i4, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.android.kt:103)");
            }
            ContextMenuColors contextMenuColorsComputeContextMenuColors = computeContextMenuColors(0, 0, composerStartRestartGroup, 0, 3);
            int i6 = (i4 + PhotoshopDirectory.TAG_QUICK_MASK_INFORMATION) - (1022 | i4);
            int i7 = (i4 << 3) & 57344;
            ContextMenuPopup(popupPositionProvider, function0, companion, contextMenuColorsComputeContextMenuColors, function1, composerStartRestartGroup, (i6 + i7) - (i6 & i7), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt.ContextMenuPopup.1
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
                    ContextMenuUi_androidKt.ContextMenuPopup(popupPositionProvider, function0, modifier2, function1, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))), i3);
                }
            });
        }
    }

    public static final void ContextMenuPopup(final PopupPositionProvider popupPositionProvider, final Function0<Unit> function0, Modifier modifier, final ContextMenuColors contextMenuColors, final Function1<? super ContextMenuScope, Unit> function1, Composer composer, final int i2, final int i3) {
        int i4;
        final Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1447189339);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ContextMenuPopup)P(4,3,2)126@4681L257,122@4530L408:ContextMenuUi.android.kt#3xeu6s");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changed(popupPositionProvider) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        if ((2 & i3) != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function0) ? 32 : 16)));
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 = (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 256 : 128)));
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 3072));
        } else if ((i2 & 3072) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(contextMenuColors) ? 2048 : 1024)));
        }
        if ((i3 + 16) - (16 | i3) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 24576));
        } else if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            int i6 = composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
            i4 = (i4 + i6) - (i4 & i6);
        }
        if ((i4 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (i5 != 0) {
                companion = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1447189339, i4, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.android.kt:121)");
            }
            PopupProperties popupProperties = DefaultPopupProperties;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(795909757, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt.ContextMenuPopup.2
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

                public final void invoke(Composer composer2, int i7) {
                    ComposerKt.sourceInformation(composer2, "C127@4727L205,127@4691L241:ContextMenuUi.android.kt#3xeu6s");
                    if ((i7 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(795909757, i7, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup.<anonymous> (ContextMenuUi.android.kt:127)");
                    }
                    ContextMenuColors contextMenuColors2 = contextMenuColors;
                    Modifier modifier2 = companion;
                    final Function1<ContextMenuScope, Unit> function12 = function1;
                    final ContextMenuColors contextMenuColors3 = contextMenuColors;
                    ContextMenuUi_androidKt.ContextMenuColumn(contextMenuColors2, modifier2, ComposableLambdaKt.rememberComposableLambda(1156688164, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt.ContextMenuPopup.2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                            invoke(columnScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(ColumnScope columnScope, Composer composer3, int i8) {
                            ComposerKt.sourceInformation(composer3, "C128@4753L31,*132@4893L15:ContextMenuUi.android.kt#3xeu6s");
                            if ((-1) - (((-1) - i8) | ((-1) - 17)) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1156688164, i8, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup.<anonymous>.<anonymous> (ContextMenuUi.android.kt:128)");
                            }
                            ComposerKt.sourceInformationMarkerStart(composer3, 1358376149, "CC(remember):ContextMenuUi.android.kt#9igjgp");
                            Object objRememberedValue = composer3.rememberedValue();
                            if (objRememberedValue == Composer.Companion.getEmpty()) {
                                objRememberedValue = new ContextMenuScope();
                                composer3.updateRememberedValue(objRememberedValue);
                            }
                            ContextMenuScope contextMenuScope = (ContextMenuScope) objRememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            Function1<ContextMenuScope, Unit> function13 = function12;
                            ContextMenuColors contextMenuColors4 = contextMenuColors3;
                            contextMenuScope.clear$foundation_release();
                            function13.invoke(contextMenuScope);
                            contextMenuScope.Content$foundation_release(contextMenuColors4, composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            int i7 = (-1) - (((-1) - ((i4 + 14) - (14 | i4))) & ((-1) - 3456));
            int i8 = (i4 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i4 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
            AndroidPopup_androidKt.Popup(popupPositionProvider, function0, popupProperties, composableLambdaRememberComposableLambda, composerStartRestartGroup, (i7 + i8) - (i7 & i8), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt.ContextMenuPopup.3
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

                public final void invoke(Composer composer2, int i9) {
                    PopupPositionProvider popupPositionProvider2 = popupPositionProvider;
                    Function0<Unit> function02 = function0;
                    Modifier modifier2 = companion;
                    ContextMenuColors contextMenuColors2 = contextMenuColors;
                    Function1<ContextMenuScope, Unit> function12 = function1;
                    int i10 = i2;
                    ContextMenuUi_androidKt.ContextMenuPopup(popupPositionProvider2, function02, modifier2, contextMenuColors2, function12, composer2, RecomposeScopeImplKt.updateChangedFlags((i10 + 1) - (i10 & 1)), i3);
                }
            });
        }
    }

    public static final void ContextMenuColumn(final ContextMenuColors contextMenuColors, Modifier modifier, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-921259293);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ContextMenuColumn)P(!1,2)154@5499L21,145@5128L427:ContextMenuUi.android.kt#3xeu6s");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i4 = (composerStartRestartGroup.changed(contextMenuColors) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = (-1) - (((-1) - i3) | ((-1) - 2));
        if (i5 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(companion) ? 32 : 16;
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i6 = composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
            i4 = (i4 + i6) - (i4 & i6);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 147)) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i5 != 0) {
                companion = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-921259293, i4, -1, "androidx.compose.foundation.contextmenu.ContextMenuColumn (ContextMenuUi.android.kt:144)");
            }
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m1020paddingVpY3zN4$default(IntrinsicKt.width(BackgroundKt.m573backgroundbw27NRU$default(ShadowKt.m3842shadows4CzXII$default(companion, ContextMenuSpec.INSTANCE.m693getMenuContainerElevationD9Ej5fM(), RoundedCornerShapeKt.m1301RoundedCornerShape0680j_4(ContextMenuSpec.INSTANCE.m685getCornerRadiusD9Ej5fM()), false, 0L, 0L, 28, null), contextMenuColors.m676getBackgroundColor0d7_KjU(), null, 2, null), IntrinsicSize.Max), 0.0f, ContextMenuSpec.INSTANCE.m694getVerticalPaddingD9Ej5fM(), 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            int i7 = i4 << 3;
            int i8 = (i7 + 7168) - (i7 | 7168);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            int i9 = i8 >> 6;
            function3.invoke(ColumnScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf((-1) - (((-1) - ((i9 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i9 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))) & ((-1) - 6))));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt.ContextMenuColumn.1
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

                public final void invoke(Composer composer2, int i10) {
                    ContextMenuUi_androidKt.ContextMenuColumn(contextMenuColors, modifier2, function3, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))), i3);
                }
            });
        }
    }

    public static final void ContextMenuItem(final String str, final boolean z2, final ContextMenuColors contextMenuColors, Modifier modifier, Function3<? super Color, ? super Composer, ? super Integer, Unit> function3, final Function0<Unit> function0, Composer composer, final int i2, final int i3) {
        int i4;
        Function3<? super Color, ? super Composer, ? super Integer, Unit> function32 = function3;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(791018367);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ContextMenuItem)P(2,1!1,4)189@6696L221,182@6391L1588:ContextMenuUi.android.kt#3xeu6s");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            int i5 = composerStartRestartGroup.changed(str) ? 4 : 2;
            i4 = (i5 + i2) - (i5 & i2);
        } else {
            i4 = i2;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            i4 |= 48;
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(z2) ? 32 : 16)));
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(contextMenuColors) ? 256 : 128)));
        }
        int i6 = (-1) - (((-1) - i3) | ((-1) - 8));
        if (i6 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 3072));
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            int i7 = composerStartRestartGroup.changed(companion) ? 2048 : 1024;
            i4 = (i4 + i7) - (i4 & i7);
        }
        int i8 = (-1) - (((-1) - i3) | ((-1) - 16));
        if (i8 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 24576));
        } else if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function32) ? 16384 : 8192)));
        }
        if ((i3 + 32) - (i3 | 32) != 0) {
            i4 = (i4 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536)));
        }
        if ((74899 + i4) - (74899 | i4) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i6 != 0) {
                companion = Modifier.Companion;
            }
            if (i8 != 0) {
                function32 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(791018367, i4, -1, "androidx.compose.foundation.contextmenu.ContextMenuItem (ContextMenuUi.android.kt:181)");
            }
            Alignment.Vertical labelVerticalTextAlignment = ContextMenuSpec.INSTANCE.getLabelVerticalTextAlignment();
            Arrangement.HorizontalOrVertical horizontalOrVerticalM898spacedBy0680j_4 = Arrangement.INSTANCE.m898spacedBy0680j_4(ContextMenuSpec.INSTANCE.m687getHorizontalPaddingD9Ej5fM());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1814201532, "CC(remember):ContextMenuUi.android.kt#9igjgp");
            int i9 = (i4 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i4) == 32 ? 1 : 0;
            int i10 = (458752 & i4) != 131072 ? 0 : 1;
            int i11 = (i9 + i10) - (i9 & i10);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i11 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuItem$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (z2) {
                            function0.invoke();
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierM1020paddingVpY3zN4$default = PaddingKt.m1020paddingVpY3zN4$default(SizeKt.m1066sizeInqDBjuR0(SizeKt.fillMaxWidth$default(ClickableKt.m606clickableXHw0xAI$default(companion, z2, str, null, (Function0) objRememberedValue, 4, null), 0.0f, 1, null), ContextMenuSpec.INSTANCE.m684getContainerWidthMinD9Ej5fM(), ContextMenuSpec.INSTANCE.m692getListItemHeightD9Ej5fM(), ContextMenuSpec.INSTANCE.m683getContainerWidthMaxD9Ej5fM(), ContextMenuSpec.INSTANCE.m692getListItemHeightD9Ej5fM()), ContextMenuSpec.INSTANCE.m687getHorizontalPaddingD9Ej5fM(), 0.0f, 2, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM898spacedBy0680j_4, labelVerticalTextAlignment, composerStartRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1020paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 554565222, "C212@7698L275:ContextMenuUi.android.kt#3xeu6s");
            if (function32 == null) {
                composerStartRestartGroup.startReplaceGroup(554568909);
            } else {
                composerStartRestartGroup.startReplaceGroup(554568910);
                ComposerKt.sourceInformation(composerStartRestartGroup, "*204@7349L330");
                Modifier modifierM1059requiredSizeInqDBjuR0$default = SizeKt.m1059requiredSizeInqDBjuR0$default(Modifier.Companion, ContextMenuSpec.INSTANCE.m688getIconSizeD9Ej5fM(), 0.0f, ContextMenuSpec.INSTANCE.m688getIconSizeD9Ej5fM(), ContextMenuSpec.INSTANCE.m688getIconSizeD9Ej5fM(), 2, null);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1059requiredSizeInqDBjuR0$default);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3671constructorimpl2 = Updater.m3671constructorimpl(composerStartRestartGroup);
                Updater.m3678setimpl(composerM3671constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m3678setimpl(composerM3671constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composerM3671constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM3671constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM3671constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1218311042, "C210@7612L65:ContextMenuUi.android.kt#3xeu6s");
                function32.invoke(Color.m4168boximpl(z2 ? contextMenuColors.m679getIconColor0d7_KjU() : contextMenuColors.m677getDisabledIconColor0d7_KjU()), composerStartRestartGroup, 0);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceGroup();
            BasicTextKt.m1314BasicTextVhcvRP8(str, rowScopeInstance.weight(Modifier.Companion, 1.0f, true), ContextMenuSpec.INSTANCE.m695textStyle8_81llA(z2 ? contextMenuColors.m680getTextColor0d7_KjU() : contextMenuColors.m678getDisabledTextColor0d7_KjU()), (Function1<? super TextLayoutResult, Unit>) null, 0, false, 1, 0, (ColorProducer) null, composerStartRestartGroup, (i4 & 14) | 1572864, BioValidationConstants.SC_EXPIRED_SESSION_CORE);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final Function3<? super Color, ? super Composer, ? super Integer, Unit> function33 = function32;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt.ContextMenuItem.3
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

                public final void invoke(Composer composer2, int i12) {
                    String str2 = str;
                    boolean z3 = z2;
                    ContextMenuColors contextMenuColors2 = contextMenuColors;
                    Modifier modifier3 = modifier2;
                    Function3<Color, Composer, Integer, Unit> function34 = function33;
                    Function0<Unit> function02 = function0;
                    int i13 = i2;
                    ContextMenuUi_androidKt.ContextMenuItem(str2, z3, contextMenuColors2, modifier3, function34, function02, composer2, RecomposeScopeImplKt.updateChangedFlags((i13 + 1) - (i13 & 1)), i3);
                }
            });
        }
    }

    public static final ContextMenuColors getDefaultContextMenuColors() {
        return DefaultContextMenuColors;
    }

    public static final ContextMenuColors computeContextMenuColors(int i2, int i3, Composer composer, int i4, int i5) throws Throwable {
        int i6 = i3;
        ComposerKt.sourceInformationMarkerStart(composer, 1689505294, "C(computeContextMenuColors)355@13081L7,356@13137L7,356@13100L846:ContextMenuUi.android.kt#3xeu6s");
        if ((i5 + 1) - (i5 | 1) != 0) {
            i2 = R.style.Widget.PopupMenu;
        }
        if ((i5 & 2) != 0) {
            i6 = R.style.TextAppearance.Widget.PopupMenu.Large;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1689505294, i4, -1, "androidx.compose.foundation.contextmenu.computeContextMenuColors (ContextMenuUi.android.kt:354)");
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Context context = (Context) objConsume;
        ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume2 = composer.consume(localConfiguration);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, -753201361, "CC(remember):ContextMenuUi.android.kt#9igjgp");
        boolean z2 = (-1) - (((-1) - (composer.changed((Configuration) objConsume2) ? 1 : 0)) & ((-1) - (composer.changed(context) ? 1 : 0))) == 1;
        Object objRememberedValue = composer.rememberedValue();
        if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
            ContextMenuColors contextMenuColors = DefaultContextMenuColors;
            long jM699resolveColorg2O1Hgs = m699resolveColorg2O1Hgs(context, i2, R.attr.colorBackground, contextMenuColors.m676getBackgroundColor0d7_KjU());
            ColorStateList colorStateListResolveColorStateList = resolveColorStateList(context, i6, R.attr.textColorPrimary);
            long jM698enabledColor4WTKRHQ = m698enabledColor4WTKRHQ(colorStateListResolveColorStateList, contextMenuColors.m680getTextColor0d7_KjU());
            long jM697disabledColor4WTKRHQ = m697disabledColor4WTKRHQ(colorStateListResolveColorStateList, contextMenuColors.m678getDisabledTextColor0d7_KjU());
            objRememberedValue = new ContextMenuColors(jM699resolveColorg2O1Hgs, jM698enabledColor4WTKRHQ, jM698enabledColor4WTKRHQ, jM697disabledColor4WTKRHQ, jM697disabledColor4WTKRHQ, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        ContextMenuColors contextMenuColors2 = (ContextMenuColors) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return contextMenuColors2;
    }

    /* JADX INFO: renamed from: resolveColor-g2O1Hgs, reason: not valid java name */
    private static final long m699resolveColorg2O1Hgs(Context context, int i2, int i3, long j2) throws Throwable {
        Class<?> cls = Class.forName(C1561oA.Yd("(6-<:51{2??F8BI\u0004\u001aGGN@TQ", (short) (FB.Xd() ^ 9185)));
        Class<?>[] clsArr = {Integer.TYPE, int[].class};
        Object[] objArr = {Integer.valueOf(i2), new int[]{i3}};
        short sXd = (short) (C1607wl.Xd() ^ 15440);
        short sXd2 = (short) (C1607wl.Xd() ^ 22759);
        int[] iArr = new int["\u0005x\fy\u0003\tn\u0011\u0017\u000b\u0005\u0005b\u0017\u0018\u0017\u000f\t\u001d\u001d\u000f\u001e".length()];
        QB qb = new QB("\u0005x\fy\u0003\tn\u0011\u0017\u000b\u0005\u0005b\u0017\u0018\u0017\u000f\t\u001d\u001d\u000f\u001e");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK((xuXd.CK(iKK) - (sXd + i4)) + sXd2);
            i4++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            int iM4232toArgb8_81llA = ColorKt.m4232toArgb8_81llA(j2);
            int color = typedArray.getColor(0, iM4232toArgb8_81llA);
            typedArray.recycle();
            return color == iM4232toArgb8_81llA ? j2 : ColorKt.Color(color);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static final ColorStateList resolveColorStateList(Context context, int i2, int i3) throws Throwable {
        Class<?> cls = Class.forName(Jg.Wd("\u0017\u000ehS7\u000em\u0015/\u0018}`6\u001f\n \u001c%\tmB2\u0015", (short) (OY.Xd() ^ 13395), (short) (OY.Xd() ^ 23582)));
        Class<?>[] clsArr = {Integer.TYPE, int[].class};
        Object[] objArr = {Integer.valueOf(i2), new int[]{i3}};
        short sXd = (short) (C1633zX.Xd() ^ (-14118));
        short sXd2 = (short) (C1633zX.Xd() ^ (-2498));
        int[] iArr = new int["(?o\u001b<D\u0013EUP|\fH\u001cVf@3]\u0012u(".length()];
        QB qb = new QB("(?o\u001b<D\u0013EUP|\fH\u001cVf@3]\u0012u(");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((i4 * sXd2) + sXd)));
            i4++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            ColorStateList colorStateList = typedArray.getColorStateList(0);
            typedArray.recycle();
            return colorStateList;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: renamed from: enabledColor-4WTKRHQ, reason: not valid java name */
    private static final long m698enabledColor4WTKRHQ(ColorStateList colorStateList, long j2) {
        int iM4232toArgb8_81llA = ColorKt.m4232toArgb8_81llA(j2);
        Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, iM4232toArgb8_81llA)) : null;
        return (numValueOf == null || numValueOf.intValue() == iM4232toArgb8_81llA) ? j2 : ColorKt.Color(numValueOf.intValue());
    }

    /* JADX INFO: renamed from: disabledColor-4WTKRHQ, reason: not valid java name */
    private static final long m697disabledColor4WTKRHQ(ColorStateList colorStateList, long j2) {
        int iM4232toArgb8_81llA = ColorKt.m4232toArgb8_81llA(j2);
        Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, iM4232toArgb8_81llA)) : null;
        return (numValueOf == null || numValueOf.intValue() == iM4232toArgb8_81llA) ? j2 : ColorKt.Color(numValueOf.intValue());
    }
}
