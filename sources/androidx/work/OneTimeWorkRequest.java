package androidx.work;

import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
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
/* JADX INFO: compiled from: OneTimeWorkRequest.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4D\u0015ӬJ\u0016(\u0007\u0015iq0Gi\t;Xݷ:\u0013y{L$\n%ڱG;c\u001cԫ&\u000e"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R\u0019n\u007f\u0017\u007fH\u0001\t!Tuz<\u000355g\ru", "\u001a`]1e6BR,H\rh9\u0003R!o\r.h@\r'\u0017U~c", "0tX9W,K", "\u001a`]1e6BR,H\rh9\u0003R\u0019n\u007f\u0017\u007fH\u0001\t!Tuz<\u000355g\r^\u0014}\u001a5LCHA", "uKP;W9HW\u0018\u0012Dp6\n\u000fxO\t(jD\t\u0017\tQ|\u0014)v1EY\f/uJ&2TB;x\na\u0006", "\u0010tX9W,K", "\u0011n\\=T5B]\"", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class OneTimeWorkRequest extends WorkRequest {
    public static final Companion Companion = new Companion(null);

    @JvmStatic
    public static final OneTimeWorkRequest from(Class<? extends ListenableWorker> cls) {
        return Companion.from(cls);
    }

    @JvmStatic
    public static final List<OneTimeWorkRequest> from(List<? extends Class<? extends ListenableWorker>> list) {
        return Companion.from(list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTimeWorkRequest(Builder builder) {
        super(builder.getId$work_runtime_release(), builder.getWorkSpec$work_runtime_release(), builder.getTags$work_runtime_release());
        Intrinsics.checkNotNullParameter(builder, "builder");
    }

    /* JADX INFO: compiled from: OneTimeWorkRequest.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"B\u0012\u007f\u0007lpA0ZeP\u008chݷZ\u001b{}D$\nҕ\u0002EKUH}P\b\u0010aws|Kr\u0013S\u0013\f\u0015\tjZL\u0004zٕ\u0016\u000f@F8JAU\b=g`;Dӯ$2(AB\u0019\u000f$BH>͌+OY\u0017*8Pt@Q\u001dM3&@\b\u000f2\u000f#tg|Ȥ~;4Ǝ1ݭ\u0007mZP-e>\u0004֚\u0011S"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R\u0019n\u007f\u0017\u007fH\u0001\t!Tuz<\u000355g\r^\u0014}\u001a5LCHA", "\u001a`]1e6BR,H\rh9\u0003R!o\r.h@\r'\u0017U~L\u0019\u0007)<X}-\r", "\u001a`]1e6BR,H\rh9\u0003R\u0019n\u007f\u0017\u007fH\u0001\t!Tuz<\u000355g\ru", "Ena8X9\u001cZ\u0015\r\t", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "\u001a`]1e6BR,H\rh9\u0003R\u0016i\u000e7{I|\u0014\u001eGa\u0018I|%B/", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sUkl", "BgX@B)CS\u0017\u000e", "5dc![0L=\u0016\u0004z\\;;\u001b9r\u0006\"\tP\n&\u001bOo\bIv,5U\f ", "u(;.a+K]\u001d}\u000e(>\u0007\u00165/i1{/\u0005\u001f\u00179y\u001bBc%Ai}.F,r>QJ:kAs", "0tX9W\u0010Gb\u0019\f\u0004Z3", "0tX9W\u0010Gb\u0019\f\u0004Z3;\u001b9r\u0006\"\tP\n&\u001bOo\bIv,5U\f ", "Adc\u0016a7Nb\u0001~\b`,\n", "7m_Bg\u0014>`\u001b~\b", "\u001a`]1e6BR,H\rh9\u0003R\u0013n\u000b8\u000b(\u0001$\u0019G|c", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Builder extends WorkRequest.Builder<Builder, OneTimeWorkRequest> {
        @Override // androidx.work.WorkRequest.Builder
        public Builder getThisObject$work_runtime_release() {
            return this;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Class<? extends ListenableWorker> workerClass) {
            super(workerClass);
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            getWorkSpec$work_runtime_release().inputMergerClassName = OverwritingInputMerger.class.getName();
        }

        public final Builder setInputMerger(Class<? extends InputMerger> inputMerger) {
            Intrinsics.checkNotNullParameter(inputMerger, "inputMerger");
            getWorkSpec$work_runtime_release().inputMergerClassName = inputMerger.getName();
            return this;
        }

        @Override // androidx.work.WorkRequest.Builder
        public OneTimeWorkRequest buildInternal$work_runtime_release() {
            if (getBackoffCriteriaSet$work_runtime_release() && getWorkSpec$work_runtime_release().constraints.requiresDeviceIdle()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
            }
            return new OneTimeWorkRequest(this);
        }
    }

    /* JADX INFO: compiled from: OneTimeWorkRequest.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007|jA0R\u0004P.XS0Ŧl\u0012éT[Rp\u0004@[\u001aԥ&\t]N0}|Kr\u000bq\u00116\"\u0007mDQe|c\u0011\u001f2ptm7\u0014t\u0006[nuN\u000b0428(\u0007/ ZZ\u001e}\u0013Q[\u0016\"8Pt@Q\u001dM3\u001f@\nl&G#֚kV"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R\u0019n\u007f\u0017\u007fH\u0001\t!Tuz<\u000355g\r^\u0015w\u001e9IL?u=s", "", "u(E", "4q^:", "\u001a`]1e6BR,H\rh9\u0003R\u0019n\u007f\u0017\u007fH\u0001\t!Tuz<\u000355g\ru", "Ena8X9\u001cZ\u0015\r\t", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "\u001a`]1e6BR,H\rh9\u0003R\u0016i\u000e7{I|\u0014\u001eGa\u0018I|%B/", "", "Ena8X9\u001cZ\u0015\r\t^:", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OneTimeWorkRequest from(Class<? extends ListenableWorker> workerClass) {
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            return new Builder(workerClass).build();
        }

        @JvmStatic
        public final List<OneTimeWorkRequest> from(List<? extends Class<? extends ListenableWorker>> workerClasses) {
            Intrinsics.checkNotNullParameter(workerClasses, "workerClasses");
            List<? extends Class<? extends ListenableWorker>> list = workerClasses;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Builder((Class) it.next()).build());
            }
            return arrayList;
        }
    }
}
