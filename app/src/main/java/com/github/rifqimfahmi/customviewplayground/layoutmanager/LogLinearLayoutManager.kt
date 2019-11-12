package com.github.rifqimfahmi.customviewplayground.layoutmanager

import android.content.Context
import android.graphics.PointF
import android.graphics.Rect
import android.os.Bundle
import android.os.Parcelable
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.view.accessibility.AccessibilityEvent
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class LogLinearLayoutManager: LinearLayoutManager {

    val TAG_LAYOUT_MANAGER = "LogLayoutManager_Base"
    val TAG_LINEAR_LAYOUT_MANAGER = "LogLayoutManager_Linear"

    constructor(context: Context?) : super(context)

    constructor(context: Context?, orientation: Int, reverseLayout: Boolean) : super(
        context,
        orientation,
        reverseLayout
    )

    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes)


    override fun attachView(child: View, index: Int, lp: RecyclerView.LayoutParams?) {
        Log.d(TAG_LAYOUT_MANAGER, "attachView")
        super.attachView(child, index, lp)
    }

    override fun attachView(child: View, index: Int) {
        Log.d(TAG_LAYOUT_MANAGER, "attachView")
        super.attachView(child, index)
    }

    override fun attachView(child: View) {
        Log.d(TAG_LAYOUT_MANAGER, "attachView")
        super.attachView(child)
    }

    override fun getLeftDecorationWidth(child: View): Int {
        Log.d(TAG_LAYOUT_MANAGER, "getLeftDecorationWidth")
        return super.getLeftDecorationWidth(child)
    }

    override fun addView(child: View?) {
        Log.d(TAG_LAYOUT_MANAGER, "addView")
        super.addView(child)
    }

    override fun addView(child: View?, index: Int) {
        Log.d(TAG_LAYOUT_MANAGER, "addView")
        super.addView(child, index)
    }

    override fun onItemsAdded(recyclerView: RecyclerView, positionStart: Int, itemCount: Int) {
        Log.d(TAG_LAYOUT_MANAGER, "onItemsAdded")
        super.onItemsAdded(recyclerView, positionStart, itemCount)
    }

    override fun onAttachedToWindow(view: RecyclerView?) {
        Log.d(TAG_LAYOUT_MANAGER, "onAttachedToWindow")
        super.onAttachedToWindow(view)
    }

    override fun layoutDecorated(child: View, left: Int, top: Int, right: Int, bottom: Int) {
        Log.d(TAG_LAYOUT_MANAGER, "layoutDecorated")
        super.layoutDecorated(child, left, top, right, bottom)
    }

//    override fun detachViewInternal(index: Int, view: View) {
//        super.detachViewInternal(index, view)
//    }

    override fun getChildCount(): Int {
        Log.d(TAG_LAYOUT_MANAGER, "getChildCount")
        return super.getChildCount()
    }

    override fun getMinimumWidth(): Int {
        Log.d(TAG_LAYOUT_MANAGER, "getMinimumWidth")
        return super.getMinimumWidth()
    }

    override fun onInitializeAccessibilityEvent(
        recycler: RecyclerView.Recycler,
        state: RecyclerView.State,
        event: AccessibilityEvent
    ) {
        Log.d(TAG_LAYOUT_MANAGER, "onInitializeAccessibilityEvent")
        super.onInitializeAccessibilityEvent(recycler, state, event)
    }

    override fun getDecoratedTop(child: View): Int {
        Log.d(TAG_LAYOUT_MANAGER, "getDecoratedTop")
        return super.getDecoratedTop(child)
    }

    override fun getChildAt(index: Int): View? {
        Log.d(TAG_LAYOUT_MANAGER, "getChildAt")
        return super.getChildAt(index)
    }

    override fun getHeight(): Int {
        Log.d(TAG_LAYOUT_MANAGER, "getHeight")
        return super.getHeight()
    }

    override fun detachAndScrapViewAt(index: Int, recycler: RecyclerView.Recycler) {
        Log.d(TAG_LAYOUT_MANAGER, "detachAndScrapViewAt")
        super.detachAndScrapViewAt(index, recycler)
    }

    override fun getWidthMode(): Int {
        Log.d(TAG_LAYOUT_MANAGER, "getWidthMode")
        return super.getWidthMode()
    }

    override fun removeView(child: View?) {
        Log.d(TAG_LAYOUT_MANAGER, "removeView")
        super.removeView(child)
    }

    override fun hasFocus(): Boolean {
        Log.d(TAG_LAYOUT_MANAGER, "hasFocus")
        return super.hasFocus()
    }

    override fun calculateItemDecorationsForChild(child: View, outRect: Rect) {
        Log.d(TAG_LAYOUT_MANAGER, "calculateItemDecorationsForChild")
        super.calculateItemDecorationsForChild(child, outRect)
    }

    override fun assertInLayoutOrScroll(message: String?) {
        Log.d(TAG_LAYOUT_MANAGER, "assertInLayoutOrScroll")
        super.assertInLayoutOrScroll(message)
    }

    override fun offsetChildrenHorizontal(dx: Int) {
        Log.d(TAG_LAYOUT_MANAGER, "offsetChildrenHorizontal")
        super.offsetChildrenHorizontal(dx)
    }

    override fun detachAndScrapAttachedViews(recycler: RecyclerView.Recycler) {
        Log.d(TAG_LAYOUT_MANAGER, "detachAndScrapAttachedViews")
        super.detachAndScrapAttachedViews(recycler)
    }

    override fun measureChild(child: View, widthUsed: Int, heightUsed: Int) {
        Log.d(TAG_LAYOUT_MANAGER, "measureChild")
        super.measureChild(child, widthUsed, heightUsed)
    }

