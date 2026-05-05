package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
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
/* JADX INFO: compiled from: ComposedModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d̉=!4i\bӵLc\u000b\u0004I\u0006F\u000b6B\r\"4\u0012\u000e\u0007nʑA0ZeP.XS2\u000fy\b<řc$\u007fّCU \u0002*\t]]ogtJb\u000bY\u000f\u000e\u0016~nD\u0010cތu\u0012=1jom2}\u0007C9ntN\u00160428(\u0007\u0011\u001c:H>y)Dƚ\u0010\u00126D!T`\u0012e\u001b*\u0014\u0016>N\u007f.^wNdG\u001b^Ơ3#\toŌR'e4ƊQ\rT[?g\u0005ѭ6+n6]\u0015SR3\u000b`cW\u0003mzm\u000bv1?-_r\u0006A\t\u0017\u001a\u00159O%n\u0003(l\u0005\u007fb\u001c);O\u0012N~\u000f߭{z\u0002\u0011l\u001e\u001c\u000b?^>/*f6\rCv\u0003SnO0_۰\u0004zg<а)\u007f9/\u007f ƻUaI%f\u001c\n˜%\u001eQ\u007f\u0017!\nS>d##lw\u007f:\u0002FKRf\fo<\u001c\u000f!h\u00107\u001c2]~]\u0007AE\u001d%E[Q41m\u0012Hri\u0007\u0007ph\u0002l\u0001Iغ&n\u001c;Z#\u001a_\\z\u0015m`T\u0007+!O,T5|6\u0014ء`wB'ٚ\u0014NUl0oܷa\n3=~&gʤ\u0004\u000e\u00068\u00073cP\u0014\u0014oZ\u000f\u0014mE\u0013\u000bfpZU\"Y\u000b3R8Vw(y\u0012C|\u0017C8M\u000146B0GgE_\t\u001ePA\u0015\u001ao\\x\u0010-VC&\u0013iRw7\u0002˩`puk)c:\u0002x8=Ca5G%e$x4+\"5\u007f\u0381\u0004GmRܤPl\u001cy\u001c\u0001°\u001a\u001aGaG&!Á\u0017)`\u0001UEzq\u0016U[\u001a?z+\u0003?Ov?\u007f\u0012zv2_zLeSE-%p\u0013%\u001ec.\u0005\u0012]\u0001GqT#lNK\u0003\u0003\b>^:\r\u0005M!S\u0002Ȟ&|;1sA+\u001b\u0010*?\u0017q]\u0018n>{r\u000fTs\u0014\u0005Нg\u0016uhжa2A<\u0010^˽B\"2\u007f\u001bYV~\u0010\bp\b\\\ra]qh~lPM9.Dk¡0\rvmsL!\b\u00164\\^Rsq\u0013DbQ;)M\u0002f4mcs\u0019c'\n9zYn@1m$dmz\t^\u0005:\u001dݠE;h\u0019T\u001b2ND<6\nkT\u0018\u001b@~\u000e\\w\u000fE1\tƽŒZ)"}, d2 = {"1n\\=b:>R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "7mb=X*M]&b\u0004_6", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "4`RAb9R", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@\u0004*Ft\u001a7\u0017HLs}\u001f%q_H\u000bm5\\@\bWUL;`\\{\tix`\u0018]2\u0011\u000e#F5v\u000e8/\u0011*X\u0006Eq\u000fUv\u001e>h\u007fF`\u0019\u0015OX\\=2gSccxZ\u000bCl2o\u0016m\u001d&J>m{{\u0018\u001fiT.\u0017Q", "4t[9l\u0018NO \u0003{b,{q+m\u007f", "", "9dh}", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@\u0003\u001cHi_5IL=5\"-\"lj;\\J1J\b#\u0011SJ5^\u001c\\:\u0019\u0012X\u001d$\u0012\u0013\u000fhH(w\u000e<0\u0010uJ\u0012Df\u0010\u0010 \u0017C4QR_\u000eV}\u001f~\r~OLcn\u0001KJ\u000fg;lU`-e8I(\u001ez'dI`7\b\u000bW\u001b{ O+NC\"yE.Bln\u0010Cy]G~5\u001f\u0015\f{[\u001abs/u1\u0004A\u007f", "9dh~", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@\u0003\u001cHi_5IL=5\"-\"lj;\\J1J\b#\u0011SJ5^\u001c\\:\u0019\u0012X\u001d$\u0012\u0012\u0001j=mu@@!Q\u0016F\u0007;f\u0010a|\u0014?ywF_YL\u000b\u001d?B9qDhc\u0004PO\u000fC:m\nn!fC\u0006yzw#*oT7S\u0001d\u0019<S\npeV\u001d\u0005A2\bNkOC~YF}tt\u000fbs\u001b1e~/s@M24>o\u000fYgaNbB|6[E(*6Ih", "9dh\u007f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@\u0003\u001cHi_5IL=5\"-\"lj;\\J1J\b#\u0011SJ5^\u001c\\:\u0019\u0012X\u001d$\u0012\u0012\u0001j=mu@@!Q\u0016F\u0007;f\u0010a|\u00131{l\f]\fP{^_>.hDh5`MKTi.mUd.d\u0004;4\u001do(\u001frY<S\\c\u001apa}qp\u0013na>.Mt_O\u000ftfD>(/Ty\u0007\u0016<a\u0003tU=\r29:n\u000e\u0019=[%Z\u0002\u00149fE&9\u007f:\u001dGVm\u0004l\b\u001elhI\u0012\rf65\u0019r;", "9dh@", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@\u0003\u001cHi_5IL=5\"-\"lj;\\Y\u0013Sr8C\u0016U(eT<'\u0011\u0017Z\f]\u0001s\u000bcP+rM\u0001$\u00194\u0013\u0003Kq~\u001b\u001a\u0018>x:#f\u0019E\t\u0019\u007fJt>-_i\tNEN,/u\u0014)\u001elC83\u0018{\")21>\u0013yb\u0015|[G=+.\u0015\u000471HqZY\u000fm_D\u007f1-KE\b\u0016{@~*x.\b47\f", ";`c2e0:Z\u001d\u0014z", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g}-\r", ";nS6Y0>`", ";`c2e0:Z\u001d\u0014zF6{\r0i\u007f5", ";`c2e0:Z\u001d\u0014zB4\b\u0010", ";`c2e0:Z\u001d\u0014zP0\f\f\ro\b3\u0006N\u0005&\u001bQxtFt!<=\u0007%7k%2WL", ";`c2e0:Z\u001d\u0014zP0\f\f\ro\b3\u0006N\u0005&\u001bQxtFt!<=\u0007%7k%2WL\u001ftC\u001e\"q]@", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ComposedModifierKt {
    public static /* synthetic */ Modifier composed$default(Modifier modifier, Function1 function1, Function3 function3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, function1, function3);
    }

    public static final Modifier composed(Modifier modifier, Function1<? super InspectorInfo, Unit> function1, Function3<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> function3) {
        return modifier.then(new ComposedModifier(function1, function3));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, Function1 function1, Function3 function3, int i2, Object obj2) {
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, (Function1<? super InspectorInfo, Unit>) function1, (Function3<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier>) function3);
    }

    public static final Modifier composed(Modifier modifier, String str, Object obj, Function1<? super InspectorInfo, Unit> function1, Function3<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> function3) {
        return modifier.then(new KeyedComposedModifier1(str, obj, function1, function3));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, Object obj2, Function1 function1, Function3 function3, int i2, Object obj3) {
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, obj2, function1, function3);
    }

    public static final Modifier composed(Modifier modifier, String str, Object obj, Object obj2, Function1<? super InspectorInfo, Unit> function1, Function3<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> function3) {
        return modifier.then(new KeyedComposedModifier2(str, obj, obj2, function1, function3));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, Object obj2, Object obj3, Function1 function1, Function3 function3, int i2, Object obj4) {
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, obj2, obj3, function1, function3);
    }

    public static final Modifier composed(Modifier modifier, String str, Object obj, Object obj2, Object obj3, Function1<? super InspectorInfo, Unit> function1, Function3<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> function3) {
        return modifier.then(new KeyedComposedModifier3(str, obj, obj2, obj3, function1, function3));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object[] objArr, Function1 function1, Function3 function3, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, objArr, (Function1<? super InspectorInfo, Unit>) function1, (Function3<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier>) function3);
    }

    public static final Modifier composed(Modifier modifier, String str, Object[] objArr, Function1<? super InspectorInfo, Unit> function1, Function3<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> function3) {
        return modifier.then(new KeyedComposedModifierN(str, objArr, function1, function3));
    }

    public static final Modifier materializeModifier(Composer composer, Modifier modifier) {
        composer.startReplaceGroup(439770924);
        Modifier modifierMaterializeImpl = materializeImpl(composer, modifier);
        composer.endReplaceGroup();
        return modifierMaterializeImpl;
    }

    /* JADX INFO: renamed from: androidx.compose.ui.ComposedModifierKt$materializeImpl$1 */
    /* JADX INFO: compiled from: ComposedModifier.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,r\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u0015`}(7v%\u0004", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2s9\u0005 ?m\u001f=#\u0007\"p0/\u00112h5\u0010eu+\u00011NLJ52"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function1<Modifier.Element, Boolean> {
        public static final AnonymousClass1 INSTANCE = ;

        AnonymousClass1() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Modifier.Element element) {
            return Boolean.valueOf(!(element instanceof ComposedModifier));
        }
    }

    public static final Modifier materializeImpl(final Composer composer, Modifier modifier) {
        if (modifier.all(AnonymousClass1.INSTANCE)) {
            return modifier;
        }
        composer.startReplaceableGroup(1219399079);
        Modifier modifier2 = (Modifier) modifier.foldIn(Modifier.Companion, new Function2<Modifier, Modifier.Element, Modifier>() { // from class: androidx.compose.ui.ComposedModifierKt$materializeImpl$result$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Modifier invoke(Modifier modifier3, Modifier.Element element) {
                Modifier.Element elementMaterializeImpl;
                if (element instanceof ComposedModifier) {
                    Function3<Modifier, Composer, Integer, Modifier> factory = ((ComposedModifier) element).getFactory();
                    Intrinsics.checkNotNull(factory, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                    elementMaterializeImpl = ComposedModifierKt.materializeImpl(composer, (Modifier) ((Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(factory, 3)).invoke(Modifier.Companion, composer, 0));
                } else {
                    elementMaterializeImpl = element;
                }
                return modifier3.then(elementMaterializeImpl);
            }
        });
        composer.endReplaceableGroup();
        return modifier2;
    }

    public static final Modifier materializeWithCompositionLocalInjectionInternal(Composer composer, Modifier modifier) {
        return modifier == Modifier.Companion ? modifier : materializeModifier(composer, new CompositionLocalMapInjectionElement(composer.getCurrentCompositionLocalMap()).then(modifier));
    }
}
