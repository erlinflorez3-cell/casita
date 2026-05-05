package com.statsig.androidsdk;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.statsig.androidsdk.evaluator.ConfigEvaluation;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.hS2\u000fq}<$i-yCAV\"}0\u0018WNu\nvJ`\u0014YƤ$2)jZH\u000ewyR,8P\u007fCAM\b=ga\u0005:\u0013\"J\"f|\u0015\u0005(.`\u0010%\u007fŲO\f 6\u0001\u000e@`\u001dQ\u0013\u001a*\u0006l!\u0011\"jnf6vtm>=,\u001bipSϮc0\u000bWM d+\u001b\u0002y\u001eYAG9#.k\u00035WkC\u0011K\n=3u7-1I\u0002eNX.\u0015%3U\rk\u0002>^\u001bP\u000f\r7CUcY`&:\b\t\f\u0019L\u0006\u001e\u0006UI>/*f6\u000fa\u0007!dPX\b^P\u0013\u0013cL\u0016S\u0001Ĵ/9)z\u001agI/f9\u0012\u0004;\u001fk\u0007|8sV$_C\u001c\u001d{_Ii@kI\u0017%gV\u0006\u0016\u0001p\u00126\u00142W\u007f]|!0'%e\\g5O|ɘLDu\u0011Mdvn\u0002RvMrz$@B\t:_\u001bߢ\u0007\u07fbTT`\u008ca[*c\u001f\u007f\u001e\u0012N]N˖#ٚ\u0014NWŖ:x[p\"'EeeZE\u008b\u0010Ć=^;̐\"o\u001eljvB@\u0013ϸ\u0007ֽjB[ێ+h60JH\u0019\u0011NӾF«\u0010\u0013:ŭB<B<I+l#X\u000f.DQ|7`jj ~\u00034R\u0015\u00185Kժ\u0003˩`rwg\u0007^|\tn.EA\u007fBoĢWɋl4\u0005ȽȽ\u0003\u0011"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`(o\nK\u000725;y/7C", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`$k\u001c<T/>Z\u0002\"\r", "5`c2A(FS", "", "/oX\u0013X(Mc&~\\Z;|", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`#Zq\u001dv!Di\u000b \u0019i%.#", "3uP97,MO\u001d\u0006\t", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'\u0001\nC\u0007!D]\b)\u0016m%*QJIA", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b>\u000b\u001f`U~\nK\u0005)7#y)6z 2LQ:q}y\u007fLB9\u0003r<[v\tC[N\u0002CP|E] i\n]9\u0011\u0007#=-mQA#\u0007:H\b\u0005H\u0012\b\u001d\u001e1ytL_nG\t\u0011yH7>\nJ", "3uP9h(MW#\b", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`G\u0001\nC\u0007!Dc\u000bi\u0015w\u001f/QE\u001b|0%%dp=\u0011l\u0002", "2dc.\\3L", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b>\u000b\u001f`U~\nK\u0005)7#y)6z 2LQ:q}\u001e&dhI\u0003r6[@\u0005QUO0^2\u00049\u001b\"V\u001dR5\u0016Z@?.v\u000eE.\u0004;W\u0006=2|\u0015\u0015\u001b?noPU\u0016\u0011Y&qH9dU]i\u0003&AT^.k\u001a5`M", "<`\\2", "D`[BX", "", "@t[2", "5q^Bc\u0015:[\u0019", "AdR<a+:`-^\u000ei6\u000b\u0019<e\u000e", "", "", "7cCFc,", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b>\u000b\u001f`U~\nK\u0005)7#y)6z 2LQ:q}}&dhI\u0003r0X\u007f\u0006G[J0c`H2z\u0017V\u001fJt\u0014\u0001bCm\\SD#\u0011.\u001fh@d\u0012\b_\u00151sr\fD\u001fT}\u001ew\u0017\u001fOKUpu\u0011QTf1.s[(2!? %mb\"dY0Sib\u001ev[{=+8", ")KY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005", "5dc\u0014e6N^\u0002z\u0003^", "5dc\u00167\u001bR^\u0019", "5dc\u001fh3>7w", "5dc X*H\\\u0018z\br\f\u0010\u00149s\u00105{N", "u(J\u0019](OOb\u000f\nb3Fp+pU", "5dc#T3NS", "\u0011n\\=T5B]\"", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class FeatureGate extends BaseConfig {
    public static final Companion Companion = new Companion(null);
    private final EvaluationDetails details;
    private final String groupName;
    private final String idType;
    private final String name;
    private final String rule;
    private final Map<String, String>[] secondaryExposures;
    private final boolean value;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u001e\u007fјlʒ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:OIV2}P\u000b\u007fRuj\u0007J\t\u000få\u0013\u000b"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`(o\nK\u000725;y/7,s8UN7t8(\u001e>", "", "u(E", "5dc\u0012e9H`", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`(o\nK\u000725;y/7C", "<`\\2", "", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FeatureGate getError(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new FeatureGate(name, new EvaluationDetails(EvaluationReason.Error, 0L, 0L, 2, null), false, "", null, null, null, PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FeatureGate(String gateName, APIFeatureGate apiFeatureGate, EvaluationDetails evalDetails) {
        Intrinsics.checkNotNullParameter(gateName, "gateName");
        Intrinsics.checkNotNullParameter(apiFeatureGate, "apiFeatureGate");
        Intrinsics.checkNotNullParameter(evalDetails, "evalDetails");
        boolean value = apiFeatureGate.getValue();
        String ruleID = apiFeatureGate.getRuleID();
        String groupName = apiFeatureGate.getGroupName();
        Map<String, String>[] secondaryExposures = apiFeatureGate.getSecondaryExposures();
        this(gateName, evalDetails, value, ruleID, groupName, secondaryExposures == null ? new Map[0] : secondaryExposures, apiFeatureGate.getIdType());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureGate(String name, EvaluationDetails details, boolean z2, String rule, String str, Map<String, String>[] secondaryExposures, String str2) {
        super(name, details);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(rule, "rule");
        Intrinsics.checkNotNullParameter(secondaryExposures, "secondaryExposures");
        this.name = name;
        this.details = details;
        this.value = z2;
        this.rule = rule;
        this.groupName = str;
        this.secondaryExposures = secondaryExposures;
        this.idType = str2;
    }

    public /* synthetic */ FeatureGate(String str, EvaluationDetails evaluationDetails, boolean z2, String str2, String str3, Map[] mapArr, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, evaluationDetails, z2, (i2 & 8) != 0 ? "" : str2, (i2 + 16) - (i2 | 16) != 0 ? null : str3, (i2 + 32) - (i2 | 32) != 0 ? new Map[0] : mapArr, (i2 & 64) == 0 ? str4 : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FeatureGate(String gateName, ConfigEvaluation evaluation, EvaluationDetails details) {
        Intrinsics.checkNotNullParameter(gateName, "gateName");
        Intrinsics.checkNotNullParameter(evaluation, "evaluation");
        Intrinsics.checkNotNullParameter(details, "details");
        boolean booleanValue = evaluation.getBooleanValue();
        String ruleID = evaluation.getRuleID();
        String groupName = evaluation.getGroupName();
        Object[] array = evaluation.getSecondaryExposures().toArray(new Map[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        this(gateName, details, booleanValue, ruleID, groupName, (Map[]) array, null, 64, null);
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final String getIDType() {
        return this.idType;
    }

    public final String getRuleID() {
        return this.rule;
    }

    public final Map<String, String>[] getSecondaryExposures() {
        return this.secondaryExposures;
    }

    public final boolean getValue() {
        return this.value;
    }
}
