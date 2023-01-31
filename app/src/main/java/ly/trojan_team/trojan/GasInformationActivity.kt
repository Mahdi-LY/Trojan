package ly.trojan_team.trojan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ly.trojan_team.trojan.databinding.ActivityGasInformationBinding

class GasInformationActivity : AppCompatActivity() {
    private  lateinit var binding : ActivityGasInformationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGasInformationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val gasname = intent.getStringExtra("gasname")
        val phone = intent.getStringExtra("phone")
        val location = intent.getStringExtra("location")
        val imageId = intent.getIntExtra("imageId",R.drawable.a)

        binding.etGasName.text = gasname
        binding.etGasPhone.text = phone
        binding.etGasPostion.text = location
        binding.imageView.setImageResource(imageId)

    }
}