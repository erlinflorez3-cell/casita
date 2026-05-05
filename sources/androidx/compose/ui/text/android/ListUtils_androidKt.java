package androidx.compose.ui.text.android;

import com.dynatrace.android.agent.Global;
import defpackage.Architecture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: ListUtils.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d̉=!,i\bӵLc\u0003\"Iي8\u000bDB\u0007\"2\u0013\u007f\u0007t\bA0JgP.hS2ş\u00042Břs$ B[W Ԃ0\twTwi~J!\u000bq\u00106&\u0007lDUezm\u0012U2RqO3{nk<'қ<ӏ 8*<\u007f\u0004\u0011\u001a8G(R\tGc\fX5`r@ĥ\u001bM%\u001c\u0018\u0005L&!,bg\\;ptm>5݊\u0013i\tTUfX\u0003]\u000fVTm\r%bN/N?M\u0015kX3\u0017`dW\u000fOsM\u0005/'7-Ys\u001e<\u0007\u0003ZƄ1̀\rcz*b\u0004a`\u001a'˦ScYZ&p\u0006\u0006\u0014\u0013L\u0006\u001e\u0006mN\\.:h\u000eԄAt\u0013UFO\u0010dj\u0006\u000bcF\u0017k\u007fa,i1tZyM)PG{K\r.%\u0011ng[d\u0010p\u0015aZ&]w҆F׃HT\u0012]Cl\u0014pp\u0001ø\b="}, d2 = {"4`bA96K3\u0015|}", "", "\"", "", "/bc6b5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "4`bA@(IB#", "\u0011", Global.BLANK, "", "2dbA\\5:b\u001d\t\u0004", "BqP;f-H`!", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f-wQ|`'Vs\u0015\u0006T/<`}\u001eFq 7#*AuC%\u0019q+>\u0018kuO\u00070E[R6e`<\u001e$\u001bX\u001dR5\u0016P/\u0005\u000bs@H\u001bQ<X\u0006B2^\u0016\u001d\u00155h\u007fF`\u0019\u001d", "4`bAM0IE\u001d\u000e}G,\u0010\u0018", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ListUtils_androidKt {
    public static final <T> void fastForEach(List<? extends T> list, Function1<? super T, Unit> function1) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            function1.invoke(list.get(i2));
        }
    }

    public static final <T, R> List<R> fastZipWithNext(List<? extends T> list, Function2<? super T, ? super T, ? extends R> function2) {
        if (list.size() == 0 || list.size() == 1) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        Architecture architecture = list.get(0);
        int lastIndex = CollectionsKt.getLastIndex(list);
        while (i2 < lastIndex) {
            i2++;
            T t2 = list.get(i2);
            arrayList.add(function2.invoke(architecture, t2));
            architecture = t2;
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C fastMapTo(List<? extends T> list, C c2, Function1<? super T, ? extends R> function1) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            c2.add(function1.invoke(list.get(i2)));
        }
        return c2;
    }
}
