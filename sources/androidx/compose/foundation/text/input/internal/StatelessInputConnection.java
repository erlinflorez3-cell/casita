package androidx.compose.foundation.text.input.internal;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldCharSequenceKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: StatelessInputConnection.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яŀ\u0014D57\u001eq\u007fZDkŞ\fA\u001c0\u0013ǞJ~8,\u001aw\rfr9>JmH4T[*%k\u00044:[,qY;]\u001a\f\"\u0011OdgoñRZ\u0011D\u0017\u0006,xr,OX\u0001] \u0018:BuB;M\u0006=A`z6\r H\"@y\u000b\u0001\"*^\u0010~zIK\u0014\u0012F@xíZ\r[\u0010\"\u0012\fG(\u00014\\oޮ>H\u0003]Bǂ+\u0003\u007fBV'e4\u0005M\u001bR\\'\u0013zi\u001eA@?ߎ\u001d%i\u0003\u000fѸc?\u0019?y=\u000bj/'AI{Ɏ>X\u0016\u0014\u001d+U\u0011er<\\\rQf\u0012O*`i֟fʫXw)zMO\u0014\u0012\u0014'`.[\u001bv\f\u001c5\rr\u0002Cг\u0006^P\u0004C\u0001D.=\u007fa9i0tiyL)PG{3\u001a.%\u0011nOi\u0003\u001a\u05ce\u0019\u001bZ\u0007\u00181\u001aFKaf\n\bW4\u00189h\u0010E\u001c0u\u001au{Y<%AO[g=Qo\u0010e\\g%\u000b'|\u001co`fX\"\u001d$}>Q\u001chc|\u0005\u001aj\u0005^:$e\u001ej\u0006,(Y4%\u0018JB=\u0010|i\u0019mxou\nSR\u0017;g\u0013\u0004\u000e\u0006?\u000f9Cv{\u0012wQ%:\u0006P+\u0015f\u000eZS:t\r.0Z`l&v*m\u0015 [JM\u001c44ZKIb#[\u001b X@+4\u0010^v<\u0017Ta*I}l\u000b\u0017.h\\\u001f\n\u0018|WZ\u0015`P3qUCH>UPnz\u0011k\u001d\r$\u0018G\u0016fwPzD\u000eU*&F\u001eG\u0001G=A\u0015E=z\b;vdr\u0014k\u0014&o\u0001\u000b,';\u0017H.\b3v:\u0014\u0003J}n]6?l\u0001W d.\u007f\u0012J\t|{T9a\u0005];\u001bgrf8+<O$39\b$\u00134[|W!$\u001c,/Cg$}86\b\u001d'(\u000bd2g**8r_\u001aJ=NH\b*n&2\u0011\u001bBvp>\u001c\u000b\u001fBJKHo\u0010!ZF\f#/,l70\u001b\u0015n[h\u00196\u0012|Dmi\fC,?\u000fG3OeS\u0016s\u001eOj/b\u000f8\u0011BE7 *}8V\u0006p94\u0014506o})\u0005\u0005\u00172wD<6%sXwJ(z.L&#_@P9SV<n)`d\u000f\u001d`sfg>I!\u001dz6xc?5qT\u001dGc`J\u0004#\u0017e\u0003Q\u0015eSvtZGg@Z\u0017\ns+\n]JP\u0012\u0016Am\u001a\n<>&L5D.\u001ag\u0014Ae\u0005\u0001v\rkc|\u000b=&/j\\sA~)\u0017>@\u0018W#\u0019}E h; fyMBHU]Xq\u0015\u001aR{FIG69;\u0014ajBABk\u001cI\f_8 U\u001e%%j0&f8caN^\u007f$<\u001a\tAjP\b<%\rr8\nNJ\u0018\u0010A^+^\by(%N\u0005Cl4H\u0012hA qK{n\u0004%3j?6\u0012n[VM\r5.F\u0013\u0007`\u0001%\u001c8fr\u0018\u0014C@O<\u0016uA\u0012eb\u0017\u001c\u001cSi9C/\u001a0(Exh,`7y$\u001eZX6tSV{D\u0015\rjMZW<d1<5\u0001\u001a.,|-N5ƺ\u001f̭Jr&ҋ\u007fI'&s\ru_]ʚGõ*'9ĜO\u001d=:\u0019xx\u001a\u001f\rRy\u0005\u0013:S\u0019t\u0010gZ:VVM\u001aUgRy҉\u0007&QTfM^Ϸ\u0013ã\u0015/b߀pJj\u001a4;\u007f4\u0018˕\u0013ܗ\u00198\u000eˏW'CziSS;Wθ\u0003°C{9kH\u0006\b\u00051B'oIk\u001d{{ˢgͺ+\u0010\u001agP\u0014[yȧ\u0013E"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PQ;J\u0006'NL\\:@[}M#od\u0017W+\u000b\u0014]K-D", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9qE\u00025D7\b)@m\u0014=QMDA", "Adb@\\6G", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\u000bPW^;JR\u0001K\u0018\u001ccc", "3cXAb9\"\\\u001a\t", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9m;z4?fa)8wk", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005o=-\u0015uj5\u000e-\u001bN\n6+UY<k@rK\"\u0016d\u0017$\u0012\t\u000eXN.rC\u00010\f,[K?q\f\u001c%\u00165ysLUY'x\u0019\u0005K6LOZiO\u000b2", "0`c0[\u000b>^(\u0002", "", "1n\\:\\;\u001c]\"\u000ezg;[\t6e\u0002$\u000b@d \"W~kF\u007f.5W\r$Av", "5dc\u0010b4FW(\\\u0005g;|\u0012>D\u007f/{B|&\u0017+x\u0019L\u0006\u0003?b\u0007 5|\u001a8V\u00027t=($dp=\u0011l:", "u(E", "3cXA66F[\u0015\byl", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011p\u0002", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PC+R\u0006+PN+<]SrJi", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "Bda:\\5:Z|\b\u0006n;Z\u00138n\u007f&\u000bD\u000b ", "/mS?b0=fb|\u0005f7\u0007\u0017//\u00012\fI\u007f\u0013&Ky\u0017\u0006\u0006%HhG$@x&=\u0017GDz4+\u001edh\u0003tr(]v.GZ\\\u0010e]\u0003Lq\u001cc\u0017N)\u001c\tcJb}DD'\f5E\t\u001fq\f\u001c%k?syBT\u001fK\u0004\u001e4\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PQ;J\u0006'NL\\:@[}M#od\u0017W+\u000b\u0014]K--S7,\u00100R}BL\n\u0017&\u001d\u0013tyKV\u000eV}\u001f~\u007ft>", "BdgA", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006A/J\u0004\u0015GX^,ePr\u0013", "5dc!X?M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ5#\u001e(wB=\u0007j+,y#T:N8lR{;\u0014g", "/cS\u0012W0M1#\u0007\u0003Z5{z3t\u0003\u0005wO~\u001a", "3cXA66F[\u0015\by", "0dV6a\t:b\u0017\u0002Z]0\f", "", "0dV6a\t:b\u0017\u0002Z]0\fl8t\u007f5\u0005<\b", "1kT.e\u0014>b\u0015dzr\u001a\f\u0005>e\u000e", "AsPAX:", "1k^@X\nH\\\"~xm0\u0007\u0012", "1n\\:\\;\u001c]!\n\u0002^;\u0001\u00138", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9kF~0<Y\r$Avy7NM\u0011", "1n\\:\\;\u001c]\"\u000ezg;", "7m_Bg\nH\\(~\u0004m\u0010\u0006\n9", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9qE\u00025D7\b)Fm\u001f=1L<u\n", "4kP4f", "=oc@", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "1n\\:\\;\u001c]&\fz\\;\u0001\u00138", "1na?X*MW#\b^g-\u0007", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9kF\u000425W\r$Avy7NM\u0011", "1n\\:\\;-S,\u000e", "", "<df\u0010h9L]&i\u0005l0\f\r9n", "2d[2g,,c&\f\u0005n5{\r8gn(\u000fO", "0dU<e,%S\"\u0001\na", "/ec2e\u0013>\\\u001b\u000e}", "2d[2g,,c&\f\u0005n5{\r8gn(\u000fOd tQn\u000e'\u0001)>h\f", "3mS\u000fT;<Vx}~m", "3mS\u000fT;<Vx}~m\u0010\u0006\u0018/r\t$\u0003", "4h]6f/\u001c]!\n\u0005l0\u0006\u000b\u001ee\u00137", "5dc\u0010h9L]&\\vi:d\u0013.e", "@d`\u001ab+>a", "5dc\u0012k;KO\u0017\u000ez]\u001b|\u001c>", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9mO\u000621W\r 6\\\u0016A\\\u0019", "@d`BX:M", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9mO\u000621W\r 6\\\u0016A\\0;wD\u001e#w7", "5dc\u0015T5=Z\u0019\f", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5Q", "5dc X3>Q(~yM,\u0010\u0018", "5dc!X?M/\u001a\u000ezk\n\r\u0016=o\r", ";`g\u0010[(Ka", "5dc!X?M0\u0019\u007f\u0005k,Z\u0019<s\n5", ":nV\u0011X)NU", ";db@T.>", "", ">da3b9F1#\b\n^?\fp/n\u0010\u0004yO\u0005! ", "7c", ">da3b9F3\u0018\u0003\nh9X\u0007>i\n1", "3cXAb9\u001aQ(\u0003\u0005g", ">da3b9F6\u0015\byp9\u0001\u00183n\u0002\n{N\u0010'$G", "5dbAh9>", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9p8\u007f$Gf\u0002/;v\u0018\u0010MQJ{A\u001ej", "3wT0h;H`", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012\u000b", "1n]@h4>`", "\u001aiPCTuNb\u001d\u0006D_<\u0006\u0007>i\n1E$\n&tQx\u001cL~%B/", ">da3b9F>&\u0003\fZ;|f9m\b$\u0005?", "/bc6b5", "2`c.", ">qTC\\,P6\u0015\byp9\u0001\u00183n\u0002\n{N\u0010'$G", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9xIv69Y\u0010\u001c4t\u0016\u0011IL:}A\"$lj;hc:]\u00074G\"", "1`]0X3EO(\u0003\u0005g\u001a\u0001\u000b8a\u0007", "\u001a`]1e6BRb\t\t(\nx\u0012-e\u0007/wO\u0005! 5s\u0010Er,\u000b", "@d_<e;\u001fc \u0006\t\\9|\t8M\n'{", "3mP/_,=", "@d`BX:M1)\f\th9l\u0014.a\u000f(\n", "1ta@b9.^\u0018z\n^\u0014\u0007\b/", "Ad]1>,R3*~\u0004m", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fn/y_9{I\u0010l", "Ad]1F@Gb\u001c~\tbA|\b\u0015e\u0014\b\r@\n&", "1nS2", "Adc\u0010b4I]'\u0003\u0004`\u0019|\u000b3o\t", "AsP?g", "3mS", "Adc\u0010b4I]'\u0003\u0004`\u001b|\u001c>", "Adc X3>Q(\u0003\u0005g", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class StatelessInputConnection implements InputConnection {
    public static final int $stable = 8;
    private int batchDepth;
    private final InputConnection commitContentDelegateInputConnection;
    private final MutableVector<Function1<EditingBuffer, Unit>> editCommands = new MutableVector<>(new Function1[16], 0);
    private final TextInputSession session;
    private final StatelessInputConnection$terminalInputConnection$1 terminalInputConnection;

    private static /* synthetic */ void getCommitContentDelegateInputConnection$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logDebug(String str) {
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.foundation.text.input.internal.StatelessInputConnection$terminalInputConnection$1] */
    public StatelessInputConnection(TextInputSession textInputSession, EditorInfo editorInfo) {
        this.session = textInputSession;
        ?? r1 = new InputConnectionWrapper(this) { // from class: androidx.compose.foundation.text.input.internal.StatelessInputConnection$terminalInputConnection$1
            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
                return false;
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean performPrivateCommand(String str, Bundle bundle) {
                return true;
            }

            {
                super(this, false);
            }
        };
        this.terminalInputConnection = r1;
        this.commitContentDelegateInputConnection = InputConnectionCompat.createWrapper((InputConnection) r1, editorInfo, new InputConnectionCompat.OnCommitContentListener() { // from class: androidx.compose.foundation.text.input.internal.StatelessInputConnection$commitContentDelegateInputConnection$1
            @Override // androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener
            public boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i2, Bundle bundle) {
                if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                    try {
                        inputContentInfoCompat.requestPermission();
                        Object objUnwrap = inputContentInfoCompat.unwrap();
                        Intrinsics.checkNotNull(objUnwrap, "null cannot be cast to non-null type android.os.Parcelable");
                        Parcelable parcelable = (Parcelable) objUnwrap;
                        bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                        bundle.putParcelable("EXTRA_INPUT_CONTENT_INFO", parcelable);
                    } catch (Exception e2) {
                        this.this$0.logDebug("Can't insert content from IME; requestPermission() failed, " + e2);
                        return false;
                    }
                }
                return this.this$0.session.onCommitContent(StatelessInputConnection_androidKt.toTransferableContent(inputContentInfoCompat, bundle));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextFieldCharSequence getText() {
        return this.session.getText();
    }

    private final void addEditCommandWithBatch(Function1<? super EditingBuffer, Unit> function1) {
        beginBatchEditInternal();
        try {
            this.editCommands.add(function1);
        } finally {
            endBatchEditInternal();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        logDebug("beginBatchEdit()");
        return beginBatchEditInternal();
    }

    private final boolean beginBatchEditInternal() {
        this.batchDepth++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        logDebug("endBatchEdit()");
        return endBatchEditInternal();
    }

    private final boolean endBatchEditInternal() {
        int i2 = this.batchDepth - 1;
        this.batchDepth = i2;
        if (i2 == 0 && this.editCommands.isNotEmpty()) {
            this.session.requestEdit(new Function1<EditingBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.StatelessInputConnection.endBatchEditInternal.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(EditingBuffer editingBuffer) {
                    invoke2(editingBuffer);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(EditingBuffer editingBuffer) {
                    MutableVector mutableVector = StatelessInputConnection.this.editCommands;
                    int size = mutableVector.getSize();
                    if (size > 0) {
                        Object[] content = mutableVector.getContent();
                        int i3 = 0;
                        do {
                            ((Function1) content[i3]).invoke(editingBuffer);
                            i3++;
                        } while (i3 < size);
                    }
                }
            });
            this.editCommands.clear();
        }
        return this.batchDepth > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        logDebug("closeConnection()");
        this.editCommands.clear();
        this.batchDepth = 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(final CharSequence charSequence, final int i2) {
        logDebug("commitText(\"" + ((Object) charSequence) + "\", " + i2 + ')');
        addEditCommandWithBatch(new Function1<EditingBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.StatelessInputConnection.commitText.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(EditingBuffer editingBuffer) {
                invoke2(editingBuffer);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EditingBuffer editingBuffer) {
                EditCommandKt.commitText(editingBuffer, String.valueOf(charSequence), i2);
            }
        });
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(final int i2, final int i3) {
        logDebug("setComposingRegion(" + i2 + ", " + i3 + ')');
        addEditCommandWithBatch(new Function1<EditingBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.StatelessInputConnection.setComposingRegion.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(EditingBuffer editingBuffer) {
                invoke2(editingBuffer);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EditingBuffer editingBuffer) {
                EditCommandKt.setComposingRegion(editingBuffer, i2, i3);
            }
        });
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(final CharSequence charSequence, final int i2) {
        logDebug("setComposingText(\"" + ((Object) charSequence) + "\", " + i2 + ')');
        addEditCommandWithBatch(new Function1<EditingBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.StatelessInputConnection.setComposingText.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(EditingBuffer editingBuffer) {
                invoke2(editingBuffer);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EditingBuffer editingBuffer) {
                EditCommandKt.setComposingText(editingBuffer, String.valueOf(charSequence), i2);
            }
        });
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(final int i2, final int i3) {
        logDebug("deleteSurroundingTextInCodePoints(" + i2 + ", " + i3 + ')');
        addEditCommandWithBatch(new Function1<EditingBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.StatelessInputConnection.deleteSurroundingTextInCodePoints.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(EditingBuffer editingBuffer) {
                invoke2(editingBuffer);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EditingBuffer editingBuffer) {
                EditCommandKt.deleteSurroundingTextInCodePoints(editingBuffer, i2, i3);
            }
        });
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(final int i2, final int i3) {
        logDebug("deleteSurroundingText(" + i2 + ", " + i3 + ')');
        addEditCommandWithBatch(new Function1<EditingBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.StatelessInputConnection.deleteSurroundingText.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(EditingBuffer editingBuffer) {
                invoke2(editingBuffer);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EditingBuffer editingBuffer) {
                EditCommandKt.deleteSurroundingText(editingBuffer, i2, i3);
            }
        });
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(final int i2, final int i3) {
        logDebug("setSelection(" + i2 + ", " + i3 + ')');
        addEditCommandWithBatch(new Function1<EditingBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.StatelessInputConnection.setSelection.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(EditingBuffer editingBuffer) {
                invoke2(editingBuffer);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EditingBuffer editingBuffer) {
                editingBuffer.setSelection(i2, i3);
            }
        });
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        logDebug("finishComposingText()");
        addEditCommandWithBatch(new Function1<EditingBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.StatelessInputConnection.finishComposingText.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(EditingBuffer editingBuffer) {
                invoke2(editingBuffer);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EditingBuffer editingBuffer) {
                EditCommandKt.finishComposingText(editingBuffer);
            }
        });
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        logDebug("sendKeyEvent(" + keyEvent + ')');
        this.session.sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i2, int i3) {
        String string = TextFieldCharSequenceKt.getTextBeforeSelection(getText(), i2).toString();
        logDebug("getTextBeforeCursor(" + i2 + ", " + i3 + "): " + string);
        return string;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i2, int i3) {
        String string = TextFieldCharSequenceKt.getTextAfterSelection(getText(), i2).toString();
        logDebug("getTextAfterCursor(" + i2 + ", " + i3 + "): " + string);
        return string;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i2) {
        String string = TextRange.m6117getCollapsedimpl(getText().m1446getSelectiond9O1mEE()) ? null : TextFieldCharSequenceKt.getSelectedText(getText()).toString();
        logDebug("getSelectedText(" + i2 + "): " + ((Object) string));
        return string;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i2) {
        logDebug("requestCursorUpdates(" + i2 + ')');
        this.session.requestCursorUpdates(i2);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        logDebug("performHandwritingGesture(" + handwritingGesture + ", " + executor + ", " + intConsumer + ')');
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        Api34PerformHandwritingGestureImpl.INSTANCE.performHandwritingGesture(this.session, handwritingGesture, executor, intConsumer);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        logDebug("previewHandwritingGesture(" + previewableHandwritingGesture + ", " + cancellationSignal + ')');
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        return Api34PerformHandwritingGestureImpl.INSTANCE.previewHandwritingGesture(this.session, previewableHandwritingGesture, cancellationSignal);
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i2) {
        logDebug("getExtractedText(" + extractedTextRequest + ", " + i2 + ')');
        return StatelessInputConnection_androidKt.toExtractedText(getText());
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i2) {
        logDebug("getCursorCapsMode(" + i2 + ')');
        return TextUtils.getCapsMode(getText(), TextRange.m6121getMinimpl(getText().m1446getSelectiond9O1mEE()), i2);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i2) {
        logDebug("performContextMenuAction(" + i2 + ')');
        switch (i2) {
            case R.id.selectAll:
                addEditCommandWithBatch(new Function1<EditingBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.StatelessInputConnection.performContextMenuAction.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(EditingBuffer editingBuffer) {
                        invoke2(editingBuffer);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(EditingBuffer editingBuffer) {
                        editingBuffer.setSelection(0, StatelessInputConnection.this.getText().length());
                    }
                });
                break;
            case R.id.cut:
                sendSynthesizedKeyEvent(277);
                break;
            case R.id.copy:
                sendSynthesizedKeyEvent(278);
                break;
            case R.id.paste:
                sendSynthesizedKeyEvent(279);
                break;
        }
        return false;
    }

    private final void sendSynthesizedKeyEvent(int i2) {
        sendKeyEvent(new KeyEvent(0, i2));
        sendKeyEvent(new KeyEvent(1, i2));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i2) {
        int iM6301getDefaulteUduSuo;
        logDebug("performEditorAction(" + i2 + ')');
        if (i2 == 0) {
            iM6301getDefaulteUduSuo = ImeAction.Companion.m6301getDefaulteUduSuo();
        } else {
            switch (i2) {
                case 2:
                    iM6301getDefaulteUduSuo = ImeAction.Companion.m6303getGoeUduSuo();
                    break;
                case 3:
                    iM6301getDefaulteUduSuo = ImeAction.Companion.m6307getSearcheUduSuo();
                    break;
                case 4:
                    iM6301getDefaulteUduSuo = ImeAction.Companion.m6308getSendeUduSuo();
                    break;
                case 5:
                    iM6301getDefaulteUduSuo = ImeAction.Companion.m6304getNexteUduSuo();
                    break;
                case 6:
                    iM6301getDefaulteUduSuo = ImeAction.Companion.m6302getDoneeUduSuo();
                    break;
                case 7:
                    iM6301getDefaulteUduSuo = ImeAction.Companion.m6306getPreviouseUduSuo();
                    break;
                default:
                    logDebug("IME sent an unrecognized editor action: " + i2);
                    iM6301getDefaulteUduSuo = ImeAction.Companion.m6301getDefaulteUduSuo();
                    break;
            }
        }
        this.session.mo1474onImeActionKlQnJC8(iM6301getDefaulteUduSuo);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        logDebug("commitCompletion(" + ((Object) (completionInfo != null ? completionInfo.getText() : null)) + ')');
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        logDebug("getHandler()");
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i2) {
        logDebug("clearMetaKeyStates(" + i2 + ')');
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z2) {
        logDebug("reportFullscreenMode(" + z2 + ')');
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        logDebug("performPrivateCommand(" + str + ", " + bundle + ')');
        return this.commitContentDelegateInputConnection.performPrivateCommand(str, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        logDebug("commitContent(" + inputContentInfo + ", " + i2 + ", " + bundle + ')');
        return Api25CommitContentImpl.INSTANCE.commitContent(this.commitContentDelegateInputConnection, inputContentInfo, i2, bundle);
    }
}
