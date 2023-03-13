package uz.abbosbek.fragmentdialogs.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import uz.abbosbek.fragmentdialogs.R
import uz.abbosbek.fragmentdialogs.databinding.ItemRvBinding
import uz.abbosbek.fragmentdialogs.fragments.ProfileFragment
import uz.abbosbek.fragmentdialogs.models.User

class UserAdapter(var list: ArrayList<User>, val rvClick: ProfileFragment) : RecyclerView.Adapter<UserAdapter.Vh>() {

    inner class Vh( val itemRvBinding: ItemRvBinding) :
        RecyclerView.ViewHolder(itemRvBinding.root) {
        fun onBind(user: User, position: Int) {
            itemRvBinding.tvService.text = user.services
            itemRvBinding.tvCod.text = user.codes
            itemRvBinding.tvText.text = user.prices

            itemRvBinding.root.setOnClickListener {
                rvClick.itemClick(user)
            }

            val animation = AnimationUtils.loadAnimation(itemRvBinding.root.context, R.anim.my_animation)
            itemRvBinding.root.startAnimation(animation)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int = list.size
}

interface RvClick {
    fun itemClick(user: User) {

    }
}