//    override fun removeAndRecycleScrapInt(recycler: RecyclerView.Recycler?) {
//        super.removeAndRecycleScrapInt(recycler)
//    }

    override fun onAddFocusables(
        recyclerView: RecyclerView,
        views: ArrayList<View>,
        direction: Int,
        focusableMode: Int
    ): Boolean {
        Log.d(TAG_LAYOUT_MANAGER, "onAddFocusables ")
        return super.onAddFocusables(recyclerView, views, direction, focusableMode)
    }

    override fun getItemCount(): Int {
        Log.d(TAG_LAYOUT_MANAGER, "getItemCount")
        return super.getItemCount()
    }

    override fun getClipToPadding(): Boolean {
        Log.d(TAG_LAYOUT_MANAGER, "getClipToPadding")
        return super.getClipToPadding()
    }

//    override fun performAccessibilityAction(action: Int, args: Bundle?): Boolean {
//        return super.performAccessibilityAction(action, args)
//    }

    override fun performAccessibilityAction(
        recycler: RecyclerView.Recycler,
        state: RecyclerView.State,
        action: Int,
        args: Bundle?
    ): Boolean {
        Log.d(TAG_LAYOUT_MANAGER, "performAccessibilityAction")
        return super.performAccessibilityAction(recycler, state, action, args)
    }

//    override fun dispatchDetachedFromWindow(view: RecyclerView?, recycler: RecyclerView.Recycler?) {
//        super.dispatchDetachedFromWindow(view, recycler)
//    }

    override fun generateLayoutParams(lp: ViewGroup.LayoutParams?): RecyclerView.LayoutParams {
        Log.d(TAG_LAYOUT_MANAGER, "generateLayoutParams")
        return super.generateLayoutParams(lp)
    }

    override fun generateLayoutParams(
        c: Context?,
        attrs: AttributeSet?
    ): RecyclerView.LayoutParams {
        Log.d(TAG_LAYOUT_MANAGER, "generateLayoutParams")
        return super.generateLayoutParams(c, attrs)
    }

    override fun requestLayout() {
        Log.d(TAG_LAYOUT_MANAGER, "requestLayout")
        super.requestLayout()
    }

    override fun removeAndRecycleViewAt(index: Int, recycler: RecyclerView.Recycler) {
        Log.d(TAG_LAYOUT_MANAGER, "removeAndRecycleViewAt")
        super.removeAndRecycleViewAt(index, recycler)
    }

//    override fun performAccessibilityActionForItem(
//        view: View,
//        action: Int,
//        args: Bundle?
//    ): Boolean {
//        return super.performAccessibilityActionForItem(view, action, args)
//    }

    override fun performAccessibilityActionForItem(
        recycler: RecyclerView.Recycler,
        state: RecyclerView.State,
        view: View,
        action: Int,
        args: Bundle?
    ): Boolean {
        Log.d(TAG_LAYOUT_MANAGER, "performAccessibilityActionForItem")
        return super.performAccessibilityActionForItem(recycler, state, view, action, args)
    }

//    override fun onInitializeAccessibilityNodeInfoForItem(
//        host: View?,
//        info: AccessibilityNodeInfoCompat?
//    ) {
//        super.onInitializeAccessibilityNodeInfoForItem(host, info)
//    }

    override fun onInitializeAccessibilityNodeInfoForItem(
        recycler: RecyclerView.Recycler,
        state: RecyclerView.State,
        host: View,
        info: AccessibilityNodeInfoCompat
    ) {
        Log.d(TAG_LAYOUT_MANAGER, "onInitializeAccessibilityNodeInfoForItem")
        super.onInitializeAccessibilityNodeInfoForItem(recycler, state, host, info)
    }

    override fun measureChildWithMargins(child: View, widthUsed: Int, heightUsed: Int) {
        Log.d(TAG_LAYOUT_MANAGER, "measureChildWithMargins")
        super.measureChildWithMargins(child, widthUsed, heightUsed)
    }

    override fun getPosition(view: View): Int {
        Log.d(TAG_LAYOUT_MANAGER, "getPosition")
        return super.getPosition(view)
    }

    override fun removeViewAt(index: Int) {
        Log.d(TAG_LAYOUT_MANAGER, "removeViewAt")
        super.removeViewAt(index)
    }

    override fun getTransformedBoundingBox(child: View, includeDecorInsets: Boolean, out: Rect) {
        Log.d(TAG_LAYOUT_MANAGER, "getTransformedBoundingBox")
        super.getTransformedBoundingBox(child, includeDecorInsets, out)
    }

