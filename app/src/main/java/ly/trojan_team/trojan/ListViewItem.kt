 package ly.trojan_team.trojan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ly.trojan_team.trojan.databinding.ActivityListViewItemBinding
import ly.trojan_team.trojan.pkg_ListView.AdapterListViewGas
import ly.trojan_team.trojan.pkg_ListView.Gas_distributor_Data

 class ListViewItem : AppCompatActivity() {

    private lateinit var binding : ActivityListViewItemBinding
    private lateinit var gasArraylist : ArrayList<Gas_distributor_Data>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListViewItemBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageid = intArrayOf(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
        )

        val gasname = arrayOf(
            "Yedder",
            "Shwahda",
            "Kirzaz",
            "Zarrog",
            "Beyada",
            "Prega"
        )

        val stateofgas = arrayOf(
            "available",
            "Not available",
            "available",
            "available",
            "Not available",
            "Not available"
        )

        val opentime = arrayOf(
            "10:00 am",
            "09:00 am",
            "11:00 am",
            "08:00 am",
            "09:30 am",
            "10:00 am",
        )

        val phone = arrayOf(
            "913434873",
            "914553565",
            "942524533",
            "9234345873",
            "9434988767",
            "928789790",
        )

        val location = arrayOf(
            "yedder",
            "Shwahda",
            "Kerzaz",
            "Rwesatr",
            "yedder",
            "heavy road",
        )

        gasArraylist = ArrayList()

        for (i in gasname.indices){
            val gas = Gas_distributor_Data(gasname[i], stateofgas[i],
            opentime[i],phone[i],location[i],imageid[i])
            gasArraylist.add(gas)
        }

        binding.listview.isClickable = true
        binding.listview.adapter = AdapterListViewGas(this,gasArraylist)

        binding.listview.setOnItemClickListener{ parent , view , position , id ->

            val name = gasname[position]
            val phone = phone[position]
            val location = location[position]
            val imageId = imageid[position]

            val view_gas_information = Intent(this,GasInformationActivity::class.java)
            view_gas_information.putExtra("gasname",name)
            view_gas_information.putExtra("phone",phone)
            view_gas_information.putExtra("location",location)
            view_gas_information.putExtra("imageId",imageId)
            startActivity(view_gas_information)

        }

    }
}