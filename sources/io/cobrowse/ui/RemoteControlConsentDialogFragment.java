package io.cobrowse.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.os.Bundle;
import io.cobrowse.CobrowseIO;
import io.cobrowse.R;
import io.cobrowse.Session;
import yg.CX;

/* JADX INFO: loaded from: classes3.dex */
public class RemoteControlConsentDialogFragment extends DialogFragment {
    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        setCancelable(false);
        return new AlertDialog.Builder(getActivity()).setTitle(R.string.cobrowse_remote_control_request_title).setMessage(R.string.cobrowse_approve_remote_control_description).setPositiveButton(R.string.cobrowse_approve_remote_control_button_yes, new DialogInterface.OnClickListener() { // from class: io.cobrowse.ui.RemoteControlConsentDialogFragment.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                Session sessionCurrentSession = CobrowseIO.instance().currentSession();
                if (sessionCurrentSession != null) {
                    sessionCurrentSession.setRemoteControl(Session.RemoteControlState.On, null);
                }
            }
        }).setNegativeButton(R.string.cobrowse_approve_remote_control_button_no, new DialogInterface.OnClickListener() { // from class: io.cobrowse.ui.RemoteControlConsentDialogFragment.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                Session sessionCurrentSession = CobrowseIO.instance().currentSession();
                if (sessionCurrentSession != null) {
                    sessionCurrentSession.setRemoteControl(Session.RemoteControlState.Rejected, null);
                }
            }
        }).create();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onDestroyView() {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }

    public void show(Activity activity) throws Exception {
        FragmentManager fragmentManager = activity.getFragmentManager();
        CX.ud();
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag("cobrowse-remote-control-consent-prompt");
        if (fragmentFindFragmentByTag != null) {
            fragmentTransactionBeginTransaction.remove(fragmentFindFragmentByTag);
        }
        show(fragmentTransactionBeginTransaction, "cobrowse-remote-control-consent-prompt");
    }
}
