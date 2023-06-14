
package com.ua.alex.swing;

import com.ua.alex.model.ModelMenu;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class ListMenu<E extends Object> extends JList<E>{
    
    private DefaultListModel model;

    public ListMenu() {
        model = new DefaultListModel();
        setModel(model);
    }

    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                ModelMenu data;
                if (value instanceof ModelMenu) {
                    data = (ModelMenu) value;
                } else {
                    data = new ModelMenu("", value + "", ModelMenu.MenuType.EMPTY);
                }
                MenuItem item = new MenuItem(data);
                
                return item;
            }   
        };
    }

    public void addItem(ModelMenu data){
        model.addElement(data);
    }
}
