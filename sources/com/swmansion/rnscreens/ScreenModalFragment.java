package com.swmansion.rnscreens;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.swmansion.rnscreens.ScreenFragment;
import com.swmansion.rnscreens.bottomsheet.BottomSheetDialogRootView;
import com.swmansion.rnscreens.bottomsheet.BottomSheetDialogScreen;
import com.swmansion.rnscreens.bottomsheet.SheetUtils;
import com.swmansion.rnscreens.events.ScreenDismissedEvent;
import com.swmansion.rnscreens.ext.ViewExtKt;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.Xg;
import yg.hg;

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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яį\u0014D57\u001eq\u007fZDkt\u001aA\u000e0\u0011.J~8,\u001aw\rfr9FDmHDR[*\u0015m\u00044:[,qY;]\u001a\u0014\"\u0011OThon`Z\u0013C\u0015\u0007\u001ex\u0001,QU~a\u001a\u000fHBwЀ;M}=Aś|6\u0013):Ĳ@y\u001b\u0001\"*N\u0015~zYK\u0014\u00126Ax:`\u0012U\u0005 \u0014\u000e>6\u0001&ձoNLHtҗB/9\u0003qĩV'u0\u0005M#F\\'\u0013{i\u001eA@?5\u001b([\u0003\u001dRcΪ\u000b?\b=\rؒ/'9O{W<Z\u0016Ϭ3{\u007f\r\fqV\\3Q\u0019\u000bwkTi_ח\u0012(\u0006{<\u001aB\u0018\u001e\n5JF-Hiڿ\u00123\u0003v\u001cN^ vB.\u001a\u0012:%6\u00183YFaz\u001aoI9f7*&=\"1#\u0007!\nwTt]!b\u001ci1\u007fa\u0004\\\u0017\u0010gb\u0006\u0004\u001f\u0002H*L6U&G{?K]%\u007faGJ9k0g\u000b{?\u000bn\u0011ki\u0001g\u000767,ES!\f\tc\u0015\tyrlXZ4} b1\u0016\bAK#\f\u0005/3<fO\u0017\t\u001bQk,=/\u0015Z \u00034$efv3cp\u0014\u0014o\u0001\u000f\u0014mk\u0013\tf\u0017ZS:{#<j8V\u001c(w*c\u0015 [BM$44ZPIb#{\u001b X@+=&n1 \r\nK$1 Tz\u00174h^\u0007n\u0016-\u0010@E\u00050dYSK\u0018T\u000eRlB6;\u0007-.0Mu]_N\u0003\u0015$\u0011,&$MQSE<ACE=z\b;\u0002dr\u0014p\u0014&o\u0001\u000b7';\u0017M.\u001c3v:\u001f\u0003J}s]6?l\u0001b d.\u0019\u0012J\tX{T9h\u0005];\tg|f8+$e2m\u000f}c\u00155[bW!$:,/C%$}8<\b''&#\u000540q[\bb\u007f~xO\u0001WgEV\"R\f3FV2\u0010\bp*z!{PO-\tXNL9xDzO4\u001b;n]P\u0012\u001eIzB(7\u0002\u0010\u0016\u0016tBS^\u0014SܭqmY+SX\u001dY#{_\u000eB KBnW\u0011,v\u001aD8DFSp\u0015F\u0019,R4d\n!B\u0003p4\u0017)\u0006| eĢ4¡w?n\u0010Z\u0002j`\u0019'nPx1:\u0003\u000f\u000fa+'A\u001a\u000b}Hd/\u0012?_as͖\u001d˥S\u0005nއCFZH)8)\u0015\u0019VuE_\u0001d\u0016}iD£qɒ<\u001c\u0015\u001fH+)M\"#m\fH^9k\u001b#;ʑ\u0014؉VR:+\u0005\u0012\u000b&\r\"\u001d\r1O!r9ιxϸ{CK\u05ce\u0019\u0019JB\u0015&\u001deL6;\n\u00069Ke\u0003\u0014U\u0019.Ěg֞\f (ٴ؝xr"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>A\b\u001f3tv;IECk=-j", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EH|&\u0017Ts\nC@\"?h\r*?{\u0019.MR\u0005H>-$ri'\nc,]U+CSX.=_n?\u001c\u0012c\u001d$", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>G\r\u001c5sv;IECk=-\u0007u]D\u0012c9$", "u(E", "Aba2X5", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>/", "uKR<`uLe!z\u0004l0\u0007\u0012xr\t6yM\u0001\u0017 U9{:\u0004%5bSc(", "0dW.i0H`", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EH|&\u0017Ts\nC@\"?h\r*?{\u0019.MR\u0005H>-$ri'\nc,]S'JH_0f_H", "\u001a`]1e6BRb\u0011~].|\u0018xF\r$\u0004@g\u0013+Q\u007f\u001d\u0012", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "5dc\u000fX/:d\u001d\t\b", "u(;0b4\bU#\t|e,F\u00058d\r2\u007f?J\u001f\u0013Vo\u001b@r,~V\b/Fw\u001e<PC;z}z\u001fwpC\u000fQ/Nv6$LQ(mV|Ji", "1gX9W\u001a<`\u0019~\u0004<6\u0006\u0018+i\t(\tN", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>7\b)Fi\u001a7MP\u0011", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "5dc\u0010[0ER\u0007|\b^,\u0006f9n\u000f$\u007fI\u0001$%", "u(;7T=:\u001d)\u000e~euX\u0016<a\u0014\u000f\u007fN\u0010l", "1n]AT0GS&", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>G\r\u001c5sk", "5dc\u0010b5MO\u001d\bzk", "u(;0b4\ba+\u0007vg:\u0001\u00138/\r1\n>\u000e\u0017\u0017P}W*t25Y\u0007\u000eFi\u00144#", "4qP4`,Gb", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "5dc\u0013e(@[\u0019\b\n", "u(;.a+K]\u001d}\u000e(-\n\u00051m\u007f1\u000b\n|\"\"\u0011P\u001b8x-5b\ru", "5dc V9>S\"", "u(;0b4\ba+\u0007vg:\u0001\u00138/\r1\n>\u000e\u0017\u0017P}W*t25Y\u0007u", "Adc V9>S\"", "AgT2g\u000bBO \t|", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EH|&\u0017Ts\nC@\"?h\r*?{\u0019.MR\u0005H>-$ri'\nc,]U+CSX.2", "/cS\u0010[0ER\u0007|\b^,\u0006f9n\u000f$\u007fI\u0001$", "", "1`]\u0011\\:IO(|}E0}\t-y}/{ \u0012\u0017 V", "", "3uT;g", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>:\u000b\u001c9u\u00167\\\u0002)iA\u001e\u0015qH=\bc*bt.G,_,eaH", "1`]\u001bT=BU\u0015\u000ez;(z\u000f", "1n]3\\.N`\u0019[za(\u000e\r9u\r", "1n]3\\.N`\u0019]~Z3\u0007\u000b\u000bn~\u0005{C|(\u001bQ\u007f\u001b", "2hb:\\:L4&\t\u0003<6\u0006\u0018+i\t(\t", "2hb=T;<V{~v],\ne+c\u0006\u0005\fO\u0010! %v\u0012:|%49\u000f @|", "2hb=T;<V\u007f\u0003{^*\u0011\u00076e_9{I\u0010", "4qP4`,Gb\u000b\fvi7|\u0016", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>:\u000b\u001c9u\u00167\\5Hg?)\u0015u7", "2hb=T;<V\u007f\u0003{^*\u0011\u00076e_9{I\u0010z %r\u0012Cu\u0003?b\r\u001c;v\u0016;[", "2hb=T;<V\b\fvg:\u0001\u00183o\t\u0013\tJ\u0003$\u0017U}mMv.D", "/k_5T", "", "1k^@\\5@", "=m2<a;:W\"~\bN7{\u0005>e", "=m2?X(MS", "A`e2W\u0010Ga(z\u0004\\,j\u0018+t\u007f", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "=m2?X(MSw\u0003ve6~", "\u001a`]1e6BRbz\u0006iu[\r+l\n*Q", "=m2?X(MS\n\u0003zp", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "7mU9T;>`", "\u001a`]1e6BRb\u0010~^>Fo+y\n8\u000b$\n\u0018\u001eC~\u000eIL", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "=m32f;K]-", "=mE6X>\u001a\\\u001d\u0007vm0\u0007\u0012\u000fn~", "=mE6X>\u001a\\\u001d\u0007vm0\u0007\u0012\u001dt{5\u000b", "@d\\<i,\u001cV\u001d\u0006yL*\n\t/n]2\u0005O|\u001b G|", "@d\\<i,-]#\u0006wZ9", "Adc!b6EP\u0015\f", "Bn^9U(K", "\u001a`]1e6BR,Hvi7z\u00137p{7ER\u0005\u0016\u0019G~W+\u0001/<Vy-\r", "Adc!b6EP\u0015\fha({\u0013AH\u0004'z@\n", "6hS1X5", "Adc!b6EP\u0015\fik(\u0006\u00176u}(\u0005O", "BqP;f3NQ\u0019\b\n", "Bqh\u0014X;\u001aQ(\u0003\fb;\u0011", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "Bqh\u0014X;\u001c]\"\u000ezq;", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\\u0019", "Bqh\u001fX:HZ*~Xh5\f\u00053n\u007f5^@\u0005\u0019\u001aV", "", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "CoS.g,%O'\u000eZo,\u0006\u0018\u000ei\u000e3wO~\u001a\u0017F", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ScreenModalFragment extends BottomSheetDialogFragment implements ScreenStackFragmentWrapper {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "ScreenModalFragment";
    private final ArrayList<ScreenContainer> childScreenContainers;
    public Screen screen;
    private BottomSheetDialog sheetDialog;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>A\b\u001f3tv;IECk=-SFkA\u0012_5R\u00010\u001d", "", "u(E", "\"@6", "", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ScreenModalFragment() {
        this.childScreenContainers = new ArrayList<>();
        throw new IllegalStateException("Screen fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }

    public ScreenModalFragment(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.childScreenContainers = new ArrayList<>();
        setScreen(screen);
    }

    private final void configureBehaviour() throws Throwable {
        Integer numTryResolveContainerHeight = tryResolveContainerHeight();
        if (numTryResolveContainerHeight == null) {
            throw new IllegalStateException("[RNScreens] Failed to find window height during bottom sheet behaviour configuration".toString());
        }
        BottomSheetBehavior<FrameLayout> behavior = getBehavior();
        behavior.setHideable(true);
        behavior.setDraggable(true);
        int size = getScreen().getSheetDetents().size();
        if (size == 1) {
            BottomSheetBehavior<FrameLayout> behavior2 = getBehavior();
            behavior2.setState(3);
            behavior2.setSkipCollapsed(true);
            behavior2.setFitToContents(true);
            behavior2.setMaxHeight((int) (((Number) CollectionsKt.first((List) getScreen().getSheetDetents())).doubleValue() * ((double) numTryResolveContainerHeight.intValue())));
            return;
        }
        if (size == 2) {
            BottomSheetBehavior<FrameLayout> behavior3 = getBehavior();
            behavior3.setState(SheetUtils.INSTANCE.sheetStateFromDetentIndex(getScreen().getSheetInitialDetentIndex(), getScreen().getSheetDetents().size()));
            behavior3.setSkipCollapsed(false);
            behavior3.setFitToContents(true);
            behavior3.setPeekHeight((int) (getScreen().getSheetDetents().get(0).doubleValue() * ((double) numTryResolveContainerHeight.intValue())));
            behavior3.setMaxHeight((int) (getScreen().getSheetDetents().get(1).doubleValue() * ((double) numTryResolveContainerHeight.intValue())));
            return;
        }
        if (size != 3) {
            throw new IllegalStateException("[RNScreens] Invalid detent count " + getScreen().getSheetDetents().size() + ". Expected at most 3.");
        }
        BottomSheetBehavior<FrameLayout> behavior4 = getBehavior();
        behavior4.setState(SheetUtils.INSTANCE.sheetStateFromDetentIndex(getScreen().getSheetInitialDetentIndex(), getScreen().getSheetDetents().size()));
        behavior4.setSkipCollapsed(false);
        behavior4.setFitToContents(false);
        behavior4.setPeekHeight((int) (getScreen().getSheetDetents().get(0).doubleValue() * ((double) numTryResolveContainerHeight.intValue())));
        behavior4.setExpandedOffset((int) ((((double) 1) - getScreen().getSheetDetents().get(2).doubleValue()) * ((double) numTryResolveContainerHeight.intValue())));
        behavior4.setHalfExpandedRatio((float) (getScreen().getSheetDetents().get(1).doubleValue() / getScreen().getSheetDetents().get(2).doubleValue()));
    }

    private final BottomSheetDialog configureDialogAndBehaviour() throws Throwable {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        BottomSheetDialogScreen bottomSheetDialogScreen = new BottomSheetDialogScreen(contextRequireContext, this);
        this.sheetDialog = bottomSheetDialogScreen;
        bottomSheetDialogScreen.setDismissWithAnimation(true);
        BottomSheetDialog bottomSheetDialog = this.sheetDialog;
        if (bottomSheetDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sheetDialog");
            bottomSheetDialog = null;
        }
        bottomSheetDialog.setCanceledOnTouchOutside(getScreen().getSheetClosesOnTouchOutside());
        configureBehaviour();
        BottomSheetDialog bottomSheetDialog2 = this.sheetDialog;
        if (bottomSheetDialog2 != null) {
            return bottomSheetDialog2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sheetDialog");
        return null;
    }

    private final BottomSheetBehavior<FrameLayout> getBehavior() throws Throwable {
        BottomSheetDialog bottomSheetDialog = this.sheetDialog;
        if (bottomSheetDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sheetDialog");
            bottomSheetDialog = null;
        }
        BottomSheetBehavior<FrameLayout> behavior = bottomSheetDialog.getBehavior();
        Intrinsics.checkNotNullExpressionValue(behavior, "getBehavior(...)");
        return behavior;
    }

    private final ScreenStack getContainer() {
        ScreenContainer container = getScreen().getContainer();
        if (container instanceof ScreenStack) {
            return (ScreenStack) container;
        }
        return null;
    }

    private final Integer tryResolveContainerHeight() throws Throwable {
        Object objInvoke;
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        DisplayMetrics displayMetrics;
        ScreenContainer container = getScreen().getContainer();
        if (container != null) {
            return Integer.valueOf(container.getHeight());
        }
        Context context = getContext();
        if (context != null) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(hg.Vd("JVKXTMG\u0010DOMRBJO\b\u001cGEJ:LG", (short) (C1633zX.Xd() ^ (-25588)), (short) (C1633zX.Xd() ^ (-17095)))).getMethod(C1561oA.ud("\u001d\u001a(\u0005\u0017$\u001f$ \u0010\u0011\u001e", (short) (C1633zX.Xd() ^ (-28163))), new Class[0]);
            try {
                method.setAccessible(true);
                Resources resources = (Resources) method.invoke(context, objArr);
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    return Integer.valueOf(displayMetrics.heightPixels);
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Context context2 = getContext();
            if (context2 != null) {
                Object[] objArr2 = {C1561oA.yd("E6>3AH", (short) (C1633zX.Xd() ^ (-21982)))};
                Method method2 = Class.forName(C1561oA.Yd("\u0013!\u0018'% \u001cf\u001d**1#-4n\u0005229+?<", (short) (C1607wl.Xd() ^ 25775))).getMethod(Jg.Wd("\u001eU4,\u0016(z\u0017p\u000e$\u000b\u001ez\tb", (short) (FB.Xd() ^ 27550), (short) (FB.Xd() ^ 11901)), Class.forName(Xg.qd("\\TjV$cYga)Oqphnh", (short) (C1633zX.Xd() ^ (-30622)), (short) (C1633zX.Xd() ^ (-15648)))));
                try {
                    method2.setAccessible(true);
                    objInvoke = method2.invoke(context2, objArr2);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } else {
                objInvoke = null;
            }
            WindowManager windowManager = objInvoke instanceof WindowManager ? (WindowManager) objInvoke : null;
            if (windowManager != null && (currentWindowMetrics = windowManager.getCurrentWindowMetrics()) != null && (bounds = currentWindowMetrics.getBounds()) != null) {
                return Integer.valueOf(bounds.height());
            }
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public void addChildScreenContainer(ScreenContainer container) {
        Intrinsics.checkNotNullParameter(container, "container");
        getChildScreenContainers().add(container);
    }

    @Override // com.swmansion.rnscreens.ScreenEventDispatcher
    public boolean canDispatchLifecycleEvent(ScreenFragment.ScreenLifecycleEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public boolean canNavigateBack() {
        return true;
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public void dismissFromContainer() {
        if (getContainer() == null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        ScreenStack container = getContainer();
        Intrinsics.checkNotNull(container, "null cannot be cast to non-null type com.swmansion.rnscreens.ScreenStack");
        container.dismiss(this);
    }

    @Override // com.swmansion.rnscreens.ScreenEventDispatcher
    public void dispatchHeaderBackButtonClickedEvent() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.swmansion.rnscreens.ScreenEventDispatcher
    public void dispatchLifecycleEvent(ScreenFragment.ScreenLifecycleEvent event, ScreenFragmentWrapper fragmentWrapper) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(fragmentWrapper, "fragmentWrapper");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.swmansion.rnscreens.ScreenEventDispatcher
    public void dispatchLifecycleEventInChildContainers(ScreenFragment.ScreenLifecycleEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.swmansion.rnscreens.ScreenEventDispatcher
    public void dispatchTransitionProgressEvent(float f2, boolean z2) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public ArrayList<ScreenContainer> getChildScreenContainers() {
        return this.childScreenContainers;
    }

    @Override // com.swmansion.rnscreens.FragmentHolder
    public Fragment getFragment() {
        return this;
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public Screen getScreen() {
        Screen screen = this.screen;
        if (screen != null) {
            return screen;
        }
        Intrinsics.throwUninitializedPropertyAccessException("screen");
        return null;
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public void onContainerUpdate() {
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setShowsDialog(true);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) throws Throwable {
        configureDialogAndBehaviour();
        EventDispatcher reactEventDispatcher = getScreen().getReactEventDispatcher();
        if (reactEventDispatcher == null) {
            throw new IllegalStateException("[RNScreens] No ReactEventDispatcher attached to screen while creating modal fragment".toString());
        }
        BottomSheetDialogRootView bottomSheetDialogRootView = new BottomSheetDialogRootView(getScreen().getReactContext(), reactEventDispatcher);
        bottomSheetDialogRootView.addView(ViewExtKt.recycle(getScreen()));
        BottomSheetDialog bottomSheetDialog = this.sheetDialog;
        BottomSheetDialog bottomSheetDialog2 = null;
        if (bottomSheetDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sheetDialog");
            bottomSheetDialog = null;
        }
        BottomSheetDialogRootView bottomSheetDialogRootView2 = bottomSheetDialogRootView;
        bottomSheetDialog.setContentView(bottomSheetDialogRootView2);
        View viewParentAsView = ViewExtKt.parentAsView(bottomSheetDialogRootView2);
        if (viewParentAsView != null) {
            viewParentAsView.setClipToOutline(true);
        }
        BottomSheetDialog bottomSheetDialog3 = this.sheetDialog;
        if (bottomSheetDialog3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sheetDialog");
        } else {
            bottomSheetDialog2 = bottomSheetDialog3;
        }
        return bottomSheetDialog2;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ScreenStack container = getContainer();
        if (container == null || !container.hasScreen(this)) {
            Context context = getScreen().getContext();
            if (context instanceof ReactContext) {
                int surfaceId = UIManagerHelper.getSurfaceId(context);
                EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getScreen().getId());
                if (eventDispatcherForReactTag != null) {
                    eventDispatcherForReactTag.dispatchEvent(new ScreenDismissedEvent(surfaceId, getScreen().getId()));
                }
            }
        }
        getChildScreenContainers().clear();
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public void onViewAnimationEnd() {
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public void onViewAnimationStart() {
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public void removeChildScreenContainer(ScreenContainer container) {
        Intrinsics.checkNotNullParameter(container, "container");
        getChildScreenContainers().remove(container);
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public void removeToolbar() {
        throw new IllegalStateException("[RNScreens] Modal screens on Android do not support header right now");
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public void setScreen(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "<set-?>");
        this.screen = screen;
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public void setToolbar(Toolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        throw new IllegalStateException("[RNScreens] Modal screens on Android do not support header right now");
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public void setToolbarShadowHidden(boolean z2) {
        throw new IllegalStateException("[RNScreens] Modal screens on Android do not support header right now");
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public void setToolbarTranslucent(boolean z2) {
        throw new IllegalStateException("[RNScreens] Modal screens on Android do not support header right now");
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public Activity tryGetActivity() {
        return requireActivity();
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public ReactContext tryGetContext() {
        if (getContext() instanceof ReactContext) {
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) context;
        }
        if (getScreen().getContext() instanceof ReactContext) {
            Context context2 = getScreen().getContext();
            Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) context2;
        }
        for (ScreenContainer container = getScreen().getContainer(); container != null; container = container.getParent()) {
            if (container instanceof Screen) {
                Screen screen = (Screen) container;
                if (screen.getContext() instanceof ReactContext) {
                    Context context3 = screen.getContext();
                    Intrinsics.checkNotNull(context3, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                    return (ReactContext) context3;
                }
            }
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.ScreenEventDispatcher
    public void updateLastEventDispatched(ScreenFragment.ScreenLifecycleEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
}
