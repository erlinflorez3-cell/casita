package com.dynatrace.agent.communication;

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
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JtP.`\\2\u000fq{<$i*yّCU(\n*ޛUȟm}ñzZ9BO%&|x,aU'^\"\u0013@D\b?aP\u007fCGd\r8\u001b\u001f`'أ}\u0007\u0007 8OX\u0005\tRc\f@1\u0007È;ň\u0011O\u000b* \u000f\u0007'\u000f/tg|9\u000fȔ^\u000381\u0015\u0002Dd&\u000e5Cָ\u000e\u000f\u00035 \u000faLѨp=;\u00153S\u001b\u0007\u0001\\o\tEqK\u0007\u0001'U.y{]6f\u0004,\u0017AN;b9ͭ[ԇUb\u0012;9d,\\^$@w)\u0013=B\u0012&\u001e)^-[\u0019-۳\u000f{{\u0001lXP0x\tɬy*=%@\u00183YUaǯP2L'NO{3\u000e̷'\tv!i^&b\u001b#b\u0001\"@_BUH|\rՒAs\f͏z\u00040\u000f>SP@\n\u0015F\u0019;6\n>؝%q\n҆\\i|\u0012nv\u05eemo"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBdm5]v:V\"", "", "E`XA\\5@B\u001d\u0007z", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006IV", "1n\\:F;:b\u0019", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBtr(]v|", "AdaCX9\u001dO(z", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001i!2\u00171;xE\u001e\"G]H\u0003S7Mr6G\"", "\nh]6g\u0005", "uI;0b4\bR-\bvm9x\u0007//{*{I\u0010`\u0015Qw\u0016L\u007f)3U\r$Av_\fWKC{=\"\u0013dp=\u0011l\u001a]r6G\"5*fZ<<(\u001bV\u001d['\u000b\u0005#=&nMFh\u00066Q\nKq\u0005\n\u0012\u001d9ty\fR\u001bKC\u0003uN:hS8[\tC1Pa&s\f5\u0004bDI+\u0018zb yXw\u000e\u0005b\u0011\u007f[un1&\u0019{44E|9PN}dI\u0005%.U\t_\u000e?^t8Jpt", "5dc$T0MW\"\u0001ib4|P\u001fw\u0014\u0012NK~", "u(9", "\u0018", "5dc\u0010b4FA(z\n^", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`\u0015Qw\u0016L\u007f)3U\r$Av_\fWKC{=\"\u0013dp=\u0011l\u001a]r6G\"", "5dc X9OS&]vm(", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`\u0015Qw\u0016L\u007f)3U\r$Av_*XG\u0005Y4+&hn\u0018\u0003r(>\u0002&C[N\u0002", "1n\\=b5>\\(J", "1n\\=b5>\\(JBN>\u0011r\u0002p}", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "1n_F \u0012%g\u001f\u000fvB", "uI;0b4\bR-\bvm9x\u0007//{*{I\u0010`\u0015Qw\u0016L\u007f)3U\r$Av_\fWKC{=\"\u0013dp=\u0011l\u001a]r6G\"5*fZ<<(\u001bV\u001d['\u000b\u0005#=&nMFh\u00066Q\nKq\u0005\n\u0012\u001d9ty\fR\u001bKC\u0003uN:hS8[\tC1Pa&s\f5`C8D,]p-$d_;\u0006ySZnTypv\u0011\u0017\u0005@,Nv_DA~YF}p|U\u0004\u007f\";\\r'\u00041\u000e=\b@m\u0014Kz'\u0014", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class CommunicationContext {
    private final CommunicationState commState;
    private final ServerDataUpdate serverData;
    private final long waitingTime;

    private CommunicationContext(long j2, CommunicationState commState, ServerDataUpdate serverDataUpdate) {
        Intrinsics.checkNotNullParameter(commState, "commState");
        this.waitingTime = j2;
        this.commState = commState;
        this.serverData = serverDataUpdate;
    }

    public /* synthetic */ CommunicationContext(long j2, CommunicationState communicationState, ServerDataUpdate serverDataUpdate, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, communicationState, serverDataUpdate);
    }

    /* JADX INFO: renamed from: copy-KLykuaI$default, reason: not valid java name */
    public static /* synthetic */ CommunicationContext m7100copyKLykuaI$default(CommunicationContext communicationContext, long j2, CommunicationState communicationState, ServerDataUpdate serverDataUpdate, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            j2 = communicationContext.waitingTime;
        }
        if ((2 & i2) != 0) {
            communicationState = communicationContext.commState;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            serverDataUpdate = communicationContext.serverData;
        }
        return communicationContext.m7102copyKLykuaI(j2, communicationState, serverDataUpdate);
    }

    /* JADX INFO: renamed from: component1-UwyO8pc, reason: not valid java name */
    public final long m7101component1UwyO8pc() {
        return this.waitingTime;
    }

    public final CommunicationState component2() {
        return this.commState;
    }

    public final ServerDataUpdate component3() {
        return this.serverData;
    }

    /* JADX INFO: renamed from: copy-KLykuaI, reason: not valid java name */
    public final CommunicationContext m7102copyKLykuaI(long j2, CommunicationState commState, ServerDataUpdate serverDataUpdate) {
        Intrinsics.checkNotNullParameter(commState, "commState");
        return new CommunicationContext(j2, commState, serverDataUpdate, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommunicationContext)) {
            return false;
        }
        CommunicationContext communicationContext = (CommunicationContext) obj;
        return Duration.m10311equalsimpl0(this.waitingTime, communicationContext.waitingTime) && Intrinsics.areEqual(this.commState, communicationContext.commState) && Intrinsics.areEqual(this.serverData, communicationContext.serverData);
    }

    public final CommunicationState getCommState() {
        return this.commState;
    }

    public final ServerDataUpdate getServerData() {
        return this.serverData;
    }

    /* JADX INFO: renamed from: getWaitingTime-UwyO8pc, reason: not valid java name */
    public final long m7103getWaitingTimeUwyO8pc() {
        return this.waitingTime;
    }

    public int hashCode() {
        int iM10334hashCodeimpl = ((Duration.m10334hashCodeimpl(this.waitingTime) * 31) + this.commState.hashCode()) * 31;
        ServerDataUpdate serverDataUpdate = this.serverData;
        return iM10334hashCodeimpl + (serverDataUpdate == null ? 0 : serverDataUpdate.hashCode());
    }

    public String toString() {
        return "CommunicationContext(waitingTime=" + ((Object) Duration.m10355toStringimpl(this.waitingTime)) + ", commState=" + this.commState + ", serverData=" + this.serverData + ')';
    }
}
