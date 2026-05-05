package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: SelectionRegistrarImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яċ\u0014D57\u001eq\u007fZDkt\nA\u000e0\u00195J~(,\u001aw\u001dfr9FDm߉6RaI\u0017ӆ\u00044:[,qQ;]\u001a\u0004%\u0011Odgon`Z\u0013C\u0015\u000b\u001ex\u0001,QU\u0007f\u001a\u000fHBw?IMw=O`|6\u000b#:\"Ny\r\u0001 -P\u0010\rzKK\u0012\u00158@\u0007:Z\rS\b\"\u0012\u001c>(\u0001$]oNDft]@5+\u0003\u007fBV'eN\u0003ձ#Ͽr\n=v\u0010\u001dc?\u001au\u001a+gΫ\u000bRi?CLw=\u0015l5(CI\"Y͏\\\u007f\"\u0018sU\u001b(\u000b&\u000b\u0007\u0018tT59\u001b{K~\u0019X{\tH%<2\u0010L;\u0011<;g~\b<>%va\rh\u0002\rDF\u000f*v%s\u00183YTKj_1S\u0019|S,\t\u001bn;\u0001\u001d>\fX\u001c2-\u001b\u0003\u0015\u00025_\u0013UH|%\nA{W\tb0H44UTG{?I]9ܔZݽ؝%m\b\u001eR>?\u000bn@ki\u0001S\u000767,E\u0003!\f\tO\u0015\ty\u001dlXZ\u0013} b[\u0016\bA;#\f\u0005Q3ifO\u0017t\u001bQkY=/\u0015S\nryho9\rPeUqcyR%2o@pYpfpnRnۛ'ίĘLl\u0016S\n!\u0017\u001e!\u0010Ww,6<1GbC\u00033\"P \u0015\t\u000ev1\u001e\r4K$1oTx\u0017ah\\\u001fu.\r\u0012:\u000bB:-o\\e\u001d46:hb\u0003i\u001bO\u0006\u000eK\u007fRWN|\u0016$[*%l֠;ֺ3=\u001bÁO;@\tEK\\tuQ{\u0018U\u0003Sȭ\u0011³l.oō;\u0017:i\u0003X_V'\"%`\u0003%\u0018d.\u0005wE)Q:һ\u0017ИBUzÅq>TD\u000b\u0012? +\u000f}1ME;S?!D\t|/ss4ɓ{Ц}b\u0017ծE\f\u0012?{$\u007fda]`=HKi~l-:k1L\u001f۴\u0004ڇF\u0015<ؿKJGx~cXO\u0011D\fuWR\u001b\u0007niJ\u0015\u007f}b0o,\u0004C,\u001ftBS\u001b$ϊsƽqWd֥b\u0011\u0010\"\n>\u000f\u0014\"U.e('\u0017I\u001e (8Q;\u0011 L\u000b44ZX\u0018\rST\u0018# |\u0010F\u000e,'4Rsiq\u001eV\t\\\u0005f\u0015bU`OE\u0017}=Mt֮A̰\tyN\u07bcGe8 a=)\u001dpp\r\tuKRwQ#8Z\u0011\u000bshYH0ZZڜ5Թo{\u0014Մ0~#g&AYS\u0017\u0007\u0005X/7c\u000efx\u0007\u0014vR|=9\u0001\u000b|<>\u001a\u0011\u001b\u0019}}\u0006a[v%ߘCƴ\u001e\r\u001f\u05edA\t\u0012(qr;/\fb;k\u001a#\"V\u0014wc=\u000e\bN;7\u0006\u0005!\u000bs\u001eh\u001a]IW&s&b0'#R0\u0004\\U\u000bq8^^ˇ[ױ7\u000e\u001bȅqm}RNYKn\fuY\u001dI\"q\"{te\r\u0013f_\\(%c\u000fsԕ)Ӱ2\u0017p\\@HaX))\u000eM-,/8\u0018bW\u0016}\u001e\u001f/Bψ]á/3\u0004,gl>\u000fn\u0016-7\u000e\u0004Xo~־GܑQJlӷtnH\u0016\u001c\u001e\u000b*j5\u001ajd2\r\rv\u0017#6VrL(]mI)iO_f\u0017\u0006UITd_\tuou\u0007a·Ęv\u05ce\u0007Jjv\u0006rPR\u000b\u0002mq;~t? mgkݩd\b.NKё^6+ן\u0012t"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\u0014GNR:k_nJw\u001ae\u0015$", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\u0014GNR:k_nJi", "u(E", "7mXA\\(E7\"|\b^4|\u0012>I~", "", "uI\u0018#", "-rT9X*MO\u0016\u0006zF(\b", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<]/>[g\u001d<m\u0014=5?FA", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r(K}'\u001d", "-rT9X*MO\u0016\u0006zl", "", "/ec2e\u001a>Z\u0019|\nZ)\u0004\t\u001fn\u000e8xN~$\u001bDo", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "5dc\u000eY;>`\u0007~\u0002^*\f\u0005,l\u007f\u0018\u0005N\u0011\u0014%E|\u00129vc6c\u000e)6i%2WL5x4%\u0015do9", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "Adc\u000eY;>`\u0007~\u0002^*\f\u0005,l\u007f\u0018\u0005N\u0011\u0014%E|\u00129vc6c\u000e)6i%2WL5x4%\u0015do9", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc(", "7mR?X4>\\(by", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5T 7O\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0001Dc\u0006$5T 7O\u0019", "=m?<f0MW#\bXa(\u0006\u000b/C{/\u0003=|\u0015\u001d", "5dc\u001ca\u0017Ha\u001d\u000e~h5Z\f+n\u0002(Y<\b\u001e\u0014Cm\u0014zw/Eb|\u001cFq 7GP;r4\u001a#h", "Adc\u001ca\u0017Ha\u001d\u000e~h5Z\f+n\u0002(Y<\b\u001e\u0014Cm\u0014zw/Eb|\u001cFq 7GP;r4\u001a#h", "=mB2_,<b\u0015{\u0002^\n\u007f\u00058g\u007f\u0006wG\b\u0014\u0013Eu", "5dc\u001ca\u001a>Z\u0019|\nZ)\u0004\t\rh{1}@^\u0013\u001eNl\n:|c6c\u000e)6i%2WL5x4%\u0015do9", "Adc\u001ca\u001a>Z\u0019|\nZ)\u0004\t\rh{1}@^\u0013\u001eNl\n:|c6c\u000e)6i%2WL5x4%\u0015do9", "=mB2_,<b\u001d\t\u0004N7{\u0005>e]$\u0003G}\u0013\u0015M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001386U", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\u0003FQ^:kZrF#g", "5dc\u001ca\u001a>Z\u0019|\nb6\u0006x:d{7{\u001e|\u001e\u001eDk\fB5&?i\u0007\u001f3|\u001a8V=Hk;\u001e\u0011va", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bNu", "Adc\u001ca\u001a>Z\u0019|\nb6\u0006x:d{7{\u001e|\u001e\u001eDk\fB5&?i\u0007\u001f3|\u001a8V=Hk;\u001e\u0011va", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>*Sc(", "=mB2_,<b\u001d\t\u0004N7{\u0005>e_1z\u001e|\u001e\u001eDk\fB", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "5dc\u001ca\u001a>Z\u0019|\nb6\u0006x:d{7{ \n\u0016tCv\u00159r#;\u0018~*Gv\u0015*\\GEt.+\u0015oa5\u0015c", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "Adc\u001ca\u001a>Z\u0019|\nb6\u0006x:d{7{ \n\u0016tCv\u00159r#;\u0018~*Gv\u0015*\\GEt.+\u0015oa5\u0015c", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc(", "=mB2_,<b\u001d\t\u0004N7{\u0005>em(\u0003@~&rNv", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "5dc\u001ca\u001a>Z\u0019|\nb6\u0006x:d{7{.\u0001\u001e\u0017E~iC}c6c\u000e)6i%2WL5x4%\u0015do9", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu", "Adc\u001ca\u001a>Z\u0019|\nb6\u0006x:d{7{.\u0001\u001e\u0017E~iC}c6c\u000e)6i%2WL5x4%\u0015do9", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&Sc(", "=mB2_,<b\u001d\t\u0004N7{\u0005>em7wM\u0010t\u0013Nv\u000b8t+", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001384U", "5dc\u001ca\u001a>Z\u0019|\nb6\u0006x:d{7{.\u0010\u0013$VM\nC}\"1W\u0004^8w&7L?Jo>'\u000fua@\u0007_:N", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bLu", "Adc\u001ca\u001a>Z\u0019|\nb6\u0006x:d{7{.\u0010\u0013$VM\nC}\"1W\u0004^8w&7L?Jo>'\u000fua@\u0007_:N", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>(Sc(", "Ad[2V;:P ~bZ7", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\ng! IY\u000bAv#DAy+\r", "5dc X3>Q(zwe,d\u0005:$\u00012\fI\u007f\u0013&Ky\u00176\u0004%<Yy.7", "u(;.a+K]\u001d}\u000e(*\u0007\u00106e}7\u007fJ\n`}Qx\u0010&s*5W\r\b3xk", "Ad[2V;:P ~\t", "", "5dc X3>Q(zwe,\u000bG0o\u00101z<\u0010\u001b!Pi\u001b<}%1g}", "u(;7T=:\u001d)\u000e~euc\r=tU", "AnaAX+", "5dc b9MS\u0018={h<\u0006\b+t\u00042\u0005:\u000e\u0017\u001eGk\u001c<", "u(I", "Adc b9MS\u0018={h<\u0006\b+t\u00042\u0005:\u000e\u0017\u001eGk\u001c<", "uY\u0018#", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f|", "AtQ@X3>Q(\u0003\u0005g:", "5dc h)LS ~xm0\u0007\u0012=", "Adc h)LS ~xm0\u0007\u0012=", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ}!Pqw9{%3he\u001cBCY\u001f", "AtQ@X3>Q(\u0003\u0005g:;\b/l\u007f*wO\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "<dgAF,ES\u0017\u000ev[3|l.", "<nc6Y@)]'\u0003\nb6\u0006f2a\t*{", "Ad[2V;:P ~^]", "<nc6Y@,S ~xm(y\u0010/C\u0003$\u0005B\u0001", "<nc6Y@,S ~xm0\u0007\u0012\u001fp~$\u000b@", ":`h<h;\u001c]#\fyb5x\u0018/s", "<df\u001db:Bb\u001d\t\u0004", ">qTC\\6Na\u0004\t\tb;\u0001\u00138", "7rBAT9M6\u0015\bye,", "/cYBf;FS\"\u000e", "7r8;G6NQ\u001cf\u0005],", "<nc6Y@,S ~xm0\u0007\u0012\u001fp~$\u000b@H \u001c$z\u001fF|", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\f1m\b0FK 8ZB?t0-\u0015v7\u001ekX\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\u000e\u000fiJ#jS;)\u0011uX\u0002NwJ\u001a\u0016\u00155h\u007fF`\u0019\u0011g\u0015|A'wJchUFFUp9l\fh,2/}\u0019", "<nc6Y@,S ~xm0\u0007\u0012\u001fp~$\u000b@` \u0016", "<nc6Y@,S ~xm0\u0007\u0012\u001fp~$\u000b@n\u0017\u001eGm\u001d\u0018},", "<nc6Y@,S ~xm0\u0007\u0012\u001fp~$\u000b@n&\u0013T~", "AsP?g\u0017Ha\u001d\u000e~h5", "<nc6Y@,S ~xm0\u0007\u0012\u001fp~$\u000b@n&\u0013T~ULs\u000e&km\f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\f1m\b0FK 8ZB?t0-\u0015v7\u001em_5M\u00041KKauZ\\zH\u001e ZWO5\u001d\u000eX=3rN@h\u0017,\\\u0011\u0005v\u0001\u0013\u0016\fDnzK }G\u0001\u0015sP-rO5^~WOTj*m\u001b5\u0012 +", "AnaA", "1n]AT0GS&evr6\r\u0018\ro\n5zD\n\u0013&G}", "AtQ@V9BP\u0019", "Ad[2V;:P ~", "CmbBU:<`\u001d{z", "\u0011n\\=T5B]\"", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SelectionRegistrarImpl implements SelectionRegistrar {
    private final MutableLongObjectMap<Selectable> _selectableMap;
    private final List<Selectable> _selectables;
    private Function1<? super Long, Unit> afterSelectableUnsubscribe;
    private AtomicLong incrementId;
    private Function1<? super Long, Unit> onPositionChangeCallback;
    private Function1<? super Long, Unit> onSelectableChangeCallback;
    private Function6<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super Offset, ? super Boolean, ? super SelectionAdjustment, Boolean> onSelectionUpdateCallback;
    private Function0<Unit> onSelectionUpdateEndCallback;
    private Function2<? super Boolean, ? super Long, Unit> onSelectionUpdateSelectAll;
    private Function4<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super SelectionAdjustment, Unit> onSelectionUpdateStartCallback;
    private boolean sorted;
    private final MutableState subselections$delegate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Saver<SelectionRegistrarImpl, Long> Saver = SaverKt.Saver(new Function2<SaverScope, SelectionRegistrarImpl, Long>() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        public final Long invoke(SaverScope saverScope, SelectionRegistrarImpl selectionRegistrarImpl) {
            return Long.valueOf(selectionRegistrarImpl.incrementId.get());
        }
    }, new Function1<Long, SelectionRegistrarImpl>() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ SelectionRegistrarImpl invoke(Long l2) {
            return invoke(l2.longValue());
        }

        public final SelectionRegistrarImpl invoke(long j2) {
            return new SelectionRegistrarImpl(j2, null);
        }
    });

    public /* synthetic */ SelectionRegistrarImpl(long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2);
    }

    private SelectionRegistrarImpl(long j2) {
        this._selectables = new ArrayList();
        this._selectableMap = LongObjectMapKt.mutableLongObjectMapOf();
        this.incrementId = new AtomicLong(j2);
        this.subselections$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(LongObjectMapKt.emptyLongObjectMap(), null, 2, null);
    }

    /* JADX INFO: compiled from: SelectionRegistrarImpl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012\u0006\u000enj?1JͣIDɟ\u0004*=j<9*[ҸuCIUj\u00190\ngZwi~J\t\u000eS\u0011\u0016\u0016'nZKǤ|c\u001aƁJDuDASڷA@"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\u0014GNR:k_nJw\u001ae\u0015\r\t\u0017\rd=-rN@t", "", "u(E", "!`e2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?MP\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\u0014GNR:k_nJw\u001ae\u0015$", "", "5dc T=>`", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005!FYy\u001d>m_\u001cIT;x\n", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<SelectionRegistrarImpl, Long> getSaver() {
            return SelectionRegistrarImpl.Saver;
        }
    }

    public SelectionRegistrarImpl() {
        this(1L);
    }

    public final boolean getSorted$foundation_release() {
        return this.sorted;
    }

    public final void setSorted$foundation_release(boolean z2) {
        this.sorted = z2;
    }

    public final List<Selectable> getSelectables$foundation_release() {
        return this._selectables;
    }

    public final LongObjectMap<Selectable> getSelectableMap$foundation_release() {
        return this._selectableMap;
    }

    public final Function1<Long, Unit> getOnPositionChangeCallback$foundation_release() {
        return this.onPositionChangeCallback;
    }

    public final void setOnPositionChangeCallback$foundation_release(Function1<? super Long, Unit> function1) {
        this.onPositionChangeCallback = function1;
    }

    public final Function4<Boolean, LayoutCoordinates, Offset, SelectionAdjustment, Unit> getOnSelectionUpdateStartCallback$foundation_release() {
        return this.onSelectionUpdateStartCallback;
    }

    public final void setOnSelectionUpdateStartCallback$foundation_release(Function4<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super SelectionAdjustment, Unit> function4) {
        this.onSelectionUpdateStartCallback = function4;
    }

    public final Function2<Boolean, Long, Unit> getOnSelectionUpdateSelectAll$foundation_release() {
        return this.onSelectionUpdateSelectAll;
    }

    public final void setOnSelectionUpdateSelectAll$foundation_release(Function2<? super Boolean, ? super Long, Unit> function2) {
        this.onSelectionUpdateSelectAll = function2;
    }

    public final Function6<Boolean, LayoutCoordinates, Offset, Offset, Boolean, SelectionAdjustment, Boolean> getOnSelectionUpdateCallback$foundation_release() {
        return this.onSelectionUpdateCallback;
    }

    public final void setOnSelectionUpdateCallback$foundation_release(Function6<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super Offset, ? super Boolean, ? super SelectionAdjustment, Boolean> function6) {
        this.onSelectionUpdateCallback = function6;
    }

    public final Function0<Unit> getOnSelectionUpdateEndCallback$foundation_release() {
        return this.onSelectionUpdateEndCallback;
    }

    public final void setOnSelectionUpdateEndCallback$foundation_release(Function0<Unit> function0) {
        this.onSelectionUpdateEndCallback = function0;
    }

    public final Function1<Long, Unit> getOnSelectableChangeCallback$foundation_release() {
        return this.onSelectableChangeCallback;
    }

    public final void setOnSelectableChangeCallback$foundation_release(Function1<? super Long, Unit> function1) {
        this.onSelectableChangeCallback = function1;
    }

    public final Function1<Long, Unit> getAfterSelectableUnsubscribe$foundation_release() {
        return this.afterSelectableUnsubscribe;
    }

    public final void setAfterSelectableUnsubscribe$foundation_release(Function1<? super Long, Unit> function1) {
        this.afterSelectableUnsubscribe = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public LongObjectMap<Selection> getSubselections() {
        return (LongObjectMap) this.subselections$delegate.getValue();
    }

    public void setSubselections(LongObjectMap<Selection> longObjectMap) {
        this.subselections$delegate.setValue(longObjectMap);
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public Selectable subscribe(Selectable selectable) {
        if (selectable.getSelectableId() == 0) {
            throw new IllegalArgumentException(("The selectable contains an invalid id: " + selectable.getSelectableId()).toString());
        }
        if (this._selectableMap.containsKey(selectable.getSelectableId())) {
            throw new IllegalArgumentException(("Another selectable with the id: " + selectable + ".selectableId has already subscribed.").toString());
        }
        this._selectableMap.set(selectable.getSelectableId(), selectable);
        this._selectables.add(selectable);
        this.sorted = false;
        return selectable;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void unsubscribe(Selectable selectable) {
        if (this._selectableMap.containsKey(selectable.getSelectableId())) {
            this._selectables.remove(selectable);
            this._selectableMap.remove(selectable.getSelectableId());
            Function1<? super Long, Unit> function1 = this.afterSelectableUnsubscribe;
            if (function1 != null) {
                function1.invoke(Long.valueOf(selectable.getSelectableId()));
            }
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public long nextSelectableId() {
        long andIncrement = this.incrementId.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = this.incrementId.getAndIncrement();
        }
        return andIncrement;
    }

    public final List<Selectable> sort(final LayoutCoordinates layoutCoordinates) {
        if (!this.sorted) {
            List<Selectable> list = this._selectables;
            final Function2<Selectable, Selectable, Integer> function2 = new Function2<Selectable, Selectable, Integer>() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl.sort.1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Integer invoke(Selectable selectable, Selectable selectable2) {
                    long jM3953getZeroF1C5BW0;
                    long jM3953getZeroF1C5BW02;
                    LayoutCoordinates layoutCoordinates2 = selectable.getLayoutCoordinates();
                    LayoutCoordinates layoutCoordinates3 = selectable2.getLayoutCoordinates();
                    if (layoutCoordinates2 != null) {
                        jM3953getZeroF1C5BW0 = layoutCoordinates.mo5523localPositionOfR5De75A(layoutCoordinates2, Offset.Companion.m3953getZeroF1C5BW0());
                    } else {
                        jM3953getZeroF1C5BW0 = Offset.Companion.m3953getZeroF1C5BW0();
                    }
                    if (layoutCoordinates3 != null) {
                        jM3953getZeroF1C5BW02 = layoutCoordinates.mo5523localPositionOfR5De75A(layoutCoordinates3, Offset.Companion.m3953getZeroF1C5BW0());
                    } else {
                        jM3953getZeroF1C5BW02 = Offset.Companion.m3953getZeroF1C5BW0();
                    }
                    return Integer.valueOf(Offset.m3938getYimpl(jM3953getZeroF1C5BW0) == Offset.m3938getYimpl(jM3953getZeroF1C5BW02) ? ComparisonsKt.compareValues(Float.valueOf(Offset.m3937getXimpl(jM3953getZeroF1C5BW0)), Float.valueOf(Offset.m3937getXimpl(jM3953getZeroF1C5BW02))) : ComparisonsKt.compareValues(Float.valueOf(Offset.m3938getYimpl(jM3953getZeroF1C5BW0)), Float.valueOf(Offset.m3938getYimpl(jM3953getZeroF1C5BW02))));
                }
            };
            CollectionsKt.sortWith(list, new Comparator() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return SelectionRegistrarImpl.sort$lambda$2(function2, obj, obj2);
                }
            });
            this.sorted = true;
        }
        return getSelectables$foundation_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sort$lambda$2(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifyPositionChange(long j2) {
        this.sorted = false;
        Function1<? super Long, Unit> function1 = this.onPositionChangeCallback;
        if (function1 != null) {
            function1.invoke(Long.valueOf(j2));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* JADX INFO: renamed from: notifySelectionUpdateStart-ubNVwUQ */
    public void mo1728notifySelectionUpdateStartubNVwUQ(LayoutCoordinates layoutCoordinates, long j2, SelectionAdjustment selectionAdjustment, boolean z2) {
        Function4<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super SelectionAdjustment, Unit> function4 = this.onSelectionUpdateStartCallback;
        if (function4 != null) {
            function4.invoke(Boolean.valueOf(z2), layoutCoordinates, Offset.m3926boximpl(j2), selectionAdjustment);
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectionUpdateSelectAll(long j2, boolean z2) {
        Function2<? super Boolean, ? super Long, Unit> function2 = this.onSelectionUpdateSelectAll;
        if (function2 != null) {
            function2.invoke(Boolean.valueOf(z2), Long.valueOf(j2));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* JADX INFO: renamed from: notifySelectionUpdate-njBpvok */
    public boolean mo1727notifySelectionUpdatenjBpvok(LayoutCoordinates layoutCoordinates, long j2, long j3, boolean z2, SelectionAdjustment selectionAdjustment, boolean z3) {
        Function6<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super Offset, ? super Boolean, ? super SelectionAdjustment, Boolean> function6 = this.onSelectionUpdateCallback;
        if (function6 != null) {
            return function6.invoke(Boolean.valueOf(z3), layoutCoordinates, Offset.m3926boximpl(j2), Offset.m3926boximpl(j3), Boolean.valueOf(z2), selectionAdjustment).booleanValue();
        }
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectionUpdateEnd() {
        Function0<Unit> function0 = this.onSelectionUpdateEndCallback;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectableChange(long j2) {
        Function1<? super Long, Unit> function1 = this.onSelectableChangeCallback;
        if (function1 != null) {
            function1.invoke(Long.valueOf(j2));
        }
    }
}
