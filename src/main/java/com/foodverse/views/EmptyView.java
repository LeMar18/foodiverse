package com.foodverse.views;

import java.awt.Component;

import com.foodverse.utility.common.UIConstants;
import com.foodverse.utility.core.Widget;
import com.foodverse.utility.layout.Align;
import com.foodverse.utility.layout.EdgeInsets;
import com.foodverse.utility.ui.ColoredBox;
import com.foodverse.widgets.layout.Row;
import com.foodverse.widgets.text.Label;
import com.foodverse.widgets.text.Label.LabelSize;

public final class EmptyView extends Widget {

    private final Component component;

    public EmptyView() {
        this(UIConstants.EMPTY_STATE_MESSAGE);
    }

    public EmptyView(String message) {
        var warningText = new Label(message, LabelSize.S);
        var emptyView = new Row();
        emptyView.addWidget(warningText, new EdgeInsets.Builder()
                .all(24)
                .build(),
            Align.CENTER);
        var decoratedView = new ColoredBox(emptyView);
        // Add padding to the empty view
        var paddedView = new Row();
        paddedView.addComponent(decoratedView, new EdgeInsets.Builder()
                .symmetric(16, 48)
                .bottom(24)
                .build(),
            Align.CENTER);
        component = paddedView.getRef();
    }

    @Override
    public Component getRef() {
        return component;
    }

}
