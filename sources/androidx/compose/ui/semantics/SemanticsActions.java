package androidx.compose.ui.semantics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
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
/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яx\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012\u000e\u0007njG9LeN3ZS8-s{J$c$wICU0}*\t]mog|Ob\u000bI\u000f\u000e\u0016\u000fj4I[xe\u0012%2JoEJUoS9htL\u0005(2(;\u0002\u0005\u0017\u001a2Ϻ\u0018v\u0011CS\f\u00180HpHX\u0015M\u000b\u001d\u001a\u0006T \t\u001ebmTɬH\u0003җj/Q\u0002*GT'ۢ4|[\r\u0017u5\u000e\u000fs.9PCE\u001d5Y\u0013\tb[m\bmuk\b\u0017)ݳ/O{ɎNZ\u0006\u001a#2 .kz>n\u0015_p\u001873_i[R\u001e(&\u007f*\u0011j\u0007<\bόL45Կ~\n\u0014<\u0003y$a^\fvT\u0010\tqB'-\u00109;;+f\u007ffi\u001d|:*\u0007ڟ\")\t͙9]Z\u0019n\u001cko\u0006]I]PEXT\u001a[Mm2~\u0011\u000fX\u0006ΥK\u00067Ʌ)0\u001d4Eb\nD/{\u001aZTu\u0007\u0011ppcobJP\"\u001d\u001be.7\u000f\tF\u0081\tqXӹp.\u0017^*[W\u001f\u0016%8n\bJ11 V_nyl]]8*]je\\\u001dmް[?fڨMSi#oYG5MPz\u0017htR_\u001cbl.24Xj>|*H|\u000fA4Ɛu\"<ιI\u001bb*V\nnoO\u0013!}j\u0003 \u0017dG4\u0015y,\u0005\u000f\u0011Rlp\u001e\u0001'a<~p\"[F\u007fLG)\u0004$מ8\u0003+Ȕ\u0017u\u0006auS\u0018yz1\u000es\f:&2Ie?O#\u0017\u000f/B\u0004=Ez\u000f\u0014i]\u00147z+~=R\u00171\u0016\nϡt2hʄbQZ40}/\u001a1&|\u0018\nuV\rWqd\u0017k@Yr1xLPH|3$L</rP~ީ1I/ݴ.y\u001aO#h.\u0014}O\u0012z\u001f:\u0005w\u0014:s\"\u007fda]`ZHKi~l'R\u00041EvlN٥Dީ8\u0013;ǥYfvxFT[P\f\n\u001f>\u001d~fgJ\u001b\u007f\u0004D0o*\"H,\u0018\rFS\u0013ߠWmuޮc^\u0011n\u001d\u0011[\u001d?\u0014*.M.fcr\u0011@\f\u0004\u001aFAig3@7'b.ѧ\f\u0011Kҍ\u0002\b\u0016!\u000eM00%YZ\u0006Kd\u001e`\tdfN\u0015bU`O//\u0003=6Lz\u00985\u000buۮl1iZ\u000fZm*)\u0014g\u0011v3;PdA+.h\u0003\u001bE\fHw\u0006d\u0007u+Թou\u0014Մ0~#l&\"\nr\u001f\u000b\u000fBn\u0019ep^l\u0007\u0018vT^\"W\u0004)\u0001<?8\u0011Ո\u001dUzŷz/Rz\u0006>\u0014;\u000fD\\;\u0017\u001a\roV#=\fE/MI\u0019\u0019U\u007f\u0006Vi\u007fл$&/״\r#b\u0006\u001cmZ~)i.\u0004&p\u0012\u0015#X0\n>L\u0005r836:}\u0005a\u0004եb_sլ9B-[z\r\u0013lv*\"u|q~a\u001b\u000bv7f{~-~\"7+{1AZŷ>\u0017[ݰp\u0013\u0006F#-ob\u0016\u0016A\"_qx|{Wk\u0013;1{*\u00106^VL\u0001M{,\b\u0001Ĝ*נ?bU˾t\u000bb!PW&`p]r{\\J\"3\u0017Zn\u001f#@Vz.j?9)\u001f\n\u0012ud5\u0007sK±%7Z̈398B}/G\\\u0011rz1\u0010bR?\u00032w\\=WdLH@ڵ(wj=6QKsR\n2\u00174M?kH/luӭ EWmQ\u001f\u0017<%:\fu-VElaSS//6/\u0010m{܊o@{ق\u000b%5M}\"('IdM\u0017\\T\u001c-kI\u000f^se=\"ϕM?KX\n[F;\u001a!**,73\bU7X,o\\n\u0017\"\u001a\u0014*:8\u0005CQF\u001b2\"\fߢm\u001e{ߪsc:\u0005\t\u001bikLnE\u0005\u0017Y]z\n\u0019T\u0019U\u0016G\u000f4nC\u0019\r\u0010}vnBwu{1ۺaB\u001bŎ\u001c<8(D\u0001\u0018vgq\u001eT\"ws\fz\u000baz I\"\u001c;\u001dֶ5\\f:p#\u001eb[xL<\u0003A]Cr\u000bn\u0014Ru\\E:\rʲ\u001a4Pǆ\u001a\u007fP*#\u001a\u0004z\u0002\f_6f\u001c1;!u5\u001e5izGm\u001b\u0002ZM9aP}Lh5\u0014a\u0015W1K\u00130CK\u0019.\\IݭB 2Ӆ\u001e\u0010K1V\u0017\u0015 Ru\u0006H@D`\u0011jQm\r,!MUC\u0005\u000f4r7\ni?BeZ\u001dTї'3\u0001ߏ\u001b\u0012Gg!\u0012nzG\u0002;\f\u001dEN\u000e\u0018jYa\roY\u00101\u0001Z#?\u0006m4ob\u001bY\u0014A϶[E\u0007ǋ8)*V!+3\u000f!;&:o\u0017\\Hf7XWi\u0013vB\u0019\u0014\u000bv\u001c.:=\u0004\u001dk\t?dɲ9AgގD0v[UVȓ\u007f}"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ\u0017iC\"\u001fqo\u000f", "", "u(E", "\u0011kT.e\u001b>f(l\u000b[:\f\r>u\u000f,\u0006I", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMlc@$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~5{\u001e7{$2JGBoC2pfp=\u0011l\u0002", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "5dc\u0010_,:`\b~\u000em\u001a\r\u0006=t\u00047\fO\u0005! ", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`%Gw\nE\u0006)3gG\u000e7u\u00127\\G9y\u001f+\u001fsaF\u0016w\u0012N\u000b|", "\u0011n[9T7LS", "5dc\u0010b3EO$\rz", "\u0011n_FG,Qb", "5dc\u0010b7RB\u0019\u0012\n", "\u0011tbAb4\u001aQ(\u0003\u0005g:", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~7\u000e.Fw\u001e\nKA;yB\"\u0012lh=\u0016w\bL\u0006+QU$", "5dc\u0010h:M]!Zxm0\u0007\u0012=", "\u0011tc!X?M", "5dc\u0010h;-S,\u000e", "\u0012hb:\\:L", "5dc\u0011\\:FW'\r", "\u0013w_.a+", "5dc\u0012k7:\\\u0018", "\u0015dc V9HZ o~^>\b\u0013<tf(\u0005B\u0010\u001a", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "", "5dc\u0014X;,Q&\t\u0002e\u001d\u0001\tAp\n5\u000b'\u0001 \u0019Vr", "\u0015dc!X?M:\u0015\u0013\u0005n;i\t=u\u00077", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "5dc\u0014X;-S,\u000eaZ@\u0007\u0019>R\u007f6\fG\u0010", "\u0017mb2e;-S,\u000eVm\n\r\u0016=o\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "5dc\u0016a:>`(mzq;X\u0018\ru\r6\u0006M", "\u001dm0Bg6?W \u0006i^?\f", "5dc\u001ca\bNb#\u007f~e3k\tBt>8\u007f:\u000e\u0017\u001eGk\u001c<", "\u001dm29\\*D", "5dc\u001ca\nEW\u0017\u0005", "\u001dm8:X\b<b\u001d\t\u0004", "5dc\u001ca\u0010FSt|\nb6\u0006", "\u001dm;<a.\u001cZ\u001d|\u0001", "5dc\u001ca\u0013H\\\u001b\\\u0002b*\u0003", "\u001e`V276P\\", "5dc\u001dT.>2#\u0011\u0004", "\u001e`V2?,?b", "5dc\u001dT.>:\u0019\u007f\n", "\u001e`V2E0@V(", "5dc\u001dT.>@\u001d\u0001}m", "\u001e`V2H7", "5dc\u001dT.>C$", "\u001e`bAX\u001b>f(", "5dc\u001dT:MS\b~\u000em", "\u001eda3b9F7!~V\\;\u0001\u00138", "5dc\u001dX9?]&\u0007^f,X\u0007>i\n1:<\n !Vk\u001d@\u0001.C", "5dc\u001dX9?]&\u0007^f,X\u0007>i\n1", " d`BX:M4#|\u000bl", "5dc\u001fX8NS'\u000e[h*\r\u0017", "!ba<_3\u001bg", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "F", "G", "5dc V9HZ [\u000f", "!ba<_3\u001bg\u0003\u007f{l,\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "=eU@X;", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "5dc V9HZ [\u000fH-}\u0017/t", "!ba<_3-]|\by^?", "", "5dc V9HZ m\u0005B5{\tB", "!dc\u001de6@`\u0019\r\t", ">q^4e,La", "5dc X;)`#\u0001\b^:\u000b", "!dc X3>Q(\u0003\u0005g", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "5dc X;,S ~xm0\u0007\u0012", "!dc!X?M", "5dc X;-S,\u000e", "!dc!X?MA){\tm0\f\u0019>i\n1", "5dc X;-S,\u000ehn)\u000b\u00183t\u00107\u007fJ\n", "!g^DG,Qb\u0007\u000fwl;\u0001\u0018?t\u00042\u0005", "5dc [6PB\u0019\u0012\nL<y\u0017>i\u000f8\u000bD\u000b ", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SemanticsActions {
    public static final SemanticsActions INSTANCE = new SemanticsActions();
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<List<TextLayoutResult>, Boolean>>> GetTextLayoutResult = SemanticsPropertiesKt.AccessibilityKey("GetTextLayoutResult", SemanticsPropertiesKt.AnonymousClass1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> OnClick = SemanticsPropertiesKt.AccessibilityKey("OnClick", SemanticsPropertiesKt.AnonymousClass1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> OnLongClick = SemanticsPropertiesKt.AccessibilityKey("OnLongClick", SemanticsPropertiesKt.AnonymousClass1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function2<Float, Float, Boolean>>> ScrollBy = SemanticsPropertiesKt.AccessibilityKey("ScrollBy", SemanticsPropertiesKt.AnonymousClass1.INSTANCE);
    private static final SemanticsPropertyKey<Function2<Offset, Continuation<? super Offset>, Object>> ScrollByOffset = new SemanticsPropertyKey<>("ScrollByOffset", null, 2, 0 == true ? 1 : 0);
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<Integer, Boolean>>> ScrollToIndex = SemanticsPropertiesKt.AccessibilityKey("ScrollToIndex", SemanticsPropertiesKt.AnonymousClass1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<AnnotatedString, Boolean>>> OnAutofillText = SemanticsPropertiesKt.AccessibilityKey("OnAutofillText", SemanticsPropertiesKt.AnonymousClass1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<Float, Boolean>>> SetProgress = SemanticsPropertiesKt.AccessibilityKey("SetProgress", SemanticsPropertiesKt.AnonymousClass1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function3<Integer, Integer, Boolean, Boolean>>> SetSelection = SemanticsPropertiesKt.AccessibilityKey("SetSelection", SemanticsPropertiesKt.AnonymousClass1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<AnnotatedString, Boolean>>> SetText = SemanticsPropertiesKt.AccessibilityKey("SetText", SemanticsPropertiesKt.AnonymousClass1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<AnnotatedString, Boolean>>> SetTextSubstitution = SemanticsPropertiesKt.AccessibilityKey("SetTextSubstitution", SemanticsPropertiesKt.AnonymousClass1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<Boolean, Boolean>>> ShowTextSubstitution = SemanticsPropertiesKt.AccessibilityKey("ShowTextSubstitution", SemanticsPropertiesKt.AnonymousClass1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> ClearTextSubstitution = SemanticsPropertiesKt.AccessibilityKey("ClearTextSubstitution", SemanticsPropertiesKt.AnonymousClass1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<AnnotatedString, Boolean>>> InsertTextAtCursor = SemanticsPropertiesKt.AccessibilityKey("InsertTextAtCursor", SemanticsPropertiesKt.AnonymousClass1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> OnImeAction = SemanticsPropertiesKt.AccessibilityKey("PerformImeAction", SemanticsPropertiesKt.AnonymousClass1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PerformImeAction = SemanticsPropertiesKt.AccessibilityKey("PerformImeAction", SemanticsPropertiesKt.AnonymousClass1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> CopyText = SemanticsPropertiesKt.AccessibilityKey("CopyText", SemanticsPropertiesKt.AnonymousClass1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> CutText = SemanticsPropertiesKt.AccessibilityKey("CutText", SemanticsPropertiesKt.AnonymousClass1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PasteText = SemanticsPropertiesKt.AccessibilityKey("PasteText", SemanticsPropertiesKt.AnonymousClass1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> Expand = SemanticsPropertiesKt.AccessibilityKey("Expand", SemanticsPropertiesKt.AnonymousClass1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> Collapse = SemanticsPropertiesKt.AccessibilityKey("Collapse", SemanticsPropertiesKt.AnonymousClass1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> Dismiss = SemanticsPropertiesKt.AccessibilityKey("Dismiss", SemanticsPropertiesKt.AnonymousClass1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> RequestFocus = SemanticsPropertiesKt.AccessibilityKey("RequestFocus", SemanticsPropertiesKt.AnonymousClass1.INSTANCE);
    private static final SemanticsPropertyKey<List<CustomAccessibilityAction>> CustomActions = SemanticsPropertiesKt.AccessibilityKey("CustomActions");
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PageUp = SemanticsPropertiesKt.AccessibilityKey("PageUp", SemanticsPropertiesKt.AnonymousClass1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PageLeft = SemanticsPropertiesKt.AccessibilityKey("PageLeft", SemanticsPropertiesKt.AnonymousClass1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PageDown = SemanticsPropertiesKt.AccessibilityKey("PageDown", SemanticsPropertiesKt.AnonymousClass1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PageRight = SemanticsPropertiesKt.AccessibilityKey("PageRight", SemanticsPropertiesKt.AnonymousClass1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<List<Float>, Boolean>>> GetScrollViewportLength = SemanticsPropertiesKt.AccessibilityKey("GetScrollViewportLength", SemanticsPropertiesKt.AnonymousClass1.INSTANCE);
    public static final int $stable = 8;

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0018Y\u0001tqg\u001adYU<\u0004S(\rQpU\u00185\u00186z`_SsKQ\t-uvL$K[o|>G\"\u0001", replaceWith = @ReplaceWith(expression = "OnImeAction", imports = {"androidx.compose.ui.semantics.SemanticsActions.OnImeAction"}))
    @InterfaceC1492Gx
    public static /* synthetic */ void getPerformImeAction$annotations() {
    }

    private SemanticsActions() {
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<List<TextLayoutResult>, Boolean>>> getGetTextLayoutResult() {
        return GetTextLayoutResult;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getOnClick() {
        return OnClick;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getOnLongClick() {
        return OnLongClick;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function2<Float, Float, Boolean>>> getScrollBy() {
        return ScrollBy;
    }

    public final SemanticsPropertyKey<Function2<Offset, Continuation<? super Offset>, Object>> getScrollByOffset() {
        return ScrollByOffset;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<Integer, Boolean>>> getScrollToIndex() {
        return ScrollToIndex;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<AnnotatedString, Boolean>>> getOnAutofillText$ui_release() {
        return OnAutofillText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<Float, Boolean>>> getSetProgress() {
        return SetProgress;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function3<Integer, Integer, Boolean, Boolean>>> getSetSelection() {
        return SetSelection;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<AnnotatedString, Boolean>>> getSetText() {
        return SetText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<AnnotatedString, Boolean>>> getSetTextSubstitution() {
        return SetTextSubstitution;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<Boolean, Boolean>>> getShowTextSubstitution() {
        return ShowTextSubstitution;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getClearTextSubstitution() {
        return ClearTextSubstitution;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<AnnotatedString, Boolean>>> getInsertTextAtCursor() {
        return InsertTextAtCursor;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getOnImeAction() {
        return OnImeAction;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getPerformImeAction() {
        return PerformImeAction;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getCopyText() {
        return CopyText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getCutText() {
        return CutText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getPasteText() {
        return PasteText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getExpand() {
        return Expand;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getCollapse() {
        return Collapse;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getDismiss() {
        return Dismiss;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getRequestFocus() {
        return RequestFocus;
    }

    public final SemanticsPropertyKey<List<CustomAccessibilityAction>> getCustomActions() {
        return CustomActions;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getPageUp() {
        return PageUp;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getPageLeft() {
        return PageLeft;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getPageDown() {
        return PageDown;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getPageRight() {
        return PageRight;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<List<Float>, Boolean>>> getGetScrollViewportLength() {
        return GetScrollViewportLength;
    }
}
