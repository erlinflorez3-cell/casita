package com.braze.ui.inappmessage.jsinterface;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.enums.Gender;
import com.braze.enums.Month;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.events.IValueCallback;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;
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
@Metadata(bv = {}, d1 = {"Я^\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":\u0012\u007fјnjG<LeN5ZS@\u000fsڔ<$i*yّCU0}*\tUNog|Yb\u000bI\u0015\u000e\u0016\u000fj4I[xe\u0012\u001d;JoE3UoK=ht<\u001a(288\u0002\u0005\u0007\u001a@Ϻ.6+Cy\u000bJ/\u007f1Eb\u0011[\u00052\u00124?ŋ\u0005\u001eji\u0017LVou:]'3mPS?_^\u0003}\u0011T[?\r%gd0\tMC\u001d=S1\u000b\u0003_M\fWqk\u000b\u0019+55as\u0006<\u001f\u0005\\#9Z%]!*\r\t_l$'YU*P\u0019\u001c6\u0005\u0013{;@4\u0012\u00145`.[ -\rVC\u0003\u0002kBf\u0001\rR0~oG/%.Eq>cv_tS\u001bd6*\u0019=\"1\u0016\u0007!\nZTe]:b\u000ei;aDMJd\t\bC\u0004\u0003\u001fy20\u0012H_\u0002Ez?4]*ھ_91:4\u0018V^\u007fv3d\u0019Ww[`@PtF;8\u0013$ZrjKp\u0019bfG)MJX7\u0002\u0016\u001f8\\&Bg*X^]\u0005\u0002j{a:+=\u0004O[\u0005j<]\u007fc{[_\u0002(a\u0001zDCJ\u0002\u001dX\u0015b\u0004\u0010he@\"`N\u001b\u0014\u0006\u001d\\N:\u0019bC\u007f>L,_<#\u001a\u0011!,fY|7c\u000bl\u001e\rl3R\t\u001a(\u0003.\u0019P\u000b\u0017 k\u0007pD|\u000fHsF\u001aM'Nm\"\u00178-'\u0015\b\f\u007fum|MZ\u0005.wkzN\u001c`>\u001aMK<'~W621SU\u000be\u007fSB+\t\u001e\u0012\u000fin^k\u0016\r\t,\u000f\u000e\u0011T\u001d50!vrQ\f\u0015\u0004\b\r^zuu\u0005\u000fiOar1klRF)\u001d\u001fL7Gtj\rCZ['K\u001a(\u001a=Cy_\u007fn\\\u007f)\u0014n\u0003s3DcDs\u0013UkbS8w_ECj4z4ZH\u0019{8H\u0017f%5^@\u0013v\u001d=\u0016\u0019=1~\u0007Z\u0011!ZiO+o,:tdr\u0004Q2,^q)ASa\u001d\u0006oa[9PU\u000fS\f?%*\u001ck$\u0007]p@H\b\n\u0017dG\u0002gML\u0017\\L,j\f;Ib#\u001e\u0012\u0011~teU\u001czR\u0002un\u000e\u0003|\r\\V@xGv X\u0007E\u0014{,\u0007qI\u0005\u001cJ\u00053qb\u0019SK\u000fao\u0018\u0011tbCFj8If\t\u0007\u0019uuE_\u0001d\n\u000e.>w}\fP\u0018+\u001e\u0019ȳ\u001dʦU\u0011gڻғbK"}, d2 = {"\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWA\u0005)>h}-8i\u0014.\u0017'DG?)|hoG\u0003e,>\u0005'T1J=X`pJ\u0018\u001diqW:\r\u0012Z=\"n\u001a", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "/cS\u000e_0:a", "", "/kX.f", "", ":`Q2_", "/cS!b\nNa(\t\u0003:;\f\u00163b\u00107{\u001c\u000e$\u0013[", "9dh", "D`[BX", "/cS!b\u001aNP'|\bb7\f\r9na5\u0006P\f", "AtQ@V9B^(\u0003\u0005g\u000e\n\u0013?pc'", "7mR?X4>\\(\\\u000bl;\u0007\u0011\u001fs\u007f5WO\u0010$\u001bD\u007f\u001d<", "/sc?\\)Nb\u0019", ";n]A[\rK]!b\u0004m", "\u001ab^:\")KO.~D^5\r\u0011=/g2\u0005O\u0004l", ";n]A[\u0010Gb", "", ">`a@X\u000e>\\\u0018~\b", "\u001ab^:\")KO.~D^5\r\u0011=/a(\u0005?\u0001$l", "5d]1X9,b&\u0003\u0004`", ">`a@X\u001aM`\u001d\b|:9\n\u0005CF\r2\u0004%\u000f! 5~\u001b@\u007f'", "", "8r^;49KO-l\nk0\u0006\u000b", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?6g\u001c\u0013XkWCr.7#k/Dq\u001f0#", "@d\\<i,\u001f`#\u0007Xn:\f\u00137A\u000f7\tD}'&GK\u001bIr9", "@d\\<i,\u001f`#\u0007hn)\u000b\u0007<i\u000b7\u007fJ\nx$Q\u007f\u0019", "Adc\u0010b<Gb&\u0013", "1nd;g9R", "Adc\u0010h:M]!Z\nm9\u0001\u0006?t\u007f", "CrT?", "\u001ab^:\")KO.~D;9x\u001e/U\u000e(\t\u0016", "8r^;F;KW\"\u0001kZ3\r\t", ";da4X", "", "Adc\u0010h:M]!e\u0005\\(\f\r9n[7\u000bM\u0005\u0014'Vo", ":`c6g<=S", "", ":n]4\\;NR\u0019", "Adc\u0010h:M]!n\t^9X\u0018>r\u0004%\fO\u0001r$Tk\"", "Adc\u0010h:M]!n\t^9X\u0018>r\u0004%\fO\u0001{\u00051X", "Adc\u0011T;>=\u001a[~k;\u007f", "GdP?", "2`h", "Adc\u0012`(BZ", "3lP6_", "Adc\u0012`(BZ\u0002\t\nb-\u0001\u0007+t\u00042\u0005.\u0011\u0014%E|\u0012G\u0006)?bl4Bm", "AtQ@V9B^(\u0003\u0005g\u001b\u0011\u0014/", "Adc\u0013\\9Lb\u0002z\u0003^", "4ha@g\u0015:[\u0019", "Adc\u0014X5=S&", "Adc\u0015b4>1\u001d\u000e\u000f", "6n\\260Mg", "Adc\u0019T5@c\u0015\u0001z", ":`]4h(@S", "Adc\u0019T:M<\u0015\u0007z", ":`bAA(FS", "Adc\u001d[6GS\u0002\u000f\u0003[,\n", ">g^;X\u0015N[\u0016~\b", "Adc\u001dh:A<#\u000e~_0z\u0005>i\n1iP}%\u0015Ts\u0019Kz/>H\u0012+7", "AtQ@V9B^(\u0003\u0005g\u001b\u0011\u0014/F\r2\u0004%|(\u0013Um\u001b@\u00024#h\u000b$@o", "\u001ab^:\")KO.~D^5\r\u0011=/h2\u000bD\u0002\u001b\u0015C~\u0012F\u007f\u0013EV\f\u001eDq!=QMDZH)\u0015>", "\u0011n\\=T5B]\"", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class InAppMessageUserJavascriptInterface {
    public static final Companion Companion = new Companion(null);
    public static final String JS_BRIDGE_ATTRIBUTE_VALUE = "value";
    private final Context context;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\":\u0012\u007f\u0007|jAӄLe^.ZS@\u000fs{J$c$wDA٬\u001b\u0014̝9O|f(sPZŲG\u000f\u0014\u0016A\u0018:Lmx\f\u001672ptoR[uUTp\u0006F\u0014N:ŕ<\u0004\u000b\n*0N\u001a\u0007|IQ2\u001d@B\u0001:\u0001\u0011{\f`\u0012VJ.\u00026\\\u0016P\rԦ?Һ>/+ɅݬFZ"}, d2 = {"\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWA\u0005)>h}-8i\u0014.\u0017'DG?)|hoG\u0003e,>\u0005'T1J=X`pJ\u0018\u001diqW:\r\u0012Z=\"n\u0003\u0015)\u00107E\u000b?r\na", "", "u(E", "\u0018RN\u000fE\u0010\u001d5xxVM\u001bil\fUn\bu1\\}\u0007'", "", "@t]\u001ca\u001cLS&", "", "\u001ab^:\")KO.~D;9x\u001e/;", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001ab^:\")KO.~D;9x\u001e/U\u000e(\t\u0016", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "CrT?", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void runOnUser(Braze braze, final Function1<? super BrazeUser, Unit> function1) {
            braze.getCurrentUser(new IValueCallback() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$Companion$$ExternalSyntheticLambda0
                @Override // com.braze.events.IValueCallback
                public final void onSuccess(Object obj) {
                    InAppMessageUserJavascriptInterface.Companion.runOnUser$lambda$0(function1, (BrazeUser) obj);
                }
            });
        }

        public static final void runOnUser$lambda$0(Function1 block, BrazeUser it) {
            Intrinsics.checkNotNullParameter(block, "$block");
            Intrinsics.checkNotNullParameter(it, "it");
            block.invoke(it);
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$addAlias$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001ab^:\")KO.~D;9x\u001e/U\u000e(\t\u0016", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function1<BrazeUser, Unit> {
        final /* synthetic */ String $alias;
        final /* synthetic */ String $label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, String str2) {
            super(1);
            str = str;
            str = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
            invoke2(brazeUser);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(BrazeUser it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.addAlias(str, str);
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$addToCustomAttributeArray$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001ab^:\")KO.~D;9x\u001e/U\u000e(\t\u0016", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10281 extends Lambda implements Function1<BrazeUser, Unit> {
        final /* synthetic */ String $key;
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10281(String str, String str2) {
            super(1);
            str = str;
            str = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
            invoke2(brazeUser);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(BrazeUser it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.addToCustomAttributeArray(str, str);
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$addToSubscriptionGroup$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001ab^:\")KO.~D;9x\u001e/U\u000e(\t\u0016", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10291 extends Lambda implements Function1<BrazeUser, Unit> {
        final /* synthetic */ String $subscriptionGroupId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10291(String str) {
            super(1);
            str = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
            invoke2(brazeUser);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(BrazeUser it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.addToSubscriptionGroup(str);
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$incrementCustomUserAttribute$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001ab^:\")KO.~D;9x\u001e/U\u000e(\t\u0016", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10301 extends Lambda implements Function1<BrazeUser, Unit> {
        final /* synthetic */ String $attribute;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10301(String str) {
            super(1);
            str = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
            invoke2(brazeUser);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(BrazeUser it) {
            Intrinsics.checkNotNullParameter(it, "it");
            BrazeUser.incrementCustomUserAttribute$default(it, str, 0, 2, null);
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$parseStringArrayFromJsonString$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function0<String> {
        public static final AnonymousClass2 INSTANCE = ;

        AnonymousClass2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to parse custom attribute array";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$removeFromCustomAttributeArray$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001ab^:\")KO.~D;9x\u001e/U\u000e(\t\u0016", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10311 extends Lambda implements Function1<BrazeUser, Unit> {
        final /* synthetic */ String $key;
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10311(String str, String str2) {
            super(1);
            str = str;
            str = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
            invoke2(brazeUser);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(BrazeUser it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.removeFromCustomAttributeArray(str, str);
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$removeFromSubscriptionGroup$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001ab^:\")KO.~D;9x\u001e/U\u000e(\t\u0016", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10321 extends Lambda implements Function1<BrazeUser, Unit> {
        final /* synthetic */ String $subscriptionGroupId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10321(String str) {
            super(1);
            str = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
            invoke2(brazeUser);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(BrazeUser it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.removeFromSubscriptionGroup(str);
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setCountry$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001ab^:\")KO.~D;9x\u001e/U\u000e(\t\u0016", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10331 extends Lambda implements Function1<BrazeUser, Unit> {
        final /* synthetic */ String $country;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10331(String str) {
            super(1);
            str = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
            invoke2(brazeUser);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(BrazeUser it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.setCountry(str);
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setCustomAttribute$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10341 extends Lambda implements Function0<String> {
        final /* synthetic */ String $jsonStringValue;
        final /* synthetic */ String $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10341(String str, String str2) {
            super(0);
            str = str;
            str = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to parse custom attribute type for key: " + str + " and json string value: " + str;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setCustomAttribute$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10352 extends Lambda implements Function0<String> {
        final /* synthetic */ String $jsonStringValue;
        final /* synthetic */ String $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10352(String str, String str2) {
            super(0);
            str = str;
            str = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to parse custom attribute type for key: " + str + " and json string value: " + str;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setCustomLocationAttribute$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001ab^:\")KO.~D;9x\u001e/U\u000e(\t\u0016", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10361 extends Lambda implements Function1<BrazeUser, Unit> {
        final /* synthetic */ String $attribute;
        final /* synthetic */ double $latitude;
        final /* synthetic */ double $longitude;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10361(String str, double d2, double d3) {
            super(1);
            str = str;
            d = d2;
            d = d3;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
            invoke2(brazeUser);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(BrazeUser it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.setLocationCustomAttribute(str, d, d);
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setCustomUserAttributeArray$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10371 extends Lambda implements Function0<String> {
        final /* synthetic */ String $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10371(String str) {
            super(0);
            str = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to set custom attribute array for key " + str;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setCustomUserAttributeArray$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001ab^:\")KO.~D;9x\u001e/U\u000e(\t\u0016", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10382 extends Lambda implements Function1<BrazeUser, Unit> {
        final /* synthetic */ String[] $arrayValue;
        final /* synthetic */ String $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10382(String str, String[] strArr) {
            super(1);
            str = str;
            strArr = strArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
            invoke2(brazeUser);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(BrazeUser it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.setCustomAttributeArray(str, strArr);
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setCustomUserAttributeJSON$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001ab^:\")KO.~D;9x\u001e/U\u000e(\t\u0016", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10391 extends Lambda implements Function1<BrazeUser, Unit> {
        final /* synthetic */ String $jsonStringValue;
        final /* synthetic */ String $key;
        final /* synthetic */ boolean $merge;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10391(String str, String str2, boolean z2) {
            super(1);
            str = str;
            str = str2;
            z = z2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
            invoke2(brazeUser);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(BrazeUser it) {
            Intrinsics.checkNotNullParameter(it, "it");
            InAppMessageUserJavascriptInterface.this.setCustomAttribute(it, str, str, z);
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setDateOfBirth$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10401 extends Lambda implements Function0<String> {
        final /* synthetic */ int $monthInt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10401(int i2) {
            super(0);
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to parse month for value " + i;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setDateOfBirth$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001ab^:\")KO.~D;9x\u001e/U\u000e(\t\u0016", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10412 extends Lambda implements Function1<BrazeUser, Unit> {
        final /* synthetic */ int $day;
        final /* synthetic */ Month $month;
        final /* synthetic */ int $year;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10412(int i2, Month month, int i3) {
            super(1);
            i = i2;
            month = month;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
            invoke2(brazeUser);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(BrazeUser it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.setDateOfBirth(i, month, i);
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setEmail$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001ab^:\")KO.~D;9x\u001e/U\u000e(\t\u0016", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10421 extends Lambda implements Function1<BrazeUser, Unit> {
        final /* synthetic */ String $email;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10421(String str) {
            super(1);
            str = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
            invoke2(brazeUser);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(BrazeUser it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.setEmail(str);
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setEmailNotificationSubscriptionType$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10431 extends Lambda implements Function0<String> {
        final /* synthetic */ String $subscriptionType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10431(String str) {
            super(0);
            str = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to parse email subscription type in Braze HTML in-app message javascript interface with subscription " + str;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setEmailNotificationSubscriptionType$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001ab^:\")KO.~D;9x\u001e/U\u000e(\t\u0016", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10442 extends Lambda implements Function1<BrazeUser, Unit> {
        C10442() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
            invoke2(brazeUser);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(BrazeUser it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.setEmailNotificationSubscriptionType(notificationSubscriptionType);
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setFirstName$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001ab^:\")KO.~D;9x\u001e/U\u000e(\t\u0016", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10451 extends Lambda implements Function1<BrazeUser, Unit> {
        final /* synthetic */ String $firstName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10451(String str) {
            super(1);
            str = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
            invoke2(brazeUser);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(BrazeUser it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.setFirstName(str);
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setGender$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10461 extends Lambda implements Function0<String> {
        final /* synthetic */ String $genderString;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10461(String str) {
            super(0);
            str = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to parse gender in Braze HTML in-app message javascript interface with gender: " + str;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setGender$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001ab^:\")KO.~D;9x\u001e/U\u000e(\t\u0016", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10472 extends Lambda implements Function1<BrazeUser, Unit> {
        C10472() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
            invoke2(brazeUser);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(BrazeUser it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.setGender(gender);
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setHomeCity$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001ab^:\")KO.~D;9x\u001e/U\u000e(\t\u0016", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10481 extends Lambda implements Function1<BrazeUser, Unit> {
        final /* synthetic */ String $homeCity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10481(String str) {
            super(1);
            str = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
            invoke2(brazeUser);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(BrazeUser it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.setHomeCity(str);
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setLanguage$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001ab^:\")KO.~D;9x\u001e/U\u000e(\t\u0016", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10491 extends Lambda implements Function1<BrazeUser, Unit> {
        final /* synthetic */ String $language;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10491(String str) {
            super(1);
            str = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
            invoke2(brazeUser);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(BrazeUser it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.setLanguage(str);
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setLastName$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001ab^:\")KO.~D;9x\u001e/U\u000e(\t\u0016", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10501 extends Lambda implements Function1<BrazeUser, Unit> {
        final /* synthetic */ String $lastName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10501(String str) {
            super(1);
            str = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
            invoke2(brazeUser);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(BrazeUser it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.setLastName(str);
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setPhoneNumber$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001ab^:\")KO.~D;9x\u001e/U\u000e(\t\u0016", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10511 extends Lambda implements Function1<BrazeUser, Unit> {
        final /* synthetic */ String $phoneNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10511(String str) {
            super(1);
            str = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
            invoke2(brazeUser);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(BrazeUser it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.setPhoneNumber(str);
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setPushNotificationSubscriptionType$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10521 extends Lambda implements Function0<String> {
        final /* synthetic */ String $subscriptionType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10521(String str) {
            super(0);
            str = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to parse push subscription type in Braze HTML in-app message javascript interface with subscription: " + str;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setPushNotificationSubscriptionType$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001ab^:\")KO.~D;9x\u001e/U\u000e(\t\u0016", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10532 extends Lambda implements Function1<BrazeUser, Unit> {
        C10532() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
            invoke2(brazeUser);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(BrazeUser it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.setPushNotificationSubscriptionType(notificationSubscriptionType);
        }
    }

    public InAppMessageUserJavascriptInterface(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @JavascriptInterface
    public final void addAlias(String alias, String label) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(label, "label");
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.addAlias.1
            final /* synthetic */ String $alias;
            final /* synthetic */ String $label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String alias2, String label2) {
                super(1);
                str = alias2;
                str = label2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(BrazeUser it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.addAlias(str, str);
            }
        });
    }

    @JavascriptInterface
    public final void addToCustomAttributeArray(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.addToCustomAttributeArray.1
            final /* synthetic */ String $key;
            final /* synthetic */ String $value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10281(String key2, String value2) {
                super(1);
                str = key2;
                str = value2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(BrazeUser it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.addToCustomAttributeArray(str, str);
            }
        });
    }

    @JavascriptInterface
    public final void addToSubscriptionGroup(String subscriptionGroupId) {
        Intrinsics.checkNotNullParameter(subscriptionGroupId, "subscriptionGroupId");
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.addToSubscriptionGroup.1
            final /* synthetic */ String $subscriptionGroupId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10291(String subscriptionGroupId2) {
                super(1);
                str = subscriptionGroupId2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(BrazeUser it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.addToSubscriptionGroup(str);
            }
        });
    }

    @JavascriptInterface
    public final void incrementCustomUserAttribute(String attribute) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.incrementCustomUserAttribute.1
            final /* synthetic */ String $attribute;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10301(String attribute2) {
                super(1);
                str = attribute2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(BrazeUser it) {
                Intrinsics.checkNotNullParameter(it, "it");
                BrazeUser.incrementCustomUserAttribute$default(it, str, 0, 2, null);
            }
        });
    }

    public final Month monthFromInt(int i2) {
        if (i2 < 1 || i2 > 12) {
            return null;
        }
        return Month.Companion.getMonth(i2 - 1);
    }

    public final Gender parseGender(String genderString) {
        Intrinsics.checkNotNullParameter(genderString, "genderString");
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = genderString.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (Intrinsics.areEqual(lowerCase, Gender.MALE.forJsonPut())) {
            return Gender.MALE;
        }
        if (Intrinsics.areEqual(lowerCase, Gender.FEMALE.forJsonPut())) {
            return Gender.FEMALE;
        }
        if (Intrinsics.areEqual(lowerCase, Gender.OTHER.forJsonPut())) {
            return Gender.OTHER;
        }
        if (Intrinsics.areEqual(lowerCase, Gender.UNKNOWN.forJsonPut())) {
            return Gender.UNKNOWN;
        }
        if (Intrinsics.areEqual(lowerCase, Gender.NOT_APPLICABLE.forJsonPut())) {
            return Gender.NOT_APPLICABLE;
        }
        if (Intrinsics.areEqual(lowerCase, Gender.PREFER_NOT_TO_SAY.forJsonPut())) {
            return Gender.PREFER_NOT_TO_SAY;
        }
        return null;
    }

    public final String[] parseStringArrayFromJsonString(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(jSONArray.getString(i2));
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) AnonymousClass2.INSTANCE, 4, (Object) null);
            return null;
        }
    }

    @JavascriptInterface
    public final void removeFromCustomAttributeArray(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.removeFromCustomAttributeArray.1
            final /* synthetic */ String $key;
            final /* synthetic */ String $value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10311(String key2, String value2) {
                super(1);
                str = key2;
                str = value2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(BrazeUser it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.removeFromCustomAttributeArray(str, str);
            }
        });
    }

    @JavascriptInterface
    public final void removeFromSubscriptionGroup(String subscriptionGroupId) {
        Intrinsics.checkNotNullParameter(subscriptionGroupId, "subscriptionGroupId");
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.removeFromSubscriptionGroup.1
            final /* synthetic */ String $subscriptionGroupId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10321(String subscriptionGroupId2) {
                super(1);
                str = subscriptionGroupId2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(BrazeUser it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.removeFromSubscriptionGroup(str);
            }
        });
    }

    @JavascriptInterface
    public final void setCountry(String str) {
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setCountry.1
            final /* synthetic */ String $country;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10331(String str2) {
                super(1);
                str = str2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(BrazeUser it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.setCountry(str);
            }
        });
    }

    public final void setCustomAttribute(BrazeUser user, String key, String jsonStringValue, boolean z2) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(jsonStringValue, "jsonStringValue");
        try {
            Object obj = new JSONObject(jsonStringValue).get("value");
            if (obj instanceof String) {
                user.setCustomUserAttribute(key, (String) obj);
            } else if (obj instanceof Boolean) {
                user.setCustomUserAttribute(key, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                user.setCustomUserAttribute(key, ((Number) obj).intValue());
            } else if (obj instanceof Double) {
                user.setCustomUserAttribute(key, ((Number) obj).doubleValue());
            } else if (obj instanceof JSONObject) {
                user.setCustomUserAttribute(key, (JSONObject) obj, z2);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setCustomAttribute.1
                    final /* synthetic */ String $jsonStringValue;
                    final /* synthetic */ String $key;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C10341(String key2, String jsonStringValue2) {
                        super(0);
                        str = key2;
                        str = jsonStringValue2;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Failed to parse custom attribute type for key: " + str + " and json string value: " + str;
                    }
                }, 6, (Object) null);
            }
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setCustomAttribute.2
                final /* synthetic */ String $jsonStringValue;
                final /* synthetic */ String $key;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C10352(String key2, String jsonStringValue2) {
                    super(0);
                    str = key2;
                    str = jsonStringValue2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to parse custom attribute type for key: " + str + " and json string value: " + str;
                }
            }, 4, (Object) null);
        }
    }

    @JavascriptInterface
    public final void setCustomLocationAttribute(String attribute, double d2, double d3) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setCustomLocationAttribute.1
            final /* synthetic */ String $attribute;
            final /* synthetic */ double $latitude;
            final /* synthetic */ double $longitude;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10361(String attribute2, double d22, double d32) {
                super(1);
                str = attribute2;
                d = d22;
                d = d32;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(BrazeUser it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.setLocationCustomAttribute(str, d, d);
            }
        });
    }

    @JavascriptInterface
    public final void setCustomUserAttributeArray(String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        String[] stringArrayFromJsonString = parseStringArrayFromJsonString(str);
        if (stringArrayFromJsonString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setCustomUserAttributeArray.1
                final /* synthetic */ String $key;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C10371(String key2) {
                    super(0);
                    str = key2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to set custom attribute array for key " + str;
                }
            }, 6, (Object) null);
        } else {
            Companion.runOnUser(Braze.Companion.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setCustomUserAttributeArray.2
                final /* synthetic */ String[] $arrayValue;
                final /* synthetic */ String $key;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C10382(String key2, String[] stringArrayFromJsonString2) {
                    super(1);
                    str = key2;
                    strArr = stringArrayFromJsonString2;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                    invoke2(brazeUser);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke */
                public final void invoke2(BrazeUser it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    it.setCustomAttributeArray(str, strArr);
                }
            });
        }
    }

    @JavascriptInterface
    public final void setCustomUserAttributeJSON(String key, String jsonStringValue, boolean z2) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(jsonStringValue, "jsonStringValue");
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setCustomUserAttributeJSON.1
            final /* synthetic */ String $jsonStringValue;
            final /* synthetic */ String $key;
            final /* synthetic */ boolean $merge;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10391(String key2, String jsonStringValue2, boolean z22) {
                super(1);
                str = key2;
                str = jsonStringValue2;
                z = z22;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(BrazeUser it) {
                Intrinsics.checkNotNullParameter(it, "it");
                InAppMessageUserJavascriptInterface.this.setCustomAttribute(it, str, str, z);
            }
        });
    }

    @JavascriptInterface
    public final void setDateOfBirth(int i2, int i3, int i4) {
        Month monthMonthFromInt = monthFromInt(i3);
        if (monthMonthFromInt == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setDateOfBirth.1
                final /* synthetic */ int $monthInt;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C10401(int i32) {
                    super(0);
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to parse month for value " + i;
                }
            }, 6, (Object) null);
        } else {
            Companion.runOnUser(Braze.Companion.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setDateOfBirth.2
                final /* synthetic */ int $day;
                final /* synthetic */ Month $month;
                final /* synthetic */ int $year;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C10412(int i22, Month monthMonthFromInt2, int i42) {
                    super(1);
                    i = i22;
                    month = monthMonthFromInt2;
                    i = i42;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                    invoke2(brazeUser);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke */
                public final void invoke2(BrazeUser it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    it.setDateOfBirth(i, month, i);
                }
            });
        }
    }

    @JavascriptInterface
    public final void setEmail(String str) {
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setEmail.1
            final /* synthetic */ String $email;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10421(String str2) {
                super(1);
                str = str2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(BrazeUser it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.setEmail(str);
            }
        });
    }

    @JavascriptInterface
    public final void setEmailNotificationSubscriptionType(String subscriptionType) {
        Intrinsics.checkNotNullParameter(subscriptionType, "subscriptionType");
        NotificationSubscriptionType notificationSubscriptionTypeSubscriptionTypeFromJavascriptString = subscriptionTypeFromJavascriptString(subscriptionType);
        if (notificationSubscriptionTypeSubscriptionTypeFromJavascriptString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setEmailNotificationSubscriptionType.1
                final /* synthetic */ String $subscriptionType;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C10431(String subscriptionType2) {
                    super(0);
                    str = subscriptionType2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to parse email subscription type in Braze HTML in-app message javascript interface with subscription " + str;
                }
            }, 6, (Object) null);
        } else {
            Companion.runOnUser(Braze.Companion.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setEmailNotificationSubscriptionType.2
                C10442() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                    invoke2(brazeUser);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke */
                public final void invoke2(BrazeUser it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    it.setEmailNotificationSubscriptionType(notificationSubscriptionType);
                }
            });
        }
    }

    @JavascriptInterface
    public final void setFirstName(String str) {
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setFirstName.1
            final /* synthetic */ String $firstName;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10451(String str2) {
                super(1);
                str = str2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(BrazeUser it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.setFirstName(str);
            }
        });
    }

    @JavascriptInterface
    public final void setGender(String genderString) {
        Intrinsics.checkNotNullParameter(genderString, "genderString");
        Gender gender = parseGender(genderString);
        if (gender == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setGender.1
                final /* synthetic */ String $genderString;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C10461(String genderString2) {
                    super(0);
                    str = genderString2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to parse gender in Braze HTML in-app message javascript interface with gender: " + str;
                }
            }, 6, (Object) null);
        } else {
            Companion.runOnUser(Braze.Companion.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setGender.2
                C10472() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                    invoke2(brazeUser);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke */
                public final void invoke2(BrazeUser it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    it.setGender(gender);
                }
            });
        }
    }

    @JavascriptInterface
    public final void setHomeCity(String str) {
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setHomeCity.1
            final /* synthetic */ String $homeCity;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10481(String str2) {
                super(1);
                str = str2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(BrazeUser it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.setHomeCity(str);
            }
        });
    }

    @JavascriptInterface
    public final void setLanguage(String str) {
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setLanguage.1
            final /* synthetic */ String $language;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10491(String str2) {
                super(1);
                str = str2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(BrazeUser it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.setLanguage(str);
            }
        });
    }

    @JavascriptInterface
    public final void setLastName(String str) {
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setLastName.1
            final /* synthetic */ String $lastName;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10501(String str2) {
                super(1);
                str = str2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(BrazeUser it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.setLastName(str);
            }
        });
    }

    @JavascriptInterface
    public final void setPhoneNumber(String str) {
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setPhoneNumber.1
            final /* synthetic */ String $phoneNumber;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10511(String str2) {
                super(1);
                str = str2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(BrazeUser it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.setPhoneNumber(str);
            }
        });
    }

    @JavascriptInterface
    public final void setPushNotificationSubscriptionType(String subscriptionType) {
        Intrinsics.checkNotNullParameter(subscriptionType, "subscriptionType");
        NotificationSubscriptionType notificationSubscriptionTypeSubscriptionTypeFromJavascriptString = subscriptionTypeFromJavascriptString(subscriptionType);
        if (notificationSubscriptionTypeSubscriptionTypeFromJavascriptString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setPushNotificationSubscriptionType.1
                final /* synthetic */ String $subscriptionType;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C10521(String subscriptionType2) {
                    super(0);
                    str = subscriptionType2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to parse push subscription type in Braze HTML in-app message javascript interface with subscription: " + str;
                }
            }, 6, (Object) null);
        } else {
            Companion.runOnUser(Braze.Companion.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setPushNotificationSubscriptionType.2
                C10532() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                    invoke2(brazeUser);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke */
                public final void invoke2(BrazeUser it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    it.setPushNotificationSubscriptionType(notificationSubscriptionType);
                }
            });
        }
    }

    public final NotificationSubscriptionType subscriptionTypeFromJavascriptString(String str) {
        return NotificationSubscriptionType.Companion.fromValue(str);
    }
}
