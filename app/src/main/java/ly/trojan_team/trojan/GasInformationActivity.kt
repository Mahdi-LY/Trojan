package ly.trojan_team.trojan

import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
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

        var txt = binding.etgasPhone;

        binding.etGasName.text = gasname
        binding.etgasPhone.text = phone
        binding.etGasPostion.text = location
        binding.imageView.setImageResource(imageId)

        txt.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)

            val cm: ClipboardManager =
                this.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            cm.setText(txt.getText())
            Toast.makeText(this, "Copied to clipboard", Toast.LENGTH_SHORT).show()

            intent.data = Uri.parse("tel:${cm.text}")
            startActivity(intent)
        }

    }
}