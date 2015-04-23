/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.ide.eclipse.preferences;

import jd.ide.eclipse.JavaDecompilerPlugin;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * Class used to initialize default preference values.
 * 
 * @project Java Decompiler Eclipse Plugin
 * @version 0.1.3
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer 
{
	/**
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() 
	{
		IPreferenceStore store = JavaDecompilerPlugin.getDefault().getPreferenceStore();
		store.setDefault(JavaDecompilerPlugin.PREF_ESCAPE_UNICODE_CHARACTERS, false);
		store.setDefault(JavaDecompilerPlugin.PREF_OMIT_PREFIX_THIS, false);
		store.setDefault(JavaDecompilerPlugin.PREF_REALIGN_LINE_NUMBERS, true);
		store.setDefault(JavaDecompilerPlugin.PREF_SHOW_LINE_NUMBERS, true);
		store.setDefault(JavaDecompilerPlugin.PREF_SHOW_DEFAULT_CONSTRUCTOR, false);
		store.setDefault(JavaDecompilerPlugin.PREF_SHOW_METADATA, true);
	}
}
