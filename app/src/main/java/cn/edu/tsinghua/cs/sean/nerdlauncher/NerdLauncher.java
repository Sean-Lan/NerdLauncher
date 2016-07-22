package cn.edu.tsinghua.cs.sean.nerdlauncher;

import android.support.v4.app.Fragment;

public class NerdLauncher extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return NerdLauncherFragment.newInstance();
    }

}
