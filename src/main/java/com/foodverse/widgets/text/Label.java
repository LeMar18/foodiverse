package com.foodverse.widgets.text;

import com.foodverse.utility.core.Text;
import com.foodverse.utility.core.TextStyle;
import com.foodverse.utility.core.TextStyle.FontWeight;

public final class Label extends Text {

    public Label(String data, LabelSize fontSize) {
        this(data, fontSize, false);
    }

    public Label(String data, LabelSize fontSize, boolean isMono) {
        super(data, getTextStyle(fontSize, isMono));
    }

    public static TextStyle getTextStyle(LabelSize fontSize, boolean isMono) {
        return new TextStyle.Builder()
                .family(isMono ? "IBM Plex Mono" : "Inter")
                .weight(FontWeight.MEDIUM)
                .size(fontSize.getSize())
                .build();
    }

    public static TextStyle getTextStyle(LabelSize fontSize) {
        return getTextStyle(fontSize, false);
    }

    public enum LabelSize {
        XS(12), S(14), M(16), L(18);

        private final int size;

        LabelSize(int size) {
            this.size = size;
        }

        public int getSize() {
            return size;
        }

    }

}
