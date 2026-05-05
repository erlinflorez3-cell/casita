package com.cleafy.mobile.detection.agent;

import a.superior;
import a0.taste;
import android.app.Application;
import android.location.LocationListener;
import android.view.MotionEvent;
import c.apparatus;
import c.pair;
import c0.misplace;
import com.cleafy.mobile.detection.agent.configuration.AutomaticUpdateAnalysis;
import com.cleafy.mobile.detection.agent.configuration.CleafyConfigConstants;
import com.cleafy.mobile.detection.agent.configuration.CleafyConfiguration;
import com.cleafy.mobile.detection.agent.configuration.CleafyDetectorsConfiguration;
import com.cleafy.mobile.detection.agent.configuration.EmulatorDebugAnalysis;
import com.cleafy.mobile.detection.http.wrappers.ApiIntegrityResponseParser;
import com.cleafy.mobile.detection.http.wrappers.DefaultHttpClientFactory;
import com.cleafy.mobile.detection.http.wrappers.HttpURLConnectionFactory;
import com.google.firebase.analytics.FirebaseAnalytics;
import d.tongue;
import d0.gregarious;
import java.util.Iterator;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import okhttp3.Interceptor;
import v.civilian;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яj\u001d<K!&i\u000eӵLc\u000b\u0004Iي8\u000b<d\u0007\":\u001e\u007fјnjG0LeN.ZS@\u000fs{:7c$\bCCU ~*\teNogtKb\u000bY\u000f\u000e\u0016~j4Ikxe\u0012\u0015FJoU3UoC;htL\u0005(2(:\u0002\u0005\u0017\u001a2H\u0016x\u0003Ca\f\u001a0Fs@Ŭ\rcĨJ\u00124=h,,b\u007fNdM\u001daH0;\u0003\u0018B~9m4\u0015[\u001dHd';yq\";BM4C$\u0002\u0005MWÜC\u0005EwK\f1D55as\u0006;\t\u0004\"\u0016CO;]#*j\u000ei`:/qTӍOR\u00142\u0006\u0006D\u001aJ\u0010&\u0006UMt2բj\n\u0014?\u0003\u007f\u001cM^\u0010vB.\u007f(;а)\u000299G(/foK1Ne\u00015\u0011,2\u0019nO^\u001b\u0013\u05ce\u0019\u001dZ\b_B\u001aUK[f\n\bB\u001e\b~t\u001a*23\u000e\u0005\u009e\u007f\u00134*3H$N16\u0004\u0002vI\u0018z\u0013t\u0001S\u0018U\u000fE̱r\u0018=?\u0017\u001d#ar\u001d\u0004P\u0003]\\\u0015[2l\u0007,\u000bC$j\u000fT!S\u0013\u0015TŹmlSu\u0018>w{Et\u0007k<\\ibAOic>d\u0019{݀C>h fw\u000bn\u001avt624Xj>z\fF^\fA5UpJ6r6Ǭ`\u0017N\u001f,_\n\u0012\u0017\u007frh>\u0004\u000572\"\u0002$#'GUʷtqm\u0019WMEw0QYQc\u001eV[0\fL~9\u0006-\u0016FLѨPIR\u0011$\u001b\u001e\t.=29\u007fU\u0004\u0018ä\u0003+8);m\u0015\bs|e\u0012U\u007f-}\u001de\u0001.\u001611uݽdlPzbCr\u000fl#;\b\u0013\u00030&\u001dڱIϭX\u0015k@O\"\u0011fTP>*\u0013Mn=\u000f#:|c0yksȾyӄ3\u001fq_o\"<\u0007z\u0011,&s2|{$&zQ\f5q| ʺ\u0001й&.|\u0005H}x\u0005 D\u000fh\u001ba\u0019Yr*n8{\u000eeB=\u0086.ޛt`k<\u0019(\fAFa0+Q,dvQa)M\u0002j$2\"Ŕ\rΊ\u0013\u0014\u001b}7* )U\"\\\u0012p7\u0001\u001e\u0002WNAie;\u0001_ӟ6ʙ@\u0012\u001bEZ(\u0014\u001d\u0013\u0002L\u001d\u001dE\u0003\\\u0002\u007fn\u0010jw\u000b\u0017~I7ѬbՃ.\u000b\u000f\u00119a\u0007BI\u0007s\bbq4J\u000f\u001d5\tI0\u0006C=ޏ-\u05ffXC+*^I\u0019RuEOHDK\u0018A{:\b\ffb3a\u0019ȸ\u001dʦU\u001box6,\u0019b|PjB 3#f0|\u0017z+]rNeԭ\u001b۽vyr/R!\u0006D[\u001c\u0007gRzܶ\u0010Q"}, d2 = {"\u001ab^:\"*ES\u0015\u007f\u000f(4\u0007\u00063l\u007fqz@\u0010\u0017\u0015Vs\u0018E@!7Y\u0007/\u0001K\u001d.IDOA", "", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! \u001d", "/o_9\\*:b\u001d\t\u0004", "", "", "1n]3\\.N`\u0015\u000e~h5d\u0005:", "", "7mXAJ0MV\u0001z\u0006", "uKP;W9HW\u0018Hvi7Fd:p\u0007,y<\u0010\u001b!PEtAr61#\u000e/;t_\u0016IN\u0011/%", "\u001ab^:\"*ES\u0015\u007f\u000f(4\u0007\u00063l\u007fqz@\u0010\u0017\u0015Vs\u0018E@!7Y\u0007/\u0001k 7NG={A\u001a$lkBPA3Nr([*X5]VtM!\u000ei\u0012X4b", "1kT.Y@\u001c]\"\u007f~`<\n\u0005>i\n1", "7mXAJ0MVv\t\u0004_0~\u0019<a\u000f,\u0006I", "uKP;W9HW\u0018Hvi7Fd:p\u0007,y<\u0010\u001b!PEt:\u0001-~W\u0005 3n*wUM8o;\u001e^gaH\u0007a;R\u00010\u0011HP,ea<;\u001e\u001b[\u0012P;\u001a\u0001hE.w\u000e\u0015&\b(J\u0016\u0019r\n\r\u001a\u0010EwlQZ\u001aPOXf", "CoS.g,\u001dS(~xm0\u0007\u0012", "u(E", "7me._0=O(~h^:\u000b\r9n", ":nR.g0H\\", "Adc\u0019b*:b\u001d\t\u0004", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "CrT?<+", "Adc\"f,K7\u0018", "/o_ X:LW#\b^]", "Adc\u000ec7,S'\r~h5`\b", "9dh", "D`[BX", "Ad]16<Lb#\u0007", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@okq>", "/o_\u0011X=BQ\u0019by", "Adc\u000ec7\u001dS*\u0003x^\u0010{", "5dc\u000ec0\"\\(~|k0\f\u001d\u001ce\f8{N\u0010y\u0017Cn\u000eI\u0005", "u(;7T=:\u001d)\u000e~eud\u0005:;", "\u001ab^:\"*ES\u0015\u007f\u000f(4\u0007\u00063l\u007fqz@\u0010\u0017\u0015Vs\u0018E@(Dh\tiIz\u00129XCHy}y lEB\u0016c.[z6[9N:g\\{K\u0014|V\u001b\\+\u001aZ", "/oX\u0016a;>U&\u0003\nr\u0019|\u0017:o\t6{+|$%G|", "AtQ:\\;\u001a^\u001db\u0004m,~\u00163t\u0014\u0015{N\f! Uox8\u000435f", "uKR<`u<Z\u0019z{ru\u0005\u0013,i\u0007(E?\u0001&\u0017E~\u0012F\u007fn8h\r+\u0001\u007f#*XN;xBgpse\u001d\u0010r,P\u0004+V`;,j]|F\"\u0012E\n[9\r\u0012/\u0005\u0015", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", ";nc6b5\u001ed\u0019\b\n", "=m<<g0H\\x\u0010zg;", "uKP;W9HW\u0018H\fb,\u000fR\u0017o\u000f,\u0006I`(\u0017P~c\u007fg", "\u001ab^:\"*ES\u0015\u007f\u000f(4\u0007\u00063l\u007fqz@\u0010\u0017\u0015Vs\u0018E@!7Y\u0007/\u0001I\u0018.VR\u001ao0 \u001eroH\u000ba:$", "5dc\u0011\\(@\\#\r\nb*\u000b", "u(;0b4\bQ ~v_@F\u00119b\u0004/{\n\u007f\u0017&Gm\u001d@\u0001.~U\u007f @|_\nOCDz\u0013\"\u0011jjC\u0015r0L\u0005|", "\u001ab^:\"*ES\u0015\u007f\u000f(4\u0007\u00063l\u007fqz@\u0010\u0017\u0015Vs\u0018E@!7Y\u0007/\u0001I\u0018.VR\u001ao0 \u001eroH\u000ba:5z5VLW,i(", ":hbAX5>`", "@dV6f;>`w\u0003v`5\u0007\u0017>i}6bD\u000f&\u0017Po\u001b", "uKR<`u<Z\u0019z{ru\u0005\u0013,i\u0007(E?\u0001&\u0017E~\u0012F\u007fn1[})F7q0MLJJ8\u001a\u0017qkG\u0016g*\\]+U[N5\\_H\u0001\u0005", "5dc X:LW#\b^]", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc X:LW#\b^]jx\u00128o\u000f$\u000bD\u000b %", "Adb@\\6G7\u0018", "5dc\u000fe6Pa\u0019\f^]", "5dc\u000fe6Pa\u0019\f^]jx\u00128o\u000f$\u000bD\u000b %", "0q^Df,K7\u0018", "5dc\u001dT9>\\(by", "5dc\u001dT9>\\(by\u001d(\u0006\u00129t{7\u007fJ\n%", ">`a2a;\"R", "5dc\u000ec7EW\u0017z\nb6\u0006k9s\u000f1wH\u0001", "5dc\u000ec7EW\u0017z\nb6\u0006k9s\u000f1wH\u0001U\u0013Px\u0018Kr49c\u0007.", "/o_9\\*:b\u001d\t\u0004A6\u000b\u00188a\b(", "5dc#X9LW#\b", "5dc#X9LW#\b9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "Dda@\\6G", "5dc\u0011X=BQ\u0019by", "5dc\u0011X=BQ\u0019by\u001d(\u0006\u00129t{7\u007fJ\n%", "2de6V,\"R", "\u001a`]1e6BRb\u0006\u0005\\(\f\r9nI\u000f\u0006>|&\u001bQxt@\u000545b}-\r", "5dc\u0019b*:b\u001d\t\u0004E0\u000b\u0018/n\u007f5", "u(;.a+K]\u001d}De6z\u0005>i\n1E'\u000b\u0015\u0013Vs\u0018E])Ch})7zk", "5dc\u0019b*:b\u001d\t\u0004E0\u000b\u0018/n\u007f5:<\n !Vk\u001d@\u0001.C", ":nR.g0H\\\u007f\u0003\tm,\u0006\t<", "\u001anZ5g;I!bb\u0004m,\n\u0007/p\u000f2\t\u0016", "5dc\u001c^\u000fMb$b\u0004m,\n\u0007/p\u000f2\t", "u(;<^/Mb$LDB5\f\t<c\u007f3\u000bJ\u000el", "5dc\u001c^\u000fMb$b\u0004m,\n\u0007/p\u000f2\t~|  Q~\nKz/>g", "=j7Ag7\"\\(~\b\\,\b\u00189r", "\u001ab^:\"*ES\u0015\u007f\u000f(4\u0007\u00063l\u007fqz@\u0010\u0017\u0015Vs\u0018E@(Dh\tiIz\u00129XCHy}\u0001$wl)sJ\nX\u007f0GJ]0f[S9\u0012!d\u001bb\u0001", "5dc\u0015g;IC\u0006eXh5\u0006\t-t\u00042\u0005!|\u0015&Q|\"", "u(;0b4\bQ ~v_@F\u00119b\u0004/{\n\u007f\u0017&Gm\u001d@\u0001.~\\\r/B7(;INFkA,^KpH\u0012S\u00195T1PUN*kV|Ft\u000eX\u001dX8!Z", "5dc\u0015g;IC\u0006eXh5\u0006\t-t\u00042\u0005!|\u0015&Q|\"zr.>c\r\u001cFq 7[", "6sc=H\u0019%1#\b\u0004^*\f\r9n`$yO\u000b$+", "\u001ab^:\"*ES\u0015\u007f\u000f(4\u0007\u00063l\u007fqz@\u0010\u0017\u0015Vs\u0018E@(Dh\tiIz\u00129XCHy}|\u0015i]I\u000er\u000f]\u00062%SR,eaS9\u0012!d\u001bb\u0001", "5dc\u0011X-:c \u000e]m;\bf6i\u007f1\u000b!|\u0015&Q|\"", "u(;0b4\bQ ~v_@F\u00119b\u0004/{\n\u007f\u0017&Gm\u001d@\u0001.~\\\r/B7(;INFkA,^Ga:\u0003s3]Y6VW,3`R{Lt\u000eX\u001dX8!Z", "5dc\u0011X-:c \u000e]m;\bf6i\u007f1\u000b!|\u0015&Q|\"zr.>c\r\u001cFq 7[", "2dU.h3M6(\u000e\u0006<3\u0001\t8t`$yO\u000b$+", "/fT;g&KS ~vl,"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class Cleafy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final apparatus f2786a = new apparatus(new pair());

    @JvmStatic
    public static final Map getApiIntegrityRequestHeaders() {
        civilian civilianVar;
        apparatus apparatusVar = f2786a;
        apparatusVar.getClass();
        try {
            tongue tongueVar = apparatusVar.f2445a;
            if (tongueVar == null || (civilianVar = tongueVar.f18385l) == null) {
                return null;
            }
            return civilianVar.a();
        } catch (Throwable unused) {
            tongue tongueVar2 = apparatusVar.f2445a;
            if (tongueVar2 != null) {
                g1.tongue tongueVar3 = tongueVar2.f18384k;
            }
            return null;
        }
    }

    public static final String getApplicationHostname() {
        tongue tongueVar;
        apparatus apparatusVar = f2786a;
        apparatusVar.getClass();
        try {
            tongueVar = apparatusVar.f2445a;
        } catch (Throwable unused) {
            tongue tongueVar2 = apparatusVar.f2445a;
            if (tongueVar2 != null) {
                g1.tongue tongueVar3 = tongueVar2.f18384k;
            }
        }
        String str = tongueVar != null ? tongueVar.f18374a : null;
        return str == null ? "" : str;
    }

    @JvmStatic
    public static /* synthetic */ void getApplicationHostname$annotations() {
    }

    public static final String getBrowserId() {
        tongue tongueVar;
        r0.apparatus apparatusVar;
        apparatus apparatusVar2 = f2786a;
        apparatusVar2.getClass();
        try {
            tongueVar = apparatusVar2.f2445a;
        } catch (Throwable unused) {
            tongue tongueVar2 = apparatusVar2.f2445a;
            if (tongueVar2 != null) {
                g1.tongue tongueVar3 = tongueVar2.f18384k;
            }
        }
        String str = (tongueVar == null || (apparatusVar = tongueVar.f18382i) == null) ? null : apparatusVar.f28264f;
        return str == null ? "" : str;
    }

    @JvmStatic
    public static /* synthetic */ void getBrowserId$annotations() {
    }

    public static final DefaultHttpClientFactory getDefaultHttpClientFactory() {
        tongue tongueVar;
        civilian civilianVar;
        apparatus apparatusVar = f2786a;
        apparatusVar.getClass();
        try {
            tongueVar = apparatusVar.f2445a;
        } catch (Throwable unused) {
        }
        DefaultHttpClientFactory defaultHttpClientFactory = (tongueVar == null || (civilianVar = tongueVar.f18385l) == null) ? null : (DefaultHttpClientFactory) civilianVar.f28344h.getValue();
        return defaultHttpClientFactory == null ? new c.tongue() : defaultHttpClientFactory;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultHttpClientFactory$annotations() {
    }

    public static final String getDeviceId() {
        tongue tongueVar;
        r0.apparatus apparatusVar;
        apparatus apparatusVar2 = f2786a;
        apparatusVar2.getClass();
        try {
            tongueVar = apparatusVar2.f2445a;
        } catch (Throwable unused) {
            tongue tongueVar2 = apparatusVar2.f2445a;
            if (tongueVar2 != null) {
                g1.tongue tongueVar3 = tongueVar2.f18384k;
            }
        }
        String str = (tongueVar == null || (apparatusVar = tongueVar.f18382i) == null) ? null : apparatusVar.f28265g;
        return str == null ? "" : str;
    }

    @JvmStatic
    public static /* synthetic */ void getDeviceId$annotations() {
    }

    @JvmStatic
    public static final AgentDiagnostics getDiagnostics() {
        tongue tongueVar;
        f1.apparatus apparatusVar;
        apparatus apparatusVar2 = f2786a;
        apparatusVar2.getClass();
        try {
            tongueVar = apparatusVar2.f2445a;
        } catch (Throwable unused) {
        }
        f1.pair pairVar = (tongueVar == null || (apparatusVar = tongueVar.f18387n) == null) ? null : new f1.pair(apparatusVar.f18521a.f28259a, CollectionsKt.toList(apparatusVar.f18523c), CollectionsKt.toList(apparatusVar.f18524d), apparatusVar.f18526f, apparatusVar.f18527g, apparatusVar.f18528h);
        if (pairVar != null) {
            return pairVar;
        }
        AgentDiagnostics.Companion.getClass();
        return superior.f74b;
    }

    public static final HttpURLConnectionFactory getHttpURLConnectionFactory() {
        return f2786a.a();
    }

    @JvmStatic
    public static /* synthetic */ void getHttpURLConnectionFactory$annotations() {
    }

    public static final LocationListener getLocationListener() {
        taste tasteVar;
        apparatus apparatusVar = f2786a;
        apparatusVar.getClass();
        try {
            tongue tongueVar = apparatusVar.f2445a;
            if (tongueVar == null || (tasteVar = tongueVar.f18376c) == null) {
                return null;
            }
            return (LocationListener) tasteVar.f84f.getValue();
        } catch (Throwable unused) {
            tongue tongueVar2 = apparatusVar.f2445a;
            if (tongueVar2 != null) {
                g1.tongue tongueVar3 = tongueVar2.f18384k;
            }
            return null;
        }
    }

    @JvmStatic
    public static /* synthetic */ void getLocationListener$annotations() {
    }

    public static final Interceptor getOkHttpInterceptor() {
        return f2786a.f2446b;
    }

    @JvmStatic
    public static /* synthetic */ void getOkHttpInterceptor$annotations() {
    }

    public static final String getParentId() {
        tongue tongueVar;
        r0.apparatus apparatusVar;
        apparatus apparatusVar2 = f2786a;
        apparatusVar2.getClass();
        try {
            tongueVar = apparatusVar2.f2445a;
        } catch (Throwable unused) {
            tongue tongueVar2 = apparatusVar2.f2445a;
            if (tongueVar2 != null) {
                g1.tongue tongueVar3 = tongueVar2.f18384k;
            }
        }
        String str = (tongueVar == null || (apparatusVar = tongueVar.f18382i) == null) ? null : apparatusVar.f28262d;
        return str == null ? "" : str;
    }

    @JvmStatic
    public static /* synthetic */ void getParentId$annotations() {
    }

    public static final String getSessionId() {
        tongue tongueVar;
        r0.apparatus apparatusVar;
        apparatus apparatusVar2 = f2786a;
        apparatusVar2.getClass();
        try {
            tongueVar = apparatusVar2.f2445a;
        } catch (Throwable unused) {
            tongue tongueVar2 = apparatusVar2.f2445a;
            if (tongueVar2 != null) {
                g1.tongue tongueVar3 = tongueVar2.f18384k;
            }
        }
        String str = (tongueVar == null || (apparatusVar = tongueVar.f18382i) == null) ? null : apparatusVar.f28261c;
        return str == null ? "" : str;
    }

    @JvmStatic
    public static /* synthetic */ void getSessionId$annotations() {
    }

    public static final String getVersion() {
        return "3.22.0";
    }

    @JvmStatic
    public static /* synthetic */ void getVersion$annotations() {
    }

    @JvmStatic
    public static final void initWithConfiguration(Application application, CleafyConfiguration cleafyConfiguration) {
        f2786a.a(application, cleafyConfiguration);
    }

    @Deprecated(message = "\u0018Y\u0001tT\u0001\u001aX^`u\u0004^\u001e@Ee`\u0011\n\u0014v\u0012[}[\u0001kb}3t0MtRYek:Z'BH]\u0016O\u0006'YNTHMB\u0018\u0015N)V\u001c\u000b=\u0011\u0001T")
    @JvmStatic
    @InterfaceC1492Gx
    public static final void initWithMap(Application application, Map map) {
        Object next;
        Object next2;
        apparatus apparatusVar = f2786a;
        apparatusVar.getClass();
        if (map.isEmpty()) {
            throw new IllegalArgumentException("The Cleafy map configuration is empty.");
        }
        Object obj = map.get(CleafyConfigConstants.API_ENDPOINT);
        if (obj == null) {
            obj = null;
        }
        if (obj == null) {
            obj = "";
        }
        String str = (String) obj;
        Object obj2 = map.get(CleafyConfigConstants.APPLICATION_HOSTNAME);
        if (obj2 == null) {
            obj2 = null;
        }
        if (obj2 == null) {
            obj2 = "";
        }
        String str2 = (String) obj2;
        Object obj3 = map.get(CleafyConfigConstants.INTEGRATION_TOKEN);
        if (obj3 == null) {
            obj3 = null;
        }
        if (obj3 == null) {
            obj3 = "";
        }
        String str3 = (String) obj3;
        Object obj4 = Boolean.TRUE;
        Object obj5 = map.get(CleafyConfigConstants.DEFAULT_ENABLED);
        if (obj5 == null) {
            obj5 = null;
        }
        if (obj5 != null) {
            obj4 = obj5;
        }
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        b.pair pairVar = AutomaticUpdateAnalysis.Companion;
        Object obj6 = map.get(CleafyConfigConstants.AUTOMATIC_UPDATE_ANALYSIS);
        if (obj6 == null) {
            obj6 = null;
        }
        Integer num = (Integer) obj6;
        pairVar.getClass();
        Iterator<E> it = AutomaticUpdateAnalysis.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int iOrdinal = ((AutomaticUpdateAnalysis) next).ordinal();
            if (num != null && iOrdinal == num.intValue()) {
                break;
            }
        }
        AutomaticUpdateAnalysis automaticUpdateAnalysis = (AutomaticUpdateAnalysis) next;
        if (automaticUpdateAnalysis == null) {
            automaticUpdateAnalysis = AutomaticUpdateAnalysis.NONE;
        }
        b.superior superiorVar = EmulatorDebugAnalysis.Companion;
        Object obj7 = map.get(CleafyConfigConstants.EMULATOR_DETECTION_ANALYSIS);
        if (obj7 == null) {
            obj7 = null;
        }
        int iIntValue = ((Number) (obj7 != null ? obj7 : 0)).intValue();
        superiorVar.getClass();
        Iterator<E> it2 = EmulatorDebugAnalysis.getEntries().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it2.next();
                if (((EmulatorDebugAnalysis) next2).ordinal() == iIntValue) {
                    break;
                }
            }
        }
        EmulatorDebugAnalysis emulatorDebugAnalysis = (EmulatorDebugAnalysis) next2;
        if (emulatorDebugAnalysis == null) {
            emulatorDebugAnalysis = EmulatorDebugAnalysis.NONE;
        }
        Object obj8 = Boolean.FALSE;
        Object obj9 = map.get(CleafyConfigConstants.HTTP_DETECTOR_ENABLED);
        if (obj9 == null) {
            obj9 = null;
        }
        if (obj9 == null) {
            obj9 = obj8;
        }
        boolean zBooleanValue2 = ((Boolean) obj9).booleanValue();
        Object obj10 = map.get(CleafyConfigConstants.CERTIFICATE_DETECTOR_ENABLED);
        if (obj10 == null) {
            obj10 = null;
        }
        if (obj10 == null) {
            obj10 = obj8;
        }
        boolean zBooleanValue3 = ((Boolean) obj10).booleanValue();
        Object obj11 = Boolean.TRUE;
        Object obj12 = map.get(CleafyConfigConstants.MONITORED_APP_ENABLED);
        if (obj12 == null) {
            obj12 = null;
        }
        if (obj12 == null) {
            obj12 = obj11;
        }
        boolean zBooleanValue4 = ((Boolean) obj12).booleanValue();
        Object obj13 = map.get(CleafyConfigConstants.ACTIVITY_DETECTOR_ENABLED);
        if (obj13 == null) {
            obj13 = null;
        }
        if (obj13 == null) {
            obj13 = obj8;
        }
        boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
        Object obj14 = map.get(CleafyConfigConstants.CERTIFICATE_DETECTOR_ENDPOINT);
        if (obj14 == null) {
            obj14 = null;
        }
        String str4 = (String) (obj14 != null ? obj14 : "");
        Object obj15 = map.get(CleafyConfigConstants.ADVANCED_CERTIFICATE_DETECTOR_ENABLED);
        if (obj15 == null) {
            obj15 = null;
        }
        if (obj15 == null) {
            obj15 = obj8;
        }
        boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
        Object obj16 = map.get(CleafyConfigConstants.ROOT_DETECTOR_ENABLED);
        if (obj16 == null) {
            obj16 = null;
        }
        if (obj16 == null) {
            obj16 = obj11;
        }
        boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
        Object obj17 = map.get(CleafyConfigConstants.TASK_INJECTION_ENABLED);
        if (obj17 == null) {
            obj17 = null;
        }
        if (obj17 == null) {
            obj17 = obj8;
        }
        boolean zBooleanValue8 = ((Boolean) obj17).booleanValue();
        Object obj18 = map.get(CleafyConfigConstants.MOCK_LOCATION_ENABLED);
        if (obj18 == null) {
            obj18 = null;
        }
        if (obj18 == null) {
            obj18 = obj11;
        }
        boolean zBooleanValue9 = ((Boolean) obj18).booleanValue();
        Object obj19 = map.get(CleafyConfigConstants.ADVANCED_MOCK_LOCATION_ENABLED);
        if (obj19 == null) {
            obj19 = null;
        }
        if (obj19 == null) {
            obj19 = obj8;
        }
        boolean zBooleanValue10 = ((Boolean) obj19).booleanValue();
        Object obj20 = map.get(CleafyConfigConstants.ON_CALL_DETECTOR_ENABLED);
        if (obj20 == null) {
            obj20 = null;
        }
        if (obj20 == null) {
            obj20 = obj11;
        }
        boolean zBooleanValue11 = ((Boolean) obj20).booleanValue();
        Object obj21 = map.get(CleafyConfigConstants.HUMAN_DETECTOR_ENABLED);
        if (obj21 == null) {
            obj21 = null;
        }
        if (obj21 == null) {
            obj21 = obj8;
        }
        boolean zBooleanValue12 = ((Boolean) obj21).booleanValue();
        Object obj22 = map.get(CleafyConfigConstants.NFC_DETECTOR_ENABLED);
        if (obj22 == null) {
            obj22 = null;
        }
        if (obj22 == null) {
            obj22 = obj11;
        }
        boolean zBooleanValue13 = ((Boolean) obj22).booleanValue();
        Object obj23 = map.get(CleafyConfigConstants.GPS_DETECTOR_ENABLED);
        if (obj23 == null) {
            obj23 = null;
        }
        if (obj23 == null) {
            obj23 = obj8;
        }
        boolean zBooleanValue14 = ((Boolean) obj23).booleanValue();
        Object obj24 = map.get(CleafyConfigConstants.EXTENDED_OVERLAY_DETECTOR_ENABLED);
        if (obj24 == null) {
            obj24 = null;
        }
        if (obj24 == null) {
            obj24 = obj11;
        }
        CleafyDetectorsConfiguration cleafyDetectorsConfiguration = new CleafyDetectorsConfiguration((Unit) null, zBooleanValue2, zBooleanValue3, str4, zBooleanValue4, zBooleanValue5, zBooleanValue6, zBooleanValue7, zBooleanValue8, zBooleanValue9, zBooleanValue10, zBooleanValue11, zBooleanValue12, zBooleanValue13, zBooleanValue14, ((Boolean) obj24).booleanValue(), 1, (DefaultConstructorMarker) null);
        Object obj25 = map.get(CleafyConfigConstants.HASH_SENSITIVE_IDENTIFIERS);
        if (obj25 == null) {
            obj25 = null;
        }
        if (obj25 == null) {
            obj25 = obj8;
        }
        boolean zBooleanValue15 = ((Boolean) obj25).booleanValue();
        Object obj26 = map.get(CleafyConfigConstants.PACKAGE_ANALYSIS_ENABLED);
        if (obj26 == null) {
            obj26 = null;
        }
        if (obj26 == null) {
            obj26 = obj11;
        }
        boolean zBooleanValue16 = ((Boolean) obj26).booleanValue();
        Object obj27 = map.get(CleafyConfigConstants.EXTENDED_PACKAGE_INFORMATION);
        if (obj27 == null) {
            obj27 = null;
        }
        if (obj27 == null) {
            obj27 = obj8;
        }
        boolean zBooleanValue17 = ((Boolean) obj27).booleanValue();
        Object obj28 = map.get(CleafyConfigConstants.ALLOW_UNTRUSTED_CERTIFICATES);
        if (obj28 == null) {
            obj28 = null;
        }
        if (obj28 != null) {
            obj8 = obj28;
        }
        boolean zBooleanValue18 = ((Boolean) obj8).booleanValue();
        Object obj29 = map.get(CleafyConfigConstants.COLLECT_SENSITIVE_IDENTIFIERS);
        Object obj30 = obj29 != null ? obj29 : null;
        if (obj30 != null) {
            obj11 = obj30;
        }
        apparatusVar.a(application, new CleafyConfiguration(null, str, str2, str3, zBooleanValue, automaticUpdateAnalysis, emulatorDebugAnalysis, zBooleanValue16, zBooleanValue17, ((Boolean) obj11).booleanValue(), zBooleanValue15, zBooleanValue18, cleafyDetectorsConfiguration, 1, null));
    }

    @JvmStatic
    public static final void invalidateSession() {
        apparatus apparatusVar = f2786a;
        apparatusVar.getClass();
        try {
            tongue tongueVar = apparatusVar.f2445a;
            if (tongueVar != null) {
                misplace misplaceVar = tongueVar.f18378e;
                r0.apparatus apparatusVar2 = misplaceVar.f2466a;
                apparatusVar2.f28261c = (String) apparatusVar2.f28260b.invoke();
                String str = (String) apparatusVar2.f28260b.invoke();
                apparatusVar2.f28262d = str;
                if (str == null) {
                    str = (String) apparatusVar2.f28260b.invoke();
                }
                apparatusVar2.f28263e = str;
                if (misplaceVar.a(new k0.pair(apparatusVar2.f28261c, apparatusVar2.f28262d, str, apparatusVar2.f28264f, apparatusVar2.f28259a)) != null) {
                    return;
                }
            }
            Unit unit = Unit.INSTANCE;
        } catch (Throwable unused) {
        }
    }

    @JvmStatic
    public static final void onMotionEvent(MotionEvent motionEvent) {
        p.civilian civilianVar;
        apparatus apparatusVar = f2786a;
        apparatusVar.getClass();
        if (motionEvent == null) {
            return;
        }
        try {
            tongue tongueVar = apparatusVar.f2445a;
            if (tongueVar == null || (civilianVar = tongueVar.f18386m) == null) {
                return;
            }
            civilianVar.a(motionEvent);
            Unit unit = Unit.INSTANCE;
        } catch (Throwable unused) {
        }
    }

    @JvmStatic
    public static final void registerDiagnosticsListener(AgentDiagnosticsListener agentDiagnosticsListener) {
        f1.apparatus apparatusVar;
        apparatus apparatusVar2 = f2786a;
        apparatusVar2.getClass();
        try {
            tongue tongueVar = apparatusVar2.f2445a;
            if (tongueVar == null || (apparatusVar = tongueVar.f18387n) == null) {
                return;
            }
            apparatusVar.f18525e.add(agentDiagnosticsListener);
            Unit unit = Unit.INSTANCE;
        } catch (Throwable unused) {
        }
    }

    @Deprecated(message = "\u0018Y\u0001tT\u0001\u001aX^`u\u000eU)\u0018]_M\u001d0\u0014vShwR\u0004o\u0017@cItQeHf*{>Z~CJ\u0005[_\r+gV$i\u0006J\u0013\u0018\\\u0019\rf6\u0017\u000ew\ruPi^\u0003\u0010R5\r\u000e1\u0014\u0007\u0011B:=6\u001c/Je[Q\b%v(]]9\u0004/u\u001bI6\u00176(A<N~^<BGkb\u0014p TI7|)iA\u001f?\u0014\u0012n{s!G_\u0017\r45\u000fG\n\u0014\r\tS .:q\u0004\nae7\u001au(\u001fo&B6")
    @JvmStatic
    @InterfaceC1492Gx
    public static final void sendCustom(String str, String str2) {
        apparatus apparatusVar = f2786a;
        apparatusVar.getClass();
        try {
            tongue tongueVar = apparatusVar.f2445a;
            if (tongueVar == null) {
                return;
            }
            int iHashCode = str.hashCode();
            if (iHashCode != -1976718586) {
                if (iHashCode != -268383166) {
                    if (iHashCode != -147132913) {
                        if (iHashCode == 1901043637 && str.equals(FirebaseAnalytics.Param.LOCATION)) {
                            z.tongue tongueVar2 = tongueVar.f18380g;
                            BuildersKt__Builders_commonKt.launch$default(tongueVar2.f28503d, null, null, new z.superior(tongueVar2, str2, null), 3, null);
                            return;
                        }
                    } else if (str.equals("user_id")) {
                        z.tongue tongueVar3 = tongueVar.f18380g;
                        t.misplace misplaceVar = tongueVar3.f28501b;
                        gregarious gregariousVar = new gregarious(str2);
                        r0.apparatus apparatusVar2 = tongueVar3.f28500a;
                        misplaceVar.a(new k0.pair(apparatusVar2.f28261c, apparatusVar2.f28262d, apparatusVar2.f28263e, apparatusVar2.f28264f, apparatusVar2.f28259a), gregariousVar);
                        Unit unit = Unit.INSTANCE;
                        return;
                    }
                } else if (str.equals("app_session_id")) {
                    z.tongue tongueVar4 = tongueVar.f18380g;
                    t.misplace misplaceVar2 = tongueVar4.f28501b;
                    d0.misplace misplaceVar3 = new d0.misplace(str2);
                    r0.apparatus apparatusVar3 = tongueVar4.f28500a;
                    misplaceVar2.a(new k0.pair(apparatusVar3.f28261c, apparatusVar3.f28262d, apparatusVar3.f28263e, apparatusVar3.f28264f, apparatusVar3.f28259a), misplaceVar3);
                    Unit unit2 = Unit.INSTANCE;
                    return;
                }
            } else if (str.equals("app_device_id")) {
                z.tongue tongueVar5 = tongueVar.f18380g;
                t.misplace misplaceVar4 = tongueVar5.f28501b;
                d0.taste tasteVar = new d0.taste(str2);
                r0.apparatus apparatusVar4 = tongueVar5.f28500a;
                misplaceVar4.a(new k0.pair(apparatusVar4.f28261c, apparatusVar4.f28262d, apparatusVar4.f28263e, apparatusVar4.f28264f, apparatusVar4.f28259a), tasteVar);
                Unit unit3 = Unit.INSTANCE;
                return;
            }
            Unit unit4 = Unit.INSTANCE;
        } catch (Throwable unused) {
        }
    }

    @JvmStatic
    public static final void setAppDeviceId(String str) {
        apparatus apparatusVar = f2786a;
        apparatusVar.getClass();
        try {
            tongue tongueVar = apparatusVar.f2445a;
            if (tongueVar != null) {
                z.tongue tongueVar2 = tongueVar.f18380g;
                t.misplace misplaceVar = tongueVar2.f28501b;
                d0.taste tasteVar = new d0.taste(str);
                r0.apparatus apparatusVar2 = tongueVar2.f28500a;
                misplaceVar.a(new k0.pair(apparatusVar2.f28261c, apparatusVar2.f28262d, apparatusVar2.f28263e, apparatusVar2.f28264f, apparatusVar2.f28259a), tasteVar);
                Unit unit = Unit.INSTANCE;
            }
            Unit unit2 = Unit.INSTANCE;
        } catch (Throwable unused) {
        }
    }

    @JvmStatic
    public static final void setAppSessionId(String str) {
        apparatus apparatusVar = f2786a;
        apparatusVar.getClass();
        try {
            tongue tongueVar = apparatusVar.f2445a;
            if (tongueVar != null) {
                z.tongue tongueVar2 = tongueVar.f18380g;
                t.misplace misplaceVar = tongueVar2.f28501b;
                d0.misplace misplaceVar2 = new d0.misplace(str);
                r0.apparatus apparatusVar2 = tongueVar2.f28500a;
                misplaceVar.a(new k0.pair(apparatusVar2.f28261c, apparatusVar2.f28262d, apparatusVar2.f28263e, apparatusVar2.f28264f, apparatusVar2.f28259a), misplaceVar2);
                Unit unit = Unit.INSTANCE;
            }
            Unit unit2 = Unit.INSTANCE;
        } catch (Throwable unused) {
        }
    }

    @JvmStatic
    public static final void setLocation(String str) {
        apparatus apparatusVar = f2786a;
        apparatusVar.getClass();
        try {
            tongue tongueVar = apparatusVar.f2445a;
            if (tongueVar != null) {
                z.tongue tongueVar2 = tongueVar.f18380g;
                if (BuildersKt__Builders_commonKt.launch$default(tongueVar2.f28503d, null, null, new z.superior(tongueVar2, str, null), 3, null) != null) {
                    return;
                }
            }
            Unit unit = Unit.INSTANCE;
        } catch (Throwable unused) {
        }
    }

    @JvmStatic
    public static final void setUserId(String str) {
        apparatus apparatusVar = f2786a;
        apparatusVar.getClass();
        try {
            tongue tongueVar = apparatusVar.f2445a;
            if (tongueVar != null) {
                z.tongue tongueVar2 = tongueVar.f18380g;
                t.misplace misplaceVar = tongueVar2.f28501b;
                gregarious gregariousVar = new gregarious(str);
                r0.apparatus apparatusVar2 = tongueVar2.f28500a;
                misplaceVar.a(new k0.pair(apparatusVar2.f28261c, apparatusVar2.f28262d, apparatusVar2.f28263e, apparatusVar2.f28264f, apparatusVar2.f28259a), gregariousVar);
                Unit unit = Unit.INSTANCE;
            }
            Unit unit2 = Unit.INSTANCE;
        } catch (Throwable unused) {
        }
    }

    @JvmStatic
    public static final void submitApiIntegrityResponseParser(ApiIntegrityResponseParser apiIntegrityResponseParser) {
        civilian civilianVar;
        apparatus apparatusVar = f2786a;
        apparatusVar.getClass();
        try {
            tongue tongueVar = apparatusVar.f2445a;
            if (tongueVar != null && (civilianVar = tongueVar.f18385l) != null) {
                BuildersKt__Builders_commonKt.launch$default(civilianVar.f28341e, null, null, new v.pair(civilianVar, new f.tongue(apiIntegrityResponseParser), null), 3, null);
                Unit unit = Unit.INSTANCE;
            }
            Unit unit2 = Unit.INSTANCE;
        } catch (Throwable unused) {
        }
    }

    @JvmStatic
    public static final void updateDetection() {
        apparatus apparatusVar = f2786a;
        apparatusVar.getClass();
        try {
            tongue tongueVar = apparatusVar.f2445a;
            if (tongueVar != null) {
                misplace misplaceVar = tongueVar.f18378e;
                r0.apparatus apparatusVar2 = misplaceVar.f2466a;
                String str = (String) apparatusVar2.f28260b.invoke();
                apparatusVar2.f28262d = str;
                if (str == null) {
                    str = (String) apparatusVar2.f28260b.invoke();
                }
                apparatusVar2.f28263e = str;
                if (misplaceVar.a(new k0.pair(apparatusVar2.f28261c, apparatusVar2.f28262d, str, apparatusVar2.f28264f, apparatusVar2.f28259a)) != null) {
                    return;
                }
            }
            Unit unit = Unit.INSTANCE;
        } catch (Throwable unused) {
        }
    }
}
