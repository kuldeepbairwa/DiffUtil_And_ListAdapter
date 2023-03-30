package `in`.kb.diffutilandlistadapter

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import `in`.kb.diffutilandlistadapter.databinding.RowItemBinding

class ProgrammingAdapter : ListAdapter<ProgrammingItem, ProgrammingAdapter.ProgrammingViewHolder>(DiffUtilCallback()) {

    class ProgrammingViewHolder(private val binding: RowItemBinding) : ViewHolder(binding.root) {

        fun bind(item: ProgrammingItem) {
            binding.name.text = item.name
            binding.initial.text = item.initial
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProgrammingViewHolder {
        val binding = RowItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProgrammingViewHolder(binding)
    }
    override fun onBindViewHolder(holder: ProgrammingViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    class DiffUtilCallback : DiffUtil.ItemCallback<ProgrammingItem>() {
        override fun areItemsTheSame(oldItem: ProgrammingItem, newItem: ProgrammingItem): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: ProgrammingItem,
            newItem: ProgrammingItem
        ): Boolean {
            return oldItem == newItem
        }
    }
}