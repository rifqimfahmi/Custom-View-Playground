package com.github.rifqimfahmi.customviewplayground.customview

import android.animation.LayoutTransition
import android.animation.StateListAnimator
import android.content.Context
import android.content.res.ColorStateList
import android.content.res.Configuration
import android.content.res.Resources
import android.graphics.*
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.os.Handler
import android.os.IBinder
import android.os.Parcelable
import android.util.AttributeSet
import android.util.Log
import android.util.SparseArray
import android.view.*
import android.view.accessibility.AccessibilityEvent
import android.view.accessibility.AccessibilityNodeInfo
import android.view.accessibility.AccessibilityNodeProvider
import android.view.animation.Animation
import android.view.animation.LayoutAnimationController
import android.view.animation.Transformation
import android.view.autofill.AutofillId
import android.view.autofill.AutofillValue
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputConnection
import java.util.ArrayList

class LogCustomView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ViewGroup(context, attrs, defStyleAttr) {

    private val TAG = "LogCustomView"

    init {
        Log.d(TAG, "initiation")
    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        Log.d(TAG, "onLayout")
    }

    override fun getDrawingCacheQuality(): Int {
        Log.d(TAG, "getDrawingCacheQuality")
        return super.getDrawingCacheQuality()
    }

    override fun computeVerticalScrollRange(): Int {
        Log.d(TAG, "computeVerticalScrollRange")
        return super.computeVerticalScrollRange()
    }

//    override fun getAnimation(): Animation {
//        Log.d(TAG, "getAnimation")
//        return super.getAnimation()
//    }

    override fun onAttachedToWindow() {
        Log.d(TAG, "onAttachedToWindow")
        super.onAttachedToWindow()
    }

    override fun setX(x: Float) {
        Log.d(TAG, "setX")
        super.setX(x)
    }

    override fun getHorizontalFadingEdgeLength(): Int {
        Log.d(TAG, "getHorizontalFadingEdgeLength")
        return super.getHorizontalFadingEdgeLength()
    }

    override fun sendAccessibilityEvent(eventType: Int) {
        Log.d(TAG, "sendAccessibilityEvent")
        super.sendAccessibilityEvent(eventType)
    }

    override fun getPointerIcon(): PointerIcon {
        Log.d(TAG, "getPointerIcon")
        return super.getPointerIcon()
    }

    override fun setKeyboardNavigationCluster(isCluster: Boolean) {
        Log.d(TAG, "setKeyboardNavigationCluster")
        super.setKeyboardNavigationCluster(isCluster)
    }

    override fun setTranslationX(translationX: Float) {
        Log.d(TAG, "setTranslationX")
        super.setTranslationX(translationX)
    }

    override fun getNextFocusDownId(): Int {
        Log.d(TAG, "getNextFocusDownId")
        return super.getNextFocusDownId()
    }

    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        Log.d(TAG, "onCreateDrawableState")
        return super.onCreateDrawableState(extraSpace)
    }

    override fun setClipToOutline(clipToOutline: Boolean) {
        Log.d(TAG, "setClipToOutline")
        super.setClipToOutline(clipToOutline)
    }

    override fun setPivotY(pivotY: Float) {
        Log.d(TAG, "setPivotY")
        super.setPivotY(pivotY)
    }

    override fun computeHorizontalScrollRange(): Int {
        Log.d(TAG, "computeHorizontalScrollRange")
        return super.computeHorizontalScrollRange()
    }

    override fun setPressed(pressed: Boolean) {
        Log.d(TAG, "setPressed")
        super.setPressed(pressed)
    }

    override fun dispatchSetPressed(pressed: Boolean) {
        Log.d(TAG, "dispatchSetPressed")
        super.dispatchSetPressed(pressed)
    }

    override fun getAccessibilityPaneTitle(): CharSequence? {
        Log.d(TAG, "getAccessibilityPaneTitle")
        return super.getAccessibilityPaneTitle()
    }

    override fun onStartTemporaryDetach() {
        Log.d(TAG, "onStartTemporaryDetach")
        super.onStartTemporaryDetach()
    }

    override fun setLongClickable(longClickable: Boolean) {
        Log.d(TAG, "setLongClickable")
        super.setLongClickable(longClickable)
    }

    override fun setHorizontalScrollBarEnabled(horizontalScrollBarEnabled: Boolean) {
        Log.d(TAG, "setHorizontalScrollBarEnabled")
        super.setHorizontalScrollBarEnabled(horizontalScrollBarEnabled)
    }

    override fun getRightPaddingOffset(): Int {
        Log.d(TAG, "getRightPaddingOffset")
        return super.getRightPaddingOffset()
    }

    override fun hasFocus(): Boolean {
        Log.d(TAG, "hasFocus")
        return super.hasFocus()
    }

    override fun getDisplay(): Display {
        Log.d(TAG, "getDisplay")
        return super.getDisplay()
    }

    override fun setY(y: Float) {
        Log.d(TAG, "setY")
        super.setY(y)
    }

    override fun postInvalidateDelayed(delayMilliseconds: Long) {
        Log.d(TAG, "postInvalidateDelayed")
        super.postInvalidateDelayed(delayMilliseconds)
    }

    override fun postInvalidateDelayed(delayMilliseconds: Long, left: Int, top: Int, right: Int, bottom: Int) {
        Log.d(TAG, "postInvalidateDelayed")
        super.postInvalidateDelayed(delayMilliseconds, left, top, right, bottom)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Log.d(TAG, "onTouchEvent")
        return super.onTouchEvent(event)
    }

    override fun dispatchDrawableHotspotChanged(x: Float, y: Float) {
        Log.d(TAG, "dispatchDrawableHotspotChanged")
        super.dispatchDrawableHotspotChanged(x, y)
    }

    override fun setTranslationY(translationY: Float) {
        Log.d(TAG, "setTranslationY")
        super.setTranslationY(translationY)
    }

    override fun setPadding(left: Int, top: Int, right: Int, bottom: Int) {
        Log.d(TAG, "setPadding")
        super.setPadding(left, top, right, bottom)
    }

    override fun setBackgroundTintList(tint: ColorStateList?) {
        Log.d(TAG, "setBackgroundTintList")
        super.setBackgroundTintList(tint)
    }

    override fun getFocusable(): Int {
        Log.d(TAG, "getFocusable")
        return super.getFocusable()
    }

    override fun dispatchDisplayHint(hint: Int) {
        Log.d(TAG, "dispatchDisplayHint")
        super.dispatchDisplayHint(hint)
    }

    override fun scheduleDrawable(who: Drawable, what: Runnable, `when`: Long) {
        Log.d(TAG, "scheduleDrawable")
        super.scheduleDrawable(who, what, `when`)
    }

    override fun isVerticalScrollBarEnabled(): Boolean {
        Log.d(TAG, "isVerticalScrollBarEnabled")
        return super.isVerticalScrollBarEnabled()
    }

    override fun destroyDrawingCache() {
        Log.d(TAG, "destroyDrawingCache")
        super.destroyDrawingCache()
    }

    override fun getKeepScreenOn(): Boolean {
        Log.d(TAG, "getKeepScreenOn")
        return super.getKeepScreenOn()
    }

    override fun getWindowToken(): IBinder {
        Log.d(TAG, "getWindowToken")
        return super.getWindowToken()
    }

    override fun dispatchProvideStructure(structure: ViewStructure?) {
        Log.d(TAG, "dispatchProvideStructure")
        super.dispatchProvideStructure(structure)
    }

