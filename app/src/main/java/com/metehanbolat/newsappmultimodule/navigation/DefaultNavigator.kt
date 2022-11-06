package com.metehanbolat.newsappmultimodule.navigation

import com.metehanbolat.common_utils.Activities
import com.metehanbolat.common_utils.Navigator
import com.metehanbolat.news_presentation.GoToNewsActivity
import com.metehanbolat.search_presentation.GoToSearchActivity

class DefaultNavigator: Navigator.Provider {

    override fun getActivities(activities: Activities): Navigator {
        return when(activities) {
            Activities.NewsActivity -> { GoToNewsActivity }
            Activities.SearchActivity -> { GoToSearchActivity }
        }
    }
}