//    override fun shouldMeasureChild(
//        child: View?,
//        widthSpec: Int,
//        heightSpec: Int,
//        lp: RecyclerView.LayoutParams?
//    ): Boolean {
//        return super.shouldMeasureChild(child, widthSpec, heightSpec, lp)
//    }

    override fun ignoreView(view: View) {
        Log.d(TAG_LAYOUT_MANAGER, "ignoreView")
        super.ignoreView(view)
    }

//    override fun setExactMeasureSpecsFrom(recyclerView: RecyclerView?) {
//        super.setExactMeasureSpecsFrom(recyclerView)
//    }

    override fun removeCallbacks(action: Runnable?): Boolean {
        Log.d(TAG_LAYOUT_MANAGER, "removeCallbacks")
        return super.removeCallbacks(action)
    }

    override fun getBaseline(): Int {
        Log.d(TAG_LAYOUT_MANAGER, "getBaseline")
        return super.getBaseline()
    }

    override fun onItemsMoved(recyclerView: RecyclerView, from: Int, to: Int, itemCount: Int) {
        Log.d(TAG_LAYOUT_MANAGER, "onItemsMoved")
        super.onItemsMoved(recyclerView, from, to, itemCount)
    }

    override fun getLayoutDirection(): Int {
        Log.d(TAG_LAYOUT_MANAGER, "getLayoutDirection")
        return super.getLayoutDirection()
    }

    override fun removeAllViews() {
        Log.d(TAG_LAYOUT_MANAGER, "removeAllViews")
        super.removeAllViews()
    }

    override fun getPaddingLeft(): Int {
        Log.d(TAG_LAYOUT_MANAGER, "getPaddingLeft")
        return super.getPaddingLeft()
    }

    override fun getDecoratedMeasuredHeight(child: View): Int {
        Log.d(TAG_LAYOUT_MANAGER, "getDecoratedMeasuredHeight")
        return super.getDecoratedMeasuredHeight(child)
    }

    override fun getPaddingBottom(): Int {
        Log.d(TAG_LAYOUT_MANAGER, "getPaddingBottom")
        return super.getPaddingBottom()
    }

    override fun getMinimumHeight(): Int {
        Log.d(TAG_LAYOUT_MANAGER, "getMinimumHeight")
        return super.getMinimumHeight()
    }

    override fun getDecoratedRight(child: View): Int {
        Log.d(TAG_LAYOUT_MANAGER, "getDecoratedRight")
        return super.getDecoratedRight(child)
    }

    override fun onInterceptFocusSearch(focused: View, direction: Int): View? {
        Log.d(TAG_LAYOUT_MANAGER, "onInterceptFocusSearch")
        return super.onInterceptFocusSearch(focused, direction)
    }

    override fun stopIgnoringView(view: View) {
        Log.d(TAG_LAYOUT_MANAGER, "stopIgnoringView")
        super.stopIgnoringView(view)
    }

//    override fun onInitializeAccessibilityNodeInfo(info: AccessibilityNodeInfoCompat?) {
//        super.onInitializeAccessibilityNodeInfo(info)
//    }

    override fun onInitializeAccessibilityNodeInfo(
        recycler: RecyclerView.Recycler,
        state: RecyclerView.State,
        info: AccessibilityNodeInfoCompat
    ) {
        Log.d(TAG_LAYOUT_MANAGER, "onInitializeAccessibilityNodeInfo")
        super.onInitializeAccessibilityNodeInfo(recycler, state, info)
    }

    override fun getColumnCountForAccessibility(
        recycler: RecyclerView.Recycler,
        state: RecyclerView.State
    ): Int {
        Log.d(TAG_LAYOUT_MANAGER, "getColumnCountForAccessibility")
        return super.getColumnCountForAccessibility(recycler, state)
    }

    override fun onItemsChanged(recyclerView: RecyclerView) {
        Log.d(TAG_LAYOUT_MANAGER, "onItemsChanged")
        super.onItemsChanged(recyclerView)
    }

//    override fun setMeasuredDimensionFromChildren(widthSpec: Int, heightSpec: Int) {
//        super.setMeasuredDimensionFromChildren(widthSpec, heightSpec)
//    }

    override fun removeDetachedView(child: View) {
        Log.d(TAG_LAYOUT_MANAGER, "removeDetachedView")
        super.removeDetachedView(child)
    }

    override fun endAnimation(view: View?) {
        Log.d(TAG_LAYOUT_MANAGER, "endAnimation")
        super.endAnimation(view)
    }

//    override fun addViewInt(child: View?, index: Int, disappearing: Boolean) {
//        super.addViewInt(child, index, disappearing)
//    }

    override fun onItemsUpdated(recyclerView: RecyclerView, positionStart: Int, itemCount: Int) {
        Log.d(TAG_LAYOUT_MANAGER, "onItemsUpdated")
        super.onItemsUpdated(recyclerView, positionStart, itemCount)
    }

    override fun onItemsUpdated(
        recyclerView: RecyclerView,
        positionStart: Int,
        itemCount: Int,
        payload: Any?
    ) {
        Log.d(TAG_LAYOUT_MANAGER, "onItemsUpdated")
        super.onItemsUpdated(recyclerView, positionStart, itemCount, payload)
    }

