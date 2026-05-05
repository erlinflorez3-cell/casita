package io.cobrowse.ui;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import io.cobrowse.Callback;
import io.cobrowse.CobrowseIO;
import io.cobrowse.R;
import io.cobrowse.Session;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.CX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public class CobrowseActivity extends Activity {
    static final String TAG = "CobrowseActivity";
    private final CodeDisplay codeDisplay = new CodeDisplay();
    private final ManageSession manageView = new ManageSession();
    private final ErrorView errorView = new ErrorView();
    private boolean wasActive = false;

    protected void createSession(final Callback<Error, Session> callback) {
        CobrowseIO.instance().createSession(new Callback<Error, Session>() { // from class: io.cobrowse.ui.CobrowseActivity.1
            @Override // io.cobrowse.Callback
            public void call(Error error, Session session) throws Exception {
                if (error != null) {
                    CobrowseActivity.this.showError(error);
                } else {
                    CobrowseActivity.this.render(session);
                }
                Callback callback2 = callback;
                if (callback2 != null) {
                    callback2.call(error, session);
                }
            }
        });
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strXd = ZO.xd("f\u0010\u000e}\u0016", (short) (Od.Xd() ^ (1592482233 ^ (-1592479926))), (short) (Od.Xd() ^ ((1492874083 ^ 598668721) ^ (-2069220966))));
            String strUd = C1626yg.Ud("4q", (short) (ZN.Xd() ^ ((2050679904 ^ 2138323644) ^ 89057698)), (short) (ZN.Xd() ^ ((748388324 ^ 755441561) ^ 27019176)));
            try {
                Class<?> cls = Class.forName(strXd);
                Field field = 0 != 0 ? cls.getField(strUd) : cls.getDeclaredField(strUd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strWd = Ig.wd("\u001e>5\u0012d", (short) (C1633zX.Xd() ^ ((1974531894 ^ 1700866384) ^ (-282178119))));
                String strOd = EO.Od("\u001f<", (short) (C1607wl.Xd() ^ (1736487836 ^ 1736489906)));
                try {
                    Class<?> cls2 = Class.forName(strWd);
                    Field field2 = 0 != 0 ? cls2.getField(strOd) : cls2.getDeclaredField(strOd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strQd = C1561oA.Qd("R?\u0005B&", (short) (Od.Xd() ^ (1501576493 ^ (-1501574861))));
                    String strZd = C1593ug.zd("B8", (short) (C1580rY.Xd() ^ (1599213450 ^ (-1599211505))), (short) (C1580rY.Xd() ^ (199706020 ^ (-199700112))));
                    try {
                        Class<?> cls3 = Class.forName(strQd);
                        Field field3 = 0 != 0 ? cls3.getField(strZd) : cls3.getDeclaredField(strZd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(C1561oA.od("\u0001m3|\\", (short) (ZN.Xd() ^ ((761858449 ^ 219680779) ^ 544307861)))).getDeclaredMethod(C1561oA.Kd("o|", (short) (FB.Xd() ^ (1427291924 ^ 1427304428))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                String strZd2 = Wg.Zd("5:eq\u001f=", (short) (ZN.Xd() ^ ((1785201908 ^ 947569003) ^ 1376958548)), (short) (ZN.Xd() ^ ((727445049 ^ 526882916) ^ 876364825)));
                                short sXd = (short) (C1607wl.Xd() ^ (1013021585 ^ 1013018182));
                                int[] iArr = new int["z\t\u007f\u000f\r\b\u0004N\u0005\u0012\u0012\u0019\u000b\u0015\u001cVl\u001a\u001a!\u0013'$".length()];
                                QB qb = new QB("z\t\u007f\u000f\r\b\u0004N\u0005\u0012\u0012\u0019\u000b\u0015\u001cVl\u001a\u001a!\u0013'$");
                                int i2 = 0;
                                while (qb.YK()) {
                                    int iKK = qb.KK();
                                    Xu xuXd = Xu.Xd(iKK);
                                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                                    i2++;
                                }
                                Object[] objArr2 = {strZd2};
                                Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Qg.kd("iftRwpp`gL]il^WX", (short) (Od.Xd() ^ ((969805862 ^ 218807313) ^ (-885299289))), (short) (Od.Xd() ^ (1067039161 ^ (-1067047396)))), Class.forName(Wg.vd("J@XB\nG?K?\u0005-MF<D<", (short) (C1580rY.Xd() ^ ((1925367738 ^ 1355047492) ^ (-570873779))))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    short sXd2 = (short) (C1499aX.Xd() ^ ((2113725282 ^ 1856124651) ^ (-324981381)));
                                    short sXd3 = (short) (C1499aX.Xd() ^ (1757231784 ^ (-1757245171)));
                                    int[] iArr2 = new int["iV\u001cY=".length()];
                                    QB qb2 = new QB("iV\u001cY=");
                                    int i3 = 0;
                                    while (qb2.YK()) {
                                        int iKK2 = qb2.KK();
                                        Xu xuXd2 = Xu.Xd(iKK2);
                                        iArr2[i3] = xuXd2.fK(sXd2 + i3 + xuXd2.CK(iKK2) + sXd3);
                                        i3++;
                                    }
                                    String str = new String(iArr2, 0, i3);
                                    String strUd2 = C1561oA.ud("=1", (short) (C1633zX.Xd() ^ ((1764745637 ^ 210814311) ^ (-1707048015))));
                                    try {
                                        Class<?> cls4 = Class.forName(str);
                                        Field field4 = 0 != 0 ? cls4.getField(strUd2) : cls4.getDeclaredField(strUd2);
                                        field4.setAccessible(true);
                                        field4.set(null, windowManager);
                                    } catch (Throwable th4) {
                                    }
                                } catch (InvocationTargetException e2) {
                                    throw e2.getCause();
                                }
                            }
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    }
                    String strYd = C1561oA.yd("&\u0013\\\u001ay", (short) (C1499aX.Xd() ^ ((745917480 ^ 1112783363) ^ (-1848001086))));
                    String strYd2 = C1561oA.Yd("!\u0017", (short) (FB.Xd() ^ (1156292515 ^ 1156289676)));
                    try {
                        Class<?> cls5 = Class.forName(strYd);
                        Field field5 = 0 != 0 ? cls5.getField(strYd2) : cls5.getDeclaredField(strYd2);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strQd2 = Xg.qd("RA\tH.", (short) (C1580rY.Xd() ^ ((1548401716 ^ 696455917) ^ (-1976163688))), (short) (C1580rY.Xd() ^ (894642321 ^ (-894639194))));
                        String strWd2 = Jg.Wd("\u000f!", (short) (C1580rY.Xd() ^ (592543371 ^ (-592518460))), (short) (C1580rY.Xd() ^ ((1195458544 ^ 1074109829) ^ (-121936708))));
                        try {
                            Class<?> cls6 = Class.forName(strQd2);
                            Field field6 = 0 != 0 ? cls6.getField(strWd2) : cls6.getDeclaredField(strWd2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i4 = 995491960 ^ 995491891;
                        if (x2 > i4 && x2 < displayMetrics.widthPixels - i4 && y2 > i4 && y2 < displayMetrics.heightPixels - i4) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void endSessionClicked(View view) throws Throwable {
        Session sessionCurrentSession = CobrowseIO.instance().currentSession();
        if (sessionCurrentSession != null) {
            sessionCurrentSession.end(new Callback<Error, Session>() { // from class: io.cobrowse.ui.CobrowseActivity.4
                @Override // io.cobrowse.Callback
                public void call(Error error, Session session) throws Exception {
                    if (error != null) {
                        CobrowseActivity.this.showError(error);
                    } else {
                        CobrowseActivity.this.finish();
                    }
                }
            });
        }
    }

    protected void listenTo(Session session) {
        this.wasActive = session.isActive();
        session.registerSessionListener(new Session.Listener() { // from class: io.cobrowse.ui.CobrowseActivity.2
            @Override // io.cobrowse.Session.Listener
            public void sessionDidEnd(Session session2) throws Exception {
                CobrowseActivity.this.render(session2);
                CobrowseActivity.this.finish();
            }

            @Override // io.cobrowse.Session.Listener
            public void sessionDidUpdate(Session session2) throws Exception {
                if (!session2.isActive() || CobrowseActivity.this.wasActive) {
                    CobrowseActivity.this.render(session2);
                } else {
                    CobrowseActivity.this.finish();
                }
                CobrowseActivity.this.wasActive = session2.isActive();
            }
        });
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_cobrowse);
    }

    @Override // android.app.Activity
    protected void onResume() throws Exception {
        super.onResume();
        Session sessionCurrentSession = CobrowseIO.instance().currentSession();
        if (sessionCurrentSession != null) {
            listenTo(sessionCurrentSession);
        }
        if (sessionCurrentSession == null || sessionCurrentSession.isEnded()) {
            createSession(new Callback<Error, Session>() { // from class: io.cobrowse.ui.CobrowseActivity.3
                @Override // io.cobrowse.Callback
                public void call(Error error, Session session) throws Exception {
                    if (error != null) {
                        CobrowseActivity.this.showError(error);
                    }
                    if (session != null) {
                        CobrowseActivity.this.listenTo(session);
                    }
                }
            });
        }
        render(sessionCurrentSession);
    }

    protected void render(Session session) throws Exception {
        if (session != null && !session.isPending()) {
            if (session.isActive()) {
                showFragment(this.manageView);
            }
        } else {
            showFragment(this.codeDisplay);
            if (session != null) {
                this.codeDisplay.setCode(session.code());
            }
        }
    }

    protected void showError(Error error) throws Exception {
        String str = "Cobrowse error: " + error.getMessage();
        showFragment(this.errorView);
    }

    protected void showFragment(Fragment fragment) throws Exception {
        if (isFinishing() || isDestroyed() || isChangingConfigurations()) {
            return;
        }
        FragmentManager fragmentManager = getFragmentManager();
        CX.ud();
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        int i2 = R.id.cobrowse_fragment_container;
        CX.ud();
        fragmentTransactionBeginTransaction.replace(i2, fragment);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }
}
