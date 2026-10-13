package android.widget;

import android.content.Context;
import android.view.ViewGroup;

/**
 * Compile-time shape only — the composite dialog's vertical column.
 */
public class LinearLayout extends ViewGroup {

    public static final int HORIZONTAL = 0;
    /** Vertical stacking; the value is API-stable since API 1. */
    public static final int VERTICAL = 1;

    public LinearLayout(Context context) {
        super(context);
    }

    public void setOrientation(int orientation) {
        // stub
    }

    public void setBaselineAligned(boolean baselineAligned) {
        // stub
    }

    public void setGravity(int gravity) {
        // stub
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public float weight;
        public int gravity = -1;

        public LayoutParams(int width, int height) {
            super(width, height);
        }

        public LayoutParams(int width, int height, float weight) {
            super(width, height);
            this.weight = weight;
        }
    }
}
