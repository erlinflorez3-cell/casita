package androidx.datastore;

import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Xg;
import yg.ZO;

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
/* JADX INFO: compiled from: DataStoreDelegate.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&˛\bDZc|\u0004W\u00068\u000bDB\u0007Ӭ4\u0012\u0006\u0013nʑA0ZeP\u008cZS@\u000fsڔ<$q$yCIs\"}8\tWȞog\u0005Jb\u000bI\u0010\u000e\u0016\u0007̓4I[ye\u0012%2JģE\u074ccڎe;fҚD\u0004PD2:\n\u0005/\u001b:P |\u000bE[\fX/nrhRM!\u000b܅\"\nL#\u0019\u001e\u000bk^@Vqu@?%\u0013ix÷Ue@\t[\u0014^\\7\u000f\u0007aTѨV6c\u001d5o\u0011\u0010jsO\u0005Oqk\u0006x577Y{g<h\u0002$\u0015a˽;i!1\u000b\u000fad\u001a4CO\u0012Yח\u0012(\u0006\nD.J\u0017&\f7J>-PǑ6\u0010cx\u0001gXP0_r\b\tvN\u001b5\u007f9,g1-϶a\f1\\G\u0014\r\u001d 3\u0001%ďqS<bK\u001b\u0013w(ļ]͘AHVˣ*Q{\u000b\tj\u0012,\u00140}ĉEz?6m©9٦=#)ǽRTRj\u000f\u0005\u000fl*֢T͕D\"vݫ\b6\u0017\u001drD\u0013\u0017B¯Vг0\u0011Uȼ%+\f\u0011+8lyL!S\u0011^]xuzUm\u001051v7\u0010ʤ\u001a\u001a\u0006D\r=\fȤeߧeR~ܝ\u0010Hp\u0012pfpabȚ^͈&2PК`\n\nIf\u0012#4OqRعZ7o¥\u0017Ƞ\u0007\u001eJˆҺ\rv"}, d2 = {"\u001a`]1e6BR,HyZ;x\u0017>o\r(E\u001f|&\u00135~\u0018Iv\u00139b\u007f'7| 7,CBk6\u001a$h7", "\"", "\u001aj^A_0G\u001d$\f\u0005i,\n\u00183e\u000eqh@|\u0016\u0001Pv\"'\u0004/@Y\u000b/KC", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011N\nKr\u0013Dc\u000b \r", "4h[2A(FS", "", "Ada6T3Bh\u0019\f", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011]\u000eIz!<]\u0013 DC", "1na?h7MW#\b]Z5{\u0010/r", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011r\nEu,5f\fi$m!5IA;L8%\u0015FkF\u0014s7]z1P/J5[YrJi", ">q^1h*>;\u001d\u0001\bZ;\u0001\u00138s", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011N\nKr\r9[\u000b\u001cFq 7#", "Ab^=X", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b<\n\u0016$Qs\rO@$1hy.Fw#.\u0017AEx4g\u0003hn=\u0003j0cv4\u001d3J5[_|A\u0013%$\rJ:\t\u0013hK1n\u000e5)\u0015,\u0013\u00057q\u007f\u0013\u0016\u001bC4]Ba\u0017Cw\u0015VE0h$cl\u0007WLTf4mn[&[A:1iX\u001f%wW2\u0013EX\"z\u001czwpE(~B-L7<VNmd@~0j!b}\u001cA_x4\bv\u0002>7@t\u0014Op\u0018L(V\u001f9fQ6*?<\u0001=UnuB\u0002~", "\u0017MB!4\u0015\u001c3", ":nR8", "", "5dc#T3NS", "BgX@E,?", ">q^=X9Mg", "\u001aj^A_0G\u001d&~{e,z\u0018xKj5\u0006K\u0001$&[E", "2`c.f;H`\u0019x\b^3|\u0005=e"}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class DataStoreSingletonDelegate<T> implements ReadOnlyProperty<Context, DataStore<T>> {
    private volatile DataStore<T> INSTANCE;
    private final ReplaceFileCorruptionHandler<T> corruptionHandler;
    private final String fileName;
    private final Object lock;
    private final Function1<Context, List<DataMigration<T>>> produceMigrations;
    private final CoroutineScope scope;
    private final Serializer<T> serializer;

    /* JADX WARN: Multi-variable type inference failed */
    public DataStoreSingletonDelegate(String fileName, Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, Function1<? super Context, ? extends List<? extends DataMigration<T>>> produceMigrations, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.fileName = fileName;
        this.serializer = serializer;
        this.corruptionHandler = replaceFileCorruptionHandler;
        this.produceMigrations = produceMigrations;
        this.scope = scope;
        this.lock = new Object();
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ Object getValue(Context context, KProperty kProperty) {
        return getValue2(context, (KProperty<?>) kProperty);
    }

    /* JADX INFO: renamed from: getValue, reason: avoid collision after fix types in other method */
    public DataStore<T> getValue2(Context context, KProperty<?> kProperty) {
        Intrinsics.checkNotNullParameter(context, C1561oA.yd("I<<E#55", (short) (FB.Xd() ^ 31124)));
        Intrinsics.checkNotNullParameter(kProperty, C1561oA.Yd("ehfh^lou", (short) (FB.Xd() ^ 11514)));
        DataStore<T> dataStore = this.INSTANCE;
        if (dataStore == null) {
            synchronized (this.lock) {
                if (this.INSTANCE == null) {
                    Object[] objArr = new Object[0];
                    Method method = Class.forName(Xg.qd("\u000f\u001d\u0014#!\u001c\u0018b\u0019&&-\u001f)0j\u0001..5';8", (short) (C1499aX.Xd() ^ (-23332)), (short) (C1499aX.Xd() ^ (-9957)))).getMethod(Jg.Wd("0 4q&'86%D\\bmm7dx_UYZ", (short) (OY.Xd() ^ 13241), (short) (OY.Xd() ^ 30358)), new Class[0]);
                    try {
                        method.setAccessible(true);
                        final Context context2 = (Context) method.invoke(context, objArr);
                        Serializer<T> serializer = this.serializer;
                        ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler = this.corruptionHandler;
                        Function1<Context, List<DataMigration<T>>> function1 = this.produceMigrations;
                        Intrinsics.checkNotNullExpressionValue(context2, ZO.xd("^@\rx!\\{$9qmk2$#2\u001c|", (short) (C1633zX.Xd() ^ (-19997)), (short) (C1633zX.Xd() ^ (-25784))));
                        this.INSTANCE = DataStoreFactory.INSTANCE.create(serializer, replaceFileCorruptionHandler, function1.invoke(context2), this.scope, new Function0<File>() { // from class: androidx.datastore.DataStoreSingletonDelegate$getValue$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final File invoke() {
                                Context applicationContext = context2;
                                Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                                return DataStoreFile.dataStoreFile(applicationContext, ((DataStoreSingletonDelegate) this).fileName);
                            }
                        });
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                dataStore = this.INSTANCE;
                Intrinsics.checkNotNull(dataStore);
            }
        }
        return dataStore;
    }
}
