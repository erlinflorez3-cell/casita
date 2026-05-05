package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: SelectionRegistrar.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000bDB\u0007\"2\u0013\u007f\u0007tqAӄLeV.ZS0\u0010s{B-cҕyCQU\"Ԃ*\teNogtKb\u000bY\u000f\u000e\u0016~r4Ikxe\u0012\u00154HNU\u074ck\u0012m9\u000fsn\u0004Bz(F~\u001d\u0001H0\u000f4?\tQR$\u0012^H!>`\u0016e\u0005H\u0018Lbh\u000f,f\u007fNdP\u001daH8;\u0003\u0018H\u0015K(p\u000bX%F\u00033=zo+C@eCE)a\u0012\u001fR\nO3C\u007fN\u001dhU7[M\u0002iNX. E/] urTp5Un!?+}o\u0012t̤'»ߡ\u007f\u000fB\u001a\u001c\u001doN<E2f6\u0016y\u0019;iNi\u001a^p\b+eD =\u007fa1i\u001ftfy;GZ} M=,=\u0019nOc\u0005\u0012n\"3T&_aUNX`N8imq\u0012\u0004z\u0002X\u0018`K\u000eD\u0014\u0011\\#k[ڼ8\u05fa\u074co\u0004N`u\u0014Mnvq\u0002Rv_Rr$WB\t:y\u000b\tMy^up,?ULX\u0015\u001e \u0013N{>`q;\u001eNgnyl]]8']g\u000e֑p«\u0012[Q`98_g¼`QΛ\u0014JDe\u000bּ\u0003pR\u0014\\bGP1ʴn3ȯ\u007fC"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\u0014GNR:k_nJi", "", "AtQ@X3>Q(\u0003\u0005g:", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\ng! IY\u000bAv#DAy+\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f|", "5dc h)LS ~xm0\u0007\u0012=", "u(;.a+K]\u001d}\u000e(*\u0007\u00106e}7\u007fJ\n`}Qx\u0010&s*5W\r\b3xk", "<dgAF,ES\u0017\u000ev[3|l.", "", "<nc6Y@)]'\u0003\nb6\u0006f2a\t*{", "", "Ad[2V;:P ~^]", "<nc6Y@,S ~xm(y\u0010/C\u0003$\u0005B\u0001", "<nc6Y@,S ~xm0\u0007\u0012\u001fp~$\u000b@", "", ":`h<h;\u001c]#\fyb5x\u0018/s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "<df\u001db:Bb\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", ">qTC\\6Na\u0004\t\tb;\u0001\u00138", "7rBAT9M6\u0015\bye,", "/cYBf;FS\"\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\u0003FQ^:kZrF#g", "7r8;G6NQ\u001cf\u0005],", "<nc6Y@,S ~xm0\u0007\u0012\u001fp~$\u000b@H \u001c$z\u001fF|", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\f1m\b0FK 8ZB?t0-\u0015v7\u001ekX\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\u000e\u000fiJ#jS;)\u0011uX\u0002NwJ\u001a\u0016\u00155h\u007fF`\u0019\u0011g\u0015|A'wJchUFFUp9l\fh,2/}\u0019", "<nc6Y@,S ~xm0\u0007\u0012\u001fp~$\u000b@` \u0016", "<nc6Y@,S ~xm0\u0007\u0012\u001fp~$\u000b@n\u0017\u001eGm\u001d\u0018},", "<nc6Y@,S ~xm0\u0007\u0012\u001fp~$\u000b@n&\u0013T~", "AsP?g\u0017Ha\u001d\u000e~h5", "<nc6Y@,S ~xm0\u0007\u0012\u001fp~$\u000b@n&\u0013T~ULs\u000e&km\f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\f1m\b0FK 8ZB?t0-\u0015v7\u001em_5M\u00041KKauZ\\zH\u001e ZWO5\u001d\u000eX=3rN@h\u0017,\\\u0011\u0005v\u0001\u0013\u0016\fDnzK }G\u0001\u0015sP-rO5^~WOTj*m\u001b5\u0012 +", "AtQ@V9BP\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r(K}'\u001d", "Ad[2V;:P ~", "CmbBU:<`\u001d{z", "\u0011n\\=T5B]\"", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface SelectionRegistrar {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final long InvalidSelectableId = 0;

    LongObjectMap<Selection> getSubselections();

    long nextSelectableId();

    void notifyPositionChange(long j2);

    void notifySelectableChange(long j2);

    /* JADX INFO: renamed from: notifySelectionUpdate-njBpvok, reason: not valid java name */
    boolean mo1727notifySelectionUpdatenjBpvok(LayoutCoordinates layoutCoordinates, long j2, long j3, boolean z2, SelectionAdjustment selectionAdjustment, boolean z3);

    void notifySelectionUpdateEnd();

    void notifySelectionUpdateSelectAll(long j2, boolean z2);

    /* JADX INFO: renamed from: notifySelectionUpdateStart-ubNVwUQ, reason: not valid java name */
    void mo1728notifySelectionUpdateStartubNVwUQ(LayoutCoordinates layoutCoordinates, long j2, SelectionAdjustment selectionAdjustment, boolean z2);

    Selectable subscribe(Selectable selectable);

    void unsubscribe(Selectable selectable);

    /* JADX INFO: compiled from: SelectionRegistrar.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\u0014GNR:k_nJRod\u0016Y'\u0016\tcJy", "", "u(E", "\u0017me._0=A\u0019\u0006z\\;x\u00066ec'", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long InvalidSelectableId = 0;

        private Companion() {
        }
    }
}
