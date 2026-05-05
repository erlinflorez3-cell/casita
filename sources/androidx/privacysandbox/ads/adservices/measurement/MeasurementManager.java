package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.WebSourceParams;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerParams;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
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
/* JADX INFO: compiled from: MeasurementManager.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljA0RkP.XT2\u000f\u0002{<řc$\bCCU \u0002*\teNogtJb\u000bY\u000f\u000e\u0016~l2mkތ{,?2pnw3f\n}<žx6\u0013 z9Fz\u001d\u0001H,x\u0014\u0005}[K:\u0016vϲ/ŦQ҈̂\t\u001a \u000b\u0007/\u000f$tg|=\u000fǵ\u001cǶ.݊ɨmB\\/(Q\u000bV%F\u0003)=zo(C@e@E+a\u000f\u001fTq>1L8ݝCڋ&ݐȅMseD!\u0017\"$CO;_#*j\u0015i`:2qպ\"ؘOʫ߭{z\n\u001e\u0005\u001b\u001c\u0018?H\\/Jj\u0016!Kt!g\u0007и@\u0081Aȕѐe6%:HJ9O3f\u007fck\u001d\\J\u0014\u0005;5iя-ƈZ٪\u05f8d\u0015)lȰQ3Y@C_ݹ\u000et"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rCk0,%uaA\u0007l;\u0018^'CZ^9\\ZrF#yV\u0017J-\r\u0012/", "", "u(E", "2d[2g,+S\u001b\u0003\tm9x\u00183o\t6", "", "2d[2g0H\\\u0006~\u0007n,\u000b\u0018", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rCk0,%uaA\u0007l;\u0018U'NL]0f[_= \"Z\u001c]\u0001", "uKP;W9HW\u0018\u0012Di9\u0001\u001a+c\u00146wI\u007f\u0014!Z9\n;\u0005n1X\f D~\u001a,MQ\u0005s4\u001a#xn9\u000fc5]@\u0006GSN;`\\{*\u0014\u001ej\u000e\\:bk_K3uH@h\u00066V\fKw\u0005\u0015\u0016\u001c~HzKe\u0014P\n\u0011\u0005E3q\u001c\u001dF~CRA,1`\u0015afF7?$\u0012\u0001n", "5dc\u001aX(Lc&~\u0003^5\fd:im7wO\u0011%", "", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "@dV6f;>`\u0007\t\u000bk*|", "/sc?\\)Nb\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BRb\bzmul\u00163;", "7m_Bg\fOS\"\u000e", "\u001a`]1e6BRb\u0010~^>Fl8p\u00107[Q\u0001 &\u001d", "uKP;W9HW\u0018H\u0004^;Fx<iU\u000fwI\u007f$!KnWMz%G#a)B}%\u000e^CDz\n\u0005\u001brp@\u000bluL\u00014Q\\]0eR\u0001\u0007q\u001cc\u001dR4\u001d\u0001hE.w\u001az\u0006\r(Z}\u0005o|\u0015\u0018W\u001fguBT\u001f\u001d", "@dV6f;>`\b\f~`.|\u0016", "BqX4Z,K", "uKP;W9HW\u0018H\u0004^;Fx<iU\u000f\u0002J\u0010\u001e\u001bP9\fF\u0004/Eh\u0002)7{_\fWLJo=.\u0011weC\u00109o5{#XH\u00183X[t\u0007}\u000f_\u000eL:b", "@dV6f;>`\u000b~wL6\r\u0016-e", "@d`BX:M", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rCk0,%uaA\u0007l;\u0018h'D:X<iPr*\u0014\u0014^\u001c]8\t\u0014]K-[DC/\b:XW", "uKP;W9HW\u0018\u0012Di9\u0001\u001a+c\u00146wI\u007f\u0014!Z9\n;\u0005n1X\f D~\u001a,MQ\u0005s4\u001a#xn9\u000fc5]@\u0019GI<6l_p=\u0001\u0012\\\u0012\\:\u001a\u0001hE.w17+\u0018,W\u0011\u0011O\u0007\u0016%\u00159s:@`\u001dQ\n$yJ)v\u00107i\u0003VENr&s\u0010i&2}!)\u0010\u0003\u0015doL7\fE=\u000ewRwv=", "@dV6f;>`\u000b~wM9\u0001\u000b1e\r", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rCk0,%uaA\u0007l;\u0018h'D;[0^TrJ\u0001\u0012\\\u0012\\:\u001a\u0001hE.w17+\u0018,W\u0011\u0011", "uKP;W9HW\u0018\u0012Di9\u0001\u001a+c\u00146wI\u007f\u0014!Z9\n;\u0005n1X\f D~\u001a,MQ\u0005s4\u001a#xn9\u000fc5]@\u0019GI=9`Tt=!~Z\u0010R9\u001c\u0012UP(xM$\u001f\u0014<I\u0010J>g\u0012 \u001d<ny\fT\u001aT\u0004%\u0005E2hT#=\u0004PPIk:`\u001bc'e\u0010}\u000b\u0019m*\u00172W*\u0013}\u001dzoWyev\u001d", "\u000foX\u007f&\fQbhb\u0003i3", "\u0011n\\=T5B]\"", "/cbyT+LS&\u0010~\\,\u000b\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class MeasurementManager {
    public static final Companion Companion = new Companion(null);
    public static final int MEASUREMENT_API_STATE_DISABLED = 0;
    public static final int MEASUREMENT_API_STATE_ENABLED = 1;

    @JvmStatic
    public static final MeasurementManager obtain(Context context) {
        return Companion.obtain(context);
    }

    public abstract Object deleteRegistrations(DeletionRequest deletionRequest, Continuation<? super Unit> continuation);

    public abstract Object getMeasurementApiStatus(Continuation<? super Integer> continuation);

    public abstract Object registerSource(Uri uri, InputEvent inputEvent, Continuation<? super Unit> continuation);

    public abstract Object registerTrigger(Uri uri, Continuation<? super Unit> continuation);

    public abstract Object registerWebSource(WebSourceRegistrationRequest webSourceRegistrationRequest, Continuation<? super Unit> continuation);

    public abstract Object registerWebTrigger(WebTriggerRegistrationRequest webTriggerRegistrationRequest, Continuation<? super Unit> continuation);

    /* JADX INFO: compiled from: MeasurementManager.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Яr\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007ljA0ZeP\u008cZS@\u000fsڔ<$iByCQU\"}8\tWȞog\u0005Jb\u000bY\u000f\u000eǝ\u0001jBI]xs\u0012\u0017˰JoU3UoS9hҚ>\u0005.2*8\u007f\u0006\t\u001a8N\u0018v\u0001DS\f(0H\u0081BR#M\r\u001a\u0018\rD!\u0017Ȧ\rg|5\tycN?'\u0011iZNU`݁\u0001M\u001bH\u00152\u001dzo!C@e9չ)S\u0011\f\u001biM\tWqk\f\u0019+53as\u0006?\u001f\u007f\\/9Y%c\u0003(l\u0005\u007fl:2[YqSh\u00148y\u000b{;I2\u0019L'\u0011<;(~\b<B%vaHh\u0002\rRFz*P%6\u00189;;+f\u007fsi$~A\n\r%$3\u0003~!\ng<k[\u001b\u001d\u0006_Ei@k]~\u000egE\u0006\u0004\u001fxH*LGU\u0017G{?FG)EtQ#OtHҞ\u0003ђuݓ¾lSwl\u0011O0\n.7X%Rʆ\u0003×\u0004ߘÏXX:.\u0016=b%\u0016\bA8\r{J@=\u0010|o\u0019oxnu\f;.\u0015Y ʼ*\u0085Vުӷ75_\u0007Xx`\u001b,?jz5\\tgk\f\t|nχp̄iݘȑ\u007fD\\2[IM\u001944ZII`#P\u001b\u001epQCș\u001e̬gɭњX32+2;\u00032\u0019P\u000b\t k\u0007QD|\u000f8sۣ\u0010ۺ\u0018ğƁ&hB's\u0013\rv\u0018G\u0016P\u001eƅnטyU\u0004\u008dډ\u001a;Y/C*ê\u0003T"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rCk0,%uaA\u0007l;\u0018^'CZ^9\\ZrF#yV\u0017J-\r\u0012\u0018\u001d/r\u0012\u0005~\u001b;\u0019eCs\ba", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rCk0,%uaA\u0007l;\u0018^'CZ^9\\ZrF#yV\u0017J-\r\u0012/", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", ";LT.f<KS!~\u0004m\u0014x\u0012+g\u007f5", "\u001a`]1e6BRbzyl,\n\u001a3c\u007f6EH\u0001\u0013%W|\u000eDv.D#e 3{&;MK;tC\u0006\u0011q];\u0007p\u0002", "uKP;W9HW\u0018Hv]:|\u0016@i}(\n\n\t\u0017\u0013U\u007f\u001b<~%>hG\b7i$>ZCCk=-|dj5\tc9$:\u0018", "1n]CX9M2\u0019\u0006zm0\u0007\u0012\u001ce\f8{N\u0010", "\u001a`]1e6BRbzyl,\n\u001a3c\u007f6EH\u0001\u0013%W|\u000eDv.D#\\ >m%2WL(k@.\u0015vp\u000f", "@d`BX:M", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rCk0,%uaA\u0007l;\u0018U'NL]0f[_= \"Z\u001c]\u0001", "1n]CX9ME\u0019{hh<\n\u0007/P{5wH\u000f", "", "\u001a`]1e6BRbzyl,\n\u001a3c\u007f6EH\u0001\u0013%W|\u000eDv.D#o 4[ >ZA;V0+\u0011po\u000f", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rCk0,%uaA\u0007l;\u0018h'D:X<iPr(\u0010\u001fV\u0016\\\u0001", "1n]CX9ME\u0019{hh<\n\u0007/R\u007f4\f@\u000f&", "\u001a`]1e6BRbzyl,\n\u001a3c\u007f6EH\u0001\u0013%W|\u000eDv.D#o 4[ >ZA;X4 \u0019vpF\u0003r0X\u007f\u0014GX^,jaH", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rCk0,%uaA\u0007l;\u0018h'D:X<iPr*\u0014\u0014^\u001c]8\t\u0014]K-[DC/\b:XW", "1n]CX9ME\u0019{ik0~\u000b/rj$\t<\t%", "\u001a`]1e6BRbzyl,\n\u001a3c\u007f6EH\u0001\u0013%W|\u000eDv.D#o 4\\#2OE;x\u001f\u001a\"diG\\", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rCk0,%uaA\u0007l;\u0018h'D;[0^TrJ~\u000eg\nV9b", "1n]CX9ME\u0019{ik0~\u000b/rl(\bP\u0001%&", "\u001a`]1e6BRbzyl,\n\u001a3c\u007f6EH\u0001\u0013%W|\u000eDv.D#o 4\\#2OE;x!\u001e\u0017loH\u0014_;R\u000104LZ<\\`\u0002\u0013", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rCk0,%uaA\u0007l;\u0018h'D;[0^TrJ\u0001\u0012\\\u0012\\:\u001a\u0001hE.w17+\u0018,W\u0011\u0011", "2d[2g,+S\u001b\u0003\tm9x\u00183o\t6", "", "2d[2g0H\\\u0006~\u0007n,\u000b\u0018", "uKP;W9HW\u0018\u0012Di9\u0001\u001a+c\u00146wI\u007f\u0014!Z9\n;\u0005n1X\f D~\u001a,MQ\u0005s4\u001a#xn9\u000fc5]@\u0006GSN;`\\{*\u0014\u001ej\u000e\\:bk_K3uH@h\u00066V\fKw\u0005\u0015\u0016\u001c~HzKe\u0014P\n\u0011\u0005E3q\u001c\u001dF~CRA,1`\u0015afF7?$\u0012\u0001n", "5dc\u001aX(Lc&~\u0003^5\fd:im7wO\u0011%", "", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "@dV6f;>`\u0007\t\u000bk*|", "/sc?\\)Nb\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BRb\bzmul\u00163;", "7m_Bg\fOS\"\u000e", "\u001a`]1e6BRb\u0010~^>Fl8p\u00107[Q\u0001 &\u001d", "uKP;W9HW\u0018H\u0004^;Fx<iU\u000fwI\u007f$!KnWMz%G#a)B}%\u000e^CDz\n\u0005\u001brp@\u000bluL\u00014Q\\]0eR\u0001\u0007q\u001cc\u001dR4\u001d\u0001hE.w\u001az\u0006\r(Z}\u0005o|\u0015\u0018W\u001fguBT\u001f\u001d", "@dV6f;>`\b\f~`.|\u0016", "BqX4Z,K", "uKP;W9HW\u0018H\u0004^;Fx<iU\u000f\u0002J\u0010\u001e\u001bP9\fF\u0004/Eh\u0002)7{_\fWLJo=.\u0011weC\u00109o5{#XH\u00183X[t\u0007}\u000f_\u000eL:b", "@dV6f;>`\u000b~wL6\r\u0016-e", "uKP;W9HW\u0018\u0012Di9\u0001\u001a+c\u00146wI\u007f\u0014!Z9\n;\u0005n1X\f D~\u001a,MQ\u0005s4\u001a#xn9\u000fc5]@\u0019GI<6l_p=\u0001\u0012\\\u0012\\:\u001a\u0001hE.w17+\u0018,W\u0011\u0011O\u0007\u0016%\u00159s:@`\u001dQ\n$yJ)v\u00107i\u0003VENr&s\u0010i&2}!)\u0010\u0003\u0015doL7\fE=\u000ewRwv=", "@dV6f;>`\u000b~wM9\u0001\u000b1e\r", "uKP;W9HW\u0018\u0012Di9\u0001\u001a+c\u00146wI\u007f\u0014!Z9\n;\u0005n1X\f D~\u001a,MQ\u0005s4\u001a#xn9\u000fc5]@\u0019GI=9`Tt=!~Z\u0010R9\u001c\u0012UP(xM$\u001f\u0014<I\u0010J>g\u0012 \u001d<ny\fT\u001aT\u0004%\u0005E2hT#=\u0004PPIk:`\u001bc'e\u0010}\u000b\u0019m*\u00172W*\u0013}\u001dzoWyev\u001d", "/cbyT+LS&\u0010~\\,\u000b\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class Api33Ext5Impl extends MeasurementManager {
        private final android.adservices.measurement.MeasurementManager mMeasurementManager;

        public Api33Ext5Impl(android.adservices.measurement.MeasurementManager mMeasurementManager) {
            Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
            this.mMeasurementManager = mMeasurementManager;
        }

        public Api33Ext5Impl(Context context) throws Throwable {
            Intrinsics.checkNotNullParameter(context, C1561oA.yd("!.*1\u001f3,", (short) (C1499aX.Xd() ^ (-30830))));
            Class<?> cls = Class.forName(C1561oA.Yd("HVM\\ZUQ\u001cR__fXbi$:ggn`tq", (short) (C1633zX.Xd() ^ (-15318))));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (Od.Xd() ^ (-1086));
            short sXd2 = (short) (Od.Xd() ^ (-17083));
            int[] iArr = new int["\u007fw\u000eyG\u0007|\u000b\u0005Lb\r\u0003\u0016\u0017".length()];
            QB qb = new QB("\u007fw\u000eyG\u0007|\u000b\u0005Lb\r\u0003\u0016\u0017");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = {android.adservices.measurement.MeasurementManager.class};
            Method method = cls.getMethod(Jg.Wd("<w+zH#H$Y$x+ 9\u001c;", (short) (C1499aX.Xd() ^ (-3438)), (short) (C1499aX.Xd() ^ (-20540))), clsArr);
            try {
                method.setAccessible(true);
                Object objInvoke = method.invoke(context, objArr);
                Intrinsics.checkNotNullExpressionValue(objInvoke, ZO.xd("t<I_R-:E>Ae\u0018\u001e\u0017E\u0016\u0019\u0015lQ\r=3}㖔\u001fz\u001c\u000b_[\"Dy8vA\u0013E\u001f0Wj\u001e=+V\u001d\\8", (short) (OY.Xd() ^ 21949), (short) (OY.Xd() ^ 17855)));
                this((android.adservices.measurement.MeasurementManager) objInvoke);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        public final android.adservices.measurement.DeletionRequest convertDeletionRequest(DeletionRequest deletionRequest) {
            android.adservices.measurement.DeletionRequest deletionRequestBuild = new DeletionRequest.Builder().setDeletionMode(deletionRequest.getDeletionMode()).setMatchBehavior(deletionRequest.getMatchBehavior()).setStart(deletionRequest.getStart()).setEnd(deletionRequest.getEnd()).setDomainUris(deletionRequest.getDomainUris()).setOriginUris(deletionRequest.getOriginUris()).build();
            Intrinsics.checkNotNullExpressionValue(deletionRequestBuild, "Builder()\n              …\n                .build()");
            return deletionRequestBuild;
        }

        public final android.adservices.measurement.WebSourceRegistrationRequest convertWebSourceRequest(WebSourceRegistrationRequest webSourceRegistrationRequest) {
            android.adservices.measurement.WebSourceRegistrationRequest webSourceRegistrationRequestBuild = new WebSourceRegistrationRequest.Builder(convertWebSourceParams(webSourceRegistrationRequest.getWebSourceParams()), webSourceRegistrationRequest.getTopOriginUri()).setWebDestination(webSourceRegistrationRequest.getWebDestination()).setAppDestination(webSourceRegistrationRequest.getAppDestination()).setInputEvent(webSourceRegistrationRequest.getInputEvent()).setVerifiedDestination(webSourceRegistrationRequest.getVerifiedDestination()).build();
            Intrinsics.checkNotNullExpressionValue(webSourceRegistrationRequestBuild, "Builder(\n               …\n                .build()");
            return webSourceRegistrationRequestBuild;
        }

        private final List<android.adservices.measurement.WebSourceParams> convertWebSourceParams(List<WebSourceParams> list) {
            ArrayList arrayList = new ArrayList();
            for (WebSourceParams webSourceParams : list) {
                android.adservices.measurement.WebSourceParams webSourceParamsBuild = new WebSourceParams.Builder(webSourceParams.getRegistrationUri()).setDebugKeyAllowed(webSourceParams.getDebugKeyAllowed()).build();
                Intrinsics.checkNotNullExpressionValue(webSourceParamsBuild, "Builder(param.registrati…                 .build()");
                arrayList.add(webSourceParamsBuild);
            }
            return arrayList;
        }

        public final android.adservices.measurement.WebTriggerRegistrationRequest convertWebTriggerRequest(WebTriggerRegistrationRequest webTriggerRegistrationRequest) {
            android.adservices.measurement.WebTriggerRegistrationRequest webTriggerRegistrationRequestBuild = new WebTriggerRegistrationRequest.Builder(convertWebTriggerParams(webTriggerRegistrationRequest.getWebTriggerParams()), webTriggerRegistrationRequest.getDestination()).build();
            Intrinsics.checkNotNullExpressionValue(webTriggerRegistrationRequestBuild, "Builder(\n               …\n                .build()");
            return webTriggerRegistrationRequestBuild;
        }

        private final List<android.adservices.measurement.WebTriggerParams> convertWebTriggerParams(List<WebTriggerParams> list) {
            ArrayList arrayList = new ArrayList();
            for (WebTriggerParams webTriggerParams : list) {
                android.adservices.measurement.WebTriggerParams webTriggerParamsBuild = new WebTriggerParams.Builder(webTriggerParams.getRegistrationUri()).setDebugKeyAllowed(webTriggerParams.getDebugKeyAllowed()).build();
                Intrinsics.checkNotNullExpressionValue(webTriggerParamsBuild, "Builder(param.registrati…                 .build()");
                arrayList.add(webTriggerParamsBuild);
            }
            return arrayList;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        public Object deleteRegistrations(DeletionRequest deletionRequest, Continuation<? super Unit> continuation) throws Throwable {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            this.mMeasurementManager.deleteRegistrations(convertDeletionRequest(deletionRequest), new AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0(), OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        public Object registerSource(Uri uri, InputEvent inputEvent, Continuation<? super Unit> continuation) throws Throwable {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            this.mMeasurementManager.registerSource(uri, inputEvent, new AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0(), OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        public Object registerTrigger(Uri uri, Continuation<? super Unit> continuation) throws Throwable {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            this.mMeasurementManager.registerTrigger(uri, new AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0(), OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        public Object registerWebSource(WebSourceRegistrationRequest webSourceRegistrationRequest, Continuation<? super Unit> continuation) throws Throwable {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            this.mMeasurementManager.registerWebSource(convertWebSourceRequest(webSourceRegistrationRequest), new AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0(), OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        public Object registerWebTrigger(WebTriggerRegistrationRequest webTriggerRegistrationRequest, Continuation<? super Unit> continuation) throws Throwable {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            this.mMeasurementManager.registerWebTrigger(convertWebTriggerRequest(webTriggerRegistrationRequest), new AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0(), OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        public Object getMeasurementApiStatus(Continuation<? super Integer> continuation) throws Throwable {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            this.mMeasurementManager.getMeasurementApiStatus(new AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0(), OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        }
    }

    /* JADX INFO: compiled from: MeasurementManager.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005\"4\u0012\u000e\u0007nʑA0ZeP\u008cXݾ+%ӆ,4RZdvI;ڈ\u001e}0\t\u0018^uk\u0007Lp\nq\u00146\u001a\u0007pDI\u0004\u007f$\u0017_>PpW3{q\u0014ʧ3ҽ:\u0005(݅rD\b\b\u0019\u001aXJf͓MŲO\f\u001aؓϴtB"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rCk0,%uaA\u0007l;\u0018^'CZ^9\\ZrF#yV\u0017J-\r\u0012\u0018\u001f.vO3(\f6RW", "", "u(E", "\u001bD0 H\u0019\u001e;xgiX\bgl)Sn\u0004j zuz5Kj#V\u0004", "", "\u001bD0 H\u0019\u001e;xgiX\bgl)Sn\u0004j zv\u007f#Lt\u001cU", "=ac.\\5", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rCk0,%uaA\u0007l;\u0018^'CZ^9\\ZrF#yV\u0017J-\r\u0012/", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/cbyT+LS&\u0010~\\,\u000b\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MeasurementManager obtain(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String str = "AdServicesInfo.version=" + AdServicesInfo.INSTANCE.version();
            if (AdServicesInfo.INSTANCE.version() >= 5) {
                return new Api33Ext5Impl(context);
            }
            return null;
        }
    }
}
