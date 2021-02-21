package com.yogacp.app.entrance.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yogacp.router.RouterNavigation

/**
 * Created by Yoga C. Pranata on 2/21/21.
 * Android Engineer
 */
class EntranceActivity : AppCompatActivity() {

    private val router = RouterNavigation()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        router.goToHomepage(this)
    }
}