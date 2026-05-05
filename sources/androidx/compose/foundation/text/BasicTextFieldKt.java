package androidx.compose.foundation.text;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.HoverInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.foundation.text.input.internal.SingleLineCodepointTransformation;
import androidx.compose.foundation.text.input.internal.TextFieldCoreModifier;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifier;
import androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifier;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
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
/* JADX INFO: compiled from: BasicTextField.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яő\u0014D߬)\u001e\u007f\u007fL܀kt\u001aA\u000e0\u0011.J~0,\u001aՄ\u000ff\u000198ǏmHDR[ճ\u0017k\n=,[*qK;k\u001a\u0006̝\u0011OdgoñRZ!C\u0017إ\u001ex\u0001,Qǁ\u0001](\u000f:ԏw?IMw=O`|6\u001b :\"Ny\r\u00010*P\u0010|zKK\"\u00128ϋx:h\rUĨ\"\u0012\u001c>(ҵ&\\}N>Hr]B/9\u0003qBT'g0\u0013M\u0015FZ(\u0015vw\u001e3¨?5+%[Έ\u000fRq?\u000b?w=\rh5-3ɞ{WLX\bϬ\u001d+e\rer,^\rQn\u0018/+UeSP$(\u007fz\u0002\u000fD\u0004$\u0006/H4/2ȭ\u0007\u001c6\rr\u0002D\u0001\u0006lG\u0018z\u0010<G+\u000639@3f\u007fik\u001fT7\n\u000e%\u001eQ\u000b\u001f'aT\u001ck-\u001b\u0003\u0002\u00029W@KTf\fo<\u001c\u0011!h\b*\u0012>_\u007f]\u000bA4\u001d%EkQ#O|2PJg\u0005\u0017xjih\u0001[p(t\u0016E>!\f\tY\u0015;qPbnDA]\u001ed\u0007, #9l\u000fL%5\u0012dN\u0017\u0004\u0019fύ\u000e/5\u0002G_t\b\u001eY?dYRae a\u0001z*>jyۖ\\fHq<bb(0Q`l&v*d~\u0012\u00192M\u001344ZSId\u001bH\u0011AZC\u0013\b\u000e~\u0019\u0018\u0005TAI\u001bk:s7\u007f\u0001bvou\u001fa,+\bh2ۮU5'NmʚgB\u007f;\u0007-w0KuQ_L\u001b\u001c&[\u0002 $!QQ]EC\u0015\u0005)@\u000bEEz|\u0016WS\u00125\u0006\u0015y=E\u00196m\bx|Db\u0001I}aG(|^\u00011 d.\t\u0012L\u0001Gqd#[lZ#\u000b_<\\J\u0015\u00075\u001dS\u0014 (\u00035;W?\u001dD\rDe\u001bak\u007f\b^\nd\u001f&#}\u0014Es-\u007ffa_H:fc\b\u0018й&.r\u001eRNp\u0014\u0018D\u000f:3PXCtp\u0005<c\n]\u0015֨\u000b,\u0013\u000f\u0007c@\u0013}\u001dL0u)\"c.\u001adC32eS\u0016\u0010\u001eSb\u000bX8\"\r\u00120\u001d<LE&Ve\u0006!2\u001crFZqCh\u0005J.<6B;6\nsZo\u0006\u001e!\u0018F\u000e6G8HsI\u0002&T'f\u001dGϖdEnMBݣ}\u001d66xc55qT\u0002Gc`/\u0004-\u0017J\u0003[\u000fh5+r\u0003I\u001d8X/\u000fs\u000esO\b6\u0012NAm\u001aw<>\u001e|+K0\u001bg[Ae|0l\u0016md|n'\u0018lR\\0A~)\f>B\u0010\u000f\u0019)gr\u001es]RTwEt2\u0001EvY\r\u0012|qy3-4?]COj\"[\u0014W\u0002p.\u000e& 5:\r!\u000b\u000f>x\u0010])P.}&d\u0012\tAj0\u0006>J#v8^8<U\u0002A!+^\b\f('F'9\u000e\u001eBy\u000b);ilq'm6\u0013\u0003Ap\np=PK\rUfܻ\u0017X`sñW*^,\u0010\u001a\u001bB/8\u000ehOJ_exp\u001aS\n=Į3k0\u001bw5ݟ\"}-5\u000eő)b+-;\u0005Qnh\u0017\n\u0005B\u0006<\u000fz6\u0014\r\u00189\u0016\r~v\r!\u0015DF!\"\u0013_g\u001f%[\u001bNx\u00072My,'1`H37`\u0015 .|\u0011\u0011Ezt.4r\u000fx\u007fu:EF\u0003LJ-_${t\u001b&yVhH\u000e,\u001f?)/\tjPDb\u001a*ni3o#A\u0007\u001b8\u0014$\u001f\u0019c \u0002Y+*\u000f9\u0019\rm/aq@sE);/='Kil;3K}X7\u000e\u0012ex\u0019]ef\u000f\u00100weu&\u007fUN\u001f\"!:#4\u0016S\u0006K1VKw\\nx$\t\n&8n\u0007o3c|\u0013\u0004\f<iFw\u0013tɈ8A\u0001MԯHH0H|\rKix{\u0011J3\u007f$9\u001f\u0006W7E-ӻSqFd\u0010w٬3\\ky+Ʊ\u0003H5y6(Kp]83E\u0012\u0003\"\u001bz{\u0001w\u001cH\u0014\u001d\r26ATp\u007f\u000f!FW{|L6j\u007feA\u0011\u0013p\u0015*^<K$\u000b4 ^N\u001d\u0002\fUx\u0015A=wyGG d\u0014!K \f+\f%uz_?\u0004\u0003\tC?3\u0019\u001fbXc\u0018\r\u000b[!Y\u0018C\u0015.t[4MVLNBX4CujN\u0010R/\\(\u001cg`BV~hYu\r,!MUC\u007f\u000f4r7\nh?[g]tRcBEx0#@G\u001f\u0013\u0019?k9`E$>7>\n@tte\u0019}c \u0005qJO34XĪEKr\u0010͑C#]Z\u000f\u0012&C4\b\u0019*\t\"#k\u001e\"\u000e\u0007zf̨-HQ\u0013Wk߁n\u000f\t4$͇\u000bFX\u001e=4\u0015\u0013 Chw@Zl!\u0019U~\u0003\b:g\u007ff#\u0018]G;uGB_\"AiU_\"ui\\\u0007FG],@!\u000b2\u001dTk,N/0%`{m\u0019}\u0005f\u0017YByHd(\u0002\u0017jDcLL`lGw\u007f\u0004!QR\u0014!`\u001fzq\u0016hl:ZNH\u0019#1\u0007Qa%HOD%X\u00189@\"o^k]S|z\f\u0014jo.-{\fjf\u001fu,\u000b+\u001dJvt\u0014l3g@\u0006{/`J\tpL5`'{\b ,$\u000b+%\\tYR_\u00177r\u0013!SO Aeq_L#\u001f)V\u00184]X)r\u0007uï2{\fXˬF\u0006;\bQy\u0002OgsU:\u0004X9\u007fywN\u0011\u001aB˲gJ)\t0gˆa.[8\u001flJ\u001bY\u00028&Y(\u0016W?\u0002vw\u00111ؗ'\u0001\u001dz0]t4\u0011%7i<3\u00038&2\u001c\u0002:eʾk4O\u0002ui\rЧE/ \u0007\"ɘoȽ/G\u0016ɨ6H]L\u0006u\n>+Ń4αs\u00069\u0010\u0002bݜF]݆\fjB3R{uKjӾׇ.\u0080^n|6\u000fP\u0010X\u0014ӴǮ\u0014ؽB{7mX%\u000e)>՛è\t߀!?_\u0011|\u000br?~Кӽ>Ҵ\u0013Pf3&\u001b0C\"ֵΓ\u0016"}, d2 = {"\u0012dU.h3MB\u0019\u0012\n?0|\u0010.D\u007f&\u0006M|&!T", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006B,L\u00014C[X92", "\u001bh]!b<<V\bz\b`,\fv3z\u007f\t\u0006Mc\u0013 Fv\u000eJ", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGd)JYS", "\u0018", "\u0010`b6V\u001b>f(_~^3{", "", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006Q;J\u0006'\u001d", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "3mP/_,=", "", "@dP1B5Eg", "7m_Bg\u001bKO\"\r{h9\u0005\u0005>i\n1", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r\u001ft?.$Wn5\u0010q-X\u0004/C[R6e(", "BdgAF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "9dh/b(KR\u0003\n\nb6\u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001dm*+W?Hj\u001e)$lkB\u00159", "=m:2l)HO&}V\\;\u0001\u00138", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r!kH\u001b\u001fdn8ba;R\u00010*HW+cR\u007f\u0013", ":h]2?0FW(\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006J0Wv\u000eKTR;j(", "=mC2k;%O-\t\u000bm", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "5dc\u001fX:NZ(", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "1ta@b9\u001b`)\r}", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "=tc=h;-`\u0015\b\t_6\n\u0011+t\u00042\u0005", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r%{C)%wPF\u0003l:O\u00014OH]0f[H", "2dR<e(M]&", "Aba<_3,b\u0015\u000ez", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u00133f\b'>[%*\\C\u0011", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005Z41$Ie9\u000eb\u001a]r6G\"5(eQ\u007fG\u0018\u0011mWL5\u0015\u0010cO$8T;ho6H\u0006<l\u0001\u0019k\u0003*QlKU\u001dQ}\u0014\t\u000b'rNdi\bG\u000bFl:m\u000b[,`DCm#q,*2T7\u0015\fbZV[\u0005wv6&vA2?whNA~YF}|\u0006G\u0005v\u001f<\\s>>+\u000e<5@r\u0005\u0015w\u001c\bmx(;&0'9E*\"SRcKS:\u0017g,k\f\ru~/#mpmV\u000fP^!k>`[\u0010;\\\u000f\bXo(6\u0010dBov\u001f\u0005\u0014#WpXG%]\u000foW@+^\u001e\r\u0007e+e, Ed\u0019v*)8W#\u0012g4\u001b\u007fcL^\u007fH#|\u0015vdb\u007f3\u007f^\u0011]\u001e=GIu.A~\u0014 =c\u0007\b\u001cziOO\u001d\u000f.$Jc<asx\tq[-#u8e 7A\u000bQ<}b\u00020^\r\u000e{\f^aGC\u0012B\u000b8j5KDO\u0005CY9\u00145M{3hx%P1Z;T}\u0015\u0004\rt}$$u'\u0006P\u001dv\u001f9o\u001aUj\u007f&-*\u0005bWb#yjQG'\b_.\u0018Y Pp V\u000f)\r;XX\u007f\u001e/\u0017\u0002^\u000f{\\@\tcGv\u001f0E\u001c\u000fQ8\u0017.A\u0018b\u0016]\u0001{N<]O1\u0010~_- ^H\u00138u\u0001|^D\u0003u\u0007SwS~6\u001e\u0007C|rXL8$w*-\u0002/mEu7S.L\u001a+)d\u0017>ou.\nfy<r\\\f\u001b5G1DGFb'?I6\u0001~ew9$\u0017Z\r\u001d\u0007A\u0003,f3\u0002#I\u0005\u0016\u0016T_\u0013Ot\"E[ATa4)pm[\u00108j8To4\u001fHR2ab\u0003[K\u0015V0m$\u0007\"WM+BY9,\r\u001b@\u001cdB\u001aK\u0007\u0010Bg[DT\u0015\\J\u000f}=\u0018nSafM0KHg=0\u00020\u0006\u0018^J.!\u00029\u00194C6\u0010n\\#\u0014`ir+'\r\u001a8)CYl=X%\u0013;\u001e.(V\u007f\u0002\u0013C0t7\u000fN\b \u0018\u001as\u0013^|\u001e@THt8\u0003\u0016;Z8Kb!9E7[", "1nS2c6B\\(m\bZ5\u000b\n9r\b$\u000bD\u000b ", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PA6Mv2QPW;K_nF\"\u0013d\u001bV'\u001c\tcJy", "7r?.f:P]&}", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005Z41$Ie9\u000eb\u001a]r6G\"5(eQ\u007fG\u0018\u0011mWL5\u0015\u0010cO$8T;ho6H\u0006<l\u0001\u0019k\u0003*QlKU\u001dQ}\u0014\t\u000b'rNdi\bG\u000bFl:m\u000b[,`DCm#q,*2T7\u0015\fbZV[\u0005wv6&vA2?whNA~YF}|\u0006G\u0005v\u001f<\\s>>+\u000e<5@r\u0005\u0015w\u001c\bmx(;&0'9E*\"SRcKS:\u0017g,k\f\ru~/#mpmV\u000fP^!k>`[\u0010;\\\u000f\bXo(6\u0010dBov\u001f\u0005\u0014#WpXG%]\u000foW@+^\u001e\r\u0007e+e, Ed\u0019v*)8W#\u0012g4\u001b\u007fcL^\u007fH#|\u0015vdb\u007f3\u007f^\u0011]\u001e=GIu.A~\u0014 =c\u0007\b\u001cziOO\u001d\u000f.$Jc<asx\tq[-#u8e 7A\u000bQ<}b\u00020^\r\u000e{\f^aGC\u0012B\u000b8j5KDO\u0005CY9\u00145M{3hx%P1Z;T}\u0015\u0004\rt}$$u'\u0006P\u001dv\u001f9o\u001aUj\u007f&-*\u0005bWb#yjQG'\b_.\u0018Y Pp V\u000f)\r;XX\u007f\u001e/\u0017\u0002^\u000f{\\@\tcGv\u001f0E\u001c\u000fQ8\u0017.A\u0018b\u0016]\u0001{N<]O1\u0010~_- ^H\u00138u\u0001|^D\u0003u\u0007SwS~6\u001e\u0007C|rXL8$w*-\u0002/mEu7S.L\u001a+)d\u0017>ou.\nfy<r\\\f\u001b5G1DGFb'?I6\u0001~ew9$\u0017Z\r\u001d\u0007A\u0003,fMz#>\u0002\u0010#N-gKr\u0018C]INl\u0019-\u0017\u0010m\bCj6L\u007f%_S\u001e\u0011Rash\f\u0018K3.#\u0015\u001b^M0x\u0014:#\u000eZ;\u000fh6\u0015\u000ba\u001f/k\n\nX\u0017h{\u001eI\u001d\u001b\u0002OghfVKHv10\u000b9n]dJ/k^'\"iO6\u0004dpp\u0003fgtkG\u000fV/,Lt\\=X)G]k4)\\\u0005G\u00189q\u0007<P2}%'1j\u0003\\lx8R\t$*\n\u0015>\"\u001f:\u0016<bkwiGIp#[t2^S\u0015\u0018q\u0004f=\u0011\u0018S#Zqu\u0004oB \u000f*Z]\u0012-&}/Y\ry\u0018\u001b:bz\u0019?#J}\u001e\u0001Fe\u0007Oik\tZ\"yqUc\fd.YB\u0011\u0011nJe\u0003", "D`[BX", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|v2MJ:\\0%%h7", "=mE._<>1\u001cz\u0004`,", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "9dh/b(KRt|\nb6\u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001dm*+W?Hj\u0010\u001c$lkB\u00159", "Ah]4_,%W\"~", ";`g\u0019\\5>a", "", "DhbBT3-`\u0015\b\t_6\n\u0011+t\u00042\u0005", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#n$E}\u00125<P7tB\u001f\u001fui5\u0016g6WL", "2dR<e(MW#\bWh?", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "7m]2e\u001b>f(_~^3{", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W@\u007f0EhG\u000f7\u0001%\u000fQCBj%\u001a\u001cxa\u000fmi6]}+P\u0016S=d\u001csM\u001d\u0010i\u0012X4\u001bN:Q-lS;)\u0011w\u001fh7q\u007f\u0019 \u00124}:@`\u0018R\u0004#u\u000b9l\u0010AixKBIb7:\u0001T\u0004XC91\u001eu\u0018.2N8\u0012\u0007]\u001fr\u001c\nk1V\u0019\u000eGm-mnU3~iCt|\u0006G\u0005v\u001f<\\s>>+\u000e<5@r\u0005\u0015h\"Ngw\u0011;`K0oE<&N\u0015Iu\u0001;\u0018d,`q\u0019q9;\"s;JD\u0018\u0006j!_4t)~AZ\u0011HWo^(P\u000fKZu$\r\u0011-7tIV*\u001ef\u001a\u0005A,[\u001e\u0002^d' 8\u001fK/\u0004L\u0011[@L \u0013l7\u001fEWM\u001d{R\u001em\u0015\u0003_!~$I\bZM*>[K@CG} \u0012;o\u0018z&\u0002jL\u0007>\u000f4)Gb\u000eIf9\u001anW+blI$h.A\u000bPOrh\u00015^^\u001eqz$aHAM\t(Es!ImO\u0004O$P\u001a4X\u001f=`>\u0017Lk|4F}\u0012\n\rt|\u001c+,3qE.k%80s\u001c\u0019k\u001a6\u001bda]\u0016Z\u000flWL$\u0007I9\u0015\u001d F>{H\n(PDRG\nh1\u0012\u0006_\u0010@X\u0001\ng\u0004|.\u001dL\u0015\n\u0006^P{R+i\u0019O^rX>hU+UygG_OK\u001e6/\u001e\u000b^S?L\u0013]b\u0019\u00056\u001fI\u000fUn\u0018;Ady\u001cD@*sOrw\u0005!\u0006\u00198\\\r\u001f=p2\u0002\u0010oq|\u0003R\u0011e\u000f\u001d\u0015>7", ";h]\u0019\\5>a", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W@\u007f0EhG\u000f7\u0001%\u000fQCBj%\u001a\u001cxa\u000fmi6]}+P\u0016S=d\u001csM\u001d\u0010i\u0012X4\u001bN:Q-lS;)\u0011w\u001fh7q\u007f\u0019 \u00124}:@`\u0018R\u0004#u\u000b9l\u0010AixKBIb7:\u0001T\u0004XC91\u001eu\u0018.2N8\u0012\u0007]\u001fr\u001c\nk1V\u0019\u000eGm-mnU3~iCt|\u0006G\u0005v\u001f<\\s>>+\u000e<5@r\u0005\u0015h\"Ngw\u0011;`K0oE<&N\u0015Iu\u0001;\u0018d,`q\u0019q9;\"s;JD\u0018\u0006j!_4t)~AZ\u0011HWo^(P\u000fKZu$\r\u0011-7tIV*\u001ef\u001a\u0005A,[\u001e\u0002^d' 8\u001fK/\u0004L\u000eF3V\u0012\u0016r<\u000b\u000f#A\u001fxS\u001a{K<k[936\f \u0013%<VL\u0006\u001c4s\u001e&0\by\f\u0019|wC\u0004C\u001b!4AcA8G5\u0015vZ&\"1=-'v2\u0012[>}b\u00020#Gnx\u0006\u0013lBB\u000b~\u00170f+;pU\t;m\u001c\u000e6U 9nt_Ce\u0004>Ij\u001d\u0004\u000e4B\u0017%;&\u0003C\u001dv\u001f9oUs\u001a~\u0019,\"\u0001<W%M jFW\u001e\bd\u001d\u000f /Dhj3|2BGXLu2|\u0006\b\\\u0011<f7Cs>D#.=\u001d\t\fN\u0015h\"(k$|MST9pX&\u0015>[P\u001e\u0018<%A\u001e)\u0005_N\u00045cdm\b\u00100 \u0005\u0007DY\u000bE3g\u007f!0\nugQox\u0001/<U5c\u0007*9xhmcqn}~`\u0004\u001d\u0001\u001d\u0015^\n-", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010/\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0015]\u000b\fxC; \f,VW0]g\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010icCVAXqsS\fr,JIN+\u0014G\u007f\u0017qO;\u0014\u007fR$<P\u0004orQ'z\u0002%H}dEA~YF}p.K\u000f\u0007[\u0018X\t(~)\u00113\u0014As\tUp&\u0014Et\u001e+iK+%I\u0006\u0011ISn\u007fz>Wi)q\u0011\r^D5#n/rH\"\u0016'|[I^i|DQa<Xs\u001f0TT7?`\u0011\u0012\u00061wiHVdR\u000b\"{N0_Z\u0013\u00070'\u001cA%\u0007]\u0018s:n\u0001>\u0017\u0017x4\u0013jf?\u001e~I\u001azSnj[y-\f_\u0017S0:OE@WTwY\u0017D\n\t\u000e!}rPC\u0017#.#L]Bk,\u0005qc\\!&q<\u001b2v/\fZKxlwp\u0016\b\u001eq{\u0011lBB\u000b|ERy\"I_I\u0014@d[Y\u0014]$+]{\u0016&d\u00035Wj\f\u000f\b5\u0002\u0001&<3sGtN\u00178e\u0019\u0016\u000en0x\u0019\u000b`Y [\u00138XLc\u007fh+\u0010\u0013&Dv^)\u000e9Q=$/|)B\u000f\u0002]O7i?CdJ\u0004\u001f0E\u001c\u000f\u0016\u001ag/N\u0019j\u001a\u0004\u0001:$\u0016]Z!\u0019~Z>)\u00189\u001f@+$\u000fU\u000f\u0003{\fch\u0012\u0001us\u0006Ay|\u001d<A0Y\u0001\u0015:\u001d", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010/\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0015]\u000b\fxC; \f,VW0]g\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010icCVAXqsS\fr,JIN+\u0014G\u007f\u0017qO;\u0014\u007fR$<P\u0004orQ'z\u0002%H}dEA~YF}p.K\u000f\u0007[\u0018X\t(~)\u00113\u0014As\tUp&\u0014Et\u001e+iK+%I\u0006\u0011ISn\u007fz>Wi)q\u0011\r^D5#n/rH\"\u0016'|[I^i|DQa<Xs\u001f0TT7?]{\u0005\u0010#zoMB.\u001e~$xO,m\u0011L\u0013ja+.)L#\u0013q5oF\u0017\u0004\rvH\b\u0003HP\u0011yV\u0011wXzWfs.?NwO+BR@\u007f\u001cH\u0001\u0018_5\u0011\u0014|,wsK\b\u007fs5.;h<liz`NO+\u0018tB \u001e@z\u007f\\Hyh\u0006'^~\u0018x\u0006\u0014YM<\f<\u000bMs1<pG\u0003K^\\\u0019u5%>\\q\u001dB?|DJ{\n}\u0013/\u0003\u001c\n66\u0003E\u001f=\u0002+o\u000b\u0019\u0014s\u001cBd~bV!W!n\u0012X\u001eG]<\u0001\u001b%Jf#\u0016]6SHQ\u001e]%=\u0017\u0005X\u000f{]H\u0002-;\u000b*\u001fP\u0016\u0010\u0011^P\u007fU$Y%}\u0002u\u001c\u0005HM+\u000b\u0002`C\u0015a\u0005\u0013B(%\u000bcE?x\u0013]s\u000e\t,_YCv}\u0019J4gK\u0001\u0015ZoZ", "\"dgA90>Z\u0018\\\u000bk:\u0007\u0016\u0012a\t'\u0003@", "Ad[2V;B]\"l\nZ;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Pq,Uv%VPX5&ArP#r^\u000eU*z\u0005`A\"}HA(u;E\u0011;>", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005o=-\u0015uj5\u000e-:N}'E[R6e\u001ca='!;\u0012N2\frYH$lS;)\u0011\u001aX}JhVr\u0012\u00174wzFU#\u0011w\u001f}L3vF#l\nPPIj*.ii%gDH$!G|^Y", "\"dgA90>Z\u0018lze,z\u00183o\t\u000bwI\u007f\u001e\u0017U", "4nd;W(MW#\btk,\u0004\t+s\u007f", "1ta@b9!O\"}\u0002^\u001a\f\u0005>e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Pq,Uv%VPX5&ArP#r^\u000eU*o\u0001b@+n2F\u001b\u0017,\u001f", "AsP?g\u000f:\\\u0018\u0006zL;x\u0018/", "3mS\u0015T5=Z\u0019l\nZ;|", "BdgA90>Z\u0018ove<|v>a\u000f(", ":`bAG,Qb\nz\u0002n,"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BasicTextFieldKt {
    private static final TextFieldDecorator DefaultTextFieldDecorator = BasicTextFieldKt$DefaultTextFieldDecorator$1.INSTANCE;
    private static final long MinTouchTargetSizeForHandles;

    public static final void BasicTextField(final TextFieldState textFieldState, Modifier modifier, boolean z2, boolean z3, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2, MutableInteractionSource mutableInteractionSource, Brush brush, OutputTransformation outputTransformation, TextFieldDecorator textFieldDecorator, ScrollState scrollState, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        TextFieldDecorator textFieldDecorator2;
        ScrollState scrollStateRememberScrollState = scrollState;
        OutputTransformation outputTransformation2 = outputTransformation;
        SolidColor cursorBrush = brush;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function22 = function2;
        TextFieldLineLimits textFieldLineLimits2 = textFieldLineLimits;
        KeyboardActionHandler keyboardActionHandler2 = keyboardActionHandler;
        KeyboardOptions keyboardOptions2 = keyboardOptions;
        TextStyle textStyle2 = textStyle;
        InputTransformation inputTransformation2 = inputTransformation;
        boolean z4 = z3;
        boolean z5 = z2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(469439921);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BasicTextField)P(13,7,2,11,3,14,5,8,6,9,4!1,10)184@10988L21,188@11134L610:BasicTextField.kt#423gt5");
        if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
            i5 = (i2 + 6) - (i2 & 6);
        } else if ((i2 & 6) == 0) {
            int i7 = composerStartRestartGroup.changed(textFieldState) ? 4 : 2;
            i5 = (i7 + i2) - (i7 & i2);
        } else {
            i5 = i2;
        }
        int i8 = (i4 + 2) - (i4 | 2);
        if (i8 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 48));
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(companion) ? 32 : 16)));
        }
        int i9 = (i4 + 4) - (i4 | 4);
        if (i9 != 0) {
            i5 = (i5 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i5 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i5 |= composerStartRestartGroup.changed(z5) ? 256 : 128;
        }
        int i10 = (-1) - (((-1) - i4) | ((-1) - 8));
        if (i10 != 0) {
            i5 = (i5 + 3072) - (i5 & 3072);
        } else if ((i2 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
        }
        int i11 = i4 & 16;
        int i12 = 8192;
        if (i11 != 0) {
            i5 = (i5 + 24576) - (i5 & 24576);
        } else if ((i2 & 24576) == 0) {
            int i13 = composerStartRestartGroup.changed(inputTransformation2) ? 16384 : 8192;
            i5 = (i5 + i13) - (i5 & i13);
        }
        int i14 = i4 & 32;
        if (i14 != 0) {
            i5 = (i5 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((i2 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i2 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            int i15 = composerStartRestartGroup.changed(textStyle2) ? 131072 : 65536;
            i5 = (i5 + i15) - (i5 & i15);
        }
        int i16 = (-1) - (((-1) - i4) | ((-1) - 64));
        if (i16 != 0) {
            i5 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(keyboardOptions2) ? 1048576 : 524288)));
        }
        int i17 = i4 & 128;
        if (i17 != 0) {
            i5 = (i5 + 12582912) - (i5 & 12582912);
        } else if ((i2 + 12582912) - (i2 | 12582912) == 0) {
            i5 |= composerStartRestartGroup.changed(keyboardActionHandler2) ? 8388608 : 4194304;
        }
        int i18 = (i4 + 256) - (i4 | 256);
        if (i18 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 100663296));
        } else if ((-1) - (((-1) - i2) | ((-1) - 100663296)) == 0) {
            int i19 = composerStartRestartGroup.changed(textFieldLineLimits2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            i5 = (i5 + i19) - (i5 & i19);
        }
        int i20 = (i4 + 512) - (i4 | 512);
        if (i20 != 0) {
            i5 |= 805306368;
        } else if ((i2 + 805306368) - (i2 | 805306368) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function22) ? 536870912 : 268435456)));
        }
        int i21 = i4 & 1024;
        if (i21 != 0) {
            i6 = (i3 + 6) - (i3 & 6);
        } else if ((i3 & 6) == 0) {
            i6 = i3 | (composerStartRestartGroup.changed(mutableInteractionSource2) ? 4 : 2);
        } else {
            i6 = i3;
        }
        int i22 = (i4 + 2048) - (i4 | 2048);
        if (i22 != 0) {
            i6 |= 48;
        } else if ((-1) - (((-1) - i3) | ((-1) - 48)) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(cursorBrush) ? 32 : 16)));
        }
        int i23 = (-1) - (((-1) - i4) | ((-1) - 4096));
        if (i23 != 0) {
            i6 = (i6 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i6 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i3 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i3 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i24 = composerStartRestartGroup.changed(outputTransformation2) ? 256 : 128;
            i6 = (i6 + i24) - (i6 & i24);
        }
        int i25 = (-1) - (((-1) - i4) | ((-1) - 8192));
        if (i25 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 3072));
        } else if ((-1) - (((-1) - i3) | ((-1) - 3072)) == 0) {
            i6 |= (i3 + 4096) - (i3 | 4096) == 0 ? composerStartRestartGroup.changed(textFieldDecorator) : composerStartRestartGroup.changedInstance(textFieldDecorator) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            if ((i4 & 16384) == 0 && composerStartRestartGroup.changed(scrollStateRememberScrollState)) {
                i12 = 16384;
            }
            i6 = (i6 + i12) - (i6 & i12);
        }
        if ((i5 & 306783379) == 306783378 && (i6 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            textFieldDecorator2 = textFieldDecorator;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i8 != 0) {
                    companion = Modifier.Companion;
                }
                if (i9 != 0) {
                    z5 = true;
                }
                if (i10 != 0) {
                    z4 = false;
                }
                if (i11 != 0) {
                    inputTransformation2 = null;
                }
                if (i14 != 0) {
                    textStyle2 = TextStyle.Companion.getDefault();
                }
                if (i16 != 0) {
                    keyboardOptions2 = KeyboardOptions.Companion.getDefault();
                }
                if (i17 != 0) {
                    keyboardActionHandler2 = null;
                }
                if (i18 != 0) {
                    textFieldLineLimits2 = TextFieldLineLimits.Companion.getDefault();
                }
                if (i20 != 0) {
                    function22 = null;
                }
                if (i21 != 0) {
                    mutableInteractionSource2 = null;
                }
                if (i22 != 0) {
                    cursorBrush = BasicTextFieldDefaults.INSTANCE.getCursorBrush();
                }
                if (i23 != 0) {
                    outputTransformation2 = null;
                }
                textFieldDecorator2 = i25 == 0 ? textFieldDecorator : null;
                if ((i4 + 16384) - (i4 | 16384) != 0) {
                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    i6 = (-1) - (((-1) - i6) | ((-1) - (-57345)));
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i4 + 16384) - (i4 | 16384) != 0) {
                    i6 = (i6 - 57345) - (i6 | (-57345));
                }
                textFieldDecorator2 = textFieldDecorator;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(469439921, i5, i6, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:187)");
            }
            int i26 = (-1) - (((-1) - i5) | ((-1) - 2147483646));
            int i27 = (-1) - (((-1) - ((-1) - (((-1) - i6) | ((-1) - 14)))) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
            int i28 = 112 & i6;
            int i29 = (i27 + i28) - (i27 & i28);
            int i30 = i6 << 3;
            int i31 = (i30 + 7168) - (7168 | i30);
            int i32 = (-1) - (((-1) - ((i29 + i31) - (i29 & i31))) & ((-1) - ((57344 + i30) - (57344 | i30))));
            int i33 = (i30 + 458752) - (i30 | 458752);
            BasicTextField(textFieldState, companion, z5, z4, inputTransformation2, textStyle2, keyboardOptions2, keyboardActionHandler2, textFieldLineLimits2, function22, mutableInteractionSource2, cursorBrush, null, outputTransformation2, textFieldDecorator2, scrollStateRememberScrollState, false, composerStartRestartGroup, i26, (i32 + i33) - (i32 & i33), 65536);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final boolean z6 = z5;
            final boolean z7 = z4;
            final InputTransformation inputTransformation3 = inputTransformation2;
            final TextStyle textStyle3 = textStyle2;
            final KeyboardOptions keyboardOptions3 = keyboardOptions2;
            final KeyboardActionHandler keyboardActionHandler3 = keyboardActionHandler2;
            final TextFieldLineLimits textFieldLineLimits3 = textFieldLineLimits2;
            final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function23 = function22;
            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
            final Brush brush2 = cursorBrush;
            final OutputTransformation outputTransformation3 = outputTransformation2;
            final TextFieldDecorator textFieldDecorator3 = textFieldDecorator2;
            final ScrollState scrollState2 = scrollStateRememberScrollState;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1
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

                public final void invoke(Composer composer2, int i34) {
                    TextFieldState textFieldState2 = textFieldState;
                    Modifier modifier3 = modifier2;
                    boolean z8 = z6;
                    boolean z9 = z7;
                    InputTransformation inputTransformation4 = inputTransformation3;
                    TextStyle textStyle4 = textStyle3;
                    KeyboardOptions keyboardOptions4 = keyboardOptions3;
                    KeyboardActionHandler keyboardActionHandler4 = keyboardActionHandler3;
                    TextFieldLineLimits textFieldLineLimits4 = textFieldLineLimits3;
                    Function2<Density, Function0<TextLayoutResult>, Unit> function24 = function23;
                    MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                    Brush brush3 = brush2;
                    OutputTransformation outputTransformation4 = outputTransformation3;
                    TextFieldDecorator textFieldDecorator4 = textFieldDecorator3;
                    ScrollState scrollState3 = scrollState2;
                    int i35 = i2;
                    BasicTextFieldKt.BasicTextField(textFieldState2, modifier3, z8, z9, inputTransformation4, textStyle4, keyboardOptions4, keyboardActionHandler4, textFieldLineLimits4, function24, mutableInteractionSource4, brush3, outputTransformation4, textFieldDecorator4, scrollState3, composer2, RecomposeScopeImplKt.updateChangedFlags((i35 + 1) - (i35 & 1)), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                }
            });
        }
    }

    public static final void BasicTextField(final TextFieldState textFieldState, Modifier modifier, boolean z2, boolean z3, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2, MutableInteractionSource mutableInteractionSource, Brush brush, CodepointTransformation codepointTransformation, OutputTransformation outputTransformation, TextFieldDecorator textFieldDecorator, ScrollState scrollState, boolean z4, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        final MutableInteractionSource mutableInteractionSource2;
        SingleLineCodepointTransformation singleLineCodepointTransformation;
        boolean z5 = z4;
        ScrollState scrollStateRememberScrollState = scrollState;
        TextFieldDecorator textFieldDecorator2 = textFieldDecorator;
        OutputTransformation outputTransformation2 = outputTransformation;
        CodepointTransformation codepointTransformation2 = codepointTransformation;
        MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
        Brush cursorBrush = brush;
        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function22 = function2;
        TextFieldLineLimits textFieldLineLimits2 = textFieldLineLimits;
        KeyboardActionHandler keyboardActionHandler2 = keyboardActionHandler;
        KeyboardOptions keyboardOptions2 = keyboardOptions;
        TextStyle textStyle2 = textStyle;
        InputTransformation inputTransformation2 = inputTransformation;
        boolean z6 = z3;
        boolean z7 = z2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(965149429);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BasicTextField)P(15,9,3,13,4,16,7,10,8,11,5,1!1,12!1,14)234@12943L21,239@13149L7,240@13204L7,241@13249L7,247@13619L25,248@13693L25,251@13806L797,271@14801L48,273@14885L357,284@15295L7,285@15359L7,286@15413L7,287@15436L520,287@15425L531,303@16004L83,303@15962L125,342@17504L3096:BasicTextField.kt#423gt5");
        if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
            i5 = (i2 + 6) - (i2 & 6);
        } else if ((i2 & 6) == 0) {
            int i7 = composerStartRestartGroup.changed(textFieldState) ? 4 : 2;
            i5 = (i7 + i2) - (i7 & i2);
        } else {
            i5 = i2;
        }
        int i8 = i4 & 2;
        if (i8 != 0) {
            i5 = (i5 + 48) - (i5 & 48);
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            int i9 = composerStartRestartGroup.changed(companion) ? 32 : 16;
            i5 = (i5 + i9) - (i5 & i9);
        }
        int i10 = (-1) - (((-1) - i4) | ((-1) - 4));
        if (i10 != 0) {
            i5 = (i5 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i5 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i11 = composerStartRestartGroup.changed(z7) ? 256 : 128;
            i5 = (i5 + i11) - (i5 & i11);
        }
        int i12 = (-1) - (((-1) - i4) | ((-1) - 8));
        if (i12 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 3072));
        } else if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            int i13 = composerStartRestartGroup.changed(z6) ? 2048 : 1024;
            i5 = (i5 + i13) - (i5 & i13);
        }
        int i14 = (-1) - (((-1) - i4) | ((-1) - 16));
        if (i14 != 0) {
            i5 = (i5 + 24576) - (i5 & 24576);
        } else if ((i2 + 24576) - (i2 | 24576) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(inputTransformation2) ? 16384 : 8192)));
        }
        int i15 = (-1) - (((-1) - i4) | ((-1) - 32));
        if (i15 != 0) {
            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(textStyle2) ? 131072 : 65536)));
        }
        int i16 = (i4 + 64) - (i4 | 64);
        if (i16 != 0) {
            i5 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(keyboardOptions2) ? 1048576 : 524288)));
        }
        int i17 = (-1) - (((-1) - i4) | ((-1) - 128));
        if (i17 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 12582912));
        } else if ((-1) - (((-1) - i2) | ((-1) - 12582912)) == 0) {
            int i18 = composerStartRestartGroup.changed(keyboardActionHandler2) ? 8388608 : 4194304;
            i5 = (i5 + i18) - (i5 & i18);
        }
        int i19 = (i4 + 256) - (i4 | 256);
        if (i19 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 100663296));
        } else if ((-1) - (((-1) - i2) | ((-1) - 100663296)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(textFieldLineLimits2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        int i20 = i4 & 512;
        if (i20 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 805306368));
        } else if ((i2 + 805306368) - (i2 | 805306368) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function22) ? 536870912 : 268435456)));
        }
        int i21 = (-1) - (((-1) - i4) | ((-1) - 1024));
        if (i21 != 0) {
            i6 = (i3 + 6) - (i3 & 6);
        } else if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
            i6 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(mutableInteractionSource3) ? 4 : 2)));
        } else {
            i6 = i3;
        }
        int i22 = (i4 + 2048) - (i4 | 2048);
        if (i22 != 0) {
            i6 = (i6 + 48) - (i6 & 48);
        } else if ((i3 + 48) - (i3 | 48) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(cursorBrush) ? 32 : 16)));
        }
        int i23 = (i4 + 4096) - (i4 | 4096);
        if (i23 != 0) {
            i6 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i6 |= composerStartRestartGroup.changed(codepointTransformation2) ? 256 : 128;
        }
        int i24 = (i4 + 8192) - (i4 | 8192);
        if (i24 != 0) {
            i6 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changed(outputTransformation2) ? 2048 : 1024;
        }
        int i25 = i4 & 16384;
        if (i25 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 24576));
        } else if ((i3 + 24576) - (i3 | 24576) == 0) {
            int i26 = (-1) - (((-1) - i3) | ((-1) - 32768)) == 0 ? composerStartRestartGroup.changed(textFieldDecorator2) : composerStartRestartGroup.changedInstance(textFieldDecorator2) ? 16384 : 8192;
            i6 = (i6 + i26) - (i6 & i26);
        }
        if ((196608 & i3) == 0) {
            int i27 = ((i4 & 32768) == 0 && composerStartRestartGroup.changed(scrollStateRememberScrollState)) ? 131072 : 65536;
            i6 = (i6 + i27) - (i6 & i27);
        }
        int i28 = (i4 + 65536) - (i4 | 65536);
        if (i28 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 1572864));
        } else if ((-1) - (((-1) - i3) | ((-1) - 1572864)) == 0) {
            int i29 = composerStartRestartGroup.changed(z5) ? 1048576 : 524288;
            i6 = (i6 + i29) - (i6 & i29);
        }
        if ((-1) - (((-1) - i5) | ((-1) - 306783379)) == 306783378 && (599187 & i6) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            mutableInteractionSource2 = mutableInteractionSource3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i8 != 0) {
                    companion = Modifier.Companion;
                }
                if (i10 != 0) {
                    z7 = true;
                }
                if (i12 != 0) {
                    z6 = false;
                }
                if (i14 != 0) {
                    inputTransformation2 = null;
                }
                if (i15 != 0) {
                    textStyle2 = TextStyle.Companion.getDefault();
                }
                if (i16 != 0) {
                    keyboardOptions2 = KeyboardOptions.Companion.getDefault();
                }
                if (i17 != 0) {
                    keyboardActionHandler2 = null;
                }
                if (i19 != 0) {
                    textFieldLineLimits2 = TextFieldLineLimits.Companion.getDefault();
                }
                if (i20 != 0) {
                    function22 = null;
                }
                if (i21 != 0) {
                    mutableInteractionSource3 = null;
                }
                if (i22 != 0) {
                    cursorBrush = BasicTextFieldDefaults.INSTANCE.getCursorBrush();
                }
                if (i23 != 0) {
                    codepointTransformation2 = null;
                }
                if (i24 != 0) {
                    outputTransformation2 = null;
                }
                if (i25 != 0) {
                    textFieldDecorator2 = null;
                }
                if ((i4 + 32768) - (i4 | 32768) != 0) {
                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    i6 = (-1) - (((-1) - i6) | ((-1) - (-458753)));
                }
                if (i28 != 0) {
                    z5 = false;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i4) | ((-1) - 32768)) != 0) {
                    i6 = (i6 - 458753) - (i6 | (-458753));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(965149429, i5, i6, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:238)");
            }
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final Density density = (Density) objConsume;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) objConsume2;
            ProvidableCompositionLocal<WindowInfo> localWindowInfo = CompositionLocalsKt.getLocalWindowInfo();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume3 = composerStartRestartGroup.consume(localWindowInfo);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            WindowInfo windowInfo = (WindowInfo) objConsume3;
            final boolean zAreEqual = Intrinsics.areEqual(textFieldLineLimits2, TextFieldLineLimits.SingleLine.INSTANCE);
            if (mutableInteractionSource3 == null) {
                mutableInteractionSource2 = mutableInteractionSource3;
                composerStartRestartGroup.startReplaceGroup(96938805);
                ComposerKt.sourceInformation(composerStartRestartGroup, "245@13454L39");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1243798931, "CC(remember):BasicTextField.kt#9igjgp");
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            } else {
                mutableInteractionSource2 = mutableInteractionSource3;
                composerStartRestartGroup.startReplaceGroup(-1243799582);
            }
            composerStartRestartGroup.endReplaceGroup();
            Orientation orientation = zAreEqual ? Orientation.Horizontal : Orientation.Vertical;
            MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
            final boolean zBooleanValue = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composerStartRestartGroup, 0).getValue().booleanValue();
            final boolean zBooleanValue2 = HoverInteractionKt.collectIsHoveredAsState(mutableInteractionSource4, composerStartRestartGroup, 0).getValue().booleanValue();
            final boolean zIsWindowFocused = windowInfo.isWindowFocused();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1243786909, "CC(remember):BasicTextField.kt#9igjgp");
            boolean z8 = ((-1) - (((-1) - i5) | ((-1) - 14)) == 4) | ((i6 + 896) - (896 | i6) == 256) | ((-1) - (((-1) - i6) | ((-1) - 7168)) == 2048);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z8 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                if (codepointTransformation2 == null) {
                    SingleLineCodepointTransformation singleLineCodepointTransformation2 = SingleLineCodepointTransformation.INSTANCE;
                    if (!zAreEqual) {
                        singleLineCodepointTransformation2 = null;
                    }
                    singleLineCodepointTransformation = singleLineCodepointTransformation2;
                } else {
                    singleLineCodepointTransformation = codepointTransformation2;
                }
                objRememberedValue2 = new TransformedTextFieldState(textFieldState, inputTransformation2, singleLineCodepointTransformation, outputTransformation2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final TransformedTextFieldState transformedTextFieldState = (TransformedTextFieldState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1243755818, "CC(remember):BasicTextField.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(transformedTextFieldState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new TextLayoutState();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final TextLayoutState textLayoutState = (TextLayoutState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1243752821, "CC(remember):BasicTextField.kt#9igjgp");
            boolean zChanged2 = composerStartRestartGroup.changed(transformedTextFieldState);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new TextFieldSelectionState(transformedTextFieldState, textLayoutState, density, z7, z6, zBooleanValue && zIsWindowFocused, z5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final TextFieldSelectionState textFieldSelectionState = (TextFieldSelectionState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ProvidableCompositionLocal<HapticFeedback> localHapticFeedback = CompositionLocalsKt.getLocalHapticFeedback();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume4 = composerStartRestartGroup.consume(localHapticFeedback);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final HapticFeedback hapticFeedback = (HapticFeedback) objConsume4;
            ProvidableCompositionLocal<ClipboardManager> localClipboardManager = CompositionLocalsKt.getLocalClipboardManager();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume5 = composerStartRestartGroup.consume(localClipboardManager);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final ClipboardManager clipboardManager = (ClipboardManager) objConsume5;
            ProvidableCompositionLocal<TextToolbar> localTextToolbar = CompositionLocalsKt.getLocalTextToolbar();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume6 = composerStartRestartGroup.consume(localTextToolbar);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final TextToolbar textToolbar = (TextToolbar) objConsume6;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1243735026, "CC(remember):BasicTextField.kt#9igjgp");
            int i30 = ((-1) - (((-1) - (((-1) - (((-1) - ((-1) - (((-1) - ((-1) - (((-1) - ((57344 + i5) - (57344 | i5) == 16384 ? 1 : 0)) & ((-1) - (composerStartRestartGroup.changed(transformedTextFieldState) ? 1 : 0))))) & ((-1) - (composerStartRestartGroup.changedInstance(textFieldSelectionState) ? 1 : 0))))) & ((-1) - (composerStartRestartGroup.changedInstance(hapticFeedback) ? 1 : 0)))) | (composerStartRestartGroup.changedInstance(clipboardManager) ? 1 : 0))) & ((-1) - (composerStartRestartGroup.changedInstance(textToolbar) ? 1 : 0)))) | (composerStartRestartGroup.changed(density) ? 1 : 0);
            int i31 = (i5 + 896) - (896 | i5) == 256 ? 1 : 0;
            int i32 = (i30 + i31) - (i30 & i31);
            int i33 = (i5 + 7168) - (7168 | i5) == 2048 ? 1 : 0;
            int i34 = (i32 + i33) - (i32 & i33);
            int i35 = (3670016 & i6) == 1048576 ? 1 : 0;
            int i36 = (i34 + i35) - (i34 & i35);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (i36 != 0 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                final InputTransformation inputTransformation3 = inputTransformation2;
                final boolean z9 = z7;
                final boolean z10 = z6;
                final boolean z11 = z5;
                objRememberedValue5 = (Function0) new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$2$1
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
                        transformedTextFieldState.update(inputTransformation3);
                        textFieldSelectionState.update(hapticFeedback, clipboardManager, textToolbar, density, z9, z10, z11);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            EffectsKt.SideEffect((Function0) objRememberedValue5, composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1243717287, "CC(remember):BasicTextField.kt#9igjgp");
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(textFieldSelectionState);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue6 == Composer.Companion.getEmpty()) {
                objRememberedValue6 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        final TextFieldSelectionState textFieldSelectionState2 = textFieldSelectionState;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                textFieldSelectionState2.dispose();
                            }
                        };
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            EffectsKt.DisposableEffect(textFieldSelectionState, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue6, composerStartRestartGroup, 0);
            Modifier modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(ScrollableKt.scrollable$default(FocusableKt.focusable(companion.then(new TextFieldDecoratorModifier(transformedTextFieldState, textLayoutState, textFieldSelectionState, inputTransformation2, z7, z6, keyboardOptions2, keyboardActionHandler2, zAreEqual, mutableInteractionSource3)), z7, mutableInteractionSource3), scrollStateRememberScrollState, orientation, z7 && textFieldSelectionState.getDirectDragGestureInitiator() == TextFieldSelectionState.InputType.None, ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection, orientation, false), null, mutableInteractionSource3, 16, null), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierPointerHoverIcon$default);
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
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1236622543, "C343@17621L2973,343@17571L3023:BasicTextField.kt#423gt5");
            final TextFieldDecorator textFieldDecorator3 = textFieldDecorator2;
            final TextFieldLineLimits textFieldLineLimits3 = textFieldLineLimits2;
            final TextStyle textStyle3 = textStyle2;
            final Brush brush2 = cursorBrush;
            final boolean z12 = z7;
            final boolean z13 = z6;
            final ScrollState scrollState2 = scrollStateRememberScrollState;
            final Orientation orientation2 = orientation;
            final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function23 = function22;
            ContextMenu_androidKt.ContextMenuArea(textFieldSelectionState, z7, ComposableLambdaKt.rememberComposableLambda(-673241599, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
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

                public final void invoke(Composer composer2, int i37) {
                    ComposerKt.sourceInformation(composer2, "C345@17737L2847,345@17726L2858:BasicTextField.kt#423gt5");
                    if ((i37 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-673241599, i37, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous> (BasicTextField.kt:344)");
                        }
                        TextFieldDecorator textFieldDecorator4 = textFieldDecorator3;
                        if (textFieldDecorator4 == null) {
                            textFieldDecorator4 = BasicTextFieldKt.DefaultTextFieldDecorator;
                        }
                        final TextFieldLineLimits textFieldLineLimits4 = textFieldLineLimits3;
                        final TextLayoutState textLayoutState2 = textLayoutState;
                        final TextStyle textStyle4 = textStyle3;
                        final boolean z14 = zBooleanValue;
                        final boolean z15 = zIsWindowFocused;
                        final boolean z16 = zBooleanValue2;
                        final TransformedTextFieldState transformedTextFieldState2 = transformedTextFieldState;
                        final TextFieldSelectionState textFieldSelectionState2 = textFieldSelectionState;
                        final Brush brush3 = brush2;
                        final boolean z17 = z12;
                        final boolean z18 = z13;
                        final ScrollState scrollState3 = scrollState2;
                        final Orientation orientation3 = orientation2;
                        final boolean z19 = zAreEqual;
                        final Function2<Density, Function0<TextLayoutResult>, Unit> function24 = function23;
                        textFieldDecorator4.Decoration(ComposableLambdaKt.rememberComposableLambda(1969169726, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i38) {
                                int minHeightInLines;
                                int maxHeightInLines;
                                ComposerKt.sourceInformation(composer3, "C356@18098L2472:BasicTextField.kt#423gt5");
                                if ((3 & i38) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1969169726, i38, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous>.<anonymous> (BasicTextField.kt:346)");
                                    }
                                    TextFieldLineLimits textFieldLineLimits5 = textFieldLineLimits4;
                                    if (textFieldLineLimits5 instanceof TextFieldLineLimits.MultiLine) {
                                        minHeightInLines = ((TextFieldLineLimits.MultiLine) textFieldLineLimits5).getMinHeightInLines();
                                        maxHeightInLines = ((TextFieldLineLimits.MultiLine) textFieldLineLimits4).getMaxHeightInLines();
                                    } else {
                                        minHeightInLines = 1;
                                        maxHeightInLines = 1;
                                    }
                                    Modifier modifierClipToBounds = ClipKt.clipToBounds(TextFieldSizeKt.textFieldMinSize(HeightInLinesModifierKt.heightInLines(SizeKt.m1051heightInVpY3zN4$default(Modifier.Companion, textLayoutState2.m1553getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle4, minHeightInLines, maxHeightInLines), textStyle4));
                                    boolean z20 = false;
                                    boolean z21 = z14 && z15;
                                    boolean z22 = z16;
                                    TextLayoutState textLayoutState3 = textLayoutState2;
                                    TransformedTextFieldState transformedTextFieldState3 = transformedTextFieldState2;
                                    TextFieldSelectionState textFieldSelectionState3 = textFieldSelectionState2;
                                    Brush brush4 = brush3;
                                    if (z17 && !z18) {
                                        z20 = true;
                                    }
                                    Modifier modifierThen = modifierClipToBounds.then(new TextFieldCoreModifier(z21, z22, textLayoutState3, transformedTextFieldState3, textFieldSelectionState3, brush4, z20, scrollState3, orientation3));
                                    TextLayoutState textLayoutState4 = textLayoutState2;
                                    TransformedTextFieldState transformedTextFieldState4 = transformedTextFieldState2;
                                    TextStyle textStyle5 = textStyle4;
                                    boolean z23 = z19;
                                    Function2<Density, Function0<TextLayoutResult>, Unit> function25 = function24;
                                    boolean z24 = z17;
                                    boolean z25 = z14;
                                    boolean z26 = z15;
                                    TextFieldSelectionState textFieldSelectionState4 = textFieldSelectionState2;
                                    boolean z27 = z18;
                                    ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierThen);
                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor2);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3671constructorimpl2 = Updater.m3671constructorimpl(composer3);
                                    Updater.m3678setimpl(composerM3671constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                                    Updater.m3678setimpl(composerM3671constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                    if (composerM3671constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM3671constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM3671constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1326300454, "C381@19361L648:BasicTextField.kt#423gt5");
                                    BoxKt.Box(BringIntoViewRequesterKt.bringIntoViewRequester(Modifier.Companion, textLayoutState4.getBringIntoViewRequester()).then(new TextFieldTextLayoutModifier(textLayoutState4, transformedTextFieldState4, textStyle5, z23, function25)), composer3, 0);
                                    if (z24 && z25 && z26 && textFieldSelectionState4.isInTouchMode()) {
                                        composer3.startReplaceGroup(-1325530694);
                                        ComposerKt.sourceInformation(composer3, "398@20188L121");
                                        BasicTextFieldKt.TextFieldSelectionHandles(textFieldSelectionState4, composer3, 0);
                                        if (!z27) {
                                            composer3.startReplaceGroup(-1325351669);
                                            ComposerKt.sourceInformation(composer3, "402@20379L125");
                                            BasicTextFieldKt.TextFieldCursorHandle(textFieldSelectionState4, composer3, 0);
                                            composer3.endReplaceGroup();
                                        } else {
                                            composer3.startReplaceGroup(-1325177728);
                                            composer3.endReplaceGroup();
                                        }
                                        composer3.endReplaceGroup();
                                    } else {
                                        composer3.startReplaceGroup(-1325155904);
                                        composer3.endReplaceGroup();
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (-1) - (((-1) - ((i5 >> 3) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)));
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
            final boolean z14 = z7;
            final boolean z15 = z6;
            final InputTransformation inputTransformation4 = inputTransformation2;
            final TextStyle textStyle4 = textStyle2;
            final KeyboardOptions keyboardOptions3 = keyboardOptions2;
            final KeyboardActionHandler keyboardActionHandler3 = keyboardActionHandler2;
            final TextFieldLineLimits textFieldLineLimits4 = textFieldLineLimits2;
            final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function24 = function22;
            final Brush brush3 = cursorBrush;
            final CodepointTransformation codepointTransformation3 = codepointTransformation2;
            final OutputTransformation outputTransformation3 = outputTransformation2;
            final TextFieldDecorator textFieldDecorator4 = textFieldDecorator2;
            final ScrollState scrollState3 = scrollStateRememberScrollState;
            final boolean z16 = z5;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.5
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

                public final void invoke(Composer composer2, int i37) {
                    BasicTextFieldKt.BasicTextField(textFieldState, modifier2, z14, z15, inputTransformation4, textStyle4, keyboardOptions3, keyboardActionHandler3, textFieldLineLimits4, function24, mutableInteractionSource2, brush3, codepointTransformation3, outputTransformation3, textFieldDecorator4, scrollState3, z16, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                }
            });
        }
    }

    public static final void TextFieldCursorHandle(final TextFieldSelectionState textFieldSelectionState, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1991581797);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TextFieldCursorHandle)417@20797L128:BasicTextField.kt#423gt5");
        if ((i2 + 6) - (6 | i2) == 0) {
            int i4 = composerStartRestartGroup.changedInstance(textFieldSelectionState) ? 4 : 2;
            i3 = (i4 + i2) - (i4 & i2);
        } else {
            i3 = i2;
        }
        if ((i3 + 3) - (3 | i3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1991581797, i3, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (BasicTextField.kt:414)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -425876476, "CC(remember):BasicTextField.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(textFieldSelectionState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<TextFieldHandleState>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$cursorHandleState$2$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final TextFieldHandleState invoke() {
                        return textFieldSelectionState.getCursorHandleState$foundation_release(false);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (TextFieldCursorHandle$lambda$9((State) objRememberedValue).getVisible()) {
                composerStartRestartGroup.startReplaceGroup(-317096444);
                ComposerKt.sourceInformation(composerStartRestartGroup, "422@21014L142,428@21236L87,421@20971L426");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -425869518, "CC(remember):BasicTextField.kt#9igjgp");
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(textFieldSelectionState);
                OffsetProvider offsetProviderRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || offsetProviderRememberedValue == Composer.Companion.getEmpty()) {
                    offsetProviderRememberedValue = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* JADX INFO: renamed from: provide-F1C5BW0, reason: not valid java name */
                        public final long mo1308provideF1C5BW0() {
                            return textFieldSelectionState.getCursorHandleState$foundation_release(true).m1582getPositionF1C5BW0();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(offsetProviderRememberedValue);
                }
                OffsetProvider offsetProvider = (OffsetProvider) offsetProviderRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Modifier.Companion companion = Modifier.Companion;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -425862469, "CC(remember):BasicTextField.kt#9igjgp");
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(textFieldSelectionState);
                BasicTextFieldKt$TextFieldCursorHandle$2$1 basicTextFieldKt$TextFieldCursorHandle$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || basicTextFieldKt$TextFieldCursorHandle$2$1RememberedValue == Composer.Companion.getEmpty()) {
                    basicTextFieldKt$TextFieldCursorHandle$2$1RememberedValue = new BasicTextFieldKt$TextFieldCursorHandle$2$1(textFieldSelectionState, null);
                    composerStartRestartGroup.updateRememberedValue(basicTextFieldKt$TextFieldCursorHandle$2$1RememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                AndroidCursorHandle_androidKt.m1304CursorHandleUSBMPiE(offsetProvider, SuspendingPointerInputFilterKt.pointerInput(companion, textFieldSelectionState, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) basicTextFieldKt$TextFieldCursorHandle$2$1RememberedValue), MinTouchTargetSizeForHandles, composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-316671682);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.TextFieldCursorHandle.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    BasicTextFieldKt.TextFieldCursorHandle(textFieldSelectionState, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))));
                }
            });
        }
    }

    public static final void TextFieldSelectionHandles(final TextFieldSelectionState textFieldSelectionState, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(2025287684);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TextFieldSelectionHandles)441@21601L149,464@22479L150:BasicTextField.kt#423gt5");
        if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i3 = (-1) - (((-1) - (composerStartRestartGroup.changedInstance(textFieldSelectionState) ? 4 : 2)) & ((-1) - i2));
        } else {
            i3 = i2;
        }
        if ((i3 + 3) - (3 | i3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2025287684, i3, -1, "androidx.compose.foundation.text.TextFieldSelectionHandles (BasicTextField.kt:439)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1983345574, "CC(remember):BasicTextField.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<TextFieldHandleState>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$startHandleState$2$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final TextFieldHandleState invoke() {
                        return textFieldSelectionState.getSelectionHandleState$foundation_release(true, false);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            State state = (State) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (TextFieldSelectionHandles$lambda$13(state).getVisible()) {
                composerStartRestartGroup.startReplaceGroup(-1353974139);
                ComposerKt.sourceInformation(composerStartRestartGroup, "448@21841L167,456@22219L86,447@21795L584");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1983337876, "CC(remember):BasicTextField.kt#9igjgp");
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(textFieldSelectionState);
                OffsetProvider offsetProviderRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || offsetProviderRememberedValue == Composer.Companion.getEmpty()) {
                    offsetProviderRememberedValue = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* JADX INFO: renamed from: provide-F1C5BW0 */
                        public final long mo1308provideF1C5BW0() {
                            return textFieldSelectionState.getSelectionHandleState$foundation_release(true, true).m1582getPositionF1C5BW0();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(offsetProviderRememberedValue);
                }
                OffsetProvider offsetProvider = (OffsetProvider) offsetProviderRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ResolvedTextDirection direction = TextFieldSelectionHandles$lambda$13(state).getDirection();
                boolean handlesCrossed = TextFieldSelectionHandles$lambda$13(state).getHandlesCrossed();
                Modifier.Companion companion = Modifier.Companion;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1983325861, "CC(remember):BasicTextField.kt#9igjgp");
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(textFieldSelectionState);
                BasicTextFieldKt$TextFieldSelectionHandles$2$1 basicTextFieldKt$TextFieldSelectionHandles$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || basicTextFieldKt$TextFieldSelectionHandles$2$1RememberedValue == Composer.Companion.getEmpty()) {
                    basicTextFieldKt$TextFieldSelectionHandles$2$1RememberedValue = new BasicTextFieldKt$TextFieldSelectionHandles$2$1(textFieldSelectionState, null);
                    composerStartRestartGroup.updateRememberedValue(basicTextFieldKt$TextFieldSelectionHandles$2$1RememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                AndroidSelectionHandles_androidKt.m1661SelectionHandlepzduO1o(offsetProvider, true, direction, handlesCrossed, MinTouchTargetSizeForHandles, SuspendingPointerInputFilterKt.pointerInput(companion, textFieldSelectionState, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) basicTextFieldKt$TextFieldSelectionHandles$2$1RememberedValue), composerStartRestartGroup, 24624, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1353397539);
                composerStartRestartGroup.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1983317477, "CC(remember):BasicTextField.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<TextFieldHandleState>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$endHandleState$2$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final TextFieldHandleState invoke() {
                        return textFieldSelectionState.getSelectionHandleState$foundation_release(false, false);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            State state2 = (State) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (TextFieldSelectionHandles$lambda$17(state2).getVisible()) {
                composerStartRestartGroup.startReplaceGroup(-1353104186);
                ComposerKt.sourceInformation(composerStartRestartGroup, "471@22718L168,479@23094L87,470@22672L583");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1983309811, "CC(remember):BasicTextField.kt#9igjgp");
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(textFieldSelectionState);
                OffsetProvider offsetProviderRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || offsetProviderRememberedValue2 == Composer.Companion.getEmpty()) {
                    offsetProviderRememberedValue2 = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$3$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* JADX INFO: renamed from: provide-F1C5BW0 */
                        public final long mo1308provideF1C5BW0() {
                            return textFieldSelectionState.getSelectionHandleState$foundation_release(false, true).m1582getPositionF1C5BW0();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(offsetProviderRememberedValue2);
                }
                OffsetProvider offsetProvider2 = (OffsetProvider) offsetProviderRememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ResolvedTextDirection direction2 = TextFieldSelectionHandles$lambda$17(state2).getDirection();
                boolean handlesCrossed2 = TextFieldSelectionHandles$lambda$17(state2).getHandlesCrossed();
                Modifier.Companion companion2 = Modifier.Companion;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1983297860, "CC(remember):BasicTextField.kt#9igjgp");
                boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(textFieldSelectionState);
                BasicTextFieldKt$TextFieldSelectionHandles$4$1 basicTextFieldKt$TextFieldSelectionHandles$4$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance4 || basicTextFieldKt$TextFieldSelectionHandles$4$1RememberedValue == Composer.Companion.getEmpty()) {
                    basicTextFieldKt$TextFieldSelectionHandles$4$1RememberedValue = new BasicTextFieldKt$TextFieldSelectionHandles$4$1(textFieldSelectionState, null);
                    composerStartRestartGroup.updateRememberedValue(basicTextFieldKt$TextFieldSelectionHandles$4$1RememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                AndroidSelectionHandles_androidKt.m1661SelectionHandlepzduO1o(offsetProvider2, false, direction2, handlesCrossed2, MinTouchTargetSizeForHandles, SuspendingPointerInputFilterKt.pointerInput(companion2, textFieldSelectionState, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) basicTextFieldKt$TextFieldSelectionHandles$4$1RememberedValue), composerStartRestartGroup, 24624, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1352528547);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.TextFieldSelectionHandles.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    TextFieldSelectionState textFieldSelectionState2 = textFieldSelectionState;
                    int i5 = i2;
                    BasicTextFieldKt.TextFieldSelectionHandles(textFieldSelectionState2, composer2, RecomposeScopeImplKt.updateChangedFlags((i5 + 1) - (i5 & 1)));
                }
            });
        }
    }

    static {
        float f2 = 40;
        MinTouchTargetSizeForHandles = DpKt.m6660DpSizeYgX7TsA(Dp.m6638constructorimpl(f2), Dp.m6638constructorimpl(f2));
    }

    public static final void BasicTextField(final String str, final Function1<? super String, Unit> function1, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i2, int i3, VisualTransformation visualTransformation, Function1<? super TextLayoutResult, Unit> function12, MutableInteractionSource mutableInteractionSource, Brush brush, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3M1324getLambda1$foundation_release = function3;
        SolidColor solidColor = brush;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        AnonymousClass6 anonymousClass6 = function12;
        boolean z5 = z4;
        VisualTransformation none = visualTransformation;
        int i9 = i3;
        int i10 = i2;
        KeyboardActions keyboardActions2 = keyboardActions;
        KeyboardOptions keyboardOptions2 = keyboardOptions;
        TextStyle textStyle2 = textStyle;
        boolean z6 = z3;
        boolean z7 = z2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(945255183);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BasicTextField)P(14,10,8,2,11,13,5,4,12,6,7,15,9,3)613@31179L57,619@31532L216,619@31521L227,628@32069L41,632@32187L373,630@32116L1032:BasicTextField.kt#423gt5");
        if ((-1) - (((-1) - i6) | ((-1) - 1)) != 0) {
            i7 = (-1) - (((-1) - i4) & ((-1) - 6));
        } else if ((i4 & 6) == 0) {
            i7 = (-1) - (((-1) - (composerStartRestartGroup.changed(str) ? 4 : 2)) & ((-1) - i4));
        } else {
            i7 = i4;
        }
        if ((i6 + 2) - (i6 | 2) != 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - 48));
        } else if ((i4 & 48) == 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - (composerStartRestartGroup.changedInstance(function1) ? 32 : 16)));
        }
        int i11 = (-1) - (((-1) - i6) | ((-1) - 4));
        if (i11 != 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i7 |= composerStartRestartGroup.changed(companion) ? 256 : 128;
        }
        int i12 = i6 & 8;
        if (i12 != 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - 3072));
        } else if ((i4 + 3072) - (i4 | 3072) == 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - (composerStartRestartGroup.changed(z7) ? 2048 : 1024)));
        }
        int i13 = i6 & 16;
        if (i13 != 0) {
            i7 = (i7 + 24576) - (i7 & 24576);
        } else if ((-1) - (((-1) - i4) | ((-1) - 24576)) == 0) {
            int i14 = composerStartRestartGroup.changed(z6) ? 16384 : 8192;
            i7 = (i7 + i14) - (i7 & i14);
        }
        int i15 = (i6 + 32) - (i6 | 32);
        if (i15 != 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((i4 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i4 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i7 |= composerStartRestartGroup.changed(textStyle2) ? 131072 : 65536;
        }
        int i16 = (-1) - (((-1) - i6) | ((-1) - 64));
        if (i16 != 0) {
            i7 |= 1572864;
        } else if ((i4 & 1572864) == 0) {
            int i17 = composerStartRestartGroup.changed(keyboardOptions2) ? 1048576 : 524288;
            i7 = (i7 + i17) - (i7 & i17);
        }
        int i18 = (-1) - (((-1) - i6) | ((-1) - 128));
        if (i18 != 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - 12582912));
        } else if ((i4 + 12582912) - (i4 | 12582912) == 0) {
            int i19 = composerStartRestartGroup.changed(keyboardActions2) ? 8388608 : 4194304;
            i7 = (i7 + i19) - (i7 & i19);
        }
        int i20 = (i6 + 256) - (i6 | 256);
        if (i20 != 0) {
            i7 |= 100663296;
        } else if ((i4 & 100663296) == 0) {
            i7 |= composerStartRestartGroup.changed(z5) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i7 |= ((i6 + 512) - (i6 | 512) == 0 && composerStartRestartGroup.changed(i10)) ? 536870912 : 268435456;
        }
        int i21 = i6 & 1024;
        if (i21 != 0) {
            i8 = (-1) - (((-1) - i5) & ((-1) - 6));
        } else if ((i5 + 6) - (i5 | 6) == 0) {
            i8 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(i9) ? 4 : 2)));
        } else {
            i8 = i5;
        }
        int i22 = (i6 + 2048) - (i6 | 2048);
        if (i22 != 0) {
            i8 = (i8 + 48) - (i8 & 48);
        } else if ((i5 + 48) - (i5 | 48) == 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - (composerStartRestartGroup.changed(none) ? 32 : 16)));
        }
        int i23 = i6 & 4096;
        if (i23 != 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((-1) - (((-1) - i5) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i24 = composerStartRestartGroup.changedInstance(anonymousClass6) ? 256 : 128;
            i8 = (i8 + i24) - (i8 & i24);
        }
        int i25 = (-1) - (((-1) - i6) | ((-1) - 8192));
        if (i25 != 0) {
            i8 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - (composerStartRestartGroup.changed(mutableInteractionSource2) ? 2048 : 1024)));
        }
        int i26 = i6 & 16384;
        if (i26 != 0) {
            i8 = (i8 + 24576) - (i8 & 24576);
        } else if ((-1) - (((-1) - i5) | ((-1) - 24576)) == 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - (composerStartRestartGroup.changed(solidColor) ? 16384 : 8192)));
        }
        int i27 = (-1) - (((-1) - i6) | ((-1) - 32768));
        if (i27 != 0) {
            i8 = (i8 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i8 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((-1) - (((-1) - i5) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) == 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - (composerStartRestartGroup.changedInstance(function3M1324getLambda1$foundation_release) ? 131072 : 65536)));
        }
        if ((-1) - (((-1) - i7) | ((-1) - 306783379)) == 306783378 && (-1) - (((-1) - 74899) | ((-1) - i8)) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i4 + 1) - (i4 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i11 != 0) {
                    companion = Modifier.Companion;
                }
                if (i12 != 0) {
                    z7 = true;
                }
                if (i13 != 0) {
                    z6 = false;
                }
                if (i15 != 0) {
                    textStyle2 = TextStyle.Companion.getDefault();
                }
                if (i16 != 0) {
                    keyboardOptions2 = KeyboardOptions.Companion.getDefault();
                }
                if (i18 != 0) {
                    keyboardActions2 = KeyboardActions.Companion.getDefault();
                }
                if (i20 != 0) {
                    z5 = false;
                }
                if ((-1) - (((-1) - i6) | ((-1) - 512)) != 0) {
                    i10 = z5 ? 1 : Integer.MAX_VALUE;
                    i7 = (i7 - 1879048193) - (i7 | (-1879048193));
                }
                if (i21 != 0) {
                    i9 = 1;
                }
                if (i22 != 0) {
                    none = VisualTransformation.Companion.getNone();
                }
                if (i23 != 0) {
                    anonymousClass6 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.6
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(TextLayoutResult textLayoutResult) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }
                    };
                }
                if (i25 != 0) {
                    mutableInteractionSource2 = null;
                }
                if (i26 != 0) {
                    solidColor = new SolidColor(Color.Companion.m4204getBlack0d7_KjU(), null);
                }
                if (i27 != 0) {
                    function3M1324getLambda1$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m1324getLambda1$foundation_release();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i6 & 512) != 0) {
                    i7 &= -1879048193;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(945255183, i7, i8, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1243231713, "CC(remember):BasicTextField.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final TextFieldValue textFieldValueM6366copy3r_uNRQ$default = TextFieldValue.m6366copy3r_uNRQ$default(BasicTextField$lambda$21(mutableState), str, 0L, (TextRange) null, 6, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1243220258, "CC(remember):BasicTextField.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(textFieldValueM6366copy3r_uNRQ$default);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
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
                        if (TextRange.m6116equalsimpl0(textFieldValueM6366copy3r_uNRQ$default.m6370getSelectiond9O1mEE(), BasicTextFieldKt.BasicTextField$lambda$21(mutableState).m6370getSelectiond9O1mEE()) && Intrinsics.areEqual(textFieldValueM6366copy3r_uNRQ$default.m6369getCompositionMzsxiRA(), BasicTextFieldKt.BasicTextField$lambda$21(mutableState).m6369getCompositionMzsxiRA())) {
                            return;
                        }
                        mutableState.setValue(textFieldValueM6366copy3r_uNRQ$default);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            EffectsKt.SideEffect((Function0) objRememberedValue2, composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1243203249, "CC(remember):BasicTextField.kt#9igjgp");
            boolean z8 = (i7 & 14) == 4;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z8 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final MutableState mutableState2 = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ImeOptions imeOptions$foundation_release = keyboardOptions2.toImeOptions$foundation_release(z5);
            boolean z9 = !z5;
            int i28 = z5 ? 1 : i9;
            int i29 = z5 ? 1 : i10;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1243199141, "CC(remember):BasicTextField.kt#9igjgp");
            int i30 = (-1) - (((-1) - (composerStartRestartGroup.changed(mutableState2) ? 1 : 0)) & ((-1) - ((i7 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) != 32 ? 0 : 1)));
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (i30 != 0 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                        invoke2(textFieldValue);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TextFieldValue textFieldValue) {
                        mutableState.setValue(textFieldValue);
                        boolean zAreEqual = Intrinsics.areEqual(BasicTextFieldKt.BasicTextField$lambda$25(mutableState2), textFieldValue.getText());
                        mutableState2.setValue(textFieldValue.getText());
                        if (zAreEqual) {
                            return;
                        }
                        function1.invoke(textFieldValue.getText());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            int i31 = i8 << 9;
            int i32 = ((-1) - (((-1) - (((-1) - (((-1) - i7) | ((-1) - 896))) | ((i7 >> 6) & 7168))) & ((-1) - (57344 & i31)))) | ((458752 + i31) - (458752 | i31));
            int i33 = 3670016 & i31;
            int i34 = (-1) - (((-1) - ((i32 + i33) - (i32 & i33))) & ((-1) - (i31 & 29360128)));
            int i35 = ((-1) - (((-1) - ((-1) - (((-1) - (i7 >> 15)) | ((-1) - 896)))) & ((-1) - (7168 & i7)))) | ((i7 + 57344) - (i7 | 57344));
            int i36 = (i8 + 458752) - (i8 | 458752);
            z7 = z7;
            CoreTextFieldKt.CoreTextField(textFieldValueM6366copy3r_uNRQ$default, (Function1) objRememberedValue4, companion, textStyle2, none, anonymousClass6, mutableInteractionSource2, solidColor, z9, i29, i28, imeOptions$foundation_release, keyboardActions2, z7, z6, function3M1324getLambda1$foundation_release, composerStartRestartGroup, i34, (i35 + i36) - (i35 & i36), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final boolean z10 = z7;
            final boolean z11 = z6;
            final TextStyle textStyle3 = textStyle2;
            final KeyboardOptions keyboardOptions3 = keyboardOptions2;
            final KeyboardActions keyboardActions3 = keyboardActions2;
            final boolean z12 = z5;
            final int i37 = i10;
            final int i38 = i9;
            final VisualTransformation visualTransformation2 = none;
            final Function1<? super TextLayoutResult, Unit> function13 = anonymousClass6;
            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
            final Brush brush2 = solidColor;
            final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function32 = function3M1324getLambda1$foundation_release;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.9
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

                public final void invoke(Composer composer2, int i39) {
                    String str2 = str;
                    Function1<String, Unit> function14 = function1;
                    Modifier modifier3 = modifier2;
                    boolean z13 = z10;
                    boolean z14 = z11;
                    TextStyle textStyle4 = textStyle3;
                    KeyboardOptions keyboardOptions4 = keyboardOptions3;
                    KeyboardActions keyboardActions4 = keyboardActions3;
                    boolean z15 = z12;
                    int i40 = i37;
                    int i41 = i38;
                    VisualTransformation visualTransformation3 = visualTransformation2;
                    Function1<TextLayoutResult, Unit> function15 = function13;
                    MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                    Brush brush3 = brush2;
                    Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function33 = function32;
                    int i42 = i4;
                    BasicTextFieldKt.BasicTextField(str2, function14, modifier3, z13, z14, textStyle4, keyboardOptions4, keyboardActions4, z15, i40, i41, visualTransformation3, function15, mutableInteractionSource4, brush3, function33, composer2, RecomposeScopeImplKt.updateChangedFlags((i42 + 1) - (i42 & 1)), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue BasicTextField$lambda$21(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String BasicTextField$lambda$25(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    public static final void BasicTextField(final TextFieldValue textFieldValue, final Function1<? super TextFieldValue, Unit> function1, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i2, int i3, VisualTransformation visualTransformation, Function1<? super TextLayoutResult, Unit> function12, MutableInteractionSource mutableInteractionSource, Brush brush, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3M1325getLambda2$foundation_release = function3;
        SolidColor solidColor = brush;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        AnonymousClass10 anonymousClass10 = function12;
        int i9 = i3;
        int i10 = i2;
        boolean z5 = z4;
        VisualTransformation none = visualTransformation;
        KeyboardActions keyboardActions2 = keyboardActions;
        KeyboardOptions keyboardOptions2 = keyboardOptions;
        TextStyle textStyle2 = textStyle;
        boolean z6 = z3;
        boolean z7 = z2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1804514146);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BasicTextField)P(14,10,8,2,11,13,5,4,12,6,7,15,9,3)765@39981L90,763@39919L740:BasicTextField.kt#423gt5");
        if ((i6 + 1) - (i6 | 1) != 0) {
            i7 = (-1) - (((-1) - i4) & ((-1) - 6));
        } else if ((i4 + 6) - (i4 | 6) == 0) {
            i7 = (-1) - (((-1) - (composerStartRestartGroup.changed(textFieldValue) ? 4 : 2)) & ((-1) - i4));
        } else {
            i7 = i4;
        }
        if ((i6 + 2) - (i6 | 2) != 0) {
            i7 = (i7 + 48) - (i7 & 48);
        } else if ((-1) - (((-1) - i4) | ((-1) - 48)) == 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - (composerStartRestartGroup.changedInstance(function1) ? 32 : 16)));
        }
        int i11 = (-1) - (((-1) - i6) | ((-1) - 4));
        if (i11 != 0) {
            i7 = (i7 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i7 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((-1) - (((-1) - i4) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - (composerStartRestartGroup.changed(companion) ? 256 : 128)));
        }
        int i12 = (-1) - (((-1) - i6) | ((-1) - 8));
        if (i12 != 0) {
            i7 = (i7 + 3072) - (i7 & 3072);
        } else if ((i4 & 3072) == 0) {
            int i13 = composerStartRestartGroup.changed(z7) ? 2048 : 1024;
            i7 = (i7 + i13) - (i7 & i13);
        }
        int i14 = (i6 + 16) - (i6 | 16);
        if (i14 != 0) {
            i7 = (i7 + 24576) - (i7 & 24576);
        } else if ((i4 + 24576) - (i4 | 24576) == 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - (composerStartRestartGroup.changed(z6) ? 16384 : 8192)));
        }
        int i15 = (i6 + 32) - (i6 | 32);
        if (i15 != 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((i4 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i4 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - (composerStartRestartGroup.changed(textStyle2) ? 131072 : 65536)));
        }
        int i16 = i6 & 64;
        if (i16 != 0) {
            i7 |= 1572864;
        } else if ((i4 & 1572864) == 0) {
            i7 |= composerStartRestartGroup.changed(keyboardOptions2) ? 1048576 : 524288;
        }
        int i17 = i6 & 128;
        if (i17 != 0) {
            i7 = (i7 + 12582912) - (i7 & 12582912);
        } else if ((-1) - (((-1) - i4) | ((-1) - 12582912)) == 0) {
            int i18 = composerStartRestartGroup.changed(keyboardActions2) ? 8388608 : 4194304;
            i7 = (i7 + i18) - (i7 & i18);
        }
        int i19 = (i6 + 256) - (i6 | 256);
        if (i19 != 0) {
            i7 |= 100663296;
        } else if ((i4 + 100663296) - (i4 | 100663296) == 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - (composerStartRestartGroup.changed(z5) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        if ((i4 + 805306368) - (i4 | 805306368) == 0) {
            i7 |= ((i6 & 512) == 0 && composerStartRestartGroup.changed(i10)) ? 536870912 : 268435456;
        }
        int i20 = (-1) - (((-1) - i6) | ((-1) - 1024));
        if (i20 != 0) {
            i8 = (i5 + 6) - (i5 & 6);
        } else if ((-1) - (((-1) - i5) | ((-1) - 6)) == 0) {
            i8 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(i9) ? 4 : 2)));
        } else {
            i8 = i5;
        }
        int i21 = (i6 + 2048) - (i6 | 2048);
        if (i21 != 0) {
            i8 = (i8 + 48) - (i8 & 48);
        } else if ((i5 & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(none) ? 32 : 16;
        }
        int i22 = (-1) - (((-1) - i6) | ((-1) - 4096));
        if (i22 != 0) {
            i8 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i5 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - (composerStartRestartGroup.changedInstance(anonymousClass10) ? 256 : 128)));
        }
        int i23 = (i6 + 8192) - (i6 | 8192);
        if (i23 != 0) {
            i8 = (i8 + 3072) - (i8 & 3072);
        } else if ((i5 + 3072) - (i5 | 3072) == 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - (composerStartRestartGroup.changed(mutableInteractionSource2) ? 2048 : 1024)));
        }
        int i24 = (i6 + 16384) - (i6 | 16384);
        if (i24 != 0) {
            i8 = (i8 + 24576) - (i8 & 24576);
        } else if ((i5 & 24576) == 0) {
            i8 |= composerStartRestartGroup.changed(solidColor) ? 16384 : 8192;
        }
        int i25 = (-1) - (((-1) - i6) | ((-1) - 32768));
        if (i25 != 0) {
            i8 = (i8 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i8 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((-1) - (((-1) - i5) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(function3M1325getLambda2$foundation_release) ? 131072 : 65536;
        }
        if ((i7 + 306783379) - (306783379 | i7) == 306783378 && (74899 + i8) - (74899 | i8) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i4 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i11 != 0) {
                    companion = Modifier.Companion;
                }
                if (i12 != 0) {
                    z7 = true;
                }
                if (i14 != 0) {
                    z6 = false;
                }
                if (i15 != 0) {
                    textStyle2 = TextStyle.Companion.getDefault();
                }
                if (i16 != 0) {
                    keyboardOptions2 = KeyboardOptions.Companion.getDefault();
                }
                if (i17 != 0) {
                    keyboardActions2 = KeyboardActions.Companion.getDefault();
                }
                if (i19 != 0) {
                    z5 = false;
                }
                if ((i6 + 512) - (i6 | 512) != 0) {
                    i10 = z5 ? 1 : Integer.MAX_VALUE;
                    i7 = (-1) - (((-1) - i7) | ((-1) - (-1879048193)));
                }
                if (i20 != 0) {
                    i9 = 1;
                }
                if (i21 != 0) {
                    none = VisualTransformation.Companion.getNone();
                }
                if (i22 != 0) {
                    anonymousClass10 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.10
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(TextLayoutResult textLayoutResult) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }
                    };
                }
                if (i23 != 0) {
                    mutableInteractionSource2 = null;
                }
                if (i24 != 0) {
                    solidColor = new SolidColor(Color.Companion.m4204getBlack0d7_KjU(), null);
                }
                if (i25 != 0) {
                    function3M1325getLambda2$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m1325getLambda2$foundation_release();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i6) | ((-1) - 512)) != 0) {
                    i7 = (-1) - (((-1) - i7) | ((-1) - (-1879048193)));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1804514146, i7, i8, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
            }
            ImeOptions imeOptions$foundation_release = keyboardOptions2.toImeOptions$foundation_release(z5);
            boolean z8 = !z5;
            int i26 = z5 ? 1 : i9;
            int i27 = z5 ? 1 : i10;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1242950016, "CC(remember):BasicTextField.kt#9igjgp");
            boolean z9 = ((i7 & 14) == 4) | ((i7 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z9 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$11$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                        invoke2(textFieldValue2);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TextFieldValue textFieldValue2) {
                        if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                            return;
                        }
                        function1.invoke(textFieldValue2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            int i28 = (-1) - (((-1) - (i7 & 910)) & ((-1) - ((i7 >> 6) & 7168)));
            int i29 = i8 << 9;
            int i30 = (-1) - (((-1) - 57344) | ((-1) - i29));
            z7 = z7;
            CoreTextFieldKt.CoreTextField(textFieldValue, (Function1) objRememberedValue, companion, textStyle2, none, anonymousClass10, mutableInteractionSource2, solidColor, z8, i27, i26, imeOptions$foundation_release, keyboardActions2, z7, z6, function3M1325getLambda2$foundation_release, composerStartRestartGroup, ((-1) - (((-1) - ((-1) - (((-1) - ((i28 + i30) - (i28 & i30))) & ((-1) - ((-1) - (((-1) - 458752) | ((-1) - i29))))))) & ((-1) - (3670016 & i29)))) | (i29 & 29360128), (-1) - (((-1) - ((i7 & 57344) | ((-1) - (((-1) - ((-1) - (((-1) - (i7 >> 15)) | ((-1) - 896)))) & ((-1) - ((i7 + 7168) - (7168 | i7))))))) & ((-1) - ((458752 + i8) - (458752 | i8)))), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final boolean z10 = z7;
            final boolean z11 = z6;
            final TextStyle textStyle3 = textStyle2;
            final KeyboardOptions keyboardOptions3 = keyboardOptions2;
            final KeyboardActions keyboardActions3 = keyboardActions2;
            final boolean z12 = z5;
            final int i31 = i10;
            final int i32 = i9;
            final VisualTransformation visualTransformation2 = none;
            final Function1<? super TextLayoutResult, Unit> function13 = anonymousClass10;
            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
            final Brush brush2 = solidColor;
            final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function32 = function3M1325getLambda2$foundation_release;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.12
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

                public final void invoke(Composer composer2, int i33) {
                    BasicTextFieldKt.BasicTextField(textFieldValue, function1, modifier2, z10, z11, textStyle3, keyboardOptions3, keyboardActions3, z12, i31, i32, visualTransformation2, function13, mutableInteractionSource3, brush2, function32, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i4) & ((-1) - 1))), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0010G\u0005C\u0006u\u001ee]Kg\u0001_'kPeZ\n9\u001e(\u000fa\u0004Vo~Wv-rq`}")
    @InterfaceC1492Gx
    public static final /* synthetic */ void BasicTextField(String str, Function1 function1, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i2, VisualTransformation visualTransformation, Function1 function12, MutableInteractionSource mutableInteractionSource, Brush brush, Function3 function3, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        Function3 function3M1326getLambda3$foundation_release = function3;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        SolidColor solidColor = brush;
        AnonymousClass13 anonymousClass13 = function12;
        VisualTransformation none = visualTransformation;
        int i8 = i2;
        boolean z5 = z4;
        KeyboardActions keyboardActions2 = keyboardActions;
        KeyboardOptions keyboardOptions2 = keyboardOptions;
        TextStyle textStyle2 = textStyle;
        boolean z6 = z3;
        boolean z7 = z2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-454732590);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BasicTextField)P(13,9,7,2,10,12,5,4,11,6,14,8,3)802@41349L39,807@41589L579:BasicTextField.kt#423gt5");
        String str2 = str;
        if ((i5 & 1) != 0) {
            i6 = (i3 + 6) - (i3 & 6);
        } else if ((i3 & 6) == 0) {
            i6 = (-1) - (((-1) - (composerStartRestartGroup.changed(str2) ? 4 : 2)) & ((-1) - i3));
        } else {
            i6 = i3;
        }
        Function1 function13 = function1;
        if ((-1) - (((-1) - i5) | ((-1) - 2)) != 0) {
            i6 = (i6 + 48) - (i6 & 48);
        } else if ((-1) - (((-1) - i3) | ((-1) - 48)) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function13) ? 32 : 16;
        }
        int i9 = (i5 + 4) - (i5 | 4);
        if (i9 != 0) {
            i6 = (i6 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i6 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((-1) - (((-1) - i3) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i10 = composerStartRestartGroup.changed(companion) ? 256 : 128;
            i6 = (i6 + i10) - (i6 & i10);
        }
        int i11 = i5 & 8;
        if (i11 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 3072));
        } else if ((-1) - (((-1) - i3) | ((-1) - 3072)) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(z7) ? 2048 : 1024)));
        }
        int i12 = (-1) - (((-1) - i5) | ((-1) - 16));
        if (i12 != 0) {
            i6 |= 24576;
        } else if ((i3 & 24576) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(z6) ? 16384 : 8192)));
        }
        int i13 = (i5 + 32) - (i5 | 32);
        if (i13 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(textStyle2) ? 131072 : 65536)));
        }
        int i14 = i5 & 64;
        if (i14 != 0) {
            i6 |= 1572864;
        } else if ((-1) - (((-1) - i3) | ((-1) - 1572864)) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(keyboardOptions2) ? 1048576 : 524288)));
        }
        int i15 = (i5 + 128) - (i5 | 128);
        if (i15 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 12582912));
        } else if ((i3 + 12582912) - (i3 | 12582912) == 0) {
            i6 |= composerStartRestartGroup.changed(keyboardActions2) ? 8388608 : 4194304;
        }
        int i16 = i5 & 256;
        if (i16 != 0) {
            i6 |= 100663296;
        } else if ((i3 + 100663296) - (i3 | 100663296) == 0) {
            int i17 = composerStartRestartGroup.changed(z5) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            i6 = (i6 + i17) - (i6 & i17);
        }
        int i18 = (-1) - (((-1) - i5) | ((-1) - 512));
        if (i18 != 0) {
            i6 = (i6 + 805306368) - (i6 & 805306368);
        } else if ((i3 & 805306368) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(i8) ? 536870912 : 268435456)));
        }
        int i19 = i5 & 1024;
        if (i19 != 0) {
            i7 = (-1) - (((-1) - i4) & ((-1) - 6));
        } else if ((i4 & 6) == 0) {
            i7 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(none) ? 4 : 2)));
        } else {
            i7 = i4;
        }
        int i20 = (i5 + 2048) - (i5 | 2048);
        if (i20 != 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - 48));
        } else if ((-1) - (((-1) - i4) | ((-1) - 48)) == 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - (composerStartRestartGroup.changedInstance(anonymousClass13) ? 32 : 16)));
        }
        int i21 = i5 & 4096;
        if (i21 != 0) {
            i7 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - (composerStartRestartGroup.changed(mutableInteractionSource2) ? 256 : 128)));
        }
        int i22 = (-1) - (((-1) - i5) | ((-1) - 8192));
        if (i22 != 0) {
            i7 = (i7 + 3072) - (i7 & 3072);
        } else if ((i4 + 3072) - (i4 | 3072) == 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - (composerStartRestartGroup.changed(solidColor) ? 2048 : 1024)));
        }
        int i23 = (i5 + 16384) - (i5 | 16384);
        if (i23 != 0) {
            i7 |= 24576;
        } else if ((i4 + 24576) - (i4 | 24576) == 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - (composerStartRestartGroup.changedInstance(function3M1326getLambda3$foundation_release) ? 16384 : 8192)));
        }
        if ((i6 + 306783379) - (306783379 | i6) == 306783378 && (i7 + 9363) - (9363 | i7) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i9 != 0) {
                companion = Modifier.Companion;
            }
            if (i11 != 0) {
                z7 = true;
            }
            if (i12 != 0) {
                z6 = false;
            }
            if (i13 != 0) {
                textStyle2 = TextStyle.Companion.getDefault();
            }
            if (i14 != 0) {
                keyboardOptions2 = KeyboardOptions.Companion.getDefault();
            }
            if (i15 != 0) {
                keyboardActions2 = KeyboardActions.Companion.getDefault();
            }
            if (i16 != 0) {
                z5 = false;
            }
            if (i18 != 0) {
                i8 = Integer.MAX_VALUE;
            }
            if (i19 != 0) {
                none = VisualTransformation.Companion.getNone();
            }
            if (i20 != 0) {
                anonymousClass13 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.13
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TextLayoutResult textLayoutResult) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                        invoke2(textLayoutResult);
                        return Unit.INSTANCE;
                    }
                };
            }
            if (i21 != 0) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1242906291, "CC(remember):BasicTextField.kt#9igjgp");
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            }
            if (i22 != 0) {
                solidColor = new SolidColor(Color.Companion.m4204getBlack0d7_KjU(), null);
            }
            if (i23 != 0) {
                function3M1326getLambda3$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m1326getLambda3$foundation_release();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-454732590, i6, i7, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:806)");
            }
            int i24 = (i6 + 2147483646) - (i6 | 2147483646);
            int i25 = i7 << 3;
            int i26 = (i25 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i25);
            int i27 = (i26 + 6) - (i26 & 6);
            int i28 = (-1) - (((-1) - i25) | ((-1) - 896));
            int i29 = (i27 + i28) - (i27 & i28);
            int i30 = 7168 & i25;
            int i31 = (i29 + i30) - (i29 & i30);
            int i32 = (-1) - (((-1) - 57344) | ((-1) - i25));
            int i33 = (i31 + i32) - (i31 & i32);
            int i34 = i25 & 458752;
            str2 = str2;
            function13 = function13;
            BasicTextField(str2, (Function1<? super String, Unit>) function13, companion, z7, z6, textStyle2, keyboardOptions2, keyboardActions2, z5, i8, 1, none, (Function1<? super TextLayoutResult, Unit>) anonymousClass13, mutableInteractionSource2, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3M1326getLambda3$foundation_release, composerStartRestartGroup, i24, (i33 + i34) - (i33 & i34), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final String str3 = str2;
            final Function1 function14 = function13;
            final Modifier modifier2 = companion;
            final boolean z8 = z7;
            final boolean z9 = z6;
            final TextStyle textStyle3 = textStyle2;
            final KeyboardOptions keyboardOptions3 = keyboardOptions2;
            final KeyboardActions keyboardActions3 = keyboardActions2;
            final boolean z10 = z5;
            final int i35 = i8;
            final VisualTransformation visualTransformation2 = none;
            final Function1 function15 = anonymousClass13;
            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
            final Brush brush2 = solidColor;
            final Function3 function32 = function3M1326getLambda3$foundation_release;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.15
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

                public final void invoke(Composer composer2, int i36) {
                    String str4 = str3;
                    Function1<String, Unit> function16 = function14;
                    Modifier modifier3 = modifier2;
                    boolean z11 = z8;
                    boolean z12 = z9;
                    TextStyle textStyle4 = textStyle3;
                    KeyboardOptions keyboardOptions4 = keyboardOptions3;
                    KeyboardActions keyboardActions4 = keyboardActions3;
                    boolean z13 = z10;
                    int i37 = i35;
                    VisualTransformation visualTransformation3 = visualTransformation2;
                    Function1<TextLayoutResult, Unit> function17 = function15;
                    MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                    Brush brush3 = brush2;
                    Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function33 = function32;
                    int i38 = i3;
                    BasicTextFieldKt.BasicTextField(str4, function16, modifier3, z11, z12, textStyle4, keyboardOptions4, keyboardActions4, z13, i37, visualTransformation3, function17, mutableInteractionSource4, brush3, function33, composer2, RecomposeScopeImplKt.updateChangedFlags((i38 + 1) - (i38 & 1)), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0010G\u0005C\u0006u\u001ee]Kg\u0001_'kPeZ\n9\u001e(\u000fa\u0004Vo~Wv-rq`}")
    @InterfaceC1492Gx
    public static final /* synthetic */ void BasicTextField(TextFieldValue textFieldValue, Function1 function1, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i2, VisualTransformation visualTransformation, Function1 function12, MutableInteractionSource mutableInteractionSource, Brush brush, Function3 function3, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        Function3 function3M1327getLambda4$foundation_release = function3;
        SolidColor solidColor = brush;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        AnonymousClass16 anonymousClass16 = function12;
        VisualTransformation none = visualTransformation;
        int i8 = i2;
        boolean z5 = z4;
        KeyboardActions keyboardActions2 = keyboardActions;
        KeyboardOptions keyboardOptions2 = keyboardOptions;
        TextStyle textStyle2 = textStyle;
        boolean z6 = z3;
        boolean z7 = z2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-560482651);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BasicTextField)P(13,9,7,2,10,12,5,4,11,6,14,8,3)842@42874L39,847@43114L579:BasicTextField.kt#423gt5");
        TextFieldValue textFieldValue2 = textFieldValue;
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
            i6 = (-1) - (((-1) - (composerStartRestartGroup.changed(textFieldValue2) ? 4 : 2)) & ((-1) - i3));
        } else {
            i6 = i3;
        }
        Function1 function13 = function1;
        if ((i5 & 2) != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 48));
        } else if ((i3 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function13) ? 32 : 16;
        }
        int i9 = i5 & 4;
        if (i9 != 0) {
            i6 = (i6 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i6 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((-1) - (((-1) - i3) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(companion) ? 256 : 128)));
        }
        int i10 = (-1) - (((-1) - i5) | ((-1) - 8));
        if (i10 != 0) {
            i6 |= 3072;
        } else if ((-1) - (((-1) - i3) | ((-1) - 3072)) == 0) {
            i6 |= composerStartRestartGroup.changed(z7) ? 2048 : 1024;
        }
        int i11 = (i5 + 16) - (i5 | 16);
        if (i11 != 0) {
            i6 = (i6 + 24576) - (i6 & 24576);
        } else if ((i3 + 24576) - (i3 | 24576) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(z6) ? 16384 : 8192)));
        }
        int i12 = i5 & 32;
        if (i12 != 0) {
            i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i3 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i3 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            int i13 = composerStartRestartGroup.changed(textStyle2) ? 131072 : 65536;
            i6 = (i6 + i13) - (i6 & i13);
        }
        int i14 = i5 & 64;
        if (i14 != 0) {
            i6 = (i6 + 1572864) - (i6 & 1572864);
        } else if ((i3 + 1572864) - (i3 | 1572864) == 0) {
            i6 |= composerStartRestartGroup.changed(keyboardOptions2) ? 1048576 : 524288;
        }
        int i15 = (-1) - (((-1) - i5) | ((-1) - 128));
        if (i15 != 0) {
            i6 = (i6 + 12582912) - (i6 & 12582912);
        } else if ((-1) - (((-1) - i3) | ((-1) - 12582912)) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(keyboardActions2) ? 8388608 : 4194304)));
        }
        int i16 = i5 & 256;
        if (i16 != 0) {
            i6 = (i6 + 100663296) - (i6 & 100663296);
        } else if ((i3 + 100663296) - (i3 | 100663296) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(z5) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        int i17 = (-1) - (((-1) - i5) | ((-1) - 512));
        if (i17 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 805306368));
        } else if ((i3 & 805306368) == 0) {
            int i18 = composerStartRestartGroup.changed(i8) ? 536870912 : 268435456;
            i6 = (i6 + i18) - (i6 & i18);
        }
        int i19 = (i5 + 1024) - (i5 | 1024);
        if (i19 != 0) {
            i7 = (-1) - (((-1) - i4) & ((-1) - 6));
        } else if ((-1) - (((-1) - i4) | ((-1) - 6)) == 0) {
            int i20 = composerStartRestartGroup.changed(none) ? 4 : 2;
            i7 = (i4 + i20) - (i4 & i20);
        } else {
            i7 = i4;
        }
        int i21 = i5 & 2048;
        if (i21 != 0) {
            i7 = (i7 + 48) - (i7 & 48);
        } else if ((i4 + 48) - (i4 | 48) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(anonymousClass16) ? 32 : 16;
        }
        int i22 = (i5 + 4096) - (i5 | 4096);
        if (i22 != 0) {
            i7 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((-1) - (((-1) - i4) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i7 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 256 : 128;
        }
        int i23 = (i5 + 8192) - (i5 | 8192);
        if (i23 != 0) {
            i7 = (i7 + 3072) - (i7 & 3072);
        } else if ((-1) - (((-1) - i4) | ((-1) - 3072)) == 0) {
            int i24 = composerStartRestartGroup.changed(solidColor) ? 2048 : 1024;
            i7 = (i7 + i24) - (i7 & i24);
        }
        int i25 = i5 & 16384;
        if (i25 != 0) {
            i7 |= 24576;
        } else if ((i4 & 24576) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(function3M1327getLambda4$foundation_release) ? 16384 : 8192;
        }
        if ((i6 + 306783379) - (306783379 | i6) == 306783378 && (-1) - (((-1) - i7) | ((-1) - 9363)) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i9 != 0) {
                companion = Modifier.Companion;
            }
            if (i10 != 0) {
                z7 = true;
            }
            if (i11 != 0) {
                z6 = false;
            }
            if (i12 != 0) {
                textStyle2 = TextStyle.Companion.getDefault();
            }
            if (i14 != 0) {
                keyboardOptions2 = KeyboardOptions.Companion.getDefault();
            }
            if (i15 != 0) {
                keyboardActions2 = KeyboardActions.Companion.getDefault();
            }
            if (i16 != 0) {
                z5 = false;
            }
            if (i17 != 0) {
                i8 = Integer.MAX_VALUE;
            }
            if (i19 != 0) {
                none = VisualTransformation.Companion.getNone();
            }
            if (i21 != 0) {
                anonymousClass16 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.16
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TextLayoutResult textLayoutResult) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                        invoke2(textLayoutResult);
                        return Unit.INSTANCE;
                    }
                };
            }
            if (i22 != 0) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1242857491, "CC(remember):BasicTextField.kt#9igjgp");
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            }
            if (i23 != 0) {
                solidColor = new SolidColor(Color.Companion.m4204getBlack0d7_KjU(), null);
            }
            if (i25 != 0) {
                function3M1327getLambda4$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m1327getLambda4$foundation_release();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-560482651, i6, i7, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:846)");
            }
            int i26 = (-1) - (((-1) - i6) | ((-1) - 2147483646));
            int i27 = i7 << 3;
            int i28 = (-1) - (((-1) - i27) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
            textFieldValue2 = textFieldValue2;
            function13 = function13;
            BasicTextField(textFieldValue2, (Function1<? super TextFieldValue, Unit>) function13, companion, z7, z6, textStyle2, keyboardOptions2, keyboardActions2, z5, i8, 1, none, (Function1<? super TextLayoutResult, Unit>) anonymousClass16, mutableInteractionSource2, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3M1327getLambda4$foundation_release, composerStartRestartGroup, i26, (-1) - (((-1) - (((-1) - (((-1) - (((i28 + 6) - (i28 & 6)) | ((-1) - (((-1) - i27) | ((-1) - 896))))) & ((-1) - ((-1) - (((-1) - i27) | ((-1) - 7168)))))) | ((-1) - (((-1) - 57344) | ((-1) - i27))))) & ((-1) - ((i27 + 458752) - (i27 | 458752)))), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final TextFieldValue textFieldValue3 = textFieldValue2;
            final Function1 function14 = function13;
            final Modifier modifier2 = companion;
            final boolean z8 = z7;
            final boolean z9 = z6;
            final TextStyle textStyle3 = textStyle2;
            final KeyboardOptions keyboardOptions3 = keyboardOptions2;
            final KeyboardActions keyboardActions3 = keyboardActions2;
            final boolean z10 = z5;
            final int i29 = i8;
            final VisualTransformation visualTransformation2 = none;
            final Function1 function15 = anonymousClass16;
            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
            final Brush brush2 = solidColor;
            final Function3 function32 = function3M1327getLambda4$foundation_release;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.18
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

                public final void invoke(Composer composer2, int i30) {
                    TextFieldValue textFieldValue4 = textFieldValue3;
                    Function1<TextFieldValue, Unit> function16 = function14;
                    Modifier modifier3 = modifier2;
                    boolean z11 = z8;
                    boolean z12 = z9;
                    TextStyle textStyle4 = textStyle3;
                    KeyboardOptions keyboardOptions4 = keyboardOptions3;
                    KeyboardActions keyboardActions4 = keyboardActions3;
                    boolean z13 = z10;
                    int i31 = i29;
                    VisualTransformation visualTransformation3 = visualTransformation2;
                    Function1<TextLayoutResult, Unit> function17 = function15;
                    MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                    Brush brush3 = brush2;
                    Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function33 = function32;
                    int i32 = i3;
                    BasicTextFieldKt.BasicTextField(textFieldValue4, function16, modifier3, z11, z12, textStyle4, keyboardOptions4, keyboardActions4, z13, i31, visualTransformation3, function17, mutableInteractionSource4, brush3, function33, composer2, RecomposeScopeImplKt.updateChangedFlags((i32 + 1) - (i32 & 1)), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                }
            });
        }
    }

    private static final TextFieldHandleState TextFieldCursorHandle$lambda$9(State<TextFieldHandleState> state) {
        return state.getValue();
    }

    private static final TextFieldHandleState TextFieldSelectionHandles$lambda$13(State<TextFieldHandleState> state) {
        return state.getValue();
    }

    private static final TextFieldHandleState TextFieldSelectionHandles$lambda$17(State<TextFieldHandleState> state) {
        return state.getValue();
    }
}
