package me.s097t0r1.ktcast.feature.profile.api

import androidx.fragment.app.Fragment
import me.s097t0r1.core.navigation.screen.FragmentScreen

interface ProfileFeatureStarter {
    fun start(): FragmentScreen<Fragment>
}