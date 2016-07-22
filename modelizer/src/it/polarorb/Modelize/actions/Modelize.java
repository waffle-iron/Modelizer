package it.polarorb.Modelize.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.util.IconLoader;

/**
 * Created by erikist on 7/21/16.
 */
public class Modelize extends AnAction {

    // If you register the action from Java code, this constructor is used to set the menu item name
    // (optionally, you can specify the menu description and an icon to display next to the menu item).
    // You can omit this constructor when registering the action in the plugin.xml file.
    public Modelize() {
        // Set the menu item name.
        super("Modelize");
        //super("Modelize", "A tool for converting network resources into java classes", IconLoader.getIcon("/Mypackage/icon.png"));
        // Set the menu item name, description and icon.
        // super("Text _Boxes","Item description",IconLoader.getIcon("/Mypackage/icon.png"));
    }

    @Override
    public void actionPerformed(AnActionEvent e) {

    }
}
