package androidx.work.impl.model;

import androidx.lifecycle.LiveData;
import androidx.work.Data;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import java.util.List;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: WorkSpecDao.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я`\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\r.4ߚ\u007f\u0007t\tA0ZeP\u008cZS8\u0015s{:%c$\bCCU ~*\teNogtJb\u000bQ\u0016\u000e\u0016~l4Ikxe\u0012\u00156JoU3UڎE9vt>\u0005&8*8\b\u000e\t\u001a0X\u0016\\\u0011ŏ{\f@/\t~HR%M3\u001bB\nL\"\u0019\u001e\u000bj\u0015[\u0011\u0001k>G)\u0013kRNUe^\u0002}\u0011T[?\r%idP\tCC\u001e=Y\u0013\tb[m\u0006mv\u0004*1355ayg8h\u007fB\u0018YTS\u0003;8j\u0010il\u001c/;UsM`\u000eVz)\u0001;HJ3N;V;E v\n\u001e3#x\u0002E\u0001\u0006lP\u0018z\u0010>]JHG9H3lacK\u0019|G*\n=\"1\u0003\u0007!\nWT\u0006]/b\ti7aBMH|\u0010\bB\u001e\b~t\u001a*2C\u000e%w\b\u001fB/+G]I#Oq0M\u000b\r?\u0019n}kobJP\"\u001d)e69\u0010hF|\u0005\u001aS\u001b}t\u001d[2l\r\u000e\n# \u000b}j&k5\u0017_v\u0001\u0003Os\tSG\u0017;gp\u0004\u000e\u0006<%X}eq)yX\u0007\u0016O<\u0011\b\u0007krW\u001att(P5\u000f\u0010X\f\n_f\u0012#4OqJ7Z6I`#d\u001b\u001epDC.(jv-\u0017VI#1oTx\u0017\u0003h\\\u001fr.\u001e\u0012@\u000b~:3QSE\u0019TtPmd\u00011!\u0017s.J.q\u0010\\z6\u000eW\u0012\u001fD;iU=?+\u000f-,x'u_Z\u0015}W]\u00147z+\u001b=@\u00198u+\u0003v<bzJ}WE'=\u0004;7\u0016\t\u0018\u007fqH\u000bG\u0012u9`nM\u0001\u001dq<|;C*g23&\b(\r7=CU>D|D3#}ui\u001e1@\bWF\u0003\f\u001c8s\u001e\u007fha_B;fj\b\u0004l.Tv\u0011e`p\b\nR\tb\u0010aM\b\n9pFt#;\u000en\u00172\u001drf[h4\u001e\u0003b:\u0010.\u0002]\u0016\u0014\rFk6\u0016mu\u0016\u0006Wl\u0013Z\u0015\u001a\r\f1\u001d3JBNb\bf\u0017L\u001esF9\b`+\u000bJ2<4ZfN0\fbw1(z.G\u0010\u0013%4ZsiYTyAjdt\u001d`saQ.\u000f\u0001'3L{{VM{T\u0002Gc`\t\u0004!\u0017\u001d\u0003O-ikP\rbGI@X/\fuaQx\u001a62Mo\u00134\u0006\u001ah0|KJH\u001fGS)_%3\u000f\u000fc\u0016fd%%-w\u0017(71\u0013|<=P4S\u001f]&\bb[T\u0015\u001d\u007fQ(5/DW\u000f<\u0001qH3-48sb\u0012\u0001\"\\\u0014W\u0002<.\f.\"?\u0004#$\r[\u001c\u001d\"]IM\\\u0017^x\u0010@+PN\u0005^N\u0003t\".69\u007f\u0006A:+^\b{>F\t=9&\u001eByp)\u000eq'{n\u0004#3j?X\u0012n[Sc.o[<NpZh\u0012\u0004$f@\u0018\u0014C,e[ʳfe"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EH\u000b\u0016\u0017N9\u007fF\u0004+#d}\u001e\u0016i \u0004", "", "2d[2g,", "", "7c", "", "5dc\u000e_3\u001eZ\u001d\u0001~[3|z9r\u0006\u0016\u0007@~%wQ|{:y%4i\u0005$@o", "", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EH\u000b\u0016\u0017N9\u007fF\u0004+#d}\u001e\r", ";`g\u0019\\4Bb", "", "5dc\u000e_3.\\\u001a\u0003\u0004b:\u007f\t.W\n5\u0002", "5dc\u000e_30]&\u0005hi,zl.s", "5dc\u000e_30]&\u0005hi,zl.sf,\r@_\u0013&C", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005(\u0017&k\u001d8L", "5dc\u0012_0@W\u0016\u0006zP6\n\u000f\u0010o\r\u0016yC\u0001\u0016'Ns\u0017>", "AbW2W<ES&e~f0\f", "5dc\u0016a7Nb'_\bh4g\u0016/r\u007f4\fD\u000f\u001b&G}", "\u001a`]1e6BR,H\rh9\u0003R\u000ea\u000f$Q", "5dc\u001fX*>\\(\u0006\u000f<6\u0005\u00146e\u000f(z2\u000b$\u001d", "AsP?g0GUt\u000e", "", "5dc\u001fh5GW\"\u0001lh9\u0003", "5dc V/>R)\u0006zK,\t\u0019/s\u000f(z\u001c\u0010}\u001bXol8\u0006!", "5dc V/>R)\u0006z]\u001e\u0007\u00165", "5dc g(MS", "\u001a`]1e6BR,H\rh9\u0003R!o\r._I\u0002!U5~\nKvz", "5dc\"a-B\\\u001d\r}^+n\u0013<kq,\u000bCi\u0013\u001fG", "<`\\2", "5dc\"a-B\\\u001d\r}^+n\u0013<kq,\u000bCo\u0013\u0019", "B`V", "5dc$b9DA$~x", "5dc$b9DA$~xB+X\u0012.S\u000f$\u000b@\u000fw!TX\nDv", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EH\u000b\u0016\u0017N9\u007fF\u0004+#d}\u001euQ\u0015\nVB)z0-\u0015>", "5dc$b9DA(z\nn:g\u00134o`2\t$\u007f", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EH\u000b\u0016\u0017N9\u007fF\u0004+#d}\u001eu_ ;S'Dl>\t\u001fmk\u000f", "5dc$b9DA(z\nn:g\u00134o`2\t$\u007f%", "7cb", "5dc$b9DA(z\nn:g\u00134o`2\t)|\u001f\u0017", "5dc$b9DA(z\nn:g\u00134o`2\t/|\u0019", "5dc$b9DA(z\nn:g\u00134of,\r@_\u0013&CP\u0018IZ$C", "5dc$b9DA(z\nn:g\u00134of,\r@_\u0013&CP\u0018I_!=Y", "5dc$b9DA(z\nn:g\u00134of,\r@_\u0013&CP\u0018Ie!7", "6`b\"a-B\\\u001d\r}^+n\u0013<k", "", "7mR?X4>\\(`zg,\n\u0005>i\n1", "7mR?X4>\\(izk0\u0007\b\ro\u00101\u000b", "7mR?X4>\\(p\u0005k2j\u0014/cl8\u0005\u001c\u0010&\u0017Oz\u001d\u001a\u00015>h", "7mb2e;0]&\u0005hi,z", "Ena8F7>Q", ";`a8J6KY\u0007\nz\\\u001az\f/d\u0010/{?", "AsP?g\u001bB[\u0019", ">qd;X\rB\\\u001d\r}^+n\u0013<kq,\u000bCu\u0017$QN\u000eGv.4Y\u0007/EQ\u00187WP?t6\u0004\u0015hl\u001a\u0011p\b]]'CZ]", "@db2g\u001a<V\u0019}\u000be,{v>a\u000f(", "@db2g\u001eH`\u001fl\u0006^*i\u00198A\u000f7{H\f&tQ\u007f\u0017K", "Adc\u0019T:M3\"\u000b\u000b^<|\b\u001ei\b(", "3m`BX<>B\u001d\u0007z", "Adc\u001ch;Ic(", "=tc=h;", "Adc g(MS", "AsPAX", "CoS.g,0]&\u0005hi,z", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public interface WorkSpecDao {
    void delete(String str);

    List<WorkSpec> getAllEligibleWorkSpecsForScheduling(int i2);

    List<String> getAllUnfinishedWork();

    List<String> getAllWorkSpecIds();

    LiveData<List<String>> getAllWorkSpecIdsLiveData();

    List<WorkSpec> getEligibleWorkForScheduling(int i2);

    List<Data> getInputsFromPrerequisites(String str);

    List<WorkSpec> getRecentlyCompletedWork(long j2);

    List<WorkSpec> getRunningWork();

    LiveData<Long> getScheduleRequestedAtLiveData(String str);

    List<WorkSpec> getScheduledWork();

    WorkInfo.State getState(String str);

    List<String> getUnfinishedWorkWithName(String str);

    List<String> getUnfinishedWorkWithTag(String str);

    WorkSpec getWorkSpec(String str);

    List<WorkSpec.IdAndState> getWorkSpecIdAndStatesForName(String str);

    WorkSpec.WorkInfoPojo getWorkStatusPojoForId(String str);

    List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForIds(List<String> list);

    List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForName(String str);

    List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForTag(String str);

    LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForIds(List<String> list);

    LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForName(String str);

    LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForTag(String str);

    boolean hasUnfinishedWork();

    void incrementGeneration(String str);

    void incrementPeriodCount(String str);

    int incrementWorkSpecRunAttemptCount(String str);

    void insertWorkSpec(WorkSpec workSpec);

    int markWorkSpecScheduled(String str, long j2);

    void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();

    int resetScheduledState();

    int resetWorkSpecRunAttemptCount(String str);

    void setLastEnqueuedTime(String str, long j2);

    void setOutput(String str, Data data);

    int setState(WorkInfo.State state, String str);

    void updateWorkSpec(WorkSpec workSpec);
}
