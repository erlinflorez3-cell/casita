package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextUndoManager;
import androidx.compose.foundation.text.input.internal.EditingBuffer;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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
/* JADX INFO: compiled from: TextFieldState.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яď\u0014D57\u001eq\u007fR܀kŞ\fA\u0014<\u0013ǞJ~8,\u001aw\rfr9FDmH4U[*\u001dt\u00044*`,qY;]\u001a\u0004'\u0011Odgon`Z\u0013C\u0015\b\u001exx7QU~a\u001a\u000fHBw?9Nw=O`|6\u000b%:\"Fy\r\u0001 ,P\u0010\rzKK\u0012\u00128@\u0007:Z\rS\u0005\"\u0012\u001c>(\u0001$\\oNLHt]P/+\u0003oIV'u0\u0005M\u0013SZ,#Ǹ\u0012\u001eY?o5p\u0002\u0014\u001c\rfkE\t?\u007f=\u001dhU(;OyWDZ\u0018\u0014C.̠\u0011]\u0001*\u001d\"WӠ\u001c+9O{K~\u000f8{\t}%<2\u0011\u0016+V3E\u001a\u0015\u000eԧ7t\u0001Z\tc\u0010\u0013Z\u007f)\u0017f\u001b36K+g8-ϟň?\u0019TnD\u0013\u001bV;\u0001\u001dV\fX\u001c\u001a-\u001b\u00032\u00180\u001adK\u0004f\n\br\u001e\n~\u001f\u001a,\u001a/u=_\u0002\u0017.%cO[g/Qq\bHR'\u000f\u0005\u000f)\u001ai\u001bhNc\u0007\u0016e_9!h\u0007|\u0016{RdXZK]\u001ed\u0007,=AcϢ{<'iVʡU1-x\u0013u\nSd\u0017=g+\u0004\u0010m8\rpeWi\u0010o\u0011\u000f\u0014mH\u0013\u000b^fP\u0013$Z\u000bhRGV-(\t\fF^\fAFOs,4ZfG ČL\u0003$\u0007\bҒ\u000fރ^h\u0016E\u001dX2J\u0002$#>1ej3\bx\tK<|\u000f6=Ca5G[\u0004eמ8|)KE͟\u0006ěkLM\u00155\u001c\u0004\u001f\u0014 DO\u007fPwc!Y\u0017)`7]IZ>}Q{?W~\u000bF';\u0017[\u0018\fx>D`\u0019\u0019\u007fX%a\u000f^!cNdH\ro\u0016\u0013G\u0012\n;_L\u007f\u000b\u0003\bY\u0015˻٫\t\u001f$uIu0NM-qac\u0015@D=gy]\u0018%^}pb>t\u0014>\\i$DzSs1i;y]\r\u0014:$\u001b\u000frLxN B7@S2ɞ@ЬވZ8Sbw\u0004t_D\r\u001fW\"N[\u000e\f\u000eF_X)s\u0002\"9[%?z\u0004k{'c\\9w?\u000e\u0019:In@(\u0004 'np\u0011H\b\n\u0017dDq'ǖ;ɿՐ3+ѧ\f\u000f[Vo\u000f\u001e\u0005Pom\u001c/2p\u007fkZ\u001c_\u0011\\\u0005T;!\u0004!wƤ\u070f~ܓ7.\u000177\u0016{Xl1i?\u000fa=\u000b!y]\u000f7G9Wl9I<\u000f۞IԵ4şUΜ:\u0016Oӣ}mu!F.\u0015\u001fH/)Qq\u0013e\u0010>x[gri||\"hbNPF-\u0017Sɝ>\u009f\u0013\u000b!ۚC\u0005pKdN&:y^\u07be\u0016\u05edρ\u0006\u000bƔgJ3/\fT;]\u001ay\"H\u0014W\u0002]4LÙ$+\u001cv'\u007fe27\u001ck@R\u0016 \u001c9հ\u000b\u07b3T&\f˸bvx0</\u0007i\u0010[\u001a\u0013\r\u0003\"=ẁ)߿p\u0012JŮxz\u0010\u000ezy\u0007W\u0011.t]'#|[h\u001d7T}2!cr:?\u0001V\u0017O@jݼӀ\u001f߱\fr1\u0012U\u0017v\u0003\u0004Qa<9_\f,gb>\u0005ʷ}(\u0002x\nրpV\u0014CVS]Ţ\r:"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006Q;J\u0006'\u001d", "", "7mXA\\(EB\u0019\u0012\n", "", "7mXA\\(EA\u0019\u0006z\\;\u0001\u00138", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}`'\u0007!&Ns\u0017\u0006{6=#\u0002)Fm#7IJ\u0005J4\u001f\u0011xhHdm5\\\u00064WJ]6i:nJ\u001a\u0012gc\u0012\u001c", "7mXA\\(EB\u0019\u0012\nN5{\u0013\u0017a\t$}@\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-\u0005q`Cn_5Jx'T\"", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}`'| \u0016Ty\u0012;\nn3c\u0006+A{\u0016wNMKt3\u001a$lkBPr,a\u0006pKUY<k\u001ca='!J\u0017M5t\u0001b=&nQ\r\u0006\u000e6X\t?qJ\u0011'\u0016~nyQV\u001dPu\u001c? )iBif\t%KNp9q\u001c],fG\" !w\u0019(>\u0014\u001f", "1n\\=b:Bb\u001d\t\u0004", "5dc\u0010b4I]'\u0003\nb6\u0006P\u0017z\u000e;\u007f-\\", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006e%Hhj\u001c@o\u0016\u0004", "\nrTA \u0006\u0017", "", "7r41\\;B\\\u001b", "u(I", "Adc\u0012W0MW\"\u0001", "uY\u0018#", "7r41\\;B\\\u001b=y^3|\u000b+t\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", ";`X;5<?T\u0019\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PC+R\u0006+PN+<]SrJi", "5dc\u001aT0G0)\u007f{^9;\n9u\t'wO\u0005! A|\u000eCv!CY<\u001c@v =IR?u=,", "u(E", "5dc\u001aT0G0)\u007f{^9;\n9u\t'wO\u0005! A|\u000eCv!CY", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ58'$hnB\u0003ju.u+VPW.9bs>\u0014\u001f0", "Adc\u001aT0G0)\u007f{^9;\n9u\t'wO\u0005! A|\u000eCv!CY", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005o=-\u0015uj5\u000e-\fMz6KUP\tlSs=!g\u001e~", "<nc6Y@\"[\u0019e~l;|\u0012/r\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011p\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006Q;J\u0006'\u00065X;`S\u0007!\u001c\u0012A\u0012\\:\r\u000eYNy", "Ad[2V;B]\"", "5dc X3>Q(\u0003\u0005gs{\\\u00191\b\b[", "u(9", "BdgA", "", "5dc!X?M", "u(;7T=:\u001d z\u0004`uZ\f+rm(\bP\u0001 \u0015GE", "BdgAH5=]\u0001z\u0004Z.|\u0016", "5dc!X?MC\"}\u0005F(\u0006\u00051e\rf|J\u0011 \u0016C~\u0012F\u007f\u001fBY\u0005 3{\u0016", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ5#\u001e(wQB\u0006m\u0014J\u007f#IL[\u0002", "CmS<F;:b\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r+t3(\u0003w]H\u00079", "5dc\"a+HA(z\n^jx\u00128o\u000f$\u000bD\u000b %", "5dc\"a+HA(z\n^", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ5$'\u0014rOH\u0003r,$", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006A/J\u0004\u0015GX^,ePr\u0013", "D`[BX", "5dc#T3NSW\u007f\u0005n5{\u0005>i\n1uM\u0001\u001e\u0017C}\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ5#\u001e(wB=\u0007j+,y#T:N8lR{;\u0014g", "Adc#T3NS", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005Z41$Ie9\u000eb\nQr45LZ<\\[p=iUK", "D`[BXj=S ~|Z;|", "/cS\u001bb;BT-b\u0003^\u0013\u0001\u0017>e\t(\t", "", "<nc6Y@\"[\u0019e~l;|\u0012/r", "/cS\u001bb;BT-b\u0003^\u0013\u0001\u0017>e\t(\t~\u0002!'Pn\nKz/>S\u000b >m\u0012<M", "1n\\:\\;\u001eR\u001d\u000e", "<df#T3NS", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006@<Ow'T\"", "1n\\:\\;\u001eR\u001d\u000eVl\u001c\u000b\t<", "7m_Bg\u001bKO\"\r{h9\u0005\u0005>i\n1", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r\u001ft?.$Wn5\u0010q-X\u0004/C[R6e(", "@dbAT9M7!~^_\n\u0007\u0012>e\t7YC| \u0019G}", "CmS<5,AO*\u0003\u0005k", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Ps5M\u0001p6La;=VrD\u0013qY\u0012]\u001b\u0016\u0004c\u001e$q@H#\u00129\u001f", "3cXA", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "3cXA4:.a\u0019\f", "3cXA4:.a\u0019\f9_6\r\u0012.a\u000f,\u0006Iz$\u0017No\nJv", "3cXAJ0MV\u0002\thb+|h0f\u007f&\u000bN", "3cXAJ0MV\u0002\thb+|h0f\u007f&\u000bN?\u0018!Wx\r8\u0006)?bw-7t\u0016*[C", "4h]6f/\u001eR\u001d\u000e~g.", "@dR<e+\u001eR\u001d\u000e[h9l\u0012.o", ">qTC\\6Na\nz\u0002n,", ">nbAI(Ec\u0019", "1gP;Z,L", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006@<Ow'T\u000b,/X[t=z\u0016h\u001d$", "@d\\<i,'](\u0003{r\u0010\u0005\t\u0016i\u000e7{I\u0001$", "@d\\<i,'](\u0003{r\u0010\u0005\t\u0016i\u000e7{I\u0001$UHy\u001eEu!D]\b)1z\u00165M?Ik", "AsP?g\f=W(", "Ax]0@(B\\u\u000f{_,\nw9T\u007f0\u0007J\u000e\u0013$[L\u001e=w%B", "BdgA90>Z\u0018[\u000b_-|\u0016", "<df\u0010b4I]'\u0003\nb6\u0006", "BdgA6/:\\\u001b~y", "Ad[2V;B]\"\\}Z5~\t.", "Ax]0@(B\\u\u000f{_,\nw9T\u007f0\u0007J\u000e\u0013$[L\u001e=w%B!l\u000e\u0005Z\u001e}S\u0002<uD'\u0014dp=\u0011l&[v.GH\\,", "BnBAe0GU", "CoS.g,/O \u000fz:5{q9t\u0004)\u0010'\u0005%&Gx\u000eI\u0005", "=kS#T3NS", "\u001cnc6Y@\"[\u0019e~l;|\u0012/r", "!`e2e", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextFieldState {
    public static final int $stable = 0;
    private final MutableState isEditing$delegate;
    private EditingBuffer mainBuffer;
    private final MutableVector<NotifyImeListener> notifyImeListeners;
    private final TextUndoManager textUndoManager;
    private final UndoState undoState;
    private final MutableState value$delegate;

    /* JADX INFO: compiled from: TextFieldState.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\u0015\"4\u0012}\u0007njG9L͜NíɠR@ş\u001c{b#$B\u007fCSUH~R\r]P\u007fg\u001dM\u000b\u000fQ\u0013\u001e\u0016'm\\Mc}u\u0012=8\t\u0014ѹ2ݹڑ==hv<$N1ś<\u0001ۏ\u0005\u0019"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006Q;J\u0006'\u00065X;`S\u0007!\u001c\u0012A\u0012\\:\r\u000eYNy", "", "=m25T5@S", "", "=kS#T3NS", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006A/J\u0004\u0015GX^,ePr\u0013", "<df#T3NS", "@dbAT9M7!~^_\n\u0007\u0012>e\t7YC| \u0019G}", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface NotifyImeListener {
        void onChange(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z2);
    }

    /* JADX INFO: compiled from: TextFieldState.kt */
    /* JADX INFO: loaded from: classes.dex */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextFieldEditUndoBehavior.values().length];
            try {
                iArr[TextFieldEditUndoBehavior.ClearHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldEditUndoBehavior.MergeIfPossible.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextFieldEditUndoBehavior.NeverMerge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ TextFieldState(String str, long j2, TextUndoManager textUndoManager, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j2, textUndoManager);
    }

    public /* synthetic */ TextFieldState(String str, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j2);
    }

    public static /* synthetic */ void getMainBuffer$foundation_release$annotations() {
    }

    public static /* synthetic */ void getUndoState$annotations() {
    }

    private TextFieldState(String str, long j2, TextUndoManager textUndoManager) {
        this.textUndoManager = textUndoManager;
        this.mainBuffer = new EditingBuffer(str, TextRangeKt.m6129coerceIn8ffj60Q(j2, 0, str.length()), (DefaultConstructorMarker) null);
        this.isEditing$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldCharSequence(str, j2, null, null, 12, null), null, 2, null);
        this.undoState = new UndoState(this);
        this.notifyImeListeners = new MutableVector<>(new NotifyImeListener[16], 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextFieldState(String str, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        str = (1 & i2) != 0 ? "" : str;
        this(str, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? TextRangeKt.TextRange(str.length()) : j2, (DefaultConstructorMarker) null);
    }

    private TextFieldState(String str, long j2) {
        this(str, j2, new TextUndoManager(null, null, 3, null), (DefaultConstructorMarker) null);
    }

    public final TextUndoManager getTextUndoManager$foundation_release() {
        return this.textUndoManager;
    }

    public final EditingBuffer getMainBuffer$foundation_release() {
        return this.mainBuffer;
    }

    public final void setMainBuffer$foundation_release(EditingBuffer editingBuffer) {
        this.mainBuffer = editingBuffer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean isEditing() {
        return ((Boolean) this.isEditing$delegate.getValue()).booleanValue();
    }

    private final void setEditing(boolean z2) {
        this.isEditing$delegate.setValue(Boolean.valueOf(z2));
    }

    private final void setValue(TextFieldCharSequence textFieldCharSequence) {
        this.value$delegate.setValue(textFieldCharSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextFieldCharSequence getValue$foundation_release() {
        return (TextFieldCharSequence) this.value$delegate.getValue();
    }

    public final CharSequence getText() {
        return getValue$foundation_release().getText();
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE */
    public final long m1448getSelectiond9O1mEE() {
        return getValue$foundation_release().m1446getSelectiond9O1mEE();
    }

    /* JADX INFO: renamed from: getComposition-MzsxiRA */
    public final TextRange m1447getCompositionMzsxiRA() {
        return getValue$foundation_release().m1445getCompositionMzsxiRA();
    }

    public final void edit(Function1<? super TextFieldBuffer, Unit> function1) {
        TextFieldBuffer textFieldBufferStartEdit = startEdit();
        try {
            function1.invoke(textFieldBufferStartEdit);
            commitEdit(textFieldBufferStartEdit);
        } finally {
            InlineMarker.finallyStart(1);
            finishEditing();
            InlineMarker.finallyEnd(1);
        }
    }

    public String toString() {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            return "TextFieldState(selection=" + ((Object) TextRange.m6126toStringimpl(m1448getSelectiond9O1mEE())) + ", text=\"" + ((Object) getText()) + "\")";
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
        }
    }

    public final UndoState getUndoState() {
        return this.undoState;
    }

    public final TextFieldBuffer startEdit() {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (isEditing()) {
                throw new IllegalStateException("TextFieldState does not support concurrent or nested editing.".toString());
            }
            setEditing(true);
            return new TextFieldBuffer(getValue$foundation_release(), null, null, null, 14, null);
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
        }
    }

    public final void commitEdit(TextFieldBuffer textFieldBuffer) {
        boolean z2 = textFieldBuffer.getChanges().getChangeCount() > 0;
        boolean zM6116equalsimpl0 = true ^ TextRange.m6116equalsimpl0(textFieldBuffer.m1440getSelectiond9O1mEE(), this.mainBuffer.m1480getSelectiond9O1mEE());
        if (z2) {
            this.textUndoManager.clearHistory();
        }
        m1449syncMainBufferToTemporaryBufferTS3Rm5k$foundation_release(textFieldBuffer, null, z2, zM6116equalsimpl0);
    }

    public final void finishEditing() {
        setEditing(false);
    }

    public static /* synthetic */ void editAsUser$foundation_release$default(TextFieldState textFieldState, InputTransformation inputTransformation, boolean z2, TextFieldEditUndoBehavior textFieldEditUndoBehavior, Function1 function1, int i2, Object obj) {
        if ((2 & i2) != 0) {
            z2 = true;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        textFieldState.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        function1.invoke(textFieldState.getMainBuffer$foundation_release());
        textFieldState.commitEditAsUser(inputTransformation, z2, textFieldEditUndoBehavior);
    }

    public final void editAsUser$foundation_release(InputTransformation inputTransformation, boolean z2, TextFieldEditUndoBehavior textFieldEditUndoBehavior, Function1<? super EditingBuffer, Unit> function1) {
        getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        function1.invoke(getMainBuffer$foundation_release());
        commitEditAsUser(inputTransformation, z2, textFieldEditUndoBehavior);
    }

    public final void editWithNoSideEffects$foundation_release(Function1<? super EditingBuffer, Unit> function1) {
        getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        function1.invoke(getMainBuffer$foundation_release());
        updateValueAndNotifyListeners(getValue$foundation_release(), new TextFieldCharSequence(getMainBuffer$foundation_release().toString(), getMainBuffer$foundation_release().m1480getSelectiond9O1mEE(), getMainBuffer$foundation_release().m1479getCompositionMzsxiRA(), null, 8, null), true);
    }

    static /* synthetic */ void commitEditAsUser$default(TextFieldState textFieldState, InputTransformation inputTransformation, boolean z2, TextFieldEditUndoBehavior textFieldEditUndoBehavior, int i2, Object obj) {
        if ((i2 + 2) - (2 | i2) != 0) {
            z2 = true;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        textFieldState.commitEditAsUser(inputTransformation, z2, textFieldEditUndoBehavior);
    }

    public final void commitEditAsUser(InputTransformation inputTransformation, boolean z2, TextFieldEditUndoBehavior textFieldEditUndoBehavior) {
        TextFieldCharSequence value$foundation_release = getValue$foundation_release();
        if (this.mainBuffer.getChangeTracker().getChangeCount() == 0 && TextRange.m6116equalsimpl0(value$foundation_release.m1446getSelectiond9O1mEE(), this.mainBuffer.m1480getSelectiond9O1mEE())) {
            if (Intrinsics.areEqual(value$foundation_release.m1445getCompositionMzsxiRA(), this.mainBuffer.m1479getCompositionMzsxiRA()) && Intrinsics.areEqual(value$foundation_release.getHighlight(), this.mainBuffer.getHighlight())) {
                return;
            }
            updateValueAndNotifyListeners(getValue$foundation_release(), new TextFieldCharSequence(this.mainBuffer.toString(), this.mainBuffer.m1480getSelectiond9O1mEE(), this.mainBuffer.m1479getCompositionMzsxiRA(), this.mainBuffer.getHighlight(), null), z2);
            return;
        }
        TextFieldCharSequence textFieldCharSequence = new TextFieldCharSequence(this.mainBuffer.toString(), this.mainBuffer.m1480getSelectiond9O1mEE(), this.mainBuffer.m1479getCompositionMzsxiRA(), this.mainBuffer.getHighlight(), null);
        if (inputTransformation == null) {
            updateValueAndNotifyListeners(value$foundation_release, textFieldCharSequence, z2);
            recordEditForUndo(value$foundation_release, textFieldCharSequence, this.mainBuffer.getChangeTracker(), textFieldEditUndoBehavior);
            return;
        }
        TextFieldBuffer textFieldBuffer = new TextFieldBuffer(textFieldCharSequence, this.mainBuffer.getChangeTracker(), value$foundation_release, null, 8, null);
        inputTransformation.transformInput(textFieldBuffer);
        boolean zContentEquals = StringsKt.contentEquals(textFieldBuffer.asCharSequence(), textFieldCharSequence);
        boolean z3 = !zContentEquals;
        boolean zM6116equalsimpl0 = TextRange.m6116equalsimpl0(textFieldBuffer.m1440getSelectiond9O1mEE(), textFieldCharSequence.m1446getSelectiond9O1mEE());
        boolean z4 = !zM6116equalsimpl0;
        if (!zContentEquals || !zM6116equalsimpl0) {
            m1449syncMainBufferToTemporaryBufferTS3Rm5k$foundation_release(textFieldBuffer, null, z3, z4);
        } else {
            updateValueAndNotifyListeners(value$foundation_release, TextFieldBuffer.m1438toTextFieldCharSequenceudt6zUU$foundation_release$default(textFieldBuffer, 0L, textFieldCharSequence.m1445getCompositionMzsxiRA(), 1, null), z2);
        }
        recordEditForUndo(value$foundation_release, getValue$foundation_release(), textFieldBuffer.getChanges(), textFieldEditUndoBehavior);
    }

    public final void updateValueAndNotifyListeners(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z2) {
        setValue(textFieldCharSequence2);
        finishEditing();
        MutableVector<NotifyImeListener> mutableVector = this.notifyImeListeners;
        int size = mutableVector.getSize();
        if (size > 0) {
            NotifyImeListener[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                content[i2].onChange(textFieldCharSequence, textFieldCharSequence2, z2);
                i2++;
            } while (i2 < size);
        }
    }

    private final void recordEditForUndo(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, TextFieldBuffer.ChangeList changeList, TextFieldEditUndoBehavior textFieldEditUndoBehavior) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[textFieldEditUndoBehavior.ordinal()];
        if (i2 == 1) {
            this.textUndoManager.clearHistory();
        } else if (i2 == 2) {
            TextUndoManagerKt.recordChanges(this.textUndoManager, textFieldCharSequence, textFieldCharSequence2, changeList, true);
        } else {
            if (i2 != 3) {
                return;
            }
            TextUndoManagerKt.recordChanges(this.textUndoManager, textFieldCharSequence, textFieldCharSequence2, changeList, false);
        }
    }

    public final void addNotifyImeListener$foundation_release(NotifyImeListener notifyImeListener) {
        this.notifyImeListeners.add(notifyImeListener);
    }

    public final void removeNotifyImeListener$foundation_release(NotifyImeListener notifyImeListener) {
        this.notifyImeListeners.remove(notifyImeListener);
    }

    /* JADX INFO: renamed from: syncMainBufferToTemporaryBuffer-TS3Rm5k$foundation_release */
    public final void m1449syncMainBufferToTemporaryBufferTS3Rm5k$foundation_release(TextFieldBuffer textFieldBuffer, TextRange textRange, boolean z2, boolean z3) {
        String string = this.mainBuffer.toString();
        TextFieldCharSequence textFieldCharSequence = new TextFieldCharSequence(string, this.mainBuffer.m1480getSelectiond9O1mEE(), this.mainBuffer.m1479getCompositionMzsxiRA(), null, 8, null);
        boolean zAreEqual = Intrinsics.areEqual(textRange, this.mainBuffer.m1479getCompositionMzsxiRA());
        if (z2) {
            this.mainBuffer = new EditingBuffer(textFieldBuffer.toString(), textFieldBuffer.m1440getSelectiond9O1mEE(), (DefaultConstructorMarker) null);
        } else if (z3) {
            this.mainBuffer.setSelection(TextRange.m6123getStartimpl(textFieldBuffer.m1440getSelectiond9O1mEE()), TextRange.m6118getEndimpl(textFieldBuffer.m1440getSelectiond9O1mEE()));
        }
        if (textRange == null || TextRange.m6117getCollapsedimpl(textRange.m6127unboximpl())) {
            this.mainBuffer.commitComposition();
        } else {
            this.mainBuffer.setComposition(TextRange.m6121getMinimpl(textRange.m6127unboximpl()), TextRange.m6120getMaximpl(textRange.m6127unboximpl()));
        }
        if (z2 || (!z3 && !zAreEqual)) {
            this.mainBuffer.commitComposition();
        }
        if (z2) {
            string = textFieldBuffer.toString();
        }
        updateValueAndNotifyListeners(textFieldCharSequence, new TextFieldCharSequence(string, this.mainBuffer.m1480getSelectiond9O1mEE(), this.mainBuffer.m1479getCompositionMzsxiRA(), null, 8, null), true);
    }

    /* JADX INFO: compiled from: TextFieldState.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u0016DLc\u000b\u0004I\u0006>é6B\u0005$4\u0012\u000e\u0007nʑ?ԌD{߉^^c,\u001fk*44]4qq<\u0004\u0019>'\u000fOɁkg|L#\u001bQ\u0012\u001e\u0018\u000fiZI\u0006|k\u0016'2pp\u0006G\u0016\u0004K>xvL\u0004N3J8(\u000b1\u001e8L(v)C\u0012 ܞ4G"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006Q;J\u0006'\u0006:J=\\_H", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?MP\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006Q;J\u0006'\u001d", "", "u(E", "@dbAb9>", "D`[BX", "A`e2", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?MP)i>)\u0015>", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Saver implements androidx.compose.runtime.saveable.Saver<TextFieldState, Object> {
        public static final int $stable = 0;
        public static final Saver INSTANCE = new Saver();

        private Saver() {
        }

        @Override // androidx.compose.runtime.saveable.Saver
        public Object save(SaverScope saverScope, TextFieldState textFieldState) {
            return CollectionsKt.listOf(textFieldState.getText().toString(), Integer.valueOf(TextRange.m6123getStartimpl(textFieldState.m1448getSelectiond9O1mEE())), Integer.valueOf(TextRange.m6118getEndimpl(textFieldState.m1448getSelectiond9O1mEE())), TextUndoManager.Companion.Saver.INSTANCE.save(saverScope, textFieldState.getTextUndoManager$foundation_release()));
        }

        @Override // androidx.compose.runtime.saveable.Saver
        public TextFieldState restore(Object obj) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Object obj3 = list.get(1);
            Object obj4 = list.get(2);
            Object obj5 = list.get(3);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
            long jTextRange = TextRangeKt.TextRange(iIntValue, ((Integer) obj4).intValue());
            TextUndoManager.Companion.Saver saver = TextUndoManager.Companion.Saver.INSTANCE;
            Intrinsics.checkNotNull(obj5);
            TextUndoManager textUndoManagerRestore = saver.restore(obj5);
            Intrinsics.checkNotNull(textUndoManagerRestore);
            return new TextFieldState((String) obj2, jTextRange, textUndoManagerRestore, (DefaultConstructorMarker) null);
        }
    }
}
