package uz.abbosbek.fragmentdialogs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.abbosbek.fragmentdialogs.databinding.ActivityMainBinding
import uz.abbosbek.fragmentdialogs.utils.MyData

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        MyData.addTemple()
    }
}