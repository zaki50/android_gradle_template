package com.uphyca.gradle.ext

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * ルートプロジェクトにext.propertiesが存在すれば読み込んで拡張プロパティにマップするプラグイン
 */
class ExtensionPropertiesPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {

        File propertiesFile = project.rootProject.file("ext.properties")
        if (propertiesFile.exists()) {
            Properties properties = new Properties()
            propertiesFile.withInputStream {
                properties.load(it)
            }
            properties.entrySet().each {
                project.ext.set(it.key, it.value)
            }
        }
    }
}