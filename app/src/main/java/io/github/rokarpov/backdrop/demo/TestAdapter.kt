package io.github.rokarpov.backdrop.demo

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class TestAdapter: RecyclerView.Adapter<TestViewHolder>() {
//    var inflater: LayoutInflater? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_test, parent, false)
        return TestViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 100
    }

    override fun onBindViewHolder(holder: TestViewHolder, position: Int) {
        holder.textView.text = "Item #${position}"
    }
}

class TestViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val textView: TextView

    init {
        textView = view.findViewById(R.id.item_test__text)
    }
}