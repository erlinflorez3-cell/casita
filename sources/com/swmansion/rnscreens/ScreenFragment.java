package com.swmansion.rnscreens;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.events.HeaderBackButtonClickedEvent;
import com.swmansion.rnscreens.events.ScreenAppearEvent;
import com.swmansion.rnscreens.events.ScreenDisappearEvent;
import com.swmansion.rnscreens.events.ScreenDismissedEvent;
import com.swmansion.rnscreens.events.ScreenTransitionProgressEvent;
import com.swmansion.rnscreens.events.ScreenWillAppearEvent;
import com.swmansion.rnscreens.events.ScreenWillDisappearEvent;
import com.swmansion.rnscreens.ext.ViewExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
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
@Metadata(bv = {}, d1 = {"Яj\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\u0015\"4\u0012}\u0007njG9LeN.ZS8.s{J$c$wNCU(\u0003*ޛWNugvJ`\fK\u000f\u001c\u0016\u0001j2V]xs\u0012\u0017˰JoU3UoS9hҚ>\u000562*8\u007f\t\t\u001a@H\u0018͌\u0003Ca\f\u001a0Ft@f#˟#YB\u0006l\u001f1\u001e\u000bg\u00077\b-\u001fz4)\u0017ݦFN5`p\nS\"VX5\u000f\u000faL.Ë;5#)\u001c\u0011\u0015ks?1Y\"A\u0013\u0004?'YS:k~f\u000e0-+}\u0013\u000ev4y\u001dQ\u000f*m?\u0018iYo&(&\u0015B!\u0005\u001a\u001c&?H\\GJj\u0016+Kt!qpT\u0010\u007fZ\u007f)a|+m\u000eAMQ\u001b\u0015k\u0012?'kO{3+d7It/~l\u000e\u000f/aT@W?uX=vhPY\u0006s\u0012\u0016z\u0002X\u001evGH5\n7F\u0017SQ\"9k7y)`D\u0016\u00115dv{\u0002RvXRr$`B\t:`\u000bxMy^~p,?gLX\u0015) \u0013Nb><i+\u001ezgh\u0018\u0005\u0014qRI=\u0014O[\u0005j<\u0006ibAdic>\u0012\u0003|\"ZTd\u001bW\u0015s\u0004\u0012h\u000f@$HG\u0019C>\u0010\rT\u001aGJ? 6z@y\u001fjJ`\u0003L\\\b\u0011Qeh\u001f(~\u0003Mj\u00172*\u0003@\u0019P\u000b\u000b6{AW:5x\"[[\u00029'Am\"\u0017>C7O\u0007\u00029_ibFz'\\\n\u001e\u0004.Q2;g.kOU\u0013q@\u0010j]L!\u007f\u0002Q D\u0013|(-\u0002|vm\u0016)\t,\u000f\u0005\u0011O%#0{vrQ\u000e;у\u0006ӶJzOϊ%\u0017iEar1_\u0013ҁD٫\t\u001f&ݒQ\b0\u0005M3S)-\u0016&\u001e]\u001e8ӷkܓ2\u007fjχ>vk\u000f:of\u0002p^u2i7\u007f.UЭ$ٝp\u0007ZJp\u0006\u0016QY@\u001bC`A\u0013v-ИYߵ3}n߿|+~gs:ArTӅZʡ.\u0006K͟$`I7\u001fNkis\u0001Yp+L\u0015\u001f\u0019\u007f\u0002z 2U \u0005]9ׁ<Ӓw\u0018>\u05cd\fn\u0013S!$bD\u0013ލ\u0017ͲXi\u000e؋Ĩ\u0004\t"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>:\u000b\u001c9u\u00167\\\u0019", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>:\u000b\u001c9u\u00167\\5Hg?)\u0015u7", "u(E", "Aba2X5/W\u0019\u0011", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>/", "uKR<`uLe!z\u0004l0\u0007\u0012xr\t6yM\u0001\u0017 U9{:\u0004%5bSc(", "1`]\u0011\\:IO(|}:7\b\t+r", "", "1`]\u0011\\:IO(|}P0\u0004\u0010\u000bp\u000b(wM", "1gX9W\u001a<`\u0019~\u0004<6\u0006\u0018+i\t(\tN", "", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>7\b)Fi\u001a7MP\u0011", "5dc\u0010[0ER\u0007|\b^,\u0006f9n\u000f$\u007fI\u0001$%", "u(;7T=:\u001d)\u000e~euc\r=tU", "4qP4`,Gb", "5dc\u0013e(@[\u0019\b\n", "u(;.a+K]\u001d}\u000e(-\n\u00051m\u007f1\u000b\n|\"\"\u0011P\u001b8x-5b\ru", "7rC?T5LW(\u0003\u0005g0\u0006\u000b", "Aba2X5", "5dc V9>S\"=vg5\u0007\u0018+t\u00042\u0005N", "5dc V9>S\"", "u(;0b4\ba+\u0007vg:\u0001\u00138/\r1\n>\u000e\u0017\u0017P}W*t25Y\u0007u", "Adc V9>S\"", "Ag^B_+.^\u0018z\n^\u0016\u0006u/s\u00100{", "BqP;f0MW#\bek6~\u0016/s\u000e", "", "/cS\u0010[0ER\u0007|\b^,\u0006f9n\u000f$\u007fI\u0001$", "", "1n]AT0GS&", "1`]\u0011\\:IO(|}E0}\t-y}/{ \u0012\u0017 V", "3uT;g", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>:\u000b\u001c9u\u00167\\\u0002)iA\u001e\u0015qH=\bc*bt.G,_,eaH", "2hb=T;<V{~v],\ne+c\u0006\u0005\fO\u0010! %v\u0012:|%49\u000f @|", "2hb=T;<V\u007f\u0003{^*\u0011\u00076e_9{I\u0010", "4qP4`,Gb\u000b\fvi7|\u0016", "2hb=T;<V\u007f\u0003{^*\u0011\u00076e_9{I\u0010z %r\u0012Cu\u0003?b\r\u001c;v\u0016;[", "2hb=T;<V\u0003\bVi7|\u0005<", "2hb=T;<V\u0003\bYb:x\u0014:e{5", "2hb=T;<V\u0003\blb3\u0004d:p\u007f$\t", "2hb=T;<V\u0003\blb3\u0004g3s{3\u0007@|$", "2hb=T;<V\b\fvg:\u0001\u00183o\t\u0013\tJ\u0003$\u0017U}mMv.D", "/k_5T", "1k^@\\5@", "2hb=T;<V\n\u0003zp\b\u0006\r7a\u000f,\u0006I`(\u0017P~", "/mX:T;B]\"^\u0004]", "=m2<a;:W\"~\bN7{\u0005>e", "=m2?X(MS\n\u0003zp", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "7mU9T;>`", "\u001a`]1e6BRb\u0010~^>Fo+y\n8\u000b$\n\u0018\u001eC~\u000eIL", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "A`e2W\u0010Ga(z\u0004\\,j\u0018+t\u007f", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "=m32f;K]-", "=mA2f<FS", "=mE6X>\u001a\\\u001d\u0007vm0\u0007\u0012\u000fn~", "=mE6X>\u001a\\\u001d\u0007vm0\u0007\u0012\u001dt{5\u000b", "@d\\<i,\u001cV\u001d\u0006yL*\n\t/n]2\u0005O|\u001b G|", "Bqh\u0014X;\u001aQ(\u0003\fb;\u0011", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "Bqh\u0014X;\u001c]\"\u000ezq;", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\\u0019", "CoS.g,%O'\u000eZo,\u0006\u0018\u000ei\u000e3wO~\u001a\u0017F", "CoS.g,0W\"}\u0005p\u001b\n\u00053t\u000e", "\u0011n\\=T5B]\"", "!ba2X5%W\u001a~xr*\u0004\t\u000fv\u007f1\u000b", "!ba2X5L4&z\u0003^\u0013x\u001d9u\u000f", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public class ScreenFragment extends Fragment implements ScreenFragmentWrapper {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "ScreenFragment";
    private boolean canDispatchAppear;
    private boolean canDispatchWillAppear;
    private final List<ScreenContainer> childScreenContainers;
    private boolean isTransitioning;
    public Screen screen;
    private boolean shouldUpdateOnResume;
    private float transitionProgress;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\":\u001a\u007fјnjG5L͜N\u0093Siճ?k*3d`*qٴ?U(}j\u0015]Q\u007fg\u001dN\u000b\u000fQ\u0014\u001e\u0016'p|Ucyu\u0012=4\u0019Ī\u0012ݯQoEʠƄx="}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>:\u000b\u001c9u\u00167\\\u0002\u0019u<)\u0011qeC\u00109", "", "u(E", "\"@6", "", "5dc\u0010b(ES'|~g.b\tC", "", ">q^4e,La", "", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final short getCoalescingKey(float f2) {
            return (short) (f2 == 0.0f ? 1 : f2 == 1.0f ? 2 : 3);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\bGָّ\u000bDȐ/(<\u0014\b\u0007\u0015ʑg/\u0005jN.ʂW*\u001dkd4*\\\rqI=>\u001a\u0004%qOTk̐rO"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>:\u000b\u001c9u\u00167\\\u0002)iA\u001e\u0015qH=\bc*bt.G,_,eaH", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u0012H3,4\u0017)3tk", "%H;\u0019R\b)>xZg", "\u0012H3,7\u0010,/\u0004iZ:\u0019", "%H;\u0019R\u000b\"Atie>\bi", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class ScreenLifecycleEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ScreenLifecycleEvent[] $VALUES;
        public static final ScreenLifecycleEvent DID_APPEAR = new ScreenLifecycleEvent("DID_APPEAR", 0);
        public static final ScreenLifecycleEvent WILL_APPEAR = new ScreenLifecycleEvent("WILL_APPEAR", 1);
        public static final ScreenLifecycleEvent DID_DISAPPEAR = new ScreenLifecycleEvent("DID_DISAPPEAR", 2);
        public static final ScreenLifecycleEvent WILL_DISAPPEAR = new ScreenLifecycleEvent("WILL_DISAPPEAR", 3);

        private static final /* synthetic */ ScreenLifecycleEvent[] $values() {
            return new ScreenLifecycleEvent[]{DID_APPEAR, WILL_APPEAR, DID_DISAPPEAR, WILL_DISAPPEAR};
        }

        static {
            ScreenLifecycleEvent[] screenLifecycleEventArr$values = $values();
            $VALUES = screenLifecycleEventArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(screenLifecycleEventArr$values);
        }

        private ScreenLifecycleEvent(String str, int i2) {
        }

        public static EnumEntries<ScreenLifecycleEvent> getEntries() {
            return $ENTRIES;
        }

        public static ScreenLifecycleEvent valueOf(String str) {
            return (ScreenLifecycleEvent) Enum.valueOf(ScreenLifecycleEvent.class, str);
        }

        public static ScreenLifecycleEvent[] values() {
            return (ScreenLifecycleEvent[]) $VALUES.clone();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u0012\u007fјljOӄtev-\u0013^:\u0013y{L$\n%ڱG;c\u001cF(\u0017Rfg\u0016r\u0011nŸG\u0014"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>:\u000b\u001c9u\u00167\\\u0002)iA\u001e\u0015qo\u001a\u0014_4N]#[V^;2", "\u001a`]1e6BRb\u0011~].|\u0018xF\r$\u0004@g\u0013+Q\u007f\u001d\u0012", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "1kT.e\rHQ)\r", "", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class ScreensFrameLayout extends FrameLayout {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScreensFrameLayout(Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        @Override // android.view.ViewGroup, android.view.View
        public void clearFocus() {
            if (getVisibility() != 4) {
                super.clearFocus();
            }
        }
    }

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScreenLifecycleEvent.values().length];
            try {
                iArr[ScreenLifecycleEvent.WILL_APPEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScreenLifecycleEvent.DID_APPEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScreenLifecycleEvent.WILL_DISAPPEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ScreenLifecycleEvent.DID_DISAPPEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ScreenFragment() {
        this.childScreenContainers = new ArrayList();
        this.transitionProgress = -1.0f;
        this.canDispatchWillAppear = true;
        this.canDispatchAppear = true;
        throw new IllegalStateException("Screen fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }

    public ScreenFragment(Screen screenView) {
        Intrinsics.checkNotNullParameter(screenView, "screenView");
        this.childScreenContainers = new ArrayList();
        this.transitionProgress = -1.0f;
        this.canDispatchWillAppear = true;
        this.canDispatchAppear = true;
        setScreen(screenView);
    }

    private final void dispatchOnAppear() {
        dispatchLifecycleEvent(ScreenLifecycleEvent.DID_APPEAR, this);
        dispatchTransitionProgressEvent(1.0f, false);
    }

    private final void dispatchOnDisappear() {
        dispatchLifecycleEvent(ScreenLifecycleEvent.DID_DISAPPEAR, this);
        dispatchTransitionProgressEvent(1.0f, true);
    }

    private final void dispatchOnWillAppear() {
        dispatchLifecycleEvent(ScreenLifecycleEvent.WILL_APPEAR, this);
        dispatchTransitionProgressEvent(0.0f, false);
    }

    private final void dispatchOnWillDisappear() {
        dispatchLifecycleEvent(ScreenLifecycleEvent.WILL_DISAPPEAR, this);
        dispatchTransitionProgressEvent(0.0f, true);
    }

    private final void dispatchViewAnimationEvent(final boolean z2) {
        this.isTransitioning = !z2;
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null || ((parentFragment instanceof ScreenFragment) && !((ScreenFragment) parentFragment).isTransitioning)) {
            if (isResumed()) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.ScreenFragment$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ScreenFragment.dispatchViewAnimationEvent$lambda$8(z2, this);
                    }
                });
            } else if (z2) {
                dispatchOnDisappear();
            } else {
                dispatchOnWillDisappear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatchViewAnimationEvent$lambda$8(boolean z2, ScreenFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z2) {
            this$0.dispatchOnAppear();
        } else {
            this$0.dispatchOnWillAppear();
        }
    }

    public static /* synthetic */ void getScreen$annotations() {
    }

    private final void updateWindowTraits() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            this.shouldUpdateOnResume = true;
        } else {
            ScreenWindowTraits.INSTANCE.trySetWindowTraits$react_native_screens_release(getScreen(), activity, tryGetContext());
        }
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public void addChildScreenContainer(ScreenContainer container) {
        Intrinsics.checkNotNullParameter(container, "container");
        getChildScreenContainers().add(container);
    }

    @Override // com.swmansion.rnscreens.ScreenEventDispatcher
    public boolean canDispatchLifecycleEvent(ScreenLifecycleEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i2 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i2 == 1) {
            return this.canDispatchWillAppear;
        }
        if (i2 == 2) {
            return this.canDispatchAppear;
        }
        if (i2 != 3) {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (!this.canDispatchAppear) {
                return true;
            }
        } else if (!this.canDispatchWillAppear) {
            return true;
        }
        return false;
    }

    @Override // com.swmansion.rnscreens.ScreenEventDispatcher
    public void dispatchHeaderBackButtonClickedEvent() {
        Context context = getScreen().getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int surfaceId = UIManagerHelper.getSurfaceId(reactContext);
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, getScreen().getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new HeaderBackButtonClickedEvent(surfaceId, getScreen().getId()));
        }
    }

    @Override // com.swmansion.rnscreens.ScreenEventDispatcher
    public void dispatchLifecycleEvent(ScreenLifecycleEvent event, ScreenFragmentWrapper fragmentWrapper) {
        ScreenWillAppearEvent screenWillAppearEvent;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(fragmentWrapper, "fragmentWrapper");
        Fragment fragment = fragmentWrapper.getFragment();
        if (fragment instanceof ScreenStackFragment) {
            ScreenStackFragment screenStackFragment = (ScreenStackFragment) fragment;
            if (screenStackFragment.canDispatchLifecycleEvent(event)) {
                Screen screen = screenStackFragment.getScreen();
                fragmentWrapper.updateLastEventDispatched(event);
                int surfaceId = UIManagerHelper.getSurfaceId(screen);
                int i2 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
                if (i2 == 1) {
                    screenWillAppearEvent = new ScreenWillAppearEvent(surfaceId, screen.getId());
                } else if (i2 == 2) {
                    screenWillAppearEvent = new ScreenAppearEvent(surfaceId, screen.getId());
                } else if (i2 == 3) {
                    screenWillAppearEvent = new ScreenWillDisappearEvent(surfaceId, screen.getId());
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    screenWillAppearEvent = new ScreenDisappearEvent(surfaceId, screen.getId());
                }
                Context context = getScreen().getContext();
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getScreen().getId());
                if (eventDispatcherForReactTag != null) {
                    eventDispatcherForReactTag.dispatchEvent(screenWillAppearEvent);
                }
                fragmentWrapper.dispatchLifecycleEventInChildContainers(event);
            }
        }
    }

    @Override // com.swmansion.rnscreens.ScreenEventDispatcher
    public void dispatchLifecycleEventInChildContainers(ScreenLifecycleEvent event) {
        ScreenFragmentWrapper fragmentWrapper;
        Intrinsics.checkNotNullParameter(event, "event");
        List<ScreenContainer> childScreenContainers = getChildScreenContainers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : childScreenContainers) {
            if (((ScreenContainer) obj).getScreenCount() > 0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Screen topScreen = ((ScreenContainer) it.next()).getTopScreen();
            if (topScreen != null && (fragmentWrapper = topScreen.getFragmentWrapper()) != null) {
                dispatchLifecycleEvent(event, fragmentWrapper);
            }
        }
    }

    @Override // com.swmansion.rnscreens.ScreenEventDispatcher
    public void dispatchTransitionProgressEvent(float f2, boolean z2) {
        if (!(this instanceof ScreenStackFragment) || this.transitionProgress == f2) {
            return;
        }
        float fMax = Math.max(0.0f, Math.min(1.0f, f2));
        this.transitionProgress = fMax;
        short coalescingKey = Companion.getCoalescingKey(fMax);
        ScreenContainer container = getScreen().getContainer();
        boolean goingForward = container instanceof ScreenStack ? ((ScreenStack) container).getGoingForward() : false;
        Context context = getScreen().getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, getScreen().getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new ScreenTransitionProgressEvent(UIManagerHelper.getSurfaceId(reactContext), getScreen().getId(), this.transitionProgress, z2, goingForward, coalescingKey));
        }
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public List<ScreenContainer> getChildScreenContainers() {
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
        updateWindowTraits();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        ScreensFrameLayout screensFrameLayout;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        getScreen().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = getContext();
        if (context != null) {
            screensFrameLayout = new ScreensFrameLayout(context);
            screensFrameLayout.addView(ViewExtKt.recycle(getScreen()));
        } else {
            screensFrameLayout = null;
        }
        return screensFrameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ScreenContainer container = getScreen().getContainer();
        if (container == null || !container.hasScreen(getScreen().getFragmentWrapper())) {
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

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.shouldUpdateOnResume) {
            this.shouldUpdateOnResume = false;
            ScreenWindowTraits.INSTANCE.trySetWindowTraits$react_native_screens_release(getScreen(), tryGetActivity(), tryGetContext());
        }
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public void onViewAnimationEnd() {
        dispatchViewAnimationEvent(true);
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public void onViewAnimationStart() {
        dispatchViewAnimationEvent(false);
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public void removeChildScreenContainer(ScreenContainer container) {
        Intrinsics.checkNotNullParameter(container, "container");
        getChildScreenContainers().remove(container);
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public void setScreen(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "<set-?>");
        this.screen = screen;
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public Activity tryGetActivity() {
        Fragment fragment;
        FragmentActivity activity;
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            return activity2;
        }
        Context context = getScreen().getContext();
        if (context instanceof ReactContext) {
            ReactContext reactContext = (ReactContext) context;
            if (reactContext.getCurrentActivity() != null) {
                return reactContext.getCurrentActivity();
            }
        }
        for (ScreenContainer container = getScreen().getContainer(); container != null; container = container.getParent()) {
            if ((container instanceof Screen) && (fragment = ((Screen) container).getFragment()) != null && (activity = fragment.getActivity()) != null) {
                return activity;
            }
        }
        return null;
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
    public void updateLastEventDispatched(ScreenLifecycleEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i2 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i2 == 1) {
            this.canDispatchWillAppear = false;
            return;
        }
        if (i2 == 2) {
            this.canDispatchAppear = false;
        } else if (i2 == 3) {
            this.canDispatchWillAppear = true;
        } else {
            if (i2 != 4) {
                return;
            }
            this.canDispatchAppear = true;
        }
    }
}
