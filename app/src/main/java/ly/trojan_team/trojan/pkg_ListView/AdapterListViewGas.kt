package ly.trojan_team.trojan.pkg_ListView

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import ly.trojan_team.trojan.R
import java.text.FieldPosition

class AdapterListViewGas
    (
    private val context: Activity,
    private val arrayList : ArrayList<Gas_distributor_Data>
    ) : ArrayAdapter<Gas_distributor_Data>(context, R.layout.list_item,arrayList) {

        override  fun getView(position: Int , convertView : View? , parent : ViewGroup):View{

            val inflater : LayoutInflater = LayoutInflater.from(context)
            val view : View = inflater.inflate(R.layout.list_item,null);

            val imagView : ImageView = view.findViewById(R.id.profile_pic)
            val gasName : TextView = view.findViewById(R.id.GasName)
            val statOfGas : TextView = view.findViewById(R.id.stateOfGas)
            val OpenTime : TextView = view.findViewById(R.id.openTime)

            imagView.setImageResource(arrayList[position].imageId)
            gasName.text = (arrayList[position].name)
            statOfGas.text = (arrayList[position].stateOfGas)
            OpenTime.text = (arrayList[position].openTime)


            return view
        }

}