//    override fun getOverlay(): ViewOverlay {
//        Log.d(TAG, "getOverlay")
//        return super.getOverlay()
//    }

    override fun setZ(z: Float) {
        Log.d(TAG, "setZ")
        super.setZ(z)
    }

    override fun setOnFocusChangeListener(l: OnFocusChangeListener?) {
        Log.d(TAG, "setOnFocusChangeListener")
        super.setOnFocusChangeListener(l)
    }

    override fun setTooltipText(tooltipText: CharSequence?) {
        Log.d(TAG, "setTooltipText")
        super.setTooltipText(tooltipText)
    }

    override fun getVerticalScrollbarWidth(): Int {
        Log.d(TAG, "getVerticalScrollbarWidth")
        return super.getVerticalScrollbarWidth()
    }

    override fun onKeyShortcut(keyCode: Int, event: KeyEvent?): Boolean {
        Log.d(TAG, "onKeyShortcut")
        return super.onKeyShortcut(keyCode, event)
    }

    override fun requestRectangleOnScreen(rectangle: Rect?): Boolean {
        Log.d(TAG, "requestRectangleOnScreen")
        return super.requestRectangleOnScreen(rectangle)
    }

    override fun requestRectangleOnScreen(rectangle: Rect?, immediate: Boolean): Boolean {
        Log.d(TAG, "requestRectangleOnScreen")
        return super.requestRectangleOnScreen(rectangle, immediate)
    }

    override fun setOverScrollMode(overScrollMode: Int) {
        Log.d(TAG, "setOverScrollMode")
        super.setOverScrollMode(overScrollMode)
    }

    override fun setAutofillId(id: AutofillId?) {
        Log.d(TAG, "setAutofillId")
        super.setAutofillId(id)
    }

    override fun setForegroundTintMode(tintMode: PorterDuff.Mode?) {
        Log.d(TAG, "setForegroundTintMode")
        super.setForegroundTintMode(tintMode)
    }

    override fun getHitRect(outRect: Rect?) {
        Log.d(TAG, "getHitRect")
        super.getHitRect(outRect)
    }

    override fun dispatchPointerCaptureChanged(hasCapture: Boolean) {
        Log.d(TAG, "dispatchPointerCaptureChanged")
        super.dispatchPointerCaptureChanged(hasCapture)
    }

    override fun isImportantForAccessibility(): Boolean {
        Log.d(TAG, "isImportantForAccessibility")
        return super.isImportantForAccessibility()
    }

    override fun getParentForAccessibility(): ViewParent {
        Log.d(TAG, "getParentForAccessibility")
        return super.getParentForAccessibility()
    }

    override fun dispatchUnhandledMove(focused: View?, direction: Int): Boolean {
        Log.d(TAG, "dispatchUnhandledMove")
        return super.dispatchUnhandledMove(focused, direction)
    }

    override fun getTopPaddingOffset(): Int {
        Log.d(TAG, "getTopPaddingOffset")
        return super.getTopPaddingOffset()
    }

    override fun setActivated(activated: Boolean) {
        Log.d(TAG, "setActivated")
        super.setActivated(activated)
    }

    override fun setOnKeyListener(l: OnKeyListener?) {
        Log.d(TAG, "setOnKeyListener")
        super.setOnKeyListener(l)
    }

    override fun onFinishInflate() {
        Log.d(TAG, "onFinishInflate")
        super.onFinishInflate()
    }

    override fun performContextClick(x: Float, y: Float): Boolean {
        Log.d(TAG, "performContextClick")
        return super.performContextClick(x, y)
    }

    override fun performContextClick(): Boolean {
        Log.d(TAG, "performContextClick")
        return super.performContextClick()
    }

    override fun onSetAlpha(alpha: Int): Boolean {
        Log.d(TAG, "onSetAlpha")
        return super.onSetAlpha(alpha)
    }

    override fun getWindowSystemUiVisibility(): Int {
        Log.d(TAG, "getWindowSystemUiVisibility")
        return super.getWindowSystemUiVisibility()
    }

    override fun getNextFocusRightId(): Int {
        Log.d(TAG, "getNextFocusRightId")
        return super.getNextFocusRightId()
    }

    override fun onVisibilityAggregated(isVisible: Boolean) {
        Log.d(TAG, "onVisibilityAggregated")
        super.onVisibilityAggregated(isVisible)
    }

    override fun setPivotX(pivotX: Float) {
        Log.d(TAG, "setPivotX")
        super.setPivotX(pivotX)
    }

    override fun getViewTreeObserver(): ViewTreeObserver {
        Log.d(TAG, "getViewTreeObserver")
        return super.getViewTreeObserver()
    }

    override fun setFocusable(focusable: Boolean) {
        Log.d(TAG, "setFocusable")
        super.setFocusable(focusable)
    }

    override fun setFocusable(focusable: Int) {
        Log.d(TAG, "setFocusable")
        super.setFocusable(focusable)
    }

    override fun dispatchCapturedPointerEvent(event: MotionEvent?): Boolean {
        Log.d(TAG, "dispatchCapturedPointerEvent")
        return super.dispatchCapturedPointerEvent(event)
    }

    override fun onPopulateAccessibilityEvent(event: AccessibilityEvent?) {
        Log.d(TAG, "onPopulateAccessibilityEvent")
        super.onPopulateAccessibilityEvent(event)
    }

    override fun getResources(): Resources {
        Log.d(TAG, "getResources")
        return super.getResources()
    }

    override fun setScrollContainer(isScrollContainer: Boolean) {
        Log.d(TAG, "setScrollContainer")
        super.setScrollContainer(isScrollContainer)
    }

    override fun removeCallbacks(action: Runnable?): Boolean {
        Log.d(TAG, "removeCallbacks")
        return super.removeCallbacks(action)
    }

    override fun setBackground(background: Drawable?) {
        Log.d(TAG, "setBackground")
        super.setBackground(background)
    }

    override fun getBaseline(): Int {
        Log.d(TAG, "getBaseline")
        return super.getBaseline()
    }

    override fun isShown(): Boolean {
        Log.d(TAG, "isShown")
        return super.isShown()
    }

    override fun setId(id: Int) {
        Log.d(TAG, "setId")
        super.setId(id)
    }

    override fun isTextDirectionResolved(): Boolean {
        Log.d(TAG, "isTextDirectionResolved")
        return super.isTextDirectionResolved()
    }

    override fun isHapticFeedbackEnabled(): Boolean {
        Log.d(TAG, "isHapticFeedbackEnabled")
        return super.isHapticFeedbackEnabled()
    }

    override fun postInvalidateOnAnimation() {
        Log.d(TAG, "postInvalidateOnAnimation")
        super.postInvalidateOnAnimation()
    }

    override fun postInvalidateOnAnimation(left: Int, top: Int, right: Int, bottom: Int) {
        Log.d(TAG, "postInvalidateOnAnimation")
        super.postInvalidateOnAnimation(left, top, right, bottom)
    }

    override fun getLayoutDirection(): Int {
        Log.d(TAG, "getLayoutDirection")
        return super.getLayoutDirection()
    }

    override fun getOutlineProvider(): ViewOutlineProvider {
        Log.d(TAG, "getOutlineProvider")
        return super.getOutlineProvider()
    }

    override fun setBackgroundTintMode(tintMode: PorterDuff.Mode?) {
        Log.d(TAG, "setBackgroundTintMode")
        super.setBackgroundTintMode(tintMode)
    }

    override fun getForegroundGravity(): Int {
        Log.d(TAG, "getForegroundGravity")
        return super.getForegroundGravity()
    }

    override fun getCameraDistance(): Float {
        Log.d(TAG, "getCameraDistance")
        return super.getCameraDistance()
    }

    override fun onAnimationEnd() {
        Log.d(TAG, "onAnimationEnd")
        super.onAnimationEnd()
    }

    override fun getHandler(): Handler {
        Log.d(TAG, "getHandler")
        return super.getHandler()
    }

    override fun getLocationOnScreen(outLocation: IntArray?) {
        Log.d(TAG, "getLocationOnScreen")
        super.getLocationOnScreen(outLocation)
    }

    override fun getScrollBarStyle(): Int {
        Log.d(TAG, "getScrollBarStyle")
        return super.getScrollBarStyle()
    }

    override fun setContextClickable(contextClickable: Boolean) {
        Log.d(TAG, "setContextClickable")
        super.setContextClickable(contextClickable)
    }

    override fun scrollBy(x: Int, y: Int) {
        Log.d(TAG, "scrollBy")
        super.scrollBy(x, y)
    }

    override fun onCancelPendingInputEvents() {
        Log.d(TAG, "onCancelPendingInputEvents")
        super.onCancelPendingInputEvents()
    }

    override fun callOnClick(): Boolean {
        Log.d(TAG, "callOnClick")
        return super.callOnClick()
    }

    override fun setWillNotCacheDrawing(willNotCacheDrawing: Boolean) {
        Log.d(TAG, "setWillNotCacheDrawing")
        super.setWillNotCacheDrawing(willNotCacheDrawing)
    }

    override fun setAccessibilityPaneTitle(accessibilityPaneTitle: CharSequence?) {
        Log.d(TAG, "setAccessibilityPaneTitle")
        super.setAccessibilityPaneTitle(accessibilityPaneTitle)
    }

    override fun setNextFocusUpId(nextFocusUpId: Int) {
        Log.d(TAG, "setNextFocusUpId")
        super.setNextFocusUpId(nextFocusUpId)
    }

    override fun setLabelFor(id: Int) {
        Log.d(TAG, "setLabelFor")
        super.setLabelFor(id)
    }

    override fun isPivotSet(): Boolean {
        Log.d(TAG, "isPivotSet")
        return super.isPivotSet()
    }

    override fun setAccessibilityTraversalAfter(afterId: Int) {
        Log.d(TAG, "setAccessibilityTraversalAfter")
        super.setAccessibilityTraversalAfter(afterId)
    }

    override fun setImportantForAccessibility(mode: Int) {
        Log.d(TAG, "setImportantForAccessibility")
        super.setImportantForAccessibility(mode)
    }

    override fun onFinishTemporaryDetach() {
        Log.d(TAG, "onFinishTemporaryDetach")
        super.onFinishTemporaryDetach()
    }

    override fun dispatchRestoreInstanceState(container: SparseArray<Parcelable>?) {
        Log.d(TAG, "dispatchRestoreInstanceState")
        super.dispatchRestoreInstanceState(container)
    }

    override fun isPaddingRelative(): Boolean {
        Log.d(TAG, "isPaddingRelative")
        return super.isPaddingRelative()
    }

    override fun hasTransientState(): Boolean {
        Log.d(TAG, "hasTransientState")
        return super.hasTransientState()
    }

    override fun restoreHierarchyState(container: SparseArray<Parcelable>?) {
        Log.d(TAG, "restoreHierarchyState")
        super.restoreHierarchyState(container)
    }

    override fun requestFocus(direction: Int, previouslyFocusedRect: Rect?): Boolean {
        Log.d(TAG, "requestFocus")
        return super.requestFocus(direction, previouslyFocusedRect)
    }

    override fun getWindowVisibleDisplayFrame(outRect: Rect?) {
        Log.d(TAG, "getWindowVisibleDisplayFrame")
        super.getWindowVisibleDisplayFrame(outRect)
    }

    override fun getImportantForAutofill(): Int {
        Log.d(TAG, "getImportantForAutofill")
        return super.getImportantForAutofill()
    }

    override fun getRootView(): View {
        Log.d(TAG, "getRootView")
        return super.getRootView()
    }

    override fun onResolvePointerIcon(event: MotionEvent?, pointerIndex: Int): PointerIcon {
        Log.d(TAG, "onResolvePointerIcon")
        return super.onResolvePointerIcon(event, pointerIndex)
    }

    override fun performLongClick(): Boolean {
        Log.d(TAG, "performLongClick")
        return super.performLongClick()
    }

    override fun performLongClick(x: Float, y: Float): Boolean {
        Log.d(TAG, "performLongClick")
        return super.performLongClick(x, y)
    }

    override fun startActionMode(callback: ActionMode.Callback?): ActionMode {
        Log.d(TAG, "startActionMode")
        return super.startActionMode(callback)
    }

    override fun startActionMode(callback: ActionMode.Callback?, type: Int): ActionMode {
        Log.d(TAG, "startActionMode")
        return super.startActionMode(callback, type)
    }

    override fun awakenScrollBars(): Boolean {
        Log.d(TAG, "awakenScrollBars")
        return super.awakenScrollBars()
    }

    override fun awakenScrollBars(startDelay: Int): Boolean {
        Log.d(TAG, "awakenScrollBars")
        return super.awakenScrollBars(startDelay)
    }

    override fun awakenScrollBars(startDelay: Int, invalidate: Boolean): Boolean {
        Log.d(TAG, "awakenScrollBars")
        return super.awakenScrollBars(startDelay, invalidate)
    }

    override fun unscheduleDrawable(who: Drawable, what: Runnable) {
        Log.d(TAG, "unscheduleDrawable")
        super.unscheduleDrawable(who, what)
    }

    override fun unscheduleDrawable(who: Drawable?) {
        Log.d(TAG, "unscheduleDrawable")
        super.unscheduleDrawable(who)
    }

    override fun addOnLayoutChangeListener(listener: OnLayoutChangeListener?) {
        Log.d(TAG, "addOnLayoutChangeListener")
        super.addOnLayoutChangeListener(listener)
    }

    override fun dispatchSaveInstanceState(container: SparseArray<Parcelable>?) {
        Log.d(TAG, "dispatchSaveInstanceState")
        super.dispatchSaveInstanceState(container)
    }

    override fun setPointerIcon(pointerIcon: PointerIcon?) {
        Log.d(TAG, "setPointerIcon")
        super.setPointerIcon(pointerIcon)
    }

    override fun isDrawingCacheEnabled(): Boolean {
        Log.d(TAG, "isDrawingCacheEnabled")
        return super.isDrawingCacheEnabled()
    }

    override fun getLayoutParams(): ViewGroup.LayoutParams {
        Log.d(TAG, "getLayoutParams")
        return super.getLayoutParams()
    }

    override fun onAnimationStart() {
        Log.d(TAG, "onAnimationStart")
        super.onAnimationStart()
    }

    override fun computeSystemWindowInsets(`in`: WindowInsets?, outLocalInsets: Rect?): WindowInsets {
        Log.d(TAG, "computeSystemWindowInsets")
        return super.computeSystemWindowInsets(`in`, outLocalInsets)
    }

    override fun addChildrenForAccessibility(outChildren: ArrayList<View>?) {
        Log.d(TAG, "addChildrenForAccessibility")
        super.addChildrenForAccessibility(outChildren)
    }

    override fun setSaveFromParentEnabled(enabled: Boolean) {
        Log.d(TAG, "setSaveFromParentEnabled")
        super.setSaveFromParentEnabled(enabled)
    }

    override fun drawableStateChanged() {
        Log.d(TAG, "drawableStateChanged")
        super.drawableStateChanged()
    }

    override fun removeOnUnhandledKeyEventListener(listener: OnUnhandledKeyEventListener?) {
        Log.d(TAG, "removeOnUnhandledKeyEventListener")
        super.removeOnUnhandledKeyEventListener(listener)
    }

    override fun isHovered(): Boolean {
        Log.d(TAG, "isHovered")
        return super.isHovered()
    }

    override fun isLaidOut(): Boolean {
        Log.d(TAG, "isLaidOut")
        return super.isLaidOut()
    }

    override fun setDrawingCacheEnabled(enabled: Boolean) {
        Log.d(TAG, "setDrawingCacheEnabled")
        super.setDrawingCacheEnabled(enabled)
    }

    override fun setFitsSystemWindows(fitSystemWindows: Boolean) {
        Log.d(TAG, "setFitsSystemWindows")
        super.setFitsSystemWindows(fitSystemWindows)
    }

    override fun dispatchWindowVisibilityChanged(visibility: Int) {
        Log.d(TAG, "dispatchWindowVisibilityChanged")
        super.dispatchWindowVisibilityChanged(visibility)
    }

    override fun isDirty(): Boolean {
        Log.d(TAG, "isDirty")
        return super.isDirty()
    }

    override fun setOnScrollChangeListener(l: OnScrollChangeListener?) {
        Log.d(TAG, "setOnScrollChangeListener")
        super.setOnScrollChangeListener(l)
    }

    override fun onProvideAutofillVirtualStructure(structure: ViewStructure?, flags: Int) {
        Log.d(TAG, "onProvideAutofillVirtualStructure")
        super.onProvideAutofillVirtualStructure(structure, flags)
    }

    override fun onCreateContextMenu(menu: ContextMenu?) {
        Log.d(TAG, "onCreateContextMenu")
        super.onCreateContextMenu(menu)
    }

    override fun startAnimation(animation: Animation?) {
        Log.d(TAG, "startAnimation")
        super.startAnimation(animation)
    }

    override fun isScreenReaderFocusable(): Boolean {
        Log.d(TAG, "isScreenReaderFocusable")
        return super.isScreenReaderFocusable()
    }

    override fun getDrawingRect(outRect: Rect?) {
        Log.d(TAG, "getDrawingRect")
        super.getDrawingRect(outRect)
    }

    override fun jumpDrawablesToCurrentState() {
        Log.d(TAG, "jumpDrawablesToCurrentState")
        super.jumpDrawablesToCurrentState()
    }

    override fun setScrollbarFadingEnabled(fadeScrollbars: Boolean) {
        Log.d(TAG, "setScrollbarFadingEnabled")
        super.setScrollbarFadingEnabled(fadeScrollbars)
    }

    override fun getApplicationWindowToken(): IBinder {
        Log.d(TAG, "getApplicationWindowToken")
        return super.getApplicationWindowToken()
    }

    override fun setVerticalScrollBarEnabled(verticalScrollBarEnabled: Boolean) {
        Log.d(TAG, "setVerticalScrollBarEnabled")
        super.setVerticalScrollBarEnabled(verticalScrollBarEnabled)
    }

    override fun computeHorizontalScrollExtent(): Int {
        Log.d(TAG, "computeHorizontalScrollExtent")
        return super.computeHorizontalScrollExtent()
    }

    override fun invalidate(dirty: Rect?) {
        Log.d(TAG, "invalidate")
        super.invalidate(dirty)
    }

    override fun invalidate(l: Int, t: Int, r: Int, b: Int) {
        Log.d(TAG, "invalidate")
        super.invalidate(l, t, r, b)
    }

    override fun invalidate() {
        Log.d(TAG, "invalidate")
        super.invalidate()
    }

    override fun isHorizontalFadingEdgeEnabled(): Boolean {
        Log.d(TAG, "isHorizontalFadingEdgeEnabled")
        return super.isHorizontalFadingEdgeEnabled()
    }

    override fun getTooltipText(): CharSequence? {
        Log.d(TAG, "getTooltipText")
        return super.getTooltipText()
    }

    override fun getStateListAnimator(): StateListAnimator {
        Log.d(TAG, "getStateListAnimator")
        return super.getStateListAnimator()
    }

    override fun addOnUnhandledKeyEventListener(listener: OnUnhandledKeyEventListener?) {
        Log.d(TAG, "addOnUnhandledKeyEventListener")
        super.addOnUnhandledKeyEventListener(listener)
    }

    override fun getVisibility(): Int {
        Log.d(TAG, "getVisibility")
        return super.getVisibility()
    }

    override fun onConfigurationChanged(newConfig: Configuration?) {
        Log.d(TAG, "onConfigurationChanged")
        super.onConfigurationChanged(newConfig)
    }

    override fun isClickable(): Boolean {
        Log.d(TAG, "isClickable")
        return super.isClickable()
    }

    override fun setOnClickListener(l: OnClickListener?) {
        Log.d(TAG, "setOnClickListener")
        super.setOnClickListener(l)
    }

    override fun setOnHoverListener(l: OnHoverListener?) {
        Log.d(TAG, "setOnHoverListener")
        super.setOnHoverListener(l)
    }

    override fun getAutofillValue(): AutofillValue? {
        Log.d(TAG, "getAutofillValue")
        return super.getAutofillValue()
    }

    override fun setClipBounds(clipBounds: Rect?) {
        Log.d(TAG, "setClipBounds")
        super.setClipBounds(clipBounds)
    }

    override fun isAccessibilityHeading(): Boolean {
        Log.d(TAG, "isAccessibilityHeading")
        return super.isAccessibilityHeading()
    }

    override fun setNextFocusDownId(nextFocusDownId: Int) {
        Log.d(TAG, "setNextFocusDownId")
        super.setNextFocusDownId(nextFocusDownId)
    }

    override fun focusSearch(direction: Int): View {
        Log.d(TAG, "focusSearch")
        return super.focusSearch(direction)
    }

    override fun hasPointerCapture(): Boolean {
        Log.d(TAG, "hasPointerCapture")
        return super.hasPointerCapture()
    }

    override fun setBackgroundDrawable(background: Drawable?) {
        Log.d(TAG, "setBackgroundDrawable")
        super.setBackgroundDrawable(background)
    }

    override fun fitSystemWindows(insets: Rect?): Boolean {
        Log.d(TAG, "fitSystemWindows")
        return super.fitSystemWindows(insets)
    }

    override fun computeVerticalScrollOffset(): Int {
        Log.d(TAG, "computeVerticalScrollOffset")
        return super.computeVerticalScrollOffset()
    }

    override fun onRtlPropertiesChanged(layoutDirection: Int) {
        Log.d(TAG, "onRtlPropertiesChanged")
        super.onRtlPropertiesChanged(layoutDirection)
    }

    override fun getPaddingStart(): Int {
        Log.d(TAG, "getPaddingStart")
        return super.getPaddingStart()
    }

    override fun isLongClickable(): Boolean {
        Log.d(TAG, "isLongClickable")
        return super.isLongClickable()
    }

    override fun isHardwareAccelerated(): Boolean {
        Log.d(TAG, "isHardwareAccelerated")
        return super.isHardwareAccelerated()
    }

    override fun dispatchKeyEventPreIme(event: KeyEvent?): Boolean {
        Log.d(TAG, "dispatchKeyEventPreIme")
        return super.dispatchKeyEventPreIme(event)
    }

    override fun post(action: Runnable?): Boolean {
        Log.d(TAG, "post")
        return super.post(action)
    }

    override fun isVisibleToUserForAutofill(virtualId: Int): Boolean {
        Log.d(TAG, "isVisibleToUserForAutofill")
        return super.isVisibleToUserForAutofill(virtualId)
    }

    override fun getY(): Float {
        Log.d(TAG, "getY")
        return super.getY()
    }

    override fun setOnSystemUiVisibilityChangeListener(l: OnSystemUiVisibilityChangeListener?) {
        Log.d(TAG, "setOnSystemUiVisibilityChangeListener")
        super.setOnSystemUiVisibilityChangeListener(l)
    }

    override fun setOutlineAmbientShadowColor(color: Int) {
        Log.d(TAG, "setOutlineAmbientShadowColor")
        super.setOutlineAmbientShadowColor(color)
    }

    override fun setClickable(clickable: Boolean) {
        Log.d(TAG, "setClickable")
        super.setClickable(clickable)
    }

    override fun getBackgroundTintList(): ColorStateList? {
        Log.d(TAG, "getBackgroundTintList")
        return super.getBackgroundTintList()
    }

    override fun setNestedScrollingEnabled(enabled: Boolean) {
        Log.d(TAG, "setNestedScrollingEnabled")
        super.setNestedScrollingEnabled(enabled)
    }

    override fun dispatchVisibilityChanged(changedView: View, visibility: Int) {
        Log.d(TAG, "dispatchVisibilityChanged")
        super.dispatchVisibilityChanged(changedView, visibility)
    }

    override fun isSelected(): Boolean {
        Log.d(TAG, "isSelected")
        return super.isSelected()
    }

    override fun setHapticFeedbackEnabled(hapticFeedbackEnabled: Boolean) {
        Log.d(TAG, "setHapticFeedbackEnabled")
        super.setHapticFeedbackEnabled(hapticFeedbackEnabled)
    }

    override fun removeOnLayoutChangeListener(listener: OnLayoutChangeListener?) {
        Log.d(TAG, "removeOnLayoutChangeListener")
        super.removeOnLayoutChangeListener(listener)
    }

    override fun dispatchProvideAutofillStructure(structure: ViewStructure, flags: Int) {
        Log.d(TAG, "dispatchProvideAutofillStructure")
        super.dispatchProvideAutofillStructure(structure, flags)
    }

    override fun getTranslationZ(): Float {
        Log.d(TAG, "getTranslationZ")
        return super.getTranslationZ()
    }

    override fun getPaddingEnd(): Int {
        Log.d(TAG, "getPaddingEnd")
        return super.getPaddingEnd()
    }

    override fun setCameraDistance(distance: Float) {
        Log.d(TAG, "setCameraDistance")
        super.setCameraDistance(distance)
    }

    override fun verifyDrawable(who: Drawable): Boolean {
        Log.d(TAG, "verifyDrawable")
        return super.verifyDrawable(who)
    }

    override fun hasFocusable(): Boolean {
        Log.d(TAG, "hasFocusable")
        return super.hasFocusable()
    }

    override fun onProvideStructure(structure: ViewStructure?) {
        Log.d(TAG, "onProvideStructure")
        super.onProvideStructure(structure)
    }

    override fun dispatchSetActivated(activated: Boolean) {
        Log.d(TAG, "dispatchSetActivated")
        super.dispatchSetActivated(activated)
    }

    override fun setNextClusterForwardId(nextClusterForwardId: Int) {
        Log.d(TAG, "setNextClusterForwardId")
        super.setNextClusterForwardId(nextClusterForwardId)
    }

    override fun createContextMenu(menu: ContextMenu?) {
        Log.d(TAG, "createContextMenu")
        super.createContextMenu(menu)
    }

    override fun getDrawingTime(): Long {
        Log.d(TAG, "getDrawingTime")
        return super.getDrawingTime()
    }

    override fun getSolidColor(): Int {
        Log.d(TAG, "getSolidColor")
        return super.getSolidColor()
    }

    override fun setAutofillHints(vararg autofillHints: String?) {
        Log.d(TAG, "setAutofillHints")
        super.setAutofillHints(*autofillHints)
    }

    override fun getZ(): Float {
        Log.d(TAG, "getZ")
        return super.getZ()
    }

    override fun isFocused(): Boolean {
        Log.d(TAG, "isFocused")
        return super.isFocused()
    }

    override fun setScrollIndicators(indicators: Int) {
        Log.d(TAG, "setScrollIndicators")
        super.setScrollIndicators(indicators)
    }

    override fun setScrollIndicators(indicators: Int, mask: Int) {
        Log.d(TAG, "setScrollIndicators")
        super.setScrollIndicators(indicators, mask)
    }

    override fun getOutlineSpotShadowColor(): Int {
        Log.d(TAG, "getOutlineSpotShadowColor")
        return super.getOutlineSpotShadowColor()
    }

    override fun setScrollBarFadeDuration(scrollBarFadeDuration: Int) {
        Log.d(TAG, "setScrollBarFadeDuration")
        super.setScrollBarFadeDuration(scrollBarFadeDuration)
    }

    override fun dispatchNestedScroll(dxConsumed: Int, dyConsumed: Int, dxUnconsumed: Int, dyUnconsumed: Int, offsetInWindow: IntArray?): Boolean {
        Log.d(TAG, "dispatchNestedScroll")
        return super.dispatchNestedScroll(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow)
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        Log.d(TAG, "onSizeChanged")
        super.onSizeChanged(w, h, oldw, oldh)
    }

    override fun getTranslationY(): Float {
        Log.d(TAG, "getTranslationY")
        return super.getTranslationY()
    }

    override fun isContextClickable(): Boolean {
        Log.d(TAG, "isContextClickable")
        return super.isContextClickable()
    }

    override fun setTag(tag: Any?) {
        Log.d(TAG, "setTag")
        super.setTag(tag)
    }

    override fun setTag(key: Int, tag: Any?) {
        Log.d(TAG, "setTag")
        super.setTag(key, tag)
    }

    override fun dispatchGenericPointerEvent(event: MotionEvent?): Boolean {
        Log.d(TAG, "dispatchGenericPointerEvent")
        return super.dispatchGenericPointerEvent(event)
    }

    override fun getRotation(): Float {
        Log.d(TAG, "getRotation")
        return super.getRotation()
    }

    override fun offsetTopAndBottom(offset: Int) {
        Log.d(TAG, "offsetTopAndBottom")
        super.offsetTopAndBottom(offset)
    }

    override fun getAccessibilityClassName(): CharSequence {
        Log.d(TAG, "getAccessibilityClassName")
        return super.getAccessibilityClassName()
    }

    override fun getForeground(): Drawable {
        Log.d(TAG, "getForeground")
        return super.getForeground()
    }

    override fun getPaddingRight(): Int {
        Log.d(TAG, "getPaddingRight")
        return super.getPaddingRight()
    }

    override fun setTextAlignment(textAlignment: Int) {
        Log.d(TAG, "setTextAlignment")
        super.setTextAlignment(textAlignment)
    }

    override fun buildLayer() {
        Log.d(TAG, "buildLayer")
        super.buildLayer()
    }

    override fun setNextFocusRightId(nextFocusRightId: Int) {
        Log.d(TAG, "setNextFocusRightId")
        super.setNextFocusRightId(nextFocusRightId)
    }

    override fun onCapturedPointerEvent(event: MotionEvent?): Boolean {
        Log.d(TAG, "onCapturedPointerEvent")
        return super.onCapturedPointerEvent(event)
    }

    override fun getTextDirection(): Int {
        Log.d(TAG, "getTextDirection")
        return super.getTextDirection()
    }

    override fun setLayoutDirection(layoutDirection: Int) {
        Log.d(TAG, "setLayoutDirection")
        super.setLayoutDirection(layoutDirection)
    }

    override fun setVerticalScrollbarPosition(position: Int) {
        Log.d(TAG, "setVerticalScrollbarPosition")
        super.setVerticalScrollbarPosition(position)
    }

    override fun getContentDescription(): CharSequence {
        Log.d(TAG, "getContentDescription")
        return super.getContentDescription()
    }

    override fun onSaveInstanceState(): Parcelable? {
        Log.d(TAG, "onSaveInstanceState")
        return super.onSaveInstanceState()
    }

    override fun getVerticalFadingEdgeLength(): Int {
        Log.d(TAG, "getVerticalFadingEdgeLength")
        return super.getVerticalFadingEdgeLength()
    }

    override fun onCreateInputConnection(outAttrs: EditorInfo?): InputConnection {
        Log.d(TAG, "onCreateInputConnection")
        return super.onCreateInputConnection(outAttrs)
    }

    override fun getTransitionName(): String {
        Log.d(TAG, "getTransitionName")
        return super.getTransitionName()
    }

    override fun dispatchGenericMotionEvent(event: MotionEvent?): Boolean {
        Log.d(TAG, "dispatchGenericMotionEvent")
        return super.dispatchGenericMotionEvent(event)
    }

    override fun canResolveLayoutDirection(): Boolean {
        Log.d(TAG, "canResolveLayoutDirection")
        return super.canResolveLayoutDirection()
    }

    override fun onDrawForeground(canvas: Canvas?) {
        Log.d(TAG, "onDrawForeground")
        super.onDrawForeground(canvas)
    }

    override fun setScaleX(scaleX: Float) {
        Log.d(TAG, "setScaleX")
        super.setScaleX(scaleX)
    }

    override fun getTranslationX(): Float {
        Log.d(TAG, "getTranslationX")
        return super.getTranslationX()
    }

    override fun getTextAlignment(): Int {
        Log.d(TAG, "getTextAlignment")
        return super.getTextAlignment()
    }

    override fun setLayoutParams(params: ViewGroup.LayoutParams?) {
        Log.d(TAG, "setLayoutParams")
        super.setLayoutParams(params)
    }

    override fun getLabelFor(): Int {
        Log.d(TAG, "getLabelFor")
        return super.getLabelFor()
    }

    override fun dispatchNestedPreFling(velocityX: Float, velocityY: Float): Boolean {
        Log.d(TAG, "dispatchNestedPreFling")
        return super.dispatchNestedPreFling(velocityX, velocityY)
    }

    override fun getAlpha(): Float {
        Log.d(TAG, "getAlpha")
        return super.getAlpha()
    }

    override fun onDragEvent(event: DragEvent?): Boolean {
        Log.d(TAG, "onDragEvent")
        return super.onDragEvent(event)
    }

    override fun startNestedScroll(axes: Int): Boolean {
        Log.d(TAG, "startNestedScroll")
        return super.startNestedScroll(axes)
    }

    override fun getLocationInWindow(outLocation: IntArray?) {
        Log.d(TAG, "getLocationInWindow")
        super.getLocationInWindow(outLocation)
    }

    override fun getX(): Float {
        Log.d(TAG, "getX")
        return super.getX()
    }

    override fun animate(): ViewPropertyAnimator {
        Log.d(TAG, "animate")
        return super.animate()
    }

    override fun setTextDirection(textDirection: Int) {
        Log.d(TAG, "setTextDirection")
        super.setTextDirection(textDirection)
    }

    override fun onApplyWindowInsets(insets: WindowInsets?): WindowInsets {
        Log.d(TAG, "onApplyWindowInsets")
        return super.onApplyWindowInsets(insets)
    }

    override fun onTrackballEvent(event: MotionEvent?): Boolean {
        Log.d(TAG, "onTrackballEvent")
        return super.onTrackballEvent(event)
    }

    override fun isSoundEffectsEnabled(): Boolean {
        Log.d(TAG, "isSoundEffectsEnabled")
        return super.isSoundEffectsEnabled()
    }

    override fun onDetachedFromWindow() {
        Log.d(TAG, "onDetachedFromWindow")
        super.onDetachedFromWindow()
    }

    override fun restoreDefaultFocus(): Boolean {
        Log.d(TAG, "restoreDefaultFocus")
        return super.restoreDefaultFocus()
    }

    override fun setNextFocusForwardId(nextFocusForwardId: Int) {
        Log.d(TAG, "setNextFocusForwardId")
        super.setNextFocusForwardId(nextFocusForwardId)
    }

    override fun getLeftFadingEdgeStrength(): Float {
        Log.d(TAG, "getLeftFadingEdgeStrength")
        return super.getLeftFadingEdgeStrength()
    }

    override fun isTextAlignmentResolved(): Boolean {
        Log.d(TAG, "isTextAlignmentResolved")
        return super.isTextAlignmentResolved()
    }

    override fun setBackgroundResource(resid: Int) {
        Log.d(TAG, "setBackgroundResource")
        super.setBackgroundResource(resid)
    }

    override fun isSaveFromParentEnabled(): Boolean {
        Log.d(TAG, "isSaveFromParentEnabled")
        return super.isSaveFromParentEnabled()
    }

    override fun isDuplicateParentStateEnabled(): Boolean {
        Log.d(TAG, "isDuplicateParentStateEnabled")
        return super.isDuplicateParentStateEnabled()
    }

    override fun setImportantForAutofill(mode: Int) {
        Log.d(TAG, "setImportantForAutofill")
        super.setImportantForAutofill(mode)
    }

    override fun setOnContextClickListener(l: OnContextClickListener?) {
        Log.d(TAG, "setOnContextClickListener")
        super.setOnContextClickListener(l)
    }

    override fun performClick(): Boolean {
        Log.d(TAG, "performClick")
        return super.performClick()
    }

    override fun getFocusables(direction: Int): ArrayList<View> {
        Log.d(TAG, "getFocusables")
        return super.getFocusables(direction)
    }

    override fun setOutlineSpotShadowColor(color: Int) {
        Log.d(TAG, "setOutlineSpotShadowColor")
        super.setOutlineSpotShadowColor(color)
    }

    override fun clearFocus() {
        Log.d(TAG, "clearFocus")
        super.clearFocus()
    }

    override fun dispatchKeyEvent(event: KeyEvent?): Boolean {
        Log.d(TAG, "dispatchKeyEvent")
        return super.dispatchKeyEvent(event)
    }

    override fun onHoverChanged(hovered: Boolean) {
        Log.d(TAG, "onHoverChanged")
        super.onHoverChanged(hovered)
    }

    override fun setAnimation(animation: Animation?) {
        Log.d(TAG, "setAnimation")
        super.setAnimation(animation)
    }

    override fun addTouchables(views: ArrayList<View>?) {
        Log.d(TAG, "addTouchables")
        super.addTouchables(views)
    }

    override fun dispatchGenericFocusedEvent(event: MotionEvent?): Boolean {
        Log.d(TAG, "dispatchGenericFocusedEvent")
        return super.dispatchGenericFocusedEvent(event)
    }

    override fun setScaleY(scaleY: Float) {
        Log.d(TAG, "setScaleY")
        super.setScaleY(scaleY)
    }

    override fun autofill(value: AutofillValue?) {
        Log.d(TAG, "autofill")
        super.autofill(value)
    }

    override fun autofill(values: SparseArray<AutofillValue>) {
        Log.d(TAG, "autofill")
        super.autofill(values)
    }

    override fun onWindowVisibilityChanged(visibility: Int) {
        Log.d(TAG, "onWindowVisibilityChanged")
        super.onWindowVisibilityChanged(visibility)
    }

    override fun isPaddingOffsetRequired(): Boolean {
        Log.d(TAG, "isPaddingOffsetRequired")
        return super.isPaddingOffsetRequired()
    }

    override fun setForegroundTintList(tint: ColorStateList?) {
        Log.d(TAG, "setForegroundTintList")
        super.setForegroundTintList(tint)
    }

    override fun invalidateOutline() {
        Log.d(TAG, "invalidateOutline")
        super.invalidateOutline()
    }

    override fun setKeepScreenOn(keepScreenOn: Boolean) {
        Log.d(TAG, "setKeepScreenOn")
        super.setKeepScreenOn(keepScreenOn)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        Log.d(TAG, "onKeyDown")
        return super.onKeyDown(keyCode, event)
    }

    override fun getClipBounds(): Rect {
        Log.d(TAG, "getClipBounds")
        return super.getClipBounds()
    }

    override fun getClipBounds(outRect: Rect?): Boolean {
        Log.d(TAG, "getClipBounds")
        return super.getClipBounds(outRect)
    }

    override fun setHovered(hovered: Boolean) {
        Log.d(TAG, "setHovered")
        super.setHovered(hovered)
    }

    override fun onHoverEvent(event: MotionEvent?): Boolean {
        Log.d(TAG, "onHoverEvent")
        return super.onHoverEvent(event)
    }

    override fun isActivated(): Boolean {
        Log.d(TAG, "isActivated")
        return super.isActivated()
    }

    override fun onScrollChanged(l: Int, t: Int, oldl: Int, oldt: Int) {
        Log.d(TAG, "onScrollChanged")
        super.onScrollChanged(l, t, oldl, oldt)
    }

    override fun keyboardNavigationClusterSearch(currentCluster: View?, direction: Int): View {
        Log.d(TAG, "keyboardNavigationClusterSearch")
        return super.keyboardNavigationClusterSearch(currentCluster, direction)
    }

    override fun hasOnClickListeners(): Boolean {
        Log.d(TAG, "hasOnClickListeners")
        return super.hasOnClickListeners()
    }

    override fun resetPivot() {
        Log.d(TAG, "resetPivot")
        super.resetPivot()
    }

    override fun hasWindowFocus(): Boolean {
        Log.d(TAG, "hasWindowFocus")
        return super.hasWindowFocus()
    }

    override fun onInitializeAccessibilityEvent(event: AccessibilityEvent?) {
        Log.d(TAG, "onInitializeAccessibilityEvent")
        super.onInitializeAccessibilityEvent(event)
    }

    override fun getMinimumWidth(): Int {
        Log.d(TAG, "getMinimumWidth")
        return super.getMinimumWidth()
    }

    override fun setFocusableInTouchMode(focusableInTouchMode: Boolean) {
        Log.d(TAG, "setFocusableInTouchMode")
        super.setFocusableInTouchMode(focusableInTouchMode)
    }

    override fun hasOverlappingRendering(): Boolean {
        Log.d(TAG, "hasOverlappingRendering")
        return super.hasOverlappingRendering()
    }

    override fun canResolveTextAlignment(): Boolean {
        Log.d(TAG, "canResolveTextAlignment")
        return super.canResolveTextAlignment()
    }

