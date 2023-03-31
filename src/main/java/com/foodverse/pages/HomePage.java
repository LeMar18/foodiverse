package com.foodverse.pages;

import java.awt.Component;
import javax.swing.JPanel;
import com.foodverse.overlays.ShopOverlay;
import com.foodverse.utility.Button;
import com.foodverse.utility.Page;
import com.foodverse.utility.Router;
import com.foodverse.widgets.text.Heading;
import com.foodverse.widgets.text.Paragraph;
import com.foodverse.widgets.text.Heading.HeadingSize;
import com.foodverse.widgets.text.Paragraph.ParagraphSize;

public final class HomePage extends Page {

    @Override
    public Component getRef() {
        var panel = new JPanel();
        var text = new Heading("HomePage", HeadingSize.L);
        var buttonText = new Paragraph("Open ShopOverlay", ParagraphSize.M);
        var button = new Button(buttonText, e -> {
            Router.openOverlay(new ShopOverlay());
        });
        panel.add(text.getRef());
        panel.add(button.getRef());
        return panel;
    }

}