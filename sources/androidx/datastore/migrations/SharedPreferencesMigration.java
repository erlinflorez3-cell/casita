package androidx.datastore.migrations;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import androidx.datastore.core.DataMigration;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: SharedPreferencesMigration.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я`\u001d<K!&˛\bDZc|İI\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007t\u000bA0RqP\u008cZS@\u000fs{J$c$\u007fLCU(Ԃ*ޛWN}gvJp\u000bK\u000f\f\u0016\u0001jBI]xc\u0015\u00172P\u0011G3SuE9nt>\u0005&3*8\u0010\u0005\t\u001a0M&͌#EQÈ /pvJT\u001dMK\u0019@\u0006v\u001f+^SmcFRz^R53\u0005yB|*\u000e2\rY\u0013Fb+%|q ;@e;C*c%\rRiF\u001b[w<\u0015j7'aɞ\u0004_F^\u0010\u0016%+}\u0017\f{6`\u0015Sv\u000bU6}k[v\u001c4\u0010\u001d\u0002\fL\u0006\u001e\u0006UV>/*f>ԄC|\u0003YPR\u0012^xȕ)jF\u001b5\u0002I*g&\u0015^ƞ:ϊ\u05ee;{\u0013\u001c^\u001c\u0007\u00041_b\u001ex\u0015Ie\bU?cX=vT\u001aeCm\u0012tz\b:\u0006@G.5*\u0016>9+7i@;=q\u0001XFwv;\u009bx[yXXB2nDAX\u0012\u001c^Tf\u001bj~_\u00074!s*`\u001f \u000e\u00120^\b<O3 P_h Ҕ]e\u001a+?hGY%\u0088<`IbC7gb>l\u0001\u0004ޖ>ֺИ\tXtU\u0014ۙYb(2<Vk(}\fF^\fA5ms,>:51b%J\u0013\u001epG+\u000eo|n\u0010\r[K@\th4v\u0019\u0001\u0007ʔ\u0001ww~Y.\r`P7oZE\u001d6W8gb\bQ\u000f\u000f\u001a\u000eS\u007fnMK|\u0018\u0006U*.&\u001cIQeˋ#\u0017\u000f/B\u0004=E\u0003ǩ\u0014Z]\u00167|\u0013x=F\u0017;w\u000ex\u0001Db\u0001I}e'(\u0005r\u000b%\u001ec.\u007fՌEکĕgT\u0019p\u0007X\u0001\"q<|XCĕ]ɀ$˚Ȟ&|CN\f=+8\u0010\u0014]5\u0012aw\u007fFy\u0011 Vxs\u0018DcDu)Q&@I[aY-bR(z(ZH\u0019\u001cNBQJ\u001bY`A\u0013\u0015\u0007<[\u001bG}\u0015\u0018\\\u0011~js:AuD4vv8\u007f[}J٫s)\u001ftkg$ޮ\u0012ţIϠ\u000eϘν\u007f1|:dT.\u007fob7:6w&]Y;\u0019ŝ\u0003ʖbԂ+фޭ\u000fCb\u0012V\u001e\t\u0010^a%\u0016`SJĬXոXxdƇ\u0019\u0019n[x):\u0003\u000f\u000fa$\u000f4_\u001cD۱Vвg2\tҵm<)vg!l$;Fd9I6h\u0003\u001bE\u0014ŝY\nF\nW+}k&ȯf!\r!R\u001a18\u007f\u001c\u000e\u0004\u0007͟\rۖc̯Щz\u0014nR\\:y\r\t\u0011&> \u000e9\u001f&Ζqܑ1LVߗ\b\\(\u001a/DW\nB=:˭ɖ-ޅ97EKp05\u0019oUA\u0018\u0016;pT\u0012{9x]\rv\fm\u001bpσ\u0002\u001er\b\u0019\u0015` 28x}\u0003\u000e>\nLN0>0\u001b5̒mץ ̸Ӳ/n\u000eBY\u0007ǐ\netctl̬\u0007\u0012"}, d2 = {"\u001a`]1e6BR,HyZ;x\u0017>o\r(EH\u0005\u0019$C~\u0012F\u007f3~G\u0001\u001cDm\u0015\u0019ZC<kA\u001e\u001efaGng.[r6KVW\u0002", "\"", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011N\nKr\r9[\u000b\u001cFq 7#", ">q^1h*>A\u001cz\b^+g\u0016/f\u007f5{I~\u0017%", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BRb|\u0005g;|\u0012>/m+wM\u0001\u0016\u0002To\u000f<\u0004%>W}.\r", "9dh@G6&W\u001b\fvm,", "", "", "Ag^B_++c\"f~`9x\u00183o\t", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "", ";hV?T;>", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EH\u0005\u0019$C~\u0012F\u007f3~G\u0001\u001cDm\u0015\u0019ZC<kA\u001e\u001efaGwg,`L", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u0007<i'*\u0017SJo;g\u0003hp\u000fmi6]}+P\u0016S=d\u001csM\u001d\u0010i\u0012X4\u001bN:Q-lS;)\u0011x\u001fhAr\u0010\u0013\u001a\u0017~o\u0002J \u0011W\u0003\u0013\u0005E3qT#@\nP?Tf4mY5`M", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "AgP?X+)`\u0019\u007fzk,\u0006\u0007/sh$\u0004@", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6s{m]J\u0003-<]z.\u0011:N;29xG#\u0019^\u0017\u00180\u001e\r#B4wBF#\u00125WK\u001cx\n\n%\u0012?s=\u0018=\u0016Q\t\u001cyJrmWa)zWJCq.n\u0015mf=JC\"#u#$6&qz", "<`\\2", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u0007<i'*\u0017SJo;g\u0003hp\u000fmi6]}+P\u0016S=d\u001csM\u001d\u0010i\u0012X4\u001bN:Q-lS;)\u0011x\u001fhAr\u0010\u0013\u001a\u0017~o\u0002J \u0011W\u0003\u0013\u0005E3qT#@\nP?Tf4mY5\u0004XC91\u001eu\u0018dfZ7\u0019{\\ <0\u0004pvG,\n\u000e\u000bCilB\u000fvQEvp\rZ\t{\u001b4.8\u001c", "9dh X;", "", "\u001aj^A_0G\u001d\u001e\u0010\u0003(-\r\u0012-t\u00042\u0005NJw'Pm\u001d@\u0001.\u0003/", "AgP?X+)`\u0019\u007f\t", "5dc [(KS\u0018i\b^-\u000b", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fqiC|$\u0017FZ\u001b<w%BY\u0007\u001e7{k", "AgP?X+)`\u0019\u007f\t\u001d+|\u0010/g{7{", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "\u001aj^A_0G\u001d\u001e\u0010\u0003(-\r\u0012-t\u00042\u0005NJw'Pm\u001d@\u0001.\u0002/", "1kT.a\u001cI", "", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "2d[2g,,V\u0015\fz]\u0017\n\t0e\r(\u0005>\u0001%", "5dc [(KS\u0018i\b^-\u000be+c\u00068\u0007", "\u001aiPCTuB]b_~e,R", ">qT3f\rBZ\u0019", "5dc [(KS\u0018i\b^-\u000bi3l\u007f", "1ta?X5M2\u0015\u000ev", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxW:\u00012?i\r$@m$w+MDz8'%dp=\u0011l\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "Ag^B_+&W\u001b\fvm,", "\u000foX~'\u0010F^ ", "2`c.f;H`\u0019x\b^3|\u0005=e"}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class SharedPreferencesMigration<T> implements DataMigration<T> {
    private final Context context;
    private final Set<String> keySet;
    private final Function3<SharedPreferencesView, T, Continuation<? super T>, Object> migrate;
    private final String name;
    private final Lazy sharedPrefs$delegate;
    private final Function2<T, Continuation<? super Boolean>, Object> shouldRunMigration;

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SharedPreferencesMigration.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039pn\u0003p\u0004\u0006\u0002\u0006yC\u0004\u0001\u007f\f{\u0010\u0006\r\r\u0013Nt\u000b\u0005\u0017\u000b\u000bw\u001b\u000f\u0011\u0011\u001f\u0013\u001d\u0013\u0016%\u007f\u001d\u001c(\u0018,\"))", f = " 4,<.,\u00178**(4&.\"#0\t$!+\u0019+\u001f$\"`\u001d%", i = {0}, l = {147}, m = "B8@G?8\"?>J:N@", n = {"c^kY"}, s = {"xQ^"})
    static final class C08031 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SharedPreferencesMigration<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08031(SharedPreferencesMigration<T> sharedPreferencesMigration, Continuation<? super C08031> continuation) {
            super(continuation);
            this.this$0 = sharedPreferencesMigration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return this.this$0.shouldMigrate(null, this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(Context context, String sharedPreferencesName, Set<String> keysToMigrate, Function3<? super SharedPreferencesView, ? super T, ? super Continuation<? super T>, ? extends Object> migrate) {
        this(context, sharedPreferencesName, keysToMigrate, null, migrate, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(Context context, String sharedPreferencesName, Function3<? super SharedPreferencesView, ? super T, ? super Continuation<? super T>, ? extends Object> migrate) {
        this(context, sharedPreferencesName, null, null, migrate, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(Function0<? extends SharedPreferences> produceSharedPreferences, Set<String> keysToMigrate, Function3<? super SharedPreferencesView, ? super T, ? super Continuation<? super T>, ? extends Object> migrate) {
        this(produceSharedPreferences, keysToMigrate, (Function2) null, migrate, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(produceSharedPreferences, "produceSharedPreferences");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(Function0<? extends SharedPreferences> produceSharedPreferences, Function3<? super SharedPreferencesView, ? super T, ? super Continuation<? super T>, ? extends Object> migrate) {
        this(produceSharedPreferences, (Set) null, (Function2) null, migrate, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(produceSharedPreferences, "produceSharedPreferences");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SharedPreferencesMigration(Function0<? extends SharedPreferences> function0, Set<String> set, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, Function3<? super SharedPreferencesView, ? super T, ? super Continuation<? super T>, ? extends Object> function3, Context context, String str) {
        Set<String> mutableSet;
        this.shouldRunMigration = function2;
        this.migrate = function3;
        this.context = context;
        this.name = str;
        this.sharedPrefs$delegate = LazyKt.lazy(function0);
        if (set == SharedPreferencesMigrationKt.getMIGRATE_ALL_KEYS()) {
            mutableSet = null;
        } else {
            mutableSet = CollectionsKt.toMutableSet(set);
        }
        this.keySet = mutableSet;
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$1, reason: invalid class name */
    /* JADX INFO: compiled from: SharedPreferencesMigration.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,r\bDJc\u0003İY\u0006^\nND\u0005Ӭ:\u0012(\u000btkQ0\u000be\u000f\u0097\u0011"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7s"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039pn\u0003p\u0004\u0006\u0002\u0006yC\u0004\u0001\u007f\f{\u0010\u0006\r\r\u0013Nt\u000b\u0005\u0017\u000b\u000bw\u001b\u000f\u0011\u0011\u001f\u0013\u001d\u0013\u0016%\u007f\u001d\u001c(\u0018,\"))_m", f = " 4,<.,\u00178**(4&.\"#0\t$!+\u0019+\u001f$\"`\u001d%", i = {}, l = {}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<T, Continuation<? super Boolean>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(T t2, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass1) create(t2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(true);
        }
    }

    /* synthetic */ SharedPreferencesMigration(Function0 function0, Set set, Function2 function2, Function3 function3, Context context, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((Function0<? extends SharedPreferences>) function0, (Set<String>) set, (i2 & 4) != 0 ? new AnonymousClass1(null) : function2, function3, context, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$2, reason: invalid class name */
    /* JADX INFO: compiled from: SharedPreferencesMigration.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,r\bDJc\u0003İY\u0006^\nND\u0005Ӭ:\u0012(\u000btkQ0\u000be\u000f\u0097\u0011"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7s"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039pn\u0003p\u0004\u0006\u0002\u0006yC\u0004\u0001\u007f\f{\u0010\u0006\r\r\u0013Nt\u000b\u0005\u0017\u000b\u000bw\u001b\u000f\u0011\u0011\u001f\u0013\u001d\u0013\u0016%\u007f\u001d\u001c(\u0018,\"))_n", f = " 4,<.,\u00178**(4&.\"#0\t$!+\u0019+\u001f$\"`\u001d%", i = {}, l = {}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<T, Continuation<? super Boolean>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(T t2, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass2) create(t2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(true);
        }
    }

    public /* synthetic */ SharedPreferencesMigration(Function0 function0, Set set, AnonymousClass2 anonymousClass2, Function3 function3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((Function0<? extends SharedPreferences>) function0, (Set<String>) ((i2 + 2) - (2 | i2) != 0 ? SharedPreferencesMigrationKt.getMIGRATE_ALL_KEYS() : set), (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? new AnonymousClass2(null) : anonymousClass2, function3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(Function0<? extends SharedPreferences> produceSharedPreferences, Set<String> keysToMigrate, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> shouldRunMigration, Function3<? super SharedPreferencesView, ? super T, ? super Continuation<? super T>, ? extends Object> migrate) {
        this(produceSharedPreferences, keysToMigrate, shouldRunMigration, migrate, (Context) null, (String) null);
        Intrinsics.checkNotNullParameter(produceSharedPreferences, "produceSharedPreferences");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        Intrinsics.checkNotNullParameter(shouldRunMigration, "shouldRunMigration");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$3, reason: invalid class name */
    /* JADX INFO: compiled from: SharedPreferencesMigration.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,r\bDJc\u0003İY\u0006^\nND\u0005Ӭ:\u0012(\u000btkQ0\u000be\u000f\u0097\u0011"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7s"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039pn\u0003p\u0004\u0006\u0002\u0006yC\u0004\u0001\u007f\f{\u0010\u0006\r\r\u0013Nt\u000b\u0005\u0017\u000b\u000bw\u001b\u000f\u0011\u0011\u001f\u0013\u001d\u0013\u0016%\u007f\u001d\u001c(\u0018,\"))_o", f = " 4,<.,\u00178**(4&.\"#0\t$!+\u0019+\u001f$\"`\u001d%", i = {}, l = {}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<T, Continuation<? super Boolean>, Object> {
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(T t2, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass3) create(t2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(true);
        }
    }

    public /* synthetic */ SharedPreferencesMigration(Context context, String str, Set set, Function2 function2, Function3 function3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? SharedPreferencesMigrationKt.getMIGRATE_ALL_KEYS() : set, (i2 & 8) != 0 ? new AnonymousClass3(null) : function2, function3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(final Context context, final String sharedPreferencesName, Set<String> keysToMigrate, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> shouldRunMigration, Function3<? super SharedPreferencesView, ? super T, ? super Continuation<? super T>, ? extends Object> migrate) {
        this(new Function0<SharedPreferences>() { // from class: androidx.datastore.migrations.SharedPreferencesMigration.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final SharedPreferences invoke() throws Throwable {
                Context context2 = context;
                String str = sharedPreferencesName;
                Class<?> cls = Class.forName(C1626yg.Ud("k\u0005h\u0015Ww4\n1a\u0006\f~;%)\u007fWYU\u000boy", (short) (C1580rY.Xd() ^ (-4336)), (short) (C1580rY.Xd() ^ (-2318))));
                Class<?>[] clsArr = {Class.forName(Ig.wd("Ci|C\u0010*7S\u001a0|:hkr\u0004", (short) (C1607wl.Xd() ^ 9004))), Integer.TYPE};
                Object[] objArr = {str, 0};
                short sXd = (short) (FB.Xd() ^ 29694);
                int[] iArr = new int["Y \u0001G4ZwB\r\u001c<M\u001e\u0017{\fjY#\t".length()];
                QB qb = new QB("Y \u0001G4ZwB\r\u001c<M\u001e\u0017{\fjY#\t");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                    i2++;
                }
                Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method.setAccessible(true);
                    SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context2, objArr);
                    Intrinsics.checkNotNullExpressionValue(sharedPreferences, C1561oA.Qd("P[Y^N`[\u0014LIW5IAQCA,M??=I;C78ExC7/?1/\u001a;--+7)1%&3\r\u001f*!fY{'%*\u001a,'_}~rr\f{|r~hzjM", (short) (ZN.Xd() ^ 32426)));
                    return sharedPreferences;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }, keysToMigrate, shouldRunMigration, migrate, context, sharedPreferencesName);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        Intrinsics.checkNotNullParameter(shouldRunMigration, "shouldRunMigration");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }

    private final SharedPreferences getSharedPrefs() {
        return (SharedPreferences) this.sharedPrefs$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    @Override // androidx.datastore.core.DataMigration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object shouldMigrate(T r7, kotlin.coroutines.Continuation<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.datastore.migrations.SharedPreferencesMigration.C08031
            if (r0 == 0) goto L4d
            r5 = r8
            androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1 r5 = (androidx.datastore.migrations.SharedPreferencesMigration.C08031) r5
            int r0 = r5.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L4d
            int r0 = r5.label
            int r0 = r0 - r2
            r5.label = r0
        L19:
            java.lang.Object r4 = r5.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L3b
            if (r0 != r3) goto La5
            java.lang.Object r2 = r5.L$0
            androidx.datastore.migrations.SharedPreferencesMigration r2 = (androidx.datastore.migrations.SharedPreferencesMigration) r2
            kotlin.ResultKt.throwOnFailure(r4)
        L2d:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r0 = r4.booleanValue()
            r4 = 0
            if (r0 != 0) goto L53
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            return r0
        L3b:
            kotlin.ResultKt.throwOnFailure(r4)
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r0 = r6.shouldRunMigration
            r5.L$0 = r6
            r5.label = r3
            java.lang.Object r4 = r0.invoke(r7, r5)
            if (r4 != r1) goto L4b
            return r1
        L4b:
            r2 = r6
            goto L2d
        L4d:
            androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1 r5 = new androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1
            r5.<init>(r6, r8)
            goto L19
        L53:
            java.util.Set<java.lang.String> r1 = r2.keySet
            if (r1 != 0) goto L70
            android.content.SharedPreferences r0 = r2.getSharedPrefs()
            java.util.Map r1 = r0.getAll()
            java.lang.String r0 = "sharedPrefs.all"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto La3
        L6b:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r0
        L70:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            android.content.SharedPreferences r2 = r2.getSharedPrefs()
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L84
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L84
            goto La3
        L84:
            java.util.Iterator r1 = r1.iterator()
        L88:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto La3
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r2.contains(r0)
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L88
            goto L6b
        La3:
            r3 = r4
            goto L6b
        La5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.migrations.SharedPreferencesMigration.shouldMigrate(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.datastore.core.DataMigration
    public Object migrate(T t2, Continuation<? super T> continuation) {
        return this.migrate.invoke(new SharedPreferencesView(getSharedPrefs(), this.keySet), t2, continuation);
    }

    @Override // androidx.datastore.core.DataMigration
    public Object cleanUp(Continuation<? super Unit> continuation) throws IOException {
        Unit unit;
        Context context;
        String str;
        SharedPreferences.Editor editorEdit = getSharedPrefs().edit();
        Set<String> set = this.keySet;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (getSharedPrefs().getAll().isEmpty() && (context = this.context) != null && (str = this.name) != null) {
            deleteSharedPreferences(context, str);
        }
        Set<String> set2 = this.keySet;
        if (set2 == null) {
            unit = null;
        } else {
            set2.clear();
            unit = Unit.INSTANCE;
        }
        return unit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? unit : Unit.INSTANCE;
    }

    private final void deleteSharedPreferences(Context context, String str) throws IOException {
        Api24Impl api24Impl = Api24Impl.INSTANCE;
        if (!Api24Impl.deleteSharedPreferences(context, str)) {
            throw new IOException(Intrinsics.stringPlus("Unable to delete SharedPreferences: ", str));
        }
    }

    private final File getSharedPrefsFile(Context context, String str) throws Throwable {
        Object obj;
        short sXd = (short) (C1633zX.Xd() ^ (-11407));
        int[] iArr = new int["\u0015!\u001a'\u001f\u0018\u0016^\u001f*,1\u001d%.f\u0007249%76".length()];
        QB qb = new QB("\u0015!\u001a'\u001f\u0018\u0016^\u001f*,1\u001d%.f\u0007249%76");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Qg.kd("TQ_+YXSOHEWKPN(LCK", (short) (C1580rY.Xd() ^ (-5077)), (short) (C1580rY.Xd() ^ (-1081))), new Class[0]);
        try {
            method.setAccessible(true);
            ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
            String strVd = hg.Vd("LXMZVOI\u0012FQOTDLQ\nKG\u0007\u0019GFA=63E9><\u0016:19", (short) (ZN.Xd() ^ 16733), (short) (ZN.Xd() ^ 12345));
            String strUd = C1561oA.ud("^ZlX:^f", (short) (C1499aX.Xd() ^ (-20747)));
            try {
                Class<?> cls = Class.forName(strVd);
                Field field = 1 != 0 ? cls.getField(strUd) : cls.getDeclaredField(strUd);
                field.setAccessible(true);
                obj = field.get(applicationInfo);
            } catch (Throwable th) {
                obj = null;
            }
            File file = new File((String) obj, C1561oA.yd("|rhzjjbt\u0004wu\u0004", (short) (C1607wl.Xd() ^ 8956)));
            short sXd2 = (short) (C1580rY.Xd() ^ (-13776));
            int[] iArr2 = new int["m9//".length()];
            QB qb2 = new QB("m9//");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
                i3++;
            }
            return new File(file, Intrinsics.stringPlus(str, new String(iArr2, 0, i3)));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final File getSharedPrefsBackup(File file) {
        return new File(Intrinsics.stringPlus(file.getPath(), ".bak"));
    }

    /* JADX INFO: compiled from: SharedPreferencesMigration.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146Ȑ\u0007\"B\u0012\u007fјnjG<L͜NÐRiճ?k*3d`*qٴ?U(}j\u001f]O\u007fg\u001dL\u000b\u000fQ\u0012\u001e\u0016'n\\Mc}u\u0012=8\ttЩ7T"}, d2 = {"\u001a`]1e6BR,HyZ;x\u0017>o\r(EH\u0005\u0019$C~\u0012F\u007f3~G\u0001\u001cDm\u0015\u0019ZC<kA\u001e\u001efaGng.[r6KVWj8]v\nbub\u0019U\u0001", "", "u(E", "2d[2g,,V\u0015\fz]\u0017\n\t0e\r(\u0005>\u0001%", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "<`\\2", "", "2`c.f;H`\u0019x\b^3|\u0005=e"}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    private static final class Api24Impl {
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        @JvmStatic
        public static final boolean deleteSharedPreferences(Context context, String str) throws Throwable {
            Intrinsics.checkNotNullParameter(context, C1593ug.zd("@MMTFZW", (short) (ZN.Xd() ^ 12259), (short) (ZN.Xd() ^ 20536)));
            Intrinsics.checkNotNullParameter(str, C1561oA.od("\u001f\u0011\u001c\u0013", (short) (FB.Xd() ^ 12246)));
            Class<?> cls = Class.forName(C1561oA.Kd("|\u000b\u0002\u0011\u000f\n\u0006P\u0007\u0014\u0014\u001b\r\u0017\u001eXn\u001c\u001c#\u0015)&", (short) (ZN.Xd() ^ 21377)));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (FB.Xd() ^ 5514);
            short sXd2 = (short) (FB.Xd() ^ 10378);
            int[] iArr = new int[":f<q\u0003\fA\u0019^kV@\u0005@\fU".length()];
            QB qb = new QB(":f<q\u0003\fA\u0019^kV@\u0005@\fU");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = {str};
            Method method = cls.getMethod(C1561oA.Xd("HJRL\\N=SM_SS@cWYYg[e[^m", (short) (OY.Xd() ^ 10443)), clsArr);
            try {
                method.setAccessible(true);
                return ((Boolean) method.invoke(context, objArr)).booleanValue();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }
}