//    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
//        Log.d(TAG, "onLayout")
//        super.onLayout(changed, left, top, right, bottom)
//    }

    override fun isVerticalFadingEdgeEnabled(): Boolean {
        Log.d(TAG, "isVerticalFadingEdgeEnabled")
        return super.isVerticalFadingEdgeEnabled()
    }

    override fun computeScroll() {
        Log.d(TAG, "computeScroll")
        super.computeScroll()
    }

    override fun getTouchDelegate(): TouchDelegate {
        Log.d(TAG, "getTouchDelegate")
        return super.getTouchDelegate()
    }

    override fun playSoundEffect(soundConstant: Int) {
        Log.d(TAG, "playSoundEffect")
        super.playSoundEffect(soundConstant)
    }

    override fun setFocusedByDefault(isFocusedByDefault: Boolean) {
        Log.d(TAG, "setFocusedByDefault")
        super.setFocusedByDefault(isFocusedByDefault)
    }

    override fun setScrollBarSize(scrollBarSize: Int) {
        Log.d(TAG, "setScrollBarSize")
        super.setScrollBarSize(scrollBarSize)
    }

    override fun getAutofillType(): Int {
        Log.d(TAG, "getAutofillType")
        return super.getAutofillType()
    }

    override fun setScrollX(value: Int) {
        Log.d(TAG, "setScrollX")
        super.setScrollX(value)
    }

    override fun setTouchDelegate(delegate: TouchDelegate?) {
        Log.d(TAG, "setTouchDelegate")
        super.setTouchDelegate(delegate)
    }

    override fun getPivotY(): Float {
        Log.d(TAG, "getPivotY")
        return super.getPivotY()
    }

    override fun getScrollBarSize(): Int {
        Log.d(TAG, "getScrollBarSize")
        return super.getScrollBarSize()
    }

    override fun setVisibility(visibility: Int) {
        Log.d(TAG, "setVisibility")
        super.setVisibility(visibility)
    }

    override fun scrollTo(x: Int, y: Int) {
        Log.d(TAG, "scrollTo")
        super.scrollTo(x, y)
    }

    override fun postInvalidate() {
        Log.d(TAG, "postInvalidate")
        super.postInvalidate()
    }

    override fun postInvalidate(left: Int, top: Int, right: Int, bottom: Int) {
        Log.d(TAG, "postInvalidate")
        super.postInvalidate(left, top, right, bottom)
    }

    override fun postOnAnimationDelayed(action: Runnable?, delayMillis: Long) {
        Log.d(TAG, "postOnAnimationDelayed")
        super.postOnAnimationDelayed(action, delayMillis)
    }

    override fun onOverScrolled(scrollX: Int, scrollY: Int, clampedX: Boolean, clampedY: Boolean) {
        Log.d(TAG, "onOverScrolled")
        super.onOverScrolled(scrollX, scrollY, clampedX, clampedY)
    }

    override fun setScrollY(value: Int) {
        Log.d(TAG, "setScrollY")
        super.setScrollY(value)
    }

    override fun setHasTransientState(hasTransientState: Boolean) {
        Log.d(TAG, "setHasTransientState")
        super.setHasTransientState(hasTransientState)
    }

    override fun getPivotX(): Float {
        Log.d(TAG, "getPivotX")
        return super.getPivotX()
    }

    override fun dispatchHoverEvent(event: MotionEvent?): Boolean {
        Log.d(TAG, "dispatchHoverEvent")
        return super.dispatchHoverEvent(event)
    }

    override fun performAccessibilityAction(action: Int, arguments: Bundle?): Boolean {
        Log.d(TAG, "performAccessibilityAction")
        return super.performAccessibilityAction(action, arguments)
    }

    override fun getRightFadingEdgeStrength(): Float {
        Log.d(TAG, "getRightFadingEdgeStrength")
        return super.getRightFadingEdgeStrength()
    }

    override fun setBackgroundColor(color: Int) {
        Log.d(TAG, "setBackgroundColor")
        super.setBackgroundColor(color)
    }

    override fun dispatchKeyShortcutEvent(event: KeyEvent?): Boolean {
        Log.d(TAG, "dispatchKeyShortcutEvent")
        return super.dispatchKeyShortcutEvent(event)
    }

    override fun onFilterTouchEventForSecurity(event: MotionEvent?): Boolean {
        Log.d(TAG, "onFilterTouchEventForSecurity")
        return super.onFilterTouchEventForSecurity(event)
    }

    override fun setNextFocusLeftId(nextFocusLeftId: Int) {
        Log.d(TAG, "setNextFocusLeftId")
        super.setNextFocusLeftId(nextFocusLeftId)
    }

    override fun setForeground(foreground: Drawable?) {
        Log.d(TAG, "setForeground")
        super.setForeground(foreground)
    }

    override fun onFocusChanged(gainFocus: Boolean, direction: Int, previouslyFocusedRect: Rect?) {
        Log.d(TAG, "onFocusChanged")
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect)
    }

    override fun setPaddingRelative(start: Int, top: Int, end: Int, bottom: Int) {
        Log.d(TAG, "setPaddingRelative")
        super.setPaddingRelative(start, top, end, bottom)
    }

    override fun dispatchNestedPrePerformAccessibilityAction(action: Int, arguments: Bundle?): Boolean {
        Log.d(TAG, "dispatchNestedPrePerformAccessibilityAction")
        return super.dispatchNestedPrePerformAccessibilityAction(action, arguments)
    }

    override fun requestLayout() {
        Log.d(TAG, "requestLayout")
        super.requestLayout()
    }

    override fun getTopFadingEdgeStrength(): Float {
        Log.d(TAG, "getTopFadingEdgeStrength")
        return super.getTopFadingEdgeStrength()
    }

    override fun onCheckIsTextEditor(): Boolean {
        Log.d(TAG, "onCheckIsTextEditor")
        return super.onCheckIsTextEditor()
    }

    override fun onDisplayHint(hint: Int) {
        Log.d(TAG, "onDisplayHint")
        super.onDisplayHint(hint)
    }

    override fun getFilterTouchesWhenObscured(): Boolean {
        Log.d(TAG, "getFilterTouchesWhenObscured")
        return super.getFilterTouchesWhenObscured()
    }

    override fun setSystemUiVisibility(visibility: Int) {
        Log.d(TAG, "setSystemUiVisibility")
        super.setSystemUiVisibility(visibility)
    }

    override fun getScrollIndicators(): Int {
        Log.d(TAG, "getScrollIndicators")
        return super.getScrollIndicators()
    }

    override fun findFocus(): View {
        Log.d(TAG, "findFocus")
        return super.findFocus()
    }

    override fun getAutofillHints(): Array<String>? {
        Log.d(TAG, "getAutofillHints")
        return super.getAutofillHints()
    }

    override fun getId(): Int {
        Log.d(TAG, "getId")
        return super.getId()
    }

    override fun draw(canvas: Canvas?) {
        Log.d(TAG, "draw")
        super.draw(canvas)
    }

    override fun getScaleX(): Float {
        Log.d(TAG, "getScaleX")
        return super.getScaleX()
    }

    override fun findViewsWithText(outViews: ArrayList<View>?, searched: CharSequence?, flags: Int) {
        Log.d(TAG, "findViewsWithText")
        super.findViewsWithText(outViews, searched, flags)
    }

    override fun saveHierarchyState(container: SparseArray<Parcelable>?) {
        Log.d(TAG, "saveHierarchyState")
        super.saveHierarchyState(container)
    }

    override fun removeOnAttachStateChangeListener(listener: OnAttachStateChangeListener?) {
        Log.d(TAG, "removeOnAttachStateChangeListener")
        super.removeOnAttachStateChangeListener(listener)
    }

    override fun getPaddingLeft(): Int {
        Log.d(TAG, "getPaddingLeft")
        return super.getPaddingLeft()
    }

    override fun setMinimumHeight(minHeight: Int) {
        Log.d(TAG, "setMinimumHeight")
        super.setMinimumHeight(minHeight)
    }

    override fun dispatchDragEvent(event: DragEvent?): Boolean {
        Log.d(TAG, "dispatchDragEvent")
        return super.dispatchDragEvent(event)
    }

    override fun isOpaque(): Boolean {
        Log.d(TAG, "isOpaque")
        return super.isOpaque()
    }

    override fun setAlpha(alpha: Float) {
        Log.d(TAG, "setAlpha")
        super.setAlpha(alpha)
    }

    override fun getBottomFadingEdgeStrength(): Float {
        Log.d(TAG, "getBottomFadingEdgeStrength")
        return super.getBottomFadingEdgeStrength()
    }

    override fun getWindowVisibility(): Int {
        Log.d(TAG, "getWindowVisibility")
        return super.getWindowVisibility()
    }

    override fun getPaddingBottom(): Int {
        Log.d(TAG, "getPaddingBottom")
        return super.getPaddingBottom()
    }

    override fun onScreenStateChanged(screenState: Int) {
        Log.d(TAG, "onScreenStateChanged")
        super.onScreenStateChanged(screenState)
    }

    override fun getMinimumHeight(): Int {
        Log.d(TAG, "getMinimumHeight")
        return super.getMinimumHeight()
    }

    override fun setMinimumWidth(minWidth: Int) {
        Log.d(TAG, "setMinimumWidth")
        super.setMinimumWidth(minWidth)
    }

    override fun requestPointerCapture() {
        Log.d(TAG, "requestPointerCapture")
        super.requestPointerCapture()
    }

    override fun isEnabled(): Boolean {
        Log.d(TAG, "isEnabled")
        return super.isEnabled()
    }

    override fun dispatchDraw(canvas: Canvas?) {
        Log.d(TAG, "dispatchDraw")
        super.dispatchDraw(canvas)
    }

    override fun requestApplyInsets() {
        Log.d(TAG, "requestApplyInsets")
        super.requestApplyInsets()
    }

    override fun showContextMenu(): Boolean {
        Log.d(TAG, "showContextMenu")
        return super.showContextMenu()
    }

    override fun showContextMenu(x: Float, y: Float): Boolean {
        Log.d(TAG, "showContextMenu")
        return super.showContextMenu(x, y)
    }

    override fun setOnTouchListener(l: OnTouchListener?) {
        Log.d(TAG, "setOnTouchListener")
        super.setOnTouchListener(l)
    }

    override fun getScrollBarFadeDuration(): Int {
        Log.d(TAG, "getScrollBarFadeDuration")
        return super.getScrollBarFadeDuration()
    }

    override fun onInitializeAccessibilityNodeInfo(info: AccessibilityNodeInfo?) {
        Log.d(TAG, "onInitializeAccessibilityNodeInfo")
        super.onInitializeAccessibilityNodeInfo(info)
    }

    override fun getTouchables(): ArrayList<View> {
        Log.d(TAG, "getTouchables")
        return super.getTouchables()
    }

    override fun willNotCacheDrawing(): Boolean {
        Log.d(TAG, "willNotCacheDrawing")
        return super.willNotCacheDrawing()
    }

    override fun onPointerCaptureChange(hasCapture: Boolean) {
        Log.d(TAG, "onPointerCaptureChange")
        super.onPointerCaptureChange(hasCapture)
    }

    override fun getBackgroundTintMode(): PorterDuff.Mode? {
        Log.d(TAG, "getBackgroundTintMode")
        return super.getBackgroundTintMode()
    }

    override fun bringToFront() {
        Log.d(TAG, "bringToFront")
        super.bringToFront()
    }

    override fun dispatchNestedFling(velocityX: Float, velocityY: Float, consumed: Boolean): Boolean {
        Log.d(TAG, "dispatchNestedFling")
        return super.dispatchNestedFling(velocityX, velocityY, consumed)
    }

    override fun onKeyMultiple(keyCode: Int, repeatCount: Int, event: KeyEvent?): Boolean {
        Log.d(TAG, "onKeyMultiple")
        return super.onKeyMultiple(keyCode, repeatCount, event)
    }

    override fun isAccessibilityFocused(): Boolean {
        Log.d(TAG, "isAccessibilityFocused")
        return super.isAccessibilityFocused()
    }

    override fun setDrawingCacheBackgroundColor(color: Int) {
        Log.d(TAG, "setDrawingCacheBackgroundColor")
        super.setDrawingCacheBackgroundColor(color)
    }

    override fun addFocusables(views: ArrayList<View>?, direction: Int) {
        Log.d(TAG, "addFocusables")
        super.addFocusables(views, direction)
    }

    override fun addFocusables(views: ArrayList<View>?, direction: Int, focusableMode: Int) {
        Log.d(TAG, "addFocusables")
        super.addFocusables(views, direction, focusableMode)
    }

    override fun addKeyboardNavigationClusters(views: MutableCollection<View>, direction: Int) {
        Log.d(TAG, "addKeyboardNavigationClusters")
        super.addKeyboardNavigationClusters(views, direction)
    }

    override fun drawableHotspotChanged(x: Float, y: Float) {
        Log.d(TAG, "drawableHotspotChanged")
        super.drawableHotspotChanged(x, y)
    }

    override fun dispatchConfigurationChanged(newConfig: Configuration?) {
        Log.d(TAG, "dispatchConfigurationChanged")
        super.dispatchConfigurationChanged(newConfig)
    }

    override fun setScreenReaderFocusable(screenReaderFocusable: Boolean) {
        Log.d(TAG, "setScreenReaderFocusable")
        super.setScreenReaderFocusable(screenReaderFocusable)
    }

    override fun setOnGenericMotionListener(l: OnGenericMotionListener?) {
        Log.d(TAG, "setOnGenericMotionListener")
        super.setOnGenericMotionListener(l)
    }

    override fun getDrawingCacheBackgroundColor(): Int {
        Log.d(TAG, "getDrawingCacheBackgroundColor")
        return super.getDrawingCacheBackgroundColor()
    }

    override fun getImportantForAccessibility(): Int {
        Log.d(TAG, "getImportantForAccessibility")
        return super.getImportantForAccessibility()
    }

    override fun dispatchWindowFocusChanged(hasFocus: Boolean) {
        Log.d(TAG, "dispatchWindowFocusChanged")
        super.dispatchWindowFocusChanged(hasFocus)
    }

    override fun isNestedScrollingEnabled(): Boolean {
        Log.d(TAG, "isNestedScrollingEnabled")
        return super.isNestedScrollingEnabled()
    }

    override fun getScaleY(): Float {
        Log.d(TAG, "getScaleY")
        return super.getScaleY()
    }

    override fun setVerticalFadingEdgeEnabled(verticalFadingEdgeEnabled: Boolean) {
        Log.d(TAG, "setVerticalFadingEdgeEnabled")
        super.setVerticalFadingEdgeEnabled(verticalFadingEdgeEnabled)
    }

    override fun isInLayout(): Boolean {
        Log.d(TAG, "isInLayout")
        return super.isInLayout()
    }

    override fun onWindowSystemUiVisibilityChanged(visible: Int) {
        Log.d(TAG, "onWindowSystemUiVisibilityChanged")
        super.onWindowSystemUiVisibilityChanged(visible)
    }

    override fun addOnAttachStateChangeListener(listener: OnAttachStateChangeListener?) {
        Log.d(TAG, "addOnAttachStateChangeListener")
        super.addOnAttachStateChangeListener(listener)
    }

    override fun dispatchSetSelected(selected: Boolean) {
        Log.d(TAG, "dispatchSetSelected")
        super.dispatchSetSelected(selected)
    }

    override fun setFadingEdgeLength(length: Int) {
        Log.d(TAG, "setFadingEdgeLength")
        super.setFadingEdgeLength(length)
    }

    override fun onWindowFocusChanged(hasWindowFocus: Boolean) {
        Log.d(TAG, "onWindowFocusChanged")
        super.onWindowFocusChanged(hasWindowFocus)
    }

    override fun getKeyDispatcherState(): KeyEvent.DispatcherState {
        Log.d(TAG, "getKeyDispatcherState")
        return super.getKeyDispatcherState()
    }

    override fun getOnFocusChangeListener(): OnFocusChangeListener {
        Log.d(TAG, "getOnFocusChangeListener")
        return super.getOnFocusChangeListener()
    }

    override fun postDelayed(action: Runnable?, delayMillis: Long): Boolean {
        Log.d(TAG, "postDelayed")
        return super.postDelayed(action, delayMillis)
    }

    override fun getAccessibilityNodeProvider(): AccessibilityNodeProvider {
        Log.d(TAG, "getAccessibilityNodeProvider")
        return super.getAccessibilityNodeProvider()
    }

    override fun setDefaultFocusHighlightEnabled(defaultFocusHighlightEnabled: Boolean) {
        Log.d(TAG, "setDefaultFocusHighlightEnabled")
        super.setDefaultFocusHighlightEnabled(defaultFocusHighlightEnabled)
    }

    override fun getNextClusterForwardId(): Int {
        Log.d(TAG, "getNextClusterForwardId")
        return super.getNextClusterForwardId()
    }

    override fun getWindowId(): WindowId {
        Log.d(TAG, "getWindowId")
        return super.getWindowId()
    }

    override fun getDrawingCache(): Bitmap {
        Log.d(TAG, "getDrawingCache")
        return super.getDrawingCache()
    }

    override fun getDrawingCache(autoScale: Boolean): Bitmap {
        Log.d(TAG, "getDrawingCache")
        return super.getDrawingCache(autoScale)
    }

    override fun dispatchApplyWindowInsets(insets: WindowInsets?): WindowInsets {
        Log.d(TAG, "dispatchApplyWindowInsets")
        return super.dispatchApplyWindowInsets(insets)
    }

    override fun setOnDragListener(l: OnDragListener?) {
        Log.d(TAG, "setOnDragListener")
        super.setOnDragListener(l)
    }

    override fun computeVerticalScrollExtent(): Int {
        Log.d(TAG, "computeVerticalScrollExtent")
        return super.computeVerticalScrollExtent()
    }

    override fun dispatchNestedPreScroll(dx: Int, dy: Int,
                                         consumed: IntArray?,
                                         offsetInWindow: IntArray?
    ): Boolean {
        Log.d(TAG, "dispatchNestedPreScroll")
        return super.dispatchNestedPreScroll(dx, dy, consumed, offsetInWindow)
    }

    override fun setElevation(elevation: Float) {
        Log.d(TAG, "setElevation")
        super.setElevation(elevation)
    }

    override fun setOnLongClickListener(l: OnLongClickListener?) {
        Log.d(TAG, "setOnLongClickListener")
        super.setOnLongClickListener(l)
    }

    override fun canResolveTextDirection(): Boolean {
        Log.d(TAG, "canResolveTextDirection")
        return super.canResolveTextDirection()
    }

    override fun onKeyLongPress(keyCode: Int, event: KeyEvent?): Boolean {
        Log.d(TAG, "onKeyLongPress")
        return super.onKeyLongPress(keyCode, event)
    }

    override fun getRootWindowInsets(): WindowInsets {
        Log.d(TAG, "getRootWindowInsets")
        return super.getRootWindowInsets()
    }

    override fun getElevation(): Float {
        Log.d(TAG, "getElevation")
        return super.getElevation()
    }

    override fun getOutlineAmbientShadowColor(): Int {
        Log.d(TAG, "getOutlineAmbientShadowColor")
        return super.getOutlineAmbientShadowColor()
    }

