/*
 * Copyright 2020 FormDev Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.formdev.flatlaf.extras.components;

import static com.formdev.flatlaf.FlatClientProperties.*;
import java.awt.Color;
import java.awt.Insets;
import javax.swing.Icon;
import javax.swing.JTextField;

/**
 * Subclass of {@link JTextField} that provides easy access to FlatLaf specific client properties.
 *
 * @author Karl Tauber
 */
public class FlatTextField
	extends JTextField
	implements FlatComponentExtension, FlatStyleableComponent
{
	/**
	 * Returns the placeholder text that is only painted if the text field is empty.
	 */
	public String getPlaceholderText() {
		return (String) getClientProperty( PLACEHOLDER_TEXT );
	}

	/**
	 * Sets the placeholder text that is only painted if the text field is empty.
	 */
	public void setPlaceholderText( String placeholderText ) {
		putClientProperty( PLACEHOLDER_TEXT, placeholderText );
	}


	/**
	 * Returns the leading icon that will be placed at the leading edge of the text field.
	 *
	 * @since 2
	 */
	public Icon getLeadingIcon() {
		return (Icon) getClientProperty( TEXT_FIELD_LEADING_ICON );
	}

	/**
	 * Specifies the leading icon that will be placed at the leading edge of the text field.
	 *
	 * @since 2
	 */
	public void setLeadingIcon( Icon leadingIcon ) {
		putClientProperty( TEXT_FIELD_LEADING_ICON, leadingIcon );
	}


	/**
	 * Returns the trailing icon that will be placed at the trailing edge of the text field.
	 *
	 * @since 2
	 */
	public Icon getTrailingIcon() {
		return (Icon) getClientProperty( TEXT_FIELD_TRAILING_ICON );
	}

	/**
	 * Specifies the trailing icon that will be placed at the trailing edge of the text field.
	 *
	 * @since 2
	 */
	public void setTrailingIcon( Icon trailingIcon ) {
		putClientProperty( TEXT_FIELD_TRAILING_ICON, trailingIcon );
	}


	// NOTE: enum names must be equal to allowed strings
	public enum SelectAllOnFocusPolicy { never, once, always };

	/**
	 * Returns whether all text is selected when the text component gains focus.
	 */
	public SelectAllOnFocusPolicy getSelectAllOnFocusPolicy() {
		return getClientPropertyEnumString( SELECT_ALL_ON_FOCUS_POLICY, SelectAllOnFocusPolicy.class,
			"TextComponent.selectAllOnFocusPolicy", SelectAllOnFocusPolicy.once );
	}

	/**
	 * Specifies whether all text is selected when the text component gains focus.
	 */
	public void setSelectAllOnFocusPolicy( SelectAllOnFocusPolicy selectAllOnFocusPolicy ) {
		putClientPropertyEnumString( SELECT_ALL_ON_FOCUS_POLICY, selectAllOnFocusPolicy );
	}


	/**
	 * Returns the padding of the text.
	 *
	 * @since 1.4
	 */
	public Insets getPadding() {
		return (Insets) getClientProperty( TEXT_FIELD_PADDING );
	}

	/**
	 * Specifies the padding of the text.
	 * This changes the location and size of the text view within the component bounds,
	 * but does not affect the size of the component.
	 *
	 * @since 1.4
	 */
	public void setPadding( Insets padding ) {
		putClientProperty( TEXT_FIELD_PADDING, padding );
	}


	/**
	 * Returns minimum width of a component.
	 */
	public int getMinimumWidth() {
		return getClientPropertyInt( MINIMUM_WIDTH, "Component.minimumWidth" );
	}

	/**
	 * Specifies minimum width of a component.
	 */
	public void setMinimumWidth( int minimumWidth ) {
		putClientProperty( MINIMUM_WIDTH, (minimumWidth >= 0) ? minimumWidth : null );
	}


	/**
	 * Returns whether the component is painted with round edges.
	 */
	public boolean isRoundRect() {
		return getClientPropertyBoolean( COMPONENT_ROUND_RECT, false );
	}

	/**
	 * Specifies whether the component is painted with round edges.
	 */
	public void setRoundRect( boolean roundRect ) {
		putClientPropertyBoolean( COMPONENT_ROUND_RECT, roundRect, false );
	}


	/**
	 * Returns the outline color of the component border.
	 */
	public Object getOutline() {
		return getClientProperty( OUTLINE );
	}

	/**
	 * Specifies the outline color of the component border.
	 * <p>
	 * Allowed Values are:
	 * <ul>
	 *     <li>{@code null}
	 *     <li>string {@code "error"}
	 *     <li>string {@code "warning"}
	 *     <li>any color (type {@link Color})
	 *     <li>an array of two colors (type {@link Color}[2]) where the first color
	 *         is for focused state and the second for unfocused state
	 * </ul>
	 */
	public void setOutline( Object outline ) {
		putClientProperty( OUTLINE, outline );
	}
}