//    override fun scrapOrRecycleView(recycler: RecyclerView.Recycler?, index: Int, view: View?) {
//        super.scrapOrRecycleView(recycler, index, view)
//    }

    override fun getDecoratedBottom(child: View): Int {
        Log.d(TAG_LAYOUT_MANAGER, "getDecoratedBottom")
        return super.getDecoratedBottom(child)
    }

    override fun offsetChildrenVertical(dy: Int) {
        Log.d(TAG_LAYOUT_MANAGER, "offsetChildrenVertical")
        super.offsetChildrenVertical(dy)
    }

    override fun getTopDecorationHeight(child: View): Int {
        Log.d(TAG_LAYOUT_MANAGER, "getTopDecorationHeight")
        return super.getTopDecorationHeight(child)
    }

    override fun setMeasuredDimension(childrenBounds: Rect?, wSpec: Int, hSpec: Int) {
        Log.d(TAG_LAYOUT_MANAGER, "setMeasuredDimension")
        super.setMeasuredDimension(childrenBounds, wSpec, hSpec)
    }

    override fun setMeasuredDimension(widthSize: Int, heightSize: Int) {
        Log.d(TAG_LAYOUT_MANAGER, "setMeasuredDimension")
        super.setMeasuredDimension(widthSize, heightSize)
    }

    override fun getItemViewType(view: View): Int {
        Log.d(TAG_LAYOUT_MANAGER, "getItemViewType")
        return super.getItemViewType(view)
    }

//    override fun onSmoothScrollerStopped(smoothScroller: RecyclerView.SmoothScroller?) {
//        super.onSmoothScrollerStopped(smoothScroller)
//    }

    override fun getBottomDecorationHeight(child: View): Int {
        Log.d(TAG_LAYOUT_MANAGER, "getBottomDecorationHeight")
        return super.getBottomDecorationHeight(child)
    }

    override fun onScrollStateChanged(state: Int) {
        Log.d(TAG_LAYOUT_MANAGER, "onScrollStateChanged")
        super.onScrollStateChanged(state)
    }

    override fun onAdapterChanged(
        oldAdapter: RecyclerView.Adapter<*>?,
        newAdapter: RecyclerView.Adapter<*>?
    ) {
        Log.d(TAG_LAYOUT_MANAGER, "onAdapterChanged")
        super.onAdapterChanged(oldAdapter, newAdapter)
    }

    override fun detachAndScrapView(child: View, recycler: RecyclerView.Recycler) {
        Log.d(TAG_LAYOUT_MANAGER, "detachAndScrapView")
        super.detachAndScrapView(child, recycler)
    }

    override fun layoutDecoratedWithMargins(
        child: View,
        left: Int,
        top: Int,
        right: Int,
        bottom: Int
    ) {
        Log.d(TAG_LAYOUT_MANAGER, "layoutDecoratedWithMargins")
        super.layoutDecoratedWithMargins(child, left, top, right, bottom)
    }

    override fun getRowCountForAccessibility(
        recycler: RecyclerView.Recycler,
        state: RecyclerView.State
    ): Int {
        Log.d(TAG_LAYOUT_MANAGER, "getRowCountForAccessibility")
        return super.getRowCountForAccessibility(recycler, state)
    }

    override fun onItemsRemoved(recyclerView: RecyclerView, positionStart: Int, itemCount: Int) {
        Log.d(TAG_LAYOUT_MANAGER, "onItemsRemoved")
        super.onItemsRemoved(recyclerView, positionStart, itemCount)
    }

    override fun getPaddingStart(): Int {
        Log.d(TAG_LAYOUT_MANAGER, "getPaddingStart")
        return super.getPaddingStart()
    }

