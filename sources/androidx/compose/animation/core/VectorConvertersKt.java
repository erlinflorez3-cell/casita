package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.ranges.RangesKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:254)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: VectorConverters.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яė\u0014D߬)\u001e\u007f\u007fLDyt\fA\u001c0\u0013ǞJ~8,\u001aw\u001dfrˎ8DsM6ɟ[*%k\u0004é,[:qKП]\u001a\f(\u0011ѧVg}nRҙ\u0013C%\u0006\u001ex\u0001,Qǁ\u0001](\u000f:ԏw?IMw=?`|6\u001b :Ĳ@y\u001b\u0001\"ݒP\u0010\rzKŷ\u0014\u0012F@xíZ\rc\u0005\"Ň\u000e>6\u0001&ձoNLHtҗB/9\u0003qBT)g0\u0013M\u0015Ͽ\\'#vi\u001e1DO}#Mk\u000f\u0017Tk?Ih\u0002?\u0015hmQYH\u0014Y<ݙ\u000e=51U\fk\u001dN\\3|\u0011\u001c5Wgo[R\u001e(>$\f\u000fL\u0004T0Uu^=(\u0015 \u001aCv\u0003S\u0007z\u0012`R\u007fA\u000bdD=\u001eAZQ\u001b\u0015W\u0012?'~O{3\u0013N'\u000f 9[\u0003\u0014\u0011\u0019)\u0007\u0010Q_W\u0007׀hf\u0018ԯUy\u0014rr\u0002X\u0004@I\u0010/*\u0012\\\u0016{ڞ]ޠ'!sȵh\\ux\u001dlxUyRvC2p&7X\r:Y\u001bߢ\u0007\u07fbTT`\u008c1e*Y\u001f\n\u0018\u00150\\&B1' N}l\u0018i$έ\fɻ3f?ժ\u000f\u0004\u001c^QjC7ac>ibx$?jc3W=̾U۱^\\0ίR`x\u0019\u0010\bTP\u001c\u0013`I\u0002\u001eD,_\u001a\u000b\u0014\u001fҔ նE|\u0011ݠz\u0001\u001e\nl?4\u0005y$#\u0015\u0011Rlp\u001ek'H\u0003ʌbĘ1AYځ9>c/\u0001@\r%\u0017~\"\u000eWi\\GzmDt,ݫ\"ک\u001e9Yǽ]+\u001d\u000eA>\u0012/UL!uaO\"')\u000e(\u000e\u0012ß0Թ\fjxݚ\u0001\u0003Xal#2xnrQ\u001bt\u0002\nat{ub+ޯ]ƏMr\u000bʛ\\mF\u0011\u001d+.'\u0011oP\u000bE/S'K\u0017&\u0013W\u0015\u0010r 4Ц}f'(z{\u0012C\u00045}viiB=HI\b\u000fN$4l1Svi \bp!jQάLE|r\\N[$O\u001dt\u001bD\u0019\u0001Xk:A\u0003\u000e6>_Xtq|<^q?G\u0012Ϭkq\u0006Mb!X***\nE\u0007\u001e,?0V\u0006e\u00192\u0016sF:o:\u000b\u0005j%Zxʙ@\f#EZ\u007f\u0014-\u001b\u001fTs'#BD\u0004;\u0005\u000edzlVv\u0006\u000fD\t!X\u001f5Sʟ\"|M3\u000b\u0004TsO\u0003@\u0015k)\u0019\u001dzO-n5-TTg\u001cVW)\u000bs}y\u000eΜ:\b_+s\u0002}-X7\u000b1Z$+;a\u0011\u000e\u0001@`\u001bU\u0013O\u0013u:f\u0001pXmΉ~\u0001&>\u0010%\u0019<o\u0012}vEX^yGCH\u0007'F9\u0007:\u0001\u0012EC-4Yc\u0002ƹn\u0018?}]iI#(?.;\u001c\u00011^g\u000e\u0015\u0016m\u001dJ\u0016 \u001a\u0011\u00011\u0013~F:rؠxv\"0\u000eL])ט\u0006F"}, d2 = {"\u0012o>3Y:>b\b\tk^*\f\u0013<", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fIw\b*a!EtE\u001e\"waF\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lG`&6g}/\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFSB\u0002", "\u0012oC<I,<b#\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFRB\u0002", "\u0014k^.g\u001bHD\u0019|\nh9", "", "\u0017mc\u001cY-LS(m\u0005O,z\u00189r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "\u0017mc \\A>B#oz\\;\u0007\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "\u0017mc!b\u001d>Q(\t\b", "", "\u001deU@X;-]\n~xm6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", " dRAG6/S\u0017\u000e\u0005k", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFUB\u0002", "!hi2G6/S\u0017\u000e\u0005k", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "$dRAb9\u001c]\"\u0010zk;|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|T\fWKFg=\"\u001fq7", "5dc#X*M]&\\\u0005g=|\u0016>e\r", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~C~!Em%l+MCv0'\u0019rj\u000fJJ(Wu4QPM?&P|E\u001f\u001ch\u000e\u0018'\u0016\ta=3rN@h\u00066V\u0002\u0005W\u0013\u0016\b\nIHzKg\u0010T\t\u0015\u0003\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/uK 6X?Do>'j", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~F}\u001eF,s8UN7t8(\u001e>% \u0003l+[\u0001+F_\u0018*fZ}G\"\u0012$\nW/\u0015\u0001hE.w\u000e5)\u0015,\u0013pMrr\b*k?s\u0002Bc\u001fG\u0007j", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 uK 6X?Do>'j", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~G\u000257,s8UN7t8(\u001e>% \u0003l+[\u0001+F_\u0018*fZ}G\"\u0012$\nW/\u0015\u0001hE.w\u000e5)\u0015,\u0013pMrr\b*k?s\u0002Bc\u001fG\u0007j", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lG5\u0003?a\t\u001c@q 7#", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001b\u0002c\u0013c\u0006+3v\u001a8V\u0019~R0'\u0014uk=\u0006vuL\u0001/RV\\,&N{A\u001c\u000ei\u0012X4V\u0003cN$83I)y(]_Eq\u0012\f#\u001d5wF", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lG`&6g}/uK 6X?Do>'j", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001b\u0002\u000f6Z\f F,s8UN7t8(\u001e>% \u0003l+[\u0001+F_\u0018*fZ}G\"\u0012$\nW/\u0015\u0001hE.w\u000e5)\u0015,\u0013pMrr\b*k?s\u0002Bc\u001fG\u0007j", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f F,s8UN7t8(\u001e>", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W \u007f4\u001fZ~.7|T\fWKFg=\"\u001fq7|m_5M\u00041KKauZ\\zH\u001e ZWJ4\u0011\rUP(xM\u0001\u001d\u00129IK*z\u000b}\u0012\"\u0013tySV\u001dVy\"K", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}^\u0015w\u001e9IL?u=s", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W \u007f4#]\u0013 uK 6X?Do>'j,H5\u0010b9Xz&Z\u0016L6d]|K\u0014[V\u0017R3\t\u0014]K-8BA,\bu8\u0014EZ| s\u0018>{pOe\u0010TO", "\u001aj^A_0G\u001dy\u0006\u0005Z;;f9m\u000b$\u0005D\u000b l", "uKZ<g3B\\b\u0004\ffu\u0001\u0012>e\r1wGJw\u001eQk\u001d\u001a\u0001-@U\u0007$Av\u007f+RC9z\na{dj8\u0014m0M\npEVV7f`r\u0007\u0010\u001b^\u0016J:\u0011\u000fb\u000b\"xQ7hv>Ss7|^\u0016\u001f\u001f5w\u007fBce", "\u001aj^A_0G\u001d|\b\n\u001d\n\u0007\u0011:a\t,\u0006IV", "uKZ<g3B\\b\u0004\ffu\u0001\u0012>e\r1wGJz VM\u0018D\u0002!>]\b)!j\u001b.KR\u0011/\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001cnF\u0018\u001aV\u001dR5\u0016NWK1n\u000e&1\u0012\u001eE\u0016\u0019r\n\u001d\u0016\u001bDj}\u0018", "\"v^$T@\u001c]\"\u0010zk;|\u0016", "\"", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "1n]CX9MB#oz\\;\u0007\u0016", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "1n]CX9M4&\t\u0003O,z\u00189r", ":da=", "AsP?g", "As^=", "4qP0g0H\\", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class VectorConvertersKt {
    private static final TwoWayConverter<Float, AnimationVector1D> FloatToVector = TwoWayConverter(new Function1<Float, AnimationVector1D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$FloatToVector$1
        public final AnimationVector1D invoke(float f2) {
            return new AnimationVector1D(f2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVector1D invoke(Float f2) {
            return invoke(f2.floatValue());
        }
    }, new Function1<AnimationVector1D, Float>() { // from class: androidx.compose.animation.core.VectorConvertersKt$FloatToVector$2
        @Override // kotlin.jvm.functions.Function1
        public final Float invoke(AnimationVector1D animationVector1D) {
            return Float.valueOf(animationVector1D.getValue());
        }
    });
    private static final TwoWayConverter<Integer, AnimationVector1D> IntToVector = TwoWayConverter(new Function1<Integer, AnimationVector1D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntToVector$1
        public final AnimationVector1D invoke(int i2) {
            return new AnimationVector1D(i2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVector1D invoke(Integer num) {
            return invoke(num.intValue());
        }
    }, new Function1<AnimationVector1D, Integer>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntToVector$2
        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(AnimationVector1D animationVector1D) {
            return Integer.valueOf((int) animationVector1D.getValue());
        }
    });
    private static final TwoWayConverter<Dp, AnimationVector1D> DpToVector = TwoWayConverter(new Function1<Dp, AnimationVector1D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpToVector$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVector1D invoke(Dp dp) {
            return m530invoke0680j_4(dp.m6652unboximpl());
        }

        /* JADX INFO: renamed from: invoke-0680j_4, reason: not valid java name */
        public final AnimationVector1D m530invoke0680j_4(float f2) {
            return new AnimationVector1D(f2);
        }
    }, new Function1<AnimationVector1D, Dp>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpToVector$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Dp invoke(AnimationVector1D animationVector1D) {
            return Dp.m6636boximpl(m531invokeu2uoSUM(animationVector1D));
        }

        /* JADX INFO: renamed from: invoke-u2uoSUM, reason: not valid java name */
        public final float m531invokeu2uoSUM(AnimationVector1D animationVector1D) {
            return Dp.m6638constructorimpl(animationVector1D.getValue());
        }
    });
    private static final TwoWayConverter<DpOffset, AnimationVector2D> DpOffsetToVector = TwoWayConverter(new Function1<DpOffset, AnimationVector2D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpOffsetToVector$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVector2D invoke(DpOffset dpOffset) {
            return m528invokejoFl9I(dpOffset.m6707unboximpl());
        }

        /* JADX INFO: renamed from: invoke-jo-Fl9I, reason: not valid java name */
        public final AnimationVector2D m528invokejoFl9I(long j2) {
            return new AnimationVector2D(DpOffset.m6699getXD9Ej5fM(j2), DpOffset.m6701getYD9Ej5fM(j2));
        }
    }, new Function1<AnimationVector2D, DpOffset>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpOffsetToVector$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ DpOffset invoke(AnimationVector2D animationVector2D) {
            return DpOffset.m6693boximpl(m529invokegVRvYmI(animationVector2D));
        }

        /* JADX INFO: renamed from: invoke-gVRvYmI, reason: not valid java name */
        public final long m529invokegVRvYmI(AnimationVector2D animationVector2D) {
            return DpKt.m6659DpOffsetYgX7TsA(Dp.m6638constructorimpl(animationVector2D.getV1()), Dp.m6638constructorimpl(animationVector2D.getV2()));
        }
    });
    private static final TwoWayConverter<Size, AnimationVector2D> SizeToVector = TwoWayConverter(new Function1<Size, AnimationVector2D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$SizeToVector$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVector2D invoke(Size size) {
            return m538invokeuvyYCjk(size.m4011unboximpl());
        }

        /* JADX INFO: renamed from: invoke-uvyYCjk, reason: not valid java name */
        public final AnimationVector2D m538invokeuvyYCjk(long j2) {
            return new AnimationVector2D(Size.m4006getWidthimpl(j2), Size.m4003getHeightimpl(j2));
        }
    }, new Function1<AnimationVector2D, Size>() { // from class: androidx.compose.animation.core.VectorConvertersKt$SizeToVector$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Size invoke(AnimationVector2D animationVector2D) {
            return Size.m3994boximpl(m539invoke7Ah8Wj8(animationVector2D));
        }

        /* JADX INFO: renamed from: invoke-7Ah8Wj8, reason: not valid java name */
        public final long m539invoke7Ah8Wj8(AnimationVector2D animationVector2D) {
            return SizeKt.Size(animationVector2D.getV1(), animationVector2D.getV2());
        }
    });
    private static final TwoWayConverter<Offset, AnimationVector2D> OffsetToVector = TwoWayConverter(new Function1<Offset, AnimationVector2D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$OffsetToVector$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVector2D invoke(Offset offset) {
            return m536invokek4lQ0M(offset.m3947unboximpl());
        }

        /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final AnimationVector2D m536invokek4lQ0M(long j2) {
            return new AnimationVector2D(Offset.m3937getXimpl(j2), Offset.m3938getYimpl(j2));
        }
    }, new Function1<AnimationVector2D, Offset>() { // from class: androidx.compose.animation.core.VectorConvertersKt$OffsetToVector$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Offset invoke(AnimationVector2D animationVector2D) {
            return Offset.m3926boximpl(m537invoketuRUvjQ(animationVector2D));
        }

        /* JADX INFO: renamed from: invoke-tuRUvjQ, reason: not valid java name */
        public final long m537invoketuRUvjQ(AnimationVector2D animationVector2D) {
            return OffsetKt.Offset(animationVector2D.getV1(), animationVector2D.getV2());
        }
    });
    private static final TwoWayConverter<IntOffset, AnimationVector2D> IntOffsetToVector = TwoWayConverter(new Function1<IntOffset, AnimationVector2D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntOffsetToVector$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVector2D invoke(IntOffset intOffset) {
            return m532invokegyyYBs(intOffset.m6775unboximpl());
        }

        /* JADX INFO: renamed from: invoke--gyyYBs, reason: not valid java name */
        public final AnimationVector2D m532invokegyyYBs(long j2) {
            return new AnimationVector2D(IntOffset.m6766getXimpl(j2), IntOffset.m6767getYimpl(j2));
        }
    }, new Function1<AnimationVector2D, IntOffset>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntOffsetToVector$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IntOffset invoke(AnimationVector2D animationVector2D) {
            return IntOffset.m6757boximpl(m533invokeBjo55l4(animationVector2D));
        }

        /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
        public final long m533invokeBjo55l4(AnimationVector2D animationVector2D) {
            return IntOffsetKt.IntOffset(Math.round(animationVector2D.getV1()), Math.round(animationVector2D.getV2()));
        }
    });
    private static final TwoWayConverter<IntSize, AnimationVector2D> IntSizeToVector = TwoWayConverter(new Function1<IntSize, AnimationVector2D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntSizeToVector$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVector2D invoke(IntSize intSize) {
            return m534invokeozmzZPI(intSize.m6812unboximpl());
        }

        /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
        public final AnimationVector2D m534invokeozmzZPI(long j2) {
            return new AnimationVector2D(IntSize.m6808getWidthimpl(j2), IntSize.m6807getHeightimpl(j2));
        }
    }, new Function1<AnimationVector2D, IntSize>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntSizeToVector$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IntSize invoke(AnimationVector2D animationVector2D) {
            return IntSize.m6800boximpl(m535invokeYEO4UFw(animationVector2D));
        }

        /* JADX INFO: renamed from: invoke-YEO4UFw, reason: not valid java name */
        public final long m535invokeYEO4UFw(AnimationVector2D animationVector2D) {
            return IntSizeKt.IntSize(RangesKt.coerceAtLeast(Math.round(animationVector2D.getV1()), 0), RangesKt.coerceAtLeast(Math.round(animationVector2D.getV2()), 0));
        }
    });
    private static final TwoWayConverter<Rect, AnimationVector4D> RectToVector = TwoWayConverter(new Function1<Rect, AnimationVector4D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$RectToVector$1
        @Override // kotlin.jvm.functions.Function1
        public final AnimationVector4D invoke(Rect rect) {
            return new AnimationVector4D(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        }
    }, new Function1<AnimationVector4D, Rect>() { // from class: androidx.compose.animation.core.VectorConvertersKt$RectToVector$2
        @Override // kotlin.jvm.functions.Function1
        public final Rect invoke(AnimationVector4D animationVector4D) {
            return new Rect(animationVector4D.getV1(), animationVector4D.getV2(), animationVector4D.getV3(), animationVector4D.getV4());
        }
    });

    public static final float lerp(float f2, float f3, float f4) {
        return (f2 * (1 - f4)) + (f3 * f4);
    }

    public static final <T, V extends AnimationVector> TwoWayConverter<T, V> TwoWayConverter(Function1<? super T, ? extends V> function1, Function1<? super V, ? extends T> function12) {
        return new TwoWayConverterImpl(function1, function12);
    }

    public static final TwoWayConverter<Float, AnimationVector1D> getVectorConverter(FloatCompanionObject floatCompanionObject) {
        return FloatToVector;
    }

    public static final TwoWayConverter<Integer, AnimationVector1D> getVectorConverter(IntCompanionObject intCompanionObject) {
        return IntToVector;
    }

    public static final TwoWayConverter<Rect, AnimationVector4D> getVectorConverter(Rect.Companion companion) {
        return RectToVector;
    }

    public static final TwoWayConverter<Dp, AnimationVector1D> getVectorConverter(Dp.Companion companion) {
        return DpToVector;
    }

    public static final TwoWayConverter<DpOffset, AnimationVector2D> getVectorConverter(DpOffset.Companion companion) {
        return DpOffsetToVector;
    }

    public static final TwoWayConverter<Size, AnimationVector2D> getVectorConverter(Size.Companion companion) {
        return SizeToVector;
    }

    public static final TwoWayConverter<Offset, AnimationVector2D> getVectorConverter(Offset.Companion companion) {
        return OffsetToVector;
    }

    public static final TwoWayConverter<IntOffset, AnimationVector2D> getVectorConverter(IntOffset.Companion companion) {
        return IntOffsetToVector;
    }

    public static final TwoWayConverter<IntSize, AnimationVector2D> getVectorConverter(IntSize.Companion companion) {
        return IntSizeToVector;
    }
}
