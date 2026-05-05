package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.KFunction;
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
/* JADX INFO: compiled from: TextFieldKeyInput.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP.`S2şs{B-c$wCCU0}*ޛWN}gvϺb\u000bY\u000f\u000e\u0016~kD4cތu\u0012=1jom2}sK9xtd\u0006P60:\u0012\u0005/\u001dZL\u001ez\u0013Cy\u0011BBFpHX%Y\u0015\u001c\"\u0006l%\u0011 lg|>vs\u000e>=,\u001bipXWc>\be\rt^W\u0011\u0005m6+nDe\u00193a\u001b\u0007\u0001jo\u0007M\u0002U\u0005\u00178mǢ˗rɎ͏\\\u0002\u001a'9b\u0558]w._\u000bŋ|:&ˬSw"}, d2 = {"BdgA90>Z\u0018dzr\u0010\u0006\u0014?t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001em\u0018*KW*kG-ula@\u0006Q;J\u0006'\u001d", ";`].Z,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0004htHgg,Uu\u0015GSN*kV|F{\u000ec\nP+\u001aZ", "D`[BX", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|v2MJ:\\0%%h7", "=mE._<>1\u001cz\u0004`,", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "3cXAT)ES", "", "Ah]4_,%W\"~", "=eU@X;&O$\n~g.", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#g!8{\u0016=5?Fv8'\u0017>", "CmS<@(GO\u001b~\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri'v\u001585?Dg6\u001e\">", "7lT\u000eV;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a(7I\u0014=QMDA", "BdgA90>Z\u0018dzr\u0010\u0006\u0014?tGtm%T\u000bv7", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Pd6^\u007f&C[R6e\u001c\u0002='!$tN-\t\u0003m0$\u0002S\u0018#\b3HoJd\u0010\fkt1soO`\u0014F\r^sK1sPg_CHKUk)`\u001bc'e\u0004I$'\u0001b)hW.\b\u000bW\u001b{\u001chgzVy~8+=[[MEmd@~0\u0007G\u0005s\u00142eJ\u0012p6\u0003A4:c\u0018\u0015e\"Fi\u0003#,&Q+oE<&N\u0015g~wN\u001d2\u000ea\u001b\u001dC91 dV_O\u001f\u00073}a?pf\u0005@\u001c\u000bOQ9\u00167O|Q_\u0004\u001e\u0017P\u0005}nGR\u001f^\neF9\u0017F\r\f\u0002s\" -)\u0007W\u0019p5iEM\\\u0019l\u0002\u001b{lR^tQ\u001b}Z<EXp26\bxE,>OEx(*k\u0019\u0015A\u000b\u000f}0=gL\u0002A\u001d3%\u0007ZBri.\u0007vW,\"1G\u001c2<zq[?xFs0\u0011\u007f\u000euRx!%4\u000b2NSn!O-I\u000fDe\\\u001e,\u0017%3*\\ A_t9J{c", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextFieldKeyInputKt {
    /* JADX INFO: renamed from: textFieldKeyInput-2WJ9YEU$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1414textFieldKeyInput2WJ9YEU$default(Modifier modifier, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, Function1 function1, boolean z2, boolean z3, OffsetMapping offsetMapping, UndoManager undoManager, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            function1 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.TextFieldKeyInputKt$textFieldKeyInput$1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(TextFieldValue textFieldValue2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                    invoke2(textFieldValue2);
                    return Unit.INSTANCE;
                }
            };
        }
        return m1413textFieldKeyInput2WJ9YEU(modifier, legacyTextFieldState, textFieldSelectionManager, textFieldValue, function1, z2, z3, offsetMapping, undoManager, i2);
    }

    /* JADX INFO: renamed from: textFieldKeyInput-2WJ9YEU, reason: not valid java name */
    public static final Modifier m1413textFieldKeyInput2WJ9YEU(Modifier modifier, final LegacyTextFieldState legacyTextFieldState, final TextFieldSelectionManager textFieldSelectionManager, final TextFieldValue textFieldValue, final Function1<? super TextFieldValue, Unit> function1, final boolean z2, final boolean z3, final OffsetMapping offsetMapping, final UndoManager undoManager, final int i2) {
        return ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldKeyInputKt$textFieldKeyInput$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i3) {
                composer.startReplaceGroup(851809892);
                ComposerKt.sourceInformation(composer, "C245@11270L41,246@11334L30,260@11814L18:TextFieldKeyInput.kt#423gt5");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(851809892, i3, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:245)");
                }
                ComposerKt.sourceInformationMarkerStart(composer, 1297760441, "CC(remember):TextFieldKeyInput.kt#9igjgp");
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new TextPreparedSelectionState();
                    composer.updateRememberedValue(objRememberedValue);
                }
                TextPreparedSelectionState textPreparedSelectionState = (TextPreparedSelectionState) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerStart(composer, 1297762478, "CC(remember):TextFieldKeyInput.kt#9igjgp");
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new DeadKeyCombiner();
                    composer.updateRememberedValue(objRememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                TextFieldKeyInput textFieldKeyInput = new TextFieldKeyInput(legacyTextFieldState, textFieldSelectionManager, textFieldValue, z2, z3, textPreparedSelectionState, offsetMapping, undoManager, (DeadKeyCombiner) objRememberedValue2, null, function1, i2, 512, null);
                Modifier.Companion companion = Modifier.Companion;
                ComposerKt.sourceInformationMarkerStart(composer, 1297777826, "CC(remember):TextFieldKeyInput.kt#9igjgp");
                boolean zChangedInstance = composer.changedInstance(textFieldKeyInput);
                TextFieldKeyInputKt$textFieldKeyInput$2$1$1 textFieldKeyInputKt$textFieldKeyInput$2$1$1RememberedValue = composer.rememberedValue();
                if (zChangedInstance || textFieldKeyInputKt$textFieldKeyInput$2$1$1RememberedValue == Composer.Companion.getEmpty()) {
                    textFieldKeyInputKt$textFieldKeyInput$2$1$1RememberedValue = new TextFieldKeyInputKt$textFieldKeyInput$2$1$1(textFieldKeyInput);
                    composer.updateRememberedValue(textFieldKeyInputKt$textFieldKeyInput$2$1$1RememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                Modifier modifierOnKeyEvent = KeyInputModifierKt.onKeyEvent(companion, (Function1) ((KFunction) textFieldKeyInputKt$textFieldKeyInput$2$1$1RememberedValue));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierOnKeyEvent;
            }
        }, 1, null);
    }
}