//    override fun setRecyclerView(recyclerView: RecyclerView?) {
//        super.setRecyclerView(recyclerView)
//    }

    override fun detachView(child: View) {
        Log.d(TAG_LAYOUT_MANAGER, "detachView")
        super.detachView(child)
    }

    override fun setAutoMeasureEnabled(enabled: Boolean) {
        Log.d(TAG_LAYOUT_MANAGER, "setAutoMeasureEnabled")
        super.setAutoMeasureEnabled(enabled)
    }

    override fun isSmoothScrolling(): Boolean {
        Log.d(TAG_LAYOUT_MANAGER, "isSmoothScrolling")
        return super.isSmoothScrolling()
    }

    override fun removeAndRecycleView(child: View, recycler: RecyclerView.Recycler) {
        Log.d(TAG_LAYOUT_MANAGER, "removeAndRecycleView")
        super.removeAndRecycleView(child, recycler)
    }

    override fun getDecoratedLeft(child: View): Int {
        Log.d(TAG_LAYOUT_MANAGER, "getDecoratedLeft")
        return super.getDecoratedLeft(child)
    }

    override fun getDecoratedBoundsWithMargins(view: View, outBounds: Rect) {
        Log.d(TAG_LAYOUT_MANAGER, "getDecoratedBoundsWithMargins")
        super.getDecoratedBoundsWithMargins(view, outBounds)
    }

    override fun getPaddingEnd(): Int {
        Log.d(TAG_LAYOUT_MANAGER, "getPaddingEnd")
        return super.getPaddingEnd()
    }

    override fun isAttachedToWindow(): Boolean {
        Log.d(TAG_LAYOUT_MANAGER, "isAttachedToWindow")
        return super.isAttachedToWindow()
    }

    override fun checkLayoutParams(lp: RecyclerView.LayoutParams?): Boolean {
        Log.d(TAG_LAYOUT_MANAGER, "checkLayoutParams")
        return super.checkLayoutParams(lp)
    }

    override fun isViewPartiallyVisible(
        child: View,
        completelyVisible: Boolean,
        acceptEndPointInclusion: Boolean
    ): Boolean {
        Log.d(TAG_LAYOUT_MANAGER, "isViewPartiallyVisible")
        return super.isViewPartiallyVisible(child, completelyVisible, acceptEndPointInclusion)
    }

//    override fun hasFlexibleChildInBothOrientations(): Boolean {
//        return super.hasFlexibleChildInBothOrientations()
//    }

    override fun getFocusedChild(): View? {
        Log.d(TAG_LAYOUT_MANAGER, "getFocusedChild")
        return super.getFocusedChild()
    }

    override fun isFocused(): Boolean {
        Log.d(TAG_LAYOUT_MANAGER, "isFocused")
        return super.isFocused()
    }

    override fun postOnAnimation(action: Runnable?) {
        Log.d(TAG_LAYOUT_MANAGER, "postOnAnimation")
        super.postOnAnimation(action)
    }

    override fun requestSimpleAnimationsInNextLayout() {
        Log.d(TAG_LAYOUT_MANAGER, "requestSimpleAnimationsInNextLayout")
        super.requestSimpleAnimationsInNextLayout()
    }

    override fun getPaddingRight(): Int {
        Log.d(TAG_LAYOUT_MANAGER, "getPaddingRight")
        return super.getPaddingRight()
    }

    override fun onMeasure(
        recycler: RecyclerView.Recycler,
        state: RecyclerView.State,
        widthSpec: Int,
        heightSpec: Int
    ) {
        Log.d(TAG_LAYOUT_MANAGER, "onMeasure")
        super.onMeasure(recycler, state, widthSpec, heightSpec)
    }

    override fun moveView(fromIndex: Int, toIndex: Int) {
        Log.d(TAG_LAYOUT_MANAGER, "moveView")
        super.moveView(fromIndex, toIndex)
    }

    override fun onRequestChildFocus(parent: RecyclerView, child: View, focused: View?): Boolean {
        Log.d(TAG_LAYOUT_MANAGER, "onRequestChildFocus")
        return super.onRequestChildFocus(parent, child, focused)
    }

    override fun onRequestChildFocus(
        parent: RecyclerView,
        state: RecyclerView.State,
        child: View,
        focused: View?
    ): Boolean {
        Log.d(TAG_LAYOUT_MANAGER, "onRequestChildFocus")
        return super.onRequestChildFocus(parent, state, child, focused)
    }

    override fun isMeasurementCacheEnabled(): Boolean {
        Log.d(TAG_LAYOUT_MANAGER, "isMeasurementCacheEnabled")
        return super.isMeasurementCacheEnabled()
    }

    override fun getDecoratedMeasuredWidth(child: View): Int {
        Log.d(TAG_LAYOUT_MANAGER, "getDecoratedMeasuredWidth")
        return super.getDecoratedMeasuredWidth(child)
    }

//    override fun shouldReMeasureChild(
//        child: View?,
//        widthSpec: Int,
//        heightSpec: Int,
//        lp: RecyclerView.LayoutParams?
//    ): Boolean {
//        return super.shouldReMeasureChild(child, widthSpec, heightSpec, lp)
//    }

    override fun getPaddingTop(): Int {
        Log.d(TAG_LAYOUT_MANAGER, "getPaddingTop")
        return super.getPaddingTop()
    }

