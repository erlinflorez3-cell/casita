package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯV\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r)4ߚ\u007f\u0007|jAӄLeV7ZS0\u0012s{J$c$wDCU0}*\tUNog|ObŏK\u000f\u00144\u0001jBI]xc3\u00172PoG3S\u007fE9n\u0001>ӌ&78\u0600*\u0005/\u0019j\"\u0016\u000b\u000bGY\f*0nqJV\u001bO\u001d\u001a@\tN$\u000f\"tg|;Xpk@G#1pRR5gH|{\u0010VX5\u0016\u000faL0P;C\u001f=S1\u000eb_M\u000eWqk\fx--+W\u007fo6\u0007\r$\u001b1O\u001bk\u000b&\u000b\nŌd\f5:\u00103Qe\u001e,\u0006z\u0014\rj\u0005\u001e\n5JF-Hi\u0018\u0012Ax\u000bSnU\u0012bP\u0006\u0013ad\u001e5\u0004A3Q\u001b\u0015Tq?'WO{3\u0012.'\u000fx9[\u0003\u0015p\u0019)d\u0010Q_bPCNN\u0018eUm2}Ċ\u0006*\u0012B\bs5\n!2%%O[g$1o\u0010J\\g%\bplamjHn'~\u001aE0!\f\tKt\tyclXZ%] b\u000f\u0016\bA#l{J*=\u0010|TxmxWu\nS6v;gy\u0004\u000e\u0006@n7C]{\u0010\u0010_\u0007\u001eMQz\u000bhhRS:q\u000b>26Vx(w*I^\u0010!JWqJ9Ϝ5\u0019j.\tb.FO|!_\ti \u0003b5<\u0003\u0018'\u0005\r\u000fTtp\u001el\tM:\u0003x\"[Ha9'9m\"\u0017H\r'\u0015\u0007\f\u007fuj\\KZu.u\u0004\u00010\u001a(Ci/k\u001a\u001f\u00037=\u001a-sS\u0003kWM 3\u0013|(\u001cKn4g\u0016x\t,\u000foߝST%<?b\u0001] d.5*9\t\u0004{T9ϵnOx\u0003g<f8+\u0006O$+\u0001}_\u00155[FW#\u001cw\"m-a\fn 4\u007fb\u001de\re23\u0014\u001cub_pJ;f]\n\u0005D\"2-\u001bBvm(\u000eH\tB\u0016KHoi!\\>M\u00199\u0016f53=v\\[H\u001f\b}b;\u00100yC\f\"vCS\u0016µR܊ƽqMbLXQRΡz?+*\u001ckղ\u0007]h\t>\u0006\f\u0018dBkh\u000b<\u0017aL,j\u000b;IZi\u0014N\u0013\u007ftd?\u001d8B\u0002zn\u000e\u0003\u007f\r\\N\u0005nXx!X\u0015/\u00159\u001e\u0007uI\u0005\u001cI\u00055i2\u000f\\5\tIo\u007f\u0005l%9Nl9I/\t\u0007\u0011EkOa\u0002d\u0011w5sk}!P\u001e\r\u001fR\u0018IP\u007f'\u0010|6^\u0019c|N\u0013{XkǓMÝĹ\u0003|\u0003QJNWu'\f\u000bo\u0011\u03a2|T}7Q\u001a\u0019\u0017r*7\u0012\u0003cTXE\u0006c0mOp\u00145:oSi\u00038&&'\u001249\\\u0006\u0015\u0017\u0010c\u001bHV\n\u0016\u0011\u00059\u0019V \u00127bt!\u000f^\u000e<O\u0010=\u001a\u0013\r`\u001c}'@5;\u0005\u0006p\\\u0019~\u0010czo\u0007U9\u0010-6ڵxҧ\u0094T\u001f\u000fl[t[Khv)SNǅA\u0006\u001a\u00154\u001fN\b\u0011*@Uih~)g[;._q0a?nj\u001e,$*{\n*bg-;\u0005Tnj\u000f\\z\u0003o\u000e\rmXjz\f7\u001d\u0015~vcA\u0019:F\u0001(|/e O_\u001bWx\u00072Vy,'1`K37`\u0018 .|\u0011\u0011Hzt./\t\u000eܻ~לǋ1HZ\u0005(o\"\r{!\u001b&yԗhH\u000e,\u001f\u000e)/\t9PDb\u001a*xi3o\u001cA\u0007\u001b8\u0014.\u001f\u0019co\u0002Y+*\u000f<\u0019\rm\u0001aq@sE3;/=rK]l;3>}LU\u00112kP~[mn\u000f\u00103y;K\u001e\baX\u007f8,T*\fu1\u000e]1v/ڜ[ǾҕwY\no8\u00017=1\u0004\u0005x\"ԁ\\o\u001esr[y4o{D\u001fJ>8j\u0005\u0007sP\u0019\u007f\u0011D\u001b\u0004,7=\u000bY9\u001d|\u001e\u000f\n@YP#S5\\k|+s2=bg<yUIq*42BZijxwi_>?B\u0013\u0013\u0004\u0006=j`.mM\"5`\u000fLF^\tMoy9V?*d.P\u001a#\u0006D3\u000f\u001cҴ|\u07bf\u0099\u0019\u00159\u0013\u0002\u000e\u0010\u0018dI9\u001d?*k\u001au\u0002xbW]\u0002ZM9a\"\u0004I\u0007K<ڧ\u0011Ȝ%QlƓ%\u0002pG<d'b(:p\u0006<V\u0015L\u001eb\u0011DV~f4n\u0011UߨO\u05fc\u0005('\u07b7e\u0017k\u001e@\u007fO]j19X(\r`j;3\t\u0004\u0013\u0010o0A!T\u0019\u0010ޯ%Ѵ\u0011;N}\u000e~Wr\u0015oO3\u0011\u0006\u001b8=\u0006W/oL҉U̮ɣ\u0018VĄ\u0003\u0014('2-+&h\r!\u0010^7m+d6\u00050~\u0010á\u0015pRl\u0015$\u0003)F\u000e>}\u0014gV1p4M;\u000eE\u0003ȩ|ƝFڢɣz)ڿst|Y[lCw\u001fi?\u00181eU\f\"\u001c\"sfB/WTEɶ\u0001§ާ%`ҨL18\u0017c\u000b\u0006ly\u0003n7*Cy6|y!mΆBiF̡`n\u001f\u0016](k`Ru!`\u001f\\Ɖ\u0014htԮ?8N\u001b'2Qbo ,7r{Ǳfʨٴ!`ΌWe-GX-&lg*#\".BD\u0017\b,+\u001c҂BlzØ\u0005\u0007Sc\u0012\u0016\u007fATbX\u001c[]Ëqn\u0010Ɏ&\u000e\u00039:\u0015$i_\u00047r\u0013\u0004ն\u001d֦ӚV8ݦ%\u001b\u000b\u0019J/JO^0|~-<<\b\u001e\u001f@Oݦ4Ζσrz٬[yW4kVA\u007fo..D<!\u0012eb#}lϔ\u0015c6ֽ\u0010\t_uggӋ\n+1'\u000eƛC0G<J8Aӟ\u0005^"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0017\n_5Pv|", "", "7c", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018\u001dj", "Coc6`,&W \u0006~l", "", ">nb6g0H\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", ">qT@f,=", "", ">qTC\\6Na\t\n\nb4|p3l\u0007,\n", ">qTC\\6Na\u0004\t\tb;\u0001\u00138", ">qTC\\6Na\u0004\fzl:|\b", "7r8;\\;BO \u0006\u000f<6\u0006\u0017?m\u007f'", "Bx_2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x#2 h7", "Aba<_3\u001dS \u000ev", "uI9\u0017M\u0011#H\u000eb_E2\u0007\u00186i\tq\u0001Q\t`\u001bP~\u000eI\u007f!<#\\ 8i&5\\!EtB-\"x_H\u0011p\u0014J\u0004-GY$oM", "1n]@h4>R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001K 7[SCk3|\u0011w]\u000f", "uI9\u0017M\u0011#H\u007fz\u0004]9\u0007\r.xI&\u0006H\f!%G9\u001e@@)>d\u000e/\u0001x 2VR;x}{\u001fqoI\u000fc+-r6C\"2\u0013b\\\u0002D\u0018\u001b$\u0013_3V\tbP${M3&Q\u000bI\u00037x\b\u001bs\u0018>x\u007fOf\u000eV\u0004\"]=6nFf5=8", ">qT@f<KS", "", "6hbAb9BQ\u0015\u0006", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001P\u001a<\\MHo2\u001a\u001cFd5\u0010e,$", "=qX4\\5:Zx\u0010zg;g\u0013=i\u000f,\u0006I", "uI9\u0017M\r#8\u000es^E1x\u001a+/\u00107\u007fGJ}\u001bU~c![\f;c\r';v_3^K\u0005o=-\u0015uj5\u000e-\u000bNw#WS]\nf[\u0001L!\"X\u001dX8t\u0001fG${\u001az\u0010", "uI9\u0017M\r#8\u000es^C\u0013\u0003\u0013>l\u00041EE\u0012\u001f`Kx\u001d<\u0004.1`G~7n\u0012>TR\u0019u=,$uq7\u0016m96r4ML[\u0002 C", "-gX@g6KW\u0017z\u0002", "5dc,[0Lb#\f~\\(\u0004G+n\t2\u000b<\u0010\u001b!P}", "u(E", "\nrTA \u0006\u0017", "5dc\u0010b5Lc!~y\u001d(\u0006\u00129t{7\u007fJ\n%", "5dc\u0010b5Lc!~y", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001bPz\u001eK@0?]\u0007/7z_\fWLI{<\u001e\u0014G]H\u00039", "5dc\u0015\\:M]&\u0003xZ3;\u00058n\n7wO\u0005! U", "5dc\u0015\\:M]&\u0003xZ3", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u0016Ws#!\u001d\\zM\u0018", "u(9", "\u0018", "7r2<a:N[\u0019}", "7r2<a:N[\u0019}9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "u(I", "5dc\u001ce0@W\"z\u0002>=|\u0012>P\n6\u007fO\u0005! \u000fPY\u001aF\u0002'$<0;g#.TC7y4", "Adc\u001ce0@W\"z\u0002>=|\u0012>P\n6\u007fO\u0005! \u000fuU\u000b}\u0011\u007fA<0;g#.TC7y4", "uI\u0018#", "5dc\u001db:Bb\u001d\t\u0004&\rHf~Bqr", "5dc\u001de,La\u0019}", "5dc\u001de,La)\fz", "u(5", "5dc\u001de,OW#\u000f\tI6\u000b\r>i\n1C!Ltf$aX", "5dc\u001de,OW#\u000f\tI9|\u0017=e~", "5dc\u001de,OW#\u000f\tN7\f\r7eg,\u0003G\u0005%", "5dc V9HZ ]ze;xP\u00101]wX2K", "5dc!l7>\u001b\bQ\rr\bZd", "u(8", "\u0017", "5dc\"c;B[\u0019f~e3\u0001\u0017", "1n]@h4>", "", "1n_F", "1ta?X5MB\u001d\u0007z", "1ta?X5M>#\r~m0\u0007\u0012", "1ta?X5M>&~\tl,{", ">qTC\\6Na\b\u0003\u0003^", "1n_F \u001bG'\u0005\u0001]>", "uI9\u0017M\r#8\u000eb_\"\u0013x\u0012.r\n,zSJ\u0015!Oz\u0018JvnE]G$@x&=\u0017NEo=-\u0015u+$\u0011g5]v4+UY<k0u9\u001d\u0014Zc", "1n_F >;h\u0019\u0002[-", "uI9\u0017M\r#8\u000ebac(\u000e\u0005xu\u000f,\u0003\ng\u001b%VEr\u007f]!>X\u000b*;l)wKMCv>,\u00152q=Pg5Y\u00076\u0011WX0earJ]|d\u0012W:\r\u0012=J/~S\u0015\"\u00045K\u0002\u0011", "1n_F \fS``hK-", "uI9\u0017M\u0011#H\u007fz\u0004]9\u0007\r.xI&\u0006H\f!%G9\u001e@@)>d\u000e/\u0001x 2VR;x}{\u001fqoI\u000fc+-r6C\"2oCN{<!\u001c^\rat\u000b\u000faL.|D\u0001/\fuM\u000bFx\u0010U!\u00189s\u007fBcY2\u0004\u0019~P)u*bj\nV\u001fH^3f\f5", "1n_F v Y\u0004\u0004L\\", "uI9\u0017M\u0011#H\u007fz\u0004]9\u0007\r.xI&\u0006H\f!%G9\u001e@@)>d\u000e/\u0001x 2VR;x}{\u001fqoI\u000fc+-r6C\"2\u0011 9nF\u0013\u001fd\u0012M>V\u0003cI/xR7h\u00180\u0013\u0006Ds\u0011\u001b_\u0019?nyQV\u001d\u0011d\u001fyJ8hS=h\u0005WP#e&m\u000e_r", "1n_F \u0011$[\u000b\u007fnR", "uI9\u0017M\u0011#H|c>E(\u0006\b<o\u0004'\u000f\n~!\u001fRy\u001c<@59#\u0002)B}%wXM?tC\u001e\"2LC\u000bl;N\u0004\u000bPW^;:UnF\u0016\u00120", "1n_F \u0016!^!^\u000b>", "uI9\u0017M\u0011#H|e\u007fZ=xR?t\u0004/E'\u0005%&\u001dTQ#r.4f\b$6\u0001_,WKFuB\u001e^xe\u0003\u000bl7^\u0006pRVR5kR\u007f\u0007~\u001c^\u0017]+\u001ahbL4}\":\u001b\u0011.IW", "BnBAe0GU", "", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PointerInputChange {
    public static final int $stable = 0;
    private List<HistoricalChange> _historical;
    private ConsumedData consumed;
    private final long id;
    private long originalEventPosition;
    private final long position;
    private final boolean pressed;
    private final float pressure;
    private final long previousPosition;
    private final boolean previousPressed;
    private final long previousUptimeMillis;
    private final long scrollDelta;
    private final int type;
    private final long uptimeMillis;

    public /* synthetic */ PointerInputChange(long j2, long j3, long j4, boolean z2, float f2, long j5, long j6, boolean z3, boolean z4, int i2, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, z2, f2, j5, j6, z3, z4, i2, j7);
    }

    public /* synthetic */ PointerInputChange(long j2, long j3, long j4, boolean z2, float f2, long j5, long j6, boolean z3, boolean z4, int i2, List list, long j7, long j8, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, z2, f2, j5, j6, z3, z4, i2, (List<HistoricalChange>) list, j7, j8);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0018Y\u0001tr\u0003$k`L::S$:ap^\u001e*\u0019w\u001e\u0012\u000eO\u0003r\u000et7iz[pN1atMG\u001er; Z\f\u0011+lPJzRs\u0012nV\"W0\u00049\u0006V\r\u00048\u001c\u000b\u0007\np6\r|L", replaceWith = @ReplaceWith(expression = "this(id, uptimeMillis, position, pressed, previousUptimeMillis, previousPosition, previousPressed, consumed.downChange || consumed.positionChange, type, Offset.Zero)", imports = {}))
    @InterfaceC1492Gx
    public /* synthetic */ PointerInputChange(long j2, long j3, long j4, boolean z2, long j5, long j6, boolean z3, ConsumedData consumedData, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, z2, j5, j6, z3, consumedData, i2);
    }

    public /* synthetic */ PointerInputChange(long j2, long j3, long j4, boolean z2, long j5, long j6, boolean z3, boolean z4, int i2, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, z2, j5, j6, z3, z4, i2, j7);
    }

    @Deprecated(message = "8Y\u0001tz\bwffZ=\bU\u0019kOjPH*\u0014v\u001fg\u0004K63\u000e\u0005%oz\fsH\rimMN-7MQ_Z\r6]I?")
    @InterfaceC1492Gx
    public static /* synthetic */ void getConsumed$annotations() {
    }

    public static /* synthetic */ void getHistorical$annotations() {
    }

    private static /* synthetic */ void get_historical$annotations() {
    }

    public static /* synthetic */ void isConsumed$annotations() {
    }

    private PointerInputChange(long j2, long j3, long j4, boolean z2, float f2, long j5, long j6, boolean z3, boolean z4, int i2, long j7) {
        this.id = j2;
        this.uptimeMillis = j3;
        this.position = j4;
        this.pressed = z2;
        this.pressure = f2;
        this.previousUptimeMillis = j5;
        this.previousPosition = j6;
        this.previousPressed = z3;
        this.type = i2;
        this.scrollDelta = j7;
        this.originalEventPosition = Offset.Companion.m3953getZeroF1C5BW0();
        this.consumed = new ConsumedData(z4, z4);
    }

    /* JADX INFO: renamed from: getId-J3iCeTQ */
    public final long m5383getIdJ3iCeTQ() {
        return this.id;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    /* JADX INFO: renamed from: getPosition-F1C5BW0 */
    public final long m5385getPositionF1C5BW0() {
        return this.position;
    }

    public final boolean getPressed() {
        return this.pressed;
    }

    public final float getPressure() {
        return this.pressure;
    }

    public final long getPreviousUptimeMillis() {
        return this.previousUptimeMillis;
    }

    /* JADX INFO: renamed from: getPreviousPosition-F1C5BW0 */
    public final long m5386getPreviousPositionF1C5BW0() {
        return this.previousPosition;
    }

    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    public /* synthetic */ PointerInputChange(long j2, long j3, long j4, boolean z2, float f2, long j5, long j6, boolean z3, boolean z4, int i2, long j7, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, z2, f2, j5, j6, z3, z4, (-1) - (((-1) - i3) | ((-1) - 512)) != 0 ? PointerType.Companion.m5464getTouchT8wyACA() : i2, (i3 + 1024) - (i3 | 1024) != 0 ? Offset.Companion.m3953getZeroF1C5BW0() : j7, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: getType-T8wyACA */
    public final int m5388getTypeT8wyACA() {
        return this.type;
    }

    /* JADX INFO: renamed from: getScrollDelta-F1C5BW0 */
    public final long m5387getScrollDeltaF1C5BW0() {
        return this.scrollDelta;
    }

    public /* synthetic */ PointerInputChange(long j2, long j3, long j4, boolean z2, long j5, long j6, boolean z3, boolean z4, int i2, long j7, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, z2, j5, j6, z3, z4, (i3 + 256) - (i3 | 256) != 0 ? PointerType.Companion.m5464getTouchT8wyACA() : i2, (i3 + 512) - (i3 | 512) != 0 ? Offset.Companion.m3953getZeroF1C5BW0() : j7, (DefaultConstructorMarker) null);
    }

    private PointerInputChange(long j2, long j3, long j4, boolean z2, long j5, long j6, boolean z3, boolean z4, int i2, long j7) {
        this(j2, j3, j4, z2, 1.0f, j5, j6, z3, z4, i2, j7, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ PointerInputChange(long j2, long j3, long j4, boolean z2, long j5, long j6, boolean z3, ConsumedData consumedData, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, z2, j5, j6, z3, consumedData, (i3 + 256) - (i3 | 256) != 0 ? PointerType.Companion.m5464getTouchT8wyACA() : i2, (DefaultConstructorMarker) null);
    }

    private PointerInputChange(long j2, long j3, long j4, boolean z2, long j5, long j6, boolean z3, ConsumedData consumedData, int i2) {
        this(j2, j3, j4, z2, 1.0f, j5, j6, z3, consumedData.getDownChange() || consumedData.getPositionChange(), i2, Offset.Companion.m3953getZeroF1C5BW0(), (DefaultConstructorMarker) null);
    }

    private PointerInputChange(long j2, long j3, long j4, boolean z2, float f2, long j5, long j6, boolean z3, boolean z4, int i2, List<HistoricalChange> list, long j7, long j8) {
        this(j2, j3, j4, z2, f2, j5, j6, z3, z4, i2, j7, (DefaultConstructorMarker) null);
        this._historical = list;
        this.originalEventPosition = j8;
    }

    public final List<HistoricalChange> getHistorical() {
        List<HistoricalChange> list = this._historical;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* JADX INFO: renamed from: getOriginalEventPosition-F1C5BW0$ui_release */
    public final long m5384getOriginalEventPositionF1C5BW0$ui_release() {
        return this.originalEventPosition;
    }

    /* JADX INFO: renamed from: setOriginalEventPosition-k-4lQ0M$ui_release */
    public final void m5389setOriginalEventPositionk4lQ0M$ui_release(long j2) {
        this.originalEventPosition = j2;
    }

    public final boolean isConsumed() {
        return this.consumed.getDownChange() || this.consumed.getPositionChange();
    }

    public final void consume() {
        this.consumed.setDownChange(true);
        this.consumed.setPositionChange(true);
    }

    public final ConsumedData getConsumed() {
        return this.consumed;
    }

    /* JADX INFO: renamed from: copy-Ezr-O64$default */
    public static /* synthetic */ PointerInputChange m5372copyEzrO64$default(PointerInputChange pointerInputChange, long j2, long j3, long j4, boolean z2, long j5, long j6, boolean z3, ConsumedData consumedData, int i2, int i3, Object obj) {
        boolean z4 = z3;
        ConsumedData consumedData2 = consumedData;
        int i4 = i2;
        if ((i3 + 1) - (i3 | 1) != 0) {
            j2 = pointerInputChange.id;
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            j3 = pointerInputChange.uptimeMillis;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            j4 = pointerInputChange.position;
        }
        if ((i3 & 8) != 0) {
            z2 = pointerInputChange.pressed;
        }
        if ((i3 + 16) - (i3 | 16) != 0) {
            j5 = pointerInputChange.previousUptimeMillis;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
            j6 = pointerInputChange.previousPosition;
        }
        if ((i3 + 64) - (i3 | 64) != 0) {
            z4 = pointerInputChange.previousPressed;
        }
        if ((i3 + 128) - (i3 | 128) != 0) {
            consumedData2 = pointerInputChange.consumed;
        }
        if ((i3 + 256) - (i3 | 256) != 0) {
            i4 = pointerInputChange.type;
        }
        return pointerInputChange.m5378copyEzrO64(j2, j3, j4, z2, j5, j6, z4, consumedData2, i4);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0018Y\u0001tr\u0003$k`L::S$<g$\u0015H4\n|\u0014az\u0006\u0006sb|cyk^sNY@mEZ\u001frJ\u0013hM\u0007'lMM%GB% L\u0015H", replaceWith = @ReplaceWith(expression = "copy(id,currentTime, currentPosition, currentPressed, previousTime,previousPosition, previousPressed, consumed, type, this.scrollDelta)", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: copy-Ezr-O64 */
    public final /* synthetic */ PointerInputChange m5378copyEzrO64(long j2, long j3, long j4, boolean z2, long j5, long j6, boolean z3, ConsumedData consumedData, int i2) {
        PointerInputChange pointerInputChange = new PointerInputChange(j2, j3, j4, z2, this.pressure, j5, j6, z3, consumedData.getDownChange() || consumedData.getPositionChange(), i2, getHistorical(), this.scrollDelta, this.originalEventPosition, null);
        this.consumed = consumedData;
        return pointerInputChange;
    }

    /* JADX INFO: renamed from: copy-JKmWfYY$default */
    public static /* synthetic */ PointerInputChange m5373copyJKmWfYY$default(PointerInputChange pointerInputChange, long j2, long j3, long j4, boolean z2, long j5, long j6, boolean z3, int i2, long j7, int i3, Object obj) {
        long j8 = j2;
        long j9 = j3;
        long j10 = j4;
        boolean z4 = z2;
        long j11 = j5;
        long j12 = j6;
        int i4 = i2;
        boolean z5 = z3;
        long j13 = j7;
        if ((i3 & 1) != 0) {
            j8 = pointerInputChange.id;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            j9 = pointerInputChange.uptimeMillis;
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            j10 = pointerInputChange.position;
        }
        if ((i3 & 8) != 0) {
            z4 = pointerInputChange.pressed;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
            j11 = pointerInputChange.previousUptimeMillis;
        }
        if ((i3 + 32) - (i3 | 32) != 0) {
            j12 = pointerInputChange.previousPosition;
        }
        if ((i3 & 64) != 0) {
            z5 = pointerInputChange.previousPressed;
        }
        if ((i3 & 128) != 0) {
            i4 = pointerInputChange.type;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 256)) != 0) {
            j13 = pointerInputChange.scrollDelta;
        }
        boolean z6 = z4;
        return pointerInputChange.m5379copyJKmWfYY(j8, j9, j10, z6, j11, j12, z5, i4, j13);
    }

    /* JADX INFO: renamed from: copy-JKmWfYY */
    public final PointerInputChange m5379copyJKmWfYY(long j2, long j3, long j4, boolean z2, long j5, long j6, boolean z3, int i2, long j7) {
        return m5382copywbzehF4(j2, j3, j4, z2, this.pressure, j5, j6, z3, i2, getHistorical(), j7);
    }

    /* JADX INFO: renamed from: copy-0GkPj7c$default */
    public static /* synthetic */ PointerInputChange m5371copy0GkPj7c$default(PointerInputChange pointerInputChange, long j2, long j3, long j4, boolean z2, long j5, long j6, boolean z3, ConsumedData consumedData, int i2, long j7, int i3, Object obj) {
        long j8 = j2;
        long j9 = j3;
        long j10 = j4;
        boolean z4 = z2;
        long j11 = j5;
        long j12 = j6;
        boolean z5 = z3;
        long j13 = j7;
        int i4 = i2;
        if ((i3 + 1) - (i3 | 1) != 0) {
            j8 = pointerInputChange.id;
        }
        if ((i3 & 2) != 0) {
            j9 = pointerInputChange.uptimeMillis;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            j10 = pointerInputChange.position;
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            z4 = pointerInputChange.pressed;
        }
        if ((i3 & 16) != 0) {
            j11 = pointerInputChange.previousUptimeMillis;
        }
        if ((i3 + 32) - (i3 | 32) != 0) {
            j12 = pointerInputChange.previousPosition;
        }
        if ((i3 & 64) != 0) {
            z5 = pointerInputChange.previousPressed;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 256)) != 0) {
            i4 = pointerInputChange.type;
        }
        if ((i3 + 512) - (i3 | 512) != 0) {
            j13 = pointerInputChange.scrollDelta;
        }
        boolean z6 = z4;
        return pointerInputChange.m5377copy0GkPj7c(j8, j9, j10, z6, j11, j12, z5, consumedData, i4, j13);
    }

    @Deprecated(message = "\u0013G\u000eIzu!\u0017[V6\u000ee\"<be[\u0017f\ri\u001f\u0012xKsx\u000ex)vzQgCaal\u0007\u0006\u0013F?QY[\n; \u0011znLG&\u0011H\u0018\u00042\u007fH\n\u0002!\u0004v\u001cN\r\np7\u0015\u0001L\u0010~\u000bB@)>X\u0004@e[\u0003\u000b_x4I\u0011:\u0004Z\u0016JLZ\u0013,+MN%}&6Zzeo\u000b2[RH@\u00029rH\u001b\u0014\u0014\u0016nxzWGi\\\u000b3':9<b\u0002\u000e\u0004\u000e8\u0004v\u0005OqI<\u001c\u0004|nr\u0019<oS", replaceWith = @ReplaceWith(expression = "copy(id, currentTime, currentPosition, currentPressed, previousTime, previousPosition, previousPressed, type, scrollDelta)", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: copy-0GkPj7c */
    public final PointerInputChange m5377copy0GkPj7c(long j2, long j3, long j4, boolean z2, long j5, long j6, boolean z3, ConsumedData consumedData, int i2, long j7) {
        PointerInputChange pointerInputChange = new PointerInputChange(j2, j3, j4, z2, this.pressure, j5, j6, z3, consumedData.getDownChange() || consumedData.getPositionChange(), i2, getHistorical(), j7, this.originalEventPosition, null);
        this.consumed = consumedData;
        return pointerInputChange;
    }

    /* JADX INFO: renamed from: copy-Tn9QgHE$default */
    public static /* synthetic */ PointerInputChange m5375copyTn9QgHE$default(PointerInputChange pointerInputChange, long j2, long j3, long j4, boolean z2, float f2, long j5, long j6, boolean z3, int i2, long j7, int i3, Object obj) {
        long j8 = j2;
        long j9 = j3;
        boolean z4 = z2;
        long j10 = j4;
        long j11 = j5;
        float f3 = f2;
        boolean z5 = z3;
        long j12 = j6;
        long j13 = j7;
        int i4 = i2;
        if ((i3 & 1) != 0) {
            j8 = pointerInputChange.id;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            j9 = pointerInputChange.uptimeMillis;
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            j10 = pointerInputChange.position;
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            z4 = pointerInputChange.pressed;
        }
        if ((i3 + 16) - (i3 | 16) != 0) {
            f3 = pointerInputChange.pressure;
        }
        if ((i3 & 32) != 0) {
            j11 = pointerInputChange.previousUptimeMillis;
        }
        if ((i3 + 64) - (i3 | 64) != 0) {
            j12 = pointerInputChange.previousPosition;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 128)) != 0) {
            z5 = pointerInputChange.previousPressed;
        }
        if ((i3 & 256) != 0) {
            i4 = pointerInputChange.type;
        }
        if ((i3 & 512) != 0) {
            j13 = pointerInputChange.scrollDelta;
        }
        boolean z6 = z5;
        float f4 = f3;
        return pointerInputChange.m5381copyTn9QgHE(j8, j9, j10, z4, f4, j11, j12, z6, i4, j13);
    }

    /* JADX INFO: renamed from: copy-Tn9QgHE */
    public final PointerInputChange m5381copyTn9QgHE(long j2, long j3, long j4, boolean z2, float f2, long j5, long j6, boolean z3, int i2, long j7) {
        PointerInputChange pointerInputChange = new PointerInputChange(j2, j3, j4, z2, f2, j5, j6, z3, false, i2, getHistorical(), j7, this.originalEventPosition, null);
        pointerInputChange.consumed = this.consumed;
        return pointerInputChange;
    }

    /* JADX INFO: renamed from: copy-OHpmEuE$default */
    public static /* synthetic */ PointerInputChange m5374copyOHpmEuE$default(PointerInputChange pointerInputChange, long j2, long j3, long j4, boolean z2, long j5, long j6, boolean z3, int i2, List list, long j7, int i3, Object obj) {
        long j8 = j2;
        long j9 = j3;
        long j10 = j4;
        boolean z4 = z2;
        long j11 = j5;
        long j12 = j6;
        int i4 = i2;
        boolean z5 = z3;
        long j13 = j7;
        if ((i3 + 1) - (i3 | 1) != 0) {
            j8 = pointerInputChange.id;
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            j9 = pointerInputChange.uptimeMillis;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            j10 = pointerInputChange.position;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            z4 = pointerInputChange.pressed;
        }
        if ((i3 & 16) != 0) {
            j11 = pointerInputChange.previousUptimeMillis;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
            j12 = pointerInputChange.previousPosition;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 64)) != 0) {
            z5 = pointerInputChange.previousPressed;
        }
        if ((i3 & 128) != 0) {
            i4 = pointerInputChange.type;
        }
        if ((i3 & 512) != 0) {
            j13 = pointerInputChange.scrollDelta;
        }
        boolean z6 = z4;
        return pointerInputChange.m5380copyOHpmEuE(j8, j9, j10, z6, j11, j12, z5, i4, list, j13);
    }

    /* JADX INFO: renamed from: copy-OHpmEuE */
    public final PointerInputChange m5380copyOHpmEuE(long j2, long j3, long j4, boolean z2, long j5, long j6, boolean z3, int i2, List<HistoricalChange> list, long j7) {
        return m5382copywbzehF4(j2, j3, j4, z2, this.pressure, j5, j6, z3, i2, list, j7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-wbzehF4$default */
    public static /* synthetic */ PointerInputChange m5376copywbzehF4$default(PointerInputChange pointerInputChange, long j2, long j3, long j4, boolean z2, float f2, long j5, long j6, boolean z3, int i2, List list, long j7, int i3, Object obj) {
        List historical = list;
        long j8 = j2;
        long j9 = j3;
        boolean z4 = z2;
        long j10 = j4;
        long j11 = j5;
        float f3 = f2;
        boolean z5 = z3;
        long j12 = j6;
        long j13 = j7;
        int i4 = i2;
        if ((i3 + 1) - (i3 | 1) != 0) {
            j8 = pointerInputChange.id;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            j9 = pointerInputChange.uptimeMillis;
        }
        if ((i3 & 4) != 0) {
            j10 = pointerInputChange.position;
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            z4 = pointerInputChange.pressed;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
            f3 = pointerInputChange.pressure;
        }
        if ((i3 & 32) != 0) {
            j11 = pointerInputChange.previousUptimeMillis;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 64)) != 0) {
            j12 = pointerInputChange.previousPosition;
        }
        if ((i3 + 128) - (i3 | 128) != 0) {
            z5 = pointerInputChange.previousPressed;
        }
        if ((i3 & 256) != 0) {
            i4 = pointerInputChange.type;
        }
        if ((i3 + 512) - (i3 | 512) != 0) {
            historical = pointerInputChange.getHistorical();
        }
        if ((i3 & 1024) != 0) {
            j13 = pointerInputChange.scrollDelta;
        }
        boolean z6 = z5;
        float f4 = f3;
        return pointerInputChange.m5382copywbzehF4(j8, j9, j10, z4, f4, j11, j12, z6, i4, historical, j13);
    }

    /* JADX INFO: renamed from: copy-wbzehF4 */
    public final PointerInputChange m5382copywbzehF4(long j2, long j3, long j4, boolean z2, float f2, long j5, long j6, boolean z3, int i2, List<HistoricalChange> list, long j7) {
        PointerInputChange pointerInputChange = new PointerInputChange(j2, j3, j4, z2, f2, j5, j6, z3, false, i2, list, j7, this.originalEventPosition, null);
        pointerInputChange.consumed = this.consumed;
        return pointerInputChange;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) PointerId.m5369toStringimpl(this.id)).append(", uptimeMillis=").append(this.uptimeMillis).append(", position=").append((Object) Offset.m3945toStringimpl(this.position)).append(", pressed=").append(this.pressed).append(", pressure=").append(this.pressure).append(", previousUptimeMillis=").append(this.previousUptimeMillis).append(", previousPosition=").append((Object) Offset.m3945toStringimpl(this.previousPosition)).append(", previousPressed=").append(this.previousPressed).append(", isConsumed=").append(isConsumed()).append(", type=").append((Object) PointerType.m5459toStringimpl(this.type)).append(", historical=").append(getHistorical()).append(",scrollDelta=");
        sb.append((Object) Offset.m3945toStringimpl(this.scrollDelta)).append(')');
        return sb.toString();
    }
}
