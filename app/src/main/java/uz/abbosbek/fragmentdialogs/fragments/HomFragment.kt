package uz.abbosbek.fragmentdialogs.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.core.os.bundleOf
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import uz.abbosbek.fragmentdialogs.R
import uz.abbosbek.fragmentdialogs.databinding.FragmentHomBinding
import uz.abbosbek.fragmentdialogs.models.User

class HomFragment : Fragment() {

    private val binding by lazy { FragmentHomBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding.apply {
            trafik.startAnimation(AnimationUtils.loadAnimation(context, R.anim.card_anim_1))
            internet.startAnimation(AnimationUtils.loadAnimation(context, R.anim.card_anim_2))
            sms.startAnimation(AnimationUtils.loadAnimation(context, R.anim.card_anim_3))
            daqiqa.startAnimation(AnimationUtils.loadAnimation(context, R.anim.card_anim_4))
            xizmatlar.startAnimation(AnimationUtils.loadAnimation(context, R.anim.card_anim_1))
            yangiliklar.startAnimation(AnimationUtils.loadAnimation(context, R.anim.card_anim_2))

            val navOption = NavOptions.Builder()
            navOption.setEnterAnim(R.anim.ochilishi_1)
            navOption.setEnterAnim(R.anim.ochilishi_2)
            navOption.setEnterAnim(R.anim.yopilishi_1)
            navOption.setEnterAnim(R.anim.yopilishi_2)

        }

        binding.apply {
            trafik.setOnClickListener {
                finNavControl(0)
            }
            internet.setOnClickListener {
                finNavControl(1)
            }
            sms.setOnClickListener {
                finNavControl(2)
            }
            daqiqa.setOnClickListener {
                finNavControl(3)
            }
            xizmatlar.setOnClickListener {
                finNavControl(4)
            }
            yangiliklar.setOnClickListener {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://mobi.uz/uz/")))
            }
        }
        return binding.root
    }


    fun finNavControl(codes: Int) {
        findNavController().navigate(R.id.profileFragment, bundleOf("key" to codes))
    }
}