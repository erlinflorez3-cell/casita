package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.foundation.text.DeadKeyCombiner;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyEventHelpers_androidKt;
import androidx.compose.foundation.text.KeyMapping;
import androidx.compose.foundation.text.KeyMapping_androidKt;
import androidx.compose.foundation.text.StringHelpers_jvmKt;
import androidx.compose.foundation.text.TextFieldKeyInput_androidKt;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: TextFieldKeyEventHandler.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яn\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.`\\2şs{J$cҕyCQU\"Ԃ*\teNo˧vJp\u000bK\u000f\f\u0017\u0001jBI]xk\u0012\u00172HqG3coEʠhtL\u0005(2(<\u0002\u0005\u0017\u001a2H&v\u0003Ca\f\u001aؓHpHW\u0015˟\u000b8(ßn /\u001d\u001djߑ:Hz]\u0003}1\n\u0002B|/\u00104\u000bV%F\u00031=zo)C@eAE)a\u0010\u001fR\nM3C\u007fL\u001dhU7[M\u0002hNX.\u001cE/]\u001furTd5[n\u001f?1_e[P<=&\u000fB!˖\u0003\u05faΝ+J4C(}PFA\r\u000bSnX2bP\t\u0013ad!U\u0004A6Q\u001b\u0015]\u0012?']O{3\u001dN'\u000f\b9[\u0003(\u0011\u0019)o\u0010Q_m\u0007Q̩MˣՒAo\n\u000ep r<>f\u0018/*&^\u001b3Ws9Q-\u001c\u0006VQ\u007fv3n\u0019Wws`@PvFL8+$kTf\u0015k~xh.!MJi5!ݔ\u0017 b\u001d\u0003Ɯ+XX]\u000f\u0002j{\u00052%]t}Y?w\u001cXQ^a7(Ҳ\u0012уVv\u001c̳\rn\u0013[~B\u0002\u00101٥*ϒ6HrݘH\bRS$\u0013`EHʌ6Ϝ5\u0019déȀ\u0003#JD\u0003ȣ{\tgʖ\u0003|"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\bKLU+BR\u0007\u001d%\u0012c\u001d1'\u0016\u0004`A1D", "", "u(E", "2dP1>,R1#\u0007wb5|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u0016m\u0012-3COI>&\u0012lj9\u00149", "9dh\u001aT7IW\"\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001dm*\u0016INFo= j", ">qT=T9>R\u0007~\u0002^*\f\r9nm7wO\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Pq,Uv%VPX5&ArP#r^\u000eU*w\u0012YL {D6\r\b3I\u007fJl\u000b\u0015\u0004\u001d1yp\u0018", "=m:2l\fOS\"\u000e", "", "3uT;g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WBv9~?}4\u0017~\u00167\\\u0019", "BdgA90>Z\u0018l\nZ;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR9J\u007f5HV[4\\Qa='!;\u0012N2\frh=3n\u001a", "BdgA?(R])\u000ehm(\f\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\u000eC`X<k@\u00029#\u00120", "BdgA90>Z\u0018lze,z\u00183o\t\u0016\u000b<\u0010\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Pq,Uv%VPX5&ArP#r^\u000eU*z\u0005`A\"}HA(u;E\u0011;>", "3cXAT)ES", "Ah]4_,%W\"~", "=mBBU4Bb", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "=m:2l\fOS\"\u000eB/7\f\u0014z4\u000e", "uKP;W9HW\u0018H\fb,\u000fR\u0015e\u0014\b\r@\n&l.k\u0017;\u0004/9X\u0011i5w\u001e9WQ;55(%q`5\u0016g6W@6G_]u`[}M#[^\u0017]+\u001a\u000eUHm]Q3(\u0016-S\u000fCh\u007fz\u0016!DKtB]\u000f5\t\u0011\u0005A~OBb^\u0007QEDusb\u0016g(fH:m\u0015{)$gL=\u000e\u0006\\Z\u0002R\rv1K\"\u0006H3\bqdUE|^8{p\u000eK\u000f\u0007x.l~;\u0004\u001b\u0013096:kGp\u0017Kh|\u0014?&?1.AF!?\u0015d\u007f|G\rd.e\u0012\u0017,D1,t/gQ\u001a\u0017l`_>p_\u000e@N\r\bWo\u001c'D\u000eFe\u0003^w\u00077|FMC\"Sn\u001awD n\u0015\r\fT'\u0018=\u0016\u0013N\u0004O0iFT\u0017\u00122=\u001d\u0004#D%yF\u001fqU{i!P4?v M+<\u0016\u0012:G", "=m??X\u0012>gx\u0010zg;", "4nRBf\u0014:\\\u0015\u0001zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Ege\u001c@i\u0018.Z\u0019", "9dh/b(KRv\t\u0004m9\u0007\u00106e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n#c~/Ii#.3COh>\u001a\"g?C\u0010r9X}.GY$", "=m??X\u0012>gx\u0010zg;DpCF\u00103j ", "uKP;W9HW\u0018H\fb,\u000fR\u0015e\u0014\b\r@\n&l.k\u0017;\u0004/9X\u0011i5w\u001e9WQ;55(%q`5\u0016g6W@6G_]u`[}M#[^\u0017]+\u001a\u000eUHm]Q3(\u0016-S\u000fCh\u007fz\u0016!DKtB]\u000f5\t\u0011\u0005A~OBb^\u0007QEDusb\u0016g(fH:m\u0015{)$gL=\u000e\u0006\\Z\u0002R\rv1K\"\u0006H3\bqdUE|^8{p-K\u0003w\u0010A\\~4>\u001c\u0004G9\u0017h\u0005Rf\u0006>ex\u0013;`K0\u0014E8\"?!Jqu=\u001br#`\u001bW`?9$osc\u0012\u001f\u000b'\u0018e3qmJ\u0018\\\u0004NWW\u00110B\u0001BhO{\u0005\u0010#zoMB.\u001e~$xO,m\u0011L\u0013ja'5\u0012LZ\u0019u2)%W\u0014\u0018z4\u0019{?C)mR\fzJPe`~1@\u007f\u0018I.\t\u000f1", ">qT=T9>R\u0007~\u0002^*\f\r9n]2\u0005O\u0001*&", "AsPAX", "7r5?b4,]\u001a\u000e`^@y\u0013+r~", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Pq,Uv%VPX5&ArP#r^\u000eU*w\u0012YL {D6\r\b3I\u007fJl\u000b\u0015k", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "5dc#\\:BP ~i^?\fo+y\n8\u000b#\u0001\u001b\u0019J~", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class TextFieldKeyEventHandler {
    public static final int $stable = 8;
    private final TextFieldPreparedSelectionState preparedSelectionState = new TextFieldPreparedSelectionState();
    private final DeadKeyCombiner deadKeyCombiner = new DeadKeyCombiner();
    private final KeyMapping keyMapping = KeyMapping_androidKt.getPlatformDefaultKeyMapping();

    /* JADX INFO: compiled from: TextFieldKeyEventHandler.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KeyCommand.values().length];
            try {
                iArr[KeyCommand.COPY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KeyCommand.PASTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KeyCommand.CUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[KeyCommand.LEFT_CHAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[KeyCommand.RIGHT_CHAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[KeyCommand.LEFT_WORD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[KeyCommand.RIGHT_WORD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[KeyCommand.PREV_PARAGRAPH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[KeyCommand.NEXT_PARAGRAPH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[KeyCommand.UP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[KeyCommand.DOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[KeyCommand.PAGE_UP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[KeyCommand.PAGE_DOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[KeyCommand.LINE_START.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[KeyCommand.LINE_END.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[KeyCommand.LINE_LEFT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[KeyCommand.LINE_RIGHT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[KeyCommand.HOME.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[KeyCommand.END.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[KeyCommand.DELETE_PREV_CHAR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[KeyCommand.DELETE_NEXT_CHAR.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[KeyCommand.DELETE_PREV_WORD.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[KeyCommand.DELETE_NEXT_WORD.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[KeyCommand.DELETE_FROM_LINE_START.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[KeyCommand.DELETE_TO_LINE_END.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[KeyCommand.NEW_LINE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[KeyCommand.TAB.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[KeyCommand.SELECT_ALL.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[KeyCommand.SELECT_LEFT_CHAR.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[KeyCommand.SELECT_RIGHT_CHAR.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[KeyCommand.SELECT_LEFT_WORD.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[KeyCommand.SELECT_RIGHT_WORD.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[KeyCommand.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[KeyCommand.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[KeyCommand.SELECT_LINE_START.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[KeyCommand.SELECT_LINE_END.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[KeyCommand.SELECT_LINE_LEFT.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[KeyCommand.SELECT_LINE_RIGHT.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[KeyCommand.SELECT_UP.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[KeyCommand.SELECT_DOWN.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[KeyCommand.SELECT_PAGE_UP.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[KeyCommand.SELECT_PAGE_DOWN.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[KeyCommand.SELECT_HOME.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[KeyCommand.SELECT_END.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[KeyCommand.DESELECT.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[KeyCommand.UNDO.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[KeyCommand.REDO.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[KeyCommand.CHARACTER_PALETTE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: onPreKeyEvent-MyFupTE */
    public boolean mo1472onPreKeyEventMyFupTE(KeyEvent keyEvent, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, FocusManager focusManager, SoftwareKeyboardController softwareKeyboardController) {
        if (TextRange.m6117getCollapsedimpl(transformedTextFieldState.getVisualText().m1446getSelectiond9O1mEE()) || !KeyEventHelpers_androidKt.m1333cancelsTextSelectionZmokQxo(keyEvent)) {
            return false;
        }
        textFieldSelectionState.deselect();
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: onKeyEvent-6ptp14s */
    public boolean mo1471onKeyEvent6ptp14s(KeyEvent keyEvent, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, boolean z2, boolean z3, Function0<Unit> function0) {
        TextRange textRangeM6111boximpl;
        Integer numM1332consumeZmokQxo;
        boolean z4 = false;
        if (!KeyEventType.m5236equalsimpl0(KeyEvent_androidKt.m5244getTypeZmokQxo(keyEvent), KeyEventType.Companion.m5240getKeyDownCS__XNY())) {
            return false;
        }
        if (!TextFieldKeyInput_androidKt.m1416isTypedEventZmokQxo(keyEvent) || (numM1332consumeZmokQxo = this.deadKeyCombiner.m1332consumeZmokQxo(keyEvent)) == null) {
            KeyCommand keyCommandMo1334mapZmokQxo = this.keyMapping.mo1334mapZmokQxo(keyEvent);
            if (keyCommandMo1334mapZmokQxo != null && (!keyCommandMo1334mapZmokQxo.getEditsText() || z2)) {
                TextFieldPreparedSelection textFieldPreparedSelection = new TextFieldPreparedSelection(transformedTextFieldState, textLayoutState.getLayoutResult(), TextFieldKeyEventHandler_androidKt.m1543isFromSoftKeyboardZmokQxo(keyEvent), getVisibleTextLayoutHeight(textLayoutState), this.preparedSelectionState);
                switch (WhenMappings.$EnumSwitchMapping$0[keyCommandMo1334mapZmokQxo.ordinal()]) {
                    case 1:
                        textFieldSelectionState.copy(false);
                        z4 = true;
                        break;
                    case 2:
                        textFieldSelectionState.paste();
                        z4 = true;
                        break;
                    case 3:
                        textFieldSelectionState.cut();
                        z4 = true;
                        break;
                    case 4:
                        textFieldPreparedSelection.collapseLeftOr(new Function1<TextFieldPreparedSelection, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler$onKeyEvent$2$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                invoke2(textFieldPreparedSelection2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                textFieldPreparedSelection2.moveCursorLeft();
                            }
                        });
                        z4 = true;
                        break;
                    case 5:
                        textFieldPreparedSelection.collapseRightOr(new Function1<TextFieldPreparedSelection, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler$onKeyEvent$2$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                invoke2(textFieldPreparedSelection2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                textFieldPreparedSelection2.moveCursorRight();
                            }
                        });
                        z4 = true;
                        break;
                    case 6:
                        textFieldPreparedSelection.moveCursorLeftByWord();
                        z4 = true;
                        break;
                    case 7:
                        textFieldPreparedSelection.moveCursorRightByWord();
                        z4 = true;
                        break;
                    case 8:
                        textFieldPreparedSelection.moveCursorPrevByParagraph();
                        z4 = true;
                        break;
                    case 9:
                        textFieldPreparedSelection.moveCursorNextByParagraph();
                        z4 = true;
                        break;
                    case 10:
                        textFieldPreparedSelection.moveCursorUpByLine();
                        z4 = true;
                        break;
                    case 11:
                        textFieldPreparedSelection.moveCursorDownByLine();
                        z4 = true;
                        break;
                    case 12:
                        textFieldPreparedSelection.moveCursorUpByPage();
                        z4 = true;
                        break;
                    case 13:
                        textFieldPreparedSelection.moveCursorDownByPage();
                        z4 = true;
                        break;
                    case 14:
                        textFieldPreparedSelection.moveCursorToLineStart();
                        z4 = true;
                        break;
                    case 15:
                        textFieldPreparedSelection.moveCursorToLineEnd();
                        z4 = true;
                        break;
                    case 16:
                        textFieldPreparedSelection.moveCursorToLineLeftSide();
                        z4 = true;
                        break;
                    case 17:
                        textFieldPreparedSelection.moveCursorToLineRightSide();
                        z4 = true;
                        break;
                    case 18:
                        textFieldPreparedSelection.moveCursorToHome();
                        z4 = true;
                        break;
                    case 19:
                        textFieldPreparedSelection.moveCursorToEnd();
                        z4 = true;
                        break;
                    case 20:
                        if (TextRange.m6117getCollapsedimpl(textFieldPreparedSelection.m1592getSelectiond9O1mEE())) {
                            Integer numValueOf = Integer.valueOf(textFieldPreparedSelection.getPrecedingCharacterIndex());
                            if (numValueOf.intValue() == -1) {
                                numValueOf = null;
                            }
                            textRangeM6111boximpl = numValueOf != null ? TextRange.m6111boximpl(TextRangeKt.TextRange(numValueOf.intValue(), TextRange.m6118getEndimpl(textFieldPreparedSelection.m1592getSelectiond9O1mEE()))) : null;
                            if (textRangeM6111boximpl != null) {
                                TransformedTextFieldState.m1564replaceTextM8tDOmk$default(textFieldPreparedSelection.state, "", textRangeM6111boximpl.m6127unboximpl(), null, !textFieldPreparedSelection.isFromSoftKeyboard, 4, null);
                            }
                        } else {
                            TransformedTextFieldState.m1564replaceTextM8tDOmk$default(textFieldPreparedSelection.state, "", textFieldPreparedSelection.m1592getSelectiond9O1mEE(), null, !textFieldPreparedSelection.isFromSoftKeyboard, 4, null);
                        }
                        z4 = true;
                        break;
                    case 21:
                        if (TextRange.m6117getCollapsedimpl(textFieldPreparedSelection.m1592getSelectiond9O1mEE())) {
                            Integer numValueOf2 = Integer.valueOf(textFieldPreparedSelection.getNextCharacterIndex());
                            if (numValueOf2.intValue() == -1) {
                                numValueOf2 = null;
                            }
                            textRangeM6111boximpl = numValueOf2 != null ? TextRange.m6111boximpl(TextRangeKt.TextRange(TextRange.m6123getStartimpl(textFieldPreparedSelection.m1592getSelectiond9O1mEE()), numValueOf2.intValue())) : null;
                            if (textRangeM6111boximpl != null) {
                                TransformedTextFieldState.m1564replaceTextM8tDOmk$default(textFieldPreparedSelection.state, "", textRangeM6111boximpl.m6127unboximpl(), null, !textFieldPreparedSelection.isFromSoftKeyboard, 4, null);
                            }
                        } else {
                            TransformedTextFieldState.m1564replaceTextM8tDOmk$default(textFieldPreparedSelection.state, "", textFieldPreparedSelection.m1592getSelectiond9O1mEE(), null, !textFieldPreparedSelection.isFromSoftKeyboard, 4, null);
                        }
                        z4 = true;
                        break;
                    case 22:
                        if (!TextRange.m6117getCollapsedimpl(textFieldPreparedSelection.m1592getSelectiond9O1mEE())) {
                            TransformedTextFieldState.m1564replaceTextM8tDOmk$default(textFieldPreparedSelection.state, "", textFieldPreparedSelection.m1592getSelectiond9O1mEE(), null, !textFieldPreparedSelection.isFromSoftKeyboard, 4, null);
                        } else {
                            TransformedTextFieldState.m1564replaceTextM8tDOmk$default(textFieldPreparedSelection.state, "", TextRangeKt.TextRange(textFieldPreparedSelection.getPreviousWordOffset(), TextRange.m6118getEndimpl(textFieldPreparedSelection.m1592getSelectiond9O1mEE())), null, !textFieldPreparedSelection.isFromSoftKeyboard, 4, null);
                        }
                        z4 = true;
                        break;
                    case 23:
                        if (!TextRange.m6117getCollapsedimpl(textFieldPreparedSelection.m1592getSelectiond9O1mEE())) {
                            TransformedTextFieldState.m1564replaceTextM8tDOmk$default(textFieldPreparedSelection.state, "", textFieldPreparedSelection.m1592getSelectiond9O1mEE(), null, !textFieldPreparedSelection.isFromSoftKeyboard, 4, null);
                        } else {
                            TransformedTextFieldState.m1564replaceTextM8tDOmk$default(textFieldPreparedSelection.state, "", TextRangeKt.TextRange(TextRange.m6123getStartimpl(textFieldPreparedSelection.m1592getSelectiond9O1mEE()), textFieldPreparedSelection.getNextWordOffset()), null, !textFieldPreparedSelection.isFromSoftKeyboard, 4, null);
                        }
                        z4 = true;
                        break;
                    case 24:
                        if (!TextRange.m6117getCollapsedimpl(textFieldPreparedSelection.m1592getSelectiond9O1mEE())) {
                            TransformedTextFieldState.m1564replaceTextM8tDOmk$default(textFieldPreparedSelection.state, "", textFieldPreparedSelection.m1592getSelectiond9O1mEE(), null, !textFieldPreparedSelection.isFromSoftKeyboard, 4, null);
                        } else {
                            TransformedTextFieldState.m1564replaceTextM8tDOmk$default(textFieldPreparedSelection.state, "", TextRangeKt.TextRange(textFieldPreparedSelection.getLineStartByOffset(), TextRange.m6118getEndimpl(textFieldPreparedSelection.m1592getSelectiond9O1mEE())), null, !textFieldPreparedSelection.isFromSoftKeyboard, 4, null);
                        }
                        z4 = true;
                        break;
                    case 25:
                        if (!TextRange.m6117getCollapsedimpl(textFieldPreparedSelection.m1592getSelectiond9O1mEE())) {
                            TransformedTextFieldState.m1564replaceTextM8tDOmk$default(textFieldPreparedSelection.state, "", textFieldPreparedSelection.m1592getSelectiond9O1mEE(), null, !textFieldPreparedSelection.isFromSoftKeyboard, 4, null);
                        } else {
                            TransformedTextFieldState.m1564replaceTextM8tDOmk$default(textFieldPreparedSelection.state, "", TextRangeKt.TextRange(TextRange.m6123getStartimpl(textFieldPreparedSelection.m1592getSelectiond9O1mEE()), textFieldPreparedSelection.getLineEndByOffset()), null, !textFieldPreparedSelection.isFromSoftKeyboard, 4, null);
                        }
                        z4 = true;
                        break;
                    case 26:
                        if (!z3) {
                            TextFieldState textFieldState = transformedTextFieldState.textFieldState;
                            InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
                            TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
                            textFieldState.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
                            EditingBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
                            mainBuffer$foundation_release.commitComposition();
                            EditCommandKt.commitText(mainBuffer$foundation_release, "\n", 1);
                            textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
                        } else {
                            function0.invoke();
                        }
                        z4 = true;
                        break;
                    case 27:
                        if (!z3) {
                            TextFieldState textFieldState2 = transformedTextFieldState.textFieldState;
                            InputTransformation inputTransformation2 = transformedTextFieldState.inputTransformation;
                            TextFieldEditUndoBehavior textFieldEditUndoBehavior2 = TextFieldEditUndoBehavior.MergeIfPossible;
                            textFieldState2.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
                            EditingBuffer mainBuffer$foundation_release2 = textFieldState2.getMainBuffer$foundation_release();
                            mainBuffer$foundation_release2.commitComposition();
                            EditCommandKt.commitText(mainBuffer$foundation_release2, "\t", 1);
                            textFieldState2.commitEditAsUser(inputTransformation2, true, textFieldEditUndoBehavior2);
                            z4 = true;
                        }
                        break;
                    case 28:
                        textFieldPreparedSelection.selectAll();
                        z4 = true;
                        break;
                    case 29:
                        textFieldPreparedSelection.moveCursorLeft().selectMovement();
                        z4 = true;
                        break;
                    case 30:
                        textFieldPreparedSelection.moveCursorRight().selectMovement();
                        z4 = true;
                        break;
                    case 31:
                        textFieldPreparedSelection.moveCursorLeftByWord().selectMovement();
                        z4 = true;
                        break;
                    case 32:
                        textFieldPreparedSelection.moveCursorRightByWord().selectMovement();
                        z4 = true;
                        break;
                    case 33:
                        textFieldPreparedSelection.moveCursorPrevByParagraph().selectMovement();
                        z4 = true;
                        break;
                    case 34:
                        textFieldPreparedSelection.moveCursorNextByParagraph().selectMovement();
                        z4 = true;
                        break;
                    case 35:
                        textFieldPreparedSelection.moveCursorToLineStart().selectMovement();
                        z4 = true;
                        break;
                    case 36:
                        textFieldPreparedSelection.moveCursorToLineEnd().selectMovement();
                        z4 = true;
                        break;
                    case 37:
                        textFieldPreparedSelection.moveCursorToLineLeftSide().selectMovement();
                        z4 = true;
                        break;
                    case 38:
                        textFieldPreparedSelection.moveCursorToLineRightSide().selectMovement();
                        z4 = true;
                        break;
                    case 39:
                        textFieldPreparedSelection.moveCursorUpByLine().selectMovement();
                        z4 = true;
                        break;
                    case 40:
                        textFieldPreparedSelection.moveCursorDownByLine().selectMovement();
                        z4 = true;
                        break;
                    case 41:
                        textFieldPreparedSelection.moveCursorUpByPage().selectMovement();
                        z4 = true;
                        break;
                    case 42:
                        textFieldPreparedSelection.moveCursorDownByPage().selectMovement();
                        z4 = true;
                        break;
                    case 43:
                        textFieldPreparedSelection.moveCursorToHome().selectMovement();
                        z4 = true;
                        break;
                    case 44:
                        textFieldPreparedSelection.moveCursorToEnd().selectMovement();
                        z4 = true;
                        break;
                    case 45:
                        textFieldPreparedSelection.deselect();
                        z4 = true;
                        break;
                    case 46:
                        transformedTextFieldState.undo();
                        z4 = true;
                        break;
                    case 47:
                        transformedTextFieldState.redo();
                        z4 = true;
                        break;
                    case 48:
                        KeyEventHelpers_androidKt.showCharacterPalette();
                        z4 = true;
                        break;
                    default:
                        z4 = true;
                        break;
                }
                if (!TextRange.m6116equalsimpl0(textFieldPreparedSelection.m1592getSelectiond9O1mEE(), textFieldPreparedSelection.getInitialValue().m1446getSelectiond9O1mEE())) {
                    transformedTextFieldState.m1571selectCharsIn5zctL8(textFieldPreparedSelection.m1592getSelectiond9O1mEE());
                }
            }
            return z4;
        }
        String string = StringHelpers_jvmKt.appendCodePointX(new StringBuilder(2), numM1332consumeZmokQxo.intValue()).toString();
        if (!z2) {
            return false;
        }
        boolean z5 = !TextFieldKeyEventHandler_androidKt.m1543isFromSoftKeyboardZmokQxo(keyEvent);
        TextFieldState textFieldState3 = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation3 = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior3 = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState3.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer$foundation_release3 = textFieldState3.getMainBuffer$foundation_release();
        mainBuffer$foundation_release3.commitComposition();
        EditCommandKt.commitText(mainBuffer$foundation_release3, string, 1);
        textFieldState3.commitEditAsUser(inputTransformation3, z5, textFieldEditUndoBehavior3);
        this.preparedSelectionState.resetCachedX();
        return true;
    }

    private final void preparedSelectionContext(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, boolean z2, Function1<? super TextFieldPreparedSelection, Unit> function1) {
        TextFieldPreparedSelection textFieldPreparedSelection = new TextFieldPreparedSelection(transformedTextFieldState, textLayoutState.getLayoutResult(), z2, getVisibleTextLayoutHeight(textLayoutState), this.preparedSelectionState);
        function1.invoke(textFieldPreparedSelection);
        if (TextRange.m6116equalsimpl0(textFieldPreparedSelection.m1592getSelectiond9O1mEE(), textFieldPreparedSelection.getInitialValue().m1446getSelectiond9O1mEE())) {
            return;
        }
        transformedTextFieldState.m1571selectCharsIn5zctL8(textFieldPreparedSelection.m1592getSelectiond9O1mEE());
    }

    private final float getVisibleTextLayoutHeight(TextLayoutState textLayoutState) {
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            Rect rectLocalBoundingBoxOf$default = null;
            if (!textLayoutNodeCoordinates.isAttached()) {
                textLayoutNodeCoordinates = null;
            }
            if (textLayoutNodeCoordinates != null) {
                LayoutCoordinates decoratorNodeCoordinates = textLayoutState.getDecoratorNodeCoordinates();
                if (decoratorNodeCoordinates != null) {
                    if (!decoratorNodeCoordinates.isAttached()) {
                        decoratorNodeCoordinates = null;
                    }
                    if (decoratorNodeCoordinates != null) {
                        rectLocalBoundingBoxOf$default = LayoutCoordinates.localBoundingBoxOf$default(decoratorNodeCoordinates, textLayoutNodeCoordinates, false, 2, null);
                    }
                }
                if (rectLocalBoundingBoxOf$default != null) {
                    return Size.m4003getHeightimpl(rectLocalBoundingBoxOf$default.m3970getSizeNHjbRc());
                }
            }
        }
        return Float.NaN;
    }
}
