package com.binarybricks.coinbit.utils.ui


import androidx.recyclerview.widget.RecyclerView

abstract class OnVerticalScrollListener : RecyclerView.OnScrollListener() {

    override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
        if (!recyclerView.canScrollVertically(-1)) {
            onScrolledToTop()
        } else if (!recyclerView.canScrollVertically(1)) {
            onScrolledToBottom()
        }
        if (dy < 0) {
            onScrolledUp(dy)
        } else if (dy > 0) {
            onScrolledDown(dy)
        }

        onScrolled(recyclerView.computeVerticalScrollOffset())
    }

    fun onScrolledUp(dy: Int) {
        onScrolledUp()
    }

    fun onScrolledDown(dy: Int) {
        onScrolledDown()
    }

    fun onScrolledUp() {}

    fun onScrolledDown() {}

    fun onScrolledToTop() {}

    fun onScrolledToBottom() {}

    open fun onScrolled(offset: Int) {
    }
}
