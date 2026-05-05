package com.google.firebase.sessions;

import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4B\u0007\":\u0018\u007fјnjG7L͜P.hS2\u000fq\u0011<$i-yCAW ԃ(\u001fѧ~g\u0016m\u000b\u0016\u001bG\u001d\u0006.x\u0019-YY\u0007_*\u000f`C\u007fCAP\b=gd\u0005:\u0013%J\"f\u007f\u0015\u0005(1`\u0010%\u0003SO\u001a\u001bH@\u001f;b\u0011[\u000f2\u00124?ŋ\u0005\u001ejr\u0017=V\u0004u:]$IފC\u0017.mH\u0015M;G\u001bݒ\u000e?h,DX7c\u0019kڌ\u0004OYiY\u001b? CKٙ(o2W\u000fo6\u0007\bZǊ,\u0018\u0014k\u000f>\\3R'ж(sVqhh\u000eVxAՏ\u000e\u0005Q\u001c$?H\\ƦJl\u000e\u000eAt\u000bSnQ2dH\u007f\tcN\u0017S\u0001c1?\u001btTy;GRg\u0002\u000b\r,(\u0019nOa\u0005\u0014f\u0015)[\u0010Q_YpCNN\u0018bUm2q\u0013\b0\u0004>Q\u0018/*\u0012tЖ$\u007flGB9k0htm\u0005&xjih\u0001G\u0007ͥo^>8+$ZrhK®O\u001d_:4e\u001c\u0003\bDވ\u0012pk\u0006C9%>Vћlorܔu\f+;tD*}y\u0013o9\r9̳Ui\u0018Рjx\u001aMJqUgtLk\f\t]͈&8PК(y\u0002T\\\u001dcAMz44Z2Ǭ`\u001bPґ6DG\u000f\u0017p+w\u001e\u0001l3R\u0004Ȑ(z\u0011ɖh^v\u0003u\n\u001a;\u000b`:-oRڤ\u001d,]Ȩ\u00016\u00037\u0015\u0010D\u000fUjdGzpטy[\u0004\u008d.\u001c?f=Sш\u0013#"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n#Y\f.;w\u001f\u0012VDEA", "", "Adb@\\6G7\u0018", "", "4ha@g\u001a>a'\u0003\u0005g\u0010{", "Adb@\\6G7\"}zq", "", "3uT;g\u001bB[\u0019\r\nZ4\bx=", "", "2`c.66EZ\u0019|\nb6\u0006v>a\u000f8\n", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n\u0014U\r\u001c\u0015w\u001d5MAJo>'\u0003w]H\u0017q\u0002", "4ha2U(LS|\b\tm(\u0004\u0010+t\u00042\u0005$\u007f", "4ha2U(LSt\u000f\na,\u0006\u00183c{7\u007fJ\n\u0006!Mo\u0017", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u00122*9u<g\u0017rk;\u000ecuOz4GIJ:\\\u001c\u0001=\" ^\u0018W9VcUP LN>&\b*X\u0006Eqn\u001b\u0012\u001dExF)[\fXu^|=2j\u0010Gn\u0007KJG8\u0011i\bp\u0019&A6-\u0016;\u0007*uT7\fQ\u0017\u0002", "5dc\u0011T;:1#\u0006\u0002^*\f\r9nm7wO\u0011%", "u(;0b4\bU#\t|e,F\n3r\u007f%wN\u0001`%G}\u001c@\u0001.C#\\\u001cFis8TJ;iC\"\u001fqOH\u0003r<\\L", "5dc\u0012i,Gb\b\u0003\u0003^:\f\u00057po6", "u(9", "5dc\u0013\\9>P\u0015\rz:<\f\f/n\u000f,y<\u0010\u001b!P^\u0018Bv.", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0013\\9>P\u0015\rzB5\u000b\u0018+l\u0007$\u000bD\u000b zF", "5dc\u0013\\9Lb\u0007~\tl0\u0007\u0012\u0013d", "5dc X:LW#\b^]", "5dc X:LW#\b^g+|\u001c", "u(8", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>35g\f$Av$"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SessionInfo {
    private final DataCollectionStatus dataCollectionStatus;
    private final long eventTimestampUs;
    private final String firebaseAuthenticationToken;
    private final String firebaseInstallationId;
    private final String firstSessionId;
    private final String sessionId;
    private final int sessionIndex;

    public SessionInfo(String sessionId, String firstSessionId, int i2, long j2, DataCollectionStatus dataCollectionStatus, String firebaseInstallationId, String firebaseAuthenticationToken) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        Intrinsics.checkNotNullParameter(dataCollectionStatus, "dataCollectionStatus");
        Intrinsics.checkNotNullParameter(firebaseInstallationId, "firebaseInstallationId");
        Intrinsics.checkNotNullParameter(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.sessionId = sessionId;
        this.firstSessionId = firstSessionId;
        this.sessionIndex = i2;
        this.eventTimestampUs = j2;
        this.dataCollectionStatus = dataCollectionStatus;
        this.firebaseInstallationId = firebaseInstallationId;
        this.firebaseAuthenticationToken = firebaseAuthenticationToken;
    }

    public static /* synthetic */ SessionInfo copy$default(SessionInfo sessionInfo, String str, String str2, int i2, long j2, DataCollectionStatus dataCollectionStatus, String str3, String str4, int i3, Object obj) {
        if ((1 & i3) != 0) {
            str = sessionInfo.sessionId;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            str2 = sessionInfo.firstSessionId;
        }
        if ((4 & i3) != 0) {
            i2 = sessionInfo.sessionIndex;
        }
        if ((i3 + 8) - (8 | i3) != 0) {
            j2 = sessionInfo.eventTimestampUs;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
            dataCollectionStatus = sessionInfo.dataCollectionStatus;
        }
        if ((i3 + 32) - (32 | i3) != 0) {
            str3 = sessionInfo.firebaseInstallationId;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 64)) != 0) {
            str4 = sessionInfo.firebaseAuthenticationToken;
        }
        return sessionInfo.copy(str, str2, i2, j2, dataCollectionStatus, str3, str4);
    }

    public final String component1() {
        return this.sessionId;
    }

    public final String component2() {
        return this.firstSessionId;
    }

    public final int component3() {
        return this.sessionIndex;
    }

    public final long component4() {
        return this.eventTimestampUs;
    }

    public final DataCollectionStatus component5() {
        return this.dataCollectionStatus;
    }

    public final String component6() {
        return this.firebaseInstallationId;
    }

    public final String component7() {
        return this.firebaseAuthenticationToken;
    }

    public final SessionInfo copy(String sessionId, String firstSessionId, int i2, long j2, DataCollectionStatus dataCollectionStatus, String firebaseInstallationId, String firebaseAuthenticationToken) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        Intrinsics.checkNotNullParameter(dataCollectionStatus, "dataCollectionStatus");
        Intrinsics.checkNotNullParameter(firebaseInstallationId, "firebaseInstallationId");
        Intrinsics.checkNotNullParameter(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        return new SessionInfo(sessionId, firstSessionId, i2, j2, dataCollectionStatus, firebaseInstallationId, firebaseAuthenticationToken);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionInfo)) {
            return false;
        }
        SessionInfo sessionInfo = (SessionInfo) obj;
        return Intrinsics.areEqual(this.sessionId, sessionInfo.sessionId) && Intrinsics.areEqual(this.firstSessionId, sessionInfo.firstSessionId) && this.sessionIndex == sessionInfo.sessionIndex && this.eventTimestampUs == sessionInfo.eventTimestampUs && Intrinsics.areEqual(this.dataCollectionStatus, sessionInfo.dataCollectionStatus) && Intrinsics.areEqual(this.firebaseInstallationId, sessionInfo.firebaseInstallationId) && Intrinsics.areEqual(this.firebaseAuthenticationToken, sessionInfo.firebaseAuthenticationToken);
    }

    public final DataCollectionStatus getDataCollectionStatus() {
        return this.dataCollectionStatus;
    }

    public final long getEventTimestampUs() {
        return this.eventTimestampUs;
    }

    public final String getFirebaseAuthenticationToken() {
        return this.firebaseAuthenticationToken;
    }

    public final String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    public final String getFirstSessionId() {
        return this.firstSessionId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getSessionIndex() {
        return this.sessionIndex;
    }

    public int hashCode() {
        return (((((((((((this.sessionId.hashCode() * 31) + this.firstSessionId.hashCode()) * 31) + Integer.hashCode(this.sessionIndex)) * 31) + Long.hashCode(this.eventTimestampUs)) * 31) + this.dataCollectionStatus.hashCode()) * 31) + this.firebaseInstallationId.hashCode()) * 31) + this.firebaseAuthenticationToken.hashCode();
    }

    public String toString() {
        return "SessionInfo(sessionId=" + this.sessionId + ", firstSessionId=" + this.firstSessionId + ", sessionIndex=" + this.sessionIndex + ", eventTimestampUs=" + this.eventTimestampUs + ", dataCollectionStatus=" + this.dataCollectionStatus + ", firebaseInstallationId=" + this.firebaseInstallationId + ", firebaseAuthenticationToken=" + this.firebaseAuthenticationToken + ')';
    }
}
