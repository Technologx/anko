@file:JvmName("Sdk23LayoutsKt")
package org.jetbrains.anko


import android.content.Context
import android.util.AttributeSet
import android.view.ViewGroup
import android.widget.FrameLayout
import android.appwidget.AppWidgetHostView
import android.view.View
import android.webkit.WebView
import android.widget.AbsoluteLayout
import android.widget.ActionMenuView
import android.widget.Gallery
import android.widget.GridLayout
import android.widget.GridView
import android.widget.AbsListView
import android.widget.HorizontalScrollView
import android.widget.ImageSwitcher
import android.widget.LinearLayout
import android.widget.RadioGroup
import android.widget.RelativeLayout
import android.widget.ScrollView
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextSwitcher
import android.widget.Toolbar
import android.app.ActionBar
import android.widget.ViewAnimator
import android.widget.ViewSwitcher

private val defaultInit: Any.() -> Unit = {}

open class _AppWidgetHostView(ctx: Context): AppWidgetHostView(ctx) {
    fun <T: View> T.lparams(
            c: Context?,
            attrs: AttributeSet?,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(c!!, attrs!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(width, height)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            gravity: Int,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(width, height, gravity)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: ViewGroup.LayoutParams?,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: ViewGroup.MarginLayoutParams?,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: FrameLayout.LayoutParams?,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

}

open class _WebView(ctx: Context): WebView(ctx) {
    fun <T: View> T.lparams(
            c: Context?,
            attrs: AttributeSet?,
            init: ViewGroup.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = ViewGroup.LayoutParams(c!!, attrs!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            init: ViewGroup.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = ViewGroup.LayoutParams(width, height)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: ViewGroup.LayoutParams?,
            init: ViewGroup.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = ViewGroup.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

}

open class _AbsoluteLayout(ctx: Context): AbsoluteLayout(ctx) {
    fun <T: View> T.lparams(
            width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            x: Int,
            y: Int,
            init: AbsoluteLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = AbsoluteLayout.LayoutParams(width, height, x, y)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            c: Context?,
            attrs: AttributeSet?,
            init: AbsoluteLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = AbsoluteLayout.LayoutParams(c!!, attrs!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: ViewGroup.LayoutParams?,
            init: AbsoluteLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = AbsoluteLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

}

open class _ActionMenuView(ctx: Context): ActionMenuView(ctx) {
    fun <T: View> T.lparams(
            c: Context?,
            attrs: AttributeSet?,
            init: ActionMenuView.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = ActionMenuView.LayoutParams(c!!, attrs!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            other: ViewGroup.LayoutParams?,
            init: ActionMenuView.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = ActionMenuView.LayoutParams(other!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            other: ActionMenuView.LayoutParams?,
            init: ActionMenuView.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = ActionMenuView.LayoutParams(other!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            init: ActionMenuView.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = ActionMenuView.LayoutParams(width, height)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

}

open class _FrameLayout(ctx: Context): FrameLayout(ctx) {
    fun <T: View> T.lparams(
            c: Context?,
            attrs: AttributeSet?,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(c!!, attrs!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(width, height)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            gravity: Int,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(width, height, gravity)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: ViewGroup.LayoutParams?,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: ViewGroup.MarginLayoutParams?,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: FrameLayout.LayoutParams?,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

}

open class _Gallery(ctx: Context): Gallery(ctx) {
    fun <T: View> T.lparams(
            c: Context?,
            attrs: AttributeSet?,
            init: Gallery.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = Gallery.LayoutParams(c!!, attrs!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            init: Gallery.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = Gallery.LayoutParams(width, height)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: ViewGroup.LayoutParams?,
            init: Gallery.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = Gallery.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

}

open class _GridLayout(ctx: Context): GridLayout(ctx) {
    fun <T: View> T.lparams(
            rowSpec: GridLayout.Spec?,
            columnSpec: GridLayout.Spec?,
            init: GridLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = GridLayout.LayoutParams(rowSpec!!, columnSpec!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            init: GridLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = GridLayout.LayoutParams()
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            params: ViewGroup.LayoutParams?,
            init: GridLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = GridLayout.LayoutParams(params!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            params: ViewGroup.MarginLayoutParams?,
            init: GridLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = GridLayout.LayoutParams(params!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: GridLayout.LayoutParams?,
            init: GridLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = GridLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            context: Context?,
            attrs: AttributeSet?,
            init: GridLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = GridLayout.LayoutParams(context!!, attrs!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

}

open class _GridView(ctx: Context): GridView(ctx) {
    fun <T: View> T.lparams(
            c: Context?,
            attrs: AttributeSet?,
            init: AbsListView.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = AbsListView.LayoutParams(c!!, attrs!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            init: AbsListView.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = AbsListView.LayoutParams(width, height)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            viewType: Int,
            init: AbsListView.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = AbsListView.LayoutParams(width, height, viewType)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: ViewGroup.LayoutParams?,
            init: AbsListView.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = AbsListView.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

}

open class _HorizontalScrollView(ctx: Context): HorizontalScrollView(ctx) {
    fun <T: View> T.lparams(
            c: Context?,
            attrs: AttributeSet?,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(c!!, attrs!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(width, height)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            gravity: Int,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(width, height, gravity)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: ViewGroup.LayoutParams?,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: ViewGroup.MarginLayoutParams?,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: FrameLayout.LayoutParams?,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

}

open class _ImageSwitcher(ctx: Context): ImageSwitcher(ctx) {
    fun <T: View> T.lparams(
            c: Context?,
            attrs: AttributeSet?,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(c!!, attrs!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(width, height)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            gravity: Int,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(width, height, gravity)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: ViewGroup.LayoutParams?,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: ViewGroup.MarginLayoutParams?,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: FrameLayout.LayoutParams?,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

}

open class _LinearLayout(ctx: Context): LinearLayout(ctx) {
    fun <T: View> T.lparams(
            c: Context?,
            attrs: AttributeSet?,
            init: LinearLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = LinearLayout.LayoutParams(c!!, attrs!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            init: LinearLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = LinearLayout.LayoutParams(width, height)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            weight: Float,
            init: LinearLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = LinearLayout.LayoutParams(width, height, weight)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            p: ViewGroup.LayoutParams?,
            init: LinearLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = LinearLayout.LayoutParams(p!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: ViewGroup.MarginLayoutParams?,
            init: LinearLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = LinearLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: LinearLayout.LayoutParams?,
            init: LinearLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = LinearLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

}

open class _RadioGroup(ctx: Context): RadioGroup(ctx) {
    fun <T: View> T.lparams(
            c: Context?,
            attrs: AttributeSet?,
            init: RadioGroup.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = RadioGroup.LayoutParams(c!!, attrs!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            init: RadioGroup.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = RadioGroup.LayoutParams(width, height)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            initWeight: Float,
            init: RadioGroup.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = RadioGroup.LayoutParams(width, height, initWeight)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            p: ViewGroup.LayoutParams?,
            init: RadioGroup.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = RadioGroup.LayoutParams(p!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: ViewGroup.MarginLayoutParams?,
            init: RadioGroup.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = RadioGroup.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

}

open class _RelativeLayout(ctx: Context): RelativeLayout(ctx) {
    fun <T: View> T.lparams(
            c: Context?,
            attrs: AttributeSet?,
            init: RelativeLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = RelativeLayout.LayoutParams(c!!, attrs!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            init: RelativeLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = RelativeLayout.LayoutParams(width, height)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: ViewGroup.LayoutParams?,
            init: RelativeLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = RelativeLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: ViewGroup.MarginLayoutParams?,
            init: RelativeLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = RelativeLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: RelativeLayout.LayoutParams?,
            init: RelativeLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = RelativeLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

}

open class _ScrollView(ctx: Context): ScrollView(ctx) {
    fun <T: View> T.lparams(
            c: Context?,
            attrs: AttributeSet?,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(c!!, attrs!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(width, height)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            gravity: Int,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(width, height, gravity)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: ViewGroup.LayoutParams?,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: ViewGroup.MarginLayoutParams?,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: FrameLayout.LayoutParams?,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

}

open class _TableLayout(ctx: Context): TableLayout(ctx) {
    fun <T: View> T.lparams(
            c: Context?,
            attrs: AttributeSet?,
            init: TableLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = TableLayout.LayoutParams(c!!, attrs!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            init: TableLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = TableLayout.LayoutParams(width, height)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            initWeight: Float,
            init: TableLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = TableLayout.LayoutParams(width, height, initWeight)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            init: TableLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = TableLayout.LayoutParams()
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            p: ViewGroup.LayoutParams?,
            init: TableLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = TableLayout.LayoutParams(p!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: ViewGroup.MarginLayoutParams?,
            init: TableLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = TableLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

}

open class _TableRow(ctx: Context): TableRow(ctx) {
    fun <T: View> T.lparams(
            c: Context?,
            attrs: AttributeSet?,
            init: TableRow.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = TableRow.LayoutParams(c!!, attrs!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            init: TableRow.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = TableRow.LayoutParams(width, height)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            initWeight: Float,
            init: TableRow.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = TableRow.LayoutParams(width, height, initWeight)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            init: TableRow.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = TableRow.LayoutParams()
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            column: Int,
            init: TableRow.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = TableRow.LayoutParams(column)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            p: ViewGroup.LayoutParams?,
            init: TableRow.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = TableRow.LayoutParams(p!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: ViewGroup.MarginLayoutParams?,
            init: TableRow.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = TableRow.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

}

open class _TextSwitcher(ctx: Context): TextSwitcher(ctx) {
    fun <T: View> T.lparams(
            c: Context?,
            attrs: AttributeSet?,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(c!!, attrs!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(width, height)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            gravity: Int,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(width, height, gravity)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: ViewGroup.LayoutParams?,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: ViewGroup.MarginLayoutParams?,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: FrameLayout.LayoutParams?,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

}

open class _Toolbar(ctx: Context): Toolbar(ctx) {
    fun <T: View> T.lparams(
            c: Context?,
            attrs: AttributeSet?,
            init: Toolbar.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = Toolbar.LayoutParams(c!!, attrs!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            init: Toolbar.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = Toolbar.LayoutParams(width, height)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            gravity: Int,
            init: Toolbar.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = Toolbar.LayoutParams(width, height, gravity)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            gravity: Int,
            init: Toolbar.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = Toolbar.LayoutParams(gravity)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: Toolbar.LayoutParams?,
            init: Toolbar.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = Toolbar.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: ActionBar.LayoutParams?,
            init: Toolbar.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = Toolbar.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: ViewGroup.MarginLayoutParams?,
            init: Toolbar.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = Toolbar.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: ViewGroup.LayoutParams?,
            init: Toolbar.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = Toolbar.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

}

open class _ViewAnimator(ctx: Context): ViewAnimator(ctx) {
    fun <T: View> T.lparams(
            c: Context?,
            attrs: AttributeSet?,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(c!!, attrs!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(width, height)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            gravity: Int,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(width, height, gravity)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: ViewGroup.LayoutParams?,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: ViewGroup.MarginLayoutParams?,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: FrameLayout.LayoutParams?,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

}

open class _ViewSwitcher(ctx: Context): ViewSwitcher(ctx) {
    fun <T: View> T.lparams(
            c: Context?,
            attrs: AttributeSet?,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(c!!, attrs!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(width, height)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            gravity: Int,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(width, height, gravity)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: ViewGroup.LayoutParams?,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: ViewGroup.MarginLayoutParams?,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    fun <T: View> T.lparams(
            source: FrameLayout.LayoutParams?,
            init: FrameLayout.LayoutParams.() -> Unit = defaultInit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

}

