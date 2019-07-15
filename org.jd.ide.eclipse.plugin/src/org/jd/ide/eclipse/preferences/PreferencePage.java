/*
 * Copyright (c) 2008, 2019 Emmanuel Dupuy.
 * This project is distributed under the GPLv3 license.
 * This is a Copyleft license that gives the user the right to use,
 * copy and modify the code freely for non-commercial purposes.
 */

package org.jd.ide.eclipse.preferences;

import org.jd.ide.eclipse.JavaDecompilerPlugin;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * PreferencePage
 * 
 * @project Java Decompiler Eclipse Plugin
 * @version 0.1.3
 */
public class PreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {
	public PreferencePage() {
		super(SWT.NONE);
		setDescription("JD-Eclipse preference page");
	}

	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
		Composite fieldEditorParent = getFieldEditorParent();
		
		new Label(fieldEditorParent, SWT.NONE);

		addField(new BooleanFieldEditor(
			JavaDecompilerPlugin.PREF_ESCAPE_UNICODE_CHARACTERS, 
			"Escape unicode characters", fieldEditorParent));
		addField(new BooleanFieldEditor(
			JavaDecompilerPlugin.PREF_REALIGN_LINE_NUMBERS, 
			"Realign line numbers", fieldEditorParent));
		addField(new BooleanFieldEditor(
			JavaDecompilerPlugin.PREF_SHOW_LINE_NUMBERS, 
			"Show original line numbers", fieldEditorParent));
		addField(new BooleanFieldEditor(
			JavaDecompilerPlugin.PREF_SHOW_METADATA, 
			"Show metadata", fieldEditorParent));
	}

	/**
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
		setPreferenceStore(JavaDecompilerPlugin.getDefault().getPreferenceStore());		
	}
}