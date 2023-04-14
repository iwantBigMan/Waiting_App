package com.example.waiting_app.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.waiting_app.databinding.ActivityWaitingListDataBinding
import com.example.waiting_app.repository.Database


class ListAdapter: ListAdapter<Database, RecyclerView.ViewHolder>(
    diffUtil
) {

    var userList = mutableListOf<Database>()

    // 생성된 뷰 홀더에 값 지정
    class MyViewHolder(val binding: ActivityWaitingListDataBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(currentUser : Database) {
            binding.list = currentUser
        }
    }

    // 어떤 xml 으로 뷰 홀더를 생성할지 지정
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ActivityWaitingListDataBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyViewHolder(binding)
    }

    // 뷰 홀더에 데이터 바인딩
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.bind(userList[position])
    }

    // 리스트 갱신
    override fun submitList(list: List<Database>?) {
        super.submitList(list)
    }
    var staggeredGridLayoutManager =
        StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        // diffUtil 추가
        companion object{
            val diffUtil = object : DiffUtil.ItemCallback<Database>(){
                override fun areItemsTheSame(oldItem: Database, newItem: Database): Boolean {
                    return oldItem.name == newItem.name
                }

                override fun areContentsTheSame(oldItem: Database, newItem: Database): Boolean {
                    return oldItem.hashCode() == newItem.hashCode()
                }
            }
    }
}