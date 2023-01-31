package ly.trojan_team.trojan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ly.trojan_team.trojan.databinding.ActivityMainBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
    }
}