//    override fun dispatchAttachedToWindow(view: RecyclerView?) {
//        super.dispatchAttachedToWindow(view)
//    }

    override fun findContainingItemView(view: View): View? {
        Log.d(TAG_LAYOUT_MANAGER, "findContainingItemView")
        return super.findContainingItemView(view)
    }

    override fun getRightDecorationWidth(child: View): Int {
        Log.d(TAG_LAYOUT_MANAGER, "getRightDecorationWidth")
        return super.getRightDecorationWidth(child)
    }

    override fun startSmoothScroll(smoothScroller: RecyclerView.SmoothScroller?) {
        Log.d(TAG_LAYOUT_MANAGER, "startSmoothScroll")
        super.startSmoothScroll(smoothScroller)
    }

    override fun getSelectionModeForAccessibility(
        recycler: RecyclerView.Recycler,
        state: RecyclerView.State
    ): Int {
        Log.d(TAG_LAYOUT_MANAGER, "getSelectionModeForAccessibility")
        return super.getSelectionModeForAccessibility(recycler, state)
    }

    override fun requestChildRectangleOnScreen(
        parent: RecyclerView,
        child: View,
        rect: Rect,
        immediate: Boolean
    ): Boolean {
        Log.d(TAG_LAYOUT_MANAGER, "requestChildRectangleOnScreen")
        return super.requestChildRectangleOnScreen(parent, child, rect, immediate)
    }

    override fun requestChildRectangleOnScreen(
        parent: RecyclerView,
        child: View,
        rect: Rect,
        immediate: Boolean,
        focusedChildVisible: Boolean
    ): Boolean {
        Log.d(TAG_LAYOUT_MANAGER, "requestChildRectangleOnScreen")
        return super.requestChildRectangleOnScreen(
            parent,
            child,
            rect,
            immediate,
            focusedChildVisible
        )
    }

    override fun onDetachedFromWindow(view: RecyclerView?) {
        Log.d(TAG_LAYOUT_MANAGER, "onDetachedFromWindow")
        super.onDetachedFromWindow(view)
    }

    override fun setMeasurementCacheEnabled(measurementCacheEnabled: Boolean) {
        Log.d(TAG_LAYOUT_MANAGER, "setMeasurementCacheEnabled")
        super.setMeasurementCacheEnabled(measurementCacheEnabled)
    }

//    override fun setMeasureSpecs(wSpec: Int, hSpec: Int) {
//        super.setMeasureSpecs(wSpec, hSpec)
//    }

    override fun detachViewAt(index: Int) {
        Log.d(TAG_LAYOUT_MANAGER, "detachViewAt")
        super.detachViewAt(index)
    }

//    override fun getChildRectangleOnScreenScrollAmount(
//        parent: RecyclerView?,
//        child: View?,
//        rect: Rect?,
//        immediate: Boolean
//    ): IntArray {
//        return super.getChildRectangleOnScreenScrollAmount(parent, child, rect, immediate)
//    }

//    override fun isFocusedChildVisibleAfterScrolling(
//        parent: RecyclerView?,
//        dx: Int,
//        dy: Int
//    ): Boolean {
//        return super.isFocusedChildVisibleAfterScrolling(parent, dx, dy)
//    }

//    override fun stopSmoothScroller() {
//        super.stopSmoothScroller()
//    }

    override fun addDisappearingView(child: View?) {
        Log.d(TAG_LAYOUT_MANAGER, "addDisappearingView")
        super.addDisappearingView(child)
    }

    override fun addDisappearingView(child: View?, index: Int) {
        Log.d(TAG_LAYOUT_MANAGER, "addDisappearingView")
        super.addDisappearingView(child, index)
    }

    override fun removeAndRecycleAllViews(recycler: RecyclerView.Recycler) {
        Log.d(TAG_LAYOUT_MANAGER, "removeAndRecycleAllViews")
        super.removeAndRecycleAllViews(recycler)
    }

    override fun getHeightMode(): Int {
        Log.d(TAG_LAYOUT_MANAGER, "getHeightMode")
        return super.getHeightMode()
    }

    override fun getWidth(): Int {
        Log.d(TAG_LAYOUT_MANAGER, "getWidth")
        return super.getWidth()
    }

    override fun isLayoutHierarchical(
        recycler: RecyclerView.Recycler,
        state: RecyclerView.State
    ): Boolean {
        Log.d(TAG_LAYOUT_MANAGER, "isLayoutHierarchical")
        return super.isLayoutHierarchical(recycler, state)
    }


    // linear Layout Manager




    override fun onInitializeAccessibilityEvent(event: AccessibilityEvent) {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "onInitializeAccessibilityEvent")
        super.onInitializeAccessibilityEvent(event)
    }

    override fun onDetachedFromWindow(view: RecyclerView?, recycler: RecyclerView.Recycler?) {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "onDetachedFromWindow")
        super.onDetachedFromWindow(view, recycler)
    }

    override fun computeVerticalScrollRange(state: RecyclerView.State): Int {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "computeVerticalScrollRange")
        return super.computeVerticalScrollRange(state)
    }

