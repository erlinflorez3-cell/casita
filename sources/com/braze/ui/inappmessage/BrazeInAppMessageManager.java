package com.braze.ui.inappmessage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.inappmessage.Orientation;
import com.braze.events.BrazeUserChangeEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.InAppMessageEvent;
import com.braze.events.SdkDataWipeEvent;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageHtml;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.ui.actions.brazeactions.BrazeActionUtils;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener;
import com.braze.ui.inappmessage.listeners.IInAppMessageManagerListener;
import com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.braze.ui.support.ViewUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĉ\u0014D57\u001eq\u007fZDkt\nA\u000e0!.J~8,\u001aՄ\u000ff\u000198DkL6Ri*\u0017ӆ\u000442g,ڎK;k\u001a\u0006\"\u000fOVgu\u0012RZ!C\u0017\u0006\u001czr,_U\u0001]\u0018\u0011:B\u0006?;ݹw=O`|Ȃ\r @+@y\u000b\u0001\"*V\u0016~zIK\u0014\u0012F@x:X\u0010U\u0005(\u0012\u000e>&\u0002&\\}N>HreB/9\u0003qBT+eE\u0013ձ+\t\u0005';u\u001a\u001dm\u0001:߱\u0019%a\u0003Obil\u001b? k5n5VCK\nVd]F(]?]=ux6^\u0015Q\u000f\u000fU-\u007fgY\u0002&(&-B\r\u0005\u0010\u001c9?N>/*f6\"av9S\tf\u0010\u0013Z\u007f)\u0010f\u001b3/K+g \u0017Uop1Ne\u001eK!f1\u000f%9[\u0003<\u0011\u0019)\u0006\u0010Q_\u0004\u0007Q\u0011T\u0018\u0011Um2\u0013)\u0016r\u0012>\u007f\u0018/*?^\u001b3ps9QC2\u0016\u0011\\u1\u001d`\u0017u\u001aXVo:p,6X\u000e<^Rq\u001dk~b\u001fAY]*\u0010\u001f}6APb\u0006x9'&M}&0~\u0016c\u0018cGfe{5\u007fV]G\u001eK5\u007f\u0012Vu\u001b\u0007\"\u007fTb3\u0007\u0017HaHr^>!`\u00061$@\nR\u0010$\u0013`a\" B[I\u0019\u000b\u001a\u000f\u0018nVO}!gjj ~\u00036:\u0002\u0018&Kժ\r˩`pwΟIm:\u0001x$C@\u007f:O*\u0014&?\u061c\tɠ\u000b\u0011{ÒWiRMZl.w[\u0003.\u001e:;W8K\u001d_\r7=\u001a/[K!q(˪\u001eؠ~|\u0002Ҹ\ft<t j\u001f:7ʇVׅX\u0017*Ԯ/\u00071\u0017|\u007f(q|~\u001eϒVߏ_DQͿ\u0013[B_F|U:,7\u0019{2~E-q,-\u0018\b\u0014])\u0010pɳs4\u0002ʬ'(zz\u0012B4*}yieB=HI\b\u0013T!RnYܬTܖ{\bJކ\u0005-A`Yj\u0001XHM94,\u007f=0cߦXݍ>\u001fwϘD0eD\u0002C\u0016\u0016d^3-\u001e_u\u000b\u0006K\u000b)!\u05fd\fν\u007f1vܞlK.uod\u001f/4\u0014n݀Mވf\u0005DɿtC:] \u000bqv Jخ~\u0004^a\u00158@eDKd2lzrUv*7ѧlՃ.\u0003\u0007\u000fADII?,\u0006Nd1s2/{3\bIl&Ʈrު/D\\ڣkLf*#GsBw\u0007l\b\u0006-D¨{ɒ<*\u0005܈R\u001a!c_\u0011wx6\n\u0019]\u0005Pj# pƃRe"}, d2 = {"\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoW\u0019\u0004!JYa)\u0013x!\u0016MQIg6\u001e|dj5\tc9$", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoW \u007f\u0001@de E{\u00120M+7t0 \u0015u>5\u0015c\u0002", "u(E", "0qPGX\u001cLS&\\}Z5~\t\u000fv\u007f1\u000b.\u0011\u0014%E|\u00129v2", "\u001ab^:\")KO.~D^=|\u0012>sI\f[Q\u0001 &5\u007f\u000bJt29V}-\r", "\u001ab^:\")KO.~D^=|\u0012>sI\u0005\t<\u0016\u0017\u0007Uo\u001b\u001ay!>[}\u007fHm\u001f=#", "1`a?l6OS&b\u0004:7\bp/s\u000e$}@", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001ej", "5dc\u0010T9Kg#\u0010zk\u0010\u0006d:pg(\nN|\u0019\u0017\u0006k\u0017E\u000141h\u0002*@{", "5dc\u0010T9Kg#\u0010zk\u0010\u0006d:pg(\nN|\u0019\u0017", "u(;0b4\bP&z\u0010^u\u0005\u0013.e\u00076ED\n\u0013\"Rw\u000eJ\u0005!7YG\u0004\u001bvq9X+;yB\u001a\u0017h7", "Adc\u0010T9Kg#\u0010zk\u0010\u0006d:pg(\nN|\u0019\u0017", "uKR<`u;`\u0015\u0014z(4\u0007\b/l\u000eq\u007fI|\"\"Oo\u001cJr'5#a\u0004@I!95CIy0 \u0015>%*", "1n]3\\.N`\u0015\u000e~h5g\u00169v\u0004'{M", "\u001ab^:\")KO.~D\\6\u0006\n3g\u00105wO\u0005! \u0011L\u001b8\f%\u0013c\u0007!;o&;IR?u=\t\"rr=\u0006c9$", "1ta?X5MC'~\bB+", "", "2hb=_(RW\"\u0001^g\b\b\u0014\u0017e\u000e6wB\u0001", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5J 8TC7t\n", "5dc\u0011\\:IZ\u0015\u0013~g.`\u0012\u000bp\u000b\u0010{N\u000f\u0013\u0019G.\nE\u007f/DU\r$Av$", "7m0=c\u0014>a'z|^\f\u000e\t8tg$\u0007", "", "\u001ab^:\")KO.~D^=|\u0012>sI\f\u0005\u001c\f\"~G}\u001c8x%\u0015j})FC", "5dc\u0016a\bI^\u0001~\tl(~\t\u000fv\u007f1\u000b(|\"", "u(;7T=:\u001d)\u000e~eud\u0005:;", "7m0=c\u0014>a'z|^\f\u000e\t8tm8xN~$\u001bDo\u001b", "7m0=c\u0014>a'z|^\u001a\f\u0005-k", "\u001aiPCTuNb\u001d\u0006DL;x\u00075;", "5dc\u0016a\bI^\u0001~\tl(~\t\u001dt{&\u0002~|  Q~\nKz/>g", "5dc\u0016a\bI^\u0001~\tl(~\t\u001dt{&\u0002", "u(;7T=:\u001d)\u000e~euj\u0018+c\u0006}", "7m0=c\u0014>a'z|^\u001d\u0001\tAL\u0004){>\u0015\u0015\u001eGV\u0012J\u0006%>Y\u000b", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWCz3DY\u0007 D{_\u00121L\u0017v?\u0006\u0015vo5\tc\u001dRv9.PO,ZfpD\u0014x^\u001c]+\u0016\u0005f\u0017", "7m0=c\u0014>a'z|^\u001d\u0001\tAW\r$\u0007K\u0001$", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoW Z.\u0011d\t\b7{$*OC,o40\u0007u]D\u0012c9$", "7r2Be9>\\(\u0006\u000f=0\u000b\u00146a\u0014,\u0005Bd rRzu<\u000531[}", "", "u(I", "=qX4\\5:Z\u0003\f~^5\f\u0005>i\n1", "", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "AcZ\u0011T;:E\u001d\nz>=|\u0012>S\u0010%\n>\u000e\u001b\u0014G|", "\u001ab^:\")KO.~D^=|\u0012>sI\u0016zF_\u0013&Ca\u0012Gv\u0005FY\u0007/\r", "Cma2Z0Lb\u0019\fz]\u0010\u0006d:pg(\nN|\u0019\u0017", "5dc\"a9>U\u001d\r\n^9|\b\u0013n[3\u0007(\u0001%%Cq\u000ezr.>c\r\u001cFq 7[", "5dc\"a9>U\u001d\r\n^9|\b\u0013n[3\u0007(\u0001%%Cq\u000e", "Adc\"a9>U\u001d\r\n^9|\b\u0013n[3\u0007(\u0001%%Cq\u000e", "/cS\u0016a\bI^\u0001~\tl(~\t", "", "7m0=c\u0014>a'z|^", "1qT.g,\u001b`\u0015\u0014zN:|\u0016\rh{1}@`(\u0017P~{Ls33f\u0002\u001d7z", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1qT.g,\"\\t\n\u0006F,\u000b\u0017+g\u007f\b\r@\n&\u0005Wl\u001c:\u0004)2Y\u000b", "2hb=_(R7\"Z\u0006i\u0014|\u0017=a\u0002(", "7r2.e9R=*~\b", "3mbBe,,c\u0016\rxk0y\t.T\n\f\u0005\u001c\f\"~G}\u001c8x%\u0015j})F{", "5dc\u0016f\nN`&~\u0004m3\u0011g3s\u000b/wT\u0005 \u0019+xiG\u0002\r5g\f\u001c9m", "6hS26<K`\u0019\b\ne@[\r=p\u0007$\u0010D\n\u0019zPK\u0019G^%Cgy\"7", "2hb:\\:LS\u0018", "7r8;47I;\u0019\r\tZ.|i9rn+{.|\u001f\u00177}\u000eI", "@dV6f;>`|\bVi7d\t=s{*{(| \u0013Io\u001b", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "@d`BX:M2\u001d\r\u0006e(\u0011l8A\u000b3c@\u000f%\u0013Io", "@db2g\b?b\u0019\f^g\b\b\u0014\u0017e\u000e6wB\u0001t\u001eQ}\u000e", "Cma2Z0Lb\u0019\f^g\b\b\u0014\u0017e\u000e6wB\u0001~\u0013Pk\u0010<\u0004", "Dda6Y@(`\u001d~\u0004m(\f\r9nm7wO\u0011%", "\u0011n\\=T5B]\"", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class BrazeInAppMessageManager extends InAppMessageManagerBase {
    private static volatile BrazeInAppMessageManager instance = null;
    private IEventSubscriber<BrazeUserChangeEvent> brazeUserChangeEventSubscriber;
    private IInAppMessage carryoverInAppMessage;
    private BrazeConfigurationProvider configurationProvider;
    private IEventSubscriber<InAppMessageEvent> inAppMessageEventSubscriber;
    private IInAppMessageViewWrapper inAppMessageViewWrapper;
    private Integer originalOrientation;
    private IEventSubscriber<SdkDataWipeEvent> sdkDataWipeEventSubscriber;
    private IInAppMessage unregisteredInAppMessage;
    public static final Companion Companion = new Companion(null);
    private static final ReentrantLock instanceLock = new ReentrantLock();
    private final IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener = new DefaultInAppMessageViewLifecycleListener();
    public final AtomicBoolean displayingInAppMessage = new AtomicBoolean(false);
    private final Stack<IInAppMessage> inAppMessageStack = new Stack<>();
    private final Map<IInAppMessage, InAppMessageEvent> inAppMessageEventMap = new LinkedHashMap();
    private String currentUserId = "";

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljA0RnP.hS2şqڛ5:ӋTqq:\u0016\u001f\u0004\"\u07beSNug7Ph\u0010[\u000f4\u0018?otSc~u\u0012=9jom;\u0014o\u000eGnuN\u000761P:Pڑ\rʀ.H\u0018͌KOY\u000f*0nt\u0011Ĩ\u000f̂\t\u001a\u001aß̭$\n"}, d2 = {"\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoW\u0019\u0004!JYa)\u0013x!\u0016MQIg6\u001e|dj5\tc9\rT1OWJ5`\\{\u0013", "", "u(E", "7mbAT5<S", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoW\u0019\u0004!JYa)\u0013x!\u0016MQIg6\u001e|dj5\tc9$", "7mbAT5<S\u007f\txd", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u001e!Eu\u001c\u0006c%5b\r-3v%\u0015WAAA", "5dc\u0016a:MO\"|z", "1n]AT0Ga\u0004\u000f\ta\u0017|\u00167i\u000e6\u007fJ\n\u0002$Qw\u0019K", "", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001ej", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean containsPushPermissionPrompt(IInAppMessage iInAppMessage) {
            return iInAppMessage instanceof InAppMessageHtml ? ((InAppMessageHtml) iInAppMessage).isPushPrimer() : BrazeActionUtils.containsAnyPushPermissionBrazeActions(iInAppMessage);
        }

        @JvmStatic
        public final BrazeInAppMessageManager getInstance() {
            if (BrazeInAppMessageManager.instance != null) {
                BrazeInAppMessageManager brazeInAppMessageManager = BrazeInAppMessageManager.instance;
                Intrinsics.checkNotNull(brazeInAppMessageManager, "null cannot be cast to non-null type com.braze.ui.inappmessage.BrazeInAppMessageManager");
                return brazeInAppMessageManager;
            }
            ReentrantLock reentrantLock = BrazeInAppMessageManager.instanceLock;
            reentrantLock.lock();
            try {
                if (BrazeInAppMessageManager.instance == null) {
                    Companion companion = BrazeInAppMessageManager.Companion;
                    BrazeInAppMessageManager.instance = new BrazeInAppMessageManager();
                }
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                BrazeInAppMessageManager brazeInAppMessageManager2 = BrazeInAppMessageManager.instance;
                Intrinsics.checkNotNull(brazeInAppMessageManager2, "null cannot be cast to non-null type com.braze.ui.inappmessage.BrazeInAppMessageManager");
                return brazeInAppMessageManager2;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InAppMessageOperation.values().length];
            try {
                iArr[InAppMessageOperation.DISPLAY_NOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InAppMessageOperation.DISPLAY_LATER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InAppMessageOperation.DISCARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InAppMessageOperation.REENQUEUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<String> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Attempting to display in-app message with payload: " + JsonUtils.getPrettyPrintedString(iInAppMessage.forJsonPut());
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$10 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass10 extends Lambda implements Function0<String> {
        public static final AnonymousClass10 INSTANCE = ;

        AnonymousClass10() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Creating view wrapper for base in-app message.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$11 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass11 extends Lambda implements Function0<String> {
        public static final AnonymousClass11 INSTANCE = ;

        AnonymousClass11() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Creating view wrapper for in-app message.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$12 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass12 extends Lambda implements Function0<String> {
        public static final AnonymousClass12 INSTANCE = ;

        AnonymousClass12() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "In-app message view includes HTML. Delaying display until the content has finished loading.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$14 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass14 extends Lambda implements Function0<String> {
        AnonymousClass14() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Could not display in-app message with payload: " + JsonUtils.getPrettyPrintedString(iInAppMessage.forJsonPut());
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function0<String> {
        public static final AnonymousClass2 INSTANCE = ;

        AnonymousClass2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "A in-app message is currently being displayed. Adding in-app message back on the stack.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends Lambda implements Function0<String> {
        public static final AnonymousClass3 INSTANCE = ;

        AnonymousClass3() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Expiration timestamp not defined. Continuing.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$4 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass4 extends Lambda implements Function0<String> {
        public static final AnonymousClass4 INSTANCE = ;

        AnonymousClass4() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Not displaying control in-app message. Logging impression and ending display execution.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$5 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass5 extends Lambda implements Function0<String> {
        public static final AnonymousClass5 INSTANCE = ;

        AnonymousClass5() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Cannot show message containing an invalid Braze Action.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$6 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass6 extends Lambda implements Function0<String> {
        public static final AnonymousClass6 INSTANCE = ;

        AnonymousClass6() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Attempting to perform any fallback actions.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$7 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass7 extends Lambda implements Function0<String> {
        public static final AnonymousClass7 INSTANCE = ;

        AnonymousClass7() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Cannot show message containing a Push Prompt due to existing push prompt status, Android API version, or Target SDK level.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$8 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass8 extends Lambda implements Function0<String> {
        public static final AnonymousClass8 INSTANCE = ;

        AnonymousClass8() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Attempting to perform any fallback actions.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$9 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass9 extends Lambda implements Function0<String> {
        public static final AnonymousClass9 INSTANCE = ;

        AnonymousClass9() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Creating view wrapper for immersive in-app message.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$ensureSubscribedToInAppMessageEvents$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09801 extends Lambda implements Function0<String> {
        public static final C09801 INSTANCE = ;

        C09801() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Removing existing in-app message event subscriber before subscribing a new one.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$ensureSubscribedToInAppMessageEvents$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09812 extends Lambda implements Function0<String> {
        public static final C09812 INSTANCE = ;

        C09812() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Subscribing in-app message event subscriber";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$ensureSubscribedToInAppMessageEvents$4 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09824 extends Lambda implements Function0<String> {
        public static final C09824 INSTANCE = ;

        C09824() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Removing existing sdk data wipe event subscriber before subscribing a new one.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$ensureSubscribedToInAppMessageEvents$5 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09835 extends Lambda implements Function0<String> {
        public static final C09835 INSTANCE = ;

        C09835() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Subscribing sdk data wipe subscriber";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$ensureSubscribedToInAppMessageEvents$8 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09848 extends Lambda implements Function0<String> {
        public static final C09848 INSTANCE = ;

        C09848() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Removing existing user change event subscriber before subscribing a new one.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$registerInAppMessageManager$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09851 extends Lambda implements Function0<String> {
        public static final C09851 INSTANCE = ;

        C09851() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Null Activity passed to registerInAppMessageManager. Doing nothing";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$registerInAppMessageManager$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09862 extends Lambda implements Function0<String> {
        final /* synthetic */ Activity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09862(Activity activity) {
            super(0);
            activity = activity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Registering InAppMessageManager with activity: " + activity.getLocalClassName();
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$registerInAppMessageManager$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09873 extends Lambda implements Function0<String> {
        public static final C09873 INSTANCE = ;

        C09873() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Activity had null applicationContext in registerInAppMessageManager. Doing Nothing.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$registerInAppMessageManager$8 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09888 extends Lambda implements Function0<String> {
        public static final C09888 INSTANCE = ;

        C09888() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Error while calling attempting to register the InAppMessageManager";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$requestDisplayInAppMessage$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09891 extends Lambda implements Function0<String> {
        public static final C09891 INSTANCE = ;

        C09891() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "No activity is currently registered to receive in-app messages. Saving in-app message as unregistered in-app message. It will automatically be displayed when the next activity registers to receive in-app messages.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$requestDisplayInAppMessage$10 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C099010 extends Lambda implements Function0<String> {
        public static final C099010 INSTANCE = ;

        C099010() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Error running requestDisplayInAppMessage";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$requestDisplayInAppMessage$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09912 extends Lambda implements Function0<String> {
        public static final C09912 INSTANCE = ;

        C09912() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "No activity is currently registered to receive in-app messages and the in-app message stack is empty. Doing nothing.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$requestDisplayInAppMessage$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09923 extends Lambda implements Function0<String> {
        public static final C09923 INSTANCE = ;

        C09923() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "A in-app message is currently being displayed. Ignoring request to display in-app message.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$requestDisplayInAppMessage$4 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09934 extends Lambda implements Function0<String> {
        public static final C09934 INSTANCE = ;

        C09934() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "The in-app message stack is empty. No in-app message will be displayed.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$requestDisplayInAppMessage$5 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09945 extends Lambda implements Function0<String> {
        public static final C09945 INSTANCE = ;

        C09945() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_NOW. The in-app message will be displayed.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$requestDisplayInAppMessage$6 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09956 extends Lambda implements Function0<String> {
        public static final C09956 INSTANCE = ;

        C09956() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_LATER. The in-app message will be pushed back onto the stack.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$requestDisplayInAppMessage$7 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09967 extends Lambda implements Function0<String> {
        public static final C09967 INSTANCE = ;

        C09967() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISCARD. The in-app message will not be displayed and will not be put back on the stack.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$requestDisplayInAppMessage$8 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09978 extends Lambda implements Function0<String> {
        public static final C09978 INSTANCE = ;

        C09978() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned REENQUEUE. The in-app message will not be displayed and will be marked as eligible for next time.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$requestDisplayInAppMessage$9 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09989 extends Lambda implements Function0<String> {
        C09989() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "An in-app message was requested to be re-enqueued, but it was not found. Discarding instead. In-app message = " + iInAppMessage;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$resetAfterInAppMessageClose$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09991 extends Lambda implements Function0<String> {
        public static final C09991 INSTANCE = ;

        C09991() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Resetting after in-app message close.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$resetAfterInAppMessageClose$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10002 extends Lambda implements Function0<String> {
        final /* synthetic */ Integer $origOrientation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10002(Integer num) {
            super(0);
            num = num;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Setting requested orientation to original orientation " + num;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$unregisterInAppMessageManager$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10011 extends Lambda implements Function0<String> {
        final /* synthetic */ Activity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10011(Activity activity) {
            super(0);
            activity = activity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            StringBuilder sb = new StringBuilder("Skipping unregistration due to setShouldNextUnregisterBeSkipped being true. Activity: ");
            Activity activity = activity;
            return sb.append(activity != null ? activity.getLocalClassName() : null).toString();
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$unregisterInAppMessageManager$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10022 extends Lambda implements Function0<String> {
        public static final C10022 INSTANCE = ;

        C10022() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Null Activity passed to unregisterInAppMessageManager.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$unregisterInAppMessageManager$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10033 extends Lambda implements Function0<String> {
        final /* synthetic */ Activity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10033(Activity activity) {
            super(0);
            activity = activity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Unregistering InAppMessageManager from activity: " + activity.getLocalClassName();
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$unregisterInAppMessageManager$4 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10044 extends Lambda implements Function0<String> {
        public static final C10044 INSTANCE = ;

        C10044() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "In-app message view includes HTML. Removing the page finished listener.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$unregisterInAppMessageManager$5 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10055 extends Lambda implements Function0<String> {
        public static final C10055 INSTANCE = ;

        C10055() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Error while calling attempting to unregister the InAppMessageManager";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$verifyOrientationStatus$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10061 extends Lambda implements Function0<String> {
        public static final C10061 INSTANCE = ;

        C10061() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Cannot verify orientation status with null Activity.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$verifyOrientationStatus$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10072 extends Lambda implements Function0<String> {
        public static final C10072 INSTANCE = ;

        C10072() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Running on tablet. In-app message can be displayed in any orientation.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$verifyOrientationStatus$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10083 extends Lambda implements Function0<String> {
        public static final C10083 INSTANCE = ;

        C10083() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Any orientation specified. In-app message can be displayed in any orientation.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$verifyOrientationStatus$4 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10094 extends Lambda implements Function0<String> {
        public static final C10094 INSTANCE = ;

        C10094() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Requesting orientation lock.";
        }
    }

    private final IEventSubscriber<BrazeUserChangeEvent> createBrazeUserChangeEventSubscriber(final Context context) {
        return new IEventSubscriber() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda1
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BrazeInAppMessageManager.createBrazeUserChangeEventSubscriber$lambda$10(this.f$0, context, (BrazeUserChangeEvent) obj);
            }
        };
    }

    public static final void createBrazeUserChangeEventSubscriber$lambda$10(final BrazeInAppMessageManager this$0, Context context, final BrazeUserChangeEvent event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(event, "event");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this$0, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$createBrazeUserChangeEventSubscriber$1$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "InAppMessage manager handling new current user id: '" + event + '\'';
            }
        }, 6, (Object) null);
        if (!BrazeInternal.INSTANCE.getConfigurationProvider(context).isPreventInAppMessageDisplayForDifferentUsersEnabled()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this$0, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$createBrazeUserChangeEventSubscriber$1$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Not cleansing in-app messages on user id change";
                }
            }, 6, (Object) null);
            return;
        }
        final String currentUserId = event.getCurrentUserId();
        this$0.currentUserId = currentUserId;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this$0, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$createBrazeUserChangeEventSubscriber$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Removing in-app messages not from user " + currentUserId;
            }
        }, 7, (Object) null);
        CollectionsKt.removeAll((List) this$0.inAppMessageStack, (Function1) new Function1<IInAppMessage, Boolean>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$createBrazeUserChangeEventSubscriber$1$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(IInAppMessage iInAppMessage) {
                return Boolean.valueOf(!this.this$0.isInAppMessageForTheSameUser(iInAppMessage, currentUserId));
            }
        });
        if (!this$0.isInAppMessageForTheSameUser(this$0.carryoverInAppMessage, currentUserId)) {
            this$0.carryoverInAppMessage = null;
        }
        if (this$0.isInAppMessageForTheSameUser(this$0.unregisteredInAppMessage, currentUserId)) {
            return;
        }
        this$0.unregisteredInAppMessage = null;
    }

    private final IEventSubscriber<InAppMessageEvent> createInAppMessageEventSubscriber() {
        return new IEventSubscriber() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda2
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BrazeInAppMessageManager.createInAppMessageEventSubscriber$lambda$9(this.f$0, (InAppMessageEvent) obj);
            }
        };
    }

    public static final void createInAppMessageEventSubscriber$lambda$9(BrazeInAppMessageManager this$0, InAppMessageEvent event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(event, "event");
        IInAppMessage inAppMessage = event.getInAppMessage();
        this$0.inAppMessageEventMap.put(inAppMessage, event);
        this$0.addInAppMessage(inAppMessage);
    }

    public static final void displayInAppMessage$lambda$8(IInAppMessageViewWrapper iInAppMessageViewWrapper, BrazeInAppMessageManager this$0, Activity activity) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (iInAppMessageViewWrapper != null) {
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this$0, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$13$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Page has finished loading. Opening in-app message view wrapper.";
                    }
                }, 7, (Object) null);
                iInAppMessageViewWrapper.open(activity);
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this$0, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$13$2
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Failed to open view wrapper in page finished listener";
                    }
                }, 4, (Object) null);
            }
        }
    }

    public static final void ensureSubscribedToInAppMessageEvents$lambda$1(BrazeInAppMessageManager this$0, SdkDataWipeEvent it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.inAppMessageStack.clear();
        this$0.carryoverInAppMessage = null;
        this$0.unregisteredInAppMessage = null;
    }

    public static /* synthetic */ void getCarryoverInAppMessage$annotations() {
    }

    public static /* synthetic */ void getDisplayingInAppMessage$annotations() {
    }

    public static /* synthetic */ void getInAppMessageStack$annotations() {
    }

    @JvmStatic
    public static final BrazeInAppMessageManager getInstance() {
        return Companion.getInstance();
    }

    public static /* synthetic */ void getUnregisteredInAppMessage$annotations() {
    }

    public void addInAppMessage(IInAppMessage iInAppMessage) {
        if (iInAppMessage != null) {
            this.inAppMessageStack.push(iInAppMessage);
            requestDisplayInAppMessage();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01a2 A[Catch: all -> 0x0287, TryCatch #0 {all -> 0x0287, blocks: (B:167:0x019c, B:169:0x01a2, B:171:0x01c4, B:165:0x015a, B:166:0x0175, B:172:0x01c9, B:173:0x01d1, B:174:0x01d2, B:175:0x01da, B:176:0x01db, B:177:0x01e3, B:187:0x024d, B:188:0x0255, B:189:0x0256, B:190:0x025e, B:193:0x027c, B:194:0x0286), top: B:205:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void displayInAppMessage(com.braze.models.inappmessage.IInAppMessage r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.ui.inappmessage.BrazeInAppMessageManager.displayInAppMessage(com.braze.models.inappmessage.IInAppMessage, boolean):void");
    }

    public void ensureSubscribedToInAppMessageEvents(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.inAppMessageEventSubscriber != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09801.INSTANCE, 7, (Object) null);
            Braze.Companion.getInstance(context).removeSingleSubscription(this.inAppMessageEventSubscriber, InAppMessageEvent.class);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09812.INSTANCE, 7, (Object) null);
        IEventSubscriber<InAppMessageEvent> iEventSubscriberCreateInAppMessageEventSubscriber = createInAppMessageEventSubscriber();
        Braze.Companion.getInstance(context).subscribeToNewInAppMessages(iEventSubscriberCreateInAppMessageEventSubscriber);
        this.inAppMessageEventSubscriber = iEventSubscriberCreateInAppMessageEventSubscriber;
        if (this.sdkDataWipeEventSubscriber != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) C09824.INSTANCE, 6, (Object) null);
            Braze.Companion.getInstance(context).removeSingleSubscription(this.sdkDataWipeEventSubscriber, SdkDataWipeEvent.class);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) C09835.INSTANCE, 6, (Object) null);
        IEventSubscriber<SdkDataWipeEvent> iEventSubscriber = new IEventSubscriber() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda3
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$1(this.f$0, (SdkDataWipeEvent) obj);
            }
        };
        Braze.Companion.getInstance(context).addSingleSynchronousSubscription(iEventSubscriber, SdkDataWipeEvent.class);
        this.sdkDataWipeEventSubscriber = iEventSubscriber;
        if (this.brazeUserChangeEventSubscriber != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) C09848.INSTANCE, 6, (Object) null);
            Braze.Companion.getInstance(context).removeSingleSubscription(this.brazeUserChangeEventSubscriber, BrazeUserChangeEvent.class);
        }
        IEventSubscriber<BrazeUserChangeEvent> iEventSubscriberCreateBrazeUserChangeEventSubscriber = createBrazeUserChangeEventSubscriber(context);
        Braze.Companion.getInstance(context).addSingleSynchronousSubscription(iEventSubscriberCreateBrazeUserChangeEventSubscriber, BrazeUserChangeEvent.class);
        this.brazeUserChangeEventSubscriber = iEventSubscriberCreateBrazeUserChangeEventSubscriber;
    }

    public final IInAppMessage getCarryoverInAppMessage() {
        return this.carryoverInAppMessage;
    }

    public final Map<IInAppMessage, InAppMessageEvent> getInAppMessageEventMap() {
        return this.inAppMessageEventMap;
    }

    public final Stack<IInAppMessage> getInAppMessageStack() {
        return this.inAppMessageStack;
    }

    public boolean getIsCurrentlyDisplayingInAppMessage() {
        return this.displayingInAppMessage.get();
    }

    public final IInAppMessage getUnregisteredInAppMessage() {
        return this.unregisteredInAppMessage;
    }

    public void hideCurrentlyDisplayingInAppMessage(boolean z2) {
        setShouldNextUnregisterBeSkipped(false);
        IInAppMessageViewWrapper iInAppMessageViewWrapper = this.inAppMessageViewWrapper;
        if (iInAppMessageViewWrapper != null) {
            if (z2) {
                this.inAppMessageViewLifecycleListener.onDismissed(iInAppMessageViewWrapper.getInAppMessageView(), iInAppMessageViewWrapper.getInAppMessage());
            }
            iInAppMessageViewWrapper.close();
        }
    }

    public final boolean isCurrentlyDisplayingInAppMessage() {
        return this.displayingInAppMessage.get();
    }

    public boolean isInAppMessageForTheSameUser(IInAppMessage iInAppMessage, String currentUserId) {
        Intrinsics.checkNotNullParameter(currentUserId, "currentUserId");
        if (iInAppMessage == null) {
            return true;
        }
        InAppMessageEvent inAppMessageEvent = this.inAppMessageEventMap.get(iInAppMessage);
        String userId = inAppMessageEvent != null ? inAppMessageEvent.getUserId() : null;
        return userId == null || Intrinsics.areEqual(userId, currentUserId);
    }

    public void registerInAppMessageManager(Activity activity) {
        try {
            if (activity == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) C09851.INSTANCE, 6, (Object) null);
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.registerInAppMessageManager.2
                final /* synthetic */ Activity $activity;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C09862(Activity activity2) {
                    super(0);
                    activity = activity2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Registering InAppMessageManager with activity: " + activity.getLocalClassName();
                }
            }, 6, (Object) null);
            this.mActivity = activity2;
            if (this.mApplicationContext == null) {
                this.mApplicationContext = activity2.getApplicationContext();
                if (this.mApplicationContext == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) C09873.INSTANCE, 6, (Object) null);
                    return;
                }
            }
            if (this.configurationProvider == null) {
                Context context = this.mApplicationContext;
                this.configurationProvider = context != null ? new BrazeConfigurationProvider(context) : null;
            }
            IInAppMessage iInAppMessage = this.carryoverInAppMessage;
            if (iInAppMessage != null) {
                if (iInAppMessage != null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$registerInAppMessageManager$5$1
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Requesting display of carryover in-app message.";
                        }
                    }, 7, (Object) null);
                    iInAppMessage.setAnimateIn(false);
                    displayInAppMessage(iInAppMessage, true);
                }
                this.carryoverInAppMessage = null;
            } else {
                IInAppMessage iInAppMessage2 = this.unregisteredInAppMessage;
                if (iInAppMessage2 != null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$registerInAppMessageManager$6$1
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Adding previously unregistered in-app message.";
                        }
                    }, 7, (Object) null);
                    addInAppMessage(iInAppMessage2);
                    this.unregisteredInAppMessage = null;
                }
            }
            Context context2 = this.mApplicationContext;
            if (context2 != null) {
                ensureSubscribedToInAppMessageEvents(context2);
            }
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) C09888.INSTANCE, 4, (Object) null);
        }
    }

    public boolean requestDisplayInAppMessage() {
        InAppMessageOperation inAppMessageOperationBeforeInAppMessageDisplayed;
        try {
            Activity activity = this.mActivity;
            if (activity == null) {
                if (this.inAppMessageStack.empty()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09912.INSTANCE, 7, (Object) null);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) C09891.INSTANCE, 6, (Object) null);
                    this.unregisteredInAppMessage = this.inAppMessageStack.pop();
                }
                return false;
            }
            if (this.displayingInAppMessage.get()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09923.INSTANCE, 7, (Object) null);
                return false;
            }
            if (this.inAppMessageStack.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09934.INSTANCE, 7, (Object) null);
                return false;
            }
            IInAppMessage inAppMessage = this.inAppMessageStack.pop();
            if (inAppMessage.isControl()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$requestDisplayInAppMessage$inAppMessageOperation$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Using the control in-app message manager listener.";
                    }
                }, 7, (Object) null);
                IInAppMessageManagerListener controlInAppMessageManagerListener = getControlInAppMessageManagerListener();
                Intrinsics.checkNotNullExpressionValue(inAppMessage, "inAppMessage");
                inAppMessageOperationBeforeInAppMessageDisplayed = controlInAppMessageManagerListener.beforeInAppMessageDisplayed(inAppMessage);
            } else {
                IInAppMessageManagerListener inAppMessageManagerListener = getInAppMessageManagerListener();
                Intrinsics.checkNotNullExpressionValue(inAppMessage, "inAppMessage");
                inAppMessageOperationBeforeInAppMessageDisplayed = inAppMessageManagerListener.beforeInAppMessageDisplayed(inAppMessage);
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[inAppMessageOperationBeforeInAppMessageDisplayed.ordinal()];
            if (i2 == 1) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09945.INSTANCE, 7, (Object) null);
            } else {
                if (i2 == 2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09956.INSTANCE, 7, (Object) null);
                    this.inAppMessageStack.push(inAppMessage);
                    return false;
                }
                if (i2 == 3) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09967.INSTANCE, 7, (Object) null);
                    return false;
                }
                if (i2 == 4) {
                    InAppMessageEvent inAppMessageEvent = this.inAppMessageEventMap.get(inAppMessage);
                    if (inAppMessageEvent != null) {
                        BrazeInternal brazeInternal = BrazeInternal.INSTANCE;
                        Context applicationContext = activity.getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext, "activity.applicationContext");
                        brazeInternal.reenqueueInAppMessage(applicationContext, inAppMessageEvent);
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09978.INSTANCE, 7, (Object) null);
                    } else {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.requestDisplayInAppMessage.9
                            C09989() {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                return "An in-app message was requested to be re-enqueued, but it was not found. Discarding instead. In-app message = " + iInAppMessage;
                            }
                        }, 7, (Object) null);
                    }
                    return false;
                }
            }
            BackgroundInAppMessagePreparer.prepareInAppMessageForDisplay(inAppMessage);
            return true;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) C099010.INSTANCE, 4, (Object) null);
            return false;
        }
    }

    public void resetAfterInAppMessageClose() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) C09991.INSTANCE, 6, (Object) null);
        this.inAppMessageViewWrapper = null;
        Activity activity = this.mActivity;
        Integer num = this.originalOrientation;
        this.displayingInAppMessage.set(false);
        if (activity == null || num == null) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.resetAfterInAppMessageClose.2
            final /* synthetic */ Integer $origOrientation;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10002(Integer num2) {
                super(0);
                num = num2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Setting requested orientation to original orientation " + num;
            }
        }, 7, (Object) null);
        ViewUtils.setActivityRequestedOrientation(activity, num2.intValue());
        this.originalOrientation = null;
    }

    public final void setCarryoverInAppMessage(IInAppMessage iInAppMessage) {
        this.carryoverInAppMessage = iInAppMessage;
    }

    public final void setUnregisteredInAppMessage(IInAppMessage iInAppMessage) {
        this.unregisteredInAppMessage = iInAppMessage;
    }

    public void unregisterInAppMessageManager(Activity activity) {
        IInAppMessage inAppMessage;
        try {
            if (getShouldNextUnregisterBeSkipped()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.unregisterInAppMessageManager.1
                    final /* synthetic */ Activity $activity;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C10011(Activity activity2) {
                        super(0);
                        activity = activity2;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        StringBuilder sb = new StringBuilder("Skipping unregistration due to setShouldNextUnregisterBeSkipped being true. Activity: ");
                        Activity activity2 = activity;
                        return sb.append(activity2 != null ? activity2.getLocalClassName() : null).toString();
                    }
                }, 7, (Object) null);
                setShouldNextUnregisterBeSkipped(false);
                return;
            }
            if (activity2 == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) C10022.INSTANCE, 6, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.unregisterInAppMessageManager.3
                    final /* synthetic */ Activity $activity;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C10033(Activity activity2) {
                        super(0);
                        activity = activity2;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Unregistering InAppMessageManager from activity: " + activity.getLocalClassName();
                    }
                }, 6, (Object) null);
            }
            IInAppMessageViewWrapper iInAppMessageViewWrapper = this.inAppMessageViewWrapper;
            if (iInAppMessageViewWrapper != null) {
                View inAppMessageView = iInAppMessageViewWrapper.getInAppMessageView();
                if (inAppMessageView instanceof InAppMessageHtmlBaseView) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C10044.INSTANCE, 7, (Object) null);
                    ((InAppMessageHtmlBaseView) inAppMessageView).setHtmlPageFinishedListener(null);
                }
                ViewUtils.removeViewFromParent(inAppMessageView);
                if (iInAppMessageViewWrapper.isAnimatingClose()) {
                    this.inAppMessageViewLifecycleListener.afterClosed(iInAppMessageViewWrapper.getInAppMessage());
                    inAppMessage = null;
                } else {
                    inAppMessage = iInAppMessageViewWrapper.getInAppMessage();
                }
                this.carryoverInAppMessage = inAppMessage;
                this.inAppMessageViewWrapper = null;
            } else {
                this.carryoverInAppMessage = null;
            }
            this.mActivity = null;
            this.displayingInAppMessage.set(false);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) C10055.INSTANCE, 4, (Object) null);
        }
    }

    public boolean verifyOrientationStatus(IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Activity activity = this.mActivity;
        Orientation orientation = inAppMessage.getOrientation();
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) C10061.INSTANCE, 6, (Object) null);
        } else if (ViewUtils.isRunningOnTablet(activity)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C10072.INSTANCE, 7, (Object) null);
        } else {
            if (orientation != Orientation.ANY) {
                if (!ViewUtils.isCurrentOrientationValid(activity.getResources().getConfiguration().orientation, orientation)) {
                    return false;
                }
                if (this.originalOrientation != null) {
                    return true;
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C10094.INSTANCE, 7, (Object) null);
                this.originalOrientation = Integer.valueOf(activity.getRequestedOrientation());
                ViewUtils.setActivityRequestedOrientation(activity, 14);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C10083.INSTANCE, 7, (Object) null);
        }
        return true;
    }
}
