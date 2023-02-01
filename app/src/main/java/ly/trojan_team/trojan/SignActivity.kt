package ly.trojan_team.trojan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import ly.trojan_team.trojan.databinding.ActivityMainBinding
import ly.trojan_team.trojan.loginpage.data.entity.UserEntity
import ly.trojan_team.trojan.loginpage.data.viewmodel.LoginViewModel
import ly.trojan_team.trojan.loginpage.recurce.Recurce

class SignActivity : AppCompatActivity() {

    val vmLogin: LoginViewModel by viewModels()
    private lateinit var txtUserName: EditText
    private lateinit var txtPassword: EditText
    private lateinit var txtlogin: TextView
    private lateinit var btnConfirmbtn: Button
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign)
        var observer = Observer<Recurce<UserEntity>>{
            when(it){
                is Recurce.Succusfuly<UserEntity>->{
                    Toast.makeText(applicationContext,"Successful",Toast.LENGTH_SHORT).show()
                }
                is Recurce.Error<UserEntity>->{

                }
                else -> {
                }
            }
        }
        vmLogin.state.observe(this,observer)

        txtPassword =findViewById(R.id.passwordtxt)
        txtUserName=findViewById(R.id.usernamtxt)
        btnConfirmbtn=findViewById(R.id.confirmbtn)
        txtlogin = findViewById(R.id.loginbtn)

        btnConfirmbtn.setOnClickListener {
            vmLogin.signup(
                UserEntity(
                    username =txtUserName.text.toString() ,
                    password = txtPassword.text.toString()
                )
            )
        }

        txtlogin.setOnClickListener {
            val intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
        }




    }

}