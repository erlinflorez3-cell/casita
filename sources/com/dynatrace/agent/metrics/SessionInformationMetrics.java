package com.dynatrace.agent.metrics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.codec.language.Soundex;
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
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4B\u0007\":\u001b\u007f\u0007lnA0RlP\u008cZS8\u0015s{:8aҖwYП\u0006\u001a,!I\u0005^kunbZ9D\u001f\n$z\u0003,wV\ta \u0012JB\u001eCCQ}BQ`#:\u0015$@(Py3\u0005*.V\u0017\u000fzqOë\u00162FxH[M\r\u000b.\"\nL*\u0019\u001e\u000br^:Vxu:]0\u0013mP\\?_^\n]\u0011TW?\r%e./N<M\u0015SW\u0013\u000b`aW\u0003muM\tv.?+wwɱ:Z\u0006\u001c#:\u0018\u0011k\n>\\3U)\u00135CgcyQT\u0090xC\u0003\u001bU\u001c\u000e4(\u000fΚ.bm\u0016(Kt!W\u0007ї\u0003'I\u000e\u0016y6E)FŘ,\u0002\"tmy;GR}߭\u0006U%1\u001e\u0007!\nXTײ\u0016c\u0018\u0006oIQn׀xT\u0010YKm\u001cp\u0011\u0003Z\n6G\u000e1\u0014\u0011\\\u0018U=a91$\u0004\u0002vH\u0018|\u000b`vX\u0002RvDRt\u001c78\u000f$Zrh5qVTf3)MJXMĩ\u0007[1j\u0017T!S\u0014~Uv\n\u0003Os\tS.-ǔZ7r\u001cxQ^aB\u0018Ԇ\u000f*Y\u00056W<\u0011\u0006\u001fڿA$\u001bh\\@\"`Iн\u0014}\u0004ͩf\u000e\u0019BM\u0003lC:31\\CIҴ\"HIґ!a`z\u001e\u0010%B2\u0006\u0002$#\rɹTbxב\u007fzO/\u000bsr<OVM\u0019TYɋl:\u0005Ƚ\u001f\u0001y\u0014Uz\u001dVZr.u\u0004\u007f°\u001a A֗G?\u0019$\r<\u0003\u0011;Ldr\u0014Ů\u0016-\u0003۠\u0012\u0011A~<zŶn\u0014"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\t\u0017&Ts\fJ@\u00135g\f$Avy7NMHs0-\u0019rj!\u0007r9Rt5\u001d", "", "7mbAT5<S|}", "", "Adb@\\6G7\u0018", "7r6?T0E3*~\u0004m:Z\u00058B\u007f\u0006wK\u0010'$Gn", "", "1qP@[\u0019>^#\f\nb5~", "Adb@\\6G/\u0017\u000e~o,", "3uT;g\u0019>^#\f\nb5~", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok#B80/%", "Dhb6g6K7\u0018", "", "Adb@\\6G7\"\u007f\u0005B+", "", "Ad`BX5<S\u0002\u000f\u0003[,\n", "uI8\u0016M!3H\\o", "5dc\u0016a:MO\"|zB+", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc X:LW#\b^]", "u(I", "5dc\u0010e(LV\u0006~\u0006h9\f\r8g", "5dc X:LW#\bV\\;\u0001\u001a/", "5dc\u0012i,Gb\u0006~\u0006h9\f\r8g", "7r00g0OSz\fvb3j\t=s\u00042\u0005", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n_F", "3pd._:", "=sW2e", "6`b566=S", "BnBAe0GU", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class SessionInformationMetrics {
    private final boolean crashReporting;
    private final boolean eventReporting;
    private final String instanceId;
    private final boolean isGrailEventsCanBeCaptured;
    private final boolean sessionActive;
    private final String sessionId;

    public SessionInformationMetrics(long j2, int i2, int i3, boolean z2, boolean z3, boolean z4, boolean z5) {
        this(String.valueOf(j2), new StringBuilder().append(j2).append('_').append(i2).append(Soundex.SILENT_MARKER).append(i3).toString(), z2, z3, z4, z5);
    }

    public SessionInformationMetrics(String instanceId, String sessionId, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.instanceId = instanceId;
        this.sessionId = sessionId;
        this.isGrailEventsCanBeCaptured = z2;
        this.crashReporting = z3;
        this.sessionActive = z4;
        this.eventReporting = z5;
    }

    public static /* synthetic */ SessionInformationMetrics copy$default(SessionInformationMetrics sessionInformationMetrics, String str, String str2, boolean z2, boolean z3, boolean z4, boolean z5, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            str = sessionInformationMetrics.instanceId;
        }
        if ((2 & i2) != 0) {
            str2 = sessionInformationMetrics.sessionId;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            z2 = sessionInformationMetrics.isGrailEventsCanBeCaptured;
        }
        if ((8 & i2) != 0) {
            z3 = sessionInformationMetrics.crashReporting;
        }
        if ((i2 + 16) - (16 | i2) != 0) {
            z4 = sessionInformationMetrics.sessionActive;
        }
        if ((i2 & 32) != 0) {
            z5 = sessionInformationMetrics.eventReporting;
        }
        return sessionInformationMetrics.copy(str, str2, z2, z3, z4, z5);
    }

    public final String component1() {
        return this.instanceId;
    }

    public final String component2() {
        return this.sessionId;
    }

    public final boolean component3() {
        return this.isGrailEventsCanBeCaptured;
    }

    public final boolean component4() {
        return this.crashReporting;
    }

    public final boolean component5() {
        return this.sessionActive;
    }

    public final boolean component6() {
        return this.eventReporting;
    }

    public final SessionInformationMetrics copy(String instanceId, String sessionId, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        return new SessionInformationMetrics(instanceId, sessionId, z2, z3, z4, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionInformationMetrics)) {
            return false;
        }
        SessionInformationMetrics sessionInformationMetrics = (SessionInformationMetrics) obj;
        return Intrinsics.areEqual(this.instanceId, sessionInformationMetrics.instanceId) && Intrinsics.areEqual(this.sessionId, sessionInformationMetrics.sessionId) && this.isGrailEventsCanBeCaptured == sessionInformationMetrics.isGrailEventsCanBeCaptured && this.crashReporting == sessionInformationMetrics.crashReporting && this.sessionActive == sessionInformationMetrics.sessionActive && this.eventReporting == sessionInformationMetrics.eventReporting;
    }

    public final boolean getCrashReporting() {
        return this.crashReporting;
    }

    public final boolean getEventReporting() {
        return this.eventReporting;
    }

    public final String getInstanceId() {
        return this.instanceId;
    }

    public final boolean getSessionActive() {
        return this.sessionActive;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return (((((((((this.instanceId.hashCode() * 31) + this.sessionId.hashCode()) * 31) + Boolean.hashCode(this.isGrailEventsCanBeCaptured)) * 31) + Boolean.hashCode(this.crashReporting)) * 31) + Boolean.hashCode(this.sessionActive)) * 31) + Boolean.hashCode(this.eventReporting);
    }

    public final boolean isActiveGrailSession() {
        return this.isGrailEventsCanBeCaptured && this.sessionActive;
    }

    public final boolean isGrailEventsCanBeCaptured() {
        return this.isGrailEventsCanBeCaptured;
    }

    public String toString() {
        return "SessionInformationMetrics(instanceId=" + this.instanceId + ", sessionId=" + this.sessionId + ", isGrailEventsCanBeCaptured=" + this.isGrailEventsCanBeCaptured + ", crashReporting=" + this.crashReporting + ", sessionActive=" + this.sessionActive + ", eventReporting=" + this.eventReporting + ')';
    }
}
