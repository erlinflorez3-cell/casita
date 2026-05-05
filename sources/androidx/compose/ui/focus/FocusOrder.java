package androidx.compose.ui.focus;

import kotlin.Deprecated;
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
/* JADX INFO: compiled from: FocusOrderModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "\u0018Y\u0001tW\u0004\u0018lk7:\n`\u001a>beQ\u001cf\u000ev\u001ff{Gr")
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nj?HJj^\u008c\u0003SX\u000e,\u0001:8Ӯ(qQ;\u0016'\u0004̝\u0019S\\h\u007fnx\\ŲG\u000f\u0014\u0019I\r:Mmx\f\u0017?6PsW3{ts}\u001f9\rӓ,ݨ&B\u0012\u0007\u0007 8O0x\u0001KY\u0015bRNzRR;R5\u001e \u0010V /#\u0013,\rz\u001fǔiƠ3-\u001bkHY5fP~S\u0019T]w\u0019\u0005b6+n9\fՙ'٨\u0007\u0007Z¹\u0010%M~U\u0005\u0017,W/W\u0001o6\u0007\u0005JYi\u0014cƥ~͉`\u000fib\u001259V\u0004MV\u001d6\u0001K\u001e\u001bL\u001c\u000e4,x2;*~\b<8+7\u0012\u0005'أj۰\u0004\u0005y8\u001d6\u000e:K;!x_j\f;\\J\u0014\u0005;#S\u0005|4sT<eK_\u0013<(Ŀ]͘ARf\f_Q{\u000b\u0011d\b?\u00129\u0018\"=\u0012).E*g_G99k0Mz,5I7ì_ׂVRX$t-E1)\u000e`\\r\u000e<rbqD\u0011{!\u0005\u000b\f!+ \u000b|recT%пtȬnWu\f+It>ypq)eB/UCm{\u0010\u0010W'\u0018MXz\u0005\u0007kx\u0018J\u001f3̬.ĘLt(y\u0002a\\\u001334E\u0010*=Ϣ58"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egg-6m#\u0004", "", "u(E", "4nRBf\u0017K]$~\bm0|\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egh-Ax\u0016;\\G;y\n", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0018!E\u007f\u001c\u0006W/3i\f\u000bDw!.ZR?kBsXY", "2nf;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egj C}\u0016<\\CHA", "5dc\u0011b>G", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0018Qm\u001eJ@\u0006?W\u000e.$m\">MQJkAs", "Adc\u0011b>G", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0018!E\u007f\u001c\u0006W/3i\f\r7y&.[R;x\na\u0006", "3mS", "5dc\u0012a+", "Adc\u0012a+", ":dUA", "5dc\u0019X-M", "Adc\u0019X-M", "<dgA", "5dc\u001bX?M", "Adc\u001bX?M", ">qTC\\6Na", "5dc\u001de,OW#\u000f\t", "Adc\u001de,OW#\u000f\t", "@hV5g", "5dc\u001f\\.Ab", "Adc\u001f\\.Ab", "AsP?g", "5dc g(Kb", "Adc g(Kb", "Co", "5dc\"c", "Adc\"c", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FocusOrder {
    public static final int $stable = 8;
    private final FocusProperties focusProperties;

    public FocusOrder(FocusProperties focusProperties) {
        this.focusProperties = focusProperties;
    }

    public FocusOrder() {
        this(new FocusPropertiesImpl());
    }

    public final FocusRequester getNext() {
        return this.focusProperties.getNext();
    }

    public final void setNext(FocusRequester focusRequester) {
        this.focusProperties.setNext(focusRequester);
    }

    public final FocusRequester getPrevious() {
        return this.focusProperties.getPrevious();
    }

    public final void setPrevious(FocusRequester focusRequester) {
        this.focusProperties.setPrevious(focusRequester);
    }

    public final FocusRequester getUp() {
        return this.focusProperties.getUp();
    }

    public final void setUp(FocusRequester focusRequester) {
        this.focusProperties.setUp(focusRequester);
    }

    public final FocusRequester getDown() {
        return this.focusProperties.getDown();
    }

    public final void setDown(FocusRequester focusRequester) {
        this.focusProperties.setDown(focusRequester);
    }

    public final FocusRequester getLeft() {
        return this.focusProperties.getLeft();
    }

    public final void setLeft(FocusRequester focusRequester) {
        this.focusProperties.setLeft(focusRequester);
    }

    public final FocusRequester getRight() {
        return this.focusProperties.getRight();
    }

    public final void setRight(FocusRequester focusRequester) {
        this.focusProperties.setRight(focusRequester);
    }

    public final FocusRequester getStart() {
        return this.focusProperties.getStart();
    }

    public final void setStart(FocusRequester focusRequester) {
        this.focusProperties.setStart(focusRequester);
    }

    public final FocusRequester getEnd() {
        return this.focusProperties.getEnd();
    }

    public final void setEnd(FocusRequester focusRequester) {
        this.focusProperties.setEnd(focusRequester);
    }
}
