package com.sanojpunchihewa.glowbutton;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import java.util.Arrays;

public class GlowButton extends AppCompatButton implements View.OnTouchListener {

    private int mBackgroundColor;

    private int mGlowColor;

    private int mUnpressedGlowSize;

    private int mPressedGlowSize;

    private int mCornerRadius;

    public GlowButton(final Context context) {
        super(context);
        this.setStateListAnimator(null);
        setOnTouchListener(this);
        initDefaultValues();
    }

    public GlowButton(final Context context, final AttributeSet attrs) {
        super(context, attrs);
        this.setStateListAnimator(null);
        setOnTouchListener(this);
        initDefaultValues();
        parseAttrs(context, attrs);
    }

    public GlowButton(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.setStateListAnimator(null);
        setOnTouchListener(this);
        initDefaultValues();
        parseAttrs(context, attrs);
    }

    @Override
    public boolean onTouch(final View v, final MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case MotionEvent.ACTION_DOWN:
                setBackground(getBackgroundWithGlow(this, mBackgroundColor,
                        mGlowColor, mCornerRadius, mUnpressedGlowSize, mPressedGlowSize));
                break;
            case MotionEvent.ACTION_UP:
                setBackground(getBackgroundWithGlow(this, mBackgroundColor,
                        mGlowColor, mCornerRadius, mUnpressedGlowSize, mUnpressedGlowSize));
                break;
        }
        return false;
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        updateButtonGlow();
    }

    @SuppressLint("ResourceAsColor")
    private void parseAttrs(Context context, AttributeSet attrs) {

        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.GlowButton);
        if (typedArray == null) {
            return;
        }
        for (int i = 0; i < typedArray.getIndexCount(); i++) {
            int attr = typedArray.getIndex(i);
            if (attr == R.styleable.GlowButton_buttonColor) {
                mBackgroundColor = typedArray.getColor(attr, R.color.default_background_color);
            } else if (attr == R.styleable.GlowButton_glowColor) {
                mGlowColor = typedArray.getColor(attr, R.color.default_glow_color);
            } else if (attr == R.styleable.GlowButton_cornerRadius) {
                mCornerRadius = typedArray.getDimensionPixelSize(attr, R.dimen.default_corner_radius);
            } else if (attr == R.styleable.GlowButton_unpressedGlowSize) {
                mUnpressedGlowSize = typedArray.getDimensionPixelSize(attr, R.dimen.default_unpressed_glow_size);
            } else if (attr == R.styleable.GlowButton_pressedGlowSize) {
                mPressedGlowSize = typedArray.getDimensionPixelSize(attr, R.dimen.default_pressed_glow_size);
            }
        }
        typedArray.recycle();
    }

    private void updateButtonGlow() {
        setBackground(getBackgroundWithGlow(this, mBackgroundColor,
                mGlowColor, mCornerRadius, mUnpressedGlowSize, mUnpressedGlowSize));
    }

    private void initDefaultValues() {

        Resources resources = getResources();
        if (resources == null) {
            return;
        }
        mBackgroundColor = resources.getColor(R.color.default_background_color);
        mGlowColor = resources.getColor(R.color.default_glow_color);
        mCornerRadius = resources.getDimensionPixelSize(R.dimen.default_corner_radius);
        mUnpressedGlowSize = resources.getDimensionPixelSize(R.dimen.default_unpressed_glow_size);
        mPressedGlowSize = resources.getDimensionPixelSize(R.dimen.default_pressed_glow_size);

    }

    public void setBackgroundColor(int backgroundColor) {
        mBackgroundColor = backgroundColor;
        updateButtonGlow();
    }

    public int getBackgroundColor() {
        return mBackgroundColor;
    }

    public void setGlowColor(int glowColor) {
        mGlowColor = glowColor;
        updateButtonGlow();
    }

    public int getGlowColor() {
        return mGlowColor;
    }

    public void setUnpressedGlowSize(int unpressedGlowSize) {
        mUnpressedGlowSize = unpressedGlowSize;
        updateButtonGlow();
    }

    public int getUnpressedGlowSize() {
        return mUnpressedGlowSize;
    }

    public void setPressedGlowSize(int pressedGlowSize) {
        mPressedGlowSize = pressedGlowSize;
        updateButtonGlow();
    }

    public int getPressedGlowSize() {
        return mPressedGlowSize;
    }

    public void setCornerRadius(int cornerRadius) {
        mCornerRadius = cornerRadius;
        updateButtonGlow();
    }

    public int getCornerRadius() {
        return mCornerRadius;
    }

    public static Drawable getBackgroundWithGlow(View view, int backgroundColor,
            int glowColor,
            int cornerRadius,
            int unPressedGlowSize,
            int pressedGlowSize) {

        float[] outerRadius = new float[8];
        Arrays.fill(outerRadius, cornerRadius);

        Rect shapeDrawablePadding = new Rect();

        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(shapeDrawablePadding);

        shapeDrawable.getPaint().setColor(backgroundColor);
        shapeDrawable.getPaint().setShadowLayer(pressedGlowSize, 0, 0, glowColor);

        view.setLayerType(LAYER_TYPE_SOFTWARE, shapeDrawable.getPaint());

        shapeDrawable.setShape(new RoundRectShape(outerRadius, null, null));

        LayerDrawable drawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        drawable.setLayerInset(0, unPressedGlowSize, unPressedGlowSize, unPressedGlowSize, unPressedGlowSize);

        return drawable;

    }
}
