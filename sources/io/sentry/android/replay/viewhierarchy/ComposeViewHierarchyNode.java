package io.sentry.android.replay.viewhierarchy;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnit;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayOptions;
import io.sentry.android.replay.SentryReplayModifiers;
import io.sentry.android.replay.util.ComposeTextLayout;
import io.sentry.android.replay.util.NodesKt;
import io.sentry.android.replay.util.TextAttributes;
import io.sentry.android.replay.util.ViewsKt;
import io.sentry.android.replay.viewhierarchy.ViewHierarchyNode;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яb\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007|jA0JhP.`\\2şs{J$cҕyCQU\"}(\tWNumvJ`\u000bK\u000f\u001c\u0016\u0001j2I]xs\u0012\u0017˰JoM?UoC9htL\u0005(2(:\u0002\u0005\u000f\u001a2H\u0016v\u0001ƑK\"۵`@\u001f9\u0013\u0012S\u0005ܨ\u0016\u0006L IPjsf8^k\fG_'\u0011wZNUn`\u0003[\u001d^V=\f%nN/NHM\u0015Se3\u000b`nW\u0003m|m\tv;?+w\t\u001e6!\u001e\"+CO;h#*j\u001ci`:?[Uq[h\u0010>v)\t=@\u0012\"\u001e'vCu2t!&3#\r\u0004D^\u001dvB.\u0006\u0012<%A\u00185A8I\u0004\u0018a\u0004.\\U\u0014\u0007#\u001dQ\u001e\u001f%ib&`C*\u001bvΦ5QF\\\u0011j\u0018yUm2{\u000b\u0004@\u0003^d03\n,F\u0017SB\f=15\u0004\u0002vY.vM\u0003vt\u0002RvbJnDFZ\r\u001a}\\d3x\u0001Xf?)MJ_7\u0002\u0016'8\\&Qg%`b]i\u0002r]_\u001a%]iMX\u001dmdæEӷ75Yү`|`z,ARa3]\u001d\u0003*ۑȜ\\͈&<Pl\u0016\u007f\nMf\u000e\u00198Mxl@:;1\\CSYٟN˩\u0001\tgʳӹ\u0014#"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001f@v78]}-3z\u00141a\r\u0019u<)\u001fva*\u000bc>1z'TH[*_f[G\u0013\u00120", "", "u(E", "-q^<g\nH]&}~g(\f\t=", "\u001aiPCTuEO\"\u0001Dk,}R!e{.h@\u0002\u0017$Gx\f<L", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "5dc X4:\\(\u0003xl\n\u0007\u00120i\u00028\t<\u0010\u001b!PW\u000eKy/4", "\u001aiPCTuEO\"\u0001Dk,}\u0010/c\u000fqc@\u0010\u001a!FE", "5dc\u0014X;,S!z\u0004m0z\u0017\ro\t)\u007fB\u0011$\u0013Vs\u0018E^%D\\\b\u001f", "u(;7T=:\u001d z\u0004`u\n\t0l\u007f&\u000b\nh\u0017&Jy\r\u0012", "5dc X4:\\(\u0003xl\n\u0007\u00120i\u00028\t<\u0010\u001b!PW\u000eKy/4\u0018| >m\u0018*\\C", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "Ad\\.a;BQ'kzm9\u0001\t@a\u0007\b\tM\u000b$}Qq\u0010<u", "", "4q^:66F^#\rzG6{\t", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001f@v78]}-3z\u00141a\r,o40wlaF\u0003p*Q\u000b\u0010QKN\u0002", "<nS2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mk", ">`a2a;", "2hbAT5<S", "", "7r2<`7Ha\u0019k\u0005h;", "=oc6b5L", "\u001ah^{f,Gb&\u0013DL,\u0006\u0018<yi3\u000bD\u000b %\u001d", "4q^:I0>e", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "5dc\u001de6Qgv\u0006vl:e\u00057e", "", "7r8:T.>", "1n]3\\.", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ\u0019u=\u001f\u0019jqF\u0003r0X\u007f|", "@dc?\\,OS\u0007~\u0003Z5\f\r-s]2\u0005A\u0005\u0019'Tk\u001d@\u0001.", "@dc?\\,OS\u0007~\u0003Z5\f\r-s]2\u0005A\u0005\u0019'Tk\u001d@\u0001.sg})Fz*(IL:x>\"\u0014bn9\u0012j(bp4GSN(jR", "Ag^B_+&O'\u0005", "BqPCX9LS", "", ">`a2a;']\u0018~", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ComposeViewHierarchyNode {
    private static WeakReference<LayoutCoordinates> _rootCoordinates = null;
    private static boolean semanticsRetrievalErrorLogged = false;
    public static final ComposeViewHierarchyNode INSTANCE = new ComposeViewHierarchyNode();
    private static final Lazy getSemanticsConfigurationMethod$delegate = LazyKt.lazy(new Function0<Method>() { // from class: io.sentry.android.replay.viewhierarchy.ComposeViewHierarchyNode$getSemanticsConfigurationMethod$2
        @Override // kotlin.jvm.functions.Function0
        public final Method invoke() {
            try {
                Method declaredMethod = LayoutNode.class.getDeclaredMethod("getSemanticsConfiguration", new Class[0]);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
                return null;
            }
        }
    });

    private ComposeViewHierarchyNode() {
    }

    private final ViewHierarchyNode fromComposeNode(LayoutNode layoutNode, ViewHierarchyNode viewHierarchyNode, int i2, boolean z2, SentryOptions sentryOptions) {
        TextLayoutInput layoutInput;
        TextStyle style;
        TextLayoutInput layoutInput2;
        TextStyle style2;
        AccessibilityAction accessibilityAction;
        Function1 function1;
        if (!layoutNode.isPlaced() || !layoutNode.isAttached()) {
            return null;
        }
        if (z2) {
            _rootCoordinates = new WeakReference<>(LayoutCoordinatesKt.findRootCoordinates(layoutNode.getCoordinates()));
        }
        LayoutCoordinates coordinates = layoutNode.getCoordinates();
        WeakReference<LayoutCoordinates> weakReference = _rootCoordinates;
        Rect rectBoundsInWindow = NodesKt.boundsInWindow(coordinates, weakReference != null ? weakReference.get() : null);
        try {
            SemanticsConfiguration semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release = retrieveSemanticsConfiguration$sentry_android_replay_release(layoutNode);
            boolean z3 = !layoutNode.getOuterCoordinator$ui_release().isTransparent() && (semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release == null || !semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release.contains(SemanticsProperties.INSTANCE.getInvisibleToUser())) && rectBoundsInWindow.height() > 0 && rectBoundsInWindow.width() > 0;
            boolean z4 = (semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release != null && semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release.contains(SemanticsActions.INSTANCE.getSetText())) || (semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release != null && semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release.contains(SemanticsProperties.INSTANCE.getEditableText()));
            if ((semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release == null || !semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release.contains(SemanticsProperties.INSTANCE.getText())) && !z4) {
                Painter painterFindPainter = NodesKt.findPainter(layoutNode);
                if (painterFindPainter == null) {
                    return new ViewHierarchyNode.GenericViewHierarchyNode(rectBoundsInWindow.left, rectBoundsInWindow.top, layoutNode.getWidth(), layoutNode.getHeight(), viewHierarchyNode != null ? viewHierarchyNode.getElevation() : 0.0f, i2, viewHierarchyNode, z3 && shouldMask(semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release, false, sentryOptions), false, z3, rectBoundsInWindow);
                }
                boolean z5 = z3 && shouldMask(semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release, true, sentryOptions);
                if (viewHierarchyNode != null) {
                    viewHierarchyNode.setImportantForCaptureToAncestors(true);
                }
                return new ViewHierarchyNode.ImageViewHierarchyNode(rectBoundsInWindow.left, rectBoundsInWindow.top, layoutNode.getWidth(), layoutNode.getHeight(), viewHierarchyNode != null ? viewHierarchyNode.getElevation() : 0.0f, i2, viewHierarchyNode, z5 && NodesKt.isMaskable(painterFindPainter), true, z3, rectBoundsInWindow);
            }
            boolean z6 = z3 && shouldMask(semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release, false, sentryOptions);
            if (viewHierarchyNode != null) {
                viewHierarchyNode.setImportantForCaptureToAncestors(true);
            }
            ArrayList arrayList = new ArrayList();
            if (semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release, SemanticsActions.INSTANCE.getGetTextLayoutResult())) != null && (function1 = (Function1) accessibilityAction.getAction()) != null) {
            }
            TextAttributes textAttributesFindTextAttributes = NodesKt.findTextAttributes(layoutNode);
            Color colorM8945component1QN2ZGVo = textAttributesFindTextAttributes.m8945component1QN2ZGVo();
            boolean zComponent2 = textAttributesFindTextAttributes.component2();
            TextLayoutResult textLayoutResult = (TextLayoutResult) CollectionsKt.firstOrNull((List) arrayList);
            Color colorM4168boximpl = (textLayoutResult == null || (layoutInput2 = textLayoutResult.getLayoutInput()) == null || (style2 = layoutInput2.getStyle()) == null) ? null : Color.m4168boximpl(style2.m6153getColor0d7_KjU());
            if (colorM4168boximpl == null || colorM4168boximpl.m4188unboximpl() != Color.Companion.m4214getUnspecified0d7_KjU()) {
                colorM8945component1QN2ZGVo = colorM4168boximpl;
            }
            TextUnit textUnitM6821boximpl = (textLayoutResult == null || (layoutInput = textLayoutResult.getLayoutInput()) == null || (style = layoutInput.getStyle()) == null) ? null : TextUnit.m6821boximpl(style.m6154getFontSizeXSAIIZE());
            return new ViewHierarchyNode.TextViewHierarchyNode((textLayoutResult == null || z4 || (textUnitM6821boximpl != null ? TextUnit.m6828equalsimpl0(textUnitM6821boximpl.m6840unboximpl(), TextUnit.Companion.m6842getUnspecifiedXSAIIZE()) : false)) ? null : new ComposeTextLayout(textLayoutResult, zComponent2), colorM8945component1QN2ZGVo != null ? Integer.valueOf(ViewsKt.toOpaque(ColorKt.m4232toArgb8_81llA(colorM8945component1QN2ZGVo.m4188unboximpl()))) : null, 0, 0, rectBoundsInWindow.left, rectBoundsInWindow.top, layoutNode.getWidth(), layoutNode.getHeight(), viewHierarchyNode != null ? viewHierarchyNode.getElevation() : 0.0f, i2, viewHierarchyNode, z6, true, z3, rectBoundsInWindow, 12, null);
        } catch (Throwable th) {
            if (!semanticsRetrievalErrorLogged) {
                semanticsRetrievalErrorLogged = true;
                sentryOptions.getLogger().log(SentryLevel.ERROR, th, "Error retrieving semantics information from Compose tree. Most likely you're using\nan unsupported version of androidx.compose.ui:ui. The supported\nversion range is 1.5.0 - 1.8.0.\nIf you're using a newer version, please open a github issue with the version\nyou're using, so we can add support for it.", new Object[0]);
            }
            return new ViewHierarchyNode.GenericViewHierarchyNode(rectBoundsInWindow.left, rectBoundsInWindow.top, layoutNode.getWidth(), layoutNode.getHeight(), viewHierarchyNode != null ? viewHierarchyNode.getElevation() : 0.0f, i2, viewHierarchyNode, true, false, !layoutNode.getOuterCoordinator$ui_release().isTransparent() && rectBoundsInWindow.height() > 0 && rectBoundsInWindow.width() > 0, rectBoundsInWindow);
        }
    }

    private final Method getGetSemanticsConfigurationMethod() {
        return (Method) getSemanticsConfigurationMethod$delegate.getValue();
    }

    private final String getProxyClassName(boolean z2, SemanticsConfiguration semanticsConfiguration) {
        return z2 ? SentryReplayOptions.IMAGE_VIEW_CLASS_NAME : (semanticsConfiguration == null || !(semanticsConfiguration.contains(SemanticsProperties.INSTANCE.getText()) || semanticsConfiguration.contains(SemanticsActions.INSTANCE.getSetText()) || semanticsConfiguration.contains(SemanticsProperties.INSTANCE.getEditableText()))) ? AndroidComposeViewAccessibilityDelegateCompat.ClassName : "android.widget.TextView";
    }

    @JvmStatic
    public static final SemanticsConfiguration retrieveSemanticsConfiguration$sentry_android_replay_release(LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        Method getSemanticsConfigurationMethod = INSTANCE.getGetSemanticsConfigurationMethod();
        return getSemanticsConfigurationMethod != null ? (SemanticsConfiguration) getSemanticsConfigurationMethod.invoke(node, new Object[0]) : node.getCollapsedSemantics$ui_release();
    }

    private final boolean shouldMask(SemanticsConfiguration semanticsConfiguration, boolean z2, SentryOptions sentryOptions) {
        String str = semanticsConfiguration != null ? (String) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SentryReplayModifiers.INSTANCE.getSentryPrivacy()) : null;
        if (Intrinsics.areEqual(str, "unmask")) {
            return false;
        }
        if (Intrinsics.areEqual(str, "mask")) {
            return true;
        }
        String proxyClassName = getProxyClassName(z2, semanticsConfiguration);
        if (sentryOptions.getSessionReplay().getUnmaskViewClasses().contains(proxyClassName)) {
            return false;
        }
        return sentryOptions.getSessionReplay().getMaskViewClasses().contains(proxyClassName);
    }

    private final void traverse(LayoutNode layoutNode, ViewHierarchyNode viewHierarchyNode, boolean z2, SentryOptions sentryOptions) {
        List<LayoutNode> children$ui_release = layoutNode.getChildren$ui_release();
        if (children$ui_release.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(children$ui_release.size());
        int size = children$ui_release.size();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutNode layoutNode2 = children$ui_release.get(i2);
            ViewHierarchyNode viewHierarchyNodeFromComposeNode = fromComposeNode(layoutNode2, viewHierarchyNode, i2, z2, sentryOptions);
            if (viewHierarchyNodeFromComposeNode != null) {
                arrayList.add(viewHierarchyNodeFromComposeNode);
                traverse(layoutNode2, viewHierarchyNodeFromComposeNode, false, sentryOptions);
            }
        }
        viewHierarchyNode.setChildren(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean fromView(View view, ViewHierarchyNode viewHierarchyNode, SentryOptions options) {
        LayoutNode root;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(options, "options");
        String name = view.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "view::class.java.name");
        if (!StringsKt.contains$default((CharSequence) name, (CharSequence) "AndroidComposeView", false, 2, (Object) null) || viewHierarchyNode == null) {
            return false;
        }
        try {
            Owner owner = view instanceof Owner ? (Owner) view : null;
            if (owner != null && (root = owner.getRoot()) != null) {
                traverse(root, viewHierarchyNode, true, options);
                return true;
            }
            return false;
        } catch (Throwable th) {
            options.getLogger().log(SentryLevel.ERROR, th, "Error traversing Compose tree. Most likely you're using an unsupported version of\nandroidx.compose.ui:ui. The minimum supported version is 1.5.0. If it's a newer\nversion, please open a github issue with the version you're using, so we can add\nsupport for it.", new Object[0]);
            return false;
        }
    }
}
