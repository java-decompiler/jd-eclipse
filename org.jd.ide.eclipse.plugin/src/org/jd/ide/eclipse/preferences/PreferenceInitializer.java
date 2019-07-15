/*
 * Copyright (c) 2008, 2019 Emmanuel Dupuy.
 * This project is distributed under the GPLv3 license.
 * This is a Copyleft license that gives the user the right to use,
 * copy and modify the code freely for non-commercial purposes.
 */

package org.jd.ide.eclipse.preferences;

import org.jd.ide.eclipse.JavaDecompilerPlugin;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * Class used to initialize default preference values.
 * 
 * @project Java Decompiler Eclipse Plugin
 * @version 0.1.3
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {
	/**
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = JavaDecompilerPlugin.getDefault().getPreferenceStore();
		store.setDefault(JavaDecompilerPlugin.PREF_ESCAPE_UNICODE_CHARACTERS, false);
		store.setDefault(JavaDecompilerPlugin.PREF_REALIGN_LINE_NUMBERS, true);
		store.setDefault(JavaDecompilerPlugin.PREF_SHOW_LINE_NUMBERS, true);
		store.setDefault(JavaDecompilerPlugin.PREF_SHOW_METADATA, true);
	}
}
