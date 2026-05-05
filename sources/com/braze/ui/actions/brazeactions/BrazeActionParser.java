package com.braze.ui.actions.brazeactions;

import android.content.Context;
import android.net.Uri;
import com.braze.enums.Channel;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.ui.actions.brazeactions.steps.AddToCustomAttributeArrayStep;
import com.braze.ui.actions.brazeactions.steps.AddToSubscriptionGroupStep;
import com.braze.ui.actions.brazeactions.steps.ContainerStep;
import com.braze.ui.actions.brazeactions.steps.IBrazeActionStep;
import com.braze.ui.actions.brazeactions.steps.LogCustomEventStep;
import com.braze.ui.actions.brazeactions.steps.NoOpStep;
import com.braze.ui.actions.brazeactions.steps.OpenLinkExternallyStep;
import com.braze.ui.actions.brazeactions.steps.OpenLinkInWebViewStep;
import com.braze.ui.actions.brazeactions.steps.RemoveFromCustomAttributeArrayStep;
import com.braze.ui.actions.brazeactions.steps.RemoveFromSubscriptionGroupStep;
import com.braze.ui.actions.brazeactions.steps.RequestPushPermissionStep;
import com.braze.ui.actions.brazeactions.steps.SetCustomUserAttributeStep;
import com.braze.ui.actions.brazeactions.steps.SetEmailSubscriptionStep;
import com.braze.ui.actions.brazeactions.steps.SetPushNotificationSubscriptionStep;
import com.braze.ui.actions.brazeactions.steps.StepData;
import io.sentry.rrweb.RRWebVideoEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.EO;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Od;
import yg.QB;
import yg.Xu;

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
@Metadata(bv = {}, d1 = {"ЯT\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005#4\u0012\u0006\u0007nʑA0ZeP\u008cZS@\u000fsڔ<$q$yّCU0}*ޛWN}gvJ`\rK\u000f\u001c\u0016\u0001j2J]xs\u0012\u00172HoG3[xE9ft<ԓ HĲhy3\u007fR)eP{\u0001Cƚ\u0010\u0012>@9X`\u0012e\u0005H\u00186B.\b6\\\u0016VfLzfR/Q\r\u001aHT'm;\u0015M;R\u001d:\u001b\u0004y\u001eYNg9#4k\u00035b\"ΪƄCqC\u00161B5=as\u0006<\t\u0004\"\u001cCO;e#*j\u0014i`:7qՒӍOP\u0014;@\u000e\n!T\u0004<\u001bWL<C2f6\u0010yοɤW@V\u0019'_\u000e\u0013yD''\u00103Y;+haai.d6*\u001e5\u001eQ\u000b5ďƟX\u000ef/c^\u0006lIQnYpP XkwT|p\u0003B\u0004^IV߽N 2\u0017-ڛ,E1$\u0004\u0002vF>ϻW¾lSqɭ\u0019L0r.7X\u000bbɯ\u0017\u0081\tkXӹй0/"}, d2 = {"\u001ab^:\")KO.~Dn0F\u0005-t\u00042\u0005NJ\u0014$C\u0005\u000e8t49c\u0007.\u0001J#*bC\u0017iC\"\u001fqL5\u0014q,[L", "", "u(E", "\u0010Q0'8&\u001a1\bbdG\u001avv\rH_\u0010[", "", "\u0010Q0'8&\u001a1\bbdG\u001avyz", "\"X?\u0012", "3wT0h;>", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "CqX", "\u001a`]1e6BRb\bzmul\u00163;", "1gP;a,E", "\u001ab^:\")KO.~D^5\r\u0011=/]+wI\n\u0017\u001e\u001d", "5dc\u000eV;B]\"m\u000fi,", "\u001ab^:\")KO.~Dn0F\u0005-t\u00042\u0005NJ\u0014$C\u0005\u000e8t49c\u0007.\u0001J#*bC\u0017iC\"\u001fqL5\u0014q,[5\u0003E[R6eA\u0007H\u0014g", "2`c.", "\u001ab^:\")KO.~Dn0F\u0005-t\u00042\u0005NJ\u0014$C\u0005\u000e8t49c\u0007.\u0001{%.XQ\u0005YC\u001e G]H\u00039", "5dc\u000eV;B]\"m\u000fi,;\u00058d\r2\u007f?z%\u0016Mi\u001e@p25`}\u001cEm", ">`a@X", ">`a@Xj:\\\u0018\f\u0005b+v\u0017.ky8\u007f:\u000e\u0017\u001eGk\u001c<", ">`a@X\fGQ#}z]\bz\u00183o\t\u0017\u0006%\u000f! ", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "/bc6b5", ">`a@X\fGQ#}z]\bz\u00183o\t\u0017\u0006%\u000f! \u0006k\u0017;\u0004/9Xw.6s\u0010>Q=Hk;\u001e\u0011va", "5dc\u000fe(SSt|\nb6\u0006y/r\u000e,\u0006I\\ \u0016,}\u0018E", "\u001aj^A_0G\u001d\u0004z~k\u0002", "5dc\u000fe(SSt|\nb6\u0006y/r\u000e,\u0006I\\ \u0016,}\u0018E5!>X\u000b*;l\u0010<LI5{8\u0018\"hh9\u0003q,", "7r1?TA>/\u0017\u000e~h5l\u00163", "", "\u000fbc6b5-g$~", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BrazeActionParser {
    public static final String BRAZE_ACTIONS_SCHEME = "brazeActions";
    private static final String BRAZE_ACTIONS_V1 = "v1";
    public static final BrazeActionParser INSTANCE = new BrazeActionParser();
    public static final String TYPE = "type";

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eRLш|\u0004O\u00128é6B\u0015\"4\u0012}\u0019lʒ8FǏ\u0004^^Xc,\u001fk*éRZ\\pY{j }2\r]N\u007fg\u001dKj\u000fQ\u0011\u001e\u0016'm߽MU\u0007ab\u001e@D\b?aPڱA?hҚN\u0007&70>J\u0014\u000f\u001aBH>wټGQ\u0014۵HBvA`\u00156\u0005 \u001bn>&\u000b\u0007\\mY\u001fHri#/)\u0010RBT5H0\u0003\\uFZ7uvg/\u0014@=G}%Y\u0016oRaSk?wRބl>"}, d2 = {"\u001ab^:\")KO.~Dn0F\u0005-t\u00042\u0005NJ\u0014$C\u0005\u000e8t49c\u0007.\u0001J#*bC\u0017iC\"\u001fqL5\u0014q,[5\u0003E[R6eA\u0007H\u0014g", "", "9dh", "", "7l_9", "\u001ab^:\")KO.~Dn0F\u0005-t\u00042\u0005NJ\u0014$C\u0005\u000e8t49c\u0007.\u0001{%.XQ\u0005O\u0011+\u0011}a\u0015\u0005r0X\u007f\u0015VLY\u0002", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u00044AEs}\u001b\"dv9Ps0\u0018r%VPX5j\u001coJ\u0010'Z\nL:\u0011\u000fbOm|S7*\u0016u-^Hd\u0016\fq\fDnzKD\u001fG\u0005j92", "5dc\u0016`7E", "u(;0b4\bP&z\u0010^u\r\rxa}7\u007fJ\n%`D|\nQv!3h\u0002*@{_<\\CFy}\u0002qu]N\u0007?*]z1P:],g(", "5dc\u0018X@", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "\u0011N=!4\u0010'3\u0006", "\u001aN6,6\u001c,B\u0003ft>\u001d\\q\u001e", "!DC,6\u001c,B\u0003ft:\u001bku\u0013Bo\u0017[", " D@\"8\u001a-M\u0004nhA&gh\u001cMc\u0016i$j\u007f", "\u000fC3,G\u00168A\t[h<\u0019`s\u001eIi\u0011u\"m\u0001\u00072", " D<\u001cI\f84\u0006hbX\u001ale\u001dCl\ff/d\u0001\u007fAQz&f\u0010", "\u000fC3,G\u001681\tliH\u0014vd\u001eTl\fX0ov\u0011#\\z\u0018j", " D<\u001cI\f84\u0006hbX\nlv\u001eOg\"W/o\u0004z$_|\u001cp\u0001\"FY\u0014", "!DC,8\u0014\u001a7\u007fxhN\tjf\u001cIj\u0017_*i", "!DC,C\u001c,6\u0013gdM\u0010]l\rAn\fe)z\u0005\u0007$]k)Z\u0010$=g\t", "\u001dO4\u001bR\u0013\"<~x^G&nh\fVc\bm", "\u001dO4\u001bR\u0013\"<~xZQ\u001b\\u\u0018Af\u000fo", "\u0017ME\u000e?\u0010\u001d", "\u0011n\\=T5B]\"", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public enum ActionType {
        CONTAINER(RRWebVideoEvent.JsonKeys.CONTAINER, ContainerStep.INSTANCE),
        LOG_CUSTOM_EVENT("logCustomEvent", LogCustomEventStep.INSTANCE),
        SET_CUSTOM_ATTRIBUTE("setCustomUserAttribute", SetCustomUserAttributeStep.INSTANCE),
        REQUEST_PUSH_PERMISSION("requestPushPermission", RequestPushPermissionStep.INSTANCE),
        ADD_TO_SUBSCRIPTION_GROUP("addToSubscriptionGroup", AddToSubscriptionGroupStep.INSTANCE),
        REMOVE_FROM_SUBSCRIPTION_GROUP("removeFromSubscriptionGroup", RemoveFromSubscriptionGroupStep.INSTANCE),
        ADD_TO_CUSTOM_ATTRIBUTE_ARRAY("addToCustomAttributeArray", AddToCustomAttributeArrayStep.INSTANCE),
        REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY("removeFromCustomAttributeArray", RemoveFromCustomAttributeArrayStep.INSTANCE),
        SET_EMAIL_SUBSCRIPTION("setEmailNotificationSubscriptionType", SetEmailSubscriptionStep.INSTANCE),
        SET_PUSH_NOTIFICATION_SUBSCRIPTION("setPushNotificationSubscriptionType", SetPushNotificationSubscriptionStep.INSTANCE),
        OPEN_LINK_IN_WEBVIEW("openLinkInWebview", OpenLinkInWebViewStep.INSTANCE),
        OPEN_LINK_EXTERNALLY("openLink", OpenLinkExternallyStep.INSTANCE),
        INVALID("", NoOpStep.INSTANCE);

        public static final Companion Companion = new Companion(null);
        private static final Map<String, ActionType> map;
        private final IBrazeActionStep impl;
        private final String key;

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>-6B\r.4\u0012\u000e\u0007nj?1JͣIDɟ\u0004*=j<9*[ҸuCIUb\u000e0\u000egN\u0016k\u001fPh\u0011[\u0011\u001c\u0015'mrN&\u0011k\u0013'>RqO3{rM;ptd\tN4x\u0603{ڱ\u0005\u001a2ϺǞz\u0002"}, d2 = {"\u001ab^:\")KO.~Dn0F\u0005-t\u00042\u0005NJ\u0014$C\u0005\u000e8t49c\u0007.\u0001J#*bC\u0017iC\"\u001fqL5\u0014q,[5\u0003E[R6eA\u0007H\u0014P8\u0018V6\t\u000e]K-D", "", "u(E", ";`_", "", "", "\u001ab^:\")KO.~Dn0F\u0005-t\u00042\u0005NJ\u0014$C\u0005\u000e8t49c\u0007.\u0001J#*bC\u0017iC\"\u001fqL5\u0014q,[5\u0003E[R6eA\u0007H\u0014g", "4q^:I(Ec\u0019", "D`[BX", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final ActionType fromValue(String str) {
                Map map = ActionType.map;
                if (str == null) {
                    str = "";
                }
                Object obj = map.get(str);
                if (obj == null) {
                    obj = ActionType.INVALID;
                }
                return (ActionType) obj;
            }
        }

        static {
            ActionType[] actionTypeArrValues = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(actionTypeArrValues.length), 16));
            for (ActionType actionType : actionTypeArrValues) {
                linkedHashMap.put(actionType.key, actionType);
            }
            map = linkedHashMap;
        }

        ActionType(String str, IBrazeActionStep iBrazeActionStep) {
            this.key = str;
            this.impl = iBrazeActionStep;
        }

        @JvmStatic
        public static final ActionType fromValue(String str) {
            return Companion.fromValue(str);
        }

        public final IBrazeActionStep getImpl() {
            return this.impl;
        }

        public final String getKey() {
            return this.key;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.actions.brazeactions.BrazeActionParser$execute$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<String> {
        final /* synthetic */ Uri $uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Uri uri) {
            super(0);
            uri = uri;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Attempting to parse Braze Action with channel " + channel + " and uri:\n'" + uri + '\'';
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.actions.brazeactions.BrazeActionParser$execute$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function0<String> {
        public static final AnonymousClass2 INSTANCE = ;

        AnonymousClass2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to decode Braze Action into both version and json components. Doing nothing.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.actions.brazeactions.BrazeActionParser$execute$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends Lambda implements Function0<String> {
        final /* synthetic */ String $version;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(String str) {
            super(0);
            str = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Braze Actions version " + str + " is unsupported. Version must be v1";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.actions.brazeactions.BrazeActionParser$execute$4 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass4 extends Lambda implements Function0<String> {
        final /* synthetic */ Uri $uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(Uri uri) {
            super(0);
            uri = uri;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to parse uri as a Braze Action.\n'" + uri + '\'';
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.actions.brazeactions.BrazeActionParser$execute$5 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass5 extends Lambda implements Function0<String> {
        final /* synthetic */ Uri $uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(Uri uri) {
            super(0);
            uri = uri;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Done handling Braze uri\n'" + uri + '\'';
        }
    }

    private BrazeActionParser() {
    }

    public static /* synthetic */ void execute$default(BrazeActionParser brazeActionParser, Context context, Uri uri, Channel channel, int i2, Object obj) throws Throwable {
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            channel = Channel.UNKNOWN;
        }
        brazeActionParser.execute(context, uri, channel);
    }

    public final void execute(Context context, Uri uri, Channel channel) throws Throwable {
        Pair brazeActionVersionAndJson$android_sdk_ui_release;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(channel, "channel");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser.execute.1
            final /* synthetic */ Uri $uri;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Uri uri2) {
                super(0);
                uri = uri2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Attempting to parse Braze Action with channel " + channel + " and uri:\n'" + uri + '\'';
            }
        }, 6, (Object) null);
        try {
            brazeActionVersionAndJson$android_sdk_ui_release = getBrazeActionVersionAndJson$android_sdk_ui_release(uri2);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new Function0<String>() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser.execute.4
                final /* synthetic */ Uri $uri;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(Uri uri2) {
                    super(0);
                    uri = uri2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to parse uri as a Braze Action.\n'" + uri + '\'';
                }
            }, 4, (Object) null);
        }
        if (brazeActionVersionAndJson$android_sdk_ui_release == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) AnonymousClass2.INSTANCE, 6, (Object) null);
            return;
        }
        String str = (String) brazeActionVersionAndJson$android_sdk_ui_release.component1();
        JSONObject jSONObject = (JSONObject) brazeActionVersionAndJson$android_sdk_ui_release.component2();
        if (!Intrinsics.areEqual(str, BRAZE_ACTIONS_V1)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser.execute.3
                final /* synthetic */ String $version;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(String str2) {
                    super(0);
                    str = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Braze Actions version " + str + " is unsupported. Version must be v1";
                }
            }, 7, (Object) null);
        } else {
            parse$android_sdk_ui_release(context, new StepData(jSONObject, channel));
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser.execute.5
                final /* synthetic */ Uri $uri;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(Uri uri2) {
                    super(0);
                    uri = uri2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Done handling Braze uri\n'" + uri + '\'';
                }
            }, 6, (Object) null);
        }
    }

    public final /* synthetic */ ActionType getActionType$android_sdk_ui_release(final StepData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        final ActionType actionTypeFromValue = ActionType.Companion.fromValue(JsonUtils.getOptionalString(data.getSrcJson(), "type"));
        if (actionTypeFromValue.getImpl().isValid(data)) {
            return actionTypeFromValue;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser$getActionType$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Cannot parse invalid action of type " + actionTypeFromValue + " and data " + data;
            }
        }, 7, (Object) null);
        return ActionType.INVALID;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.braze.ui.actions.brazeactions.BrazeActionParser] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final /* synthetic */ Pair getBrazeActionVersionAndJson$android_sdk_ui_release(final Uri uri) throws Throwable {
        ?? r1;
        Intrinsics.checkNotNullParameter(uri, "<this>");
        String host = uri.getHost();
        final ?? lastPathSegment = uri.getLastPathSegment();
        if (host == null || lastPathSegment == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) uri, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser$getBrazeActionVersionAndJson$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to parse version and encoded action from uri: " + uri;
                }
            }, 7, (Object) null);
            return null;
        }
        try {
            lastPathSegment = parseEncodedActionToJson$android_sdk_ui_release(lastPathSegment);
            r1 = lastPathSegment;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) uri, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new Function0<String>() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser$getBrazeActionVersionAndJson$json$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to decode action into json. Action:\n'" + lastPathSegment + '\'';
                }
            }, 4, (Object) null);
            r1 = 0;
        }
        if (r1 == 0) {
            return null;
        }
        return new Pair(host, r1);
    }

    public final boolean isBrazeActionUri(Uri uri) {
        return Intrinsics.areEqual(uri != null ? uri.getScheme() : null, BRAZE_ACTIONS_SCHEME);
    }

    public final /* synthetic */ void parse$android_sdk_ui_release(Context context, final StepData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            final ActionType actionType$android_sdk_ui_release = getActionType$android_sdk_ui_release(data);
            if (actionType$android_sdk_ui_release == ActionType.INVALID) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser$parse$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Performing Braze Action type " + actionType$android_sdk_ui_release + " with data " + data;
                }
            }, 6, (Object) null);
            actionType$android_sdk_ui_release.getImpl().run(context, data);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new Function0<String>() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser$parse$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to run with data " + data;
                }
            }, 4, (Object) null);
        }
    }

    public final /* synthetic */ JSONObject parseEncodedActionToJson$android_sdk_ui_release(String str) throws Throwable {
        Intrinsics.checkNotNullParameter(str, Ig.wd("_5Rm2c", (short) (C1607wl.Xd() ^ 10707)));
        Object[] objArr = {str, 8};
        Method declaredMethod = Class.forName(EO.Od(" U;+pHYD[(\u0019\u007f\r1:0_@w", (short) (Od.Xd() ^ (-23467)))).getDeclaredMethod(C1593ug.zd("243@68", (short) (Od.Xd() ^ (-24498)), (short) (Od.Xd() ^ (-20310))), Class.forName(C1561oA.Qd("si}g3pdph.Rroeia", (short) (Od.Xd() ^ (-32634)))), Integer.TYPE);
        try {
            declaredMethod.setAccessible(true);
            byte[] bArr = (byte[]) declaredMethod.invoke(null, objArr);
            Intrinsics.checkNotNullExpressionValue(bArr, C1561oA.od("XXU`TT\u0016NO_SXV\u0013\u0006'EVG\u0017\u0014\r3/(:-\u001a\u001e\u001c~", (short) (C1607wl.Xd() ^ 23470)));
            int length = bArr.length / 2;
            int[] iArr = new int[length];
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, bArr.length - 1, 2);
            if (progressionLastElement >= 0) {
                int i2 = 0;
                while (true) {
                    byte b2 = bArr[i2];
                    byte b3 = bArr[i2 + 1];
                    iArr[i2 / 2] = (-1) - (((-1) - ((b2 + 255) - (b2 | 255))) & ((-1) - (((b3 + 255) - (b3 | 255)) << 8)));
                    if (i2 == progressionLastElement) {
                        break;
                    }
                    i2 += 2;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < length; i3++) {
                int i4 = iArr[i3];
                if (i4 < 0 || i4 > 65535) {
                    short sXd = (short) (C1499aX.Xd() ^ (-16978));
                    int[] iArr2 = new int["c\n\u0013~\u000b\t\u0005Ae\f\u0006\u0018F\u000b\u0018\u000e\u0010eL".length()];
                    QB qb = new QB("c\n\u0013~\u000b\t\u0005Ae\f\u0006\u0018F\u000b\u0018\u000e\u0010eL");
                    int i5 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr2[i5] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i5));
                        i5++;
                    }
                    throw new IllegalArgumentException(new String(iArr2, 0, i5) + i4);
                }
                sb.append((char) i4);
            }
            return new JSONObject(sb.toString());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
