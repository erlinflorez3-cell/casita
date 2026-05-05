package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import androidx.datastore.preferences.core.Preferences;
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
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.QB;
import yg.Xu;
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
/* JADX INFO: compiled from: PreferenceDataStoreDelegate.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007tvAӄLe^.Zݷ2\u000f\u0002{<$iByCQU\"Ԃ*\teNogtKb\u000bQƤ\u000e\u0016~k4Ikxe܈\u0015˰XģoE]qM9\u000ftF\r082:\n\u0005/\u001cXI>u;\tQÈ\"4NsRR;Q\u0015& \u000bV(\u0011 lg|8^k\f@??\u0011pZf7a@|{\rVb7\u0019\u0007i.1P9E\u0015SU1\u0011\u0001dm\u000bOuK\u0010\u0001'U7ʁwWDeH5#<g\u0013mt6\\3S\u000f\rW/]ucP<((\u0003\n T\b\u001e\u0006-I\\A`Ǩ\b^K\u0003\u0001kH`\u0004nB.|w5E&63i9qƜ]ň?\u0019VљL\u0019\u001b#;\t~#kT<b+\u001a\u0003}(ĻS͘AHVˣ*I{\u0013\tb0:Z΅IĬ3{\u0019фg1E^Q#OoX҉Fϼz\u0005hå$\u000e`OX:~\u0018G*7\fjRt\u0011{Xd^<\u0013]\u001c\u0003\t,\u0012A)\u000b\u007f\u0013Ɯ'ŎROpȉ;Yk\u0015=/\u0015C0ʧmް[9fڨ̹Ux"}, d2 = {"\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#h-7n\u0016;ML9k\u0013\u001a$dOH\u0011p,<z0ISN;f[Q=\u001b\u0012\\\n]+b", "\u001aj^A_0G\u001d$\f\u0005i,\n\u00183e\u000eqh@|\u0016\u0001Pv\"'\u0004/@Y\u000b/KC", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011N\nKr\u0013Dc\u000b \r", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaG\\", "<`\\2", "", "1na?h7MW#\b]Z5{\u0010/r", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011r\nEu,5f\fi$m!5IA;L8%\u0015FkF\u0014s7]z1P/J5[YrJi", ">q^1h*>;\u001d\u0001\bZ;\u0001\u00138s", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011N\nKr\r9[\u000b\u001cFq 7#", "Ab^=X", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b<\n\u0016$Qs\rO@$1hy.Fw#.\u0017AEx4g\u0018dj8\u000ec9\\@\u0014GWU(ZRSA\u001b\u00128\u0018[8\u001d\u0010hE.w'3(\u00073I\u000f\u0011O\u0007\u0016%\u00159s:Gg\u0018\u0011z%~?8lPbmC(QN`9h\u0016hh2!@.#x\u001d${\u001a,\u0014\t]!\u0002V\u0003gu\u0011v\u0005E.N|_OE]SF\u007f't\u000fl", "\u0017MB!4\u0015\u001c3", ":nR8", "", "5dc#T3NS", "BgX@E,?", ">q^=X9Mg", "\u001aj^A_0G\u001d&~{e,z\u0018xKj5\u0006K\u0001$&[E", "2`c.f;H`\u0019F\u0006k,}\t<e\t&{Nz$\u0017No\nJv"}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class PreferenceDataStoreSingletonDelegate implements ReadOnlyProperty<Context, DataStore<Preferences>> {
    private volatile DataStore<Preferences> INSTANCE;
    private final ReplaceFileCorruptionHandler<Preferences> corruptionHandler;
    private final Object lock;
    private final String name;
    private final Function1<Context, List<DataMigration<Preferences>>> produceMigrations;
    private final CoroutineScope scope;

    /* JADX WARN: Multi-variable type inference failed */
    public PreferenceDataStoreSingletonDelegate(String name, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, Function1<? super Context, ? extends List<? extends DataMigration<Preferences>>> produceMigrations, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.name = name;
        this.corruptionHandler = replaceFileCorruptionHandler;
        this.produceMigrations = produceMigrations;
        this.scope = scope;
        this.lock = new Object();
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ DataStore<Preferences> getValue(Context context, KProperty kProperty) {
        return getValue2(context, (KProperty<?>) kProperty);
    }

    /* JADX INFO: renamed from: getValue, reason: avoid collision after fix types in other method */
    public DataStore<Preferences> getValue2(Context context, KProperty<?> kProperty) {
        short sXd = (short) (OY.Xd() ^ 10909);
        short sXd2 = (short) (OY.Xd() ^ 1179);
        int[] iArr = new int["#\u0018\u001a%\u0005\u0019\u001b".length()];
        QB qb = new QB("#\u0018\u001a%\u0005\u0019\u001b");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        Intrinsics.checkNotNullParameter(context, new String(iArr, 0, i2));
        short sXd3 = (short) (C1499aX.Xd() ^ (-21936));
        short sXd4 = (short) (C1499aX.Xd() ^ (-15581));
        int[] iArr2 = new int["\u0013:\u001e\n&%\fy".length()];
        QB qb2 = new QB("\u0013:\u001e\n&%\fy");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd4) ^ sXd3));
            i3++;
        }
        Intrinsics.checkNotNullParameter(kProperty, new String(iArr2, 0, i3));
        DataStore<Preferences> dataStore = this.INSTANCE;
        if (dataStore == null) {
            synchronized (this.lock) {
                if (this.INSTANCE == null) {
                    Object[] objArr = new Object[0];
                    Method method = Class.forName(ZO.xd("\u000b\"^M6;-Q\u001f2\tH'\u0012]Q_\u001c0\u001a\u0001s\u0017", (short) (C1580rY.Xd() ^ (-11692)), (short) (C1580rY.Xd() ^ (-16787)))).getMethod(C1626yg.Ud("T\u0007\u000bT:-d\u0014uv\u0012\u007fr\u0019c\u000e\f%\rGs", (short) (OY.Xd() ^ 31798), (short) (OY.Xd() ^ 2025)), new Class[0]);
                    try {
                        method.setAccessible(true);
                        final Context context2 = (Context) method.invoke(context, objArr);
                        PreferenceDataStoreFactory preferenceDataStoreFactory = PreferenceDataStoreFactory.INSTANCE;
                        ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler = this.corruptionHandler;
                        Function1<Context, List<DataMigration<Preferences>>> function1 = this.produceMigrations;
                        short sXd5 = (short) (C1607wl.Xd() ^ 11315);
                        int[] iArr3 = new int["K,yUBo\nD\u000b`a\u0018\u0016\u001b\u0011kF4".length()];
                        QB qb3 = new QB("K,yUBo\nD\u000b`a\u0018\u0016\u001b\u0011kF4");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd5 + i4)));
                            i4++;
                        }
                        Intrinsics.checkNotNullExpressionValue(context2, new String(iArr3, 0, i4));
                        this.INSTANCE = preferenceDataStoreFactory.create(replaceFileCorruptionHandler, function1.invoke(context2), this.scope, new Function0<File>() { // from class: androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate$getValue$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final File invoke() {
                                Context applicationContext = context2;
                                Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                                return PreferenceDataStoreFile.preferencesDataStoreFile(applicationContext, this.name);
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
