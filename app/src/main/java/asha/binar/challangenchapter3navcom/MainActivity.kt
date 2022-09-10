package asha.binar.challangenchapter3navcom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import asha.binar.challangenchapter3navcom.view.MyData

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController

    val MyData = arrayListOf(
       MyData('A', arrayListOf("Asha", "Adil", "Awan", "Awam", "Abalone")),
       MyData('B', arrayListOf("Bayam", "Baju", "Batik", "Bubur", "Balon")),
       MyData('C', arrayListOf("Cantik", "Cerah", "Curug", "Cacing", "Cicak")),
       MyData('D', arrayListOf("Daun", "Dilan", "Dmasiv", "Durian", "Datang")),
       MyData('E', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
       MyData('F', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
       MyData('G', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
       MyData('H', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
       MyData('I', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
       MyData('J', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
       MyData('K', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
       MyData('L', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
       MyData('M', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
       MyData('N', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
       MyData('O', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
       MyData('P', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
       MyData('Q', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
       MyData('R', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
       MyData('S', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
       MyData('T', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
       MyData('U', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
       MyData('V', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
       MyData('W', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
       MyData('X', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
       MyData('Y', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
       MyData('Z', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.fragmentContainerView) as NavHostFragment

        navController = navHostFragment.navController
        setupActionBarWithNavController(navController)

    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }




}