package uz.abbosbek.fragmentdialogs.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import uz.abbosbek.fragmentdialogs.R
import uz.abbosbek.fragmentdialogs.adapter.RvClick
import uz.abbosbek.fragmentdialogs.adapter.UserAdapter
import uz.abbosbek.fragmentdialogs.databinding.FragmentProfileBinding
import uz.abbosbek.fragmentdialogs.models.User
import uz.abbosbek.fragmentdialogs.utils.MyData


class ProfileFragment : Fragment(), RvClick {

    private val binding by lazy { FragmentProfileBinding.inflate(layoutInflater) }
    private lateinit var userAdapter: UserAdapter
    var key = 0


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        key = arguments?.getInt("key", 0)!!

        val navOption = NavOptions.Builder()
        navOption.setEnterAnim(R.anim.ochilishi_1)
        navOption.setEnterAnim(R.anim.ochilishi_2)
        navOption.setEnterAnim(R.anim.yopilishi_1)
        navOption.setEnterAnim(R.anim.yopilishi_2)

        when (key) {
            0 -> showTemp(MyData.listTariffs)
            1 -> showTemp(MyData.listInternet)
            2 -> showTemp(MyData.listSMS)
            3 -> showTemp(MyData.listMinutes)
            4 -> showTemp(MyData.listService)
        }

        return binding.root
    }

    private fun showTemp(list: ArrayList<User>) {
        userAdapter = UserAdapter(list, this)
        binding.myRvList.adapter = userAdapter
    }

    override fun itemClick(user: User) {
        findNavController().navigate(R.id.listFragment, bundleOf("key" to user))
    }
}