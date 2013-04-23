
package jp.mixi.practice.fragment.beg;

import jp.mixi.practice.fragment.beg.SubFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		FragmentManager manager = getSupportFragmentManager();
		// FragmentTransaction を開始
		FragmentTransaction transaction = manager.beginTransaction();

		// FragmentContainer のレイアウトに、MyFragment を割当てる
		transaction.add(R.id.FragmentContainer, SubFragment.newInstance());

		// 変更を確定して FragmentTransaction を終える
		transaction.commit();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
