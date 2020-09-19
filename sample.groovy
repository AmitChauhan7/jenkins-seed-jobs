
pipelineJob("sample") {
    description('sample')
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url("https://github.com/amit7chauhan/jenkins-seed-jobs.git")
                                           }
                    branch("*/master")
                }
            }
            scriptPath("Jenkinsfile")
        }
    }
}