//    override fun shouldMeasureTwice(): Boolean {
//        return super.shouldMeasureTwice()
//    }

    override fun collectInitialPrefetchPositions(
        adapterItemCount: Int,
        layoutPrefetchRegistry: LayoutPrefetchRegistry?
    ) {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "collectInitialPrefetchPositions")
        super.collectInitialPrefetchPositions(adapterItemCount, layoutPrefetchRegistry)
    }

    override fun computeHorizontalScrollRange(state: RecyclerView.State): Int {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "computeHorizontalScrollRange")
        return super.computeHorizontalScrollRange(state)
    }

    override fun isSmoothScrollbarEnabled(): Boolean {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "isSmoothScrollbarEnabled")
        return super.isSmoothScrollbarEnabled()
    }

    override fun scrollHorizontallyBy(
        dx: Int,
        recycler: RecyclerView.Recycler?,
        state: RecyclerView.State?
    ): Int {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "scrollHorizontallyBy ")
        return super.scrollHorizontallyBy(dx, recycler, state)
    }

    override fun isLayoutRTL(): Boolean {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "isLayoutRTL")
        return super.isLayoutRTL()
    }

    override fun scrollVerticallyBy(
        dy: Int,
        recycler: RecyclerView.Recycler?,
        state: RecyclerView.State?
    ): Int {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "scrollVerticallyBy ")
        return super.scrollVerticallyBy(dy, recycler, state)
    }

    override fun getStackFromEnd(): Boolean {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "getStackFromEnd")
        return super.getStackFromEnd()
    }

    override fun scrollToPosition(position: Int) {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "scrollToPosition")
        super.scrollToPosition(position)
    }

    override fun setStackFromEnd(stackFromEnd: Boolean) {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "setStackFromEnd")
        super.setStackFromEnd(stackFromEnd)
    }

    override fun onFocusSearchFailed(
        focused: View,
        focusDirection: Int,
        recycler: RecyclerView.Recycler,
        state: RecyclerView.State
    ): View? {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "onFocusSearchFailed")
        return super.onFocusSearchFailed(focused, focusDirection, recycler, state)
    }

    override fun getRecycleChildrenOnDetach(): Boolean {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "getRecycleChildrenOnDetach")
        return super.getRecycleChildrenOnDetach()
    }

    override fun smoothScrollToPosition(
        recyclerView: RecyclerView?,
        state: RecyclerView.State?,
        position: Int
    ) {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "smoothScrollToPosition")
        super.smoothScrollToPosition(recyclerView, state, position)
    }

//    override fun layoutChunk(
//        recycler: RecyclerView.Recycler?,
//        state: RecyclerView.State?,
//        layoutState: LayoutState?,
//        result: LayoutChunkResult?
//    ) {
//        super.layoutChunk(recycler, state, layoutState, result)
//    }

    override fun supportsPredictiveItemAnimations(): Boolean {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "supportsPredictiveItemAnimations")
        return super.supportsPredictiveItemAnimations()
    }

    override fun getExtraLayoutSpace(state: RecyclerView.State?): Int {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "getExtraLayoutSpace")
        return super.getExtraLayoutSpace(state)
    }

//    override fun scrollBy(
//        dy: Int,
//        recycler: RecyclerView.Recycler?,
//        state: RecyclerView.State?
//    ): Int {
//        return super.scrollBy(dy, recycler, state)
//    }

    override fun findLastCompletelyVisibleItemPosition(): Int {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "findLastCompletelyVisibleItemPosition")
        return super.findLastCompletelyVisibleItemPosition()
    }

//    override fun findOneVisibleChild(
//        fromIndex: Int,
//        toIndex: Int,
//        completelyVisible: Boolean,
//        acceptPartiallyVisible: Boolean
//    ): View {
//        return super.findOneVisibleChild(
//            fromIndex,
//            toIndex,
//            completelyVisible,
//            acceptPartiallyVisible
//        )
//    }

    override fun getInitialPrefetchItemCount(): Int {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "getInitialPrefetchItemCount")
        return super.getInitialPrefetchItemCount()
    }

//    override fun validateChildOrder() {
//        super.validateChildOrder()
//    }

    override fun setOrientation(orientation: Int) {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "setOrientation")
        super.setOrientation(orientation)
    }

    override fun setSmoothScrollbarEnabled(enabled: Boolean) {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "setSmoothScrollbarEnabled")
        super.setSmoothScrollbarEnabled(enabled)
    }

    override fun getReverseLayout(): Boolean {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "getReverseLayout")
        return super.getReverseLayout()
    }

    override fun setInitialPrefetchItemCount(itemCount: Int) {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "setInitialPrefetchItemCount")
        super.setInitialPrefetchItemCount(itemCount)
    }

    override fun setReverseLayout(reverseLayout: Boolean) {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "setReverseLayout")
        super.setReverseLayout(reverseLayout)
    }

//    override fun convertFocusDirectionToLayoutDirection(focusDirection: Int): Int {
//        return super.convertFocusDirectionToLayoutDirection(focusDirection)
//    }

    override fun findViewByPosition(position: Int): View? {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "findViewByPosition")
        return super.findViewByPosition(position)
    }

    override fun computeVerticalScrollExtent(state: RecyclerView.State): Int {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "computeVerticalScrollExtent")
        return super.computeVerticalScrollExtent(state)
    }

    override fun computeHorizontalScrollExtent(state: RecyclerView.State): Int {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "computeHorizontalScrollExtent")
        return super.computeHorizontalScrollExtent(state)
    }

