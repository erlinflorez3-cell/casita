package com.dynatrace.agent.communication.network.response;

import com.dynatrace.agent.communication.api.ServerDataUpdate;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLcz\tI\u0006F\u000b6B\u0015\"4\u0012\u000e\u0007njO0Le^.Zݷ0=\u0002ڔd$\n#*F=X\u001e\u0003(IVTi̊rL`\u000bQ\u0010ب\u0015{q4R_\u0004ٛ\u0016\u001b"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}+\u0015vlC\u0010q,\u0018c'UWX5jR_=\"\"a\u001d$", "", "\nh]6g\u0005", "u(E", "!tR0X:L", "\"n^\u001aT5R@\u0019\u000b\u000b^:\f\u0017", " dc?l", " dc?l\fQS\u0017\u000f\nb6\u0006", "#mTEc,<b\u0019}Zk9\u0007\u0016", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}+\u0015vlC\u0010q,\u0018c'UWX5jR_=\"\"a\u001d\r\u0018\r\u0014fUy", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}+\u0015vlC\u0010q,\u0018c'UWX5jR_=\"\"a\u001d\r\u0018\r\u0014fU\u0004\u0002D5/\u00170S\u000b\u0011", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}+\u0015vlC\u0010q,\u0018c'UWX5jR_=\"\"a\u001d\r\u0019\u001d\u0003WA2|\u001a", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}+\u0015vlC\u0010q,\u0018c'UWX5jR_=\"\"a\u001d\r\u001a\u0017\u000fA=-\u000317+\u0018,W\u0011I>", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}+\u0015vlC\u0010q,\u0018c'UWX5jR_=\"\"a\u001d\r\u001b\u0016\u0005lL$lS7\u001eg9V\fH>", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public abstract class ResponseResult {

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\u0015\"4\u0012}\u000fnjG9L͜P.`ݷ2şs{B*c$wCA٬ \u0014̝9O|f(\u0006Z^\u0019C'\u0006Dyz2WW\u0011_(\u000e`EņC5SsK>){D\u000f82P9@ە\u0002b3V\u001b\u000f|YJ:\u0015vВq\u0003o\u001bY\u001d\u001a@ßn&\u0007\u001ejgf6vm\u000eB5#\u0011kZP=^^\u007f\u0014ϼE\u001d8\u001b\u0004y\u001eYNg;#4k\u0005\u001dQ\nOIԡr\u0006\fv8?+w\u0006\u001e\u0383WH\u001b#>g\r\fslٯ\u0004\"o\u001a'CO\u0012Lח\u0012.\u007f\u07be\u0014\u000fB\n\u001c\rwY</2h\u001e\rawɤWFX\u061cvD\u0006\u0003o?ж)\u0014"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}+\u0015vlC\u0010q,\u0018c'UWX5jR_=\"\"a\u001d\r\u0018\r\u0014fUy", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}+\u0015vlC\u0010q,\u0018c'UWX5jR_=\"\"a\u001d$", "@dc?l\u0019>O'\t\u0004", "", "AdaCX9\u001dO(zji+x\u0018/", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001i!2\u00171;xE\u001e\"G]H\u0003S7Mr6G\"", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b>\u000b\u001f`F\u0004\u00178\u000621W}i3o\u00167\\\r9u<&%qe7\u0003r0X\u007fpCWRuJR\u007fN\u0014\u001f9\n]'|\u0010X=3n\u001az\u0010", "5dc\u001fX;Kg\u0006~vl6\u0006", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc X9OS&]vm(l\u0014.a\u000f(", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`\u0015Qw\u0016L\u007f)3U\r$Av_*XG\u0005Y4+&hn\u0018\u0003r(>\u0002&C[N\u0002", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Retry extends ResponseResult {
        private final String retryReason;
        private final ServerDataUpdate serverDataUpdate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Retry(String retryReason, ServerDataUpdate serverDataUpdate) {
            super(null);
            Intrinsics.checkNotNullParameter(retryReason, "retryReason");
            this.retryReason = retryReason;
            this.serverDataUpdate = serverDataUpdate;
        }

        public static /* synthetic */ Retry copy$default(Retry retry, String str, ServerDataUpdate serverDataUpdate, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                str = retry.retryReason;
            }
            if ((i2 + 2) - (i2 | 2) != 0) {
                serverDataUpdate = retry.serverDataUpdate;
            }
            return retry.copy(str, serverDataUpdate);
        }

        public final String component1() {
            return this.retryReason;
        }

        public final ServerDataUpdate component2() {
            return this.serverDataUpdate;
        }

        public final Retry copy(String retryReason, ServerDataUpdate serverDataUpdate) {
            Intrinsics.checkNotNullParameter(retryReason, "retryReason");
            return new Retry(retryReason, serverDataUpdate);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Retry)) {
                return false;
            }
            Retry retry = (Retry) obj;
            return Intrinsics.areEqual(this.retryReason, retry.retryReason) && Intrinsics.areEqual(this.serverDataUpdate, retry.serverDataUpdate);
        }

        public final String getRetryReason() {
            return this.retryReason;
        }

        public final ServerDataUpdate getServerDataUpdate() {
            return this.serverDataUpdate;
        }

        public int hashCode() {
            int iHashCode = this.retryReason.hashCode() * 31;
            ServerDataUpdate serverDataUpdate = this.serverDataUpdate;
            return iHashCode + (serverDataUpdate == null ? 0 : serverDataUpdate.hashCode());
        }

        public String toString() {
            return "Retry(retryReason=" + this.retryReason + ", serverDataUpdate=" + this.serverDataUpdate + ')';
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLш|\u0004O\u00128\u000b4G\u0007\":\u001b\u007fјnjGӄL͜P.`Y2\u000fq{:Ša:ڎs;\u0004\u0019>/\u0019S\\g\u007fnx[ŲG\u0011\f\u0018\u0007mtPc~u\u0012=3\tŪ@{^}DQ`#Ȃ5&8\"Fy\u001d\u0001H+\u000fǼuCTY\u0014*0nyjX\u001bW\u001d\u001c(\u0005l+Gɽ]0UDT\u0005]h<iʜh\u000bU5mH|{\u000e\rĭ&]\u0006o\u001eC@e6չ)Y\u000bޗj]E\u0007Mvݞ\tw"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}+\u0015vlC\u0010q,\u0018c'UWX5jR_=\"\"a\u001d\r\u0018\r\u0014fU\u0004\u0002D5/\u00170S\u000b\u0011", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}+\u0015vlC\u0010q,\u0018c'UWX5jR_=\"\"a\u001d$", "@dc?l\u0019>O'\t\u0004", "", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u001fX;Kg\u0006~vl6\u0006", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class RetryExecution extends ResponseResult {
        private final String retryReason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RetryExecution(String retryReason) {
            super(null);
            Intrinsics.checkNotNullParameter(retryReason, "retryReason");
            this.retryReason = retryReason;
        }

        public static /* synthetic */ RetryExecution copy$default(RetryExecution retryExecution, String str, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                str = retryExecution.retryReason;
            }
            return retryExecution.copy(str);
        }

        public final String component1() {
            return this.retryReason;
        }

        public final RetryExecution copy(String retryReason) {
            Intrinsics.checkNotNullParameter(retryReason, "retryReason");
            return new RetryExecution(retryReason);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RetryExecution) && Intrinsics.areEqual(this.retryReason, ((RetryExecution) obj).retryReason);
        }

        public final String getRetryReason() {
            return this.retryReason;
        }

        public int hashCode() {
            return this.retryReason.hashCode();
        }

        public String toString() {
            return "RetryExecution(retryReason=" + this.retryReason + ')';
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4G\u0007\":\u001b\u007fјnjGӄL͜P.`Y2şs{B0cҕw٘Akڼ.\"7N\u000ftwrXZ#C=\u0007Ȁ|l2Kc{&\u0019\u001d8Zom4\u0014ە>\u0002q\u0003=\u001d `Ĳh\u007f\u000b\u0001(*`\u0010%{\nƾ\u000bZANxRR;V5  \u0010V\"\u0017\u001d\u000br\u0015ɻI5dH;;\u0003\u0018O\u0015Т^x\u0004[\u001b^TU\u001c=ӄ\u001d{OE5-%\u0002\u0004\u07baVaGšWsC\tv,ݹ/Y"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}+\u0015vlC\u0010q,\u0018c'UWX5jR_=\"\"a\u001d\r\u0019\u001d\u0003WA2|\u001a", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}+\u0015vlC\u0010q,\u0018c'UWX5jR_=\"\"a\u001d$", "AdaCX9\u001dO(zji+x\u0018/", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001i!2\u00171;xE\u001e\"G]H\u0003S7Mr6G\"", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0015!Ow\u001eEz#1h\u0002*@7\u00129Q\r)kA/\u0015u@5\u0016_\u001cYu#VL$oM", "5dc X9OS&]vm(l\u0014.a\u000f(", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`\u0015Qw\u0016L\u007f)3U\r$Av_*XG\u0005Y4+&hn\u0018\u0003r(>\u0002&C[N\u0002", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Success extends ResponseResult {
        private final ServerDataUpdate serverDataUpdate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(ServerDataUpdate serverDataUpdate) {
            super(null);
            Intrinsics.checkNotNullParameter(serverDataUpdate, "serverDataUpdate");
            this.serverDataUpdate = serverDataUpdate;
        }

        public static /* synthetic */ Success copy$default(Success success, ServerDataUpdate serverDataUpdate, int i2, Object obj) {
            if ((i2 + 1) - (i2 | 1) != 0) {
                serverDataUpdate = success.serverDataUpdate;
            }
            return success.copy(serverDataUpdate);
        }

        public final ServerDataUpdate component1() {
            return this.serverDataUpdate;
        }

        public final Success copy(ServerDataUpdate serverDataUpdate) {
            Intrinsics.checkNotNullParameter(serverDataUpdate, "serverDataUpdate");
            return new Success(serverDataUpdate);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.serverDataUpdate, ((Success) obj).serverDataUpdate);
        }

        public final ServerDataUpdate getServerDataUpdate() {
            return this.serverDataUpdate;
        }

        public int hashCode() {
            return this.serverDataUpdate.hashCode();
        }

        public String toString() {
            return "Success(serverDataUpdate=" + this.serverDataUpdate + ')';
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4K\u0007\":\u001b\u007fјnjGӄL͜P.`Y2şs{B0cҕw٘Akڼ.\"7N\u000ftwrXZ#C=\u0007Ȁ|l2Kc{& \u001d9Zom4\u0014ە>˃dv<\r.7jP\b\u000e\u0019\u001aXϺ@|\u0001CY\f*0nq\u0001Ŭ\f̂\t\u001c\u0018\u0010L+I/jsf6vy\u000e@=1\u001bkXMUnvƾNUMb7%v\u0010/qÿ6}\u001c3e\u001b\u0007\u0001n\u0006Ƹ>BN\u0013h?'YJָ[>`\u007f\"\u001bCQ\u0013a\u0001+ف\te"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}+\u0015vlC\u0010q,\u0018c'UWX5jR_=\"\"a\u001d\r\u001a\u0017\u000fA=-\u000317+\u0018,W\u0011I>", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}+\u0015vlC\u0010q,\u0018c'UWX5jR_=\"\"a\u001d$", "2d[.l", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006IV", "\nh]6g\u0005", "uI;8b;EW\"H\u007fo4F\r8t\u007f5\u0005<\b`uGp\nL}4\u0013c\u0007.Fz&,\\MHS0+\u001bhn\u000fJT", "5dc\u0011X3:g`n\rr\u0016O\u0014-", "u(9", "\u0018", "1n\\=b5>\\(J", "1n\\=b5>\\(JBN>\u0011r\u0002p}", "1n_F", "1n_F \u0013+2'h_h", "uI\u0018\u0019V6F\u001d\u0018\u0013\u0004Z;\n\u0005-eI$}@\n&`Ey\u0016D\u0007.9Wy/;w\u001fwVCJ}>+\u001b2n9\u0015n6W\u0005'\u00119N:g\\{K\u0014~Z\u001c^2\u001cCHK.V@@3t,U\u0012;v\u0010\u001ak", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class TooManyRequests extends ResponseResult {
        private final long delay;

        private TooManyRequests(long j2) {
            super(null);
            this.delay = j2;
        }

        public /* synthetic */ TooManyRequests(long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j2);
        }

        /* JADX INFO: renamed from: copy-LRDsOJo$default, reason: not valid java name */
        public static /* synthetic */ TooManyRequests m7110copyLRDsOJo$default(TooManyRequests tooManyRequests, long j2, int i2, Object obj) {
            if ((i2 + 1) - (i2 | 1) != 0) {
                j2 = tooManyRequests.delay;
            }
            return tooManyRequests.m7112copyLRDsOJo(j2);
        }

        /* JADX INFO: renamed from: component1-UwyO8pc, reason: not valid java name */
        public final long m7111component1UwyO8pc() {
            return this.delay;
        }

        /* JADX INFO: renamed from: copy-LRDsOJo, reason: not valid java name */
        public final TooManyRequests m7112copyLRDsOJo(long j2) {
            return new TooManyRequests(j2, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TooManyRequests) && Duration.m10311equalsimpl0(this.delay, ((TooManyRequests) obj).delay);
        }

        /* JADX INFO: renamed from: getDelay-UwyO8pc, reason: not valid java name */
        public final long m7113getDelayUwyO8pc() {
            return this.delay;
        }

        public int hashCode() {
            return Duration.m10334hashCodeimpl(this.delay);
        }

        public String toString() {
            return "TooManyRequests(delay=" + ((Object) Duration.m10355toStringimpl(this.delay)) + ')';
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u0016DLcz\u0005I\u0006>\u00146Ȑ\u0007\":ߚ\u007fјnjG6L͜P.`_2şqۛ<:ӋTqq:\u0016!\u0004\"\u07beSPmg|K#\u001cQ\u0011\u001e\u0016'm\\Oc|u\u0014%1pt\u0006ޣN8DGf\r63'xƉ7B\f\u000f\"BH>\u007fAƦJñ\u0016:"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}+\u0015vlC\u0010q,\u0018c'UWX5jR_=\"\"a\u001d\r\u001b\u0016\u0005lL$lS7\u001eg9V\fH>", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}+\u0015vlC\u0010q,\u0018c'UWX5jR_=\"\"a\u001d$", "\nh]6g\u0005", "u(E", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class UnexpectedError extends ResponseResult {
        public static final UnexpectedError INSTANCE = new UnexpectedError();

        private UnexpectedError() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnexpectedError)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1881588853;
        }

        public String toString() {
            return "UnexpectedError";
        }
    }

    private ResponseResult() {
    }

    public /* synthetic */ ResponseResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
