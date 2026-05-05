package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SlotReader;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.Stack;
import androidx.compose.runtime.internal.IntRef;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
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
/* JADX INFO: compiled from: ComposerChangeListWriter.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĵ\u0014D57\u001eq\u007fR܀kŞ\fA\u001c0\u0013ǞJ~8,\u001aw\rjr9>MmH4U[*\u001dq\u00044*^,qY;]\u001a\u0004\"\u0011OdgonP]\u0013C%\u0006\u001exp,QU\u0007]\u001aƁ:B\u0006?;Mu>A`\u0003T\rړ:\"Ny\r\u0001 *P\u0010\rzKŷ\u0014\u0012F@xíZ\rc\u0005\"\u0012\fB(\u00014\\oNLHt]@;+\u0003\u007fBVϋg0\u0013M\u0015FZ<\u0015vw\u001e3@=5\u001d%i\u0003\u000fRaC\u000b?\b=\rh-/3I\nW>X\u0016\u0014\u001d+U\u0013cö<ؘ#ī_<'YN\u001cKֶ\rh\u000b\u000b\u007f\u001b<\u001c\u000e4(X2;\u001c~\b<6ϢvSNTJtP!\u0013ad9U\u0004ANQ\u001b\u0015u\u0012A'sO}\u001b\fL\"I\u000b/\u0002l\u000e\u000f7K`\u0006xIYPAXP Xkl2\u0019\u0013\u00068-HG.YD7<B=7\n[S'y.`F}u3\u000e\u0019Ww\u0001`@P\u001eF;89$Zr\u00165o^\u0007p,?~dX\u00151 \u0013N~@P/Y(N}\u000b\u001an[\u0013\"%]\u0011g]|\u000f&Wg\u0003{U_\u001a(a\u0001\u0019DOJ\u001a\u001ddvDc\f\t\u00168$BH\u00192&4tR\u001aMJ? U|0?Tt\u0015v%fFO9!_\t\u000bX\u0003bp<\u0003\u0018F=\u001d\u000f\u000ftp\u001e\n)M:<x\"[Q\u00029'fm\"\u0017DE'\u0015@\f\u007fu\n\u0015UZ/.u\u0004\u001eP\u001a(\\i/k7U~q8\u0010p]L!\b\u0018MZ+\tA\u0012\u000fi\u000bv\u007f\u00160\t,\u000f\rzSb]:v\ruS\u0010j\u007f\b\u000b^|]b\u00035$RW:\u001bYjph\u0001\u0013B6%/\u0014R\u0001C]['K^@0=\\y]\u0018\u0012^}p2>t\u0014(\\g$ zQ\fzk<W#\u0017>Pn5\u000fP\u0014\u0003w6d98\u001b\u007f`A\u0013\u0001\u001fF[XG}\u0015)\\\u0013~%s<)n,3v{8C[}B\u0001s)\u001f}kg\u001c}{`\u0019|'\n9\far lU \u0005g+\u0015>W\f\u0018dckf\u0013\u000f!$b<\u0005\u0014\u0019\u0017li42+\u0004T2'\u0017`R<?dblx\u000bx\u0011\u000bn\u001bx!X#E\u000f{$\u0007\fI\u0005\u001ch\u001b/,8\u000f+5\tI\r\u0016~/59\u001dl9IJ\t\u0007\u0011Ek\u001da\u0002d\u000e\u000e)6\n}fP\u0018+?r\u001c)ki\u0011\u000e\u0007`b\u0019\u0006|N\u0013\u0007Bj`\u001f:)-\u000bC\u000e\u0005\u0010\u001df1O!\u0012)-\u0015^\u0006\u0014[\u001a/9t/\r\f\u000bA^\u001b[\u0010{-\u0006_xr?{\u0006uk\u0002\u0016<8'2\u0005Q`e\u001d~\n\f+\u0001\u0016:\u001apa!\u0013~BL2XU\u000b\n\\*~k\u0010\u0015\u001a\u0013\r{\u001c{/z?+\u001bhrOv'\"c\u001b\u0013\u001fY\u0019f~1\u0005+79^\u0002!'{PC\\h_)SN>Y\u0004\"{>\u001fd*+=\u001e7{h\u001f\u000e\u007f_\u001bjGkXqa4`n\u0016\u001f(\u0006L.b\u0011-;\u0005o\u0007h\u0017F\u0005B\u00060'|6O\r\fW6-\tVJ)\u0019DH\u0003\u001e\u0013Qe\u0006g_\u001b5x\u00072g\u00122/ j?IYb\u000f}x\u000f\u00111J+\u0013\u000e\u001aZ\t!\"\u00182;kl?0&\b#\u001eh\u0011IcEff80\u001f~)/\tHhLj\f4;\u007fUq\u001f\u001fs-:\u001cn5\u0018}'_G=*/\u001f!\u000fEƗ?`Zu=q1%?s)|~;k+\u0016g5\u0003\u001a|Z\u0001]c\u001d\u0004q.Y5\f\u0014\nWP\u007f8AR\u001cԹy#\u0006>˜L*mV\tl\u0002R\u001c&XX\u001fJ1l\u0005z\n\tZhHwrLy4o\u000b\\'R:B-\u001b)uSvH#F#DB6W#70/|>q\"D9G\u000bM]_\u000eF!j\u001c@BcFyub\b\u0017LГ\u0018\u001dyxݘli_>ZB\u0017\u001bz\u00107bb\u0010`K:U8=˶<-\u0011[Cz\u000bn\u0012zے:̚\u0010\u0017\u000eߧFJ\u001d\u0007\fP\u0001\u0017\u0019:U{\u0012S V\u0014!K\u00122ܬ\bɚkjOʤ&\nfFQ39w!նAǙ`\u0011]ؽcf1 \u000evK0McL(zd\u0014\u001d]dv \u001bѐPڍq08ߣ!\u000bhTu\u0001J/\u0014ո!\u05ca\u00032jۙ,p\u001f=OW\u001db,ƭ9ӟ\u0006\u0003\u0018Ýi\"\u00191k9`-*QжB\u007f ^Oi\u000by\u001a$\u0011vb)?\nO1WJ\u001bU\u0014UoَKך\u0010 /ՁV\u001f2y\u007f\u0013\u0018\u001exά\u000fԸ:V1گ\u001ck\u001f~Zj=\u0014+L\u0005ۂ:˴\nA\u001e\u0013h6CV0L:J\t\tu_Aɻ6ڿsf|ɾ\u001eQ9\u00131>_{g˱[ȓ\u0018nYƁ)J%u>@A!pܱ(ɢ\u007fH1ܦgaq\u000e\u0003s\u0003pgס@ɬ4d\u0002۸ڹhحb"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\fWKFuB\u001e\"Fd5\u0010e,5z5V>[0kR\u007f\u0013", "", "1n\\=b:>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g}-\u001bu!5#", "1gP;Z,%W'\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\fP?Dm4\u0005\u0019vp\u000f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DQ\u001e9T\u0019\"g=\u001d\"re8\u001a-*X~2QZNuib{L\u0018\u001aZWL.\t\u000e[A+rRFhe/E\u000b=hg\u0010$\u001d\u000b.a", "5dc\u0010[(GU\u0019e~l;", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006t(1b\u007f >q$=\u0017!>g= \u0015OeG\u00169", "Adc\u0010[(GU\u0019e~l;", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW:y!>[}';{%w+F7t6\u001e{loH\\'\u001d", "7l_9\\*Bb\u0006\t\u0005m\u001a\f\u0005<t", "", "5dc\u0016`7EW\u0017\u0003\nK6\u0007\u0018\u001dt{5\u000b", "u(I", "Adc\u0016`7EW\u0017\u0003\nK6\u0007\u0018\u001dt{5\u000b", "uY\u0018#", ";ne266N\\(", "", ";ne299H[", ";ne2G6", ">`bAC(KS\"\u000e", "5dc\u001dT:M>\u0015\fzg;", ">d]1\\5@2#\u0011\u0004G6{\t=", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr#;/", ">d]1\\5@C$\r", "@dP1X9", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014\"Yy\u001f7zk", "5dc\u001fX(=S&", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006d,?hj 3l\u0016;#", "@d\\<i,\u001f`#\u0007", "AsP?g,=5&\t\u000bi", "AsP?g,=5&\t\u000bi:", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9qE\u0006\u0013DU{&\r", "EqXAX9L@\u0019zy^9[\t6t{", "/o_2a+/O \u000fz", "", "/mR5b9", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iEt(?fS", "D`[BX", "1n_FA6=S'm\u0005G,\u000fd8c\u00032\t'\u000b\u0015\u0013Vs\u0018E", "<nS2f", "", "3eU2V;Bd\u0019g\u0005],`\u0012.e\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u0012E\u0006%Bby'\u0001Q\u001f=:C<A", "1n_FF3Hb\bzwe,k\u0013\u000bn}+\u0006Mg!\u0015C~\u0012F\u007f", "@db<_=>R\u0007\u000evm,", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uF\b!2`}}Av%.VR)z0-\u0015>", ">`a2a;\u001c]\"\u000ezq;", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\fWLJkG-j", "4q^:", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uF\b!2`}}Av%.VR)z0-\u0015Ua:\u0007p,Wt'\u001d", "Bn", "2dP0g0OO(~Xn9\n\t8ta5\u0006P\f", "2dc2e4B\\\u0019f\u0005o(y\u0010/C\n1\u000b@\n&\u007fQn\u000e \u007f$5l", "3eU2V;Bd\u0019g\u0005],`\u0012.e\u0013\u0012\fO", "3mS\u0010b4I]'\u0003\nb6\u0006v-o\u000b(", "/bc6b5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u0004", "1n\\=b:Bb\u001d\t\u0004", "3mS\u0010h9KS\"\u000e\\k6\r\u0014", "3mS\u001ab=:P ~Xh5\f\t8tj/w>\u0001\u001f\u0017P~", "3mS\u001bb+>;#\u0010zf,\u0006\u0018", "3mS\u001bb+>;#\u0010zf,\u0006\u0018\u000bn~\u0007{G\u0001&\u00170y\r<", "<nS2<5=S,", "5q^Bc", "3mS\u001fb6M", "3mbBe, `#\u000f\u0006L;x\u0016>e~", "3mbBe,+]#\u000ehm(\n\u0018/d", "4h]._0SSv\t\u0003i6\u000b\r>i\n1", "7mR9h+>=$~\bZ;\u0001\u00138sc1", "=sW2e", "7mb2e;,Z#\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014$Uz'7C", "4hgBc:", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u000fQVKv\u001b\"#w7", ";ne26<K`\u0019\b\n@9\u0007\u0019:", "=eU@X;", ";ne276P\\", "<nS2", ";ne2A6=S", "1nd;g", ";ne2E,:R\u0019\fg^3x\u00183v\u007f\u0017\u0006", ":nR.g0H\\", ";ne2E,:R\u0019\fih\by\u00179l\u00107{", ";ne2H7", ">tb547IZ\u001d~\bH7|\u0016+t\u00042\u0005+\u000e\u0017\u0013Ol\u0015<", ">tb5C,GR\u001d\b|N7\u000bd8d^2\u000eI\u000f", ">tb5F3Hbx}~m0\u0006\u000b\u0019p\u007f5wO\u0005! 2|\u000e8~\"<Y", ">tb5F3Hb\bzwe,f\u0014/r{7\u007fJ\n\u0002$Gk\u00169}%", "CrT\u001dT9>\\(l\u0002h;", "@dP9\\A>;#\u0010zG6{\t", "@dP9\\A><#}zF6\u000e\t7e\t7eK\u0001$\u0013Vs\u0018E\u0005", "@dP9\\A>=$~\bZ;\u0001\u00138L\n&wO\u0005! ", "4na\u001dT9>\\(", "@dP9\\A>@\u0019\u0007\u0005o,e\u0013.e", "@dR<e+,Z#\u000eZ]0\f\r8g", "@d[2T:>;#\u0010v[3|f9n\u000f(\u0005O", "@d[2T:>;#\u0010v[3|j<o\u00103WO^'$To\u0017K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF\u007f4Bc\u0005'7ls8UNEy8-\u0019rj\u000f", "@dU2e,GQ\u0019", "@d\\2`)>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-!j$.ZT;x\n", "@d\\<i,\u001cc&\fzg;^\u00169u\u000b", "@d\\<i,']\u0018~", "@db2g\u001aE](\r", "@db2g\u001bKO\"\r~^5\fv>a\u000f(", "AhS28-?S\u0017\u000e", "3eU2V;", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "AjX=G6\u001e\\\u0018h{<<\n\u0016/n\u000f\n\tJ\u0011\"", "BqX:I(Ec\u0019\r", "CoS.g,\u001a\\\u0017\u0002\u0005k,{y+l\u0010(", "5q^Bc\u001aE](b\u0004],\u0010", "CoS.g,\u001ac,]vm(", "2`c.", "CoS.g,']\u0018~", "\"", "$", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00100\u0002\u0012g", "CoS.g,/O \u000fz", "CrT\u001bb+>", "Ehc56/:\\\u001b~ab:\f", "<df\u0010[(GU\u0019e~l;", "Ehc5b<M7!\n\u0002b*\u0001\u0018\u001co\n7iO|$&", "\u0011n\\=T5B]\"", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ComposerChangeListWriter {
    private static final int invalidGroupLocation = -2;
    private ChangeList changeList;
    private final ComposerImpl composer;
    private int moveCount;
    private int pendingUps;
    private boolean startedGroup;
    private int writersReaderDelta;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final IntStack startedGroups = new IntStack();
    private boolean implicitRootStart = true;
    private Stack<Object> pendingDownNodes = new Stack<>();
    private int removeFrom = -1;
    private int moveFrom = -1;
    private int moveTo = -1;

    public ComposerChangeListWriter(ComposerImpl composerImpl, ChangeList changeList) {
        this.composer = composerImpl;
        this.changeList = changeList;
    }

    public final ChangeList getChangeList() {
        return this.changeList;
    }

    public final void setChangeList(ChangeList changeList) {
        this.changeList = changeList;
    }

    private final SlotReader getReader() {
        return this.composer.getReader$runtime_release();
    }

    public final boolean getImplicitRootStart() {
        return this.implicitRootStart;
    }

    public final void setImplicitRootStart(boolean z2) {
        this.implicitRootStart = z2;
    }

    private final void pushApplierOperationPreamble() {
        pushPendingUpsAndDowns();
    }

    private final void pushSlotEditingOperationPreamble() {
        realizeOperationLocation$default(this, false, 1, null);
        recordSlotEditing();
    }

    static /* synthetic */ void pushSlotTableOperationPreamble$default(ComposerChangeListWriter composerChangeListWriter, boolean z2, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            z2 = false;
        }
        composerChangeListWriter.pushSlotTableOperationPreamble(z2);
    }

    private final void pushSlotTableOperationPreamble(boolean z2) {
        realizeOperationLocation(z2);
    }

    public final void moveReaderRelativeTo(int i2) {
        this.writersReaderDelta += i2 - getReader().getCurrentGroup();
    }

    public final void moveReaderToAbsolute(int i2) {
        this.writersReaderDelta = i2;
    }

    public final void recordSlotEditing() {
        SlotReader reader;
        int parent;
        if (getReader().getSize() <= 0 || this.startedGroups.peekOr(-2) == (parent = (reader = getReader()).getParent())) {
            return;
        }
        ensureRootStarted();
        if (parent > 0) {
            Anchor anchor = reader.anchor(parent);
            this.startedGroups.push(parent);
            ensureGroupStarted(anchor);
        }
    }

    private final void ensureRootStarted() {
        if (this.startedGroup || !this.implicitRootStart) {
            return;
        }
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushEnsureRootStarted();
        this.startedGroup = true;
    }

    private final void ensureGroupStarted(Anchor anchor) {
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushEnsureGroupStarted(anchor);
        this.startedGroup = true;
    }

    static /* synthetic */ void realizeOperationLocation$default(ComposerChangeListWriter composerChangeListWriter, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            z2 = false;
        }
        composerChangeListWriter.realizeOperationLocation(z2);
    }

    private final void realizeOperationLocation(boolean z2) {
        int parent = z2 ? getReader().getParent() : getReader().getCurrentGroup();
        int i2 = parent - this.writersReaderDelta;
        if (!(i2 >= 0)) {
            ComposerKt.composeImmediateRuntimeError("Tried to seek backward");
        }
        if (i2 > 0) {
            this.changeList.pushAdvanceSlotsBy(i2);
            this.writersReaderDelta = parent;
        }
    }

    public final boolean getPastParent() {
        return getReader().getParent() - this.writersReaderDelta < 0;
    }

    public final void withChangeList(ChangeList changeList, Function0<Unit> function0) {
        ChangeList changeList2 = getChangeList();
        try {
            setChangeList(changeList);
            function0.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            setChangeList(changeList2);
            InlineMarker.finallyEnd(1);
        }
    }

    public final void withoutImplicitRootStart(Function0<Unit> function0) {
        boolean implicitRootStart = getImplicitRootStart();
        try {
            setImplicitRootStart(false);
            function0.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            setImplicitRootStart(implicitRootStart);
            InlineMarker.finallyEnd(1);
        }
    }

    public final void remember(RememberObserver rememberObserver) {
        this.changeList.pushRemember(rememberObserver);
    }

    public final void updateValue(Object obj, int i2) {
        pushSlotTableOperationPreamble(true);
        this.changeList.pushUpdateValue(obj, i2);
    }

    public final void updateAnchoredValue(Object obj, Anchor anchor, int i2) {
        this.changeList.pushUpdateAnchoredValue(obj, anchor, i2);
    }

    public final void appendValue(Anchor anchor, Object obj) {
        this.changeList.pushAppendValue(anchor, obj);
    }

    public final void trimValues(int i2) {
        if (i2 > 0) {
            pushSlotEditingOperationPreamble();
            this.changeList.pushTrimValues(i2);
        }
    }

    public final void resetSlots() {
        this.changeList.pushResetSlots();
    }

    public final void updateAuxData(Object obj) {
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushUpdateAuxData(obj);
    }

    public final void endRoot() {
        if (this.startedGroup) {
            pushSlotTableOperationPreamble$default(this, false, 1, null);
            pushSlotTableOperationPreamble$default(this, false, 1, null);
            this.changeList.pushEndCurrentGroup();
            this.startedGroup = false;
        }
    }

    public final void endCurrentGroup() {
        int parent = getReader().getParent();
        if (!(this.startedGroups.peekOr(-1) <= parent)) {
            ComposerKt.composeImmediateRuntimeError("Missed recording an endGroup");
        }
        if (this.startedGroups.peekOr(-1) == parent) {
            pushSlotTableOperationPreamble$default(this, false, 1, null);
            this.startedGroups.pop();
            this.changeList.pushEndCurrentGroup();
        }
    }

    public final void skipToEndOfCurrentGroup() {
        this.changeList.pushSkipToEndOfCurrentGroup();
    }

    public final void removeCurrentGroup() {
        pushSlotEditingOperationPreamble();
        this.changeList.pushRemoveCurrentGroup();
        this.writersReaderDelta += getReader().getGroupSize();
    }

    public final void insertSlots(Anchor anchor, SlotTable slotTable) {
        pushPendingUpsAndDowns();
        pushSlotEditingOperationPreamble();
        realizeNodeMovementOperations();
        this.changeList.pushInsertSlots(anchor, slotTable);
    }

    public final void insertSlots(Anchor anchor, SlotTable slotTable, FixupList fixupList) {
        pushPendingUpsAndDowns();
        pushSlotEditingOperationPreamble();
        realizeNodeMovementOperations();
        this.changeList.pushInsertSlots(anchor, slotTable, fixupList);
    }

    public final void moveCurrentGroup(int i2) {
        pushSlotEditingOperationPreamble();
        this.changeList.pushMoveCurrentGroup(i2);
    }

    public final void endCompositionScope(Function1<? super Composition, Unit> function1, Composition composition) {
        this.changeList.pushEndCompositionScope(function1, composition);
    }

    public final void useNode(Object obj) {
        pushApplierOperationPreamble();
        this.changeList.pushUseNode(obj);
    }

    public final <T, V> void updateNode(V v2, Function2<? super T, ? super V, Unit> function2) {
        pushApplierOperationPreamble();
        this.changeList.pushUpdateNode(v2, function2);
    }

    public final void removeNode(int i2, int i3) {
        if (i3 > 0) {
            if (!(i2 >= 0)) {
                ComposerKt.composeImmediateRuntimeError("Invalid remove index " + i2);
            }
            if (this.removeFrom == i2) {
                this.moveCount += i3;
                return;
            }
            realizeNodeMovementOperations();
            this.removeFrom = i2;
            this.moveCount = i3;
        }
    }

    public final void moveNode(int i2, int i3, int i4) {
        if (i4 > 0) {
            int i5 = this.moveCount;
            if (i5 > 0 && this.moveFrom == i2 - i5 && this.moveTo == i3 - i5) {
                this.moveCount = i5 + i4;
                return;
            }
            realizeNodeMovementOperations();
            this.moveFrom = i2;
            this.moveTo = i3;
            this.moveCount = i4;
        }
    }

    public final void releaseMovableContent() {
        pushPendingUpsAndDowns();
        if (this.startedGroup) {
            skipToEndOfCurrentGroup();
            endRoot();
        }
    }

    public final void endNodeMovement() {
        realizeNodeMovementOperations();
    }

    public final void endNodeMovementAndDeleteNode(int i2, int i3) {
        endNodeMovement();
        pushPendingUpsAndDowns();
        int iNodeCount = getReader().isNode(i3) ? 1 : getReader().nodeCount(i3);
        if (iNodeCount > 0) {
            removeNode(i2, iNodeCount);
        }
    }

    private final void realizeNodeMovementOperations() {
        int i2 = this.moveCount;
        if (i2 > 0) {
            int i3 = this.removeFrom;
            if (i3 >= 0) {
                realizeRemoveNode(i3, i2);
                this.removeFrom = -1;
            } else {
                realizeMoveNode(this.moveTo, this.moveFrom, i2);
                this.moveFrom = -1;
                this.moveTo = -1;
            }
            this.moveCount = 0;
        }
    }

    private final void realizeRemoveNode(int i2, int i3) {
        pushApplierOperationPreamble();
        this.changeList.pushRemoveNode(i2, i3);
    }

    private final void realizeMoveNode(int i2, int i3, int i4) {
        pushApplierOperationPreamble();
        this.changeList.pushMoveNode(i2, i3, i4);
    }

    public final void moveUp() {
        realizeNodeMovementOperations();
        if (this.pendingDownNodes.isNotEmpty()) {
            this.pendingDownNodes.pop();
        } else {
            this.pendingUps++;
        }
    }

    public final void moveDown(Object obj) {
        realizeNodeMovementOperations();
        this.pendingDownNodes.push(obj);
    }

    private final void pushPendingUpsAndDowns() {
        int i2 = this.pendingUps;
        if (i2 > 0) {
            this.changeList.pushUps(i2);
            this.pendingUps = 0;
        }
        if (this.pendingDownNodes.isNotEmpty()) {
            this.changeList.pushDowns(this.pendingDownNodes.toArray());
            this.pendingDownNodes.clear();
        }
    }

    public final void sideEffect(Function0<Unit> function0) {
        this.changeList.pushSideEffect(function0);
    }

    public final void determineMovableContentNodeIndex(IntRef intRef, Anchor anchor) {
        pushPendingUpsAndDowns();
        this.changeList.pushDetermineMovableContentNodeIndex(intRef, anchor);
    }

    public final void copyNodesToNewAnchorLocation(List<? extends Object> list, IntRef intRef) {
        this.changeList.pushCopyNodesToNewAnchorLocation(list, intRef);
    }

    public final void copySlotTableToAnchorLocation(MovableContentState movableContentState, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        this.changeList.pushCopySlotTableToAnchorLocation(movableContentState, compositionContext, movableContentStateReference, movableContentStateReference2);
    }

    public final void releaseMovableGroupAtCurrent(ControlledComposition controlledComposition, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference) {
        this.changeList.pushReleaseMovableGroupAtCurrent(controlledComposition, compositionContext, movableContentStateReference);
    }

    public final void endMovableContentPlacement() {
        this.changeList.pushEndMovableContentPlacement();
        this.writersReaderDelta = 0;
    }

    public static /* synthetic */ void includeOperationsIn$default(ComposerChangeListWriter composerChangeListWriter, ChangeList changeList, IntRef intRef, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            intRef = null;
        }
        composerChangeListWriter.includeOperationsIn(changeList, intRef);
    }

    public final void includeOperationsIn(ChangeList changeList, IntRef intRef) {
        this.changeList.pushExecuteOperationsIn(changeList, intRef);
    }

    public final void finalizeComposition() {
        pushPendingUpsAndDowns();
        if (this.startedGroups.isEmpty()) {
            return;
        }
        ComposerKt.composeImmediateRuntimeError("Missed recording an endGroup()");
    }

    public final void resetTransientState() {
        this.startedGroup = false;
        this.startedGroups.clear();
        this.writersReaderDelta = 0;
    }

    public final void deactivateCurrentGroup() {
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushDeactivateCurrentGroup();
    }

    /* JADX INFO: compiled from: ComposerChangeListWriter.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٨lԥ&\tWȞ˝kq"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\fWKFuB\u001e\"Fd5\u0010e,5z5V>[0kR\u007f{q\u001cb\u0019J4\u0011\u000fb\u0017", "", "u(E", "7me._0=5&\t\u000bi\u0013\u0007\u0007+t\u00042\u0005", "", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
