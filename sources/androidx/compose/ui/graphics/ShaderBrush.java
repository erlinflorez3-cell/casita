package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: Brush.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007njO0L͜P.`S2\u000fq{<$q$yّCU(\u0003*\tURm\r\u0005Ϻ\u000b\u000bq\u000eF\u0019ѱn,WUA\u0004 \u0016JB\u001eGcQ}FQ`#85$@,Py3\fJ.V\u001c\u000fzqXŁ\u0011ؓϮt<X\u001b[\u0014b.\u0014N8\u0005LaPN\u0015N\u001daH8;\u0003\u0018D\u0015Kܸ/ŧ֔\u0011HZ8\u001b\t229AO5C'*\u038b\u0013ӱZΪǚ>pݘ\tj/'9LDkD\\\u0018\u001c+*}\u0012Ft<[cW7ϲ3˦ScSִʮ(\u0001\u0003~\u0013ɿ <\u0005/H4Lըj\u001b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y\u001f7zr;]Q>A", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "u(E", "1qT.g,=A\u001d\u0014z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "\u0018", "7mc2e5:Z\u0007\u0002v],\n", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0016~<\u007f\u0017$\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y\u001f7zk", "/o_9l\u001bH", "", "Ahi2", ">", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\u0002)FC", "/k_5T", "", "/o_9l\u001bH\u001b\u0004\u000bNs@\fl", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#h\u001c;v%\u0004.\u0007,", "1qT.g,,V\u0015}zk", "1qT.g,,V\u0015}zks\r\u001aCY]-\u0002", "uI\u0018\u0019T5=`#\u0003y(.\n\u0005:h\u0004&\n\nn\u001a\u0013Fo\u001b\u0012", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class ShaderBrush extends Brush {
    private long createdSize;
    private Shader internalShader;

    /* JADX INFO: renamed from: createShader-uvyYCjk */
    public abstract Shader mo4147createShaderuvyYCjk(long j2);

    public ShaderBrush() {
        super(null);
        this.createdSize = Size.Companion.m4014getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* JADX INFO: renamed from: applyTo-Pq9zytI */
    public final void mo4125applyToPq9zytI(long j2, Paint paint, float f2) {
        Shader shaderMo4147createShaderuvyYCjk = this.internalShader;
        if (shaderMo4147createShaderuvyYCjk == null || !Size.m4002equalsimpl0(this.createdSize, j2)) {
            if (Size.m4008isEmptyimpl(j2)) {
                shaderMo4147createShaderuvyYCjk = null;
                this.internalShader = null;
                this.createdSize = Size.Companion.m4014getUnspecifiedNHjbRc();
            } else {
                shaderMo4147createShaderuvyYCjk = mo4147createShaderuvyYCjk(j2);
                this.internalShader = shaderMo4147createShaderuvyYCjk;
                this.createdSize = j2;
            }
        }
        if (!Color.m4179equalsimpl0(paint.mo4051getColor0d7_KjU(), Color.Companion.m4204getBlack0d7_KjU())) {
            paint.mo4057setColor8_81llA(Color.Companion.m4204getBlack0d7_KjU());
        }
        if (!Intrinsics.areEqual(paint.getShader(), shaderMo4147createShaderuvyYCjk)) {
            paint.setShader(shaderMo4147createShaderuvyYCjk);
        }
        if (paint.getAlpha() == f2) {
            return;
        }
        paint.setAlpha(f2);
    }
}
