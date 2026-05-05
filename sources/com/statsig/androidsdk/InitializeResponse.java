package com.statsig.androidsdk;

import com.google.gson.annotations.SerializedName;
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
@Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6B\u0015\"4ߚ};|ʑi0rd\u0001.SUj\u0014q}Č([2qٔ:U\u001d\u0002͆\rT"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`+x\u0012Kz!<]\u0013 $m$9WLIk\n", "", "u(E", "\u0014`X9X+\"\\\u001d\u000e~Z3\u0001\u001e/R\u007f6\u0007J\n%\u0017", "!tR0X:LT)\u0006^g0\f\r+l\u0004={-\u0001%\"Qx\u001c<", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`+x\u0012Kz!<]\u0013 $m$9WLIkr~\u0011lh9\u0006G5R\u0006+CSRA\\?rK\u001f\u001cc\u001cN\u0001", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`+x\u0012Kz!<]\u0013 $m$9WLIkr\f%f_9\u0015q-^}\u000bPP]0XYvR\u0014~Z\u001cY5\u0016\u0013Y\u0017", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public abstract class InitializeResponse {

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007tpA0JqP.`\\2şs{Břc$wCCU(\n*ޛUȥm}ñzZ9BO)&|x,aU'^\"\u00178B}AKO\u0006<gc\u0005>\u000b @&P{\u001b\u007fH/Н\u0014v\tI\u0014\u0013 >XphSȘ\u0006b\u001b\u0014M8\u00034[\u0016Q|զm&H=3\u001bkXMUdvƮNϘJT5\u0019?\u0010,<X7cՖUY\t\u0007`[W\u0003mrm\rn'5-aum5\u0007\u0003D\u001d1O\u001ba\u000b(r\u0004\u007feR˳*յgK^ p\t\t\u000f%<2\"6-VCE\u001c|\u0007<I;ʘT\tW\u0010uZ\u007f)f|Ѥ$H:9Q3f\u007fz\u0002СM\b\u0012\u0013\u000f6%\u0017mO^\u000b\u00127څ\u001dƻ{W9҅X?NU\u0018a\u000e\u0002\u0012pz\u0002X\u0005fKV\u0083} 2\u001d-ڛs;)*y\f\u0019\\uz\u001db~R\u0018W~DxÊ\u0018֖.\u0011\u0014ZRq\u001dmV_f8ҳQ6"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`+x\u0012Kz!<]\u0013 $m$9WLIkr~\u0011lh9\u0006G5R\u0006+CSRA\\?rK\u001f\u001cc\u001cN\u0001", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`+x\u0012Kz!<]\u0013 $m$9WLIk\n", "@dP@b5", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`+x\u0012Kz!<]\u0013 \u0018i\u001a5:C7y>'j", "3wR2c;B]\"", "\u001aiPCTuEO\"\u0001D>?z\t:t\u00042\u0005\u0016", "AsPAh:\u001c]\u0018~", "", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011S\u0017@\u0006)1`\u000257N\u00122T0;gB(\u001e>H>\u0003t(\u0018}#PN\u0018\foPrH#\u0016d\u0017$\u0012\u0012\u0001j=mu@@!Q\u0010R\u0011;j\u0001\u0019kQ&", "5dc\u0012k*>^(\u0003\u0005g", "u(;7T=:\u001d z\u0004`u\\\u001c-e\u000b7\u007fJ\nl", "5dc\u001fX(L]\"", "u(;0b4\ba(z\nl0~R+n~5\u0006D\u007f%\u0016M9qEz49U\u0005$Lmv*QJ(k0,\u001fq7", "5dc g(Mc'\\\u0005],", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011S\u0017@\u0006)1`\u000257N\u00122T0;gB(\u001e>H>\u0003t(\u0018}#PN\u0018\foPrH#\u0016d\u0017$\u0012\u0012\u0001j=mu@@!Q\u0010R\u0011;j\u0001\u0019kQ\u001chzJ \u001eVu$\u0004E+2Bb^\u0007QEDp)jUC&`I> \u001bu.\u001bUP<\u0015\u0006\\\u001fr\u0011ZckN\u0019y\u001c-B|_BLsj<a'-V\u0006\u0001 2.", "3pd._:", "", "=sW2e", "", "6`b566=S", "BnBAe0GU", "", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    public static final class FailedInitializeResponse extends InitializeResponse {

        @SerializedName(alternate = {}, value = "\f\u001e\b\t\u0013\u0016\n\u000f\r")
        @InterfaceC1492Gx
        private final Exception exception;

        @SerializedName(alternate = {}, value = "\u0019\u000b\u0006\u0017\u0012\u0010")
        @InterfaceC1492Gx
        private final InitializeFailReason reason;

        @SerializedName(alternate = {}, value = "\u001a\u001a\u0006\u0018\u0018\u0015c\u000f\u0003\u0003")
        @InterfaceC1492Gx
        private final Integer statusCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FailedInitializeResponse(InitializeFailReason reason, Exception exc, Integer num) {
            super(null);
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.reason = reason;
            this.exception = exc;
            this.statusCode = num;
        }

        public /* synthetic */ FailedInitializeResponse(InitializeFailReason initializeFailReason, Exception exc, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(initializeFailReason, (2 & i2) != 0 ? null : exc, (i2 + 4) - (i2 | 4) != 0 ? null : num);
        }

        public static /* synthetic */ FailedInitializeResponse copy$default(FailedInitializeResponse failedInitializeResponse, InitializeFailReason initializeFailReason, Exception exc, Integer num, int i2, Object obj) {
            if ((1 & i2) != 0) {
                initializeFailReason = failedInitializeResponse.reason;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                exc = failedInitializeResponse.exception;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
                num = failedInitializeResponse.statusCode;
            }
            return failedInitializeResponse.copy(initializeFailReason, exc, num);
        }

        public final InitializeFailReason component1() {
            return this.reason;
        }

        public final Exception component2() {
            return this.exception;
        }

        public final Integer component3() {
            return this.statusCode;
        }

        public final FailedInitializeResponse copy(InitializeFailReason reason, Exception exc, Integer num) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new FailedInitializeResponse(reason, exc, num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FailedInitializeResponse)) {
                return false;
            }
            FailedInitializeResponse failedInitializeResponse = (FailedInitializeResponse) obj;
            return this.reason == failedInitializeResponse.reason && Intrinsics.areEqual(this.exception, failedInitializeResponse.exception) && Intrinsics.areEqual(this.statusCode, failedInitializeResponse.statusCode);
        }

        public final Exception getException() {
            return this.exception;
        }

        public final InitializeFailReason getReason() {
            return this.reason;
        }

        public final Integer getStatusCode() {
            return this.statusCode;
        }

        public int hashCode() {
            int iHashCode = this.reason.hashCode() * 31;
            Exception exc = this.exception;
            int iHashCode2 = (iHashCode + (exc == null ? 0 : exc.hashCode())) * 31;
            Integer num = this.statusCode;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "FailedInitializeResponse(reason=" + this.reason + ", exception=" + this.exception + ", statusCode=" + this.statusCode + ')';
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLш|\u0004O(8\u000b<N\u0007\"B\u0012\u007fјnjO0LeN.ZS8\u0018sڔ<$q$yّCU(\u0005*\tUNog|Ϻb\u000bI/\u000e\u0016\u0007p4I[xc܉\u0015Hԏ ?aL0ߗ8p\u0007D\u00058@2:\n\u0005/\u001c:J v)Fa\u000b@1P\u0003HV%[\u0015\u001c\"\u0006l\"\u0011 lg|;^k\f;?5\u0011oZ\\7a@|{\u000fVV7\r%f4*n8E\u00193Z\u001b\u0007\u0001cO\u000bEqK\u000e\u0001)=*w}g:f\u000b,\u0015Y[\u001do\u00013t\u0013ab\u001c'YQsM`\u000eVy\u0011z;=\u0014:\f'V<E@v\n\u001e3#tcZ`\u001anD\u0010z\u00108'3\u0010?;;+f\u007fcK\u001b^7*\u0014;\u001fQ\u0002\u0005 \nU\u001eh\u001b\u001bb\bi3g?kJ^\u001e_={\u0015\tp\u0012,\u00140u\u0002?}!.E4MZg$\u074co\u0002VV0\f\u0013\u0005\u0001ayTX@Pp&9:\t:]Zc3l\u0017ՀYt&[Al\u0015\u000e\n# \u000byL#5\u0010|^~h\u0019N$݊&w{E\u007f\u0007y\u001eYI^a7ae a\u0001{*>jcKסg\u000bh\u001a\u0002t624Xj>y\fF^\fA7UpJ5rׂ\u001a%\u001cV+6Bo\u0005Oާ[1\u0019\r}K&\u0019hR~OʝQ%w}\u0012\u0011IZ\t'ļ.\nfCD>c2jD|Q\t\u000fu\u0010G\u0016N]K\u001b\u0017<ʤ|hC(eiUM\u0015\u001f~W4\u0012GUd\u0003gaM@)\u000b\u000b\n\u001bKj>g6l\u0001.pjx^\u0003\u0018PwtqQ\t+҇z*O\tt{V!ZlK9ČZ\u0005Ӝ7\u000b37\u001eS˚ 6\u00035;C?+&y$/Ccmk\u007f.(e%%#f4@i\u0016}fikB=HI\b\u0001N$4l1G^i&\tr\u001d:\rANYr\u0001XHM91\u000eh\u0017,;ulZh\u0014 \u0004:.m1\fC,\u001c\u000fK+\u0011[\\\u007fo\u0004J\u000b\u0015z\u0015\u0010\u000b\n<\u0007\u0012JIPj]b\u0017=\u001e\u0002(8Q;\u0011\u0007L\u000b44Z>\u001e\nqU\u001a2\u0016z\u000eTw5'4RsiX\u001en\ttfJ\u0015`sb18\u0011\u000b\u001f5.xc3\u0015oVT]r`\u0002\u0002\u001e\u001f\u001a\u0019P/n++RdQ\u001d>W/\ruqII\u0010G\u001cU9o{o::(~-BF*OP?`=ұ]Sfr}|v@n\u0003T0Y\u0017|\u0013\rj\u0019Uռ\u001a\u0018y}\u0014EL|*}Ǩ\u0019I\u001eR\\\u001f\f+e\rʨ,VW;Aax$)\fW\u0002=\u000e\n0 U\t\u000b \u000bXDj`܉\u001dƐ\u001aw\u001eȈ\u001a\u000b\u0019c.\u0018~l\u0003\u007f\"<\u00188_\u0002a\u0004#`ik&#V&Ym<F\"НzƠgrkߛm\r\t{?jJ\u0011;P5\u00177O>\u0013\u0007\\J\u0013c \u0007\u0014\u0016\u0013C'U:^ӻ+֤SipҴ\u0004Qa#9C<@oAHT4|M{,\b\u0001Ĝ*נ?\\U˾|\u000bb\u0004Po^rx/|t:1J\u0001UĤ`ǚ\u0017:Nݱ6f5P'9,#Ui\u001f\u0006[HT+gV\u0016ו9כ\u000fu0ϓ)\u0005@}\u0003\u001czl\u0017x\u0018u</VTk\u001c7[4m\u0013\b<Js9x\fj\u0015dĹ;և<,Fю2\u001eAnAU9\u0013\u00073F%@A'C\u0003wc':\u0001+\u0003\u001dY\nI{<\u00047!%?\u001d\u007f'ghK%cg\\)\u001c\u0002\u0014Y-N\u0012W%`ZJkIt¡Wˑ\u0004\u0010'\u07fb<\b{C\u000eY\u0002j8ptNfug\u0004T,FpT#u{\u000fr8- \u001cJ߲]Ɉ8G\u0003߭1FDK;\u0001WY[s\u0012\u000br\u0019{\u0018\u000eʜ\bԠ7\u001d\u0005ӘgsFMW\u0016ٲ3\u0011"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`+x\u0012Kz!<]\u0013 $m$9WLIkr\f%f_9\u0015q-^}\u000bPP]0XYvR\u0014~Z\u001cY5\u0016\u0013Y\u0017", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`+x\u0012Kz!<]\u0013 $m$9WLIk\n", "4dPAh9>5\u0015\u000ezl", "", "", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`#Zq\u001dv!Di\u000b \u0019i%.#", "1n]3\\.L", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`#Zq\u001b\u000b.1a\u0002\u001e\u0015w\u001f/QE\u0011", ":`h2e\nH\\\u001a\u0003|l", "6`b\"c+:b\u0019\r", "", "6`b5H:>R", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`*k\u001c?R,7c\u000b$Fp\u001e\u0004", "Bh\\2", "", "2da6i,=4\u001d~\u0002]:", ">`a.`\u001aM]&~\t", "", "4t[96/>Q\u001f\r\u000bf", "AcZ\u0013_(@a", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005L\u0005$\r<J'&KvW$r0\u000b@\u0003\u001cHi_>\\GB5\u001c\u001a >V \u0005m4\u0018\u00056C[\\0^\u001cnF\u0013\u001fd\u0012M9\f\u000b#$ |G\u0013&\n6V\u0006Jk\tazt:f\u0002>  V}\u001c?)%s\u001c@duX=\u000fr9h\u0013)\u0005XE\u0010\u000b\u0019m*\u00172W*\u0013}\u001d~\u0002_}pi\u001d\u007f\u007f45:7kUIv\u001f$p2t\u000fl", "5dc\u0010b5?W\u001b\r", "u(;7T=:\u001d)\u000e~eud\u0005:;", "5dc\u0011X9Bd\u0019}[b,\u0004\b=", "5dc\u0013X(Mc&~\\Z;|\u0017", "5dc\u0013h3E1\u001c~xd:\r\u0011", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0015T:.^\u0018z\n^:", "u(I", "5dc\u0015T:AC'~y", "u(;0b4\ba(z\nl0~R+n~5\u0006D\u007f%\u0016M9p8\u0005(\u0011`\u007f*Dq%1U\u0019", "5dc\u0019T@>`v\t\u0004_0~\u0017", "Adc\u0019T@>`v\t\u0004_0~\u0017", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005)p", "5dc\u001dT9:[\u0007\u000e\u0005k,\u000b", "5dc W2\u001fZ\u0015\u0001\t", "5dc!\\4>", "u(9", "1n\\=b5>\\(J", "1n\\=b5>\\(JE", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n\\=b5>\\(Q", "1n\\=b5>\\(R", "1n_F", "3pd._:", "=sW2e", "6`b566=S", "", "BnBAe0GU", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    public static final class SuccessfulInitializeResponse extends InitializeResponse {

        @SerializedName(alternate = {}, value = "\u000b\u001f\u0013\u0005\u0010\u000b\u0004~\u0002\r\u000b\u0002\u0004\u0001\f")
        @InterfaceC1492Gx
        private final Map<String, APIDynamicConfig> configs;

        @SerializedName(alternate = {}, value = "\u000b\u000b\u0017\r\u0019\u0007\u0005~\u0005\u0007\u0002\b~\r")
        @InterfaceC1492Gx
        private final Map<String, String> derivedFields;

        @SerializedName(alternate = {}, value = "\r\u000b\u0006\u0018\u0018\u0014\u0006~\u0006~\u0011\u0001\u000e")
        @InterfaceC1492Gx
        private final Map<String, APIFeatureGate> featureGates;

        @SerializedName(alternate = {}, value = "\r\u001b\u0011\u0010\u0002\u0005\t\u0005\u0002\t\u0010\u0011\b")
        @InterfaceC1492Gx
        private final String fullChecksum;

        @SerializedName(alternate = {}, value = "\u000f\u0007\u0018\u0003\u0018\u0012\u0005\u0001\u0013\u0003\u0010")
        @InterfaceC1492Gx
        private final boolean hasUpdates;

        @SerializedName(alternate = {}, value = "\u000f\u0007\u0018\f\u0002\u0017\u0014\u0005\u0003")
        @InterfaceC1492Gx
        private final HashAlgorithm hashUsed;

        @SerializedName(alternate = {}, value = "\u0013\u0007\u001e\t\u0015\u0001\u0004\u000f\r\u0004\u0006\u0003\u000e")
        @InterfaceC1492Gx
        private Map<String, APIDynamicConfig> layerConfigs;

        @SerializedName(alternate = {}, value = "\u0017\u0007\u0017\u0005\u0010\u0001\u0014\u0014\u000e\u0010\u0002\u000f")
        @InterfaceC1492Gx
        private final Map<String, Map<String, Map<String, Object>>> paramStores;

        @SerializedName(alternate = {}, value = "\u001a\n\u0010\u0003\t\u000e\u0002\u0007\u0012")
        @InterfaceC1492Gx
        private final Map<String, Object> sdkFlags;

        @SerializedName(alternate = {}, value = "\u001b\u000f\u0012\t")
        @InterfaceC1492Gx
        private final long time;

        /* JADX WARN: Multi-variable type inference failed */
        public SuccessfulInitializeResponse(Map<String, APIFeatureGate> map, Map<String, APIDynamicConfig> map2, Map<String, APIDynamicConfig> map3, boolean z2, HashAlgorithm hashAlgorithm, long j2, Map<String, String> map4, Map<String, ? extends Map<String, ? extends Map<String, ? extends Object>>> map5, String str, Map<String, ? extends Object> map6) {
            super(null);
            this.featureGates = map;
            this.configs = map2;
            this.layerConfigs = map3;
            this.hasUpdates = z2;
            this.hashUsed = hashAlgorithm;
            this.time = j2;
            this.derivedFields = map4;
            this.paramStores = map5;
            this.fullChecksum = str;
            this.sdkFlags = map6;
        }

        public /* synthetic */ SuccessfulInitializeResponse(Map map, Map map2, Map map3, boolean z2, HashAlgorithm hashAlgorithm, long j2, Map map4, Map map5, String str, Map map6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(map, map2, map3, z2, (-1) - (((-1) - i2) | ((-1) - 16)) != 0 ? null : hashAlgorithm, j2, map4, (i2 & 128) != 0 ? null : map5, (i2 + 256) - (i2 | 256) != 0 ? null : str, (-1) - (((-1) - i2) | ((-1) - 512)) == 0 ? map6 : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SuccessfulInitializeResponse copy$default(SuccessfulInitializeResponse successfulInitializeResponse, Map map, Map map2, Map map3, boolean z2, HashAlgorithm hashAlgorithm, long j2, Map map4, Map map5, String str, Map map6, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                map = successfulInitializeResponse.featureGates;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                map2 = successfulInitializeResponse.configs;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
                map3 = successfulInitializeResponse.layerConfigs;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
                z2 = successfulInitializeResponse.hasUpdates;
            }
            if ((16 & i2) != 0) {
                hashAlgorithm = successfulInitializeResponse.hashUsed;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
                j2 = successfulInitializeResponse.time;
            }
            if ((i2 + 64) - (64 | i2) != 0) {
                map4 = successfulInitializeResponse.derivedFields;
            }
            if ((128 & i2) != 0) {
                map5 = successfulInitializeResponse.paramStores;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 256)) != 0) {
                str = successfulInitializeResponse.fullChecksum;
            }
            if ((i2 + 512) - (i2 | 512) != 0) {
                map6 = successfulInitializeResponse.sdkFlags;
            }
            return successfulInitializeResponse.copy(map, map2, map3, z2, hashAlgorithm, j2, map4, map5, str, map6);
        }

        public final Map<String, APIFeatureGate> component1() {
            return this.featureGates;
        }

        public final Map<String, Object> component10() {
            return this.sdkFlags;
        }

        public final Map<String, APIDynamicConfig> component2() {
            return this.configs;
        }

        public final Map<String, APIDynamicConfig> component3() {
            return this.layerConfigs;
        }

        public final boolean component4() {
            return this.hasUpdates;
        }

        public final HashAlgorithm component5() {
            return this.hashUsed;
        }

        public final long component6() {
            return this.time;
        }

        public final Map<String, String> component7() {
            return this.derivedFields;
        }

        public final Map<String, Map<String, Map<String, Object>>> component8() {
            return this.paramStores;
        }

        public final String component9() {
            return this.fullChecksum;
        }

        public final SuccessfulInitializeResponse copy(Map<String, APIFeatureGate> map, Map<String, APIDynamicConfig> map2, Map<String, APIDynamicConfig> map3, boolean z2, HashAlgorithm hashAlgorithm, long j2, Map<String, String> map4, Map<String, ? extends Map<String, ? extends Map<String, ? extends Object>>> map5, String str, Map<String, ? extends Object> map6) {
            return new SuccessfulInitializeResponse(map, map2, map3, z2, hashAlgorithm, j2, map4, map5, str, map6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuccessfulInitializeResponse)) {
                return false;
            }
            SuccessfulInitializeResponse successfulInitializeResponse = (SuccessfulInitializeResponse) obj;
            return Intrinsics.areEqual(this.featureGates, successfulInitializeResponse.featureGates) && Intrinsics.areEqual(this.configs, successfulInitializeResponse.configs) && Intrinsics.areEqual(this.layerConfigs, successfulInitializeResponse.layerConfigs) && this.hasUpdates == successfulInitializeResponse.hasUpdates && this.hashUsed == successfulInitializeResponse.hashUsed && this.time == successfulInitializeResponse.time && Intrinsics.areEqual(this.derivedFields, successfulInitializeResponse.derivedFields) && Intrinsics.areEqual(this.paramStores, successfulInitializeResponse.paramStores) && Intrinsics.areEqual(this.fullChecksum, successfulInitializeResponse.fullChecksum) && Intrinsics.areEqual(this.sdkFlags, successfulInitializeResponse.sdkFlags);
        }

        public final Map<String, APIDynamicConfig> getConfigs() {
            return this.configs;
        }

        public final Map<String, String> getDerivedFields() {
            return this.derivedFields;
        }

        public final Map<String, APIFeatureGate> getFeatureGates() {
            return this.featureGates;
        }

        public final String getFullChecksum() {
            return this.fullChecksum;
        }

        public final boolean getHasUpdates() {
            return this.hasUpdates;
        }

        public final HashAlgorithm getHashUsed() {
            return this.hashUsed;
        }

        public final Map<String, APIDynamicConfig> getLayerConfigs() {
            return this.layerConfigs;
        }

        public final Map<String, Map<String, Map<String, Object>>> getParamStores() {
            return this.paramStores;
        }

        public final Map<String, Object> getSdkFlags() {
            return this.sdkFlags;
        }

        public final long getTime() {
            return this.time;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10, types: [int] */
        /* JADX WARN: Type inference failed for: r0v30 */
        /* JADX WARN: Type inference failed for: r0v34 */
        public int hashCode() {
            Map<String, APIFeatureGate> map = this.featureGates;
            int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
            Map<String, APIDynamicConfig> map2 = this.configs;
            int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
            Map<String, APIDynamicConfig> map3 = this.layerConfigs;
            int iHashCode3 = (iHashCode2 + (map3 == null ? 0 : map3.hashCode())) * 31;
            boolean z2 = this.hasUpdates;
            ?? r02 = z2;
            if (z2) {
                r02 = 1;
            }
            int i2 = (iHashCode3 + r02) * 31;
            HashAlgorithm hashAlgorithm = this.hashUsed;
            int iHashCode4 = (((i2 + (hashAlgorithm == null ? 0 : hashAlgorithm.hashCode())) * 31) + Long.hashCode(this.time)) * 31;
            Map<String, String> map4 = this.derivedFields;
            int iHashCode5 = (iHashCode4 + (map4 == null ? 0 : map4.hashCode())) * 31;
            Map<String, Map<String, Map<String, Object>>> map5 = this.paramStores;
            int iHashCode6 = (iHashCode5 + (map5 == null ? 0 : map5.hashCode())) * 31;
            String str = this.fullChecksum;
            int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
            Map<String, Object> map6 = this.sdkFlags;
            return iHashCode7 + (map6 != null ? map6.hashCode() : 0);
        }

        public final void setLayerConfigs(Map<String, APIDynamicConfig> map) {
            this.layerConfigs = map;
        }

        public String toString() {
            return "SuccessfulInitializeResponse(featureGates=" + this.featureGates + ", configs=" + this.configs + ", layerConfigs=" + this.layerConfigs + ", hasUpdates=" + this.hasUpdates + ", hashUsed=" + this.hashUsed + ", time=" + this.time + ", derivedFields=" + this.derivedFields + ", paramStores=" + this.paramStores + ", fullChecksum=" + ((Object) this.fullChecksum) + ", sdkFlags=" + this.sdkFlags + ')';
        }
    }

    private InitializeResponse() {
    }

    public /* synthetic */ InitializeResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
