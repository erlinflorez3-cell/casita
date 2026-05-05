package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<K\u0007Ӭ4\u0012\u0006\u0013nʑA0ZeP\u008cZS@\u000fs{B$c$wJCU0}*ޛUN}˧\u001fJ\t\ns\u000f4\u001692<Mcyu\u0012=4RuM6eqS8\u000fxF\u000b.7::\u0010\u0004/ :R\u001e}\u0013I[\u000e\"0nyhZ\u001dS\u0013$*\bT\u001f/\"ls\\A`tm<?#1rXMUg݁\u0001M\u001bR\u001dw\u001b\u0007y\u001eYIg9#&k\u00035T\fE\u0011B\n?\u001bgU+[O\u0002\\NZ\u0016\u0013C1\u007f\u0017ky>b\u0015Sp\fU4}k{V\u001c2\u0010|\u0012\fj\b>\u00125SF5*h\u0018\u000ea}\tRnXڕ]ۍȸ~a<(m\nA=Q\u001b\u0015Z\n;Ga}\u0010U\u0019,$\u0019nO]+טlڠ\u001fT\u007f\u0383\u0002cND`T\u001a[Mm2y\u0011\n\u0001ʹ<Ͻ\u0004/\u0004߾~%3:s;9 \u001a\u0006\u001fֶsЛ\t`pׅ:fVK:v&9:\t:cZc3s'Ӽd¯\u0015M$\u0381W\f\u0016\u001d8^\u000e;O)fʝ[ŹmjUΪZ9=kO[\u0005j<]\u0010ӗ?ΉPү¼`Qλ\u0018?DϵUjtOk\f\t^^v\tʢlݻ{\u007f\\P\u0012!@Nڧ\u001c=44\u001fÄ1v\u0002&BG\u001cȪcn"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0003<]{&3j\u001d.;CCg=-\u0019fo\"\u0011b,$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9{<~!>h\u0002\u001eEU -QD?kA\u0007\u001fga\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "3mP/_,=", "", "=m29\\*D:\u0015{ze", "", "@n[2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~F\b'7C", "=m29\\*D", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "=m;<a.\u001cZ\u001d|\u0001E(y\t6", "=m;<a.\u001cZ\u001d|\u0001", "uY;7T=:\u001d z\u0004`uj\u0018<i\t*Q'| \u0016Ty\u0012;\nn3c\u0006+A{\u0016w]G\u0005y4&\u0011qp=\u0005qu;\u0001.G\"52fayA\u001d[_\u001fVt\u000e\u0015b?3rN@-Q\rY\u000b9w\u0005\u0016\u001fX\u000bQu>g\f\u0011\u0001\u0011~CrVUfc\u0003I\u0017,h4s\u0013c&&?K,]r)$f_2\u0014\u0005aZSb\u0003evK#\u0004\u0003y%seULs^\u0006y8'\u0015\u007f\u0001!2e}'{vb4+2t\fZE\"Gl\b\"<ZP13\u001e8 EKpK0/", "Ag^B_+&S&\u0001z=,\u000b\u0007/n~$\u0005On\u0017\u001fCx\u001d@t3", "5dc [6NZ\u0018fzk.|g/s}(\u0005?| &5o\u00168\u007f49W\f", "u(I", "CoS.g,", "CoS.g,\u0006C\u0001~Kn\u0015K", "/o_9l\u001a>[\u0015\b\nb*\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMsc*Nz8GY$", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class ClickableSemanticsNode extends Modifier.Node implements SemanticsModifierNode {
    private boolean enabled;
    private Function0<Unit> onClick;
    private String onClickLabel;
    private Function0<Unit> onLongClick;
    private String onLongClickLabel;
    private Role role;

    public /* synthetic */ ClickableSemanticsNode(boolean z2, String str, Role role, Function0 function0, String str2, Function0 function02, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, str, role, function0, str2, function02);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    private ClickableSemanticsNode(boolean z2, String str, Role role, Function0<Unit> function0, String str2, Function0<Unit> function02) {
        this.enabled = z2;
        this.onClickLabel = str;
        this.role = role;
        this.onClick = function0;
        this.onLongClickLabel = str2;
        this.onLongClick = function02;
    }

    /* JADX INFO: renamed from: update-UMe6uN4, reason: not valid java name */
    public final void m617updateUMe6uN4(boolean z2, String str, Role role, Function0<Unit> function0, String str2, Function0<Unit> function02) {
        this.enabled = z2;
        this.onClickLabel = str;
        this.role = role;
        this.onClick = function0;
        this.onLongClickLabel = str2;
        this.onLongClick = function02;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Role role = this.role;
        if (role != null) {
            Intrinsics.checkNotNull(role);
            SemanticsPropertiesKt.m5952setRolekuIjeqM(semanticsPropertyReceiver, role.m5932unboximpl());
        }
        SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, this.onClickLabel, new Function0<Boolean>() { // from class: androidx.compose.foundation.ClickableSemanticsNode.applySemantics.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                ClickableSemanticsNode.this.onClick.invoke();
                return true;
            }
        });
        if (this.onLongClick != null) {
            SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver, this.onLongClickLabel, new Function0<Boolean>() { // from class: androidx.compose.foundation.ClickableSemanticsNode.applySemantics.2
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    Function0 function0 = ClickableSemanticsNode.this.onLongClick;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    return true;
                }
            });
        }
        if (this.enabled) {
            return;
        }
        SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
    }
}
