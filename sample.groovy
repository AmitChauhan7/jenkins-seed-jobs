def PROJECT_NAME = 'roboshop'

folder(PROJECT_NAME) {
    displayName(PROJECT_NAME)
    description(PROJECT_NAME + 'Project folder')
}

folder('roboshop/CIJOBS') {
    displayName('CIJOBS')
    description('Roboshop Project CI JobS folder')
}



pipelineJob("roboshop/CIJOBS/sample") {
    description('roboshop')
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