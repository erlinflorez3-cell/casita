package com.ticnow.sdk.idnowonboarding.dialog;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.dynatrace.android.callback.Callback;
import com.facebook.imagepipeline.producers.HttpUrlConnectionNetworkFetcher;
import com.ticnow.sdk.idnowonboarding.connectivity.ConnectionAliveCallback;
import com.ticnow.sdk.idnowonboarding.connectivity.ConnectionCallback;
import com.ticnow.sdk.idnowsecurity.api.IDSecurityApiImpl;
import com.ticnow.sdk.idnowsecurity.http.nodes.IDCredentials;
import com.ticnow.sdk.idnowsecurity.http.paths.IDEndPoints;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes5.dex */
public class IDDialog {

    /* JADX INFO: renamed from: d */
    static ConnectivityDialog f18224d = null;

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.dialog.IDDialog$1 */
    class AnonymousClass1 extends TimerTask {
        final /* synthetic */ Activity val$activity;
        final /* synthetic */ Context val$context;
        final /* synthetic */ ConnectionAliveCallback val$finished;
        final /* synthetic */ FragmentManager val$fragmentManager;
        final /* synthetic */ Integer val$intents;

        AnonymousClass1(Activity activity, Integer num, FragmentManager fragmentManager, Context context, ConnectionAliveCallback connectionAliveCallback) {
            this.val$activity = activity;
            this.val$intents = num;
            this.val$fragmentManager = fragmentManager;
            this.val$context = context;
            this.val$finished = connectionAliveCallback;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            final Activity activity = this.val$activity;
            final Integer num = this.val$intents;
            final FragmentManager fragmentManager = this.val$fragmentManager;
            final Context context = this.val$context;
            final ConnectionAliveCallback connectionAliveCallback = this.val$finished;
            activity.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.dialog.IDDialog$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Integer num2 = num;
                    IDDialog.showPreConnectionPopup(Integer.valueOf(num2.intValue() - 1), fragmentManager, activity, context, connectionAliveCallback);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.dialog.IDDialog$2 */
    class AnonymousClass2 extends TimerTask {
        final /* synthetic */ Activity val$activity;
        final /* synthetic */ Context val$context;
        final /* synthetic */ ConnectionAliveCallback val$finished;
        final /* synthetic */ FragmentManager val$fragmentManager;
        final /* synthetic */ Integer val$intents;

        AnonymousClass2(Activity activity, Integer num, FragmentManager fragmentManager, Context context, ConnectionAliveCallback connectionAliveCallback) {
            this.val$activity = activity;
            this.val$intents = num;
            this.val$fragmentManager = fragmentManager;
            this.val$context = context;
            this.val$finished = connectionAliveCallback;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            final Activity activity = this.val$activity;
            final Integer num = this.val$intents;
            final FragmentManager fragmentManager = this.val$fragmentManager;
            final Context context = this.val$context;
            final ConnectionAliveCallback connectionAliveCallback = this.val$finished;
            activity.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.dialog.IDDialog$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Integer num2 = num;
                    IDDialog.showPreConnectionPopup(Integer.valueOf(num2.intValue() - 1), fragmentManager, activity, context, connectionAliveCallback);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.dialog.IDDialog$3 */
    class AnonymousClass3 extends TimerTask {
        final /* synthetic */ Activity val$activity;
        final /* synthetic */ String val$buttonText;
        final /* synthetic */ FragmentManager val$fragmentManager;
        final /* synthetic */ String val$message;
        final /* synthetic */ View.OnClickListener val$onClickListener;
        final /* synthetic */ String val$title;

        /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.dialog.IDDialog$3$1 */
        class AnonymousClass1 implements Runnable {
            AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    SimpleOptionDialog simpleOptionDialog = new SimpleOptionDialog(str, str, str, onClickListener);
                    simpleOptionDialog.setCancelable(false);
                    simpleOptionDialog.show(fragmentManager, "Tag");
                } catch (Exception unused) {
                }
            }
        }

        AnonymousClass3(Activity activity, String str, String str2, String str3, View.OnClickListener onClickListener, FragmentManager fragmentManager) {
            activity = activity;
            str = str;
            str = str2;
            str = str3;
            onClickListener = onClickListener;
            fragmentManager = fragmentManager;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            activity.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.dialog.IDDialog.3.1
                AnonymousClass1() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        SimpleOptionDialog simpleOptionDialog = new SimpleOptionDialog(str, str, str, onClickListener);
                        simpleOptionDialog.setCancelable(false);
                        simpleOptionDialog.show(fragmentManager, "Tag");
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.dialog.IDDialog$4 */
    class AnonymousClass4 extends TimerTask {
        final /* synthetic */ Activity val$activity;
        final /* synthetic */ String val$buttonText;
        final /* synthetic */ String val$cancelButtonText;
        final /* synthetic */ FragmentManager val$fragmentManager;
        final /* synthetic */ String val$message;
        final /* synthetic */ View.OnClickListener val$onCancelListener;
        final /* synthetic */ View.OnClickListener val$onClickListener;
        final /* synthetic */ DialogInterface.OnDismissListener val$onDismissListener;
        final /* synthetic */ String val$title;

        /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.dialog.IDDialog$4$1 */
        class AnonymousClass1 implements Runnable {
            AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    MultipleOptionDialog multipleOptionDialog = new MultipleOptionDialog(str, str, str, str, onClickListener, onDismissListener, onClickListener);
                    multipleOptionDialog.setCancelable(false);
                    multipleOptionDialog.show(fragmentManager, "Tag");
                } catch (Exception unused) {
                }
            }
        }

        AnonymousClass4(Activity activity, String str, String str2, String str3, String str4, View.OnClickListener onClickListener, DialogInterface.OnDismissListener onDismissListener, View.OnClickListener onClickListener2, FragmentManager fragmentManager) {
            activity = activity;
            str = str;
            str = str2;
            str = str3;
            str = str4;
            onClickListener = onClickListener;
            onDismissListener = onDismissListener;
            onClickListener = onClickListener2;
            fragmentManager = fragmentManager;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            activity.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.dialog.IDDialog.4.1
                AnonymousClass1() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        MultipleOptionDialog multipleOptionDialog = new MultipleOptionDialog(str, str, str, str, onClickListener, onDismissListener, onClickListener);
                        multipleOptionDialog.setCancelable(false);
                        multipleOptionDialog.show(fragmentManager, "Tag");
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    static /* synthetic */ void lambda$pingReintentNews$0(Context context, Activity activity, ConnectionCallback connectionCallback) throws Exception {
        try {
            IDSecurityApiImpl iDSecurityApiImpl = new IDSecurityApiImpl();
            URLConnection uRLConnectionOpenConnection = new URL(IDEndPoints.getCurrentInstance().getGetEnrollmentReintenNews()).openConnection();
            Callback.openConnection(uRLConnectionOpenConnection);
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestProperty("API-KEY", ((IDCredentials) Objects.requireNonNull(iDSecurityApiImpl.getIdNowCredentials(context, activity))).getApiKey());
            httpURLConnection.setRequestProperty("API-USER", ((IDCredentials) Objects.requireNonNull(iDSecurityApiImpl.getIdNowCredentials(context, activity))).getApiUser());
            httpURLConnection.setConnectTimeout(HttpUrlConnectionNetworkFetcher.HTTP_DEFAULT_TIMEOUT);
            Callback.connect(httpURLConnection);
            if (Callback.getResponseCode(httpURLConnection) != 404) {
                connectionCallback.onConnectionResponse(true);
            } else {
                connectionCallback.onConnectionResponse(false);
            }
        } catch (IOException unused) {
            connectionCallback.onConnectionResponse(false);
        }
    }

    static /* synthetic */ void lambda$showPreConnectionPopup$1(FragmentManager fragmentManager, Activity activity, Integer num, Context context, ConnectionAliveCallback connectionAliveCallback) {
        try {
            ConnectivityDialog connectivityDialog = new ConnectivityDialog();
            f18224d = connectivityDialog;
            connectivityDialog.setCancelable(false);
            f18224d.show(fragmentManager, "Tag");
            new Timer().schedule(new AnonymousClass1(activity, num, fragmentManager, context, connectionAliveCallback), 5000L);
        } catch (Exception unused) {
            connectionAliveCallback.onFinished(true);
        }
    }

    static /* synthetic */ void lambda$showPreConnectionPopup$3(FragmentManager fragmentManager, Activity activity, Integer num, Context context, ConnectionAliveCallback connectionAliveCallback) {
        try {
            f18224d.show(fragmentManager, "Tag");
            new Timer().schedule(new AnonymousClass2(activity, num, fragmentManager, context, connectionAliveCallback), 10000L);
        } catch (Exception unused) {
            connectionAliveCallback.onFinished(true);
        }
    }

    static /* synthetic */ void lambda$showPreConnectionPopup$5(final ConnectionAliveCallback connectionAliveCallback, final Integer num, final Activity activity, final FragmentManager fragmentManager, final Context context, Boolean bool) {
        if (bool.booleanValue()) {
            ConnectivityDialog connectivityDialog = f18224d;
            if (connectivityDialog != null) {
                connectivityDialog.dismissPopup(connectionAliveCallback, true);
                return;
            } else {
                connectionAliveCallback.onFinished(true);
                return;
            }
        }
        if (num.intValue() == 2) {
            activity.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.dialog.IDDialog$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    IDDialog.lambda$showPreConnectionPopup$1(fragmentManager, activity, num, context, connectionAliveCallback);
                }
            });
        } else if (num.intValue() != 1) {
            activity.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.dialog.IDDialog$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    IDDialog.f18224d.dismissPopup(connectionAliveCallback, false);
                }
            });
        } else {
            activity.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.dialog.IDDialog$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    IDDialog.f18224d.dismiss();
                }
            });
            activity.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.dialog.IDDialog$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    IDDialog.lambda$showPreConnectionPopup$3(fragmentManager, activity, num, context, connectionAliveCallback);
                }
            });
        }
    }

    public static void pingReintentNews(final Activity activity, final Context context, final ConnectionCallback connectionCallback) {
        AsyncTask.execute(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.dialog.IDDialog$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() throws Exception {
                IDDialog.lambda$pingReintentNews$0(context, activity, connectionCallback);
            }
        });
    }

    public static void showDialog(FragmentManager fragmentManager, Activity activity, Context context, String str, String str2, String str3, View.OnClickListener onClickListener) {
        new Timer().schedule(new TimerTask() { // from class: com.ticnow.sdk.idnowonboarding.dialog.IDDialog.3
            final /* synthetic */ Activity val$activity;
            final /* synthetic */ String val$buttonText;
            final /* synthetic */ FragmentManager val$fragmentManager;
            final /* synthetic */ String val$message;
            final /* synthetic */ View.OnClickListener val$onClickListener;
            final /* synthetic */ String val$title;

            /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.dialog.IDDialog$3$1 */
            class AnonymousClass1 implements Runnable {
                AnonymousClass1() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        SimpleOptionDialog simpleOptionDialog = new SimpleOptionDialog(str, str, str, onClickListener);
                        simpleOptionDialog.setCancelable(false);
                        simpleOptionDialog.show(fragmentManager, "Tag");
                    } catch (Exception unused) {
                    }
                }
            }

            AnonymousClass3(Activity activity2, String str4, String str22, String str32, View.OnClickListener onClickListener2, FragmentManager fragmentManager2) {
                activity = activity2;
                str = str4;
                str = str22;
                str = str32;
                onClickListener = onClickListener2;
                fragmentManager = fragmentManager2;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                activity.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.dialog.IDDialog.3.1
                    AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            SimpleOptionDialog simpleOptionDialog = new SimpleOptionDialog(str, str, str, onClickListener);
                            simpleOptionDialog.setCancelable(false);
                            simpleOptionDialog.show(fragmentManager, "Tag");
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        }, 200L);
    }

    public static void showDialog(FragmentManager fragmentManager, Activity activity, Context context, String str, String str2, String str3, String str4, View.OnClickListener onClickListener, DialogInterface.OnDismissListener onDismissListener, View.OnClickListener onClickListener2) {
        new Timer().schedule(new TimerTask() { // from class: com.ticnow.sdk.idnowonboarding.dialog.IDDialog.4
            final /* synthetic */ Activity val$activity;
            final /* synthetic */ String val$buttonText;
            final /* synthetic */ String val$cancelButtonText;
            final /* synthetic */ FragmentManager val$fragmentManager;
            final /* synthetic */ String val$message;
            final /* synthetic */ View.OnClickListener val$onCancelListener;
            final /* synthetic */ View.OnClickListener val$onClickListener;
            final /* synthetic */ DialogInterface.OnDismissListener val$onDismissListener;
            final /* synthetic */ String val$title;

            /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.dialog.IDDialog$4$1 */
            class AnonymousClass1 implements Runnable {
                AnonymousClass1() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        MultipleOptionDialog multipleOptionDialog = new MultipleOptionDialog(str, str, str, str, onClickListener, onDismissListener, onClickListener);
                        multipleOptionDialog.setCancelable(false);
                        multipleOptionDialog.show(fragmentManager, "Tag");
                    } catch (Exception unused) {
                    }
                }
            }

            AnonymousClass4(Activity activity2, String str5, String str22, String str32, String str42, View.OnClickListener onClickListener3, DialogInterface.OnDismissListener onDismissListener2, View.OnClickListener onClickListener22, FragmentManager fragmentManager2) {
                activity = activity2;
                str = str5;
                str = str22;
                str = str32;
                str = str42;
                onClickListener = onClickListener3;
                onDismissListener = onDismissListener2;
                onClickListener = onClickListener22;
                fragmentManager = fragmentManager2;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                activity.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.dialog.IDDialog.4.1
                    AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            MultipleOptionDialog multipleOptionDialog = new MultipleOptionDialog(str, str, str, str, onClickListener, onDismissListener, onClickListener);
                            multipleOptionDialog.setCancelable(false);
                            multipleOptionDialog.show(fragmentManager, "Tag");
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        }, 200L);
    }

    public static void showPreConnectionPopup(final Integer num, final FragmentManager fragmentManager, final Activity activity, final Context context, final ConnectionAliveCallback connectionAliveCallback) {
        pingReintentNews(activity, context, new ConnectionCallback() { // from class: com.ticnow.sdk.idnowonboarding.dialog.IDDialog$$ExternalSyntheticLambda1
            @Override // com.ticnow.sdk.idnowonboarding.connectivity.ConnectionCallback
            public final void onConnectionResponse(Boolean bool) {
                IDDialog.lambda$showPreConnectionPopup$5(connectionAliveCallback, num, activity, fragmentManager, context, bool);
            }
        });
    }
}
