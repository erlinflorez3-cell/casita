package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
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
/* JADX INFO: compiled from: Card.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯN\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u0006\u0010nʑA0ZeP\u008cZS@\u000fsڔ<$q$yّCU0}*ޛWN}gvϺb\u000bY\u000f\u000e\u0016\u000fj4Ikxe\u0012%2JoE8eڒ<Gś\r63\u001fb,Fy\u001d\u0007*,X\u0010%yqL<\u00186@~<j\r{\bJ\u0018\f>.\u00056\\\u0016SfNr]H5;\u0003\u0018I~-e0\u000bU%F\u00030=|g\u001e9JO5C0\u0004\u000b\rRiK\u001bA\b<3uW/1I\u0002eNZ\u0016\u0013C:\u007f'k\u0003>r\u0015Sp\fU=_e[P<'&\fԫ\u0011<\n!Ν+H4A`kڿ\u00123\u0003\bk\u001e^\u061cvB.y\u0012<\u001d%\u000e5C9Ii\u0002gA\u0019\\=\u0014\u0005;%S\u0007t!i\\&`C$\u0005}W1_JUH|\u0015\nEs\u0004~n\u001a,\u001a/u\r_\u0016\u001f>/;G]I#O}\u0012JTg%\u0004\u000fyרmRNS̱r\u0016=>O\u0011ʑHd\u0013\u0002hJfC)MJS7\b\u0016\u00138b\b>1%>M}i\u001apS]\u0018'Gfe\\\u001fq\u0014WGbK5\u007fh@gXv\"ETb3_\u0017HY\fhd@\"`Q\u001b\u0016}{RX$\u0013`J\"$:,?'t\u0017^\u0002LQq\u0017\u0017or~ \u0001d3R\u0015y&\u0005\t/O\u000b\u0002״kxO?ʬd\"3U\u0018:Ԋ*U0\u0001LN1\u001e\u0017s.F\u0018RMLz\u0018\u000eU*#F ?Q=C+\u000f-0b\b3EZz}Q{\u001bW\u0001\u0003y\u001dE\u0001.\u0016\u0013\u001b\u000b:p\u0003`_V'\"%p\u0003%\u0018d.x\u0010WیKcZ\u001eИBIx\u0017 Aҡ<|\u001386ݔ\u007f}<\u00155[BW'$w,5%cmi\u001e-(c?,ze\u0012.{\u0016\u001ee\u0002c8;FMq~l'Tr\tBVp\u0010\bp\u0010d\u00139HOl\tVfV;5\u0004f\u00156%p\u0005fj\u0019u}B:w*\"P.\u001cdC3\u001feU}l\u001cZ\r%X\u001f\"!\f3~\u0012JO0Xgb7/4\u0005͛:AAuƀ@\t*HrAޭ\u000fCb~\u001ek\t\u001a^_=\u0016bHy;d\u0010lx\u000bYx\u000bfEn'B\u0001-\u0016c$~5?\r\u0006F\u00038\u00148\u0007S+\u00133j}\n\u0017+1DbE3(\u0007\u000e;_kSa\u0018F\u0006W)\u001c}\u007f\u000eH\u0018+\u001cp)ê=Q\u0017r۞4^\u0011i+SЩz\u0012thƲ&D"}, d2 = {"\u0011`a1", "", "=m29\\*D", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "3mP/_,=", "", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "1n[<e:", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T!BX[*>w#<#", "3kTCT;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T!BX]'7~\u0012=QMDA", "0na1X9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0002?f| D[%;WI;A", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s8TSCt\"\u001c\u001fsa\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJi\u0007A\nW*\u001a\u000f]@78BA'\u00136W\u0002\u0005x\u0005U\u0018\u001b1usFT\u001e\u0011g\u0018qL)>-UhxTKIa=.\ni%gDH$]y\u0015*h]2\u0006\u0003!ZPN\u0007fEQ \u0005E2\u0014TWOD|_@s:hI\u0006\u007f\u001d<ftt|)\u001347:`\f\u00191u:kwt3\\R#5:F\u001c\u00152_~kK\u0018l\u001etQ\fl=<#se-I\u0019\u0017f\u0016WDei\n\u0001/\u0010KHo\"\u0015U\fLayjo\u0003-lrSG\u001agJ\u0018zL-i\u001f\u0003Lg\",7\u00159h\u0013r3);V\"\tu4\n\u000b]M\u001e:0 |GobWS-Ex\u001eE\u001fBOF\u007f@M\u007f\u001d\u00144Vq\u0005'\u0003pF\u0003\u007f\u00186-\u0007ZHk^>\u000fq\\0bHH%\u001d<5\f[\u000eDEs0\u0014\u000b\u0018l{('<B\n>KWjkIsT\u0014@bRY\nW\u001d:j\u0003\u0016O1W\u0019\u000e_", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Ps0\u0018x4CWQ0Z`<+\u0017\u000ee\u000e$\u0012\t\u000eXN.rCJh\u00066Q\rEv\u0001U\u001e\nDj}FR\u0017\u0015CrqN(FP`i\u0007U\u0017,^3c\u0019i![M\u0004\"\u001ey$%vPw\u0012wb\u0011\u007fVun5\u0011vvE#\u001et[WA~YF}|\u0006G\u0005v\u001f<\\s>>+\u000e<5@r\u0005\u0015h\"Ngw\u0011;`K0o\u0013F >Kpc{K\u0018n\u001f7n\u0014lD8\u001dn/hY\u0017P^'d3pc\u000b@`O\u001fYx\u00136J\tK)O{\u0005\u0010#zoMB.\u001e~$xO,m\u0011L\u0010v!+2\u001e=#lr2jA[\u0013\u0016>\u001co?J", "\u0013kTCT;>Rvz\b]", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJi\u0007A\nW*\u001a\u000f]@78BA'\u00136W\u0002\u0005x\u0005U\u0018\u001b1usFT\u001e\u0011g\u0018qL)>-UhxTKIa=.\ni%gDH$]y\u0015*h]2\u0006\u0003!ZPN\u0007fEQ \u0005E2\u0014TWOD|_@s:hI\u0006\u007f\u001d<ftt|)\u001347:`\f\u00191u:kwt3\\R#5:F\u001c\u00152_~kK\u0018l\u001etQ\fl=<#se-I\u0019\u0017f\u0016WDei\n\u0001V\u000fMI|\u0011%U\u0003LdC|\u0019\u0016 jlI'$c\u0001'lB1c\u001b\fpp(),\u0016\u0013@\u0015r9f;V\\\u000ey@U|iL\u0013\u007fL\u001avY<<gx\"E|\u001bRn\t28\u007fQPy\u0014\u0015GJ\t\t%~sPy\u007f 5.L]@b*\r\u0015o^,'gEq\u0003\u0011tr", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Ps0\u0018x4CWQ0Z`<+\u0017\u000ee\u000e$\u0012\t\u000eXN.rCJh\u00066Q\rEv\u0001U\u001e\nDj}FR\u0017\u0015CrqN(FP`i\u0007U\u0017,^3c\u0019i![M\u0004\"\u001ey$%vPw\u0012wb\u0011\u007fVun5\u0011vvE#\u001et[WA~YF}|\u0006Q\u0006\u0007\u00196a>0\u00065M5:?b\u0014Oq!L(Y%5ZP+0?\nh&GltyH\u0012g2+\u0006\u0018j@;'e/pX\u0018\u0016a\u001f[~?i\tB\\\u0014>VEx\u000b\no", "\u001dtc9\\5>Rvz\b]", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CardKt {

    /* JADX INFO: renamed from: androidx.compose.material3.CardKt$Card$2 */
    /* JADX INFO: compiled from: Card.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ BorderStroke $border;
        final /* synthetic */ CardColors $colors;
        final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $content;
        final /* synthetic */ CardElevation $elevation;
        final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i2, int i3) {
            super(2);
            shape = shape;
            cardColors = cardColors;
            cardElevation = cardElevation;
            borderStroke = borderStroke;
            function3 = function3;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            CardKt.Card(modifier, shape, cardColors, cardElevation, borderStroke, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.CardKt$Card$4 */
    /* JADX INFO: compiled from: Card.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass4 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ BorderStroke $border;
        final /* synthetic */ CardColors $colors;
        final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $content;
        final /* synthetic */ CardElevation $elevation;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(Function0<Unit> function0, Modifier modifier, boolean z2, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i2, int i3) {
            super(2);
            function0 = function0;
            modifier = modifier;
            z = z2;
            shape = shape;
            cardColors = cardColors;
            cardElevation = cardElevation;
            borderStroke = borderStroke;
            mutableInteractionSource = mutableInteractionSource;
            function3 = function3;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            CardKt.Card(function0, modifier, z, shape, cardColors, cardElevation, borderStroke, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.CardKt$ElevatedCard$1 */
    /* JADX INFO: compiled from: Card.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06081 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ CardColors $colors;
        final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $content;
        final /* synthetic */ CardElevation $elevation;
        final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06081(Shape shape, CardColors cardColors, CardElevation cardElevation, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i2, int i3) {
            super(2);
            shape = shape;
            cardColors = cardColors;
            cardElevation = cardElevation;
            function3 = function3;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            Modifier modifier = modifier;
            Shape shape = shape;
            CardColors cardColors = cardColors;
            CardElevation cardElevation = cardElevation;
            Function3<ColumnScope, Composer, Integer, Unit> function3 = function3;
            int i3 = i;
            CardKt.ElevatedCard(modifier, shape, cardColors, cardElevation, function3, composer, RecomposeScopeImplKt.updateChangedFlags((i3 + 1) - (i3 & 1)), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.CardKt$ElevatedCard$2 */
    /* JADX INFO: compiled from: Card.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06092 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ CardColors $colors;
        final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $content;
        final /* synthetic */ CardElevation $elevation;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06092(Function0<Unit> function0, Modifier modifier, boolean z2, Shape shape, CardColors cardColors, CardElevation cardElevation, MutableInteractionSource mutableInteractionSource, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i2, int i3) {
            super(2);
            function0 = function0;
            modifier = modifier;
            z = z2;
            shape = shape;
            cardColors = cardColors;
            cardElevation = cardElevation;
            mutableInteractionSource = mutableInteractionSource;
            function3 = function3;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            Function0<Unit> function0 = function0;
            Modifier modifier = modifier;
            boolean z2 = z;
            Shape shape = shape;
            CardColors cardColors = cardColors;
            CardElevation cardElevation = cardElevation;
            MutableInteractionSource mutableInteractionSource = mutableInteractionSource;
            Function3<ColumnScope, Composer, Integer, Unit> function3 = function3;
            int i3 = i;
            CardKt.ElevatedCard(function0, modifier, z2, shape, cardColors, cardElevation, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags((i3 + 1) - (i3 & 1)), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.CardKt$OutlinedCard$1 */
    /* JADX INFO: compiled from: Card.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06101 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ BorderStroke $border;
        final /* synthetic */ CardColors $colors;
        final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $content;
        final /* synthetic */ CardElevation $elevation;
        final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06101(Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i2, int i3) {
            super(2);
            shape = shape;
            cardColors = cardColors;
            cardElevation = cardElevation;
            borderStroke = borderStroke;
            function3 = function3;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            CardKt.OutlinedCard(modifier, shape, cardColors, cardElevation, borderStroke, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.CardKt$OutlinedCard$2 */
    /* JADX INFO: compiled from: Card.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06112 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ BorderStroke $border;
        final /* synthetic */ CardColors $colors;
        final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $content;
        final /* synthetic */ CardElevation $elevation;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06112(Function0<Unit> function0, Modifier modifier, boolean z2, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i2, int i3) {
            super(2);
            function0 = function0;
            modifier = modifier;
            z = z2;
            shape = shape;
            cardColors = cardColors;
            cardElevation = cardElevation;
            borderStroke = borderStroke;
            mutableInteractionSource = mutableInteractionSource;
            function3 = function3;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            Function0<Unit> function0 = function0;
            Modifier modifier = modifier;
            boolean z2 = z;
            Shape shape = shape;
            CardColors cardColors = cardColors;
            CardElevation cardElevation = cardElevation;
            BorderStroke borderStroke = borderStroke;
            MutableInteractionSource mutableInteractionSource = mutableInteractionSource;
            Function3<ColumnScope, Composer, Integer, Unit> function3 = function3;
            int i3 = i;
            CardKt.OutlinedCard(function0, modifier, z2, shape, cardColors, cardElevation, borderStroke, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags((i3 + 1) - (i3 & 1)), i);
        }
    }

    public static final void Card(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i2, int i3) {
        int i4;
        BorderStroke borderStroke2 = borderStroke;
        CardElevation cardElevationM1847cardElevationaqJV_2Y = cardElevation;
        CardColors cardColors2 = cardColors;
        Shape shape2 = shape;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1179621553);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Card)P(4,5,1,3)82@3741L5,83@3786L12,84@3844L15,93@4163L57,95@4259L41,88@3951L349:Card.kt#uh7d8r");
        int i5 = (-1) - (((-1) - i3) | ((-1) - 1));
        if (i5 != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((i2 & 6) == 0) {
            int i6 = composerStartRestartGroup.changed(companion) ? 4 : 2;
            i4 = (i6 + i2) - (i6 & i2);
        } else {
            i4 = i2;
        }
        if ((i2 + 48) - (i2 | 48) == 0) {
            int i7 = ((i3 + 2) - (i3 | 2) == 0 && composerStartRestartGroup.changed(shape2)) ? 32 : 16;
            i4 = (i4 + i7) - (i4 & i7);
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= ((i3 + 4) - (i3 | 4) == 0 && composerStartRestartGroup.changed(cardColors2)) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 + 8) - (i3 | 8) == 0 && composerStartRestartGroup.changed(cardElevationM1847cardElevationaqJV_2Y)) ? 2048 : 1024)));
        }
        int i8 = (-1) - (((-1) - i3) | ((-1) - 16));
        if (i8 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 24576));
        } else if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            int i9 = composerStartRestartGroup.changed(borderStroke2) ? 16384 : 8192;
            i4 = (i4 + i9) - (i4 & i9);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i2 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i2 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536)));
        }
        if ((74899 & i4) != 74898 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i3 + 2) - (i3 | 2) != 0) {
                    shape2 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i4 &= -113;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
                    cardColors2 = CardDefaults.INSTANCE.cardColors(composerStartRestartGroup, 6);
                    i4 = (i4 - 897) - (i4 | (-897));
                }
                if ((i3 + 8) - (i3 | 8) != 0) {
                    cardElevationM1847cardElevationaqJV_2Y = CardDefaults.INSTANCE.m1847cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-7169)));
                }
                if (i8 != 0) {
                    borderStroke2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 2) != 0) {
                    i4 &= -113;
                }
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-7169)));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1179621553, i4, -1, "androidx.compose.material3.Card (Card.kt:87)");
            }
            int i10 = i4 << 6;
            SurfaceKt.m2561SurfaceT9BRK9s(companion, shape2, cardColors2.m1839containerColorvNxB06k$material3_release(true), cardColors2.m1840contentColorvNxB06k$material3_release(true), 0.0f, cardElevationM1847cardElevationaqJV_2Y.shadowElevation$material3_release(true, null, composerStartRestartGroup, (-1) - (((-1) - ((-1) - (((-1) - (i4 >> 3)) | ((-1) - 896)))) & ((-1) - 54))).getValue().m6652unboximpl(), borderStroke2, ComposableLambdaKt.rememberComposableLambda(664103990, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt.Card.1
                final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $content;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32) {
                    super(2);
                    function3 = function32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i11) {
                    ComposerKt.sourceInformation(composer2, "C96@4269L25:Card.kt#uh7d8r");
                    if ((i11 + 3) - (3 | i11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(664103990, i11, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:96)");
                    }
                    Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                    Modifier.Companion companion2 = Modifier.Companion;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, companion2);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composer2);
                    Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                    function32.invoke(ColumnScopeInstance.INSTANCE, composer2, 6);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (-1) - (((-1) - ((-1) - (((-1) - ((-1) - (((-1) - ((-1) - (((-1) - i4) | ((-1) - 14)))) & ((-1) - 12582912)))) & ((-1) - ((-1) - (((-1) - i4) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))))))) & ((-1) - ((3670016 + i10) - (3670016 | i10)))), 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt.Card.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ BorderStroke $border;
                final /* synthetic */ CardColors $colors;
                final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $content;
                final /* synthetic */ CardElevation $elevation;
                final /* synthetic */ Shape $shape;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass2(Shape shape22, CardColors cardColors22, CardElevation cardElevationM1847cardElevationaqJV_2Y2, BorderStroke borderStroke22, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32, int i22, int i32) {
                    super(2);
                    shape = shape22;
                    cardColors = cardColors22;
                    cardElevation = cardElevationM1847cardElevationaqJV_2Y2;
                    borderStroke = borderStroke22;
                    function3 = function32;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    CardKt.Card(modifier, shape, cardColors, cardElevation, borderStroke, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.CardKt$Card$1 */
    /* JADX INFO: compiled from: Card.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32) {
            super(2);
            function3 = function32;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
            invoke(composer2, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer2, int i11) {
            ComposerKt.sourceInformation(composer2, "C96@4269L25:Card.kt#uh7d8r");
            if ((i11 + 3) - (3 | i11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(664103990, i11, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:96)");
            }
            Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
            Modifier.Companion companion2 = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, companion2);
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composer2);
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -384862393, "C87@4365L9:Column.kt#2w3rfo");
            function32.invoke(ColumnScopeInstance.INSTANCE, composer2, 6);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Card(kotlin.jvm.functions.Function0<kotlin.Unit> r23, androidx.compose.ui.Modifier r24, boolean r25, androidx.compose.ui.graphics.Shape r26, androidx.compose.material3.CardColors r27, androidx.compose.material3.CardElevation r28, androidx.compose.foundation.BorderStroke r29, androidx.compose.foundation.interaction.MutableInteractionSource r30, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 834
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CardKt.Card(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.material3.CardColors, androidx.compose.material3.CardElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: renamed from: androidx.compose.material3.CardKt$Card$3 */
    /* JADX INFO: compiled from: Card.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3) {
            super(2);
            function3 = function3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            ComposerKt.sourceInformation(composer, "C161@7173L25:Card.kt#uh7d8r");
            if ((i2 & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(776921067, i2, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:161)");
            }
            Function3<ColumnScope, Composer, Integer, Unit> function3 = function3;
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composer);
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384862393, "C87@4365L9:Column.kt#2w3rfo");
            function3.invoke(ColumnScopeInstance.INSTANCE, composer, 6);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ElevatedCard(androidx.compose.ui.Modifier r15, androidx.compose.ui.graphics.Shape r16, androidx.compose.material3.CardColors r17, androidx.compose.material3.CardElevation r18, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r19, androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CardKt.ElevatedCard(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, androidx.compose.material3.CardColors, androidx.compose.material3.CardElevation, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void ElevatedCard(Function0<Unit> function0, Modifier modifier, boolean z2, Shape shape, CardColors cardColors, CardElevation cardElevation, MutableInteractionSource mutableInteractionSource, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i2, int i3) {
        int i4;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        CardElevation cardElevationM1849elevatedCardElevationaqJV_2Y = cardElevation;
        CardColors cardColorsElevatedCardColors = cardColors;
        Shape elevatedShape = shape;
        boolean z3 = z2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1850977784);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ElevatedCard)P(6,5,3,7!1,2,4)248@11071L13,249@11124L20,250@11190L23,254@11328L269:Card.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((i2 & 6) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(function0) ? 4 : 2;
            i4 = (i5 + i2) - (i5 & i2);
        } else {
            i4 = i2;
        }
        int i6 = (-1) - (((-1) - i3) | ((-1) - 2));
        if (i6 != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 32 : 16)));
        }
        int i7 = (-1) - (((-1) - i3) | ((-1) - 4));
        if (i7 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i8 = composerStartRestartGroup.changed(z3) ? 256 : 128;
            i4 = (i4 + i8) - (i4 & i8);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            i4 |= ((i3 & 8) == 0 && composerStartRestartGroup.changed(elevatedShape)) ? 2048 : 1024;
        }
        if ((i2 + 24576) - (i2 | 24576) == 0) {
            i4 |= ((i3 + 16) - (i3 | 16) == 0 && composerStartRestartGroup.changed(cardColorsElevatedCardColors)) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            int i9 = ((i3 & 32) == 0 && composerStartRestartGroup.changed(cardElevationM1849elevatedCardElevationaqJV_2Y)) ? 131072 : 65536;
            i4 = (i4 + i9) - (i4 & i9);
        }
        int i10 = (i3 + 64) - (i3 | 64);
        if (i10 != 0) {
            i4 |= 1572864;
        } else if ((i2 + 1572864) - (i2 | 1572864) == 0) {
            i4 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
        }
        if ((i3 & 128) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 12582912));
        } else if ((i2 + 12582912) - (i2 | 12582912) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
        }
        if ((-1) - (((-1) - 4793491) | ((-1) - i4)) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if (i7 != 0) {
                    z3 = true;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                    elevatedShape = CardDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                    i4 = (i4 - 7169) - (i4 | (-7169));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                    cardColorsElevatedCardColors = CardDefaults.INSTANCE.elevatedCardColors(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-57345)));
                }
                if ((i3 + 32) - (i3 | 32) != 0) {
                    cardElevationM1849elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m1849elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-458753)));
                }
                if (i10 != 0) {
                    mutableInteractionSource2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 + 8) - (i3 | 8) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-7169)));
                }
                if ((i3 + 16) - (i3 | 16) != 0) {
                    i4 = (i4 - 57345) - (i4 | (-57345));
                }
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1850977784, i4, -1, "androidx.compose.material3.ElevatedCard (Card.kt:254)");
            }
            int i11 = (-1) - (((-1) - (((i4 & 14) | 1572864) | (112 & i4))) & ((-1) - (896 & i4)));
            int i12 = (-1) - (((-1) - i4) | ((-1) - 7168));
            int i13 = (i11 + i12) - (i11 & i12);
            int i14 = (-1) - (((-1) - 57344) | ((-1) - i4));
            int i15 = i4 << 3;
            int i16 = ((i13 + i14) - (i13 & i14)) | (458752 & i4) | ((-1) - (((-1) - 29360128) | ((-1) - i15)));
            int i17 = (-1) - (((-1) - i15) | ((-1) - 234881024));
            Card(function0, companion, z3, elevatedShape, cardColorsElevatedCardColors, cardElevationM1849elevatedCardElevationaqJV_2Y, null, mutableInteractionSource2, function3, composerStartRestartGroup, (i16 + i17) - (i16 & i17), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt.ElevatedCard.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ CardColors $colors;
                final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $content;
                final /* synthetic */ CardElevation $elevation;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function0<Unit> $onClick;
                final /* synthetic */ Shape $shape;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C06092(Function0<Unit> function02, Modifier companion2, boolean z32, Shape elevatedShape2, CardColors cardColorsElevatedCardColors2, CardElevation cardElevationM1849elevatedCardElevationaqJV_2Y2, MutableInteractionSource mutableInteractionSource22, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32, int i22, int i32) {
                    super(2);
                    function0 = function02;
                    modifier = companion2;
                    z = z32;
                    shape = elevatedShape2;
                    cardColors = cardColorsElevatedCardColors2;
                    cardElevation = cardElevationM1849elevatedCardElevationaqJV_2Y2;
                    mutableInteractionSource = mutableInteractionSource22;
                    function3 = function32;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    Function0<Unit> function02 = function0;
                    Modifier modifier2 = modifier;
                    boolean z22 = z;
                    Shape shape2 = shape;
                    CardColors cardColors2 = cardColors;
                    CardElevation cardElevation2 = cardElevation;
                    MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                    Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                    int i32 = i;
                    CardKt.ElevatedCard(function02, modifier2, z22, shape2, cardColors2, cardElevation2, mutableInteractionSource3, function32, composer2, RecomposeScopeImplKt.updateChangedFlags((i32 + 1) - (i32 & 1)), i);
                }
            });
        }
    }

    public static final void OutlinedCard(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i2, int i3) {
        int i4;
        CardElevation cardElevationM1851outlinedCardElevationaqJV_2Y = cardElevation;
        CardColors cardColorsOutlinedCardColors = cardColors;
        Modifier.Companion companion = modifier;
        BorderStroke borderStrokeOutlinedCardBorder = borderStroke;
        Shape outlinedShape = shape;
        Composer composerStartRestartGroup = composer.startRestartGroup(740336179);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(OutlinedCard)P(4,5,1,3)297@13151L13,298@13204L20,299@13270L23,300@13335L20,303@13413L170:Card.kt#uh7d8r");
        int i5 = (-1) - (((-1) - i3) | ((-1) - 1));
        if (i5 != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changed(companion) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        if ((i2 + 48) - (i2 | 48) == 0) {
            int i6 = ((i3 & 2) == 0 && composerStartRestartGroup.changed(outlinedShape)) ? 32 : 16;
            i4 = (i4 + i6) - (i4 & i6);
        }
        if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 + 4) - (i3 | 4) == 0 && composerStartRestartGroup.changed(cardColorsOutlinedCardColors)) ? 256 : 128)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            int i7 = ((i3 + 8) - (i3 | 8) == 0 && composerStartRestartGroup.changed(cardElevationM1851outlinedCardElevationaqJV_2Y)) ? 2048 : 1024;
            i4 = (i4 + i7) - (i4 & i7);
        }
        if ((i2 & 24576) == 0) {
            int i8 = ((-1) - (((-1) - i3) | ((-1) - 16)) == 0 && composerStartRestartGroup.changed(borderStrokeOutlinedCardBorder)) ? 16384 : 8192;
            i4 = (i4 + i8) - (i4 & i8);
        }
        if ((i3 + 32) - (i3 | 32) != 0) {
            i4 = (i4 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((-1) - (((-1) - i2) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) == 0) {
            int i9 = composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
            i4 = (i4 + i9) - (i4 & i9);
        }
        if ((74899 & i4) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
                    outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                    i4 &= -113;
                }
                if ((i3 & 4) != 0) {
                    cardColorsOutlinedCardColors = CardDefaults.INSTANCE.outlinedCardColors(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-897)));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                    cardElevationM1851outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m1851outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    i4 = (i4 - 7169) - (i4 | (-7169));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                    borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(false, composerStartRestartGroup, 48, 1);
                    i4 = (i4 - 57345) - (i4 | (-57345));
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-113)));
                }
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                    i4 &= -7169;
                }
                if ((i3 + 16) - (i3 | 16) != 0) {
                    i4 = (i4 - 57345) - (i4 | (-57345));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(740336179, i4, -1, "androidx.compose.material3.OutlinedCard (Card.kt:303)");
            }
            Card(companion, outlinedShape, cardColorsOutlinedCardColors, cardElevationM1851outlinedCardElevationaqJV_2Y, borderStrokeOutlinedCardBorder, function3, composerStartRestartGroup, (-1) - (((-1) - i4) | ((-1) - 524286)), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt.OutlinedCard.1
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ BorderStroke $border;
                final /* synthetic */ CardColors $colors;
                final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $content;
                final /* synthetic */ CardElevation $elevation;
                final /* synthetic */ Shape $shape;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C06101(Shape outlinedShape2, CardColors cardColorsOutlinedCardColors2, CardElevation cardElevationM1851outlinedCardElevationaqJV_2Y2, BorderStroke borderStrokeOutlinedCardBorder2, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32, int i22, int i32) {
                    super(2);
                    shape = outlinedShape2;
                    cardColors = cardColorsOutlinedCardColors2;
                    cardElevation = cardElevationM1851outlinedCardElevationaqJV_2Y2;
                    borderStroke = borderStrokeOutlinedCardBorder2;
                    function3 = function32;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    CardKt.OutlinedCard(modifier, shape, cardColors, cardElevation, borderStroke, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }

    public static final void OutlinedCard(Function0<Unit> function0, Modifier modifier, boolean z2, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i2, int i3) {
        int i4;
        Modifier.Companion companion = modifier;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        BorderStroke borderStrokeOutlinedCardBorder = borderStroke;
        CardColors cardColorsOutlinedCardColors = cardColors;
        Shape outlinedShape = shape;
        boolean z3 = z2;
        CardElevation cardElevationM1851outlinedCardElevationaqJV_2Y = cardElevation;
        Composer composerStartRestartGroup = composer.startRestartGroup(-727137250);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(OutlinedCard)P(7,6,4,8,1,3!1,5)352@15710L13,353@15763L20,354@15829L23,355@15894L27,359@16036L271:Card.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changedInstance(function0) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        int i5 = (i3 + 2) - (i3 | 2);
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            int i6 = composerStartRestartGroup.changed(companion) ? 32 : 16;
            i4 = (i4 + i6) - (i4 & i6);
        }
        int i7 = (-1) - (((-1) - i3) | ((-1) - 4));
        if (i7 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i8 = composerStartRestartGroup.changed(z3) ? 256 : 128;
            i4 = (i4 + i8) - (i4 & i8);
        }
        if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 |= ((i3 + 8) - (i3 | 8) == 0 && composerStartRestartGroup.changed(outlinedShape)) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            int i9 = ((i3 & 16) == 0 && composerStartRestartGroup.changed(cardColorsOutlinedCardColors)) ? 16384 : 8192;
            i4 = (i4 + i9) - (i4 & i9);
        }
        if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            int i10 = ((i3 + 32) - (i3 | 32) == 0 && composerStartRestartGroup.changed(cardElevationM1851outlinedCardElevationaqJV_2Y)) ? 131072 : 65536;
            i4 = (i4 + i10) - (i4 & i10);
        }
        if ((1572864 & i2) == 0) {
            i4 |= ((i3 + 64) - (i3 | 64) == 0 && composerStartRestartGroup.changed(borderStrokeOutlinedCardBorder)) ? 1048576 : 524288;
        }
        int i11 = (i3 + 128) - (i3 | 128);
        if (i11 != 0) {
            i4 |= 12582912;
        } else if ((12582912 + i2) - (12582912 | i2) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(mutableInteractionSource2) ? 8388608 : 4194304)));
        }
        if ((i3 & 256) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 100663296));
        } else if ((i2 + 100663296) - (i2 | 100663296) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 38347923)) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if (i7 != 0) {
                    z3 = true;
                }
                if ((i3 + 8) - (i3 | 8) != 0) {
                    outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                    i4 = (i4 - 7169) - (i4 | (-7169));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                    cardColorsOutlinedCardColors = CardDefaults.INSTANCE.outlinedCardColors(composerStartRestartGroup, 6);
                    i4 &= -57345;
                }
                if ((i3 & 32) != 0) {
                    cardElevationM1851outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m1851outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-458753)));
                }
                if ((i3 + 64) - (i3 | 64) != 0) {
                    int i12 = (-1) - (((-1) - (i4 >> 6)) | ((-1) - 14));
                    borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(z3, composerStartRestartGroup, (i12 + 48) - (i12 & 48), 0);
                    i4 = ((-3670017) + i4) - ((-3670017) | i4);
                }
                if (i11 != 0) {
                    mutableInteractionSource2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                    i4 = (i4 - 7169) - (i4 | (-7169));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                    i4 &= -57345;
                }
                if ((i3 & 32) != 0) {
                    i4 = (i4 - 458753) - (i4 | (-458753));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 64)) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-3670017)));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-727137250, i4, -1, "androidx.compose.material3.OutlinedCard (Card.kt:359)");
            }
            Card(function0, companion, z3, outlinedShape, cardColorsOutlinedCardColors, cardElevationM1851outlinedCardElevationaqJV_2Y, borderStrokeOutlinedCardBorder, mutableInteractionSource2, function3, composerStartRestartGroup, i4 & 268435454, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt.OutlinedCard.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ BorderStroke $border;
                final /* synthetic */ CardColors $colors;
                final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $content;
                final /* synthetic */ CardElevation $elevation;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function0<Unit> $onClick;
                final /* synthetic */ Shape $shape;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C06112(Function0<Unit> function02, Modifier companion2, boolean z32, Shape outlinedShape2, CardColors cardColorsOutlinedCardColors2, CardElevation cardElevationM1851outlinedCardElevationaqJV_2Y2, BorderStroke borderStrokeOutlinedCardBorder2, MutableInteractionSource mutableInteractionSource22, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32, int i22, int i32) {
                    super(2);
                    function0 = function02;
                    modifier = companion2;
                    z = z32;
                    shape = outlinedShape2;
                    cardColors = cardColorsOutlinedCardColors2;
                    cardElevation = cardElevationM1851outlinedCardElevationaqJV_2Y2;
                    borderStroke = borderStrokeOutlinedCardBorder2;
                    mutableInteractionSource = mutableInteractionSource22;
                    function3 = function32;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    Function0<Unit> function02 = function0;
                    Modifier modifier2 = modifier;
                    boolean z22 = z;
                    Shape shape2 = shape;
                    CardColors cardColors2 = cardColors;
                    CardElevation cardElevation2 = cardElevation;
                    BorderStroke borderStroke2 = borderStroke;
                    MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                    Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                    int i32 = i;
                    CardKt.OutlinedCard(function02, modifier2, z22, shape2, cardColors2, cardElevation2, borderStroke2, mutableInteractionSource3, function32, composer2, RecomposeScopeImplKt.updateChangedFlags((i32 + 1) - (i32 & 1)), i);
                }
            });
        }
    }
}
