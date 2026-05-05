package androidx.compose.foundation.layout;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: WindowInsets.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njG6L͜P.hS2\u000fq|<$q$yCAV\"}0\u0012WNmpvJp\u000bK\u000f\f\u001b\u0001jBI]xc'\u00172PoG3SuCʠvҚTHP2P72\u0004DZAN\u0010\u0007\u0001QK$\u0014F?\u001f;b\u0011[\u00072\u00124Aŋ\u0005\u001ejk\u0017BV(u:]_3mPP?_^\u007f\u0016\u0019T\u0012?\r%\u001eN/N9M\u0015SVK\u001d`\u001aW\u0003m.m\tvf?+wt\b<^\u007f\"UCO;c;2jFi`:c[Sq\u000bh\u000eVxC\b\u001b~\u001c\u000e4cx2;Y~\b<4E~aEh\u0002\rHVаmي\u001b%\bđ{H)miai!\u05ee;\u0002\rټ6%\u0007w/e%\u001dn 3T&]śUFEʰf\f_J{\u0012Aq\u00109\u001c0u\u0010\u009e\u007f\u00176Ϗ=9aJ13<\u0011VW\u007fv3hĈWoZ̲X$t*E4Y\u001bhY|\u0005\u001aXԜ\\2\u0019۳4V\r\u0014\u0016\u001dpk\u0006S9%>Zћlorܔu\f+GtE*}y'o9\r?̳Ui\u0018Рjx\u001aYJpUdt]k\f\tx~β4ʮn\u0010\u007fӻ\u0015]\u001a0J? $ٜ07!¢-J\t<PKM\u0018my\u0001\u0010-\\տ(\tq˅\r\u000b\u0007pjz@v\u0007jD|\u000f.έEW=ӧ>W(\u000bB\u000bs\u0016\r\u0017\u0018G\u0016pܤPr\u001e߯m}&;(_\">K:'~WVī1KTǩ}SS:5!M\t\u001dd\u0001.\u0016,ϡt2hʄbQZA0\u001d/\u000213|\u007f(iâ~MkҺ#]Du\u0001\r*K\\e\u0015\u0005M*ݵ\u0005u*ĜM/IU+$H#=Dy]\u0018wЦ}h\u0017ծ\rg\n\\q @q_\u000fJ;fU˕\u0003D*غ\u0005\u0005Hzx\u0006XQ\u0017g%3vIяt\\@ԇ#1\u0004\u001b\u00156]\u007fd\u0011R\u0013\u001e\u0006ӑ2e2ϒ[\u007f\u001a\u0015Q/a\\a\u001f\u0006myh\u05c8N\u0015\u0012Κ\u00143tJ*Kpee\u001c!04\u007f͛:GCؠ\u001d>\u000f^B:ѭ\fO"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\b2VBE}\u0018'#hpGim3Mv4\u001d", "", "7mb2g:", "\u001a`]1e6BR,Hxh9|R@i\u007f:E2\u0005 \u0016Q\u0002qE\u0005%Dg[*?x\u0012=#", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "uKP;W9HW\u0018\u0012D\\6\n\txv\u0004(\u000e\nr\u001b Fy  \u007f35h\f}Au!*\\\u0019\"g=\u001d\"re8Pt0N\tp8PN>2\u0016c", "/bR2f:\u001c])\b\n", "", "1`_A\\6G0\u0015\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q7LPEo3\u0010\u0019q`C\u0019G5\\v6U\"", "5dc\u0010T7MW#\bWZ9", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w)L:x>\"\u0014ZeB\u0006m>2\u007f5G[\\\u0002", "1`_A\\6G0\u0015\f^`5\u0007\u00163n\u0002\u0019\u007fN\u0005\u0014\u001bNs\u001dP", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0007*TS;O=,\u0015wo\u000f", "5dc\u0010T7MW#\bWZ9`\u000b8o\r,\u0005Bq\u001b%Kl\u0012Cz4I", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w>?B{4\u0002\u001evaH\u00159", "1n]@h4>a", "", "5dc\u0010b5Lc!~\t", "u(I", "2hb=_(R1)\u000e\u0005n;", "5dc\u0011\\:IZ\u0015\u0013Xn;\u0007\u0019>", "7lT", "5dc\u0016`,", "7lT\u000ea0FO(\u0003\u0005g\u001a\u0007\u0019<c\u007f", "5dc\u0016`,\u001a\\\u001d\u0007vm0\u0007\u0012\u001do\u00105y@", "7lT\u000ea0FO(\u0003\u0005g\u001bx\u00161e\u000f", "5dc\u0016`,\u001a\\\u001d\u0007vm0\u0007\u0012\u001ea\r*{O", "7mb2g:%W'\u000ezg,\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7y7[CJy\u001b\"#waB\u0007p\u0002", ";`]1T;H`-l\u000fl;|\u0011\u0011e\u000e7\fM\u0001%", "5dc\u001aT5=O(\t\br\u001a\u0011\u0017>e\b\n{N\u0010'$G}", "<`e6Z(MW#\bWZ9\u000b", "5dc\u001bT=BU\u0015\u000e~h5Y\u0005<s", "<`e6Z(MW#\bWZ9\u000bl1n\n5\u007fI\u0003\b\u001bUs\u000b@})Dm", "5dc\u001bT=BU\u0015\u000e~h5Y\u0005<sc*\u0005J\u000e\u001b I`\u0012Jz\"9`\u0002/K", "A`U266Gb\u0019\b\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\b2VBE}\u0018'#hpG\\", "5dc T->1#\b\n^5\f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w?GDj>0xqo9\u0016q\u0002", "A`U279:e\u001d\b|", "5dc T->2&z\rb5~", "A`U2:,Lb)\fzl", "5dc T->5\u0019\r\nn9|\u0017", "AsPAh:\u001bO&\r", "5dc g(Mc'[vk:", "AsPAh:\u001bO&\r^`5\u0007\u00163n\u0002\u0019\u007fN\u0005\u0014\u001bNs\u001dP", "5dc g(Mc'[vk:`\u000b8o\r,\u0005Bq\u001b%Kl\u0012Cz4I", "AxbAX4\u001bO&\r", "5dc l:MS![vk:", "AxbAX4\u001bO&\r^`5\u0007\u00163n\u0002\u0019\u007fN\u0005\u0014\u001bNs\u001dP", "5dc l:MS![vk:`\u000b8o\r,\u0005Bq\u001b%Kl\u0012Cz4I", "AxbAX4 S'\u000e\u000bk,\u000b", "5dc l:MS!`zl;\r\u0016/s", "B`_=T)ESx\u0006zf,\u0006\u0018", "5dc!T7IO\u0016\u0006z>3|\u0011/n\u000f", "B`_=T)ESx\u0006zf,\u0006\u0018\u0013g\t2\tD\n\u0019\bK}\u00129z,9h\u0012", "5dc!T7IO\u0016\u0006z>3|\u0011/n\u000f\f}I\u000b$\u001bPq~@\u0005)2]\u0005$F\u0002", "E`c2e-:Z ", "5dc$T;>`\u001az\u0002e", "2dR?X4>\\(Zx\\,\u000b\u00179r\u000e", "", "7mR?X4>\\(Zx\\,\u000b\u00179r\u000e", "CoS.g,", "Eh]1b>\"\\'~\nl", "Bx_2f", "CoS.g,\"[\u0019Z\u0004b4x\u00183o\t\u0016\u0006P\u000e\u0015\u0017", "CoS.g,\"[\u0019Z\u0004b4x\u00183o\t\u0017wM\u0003\u0017&", "\u0011n\\=T5B]\"", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class WindowInsetsHolder {
    private static boolean testInsets = false;
    private int accessCount;
    private final AndroidWindowInsets captionBar;
    private final ValueInsets captionBarIgnoringVisibility;
    private final boolean consumes;
    private final AndroidWindowInsets displayCutout;
    private final AndroidWindowInsets ime;
    private final ValueInsets imeAnimationSource;
    private final ValueInsets imeAnimationTarget;
    private final InsetsListener insetsListener;
    private final AndroidWindowInsets mandatorySystemGestures;
    private final AndroidWindowInsets navigationBars;
    private final ValueInsets navigationBarsIgnoringVisibility;
    private final WindowInsets safeContent;
    private final WindowInsets safeDrawing;
    private final WindowInsets safeGestures;
    private final AndroidWindowInsets statusBars;
    private final ValueInsets statusBarsIgnoringVisibility;
    private final AndroidWindowInsets systemBars;
    private final ValueInsets systemBarsIgnoringVisibility;
    private final AndroidWindowInsets systemGestures;
    private final AndroidWindowInsets tappableElement;
    private final ValueInsets tappableElementIgnoringVisibility;
    private final ValueInsets waterfall;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final WeakHashMap<View, WindowInsetsHolder> viewMap = new WeakHashMap<>();

    public /* synthetic */ WindowInsetsHolder(WindowInsetsCompat windowInsetsCompat, View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(windowInsetsCompat, view);
    }

    private WindowInsetsHolder(WindowInsetsCompat windowInsetsCompat, View view) {
        DisplayCutoutCompat displayCutout;
        Insets waterfallInsets;
        Companion companion = Companion;
        this.captionBar = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.captionBar(), "captionBar");
        AndroidWindowInsets androidWindowInsetsSystemInsets = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.displayCutout(), "displayCutout");
        this.displayCutout = androidWindowInsetsSystemInsets;
        AndroidWindowInsets androidWindowInsetsSystemInsets2 = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.ime(), "ime");
        this.ime = androidWindowInsetsSystemInsets2;
        AndroidWindowInsets androidWindowInsetsSystemInsets3 = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.mandatorySystemGestures(), "mandatorySystemGestures");
        this.mandatorySystemGestures = androidWindowInsetsSystemInsets3;
        this.navigationBars = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.navigationBars(), "navigationBars");
        this.statusBars = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.statusBars(), "statusBars");
        AndroidWindowInsets androidWindowInsetsSystemInsets4 = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.systemBars(), "systemBars");
        this.systemBars = androidWindowInsetsSystemInsets4;
        AndroidWindowInsets androidWindowInsetsSystemInsets5 = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.systemGestures(), "systemGestures");
        this.systemGestures = androidWindowInsetsSystemInsets5;
        AndroidWindowInsets androidWindowInsetsSystemInsets6 = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.tappableElement(), "tappableElement");
        this.tappableElement = androidWindowInsetsSystemInsets6;
        ValueInsets ValueInsets = WindowInsets_androidKt.ValueInsets((windowInsetsCompat == null || (displayCutout = windowInsetsCompat.getDisplayCutout()) == null || (waterfallInsets = displayCutout.getWaterfallInsets()) == null) ? Insets.NONE : waterfallInsets, "waterfall");
        this.waterfall = ValueInsets;
        WindowInsets windowInsetsUnion = WindowInsetsKt.union(WindowInsetsKt.union(androidWindowInsetsSystemInsets4, androidWindowInsetsSystemInsets2), androidWindowInsetsSystemInsets);
        this.safeDrawing = windowInsetsUnion;
        WindowInsets windowInsetsUnion2 = WindowInsetsKt.union(WindowInsetsKt.union(WindowInsetsKt.union(androidWindowInsetsSystemInsets6, androidWindowInsetsSystemInsets3), androidWindowInsetsSystemInsets5), ValueInsets);
        this.safeGestures = windowInsetsUnion2;
        this.safeContent = WindowInsetsKt.union(windowInsetsUnion, windowInsetsUnion2);
        this.captionBarIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.captionBar(), "captionBarIgnoringVisibility");
        this.navigationBarsIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.navigationBars(), "navigationBarsIgnoringVisibility");
        this.statusBarsIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.statusBars(), "statusBarsIgnoringVisibility");
        this.systemBarsIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.systemBars(), "systemBarsIgnoringVisibility");
        this.tappableElementIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.tappableElement(), "tappableElementIgnoringVisibility");
        this.imeAnimationTarget = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.ime(), "imeAnimationTarget");
        this.imeAnimationSource = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.ime(), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(androidx.compose.ui.R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.consumes = bool != null ? bool.booleanValue() : true;
        this.insetsListener = new InsetsListener(this);
    }

    public final AndroidWindowInsets getCaptionBar() {
        return this.captionBar;
    }

    public final AndroidWindowInsets getDisplayCutout() {
        return this.displayCutout;
    }

    public final AndroidWindowInsets getIme() {
        return this.ime;
    }

    public final AndroidWindowInsets getMandatorySystemGestures() {
        return this.mandatorySystemGestures;
    }

    public final AndroidWindowInsets getNavigationBars() {
        return this.navigationBars;
    }

    public final AndroidWindowInsets getStatusBars() {
        return this.statusBars;
    }

    public final AndroidWindowInsets getSystemBars() {
        return this.systemBars;
    }

    public final AndroidWindowInsets getSystemGestures() {
        return this.systemGestures;
    }

    public final AndroidWindowInsets getTappableElement() {
        return this.tappableElement;
    }

    public final ValueInsets getWaterfall() {
        return this.waterfall;
    }

    public final WindowInsets getSafeDrawing() {
        return this.safeDrawing;
    }

    public final WindowInsets getSafeGestures() {
        return this.safeGestures;
    }

    public final WindowInsets getSafeContent() {
        return this.safeContent;
    }

    public final ValueInsets getCaptionBarIgnoringVisibility() {
        return this.captionBarIgnoringVisibility;
    }

    public final ValueInsets getNavigationBarsIgnoringVisibility() {
        return this.navigationBarsIgnoringVisibility;
    }

    public final ValueInsets getStatusBarsIgnoringVisibility() {
        return this.statusBarsIgnoringVisibility;
    }

    public final ValueInsets getSystemBarsIgnoringVisibility() {
        return this.systemBarsIgnoringVisibility;
    }

    public final ValueInsets getTappableElementIgnoringVisibility() {
        return this.tappableElementIgnoringVisibility;
    }

    public final ValueInsets getImeAnimationTarget() {
        return this.imeAnimationTarget;
    }

    public final ValueInsets getImeAnimationSource() {
        return this.imeAnimationSource;
    }

    public final boolean getConsumes() {
        return this.consumes;
    }

    public final void incrementAccessors(View view) {
        if (this.accessCount == 0) {
            ViewCompat.setOnApplyWindowInsetsListener(view, this.insetsListener);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.insetsListener);
            ViewCompat.setWindowInsetsAnimationCallback(view, this.insetsListener);
        }
        this.accessCount++;
    }

    public final void decrementAccessors(View view) {
        int i2 = this.accessCount - 1;
        this.accessCount = i2;
        if (i2 == 0) {
            ViewCompat.setOnApplyWindowInsetsListener(view, null);
            ViewCompat.setWindowInsetsAnimationCallback(view, null);
            view.removeOnAttachStateChangeListener(this.insetsListener);
        }
    }

    public static /* synthetic */ void update$default(WindowInsetsHolder windowInsetsHolder, WindowInsetsCompat windowInsetsCompat, int i2, int i3, Object obj) {
        if ((i3 + 2) - (i3 | 2) != 0) {
            i2 = 0;
        }
        windowInsetsHolder.update(windowInsetsCompat, i2);
    }

    public final void update(WindowInsetsCompat windowInsetsCompat, int i2) {
        if (testInsets) {
            android.view.WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
            Intrinsics.checkNotNull(windowInsets);
            windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets);
        }
        this.captionBar.update$foundation_layout_release(windowInsetsCompat, i2);
        this.ime.update$foundation_layout_release(windowInsetsCompat, i2);
        this.displayCutout.update$foundation_layout_release(windowInsetsCompat, i2);
        this.navigationBars.update$foundation_layout_release(windowInsetsCompat, i2);
        this.statusBars.update$foundation_layout_release(windowInsetsCompat, i2);
        this.systemBars.update$foundation_layout_release(windowInsetsCompat, i2);
        this.systemGestures.update$foundation_layout_release(windowInsetsCompat, i2);
        this.tappableElement.update$foundation_layout_release(windowInsetsCompat, i2);
        this.mandatorySystemGestures.update$foundation_layout_release(windowInsetsCompat, i2);
        if (i2 == 0) {
            this.captionBarIgnoringVisibility.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.captionBar())));
            this.navigationBarsIgnoringVisibility.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.navigationBars())));
            this.statusBarsIgnoringVisibility.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.statusBars())));
            this.systemBarsIgnoringVisibility.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars())));
            this.tappableElementIgnoringVisibility.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.tappableElement())));
            DisplayCutoutCompat displayCutout = windowInsetsCompat.getDisplayCutout();
            if (displayCutout != null) {
                this.waterfall.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(displayCutout.getWaterfallInsets()));
            }
        }
        Snapshot.Companion.sendApplyNotifications();
    }

    public final void updateImeAnimationSource(WindowInsetsCompat windowInsetsCompat) {
        this.imeAnimationSource.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime())));
    }

    public final void updateImeAnimationTarget(WindowInsetsCompat windowInsetsCompat) {
        this.imeAnimationTarget.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime())));
    }

    /* JADX INFO: compiled from: WindowInsets.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146Ȑ\u0007\"B\u0012\u007f\u0007|jA0ZeP.XV2\u000fy{<řc$\bCC٥\"}8\tWȞog|PbŏK\u000f\u0014\"\u0001̓4Ikxe܈\u0015˷C\u0006ЀcM\u001e<yez6ӯ$208B\u0010\u000f!BH>|AHƚ\u0010\u0012>H9H`\u0016e\u0005H\u00186B.\u000b6\\\u0016S|H5kH:;\u0003\u0018N~+m1\u0015M;H\u001b,U\u0017o+C@eCE+a\u0012\u001fTq>1O\"A\u0013y?'Y[$[Dk\u0018\u0014C?\u0016\r&\u00134q\u001dQ\u000f\"W1]rcR$'&\u000b,\u0011J\u0015&\u0006UZ^1(y \u000ea\t9S\u0011\\\u0010_Z\u007f)c\rА1ő7+Aӕ7io>1ZG}\u0015\rL(\u0011p1[\u0003\u0014\u000f\u0019qƛyΦ5QH׀˙R!"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\b2VBE}\u0018'#hpGim3Mv4\u0006*X4gN{A\u001e\u001b0", "", "u(E", "BdbA<5LS(\r", "", "DhTD@(I", "\u001aiPCTuNb\u001d\u0006DP,x\u000f\u0012a\u000e+c<\fl", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\b2VBE}\u0018'#hpGim3Mv4\u001d", "1ta?X5M", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016O6l[q9#\u0016d\u0017\u00182\t\u0019cQ386;(\u00076[eDv\u0001\u001b$p?qoBce", "5dc\u001ce\nKS\u0015\u000ez?6\n", "DhTD", "Adc\"f,-S'\u000e^g:|\u0018=", "", "AxbAX4\"\\'~\nl", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q7LPEo3\u0010\u0019q`C\u0019G5\\v6U\"", "Eh]1b>\"\\'~\nl", "\u001a`]1e6BR,Hxh9|R@i\u007f:E2\u0005 \u0016Q\u0002qE\u0005%Dg[*?x\u0012=#", "Bx_2", "", "<`\\2", "", "D`[BX\u0010Ga\u0019\u000e\tB.\u0006\u0013<i\t*lD\u000f\u001b\u0014Kv\u0012K\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0007*TS;O=,\u0015wo\u000f", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void setUseTestInsets(boolean z2) {
            WindowInsetsHolder.testInsets = z2;
        }

        public final WindowInsetsHolder current(Composer composer, int i2) {
            ComposerKt.sourceInformationMarkerStart(composer, -1366542614, "C(current)627@22834L7,630@22926L161,630@22901L186:WindowInsets.android.kt#2w3rfo");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1366542614, i2, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:626)");
            }
            ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localView);
            ComposerKt.sourceInformationMarkerEnd(composer);
            final View view = (View) objConsume;
            final WindowInsetsHolder orCreateFor = getOrCreateFor(view);
            ComposerKt.sourceInformationMarkerStart(composer, 334587174, "CC(remember):WindowInsets.android.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(orCreateFor) | composer.changedInstance(view);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.layout.WindowInsetsHolder$Companion$current$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        orCreateFor.incrementAccessors(view);
                        final WindowInsetsHolder windowInsetsHolder = orCreateFor;
                        final View view2 = view;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.layout.WindowInsetsHolder$Companion$current$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                windowInsetsHolder.decrementAccessors(view2);
                            }
                        };
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            EffectsKt.DisposableEffect(orCreateFor, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            return orCreateFor;
        }

        private final WindowInsetsHolder getOrCreateFor(View view) {
            WindowInsetsHolder windowInsetsHolder;
            synchronized (WindowInsetsHolder.viewMap) {
                WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                Object obj = weakHashMap.get(view);
                Object obj2 = obj;
                if (obj == null) {
                    WindowInsetsHolder windowInsetsHolder2 = new WindowInsetsHolder(null, view, false ? 1 : 0);
                    weakHashMap.put(view, windowInsetsHolder2);
                    obj2 = windowInsetsHolder2;
                }
                windowInsetsHolder = (WindowInsetsHolder) obj2;
            }
            return windowInsetsHolder;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AndroidWindowInsets systemInsets(WindowInsetsCompat windowInsetsCompat, int i2, String str) {
            AndroidWindowInsets androidWindowInsets = new AndroidWindowInsets(i2, str);
            if (windowInsetsCompat != null) {
                androidWindowInsets.update$foundation_layout_release(windowInsetsCompat, i2);
            }
            return androidWindowInsets;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ValueInsets valueInsetsIgnoringVisibility(WindowInsetsCompat windowInsetsCompat, int i2, String str) {
            Insets insetsIgnoringVisibility;
            if (windowInsetsCompat == null || (insetsIgnoringVisibility = windowInsetsCompat.getInsetsIgnoringVisibility(i2)) == null) {
                insetsIgnoringVisibility = Insets.NONE;
            }
            return WindowInsets_androidKt.ValueInsets(insetsIgnoringVisibility, str);
        }
    }
}
