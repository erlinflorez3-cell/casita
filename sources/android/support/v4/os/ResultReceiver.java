package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.os.IResultReceiver;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new Parcelable.Creator<ResultReceiver>() { // from class: android.support.v4.os.ResultReceiver.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ResultReceiver[] newArray(int i2) {
            return new ResultReceiver[i2];
        }
    };
    final Handler mHandler;
    final boolean mLocal;
    IResultReceiver mReceiver;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected void onReceiveResult(int i2, Bundle bundle) {
    }

    class MyRunnable implements Runnable {
        final int mResultCode;
        final Bundle mResultData;

        MyRunnable(int i2, Bundle bundle) {
            this.mResultCode = i2;
            this.mResultData = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultReceiver.this.onReceiveResult(this.mResultCode, this.mResultData);
        }
    }

    class MyResultReceiver extends IResultReceiver.Stub {
        MyResultReceiver() {
        }

        @Override // android.support.v4.os.IResultReceiver
        public void send(int i2, Bundle bundle) throws Throwable {
            if (ResultReceiver.this.mHandler == null) {
                ResultReceiver.this.onReceiveResult(i2, bundle);
                return;
            }
            Handler handler = ResultReceiver.this.mHandler;
            Object[] objArr = {ResultReceiver.this.new MyRunnable(i2, bundle)};
            Method method = Class.forName(Wg.Zd("yZOIGG\u001ep1 [\\\u0002\u0017k\u007fyl", (short) (OY.Xd() ^ 4698), (short) (OY.Xd() ^ 28482))).getMethod(Wg.vd("NLOO", (short) (C1580rY.Xd() ^ (-25695))), Class.forName(C1561oA.Xd("\\TjV$cYga)Nrlmacnh", (short) (ZN.Xd() ^ 773))));
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public ResultReceiver(Handler handler) {
        this.mLocal = true;
        this.mHandler = handler;
    }

    public void send(int i2, Bundle bundle) throws Throwable {
        if (this.mLocal) {
            Handler handler = this.mHandler;
            if (handler != null) {
                MyRunnable myRunnable = new MyRunnable(i2, bundle);
                Class<?> cls = Class.forName(C1626yg.Ud("/~|\n\u0015m\u000ft\u0013v\bL*\"'\u001c\u001b\u0001", (short) (OY.Xd() ^ 20321), (short) (OY.Xd() ^ 22786)));
                Class<?>[] clsArr = new Class[1];
                short sXd = (short) (Od.Xd() ^ (-13607));
                int[] iArr = new int["5r\u001a)\u001d&zX*\u0001#h60\u001fF\u0013\u0002".length()];
                QB qb = new QB("5r\u001a)\u001d&zX*\u0001#h60\u001fF\u0013\u0002");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd + i3)));
                    i3++;
                }
                clsArr[0] = Class.forName(new String(iArr, 0, i3));
                Object[] objArr = {myRunnable};
                Method method = cls.getMethod(EO.Od("Lr)N", (short) (FB.Xd() ^ 24902)), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr);
                    return;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            onReceiveResult(i2, bundle);
            return;
        }
        IResultReceiver iResultReceiver = this.mReceiver;
        if (iResultReceiver != null) {
            try {
                iResultReceiver.send(i2, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        synchronized (this) {
            if (this.mReceiver == null) {
                this.mReceiver = new MyResultReceiver();
            }
            parcel.writeStrongBinder(this.mReceiver.asBinder());
        }
    }

    ResultReceiver(Parcel parcel) {
        this.mLocal = false;
        this.mHandler = null;
        this.mReceiver = IResultReceiver.Stub.asInterface(parcel.readStrongBinder());
    }
}
