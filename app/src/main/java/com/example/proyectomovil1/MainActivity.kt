package com.example.proyectomovil1

import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener{

    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)

        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar1)
        setSupportActionBar(toolbar)

        val navigationView = findViewById<NavigationView>(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)

        val toggle = ActionBarDrawerToggle( this, drawerLayout, toolbar, R.string.open_nav, R.string.close_nav)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        if (savedInstanceState == null)
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, InicioFragment()).commit()
        navigationView.setCheckedItem(R.id.nav_home)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_home -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, InicioFragment()).commit()

            R.id.nav_politica -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, PoliticaFragment()).commit()

            R.id.nav_deportes -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, DeportesFragment()).commit()

            R.id.nav_entrenimiento -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, EntretenimientoFragment()).commit()

            R.id.nav_internacional -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, InternacionalFragment()).commit()

            R.id.nav_salir -> finishAffinity()
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}