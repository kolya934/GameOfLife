package com.k934.gameoflife;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceCategory;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.preference.RingtonePreference;
import android.text.TextUtils;


import java.util.List;

/**
 * A {@link PreferenceActivity} that presents a set of application settings. On
 * handset devices, settings are presented as a single list. On tablets,
 * settings are split by category, with category headers shown to the left of
 * the list of settings.
 * <p/>
 * See <a href="http://developer.android.com/design/patterns/settings.html">
 * Android Design: Settings</a> for design guidelines and the <a
 * href="http://developer.android.com/guide/topics/ui/settings.html">Settings
 * API Guide</a> for more information on developing a Settings UI.
 */

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//http://startandroid.ru/ru/uroki/vse-uroki-spiskom/134-urok-71-preferences-kak-nastrojki-prilozhenija-preferenceactivity//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class SettingsActivity extends PreferenceActivity {
    private static final String OPTION_MINIMUM = "UNDERPOPULATION_VARIABLE";
    private static final String OPTION_MINIMUM_DEFAULT = "2";
    private static final String OPTION_MAXIMUM = "OVERPOPULATION_VARIABLE";
    private static final String OPTION_MAXIMUM_DEFAULT = "3";
    private static final String OPTION_SPAWN = "SPAWN_VARIABLE";
    private static final String OPTION_SPAWN_DEFAULT = "3";
    private static final String OPTION_ANIMATION_SPEED = "ANIMATION_SPEED_VARIABLE";
    private static final String OPTION_ANIMATION_SPEED_DEFAULT = "3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);
    }

    public static String getMinimumVariable(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).
                getString(OPTION_MINIMUM, OPTION_MINIMUM_DEFAULT);
    }

    public static String getMaximumVariable(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).
                getString(OPTION_MAXIMUM, OPTION_MAXIMUM_DEFAULT);
    }

    public static String getSpawnVariable(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).
                getString(OPTION_SPAWN, OPTION_SPAWN_DEFAULT);
    }

    //public static String getAnimationSpeed(Context context) {
    //    return PreferenceManager.getDefaultSharedPreferences(context).
    //            getString(OPTION_ANIMATION_SPEED, OPTION_ANIMATION_SPEED_DEFAULT);
    //}


}