//    override fun collectPrefetchPositionsForLayoutState(
//        state: RecyclerView.State?,
//        layoutState: LayoutState?,
//        layoutPrefetchRegistry: LayoutPrefetchRegistry?
//    ) {
//        super.collectPrefetchPositionsForLayoutState(state, layoutState, layoutPrefetchRegistry)
//    }
//
//    override fun fill(
//        recycler: RecyclerView.Recycler?,
//        layoutState: LayoutState?,
//        state: RecyclerView.State?,
//        stopOnFocusable: Boolean
//    ): Int {
//        return super.fill(recycler, layoutState, state, stopOnFocusable)
//    }

    override fun scrollToPositionWithOffset(position: Int, offset: Int) {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "scrollToPositionWithOffset")
        super.scrollToPositionWithOffset(position, offset)
    }

    override fun computeVerticalScrollOffset(state: RecyclerView.State): Int {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "computeVerticalScrollOffset")
        return super.computeVerticalScrollOffset(state)
    }

    override fun findLastVisibleItemPosition(): Int {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "findLastVisibleItemPosition")
        return super.findLastVisibleItemPosition()
    }

    override fun collectAdjacentPrefetchPositions(
        dx: Int,
        dy: Int,
        state: RecyclerView.State?,
        layoutPrefetchRegistry: LayoutPrefetchRegistry?
    ) {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "collectAdjacentPrefetchPositions")
        super.collectAdjacentPrefetchPositions(dx, dy, state, layoutPrefetchRegistry)
    }

    override fun findFirstCompletelyVisibleItemPosition(): Int {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "findFirstCompletelyVisibleItemPosition")
        return super.findFirstCompletelyVisibleItemPosition()
    }

    override fun computeHorizontalScrollOffset(state: RecyclerView.State): Int {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "computeHorizontalScrollOffset")
        return super.computeHorizontalScrollOffset(state)
    }

//    override fun createLayoutState(): LayoutState {
//        return super.createLayoutState()
//    }

    override fun isAutoMeasureEnabled(): Boolean {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "isAutoMeasureEnabled")
        return super.isAutoMeasureEnabled()
    }

    override fun onLayoutCompleted(state: RecyclerView.State?) {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "onLayoutCompleted")
        super.onLayoutCompleted(state)
    }

    override fun findFirstVisibleItemPosition(): Int {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "findFirstVisibleItemPosition")
        return super.findFirstVisibleItemPosition()
    }

    override fun canScrollVertically(): Boolean {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "canScrollVertically")
        return super.canScrollVertically()
    }

//    override fun resolveIsInfinite(): Boolean {
//        return super.resolveIsInfinite()
//    }

    override fun onSaveInstanceState(): Parcelable? {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "onSaveInstanceState")
        return super.onSaveInstanceState()
    }

//    override fun onAnchorReady(
//        recycler: RecyclerView.Recycler?,
//        state: RecyclerView.State?,
//        anchorInfo: AnchorInfo?,
//        firstLayoutItemDirection: Int
//    ) {
//        super.onAnchorReady(recycler, state, anchorInfo, firstLayoutItemDirection)
//    }

    override fun assertNotInLayoutOrScroll(message: String?) {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "assertNotInLayoutOrScroll")
        super.assertNotInLayoutOrScroll(message)
    }

//    override fun prepareForDrop(view: View, target: View, x: Int, y: Int) {
//        super.prepareForDrop(view, target, x, y)
//    }

    override fun setRecycleChildrenOnDetach(recycleChildrenOnDetach: Boolean) {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "setRecycleChildrenOnDetach")
        super.setRecycleChildrenOnDetach(recycleChildrenOnDetach)
    }

//    override fun findReferenceChild(
//        recycler: RecyclerView.Recycler?,
//        state: RecyclerView.State?,
//        start: Int,
//        end: Int,
//        itemCount: Int
//    ): View {
//        return super.findReferenceChild(recycler, state, start, end, itemCount)
//    }

//    override fun ensureLayoutState() {
//        super.ensureLayoutState()
//    }

    override fun getOrientation(): Int {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "getOrientation")
        return super.getOrientation()
    }

    override fun computeScrollVectorForPosition(targetPosition: Int): PointF? {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "computeScrollVectorForPosition")
        return super.computeScrollVectorForPosition(targetPosition)
    }

//    override fun findOnePartiallyOrCompletelyInvisibleChild(fromIndex: Int, toIndex: Int): View {
//        return super.findOnePartiallyOrCompletelyInvisibleChild(fromIndex, toIndex)
//    }

    override fun generateDefaultLayoutParams(): RecyclerView.LayoutParams {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "generateDefaultLayoutParams")
        return super.generateDefaultLayoutParams()
    }

    override fun canScrollHorizontally(): Boolean {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "canScrollHorizontally")
        return super.canScrollHorizontally()
    }

    override fun onRestoreInstanceState(state: Parcelable?) {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "onRestoreInstanceState")
        super.onRestoreInstanceState(state)
    }

    override fun onLayoutChildren(recycler: RecyclerView.Recycler?, state: RecyclerView.State?) {
        Log.d(TAG_LINEAR_LAYOUT_MANAGER, "onLayoutChildren")
        super.onLayoutChildren(recycler, state)
    }
}