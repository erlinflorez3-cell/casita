package com.dynatrace.agent.communication;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLcz\u000bI\u0006F\u000b6B\u0015\"4\u0012\u000e\u0007njO0Le^.ZS@\u000fsڔ:Rqҕ\"CiTR\u0003$\fSSmnv\u000ba\u0011EǇ\n\u0018~j:JǄwa\u001b\u0019=N|MݵQ~"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBtr(]v|", "", "\nh]6g\u0005", "u(E", "\u0011n];X*MW#\bhm(\f\u0019=", "\u0011n]3\\.\u001ae\u0015\u0003\nb5~", "%`XA\\5@", "\u001ed]1\\5@2\u0015\u000ev", "\u0017mP0g0OS", "\u001deU9\\5>", "\u001deU", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBtr(]ve%VW-`TNO\u0010\u0016i\u0012W-b", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBtr(]ve+UJ*kV\u0004=i", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBtr(]ve1MO\u0002", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBtr(]ve1MO3`[r\u0013", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBtr(]ve2LW+`[t\u001c\u0010!Vc", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBtr(]ve9HR;`[t\u0013", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public abstract class CommunicationState {

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4G\u0007\":\u001b\u007fјnjGӄL͜P.`Y2şs{B0cҕw٘Akڼ.\"7N\u000fvwtPZ\u0019C'\u0006Dy̶0K[zk\u0015W9PuW3{p\u0004˧a=G\u0013'J\"fц5\u0007 *V\u0010\u000fzqLRܼ/\t\u0002HZ%M3#B\fL*\u0019 rf|A\u000fȤ^\u000361\u000f\u0002B|4&ݵ{\u0016\u0014Tb?\r%pdҿ?\bD#%k\u00035SÜC\tGмU\u0007n+50ʇwg"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBtr(]ve%VW-`TNO\u0010\u0016i\u0012W-b", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBtr(]v|", "1n];X*MW#\bhm(\f\u0019=", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBtr(]ve%VW5\\P\u0002A\u001e\u001bH\u001dJ:\u001d\u0013/", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0015!Ow\u001eEz#1h\u0002*@7s8UKKt8\u001c\u0011weC\u0010Q;J\u0006'\u0006*X5eRpL\u0018\u001cc{]'\u001c\u0015g\u0017g_", "5dc\u0010b5GS\u0017\u000e~h5j\u0018+t\u00106", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`\u0015Qw\u0016L\u007f)3U\r$Av_\fWKC{=\"\u0013dp=\u0011l\u001a]r6G\u000b,6e[r;#\u0016d\u0017<:\t\u0014iOy", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class ConfigAwaiting extends CommunicationState {
        private final ConnectionStatus connectionStatus;

        public ConfigAwaiting() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfigAwaiting(ConnectionStatus connectionStatus) {
            super(null);
            Intrinsics.checkNotNullParameter(connectionStatus, "connectionStatus");
            this.connectionStatus = connectionStatus;
        }

        public /* synthetic */ ConfigAwaiting(ConnectionStatus connectionStatus, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 + 1) - (i2 | 1) != 0 ? ConnectionStatus.READY : connectionStatus);
        }

        public static /* synthetic */ ConfigAwaiting copy$default(ConfigAwaiting configAwaiting, ConnectionStatus connectionStatus, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                connectionStatus = configAwaiting.connectionStatus;
            }
            return configAwaiting.copy(connectionStatus);
        }

        public final ConnectionStatus component1() {
            return this.connectionStatus;
        }

        public final ConfigAwaiting copy(ConnectionStatus connectionStatus) {
            Intrinsics.checkNotNullParameter(connectionStatus, "connectionStatus");
            return new ConfigAwaiting(connectionStatus);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfigAwaiting) && this.connectionStatus == ((ConfigAwaiting) obj).connectionStatus;
        }

        public final ConnectionStatus getConnectionStatus() {
            return this.connectionStatus;
        }

        public int hashCode() {
            return this.connectionStatus.hashCode();
        }

        public String toString() {
            return "ConfigAwaiting(connectionStatus=" + this.connectionStatus + ')';
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\bGָّ\u000bDȐ/(<\u0014\b\u0007\u0015ʑg/\u0005lN.ʂW,\u0015k\n5\r[*s,;[\u001df\"\u000fSɇkl"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBtr(]ve%VW5\\P\u0002A\u001e\u001bH\u001dJ:\u001d\u0013/", "", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", " D0\u0011L", " DC\u001fL\u0010'5", "\u001e@D 8&\u001a4\b^gX\u001bfr)M[\u0011o:mv\u00037O{+d", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class ConnectionStatus {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ConnectionStatus[] $VALUES;
        public static final ConnectionStatus READY = new ConnectionStatus("READY", 0);
        public static final ConnectionStatus RETRYING = new ConnectionStatus("RETRYING", 1);
        public static final ConnectionStatus PAUSE_AFTER_TOO_MANY_REQUESTS = new ConnectionStatus("PAUSE_AFTER_TOO_MANY_REQUESTS", 2);

        private static final /* synthetic */ ConnectionStatus[] $values() {
            return new ConnectionStatus[]{READY, RETRYING, PAUSE_AFTER_TOO_MANY_REQUESTS};
        }

        static {
            ConnectionStatus[] connectionStatusArr$values = $values();
            $VALUES = connectionStatusArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(connectionStatusArr$values);
        }

        private ConnectionStatus(String str, int i2) {
        }

        public static EnumEntries<ConnectionStatus> getEntries() {
            return $ENTRIES;
        }

        public static ConnectionStatus valueOf(String str) {
            return (ConnectionStatus) Enum.valueOf(ConnectionStatus.class, str);
        }

        public static ConnectionStatus[] values() {
            return (ConnectionStatus[]) $VALUES.clone();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u0016DLcz\u0005I\u0006>\u00146Ȑ\u0007\":ߚ\u007fјnjG6L͜P.`_2şqۛ<:ӋTqq:\u0016!\u0004\"\u07beSPmg|K#\u001cQ\u0011\u001e\u0016'm\\Oc|u\u0014%1pt\u0006ޣN8DGf\r63'xƉ7B\f\u000f\"BH>\u007fAƦJñ\u0016:"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBtr(]ve+UJ*kV\u0004=i", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBtr(]v|", "\nh]6g\u0005", "u(E", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Inactive extends CommunicationState {
        public static final Inactive INSTANCE = new Inactive();

        private Inactive() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Inactive)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 466411519;
        }

        public String toString() {
            return "Inactive";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u0016DLcz\u0005I\u0006>\u00146Ȑ\u0007\":ߚ\u007fјnjG6L͜P.`_2şqۛ<:ӋTqq:\u0016!\u0004\"\u07beSPmg|K#\u001cQ\u0011\u001e\u0016'm\\Oc|u\u0014%1pt\u0006ޣN8DGf\r63'xƉ7B\f\u000f\"BH>\u007fAƦJñ\u0016:"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBtr(]ve1MO\u0002", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBtr(]v|", "\nh]6g\u0005", "u(E", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Off extends CommunicationState {
        public static final Off INSTANCE = new Off();

        private Off() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Off)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1273380187;
        }

        public String toString() {
            return "Off";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u0016DLcz\u0005I\u0006>\u00146Ȑ\u0007\":ߚ\u007fјnjG6L͜P.`_2şqۛ<:ӋTqq:\u0016!\u0004\"\u07beSPmg|K#\u001cQ\u0011\u001e\u0016'm\\Oc|u\u0014%1pt\u0006ޣN8DGf\r63'xƉ7B\f\u000f\"BH>\u007fAƦJñ\u0016:"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBtr(]ve1MO3`[r\u0013", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBtr(]v|", "\nh]6g\u0005", "u(E", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Offline extends CommunicationState {
        public static final Offline INSTANCE = new Offline();

        private Offline() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Offline)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1236584399;
        }

        public String toString() {
            return "Offline";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u0016DLcz\u0005I\u0006>\u00146Ȑ\u0007\":ߚ\u007fјnjG6L͜P.`_2şqۛ<:ӋTqq:\u0016!\u0004\"\u07beSPmg|K#\u001cQ\u0011\u001e\u0016'm\\Oc|u\u0014%1pt\u0006ޣN8DGf\r63'xƉ7B\f\u000f\"BH>\u007fAƦJñ\u0016:"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBtr(]ve2LW+`[t\u001c\u0010!Vc", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBtr(]v|", "\nh]6g\u0005", "u(E", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class PendingData extends CommunicationState {
        public static final PendingData INSTANCE = new PendingData();

        private PendingData() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PendingData)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1397763533;
        }

        public String toString() {
            return "PendingData";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4G\u0007\":\u001b\u007fјnjGӄL͜P.`Y2şs{B0cҕw٘Akڼ.\"7N\u000fvwtPZ\u0019C'\u0006Dy̶0K[zk\u0015W9PuW3{p\u0004˧a=G\u0013'J\"fц5\u0007 *V\u0010\u000fzqLRܼ/\t\u0002HZ%M3#B\fL*\u0019 rf|A\u000fȤ^\u000361\u000f\u0002B|4&ݵ{\u0016\u0014Tb?\r%pdҿ?\bD#%k\u00035SÜC\tGмU\u0007n+50ʇwg"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBtr(]ve9HR;`[t\u0013", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBtr(]v|", "1n];X*MW#\bhm(\f\u0019=", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBtr(]ve%VW5\\P\u0002A\u001e\u001bH\u001dJ:\u001d\u0013/", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0015!Ow\u001eEz#1h\u0002*@7s8UKKt8\u001c\u0011weC\u0010Q;J\u0006'\u0006*X5eRpL\u0018\u001cc{]'\u001c\u0015g\u0017g_", "5dc\u0010b5GS\u0017\u000e~h5j\u0018+t\u00106", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`\u0015Qw\u0016L\u007f)3U\r$Av_\fWKC{=\"\u0013dp=\u0011l\u001a]r6G\u000b,6e[r;#\u0016d\u0017<:\t\u0014iOy", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Waiting extends CommunicationState {
        private final ConnectionStatus connectionStatus;

        public Waiting() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Waiting(ConnectionStatus connectionStatus) {
            super(null);
            Intrinsics.checkNotNullParameter(connectionStatus, "connectionStatus");
            this.connectionStatus = connectionStatus;
        }

        public /* synthetic */ Waiting(ConnectionStatus connectionStatus, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? ConnectionStatus.READY : connectionStatus);
        }

        public static /* synthetic */ Waiting copy$default(Waiting waiting, ConnectionStatus connectionStatus, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                connectionStatus = waiting.connectionStatus;
            }
            return waiting.copy(connectionStatus);
        }

        public final ConnectionStatus component1() {
            return this.connectionStatus;
        }

        public final Waiting copy(ConnectionStatus connectionStatus) {
            Intrinsics.checkNotNullParameter(connectionStatus, "connectionStatus");
            return new Waiting(connectionStatus);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Waiting) && this.connectionStatus == ((Waiting) obj).connectionStatus;
        }

        public final ConnectionStatus getConnectionStatus() {
            return this.connectionStatus;
        }

        public int hashCode() {
            return this.connectionStatus.hashCode();
        }

        public String toString() {
            return "Waiting(connectionStatus=" + this.connectionStatus + ')';
        }
    }

    private CommunicationState() {
    }

    public /* synthetic */ CommunicationState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
