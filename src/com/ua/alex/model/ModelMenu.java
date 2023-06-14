
package com.ua.alex.model;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ModelMenu {
    String icon;
    String name;
    MenuType type;

    public ModelMenu() {
    }

    public ModelMenu(String icon, String name, MenuType type) {
        this.icon = icon;
        this.name = name;
        this.type = type;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuType getType() {
        return type;
    }

    public void setType(MenuType type) {
        this.type = type;
    }
    
    public static enum MenuType {
        TITLE, MENU, EMPTY
    }
    
    public Icon toIcon(){
        return new ImageIcon(getClass().getResource("/com/ua/alex/icon/"+ icon + ".png"));
    }
}
