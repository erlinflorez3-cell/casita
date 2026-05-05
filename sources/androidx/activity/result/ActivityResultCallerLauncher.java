package androidx.activity.result;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResultCallerLauncher$resultContract$2;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: ActivityResultCaller.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u0006DLc\u000b\u0004I\u0006>\u000b6B\u0005\"4\u0012\u000e\u0007nj??Le^.ZS0\u0010qڔJř\u0004&wّITB\u007f(\b]N\u0018m~Lj\u000bq\u00114\u00179\u0018<Sc{u\u0018\u001f4Rou\u074c{pMInxN\u001104280ڎ\u0011\u001c:HFu)H[\u0010 6XppĥҫQ\u0005(\u0019NP.\u00146hwPFH\u001b_J13\u0003 A|,&DEj\u001bZl';x\u0012\"9UO5C'\u0004\t\u0015hsA\u0019> TK|Ҋ++W\f <f\u0019,\u0015YQSqCAj\til\u001c);O\u001a֟`\u00108w1z;AǬ\u0012\f/ΞF/ n\u0016\u0017\u0004\u0006\u0001YXP8މ۰\u0004\u0003i6%1\u001851C)q\"vI\u001cf=\f\u0007\u001d\u001eYЧ\u001d\"ƟX\u0014hٽ3V}^?_\u0011bV]\"eMo\u0014p\u0011\u0004:\u0006@G6.*\u0016d[{ڢو9؝%u\nJJx\u0005\u0017xjYy`Qـ&\t"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9i:\u0006)F]\r4$m$>TR\u0019g;%\u0015uH5\u0017l*Qv4\u001d", "\u0017", "\u001d", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9i:\u0006)F]\r4$m$>TR\"gD'\u0013kaF\\", "", ":`d;V/>`", "1`[9X9\u001c]\"\u000e\bZ*\f", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]\u0002", "1`[9X9\"\\$\u000f\n", "uKP;W9HW\u0018\u0012DZ*\f\r@i\u000f<EM\u0001%'N~W\u0018t49j\u0002/KZ\u0016<]JJR0.\u001efd9\u00149\u0013J\u007f&TVR+o\u001cn;#\u0016k\u0012]?V\u0012YO4uS\u0001\u001d\u00125X\u000f7f\u0010Uq\fDn\u0002Fe$4y#\u0006H8FPbn\u0007C?T8\u0011i\bp\u0019&A6-\u0016;\u0003\u0018mP,\u0019Q\u0017\u0002", "5dc\u0010T3ES&\\\u0005g;\n\u0005-t", "u(;.a+K]\u001d}\u000e((z\u00183v\u00047\u0010\n\u000e\u0017%Wv\u001d\u0006t/>h\u000b\u001c5|_\nKR?|8-)UaG\u0017j;,\u00010VYJ*k(", "5dc\u0010T3ES&b\u0004i<\f", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "5dc\u0019T<GQ\u001c~\b", "u(;.a+K]\u001d}\u000e((z\u00183v\u00047\u0010\n\u000e\u0017%Wv\u001d\u0006R#D]\u000f$F\u0002\u0003.[SBz\u001b\u001a%q_<\u0007p\u0002", "@dbB_;\u001c]\"\u000e\bZ*\f", "5dc\u001fX:NZ(\\\u0005g;\n\u0005-t", "@dbB_;\u001c]\"\u000e\bZ*\fG.e\u0007(}<\u0010\u0017", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "5dc\u0010b5M`\u0015|\n", ":`d;V/", "7m_Bg", "=oc6b5L", "\u001a`]1e6BR,Hxh9|R+p\u000bqW>\u0010\u001b(K~\"&\u000249c\u0007.\u0015w\u001e9IR\u0011", "uKZ<g3B\\bn\u0004b;Ro+n~5\u0006D\u007f*`Ey\u001b<@!@dG{5|\u001a?QROU?-\u0019rjGdm4Yr6\u001d\u0010?", "Cma2Z0Lb\u0019\f", "/bc6i0Mg`\u0005\nq&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ActivityResultCallerLauncher<I, O> extends ActivityResultLauncher<Unit> {
    private final ActivityResultContract<I, O> callerContract;
    private final I callerInput;
    private final ActivityResultLauncher<I> launcher;
    private final Lazy resultContract$delegate = LazyKt.lazy(new Function0<ActivityResultCallerLauncher$resultContract$2.AnonymousClass1<I, O>>(this) { // from class: androidx.activity.result.ActivityResultCallerLauncher$resultContract$2
        final /* synthetic */ ActivityResultCallerLauncher<I, O> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.this$0 = this;
        }

        @Override // kotlin.jvm.functions.Function0
        public final AnonymousClass1<I, O> invoke() {
            final ActivityResultCallerLauncher<I, O> activityResultCallerLauncher = this.this$0;
            return new ActivityResultContract<Unit, O>() { // from class: androidx.activity.result.ActivityResultCallerLauncher$resultContract$2.1
                @Override // androidx.activity.result.contract.ActivityResultContract
                public Intent createIntent(Context context, Unit unit) {
                    return activityResultCallerLauncher.getCallerContract().createIntent(context, activityResultCallerLauncher.getCallerInput());
                }

                @Override // androidx.activity.result.contract.ActivityResultContract
                public O parseResult(int i2, Intent intent) {
                    return activityResultCallerLauncher.getCallerContract().parseResult(i2, intent);
                }
            };
        }
    });

    public final ActivityResultLauncher<I> getLauncher() {
        return this.launcher;
    }

    public final ActivityResultContract<I, O> getCallerContract() {
        return this.callerContract;
    }

    public final I getCallerInput() {
        return this.callerInput;
    }

    public ActivityResultCallerLauncher(ActivityResultLauncher<I> activityResultLauncher, ActivityResultContract<I, O> activityResultContract, I i2) {
        this.launcher = activityResultLauncher;
        this.callerContract = activityResultContract;
        this.callerInput = i2;
    }

    public final ActivityResultContract<Unit, O> getResultContract() {
        return (ActivityResultContract) this.resultContract$delegate.getValue();
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public void launch(Unit unit, ActivityOptionsCompat activityOptionsCompat) {
        this.launcher.launch(this.callerInput, activityOptionsCompat);
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public void unregister() {
        this.launcher.unregister();
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public ActivityResultContract<Unit, ?> getContract() {
        return getResultContract();
    }
}
