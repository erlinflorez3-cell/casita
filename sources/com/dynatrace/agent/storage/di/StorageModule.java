package com.dynatrace.agent.storage.di;

import android.content.Context;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import androidx.room.Room;
import com.dynatrace.agent.storage.db.EventDatabaseDataSource;
import com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl;
import com.dynatrace.agent.storage.db.OneAgentDatabase;
import com.dynatrace.agent.storage.memory.DynamicConfigDataSource;
import com.dynatrace.agent.storage.memory.DynamicConfigDataSourceImpl;
import com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource;
import com.dynatrace.agent.storage.preference.EndPointInfoDataSource;
import com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl;
import com.dynatrace.agent.storage.preference.MetricsDiskDataSource;
import com.dynatrace.agent.storage.preference.ServerConfigurationDataSource;
import com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl;
import com.dynatrace.android.agent.util.Utility;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
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
@Metadata(bv = {}, d1 = {"Яb\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\bnjO0Le^.ZS0\u0012s{J$cҕyCQU\"}(\tWN}gvJ`\u000bK\u000f\u001c\u0016\u0001j2I]xs\u0012\u00172HoG3coE9ft>\u000562*8\u007f\u0005\t\u001a8H\u0018͌\u0001ŏaÈB0nozg\u001dQ\u0013\u001a*\u0006l!\u0011\"jif6voҺ>1)\u0007wG\u00172m?\u0015M;V\u001b܋˼za$<\tBC'=S1\u001a\u0019¹ύ\u0007?wQMs5<CI\"m|ݙÿ\u0018\u00151fUh\u0001>t\u0005\u007fyRʬ˦ScQjV3\u0006\u0016\u0014\rj TͺόL.37/\u0013\u001cQ\rr\u0002_\u0017\u061cެF\u007f\u0001\u0002~\u001b3!K+g=7]o;1Ne|[ٿ ţ\u0005n)ż%1n\u001b3Z\bSAQnEvU2Ykn:19̦Ô\u0004ΥK\n7}\u00179%1O]?,/uRTRt\u000f\u0005\u000fv*֢T͕D\"vݫ֜.,"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$9#k/Az\u00120M+EjD%\u0015>", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "3wc2e5:Z\u0007|\u0005i,", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "\nh]6g\u0005", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtB\u00014<]\u00073\u0001k ;WSJo=\u001e#2?C\u0014m<]z0G:L6gRH\u0001\u0005", "2`c.F;H`\u0019", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011N\nKr\u0013Dc\u000b \r", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaG\\", "5dc\u0011T;:A(\t\b^", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ#r.4f\b$6\u0001_-IR7yC(\"h+7\u0011p,\u0018U#VH<;f_r\u0013", "2`c.F;H`\u0019=y^3|\u000b+t\u007f", "\u001aj^A_0G\u001d$\f\u0005i,\n\u00183e\u000eqh@|\u0016\u0001Pv\"'\u0004/@Y\u000b/KC", "2a", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#g)7I\u0018.VR\u001agC\u001a\u0012do9\\", ">q^C\\+>3*~\u0004m\u000bx\u0018+b{6{\u001f|&\u00135y\u001eIt%", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#]17v%\rIR7h0,\u0015G]H\u0003Q6^\u0004%G\"", ">q^C\\+>3*~\u0004m\u000bx\u0018+b{6{\u001f|&\u00135y\u001eIt%sW\b(1l*7IRHg2\u001e\u000fdc9\u0010r&[v.GH\\,", ">q^C\\+>A\u0019\f\f^9Z\u00138f\u0004*\fM|&\u001bQxl8\u0006!#c\u000e-5m", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r)kA/\u0015u?C\u0010d0P\u00074C[R6e1nL\u0010\u007fd\u001e[)\rZ", ">q^C\\+>A\u0019\f\f^9Z\u00138f\u0004*\fM|&\u001bQxl8\u0006!#c\u000e-5mT,WK5jH'\u0011wn5\u0005c&Jx'P[H9\\Yr9\"\u0012", ">q^C\\+>A(z\bm<\bf9n\u0001,}P\u000e\u0013&Ky\u0017\u001br41G\b0Dk\u0016", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r\u001bt3\t\u001fljHjl-XU#VH<6l_p=i", ">q^C\\+>A(z\bm<\bf9n\u0001,}P\u000e\u0013&Ky\u0017\u001br41G\b0Dk\u0016lKMCe32\u001edpF\u0003a,Hr)GU]&iRy=\u0010 Z", ">q^C\\+>2-\bvf0zf9n\u0001,}P\u000e\u0013&Ky\u0017\u001br41G\b0Dk\u0016", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@-5a\b-K7tBV?Co2{\u001fqb=\tB(]r\u0015Q\\[*\\(", ">q^C\\+>2-\bvf0zf9n\u0001,}P\u000e\u0013&Ky\u0017\u001br41G\b0Dk\u0016lKMCe32\u001edpF\u0003a,Hr)GU]&iRy=\u0010 Z", ">q^C\\+>3,\u0003\nK,x\u00179n^$\u000b<n!'Tm\u000e", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r\u001agC\u001a\u0003wkF\u0007C?R\u0006\u0014GH\\6eAvE\u0014 i\nV6k\u0001h=\u0012xTD\u001d\b\u0002", ">q^C\\+>3,\u0003\nK,x\u00179n^$\u000b<n!'Tm\u000ezt/=S|4@i%;IA;e0 \u0015qp3\u0014c3Nr5G", ">q^C\\+>;\u0019\u000e\bb*\u000bg+t{\u0016\u0006P\u000e\u0015\u0017", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r#kC+\u0019fo\u0018\u000bq2-r6C:X<iPr\u0013", ">q^C\\+>;\u0019\u000e\bb*\u000bg+t{\u0016\u0006P\u000e\u0015\u0017\u0006m\u0018Dp$Iby/Di\u0014.G?=k=-\u000fua@\u0007_:N", "BdP?76P\\", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class StorageModule {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property2(new PropertyReference2Impl(StorageModule.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};
    private final Context context;
    private final ReadOnlyProperty dataStore$delegate;
    private final OneAgentDatabase db;

    public StorageModule(Context context, CoroutineScope externalScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(externalScope, "externalScope");
        this.context = context;
        this.dataStore$delegate = PreferenceDataStoreDelegateKt.preferencesDataStore$default("dynatrace-preferences", new ReplaceFileCorruptionHandler(new Function1() { // from class: com.dynatrace.agent.storage.di.StorageModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StorageModule.dataStore_delegate$lambda$0((CorruptionException) obj);
            }
        }), null, externalScope, 4, null);
        this.db = (OneAgentDatabase) Room.databaseBuilder(context, OneAgentDatabase.class, "dynatrace-database").build();
    }

    public static final Preferences dataStore_delegate$lambda$0(CorruptionException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return PreferencesFactory.createEmpty();
    }

    private final DataStore<Preferences> getDataStore(Context context) {
        return (DataStore) this.dataStore$delegate.getValue(context, $$delegatedProperties[0]);
    }

    public final DynamicConfigDataSource provideDynamicConfigurationDataSource$com_dynatrace_agent_release() {
        return new DynamicConfigDataSourceImpl();
    }

    public final EventDatabaseDataSource provideEventDatabaseDataSource$com_dynatrace_agent_release() {
        return new EventDatabaseDataSourceImpl(this.db.eventDao());
    }

    public final DataStoreExitReasonTimestampDataSource provideExitReasonDataSource$com_dynatrace_agent_release() {
        return new DataStoreExitReasonTimestampDataSource(getDataStore(this.context));
    }

    public final MetricsDiskDataSource provideMetricsDataSource$com_dynatrace_agent_release() {
        return new MetricsDiskDataSource(getDataStore(this.context));
    }

    public final ServerConfigurationDataSource provideServerConfigurationDataSource$com_dynatrace_agent_release() {
        return new ServerConfigurationDataSourceImpl(getDataStore(this.context));
    }

    public final EndPointInfoDataSource provideStartupConfigurationDataSource$com_dynatrace_agent_release() {
        return new EndPointInfoDataSourceImpl(getDataStore(this.context));
    }

    public final void tearDown() {
        Utility.devLog(StorageModuleKt.TAG_STORAGE, "close DB connection");
        this.db.close();
    }
}
