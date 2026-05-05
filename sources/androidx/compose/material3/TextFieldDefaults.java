package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.internal.TextFieldType;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.BV.LinearGradient.LinearGradientManager;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference0Impl;
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
/* JADX INFO: compiled from: TextFieldDefaults.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яx\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u000504\u0012\u000e\u0007nj?7Le^.ZS@\u000fs{:%c$\u007fCC٥\"}0\u0012WNmgvJp\u000bKƤ\u000e\u0016\u000fj4I[\u007fe\u0012\u001d>JģG3coE9vt>\u0005&2*8\u0010\u0005\t\u001a0N\u0018v\u0011CS\f\u00182HpPR\u0015M\u000b\"\u001a\u0006T \t\u001eb\u001dTɬH\u0003җj/Q\u0002*GT'ۢ4|[\r\u000f/5.\u000faLMp;C8=S1+\u0003_M(Wqk)\u0019+5Qas\u0006]\t\u0006\u001a\u00159w%]!O\r\u000bW`\u001aQCO\u0012h\u0001\u0014.w\t\u0016%<2!6-N.;E~\b<5%xY@^.vB.|(;҆$ĮĴ/;!\u0014_\u0010\u0004N\\f\u0014\u0005;@S\u0005|DsT<\u0005E\u001fb\u001di1\u007fdmL\\0q=\u001c+!f\u0010T\u001c0u\u001d_\u0002\u0017.%?O[g6gpɘLDu'MÂha\u001bjHnD\u001f\u001aE\\!\f\tw\u0015\u0014y\u0005lc<\u0013]\u001c\u0003),=˙$\\}rQ)\u001eqgh\u0018\u000f}a\u0018\\Gfe}\u001fo\u001c\u0010Q^an\u0002g\u001e\bjvBflh\u000bXtgk\f\t\u0001X58HxJ\u0010\tTP\u001c\u0013`a\b\u001bba֞\u001d\\\u001b~31HA\u000bDwgx\u0012\u000fTaF\u0019hR*֊\u0005Pb' z~I:9x/=Ca5GHk!\u0017ič'\u0007\u0005*0ZmLU\n\u0005#\u0006W\f D<OP]rт\u0013~/h2@KL\u0001$iZ\")\u000b|(1Qg\\\u001dŰnp2\u0017\u001b]UT%a\u000fk\u0003%\u0018d.\u001cwE)|ϭX\u000baty\u0006\tYJ\u000fP\n\u0015!.%/\u00128{cbϡ+\u001d\u001c.D5\u001bak\u0004\b.(u?,ze\u0012V{\u0016\u001e\u007f\u0002c8;F\u000bq~ldT}\tBV.\u0010\u0013R\u000bD\rajo\u001aވZ8SAu\u0003֨\u000b,\u001b5\u001ffH=\b}bK&/ϵG}\"$\fҜ\u0012[}\u007fm\u001ch\r\u0011P\u000f\u0018Q\u00141\u001dYLC&Ve+!04;H<G;pNT\tR{\\B\u000e\u000bQ\u001f\u0002\u0006>B0Le\u000f%}Zsi\u001e>Z~\\d\u0015\u001d`s(Q0\u0007~\u001d\u00016xcx5sLT=2J\u0001\u0002d9!pO\r6=+r\u001ci!.X\u000f[]]q\u00112>\nG7?\u0004q\"7FOMH\u001e\u001bG%)_%w\u000f\u0011[d\\9\u000f\u0012\u0015\u001a~(/~\tR&<8V;\u001fUr}9EL|?gI \u0001%\u001cA\u0007:D\u0014L!-\u0014\u000eE=w2D-\u0002Wa\u0015\u0016\bNgW\nz!j2&f8%K@\u001cq$>\u001a\tA\u0018P\n4J\u0003O\".6}\u007f\b9\u0002!<qk&hp-1l\u0014!ch'Q\u0014rincj\u001bf_\u001e*t3P+i?M\\Z\t`@\u0011a\u0002p\u0011.[E,%6\u0016EA\u0010}+\u0019vqOipC/\u001aq\u001276R,b7y$KZZ.\u0015I<e>\u0013P\rrHW\u001cE\u0003(\u0013<</\u001a|\r0v\u0011A{vx$d= 1\u001f\nTwf\r\u0004S3>!_\u001ao!=2\u0019Z@v?Jjhz\u007f8.!r./\\3LTK\u0007?YR5\u0015\t,KS&Z\bZX>\u00175ZF\u000fV\\HckW9A'\u0001\u0019\u0015fM \r\u001f5xBk%XH-\u0007\u0013?\b#\u0004:\"~#)5\u000f}\u000eofil{jϐ&ڄ֮iL\u0005AqKW\u0018:?MEL<\u0006F\u0006\n-\u001b<\u0006$%0K7H8Wt@\u0005u\b\n,*Dg\\#un)y\u0010,w\u0012\fd\ncǣ@ʯ\u008f\u001dFD%;hO{[e\u0012\u000brOu\u001a=\u000f\u0014 K\u0017+\u0012\u007fwF+Wke/\u000b_l\u0019y\u0004H*y6(Ip_0\u0006;\flc\u0019lӼP̙ݳ<\u0014\u0013\u000b\u0012sy\rnټ_5\u0018U\u000e'L<\\\u0007DYb9B?*d.P\u0005#\u0006D0x\u001d\b}XX-\u0013aI$GM\u0012du9\u001d?]k\u000bʰf߳ߒCXwث<G/S(Xղ4}\\3\u0018QQj+#v\u0003+\\I\u0007D *f~&E\u0013J@J~D6eH0^R/`I]\u000f\u00167=\u0004\u0017,ۿȧaۙׄh\u00141ŏV|N\u001e];Ӂ\u0001\u001b\u0010o[C\u0011$SG);s;3n\u0002\u000e\\WM\u0015mw\u00123gP!=~W/oM\u001d\\k?'QW~:\"m)̠\u0012ڡ\u008ek\u0016oڄ!m~\u0015pdʾGcY?)rp\u0015z\u0003\u0003F\ffW6C\f\u0011p\u0015M;\u000eB\\4v\tUG\u0003{Xg lzY[?CuG@wvĪbٔȓ\u0018qWƉWL\u0013 qNȆ\u00012\u001dT\u000b$HWYGYq\u0011\u0003s\u0003\u0005A]B\u0011Hd(\u0017\u0017hL\nV<v\u0014Ij](3Qr\u007f9fvHO;zlZ)fNp\u0019\u000f-caE\u0016}I֝\"ׇˋ>&gͳRkՖF\u001b(\u001ckywC}\u00147\růq݇{ϯӘ=e̴\bz\rM>\n{18Ih@4/`+{mXA\u001c\u0013\u0015\u0005Zp\u0600QރϷ\u001eqկ\u0003+&\u001aO]QI'\u001b\u0011\u001e\r\u001f@Vpz\u001dZُ$ӬÎ\u0005\u001eˬF\u0004=lOy\u00145]{]9.57\t\u0002wN\u000fݷ\u0011ˏׄI\"Ԟmj\u0019]<S\u0010\t_HgFR,06<\bC)8L\u000bϗ4٭\"Ïڬ5\u0017ɺj|\u0001%\u0017k\u001c1z\u0004\u001c2\u0006@yukl\u0005XKeu~s/Ńpۘ¡HlȽ/O\u0016I$@gNs\u0007iB%.@\u0019\b\u0004_#*&2ֶ\u0019ܶ\flDm@\u0010U\u0003,lQC(p7\u0007z\u000eha>PLRjؒ@َ--P'exu\u007fS\u000bv6Eg\u0016s\u0019^)(\u000fEtWݭL\\~\u0010!\u001d\u0013a50$U]xnh=[2\u0006\u001a\u0011x٪J̉,3\"y\u001cU+ \u00819\u0016{Sdک\u0004\r\b]#\u0014FӴSȷp"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e%Hh^$7t\u0015\rMD7{;-#>", "", "u(E", "\u0014nRBf,=0#\fy^9k\f3c\u00061{N\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u0013b*Na\u0019}Wh9{\t<T\u0003,yF\n\u0017%U7l\u0010V*\u0005Ze^3v\u001f8\\?Jo>'#", "5dc\u0013b*Na\u0019}Wh9{\t<T\u0003,yF\n\u0017%U7l\u0010V*\u0005Ze", "u(5", "\u0014", "\u0014nRBf,=7\"}~\\(\f\u0013<T\u0003,yF\n\u0017%U", "5dc\u0013b*Na\u0019}^g+\u0001\u0007+t\n5jC\u0005\u0015\u001dPo\u001cJ>\u0004\t9\u0003o8U", "\u001bh]\u0015X0@V(", "5dc\u001a\\5!S\u001d\u0001}ms[\\\u000fjO)c", "\u001bh]$\\+MV", "5dc\u001a\\50W\u0018\u000e}&\u000bPh45\u0001\u0010", "#mU<V<LS\u0018[\u0005k+|\u0016\u001eh\u0004&\u0002I\u0001%%", "5dc\"a-HQ)\rz]\t\u0007\u0016.e\r\u0017~D~\u001d G}\u001c\u0004Ux\u0015^M!\u001f,\u00127VMJgC\"\u001fqo", "5dc\"a-HQ)\rz]\t\u0007\u0016.e\r\u0017~D~\u001d G}\u001c\u0004Ux\u0015^M!\u001f", "#mU<V<LS\u0018b\u0004]0z\u0005>o\r\u0017~D~\u001d G}\u001c", "5dc\"a-HQ)\rz]\u0010\u0006\b3c{7\u0006Mo\u001a\u001bEu\u0017<\u00053|8Q\u007f<=\u0017\u0016", "4h[9X+,V\u0015\nz", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "5dc\u0013\\3ES\u0018l}Z7|G+n\t2\u000b<\u0010\u001b!P}", "5dc\u0013\\3ES\u0018l}Z7|", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016^0&T\u007f9\u001f\u0015^\f\\tz\bUL$D", "=tc9\\5>R\u0007\u0002vi,", "5dc\u001ch;EW\"~yL/x\u0014/${1\u0005J\u0010\u0013&Ky\u0017J", "5dc\u001ch;EW\"~yL/x\u0014/", "AgP=X", "5dc [(IS", "2dU.h3MB\u0019\u0012\n?0|\u0010.C\n/\u0006M\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e%Hh^$7t\u0015\fWJExBs", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T/<c\u000b\u000e5p\u00166M\u0019", "5dc\u0011X-:c \u000ei^?\fi3e\u0007'YJ\b!$U", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0003?`\b-%k\u0019.UC\u0011R0'\u0014uk=\u0006vuL\u0001/RV\\,&_\u0003F#\u0016b\u000e\u0018\t\u0017\rdK2nQ\r\u0003K\u0013E\u000b:u\u000b\u0010\u0015!~hzJa\u001aUy^}=8hS][\u0001\u0015\u000b4b=slc\u001dc9\u0018.\u001b{&)>", "\u0011n]AT0GS&", "", "3mP/_,=", "", "7r4?e6K", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005O=-\u0015u]7\u0016g6Wd1WYL,2", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "1n[<e:", "4nRBf,=7\"}~\\(\f\u0013<L\u00041{/\u0004\u001b\u0015Mx\u000eJ\u0005", "CmU<V<LS\u0018b\u0004]0z\u0005>o\r\u000f\u007fI\u0001\u0006\u001aKm\u0014Ev3C", "\u0011n]AT0GS&FI>\r\u000f\t\u000bY", "uYI\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0002!'Pn\nKz/>#\u0002)Fm#*KR?u=gxqp9\u0014_*]z1P:X<iPr\u0013z\u000ec\r[5\u0011\u0004l\u000b\"xLB)\u0016,\u0013\u0012?2h\u0016\u0015\u00126npO,vC\u0003\u0014\u0003K-gY#]\u0004OLOp*.\u0014[,\\G> \u001b?b\nhc=j\u007fS\u0018q0\u0004nqT'P\u001f GlhPInh\u0006r1'V\u0006\u0006\u0012{hxtv:\u007f?-:b\u0013\u0015U\u001b:ixj\r=(#/5I\u001dCJv?jH\u0016s)o\bWoE:(imc\u0012l\u0011e\"eCalV\u001b6I/", "\u0011n]AT0GS&[\u0005q", "uYI\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0002!'Pn\nKz/>#\u0002)Fm#*KR?u=gxqp9\u0014_*]z1P:X<iPr\u0013z\u000ec\r[5\u0011\u0004l\u000b\"xLB)\u0016,\u0013\n7w\u0001\u0019\u001a\n<8:1V#VZ\u0019uH(FP`i\u0007U\u0017,^3c\u0019i![M\u0004\"\u001ey$%vPw\u001a\u007f\u001d\u0013\u007fN\u0005jkE'D&':x[\u001c,k^;\u00021#J\u000fA\u0010<`\u007f5\u0003-MA:?s\tSga\u001ch\u0001 6jA4{\u001a V0", "\u0012dR<e(MW#\bWh?", "D`[BX", "", "7m]2e\u001b>f(_~^3{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "Ah]4_,%W\"~", "DhbBT3-`\u0015\b\t_6\n\u0011+t\u00042\u0005", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#n$E}\u00125<P7tB\u001f\u001fui5\u0016g6WL", ":`Q2_", ">kP0X/HZ\u0018~\b", ":dP1\\5@7\u0017\t\u0004", "BqP6_0GU||\u0005g", ">qT3\\?", "AtU3\\?", "At_=b9MW\"\u0001i^?\f", "1n]AX5M>\u0015}yb5~", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", "1n]AT0GS&", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00100\u0002Ck\u000eCUM9fVqP]\u0010d\u0016Y5\u001b\u0005#Q(8S72\u0017uM\u000bFx\u0010U\u0007\u0012CzlIE\u001dC\u0003#vK6pBhc\u0004P\u0017,^3c\u0019i![M\u0004\"\u001ey$%vPw\u000b\u0006c\u001aqN\tkqPb~A3>zWDTs_E>\u000b(Z{\u0005\u000e0gx5}\u001b\u000eD74dZ@N\u001eHm\u007f\u00195&F8.\u007f=#HIryvG\u001c2\u007fq\u0011\fq9;\"2;JN\u0019\u0016d\u001bd~fp\t\u0001S\u0016GG~\u00191O\r\f<\n\u001e\u0007\u0016(wn\u0016\u0019\u0002Z\u000b)wH+)\u0016\u0014\u000b0\u0019,7\u0014L]\u0019q8)\u0018]\u001c\u0007w<\u0016\u0005&\u0019{vR\u001ftO{%\\\u0001,\u007fy!R\u001fBOF\u007f`\rP \u001f2\u0010\u000f\t&@?)\u007f@\",)F#=shx\fw\\ (kB%-v\u0012\u0012[>}b\u00020aStn\u0007$dBAK8RQ4#LlI\u0014@d[\u001eu.%8^\u0004\u001aLd@\u000b1t\u0018\u000f\u000b/\u0002\\!=.?H/p\u0019>j\u0016\u0015\u00189}?$~gR V_D/D#|h9\t\u000f5\u0010f\u001fT\f3Q:\u0018Xzh5\u0015y_\t6VECQ=v,!\u0017x\u0002\u0011O\u0014)I\u001an_w\u0002tY9oQk\u0014pe?#R7\u001c\u0006i\t\u0001hTVo\u0003[cg\u000b3 \tGDY\u000bE3g\u007f!0\nugQox\u0001/<U)]\u000e$4lw(\u0010p0ypf\u000e :\u0003\u001cvE;V'B>#\u0004\u0005\\<\u007f\u000b\nUR \u0002?<\".Q;\u0015N}\u00056Km\u0013O=xH\\CTa4)g\\F\u0003B\\;Zt h\u0014F4^c~i\u0002]Y0m4\u000f\u001bS\r\u007f\u0003RD#\fQIh=\u0016nE\t", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016V(kR\u007fA\u0010\u0019(W=+ \u0014:E$uC\u0015)\u000f6V\u0010\u0011", "4nRBf,=B\u0019\u0012\n<6\u0004\u0013<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "CmU<V<LS\u0018mzq;Z\u00136o\r", "2hb.U3>R\b~\u000em\n\u0007\u00109r", "3qa<e\u001b>f(\\\u0005e6\n", "4nRBf,=1#\b\nZ0\u0006\t<C\n/\u0006M", "CmU<V<LS\u0018\\\u0005g;x\r8e\r\u0006\u0006G\u000b$", "2hb.U3>Rv\t\u0004m(\u0001\u0012/r]2\u0003J\u000e", "3qa<e\nH\\(z~g,\nf9l\n5", "1ta@b9\u001c] \t\b", "3qa<e\nN`'\t\b<6\u0004\u0013<", "Ad[2V;B]\"\\\u0005e6\n\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0004htHtc3Nt6KVW\nfY|J\"g", "4nRBf,=7\"}~\\(\f\u0013<C\n/\u0006M", "CmU<V<LS\u0018b\u0004]0z\u0005>o\r\u0006\u0006G\u000b$", "2hb.U3>R|\byb*x\u00189r]2\u0003J\u000e", "3qa<e\u0010GR\u001d|vm6\nf9l\n5", "4nRBf,=:\u0019zyb5~l-o\t\u0006\u0006G\u000b$", "CmU<V<LS\u0018ezZ+\u0001\u00121I}2\u0005\u001e\u000b\u001e!T", "2hb.U3>R\u007f~v]0\u0006\u000b\u0013c\n1YJ\b!$", "3qa<e\u0013>O\u0018\u0003\u0004`\u0010z\u00138C\n/\u0006M", "4nRBf,=B&z~e0\u0006\u000b\u0013c\n1YJ\b!$", "CmU<V<LS\u0018m\bZ0\u0004\r8gc&\u0006I^!\u001eQ|", "2hb.U3>R\b\fvb3\u0001\u00121I}2\u0005\u001e\u000b\u001e!T", "3qa<e\u001bKO\u001d\u0006~g.`\u00079n]2\u0003J\u000e", "4nRBf,=:\u0015{ze\n\u0007\u00109r", "CmU<V<LS\u0018ev[,\u0004f9l\n5", "2hb.U3>R\u007fzw^3Z\u00136o\r", "3qa<e\u0013:P\u0019\u0006Xh3\u0007\u0016", "4nRBf,=> zx^/\u0007\u0010.e\r\u0006\u0006G\u000b$", "CmU<V<LS\u0018i\u0002Z*|\f9l~(\t\u001e\u000b\u001e!T", "2hb.U3>R\u0004\u0006v\\,\u007f\u00136d\u007f5YJ\b!$", "3qa<e\u0017EO\u0017~}h3{\t<C\n/\u0006M", "4nRBf,=A)\n\u0006h9\f\r8gn(\u000fO^!\u001eQ|", "CmU<V<LS\u0018l\u000bi7\u0007\u0016>i\t*j@\u0014&tQv\u0018I", "2hb.U3>R\u0007\u000f\u0006i6\n\u00183n\u0002\u0017{S\u0010t!Ny\u001b", "3qa<e\u001aN^$\t\bm0\u0006\u000b\u001ee\u00137YJ\b!$", "4nRBf,=>&~{b?Z\u00136o\r", "CmU<V<LS\u0018i\b^-\u0001\u001c\ro\u00072\t", "2hb.U3>R\u0004\fz_0\u0010f9l\n5", "3qa<e\u0017KS\u001a\u0003\u000e<6\u0004\u0013<", "4nRBf,=A)\u007f{b?Z\u00136o\r", "CmU<V<LS\u0018l\u000b_-\u0001\u001c\ro\u00072\t", "2hb.U3>R\u0007\u000f{_0\u0010f9l\n5", "3qa<e\u001aNT\u001a\u0003\u000e<6\u0004\u0013<", "1n[<e:\u0006\u001e\u001c\u0003~l&G", "uI9\u0017=\u0011#8}c_E(\u0006\b<o\u0004'\u000f\n~!\u001fRy\u001c<@&?i\u0007\u001f3|\u001a8V\rJkG-^va@\u0007a;R\u00010\u0011;N?k@rD\u0014\u0010i\u0012X4j\u000f`K1|\u001a\u001c\u0004l\u0011.f Mepzr\u001aOU';t,^yZ&\u000eM+>D^,&*I&m\u000bl'`9Mm\u0012{!&r^.S\tc\u001a\u0002V\u0002g1%#\u0003C.Lmh\u001c)S9 X\u000b\u0003\u000fbs\u001b1e~/s@M24>o\u000fYgaFZ\b\u00159`=.s\u007f+\u0013RZDylE\rF)h\u0012\u001bp\u000b", "1n]AX5M>\u0015}yb5~z3t\u0003\u000fw=\u0001\u001e", "AsP?g", "3mS", "Bn_", "0ncAb4", "1n]AX5M>\u0015}yb5~z3t\u0003\u000fw=\u0001\u001e^CC}AZ4\u0004", "uE5\u00139o%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`Hy\u001eEu!D]\b)\u0001t\u0012BWSJ5\u001f\u001a\u0014geB\tT(U\u0007'U\"", "1n]AX5M>\u0015}yb5~z3t\u00032\fOg\u0013\u0014Gv", "1n]AX5M>\u0015}yb5~z3t\u00032\fOg\u0013\u0014GvU8J\u0015:=\rn", "=tc9\\5>R\b~\u000em\r\u0001\t6dj$z?\u0005 \u0019", "=tc9\\5>R\b~\u000em\r\u0001\t6dj$z?\u0005 \u0019\u000fka,{\tD(", "At_=b9MW\"\u0001i^?\fs+d~,\u0005B", "At_=b9MW\"\u0001i^?\fs+d~,\u0005BH\u0013j7tqKEc=U\r Dq\u00125\u001b=Hk;\u001e\u0011va", "BdgA90>Z\u0018p~m/c\u0005,e\u0007\u0013w?\u007f\u001b I", "BdgA90>Z\u0018p~m/c\u0005,e\u0007\u0013w?\u007f\u001b I7\n\u0010f*\u0019hL", "BdgA90>Z\u0018p~m/\u0007\u0019>L{%{Gk\u0013\u0016Fs\u0017>", "BdgA90>Z\u0018p~m/\u0007\u0019>L{%{Gk\u0013\u0016Fs\u0017>>!\tI\u0003\u0004F<", "7mS6V(M]&e~g,", "7mS6V(M]&e~g,D\u000b@0|7Y$", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000bNr\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cuO\u00017PKJ;`\\{\u0007\u0018\u001bi\u000e['\u000b\u0014]K-8(@.\b9E\u007fJl\u000b\u0015\u0004\u0018EwnB,vC\u0003\u0014\u0003K-gY#]\u0004OLOp*.\u0014[,\\G> \u001b?b\nhc=j\u007fS\u0018q0\u0004nqT'P\u0019\u0005\u0002TWOD|_@s:hI\u0006\u007f\u001d<ftt\u00051M\u001c45h\u0006Og%\u0014", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextFieldDefaults {
    public static final int $stable = 0;
    private static final float FocusedBorderThickness;
    private static final float FocusedIndicatorThickness;
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = Dp.m6638constructorimpl(56);
    private static final float MinWidth = Dp.m6638constructorimpl(280);
    private static final float UnfocusedBorderThickness;
    private static final float UnfocusedIndicatorThickness;

    /* JADX INFO: renamed from: androidx.compose.material3.TextFieldDefaults$ContainerBox$1 */
    /* JADX INFO: compiled from: TextFieldDefaults.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ TextFieldColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ InteractionSource $interactionSource;
        final /* synthetic */ boolean $isError;
        final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z2, boolean z3, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, int i2, int i3) {
            super(2);
            z = z2;
            z = z3;
            interactionSource = interactionSource;
            textFieldColors = textFieldColors;
            shape = shape;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            TextFieldDefaults.this.ContainerBox(z, z, interactionSource, textFieldColors, shape, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.TextFieldDefaults$DecorationBox$2 */
    /* JADX INFO: compiled from: TextFieldDefaults.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ TextFieldColors $colors;
        final /* synthetic */ Function2<Composer, Integer, Unit> $container;
        final /* synthetic */ PaddingValues $contentPadding;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ Function2<Composer, Integer, Unit> $innerTextField;
        final /* synthetic */ InteractionSource $interactionSource;
        final /* synthetic */ boolean $isError;
        final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
        final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
        final /* synthetic */ Shape $shape;
        final /* synthetic */ boolean $singleLine;
        final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
        final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
        final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
        final /* synthetic */ String $value;
        final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(String str, Function2<? super Composer, ? super Integer, Unit> function2, boolean z2, boolean z3, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z4, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, Function2<? super Composer, ? super Integer, Unit> function28, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function29, int i2, int i3, int i4) {
            super(2);
            str = str;
            function2 = function2;
            z = z2;
            z = z3;
            visualTransformation = visualTransformation;
            interactionSource = interactionSource;
            z = z4;
            function2 = function22;
            function2 = function23;
            function2 = function24;
            function2 = function25;
            function2 = function26;
            function2 = function27;
            function2 = function28;
            shape = shape;
            textFieldColors = textFieldColors;
            paddingValues = paddingValues;
            function2 = function29;
            i = i2;
            i = i3;
            i = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            TextFieldDefaults.this.DecorationBox(str, function2, z, z, visualTransformation, interactionSource, z, function2, function2, function2, function2, function2, function2, function2, shape, textFieldColors, paddingValues, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0015K\n6~y\u0019\u0017lVgzD\u001aDbBU\u000e3\tL\u0011Xw[z~aB7ni\\iB", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.shape", imports = {}))
    @InterfaceC1492Gx
    public static /* synthetic */ void getFilledShape$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0016V\b>\u00064\u001eelVgzD\u001aDbBU\u000e3\tL\u0011Xw[z~aB\nukawGQEv=O!4N!h@\u0002+[SIjQG\u0012KH\"HZv#\u0017\u0007\u0018xE!Oq\u0001u6m\u0005M\u001cC^F4)F_\u0004N!\u0002}~5\t'Hq5\u0011\u001f\u001a\u001d-Z\u001b#*L<x\u000e\u0017s\u0001+bbLD!\u000fNBr&t8W\u0001\u0018C0t{*Sgi\u0013 6\u007f\u0006", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.FocusedIndicatorThickness", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: getFocusedBorderThickness-D9Ej5fM$annotations */
    public static /* synthetic */ void m2684getFocusedBorderThicknessD9Ej5fM$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0015K\n6~y\u0019\u0017lVgz?*@ZeZ\u000e+xm$f\\OsvRX)liapV`*{AG.8:", replaceWith = @ReplaceWith(expression = "OutlinedTextFieldDefaults.shape", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    @InterfaceC1492Gx
    public static /* synthetic */ void getOutlinedShape$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0016V\b>\u00064\u001eelVgzD\u001aDbBU\u000e3\tL\u0011Xw[z~aB\u0019tn[gW`al\"T\"<=\u0013j[\f\u0016`Q>pL9%\u001fGSE)zs\u0002a!\u0004C%Y\u0003\u007fQ' \u0010.\u0019D\u0007E\u0012-7T\u0005Gg/<p.{1G%9\u0004\u001fv\u001aKV\u00172\u0013F@h\u0006%+TNV+\u000b!(T:EsduC\u001c\u0001\u0019\tne~WEgg\u001c.2\rA}h\u0002D", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.UnfocusedIndicatorThickness", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: getUnfocusedBorderThickness-D9Ej5fM$annotations */
    public static /* synthetic */ void m2685getUnfocusedBorderThicknessD9Ej5fM$annotations() {
    }

    private TextFieldDefaults() {
    }

    public final Shape getShape(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1941327459, "C60@2756L5:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1941327459, i2, -1, "androidx.compose.material3.TextFieldDefaults.<get-shape> (TextFieldDefaults.kt:60)");
        }
        Shape value = ShapesKt.getValue(FilledTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM */
    public final float m2697getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM */
    public final float m2698getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    /* JADX INFO: renamed from: getUnfocusedIndicatorThickness-D9Ej5fM */
    public final float m2700getUnfocusedIndicatorThicknessD9Ej5fM() {
        return UnfocusedIndicatorThickness;
    }

    /* JADX INFO: renamed from: getFocusedIndicatorThickness-D9Ej5fM */
    public final float m2696getFocusedIndicatorThicknessD9Ej5fM() {
        return FocusedIndicatorThickness;
    }

    /* JADX INFO: renamed from: Container-4EFweAY */
    public final void m2691Container4EFweAY(final boolean z2, final boolean z3, final InteractionSource interactionSource, Modifier modifier, TextFieldColors textFieldColors, Shape shape, float f2, float f3, Composer composer, final int i2, final int i3) {
        int i4;
        float f4 = f3;
        float f5 = f2;
        Shape shape2 = shape;
        TextFieldColors textFieldColorsColors = textFieldColors;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-818661242);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Container)P(1,4,3,5!1,6,2:c#ui.unit.Dp,7:c#ui.unit.Dp)105@4681L8,106@4732L5,110@4933L25,112@5006L198,116@5213L496:TextFieldDefaults.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            int i5 = composerStartRestartGroup.changed(z2) ? 4 : 2;
            i4 = (i5 + i2) - (i5 & i2);
        } else {
            i4 = i2;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((i2 & 48) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(z3) ? 32 : 16)));
        }
        if ((i3 & 4) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= composerStartRestartGroup.changed(interactionSource) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 = (i4 + 3072) - (i4 & 3072);
        } else if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            int i7 = composerStartRestartGroup.changed(companion) ? 2048 : 1024;
            i4 = (i4 + i7) - (i4 & i7);
        }
        if ((i2 + 24576) - (i2 | 24576) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 & 16) == 0 && composerStartRestartGroup.changed(textFieldColorsColors)) ? 16384 : 8192)));
        }
        if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            i4 |= ((-1) - (((-1) - i3) | ((-1) - 32)) == 0 && composerStartRestartGroup.changed(shape2)) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            int i8 = ((i3 & 64) == 0 && composerStartRestartGroup.changed(f5)) ? 1048576 : 524288;
            i4 = (i4 + i8) - (i4 & i8);
        }
        if ((12582912 & i2) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 & 128) == 0 && composerStartRestartGroup.changed(f4)) ? 8388608 : 4194304)));
        }
        if ((-1) - (((-1) - i3) | ((-1) - 256)) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 100663296));
        } else if ((i2 + 100663296) - (i2 | 100663296) == 0) {
            i4 |= composerStartRestartGroup.changed(this) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((-1) - (((-1) - 38347923) | ((-1) - i4)) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                    textFieldColorsColors = colors(composerStartRestartGroup, (i4 >> 24) & 14);
                    i4 = (i4 - 57345) - (i4 | (-57345));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
                    shape2 = INSTANCE.getShape(composerStartRestartGroup, 6);
                    i4 &= -458753;
                }
                if ((i3 & 64) != 0) {
                    f5 = FocusedIndicatorThickness;
                    i4 &= -3670017;
                }
                if ((i3 & 128) != 0) {
                    f4 = UnfocusedIndicatorThickness;
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-29360129)));
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 + 16) - (i3 | 16) != 0) {
                    i4 &= -57345;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-458753)));
                }
                if ((i3 + 64) - (i3 | 64) != 0) {
                    i4 = (i4 - 3670017) - (i4 | (-3670017));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 128)) != 0) {
                    i4 = (i4 - 29360129) - (i4 | (-29360129));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-818661242, i4, -1, "androidx.compose.material3.TextFieldDefaults.Container (TextFieldDefaults.kt:109)");
            }
            final State<Color> stateM451animateColorAsStateeuL9pac = SingleValueAnimationKt.m451animateColorAsStateeuL9pac(textFieldColorsColors.m2628containerColorXeAY9LY$material3_release(z2, z3, FocusInteractionKt.collectIsFocusedAsState(interactionSource, composerStartRestartGroup, (i4 >> 6) & 14).getValue().booleanValue()), AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
            BoxKt.Box(m2701indicatorLinegv0btCI(TextFieldImplKt.textFieldBackground(companion, new TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0(new PropertyReference0Impl(stateM451animateColorAsStateeuL9pac) { // from class: androidx.compose.material3.TextFieldDefaults$Container$1
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((State) this.receiver).getValue();
                }
            }), shape2), z2, z3, interactionSource, textFieldColorsColors, f5, f4), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final float f6 = f5;
            final float f7 = f4;
            final TextFieldColors textFieldColors2 = textFieldColorsColors;
            final Shape shape3 = shape2;
            final Modifier modifier2 = companion;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults$Container$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i9) {
                    TextFieldDefaults textFieldDefaults = this.$tmp0_rcvr;
                    boolean z4 = z2;
                    boolean z5 = z3;
                    InteractionSource interactionSource2 = interactionSource;
                    Modifier modifier3 = modifier2;
                    TextFieldColors textFieldColors3 = textFieldColors2;
                    Shape shape4 = shape3;
                    float f8 = f6;
                    float f9 = f7;
                    int i10 = i2;
                    textFieldDefaults.m2691Container4EFweAY(z4, z5, interactionSource2, modifier3, textFieldColors3, shape4, f8, f9, composer2, RecomposeScopeImplKt.updateChangedFlags((i10 + 1) - (i10 & 1)), i3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: indicatorLine-gv0btCI$default */
    public static /* synthetic */ Modifier m2686indicatorLinegv0btCI$default(TextFieldDefaults textFieldDefaults, Modifier modifier, boolean z2, boolean z3, InteractionSource interactionSource, TextFieldColors textFieldColors, float f2, float f3, int i2, Object obj) {
        if ((16 & i2) != 0) {
            f2 = FocusedIndicatorThickness;
        }
        if ((i2 + 32) - (i2 | 32) != 0) {
            f3 = UnfocusedIndicatorThickness;
        }
        return textFieldDefaults.m2701indicatorLinegv0btCI(modifier, z2, z3, interactionSource, textFieldColors, f2, f3);
    }

    /* JADX INFO: renamed from: androidx.compose.material3.TextFieldDefaults$DecorationBox$1 */
    /* JADX INFO: compiled from: TextFieldDefaults.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06931 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ TextFieldColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ InteractionSource $interactionSource;
        final /* synthetic */ boolean $isError;
        final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06931(boolean z2, boolean z3, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape) {
            super(2);
            z = z2;
            z = z3;
            interactionSource = interactionSource;
            textFieldColors = textFieldColors;
            shape = shape;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            ComposerKt.sourceInformation(composer, "C265@13339L404:TextFieldDefaults.kt#uh7d8r");
            if ((i2 & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-435523791, i2, -1, "androidx.compose.material3.TextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:265)");
                }
                TextFieldDefaults.INSTANCE.m2691Container4EFweAY(z, z, interactionSource, Modifier.Companion, textFieldColors, shape, TextFieldDefaults.INSTANCE.m2696getFocusedIndicatorThicknessD9Ej5fM(), TextFieldDefaults.INSTANCE.m2700getUnfocusedIndicatorThicknessD9Ej5fM(), composer, 114822144, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    public final void DecorationBox(String str, Function2<? super Composer, ? super Integer, Unit> function2, boolean z2, boolean z3, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z4, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, Function2<? super Composer, ? super Integer, Unit> function28, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function29, Composer composer, int i2, int i3, int i4) {
        int i5;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function210;
        PaddingValues paddingValuesM2683contentPaddingWithoutLabela9UjIt4$default = paddingValues;
        TextFieldColors textFieldColorsColors = textFieldColors;
        Shape shape2 = shape;
        Function2<? super Composer, ? super Integer, Unit> function211 = function27;
        boolean z5 = z4;
        Function2<? super Composer, ? super Integer, Unit> function212 = function26;
        Function2<? super Composer, ? super Integer, Unit> function213 = function25;
        Function2<? super Composer, ? super Integer, Unit> function214 = function24;
        Function2<? super Composer, ? super Integer, Unit> function215 = function23;
        Function2<? super Composer, ? super Integer, Unit> function216 = function22;
        ComposableLambda composableLambdaRememberComposableLambda = function29;
        Composer composerStartRestartGroup = composer.startRestartGroup(289640444);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DecorationBox)P(16,4,3,12,17,5,6,7,9,8,15,10,13,14,11!1,2)256@13034L5,257@13075L8,264@13325L428,277@13770L707:TextFieldDefaults.kt#uh7d8r");
        String str2 = str;
        if ((i4 + 1) - (i4 | 1) != 0) {
            i5 = (i2 + 6) - (i2 & 6);
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i5 = (-1) - (((-1) - (composerStartRestartGroup.changed(str2) ? 4 : 2)) & ((-1) - i2));
        } else {
            i5 = i2;
        }
        Function2<? super Composer, ? super Integer, Unit> function217 = function2;
        if ((i4 + 2) - (i4 | 2) != 0) {
            i5 = (i5 + 48) - (i5 & 48);
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            int i7 = composerStartRestartGroup.changedInstance(function217) ? 32 : 16;
            i5 = (i5 + i7) - (i5 & i7);
        }
        boolean z6 = z2;
        if ((i4 & 4) != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i5 |= composerStartRestartGroup.changed(z6) ? 256 : 128;
        }
        boolean z7 = z3;
        if ((-1) - (((-1) - i4) | ((-1) - 8)) != 0) {
            i5 = (i5 + 3072) - (i5 & 3072);
        } else if ((i2 & 3072) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(z7) ? 2048 : 1024)));
        }
        int i8 = 8192;
        VisualTransformation visualTransformation2 = visualTransformation;
        if ((-1) - (((-1) - i4) | ((-1) - 16)) != 0) {
            i5 |= 24576;
        } else if ((i2 + 24576) - (i2 | 24576) == 0) {
            i5 |= composerStartRestartGroup.changed(visualTransformation2) ? 16384 : 8192;
        }
        InteractionSource interactionSource2 = interactionSource;
        if ((i4 & 32) != 0) {
            i5 = (i5 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((-1) - (((-1) - i2) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(interactionSource2) ? 131072 : 65536)));
        }
        int i9 = (i4 + 64) - (i4 | 64);
        if (i9 != 0) {
            i5 |= 1572864;
        } else if ((i2 + 1572864) - (i2 | 1572864) == 0) {
            i5 |= composerStartRestartGroup.changed(z5) ? 1048576 : 524288;
        }
        int i10 = (i4 + 128) - (i4 | 128);
        if (i10 != 0) {
            i5 = (i5 + 12582912) - (i5 & 12582912);
        } else if ((-1) - (((-1) - i2) | ((-1) - 12582912)) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function216) ? 8388608 : 4194304;
        }
        int i11 = (i4 + 256) - (i4 | 256);
        if (i11 != 0) {
            i5 = (i5 + 100663296) - (i5 & 100663296);
        } else if ((i2 + 100663296) - (i2 | 100663296) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function215) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        int i12 = (-1) - (((-1) - i4) | ((-1) - 512));
        if (i12 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 805306368));
        } else if ((i2 + 805306368) - (i2 | 805306368) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function214) ? 536870912 : 268435456)));
        }
        int i13 = (i4 + 1024) - (i4 | 1024);
        if (i13 != 0) {
            i6 = (i3 + 6) - (i3 & 6);
        } else if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
            i6 = i3 | (composerStartRestartGroup.changedInstance(function213) ? 4 : 2);
        } else {
            i6 = i3;
        }
        int i14 = (i4 + 2048) - (i4 | 2048);
        if (i14 != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changedInstance(function212) ? 32 : 16)));
        }
        int i15 = (i4 + 4096) - (i4 | 4096);
        if (i15 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((-1) - (((-1) - i3) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function211) ? 256 : 128;
        }
        int i16 = (-1) - (((-1) - i4) | ((-1) - 8192));
        if (i16 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 3072));
        } else if ((-1) - (((-1) - i3) | ((-1) - 3072)) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function28) ? 2048 : 1024;
        }
        if ((i3 + 24576) - (i3 | 24576) == 0) {
            if ((-1) - (((-1) - i4) | ((-1) - 16384)) == 0 && composerStartRestartGroup.changed(shape2)) {
                i8 = 16384;
            }
            i6 = (-1) - (((-1) - i6) & ((-1) - i8));
        }
        if ((-1) - (((-1) - i3) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) == 0) {
            int i17 = ((i4 + 32768) - (i4 | 32768) == 0 && composerStartRestartGroup.changed(textFieldColorsColors)) ? 131072 : 65536;
            i6 = (i6 + i17) - (i6 & i17);
        }
        if ((i3 + 1572864) - (i3 | 1572864) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (((i4 + 65536) - (i4 | 65536) == 0 && composerStartRestartGroup.changed(paddingValuesM2683contentPaddingWithoutLabela9UjIt4$default)) ? 1048576 : 524288)));
        }
        int i18 = (-1) - (((-1) - i4) | ((-1) - 131072));
        if (i18 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 12582912));
        } else if ((i3 + 12582912) - (i3 | 12582912) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(composableLambdaRememberComposableLambda) ? 8388608 : 4194304;
        }
        if ((i4 + 262144) - (i4 | 262144) != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 100663296));
        } else if ((-1) - (((-1) - i3) | ((-1) - 100663296)) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(this) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        if ((i5 + 306783379) - (306783379 | i5) == 306783378 && (38347923 + i6) - (38347923 | i6) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function210 = function28;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i9 != 0) {
                    z5 = false;
                }
                if (i10 != 0) {
                    function216 = null;
                }
                if (i11 != 0) {
                    function215 = null;
                }
                if (i12 != 0) {
                    function214 = null;
                }
                if (i13 != 0) {
                    function213 = null;
                }
                if (i14 != 0) {
                    function212 = null;
                }
                if (i15 != 0) {
                    function211 = null;
                }
                function210 = i16 == 0 ? function28 : null;
                if ((-1) - (((-1) - i4) | ((-1) - 16384)) != 0) {
                    shape2 = INSTANCE.getShape(composerStartRestartGroup, 6);
                    i6 &= -57345;
                }
                if ((-1) - (((-1) - i4) | ((-1) - 32768)) != 0) {
                    int i19 = i6 >> 24;
                    textFieldColorsColors = colors(composerStartRestartGroup, (i19 + 14) - (i19 | 14));
                    i6 = (i6 - 458753) - (i6 | (-458753));
                }
                if ((i4 + 65536) - (i4 | 65536) != 0) {
                    paddingValuesM2683contentPaddingWithoutLabela9UjIt4$default = function216 == null ? m2683contentPaddingWithoutLabela9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null) : m2682contentPaddingWithLabela9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    i6 = (-1) - (((-1) - i6) | ((-1) - (-3670017)));
                }
                if (i18 != 0) {
                    composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-435523791, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults.DecorationBox.1
                        final /* synthetic */ TextFieldColors $colors;
                        final /* synthetic */ boolean $enabled;
                        final /* synthetic */ InteractionSource $interactionSource;
                        final /* synthetic */ boolean $isError;
                        final /* synthetic */ Shape $shape;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C06931(boolean z62, boolean z52, InteractionSource interactionSource22, TextFieldColors textFieldColorsColors2, Shape shape22) {
                            super(2);
                            z = z62;
                            z = z52;
                            interactionSource = interactionSource22;
                            textFieldColors = textFieldColorsColors2;
                            shape = shape22;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i22) {
                            ComposerKt.sourceInformation(composer2, "C265@13339L404:TextFieldDefaults.kt#uh7d8r");
                            if ((i22 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-435523791, i22, -1, "androidx.compose.material3.TextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:265)");
                                }
                                TextFieldDefaults.INSTANCE.m2691Container4EFweAY(z, z, interactionSource, Modifier.Companion, textFieldColors, shape, TextFieldDefaults.INSTANCE.m2696getFocusedIndicatorThicknessD9Ej5fM(), TextFieldDefaults.INSTANCE.m2700getUnfocusedIndicatorThicknessD9Ej5fM(), composer2, 114822144, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, composerStartRestartGroup, 54);
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i4 + 16384) - (i4 | 16384) != 0) {
                    i6 &= -57345;
                }
                if ((32768 & i4) != 0) {
                    i6 = (i6 - 458753) - (i6 | (-458753));
                }
                if ((i4 & 65536) != 0) {
                    i6 &= -3670017;
                }
                function210 = function28;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(289640444, i5, i6, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:276)");
            }
            TextFieldType textFieldType = TextFieldType.Filled;
            int i20 = i5 << 3;
            int i21 = ((i20 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i20)) | 6;
            int i22 = (-1) - (((-1) - i20) | ((-1) - 896));
            int i23 = (i22 + i21) - (i22 & i21);
            int i24 = i5 >> 3;
            int i25 = i24 & 7168;
            int i26 = i5 >> 9;
            int i27 = ((-1) - (((-1) - ((-1) - (((-1) - ((i23 + i25) - (i23 & i25))) & ((-1) - ((i26 + 57344) - (i26 | 57344)))))) & ((-1) - ((-1) - (((-1) - i26) | ((-1) - 458752)))))) | ((-1) - (((-1) - i26) | ((-1) - 3670016)));
            int i28 = i6 << 21;
            int i29 = i27 | ((i28 + 29360128) - (29360128 | i28));
            int i30 = 234881024 & i28;
            int i31 = ((i29 + i30) - (i29 & i30)) | (i28 & 1879048192);
            int i32 = ((-1) - (((-1) - (((i5 + 896) - (i5 | 896)) | ((-1) - (((-1) - ((i6 >> 9) & 14)) & ((-1) - ((i5 >> 6) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)))))) & ((-1) - ((-1) - (((-1) - i26) | ((-1) - 7168)))))) | ((57344 + i24) - (57344 | i24)) | ((-1) - (((-1) - (i6 >> 3)) | ((-1) - 458752)));
            int i33 = i6 << 3;
            int i34 = (3670016 + i33) - (3670016 | i33);
            int i35 = (i32 + i34) - (i32 & i34);
            int i36 = i6 & 29360128;
            str2 = str2;
            function217 = function217;
            visualTransformation2 = visualTransformation2;
            function215 = function215;
            z7 = z7;
            z62 = z62;
            interactionSource22 = interactionSource22;
            TextFieldImplKt.CommonDecorationBox(textFieldType, str2, function217, visualTransformation2, function216, function215, function214, function213, function212, function211, function210, z7, z62, z52, interactionSource22, paddingValuesM2683contentPaddingWithoutLabela9UjIt4$default, textFieldColorsColors2, composableLambdaRememberComposableLambda, composerStartRestartGroup, i31, (i35 + i36) - (i35 & i36), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults.DecorationBox.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$changed1;
                final /* synthetic */ int $$default;
                final /* synthetic */ TextFieldColors $colors;
                final /* synthetic */ Function2<Composer, Integer, Unit> $container;
                final /* synthetic */ PaddingValues $contentPadding;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ Function2<Composer, Integer, Unit> $innerTextField;
                final /* synthetic */ InteractionSource $interactionSource;
                final /* synthetic */ boolean $isError;
                final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
                final /* synthetic */ Shape $shape;
                final /* synthetic */ boolean $singleLine;
                final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
                final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                final /* synthetic */ String $value;
                final /* synthetic */ VisualTransformation $visualTransformation;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass2(String str22, Function2<? super Composer, ? super Integer, Unit> function2172, boolean z62, boolean z72, VisualTransformation visualTransformation22, InteractionSource interactionSource22, boolean z52, Function2<? super Composer, ? super Integer, Unit> function2162, Function2<? super Composer, ? super Integer, Unit> function2152, Function2<? super Composer, ? super Integer, Unit> function2142, Function2<? super Composer, ? super Integer, Unit> function2132, Function2<? super Composer, ? super Integer, Unit> function2122, Function2<? super Composer, ? super Integer, Unit> function2112, Function2<? super Composer, ? super Integer, Unit> function2102, Shape shape22, TextFieldColors textFieldColorsColors2, PaddingValues paddingValuesM2683contentPaddingWithoutLabela9UjIt4$default2, Function2<? super Composer, ? super Integer, Unit> composableLambdaRememberComposableLambda2, int i210, int i37, int i42) {
                    super(2);
                    str = str22;
                    function2 = function2172;
                    z = z62;
                    z = z72;
                    visualTransformation = visualTransformation22;
                    interactionSource = interactionSource22;
                    z = z52;
                    function2 = function2162;
                    function2 = function2152;
                    function2 = function2142;
                    function2 = function2132;
                    function2 = function2122;
                    function2 = function2112;
                    function2 = function2102;
                    shape = shape22;
                    textFieldColors = textFieldColorsColors2;
                    paddingValues = paddingValuesM2683contentPaddingWithoutLabela9UjIt4$default2;
                    function2 = composableLambdaRememberComposableLambda2;
                    i = i210;
                    i = i37;
                    i = i42;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i210) {
                    TextFieldDefaults.this.DecorationBox(str, function2, z, z, visualTransformation, interactionSource, z, function2, function2, function2, function2, function2, function2, function2, shape, textFieldColors, paddingValues, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: contentPaddingWithLabel-a9UjIt4$default */
    public static /* synthetic */ PaddingValues m2682contentPaddingWithLabela9UjIt4$default(TextFieldDefaults textFieldDefaults, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((1 & i2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((4 & i2) != 0) {
            f4 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            f5 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        return textFieldDefaults.m2693contentPaddingWithLabela9UjIt4(f2, f3, f4, f5);
    }

    /* JADX INFO: renamed from: contentPaddingWithLabel-a9UjIt4 */
    public final PaddingValues m2693contentPaddingWithLabela9UjIt4(float f2, float f3, float f4, float f5) {
        return PaddingKt.m1014PaddingValuesa9UjIt4(f2, f4, f3, f5);
    }

    /* JADX INFO: renamed from: contentPaddingWithoutLabel-a9UjIt4$default */
    public static /* synthetic */ PaddingValues m2683contentPaddingWithoutLabela9UjIt4$default(TextFieldDefaults textFieldDefaults, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((1 & i2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 8) != 0) {
            f5 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m2694contentPaddingWithoutLabela9UjIt4(f2, f3, f4, f5);
    }

    /* JADX INFO: renamed from: contentPaddingWithoutLabel-a9UjIt4 */
    public final PaddingValues m2694contentPaddingWithoutLabela9UjIt4(float f2, float f3, float f4, float f5) {
        return PaddingKt.m1014PaddingValuesa9UjIt4(f2, f3, f4, f5);
    }

    /* JADX INFO: renamed from: supportingTextPadding-a9UjIt4$material3_release$default */
    public static /* synthetic */ PaddingValues m2688supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults textFieldDefaults, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((1 & i2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            f3 = TextFieldImplKt.getSupportingTopPadding();
        }
        if ((4 & i2) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 8) != 0) {
            f5 = Dp.m6638constructorimpl(0);
        }
        return textFieldDefaults.m2703supportingTextPaddinga9UjIt4$material3_release(f2, f3, f4, f5);
    }

    /* JADX INFO: renamed from: supportingTextPadding-a9UjIt4$material3_release */
    public final PaddingValues m2703supportingTextPaddinga9UjIt4$material3_release(float f2, float f3, float f4, float f5) {
        return PaddingKt.m1014PaddingValuesa9UjIt4(f2, f3, f4, f5);
    }

    public final TextFieldColors colors(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 831731228, "C(colors)336@16080L11,336@16092L22:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(831731228, i2, -1, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:336)");
        }
        TextFieldColors defaultTextFieldColors = getDefaultTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i2 << 3) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultTextFieldColors;
    }

    /* JADX INFO: renamed from: colors-0hiis_0 */
    public final TextFieldColors m2692colors0hiis_0(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, TextSelectionColors textSelectionColors, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, Composer composer, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        long jM4214getUnspecified0d7_KjU = j43;
        long jM4214getUnspecified0d7_KjU2 = j35;
        long jM4214getUnspecified0d7_KjU3 = j37;
        long jM4214getUnspecified0d7_KjU4 = j33;
        long jM4214getUnspecified0d7_KjU5 = j34;
        long jM4214getUnspecified0d7_KjU6 = j30;
        long jM4214getUnspecified0d7_KjU7 = j29;
        long jM4214getUnspecified0d7_KjU8 = j28;
        long jM4214getUnspecified0d7_KjU9 = j24;
        long jM4214getUnspecified0d7_KjU10 = j17;
        long jM4214getUnspecified0d7_KjU11 = j42;
        long jM4214getUnspecified0d7_KjU12 = j26;
        long jM4214getUnspecified0d7_KjU13 = j18;
        long jM4214getUnspecified0d7_KjU14 = j16;
        long jM4214getUnspecified0d7_KjU15 = j38;
        long jM4214getUnspecified0d7_KjU16 = j14;
        long jM4214getUnspecified0d7_KjU17 = j25;
        long jM4214getUnspecified0d7_KjU18 = j21;
        long jM4214getUnspecified0d7_KjU19 = j19;
        long jM4214getUnspecified0d7_KjU20 = j41;
        long jM4214getUnspecified0d7_KjU21 = j13;
        long jM4214getUnspecified0d7_KjU22 = j22;
        long jM4214getUnspecified0d7_KjU23 = j20;
        long jM4214getUnspecified0d7_KjU24 = j40;
        long jM4214getUnspecified0d7_KjU25 = j12;
        long jM4214getUnspecified0d7_KjU26 = j3;
        long jM4214getUnspecified0d7_KjU27 = j11;
        long jM4214getUnspecified0d7_KjU28 = j27;
        long jM4214getUnspecified0d7_KjU29 = j23;
        long jM4214getUnspecified0d7_KjU30 = j10;
        long jM4214getUnspecified0d7_KjU31 = j6;
        long jM4214getUnspecified0d7_KjU32 = j31;
        long jM4214getUnspecified0d7_KjU33 = j8;
        TextSelectionColors textSelectionColors2 = textSelectionColors;
        long jM4214getUnspecified0d7_KjU34 = j4;
        long jM4214getUnspecified0d7_KjU35 = j39;
        long jM4214getUnspecified0d7_KjU36 = j15;
        long jM4214getUnspecified0d7_KjU37 = j36;
        long jM4214getUnspecified0d7_KjU38 = j32;
        long jM4214getUnspecified0d7_KjU39 = j9;
        long jM4214getUnspecified0d7_KjU40 = j7;
        long jM4214getUnspecified0d7_KjU41 = j5;
        long jM4214getUnspecified0d7_KjU42 = j2;
        ComposerKt.sourceInformationMarkerStart(composer, 1513344955, "C(colors)P(30:c#ui.graphics.Color,41:c#ui.graphics.Color,9:c#ui.graphics.Color,20:c#ui.graphics.Color,22:c#ui.graphics.Color,33:c#ui.graphics.Color,1:c#ui.graphics.Color,11:c#ui.graphics.Color,0:c#ui.graphics.Color,12:c#ui.graphics.Color,32,23:c#ui.graphics.Color,34:c#ui.graphics.Color,2:c#ui.graphics.Color,13:c#ui.graphics.Color,25:c#ui.graphics.Color,36:c#ui.graphics.Color,4:c#ui.graphics.Color,15:c#ui.graphics.Color,31:c#ui.graphics.Color,42:c#ui.graphics.Color,10:c#ui.graphics.Color,21:c#ui.graphics.Color,24:c#ui.graphics.Color,35:c#ui.graphics.Color,3:c#ui.graphics.Color,14:c#ui.graphics.Color,26:c#ui.graphics.Color,37:c#ui.graphics.Color,5:c#ui.graphics.Color,16:c#ui.graphics.Color,29:c#ui.graphics.Color,40:c#ui.graphics.Color,8:c#ui.graphics.Color,19:c#ui.graphics.Color,27:c#ui.graphics.Color,38:c#ui.graphics.Color,6:c#ui.graphics.Color,17:c#ui.graphics.Color,28:c#ui.graphics.Color,39:c#ui.graphics.Color,7:c#ui.graphics.Color,18:c#ui.graphics.Color)438@22922L11,438@22934L22:TextFieldDefaults.kt#uh7d8r");
        if ((i7 + 1) - (i7 | 1) != 0) {
            jM4214getUnspecified0d7_KjU42 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i7 & 2) != 0) {
            jM4214getUnspecified0d7_KjU26 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i7 & 4) != 0) {
            jM4214getUnspecified0d7_KjU34 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i7 + 8) - (i7 | 8) != 0) {
            jM4214getUnspecified0d7_KjU41 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i7 & 16) != 0) {
            jM4214getUnspecified0d7_KjU31 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i7 + 32) - (i7 | 32) != 0) {
            jM4214getUnspecified0d7_KjU40 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i7 & 64) != 0) {
            jM4214getUnspecified0d7_KjU33 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i7) | ((-1) - 128)) != 0) {
            jM4214getUnspecified0d7_KjU39 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i7 + 256) - (i7 | 256) != 0) {
            jM4214getUnspecified0d7_KjU30 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i7) | ((-1) - 512)) != 0) {
            jM4214getUnspecified0d7_KjU27 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i7 & 1024) != 0) {
            textSelectionColors2 = null;
        }
        if ((-1) - (((-1) - i7) | ((-1) - 2048)) != 0) {
            jM4214getUnspecified0d7_KjU25 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i7 & 4096) != 0) {
            jM4214getUnspecified0d7_KjU21 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i7 + 8192) - (i7 | 8192) != 0) {
            jM4214getUnspecified0d7_KjU16 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i7 + 16384) - (i7 | 16384) != 0) {
            jM4214getUnspecified0d7_KjU36 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((32768 & i7) != 0) {
            jM4214getUnspecified0d7_KjU14 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((65536 & i7) != 0) {
            jM4214getUnspecified0d7_KjU10 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - 131072) | ((-1) - i7)) != 0) {
            jM4214getUnspecified0d7_KjU13 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((262144 + i7) - (262144 | i7) != 0) {
            jM4214getUnspecified0d7_KjU19 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - 524288) | ((-1) - i7)) != 0) {
            jM4214getUnspecified0d7_KjU23 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((1048576 & i7) != 0) {
            jM4214getUnspecified0d7_KjU18 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - 2097152) | ((-1) - i7)) != 0) {
            jM4214getUnspecified0d7_KjU22 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((4194304 + i7) - (4194304 | i7) != 0) {
            jM4214getUnspecified0d7_KjU29 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((8388608 & i7) != 0) {
            jM4214getUnspecified0d7_KjU9 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((16777216 + i7) - (16777216 | i7) != 0) {
            jM4214getUnspecified0d7_KjU17 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((33554432 + i7) - (33554432 | i7) != 0) {
            jM4214getUnspecified0d7_KjU12 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) | ((-1) - i7)) != 0) {
            jM4214getUnspecified0d7_KjU28 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - 134217728) | ((-1) - i7)) != 0) {
            jM4214getUnspecified0d7_KjU8 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((268435456 + i7) - (268435456 | i7) != 0) {
            jM4214getUnspecified0d7_KjU7 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - 536870912) | ((-1) - i7)) != 0) {
            jM4214getUnspecified0d7_KjU6 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i7 + 1073741824) - (i7 | 1073741824) != 0) {
            jM4214getUnspecified0d7_KjU32 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i8) | ((-1) - 1)) != 0) {
            jM4214getUnspecified0d7_KjU38 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i8 & 2) != 0) {
            jM4214getUnspecified0d7_KjU4 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i8 + 4) - (i8 | 4) != 0) {
            jM4214getUnspecified0d7_KjU5 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i8) | ((-1) - 8)) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i8 + 16) - (i8 | 16) != 0) {
            jM4214getUnspecified0d7_KjU37 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i8 & 32) != 0) {
            jM4214getUnspecified0d7_KjU3 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i8 & 64) != 0) {
            jM4214getUnspecified0d7_KjU15 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i8 + 128) - (i8 | 128) != 0) {
            jM4214getUnspecified0d7_KjU35 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i8) | ((-1) - 256)) != 0) {
            jM4214getUnspecified0d7_KjU24 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i8 & 512) != 0) {
            jM4214getUnspecified0d7_KjU20 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i8 & 1024) != 0) {
            jM4214getUnspecified0d7_KjU11 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i8 & 2048) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1513344955, i2, i3, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:438)");
        }
        int i9 = i6 >> 6;
        TextFieldColors textFieldColorsM2629copyejIjP34 = getDefaultTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i9 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i9 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)).m2629copyejIjP34(jM4214getUnspecified0d7_KjU42, jM4214getUnspecified0d7_KjU26, jM4214getUnspecified0d7_KjU34, jM4214getUnspecified0d7_KjU41, jM4214getUnspecified0d7_KjU31, jM4214getUnspecified0d7_KjU40, jM4214getUnspecified0d7_KjU33, jM4214getUnspecified0d7_KjU39, jM4214getUnspecified0d7_KjU30, jM4214getUnspecified0d7_KjU27, textSelectionColors2, jM4214getUnspecified0d7_KjU25, jM4214getUnspecified0d7_KjU21, jM4214getUnspecified0d7_KjU16, jM4214getUnspecified0d7_KjU36, jM4214getUnspecified0d7_KjU14, jM4214getUnspecified0d7_KjU10, jM4214getUnspecified0d7_KjU13, jM4214getUnspecified0d7_KjU19, jM4214getUnspecified0d7_KjU23, jM4214getUnspecified0d7_KjU18, jM4214getUnspecified0d7_KjU22, jM4214getUnspecified0d7_KjU29, jM4214getUnspecified0d7_KjU9, jM4214getUnspecified0d7_KjU17, jM4214getUnspecified0d7_KjU12, jM4214getUnspecified0d7_KjU28, jM4214getUnspecified0d7_KjU8, jM4214getUnspecified0d7_KjU7, jM4214getUnspecified0d7_KjU6, jM4214getUnspecified0d7_KjU32, jM4214getUnspecified0d7_KjU38, jM4214getUnspecified0d7_KjU4, jM4214getUnspecified0d7_KjU5, jM4214getUnspecified0d7_KjU2, jM4214getUnspecified0d7_KjU37, jM4214getUnspecified0d7_KjU3, jM4214getUnspecified0d7_KjU15, jM4214getUnspecified0d7_KjU35, jM4214getUnspecified0d7_KjU24, jM4214getUnspecified0d7_KjU20, jM4214getUnspecified0d7_KjU11, jM4214getUnspecified0d7_KjU);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return textFieldColorsM2629copyejIjP34;
    }

    public final TextFieldColors getDefaultTextFieldColors(ColorScheme colorScheme, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1341970309, "C:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1341970309, i2, -1, "androidx.compose.material3.TextFieldDefaults.<get-defaultTextFieldColors> (TextFieldDefaults.kt:486)");
        }
        TextFieldColors defaultTextFieldColorsCached$material3_release = colorScheme.getDefaultTextFieldColorsCached$material3_release();
        composer.startReplaceGroup(27085453);
        ComposerKt.sourceInformation(composer, "*501@26788L7");
        if (defaultTextFieldColorsCached$material3_release == null) {
            long jFromToken = ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getFocusInputColor());
            long jFromToken2 = ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputColor());
            long jM4177copywmQWz5c$default = Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getDisabledInputColor()), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
            long jFromToken3 = ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getErrorInputColor());
            long jFromToken4 = ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getContainerColor());
            long jFromToken5 = ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getContainerColor());
            long jFromToken6 = ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getContainerColor());
            long jFromToken7 = ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getContainerColor());
            long jFromToken8 = ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getCaretColor());
            long jFromToken9 = ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getErrorFocusCaretColor());
            ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localTextSelectionColors);
            ComposerKt.sourceInformationMarkerEnd(composer);
            defaultTextFieldColorsCached$material3_release = new TextFieldColors(jFromToken, jFromToken2, jM4177copywmQWz5c$default, jFromToken3, jFromToken4, jFromToken5, jFromToken6, jFromToken7, jFromToken8, jFromToken9, (TextSelectionColors) objConsume, ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getFocusActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getActiveIndicatorColor()), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getDisabledActiveIndicatorColor()), FilledTextFieldTokens.INSTANCE.getDisabledActiveIndicatorOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getErrorActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getFocusLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getLeadingIconColor()), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor()), FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getErrorLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getFocusTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getTrailingIconColor()), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor()), FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getErrorTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getFocusLabelColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getLabelColor()), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getDisabledLabelColor()), FilledTextFieldTokens.INSTANCE.getDisabledLabelOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getErrorLabelColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor()), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getDisabledInputColor()), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getFocusSupportingColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getSupportingColor()), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getDisabledSupportingColor()), FilledTextFieldTokens.INSTANCE.getDisabledSupportingOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getErrorSupportingColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputPrefixColor()), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputPrefixColor()), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputSuffixColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputSuffixColor()), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputSuffixColor()), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputSuffixColor()), null);
            colorScheme.setDefaultTextFieldColorsCached$material3_release(defaultTextFieldColorsCached$material3_release);
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultTextFieldColorsCached$material3_release;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0117  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "\u0015K\n6~y\u0019\u0017lVgnU-@4eQ\u0015+hm\u0012S\fR\u0003}\u001cW3t|MmPRn", replaceWith = @kotlin.ReplaceWith(expression = "Container(\n    enabled = enabled,\n    isError = isError,\n    interactionSource = interactionSource,\n    colors = colors,\n    shape = shape,\n)", imports = {}))
    @yg.InterfaceC1492Gx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ContainerBox(boolean r21, boolean r22, androidx.compose.foundation.interaction.InteractionSource r23, androidx.compose.material3.TextFieldColors r24, androidx.compose.ui.graphics.Shape r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.ContainerBox(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, androidx.compose.runtime.Composer, int, int):void");
    }

    public final Shape getOutlinedShape(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -584749279, "C613@33100L5:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-584749279, i2, -1, "androidx.compose.material3.TextFieldDefaults.<get-outlinedShape> (TextFieldDefaults.kt:613)");
        }
        Shape shape = OutlinedTextFieldDefaults.INSTANCE.getShape(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return shape;
    }

    public final Shape getFilledShape(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 611926497, "C621@33346L5:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(611926497, i2, -1, "androidx.compose.material3.TextFieldDefaults.<get-filledShape> (TextFieldDefaults.kt:621)");
        }
        Shape shape = getShape(composer, (i2 + 14) - (i2 | 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return shape;
    }

    /* JADX INFO: renamed from: getUnfocusedBorderThickness-D9Ej5fM */
    public final float m2699getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    /* JADX INFO: renamed from: getFocusedBorderThickness-D9Ej5fM */
    public final float m2695getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* JADX INFO: renamed from: textFieldWithLabelPadding-a9UjIt4$default */
    public static /* synthetic */ PaddingValues m2689textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((4 & i2) != 0) {
            f4 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            f5 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        return textFieldDefaults.m2704textFieldWithLabelPaddinga9UjIt4(f2, f3, f4, f5);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0015K\n6~y\u0019\u0017lVgzD\u001aDbBU\u000e3\tL\u0011Xw[z~aB'uv`iPaLi=J'AA\t_`\u0002\u000eYJ@q>", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.contentPaddingWithLabel(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: textFieldWithLabelPadding-a9UjIt4 */
    public final PaddingValues m2704textFieldWithLabelPaddinga9UjIt4(float f2, float f3, float f4, float f5) {
        return m2693contentPaddingWithLabela9UjIt4(f2, f3, f4, f5);
    }

    /* JADX INFO: renamed from: textFieldWithoutLabelPadding-a9UjIt4$default */
    public static /* synthetic */ PaddingValues m2690textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            f5 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m2705textFieldWithoutLabelPaddinga9UjIt4(f2, f3, f4, f5);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0015K\n6~y\u0019\u0017lVgzD\u001aDbBU\u000e3\tL\u0011Xw[z~aB'uv`iPaLi=J'AA\t_`\u00021m\\'f@9\u001e\f", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.contentPaddingWithoutLabel(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: textFieldWithoutLabelPadding-a9UjIt4 */
    public final PaddingValues m2705textFieldWithoutLabelPaddinga9UjIt4(float f2, float f3, float f4, float f5) {
        return m2694contentPaddingWithoutLabela9UjIt4(f2, f3, f4, f5);
    }

    /* JADX INFO: renamed from: outlinedTextFieldPadding-a9UjIt4$default */
    public static /* synthetic */ PaddingValues m2687outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((4 & i2) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            f5 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m2702outlinedTextFieldPaddinga9UjIt4(f2, f3, f4, f5);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0015K\n6~y\u0019\u0017lVgz?*@ZeZ\u000e+xm$f\\OsvRX)liapV`*kHT28H&FM}&aVBe", replaceWith = @ReplaceWith(expression = "OutlinedTextFieldDefaults.contentPadding(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: outlinedTextFieldPadding-a9UjIt4 */
    public final PaddingValues m2702outlinedTextFieldPaddinga9UjIt4(float f2, float f3, float f4, float f5) {
        return OutlinedTextFieldDefaults.INSTANCE.m2362contentPaddinga9UjIt4(f2, f3, f4, f5);
    }

    /* JADX INFO: renamed from: indicatorLine-gv0btCI */
    public final Modifier m2701indicatorLinegv0btCI(Modifier modifier, final boolean z2, final boolean z3, final InteractionSource interactionSource, final TextFieldColors textFieldColors, final float f2, final float f3) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("indicatorLine");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("isError", Boolean.valueOf(z3));
                inspectorInfo.getProperties().set("interactionSource", interactionSource);
                inspectorInfo.getProperties().set(LinearGradientManager.PROP_COLORS, textFieldColors);
                inspectorInfo.getProperties().set("focusedIndicatorLineThickness", Dp.m6636boximpl(f2));
                inspectorInfo.getProperties().set("unfocusedIndicatorLineThickness", Dp.m6636boximpl(f3));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material3.TextFieldDefaults$indicatorLine$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                composer.startReplaceGroup(-891038934);
                ComposerKt.sourceInformation(composer, "C169@7666L25,171@7739L263:TextFieldDefaults.kt#uh7d8r");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-891038934, i2, -1, "androidx.compose.material3.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:169)");
                }
                Modifier modifierDrawIndicatorLine = TextFieldKt.drawIndicatorLine(Modifier.Companion, TextFieldImplKt.m3000animateBorderStrokeAsStateNuRrP5Q(z2, z3, FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, 0).getValue().booleanValue(), textFieldColors, f2, f3, composer, 0));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierDrawIndicatorLine;
            }
        });
    }

    static {
        float fM6638constructorimpl = Dp.m6638constructorimpl(1);
        UnfocusedIndicatorThickness = fM6638constructorimpl;
        float fM6638constructorimpl2 = Dp.m6638constructorimpl(2);
        FocusedIndicatorThickness = fM6638constructorimpl2;
        UnfocusedBorderThickness = fM6638constructorimpl;
        FocusedBorderThickness = fM6638constructorimpl2;
    }
}
