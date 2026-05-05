package androidx.compose.ui.text.platform.style;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.text.platform.AndroidTextPaint_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: ShaderBrushSpan.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u0006\fnj?4Le^.ZS@\u000fsڔ<$q$yCA[\"}0\tWȞog\u0005JbŏIƤ\u001cǝ)jZH\u0006x\f\u0012OERsM4eok;pxD\b82P<ѩ\t\u0001(/\u0011\u001e\u0005\u0011[K:)`D~Rj\r{\u001e`&VM.\u00046\\\u0016RɇLreŽG%\toPUwn>}e\rtVܮ\u0011|iӜCB==#.$\u0017\u0015\\sG\u0013C\u0002?\u001bgU3YTJɑ8ݼ\u0004\u0014\u001dۀ <k\u0002>\\3_\u0011\u001058gcy^Dl6?Rȥɬ\u0004ٳ\u0005ΩЗ-,բj\u0018\u00165z\u0007aUh\u0004dR\u000e\f\u00028\u001d7\u000eFڂ9$nTgބ5|6\u0004\u0005\u0013=ũ\u0005\t"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0019Cr46c\u000b(\u0001{%BTC\u0005Y7\u001a\u0014hn\u0016\u0014s:Qd2CU$", "\u001a`]1e6BRb\u000ezq;F\u0017>y\u0007(E\u001e\u0004\u0013$Cm\u001d<\u0004\u0013Dm\u0005 \r", "\u001a`]1e6BRb\u000ezq;F\u0017>y\u0007(E0\f\u0016\u0013VoiG\u0002%1fy)5mk", "AgP1X9\u001b`)\r}", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y\u001f7zr;]Q>A", "/k_5T", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~G\u0001\u001c6m#\u000bZSIn\n~XY", "5dc\u000e_7AO", "u(5", "5dc [(=S&[\bn:\u007f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#k#3l\u0016;*PKy7s", "AgP1X9,b\u0015\u000ez", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0016~<\u007f\u0017$\u001d", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "Ahi2", "5dc \\A>\u001b\u0002aBc)i\u0007", "u(9", "Adc \\A>\u001b)\u0010\u000fR\n\u0002\u000f", "uI\u0018#", "Ahi2\u0017+>Z\u0019\u0001vm,", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "CoS.g,\u001d`\u0015\u0011hm(\f\t", "", "BdgAC(B\\(", "\u001a`]1e6BRb\u000ezq;Fw/x\u000f\u0013wD\n&l", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ShaderBrushSpan extends CharacterStyle implements UpdateAppearance {
    public static final int $stable = 0;
    private final float alpha;
    private final ShaderBrush shaderBrush;
    private final MutableState size$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m3994boximpl(Size.Companion.m4014getUnspecifiedNHjbRc()), null, 2, null);
    private final State<Shader> shaderState = SnapshotStateKt.derivedStateOf(new Function0<Shader>() { // from class: androidx.compose.ui.text.platform.style.ShaderBrushSpan$shaderState$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Shader invoke() {
            if (this.this$0.m6409getSizeNHjbRc() == InlineClassHelperKt.UnspecifiedPackedFloats || Size.m4008isEmptyimpl(this.this$0.m6409getSizeNHjbRc())) {
                return null;
            }
            return this.this$0.getShaderBrush().mo4147createShaderuvyYCjk(this.this$0.m6409getSizeNHjbRc());
        }
    });

    public final ShaderBrush getShaderBrush() {
        return this.shaderBrush;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public ShaderBrushSpan(ShaderBrush shaderBrush, float f2) {
        this.shaderBrush = shaderBrush;
        this.alpha = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m6409getSizeNHjbRc() {
        return ((Size) this.size$delegate.getValue()).m4011unboximpl();
    }

    /* JADX INFO: renamed from: setSize-uvyYCjk, reason: not valid java name */
    public final void m6410setSizeuvyYCjk(long j2) {
        this.size$delegate.setValue(Size.m3994boximpl(j2));
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        AndroidTextPaint_androidKt.setAlpha(textPaint, this.alpha);
        textPaint.setShader(this.shaderState.getValue());
    }
}
