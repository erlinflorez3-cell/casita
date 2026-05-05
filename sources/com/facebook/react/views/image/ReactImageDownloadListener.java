package com.facebook.react.views.image;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.drawable.ForwardingDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&˛\bDZc|\u0004W\u00068\u000b4B\u0007\":\u0012\u007fјnjG<L͜P.`T2\u000fq|<$q$yCAX\"}0\u0012WȞog|Pb\u000bI\u0013\u000e\u0016\u0007̓4I[yc %˰`\fg5SڎK8\u0011td\u0005P82:\n\u0005G\u0019XIHv\u0017`\f\u000fܘ4@~<\u001b#[\b2\u00124BP\u0005,a\u007fNdN\u001daH6;\u0003\u0018J\u0015;(W\u000bV%F\u0003+=zo#C@e;E+a\r\u001fTq>9ӊ\"C\u0013s?)AH\"c|lÿ\u0018\u00159\\Us\u00014t\u0005\u007fd<+9T{K~\u0014X{\t\u0003%<2\u0016L;\u0011K;)~\b<7%vaEh\u0002\rH0\u0001o@/'\u00162aݍazЂe;'^\u007f\n\u0013\u001e6#/\u0001Q_b!x\u0015Ih>cygNR`N8]mq\u0012\u0007z\u0002X\u0018`K\u000eF\u0014\u0011\\+kK$G19\u0004\u0002vH\u0018z\u0013e\u0001S\u0018X\u000fTj\u0007$PB\t:^th\u0013phT\u00072AS*n\u001f\u007f\u001e\u0012Nw>Pǂ)."}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5#j 3k%\u0012U?=k\u0013('qhC\u0003b\u0013R\u00056GUN92", "\u0017M5\u001c", "\u001ab^:\"-:Q\u0019{\u0005h2F\b<a\u0012({\n\u007f$\u0013Yk\u000bCvn\u0016c\u000b23z\u00152VE\u001ax00\u0011eh9\\", "\u001ab^:\"-:Q\u0019{\u0005h2F\b<a\u0012({\n~! V|\u0018C}%B#[*@|#8TJ;x\u001b\"#waB\u0007p\u0002", "u(E", "=m5.\\3N`\u0019", "", "7c", "", "Bga<j(;Z\u0019", "", "=m56a(E7!z|^\u001a|\u0018", "7lP4X\u0010GT#", "/mX:T;:P ~", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI'\t<\u0013\u0013\u0014NoW\u0018\u007f)=U\r\u001c4t\u0016\u0004", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015IL:x>\"\u00142cF\u0003n/Rt5\u0011K[(nNoD\u0014[6\u0017R3\t\u0014U>+n\u001az\u0010", "=m8;g,K[\u0019}~Z;|l7a\u0002(\\<\u0005\u001e\u0017F", "=m8;g,K[\u0019}~Z;|l7a\u0002(i@\u0010", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq>", "=m;2i,E1\u001cz\u0004`,", "", ":de2_", "", "=m??b.KS'\rXa(\u0006\u000b/", ":nP1X+", "Bnc._", "=mA2_,:a\u0019", "=mBBU4Bb", "1`[9X9\u001c]\"\u000ezq;", "", "\u0011n\\=T5B]\"", "\u0013l_Al\u000bKO+zwe,", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public class ReactImageDownloadListener<INFO> extends ForwardingDrawable implements ControllerListener<INFO> {
    public static final Companion Companion = new Companion(null);
    private static final int MAX_LEVEL = 10000;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٨lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5#j 3k%\u0012U?=k\u0013('qhC\u0003b\u0013R\u00056GUN9\u001b0|E\u001f\u000ec\u0012X4b", "", "u(E", "\u001b@G,?\f/3\u007f", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjG6LeN0ZS@\u000fsڔ:$qҕ\"CiTZ\u0001̀\rO\\g0|X[#C=\bF|x/aU'aX#zH}DKM\u001eC\u007ft=D\u0013'J\"f{5\u0005(2`\u0010%\u0001\n_T\">I\t:\u0001\u000f}\u000b(\u001c\u001e@6\u007fLg.bɍLx"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5#j 3k%\u0012U?=k\u0013('qhC\u0003b\u0013R\u00056GUN9\u001b2zH#&9\u001bJ=\t\u0002`Ay", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI'\t<\u0013\u0013\u0014NoW\u001b\u0004!GUz'7C", "u(E", "2qPD", "", "1`]CT:", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", "5dc\u001cc(<W(\u0013", "", "Adc\u000e_7AO", "/k_5T", "Adc\u0010b3H`y\u0003\u0002m,\n", "1n[<e\rBZ(~\b", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006\u0006G\u000b$wKv\u001d<\u0004z", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class EmptyDrawable extends Drawable {
        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i2) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public ReactImageDownloadListener() {
        super(new EmptyDrawable());
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onFailure(String id, Throwable throwable) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onFinalImageSet(String id, INFO info, Animatable animatable) {
        Intrinsics.checkNotNullParameter(id, "id");
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onIntermediateImageFailed(String id, Throwable throwable) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onIntermediateImageSet(String id, INFO info) {
        Intrinsics.checkNotNullParameter(id, "id");
    }

    @Override // com.facebook.drawee.drawable.ForwardingDrawable, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        onProgressChange(i2, 10000);
        return super.onLevelChange(i2);
    }

    public void onProgressChange(int i2, int i3) {
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onRelease(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onSubmit(String id, Object obj) {
        Intrinsics.checkNotNullParameter(id, "id");
    }
}
