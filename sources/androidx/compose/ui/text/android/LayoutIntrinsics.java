package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: LayoutIntrinsics.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLш|\u0004O\u00118é6B\u0015\"4ߚ\u007f\u0007tpA0JeP.hS2şs{B)c$wFCU(\u0007*\tURm˧\u0005Ϻ\u000b\u000bq\u000eF1\tn:Imx\f\u0013\u001f6PqW3{rM=nxN\u0005N7ŕ<y\u0013\u0007j8V\u0017\u000f|YJ:\u001a\u0007ώ|ĐV\rUĨj\u001e\u0014G8\u0001Lf>ޱBՂp]Bǂs\u000fwMf'\u000e:Sմ\u0019ТX'\u0015Ǹ2/9LO7+$\u0002\u000b=\u0017ÜC\u0007WsC\u0012v5w7W\u0003o6\u0007\u0010jƆ7̠\u0011]z̦-\u0011_`$'YP:֢Rˎ,w\u0003Ԉ]K\u0012\u001f\u001e'v8c^Ǵ\f\u0012KvxeNcRmP\u0014\u0013ad![DĴ/=3hWvI,\u001fC\n\t%\u001eQ\u0006EĒ]ڍ\u0012`\u001dÑ%\u0004_3i@kK%˦[ǀq\u0004xç͌.\u001a"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i\u001ei*8]R\u001ftC+\u0019qo=\u0005q\u0002", "", "1gP?F,Jc\u0019\bx^", "", "BdgAC(B\\(", "\u001a`]1e6BRb\u000ezq;Fw/x\u000f\u0013wD\n&l", "BdgA70KS\u0017\u000e~h5_\t?r\u00046\u000bD~", "", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dV\nEu2?]|iFm)=\u00172;~C\t\u0011ljH\\Go?", "-a^?\\5@;\u0019\u000e\bb*\u000b", "\u001a`]1e6BRb\u000ezq;Fe9r\u00041}'|+!W~L$v4B]{.\r", "-lPE<5M`\u001d\b\tb*n\r.t\u0003", "", "-lX;<5M`\u001d\b\tb*n\r.t\u0003", "0na6a.&S(\f~\\:", "5dc\u000fb9B\\\u001bfzm9\u0001\u0007=", "u(;.a+K]\u001d}Dm,\u0010\u0018xB\n5\u007fI\u0003}\u0013[y\u001eK5\r5h\u000b$5{k", "0na6a.&S(\f~\\:`\u0017\u0013n\u00047", "", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", "5dc\u001aT?\"\\(\f~g:\u0001\u0007!i~7~", "u(5", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h", "5dc\u001a\\5\"\\(\f~g:\u0001\u0007!i~7~", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LayoutIntrinsics {
    public static final int $stable = 8;
    private BoringLayout.Metrics _boringMetrics;
    private float _maxIntrinsicWidth = Float.NaN;
    private float _minIntrinsicWidth = Float.NaN;
    private boolean boringMetricsIsInit;
    private final CharSequence charSequence;
    private final int textDirectionHeuristic;
    private final TextPaint textPaint;

    public LayoutIntrinsics(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.charSequence = charSequence;
        this.textPaint = textPaint;
        this.textDirectionHeuristic = i2;
    }

    public final BoringLayout.Metrics getBoringMetrics() {
        if (!this.boringMetricsIsInit) {
            this._boringMetrics = BoringLayoutFactory.INSTANCE.measure(this.charSequence, this.textPaint, TextLayout_androidKt.getTextDirectionHeuristic(this.textDirectionHeuristic));
            this.boringMetricsIsInit = true;
        }
        return this._boringMetrics;
    }

    public final float getMinIntrinsicWidth() {
        if (!Float.isNaN(this._minIntrinsicWidth)) {
            return this._minIntrinsicWidth;
        }
        float fMinIntrinsicWidth = LayoutIntrinsics_androidKt.minIntrinsicWidth(this.charSequence, this.textPaint);
        this._minIntrinsicWidth = fMinIntrinsicWidth;
        return fMinIntrinsicWidth;
    }

    public final float getMaxIntrinsicWidth() {
        if (!Float.isNaN(this._maxIntrinsicWidth)) {
            return this._maxIntrinsicWidth;
        }
        BoringLayout.Metrics boringMetrics = getBoringMetrics();
        float fCeil = boringMetrics != null ? boringMetrics.width : -1;
        if (fCeil < 0.0f) {
            CharSequence charSequence = this.charSequence;
            fCeil = (float) Math.ceil(Layout.getDesiredWidth(charSequence, 0, charSequence.length(), this.textPaint));
        }
        if (LayoutIntrinsics_androidKt.shouldIncreaseMaxIntrinsic(fCeil, this.charSequence, this.textPaint)) {
            fCeil += 0.5f;
        }
        this._maxIntrinsicWidth = fCeil;
        return fCeil;
    }
}
