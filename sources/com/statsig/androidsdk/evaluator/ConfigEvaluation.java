package com.statsig.androidsdk.evaluator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4B\u0007\"B\u0012\u007fјnjG<LeN.ZS@\u000fs{BFc$\bCC٥\"}0'WNmjvJh\u0011K\u000f\f-~̓Bկ\u0006x\f\u0011ǪA\u007fE9M}=Q`#7\u0015(8\"F{\u001d\u00030)v\u000f\u0007\u0003IK\u001a\u0015HB\u00079\u0001\u0011]\u000b \u0012\u0014C8\u0001LbwV<HzdR19\u0002\u0018H^Ue0\u000bU%nd5\u001d\u0003q ;@e;%'c\u00035X\nI1HZO\u0015v73;K\u0004Wd^\u0010\u0016%+}\u0013\f|\u0005g\u0015_f\f57gk[R\u001e(&\u0001\u0012\fj\u0011\u001e\u000e-H<;2h\u001e\raz\u0003YFP\u0010mZ\u007f)bF\u001d+\u007fA;Q\u001b\u0015RqA\u001fNE\r\u001d\rL$\u0011v'[b x\u00171S&dśU@K\\\u001f\u0019g=\u0006\u0004\u001fc͆.\n8Ϛ\u00181\u0002&<-uHiG;#\u0002\u0001vJϼz\u000bhåkkX_N:?2E<!\u000epC\u0013\u0018B³`г0\u001fU\u001cb$\u0016\n\u00199j\u0012\\#++\\k9\u0001xYu\u001251v7\bt\u0002\r\u0006Fӷ7;Yү(cX\u0015\"^\rs\u0013_~Di\u000b\tb͈&8PК(y\u0002d\\$cAM\u000244Z2Ǭ`\u001bPґ6DG\r\u0017u+w\u001e\u000el3R\u0004Ȑ(z\u0011ɖh^v~u\u000f\u001a;\u000bq:-oRڤ\u001d,]Ȩ\u00016\u00034\u0015\u0015D\u0011UidIbkDtʀ\u007f&\u001e֝QS5^!1O:@\u0005EGbq\u0014Ů\u0016-\u0003۠\u0012\u0011A\f<\fXy~1xjxUݚ\u001b(~ܥ\u000b%\u000e\n\u000e\u00122}\tO{|\u001biNU\u0003\u0005i<|>\r\u0007/\u001eS\u0007\u001e,+>\u0016U7+&\u0004$1%a\fo\u007f0\nb=,#ob7І\u001aujГu4A^W\u0001O~0L\u0005+RVz\u0004\u0018D\u00194;9XCtp\u0005>{\u0015]\u0007O\u0019<\u001b\u0001bk<#o,:>a:sq\u0004Bh\"0g߄_ܭqySŌ#L\u00153\u0019#Qp\u0018FKKݱ[\u000f"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`G\u0001\nC\u0007!Dc\u000bi\u0015w\u001f/QE\u001b|0%%dp=\u0011l\u0002", "", "0n^9X(GD\u0015\u0006\u000b^", "", "8r^;I(Ec\u0019", "@dcBe5:P ~kZ3\r\t", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`G\u0001\nC\u0007!Dc\u000bi$m%>ZL7h;\u001e\u0006dhI\u00079", "@t[2<\u000b", "", "5q^Bc\u0015:[\u0019", "AdR<a+:`-^\u000ei6\u000b\u0019<e\u000e", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "3w_9\\*Bb\u0004z\bZ4|\u0018/r\u000e", "", "1n]3\\.\u001dS ~|Z;|", "7r4Ec,KW!~\u0004m\u000e\n\u0013?p", "7r00g0OS", "7rD;e,<]\u001b\b~s,{", "1n]3\\./S&\r~h5", "", "uY;7T=:\u001d z\u0004`uf\u00064e}7Q'~!\u001f\u0011}\u001d8\u000639[G\u001c@l#8QBIj:g\u0015y]@\u0017_;X\u0004p4L]<i[n:\u001b\u0012K\nU;\rZ@F \u007f@\u0001&\u00045KK)w\u000e\u0010\u001f\u0010\u000bQu>g\f\u0011\u0001\u0011~CrVUfc\u0003I\u0017,g&u\b)-k>Amo~&\u0017|72\u0018\u000b)wwN\u000bc1W(~?m%qiU\u001bVZ8\u0006#hRw\u0001\u0014{F\u00048x6\u0006\n\u001f+YkPc):(\u007f\u00115^\u000b\u000b/E<\u0015?X99]", "5dc\u000fb6ES\u0015\bkZ3\r\t", "u(I", "5dc\u0010b5?W\u001b]ze,~\u0005>e", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0010b5?W\u001bozk:\u0001\u00138", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "Adc\u0010b5?W\u001bozk:\u0001\u00138", "uKY.i(\bZ\u0015\b|(\u0010\u0006\u0018/g\u007f5Q\u0004q", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "5dc\u0012k7EW\u0017\u0003\nI(\n\u00057e\u000f(\tN", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u0014e6N^\u0002z\u0003^", "5dc\u0017f6GD\u0015\u0006\u000b^", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "5dc\u001fX;N`\"zwe,m\u00056u\u007f", "u(;0b4\ba(z\nl0~R+n~5\u0006D\u007f%\u0016M9\u000eMr,EU\r*D7\u0003.\\SHt0\u001b\u001chR5\u000es,$", "5dc\u001fh3>7w", "5dc X*H\\\u0018z\br\f\u0010\u00149s\u00105{N", "u(;7T=:\u001d)\u000e~euX\u0016<a\u0014\u000f\u007fN\u0010l", "CmS2_,@O(~yL,z\u00138d{5\u0010 \u0014\"!U\u007f\u001b<\u0005", "5dc\"a+>Z\u0019\u0001vm,{v/c\n1z<\u000e+vZz\u0018J\u000725g", "Adc\"a+>Z\u0019\u0001vm,{v/c\n1z<\u000e+vZz\u0018J\u000725g", "uKY.i(\bc(\u0003\u0002(\b\n\u0016+yf,\nOVZ\b", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class ConfigEvaluation {
    private final boolean booleanValue;
    private final String configDelegate;
    private Integer configVersion;
    private final List<String> explicitParameters;
    private final String groupName;
    private final boolean isActive;
    private final boolean isExperimentGroup;
    private final boolean isUnrecognized;
    private final Object jsonValue;
    private final ReturnableValue returnableValue;
    private final String ruleID;
    private final ArrayList<Map<String, String>> secondaryExposures;
    private ArrayList<Map<String, String>> undelegatedSecondaryExposures;

    public ConfigEvaluation() {
        this(false, null, null, null, null, null, null, null, false, false, false, null, 4095, null);
    }

    public ConfigEvaluation(boolean z2, Object obj, ReturnableValue returnableValue, String ruleID, String str, ArrayList<Map<String, String>> secondaryExposures, List<String> list, String str2, boolean z3, boolean z4, boolean z5, Integer num) {
        Intrinsics.checkNotNullParameter(ruleID, "ruleID");
        Intrinsics.checkNotNullParameter(secondaryExposures, "secondaryExposures");
        this.booleanValue = z2;
        this.jsonValue = obj;
        this.returnableValue = returnableValue;
        this.ruleID = ruleID;
        this.groupName = str;
        this.secondaryExposures = secondaryExposures;
        this.explicitParameters = list;
        this.configDelegate = str2;
        this.isExperimentGroup = z3;
        this.isActive = z4;
        this.isUnrecognized = z5;
        this.configVersion = num;
        this.undelegatedSecondaryExposures = secondaryExposures;
    }

    public /* synthetic */ ConfigEvaluation(boolean z2, Object obj, ReturnableValue returnableValue, String str, String str2, ArrayList arrayList, List list, String str3, boolean z3, boolean z4, boolean z5, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? false : z2, (i2 + 2) - (i2 | 2) != 0 ? null : obj, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? null : returnableValue, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? "" : str, (i2 & 16) != 0 ? null : str2, (i2 + 32) - (i2 | 32) != 0 ? new ArrayList() : arrayList, (i2 & 64) != 0 ? null : list, (i2 + 128) - (i2 | 128) != 0 ? null : str3, (-1) - (((-1) - i2) | ((-1) - 256)) != 0 ? false : z3, (i2 & 512) != 0 ? false : z4, (i2 & 1024) == 0 ? z5 : false, (-1) - (((-1) - i2) | ((-1) - 2048)) == 0 ? num : null);
    }

    public final boolean getBooleanValue() {
        return this.booleanValue;
    }

    public final String getConfigDelegate() {
        return this.configDelegate;
    }

    public final Integer getConfigVersion() {
        return this.configVersion;
    }

    public final List<String> getExplicitParameters() {
        return this.explicitParameters;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final Object getJsonValue() {
        return this.jsonValue;
    }

    public final ReturnableValue getReturnableValue() {
        return this.returnableValue;
    }

    public final String getRuleID() {
        return this.ruleID;
    }

    public final ArrayList<Map<String, String>> getSecondaryExposures() {
        return this.secondaryExposures;
    }

    public final ArrayList<Map<String, String>> getUndelegatedSecondaryExposures() {
        return this.undelegatedSecondaryExposures;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final boolean isExperimentGroup() {
        return this.isExperimentGroup;
    }

    public final boolean isUnrecognized() {
        return this.isUnrecognized;
    }

    public final void setConfigVersion(Integer num) {
        this.configVersion = num;
    }

    public final void setUndelegatedSecondaryExposures(ArrayList<Map<String, String>> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.undelegatedSecondaryExposures = arrayList;
    }
}
