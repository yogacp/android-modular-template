package com.yogacp.router

import android.content.Context
import android.content.Intent
import com.yogacp.homepage.view.HomepageActivity

/**
 * Created by Yoga C. Pranata on 2/21/21.
 * Android Engineer
 */
class RouterNavigation {

    fun goToHomepage(context: Context) {
        val screen = Intent(context, HomepageActivity::class.java)
        screen.run { context.startActivity(this) }
    }

}