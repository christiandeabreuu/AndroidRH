package br.com.zup.rhcatalisa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import br.com.zup.rhcatalisa.databinding.ActivityMainBinding
import br.com.zup.rhcatalisa.databinding.FragmentCadastroBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        supportFragmentManager.findFragmentById(binding.navHostFragment.id) as NavHostFragment

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

//        val navHostFragment =
//            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
//        val navController : NavController = navHostFragment.navController
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}