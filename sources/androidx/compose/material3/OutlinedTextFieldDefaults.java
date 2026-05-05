package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.internal.TextFieldType;
import androidx.compose.material3.tokens.OutlinedTextFieldTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
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
@Metadata(bv = {}, d1 = {"Яx\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005*4\u0012\u000e\u0007nj?1Le^.ZS@\u000fs{:%c$\u007fCC٥\"}0\u0012WNmgvJp\u000bKƤ\u000e\u0016\u000fj4I[\u0001e\u0012\u001d>JģG3coE9vt>\u0005&2*8\u0010\u0005\t\u001a0N\u0018v\u0011CS\f\u00182HpPR\u0015M\u000b\"\u001a\u0006T \t\u001eb\u000fTɬH\u0003җj/Q\u0002*GT'ۢ4|[\r\u000f/5\"\u000faLAp;C,=S1\u001f\u0003_M\u001cWqk\u001d\u0019+5Eas\u0006Q\t\u0006\u001a\u00159k%]!C\r\u000bW`\u001aECO\u0012\\\u0001\u0014.w\t\b%<2\u001b6-N.;9~\b<5%xY@^\"vB.|(;҆$ĮĴ/;!\b_\u0004\u0004i\\Z\u0014\u0005;4S\u0005|8sT<xE\u001fb\u0011i1\u007fXmL\\$q=\u001c\u001f!h\b*\u0012N_\u007f]\rA4\u001d%EgQ#Ox2NJg\u0005$xh\u0002k\u0003NF\"|6O*7\u000e!I×\u0004ߘÏXZ25[A\u001dΒ}\u001698\\&RQ)\u001eugh\u0018\u0013}l\u0018NGqG[~k<mg\tۋ9Qi;\u0012V\u0005+W<\u0011\u001d\tjP\u007f$Z\u000b@R6V\u0018(w*r~\u0010!LWqJO\\7\u001f\\#a\u001b\u001epY-\u001ceZv?\u0017aC&\u0013iR\u000b\u001f\u007f~\u0007ʼsg~t\\\u0010f\";qiB)(e\"\u0017J\u0013\"5)\u0381\u0004Gmww_r\u0016\u0004\u0007\u0014-&\u001cIQ]S)\u000e-Sɨ\u0006-Kw#xWM Y\u0013\n\n\u0011Kh\\}\u001ei\u001fV߯nJU\u007fG5|^\u0001V q\u0010{qF)]yS9\u0006ƏMr\t\u0005la>|\u0013S62\u0011q2|cCY&K@߳\u0018/\u001b\r\u000e|u.\b\u0018'3\u0005g\u0014,\u0012,\u0006a\u007f\bщ?8O\u0005/D($z!ZH\u0019\t8H\u000f4\u001bi`A\u0013(\u0007IS\u000b=6~\u0012<\u000f\u0001V\nPA\u001aϻ8.eU:H\u0382\u0018^Q^YXa\u0006\u0006mymQO؝\u000e\u000b\nk7ݡ\u001dK>nW\u0011\u001a`\fy\u0018D|Sb3x9*:,JE#C\u0003&6\u0016\u0001\u007fT\u001e'\u0017`~$A\\\u000eb8tVvA\u0011Kf!8A\u0017\u000faZ);7\u0005{\bl/\u0012n1Y#\t)-g~\u0015a[JZ9)kp\u00019\u0002\u000eIO\u0002DH_)\u001c( \u0012>\u0018\u000bbZ\u0018Iu\u0002\u0019ev>%#WzM\u0013>BlXN0q\u0017z+Jl\u0010\u0015\u000b'\u0019\u000bo\u0011i|T}7Qd\u0019\u0017re7\u0012\u0003cTfE\u0006cimOp\u00145HoSi:8&&'\u0012B9\\\u0006J\u0017\u0010c\u001bHd\n\u0016\u0011>9\u0019V \u0012}bt!F^\u000e<O\u0010\u0004\u001a\u0013\r\u0016\u001c}'@5|\u0005\u0006p\b\u0019~\u0010cz6\u0007U9?\u00177\\y|\u0001h\u001d7c}4\u0019Xh\u000f)SN\u0015A\u0006\u001a\u00154tN\b\u0011e@Uih~Bg[;g_q0a?\bj\u001e,[*{\n*b\u0001-;\u0005\nnj\u000f\\z\u001co\u000e\r'Xjz\f7n\u0015~v\u001bA\u0019:F\u0001y|/eUOa\u0013Gnc\u001cEwbQ7X?)\u0015J\u000b\u001ed'\u0017\t:pS\u0018*pE#\u0006m,;&l=Hc\n*sd\u0011\u0007cEf~82\u0017\u000e\u001f\u0011r8Nz\r \";_\u0016Y\u0019?=E>\fo\u0015|Mj\u007f\u0010U0\u0007|\u000fqWy_(jy=r1\u0015'oI\u0014\u0017A+5s3?\f0\"z\u0005Scdvy,wq\f#ĒTʮ·\u000e!*\r\u0014_k6Sg`*\u000e\u0014p\\yW\u0012\u0011B6\u001dFSMrx\u0002uDiFu\u0015ag4Og,\u0019r@Z3r\u0007S;\u0001y9FֲDũʁ\u0013\b/\"%l`f\u007fACI!OԆ[Ѯۣ\u0012r̿>:i6\bLX[0\t;\u0016%zxp\u0006Q\u000e\u0012ڷ\u0011ԔǨ\u0003vٽVh\b`+\u001d?M|MD`IdOj#@=&݄-˷ֶ\n\u0005\u00892P\u001f\u0002\fOx\u0017\u0019<Uw\u0012^ `\u0014!K\u0013ټ$̵ʰfiߒC]yXK>K\rsUf96k\u0013a9K\u00138KEԐ/2_XD(8gV$St`\u0010r\nl(\u001cBfo'څ\\\u05cfa\u00054!Ch#y܂2k?^jʑGeVvR[Bٳ|r"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006`5D`\u0002)7l\u0005.`R\u001co4%\u0014Ga:\u0003s3]\u0005|", "", "u(E", "\u0014nRBf,=0#\fy^9k\f3c\u00061{N\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u0013b*Na\u0019}Wh9{\t<T\u0003,yF\n\u0017%U7l\u0010V*\u0005Ze", "u(5", "\u0014", "\u001bh]\u0015X0@V(", "5dc\u001a\\5!S\u001d\u0001}ms[\\\u000fjO)c", "\u001bh]$\\+MV", "5dc\u001a\\50W\u0018\u000e}&\u000bPh45\u0001\u0010", "#mU<V<LS\u0018[\u0005k+|\u0016\u001eh\u0004&\u0002I\u0001%%", "5dc\"a-HQ)\rz]\t\u0007\u0016.e\r\u0017~D~\u001d G}\u001c\u0004Ux\u0015^M!\u001f", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "5dc [(IS", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016^0&T\u007f9\u001f\u0015^\f\\tz\bUL$D", "2dU.h3M=)\u000e\u0002b5|\b\u001ee\u00137\\D\u0001\u001e\u0016%y\u0015F\u00043", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e%Hh^$7t\u0015\fWJExBs", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T/<c\u000b\u000e5p\u00166M\u0019", "5dc\u0011X-:c \u000edn;\u0004\r8e~\u0017{S\u0010w\u001bGv\r\u001a\u0001,?f\f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0003?`\b-%k\u0019.UC\u0011R0'\u0014uk=\u0006vuL\u0001/RV\\,&_\u0003F#\u0016b\u000e\u0018\t\u0017\rdK2nQ\r\u0003K\u0013E\u000b:u\u000b\u0010\u0015!~hzJa\u001aUy^}=8hS][\u0001\u0015\u000b4b=slc\u001dc9\u0018.\u001b{&)>", "\u0011n]AT0GS&", "", "3mP/_,=", "", "7r4?e6K", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005O=-\u0015u]7\u0016g6Wd1WYL,2", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "1n[<e:", "4nRBf,=0#\fy^9k\f3c\u00061{N\u000f", "CmU<V<LS\u0018[\u0005k+|\u0016\u001eh\u0004&\u0002I\u0001%%", "\u0011n]AT0GS&FI>\r\u000f\t\u000bY", "uYI\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0002!'Pn\nKz/>#\u0002)Fm#*KR?u=gxqp9\u0014_*]z1P:X<iPr\u0013z\u000ec\r[5\u0011\u0004l\u000b\"xLB)\u0016,\u0013\u0012?2h\u0016\u0015\u00126npO,vC\u0003\u0014\u0003K-gY#]\u0004OLOp*.\u0014[,\\G> \u001b?b\nhc=j\u007fS\u0018q0\u0004nqT'P\u001f GlhPInh\u0006r1'V\u0006\u0006\u0012{hxtv:\u007f?-:b\u0013\u0015U\u001b:ixj\r=(#/5I\u001dCJv?jH\u0016s)o\bWoE:(imc\u0012l\u0011e\"eCalV\u001b6I/", "\u0011n]AT0GS&[\u0005q", "\u0011n]AT0GS&[\u0005qs\u0006\u0006!gq3W", "uYI\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0002!'Pn\nKz/>#\u0002)Fm#*KR?u=gxqp9\u0014_*]z1P:X<iPr\u0013z\u000ec\r[5\u0011\u0004l\u000b\"xLB)\u0016,\u0013\n7w\u0001\u0019\u001a\n<8:1V#VZ\u0019uH(FP`i\u0007U\u0017,^3c\u0019i![M\u0004\"\u001ey$%vPw\u001a\u007f\u001d\u0013\u007fN\u0005jkE'D&':x[\u001c&P<8}&,U\u007fv%{V~3\u007f7\u00124sCt\u000eZk >(V\u001f4gK5&C\u0012v#\u000fT", "\u0012dR<e(MW#\bWh?", "D`[BX", "", "7m]2e\u001b>f(_~^3{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "Ah]4_,%W\"~", "DhbBT3-`\u0015\b\t_6\n\u0011+t\u00042\u0005", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#n$E}\u00125<P7tB\u001f\u001fui5\u0016g6WL", ":`Q2_", ">kP0X/HZ\u0018~\b", ":dP1\\5@7\u0017\t\u0004", "BqP6_0GU||\u0005g", ">qT3\\?", "AtU3\\?", "At_=b9MW\"\u0001i^?\f", "1n]AX5M>\u0015}yb5~", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", "1n]AT0GS&", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00100\u0002Ck\u000eCUM9fVqP]\u0010d\u0016Y5\u001b\u0005#Q(8S72\u0017uM\u000bFx\u0010U\u0007\u0012CzlIE\u001dC\u0003#vK6pBhc\u0004P\u0017,^3c\u0019i![M\u0004\"\u001ey$%vPw\u000b\u0006c\u001aqN\tkqPb~A3>zWDTs_E>\u000b(Z{\u0005\u000e0gx5}\u001b\u000eD74dZ@N\u001eHm\u007f\u00195&F8.\u007f=#HIryvG\u001c2\u007fq\u0011\fq9;\"2;JN\u0019\u0016d\u001bd~fp\t\u0001S\u0016GG~\u00191O\r\f<\n\u001e\u0007\u0016(wn\u0016\u0019\u0002Z\u000b)wH+)\u0016\u0014\u000b0\u0019,7\u0014L]\u0019q8)\u0018]\u001c\u0007w<\u0016\u0005&\u0019{vR\u001ftO{%\\\u0001,\u007fy!R\u001fBOF\u007f`\rP \u001f2\u0010\u000f\t&@?)\u007f@\",)F#=shx\fw\\ (kB%-v\u0012\u0012[>}b\u00020aStn\u0007$dBAK8RQ4#LlI\u0014@d[\u001eu.%8^\u0004\u001aLd@\u000b1t\u0018\u000f\u000b/\u0002\\!=.?H/p\u0019>j\u0016\u0015\u00189}?$~gR V_D/D#|h9\t\u000f5\u0010f\u001fT\f3Q:\u0018Pr.3\u0015\u0002P\r\u007f\"&yvI[%!H\u0011c\u0012W\u0011,SpB\u0012\u0003vyX3`dk\n~^J \\;^9**\nTA\u0005o\r].\u0011|@ \fH8]\u000b;3^~\u001f\"r3yGuC]'F\u001b/W\u0007d:\u0002pm\u0007wop\u0004V\u000e\u00199\u0003\u0012\u000bO:a\"JVsR[X7)1\u000eOB,G4|%(S\u007f\u0014\b\u0002\u00170Vg\u0012A=uB[POk*-pjCj|N", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016V(kR\u007fA\u0010\u0019(W=+ \u0014:E$uC\u0015)\u000f6V\u0010\u0011", "4nRBf,=B\u0019\u0012\n<6\u0004\u0013<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "CmU<V<LS\u0018mzq;Z\u00136o\r", "2hb.U3>R\b~\u000em\n\u0007\u00109r", "3qa<e\u001b>f(\\\u0005e6\n", "4nRBf,=1#\b\nZ0\u0006\t<C\n/\u0006M", "CmU<V<LS\u0018\\\u0005g;x\r8e\r\u0006\u0006G\u000b$", "2hb.U3>Rv\t\u0004m(\u0001\u0012/r]2\u0003J\u000e", "3qa<e\nH\\(z~g,\nf9l\n5", "1ta@b9\u001c] \t\b", "3qa<e\nN`'\t\b<6\u0004\u0013<", "Ad[2V;B]\"\\\u0005e6\n\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0004htHtc3Nt6KVW\nfY|J\"g", "4nRBf,=0#\fy^9Z\u00136o\r", "CmU<V<LS\u0018[\u0005k+|\u0016\ro\u00072\t", "2hb.U3>Ru\t\b],\nf9l\n5", "3qa<e\tH`\u0018~\b<6\u0004\u0013<", "4nRBf,=:\u0019zyb5~l-o\t\u0006\u0006G\u000b$", "CmU<V<LS\u0018ezZ+\u0001\u00121I}2\u0005\u001e\u000b\u001e!T", "2hb.U3>R\u007f~v]0\u0006\u000b\u0013c\n1YJ\b!$", "3qa<e\u0013>O\u0018\u0003\u0004`\u0010z\u00138C\n/\u0006M", "4nRBf,=B&z~e0\u0006\u000b\u0013c\n1YJ\b!$", "CmU<V<LS\u0018m\bZ0\u0004\r8gc&\u0006I^!\u001eQ|", "2hb.U3>R\b\fvb3\u0001\u00121I}2\u0005\u001e\u000b\u001e!T", "3qa<e\u001bKO\u001d\u0006~g.`\u00079n]2\u0003J\u000e", "4nRBf,=:\u0015{ze\n\u0007\u00109r", "CmU<V<LS\u0018ev[,\u0004f9l\n5", "2hb.U3>R\u007fzw^3Z\u00136o\r", "3qa<e\u0013:P\u0019\u0006Xh3\u0007\u0016", "4nRBf,=> zx^/\u0007\u0010.e\r\u0006\u0006G\u000b$", "CmU<V<LS\u0018i\u0002Z*|\f9l~(\t\u001e\u000b\u001e!T", "2hb.U3>R\u0004\u0006v\\,\u007f\u00136d\u007f5YJ\b!$", "3qa<e\u0017EO\u0017~}h3{\t<C\n/\u0006M", "4nRBf,=A)\n\u0006h9\f\r8gn(\u000fO^!\u001eQ|", "CmU<V<LS\u0018l\u000bi7\u0007\u0016>i\t*j@\u0014&tQv\u0018I", "2hb.U3>R\u0007\u000f\u0006i6\n\u00183n\u0002\u0017{S\u0010t!Ny\u001b", "3qa<e\u001aN^$\t\bm0\u0006\u000b\u001ee\u00137YJ\b!$", "4nRBf,=>&~{b?Z\u00136o\r", "CmU<V<LS\u0018i\b^-\u0001\u001c\ro\u00072\t", "2hb.U3>R\u0004\fz_0\u0010f9l\n5", "3qa<e\u0017KS\u001a\u0003\u000e<6\u0004\u0013<", "4nRBf,=A)\u007f{b?Z\u00136o\r", "CmU<V<LS\u0018l\u000b_-\u0001\u001c\ro\u00072\t", "2hb.U3>R\u0007\u000f{_0\u0010f9l\n5", "3qa<e\u001aNT\u001a\u0003\u000e<6\u0004\u0013<", "1n[<e:\u0006\u001e\u001c\u0003~l&G", "uI9\u0017=\u0011#8}c_E(\u0006\b<o\u0004'\u000f\n~!\u001fRy\u001c<@&?i\u0007\u001f3|\u001a8V\rJkG-^va@\u0007a;R\u00010\u0011;N?k@rD\u0014\u0010i\u0012X4j\u000f`K1|\u001a\u001c\u0004l\u0011.f Mepzr\u001aOU';t,^yZ&\u000eM+>D^,&*I&m\u000bl'`9Mm\u0012{!&r^.S\tc\u001a\u0002V\u0002g1%#\u0003C.Lmh\u001c)S9 X\u000b\u0003\u000fbs\u001b1e~/s@M24>o\u000fYgaFZ\b\u00159`=.s\u007f+\u0013RZDylE\rF)h\u0012\u001bp\u000b", "AsP?g", "Bn_", "3mS", "0ncAb4", "1n]AX5M>\u0015}yb5~P+9o-_OO", "uE5\u00139o%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`Hy\u001eEu!D]\b)\u0001t\u0012BWSJ5\u001f\u001a\u0014geB\tT(U\u0007'U\"", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class OutlinedTextFieldDefaults {
    public static final int $stable = 0;
    public static final OutlinedTextFieldDefaults INSTANCE = new OutlinedTextFieldDefaults();
    private static final float MinHeight = Dp.m6638constructorimpl(56);
    private static final float MinWidth = Dp.m6638constructorimpl(280);
    private static final float UnfocusedBorderThickness = Dp.m6638constructorimpl(1);
    private static final float FocusedBorderThickness = Dp.m6638constructorimpl(2);

    private OutlinedTextFieldDefaults() {
    }

    public final Shape getShape(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1066756961, "C729@37132L5:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1066756961, i2, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-shape> (TextFieldDefaults.kt:729)");
        }
        Shape value = ShapesKt.getValue(OutlinedTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m2364getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m2365getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    /* JADX INFO: renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m2366getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    /* JADX INFO: renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m2363getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* JADX INFO: renamed from: Container-4EFweAY, reason: not valid java name */
    public final void m2359Container4EFweAY(final boolean z2, final boolean z3, final InteractionSource interactionSource, Modifier modifier, TextFieldColors textFieldColors, Shape shape, float f2, float f3, Composer composer, final int i2, final int i3) {
        int i4;
        TextFieldColors textFieldColors2;
        float f4 = f3;
        float f5 = f2;
        Shape shape2 = shape;
        TextFieldColors textFieldColorsColors = textFieldColors;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1035477640);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Container)P(1,4,3,5!1,6,2:c#ui.unit.Dp,7:c#ui.unit.Dp)772@39024L8,773@39083L5,777@39264L25,779@39335L222,788@39599L198,792@39806L153:TextFieldDefaults.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((i2 & 6) == 0) {
            int i5 = composerStartRestartGroup.changed(z2) ? 4 : 2;
            i4 = (i5 + i2) - (i5 & i2);
        } else {
            i4 = i2;
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            int i6 = composerStartRestartGroup.changed(z3) ? 32 : 16;
            i4 = (i4 + i6) - (i4 & i6);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i7 = composerStartRestartGroup.changed(interactionSource) ? 256 : 128;
            i4 = (i4 + i7) - (i4 & i7);
        }
        int i8 = (-1) - (((-1) - i3) | ((-1) - 8));
        if (i8 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 3072));
        } else if ((i2 & 3072) == 0) {
            int i9 = composerStartRestartGroup.changed(companion) ? 2048 : 1024;
            i4 = (i4 + i9) - (i4 & i9);
        }
        if ((i2 & 24576) == 0) {
            int i10 = ((i3 & 16) == 0 && composerStartRestartGroup.changed(textFieldColorsColors)) ? 16384 : 8192;
            i4 = (i4 + i10) - (i4 & i10);
        }
        if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            i4 |= ((i3 & 32) == 0 && composerStartRestartGroup.changed(shape2)) ? 131072 : 65536;
        }
        if ((1572864 + i2) - (1572864 | i2) == 0) {
            i4 |= ((i3 + 64) - (i3 | 64) == 0 && composerStartRestartGroup.changed(f5)) ? 1048576 : 524288;
        }
        if ((-1) - (((-1) - 12582912) | ((-1) - i2)) == 0) {
            i4 |= ((i3 & 128) == 0 && composerStartRestartGroup.changed(f4)) ? 8388608 : 4194304;
        }
        if ((i3 & 256) != 0) {
            i4 |= 100663296;
        } else if ((-1) - (((-1) - i2) | ((-1) - 100663296)) == 0) {
            i4 |= composerStartRestartGroup.changed(this) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((-1) - (((-1) - 38347923) | ((-1) - i4)) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            textFieldColors2 = textFieldColorsColors;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i8 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i3 + 16) - (i3 | 16) != 0) {
                    int i11 = i4 >> 24;
                    textFieldColorsColors = colors(composerStartRestartGroup, (i11 + 14) - (i11 | 14));
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-57345)));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
                    shape2 = INSTANCE.getShape(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-458753)));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 64)) != 0) {
                    f5 = FocusedBorderThickness;
                    i4 = (i4 - 3670017) - (i4 | (-3670017));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 128)) != 0) {
                    f4 = UnfocusedBorderThickness;
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-29360129)));
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 16) != 0) {
                    i4 = (i4 - 57345) - (i4 | (-57345));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
                    i4 &= -458753;
                }
                if ((i3 & 64) != 0) {
                    i4 = (i4 - 3670017) - (i4 | (-3670017));
                }
                if ((i3 & 128) != 0) {
                    i4 &= -29360129;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1035477640, i4, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.Container (TextFieldDefaults.kt:776)");
            }
            int i12 = i4 >> 6;
            boolean zBooleanValue = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composerStartRestartGroup, 14 & i12).getValue().booleanValue();
            int i13 = ((-1) - (((-1) - (i4 >> 3)) | ((-1) - 7168))) | ((-1) - (((-1) - i4) | ((-1) - 126))) | ((-1) - (((-1) - 57344) | ((-1) - i12)));
            int i14 = (i12 + 458752) - (i12 | 458752);
            textFieldColors2 = textFieldColorsColors;
            State<BorderStroke> stateM3000animateBorderStrokeAsStateNuRrP5Q = TextFieldImplKt.m3000animateBorderStrokeAsStateNuRrP5Q(z2, z3, zBooleanValue, textFieldColors2, f5, f4, composerStartRestartGroup, (i13 + i14) - (i13 & i14));
            final State<Color> stateM451animateColorAsStateeuL9pac = SingleValueAnimationKt.m451animateColorAsStateeuL9pac(textFieldColors2.m2628containerColorXeAY9LY$material3_release(z2, z3, zBooleanValue), AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
            BoxKt.Box(TextFieldImplKt.textFieldBackground(BorderKt.border(companion, stateM3000animateBorderStrokeAsStateNuRrP5Q.getValue(), shape2), new TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0(new PropertyReference0Impl(stateM451animateColorAsStateeuL9pac) { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$Container$1
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((State) this.receiver).getValue();
                }
            }), shape2), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final float f6 = f5;
            final float f7 = f4;
            final Modifier modifier2 = companion;
            final TextFieldColors textFieldColors3 = textFieldColors2;
            final Shape shape3 = shape2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$Container$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i15) {
                    this.$tmp0_rcvr.m2359Container4EFweAY(z2, z3, interactionSource, modifier2, textFieldColors3, shape3, f6, f7, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))), i3);
                }
            });
        }
    }

    public final void DecorationBox(final String str, final Function2<? super Composer, ? super Integer, Unit> function2, final boolean z2, final boolean z3, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean z4, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, Function2<? super Composer, ? super Integer, Unit> function28, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function29, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function210;
        ComposableLambda composableLambdaRememberComposableLambda = function29;
        final TextFieldColors textFieldColorsColors = textFieldColors;
        Function2<? super Composer, ? super Integer, Unit> function211 = function27;
        PaddingValues paddingValuesM2358contentPaddinga9UjIt4$default = paddingValues;
        Function2<? super Composer, ? super Integer, Unit> function212 = function26;
        Function2<? super Composer, ? super Integer, Unit> function213 = function25;
        Function2<? super Composer, ? super Integer, Unit> function214 = function24;
        Function2<? super Composer, ? super Integer, Unit> function215 = function23;
        Function2<? super Composer, ? super Integer, Unit> function216 = function22;
        final boolean z5 = z4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-350442135);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DecorationBox)P(15,4,3,11,16,5,6,7,9,8,14,10,12,13!1,2)870@44562L8,872@44674L408,885@45099L709:TextFieldDefaults.kt#uh7d8r");
        if ((i4 + 1) - (i4 | 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i5 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function2) ? 32 : 16)));
        }
        if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i5 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i4 + 8) - (i4 | 8) != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 3072));
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            int i7 = composerStartRestartGroup.changed(z3) ? 2048 : 1024;
            i5 = (i5 + i7) - (i5 & i7);
        }
        int i8 = 8192;
        if ((i4 + 16) - (i4 | 16) != 0) {
            i5 |= 24576;
        } else if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(visualTransformation) ? 16384 : 8192)));
        }
        if ((i4 & 32) != 0) {
            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(interactionSource) ? 131072 : 65536)));
        }
        int i9 = (i4 + 64) - (i4 | 64);
        if (i9 != 0) {
            i5 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i5 |= composerStartRestartGroup.changed(z5) ? 1048576 : 524288;
        }
        int i10 = i4 & 128;
        if (i10 != 0) {
            i5 |= 12582912;
        } else if ((i2 + 12582912) - (i2 | 12582912) == 0) {
            int i11 = composerStartRestartGroup.changedInstance(function216) ? 8388608 : 4194304;
            i5 = (i5 + i11) - (i5 & i11);
        }
        int i12 = (-1) - (((-1) - i4) | ((-1) - 256));
        if (i12 != 0) {
            i5 |= 100663296;
        } else if ((-1) - (((-1) - i2) | ((-1) - 100663296)) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function215) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i13 = (i4 + 512) - (i4 | 512);
        if (i13 != 0) {
            i5 = (i5 + 805306368) - (i5 & 805306368);
        } else if ((i2 + 805306368) - (i2 | 805306368) == 0) {
            int i14 = composerStartRestartGroup.changedInstance(function214) ? 536870912 : 268435456;
            i5 = (i5 + i14) - (i5 & i14);
        }
        int i15 = (i4 + 1024) - (i4 | 1024);
        if (i15 != 0) {
            i6 = i3 | 6;
        } else if ((i3 + 6) - (i3 | 6) == 0) {
            i6 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changedInstance(function213) ? 4 : 2)));
        } else {
            i6 = i3;
        }
        int i16 = (-1) - (((-1) - i4) | ((-1) - 2048));
        if (i16 != 0) {
            i6 = (i6 + 48) - (i6 & 48);
        } else if ((i3 & 48) == 0) {
            int i17 = composerStartRestartGroup.changedInstance(function212) ? 32 : 16;
            i6 = (i6 + i17) - (i6 & i17);
        }
        int i18 = (-1) - (((-1) - i4) | ((-1) - 4096));
        if (i18 != 0) {
            i6 = (i6 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i6 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function211) ? 256 : 128;
        }
        int i19 = (i4 + 8192) - (i4 | 8192);
        if (i19 != 0) {
            i6 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function28) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            if ((-1) - (((-1) - i4) | ((-1) - 16384)) == 0 && composerStartRestartGroup.changed(textFieldColorsColors)) {
                i8 = 16384;
            }
            i6 = (i6 + i8) - (i6 & i8);
        }
        if ((i3 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i3 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i6 |= ((-1) - (((-1) - i4) | ((-1) - 32768)) == 0 && composerStartRestartGroup.changed(paddingValuesM2358contentPaddinga9UjIt4$default)) ? 131072 : 65536;
        }
        int i20 = (-1) - (((-1) - i4) | ((-1) - 65536));
        if (i20 != 0) {
            i6 = (i6 + 1572864) - (i6 & 1572864);
        } else if ((-1) - (((-1) - i3) | ((-1) - 1572864)) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changedInstance(composableLambdaRememberComposableLambda) ? 1048576 : 524288)));
        }
        if ((-1) - (((-1) - i4) | ((-1) - 131072)) != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 12582912));
        } else if ((i3 & 12582912) == 0) {
            int i21 = composerStartRestartGroup.changed(this) ? 8388608 : 4194304;
            i6 = (i6 + i21) - (i6 & i21);
        }
        if ((i5 + 306783379) - (306783379 | i5) == 306783378 && (4793491 & i6) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function210 = function28;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i9 != 0) {
                    z5 = false;
                }
                if (i10 != 0) {
                    function216 = null;
                }
                if (i12 != 0) {
                    function215 = null;
                }
                if (i13 != 0) {
                    function214 = null;
                }
                if (i15 != 0) {
                    function213 = null;
                }
                if (i16 != 0) {
                    function212 = null;
                }
                if (i18 != 0) {
                    function211 = null;
                }
                function210 = i19 == 0 ? function28 : null;
                if ((i4 & 16384) != 0) {
                    textFieldColorsColors = colors(composerStartRestartGroup, (-1) - (((-1) - (i6 >> 21)) | ((-1) - 14)));
                    i6 = (i6 - 57345) - (i6 | (-57345));
                }
                if ((i4 & 32768) != 0) {
                    paddingValuesM2358contentPaddinga9UjIt4$default = m2358contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    i6 = (-1) - (((-1) - i6) | ((-1) - (-458753)));
                }
                if (i20 != 0) {
                    composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i22) {
                            ComposerKt.sourceInformation(composer2, "C879@44918L5,873@44688L384:TextFieldDefaults.kt#uh7d8r");
                            if ((i22 + 3) - (3 | i22) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1448570018, i22, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:873)");
                                }
                                OutlinedTextFieldDefaults.INSTANCE.m2359Container4EFweAY(z2, z5, interactionSource, Modifier.Companion, textFieldColorsColors, OutlinedTextFieldDefaults.INSTANCE.getShape(composer2, 6), OutlinedTextFieldDefaults.INSTANCE.m2363getFocusedBorderThicknessD9Ej5fM(), OutlinedTextFieldDefaults.INSTANCE.m2366getUnfocusedBorderThicknessD9Ej5fM(), composer2, 114822144, 0);
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
                if ((-1) - (((-1) - i4) | ((-1) - 16384)) != 0) {
                    i6 = (i6 - 57345) - (i6 | (-57345));
                }
                if ((-1) - (((-1) - 32768) | ((-1) - i4)) != 0) {
                    i6 = (i6 - 458753) - (i6 | (-458753));
                }
                function210 = function28;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-350442135, i5, i6, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:884)");
            }
            TextFieldType textFieldType = TextFieldType.Outlined;
            int i22 = i5 << 3;
            int i23 = ((i22 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i22)) | 6;
            int i24 = (-1) - (((-1) - i22) | ((-1) - 896));
            int i25 = i5 >> 3;
            int i26 = i5 >> 9;
            int i27 = (-1) - (((-1) - ((((i24 + i23) - (i24 & i23)) | ((-1) - (((-1) - i25) | ((-1) - 7168)))) | ((-1) - (((-1) - i26) | ((-1) - 57344))))) & ((-1) - ((-1) - (((-1) - i26) | ((-1) - 458752)))));
            int i28 = (-1) - (((-1) - i26) | ((-1) - 3670016));
            int i29 = (i27 + i28) - (i27 & i28);
            int i30 = i6 << 21;
            int i31 = (i30 + 29360128) - (i30 | 29360128);
            int i32 = (i29 + i31) - (i29 & i31);
            int i33 = (i30 + 234881024) - (i30 | 234881024);
            int i34 = (i32 + i33) - (i32 & i33);
            int i35 = (-1) - (((-1) - i30) | ((-1) - 1879048192));
            int i36 = (i34 + i35) - (i34 & i35);
            int i37 = (-1) - (((-1) - ((-1) - (((-1) - (i5 & 896)) & ((-1) - ((-1) - (((-1) - ((-1) - (((-1) - (i6 >> 9)) | ((-1) - 14)))) & ((-1) - ((i5 >> 6) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)))))))) & ((-1) - (i26 & 7168)));
            int i38 = 57344 & i25;
            int i39 = (i37 + i38) - (i37 & i38);
            int i40 = (-1) - (((-1) - 458752) | ((-1) - i6));
            int i41 = (i39 + i40) - (i39 & i40);
            int i42 = (-1) - (((-1) - (i6 << 6)) | ((-1) - 3670016));
            TextFieldImplKt.CommonDecorationBox(textFieldType, str, function2, visualTransformation, function216, function215, function214, function213, function212, function211, function210, z3, z2, z5, interactionSource, paddingValuesM2358contentPaddinga9UjIt4$default, textFieldColorsColors, composableLambdaRememberComposableLambda, composerStartRestartGroup, i36, (-1) - (((-1) - ((i41 + i42) - (i41 & i42))) & ((-1) - ((i6 << 3) & 29360128))), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final boolean z6 = z5;
            final Function2<? super Composer, ? super Integer, Unit> function217 = function216;
            final Function2<? super Composer, ? super Integer, Unit> function218 = function215;
            final Function2<? super Composer, ? super Integer, Unit> function219 = function214;
            final Function2<? super Composer, ? super Integer, Unit> function220 = function213;
            final Function2<? super Composer, ? super Integer, Unit> function221 = function212;
            final Function2<? super Composer, ? super Integer, Unit> function222 = function211;
            final Function2<? super Composer, ? super Integer, Unit> function223 = function210;
            final TextFieldColors textFieldColors2 = textFieldColorsColors;
            final PaddingValues paddingValues2 = paddingValuesM2358contentPaddinga9UjIt4$default;
            final Function2<? super Composer, ? super Integer, Unit> function224 = composableLambdaRememberComposableLambda;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i43) {
                    OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.this;
                    String str2 = str;
                    Function2<Composer, Integer, Unit> function225 = function2;
                    boolean z7 = z2;
                    boolean z8 = z3;
                    VisualTransformation visualTransformation2 = visualTransformation;
                    InteractionSource interactionSource2 = interactionSource;
                    boolean z9 = z6;
                    Function2<Composer, Integer, Unit> function226 = function217;
                    Function2<Composer, Integer, Unit> function227 = function218;
                    Function2<Composer, Integer, Unit> function228 = function219;
                    Function2<Composer, Integer, Unit> function229 = function220;
                    Function2<Composer, Integer, Unit> function230 = function221;
                    Function2<Composer, Integer, Unit> function231 = function222;
                    Function2<Composer, Integer, Unit> function232 = function223;
                    TextFieldColors textFieldColors3 = textFieldColors2;
                    PaddingValues paddingValues3 = paddingValues2;
                    Function2<Composer, Integer, Unit> function233 = function224;
                    int i44 = i2;
                    outlinedTextFieldDefaults.DecorationBox(str2, function225, z7, z8, visualTransformation2, interactionSource2, z9, function226, function227, function228, function229, function230, function231, function232, textFieldColors3, paddingValues3, function233, composer2, RecomposeScopeImplKt.updateChangedFlags((i44 + 1) - (i44 & 1)), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                }
            });
        }
    }

    /* JADX INFO: renamed from: contentPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2358contentPaddinga9UjIt4$default(OutlinedTextFieldDefaults outlinedTextFieldDefaults, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((2 & i2) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 8) != 0) {
            f5 = TextFieldImplKt.getTextFieldPadding();
        }
        return outlinedTextFieldDefaults.m2362contentPaddinga9UjIt4(f2, f3, f4, f5);
    }

    /* JADX INFO: renamed from: contentPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2362contentPaddinga9UjIt4(float f2, float f3, float f4, float f5) {
        return PaddingKt.m1014PaddingValuesa9UjIt4(f2, f3, f4, f5);
    }

    public final TextFieldColors colors(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -471651810, "C(colors)921@46417L11,921@46429L30:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-471651810, i2, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:921)");
        }
        int i3 = i2 << 3;
        TextFieldColors defaultOutlinedTextFieldColors = getDefaultOutlinedTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i3 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i3 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultOutlinedTextFieldColors;
    }

    /* JADX INFO: renamed from: colors-0hiis_0, reason: not valid java name */
    public final TextFieldColors m2361colors0hiis_0(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, TextSelectionColors textSelectionColors, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, Composer composer, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        long jM4214getUnspecified0d7_KjU = j43;
        long jM4214getUnspecified0d7_KjU2 = j39;
        long jM4214getUnspecified0d7_KjU3 = j38;
        long jM4214getUnspecified0d7_KjU4 = j37;
        long jM4214getUnspecified0d7_KjU5 = j35;
        long jM4214getUnspecified0d7_KjU6 = j34;
        long jM4214getUnspecified0d7_KjU7 = j30;
        long jM4214getUnspecified0d7_KjU8 = j42;
        long jM4214getUnspecified0d7_KjU9 = j33;
        long jM4214getUnspecified0d7_KjU10 = j29;
        long jM4214getUnspecified0d7_KjU11 = j41;
        long jM4214getUnspecified0d7_KjU12 = j24;
        long jM4214getUnspecified0d7_KjU13 = j22;
        long jM4214getUnspecified0d7_KjU14 = j23;
        long jM4214getUnspecified0d7_KjU15 = j17;
        long jM4214getUnspecified0d7_KjU16 = j21;
        long jM4214getUnspecified0d7_KjU17 = j19;
        long jM4214getUnspecified0d7_KjU18 = j2;
        long jM4214getUnspecified0d7_KjU19 = j14;
        long jM4214getUnspecified0d7_KjU20 = j18;
        long jM4214getUnspecified0d7_KjU21 = j20;
        long jM4214getUnspecified0d7_KjU22 = j16;
        long jM4214getUnspecified0d7_KjU23 = j3;
        long jM4214getUnspecified0d7_KjU24 = j15;
        long jM4214getUnspecified0d7_KjU25 = j25;
        long jM4214getUnspecified0d7_KjU26 = j5;
        long jM4214getUnspecified0d7_KjU27 = j13;
        long jM4214getUnspecified0d7_KjU28 = j4;
        long jM4214getUnspecified0d7_KjU29 = j12;
        long jM4214getUnspecified0d7_KjU30 = j26;
        long jM4214getUnspecified0d7_KjU31 = j6;
        long jM4214getUnspecified0d7_KjU32 = j10;
        long jM4214getUnspecified0d7_KjU33 = j36;
        TextSelectionColors textSelectionColors2 = textSelectionColors;
        long jM4214getUnspecified0d7_KjU34 = j32;
        long jM4214getUnspecified0d7_KjU35 = j28;
        long jM4214getUnspecified0d7_KjU36 = j8;
        long jM4214getUnspecified0d7_KjU37 = j9;
        long jM4214getUnspecified0d7_KjU38 = j40;
        long jM4214getUnspecified0d7_KjU39 = j31;
        long jM4214getUnspecified0d7_KjU40 = j27;
        long jM4214getUnspecified0d7_KjU41 = j7;
        long jM4214getUnspecified0d7_KjU42 = j11;
        ComposerKt.sourceInformationMarkerStart(composer, 1767617725, "C(colors)P(30:c#ui.graphics.Color,41:c#ui.graphics.Color,9:c#ui.graphics.Color,20:c#ui.graphics.Color,23:c#ui.graphics.Color,34:c#ui.graphics.Color,2:c#ui.graphics.Color,12:c#ui.graphics.Color,0:c#ui.graphics.Color,13:c#ui.graphics.Color,32,22:c#ui.graphics.Color,33:c#ui.graphics.Color,1:c#ui.graphics.Color,11:c#ui.graphics.Color,25:c#ui.graphics.Color,36:c#ui.graphics.Color,4:c#ui.graphics.Color,15:c#ui.graphics.Color,31:c#ui.graphics.Color,42:c#ui.graphics.Color,10:c#ui.graphics.Color,21:c#ui.graphics.Color,24:c#ui.graphics.Color,35:c#ui.graphics.Color,3:c#ui.graphics.Color,14:c#ui.graphics.Color,26:c#ui.graphics.Color,37:c#ui.graphics.Color,5:c#ui.graphics.Color,16:c#ui.graphics.Color,29:c#ui.graphics.Color,40:c#ui.graphics.Color,8:c#ui.graphics.Color,19:c#ui.graphics.Color,27:c#ui.graphics.Color,38:c#ui.graphics.Color,6:c#ui.graphics.Color,17:c#ui.graphics.Color,28:c#ui.graphics.Color,39:c#ui.graphics.Color,7:c#ui.graphics.Color,18:c#ui.graphics.Color)1023@53240L11,1023@53252L30:TextFieldDefaults.kt#uh7d8r");
        if ((-1) - (((-1) - i7) | ((-1) - 1)) != 0) {
            jM4214getUnspecified0d7_KjU18 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i7 + 2) - (i7 | 2) != 0) {
            jM4214getUnspecified0d7_KjU23 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i7 + 4) - (i7 | 4) != 0) {
            jM4214getUnspecified0d7_KjU28 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i7 & 8) != 0) {
            jM4214getUnspecified0d7_KjU26 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i7 & 16) != 0) {
            jM4214getUnspecified0d7_KjU31 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i7 + 32) - (i7 | 32) != 0) {
            jM4214getUnspecified0d7_KjU41 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i7 & 64) != 0) {
            jM4214getUnspecified0d7_KjU36 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i7) | ((-1) - 128)) != 0) {
            jM4214getUnspecified0d7_KjU37 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i7 + 256) - (i7 | 256) != 0) {
            jM4214getUnspecified0d7_KjU32 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i7 & 512) != 0) {
            jM4214getUnspecified0d7_KjU42 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i7 & 1024) != 0) {
            textSelectionColors2 = null;
        }
        if ((i7 & 2048) != 0) {
            jM4214getUnspecified0d7_KjU29 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i7 & 4096) != 0) {
            jM4214getUnspecified0d7_KjU27 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i7) | ((-1) - 8192)) != 0) {
            jM4214getUnspecified0d7_KjU19 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i7 + 16384) - (i7 | 16384) != 0) {
            jM4214getUnspecified0d7_KjU24 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((32768 & i7) != 0) {
            jM4214getUnspecified0d7_KjU22 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - 65536) | ((-1) - i7)) != 0) {
            jM4214getUnspecified0d7_KjU15 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((131072 + i7) - (131072 | i7) != 0) {
            jM4214getUnspecified0d7_KjU20 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((262144 & i7) != 0) {
            jM4214getUnspecified0d7_KjU17 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((524288 + i7) - (524288 | i7) != 0) {
            jM4214getUnspecified0d7_KjU21 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - 1048576) | ((-1) - i7)) != 0) {
            jM4214getUnspecified0d7_KjU16 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - 2097152) | ((-1) - i7)) != 0) {
            jM4214getUnspecified0d7_KjU13 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((4194304 & i7) != 0) {
            jM4214getUnspecified0d7_KjU14 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((8388608 & i7) != 0) {
            jM4214getUnspecified0d7_KjU12 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - 16777216) | ((-1) - i7)) != 0) {
            jM4214getUnspecified0d7_KjU25 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((33554432 & i7) != 0) {
            jM4214getUnspecified0d7_KjU30 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL + i7) - (67108864 | i7) != 0) {
            jM4214getUnspecified0d7_KjU40 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((134217728 & i7) != 0) {
            jM4214getUnspecified0d7_KjU35 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((268435456 + i7) - (268435456 | i7) != 0) {
            jM4214getUnspecified0d7_KjU10 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((536870912 + i7) - (536870912 | i7) != 0) {
            jM4214getUnspecified0d7_KjU7 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i7) | ((-1) - 1073741824)) != 0) {
            jM4214getUnspecified0d7_KjU39 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i8 & 1) != 0) {
            jM4214getUnspecified0d7_KjU34 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i8 + 2) - (i8 | 2) != 0) {
            jM4214getUnspecified0d7_KjU9 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i8 + 4) - (i8 | 4) != 0) {
            jM4214getUnspecified0d7_KjU6 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i8 & 8) != 0) {
            jM4214getUnspecified0d7_KjU5 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i8 & 16) != 0) {
            jM4214getUnspecified0d7_KjU33 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i8 & 32) != 0) {
            jM4214getUnspecified0d7_KjU4 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i8 & 64) != 0) {
            jM4214getUnspecified0d7_KjU3 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i8 & 128) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i8 & 256) != 0) {
            jM4214getUnspecified0d7_KjU38 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i8 + 512) - (i8 | 512) != 0) {
            jM4214getUnspecified0d7_KjU11 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i8 & 1024) != 0) {
            jM4214getUnspecified0d7_KjU8 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i8 & 2048) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1767617725, i2, i3, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1023)");
        }
        int i9 = i6 >> 6;
        TextFieldColors textFieldColorsM2629copyejIjP34 = getDefaultOutlinedTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i9 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i9 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)).m2629copyejIjP34(jM4214getUnspecified0d7_KjU18, jM4214getUnspecified0d7_KjU23, jM4214getUnspecified0d7_KjU28, jM4214getUnspecified0d7_KjU26, jM4214getUnspecified0d7_KjU31, jM4214getUnspecified0d7_KjU41, jM4214getUnspecified0d7_KjU36, jM4214getUnspecified0d7_KjU37, jM4214getUnspecified0d7_KjU32, jM4214getUnspecified0d7_KjU42, textSelectionColors2, jM4214getUnspecified0d7_KjU29, jM4214getUnspecified0d7_KjU27, jM4214getUnspecified0d7_KjU19, jM4214getUnspecified0d7_KjU24, jM4214getUnspecified0d7_KjU22, jM4214getUnspecified0d7_KjU15, jM4214getUnspecified0d7_KjU20, jM4214getUnspecified0d7_KjU17, jM4214getUnspecified0d7_KjU21, jM4214getUnspecified0d7_KjU16, jM4214getUnspecified0d7_KjU13, jM4214getUnspecified0d7_KjU14, jM4214getUnspecified0d7_KjU12, jM4214getUnspecified0d7_KjU25, jM4214getUnspecified0d7_KjU30, jM4214getUnspecified0d7_KjU40, jM4214getUnspecified0d7_KjU35, jM4214getUnspecified0d7_KjU10, jM4214getUnspecified0d7_KjU7, jM4214getUnspecified0d7_KjU39, jM4214getUnspecified0d7_KjU34, jM4214getUnspecified0d7_KjU9, jM4214getUnspecified0d7_KjU6, jM4214getUnspecified0d7_KjU5, jM4214getUnspecified0d7_KjU33, jM4214getUnspecified0d7_KjU4, jM4214getUnspecified0d7_KjU3, jM4214getUnspecified0d7_KjU2, jM4214getUnspecified0d7_KjU38, jM4214getUnspecified0d7_KjU11, jM4214getUnspecified0d7_KjU8, jM4214getUnspecified0d7_KjU);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return textFieldColorsM2629copyejIjP34;
    }

    public final TextFieldColors getDefaultOutlinedTextFieldColors(ColorScheme colorScheme, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -292363577, "C:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-292363577, i2, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-defaultOutlinedTextFieldColors> (TextFieldDefaults.kt:1071)");
        }
        TextFieldColors defaultOutlinedTextFieldColorsCached$material3_release = colorScheme.getDefaultOutlinedTextFieldColorsCached$material3_release();
        composer.startReplaceGroup(1540400102);
        ComposerKt.sourceInformation(composer, "*1086@57012L7");
        if (defaultOutlinedTextFieldColorsCached$material3_release == null) {
            long jFromToken = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusInputColor());
            long jFromToken2 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputColor());
            long jM4177copywmQWz5c$default = Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            long jFromToken3 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorInputColor());
            long jM4213getTransparent0d7_KjU = Color.Companion.m4213getTransparent0d7_KjU();
            long jM4213getTransparent0d7_KjU2 = Color.Companion.m4213getTransparent0d7_KjU();
            long jM4213getTransparent0d7_KjU3 = Color.Companion.m4213getTransparent0d7_KjU();
            long jM4213getTransparent0d7_KjU4 = Color.Companion.m4213getTransparent0d7_KjU();
            long jFromToken4 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getCaretColor());
            long jFromToken5 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorFocusCaretColor());
            ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localTextSelectionColors);
            ComposerKt.sourceInformationMarkerEnd(composer);
            defaultOutlinedTextFieldColorsCached$material3_release = new TextFieldColors(jFromToken, jFromToken2, jM4177copywmQWz5c$default, jFromToken3, jM4213getTransparent0d7_KjU, jM4213getTransparent0d7_KjU2, jM4213getTransparent0d7_KjU3, jM4213getTransparent0d7_KjU4, jFromToken4, jFromToken5, (TextSelectionColors) objConsume, ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusOutlineColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getOutlineColor()), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledOutlineColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorOutlineColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getLeadingIconColor()), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledLeadingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getTrailingIconColor()), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledTrailingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusLabelColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getLabelColor()), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledLabelColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorLabelColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor()), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusSupportingColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getSupportingColor()), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledSupportingColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorSupportingColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor()), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor()), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor()), null);
            colorScheme.setDefaultOutlinedTextFieldColorsCached$material3_release(defaultOutlinedTextFieldColorsCached$material3_release);
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultOutlinedTextFieldColorsCached$material3_release;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e6  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "\u0015K\n6~y\u0019\u0017lVgie)8WjQ\r\u001b\n\u0001 8\u007fKzn2y*g}XxU\u001b?wGZ\u001f<H\u0017h", replaceWith = @kotlin.ReplaceWith(expression = "Container(\n    enabled = enabled,\n    isError = isError,\n    interactionSource = interactionSource,\n    colors = colors,\n    shape = shape,\n    focusedBorderThickness = focusedBorderThickness,\n    unfocusedBorderThickness = unfocusedBorderThickness,\n)", imports = {}))
    @yg.InterfaceC1492Gx
    /* JADX INFO: renamed from: ContainerBox-nbWgWpA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2360ContainerBoxnbWgWpA(final boolean r26, final boolean r27, final androidx.compose.foundation.interaction.InteractionSource r28, androidx.compose.material3.TextFieldColors r29, androidx.compose.ui.graphics.Shape r30, float r31, float r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instruction units count: 715
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldDefaults.m2360ContainerBoxnbWgWpA(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }
}
