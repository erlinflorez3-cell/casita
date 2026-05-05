package com.davivienda.daviviendaapp.bridges.ticnow;

import android.app.Activity;
import android.content.Intent;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.google.gson.Gson;
import com.ticnow.sdk.idnowonboarding.enrollresult.IDNowEnrollmentResult;
import com.ticnow.sdk.idnowonboarding.model.config.IDNowOnboardingConfiguration;
import com.ticnow.sdk.idnowonboarding.model.customization.IDNowOnboardingCustomization;
import com.ticnow.sdk.idnowonboarding.model.step.IDStepReview;
import com.ticnow.sdk.idnowonboarding.onboarding.StartIdNowOnboarding;
import com.ticnow.sdk.idnowonboarding.steps.helper.IDRetrievedData;
import com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.getface.controllers.IDGetFaceController;
import com.ticnow.sdk.idnowsecurity.api.IDSecurityApiImpl;
import com.ticnow.sdk.idnowsecurity.http.nodes.IDBaseUrl;
import com.ticnow.sdk.idnowsecurity.http.nodes.IDCredentials;
import com.ticnow.sdk.idnowsecurity.http.nodes.KeyValue;
import com.ticnow.sdk.idnowsecurity.http.request.CommonParamsRequest;
import com.ticnow.sdk.idnowsecurity.http.request.CommonUserDataRequest;
import com.ticnow.sdk.idnowsecurity.http.response.FinishEnrollmentResponse;
import com.ticnow.sdk.idnowsecurity.http.response.InitEnrollmentResponse;
import com.ticnow.sdk.idnowsecurity.security.notifications.IDTransactionPersistence;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
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
import yg.ZO;
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
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0012\u007f\u0007tjAӄLe^.ZS0\u0010s{B0c$w\\CU0}*ޛWNumvJ`\u000bK\u000f\u001c\u0016\u0001j2akތ{W?2pno3{ou8&5C\u0015&@#P{\u001b\u007fH,Н\u0014v\tF\u0014\u001a 4XphW=Q\u0013 *\u0006l'G#%u\\>`l\f?_'\u0011oZNUfv\u0002\u0016#T]?\r%fN/NAM\u0015S^3\u000b`aW\u0003mx\u0004\n1u57as\u0006;\t\u0004\"\"CO;h#*j\u0013i`:2[SqZh\u000eV\u0003+\u007f\u001bL\u001c\u000e42x2;+~\b<>%vaRh\u0002\rM0~oI/%.>[=)ziai$~;\n\u000b%\u001eQ\b5&$\u001b\u001cu-\u001b\u0003|\u00025_MUH|\u0015\nA{\u0012\tb0544U\u000fG{?9G)EkQ#Ov2LRx\u000f\u0005\u000fs\u0004m`ZX\"\u001d!g.\u0017\u001frD\u0013\u0010\u001cTb^D\u0011{#\u001b\fF^!6twj&U\u0014\\\\\u0001i\u0019X\u000e\u000e3=~7\by\u001c\u0012eHv3c\\\u0014\u0014ob\u000f\u0014mG\u0013\tfwZS:e\r,0D`j>\u0003,H\\\u001f+2m|L8:H1\\CS3\"PY\u0015\t\u000ee\u0019\u0014\rZK$1pjyQW^u\to\u0016}y0\u000bm:-o\\e\u001d4c:hb\bS\u000b\r\u0003\u0018G\u0016WwPz&\u000eU*+F\u001eGbG=A\u001a/-@\u0014EEz}\u0016U[%?z+\u0005??vH\u007f\b\u0019{\\dxegTE-'b\u0001) d.\u0001(KC\u0016qp#[lN#\u0007gIf8+\u0010O\"3\u000f\b\"+@]G5,.wB:Eeky\b.(m?*\u0003v\u001c,\u0012! f_oJ;fT\n\u0003L5<l1Mxn\u0006\u001cZ\tb\u0018cLOj\tVfTQ4F|\u0015I%p\u0005`j\u0017}\u0018L.\u000e5$G\f\u001avCS\u0018\u0014X04{it\u000bx\u0014:\u000f\n>\u0007\u0012JHPZep!04~H:OJz\u0005j\u0014T8:L \u000bq_\u001a\n\u001e\f\u0018F\u000e\u001aG6P\u0006SV<_)`d[\u001d`skQ.\u000f\u0005'3L\u007f{6M\u0004TsGc`\u0006\u0004!\u0017;\u0003O-qU/RZQ\u001bV_G\u0010\u000ecQj\u001a62Ro\u00024}\u001aZ0|KGH\u001fGW)_%7%\u0010\u001er\\\b\u000f\u0012\u0015W~&7\u0005\u0013|<CP\u0014S']\u0017\bb[Q~{EI2\u0001EKo\fT'qk3-4:]CW\u0011,)\u0012V\u0002b.\f.H?\u0004#J\r[\u001c\u0011\"]IcFw$\u000e\u001a\u000b)ON0t^=\u0003\u0018[ 6}\u0007c\b!\rqm\u000e nSq\u0001NpY\u0018\u0011\n\u0012q\u0014rc;\u001bf_a*r;\u00025\tUX^\u0017f\rR\u0011\u0002+\t\u0015\u000eG-&MA8f7\u0016gc\u0017w2T$C9c\u0004*\u00106`V,.7y$\u000fZX6FSV{I\u0015\rj\"ZW<i\u001b,r+$)B\b/LlH+4t}Nh==1\u001f\n\u0014\u000eeO:S\u0002>!_Wo\u001fEk#oV\u0002A\u0007H\u001d\r\u007fXM9v\u000e#D-t_m\u001e5\u0016<m\u0013\u000eVOSuZ\bZ\u001c>\u0015=`P lc`!\u00048A\u007f1\u0011/\u001ah\n}F15\u0019\\\u0004)8A\u0015\u0001;J*5y{\f7!._\u0013}(ofi0eiZ5$\u0002\u0014U/Qq\u0019'aZTeI,\u000bm@.\u0015O(2 \u000e#.PaL8#t@\u0005~\b\b4nNnr.wp\u0007\u0006\",\u0018#$higLA)\u001b_IĔ.s"}, d2 = {"\u001ab^:\"+:d\u001d\u0010~^5{\u0005xd{9\u007fQ\u0005\u0017 Fk\nG\u0002n2f\u0002\u001f9m$w\\G9t>0^L@\"\u0011u\u001aNt7TP]@JbvL\u0014g", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\ 7y4\u0003\u0011y]!\u0011b<Uv|", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW\u0018t49j\u0002/KM'.VR\"oB-\u0015qaF\\", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$:\u0018", "1kT.e\fG`#\u0006\u0002f,\u0006\u0018", "", "1`[9U(<Y", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW\u001ar,<Vy\u001e=C", "2d[2g,\u001aZ m\bZ5\u000b\u0005-t\u00042\u0005N", "2d[2g,-`\u0015\b\tZ*\f\r9n", "CtX1G9Q", "", "5d]2e(MSv\t\u0003f0\fj/n\u007f5\u007f>n&\u0017R\\\u000eH\u0007%Ch", "1gP;a,E", "/o_\u0016W", "4naDT9>R|\n", "CrT?4.>\\(", "CrT?<+", "CrT?G@IS", "3mc2e7KW'~Xh+|", ">`c5<+", "5d]2e(MSy\u0003\u0004b:\u007fh8r\n/\u0003H\u0001 &4o\u001aLv3D", "5d]2e(MSz~\nK,~\r=t\u007f5f<\u0010\u001a\u0004G{\u001e<\u00054", "Bx_285K] \u0006\u0003^5\f", "AdV:X5M", "5d]2e(MS|\b~m\f\u0006\u00169l\u00070{I\u0010\u0004\u0017S\u007f\u000eJ\u0006", "<nc6Y0<O(\u0003\u0005g\u0010{", "3ma<_3FS\"\u000eir7|", "5d]2e(MS\u0003\u0007~m;\u0001\u00121E\t5\u0006G\b\u0005&Gzz<\u000355g\r", "5d]2e(MS\t\nyZ;|q9t\u0004)\u007f>|&\u001bQxq;c%Ai}.F", "5dc\u0011X=BQ\u0019l\nZ;\r\u0017\u001ce\f8{N\u0010", "5dc\u001aX:LO\u001b~", ";db@T.>", "5dc\u001bT4>", "5dc\u001dX5=W\"\u0001WZ*\u0003\u000b<o\u00101z/\u000e\u0013 Uk\fKz/>g", "5dc!e(Ga\u0015|\nb6\u0006\u0017", "5dc\"H\u0010\u001d2\u0019\u0010~\\,", "=m00g0OW(\u0013g^:\r\u0010>", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "@d`BX:M1#}z", "", "@dbB_;\u001c]\u0018~", "2`c.", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "=m=2j\u0010Gb\u0019\b\n", "7mc2a;", ">q^0X:L7\"\u0003\n>5\n\u00136l\b(\u0005Om\u0017%Ry\u0017Jv", "1nS2", "2db0e0Ib\u001d\t\u0004", "CtX1G9:\\'zxm0\u0007\u0012", "AdaCX9\u001e\\&\t\u0002e4|\u0012>K\u007f<", ">q^0X:LT\u001d\b~l/\\\u0012<o\u0007/\u0004@\n&\u0004G}\u0019F\u007f35", "4h]._\u001a<]&\u0003\u0004`", "AdT1", "AdaCX9\u001e\\&\t\u0002e4|\u0012>K\u007f<H", "@dc?\\,OS\u000e\t\u0005f\b\r\u00182D{7w", "Hn^:?0<S\"|zM6\u0003\t8", "Hn^:?0<S\"|zM,\u0010\u0018", "Hn^:C<;Z\u001d|`^@", "Hn^:H9E", "7mc2a;L", "AsP?g\u0016GP#z\b]0\u0006\u000b", "/oX\u0018X@", "/oX\"f,K", "6nbAH9E", "4naDT9=S\u0018b\u0006", "1nd;g9R", "3ma<_3-g$~", "\u0011n\\=T5B]\"", "/o_,e,ES\u0015\rz"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class IDNowSecuritySuite extends ReactContextBaseJavaModule implements ActivityEventListener {
    public static final Companion Companion = new Companion(null);
    public static Callback idnowCallback = null;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005%2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005<i%\nCiWpԉN\u07beSZo˧\u0007L`\u000eQ\u0013&\u0018~o:OǪ|d"}, d2 = {"\u001ab^:\"+:d\u001d\u0010~^5{\u0005xd{9\u007fQ\u0005\u0017 Fk\nG\u0002n2f\u0002\u001f9m$w\\G9t>0^L@\"\u0011u\u001aNt7TP]@JbvL\u0014P8\u0018V6\t\u000e]K-D", "", "u(E", "7c]<j\n:Z {v\\2", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW\u001ar,<Vy\u001e=C", "5dc\u0016W5Hevz\u0002e)x\u00075", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0014$Kn\u0010<@\u00031`\u0005\u001d3k\u001c\u0004", "Adc\u0016W5Hevz\u0002e)x\u00075", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006T!<`z\u001c5skq>", "/o_,e,ES\u0015\rz"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Callback getIdnowCallback() {
            Callback callback = IDNowSecuritySuite.idnowCallback;
            if (callback != null) {
                return callback;
            }
            Intrinsics.throwUninitializedPropertyAccessException(C1561oA.Qd("\u007fy\u0003\u0003\nTq{zomnu", (short) (C1499aX.Xd() ^ ((816081913 ^ 2013530359) ^ (-1218447105)))));
            return null;
        }

        public final void setIdnowCallback(Callback callback) {
            Intrinsics.checkNotNullParameter(callback, C1593ug.zd("h!\u0014$]pp", (short) (C1499aX.Xd() ^ (OY.Xd() ^ (-69936165))), (short) (C1499aX.Xd() ^ ((1905579717 ^ 274638892) ^ (-1640630904)))));
            IDNowSecuritySuite.idnowCallback = callback;
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$cQdDYTHA4_g6WGd7lwLBu74y7-4, reason: not valid java name */
    public static /* synthetic */ void m7091$r8$lambda$cQdDYTHA4_g6WGd7lwLBu74y74(Callback callback, IDNowSecuritySuite iDNowSecuritySuite, String str, String str2, String str3, String str4, String str5) throws Throwable {
        short sXd = (short) (C1607wl.Xd() ^ ((1842298871 ^ 2086877930) ^ 296502461));
        int[] iArr = new int["#.+j \u001c0\". \u001b#\u0018\u0014_\u0015\u0011%\u0017#\u0015\u0010\u0018\r\t\b\u0016\u0015Q\u0005\u0014\n\u0004\u0006\u0003\u0010I\u000f\u0003{\u0006\u0006\rB\\V_\u007f\u0007aro\u0001|r|\u0001Yzmwg".length()];
        QB qb = new QB("#.+j \u001c0\". \u001b#\u0018\u0014_\u0015\u0011%\u0017#\u0015\u0010\u0018\r\t\b\u0016\u0015Q\u0005\u0014\n\u0004\u0006\u0003\u0010I\u000f\u0003{\u0006\u0006\rB\\V_\u007f\u0007aro\u0001|r|\u0001Yzmwg");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[(341631205 ^ 1283100022) ^ 1478913428];
        clsArr[0] = Class.forName(C1561oA.Kd("}\u000b\nK\u0005\u0001\u0004\u0007\u0005\u0013\u0014\u0011T\u001a\u000e\u000b\u000e Z\u0010!\u0019\u0015\u0019\u0018aw\u0017#$\u001b\u001b\u001e'", (short) (Od.Xd() ^ (C1499aX.Xd() ^ (1601821170 ^ 484630460)))));
        clsArr[1] = Class.forName(Wg.Zd("\u0005i ;+\u0001N\u001a`\u000eb&s)P?uc\u000fv\u0003W\u001bh\u001eX@y\u0010|g\u0018K)]E:Y\tZ}9\u001b\n\u007f1\u0015p1g3\bT*Z@{\u0010\f\u0018}(", (short) (Od.Xd() ^ (C1633zX.Xd() ^ 1951475729)), (short) (Od.Xd() ^ (OY.Xd() ^ (-69946156)))));
        clsArr[1650657338 ^ 1650657336] = Class.forName(C1561oA.Xd("*\"8$q1'5/v\u001d?>6<6", (short) (C1607wl.Xd() ^ ((469601091 ^ 584364908) ^ 959004642))));
        int iXd = C1580rY.Xd() ^ (623910645 ^ (-347671273));
        short sXd2 = (short) (C1633zX.Xd() ^ (C1580rY.Xd() ^ 831094569));
        int[] iArr2 = new int["IAWC\tH>L>\u0006,NE=C=".length()];
        QB qb2 = new QB("IAWC\tH>L>\u0006,NE=C=");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((sXd2 ^ i3) + xuXd2.CK(iKK2));
            i3++;
        }
        clsArr[iXd] = Class.forName(new String(iArr2, 0, i3));
        int i4 = 178528810 ^ 178528814;
        short sXd3 = (short) (Od.Xd() ^ (C1607wl.Xd() ^ (-1849955715)));
        short sXd4 = (short) (Od.Xd() ^ ((1357372242 ^ 1161263636) ^ (-365999742)));
        int[] iArr3 = new int["'\u001d1\u001bf$\u0018$\u001ca\u0006&#\u0019\u001d\u0015".length()];
        QB qb3 = new QB("'\u001d1\u001bf$\u0018$\u001ca\u0006&#\u0019\u001d\u0015");
        int i5 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i5] = xuXd3.fK(((sXd3 + i5) + xuXd3.CK(iKK3)) - sXd4);
            i5++;
        }
        clsArr[i4] = Class.forName(new String(iArr3, 0, i5));
        clsArr[776147008 ^ 776147013] = Class.forName(hg.Vd("uk\u007fi5rfrj0Ttqgkc", (short) (C1633zX.Xd() ^ ((241896774 ^ 418737162) ^ (-379482254))), (short) (C1633zX.Xd() ^ ((838570007 ^ 264012874) ^ (-1044856221)))));
        int iXd2 = ZN.Xd() ^ 864698102;
        short sXd5 = (short) (OY.Xd() ^ ((439779561 ^ 428536499) ^ 62656985));
        int[] iArr4 = new int["'\u001d1\u001bf$\u0018$\u001ca\u0006&#\u0019\u001d\u0015".length()];
        QB qb4 = new QB("'\u001d1\u001bf$\u0018$\u001ca\u0006&#\u0019\u001d\u0015");
        int i6 = 0;
        while (qb4.YK()) {
            int iKK4 = qb4.KK();
            Xu xuXd4 = Xu.Xd(iKK4);
            iArr4[i6] = xuXd4.fK(sXd5 + i6 + xuXd4.CK(iKK4));
            i6++;
        }
        clsArr[iXd2] = Class.forName(new String(iArr4, 0, i6));
        Object[] objArr = new Object[(1336776911 ^ 1480919496) ^ 401117440];
        objArr[0] = callback;
        objArr[1] = iDNowSecuritySuite;
        objArr[1179404606 ^ 1179404604] = str;
        objArr[(286926129 ^ 1559728473) ^ 1307423851] = str2;
        objArr[FB.Xd() ^ (597234646 ^ 2088140001)] = str3;
        objArr[Od.Xd() ^ 1207800912] = str4;
        objArr[(1979133501 ^ 713910928) ^ 1601848491] = str5;
        Method declaredMethod = cls.getDeclaredMethod(C1561oA.yd("\u0016\n\u001a\u0019\u0011\u000e \u0010\u0006\u001c\u001d\u001cp&&\u001bWu\nw;\u0005z\b}\u0001~BP", (short) (C1633zX.Xd() ^ (OY.Xd() ^ (259823657 ^ (-190295046))))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static /* synthetic */ void $r8$lambda$txxEAz7E4ET2XYNIxWsHcqdX_nc(Callback callback, IDNowSecuritySuite iDNowSecuritySuite, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) throws Throwable {
        Class<?> cls = Class.forName(C1561oA.Yd("MZY\u001bRPfZh\\YcZX&][qesgdnecdtu4izrnrq\u0001<\u0004yt\u0001\u0003\fC_[f\t\u0012n\u0002\u0001\u0014\u0012\n\u0016\u001cv\u001a\u000f\u001b\r", (short) (C1580rY.Xd() ^ (FB.Xd() ^ (-1609526362)))));
        Class<?>[] clsArr = new Class[Od.Xd() ^ (2132156395 ^ 954960819)];
        clsArr[0] = Class.forName(Xg.qd("p}|>wsvyw\u0006\u0007\u0004G\r\u0001}\u0001\u0013M\u0003\u0014\f\b\f\u000bTj\n\u0016\u0017\u000e\u000e\u0011\u001a", (short) (OY.Xd() ^ (1687355186 ^ 1687333471)), (short) (OY.Xd() ^ (724132191 ^ 724107606))));
        int iXd = C1607wl.Xd() ^ 1849965584;
        clsArr[1] = Class.forName(Jg.Wd("\u001bO6]lX\u000e_M/\u00045\u0012w[\u0003^\u0014mc-\u0012C\u0018udT3Yt]C\u001fB\u001f\u001e/^y\\~pW.*\u0014v~oi\\I<XwkG\n\u0013'\u0011r", (short) (ZN.Xd() ^ (1566482761 ^ 1566478885)), (short) (ZN.Xd() ^ iXd)));
        clsArr[FB.Xd() ^ (1088351738 ^ 523338443)] = Class.forName(ZO.xd("\u001c6xc~~5aI\u001f\\,\u000e\u0012uz", (short) (FB.Xd() ^ (Od.Xd() ^ (1246020580 ^ 230246734))), (short) (FB.Xd() ^ (96704834 ^ 96723895))));
        clsArr[(1652867965 ^ 1618684501) ^ 50325803] = Class.forName(C1626yg.Ud(";\u001e]b+~,1BIN+ReBV", (short) (Od.Xd() ^ (768977932 ^ (-768983659))), (short) (Od.Xd() ^ ((2040413267 ^ 356401579) ^ (-1822429285)))));
        clsArr[(460855686 ^ 1812720674) ^ 2004088224] = Class.forName(Ig.wd("\u000eRE\tENo|RU\u0005\u007fNCX,", (short) (Od.Xd() ^ (1409447895 ^ (-1409443284)))));
        clsArr[Od.Xd() ^ (348443597 ^ 1396262813)] = Class.forName(EO.Od("o\u0019\\fbnG\u001cTNm1ZO\u0001\u001b", (short) (C1633zX.Xd() ^ (FB.Xd() ^ (-1609529556)))));
        int iXd2 = C1607wl.Xd() ^ 1849955292;
        short sXd = (short) (C1607wl.Xd() ^ (1099630762 ^ 1099629018));
        int[] iArr = new int["KAU?\u000bH<H@\u0006*JG=A9".length()];
        QB qb = new QB("KAU?\u000bH<H@\u0006*JG=A9");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        clsArr[iXd2] = Class.forName(new String(iArr, 0, i2));
        clsArr[1305484074 ^ 1305484077] = Class.forName(C1593ug.zd("H@VB\u0010OESM\u0015;]\\TZT", (short) (OY.Xd() ^ (1334438681 ^ 1334427452)), (short) (OY.Xd() ^ (742524423 ^ 742537732))));
        clsArr[OY.Xd() ^ (1093983829 ^ 1159714485)] = Class.forName(C1561oA.od("&\u001c0\u001ae#\u0017#\u001b`\u0005%\"\u0018\u001c\u0014", (short) (C1580rY.Xd() ^ (1071325044 ^ (-1071326766)))));
        clsArr[C1580rY.Xd() ^ (-831067160)] = Class.forName(C1561oA.Kd("\u0010\b\u001e\nW\u0017\r\u001b\u0015\\\u0003%$\u001c\"\u001c", (short) (FB.Xd() ^ (1868548787 ^ 1868541120))));
        int i3 = (1369008174 ^ 303586234) ^ 1132540830;
        short sXd2 = (short) (FB.Xd() ^ (C1633zX.Xd() ^ (-1951487415)));
        short sXd3 = (short) (FB.Xd() ^ (1243954876 ^ 1243945842));
        int[] iArr2 = new int["zl\u0012\u001cxW=fsU\u000f,;Rg\u007f".length()];
        QB qb2 = new QB("zl\u0012\u001cxW=fsU\u000f,;Rg\u007f");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK(((i4 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
            i4++;
        }
        clsArr[i3] = Class.forName(new String(iArr2, 0, i4));
        clsArr[Od.Xd() ^ 1207800926] = Class.forName(C1561oA.Xd("91G3\u0001@6D>\u0006,NMEKE", (short) (C1580rY.Xd() ^ (C1499aX.Xd() ^ 1134249832))));
        int iXd3 = C1580rY.Xd() ^ (105986366 ^ (-936914221));
        short sXd4 = (short) (C1580rY.Xd() ^ (1368417249 ^ (-1368409198)));
        int[] iArr3 = new int["pf~h0meqe+Sslbjb".length()];
        QB qb3 = new QB("pf~h0meqe+Sslbjb");
        int i5 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i5] = xuXd3.fK((sXd4 ^ i5) + xuXd3.CK(iKK3));
            i5++;
        }
        clsArr[iXd3] = Class.forName(new String(iArr3, 0, i5));
        Object[] objArr = new Object[C1580rY.Xd() ^ (-831067156)];
        objArr[0] = callback;
        objArr[1] = iDNowSecuritySuite;
        objArr[(236512550 ^ 1368073044) ^ 1603520112] = str;
        objArr[(967275746 ^ 1337201965) ^ 1980981708] = str2;
        objArr[Od.Xd() ^ (1159949108 ^ 48168805)] = str3;
        objArr[195917585 ^ 195917588] = str4;
        objArr[(985388937 ^ 2125724929) ^ 1141385870] = str5;
        objArr[709202849 ^ 709202854] = str6;
        objArr[(740921356 ^ 531812658) ^ 865812790] = str7;
        objArr[C1580rY.Xd() ^ (886013629 ^ (-88500907))] = str8;
        objArr[(480875547 ^ 1031979605) ^ 556488260] = str9;
        objArr[2117697544 ^ 2117697539] = str10;
        objArr[OY.Xd() ^ 69929188] = str11;
        Method declaredMethod = cls.getDeclaredMethod(Qg.kd("\u001c\u001c\b\u0018\u0019r\u0011\u0004\u0010\u0001\u0011\u0002\u0006\n\u0002=\u0005x\u0004wxt6A", (short) (FB.Xd() ^ (C1633zX.Xd() ^ (-1951468625))), (short) (FB.Xd() ^ (2030149031 ^ 2030172514))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public IDNowSecuritySuite(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        System.loadLibrary(hg.Vd("<ba]cfZS\u001c<\\c", (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (481851659 ^ (-1760109952)))), (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (-1951470452)))));
    }

    private static final void retrieveZoomAuthData$lambda$1(Callback callback, IDNowSecuritySuite iDNowSecuritySuite, String str, String str2, String str3, String str4, String str5) throws Exception {
        short sXd = (short) (FB.Xd() ^ (824954059 ^ 824940745));
        int[] iArr = new int["{:7A@534;".length()];
        QB qb = new QB("{:7A@534;");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(callback, new String(iArr, 0, i2));
        Intrinsics.checkNotNullParameter(iDNowSecuritySuite, C1561oA.yd("D9;Fw\u0005", (short) (C1499aX.Xd() ^ ((342223142 ^ 157837627) ^ (-487447639)))));
        Intrinsics.checkNotNullParameter(str, C1561oA.Yd("h@676\u00164/2<25%A>9C", (short) (FB.Xd() ^ (1960553014 ^ 1960550512))));
        short sXd2 = (short) (ZN.Xd() ^ (973648271 ^ 973649385));
        short sXd3 = (short) (ZN.Xd() ^ (2094412028 ^ 2094412518));
        int[] iArr2 = new int["K#\u0019\u001a\u0019x\u0017\u0012\u0015\u001f\u0015\u0018\b\u001a.+".length()];
        QB qb2 = new QB("K#\u0019\u001a\u0019x\u0017\u0012\u0015\u001f\u0015\u0018\b\u001a.+");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
            i3++;
        }
        Intrinsics.checkNotNullParameter(str2, new String(iArr2, 0, i3));
        Intrinsics.checkNotNullParameter(str3, Jg.Wd("J4,Cd^\u0007\u000bw\b\t\u0004El", (short) (OY.Xd() ^ (C1580rY.Xd() ^ (1139329458 ^ (-1919003501)))), (short) (OY.Xd() ^ (C1499aX.Xd() ^ (1512630245 ^ (-431206427))))));
        Intrinsics.checkNotNullParameter(str4, ZO.xd(",\u0001\u0017b!G\u001fA", (short) (OY.Xd() ^ (FB.Xd() ^ 1609507233)), (short) (OY.Xd() ^ ((1452273432 ^ 1360576397) ^ 127337883))));
        Intrinsics.checkNotNullParameter(str5, C1626yg.Ud("\u0017\u0016V4l0m\u001d", (short) (C1607wl.Xd() ^ ((2459650 ^ 330316688) ^ 328576356)), (short) (C1607wl.Xd() ^ (C1633zX.Xd() ^ (917910517 ^ (-1122464699))))));
        Companion companion = Companion;
        Class<?> cls = Class.forName(Ig.wd("}YuM\u0005MN\u0001kio\u0013ZU\u0002Q\u001a%\u007f\u00055dWI4\u007fl\u0018SUQ\"|Ua)IskSb;\u001d1\np\u0017ga\u0015U}q]\rJKI \f\u0015*\u000bB%\u0019D\u0010IFT]", (short) (Od.Xd() ^ (FB.Xd() ^ (-1609507160)))));
        Class<?>[] clsArr = new Class[1];
        short sXd4 = (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (-1951491823)));
        int[] iArr3 = new int["\u001dyGjt\u0014Dp$ ${)e:R!\"6D\u000bXw\u0001\u0005[\u0011\u0004'7[t\u00119".length()];
        QB qb3 = new QB("\u001dyGjt\u0014Dp$ ${)e:R!\"6D\u000bXw\u0001\u0005[\u0011\u0004'7[t\u00119");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd4 + sXd4) + i4)) + xuXd3.CK(iKK3));
            i4++;
        }
        clsArr[0] = Class.forName(new String(iArr3, 0, i4));
        Object[] objArr = {callback};
        Method method = cls.getMethod(C1561oA.Qd("\bx\u0007Zt}}\u0005Olvujhip", (short) (C1580rY.Xd() ^ (OY.Xd() ^ (-69950781)))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(companion, objArr);
            iDNowSecuritySuite.getReactApplicationContext().addActivityEventListener(iDNowSecuritySuite);
            Activity currentActivity = iDNowSecuritySuite.getReactApplicationContext().getCurrentActivity();
            Intrinsics.checkNotNull(currentActivity);
            Activity currentActivity2 = iDNowSecuritySuite.getReactApplicationContext().getCurrentActivity();
            Intrinsics.checkNotNull(currentActivity2);
            new IDGetFaceController.Builder(currentActivity, currentActivity2).zoomLicenceKey(str).zoomLicenceText(str2).zoomPublicKey(str3).zoomUrl(str4).Intents(Integer.valueOf(Integer.parseInt(str5))).Build().Start();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static final void startOnboarding$lambda$0(Callback callback, IDNowSecuritySuite iDNowSecuritySuite, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) throws Exception {
        short sXd = (short) (ZN.Xd() ^ ((250516328 ^ 268263608) ^ 18062599));
        short sXd2 = (short) (ZN.Xd() ^ (1845801842 ^ 1845794238));
        int[] iArr = new int["Y\u001a\u0019%&\u001d\u001d )".length()];
        QB qb = new QB("Y\u001a\u0019%&\u001d\u001d )");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        Intrinsics.checkNotNullParameter(callback, new String(iArr, 0, i2));
        Intrinsics.checkNotNullParameter(iDNowSecuritySuite, C1561oA.od("[NNW\u0007\u0012", (short) (C1580rY.Xd() ^ ((1470002822 ^ 615568346) ^ (-1932437216)))));
        short sXd3 = (short) (C1580rY.Xd() ^ (C1580rY.Xd() ^ 831086095));
        int[] iArr2 = new int["={\f\u0006r\u0012\u0005\u0013".length()];
        QB qb2 = new QB("={\f\u0006r\u0012\u0005\u0013");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd3 + sXd3) + i3));
            i3++;
        }
        Intrinsics.checkNotNullParameter(str, new String(iArr2, 0, i3));
        Intrinsics.checkNotNullParameter(str2, Wg.Zd("\u0002W\u001fL\u0003q>", (short) (C1633zX.Xd() ^ (408347903 ^ (-408352762))), (short) (C1633zX.Xd() ^ ((1047063544 ^ 1104653416) ^ (-2143247842)))));
        Intrinsics.checkNotNullParameter(str3, C1561oA.Xd("q7?DF(FA", (short) (OY.Xd() ^ (321720477 ^ 321720299))));
        Intrinsics.checkNotNullParameter(str4, Wg.vd("\fJRJRQKQ", (short) (ZN.Xd() ^ (1876110559 ^ 1876123677))));
        Intrinsics.checkNotNullParameter(str5, Qg.kd("H\u0005\u0013\u0012i\u0004", (short) (ZN.Xd() ^ (C1607wl.Xd() ^ 1849956424)), (short) (ZN.Xd() ^ (C1499aX.Xd() ^ (-1134241173)))));
        Intrinsics.checkNotNullParameter(str6, hg.Vd("\u0007HPRV?O@@>\"H", (short) (ZN.Xd() ^ (ZN.Xd() ^ 864707712)), (short) (ZN.Xd() ^ (C1499aX.Xd() ^ (-1134246260)))));
        short sXd4 = (short) (OY.Xd() ^ (C1580rY.Xd() ^ (-831091810)));
        int[] iArr3 = new int[":\u000b\bx\u0005Zt".length()];
        QB qb3 = new QB(":\u000b\bx\u0005Zt");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(sXd4 + i4 + xuXd3.CK(iKK3));
            i4++;
        }
        Intrinsics.checkNotNullParameter(str7, new String(iArr3, 0, i4));
        Intrinsics.checkNotNullParameter(str8, C1561oA.yd("yLG:D'IA3", (short) (C1580rY.Xd() ^ (FB.Xd() ^ (118008721 ^ (-1491583763))))));
        short sXd5 = (short) (C1633zX.Xd() ^ (C1607wl.Xd() ^ (-1849958204)));
        int[] iArr4 = new int["\u001d]jqkrqy".length()];
        QB qb4 = new QB("\u001d]jqkrqy");
        int i5 = 0;
        while (qb4.YK()) {
            int iKK4 = qb4.KK();
            Xu xuXd4 = Xu.Xd(iKK4);
            iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (((sXd5 + sXd5) + sXd5) + i5));
            i5++;
        }
        Intrinsics.checkNotNullParameter(str9, new String(iArr4, 0, i5));
        short sXd6 = (short) (FB.Xd() ^ (C1607wl.Xd() ^ (2078255098 ^ 362535264)));
        short sXd7 = (short) (FB.Xd() ^ (1525359371 ^ 1525367152));
        int[] iArr5 = new int["9{\u0006\u000b\t\u0007\bp\u0017\u000f\u0005".length()];
        QB qb5 = new QB("9{\u0006\u000b\t\u0007\bp\u0017\u000f\u0005");
        int i6 = 0;
        while (qb5.YK()) {
            int iKK5 = qb5.KK();
            Xu xuXd5 = Xu.Xd(iKK5);
            iArr5[i6] = xuXd5.fK((xuXd5.CK(iKK5) - (sXd6 + i6)) + sXd7);
            i6++;
        }
        Intrinsics.checkNotNullParameter(str10, new String(iArr5, 0, i6));
        Intrinsics.checkNotNullParameter(str11, Jg.Wd("gl\u001eb(@\u0002HwI\u0002Dq\u001au", (short) (FB.Xd() ^ (C1607wl.Xd() ^ (2147234826 ^ 297276522))), (short) (FB.Xd() ^ (823584661 ^ 823559283))));
        Companion companion = Companion;
        Class<?> cls = Class.forName(ZO.xd("MQC\u000e'\"\u0018BM\u0004M;/\tE'40V2\u001bf\t0)\u0015Z&,'T[Tk=W\u0018Q<\u0007ii\u0013\u0018S8%>\u0007'ZXokm~lPp=4lsqN\"\u000fguk(U", (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ (1315061370 ^ 976435847))), (short) (C1499aX.Xd() ^ (C1607wl.Xd() ^ (2036494760 ^ (-388393513))))));
        Class<?>[] clsArr = {Class.forName(C1626yg.Ud("\"\u001c|Cj\u0018j\r\u000b7L\n\\!B#W|N|n<\u000eTch\u001d3(Go33=", (short) (C1607wl.Xd() ^ (C1499aX.Xd() ^ (-1134260255))), (short) (C1607wl.Xd() ^ (1952547753 ^ 1952573314))))};
        Object[] objArr = {callback};
        short sXd8 = (short) (ZN.Xd() ^ (Od.Xd() ^ 1207821733));
        int[] iArr6 = new int["\u0013Utk\u00051 \u000f\u000bgv\u0017A0X|".length()];
        QB qb6 = new QB("\u0013Utk\u00051 \u000f\u000bgv\u0017A0X|");
        int i7 = 0;
        while (qb6.YK()) {
            int iKK6 = qb6.KK();
            Xu xuXd6 = Xu.Xd(iKK6);
            iArr6[i7] = xuXd6.fK(xuXd6.CK(iKK6) - (C1561oA.Xd[i7 % C1561oA.Xd.length] ^ (sXd8 + i7)));
            i7++;
        }
        Method method = cls.getMethod(new String(iArr6, 0, i7), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(companion, objArr);
            iDNowSecuritySuite.getReactApplicationContext().addActivityEventListener(iDNowSecuritySuite);
            IDSecurityApiImpl iDSecurityApiImpl = new IDSecurityApiImpl();
            IDCredentials iDCredentials = new IDCredentials(str, str2);
            IDBaseUrl iDBaseUrl = new IDBaseUrl(EO.Od("W8gV\u0002_AAbfs\u0014U[Cq", (short) (OY.Xd() ^ (835873499 ^ 835862146))));
            iDBaseUrl.setDns(str3);
            Activity currentActivity = iDNowSecuritySuite.getReactApplicationContext().getCurrentActivity();
            Intrinsics.checkNotNull(currentActivity);
            Activity currentActivity2 = iDNowSecuritySuite.getReactApplicationContext().getCurrentActivity();
            Intrinsics.checkNotNull(currentActivity2);
            iDSecurityApiImpl.initSDK(currentActivity, currentActivity2, iDCredentials, iDBaseUrl);
            CommonParamsRequest commonParamsRequest = new CommonParamsRequest();
            commonParamsRequest.setChannel(str4);
            commonParamsRequest.setAppId(str5);
            commonParamsRequest.setForwaredIp(str6);
            commonParamsRequest.setUserAgent(C1561oA.Qd("pm^jX]Zbg", (short) (C1499aX.Xd() ^ (701503708 ^ (-701524358)))));
            commonParamsRequest.setLocation(C1593ug.zd("utwxyzw|{~\u007f\u0001\u0002", (short) (C1580rY.Xd() ^ (161585606 ^ (-161590173))), (short) (C1580rY.Xd() ^ (1002461613 ^ (-1002467293)))));
            commonParamsRequest.setDeviceBehSign("");
            CommonUserDataRequest commonUserDataRequest = new CommonUserDataRequest();
            commonUserDataRequest.setUserId(str7);
            commonUserDataRequest.setUserType(str8);
            commonUserDataRequest.setEnterpriseCode("");
            IDNowOnboardingConfiguration iDNowOnboardingConfiguration = new IDNowOnboardingConfiguration();
            Integer numValueOf = Integer.valueOf(829038187 ^ 829038184);
            iDNowOnboardingConfiguration.setMaxBackAttemps(numValueOf);
            iDNowOnboardingConfiguration.setMaxFrontAttemps(numValueOf);
            iDNowOnboardingConfiguration.setMaxSelfieAttemps(numValueOf);
            iDNowOnboardingConfiguration.setCommonParams(commonParamsRequest);
            iDNowOnboardingConfiguration.setCommonUserData(commonUserDataRequest);
            iDNowOnboardingConfiguration.setCountry(str9);
            iDNowOnboardingConfiguration.setDeviceData(null);
            iDNowOnboardingConfiguration.setEnrollType(str10);
            iDNowOnboardingConfiguration.setNotificationId(str11);
            iDNowOnboardingConfiguration.setUserId(str7);
            iDNowOnboardingConfiguration.setUserType(str8);
            iDNowOnboardingConfiguration.setTypeSegment("");
            iDNowOnboardingConfiguration.setUserData(null);
            iDNowOnboardingConfiguration.setCustomization(new IDNowOnboardingCustomization());
            Activity currentActivity3 = iDNowSecuritySuite.getReactApplicationContext().getCurrentActivity();
            Intrinsics.checkNotNull(currentActivity3);
            Activity currentActivity4 = iDNowSecuritySuite.getReactApplicationContext().getCurrentActivity();
            Intrinsics.checkNotNull(currentActivity4);
            new StartIdNowOnboarding.Builder(currentActivity3, currentActivity4).config(iDNowOnboardingConfiguration).Build().Start();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @ReactMethod
    public final void clearEnrollment(Callback callback) throws Throwable {
        Intrinsics.checkNotNullParameter(callback, C1561oA.od("TQ[ZOMNU", (short) (C1633zX.Xd() ^ ((1585309523 ^ 1039829267) ^ (-1669808326)))));
        Companion companion = Companion;
        Class<?> cls = Class.forName(C1561oA.Kd("1>=~64J>L@=G><\nA?UIWKHRIGHXY\u0018M^VRVUd g]Xdfo'C?JluRedwumy\u007fZ}r~p0P}|\u0001r\u0001|\u0004\u0004", (short) (FB.Xd() ^ (ZN.Xd() ^ 864709673))));
        Class<?>[] clsArr = {Class.forName(Wg.Zd("\u0016zTa6\tGe.\u0014o(Gcb;x\"88%4*\n\u00148&@'\u0004A\\[?", (short) (C1633zX.Xd() ^ (168280131 ^ (-168277841))), (short) (C1633zX.Xd() ^ ((1588215071 ^ 365173388) ^ (-1265506149)))))};
        Object[] objArr = {callback};
        short sXd = (short) (Od.Xd() ^ (C1607wl.Xd() ^ (-1849980603)));
        int[] iArr = new int["[N^4P[]f3R^_VVYb".length()];
        QB qb = new QB("[N^4P[]f3R^_VVYb");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(companion, objArr);
            try {
                IDSecurityApiImpl iDSecurityApiImpl = new IDSecurityApiImpl();
                Activity currentActivity = getReactApplicationContext().getCurrentActivity();
                Activity currentActivity2 = getReactApplicationContext().getCurrentActivity();
                Intrinsics.checkNotNull(currentActivity);
                Intrinsics.checkNotNull(currentActivity2);
                String json = new Gson().toJson(iDSecurityApiImpl.clearEnrollment(currentActivity, currentActivity2));
                Class<?> cls2 = Class.forName(Wg.vd("_lk-\\Zpdznkudb0gMcWeQNXOUVfg\u001eSd\\\u0001\u0005\u0004\u0013F\u000e\u0004~\u0013\u0015\u001eUiep\u0013\u0004`sr}{s\u007f\u000eh\f\u0001\u0005v6V,+/!'#**", (short) (C1633zX.Xd() ^ (1876573581 ^ (-1876579795)))));
                Class<?>[] clsArr2 = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd2 = (short) (OY.Xd() ^ (1193341483 ^ 1193340019));
                short sXd3 = (short) (OY.Xd() ^ ((2048133913 ^ 187229315) ^ 1899799019));
                int[] iArr2 = new int["1.<\u0010*33:\u0005\",+ \u001e\u001f&".length()];
                QB qb2 = new QB("1.<\u0010*33:\u0005\",+ \u001e\u001f&");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
                    i3++;
                }
                Method method2 = cls2.getMethod(new String(iArr2, 0, i3), clsArr2);
                try {
                    method2.setAccessible(true);
                    ((Callback) method2.invoke(companion, objArr2)).invoke(json);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (IllegalViewOperationException unused) {
                Companion companion2 = Companion;
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(hg.Vd("{\u0007\u0004Cxt\tz\u0007xs{pl8mi}o{mhpea`nm*]lb\\^[h\"g[T^^e\u001b5/8X_:KHYUKUY2SFP@}\u001cGDF6B<A?", (short) (FB.Xd() ^ ((1905259025 ^ 1767690063) ^ 416500677)), (short) (FB.Xd() ^ ((2023087858 ^ 1954383672) ^ 216534881)))).getMethod(C1561oA.ud("mjxLfoovA^hg\\Z[b", (short) (OY.Xd() ^ ((87113952 ^ 1897001150) ^ 1948317902))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    ((Callback) method3.invoke(companion2, objArr3)).invoke(C1561oA.yd("z}", (short) (C1580rY.Xd() ^ (571761939 ^ (-571767140)))));
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    @ReactMethod
    public final void deleteAllTransactions(Callback callback) throws Throwable {
        String strYd = C1561oA.Yd("\u0007&\u0016$*\u0019\u001c\u001d$++#2_\u0006.,1.4(,*=", (short) (FB.Xd() ^ (ZN.Xd() ^ 864708612)));
        Intrinsics.checkNotNullParameter(callback, Xg.qd("ONZ[RRU^", (short) (Od.Xd() ^ (Od.Xd() ^ (-1207806145))), (short) (Od.Xd() ^ (C1499aX.Xd() ^ 1134251335))));
        Companion companion = Companion;
        int iXd = C1607wl.Xd() ^ (731350513 ^ 1171498253);
        int iXd2 = C1499aX.Xd() ^ (-1134248478);
        short sXd = (short) (C1607wl.Xd() ^ iXd);
        short sXd2 = (short) (C1607wl.Xd() ^ iXd2);
        int[] iArr = new int["\"D]9\f$P]\u0006\u0014+P]u\\.Fv\u0002*8Nr\u0004\u00184^yQ!HZq\u0010)M#\u0005\u0015+Qi\f]\u0014*P\t,\"Oh\u0016+=c\u0003w5@gsM\u0007Nc\u0002\u000f7Mi\u0004".length()];
        QB qb = new QB("\"D]9\f$P]\u0006\u0014+P]u\\.Fv\u0002*8Nr\u0004\u00184^yQ!HZq\u0010)M#\u0005\u0015+Qi\f]\u0014*P\t,\"Oh\u0016+=c\u0003w5@gsM\u0007Nc\u0002\u000f7Mi\u0004");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = {Class.forName(ZO.xd("Z^d\u0011\u0005\u0006C,$jB\u0002bZ\b\u007f6\n 6BlhcT\u001e)QxAR\tgk", (short) (C1607wl.Xd() ^ ((763192438 ^ 1454520436) ^ 2077188417)), (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ (45171757 ^ 1827998997)))))};
        Object[] objArr = {callback};
        int iXd3 = FB.Xd() ^ (1318462072 ^ 293174581);
        int iXd4 = ZN.Xd() ^ 864683550;
        short sXd3 = (short) (FB.Xd() ^ iXd3);
        short sXd4 = (short) (FB.Xd() ^ iXd4);
        int[] iArr2 = new int["Y\u0014d|cD{$H,\u00075rs\u0019\u001b".length()];
        QB qb2 = new QB("Y\u0014d|cD{$H,\u00075rs\u0019\u001b");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(companion, objArr);
            try {
                new IDTransactionPersistence().deleteAllTransactions(getReactApplicationContext().getCurrentActivity());
                short sXd5 = (short) (C1580rY.Xd() ^ (1242204127 ^ (-1242231681)));
                int[] iArr3 = new int["fLV4\"BA\"Pxt\u001eE6\u0015R',dW\fQ~j|\u0017E\u0011V:t\u0015qTz@h\thjoV\u0014R|\u000e\u007fZR\fl6rlA\u0012\u001bP@,-y\u007fI\u001e _\u0001,'Ut".length()];
                QB qb3 = new QB("fLV4\"BA\"Pxt\u001eE6\u0015R',dW\fQ~j|\u0017E\u0011V:t\u0015qTz@h\thjoV\u0014R|\u000e\u007fZR\fl6rlA\u0012\u001bP@,-y\u007fI\u001e _\u0001,'Ut");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd5 + i4)));
                    i4++;
                }
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(new String(iArr3, 0, i4)).getMethod(EO.Od("O\u00056+?}RSA$%Kop\u00031", (short) (OY.Xd() ^ (988364394 ^ 988381045))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    ((Callback) method2.invoke(companion, objArr2)).invoke(strYd);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (IllegalViewOperationException unused) {
                Companion companion2 = Companion;
                short sXd6 = (short) (Od.Xd() ^ ((322010353 ^ 241247235) ^ (-491786965)));
                int[] iArr4 = new int["t\u007f|<qm\u0002s\u007fqltie1fbvhtfai^ZYgf#Ve[UWTa\u001b`TMWW^\u0014.(1QX3DARNDNR+L?I9v\u0015@=?/;5:8".length()];
                QB qb4 = new QB("t\u007f|<qm\u0002s\u007fqltie1fbvhtfai^ZYgf#Ve[UWTa\u001b`TMWW^\u0014.(1QX3DARNDNR+L?I9v\u0015@=?/;5:8");
                int i5 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i5] = xuXd4.fK(sXd6 + sXd6 + sXd6 + i5 + xuXd4.CK(iKK4));
                    i5++;
                }
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(new String(iArr4, 0, i5)).getMethod(C1593ug.zd("\f\u000b\u001bp\r\u0018\u001a#o\u000f\u001b\u001c\u0013\u0013\u0016\u001f", (short) (C1499aX.Xd() ^ ((1009863981 ^ 38524610) ^ (-1048240561))), (short) (C1499aX.Xd() ^ ((1900361748 ^ 222127047) ^ (-2088243587)))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    ((Callback) method3.invoke(companion2, objArr3)).invoke(strYd);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    @ReactMethod
    public final void deleteTransaction(String str, Callback callback) throws Throwable {
        String strOd = C1561oA.od("MjXdhUVUZ_]\u000e2XTWRVHJF", (short) (C1607wl.Xd() ^ ((1783202000 ^ 146999710) ^ 1653255495)));
        short sXd = (short) (C1580rY.Xd() ^ (1473870222 ^ (-1473852283)));
        int[] iArr = new int["HI>:+JQ".length()];
        QB qb = new QB("HI>:+JQ");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        Intrinsics.checkNotNullParameter(str, new String(iArr, 0, i2));
        Intrinsics.checkNotNullParameter(callback, Wg.Zd("O\u0019Ck\u0001\u001c)M", (short) (C1499aX.Xd() ^ (C1607wl.Xd() ^ (-1849958390))), (short) (C1499aX.Xd() ^ (812759518 ^ (-812773454)))));
        Companion companion = Companion;
        Class<?> cls = Class.forName(C1561oA.Xd("=JI\u000bB@VJXLISJH\u0016MKaUcWT^USTde$Yjb^bap,sidpr{3OKVx\u0002^qp\u0004\u0002y\u0006\ff\n~\u000b|<\\\n\t\r~\r\t\u0010\u0010", (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ (309858337 ^ 1373834650)))));
        Class<?>[] clsArr = {Class.forName(Wg.vd("KVS\u0013JDEFBNMH\nM?:[k$Wf\\VXU\u001d1NXWLJkr", (short) (ZN.Xd() ^ (1770173333 ^ 1770192469))))};
        Object[] objArr = {callback};
        int iXd = ZN.Xd() ^ 864684174;
        short sXd2 = (short) (FB.Xd() ^ (1358461765 ^ 1358451485));
        short sXd3 = (short) (FB.Xd() ^ iXd);
        int[] iArr2 = new int["yjxLfoovA^hg\\Z[b".length()];
        QB qb2 = new QB("yjxLfoovA^hg\\Z[b");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(companion, objArr);
            try {
                Activity currentActivity = getReactApplicationContext().getCurrentActivity();
                IDTransactionPersistence iDTransactionPersistence = new IDTransactionPersistence();
                iDTransactionPersistence.deleteTransaction(str, currentActivity);
                new Gson().toJson(iDTransactionPersistence.getTransactionsJson(currentActivity));
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(hg.Vd("v\u0002~>so\u0004u\u0002snvkg3hdxjvhck`\\[ih%Xg]WYVc\u001dbVOYY`\u00160*3SZ5FCTPFPT-NAK;x\u0017B?A1=7<:", (short) (C1633zX.Xd() ^ (91859016 ^ (-91856057))), (short) (C1633zX.Xd() ^ (564674573 ^ (-564684345))))).getMethod(C1561oA.ud("\b\u0005\u0013f\u0001\n\n\u0011[x\u0003\u0002vtu|", (short) (C1633zX.Xd() ^ ((842232342 ^ 1030542449) ^ (-257940851)))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    ((Callback) method2.invoke(companion, objArr2)).invoke(strOd);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (IllegalViewOperationException unused) {
                Companion companion2 = Companion;
                short sXd4 = (short) (C1607wl.Xd() ^ (250212430 ^ 250209247));
                int[] iArr3 = new int["/:7v40D6:,'/,(s)=QCOIDLA54BA\u00069H>PRO\\\u001ecWPRRY\u000f1+4TsN_\\uqgqmFgZl\\\u001a8zwyi}w|z".length()];
                QB qb3 = new QB("/:7v40D6:,'/,(s)=QCOIDLA54BA\u00069H>PRO\\\u001ecWPRRY\u000f1+4TsN_\\uqgqmFgZl\\\u001a8zwyi}w|z");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd4 ^ i4));
                    i4++;
                }
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(new String(iArr3, 0, i4)).getMethod(C1561oA.Yd("yx\t^z\u0006\b\u0011]|\t\n\u0001\u0001\u0004\r", (short) (C1633zX.Xd() ^ (148051782 ^ (-148060804)))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    ((Callback) method3.invoke(companion2, objArr3)).invoke(strOd);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    @ReactMethod
    public final void generateCommitGenericStepRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Callback callback) throws Throwable {
        int iXd = C1580rY.Xd() ^ 831076254;
        int iXd2 = C1633zX.Xd() ^ 1951468051;
        short sXd = (short) (C1499aX.Xd() ^ iXd);
        short sXd2 = (short) (C1499aX.Xd() ^ iXd2);
        int[] iArr = new int[":@:HIAI".length()];
        QB qb = new QB(":@:HIAI");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        Intrinsics.checkNotNullParameter(str, new String(iArr, 0, i2));
        int iXd3 = ZN.Xd() ^ (-864693632);
        int iXd4 = C1580rY.Xd() ^ (694007007 ^ 416587176);
        short sXd3 = (short) (Od.Xd() ^ iXd3);
        short sXd4 = (short) (Od.Xd() ^ iXd4);
        int[] iArr2 = new int["x5B4X".length()];
        QB qb2 = new QB("x5B4X");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd4) ^ sXd3));
            i3++;
        }
        Intrinsics.checkNotNullParameter(str2, new String(iArr2, 0, i3));
        Intrinsics.checkNotNullParameter(str3, ZO.xd("\rJ\u000efK\u0018`xQ#", (short) (C1633zX.Xd() ^ (OY.Xd() ^ (-69954501))), (short) (C1633zX.Xd() ^ (Od.Xd() ^ (-1207803887)))));
        Intrinsics.checkNotNullParameter(str4, C1626yg.Ud("\u0003\ry\u001f\r'\u0010\u0014\u0013", (short) (Od.Xd() ^ (ZN.Xd() ^ (-864686197))), (short) (Od.Xd() ^ (Od.Xd() ^ (504415471 ^ (-1508724721))))));
        short sXd5 = (short) (OY.Xd() ^ (1421608735 ^ 1421634101));
        int[] iArr3 = new int["\u0005XX||;".length()];
        QB qb3 = new QB("\u0005XX||;");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd5 + i4)));
            i4++;
        }
        Intrinsics.checkNotNullParameter(str5, new String(iArr3, 0, i4));
        Intrinsics.checkNotNullParameter(str6, EO.Od("!X8&oI\\\u0002", (short) (C1607wl.Xd() ^ (1535515382 ^ 1535518922))));
        Intrinsics.checkNotNullParameter(str7, C1561oA.Qd(".6;+745+4%\u0002-!!", (short) (Od.Xd() ^ (OY.Xd() ^ (1211221710 ^ (-1276808991))))));
        Intrinsics.checkNotNullParameter(str8, C1593ug.zd("cUi^@\\", (short) (Od.Xd() ^ (1088966971 ^ (-1088963042))), (short) (Od.Xd() ^ (C1607wl.Xd() ^ (469449349 ^ (-1975481839))))));
        Intrinsics.checkNotNullParameter(callback, C1561oA.od("dakj_]^e", (short) (C1607wl.Xd() ^ ((473339393 ^ 704962553) ^ 909253648))));
        Companion companion = Companion;
        Class<?> cls = Class.forName(C1561oA.Kd(",98y1/E9G;8B97\u0005<:PDRFCMDBCST\u0013HYQMQP_\u001bbXS_aj\">:EgpM`_rphtzUxmyk+Kxw{m{w~~", (short) (FB.Xd() ^ (1995889369 ^ 1995895152))));
        Class<?>[] clsArr = new Class[1];
        int iXd5 = FB.Xd() ^ (648661424 ^ (-2034677273));
        short sXd6 = (short) (C1580rY.Xd() ^ (372707415 ^ (-372726864)));
        short sXd7 = (short) (C1580rY.Xd() ^ iXd5);
        int[] iArr4 = new int[",2>x?$D0:aOe\u0016dU\\lw?m\fl\u0005q}`c\u001c\u0015\u001c\u0010\u0019)+".length()];
        QB qb4 = new QB(",2>x?$D0:aOe\u0016dU\\lw?m\fl\u0005q}`c\u001c\u0015\u001c\u0010\u0019)+");
        int i5 = 0;
        while (qb4.YK()) {
            int iKK4 = qb4.KK();
            Xu xuXd4 = Xu.Xd(iKK4);
            iArr4[i5] = xuXd4.fK(((i5 * sXd7) ^ sXd6) + xuXd4.CK(iKK4));
            i5++;
        }
        clsArr[0] = Class.forName(new String(iArr4, 0, i5));
        Object[] objArr = {callback};
        Method method = cls.getMethod(C1561oA.Xd("4'7\r)46?\f+78//2;", (short) (C1499aX.Xd() ^ ((2140945229 ^ 1977846024) ^ (-176129354)))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(companion, objArr);
            try {
                IDSecurityApiImpl iDSecurityApiImpl = new IDSecurityApiImpl();
                CommonParamsRequest commonParamsRequest = new CommonParamsRequest();
                commonParamsRequest.setAppId(str2);
                commonParamsRequest.setChannel(str);
                commonParamsRequest.setForwaredIp(str3);
                commonParamsRequest.setUserAgent(str4);
                CommonUserDataRequest commonUserDataRequest = new CommonUserDataRequest();
                commonUserDataRequest.setEnterpriseCode(str7);
                commonUserDataRequest.setUserId(str5);
                commonUserDataRequest.setUserType(str6);
                Activity currentActivity = getReactApplicationContext().getCurrentActivity();
                Activity currentActivity2 = getReactApplicationContext().getCurrentActivity();
                ArrayList<KeyValue> arrayList = new ArrayList<>();
                Intrinsics.checkNotNull(currentActivity);
                Intrinsics.checkNotNull(currentActivity2);
                String json = new Gson().toJson(iDSecurityApiImpl.generateCommitGenericStepRequest(currentActivity, currentActivity2, commonParamsRequest, commonUserDataRequest, arrayList, str8).getCommitGenericStepRequest());
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(Wg.vd("fqr2c_wiqcbj[W'\\Th^jXS_TLK]\\\u0015H[Q\b\n\u000b\u0018M\u0013\u000b\u0004\n\n\u0015J`Zg\b\u000bezw\u0005\u0001z\u0005\u0005]\u0003u{k-K2/5%-'0.", (short) (ZN.Xd() ^ ((415166513 ^ 678492682) ^ 818813417)))).getMethod(Qg.kd("HES'AJJQ\u001c9CB756=", (short) (C1580rY.Xd() ^ (452263847 ^ (-452237666))), (short) (C1580rY.Xd() ^ (2132651229 ^ (-2132659446)))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    ((Callback) method2.invoke(companion, objArr2)).invoke(json);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (IllegalViewOperationException unused) {
                Companion companion2 = Companion;
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(hg.Vd("R]Z\u001aOK_Q]OJRGC\u000fD@TFRD?G<87ED\u00014C9352?x>2+55<q\f\u0006\u000f/6\u0011\"\u001f0,\",0\t*\u001d'\u0017Tr\u001e\u001b\u001d\r\u0019\u0013\u0018\u0016", (short) (C1633zX.Xd() ^ (269552325 ^ (-269553528))), (short) (C1633zX.Xd() ^ ((788773682 ^ 525493099) ^ (-810676212))))).getMethod(C1561oA.ud("daoC]ffm8U_^SQRY", (short) (C1580rY.Xd() ^ ((2041647743 ^ 922328719) ^ (-1330164675)))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    ((Callback) method3.invoke(companion2, objArr3)).invoke(C1561oA.yd("/2", (short) (C1499aX.Xd() ^ (72970938 ^ (-72958114)))));
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    @ReactMethod
    public final void generateFinishEnrollmentRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, Callback callback) throws Throwable {
        short sXd = (short) (C1607wl.Xd() ^ ((261503217 ^ 1369934745) ^ 1580327114));
        int[] iArr = new int["QWQ_`X`".length()];
        QB qb = new QB("QWQ_`X`");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        Intrinsics.checkNotNullParameter(str, new String(iArr, 0, i2));
        Intrinsics.checkNotNullParameter(str2, Xg.qd("cstNj", (short) (C1499aX.Xd() ^ ((1622507606 ^ 572089058) ^ (-1118601896))), (short) (C1499aX.Xd() ^ (FB.Xd() ^ (1130754084 ^ (-478868981))))));
        Intrinsics.checkNotNullParameter(str3, Jg.Wd("GIg3\u001aR\u0010\u0004uc", (short) (C1499aX.Xd() ^ ((1819832433 ^ 1828491798) ^ (-8699422))), (short) (C1499aX.Xd() ^ ((19166188 ^ 1456567755) ^ (-1475703264)))));
        Intrinsics.checkNotNullParameter(str4, ZO.xd("\u0019:\t\u0011\u0016=[?%", (short) (C1499aX.Xd() ^ (C1499aX.Xd() ^ 1134251907)), (short) (C1499aX.Xd() ^ (353730170 ^ (-353705517)))));
        Intrinsics.checkNotNullParameter(str5, C1626yg.Ud("L;\u0018\"1L", (short) (C1607wl.Xd() ^ (OY.Xd() ^ 69929373)), (short) (C1607wl.Xd() ^ (252318254 ^ 252326669))));
        Intrinsics.checkNotNullParameter(str6, Ig.wd("e\u0014se&\u001eE*", (short) (C1499aX.Xd() ^ (FB.Xd() ^ (-1609503387)))));
        Intrinsics.checkNotNullParameter(str7, EO.Od("I+?OT'EL\u001dcCI\t\u0010", (short) (FB.Xd() ^ ((508221106 ^ 2111164938) ^ 1671396437))));
        Intrinsics.checkNotNullParameter(callback, C1561oA.Qd("QNXWLJKR", (short) (C1633zX.Xd() ^ (17572085 ^ (-17580729)))));
        Companion companion = Companion;
        Object[] objArr = {callback};
        Method method = Class.forName(C1593ug.zd("s\u0001\u007fAxv\r\u0001\u000f\u0003\u007f\n\u0001~L\u0004\u0002\u0018\f\u001a\u000e\u000b\u0015\f\n\u000b\u001b\u001cZ\u0010!\u0019\u0015\u0019\u0018'b* \u001b')2i\u0006\u0002\r/8\u0015(':80<B\u001d@5A3r\u0013@?C5C?FF", (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ (1987382379 ^ 405874375))), (short) (C1607wl.Xd() ^ ((1334919074 ^ 1103936506) ^ 241020186)))).getMethod(C1561oA.Kd("zm}Soz|\u0006Rq}~uux\u0002", (short) (FB.Xd() ^ (FB.Xd() ^ (565977445 ^ 2119395280)))), Class.forName(C1561oA.od("fqn.e_`a]ihc%hZUVf\u001fRaWQSP\u0018,ISRGEFM", (short) (C1607wl.Xd() ^ (C1499aX.Xd() ^ (1916741547 ^ (-832850666)))))));
        try {
            method.setAccessible(true);
            method.invoke(companion, objArr);
            try {
                IDSecurityApiImpl iDSecurityApiImpl = new IDSecurityApiImpl();
                CommonParamsRequest commonParamsRequest = new CommonParamsRequest();
                commonParamsRequest.setAppId(str2);
                commonParamsRequest.setChannel(str);
                commonParamsRequest.setForwaredIp(str3);
                commonParamsRequest.setUserAgent(str4);
                CommonUserDataRequest commonUserDataRequest = new CommonUserDataRequest();
                commonUserDataRequest.setEnterpriseCode(str7);
                commonUserDataRequest.setUserId(str5);
                commonUserDataRequest.setUserType(str6);
                Activity currentActivity = getReactApplicationContext().getCurrentActivity();
                Activity currentActivity2 = getReactApplicationContext().getCurrentActivity();
                Intrinsics.checkNotNull(currentActivity);
                Intrinsics.checkNotNull(currentActivity2);
                String json = new Gson().toJson(iDSecurityApiImpl.generateFinishEnrollmentRequest(currentActivity, currentActivity2, commonParamsRequest, commonUserDataRequest, null).getFinishEnrollmentRequest());
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(Wg.Zd("\u000b\u001fhm\u007fA\"YF=\u0006Z\u001dmv\u0005N7&\bF\u000fg\"z?\u001a\u001e84\u0011S\u001bq,\u000eXs$rI\u0017je`_6\u001b\u007f\u001f}C*zmM\u001eL.vM\u0013\u00158A\u0007V\u000bt3\u0006\t", (short) (OY.Xd() ^ (2051030327 ^ 2051037220)), (short) (OY.Xd() ^ (1973057358 ^ 1973031316)))).getMethod(C1561oA.Xd("A@P&BMOX%DPQHHKT", (short) (FB.Xd() ^ (804501293 ^ 804497640))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    ((Callback) method2.invoke(companion, objArr2)).invoke(json);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (IllegalViewOperationException unused) {
                Companion companion2 = Companion;
                Class<?> cls = Class.forName(Wg.vd("\\gd$YUi[gYT\\QM\u0019NJ^P\\NIQFBAON\u000b>MC}\u007f|\nC\t|u\u007f\u007f\u0007<VPYy\u0001[lizvlvzStgqa\u001f=(%'\u0017#\u001d\" ", (short) (ZN.Xd() ^ (209244749 ^ 209248157))));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr3 = new Object[0];
                short sXd2 = (short) (OY.Xd() ^ (432432782 ^ 432421092));
                short sXd3 = (short) (OY.Xd() ^ (1309056890 ^ 1309054005));
                int[] iArr2 = new int["ebpD^ggn9V`_TRSZ".length()];
                QB qb2 = new QB("ebpD^ggn9V`_TRSZ");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
                    i3++;
                }
                Method method3 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                try {
                    method3.setAccessible(true);
                    ((Callback) method3.invoke(companion2, objArr3)).invoke(hg.Vd("mn", (short) (Od.Xd() ^ ((966643757 ^ 391316878) ^ (-785286452))), (short) (Od.Xd() ^ (1546479626 ^ (-1546471525)))));
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    @ReactMethod
    public final void generateGetRegisterPathRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Callback callback) throws Throwable {
        Intrinsics.checkNotNullParameter(str, C1561oA.ud("\u0018\u001c\u0014 \u001f\u0015\u001b", (short) (C1607wl.Xd() ^ (C1499aX.Xd() ^ (1359731795 ^ (-311467334))))));
        Intrinsics.checkNotNullParameter(str2, C1561oA.yd("o\u007f|Vn", (short) (OY.Xd() ^ (Od.Xd() ^ 1207810819))));
        Intrinsics.checkNotNullParameter(str3, C1561oA.Yd("WaekVh\\\\Bj", (short) (OY.Xd() ^ (1144760170 ^ 1144759393))));
        Intrinsics.checkNotNullParameter(str4, Xg.qd("-,\u001f-|$#-4", (short) (C1499aX.Xd() ^ (ZN.Xd() ^ (1434613182 ^ (-1711817038)))), (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ (253973514 ^ 2071096465)))));
        Intrinsics.checkNotNullParameter(str5, Jg.Wd("\u0014 \u000e)\u007f)", (short) (C1607wl.Xd() ^ (Od.Xd() ^ (1952159064 ^ 866524754))), (short) (C1607wl.Xd() ^ (FB.Xd() ^ 1609506465))));
        Intrinsics.checkNotNullParameter(str6, ZO.xd("Y!8>8d'p", (short) (C1607wl.Xd() ^ ((216413480 ^ 1914052384) ^ 2129677985)), (short) (C1607wl.Xd() ^ (C1499aX.Xd() ^ (-1134238603)))));
        Intrinsics.checkNotNullParameter(str7, C1626yg.Ud("\u001a\u000e$M0qrw\t^c*c<", (short) (C1580rY.Xd() ^ ((1719003162 ^ 1869710355) ^ (-151266493))), (short) (C1580rY.Xd() ^ (2071495383 ^ (-2071508193)))));
        Intrinsics.checkNotNullParameter(str8, Ig.wd("<\u001e%75\u001awb\r\"';\u0012 ", (short) (FB.Xd() ^ ((1327869947 ^ 1382705477) ^ 491760074))));
        Intrinsics.checkNotNullParameter(str9, EO.Od("w\u0012\u0002k\u001b\u0002 ", (short) (Od.Xd() ^ (ZN.Xd() ^ (13747239 ^ (-861654846))))));
        Intrinsics.checkNotNullParameter(callback, C1561oA.Qd("}z\u0005\u0004xvw~", (short) (Od.Xd() ^ (1931322073 ^ (-1931325065)))));
        Companion companion = Companion;
        Object[] objArr = {callback};
        Method method = Class.forName(C1593ug.zd("#0/p(&<0>2/90.{31G;I=:D;9:JK\n?PHDHGV\u0012YOJVXa\u001951<^gDWVig_kqLodpb\"Bonrdrnuu", (short) (FB.Xd() ^ (1831593727 ^ 1831570632)), (short) (FB.Xd() ^ (388227651 ^ 388220240)))).getMethod(C1561oA.Kd("NAQ'CNPY&EQRIILU", (short) (C1633zX.Xd() ^ (FB.Xd() ^ (-1609529935)))), Class.forName(C1561oA.od(".96u-'()%10+l0\"\u001d\u001e.f\u001a)\u001f\u0019\u001b\u0018_s\u0011\u001b\u001a\u000f\r\u000e\u0015", (short) (Od.Xd() ^ ((877504928 ^ 552658170) ^ (-347930879))))));
        try {
            method.setAccessible(true);
            method.invoke(companion, objArr);
            try {
                IDSecurityApiImpl iDSecurityApiImpl = new IDSecurityApiImpl();
                CommonParamsRequest commonParamsRequest = new CommonParamsRequest();
                commonParamsRequest.setAppId(str2);
                commonParamsRequest.setChannel(str);
                commonParamsRequest.setForwaredIp(str3);
                commonParamsRequest.setUserAgent(str4);
                CommonUserDataRequest commonUserDataRequest = new CommonUserDataRequest();
                commonUserDataRequest.setEnterpriseCode(str7);
                commonUserDataRequest.setUserId(str5);
                commonUserDataRequest.setUserType(str6);
                Activity currentActivity = getReactApplicationContext().getCurrentActivity();
                Activity currentActivity2 = getReactApplicationContext().getCurrentActivity();
                Intrinsics.checkNotNull(currentActivity);
                Intrinsics.checkNotNull(currentActivity2);
                String json = new Gson().toJson(iDSecurityApiImpl.generateGetRegisterPathRequest(currentActivity, currentActivity2, commonParamsRequest, commonUserDataRequest, str8, str9, null).getRegisterPathRequest());
                short sXd = (short) (OY.Xd() ^ ((1136569807 ^ 1386765019) ^ 286701643));
                short sXd2 = (short) (OY.Xd() ^ ((837961688 ^ 1975261960) ^ 1145974982));
                int[] iArr = new int["\u001c_\u0004\te\u001bv\u0010aj\u000f^x,?\u001ea\u000b$y\u0013E\u0013/t\u000b@\u0005hU,G\t#I\u001e|y7W)>lk-^-tE7m2j ]\rXJ\u0013M|$+pat\u001eW\u000b:\u0007,".length()];
                QB qb = new QB("\u001c_\u0004\te\u001bv\u0010aj\u000f^x,?\u001ea\u000b$y\u0013E\u0013/t\u000b@\u0005hU,G\t#I\u001e|y7W)>lk-^-tE7m2j ]\rXJ\u0013M|$+pat\u001eW\u000b:\u0007,");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                    i2++;
                }
                Class<?> cls = Class.forName(new String(iArr, 0, i2));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd3 = (short) (FB.Xd() ^ ((1766603331 ^ 1613071089) ^ 157929439));
                int[] iArr2 = new int["vu\u0006[w\u0003\u0005\u000eZy\u0006\u0007}}\u0001\n".length()];
                QB qb2 = new QB("vu\u0006[w\u0003\u0005\u000eZy\u0006\u0007}}\u0001\n");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i3));
                    i3++;
                }
                Method method2 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                try {
                    method2.setAccessible(true);
                    ((Callback) method2.invoke(companion, objArr2)).invoke(json);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (IllegalViewOperationException unused) {
                Companion companion2 = Companion;
                Class<?> cls2 = Class.forName(Wg.vd("dop0ie}o\u007fqpxqm=rRf\\h^YeZZYkj+^qgEGHU\u0013XPIWWb\u001860=]H#85JF@JR+PCQA\u0003!0-3#3-64", (short) (C1580rY.Xd() ^ (480805140 ^ (-480816389)))));
                Class<?>[] clsArr2 = new Class[0];
                Object[] objArr3 = new Object[0];
                short sXd4 = (short) (ZN.Xd() ^ ((134015909 ^ 1191610979) ^ 1090137953));
                short sXd5 = (short) (ZN.Xd() ^ ((2064482860 ^ 1343461496) ^ 723415761));
                int[] iArr3 = new int["QN\\0JSSZ%BLK@>?F".length()];
                QB qb3 = new QB("QN\\0JSSZ%BLK@>?F");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(((sXd4 + i4) + xuXd3.CK(iKK3)) - sXd5);
                    i4++;
                }
                Method method3 = cls2.getMethod(new String(iArr3, 0, i4), clsArr2);
                try {
                    method3.setAccessible(true);
                    Callback callback2 = (Callback) method3.invoke(companion2, objArr3);
                    short sXd6 = (short) (FB.Xd() ^ (1570357802 ^ 1570351475));
                    short sXd7 = (short) (FB.Xd() ^ ((324647009 ^ 2122544137) ^ 1843057386));
                    int[] iArr4 = new int["rs".length()];
                    QB qb4 = new QB("rs");
                    int i5 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i5] = xuXd4.fK(sXd6 + i5 + xuXd4.CK(iKK4) + sXd7);
                        i5++;
                    }
                    callback2.invoke(new String(iArr4, 0, i5));
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    @ReactMethod
    public final void generateInitEnrollmentRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Callback callback) throws Throwable {
        Intrinsics.checkNotNullParameter(str, C1561oA.ud(".2*65+1", (short) (C1633zX.Xd() ^ (C1633zX.Xd() ^ 1951485337))));
        Intrinsics.checkNotNullParameter(str2, C1561oA.yd("!1.\b(", (short) (C1580rY.Xd() ^ ((532743780 ^ 1892450779) ^ (-1863187020)))));
        short sXd = (short) (C1633zX.Xd() ^ (ZN.Xd() ^ (-864704359)));
        int[] iArr = new int["\u001f)-3\u001e0$$\n2".length()];
        QB qb = new QB("\u001f)-3\u001e0$$\n2");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        Intrinsics.checkNotNullParameter(str3, new String(iArr, 0, i2));
        Intrinsics.checkNotNullParameter(str4, Xg.qd("KJ=K\u001bBAKR", (short) (ZN.Xd() ^ (C1499aX.Xd() ^ (-1134246921))), (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (-1951468919)))));
        Intrinsics.checkNotNullParameter(str5, Jg.Wd("b2wW\u0002p", (short) (FB.Xd() ^ (Od.Xd() ^ (701346146 ^ 1848666664))), (short) (FB.Xd() ^ ((674295321 ^ 332214551) ^ 1006487709))));
        Intrinsics.checkNotNullParameter(str6, ZO.xd("\u00059R}\u001eiv>", (short) (C1580rY.Xd() ^ (1058984595 ^ (-1058987986))), (short) (C1580rY.Xd() ^ (916334159 ^ (-916353446)))));
        Intrinsics.checkNotNullParameter(str7, C1626yg.Ud("\u0005b7sv\u0018!\u0004\f%Cs];", (short) (ZN.Xd() ^ (2135183955 ^ 2135173050)), (short) (ZN.Xd() ^ ((641554865 ^ 1768010707) ^ 1331463595))));
        short sXd2 = (short) (C1580rY.Xd() ^ (2122091049 ^ (-2122113714)));
        int[] iArr2 = new int["o>ar ]/\u001e]\u0013\u0003\u0018Cl".length()];
        QB qb2 = new QB("o>ar ]/\u001e]\u0013\u0003\u0018Cl");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd2 + i3)));
            i3++;
        }
        Intrinsics.checkNotNullParameter(str8, new String(iArr2, 0, i3));
        Intrinsics.checkNotNullParameter(str9, EO.Od("gASs0\u0005&6\u0006lNQ\u0013\u000e", (short) (C1633zX.Xd() ^ ((1675386158 ^ 2145989444) ^ (-473242113)))));
        Intrinsics.checkNotNullParameter(callback, C1561oA.Qd("$!+*\u001f\u001d\u001e%", (short) (C1607wl.Xd() ^ ((724465638 ^ 1679924115) ^ 1326429615))));
        Companion companion = Companion;
        int iXd = Od.Xd() ^ 1207807302;
        short sXd3 = (short) (ZN.Xd() ^ (673118151 ^ 673092792));
        short sXd4 = (short) (ZN.Xd() ^ iXd);
        int[] iArr3 = new int["\"/.o'%;/=1.8/-z20F:H<9C:89IJ\t>OGCGFU\u0011XNIUW`\u001840;]fCVUhf^jpKncoa!Anmqcqmtt".length()];
        QB qb3 = new QB("\"/.o'%;/=1.8/-z20F:H<9C:89IJ\t>OGCGFU\u0011XNIUW`\u001840;]fCVUhf^jpKncoa!Anmqcqmtt");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd3 + i4)) - sXd4);
            i4++;
        }
        Object[] objArr = {callback};
        Method method = Class.forName(new String(iArr3, 0, i4)).getMethod(C1561oA.Kd("A4D\u001a6ACL\u00198DE<<?H", (short) (C1607wl.Xd() ^ ((777161073 ^ 6502029) ^ 775010586))), Class.forName(C1561oA.od("P[X\u0018OIJKGSRM\u000fRD?@P\t<KA;=:\u0002\u00163=<1/07", (short) (C1499aX.Xd() ^ (FB.Xd() ^ (-1609499666))))));
        try {
            method.setAccessible(true);
            method.invoke(companion, objArr);
            try {
                IDSecurityApiImpl iDSecurityApiImpl = new IDSecurityApiImpl();
                CommonParamsRequest commonParamsRequest = new CommonParamsRequest();
                commonParamsRequest.setAppId(str2);
                commonParamsRequest.setChannel(str);
                commonParamsRequest.setForwaredIp(str3);
                commonParamsRequest.setUserAgent(str4);
                CommonUserDataRequest commonUserDataRequest = new CommonUserDataRequest();
                commonUserDataRequest.setEnterpriseCode(str7);
                commonUserDataRequest.setUserId(str5);
                commonUserDataRequest.setUserType(str6);
                Activity currentActivity = getReactApplicationContext().getCurrentActivity();
                Activity currentActivity2 = getReactApplicationContext().getCurrentActivity();
                Intrinsics.checkNotNull(currentActivity);
                Intrinsics.checkNotNull(currentActivity2);
                String json = new Gson().toJson(iDSecurityApiImpl.generateInitEnrollmentRequest(currentActivity, currentActivity2, commonParamsRequest, commonUserDataRequest, null, null, str8, str9, null).getInitEnrollmentRequest());
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(Wg.Zd("K=\u001d<tWK\u007foD\".\u0002dt\th_TD\u0019RB\u001a\u0016wlKKaPM'\fk<X\u0001tTB\u0002k\u0005\u0002~kj9vfG_:\u0014aE\u0005\t{h?<=HL1\u0001o-\u0016v", (short) (ZN.Xd() ^ (193834711 ^ 193853666)), (short) (ZN.Xd() ^ ((1643630064 ^ 1111992064) ^ 598750808)))).getMethod(C1561oA.Xd("('7\r)46?\f+78//2;", (short) (FB.Xd() ^ ((60527682 ^ 1411108513) ^ 1468030269))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    ((Callback) method2.invoke(companion, objArr2)).invoke(json);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (IllegalViewOperationException unused) {
                Companion companion2 = Companion;
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(Wg.vd("[fg'`\\tfvhgohd4ii}s\u007fup|qqp\u0003\u0002Bu\t~|~\u007f\rJ\u0010\b\u0001\u000f\u000f\u001aOmgt\u0015 z\u0010\r\"\u001e\u0018\"*\u0003(\u001b)\u0019Zx(%+\u001b+%.,", (short) (C1633zX.Xd() ^ ((1981897366 ^ 1248271149) ^ (-1011229042))))).getMethod(Qg.kd("]Zh<V__f1NXWLJKR", (short) (OY.Xd() ^ (1177759431 ^ 1177747948)), (short) (OY.Xd() ^ (835285185 ^ 835276212))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    ((Callback) method3.invoke(companion2, objArr3)).invoke(hg.Vd(" !", (short) (C1607wl.Xd() ^ ((758034951 ^ 311717701) ^ 1069217383)), (short) (C1607wl.Xd() ^ ((143772808 ^ 715284509) ^ 573803725))));
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    @ReactMethod
    public final void generateOmittingEnrollStepRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Callback callback) throws Throwable {
        Intrinsics.checkNotNullParameter(str, C1561oA.ud("\n\u000e\u0006\u0012\u0011\u0007\r", (short) (FB.Xd() ^ (ZN.Xd() ^ (149159742 ^ 996801614)))));
        Intrinsics.checkNotNullParameter(str2, C1561oA.yd("gwxRf", (short) (FB.Xd() ^ (1010031383 ^ 1010022600))));
        Intrinsics.checkNotNullParameter(str3, C1561oA.Yd("1;?E0B66\u001cD", (short) (Od.Xd() ^ (ZN.Xd() ^ (318552205 ^ (-561432379))))));
        Intrinsics.checkNotNullParameter(str4, Xg.qd("hgZh8_^ho", (short) (Od.Xd() ^ (FB.Xd() ^ (1520249766 ^ (-91382889)))), (short) (Od.Xd() ^ ((724092369 ^ 742951843) ^ (-123739217)))));
        short sXd = (short) (C1607wl.Xd() ^ (840675757 ^ 840691731));
        short sXd2 = (short) (C1607wl.Xd() ^ ((1917757347 ^ 1906583535) ^ 65710200));
        int[] iArr = new int["\u007fRig$ ".length()];
        QB qb = new QB("\u007fRig$ ");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        Intrinsics.checkNotNullParameter(str5, new String(iArr, 0, i2));
        Intrinsics.checkNotNullParameter(str6, ZO.xd("nzA\u000e\";~\u001a", (short) (C1607wl.Xd() ^ ((1459614514 ^ 1283998294) ^ 444067174)), (short) (C1607wl.Xd() ^ (C1499aX.Xd() ^ (1493051141 ^ (-459636428))))));
        Intrinsics.checkNotNullParameter(str7, C1626yg.Ud("S\b2'p(Or?%\u001f:T\u007f", (short) (ZN.Xd() ^ (31902320 ^ 31895505)), (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (2050852587 ^ (-1270127792))))));
        Intrinsics.checkNotNullParameter(str8, Ig.wd("QqtJ)\u0018", (short) (Od.Xd() ^ (FB.Xd() ^ (1793046839 ^ (-892391127))))));
        Intrinsics.checkNotNullParameter(callback, EO.Od("&{J$d\t1b", (short) (Od.Xd() ^ (C1633zX.Xd() ^ 1951491733))));
        Companion companion = Companion;
        Class<?> cls = Class.forName(C1561oA.Qd("\u0005\u0010\rL\u0002}\u0012\u0004\u0010\u0002|\u0005yuAvr\u0007x\u0005vqynjiwv3fukegdq+pd]ggn$>8AahCTQb^T^b;\\OYI\u0007%PMO?KEJH", (short) (C1607wl.Xd() ^ (Od.Xd() ^ (1972757756 ^ 845685379)))));
        Class<?>[] clsArr = new Class[1];
        short sXd3 = (short) (OY.Xd() ^ (1017730462 ^ 1017733167));
        short sXd4 = (short) (OY.Xd() ^ ((75812815 ^ 357230595) ^ 298744104));
        int[] iArr2 = new int["q~}?xtwzx\u0007\b\u0005H\u000e\u0002~\u0002\u0014N\u0004\u0015\r\t\r\fUk\u000b\u0017\u0018\u000f\u000f\u0012\u001b".length()];
        QB qb2 = new QB("q~}?xtwzx\u0007\b\u0005H\u000e\u0002~\u0002\u0014N\u0004\u0015\r\t\r\fUk\u000b\u0017\u0018\u000f\u000f\u0012\u001b");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i3)) - sXd4);
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
        Object[] objArr = {callback};
        Method method = cls.getMethod(C1561oA.od("G8F\u001a4==D\u000f,65*()0", (short) (FB.Xd() ^ (743310778 ^ 743310513))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(companion, objArr);
            try {
                IDSecurityApiImpl iDSecurityApiImpl = new IDSecurityApiImpl();
                CommonParamsRequest commonParamsRequest = new CommonParamsRequest();
                commonParamsRequest.setAppId(str2);
                commonParamsRequest.setChannel(str);
                commonParamsRequest.setForwaredIp(str3);
                commonParamsRequest.setUserAgent(str4);
                CommonUserDataRequest commonUserDataRequest = new CommonUserDataRequest();
                commonUserDataRequest.setEnterpriseCode(str7);
                commonUserDataRequest.setUserId(str5);
                commonUserDataRequest.setUserType(str6);
                Activity currentActivity = getReactApplicationContext().getCurrentActivity();
                Activity currentActivity2 = getReactApplicationContext().getCurrentActivity();
                Intrinsics.checkNotNull(currentActivity);
                Intrinsics.checkNotNull(currentActivity2);
                String json = new Gson().toJson(iDSecurityApiImpl.generateOmmittingEnrollStepRequest(currentActivity, currentActivity2, commonParamsRequest, commonUserDataRequest, str8).getOmmitingEnrollRequest());
                short sXd5 = (short) (OY.Xd() ^ (608664842 ^ 608645776));
                int[] iArr3 = new int["gts5lj\u0001t\u0003vs}tr@wu\f\u007f\u000e\u0002~\t\u007f}~\u000f\u0010N\u0004\u0015\r\t\r\f\u001bV\u001e\u0014\u000f\u001b\u001d&]yu\u0001#,\t\u001c\u001b.,$06\u00114)5'f\u0007437)73::".length()];
                QB qb3 = new QB("gts5lj\u0001t\u0003vs}tr@wu\f\u007f\u000e\u0002~\t\u007f}~\u000f\u0010N\u0004\u0015\r\t\r\f\u001bV\u001e\u0014\u000f\u001b\u001d&]yu\u0001#,\t\u001c\u001b.,$06\u00114)5'f\u0007437)73::");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((sXd5 + sXd5) + i4));
                    i4++;
                }
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(new String(iArr3, 0, i4)).getMethod(Wg.Zd("HmF\u001aZ,&[p\u001cJ\u0004\u0007Adw", (short) (C1607wl.Xd() ^ ((891870290 ^ 563997580) ^ 347434637)), (short) (C1607wl.Xd() ^ ((182707848 ^ 1172238245) ^ 1329413990))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    ((Callback) method2.invoke(companion, objArr2)).invoke(json);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (IllegalViewOperationException unused) {
                Companion companion2 = Companion;
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(C1561oA.Xd("{\t\bI\u0001~\u0015\t\u0017\u000b\b\u0012\t\u0007T\f\n \u0014\"\u0016\u0013\u001d\u0014\u0012\u0013#$b\u0018)!\u001d! /j2(#/1:q\u000e\n\u00157@\u001d0/B@8DJ%H=I;z\u001bHGK=KGNN", (short) (C1580rY.Xd() ^ ((1984225756 ^ 1292913131) ^ (-995398896))))).getMethod(Wg.vd(":7E\u00193<<C\u000e+54)'(/", (short) (OY.Xd() ^ (1461754146 ^ 1461759994))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    ((Callback) method3.invoke(companion2, objArr3)).invoke(Qg.kd("ST", (short) (C1580rY.Xd() ^ ((1579918171 ^ 231464246) ^ (-1407191391))), (short) (C1580rY.Xd() ^ (1569933355 ^ (-1569928526)))));
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    @ReactMethod
    public final void generateUpdateNotificationIdRequest(String str, Callback callback) throws Throwable {
        Intrinsics.checkNotNullParameter(str, hg.Vd("DDH<8:30B6;9\u0013-", (short) (C1499aX.Xd() ^ (FB.Xd() ^ (-1609498846))), (short) (C1499aX.Xd() ^ ((765697700 ^ 1355727888) ^ (-2104324186)))));
        Intrinsics.checkNotNullParameter(callback, C1561oA.ud("NKUTIGHO", (short) (C1607wl.Xd() ^ (C1633zX.Xd() ^ (2082826874 ^ (-141828489))))));
        Companion companion = Companion;
        Object[] objArr = {callback};
        Method method = Class.forName(C1561oA.yd("*72s/-?3E92<75~6\u0018.\u001e,$!'\u001e !-.p&3+\u000b\u000f\n\u0019X \u0012\r\u001d\u001f$[{w~!\u000ejyx\u0010\u000e\u0002\u000e\u0018r\u0012\u0007\u0017\tDdvuugyuxx", (short) (C1633zX.Xd() ^ (1951314063 ^ (-1951325834))))).getMethod(Xg.qd("A4D\u001a6ACL\u00198DE<<?H", (short) (Od.Xd() ^ ((175790560 ^ 1781690076) ^ (-1615350758))), (short) (Od.Xd() ^ ((1642157156 ^ 1621066721) ^ (-25088086)))), Class.forName(C1561oA.Yd("?LK\rFBEHFTUR\u0016[OLOa\u001cQbZVZY#9Xde\\\\_h", (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ (466199631 ^ 708898919))))));
        try {
            method.setAccessible(true);
            method.invoke(companion, objArr);
            try {
                IDSecurityApiImpl iDSecurityApiImpl = new IDSecurityApiImpl();
                Activity currentActivity = getReactApplicationContext().getCurrentActivity();
                Activity currentActivity2 = getReactApplicationContext().getCurrentActivity();
                Intrinsics.checkNotNull(currentActivity);
                Intrinsics.checkNotNull(currentActivity2);
                String json = new Gson().toJson(iDSecurityApiImpl.generateUpdateNotificationIdRequest(currentActivity, currentActivity2, str));
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(Jg.Wd("}1#SuejQV<,%\u0007v3]2;!\u001e|ldNC79)Rzyd7. %K\u0006jWZOKpwf`tT$*\u0018\u0015\u0006lkg5K/%\n8KO@7\u0018\u0011vl_", (short) (FB.Xd() ^ ((1054819086 ^ 1135017357) ^ 2105123716)), (short) (FB.Xd() ^ (1870509244 ^ 1870500990)))).getMethod(ZO.xd("%\u001c\\Sx|\u001b_2\"2OS{RF", (short) (FB.Xd() ^ (1566986813 ^ 1566997941)), (short) (FB.Xd() ^ (501544631 ^ 501541459))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    ((Callback) method2.invoke(companion, objArr2)).invoke(json);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (IllegalViewOperationException unused) {
                Companion companion2 = Companion;
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(C1626yg.Ud("\u001ayyYp?\u001e\u0012tU*\u000f*<\u0017\u0005a\\gq6auk=h9\u00118Aw\u0007\u00142a&\u000bzfZ\rBhR\u001f\"\u001d\f\u0018\u0017\u0014Y\u0011 pTM\u000b\u0017d_m4Qu\u0014G\u001f\\8G,", (short) (FB.Xd() ^ ((58352702 ^ 32700785) ^ 42509244)), (short) (FB.Xd() ^ ((1119978951 ^ 743262823) ^ 1854707462)))).getMethod(Ig.wd("+\u0002\u001d\u000f`\u000epn_/:Z\u0002tp\u0018", (short) (C1633zX.Xd() ^ ((1128027036 ^ 1112669262) ^ (-23956389)))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    ((Callback) method3.invoke(companion2, objArr3)).invoke(EO.Od("S\u0006", (short) (ZN.Xd() ^ ((84881623 ^ 1207681870) ^ 1123352027))));
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    @ReactMethod
    public final void getDeviceStatusRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, Callback callback) throws Throwable {
        Intrinsics.checkNotNullParameter(str, C1561oA.Qd("\t\r\u0005\u0011\u0010\u0006\f", (short) (OY.Xd() ^ (951661454 ^ 951679486))));
        Intrinsics.checkNotNullParameter(str2, C1593ug.zd(".>?\u00195", (short) (C1499aX.Xd() ^ (FB.Xd() ^ (-1609506943))), (short) (C1499aX.Xd() ^ (C1607wl.Xd() ^ (-1849979228)))));
        Intrinsics.checkNotNullParameter(str3, C1561oA.od("KSUYBRDB&L", (short) (C1580rY.Xd() ^ (260054644 ^ (-260066081)))));
        Intrinsics.checkNotNullParameter(str4, C1561oA.Kd("]\\O]-TS]d", (short) (C1580rY.Xd() ^ ((1857610938 ^ 1054025139) ^ (-1349224157)))));
        short sXd = (short) (C1607wl.Xd() ^ (1670613927 ^ 1670620156));
        short sXd2 = (short) (C1607wl.Xd() ^ ((1734841809 ^ 1736976753) ^ 15718035));
        int[] iArr = new int["|\u0006~\u0007d\u001b".length()];
        QB qb = new QB("|\u0006~\u0007d\u001b");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(str5, new String(iArr, 0, i2));
        Intrinsics.checkNotNullParameter(str6, C1561oA.Xd("onaoRxpf", (short) (OY.Xd() ^ (Od.Xd() ^ (972699456 ^ 2114433595)))));
        Intrinsics.checkNotNullParameter(str7, Wg.vd("]ejZnklbsdAlhh", (short) (C1607wl.Xd() ^ ((719543420 ^ 1602774125) ^ 1969956391))));
        Intrinsics.checkNotNullParameter(callback, Qg.kd("~{\u0006\u0005ywx\u007f", (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ (1685041318 ^ 272558659))), (short) (C1499aX.Xd() ^ (ZN.Xd() ^ (1622238241 ^ (-1396390990))))));
        Companion companion = Companion;
        Object[] objArr = {callback};
        Method method = Class.forName(hg.Vd(" +(g\u001d\u0019-\u001f+\u001d\u0018 \u0015\u0011\\\u0012\u000e\"\u0014 \u0012\r\u0015\n\u0006\u0005\u0013\u0012N\u0002\u0011\u0007\u0001\u0003\u007f\rF\f\u007fx\u0003\u0003\n?YS\\|\u0004^ol}yoy}Vwjtd\"@khjZf`ec", (short) (C1633zX.Xd() ^ ((2054587878 ^ 378416932) ^ (-1828257644))), (short) (C1633zX.Xd() ^ (382239758 ^ (-382243554))))).getMethod(C1561oA.yd("bSa5W``g*GQPMKLS", (short) (ZN.Xd() ^ ((1515767479 ^ 669020002) ^ 2109257358))), Class.forName(C1561oA.ud("=HE\u0005<6784@?:{?1,-=u)8.(*'n\u0003 *)\u001e\u001c\u001d$", (short) (ZN.Xd() ^ (OY.Xd() ^ 69944487)))));
        try {
            method.setAccessible(true);
            method.invoke(companion, objArr);
            try {
                IDSecurityApiImpl iDSecurityApiImpl = new IDSecurityApiImpl();
                CommonParamsRequest commonParamsRequest = new CommonParamsRequest();
                commonParamsRequest.setAppId(str2);
                commonParamsRequest.setChannel(str);
                commonParamsRequest.setForwaredIp(str3);
                commonParamsRequest.setUserAgent(str4);
                CommonUserDataRequest commonUserDataRequest = new CommonUserDataRequest();
                commonUserDataRequest.setEnterpriseCode(str7);
                commonUserDataRequest.setUserId(str5);
                commonUserDataRequest.setUserType(str6);
                Activity currentActivity = getReactApplicationContext().getCurrentActivity();
                Activity currentActivity2 = getReactApplicationContext().getCurrentActivity();
                Intrinsics.checkNotNull(currentActivity);
                Intrinsics.checkNotNull(currentActivity2);
                String json = new Gson().toJson(iDSecurityApiImpl.generateDeviceStatusRequest(currentActivity, currentActivity2, commonParamsRequest, commonUserDataRequest, null).getDeviceStatusRequest());
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1561oA.Yd("\u0004\u0011\u0010Q\t\u0007\u001d\u0011\u001f\u0013\u0010\u001a\u0011\u000f\\\u0014\u0012(\u001c*\u001e\u001b%\u001c\u001a\u001b+,j 1)%)(7r:0+79By\u0016\u0012\u001d?H%87JH@LR-PEQC\u0003#POSESOVV", (short) (C1633zX.Xd() ^ ((616083672 ^ 561855065) ^ (-96840477))))).getMethod(Xg.qd("zy\n_{\u0007\t\u0012^}\n\u000b\u0002\u0002\u0005\u000e", (short) (C1499aX.Xd() ^ ((1384207687 ^ 1524715389) ^ (-140515587))), (short) (C1499aX.Xd() ^ ((989245347 ^ 1882791152) ^ (-1255125081)))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    ((Callback) method2.invoke(companion, objArr2)).invoke(json);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (IllegalViewOperationException unused) {
                Companion companion2 = Companion;
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(Jg.Wd("\u00140_,Uc%\u0007)HSQs\u007f=\u0004069uxa}$\u000e!`m\u001a\u0003 \u0006\u0011E2P<\u0013v\u001e=-B-W?y.#\u000fT?a\u000e\u0015\u0011E/BE|\u00030{9*9[[b\u001a%", (short) (Od.Xd() ^ ((915776789 ^ 139067489) ^ (-1054841312))), (short) (Od.Xd() ^ (1924662960 ^ (-1924676003))))).getMethod(ZO.xd("\u0002@=\fg#sV_\u0006\u001eKCmoN", (short) (Od.Xd() ^ (305060694 ^ (-305060537))), (short) (Od.Xd() ^ (1720129951 ^ (-1720125601)))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    ((Callback) method3.invoke(companion2, objArr3)).invoke(C1626yg.Ud("\u0010\u0001", (short) (ZN.Xd() ^ (1160795247 ^ 1160776621)), (short) (ZN.Xd() ^ (1574836798 ^ 1574842488))));
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    @ReactMethod
    public final void getMessage(String str, Callback callback) throws Throwable {
        Intrinsics.checkNotNullParameter(str, Ig.wd("t?\u001dv\u0012Sg", (short) (FB.Xd() ^ ((834543234 ^ 1464705756) ^ 1727250953))));
        Intrinsics.checkNotNullParameter(callback, EO.Od("C\u000fmG?k{U", (short) (FB.Xd() ^ (699480953 ^ 699471175))));
        Companion companion = Companion;
        Class<?> cls = Class.forName(C1561oA.Qd("?JG\u0007<8L>J<7?40{1-A3?1,4)%$21m!0& \"\u001f,e+\u001f\u0018\"\")^xr{\u001c#}\u000f\f\u001d\u0019\u000f\u0019\u001du\u0017\n\u0014\u0004A_\u000b\b\ny\u0006\u007f\u0005\u0003", (short) (OY.Xd() ^ (C1633zX.Xd() ^ (-1951489788)))));
        Class<?>[] clsArr = {Class.forName(C1593ug.zd("2?>\u007f958;9GHE\tNB?BT\u000fDUMIML\u0016,KWXOOR[", (short) (C1580rY.Xd() ^ (C1580rY.Xd() ^ 831088050)), (short) (C1580rY.Xd() ^ (709753250 ^ (-709748857)))))};
        Object[] objArr = {callback};
        short sXd = (short) (FB.Xd() ^ (C1633zX.Xd() ^ (-1951470671)));
        int[] iArr = new int["cTb6PYY`+HRQFDEL".length()];
        QB qb = new QB("cTb6PYY`+HRQFDEL");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(companion, objArr);
            try {
                IDSecurityApiImpl iDSecurityApiImpl = new IDSecurityApiImpl();
                Activity currentActivity = getReactApplicationContext().getCurrentActivity();
                Activity currentActivity2 = getReactApplicationContext().getCurrentActivity();
                Intrinsics.checkNotNull(currentActivity);
                Intrinsics.checkNotNull(currentActivity2);
                String json = new Gson().toJson(iDSecurityApiImpl.getMessage(currentActivity, currentActivity2, str));
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1561oA.Kd("\n\u0017\u0016W\u000f\r#\u0017%\u0019\u0016 \u0017\u0015b\u001a\u0018.\"0$!+\" !12p&7/+/.=x@61=?H\u007f\u001c\u0018#EN+>=PNFRX3VKWI\t)VUYKYU\\\\", (short) (C1580rY.Xd() ^ (1856545235 ^ (-1856568122))))).getMethod(Wg.Zd("\u000b8\u0007\u0013mG\u007fGR\u0018b\u001aO\u001eW\u001f", (short) (C1499aX.Xd() ^ ((331673444 ^ 2013437) ^ (-333070718))), (short) (C1499aX.Xd() ^ (1080928133 ^ (-1080934441)))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    ((Callback) method2.invoke(companion, objArr2)).invoke(json);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (IllegalViewOperationException unused) {
                Companion companion2 = Companion;
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(C1561oA.Xd("r\u007f~@wu\f\u007f\u000e\u0002~\t\u007f}K\u0003\u0001\u0017\u000b\u0019\r\n\u0014\u000b\t\n\u001a\u001bY\u000f \u0018\u0014\u0018\u0017&a)\u001f\u001a&(1h\u0005\u0001\f.7\u0014'&97/;A\u001c?4@2q\u0012?>B4B>EE", (short) (ZN.Xd() ^ ((664601508 ^ 814891841) ^ 386885582)))).getMethod(Wg.vd("WVb8P[Yb;ZbcVVU^", (short) (C1633zX.Xd() ^ (1205453 ^ (-1197041)))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    ((Callback) method3.invoke(companion2, objArr3)).invoke(Qg.kd("XY", (short) (FB.Xd() ^ (168505685 ^ 168521543)), (short) (FB.Xd() ^ ((1038333701 ^ 772686766) ^ 334354496))));
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return hg.Vd(">8AahCTQb^T^b;\\OYI", (short) (Od.Xd() ^ (C1499aX.Xd() ^ 1134262553)), (short) (Od.Xd() ^ (Od.Xd() ^ (-1207797240))));
    }

    @ReactMethod
    public final void getPendingBackgroundTransactions(Callback callback) throws Throwable {
        short sXd = (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (-831062319)));
        int[] iArr = new int["KHRQFDEL".length()];
        QB qb = new QB("KHRQFDEL");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(callback, new String(iArr, 0, i2));
        Companion companion = Companion;
        short sXd2 = (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ 831072608));
        int[] iArr2 = new int["\u0007\u0012\u0013R\u0004\u007f\u0018\n\u0012\u0004\u0003\u000b{wG|\u0015)\u001f+\u0019\u0014 \u0015\r\f\u001e\u001dU\t\u001c\u0012gijw-rjciit*@:Gg\u000bezw\u0005\u0001z\u0005\u0005]\u0003u{k-KROUEMGPN".length()];
        QB qb2 = new QB("\u0007\u0012\u0013R\u0004\u007f\u0018\n\u0012\u0004\u0003\u000b{wG|\u0015)\u001f+\u0019\u0014 \u0015\r\f\u001e\u001dU\t\u001c\u0012gijw-rjciit*@:Gg\u000bezw\u0005\u0001z\u0005\u0005]\u0003u{k-KROUEMGPN");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i3));
            i3++;
        }
        Object[] objArr = {callback};
        Method method = Class.forName(new String(iArr2, 0, i3)).getMethod(Xg.qd("\f~\u000fd\u0001\f\u000e\u0017c\u0003\u000f\u0010\u0007\u0007\n\u0013", (short) (C1633zX.Xd() ^ ((234864833 ^ 401982459) ^ (-436891556))), (short) (C1633zX.Xd() ^ (C1633zX.Xd() ^ 1951465510))), Class.forName(C1561oA.Yd("Ta`\"[WZ][ijg+pdadv1fwokon8Nmyzqqt}", (short) (Od.Xd() ^ (1779766413 ^ (-1779788408))))));
        try {
            method.setAccessible(true);
            method.invoke(companion, objArr);
            try {
                Activity currentActivity = getReactApplicationContext().getCurrentActivity();
                getReactApplicationContext().getCurrentActivity();
                String json = new Gson().toJson(new IDTransactionPersistence().getTransactionsJson(currentActivity));
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(Jg.Wd("5;H%\u0005.R0Wg\u000267`\u001ajt7Vn}v\u001d\u001dEs\u0010)T&Pr\r,C=\u0007y\u0018/HBf,b\u0018/nah\u0007\"`x\u000b\u0004$\u001aiz\u0010,X\u0005J\u0005'$JCVn", (short) (ZN.Xd() ^ ((1620683982 ^ 1623455216) ^ 5909623)), (short) (ZN.Xd() ^ (663402824 ^ 663411230)))).getMethod(ZO.xd("*VL)xxwu\fHd\u000fN\u0015-3", (short) (OY.Xd() ^ (107199055 ^ 107195950)), (short) (OY.Xd() ^ (32550763 ^ 32541440))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    ((Callback) method2.invoke(companion, objArr2)).invoke(json);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (IllegalViewOperationException unused) {
                Companion companion2 = Companion;
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(C1626yg.Ud("x\bz/W; h\t3\u001d7\bQG\"l:\u0007\u000b:#-l9\u001a\u0001Cy~yeW19/\tR\u0003:]K M&\u0013UynCV+\u0019\u0004]4\u001f.L;\u007f5\u0011\u0005\u000bT\u000b\r7SY%", (short) (FB.Xd() ^ (1929868813 ^ 1929857322)), (short) (FB.Xd() ^ ((1818187056 ^ 470503133) ^ 1884585922)))).getMethod(Ig.wd("H\u0012p+D\u00125JkOV:}|\rx", (short) (Od.Xd() ^ (1507655839 ^ (-1507676511)))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    ((Callback) method3.invoke(companion2, objArr3)).invoke(EO.Od("O!", (short) (C1580rY.Xd() ^ (509824432 ^ (-509809236)))));
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    @ReactMethod
    public final void getTransactions(Callback callback) throws Throwable {
        Intrinsics.checkNotNullParameter(callback, C1561oA.Qd("\u001f\u001c&%\u001a\u0018\u0019 ", (short) (C1499aX.Xd() ^ (FB.Xd() ^ (1678278597 ^ (-1005005409))))));
        Companion companion = Companion;
        Object[] objArr = {callback};
        Method method = Class.forName(C1593ug.zd("CPO\u0011HF\\P^ROYPN\u001cSQg[i]Zd[YZjk*_phdhgv2yojvx\u00029UQ\\~\bdwv\n\b\u007f\f\u0012l\u0010\u0005\u0011\u0003Bb\u0010\u000f\u0013\u0005\u0013\u000f\u0016\u0016", (short) (C1580rY.Xd() ^ (1241312625 ^ (-1241285436))), (short) (C1580rY.Xd() ^ ((578914032 ^ 1384222355) ^ (-1879069449))))).getMethod(C1561oA.Kd("viyOkvx\u0002Nmyzqqt}", (short) (C1580rY.Xd() ^ ((1755204568 ^ 1644701513) ^ (-177631133)))), Class.forName(C1561oA.od("%0-l$\u001e\u001f \u001c('\"c'\u0019\u0014\u0015%]\u0011 \u0016\u0010\u0012\u000fVj\b\u0012\u0011\u0006\u0004\u0005\f", (short) (OY.Xd() ^ (1319894065 ^ 1319891404)))));
        try {
            method.setAccessible(true);
            method.invoke(companion, objArr);
            try {
                Activity currentActivity = getReactApplicationContext().getCurrentActivity();
                getReactApplicationContext().getCurrentActivity();
                String json = new Gson().toJson(new IDTransactionPersistence().getTransactionsJson(currentActivity));
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(Wg.Zd("%\bp\u0006'\u000b\ncK#\ng9\u001dB_7A \u0004_B$pI.(~%P<\u0018mU.\u00147d4\u0013\tqbosU*1\u0014VQ63\u0016gW7gr>4\n#9?$\u0010W?\u001f\u0001f", (short) (C1607wl.Xd() ^ ((1420659116 ^ 1743850085) ^ 861711317)), (short) (C1607wl.Xd() ^ ((964682009 ^ 233076372) ^ 882627356)))).getMethod(C1561oA.Xd("sr\u0003Xt\u007f\u0002\u000bWv\u0003\u0004zz}\u0007", (short) (C1580rY.Xd() ^ (944216974 ^ (-944234104)))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    ((Callback) method2.invoke(companion, objArr2)).invoke(json);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (IllegalViewOperationException unused) {
                Companion companion2 = Companion;
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(Wg.vd("BON\u0010GE[O]QNXOM\u001bRPfZh\\YcZXYij)^ogcgfu1xniuw\u00018TP[}\u0007cvu\t\u0007~\u000b\u0011k\u000f\u0004\u0010\u0002Aa\u000f\u000e\u0012\u0004\u0012\u000e\u0015\u0015", (short) (C1499aX.Xd() ^ (1016364902 ^ (-1016334475))))).getMethod(Qg.kd("@=K\u001f9BBI\u00141;:/-.5", (short) (C1607wl.Xd() ^ (2041096700 ^ 2041118350)), (short) (C1607wl.Xd() ^ ((1679877516 ^ 612208569) ^ 1079864884))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    ((Callback) method3.invoke(companion2, objArr3)).invoke(hg.Vd("\u0010\u0011", (short) (C1499aX.Xd() ^ (1315607091 ^ (-1315603590))), (short) (C1499aX.Xd() ^ ((59200348 ^ 738092686) ^ (-679046564)))));
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    @ReactMethod
    public final void getUUIDDevice(Callback callback) throws Throwable {
        Intrinsics.checkNotNullParameter(callback, C1561oA.ud("\u0003\u007f\n\t}{|\u0004", (short) (C1580rY.Xd() ^ (1312996700 ^ (-1312996600)))));
        Companion companion = Companion;
        Object[] objArr = {callback};
        Method method = Class.forName(C1561oA.yd("3>?~0,D6N@?G84\u00049AUKWE@LAIHZY\u0012EXNTVWd\u001a_WPffq'=7DdwRgdqmgq\u0002Z\u007frxh*H~{\u0002qys|z", (short) (C1580rY.Xd() ^ (OY.Xd() ^ (429799929 ^ (-498426315)))))).getMethod(Xg.qd(">1A\u00173>@I\u00165AB99<E", (short) (C1499aX.Xd() ^ (OY.Xd() ^ (738000854 ^ (-802676912)))), (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ 1951497277))), Class.forName(C1561oA.Yd("R_^ YUX[Yghe)nb_bt/dumiml6Lkwxoor{", (short) (Od.Xd() ^ (932879681 ^ (-932878177))))));
        try {
            method.setAccessible(true);
            method.invoke(companion, objArr);
            try {
                IDSecurityApiImpl iDSecurityApiImpl = new IDSecurityApiImpl();
                Activity currentActivity = getReactApplicationContext().getCurrentActivity();
                Activity currentActivity2 = getReactApplicationContext().getCurrentActivity();
                Intrinsics.checkNotNull(currentActivity);
                Intrinsics.checkNotNull(currentActivity2);
                String deviceUUID = iDSecurityApiImpl.getDeviceUUID(currentActivity, currentActivity2);
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(Jg.Wd("rx\u0011M\u0019\u0014A2TDZ[jeJz\u0011#,6A;Xkb~\u0005\"W&.B7RJv%\nw\u000e\u000f,.~2+Ng\nb\r\u00060*7>]4j]\u0001jC^%\u001c7FI``{", (short) (C1633zX.Xd() ^ ((473299221 ^ 77907490) ^ (-412171454))), (short) (C1633zX.Xd() ^ ((834273297 ^ 689127844) ^ (-413759919))))).getMethod(ZO.xd("iG\u0004_hy?g`\u0002$0&\u0014dh", (short) (FB.Xd() ^ ((527701346 ^ 1011803139) ^ 591044822)), (short) (FB.Xd() ^ (1255340389 ^ 1255331704))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    ((Callback) method2.invoke(companion, objArr2)).invoke(deviceUUID);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (IllegalViewOperationException unused) {
                Companion companion2 = Companion;
                Class<?> cls = Class.forName(C1626yg.Ud("h0/Vn4m@\u001bG6\"4.il\u0012:\u0007\u0013)r^m8\u001c;\u00048CH.>\u0001\u0001RPe/44\u0002Jm~\u0017#\u001fw?<ji/<&0V4-\u001fuk:\u000f\u000e<[YGXZ", (short) (C1633zX.Xd() ^ ((754028068 ^ 1040088475) ^ (-286246419))), (short) (C1633zX.Xd() ^ ((1611912509 ^ 73647684) ^ (-1685080124)))));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr3 = new Object[0];
                short sXd = (short) (C1580rY.Xd() ^ (1065058394 ^ (-1065062422)));
                int[] iArr = new int["A{7)J\u0018\u0003Xe)4T\u001c\u000frB".length()];
                QB qb = new QB("A{7)J\u0018\u0003Xe)4T\u001c\u000frB");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                    i2++;
                }
                Method method3 = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method3.setAccessible(true);
                    ((Callback) method3.invoke(companion2, objArr3)).invoke(EO.Od("a<", (short) (C1499aX.Xd() ^ (1903120623 ^ (-1903103719)))));
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i2, int i3, Intent intent) throws Throwable {
        int i4 = 1141356101 ^ 1141344446;
        short sXd = (short) (ZN.Xd() ^ ((644135953 ^ 1098346403) ^ 1729351911));
        int[] iArr = new int["a\u000e\r\t\u000b7fv\u0007\u0007{\u007fw/\\n\u0001t\u0001n(Kgye#Qobn_o`dh`".length()];
        QB qb = new QB("a\u000e\r\t\u000b7fv\u0007\u0007{\u007fw/\\n\u0001t\u0001n(Kgye#Qobn_o`dh`");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK(sXd + sXd + sXd + i5 + xuXd.CK(iKK));
            i5++;
        }
        String str = new String(iArr, 0, i5);
        if (i2 != i4) {
            if (i2 != (C1633zX.Xd() ^ (-1951492051))) {
                Companion companion = Companion;
                short sXd2 = (short) (FB.Xd() ^ (181524415 ^ 181534622));
                int iXd = FB.Xd();
                Object[] objArr = new Object[0];
                int iXd2 = Od.Xd() ^ (-1207817399);
                Method method = Class.forName(Qg.kd("\b\u0013\u0010O\u0005\u0001\u0015\u0007\u0013\u0005\u007f\b|xDyu\n{\byt|qmlzy6ixnhjgt.sg`jjq'A;DdkFWTeaWae>_R\\L\n(SPRBNHMK", sXd2, (short) (iXd ^ ((927985391 ^ 1350764588) ^ 1741472196)))).getMethod(hg.Vd("XUc7QZZa,ISRGEFM", (short) (C1580rY.Xd() ^ ((275482599 ^ 1070285492) ^ (-799069718))), (short) (C1580rY.Xd() ^ iXd2)), new Class[0]);
                try {
                    method.setAccessible(true);
                    ((Callback) method.invoke(companion, objArr)).invoke(str);
                    return;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            int i6 = 298477664 ^ 298476504;
            String strKd = Qg.kd("\u0017 \u001as\u0010\"\u000e", (short) (C1499aX.Xd() ^ (203267420 ^ (-203275586))), (short) (C1499aX.Xd() ^ ((836874009 ^ 1494843280) ^ (-1761125810))));
            String strVd = hg.Vd("cTSQ", (short) (ZN.Xd() ^ ((1485166889 ^ 1537954095) ^ 53388333)), (short) (ZN.Xd() ^ ((240234404 ^ 1888496597) ^ 2126630818)));
            String strUd = C1561oA.ud("JJ6HHE", (short) (Od.Xd() ^ (C1633zX.Xd() ^ (1139751487 ^ 935211198))));
            if (i3 != i6) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(strUd, i3);
                    jSONObject.put(strVd, C1593ug.zd("N\\][_mbUVVrXVjX", (short) (OY.Xd() ^ (327369758 ^ 327364614)), (short) (OY.Xd() ^ (1010698909 ^ 1010721185))));
                    jSONObject.put(strKd, C1561oA.od("r~}y{\bktn\u0004gcua", (short) (FB.Xd() ^ ((1149427425 ^ 479788272) ^ 1478099627))));
                    Companion companion2 = Companion;
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(C1561oA.Kd("x\u0006\u0005F}{\u0012\u0006\u0014\b\u0005\u000f\u0006\u0004Q\t\u0007\u001d\u0011\u001f\u0013\u0010\u001a\u0011\u000f\u0010 !_\u0015&\u001e\u001a\u001e\u001d,g/% ,.7n\u000b\u0007\u00124=\u001a-,?=5AG\"E:F8w\u0018EDH:HDKK", (short) (C1633zX.Xd() ^ ((829315734 ^ 1597008498) ^ (-1851657926))))).getMethod(Wg.Zd("p/~\u001co:\u0006JjE\u0015_\nQ\u0014\\", (short) (ZN.Xd() ^ (1787935092 ^ 1787951870)), (short) (ZN.Xd() ^ ((1519740840 ^ 1425677134) ^ 242177935))), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        ((Callback) method2.invoke(companion2, objArr2)).invoke(jSONObject.toString());
                        return;
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } catch (JSONException unused) {
                    Companion companion3 = Companion;
                    int iXd3 = C1607wl.Xd();
                    Object[] objArr3 = new Object[0];
                    Method method3 = Class.forName(C1561oA.Xd("\u0016#\"c\u001b\u0019/#1%\",#!n&$:.<0-7.,-=>|2C;7;:I\u0005LB=IKT\f($/QZ7JI\\ZR^d?bWcU\u00155baeWeahh", (short) (iXd3 ^ (1104466486 ^ 1104460502)))).getMethod(Wg.vd("-,8\u000e.97@\u0001 ()$$#,", (short) (ZN.Xd() ^ ((1683687480 ^ 1211019837) ^ 745901648))), new Class[0]);
                    try {
                        method3.setAccessible(true);
                        ((Callback) method3.invoke(companion3, objArr3)).invoke(str);
                        return;
                    } catch (InvocationTargetException e4) {
                        throw e4.getCause();
                    }
                }
            }
            try {
                Intrinsics.checkNotNull(intent);
                Serializable serializableExtra = intent.getSerializableExtra(C1561oA.yd("(073+*.%9>\u001f1:;5<", (short) (C1607wl.Xd() ^ (55733797 ^ 55727002))));
                Intrinsics.checkNotNull(serializableExtra, C1561oA.Yd("\u001a\"\u001a\u001bO\u0014\u0013!\"$*V\u001a\u001eY\u001e\u001d02^40a133r5=56j@F>4o4A@\u0002I?:FHQ\tOAI\rIEPR[TTIWJ\\OU[U\u001dU_db`ah\\knfo*FBMoxGqvtrsunx\u007f^r\u0002\u0005|\u0006", (short) (C1499aX.Xd() ^ ((1145394303 ^ 321938345) ^ (-1467289447)))));
                IDNowEnrollmentResult iDNowEnrollmentResult = (IDNowEnrollmentResult) serializableExtra;
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                ArrayList<IDStepReview> stepTrail = iDNowEnrollmentResult.getEnrollMap().getStepTrail();
                int size = stepTrail.size();
                for (int i7 = 0; i7 < size; i7++) {
                    IDStepReview iDStepReview = stepTrail.get(i7);
                    Intrinsics.checkNotNullExpressionValue(iDStepReview, Xg.qd("\u000f\u000e\u001eRYZ[W", (short) (C1633zX.Xd() ^ (1404989665 ^ (-1404982040))), (short) (C1633zX.Xd() ^ (781932830 ^ (-781929367)))));
                    ArrayList<KeyValue> metadata = iDStepReview.getMetadata();
                    int size2 = metadata.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(Jg.Wd("MEV", (short) (C1633zX.Xd() ^ ((417772990 ^ 1023976805) ^ (-636359678))), (short) (C1633zX.Xd() ^ ((669135352 ^ 1325856823) ^ (-1759812181)))), metadata.get(i8).getKey());
                        short sXd3 = (short) (C1633zX.Xd() ^ ((618529757 ^ 1167437448) ^ (-1632356596)));
                        short sXd4 = (short) (C1633zX.Xd() ^ ((1266434745 ^ 1413964028) ^ (-523965901)));
                        int[] iArr2 = new int["\f,1@\u0007".length()];
                        QB qb2 = new QB("\f,1@\u0007");
                        int i9 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i9] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i9 % C1561oA.Xd.length] ^ ((i9 * sXd4) + sXd3)));
                            i9++;
                        }
                        jSONObject3.put(new String(iArr2, 0, i9), metadata.get(i8).getValue());
                        jSONArray.put(jSONObject3);
                    }
                }
                jSONObject2.put(strUd, i3);
                jSONObject2.put(strVd, iDNowEnrollmentResult.getSeed());
                jSONObject2.put(strKd, jSONArray.toString());
                Companion companion4 = Companion;
                short sXd5 = (short) (ZN.Xd() ^ (1377400656 ^ 1377395110));
                short sXd6 = (short) (ZN.Xd() ^ (723444716 ^ 723426570));
                int[] iArr3 = new int["6Og<#^9u@I\tB\u000e9!FeBr)A\u007f\u0005+\u0006\u000e\u0017Q%Zpt=t vli~\u001928S\u0010\u001d,vMO/yN\u001e<\t\n\u001b|t^.\u0005u\u000bV}NQbOih".length()];
                QB qb3 = new QB("6Og<#^9u@I\tB\u000e9!FeBr)A\u007f\u0005+\u0006\u000e\u0017Q%Zpt=t vli~\u001928S\u0010\u001d,vMO/yN\u001e<\t\n\u001b|t^.\u0005u\u000bV}NQbOih");
                int i10 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i10] = xuXd3.fK((C1561oA.Xd[i10 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + (i10 * sXd6))) + xuXd3.CK(iKK3));
                    i10++;
                }
                Object[] objArr4 = new Object[0];
                Method method4 = Class.forName(new String(iArr3, 0, i10)).getMethod(Ig.wd("\u0002+j`\u000bh?%6el\u0015X''\u0013", (short) (C1633zX.Xd() ^ (938587997 ^ (-938602555)))), new Class[0]);
                try {
                    method4.setAccessible(true);
                    ((Callback) method4.invoke(companion4, objArr4)).invoke(jSONObject2.toString());
                    return;
                } catch (InvocationTargetException e5) {
                    throw e5.getCause();
                }
            } catch (JSONException unused2) {
                Companion companion5 = Companion;
                int iXd4 = C1607wl.Xd();
                Object[] objArr5 = new Object[0];
                Method method5 = Class.forName(EO.Od("R0<!:\r<H\u001dqqR\u0014\u00197I$-i\rW\reaV\u0018\u00078qu_2\u0017}S\u001d\u0007g]GLvRt\u007fl\u000fW\u0014\u0015a-\t\u007f\"nsi;+,<0g=q0^89\u001aR", (short) (iXd4 ^ ((1760114792 ^ 1282209824) ^ 612743148)))).getMethod(C1561oA.Qd("# .\u0002\u001c%%,v\u0014\u001e\u001d\u0012\u0010\u0011\u0018", (short) (ZN.Xd() ^ (1446709723 ^ 1446708337))), new Class[0]);
                try {
                    method5.setAccessible(true);
                    ((Callback) method5.invoke(companion5, objArr5)).invoke(str);
                    return;
                } catch (InvocationTargetException e6) {
                    throw e6.getCause();
                }
            }
        }
        if (i3 == (FB.Xd() ^ (1493332747 ^ 116204228))) {
            String selfie = IDRetrievedData.getCurrentRetrievedData().getSelfie();
            String faceMap = IDRetrievedData.getCurrentRetrievedData().getFaceMap();
            String sessionId = IDRetrievedData.getCurrentRetrievedData().getSessionId();
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put(C1593ug.zd("=08374", (short) (C1499aX.Xd() ^ ((824064857 ^ 984999751) ^ (-195808023))), (short) (C1499aX.Xd() ^ ((467920943 ^ 1577224399) ^ (-1172379481)))), selfie);
                jSONObject4.put(C1561oA.od("lfghObp", (short) (ZN.Xd() ^ ((871183693 ^ 1066342362) ^ 207760507))), faceMap);
                jSONObject4.put(C1561oA.Kd("- /0'..\n&", (short) (C1499aX.Xd() ^ ((192177586 ^ 2043422705) ^ (-1924678730)))), sessionId);
                Companion companion6 = Companion;
                Object[] objArr6 = new Object[0];
                Method method6 = Class.forName(Wg.Zd("\u0003LVt'>?09\u0016mcGP\u0017YDEB\f|tjzsQlV_\"\u000e\u000f\u0016\u0006\u0002{0S6,1.DWns9h\\\"P<:A%\r\u0010EqajW\u007f+%\u0010\u000fi\u0003\fmv", (short) (C1633zX.Xd() ^ ((1344354202 ^ 653210884) ^ (-1993241118))), (short) (C1633zX.Xd() ^ (264891440 ^ (-264885823))))).getMethod(C1561oA.Xd("65E\u001b7BDM\u001a9EF==@I", (short) (C1633zX.Xd() ^ ((1599283428 ^ 1492727799) ^ (-128598988)))), new Class[0]);
                try {
                    method6.setAccessible(true);
                    ((Callback) method6.invoke(companion6, objArr6)).invoke(jSONObject4.toString());
                    return;
                } catch (InvocationTargetException e7) {
                    throw e7.getCause();
                }
            } catch (JSONException unused3) {
                Companion companion7 = Companion;
                int iXd5 = FB.Xd();
                Object[] objArr7 = new Object[0];
                Method method7 = Class.forName(Wg.vd("r\u007fz<om\u007fs}qjtge/f\u0001\u0017\u0007\u0015\u0005\u0002\b~xy\u0006\u0007Av\u0004{SWRa\u0019`RMUW\\\u0014,(/QvSbapnbnpKj_gY\u00155>==/9588", (short) (iXd5 ^ (1176174264 ^ 1176174234)))).getMethod(Qg.kd("\u001a\u0017%x\u0013\u001c\u001c#m\u000b\u0015\u0014\t\u0007\b\u000f", (short) (C1633zX.Xd() ^ (1585775827 ^ (-1585797492))), (short) (C1633zX.Xd() ^ (325941212 ^ (-325912039)))), new Class[0]);
                try {
                    method7.setAccessible(true);
                    ((Callback) method7.invoke(companion7, objArr7)).invoke(str);
                    return;
                } catch (InvocationTargetException e8) {
                    throw e8.getCause();
                }
            }
        }
        if (i3 == ((463764569 ^ 726455782) ^ 820549441)) {
            Companion companion8 = Companion;
            short sXd7 = (short) (FB.Xd() ^ (C1580rY.Xd() ^ (328666314 ^ (-572413138))));
            int iXd6 = FB.Xd();
            Object[] objArr8 = new Object[0];
            Method method8 = Class.forName(hg.Vd("\u0014\u001f\u001c[\u0011\r!\u0013\u001f\u0011\f\u0014\t\u0005P\u0006\u0002\u0016\b\u0014\u0006\u0001\t}yx\u0007\u0006Bu\u0005ztvs\u0001:\u007fslvv}3MGPpwRc`qmcmqJk^hX\u00164_\\^NZTYW", sXd7, (short) (iXd6 ^ ((393362608 ^ 1407169660) ^ 1152236137)))).getMethod(C1561oA.ud("/,:\u000e(118\u0003 *)\u001e\u001c\u001d$", (short) (C1607wl.Xd() ^ (OY.Xd() ^ 69931802))), new Class[0]);
            try {
                method8.setAccessible(true);
                ((Callback) method8.invoke(companion8, objArr8)).invoke(C1561oA.yd("\f\u007f\u000b\u000e\u0002\u000b\u0013w\u0001vt\u0010\u0003\u0002p~)\u000e\t\u0017\t\f\u0010\u0011\u0007\u0007", (short) (C1580rY.Xd() ^ ((1391910614 ^ 105828417) ^ (-1421361128)))));
                return;
            } catch (InvocationTargetException e9) {
                throw e9.getCause();
            }
        }
        int i11 = (2053194780 ^ 116458463) ^ 2089843006;
        short sXd8 = (short) (ZN.Xd() ^ (1379834634 ^ 1379848340));
        int[] iArr4 = new int["WV`XfVbv]kljn|xnon".length()];
        QB qb4 = new QB("WV`XfVbv]kljn|xnon");
        int i12 = 0;
        while (qb4.YK()) {
            int iKK4 = qb4.KK();
            Xu xuXd4 = Xu.Xd(iKK4);
            iArr4[i12] = xuXd4.fK(xuXd4.CK(iKK4) - (((sXd8 + sXd8) + sXd8) + i12));
            i12++;
        }
        String str2 = new String(iArr4, 0, i12);
        if (i3 == i11) {
            Companion companion9 = Companion;
            int iXd7 = C1580rY.Xd() ^ (-831079744);
            int iXd8 = C1607wl.Xd();
            Object[] objArr9 = new Object[0];
            int iXd9 = C1499aX.Xd() ^ (-1134234167);
            Method method9 = Class.forName(Xg.qd("\u0005\u0012\u0011R\n\b\u001e\u0012 \u0014\u0011\u001b\u0012\u0010]\u0015\u0013)\u001d+\u001f\u001c&\u001d\u001b\u001c,-k!2*&*)8s;1,8:Cz\u0017\u0013\u001e@I&98KIAMS.QFRD\u0004$QPTFTPWW", (short) (iXd8 ^ (676732478 ^ 676737228)), (short) (C1607wl.Xd() ^ iXd7))).getMethod(Jg.Wd("A\u001a:y\u0005<\f |\u0006\u0001.r}\u0011\u0004", (short) (ZN.Xd() ^ (1431170009 ^ 1431163256)), (short) (ZN.Xd() ^ iXd9)), new Class[0]);
            try {
                method9.setAccessible(true);
                ((Callback) method9.invoke(companion9, objArr9)).invoke(str2);
                return;
            } catch (InvocationTargetException e10) {
                throw e10.getCause();
            }
        }
        if (i3 == (OY.Xd() ^ (2103798824 ^ 2035178047))) {
            Companion companion10 = Companion;
            short sXd9 = (short) (FB.Xd() ^ ((409438135 ^ 2026740211) ^ 1621772001));
            int iXd10 = FB.Xd();
            Object[] objArr10 = new Object[0];
            Method method10 = Class.forName(ZO.xd("i1&Vz4dU\u001ek\u0015C\u0015A\u001aNd'H\b6lCNw|H\u000b\u0019S\t)YyT*;NX\u001b#\u0002}vO\u001b$\tyHBoR%oj.xQNN\u00061\u001f\u0019C+Z)}\u00177", sXd9, (short) (iXd10 ^ ((856765359 ^ 1637554696) ^ 1384798066)))).getMethod(C1626yg.Ud("\u0017D\u0010\u0015Fv8JQ:E\u0013_LGO", (short) (ZN.Xd() ^ (466845565 ^ 466824643)), (short) (ZN.Xd() ^ (1755819637 ^ 1755809859))), new Class[0]);
            try {
                method10.setAccessible(true);
                ((Callback) method10.invoke(companion10, objArr10)).invoke(Ig.wd("=zX<\u0019\\}\u001fT746`]?\u001bxb'", (short) (C1580rY.Xd() ^ ((816259341 ^ 1984027209) ^ (-1189538879)))));
                return;
            } catch (InvocationTargetException e11) {
                throw e11.getCause();
            }
        }
        if (i3 == ((960081277 ^ 2063535353) ^ 1137090180)) {
            Companion companion11 = Companion;
            int iXd11 = FB.Xd() ^ (2047859486 ^ (-635500563));
            Object[] objArr11 = new Object[0];
            Method method11 = Class.forName(EO.Od("\u001aU\ben9\u0018|5YUz \u0019kAs\u00195\t7`6*\u0002SG\f\u0019B,\u0002fJ\u0007Ur\u001b|\u0003\u0010{2h %VG\u001fY\u001eH|$y\u0017\u0018\u0012~rg|\b\u0013\n.o+`Y}\u000f", (short) (Od.Xd() ^ iXd11))).getMethod(C1561oA.Qd("a^l@Zccj5R\\[PNOV", (short) (C1607wl.Xd() ^ ((1841047867 ^ 1994504868) ^ 459127759))), new Class[0]);
            try {
                method11.setAccessible(true);
                Callback callback = (Callback) method11.invoke(companion11, objArr11);
                short sXd10 = (short) (C1633zX.Xd() ^ ((318201333 ^ 662065856) ^ (-897672476)));
                short sXd11 = (short) (C1633zX.Xd() ^ (959351455 ^ (-959367963)));
                int[] iArr5 = new int["\u0001u\u000e\u0016\n}\u0003\t\u0010\u0002\f\u0013\u0013 \u0014\b\u0005\b\u000e\f\f($\u001a\u001b\u001a".length()];
                QB qb5 = new QB("\u0001u\u000e\u0016\n}\u0003\t\u0010\u0002\f\u0013\u0013 \u0014\b\u0005\b\u000e\f\f($\u001a\u001b\u001a");
                int i13 = 0;
                while (qb5.YK()) {
                    int iKK5 = qb5.KK();
                    Xu xuXd5 = Xu.Xd(iKK5);
                    iArr5[i13] = xuXd5.fK((xuXd5.CK(iKK5) - (sXd10 + i13)) - sXd11);
                    i13++;
                }
                callback.invoke(new String(iArr5, 0, i13));
                return;
            } catch (InvocationTargetException e12) {
                throw e12.getCause();
            }
        }
        if (i3 != (Od.Xd() ^ 1207806804)) {
            Companion companion12 = Companion;
            int iXd12 = FB.Xd();
            Object[] objArr12 = new Object[0];
            Method method12 = Class.forName(C1561oA.Xd("lyx:qo\u0006y\b{x\u0003ywE|z\u0011\u0005\u0013\u0007\u0004\u000e\u0005\u0003\u0004\u0014\u0015S\t\u001a\u0012\u000e\u0012\u0011 [#\u0019\u0014 \"+b~z\u0006(1\u000e! 31)5;\u00169.:,k\f98<.<8??", (short) (iXd12 ^ (895070323 ^ 895074314)))).getMethod(Wg.vd("daoCennu8U_^[YZa", (short) (ZN.Xd() ^ (2014016331 ^ 2014016191))), new Class[0]);
            try {
                method12.setAccessible(true);
                ((Callback) method12.invoke(companion12, objArr12)).invoke(str2);
                return;
            } catch (InvocationTargetException e13) {
                throw e13.getCause();
            }
        }
        Companion companion13 = Companion;
        short sXd12 = (short) (C1633zX.Xd() ^ (1750872936 ^ (-1750890673)));
        int[] iArr6 = new int["JUR\u0012GCWIUGBJ?;\u0007<8L>J<7?40/=<x,;1+-*7p6*#--4i\u0004}\u0007'.\t\u001a\u0017($\u001a$(\u0001\"\u0015\u001f\u000fLj\u0016\u0013\u0015\u0005\u0011\u000b\u0010\u000e".length()];
        QB qb6 = new QB("JUR\u0012GCWIUGBJ?;\u0007<8L>J<7?40/=<x,;1+-*7p6*#--4i\u0004}\u0007'.\t\u001a\u0017($\u001a$(\u0001\"\u0015\u001f\u000fLj\u0016\u0013\u0015\u0005\u0011\u000b\u0010\u000e");
        int i14 = 0;
        while (qb6.YK()) {
            int iKK6 = qb6.KK();
            Xu xuXd6 = Xu.Xd(iKK6);
            iArr6[i14] = xuXd6.fK(sXd12 + sXd12 + i14 + xuXd6.CK(iKK6));
            i14++;
        }
        Class<?> cls = Class.forName(new String(iArr6, 0, i14));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr13 = new Object[0];
        short sXd13 = (short) (Od.Xd() ^ ((1974417244 ^ 1521353435) ^ (-788624176)));
        int[] iArr7 = new int["! 0\u0006\"-/8\u0005$01((+4".length()];
        QB qb7 = new QB("! 0\u0006\"-/8\u0005$01((+4");
        int i15 = 0;
        while (qb7.YK()) {
            int iKK7 = qb7.KK();
            Xu xuXd7 = Xu.Xd(iKK7);
            iArr7[i15] = xuXd7.fK(xuXd7.CK(iKK7) - ((sXd13 + sXd13) + i15));
            i15++;
        }
        Method method13 = cls.getMethod(new String(iArr7, 0, i15), clsArr);
        try {
            method13.setAccessible(true);
            ((Callback) method13.invoke(companion13, objArr13)).invoke(Wg.Zd("r\u0006'\u0016\rmlQgHuo^rbI>R\u001c^[>D,,w\"\u0003(<',", (short) (ZN.Xd() ^ (791180036 ^ 791173574)), (short) (ZN.Xd() ^ ((654886731 ^ 1120918843) ^ 1707549607))));
        } catch (InvocationTargetException e14) {
            throw e14.getCause();
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    @ReactMethod
    public final void processInitEnrollmentResponse(String str, String str2, String str3, String str4, Callback callback) throws Throwable {
        Intrinsics.checkNotNullParameter(str, C1561oA.ud("hsgg", (short) (Od.Xd() ^ (C1607wl.Xd() ^ (28789348 ^ (-1878215785))))));
        Intrinsics.checkNotNullParameter(str2, C1561oA.yd("\u000b\u000b\u001c\u000b\u001d\u0013\u001d \u0018\u001d\u001f", (short) (OY.Xd() ^ (OY.Xd() ^ 69941809))));
        Intrinsics.checkNotNullParameter(str3, C1561oA.Yd("\u001f \u0015\u0011\u0002!\u0011\u001f%\u0014\u0017)\u001f&&", (short) (Od.Xd() ^ ((1517346079 ^ 1301016614) ^ (-402350202)))));
        int iXd = C1607wl.Xd() ^ (2002224368 ^ 420710493);
        int iXd2 = C1607wl.Xd() ^ 1849957608;
        short sXd = (short) (OY.Xd() ^ iXd);
        short sXd2 = (short) (OY.Xd() ^ iXd2);
        int[] iArr = new int["XKY^N\\0Z_][\\^Wah@[p".length()];
        QB qb = new QB("XKY^N\\0Z_][\\^Wah@[p");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        Intrinsics.checkNotNullParameter(str4, new String(iArr, 0, i2));
        Intrinsics.checkNotNullParameter(callback, Jg.Wd("\u0017%\u007f\u0010uDVR", (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ (1143410147 ^ 1974341408))), (short) (C1499aX.Xd() ^ (1836820315 ^ (-1836812878)))));
        Companion companion = Companion;
        Object[] objArr = {callback};
        Method method = Class.forName(ZO.xd("\"3=\n\u001d-0\r2\u001bLD!q\u0016#2{2#)\u000b\u0002OuwP+\u00010Tjky\u001d7'\u000eO,j|MJ\u0016\u0017Io3_e\u0002LYq\u001f9\u0005\u000e]H\u0007)W(}v>\u0006X@s", (short) (C1633zX.Xd() ^ (509945584 ^ (-509938281))), (short) (C1633zX.Xd() ^ (OY.Xd() ^ (692243749 ^ (-761899356)))))).getMethod(Ig.wd("0t\u0016\u000fa&~\u007fw*;U\u0018!'M", (short) (ZN.Xd() ^ (ZN.Xd() ^ 864688775))), Class.forName(C1626yg.Ud("\u00175\b\u0011H%E\ty|Gl\u001eJc\n.p6\n3`J6Zr\u001c^O\u0004~\u0007T*", (short) (C1607wl.Xd() ^ (Od.Xd() ^ (1029807724 ^ 2057051391))), (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (-831087766))))));
        try {
            method.setAccessible(true);
            method.invoke(companion, objArr);
            try {
                IDSecurityApiImpl iDSecurityApiImpl = new IDSecurityApiImpl();
                Activity currentActivity = getReactApplicationContext().getCurrentActivity();
                Activity currentActivity2 = getReactApplicationContext().getCurrentActivity();
                InitEnrollmentResponse initEnrollmentResponse = new InitEnrollmentResponse();
                initEnrollmentResponse.setCode(str);
                initEnrollmentResponse.setDescriptionStr(str2);
                initEnrollmentResponse.setServerEnrollmentKey(str4);
                initEnrollmentResponse.setUuidTransaction(str3);
                Intrinsics.checkNotNull(currentActivity);
                Intrinsics.checkNotNull(currentActivity2);
                String json = new Gson().toJson(iDSecurityApiImpl.processInitEnrollmentResponse(currentActivity, currentActivity2, initEnrollmentResponse));
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(EO.Od("\u0010D0TqLy\fh+!\u0010Q\\t\rGn\u0019b\u0015D+%\u0012YF\u000435\u001dw\u0003' oA0\u001a\n\u001d5\tAB-L\u001eHG)\\FC](#'xni\u007fs)m\bM\u0017}|U\u0014", (short) (C1607wl.Xd() ^ ((1088656540 ^ 1562275422) ^ 503168344)))).getMethod(C1561oA.Qd("*'5\t#,,3}\u001b%$\u0019\u0017\u0018\u001f", (short) (ZN.Xd() ^ ((1168829475 ^ 1570628413) ^ 406276505))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    ((Callback) method2.invoke(companion, objArr2)).invoke(json);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (IllegalViewOperationException unused) {
                Companion companion2 = Companion;
                short sXd3 = (short) (C1580rY.Xd() ^ ((1741488218 ^ 1845581189) ^ (-164388923)));
                short sXd4 = (short) (C1580rY.Xd() ^ ((1448544959 ^ 1045739237) ^ (-1745062122)));
                int[] iArr2 = new int["\u0012\u001f\u001e_\u0017\u0015+\u001f-!\u001e(\u001f\u001dj\" 6*8,)3*()9:x.?7376E\u0001H>9EGP\b$ +MV3FEXVNZ`;^S_Q\u00111^]aSa]dd".length()];
                QB qb2 = new QB("\u0012\u001f\u001e_\u0017\u0015+\u001f-!\u001e(\u001f\u001dj\" 6*8,)3*()9:x.?7376E\u0001H>9EGP\b$ +MV3FEXVNZ`;^S_Q\u00111^]aSa]dd");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i3)) - sXd4);
                    i3++;
                }
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(new String(iArr2, 0, i3)).getMethod(C1561oA.od("\u0013\u0010\u001eq\f\u0015\u0015\u001cf\u0004\u000e\r\u0002\u007f\u0001\b", (short) (C1607wl.Xd() ^ ((271344917 ^ 117113115) ^ 383203325))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    ((Callback) method3.invoke(companion2, objArr3)).invoke(C1561oA.Kd("PS", (short) (C1607wl.Xd() ^ (1296243140 ^ 1296241513))));
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    @ReactMethod
    public final void processfinishEnrollmentResponse(String str, String str2, String str3, String str4, String str5, Callback callback) throws Throwable {
        short sXd = (short) (C1607wl.Xd() ^ ((728470864 ^ 1374812271) ^ 2056936937));
        short sXd2 = (short) (C1607wl.Xd() ^ (595257591 ^ 595235370));
        int[] iArr = new int["\u0011O|\u0018".length()];
        QB qb = new QB("\u0011O|\u0018");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(str, new String(iArr, 0, i2));
        Intrinsics.checkNotNullParameter(str2, C1561oA.Xd("km|m}u}\u0003x\u007f\u007f", (short) (FB.Xd() ^ (1405507421 ^ 1405516527))));
        Intrinsics.checkNotNullParameter(str3, Wg.vd("%)+\u001f'\u000f\u001c))!#\u001d", (short) (FB.Xd() ^ (C1633zX.Xd() ^ (-1951485111)))));
        Intrinsics.checkNotNullParameter(str4, Qg.kd("{lki", (short) (Od.Xd() ^ (181522585 ^ (-181506550))), (short) (Od.Xd() ^ (ZN.Xd() ^ (-864694002)))));
        Intrinsics.checkNotNullParameter(str5, hg.Vd("]NZ]KW)QTPLKKBJO%>Q\t", (short) (C1580rY.Xd() ^ (Od.Xd() ^ (-1207828055))), (short) (C1580rY.Xd() ^ (FB.Xd() ^ (1949818251 ^ (-735619579))))));
        Intrinsics.checkNotNullParameter(callback, C1561oA.ud("B?IH=;<C", (short) (C1580rY.Xd() ^ (1804590647 ^ (-1804587719)))));
        Companion companion = Companion;
        short sXd3 = (short) (C1499aX.Xd() ^ (1347459939 ^ (-1347472637)));
        int[] iArr2 = new int["Q^]\u001fNLbV\\PMWFD\u0012I_uiwc`jaWXhi Uf^rvu\u00058\u007fuptv\u007f7KGRt\u0016r\u0006\u0005\u0010\u000e\u0006\u0012\u0010j\u000e\u0003\u0007x8X\u001e\u001d!\u0013\u0019\u0015\u001c\u001c".length()];
        QB qb2 = new QB("Q^]\u001fNLbV\\PMWFD\u0012I_uiwc`jaWXhi Uf^rvu\u00058\u007fuptv\u007f7KGRt\u0016r\u0006\u0005\u0010\u000e\u0006\u0012\u0010j\u000e\u0003\u0007x8X\u001e\u001d!\u0013\u0019\u0015\u001c\u001c");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 ^ i3));
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr2, 0, i3));
        Class<?>[] clsArr = new Class[1];
        short sXd4 = (short) (FB.Xd() ^ (2003651189 ^ 2003653340));
        int[] iArr3 = new int["\u0005\u0012\u0011R\f\b\u000b\u000e\f\u001a\u001b\u0018[!\u0015\u0012\u0015'a\u0017( \u001c \u001fh~\u001e*+\"\"%.".length()];
        QB qb3 = new QB("\u0005\u0012\u0011R\f\b\u000b\u000e\f\u001a\u001b\u0018[!\u0015\u0012\u0015'a\u0017( \u001c \u001fh~\u001e*+\"\"%.");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (((sXd4 + sXd4) + sXd4) + i4));
            i4++;
        }
        clsArr[0] = Class.forName(new String(iArr3, 0, i4));
        Object[] objArr = {callback};
        Method method = cls.getMethod(Xg.qd("fYi?[fhq>]ijaadm", (short) (C1499aX.Xd() ^ ((1649621320 ^ 2042660628) ^ (-462667934))), (short) (C1499aX.Xd() ^ ((1409637503 ^ 2023527253) ^ (-748260593)))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(companion, objArr);
            try {
                IDSecurityApiImpl iDSecurityApiImpl = new IDSecurityApiImpl();
                Activity currentActivity = getReactApplicationContext().getCurrentActivity();
                Activity currentActivity2 = getReactApplicationContext().getCurrentActivity();
                FinishEnrollmentResponse finishEnrollmentResponse = new FinishEnrollmentResponse();
                finishEnrollmentResponse.setCode(str);
                finishEnrollmentResponse.setDescriptionStr(str2);
                finishEnrollmentResponse.setServerEnrollmentKey2(str5);
                finishEnrollmentResponse.setSeed(str4);
                finishEnrollmentResponse.setFinalScoring(str3);
                Intrinsics.checkNotNull(currentActivity);
                Intrinsics.checkNotNull(currentActivity2);
                String json = new Gson().toJson(iDSecurityApiImpl.processFinishEnrollmentResponse(currentActivity, currentActivity2, finishEnrollmentResponse));
                short sXd5 = (short) (C1607wl.Xd() ^ ((200863131 ^ 1806736743) ^ 1615346221));
                short sXd6 = (short) (C1607wl.Xd() ^ ((2100904424 ^ 1638084534) ^ 479881139));
                int[] iArr4 = new int["\"3/\f 1CT=6V=PA(>Ysbqdv[nemzvU_\u0010\u0005\u001c\u0001{*b\u001d\u0014+\u0016\u001d=q\r|%&L0?;EXOX^<\\Py[\u00163\u007f\u0004ft\u007frr\u000e".length()];
                QB qb4 = new QB("\"3/\f 1CT=6V=PA(>Ysbqdv[nemzvU_\u0010\u0005\u001c\u0001{*b\u001d\u0014+\u0016\u001d=q\r|%&L0?;EXOX^<\\Py[\u00163\u007f\u0004ft\u007frr\u000e");
                int i5 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - ((i5 * sXd6) ^ sXd5));
                    i5++;
                }
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(new String(iArr4, 0, i5)).getMethod(ZO.xd("f*,\nqY3O\u0004\u001c\u0015\u00027V\u0012D", (short) (Od.Xd() ^ ((553714700 ^ 447584032) ^ (-1001191673))), (short) (Od.Xd() ^ ((1364601172 ^ 330827403) ^ (-1122895007)))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    ((Callback) method2.invoke(companion, objArr2)).invoke(json);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (IllegalViewOperationException unused) {
                Companion companion2 = Companion;
                Class<?> cls2 = Class.forName(C1626yg.Ud("Q|\\nkR\u0019!\u000b\u001fk`5O1v\u0007b|o, \u001c\u001cV^\u0003\u001e/6?EHZ6(\u0007~\u0007\u001a5|D\u001a\u0010f(\u0001\u0007w0wmq*2\t\u0011n\u0003&k\u0006\u00036.~\u007fw\u0005,/", (short) (C1633zX.Xd() ^ (756462612 ^ (-756450114))), (short) (C1633zX.Xd() ^ ((2063011861 ^ 126995638) ^ (-2103873335)))));
                Class<?>[] clsArr2 = new Class[0];
                Object[] objArr3 = new Object[0];
                short sXd7 = (short) (C1499aX.Xd() ^ (1789664835 ^ (-1789670043)));
                int[] iArr5 = new int["J\u00174(C\u0001uMn\b\u00157~\u0004\u000e7".length()];
                QB qb5 = new QB("J\u00174(C\u0001uMn\b\u00157~\u0004\u000e7");
                int i6 = 0;
                while (qb5.YK()) {
                    int iKK5 = qb5.KK();
                    Xu xuXd5 = Xu.Xd(iKK5);
                    iArr5[i6] = xuXd5.fK(xuXd5.CK(iKK5) - (C1561oA.Xd[i6 % C1561oA.Xd.length] ^ (sXd7 + i6)));
                    i6++;
                }
                Method method3 = cls2.getMethod(new String(iArr5, 0, i6), clsArr2);
                try {
                    method3.setAccessible(true);
                    ((Callback) method3.invoke(companion2, objArr3)).invoke(EO.Od("\u0007b", (short) (C1633zX.Xd() ^ ((507742324 ^ 947139975) ^ (-641201694)))));
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    @ReactMethod
    public final void retrieveZoomAuthData(final String str, final String str2, final String str3, final String str4, final String str5, final Callback callback) {
        Intrinsics.checkNotNullParameter(str, C1561oA.Qd("\u0005xwtRnghpdeSmhai", (short) (C1633zX.Xd() ^ ((330174936 ^ 600225436) ^ (-812159732)))));
        int iXd = ZN.Xd() ^ (-864701917);
        Intrinsics.checkNotNullParameter(str2, C1593ug.zd("yopoOmhkukn^p\u0005\u0002", (short) (C1633zX.Xd() ^ (258651620 ^ (-258639836))), (short) (C1633zX.Xd() ^ iXd)));
        Intrinsics.checkNotNullParameter(str3, C1561oA.od("\u001a\u000e\r\nk\u0010{\u0005\u0001y`y\r", (short) (Od.Xd() ^ (2109472741 ^ (-2109455377)))));
        Intrinsics.checkNotNullParameter(str4, C1561oA.Kd("\"\u0018\u0019\u0018\u0001\u001f\u001a", (short) (OY.Xd() ^ (1565130190 ^ 1565106444))));
        short sXd = (short) (C1633zX.Xd() ^ ((918752431 ^ 1419038001) ^ (-1649906532)));
        short sXd2 = (short) (C1633zX.Xd() ^ ((1795902230 ^ 1135823940) ^ (-683148425)));
        int[] iArr = new int["2$i\\$\u001aZ".length()];
        QB qb = new QB("2$i\\$\u001aZ");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(str5, new String(iArr, 0, i2));
        Intrinsics.checkNotNullParameter(callback, C1561oA.Xd("DCOPGGJS", (short) (C1499aX.Xd() ^ (C1607wl.Xd() ^ (2137040589 ^ (-287622074))))));
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        Intrinsics.checkNotNull(currentActivity);
        currentActivity.runOnUiThread(new Runnable() { // from class: com.davivienda.daviviendaapp.bridges.ticnow.IDNowSecuritySuite$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                IDNowSecuritySuite.m7091$r8$lambda$cQdDYTHA4_g6WGd7lwLBu74y74(callback, this, str, str2, str3, str4, str5);
            }
        });
    }

    @ReactMethod
    public final void startOnboarding(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final Callback callback) {
        Intrinsics.checkNotNullParameter(str, Wg.vd("\"2(\u000b\"7", (short) (OY.Xd() ^ ((48719843 ^ 1192203032) ^ 1172895546))));
        int iXd = ZN.Xd() ^ (1897500041 ^ (-1116981648));
        Intrinsics.checkNotNullParameter(str2, Qg.kd("\\jbMj[g", (short) (C1633zX.Xd() ^ (1686575815 ^ (-1686591041))), (short) (C1633zX.Xd() ^ iXd)));
        Intrinsics.checkNotNullParameter(str3, hg.Vd("\u0018\u001e!!\u0001\u001d\u0016", (short) (FB.Xd() ^ ((1649260024 ^ 1291959764) ^ 793528970)), (short) (FB.Xd() ^ (741297941 ^ 741280301))));
        Intrinsics.checkNotNullParameter(str4, C1561oA.ud("\u001b\u001f\u0017#\"\u0018\u001e", (short) (ZN.Xd() ^ (C1607wl.Xd() ^ (407169277 ^ 1979754556)))));
        Intrinsics.checkNotNullParameter(str5, C1561oA.yd("\u001b+,\u0006\u001a", (short) (Od.Xd() ^ ((1259732705 ^ 1277299566) ^ (-121100298)))));
        Intrinsics.checkNotNullParameter(str6, C1561oA.Yd(".8<B-?244\u001aB", (short) (C1607wl.Xd() ^ ((1078380420 ^ 1780464301) ^ 710494592))));
        int iXd2 = C1580rY.Xd() ^ 831094084;
        Intrinsics.checkNotNullParameter(str7, Xg.qd("\u0017\u0016\t\u0017n\u000b", (short) (C1633zX.Xd() ^ (224066576 ^ (-224065859))), (short) (C1633zX.Xd() ^ iXd2)));
        short sXd = (short) (C1607wl.Xd() ^ (FB.Xd() ^ 1609521005));
        short sXd2 = (short) (C1607wl.Xd() ^ (2102430029 ^ 2102460043));
        int[] iArr = new int["J({MY7\u007fZ{O }e_".length()];
        QB qb = new QB("J({MY7\u007fZ{O }e_");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        Intrinsics.checkNotNullParameter(str8, new String(iArr, 0, i2));
        Intrinsics.checkNotNullParameter(str9, ZO.xd("vL\rXqEM", (short) (FB.Xd() ^ (C1633zX.Xd() ^ (-1951495572))), (short) (FB.Xd() ^ ((1763326795 ^ 975919179) ^ 1395739999))));
        Intrinsics.checkNotNullParameter(str10, C1626yg.Ud("qZf{`t\u0006a\u007f\r", (short) (Od.Xd() ^ ((464249780 ^ 571778258) ^ (-968842183))), (short) (Od.Xd() ^ (2083019752 ^ (-2083028345)))));
        Intrinsics.checkNotNullParameter(str11, Ig.wd("G\u0012\u0010R:\u001bcV", (short) (C1580rY.Xd() ^ ((315616669 ^ 901192125) ^ (-662234748)))));
        Intrinsics.checkNotNullParameter(callback, EO.Od("\u0013B?\u001cq=O\b", (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ (2144393622 ^ 1314491390)))));
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        Intrinsics.checkNotNull(currentActivity);
        currentActivity.runOnUiThread(new Runnable() { // from class: com.davivienda.daviviendaapp.bridges.ticnow.IDNowSecuritySuite$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                IDNowSecuritySuite.$r8$lambda$txxEAz7E4ET2XYNIxWsHcqdX_nc(callback, this, str2, str, str3, str4, str5, str6, str7, str11, str9, str10, str8);
            }
        });
    }
}
