package segmented_control.widget.custom.android.com.segmentedcontrol.item_row_column;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;

/**
 * Created by Robert Apikyan on 9/11/2017.
 */

public class SegmentDecoration {
    public static final int DEFAULT_FOCUSED_BACKGROUND_ALPHA = 36;
    public static final int DEFAULT_SELECTION_ANIMATION_DURATION = 196;

    // segment decoration
    // stroke
    @ColorInt
    public int selectedStrokeColor;
    @ColorInt
    public int unSelectedStrokeColor;
    public int strokeWidth;
    // background
    @ColorInt
    public int selectBackgroundColor;
    @ColorInt
    public int unSelectedBackgroundColor;
    // focused segment background
    public int focusedBackgroundColor;
    // selection Animation Duration
    public int selectionAnimationDuration;
    // text
    @ColorInt
    public int selectedTextColor;
    @ColorInt
    public int unSelectedTextColor;
    public int textSize;
    // text padding
    public int textHorizontalPadding;
    public int textVerticalPadding;

    // segment margins
    public int segmentVerticalMargin;
    public int segmentHorizontalMargin;

    // segment font type
    public Typeface typeface;

    // radius
    public int topLeftRadius;
    public int topRightRadius;
    public int bottomRightRadius;
    public int bottomLeftRadius;
    public boolean radiusForEverySegment = false; // def. value

    public static SegmentDecoration createDefault(Context context, int accentColor) {
        SegmentDecoration sd = new SegmentDecoration();
        sd.selectedStrokeColor = accentColor;
        sd.unSelectedStrokeColor = accentColor;
        sd.selectBackgroundColor = accentColor;
        sd.unSelectedBackgroundColor = ContextCompat.getColor(context, android.R.color.transparent);
        sd.focusedBackgroundColor = Color.argb(DEFAULT_FOCUSED_BACKGROUND_ALPHA,
                Color.red(accentColor),
                Color.green(accentColor),
                Color.blue(accentColor));
        sd.selectionAnimationDuration = DEFAULT_SELECTION_ANIMATION_DURATION;
        sd.selectedTextColor = ContextCompat.getColor(context, android.R.color.white);
        sd.unSelectedTextColor = accentColor;
        sd.strokeWidth = 1;
        sd.typeface = null;
        return sd;
    }

    public int getSelectedStrokeColor() {
        return selectedStrokeColor;
    }

    public int getUnSelectedStrokeColor() {
        return unSelectedStrokeColor;
    }

    public int getStrokeWidth() {
        return strokeWidth;
    }

    public int getSelectBackgroundColor() {
        return selectBackgroundColor;
    }

    public int getUnSelectedBackgroundColor() {
        return unSelectedBackgroundColor;
    }

    public int getFocusedBackgroundColor() {
        return focusedBackgroundColor;
    }

    public int getSelectionAnimationDuration() {
        return selectionAnimationDuration;
    }

    public int getSelectedTextColor() {
        return selectedTextColor;
    }

    public int getUnSelectedTextColor() {
        return unSelectedTextColor;
    }

    public int getTextSize() {
        return textSize;
    }

    public int getTextHorizontalPadding() {
        return textHorizontalPadding;
    }

    public int getTextVerticalPadding() {
        return textVerticalPadding;
    }

    public int getSegmentVerticalMargin() {
        return segmentVerticalMargin;
    }

    public int getSegmentHorizontalMargin() {
        return segmentHorizontalMargin;
    }

    public int getTopLeftRadius() {
        return topLeftRadius;
    }

    public int getTopRightRadius() {
        return topRightRadius;
    }

    public int getBottomRightRadius() {
        return bottomRightRadius;
    }

    public int getBottomLeftRadius() {
        return bottomLeftRadius;
    }

    public boolean isRadiusForEverySegment() {
        return radiusForEverySegment;
    }

    public Typeface getTypeface() {
        return typeface;
    }

    ;
}
