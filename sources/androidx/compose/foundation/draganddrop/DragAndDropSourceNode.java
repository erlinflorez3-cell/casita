package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draganddrop.DragAndDropModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.dynatrace.android.agent.Global;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
/* JADX INFO: compiled from: DragAndDropSource.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"B\u0012\u007f\u0007tjA0ZeP\u008cZS@\u000fs{J$c$\bCCU(Ԃ*\tUWog\u0005Jb\u000bI\u0012\f\u0015\u000f̓\\I\u0004w\u000e\u0012=2\u00035OH[pUJpvF\u0005N52:\n\u0005/\u001eXJǘzzIP\u001c7>F\t[X\f]\u0007*\u00124F0\t.bwPFH\u001bah83\u0007yDd&\u000e:+TϘJT-\u0012țe\u001e9K\u007fM#=k\u00035V\fC\u0011T\n=3~m;ɛH֕ɱ:Z\u0006-#E Hkx>}\u000bPp\u000e7+}k[X\u001e.\b|\f\rj\b<\u000f7L>/0e6\u0018a{ɤW@V\u00075۔\fѐeD\u001f%\u000eCC;!r_n[\u001bTE\n\u0014]G1\u0002\u00072kV\u001e`C\u001edya1\u007fDkJݳ\u000eYCrZ͖n͆.\u00108Ϛ\u00181\u0002\"<)E9aL15<\u0016VY\u007fv3v?\u05c8u˦Gؗ·m\u0015֖.\u000b\u0014ZR{ʐkY\\[2ҬiJS\u000f}\u000e2ا`\u0013"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@$BU\u007f\u001c@l\u0015;WN\u0005JA\u001a\u0017Dj8ep6Yd1WYL,E\\q=i", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9l<}%7U\r$@o~8LC\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/EhY23z\u0016\u0016WB?l8\u001e\"Qk8\u00079", "2qPD79:Uw~xh9x\u00183o\t", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "2qP445=2&\t\u0006L6\r\u0016-eb$\u0005?\b\u0017$", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@$BU\u007f\u001c@l\u0015;WN\u0005JA\u001a\u0017Dj8ep6Yd1WYL,JP|H\u0014g", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d^0Q?", "5dc\u0011e(@/\"}Yk6\bv9u\r&{#| \u0016No\u001b", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu", "Adc\u0011e(@/\"}Yk6\bv9u\r&{#| \u0016No\u001b", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&Sc(", "\u001aj^A_0G\u001d\u001e\u0010\u0003(-\r\u0012-t\u00042\u0005NJw'Pm\u001d@\u0001.\u0002/", "5dc\u0011e(P2&z|=,z\u0013<a\u000f,\u0006I", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "Adc\u0011e(P2&z|=,z\u0013<a\u000f,\u0006I", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc(", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "\u0018", "=mA2`,:a)\fz]", "=mA2`,:a)\fz]s\u0007\u001e7zt\u0013_", "uI\u0018#", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DragAndDropSourceNode extends DelegatingNode implements LayoutAwareModifierNode {
    public static final int $stable = 8;
    private Function2<? super DragAndDropSourceScope, ? super Continuation<? super Unit>, ? extends Object> dragAndDropSourceHandler;
    private Function1<? super DrawScope, Unit> drawDragDecoration;
    private long size = IntSize.Companion.m6813getZeroYbymL2g();

    public final Function1<DrawScope, Unit> getDrawDragDecoration() {
        return this.drawDragDecoration;
    }

    public final void setDrawDragDecoration(Function1<? super DrawScope, Unit> function1) {
        this.drawDragDecoration = function1;
    }

    public final Function2<DragAndDropSourceScope, Continuation<? super Unit>, Object> getDragAndDropSourceHandler() {
        return this.dragAndDropSourceHandler;
    }

    public final void setDragAndDropSourceHandler(Function2<? super DragAndDropSourceScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.dragAndDropSourceHandler = function2;
    }

    public DragAndDropSourceNode(Function1<? super DrawScope, Unit> function1, Function2<? super DragAndDropSourceScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.drawDragDecoration = function1;
        this.dragAndDropSourceHandler = function2;
        delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new AnonymousClass1((DragAndDropModifierNode) delegate(DragAndDropNodeKt.DragAndDropModifierNode()), null)));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.draganddrop.DragAndDropSourceNode$1 */
    /* JADX INFO: compiled from: DragAndDropSource.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp'\u0005m7NL"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0004\u0013\u0003\n\u0005\u0013\n\u000b\u001a\u0018\u001aXo\u001f\u000f\u0016p\u001f\u0016v&$&\n'.,\u001e!\u000b-#%dr", f = "\u0011>,1\n6+\n733\u0015051!\"i&.", i = {}, l = {113}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DragAndDropModifierNode $dragAndDropModifierNode;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DragAndDropModifierNode dragAndDropModifierNode, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$dragAndDropModifierNode = dragAndDropModifierNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = DragAndDropSourceNode.this.new AnonymousClass1(this.$dragAndDropModifierNode, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                Function2<DragAndDropSourceScope, Continuation<? super Unit>, Object> dragAndDropSourceHandler = DragAndDropSourceNode.this.getDragAndDropSourceHandler();
                C00171 c00171 = new C00171(pointerInputScope, this.$dragAndDropModifierNode, DragAndDropSourceNode.this);
                this.label = 1;
                if (dragAndDropSourceHandler.invoke(c00171, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.draganddrop.DragAndDropSourceNode$1$1 */
        /* JADX INFO: compiled from: DragAndDropSource.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"ЯĊ\u0014D߬)\u001e\u007f\u007fLDyt\fǻ\u000e0\u00193J~(-\u001aw\u001dfr96GmH<[[*\u0015o\u00044:[,qI;]\u001a\u0014\"\u0011OTjon`Z\u0013C%\u0006\u001ex\u0001,QU\u0007ز\u001a\u000fHBw?9Mw=G`|Ȃ\r H\"@ц\r\u0001(0P\u0010\rzKK\u0012\u00128@\u0007:Z\rS\f\"\u0012\u001c>(\u0001$`oNLHt]P/+\u0003oHv&ڿ6\u0005cεvTU\f'aL+\trC.=SI!r]EšM\fm*vB?LOrg8h\u007fB2;W\u001dc\u0003(l\u0005\u0018z:E;SsMf\rV\u0017)\u0018Ɂ@\u0004\u0014&mεmǉ\u001ef\u0016/{\u0003\u0001uXP0\u0002r\u0004\t\u0006N\u0017S%y?\u00020twy;Gu_{35dŘ\u007fϒ żڍ\u0012b\u001bDb\"\u001aF_fUH|1\u0002=\u001c/7ÿ\u0001ň\u0003\u0382Ͻ\u00041\u0002=<DmLig;!\u001a*pD\u0016\"K³gؾhɭ͕D$tEEZQ$hr|\u0005\u001ax|XZ\u0013\u0014ɔSϮ|\u0007̯\u001fοʟ@#+A\\\u00021\u0002x{u\nSW\u000f7\b\u00162ޥV¢]2ΉPүߧeT|EMo+\u001af\u001bZS:\u0010\u0005(P8\u000fв\u000fɧzͩ«\u0010\u00158u\u007fS|A?Qt\u0015v\u0005FBo%OݸYՉ\u000fзՁ7&\t#2'Q\u0016^\u0015\to\u0016zq,+\fh\u03a2@۔4ӧłY$nn\u000bSO\n\u0002;_gz\u0004tlD3\u001cހ\u001f^/G\u0010G=A\u0015')`7sվKɢdʸ̊\u0016)\u0001<\bF\u0004}<( j\u001fW\tjxw\u001bϷ!֧]аן\ff\u0006;o\tC_q\u0015#[lt\u001b\u0003\b>\u0015̓{ŷ\u001e\u001dߋ\u007fǻݕ\u000173\u00075_^\u0010\"o-a\f\u0015\u0018.(\nUֆsѺ\u0003+ќ\u0015˱͈U_8~F\u000e*\u0011L#<l1D~~NټEީ8\u0011KJGg~Z\te\u00194\u0016f52CE-݁=ޝnϘԧ-^ͫwG\u0016\u0016dJ3\u0019\u001eeuv\u0006K\u000b\r\u0001#`β~ϥr\u00164?&`efYR\u0014\u000106oG\u0013\tJ\u0014<4ZH>_\u0002)@щ\u001dĢ\u0004Pw\u0011\u001d@P\u0003[X\u0014d\u0007m'^\u0013r]`O=WϪ\u0012˵\u001d֭î0\u0004֪JXGe8\u0015a%Y+xd\u0017fSA\u001bȋ<Ь,\\\u0019\rKtQaͼ6\rO,sÂ\f:7 |#aə\u001f~"}, d2 = {"/mS?b0=fb|\u0005f7\u0007\u0017//\u00012\fI\u007f\u0013&Ky\u0017\u0006u21[y)6l#8X\r\u001ax0 pq`\u0018\u0014m7<\u00017TJN\u0015fQr{_P&", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@$BU\u007f\u001c@l\u0015;WN\u0005JA\u001a\u0017Dj8ep6Yd1WYL,JP|H\u0014g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp'\u0005m7NL", "2d]@\\;R", "", "5dc\u0011X5LW(\u0013", "u(5", "3wc2a+>R\b\t\u000b\\/g\u0005.d\u00041}", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "5dc\u0012k;>\\\u0018~yM6\r\u00072P{'zD\n\u0019^0RUAs\u00123", "u(9", "4n]AF*:Z\u0019", "5dc\u0013b5MA\u0017z\u0002^", "\n`]<a@F])\r5i(\n\u00057e\u000f(\tzKo", "", "7mc2e*>^(h\u000bm\u0016}e9u\t'\n\u001e\u0004\u001b\u001eFO\u001f<\u007f4C", "5dc\u0016a;>`\u0017~\u0006m\u0016\r\u0018\u0019f\\2\fI\u007f%tJs\u0015;V65b\r.", "u(I", "Adc\u0016a;>`\u0017~\u0006m\u0016\r\u0018\u0019f\\2\fI\u007f%tJs\u0015;V65b\r.", "uY\u0018#", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "5dc \\A>\u001b\r{\u000ff\u0013I\u000b", "DhTD66GT\u001d\u0001\u000bk(\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n&]}2\u0015w\u001f/QEKx0-\u0019rj\u000f", "5dc#\\,P1#\b{b.\r\u0016+t\u00042\u0005", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#n$7\u007fs8VD?mD+\u0011weC\u00109", "/vP6g\u0017HW\"\u000ezk\f\u000e\t8tm&\u0006K\u0001", Global.BLANK, "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001I(*QR&u8'$hn\u0019\u0018c5]d%QWN\u0002", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u0007=w%5QL\u0005i>+\u001fxp=\u0010c:\u0018T1P[R5lN\u0002A\u001e\u001b0Q50\t\u0016U\u000b+jM9hq)N\u00029wV", "AsP?g\u001bKO\"\r{^9", "", "BqP;f->`wz\nZ", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u007f$\u0013Ik\u0017;u2?dG~Di\u0018\nVB\u001ax>)\u0004u]B\u0015d,[U#VH$", "@nd;W\u001bH>,", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "@nd;W\u001bH>,FE/~G\u000e)4", "uE\u0018\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/\r", "@nd;W\u001bH>,FBKxo\u0003\u007fo", "uI\u0018\u0016", "Bn3=", "Bn3= \u000e:<d]n:", "uI\u0018\u0013", "Bn3= <\u000bc#ljF", "uE\u0018\u0013", "uH\u0018\u0013", "Bn3=F0SS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGd)JYS", "Bn3=F0SS`\u0005Bk-my\u0017", "uI\u0018\u0017", "Bn?E", "Bn?E v\u000f&c\u0004t-", "Bn?E s+ \fxKh", "BnA2V;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGc%3hS", "BnB6m,", "BnB6m,\u0006F\u001fzlG\u001bh", "BnB=", "BnB= vQ;\tNyh", "uE\u0018\u0017", "BnB= 2)he`\u000f-", "uH\u0018\u0017", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class C00171 implements DragAndDropSourceScope, PointerInputScope {
            private final /* synthetic */ PointerInputScope $$delegate_0;
            final /* synthetic */ DragAndDropModifierNode $dragAndDropModifierNode;
            final /* synthetic */ DragAndDropSourceNode this$0;

            @Override // androidx.compose.ui.input.pointer.PointerInputScope
            public <R> Object awaitPointerEventScope(Function2<? super AwaitPointerEventScope, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
                return this.$$delegate_0.awaitPointerEventScope(function2, continuation);
            }

            @Override // androidx.compose.ui.unit.Density
            public float getDensity() {
                return this.$$delegate_0.getDensity();
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputScope
            /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc */
            public long mo701getExtendedTouchPaddingNHjbRc() {
                return this.$$delegate_0.mo701getExtendedTouchPaddingNHjbRc();
            }

            @Override // androidx.compose.ui.unit.FontScaling
            public float getFontScale() {
                return this.$$delegate_0.getFontScale();
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputScope
            public boolean getInterceptOutOfBoundsChildEvents() {
                return this.$$delegate_0.getInterceptOutOfBoundsChildEvents();
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputScope
            /* JADX INFO: renamed from: getSize-YbymL2g */
            public long mo702getSizeYbymL2g() {
                return this.$$delegate_0.mo702getSizeYbymL2g();
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputScope
            public ViewConfiguration getViewConfiguration() {
                return this.$$delegate_0.getViewConfiguration();
            }

            @Override // androidx.compose.ui.unit.Density
            /* JADX INFO: renamed from: roundToPx--R2X_6o */
            public int mo703roundToPxR2X_6o(long j2) {
                return this.$$delegate_0.mo703roundToPxR2X_6o(j2);
            }

            @Override // androidx.compose.ui.unit.Density
            /* JADX INFO: renamed from: roundToPx-0680j_4 */
            public int mo704roundToPx0680j_4(float f2) {
                return this.$$delegate_0.mo704roundToPx0680j_4(f2);
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputScope
            public void setInterceptOutOfBoundsChildEvents(boolean z2) {
                this.$$delegate_0.setInterceptOutOfBoundsChildEvents(z2);
            }

            @Override // androidx.compose.ui.unit.FontScaling
            /* JADX INFO: renamed from: toDp-GaN1DYA */
            public float mo705toDpGaN1DYA(long j2) {
                return this.$$delegate_0.mo705toDpGaN1DYA(j2);
            }

            @Override // androidx.compose.ui.unit.Density
            /* JADX INFO: renamed from: toDp-u2uoSUM */
            public float mo706toDpu2uoSUM(float f2) {
                return this.$$delegate_0.mo706toDpu2uoSUM(f2);
            }

            @Override // androidx.compose.ui.unit.Density
            /* JADX INFO: renamed from: toDp-u2uoSUM */
            public float mo707toDpu2uoSUM(int i2) {
                return this.$$delegate_0.mo707toDpu2uoSUM(i2);
            }

            @Override // androidx.compose.ui.unit.Density
            /* JADX INFO: renamed from: toDpSize-k-rfVVM */
            public long mo708toDpSizekrfVVM(long j2) {
                return this.$$delegate_0.mo708toDpSizekrfVVM(j2);
            }

            @Override // androidx.compose.ui.unit.Density
            /* JADX INFO: renamed from: toPx--R2X_6o */
            public float mo709toPxR2X_6o(long j2) {
                return this.$$delegate_0.mo709toPxR2X_6o(j2);
            }

            @Override // androidx.compose.ui.unit.Density
            /* JADX INFO: renamed from: toPx-0680j_4 */
            public float mo710toPx0680j_4(float f2) {
                return this.$$delegate_0.mo710toPx0680j_4(f2);
            }

            @Override // androidx.compose.ui.unit.Density
            public Rect toRect(DpRect dpRect) {
                return this.$$delegate_0.toRect(dpRect);
            }

            @Override // androidx.compose.ui.unit.Density
            /* JADX INFO: renamed from: toSize-XkaWNTQ */
            public long mo711toSizeXkaWNTQ(long j2) {
                return this.$$delegate_0.mo711toSizeXkaWNTQ(j2);
            }

            @Override // androidx.compose.ui.unit.FontScaling
            /* JADX INFO: renamed from: toSp-0xMU5do */
            public long mo712toSp0xMU5do(float f2) {
                return this.$$delegate_0.mo712toSp0xMU5do(f2);
            }

            @Override // androidx.compose.ui.unit.Density
            /* JADX INFO: renamed from: toSp-kPz2Gy4 */
            public long mo713toSpkPz2Gy4(float f2) {
                return this.$$delegate_0.mo713toSpkPz2Gy4(f2);
            }

            @Override // androidx.compose.ui.unit.Density
            /* JADX INFO: renamed from: toSp-kPz2Gy4 */
            public long mo714toSpkPz2Gy4(int i2) {
                return this.$$delegate_0.mo714toSpkPz2Gy4(i2);
            }

            C00171(PointerInputScope pointerInputScope, DragAndDropModifierNode dragAndDropModifierNode, DragAndDropSourceNode dragAndDropSourceNode) {
                this.$dragAndDropModifierNode = dragAndDropModifierNode;
                this.this$0 = dragAndDropSourceNode;
                this.$$delegate_0 = pointerInputScope;
            }

            @Override // androidx.compose.foundation.draganddrop.DragAndDropSourceScope
            public void startTransfer(DragAndDropTransferData dragAndDropTransferData) {
                this.$dragAndDropModifierNode.mo3809drag12SF9DM(dragAndDropTransferData, IntSizeKt.m6820toSizeozmzZPI(mo702getSizeYbymL2g()), this.this$0.getDrawDragDecoration());
            }
        }
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* JADX INFO: renamed from: onRemeasured-ozmzZPI */
    public void mo700onRemeasuredozmzZPI(long j2) {
        this.size = j2;
    }
}
