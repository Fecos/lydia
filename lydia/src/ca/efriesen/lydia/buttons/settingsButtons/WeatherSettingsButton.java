package ca.efriesen.lydia.buttons.settingsButtons;

import android.app.Activity;
import android.app.FragmentManager;
import android.view.View;
import ca.efriesen.lydia.R;
import ca.efriesen.lydia.buttons.BaseButton;
import ca.efriesen.lydia.databases.Button;
import ca.efriesen.lydia.fragments.Settings.WeatherSettingsFragment;

/**
 * Created by eric on 2014-07-05.
 */
public class WeatherSettingsButton extends BaseButton {
	private Activity activity;

	public WeatherSettingsButton(Activity activity) {
		super(activity);
		this.activity = activity;
	}

	@Override
	public void onClick(View view, Button passed) {
		FragmentManager manager = activity.getFragmentManager();
		// start loading the settings fragment
		manager.beginTransaction()
				.setCustomAnimations(R.anim.container_slide_out_up, R.anim.container_slide_in_up, R.anim.container_slide_in_down, R.anim.container_slide_out_down)
				.replace(R.id.home_screen_fragment, new WeatherSettingsFragment())
				.addToBackStack(null)
				.commit();
	}
}
