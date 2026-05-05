package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.OffsetApplier;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeOwner;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.Utils_jvmKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.sentry.protocol.MetricSummary;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
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
/* JADX INFO: compiled from: Operation.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яř\u0014D57\u001eq\u007fR܀kŞ\fA\u00146\u0013.H\u0002*, \u0004\u000ffp<8D{H6RY+\u0017k\u00124,[*rK;c\u001a\u0006\"\u001fOVʴon`Z\u0013¼\u0017\u0006,xrߚQU\u000f]\u001a\u000f8dw?IMw=O`|6\u001b :\"Ny\r\u00010*P\u0010\rzKK\"\u00128@\u0007:Z\rc\u0005\"\u0012\u001c>(\u00014\\oNLHt]P/+\u0003\u007fBV'u0\u0005M#F\\'#vi\u001eA@?5+%[\u0003\u001dRc?\u0019?y=\u001bh/'AI{WLX\b\u0014++W\rsr.\\\u001bQh\f=+WcaP\u0016(\u000ez\u0004\rR\u0004\u0016\u0006=H6-0f\u0010\u000eItzԟF~\u0018މr\u007f)`n9B\u001eRKZ=\nu\u0007a@v`&09KQ0\u001fR\u000e\bB\u0016KR\r1\fl\u000e}{\b\u000fJrCo\u0014vh\u00028\u0004HG.0\f\u00174\u001739s9Q\"Ƞ\u0006HRj?\u001dnski\u0001Op&|\"O*7\u0019!X×\u0004ߘÏXZ2\u001f[+\u001d#\f\u0018+ \u000b~l)3\u001cfSxipN\f\u001bkCт6ժˇo\u0010]KlB}Wq#yR%\u001b\u0006P++fzZS:o\u0005(PHxr\u001e\u000f\u0014H^\f\u00193m\nL8:J1\\Cb3\"P\\\u0015\t\u000ev/4OcA$\u001biRu֊\u0005Vdʙ\bi~M:\u000211;Gi5G-\ffמ8\u0001;\t\u0005{\u000eP8[UN\u0005\u0016$Vދ$\u001c\"ߙi1C\u001d\u001d\u0004Ǿ1\"n\b\u00107+\u0018\u0015ZpEHF\\\n8~9Z>E\u00027B#)/r~T=R\u0004iGуyfN}MϬp9ZƕMV"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "", "7mc@", "", "=aY2V;L", "uH8uI", "5dc\u0016a;L", "u(8", "<`\\2", "", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u001cU1>Q(\r", "7mc\u001dT9:[\u0002z\u0003^", ">`a.`,MS&", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u001d\u0010r\u0017J\u0004#OL],i(", "7mc\u001dT9:[\u0002z\u0003^s\u000f[\u0011m\u0001\u0014c", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "=aY2V;)O&z\u0003G(\u0005\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq #\u0004h,L\u0006\u0012CYJ4\\arJi", "=aY2V;)O&z\u0003G(\u0005\tv3K<n2u\u0003", "BnBAe0GU", "3wT0h;>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "\u000fce.a*>A \t\nl\t\u0011", "\u000fo_2a+/O \u000fz", "\u000fo_9l\nAO\"\u0001zE0\u000b\u0018", "\u0011n_FA6=S'm\u0005G,\u000fd8c\u00032\t'\u000b\u0015\u0013Vs\u0018E", "\u0011n_FF3Hb\bzwe,k\u0013\u000bn}+\u0006Mg!\u0015C~\u0012F\u007f", "\u0012dP0g0OO(~Xn9\n\t8ta5\u0006P\f", "\u0012dc2e4B\\\u0019f\u0005o(y\u0010/C\n1\u000b@\n&\u007fQn\u000e \u007f$5l", "\u0012nf;f", "\u0013mS\u0010b4I]'\u0003\nb6\u0006v-o\u000b(", "\u0013mS\u0010h9KS\"\u000e\\k6\r\u0014", "\u0013mS\u001ab=:P ~Xh5\f\t8tj/w>\u0001\u001f\u0017P~", "\u0013mbBe, `#\u000f\u0006L;x\u0016>e~", "\u0013mbBe,+]#\u000e\\k6\r\u0014\u001dt{5\u000b@\u007f", "\u0017mb2e;']\u0018~[b?\r\u0014", "\u0017mb2e;,Z#\u000e\t", "\u0017mb2e;,Z#\u000e\tP0\f\f\u0010i\u00138\u0007N", "\u0017mc\u001dT9:[\u0019\u000ezk", "\u001bne26<K`\u0019\b\n@9\u0007\u0019:", "\u001bne2A6=S", "\u001daY2V;)O&z\u0003^;|\u0016", "\u001enbA<5LS&\u000ech+|i3x\u00103", " d[2T:>;#\u0010v[3|j<o\u00103WO^'$To\u0017K", " d\\2`)>`", " d\\<i,\u001cc&\fzg;^\u00169u\u000b", " d\\<i,']\u0018~", " db2g\u001aE](\r", "!hS28-?S\u0017\u000e", "!jX=G6\u001e\\\u0018h{<<\n\u0016/n\u000f\n\tJ\u0011\"", "\"dbAB7>`\u0015\u000e~h5", "\"qX:C(KS\"\u000ekZ3\r\t=", "#oS.g,\u001a\\\u0017\u0002\u0005k,{y+l\u0010(", "#oS.g,\u001ac,]vm(", "#oS.g,']\u0018~", "#oS.g,/O \u000fz", "#ob", "#rT\u0010h9KS\"\u000ech+|", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u0015\u0006t(Wt'5SX;j/\u0007\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u0015\u0012n,Wu\u0018CS^,2", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u0015\u0012n3bT*CUP,CV\u0001Li", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u0017\u0011n@7\u0001&GZ=6ER\u0005\u0019\u001d\u0010]\u0018[\u0012\u0017\u0003UP(xM\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u0017\u0011n@<}1V;J)cRaGo\u001bX\u0011X8s\u000fW=3rN@t", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u0018\u0007_*]z8C[N\nl_\u007f=\u001d!<\u001bX;\u0018Z", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u0018\u0007r,[~+PL66mNoD\u0014od\u0017]+\u0016\u0014BK#n(@\u001e\b?\u001f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u0018\u0011u5\\L", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u0019\u0010b\nX~2QZR;`\\{+\u0012\u001ce\u000e$", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u0019\u0010b\n^\u00044GU]\u000ei\\\u0003Hi", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u0019\u0010b\u0014X\b#DSN\nf[\u0002=\u001d!E\u0015J)\r\rYJ3D", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u0019\u0010q<[v\tTV^7JanJ#\u0012Yc", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u0019\u0010q<[v\u0014QV]\u000ei\\\u0003H\u0002!V\u001b]+\fZ", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u001d\u0010q,[\u0006\u0010QKN\r`e\u0003Hi", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u001d\u0010q,[\u0006\u0015NV]:2", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u001d\u0010q,[\u0006\u0015NV]:NV\u0002@t\u0016m\u001eY9b", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq !\u0011t,,\u00074TLW;>_|M\u001fg", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq !\u0011t,7\u0001&G\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq $\u0011q;2\u007f5GY]\u0015fQr\u001e\u0018%j\u0019$", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq &\u0007j,J\u0005'/V_(YYr\u001f!\u001cj\u0019*:j\u0015fN$wS\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq &\u0007k,Vs'T\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq &\u0007k6_v\u0005WY[,eaTJ\u001e\"ec", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq &\u0007k6_v\u0010QKN\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq &\u0007q,]d.Q[\\\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq '\u000bb,.w(GJ]\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq '\rg7=\u0001\u0007PK8-:b\u007fJ\u0014\u001bio[5\u001d\u0010/", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq (\u0007q;8\u0002'TH]0f[H", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq (\u0014g49r4GU]\u001dXY\u0003=\"g", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq )\u0012b(]v\u0003PJQ6iRq.\u0010\u0019j\u000e$", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq )\u0012b(]v\u0003W_-(kNH", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq )\u0012b(]v\u0010QKN\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq )\u0012b(]v\u0018CS^,2", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq )\u0012q\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq )\u0015c\n^\u00044GU]\u0015fQr\u0013", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class Operation {
    public static final int $stable = 0;
    private final int ints;
    private final int objects;

    public /* synthetic */ Operation(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3);
    }

    public abstract void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager);

    private Operation(int i2, int i3) {
        this.ints = i2;
        this.objects = i3;
    }

    public /* synthetic */ Operation(int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((1 & i4) != 0 ? 0 : i2, (i4 + 2) - (i4 | 2) != 0 ? 0 : i3, null);
    }

    public final int getInts() {
        return this.ints;
    }

    public final int getObjects() {
        return this.objects;
    }

    public final String getName() {
        String simpleName = Reflection.getOrCreateKotlinClass(getClass()).getSimpleName();
        return simpleName == null ? "" : simpleName;
    }

    /* JADX INFO: renamed from: intParamName-w8GmfQM */
    public String mo3683intParamNamew8GmfQM(int i2) {
        return "IntParameter(" + i2 + ')';
    }

    /* JADX INFO: renamed from: objectParamName-31yXWZQ */
    public String mo3684objectParamName31yXWZQ(int i2) {
        return "ObjectParameter(" + i2 + ')';
    }

    public String toString() {
        return getName();
    }

    /* JADX INFO: compiled from: Operation.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4E\u0007\":\u001b\u007f\u0007lnA0RqP.XT0ŧ*\u0012éT[Rp\u0004He\u001e\f\"!O|h̊rL`\rQ\u0012N.\u0007pDI\u0004\u007f\u000e\u0018\u001d:ZqU2{n\u0004˷aҽ:\u0007&;0BB\u0013\u000f%BH>wAƦJë\u00162F|HUU[\u0013'*\u0006l.Gɽ[ʄR8N{kJ\u007f2\u0011iZNU`݁\u0001S\u0015Ͽl)\u0013zo#ѱ?7߷\u00196"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u001d\u0010r\u0017J\u0004#OL],i(", "", "=eU@X;", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uH\u0018\u0016", "5dc\u001cY-LS(", "u(8", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @JvmInline
    public static final class IntParameter {
        private final int offset;

        /* JADX INFO: renamed from: box-impl */
        public static final /* synthetic */ IntParameter m3710boximpl(int i2) {
            return new IntParameter(i2);
        }

        /* JADX INFO: renamed from: constructor-impl */
        public static int m3711constructorimpl(int i2) {
            return i2;
        }

        /* JADX INFO: renamed from: equals-impl */
        public static boolean m3712equalsimpl(int i2, Object obj) {
            return (obj instanceof IntParameter) && i2 == ((IntParameter) obj).m3716unboximpl();
        }

        /* JADX INFO: renamed from: equals-impl0 */
        public static final boolean m3713equalsimpl0(int i2, int i3) {
            return i2 == i3;
        }

        /* JADX INFO: renamed from: hashCode-impl */
        public static int m3714hashCodeimpl(int i2) {
            return Integer.hashCode(i2);
        }

        /* JADX INFO: renamed from: toString-impl */
        public static String m3715toStringimpl(int i2) {
            return "IntParameter(offset=" + i2 + ')';
        }

        public boolean equals(Object obj) {
            return m3712equalsimpl(this.offset, obj);
        }

        public int hashCode() {
            return m3714hashCodeimpl(this.offset);
        }

        public String toString() {
            return m3715toStringimpl(this.offset);
        }

        /* JADX INFO: renamed from: unbox-impl */
        public final /* synthetic */ int m3716unboximpl() {
            return this.offset;
        }

        private /* synthetic */ IntParameter(int i2) {
            this.offset = i2;
        }

        public final int getOffset() {
            return this.offset;
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&˛\bDRш|İI\u0006>\u00116B\u0005%4\u0012\u0006\u0010nj?4LeV:ZS0\u0010qڜr:ӋLsIПc\u0019.\"7O\u000ftwrX[#C=\bȀ|l2Lc|&*\u001d9Zom;}uKBxvL\u0004N2hٗzڱ\u0005\u001c0R\u001e\u0002CQY\u0018*0nr\u0001ż\f̂\t\u001c\u0018\u0013L$I,juf6v{$ǔ.ݭ\u0007kH^5p\u0001\f[\u000e^TU\u000fțe$3¨O7\u001b*a\tޠQ\\ϓ\u0007Q"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq #\u0004h,L\u0006\u0012CYJ4\\arJi", "\"", "", "=eU@X;", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uH\u0018\u0016", "5dc\u001cY-LS(", "u(8", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @JvmInline
    public static final class ObjectParameter<T> {
        private final int offset;

        /* JADX INFO: renamed from: box-impl */
        public static final /* synthetic */ ObjectParameter m3721boximpl(int i2) {
            return new ObjectParameter(i2);
        }

        /* JADX INFO: renamed from: constructor-impl */
        public static <T> int m3722constructorimpl(int i2) {
            return i2;
        }

        /* JADX INFO: renamed from: equals-impl */
        public static boolean m3723equalsimpl(int i2, Object obj) {
            return (obj instanceof ObjectParameter) && i2 == ((ObjectParameter) obj).m3727unboximpl();
        }

        /* JADX INFO: renamed from: equals-impl0 */
        public static final boolean m3724equalsimpl0(int i2, int i3) {
            return i2 == i3;
        }

        /* JADX INFO: renamed from: hashCode-impl */
        public static int m3725hashCodeimpl(int i2) {
            return Integer.hashCode(i2);
        }

        /* JADX INFO: renamed from: toString-impl */
        public static String m3726toStringimpl(int i2) {
            return "ObjectParameter(offset=" + i2 + ')';
        }

        public boolean equals(Object obj) {
            return m3723equalsimpl(this.offset, obj);
        }

        public int hashCode() {
            return m3725hashCodeimpl(this.offset);
        }

        public String toString() {
            return m3726toStringimpl(this.offset);
        }

        /* JADX INFO: renamed from: unbox-impl */
        public final /* synthetic */ int m3727unboximpl() {
            return this.offset;
        }

        private /* synthetic */ ObjectParameter(int i2) {
            this.offset = i2;
        }

        public final int getOffset() {
            return this.offset;
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u0006\u0013nj?2LeV.ZS@\u000fsڔ<$q$yّCU0}*ޛWN}gvϺ`ƗC%إFx\u0019+\nZ~]ܫ\u00132Po\bK[tU9\u000fzf\t.9:8(\u0007G.ߋGƵͯ~EQ\u0014 9\t\u0017H\\%M3%:\u0006l,1&jtf:Xlc;]13mP]?_^\r}\u0011Te?\r%sd?\u0011MC\u0016=S1\t\tĀ?ǚ>мޮ\u0004gҊ+/au]9f\u0004ϯ\u00154W\u0010cĘB\u000b\u0004Y`\u0012FˬSv"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq )\u0012q\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "u(E", "\u0011nd;g", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u001d\u0010r\u0017J\u0004#OL],i(", "5dc\u0010b<Gb`\u0004\u0004)\rao\u000f", "u(8", "7mc\u001dT9:[\u0002z\u0003^", "", ">`a.`,MS&", "7mc\u001dT9:[\u0002z\u0003^s\u000f[\u0011m\u0001\u0014c", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "3wT0h;>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Ups extends Operation {
        public static final int $stable = 0;
        public static final Ups INSTANCE = new Ups();

        private Ups() {
            super(1, 0, 2, null);
        }

        /* JADX INFO: renamed from: getCount-jn0FJLE */
        public final int m3746getCountjn0FJLE() {
            return IntParameter.m3711constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: intParamName-w8GmfQM */
        public String mo3683intParamNamew8GmfQM(int i2) {
            return IntParameter.m3713equalsimpl0(i2, IntParameter.m3711constructorimpl(0)) ? MetricSummary.JsonKeys.COUNT : super.mo3683intParamNamew8GmfQM(i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            int iMo3747getIntw8GmfQM = operationArgContainer.mo3747getIntw8GmfQM(IntParameter.m3711constructorimpl(0));
            for (int i2 = 0; i2 < iMo3747getIntw8GmfQM; i2++) {
                applier.up();
            }
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\r14\u0012\u0006јnj?1LeV:ZS0\u0011s{B$c$\bCC٥\"}8\tWȞog\u0005JbŏK\u000f\u001c\u0016\u0001̓2ַU\u000fزB\u000f`A0D9MڱA9nt~!.9:8(\r1\"8Q(z\u000bCQ\r@2\u0007\u0005ŦQ҈̂\t\u001c\u0018\u0010L+IDjsf6vy\u0006:]13qP]?c@|S\u000etdW\u0011\u0005r6+nIe\u00193f\u001b\u0007\u0001o\u0006\u0017\u0010\u0016K\u0006\u0001575Y{g:h\u0002*\u0014YS;`!(\u0013ԫQՙ\u000bʬ̼NbׂT\u0012@y\u0001\u0001\u001bBǌ\u000e\u000f/K4ǈ6\u0015\u0007\u00163z\u0012ՈDe"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u0018\u0011u5\\L", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "u(E", "\u001cnS2f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq #\u0004h,L\u0006\u0012CYJ4\\arJi", "", "", "5dc\u001bb+>a`a\u0006n=\u000fe\u001b", "u(8", "=aY2V;)O&z\u0003G(\u0005\t", "", ">`a.`,MS&", "=aY2V;)O&z\u0003G(\u0005\tv3K<n2u\u0003", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "3wT0h;>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Downs extends Operation {
        public static final int $stable = 0;
        public static final Downs INSTANCE = new Downs();

        private Downs() {
            super(0, 1, 1, null);
        }

        /* JADX INFO: renamed from: getNodes-HpuvwBQ */
        public final int m3698getNodesHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            Intrinsics.checkNotNull(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            for (Object obj : (Object[]) operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(0))) {
                applier.down(obj);
            }
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3684objectParamName31yXWZQ(int i2) {
            return ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(0)) ? "nodes" : super.mo3684objectParamName31yXWZQ(i2);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u0006\u0013nj?2LeV.ZS@\u000fsڔ<$q$yّCU0}*ޛWN}gvϺ`ƗC%إFx\u0019+\nZ~]ܫ\u00132Po\bK[tU9\u000fzf\t.9:8(\u0007G.ߋGƵͯ~EQ\u0014 9\t\u0017H\\%M3%:\u0006l,1&jtf:Xlc;]13mP]?_^\r}\u0011Te?\r%sd?\u0011MC\u0016=S1\t\tĀ?ǚ>мޮ\u0004gҊ+/au]9f\u0004ϯ\u00154W\u0010cĘB\u000b\u0004Y`\u0012FˬSv"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u0015\u0006t(Wt'5SX;j/\u0007\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "u(E", "\u0012hbAT5<S", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u001d\u0010r\u0017J\u0004#OL],i(", "5dc\u0011\\:MO\"|z&1\u0006S\u0010Jf\b", "u(8", "7mc\u001dT9:[\u0002z\u0003^", "", ">`a.`,MS&", "7mc\u001dT9:[\u0002z\u0003^s\u000f[\u0011m\u0001\u0014c", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "3wT0h;>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AdvanceSlotsBy extends Operation {
        public static final int $stable = 0;
        public static final AdvanceSlotsBy INSTANCE = new AdvanceSlotsBy();

        private AdvanceSlotsBy() {
            super(1, 0, 2, null);
        }

        /* JADX INFO: renamed from: getDistance-jn0FJLE */
        public final int m3685getDistancejn0FJLE() {
            return IntParameter.m3711constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: intParamName-w8GmfQM */
        public String mo3683intParamNamew8GmfQM(int i2) {
            return IntParameter.m3713equalsimpl0(i2, IntParameter.m3711constructorimpl(0)) ? "distance" : super.mo3683intParamNamew8GmfQM(i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.advanceBy(operationArgContainer.mo3747getIntw8GmfQM(IntParameter.m3711constructorimpl(0)));
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012\u0006\u0007nj?1LeV:ZS0\u0011s{J$cҕyCQU\"Ԃ*\teNo˧vJp\u000bKƤ\fȥx\u0001ߚyU'\\R\u00148BņC3[o\u0006Un{N\u0005N:R@\b\u000e\u0019\u001e:H\u0016w)E\u0012 ݮ/ϋ¤>T\u0013W\u0013%Z,L,\u0019\u001e\u000bkv6vy\u000eB=1\u001bmRN-`^\f}\u0011Td?\r%rN/NIM\u0015SfI\u001b#}M\u0004W}M\rx-7-Ys\u0006:\u0007\u0003B\u0017ä́\rȗq̦ڑ\u0004Pԃ\u0010+CQiP^\u0014ߍw\u0004\u0004\u0010Bǫ*4&P.39Ǻ\f\""}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq '\u000bb,.w(GJ]\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "u(E", "\u0013eU2V;", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq #\u0004h,L\u0006\u0012CYJ4\\arJi", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "5dc\u0012Y->Q(F]i<\u000e\u001b\fQ", "u(8", "=aY2V;)O&z\u0003G(\u0005\t", "", ">`a.`,MS&", "=aY2V;)O&z\u0003G(\u0005\tv3K<n2u\u0003", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "3wT0h;>", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class SideEffect extends Operation {
        public static final int $stable = 0;
        public static final SideEffect INSTANCE = new SideEffect();

        private SideEffect() {
            super(0, 1, 1, null);
        }

        /* JADX INFO: renamed from: getEffect-HpuvwBQ */
        public final int m3736getEffectHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3684objectParamName31yXWZQ(int i2) {
            return ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(0)) ? "effect" : super.mo3684objectParamName31yXWZQ(i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            rememberManager.sideEffect((Function0) operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(0)));
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\bnjG<LeN0ZS8\u000fs{J$cҕyCQU\"Ԃ*\teNo˧vJp\u000bKƤ\fȥx\u0001ߚyU'\\R\u00148BņC3[o\u0006UnzN\u0005N9R@\b\r\u0019\u001e:H\u0016w)E\u0012 ݮ/ϋ¤>T\u0013V\u0013$Z,L+\u0019\u001e\u000bsv6vy\u000eB=1\u001bmRN-`^\f}\u0011Td?\r%rN/NIM\u0015SfI\u001b#wM\u0004WwM\u0007x'U.wu\u000eͳXŕ\u0013ƃܹN\fǁv*t\u0007Wd\u001a,ˆOlSS\u0014߬\u0014)z\u0015<\n-Σ+\\"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq &\u0007k,Vs'T\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "u(E", "$`[BX", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq #\u0004h,L\u0006\u0012CYJ4\\arJi", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-!j$.ZT;x\n", "5dc#T3NS`a\u0006n=\u000fe\u001b", "u(8", "=aY2V;)O&z\u0003G(\u0005\t", "", ">`a.`,MS&", "=aY2V;)O&z\u0003G(\u0005\tv3K<n2u\u0003", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "3wT0h;>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Remember extends Operation {
        public static final int $stable = 0;
        public static final Remember INSTANCE = new Remember();

        private Remember() {
            super(0, 1, 1, null);
        }

        /* JADX INFO: renamed from: getValue-HpuvwBQ */
        public final int m3733getValueHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3684objectParamName31yXWZQ(int i2) {
            return ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(0)) ? "value" : super.mo3684objectParamName31yXWZQ(i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            rememberManager.remembering((RememberObserver) operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(0)));
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\bnjGӄLeN.ZS8\u001bs{:&c$\u007fCCU0}*ޛWN}gvϺb\u000bY\u000f\u000eǝ\u0001jBI]ތcݐ\u000fHԏ ?aL0B?`ҽ:\u0005.2jT\b\u000e\u0019\u001aXR@~\tNc\u0010\"0FqhTSaơ\u0019ŇĂB\"\u0007*jt\u0017\\Vzu:]2+ip^Wg>\u000ee\u0011VT-\u000e%sN/NJM\u0015Sg3\u000b`pW\u0003m\b\u0004\u00199C5,ayg8h\u007fB\u0018YQCǥrΟ[ӤƢ_\u000bˏ/S{MV\u00126|K\u001a\u001bB\u001c\u0016\u0016+X0C\u0019\u0015\u000f<5+ʈSŬO\u061c\u0081A~ѐe:/'\u0006;9>ӘfZi>\u001f\u05edS*\u0004\u0015\u001e) \u0382%r"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u0015\u0012n,Wu\u0018CS^,2", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "u(E", "\u000fmR5b9", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq #\u0004h,L\u0006\u0012CYJ4\\arJi", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iEt(?fS", "5dc\u000ea*A]&F]i<\u000e\u001b\fQ", "u(8", "$`[BX", "", "5dc#T3NS`a\u0006n=\u000fe\u001b", "=aY2V;)O&z\u0003G(\u0005\t", "", ">`a.`,MS&", "=aY2V;)O&z\u0003G(\u0005\tv3K<n2u\u0003", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "3wT0h;>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AppendValue extends Operation {
        public static final int $stable = 0;
        public static final AppendValue INSTANCE = new AppendValue();

        private AppendValue() {
            super(0, 2, 1, null);
        }

        /* JADX INFO: renamed from: getAnchor-HpuvwBQ */
        public final int m3686getAnchorHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(0);
        }

        /* JADX INFO: renamed from: getValue-HpuvwBQ */
        public final int m3687getValueHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3684objectParamName31yXWZQ(int i2) {
            return ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(0)) ? "anchor" : ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(1)) ? "value" : super.mo3684objectParamName31yXWZQ(i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            Anchor anchor = (Anchor) operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(0));
            Object objMo3748getObject31yXWZQ = operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(1));
            if (objMo3748getObject31yXWZQ instanceof RememberObserverHolder) {
                rememberManager.remembering(((RememberObserverHolder) objMo3748getObject31yXWZQ).getWrapped());
            }
            slotWriter.appendSlot(anchor, objMo3748getObject31yXWZQ);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u0006\u0013nj?2LeV.ZS@\u000fsڔ<$q$yّCU0}*ޛWN}gvϺ`ƗC%إFx\u0019+\nZ~]ܫ\u00132Po\bK[tU9\u000fzf\t.9:8(\u0007G.ߋGƵͯ~EQ\u0014 9\t\u0017H\\%M3%:\u0006l,1&jtf:Xlc;]13mP]?_^\r}\u0011Te?\r%sd?\u0011MC\u0016=S1\t\tĀ?ǚ>мޮ\u0004gҊ+/au]9f\u0004ϯ\u00154W\u0010cĘB\u000b\u0004Y`\u0012FˬSv"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq (\u0014g49r4GU]\u001dXY\u0003=\"g", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "u(E", "\u0011nd;g", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u001d\u0010r\u0017J\u0004#OL],i(", "5dc\u0010b<Gb`\u0004\u0004)\rao\u000f", "u(8", "7mc\u001dT9:[\u0002z\u0003^", "", ">`a.`,MS&", "7mc\u001dT9:[\u0002z\u0003^s\u000f[\u0011m\u0001\u0014c", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "3wT0h;>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class TrimParentValues extends Operation {
        public static final int $stable = 0;
        public static final TrimParentValues INSTANCE = new TrimParentValues();

        private TrimParentValues() {
            super(1, 0, 2, null);
        }

        /* JADX INFO: renamed from: getCount-jn0FJLE */
        public final int m3737getCountjn0FJLE() {
            return IntParameter.m3711constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: intParamName-w8GmfQM */
        public String mo3683intParamNamew8GmfQM(int i2) {
            return IntParameter.m3713equalsimpl0(i2, IntParameter.m3711constructorimpl(0)) ? MetricSummary.JsonKeys.COUNT : super.mo3683intParamNamew8GmfQM(i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            int iMo3747getIntw8GmfQM = operationArgContainer.mo3747getIntw8GmfQM(IntParameter.m3711constructorimpl(0));
            int slotsSize = slotWriter.getSlotsSize();
            int parent = slotWriter.getParent();
            int iSlotsStartIndex$runtime_release = slotWriter.slotsStartIndex$runtime_release(parent);
            int iSlotsEndIndex$runtime_release = slotWriter.slotsEndIndex$runtime_release(parent);
            for (int iMax = Math.max(iSlotsStartIndex$runtime_release, iSlotsEndIndex$runtime_release - iMo3747getIntw8GmfQM); iMax < iSlotsEndIndex$runtime_release; iMax++) {
                Object obj = slotWriter.slots[slotWriter.dataIndexToDataAddress(iMax)];
                if (obj instanceof RememberObserverHolder) {
                    rememberManager.forgetting(((RememberObserverHolder) obj).getWrapped(), slotsSize - iMax, -1, -1);
                } else if (obj instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl) obj).release();
                }
            }
            slotWriter.trimTailSlots(iMo3747getIntw8GmfQM);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u000e\u0007njGӄLeN.ZS8\u001bs{:(c$\u007fCCU0}*ޛWN}gvϺb\u000bY\u000f\u000eǝ\u0001jBI]ތcݐ\u000fHԏ ?aL0B?`ҽ:\u0005.2jP\b\u000e\u0019\u001aXR@z\tNc\f@2\u0007\u0005ŦQ҈̂\t\u001c\u0018\u0012L-I:juf6vv\u000eB=.\u001bmRN-`^\u0003\u0014!ѸS܋˼zc$:ND};3c\u001b\u0007\u0001lg\u0003m\u0004m\rv:?/Ys]7\u0007\u0014D\u00199d%]!<\r\t_w$'Yg*_!$6x\u0013{;>:ف\u0006ТG͓ȟ\u0019eڿ\u00127\rtYC^\u0006/`\u000e\u007fy>')\u00105A8Im\u007fgqБNӒz˜۵\u001d\"ъr%sV\u0014h#\u001fƛwZ9TFעd|\ta=s#\u0378f\u001b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq )\u0012b(]v\u0018CS^,2", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "u(E", "\u0015q^Bc\u001aE](b\u0004],\u0010", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u001d\u0010r\u0017J\u0004#OL],i(", "5dc\u0014e6N^\u0007\u0006\u0005m\u0010\u0006\b/xG-\u0005\u000ba{}'", "u(8", "$`[BX", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq #\u0004h,L\u0006\u0012CYJ4\\arJi", "", "5dc#T3NS`a\u0006n=\u000fe\u001b", "7mc\u001dT9:[\u0002z\u0003^", "", ">`a.`,MS&", "7mc\u001dT9:[\u0002z\u0003^s\u000f[\u0011m\u0001\u0014c", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "=aY2V;)O&z\u0003G(\u0005\t", "=aY2V;)O&z\u0003G(\u0005\tv3K<n2u\u0003", "3wT0h;>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class UpdateValue extends Operation {
        public static final int $stable = 0;
        public static final UpdateValue INSTANCE = new UpdateValue();

        private UpdateValue() {
            super(1, 1, null);
        }

        /* JADX INFO: renamed from: getValue-HpuvwBQ */
        public final int m3745getValueHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(0);
        }

        /* JADX INFO: renamed from: getGroupSlotIndex-jn0FJLE */
        public final int m3744getGroupSlotIndexjn0FJLE() {
            return IntParameter.m3711constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: intParamName-w8GmfQM */
        public String mo3683intParamNamew8GmfQM(int i2) {
            return IntParameter.m3713equalsimpl0(i2, IntParameter.m3711constructorimpl(0)) ? "groupSlotIndex" : super.mo3683intParamNamew8GmfQM(i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3684objectParamName31yXWZQ(int i2) {
            return ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(0)) ? "value" : super.mo3684objectParamName31yXWZQ(i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            Object objMo3748getObject31yXWZQ = operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(0));
            int iMo3747getIntw8GmfQM = operationArgContainer.mo3747getIntw8GmfQM(IntParameter.m3711constructorimpl(0));
            if (objMo3748getObject31yXWZQ instanceof RememberObserverHolder) {
                rememberManager.remembering(((RememberObserverHolder) objMo3748getObject31yXWZQ).getWrapped());
            }
            Object obj = slotWriter.set(iMo3747getIntw8GmfQM, objMo3748getObject31yXWZQ);
            if (obj instanceof RememberObserverHolder) {
                rememberManager.forgetting(((RememberObserverHolder) obj).getWrapped(), slotWriter.getSlotsSize() - slotWriter.slotIndexOfGroupSlotIndex(slotWriter.getCurrentGroup(), iMo3747getIntw8GmfQM), -1, -1);
            } else if (obj instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) obj).release();
            }
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\bnjO0LeN.ZS8şs{:$c$\u007fOCU \u0002*\t]Nog\u0005JbŏK\u000f\u001c\u0016\u0001̓4Ikxe܈\u00172XoG\u074cSۖ=Oś%63\u001fr'>yڱ\u0005\u001a8HX\u000f\tOc\f@=ptH`%M3!X\u001aͽ\u001fҵɉ`iTEV|&V=4\u001bip[Wg>\u000be\u0011VT-\u000e%cd?ġ6ߎչ)U\t\u0019`k\b)M\u0005U\u0005\u0017;O+w\t\b>f\u0016,\u0019;O\u0013^!=\r\t_x$'Yh\u0014O^(@w)\u0017SPT*\u0014(`4=\u001cv\b<6#t\nĺPڕ]ۍʎy`ي\u001b)\u001851=)k\"wI\u001ff7*\fC͛#ҠmďǵS\r\u05ce\u0019\u001flyW9_E\u000ef\\\u0013qE}\b\u0001d\u0018)2:u\u0002eʌ\u0011ҽ\u0016¦ܔZ8؝%o\u001aJJr\u0005\n\u009eh\\qUNع>\u001d\u0015?*\u000f+ʗH\u0001"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq )\u0012b(]v\u0003PJQ6iRq.\u0010\u0019j\u000e$", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "u(E", "\u000fmR5b9", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq #\u0004h,L\u0006\u0012CYJ4\\arJi", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iEt(?fS", "5dc\u000ea*A]&F]i<\u000e\u001b\fQ", "u(8", "\u0015q^Bc\u001aE](b\u0004],\u0010", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u001d\u0010r\u0017J\u0004#OL],i(", "5dc\u0014e6N^\u0007\u0006\u0005m\u0010\u0006\b/xG-\u0005\u000ba{}'", "$`[BX", "", "5dc#T3NS`a\u0006n=\u000fe\u001b", "7mc\u001dT9:[\u0002z\u0003^", "", ">`a.`,MS&", "7mc\u001dT9:[\u0002z\u0003^s\u000f[\u0011m\u0001\u0014c", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "=aY2V;)O&z\u0003G(\u0005\t", "=aY2V;)O&z\u0003G(\u0005\tv3K<n2u\u0003", "3wT0h;>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class UpdateAnchoredValue extends Operation {
        public static final int $stable = 0;
        public static final UpdateAnchoredValue INSTANCE = new UpdateAnchoredValue();

        private UpdateAnchoredValue() {
            super(1, 2, null);
        }

        /* JADX INFO: renamed from: getValue-HpuvwBQ */
        public final int m3740getValueHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(0);
        }

        /* JADX INFO: renamed from: getAnchor-HpuvwBQ */
        public final int m3738getAnchorHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(1);
        }

        /* JADX INFO: renamed from: getGroupSlotIndex-jn0FJLE */
        public final int m3739getGroupSlotIndexjn0FJLE() {
            return IntParameter.m3711constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: intParamName-w8GmfQM */
        public String mo3683intParamNamew8GmfQM(int i2) {
            return IntParameter.m3713equalsimpl0(i2, IntParameter.m3711constructorimpl(0)) ? "groupSlotIndex" : super.mo3683intParamNamew8GmfQM(i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3684objectParamName31yXWZQ(int i2) {
            return ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(0)) ? "value" : ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(1)) ? "anchor" : super.mo3684objectParamName31yXWZQ(i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            int iAnchorIndex;
            int slotsSize;
            Object objMo3748getObject31yXWZQ = operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(0));
            Anchor anchor = (Anchor) operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(1));
            int iMo3747getIntw8GmfQM = operationArgContainer.mo3747getIntw8GmfQM(IntParameter.m3711constructorimpl(0));
            if (objMo3748getObject31yXWZQ instanceof RememberObserverHolder) {
                rememberManager.remembering(((RememberObserverHolder) objMo3748getObject31yXWZQ).getWrapped());
            }
            int iAnchorIndex2 = slotWriter.anchorIndex(anchor);
            Object obj = slotWriter.set(iAnchorIndex2, iMo3747getIntw8GmfQM, objMo3748getObject31yXWZQ);
            if (obj instanceof RememberObserverHolder) {
                int slotsSize2 = slotWriter.getSlotsSize() - slotWriter.slotIndexOfGroupSlotIndex(iAnchorIndex2, iMo3747getIntw8GmfQM);
                RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) obj;
                Anchor after = rememberObserverHolder.getAfter();
                if (after != null && after.getValid()) {
                    iAnchorIndex = slotWriter.anchorIndex(after);
                    slotsSize = slotWriter.getSlotsSize() - slotWriter.slotsEndAllIndex$runtime_release(iAnchorIndex);
                } else {
                    iAnchorIndex = -1;
                    slotsSize = -1;
                }
                rememberManager.forgetting(rememberObserverHolder.getWrapped(), slotsSize2, iAnchorIndex, slotsSize);
                return;
            }
            if (obj instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) obj).release();
            }
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\rӬ4\u0012}\bnjG<LeN0ZS8\u000fs{J$cҕyCQU\"Ԃ*\teNo˧vJp\u000bKƤ\fȥx\u0001ߚyU'\\R\u00148BņC3[o\u0006UnzN\u0005N9R@\b\r\u0019\u001e:H\u0016w)E\u0012 ݮ/ϋ¤>T\u0013V\u0013$Z,L+\u0019\u001e\u000bsv6vy\u000eB=1\u001bmRN-`^\f}\u0011Td?\r%rN/NIM\u0015SfI\u001b#yM\u0004WyM\tx)=*wv\u00068\u000fģ\u0014Ǽ*˽\u05ce\\q͉`\tib\u0012+9TҭKY\u0016+}ߠ\u0018;;\f\u000e\fFχ2A"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq )\u0012b(]v\u0003W_-(kNH", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "u(E", "\u0012`c.", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq #\u0004h,L\u0006\u0012CYJ4\\arJi", "", "5dc\u0011T;:\u001b{\n\u000bo>Yt", "u(8", "=aY2V;)O&z\u0003G(\u0005\t", "", ">`a.`,MS&", "=aY2V;)O&z\u0003G(\u0005\tv3K<n2u\u0003", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "3wT0h;>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class UpdateAuxData extends Operation {
        public static final int $stable = 0;
        public static final UpdateAuxData INSTANCE = new UpdateAuxData();

        private UpdateAuxData() {
            super(0, 1, 1, null);
        }

        /* JADX INFO: renamed from: getData-HpuvwBQ */
        public final int m3741getDataHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3684objectParamName31yXWZQ(int i2) {
            return ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(0)) ? "data" : super.mo3684objectParamName31yXWZQ(i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.updateAux(operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(0)));
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<řaӝqYП\u0006\u001a,!ITTg̊rJh\u000b\f5\u0014\u0017\u0011jZK}x\f\u0015?:PsW7]oC:\u000fyf\t.8:8(\f1\u001e8P(v)L\u0012 ܞ4J"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u0019\u0010q<[v\u0014QV]\u000ei\\\u0003H\u0002!V\u001b]+\fZ", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "u(E", "3wT0h;>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class EnsureRootGroupStarted extends Operation {
        public static final int $stable = 0;
        public static final EnsureRootGroupStarted INSTANCE = new EnsureRootGroupStarted();

        private EnsureRootGroupStarted() {
            super(0, 0, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.ensureStarted(0);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\bnjG<LeN0ZS8\u000fs{J$cҕyCQU\"Ԃ*\teNo˧vJp\u000bKƤ\fȥx\u0001ߚyU'\\R\u00148BņC3[o\u0006UnzN\u0005N9R@\b\r\u0019\u001e:H\u0016w)E\u0012 ݮ/ϋ¤>T\u0013V\u0013$Z,L+\u0019\u001e\u000bsv6vy\u000eB=1\u001bmRN-`^\f}\u0011Td?\r%rN/NIM\u0015SfI\u001b#wM\u0004WwM\u0007x'U.wu\u000eͳXŕ\u0013ƃܹN\fǁv*t\u0007Wd\u001a,ˆOlSS\u0014߬\u0014)z\u0015<\n-Σ+\\"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u0019\u0010q<[v\tTV^7JanJ#\u0012Yc", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "u(E", "\u000fmR5b9", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq #\u0004h,L\u0006\u0012CYJ4\\arJi", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iEt(?fS", "5dc\u000ea*A]&F]i<\u000e\u001b\fQ", "u(8", "=aY2V;)O&z\u0003G(\u0005\t", "", ">`a.`,MS&", "=aY2V;)O&z\u0003G(\u0005\tv3K<n2u\u0003", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "3wT0h;>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class EnsureGroupStarted extends Operation {
        public static final int $stable = 0;
        public static final EnsureGroupStarted INSTANCE = new EnsureGroupStarted();

        private EnsureGroupStarted() {
            super(0, 1, 1, null);
        }

        /* JADX INFO: renamed from: getAnchor-HpuvwBQ */
        public final int m3701getAnchorHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3684objectParamName31yXWZQ(int i2) {
            return ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(0)) ? "anchor" : super.mo3684objectParamName31yXWZQ(i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.ensureStarted((Anchor) operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(0)));
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<řaӝqYП\u0006\u001a,!ITTg̊rJh\u000b\f5\u0014\u0017\u0011jZK}x\f\u0015?:PsW7]oC:\u000fyf\t.8:8(\f1\u001e8P(v)L\u0012 ܞ4J"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq &\u0007k6_v\u0005WY[,eaTJ\u001e\"ec", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "u(E", "3wT0h;>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class RemoveCurrentGroup extends Operation {
        public static final int $stable = 0;
        public static final RemoveCurrentGroup INSTANCE = new RemoveCurrentGroup();

        private RemoveCurrentGroup() {
            super(0, 0, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            ComposerKt.removeCurrentGroup(slotWriter, rememberManager);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u0006\u0013nj?2LeV.ZS@\u000fsڔ<$q$yّCU0}*ޛWN}gvϺ`ƗC%إFx\u0019+\nZ~]ܫ\u00132Po\bK[tU9\u000fzf\t.9:8(\u0007G.ߋGƵͯ~EQ\u0014 9\t\u0017H\\%M3%:\u0006l,1&jtf:Xlc;]13mP]?_^\r}\u0011Te?\r%sd?\u0011MC\u0016=S1\t\tĀ?ǚ>мޮ\u0004gҊ+/au]9f\u0004ϯ\u00154W\u0010cĘB\u000b\u0004Y`\u0012FˬSv"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq !\u0011t,,\u00074TLW;>_|M\u001fg", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "u(E", "\u001deU@X;", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u001d\u0010r\u0017J\u0004#OL],i(", "5dc\u001cY-LS(F\u007fgv]m\u0016E", "u(8", "7mc\u001dT9:[\u0002z\u0003^", "", ">`a.`,MS&", "7mc\u001dT9:[\u0002z\u0003^s\u000f[\u0011m\u0001\u0014c", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "3wT0h;>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class MoveCurrentGroup extends Operation {
        public static final int $stable = 0;
        public static final MoveCurrentGroup INSTANCE = new MoveCurrentGroup();

        private MoveCurrentGroup() {
            super(1, 0, 2, null);
        }

        /* JADX INFO: renamed from: getOffset-jn0FJLE */
        public final int m3717getOffsetjn0FJLE() {
            return IntParameter.m3711constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: intParamName-w8GmfQM */
        public String mo3683intParamNamew8GmfQM(int i2) {
            return IntParameter.m3713equalsimpl0(i2, IntParameter.m3711constructorimpl(0)) ? TypedValues.CycleType.S_WAVE_OFFSET : super.mo3683intParamNamew8GmfQM(i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.moveGroup(operationArgContainer.mo3747getIntw8GmfQM(IntParameter.m3711constructorimpl(0)));
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<řaӝqYП\u0006\u001a,!ITTg̊rJh\u000b\f5\u0014\u0017\u0011jZK}x\f\u0015?:PsW7]oC:\u000fyf\t.8:8(\f1\u001e8P(v)L\u0012 ܞ4J"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u0019\u0010b\n^\u00044GU]\u000ei\\\u0003Hi", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "u(E", "3wT0h;>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class EndCurrentGroup extends Operation {
        public static final int $stable = 0;
        public static final EndCurrentGroup INSTANCE = new EndCurrentGroup();

        private EndCurrentGroup() {
            super(0, 0, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.endGroup();
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<řaӝqYП\u0006\u001a,!ITTg̊rJh\u000b\f5\u0014\u0017\u0011jZK}x\f\u0015?:PsW7]oC:\u000fyf\t.8:8(\f1\u001e8P(v)L\u0012 ܞ4J"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq '\rg7=\u0001\u0007PK8-:b\u007fJ\u0014\u001bio[5\u001d\u0010/", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "u(E", "3wT0h;>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class SkipToEndOfCurrentGroup extends Operation {
        public static final int $stable = 0;
        public static final SkipToEndOfCurrentGroup INSTANCE = new SkipToEndOfCurrentGroup();

        private SkipToEndOfCurrentGroup() {
            super(0, 0, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.skipToGroupEnd();
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012\u000e\u0007njG0LeN1ZS8\u001bs{:&c$\bCC٥\"}8\tWȞog\u0005JbŏK\u000f\u001c\u0016\u0001̓2ַU\u000fزB\u000f`A0D9MڱA9nt~!.<:8(\u00101\"8T(z\u000bCQ\r@2\u0007\u0005ŦQ҈̂\t\u001c\u0018\u0013L.IDjvf6vq\u0006:]33qP_?c@|S\u000etfW\u0011\u0005t6+nKe\u00193h\u001b\u0007\u0001q\u0006\u0017\u0010\u001aK\u0006\u0001979Y\u007fg8h\u007fB\u0019;Q\u001d]!+\u000b\b\u007fbB˳+\u05cbb֟ح\r'Þ~\u007f%>\n\u0014\u0014.\u0019J;\"~\u000e\u001e5\u0005r\u0002D~\u0004\u0015ܔ\u007fҦ`ا҆$~Ĵ/=3hWjI \u05ce7\u0005\r\u0010$Ţ\u001d\u001d cT\u0014\u007fڦ\u001fk"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u0019\u0010b\nX~2QZR;`\\{+\u0012\u001ce\u000e$", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "u(E", "\u000fbc6b5", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq #\u0004h,L\u0006\u0012CYJ4\\arJi", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u0004", "", "5dc\u000eV;B]\"F]i<\u000e\u001b\fQ", "u(8", "\u0011n\\=b:Bb\u001d\t\u0004", "5dc\u0010b4I]'\u0003\nb6\u0006P\u0012p\u00109\u000e\u001dl", "=aY2V;)O&z\u0003G(\u0005\t", "", ">`a.`,MS&", "=aY2V;)O&z\u0003G(\u0005\tv3K<n2u\u0003", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "3wT0h;>", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class EndCompositionScope extends Operation {
        public static final int $stable = 0;
        public static final EndCompositionScope INSTANCE = new EndCompositionScope();

        private EndCompositionScope() {
            super(0, 2, 1, null);
        }

        /* JADX INFO: renamed from: getAction-HpuvwBQ */
        public final int m3699getActionHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(0);
        }

        /* JADX INFO: renamed from: getComposition-HpuvwBQ */
        public final int m3700getCompositionHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3684objectParamName31yXWZQ(int i2) {
            return ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(0)) ? "anchor" : ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(1)) ? "composition" : super.mo3684objectParamName31yXWZQ(i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            ((Function1) operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(0))).invoke((Composition) operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(1)));
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<řaӝqYП\u0006\u001a,!ITTg̊rJh\u000b\f5\u0014\u0017\u0011jZK}x\f\u0015?:PsW7]oC:\u000fyf\t.8:8(\f1\u001e8P(v)L\u0012 ܞ4J"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq )\u0015c\n^\u00044GU]\u0015fQr\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "u(E", "3wT0h;>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class UseCurrentNode extends Operation {
        public static final int $stable = 0;
        public static final UseCurrentNode INSTANCE = new UseCurrentNode();

        private UseCurrentNode() {
            super(0, 0, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            Object current = applier.getCurrent();
            Intrinsics.checkNotNull(current, "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback");
            ((ComposeNodeLifecycleCallback) current).onReuse();
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012\u0006јnjG0Le^.ZS0\u0012s{B0c$wECU0}*ޛWN}gvϺb\u000bY\u000f\u000eǝ\u0001jBI]ތcݐ\u000fHԏ ?aL0B?`ҽ:\u0005.2jT\b\u0010\u0019\u001aXT@~\tPc\u0010\"0FqhTSaơ\u0019ŇĂB\"\u0007,jv\u0017\\V|u:](+ip_Wg>\u000fe\u0011VT-\u000e%tN/NKM\u0015Sh3\u000b`qW\u0003m\t\u0004\u00199^5,a\u0015gSh\u001b$\u0019;Q#\\!*l\tab\"&YSsM`\u000eV|)~Ɂ@\u0004\u0014\fUJdǭ\u001aɊ\u0007Ԅ\u008fsqՂDT\u001a`H\u0007\ti\u000753\tK3I\u001fvSw:GRe};ۃ\u001eƹ\u007f͙ƈZS\u05f8d\u00193V}[?Y̸=QV\r_ƿ\n2oj\u00020#ΫK\u0018"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq )\u0012b(]v\u0010QKN\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "u(E", "\u0010k^0^", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq #\u0004h,L\u0006\u0012CYJ4\\arJi", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "5dc\u000f_6<Y`a\u0006n=\u000fe\u001b", "u(8", "$`[BX", "5dc#T3NS`a\u0006n=\u000fe\u001b", "=aY2V;)O&z\u0003G(\u0005\t", "", ">`a.`,MS&", "=aY2V;)O&z\u0003G(\u0005\tv3K<n2u\u0003", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "3wT0h;>", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class UpdateNode extends Operation {
        public static final int $stable = 0;
        public static final UpdateNode INSTANCE = new UpdateNode();

        private UpdateNode() {
            super(0, 2, 1, null);
        }

        /* JADX INFO: renamed from: getValue-HpuvwBQ */
        public final int m3743getValueHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(0);
        }

        /* JADX INFO: renamed from: getBlock-HpuvwBQ */
        public final int m3742getBlockHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3684objectParamName31yXWZQ(int i2) {
            return ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(0)) ? "value" : ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(1)) ? "block" : super.mo3684objectParamName31yXWZQ(i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            ((Function2) operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(1))).invoke(applier.getCurrent(), operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(0)));
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0005%4\u0012\u0006\u0013nj?2LeV.ZS@\u000fsڔ<$q$yّCU0}*ޛWN}gvϺ`ƗC%إFx\u0019+\nZ~]ܫ\u00132Po\bK[vU9\u000f|f\t.;:8(\u0007G.ߋGƵͯ~EQ\u0016 ;\t\u0017H^%M3':\u0006l.1&jvf:Xlc;]33mP_?_^\u000f}\u0011Tg?\r%ud?\u0011MC\u0016=S1\t\tĀ?ǚ>мޮ\u0004gҊ+/au]9f\u0004d+9T%]!(\u0013ԫQՙ\u000bʬ̼NbׂT\u0012@y\u0001\u0002\u001b@ǌ\u000e\u000f/K4ǈ6\u0015\u0007\u00163z\u0012ՈDe"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq &\u0007k6_v\u0010QKN\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "u(E", "\u0011nd;g", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u001d\u0010r\u0017J\u0004#OL],i(", "5dc\u0010b<Gb`\u0004\u0004)\rao\u000f", "u(8", " d\\<i,\"\\\u0018~\u000e", "5dc\u001fX4Hd\u0019b\u0004],\u0010P4nJ\t`'`", "7mc\u001dT9:[\u0002z\u0003^", "", ">`a.`,MS&", "7mc\u001dT9:[\u0002z\u0003^s\u000f[\u0011m\u0001\u0014c", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "3wT0h;>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class RemoveNode extends Operation {
        public static final int $stable = 0;
        public static final RemoveNode INSTANCE = new RemoveNode();

        private RemoveNode() {
            super(2, 0, 2, null);
        }

        /* JADX INFO: renamed from: getRemoveIndex-jn0FJLE */
        public final int m3735getRemoveIndexjn0FJLE() {
            return IntParameter.m3711constructorimpl(0);
        }

        /* JADX INFO: renamed from: getCount-jn0FJLE */
        public final int m3734getCountjn0FJLE() {
            return IntParameter.m3711constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: intParamName-w8GmfQM */
        public String mo3683intParamNamew8GmfQM(int i2) {
            return IntParameter.m3713equalsimpl0(i2, IntParameter.m3711constructorimpl(0)) ? "removeIndex" : IntParameter.m3713equalsimpl0(i2, IntParameter.m3711constructorimpl(1)) ? MetricSummary.JsonKeys.COUNT : super.mo3683intParamNamew8GmfQM(i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            applier.remove(operationArgContainer.mo3747getIntw8GmfQM(IntParameter.m3711constructorimpl(0)), operationArgContainer.mo3747getIntw8GmfQM(IntParameter.m3711constructorimpl(1)));
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0005'4\u0012\u0006\u0013nj?2LeV.ZS@\u000fsڔ<$q$yّCU0}*ޛWN}gvϺ`ƗC%إFx\u0019+\nZ~]ܫ\u00132Po\bK[xU9\u000f~f\t.=:8(\u0007G.ߋGƵͯ~EQ\u0018 =\t\u0017H`%M3):\u0006l01&jxf:Xlc;]53mPa?_^\u0011}\u0011Ti?\r%wd?\u0011MC\u0016=S1\t\tĀ?ǚ>мޮ\u0004gҊ+/au]9f\u0004d+9T%]!(\u0013ԫQՙ\u000bʬ̼NbׂT\u0012@y\u0001\u0002\u001b@T$\u0014.`.[\u001c\u001dۣ\u000e\u008fsɁ֘?OؿbF\u0018|g>%)ı34A\u001elЁ}i\u0018V7\u0002$ڥ\":"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq !\u0011t,7\u0001&G\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "u(E", "\u0011nd;g", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u001d\u0010r\u0017J\u0004#OL],i(", "5dc\u0010b<Gb`\u0004\u0004)\rao\u000f", "u(8", "\u0014q^:", "5dc\u0013e6F\u001b\u001e\bE?\u0011ch", "\"n", "5dc!bsC\\c__E\f", "7mc\u001dT9:[\u0002z\u0003^", "", ">`a.`,MS&", "7mc\u001dT9:[\u0002z\u0003^s\u000f[\u0011m\u0001\u0014c", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "3wT0h;>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class MoveNode extends Operation {
        public static final int $stable = 0;
        public static final MoveNode INSTANCE = new MoveNode();

        private MoveNode() {
            super(3, 0, 2, null);
        }

        /* JADX INFO: renamed from: getFrom-jn0FJLE */
        public final int m3719getFromjn0FJLE() {
            return IntParameter.m3711constructorimpl(0);
        }

        /* JADX INFO: renamed from: getTo-jn0FJLE */
        public final int m3720getTojn0FJLE() {
            return IntParameter.m3711constructorimpl(1);
        }

        /* JADX INFO: renamed from: getCount-jn0FJLE */
        public final int m3718getCountjn0FJLE() {
            return IntParameter.m3711constructorimpl(2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: intParamName-w8GmfQM */
        public String mo3683intParamNamew8GmfQM(int i2) {
            return IntParameter.m3713equalsimpl0(i2, IntParameter.m3711constructorimpl(0)) ? "from" : IntParameter.m3713equalsimpl0(i2, IntParameter.m3711constructorimpl(1)) ? TypedValues.TransitionType.S_TO : IntParameter.m3713equalsimpl0(i2, IntParameter.m3711constructorimpl(2)) ? MetricSummary.JsonKeys.COUNT : super.mo3683intParamNamew8GmfQM(i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            applier.move(operationArgContainer.mo3747getIntw8GmfQM(IntParameter.m3711constructorimpl(0)), operationArgContainer.mo3747getIntw8GmfQM(IntParameter.m3711constructorimpl(1)), operationArgContainer.mo3747getIntw8GmfQM(IntParameter.m3711constructorimpl(2)));
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\bnjO0LeN.ZS8\u001bs{:&c$\u007fCCU0}*ޛWN}gvϺb\u000bY\u000f\u000eǝ\u0001jBI]ތcݐ\u000fHԏ ?aL0B?`ҽ:\u0005.2jT\b\u000e\u0019\u001aXR@~\tNc\u0010\"0FqhTSaơ\u0019ŇĂB\"\u0007*jt\u0017\\Vzu:]2+ip^Wg>\u000ee\u0011VT-\u000e%sN/NJM\u0015Sg3\u000b`pW\u0003m\b\u0004\u00199C5,ayg8h\u007fB\u0018YQCǥrΟ[ӤƢ_\u000bˏ/S{MV\u00126|K\u0018\u001bB\u001c\u0014\u0016)X.[!\u0015\nDߞtʺRó҉\u0001]۰\u0004~y8\u001d-\u000e8ڂ9$nTgބ5|6\u0004\u0005\u0013=ũ\u0005\u0006"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u001d\u0010q,[\u0006\u0015NV]:2", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "u(E", "\u000fmR5b9", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq #\u0004h,L\u0006\u0012CYJ4\\arJi", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iEt(?fS", "5dc\u000ea*A]&F]i<\u000e\u001b\fQ", "u(8", "\u0014q^:F3Hb\bzwe,", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014$Uz'7C", "5dc\u0013e6FA \t\nM(y\u0010/-b3\fQ\u0013s\u0003", "=aY2V;)O&z\u0003G(\u0005\t", "", ">`a.`,MS&", "=aY2V;)O&z\u0003G(\u0005\tv3K<n2u\u0003", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "3wT0h;>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class InsertSlots extends Operation {
        public static final int $stable = 0;
        public static final InsertSlots INSTANCE = new InsertSlots();

        private InsertSlots() {
            super(0, 2, 1, null);
        }

        /* JADX INFO: renamed from: getAnchor-HpuvwBQ */
        public final int m3705getAnchorHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(0);
        }

        /* JADX INFO: renamed from: getFromSlotTable-HpuvwBQ */
        public final int m3706getFromSlotTableHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3684objectParamName31yXWZQ(int i2) {
            return ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(0)) ? "anchor" : ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(1)) ? "from" : super.mo3684objectParamName31yXWZQ(i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            SlotTable slotTable = (SlotTable) operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(1));
            Anchor anchor = (Anchor) operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(0));
            slotWriter.beginInsert();
            slotWriter.moveFrom(slotTable, anchor.toIndexFor(slotTable), false);
            slotWriter.endInsert();
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\bnjO0LeN.ZS@\u000fs{:$c$\u007fOCU \u007f*\t]Nog\u0005JbŏK\u000f\u001c\u0016\u0001̓4Ikxe܈\u00172XoG\u074cSۖ=Oś%63\u001fr'>yڱ\u0005\u001a8HX\u0013\tOc\f@=pxH`%Q\u0015\u001a\u0018\u0007l\"G2תfޮɇLncI=3K\u0010P_?_^\u000fu\rtgW\u0015\u0005u6/P7;\u0016Sh3\u000b`qW\u0003m\tm\tv??+w\r\u001eJ)\u001c\"\u0016CU\u001d_\u0003&\u000b\b\u007fbB˳+\u05cbb֟ح\r'Þ~\u007f%>\n\u0012\u0014,\u0019J; ~\u000e\u001e5\u0005r\u0002G~\u0004\u0015ܔ\u007fҦ`ا҆$~Ĵ/=3hWiI\u001e\u001fS\n\u000e%$3\u0003~!\n^<bKĘTʦPĸӾ?<˓R\u000eq?s\u000f~g̦*\r8J\u0006\u009d\u0018?-\u001f%=zަ';"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u001d\u0010q,[\u0006\u0015NV]:NV\u0002@t\u0016m\u001eY9b", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "u(E", "\u000fmR5b9", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq #\u0004h,L\u0006\u0012CYJ4\\arJi", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iEt(?fS", "5dc\u000ea*A]&F]i<\u000e\u001b\fQ", "u(8", "\u0014hgBc:", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u000fQVKv\u001b\"#w7", "5dc\u0013\\?N^'F]i<\u000e\u001b\fQ", "\u0014q^:F3Hb\bzwe,", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014$Uz'7C", "5dc\u0013e6FA \t\nM(y\u0010/-b3\fQ\u0013s\u0003", "=aY2V;)O&z\u0003G(\u0005\t", "", ">`a.`,MS&", "=aY2V;)O&z\u0003G(\u0005\tv3K<n2u\u0003", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "3wT0h;>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class InsertSlotsWithFixups extends Operation {
        public static final int $stable = 0;
        public static final InsertSlotsWithFixups INSTANCE = new InsertSlotsWithFixups();

        private InsertSlotsWithFixups() {
            super(0, 3, 1, null);
        }

        /* JADX INFO: renamed from: getAnchor-HpuvwBQ */
        public final int m3707getAnchorHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(0);
        }

        /* JADX INFO: renamed from: getFromSlotTable-HpuvwBQ */
        public final int m3709getFromSlotTableHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(1);
        }

        /* JADX INFO: renamed from: getFixups-HpuvwBQ */
        public final int m3708getFixupsHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3684objectParamName31yXWZQ(int i2) {
            return ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(0)) ? "anchor" : ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(1)) ? "from" : ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(2)) ? "fixups" : super.mo3684objectParamName31yXWZQ(i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            SlotTable slotTable = (SlotTable) operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(1));
            Anchor anchor = (Anchor) operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(0));
            FixupList fixupList = (FixupList) operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(2));
            SlotWriter slotWriterOpenWriter = slotTable.openWriter();
            try {
                fixupList.executeAndFlushAllPendingFixups(applier, slotWriterOpenWriter, rememberManager);
                Unit unit = Unit.INSTANCE;
                slotWriterOpenWriter.close(true);
                slotWriter.beginInsert();
                slotWriter.moveFrom(slotTable, anchor.toIndexFor(slotTable), false);
                slotWriter.endInsert();
            } catch (Throwable th) {
                slotWriterOpenWriter.close(false);
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯR\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012\u0006јnj?1Le^.ZS0\u000fs{J$c$wCCU(\n*\tURog|Jb\u000bY\u000f\u000eǝ\u0001jBI]ތe\u0012%2JģG3coEʠfӢ6\u001bړb\"fxE\u0006 *Н\u0014v\tC\u0014$ =Xph`=Q\u0013)*\u0006l+G2תfޮɇLncJ=4K\u0006P`?_^\u000b}\u0015Tc?\u0011\u0007a$,n9{)ɥRΈ\u07baV]E\u0016M\u0003\u0006+v;?+w\t\u007f6\u0007\u0016D\u001d9f%a\u0003&b\u0006\u007fx<+9h{K~(X{\t\u0017%<2*L;\u0019R;\u001b~\u0016\u001e=\u0005zcD`\u0004tA.~\u00109E'6Ř+߆\u001aƘј`:ϭR;\u0014\u0007\u0013#1\u0007?=i[&f%\u001ddw\u007f9\u007fBs˷N͜XƝҠ\u0003oĊ\u0006.\u001c2M\t=\u0002aD%/O[g.WɄ\u0002ӿCϙѱ\u0004_ĈWmjJF.|\u001cն*\u0012\u0014]J\u0080!\u001aO\\X20ܜ q"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u001d\u0010q,[\u0006\u0010QKN\r`e\u0003Hi", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "u(E", "\u0014`RAb9R", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq #\u0004h,L\u0006\u0012CYJ4\\arJi", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "5dc\u0013T*M]&\u0013BA7\r\u001aABk", "u(8", "\u0015q^Bc\bGQ\u001c\t\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iEt(?fS", "5dc\u0014e6N^t\bxa6\nP\u0012p\u00109\u000e\u001dl", "\u0017mb2e;\"\\\u0018~\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u001d\u0010r\u0017J\u0004#OL],i(", "5dc\u0016a:>`(b\u0004],\u0010P4nJ\t`'`", "7mc\u001dT9:[\u0002z\u0003^", "", ">`a.`,MS&", "7mc\u001dT9:[\u0002z\u0003^s\u000f[\u0011m\u0001\u0014c", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "=aY2V;)O&z\u0003G(\u0005\t", "=aY2V;)O&z\u0003G(\u0005\tv3K<n2u\u0003", "3wT0h;>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class InsertNodeFixup extends Operation {
        public static final int $stable = 0;
        public static final InsertNodeFixup INSTANCE = new InsertNodeFixup();

        private InsertNodeFixup() {
            super(1, 2, null);
        }

        /* JADX INFO: renamed from: getFactory-HpuvwBQ */
        public final int m3702getFactoryHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(0);
        }

        /* JADX INFO: renamed from: getInsertIndex-jn0FJLE */
        public final int m3704getInsertIndexjn0FJLE() {
            return IntParameter.m3711constructorimpl(0);
        }

        /* JADX INFO: renamed from: getGroupAnchor-HpuvwBQ */
        public final int m3703getGroupAnchorHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: intParamName-w8GmfQM */
        public String mo3683intParamNamew8GmfQM(int i2) {
            return IntParameter.m3713equalsimpl0(i2, IntParameter.m3711constructorimpl(0)) ? "insertIndex" : super.mo3683intParamNamew8GmfQM(i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3684objectParamName31yXWZQ(int i2) {
            return ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(0)) ? "factory" : ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(1)) ? "groupAnchor" : super.mo3684objectParamName31yXWZQ(i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            Object objInvoke = ((Function0) operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(0))).invoke();
            Anchor anchor = (Anchor) operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(1));
            int iMo3747getIntw8GmfQM = operationArgContainer.mo3747getIntw8GmfQM(IntParameter.m3711constructorimpl(0));
            Intrinsics.checkNotNull(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            slotWriter.updateNode(anchor, objInvoke);
            applier.insertTopDown(iMo3747getIntw8GmfQM, objInvoke);
            applier.down(objInvoke);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\bnjO0LeN.ZS8\u001bs{:(c$\u007fCCU0}*ޛWN}gvϺb\u000bY\u000f\u000eǝ\u0001jBI]ތcݐ\u000fHԏ ?aL0B?`ҽ:\u0005.2jP\b\u000e\u0019\u001aXR@z\tNc\f@7\u0007\u0005ŦQ҈̂\t\u001c\u0018\u0012L-I:juf6vv\u000eB=.\u001bmRN-`^~\u0014!ѸS܋˼zc$:ND};3c\u001b\u0007\u0001lg\u0003m\u0004m\rv:?/Ys]7\u0007\u0014D\u00199d%]!<\r\t_w$'Yg*_!*6x\u0013\u0002\u001d>\u0014\u000e4*v0cֆfܕ\rޗиqRĖT\u0006vD\u0006~o;g;\u000e9C9Im\bŬ;уMљ\u009e\u0004\f̷'\u0005\u0007#a\\\u001ceڀ\u001b]\u007fT7ҧ\\kGV\n_\\ѐ\b\n"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq $\u0011q;2\u007f5GY]\u0015fQr\u001e\u0018%j\u0019$", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "u(E", "\u0015q^Bc\bGQ\u001c\t\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq #\u0004h,L\u0006\u0012CYJ4\\arJi", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iEt(?fS", "5dc\u0014e6N^t\bxa6\nP\u0012p\u00109\u000e\u001dl", "u(8", "\u0017mb2e;\"\\\u0018~\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u001d\u0010r\u0017J\u0004#OL],i(", "5dc\u0016a:>`(b\u0004],\u0010P4nJ\t`'`", "7mc\u001dT9:[\u0002z\u0003^", "", ">`a.`,MS&", "7mc\u001dT9:[\u0002z\u0003^s\u000f[\u0011m\u0001\u0014c", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "=aY2V;)O&z\u0003G(\u0005\t", "=aY2V;)O&z\u0003G(\u0005\tv3K<n2u\u0003", "3wT0h;>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class PostInsertNodeFixup extends Operation {
        public static final int $stable = 0;
        public static final PostInsertNodeFixup INSTANCE = new PostInsertNodeFixup();

        private PostInsertNodeFixup() {
            super(1, 1, null);
        }

        /* JADX INFO: renamed from: getInsertIndex-jn0FJLE */
        public final int m3729getInsertIndexjn0FJLE() {
            return IntParameter.m3711constructorimpl(0);
        }

        /* JADX INFO: renamed from: getGroupAnchor-HpuvwBQ */
        public final int m3728getGroupAnchorHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: intParamName-w8GmfQM */
        public String mo3683intParamNamew8GmfQM(int i2) {
            return IntParameter.m3713equalsimpl0(i2, IntParameter.m3711constructorimpl(0)) ? "insertIndex" : super.mo3683intParamNamew8GmfQM(i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3684objectParamName31yXWZQ(int i2) {
            return ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(0)) ? "groupAnchor" : super.mo3684objectParamName31yXWZQ(i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            Anchor anchor = (Anchor) operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(0));
            int iMo3747getIntw8GmfQM = operationArgContainer.mo3747getIntw8GmfQM(IntParameter.m3711constructorimpl(0));
            applier.up();
            Intrinsics.checkNotNull(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            applier.insertBottomUp(iMo3747getIntw8GmfQM, slotWriter.node(anchor));
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<řaӝqYП\u0006\u001a,!ITTg̊rJh\u000b\f5\u0014\u0017\u0011jZK}x\f\u0015?:PsW7]oC:\u000fyf\t.8:8(\f1\u001e8P(v)L\u0012 ܞ4J"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u0018\u0007_*]z8C[N\nl_\u007f=\u001d!<\u001bX;\u0018Z", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "u(E", "3wT0h;>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DeactivateCurrentGroup extends Operation {
        public static final int $stable = 0;
        public static final DeactivateCurrentGroup INSTANCE = new DeactivateCurrentGroup();

        private DeactivateCurrentGroup() {
            super(0, 0, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            ComposerKt.deactivateCurrentGroup(slotWriter, rememberManager);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<řaӝqYП\u0006\u001a,!ITTg̊rJh\u000b\f5\u0014\u0017\u0011jZK}x\f\u0015?:PsW7]oC:\u000fyf\t.8:8(\f1\u001e8P(v)L\u0012 ܞ4J"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq &\u0007q,]d.Q[\\\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "u(E", "3wT0h;>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class ResetSlots extends Operation {
        public static final int $stable = 0;
        public static final ResetSlots INSTANCE = new ResetSlots();

        private ResetSlots() {
            super(0, 0, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.reset();
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\bnjO0LeN.ZS8\u001bs{:&c$\u007fCCU0}*ޛWN}gvϺb\u000bY\u000f\u000eǝ\u0001jBI]ތcݐ\u000fHԏ ?aL0B?`ҽ:\u0005.2jT\b\u000e\u0019\u001aXR@~\tNc\u0010\"0FqhTSaơ\u0019ŇĂB\"\u0007*jt\u0017\\Vzu:]2+ip^Wg>\u000ee\u0011VT-\u000e%sN/NJM\u0015Sg3\u000b`pW\u0003m\b\u0004\u00199C5,ayg8h\u007fB\u0018YQCǥrΟ[ӤƢ_\u000bˏ/S{MV\u00126|K\u0018\u001bB\u001c\u0014\u0016)X.[!\u0015\nDߞtʺRó҉\u0001]۰\u0004~y8\u001d-\u000e8ڂ9$nTgބ5|6\u0004\u0005\u0013=ũ\u0005\u0006"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u0018\u0007r,[~+PL66mNoD\u0014od\u0017]+\u0016\u0014BK#n(@\u001e\b?\u001f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "u(E", "\u000fmR5b9", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq #\u0004h,L\u0006\u0012CYJ4\\arJi", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iEt(?fS", "5dc\u000ea*A]&F]i<\u000e\u001b\fQ", "u(8", "\u0013eU2V;Bd\u0019g\u0005],`\u0012.e\u0013\u0012\fO", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u0012E\u0006%Bby'\u0001Q\u001f=:C<A", "5dc\u0012Y->Q(\u0003\f^\u0015\u0007\b/I\t'{Sj'&\u000fR\u0019L\b7\u0012E", "=aY2V;)O&z\u0003G(\u0005\t", "", ">`a.`,MS&", "=aY2V;)O&z\u0003G(\u0005\tv3K<n2u\u0003", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "3wT0h;>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DetermineMovableContentNodeIndex extends Operation {
        public static final int $stable = 0;
        public static final DetermineMovableContentNodeIndex INSTANCE = new DetermineMovableContentNodeIndex();

        private DetermineMovableContentNodeIndex() {
            super(0, 2, 1, null);
        }

        /* JADX INFO: renamed from: getEffectiveNodeIndexOut-HpuvwBQ */
        public final int m3697getEffectiveNodeIndexOutHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(0);
        }

        /* JADX INFO: renamed from: getAnchor-HpuvwBQ */
        public final int m3696getAnchorHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3684objectParamName31yXWZQ(int i2) {
            return ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(0)) ? "effectiveNodeIndexOut" : ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(1)) ? "anchor" : super.mo3684objectParamName31yXWZQ(i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            IntRef intRef = (IntRef) operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(0));
            Anchor anchor = (Anchor) operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(1));
            Intrinsics.checkNotNull(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            intRef.setElement(OperationKt.positionToInsert(slotWriter, anchor, applier));
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\bnjGNLeV\u008cZS0\u000fs{B0c$wECU(}*\teNo˧vJp\u000bKƤ\u000e\u0016\u000fj4կ]xs\u0012\u0017˰Hū?Iݹ =g_5;\u000b ݨ&8\b\u0005I68R(v)N{\u0014 <XtJR\u0013N3\u001cX\u001aͽ\u001fҵɉ`iTCVz&`=2\u001bip^O_^\u000e}\u0015Tf?\u0011\u0007a$,nJe\u00193g\u001b\u0007\u0001po\u0007M\bU\u0005\u0017>m?\u001a\u0010e7p\u0006$\u0017;O;`!(\u0013ԫQՙ\u000bʬ̼NbׂT\u0012@y\u0001\u007f\u001bAT2\u0014-`<=$v\u0010\u001e7\u0005ti?~\n\rI.|\u0018ٮ\u0017Ք~đ۸8\u001aƻUeS\u001bT@\n\nٿ\u001e,\tq'ƞp<_\u001d\u001bZ\u0017ά5i"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u0017\u0011n@7\u0001&GZ=6ER\u0005\u0019\u001d\u0010]\u0018[\u0012\u0017\u0003UP(xM\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "u(E", "\u0013eU2V;Bd\u0019g\u0005],`\u0012.e\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq #\u0004h,L\u0006\u0012CYJ4\\arJi", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u0012E\u0006%Bby'\u0001Q\u001f=:C<A", "5dc\u0012Y->Q(\u0003\f^\u0015\u0007\b/I\t'{SHy\"W\u0001 \u0019b", "u(8", "\u001cnS2f", "", "", "5dc\u001bb+>a`a\u0006n=\u000fe\u001b", "=aY2V;)O&z\u0003G(\u0005\t", "", ">`a.`,MS&", "=aY2V;)O&z\u0003G(\u0005\tv3K<n2u\u0003", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "3wT0h;>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class CopyNodesToNewAnchorLocation extends Operation {
        public static final int $stable = 0;
        public static final CopyNodesToNewAnchorLocation INSTANCE = new CopyNodesToNewAnchorLocation();

        private CopyNodesToNewAnchorLocation() {
            super(0, 2, 1, null);
        }

        /* JADX INFO: renamed from: getEffectiveNodeIndex-HpuvwBQ */
        public final int m3690getEffectiveNodeIndexHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(0);
        }

        /* JADX INFO: renamed from: getNodes-HpuvwBQ */
        public final int m3691getNodesHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3684objectParamName31yXWZQ(int i2) {
            return ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(0)) ? "effectiveNodeIndex" : ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(1)) ? "nodes" : super.mo3684objectParamName31yXWZQ(i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            int element = ((IntRef) operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(0))).getElement();
            List list = (List) operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(1));
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                Intrinsics.checkNotNull(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                int i3 = element + i2;
                applier.insertBottomUp(i3, obj);
                applier.insertTopDown(i3, obj);
            }
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\bnjO0LeN.ZS@\u000fs{:&c$\u007fOCU \u007f*\t]Nog\u0005JbŏK\u000f\u001c\u0016\u0001̓4Ikxe܈\u00172XoG\u074cSۖ=Oś%63\u001fr'>yڱ\u0005\u001a8HX\u0013\tQc\f@?pxHb%Q\u0015\u001a\u0018\u0007l\"G2תfޮɇLncK=5K\u0010Pa?_^\u0011u\rtiW\u0015\u0005w6/P7;\u0016Sj3\u000b`sW\u0003m\u000bm\tvA?+w\u000f\u001eJ)\u001c\"\u0016CU\u001d_\u0003&\u000b\b\u007fbB˳+\u05cbb֟ح\r'Þ~\u007f%>\n\u0012\u0014,\u0019J; ~\u000e\u001e5\u0005r\u0002G~\u0004\u0015ܔ\u007fҦ`ا҆$~Ĵ/=3hWiI\u001e\u001fU\n\u000e%&3\u0005~#qS<jC\u001d\u000bɴQƱP̵عGM̆]A\u0006\u0006vm\u0010/TLU\fG\u0002!0'%e^g%WɄ\u0002ӿCϙѱ\u0004_ĈWmjJF/|\u001bն*\u0012\u0014]J\u0080!\u001aO\\X20ܜ p"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u0017\u0011n@<}1V;J)cRaGo\u001bX\u0011X8s\u000fW=3rN@t", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "u(E", "\u0014q^:", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq #\u0004h,L\u0006\u0012CYJ4\\arJi", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uF\b!2`}}Av%.VR)z0-\u0015Ua:\u0007p,Wt'\u001d", "5dc\u0013e6F\u001b{\n\u000bo>Yt", "u(8", "\u001e`a2a;\u001c]!\n\u0005l0\f\r9n]2\u0005O\u0001*&", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\fWLJkG-j", "5dc\u001dT9>\\(\\\u0005f7\u0007\u00173t\u00042\u0005\u001e\u000b &G\u0003\u001d\u0004Y0Ej\u0010|#", " db<_=>R\u0007\u000evm,", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uF\b!2`}}Av%.VR)z0-\u0015>", "5dc\u001fX:HZ*~yL;x\u0018/-b3\fQ\u0013s\u0003", "\"n", "5dc!bs!^)\u0010\r;\u0018", "=aY2V;)O&z\u0003G(\u0005\t", "", ">`a.`,MS&", "=aY2V;)O&z\u0003G(\u0005\tv3K<n2u\u0003", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "3wT0h;>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class CopySlotTableToAnchorLocation extends Operation {
        public static final int $stable = 0;
        public static final CopySlotTableToAnchorLocation INSTANCE = new CopySlotTableToAnchorLocation();

        private CopySlotTableToAnchorLocation() {
            super(0, 4, 1, null);
        }

        /* JADX INFO: renamed from: getResolvedState-HpuvwBQ */
        public final int m3694getResolvedStateHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(0);
        }

        /* JADX INFO: renamed from: getParentCompositionContext-HpuvwBQ */
        public final int m3693getParentCompositionContextHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(1);
        }

        /* JADX INFO: renamed from: getFrom-HpuvwBQ */
        public final int m3692getFromHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(2);
        }

        /* JADX INFO: renamed from: getTo-HpuvwBQ */
        public final int m3695getToHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(3);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3684objectParamName31yXWZQ(int i2) {
            return ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(0)) ? "resolvedState" : ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(1)) ? "resolvedCompositionContext" : ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(2)) ? "from" : ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(3)) ? TypedValues.TransitionType.S_TO : super.mo3684objectParamName31yXWZQ(i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            MovableContentStateReference movableContentStateReference = (MovableContentStateReference) operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(2));
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(3));
            CompositionContext compositionContext = (CompositionContext) operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(1));
            MovableContentState movableContentStateMovableContentStateResolve$runtime_release = (MovableContentState) operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(0));
            if (movableContentStateMovableContentStateResolve$runtime_release == null && (movableContentStateMovableContentStateResolve$runtime_release = compositionContext.movableContentStateResolve$runtime_release(movableContentStateReference)) == null) {
                ComposerKt.composeRuntimeError("Could not resolve state for movable content");
                throw new KotlinNothingValueException();
            }
            List<Anchor> listMoveIntoGroupFrom = slotWriter.moveIntoGroupFrom(1, movableContentStateMovableContentStateResolve$runtime_release.getSlotTable$runtime_release(), 2);
            RecomposeScopeImpl.Companion companion = RecomposeScopeImpl.Companion;
            ControlledComposition composition$runtime_release = movableContentStateReference2.getComposition$runtime_release();
            Intrinsics.checkNotNull(composition$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeOwner");
            companion.adoptAnchoredScopes$runtime_release(slotWriter, listMoveIntoGroupFrom, (RecomposeScopeOwner) composition$runtime_release);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<řaӝqYП\u0006\u001a,!ITTg̊rJh\u000b\f5\u0014\u0017\u0011jZK}x\f\u0015?:PsW7]oC:\u000fyf\t.8:8(\f1\u001e8P(v)L\u0012 ܞ4J"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u0019\u0010b\u0014X\b#DSN\nf[\u0002=\u001d!E\u0015J)\r\rYJ3D", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "u(E", "3wT0h;>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class EndMovableContentPlacement extends Operation {
        public static final int $stable = 0;
        public static final EndMovableContentPlacement INSTANCE = new EndMovableContentPlacement();

        private EndMovableContentPlacement() {
            super(0, 0, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            Intrinsics.checkNotNull(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            OperationKt.positionToParentOf(slotWriter, applier, 0);
            slotWriter.endGroup();
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\bnjO0LeN.ZS@\u000fs{:$c$\u007fOCU \u007f*\t]Nog\u0005JbŏK\u000f\u001c\u0016\u0001̓4Ikxe܈\u00172XoG\u074cSۖ=Oś%63\u001fr'>yڱ\u0005\u001a8HX\u0013\tOc\f@=pxH`%Q\u0015\u001a\u0018\u0007l\"G2תfޮɇLncI=3K\u0010P_?_^\u000fu\rtgW\u0015\u0005u6/P7;\u0016Sh3\u000b`qW\u0003m\tm\tv??+w\r\u001eJ)\u001c\"\u0016CU\u001d_\u0003&\u000b\b\u007fbB˳+\u05cbb֟ح\r'Þ~\u007f%>\n\u0012\u0014,\u0019J; ~\u000e\u001e5\u0005r\u0002G~\u0004\u0015ܔ\u007fҦ`ا҆$~Ĵ/=3hWiI\u001e\u001fS\n\u000e%$3\u0003~!\n^<bKĘTʦPĸӾ?<˓R\u000eq?s\u000f~g̦*\r8J\u0006\u009d\u0018?-\u001f%=zަ';"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq &\u0007j,J\u0005'/V_(YYr\u001f!\u001cj\u0019*:j\u0015fN$wS\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "u(E", "\u0011n\\=b:Bb\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq #\u0004h,L\u0006\u0012CYJ4\\arJi", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF\u007f4Bc\u0005'7ls8UNEy8-\u0019rj\u000f", "5dc\u0010b4I]'\u0003\nb6\u0006P\u0012p\u00109\u000e\u001dl", "u(8", "\u001e`a2a;\u001c]!\n\u0005l0\f\r9n]2\u0005O\u0001*&", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\fWLJkG-j", "5dc\u001dT9>\\(\\\u0005f7\u0007\u00173t\u00042\u0005\u001e\u000b &G\u0003\u001d\u0004Y0Ej\u0010|#", " dU2e,GQ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uF\b!2`}}Av%.VR)z0-\u0015Ua:\u0007p,Wt'\u001d", "5dc\u001fX->`\u0019\bx^s_\u0014?v\u0012\u0005g", "=aY2V;)O&z\u0003G(\u0005\t", "", ">`a.`,MS&", "=aY2V;)O&z\u0003G(\u0005\tv3K<n2u\u0003", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "3wT0h;>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class ReleaseMovableGroupAtCurrent extends Operation {
        public static final int $stable = 0;
        public static final ReleaseMovableGroupAtCurrent INSTANCE = new ReleaseMovableGroupAtCurrent();

        private ReleaseMovableGroupAtCurrent() {
            super(0, 3, 1, null);
        }

        /* JADX INFO: renamed from: getComposition-HpuvwBQ */
        public final int m3730getCompositionHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(0);
        }

        /* JADX INFO: renamed from: getParentCompositionContext-HpuvwBQ */
        public final int m3731getParentCompositionContextHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(1);
        }

        /* JADX INFO: renamed from: getReference-HpuvwBQ */
        public final int m3732getReferenceHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3684objectParamName31yXWZQ(int i2) {
            return ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(0)) ? "composition" : ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(1)) ? "parentCompositionContext" : ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(2)) ? "reference" : super.mo3684objectParamName31yXWZQ(i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            OperationKt.releaseMovableGroupAtCurrent((ControlledComposition) operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(0)), (CompositionContext) operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(1)), (MovableContentStateReference) operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(2)), slotWriter);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\bnjO0LeN.ZS8\u001bs{:&c$\u007fCCU0}*ޛWN}gvϺb\u000bY\u000f\u000eǝ\u0001jBI]ތcݐ\u000fHԏ ?aL0B?`ҽ:\u0005.2jT\b\u000e\u0019\u001aXR@~\tNc\u0010\"0FqhTSaơ\u0019ŇĂB\"\u0007*jt\u0017\\Vzu:]2+ip^Wg>\u000ee\u0011VT-\u000e%sN/NJM\u0015Sg3\u000b`pW\u0003m\b\u0004\u00199C5,ayg8h\u007fB\u0018YQCǥrΟ[ӤƢ_\u000bˏ/S{MV\u00126|K\u001a\u001bB\u001c\u0016\u0016+X0C\u0019\u0015\u000f<5+ʈSŬO\u061c\u0081A~ѐe:/'\u0006;9>ӘfZi>\u001f\u05edS*\u0004\u0015\u001e) \u0382%r"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u0015\u0012n3bT*CUP,CV\u0001Li", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "u(E", "\u0011gP;Z,L", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq #\u0004h,L\u0006\u0012CYJ4\\arJi", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\fP?Dm4\u0005\u0019vp\u000f", "5dc\u0010[(GU\u0019\rBA7\r\u001aABk", "u(8", "\u0013eU2V;Bd\u0019g\u0005],`\u0012.e\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u0012E\u0006%Bby'\u0001Q\u001f=:C<A", "5dc\u0012Y->Q(\u0003\f^\u0015\u0007\b/I\t'{SHy\"W\u0001 \u0019b", "=aY2V;)O&z\u0003G(\u0005\t", "", ">`a.`,MS&", "=aY2V;)O&z\u0003G(\u0005\tv3K<n2u\u0003", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "3wT0h;>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class ApplyChangeList extends Operation {
        public static final int $stable = 0;
        public static final ApplyChangeList INSTANCE = new ApplyChangeList();

        private ApplyChangeList() {
            super(0, 2, 1, null);
        }

        /* JADX INFO: renamed from: getChanges-HpuvwBQ */
        public final int m3688getChangesHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(0);
        }

        /* JADX INFO: renamed from: getEffectiveNodeIndex-HpuvwBQ */
        public final int m3689getEffectiveNodeIndexHpuvwBQ() {
            return ObjectParameter.m3722constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3684objectParamName31yXWZQ(int i2) {
            return ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(0)) ? "changes" : ObjectParameter.m3724equalsimpl0(i2, ObjectParameter.m3722constructorimpl(1)) ? "effectiveNodeIndex" : super.mo3684objectParamName31yXWZQ(i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            IntRef intRef = (IntRef) operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(1));
            int element = intRef != null ? intRef.getElement() : 0;
            ChangeList changeList = (ChangeList) operationArgContainer.mo3748getObject31yXWZQ(ObjectParameter.m3722constructorimpl(0));
            if (element > 0) {
                applier = new OffsetApplier(applier, element);
            }
            changeList.executeAndFlushAllPendingChanges(applier, slotWriter, rememberManager);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯR\u001d<K!&i\u0016DLш|\u0004O\f8\u000b4B\u0007\"B\u0012\u007f\u0007|jA0ZeP.hS2\u000fy{<$a&yCIs\"}8\tWNmhvJp\u000bK\u000f\u0014ǝ\u0001j2I]xk\u001e\u0017˰JoU3UoC;fyLӌP2P7:D\u0007\u001f:N\u0016v\tCc\f@1Pv@R\u001bO\u001d\u001a@\u0007NB\u0007\u001ejjfRXrm>?#\tjpS7a@|{\u0013VV7\r%h.-P7c\u001dSWΫ\u000bRiHKE\u007fR\u001dhU=q]<}Do\u0018\u0014C3w\r\f\u000bVd\u0013jx\u00107+UdyU>,\u0006\u0015\u0014\rj\n>\n5cF-HmN\"\u0004 \u0001VXl\u0012dR\u0004\u000ba<\u0018S\u0005C-I\u001b\u0015Wq=)Ne\u0003\u0015\u000f.#/vO_ڍ\u0012f\u001dÑlyW;_K\u000e]\\\u0016qC}\u0006\u0001b082=Ͻ\u00045\u0004߾F\u0019+FiIs>y\u0013`Rw\u0001\u0015hxWyT^?P\u0002DIX\u0016ɔ^Jlʍ\u0004RZl:!ܜ p"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq (\u0007q;8\u0002'TH]0f[H", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "7mc@", "", "=aY2V;L", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "", "uH8\u0019^6MZ\u001d\bDc=\u0005R0u\t&\u000bD\u000b %\u0011P\u001eEt49c\u0007m\r1\u0007", "5dc\u000f_6<Y", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bKu", "7mc\u001dT9:['", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u001d\u0010r\u0017J\u0004#OL],i(", "5dc\u0016a;)O&z\u0003l", "u(;7T=:\u001d)\u000e~euc\r=tU", "=aY\u001dT9:['", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq #\u0004h,L\u0006\u0012CYJ4\\arJi", "", "5dc\u001cU1)O&z\u0003l", "BnBAe0GU", "", "3wT0h;>", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "/o_9\\,K", "Ak^Af", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class TestOperation extends Operation {
        public static final int $stable = 8;
        private final Function3<Applier<?>, SlotWriter, RememberManager, Unit> block;
        private final List<IntParameter> intParams;
        private final List<ObjectParameter<Object>> objParams;

        public TestOperation() {
            this(0, 0, null, 7, null);
        }

        /* JADX INFO: renamed from: androidx.compose.runtime.changelist.Operation$TestOperation$1 */
        /* JADX INFO: compiled from: Operation.kt */
        /* JADX INFO: loaded from: classes.dex */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u001c\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑGӄ\\ev-\u0003[8\u000f\u0004\u007fD$a% DkY(\u007f:\t}Q\u0018k|Nr\u000bq\u0014L\u001eѱn,O["}, d2 = {"\n`]<a@F])\rS", "", "\n`]<a@F])\r5i(\n\u00057e\u000f(\tzKo", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "\n`]<a@F])\r5i(\n\u00057e\u000f(\tzLo", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "\n`]<a@F])\r5i(\n\u00057e\u000f(\tzMo", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass1 extends Lambda implements Function3<Applier<?>, SlotWriter, RememberManager, Unit> {
            public static final AnonymousClass1 INSTANCE = ;

            AnonymousClass1() {
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                invoke2(applier, slotWriter, rememberManager);
                return Unit.INSTANCE;
            }
        }

        public /* synthetic */ TestOperation(int i2, int i3, AnonymousClass1 anonymousClass1, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 + 1) - (1 | i4) != 0 ? 0 : i2, (-1) - (((-1) - i4) | ((-1) - 2)) != 0 ? 0 : i3, (i4 & 4) != 0 ? AnonymousClass1.INSTANCE : anonymousClass1);
        }

        public final Function3<Applier<?>, SlotWriter, RememberManager, Unit> getBlock() {
            return this.block;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TestOperation(int i2, int i3, Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> function3) {
            super(i2, i3, null);
            this.block = function3;
            ArrayList arrayList = new ArrayList(i2);
            for (int i4 = 0; i4 < i2; i4++) {
                arrayList.add(IntParameter.m3710boximpl(IntParameter.m3711constructorimpl(i4)));
            }
            this.intParams = arrayList;
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i5 = 0; i5 < i3; i5++) {
                arrayList2.add(ObjectParameter.m3721boximpl(ObjectParameter.m3722constructorimpl(i5)));
            }
            this.objParams = arrayList2;
        }

        public final List<IntParameter> getIntParams() {
            return this.intParams;
        }

        public final List<ObjectParameter<Object>> getObjParams() {
            return this.objParams;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            this.block.invoke(applier, slotWriter, rememberManager);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public String toString() {
            return "TestOperation(ints = " + getInts() + ", objects = " + getObjects() + ")@" + Utils_jvmKt.identityHashCode(this);
        }
    }
}
