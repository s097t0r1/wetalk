package me.s097t0r1.wetalk.plugins.module_configuration.config

import com.android.build.api.dsl.LibraryExtension
import me.s097t0r1.wetalk.plugins.module_configuration.ModuleConfigurationExtension
import org.gradle.api.Project

fun LibraryExtension.configureAndroidLibrary(
    project: Project,
    configuration: ModuleConfigurationExtension
) {

    if (configuration.isParcelizeEnable) project.plugins.apply("kotlin-parcelize")
}
