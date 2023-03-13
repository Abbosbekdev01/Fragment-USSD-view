package uz.abbosbek.fragmentdialogs.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.abbosbek.fragmentdialogs.R
import uz.abbosbek.fragmentdialogs.databinding.FragmentListBinding
import uz.abbosbek.fragmentdialogs.models.User


class ListFragment : Fragment() {
    private val binding by lazy { FragmentListBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val user = arguments?.getSerializable("key") as User
        binding.tvItemName.text = user.services
        binding.tvItemKod.text = user.codes
        binding.tvInformation.text = user.about

        return binding.root

    }
}