//    override fun getBackground(): Drawable {
//        Log.d(TAG, "getBackground")
//        return super.getBackground()
//    }

    override fun setEnabled(enabled: Boolean) {
        Log.d(TAG, "setEnabled")
        super.setEnabled(enabled)
    }

    override fun forceLayout() {
        Log.d(TAG, "forceLayout")
        super.forceLayout()
    }

    override fun setLayerPaint(paint: Paint?) {
        Log.d(TAG, "setLayerPaint")
        super.setLayerPaint(paint)
    }

    override fun isScrollbarFadingEnabled(): Boolean {
        Log.d(TAG, "isScrollbarFadingEnabled")
        return super.isScrollbarFadingEnabled()
    }

    override fun setSoundEffectsEnabled(soundEffectsEnabled: Boolean) {
        Log.d(TAG, "setSoundEffectsEnabled")
        super.setSoundEffectsEnabled(soundEffectsEnabled)
    }

    override fun getSystemUiVisibility(): Int {
        Log.d(TAG, "getSystemUiVisibility")
        return super.getSystemUiVisibility()
    }

    override fun buildDrawingCache() {
        Log.d(TAG, "buildDrawingCache")
        super.buildDrawingCache()
    }

    override fun buildDrawingCache(autoScale: Boolean) {
        Log.d(TAG, "buildDrawingCache")
        super.buildDrawingCache(autoScale)
    }

    override fun setScrollBarDefaultDelayBeforeFade(scrollBarDefaultDelayBeforeFade: Int) {
        Log.d(TAG, "setScrollBarDefaultDelayBeforeFade")
        super.setScrollBarDefaultDelayBeforeFade(scrollBarDefaultDelayBeforeFade)
    }

    override fun isInEditMode(): Boolean {
        Log.d(TAG, "isInEditMode")
        return super.isInEditMode()
    }

    override fun invalidateDrawable(drawable: Drawable) {
        Log.d(TAG, "invalidateDrawable")
        super.invalidateDrawable(drawable)
    }

    override fun announceForAccessibility(text: CharSequence?) {
        Log.d(TAG, "announceForAccessibility")
        super.announceForAccessibility(text)
    }

    override fun getAccessibilityTraversalBefore(): Int {
        Log.d(TAG, "getAccessibilityTraversalBefore")
        return super.getAccessibilityTraversalBefore()
    }

    override fun getForegroundTintList(): ColorStateList? {
        Log.d(TAG, "getForegroundTintList")
        return super.getForegroundTintList()
    }

    override fun getVerticalScrollbarPosition(): Int {
        Log.d(TAG, "getVerticalScrollbarPosition")
        return super.getVerticalScrollbarPosition()
    }

    override fun setHorizontalFadingEdgeEnabled(horizontalFadingEdgeEnabled: Boolean) {
        Log.d(TAG, "setHorizontalFadingEdgeEnabled")
        super.setHorizontalFadingEdgeEnabled(horizontalFadingEdgeEnabled)
    }

    override fun getFocusedRect(r: Rect?) {
        Log.d(TAG, "getFocusedRect")
        super.getFocusedRect(r)
    }

    override fun cancelLongPress() {
        Log.d(TAG, "cancelLongPress")
        super.cancelLongPress()
    }

    override fun setRotationY(rotationY: Float) {
        Log.d(TAG, "setRotationY")
        super.setRotationY(rotationY)
    }

    override fun getAccessibilityLiveRegion(): Int {
        Log.d(TAG, "getAccessibilityLiveRegion")
        return super.getAccessibilityLiveRegion()
    }

    override fun getAccessibilityTraversalAfter(): Int {
        Log.d(TAG, "getAccessibilityTraversalAfter")
        return super.getAccessibilityTraversalAfter()
    }

    override fun setAccessibilityDelegate(delegate: AccessibilityDelegate?) {
        Log.d(TAG, "setAccessibilityDelegate")
        super.setAccessibilityDelegate(delegate)
    }

    override fun addExtraDataToAccessibilityNodeInfo(
        info: AccessibilityNodeInfo,
        extraDataKey: String,
        arguments: Bundle?
    ) {
        Log.d(TAG, "addExtraDataToAccessibilityNodeInfo")
        super.addExtraDataToAccessibilityNodeInfo(info, extraDataKey, arguments)
    }

    override fun setDrawingCacheQuality(quality: Int) {
        Log.d(TAG, "setDrawingCacheQuality")
        super.setDrawingCacheQuality(quality)
    }

    override fun setRotation(rotation: Float) {
        Log.d(TAG, "setRotation")
        super.setRotation(rotation)
    }

    override fun getNextFocusLeftId(): Int {
        Log.d(TAG, "getNextFocusLeftId")
        return super.getNextFocusLeftId()
    }

    override fun setScrollBarStyle(style: Int) {
        Log.d(TAG, "setScrollBarStyle")
        super.setScrollBarStyle(style)
    }

    override fun computeHorizontalScrollOffset(): Int {
        Log.d(TAG, "computeHorizontalScrollOffset")
        return super.computeHorizontalScrollOffset()
    }

    override fun getRotationX(): Float {
        Log.d(TAG, "getRotationX")
        return super.getRotationX()
    }

    override fun dispatchPopulateAccessibilityEvent(event: AccessibilityEvent?): Boolean {
        Log.d(TAG, "dispatchPopulateAccessibilityEvent")
        return super.dispatchPopulateAccessibilityEvent(event)
    }

    override fun setRotationX(rotationX: Float) {
        Log.d(TAG, "setRotationX")
        super.setRotationX(rotationX)
    }

    override fun onProvideAutofillStructure(structure: ViewStructure?, flags: Int) {
        Log.d(TAG, "onProvideAutofillStructure")
        super.onProvideAutofillStructure(structure, flags)
    }

    override fun getNextFocusUpId(): Int {
        Log.d(TAG, "getNextFocusUpId")
        return super.getNextFocusUpId()
    }

    override fun setWillNotDraw(willNotDraw: Boolean) {
        Log.d(TAG, "setWillNotDraw")
        super.setWillNotDraw(willNotDraw)
    }

    override fun isScrollContainer(): Boolean {
        Log.d(TAG, "isScrollContainer")
        return super.isScrollContainer()
    }

    override fun getHorizontalScrollbarHeight(): Int {
        Log.d(TAG, "getHorizontalScrollbarHeight")
        return super.getHorizontalScrollbarHeight()
    }

    override fun getOverScrollMode(): Int {
        Log.d(TAG, "getOverScrollMode")
        return super.getOverScrollMode()
    }

    override fun isAttachedToWindow(): Boolean {
        Log.d(TAG, "isAttachedToWindow")
        return super.isAttachedToWindow()
    }

    override fun dispatchStartTemporaryDetach() {
        Log.d(TAG, "dispatchStartTemporaryDetach")
        super.dispatchStartTemporaryDetach()
    }

    override fun setAccessibilityTraversalBefore(beforeId: Int) {
        Log.d(TAG, "setAccessibilityTraversalBefore")
        super.setAccessibilityTraversalBefore(beforeId)
    }

    override fun stopNestedScroll() {
        Log.d(TAG, "stopNestedScroll")
        super.stopNestedScroll()
    }

    override fun onGenericMotionEvent(event: MotionEvent?): Boolean {
        Log.d(TAG, "onGenericMotionEvent")
        return super.onGenericMotionEvent(event)
    }

    override fun getRotationY(): Float {
        Log.d(TAG, "getRotationY")
        return super.getRotationY()
    }

    override fun getLeftPaddingOffset(): Int {
        Log.d(TAG, "getLeftPaddingOffset")
        return super.getLeftPaddingOffset()
    }

    override fun isLayoutDirectionResolved(): Boolean {
        Log.d(TAG, "isLayoutDirectionResolved")
        return super.isLayoutDirectionResolved()
    }

    override fun isSaveEnabled(): Boolean {
        Log.d(TAG, "isSaveEnabled")
        return super.isSaveEnabled()
    }

    override fun isInTouchMode(): Boolean {
        Log.d(TAG, "isInTouchMode")
        return super.isInTouchMode()
    }

    override fun postOnAnimation(action: Runnable?) {
        Log.d(TAG, "postOnAnimation")
        super.postOnAnimation(action)
    }

    override fun isLayoutRequested(): Boolean {
        Log.d(TAG, "isLayoutRequested")
        return super.isLayoutRequested()
    }

    override fun setOnCreateContextMenuListener(l: OnCreateContextMenuListener?) {
        Log.d(TAG, "setOnCreateContextMenuListener")
        super.setOnCreateContextMenuListener(l)
    }

    override fun canScrollVertically(direction: Int): Boolean {
        Log.d(TAG, "canScrollVertically")
        return super.canScrollVertically(direction)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        Log.d(TAG, "onMeasure")
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }

    override fun setAccessibilityLiveRegion(mode: Int) {
        Log.d(TAG, "setAccessibilityLiveRegion")
        super.setAccessibilityLiveRegion(mode)
    }

    override fun isHorizontalScrollBarEnabled(): Boolean {
        Log.d(TAG, "isHorizontalScrollBarEnabled")
        return super.isHorizontalScrollBarEnabled()
    }

    override fun setOutlineProvider(provider: ViewOutlineProvider?) {
        Log.d(TAG, "setOutlineProvider")
        super.setOutlineProvider(provider)
    }

    override fun getSuggestedMinimumHeight(): Int {
        Log.d(TAG, "getSuggestedMinimumHeight")
        return super.getSuggestedMinimumHeight()
    }

    override fun dispatchWindowSystemUiVisiblityChanged(visible: Int) {
        Log.d(TAG, "dispatchWindowSystemUiVisiblityChanged")
        super.dispatchWindowSystemUiVisiblityChanged(visible)
    }

    override fun willNotDraw(): Boolean {
        Log.d(TAG, "willNotDraw")
        return super.willNotDraw()
    }

    override fun performHapticFeedback(feedbackConstant: Int): Boolean {
        Log.d(TAG, "performHapticFeedback")
        return super.performHapticFeedback(feedbackConstant)
    }

    override fun performHapticFeedback(feedbackConstant: Int, flags: Int): Boolean {
        Log.d(TAG, "performHapticFeedback")
        return super.performHapticFeedback(feedbackConstant, flags)
    }

