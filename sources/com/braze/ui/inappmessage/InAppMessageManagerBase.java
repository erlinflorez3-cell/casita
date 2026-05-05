package com.braze.ui.inappmessage;

import android.app.Activity;
import android.content.Context;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageAnimationFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageFullViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageHtmlFullViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageHtmlViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageModalViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageSlideupViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageViewWrapperFactory;
import com.braze.ui.inappmessage.listeners.DefaultHtmlInAppMessageActionListener;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageManagerListener;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener;
import com.braze.ui.inappmessage.listeners.IHtmlInAppMessageActionListener;
import com.braze.ui.inappmessage.listeners.IInAppMessageManagerListener;
import com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яb\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u000e\u0007nj?1Le^.ZS0\u0011s{J$cҕyCQU\"}(\tWN}gvϺb\u000bY\u000f\u000e\u0016~l4Ic\u0002e\u0012\u0015HJoU3UoCChtL\u0005(2(8\u0002\u0005\u000f\u001a2H\u0016\u007f\u0001WaÈB0nozUҫQ\u0005(\u0012NN.@6^}Md\\\u001daHo;\u0003\u0018\u0004\u0015;(@\u000b\u0010%Hj&;\u000b\u0012\"9\u0001O5Cf\u001a\u0017O`i\u0003\u001b? \u00025l5lCI\"r|lH\"#qg\r\f7V`\u0013\u0019x\fUF\u0016w\u0014`\u001cp\u0010z*Ql\n\u001c2?JD,HpN\"{\u0005\u0001\u001dXP0#r\u0006\t\u0004N\u0019;~a:\u007f//ao\u00061Ne@5\u0013,H\u0019p7Z\u0003\u001f')cd\u0006\u001dIQn\u0002xT\u0018\u0006Uo\u001ao\u0011\fp\u0018xW\u000e{\u0014\u0011\\[U=i\u0007;#\u0002\u0001vX.\u000bMpv\"\u0002Rv\u0005Rt$gB\u000b\"YrzK\u007f!hf-)O2S5\u007f>gvϖy˶%)(PUkwn\u001eq\u0018*GhMX\u001dqD,\u0010ӫ5̳Ug(cX}\"G\rt\u0013a~B\u0002\u0016\u00111~φ4ʮn\u0014\u0010}JY\u001a\u001f\u0003M\u007f)L.G\u0018\u000b\u001f\u001fҔ*նE|\u0011ݠ+v\u001e\rl5:\u0002\u00183Kժ\r˩`pwΟIW:\rx$C@\u007fFoĢaɋl4\u0005ȽW\r\u0002\u0012_ibFzvl߲aދ$\u0016\"ߙ\"=K&'\u0001?10A\u001cɦ~ϯUM\u001a\u05fdK\u000b\b$SjDf6\u0001GݝlʧNO\\ϟr\u0003l\n;\b\u0013\u000fPӖHیKc\\ެ,JW\u000b\u001bYjX\u000fً\u0007ȷ\"%\tǻr\tCF['K,NҤ1ֵe]q۰~\fp)>t\u0014\u001fb8l̈dжa6S:Ou\r[r0z!ZH\u0019\u0013^Ⱥ\u0015Ό\u00113PШ5\u0003dWe\u000b]\u0019\u001d[\u0003ޏrÆ_>+q\u0004T<|z\u007fQ\u001f,^q@g߀_ܭqmSŌ[\\\u001d,#{_}Hp\u0014։X͓f\rH\by;De\ft\u0013a!$b=r\\aͦVɎ\n\u0014\u0013\u0002L\u0006\u001d>\u0003N\u0002cn\u000e\u0003\n3ƊJϖdEhԠz\r\r8K\u001e'I\b܍oܑX/kѢQ_+33j}\u0013=ފ-\u05ffX9#ι)\r\u0019puCw\u0016\rߧIԆqkwȯ\t*\u000bIZ\u0018IC\be6ے2Ϳ\u000fY|Pj$ r#Z0W\u0017z+\"\u0013\u0000\u0011Ո\u001dOzŷ39Z}\u00107q.WӂFͫ\u000b\f\u0005ݭ\u0017-;6M-k_!h}يYĺ?\u0002 \"&X\u0012'qheA~\n\fO\u0011φsїf\u0002\u0011ސ!2\u0012cbt!%d]\rе\u0004ג\u0006\u0017v[q-/]wCz<ZM~w8e#e-WaӌrܕZ\u007fv߲`\u001f\u000f^[.cphr)U6W?\u0006J\u0017d!\rʐnЍ\u0014Uk֬\u0001mU\u0015\u001b+\u007f\u000e8\u001dI0\u00019.#\b0\u001c*\u0003CS\u0010-\u05fdJŜ\rht܀o\u0010d'6\u0002\u0015\u000e/Q\u000b=Ņb`"}, d2 = {"\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoW \u007f\u0001@de E{\u00120M+7t0 \u0015u>5\u0015c\u0002", "", "u(E", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "5dc\u000eV;Bd\u001d\u000e\u000f", "u(;.a+K]\u001d}DZ7\bR\u000bc\u000f,\rD\u0010+l", "/o_9\\*:b\u001d\t\u0004<6\u0006\u0018/x\u000f", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "5dc\u000ec7EW\u0017z\nb6\u0006f9n\u000f(\u000fO", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fqYJ\n&\u0017Z~c", "1n]Ae6E7\"Z\u0006i\u0014|\u0017=a\u0002(c<\n\u0013\u0019G|t@\u000545b}-", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWCz3DY\u0007 D{_\u00121L\u0017v?\u0006\u0015vo5\tc\u0014J\u007f#IL[\u0013``\u0002=\u001d\u0012gc", "5dc\u0010b5M`#\u0006^g\b\b\u0014\u0017e\u000e6wB\u0001~\u0013Pk\u0010<\u0004\f9g\r @m#", "u(;0b4\bP&z\u0010^u\r\rxi\t$\u0007K\t\u0017%Uk\u0010<@,9g\r @m#<\u0017'\u001ft\u0010) PaG\u0015_.N^#PHP,i9vK#\u0012c\u000e[\u0001", "1tbAb4\u001c]\"\u000e\bh3`\u0012\u000bp\u000b\u0010{N\u000f\u0013\u0019GW\nEr'5fd$E|\u00167MP", "1tbAb4!b!\u0006^g\b\b\u0014\u0017e\u000e6wB\u0001r\u0015Vs\u0018E])Ch})7z", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWCz3DY\u0007 D{_\u00120RCr\u0018'psl!\u0007q:Jx'#J]0f[YA\"!Z\u0017N8b", "1tbAb4\"\\t\n\u0006F,\u000b\u0017+g\u007f\u0004\u0005D\t\u0013&Ky\u0017\u001dr#Dc\u000b4", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoW Z.\u0011d\t\b7{$*OC\u0017t8&\u0011weC\u0010D(L\u00061T`$", "1tbAb4\"\\t\n\u0006F,\u000b\u0017+g\u007f\u0010wI|\u0019\u0017TV\u0012J\u0006%>Y\u000b", "1tbAb4\"\\t\n\u0006F,\u000b\u0017+g\u007f\u0019\u007f@\u0013w\u0013E~\u0018I\u000b", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoW Z.\u0011d\t\b7{$*OC,o40ud_H\u0011p@$", "1tbAb4\"\\t\n\u0006F,\u000b\u0017+g\u007f\u0019\u007f@\u0013\t$Cz\u0019<\u0004\u00061W\r*D\u0002", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoW Z.\u0011d\t\b7{$*OC,o40\u0007u]D\u0012c9/r%VV[@2", "2dU.h3M6(\u0007\u0002B5X\u0014:M\u007f6\n<\u0003\u0017rE~\u0012F\u007f\f9g\r @m#", "2dU.h3M7\"Z\u0006i\u0014|\u0017=a\u0002(c<\n\u0013\u0019G|t@\u000545b}-", "2dU.h3M7\"Z\u0006i\u0014|\u0017=a\u0002(lD\u0001)\tTk\u0019Gv2\u0016U{/Az*", "2nT@5(<Yu\u000f\nm6\u0006g3s\b,\nNd rRzu<\u000531[}\u0011;m(", "", "5dc\u0011b,L0\u0015|\u0001;<\f\u00189n^,\nH\u0005%%+xiG\u0002\r5g\f\u001c9m\u00072MU", "u(I", "2nT@5(<Yu\u000f\nm6\u0006g3s\b,\nNd rRzu<\u000531[}\u0011;m(\u000fQCBj", "2nT@63BQ\u001fh\u000bm:\u0001\b/M\n'wGq\u001b\u0017YN\u0012J~)Cga)\u0013x!\u0016MQIg6\u001e\u0006laK", "5dc\u0011b,L1 \u0003xd\u0016\r\u0018=i~(cJ\u007f\u0013\u001e8s\u000eNU)Ca\u0002.EQ\u001f\nXN#kB,\u0011ja*\u000bc>", "2nT@63BQ\u001fh\u000bm:\u0001\b/M\n'wGq\u001b\u0017YN\u0012J~)Cga)\u0013x!\u0016MQIg6\u001e\u0006laKgg,Uu", "6s\\9<5\u001a^$fzl:x\u000b/A}7\u007fJ\n}\u001bU~\u000eEv2", "5dc\u0015g4E7\"Z\u0006i\u0014|\u0017=a\u0002(W>\u0010\u001b!PV\u0012J\u0006%>Y\u000b", "u(;0b4\bP&z\u0010^u\r\rxi\t$\u0007K\t\u0017%Uk\u0010<@,9g\r @m#<\u0017'\u001ez<%xq=D\u0012K,\\\u0005#IL**kV|Fz\u0016h\u001dN4\r\u0012/", "7m0=c\u0014>a'z|^\b\u0006\r7a\u000f,\u0006Ia\u0013\u0015Vy\u001bP", "5dc\u0016a\bI^\u0001~\tl(~\t\u000bn\u00040wO\u0005! (k\fK\u00012I", "u(;0b4\bP&z\u0010^u\r\rxi\t$\u0007K\t\u0017%Uk\u0010<@\t\u0019bY+BU\u0016<[?=k\u0010'\u0019p]H\u000bm5/r%VV[@2", "7m0=c\u0014>a'z|^\b\u0006\r7a\u000f,\u0006Ia\u0013\u0015Vy\u001bPW)5`|", "7m0=c\u0014>a'z|^\r\r\u00106V\u0004(\u000e!|\u0015&Q|\"", "7m0=c\u0014>a'z|^\u000f\f\u00116F\u0010/\u00031\u0005\u0017)(k\fK\u00012I", "7m0=c\u0014>a'z|^\u000f\f\u00116V\u0004(\u000e!|\u0015&Q|\"", "7m0=c\u0014>a'z|^\u0014x\u0012+g\u007f5bD\u000f&\u0017Po\u001b", "5dc\u0016a\bI^\u0001~\tl(~\t\u0017a\t$}@\u000e}\u001bU~\u000eEv2", "7m0=c\u0014>a'z|^\u0014\u0007\b+lp,{Ra\u0013\u0015Vy\u001bP", "7m0=c\u0014>a'z|^\u001a\u0004\r.e\u00103lD\u0001)wCm\u001dF\u00049", "7m0=c\u0014>a'z|^\u001d\u0001\tAW\r$\u0007K\u0001$wCm\u001dF\u00049", "5dc\u0016a\bI^\u0001~\tl(~\t i\u007f:mM|\"\"G|n8t4?f\u0012", "u(;0b4\bP&z\u0010^u\r\rxi\t$\u0007K\t\u0017%Uk\u0010<@\t\u0019bY+BU\u0016<[?=k%\"\u0015zSF\u0003n7N\u0004\bCJ]6ifH", "7m0=c\u0014>a'z|^\u001e|\u0006 i\u007f:YG\u0005\u0017 VV\u0012J\u0006%>Y\u000b", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWCz3DY\u0007 D{_\u00121L\u0017v?\u0006\u0015vo5\tc\u001eNs\u0018KL`\ncVrF#x^\u001c]+\u0016\u0005f\u0017", "7r00g0OW(\u0013h^;", ";@RA\\=Bb-", "5dc\u001a4*MW*\u0003\nrjx\u00128o\u000f$\u000bD\u000b %", ";@_=_0<O(\u0003\u0005g\n\u0007\u0012>e\u00137", "5dc\u001a47IZ\u001d|vm0\u0007\u0012\ro\t7{S\u0010U\u0013Px\u0018Kr49c\u0007.", "Ag^B_+,Y\u001d\n", "Ag^B_+'S,\u000ejg9|\u000b3s\u000f(\t\u001d\u0001\u0005\u001dKz\u0019<u", "5dc [6NZ\u0018gzq;l\u0012<e\u0002,\nO\u0001$sG]\u0014@\u000205X", "Adc [6NZ\u0018gzq;l\u0012<e\u0002,\nO\u0001$sG]\u0014@\u000205X", "uY\u0018#", "5dc\u0011X-:c \u000e^g\b\b\u0014\u0017e\u000e6wB\u0001\b\u001bG\u0002n8t4?f\u0012", "7m0=c\u0014>a'z|^", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001ej", "5dc\u0016a\bI^\u0001~\tl(~\t i\u007f:\\<~&!T\u0004", "Adc\u000fT*D0)\u000e\nh5[\r=m\u00046\n@\u000fz #z\u0019$v3CU\u007f (q\u0016@", "", "0`R85<Mb#\bYb:\u0005\r=s\u007f6_I\\\"\"/o\u001cJr'5J\u0002 I", "Adc\u0010_0<Y\u0003\u000f\nl0{\t\u0017o~$\u00031\u0005\u0017)&s\u001cDz3C=\u0007{Bx}.[Q7m4\u000f\u0019hs", "2nT@70L[\u001d\r\t", "Adc\u0010h:M]!\\\u0005g;\n\u00136I\t\u0004\u0007Kh\u0017%Uk\u0010<^!>U\u007f DT\u001a<\\CDkA", "Adc\u0010h:M]!a\nf3`\u0012\u000bp\u000b\u0010{N\u000f\u0013\u0019GK\fKz/>@\u0002.Fm\u001f.Z", "Adc\u0010h:M]!b\u0004:7\bp/s\u000e$}@\\ \u001bOk\u001d@\u0001.\u0016U{/Az*", "Adc\u0010h:M]!b\u0004:7\bp/s\u000e$}@h\u0013 Cq\u000eI])Ch})7z", "Adc\u0010h:M]!b\u0004:7\bp/s\u000e$}@q\u001b\u0017YP\n:\u0006/Bm", "7m0=c\u0014>a'z|^\u001d\u0001\tAF{&\u000bJ\u000e+", "Adc\u0010h:M]!b\u0004:7\bp/s\u000e$}@q\u001b\u0017Ya\u001b8\u000205f^\u001c5| ;a", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class InAppMessageManagerBase {
    private IInAppMessageManagerListener customControlInAppMessageManagerListener;
    private IHtmlInAppMessageActionListener customHtmlInAppMessageActionListener;
    private IInAppMessageAnimationFactory customInAppMessageAnimationFactory;
    private IInAppMessageManagerListener customInAppMessageManagerListener;
    private IInAppMessageViewFactory customInAppMessageViewFactory;
    private IInAppMessageViewWrapperFactory customInAppMessageViewWrapperFactory;
    private final IHtmlInAppMessageActionListener defaultHtmlInAppMessageActionListener;
    private final IInAppMessageManagerListener defaultInAppMessageManagerListener;
    private final IInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory;
    private boolean doesBackButtonDismissInAppMessageViewField = true;
    private boolean doesClickOutsideModalViewDismissInAppMessageViewField;
    private final IInAppMessageAnimationFactory inAppMessageAnimationFactoryField;
    private final IInAppMessageViewFactory inAppMessageFullViewFactory;
    private final IInAppMessageViewFactory inAppMessageHtmlFullViewFactory;
    private final IInAppMessageViewFactory inAppMessageHtmlViewFactory;
    private final IInAppMessageViewFactory inAppMessageModalViewFactory;
    private final IInAppMessageViewFactory inAppMessageSlideupViewFactory;
    private final IInAppMessageWebViewClientListener inAppMessageWebViewClientListener;
    protected Activity mActivity;
    protected Context mApplicationContext;
    private boolean shouldNextUnregisterBeSkipped;

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageType.values().length];
            try {
                iArr[MessageType.SLIDEUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageType.MODAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageType.FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageType.HTML_FULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MessageType.HTML.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.InAppMessageManagerBase$getDefaultInAppMessageViewFactory$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<String> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to find view factory for in-app message with type: " + iInAppMessage.getMessageType();
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.InAppMessageManagerBase$setBackButtonDismissesInAppMessageView$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10191 extends Lambda implements Function0<String> {
        final /* synthetic */ boolean $backButtonDismissesInAppMessageView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10191(boolean z2) {
            super(0);
            z = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "In-App Message back button dismissal set to " + z;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.InAppMessageManagerBase$setClickOutsideModalViewDismissInAppMessageView$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10201 extends Lambda implements Function0<String> {
        final /* synthetic */ boolean $doesDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10201(boolean z2) {
            super(0);
            z = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Modal In-App Message outside tap dismissal set to " + z;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.InAppMessageManagerBase$setCustomControlInAppMessageManagerListener$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10211 extends Lambda implements Function0<String> {
        public static final C10211 INSTANCE = ;

        C10211() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Custom ControlInAppMessageManagerListener set. This listener will only be used for control in-app messages.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.InAppMessageManagerBase$setCustomHtmlInAppMessageActionListener$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10221 extends Lambda implements Function0<String> {
        public static final C10221 INSTANCE = ;

        C10221() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Custom htmlInAppMessageActionListener set";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.InAppMessageManagerBase$setCustomInAppMessageAnimationFactory$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10231 extends Lambda implements Function0<String> {
        public static final C10231 INSTANCE = ;

        C10231() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Custom InAppMessageAnimationFactory set";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.InAppMessageManagerBase$setCustomInAppMessageManagerListener$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10241 extends Lambda implements Function0<String> {
        public static final C10241 INSTANCE = ;

        C10241() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Custom InAppMessageManagerListener set";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.InAppMessageManagerBase$setCustomInAppMessageViewFactory$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10251 extends Lambda implements Function0<String> {
        public static final C10251 INSTANCE = ;

        C10251() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Custom InAppMessageViewFactory set";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.InAppMessageManagerBase$setCustomInAppMessageViewWrapperFactory$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10261 extends Lambda implements Function0<String> {
        public static final C10261 INSTANCE = ;

        C10261() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Custom IInAppMessageViewWrapperFactory set";
        }
    }

    public InAppMessageManagerBase() {
        DefaultInAppMessageWebViewClientListener defaultInAppMessageWebViewClientListener = new DefaultInAppMessageWebViewClientListener();
        this.inAppMessageWebViewClientListener = defaultInAppMessageWebViewClientListener;
        this.defaultHtmlInAppMessageActionListener = new DefaultHtmlInAppMessageActionListener();
        this.inAppMessageSlideupViewFactory = new DefaultInAppMessageSlideupViewFactory();
        this.inAppMessageModalViewFactory = new DefaultInAppMessageModalViewFactory();
        this.inAppMessageFullViewFactory = new DefaultInAppMessageFullViewFactory();
        this.inAppMessageHtmlFullViewFactory = new DefaultInAppMessageHtmlFullViewFactory(defaultInAppMessageWebViewClientListener);
        this.inAppMessageHtmlViewFactory = new DefaultInAppMessageHtmlViewFactory(defaultInAppMessageWebViewClientListener);
        this.inAppMessageAnimationFactoryField = new DefaultInAppMessageAnimationFactory();
        this.defaultInAppMessageManagerListener = new DefaultInAppMessageManagerListener();
        this.defaultInAppMessageViewWrapperFactory = new DefaultInAppMessageViewWrapperFactory();
    }

    protected static /* synthetic */ void getMActivity$annotations() {
    }

    protected static /* synthetic */ void getMApplicationContext$annotations() {
    }

    public Activity getActivity() {
        return this.mActivity;
    }

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public IInAppMessageManagerListener getControlInAppMessageManagerListener() {
        IInAppMessageManagerListener iInAppMessageManagerListener = this.customControlInAppMessageManagerListener;
        return iInAppMessageManagerListener == null ? this.defaultInAppMessageManagerListener : iInAppMessageManagerListener;
    }

    public IInAppMessageViewFactory getDefaultInAppMessageViewFactory(IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        int i2 = WhenMappings.$EnumSwitchMapping$0[inAppMessage.getMessageType().ordinal()];
        if (i2 == 1) {
            return this.inAppMessageSlideupViewFactory;
        }
        if (i2 == 2) {
            return this.inAppMessageModalViewFactory;
        }
        if (i2 == 3) {
            return this.inAppMessageFullViewFactory;
        }
        if (i2 == 4) {
            return this.inAppMessageHtmlFullViewFactory;
        }
        if (i2 == 5) {
            return this.inAppMessageHtmlViewFactory;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.InAppMessageManagerBase.getDefaultInAppMessageViewFactory.1
            AnonymousClass1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Failed to find view factory for in-app message with type: " + iInAppMessage.getMessageType();
            }
        }, 6, (Object) null);
        return null;
    }

    public boolean getDoesBackButtonDismissInAppMessageView() {
        return this.doesBackButtonDismissInAppMessageViewField;
    }

    public boolean getDoesClickOutsideModalViewDismissInAppMessageView() {
        return this.doesClickOutsideModalViewDismissInAppMessageViewField;
    }

    public IHtmlInAppMessageActionListener getHtmlInAppMessageActionListener() {
        IHtmlInAppMessageActionListener iHtmlInAppMessageActionListener = this.customHtmlInAppMessageActionListener;
        return iHtmlInAppMessageActionListener == null ? this.defaultHtmlInAppMessageActionListener : iHtmlInAppMessageActionListener;
    }

    public IInAppMessageAnimationFactory getInAppMessageAnimationFactory() {
        IInAppMessageAnimationFactory iInAppMessageAnimationFactory = this.customInAppMessageAnimationFactory;
        return iInAppMessageAnimationFactory == null ? this.inAppMessageAnimationFactoryField : iInAppMessageAnimationFactory;
    }

    public IInAppMessageManagerListener getInAppMessageManagerListener() {
        IInAppMessageManagerListener iInAppMessageManagerListener = this.customInAppMessageManagerListener;
        return iInAppMessageManagerListener == null ? this.defaultInAppMessageManagerListener : iInAppMessageManagerListener;
    }

    public IInAppMessageViewFactory getInAppMessageViewFactory(IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        IInAppMessageViewFactory iInAppMessageViewFactory = this.customInAppMessageViewFactory;
        return iInAppMessageViewFactory == null ? getDefaultInAppMessageViewFactory(inAppMessage) : iInAppMessageViewFactory;
    }

    public IInAppMessageViewWrapperFactory getInAppMessageViewWrapperFactory() {
        IInAppMessageViewWrapperFactory iInAppMessageViewWrapperFactory = this.customInAppMessageViewWrapperFactory;
        return iInAppMessageViewWrapperFactory == null ? this.defaultInAppMessageViewWrapperFactory : iInAppMessageViewWrapperFactory;
    }

    public boolean getShouldNextUnregisterBeSkipped() {
        return this.shouldNextUnregisterBeSkipped;
    }

    public boolean isActivitySet() {
        return getActivity() != null;
    }

    public void setBackButtonDismissesInAppMessageView(boolean z2) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.InAppMessageManagerBase.setBackButtonDismissesInAppMessageView.1
            final /* synthetic */ boolean $backButtonDismissesInAppMessageView;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10191(boolean z22) {
                super(0);
                z = z22;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "In-App Message back button dismissal set to " + z;
            }
        }, 7, (Object) null);
        this.doesBackButtonDismissInAppMessageViewField = z22;
    }

    public void setClickOutsideModalViewDismissInAppMessageView(boolean z2) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.InAppMessageManagerBase.setClickOutsideModalViewDismissInAppMessageView.1
            final /* synthetic */ boolean $doesDismiss;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10201(boolean z22) {
                super(0);
                z = z22;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Modal In-App Message outside tap dismissal set to " + z;
            }
        }, 7, (Object) null);
        this.doesClickOutsideModalViewDismissInAppMessageViewField = z22;
    }

    public void setCustomControlInAppMessageManagerListener(IInAppMessageManagerListener iInAppMessageManagerListener) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C10211.INSTANCE, 7, (Object) null);
        this.customControlInAppMessageManagerListener = iInAppMessageManagerListener;
    }

    public void setCustomHtmlInAppMessageActionListener(IHtmlInAppMessageActionListener iHtmlInAppMessageActionListener) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C10221.INSTANCE, 7, (Object) null);
        this.customHtmlInAppMessageActionListener = iHtmlInAppMessageActionListener;
    }

    public void setCustomInAppMessageAnimationFactory(IInAppMessageAnimationFactory iInAppMessageAnimationFactory) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C10231.INSTANCE, 7, (Object) null);
        this.customInAppMessageAnimationFactory = iInAppMessageAnimationFactory;
    }

    public void setCustomInAppMessageManagerListener(IInAppMessageManagerListener iInAppMessageManagerListener) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C10241.INSTANCE, 7, (Object) null);
        this.customInAppMessageManagerListener = iInAppMessageManagerListener;
    }

    public void setCustomInAppMessageViewFactory(IInAppMessageViewFactory iInAppMessageViewFactory) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C10251.INSTANCE, 7, (Object) null);
        this.customInAppMessageViewFactory = iInAppMessageViewFactory;
    }

    public void setCustomInAppMessageViewWrapperFactory(IInAppMessageViewWrapperFactory iInAppMessageViewWrapperFactory) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C10261.INSTANCE, 7, (Object) null);
        this.customInAppMessageViewWrapperFactory = iInAppMessageViewWrapperFactory;
    }

    public void setShouldNextUnregisterBeSkipped(final boolean z2) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.InAppMessageManagerBase$shouldNextUnregisterBeSkipped$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Setting setShouldNextUnregisterBeSkipped to " + z2;
            }
        }, 7, (Object) null);
        this.shouldNextUnregisterBeSkipped = z2;
    }
}
