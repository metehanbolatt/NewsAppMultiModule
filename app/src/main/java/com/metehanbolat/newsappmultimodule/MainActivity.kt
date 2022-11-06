package com.metehanbolat.newsappmultimodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.metehanbolat.common_utils.Activities
import com.metehanbolat.common_utils.Navigator
import com.metehanbolat.newsappmultimodule.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @Inject lateinit var provider: Navigator.Provider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        window.statusBarColor = ContextCompat.getColor(this, R.color.white)
        setContentView(view)

        provider.getActivities(Activities.NewsActivity).navigate(this)
    }
}