/**
 * 
 */
package cn.salesuite.saf.plugin;

import cn.salesuite.saf.app.SAFActivity;
import android.content.Intent;
import android.os.Bundle;

/**
 * @author Tony Shen
 *
 */
public class BasePluginActivity extends SAFActivity implements IPlugin{

	@Override
	public void onCreate(Bundle savedInstanceState) {
	}

	@Override
	public void onStart() {
		super.onStart();
	}

	@Override
	public void onRestart() {
		super.onRestart();
	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
	}

	@Override
	public void onResume() {
		super.onResume();
	}

	@Override
	public void onPause() {
		super.onPause();
	}

	@Override
	public void onStop() {
		super.onStop();
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
	}
}
