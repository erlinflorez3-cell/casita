package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
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
/* JADX INFO: compiled from: AnimateAsState.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яh\u001d̉=!4i\bDRh|İI\u0006F\u000b6Ȑ\u0007\":\u0018\u007fјnjO0L͜P.hS2şs{J$cҕyCQU\"Ԃ*\teNo˧vJp\u000bK\u000f\f\u0016\u0001jBI]ތe\u0012%2JoM3UoC:htD\u0011(2(S\u0002\u0005\u0017\u001a2Ϻ\u0018v\u0011CS\f\u00183X7Ha%S\u0015\u001c\"\u0006l\"/.\rk\\G`l\f<_/\tiP`?e@~]\rtVU 'u$+NKM#5U\u0013\u0007\u0001]O\u0005Oqk\u001b~&U@\u0010xˇ5ݙÿ\u0018\u00171f\u001bu\u000bvj\u0014if\u001c);O\u0012M~\u001eX{\t\r%<2\u001063N.;,~\u000e\u001e5\u0005r\u0002B~\u0015\u000fH\u0006zoO/%.M[M!f_uS'^9\f\u0005; 3\u0003~!\nj$_C0\u001b|ϼ0҅͘AJT%gY\u0006O~\u007f\u001a0\u00142W\u007f]{?>G)ElQ#Ok2TJg\u0005\u0017xnckbHn\"\u001d)g0\u000f\fhb|\u0005\u001aP\u0005l2\u0011[0l\u0015\u000e\n# \u000bwL#5\u0010|e~h\u0019b$\u000fɻ3fEx\u0007A\u001ctQdC7ac>a\u0001\u0007DCJs\u001dX\u0015B\u0004\u0018`\\64JNz\u0012\b{rN:&bEw\u001cBJI\u0019\u000b\u0015x\t$BO\u0016!_\t\u0003@\u0013Z32\u0017\u00022\u0005\u000b\u0011P\u000bp\u007fi\tIZ\u0013v![V\u0018:Ԋ*U0\tL>1(\u0017y\u0010IwLuP\u001b&&Y\n1.\u001agU_I\u0019\u000f\r;J\b=G\\r\u0014U{%W\u000f\u0003y\u001dO\u0001<w\nzpZdzL_TE8\r]!8Niѣ}aT\u001d_/b,sDYt\u0013YjRf\r5#,6\u0019oP\u0001e9I'+(\u0010\u001a?\u0017q]\u0018s\\\r\u0013\u0015,ts\u001dDcD\n\u0013ec2ILag\u000f@2$\u001b\u0007RJzw6X\u001f3;H\u000fFяtVFp#u\f\u000b\u001f2\u001drf[h\u0019\u001e\u000ed2m;\fC,\u001a\u000fO+\u0011[e\u007fs}Ml\u000bx\u00158\u001e,Et\u0012*Q8dgd\u001904y(8Q;\u0011\u001bR\bRIrA\u0082\n͏Ұm\b\u0016 \u000elw_%VZyKX\u001eT'b\u0005X5dSq9*/\u0005??$xCC\u001dsVV?c`\u0007\u000209!pO\r\u007f=+rni/.X\u000f\u001f]kSK\u001262M9o{o:N.{KW^ ˼PΙچz2d2c\rf+\u0005;~X^$9~)\u0005<L:\u0013\u0019*gr\u001ej]XTwEU2\u0007'F9\u0007:\u0005\u0012YKA\f5;Qax$)\fW\u0002C\u000e\n0 U\u001a\u000b \u000blTkǃ\\ͩƐ\u001as\u001c\r\u0010/+!.-FP\u0005t\u001a.6>}\u0012c\u0006!oqk&)p31l\u0014Tcn\t\fsl\u0012v\u0004\u001e3l7V\b\bEPK#Wa4\u0013fnR\u001fc\"h\u0011.\u001c%(/66x?\u000f}x/uךN܀á/1qUoYH\u0019,*7\u007f\u0006\u0006:TV\u001fif}Br\u001atlpa>jp(r\u0007$/$~\u000fH\r\u001bAGv\u0007$d=K1-k\u000fW`5\u000eUK6!_hU\u001aeGQtƂuܾ֫>dz-8h!C\u000e\u0014D3VVM\u001aUcR}\u0015\u00074\\]8p\u0012\\\u001d\u0014\u0011=lP&N^*\u001ci[aTI\u0017\u0007\u0015F\u001f\b\u0007GO\u001beY%8\u0015\u0015\u000f\u001dA\n1\u001aD\u00049\u0003#]%\u0006\u001a\u0006{\u0002*͘d͗ۡ\u0010\u0004kx\ru{\u0018\u001d\u0011DOEG.y\u0004L.\u001aO(2\u0017\u000e#.QaT0_jRnyg\u00066*dzr6w\u0001~s\u0018@\u0002&\u0004fkabM\u000b\u0016)Dl@Ck5Z\u0014mނ\u000fD\u001bu,\u0003\u001d5A9'~ O LYY#Q=mu<A\u007f4F8aD\f_Fi,\u0016-@`\u0012}\u001bsW_\u001eQ*\r;\u001e(EX`\u000et5&7M\u0007Fdh\tOQb9V%#\rC\t\u0011ƨ\n\u0016<y/H\f|x\u001b#5WsoU@f,%+\"s%43\u0018vM?c\u0004pCI5\u001bmxfcx\r\u0019[!YxC#\u0010l;.udN\u001c:X4$[cv%\u000b}ڝ'ҒԊ42V2hiuQ*QU[%g\u000f2\u0011E\ntA/Eh\u0007R\u00041]\u0005\b\u0003\u001eS1\u0019\u001b c9`1\" aD\u0002\bjbm|\u001cc@\u0017gJ/C\u001eM?C[l\u0005sO\u001bg?-\"6&R\u001bY)äfѕَ\u0012$e7Z^n\u001bV\u0001q\u0017vDz\u000fA+:>,:[\u0381K<1h\"4I\u0017h,\\)9K]{\u0014*,&\u0017\u0005g\u0007]7\u0006\u001bN18GsQo\u00145\t\u000b\u0013n#]&N%\u001a -(q{\u000f_^*\u0006ksj\u0002rx\u0013o32f\u0015\u000exfrR{LLJ|\u0019-\u0006\u000e\u001daD\u0011\u001fvovVVg܍0'D\u0004\u0003\u0015\u000f6cg'\u0016GD=Y\u0016CZ$gͩa\u0014EMP\u0005\u001c\"\nwC4\u000e7D\u001e\b,CK5Nt,\u001cx\u0015O@\u00042eBHj@bd\ta\u001et\u000e*\u001c\u001e\u0015\u000b<pcR\u0018,M\u0006\u0015\u0007)\u001e(_o;] Y9IB\u000e2[q\u0013n\u0007vUB\u0002\u0006-&Z\nEnQsBigs_4\f4?|\u0018\rf\u0012ܡ\u0016\u0004q\u0007Cawα)c>O\b\u0007\b<\b@X܂$˙(\b\u001dֲ\"ZBKJ(3\u0003\u001f6FL\u0015mOΘ\u000bà\u0010/|҉.D{A\flmiDAkY\f}\u001cԟ1ʺ\fKQԄ\u001f=U\u0013a\u001cJQ\\m$akSlߕ\tب\b1\u0018Ӎ\u0001mP\u001e\u0010\u000er6{:*O1\u0013Aׅ0߱^fvԬ\u0017bo\u0019U\u001c\u001d\u0016\u0015>\"3Q?{ߋbݦ\u0004;\u0011ލ=I_P|\u0011T\u00138``J@\u000e\u001fڙhÝ\u001f\u0002\rċ\u0005,$F]~PM%[2u\u0012Px٬J̉,/\u0012ϔע6\"\b8?δ\u0010~]ڰk\u001cϧYI\u001ce\u0007]\u0018s@2\u000e\u0014j\"?[6$`eze-C\rؙ<-\u0017x\u001d>#9REPU\u001aɃާgץ:\u000bI\u001d\u0001Yt|.n\"\u0012UC\u001e\b'ÚOU6\u0014*\u0007\u000e,\u00044}.WΊޗ\u0013"}, d2 = {"2dU.h3M/\"\u0003\u0003Z;\u0001\u00138", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000eBz\u001a7O1Fk2s", "", "2o32Y(NZ(l\u0006k0\u0006\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "7mc\u0011X-:c \u000ehi9\u0001\u00121", "", "7mc\u001cY-LS(]z_(\r\u0010>S\u000b5\u007fI\u0003", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "7mc \\A>2\u0019\u007fvn3\fv:r\u00041}", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "=eU@X;\u001dS\u001az\u000be;j\u0014<i\t*", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "@dRA7,?O)\u0006\nL7\n\r8g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "Ahi27,?O)\u0006\nL7\n\r8g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "/mX:T;>2$Z\tL;x\u0018/", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "B`a4X;/O \u000fz", "/mX:T;B]\"l\u0006^*", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", "4h]6f/>R\u007f\u0003\tm,\u0006\t<", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "/mX:T;>2$Z\tL;x\u0018/-e=N\u0014\u000f%)", "uE;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0003sa7\\J2X\u0006.KU\u00181mZ<>$\u001bX\u001dR5\u0016\u0013#\"4wBF#\u00125\u0015W\"d\n\u000b#\u00189i\u0004\fT\u001aO\u0005\u001f\u0004AruVbn}OA\u000f@4l\u0017i+\\G\u0010\bw5\u007f\u0017qO;\u0014\u007fR$<P\u0004orQ'z\u00021NvjJMo\u001f*\u0004#.KQ", ":`Q2_", "", "/mX:T;>2$Z\tL;x\u0018/-[-\u0007\u001d`\u001fz", "uE;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0003sa7\\J1J\b#\u0011SJ5^\u001c`L!\u0016c\u0010$\u0012\u0013\u000fhH(w\u000e<0\u0010uJ\u0012Df\u0010\u0010 \u0017C4QR_\u000eV}\u001f~\r~OBb^\u0007QEDusb\u0016g(fH:m!\u0002\"*lX.SY]\u0019}\\\bgt\u001d|^{\u000b:vZSOsTO>%)S\u0007\u0002 2\"\u0002;}<\b<*\u007fR\u0014Gv\u0018\u0014", "/mX:T;>4 \tvm\b\u000bv>a\u000f(", "Dhb6U0EW(\u0013ia9|\u00172o\u0007'", "uE;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0003sa7\\D\u0013T\u00016NPWuacz\u0007\u0015\"c\f]/\u0017\u000eg\u000b\u0005~M5.\f6RM\u0011O|\u0015\u0015\u001b?noU \u000eQ\u0002 \u007fO)2Sih\tKIE,\bn\u0014j'j:GywU\\\u0002dY-\u0017\u0006W\u0010\u0006\u001cwqoR#\t8mK}dUIwU\u0006b6\u001bZ{M", "uE;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0003sa7\\D\u0013Sr8C\u0016U(eT<+#\u001f^\u0017P\u0001s\u000bcP+rM\u0001$\u00194\u0013\u0003Kq~\u001b\u001a\u0018>x:#f\u0019E\t\u0019\u007fJt>-UhxTKIa=.\ni%gDH$]~)$wT6\nE1\u001bz]\u0004ugTn^\u001cg%idERyY;\bp\u001dU\u0004\u0003\u001c@X>8\u00056\u0013826.rZc'>4", "/mX:T;>7\"\u000eVl\u001a\f\u0005>e", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0003sa7\\J2X\u0006.KU\u00181mZ<>$\u001bX\u001dR5\u0016\u0013#\"4wBF#\u00125\u0015W\"d\n\u000b#\u00189i\u0004\fT\u001aO\u0005\u001f\u0004AruVbn}OA\u000f@4l\u0017i+\\G\u0010\bw5\u007f\u0017qO;\u0014\u007fR$<P\u0004orQ'z\u00021NvjJMo\u001f*\u0004#.KQ", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0003sa7\\J1J\b#\u0011SJ5^\u001c`L!\u0016c\u0010$\u0012\u0013\u000fhH(w\u000e<0\u0010uJ\u0012Df\u0010\u0010 \u0017C4QR_\u000eV}\u001f~\r~OBb^\u0007QEDusb\u0016g(fH:m!\u0002\"*lX.SY]\u0019}\\\bgt\u001d|^{\u000b:vZSOsTO>%)S\u0007\u0002 2\"\u0002;}<\b<*\u007fR\u0014Gv\u0018\u0014", "/mX:T;>7\"\u000ed_-\u000b\t>A\u000e\u0016\u000b<\u0010\u0017", "/mX:T;>7\"\u000ed_-\u000b\t>A\u000e\u0016\u000b<\u0010\u0017^\u001ap^G~\u0012\u0015", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0003sa7\\J2X\u0006.KU\u00181mZ<>$\u001bX\u001dR5\u0016\u0013#\"4wBF#\u00125\u0015W\"d\n\u000b#\u00189i\u0004\fT\u001aO\u0005\u001f\u0004AruVbn}OA\u000f@4l\u0017i+\\G\u0010\bw5\u007f\u0017qO;\u0014\u007fR$<P\u0004orQ'z\u00021NvjJMo\u001f*\u0004#.KQ", "/mX:T;>7\"\u000ed_-\u000b\t>A\u000e\u0016\u000b<\u0010\u0017^*\u0004x&H\u0002\u001d", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0003sa7\\J1J\b#\u0011SJ5^\u001c`L!\u0016c\u0010$\u0012\u0013\u000fhH(w\u000e<0\u0010uJ\u0012Df\u0010\u0010 \u0017C4QR_\u000eV}\u001f~\r~OBb^\u0007QEDusb\u0016g(fH:m!\u0002\"*lX.SY]\u0019}\\\bgt\u001d|^{\u000b:vZSOsTO>%)S\u0007\u0002 2\"\u0002;}<\b<*\u007fR\u0014Gv\u0018\u0014", "/mX:T;>7\"\u000ehbA|d=S\u000f$\u000b@", "/mX:T;>7\"\u000ehbA|d=S\u000f$\u000b@H,\u00064P\b\u0018b", "/mX:T;>7\"\u000ehbA|d=S\u000f$\u000b@He\u0019Q\u0003\u0002/f", "/mX:T;>=\u001a\u007f\t^;X\u0017\u001dt{7{", "/mX:T;>=\u001a\u007f\t^;X\u0017\u001dt{7{\big\u0018(p\u0019\u000b", "/mX:T;>=\u001a\u007f\t^;X\u0017\u001dt{7{\bRdg\u0014ak>", "/mX:T;>@\u0019|\n::j\u0018+t\u007f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~F}\u001eFC|*VBHu8\u001d(2_C\u000fn6\\vpCUR4XavG\u001d[X\u0018[+V`bE,jS;)\u0011\u001aT\u00029>g\u0012 \u001d<ny\f[!OC\u0016\u0006J'wJch\b\u0011\"Uk(s\u0010i&(\u0010! \u001dp&%lOASy]\u0019}\\\bg1T)\u0004G(Fm%$Ow`F\u0003',!_[U\u0019T}*\u00027\b3=\u007fb\u000fSr\"L^B\"<eP+.6\u0006\u0001NGruB", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~F}\u001eFC|*VBHu8\u001d(2_C\u000fn6\\vpCUR4XavG\u001d[X\u0018[+V`bE,jS;)\u0011\u001aT\u00029>g\u0011\u0012\u001f14w>_\u0012\u0011g$\u0003E2j\u001c@e\u0004VHIksi\u001dgf]JC\"#u#$v\u001a\u000f\u001a\u0005Q v\\\u00033=.\u0015\u000471HqZY\u000fm_D\u007f1-KE\u0005\";gx3tva>2An\u0013Ktm\"B<{(e@40:;&\tIm}wH\u001chhn\u0018\u0017q99\u0019/SrD\u001e\u00073", "/mX:T;>A\u001d\u0014z::j\u0018+t\u007f", "/mX:T;>A\u001d\u0014z::j\u0018+t\u007fobEn,\u001e9:", "/mX:T;>A\u001d\u0014z::j\u0018+t\u007foo'\f\u0011\n2\u0002", "/mX:T;>D\u0015\u0006\u000b^\b\u000bv>a\u000f(", "\"", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "Bx_266Gd\u0019\f\n^9", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fIw\b*a!EtE\u001e\"waF\\", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b<\n\u0016$Qs\rO@#?a\t*Em_*VGCgC\"\u001fq+7\u0011p,\u0018e9Q>J@:\\{N\u0014\u001fi\u000e[\u0001s\u0001b@1xH62Q*S\nFr\u000f\f_\n>nx>e\u0014Q\u0003^sK6h\u00105h}O=Tf4myj\u001dZ\u0010!)\u0010\u0003\u0015doL7\fE=\u000ewRwv=.\u001f\u0005G+Bv%KVw\u001f=\u00050\u001dZ\u007f\u0002\u001b@\"U;}+\u001384?0Z2c!=k\u0003\u0019+o\u000b%0>G\u001dMK-\u0003|G\u001dl'aQkl=<#sep\u001erj!}W>`l\u000b;Q\u0019\bGy\u001d2P\rB%\u0007%\u0012\u0016(ue\u00131*P\u0010\u001aF", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b<\n\u0016$Qs\rO@#?a\t*Em_*VGCgC\"\u001fq+7\u0011p,\u0018e9Q>J@:\\{N\u0014\u001fi\u000e[\u0001s\u0001b@1xH62Q*S\nFr\u000f\f_\n>nx>e\u0014Q\u0003^sK6h\u00105h}O=Tf4myj\u001dZ\u0010!)\u0010\u0003\u0015doL7\fE=\u000ewRwv=.\u001evI \btWOG9CK\u0002+(MQ^\u0018<g{/}v\tE2\u007fe\u0015Te'Bh\u0002#u=Q0$E@\u001dH\u00179\\hG\ru)e\u0007!,3;!poqHX\u0014m j9i_J\u0015\\\u000eIS}\u00154\u001cb&\u001f`\u0011\u0012\u00061wiHVdR\u000b\"{N0_Z\u0010\u0013o' 6\u0016\u0007G\u001ed9_\r", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001", ":hbAX5>`", "/mX:F7>Q"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AnimateAsStateKt {
    private static final SpringSpec<Float> defaultAnimation = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
    private static final SpringSpec<Dp> dpDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Dp.m6636boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Dp.Companion)), 3, null);
    private static final SpringSpec<Size> sizeDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Size.m3994boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Size.Companion)), 3, null);
    private static final SpringSpec<Offset> offsetDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Offset.m3926boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.Companion)), 3, null);
    private static final SpringSpec<Rect> rectDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion), 3, null);
    private static final SpringSpec<Integer> intDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Integer.valueOf(VisibilityThresholdsKt.getVisibilityThreshold(IntCompanionObject.INSTANCE)), 3, null);
    private static final SpringSpec<IntOffset> intOffsetDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m6757boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 3, null);
    private static final SpringSpec<IntSize> intSizeDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m6800boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 3, null);

    public static final State<Float> animateFloatAsState(float f2, AnimationSpec<Float> animationSpec, float f3, String str, Function1<? super Float, Unit> function1, Composer composer, int i2, int i3) {
        Function1<? super Float, Unit> function12 = function1;
        String str2 = str;
        SpringSpec springSpec = animationSpec;
        ComposerKt.sourceInformationMarkerStart(composer, 668842840, "C(animateFloatAsState)P(3!1,4,2)75@3368L173:AnimateAsState.kt#pdpnli");
        if ((2 & i3) != 0) {
            springSpec = defaultAnimation;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            f3 = 0.01f;
        }
        if ((8 & i3) != 0) {
            str2 = "FloatAnimation";
        }
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
            function12 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(668842840, i2, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:68)");
        }
        if (springSpec == defaultAnimation) {
            composer.startReplaceGroup(1125598679);
            ComposerKt.sourceInformation(composer, "71@3220L83");
            ComposerKt.sourceInformationMarkerStart(composer, 313404723, "CC(remember):AnimateAsState.kt#9igjgp");
            boolean z2 = ((((-1) - (((-1) - i2) | ((-1) - 896))) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) > 256 && composer.changed(f3)) || (-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 256;
            Object objRememberedValue = composer.rememberedValue();
            if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, Float.valueOf(f3), 3, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceGroup();
            springSpec = (SpringSpec) objRememberedValue;
        } else {
            composer.startReplaceGroup(1125708605);
            composer.endReplaceGroup();
        }
        int i4 = (i2 + 14) - (14 | i2);
        int i5 = i2 << 3;
        int i6 = (-1) - (((-1) - i5) | ((-1) - 7168));
        int i7 = (-1) - (((-1) - ((i6 + i4) - (i6 & i4))) & ((-1) - (57344 & i5)));
        int i8 = i5 & 458752;
        State<Float> stateAnimateValueAsState = animateValueAsState(Float.valueOf(f2), VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), springSpec, Float.valueOf(f3), str2, function12, composer, (i7 + i8) - (i7 & i8), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateAnimateValueAsState;
    }

    /* JADX INFO: renamed from: animateDpAsState-AjpBEmI */
    public static final State<Dp> m465animateDpAsStateAjpBEmI(float f2, AnimationSpec<Dp> animationSpec, String str, Function1<? super Dp, Unit> function1, Composer composer, int i2, int i3) {
        Function1<? super Dp, Unit> function12 = function1;
        String str2 = str;
        SpringSpec<Dp> springSpec = animationSpec;
        ComposerKt.sourceInformationMarkerStart(composer, -1407150062, "C(animateDpAsState)P(3:c#ui.unit.Dp!1,2)114@5081L165:AnimateAsState.kt#pdpnli");
        if ((i3 & 2) != 0) {
            springSpec = dpDefaultSpring;
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            str2 = "DpAnimation";
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            function12 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1407150062, i2, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:113)");
        }
        int i4 = (-1) - (((-1) - ((-1) - (((-1) - i2) | ((-1) - 14)))) & ((-1) - ((-1) - (((-1) - (i2 << 3)) | ((-1) - 896)))));
        int i5 = i2 << 6;
        State<Dp> stateAnimateValueAsState = animateValueAsState(Dp.m6636boximpl(f2), VectorConvertersKt.getVectorConverter(Dp.Companion), springSpec, null, str2, function12, composer, (-1) - (((-1) - (i4 | ((57344 + i5) - (57344 | i5)))) & ((-1) - ((i5 + 458752) - (i5 | 458752)))), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateAnimateValueAsState;
    }

    /* JADX INFO: renamed from: animateSizeAsState-YLp_XPw */
    public static final State<Size> m474animateSizeAsStateYLp_XPw(long j2, AnimationSpec<Size> animationSpec, String str, Function1<? super Size, Unit> function1, Composer composer, int i2, int i3) {
        Function1<? super Size, Unit> function12 = function1;
        String str2 = str;
        SpringSpec<Size> springSpec = animationSpec;
        ComposerKt.sourceInformationMarkerStart(composer, 1374633148, "C(animateSizeAsState)P(3:c#ui.geometry.Size!1,2)155@6928L167:AnimateAsState.kt#pdpnli");
        if ((i3 + 2) - (i3 | 2) != 0) {
            springSpec = sizeDefaultSpring;
        }
        if ((i3 & 4) != 0) {
            str2 = "SizeAnimation";
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            function12 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1374633148, i2, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:154)");
        }
        int i4 = i2 << 3;
        int i5 = (-1) - (((-1) - ((i2 + 14) - (14 | i2))) & ((-1) - ((i4 + 896) - (i4 | 896))));
        int i6 = i2 << 6;
        State<Size> stateAnimateValueAsState = animateValueAsState(Size.m3994boximpl(j2), VectorConvertersKt.getVectorConverter(Size.Companion), springSpec, null, str2, function12, composer, (-1) - (((-1) - (i5 | ((57344 + i6) - (57344 | i6)))) & ((-1) - ((i6 + 458752) - (i6 | 458752)))), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateAnimateValueAsState;
    }

    /* JADX INFO: renamed from: animateOffsetAsState-7362WCg */
    public static final State<Offset> m471animateOffsetAsState7362WCg(long j2, AnimationSpec<Offset> animationSpec, String str, Function1<? super Offset, Unit> function1, Composer composer, int i2, int i3) {
        Function1<? super Offset, Unit> function12 = function1;
        String str2 = str;
        SpringSpec<Offset> springSpec = animationSpec;
        ComposerKt.sourceInformationMarkerStart(composer, 357896800, "C(animateOffsetAsState)P(3:c#ui.geometry.Offset!1,2)195@8761L169:AnimateAsState.kt#pdpnli");
        if ((i3 & 2) != 0) {
            springSpec = offsetDefaultSpring;
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            str2 = "OffsetAnimation";
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            function12 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(357896800, i2, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:194)");
        }
        int i4 = i2 << 6;
        int i5 = (i2 & 14) | ((-1) - (((-1) - (i2 << 3)) | ((-1) - 896))) | (57344 & i4);
        int i6 = (i4 + 458752) - (i4 | 458752);
        State<Offset> stateAnimateValueAsState = animateValueAsState(Offset.m3926boximpl(j2), VectorConvertersKt.getVectorConverter(Offset.Companion), springSpec, null, str2, function12, composer, (i5 + i6) - (i5 & i6), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateAnimateValueAsState;
    }

    public static final State<Rect> animateRectAsState(Rect rect, AnimationSpec<Rect> animationSpec, String str, Function1<? super Rect, Unit> function1, Composer composer, int i2, int i3) {
        Function1<? super Rect, Unit> function12 = function1;
        SpringSpec<Rect> springSpec = animationSpec;
        String str2 = str;
        ComposerKt.sourceInformationMarkerStart(composer, 536062978, "C(animateRectAsState)P(3!1,2)236@10633L167:AnimateAsState.kt#pdpnli");
        if ((i3 & 2) != 0) {
            springSpec = rectDefaultSpring;
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            str2 = "RectAnimation";
        }
        if ((i3 & 8) != 0) {
            function12 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(536062978, i2, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:235)");
        }
        int i4 = i2 & 14;
        int i5 = (-1) - (((-1) - (i2 << 3)) | ((-1) - 896));
        int i6 = (i4 + i5) - (i4 & i5);
        int i7 = i2 << 6;
        int i8 = (-1) - (((-1) - 57344) | ((-1) - i7));
        int i9 = (i6 + i8) - (i6 & i8);
        int i10 = (-1) - (((-1) - i7) | ((-1) - 458752));
        State<Rect> stateAnimateValueAsState = animateValueAsState(rect, VectorConvertersKt.getVectorConverter(Rect.Companion), springSpec, null, str2, function12, composer, (i9 + i10) - (i9 & i10), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateAnimateValueAsState;
    }

    public static final State<Integer> animateIntAsState(int i2, AnimationSpec<Integer> animationSpec, String str, Function1<? super Integer, Unit> function1, Composer composer, int i3, int i4) {
        String str2 = str;
        Function1<? super Integer, Unit> function12 = function1;
        SpringSpec<Integer> springSpec = animationSpec;
        ComposerKt.sourceInformationMarkerStart(composer, 428074472, "C(animateIntAsState)P(3!1,2)274@12363L166:AnimateAsState.kt#pdpnli");
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            springSpec = intDefaultSpring;
        }
        if ((i4 & 4) != 0) {
            str2 = "IntAnimation";
        }
        if ((i4 & 8) != 0) {
            function12 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(428074472, i3, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:273)");
        }
        int i5 = i3 & 14;
        int i6 = i3 << 3;
        int i7 = (i6 + 896) - (i6 | 896);
        int i8 = (i5 + i7) - (i5 & i7);
        int i9 = i3 << 6;
        int i10 = (-1) - (((-1) - 57344) | ((-1) - i9));
        State<Integer> stateAnimateValueAsState = animateValueAsState(Integer.valueOf(i2), VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), springSpec, null, str2, function12, composer, (-1) - (((-1) - ((i8 + i10) - (i8 & i10))) & ((-1) - (i9 & 458752))), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateAnimateValueAsState;
    }

    /* JADX INFO: renamed from: animateIntOffsetAsState-HyPO7BM */
    public static final State<IntOffset> m468animateIntOffsetAsStateHyPO7BM(long j2, AnimationSpec<IntOffset> animationSpec, String str, Function1<? super IntOffset, Unit> function1, Composer composer, int i2, int i3) {
        Function1<? super IntOffset, Unit> function12 = function1;
        String str2 = str;
        SpringSpec<IntOffset> springSpec = animationSpec;
        ComposerKt.sourceInformationMarkerStart(composer, -696782904, "C(animateIntOffsetAsState)P(3:c#ui.unit.IntOffset!1,2)314@14224L172:AnimateAsState.kt#pdpnli");
        if ((i3 + 2) - (i3 | 2) != 0) {
            springSpec = intOffsetDefaultSpring;
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            str2 = "IntOffsetAnimation";
        }
        if ((i3 & 8) != 0) {
            function12 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-696782904, i2, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:313)");
        }
        int i4 = (-1) - (((-1) - i2) | ((-1) - 14));
        int i5 = i2 << 3;
        int i6 = (i5 + 896) - (i5 | 896);
        int i7 = i2 << 6;
        int i8 = (-1) - (((-1) - ((i4 + i6) - (i4 & i6))) & ((-1) - (57344 & i7)));
        int i9 = i7 & 458752;
        State<IntOffset> stateAnimateValueAsState = animateValueAsState(IntOffset.m6757boximpl(j2), VectorConvertersKt.getVectorConverter(IntOffset.Companion), springSpec, null, str2, function12, composer, (i8 + i9) - (i8 & i9), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateAnimateValueAsState;
    }

    /* JADX INFO: renamed from: animateIntSizeAsState-4goxYXU */
    public static final State<IntSize> m469animateIntSizeAsState4goxYXU(long j2, AnimationSpec<IntSize> animationSpec, String str, Function1<? super IntSize, Unit> function1, Composer composer, int i2, int i3) {
        Function1<? super IntSize, Unit> function12 = function1;
        String str2 = str;
        SpringSpec<IntSize> springSpec = animationSpec;
        ComposerKt.sourceInformationMarkerStart(composer, 582576328, "C(animateIntSizeAsState)P(3:c#ui.unit.IntSize!1,2)352@16009L170:AnimateAsState.kt#pdpnli");
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            springSpec = intSizeDefaultSpring;
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            str2 = "IntSizeAnimation";
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            function12 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(582576328, i2, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:351)");
        }
        int i4 = i2 & 14;
        int i5 = (i2 << 3) & 896;
        int i6 = (i4 + i5) - (i4 & i5);
        int i7 = i2 << 6;
        State<IntSize> stateAnimateValueAsState = animateValueAsState(IntSize.m6800boximpl(j2), VectorConvertersKt.getVectorConverter(IntSize.Companion), springSpec, null, str2, function12, composer, ((-1) - (((-1) - i6) & ((-1) - (57344 & i7)))) | ((-1) - (((-1) - i7) | ((-1) - 458752))), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateAnimateValueAsState;
    }

    public static final <T, V extends AnimationVector> State<T> animateValueAsState(final T t2, TwoWayConverter<T, V> twoWayConverter, AnimationSpec<T> animationSpec, T t3, String str, Function1<? super T, Unit> function1, Composer composer, int i2, int i3) {
        T t4 = t3;
        SpringSpec springSpecSpring = animationSpec;
        Function1<? super T, Unit> function12 = function1;
        String str2 = str;
        ComposerKt.sourceInformationMarkerStart(composer, -1994373980, "C(animateValueAsState)P(3,4!1,5,2)393@18031L21,399@18213L44,400@18279L79,401@18379L38,402@18456L339,413@18814L42,414@18872L44,414@18861L55,417@18945L697,417@18921L721:AnimateAsState.kt#pdpnli");
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer, 728506592, "CC(remember):AnimateAsState.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            springSpecSpring = (SpringSpec) objRememberedValue;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            t4 = null;
        }
        if ((i3 + 16) - (i3 | 16) != 0) {
            str2 = "ValueAnimation";
        }
        if ((i3 + 32) - (i3 | 32) != 0) {
            function12 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1994373980, i2, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:397)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 728512439, "CC(remember):AnimateAsState.kt#9igjgp");
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        MutableState mutableState = (MutableState) objRememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 728514586, "CC(remember):AnimateAsState.kt#9igjgp");
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = new Animatable(t2, twoWayConverter, t4, str2);
            composer.updateRememberedValue(objRememberedValue3);
        }
        Animatable animatable = (Animatable) objRememberedValue3;
        ComposerKt.sourceInformationMarkerEnd(composer);
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function12, composer, (-1) - (((-1) - (i2 >> 15)) | ((-1) - 14)));
        if (t4 != null && (springSpecSpring instanceof SpringSpec)) {
            SpringSpec springSpec = (SpringSpec) springSpecSpring;
            if (!Intrinsics.areEqual(springSpec.getVisibilityThreshold(), t4)) {
                springSpecSpring = AnimationSpecKt.spring(springSpec.getDampingRatio(), springSpec.getStiffness(), t4);
            }
        }
        State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(springSpecSpring, composer, 0);
        ComposerKt.sourceInformationMarkerStart(composer, 728531669, "CC(remember):AnimateAsState.kt#9igjgp");
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == Composer.Companion.getEmpty()) {
            objRememberedValue4 = ChannelKt.Channel$default(-1, null, null, 6, null);
            composer.updateRememberedValue(objRememberedValue4);
        }
        final Channel channel = (Channel) objRememberedValue4;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 728533527, "CC(remember):AnimateAsState.kt#9igjgp");
        boolean zChangedInstance = (((((i2 + 14) - (14 | i2)) ^ 6) > 4 && composer.changedInstance(t2)) || (i2 & 6) == 4) | composer.changedInstance(channel);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue5 == Composer.Companion.getEmpty()) {
            objRememberedValue5 = (Function0) new Function0<Unit>() { // from class: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    channel.mo10484trySendJP2dKIU(t2);
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        EffectsKt.SideEffect((Function0) objRememberedValue5, composer, 0);
        ComposerKt.sourceInformationMarkerStart(composer, 728536516, "CC(remember):AnimateAsState.kt#9igjgp");
        int i4 = (-1) - (((-1) - (composer.changedInstance(channel) ? 1 : 0)) & ((-1) - (composer.changedInstance(animatable) ? 1 : 0))) != 1 ? 0 : 1;
        boolean zChanged = composer.changed(stateRememberUpdatedState2);
        boolean z2 = (-1) - (((-1) - ((i4 + (zChanged ? 1 : 0)) - (i4 & (zChanged ? 1 : 0)) != 1 ? 0 : 1)) & ((-1) - (composer.changed(stateRememberUpdatedState) ? 1 : 0))) == 1;
        Object objRememberedValue6 = composer.rememberedValue();
        if (z2 || objRememberedValue6 == Composer.Companion.getEmpty()) {
            objRememberedValue6 = (Function2) new AnimateAsStateKt$animateValueAsState$3$1(channel, animatable, stateRememberUpdatedState2, stateRememberUpdatedState, null);
            composer.updateRememberedValue(objRememberedValue6);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        EffectsKt.LaunchedEffect(channel, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composer, 0);
        State<T> stateAsState = (State) mutableState.getValue();
        if (stateAsState == null) {
            stateAsState = animatable.asState();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateAsState;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "$T\u0005Br\t\u001a!9Z\u001b\u000fQ)1\u000e=<q:Dv\u001bi6No\u0001S4%&vQ{\u0002Y]j>R]C;$WY~6]ZzfB8\u0017\u0010\u0015")
    @InterfaceC1492Gx
    public static final /* synthetic */ State animateFloatAsState(float f2, AnimationSpec animationSpec, float f3, Function1 function1, Composer composer, int i2, int i3) {
        SpringSpec<Float> springSpec = animationSpec;
        Function1 function12 = function1;
        float f4 = f3;
        ComposerKt.sourceInformationMarkerStart(composer, 1091643291, "C(animateFloatAsState)P(2!1,3)446@20047L143:AnimateAsState.kt#pdpnli");
        if ((i3 & 2) != 0) {
            springSpec = defaultAnimation;
        }
        if ((i3 & 4) != 0) {
            f4 = 0.01f;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            function12 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1091643291, i2, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:446)");
        }
        int i4 = i2 << 3;
        State<Float> stateAnimateFloatAsState = animateFloatAsState(f2, springSpec, f4, null, function12, composer, (-1) - (((-1) - (i2 & PhotoshopDirectory.TAG_QUICK_MASK_INFORMATION)) & ((-1) - ((i4 + 57344) - (i4 | 57344)))), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateAnimateFloatAsState;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "$T\u0005Br\t\u001a!9Z\u001b\u000fQ)1\u000e=<q:Dv\u001bi6No\u0001S4%&vQ{\u0002Y]j>R]C;$WY~6]ZzfB8\u0017\u0010\u0015")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: animateDpAsState-Kz89ssw */
    public static final /* synthetic */ State m466animateDpAsStateKz89ssw(float f2, AnimationSpec animationSpec, Function1 function1, Composer composer, int i2, int i3) {
        Function1 function12 = function1;
        SpringSpec<Dp> springSpec = animationSpec;
        ComposerKt.sourceInformationMarkerStart(composer, 704104481, "C(animateDpAsState)P(2:c#ui.unit.Dp)463@20491L142:AnimateAsState.kt#pdpnli");
        if ((i3 + 2) - (2 | i3) != 0) {
            springSpec = dpDefaultSpring;
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            function12 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(704104481, i2, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:462)");
        }
        State stateAnimateValueAsState = animateValueAsState(Dp.m6636boximpl(f2), VectorConvertersKt.getVectorConverter(Dp.Companion), springSpec, null, null, function12, composer, (-1) - (((-1) - (((i2 + 14) - (14 | i2)) | ((i2 << 3) & 896))) & ((-1) - ((-1) - (((-1) - (i2 << 9)) | ((-1) - 458752))))), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateAnimateValueAsState;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "$T\u0005Br\t\u001a!9Z\u001b\u000fQ)1\u000e=<q:Dv\u001bi6No\u0001S4%&vQ{\u0002Y]j>R]C;$WY~6]ZzfB8\u0017\u0010\u0015")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: animateSizeAsState-LjSzlW0 */
    public static final /* synthetic */ State m473animateSizeAsStateLjSzlW0(long j2, AnimationSpec animationSpec, Function1 function1, Composer composer, int i2, int i3) {
        Function1 function12 = function1;
        SpringSpec<Size> springSpec = animationSpec;
        ComposerKt.sourceInformationMarkerStart(composer, 875212471, "C(animateSizeAsState)P(2:c#ui.geometry.Size)481@20948L144:AnimateAsState.kt#pdpnli");
        if ((i3 + 2) - (i3 | 2) != 0) {
            springSpec = sizeDefaultSpring;
        }
        if ((i3 & 4) != 0) {
            function12 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(875212471, i2, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:480)");
        }
        int i4 = (-1) - (((-1) - ((-1) - (((-1) - i2) | ((-1) - 14)))) & ((-1) - ((-1) - (((-1) - (i2 << 3)) | ((-1) - 896)))));
        int i5 = i2 << 9;
        State stateAnimateValueAsState = animateValueAsState(Size.m3994boximpl(j2), VectorConvertersKt.getVectorConverter(Size.Companion), springSpec, null, null, function12, composer, i4 | ((i5 + 458752) - (i5 | 458752)), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateAnimateValueAsState;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "$T\u0005Br\t\u001a!9Z\u001b\u000fQ)1\u000e=<q:Dv\u001bi6No\u0001S4%&vQ{\u0002Y]j>R]C;$WY~6]ZzfB8\u0017\u0010\u0015")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: animateOffsetAsState-N6fFfp4 */
    public static final /* synthetic */ State m472animateOffsetAsStateN6fFfp4(long j2, AnimationSpec animationSpec, Function1 function1, Composer composer, int i2, int i3) {
        Function1 function12 = function1;
        SpringSpec<Offset> springSpec = animationSpec;
        ComposerKt.sourceInformationMarkerStart(composer, -456513133, "C(animateOffsetAsState)P(2:c#ui.geometry.Offset)499@21419L122:AnimateAsState.kt#pdpnli");
        if ((i3 + 2) - (i3 | 2) != 0) {
            springSpec = offsetDefaultSpring;
        }
        if ((i3 & 4) != 0) {
            function12 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-456513133, i2, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:498)");
        }
        int i4 = (-1) - (((-1) - i2) | ((-1) - 14));
        int i5 = (-1) - (((-1) - (i2 << 3)) | ((-1) - 896));
        int i6 = (i4 + i5) - (i4 & i5);
        int i7 = (i2 << 9) & 458752;
        State stateAnimateValueAsState = animateValueAsState(Offset.m3926boximpl(j2), VectorConvertersKt.getVectorConverter(Offset.Companion), springSpec, null, null, function12, composer, (i6 + i7) - (i6 & i7), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateAnimateValueAsState;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "$T\u0005Br\t\u001a!9Z\u001b\u000fQ)1\u000e=<q:Dv\u001bi6No\u0001S4%&vQ{\u0002Y]j>R]C;$WY~6]ZzfB8\u0017\u0010\u0015")
    @InterfaceC1492Gx
    public static final /* synthetic */ State animateRectAsState(Rect rect, AnimationSpec animationSpec, Function1 function1, Composer composer, int i2, int i3) {
        Function1 function12 = function1;
        SpringSpec<Rect> springSpec = animationSpec;
        ComposerKt.sourceInformationMarkerStart(composer, -782613967, "C(animateRectAsState)P(2)514@21856L120:AnimateAsState.kt#pdpnli");
        if ((i3 & 2) != 0) {
            springSpec = rectDefaultSpring;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            function12 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-782613967, i2, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:513)");
        }
        int i4 = (-1) - (((-1) - i2) | ((-1) - 14));
        int i5 = (i2 << 3) & 896;
        int i6 = (i4 + i5) - (i4 & i5);
        int i7 = (i2 << 9) & 458752;
        State stateAnimateValueAsState = animateValueAsState(rect, VectorConvertersKt.getVectorConverter(Rect.Companion), springSpec, null, null, function12, composer, (i6 + i7) - (i6 & i7), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateAnimateValueAsState;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "$T\u0005Br\t\u001a!9Z\u001b\u000fQ)1\u000e=<q:Dv\u001bi6No\u0001S4%&vQ{\u0002Y]j>R]C;$WY~6]ZzfB8\u0017\u0010\u0015")
    @InterfaceC1492Gx
    public static final /* synthetic */ State animateIntAsState(int i2, AnimationSpec animationSpec, Function1 function1, Composer composer, int i3, int i4) {
        Function1 function12 = function1;
        SpringSpec<Integer> springSpec = animationSpec;
        ComposerKt.sourceInformationMarkerStart(composer, -842612981, "C(animateIntAsState)P(2)529@22285L119:AnimateAsState.kt#pdpnli");
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            springSpec = intDefaultSpring;
        }
        if ((i4 + 4) - (i4 | 4) != 0) {
            function12 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-842612981, i3, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:528)");
        }
        State stateAnimateValueAsState = animateValueAsState(Integer.valueOf(i2), VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), springSpec, null, null, function12, composer, ((i3 + 14) - (14 | i3)) | ((-1) - (((-1) - (i3 << 3)) | ((-1) - 896))) | ((i3 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateAnimateValueAsState;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "$T\u0005Br\t\u001a!9Z\u001b\u000fQ)1\u000e=<q:Dv\u001bi6No\u0001S4%&vQ{\u0002Y]j>R]C;$WY~6]ZzfB8\u0017\u0010\u0015")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: animateIntOffsetAsState-8f6pmRE */
    public static final /* synthetic */ State m467animateIntOffsetAsState8f6pmRE(long j2, AnimationSpec animationSpec, Function1 function1, Composer composer, int i2, int i3) {
        Function1 function12 = function1;
        SpringSpec<IntOffset> springSpec = animationSpec;
        ComposerKt.sourceInformationMarkerStart(composer, 1010307371, "C(animateIntOffsetAsState)P(2:c#ui.unit.IntOffset)544@22749L125:AnimateAsState.kt#pdpnli");
        if ((i3 & 2) != 0) {
            springSpec = intOffsetDefaultSpring;
        }
        if ((i3 & 4) != 0) {
            function12 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1010307371, i2, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:543)");
        }
        int i4 = i2 & 14;
        int i5 = (-1) - (((-1) - (i2 << 3)) | ((-1) - 896));
        State stateAnimateValueAsState = animateValueAsState(IntOffset.m6757boximpl(j2), VectorConvertersKt.getVectorConverter(IntOffset.Companion), springSpec, null, null, function12, composer, ((i4 + i5) - (i4 & i5)) | ((-1) - (((-1) - (i2 << 9)) | ((-1) - 458752))), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateAnimateValueAsState;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "$T\u0005Br\t\u001a!9Z\u001b\u000fQ)1\u000e=<q:Dv\u001bi6No\u0001S4%&vQ{\u0002Y]j>R]C;$WY~6]ZzfB8\u0017\u0010\u0015")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: animateIntSizeAsState-zTRF_AQ */
    public static final /* synthetic */ State m470animateIntSizeAsStatezTRF_AQ(long j2, AnimationSpec animationSpec, Function1 function1, Composer composer, int i2, int i3) {
        Function1 function12 = function1;
        SpringSpec<IntSize> springSpec = animationSpec;
        ComposerKt.sourceInformationMarkerStart(composer, -1749239765, "C(animateIntSizeAsState)P(2:c#ui.unit.IntSize)559@23207L123:AnimateAsState.kt#pdpnli");
        if ((i3 & 2) != 0) {
            springSpec = intSizeDefaultSpring;
        }
        if ((i3 & 4) != 0) {
            function12 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1749239765, i2, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:558)");
        }
        State stateAnimateValueAsState = animateValueAsState(IntSize.m6800boximpl(j2), VectorConvertersKt.getVectorConverter(IntSize.Companion), springSpec, null, null, function12, composer, (-1) - (((-1) - ((i2 & 14) | ((i2 << 3) & 896))) & ((-1) - ((i2 << 9) & 458752))), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateAnimateValueAsState;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "$T\u0005Br\t\u001a!9Z\u001b\u000fQ)1\u000e=<q:Dv\u001bi6No\u0001S4%&vQ{\u0002Y]j>R]C;$WY~6]ZzfB8\u0017\u0010\u0015")
    @InterfaceC1492Gx
    public static final /* synthetic */ State animateValueAsState(Object obj, TwoWayConverter twoWayConverter, AnimationSpec animationSpec, Object obj2, Function1 function1, Composer composer, int i2, int i3) {
        Object obj3 = obj2;
        SpringSpec springSpec = animationSpec;
        ComposerKt.sourceInformationMarkerStart(composer, -846382129, "C(animateValueAsState)P(2,3!1,4)572@23613L21,575@23730L240:AnimateAsState.kt#pdpnli");
        if ((i3 + 4) - (i3 | 4) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer, 728685216, "CC(remember):AnimateAsState.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            springSpec = (SpringSpec) objRememberedValue;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            obj3 = null;
        }
        Function1 function12 = (i3 + 16) - (i3 | 16) == 0 ? function1 : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-846382129, i2, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:575)");
        }
        int i4 = (-1) - (((-1) - i2) | ((-1) - 8));
        int i5 = i4 | 24576;
        int i6 = (i2 + 14) - (14 | i2);
        int i7 = ((-1) - (((-1) - (i4 << 9)) & ((-1) - ((-1) - (((-1) - (((i5 + i6) - (i5 & i6)) | ((-1) - (((-1) - i2) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))))) & ((-1) - ((i2 + 896) - (896 | i2)))))))) | ((i2 + 7168) - (7168 | i2));
        int i8 = i2 << 3;
        State stateAnimateValueAsState = animateValueAsState(obj, twoWayConverter, springSpec, obj3, "ValueAnimation", function12, composer, i7 | ((i8 + 458752) - (i8 | 458752)), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateAnimateValueAsState;
    }

    public static final <T> Function1<T, Unit> animateValueAsState$lambda$4(State<? extends Function1<? super T, Unit>> state) {
        return state.getValue();
    }

    public static final <T> AnimationSpec<T> animateValueAsState$lambda$6(State<? extends AnimationSpec<T>> state) {
        return state.getValue();
    }
}
