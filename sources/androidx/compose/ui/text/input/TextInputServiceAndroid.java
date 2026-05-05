package androidx.compose.ui.text.input;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
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
/* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яķ\u0014D57\u001eq\u007fZDkŞ\fA\u001c0\u0013ǞJ~8,\u001aw\rgr9FDm߉6Ri*\u0017k\u00024,[:qK;[\u001d\u0006\"\u001fOVʴonXc\u0013¼\u0017\u0006,xrߚQU\u000f]\u001aƁ:B}^;M\u0006=A`\u000b6\rړ:\"Ny\rЏ\"*^\u0010~zQi\u0014\u0012F@x:`\rUĨ\"\u0012\u001c>(ҵ&\\}N>Hr_B/9\u0003qBd'g0\u0003N\u0015Fj'\u0015Ǹi\u001eA@?5\u001b'[\u0003\u001dRc?\tMy=\u001bh/ݐ3I\nW>ݙ\b\u0014++W\rct,[\u001bĩ\u0011\fU*\bb\u001c\u0011#.\f\u000b\u007f\u001b<\u001c\u000e4(X2;\u001c~\b<6ϢvSNTB\u0004R\u0004\taN\u0017S\u0001C/G ~Q\u0010>)RE\u0002\u001d\rL*\u0011t'[b\u0016x\u0015I]ɐU1_J\u0006V\\:q?\u0004\u0003\u001f\u00142.\u0012b_\u007f]/Y4%YO[gFg\u007fJLR\u001d\u000f\u0005\u000f|\u001cw`~X\"\u001d9g.\u0017CrD\u0013=2e\u001d^:Je\u001c\u0003*D\b[&j2T!S3\u0015O1wx\tu\nSR\u0017;g+\u0004\u000e\u0006f%3}_qMyR%7o@pCpfpgRZ%.0q`j>\u001bBX\u0017\u0012!rWqJWrEa!#\t\u001b\u001epd-\rm\u001c\u0001\u0010-{c(\u0011\u0007<t7\u001f\u0001r~\u000f\u007f\u000bY4\rf2/QQc;Tv2jD|Q*-\u00140Wup_X|\u0018\u0006U*E&\u001cIQ]`A/E=z\b;\bdr\u0014t\u0014&o\u0013\u000b=';\u0017Q\u0018\u000ex5Db\u0001I}{G&\u0005$\u000b#6\fF\u000e*\t\t\u000e{T9~nM\u0001Jq<|_-\t-f=\u0001\u001ek-9;\u000e?\u001dDCD?#.uu\u007f0\nb=s\u0005g\u0014,\u00129\u001e\u0003\u0002a@\nPI\b7n&2<\u001bBv#>\u001c\u0013\"B\u0018KHop'\u0017\u000fԊߗ/̱j\u00114\u000fveiJ+q\u0004A<mz\u007fQ\u000f,^q7g߀UܭqmSŌ[V\u001d\u001d#{_\u0003hΕI֕ZWj־\u0001\u0014\u0002-NCQa3R_Ӛ@ʙ@\b\u0013͏%w\u0014'\u0013\u0002\\^=/\t\u0081\u007fŌZ\u000e\\ۿ-nV\u001exQp):\u0007\u000f\u0011C\u001e'Q_ \u001c`+Вo҅\u0005S%̿kv]\u001c~%Yb+ڦ'Ϝ\\\u0001\u0013Ե.OW\nN\u0004u2D£qɒ<\u0018\u0005܈\u0013$)?i\u0011\u000e}\u0007͟\rڀhNlɺb\u0005`m:;\u000f\u0003\r\u0014L\f\u001f\u000bGq!\u0011r/\\N&Zq:WӂPͫ\u000b\f\u0005ݭ\u00173;*M9MKz\u0014U!gUK}6CNGZȏ-Ǜ[\u000enŊ.7H>\n\u0016\u0011)9\u0017^F\u001c.x\u001c1J\u0005ûBс\u00069\nՂv[q!/jw=z1ZQxz\u001ac\u001b\u0011\u001d\u0002aӉhܕZyv߲!,\u0017'e.AYŷ>\u0017[ݰp\u0013\u0006B#Ų:Y"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|y7XSJY4+&l_9bl+[\u0001+F\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#h'3|\u00178ZK*kG-xqlI\u0016Q,[\b+EL$", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", ">nb6g0H\\vz\u0002\\<\u0004\u0005>o\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X <QR?u={\u0011o_I\u000e_;X\u0004|", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q'| \u0016Ty\u0012;\nn3c\u0006+A{\u0016w]G\u0005o=)%w+D\u0011g5]v4\u00117X:`avG\u001doV\u0015L;\u0014\u0001hK1D\b(", "@n^AC6LW(\u0003\u0005g\nx\u0010-u\u0007$\u000bJ\u000e", "7m_Bg\u0014>b\u001c\tyF(\u0006\u00051e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a)B}%\u0016MR>u3\u0006\u0011q];\u0007p\u0002", "7m_Bg\nH[!z\u0004]\u0017\n\u0013-e\u000e6\u0006M`*\u0017E\u007f\u001dF\u0004", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012\u000b", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q'| \u0016Ty\u0012;\nn3c\u0006+A{\u0016w]G\u0005o=)%w+D\u0011g5]v4\u00117X:`avG\u001doV\u0015L;\u0014\u0001hK1D+3(\u00079S\u0006:{J\n \u0016@t~B  KC$uT82Jbj\nV\u000b)k5t\u001bG\u001dk=D#{m\"\u0017jP;_bX\r\u0004NCwvK D6.GkkSRo^K>\u00072Ky\b!<eJne", "0`b2<5Ic(\\\u0005g5|\u0007>i\n1", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9j8\u0005%\u0019b\t0FK 7VC9z8(\u001e>", "5dc\u000fT:>7\"\n\u000bm\n\u0007\u00128e}7\u007fJ\n", "u(;.a+K]\u001d}Do0|\u001bxi\t3\fO\t\u0017&Jy\r\u0006S!CYa)B}%\fWLDk2-\u0019rj\u000f", "0`b2<5Ic(\\\u0005g5|\u0007>i\n1:?\u0001\u001e\u0017Ik\u001d<", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "1ta@b9\u001a\\\u0017\u0002\u0005k\u0010\u0006\n9C\n1\u000bM\u000b\u001e\u001eG|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#[0D{ ;)L9n>+xqbCdm5]\u00041NSN92", "3cXAb9!O'_\u0005\\<\u000b", "", "4nRBf,=@\u0019|\n", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010l", "4qP:X\n:Z {v\\2", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "7bb", "", "\u001aiPCTuEO\"\u0001Dk,}R!e{.h@\u0002\u0017$Gx\f<L", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#j 5w#-QL=O=)%w?C\u0010l,L\u0006+QU$", "7lT\u001cc;B]\"\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a(7W!=QMDy\n", "=m41\\;\u001c]!\u0007vg+", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#]\u001f;|s8UK7t3s", "", "=m8:X\b<b\u001d\t\u0004I,\n\n9r\b(z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a(7I\u0014=QMDA", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|v2MJ:\\0%%h7", "AsPAX", "5dc g(MSW\u000f~X9|\u0010/a\u000e(", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006z.@i\ri&m)=.G;r3\u000f\u0011oq9\\", "BdgA<5Ic(\\\u0005f4x\u0012.Q\u0010(\f@", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011p\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|y7XSJY4+&l_9bl+[\u0001+F\u000b=,oaVF\u001f\"ikX3\u0015\u0001b@y", "5dc#\\,P", "u(;.a+K]\u001d}Do0|\u001bxV\u0004(\u000e\u0016", "1qT.g,\"\\$\u000f\n<6\u0006\u0012/c\u000f,\u0006I", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9qE\u00025D7\b)@m\u0014=QMDA", "=tc\u000eg;Ka", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9m;z4?fa)8wk", "6hS2F6?b+z\b^\u0012|\u001d,o{5z", "7r41\\;H`y\txn:|\b", "<nc6Y@\u001f]\u0017\u000f\t^+i\t-t", "@dRA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", ">q^0X:L7\"\n\u000bm\n\u0007\u00117a\t'\n", "@dbAT9M7\"\n\u000bm\u0010\u0005\u0011/d\u0004$\u000b@\b+", "Ad]1<5Ic(\\\u0005f4x\u0012.", "1n\\:T5=", "Adc\u0018X@;]\u0015\fyO0\u000b\r,l\u007f\f\u0004H\u0001\u0016\u001bC~\u000eC\u000b", "Dhb6U3>", "Ag^DF6?b+z\b^\u0012|\u001d,o{5z", "AsP?g\u0010G^)\u000e", "D`[BX", "As^=<5Ic(", "CoS.g,,b\u0015\u000ez", "=kS#T3NS", "<df#T3NS", "CoS.g,-S,\u000eaZ@\u0007\u0019>R\u007f6\fG\u0010", "BdgA90>Z\u0018ove<|", "=eU@X;&O$\n~g.", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#g!8{\u0016=5?Fv8'\u0017>", "BdgA?(R])\u000eg^:\r\u0010>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "BdgA90>Z\u0018m\u0005K6\u0007\u0018\u001er{1\nA\u000b$\u001f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001dU\r-;\u0001k", "7m]2e\u001b>f(_~^3{e9u\t'\n", "2dR<e(MW#\bWh?Y\u0013?n~6", "\"dgA<5Ic(\\\u0005f4x\u0012.", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@Deprecated(message = "\u0012T\bN1y-`k[;:d$kaq\\\u00196\u0017|Kf~K.vS{%i\u0002\fXGepQGV3G-\u0017hb\u0003%]\b\u001cU'G_K0(\u0004$\ns\u0010\u0002 /L/P\u0002;_;G|V)~]P;8@ftzV+r\u0001m5\u0003\u0004\u00135\u000f4T\u001a?\u0012&((Qvh\u0007\u00189Tz_k\u000b7+dG6o9iB&?\u000e\u0017ny~\u001dH\u0017Y#^6\u0003=<`\u0002}E!B:Jq]hc\"\u0011\u0007|qs\u001d:l\u001c")
public final class TextInputServiceAndroid implements PlatformTextInputService {
    public static final int $stable = 8;
    private final Lazy baseInputConnection$delegate;
    private final CursorAnchorInfoController cursorAnchorInfoController;
    private boolean editorHasFocus;
    private Rect focusedRect;
    private Runnable frameCallback;
    private List<WeakReference<RecordingInputConnection>> ics;
    private ImeOptions imeOptions;
    private final Executor inputCommandProcessorExecutor;
    private final InputMethodManager inputMethodManager;
    private Function1<? super List<? extends EditCommand>, Unit> onEditCommand;
    private Function1<? super ImeAction, Unit> onImeActionPerformed;
    private TextFieldValue state;
    private final MutableVector<TextInputCommand> textInputCommandQueue;
    private final View view;

    /* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\bGٍ/!Ǟr\u00052.\"w5߿\u00198pIkH¯VS8\u000fT{:%D$wE$U \u0001\u000b\tUR˝ks"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|y7XSJY4+&l_9bl+[\u0001+F\u000b=,oaVF\u001f\"ikX3\u0015\u0001b@y", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "!sP?g\u0010G^)\u000e", "!s^=<5Ic(", "!g^D>,RP#z\b]", "\u0016hS2>,RP#z\b]", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private enum TextInputCommand {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    /* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextInputCommand.values().length];
            try {
                iArr[TextInputCommand.StartInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextInputCommand.StopInput.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextInputCommand.ShowKeyboard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextInputCommand.HideKeyboard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TextInputServiceAndroid(View view, PositionCalculator positionCalculator, InputMethodManager inputMethodManager, Executor executor) {
        this.view = view;
        this.inputMethodManager = inputMethodManager;
        this.inputCommandProcessorExecutor = executor;
        this.onEditCommand = new Function1<List<? extends EditCommand>, Unit>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onEditCommand$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<? extends EditCommand> list) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends EditCommand> list) {
                invoke2(list);
                return Unit.INSTANCE;
            }
        };
        this.onImeActionPerformed = new Function1<ImeAction, Unit>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onImeActionPerformed$1
            /* JADX INFO: renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m6372invokeKlQnJC8(int i2) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ImeAction imeAction) {
                m6372invokeKlQnJC8(imeAction.m6291unboximpl());
                return Unit.INSTANCE;
            }
        };
        this.state = new TextFieldValue("", TextRange.Companion.m6128getZerod9O1mEE(), (TextRange) null, 4, (DefaultConstructorMarker) null);
        this.imeOptions = ImeOptions.Companion.getDefault();
        this.ics = new ArrayList();
        this.baseInputConnection$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<BaseInputConnection>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$baseInputConnection$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final BaseInputConnection invoke() {
                return new BaseInputConnection(this.this$0.getView(), false);
            }
        });
        this.cursorAnchorInfoController = new CursorAnchorInfoController(positionCalculator, inputMethodManager);
        this.textInputCommandQueue = new MutableVector<>(new TextInputCommand[16], 0);
    }

    public final View getView() {
        return this.view;
    }

    public /* synthetic */ TextInputServiceAndroid(View view, PositionCalculator positionCalculator, InputMethodManager inputMethodManager, Executor executor, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, positionCalculator, inputMethodManager, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? TextInputServiceAndroid_androidKt.asExecutor(Choreographer.getInstance()) : executor);
    }

    public final TextFieldValue getState$ui_release() {
        return this.state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection getBaseInputConnection() {
        return (BaseInputConnection) this.baseInputConnection$delegate.getValue();
    }

    public TextInputServiceAndroid(View view, PositionCalculator positionCalculator) {
        this(view, positionCalculator, new InputMethodManagerImpl(view), null, 8, null);
    }

    public final InputConnection createInputConnection(EditorInfo editorInfo) {
        if (!this.editorHasFocus) {
            return null;
        }
        TextInputServiceAndroid_androidKt.update(editorInfo, this.imeOptions, this.state);
        TextInputServiceAndroid_androidKt.updateWithEmojiCompat(editorInfo);
        RecordingInputConnection recordingInputConnection = new RecordingInputConnection(this.state, new InputEventCallback2() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid.createInputConnection.1
            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onEditCommands(List<? extends EditCommand> list) {
                TextInputServiceAndroid.this.onEditCommand.invoke(list);
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            /* JADX INFO: renamed from: onImeAction-KlQnJC8 */
            public void mo6320onImeActionKlQnJC8(int i2) {
                TextInputServiceAndroid.this.onImeActionPerformed.invoke(ImeAction.m6285boximpl(i2));
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onKeyEvent(KeyEvent keyEvent) {
                TextInputServiceAndroid.this.getBaseInputConnection().sendKeyEvent(keyEvent);
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onRequestCursorAnchorInfo(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
                TextInputServiceAndroid.this.cursorAnchorInfoController.requestUpdate(z2, z3, z4, z5, z6, z7);
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onConnectionClosed(RecordingInputConnection recordingInputConnection2) {
                int size = TextInputServiceAndroid.this.ics.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (Intrinsics.areEqual(((WeakReference) TextInputServiceAndroid.this.ics.get(i2)).get(), recordingInputConnection2)) {
                        TextInputServiceAndroid.this.ics.remove(i2);
                        return;
                    }
                }
            }
        }, this.imeOptions.getAutoCorrect());
        this.ics.add(new WeakReference<>(recordingInputConnection));
        return recordingInputConnection;
    }

    public final boolean isEditorFocused() {
        return this.editorHasFocus;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput(TextFieldValue textFieldValue, ImeOptions imeOptions, Function1<? super List<? extends EditCommand>, Unit> function1, Function1<? super ImeAction, Unit> function12) {
        this.editorHasFocus = true;
        this.state = textFieldValue;
        this.imeOptions = imeOptions;
        this.onEditCommand = function1;
        this.onImeActionPerformed = function12;
        sendInputCommand(TextInputCommand.StartInput);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput() {
        sendInputCommand(TextInputCommand.StartInput);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void stopInput() {
        this.editorHasFocus = false;
        this.onEditCommand = new Function1<List<? extends EditCommand>, Unit>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<? extends EditCommand> list) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends EditCommand> list) {
                invoke2(list);
                return Unit.INSTANCE;
            }
        };
        this.onImeActionPerformed = new Function1<ImeAction, Unit>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.2
            /* JADX INFO: renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m6373invokeKlQnJC8(int i2) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ImeAction imeAction) {
                m6373invokeKlQnJC8(imeAction.m6291unboximpl());
                return Unit.INSTANCE;
            }
        };
        this.focusedRect = null;
        sendInputCommand(TextInputCommand.StopInput);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void showSoftwareKeyboard() {
        sendInputCommand(TextInputCommand.ShowKeyboard);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void hideSoftwareKeyboard() {
        sendInputCommand(TextInputCommand.HideKeyboard);
    }

    private final void sendInputCommand(TextInputCommand textInputCommand) {
        this.textInputCommandQueue.add(textInputCommand);
        if (this.frameCallback == null) {
            Runnable runnable = new Runnable() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    TextInputServiceAndroid.sendInputCommand$lambda$1(this.f$0);
                }
            };
            this.inputCommandProcessorExecutor.execute(runnable);
            this.frameCallback = runnable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendInputCommand$lambda$1(TextInputServiceAndroid textInputServiceAndroid) {
        textInputServiceAndroid.frameCallback = null;
        textInputServiceAndroid.processInputCommands();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void processInputCommands() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        MutableVector<TextInputCommand> mutableVector = this.textInputCommandQueue;
        int size = mutableVector.getSize();
        if (size > 0) {
            TextInputCommand[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                processInputCommands$applyToState(content[i2], objectRef, objectRef2);
                i2++;
            } while (i2 < size);
        }
        this.textInputCommandQueue.clear();
        if (Intrinsics.areEqual((Object) objectRef.element, (Object) true)) {
            restartInputImmediately();
        }
        Boolean bool = (Boolean) objectRef2.element;
        if (bool != null) {
            setKeyboardVisibleImmediately(bool.booleanValue());
        }
        if (Intrinsics.areEqual((Object) objectRef.element, (Object) false)) {
            restartInputImmediately();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Boolean] */
    private static final void processInputCommands$applyToState(TextInputCommand textInputCommand, Ref.ObjectRef<Boolean> objectRef, Ref.ObjectRef<Boolean> objectRef2) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[textInputCommand.ordinal()];
        if (i2 == 1) {
            objectRef.element = true;
            objectRef2.element = true;
        } else if (i2 == 2) {
            objectRef.element = false;
            objectRef2.element = false;
        } else if ((i2 == 3 || i2 == 4) && !Intrinsics.areEqual((Object) objectRef.element, (Object) false)) {
            objectRef2.element = Boolean.valueOf(textInputCommand == TextInputCommand.ShowKeyboard);
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateState(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        boolean z2 = (TextRange.m6116equalsimpl0(this.state.m6370getSelectiond9O1mEE(), textFieldValue2.m6370getSelectiond9O1mEE()) && Intrinsics.areEqual(this.state.m6369getCompositionMzsxiRA(), textFieldValue2.m6369getCompositionMzsxiRA())) ? false : true;
        this.state = textFieldValue2;
        int size = this.ics.size();
        for (int i2 = 0; i2 < size; i2++) {
            RecordingInputConnection recordingInputConnection = this.ics.get(i2).get();
            if (recordingInputConnection != null) {
                recordingInputConnection.setMTextFieldValue$ui_release(textFieldValue2);
            }
        }
        this.cursorAnchorInfoController.invalidate();
        if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
            if (z2) {
                InputMethodManager inputMethodManager = this.inputMethodManager;
                int iM6121getMinimpl = TextRange.m6121getMinimpl(textFieldValue2.m6370getSelectiond9O1mEE());
                int iM6120getMaximpl = TextRange.m6120getMaximpl(textFieldValue2.m6370getSelectiond9O1mEE());
                TextRange textRangeM6369getCompositionMzsxiRA = this.state.m6369getCompositionMzsxiRA();
                int iM6121getMinimpl2 = textRangeM6369getCompositionMzsxiRA != null ? TextRange.m6121getMinimpl(textRangeM6369getCompositionMzsxiRA.m6127unboximpl()) : -1;
                TextRange textRangeM6369getCompositionMzsxiRA2 = this.state.m6369getCompositionMzsxiRA();
                inputMethodManager.updateSelection(iM6121getMinimpl, iM6120getMaximpl, iM6121getMinimpl2, textRangeM6369getCompositionMzsxiRA2 != null ? TextRange.m6120getMaximpl(textRangeM6369getCompositionMzsxiRA2.m6127unboximpl()) : -1);
                return;
            }
            return;
        }
        if (textFieldValue != null && (!Intrinsics.areEqual(textFieldValue.getText(), textFieldValue2.getText()) || (TextRange.m6116equalsimpl0(textFieldValue.m6370getSelectiond9O1mEE(), textFieldValue2.m6370getSelectiond9O1mEE()) && !Intrinsics.areEqual(textFieldValue.m6369getCompositionMzsxiRA(), textFieldValue2.m6369getCompositionMzsxiRA())))) {
            restartInputImmediately();
            return;
        }
        int size2 = this.ics.size();
        for (int i3 = 0; i3 < size2; i3++) {
            RecordingInputConnection recordingInputConnection2 = this.ics.get(i3).get();
            if (recordingInputConnection2 != null) {
                recordingInputConnection2.updateInputState(this.state, this.inputMethodManager);
            }
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    @Deprecated(message = "\u0017N\u0005H1\u0002\u001ak`V,:c\u001d;chPH5\u0014|KT{\u0006qkZ\u0001)j4\fyUR`(\u001bX'AAzd`\t\u0018aMRWCE'\u0011Z(I-6=\u0010\u0006 t8 \u0019")
    @InterfaceC1492Gx
    public void notifyFocusedRect(androidx.compose.ui.geometry.Rect rect) {
        Rect rect2;
        this.focusedRect = new Rect(MathKt.roundToInt(rect.getLeft()), MathKt.roundToInt(rect.getTop()), MathKt.roundToInt(rect.getRight()), MathKt.roundToInt(rect.getBottom()));
        if (!this.ics.isEmpty() || (rect2 = this.focusedRect) == null) {
            return;
        }
        this.view.requestRectangleOnScreen(new Rect(rect2));
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Function1<? super Matrix, Unit> function1, androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2) {
        this.cursorAnchorInfoController.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, function1, rect, rect2);
    }

    private final void restartInputImmediately() {
        this.inputMethodManager.restartInput();
    }

    private final void setKeyboardVisibleImmediately(boolean z2) {
        if (z2) {
            this.inputMethodManager.showSoftInput();
        } else {
            this.inputMethodManager.hideSoftInput();
        }
    }
}
