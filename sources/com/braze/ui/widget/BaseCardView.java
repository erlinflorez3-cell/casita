package com.braze.ui.widget;

import android.content.Context;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazeViewBounds;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.R;
import com.braze.ui.actions.IAction;
import com.braze.ui.actions.UriAction;
import com.braze.ui.contentcards.BrazeContentCardUtils;
import com.braze.ui.feed.BrazeImageSwitcher;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import yg.C1561oA;
import yg.C1580rY;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.Od;
import yg.Xg;
import yg.ZO;

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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\\\u001d<K!&˛\bDZc|\u0004W\u00068é6B\u0015\"4\u0012}\nnjG<LeN/ZS@\u000fsڔ<$q$yّCU(\u0007*\tUOog|JbŏK\u000f\u001c\u0016\u0001j2K]xs\u0012\u00172HoG3[tE9ft>\u000562*8\u007f\u0006\u0007>@Ϻ.\u001b#IQÈ /hphR=M3\u001bJ\u0005b`\f.`uPNH\u001b`Ơ3#\u0011m\u000bn5sH|{\"vX5\u000f\u000faL.p;C\u001b=S1\u0007\u0003aM\u0019WsS\u0004\u0017>m-\u0012\u0014eNp\u007fB&[S\u001b_\u000b&\u000b\b\u0002d\u001a-CO\u0012K\u0001\u00146\u000e\u0013}#;2%LI\u0011D;3~\b<H%xaNh\u0004tA.\n\u0012:%+\u00183Y9c\u000b_{S\u0019|L,\t\u001b9;\u0001\u001d=\fX\u001c}-\u001b\u0003\u0001\u00025_^UH|)\nA{\n\tb0*LFU G{?CG)E|Q#O\u000e2NR\u000b\u000f\u0007vg\u0002r#VN'\u0007\u0016e-?\u000e1իfʰoP\\А|%[\"l\t\u0014\u0007I\u05fe\u0013yz#{ıZћlkrMk\u0011u>t?qn\u001a\u0017Ć=d;̐ie\u0016k`\u0002dOJn\u001dX\u0015O\n\u000e\u0019^~ε>ʮn\u0010\u007fӻ\u0015`\u001a!JA\b\u001bb;g\u001d\u001b\u0019\u001fҙ*նE|\u0011ݠ+t\u001e\u000fl3R\u0014@ˈv֊\u0005Pdʙ@v\u0007[D|\u000f3c\u0006پ9\u001d>W(zB\u0010ɦ\u000b$"}, d2 = {"\u001ab^:\")KO.~Dn0F\u001b3d\u0002(\u000b\n]\u0013%GM\nIu\u00169Y\u0010u", "\"", "\u001ab^:\")KO.~Df6{\t6sI&wM\u007f%`%k\u001b;L", "\u001a`]1e6BRb\u0011~].|\u0018xR\u007f/wO\u0005(\u0017.k\"F\u00074\u000b", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "/o_9\\*:b\u001d\t\u0004<6\u0006\u0018/x\u000f", "1`a1", "\u001ab^:\")KO.~Df6{\t6sI&wM\u007f%`%k\u001b;L", "1kP@f\u0013HU\bz|", "", "5dc\u0010_(La\u007f\t|M(~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n]3\\.N`\u0015\u000e~h5g\u00169v\u0004'{M", "\u001ab^:\")KO.~D\\6\u0006\n3g\u00105wO\u0005! \u0011L\u001b8\f%\u0013c\u0007!;o&;IR?u=\t\"rr=\u0006c9$", "7lP4X\u001aPW(|}^9", "\u001ab^:\")KO.~Dn0F\n/e~qXM|,\u0017+w\n>v\u0013G]\r\u001e:m#\u0004", "7rD;e,:Rvz\b]\u001d\u0001\u0017?a\u0007\f\u0005?\u0005\u0015\u0013Vy\u001b\u001c\u007f!2`}\u001f", "", "7rD;e,:R|\byb*x\u00189r_1w=\b\u0017\u0016", "u(I", "6`]1_,\u001cO&}Xe0z\u000f", "", "1`a14*MW#\b", "\u001ab^:\")KO.~Dn0F\u0005-t\u00042\u0005NJzrE~\u0012F\u007fz", "7r29\\*D6\u0015\bye,{", "Adc\u0010T9=D\u001d~\r^+`\u0012.i}$\u000bJ\u000e", "Adc\u0016`(@S\n\u0003zp\u001b\u0007x<l", "7lP4X\u001dBS+", "\u001a`]1e6BRb\u0011~].|\u0018xI\b$}@q\u001b\u0017YE", "7lP4X\u001cKZ", ">kP0X/HZ\u0018~\b::\b\t-tl$\u000bD\u000b", "", "Adc\u001cc;B]\"z\u0002M,\u0010\u0018 i\u007f:", "DhTD", "\u001a`]1e6BRb\u0011~].|\u0018xT\u007f;\u000b1\u0005\u0017)\u001d", "BdgA", "\u0011n\\=T5B]\"", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class BaseCardView<T extends Card> extends RelativeLayout {
    public static final Companion Companion = new Companion(null);
    private static final String ICON_READ_TAG = "icon_read";
    private static final String ICON_UNREAD_TAG = "icon_unread";
    protected final Context applicationContext;
    protected T card;
    private final String classLogTag;
    protected BrazeConfigurationProvider configurationProvider;
    public BrazeImageSwitcher imageSwitcher;
    private final boolean isUnreadCardVisualIndicatorEnabled;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005\"4\u0012\u000e\u0007nʑA0ZeP\u008cXݾ+%ӆ,4RZdvI;ڈ\u001e}0\t\u0018^uk\u0007Lp\nq\u00146\u001a\u0007pDI\u0004\u007f$\u0015_>PpW3{q\u0014ʣ3ҽ:\u0005(݅rD\b\b\u0019\u001aXJf͏MŲO\f\u001aؓϴtB"}, d2 = {"\u001ab^:\")KO.~Dn0F\u001b3d\u0002(\u000b\n]\u0013%GM\nIu\u00169Y\u0010^\u0015w\u001e9IL?u=s", "", "u(E", "\u0017B>\u001bR\u0019\u001e/wxi:\u000e", "", "\u0017B>\u001bR\u001c'@xZYX\u001bXj", "5dc\"e0\u001aQ(\u0003\u0005g\r\u0007\u0016\ra\r'", "\u001ab^:\")KO.~Dn0F\u0005-t\u00042\u0005NJ\u0007$KK\fKz/>/", "1`a1", "\u001ab^:\")KO.~Df6{\t6sI&wM\u007f%`%k\u001b;L", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        protected final UriAction getUriActionForCard(Card card) {
            Intrinsics.checkNotNullParameter(card, "card");
            return BrazeContentCardUtils.INSTANCE.getUriActionForCard(card);
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.widget.BaseCardView$handleCardClick$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,u\bӵLc\u000b\u0004Iي>éFB-!L\u0018}јtja0rf\u000f6ʂW*\u0015m"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001ab^:\")KO.~Df6{\t6sI&wM\u007f%`%k\u001b;L", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<String> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Handling card click for card: " + card;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.widget.BaseCardView$handleCardClick$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,u\bӵLc\u000b\u0004Iي>éFB-!L\u0018}јtja0rf\u000f6ʂW*\u0015m"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001ab^:\")KO.~Df6{\t6sI&wM\u007f%`%k\u001b;L", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function0<String> {
        AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Card action is non-null. Attempting to perform action on card: " + card.getId();
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.widget.BaseCardView$handleCardClick$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,u\bӵLc\u000b\u0004Iي>éFB-!L\u0018}јtja0rf\u000f6ʂW*\u0015m"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001ab^:\")KO.~Df6{\t6sI&wM\u007f%`%k\u001b;L", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends Lambda implements Function0<String> {
        AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Executing non uri action for click on card: " + card.getId();
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.widget.BaseCardView$handleCardClick$4 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,u\bӵLc\u000b\u0004Iي>éFB-!L\u0018}јtja0rf\u000f6ʂW*\u0015m"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001ab^:\")KO.~Df6{\t6sI&wM\u007f%`%k\u001b;L", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass4 extends Lambda implements Function0<String> {
        AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Card action is null. Not performing any click action on card: " + card.getId();
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.widget.BaseCardView$handleCardClick$5 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,u\bӵLc\u000b\u0004Iي>éFB-!L\u0018}јtja0rf\u000f6ʂW*\u0015m"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001ab^:\")KO.~Df6{\t6sI&wM\u007f%`%k\u001b;L", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass5 extends Lambda implements Function0<String> {
        AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Card click was handled by custom listener on card: " + card.getId();
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.widget.BaseCardView$setCardViewedIndicator$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,u\bӵLc\u000b\u0004Iي>éFB-!L\u0018}јtja0rf\u000f6ʂW*\u0015m"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001ab^:\")KO.~Df6{\t6sI&wM\u007f%`%k\u001b;L", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10961 extends Lambda implements Function0<String> {
        public static final C10961 INSTANCE = ;

        C10961() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "imageSwitcher is null. Can't set card viewed indicator.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.widget.BaseCardView$setImageViewToUrl$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0013\u001d̉=!4i\bӵLc\u0003\rIيX\nǞH\u00078ܥBw5e3?>D}H\\S\u001a>ƈo}"}, d2 = {"1n\\{U9:h\u0019H\u000bbu\u000f\r.g\u007f7E\u001d|%\u0017%k\u001b;g)5k<.7|y6IE;\\8\u001e'Wk)\u0014jj\u001a", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\u0017\t@\u0001\u0001\u0014Uo\u001bMv2sC\u0007\u000bDmt;IU\"oB-\u0015qaF\\", "=m??X\u000bKO+", "", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class ViewTreeObserverOnPreDrawListenerC10971 implements ViewTreeObserver.OnPreDrawListener {
        final /* synthetic */ ImageView $imageView;
        final /* synthetic */ float $placeholderAspectRatio;

        ViewTreeObserverOnPreDrawListenerC10971(ImageView imageView, float f2) {
            imageView = imageView;
            f = f2;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            imageView.getViewTreeObserver().removeOnPreDrawListener(this);
            int width = imageView.getWidth();
            imageView.setLayoutParams(new RelativeLayout.LayoutParams(width, (int) (width / f)));
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCardView(Context context) throws Throwable {
        super(context);
        Intrinsics.checkNotNullParameter(context, C1561oA.Yd("q~~\u0006w\f\t", (short) (C1580rY.Xd() ^ (-28069))));
        Object[] objArr = new Object[0];
        Method method = Class.forName(Xg.qd("bpgvtok6lyy\u0001r|\u0004>T\u0002\u0002\tz\u000f\f", (short) (Od.Xd() ^ (-7961)), (short) (Od.Xd() ^ (-28607)))).getMethod(Jg.Wd("SQ6^sE\u0017\u007fO!\u0018hD'QW<6|kK", (short) (Od.Xd() ^ (-22489)), (short) (Od.Xd() ^ (-6422))), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            Intrinsics.checkNotNullExpressionValue(context2, ZO.xd("S~i9hGIQJ\r#M1\u00061k6\u001c\u0011\f@r5b\u0010@", (short) (FB.Xd() ^ 551), (short) (FB.Xd() ^ 27864)));
            this.applicationContext = context2;
            this.classLogTag = BrazeLogger.getBrazeLogTag(getClass());
            BrazeConfigurationProvider configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(context);
            this.configurationProvider = configurationProvider;
            this.isUnreadCardVisualIndicatorEnabled = configurationProvider.isNewsfeedVisualIndicatorOn();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @JvmStatic
    protected static final UriAction getUriActionForCard(Card card) {
        return Companion.getUriActionForCard(card);
    }

    public final String getClassLogTag() {
        return this.classLogTag;
    }

    protected final void handleCardClick(Context context, Card card, IAction iAction) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.widget.BaseCardView.handleCardClick.1
            AnonymousClass1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Handling card click for card: " + card;
            }
        }, 6, (Object) null);
        card.setIndicatorHighlighted(true);
        if (isClickHandled(context, card, iAction)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.widget.BaseCardView.handleCardClick.5
                AnonymousClass5() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Card click was handled by custom listener on card: " + card.getId();
                }
            }, 7, (Object) null);
            card.logClick();
        } else {
            if (iAction == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.widget.BaseCardView.handleCardClick.4
                    AnonymousClass4() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Card action is null. Not performing any click action on card: " + card.getId();
                    }
                }, 6, (Object) null);
                return;
            }
            card.logClick();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.widget.BaseCardView.handleCardClick.2
                AnonymousClass2() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Card action is non-null. Attempting to perform action on card: " + card.getId();
                }
            }, 6, (Object) null);
            if (iAction instanceof UriAction) {
                BrazeDeeplinkHandler.Companion.getInstance().gotoUri(context, (UriAction) iAction);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.widget.BaseCardView.handleCardClick.3
                    AnonymousClass3() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Executing non uri action for click on card: " + card.getId();
                    }
                }, 7, (Object) null);
                iAction.execute(context);
            }
        }
    }

    protected abstract boolean isClickHandled(Context context, Card card, IAction iAction);

    public final boolean isUnreadIndicatorEnabled() {
        return this.isUnreadCardVisualIndicatorEnabled;
    }

    public final void setCardViewedIndicator(BrazeImageSwitcher brazeImageSwitcher, Card card) {
        Intrinsics.checkNotNullParameter(card, "card");
        if (brazeImageSwitcher == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) C10961.INSTANCE, 6, (Object) null);
            return;
        }
        Object tag = brazeImageSwitcher.getTag(R.string.com_braze_image_is_read_tag_key);
        if (tag == null) {
            tag = "";
        }
        if (card.isIndicatorHighlighted()) {
            if (Intrinsics.areEqual(tag, ICON_READ_TAG)) {
                return;
            }
            if (brazeImageSwitcher.getReadIcon() != null) {
                brazeImageSwitcher.setImageDrawable(brazeImageSwitcher.getReadIcon());
            } else {
                brazeImageSwitcher.setImageResource(R.drawable.com_braze_content_card_icon_read);
            }
            brazeImageSwitcher.setTag(R.string.com_braze_image_is_read_tag_key, ICON_READ_TAG);
            return;
        }
        if (Intrinsics.areEqual(tag, ICON_UNREAD_TAG)) {
            return;
        }
        if (brazeImageSwitcher.getUnReadIcon() != null) {
            brazeImageSwitcher.setImageDrawable(brazeImageSwitcher.getUnReadIcon());
        } else {
            brazeImageSwitcher.setImageResource(R.drawable.com_braze_content_card_icon_unread);
        }
        brazeImageSwitcher.setTag(R.string.com_braze_image_is_read_tag_key, ICON_UNREAD_TAG);
    }

    public final void setImageViewToUrl(ImageView imageView, String imageUrl, float f2, Card card) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(card, "card");
        if (Intrinsics.areEqual(imageUrl, imageView.getTag(R.string.com_braze_image_resize_tag_key))) {
            return;
        }
        if (f2 != 0.0f) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.braze.ui.widget.BaseCardView.setImageViewToUrl.1
                    final /* synthetic */ ImageView $imageView;
                    final /* synthetic */ float $placeholderAspectRatio;

                    ViewTreeObserverOnPreDrawListenerC10971(ImageView imageView2, float f22) {
                        imageView = imageView2;
                        f = f22;
                    }

                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public boolean onPreDraw() {
                        imageView.getViewTreeObserver().removeOnPreDrawListener(this);
                        int width = imageView.getWidth();
                        imageView.setLayoutParams(new RelativeLayout.LayoutParams(width, (int) (width / f)));
                        return true;
                    }
                });
            }
        }
        imageView2.setImageResource(android.R.color.transparent);
        Braze.Companion companion = Braze.Companion;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        IBrazeImageLoader imageLoader = companion.getInstance(context).getImageLoader();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        imageLoader.renderUrlIntoCardView(context2, card, imageUrl, imageView2, BrazeViewBounds.BASE_CARD_VIEW);
        imageView2.setTag(R.string.com_braze_image_resize_tag_key, imageUrl);
    }

    public final void setOptionalTextView(TextView view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        String str2 = str;
        if (str2 == null || StringsKt.isBlank(str2)) {
            view.setText("");
            view.setVisibility(8);
        } else {
            view.setText(str2);
            view.setVisibility(0);
        }
    }
}
