package me.s097t0r1.wetalk.glue.module.common

import me.s097t0r1.common.network.di.NetworkComponentHolder
import me.s097t0r1.common.network.di.NetworkDependencies
import me.s097t0r1.core.di.base.BaseFeatureDepenendencies
import me.s097t0r1.core.di.base.Provider
import me.s097t0r1.core.di.base.holder.BaseDependencyHolder
import me.s097t0r1.core.di.base.holder.BaseDependencyHolder0

internal fun glueNetworkModule() {

    NetworkComponentHolder.provider = Provider {

        class NetworkDependenciesHolder(
            override val block: (BaseDependencyHolder<NetworkDependencies>) -> NetworkDependencies
        ) : BaseDependencyHolder0<NetworkDependencies>()

        NetworkDependenciesHolder {
            object : NetworkDependencies {
                override val dependencyProvider: BaseDependencyHolder<out BaseFeatureDepenendencies> =
                    it
            }
        }.dependecies
    }
}