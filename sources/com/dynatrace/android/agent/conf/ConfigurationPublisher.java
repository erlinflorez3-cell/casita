package com.dynatrace.android.agent.conf;

import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
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
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u000eӵLш|\u0004O\f8é6B\rC4\u0012\u000e\u0007nj?1LeVQZS8\u001bs{:$c$\u007fCCU \u007f*\t]pog\u0005Jb\u000bI\u0011\fǝ\u000f̓\\I\u0004w\u0016\u0011$rcuDCSu=G`\r63!B.>y\u0013\u000320X\u0012\u0007zqO:\u0015ضDr@W\u001bSM& \u0011V /*\rk\\C`l\f>w/\u0011wZNUk`\u0001[\u001a^TU\u0011?y,:X7c!Uc\u0011\u0017jgO\u0005Oqk\u0017x)7+wr\u0006G!\u0012\"(C[\u001d_\u0003&\u000b\u000eab\u001c'YN\u0012\\\u0017\u0013p\u0012\t\u0010%<2\u001a67V>E&v\n\u001e3#{cB`\u0002\rA.\f(6g1\u000e3C9Ig(Ĩ=ϭR7\u0004˜]01\u0003\u0007'kV\u001e`C\u001f\u0003z(ĻS͘AHVˣ*U{\u000b\tn\u0012,\u00140u\t?}!.E$ec\u0010\u05fd-Ƞ\u0006HLϙG\u0011nrki\u0001G\u0017̑pގ;*\u0011ȱʗHz"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@#?b~i\u0015w\u001f/QEKx0-\u0019rj$\u0017`3R\u0005*GY$", "", ";`g h)LQ&\u0003w^9\u000b", "", "AtQ@V9BP\u0019\f\t", "", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@#?b~i\u0015w\u001f/QEKx0-\u0019rj'\u0017`:L\u0004+DL[\u0002", "\nh]6g\u0005", "uH;7T=:\u001d)\u000e~euj\t>;C\u0019", "1n]3\\.N`\u0015\u000e~h5\u000bp+p", "", "", ":nR8", "@dV6f;>`", "", "AtQ@V9BP\u0019\f", "Cma2Z0Lb\u0019\f", "<nc6Y@", "1n]3\\.\u001cV\u0015\b|^:", "", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@#?b~i\u0015w\u001f/QEKx0-\u0019rj$\u0017`3R\u0005*GY\r\nf[sA\u0016o]\nW-\rZ", "5dc\u0010b5?W\u001b\\}Z5~\t=", "CoS.g,\u001c]\"\u007f~`\n\u007f\u00058g\u007f6", "\u0011n]3\\.\u001cV\u0015\b|^", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ConfigurationPublisher {
    private Map<String, Object> configurationsMap;
    private final Object lock;
    private final int maxSubscribers;
    private final Set<ConfigurationSubscriber> subscribers;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eRLш|\u0004O\u00128\u000b4G\u0005ӳܧ\u0012\u000eј\u0017pI2Tev\u008c\u0001Rj\u001eq{D(i$\nCiV۟\u0002$\u000fQ\\j8}XZ#C=\u0007Ȁ|p4կmzc\u0016\u001d7+oE96oC@Ƅx>"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@#?b~i\u0015w\u001f/QEKx0-\u0019rj$\u0017`3R\u0005*GY\r\nf[sA\u0016o]\nW-\rZ", "", "7c", "", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004\u00114", "5dc\u0016W", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "\u0017RN\u007fE\u000b 3\u0002xZG\bYo\u000fD", "\u0017RN!B\u001c\u001c6xlt>\u0015Xe\u0016E^", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class ConfigChange {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ConfigChange[] $VALUES;
        public static final ConfigChange IS_3RDGEN_ENABLED = new ConfigChange("IS_3RDGEN_ENABLED", 0, "3rd_gen_enabled");
        public static final ConfigChange IS_TOUCHES_ENABLED = new ConfigChange("IS_TOUCHES_ENABLED", 1, "touch_interaction_enabled");
        private final String id;

        private static final /* synthetic */ ConfigChange[] $values() {
            return new ConfigChange[]{IS_3RDGEN_ENABLED, IS_TOUCHES_ENABLED};
        }

        static {
            ConfigChange[] configChangeArr$values = $values();
            $VALUES = configChangeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(configChangeArr$values);
        }

        private ConfigChange(String str, int i2, String str2) {
            this.id = str2;
        }

        public static EnumEntries<ConfigChange> getEntries() {
            return $ENTRIES;
        }

        public static ConfigChange valueOf(String str) {
            return (ConfigChange) Enum.valueOf(ConfigChange.class, str);
        }

        public static ConfigChange[] values() {
            return (ConfigChange[]) $VALUES.clone();
        }

        public final String getId() {
            return this.id;
        }
    }

    public ConfigurationPublisher() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public ConfigurationPublisher(int i2) {
        this(i2, null, 2, 0 == true ? 1 : 0);
    }

    public ConfigurationPublisher(int i2, Set<ConfigurationSubscriber> subscribers) {
        Intrinsics.checkNotNullParameter(subscribers, "subscribers");
        this.maxSubscribers = i2;
        this.subscribers = subscribers;
        this.configurationsMap = new LinkedHashMap();
        this.lock = new Object();
    }

    public /* synthetic */ ConfigurationPublisher(int i2, LinkedHashSet linkedHashSet, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i3) | ((-1) - 1)) != 0 ? 10 : i2, (i3 & 2) != 0 ? new LinkedHashSet() : linkedHashSet);
    }

    private final void updateConfigChanges(Map<String, ? extends Object> map) {
        if (map.isEmpty()) {
            this.configurationsMap.clear();
        } else {
            this.configurationsMap.putAll(map);
        }
    }

    public final Map<String, Object> getConfigChanges() {
        return MapsKt.toMap(this.configurationsMap);
    }

    public final void notify(Map<ConfigChange, ? extends Object> configChanges) {
        Intrinsics.checkNotNullParameter(configChanges, "configChanges");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(configChanges.size()));
        Iterator<T> it = configChanges.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(((ConfigChange) entry.getKey()).getId(), entry.getValue());
        }
        synchronized (this.lock) {
            updateConfigChanges(linkedHashMap);
            Iterator<ConfigurationSubscriber> it2 = this.subscribers.iterator();
            while (it2.hasNext()) {
                it2.next().notify(linkedHashMap);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void register(ConfigurationSubscriber subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        synchronized (this.lock) {
            if (this.subscribers.size() < this.maxSubscribers) {
                this.subscribers.add(subscriber);
                subscriber.notify(this.configurationsMap);
            } else {
                Utility.devLog(OneAgentLoggingKt.TAG_START_STOP_AGENT, "There are already " + this.maxSubscribers + " subscribers registered,cannot add another one: Dropping this subscriber.");
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void unregister(ConfigurationSubscriber subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        synchronized (this.lock) {
            this.subscribers.remove(subscriber);
        }
    }
}
