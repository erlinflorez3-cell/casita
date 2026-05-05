package io.cobrowse;

import android.util.DisplayMetrics;
import android.view.Display;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import io.sentry.protocol.SentryThread;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import okhttp3.HttpUrl;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public final class Session extends RESTResource<Session> {
    private SessionCapabilities capabilities;
    private final Set<Listener> listeners = new HashSet();

    public enum FullDeviceState {
        Off,
        Requested,
        Rejected,
        On
    }

    public interface Listener {
        void sessionDidEnd(Session session);

        void sessionDidUpdate(Session session);
    }

    public enum RemoteControlState {
        Off,
        Requested,
        Rejected,
        On
    }

    Session(String[] strArr) {
        this.capabilities = null;
        setHeader("X-CobrowseDeviceToken", UUID.randomUUID().toString());
        this.capabilities = new SessionCapabilities(strArr);
    }

    public void activate(Callback<Error, Session> callback) throws Throwable {
        if (isActive()) {
            short sXd = (short) (C1633zX.Xd() ^ (-2193));
            short sXd2 = (short) (C1633zX.Xd() ^ (-21066));
            int[] iArr = new int["ruRi'D\u0012\u0017sAZa(>#`xBb.B\u0005".length()];
            QB qb = new QB("ruRi'D\u0012\u0017sAZa(>#`xBb.B\u0005");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                i2++;
            }
            String str = new String(iArr, 0, i2);
            short sXd3 = (short) (OY.Xd() ^ 9266);
            short sXd4 = (short) (OY.Xd() ^ 20568);
            int[] iArr2 = new int["\u001fR\u000fB8O\u0018bB;8eWVv".length()];
            QB qb2 = new QB("\u001fR\u000fB8O\u0018bB;8eWVv");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd4) + sXd3)));
                i3++;
            }
            Object[] objArr = {str};
            Constructor<?> constructor = Class.forName(new String(iArr2, 0, i3)).getConstructor(Class.forName(C1626yg.Ud("=:-W\u0014\u0011&.m\n\u0014\u0011\u007f\u001a\u0013a", (short) (Od.Xd() ^ (-23520)), (short) (Od.Xd() ^ (-12221)))));
            try {
                constructor.setAccessible(true);
                ThreadUtils.invoke(callback, (Error) constructor.newInstance(objArr), null);
                return;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        try {
            HashMap map = new HashMap();
            map.put(Ig.wd("~Y\u0018\u0004\u0015", (short) (C1607wl.Xd() ^ 9797)), EO.Od("3n\"2g\u001c", (short) (FB.Xd() ^ 3680)));
            map.put(C1561oA.Qd("==M?89", (short) (ZN.Xd() ^ 24251)), Device.info(CobrowseInitProvider.getApplication()));
            if (CobrowseIO.instance().customData() != null) {
                map.put(C1593ug.zd("Pcbd`_RXVjX", (short) (C1580rY.Xd() ^ (-30940)), (short) (C1580rY.Xd() ^ (-14236))), CobrowseIO.instance().customData());
            }
            update(map, callback);
        } catch (Exception e3) {
            String message = e3.getMessage();
            Class<?> cls = Class.forName(C1561oA.od("oeyc/l`ld*@lkgi", (short) (C1607wl.Xd() ^ 9364)));
            Class<?>[] clsArr = new Class[1];
            short sXd5 = (short) (OY.Xd() ^ 22243);
            int[] iArr3 = new int["{s\nuC\u0003x\u0007\u0001Hn\u0011\u0010\b\u000e\b".length()];
            QB qb3 = new QB("{s\nuC\u0003x\u0007\u0001Hn\u0011\u0010\b\u000e\b");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((sXd5 + sXd5) + i4));
                i4++;
            }
            clsArr[0] = Class.forName(new String(iArr3, 0, i4));
            Object[] objArr2 = {message};
            Constructor<?> constructor2 = cls.getConstructor(clsArr);
            try {
                constructor2.setAccessible(true);
                ThreadUtils.invoke(callback, (Error) constructor2.newInstance(objArr2), null);
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }
    }

    public Agent agent() {
        Map map = (Map) field("agent", Map.class);
        if (map == null) {
            return null;
        }
        try {
            return new Agent(map);
        } catch (SerializationError unused) {
            return null;
        }
    }

    boolean allowRemoteControl() {
        return remoteControl() == RemoteControlState.On;
    }

    String[] capabilities() {
        ArrayList arrayList = (ArrayList) field("capabilities", ArrayList.class, new ArrayList(Arrays.asList(this.capabilities.toArray())));
        HashSet hashSet = new HashSet();
        for (String str : this.capabilities.toArray()) {
            if (arrayList.contains(str)) {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[0]);
    }

    public String code() {
        return (String) field("code", String.class);
    }

    void destroy() {
        this.listeners.clear();
    }

    public void end(Callback<Error, Session> callback) throws Throwable {
        if (isEnded()) {
            String strZd = Wg.Zd("DmK&oI!\";\u001dvA\u0012hUNg,rK\"", (short) (OY.Xd() ^ 22040), (short) (OY.Xd() ^ 16983));
            Class<?> cls = Class.forName(C1561oA.Xd("3+A-z:0>8\u007f\u0018FGEI", (short) (C1607wl.Xd() ^ 21731)));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (C1499aX.Xd() ^ (-21450));
            int[] iArr = new int["&\u001c4\u001ee#\u001b'+p\u001992(0(".length()];
            QB qb = new QB("&\u001c4\u001ee#\u001b'+p\u001992(0(");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = {strZd};
            Constructor<?> constructor = cls.getConstructor(clsArr);
            try {
                constructor.setAccessible(true);
                ThreadUtils.invoke(callback, (Error) constructor.newInstance(objArr), null);
                return;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        try {
            HashMap map = new HashMap();
            map.put(Qg.kd("\"\"\u000e \u0010", (short) (Od.Xd() ^ (-369)), (short) (Od.Xd() ^ (-13580))), hg.Vd("\u001e&\u001b\u001b\u0019", (short) (OY.Xd() ^ 3680), (short) (OY.Xd() ^ 15013)));
            update(map, callback);
        } catch (Exception e3) {
            String message = e3.getMessage();
            short sXd2 = (short) (C1607wl.Xd() ^ 24388);
            int[] iArr2 = new int["2(<&q/#/'l\u0003/.*,".length()];
            QB qb2 = new QB("2(<&q/#/'l\u0003/.*,");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd2 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            Object[] objArr2 = {message};
            Constructor<?> constructor2 = Class.forName(new String(iArr2, 0, i3)).getConstructor(Class.forName(C1561oA.yd("YOgQ\u0019VNZN\u0014<\\UKSK", (short) (FB.Xd() ^ 3870))));
            try {
                constructor2.setAccessible(true);
                ThreadUtils.invoke(callback, (Error) constructor2.newInstance(objArr2), null);
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }
    }

    boolean equals(Session session) {
        if (session == null) {
            return false;
        }
        if (super.equals((Object) session)) {
            return true;
        }
        return hasIdOrCode(session.id()) || hasIdOrCode(session.code());
    }

    @Deprecated
    public Boolean fullDevice() {
        String str = (String) field("full_device", String.class);
        if (str != null) {
            return Boolean.valueOf(str.equals("on") || str.equals("requested"));
        }
        return (Boolean) field("full_device", Boolean.class, false);
    }

    public FullDeviceState fullDeviceState() {
        String str = (String) field("full_device", String.class);
        if (str == null) {
            return fullDevice().booleanValue() ? FullDeviceState.Requested : FullDeviceState.Off;
        }
        str.hashCode();
        switch (str) {
            case "rejected":
                return FullDeviceState.Rejected;
            case "on":
                return FullDeviceState.On;
            case "off":
                return FullDeviceState.Off;
            case "requested":
                return FullDeviceState.Requested;
            default:
                return FullDeviceState.Off;
        }
    }

    public boolean hasAgent() {
        return field("agent", Object.class) != null;
    }

    boolean hasIdOrCode(String str) {
        if (str == null) {
            return false;
        }
        return str.equals(id()) || str.equals(code());
    }

    public String id() {
        return (String) field("id", String.class);
    }

    public boolean isActive() {
        return "active".equals(state());
    }

    public boolean isAuthorizing() {
        return "authorizing".equals(state());
    }

    public boolean isEnded() {
        return "ended".equals(state());
    }

    public boolean isPending() {
        return "pending".equals(state());
    }

    List<Selector> redactionSelectors() {
        ArrayList arrayList = new ArrayList();
        List list = (List) field("redaction_selectors", List.class);
        if (list != null) {
            for (Object obj : list) {
                if (obj instanceof String) {
                    Selector selector = SelectorParser.parse((String) obj);
                    if (selector != null) {
                        arrayList.add(selector);
                    }
                } else if (obj instanceof List) {
                    List list2 = (List) obj;
                    if (!list2.isEmpty()) {
                        arrayList.add(Selector.from(list2));
                    }
                }
            }
        }
        return arrayList;
    }

    public void registerSessionListener(Listener listener) {
        this.listeners.add(listener);
        listener.sessionDidUpdate(this);
    }

    public RemoteControlState remoteControl() {
        String str = (String) field("remote_control", String.class, "on");
        str.hashCode();
        switch (str) {
            case "rejected":
                return RemoteControlState.Rejected;
            case "on":
                return RemoteControlState.On;
            case "off":
                return RemoteControlState.Off;
            case "requested":
                return RemoteControlState.Requested;
            default:
                return RemoteControlState.Off;
        }
    }

    public void removeSessionListener(Listener listener) {
        this.listeners.remove(listener);
    }

    Boolean requireConsent() {
        return (Boolean) field("require_consent", Boolean.class, true);
    }

    float scale(Display display) {
        DisplayMetrics metrics = DisplayScaling.getMetrics(display);
        Number number = (Number) field("scale", Number.class);
        if (number != null) {
            float fFloatValue = number.floatValue() / metrics.density;
            if (fFloatValue > 1.0f) {
                return 1.0f;
            }
            return fFloatValue;
        }
        float f2 = metrics.widthPixels;
        float f3 = metrics.heightPixels;
        float f4 = f2 > f3 ? 500.0f / f2 : 500.0f / f3;
        if (f4 > 1.0f) {
            return 1.0f;
        }
        return f4;
    }

    protected void setAuthorizing(Callback<Error, Session> callback) throws Throwable {
        if (isAuthorizing()) {
            ThreadUtils.invoke(callback, null, this);
            return;
        }
        try {
            HashMap map = new HashMap();
            map.put(C1561oA.Yd("\u000b\rz\u000f\u0001", (short) (C1607wl.Xd() ^ 8853)), Xg.qd("\u000e##\u0018 $\u001c.\u001e$\u001e", (short) (C1499aX.Xd() ^ (-11788)), (short) (C1499aX.Xd() ^ (-17968))));
            update(map, callback);
        } catch (Exception e2) {
            Object[] objArr = {e2.getMessage()};
            Constructor<?> constructor = Class.forName(Jg.Wd("-\u001e\u0006K\u000bF\u0016\u001ei\u000b7G\u001a\u0012g", (short) (C1580rY.Xd() ^ (-19857)), (short) (C1580rY.Xd() ^ (-10876)))).getConstructor(Class.forName(ZO.xd("\u001eF\tD$Y<2$JQ=t\u000f>\u0006", (short) (C1607wl.Xd() ^ 28982), (short) (C1607wl.Xd() ^ OlympusMakernoteDirectory.TAG_SENSOR_TEMPERATURE))));
            try {
                constructor.setAccessible(true);
                ThreadUtils.invoke(callback, (Error) constructor.newInstance(objArr), null);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }

    public void setCapabilities(String[] strArr, Callback<Error, Session> callback) {
        this.capabilities = new SessionCapabilities(strArr);
        update(new HashMap(), callback);
    }

    @Deprecated
    public void setFullDevice(boolean z2, Callback<Error, Session> callback) throws Throwable {
        if (fullDevice().booleanValue() == z2) {
            ThreadUtils.invoke(callback, null, this);
            return;
        }
        toggleCapabilitiesForFullDeviceState(!z2);
        try {
            HashMap map = new HashMap();
            short sXd = (short) (Od.Xd() ^ (-22784));
            short sXd2 = (short) (Od.Xd() ^ (-9320));
            int[] iArr = new int["mf;\"=|2'1m\u001f".length()];
            QB qb = new QB("mf;\"=|2'1m\u001f");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                i2++;
            }
            map.put(new String(iArr, 0, i2), Boolean.valueOf(z2));
            update(map, callback);
        } catch (Exception e2) {
            Object[] objArr = {e2.getMessage()};
            Constructor<?> constructor = Class.forName(Ig.wd(",T\u0018\"/1\u0012v1\u00170\u007fQD'", (short) (C1607wl.Xd() ^ 9227))).getConstructor(Class.forName(EO.Od("@\t_2\u001f\u0003\u001cX\u0005?:\u0002O8\u001d;", (short) (C1633zX.Xd() ^ (-16640)))));
            try {
                constructor.setAccessible(true);
                ThreadUtils.invoke(callback, (Error) constructor.newInstance(objArr), null);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }

    public void setFullDeviceState(FullDeviceState fullDeviceState, Callback<Error, Session> callback) throws Throwable {
        if (fullDeviceState() == fullDeviceState) {
            ThreadUtils.invoke(callback, null, this);
            return;
        }
        toggleCapabilitiesForFullDeviceState(fullDeviceState != FullDeviceState.On);
        try {
            HashMap map = new HashMap();
            map.put(C1561oA.Qd("\u001b)\u001f\u001e\u0010\u0014\u0014$\u0016\u000f\u0010", (short) (OY.Xd() ^ 10557)), fullDeviceState.name().toLowerCase());
            update(map, callback);
        } catch (Exception e2) {
            Object[] objArr = {e2.getMessage()};
            Constructor<?> constructor = Class.forName(C1593ug.zd(":2H4\u0002A7E?\u0007\u001fMNLP", (short) (Od.Xd() ^ (-18372)), (short) (Od.Xd() ^ (-14915)))).getConstructor(Class.forName(C1561oA.od("uk\u007fi5rfrj0Ttqgkc", (short) (OY.Xd() ^ 12719))));
            try {
                constructor.setAccessible(true);
                ThreadUtils.invoke(callback, (Error) constructor.newInstance(objArr), null);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }

    public void setRemoteControl(RemoteControlState remoteControlState, Callback<Error, Session> callback) {
        if (remoteControl() == remoteControlState) {
            ThreadUtils.invoke(callback, null, this);
            return;
        }
        HashMap map = new HashMap();
        map.put("remote_control", remoteControlState.name().toLowerCase());
        update(map, callback);
    }

    public String state() {
        return (String) field(SentryThread.JsonKeys.STATE, String.class);
    }

    void toggleCapabilitiesForFullDeviceState(boolean z2) {
        this.capabilities.toggle(new String[]{"laser", "drawing", "pointer", "keypress"}, z2 ? true : CobrowseAccessibilityService.isRunning(CobrowseInitProvider.getApplication()));
    }

    List<Selector> unredactionSelectors() {
        Selector selector;
        ArrayList arrayList = new ArrayList();
        List list = (List) field("unredaction_selectors", List.class);
        if (list != null) {
            for (Object obj : list) {
                if ((obj instanceof String) && (selector = SelectorParser.parse((String) obj)) != null) {
                    arrayList.add(selector);
                }
                if (obj instanceof List) {
                    List list2 = (List) obj;
                    if (!list2.isEmpty()) {
                        arrayList.add(Selector.from(list2));
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // io.cobrowse.RESTResource
    public void update(Map<String, Object> map, Callback<Error, Session> callback) {
        if (map != null) {
            map.put("capabilities", this.capabilities.toArray());
        }
        super.update(map, callback);
    }

    @Override // io.cobrowse.RESTResource
    protected void updateResource(Map<String, Object> map) throws Throwable {
        boolean zIsEnded = isEnded();
        super.updateResource(map);
        Iterator it = new ArrayList(this.listeners).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).sessionDidUpdate(this);
        }
        if (isEnded() != zIsEnded) {
            Iterator it2 = new ArrayList(this.listeners).iterator();
            while (it2.hasNext()) {
                ((Listener) it2.next()).sessionDidEnd(this);
            }
        }
        if (isPending() && hasAgent()) {
            if (requireConsent().booleanValue()) {
                setAuthorizing(null);
            } else {
                activate(null);
            }
        }
    }

    @Override // io.cobrowse.RESTResource
    HttpUrl url() {
        String strCode = id() == null ? code() : id();
        HttpUrl httpUrlResolve = strCode != null ? CobrowseIO.instance().apiUrl().resolve("/api/1/sessions/" + strCode) : CobrowseIO.instance().apiUrl().resolve("/api/1/sessions");
        if (httpUrlResolve != null) {
            return httpUrlResolve;
        }
        throw new RuntimeException("Cannot create an HTTP Url, is API a valid HTTP(S) scheme?");
    }

    List<String> videoCodecs() {
        ArrayList arrayList = new ArrayList();
        List list = (List) field("video_codecs", List.class);
        if (list != null) {
            for (Object obj : list) {
                if (obj instanceof String) {
                    arrayList.add((String) obj);
                }
            }
        }
        return arrayList;
    }
}
