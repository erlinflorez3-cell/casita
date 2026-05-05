package com.davivienda.daviviendaapp.bridges.gpay;

import android.content.Context;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import fr.antelop.sdk.WalletLockReason;
import fr.antelop.sdk.WalletNotificationServiceCallback;
import fr.antelop.sdk.card.EmvApplicationActivationMethod;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0007\":\u001e\u007f\u0007ljA0ZeP.XV2\u000fy\u001a<$q$yCAY\"}8\tWNmivJp\u000bK\u000f\f\u0017\u000f̓Je\u0006x\f\u0011G1^0BݯQoK9)\u0003D\u000682P:*\t\u000f\u001dBH>zAC\u0014\u001a 5XphT=Q\u0013 *\u0006l'G2%u\\>`l\f<_'\u0011oZNUfv\u0011\u0016\u001bT]?\r%cN/N=M\u0015SZI\u001b\u001b\u007fM\rWqk\u0007\u0019+51as\u0006=\t\u0004\" CO;a#0j\u0011if\u001c);O\u0012Y~\u001bn\fC\n\u001bK\u001c\u000e4)x2; ~\b<:;\u0007\u001cN^\u0012vB.|\u0012:%+\u00183Y@az\u001aoI*f7*\u0007=\"1\u0007\u0007!\n[Tt])b\ni1\u007fBmL\\\u0010q=\u001c\u000b7vJ@\u0012C_\u007f]}A2%+O[g*Qo\u0010\\\\g%\u001a'|\u001cw`^X\"\u001d\u0018g.\u0017\u0012rD\u0013\f2d\u001df:(e\u001c\u0003\t.\f!&twj(k$\u0017ev\u0002\u0003M\f\fU3t=qn\u001a\u0015\b=lLMQ\u0012*(f?\"MWz\u0005\u0007hrW\u001a`t(P9\u000f~ށ{\u0019"}, d2 = {"\u001ab^:\"+:d\u001d\u0010~^5{\u0005xd{9\u007fQ\u0005\u0017 Fk\nG\u0002n2f\u0002\u001f9m$wON7\u007f}\u0010\u0011oh9\u0016L6]z(KJJ;`\\{+\u0014\u001fk\u0012L+b", "\u001aea{T5MS \t\u0006(:{\u000fxW{/\u0003@\u0010\u007f!Vs\u000f@t!D]\b)%m#?QA;I0%\u001ce]7\r9", "u(E", ":nV\u0012i,Gb", "", ";db@T.>", "", "=m2.e+LC$}vm,{", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "=m2<h5MS&\rji+x\u0018/d", "=m2Bf;H[\u0019\fXk,{\t8t\u0004$\u0003Nm\u0017%G~", "=m4:i\bI^ \u0003xZ;\u0001\u00138A}7\u007fQ|&\u001bQxz<\u000359f}\u001f", "3le\u000ec7\"R", ";dc5b+L", "", "\u001aea{T5MS \t\u0006(:{\u000fxc{5z\n`\u001f(#z\u0019Cz#1h\u0002*@I\u0014=QT7z8(\u001ePaH\nm+$", "=m4:i\bI^ \u0003xZ;\u0001\u00138C\r(z@\n&\u001bCv\u001c,\u0002$1h}\u001f", "=m;<Z6Nb", "=m;<f;\u001eZ\u001d\u0001~[0\u0004\r>y", "=mB2g;B\\\u001b\rji+x\u0018/d", "=mBBa:>b\u0007|}^+\r\u0010/d", "At]@X;\u001dO(~", "\u001aiPCTuNb\u001d\u0006D=(\f\t\u0005", "=mF._3>bw~\u0002^;|\b", "=mF._3>b\u007f\tv],{", "=mF._3>b\u007f\txd,{", "@dP@b5", "\u001aea{T5MS \t\u0006(:{\u000fxW{/\u0003@\u0010}!Euz<r3?bS", "=mF._3>b\t\b\u0002h*\u0003\t.", "\u0011n\\=T5B]\"", "/o_,e,ES\u0015\rz"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class WalletNotificationService implements WalletNotificationServiceCallback {
    public static final Companion Companion;
    private static final String EVT_CARDS_UPDATED;
    public static final String TAG;
    private static ReactApplicationContext reactContext = null;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005\"4\u0012\u000e\u0007nj?3JͣIDɟ\u0004*=j<9*[ҸuCIUj\n0\ngN\u0016iEϽ-ŲG\u000f\u000eǝIv:Lmx\f\u0014e˷\u0015ņC3Uڎ\u000eSnxN\u000761P=Pڕ\rʀ.T\u0018͌\u0013EQ\u0012 7`r@Z\u001bVő\u001e\u001c"}, d2 = {"\u001ab^:\"+:d\u001d\u0010~^5{\u0005xd{9\u007fQ\u0005\u0017 Fk\nG\u0002n2f\u0002\u001f9m$wON7\u007f}\u0010\u0011oh9\u0016L6]z(KJJ;`\\{+\u0014\u001fk\u0012L+KbcI/jM;)\u0011\u0002", "", "u(E", "\u0013UC,6\b+2\u0007xjI\u000bXw\u000fD", "", "\"@6", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "5dc\u001fX(<bv\t\u0004m,\u0010\u0018", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0014$Kn\u0010<@\u00125U{/\u0013x!5QA7z8(\u001eFkB\u0016c?]L", "Adc\u001fX(<bv\t\u0004m,\u0010\u0018", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$:\u0018", "/o_,e,ES\u0015\rz"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ReactApplicationContext getReactContext() {
            return WalletNotificationService.reactContext;
        }

        public final void setReactContext(ReactApplicationContext reactApplicationContext) {
            WalletNotificationService.reactContext = reactApplicationContext;
        }
    }

    static {
        short sXd = (short) (Od.Xd() ^ (C1580rY.Xd() ^ 831083090));
        int[] iArr = new int["\u0015\u001e('\u001f-\u0006&*\u001e\u001a\u001c\u0015\u0012$\u0018\u001d\u001b~\u0010\u001c\u001f\u0011\n\u000b".length()];
        QB qb = new QB("\u0015\u001e('\u001f-\u0006&*\u001e\u001a\u001c\u0015\u0012$\u0018\u001d\u001b~\u0010\u001c\u001f\u0011\n\u000b");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        TAG = new String(iArr, 0, i2);
        EVT_CARDS_UPDATED = C1561oA.yd(">LS_<;M@HULH53G91", (short) (C1607wl.Xd() ^ ((660073848 ^ 972209282) ^ 514162140)));
        Companion = new Companion(null);
    }

    private final void logEvent(String str) {
    }

    @Override // fr.antelop.sdk.WalletNotificationServiceCallback
    public void onCardsUpdated(Context context) {
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter;
        short sXd = (short) (OY.Xd() ^ (1683882772 ^ 1683911480));
        int[] iArr = new int["\n\u0017\u0017\u001e\u0010$!".length()];
        QB qb = new QB("\n\u0017\u0017\u001e\u0010$!");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        Intrinsics.checkNotNullParameter(context, new String(iArr, 0, i2));
        try {
            ReactApplicationContext reactApplicationContext = reactContext;
            if (reactApplicationContext == null || (rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)) == null) {
                return;
            }
            rCTDeviceEventEmitter.emit(Xg.qd("'5<H-,>1ANEA64H::", (short) (Od.Xd() ^ (993526015 ^ (-993548233))), (short) (Od.Xd() ^ (1458047001 ^ (-1458045917)))), null);
        } catch (Exception e2) {
            short sXd2 = (short) (C1607wl.Xd() ^ (1065063159 ^ 1065058530));
            short sXd3 = (short) (C1607wl.Xd() ^ (1411262579 ^ 1411258703));
            int[] iArr2 = new int["\u0018b~A`3CY :\\\u001e;\u0011\u00194\n\u0018L5(Gw\u001ai\u007f\u001b\u001b}3_\u0005O".length()];
            QB qb2 = new QB("\u0018b~A`3CY :\\\u001e;\u0011\u00194\n\u0018L5(Gw\u001ai\u007f\u001b\u001b}3_\u0005O");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd3) ^ sXd2));
                i3++;
            }
            new String(iArr2, 0, i3);
            short sXd4 = (short) (Od.Xd() ^ (1429775277 ^ (-1429778198)));
            short sXd5 = (short) (Od.Xd() ^ (146967516 ^ (-146975233)));
            int[] iArr3 = new int["9({s\u001dJ,\f9\u001a\u001aS$\u001f\u0015T9\u0011dEU(n\u0002\b".length()];
            QB qb3 = new QB("9({s\u001dJ,\f9\u001a\u001aS$\u001f\u0015T9\u0011dEU(n\u0002\b");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((i4 * sXd5) + sXd4)));
                i4++;
            }
            new String(iArr3, 0, i4);
        }
    }

    @Override // fr.antelop.sdk.WalletNotificationServiceCallback
    public void onCountersUpdated(Context context) {
        int iXd = C1633zX.Xd() ^ (-1951469520);
        Intrinsics.checkNotNullParameter(context, C1626yg.Ud("ZV\u001b@tya", (short) (ZN.Xd() ^ ((1517081971 ^ 1757862909) ^ 850022910)), (short) (ZN.Xd() ^ iXd)));
    }

    @Override // fr.antelop.sdk.WalletNotificationServiceCallback
    public void onCustomerCredentialsReset(Context context) {
        Intrinsics.checkNotNullParameter(context, Ig.wd("4\u001cjNM\u001c2", (short) (FB.Xd() ^ (636593700 ^ 636616048))));
    }

    @Override // fr.antelop.sdk.WalletNotificationServiceCallback
    public void onEmvApplicationActivationRequired(Context context, String str, List<EmvApplicationActivationMethod> list) {
        Intrinsics.checkNotNullParameter(context, EO.Od("\u0012lo\u0018z2\u0014", (short) (ZN.Xd() ^ (Od.Xd() ^ (987193360 ^ 2099944590)))));
        short sXd = (short) (ZN.Xd() ^ (C1499aX.Xd() ^ (-1134257741)));
        int[] iArr = new int["W^f0^]5O".length()];
        QB qb = new QB("W^f0^]5O");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(str, new String(iArr, 0, i2));
        Intrinsics.checkNotNullParameter(list, C1593ug.zd("UN^S[Qa", (short) (FB.Xd() ^ (OY.Xd() ^ 69942723)), (short) (FB.Xd() ^ (Od.Xd() ^ (819049878 ^ 1999372682)))));
        CollectionsKt.joinToString$default(list, C1561oA.od("!\u0014", (short) (C1580rY.Xd() ^ (C1633zX.Xd() ^ 1951488475))), null, null, 0, null, new Function1<EmvApplicationActivationMethod, CharSequence>() { // from class: com.davivienda.daviviendaapp.bridges.gpay.WalletNotificationService$onEmvApplicationActivationRequired$methodList$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final CharSequence invoke2(EmvApplicationActivationMethod emvApplicationActivationMethod) {
                int iXd = OY.Xd() ^ (230417077 ^ 160482652);
                Intrinsics.checkNotNullParameter(emvApplicationActivationMethod, Wg.Zd("\u001fa", (short) (OY.Xd() ^ (2144657220 ^ 2144663622)), (short) (OY.Xd() ^ iXd)));
                String id = emvApplicationActivationMethod.getId();
                Intrinsics.checkNotNullExpressionValue(id, C1561oA.Xd("\u001b\u001a*\u007f\u001c`ghie", (short) (Od.Xd() ^ ((333901977 ^ 1334637959) ^ (-1550455946)))));
                return id;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ CharSequence invoke(EmvApplicationActivationMethod emvApplicationActivationMethod) throws Throwable {
                Object[] objArr = {emvApplicationActivationMethod};
                Method method = Class.forName(Wg.vd("BMJ\nGCWIM?:B?;\u0007<PdVb\\W_THGUT\u0019L[Q#%\"/p)1!0c\f\u0015'&\u001e,\u001d=A59;41;/42\u001e/;>\b\u0001\u0002?\u0012\u0010e\r\rV\u0005\u0004\u0007\u0003{x#\u0017\u001c\u001as\u0015%\u0019\u001d\u0007\u0019\r\u001a\u0018z\roremge$l[i\\b^Eaj\u00031=", (short) (C1580rY.Xd() ^ (ZN.Xd() ^ (139175590 ^ (-1002539741)))))).getMethod(hg.Vd("\u0010\u0014\u001b\u0013\u000e\u0007", (short) (C1607wl.Xd() ^ (FB.Xd() ^ 1609522422)), (short) (C1607wl.Xd() ^ ((756773362 ^ 12437210) ^ 765914774))), Class.forName(Qg.kd("GR\r?KP@FHH\u0005I9?\u000152B3{\u00129A\u000b983/(%7+0.\u007f!1%1\u001b-!&$\u0002\u0019'\u001a \u0014", (short) (Od.Xd() ^ (Od.Xd() ^ (304182089 ^ (-1440535101)))), (short) (Od.Xd() ^ (C1580rY.Xd() ^ 831070034)))));
                try {
                    method.setAccessible(true);
                    return (CharSequence) method.invoke(this, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }, (1815369551 ^ 317276388) ^ 2128418741, null);
    }

    @Override // fr.antelop.sdk.WalletNotificationServiceCallback
    public void onEmvApplicationCredentialsUpdated(Context context) {
        short sXd = (short) (Od.Xd() ^ (1808250550 ^ (-1808251847)));
        int[] iArr = new int["6CCJ<PM".length()];
        QB qb = new QB("6CCJ<PM");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        Intrinsics.checkNotNullParameter(context, new String(iArr, 0, i2));
    }

    @Override // fr.antelop.sdk.WalletNotificationServiceCallback
    public void onLogout(Context context) {
        int iXd = FB.Xd() ^ (1578707052 ^ (-32904749));
        Intrinsics.checkNotNullParameter(context, Wg.Zd("'.\u001b\u001cz\u0007p", (short) (C1499aX.Xd() ^ ((1559440756 ^ 305197291) ^ (-1321466169))), (short) (C1499aX.Xd() ^ iXd)));
    }

    @Override // fr.antelop.sdk.WalletNotificationServiceCallback
    public void onLostEligibility(Context context) {
        Intrinsics.checkNotNullParameter(context, C1561oA.Xd("S``gYmj", (short) (C1580rY.Xd() ^ (1495364480 ^ (-1495343488)))));
    }

    @Override // fr.antelop.sdk.WalletNotificationServiceCallback
    public void onSettingsUpdated(Context context) {
        short sXd = (short) (Od.Xd() ^ (FB.Xd() ^ (-1609507907)));
        int[] iArr = new int["FSSZDXU".length()];
        QB qb = new QB("FSSZDXU");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(context, new String(iArr, 0, i2));
    }

    @Override // fr.antelop.sdk.WalletNotificationServiceCallback
    public void onSunsetScheduled(Context context, Date date) {
        int iXd = Od.Xd() ^ (-1207802158);
        short sXd = (short) (C1580rY.Xd() ^ ((2120426466 ^ 1395725499) ^ (-760372990)));
        short sXd2 = (short) (C1580rY.Xd() ^ iXd);
        int[] iArr = new int["EPNSCUP".length()];
        QB qb = new QB("EPNSCUP");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        Intrinsics.checkNotNullParameter(context, new String(iArr, 0, i2));
        int iXd2 = Od.Xd() ^ (1879443791 ^ 939234459);
        Intrinsics.checkNotNullParameter(date, hg.Vd("cd\\`Q_.J\\L", (short) (OY.Xd() ^ (13527805 ^ 13523494)), (short) (OY.Xd() ^ iXd2)));
    }

    @Override // fr.antelop.sdk.WalletNotificationServiceCallback
    public void onWalletDeleted(Context context) {
        Intrinsics.checkNotNullParameter(context, C1561oA.ud("4?=B2D?", (short) (OY.Xd() ^ ((514816660 ^ 1521843942) ^ 1142578449))));
    }

    @Override // fr.antelop.sdk.WalletNotificationServiceCallback
    public void onWalletLoaded(Context context) {
        Intrinsics.checkNotNullParameter(context, C1561oA.yd("\u001b((/\u0019-*", (short) (C1499aX.Xd() ^ ((224045524 ^ 241560455) ^ (-54490197)))));
    }

    @Override // fr.antelop.sdk.WalletNotificationServiceCallback
    public void onWalletLocked(Context context, WalletLockReason walletLockReason) {
        Intrinsics.checkNotNullParameter(context, C1561oA.Yd("\u000e\u001b\u001b\"\u0014(%", (short) (FB.Xd() ^ (453708667 ^ 453730636))));
        Intrinsics.checkNotNullParameter(walletLockReason, Xg.qd("\u000f\u0003\u007f\u0013\u0010\u0010", (short) (ZN.Xd() ^ (FB.Xd() ^ (1055129345 ^ 1628226618))), (short) (ZN.Xd() ^ (OY.Xd() ^ 69930022))));
    }

    @Override // fr.antelop.sdk.WalletNotificationServiceCallback
    public void onWalletUnlocked(Context context) {
        Intrinsics.checkNotNullParameter(context, Jg.Wd("\u0017m-}rP\r", (short) (C1499aX.Xd() ^ ((1004468800 ^ 2093721242) ^ (-1192585414))), (short) (C1499aX.Xd() ^ ((816575898 ^ 1636018649) ^ (-1361583955)))));
    }
}
