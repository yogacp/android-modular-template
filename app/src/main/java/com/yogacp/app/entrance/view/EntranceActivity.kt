package com.yogacp.app.entrance.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yogacp.homepage.view.HomepageActivity

/**
 * Created by Yoga C. Pranata on 2/21/21.
 * Android Engineer
 */
class EntranceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        navigateToHomepage()
    }

    private fun navigateToHomepage() {
        val homepage = Intent(this, HomepageActivity::class.java)
        startActivity(homepage)
    }
}