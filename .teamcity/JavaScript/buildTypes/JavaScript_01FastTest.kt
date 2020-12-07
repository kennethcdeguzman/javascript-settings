package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object JavaScript_01FastTest : BuildType({
    uuid = "d21dd02d-d6ad-4517-9ac2-5041e8a92baa"
    extId = "JavaScript_01FastTest"
    name = "01. Fast Test"
    description = "My Js Project"

    vcs {
        root(JavaScript.vcsRoots.JavaScript_HttpsGithubComG0t4teamcityCourseCards)

    }

    steps {
        script {
            name = "npm install / phantoms"
            scriptContent = "npm install"
        }
    }
})
