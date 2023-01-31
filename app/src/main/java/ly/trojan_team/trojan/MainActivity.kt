package ly.trojan_team.trojan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.Observer
import ly.trojan_team.trojan.databinding.ActivityMainBinding
import ly.trojan_team.trojan.loginpage.data.entity.UserEntity
import ly.trojan_team.trojan.loginpage.data.viewmodel.LoginViewModel
import ly.trojan_team.trojan.loginpage.recurce.Recurce

class MainActivity : AppCompatActivity() {
    val vmLogin: LoginViewModel by viewModels()
    private lateinit var txtUserName: EditText
    private lateinit var txtPassword: EditText
    private lateinit var btnLogin:Button
    private lateinit var binding : ActivityMainBinding
//    private lateinit var alairtDialog: AlertDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        initUI()

        txtPassword =findViewById(R.id.usernamtxt)
        txtUserName=findViewById(R.id.passwordtxt)
        btnLogin=findViewById(R.id.loginbtn)

        var observer =Observer<Recurce<UserEntity>>{
            when(it){
                is Recurce.Succusfuly<UserEntity>->{
                    val intent = Intent(applicationContext,ProfileActivity::class.java)
                    startActivity(intent)
                }
                is Recurce.Error<UserEntity>->{

                }
                else -> {
                }
            }
        }
        vmLogin.state.observe(this,observer)

        btnLogin.setOnClickListener {
            vmLogin.login(
                UserEntity(
                    username =txtPassword.text.toString() ,
                    password = txtUserName.text.toString()
                )
            )
        }

        binding.signupbtn.setOnClickListener{
            val intent = Intent(applicationContext,SignActivity::class.java)
            startActivity(intent)
        }
    }

}