//    override fun layout(l: Int, t: Int, r: Int, b: Int) {
//        Log.d(TAG, "layout")
//        super.layout(l, t, r, b)
//    }

    override fun dispatchTrackballEvent(event: MotionEvent?): Boolean {
        Log.d(TAG, "dispatchTrackballEvent")
        return super.dispatchTrackballEvent(event)
    }

    override fun checkInputConnectionProxy(view: View?): Boolean {
        Log.d(TAG, "checkInputConnectionProxy")
        return super.checkInputConnectionProxy(view)
    }

    override fun forceHasOverlappingRendering(hasOverlappingRendering: Boolean) {
        Log.d(TAG, "forceHasOverlappingRendering")
        super.forceHasOverlappingRendering(hasOverlappingRendering)
    }

    override fun getPaddingTop(): Int {
        Log.d(TAG, "getPaddingTop")
        return super.getPaddingTop()
    }

    override fun getTag(): Any {
        Log.d(TAG, "getTag")
        return super.getTag()
    }

    override fun getTag(key: Int): Any {
        Log.d(TAG, "getTag")
        return super.getTag(key)
    }

    override fun onProvideVirtualStructure(structure: ViewStructure?) {
        Log.d(TAG, "onProvideVirtualStructure")
        super.onProvideVirtualStructure(structure)
    }

    override fun releasePointerCapture() {
        Log.d(TAG, "releasePointerCapture")
        super.releasePointerCapture()
    }

    override fun setAccessibilityHeading(isHeading: Boolean) {
        Log.d(TAG, "setAccessibilityHeading")
        super.setAccessibilityHeading(isHeading)
    }

    override fun offsetLeftAndRight(offset: Int) {
        Log.d(TAG, "offsetLeftAndRight")
        super.offsetLeftAndRight(offset)
    }

    override fun getContextMenuInfo(): ContextMenu.ContextMenuInfo {
        Log.d(TAG, "getContextMenuInfo")
        return super.getContextMenuInfo()
    }

    override fun dispatchSystemUiVisibilityChanged(visibility: Int) {
        Log.d(TAG, "dispatchSystemUiVisibilityChanged")
        super.dispatchSystemUiVisibilityChanged(visibility)
    }

    override fun setFilterTouchesWhenObscured(enabled: Boolean) {
        Log.d(TAG, "setFilterTouchesWhenObscured")
        super.setFilterTouchesWhenObscured(enabled)
    }

    override fun toString(): String {
        Log.d(TAG, "toString")
        return super.toString()
    }

    override fun setForegroundGravity(gravity: Int) {
        Log.d(TAG, "setForegroundGravity")
        super.setForegroundGravity(gravity)
    }

    override fun hasNestedScrollingParent(): Boolean {
        Log.d(TAG, "hasNestedScrollingParent")
        return super.hasNestedScrollingParent()
    }

    override fun getGlobalVisibleRect(r: Rect?, globalOffset: Point?): Boolean {
        Log.d(TAG, "getGlobalVisibleRect")
        return super.getGlobalVisibleRect(r, globalOffset)
    }

    override fun setSaveEnabled(enabled: Boolean) {
        Log.d(TAG, "setSaveEnabled")
        super.setSaveEnabled(enabled)
    }

    override fun dispatchFinishTemporaryDetach() {
        Log.d(TAG, "dispatchFinishTemporaryDetach")
        super.dispatchFinishTemporaryDetach()
    }

    override fun dispatchTouchEvent(event: MotionEvent?): Boolean {
        Log.d(TAG, "dispatchTouchEvent")
        return super.dispatchTouchEvent(event)
    }

    override fun setLayerType(layerType: Int, paint: Paint?) {
        Log.d(TAG, "setLayerType")
        super.setLayerType(layerType, paint)
    }

    override fun setOnApplyWindowInsetsListener(listener: OnApplyWindowInsetsListener?) {
        Log.d(TAG, "setOnApplyWindowInsetsListener")
        super.setOnApplyWindowInsetsListener(listener)
    }

    override fun sendAccessibilityEventUnchecked(event: AccessibilityEvent?) {
        Log.d(TAG, "sendAccessibilityEventUnchecked")
        super.sendAccessibilityEventUnchecked(event)
    }

    override fun setDuplicateParentStateEnabled(enabled: Boolean) {
        Log.d(TAG, "setDuplicateParentStateEnabled")
        super.setDuplicateParentStateEnabled(enabled)
    }

    override fun isPressed(): Boolean {
        Log.d(TAG, "isPressed")
        return super.isPressed()
    }

    override fun getFitsSystemWindows(): Boolean {
        Log.d(TAG, "getFitsSystemWindows")
        return super.getFitsSystemWindows()
    }

    override fun canScrollHorizontally(direction: Int): Boolean {
        Log.d(TAG, "canScrollHorizontally")
        return super.canScrollHorizontally(direction)
    }

    override fun getScrollBarDefaultDelayBeforeFade(): Int {
        Log.d(TAG, "getScrollBarDefaultDelayBeforeFade")
        return super.getScrollBarDefaultDelayBeforeFade()
    }

    override fun hasExplicitFocusable(): Boolean {
        Log.d(TAG, "hasExplicitFocusable")
        return super.hasExplicitFocusable()
    }

    override fun createAccessibilityNodeInfo(): AccessibilityNodeInfo {
        Log.d(TAG, "createAccessibilityNodeInfo")
        return super.createAccessibilityNodeInfo()
    }

    override fun getMatrix(): Matrix {
        Log.d(TAG, "getMatrix")
        return super.getMatrix()
    }

    override fun setTranslationZ(translationZ: Float) {
        Log.d(TAG, "setTranslationZ")
        super.setTranslationZ(translationZ)
    }

    override fun onDraw(canvas: Canvas?) {
        Log.d(TAG, "onDraw")
        super.onDraw(canvas)
    }

    override fun onRestoreInstanceState(state: Parcelable?) {
        Log.d(TAG, "onRestoreInstanceState")
        super.onRestoreInstanceState(state)
    }

    override fun getLayerType(): Int {
        Log.d(TAG, "getLayerType")
        return super.getLayerType()
    }

    override fun refreshDrawableState() {
        Log.d(TAG, "refreshDrawableState")
        super.refreshDrawableState()
    }

    override fun getBottomPaddingOffset(): Int {
        Log.d(TAG, "getBottomPaddingOffset")
        return super.getBottomPaddingOffset()
    }

    override fun clearAnimation() {
        Log.d(TAG, "clearAnimation")
        super.clearAnimation()
    }

    override fun onKeyPreIme(keyCode: Int, event: KeyEvent?): Boolean {
        Log.d(TAG, "onKeyPreIme")
        return super.onKeyPreIme(keyCode, event)
    }

    override fun setContentDescription(contentDescription: CharSequence?) {
        Log.d(TAG, "setContentDescription")
        super.setContentDescription(contentDescription)
    }

    override fun onVisibilityChanged(changedView: View, visibility: Int) {
        Log.d(TAG, "onVisibilityChanged")
        super.onVisibilityChanged(changedView, visibility)
    }

    override fun requestFitSystemWindows() {
        Log.d(TAG, "requestFitSystemWindows")
        super.requestFitSystemWindows()
    }

    override fun setOnCapturedPointerListener(l: OnCapturedPointerListener?) {
        Log.d(TAG, "setOnCapturedPointerListener")
        super.setOnCapturedPointerListener(l)
    }

    override fun getForegroundTintMode(): PorterDuff.Mode? {
        Log.d(TAG, "getForegroundTintMode")
        return super.getForegroundTintMode()
    }

    override fun overScrollBy(deltaX: Int, deltaY: Int, scrollX: Int, scrollY: Int, scrollRangeX: Int, scrollRangeY: Int, maxOverScrollX: Int, maxOverScrollY: Int, isTouchEvent: Boolean): Boolean {
        Log.d(TAG, "overScrollBy")
        return super.overScrollBy(
            deltaX,
            deltaY,
            scrollX,
            scrollY,
            scrollRangeX,
            scrollRangeY,
            maxOverScrollX,
            maxOverScrollY,
            isTouchEvent
        )
    }

    override fun setStateListAnimator(stateListAnimator: StateListAnimator?) {
        Log.d(TAG, "setStateListAnimator")
        super.setStateListAnimator(stateListAnimator)
    }

    override fun onKeyUp(keyCode: Int, event: KeyEvent?): Boolean {
        Log.d(TAG, "onKeyUp")
        return super.onKeyUp(keyCode, event)
    }

    override fun getNextFocusForwardId(): Int {
        Log.d(TAG, "getNextFocusForwardId")
        return super.getNextFocusForwardId()
    }

    override fun setSelected(selected: Boolean) {
        Log.d(TAG, "setSelected")
        super.setSelected(selected)
    }

    override fun getSuggestedMinimumWidth(): Int {
        Log.d(TAG, "getSuggestedMinimumWidth")
        return super.getSuggestedMinimumWidth()
    }

    override fun getWindowAttachCount(): Int {
        Log.d(TAG, "getWindowAttachCount")
        return super.getWindowAttachCount()
    }

    // start Override viewgroup

    override fun focusSearch(focused: View?, direction: Int): View {
        Log.d(TAG, "focusSearch")
        return super.focusSearch(focused, direction)
    }

    override fun getClipChildren(): Boolean {
        Log.d(TAG, "getClipChildren")
        return super.getClipChildren()
    }

    override fun addView(child: View?) {
        Log.d(TAG, "addView")
        super.addView(child)
    }

    override fun addView(child: View?, index: Int) {
        Log.d(TAG, "addView")
        super.addView(child, index)
    }

    override fun addView(child: View?, width: Int, height: Int) {
        Log.d(TAG, "addView")
        super.addView(child, width, height)
    }

    override fun addView(child: View?, params: LayoutParams?) {
        Log.d(TAG, "addView")
        super.addView(child, params)
    }

    override fun addView(child: View?, index: Int, params: LayoutParams?) {
        Log.d(TAG, "addView")
        super.addView(child, index, params)
    }

    override fun onRequestSendAccessibilityEvent(
        child: View?,
        event: AccessibilityEvent?
    ): Boolean {
        Log.d(TAG, "onRequestSendAccessibilityEvent")
        return super.onRequestSendAccessibilityEvent(child, event)
    }

    override fun setClipToPadding(clipToPadding: Boolean) {
        Log.d(TAG, "setClipToPadding")
        super.setClipToPadding(clipToPadding)
    }

    override fun isChildrenDrawingOrderEnabled(): Boolean {
        Log.d(TAG, "isChildrenDrawingOrderEnabled")
        return super.isChildrenDrawingOrderEnabled()
    }

    override fun getNestedScrollAxes(): Int {
        Log.d(TAG, "getNestedScrollAxes")
        return super.getNestedScrollAxes()
    }

    override fun getOverlay(): ViewGroupOverlay {
        Log.d(TAG, "getOverlay")
        return super.getOverlay()
    }

    override fun setChildrenDrawingOrderEnabled(enabled: Boolean) {
        Log.d(TAG, "setChildrenDrawingOrderEnabled")
        super.setChildrenDrawingOrderEnabled(enabled)
    }

    override fun setTouchscreenBlocksFocus(touchscreenBlocksFocus: Boolean) {
        Log.d(TAG, "setTouchscreenBlocksFocus")
        super.setTouchscreenBlocksFocus(touchscreenBlocksFocus)
    }

    override fun onNestedFling(
        target: View?,
        velocityX: Float,
        velocityY: Float,
        consumed: Boolean
    ): Boolean {
        Log.d(TAG, "onNestedFling")
        return super.onNestedFling(target, velocityX, velocityY, consumed)
    }

    override fun getChildDrawingOrder(childCount: Int, i: Int): Int {
        Log.d(TAG, "getChildDrawingOrder")
        return super.getChildDrawingOrder(childCount, i)
    }

    override fun getClipToPadding(): Boolean {
        Log.d(TAG, "getClipToPadding")
        return super.getClipToPadding()
    }

    override fun setOnHierarchyChangeListener(listener: OnHierarchyChangeListener?) {
        Log.d(TAG, "setOnHierarchyChangeListener")
        super.setOnHierarchyChangeListener(listener)
    }

    override fun debug(depth: Int) {
        Log.d(TAG, "debug")
        super.debug(depth)
    }

    override fun attachLayoutAnimationParameters(
        child: View?,
        params: LayoutParams?,
        index: Int,
        count: Int
    ) {
        Log.d(TAG, "attachLayoutAnimationParameters")
        super.attachLayoutAnimationParameters(child, params, index, count)
    }

    override fun clearChildFocus(child: View?) {
        Log.d(TAG, "clearChildFocus")
        super.clearChildFocus(child)
    }

    override fun isAnimationCacheEnabled(): Boolean {
        Log.d(TAG, "isAnimationCacheEnabled")
        return super.isAnimationCacheEnabled()
    }

    override fun removeAllViews() {
        Log.d(TAG, "removeAllViews")
        super.removeAllViews()
    }

    override fun dispatchFreezeSelfOnly(container: SparseArray<Parcelable>?) {
        Log.d(TAG, "dispatchFreezeSelfOnly")
        super.dispatchFreezeSelfOnly(container)
    }

    override fun getLayoutAnimation(): LayoutAnimationController {
        Log.d(TAG, "getLayoutAnimation")
        return super.getLayoutAnimation()
    }

    override fun requestChildFocus(child: View?, focused: View?) {
        Log.d(TAG, "requestChildFocus")
        super.requestChildFocus(child, focused)
    }

    override fun setClipChildren(clipChildren: Boolean) {
        Log.d(TAG, "setClipChildren")
        super.setClipChildren(clipChildren)
    }

    override fun getLayoutMode(): Int {
        Log.d(TAG, "getLayoutMode")
        return super.getLayoutMode()
    }

    override fun setLayoutMode(layoutMode: Int) {
        Log.d(TAG, "setLayoutMode")
        super.setLayoutMode(layoutMode)
    }

    override fun scheduleLayoutAnimation() {
        Log.d(TAG, "scheduleLayoutAnimation")
        super.scheduleLayoutAnimation()
    }

    override fun indexOfChild(child: View?): Int {
        Log.d(TAG, "indexOfChild")
        return super.indexOfChild(child)
    }

    override fun getChildVisibleRect(child: View?, r: Rect?, offset: Point?): Boolean {
        Log.d(TAG, "getChildVisibleRect")
        return super.getChildVisibleRect(child, r, offset)
    }

    override fun onNestedPreScroll(target: View?, dx: Int, dy: Int, consumed: IntArray?) {
        Log.d(TAG, "onNestedPreScroll")
        super.onNestedPreScroll(target, dx, dy, consumed)
    }

    override fun removeViewInLayout(view: View?) {
        Log.d(TAG, "removeViewInLayout")
        super.removeViewInLayout(view)
    }

    override fun endViewTransition(view: View?) {
        Log.d(TAG, "endViewTransition")
        super.endViewTransition(view)
    }

    override fun detachViewsFromParent(start: Int, count: Int) {
        Log.d(TAG, "detachViewsFromParent")
        super.detachViewsFromParent(start, count)
    }

    override fun detachViewFromParent(child: View?) {
        Log.d(TAG, "detachViewFromParent")
        super.detachViewFromParent(child)
    }

    override fun detachViewFromParent(index: Int) {
        Log.d(TAG, "detachViewFromParent")
        super.detachViewFromParent(index)
    }

    override fun invalidateChildInParent(location: IntArray?, dirty: Rect?): ViewParent {
        Log.d(TAG, "invalidateChildInParent")
        return super.invalidateChildInParent(location, dirty)
    }

    override fun onStopNestedScroll(child: View?) {
        Log.d(TAG, "onStopNestedScroll")
        super.onStopNestedScroll(child)
    }

    override fun clearDisappearingChildren() {
        Log.d(TAG, "clearDisappearingChildren")
        super.clearDisappearingChildren()
    }

    override fun setAlwaysDrawnWithCacheEnabled(always: Boolean) {
        Log.d(TAG, "setAlwaysDrawnWithCacheEnabled")
        super.setAlwaysDrawnWithCacheEnabled(always)
    }

    override fun checkLayoutParams(p: LayoutParams?): Boolean {
        Log.d(TAG, "checkLayoutParams")
        return super.checkLayoutParams(p)
    }

    override fun removeViews(start: Int, count: Int) {
        Log.d(TAG, "removeViews")
        super.removeViews(start, count)
    }

    override fun setChildrenDrawingCacheEnabled(enabled: Boolean) {
        Log.d(TAG, "setChildrenDrawingCacheEnabled")
        super.setChildrenDrawingCacheEnabled(enabled)
    }

    override fun detachAllViewsFromParent() {
        Log.d(TAG, "detachAllViewsFromParent")
        super.detachAllViewsFromParent()
    }

    override fun onInterceptHoverEvent(event: MotionEvent?): Boolean {
        Log.d(TAG, "onInterceptHoverEvent")
        return super.onInterceptHoverEvent(event)
    }

    override fun isMotionEventSplittingEnabled(): Boolean {
        Log.d(TAG, "isMotionEventSplittingEnabled")
        return super.isMotionEventSplittingEnabled()
    }

    override fun requestChildRectangleOnScreen(
        child: View?,
        rectangle: Rect?,
        immediate: Boolean
    ): Boolean {
        Log.d(TAG, "requestChildRectangleOnScreen")
        return super.requestChildRectangleOnScreen(child, rectangle, immediate)
    }

    override fun getTouchscreenBlocksFocus(): Boolean {
        Log.d(TAG, "getTouchscreenBlocksFocus")
        return super.getTouchscreenBlocksFocus()
    }

    override fun isChildrenDrawnWithCacheEnabled(): Boolean {
        Log.d(TAG, "isChildrenDrawnWithCacheEnabled")
        return super.isChildrenDrawnWithCacheEnabled()
    }

    override fun addStatesFromChildren(): Boolean {
        Log.d(TAG, "addStatesFromChildren")
        return super.addStatesFromChildren()
    }

    override fun onViewAdded(child: View?) {
        Log.d(TAG, "onViewAdded")
        super.onViewAdded(child)
    }

    override fun onViewRemoved(child: View?) {
        Log.d(TAG, "onViewRemoved")
        super.onViewRemoved(child)
    }

    override fun setLayoutTransition(transition: LayoutTransition?) {
        Log.d(TAG, "setLayoutTransition")
        super.setLayoutTransition(transition)
    }

    override fun onStartNestedScroll(child: View?, target: View?, nestedScrollAxes: Int): Boolean {
        Log.d(TAG, "onStartNestedScroll")
        return super.onStartNestedScroll(child, target, nestedScrollAxes)
    }

    override fun getLayoutTransition(): LayoutTransition {
        Log.d(TAG, "getLayoutTransition")
        return super.getLayoutTransition()
    }

    override fun onRequestFocusInDescendants(
        direction: Int,
        previouslyFocusedRect: Rect?
    ): Boolean {
        Log.d(TAG, "onRequestFocusInDescendants")
        return super.onRequestFocusInDescendants(direction, previouslyFocusedRect)
    }

    override fun cleanupLayoutState(child: View?) {
        Log.d(TAG, "cleanupLayoutState")
        super.cleanupLayoutState(child)
    }

    override fun drawChild(canvas: Canvas?, child: View?, drawingTime: Long): Boolean {
        Log.d(TAG, "drawChild")
        return super.drawChild(canvas, child, drawingTime)
    }

    override fun getChildCount(): Int {
        Log.d(TAG, "getChildCount")
        return super.getChildCount()
    }

    override fun getChildStaticTransformation(child: View?, t: Transformation?): Boolean {
        Log.d(TAG, "getChildStaticTransformation")
        return super.getChildStaticTransformation(child, t)
    }

    override fun requestTransparentRegion(child: View?) {
        Log.d(TAG, "requestTransparentRegion")
        super.requestTransparentRegion(child)
    }

    override fun getChildAt(index: Int): View {
        Log.d(TAG, "getChildAt")
        return super.getChildAt(index)
    }

    override fun updateViewLayout(view: View?, params: LayoutParams?) {
        Log.d(TAG, "updateViewLayout")
        super.updateViewLayout(view, params)
    }

    override fun removeView(view: View?) {
        Log.d(TAG, "removeView")
        super.removeView(view)
    }

    override fun attachViewToParent(child: View?, index: Int, params: LayoutParams?) {
        Log.d(TAG, "attachViewToParent")
        super.attachViewToParent(child, index, params)
    }

    override fun measureChild(
        child: View?,
        parentWidthMeasureSpec: Int,
        parentHeightMeasureSpec: Int
    ) {
        Log.d(TAG, "measureChild")
        super.measureChild(child, parentWidthMeasureSpec, parentHeightMeasureSpec)
    }

    override fun onNestedScrollAccepted(child: View?, target: View?, axes: Int) {
        Log.d(TAG, "onNestedScrollAccepted")
        super.onNestedScrollAccepted(child, target, axes)
    }

    override fun isTransitionGroup(): Boolean {
        Log.d(TAG, "isTransitionGroup")
        return super.isTransitionGroup()
    }

    override fun generateLayoutParams(attrs: AttributeSet?): LayoutParams {
        Log.d(TAG, "generateLayoutParams")
        return super.generateLayoutParams(attrs)
    }

    override fun generateLayoutParams(p: LayoutParams?): LayoutParams {
        Log.d(TAG, "generateLayoutParams")
        return super.generateLayoutParams(p)
    }

    override fun removeAllViewsInLayout() {
        Log.d(TAG, "removeAllViewsInLayout")
        super.removeAllViewsInLayout()
    }

    override fun gatherTransparentRegion(region: Region?): Boolean {
        Log.d(TAG, "gatherTransparentRegion")
        return super.gatherTransparentRegion(region)
    }

    override fun measureChildWithMargins(
        child: View?,
        parentWidthMeasureSpec: Int,
        widthUsed: Int,
        parentHeightMeasureSpec: Int,
        heightUsed: Int
    ) {
        Log.d(TAG, "measureChildWithMargins")
        super.measureChildWithMargins(
            child,
            parentWidthMeasureSpec,
            widthUsed,
            parentHeightMeasureSpec,
            heightUsed
        )
    }

    override fun setChildrenDrawnWithCacheEnabled(enabled: Boolean) {
        Log.d(TAG, "setChildrenDrawnWithCacheEnabled")
        super.setChildrenDrawnWithCacheEnabled(enabled)
    }

    override fun bringChildToFront(child: View?) {
        Log.d(TAG, "bringChildToFront")
        super.bringChildToFront(child)
    }

    override fun removeViewAt(index: Int) {
        Log.d(TAG, "removeViewAt")
        super.removeViewAt(index)
    }

    override fun removeViewsInLayout(start: Int, count: Int) {
        Log.d(TAG, "removeViewsInLayout")
        super.removeViewsInLayout(start, count)
    }

    override fun shouldDelayChildPressedState(): Boolean {
        Log.d(TAG, "shouldDelayChildPressedState")
        return super.shouldDelayChildPressedState()
    }

    override fun setStaticTransformationsEnabled(enabled: Boolean) {
        Log.d(TAG, "setStaticTransformationsEnabled")
        super.setStaticTransformationsEnabled(enabled)
    }

    override fun focusableViewAvailable(v: View?) {
        Log.d(TAG, "focusableViewAvailable")
        super.focusableViewAvailable(v)
    }

    override fun getLayoutAnimationListener(): Animation.AnimationListener {
        Log.d(TAG, "getLayoutAnimationListener")
        return super.getLayoutAnimationListener()
    }

    override fun startLayoutAnimation() {
        Log.d(TAG, "startLayoutAnimation")
        super.startLayoutAnimation()
    }

    override fun recomputeViewAttributes(child: View?) {
        Log.d(TAG, "recomputeViewAttributes")
        super.recomputeViewAttributes(child)
    }

    override fun startActionModeForChild(
        originalView: View?,
        callback: ActionMode.Callback?
    ): ActionMode {
        Log.d(TAG, "startActionModeForChild")
        return super.startActionModeForChild(originalView, callback)
    }

    override fun startActionModeForChild(
        originalView: View?,
        callback: ActionMode.Callback?,
        type: Int
    ): ActionMode {
        Log.d(TAG, "startActionModeForChild")
        return super.startActionModeForChild(originalView, callback, type)
    }

    override fun removeDetachedView(child: View?, animate: Boolean) {
        Log.d(TAG, "removeDetachedView")
        super.removeDetachedView(child, animate)
    }

    override fun isAlwaysDrawnWithCacheEnabled(): Boolean {
        Log.d(TAG, "isAlwaysDrawnWithCacheEnabled")
        return super.isAlwaysDrawnWithCacheEnabled()
    }

    override fun startViewTransition(view: View?) {
        Log.d(TAG, "startViewTransition")
        super.startViewTransition(view)
    }

    override fun onDescendantInvalidated(child: View, target: View) {
        Log.d(TAG, "onDescendantInvalidated")
        super.onDescendantInvalidated(child, target)
    }

    override fun requestDisallowInterceptTouchEvent(disallowIntercept: Boolean) {
        Log.d(TAG, "requestDisallowInterceptTouchEvent")
        super.requestDisallowInterceptTouchEvent(disallowIntercept)
    }

    override fun setAddStatesFromChildren(addsStates: Boolean) {
        Log.d(TAG, "setAddStatesFromChildren")
        super.setAddStatesFromChildren(addsStates)
    }

    override fun requestSendAccessibilityEvent(child: View?, event: AccessibilityEvent?): Boolean {
        Log.d(TAG, "requestSendAccessibilityEvent")
        return super.requestSendAccessibilityEvent(child, event)
    }

    override fun canAnimate(): Boolean {
        Log.d(TAG, "canAnimate")
        return super.canAnimate()
    }

    override fun notifySubtreeAccessibilityStateChanged(
        child: View?,
        source: View,
        changeType: Int
    ) {
        Log.d(TAG, "notifySubtreeAccessibilityStateChanged")
        super.notifySubtreeAccessibilityStateChanged(child, source, changeType)
    }

    override fun childHasTransientStateChanged(child: View?, childHasTransientState: Boolean) {
        Log.d(TAG, "childHasTransientStateChanged")
        super.childHasTransientStateChanged(child, childHasTransientState)
    }

    override fun childDrawableStateChanged(child: View?) {
        Log.d(TAG, "childDrawableStateChanged")
        super.childDrawableStateChanged(child)
    }

    override fun addViewInLayout(child: View?, index: Int, params: LayoutParams?): Boolean {
        Log.d(TAG, "addViewInLayout")
        return super.addViewInLayout(child, index, params)
    }

    override fun addViewInLayout(
        child: View?,
        index: Int,
        params: LayoutParams?,
        preventRequestLayout: Boolean
    ): Boolean {
        Log.d(TAG, "addViewInLayout")
        return super.addViewInLayout(child, index, params, preventRequestLayout)
    }

    override fun showContextMenuForChild(originalView: View?): Boolean {
        Log.d(TAG, "showContextMenuForChild")
        return super.showContextMenuForChild(originalView)
    }

    override fun showContextMenuForChild(originalView: View?, x: Float, y: Float): Boolean {
        Log.d(TAG, "showContextMenuForChild")
        return super.showContextMenuForChild(originalView, x, y)
    }

    override fun measureChildren(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        Log.d(TAG, "measureChildren")
        super.measureChildren(widthMeasureSpec, heightMeasureSpec)
    }

    override fun onNestedScroll(
        target: View?,
        dxConsumed: Int,
        dyConsumed: Int,
        dxUnconsumed: Int,
        dyUnconsumed: Int
    ) {
        Log.d(TAG, "onNestedScroll")
        super.onNestedScroll(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed)
    }

    override fun setPersistentDrawingCache(drawingCacheToKeep: Int) {
        Log.d(TAG, "setPersistentDrawingCache")
        super.setPersistentDrawingCache(drawingCacheToKeep)
    }

    override fun setDescendantFocusability(focusability: Int) {
        Log.d(TAG, "setDescendantFocusability")
        super.setDescendantFocusability(focusability)
    }

    override fun getFocusedChild(): View {
        Log.d(TAG, "getFocusedChild")
        return super.getFocusedChild()
    }

    override fun setTransitionGroup(isTransitionGroup: Boolean) {
        Log.d(TAG, "setTransitionGroup")
        super.setTransitionGroup(isTransitionGroup)
    }

    override fun onNestedPrePerformAccessibilityAction(
        target: View?,
        action: Int,
        args: Bundle?
    ): Boolean {
        Log.d(TAG, "onNestedPrePerformAccessibilityAction")
        return super.onNestedPrePerformAccessibilityAction(target, action, args)
    }

    override fun onNestedPreFling(target: View?, velocityX: Float, velocityY: Float): Boolean {
        Log.d(TAG, "onNestedPreFling")
        return super.onNestedPreFling(target, velocityX, velocityY)
    }

    override fun dispatchThawSelfOnly(container: SparseArray<Parcelable>?) {
        Log.d(TAG, "dispatchThawSelfOnly")
        super.dispatchThawSelfOnly(container)
    }

    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        Log.d(TAG, "onInterceptTouchEvent")
        return super.onInterceptTouchEvent(ev)
    }

    override fun getDescendantFocusability(): Int {
        Log.d(TAG, "getDescendantFocusability")
        return super.getDescendantFocusability()
    }

    override fun setMotionEventSplittingEnabled(split: Boolean) {
        Log.d(TAG, "setMotionEventSplittingEnabled")
        super.setMotionEventSplittingEnabled(split)
    }

    override fun generateDefaultLayoutParams(): LayoutParams {
        Log.d(TAG, "generateDefaultLayoutParams")
        return super.generateDefaultLayoutParams()
    }

    override fun setLayoutAnimation(controller: LayoutAnimationController?) {
        Log.d(TAG, "setLayoutAnimation")
        super.setLayoutAnimation(controller)
    }

    override fun setAnimationCacheEnabled(enabled: Boolean) {
        Log.d(TAG, "setAnimationCacheEnabled")
        super.setAnimationCacheEnabled(enabled)
    }

    override fun setLayoutAnimationListener(animationListener: Animation.AnimationListener?) {
        Log.d(TAG, "setLayoutAnimationListener")
        super.setLayoutAnimationListener(animationListener)
    }

    override fun getPersistentDrawingCache(): Int {
        Log.d(TAG, "getPersistentDrawingCache")
        return super.getPersistentDrawingCache()
    }
}