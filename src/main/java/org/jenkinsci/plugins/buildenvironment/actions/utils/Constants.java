package org.jenkinsci.plugins.buildenvironment.actions.utils;

import java.awt.Color;

/**
 * Global Constants.
 * 
 * @author yboev
 * 
 */
public final class Constants {
    /**
     * Url for this plugin.
     */
    public static final String URL = "compare_environment";
    /**
     * Not Applicable, Not Available.
     */
    public static final String NA = "N/A";
    /**
     * Name.
     */
    public static final String NAME = "Compare environment";
    /**
     * Icon.
     */
    public static final String MENUICONFILENAME = "/plugin/build-environment/icons/menu_icon.png";
    public static final String SUMMARYICONFILENAME = "/plugin/build-environment/icons/summary_icon.png";
    public static Color BackgroundDifferenceColor = new Color(255, 68, 68);
    public static Color BackgroundNoDifferenceColor = new Color(187, 187, 187);

    public static String getBackgroundNoDifferenceColorAsString() {
        return Integer.toHexString(Constants.BackgroundNoDifferenceColor.getRGB())
                .substring(2, 7);
    }
    public static String getBackgroundDifferenceColorAsString() {
        return Integer.toHexString(Constants.BackgroundDifferenceColor.getRGB())
                .substring(2, 7);
    }
}
